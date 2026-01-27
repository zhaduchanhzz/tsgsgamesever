package com.gzbz.worldMgr;

import allMgr.MgrParent;
import allMgr.PartAnnotation;
import allMgr.PartParent;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gamePlayer.GamePlayer;
import debug.Debug;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = WorldMgr.class
)
public class WorldMgrPart extends PartParent {
   private WorldMgr worldMgr;
   private ScheduledFuture future;
   private ScheduledFuture slowFuture;
   private LinkedList<Integer> activityPlayerList = new LinkedList();
   private AtomicInteger preLoadTimes = new AtomicInteger();
   static Logger logger = LoggerFactory.getLogger(WorldMgrPart.class);
   private LinkedList<Integer> preLoadLoginData = new LinkedList();

   public void init(MgrParent mgr) {
      this._mgr = mgr;
      this.worldMgr = (WorldMgr)this._mgr;
   }

   public void preLoadPlayerName() {
      String queryPlayerName = "select playerName from tb_player;";

      try {
         this.worldMgr.getGameDBPool().query(queryPlayerName, (parsingResult) -> {
            while(true) {
               try {
                  if (!parsingResult.next()) {
                     return;
                  }

                  String playerName = parsingResult.getString("playerName");
                  if (!StringUtils.isEmpty(playerName)) {
                     this.worldMgr.getPlayerName().add(playerName);
                  }
               } catch (SQLException e) {
                  e.printStackTrace();
               }
            }
         }, new Object[0]);
         Debug.sleep(1L);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

   }

   public void preLoadActivityPlayer() {
      long curTime = System.currentTimeMillis() - 7200000L;
      String queryPlayerName = "select playerId from tb_player where lastLoginTime > ?;";

      try {
         this.worldMgr.getGameDBPool().query(queryPlayerName, (parsingResult) -> {
            while(true) {
               try {
                  if (!parsingResult.next()) {
                     return;
                  }

                  this.activityPlayerList.add(parsingResult.getInt("playerId"));
               } catch (SQLException e) {
                  e.printStackTrace();
               }
            }
         }, new Object[]{curTime});
         Debug.sleep(1L);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

   }

   public void autoOpenPort() {
      if (Debug.isDebug) {
         logger.info("-------------DEBUG状态下,直接对外监听端口");
         this.worldMgr.openServer();
      }

   }

   public void proLoadPlayerReset() {
   }

   public void preLoadPlayerDBData() {
      if (this.activityPlayerList.size() > 0) {
         this.preLoadTimes.set(this.activityPlayerList.size());
         int totalNum = this.preLoadTimes.get();
         logger.info("需要预加载玩家个数:{}", totalNum);
         long period = (long)(600000 / this.activityPlayerList.size());
         if (period < 1000L) {
            period = 1000L;
         } else if (period > 2000L) {
            period = 2000L;
         }

         this.future = this.worldMgr.schedule(10L, period, () -> {
            if (!Objects.isNull(this.future) && this.activityPlayerList.size() != 0) {
               int playerId = (Integer)this.activityPlayerList.pop();
               GamePlayer player = this.worldMgr.getPlayerById(playerId);
               player.pushTask(() -> {
                  logger.info("开始预加载玩家:{}", playerId);
                  player.getCustomCache("tb_player_reset", playerId);
                  player.getCustomCache("tb_task", playerId);
                  player.getMap("tb_hero_bag", playerId);
                  Map<Integer, HeroDao> heroMap = player.<Integer, HeroDao>getMap("tb_hero_bag", playerId);

                  for(HeroDao heroDao : heroMap.values()) {
                     heroDao.flushTotalProperties();
                  }

                  player.getData("tb_bag", playerId);
                  this.preLoadLoginData.add(playerId);
                  logger.info("预加载玩家:{},剩余预加载玩家数{}/{}", new Object[]{playerId, this.preLoadTimes.get(), totalNum});
                  if (this.preLoadTimes.decrementAndGet() == 0) {
                     logger.info("-------------预加载玩家结束");
                     this.future.cancel(false);
                     if (totalNum > 30) {
                        GcMgr.doFullGc();
                     }
                  }

               });
            }
         });
      } else {
         logger.info("-------------预加载玩家结束");
      }

   }

   public int getLeftPreNum() {
      return this.preLoadTimes.get();
   }

   public boolean prePlayerPublicDao() {
      Field[] fields = PlayerPublicDao.class.getDeclaredFields();
      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < fields.length; ++i) {
         Field field = fields[i];
         if (i != fields.length - 1) {
            sb.append(field.getName() + ", ");
         } else {
            sb.append(field.getName() + " ");
         }
      }

      String querySql = "select " + sb.toString() + " from tb_player where playerId > 20000;";
      AtomicBoolean atomicBoolean = new AtomicBoolean(true);

      try {
         boolean isSuc = this.worldMgr.getGameDBPool().query(querySql, (parsingResult) -> {
            while(true) {
               try {
                  if (parsingResult.next()) {
                     PlayerPublicDao publicDao = new PlayerPublicDao();

                     for(Field field : fields) {
                        Object obj = parsingResult.getObject(field.getName(), field.getType());
                        field.set(publicDao, obj);
                     }

                     GamePlayer player = this.worldMgr.getPlayerById(publicDao.playerId);
                     if (player == null) {
                        logger.error("玩家id:{},无法找到账号信息", publicDao.playerId);
                        continue;
                     }

                     player.setPublicDao(publicDao);
                     continue;
                  }
               } catch (Exception e) {
                  e.printStackTrace();
                  atomicBoolean.set(false);
               }

               return;
            }
         }, new Object[0]);
         atomicBoolean.set(isSuc);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
         atomicBoolean.set(false);
      }

      return atomicBoolean.get();
   }

   public void preLoadHeroSupportData() {
      this.worldMgr.getGameCachePool().getAllTableByMap("tb_hero_support");
   }
}
