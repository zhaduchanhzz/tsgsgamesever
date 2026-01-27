package com.gzbz.mine;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.db.MinePersonDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.bean.PlayerResetData;
import com.gzbz.db.worldBean.MineRecordData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossMineMsg;
import com.gzbz.protobuf.MineMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.MapUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class MineMgr extends GameMgr {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final OnLineMgr onLineMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   @Autowired
   private ConfigManager configManager;
   private int state = 0;
   public boolean connectCrossMgr = false;

   public MineMgr(OnLineMgr onLineMgr) {
      this.onLineMgr = onLineMgr;
   }

   protected void init() throws Exception {
   }

   public void uploadCrossPlayer(GamePlayer player) {
      if (player != null) {
         this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), player.toUploadCrossPlayerBuilder().build());
      }
   }

   @TaskMethod
   public void atkMineVein(GamePlayer player, ArrayingMirror arrayingMirror, List<Integer> params, HeroMirror heroMirror, int heroPos, int revengeId, int curEnergy, int higestMineType, int atkWithEmployNum) {
      CrossMineMsg.S2CR_ATK_12321.Builder builder = CrossMineMsg.S2CR_ATK_12321.newBuilder();
      builder.setAtkType((Integer)params.get(0));
      builder.setLine((Integer)params.get(1));
      builder.setHillId((Integer)params.get(2));
      builder.setMineVeinId((Integer)params.get(3));
      builder.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
      if (heroMirror != null) {
         builder.setHeroMirror(ByteString.copyFrom(heroMirror.toByteArray()));
      }

      builder.setHeroPos(heroPos);
      builder.setRevengeId(revengeId);
      builder.setCurEnergy(curEnergy);
      builder.setHigestMineType(higestMineType);
      builder.setAtkWithEmployNum(atkWithEmployNum);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_UpdateHillInfo_12330(CrossMineMsg.CR2S_UpdateHillInfo_12330 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MineMsg.S2C_UpdateHillInfo_12230.Builder builder = MineMsg.S2C_UpdateHillInfo_12230.newBuilder();
      builder.addAllInfo(msg.getInfoList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_UpdateMineInfo_12306(CrossMineMsg.CR2S_UpdateMineInfo_12306 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MineMsg.S2C_UpdateMineInfo_12206.Builder builder = MineMsg.S2C_UpdateMineInfo_12206.newBuilder();
      builder.addAllVeinInfo(msg.getMineVeinInfoList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_NotifyState_12344(CrossMineMsg.CR2S_NotifyState_12344 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("MineMgr - 更新矿场争夺活动状态 state:{}", msg.getState());
      boolean isChange = this.state != msg.getState();
      this.state = msg.getState();
      if (this.state == 2) {
         this.clearAllMineVein();
      }

      if (isChange) {
         MineMsg.S2C_NotifyState_12244.Builder builder = MineMsg.S2C_NotifyState_12244.newBuilder();
         builder.setState(this.state);
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      }

   }

   @MsgHandlerAnno
   public void CR2S_RankReward_12348(CrossMineMsg.CR2S_RankReward_12348 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int type = msg.getType();
      this.logger.info("MineMgr - 发送排行奖励 type:{}", type);
      List<String> rankInfoList = new ArrayList(msg.getRankInfoList());
      switch (type) {
         case 1:
            this.sendPersonRankReward(rankInfoList);
            break;
         case 2:
            this.sendUnionRankReward(rankInfoList);
      }

   }

   @MsgHandlerAnno
   public void CR2S_ChangInfo_12358(CrossMineMsg.CR2S_ChangInfo_12358 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MineMsg.S2C_ChangInfo_12258.Builder builder = MineMsg.S2C_ChangInfo_12258.newBuilder();
      builder.addAllChangeInfo(msg.getChangeInfoList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_MineAcrossDay_12360(CrossMineMsg.CR2S_MineAcrossDay_12360 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("MineMgr - 矿场跨天数据已更新，通知在矿场中的玩家");
      MineMsg.S2C_MineAcrossDay_12260.Builder builder = MineMsg.S2C_MineAcrossDay_12260.newBuilder();
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   private void sendPersonRankReward(List<String> rankInfoList) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> mineRankMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_MINE);
      Collection<CentreAwardModel> centreAwardModels = mineRankMap.values();
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);

      for(CentreAwardModel centreAwardModel : centreAwardModels) {
         Map<Integer, String> offlinePlayerRewardMap = new HashMap();
         Iterator<String> iterator = rankInfoList.iterator();

         while(iterator.hasNext()) {
            String[] strArr = ((String)iterator.next()).split("_");
            if (centreAwardModel.getMinRank() <= Integer.parseInt(strArr[0]) && centreAwardModel.getMaxRank() >= Integer.parseInt(strArr[0])) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(Integer.parseInt(strArr[1]));
               if (gamePlayer != null) {
                  if (gamePlayer.isLogin()) {
                     MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                     String format = MessageFormat.format(centreAwardModel.getDesc(), strArr[0]);
                     mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 55, 5504});
                  } else {
                     offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), strArr[0]);
                  }

                  this.logger.info("玩家 {} 获得了第 {} 名", gamePlayer.getPlayerId(), strArr[0]);
                  logOperationMgr.addReceiveAwardNewLog(gamePlayer, 17, 0, "矿场争夺", "排名奖励" + centreAwardModel.getId(), "排名奖励" + centreAwardModel.getId(), 0, 0, 1);
                  iterator.remove();
               }
            }
         }

         if (!offlinePlayerRewardMap.isEmpty()) {
            this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 55, 5504, 0);
         }
      }

   }

   private void sendUnionRankReward(List<String> rankInfoList) {
      this.logger.info("矿场 - 发送军团开采排名奖励 size:{}", rankInfoList.size());

      for(String str : rankInfoList) {
         this.logger.info("矿场 - 军团开采数据 {}", str);
      }

      int mineSettlementTime = this.configManager.getIntDefault("MineSettlementTime", 21);
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> mineRankMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_MINE_UNION);
      Collection<CentreAwardModel> centreAwardModels = mineRankMap.values();
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);

      for(CentreAwardModel centreAwardModel : centreAwardModels) {
         Map<Integer, String> offlinePlayerRewardMap = new HashMap();
         Iterator<String> iterator = rankInfoList.iterator();

         while(iterator.hasNext()) {
            String[] strArr = ((String)iterator.next()).split("_");
            if (centreAwardModel.getMinRank() <= Integer.parseInt(strArr[0]) && centreAwardModel.getMaxRank() >= Integer.parseInt(strArr[0])) {
               UnionMgr unionMgr = unionMgrParent.getUnionMgr(Integer.parseInt(strArr[1]));
               if (unionMgr == null) {
                  this.logger.info("============找不到军团管理器 unionId:{}", Integer.parseInt(strArr[1]));
               } else {
                  Map<Integer, UnionMemberDao> unionMembers = unionMgr.getUnionMembers();

                  for(Integer playerId : unionMembers.keySet()) {
                     this.logger.info("unionId:{} - 军团成员 plyaerId:{}", Integer.parseInt(strArr[1]), playerId);
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                     if (gamePlayer == null) {
                        this.logger.info("找不到该玩家 playerId:{}", playerId);
                     } else {
                        PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)gamePlayer.getCustomCache("tb_player_reset", playerId);
                        PlayerResetData resetData = playerResetCustomCache.getForever(522);
                        if (resetData != null && resetData.updateTime + 604800000L + 3600000L * (long)(24 - mineSettlementTime) >= System.currentTimeMillis()) {
                           if (gamePlayer.isLogin()) {
                              MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                              String format = MessageFormat.format(centreAwardModel.getDesc(), strArr[0]);
                              mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 55, 5504});
                           } else {
                              offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), strArr[0]);
                           }

                           this.logger.info("军团 {} 玩家 {} 获得了军团开采第 {} 名", new Object[]{Integer.parseInt(strArr[1]), playerId, strArr[0]});
                           logOperationMgr.addReceiveAwardNewLog(gamePlayer, 17, 0, "矿场争夺", "军团奖励" + centreAwardModel.getId(), "军团奖励" + centreAwardModel.getId(), 0, 0, 1);
                        } else {
                           this.logger.info("该军团成员本周没有获得矿洞 playerId:{}", playerId);
                        }
                     }
                  }

                  iterator.remove();
               }
            }
         }

         if (!offlinePlayerRewardMap.isEmpty()) {
            this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 55, 5504, 0);
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_AddLine_12352(CrossMineMsg.CR2S_AddLine_12352 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("MineMgr - 增加一条线路");
      MineMsg.S2C_AddLine_12252.Builder builder = MineMsg.S2C_AddLine_12252.newBuilder();
      builder.setTotalLine(msg.getTotalLine());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   public int getState() {
      return this.state;
   }

   private void clearAllMineVein() {
      this.gameCachePool.deleteAll("tb_mine_person");
   }

   public List<Integer> getMineRecord(int serverId, int type) {
      WorldDao<MineRecordData> worldDao = this.worldMgr.<MineRecordData>getWorldDao(GameDefine.WorldModule.WORLD_MINE_RECORD);
      List<Integer> playerIds = new ArrayList();
      if (((MineRecordData)worldDao.jsonData).recordMap.containsKey(serverId)) {
         Map<Integer, List<Integer>> integerSetMap = (Map)((MineRecordData)worldDao.jsonData).recordMap.get(serverId);
         if (integerSetMap.containsKey(type)) {
            return (List)integerSetMap.get(type);
         }
      }

      return playerIds;
   }

   @TaskMethod
   public void updateMineRecord(int serverId, int type, int playerId) {
      WorldDao<MineRecordData> worldDao = this.worldMgr.<MineRecordData>getWorldDao(GameDefine.WorldModule.WORLD_MINE_RECORD);
      Map<Integer, List<Integer>> recordMap = (Map)MapUtil.computeIfAbsent(((MineRecordData)worldDao.jsonData).recordMap, serverId, new HashMap());
      List<Integer> playerIds = (List)MapUtil.computeIfAbsent(recordMap, type, new ArrayList());
      int limitCount = this.configManager.getIntDefault("mineRecordLimit", 30);
      if (playerIds.size() <= limitCount) {
         playerIds.add(playerId);
         worldDao.updateOp();
      }
   }

   @MsgHandlerAnno
   public void CR2S_MergeMine_12382(CrossMineMsg.CR2S_MergeMine_12382 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(int playerId : msg.getPlayerIdList()) {
         if (playerId != 0) {
            MinePersonDao minePersonDao = (MinePersonDao)this.getGameCachePool().getData("tb_mine_person", new Object[]{playerId});
            this.getGameCachePool().deleteDao(minePersonDao, false);
         }
      }

   }
}
