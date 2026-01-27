package com.gzbz.worldMgr;

import HttpClient.HttpClient;
import allMgr.MgrParent;
import allMgr.PartAnnotation;
import allMgr.PartParent;
import allMgr.TaskMethod;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.spring.ApplicationRunnerImpl;
import ip.AddressUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import misc.JsonUtil;
import misc.RandomUtil;
import modulePublic.GameServerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = WorldMgr.class
)
public class CenterServerPart extends PartParent {
   static Logger logger = LoggerFactory.getLogger(CenterServerPart.class);
   private ScheduledFuture sf;
   private WorldMgr worldMgr;
   private Iterator<Map.Entry<Integer, GamePlayer>> playerIt;
   private long calcTotalPower;
   private long calcAlivePlayerNum;
   private long calcAlive72PlayerNum;
   private long curAvgPower;
   private long curAlivePlayerNum;
   private long curAlive72PlayerNum;
   @Value("${PlatformName}")
   public String PlatformName;
   @Value("${ServerId}")
   public int ServerId;
   @Value("${center.url}")
   public String CENTER_URL;
   @Autowired
   private CrossNettyClient crossNettyClient;

   public void init(MgrParent mgrParent) {
      this._mgr = mgrParent;
      this.worldMgr = (WorldMgr)mgrParent;
      if (ApplicationRunnerImpl.mgrName != null && ApplicationRunnerImpl.mgrMethod != null) {
         this._testCenterServer();
      }

   }

   private void _testCenterServer() {
      String result = HttpClient.sendGet(this.CENTER_URL + "/mgr/test", String.format("platform=%s&serverType=%d&serverId=%d", this.PlatformName, 1, this.ServerId));
      if (StringUtils.isEmpty(result)) {
         logger.error("游戏服无法连接到中心服，服务器无法启动");
         Runtime.getRuntime().exit(0);
         SpringApplication.exit(ApplicationContextProvider.getContext(), new ExitCodeGenerator[0]);
      } else {
         logger.info("游戏服可以连接中心服");
      }

   }

   public void startUpdateCenterInfo() {
      this.updateCenterInfo((byte)1);
      this.scheduleEx((long)RandomUtil.randInt(300000, 600000), 600000L, "updateCenterInfo", new Object[]{0});
   }

   @TaskMethod
   public void loginCrossServer(int group) {
      CrossMsg.S2CR_Login_4203.Builder builder = CrossMsg.S2CR_Login_4203.newBuilder();
      builder.setServerId(this.worldMgr.GAME_SERVER_ID);
      builder.addAllSlaveServerId(this.worldMgr.getServersSet());
      builder.setGroupId(group);
      builder.setPlatformId(this.worldMgr.PLATFORM_ID);
      builder.setWorldLv(this.worldMgr.getWorldLv());
      builder.setOpenTime(this.worldMgr.getOpenServerTime());
      builder.setCurAlivePlayerNum(this.curAlivePlayerNum);
      builder.setCurAvgPower(this.curAvgPower);
      this.crossNettyClient.sendCrossNoDest(builder.build(), this.worldMgr.GAME_SERVER_ID);
   }

   @TaskMethod
   public void updateCenterInfo(byte first) {
      GameServerDao gameServerDao = new GameServerDao();
      if (this.playerIt == null || !this.playerIt.hasNext()) {
         this.playerIt = this.worldMgr.getPlayerMap().entrySet().iterator();
      }

      int indexTimes = 0;
      long curTimes = System.currentTimeMillis();

      while(this.playerIt.hasNext()) {
         ++indexTimes;
         if (indexTimes > 1500) {
            break;
         }

         Map.Entry<Integer, GamePlayer> entry = (Map.Entry)this.playerIt.next();
         if (!((GamePlayer)entry.getValue()).isRobot()) {
            long logoutTime = ((GamePlayer)entry.getValue()).getPublicDao().logoutTime;
            if (logoutTime != 0L) {
               if (curTimes - logoutTime > 259200000L) {
                  continue;
               }

               ++this.calcAlive72PlayerNum;
               if (curTimes - logoutTime > 86400000L) {
                  continue;
               }
            } else {
               ++this.calcAlive72PlayerNum;
            }

            this.calcTotalPower += ((GamePlayer)entry.getValue()).getPublicDao().combat_power;
            ++this.calcAlivePlayerNum;
         }
      }

      if (!this.playerIt.hasNext() || this.curAlivePlayerNum == 0L && this.curAvgPower == 0L) {
         if (this.calcAlivePlayerNum == 0L) {
            this.curAvgPower = 0L;
         } else {
            this.curAvgPower = this.calcTotalPower / this.calcAlivePlayerNum;
         }

         this.curAlivePlayerNum = this.calcAlivePlayerNum;
         this.curAlive72PlayerNum = this.calcAlive72PlayerNum;
         this.calcTotalPower = 0L;
         this.calcAlivePlayerNum = 0L;
         this.calcAlive72PlayerNum = 0L;
         this.worldMgr.recordAlivePlayer(this.curAlivePlayerNum);
      }

      Environment environment = ApplicationContextProvider.getContext().getEnvironment();
      String serverNettyIp = environment.getProperty("NettyIp");
      String serverIp;
      if (StringUtils.isEmpty(serverNettyIp)) {
         serverIp = AddressUtils.getLocalIp();
      } else {
         serverIp = serverNettyIp;
      }

      gameServerDao.serverId = this.worldMgr.GAME_SERVER_ID;
      gameServerDao.serverName = this.worldMgr.GAME_SERVER_NAME;
      gameServerDao.platformId = this.worldMgr.PLATFORM_ID;
      gameServerDao.platformName = this.worldMgr.PLATFORM_NAME;
      gameServerDao.port = this.worldMgr.httpPort;
      gameServerDao.serverIp = serverIp;
      gameServerDao.slaveIds.addAll(this.worldMgr.getServersSet());
      gameServerDao.WorldLv = this.worldMgr.getWorldLv();
      gameServerDao.openTime = DateUtil.transferLongToDate(this.worldMgr.getOpenServerTime(), "yyyy-MM-dd HH:mm:ss");
      gameServerDao.curAlivePlayerNum = this.curAlivePlayerNum;
      gameServerDao.curAvgPower = this.curAvgPower;
      gameServerDao.curAlive72PlayerNum = this.curAlive72PlayerNum;
      String data = JsonUtil.beanToJson(gameServerDao);
      String url = this.CENTER_URL + "/mgr/gameServerInfo?first=" + first;
      String result = HttpClient.sendPost(url, data);
      if (!"success".equals(result)) {
         logger.error("无法更新中心服的战力信息!!!!!!!");
      }

   }

   public long getCurAlivePlayerNum() {
      return this.curAlivePlayerNum;
   }
}
