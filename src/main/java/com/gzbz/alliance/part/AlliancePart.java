package com.gzbz.alliance.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.alliance.AllianceMgr;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.AllianceTeamDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.model.TeamBattleVsRewardModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.AllianceMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossAllianceMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import misc.MapUtil;
import misc.MiscUtil;
import net.CrossSubscribeMsg;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AlliancePart extends PlayerPart {
   private final AllianceMgr allianceMgr;
   private final ConfigManager configManager;

   public AlliancePart(AllianceMgr allianceMgr, ConfigManager configManager) {
      this.allianceMgr = allianceMgr;
      this.configManager = configManager;
   }

   @MsgHandlerAnno
   public void C2S_AllianceMain_11601(AllianceMsg.C2S_AllianceMain_11601 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ALLIANCE).isEmpty()) {
            heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_ALLIANCE);
         }

         this.allianceMgr.pushTaskEx("sendAllianceInfo", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_AllianceHall_11603(AllianceMsg.C2S_AllianceHall_11603 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         AllianceMsg.S2C_AllianceHall_11604.Builder resp = AllianceMsg.S2C_AllianceHall_11604.newBuilder();

         for(AllianceTeamDao allianceTeamDao : this.allianceMgr.getAllianceTeams(msg.hasTeamName() ? msg.getTeamName() : null)) {
            resp.addTeamList(this.allianceMgr.buildTeamMsg(allianceTeamDao));
         }

         resp.addAllApplyTeams((Iterable)MapUtil.getOrDefault(this.allianceMgr.playerApplyTeamMap, this.player.getPlayerId(), ConcurrentHashSet.class));
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInviteList_11605(AllianceMsg.C2S_TeamInviteList_11605 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         AllianceMsg.S2C_TeamInviteList_11606.Builder resp = AllianceMsg.S2C_TeamInviteList_11606.newBuilder();

         for(int teamId : (Set)MapUtil.getOrDefault(this.allianceMgr.playerInviteTeamMap, this.player.getPlayerId(), ConcurrentHashSet.class)) {
            AllianceMsg.TeamInfo teamBuilder = this.allianceMgr.buildTeamMsg(teamId);
            if (teamBuilder != null) {
               resp.addInviteTeamList(teamBuilder);
            }
         }

         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_CreateTeam_11607(AllianceMsg.C2S_CreateTeam_11607 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         String teamName = msg.getTeamName();
         if (StringUtils.isEmpty(teamName)) {
            this.player.failure(51000);
         } else {
            int configTeamName = this.configManager.getIntDefault("teamNameLimit", 6);
            if (teamName.length() > configTeamName) {
               this.player.failure(51020);
            } else {
               this.allianceMgr.pushTaskEx("allianceReqCreateTeam", new Object[]{this.player, teamName, msg.getPowerLimit(), msg.getLevelLimit(), msg.getVerify()});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ModifyTeam_11609(AllianceMsg.C2S_ModifyTeam_11609 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         String teamName = msg.getTeamName();
         if (StringUtils.isEmpty(teamName)) {
            this.player.failure(51000);
         } else {
            int configTeamName = this.configManager.getIntDefault("teamNameLimit", 6);
            if (teamName.length() > configTeamName) {
               this.player.failure(51020);
            } else {
               this.allianceMgr.pushTaskEx("allianceReqModifyTeam", new Object[]{this.player, teamName, msg.getPowerLimit(), msg.getLevelLimit(), msg.getVerify()});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamApplyList_11611(AllianceMsg.C2S_TeamApplyList_11611 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqApplyList", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInvitePlayerList_11613(AllianceMsg.C2S_TeamInvitePlayerList_11613 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqInvitePlayerList", new Object[]{this.player, msg.hasPlayerName() ? msg.getPlayerName() : null});
      }
   }

   @MsgHandlerAnno
   public void C2S_CaptainApplyOp_11615(AllianceMsg.C2S_CaptainApplyOp_11615 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqOpApply", new Object[]{this.player, msg.getPlayerId(), msg.getIsAgree()});
      }
   }

   @MsgHandlerAnno
   public void C2S_CaptainInvite_11617(AllianceMsg.C2S_CaptainInvite_11617 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqInvitePlayer", new Object[]{this.player, msg.getPlayerId()});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamApply_11619(AllianceMsg.C2S_TeamApply_11619 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.allianceMgr.pushTaskEx("allianceReqApply", new Object[]{this.player, playerDao.lv, playerDao.combat_power, msg.getTeamId()});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamAgreeInvite_11621(AllianceMsg.C2S_TeamAgreeInvite_11621 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqAgreeInvite", new Object[]{this.player, msg.getTeamId(), msg.getIsAgree()});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamExit_11623(AllianceMsg.C2S_TeamExit_11623 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqExitTeam", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamKickOut_11625(AllianceMsg.C2S_TeamKickOut_11625 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqKickOut", new Object[]{this.player, msg.getPlayerId()});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamSign_11627(AllianceMsg.C2S_TeamSign_11627 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqSign", new Object[]{this.player, msg.getIsCancel()});
      }
   }

   @MsgHandlerAnno
   public void C2S_AllianceRank_11629(AllianceMsg.C2S_AllianceRank_11629 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         int teamId = (Integer)MapUtil.getOrDefault(this.allianceMgr.playerTeamMap, this.player.getPlayerId(), 0);
         this.allianceMgr.requestRank(this.player.getPlayerId(), teamId);
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamChallengeList_11631(AllianceMsg.C2S_TeamChallengeList_11631 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqChallengeList", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInfo_11633(AllianceMsg.C2S_TeamInfo_11633 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqTeamInfo", new Object[]{this.player, msg.getTeamId()});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamArrayingSave_11635(AllianceMsg.C2S_TeamArrayingSave_11635 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqSaveArraying", new Object[]{this.player, msg.getPlayerListList()});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInviteClear_11637(AllianceMsg.C2S_TeamInviteClear_11637 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqClearInvite", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamApplyClear_11639(AllianceMsg.C2S_TeamApplyClear_11639 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqClearApplyList", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_ChallengeCountRecover_11641(AllianceMsg.C2S_ChallengeCountRecover_11641 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqChallengeCountRecover", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_ChallengeReward_11643(AllianceMsg.C2S_ChallengeReward_11643 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqChallengeReward", new Object[]{this.player, msg.getRewardId()});
      }
   }

   @TaskMethod
   public void alliancePartChallengeReward(TeamBattleVsRewardModel teamBattleVsRewardModel) {
      this.player.addResource(teamBattleVsRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 51, 5101, teamBattleVsRewardModel.getId(), 0, "");
      AllianceMsg.S2C_ChallengeReward_11644.Builder resp = AllianceMsg.S2C_ChallengeReward_11644.newBuilder();
      resp.setRewardId(teamBattleVsRewardModel.getId());
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void CR2S_TeamChallenge_11811(CrossAllianceMsg.CR2S_TeamChallenge_11811 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      BattleDao battleDao = (BattleDao)battlePart.getBattleDaoMap().get(2030);
      if (battleDao == null) {
         this.logger.error("玩家{}接收合纵连横跨服战斗返回,战斗数据不存在", this.player.getPlayerId());
         battlePart.sendBattleResult(2030, true, 44);
      } else if (msg.getResult() != 1) {
         battlePart.sendBattleResult(2030, true, msg.getResult());
      } else {
         this.fighting(battleDao, msg.getBattleMsg());
         if (battleDao.isSkip || msg.getBattleMsg().getWave() <= 1) {
            this.player.triggerTask(362, 0, 1L, 1);
            battleDao.status = 0;
            battleDao.updateOp();
            this.allianceMgr.pushTaskEx("allianceRespChallengeReturn", new Object[]{this.player, msg.getTeamId(), msg.getIntegral(), msg.getRank(), msg.getRecordInfo()});
            this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "合纵连横", "1");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ChallengeRecords_11645(AllianceMsg.C2S_ChallengeRecords_11645 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         this.allianceMgr.pushTaskEx("allianceReqChallengeRecords", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_AutoJoinInfo_11657(AllianceMsg.C2S_AutoJoinInfo_11657 msg, String source) {
      if (this.player.isSystemOpen(2030)) {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         long autoJoin = (Long)playerResetCustomCache.getForeverNum(14, 0L);
         Set<Integer> powerLimitSet = this.autoJoinPowerLimit();
         powerLimitSet.add(MiscUtil.getLowParam(autoJoin));
         AllianceMsg.S2C_AutoJoinInfo_11658.Builder resp = AllianceMsg.S2C_AutoJoinInfo_11658.newBuilder();
         resp.setAutoJoin(MiscUtil.getHiParam(autoJoin) > 0);
         resp.setAutoJoinPower(MiscUtil.getLowParam(autoJoin));
         resp.addAllPowerScope(powerLimitSet);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_AutoJoinSetting_11659(AllianceMsg.C2S_AutoJoinSetting_11659 msg, String source) {
      if (!this.player.isSystemOpen(2030)) {
         this.player.failure(21);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         long autoJoin = (Long)playerResetCustomCache.getForeverNum(14, 0L);
         Set<Integer> powerLimitSet = this.autoJoinPowerLimit();
         powerLimitSet.add(MiscUtil.getLowParam(autoJoin));
         if (!powerLimitSet.contains(msg.getAutoJoinPower())) {
            this.player.failure(6);
         } else {
            playerResetCustomCache.setForever(14, MiscUtil.comboInteger(msg.getAutoJoin() ? 1 : 0, msg.getAutoJoinPower()));
            AllianceMsg.S2C_AutoJoinSetting_11660.Builder resp = AllianceMsg.S2C_AutoJoinSetting_11660.newBuilder();
            resp.setAutoJoin(msg.getAutoJoin());
            resp.setAutoJoinPower(msg.getAutoJoinPower());
            this.player.sendMsg(resp.build());
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_TeamInfo_11815(CrossAllianceMsg.CR2S_TeamInfo_11815 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.allianceMgr.pushTaskEx("allianceRespCrossTeamInfo", new Object[]{this.player, msg});
   }

   private void fighting(BattleDao battleDao, BattleMsg.S2C_BattleResult_6102 battleResult) {
      battleDao.stream = battleResult.toByteArray();
      battleDao.scene = new BattleScene(battleResult);
      battleDao.totalTime += (long)battleDao.scene.getCostTime();
      battleDao.scene.getBattleMsg().setIsSkip(battleDao.isSkip);
      this.player.sendMsg(battleDao.scene.getBattleMsg().build());
      if (battleDao.isSkip) {
         this.logger.info("战斗-->{}跳过【合纵连横】战斗,我方【{}】VS敌方【{}】", new Object[]{battleDao.playerId, battleResult.getTeams(0).getBeloogName(), battleResult.getTeams(1).getBeloogName()});
      } else {
         this.logger.info("战斗-->{}进入【合纵连横】第{}波战斗,我方【{}】VS敌方【{}】", new Object[]{battleDao.playerId, battleResult.getWave(), battleResult.getTeams(0).getBeloogName(), battleResult.getTeams(1).getBeloogName()});
      }

      battleDao.updateOp();
   }

   public int enterBattle(BattleDao battleDao) {
      if (battleDao.params.isEmpty()) {
         return 6;
      } else {
         this.allianceMgr.pushTaskEx("allianceReqEnterBattle", new Object[]{this.player, battleDao.params.get(0), battleDao.isSkip});
         return 1;
      }
   }

   public void nextBattle(BattleDao battleDao) {
      this.allianceMgr.pushTaskEx("allianceReqNextBattle", new Object[]{this.player, battleDao});
   }

   public void endBattle() {
      this.allianceMgr.pushTaskEx("allianceReqOverBattle", new Object[]{this.player.getPlayerId()});
   }

   @TaskMethod
   public void checkInvite(AllianceTeamDao allianceTeamDao) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      long autoJoin = (Long)playerResetCustomCache.getForeverNum(14, 0L);
      if (MiscUtil.getHiParam(autoJoin) > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         GamePlayer captainPlayer = worldMgr.getPlayerById(allianceTeamDao.captain);
         if (captainPlayer == null) {
            return;
         }

         if (captainPlayer.getMaxPlayerCombatPower() < (long)MiscUtil.getLowParam(autoJoin) * 10000L) {
            this.allianceMgr.pushTaskEx("invite", new Object[]{this.player, allianceTeamDao});
         } else {
            this.allianceMgr.pushTaskEx("joinTeam", new Object[]{this.player, allianceTeamDao});
         }
      } else {
         this.allianceMgr.pushTaskEx("invite", new Object[]{this.player, allianceTeamDao});
      }

   }

   private Set<Integer> autoJoinPowerLimit() {
      Set<Integer> powerLimitSet = new HashSet();
      powerLimitSet.add(0);
      List<Integer> powerConfigList = this.configManager.getIntList("autoJoin");
      long historyPower = this.player.getMaxPlayerCombatPower();
      int powerRadix = (int)(historyPower / 1000000L);
      powerLimitSet.add(powerRadix * 100);

      for(int powerConfig : powerConfigList) {
         int powerLimitMin = powerRadix - powerConfig;
         if (powerLimitMin > 0) {
            powerLimitSet.add(powerLimitMin * 100);
         }

         int powerLimitMax = powerRadix + powerConfig;
         if (powerLimitMax > 0) {
            powerLimitSet.add(powerLimitMax * 100);
         }
      }

      return powerLimitSet;
   }
}
