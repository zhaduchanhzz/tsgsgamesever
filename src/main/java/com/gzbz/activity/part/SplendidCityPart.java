package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActivitySplendidCityDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.SplendidCityBuildData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GreatCityAddUpRechargeModel;
import com.gzbz.model.GreatCityAddupLuckyModel;
import com.gzbz.model.GreatCityGameBattleModel;
import com.gzbz.model.GreatCityGameBuildModel;
import com.gzbz.model.GreatCityGameChooseModel;
import com.gzbz.model.GreatCityGameEventModel;
import com.gzbz.model.GreatCityGameMapModel;
import com.gzbz.model.GreatCityGameRandomShopModel;
import com.gzbz.model.GreatCityLotteryItemModel;
import com.gzbz.model.GreatCityShopAddUpModel;
import com.gzbz.model.GreatCitySignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SplendidCityMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.SplendidCityTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SplendidCityPart extends AbstractActivityPart {
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendActivityInfo();
         this.addUpRechargeHandle(0, true);
         this.sendSignTotalInfo();
         this.shopAddUpRechargeHandle(true);
      }
   }

   public void rotateReset(int oldActivityId) {
      ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
      activitySplendidCityDao.building.clear();
      activitySplendidCityDao.buyGoldDiceNum = 0;
      activitySplendidCityDao.diceRecover = 0;
      activitySplendidCityDao.diceMaxRecover = 0;
      Map<Integer, GreatCityGameMapModel> greatCityGameMapModelMap = ApplicationContextProvider.<Integer, GreatCityGameMapModel>getModelPoolMap("GreatCityGameMap");
      TreeSet<Integer> gridIds = new TreeSet(greatCityGameMapModelMap.keySet());
      activitySplendidCityDao.grid = (Integer)gridIds.first();
      activitySplendidCityDao.fancyRewardId = 0;
      activitySplendidCityDao.eggs.clear();
      activitySplendidCityDao.smashEggNum = 0;
      activitySplendidCityDao.roundSmashNum.clear();
      activitySplendidCityDao.takedLuck.clear();
      activitySplendidCityDao.seniorRewards.clear();
      int state = this.getSmashEggStage();
      activitySplendidCityDao.state = state;
      activitySplendidCityDao.point = 0;
      activitySplendidCityDao.updateOp();
      int pointId = ApplicationContextProvider.getConfigInt("boomPoint", 0);
      this.player.delResourceAllNum(2, pointId, 82, 8212, 0, 0, "");
      this.resetDice("GreatCityDiceNum", "GreatCityDiceID");
      this.resetDice("GreatCityGoldDiceNum", "GreatCityGoldDiceID");
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(37);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_SPLENDID_CITY);
      SplendidCityTaskPart splendidCityTaskPart = (SplendidCityTaskPart)this.player.getMgrPart(SplendidCityTaskPart.class);
      splendidCityTaskPart.trigger();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_SPLENDID_CITY);
      this.addUpActivityEnd();
      this.signEnd();
      this.shopAddUpReset();
      this.drawEnd();
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         ActivitySplendidCityDao dao = this.getDao();
         if (this.getSeverActivityDay() != 1) {
            this.drawResetDaily();
            SplendidCityTaskPart splendidCityTaskPart = (SplendidCityTaskPart)this.player.getMgrPart(SplendidCityTaskPart.class);
            splendidCityTaskPart.clearDailyTask();
            splendidCityTaskPart.trigger();
            this.isStageChange();
            this.sendSignTotalInfo();
            this.shopAddUpReset();
            this.sendShopAddUpInfo();
            dao.buyGoldDiceNum = 0;
            dao.updateOp();
         }
      }
   }

   public void drawResetDaily() {
      ActivitySplendidCityDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.state) {
         dao.state = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   public void drawEnd() {
      ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
      activitySplendidCityDao.fancyRewardId = 0;
      activitySplendidCityDao.eggs.clear();
      activitySplendidCityDao.smashEggNum = 0;
      activitySplendidCityDao.roundSmashNum.clear();
      activitySplendidCityDao.takedLuck.clear();
      activitySplendidCityDao.seniorRewards.clear();
      activitySplendidCityDao.updateOp();
   }

   public void loginHandle() {
      SplendidCityTaskPart splendidCityTaskPart = (SplendidCityTaskPart)this.player.getMgrPart(SplendidCityTaskPart.class);
      splendidCityTaskPart.trigger();
      if (!this.isServerActivityInvalid()) {
         this.checkAddUpIdListChange();
         this.addUpRechargeHandle(0, true);
         this.shopAddUpRechargeHandle(true);
      }

   }

   public int getActivityType() {
      return 57;
   }

   private ActivitySplendidCityDao getDao() {
      return (ActivitySplendidCityDao)this.player.getData("tb_splendid_city", this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_GameMain_17201(SplendidCityMsg.C2S_GameMain_17201 msg, String source) {
      this.sendGameMain();
   }

   @MsgHandlerAnno
   public void C2S_GameRollDice_17203(SplendidCityMsg.C2S_GameRollDice_17203 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         if (activitySplendidCityDao.event.eventId > 0) {
            GreatCityGameEventModel greatCityGameEventModel = (GreatCityGameEventModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameEvent", activitySplendidCityDao.event.eventId);
            if (greatCityGameEventModel != null && greatCityGameEventModel.getEventType() == 3) {
               this.player.failure(0);
               return;
            }
         }

         String diceItem;
         int num;
         if (msg.getType() == 1) {
            diceItem = "GreatCityDiceID";
            num = RandomUtil.randomInt(1, 7);
         } else {
            if (msg.getType() != 2) {
               this.player.failure(0);
               return;
            }

            num = msg.getNum();
            if (num <= 0 || num > 6) {
               this.player.failure(6);
               return;
            }

            diceItem = "GreatCityGoldDiceID";
         }

         int diceNum = this.getDiceNum(diceItem);
         if (diceNum <= 0) {
            this.player.failure(51);
         } else {
            this.useDice(diceItem);
            this.rollDice(msg.getType(), num);
         }
      }
   }

   private void rollDice(int type, int num) {
      ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
      List<ResourceModel> rewardList = new ArrayList();
      GreatCityGameMapModel greatCityGameMapModel = this.eventMove(num, rewardList);
      SplendidCityMsg.S2C_GameRollDice_17204.Builder resp = SplendidCityMsg.S2C_GameRollDice_17204.newBuilder();
      resp.setGrid(activitySplendidCityDao.grid);
      activitySplendidCityDao.updateOp();
      resp.setType(type);
      resp.setNum(num);
      resp.setDiceRecover(activitySplendidCityDao.diceRecover);
      if (greatCityGameMapModel != null) {
         SplendidCityMsg.GameEvent.Builder builder = this.triggerEvent(greatCityGameMapModel.getEventId(), rewardList);
         if (builder != null) {
            GreatCityGameEventModel greatCityGameEventModel = (GreatCityGameEventModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameEvent", builder.getEventId());
            if (greatCityGameEventModel.getEventType() == 1) {
               resp.setBuilding(((SplendidCityBuildData)activitySplendidCityDao.building.get(builder.getEventParam(0))).buildMsg());
            } else if (greatCityGameEventModel.getEventType() != 2) {
               resp.setEvent(builder);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_SPLENDID_CITY_GAME, 82, 8206, num, activitySplendidCityDao.grid, "");
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_GameAddRandomDice_17205(SplendidCityMsg.C2S_GameAddRandomDice_17205 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         SplendidCityMsg.S2C_GameAddRandomDice_17206.Builder resp = SplendidCityMsg.S2C_GameAddRandomDice_17206.newBuilder();
         resp.setDiceRecover(activitySplendidCityDao.diceRecover);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameGoldDiceBuy_17207(SplendidCityMsg.C2S_GameGoldDiceBuy_17207 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         String feeStr = ApplicationContextProvider.getConfigString("GreatCityGoldDiceBuy", "");
         List<ResourceModel> buyFeeList = ResourceModel.buildResources(feeStr);
         if (activitySplendidCityDao.buyGoldDiceNum >= buyFeeList.size()) {
            this.player.failure(25);
         } else {
            ResourceModel feeGold = (ResourceModel)buyFeeList.get(activitySplendidCityDao.buyGoldDiceNum);
            if (!this.player.checkResourceNum(feeGold)) {
               this.player.failure(31);
            } else {
               this.player.delResource(feeGold, 82, 8205, 0, 0, "");
               ++activitySplendidCityDao.buyGoldDiceNum;
               activitySplendidCityDao.updateOp();
               this.addDice("GreatCityGoldDiceID", 8205, 1);
               SplendidCityMsg.S2C_GameGoldDiceBuy_17208.Builder resp = SplendidCityMsg.S2C_GameGoldDiceBuy_17208.newBuilder();
               resp.setBuyGoldDiceNum(activitySplendidCityDao.buyGoldDiceNum);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameEvent_17209(SplendidCityMsg.C2S_GameEvent_17209 msg, String source) {
      if (!msg.hasEvent()) {
         this.player.failure(0);
      } else if (this.isServerActivityInvalid()) {
         this.player.failure(0);
      } else {
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         GreatCityGameEventModel greatCityGameEventModel = (GreatCityGameEventModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameEvent", msg.getEvent().getEventId());
         if (greatCityGameEventModel == null) {
            this.player.sendMsg(this.eventHandleDone(msg.getEvent(), activitySplendidCityDao.grid).build());
         } else {
            List<ResourceModel> rewardList = new ArrayList();
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            if (greatCityGameEventModel.getEventType() == 3) {
               SplendidCityMsg.S2C_GameEvent_17210.Builder resp = this.eventHandleDone(msg.getEvent(), activitySplendidCityDao.grid);
               GreatCityGameMapModel greatCityGameMapModel = (GreatCityGameMapModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameMap", activitySplendidCityDao.grid);
               if (greatCityGameMapModel != null) {
                  SplendidCityMsg.GameEvent.Builder nextEvent = this.triggerEvent(greatCityGameMapModel.getEventId(), rewardList);
                  if (nextEvent != null) {
                     GreatCityGameEventModel nextGameEventModel = (GreatCityGameEventModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameEvent", nextEvent.getEventId());
                     if (nextGameEventModel.getEventType() == 1) {
                        resp.setBuilding(((SplendidCityBuildData)activitySplendidCityDao.building.get(nextEvent.getEventParam(0))).buildMsg());
                     } else if (nextGameEventModel.getEventType() != 2) {
                        resp.setNextEvent(nextEvent);
                     }
                  }
               }

               this.player.sendMsg(resp.build());
               showType = PlayerMsg.ShowType.SHOW_SPLENDID_CITY_GAME;
            } else {
               if (activitySplendidCityDao.event.eventId != msg.getEvent().getEventId()) {
                  this.player.sendMsg(this.eventHandleDone(msg.getEvent(), activitySplendidCityDao.grid).build());
                  return;
               }

               if (this.eventHandle(msg.getEvent().getEventId(), msg.getEvent().getEventParamList(), rewardList) == null) {
                  return;
               }

               activitySplendidCityDao.event.clear();
               activitySplendidCityDao.updateOp();
               this.player.sendMsg(this.eventHandleDone(msg.getEvent(), activitySplendidCityDao.grid).build());
            }

            if (!rewardList.isEmpty()) {
               this.player.addResource(rewardList, showType, 82, 8213, msg.getEvent().getEventId(), 0, "");
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTask_17211(SplendidCityMsg.C2S_GameTask_17211 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         SplendidCityTaskPart splendidCityTaskPart = (SplendidCityTaskPart)this.player.getMgrPart(SplendidCityTaskPart.class);
         splendidCityTaskPart.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTaskCommit_17213(SplendidCityMsg.C2S_GameTaskCommit_17213 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         SplendidCityTaskPart splendidCityTaskPart = (SplendidCityTaskPart)this.player.getMgrPart(SplendidCityTaskPart.class);
         splendidCityTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameBuildingReward_17217(SplendidCityMsg.C2S_GameBuildingReward_17217 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, TreeMap<Integer, GreatCityGameBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GreatCityGameBuildModel>>getModelPoolMap("customGreatCityGameBuild");
         if (!buildingMap.containsKey(msg.getBuildingId())) {
            this.player.failure(0);
         } else {
            TreeMap<Integer, GreatCityGameBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(msg.getBuildingId());
            if (!curBuildModelMap.containsKey(msg.getLv())) {
               this.player.failure(0);
            } else {
               ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
               if (!activitySplendidCityDao.building.containsKey(msg.getBuildingId())) {
                  this.player.failure(0);
               } else {
                  SplendidCityBuildData splendidCityBuildData = (SplendidCityBuildData)activitySplendidCityDao.building.get(msg.getBuildingId());
                  if (splendidCityBuildData.lv < msg.getLv()) {
                     this.player.failure(0);
                  } else if (splendidCityBuildData.rewardLv.contains(msg.getLv())) {
                     this.player.failure(24);
                  } else {
                     splendidCityBuildData.rewardLv.add(msg.getLv());
                     activitySplendidCityDao.updateOp();
                     GreatCityGameBuildModel greatCityGameBuildModel = (GreatCityGameBuildModel)curBuildModelMap.get(msg.getLv());
                     this.player.addResource(greatCityGameBuildModel.getRoundRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8216, msg.getBuildingId(), msg.getLv(), "");
                     SplendidCityMsg.S2C_GameBuildingReward_17218.Builder resp = SplendidCityMsg.S2C_GameBuildingReward_17218.newBuilder();
                     resp.setBuildingId(msg.getBuildingId());
                     resp.setLv(msg.getLv());
                     this.player.sendMsg(resp.build());
                  }
               }
            }
         }
      }
   }

   public void checkDiceCountRecover() {
      if (!this.isServerActivityInvalid()) {
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int maxCount = ApplicationContextProvider.getConfigInt("GreatCityDiceUpLimit", 0);
         int recoverTime = ApplicationContextProvider.getConfigInt("GreatCityDiceTime", 10800);
         int diceNum = this.getDiceNum("GreatCityDiceID");
         if (diceNum < maxCount) {
            if (activitySplendidCityDao.diceRecover == 0) {
               if (activitySplendidCityDao.diceMaxRecover > 0) {
                  activitySplendidCityDao.diceRecover = curTime + activitySplendidCityDao.diceMaxRecover;
                  activitySplendidCityDao.diceMaxRecover = 0;
               } else {
                  activitySplendidCityDao.diceRecover = curTime + recoverTime;
               }

               activitySplendidCityDao.updateOp();
            }

            int addNum;
            for(addNum = 0; activitySplendidCityDao.diceRecover < curTime && diceNum + addNum < maxCount; ++addNum) {
               activitySplendidCityDao.diceRecover += recoverTime;
               activitySplendidCityDao.updateOp();
            }

            if (addNum > 0) {
               this.addDice("GreatCityDiceID", 8214, addNum);
               if (diceNum + addNum >= maxCount) {
                  activitySplendidCityDao.diceRecover = 0;
                  activitySplendidCityDao.updateOp();
               }
            }

         }
      }
   }

   public void checkRandomDiceMax() {
      if (!this.isServerActivityInvalid()) {
         int maxCount = ApplicationContextProvider.getConfigInt("GreatCityDiceUpLimit", 0);
         int diceNum = this.getDiceNum("GreatCityDiceID");
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         if (diceNum >= maxCount && activitySplendidCityDao.diceRecover > 0) {
            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (activitySplendidCityDao.diceRecover > curTime) {
               activitySplendidCityDao.diceMaxRecover = activitySplendidCityDao.diceRecover - curTime;
            } else {
               activitySplendidCityDao.diceMaxRecover = 0;
            }

            activitySplendidCityDao.diceRecover = 0;
            activitySplendidCityDao.updateOp();
            SplendidCityMsg.S2C_GameAddRandomDice_17206.Builder resp = SplendidCityMsg.S2C_GameAddRandomDice_17206.newBuilder();
            resp.setDiceRecover(activitySplendidCityDao.diceRecover);
            this.player.sendMsg(resp.build());
         }

      }
   }

   public void updateGameRank(int num) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.drop > DateUtil.getIntTime(System.currentTimeMillis())) {
            ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
            activitySplendidCityDao.point += num;
            activitySplendidCityDao.updateOp();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.SPLENDID_CITY, (long)activitySplendidCityDao.point, false);
         }
      }
   }

   private void resetDice(String initNumConfig, String itemConfig) {
      int initDiceNum = ApplicationContextProvider.getConfigInt(initNumConfig, 0);
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      int curNum = (int)this.player.getResourceNum(2, diceItem);
      if (curNum > initDiceNum) {
         this.player.delResource(2, diceItem, (long)(curNum - initDiceNum), 82, 8212, 0, 0, "");
      } else if (curNum < initDiceNum) {
         this.player.addResource(2, diceItem, initDiceNum - curNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 82, 8212, 0, 0, "");
      }

   }

   private int getDiceNum(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      return (int)this.player.getResourceNum(2, diceItem);
   }

   private void useDice(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.delResource(2, diceItem, 1L, 82, 8206, 0, 0, "");
   }

   private void addDice(String itemConfig, int reason, int num) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.addResource(2, diceItem, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 82, reason, 0, 0, "");
   }

   private SplendidCityMsg.GameEvent.Builder triggerEvent(int eventId, List<ResourceModel> rewardList) {
      if (eventId <= 0) {
         return null;
      } else {
         Map<Integer, TreeMap<Integer, GreatCityGameEventModel>> eventMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GreatCityGameEventModel>>getModelPoolMap("customGreatCityGameEvent");
         GreatCityGameEventModel greatCityGameEventModel;
         if (eventId == 301) {
            List<GreatCityGameEventModel> luckyEvents = new ArrayList(((TreeMap)eventMap.get(eventId)).values());
            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < luckyEvents.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((GreatCityGameEventModel)luckyEvents.get(index)).getRandOdd()));
            }

            WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightList);
            greatCityGameEventModel = (GreatCityGameEventModel)luckyEvents.get((Integer)weightRandom.next());
         } else {
            greatCityGameEventModel = (GreatCityGameEventModel)((TreeMap)eventMap.get(eventId)).firstEntry().getValue();
         }

         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         SplendidCityMsg.GameEvent.Builder eventBuilder = null;
         switch (greatCityGameEventModel.getEventType()) {
            case 1:
            case 2:
               eventBuilder = this.eventHandle(greatCityGameEventModel.getId(), greatCityGameEventModel.getParam(), rewardList);
               break;
            case 3:
               int moveNum = RandomUtil.randomInt((Integer)greatCityGameEventModel.getParam().get(0), (Integer)greatCityGameEventModel.getParam().get(1) + 1);
               List<Integer> paramList = new ArrayList();
               paramList.add(moveNum);
               eventBuilder = this.eventHandle(greatCityGameEventModel.getId(), paramList, rewardList);
               break;
            case 4:
            case 6:
               activitySplendidCityDao.event.eventId = greatCityGameEventModel.getId();
               activitySplendidCityDao.event.eventParams.clear();
               eventBuilder = SplendidCityMsg.GameEvent.newBuilder().setEventId(activitySplendidCityDao.event.eventId);
               break;
            case 5:
               activitySplendidCityDao.event.eventId = greatCityGameEventModel.getId();
               activitySplendidCityDao.event.eventParams.clear();
               Map<Integer, GreatCityGameRandomShopModel> greatCityGameRandomShopModelMap = ApplicationContextProvider.<Integer, GreatCityGameRandomShopModel>getModelPoolMap("GreatCityGameRandomShop");
               List<Integer> randomShopIds = new ArrayList(greatCityGameRandomShopModelMap.keySet());
               Collections.shuffle(randomShopIds);
               activitySplendidCityDao.event.eventParams.addAll(randomShopIds.subList(0, (Integer)greatCityGameEventModel.getParam().get(0)));
               eventBuilder = SplendidCityMsg.GameEvent.newBuilder().setEventId(activitySplendidCityDao.event.eventId).addAllEventParam(activitySplendidCityDao.event.eventParams);
         }

         activitySplendidCityDao.updateOp();
         this.player.triggerTask(667, eventId, 1L, 1);
         return eventBuilder;
      }
   }

   private SplendidCityMsg.GameEvent.Builder eventHandle(int eventId, List<Integer> eventParams, List<ResourceModel> rewardList) {
      SplendidCityMsg.GameEvent.Builder builder = SplendidCityMsg.GameEvent.newBuilder();
      builder.setEventId(eventId);
      GreatCityGameEventModel greatCityGameEventModel = (GreatCityGameEventModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameEvent", eventId);
      if (greatCityGameEventModel == null) {
         return builder;
      } else {
         switch (greatCityGameEventModel.getEventType()) {
            case 1:
               this.eventBuildUpgrade(greatCityGameEventModel, rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 2:
               for(ResourceModel reward : greatCityGameEventModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }
               break;
            case 3:
               this.eventMove((Integer)eventParams.get(0), rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 4:
               if ((Integer)eventParams.get(0) > 0) {
                  this.eventBattle(greatCityGameEventModel.getId());
               }
               break;
            case 5:
               if ((Integer)eventParams.get(0) > 0 && !this.eventBuy(greatCityGameEventModel.getId(), rewardList)) {
                  return null;
               }
               break;
            case 6:
               if (!eventParams.isEmpty()) {
                  this.eventGrant((Integer)eventParams.get(0), rewardList);
               }
         }

         return builder;
      }
   }

   private void sendGameMain() {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         SplendidCityMsg.S2C_GameMain_17202.Builder resp = SplendidCityMsg.S2C_GameMain_17202.newBuilder();
         resp.setGrid(activitySplendidCityDao.grid);
         resp.setDiceRecover(activitySplendidCityDao.diceRecover);
         resp.setBuyGoldDiceNum(activitySplendidCityDao.buyGoldDiceNum);
         Map<Integer, TreeMap<Integer, GreatCityGameBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GreatCityGameBuildModel>>getModelPoolMap("customGreatCityGameBuild");

         for(int buildId : buildingMap.keySet()) {
            SplendidCityBuildData splendidCityBuildData = (SplendidCityBuildData)activitySplendidCityDao.building.get(buildId);
            if (splendidCityBuildData != null) {
               resp.addBuilding(splendidCityBuildData.buildMsg());
            } else {
               resp.addBuilding(SplendidCityMsg.GameBuilding.newBuilder().setBuildId(buildId).setLv(0));
            }
         }

         if (activitySplendidCityDao.event.eventId > 0) {
            resp.setEvent(SplendidCityMsg.GameEvent.newBuilder().setEventId(activitySplendidCityDao.event.eventId).addAllEventParam(activitySplendidCityDao.event.eventParams));
         }

         this.player.sendMsg(resp.build());
      }
   }

   public void gameGm(String cmd) {
      String[] split = cmd.split("\\|");
      switch (split[0]) {
         case "eventhandle":
            String[] eventParams = split[1].split(",");
            int eventId = Integer.parseInt(eventParams[0]);
            List<Integer> params = new ArrayList();
            if (eventParams.length > 1) {
               for(String s : eventParams[1].split(":")) {
                  params.add(Integer.parseInt(s));
               }
            }

            List<ResourceModel> resourceModels = new ArrayList();
            this.eventHandle(eventId, params, resourceModels);
            if (!resourceModels.isEmpty()) {
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_SPLENDID_CITY_GAME, 82, 8206, eventId, 0, "");
            }
            break;
         case "rolldice":
            this.rollDice(2, Integer.parseInt(split[1]));
      }

      this.sendGameMain();
   }

   private SplendidCityMsg.S2C_GameEvent_17210.Builder eventHandleDone(SplendidCityMsg.GameEvent gameEvent, int grid) {
      SplendidCityMsg.S2C_GameEvent_17210.Builder resp = SplendidCityMsg.S2C_GameEvent_17210.newBuilder();
      resp.setEvent(gameEvent);
      resp.setGrid(grid);
      return resp;
   }

   private void eventBuildUpgrade(GreatCityGameEventModel greatCityGameEventModel, List<ResourceModel> rewardList) {
      int buildId = (Integer)greatCityGameEventModel.getParam().get(0);
      Map<Integer, TreeMap<Integer, GreatCityGameBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GreatCityGameBuildModel>>getModelPoolMap("customGreatCityGameBuild");
      if (!buildingMap.containsKey(buildId)) {
         this.logger.error("玩家【{}】升级建筑【{}】失败,建筑配置不存在", this.player.getPlayerId(), buildId);
      } else {
         ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
         TreeMap<Integer, GreatCityGameBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(buildId);
         SplendidCityBuildData splendidCityBuildData = (SplendidCityBuildData)activitySplendidCityDao.building.get(buildId);
         if (splendidCityBuildData == null) {
            splendidCityBuildData = new SplendidCityBuildData();
            splendidCityBuildData.buildId = buildId;
         }

         if (splendidCityBuildData.lv >= (Integer)curBuildModelMap.lastKey()) {
            GreatCityGameBuildModel greatCityGameBuildModel = (GreatCityGameBuildModel)curBuildModelMap.get(splendidCityBuildData.lv);

            for(ResourceModel reward : greatCityGameBuildModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }

         } else if (!curBuildModelMap.containsKey(splendidCityBuildData.lv + 1)) {
            this.logger.error("玩家【{}】升级建筑【{}】失败,等级【{}】配置不存在", new Object[]{this.player.getPlayerId(), buildId, splendidCityBuildData.lv + 1});
         } else {
            ++splendidCityBuildData.lv;
            activitySplendidCityDao.building.put(buildId, splendidCityBuildData);
            activitySplendidCityDao.updateOp();
            GreatCityGameBuildModel greatCityGameBuildModel = (GreatCityGameBuildModel)curBuildModelMap.get(splendidCityBuildData.lv);

            for(ResourceModel reward : greatCityGameBuildModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }

            this.player.triggerTask(668, buildId, (long)splendidCityBuildData.lv, 0);
         }
      }
   }

   private GreatCityGameMapModel eventMove(int num, List<ResourceModel> rewardList) {
      if (num <= 6 && num >= -6) {
         Map<Integer, GreatCityGameMapModel> greatCityGameMapModelMap = ApplicationContextProvider.<Integer, GreatCityGameMapModel>getModelPoolMap("GreatCityGameMap");
         if (greatCityGameMapModelMap != null && !greatCityGameMapModelMap.isEmpty()) {
            ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
            int curGrid = activitySplendidCityDao.grid + num;
            if (curGrid < 0) {
               curGrid += greatCityGameMapModelMap.size();
            } else if (curGrid > greatCityGameMapModelMap.size()) {
               curGrid -= greatCityGameMapModelMap.size();
               Map<Integer, TreeMap<Integer, GreatCityGameBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GreatCityGameBuildModel>>getModelPoolMap("customGreatCityGameBuild");

               for(SplendidCityBuildData splendidCityBuildData : activitySplendidCityDao.building.values()) {
                  if (buildingMap.containsKey(splendidCityBuildData.buildId)) {
                     TreeMap<Integer, GreatCityGameBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(splendidCityBuildData.buildId);
                     if (curBuildModelMap.containsKey(splendidCityBuildData.lv)) {
                        GreatCityGameBuildModel greatCityGameBuildModel = (GreatCityGameBuildModel)curBuildModelMap.get(splendidCityBuildData.lv);

                        for(ResourceModel roundReward : greatCityGameBuildModel.getRoundRewards()) {
                           roundReward.addResourceToList(rewardList);
                        }
                     }
                  }
               }
            }

            GreatCityGameMapModel greatCityGameMapModel = (GreatCityGameMapModel)greatCityGameMapModelMap.get(curGrid);
            if (greatCityGameMapModel == null) {
               return null;
            } else {
               activitySplendidCityDao.grid = curGrid;
               activitySplendidCityDao.updateOp();
               return greatCityGameMapModel;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void eventBattle(int eventId) {
      Map<Integer, GreatCityGameBattleModel> greatCityGameBattleModelMap = ApplicationContextProvider.<Integer, GreatCityGameBattleModel>getModelPoolMap("GreatCityGameBattle");
      if (greatCityGameBattleModelMap != null && !greatCityGameBattleModelMap.isEmpty()) {
         TreeSet<Integer> greatCityGameBattleIds = new TreeSet(greatCityGameBattleModelMap.keySet());
         GreatCityGameBattleModel matchModel = null;

         for(int id : greatCityGameBattleIds) {
            GreatCityGameBattleModel greatCityGameBattleModel = (GreatCityGameBattleModel)greatCityGameBattleModelMap.get(id);
            if (this.player.getMaxPlayerCombatPower() >= (long)greatCityGameBattleModel.getPowerStart() && this.player.getMaxPlayerCombatPower() <= (long)greatCityGameBattleModel.getPowerEnd()) {
               matchModel = greatCityGameBattleModel;
               break;
            }
         }

         if (matchModel == null) {
            matchModel = (GreatCityGameBattleModel)greatCityGameBattleModelMap.get(greatCityGameBattleIds.last());
         }

         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         BattleMsg.C2S_BattleBegin_6107.Builder builder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
         builder.setModelId(matchModel.getId());
         builder.setType(3661);
         builder.addParams(eventId);
         battlePart.begin(builder.build(), "");
      }
   }

   public int enterBattle(BattleDao battleDao) {
      GreatCityGameBattleModel greatCityGameBattleModel = (GreatCityGameBattleModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameBattle", battleDao.modelId);
      BattlePKTeam rightTeam = new BattlePKTeam(greatCityGameBattleModel.getBattleId());
      battleDao.scene.addPKTeam((byte)1, rightTeam);
      battleDao.scene.setMaxRound((byte)greatCityGameBattleModel.getRound());
      battleDao.scene.setBattleId(greatCityGameBattleModel.getBattleId());
      return 1;
   }

   public void afterBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         GreatCityGameBattleModel greatCityGameBattleModel = (GreatCityGameBattleModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameBattle", battleDao.modelId);
         battleDao.rewards.addAll(greatCityGameBattleModel.getRewards());
         battleDao.updateOp();
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

         for(ResourceModel rewardItem : battleDao.rewards) {
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setId(rewardItem.getId()).setType(rewardItem.getType()).setNum(rewardItem.getValue()));
         }

         battleDao.scene.getBattleMsg().setResult(result);
      }
   }

   public void endBattle(BattleDao battleDao) {
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8213, (Integer)battleDao.params.get(0), battleDao.modelId, "");
      }
   }

   private boolean eventBuy(int eventId, List<ResourceModel> rewardList) {
      ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
      List<ResourceModel> feeResourceList = new ArrayList();

      for(int eventParam : activitySplendidCityDao.event.eventParams) {
         GreatCityGameRandomShopModel greatCityGameRandomShopModel = (GreatCityGameRandomShopModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameRandomShop", eventParam);
         if (greatCityGameRandomShopModel != null) {
            feeResourceList.addAll(greatCityGameRandomShopModel.getResource());

            for(ResourceModel reward : greatCityGameRandomShopModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }
         }
      }

      if (!this.player.checkResourceNum(feeResourceList)) {
         return this.player.failure(31);
      } else {
         this.player.delResource((List)feeResourceList, 82, 8213, eventId, 0, "");
         return true;
      }
   }

   private void eventGrant(int grantIndex, List<ResourceModel> rewardList) {
      Map<Integer, GreatCityGameChooseModel> greatCityGameChooseModelMap = ApplicationContextProvider.<Integer, GreatCityGameChooseModel>getModelPoolMap("GreatCityGameChoose");
      if (greatCityGameChooseModelMap != null && !greatCityGameChooseModelMap.isEmpty()) {
         List<GreatCityGameChooseModel> greatCityGameChooseModels = new ArrayList(greatCityGameChooseModelMap.values());
         Collections.shuffle(greatCityGameChooseModels);
         ResourceModel rewardModel = (ResourceModel)((GreatCityGameChooseModel)greatCityGameChooseModels.get(0)).getRewards().get(grantIndex);
         rewardModel.addResourceToList(rewardList);
      }
   }

   public int getSmashEggStage() {
      Map<Integer, GreatCityLotteryItemModel> allMap = this.player.getGameModelPool().getMap("GreatCityLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(GreatCityLotteryItemModel model : allMap.values()) {
            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                  return model.getStage();
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
               return model.getStage();
            }
         }
      }

      return 1;
   }

   @MsgHandlerAnno
   public void C2S_OpenEggUi_17229(SplendidCityMsg.C2S_OpenEggUi_17229 msg, String source) {
      ActivitySplendidCityDao dao = this.getDao();
      SplendidCityMsg.S2C_OpenEggUi_17230.Builder builder = SplendidCityMsg.S2C_OpenEggUi_17230.newBuilder();
      builder.setFancyId(dao.fancyRewardId);
      builder.setSmashEggNum(dao.smashEggNum);
      builder.addAllTakedLuck(dao.takedLuck);

      for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      for(Map.Entry<Integer, Integer> entry : dao.eggs.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addEggs(info);
      }

      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_17221(SplendidCityMsg.C2S_FancyReward_17221 msg, String source) {
      ActivitySplendidCityDao dao = this.getDao();
      GreatCityLotteryItemModel cityLotteryItemModel = (GreatCityLotteryItemModel)this.player.getGameModelPool().getEntity("GreatCityLotteryItem", msg.getItemIndex());
      if (cityLotteryItemModel != null) {
         int openDay = this.getActivityOpenDay();
         if (cityLotteryItemModel.getDateEnd() == -1) {
            if (cityLotteryItemModel.getDateStart() > openDay) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), openDay});
               return;
            }
         } else if (openDay < cityLotteryItemModel.getDateStart() || openDay > cityLotteryItemModel.getDateEnd()) {
            this.player.failure(0);
            this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), openDay});
            return;
         }

         int activityDay = this.getSeverActivityDay();
         if (activityDay >= cityLotteryItemModel.getStageStart() && activityDay <= cityLotteryItemModel.getStageEnd()) {
            if (cityLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), cityLotteryItemModel.getItemGroup()});
            } else if (cityLotteryItemModel.getSurplusNum() > 0 && dao.seniorRewards.containsKey(cityLotteryItemModel.getId()) && (Integer)dao.seniorRewards.get(cityLotteryItemModel.getId()) >= cityLotteryItemModel.getSurplusNum()) {
               this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(cityLotteryItemModel.getId()), cityLotteryItemModel.getSurplusNum());
            } else {
               dao.fancyRewardId = msg.getItemIndex();
               dao.updateOp();
               SplendidCityMsg.S2C_FancyReward_17222.Builder builder = SplendidCityMsg.S2C_FancyReward_17222.newBuilder();
               builder.setResult(1);
               builder.setItemIndex(msg.getItemIndex());
               this.player.sendMsg(builder.build());
            }
         } else {
            this.player.failure(0);
            this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), cityLotteryItemModel.getId(), activityDay});
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SmashEgg_17223(SplendidCityMsg.C2S_SmashEgg_17223 msg, String source) {
      if (msg.getNum() <= 0) {
         this.player.failure(0);
      } else {
         ActivitySplendidCityDao dao = this.getDao();
         if (dao.fancyRewardId <= 0) {
            this.player.failure(76014);
         } else {
            int greatCityAllEggNum = this.configManager.getIntDefault("greatCityAllEggNum", 30);
            if (dao.eggs.size() >= greatCityAllEggNum) {
               this.logger.error(" 砸蛋数量错误，size={}", dao.eggs.size());
            } else if (msg.getNum() > greatCityAllEggNum - dao.eggs.size()) {
               this.logger.error("砸蛋次数不够，size={}", dao.eggs.size());
            } else {
               int GreatCityLotteryCost = this.configManager.getIntDefault("GreatCityLotteryCost", 1203);
               ResourceModel needModel = new ResourceModel(2, GreatCityLotteryCost, msg.getNum());
               if (this.player.checkResourceNum(needModel)) {
                  if (msg.getIndex() > 0 && dao.eggs.containsKey(msg.getIndex())) {
                     this.logger.error("指定的蛋已经砸过了,指定ID={}，已砸出的物品顺序={}", msg.getIndex(), dao.eggs.get(msg.getIndex()));
                     this.player.failure(0);
                  } else {
                     int openDay = this.getActivityOpenDay();
                     int activityDay = this.getSeverActivityDay();
                     Map<Integer, GreatCityLotteryItemModel> itemModelMap = this.getGreatCityLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        GreatCityLotteryItemModel enjoyModel = (GreatCityLotteryItemModel)this.player.getGameModelPool().getEntity("GreatCityLotteryItem", dao.fancyRewardId);
                        Map<Integer, Integer> resultMap = new HashMap();
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < msg.getNum(); ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           GreatCityLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
                           if (itemModel == null) {
                              return;
                           }

                           this.recordServer(itemModel);
                           resourceModels.addAll(itemModel.getRewards());
                           if (itemModel.getItemGroup() == 1) {
                              isHaveFancy = true;
                              dao.fancyRewardId = 0;
                              dao.roundSmashNum.put(itemModel.getItemGroup(), 0);
                              int oldNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, itemModel.getId(), 0);
                              dao.seniorRewards.put(itemModel.getId(), oldNum + 1);
                           } else if (itemModel.getItemGroup() == 2) {
                              if (itemModel.getPreposeNum() > 0 || itemModel.getMustNum() > 0) {
                                 dao.roundSmashNum.put(itemModel.getItemGroup(), 0);
                              }

                              int oldNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, itemModel.getId(), 0);
                              dao.seniorRewards.put(itemModel.getId(), oldNum + 1);
                           } else {
                              int oldSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, itemModel.getItemGroup(), 0);
                              dao.roundSmashNum.put(itemModel.getItemGroup(), oldSmashNum + 1);
                           }

                           ++dao.smashEggNum;
                           if (resultMap.isEmpty() && msg.getIndex() >= 0) {
                              resultMap.put(msg.getIndex(), itemModel.getId());
                              dao.eggs.put(msg.getIndex(), itemModel.getId());
                           } else {
                              int index = this.getRandomIndex(greatCityAllEggNum, dao);
                              resultMap.put(index, itemModel.getId());
                              dao.eggs.put(index, itemModel.getId());
                           }

                           for(ResourceModel resourceModel : itemModel.getRewards()) {
                              addList.add(resourceModel);
                           }
                        }

                        dao.updateOp();
                        boolean isRest = false;
                        if (dao.eggs.size() >= greatCityAllEggNum) {
                           isRest = true;
                           dao.eggs.clear();
                           dao.updateOp();
                        }

                        int createTime = DateUtil.getIntTime(System.currentTimeMillis());

                        for(ResourceModel resourceModel : resourceModels) {
                           ActivitySplendidCityDao.RecordInfo recordInfo = new ActivitySplendidCityDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource(needModel, 82, 8210, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_SPLENDID_CITY_EGG, 82, 8210, 0, 0, "");
                        SplendidCityMsg.S2C_SmashEgg_17224.Builder builder = SplendidCityMsg.S2C_SmashEgg_17224.newBuilder();
                        builder.setResult(1);
                        builder.setIndex(msg.getIndex());
                        builder.setIsReset(isRest);
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));

                        for(Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addIndexs(info);
                        }

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setSmashEggNum(dao.smashEggNum);
                        this.player.sendMsg(builder.build());
                        int itemId = 0;
                        int itemNum = 0;

                        for(ResourceModel resourceModel : addList) {
                           itemId = resourceModel.getId();
                           itemNum = resourceModel.getValue();
                        }

                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "景秀都城-砸蛋", itemId + "", itemNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public int getRandomIndex(int greatCityAllEggNum, ActivitySplendidCityDao dao) {
      List<Integer> list = new ArrayList();

      for(int i = 0; i < greatCityAllEggNum; ++i) {
         if (!dao.eggs.containsKey(i)) {
            list.add(i);
         }
      }

      int index = misc.RandomUtil.randInt(list.size());
      return (Integer)list.get(index);
   }

   public Map<Integer, GreatCityLotteryItemModel> getGreatCityLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, GreatCityLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("GreatCityLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, GreatCityLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, GreatCityLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((GreatCityLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((GreatCityLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((GreatCityLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((GreatCityLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((GreatCityLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((GreatCityLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   public GreatCityLotteryItemModel smashEgg(ActivitySplendidCityDao dao, Map<Integer, GreatCityLotteryItemModel> itemModelMap) {
      Map<Integer, GreatCityLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(Map.Entry<Integer, GreatCityLotteryItemModel> entry : itemModelMap.entrySet()) {
         if (!dao.seniorRewards.containsKey(entry.getKey()) || ((GreatCityLotteryItemModel)entry.getValue()).getSurplusNum() <= 0 || (Integer)dao.seniorRewards.get(entry.getKey()) <= ((GreatCityLotteryItemModel)entry.getValue()).getSurplusNum()) {
            int roundSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, ((GreatCityLotteryItemModel)entry.getValue()).getItemGroup(), 0);
            if (((GreatCityLotteryItemModel)entry.getValue()).getPreposeNum() <= 0 || roundSmashNum >= ((GreatCityLotteryItemModel)entry.getValue()).getPreposeNum()) {
               if (((GreatCityLotteryItemModel)entry.getValue()).getItemGroup() == 1) {
                  if (dao.fancyRewardId > 0 && dao.fancyRewardId == (Integer)entry.getKey()) {
                     if (((GreatCityLotteryItemModel)entry.getValue()).getMustNum() > 0 && roundSmashNum >= ((GreatCityLotteryItemModel)entry.getValue()).getMustNum()) {
                        return (GreatCityLotteryItemModel)entry.getValue();
                     }

                     tempMap.put(entry.getKey(), entry.getValue());
                     totalOdds += ((GreatCityLotteryItemModel)entry.getValue()).getRealOdd();
                  }
               } else {
                  if (((GreatCityLotteryItemModel)entry.getValue()).getMustNum() > 0 && roundSmashNum >= ((GreatCityLotteryItemModel)entry.getValue()).getMustNum()) {
                     return (GreatCityLotteryItemModel)entry.getValue();
                  }

                  tempMap.put(entry.getKey(), entry.getValue());
                  totalOdds += ((GreatCityLotteryItemModel)entry.getValue()).getRealOdd();
               }
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = misc.RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(Map.Entry<Integer, GreatCityLotteryItemModel> entry : tempMap.entrySet()) {
            loop += ((GreatCityLotteryItemModel)entry.getValue()).getRealOdd();
            if (loop > r) {
               return (GreatCityLotteryItemModel)entry.getValue();
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeLuckReward_17227(SplendidCityMsg.C2S_TakeLuckReward_17227 msg, String source) {
      ActivitySplendidCityDao activitySplendidCityDao = this.getDao();
      if (!activitySplendidCityDao.takedLuck.contains(msg.getRewardId())) {
         GreatCityAddupLuckyModel model = (GreatCityAddupLuckyModel)this.player.getGameModelPool().getEntity("GreatCityAddupLucky", msg.getRewardId());
         if (model != null) {
            if (activitySplendidCityDao.smashEggNum >= model.getAddupNum()) {
               int openDay = this.getActivityOpenDay();
               if (model.getDateEnd() == -1) {
                  if (openDay < model.getDateStart()) {
                     return;
                  }
               } else if (openDay < model.getDateStart() || openDay > model.getDateEnd()) {
                  return;
               }

               activitySplendidCityDao.takedLuck.add(msg.getRewardId());
               activitySplendidCityDao.updateOp();
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8209, 0, 0, "");
               SplendidCityMsg.S2C_TakeLuckReward_17228.Builder builder = SplendidCityMsg.S2C_TakeLuckReward_17228.newBuilder();
               builder.setResult(1);
               builder.addAllTakedId(activitySplendidCityDao.takedLuck);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void gmTest(String orderStr) {
      String[] orders = orderStr.split(",");
      if (orders.length < 1) {
         this.logger.info("GM命令参数错误，oder={}", orderStr);
      } else {
         for (String cmd : orders){
            switch (cmd.toLowerCase()) {
               case "clearegg":
                  this.resetEggs();
               default:
            }
         }
      }
   }

   public void resetEggs() {
      ActivitySplendidCityDao dao = this.getDao();
      dao.fancyRewardId = 0;
      dao.eggs.clear();
      dao.smashEggNum = 0;
      dao.roundSmashNum.clear();
      dao.takedLuck.clear();
      dao.seniorRewards.clear();
      dao.updateOp();
      this.C2S_OpenEggUi_17229((SplendidCityMsg.C2S_OpenEggUi_17229)null, (String)null);
   }

   public void activityRecharge(int money) {
      this.addUpRechargeHandle(money, true);
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_17270(SplendidCityMsg.C2S_ActivityInfo_17270 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      SplendidCityMsg.S2C_ActivityInfo_17271.Builder builder = SplendidCityMsg.S2C_ActivityInfo_17271.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      builder.setSmashEggStage(this.getSmashEggStage());
      this.player.sendMsg(builder.build());
   }

   public List<GreatCityAddUpRechargeModel> getAddUpRewardByStage(int stage) {
      List<GreatCityAddUpRechargeModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      List<GreatCityAddUpRechargeModel> stageModelList = (List)this.player.getGameModelPool().getEntity("customGreatCityAddupRecharge", stage);
      if (null != stageModelList && stageModelList.size() > 0) {
         for(GreatCityAddUpRechargeModel model : stageModelList) {
            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart()) {
                  modelList.add(model);
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd()) {
               modelList.add(model);
            }
         }

         return modelList;
      } else {
         this.logger.info("{}阶段的GreatCityAddupRecharge为空，请检查配置表", stage);
         return modelList;
      }
   }

   public GreatCityAddUpRechargeModel getGreatCityAddUpRechargeModel(int id) {
      GreatCityAddUpRechargeModel model = (GreatCityAddUpRechargeModel)this.player.getGameModelPool().getEntity("GreatCityAddupRecharge", id);
      return model;
   }

   public boolean isStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getRechargeStage();
      ActivitySplendidCityDao dao = this.getDao();
      if (nowStage != dao.stage) {
         this.sendAddUpNotReceiveRewardMail();
         dao.stage = nowStage;
         dao.updateOp();
         this.sendAddUpRechargeRewardInfo();
         return true;
      } else {
         return false;
      }
   }

   public int getRechargeStage() {
      int stage = 1;
      Map<Integer, GreatCityAddUpRechargeModel> allMap = this.player.getGameModelPool().getMap("GreatCityAddupRecharge");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay <= 0) {
            return stage;
         }

         for(GreatCityAddUpRechargeModel model : allMap.values()) {
            if (model.getStage() > stage) {
               stage = model.getStage();
            }

            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                  return model.getStage();
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
               return model.getStage();
            }
         }
      }

      return stage;
   }

   public void addUpRechargeHandle(int money, boolean sendMsg) {
      int addMoney = money;
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
      if (null == activityRecharge) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         addMoney = dailyRecharge > 0 ? dailyRecharge : money;
      }

      playerActivityDao.activityRecharge.put(this.getActivityType(), (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0) + addMoney);
      playerActivityDao.updateOp();
      this.isStageChange();
      ActivitySplendidCityDao dao = this.getDao();
      dao.stageRechargeMoney += addMoney;
      dao.updateOp();
      if (sendMsg) {
         this.sendAddUpRechargeRewardInfo();
      }

   }

   public void sendAddUpNotReceiveRewardMail() {
      ActivitySplendidCityDao dao = this.getDao();
      List<GreatCityAddUpRechargeModel> modelList = this.getAddUpRewardByStage(dao.stage);
      if (null != modelList && modelList.size() > 0) {
         List<Integer> notReceiveIdList = new ArrayList();
         List<ResourceModel> notReceiveRewardList = new ArrayList();

         for(GreatCityAddUpRechargeModel model : modelList) {
            Integer rewardId = model.getId();
            if (this.checkUnlockAddUpReward(rewardId) && !dao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
               notReceiveIdList.add(rewardId);
               notReceiveRewardList.addAll(model.getRewards());
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_GREAT_CITY_ADD_UP_REWARD);
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 85, 8501);
         }

         if (notReceiveIdList.size() > 0) {
            dao.addUpGotRewards.addAll(notReceiveIdList);
            dao.updateOp();
         }
      }

      dao.stageRechargeMoney = 0;
      dao.updateOp();
   }

   public void addUpActivityEnd() {
      this.checkAddUpIdListChange();
      this.sendAddUpNotReceiveRewardMail();
      ActivitySplendidCityDao dao = this.getDao();
      dao.stage = 1;
      dao.addUpGotRewards.clear();
      dao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_AddUpTotalInfo_17253(SplendidCityMsg.C2S_AddUpTotalInfo_17253 msg, String source) {
      this.sendAddUpRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveAddUpReward_17255(SplendidCityMsg.C2S_ReceiveAddUpReward_17255 msg, String source) {
      this.isStageChange();
      int rewardId = msg.getRewardId();
      ActivitySplendidCityDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (addUpGotRewards.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         GreatCityAddUpRechargeModel model = this.getGreatCityAddUpRechargeModel(rewardId);
         if (null == model) {
            return this.player.failure(37);
         } else if (!this.checkAddUpRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            return this.player.failure(61224);
         } else if (!this.checkUnlockAddUpReward(rewardId)) {
            return this.player.failure(61212);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 85, 8501, 0, 0, "");
            dao.addUpGotRewards.add(rewardId);
            dao.updateOp();
            this.sendAddUpRechargeRewardInfo();
            return true;
         }
      }
   }

   public boolean checkAddUpRewardStage(int id) {
      GreatCityAddUpRechargeModel model = (GreatCityAddUpRechargeModel)this.player.getGameModelPool().getEntity("GreatCityAddupRecharge", id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         ActivitySplendidCityDao dao = this.getDao();
         if (model.getDateEnd() == -1) {
            if (activityStartDay >= model.getDateStart() && dao.stage == model.getStage()) {
               return true;
            }
         } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && dao.stage == model.getStage()) {
            return true;
         }

         return false;
      }
   }

   public boolean checkUnlockAddUpReward(int id) {
      GreatCityAddUpRechargeModel model = this.getGreatCityAddUpRechargeModel(id);
      if (null == model) {
         return false;
      } else {
         ActivitySplendidCityDao dao = this.getDao();
         return dao.stageRechargeMoney >= model.getRechargeNum();
      }
   }

   public void sendAddUpRechargeRewardInfo() {
      SplendidCityMsg.S2C_AddUpTotalInfo_17254.Builder resp = SplendidCityMsg.S2C_AddUpTotalInfo_17254.newBuilder();
      ActivitySplendidCityDao dao = this.getDao();
      resp.addAllGotRewards(dao.addUpGotRewards);
      resp.setStageRecharge(dao.stageRechargeMoney);
      this.player.sendMsg(resp.build());
   }

   public void checkAddUpIdListChange() {
      ActivitySplendidCityDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!addUpGotRewards.isEmpty()) {
         Map<Integer, GreatCityAddUpRechargeModel> stageModelMap = this.player.getGameModelPool().getMap("GreatCityAddupRecharge");
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<GreatCityAddUpRechargeModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(GreatCityAddUpRechargeModel model : stageModelMap.values()) {
               if (model.getDateEnd() == -1) {
                  if (activityOpenDay >= model.getDateStart()) {
                     addUpIdSet.add(model.getId());
                     addUpRechargeModelList.add(model);
                  }
               } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
                  addUpIdSet.add(model.getId());
                  addUpRechargeModelList.add(model);
               }
            }

            if (addUpIdSet.size() <= 0) {
               this.logger.info("活动id:{} 累充配置表为空，请检查配置表", this.getActivityType());
            } else {
               int nowAddUpStage = this.getRechargeStage();
               if (addUpIdSet.containsAll(addUpGotRewards) && dao.stage > nowAddUpStage || !addUpIdSet.containsAll(addUpGotRewards)) {
                  Set<Integer> newAddUpGotRewards = new HashSet();

                  for(int id : addUpGotRewards) {
                     GreatCityAddUpRechargeModel addUpModel = this.getGreatCityAddUpRechargeModel(id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(GreatCityAddUpRechargeModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(GreatCityAddUpRechargeModel addUpRechargeModel : addUpRechargeModelList) {
                              if (addUpRechargeModel.getStage() == modelStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                 newAddUpGotRewards.add(addUpRechargeModel.getId());
                                 break;
                              }
                           }
                        }
                     }
                  }

                  if (dao.stage > nowAddUpStage) {
                     dao.stage = nowAddUpStage;
                  }

                  dao.addUpGotRewards.clear();
                  dao.addUpGotRewards.addAll(newAddUpGotRewards);
                  dao.updateOp();
               }

            }
         } else {
            this.logger.info("活动id:{} 累充配置表为空，请检查配置表", this.getActivityType());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SignTotalInfo_17256(SplendidCityMsg.C2S_SignTotalInfo_17256 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      SplendidCityMsg.S2C_SignTotalInfo_17257.Builder builder = SplendidCityMsg.S2C_SignTotalInfo_17257.newBuilder();
      ActivitySplendidCityDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      GreatCitySignAwardModel model = (GreatCitySignAwardModel)this.player.getGameModelPool().getEntity("GreatCitySignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActivitySplendidCityDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_17258(SplendidCityMsg.C2S_Sign_17258 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         GreatCitySignAwardModel model = (GreatCitySignAwardModel)this.player.getGameModelPool().getEntity("GreatCitySignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 85, 8502, 0, 0, "");
         ActivitySplendidCityDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActivitySplendidCityDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivitySplendidCityDao dao = this.getDao();
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dao.dailyRecharge = playerRechargeDao.dailyRecharge;
            dao.updateOp();
         }

         if (sendMsg) {
            this.sendShopAddUpInfo();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ShopAddUpInfo_17259(SplendidCityMsg.C2S_ShopAddUpInfo_17259 msg, String source) {
      this.sendShopAddUpInfo();
   }

   public void sendShopAddUpInfo() {
      SplendidCityMsg.S2C_ShopAddUpInfo_17260.Builder builder = SplendidCityMsg.S2C_ShopAddUpInfo_17260.newBuilder();
      ActivitySplendidCityDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(dao.shopAddUpGotRewards);
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpReset() {
      ActivitySplendidCityDao dao = this.getDao();
      Map<Integer, GreatCityShopAddUpModel> shopAddUpModelMap = this.player.getGameModelPool().getMap("GreatCityShopAddup");
      List<ResourceModel> notReceiveRewards = new ArrayList();

      for(GreatCityShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !dao.shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_GREAT_CITY_SHOP_ADD_UP_REWARD);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, 85, 8503);
      }

      dao.shopAddUpGotRewards.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      GreatCityShopAddUpModel shopAddUpModel = (GreatCityShopAddUpModel)this.player.getGameModelPool().getEntity("GreatCityShopAddup", id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivitySplendidCityDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(61212) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_17261(SplendidCityMsg.C2S_ReceiveShopAddUpReward_17261 msg, String source) {
      int id = msg.getId();
      ActivitySplendidCityDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = dao.shopAddUpGotRewards;
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         GreatCityShopAddUpModel shopAddUpModel = (GreatCityShopAddUpModel)this.player.getGameModelPool().getEntity("GreatCityShopAddup", id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 85, 8503, 0, 0, "");
         dao.shopAddUpGotRewards.add(id);
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   private void recordServer(GreatCityLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadSplendidCityRecord_4260.Builder builder = CrossMsg.S2CR_UploadSplendidCityRecord_4260.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_17272(SplendidCityMsg.C2S_DrawRecord_17272 msg, String source) {
      SplendidCityMsg.S2C_DrawRecord_17273.Builder builder = SplendidCityMsg.S2C_DrawRecord_17273.newBuilder();
      ActivitySplendidCityDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         SplendidCityMsg.MyDrawRecord.Builder drawRecord = SplendidCityMsg.MyDrawRecord.newBuilder();
         drawRecord.setCreateTime(Integer.parseInt(arr[0]));
         String[] split = arr[1].split("_");
         CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
         itemInfo.setType(Integer.parseInt(split[0]));
         itemInfo.setId(Integer.parseInt(split[1]));
         itemInfo.setNum(Integer.parseInt(split[2]));
         drawRecord.addItemInfo(itemInfo);
         builder.addMyRecord(drawRecord);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ServerDrawRecord_17274(SplendidCityMsg.C2S_ServerDrawRecord_17274 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      GreatCityLotteryItemModel model = (GreatCityLotteryItemModel)this.player.getGameModelPool().getEntity("GreatCityLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, GreatCityLotteryItemModel> lotteryItemMap = this.getGreatCityLotteryItemMap(model.getDateStart(), model.getStageStart());
         Map<Integer, DrawViewLogInfo> drawViewLogInfoMap = new HashMap();
         int n = 1;

         while(true) {
            int endNum = n * 50;
            int startNum = endNum - 49;
            int getFancyNum = 0;

            for(int i = startNum; i <= endNum; ++i) {
               int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, 1, 0);
               drawViewData.roundSmashNum.put(1, oldSmashNum_1 + 1);
               int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, 2, 0);
               drawViewData.roundSmashNum.put(2, oldSmashNum_2 + 1);
               GreatCityLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
               if (lotteryItemModel.getItemGroup() == 1) {
                  drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), 0);
               } else if (lotteryItemModel.getItemGroup() == 2) {
                  if (lotteryItemModel.getPreposeNum() > 0 || lotteryItemModel.getMustNum() > 0) {
                     drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), 0);
                  }
               } else {
                  int oldSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
                  drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), oldSmashNum + 1);
               }

               if (lotteryItemModel != null && lotteryItemModel.getId() == lotteryId) {
                  ++getFancyNum;
                  ++initRound;
                  break;
               }
            }

            if (getFancyNum > 0) {
               n = 0;
            }

            DrawViewLogInfo logInfo = (DrawViewLogInfo)drawViewLogInfoMap.get(startNum);
            if (null == logInfo) {
               logInfo = new DrawViewLogInfo(startNum, endNum, getFancyNum);
            } else {
               int oldGetFancyNum = logInfo.getGetFancyNum();
               logInfo.setGetFancyNum(oldGetFancyNum + getFancyNum);
            }

            drawViewLogInfoMap.put(startNum, logInfo);
            if (initRound >= round) {
               if (!drawViewLogInfoMap.isEmpty()) {
                  String infoStr = "{0}~{1}次抽中目标奖励，{2}次，占比{3}%";

                  for(Map.Entry<Integer, DrawViewLogInfo> entry : drawViewLogInfoMap.entrySet()) {
                      logInfo = (DrawViewLogInfo)entry.getValue();
                     double proportion = (double)logInfo.getGetFancyNum() / (double)round * (double)100.0F;
                     String format = MessageFormat.format(infoStr, logInfo.getStartNum(), logInfo.getEndNum(), logInfo.getGetFancyNum(), proportion);
                     this.logger.info(format);
                  }
               }

               return true;
            }

            ++n;
         }
      }
   }

   private GreatCityLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, GreatCityLotteryItemModel> itemModelMap) {
      Map<Integer, GreatCityLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(GreatCityLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     return lotteryItemModel;
                  }

                  tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
                  totalOdds += lotteryItemModel.getRealOdd();
               }
            } else {
               if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                  return lotteryItemModel;
               }

               tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
               totalOdds += lotteryItemModel.getRealOdd();
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = misc.RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(GreatCityLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
