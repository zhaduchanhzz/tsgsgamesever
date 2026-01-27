package com.gzbz.war.redcliff;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.RedCliffMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class ChibiMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(ChibiMgr.class);
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private GameModelPool gameModelPool;
   private ScheduledFuture future;
   private List<PlayerPublicDao> activeList = new ArrayList();
   private Set<PlayerPublicDao> allPlayer = new HashSet();
   private int signRound;
   private int delayNum;

   protected void init() throws Exception {
   }

   public void getPlayer() {
      this.allPlayer.clear();
      this.activeList.clear();
      this.delayNum = 0;
      this.signRound = 0;
      this.getPlayerPublicDao();
   }

   public void autoSend() {
      logger.info("获取到的活跃玩家数量：" + this.activeList.size());
      int lev = 78;
      SystemFunctionModel model = (SystemFunctionModel)this.gameModelPool.getEntity("systemFunction", 2010);
      if (!Objects.isNull(model)) {
         lev = model.getOpenLevel();
      }

      for(int i = 0; i < this.activeList.size(); ++i) {
         PlayerPublicDao playerDao = (PlayerPublicDao)this.activeList.get(i);
         RedCliffMsg.C2S_Info_4303.Builder builder = RedCliffMsg.C2S_Info_4303.newBuilder();
         builder.setServerId(playerDao.serverId);
         builder.setPlayerId(playerDao.playerId);
         builder.setPlayerName(playerDao.playerName);
         builder.setSex(playerDao.sex);
         builder.setLv(playerDao.lv);
         builder.setCombatPower(playerDao.combat_power);
         builder.setHeadId(playerDao.head);
         builder.setHeadFrame(playerDao.headFrame);
         builder.setPrestige(playerDao.prestige);
         builder.setMonarchId(playerDao.monarchId);
         builder.setUnionId(playerDao.unionId);
         builder.setUnionName("");
         builder.setVipLev(playerDao.vip_lv);
         if (playerDao.unionId > 0) {
            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
            if (!Objects.isNull(unionMgr)) {
               UnionDao unionDao = unionMgr.getUnion();
               builder.setUnionName(unionDao.unionName);
            }
         }

         this.crossNettyClient.sendCross(playerDao.serverId, playerDao.playerId, builder.build());
         this.allPlayer.add(playerDao);
      }

      int limitNum = this.configManager.getIntDefault("chibiMember", 50);
      if (this.activeList.size() < limitNum) {
         int extraNum = limitNum - this.activeList.size();
         List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, extraNum);

         for(int i = 0; i < rankDataList.size(); ++i) {
            int playerId = ((RankData)rankDataList.get(i)).value;
            if (!this.allPlayer.contains(playerId)) {
               GamePlayer player = this.worldMgr.getPlayerById(playerId);
               if (!Objects.isNull(player) && player.getPublicDao().lv >= lev) {
                  RedCliffMsg.C2S_Info_4303.Builder builder = RedCliffMsg.C2S_Info_4303.newBuilder();
                  PlayerPublicDao playerDao = player.getPublicDao();
                  builder.setServerId(playerDao.serverId);
                  builder.setPlayerId(playerDao.playerId);
                  builder.setPlayerName(playerDao.playerName);
                  builder.setSex(playerDao.sex);
                  builder.setLv(playerDao.lv);
                  builder.setCombatPower(playerDao.combat_power);
                  builder.setHeadId(playerDao.head);
                  builder.setHeadFrame(playerDao.headFrame);
                  builder.setPrestige(playerDao.prestige);
                  builder.setMonarchId(playerDao.monarchId);
                  builder.setUnionId(playerDao.unionId);
                  builder.setUnionName("");
                  builder.setVipLev(playerDao.vip_lv);
                  if (playerDao.unionId > 0) {
                     UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
                     UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
                     if (!Objects.isNull(unionMgr)) {
                        UnionDao unionDao = unionMgr.getUnion();
                        builder.setUnionName(unionDao.unionName);
                     }
                  }

                  this.crossNettyClient.sendCross(playerDao.serverId, playerDao.playerId, builder.build());
                  this.allPlayer.add(playerDao);
               }
            }
         }
      }

      logger.info("获取到的报名玩家总数量：" + this.allPlayer.size());
   }

   public void autoRun() {
      for(PlayerPublicDao playerPublicDao : this.allPlayer) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerPublicDao.playerId);
         if (!Objects.isNull(gamePlayer)) {
            this.autoSign(gamePlayer);
         }
      }

   }

   public void autoSign(GamePlayer player) {
      RedCliffMsg.C2S_SignUp_4330.Builder builder = RedCliffMsg.C2S_SignUp_4330.newBuilder();
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), builder.build());
      RedCliffMsg.S2S_PlayerArraying_4320.Builder arrayingBuilder = RedCliffMsg.S2S_PlayerArraying_4320.newBuilder();
      ArrayingMirror arrayingMirror = null;
      arrayingMirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_RED_CLIFF);
      if (arrayingMirror != null && arrayingMirror.arrayingElementsMap != null && !arrayingMirror.arrayingElementsMap.isEmpty()) {
         if (!this.checkHadHero(arrayingMirror)) {
            arrayingMirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }
      } else {
         arrayingMirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      }

      if (arrayingMirror != null && arrayingMirror.arrayingElementsMap != null && !arrayingMirror.arrayingElementsMap.isEmpty()) {
         if (!this.checkHadHero(arrayingMirror)) {
            logger.error("赤壁之战发送阵容给跨服的时候 阵容为空。");
         } else {
            byte[] bytes = arrayingMirror.toByteArray();
            if (bytes == null) {
               logger.error("赤壁之战自动报名 阵容为空!!!");
            } else {
               arrayingBuilder.setArraying(ByteString.copyFrom(bytes));
               this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), arrayingBuilder.build());
               RedCliffPart redCliffPart = (RedCliffPart)player.getMgrPart(RedCliffPart.class);
               redCliffPart.pushTaskEx("autoUpdate", new Object[0]);
               if (player.isLogin()) {
                  RedCliffMsg.C2S_RedPoint_4346.Builder redBuilder = RedCliffMsg.C2S_RedPoint_4346.newBuilder();
                  redCliffPart.C2S_RedPoint_4346(redBuilder.build(), "");
               }

            }
         }
      } else {
         logger.error("赤壁之战发送阵容给跨服的时候 阵容为空");
      }
   }

   public void getPlayerPublicDao() {
      int lev = 78;
      SystemFunctionModel model = (SystemFunctionModel)this.gameModelPool.getEntity("systemFunction", 2010);
      if (!Objects.isNull(model)) {
         lev = model.getOpenLevel();
      }

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

      long curTime = System.currentTimeMillis() - 604800000L;
      String querySql = "select " + sb.toString() + " from tb_player where playerId > 20000 AND lastLoginTime > " + curTime + " AND lv > " + lev + ";";

      try {
         this.worldMgr.getGameDBPool().query(querySql, (parsingResult) -> {
            while(true) {
               try {
                  if (!parsingResult.next()) {
                     return;
                  }

                  PlayerPublicDao publicDao = new PlayerPublicDao();

                  for(Field field : fields) {
                     Object obj = parsingResult.getObject(field.getName(), field.getType());
                     field.set(publicDao, obj);
                  }

                  this.activeList.add(publicDao);
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }
         }, new Object[0]);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

   }

   public boolean checkHadHero(ArrayingMirror arrayingMirror) {
      boolean flag = false;

      for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
         if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
            flag = true;
            break;
         }
      }

      return flag;
   }

   @MsgHandlerAnno
   public void S2S_NotifySendPlayer_4361(RedCliffMsg.S2S_NotifySendPlayer_4361 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getType() == 1) {
         this.getPlayer();
      } else if (msg.getType() == 2) {
         this.delaySign();
      } else {
         this.getPlayer();
         this.autoSend();
         this.autoRun();
      }

   }

   public void delaySign() {
      logger.info("活跃玩家总人数：" + this.activeList.size());
      Boolean limitFlag = this.checkLimitRank();
      if (!limitFlag) {
         this.autoSend();
         this.autoRun();
      } else {
         this.delayNum = this.activeList.size() / 4;
         this.signRound = 0;
         int time = 600000;
         this.future = this.scheduleEx(0L, (long)time, "doJob", new Object[0]);
      }
   }

   @TaskMethod
   public void doJob() {
      ++this.signRound;
      this.allPlayer.clear();
      int flag = 0;
      Iterator<PlayerPublicDao> it = this.activeList.iterator();

      while(it.hasNext() && flag < this.delayNum) {
         ++flag;
         PlayerPublicDao publicDao = (PlayerPublicDao)it.next();
         this.notifyCross(publicDao);
         it.remove();
      }

      logger.info("第几轮： " + this.signRound + "---开始自动报名:" + this.allPlayer.size());

      for(PlayerPublicDao playerPublicDao : this.allPlayer) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerPublicDao.playerId);
         if (!Objects.isNull(gamePlayer)) {
            this.autoSign(gamePlayer);
         }
      }

      if ((this.activeList.isEmpty() || this.signRound >= 5) && this.future != null) {
         this.future.cancel(false);
         this.future = null;
      }

   }

   public void notifyCross(PlayerPublicDao playerDao) {
      RedCliffMsg.C2S_Info_4303.Builder builder = RedCliffMsg.C2S_Info_4303.newBuilder();
      builder.setServerId(playerDao.serverId);
      builder.setPlayerId(playerDao.playerId);
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLv(playerDao.lv);
      builder.setCombatPower(playerDao.combat_power);
      builder.setHeadId(playerDao.head);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setPrestige(playerDao.prestige);
      builder.setMonarchId(playerDao.monarchId);
      builder.setUnionId(playerDao.unionId);
      builder.setUnionName("");
      builder.setVipLev(playerDao.vip_lv);
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (!Objects.isNull(unionMgr)) {
            UnionDao unionDao = unionMgr.getUnion();
            builder.setUnionName(unionDao.unionName);
         }
      }

      this.crossNettyClient.sendCross(playerDao.serverId, playerDao.playerId, builder.build());
      this.allPlayer.add(playerDao);
   }

   public boolean checkLimitRank() {
      int limitNum = this.configManager.getIntDefault("chibiMember", 50);
      return this.activeList.size() >= limitNum;
   }
}
