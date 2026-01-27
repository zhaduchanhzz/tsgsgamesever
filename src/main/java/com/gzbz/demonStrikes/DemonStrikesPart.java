package com.gzbz.demonStrikes;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.DemonStrikesDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.DemonStrikesLogData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.DemonStrikesCityModel;
import com.gzbz.model.DemonStrikesCityRewardModel;
import com.gzbz.model.DemonStrikesScoreRewardModel;
import com.gzbz.model.DemonStrikesTaskModel;
import com.gzbz.model.DemonWarTurnTableRewardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.ShopCountryWarCityModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossDemonStrikesMsg;
import com.gzbz.protobuf.DemonStrikesMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.DemonStrikesTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DemonStrikesPart extends PlayerPart {
   public static final Set<Integer> IN_MAIN_PLAYERS = new ConcurrentHashSet();
   public static final Map<Integer, Integer> MAP_GIFT = new ConcurrentHashMap();
   private boolean alreadyNotify = false;
   private final DemonStrikesMgr demonStrikesMgr;
   private final BattleRecordMgr battleRecordMgr;
   private final WorldMgr worldMgr;

   public DemonStrikesPart(DemonStrikesMgr demonStrikesMgr, BattleRecordMgr battleRecordMgr, WorldMgr worldMgr) {
      this.demonStrikesMgr = demonStrikesMgr;
      this.battleRecordMgr = battleRecordMgr;
      this.worldMgr = worldMgr;
   }

   @MsgHandlerAnno
   public void C2S_DemonStrikes_13901(DemonStrikesMsg.C2S_DemonStrikes_13901 msg, String source) {
      this.sendDemonStrikesInfo();
   }

   @MsgHandlerAnno
   public void C2S_Main_13903(DemonStrikesMsg.C2S_Main_13903 msg, String source) {
      int openDay = ApplicationContextProvider.getConfigInt("demonWarEnableOpenDays", 0);
      if (DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) >= openDay) {
         if (this.player.isSystemOpen(2021)) {
            if (msg.getExit()) {
               IN_MAIN_PLAYERS.remove(this.player.getPlayerId());
            } else {
               IN_MAIN_PLAYERS.add(this.player.getPlayerId());
               if (this.cantReq(DemonStrikesMsg.SystemState.END)) {
                  DemonStrikesMsg.S2C_Main_13904.Builder resp = DemonStrikesMsg.S2C_Main_13904.newBuilder();
                  resp.setInCity(0);
                  resp.setAtkRecoverTime(0);
                  resp.setMoveRecoverTime(0);
                  this.player.sendMsg(resp.build());
               } else {
                  this.reqDemonStrikesMap();
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CityInfo_13905(DemonStrikesMsg.C2S_CityInfo_13905 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.demonStrikesMgr.reqCityHold(this.player, msg.getCityId(), msg.getPageParam());
      }
   }

   @MsgHandlerAnno
   public void C2S_FlushRecoverTime_13909(DemonStrikesMsg.C2S_FlushRecoverTime_13909 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.SETTLE, DemonStrikesMsg.SystemState.END)) {
         this.checkRecover();
         this.sendFlushRecoverTimeMsg();
      }
   }

   private void sendFlushRecoverTimeMsg() {
      DemonStrikesDao demonStrikesCityDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      DemonStrikesMsg.S2C_FlushRecoverTime_13910.Builder resp = DemonStrikesMsg.S2C_FlushRecoverTime_13910.newBuilder();
      resp.setAtkRecoverTime(demonStrikesCityDao.atkRecoverTime);
      resp.setMoveRecoverTime(demonStrikesCityDao.moveRecoverTime);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_MoveCity_13913(DemonStrikesMsg.C2S_MoveCity_13913 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.SETTLE, DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else {
         String[] moveItemConfig = ApplicationContextProvider.getConfigString("demonWarItemIdMove", "").split("\\|");
         int moveNum = (int)this.player.getResourceNum(Integer.parseInt(moveItemConfig[0]), Integer.parseInt(moveItemConfig[1]));
         this.demonStrikesMgr.reqMoveCity(this.player, msg.getCityId(), moveNum);
      }
   }

   @MsgHandlerAnno
   public void C2S_TransferList_13915(DemonStrikesMsg.C2S_TransferList_13915 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.demonStrikesMgr.reqTransferList(this.player, msg.getPageInfo());
      }
   }

   @MsgHandlerAnno
   public void C2S_TransferToCity_13917(DemonStrikesMsg.C2S_TransferToCity_13917 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.SETTLE, DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else {
         String[] atkItemConfig = ApplicationContextProvider.getConfigString("demonWarItemIdAtt", "").split("\\|");
         String[] moveItemConfig = ApplicationContextProvider.getConfigString("demonWarItemIdMove", "").split("\\|");
         int atkNum = (int)this.player.getResourceNum(Integer.parseInt(atkItemConfig[0]), Integer.parseInt(atkItemConfig[1]));
         int moveNum = (int)this.player.getResourceNum(Integer.parseInt(moveItemConfig[0]), Integer.parseInt(moveItemConfig[1]));
         this.demonStrikesMgr.reqTransfer(this.player, msg.getTransferPlayerId(), msg.getCityId(), atkNum, moveNum);
      }
   }

   @MsgHandlerAnno
   public void C2S_Rank_13919(DemonStrikesMsg.C2S_Rank_13919 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.demonStrikesMgr.reqRank(this.player, msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_Logs_13921(DemonStrikesMsg.C2S_Logs_13921 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.END)) {
         if (msg.getType() == 1) {
            this.demonStrikesMgr.reqLog(this.player);
         } else if (msg.getType() == 2) {
            DemonStrikesMsg.S2C_Logs_13922.Builder resp = DemonStrikesMsg.S2C_Logs_13922.newBuilder();
            resp.setType(msg.getType());
            DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());

            for(DemonStrikesLogData demonStrikesLogData : demonStrikesDao.logList) {
               resp.addLog(demonStrikesLogData.buildLogMsg());
            }

            this.player.sendMsg(resp.build());
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_IntegralRewardMain_13923(DemonStrikesMsg.C2S_IntegralRewardMain_13923 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.END)) {
         DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
         DemonStrikesMsg.S2C_IntegralRewardMain_13924.Builder resp = DemonStrikesMsg.S2C_IntegralRewardMain_13924.newBuilder();
         resp.setReward(demonStrikesDao.integralData.integralReward);
         resp.setSuperReward(demonStrikesDao.integralData.unlockReward ? demonStrikesDao.integralData.integralReward : 0);
         DemonStrikesTaskPart demonStrikesTaskPart = (DemonStrikesTaskPart)this.player.getMgrPart(DemonStrikesTaskPart.class);

         for(TaskGroupData taskGroupData : demonStrikesDao.integralData.taskStepGroup) {
            DemonStrikesMsg.TaskGroup.Builder builder = DemonStrikesMsg.TaskGroup.newBuilder();
            if (taskGroupData.group == 3) {
               builder.setEndTime((long)this.demonStrikesMgr.getEndTime());
            } else {
               builder.setEndTime((long)taskGroupData.end);
            }

            builder.setGroup(taskGroupData.group);
            Map<Integer, DemonStrikesTaskModel> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customDemonWarTask", taskGroupData.group);
            if (taskModelMap != null) {
               for(int taskId : taskModelMap.keySet()) {
                  TaskData taskData = demonStrikesTaskPart.getTask(taskId);
                  if (taskData != null) {
                     builder.addTasks(taskData.toBuilder());
                  }
               }
            }

            resp.addGroup(builder);
         }

         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_IntegralReward_13925(DemonStrikesMsg.C2S_IntegralReward_13925 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else {
         DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
         List<ResourceModel> resourceModels = new ArrayList();
         TreeMap<Integer, DemonStrikesScoreRewardModel> rewardModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("demonWarScoreReward"));
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         boolean hasGift = giftPart.getBuyGifts(15).containsKey(MAP_GIFT.get(this.demonStrikesMgr.getMapId()));
         int curRewardLv = demonStrikesDao.integralData.integralReward;

         for(DemonStrikesScoreRewardModel rewardModel : rewardModelMap.values()) {
            if (rewardModel.getLv() <= curRewardLv) {
               if (hasGift && !demonStrikesDao.integralData.unlockReward) {
                  for(ResourceModel lockReward : rewardModel.getLockRewards()) {
                     lockReward.addResourceToList(resourceModels);
                  }
               }
            } else {
               if (!this.player.checkResourceNum(2, ApplicationContextProvider.getConfigInt("demonTaskItem", 0), rewardModel.getIntegral())) {
                  break;
               }

               for(ResourceModel resourceModel : rewardModel.getRewards()) {
                  resourceModel.addResourceToList(resourceModels);
               }

               if (hasGift) {
                  for(ResourceModel lockReward : rewardModel.getLockRewards()) {
                     lockReward.addResourceToList(resourceModels);
                  }
               }

               curRewardLv = rewardModel.getLv();
            }
         }

         if (!resourceModels.isEmpty()) {
            this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 69, 6907, demonStrikesDao.integralData.integralReward, curRewardLv, "");
            demonStrikesDao.integralData.integralReward = curRewardLv;
            if (hasGift) {
               demonStrikesDao.integralData.unlockReward = true;
            }

            demonStrikesDao.updateOp();
         }

         DemonStrikesMsg.S2C_IntegralReward_13926.Builder resp = DemonStrikesMsg.S2C_IntegralReward_13926.newBuilder();
         resp.setReward(demonStrikesDao.integralData.integralReward);
         resp.setIntegralReward(this.hasCompleteTask() || this.hasIntegralReward());
         resp.setSuperReward(demonStrikesDao.integralData.unlockReward ? demonStrikesDao.integralData.integralReward : 0);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_13927(DemonStrikesMsg.C2S_CommitTask_13927 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else {
         DemonStrikesTaskPart demonStrikesTaskPart = (DemonStrikesTaskPart)this.player.getMgrPart(DemonStrikesTaskPart.class);
         demonStrikesTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_CityReward_13931(DemonStrikesMsg.C2S_CityReward_13931 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.SETTLE, DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else {
         this.demonStrikesMgr.reqCityReward(this.player);
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckyMain_13933(DemonStrikesMsg.C2S_LuckyMain_13933 msg, String source) {
      if (!this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.demonStrikesMgr.reqLuckMain(this.player);
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckyReward_13935(DemonStrikesMsg.C2S_LuckyReward_13935 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else if (msg.getCount() <= 0) {
         this.player.failure(4);
      } else {
         ResourceModel resourceModel = new ResourceModel(2, ApplicationContextProvider.getConfigInt("demonWarLuckDrawItem", 0), 1);
         if (!ResourceModel.checkTotalNumError(resourceModel.getValue(), msg.getCount())) {
            resourceModel.setValue(resourceModel.getValue() * msg.getCount());
            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(4);
            } else {
               DemonStrikesMsg.S2C_LuckyReward_13936.Builder resp = DemonStrikesMsg.S2C_LuckyReward_13936.newBuilder();
               resp.setCount(msg.getCount());
               Map<Integer, DemonWarTurnTableRewardModel> demonWarTurnTableRewardModelMap = ApplicationContextProvider.<Integer, DemonWarTurnTableRewardModel>getModelPoolMap("demonWarTurnTableReward");
               LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "countryWarTurnTableRecord");
               List<Integer> posList = new ArrayList();
               PlayerDao playerDao = this.player.getPlayerDao();
               List<ResourceModel> rewardList = new ArrayList();
               List<String> recordList = new ArrayList();

               for(int i = 0; i < msg.getCount(); ++i) {
                  int index = this.getTurnTableReward();
                  if (index >= 0) {
                     posList.add(index);
                     ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", ((ResourceModel)((DemonWarTurnTableRewardModel)demonWarTurnTableRewardModelMap.get(index)).getGirdReward().get(0)).getId());
                     rewardList.add(new ResourceModel(2, itemModel.getId(), ((ResourceModel)((DemonWarTurnTableRewardModel)demonWarTurnTableRewardModelMap.get(index)).getGirdReward().get(0)).getValue()));
                     String itemStr = itemModel.getName() + "*" + ((ResourceModel)((DemonWarTurnTableRewardModel)demonWarTurnTableRewardModelMap.get(index)).getGirdReward().get(0)).getValue();
                     QualityColorModel qualityColorModel = (QualityColorModel)this.player.getGameModelPool().getEntity("qualityColor", Integer.valueOf(itemModel.getQuality()));
                     String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, qualityColorModel.getColor(), itemStr);
                     recordList.add(format);
                  }
               }

               this.player.delResource(resourceModel, 69, 6908, 0, 0, "");
               this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_DEMON_STRIKES, 69, 6908, msg.getCount(), 0, "");
               resp.addAllIndex(posList);

               for(ResourceModel rewardModel : rewardList) {
                  resp.addItemInfos(rewardModel.builder());
               }

               this.player.sendMsg(resp.build());
               this.demonStrikesMgr.reqLuckReward(this.player, recordList);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BuyRandomShop_13941(DemonStrikesMsg.C2S_BuyRandomShop_13941 msg, String source) {
      if (this.cantReq(DemonStrikesMsg.SystemState.END)) {
         this.player.failure(61114);
      } else if (msg.getBuyNum() <= 0) {
         this.player.failure(6);
      } else {
         ShopCountryWarCityModel model = (ShopCountryWarCityModel)ApplicationContextProvider.getModelPoolEntity("shopRandom", msg.getBuyId());
         if (model == null) {
            this.player.failure(0);
         } else if (model.getMapType() != 2) {
            this.player.failure(0);
         } else {
            this.demonStrikesMgr.reqBuyRandomShop(this.player, msg.getBuyId(), msg.getBuyNum());
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_MapInfo_14124(CrossDemonStrikesMsg.CR2S_MapInfo_14124 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.checkRecover();
      DemonStrikesMsg.S2C_Main_13904.Builder resp = DemonStrikesMsg.S2C_Main_13904.newBuilder();
      resp.addAllCity(msg.getCityList());
      resp.setInCity(msg.getInCity());
      DemonStrikesDao demonStrikesCityDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      resp.setAtkRecoverTime(demonStrikesCityDao.atkRecoverTime);
      resp.setMoveRecoverTime(demonStrikesCityDao.moveRecoverTime);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void CR2S_MoveCity_14107(CrossDemonStrikesMsg.CR2S_MoveCity_14107 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DemonStrikesDao demonStrikesCityDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      if (msg.getNeedFee()) {
         String[] feeMove = ApplicationContextProvider.getConfigString("demonWarItemIdMove", "").split("\\|");
         this.player.delResource(Integer.parseInt(feeMove[0]), Integer.parseInt(feeMove[1]), 1L, 69, 6903, msg.getCityId(), 0, "");
         demonStrikesCityDao.moveRecoverTime = 0;
         demonStrikesCityDao.updateOp();
         this.checkRecover();
      }

      DemonStrikesMsg.S2C_MoveCity_13914.Builder resp = DemonStrikesMsg.S2C_MoveCity_13914.newBuilder();
      resp.setCityId(msg.getCityId());
      resp.setMoveRecoverTime(demonStrikesCityDao.moveRecoverTime);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void CR2S_Transfer_14110(CrossDemonStrikesMsg.CR2S_Transfer_14110 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      String[] atkItemConfig = ApplicationContextProvider.getConfigString("demonWarItemIdAtt", "").split("\\|");
      String[] moveItemConfig = ApplicationContextProvider.getConfigString("demonWarItemIdMove", "").split("\\|");
      if (msg.getAtkNumFee() > 0) {
         this.player.delResource(Integer.parseInt(atkItemConfig[0]), Integer.parseInt(atkItemConfig[1]), (long)msg.getAtkNumFee(), 69, 6904, msg.getCityId(), msg.getPlayerId(), "");
         demonStrikesDao.atkRecoverTime = 0;
      }

      if (msg.getMoveNumFee() > 0) {
         this.player.delResource(Integer.parseInt(moveItemConfig[0]), Integer.parseInt(moveItemConfig[1]), (long)msg.getMoveNumFee(), 69, 6904, msg.getCityId(), msg.getPlayerId(), "");
         demonStrikesDao.moveRecoverTime = 0;
      }

      this.checkRecover();
      demonStrikesDao.updateOp();
      DemonStrikesMsg.S2C_TransferToCity_13918.Builder resp = DemonStrikesMsg.S2C_TransferToCity_13918.newBuilder();
      resp.setAtkRecoverTime(demonStrikesDao.atkRecoverTime);
      resp.setMoveRecoverTime(demonStrikesDao.moveRecoverTime);
      resp.setResult(msg.getResult());
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void CR2S_AttackNpc_14116(CrossDemonStrikesMsg.CR2S_AttackNpc_14116 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      BattleDao battleDao = (BattleDao)battlePart.getBattleDaoMap().get(2021);
      if (battleDao == null) {
         this.logger.error("玩家{}接收天魔来袭跨服战斗返回,战斗数据不存在", this.player.getPlayerId());
         battlePart.sendBattleResult(2021, true, 44);
      } else {
         ResourceModel resourceModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("demonWarItemIdAtt", "") + "|1");
         this.player.delResource(resourceModel, 69, 6905, msg.getCityId(), msg.getUid(), "");
         if (msg.hasBattle()) {
            BattleMsg.S2C_BattleResult_6102.Builder battleMsg = msg.getBattle().toBuilder();
            BattleMsg.S2C_Battle_Result.Builder resultBuilder = battleMsg.getResult().toBuilder();
            resultBuilder.addAllAwardItems(msg.getRewardList());
            battleMsg.setResult(resultBuilder);
            battleMsg.setIsSkip(battleDao.isSkip);
            this.battleRecordMgr.addBattleRecord(2021, 0, this.player.getPlayerId(), msg.getUid(), battleMsg);
            BattleMsg.S2C_BattleResult_6102 finalBattleMsg = battleMsg.build();
            battleDao.stream = finalBattleMsg.toByteArray();
            battleDao.scene = new BattleScene(finalBattleMsg);
            battleDao.totalTime += (long)battleDao.scene.getCostTime();
            battleDao.status = 0;
            battleDao.updateOp();
            this.player.sendMsg(finalBattleMsg);
            this.logger.info("战斗-->{}进入【天魔来袭】战斗", battleDao.playerId);
         } else {
            battlePart.removeBattle(2021);
         }

         if (msg.getRewardCount() > 0) {
            List<ResourceModel> resourceModels = new ArrayList();

            for(CommonMsg.ItemInfo itemInfo : msg.getRewardList()) {
               ResourceModel reward = new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum());
               reward.addResourceToList(resourceModels);
            }

            this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6905, msg.getCityId(), msg.getUid(), "");
         }

         this.checkRecover();
         this.sendFlushRecoverTimeMsg();
         if (msg.getResult() == CrossDemonStrikesMsg.AtkResult.ATK_SUC) {
            this.player.triggerTask(535, 0, 1L, 1);
         } else if (msg.getResult() == CrossDemonStrikesMsg.AtkResult.ATK_OCCUPY) {
            this.player.triggerTask(535, 0, 1L, 1);
            this.player.triggerTask(534, 0, 1L, 1);
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_CityReward_14114(CrossDemonStrikesMsg.CR2S_CityReward_14114 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<ResourceModel> rewardList = new ArrayList();

      for(CommonMsg.MapDataII cityReward : msg.getRewardList()) {
         DemonStrikesCityModel cityModel = (DemonStrikesCityModel)ApplicationContextProvider.getModelPoolEntity("demonWarCity", cityReward.getKey());
         if (cityModel != null) {
            for(ResourceModel gainModel : cityModel.getGains()) {
               ResourceModel resourceModel = gainModel.clone();
               resourceModel.setValue(resourceModel.getValue() * cityReward.getValue());
               resourceModel.addResourceToList(rewardList);
            }
         }
      }

      for(CommonMsg.MapDataII randomReward : msg.getRandomRewardList()) {
         DemonStrikesCityRewardModel rewardModel = (DemonStrikesCityRewardModel)ApplicationContextProvider.getModelPoolEntity("demonWarCityReward", randomReward.getKey());
         if (rewardModel != null) {
            for(ResourceModel gainModel : rewardModel.getGains()) {
               ResourceModel resourceModel = gainModel.clone();
               resourceModel.setValue(resourceModel.getValue() * randomReward.getValue());
               resourceModel.addResourceToList(rewardList);
            }
         }
      }

      this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 69, 6909, 0, 0, "");
      DemonStrikesMsg.S2C_CityReward_13932.Builder resp = DemonStrikesMsg.S2C_CityReward_13932.newBuilder();
      resp.setCityReward(false);
      this.player.sendMsg(resp.build());
      DemonStrikesDao demonStrikesCityDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      demonStrikesCityDao.rewardTime = this.demonStrikesMgr.getRewardTime();
      demonStrikesCityDao.updateOp();
      this.alreadyNotify = false;
   }

   @MsgHandlerAnno
   public void CR2S_NpcAtkPLayer_14122(CrossDemonStrikesMsg.CR2S_NpcAtkPLayer_14122 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattleMsg.S2C_BattleResult_6102.Builder builder = msg.getBattle().toBuilder();
      this.battleRecordMgr.addBattleRecord(2021, 0, this.player.getPlayerId(), 0, builder);
      if (IN_MAIN_PLAYERS.contains(this.player.getPlayerId())) {
         this.player.sendMsg(builder.build());
      }

      if (builder.getResult().getAwardItemsCount() > 0) {
         List<ResourceModel> resourceModels = new ArrayList();

         for(CommonMsg.ItemInfo itemInfo : builder.getResult().getAwardItemsList()) {
            ResourceModel resourceModel = new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum());
            resourceModel.addResourceToList(resourceModels);
         }

         this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6911, 0, 0, "");
      }

      if (builder.getResult().getResult() == 1) {
         this.player.triggerTask(536, 0, 1L, 1);
      }

   }

   @MsgHandlerAnno
   public void CR2S_BeTransfer_14128(CrossDemonStrikesMsg.CR2S_BeTransfer_14128 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getRewardCount() > 0) {
         List<ResourceModel> resourceModels = new ArrayList();

         for(CommonMsg.ItemInfo itemInfo : msg.getRewardList()) {
            ResourceModel resourceModel = new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum());
            resourceModels.add(resourceModel);
         }

         this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6913, 0, 0, "");
      }

      if (msg.hasBattle()) {
         BattleMsg.S2C_BattleResult_6102.Builder battleMsg = msg.getBattle().toBuilder();
         this.battleRecordMgr.addBattleRecord(2021, 0, this.player.getPlayerId(), 0, battleMsg);
      }

      if (msg.getResult() == DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC) {
         this.player.triggerTask(535, 0, 1L, 1);
      } else if (msg.getResult() == DemonStrikesMsg.TransferResult.TRANSFER_OCCUPY) {
         this.player.triggerTask(535, 0, 1L, 1);
         this.player.triggerTask(534, 0, 1L, 1);
      }

   }

   public int enterBattle(BattleDao battleDao) {
      List<Integer> params = battleDao.params;
      if (params.size() != 2) {
         return 0;
      } else if (this.cantReq(DemonStrikesMsg.SystemState.SETTLE, DemonStrikesMsg.SystemState.END)) {
         return 61114;
      } else {
         int cityId = (Integer)params.get(0);
         int npcUid = (Integer)params.get(1);
         ResourceModel resourceModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("demonWarItemIdAtt", "") + "|1");
         if (!this.player.checkResourceNum(resourceModel)) {
            return 61129;
         } else {
            this.demonStrikesMgr.reqAttackNpc(this.player, cityId, npcUid);
            return 1;
         }
      }
   }

   @TaskMethod
   public void sendDemonStrikesInfo() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int openDay = ApplicationContextProvider.getConfigInt("demonWarEnableOpenDays", 0);
      if (DateUtil.difftimeDay(new Timestamp(worldMgr.getOpenServerTime())) >= openDay) {
         if (this.player.isSystemOpen(2021)) {
            DemonStrikesTaskPart demonStrikesTaskPart = (DemonStrikesTaskPart)this.player.getMgrPart(DemonStrikesTaskPart.class);
            DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
            if (this.demonStrikesMgr.getStartTime() > 0 && demonStrikesDao.joinSeasonTime != this.demonStrikesMgr.getStartTime()) {
               this.resetDemonStrikes();
            }

            demonStrikesTaskPart.trigger();
            DemonStrikesMsg.S2C_DemonStrikes_13902.Builder resp = DemonStrikesMsg.S2C_DemonStrikes_13902.newBuilder();
            resp.setStartTime(this.demonStrikesMgr.getStartTime());
            resp.setEndTime(this.demonStrikesMgr.getEndTime());
            resp.setMapId(this.demonStrikesMgr.getMapId());
            resp.setState(this.demonStrikesMgr.getState());
            if (this.demonStrikesMgr.getState() != DemonStrikesMsg.SystemState.END && this.demonStrikesMgr.getStartTime() > 0 && this.demonStrikesMgr.getEndTime() > 0) {
               this.alreadyNotify = this.demonStrikesMgr.getRewardTime() > demonStrikesDao.rewardTime;
               resp.setIntegralReward(this.hasCompleteTask() || this.hasIntegralReward());
            } else {
               this.alreadyNotify = false;
               resp.setIntegralReward(false);
            }

            resp.setCityReward(this.alreadyNotify);
            this.player.sendMsg(resp.build());
         }
      }
   }

   private void resetDemonStrikes() {
      DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      this.initResource();
      this.checkRecover();
      DemonStrikesTaskPart demonStrikesTaskPart = (DemonStrikesTaskPart)this.player.getMgrPart(DemonStrikesTaskPart.class);

      for(TaskData taskData : demonStrikesTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      demonStrikesDao.rewardTime = 0;
      demonStrikesDao.integralData.integralReward = 0;
      demonStrikesDao.integralData.unlockReward = false;
      demonStrikesDao.integralData.taskStepGroup.clear();
      demonStrikesDao.joinSeasonTime = this.demonStrikesMgr.getStartTime();
      demonStrikesDao.logList.clear();
      demonStrikesDao.updateOp();
      this.logger.info("玩家{}初次参加【天魔来袭】,初始化数据", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);

      for(int giftId : MAP_GIFT.values()) {
         giftPart.removeGift(giftId);
      }

   }

   public void updatePlayerData() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_DEMON_STRIKES).isEmpty()) {
         heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_DEMON_STRIKES);
      }

      this.demonStrikesMgr.reqUploadPlayer(this.player, heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_DEMON_STRIKES));
   }

   private boolean hasCompleteTask() {
      DemonStrikesTaskPart demonStrikesTaskPart = (DemonStrikesTaskPart)this.player.getMgrPart(DemonStrikesTaskPart.class);

      for(TaskData taskData : demonStrikesTaskPart.getTasksMap().values()) {
         if (taskData.state == 2) {
            return true;
         }
      }

      return false;
   }

   public boolean hasIntegralReward() {
      DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      TreeMap<Integer, DemonStrikesScoreRewardModel> rewardModelTreeMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("demonWarScoreReward"));

      for(DemonStrikesScoreRewardModel rewardModel : rewardModelTreeMap.values()) {
         if (rewardModel.getLv() > demonStrikesDao.integralData.integralReward && this.player.checkResourceNum(2, ApplicationContextProvider.getConfigInt("demonTaskItem", 0), rewardModel.getIntegral())) {
            return true;
         }
      }

      return false;
   }

   private boolean cantReq(DemonStrikesMsg.SystemState... cantReqState) {
      if (!this.player.isSystemOpen(2021)) {
         return true;
      } else if (!IN_MAIN_PLAYERS.contains(this.player.getPlayerId())) {
         return true;
      } else if (this.demonStrikesMgr.getStartTime() > 0 && this.demonStrikesMgr.getEndTime() > 0) {
         if (cantReqState != null && cantReqState.length != 0) {
            for(DemonStrikesMsg.SystemState systemState : cantReqState) {
               if (this.demonStrikesMgr.getState() == systemState) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void checkRecover() {
      DemonStrikesDao demonStrikesCityDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      int maxAttToken = ApplicationContextProvider.getConfigInt("demonWarMaxAttToken", 20);
      int attTokenColdTime = ApplicationContextProvider.getConfigInt("demonWarAttTokenColdTime", 7200);
      String[] atkConfig = ApplicationContextProvider.getConfigString("demonWarItemIdAtt", "").split("\\|");
      String[] moveConfig = ApplicationContextProvider.getConfigString("demonWarItemIdMove", "").split("\\|");
      long attNum = this.player.getResourceNum(Integer.parseInt(atkConfig[0]), Integer.parseInt(atkConfig[1]));
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      if (attNum < (long)maxAttToken) {
         if (demonStrikesCityDao.atkRecoverTime == 0) {
            demonStrikesCityDao.atkRecoverTime = curTime + attTokenColdTime;
            demonStrikesCityDao.updateOp();
         } else {
            int addNum;
            for(addNum = 0; demonStrikesCityDao.atkRecoverTime < curTime && attNum + (long)addNum < (long)maxAttToken; ++addNum) {
               demonStrikesCityDao.atkRecoverTime += attTokenColdTime;
               demonStrikesCityDao.updateOp();
            }

            if (addNum > 0) {
               this.player.addResource(Integer.parseInt(atkConfig[0]), Integer.parseInt(atkConfig[1]), addNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6901, 0, 0, "");
            }
         }
      }

      attNum = this.player.getResourceNum(Integer.parseInt(atkConfig[0]), Integer.parseInt(atkConfig[1]));
      if (attNum >= (long)maxAttToken) {
         demonStrikesCityDao.atkRecoverTime = 0;
         demonStrikesCityDao.updateOp();
      }

      int maxMoveToken = ApplicationContextProvider.getConfigInt("demonWarMaxMoveToken", 10);
      int moveTokenColdTime = ApplicationContextProvider.getConfigInt("demonWarMoveTokenColdTime", 43200);
      long moveNum = this.player.getResourceNum(Integer.parseInt(moveConfig[0]), Integer.parseInt(moveConfig[1]));
      if (moveNum < (long)maxMoveToken) {
         if (demonStrikesCityDao.moveRecoverTime == 0) {
            demonStrikesCityDao.moveRecoverTime = curTime + moveTokenColdTime;
            demonStrikesCityDao.updateOp();
         } else {
            int addNum;
            for(addNum = 0; demonStrikesCityDao.moveRecoverTime < curTime && moveNum + (long)addNum < (long)maxMoveToken; ++addNum) {
               demonStrikesCityDao.moveRecoverTime += moveTokenColdTime;
               demonStrikesCityDao.updateOp();
            }

            if (addNum > 0) {
               this.player.addResource(Integer.parseInt(moveConfig[0]), Integer.parseInt(moveConfig[1]), addNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6902, 0, 0, "");
            }
         }
      }

      moveNum = this.player.getResourceNum(Integer.parseInt(moveConfig[0]), Integer.parseInt(moveConfig[1]));
      if (moveNum >= (long)maxMoveToken) {
         demonStrikesCityDao.moveRecoverTime = 0;
         demonStrikesCityDao.updateOp();
      }

   }

   @TaskMethod
   public void demonStrikesAddMyLog(DemonStrikesMsg.LogInfo logInfo) {
      DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      demonStrikesDao.addLog(DemonStrikesLogData.fromLogMsg(logInfo.toBuilder()));
      demonStrikesDao.updateOp();
   }

   private int getTurnTableReward() {
      Map<Integer, DemonWarTurnTableRewardModel> demonWarTurnTableRewardModelMap = ApplicationContextProvider.<Integer, DemonWarTurnTableRewardModel>getModelPoolMap("demonWarTurnTableReward");
      int totalWeight = 0;

      for(Map.Entry<Integer, DemonWarTurnTableRewardModel> entry : demonWarTurnTableRewardModelMap.entrySet()) {
         totalWeight += ((DemonWarTurnTableRewardModel)entry.getValue()).getWeight();
      }

      int random = RandomUtil.randomInt(totalWeight);
      int tempLoop = 0;

      for(Map.Entry<Integer, DemonWarTurnTableRewardModel> entry : demonWarTurnTableRewardModelMap.entrySet()) {
         tempLoop += ((DemonWarTurnTableRewardModel)entry.getValue()).getWeight();
         if (tempLoop > random) {
            return (Integer)entry.getKey();
         }
      }

      return -1;
   }

   private void initResource() {
      String[] atkConfig = ApplicationContextProvider.getConfigString("demonWarItemIdAtt", "").split("\\|");
      String[] moveConfig = ApplicationContextProvider.getConfigString("demonWarItemIdMove", "").split("\\|");
      int atkNum = (int)this.player.getResourceNum(Integer.parseInt(atkConfig[0]), Integer.parseInt(atkConfig[1]));
      int moveNum = (int)this.player.getResourceNum(Integer.parseInt(moveConfig[0]), Integer.parseInt(moveConfig[1]));
      int atkInitNum = ApplicationContextProvider.getConfigInt("demonWarAttToken", 0);
      int moveInitNum = ApplicationContextProvider.getConfigInt("demonWarMoveToken", 0);
      if (atkNum > atkInitNum) {
         this.player.delResource(Integer.parseInt(atkConfig[0]), Integer.parseInt(atkConfig[1]), (long)(atkNum - atkInitNum), 69, 6910, 0, 0, "");
      } else if (atkNum < atkInitNum) {
         this.player.addResource(Integer.parseInt(atkConfig[0]), Integer.parseInt(atkConfig[1]), atkInitNum - atkNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6910, 0, 0, "");
      }

      if (moveNum > moveInitNum) {
         this.player.delResource(Integer.parseInt(moveConfig[0]), Integer.parseInt(moveConfig[1]), (long)(moveNum - moveInitNum), 69, 6910, 0, 0, "");
      } else if (moveNum < moveInitNum) {
         this.player.addResource(Integer.parseInt(moveConfig[0]), Integer.parseInt(moveConfig[1]), moveInitNum - moveNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 69, 6910, 0, 0, "");
      }

   }

   public void levelUp(int preLv, int newLv) {
      if (this.player.isSystemOpen(2021)) {
         if (this.demonStrikesMgr.getState() != DemonStrikesMsg.SystemState.END && this.demonStrikesMgr.getStartTime() > 0 && this.demonStrikesMgr.getEndTime() > 0) {
            DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
            if (demonStrikesDao.joinSeasonTime == 0) {
               this.sendDemonStrikesInfo();
            }

         }
      }
   }

   @TaskMethod
   public void sendCityRewardMsg(DemonStrikesMsg.S2C_RewardNotify_13940 msg) {
      if (this.player.isSystemOpen(2021) && !this.alreadyNotify) {
         DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
         if (demonStrikesDao.joinSeasonTime == this.demonStrikesMgr.getStartTime()) {
            this.player.sendMsg(msg);
            this.logger.info("通知玩家【{}】领取奖励", this.player.getPlayerId());
            this.alreadyNotify = true;
         }
      }
   }

   public void logoutHandle() {
      this.alreadyNotify = false;
   }

   @TaskMethod
   public void reqDemonStrikesMap() {
      this.player.uploadCrossPlayer();
      this.updatePlayerData();
      this.demonStrikesMgr.reqMapInfo(this.player);
   }
}
