package com.gzbz.worldMgr;

import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.battle.BattleChapterMgr;
import com.gzbz.gamePlayer.pvp.KingOfCentralPlainsMgr;
import com.gzbz.gamePlayer.pvp.PvpSeasonMgr;
import com.gzbz.gift.GiftMgr;
import com.gzbz.megerWar.CoreWarMgr;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.HotSwapUtil;
import debug.Debug;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import misc.DateUtil;
import misc.RandomUtil;
import net.DirMemTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class ScheduledTask implements SchedulingConfigurer {
   private final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
   private final int CORE_THREAD = 2;
   private final int MAX_THREAD = 2;
   private long lastTime = System.currentTimeMillis();
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private PvpSeasonMgr pvpSeasonMgr;
   @Autowired
   private KingOfCentralPlainsMgr kingOfCentralPlainsMgr;
   @Autowired
   private BattleChapterMgr battleChapterMgr;
   @Autowired
   private Environment environment;
   @Value("${hotAgent.classpath}")
   private String hotSwapClassPath;
   @Value("${hotAgent.jarPath}")
   private String hotSwapJarPath;
   @Autowired
   private CoreWarMgr coreWarMgr;

   @Bean
   public TaskScheduler taskScheduler() {
      ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
      taskScheduler.setPoolSize(2);
      taskScheduler.setThreadNamePrefix("spring-job-");
      taskScheduler.setAwaitTerminationSeconds(60);
      taskScheduler.setWaitForTasksToCompleteOnShutdown(true);
      taskScheduler.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
      return taskScheduler;
   }

   @Bean
   public Executor taskExecutor() {
      ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
      executor.setCorePoolSize(2);
      executor.setMaxPoolSize(2);
      executor.setThreadNamePrefix("spring-job-async-");
      executor.initialize();
      return executor;
   }

   public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
      Integer serverTimeOffset = (Integer)this.environment.getProperty("serverTimeOffset", Integer.class);
      if (serverTimeOffset == null) {
         serverTimeOffset = 0;
      }

      int randomSecond;
      if (serverTimeOffset > 0) {
         serverTimeOffset = serverTimeOffset / 2;
         randomSecond = this.worldMgr.GAME_SERVER_ID % serverTimeOffset + RandomUtil.randInt(serverTimeOffset);
      } else {
         randomSecond = 0;
      }

      if (Debug.isDebug) {
         this.worldMgr.schedule(0L, 2000L, () -> {
            long curTime = System.currentTimeMillis();
            if (!DateUtil.isSameHour(this.lastTime)) {
               this.hourReset();
               this.lastTime = curTime;
            }
         });
      } else {
         scheduledTaskRegistrar.addCronTask(this::hourReset, randomSecond + " 0 0/1 * * ?");
      }

      scheduledTaskRegistrar.addCronTask(() -> {
         HotSwapUtil.hotUpdateCheck(this.worldMgr, this.hotSwapClassPath, this.hotSwapJarPath, false);
         this.clientVersionCheck();
      }, "*/20 * * * * ?");
      scheduledTaskRegistrar.addCronTask(this::pvpSeasonReset, "0 59 23 ? * *");
      scheduledTaskRegistrar.addCronTask(this::kingOfCPStart, "0 05 21 ? * *");
      int gcRandomSec = RandomUtil.randInt(60);
      int gcRandomMinute = RandomUtil.randInt(60);
      scheduledTaskRegistrar.addCronTask(this::systemGCTimer, gcRandomSec + " " + gcRandomMinute + " 04 ? * *");
      gcRandomSec = RandomUtil.randInt(60);
      gcRandomMinute = RandomUtil.randInt(31, 59);
      scheduledTaskRegistrar.addCronTask(this::systemGCTimer, gcRandomSec + " " + gcRandomMinute + " 22 ? * *");
      scheduledTaskRegistrar.addCronTask(this::minCheck, "0 1/10 * * * ?");
      scheduledTaskRegistrar.addCronTask(this::perMinCheck, "0 */1 * * * ?");

      for(CronTask cronTask : scheduledTaskRegistrar.getCronTaskList()) {
         this.logger.info("定时任务: {}", cronTask.getExpression());
      }

   }

   public static void main(String[] args) {
      int serverTimeOffset = 10;

      for(int i = 0; i < 100; ++i) {
         System.out.println(3 % (serverTimeOffset / 2) + RandomUtil.randInt(serverTimeOffset / 2));
      }

   }

   private void clientVersionCheck() {
      if (this.worldMgr.loadClientVersion()) {
         OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
         onLineMgr.pushTask(() -> {
            PlayerMsg.S2C_UpdatePlayerData_2003.Builder builder = PlayerMsg.S2C_UpdatePlayerData_2003.newBuilder();
            PlayerMsg.PropertyCell.Builder dataBuilder = PlayerMsg.PropertyCell.newBuilder();
            dataBuilder.setProperty(PlayerDefine.CLIENT_VERSION);
            dataBuilder.setValue(this.worldMgr.clientVersionContent);
            dataBuilder.setType(PlayerMsg.ValType.VALTYPE_STRING);
            builder.addDatas(dataBuilder);
            onLineMgr.onlineBroadcast(builder.build());
         });
      }

   }

   public void hourReset() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      worldMgrPushTaskPart.pushTaskEx("serverHourCheck", new Object[]{System.currentTimeMillis()});
      DirMemTool.printNettyMemory();
   }

   private void pvpSeasonReset() {
      this.pvpSeasonMgr.pushTask(() -> this.pvpSeasonMgr.seasonReset());
   }

   private void systemGCTimer() {
      this.logger.info("---------执行GC");
      GcMgr.doFullGc();
   }

   private void kingOfCPStart() {
      this.kingOfCentralPlainsMgr.pushTask(() -> this.kingOfCentralPlainsMgr.activityStart(false, false));
   }

   private void minCheck() {
      this.battleChapterMgr.pushTaskEx("doJob", new Object[0]);
   }

   private void perMinCheck() {
      this.coreWarMgr.pushTaskEx("doJob", new Object[0]);
      GiftMgr giftMgr = (GiftMgr)ApplicationContextProvider.getContext().getBean(GiftMgr.class);
      giftMgr.pushTask(giftMgr::checkGeneralWelfare);
   }
}
