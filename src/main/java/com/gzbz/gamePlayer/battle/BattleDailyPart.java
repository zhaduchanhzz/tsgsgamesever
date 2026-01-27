package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDailyDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameCache.PlayerItemResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.BattleDailyModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleDailyMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.ResCountryDifUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BattleDailyPart extends PlayerPart {
   private static final String DAILY_FREE_COUNT = "dailyCopyFreeTime";
   @Autowired
   ConfigManager configManager;
   @Autowired
   private HeroRankMgr heroRankMgr;

   @MsgHandlerAnno
   public void enterDailyBattle(BattleDailyMsg.C2S_EnterDailyBattle_6601 msg, String source) {
      int battleId = msg.getBattleId();
      boolean sweep = msg.getSweep();
      GameModelPool gameModelPool = this.player.getGameModelPool();
      BattleDailyModel battleModel = (BattleDailyModel)gameModelPool.getEntity("battleDaily", battleId);
      if (battleModel == null) {
         this.player.failure(6);
      } else {
         int playerId = this.player.getPlayerId();
         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", playerId);
         if (battleModel.getLevel() > playerDao.lv) {
            this.player.failure(5000);
         } else {
            BattleDailyDao battleDailyDao = (BattleDailyDao)this.getBattleDailyMap().get(battleModel.getType());
            if (battleDailyDao == null) {
               battleDailyDao = new BattleDailyDao();
               battleDailyDao.playerId = playerId;
               battleDailyDao.battleType = battleModel.getType();
               this.player.insertDao(battleDailyDao);
            }

            int costCount = battleDailyDao.count;
            int lastPassId = battleDailyDao.lastPassId;
            int freedCount = this.configManager.getInt("dailyCopyFreeTime");
            boolean useItem = false;
            if (costCount >= freedCount) {
               int copiesMaterials = this.configManager.getIntDefault("copiesMaterials", 0);
               if (copiesMaterials > 0) {
                  int dailyNum = (Integer)this.getCache().getDailyNum(copiesMaterials, 0);
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", copiesMaterials);
                  if (itemModel != null) {
                     useItem = this.player.checkResourceNum(2, copiesMaterials, 1) && dailyNum < itemModel.getUseFuncValue();
                  }
               }

               if (!useItem) {
                  VipModel vipModel = (VipModel)gameModelPool.getEntity("vip", playerDao.vip_lv);
                  if (costCount >= freedCount + vipModel.getDailyCopyPassTimes()) {
                     this.player.failure(5004);
                     return;
                  }

                  Integer id = (Integer)battleModel.getBuyCountCost().get(1);
                  Integer type = (Integer)battleModel.getBuyCountCost().get(0);
                  int num = ResCountryDifUtils.goldAdditionForJp(type, id, (Integer)battleModel.getBuyCountCost().get(2));
                  if (!this.player.checkResourceNum(type, id, num)) {
                     this.player.failure(31);
                     return;
                  }
               }
            }

            if (!sweep) {
               if (lastPassId < battleModel.getLastHard()) {
                  this.player.failure(5002);
                  return;
               }

               BattleScene battleScene = new BattleScene(1240, battleId);
               ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
               BattlePKTeam rightTeam = new BattlePKTeam(battleModel.getBattleId());
               battleScene.addPKTeam((byte)0, leftTeam);
               battleScene.addPKTeam((byte)1, rightTeam);
               BattleMsg.S2C_BattleResult_6102.Builder fight = battleScene.fight(battleModel.getBoutCount());
               if (battleScene.getWinForce() == 0) {
                  this.dailyBattleSuccess(battleId, fight.build(), useItem);
                  this.player.triggerTask(111, 0, 1L, 1);
               } else {
                  this.player.sendMsg(fight.build());
               }
            } else {
               if (battleModel.getId() > lastPassId) {
                  this.player.failure(5002);
                  return;
               }

               this.dailyBattleSuccess(battleId, (BattleMsg.S2C_BattleResult_6102)null, useItem);
            }

            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(1240, (List)null);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BattleDailyInfo_6604(BattleDailyMsg.C2S_BattleDailyInfo_6604 msg, String channelId) {
      this.sendBattleDailyInfo();
   }

   @MsgHandlerAnno
   public void C2S_OneKeySwap_6645(BattleDailyMsg.C2S_OneKeySwap_6645 msg, String source) {
      int type = msg.getBattleType();
      Map<Integer, ConcurrentHashMap<Integer, BattleDailyModel>> battleDailyModelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, BattleDailyModel>>getModelPoolMap("customBattleDaily");
      if (!battleDailyModelMap.containsKey(type)) {
         this.player.failure(0);
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         BattleDailyDao battleDailyDao = (BattleDailyDao)this.getBattleDailyMap().get(type);
         if (battleDailyDao.lastPassId <= 0) {
            this.player.failure(5002);
         } else {
            BattleDailyModel battleDailyModel = (BattleDailyModel)((ConcurrentHashMap)battleDailyModelMap.get(type)).get(battleDailyDao.lastPassId);
            if (battleDailyModel == null) {
               this.player.failure(0);
            } else {
               int freeCount = this.configManager.getInt("dailyCopyFreeTime");
               VipModel vipModel = (VipModel)ApplicationContextProvider.getModelPoolEntity("vip", playerDao.vip_lv);
               int lessCount = freeCount + vipModel.getDailyCopyPassTimes() - battleDailyDao.count;
               if (lessCount <= 0) {
                  this.player.failure(5004);
               } else {
                  int alreadyFeeCount = battleDailyDao.count - freeCount;
                  int needFeeCount = alreadyFeeCount > 0 ? vipModel.getDailyCopyPassTimes() - alreadyFeeCount : vipModel.getDailyCopyPassTimes();
                  int num = ResCountryDifUtils.goldAdditionForJp((Integer)battleDailyModel.getBuyCountCost().get(0), (Integer)battleDailyModel.getBuyCountCost().get(1), (Integer)battleDailyModel.getBuyCountCost().get(2));
                  ResourceModel resourceModel = new ResourceModel((Integer)battleDailyModel.getBuyCountCost().get(0), (Integer)battleDailyModel.getBuyCountCost().get(1), num * needFeeCount);
                  if (!this.player.checkResourceNum(resourceModel)) {
                     this.player.failure(31);
                  } else {
                     this.player.delResource(resourceModel, 5, 524, type, battleDailyDao.lastPassId, "");
                     List<ResourceModel> rewards = new ArrayList();

                     for(int i = 0; i < lessCount; ++i) {
                        ++battleDailyDao.count;

                        for(ResourceModel rewardResource : battleDailyModel.getRewards()) {
                           rewardResource.addResourceToList(rewards);
                        }

                        int needFee = needFeeCount <= 0 ? 0 : (i + 1 > needFeeCount ? num : 0);
                        this.player.getOperationMgr().addExtraLog(this.player, 106, battleDailyModel.getName(), String.valueOf(needFee), String.valueOf(battleDailyDao.count));
                     }

                     battleDailyDao.updateOp();
                     this.player.triggerTask(111, 0, (long)lessCount, 1);
                     this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 524, type, battleDailyModel.getId(), "");
                     BattleDailyMsg.S2C_OneKeySwap_6646.Builder resp = BattleDailyMsg.S2C_OneKeySwap_6646.newBuilder();
                     resp.setInfo(this.buildBattleDailyInfo(battleDailyDao));
                     this.player.sendMsg(resp.build());
                     GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                     guanJiaPart.checkState(1240, (List)null);
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeySwapAllFree_6647(BattleDailyMsg.C2S_OneKeySwapAllFree_6647 msg, String source) {
      int freeCount = this.configManager.getInt("dailyCopyFreeTime");
      List<ResourceModel> rewards = new ArrayList();
      BattleDailyMsg.S2C_OneKeySwapAllFree_6648.Builder resp = BattleDailyMsg.S2C_OneKeySwapAllFree_6648.newBuilder();
      int totalCount = 0;

      for(BattleDailyDao battleDailyDao : this.getBattleDailyMap().values()) {
         if (battleDailyDao.count < freeCount) {
            BattleDailyModel battleDailyModel = (BattleDailyModel)ApplicationContextProvider.getModelPoolEntity("battleDaily", battleDailyDao.lastPassId);
            if (battleDailyModel == null) {
               this.logger.error("日常副本配置【{}】不存在", battleDailyDao.lastPassId);
            } else {
               int lessCount = freeCount - battleDailyDao.count;
               totalCount += lessCount;

               for(int i = 0; i < lessCount; ++i) {
                  ++battleDailyDao.count;
                  battleDailyDao.updateOp();

                  for(ResourceModel rewardResource : battleDailyModel.getRewards()) {
                     rewardResource.addResourceToList(rewards);
                  }

                  this.player.getOperationMgr().addExtraLog(this.player, 106, battleDailyModel.getName(), "0", String.valueOf(battleDailyDao.count));
               }

               resp.addInfo(this.buildBattleDailyInfo(battleDailyDao));
            }
         }
      }

      if (!rewards.isEmpty()) {
         this.player.triggerTask(111, 0, (long)totalCount, 1);
         this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 524, totalCount, 0, "");
      }

      this.player.sendMsg(resp.build());
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      guanJiaPart.checkState(1240, (List)null);
   }

   @MsgHandlerAnno
   public void C2S_OneKeySwapAll_6649(BattleDailyMsg.C2S_OneKeySwapAll_6649 msg, String source) {
      Map<Integer, ConcurrentHashMap<Integer, BattleDailyModel>> battleDailyModelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, BattleDailyModel>>getModelPoolMap("customBattleDaily");
      List<ResourceModel> delResourceModels = new ArrayList();
      List<ResourceModel> addResourceModels = new ArrayList();
      Map<Integer, Integer> battleDailyLessCount = new HashMap();
      Map<Integer, Integer> battleDailyFee = new HashMap();
      Map<Integer, BattleDailyDao> battleDailyDaoMap = this.getBattleDailyMap();
      this.swapAll(battleDailyLessCount, battleDailyFee, delResourceModels, addResourceModels, new ArrayList(battleDailyDaoMap.keySet()), true);
      if (!this.player.checkResourceNum(delResourceModels)) {
         this.player.failure(31);
      } else {
         this.player.delResource((List)delResourceModels, 5, 525, 0, 0, "");
         BattleDailyMsg.S2C_OneKeySwapAll_6650.Builder resp = BattleDailyMsg.S2C_OneKeySwapAll_6650.newBuilder();
         int allLessCount = 0;

         for(Map.Entry<Integer, Integer> entry : battleDailyLessCount.entrySet()) {
            allLessCount += (Integer)entry.getValue();
            BattleDailyDao battleDailyDao = (BattleDailyDao)battleDailyDaoMap.get(entry.getKey());
            battleDailyDao.count += (Integer)entry.getValue();
            battleDailyDao.updateOp();
            resp.addInfo(this.buildBattleDailyInfo(battleDailyDao));
            BattleDailyModel battleDailyModel = (BattleDailyModel)((ConcurrentHashMap)battleDailyModelMap.get(battleDailyDao.battleType)).get(battleDailyDao.lastPassId);
            this.player.getOperationMgr().addExtraLog(this.player, 106, battleDailyModel.getName(), String.valueOf(MapUtil.getOrDefault(battleDailyFee, battleDailyDao.battleType, 0)), String.valueOf(battleDailyDao.count));
         }

         this.player.triggerTask(111, 0, (long)allLessCount, 1);
         this.player.addResource(addResourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 525, 0, 0, "");
         this.player.sendMsg(resp.build());
         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(1240, (List)null);
      }
   }

   private void swapAll(Map<Integer, Integer> battleDailyLessCount, Map<Integer, Integer> battleDailyFee, List<ResourceModel> delResourceModels, List<ResourceModel> addResourceModels, List<Integer> typeList, boolean isAll) {
      Map<Integer, ConcurrentHashMap<Integer, BattleDailyModel>> battleDailyModelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, BattleDailyModel>>getModelPoolMap("customBattleDaily");
      int freeCount = this.configManager.getInt("dailyCopyFreeTime");
      PlayerDao playerDao = this.player.getPlayerDao();
      VipModel vipModel = (VipModel)ApplicationContextProvider.getModelPoolEntity("vip", playerDao.vip_lv);
      if (vipModel == null) {
         this.player.failure(0);
      } else {
         Map<Integer, BattleDailyDao> battleDailyDaoMap = this.getBattleDailyMap();
         float discount = isAll ? ApplicationContextProvider.getConfigFloat("dailyCopyDiscount", 1.0F) : 1.0F;
         Iterator var13 = typeList.iterator();

         while(true) {
            BattleDailyDao battleDailyDao;
            BattleDailyModel battleDailyModel;
            int lessCount;
            while(true) {
               if (!var13.hasNext()) {
                  return;
               }

               int type = (Integer)var13.next();
               battleDailyDao = (BattleDailyDao)battleDailyDaoMap.get(type);
               if (battleDailyDao != null && battleDailyDao.lastPassId > 0) {
                  battleDailyModel = (BattleDailyModel)((ConcurrentHashMap)battleDailyModelMap.get(battleDailyDao.battleType)).get(battleDailyDao.lastPassId);
                  if (battleDailyModel != null) {
                     lessCount = freeCount + vipModel.getDailyCopyPassTimes() - battleDailyDao.count - (Integer)MapUtil.getOrDefault(battleDailyLessCount, battleDailyDao.battleType, 0);
                     if (lessCount > 0) {
                        int alreadyFeeCount = battleDailyDao.count - freeCount;
                        int needFeeCount = alreadyFeeCount > 0 ? vipModel.getDailyCopyPassTimes() - alreadyFeeCount : vipModel.getDailyCopyPassTimes();
                        if (needFeeCount <= 0) {
                           break;
                        }

                        int gold = ResCountryDifUtils.goldAdditionForJp((Integer)battleDailyModel.getBuyCountCost().get(0), (Integer)battleDailyModel.getBuyCountCost().get(1), (Integer)battleDailyModel.getBuyCountCost().get(2));
                        ResourceModel resourceModel = new ResourceModel((Integer)battleDailyModel.getBuyCountCost().get(0), (Integer)battleDailyModel.getBuyCountCost().get(1), (int)((float)(gold * needFeeCount) * discount));
                        if (resourceModel.getValue() > 0) {
                           delResourceModels.add(resourceModel);
                           battleDailyFee.put(battleDailyDao.battleType, resourceModel.getValue());
                           break;
                        }
                     }
                  }
               }
            }

            for(ResourceModel resourceModel : battleDailyModel.getRewards()) {
               ResourceModel addResourceModel = resourceModel.clone();
               addResourceModel.setValue(addResourceModel.getValue() * lessCount);
               addResourceModel.addResourceToList(addResourceModels);
            }

            battleDailyLessCount.put(battleDailyDao.battleType, (Integer)MapUtil.getOrDefault(battleDailyLessCount, battleDailyDao.battleType, 0) + lessCount);
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      int battleId = battleDao.modelId;
      GameModelPool gameModelPool = this.player.getGameModelPool();
      BattleDailyModel battleModel = (BattleDailyModel)gameModelPool.getEntity("battleDaily", battleId);
      if (battleModel == null) {
         return 6;
      } else {
         int playerId = this.player.getPlayerId();
         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", playerId);
         if (battleModel.getLevel() > playerDao.lv) {
            return 5000;
         } else if ((long)battleModel.getFightPower() > this.player.getMaxPlayerCombatPower()) {
            return 5001;
         } else {
            BattleDailyDao battleDailyDao = (BattleDailyDao)this.getBattleDailyMap().get(battleModel.getType());
            if (battleDailyDao == null) {
               battleDailyDao = new BattleDailyDao();
               battleDailyDao.playerId = playerId;
               battleDailyDao.battleType = battleModel.getType();
               this.player.insertDao(battleDailyDao);
            }

            int lastPassId = battleDailyDao.lastPassId;
            if (lastPassId > 0 && lastPassId != battleModel.getLastHard()) {
               return 5002;
            } else {
               this.player.getOperationMgr().addCopyLog(this.player, battleModel.getId(), "日常副本");
               BattlePKTeam rightTeam = new BattlePKTeam(battleModel.getBattleId());
               battleDao.scene.addPKTeam((byte)1, rightTeam);
               battleDao.scene.setMaxRound(battleModel.getBoutCount());
               battleDao.scene.setBattleId(battleModel.getBattleId());
               return 1;
            }
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      BattleDailyModel battleModel = (BattleDailyModel)this.player.getGameModelPool().getEntity("battleDaily", battleDao.modelId);
      BattleDailyDao battleDailyDao = (BattleDailyDao)this.getBattleDailyMap().get(battleModel.getType());
      if (battleDailyDao != null) {
         if (battleDao.scene.getWinForce() == 1) {
            this.player.getOperationMgr().addExtraLog(this.player, 105, battleModel.getName(), String.valueOf(false), String.valueOf(battleDailyDao.count));
         } else {
            battleDailyDao.lastPassId = battleModel.getId();
            List<ResourceModel> rewards = new ArrayList();
            if (battleDailyDao.firstPassId < battleDailyDao.lastPassId) {
               battleDailyDao.firstPassId = battleDailyDao.lastPassId;

               for(ResourceModel resourceModel : battleModel.getFirstRewards()) {
                  ResourceModel.addResourceToList(rewards, resourceModel);
               }
            }

            for(ResourceModel resourceModel : battleModel.getRewards()) {
               ResourceModel.addResourceToList(rewards, resourceModel);
            }

            battleDailyDao.updateOp();
            battleDao.rewards.addAll(rewards);
            this.player.triggerTask(111, 0, 1L, 1);
            BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

            for(ResourceModel rewardItem : rewards) {
               result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setId(rewardItem.getId()).setType(rewardItem.getType()).setNum(rewardItem.getValue()));
            }

            battleDao.scene.getBattleMsg().setResult(result);
            BattleDailyMsg.S2C_EnterDailyBattle_6602.Builder resp = BattleDailyMsg.S2C_EnterDailyBattle_6602.newBuilder();
            resp.setInfo(this.buildBattleDailyInfo(battleDailyDao));
            this.player.sendMsg(resp.build());
            this.player.getOperationMgr().addExtraLog(this.player, 105, battleModel.getName(), String.valueOf(true), String.valueOf(battleDailyDao.count));
            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(1240, (List)null);
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() != 1) {
         if (!battleDao.rewards.isEmpty()) {
            this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 503, battleDao.modelId, 0, "");
         }

      }
   }

   private void dailyBattleSuccess(int battleId, BattleMsg.S2C_BattleResult_6102 down, boolean useItem) {
      GameModelPool gameModelPool = this.player.getGameModelPool();
      BattleDailyModel battleModel = (BattleDailyModel)gameModelPool.getEntity("battleDaily", battleId);
      BattleDailyDao battleDailyDao = (BattleDailyDao)this.getBattleDailyMap().get(battleModel.getType());
      int freedCount = this.configManager.getInt("dailyCopyFreeTime");
      int feeGold = 0;
      if (battleDailyDao.count >= freedCount) {
         if (useItem) {
            int copiesMaterials = this.configManager.getIntDefault("copiesMaterials", 0);
            if (copiesMaterials > 0) {
               ItemBagPart bagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               ItemBase anyItemById = bagPart.getAnyItemById(copiesMaterials);
               if (anyItemById != null) {
                  this.player.delResource(2, copiesMaterials, 1L, 5, 503, 0, 0, "");
                  PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
                  playerItemResetCustomCache.addDailyReset(copiesMaterials, 1);
                  bagPart.S2C_ItemUseNum_3034(copiesMaterials);
               }
            } else {
               useItem = false;
            }
         }

         if (!useItem) {
            Integer id = (Integer)battleModel.getBuyCountCost().get(1);
            Integer type = (Integer)battleModel.getBuyCountCost().get(0);
            int num = ResCountryDifUtils.goldAdditionForJp(type, id, (Integer)battleModel.getBuyCountCost().get(2));
            if (!this.player.checkResourceNum(type, id, num)) {
               this.player.failure(5003);
               return;
            }

            feeGold = num;
            this.player.delResource(type, id, (long)num, 5, 501, battleId, battleDailyDao.count + 1, "" + this.player.getPlayerId());
         }
      }

      if (!useItem) {
         ++battleDailyDao.count;
      }

      if (down != null) {
         this.player.sendMsg(down);
         List<ResourceModel> rewards = new ArrayList();
         if (battleDailyDao.firstPassId < battleDailyDao.lastPassId) {
            battleDailyDao.firstPassId = battleDailyDao.lastPassId;
            rewards.addAll(battleModel.getFirstRewards());
         }

         rewards.addAll(battleModel.getRewards());
         this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 503, battleModel.getType(), battleId, "" + this.player.getPlayerId());
      } else {
         this.player.addResource(battleModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 503, battleModel.getType(), battleId, "" + this.player.getPlayerId());
         this.player.getOperationMgr().addExtraLog(this.player, 106, battleModel.getName(), String.valueOf(feeGold), String.valueOf(battleDailyDao.count));
      }

      battleDailyDao.updateOp();
      this.player.triggerTask(111, 0, 1L, 1);
      BattleDailyMsg.S2C_EnterDailyBattle_6602.Builder resp = BattleDailyMsg.S2C_EnterDailyBattle_6602.newBuilder();
      resp.setInfo(this.buildBattleDailyInfo(battleDailyDao));
      this.player.sendMsg(resp.build());
   }

   private BattleDailyMsg.BattleDailyInfo.Builder buildBattleDailyInfo(BattleDailyDao battleDailyDao) {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      int configFreeCount = this.configManager.getInt("dailyCopyFreeTime");
      BattleDailyMsg.BattleDailyInfo.Builder battleInfo = BattleDailyMsg.BattleDailyInfo.newBuilder();
      battleInfo.setBattleType(battleDailyDao.battleType);
      int freeCount = configFreeCount - battleDailyDao.count;
      battleInfo.setFreeCount(Math.max(freeCount, 0));
      VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", playerDao.vip_lv);
      int dailyCopyPassTimes = vipModel == null ? 0 : vipModel.getDailyCopyPassTimes();
      freeCount = freeCount <= 0 ? dailyCopyPassTimes - battleDailyDao.count + configFreeCount : dailyCopyPassTimes;
      battleInfo.setVipCount(Math.max(freeCount, 0));
      battleInfo.setLastPassId(battleDailyDao.lastPassId);
      return battleInfo;
   }

   public void resetDaily() {
      BattleDailyMsg.S2C_BattleDailyInfo_6605.Builder battleDailyInfo = BattleDailyMsg.S2C_BattleDailyInfo_6605.newBuilder();

      for(BattleDailyDao battleDailyDao : this.getBattleDailyMap().values()) {
         battleDailyDao.reset();
         battleDailyInfo.addInfo(this.buildBattleDailyInfo(battleDailyDao));
      }

      this.player.sendMsg(battleDailyInfo.build());
      int copiesMaterials = this.configManager.getIntDefault("copiesMaterials", 0);
      if (copiesMaterials > 0) {
         this.getCache().setDailyReset(copiesMaterials, 0);
         ItemBagPart bagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         bagPart.S2C_ItemUseNum_3034(copiesMaterials);
      }

   }

   private Map<Integer, BattleDailyDao> getBattleDailyMap() {
      return this.player.<Integer, BattleDailyDao>getMap("tb_battle_daily", this.player.getPlayerId());
   }

   public void sendBattleDailyInfo() {
      Map<Integer, BattleDailyDao> battleDailyDaoMap = this.player.<Integer, BattleDailyDao>getMap("tb_battle_daily", this.player.getPlayerId());
      BattleDailyMsg.S2C_BattleDailyInfo_6605.Builder battleDailyInfo = BattleDailyMsg.S2C_BattleDailyInfo_6605.newBuilder();

      for(BattleDailyDao battleDailyDao : battleDailyDaoMap.values()) {
         battleDailyInfo.addInfo(this.buildBattleDailyInfo(battleDailyDao));
      }

      this.player.sendMsg(battleDailyInfo.build());
   }

   public void guanJiaOperate(int systemId, List<Integer> optionList) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      if (optionList != null && !optionList.isEmpty()) {
         List<Integer> optionNewList = new ArrayList();
         if (!optionList.contains(-1) && !optionList.contains(0)) {
            optionNewList.addAll(optionList);
         } else {
            Map<Integer, Map<Integer, BattleDailyModel>> battleDailyModelMap = ApplicationContextProvider.<Integer, Map<Integer, BattleDailyModel>>getModelPoolMap("customBattleDaily");
            optionNewList.addAll(battleDailyModelMap.keySet());
         }

         Map<Integer, BattleDailyDao> battleDailyDaoMap = this.getBattleDailyMap();

         for(int type : optionNewList) {
            BattleDailyDao battleDailyDao = (BattleDailyDao)battleDailyDaoMap.get(type);
            if (battleDailyDao != null && battleDailyDao.lastPassId > 0) {
               BattleDailyModel battleDailyModel = (BattleDailyModel)ApplicationContextProvider.getModelPoolEntity("battleDaily", battleDailyDao.lastPassId);
               if (battleDailyModel == null) {
                  this.logger.error("找不到日常副本【{}】的配置", battleDailyDao.lastPassId);
                  guanJiaPart.checkState(systemId, (List)null);
                  return;
               }

               if (battleDailyDao.count > 0) {
                  guanJiaPart.checkState(systemId, (List)null);
                  return;
               }
            }
         }

         List<ResourceModel> addResourceModels = new ArrayList();
         Map<Integer, Integer> battleDailyLessCount = new HashMap();
         Map<Integer, Integer> battleDailyFee = new HashMap();
         int freeCount = this.configManager.getInt("dailyCopyFreeTime");

         for(BattleDailyDao battleDailyDao : battleDailyDaoMap.values()) {
            if (battleDailyDao.lastPassId > 0) {
               BattleDailyModel battleDailyModel = (BattleDailyModel)ApplicationContextProvider.getModelPoolEntity("battleDaily", battleDailyDao.lastPassId);
               if (battleDailyModel != null) {
                  MapUtil.computeIfAbsent(battleDailyLessCount, battleDailyDao.battleType, freeCount);

                  for(ResourceModel reward : battleDailyModel.getRewards()) {
                     ResourceModel cloneModel = reward.clone();
                     cloneModel.setValue(cloneModel.getValue() * freeCount);
                     cloneModel.addResourceToList(addResourceModels);
                  }
               }
            }
         }

         if (!optionList.contains(-1)) {
            List<ResourceModel> delResourceModels = new ArrayList();
            this.swapAll(battleDailyLessCount, battleDailyFee, delResourceModels, addResourceModels, optionNewList, optionList.contains(0));
            if (!this.player.checkResourceNum(delResourceModels)) {
               guanJiaPart.checkState(systemId, (List)null);
               return;
            }

            this.player.delResource((List)delResourceModels, 5, 525, 0, 0, "guanJia");
         }

         if (!addResourceModels.isEmpty()) {
            BattleDailyMsg.S2C_OneKeySwapAll_6650.Builder resp = BattleDailyMsg.S2C_OneKeySwapAll_6650.newBuilder();
            int allLessCount = 0;

            for(Map.Entry<Integer, Integer> entry : battleDailyLessCount.entrySet()) {
               allLessCount += (Integer)entry.getValue();
               BattleDailyDao battleDailyDao = (BattleDailyDao)battleDailyDaoMap.get(entry.getKey());
               battleDailyDao.count += (Integer)entry.getValue();
               battleDailyDao.updateOp();
               resp.addInfo(this.buildBattleDailyInfo(battleDailyDao));
               BattleDailyModel battleDailyModel = (BattleDailyModel)ApplicationContextProvider.getModelPoolEntity("battleDaily", battleDailyDao.lastPassId);
               this.player.getOperationMgr().addExtraLog(this.player, 106, battleDailyModel.getName(), String.valueOf(MapUtil.getOrDefault(battleDailyFee, battleDailyDao.battleType, 0)), String.valueOf(battleDailyDao.count));
            }

            this.player.triggerTask(111, 0, (long)allLessCount, 1);
            this.player.addResource(addResourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 524, allLessCount, 0, "guanjia");
            this.player.sendMsg(resp.build());
         }

         guanJiaPart.checkState(systemId, addResourceModels);
      } else {
         guanJiaPart.checkState(systemId, (List)null);
      }
   }

   public void advertisementVnExpCopy() {
      BattleDailyDao battleDailyDao = (BattleDailyDao)this.getBattleDailyMap().get(2);
      if (battleDailyDao == null) {
         this.logger.error("玩家【{}】越南广告经验副本奖励领取失败,未挑战过", this.player.getPlayerId());
      } else {
         BattleDailyModel battleModel = (BattleDailyModel)ApplicationContextProvider.getModelPoolEntity("battleDaily", battleDailyDao.lastPassId);
         this.player.addResource(battleModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 122, 12201, 0, 0, "expCopy");
         this.player.triggerTask(111, 0, 1L, 1);
         this.player.getOperationMgr().addExtraLog(this.player, 106, battleModel.getName() + "(广告)", "0", String.valueOf(battleDailyDao.count));
      }
   }

   public PlayerItemResetCustomCache getCache() {
      return (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
   }
}
