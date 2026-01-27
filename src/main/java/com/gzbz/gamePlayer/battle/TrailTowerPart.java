package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.TrailTowerDao;
import com.gzbz.db.TrailTowerStarDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.bean.TowerWaveData;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.BattleModel;
import com.gzbz.model.TrailTowerModel;
import com.gzbz.model.TrailTowerRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.model.manager.WarOrderBaseModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.BattleTowerMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.protobuf.TrailTowerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.warOrder.inf.WarOrderInf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.MiscUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TrailTowerPart extends PlayerPart implements WarOrderInf {
   @Autowired
   ConfigManager configManager;
   public static final String TOWER_COPY_FREE_TIMES = "trialTowerrFreeTimes";
   public static final String TOWER_COPY_WIPE_OUT_TIMES_COST = "trialTowerrPrice";
   public static final int WINNER_LAYERS = 5;
   public static final int TOWER_TRAIL_EMPEROR = 3;
   private final List<TowerWaveData> towerWaveDataList = new ArrayList();
   private final List<Entity> entityList = new ArrayList();
   private final List<Entity> friendEntityList = new ArrayList();
   private int roundSum;
   private int heroArrayState;
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   HeroRankMgr heroRankMgr;

   @MsgHandlerAnno
   public void towerInfo(TrailTowerMsg.C2S_GetTowerInfo_10401 msg, String channelId) {
      if (this.player.isSystemOpen(2130)) {
         this.sendTowerOwner();
         this.sendCondition();
         this.sendTowerInfo();
      }
   }

   public void trailTowerUnlockHeroArrayingHandle() {
      if (this.player.isSystemOpen(2130)) {
         int towerHigerAwardlock = this.configManager.getIntDefault("towerHigerAwardlock", 400);
         BattleTowerDao battleTowerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         if (battleTowerDao.towerId >= towerHigerAwardlock) {
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            HeroArrayingDao trailTowerHeroArraying = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_TRAIL_TOWER);
            if (null == trailTowerHeroArraying) {
               heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_TRAIL_TOWER, CommonMsg.HeroState.HERO_STATE_BATTLE_TOWER);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void sweepTower(TrailTowerMsg.C2S_SweapTower_10403 msg, String channelId) {
      if (!this.player.isSystemOpen(2130)) {
         this.player.failure(21);
      } else {
         int towerId = msg.getTowerId();
         TrailTowerModel towerModel = (TrailTowerModel)this.player.getGameModelPool().getEntity("trailTower", towerId);
         if (towerModel == null) {
            this.player.failure(6);
         } else {
            Map<Integer, TrailTowerStarDao> starDaoMap = this.player.<Integer, TrailTowerStarDao>getMap("tb_trail_tower_star", this.player.getPlayerId());
            TrailTowerStarDao trailTowerStarDao = (TrailTowerStarDao)starDaoMap.get(towerId);
            if (trailTowerStarDao == null) {
               this.player.failure(5018);
            } else if (trailTowerStarDao.conditionList.size() != 0) {
               TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
               List<Integer> costList = this.configManager.getIntList("trialTowerrPrice");
               int freeTimes = ApplicationContextProvider.getConfigInt("trialTowerrFreeTimes", 2);
               int rest = freeTimes + towerDao.buyTimes - towerDao.sweepCount;
               int logCost = 0;
               if (rest <= 0) {
                  if (towerDao.buyTimes >= costList.size()) {
                     this.player.failure(5022);
                     return;
                  }

                  int cost = (Integer)costList.get(towerDao.buyTimes);
                  if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
                     this.player.failure(5023);
                     return;
                  }

                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 5, 520, towerId, towerDao.sweepCount + 1, String.valueOf(this.player.getPlayerId()));
                  ++towerDao.buyTimes;
                  logCost = cost;
               }

               ++towerDao.sweepCount;
               towerDao.updateOp();
               this.player.addResource(towerModel.getPassRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 520, towerId, towerDao.sweepCount + 1, String.valueOf(this.player.getPlayerId()));
               this.sendTowerInfo();
               this.player.getOperationMgr().addExtraLog(this.player, 142, towerId + "", logCost + "", towerDao.sweepCount + "");
               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(2130, (List)null);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void getTowerExtraReward(TrailTowerMsg.C2S_GetTowerReward_10405 msg, String channelId) {
      int id = msg.getId();
      TrailTowerRewardModel model = (TrailTowerRewardModel)this.player.getGameModelPool().getEntity("trailTowerReward", id);
      if (model == null) {
         this.player.failure(6);
      } else {
         TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
         if (towerDao.hadRewards.contains(model.getId())) {
            this.player.failure(5021);
         } else if (model.getStar() > towerDao.totalStar) {
            this.logger.info("星数不足");
         } else if (model.getType() == 3 && this.player.getPlayerDao().trail_emperor <= 0) {
            this.logger.info("未有试炼帝王特权");
         } else {
            towerDao.hadRewards.add(model.getId());
            towerDao.updateOp();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 521, id, model.getStar(), String.valueOf(this.player.getPlayerId()));
            TrailTowerMsg.S2C_GetTowerReward_10406.Builder builder = TrailTowerMsg.S2C_GetTowerReward_10406.newBuilder();
            builder.setId(id);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void msgBuyTimes(TrailTowerMsg.C2S_BuyTimes_10407 msg, String channelId) {
      List<Integer> listCost = this.configManager.getIntList("trialTowerrPrice");
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      if (towerDao.buyTimes >= listCost.size()) {
         this.player.failure(5024);
      } else {
         int cost = (Integer)listCost.get(towerDao.buyTimes);
         if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
            this.player.failure(5023);
         } else {
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 5, 522, 0, 0, "");
            ++towerDao.buyTimes;
            towerDao.updateOp();
            TrailTowerMsg.S2C_BuyTimes_10408.Builder builder = TrailTowerMsg.S2C_BuyTimes_10408.newBuilder();
            builder.setBuyTimes(towerDao.buyTimes);
            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addExtraLog(this.player, 141, cost + "", towerDao.buyTimes + "");
         }
      }
   }

   @MsgHandlerAnno
   public void msgTowerReport(TrailTowerMsg.C2S_TowerReport_10409 msg, String channelId) {
      int towerId = msg.getTowerId();
      TrailTowerModel towerModel = (TrailTowerModel)ApplicationContextProvider.getModelPoolEntity("trailTower", towerId);
      if (towerModel == null) {
         this.player.failure(6);
      } else {
         BattleTowerMgr battleTowerMgr = (BattleTowerMgr)ApplicationContextProvider.getContext().getBean(BattleTowerMgr.class);
         battleTowerMgr.pushTask(() -> {
            List<BattleTowerMsg.RecordInfo> list = battleTowerMgr.getRecord(towerId, 2, this.player.getPlayerId());
            BattleTowerMsg.S2C_TowerRecord_7410.Builder builder = BattleTowerMsg.S2C_TowerRecord_7410.newBuilder();
            builder.addAllRecordInfo(list);
            BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
            long power = battleRecordMgr.getSuggestPower(2130, towerId);
            if (power <= 0L) {
               power = this.updateSuggestPower(towerId, false);
            }

            builder.setRecommendFight(power);
            this.player.sendMsg(builder.build());
         });
      }
   }

   @MsgHandlerAnno
   public boolean challengeOwner(TrailTowerMsg.C2S_ChallengeOwner_10411 msg, String channelId) {
      return true;
   }

   public void sendTowerInfo() {
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      TrailTowerMsg.S2C_GetTowerInfo_10402.Builder down = TrailTowerMsg.S2C_GetTowerInfo_10402.newBuilder();
      down.setTowerId(towerDao.towerId);
      down.setCount(towerDao.sweepCount);
      down.setBuyTimes(towerDao.buyTimes);
      down.addAllRewardId(towerDao.hadRewards);
      down.setTotalStar(towerDao.totalStar);
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      List<RankMsg.RankData> rankList = rankPart.buildRankListDataMsg(RankDefine.RankModule.TRAIL_TOWER, 3);
      down.addAllRanks(rankList);
      this.player.sendMsg(down.build());
   }

   public void sendCondition() {
      TrailTowerMsg.S2C_Condition_10416.Builder builder = TrailTowerMsg.S2C_Condition_10416.newBuilder();
      Map<Integer, TrailTowerStarDao> starDaoMap = this.player.<Integer, TrailTowerStarDao>getMap("tb_trail_tower_star", this.player.getPlayerId());

      for(Map.Entry<Integer, TrailTowerStarDao> entry : starDaoMap.entrySet()) {
         TrailTowerStarDao starDao = (TrailTowerStarDao)entry.getValue();
         TrailTowerMsg.Condition_Info.Builder conditionInfo = TrailTowerMsg.Condition_Info.newBuilder();
         conditionInfo.setTowerId(starDao.towerId);
         conditionInfo.addAllConditionId(starDao.conditionList);
         builder.addConditionInfo(conditionInfo);
      }

      this.player.sendMsg(builder.build());
   }

   public void sendCondition(int towerId) {
      Map<Integer, TrailTowerStarDao> starDaoMap = this.player.<Integer, TrailTowerStarDao>getMap("tb_trail_tower_star", this.player.getPlayerId());
      TrailTowerStarDao starDao = (TrailTowerStarDao)starDaoMap.get(towerId);
      if (starDao != null) {
         TrailTowerMsg.S2C_Condition_10416.Builder builder = TrailTowerMsg.S2C_Condition_10416.newBuilder();
         TrailTowerMsg.Condition_Info.Builder conditionInfo = TrailTowerMsg.Condition_Info.newBuilder();
         conditionInfo.setTowerId(starDao.towerId);
         conditionInfo.addAllConditionId(starDao.conditionList);
         builder.addConditionInfo(conditionInfo);
         this.player.sendMsg(builder.build());
      }

   }

   public void sendTowerOwner() {
   }

   public void resetDaily() {
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      towerDao.buyTimes = 0;
      towerDao.sweepCount = 0;
      towerDao.updateOp();
   }

   public void loginHandle() {
      this.towerInfo((TrailTowerMsg.C2S_GetTowerInfo_10401)null, (String)null);
      this.trailTowerUnlockHeroArrayingHandle();
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(2130)) {
         return 21;
      } else {
         int trialToweClock = this.configManager.getIntDefault("trialToweClock", 400);
         BattleTowerDao battleTowerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         this.clearBattleEntity();
         if (battleTowerDao.towerId < trialToweClock) {
            return 5031;
         } else {
            TrailTowerModel towerModel = (TrailTowerModel)this.player.getGameModelPool().getEntity("trailTower", battleDao.modelId);
            if (towerModel == null) {
               return 6;
            } else {
               TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
               if (battleDao.modelId > towerDao.towerId + 1) {
                  this.player.failure(5019);
                  return 5019;
               } else {
                  if (battleDao.modelId < towerDao.towerId) {
                     int freeTimes = this.configManager.getInt("trialTowerrFreeTimes");
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
                     int wave = towerModel.getWave();
                     if (wave > 1) {
                        battleDao.scene.setWave((short)1, (short)wave);
                     }

                     PlayerDao playerDao = this.player.getPlayerDao();
                     ArrayingMirror arrayingMirror;
                     if (towerModel.getWave() > 1) {
                        CommonMsg.HeroState heroState = (CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(2130)).get(0);
                        this.heroArrayState = heroState.getNumber();
                        arrayingMirror = this.player.getPlayerArraying(heroState);
                        if (arrayingMirror == null) {
                           return 4125;
                        }

                        ArrayingMirror arrayingMirror2 = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(2130)).get(1));
                        if (arrayingMirror2 == null) {
                           return 4125;
                        }

                        HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                        if (heroArrayingPart.multipleArrayingHadSameHero(2130)) {
                           return 58109;
                        }

                        battleDao.scene.setWave((short)1, (short)2);
                     } else {
                        this.heroArrayState = 30;
                        arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_TRAIL_TOWER);
                        if (arrayingMirror == null) {
                           return 4125;
                        }
                     }

                     BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
                     battleDao.scene.addPKTeam((byte)0, leftTeam);
                     BattlePKTeam battlePKTeam = new BattlePKTeam(towerModel.getBattle());
                     battleDao.scene.addPKTeam((byte)1, battlePKTeam);
                     battleDao.scene.setMaxRound((byte)17);
                     return 1;
                  }
               }
            }
         }
      }
   }

   public boolean isNeedRecord(BattleDao battleDao) {
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      return battleDao.modelId - 1 == towerDao.towerId && battleDao.scene.getWinForce() == 0;
   }

   public void afterFight(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         ArrayingMirror heroArrayingData = this.player.getPlayerArraying(CommonMsg.HeroState.forNumber(this.heroArrayState));
         TowerWaveData towerWaveData = new TowerWaveData(battleDao.scene.getBattleMsg().getResult().getRecordId(), heroArrayingData.power, battleDao.scene.getCostTime(), battleDao.scene.getBattleMsg().getStartTime(), this.heroArrayState);
         this.towerWaveDataList.add(towerWaveData);
         this.checkTowerWinner(battleDao.modelId);
         TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().getResult().toBuilder();
         int towerId = battleDao.modelId;
         TrailTowerModel towerModel = (TrailTowerModel)this.player.getGameModelPool().getEntity("trailTower", towerId);
         if (battleDao.scene.getTotalWave() > 1) {
            this.addBattleEntity(battleDao.scene.getPKTeam((byte)0));
            this.roundSum += battleDao.scene.getRound();
         }

         int curWave = battleDao.scene.getWave();
         battleDao.scene.getBattleMsg().setIsNextWave(curWave > 1);
         boolean isLastWave = curWave == 0 || curWave == battleDao.scene.getTotalWave();
         if (isLastWave && battleDao.scene.getWinForce() == 0 || battleDao.isSkip) {
            BattleTowerMgr battleTowerMgr = (BattleTowerMgr)ApplicationContextProvider.getContext().getBean(BattleTowerMgr.class);
            battleTowerMgr.pushTaskEx("addTwoWaveRecord", new Object[]{this.player, 2, battleDao.modelId, this.towerWaveDataList});
            Map<Integer, TrailTowerStarDao> starDaoMap = this.player.<Integer, TrailTowerStarDao>getMap("tb_trail_tower_star", this.player.getPlayerId());
            BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
            List<Integer> conditionList;
            if (battleDao.scene.getTotalWave() > 1) {
               conditionList = battlePart.satisfiedConditions(this.entityList, this.friendEntityList, towerModel.getCondition(), this.roundSum);
            } else {
               conditionList = battlePart.satisfiedConditions(battleDao, towerModel.getCondition());
            }

            int starNum = conditionList.size();
            if (starDaoMap.containsKey(towerId)) {
               TrailTowerStarDao starDao = (TrailTowerStarDao)starDaoMap.get(towerId);
               if (starNum > starDao.conditionList.size()) {
                  towerDao.totalStar += starNum - starDao.conditionList.size();
                  starDao.conditionList.clear();
                  starDao.conditionList.addAll(conditionList);
                  starDao.updateOp();
               }
            } else {
               TrailTowerStarDao starDao = new TrailTowerStarDao();
               starDao.init(this.player.getPlayerId(), towerId, conditionList);
               this.player.insertDao(starDao, true);
               towerDao.totalStar += starNum;
            }

            PlayerDao playerDao = this.player.getPlayerDao();
            result.setPlayerLv(playerDao.lv);
            result.setPlayerExp(playerDao.exp);
            if (towerModel.getId() - 1 == towerDao.towerId) {
               towerDao.towerId = towerId;
               this.updateSuggestPower(towerId, true);

               for(ResourceModel resourceModel : towerModel.getFirstRewards()) {
                  resourceModel.addResourceToList(battleDao.rewards);
               }
            } else {
               ++towerDao.sweepCount;
               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(2130, (List)null);
            }

            for(ResourceModel resourceModel : towerModel.getPassRewards()) {
               resourceModel.addResourceToList(battleDao.rewards);
            }

            for(ResourceModel reward : battleDao.rewards) {
               result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(reward.getType()).setId(reward.getId()).setNum(reward.getValue()));
            }

            battleDao.status = 0;
            battleDao.scene.getBattleMsg().setIsEnd(true);
            battleDao.scene.getBattleMsg().addExParams(towerModel.getId());
            battleDao.scene.getBattleMsg().addAllExParams(conditionList);
            battleDao.scene.getBattleMsg().setResult(result);
            towerDao.fightTowerId = towerId;
            towerDao.updateOp();
            boolean isWin = battleDao.scene.getWinForce() == 0;
            this.player.getOperationMgr().addExtraLog(this.player, 140, towerId + "", isWin + "", starNum + "", towerDao.totalStar + "", towerDao.towerId + "");
         }

      }
   }

   public void addBattleEntity(BattlePKTeam battlePKTeam) {
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      Map<Byte, Entity> entityMap = battlePKTeam.getEntityMap();
      if (entityMap != null) {
         for(Entity entity : entityMap.values()) {
            if (entity.getOriginalPos() != BattleMisc.FRIEND_POS[0]) {
               this.entityList.add(entity);
            }
         }

         Entity friendEntity = battlePKTeam.getFriendEntity();
         if (friendEntity != null && friendEntity.getOriginalPos() == BattleMisc.FRIEND_POS[0]) {
            friendEntity = null;
         }

         if (friendEntity != null) {
            this.friendEntityList.add(friendEntity);
         }

         towerDao.updateOp();
      }
   }

   public void clearBattleEntity() {
      this.towerWaveDataList.clear();
      if (!this.entityList.isEmpty() || !this.friendEntityList.isEmpty() || this.roundSum != 0) {
         this.entityList.clear();
         this.friendEntityList.clear();
         this.roundSum = 0;
      }

   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         rankMgr.pushTask(() -> {
            int towerIdAndStar = MiscUtil.comboShort((short)battleDao.modelId, (short)towerDao.totalStar);
            rankMgr.updateRankHigher(RankDefine.RankModule.TRAIL_TOWER, (long)towerIdAndStar, this.player.getPlayerId());
            this.player.pushTask(this::sendTowerInfo);
         });
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 513, battleDao.modelId, 0, "");
         this.sendCondition(battleDao.modelId);
         this.clearBattleEntity();
      }
   }

   public int nextBattle(BattleDao battleDao) {
      if (battleDao.scene.getWave() != 1) {
         return 6;
      } else if (battleDao.scene.getWinForce() != 1 && battleDao.scene.getWave() <= battleDao.scene.getTotalWave()) {
         CommonMsg.HeroState heroState = (CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(2130)).get(1);
         this.heroArrayState = heroState.getNumber();
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(heroState);
         if (arrayingMirror == null) {
            return 4125;
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
            battleDao.scene.addPKTeam((byte)0, leftTeam);
            battleDao.scene.setWave((short)2);
            TrailTowerModel towerModel = (TrailTowerModel)this.player.getGameModelPool().getEntity("trailTower", battleDao.modelId);
            battleDao.scene.setBattleId(towerModel.getBattle2());
            battleDao.scene.addPKTeam((byte)1, new BattlePKTeam(towerModel.getBattle2()));
            return 1;
         }
      } else {
         return 44;
      }
   }

   private void checkTowerWinner(int towerId) {
   }

   public long updateSuggestPower(int towerId, boolean bFormal) {
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      double ratio = this.configManager.getDouble("towerSword");
      long power = (long)((double)this.player.getMaxPlayerCombatPower() * ratio);
      battleRecordMgr.pushTaskEx("updateSuggestPower", new Object[]{2130, towerId, power, bFormal});
      return power;
   }

   public void guanJiaOperate(int systemId, int sweepCount) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      if (sweepCount > 0 && towerDao.towerId != 0 && towerDao.sweepCount <= 0) {
         int towerId = towerDao.towerId;
         TrailTowerModel towerModel = (TrailTowerModel)this.player.getGameModelPool().getEntity("trailTower", towerId);
         Map<Integer, TrailTowerStarDao> starDaoMap = this.player.<Integer, TrailTowerStarDao>getMap("tb_trail_tower_star", this.player.getPlayerId());
         TrailTowerStarDao trailTowerStarDao = (TrailTowerStarDao)starDaoMap.get(towerId);
         if (trailTowerStarDao != null && trailTowerStarDao.conditionList.size() != 0) {
            List<Integer> costList = this.configManager.getIntList("trialTowerrPrice");
            int freeTimes = ApplicationContextProvider.getConfigInt("trialTowerrFreeTimes", 2);
            if (sweepCount > freeTimes + costList.size()) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               int needCost = 0;
               if (sweepCount > freeTimes + towerDao.buyTimes) {
                  int num = sweepCount - freeTimes - towerDao.buyTimes;

                  for(int i = 0; i < num; ++i) {
                     int idx = Math.min(towerDao.buyTimes + i, costList.size() - 1);
                     needCost += (Integer)costList.get(idx);
                  }

                  if (needCost > 0 && !this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, needCost)) {
                     guanJiaPart.checkState(systemId, (List)null);
                     return;
                  }

                  towerDao.buyTimes += num;
                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)needCost, 5, 520, towerId, towerDao.sweepCount + sweepCount + sweepCount, "管家" + String.valueOf(this.player.getPlayerId()));
               }

               towerDao.sweepCount += sweepCount;
               towerDao.updateOp();
               List<ResourceModel> rewards = new ArrayList();

               for(ResourceModel reward : towerModel.getPassRewards()) {
                  rewards.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue() * sweepCount));
               }

               this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 520, towerId, towerDao.sweepCount, "管家" + String.valueOf(this.player.getPlayerId()));
               this.sendTowerInfo();
               this.player.getOperationMgr().addExtraLog(this.player, 142, towerId + "", needCost + "", towerDao.sweepCount + "");
               guanJiaPart.checkState(systemId, rewards);
            }
         } else {
            guanJiaPart.checkState(systemId, (List)null);
         }
      } else {
         guanJiaPart.checkState(systemId, (List)null);
      }
   }

   public int getTowerIdAndStar() {
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      int towerIdAndStar = MiscUtil.comboShort((short)towerDao.towerId, (short)towerDao.totalStar);
      return towerIdAndStar;
   }

   public int system() {
      return 2130;
   }

   public String excel() {
      return "trailTowerReward";
   }

   public boolean check(WarOrderBaseModel warOrderBaseModel) {
      TrailTowerRewardModel model = (TrailTowerRewardModel)warOrderBaseModel;
      TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      return model.getStar() <= towerDao.totalStar;
   }

   public boolean isBuy(WarOrderBaseModel warOrderBaseModel) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> buyGifts = giftPart.getBuyGifts(28);
      return this.player.getPlayerDao().trail_king > 0 || buyGifts.containsKey(warOrderBaseModel.getStageType());
   }
}
