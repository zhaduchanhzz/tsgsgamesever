package com.gzbz.gamePlayer.Ladder;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.LadderPvpDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.LadderRecordData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.PrestigeTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.LadderMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.CalculateUtil;
import misc.DateUtil;
import misc.MapUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LadderPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(LadderPart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   public static final String LADDER_BUY_COST = "athleticsBuyCost";
   public static final String LADDER_VICTORY_REWARD = "athleticsVictoryReward";
   public static final String LADDER_FAILURE_REWARD = "athleticsFailureReward";
   public static final String LADDER_LIKE_REWARD = "athleticsRankLikeReward";
   public static final String LADDER_RANK_LIMIT = "athleticsEligibility";
   public static final String LADDER_LIKE_NUM = "athleticsRankLikeNum";
   public boolean gmStatus = false;

   @MsgHandlerAnno
   public void C2S_LadderInit_4101(LadderMsg.C2S_LadderInit_4101 msg, String source) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      LadderMsg.C2S_LadderInit_4101.Builder builder = msg.toBuilder();
      builder.setServerId(playerDao.serverId);
      builder.setPlayerId(this.player.getPlayerId());
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLv(playerDao.lv);
      builder.setCombatPower(this.player.getPlayerCombatPower());
      builder.setHeadId(playerDao.head);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setPrestige(playerDao.prestige);
      builder.setMonarchId(playerDao.monarchId);
      builder.setUnionId(playerDao.unionId);
      builder.setUnionName("");
      PlayerDao dao = this.player.getPlayerDao();
      builder.setLadderPoint(dao.ladder_pvp_integral);
      builder.setVipLev(playerDao.vip_lv);
      builder.setSecondTitle(playerDao.secondTitle);
      LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      builder.setLadderLike(ladderDao.ladderLikeNum);
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
         builder.setUnionName(unionDao.unionName);
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LadderRefresh_4103(LadderMsg.C2S_LadderRefresh_4103 msg, String source) {
      int rankLimit = ApplicationContextProvider.getConfigInt("athleticsEligibility", 100);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      int pvpRank = rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
      if (pvpRank != 0 && pvpRank <= rankLimit) {
         LadderMsg.C2S_LadderRefresh_4103.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      } else {
         this.player.failure(36001);
      }
   }

   @MsgHandlerAnno
   public void C2S_LadderFight_4105(LadderMsg.C2S_LadderFight_4105 msg, String source) {
      int rankLimit = ApplicationContextProvider.getConfigInt("athleticsEligibility", 100);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      int pvpRank = rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
      if (pvpRank != 0 && pvpRank <= rankLimit) {
         LadderMsg.C2S_LadderFight_4105.Builder builder = msg.toBuilder();
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_LADDER);
         if (arrayingMirror == null) {
            this.player.failure(36008);
         } else {
            byte[] bytes = arrayingMirror.toByteArray();
            builder.setArraying(ByteString.copyFrom(bytes));
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "天梯排位", "1");
         }
      } else {
         this.player.failure(36001);
      }
   }

   @MsgHandlerAnno
   public void C2S_LadderWatchArray_4111(LadderMsg.C2S_LadderWatchArray_4111 msg, String source) {
      if (msg.getEnemyServerId() != 0 && msg.getEnemyId() != 0) {
         LadderMsg.S2S_LadderWatchArray_4112.Builder builder = LadderMsg.S2S_LadderWatchArray_4112.newBuilder();
         builder.setEnemyId(msg.getEnemyId());
         builder.setRank(msg.getRank());
         builder.setEnemyServerId(msg.getEnemyServerId());
         builder.setPlayerId(this.player.getPlayerId());
         builder.setServerId(this.player.getServerId());
         this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), msg.getEnemyServerId(), msg.getEnemyId(), builder.build());
      } else {
         LadderMsg.C2S_LadderWatchArray_4111.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_LadderAllFight_4109(LadderMsg.C2S_LadderAllFight_4109 msg, String source) {
      int rankLimit = ApplicationContextProvider.getConfigInt("athleticsEligibility", 100);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      int pvpRank = rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
      if (pvpRank != 0 && pvpRank <= rankLimit) {
         LadderMsg.C2S_LadderAllFight_4109.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "天梯排位", "10");
      } else {
         this.player.failure(36001);
      }
   }

   @MsgHandlerAnno
   public void C2S_LadderBuyFightTimes_4114(LadderMsg.C2S_LadderBuyFightTimes_4114 msg, String source) {
      int rankLimit = ApplicationContextProvider.getConfigInt("athleticsEligibility", 100);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      int pvpRank = rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
      if (pvpRank != 0 && pvpRank <= rankLimit) {
         int cost = ApplicationContextProvider.getConfigInt("athleticsBuyCost", 50);
         if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
            this.player.failure(36002);
         } else {
            LadderMsg.C2S_LadderBuyFightTimes_4114.Builder builder = msg.toBuilder();
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      } else {
         this.player.failure(36001);
      }
   }

   @MsgHandlerAnno
   public void C2S_LadderRankInfo_4116(LadderMsg.C2S_LadderRankInfo_4116 msg, String source) {
      LadderMsg.C2S_LadderRankInfo_4116.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LadderPlayerInfo_4234(LadderMsg.C2S_LadderPlayerInfo_4234 msg, String source) {
      LadderMsg.C2S_LadderPlayerInfo_4234.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LadderRecordInfo_4118(LadderMsg.C2S_LadderRecordInfo_4118 msg, String source) {
      if (msg.getRecordType() == 1) {
         LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
         List<LadderRecordData> list = new ArrayList();
         list.addAll(ladderDao.record);
         LadderMsg.S2C_LadderRecordInfo_4119.Builder down = LadderMsg.S2C_LadderRecordInfo_4119.newBuilder();
         down.setRecordType(1);

         for(int i = 0; i < list.size(); ++i) {
            LadderRecordData data = (LadderRecordData)list.get(list.size() - i - 1);
            LadderMsg.RecordInfo.Builder info = LadderMsg.RecordInfo.newBuilder();
            info.setRecordId(data.recordId);
            info.setFightTimes(data.time);
            info.setLeftPlayerId(data.leftPlayerId);
            info.setLeftServerId(data.leftServerId);
            info.setLeftHead(data.leftHead);
            info.setLeftName(data.leftPlayerName);
            info.setLeftLev(data.leftLev);
            info.setLeftRank(data.leftRank);
            info.setRightPlayerId(data.rightPlayerId);
            info.setRightServerId(data.rightServerId);
            info.setRightHead(data.rightHead);
            info.setRightName(data.rightPlayerName);
            info.setRightLev(data.rightLev);
            info.setRightRank(data.rightRank);
            info.setWinSide(data.winSide);
            info.setRankChange(data.rankChange);
            if (data.leftPlayerId == this.player.getPlayerId()) {
               info.setMySide(0);
            } else if (data.rightPlayerId == this.player.getPlayerId()) {
               info.setMySide(1);
            } else {
               info.setMySide(-1);
            }

            down.addInfo(info);
         }

         this.player.sendMsg(down.build());
      } else {
         LadderMsg.C2S_LadderRecordInfo_4118.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_LadderLikeKing_4122(LadderMsg.C2S_LadderLikeKing_4122 msg, String source) {
      if (msg.getRank() > 0 && msg.getRank() <= 3) {
         LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
         int likeNum = ApplicationContextProvider.getConfigInt("athleticsRankLikeNum", 3);
         if (ladderDao.likePlayers.size() >= likeNum) {
            this.player.failure(36003);
         } else if (ladderDao.likePlayers.contains(msg.getRank())) {
            this.player.failure(36004);
         } else {
            ladderDao.likePlayers.add(msg.getRank());
            ladderDao.updateOp();
            LadderMsg.C2S_LadderLikeKing_4122.Builder builder = msg.toBuilder();
            builder.setLikeNum(likeNum - ladderDao.likePlayers.size());
            builder.addAllMyLike(ladderDao.likePlayers);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            String reward = ApplicationContextProvider.getConfigString("athleticsRankLikeReward", "");
            if (!reward.equals("")) {
               String[] resourceArr = reward.split("\\|");
               ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]));
               this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 36, 3603, 0, 0, "");
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               MapUtil.mapPlusInt(playerExtend.likePlayer, 2000, 1);
               this.player.updatePlayerExtend(13);
               this.sendPlayerLike();
               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(2011, (List)null);
            }
         }
      }
   }

   public void loginHandle() {
      this.sendPlayerLike();
   }

   public void sendPlayerLike() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      LadderMsg.S2C_NotifyPlayerLike_4237.Builder notifyBuilder = LadderMsg.S2C_NotifyPlayerLike_4237.newBuilder();

      for(Map.Entry<Integer, Integer> entry : playerExtend.likePlayer.entrySet()) {
         CommonMsg.MapDataII.Builder mapBuilder = CommonMsg.MapDataII.newBuilder();
         mapBuilder.setKey((Integer)entry.getKey());
         mapBuilder.setValue((Integer)entry.getValue());
         notifyBuilder.addInfo(mapBuilder);
      }

      this.player.sendMsg(notifyBuilder.build());
   }

   @MsgHandlerAnno
   public void S2S_LadderLike_4233(LadderMsg.S2S_LadderLike_4233 msg, CrossSubscribeMsg crossSubscribeMsg) {
      LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      ++ladderDao.ladderLikeNum;
      ladderDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_LadderKingInfo_4120(LadderMsg.C2S_LadderKingInfo_4120 msg, String source) {
      LadderMsg.C2S_LadderKingInfo_4120.Builder builder = msg.toBuilder();
      LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      int likeNum = ApplicationContextProvider.getConfigInt("athleticsRankLikeNum", 3);
      int leftNum = Math.max(likeNum - ladderDao.likePlayers.size(), 0);
      builder.setLikeNum(leftNum);
      builder.addAllMyLike(ladderDao.likePlayers);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void resetDaily() {
      LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      ladderDao.likePlayers.clear();
      if (DateUtil.todayOfWeek() == 7) {
         BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
         if (!ladderDao.record.isEmpty()) {
            List<Integer> delList = new ArrayList();

            for(LadderRecordData ladderRecordData : ladderDao.record) {
               delList.add(ladderRecordData.recordId);
            }

            if (delList.size() > 0) {
               battleRecordMgr.pushTaskEx("delRecord", new Object[]{delList});
            }
         }

         ladderDao.record.clear();
      }

      ladderDao.updateOp();
   }

   @MsgHandlerAnno
   public void S2S_LadderWatchArray_4112(LadderMsg.S2S_LadderWatchArray_4112 msg, CrossSubscribeMsg crossSubscribeMsg) {
      LadderMsg.S2C_LadderWatchArray_4113.Builder builder = LadderMsg.S2C_LadderWatchArray_4113.newBuilder();
      builder.setPlayerId(this.player.getPlayerId());
      ArrayingMirror playerArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_LADDER);

      for(Map.Entry<Byte, ArrayingEntity> entry : playerArraying.arrayingElementsMap.entrySet()) {
         if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
            builder.addHero((CommonMsg.HeroInfo)((ArrayingEntity)entry.getValue()).toBuilder());
         }
      }

      this.crossNettyClient.send2Client(msg.getServerId(), msg.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_LadderFight_4107(LadderMsg.S2S_LadderFight_4107 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int otherPlayerId = msg.getPlayerId();
      String roleName = msg.getPlayerName();
      ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(msg.getArraying().toByteArray());
      BattlePKTeam battlePKTeam1 = new BattlePKTeam(otherPlayerId, roleName, arrayingMirror, msg.getLv(), msg.getHead(), msg.getHeadFrame(), this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
      PlayerDao playerDao = this.player.getPlayerDao();
      ArrayingMirror playerArraying = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_LADDER);
      BattlePKTeam battlePKTeam2 = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, playerArraying, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(playerArraying, this.player.isRobot()));
      BattleScene battleScene = new BattleScene(2000, 1);
      battleScene.addPKTeam((byte)0, battlePKTeam1);
      battleScene.addPKTeam((byte)1, battlePKTeam2);
      BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight((byte)20);
      LadderMsg.S2S_LadderFightResult_4108.Builder builder = LadderMsg.S2S_LadderFightResult_4108.newBuilder();
      builder.setResult(fight);
      builder.setEnemyId(this.player.getPlayerId());
      builder.setPlayerId(msg.getPlayerId());
      builder.setGroup(msg.getGroup());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_LadderFightResult_4108(LadderMsg.S2S_LadderFightResult_4108 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattleMsg.S2C_BattleResult_6102.Builder fight = msg.getResult().toBuilder();
      boolean isWin = false;
      if (fight.getResult().getResult() == 0) {
         isWin = true;
      }

      if (msg.getIsAttack()) {
         List<ResourceModel> list = this.sendAward(isWin, 1, 2);
         int playerId = msg.getPlayerId();
         GamePlayer player = this.worldMgr.getPlayerById(playerId);
         BattleMsg.S2C_Battle_Result.Builder result = fight.getResult().toBuilder();

         for(ResourceModel rewardItem : list) {
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setId(rewardItem.getId()).setType(rewardItem.getType()).setNum(rewardItem.getValue()));
         }

         BattleMsg.S2C_Battle_PKTeam.Builder myTeam = fight.getTeams(0).toBuilder();
         myTeam.setPvpScoreChange(msg.getRankChange());
         fight.setTeams(0, (BattleMsg.S2C_Battle_PKTeam.Builder)myTeam);
         BattleMsg.S2C_Battle_PKTeam.Builder otherTeam = fight.getTeams(1).toBuilder();
         otherTeam.setPvpScoreChange(msg.getRankChange() * -1);
         fight.setTeams(1, (BattleMsg.S2C_Battle_PKTeam.Builder)otherTeam);
         fight.setResult(result);
         player.sendMsg(fight.build());
         this.saveRecord(fight, isWin, msg);
         PlayerDao playerDao = player.getPlayerDao();
         LadderMsg.S2C_LadderFight_4106.Builder down = LadderMsg.S2C_LadderFight_4106.newBuilder();
         down.setLadderPoint(playerDao.ladder_pvp_integral);
         this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), down.build());
         long rightPower = fight.getTeams(1).getCombatPower();
         long myMaxPower = this.player.getMaxPlayerCombatPower();
         if (myMaxPower < rightPower) {
            this.player.triggerTask(614, CalculateUtil.calPercent(rightPower - myMaxPower, myMaxPower), 1L, 3);
         }
      } else {
         if (isWin) {
            isWin = false;
         } else {
            isWin = true;
         }

         this.saveRecord(fight, isWin, msg);
      }

   }

   public void saveRecord(BattleMsg.S2C_BattleResult_6102.Builder fight, boolean isWin, LadderMsg.S2S_LadderFightResult_4108 msg) {
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      battleRecordMgr.pushTaskEx("saveLadder", new Object[]{fight, isWin, msg, this.player});
   }

   @TaskMethod
   public void _saveLadderRecord(BattleMsg.S2C_BattleResult_6102.Builder fight, LadderMsg.S2S_LadderFightResult_4108 msg, int recordId, int createTime) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      LadderRecordData data = new LadderRecordData();
      data.recordId = recordId;
      data.time = createTime;
      if (msg.getIsAttack()) {
         data.leftHead = playerDao.head;
         data.leftLev = playerDao.lv;
         data.leftPlayerId = playerDao.playerId;
         data.leftPlayerName = playerDao.playerName;
         data.leftServerId = playerDao.serverId;
         data.leftRank = msg.getOldLeftRank();
         data.rightHead = msg.getOtherHead();
         data.rightLev = msg.getOtherLev();
         data.rightPlayerId = msg.getEnemyId();
         data.rightPlayerName = msg.getOtherName();
         data.rightServerId = msg.getOtherServerId();
         data.rightRank = msg.getOldRightRank();
      } else {
         data.rightHead = playerDao.head;
         data.rightLev = playerDao.lv;
         data.rightPlayerId = playerDao.playerId;
         data.rightPlayerName = playerDao.playerName;
         data.rightServerId = playerDao.serverId;
         data.rightRank = msg.getOldRightRank();
         data.leftHead = msg.getOtherHead();
         data.leftLev = msg.getOtherLev();
         data.leftPlayerId = msg.getPlayerId();
         data.leftPlayerName = msg.getOtherName();
         data.leftServerId = msg.getOtherServerId();
         data.leftRank = msg.getOldLeftRank();
      }

      if (fight.getResult().getResult() == 0) {
         data.winSide = 0;
      } else {
         data.winSide = 1;
      }

      data.rankChange = msg.getRankChange();
      LadderPvpDao ladderPvpDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      List<LadderRecordData> delList = ladderPvpDao.addRecord(data);
      if (delList.size() > 0) {
         List<Integer> del = new ArrayList();

         for(LadderRecordData ladderRecordData : delList) {
            del.add(ladderRecordData.recordId);
         }

         BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
         battleRecordMgr.pushTaskEx("delRecord", new Object[]{del});
      }

   }

   @MsgHandlerAnno
   public void S2C_LadderAllFight_4110(LadderMsg.S2C_LadderAllFight_4110 msg, String source) {
      int useTimes = msg.getUseTimes();
      if (useTimes <= 0) {
         this.player.failure(36005);
      } else {
         this.sendAward(true, useTimes, 1);
         LadderMsg.S2C_LadderAllFight_4110.Builder builder = msg.toBuilder();
         PlayerDao playerDao = this.player.getPlayerDao();
         builder.setFightTimes(0);
         builder.setLadderPoint(playerDao.ladder_pvp_integral);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void S2C_LadderBuyFightTimes_4115(LadderMsg.S2C_LadderBuyFightTimes_4115 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int cost = ApplicationContextProvider.getConfigInt("athleticsBuyCost", 50);
      this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 36, 3602, PlayerDefine.PLAYER_GOLD, cost, "");
      LadderMsg.S2C_LadderBuyFightTimes_4115.Builder builder = msg.toBuilder();
      this.player.sendMsg(builder.build());
      this.player.triggerTask(603, 0, 1L, 1);
   }

   public List<ResourceModel> sendAward(boolean win, int times, int sendType) {
      List<ResourceModel> list = new ArrayList();
      if (win) {
         String[] rewardArr = ApplicationContextProvider.getConfigString("athleticsVictoryReward", "").split(",");

         for(String rewardStr : rewardArr) {
            String[] resourceArr = rewardStr.split("\\|");
            ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), times * Integer.parseInt(resourceArr[2]));
            list.add(resourceModel);
         }

         this.player.triggerTask(303, 0, (long)times, 1);
      } else {
         String[] rewardArr = ApplicationContextProvider.getConfigString("athleticsFailureReward", "").split(",");

         for(String rewardStr : rewardArr) {
            String[] resourceArr = rewardStr.split("\\|");
            ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), times * Integer.parseInt(resourceArr[2]));
            list.add(resourceModel);
         }
      }

      if (sendType == 1) {
         this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 36, 3601, 0, 0, "");
      } else {
         this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 36, 3601, 0, 0, "");
      }

      for(int i = 0; i < times; ++i) {
         this.player.triggerTask(514, 0, 1L, 1);
      }

      return list;
   }

   @MsgHandlerAnno
   public void S2S_LadderRankAward_4124(LadderMsg.S2S_LadderRankAward_4124 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rank = msg.getRank();
      CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_LADDER_RANK_AWARD, (long)rank);
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, 36, 3604);
      this.player.triggerTask(304, 0, (long)rank, -1);
      this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "天梯争霸", "排行奖励-" + rank, "排行奖励-" + rank, 0, 0, 1);
      if (rank == 1) {
         int realNum = 1;
         WorldDao<HashMap<Integer, Integer>> worldDao = this.worldMgr.<HashMap<Integer, Integer>>getWorldDao(GameDefine.WorldModule.WORLD_LADDER_CHAMPION);
         if (((HashMap)worldDao.jsonData).containsKey(this.player.getPlayerId())) {
            int num = (Integer)((HashMap)worldDao.jsonData).get(this.player.getPlayerId());
            int targetNum = Integer.MAX_VALUE;
            Map<Integer, PrestigeTaskModel> modelMap = this.player.getGameModelPool().getMap("prestigetask");

            for(PrestigeTaskModel model : modelMap.values()) {
               if (!model.getTarget().isEmpty() && ((TaskTargetItem)model.getTarget().get(0)).getTargetType() == 617) {
                  targetNum = ((TaskTargetItem)model.getTarget().get(0)).getTargetId();
                  break;
               }
            }

            if (num + 1 >= targetNum) {
               this.player.triggerTask(617, targetNum, 1L, 0);
               realNum = 1;
            } else {
               realNum = num + 1;
            }
         }

         ((HashMap)worldDao.jsonData).clear();
         ((HashMap)worldDao.jsonData).put(this.player.getPlayerId(), realNum);
         worldDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void S2S_SendCompensateAward_4236(LadderMsg.S2S_SendCompensateAward_4236 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      int rank = msg.getRank();
      CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_LADDER_RANK_AWARD, (long)rank);
      int logReason = 3605;
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, 36, logReason);
   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel awardModel : rewardMap.values()) {
         if ((long)awardModel.getMinRank() <= rank && (long)awardModel.getMaxRank() >= rank) {
            rewardModel = awardModel;
            break;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   public boolean isOpen() {
      if (this.gmStatus) {
         return true;
      } else {
         return DateUtil.todayOfWeek() == 7 || DateUtil.todayOfWeek() == 1;
      }
   }

   public void gmOpenLadder(int status) {
      if (status == 1) {
         this.gmStatus = true;
      } else if (status == 2) {
         this.gmStatus = false;
      } else {
         this.resetDaily();
         this.resetWeek();
      }

      LadderMsg.S2S_LadderGMOpen_4125.Builder builder = LadderMsg.S2S_LadderGMOpen_4125.newBuilder();
      builder.setStatus(status);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LadderBattleEnd_4126(LadderMsg.C2S_LadderBattleEnd_4126 msg, String source) {
      LadderMsg.C2S_LadderBattleEnd_4126.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LadderWatchBattle_4128(LadderMsg.C2S_WatchBattle_4128 msg, String source) {
      LadderMsg.C2S_WatchBattle_4128.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_LadderOp_4230(LadderMsg.S2S_LadderOp_4230 msg, CrossSubscribeMsg crossSubscribeMsg) {
      LadderMsg.S2S_LadderOp_4230.Builder builder = msg.toBuilder();
      this.sendHorse(builder.getOp(), builder.getOpValue());
   }

   public void sendHorse(int type, int opValue) {
      PlayerDao playerDao = this.player.getPlayerDao();
      String format = "";
      if (type == 1) {
         LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "LadderHegemony");
         format = MessageFormat.format(languageModel.getValue(), this.player.getServerId(), playerDao.playerName, opValue);
      } else if (type == 2) {
         LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "LadderFirst");
         format = MessageFormat.format(languageModel.getValue(), this.player.getServerId(), playerDao.playerName);
      }

      ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
      chatMgr.pushTaskEx("sendBattleTemple", new Object[]{this.player, format});
   }

   @MsgHandlerAnno
   public void C2S_RedPoint_4231(LadderMsg.C2S_RedPoint_4231 msg, String source) {
      LadderMsg.C2S_RedPoint_4231.Builder builder = msg.toBuilder();
      LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      builder.addAllMyLike(ladderDao.likePlayers);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      LadderPvpDao ladderDao = (LadderPvpDao)this.player.getData("tb_ladder_pvp", this.player.getPlayerId());
      int likeNum = ApplicationContextProvider.getConfigInt("athleticsRankLikeNum", 3);
      if (ladderDao.likePlayers.size() > 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         String reward = ApplicationContextProvider.getConfigString("athleticsRankLikeReward", "");
         if (!reward.equals("")) {
            List<ResourceModel> rewardList = new ArrayList();

            for(int rank = 1; rank <= likeNum; ++rank) {
               ladderDao.likePlayers.add(rank);
               ladderDao.updateOp();
               LadderMsg.C2S_LadderLikeKing_4122.Builder builder = LadderMsg.C2S_LadderLikeKing_4122.newBuilder();
               builder.setRank(rank);
               builder.setLikeNum(likeNum - ladderDao.likePlayers.size());
               builder.addAllMyLike(ladderDao.likePlayers);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }

            String[] resourceArr = reward.split("\\|");
            ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]) * likeNum);
            rewardList.add(resourceModel);
            this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 36, 3603, 0, 0, "管家");
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            MapUtil.mapPlusInt(playerExtend.likePlayer, 2000, likeNum);
            this.player.updatePlayerExtend(13);
            this.sendPlayerLike();
            guanJiaPart.checkState(systemId, rewardList);
         }
      }
   }
}
