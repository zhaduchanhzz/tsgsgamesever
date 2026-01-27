package com.gzbz.demonStrikes;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.DemonStrikesRankRewardModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossDemonStrikesMsg;
import com.gzbz.protobuf.DemonStrikesMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class DemonStrikesMgr extends GameMgr {
   private final CrossNettyClient crossNettyClient;
   private final OnLineMgr onLineMgr;
   private final WorldMgr worldMgr;
   private DemonStrikesMsg.SystemState state;
   private int startTime;
   private int endTime;
   private int mapId;
   private int rewardTime;

   public DemonStrikesMgr(CrossNettyClient crossNettyClient, OnLineMgr onLineMgr, WorldMgr worldMgr) {
      this.state = DemonStrikesMsg.SystemState.END;
      this.crossNettyClient = crossNettyClient;
      this.onLineMgr = onLineMgr;
      this.worldMgr = worldMgr;
   }

   protected void init() throws Exception {
   }

   @TaskMethod
   public void demonStrikesCrossConnect() {
      CrossDemonStrikesMsg.S2CR_DemonStrikes_14101.Builder msg = CrossDemonStrikesMsg.S2CR_DemonStrikes_14101.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   @TaskMethod
   public void demonStrikesCrossDisConnect() {
      this.state = DemonStrikesMsg.SystemState.END;
      this.startTime = 0;
      this.endTime = 0;
      this.mapId = 0;
      this.rewardTime = 0;
      int openDay = ApplicationContextProvider.getConfigInt("demonWarEnableOpenDays", 0);
      if (DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) >= openDay) {
         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            gamePlayer.pushPartTaskEx(DemonStrikesPart.class, "sendDemonStrikesInfo", new Object[0]);
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_DemonStrikes_14102(CrossDemonStrikesMsg.CR2S_DemonStrikes_14102 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.state = msg.getState();
      this.startTime = msg.getStartTime();
      this.endTime = msg.getEndTime();
      this.mapId = msg.getMapId();
      this.rewardTime = msg.getRewardTime();
      int openDay = ApplicationContextProvider.getConfigInt("demonWarEnableOpenDays", 0);
      if (DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) >= openDay) {
         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            gamePlayer.pushPartTaskEx(DemonStrikesPart.class, "sendDemonStrikesInfo", new Object[0]);
            if (DemonStrikesPart.IN_MAIN_PLAYERS.contains(gamePlayer.getPlayerId())) {
               gamePlayer.pushPartTaskEx(DemonStrikesPart.class, "reqDemonStrikesMap", new Object[0]);
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_LuckyReward_14119(CrossDemonStrikesMsg.CR2S_LuckyReward_14119 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DemonStrikesMsg.S2C_LuckyRewardNotify_13938.Builder notifyMsg = DemonStrikesMsg.S2C_LuckyRewardNotify_13938.newBuilder();
      notifyMsg.addAllRecord(msg.getRecordList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @MsgHandlerAnno
   public void CR2S_CityChangeNotify_14120(CrossDemonStrikesMsg.CR2S_CityChangeNotify_14120 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int openDay = ApplicationContextProvider.getConfigInt("demonWarEnableOpenDays", 0);
      if (DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) >= openDay) {
         if (msg.getMsg().hasLog() && msg.getMsg().getLog().getType() != DemonStrikesMsg.LogType.PLAYER_MOVE) {
            DemonStrikesMsg.LogInfo logInfo = msg.getMsg().getLog();
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(logInfo.getPlayerId());
            if (gamePlayer != null) {
               gamePlayer.pushPartTaskEx(DemonStrikesPart.class, "demonStrikesAddMyLog", new Object[]{logInfo});
            }
         }

         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.getMsg()});
      }
   }

   @MsgHandlerAnno
   public void CR2S_HasRewardNotify_14123(CrossDemonStrikesMsg.CR2S_HasRewardNotify_14123 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.rewardTime = msg.getRewardTime();
      int openDay = ApplicationContextProvider.getConfigInt("demonWarEnableOpenDays", 0);
      if (DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) >= openDay) {
         DemonStrikesMsg.S2C_RewardNotify_13940 notifyMsg = DemonStrikesMsg.S2C_RewardNotify_13940.newBuilder().setCityReward(true).build();

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            gamePlayer.pushPartTaskEx(DemonStrikesPart.class, "sendCityRewardMsg", new Object[]{notifyMsg});
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_RankReward_14127(CrossDemonStrikesMsg.CR2S_RankReward_14127 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【天魔来袭】收到跨服排行结算通知");

      for(CrossDemonStrikesMsg.RankSettleData rankSettleData : msg.getRankDataList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankSettleData.getPlayerId());
         if (gamePlayer != null && !gamePlayer.isRobot()) {
            this.rankReward(gamePlayer, msg.getServerRank(), 1);

            for(CommonMsg.MapDataII rankTypeData : rankSettleData.getRankTypeDataList()) {
               int rankType = rankTypeData.getKey();
               int rank = rankTypeData.getValue();
               this.rankReward(gamePlayer, rank, rankType);
            }
         }
      }

   }

   private void rankReward(GamePlayer gamePlayer, int rank, int rankType) {
      Map<Integer, TreeMap<Integer, DemonStrikesRankRewardModel>> rewardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, DemonStrikesRankRewardModel>>getModelPoolMap("customDemonWarRankReward");
      TreeMap<Integer, DemonStrikesRankRewardModel> rankTypeRewardModelMap = (TreeMap)rewardModelMap.get(rankType);
      if (rankTypeRewardModelMap != null && !rankTypeRewardModelMap.isEmpty() && rank > 0) {
         DemonStrikesRankRewardModel rankRewardModel = (DemonStrikesRankRewardModel)rankTypeRewardModelMap.get(rank);
         if (rankRewardModel == null) {
            rankRewardModel = (DemonStrikesRankRewardModel)rankTypeRewardModelMap.lastEntry().getValue();
         }

         String contentFormat = MessageFormat.format(rankRewardModel.getDesc(), rank);
         gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, rankRewardModel.getTitle(), contentFormat, rankRewardModel.getRankReward(), 604800000L, 69, 6912});
         gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "天魔来袭", rankRewardModel.getTitle() + "-" + rankRewardModel.getId(), rankRewardModel.getTitle() + "-" + rankRewardModel.getId(), 0, 0, 0);
      }
   }

   public void reqMapInfo(GamePlayer player) {
      CrossDemonStrikesMsg.S2CR_MapInfo_14103.Builder msg = CrossDemonStrikesMsg.S2CR_MapInfo_14103.newBuilder();
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqCityHold(GamePlayer player, int cityId, CommonMsg.PageInfo pageParam) {
      CrossDemonStrikesMsg.S2CR_CityHoldInfo_14104.Builder msg = CrossDemonStrikesMsg.S2CR_CityHoldInfo_14104.newBuilder();
      msg.setCityId(cityId);
      msg.setPageParam(pageParam);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqMoveCity(GamePlayer player, int cityId, int moveNum) {
      CrossDemonStrikesMsg.S2CR_MoveCity_14106.Builder msg = CrossDemonStrikesMsg.S2CR_MoveCity_14106.newBuilder();
      msg.setCityId(cityId);
      msg.setMoveNum(moveNum);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqTransferList(GamePlayer player, CommonMsg.PageInfo pageInfo) {
      CrossDemonStrikesMsg.S2CR_TransferList_14108.Builder msg = CrossDemonStrikesMsg.S2CR_TransferList_14108.newBuilder();
      msg.setPower(player.getPlayerCombatPower());
      msg.setPageInfo(pageInfo);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqTransfer(GamePlayer player, int playerId, int city, int atkNum, int moveNum) {
      CrossDemonStrikesMsg.S2CR_Transfer_14109.Builder msg = CrossDemonStrikesMsg.S2CR_Transfer_14109.newBuilder();
      msg.setCityId(city);
      msg.setPlayerId(playerId);
      msg.setMoveNum(moveNum);
      msg.setAtkNum(atkNum);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqRank(GamePlayer player, DemonStrikesMsg.C2S_Rank_13919 params) {
      CrossDemonStrikesMsg.S2CR_Rank_14111.Builder msg = CrossDemonStrikesMsg.S2CR_Rank_14111.newBuilder();
      msg.setParams(params);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqLog(GamePlayer player) {
      CrossDemonStrikesMsg.S2CR_Logs_14112.Builder msg = CrossDemonStrikesMsg.S2CR_Logs_14112.newBuilder();
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqCityReward(GamePlayer player) {
      CrossDemonStrikesMsg.S2CR_CityReward_14113.Builder msg = CrossDemonStrikesMsg.S2CR_CityReward_14113.newBuilder();
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqAttackNpc(GamePlayer player, int cityId, int uid) {
      CrossDemonStrikesMsg.S2CR_AttackNpc_14115.Builder msg = CrossDemonStrikesMsg.S2CR_AttackNpc_14115.newBuilder();
      msg.setCityId(cityId);
      msg.setUid(uid);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqLuckMain(GamePlayer player) {
      CrossDemonStrikesMsg.S2CR_LuckyMain_14117.Builder msg = CrossDemonStrikesMsg.S2CR_LuckyMain_14117.newBuilder();
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqLuckReward(GamePlayer player, List<String> recordList) {
      CrossDemonStrikesMsg.S2CR_LuckyReward_14118.Builder msg = CrossDemonStrikesMsg.S2CR_LuckyReward_14118.newBuilder();
      msg.addAllRecord(recordList);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqUploadPlayer(GamePlayer player, ArrayingMirror arrayingMirror) {
      CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.Builder msg = CrossDemonStrikesMsg.S2CR_UploadPlayerData_14121.newBuilder();
      msg.setArraying(ByteString.copyFrom(arrayingMirror.toByteArray()));
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void reqBuyRandomShop(GamePlayer player, int buyId, int buyNum) {
      CrossDemonStrikesMsg.S2CR_BuyRandomItem_14126.Builder msg = CrossDemonStrikesMsg.S2CR_BuyRandomItem_14126.newBuilder();
      msg.setBuyId(buyId);
      msg.setBuyNum(buyNum);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void crossGm(GamePlayer player, String cmd, List<Long> params) {
      CrossDemonStrikesMsg.S2CR_GM_14125.Builder msg = CrossDemonStrikesMsg.S2CR_GM_14125.newBuilder();
      msg.setCmd(cmd);
      if (params != null) {
         msg.addAllParams(params);
      }

      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public DemonStrikesMsg.SystemState getState() {
      return this.state;
   }

   public int getStartTime() {
      return this.startTime;
   }

   public int getEndTime() {
      return this.endTime;
   }

   public int getMapId() {
      return this.mapId;
   }

   public int getRewardTime() {
      return this.rewardTime;
   }
}
