package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.common.base.Splitter;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.mini.MiniProgramPart;
import com.gzbz.model.BattleModel;
import com.gzbz.model.BattleTowerExtraRewardModel;
import com.gzbz.model.BattleTowerModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.model.manager.WarOrderBaseModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.BattleTowerMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.share.part.SVipPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.warOrder.inf.WarOrderInf;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BattleTowerPart extends PlayerPart implements WarOrderInf {
   @Autowired
   ConfigManager configManager;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   ActivityMgr activityMgr;
   protected Map<Integer, Long> powerMap = new HashMap();
   public static final String TOWER_COPY_FREE_TIMES = "towerCopyFreeTimes";
   public static final String TOWER_COPY_WIPE_OUT_TIMES_COST = "towerCopyWipeOutTimesCost";
   private static final int REWARD_TYPE_1 = 1;
   private static final int REWARD_TYPE_2 = 2;
   private static final int REWARD_TYPE_3 = 3;

   @MsgHandlerAnno
   public void towerInfo(BattleTowerMsg.C2S_GetTowerInfo_7401 msg, String channelId) {
      if (this.player.isSystemOpen(1130)) {
         this.sendTowerInfo();
      }
   }

   @MsgHandlerAnno
   public void enterTower(BattleTowerMsg.C2S_EnterTower_7403 msg, String channelId) {
      if (!this.player.isSystemOpen(1130)) {
         this.player.failure(21);
      } else {
         int towerId = msg.getTowerId();
         boolean sweep = msg.getSweep();
         if (!sweep) {
            this.logger.info("这里是扫荡，挑战走同一战斗接口");
         } else {
            BattleTowerModel towerModel = (BattleTowerModel)this.player.getGameModelPool().getEntity("battleTower", towerId);
            if (towerModel == null) {
               this.player.failure(6);
            } else {
               BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
               ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
               String strCosts = configManager.getStr("towerCopyWipeOutTimesCost");
               List<String> costList = Splitter.on("|").splitToList(strCosts);
               int freeTimes = configManager.getInt("towerCopyFreeTimes");
               int rest = freeTimes + towerDao.buyTimes - towerDao.sweepCount;
               if (towerId > towerDao.towerId) {
                  this.player.failure(5018);
               } else {
                  int sweepCost = 0;
                  if (rest <= 0) {
                     if (towerDao.buyTimes >= costList.size()) {
                        this.player.failure(5022);
                        return;
                     }

                     int cost = Integer.parseInt((String)costList.get(towerDao.buyTimes));
                     if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
                        this.player.failure(5023);
                        return;
                     }

                     this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 5, 513, towerId, towerDao.sweepCount + 1, String.valueOf(this.player.getPlayerId()));
                     ++towerDao.buyTimes;
                     sweepCost = cost;
                  }

                  ++towerDao.sweepCount;
                  towerDao.updateOp();
                  this.player.addResource(towerModel.getPassRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 513, towerId, towerDao.sweepCount + 1, String.valueOf(this.player.getPlayerId()));
                  this.sendTowerInfo();
                  this.player.triggerTask(106, 0, 1L, 1);
                  this.player.getOperationMgr().addExtraLog(this.player, 139, towerId + "", sweepCost + "", towerDao.sweepCount + "");
                  GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                  guanJiaPart.checkState(1130, (List)null);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void getTowerExtraReward(BattleTowerMsg.C2S_GetTowerReward_7405 msg, String channelId) {
      int id = msg.getId();
      BattleTowerExtraRewardModel model = (BattleTowerExtraRewardModel)this.player.getGameModelPool().getEntity("battleTowerExtraReward", id);
      if (model == null) {
         this.player.failure(6);
      } else {
         BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         if (towerDao.hadRewards.contains(model.getId())) {
            this.player.failure(5021);
         } else if (model.getTowerId() > towerDao.towerId) {
            this.player.failure(5019);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            if (model.getType() == 2) {
               if (playerDao.tongtian_order <= 0) {
                  this.player.failure(22002);
                  return;
               }
            } else if (model.getType() == 3 && playerDao.tongtian_token <= 0) {
               this.player.failure(76133);
               return;
            }

            towerDao.hadRewards.add(model.getId());
            towerDao.updateOp();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 514, id, model.getTowerId(), String.valueOf(this.player.getPlayerId()));
            BattleTowerMsg.S2C_GetTowerReward_7406.Builder builder = BattleTowerMsg.S2C_GetTowerReward_7406.newBuilder();
            builder.setId(id);
            this.player.sendMsg(builder.build());
            boolean showNotice = false;

            for(ResourceModel resourceModel : model.getRewards()) {
               if (resourceModel.getId() == 3008) {
                  showNotice = true;
                  break;
               }
            }

            if (showNotice) {
               PlayerPublicDao playerPublicDao = this.player.getPublicDao();
               ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
               chatMgr.pushTask(() -> {
                  LanguageModel languageModel_trialTower = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "TrialTower");
                  String format_deep = MessageFormat.format(languageModel_trialTower.getValue(), playerPublicDao.playerName, model.getTowerId());
                  chatMgr.sendSystem((byte)4, (byte)2, this.player.getPlayerId(), playerPublicDao.playerName, format_deep);
                  chatMgr.sendSystem((byte)4, (byte)5, this.player.getPlayerId(), playerPublicDao.playerName, format_deep);
               });
            }

         }
      }
   }

   @MsgHandlerAnno
   public void msgBuyTimes(BattleTowerMsg.C2S_BuyTimes_7407 msg, String channelId) {
      List<Integer> listCost = this.configManager.getIntList("towerCopyWipeOutTimesCost");
      BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
      if (towerDao.buyTimes >= listCost.size()) {
         this.player.failure(5024);
      } else {
         int cost = (Integer)listCost.get(towerDao.buyTimes);
         if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
            this.player.failure(18);
         } else {
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 5, 515, 0, 0, "");
            ++towerDao.buyTimes;
            towerDao.updateOp();
            BattleTowerMsg.S2C_BuyTimes_7408.Builder builder = BattleTowerMsg.S2C_BuyTimes_7408.newBuilder();
            builder.setBuyTimes(towerDao.buyTimes);
            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addExtraLog(this.player, 138, cost + "", towerDao.buyTimes + "");
         }
      }
   }

   @MsgHandlerAnno
   public void msgTowerReport(BattleTowerMsg.C2S_TowerReport_7409 msg, String channelId) {
      int towerId = msg.getTowerId();
      BattleTowerModel towerModel = (BattleTowerModel)ApplicationContextProvider.getModelPoolEntity("battleTower", towerId);
      if (towerModel == null) {
         this.player.failure(6);
      } else {
         BattleTowerMgr battleTowerMgr = (BattleTowerMgr)ApplicationContextProvider.getContext().getBean(BattleTowerMgr.class);
         battleTowerMgr.pushTask(() -> {
            List<BattleTowerMsg.RecordInfo> list = battleTowerMgr.getRecord(towerId, 1, this.player.getPlayerId());
            BattleTowerMsg.S2C_TowerRecord_7410.Builder builder = BattleTowerMsg.S2C_TowerRecord_7410.newBuilder();
            builder.addAllRecordInfo(list);
            BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
            long power = battleRecordMgr.getSuggestPower(1130, towerId);
            if (power <= 0L) {
               power = this.updateSuggestPower(towerId, false);
            }

            builder.setRecommendFight(power);
            this.player.sendMsg(builder.build());
         });
      }
   }

   public void sendTowerInfo() {
      BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
      BattleTowerMsg.S2C_GetTowerInfo_7402.Builder down = BattleTowerMsg.S2C_GetTowerInfo_7402.newBuilder();
      down.setTowerId(towerDao.towerId);
      down.setCount(towerDao.sweepCount);
      down.setBuyTimes(towerDao.buyTimes);
      down.addAllRewardId(towerDao.hadRewards);
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      List<RankMsg.RankData> rankList = rankPart.buildRankListDataMsg(RankDefine.RankModule.BATTLE_TOWER, 3);
      down.addAllRanks(rankList);
      this.player.sendMsg(down.build());
   }

   public void resetDaily() {
      BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
      towerDao.buyTimes = 0;
      towerDao.sweepCount = 0;
      towerDao.updateOp();
   }

   public void loginHandle() {
      this.towerInfo((BattleTowerMsg.C2S_GetTowerInfo_7401)null, (String)null);
      if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_TOWER) > 0) {
         int towerId = (int)this.rankMgr.getScore(RankDefine.RankModule.BATTLE_TOWER, this.player.getPlayerId());
         if (towerId > 0) {
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_TOWER, (long)towerId, false);
         }
      }

   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(1130)) {
         return 21;
      } else {
         BattleTowerModel towerModel = (BattleTowerModel)this.player.getGameModelPool().getEntity("battleTower", battleDao.modelId);
         if (towerModel == null) {
            return 6;
         } else {
            BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
            if (battleDao.modelId > towerDao.towerId + 1) {
               return 5019;
            } else {
               if (battleDao.modelId < towerDao.towerId) {
                  int freeTimes = this.configManager.getInt("towerCopyFreeTimes");
                  int rest = freeTimes + towerDao.buyTimes - towerDao.sweepCount;
                  if (rest <= 0) {
                     return 5004;
                  }
               }

               BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", towerModel.getBattle());
               if (battleModel == null) {
                  this.logger.info("battle表中没有配置该战斗 battleId = {}", towerModel.getBattle());
                  return 6;
               } else {
                  BattlePKTeam battlePKTeam = new BattlePKTeam(towerModel.getBattle());
                  battleDao.scene.addPKTeam((byte)1, battlePKTeam);
                  battleDao.scene.setMaxRound((byte)17);
                  return 1;
               }
            }
         }
      }
   }

   public boolean isNeedRecord(BattleDao battleDao) {
      BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
      return battleDao.modelId - 1 == towerDao.towerId && battleDao.scene.getWinForce() == 0;
   }

   public void endBattle(BattleDao battleDao) {
      boolean isWin = true;
      if (battleDao != null) {
         isWin = battleDao.scene.getWinForce() == 0;
      }

      BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
      if (isWin) {
         this.player.triggerTask(106, 0, 1L, 1);
         int towerId = battleDao.modelId;
         boolean isFirst = false;
         if (towerId - 1 == towerDao.towerId) {
            towerDao.towerId = towerId;
            isFirst = true;
            towerDao.fightTowerId = towerId;
            towerDao.updateOp();
            this.updateSuggestPower(towerId, true);
            this.rankMgr.pushTask(() -> {
               this.rankMgr.updateRankHigher(RankDefine.RankModule.BATTLE_TOWER, (long)towerId, this.player.getPlayerId());
               this.player.pushTask(this::sendTowerInfo);
               this.rankMgr.checkRankReward(this.player.getPlayerId(), 2, (long)towerId);
            });
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_TOWER) > 0) {
               rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_TOWER, (long)towerDao.towerId, false);
            }

            BattleTowerMgr battleTowerMgr = (BattleTowerMgr)ApplicationContextProvider.getContext().getBean(BattleTowerMgr.class);
            ArrayingMirror heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_BATTLE_TOWER);
            battleTowerMgr.pushTaskEx("addOneWaveRecord", new Object[]{towerId, 1, this.player, battleDao.scene.getCostTime(), heroArrayingData.power, battleDao.scene.getBattleMsg().getResult().getRecordId(), battleDao.scene.getBattleMsg().getStartTime(), 9});
            this.player.triggerTask(308, 0, (long)towerDao.towerId, 0);
            this.player.getOperationMgr().addExtraLog(this.player, 137, towerId + "", isWin + "", towerDao.towerId + "");
            FriendPart friendPart = (FriendPart)this.player.getMgrPart(FriendPart.class);
            friendPart.unlockReportByTower(towerId);
            MiniProgramPart miniProgramPart = (MiniProgramPart)this.player.getMgrPart(MiniProgramPart.class);
            miniProgramPart.checkBeInvite();
            SVipPart sVipPart = (SVipPart)this.player.getMgrPart(SVipPart.class);
            sVipPart.checkBeInvite();
         } else {
            ++towerDao.sweepCount;
            towerDao.fightTowerId = towerId;
            towerDao.updateOp();
            this.player.getOperationMgr().addExtraLog(this.player, 137, towerId + "", isWin + "", towerDao.towerId + "");
            this.sendTowerInfo();
         }

         this.takeBattleTowerReward(battleDao.modelId, isFirst);
      }

      TrailTowerPart trailTowerPart = (TrailTowerPart)this.player.getMgrPart(TrailTowerPart.class);
      trailTowerPart.trailTowerUnlockHeroArrayingHandle();
   }

   private void takeBattleTowerReward(int towerId, boolean bFirst) {
      BattleTowerModel towerModel = (BattleTowerModel)this.player.getGameModelPool().getEntity("battleTower", towerId);
      if (towerModel == null) {
         this.logger.info("没有未领取的通天塔战斗奖励 towerid={}", towerId);
      } else {
         List<ResourceModel> list = new ArrayList();
         if (bFirst) {
            list.addAll(towerModel.getFirstRewards());
         }

         list.addAll(towerModel.getPassRewards());
         this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 513, towerId, 0, "");
      }
   }

   public void afterFight(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         List<ResourceModel> rewards = new ArrayList();
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().getResult().toBuilder();
         int towerId = battleDao.modelId;
         BattleTowerModel towerModel = (BattleTowerModel)this.player.getGameModelPool().getEntity("battleTower", towerId);
         if (towerId - 1 == towerDao.towerId) {
            rewards.addAll(towerModel.getFirstRewards());
         }

         rewards.addAll(towerModel.getPassRewards());

         for(ResourceModel resourceModel : rewards) {
            result.addAwardItems(resourceModel.builder());
         }

         battleDao.scene.getBattleMsg().setResult(result);
         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(1130, (List)null);
         List<Integer> fasterWave = this.configManager.getIntList("battleTowerFasterWave");
         int roundsCount = battleDao.scene.getBattleMsg().getRoundsCount();
         if (fasterWave.size() == 3 && roundsCount <= (Integer)fasterWave.get(0) && towerId >= (Integer)fasterWave.get(1) && towerId <= (Integer)fasterWave.get(2)) {
            BattleMsg.S2C_BattleResult_6102.Builder battleMsg = battleDao.scene.getBattleMsg();
            battleMsg.setIsSkip(true);
            battleMsg.setIsServerSkip(true);
         }

      }
   }

   public long updateSuggestPower(int towerId, boolean bFormal) {
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      double ratio = this.configManager.getDouble("towerSword");
      long power = (long)((double)this.player.getMaxPlayerCombatPower() * ratio);
      battleRecordMgr.pushTaskEx("updateSuggestPower", new Object[]{1130, towerId, power, bFormal});
      return power;
   }

   public void guanJiaOperate(int systemId, int sweepCount) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      if (!this.player.isSystemOpen(1130)) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         BattleTowerModel towerModel = (BattleTowerModel)this.player.getGameModelPool().getEntity("battleTower", towerDao.towerId);
         if (towerModel == null) {
            guanJiaPart.checkState(systemId, (List)null);
         } else if (sweepCount > 0 && towerDao.sweepCount <= 0 && towerDao.buyTimes <= 0) {
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            String strCosts = configManager.getStr("towerCopyWipeOutTimesCost");
            List<String> costList = Splitter.on("|").splitToList(strCosts);
            int freeTimes = configManager.getInt("towerCopyFreeTimes");
            sweepCount = Math.min(sweepCount, freeTimes + costList.size());
            int sweepCost = 0;
            int needBuyNum = sweepCount - freeTimes;
            if (needBuyNum > 0 && needBuyNum <= costList.size()) {
               for(int i = 0; i < needBuyNum; ++i) {
                  int cost = Integer.parseInt((String)costList.get(i));
                  sweepCost += cost;
               }
            }

            if (sweepCost > 0 && !this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, sweepCost)) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               List<ResourceModel> rewardList = new ArrayList();

               for(int i = 0; i < sweepCount; ++i) {
                  rewardList.addAll(towerModel.getPassRewards());
               }

               towerDao.buyTimes += needBuyNum;
               towerDao.sweepCount += sweepCount;
               towerDao.updateOp();
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)sweepCost, 5, 513, towerDao.towerId, towerDao.sweepCount, String.valueOf(this.player.getPlayerId()));
               this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 513, towerDao.towerId, towerDao.sweepCount, String.valueOf(this.player.getPlayerId()));
               this.sendTowerInfo();
               this.player.triggerTask(106, 0, (long)sweepCount, 1);
               this.player.getOperationMgr().addExtraLog(this.player, 139, towerDao.towerId + "", sweepCost + "", towerDao.sweepCount + "");
               guanJiaPart.checkState(systemId, rewardList);
            }
         } else {
            guanJiaPart.checkState(systemId, (List)null);
         }
      }
   }

   public int system() {
      return 1130;
   }

   public String excel() {
      return "battleTowerExtraReward";
   }

   public boolean check(WarOrderBaseModel warOrderBaseModel) {
      BattleTowerExtraRewardModel model = (BattleTowerExtraRewardModel)warOrderBaseModel;
      BattleTowerDao towerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
      return model.getTowerId() <= towerDao.towerId;
   }

   public boolean isBuy(WarOrderBaseModel warOrderBaseModel) {
      BattleTowerExtraRewardModel model = (BattleTowerExtraRewardModel)warOrderBaseModel;
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> buyGifts = giftPart.getBuyGifts(27);
      PlayerDao playerDao = this.player.getPlayerDao();
      return playerDao.tongtian_token > 0 || playerDao.tongtian_order > 0 || buyGifts.containsKey(model.getStageType());
   }
}
