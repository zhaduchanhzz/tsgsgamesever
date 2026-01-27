package com.gzbz.dragon.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.HeroDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.dragon.DragonDiscipleExtend;
import com.gzbz.dragon.DragonDiscipleMgr;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.DragonStrengthenBattleModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossDragonTeamMsg;
import com.gzbz.protobuf.DragonDiscipleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Map;
import java.util.Set;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DragonPart extends PlayerPart {
   static final Logger logger = LoggerFactory.getLogger(DragonPart.class);
   private final DragonDiscipleMgr dragonMgr;
   private final WorldMgr worldMgr;
   private final ConfigManager configManager;
   private final BattleRecordMgr battleRecordMgr;
   private final CrossNettyClient crossNettyClient;

   public DragonPart(DragonDiscipleMgr dragonMgr, WorldMgr worldMgr, ConfigManager configManager, BattleRecordMgr battleRecordMgr, CrossNettyClient crossNettyClient) {
      this.dragonMgr = dragonMgr;
      this.worldMgr = worldMgr;
      this.configManager = configManager;
      this.battleRecordMgr = battleRecordMgr;
      this.crossNettyClient = crossNettyClient;
   }

   @MsgHandlerAnno
   public void C2S_TeamHall_13401(DragonDiscipleMsg.C2S_TeamHall_13401 msg, String source) {
      DragonDiscipleMsg.C2S_TeamHall_13401.Builder builder = DragonDiscipleMsg.C2S_TeamHall_13401.newBuilder();
      builder.setInfo(this.buildDragonInfo());
      if (!this.checkCrossDragonOpen(builder.build())) {
         this.dragonMgr.pushTaskEx("C2S_TeamHall_13401", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInviteList_13403(DragonDiscipleMsg.C2S_TeamInviteList_13403 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         DragonDiscipleMsg.S2C_TeamInviteList_13404.Builder resp = DragonDiscipleMsg.S2C_TeamInviteList_13404.newBuilder();
         if (this.dragonMgr.playerInviteTeamMap.containsKey(this.player.getPlayerId())) {
            for(Integer teamId : (Set)this.dragonMgr.playerInviteTeamMap.get(this.player.getPlayerId())) {
               DragonDiscipleMsg.TeamInfo teamBuilder = this.dragonMgr.buildTeamMsg(teamId);
               if (teamBuilder != null) {
                  resp.addInviteTeamList(teamBuilder);
               }
            }
         }

         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_CreateTeam_13405(DragonDiscipleMsg.C2S_CreateTeam_13405 msg, String source) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      if (dragonDiscipleExtend.breachLv < msg.getDragonStage()) {
         this.player.failure(61021);
      } else if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_CreateTeam_13405", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_ModifyTeam_13407(DragonDiscipleMsg.C2S_ModifyTeam_13407 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_ModifyTeam_13407", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamApplyList_13409(DragonDiscipleMsg.C2S_TeamApplyList_13409 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamApplyList_13409", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInvitePlayerList_13411(DragonDiscipleMsg.C2S_TeamInvitePlayerList_13411 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamInvitePlayerList_13411", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_CaptainApplyOp_13413(DragonDiscipleMsg.C2S_CaptainApplyOp_13413 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_CaptainApplyOp_13413", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_CaptainInvite_13415(DragonDiscipleMsg.C2S_CaptainInvite_13415 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_CaptainInvite_13415", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamApply_13417(DragonDiscipleMsg.C2S_TeamApply_13417 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamApply_13417", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_AgreeInvite_13419(DragonDiscipleMsg.C2S_AgreeInvite_13419 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_AgreeInvite_13419", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamExit_13421(DragonDiscipleMsg.C2S_TeamExit_13421 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamExit_13421", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamKickOut_13423(DragonDiscipleMsg.C2S_TeamKickOut_13423 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamKickOut_13423", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_PickHero_13425(DragonDiscipleMsg.C2S_PickHero_13425 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK && heroDao.linkCode <= 0) {
            this.player.failure(76509);
         } else if (heroDao.invalidTime > 0) {
            this.player.failure(76513);
         } else {
            heroBagPart.heroBagFlushProperties(heroDao);
            HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
            if (msg.getHeroPos() >= 0 && msg.getHeroPos() <= 5) {
               DragonDiscipleMsg.C2S_PickHero_13425.Builder builder = msg.toBuilder();
               builder.setHeroMirror(ByteString.copyFrom(heroMirror.toByteArray()));
               if (!this.checkCrossDragonOpen(builder.build())) {
                  this.dragonMgr.pushTaskEx("C2S_PickHero_13425", new Object[]{this.player, builder.build(), heroMirror});
               }
            } else {
               logger.info("龙脉pick英雄位置错误:" + msg.getHeroPos());
               this.player.failure(61029);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DownHero_13427(DragonDiscipleMsg.C2S_DownHero_13427 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_DownHero_13427", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_SaveArraying_13429(DragonDiscipleMsg.C2S_SaveArraying_13429 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_SaveArraying_13429", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_ChangeHeroPos_13447(DragonDiscipleMsg.C2S_ChangeHeroPos_13447 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_ChangeHeroPos_13447", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_PlayerReady_13432(DragonDiscipleMsg.C2S_PlayerReady_13432 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_PlayerReady_13432", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamInviteClear_13437(DragonDiscipleMsg.C2S_TeamInviteClear_13437 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamInviteClear_13437", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_TeamApplyClear_13439(DragonDiscipleMsg.C2S_TeamApplyClear_13439 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_TeamApplyClear_13439", new Object[]{this.player, msg});
      }
   }

   @MsgHandlerAnno
   public void C2S_BeginBattle_13441(DragonDiscipleMsg.C2S_BeginBattle_13441 msg, String source) {
      DragonDiscipleMsg.C2S_BeginBattle_13441.Builder builder = DragonDiscipleMsg.C2S_BeginBattle_13441.newBuilder();
      builder.setInfo(this.buildDragonInfo());
      if (!this.checkCrossDragonOpen(builder.build())) {
         this.dragonMgr.pushTaskEx("C2S_BeginBattle_13441", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_MyTeamInfo_13442(DragonDiscipleMsg.C2S_MyTeamInfo_13442 msg, String source) {
      boolean loginSend = false;
      if (msg.hasLoginSend() && msg.getLoginSend()) {
         loginSend = true;
      }

      DragonDiscipleMsg.C2S_MyTeamInfo_13442.Builder builder = DragonDiscipleMsg.C2S_MyTeamInfo_13442.newBuilder();
      builder.setInfo(this.buildDragonInfo());
      if (!this.checkCrossDragonOpen(builder.build())) {
         this.dragonMgr.pushTaskEx("C2S_MyTeamInfo_13442", new Object[]{this.player, loginSend});
      }
   }

   @MsgHandlerAnno
   public void C2S_SweepBattle_13445(DragonDiscipleMsg.C2S_SweepBattle_13445 msg, String source) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      int battleNum = this.configManager.getIntDefault("drangonBattleTime", 5);
      if (dragonDiscipleExtend.battleNum >= battleNum) {
         this.player.failure(61049);
      } else {
         int dragonStage = 0;
         if (dragonDiscipleExtend.passed) {
            dragonStage = dragonDiscipleExtend.breachLv;
         } else {
            dragonStage = dragonDiscipleExtend.breachLv - 1;
         }

         int realStage = 0;
         Map<Integer, DragonStrengthenBattleModel> map = this.player.getGameModelPool().getMap("dragonStrengthenBattle");

         for(DragonStrengthenBattleModel model : map.values()) {
            if (model.getStage() <= dragonStage && model.getStage() >= realStage) {
               realStage = model.getStage();
            }
         }

         if (realStage == 0) {
            this.player.failure(61050);
         } else {
            ++dragonDiscipleExtend.battleNum;
            this.player.updatePlayerExtend(65);
            this.player.addResource(((DragonStrengthenBattleModel)map.get(realStage)).getFastAtk(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 65, 6502, 0, 0, "");
            DragonDiscipleMsg.S2C_SweepBattle_13446.Builder builder = DragonDiscipleMsg.S2C_SweepBattle_13446.newBuilder();
            builder.setBattleNum(dragonDiscipleExtend.battleNum);
            this.player.sendMsg(builder.build());
            this.sendPlayerToCross(false);
         }
      }
   }

   @MsgHandlerAnno
   public void S2C_CancelReady_13444(DragonDiscipleMsg.S2C_CancelReady_13444 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("S2C_CancelReady_13444", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_WatchBattleEnd_13450(DragonDiscipleMsg.C2S_WatchBattleEnd_13450 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_WatchBattleEnd_13450", new Object[]{this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_LeaveTeamUI_13475(DragonDiscipleMsg.C2S_LeaveTeamUI_13475 msg, String source) {
      if (!this.checkCrossDragonOpen(msg)) {
         this.dragonMgr.pushTaskEx("C2S_LeaveTeamUI_13475", new Object[]{this.player});
      }
   }

   public void gmOp(int op) {
      if (op == 0) {
         DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
         dragonDiscipleExtend.battleNum = 0;
         this.player.updatePlayerExtend(65);
      } else if (op == 1 || op == 2) {
         CrossDragonTeamMsg.S2S_Gm_19109.Builder builder = CrossDragonTeamMsg.S2S_Gm_19109.newBuilder();
         builder.setState(op);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   public DragonDiscipleMsg.DragonInfo buildDragonInfo() {
      DragonDiscipleMsg.DragonInfo.Builder builder = DragonDiscipleMsg.DragonInfo.newBuilder();
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      builder.setBattleNum(dragonDiscipleExtend.battleNum);
      builder.setDragonStage(dragonDiscipleExtend.breachLv);
      builder.setPassed(dragonDiscipleExtend.passed);
      return builder.build();
   }

   public boolean checkCrossDragonOpen(GeneratedMessageV3 msg) {
      if (this.dragonMgr.openCross) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         return true;
      } else {
         return false;
      }
   }

   public void sendPlayerToCross(boolean sendArraying) {
      if (this.dragonMgr.openCross) {
         CrossDragonTeamMsg.S2S_SendDragonInfo_19103.Builder builder = CrossDragonTeamMsg.S2S_SendDragonInfo_19103.newBuilder();
         CrossDragonTeamMsg.DragonInfo.Builder info = CrossDragonTeamMsg.DragonInfo.newBuilder();
         DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
         info.setBattleNum(dragonDiscipleExtend.battleNum);
         info.setDragonStage(dragonDiscipleExtend.breachLv);
         info.setPassed(dragonDiscipleExtend.passed);
         builder.setDragonInfo(info);
         if (sendArraying) {
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            if (arrayingMirror != null) {
               byte[] bytes = arrayingMirror.toByteArray();
               builder.setArraying(ByteString.copyFrom(bytes));
            }
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void S2S_BattleSettle_19101(CrossDragonTeamMsg.S2S_BattleSettle_19101 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      if (dragonDiscipleExtend.breachLv == msg.getDragonStage() && !dragonDiscipleExtend.passed) {
         dragonDiscipleExtend.passed = true;
         this.player.updatePlayerExtend(65);
         DragonStrengthenBattleModel model = (DragonStrengthenBattleModel)this.player.getGameModelPool().getEntity("dragonStrengthenBattle", msg.getDragonStage());
         if (model != null) {
            this.player.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 65, 6503, 0, 0, "");
            this.player.pushPartTaskEx(DragonStrengthenPart.class, "addRecord", new Object[]{model.getReward(), msg.getDragonStage(), msg.getTime()});
         }

         this.player.triggerTask(542, 0, (long)dragonDiscipleExtend.breachLv, 0);
      } else {
         String awards = this.configManager.getStr("drangonBattleReward");
         String[] award = awards.split("\\|");
         this.player.addResource(Integer.parseInt(award[0]), Integer.parseInt(award[1]), Integer.parseInt(award[2]), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 65, 6503, 0, 0, "");
      }

      this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "天命挑战", "1");
   }

   @MsgHandlerAnno
   public void S2S_UpdateBattleNum_19104(CrossDragonTeamMsg.S2S_UpdateBattleNum_19104 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
      ++dragonDiscipleExtend.battleNum;
      this.player.updatePlayerExtend(65);
   }

   @MsgHandlerAnno
   public void S2S_BattleSaveRecord_19102(CrossDragonTeamMsg.S2S_BattleSaveRecord_19102 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattleMsg.S2C_BattleResult_6102.Builder fight = msg.getResult().toBuilder();
      this.battleRecordMgr.pushTaskEx("saveDragonRecord", new Object[]{fight, this.player});
   }

   public void loginHandle() {
      if (this.dragonMgr.openCross) {
         this.sendPlayerToCross(true);
      }
   }

   public void logoutHandle() {
      if (this.dragonMgr.openCross) {
         CrossDragonTeamMsg.S2S_PlayerLogout_19106.Builder builder = CrossDragonTeamMsg.S2S_PlayerLogout_19106.newBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }
}
