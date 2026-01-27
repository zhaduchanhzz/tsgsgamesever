package com.gzbz.megerWar.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.MergeWarInfoDao;
import com.gzbz.db.MergeWarPlayerDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.megerWar.CoreWarMgr;
import com.gzbz.model.BattleModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MergeWarBossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.MergeWarBossTaskPart;
import com.gzbz.task.MergeWarGameTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MergeWarBossPart extends PlayerPart {
   @Autowired
   private ConfigManager configManager;
   @Autowired
   RankMgr rankMgr;
   private final CoreWarMgr coreWarMgr;

   public MergeWarBossPart(CoreWarMgr coreWarMgr) {
      this.coreWarMgr = coreWarMgr;
   }

   public MergeWarPlayerDao getMergeWarPlayerDao() {
      return (MergeWarPlayerDao)this.player.getData("tb_merge_war_player", this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_BossInfo_19401(MergeWarBossMsg.C2S_BossInfo_19401 msg, String source) {
      MergeWarBossTaskPart mergeWarBossTaskPart = (MergeWarBossTaskPart)this.player.getMgrPart(MergeWarBossTaskPart.class);
      mergeWarBossTaskPart.trigger();
      this.sendBossInfo();
   }

   @MsgHandlerAnno
   public void C2S_BuyFightNum_19403(MergeWarBossMsg.C2S_BuyFightNum_19403 msg, String source) {
      if (this.isJoining()) {
         int code = this.buyFightNum();
         if (code != 1) {
            this.player.failure(code);
         } else {
            this.sendBuyNum();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Enter_19413(MergeWarBossMsg.C2S_Enter_19413 msg, String source) {
      boolean leave = msg.getLeave();
      this.coreWarMgr.pushTask(() -> this.coreWarMgr.enterBossGame(this.player, leave));
      if (!leave) {
         this.swichArraying();
      }

   }

   @MsgHandlerAnno
   public void C2S_EntranceInfo_19423(MergeWarBossMsg.C2S_EntranceInfo_19423 msg, String source) {
      this.sendEntranceInfo();
   }

   @MsgHandlerAnno
   public void C2S_QuickFight_19425(MergeWarBossMsg.C2S_QuickFight_19425 msg, String source) {
      this.quickFight();
   }

   public void swichArraying() {
      ArrayingMirror heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_1);
      if (heroArrayingData == null || heroArrayingData.arrayingElementsMap.isEmpty()) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_1, CommonMsg.HeroState.HERO_STATE_DUEL_1);
         heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_2, CommonMsg.HeroState.HERO_STATE_DUEL_2);
         heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_3, CommonMsg.HeroState.HERO_STATE_DUEL_3);
      }

   }

   public void sendBossInfo() {
      MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
      MergeWarBossMsg.S2C_BossInfo_19402.Builder builder = MergeWarBossMsg.S2C_BossInfo_19402.newBuilder();
      builder.setFigth(mergeWarPlayerDao.figth);
      builder.setBuy(mergeWarPlayerDao.buy);
      builder.setTotalFight(mergeWarPlayerDao.totalFight);
      this.player.sendMsg(builder.build());
   }

   public int buyFightNum() {
      List<Integer> costList = this.configManager.getIntList("HefuChallageBuyTime");
      MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
      if (mergeWarPlayerDao.buy >= costList.size()) {
         return 76070;
      } else {
         ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, (Integer)costList.get(mergeWarPlayerDao.buy));
         if (!this.player.checkResourceNum(needResource)) {
            return 31;
         } else {
            this.player.delResource(needResource, 94, 9401, 0, 0, "");
            ++mergeWarPlayerDao.buy;
            mergeWarPlayerDao.updateOp();
            return 1;
         }
      }
   }

   public void sendBuyNum() {
      MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
      MergeWarBossMsg.S2C_BuyFightNum_19404.Builder builder = MergeWarBossMsg.S2C_BuyFightNum_19404.newBuilder();
      builder.setBuy(mergeWarPlayerDao.buy);
      this.player.sendMsg(builder.build());
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.isJoining()) {
         return 21;
      } else {
         int curWave = battleDao.scene.getWave();
         battleDao.scene = new BattleScene(battleDao.type, battleDao.modelId);
         if (curWave == 0 && this.coreWarMgr.getSubState() != 3) {
            return 76051;
         } else {
            MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
            if (curWave == 0) {
               mergeWarPlayerDao.lastDamage = 0L;
               mergeWarPlayerDao.updateOp();
            }

            int freeNum = ApplicationContextProvider.getConfigInt("HefuChallageTime", 3);
            if (curWave == 0 && mergeWarPlayerDao.figth >= freeNum + mergeWarPlayerDao.buy) {
               return 76068;
            } else if (!this.checkArraying()) {
               return 76069;
            } else {
               int battleId = this.configManager.getInt("HefuBossId");
               BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
               if (battleModel == null) {
                  return 6;
               } else {
                  ArrayingMirror arrayingMirror = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(4207)).get(curWave));
                  PlayerDao playerDao = this.player.getPlayerDao();
                  BattlePKTeam leftTeam = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, (Map)null);
                  BattlePKTeam rightTeam = new BattlePKTeam(battleId);
                  battleDao.scene.addPKTeam(leftTeam, rightTeam);
                  battleDao.scene.setBattleId(battleId);
                  battleDao.scene.setWave((short)(curWave + 1), (short)3);
                  battleDao.scene.setMaxRound((byte)ApplicationContextProvider.getConfigInt("MergeWarBossBattleWave", 17));
                  return 1;
               }
            }
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      int curWave = battleDao.scene.getBattleMsg().getWave();
      battleDao.scene.getBattleMsg().setIsNextWave(curWave > 1);
      MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
      long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
      mergeWarPlayerDao.lastDamage += damage;
      int chDamage = Math.min(Integer.MAX_VALUE, (int)(damage / 1000L));
      this.player.triggerTask(673, 0, (long)chDamage, 1);
      BattleMsg.S2C_Battle_Result.Builder resultMsg = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      List<ResourceModel> resourceModelList = new ArrayList();
      if (curWave == 1) {
         ++mergeWarPlayerDao.figth;
         ++mergeWarPlayerDao.totalFight;
         this.sendBossInfo();
         this.player.triggerTask(674, 0, 1L, 1);
      } else if (curWave == battleDao.scene.getTotalWave()) {
         PlayerPublicDao publicDao = this.player.getPublicDao();
         long oriScore = this.rankMgr.getScore(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, publicDao.unionId);
         this.coreWarMgr.pushTask(() -> this.coreWarMgr.recordBossDamage(this.player.getPlayerId(), publicDao.unionId, mergeWarPlayerDao.lastDamage));
         battleDao.status = 0;
         battleDao.scene.getBattleMsg().setIsEnd(true);
         resultMsg.addSettleInfo(mergeWarPlayerDao.lastDamage);
         resultMsg.addSettleInfo(oriScore + mergeWarPlayerDao.lastDamage);

         for(ResourceModel resourceModel : this.configManager.getResourceModelList("hefuBattleReward1", "2|1003|1,2|1001|200")) {
            resourceModel.addResourceToList(resourceModelList);
         }
      }

      mergeWarPlayerDao.updateOp();
      battleDao.updateOp();
      if (resourceModelList.size() > 0) {
         for(ResourceModel resourceModel : resourceModelList) {
            resultMsg.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(resourceModel.getType()).setId(resourceModel.getId()).setNum(resourceModel.getValue()));
         }

         battleDao.rewards.addAll(resourceModelList);
      }

      resultMsg.setResult(0);
      battleDao.scene.getBattleMsg().setResult(resultMsg);
   }

   public void endBattle(BattleDao battleDao) {
      this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 94, 9402, 0, 0, "");
   }

   protected boolean checkArraying() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      boolean isHaveArraying_1 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_1);
      boolean isHaveArraying_2 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_2);
      boolean isHaveArraying_3 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_3);
      return isHaveArraying_1 && isHaveArraying_2 && isHaveArraying_3;
   }

   public boolean isJoining() {
      if (this.player.getPublicDao().unionId <= 0) {
         this.player.failure(23);
         return false;
      } else {
         MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
         if (mergeWarInfoDao.isOpening && mergeWarInfoDao.stage == 1) {
            return true;
         } else {
            this.player.failure(76050);
            return false;
         }
      }
   }

   public void loginHandle() {
      this.sendEntranceInfo();
      this.checkOverdue();
      MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      if (curTime <= mergeWarInfoDao.endTime) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerExtend.mergewarGameEndTime = mergeWarInfoDao.endTime;
         this.player.updatePlayerExtend(13);
         if (curTime >= mergeWarInfoDao.firstOpenTime && curTime < mergeWarInfoDao.secondOpenTime) {
            MergeWarBossTaskPart taskPart = (MergeWarBossTaskPart)this.player.getMgrPart(MergeWarBossTaskPart.class);
            taskPart.trigger();
         }

         if (this.coreWarMgr.getSubState() != 0) {
            this.coreWarMgr.pushTask(() -> this.coreWarMgr.loginHandle(this.player));
         }

      }
   }

   public void resetDaily() {
      this.sendEntranceInfo();
      this.checkOverdue();
      MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening) {
         MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerExtend.mergewarGameEndTime = mergeWarInfoDao.endTime;
         this.player.updatePlayerExtend(13);
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (curTime >= mergeWarInfoDao.firstOpenTime && curTime < mergeWarInfoDao.secondOpenTime) {
            mergeWarPlayerDao.figth = 0;
            mergeWarPlayerDao.buy = 0;
            mergeWarPlayerDao.updateOp();
            MergeWarBossTaskPart taskPart = (MergeWarBossTaskPart)this.player.getMgrPart(MergeWarBossTaskPart.class);
            taskPart.trigger();
            this.sendBossInfo();
         }

      }
   }

   public void checkOverdue() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.mergewarGameEndTime > 0) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
         if (curTime >= playerExtend.mergewarGameEndTime || playerExtend.mergewarGameEndTime < mergeWarInfoDao.endTime) {
            playerExtend.mergewarGameEndTime = 0;
            this.player.updatePlayerExtend(13);
            MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
            mergeWarPlayerDao.reset();
            MergeWarBossTaskPart mergeWarBossTaskPart = (MergeWarBossTaskPart)this.player.getMgrPart(MergeWarBossTaskPart.class);
            mergeWarBossTaskPart.deleteTask();
            MergeWarGameTaskPart mergeWarGameTaskPart = (MergeWarGameTaskPart)this.player.getMgrPart(MergeWarGameTaskPart.class);
            mergeWarGameTaskPart.deleteTask();
            this.removeArraying();
         }

      }
   }

   public void removeArraying() {
      List<CommonMsg.HeroState> arrayingList = new ArrayList();
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_1);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_2);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_MERGE_WAR_BOSS_3);
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      heroArrayingPart.removeArraying(arrayingList);
   }

   private void sendEntranceInfo() {
      MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
      MergeWarBossMsg.S2C_EntranceInfo_19424.Builder builder = MergeWarBossMsg.S2C_EntranceInfo_19424.newBuilder();
      builder.setOpenEntrance(mergeWarInfoDao.openEntrance);
      this.player.sendMsg(builder.build());
   }

   public void quickFight() {
      if (!this.isJoining()) {
         this.player.failure(21);
      } else if (!this.checkArraying()) {
         this.player.failure(76069);
      } else {
         MergeWarInfoDao mergeWarInfoDao = this.coreWarMgr.getMergeWarInfoDao();
         if (mergeWarInfoDao.isOpening && this.coreWarMgr.getSubState() == 3) {
            MergeWarPlayerDao mergeWarPlayerDao = this.getMergeWarPlayerDao();
            int freeNum = ApplicationContextProvider.getConfigInt("HefuChallageTime", 3);
            if (mergeWarPlayerDao.figth >= freeNum + mergeWarPlayerDao.buy && this.buyFightNum() != 1) {
               this.player.failure(76068);
            } else {
               int battleId = this.configManager.getInt("HefuBossId");
               BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
               if (battleModel == null) {
                  this.player.failure(6);
               } else {
                  ++mergeWarPlayerDao.figth;
                  ++mergeWarPlayerDao.totalFight;
                  mergeWarPlayerDao.updateOp();
                  BattleMsg.S2C_BattleResult_6102.Builder battleMsg = null;
                  long totalDamage = 0L;

                  for(CommonMsg.HeroState heroState : (List)HeroArrayingPart.MULTIPLE_ARRAYING.get(4207)) {
                     ArrayingMirror arrayingMirror = this.player.getPlayerArraying(heroState);
                     PlayerDao playerDao = this.player.getPlayerDao();
                     BattlePKTeam leftTeam = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, (Map)null);
                     BattlePKTeam rightTeam = new BattlePKTeam(battleId);
                     BattleScene battleScene = new BattleScene(4207, battleId);
                     battleScene.addPKTeam(leftTeam, rightTeam);
                     battleScene.fight((byte)ApplicationContextProvider.getConfigInt("MergeWarBossBattleWave", 17));
                     long damage = battleScene.getPKTeam((byte)1).getDamageValue();
                     totalDamage += damage;
                     this.logger.info("战斗造成的伤害 totalDamage:{} damage:{}", totalDamage, damage);
                     BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
                     battleMsg = battleScene.getBattleMsg();
                     BattleMsg.S2C_Battle_Result.Builder resultMsg = battleMsg.getResult().toBuilder();
                     resultMsg.setResult(0);
                     battleMsg.setResult(resultMsg);
                     battleRecordMgr.addBattleRecord(4207, battleId, this.player.getPlayerId(), 0, battleMsg);
                  }

                  this.player.triggerTask(674, 0, 1L, 1);
                  int chDamage = Math.min(Integer.MAX_VALUE, (int)(totalDamage / 1000L));
                  this.player.triggerTask(673, 0, (long)chDamage, 1);
                  PlayerPublicDao publicDao = this.player.getPublicDao();
                  long oriScore = this.rankMgr.getScore(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, publicDao.unionId);
                  this.coreWarMgr.pushTask(() -> this.coreWarMgr.recordBossDamage(this.player.getPlayerId(), publicDao.unionId, totalDamage));
                  List<ResourceModel> resourceModelList = new ArrayList();

                  for(ResourceModel resourceModel : this.configManager.getResourceModelList("hefuBattleReward1", "2|1003|1,2|1001|200")) {
                     resourceModel.addResourceToList(resourceModelList);
                  }

                  if (resourceModelList.size() > 0) {
                     this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 94, 9409, 0, 0, "");
                  }

                  if (battleMsg != null) {
                     BattleMsg.S2C_Battle_Result.Builder resultMsg = battleMsg.getResult().toBuilder();
                     resultMsg.addSettleInfo(totalDamage);
                     resultMsg.addSettleInfo(oriScore + totalDamage);

                     for(ResourceModel resourceModel : resourceModelList) {
                        resultMsg.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(resourceModel.getType()).setId(resourceModel.getId()).setNum(resourceModel.getValue()));
                     }

                     resultMsg.setResult(0);
                     battleMsg.setIsSkip(true);
                     battleMsg.setResult(resultMsg);
                     this.player.sendMsg(battleMsg.build());
                  }

                  this.sendBossInfo();
               }
            }
         } else {
            this.player.failure(76051);
         }
      }
   }

   public void gmTest(String string) {
      String[] arr = string.split(",");
      switch (arr[0].toLowerCase()) {
         case "removearraying":
            this.removeArraying();
            break;
         case "quickfight":
            this.quickFight();
      }

   }
}
