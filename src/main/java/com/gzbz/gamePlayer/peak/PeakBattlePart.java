package com.gzbz.gamePlayer.peak;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PeakBattleTotalDao;
import com.gzbz.db.PeakExtraDao;
import com.gzbz.db.PeakPvpDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.Ladder.LadderPart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.peak.bean.PeakBattleTotalData;
import com.gzbz.gamePlayer.peak.bean.PeakPersonalData;
import com.gzbz.gamePlayer.peak.bean.PeakRecordData;
import com.gzbz.gamePlayer.peak.bean.PlayerDetailData;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.PeakednessStepModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PeakBattleMsg;
import com.gzbz.protobuf.PeakExtraMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.robot.RobotData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
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
public class PeakBattlePart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(PeakBattlePart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private BattleRecordMgr battleRecordMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   PeakRedPacketMgr peakRedPacketMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;

   @MsgHandlerAnno
   public void C2S_PeakRedPoint_4460(PeakBattleMsg.C2S_PeakRedPoint_4460 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakBattleMsg.S2C_PeakRedPoint_4461.Builder builder = PeakBattleMsg.S2C_PeakRedPoint_4461.newBuilder();
      builder.setFightNum(false);
      builder.setLadderNum(false);
      builder.setReceiveAward(false);
      builder.setPeakLike(false);
      builder.setLadderOpen(false);
      builder.setFinalOpen(false);
      if (peakDao.peakLike.size() < 3) {
         builder.setPeakLike(true);
      }

      int freeTimes = this.configManager.getIntDefault("peakednessFreeTimes", 3);
      if (peakDao.commonFightTimes < peakDao.commonBuyFightTimes + freeTimes) {
         if (DateUtil.cHour() >= 23 && DateUtil.cMinute() >= 30) {
            builder.setFightNum(false);
         } else {
            builder.setFightNum(true);
         }
      }

      int peakTimes = this.configManager.getIntDefault("peakednessRushFreeTimes", 5);
      if (peakDao.peakFightTimes < peakDao.peakBuyFightTimes + peakTimes) {
         int limitStep = this.configManager.getIntDefault("peakednessStepCondition", 10);
         if (playerDao.peak_lv >= limitStep) {
            if (DateUtil.cHour() >= 23 && DateUtil.cMinute() >= 30) {
               builder.setLadderNum(false);
            } else {
               builder.setLadderNum(true);
            }
         }
      }

      if (peakDao.stepAward < peakDao.maxStep && playerDao.peak_lv != 1) {
         builder.setReceiveAward(true);
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PeakInit_4401(PeakBattleMsg.C2S_PeakInit_4401 msg, String source) {
      if (this.player.isSystemOpen(2040)) {
         PlayerPublicDao playerDao = this.player.getPublicDao();
         PeakBattleMsg.C2S_PeakInit_4401.Builder builder = msg.toBuilder();
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
         builder.setVipLev(playerDao.vip_lv);
         if (playerDao.unionId > 0) {
            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
            builder.setUnionName(unionDao.unionName);
         }

         PlayerDao dao = this.player.getPlayerDao();
         builder.setStepId(dao.peak_lv);
         builder.setProvince(this.player.getIpProvince());
         builder.setCity(this.player.getIpCity());
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         builder.setCommonBuyFightTimes(peakPvpDao.commonBuyFightTimes);
         builder.setCommonFightTimes(peakPvpDao.commonFightTimes);
         builder.setPeakPoint(peakPvpDao.peakPoint);
         builder.setExp(peakPvpDao.exp);
         builder.setBufferExp(peakPvpDao.bufferExp);
         builder.addAllRiseInfo(peakPvpDao.riseInfo);
         if (peakPvpDao.maxStep == 0) {
            peakPvpDao.maxStep = 1;
            peakPvpDao.updateOp();
         }

         builder.setMaxStep(peakPvpDao.maxStep);
         builder.setStepAward(peakPvpDao.stepAward);
         builder.setChip(dao.topMatch);
         builder.setSecondTitle(dao.secondTitle);
         builder.setLikeNum(peakPvpDao.likeNum);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         this.sendArrayingToCross(1);
         this.sendArrayingToCross(2);
      }
   }

   @MsgHandlerAnno
   public void C2S_CommonLegend_4403(PeakBattleMsg.C2S_CommonLegend_4403 msg, String source) {
      PeakBattleMsg.C2S_CommonLegend_4403.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyMilitary_4405(PeakBattleMsg.C2S_MyMilitary_4405 msg, String source) {
      int season = msg.getSeason();
      PeakPersonalData data = null;
      PeakExtraDao peakDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
      if (season == -1) {
         data = peakDao.totalData;
      } else if (peakDao.personalMap.containsKey(season)) {
         data = (PeakPersonalData)peakDao.personalMap.get(season);
      }

      this.player.sendMsg(this.packMyMilitary(data, season).build());
   }

   @MsgHandlerAnno
   public void C2S_RoundAndState_4458(PeakBattleMsg.C2S_RoundAndState_4458 msg, String source) {
      PeakBattleMsg.C2S_RoundAndState_4458.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RecordInfo_4407(PeakBattleMsg.C2S_RecordInfo_4407 msg, String source) {
      PeakExtraDao peakPvpDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
      if (msg.getRecordType() == 1) {
         List<PeakRecordData> list = new ArrayList();
         list.addAll(peakPvpDao.commonRecord);
         PeakBattleMsg.S2C_RecordInfo_4408.Builder down = PeakBattleMsg.S2C_RecordInfo_4408.newBuilder();
         down.setRecordType(msg.getRecordType());

         for(int i = 0; i < list.size(); ++i) {
            PeakRecordData data = (PeakRecordData)list.get(list.size() - i - 1);
            PeakBattleMsg.RecordInfo.Builder info = PeakBattleMsg.RecordInfo.newBuilder();
            info.setRecordId(data.recordId);
            info.setRecordTime(data.time);
            info.setIsLeftWin(data.isWin);
            info.setRightData(this.packPlayerDetail(data.enemy));
            info.setLeftData(this.player.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE));
            info.setLeftRank(data.leftRank);
            info.setRightRank(data.rightRank);
            down.addInfo(info);
         }

         this.player.sendMsg(down.build());
      } else if (msg.getRecordType() == 2) {
         PeakBattleMsg.C2S_RecordInfo_4407.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      } else if (msg.getRecordType() == 3) {
         List<PeakRecordData> list = new ArrayList();
         list.addAll(peakPvpDao.peakRecord);
         PeakBattleMsg.S2C_RecordInfo_4408.Builder down = PeakBattleMsg.S2C_RecordInfo_4408.newBuilder();
         down.setRecordType(msg.getRecordType());

         for(int i = 0; i < list.size(); ++i) {
            PeakRecordData data = (PeakRecordData)list.get(list.size() - i - 1);
            PeakBattleMsg.RecordInfo.Builder info = PeakBattleMsg.RecordInfo.newBuilder();
            info.setRecordId(data.recordId);
            info.setRecordTime(data.time);
            info.setIsLeftWin(data.isWin);
            if (data.isAttack) {
               info.setRightData(this.packPlayerDetail(data.enemy));
               info.setLeftData(this.player.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE));
            } else {
               info.setLeftData(this.packPlayerDetail(data.enemy));
               info.setRightData(this.player.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE));
            }

            info.setLeftRank(data.leftRank);
            info.setRightRank(data.rightRank);
            down.addInfo(info);
         }

         this.player.sendMsg(down.build());
      } else {
         PeakBattleMsg.C2S_RecordInfo_4407.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_RobotInfo_4466(PeakBattleMsg.C2S_RobotInfo_4466 msg, String source) {
      PeakBattleMsg.C2S_RobotInfo_4466.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public PeakBattleMsg.S2C_MyMilitary_4406.Builder packMyMilitary(PeakPersonalData data, int season) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakBattleMsg.S2C_MyMilitary_4406.Builder builder = PeakBattleMsg.S2C_MyMilitary_4406.newBuilder();
      if (Objects.isNull(data)) {
         builder.setCurStep(playerDao.peak_lv);
         builder.setCurPoint(peakPvpDao.peakPoint);
         builder.setMaxStep(playerDao.peak_lv);
         builder.setMaxPoint(peakPvpDao.peakPoint);
         builder.setCommonWin(0);
         builder.setPeakWin(0);
         builder.setCommonSum(0);
         builder.setPeakSum(0);
         builder.setMaxHurt(0L);
         builder.setMaxStreakWin(0);
         builder.setTopHeroId(-1);
      } else {
         if (season == -1) {
            builder.setCurStep(playerDao.peak_lv);
            builder.setCurPoint(peakPvpDao.peakPoint);
         } else {
            builder.setCurStep(playerDao.peak_lv);
            builder.setCurPoint(peakPvpDao.peakPoint);
         }

         builder.setMaxStep(data.maxStep);
         builder.setMaxPoint(data.maxPoint);
         builder.setCommonWin(data.commWin);
         builder.setPeakWin(data.peakWin);
         builder.setCommonSum(data.commonTimes);
         builder.setPeakSum(data.peakTimes);
         builder.setMaxHurt(data.maxHurt);
         builder.setMaxStreakWin(data.maxStreakWin);
         int tempKey = 0;
         int tempNum = 0;

         for(Map.Entry<Integer, Integer> entry : data.heroMvp.entrySet()) {
            if ((Integer)entry.getValue() > tempNum) {
               tempKey = (Integer)entry.getKey();
               tempNum = (Integer)entry.getValue();
            }
         }

         if (tempKey == 0) {
            builder.setTopHeroId(-1);
         } else {
            builder.setTopHeroId(tempKey);
         }

         PeakBattleMsg.TopEnemyInfo.Builder topEnemy = PeakBattleMsg.TopEnemyInfo.newBuilder();
         PlayerDetailData detail = data.enemyData;
         topEnemy.setServerId(detail.serverId);
         topEnemy.setData(this.packPlayerDetail(detail));
         builder.setInfo(topEnemy);
      }

      builder.setSeason(season);
      return builder;
   }

   public CommonMsg.PlayerInfo.Builder packPlayerDetail(PlayerDetailData detail) {
      CommonMsg.PlayerInfo.Builder info = CommonMsg.PlayerInfo.newBuilder();
      info.setPlayerId(detail.playerId);
      info.setHead(detail.head);
      info.setHeadFrame(detail.headFrame);
      info.setLevel(detail.level);
      info.setPower(detail.power);
      info.setPrestige(detail.prestige);
      info.setServerId(detail.serverId);
      info.setSex(detail.sex);
      info.setVipLv(detail.vipLv);
      info.setPlayerName(detail.playerName);
      info.setCity(detail.city);
      info.setProvince(detail.province);
      info.setStepId(detail.stepId);
      ArrayingMirror mirror = ArrayingMirror.toArrayingMirror(detail.playerArraying);
      info.setArraying(mirror.toPlayerArrayingInfo());
      return info;
   }

   @MsgHandlerAnno
   public void C2S_Matching_4440(PeakBattleMsg.C2S_Matching_4440 msg, String source) {
      if (DateUtil.cHour() >= 23 && DateUtil.cMinute() >= 30) {
         this.player.failure(54006);
      } else {
         PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         int freeTimes = this.configManager.getIntDefault("peakednessFreeTimes", 3);
         if (peakDao.commonFightTimes >= peakDao.commonBuyFightTimes + freeTimes) {
            this.player.failure(54005);
         } else {
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE);
            if (arrayingMirror != null && !arrayingMirror.arrayingIsEmpty()) {
               PeakBattleMsg.C2S_Matching_4440.Builder builder = msg.toBuilder();
               builder.setMaxPower(this.player.getMaxPlayerCombatPower());
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               logger.info("收到巅峰对决请求匹配对手：" + this.player.getPlayerId());
            } else {
               this.player.failure(54011);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void S2C_Matching_4441(PeakBattleMsg.S2C_Matching_4441 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PeakBattleMsg.S2C_Matching_4441.Builder builder = msg.toBuilder();
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakRecordData data = new PeakRecordData();
      data.recordId = -1;
      data.isWin = true;
      data.leftRank = msg.getMyRank();
      data.rightRank = msg.getOtherRank();
      data.time = DateUtil.getIntTime(System.currentTimeMillis());
      data.enemy = new PlayerDetailData();
      data.season = msg.getSeason();
      data.isRobot = msg.getIsRobot();
      this.saveEnemyInfo(msg, data);
      peakDao.matchData = data;
      peakDao.updateOp();
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_EnterMatch_4476(PeakExtraMsg.C2S_EnterMatch_4476 msg, String source) {
      PeakExtraMsg.S2C_EnterMatch_4477.Builder builder = PeakExtraMsg.S2C_EnterMatch_4477.newBuilder();
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (peakDao.matchData != null && peakDao.matchData.enemy != null) {
         int leftTime = DateUtil.getIntTime(System.currentTimeMillis()) - peakDao.matchData.time;
         if (leftTime < 120) {
            builder.setMatchTime(peakDao.matchData.time);
            PlayerDetailData detail = peakDao.matchData.enemy;
            CommonMsg.PlayerInfo.Builder info = CommonMsg.PlayerInfo.newBuilder();
            info.setPlayerId(detail.playerId);
            info.setHead(detail.head);
            info.setHeadFrame(detail.headFrame);
            info.setLevel(detail.level);
            info.setPower(detail.power);
            info.setPrestige(detail.prestige);
            info.setServerId(detail.serverId);
            info.setSex(detail.sex);
            info.setVipLv(detail.vipLv);
            info.setPlayerName(detail.playerName);
            info.setCity(detail.city);
            info.setProvince(detail.province);
            info.setStepId(detail.stepId);
            ArrayingMirror mirror = ArrayingMirror.toArrayingMirror(detail.playerArraying);
            info.setArraying(mirror.toPlayerArrayingInfo());
            builder.setData(info);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public int enterBattle(BattleDao battleDao) {
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (Objects.isNull(peakDao.matchData)) {
         logger.error("匹配对手为空！！！！");
         this.player.deleteDao(battleDao, false);
         return 0;
      } else {
         PeakRecordData data = peakDao.matchData;
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(data.enemy.playerArraying);
         battleDao.scene.addPKTeam((byte)1, new BattlePKTeam(data.enemy.playerId, data.enemy.playerName, arrayingMirror, data.enemy.level, data.enemy.head, data.enemy.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false)));
         PlayerDao playerDao = this.player.getPlayerDao();
         HeroArrayingPart arrayPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         ArrayingMirror mirror = arrayPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE);
         battleDao.scene.addPKTeam((byte)0, new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, mirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(mirror, this.player.isRobot())));
         battleDao.scene.setMaxRound((byte)20);
         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "巅峰对决匹配", "1");
         return 1;
      }
   }

   public void updateSeasonRecord(PeakExtraDao peakDao, int season, boolean isWin, int mvpHeroId, long hurt, PlayerDetailData detailData) {
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakPersonalData data = null;
      PlayerDao playerDao = this.player.getPlayerDao();
      if (peakDao.personalMap.containsKey(season)) {
         data = (PeakPersonalData)peakDao.personalMap.get(season);
      } else {
         data = new PeakPersonalData();
      }

      data.playerId = this.player.getPlayerId();
      data.sourceServerId = this.player.getServerId();
      data.curStep = playerDao.peak_lv;
      data.curPoint = peakPvpDao.peakPoint;
      if (peakPvpDao.peakPoint > data.maxPoint) {
         data.maxPoint = peakPvpDao.peakPoint;
      }

      if (playerDao.peak_lv > data.maxStep) {
         data.maxStep = playerDao.peak_lv;
      }

      ++data.commonTimes;
      if (isWin) {
         ++data.commWin;
         ++data.streakWin;
         if (data.streakWin > data.maxStreakWin) {
            data.maxStreakWin = data.streakWin;
         }
      } else {
         data.streakWin = 0;
      }

      data.peakTimes = 0;
      data.peakWin = 0;
      if (hurt > data.maxHurt) {
         data.maxHurt = hurt;
      }

      if (mvpHeroId > 0) {
         int num = (Integer)data.heroMvp.getOrDefault(mvpHeroId, 0);
         data.heroMvp.put(mvpHeroId, num + 1);
      }

      if (Objects.isNull(data.enemyData)) {
         data.enemyData = detailData;
      } else if (detailData.stepId > data.enemyData.stepId || detailData.stepId == data.enemyData.stepId && detailData.power > data.enemyData.power) {
         data.enemyData = detailData;
      }

      if (!peakDao.personalMap.containsKey(season)) {
         peakDao.personalMap.put(season, data);
      }

      PeakPersonalData totalData = null;
      if (peakDao.totalData != null) {
         totalData = peakDao.totalData;
      } else {
         totalData = new PeakPersonalData();
      }

      if (playerDao.peak_lv > totalData.curStep) {
         totalData.curStep = playerDao.peak_lv;
      }

      if (peakPvpDao.peakPoint > totalData.curPoint) {
         totalData.curPoint = peakPvpDao.peakPoint;
      }

      if (peakPvpDao.peakPoint > totalData.maxPoint) {
         totalData.maxPoint = peakPvpDao.peakPoint;
      }

      if (playerDao.peak_lv > totalData.maxStep) {
         totalData.maxStep = playerDao.peak_lv;
      }

      ++totalData.commonTimes;
      if (isWin) {
         ++totalData.commWin;
         ++totalData.streakWin;
         if (totalData.streakWin > totalData.maxStreakWin) {
            totalData.maxStreakWin = totalData.streakWin;
         }
      } else {
         totalData.streakWin = 0;
      }

      if (hurt > totalData.maxHurt) {
         totalData.maxHurt = hurt;
      }

      if (mvpHeroId > 0) {
         int num = (Integer)totalData.heroMvp.getOrDefault(mvpHeroId, 0);
         totalData.heroMvp.put(mvpHeroId, num + 1);
      }

      if (Objects.isNull(totalData.enemyData)) {
         totalData.enemyData = detailData;
      } else if (detailData.stepId > totalData.enemyData.stepId || detailData.stepId == totalData.enemyData.stepId && detailData.power > totalData.enemyData.power) {
         totalData.enemyData = detailData;
      }

      peakDao.totalData = totalData;
   }

   public void afterFight(BattleDao battleDao) {
      PlayerDao playerDao = this.player.getPlayerDao();
      int limitNum = this.configManager.getIntDefault("peakednessAddCoreLimit", 60);
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakExtraDao peakExtraDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
      PeakRecordData recordData = peakDao.matchData;
      PeakednessStepModel model = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", playerDao.peak_lv);
      recordData.recordId = battleDao.scene.getBattleMsg().getResult().getRecordId();
      if (battleDao.scene.getWinForce() == 0) {
         recordData.isWin = true;
         this.player.triggerTask(601, 0, 1L, 1);
      } else {
         recordData.isWin = false;
      }

      recordData.time = DateUtil.getIntTime(System.currentTimeMillis());
      List<PeakRecordData> delList = peakExtraDao.addRecord(recordData);
      if (delList.size() > 0) {
         List<Integer> del = new ArrayList();

         for(PeakRecordData peakRecordData : delList) {
            del.add(peakRecordData.recordId);
         }

         this.battleRecordMgr.pushTaskEx("delRecord", new Object[]{del});
      }

      ArrayList<Integer> codeList = new ArrayList();

      for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
         codeList.add(entity.getHeroCode());
      }

      long arrayingPower = 1L;
      ArrayList<Long> powerList = new ArrayList();
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         if (codeList.contains(entry.getKey())) {
            powerList.add(((HeroDao)entry.getValue()).getCombatPower());
         }
      }

      for(int i = 0; i < 6 && i < powerList.size(); ++i) {
         arrayingPower += (Long)powerList.get(i);
      }

      int num = (int)(40L - (arrayingPower - recordData.enemy.power) / arrayingPower * 10L);
      if (num > limitNum) {
         num = limitNum;
      }

      if (playerDao.peak_lv == 0) {
         playerDao.peak_lv = 1;
         playerDao.updateOp();
      }

      if (battleDao.scene.getWinForce() == 0) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().getResult().toBuilder();
         battleDao.rewards.addAll(model.getWinAward());

         for(ResourceModel award : model.getWinAward()) {
            result.addAwardItems(award.builder());
         }

         result.setPlayerExp(num);
         result.setPlayerLv(playerDao.peak_lv);
         battleDao.scene.getBattleMsg().setResult(result);
         PeakBattleMsg.S2S_CommonResult_4429.Builder builder = PeakBattleMsg.S2S_CommonResult_4429.newBuilder();
         builder.setIsWin(true);
         builder.setExp(num);
         builder.setPoint(num);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      } else {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().getResult().toBuilder();
         battleDao.rewards.addAll(model.getDefeatAward());

         for(ResourceModel award : model.getDefeatAward()) {
            result.addAwardItems(award.builder());
         }

         result.setPlayerExp(model.getDefeatExp());
         result.setPlayerLv(playerDao.peak_lv);
         battleDao.scene.getBattleMsg().setResult(result);
         PeakBattleMsg.S2S_CommonResult_4429.Builder builder = PeakBattleMsg.S2S_CommonResult_4429.newBuilder();
         builder.setIsWin(false);
         builder.setExp(model.getDefeatExp());
         builder.setPoint(model.getDefeatPoint());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

      int mvpHeroId = 0;
      long tempDamage = 0L;

      for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
         if (entity.getAttackValue() > tempDamage) {
            tempDamage = entity.getAttackValue();
            mvpHeroId = entity.getId();
         }
      }

      long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
      this.updateSeasonRecord(peakExtraDao, peakDao.matchData.season, recordData.isWin, mvpHeroId, damage, peakDao.matchData.enemy);
      if (playerDao.peak_lv >= 10 || peakDao.matchData.enemy.stepId >= 10) {
         this.sendTopRecord(recordData.isWin, battleDao, this.player, peakDao.matchData.enemy, 2, recordData.leftRank, recordData.rightRank);
      }

      boolean isRobot = peakDao.matchData.isRobot;
      int rightStep = peakDao.matchData.enemy.stepId;
      peakDao.season = peakDao.matchData.season;
      peakDao.matchData = null;
      ++peakDao.commonFightTimes;
      peakDao.updateOp();
      peakExtraDao.updateOp();
      this.player.triggerTask(355, 0, 1L, 1);
      if (!isRobot) {
      }

   }

   public void calcBattleInfo(BattleScene battleScene, int leftStep, int rightStep) {
      PeakBattleTotalData data = new PeakBattleTotalData();
      data.leftStep = leftStep;
      data.rightStep = rightStep;
      data.round = battleScene.getCurTotalRound();
      data.isWin = battleScene.getWinForce();

      for(Entity entity : battleScene.getPKTeam((byte)0).getEntityMap().values()) {
         data.leftHeros.add(entity.getId());
      }

      for(Entity entity : battleScene.getPKTeam((byte)1).getEntityMap().values()) {
         data.rightHeros.add(entity.getId());
      }

      this.peakRedPacketMgr.pushTaskEx("savePeakTotal", new Object[]{data});
   }

   public void sendTopRecord(boolean isLeftWin, BattleDao battleDao, GamePlayer player, PlayerDetailData rightData, int recordType, int leftRank, int rightRank) {
      PeakBattleMsg.S2S_TopResult_4431.Builder topBuilder = PeakBattleMsg.S2S_TopResult_4431.newBuilder();
      topBuilder.setIsLeftWin(isLeftWin);
      topBuilder.setRecordType(recordType);
      topBuilder.setLeftData(player.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE));
      topBuilder.setRightData(this.packPlayerDetail(rightData));
      topBuilder.setResult(battleDao.scene.getBattleMsg());
      topBuilder.setLeftRank(leftRank);
      topBuilder.setRightRank(rightRank);
      ArrayingMirror mirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE);
      topBuilder.setLeftArraying(ByteString.copyFrom(mirror.toByteArray()));
      topBuilder.setRightArraying(ByteString.copyFrom(rightData.playerArraying));
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), topBuilder.build());
   }

   public void endBattle(BattleDao battleDao) {
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 54, 5405, 0, 0, "");
         battleDao.rewards.clear();
      }

   }

   @MsgHandlerAnno
   public void C2S_CommonFightResult_4446(PeakBattleMsg.C2S_CommonFightResult_4446 msg, String source) {
      PeakBattleMsg.C2S_CommonFightResult_4446.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_BuyFightTimes_4442(PeakBattleMsg.C2S_BuyFightTimes_4442 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (DateUtil.cHour() >= 23 && DateUtil.cMinute() >= 30) {
         this.player.failure(54006);
      } else {
         String cost = this.configManager.getStr("peakednessTimesCondition");
         String[] resource = cost.split(":");
         if (peakDao.commonBuyFightTimes >= resource.length) {
            this.player.failure(54003);
         } else {
            String[] realCost = resource[peakDao.commonBuyFightTimes].split("\\|");
            if (playerDao.vip_lv < Integer.parseInt(realCost[1])) {
               this.player.failure(54001);
            } else if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(realCost[0]))) {
               this.player.failure(54002);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)Integer.parseInt(realCost[0]), 54, 5401, 0, 0, "");
               ++peakDao.commonBuyFightTimes;
               peakDao.updateOp();
               PeakBattleMsg.C2S_BuyFightTimes_4442.Builder builder = msg.toBuilder();
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               PeakBattleMsg.S2C_BuyFightTimes_4443.Builder pkBuilder = PeakBattleMsg.S2C_BuyFightTimes_4443.newBuilder();
               pkBuilder.setBuyFightTime(peakDao.commonBuyFightTimes);
               pkBuilder.setFightTime(peakDao.commonFightTimes);
               this.player.sendMsg(pkBuilder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveAward_4444(PeakBattleMsg.C2S_ReceiveAward_4444 msg, String source) {
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (peakPvpDao.stepAward >= msg.getStepId()) {
         this.player.failure(54013);
      } else if (peakPvpDao.maxStep < msg.getStepId()) {
         this.player.failure(54004);
      } else {
         PeakBattleMsg.C2S_ReceiveAward_4444.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "巅峰对决", "首达奖励-" + msg.getStepId(), "首达奖励-" + msg.getStepId(), 0, 0, 1);
      }
   }

   @MsgHandlerAnno
   public void C2S_LadderBattleEnd_4464(PeakBattleMsg.C2S_LadderBattleEnd_4464 msg, String source) {
      PeakBattleMsg.C2S_LadderBattleEnd_4464.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_UpdateInfo_4432(PeakBattleMsg.S2S_UpdateInfo_4432 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakExtraDao peakExtraDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
      if (playerDao.peak_lv != msg.getParm1() && msg.getParm1() > 0) {
         playerDao.peak_lv = msg.getParm1();
         playerDao.updateOp();
      }

      if (playerDao.peak_lv > peakPvpDao.maxStep) {
         peakPvpDao.maxStep = playerDao.peak_lv;
      }

      peakPvpDao.peakPoint = msg.getParm2();
      peakPvpDao.exp = msg.getParm3();
      peakPvpDao.bufferExp = msg.getParm4();
      peakPvpDao.riseInfo.clear();
      peakPvpDao.riseInfo.addAll(msg.getRiseInfoList());
      if (peakExtraDao.totalData != null) {
         if (peakExtraDao.totalData.maxStep < playerDao.peak_lv) {
            peakExtraDao.totalData.maxStep = playerDao.peak_lv;
         }

         if (peakExtraDao.totalData.maxPoint < peakPvpDao.peakPoint) {
            peakExtraDao.totalData.maxPoint = peakPvpDao.peakPoint;
         }
      }

      if (peakExtraDao.personalMap.containsKey(peakPvpDao.season)) {
         PeakPersonalData data = (PeakPersonalData)peakExtraDao.personalMap.get(peakPvpDao.season);
         if (data.maxPoint < peakPvpDao.peakPoint) {
            data.maxPoint = peakPvpDao.peakPoint;
         }

         if (data.maxStep < playerDao.peak_lv) {
            data.maxStep = playerDao.peak_lv;
         }

         data.curStep = playerDao.peak_lv;
      }

      peakPvpDao.updateOp();
      peakExtraDao.updateOp();
   }

   @MsgHandlerAnno
   public void S2S_FinalWInTask_4463(PeakBattleMsg.S2S_FinalWInTask_4463 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.player.triggerTask(305, 0, 1L, 1);
   }

   @MsgHandlerAnno
   public void S2S_serverTermination_4480(PeakExtraMsg.S2S_serverTermination_4480 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getOpValue() > 0) {
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         if (peakPvpDao.serverTerminationTime > 0L && DateUtil.isSameDay(peakPvpDao.serverTerminationTime)) {
            logger.info("当天第二次合服，不处理：{}--{}", this.player.getPlayerId(), peakPvpDao.serverTerminationTime);
            return;
         }

         PlayerPublicDao playerDao = this.player.getPlayerDao();
         PeakednessStepModel model = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", playerDao.peak_lv);
         if (model == null) {
            return;
         }

         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel rewardModel = this.getCentreAwardModel(14, (long)playerDao.peak_lv);
         int logReason = 5404;
         String content = MessageFormat.format(rewardModel.getDesc(), model.getName());
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 54, logReason);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "巅峰对决调整跨服", "下半赛季奖励-" + playerDao.peak_lv, "下半赛季奖励-" + playerDao.peak_lv, 0, 0, 1);
         peakPvpDao.serverTerminationTime = System.currentTimeMillis();
         peakPvpDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void S2S_serverTerminationRank_4481(PeakExtraMsg.S2S_serverTerminationRank_4481 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getRank() > 0 && msg.getRank() <= 128) {
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         if (peakPvpDao.serverTerminationRankTime > 0L && DateUtil.isSameDay(peakPvpDao.serverTerminationRankTime)) {
            logger.info("当天第二次合服，不处理排名：{}--{}", this.player.getPlayerId(), peakPvpDao.serverTerminationRankTime);
            return;
         }

         int rank = msg.getRank();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel rewardModel = this.getCentreAwardModel(3, (long)rank);
         int logReason = 5408;
         String content = MessageFormat.format(rewardModel.getDesc(), rank);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 54, logReason);
         this.player.triggerTask(307, 0, (long)rank, -1);
         peakPvpDao.serverTerminationRankTime = System.currentTimeMillis();
         peakPvpDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void S2S_CommonOp_4430(PeakBattleMsg.S2S_CommonOp_4430 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.player.isSystemOpen(2040)) {
         PlayerPublicDao publicDao = this.player.getPublicDao();
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         PeakExtraDao peakExtraDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
         PeakednessStepModel model = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", publicDao.peak_lv);
         if (!Objects.isNull(model)) {
            if (msg.getOpType() == 1 && msg.getOpValue() > 0) {
               PlayerDao playerDao = this.player.getPlayerDao();
               if (playerDao.topMatch > 0) {
                  int num = playerDao.topMatch;
                  playerDao.topMatch = 0;
                  playerDao.updateOp();
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_TOP_MATCH, 0);
                  List<ResourceModel> rewardList = new ArrayList();
                  rewardList.add(new ResourceModel(1, PlayerDefine.PLAYER_HONOR, num));
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  CentreAwardModel rewardModel = this.getCentreAwardModel(27, 1L);
                  int logReason = 5407;
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardList, 604800000L, 54, logReason);
                  playerDao.updateOp();
               }
            } else if (msg.getOpType() == 2) {
               PlayerDao playerDao = this.player.getPlayerDao();
               int num = msg.getOpValue();
               if (playerDao.topMatch < num) {
                  num = playerDao.topMatch;
               }

               if (num > 0) {
                  this.player.delResource(1, PlayerDefine.PLAYER_TOP_MATCH, (long)num, 54, 5409, 0, 0, "");
               }
            } else if (msg.getOpType() == 3) {
               PlayerDao playerDao = this.player.getPlayerDao();
               playerDao.topMatch = 0;
               playerDao.updateOp();
            } else if (msg.getOpType() == 4) {
               PeakednessStepModel awardModel = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", msg.getOpValue());
               this.player.addResource(awardModel.getFirstStepAward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 54, 5402, 0, 0, "");
               peakPvpDao.stepAward = msg.getOpValue();
               peakPvpDao.updateOp();
            } else if (msg.getOpType() == 5) {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               CentreAwardModel rewardModel = this.getCentreAwardModel(14, (long)publicDao.peak_lv);
               int logReason = 5403;
               String content = MessageFormat.format(rewardModel.getDesc(), model.getName());
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 54, logReason);
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "巅峰对决", "上半赛季奖励-" + publicDao.peak_lv, "上半赛季奖励-" + publicDao.peak_lv, 0, 0, 1);
               this.player.triggerTask(306, publicDao.peak_lv, 1L, 3);
            } else if (msg.getOpType() == 6) {
               PlayerDao playerDao = this.player.getPlayerDao();
               if (msg.getOpValue() > 0) {
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  CentreAwardModel rewardModel = this.getCentreAwardModel(14, (long)playerDao.peak_lv);
                  int logReason = 5404;
                  String content = MessageFormat.format(rewardModel.getDesc(), model.getName());
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 54, logReason);
               }

               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "巅峰对决", "下半赛季奖励-" + playerDao.peak_lv, "下半赛季奖励-" + playerDao.peak_lv, 0, 0, 1);
               this.player.triggerTask(306, playerDao.peak_lv, 1L, 3);
               playerDao.peak_lv = model.getStepReset();
               peakPvpDao.peakPoint = 0;
               peakPvpDao.exp = 0;
               peakPvpDao.bufferExp = model.getBufferExp();
               peakPvpDao.maxStep = model.getStepReset();
               peakPvpDao.stepAward = 0;
               this.player.notifyPlayerData(PlayerDefine.PLAYER_PEAK_LV, model.getStepReset());
               if (peakExtraDao.commonRecord.size() > 0) {
                  List<Integer> delList = new ArrayList();

                  for(PeakRecordData value : peakExtraDao.commonRecord) {
                     delList.add(value.recordId);
                  }

                  this.battleRecordMgr.pushTaskEx("delRecord", new Object[]{delList});
                  peakExtraDao.commonRecord.clear();
               }

               if (peakExtraDao.peakRecord.size() > 0) {
                  List<Integer> delList = new ArrayList();

                  for(PeakRecordData value : peakExtraDao.peakRecord) {
                     delList.add(value.recordId);
                  }

                  this.battleRecordMgr.pushTaskEx("delRecord", new Object[]{delList});
                  peakExtraDao.peakRecord.clear();
               }

               playerDao.updateOp();
               peakPvpDao.updateOp();
               peakExtraDao.updateOp();
            } else if (msg.getOpType() == 7 && msg.getOpValue() > 0 && msg.getOpValue() <= 128) {
               int rank = msg.getOpValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               CentreAwardModel rewardModel = this.getCentreAwardModel(3, (long)rank);
               int logReason = 5408;
               String content = MessageFormat.format(rewardModel.getDesc(), rank);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 54, logReason);
               this.player.triggerTask(307, 0, (long)rank, -1);
            }

         }
      }
   }

   public void resetArraying() {
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE);
      if (arrayingDao != null && !arrayingDao.elements.isEmpty()) {
         for(Map.Entry<Byte, Integer> entry : arrayingDao.elements.entrySet()) {
            switch ((Byte)entry.getKey()) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                  HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE.getNumber());
                     heroDao.updateOp();
                     result_builder.addHeros(heroDao.toHeroInfo());
                  }
            }
         }

         arrayingDao.soulHeroCode = 0;
         arrayingDao.elements.clear();
         arrayingDao.updateOp();
         this.player.sendMsg(result_builder.build());
      }

      HeroMsg.S2C_HeroBaseData_5002.Builder ladder_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingDao ladderArrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_PEAK_LADDER);
      if (ladderArrayingDao != null && !ladderArrayingDao.elements.isEmpty()) {
         for(Map.Entry<Byte, Integer> entry : ladderArrayingDao.elements.entrySet()) {
            switch ((Byte)entry.getKey()) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                  HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_PEAK_LADDER.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_PEAK_LADDER.getNumber());
                     heroDao.updateOp();
                     ladder_builder.addHeros(heroDao.toHeroInfo());
                  }
            }
         }

         ladderArrayingDao.soulHeroCode = 0;
         ladderArrayingDao.elements.clear();
         ladderArrayingDao.updateOp();
         this.player.sendMsg(ladder_builder.build());
      }

   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel value : rewardMap.values()) {
         if ((long)value.getMinRank() <= rank && (long)value.getMaxRank() >= rank) {
            rewardModel = value;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   @MsgHandlerAnno
   public void C2S_SeasonKingInfo_4411(PeakBattleMsg.C2S_SeasonKingInfo_4411 msg, String source) {
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      PeakBattleMsg.C2S_SeasonKingInfo_4411.Builder builder = msg.toBuilder();

      for(Integer like : peakPvpDao.peakLike) {
         builder.addMyLike(like);
      }

      builder.setLikeNum(3 - peakPvpDao.peakLike.size());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LadderFight_4448(PeakBattleMsg.C2S_LadderFight_4448 msg, String source) {
      logger.info("请求挑战巅峰对决天梯赛：" + msg.getRank());
      if (DateUtil.cHour() >= 23 && DateUtil.cMinute() >= 30) {
         this.player.failure(54008);
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         int limitStep = this.configManager.getIntDefault("peakednessStepCondition", 10);
         if (playerDao.peak_lv < limitStep) {
            this.player.failure(54012);
         } else {
            PeakBattleMsg.C2S_LadderFight_4448.Builder builder = msg.toBuilder();
            PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
            int freeTimes = this.configManager.getIntDefault("peakednessRushFreeTimes", 5);
            if (peakDao.peakFightTimes >= peakDao.peakBuyFightTimes + freeTimes) {
               this.player.failure(54007);
            } else {
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               this.player.triggerTask(355, 0, 1L, 1);
               this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "巅峰对决天梯", "1");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BuyPeakFightTimes_4451(PeakBattleMsg.C2S_BuyPeakFightTimes_4451 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (DateUtil.cHour() >= 23 && DateUtil.cMinute() >= 30) {
         this.player.failure(54008);
      } else {
         String cost = this.configManager.getStr("peakednessTimesCondition2");
         String[] resource = cost.split(":");
         if (peakDao.peakBuyFightTimes >= resource.length) {
            this.player.failure(54020);
         } else {
            String[] realCost = resource[peakDao.peakBuyFightTimes].split("\\|");
            if (playerDao.vip_lv < Integer.parseInt(realCost[1])) {
               this.player.failure(54018);
            } else if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(realCost[0]))) {
               this.player.failure(54019);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)Integer.parseInt(realCost[0]), 54, 5401, 0, 0, "");
               ++peakDao.peakBuyFightTimes;
               peakDao.updateOp();
               PeakBattleMsg.C2S_BuyPeakFightTimes_4451.Builder builder = msg.toBuilder();
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               PeakBattleMsg.S2C_BuyPeakFightTimes_4452.Builder pkBuilder = PeakBattleMsg.S2C_BuyPeakFightTimes_4452.newBuilder();
               pkBuilder.setBuyFightTime(peakDao.peakBuyFightTimes);
               pkBuilder.setFightTime(peakDao.peakFightTimes);
               this.player.sendMsg(pkBuilder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void S2S_UpdateLikeNum_4465(PeakBattleMsg.S2S_UpdateLikeNum_4465 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      ++peakDao.likeNum;
      peakDao.updateOp();
   }

   @MsgHandlerAnno
   public void S2S_LadderFightResult_4450(PeakBattleMsg.S2S_LadderFightResult_4450 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PeakBattleMsg.S2S_LadderFightResult_4450.Builder builder = msg.toBuilder();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (builder.getIsAttack()) {
         PeakednessStepModel model = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", playerDao.peak_lv);
         if (msg.getResult().getResult().getResult() == 0) {
            this.player.addResource(model.getWinAward(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 54, 5410, 0, 0, "");
         } else {
            this.player.addResource(model.getDefeatAward(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 54, 5410, 0, 0, "");
         }

         PeakPvpDao peakDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         PeakExtraDao peakExtraDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
         ++peakDao.peakFightTimes;
         PeakPersonalData data = null;
         if (peakExtraDao.personalMap.containsKey(builder.getSeason())) {
            data = (PeakPersonalData)peakExtraDao.personalMap.get(builder.getSeason());
         } else {
            data = new PeakPersonalData();
         }

         ++data.peakTimes;
         if (builder.getResult().getResult().getResult() == 0) {
            ++data.peakWin;
            ++data.streakWin;
            if (data.maxStreakWin < data.streakWin) {
               data.maxStreakWin = data.streakWin;
            }
         } else {
            data.streakWin = 0;
         }

         PlayerDetailData detail = this.saveLadderEnemyInfo(builder.build());
         if (Objects.isNull(data.enemyData)) {
            data.enemyData = detail;
         } else if (detail.stepId > data.enemyData.stepId || detail.stepId == data.enemyData.stepId && detail.power > data.enemyData.power) {
            data.enemyData = detail;
         }

         if (builder.getDamage() > data.maxHurt) {
            data.maxHurt = builder.getDamage();
         }

         if (builder.getMvpHeroId() > 0) {
            int num = (Integer)data.heroMvp.getOrDefault(builder.getMvpHeroId(), 0);
            data.heroMvp.put(builder.getMvpHeroId(), num + 1);
         }

         PeakPersonalData total = null;
         if (peakExtraDao.totalData != null) {
            total = peakExtraDao.totalData;
         } else {
            total = new PeakPersonalData();
         }

         ++total.peakTimes;
         if (builder.getResult().getResult().getResult() == 0) {
            ++total.peakWin;
            ++total.streakWin;
            if (total.maxStreakWin < total.streakWin) {
               total.maxStreakWin = total.streakWin;
            }
         }

         if (Objects.isNull(total.enemyData)) {
            total.enemyData = detail;
         } else if (detail.stepId > total.enemyData.stepId || detail.stepId == total.enemyData.stepId && detail.power > total.enemyData.power) {
            total.enemyData = detail;
         }

         if (builder.getDamage() > total.maxHurt) {
            total.maxHurt = builder.getDamage();
         }

         if (builder.getMvpHeroId() > 0) {
            int num = (Integer)total.heroMvp.getOrDefault(builder.getMvpHeroId(), 0);
            total.heroMvp.put(builder.getMvpHeroId(), num + 1);
         }

         peakDao.updateOp();
         peakExtraDao.updateOp();
         boolean isWin = false;
         if (builder.getResult().getResult().getResult() == 0) {
            isWin = true;
         }

         this.saveLadderRecord(isWin, builder);
         if (isWin) {
            if (msg.getMyRank() > msg.getOtherRank()) {
               this.player.triggerTask(602, 0, (long)msg.getOtherRank(), 0);
            } else {
               this.player.triggerTask(602, 0, (long)msg.getMyRank(), 0);
            }
         }
      } else {
         boolean isWin = false;
         if (builder.getResult().getResult().getResult() == 0) {
            isWin = true;
         }

         this.saveLadderRecord(isWin, builder);
      }

   }

   public void saveLadderRecord(boolean isWin, PeakBattleMsg.S2S_LadderFightResult_4450.Builder msg) {
      this.battleRecordMgr.pushTaskEx("savePeakBattle", new Object[]{isWin, msg, this.player});
   }

   @TaskMethod
   public void _saveRecord(boolean isWin, PeakBattleMsg.S2S_LadderFightResult_4450.Builder msg, int recordId, int time) {
      PeakRecordData data = new PeakRecordData();
      data.leftRank = msg.getMyRank();
      data.rightRank = msg.getOtherRank();
      data.season = msg.getSeason();
      data.recordId = recordId;
      data.isWin = isWin;
      data.isAttack = msg.getIsAttack();
      data.time = time;
      PlayerDetailData detail = this.saveLadderEnemyInfo(msg.build());
      data.enemy = detail;
      PeakExtraDao peakExtraDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
      List<PeakRecordData> delList = peakExtraDao.addPeakRecord(data);
      if (delList.size() > 0) {
         List<Integer> del = new ArrayList();

         for(PeakRecordData recordData : delList) {
            del.add(recordData.recordId);
         }

         this.battleRecordMgr.pushTaskEx("delRecord", new Object[]{del});
      }

   }

   public PlayerDetailData saveLadderEnemyInfo(PeakBattleMsg.S2S_LadderFightResult_4450 msg) {
      PlayerDetailData data = new PlayerDetailData();
      CommonMsg.PlayerInfo.Builder builder = msg.getEnemyInfo().toBuilder();
      data.power = builder.getPower();
      data.head = builder.getHead();
      data.headFrame = builder.getHeadFrame();
      data.level = builder.getLevel();
      data.playerName = builder.getPlayerName();
      data.serverId = builder.getServerId();
      data.city = builder.getCity();
      data.playerId = builder.getPlayerId();
      data.prestige = builder.getPrestige();
      data.province = builder.getProvince();
      data.sex = builder.getSex();
      data.vipLv = builder.getVipLv();
      data.stepId = builder.getStepId();
      data.monarchId = builder.getMonarchId();
      data.serverId = builder.getServerId();
      data.playerArraying = msg.getEnemyArraying().toByteArray();
      return data;
   }

   @MsgHandlerAnno
   public void C2S_RefreshLadder_4433(PeakBattleMsg.C2S_RefreshLadder_4433 msg, String source) {
      PeakBattleMsg.C2S_RefreshLadder_4433.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LikeKing_4413(PeakBattleMsg.C2S_LikeKing_4413 msg, String source) {
      if (msg.getRank() > 0 && msg.getRank() <= 3) {
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         int likeNum = ApplicationContextProvider.getConfigInt("LIKE_NUM", 3);
         if (peakPvpDao.peakLike.size() < likeNum) {
            if (!peakPvpDao.peakLike.contains(msg.getRank())) {
               peakPvpDao.peakLike.add(msg.getRank());
               peakPvpDao.updateOp();
               PeakBattleMsg.C2S_LikeKing_4413.Builder builder = msg.toBuilder();
               builder.setLikeNum(likeNum - peakPvpDao.peakLike.size());
               builder.addAllMyLike(peakPvpDao.peakLike);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               String reward = ApplicationContextProvider.getConfigString("peakLikeReward", "");
               if (!reward.equals("")) {
                  String[] resourceArr = reward.split("\\|");
                  ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]));
                  this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 36, 3603, 0, 0, "");
                  PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                  MapUtil.mapPlusInt(playerExtend.likePlayer, 2041, 1);
                  this.player.updatePlayerExtend(13);
                  LadderPart ladderPart = (LadderPart)this.player.getMgrPart(LadderPart.class);
                  ladderPart.sendPlayerLike();
                  GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                  guanJiaPart.checkState(2043, (List)null);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PeakRankInfo_4415(PeakBattleMsg.C2S_PeakRankInfo_4415 msg, String source) {
      PeakBattleMsg.C2S_PeakRankInfo_4415.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PeakFinalRank_4436(PeakBattleMsg.C2S_PeakFinalRank_4436 msg, String source) {
      PeakBattleMsg.C2S_PeakFinalRank_4436.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LeaveUI_4438(PeakBattleMsg.C2S_LeaveUI_4438 msg, String source) {
      PeakBattleMsg.C2S_LeaveUI_4438.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PeakBattle_4409(PeakBattleMsg.C2S_PeakBattle_4409 msg, String source) {
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (msg.hasMainEnter() && msg.getMainEnter()) {
         logger.info("主城入口进入巅峰对决决赛！！！！");
         PlayerPublicDao playerDao = this.player.getPublicDao();
         PeakBattleMsg.C2S_PeakInit_4401.Builder InitBuilder = PeakBattleMsg.C2S_PeakInit_4401.newBuilder();
         InitBuilder.setServerId(this.player.getServerId());
         InitBuilder.setPlayerId(this.player.getPlayerId());
         InitBuilder.setPlayerName(playerDao.playerName);
         InitBuilder.setSex(playerDao.sex);
         InitBuilder.setLv(playerDao.lv);
         InitBuilder.setCombatPower(this.player.getPlayerCombatPower());
         InitBuilder.setHeadId(playerDao.head);
         InitBuilder.setHeadFrame(playerDao.headFrame);
         InitBuilder.setPrestige(playerDao.prestige);
         InitBuilder.setMonarchId(playerDao.monarchId);
         InitBuilder.setUnionId(playerDao.unionId);
         InitBuilder.setUnionName("");
         InitBuilder.setVipLev(playerDao.vip_lv);
         if (playerDao.unionId > 0) {
            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
            InitBuilder.setUnionName(unionDao.unionName);
         }

         PlayerDao dao = this.player.getPlayerDao();
         InitBuilder.setStepId(dao.peak_lv);
         InitBuilder.setProvince(this.player.getIpProvince());
         InitBuilder.setCity(this.player.getIpCity());
         InitBuilder.setCommonBuyFightTimes(peakPvpDao.commonBuyFightTimes);
         InitBuilder.setCommonFightTimes(peakPvpDao.commonFightTimes);
         InitBuilder.setPeakPoint(peakPvpDao.peakPoint);
         InitBuilder.setExp(peakPvpDao.exp);
         InitBuilder.setBufferExp(peakPvpDao.bufferExp);
         InitBuilder.addAllRiseInfo(peakPvpDao.riseInfo);
         if (peakPvpDao.maxStep == 0) {
            peakPvpDao.maxStep = 1;
            peakPvpDao.updateOp();
         }

         InitBuilder.setMaxStep(peakPvpDao.maxStep);
         InitBuilder.setStepAward(peakPvpDao.stepAward);
         InitBuilder.setChip(dao.topMatch);
         InitBuilder.setSecondTitle(dao.secondTitle);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), InitBuilder.build());
         this.sendArrayingToCross(2);
      }

      PeakBattleMsg.C2S_PeakBattle_4409.Builder builder = msg.toBuilder();
      builder.setPeakFightTimes(peakPvpDao.peakFightTimes);
      builder.setPeakBuyFightTimes(peakPvpDao.peakBuyFightTimes);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PeakFightList_4417(PeakBattleMsg.C2S_PeakFightList_4417 msg, String source) {
      PeakBattleMsg.C2S_PeakFightList_4417.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_GuessUi_4423(PeakBattleMsg.C2S_GuessUi_4423 msg, String source) {
      PeakBattleMsg.C2S_GuessUi_4423.Builder builder = msg.toBuilder();
      PlayerDao playerDao = this.player.getPlayerDao();
      builder.setChip(playerDao.topMatch);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_Guess_4425(PeakBattleMsg.C2S_Guess_4425 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakBattleMsg.C2S_Guess_4425.Builder builder = msg.toBuilder();
      int wagerNum = builder.getWagerNum();
      builder.setChip(playerDao.topMatch);
      int limitChip = this.configManager.getIntDefault("heroRivalGuessChipMin", 20);
      if (msg.getWagerNum() < limitChip) {
         this.player.failure(54017);
      } else if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_TOP_MATCH, wagerNum)) {
         this.player.failure(54014);
      } else {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_PlayerInfo_4419(PeakBattleMsg.C2S_PlayerInfo_4419 msg, String source) {
      PeakBattleMsg.C2S_PlayerInfo_4419.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyFightInfo_4421(PeakBattleMsg.C2S_MyFightInfo_4421 msg, String source) {
      PeakBattleMsg.C2S_MyFightInfo_4421.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MyGuessInfo_4456(PeakBattleMsg.C2S_MyGuessInfo_4456 msg, String source) {
      PeakBattleMsg.C2S_MyGuessInfo_4456.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_PeakInfo_4462(PeakBattleMsg.S2S_PeakInfo_4462 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (peakPvpDao.season != msg.getSeason() || peakPvpDao.seasonTime != msg.getSeasonTime()) {
         peakPvpDao.seasonTime = msg.getSeasonTime();
         peakPvpDao.season = msg.getSeason();
         peakPvpDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void S2S_SendChip_4454(PeakBattleMsg.S2S_SendChip_4454 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getOpValue() > 0) {
         if (msg.getIsShow() > 0) {
            this.player.addResource(1, PlayerDefine.PLAYER_TOP_MATCH, msg.getOpValue(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 54, 5406, 0, 0, "");
         } else {
            this.player.addResource(1, PlayerDefine.PLAYER_TOP_MATCH, msg.getOpValue(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 54, 5406, 0, 0, "");
         }
      }

   }

   public void saveEnemyInfo(PeakBattleMsg.S2C_Matching_4441 msg, PeakRecordData data) {
      CommonMsg.PlayerInfo.Builder builder = msg.getData().toBuilder();
      data.enemy.power = builder.getPower();
      data.enemy.head = builder.getHead();
      data.enemy.headFrame = builder.getHeadFrame();
      data.enemy.level = builder.getLevel();
      data.enemy.playerName = builder.getPlayerName();
      data.enemy.serverId = builder.getServerId();
      data.enemy.city = builder.getCity();
      data.enemy.playerId = builder.getPlayerId();
      data.enemy.prestige = builder.getPrestige();
      data.enemy.province = builder.getProvince();
      data.enemy.sex = builder.getSex();
      data.enemy.vipLv = builder.getVipLv();
      data.enemy.stepId = builder.getStepId();
      data.enemy.monarchId = builder.getMonarchId();
      data.enemy.serverId = builder.getServerId();
      ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(msg.getArraying().toByteArray());
      data.enemy.playerArraying = arrayingMirror.toByteArray();
   }

   public CommonMsg.PlayerInfo.Builder packRobotDetail(RobotData detail) {
      CommonMsg.PlayerInfo.Builder info = CommonMsg.PlayerInfo.newBuilder();
      info.setPlayerId(detail.player);
      info.setHead(detail.head);
      info.setHeadFrame(detail.headFrame);
      info.setLevel(detail.lv);
      info.setPower((long)detail.power);
      info.setPrestige(-1);
      info.setServerId(0);
      info.setSex(detail.sex);
      info.setVipLv(detail.vip_lv);
      info.setPlayerName(detail.name);
      info.setCity("");
      info.setProvince("");
      info.setMonarchId(detail.monarchId);
      ArrayingMirror mirror = (ArrayingMirror)detail.parseArrayingMirror().get(0);
      info.setArraying(mirror.toPlayerArrayingInfo());
      return info;
   }

   public void resetDaily() {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (peakPvpDao.commonFightTimes > 0 || peakPvpDao.commonBuyFightTimes > 0 || peakPvpDao.peakFightTimes == 0 || peakPvpDao.peakBuyFightTimes == 0 || peakPvpDao.peakLike.size() > 0 || peakPvpDao.commonLike.size() > 0) {
         peakPvpDao.commonFightTimes = 0;
         peakPvpDao.commonBuyFightTimes = 0;
         peakPvpDao.peakFightTimes = 0;
         peakPvpDao.peakBuyFightTimes = 0;
         peakPvpDao.peakLike.clear();
         peakPvpDao.commonLike.clear();
         peakPvpDao.updateOp();
      }

   }

   public void seasonEnd(PeakPvpDao peakPvpDao, PeakExtraDao peakExtraDao) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PeakednessStepModel model = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", playerDao.peak_lv);
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      CentreAwardModel rewardModel = this.getCentreAwardModel(14, (long)playerDao.peak_lv);
      int logReason = 5404;
      String content = MessageFormat.format(rewardModel.getDesc(), model.getName());
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 54, logReason);
      this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "巅峰对决", "下半赛季奖励-" + playerDao.peak_lv, "下半赛季奖励-" + playerDao.peak_lv, 0, 0, 1);
      this.player.triggerTask(306, playerDao.peak_lv, 1L, 3);
      playerDao.peak_lv = model.getStepReset();
      peakPvpDao.peakPoint = 0;
      peakPvpDao.exp = 0;
      peakPvpDao.bufferExp = model.getBufferExp();
      peakPvpDao.maxStep = 1;
      peakPvpDao.stepAward = 0;
      this.player.notifyPlayerData(PlayerDefine.PLAYER_PEAK_LV, model.getStepReset());
      if (peakExtraDao.commonRecord.size() > 0) {
         List<Integer> delList = new ArrayList();

         for(PeakRecordData value : peakExtraDao.commonRecord) {
            delList.add(value.recordId);
         }

         this.battleRecordMgr.pushTaskEx("delRecord", new Object[]{delList});
         peakExtraDao.commonRecord.clear();
      }

      if (peakExtraDao.peakRecord.size() > 0) {
         List<Integer> delList = new ArrayList();

         for(PeakRecordData value : peakExtraDao.peakRecord) {
            delList.add(value.recordId);
         }

         this.battleRecordMgr.pushTaskEx("delRecord", new Object[]{delList});
         peakExtraDao.peakRecord.clear();
      }

      playerDao.updateOp();
      peakPvpDao.updateOp();
      this.resetArraying();
   }

   public void gmOp(int op) {
      if (op == 1) {
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         PlayerDao playerDao = this.player.getPlayerDao();
         playerDao.peak_lv = 1;
         peakPvpDao.peakPoint = 0;
         peakPvpDao.bufferExp = 0;
         peakPvpDao.exp = 0;
         peakPvpDao.riseInfo.clear();
         peakPvpDao.updateOp();
         playerDao.updateOp();
      } else if (op == 2) {
         this.resetDaily();
      } else if (op == 3) {
         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         PeakExtraDao peakExtraDao = (PeakExtraDao)this.player.getData("tb_peak_extra", this.player.getPlayerId());
         peakExtraDao.commonRecord.clear();
         peakPvpDao.matchData = null;
         peakPvpDao.updateOp();
         peakExtraDao.updateOp();
      }

      if (op > 100 && op <= 150) {
         int peakLv = op - 100;
         PeakednessStepModel model = (PeakednessStepModel)this.player.getGameModelPool().getEntity("peakednessStep", peakLv);
         if (Objects.isNull(model)) {
            return;
         }

         PlayerDao playerDao = this.player.getPlayerDao();
         if (peakLv > 0) {
            playerDao.peak_lv = peakLv;
         }

         PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
         peakPvpDao.bufferExp = 0;
         peakPvpDao.exp = 0;
         peakPvpDao.riseInfo.clear();
         peakPvpDao.updateOp();
         playerDao.updateOp();
      }

      PeakBattleMsg.S2S_GmOp_4499.Builder builder = PeakBattleMsg.S2S_GmOp_4499.newBuilder();
      builder.setGmOp(op);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void sendArrayingToCross(int arrayType) {
      PeakBattleMsg.S2S_PlayerArraying_4455.Builder builder = PeakBattleMsg.S2S_PlayerArraying_4455.newBuilder();
      ArrayingMirror arrayingMirror = null;
      if (arrayType == 1) {
         arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_PEAK_BATTLE);
      } else {
         arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_PEAK_LADDER);
      }

      if (arrayingMirror == null || arrayingMirror.arrayingElementsMap == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
         arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      }

      if (arrayingMirror == null || arrayingMirror.arrayingElementsMap == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
         logger.error("巅峰对决发送阵容给跨服的时候 阵容为空");
      }

      byte[] bytes = arrayingMirror.toByteArray();
      builder.setArraying(ByteString.copyFrom(bytes));
      builder.setArrayType(arrayType);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TopThreeInfo_4468(PeakExtraMsg.C2S_TopThreeInfo_4468 msg, String source) {
      PeakExtraMsg.C2S_TopThreeInfo_4468.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void calcPeakTotal() {
      Map<Integer, Map<Integer, Integer>> stepMap = new HashMap();
      new HashMap();
      new HashMap();
      new HashMap();

      for(PeakBattleTotalDao totalDao : this.worldMgr.getGameCachePool().getAllTableByList("tb_peak_battle_info")) {
         PeakBattleTotalData data = totalDao.data;
         if (stepMap.containsKey(data.leftStep)) {
            for(Integer heroId : data.leftHeros) {
               if (((Map)stepMap.get(data.leftStep)).containsKey(heroId)) {
                  int num = (Integer)((Map)stepMap.get(data.leftStep)).get(heroId);
                  ((Map)stepMap.get(data.leftStep)).put(heroId, num + 1);
               } else {
                  ((Map)stepMap.get(data.leftStep)).put(heroId, 1);
               }
            }
         } else {
            Map<Integer, Integer> heroMap = new HashMap();

            for(Integer heroId : data.leftHeros) {
               if (heroMap.containsKey(heroId)) {
                  int num = (Integer)heroMap.get(heroId);
                  heroMap.put(heroId, num + 1);
               } else {
                  heroMap.put(heroId, 1);
               }
            }

            stepMap.put(data.leftStep, heroMap);
         }

         if (stepMap.containsKey(data.rightStep)) {
            for(Integer heroId : data.rightHeros) {
               if (((Map)stepMap.get(data.rightStep)).containsKey(heroId)) {
                  int num = (Integer)((Map)stepMap.get(data.rightStep)).get(heroId);
                  ((Map)stepMap.get(data.rightStep)).put(heroId, num + 1);
               } else {
                  ((Map)stepMap.get(data.rightStep)).put(heroId, 1);
               }
            }
         } else {
            Map<Integer, Integer> heroMap = new HashMap();

            for(Integer heroId : data.rightHeros) {
               if (heroMap.containsKey(heroId)) {
                  int num = (Integer)heroMap.get(heroId);
                  heroMap.put(heroId, num + 1);
               } else {
                  heroMap.put(heroId, 1);
               }
            }

            stepMap.put(data.rightStep, heroMap);
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_PeakRedPacketList_4470(PeakExtraMsg.C2S_PeakRedPacketList_4470 msg, String source) {
      this.peakRedPacketMgr.pushTaskEx("builderPacketList", new Object[]{this.player, msg.getPacketId()});
   }

   @MsgHandlerAnno
   public void C2S_ReceiveRedPacket_4472(PeakExtraMsg.C2S_ReceiveRedPacket_4472 msg, String source) {
      this.peakRedPacketMgr.pushTaskEx("C2S_ReceiveRedPacket_4472", new Object[]{this.player, msg.getId()});
   }

   @TaskMethod
   public void receiveRedPacket(ResourceModel resourceModel) {
      this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 54, 5411, 0, 0, "");
   }

   @MsgHandlerAnno
   public void S2S_NotifyTerminationAward_4475(PeakExtraMsg.S2S_NotifyTerminationAward_4475 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      CentreAwardModel rewardModel = this.getCentreAwardModel(67, 1L);
      int logReason = 5412;
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, 54, logReason);
   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      PeakPvpDao peakPvpDao = (PeakPvpDao)this.player.getData("tb_peak_pvp", this.player.getPlayerId());
      if (peakPvpDao.peakLike.size() > 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         int likeNum = ApplicationContextProvider.getConfigInt("LIKE_NUM", 3);

         for(int rank = 1; rank <= likeNum; ++rank) {
            peakPvpDao.peakLike.add(rank);
            peakPvpDao.updateOp();
            PeakBattleMsg.C2S_LikeKing_4413.Builder builder = PeakBattleMsg.C2S_LikeKing_4413.newBuilder();
            builder.setRank(rank);
            builder.setLikeNum(likeNum - peakPvpDao.peakLike.size());
            builder.addAllMyLike(peakPvpDao.peakLike);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }

         List<ResourceModel> rewardList = new ArrayList();
         String reward = ApplicationContextProvider.getConfigString("peakLikeReward", "");
         String[] resourceArr = reward.split("\\|");
         ResourceModel resourceModel = new ResourceModel(Integer.parseInt(resourceArr[0]), Integer.parseInt(resourceArr[1]), Integer.parseInt(resourceArr[2]) * likeNum);
         rewardList.add(resourceModel);
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 36, 3603, 0, 0, "管家");
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         MapUtil.mapPlusInt(playerExtend.likePlayer, 2041, likeNum);
         this.player.updatePlayerExtend(13);
         LadderPart ladderPart = (LadderPart)this.player.getMgrPart(LadderPart.class);
         ladderPart.sendPlayerLike();
         guanJiaPart.checkState(systemId, rewardList);
      }
   }
}
