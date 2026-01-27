package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.FlowerFireDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.BattleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FlowerFireAddupAwardModel;
import com.gzbz.model.FlowerFireAstrolabeItemModel;
import com.gzbz.model.FlowerFireBattleAwardModel;
import com.gzbz.model.FlowerFireCostModel;
import com.gzbz.model.FlowerFireGemModel;
import com.gzbz.model.FlowerFireMarkModel;
import com.gzbz.model.FlowerFirePotItemModel;
import com.gzbz.model.FlowerFireShopModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.FlowerFireActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.FlowerFireActivityTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FlowerFireActivityPart extends AbstractActivityPart {
   private static final String FLOWER_FIRE_LOWEST_NUM = "FlowerfireLowestNum";
   private static final String FLOWER_FIRE_BATTLE_NUM = "FlowerFireBattleNum";
   private static final String FLOWER_FIRE_BATTLE_BUY_COST = "FlowerFireBattleBuyCost";
   private static final String FLOWER_FIRE_BATTLE_ROUND = "FlowerfireBattleRound";
   private static final int DI_BAO_GROUP = 1;
   private Map<Integer, Integer> rateMap = new HashMap();
   private int drawtimes;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;

   int getActivityLogModule() {
      return 83;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendActivityInfo();
         this.sendDrawInfo();
         this.sendPrayInfo();
         this.lampRiddleRechargeHandle(0, true);
         this.flowerFireWineRechargeHandle(0, true);
         this.sendItemShopInfo();
         this.sendBattleInfo();
      }
   }

   public int getActivityType() {
      return 56;
   }

   public void rotateReset(int oldActivityId) {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.activityStartLv = this.player.getPlayerDao().lv;
      flowerFireDao.updateOp();
      this.drawEnd();
      this.initPrayTask();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      this.flowerFireWineEnd();
      this.lampRiddleActivityEnd();
      this.itemShopEnd();
      this.battleModelEnd();
      this.drawEnd();
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.checkAddUpIdListChange();
         this.checkConIdListChange();
         this.sendInfo();
      }

   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         FlowerFireDao flowerFireDao = this.getFlowerFireDao();
         flowerFireDao.nowRechargeMoney = 0;
         flowerFireDao.rechargeCut = 0;
         flowerFireDao.prayNum = 0;
         flowerFireDao.updateOp();
         this.sendFlowerFireWineRewardInfo();
         this.initPrayTask();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.isStageChange();
         this.sendActivityInfo();
         this.resetDailyItemShopBuyTimes();
         this.resetDailyBattle();
      }
   }

   public FlowerFireDao getFlowerFireDao() {
      FlowerFireDao dao = (FlowerFireDao)this.player.getData("tb_flower_fire", this.player.getPlayerId());
      return dao;
   }

   public void activityRecharge(int money) {
      this.lampRiddleRechargeHandle(money, true);
      this.flowerFireWineRechargeHandle(money, true);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_17101(FlowerFireActivityMsg.C2S_ActivityInfo_17101 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      FlowerFireActivityMsg.S2C_ActivityInfo_17102.Builder builder = FlowerFireActivityMsg.S2C_ActivityInfo_17102.newBuilder();
      builder.setActivityStartDay(this.getActivityOpenDay());
      builder.setSeverActivityDay(this.getSeverActivityDay());
      builder.setActivityStartLv(this.getFlowerFireDao().activityStartLv);
      this.player.sendMsg(builder.build());
   }

   public List<FlowerFireMarkModel> getAddUpRewardByStage(int stage) {
      List<FlowerFireMarkModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      List<FlowerFireMarkModel> stageModelList = (List)this.player.getGameModelPool().getEntity("customFlowerfireMark", stage);
      if (null != stageModelList && stageModelList.size() > 0) {
         for(FlowerFireMarkModel model : stageModelList) {
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
         this.logger.info("{}阶段的FlowerfireMark为空，请检查配置表", stage);
         return modelList;
      }
   }

   public FlowerFireMarkModel getFlowerFireLampRiddleModel(int id) {
      FlowerFireMarkModel flowerFireMarkModel = (FlowerFireMarkModel)this.player.getGameModelPool().getEntity("FlowerfireMark", id);
      return flowerFireMarkModel;
   }

   public boolean isStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getNowStage();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      if (nowStage != flowerFireDao.stage) {
         this.sendLampRiddleNotReceiveRewardMail();
         flowerFireDao.stage = nowStage;
         flowerFireDao.updateOp();
         this.sendLampRiddleRechargeRewardInfo();
         return true;
      } else {
         return false;
      }
   }

   public int getNowStage() {
      int stage = 1;
      Map<Integer, FlowerFireMarkModel> allMap = this.player.getGameModelPool().getMap("FlowerfireMark");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay <= 0) {
            return stage;
         }

         for(FlowerFireMarkModel model : allMap.values()) {
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

   public void lampRiddleRechargeHandle(int money, boolean sendMsg) {
      int addMoney = this.calcAndReturnAddMoney(money);
      this.isStageChange();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.stageRechargeMoney += addMoney;
      flowerFireDao.updateOp();
      if (sendMsg) {
         this.sendLampRiddleRechargeRewardInfo();
      }

   }

   public void sendLampRiddleNotReceiveRewardMail() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      List<FlowerFireMarkModel> modelList = this.getAddUpRewardByStage(flowerFireDao.stage);
      if (null != modelList && modelList.size() > 0) {
         List<Integer> notReceiveIdList = new ArrayList();
         List<ResourceModel> notReceiveRewardList = new ArrayList();

         for(FlowerFireMarkModel model : modelList) {
            Integer rewardId = model.getId();
            if (this.checkUnlockLampRiddle(rewardId) && !flowerFireDao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
               notReceiveIdList.add(rewardId);
               notReceiveRewardList.addAll(model.getRewards());
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_FLOWER_FIRE_LAMP_RIDDLE);
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 83, 8301);
         }

         if (notReceiveIdList.size() > 0) {
            flowerFireDao.addUpGotRewards.addAll(notReceiveIdList);
            flowerFireDao.updateOp();
         }
      }

      flowerFireDao.stageRechargeMoney = 0;
      flowerFireDao.updateOp();
   }

   public void lampRiddleActivityEnd() {
      this.checkAddUpIdListChange();
      this.sendLampRiddleNotReceiveRewardMail();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.stage = 1;
      flowerFireDao.addUpGotRewards.clear();
      flowerFireDao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_LampRiddleTotalInfo_17153(FlowerFireActivityMsg.C2S_LampRiddleTotalInfo_17153 msg, String source) {
      this.sendLampRiddleRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveLampRiddleReward_17155(FlowerFireActivityMsg.C2S_ReceiveLampRiddleReward_17155 msg, String source) {
      this.isStageChange();
      int rewardId = msg.getRewardId();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      Set<Integer> addUpGotRewards = flowerFireDao.addUpGotRewards;
      if (addUpGotRewards.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         FlowerFireMarkModel model = this.getFlowerFireLampRiddleModel(rewardId);
         if (null == model) {
            return this.player.failure(37);
         } else if (!this.checkLampRiddleRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            return this.player.failure(61224);
         } else if (!this.checkUnlockLampRiddle(rewardId)) {
            return this.player.failure(61212);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 83, 8301, 0, 0, "");
            flowerFireDao.addUpGotRewards.add(rewardId);
            flowerFireDao.updateOp();
            this.sendLampRiddleRechargeRewardInfo();
            return true;
         }
      }
   }

   public boolean checkLampRiddleRewardStage(int id) {
      FlowerFireMarkModel model = (FlowerFireMarkModel)this.player.getGameModelPool().getEntity("FlowerfireMark", id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         FlowerFireDao flowerFireDao = this.getFlowerFireDao();
         if (model.getDateEnd() == -1) {
            if (activityStartDay >= model.getDateStart() && flowerFireDao.stage == model.getStage()) {
               return true;
            }
         } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && flowerFireDao.stage == model.getStage()) {
            return true;
         }

         return false;
      }
   }

   public boolean checkUnlockLampRiddle(int id) {
      FlowerFireMarkModel flowerFireMarkModel = this.getFlowerFireLampRiddleModel(id);
      if (null == flowerFireMarkModel) {
         return false;
      } else {
         FlowerFireDao flowerFireDao = this.getFlowerFireDao();
         return flowerFireDao.stageRechargeMoney >= flowerFireMarkModel.getRechargeNum();
      }
   }

   public void sendLampRiddleRechargeRewardInfo() {
      FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.Builder resp = FlowerFireActivityMsg.S2C_LampRiddleTotalInfo_17154.newBuilder();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      resp.addAllGotRewards(flowerFireDao.addUpGotRewards);
      resp.setStageRecharge(flowerFireDao.stageRechargeMoney);
      this.player.sendMsg(resp.build());
   }

   public List<FlowerFireGemModel> getFlowerFireGemModelList() {
      List<FlowerFireGemModel> modelList = new ArrayList();
      Map<Integer, FlowerFireGemModel> all = this.player.getGameModelPool().getMap("FlowerfireGem");
      if (null != all && all.size() > 0) {
         Collection<FlowerFireGemModel> values = all.values();
         int activityStartDay = this.getActivityOpenDay();

         for(FlowerFireGemModel model : values) {
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
         return modelList;
      }
   }

   public int getNowUnlockStageNum() {
      int severActivityDay = super.getSeverActivityDay();
      List<FlowerFireGemModel> flowerFireGemModelList = this.getFlowerFireGemModelList();
      if (null != flowerFireGemModelList && flowerFireGemModelList.size() > 0) {
         int maxStageNum = 1;

         for(FlowerFireGemModel model : flowerFireGemModelList) {
            if (model.getStageNum() > maxStageNum) {
               maxStageNum = model.getStageNum();
            }
         }

         return maxStageNum <= severActivityDay ? maxStageNum : severActivityDay;
      } else {
         return 1;
      }
   }

   public void flowerFireWineRechargeHandle(int money, boolean sendMsg) {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      if (flowerFireDao.nowRechargeMoney == -1) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         flowerFireDao.nowRechargeMoney = dailyRecharge;
      } else {
         flowerFireDao.nowRechargeMoney += money;
      }

      flowerFireDao.updateOp();
      FlowerFireGemModel prepareUnlockLow = this.getPrepareUnlockFlowerFireWine(false);
      if (null != prepareUnlockLow) {
         int unlockCondition = flowerFireDao.nowRechargeMoney - flowerFireDao.rechargeCut;
         if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
            flowerFireDao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
            flowerFireDao.rechargeCut = flowerFireDao.nowRechargeMoney;
            flowerFireDao.updateOp();
         }
      }

      FlowerFireGemModel prepareUnlockHigh = this.getPrepareUnlockFlowerFireWine(true);
      if (null != prepareUnlockHigh) {
         int nowRechargeMoney = flowerFireDao.nowRechargeMoney;
         if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
            flowerFireDao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
            flowerFireDao.nowRechargeMoney = 0;
            flowerFireDao.rechargeCut = 0;
            flowerFireDao.updateOp();
         }
      }

      if (sendMsg) {
         this.sendFlowerFireWineRewardInfo();
      }

   }

   public FlowerFireGemModel getPrepareUnlockFlowerFireWine(boolean isHighRechargeGear) {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? flowerFireDao.canReceiveHighRewardIds : flowerFireDao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getFlowerFireWineModelByStageNum(1, isHighRechargeGear);
      } else {
         int maxCanReceiveRewardId = 0;

         for(Integer canReceiveRewardId : canReceiveRewardIds) {
            if (canReceiveRewardId > maxCanReceiveRewardId) {
               maxCanReceiveRewardId = canReceiveRewardId;
            }
         }

         FlowerFireGemModel flowerFireGemModel = this.getFlowerFireWineModelById(maxCanReceiveRewardId);
         int nextStageNum = flowerFireGemModel.getStageNum() + 1;
         if (nextStageNum > nowUnlockStageNum) {
            return null;
         } else {
            return this.getFlowerFireWineModelByStageNum(nextStageNum, isHighRechargeGear);
         }
      }
   }

   public void flowerFireWineEnd() {
      this.checkConIdListChange();
      Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
      List<ResourceModel> notReceiveRewardList = new ArrayList();
      if (allCanReceiveRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
            FlowerFireGemModel flowerFireGemModel = this.getFlowerFireWineModelById(canReceiveRewardId);
            if (null != flowerFireGemModel && flowerFireGemModel.getRewards().size() > 0) {
               notReceiveRewardList.addAll(flowerFireGemModel.getRewards());
            }
         }
      }

      if (notReceiveRewardList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_FLOWER_FIRE_WINE);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 83, 8302);
      }

      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.nowRechargeMoney = -1;
      flowerFireDao.rechargeCut = 0;
      flowerFireDao.canReceiveLowRewardIds.clear();
      flowerFireDao.canReceiveHighRewardIds.clear();
      flowerFireDao.hasReceiveRewardIds.clear();
      flowerFireDao.prayNum = 0;
      flowerFireDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_WineTotalInfo_17156(FlowerFireActivityMsg.C2S_WineTotalInfo_17156 msg, String source) {
      this.sendFlowerFireWineRewardInfo();
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      canReceiveRewardIds.addAll(flowerFireDao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(flowerFireDao.canReceiveHighRewardIds);
      if (flowerFireDao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(flowerFireDao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public List<FlowerFireActivityMsg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<FlowerFireActivityMsg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      FlowerFireGemModel lowFlowerFireGemModel = this.getPrepareUnlockFlowerFireWine(false);
      if (null != lowFlowerFireGemModel) {
         FlowerFireActivityMsg.NextUnlockReceiveReward.Builder lowReceiveReward = FlowerFireActivityMsg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowFlowerFireGemModel.getId());
         double unlockCondition = (double)(flowerFireDao.nowRechargeMoney - flowerFireDao.rechargeCut);
         double progress = unlockCondition / (double)lowFlowerFireGemModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      FlowerFireGemModel highFlowerFireGemModel = this.getPrepareUnlockFlowerFireWine(true);
      if (null != highFlowerFireGemModel) {
         FlowerFireActivityMsg.NextUnlockReceiveReward.Builder highReceiveReward = FlowerFireActivityMsg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highFlowerFireGemModel.getId());
         double nowRechargeMoney = (double)flowerFireDao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highFlowerFireGemModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveWineReward_17158(FlowerFireActivityMsg.C2S_ReceiveWineReward_17158 msg, String source) {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      int rewardId = msg.getRewardId();
      FlowerFireGemModel flowerFireGemModel = this.getFlowerFireWineModelById(rewardId);
      if (null == flowerFireGemModel) {
         return this.player.failure(61212);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(61212);
      } else if (flowerFireDao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         this.player.addResource(flowerFireGemModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 83, 8302, 0, 0, "");
         flowerFireDao.hasReceiveRewardIds.add(rewardId);
         flowerFireDao.updateOp();
         this.sendFlowerFireWineRewardInfo();
         return true;
      }
   }

   public FlowerFireGemModel getFlowerFireWineModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;

      for(FlowerFireGemModel model : this.getFlowerFireGemModelList()) {
         if (model.getStageNum() == stageNum && model.getRechargeGear() == rechargeGear) {
            return model;
         }
      }

      return null;
   }

   public FlowerFireGemModel getFlowerFireWineModelById(int id) {
      FlowerFireGemModel flowerFireGemModel = (FlowerFireGemModel)this.player.getGameModelPool().getEntity("FlowerfireGem", id);
      return flowerFireGemModel;
   }

   public void sendFlowerFireWineRewardInfo() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      FlowerFireActivityMsg.S2C_WineTotalInfo_17157.Builder builder = FlowerFireActivityMsg.S2C_WineTotalInfo_17157.newBuilder();
      builder.setUnlockStageNum(this.getNowUnlockStageNum());
      builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
      builder.addAllHasReceiveRewardIds(flowerFireDao.hasReceiveRewardIds);
      builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
      this.player.sendMsg(builder.build());
   }

   public void drawEnd() {
      FlowerFireDao dao = this.getFlowerFireDao();
      dao.drawTime = 0;
      dao.fancyRewardId = 0;
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.seniorRewards.clear();
      dao.roundSmashNum.clear();
      dao.recordList.clear();
      dao.hadRewards.clear();
      dao.updateOp();
   }

   public void drawResetDaily() {
      FlowerFireDao dao = this.getFlowerFireDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_17168(FlowerFireActivityMsg.C2S_FancyReward_17168 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         FlowerFireDao dao = this.getFlowerFireDao();
         FlowerFireAstrolabeItemModel flowerFireAstrolabeItemModel = (FlowerFireAstrolabeItemModel)this.player.getGameModelPool().getEntity("FlowerfireLotteryItem", msg.getTargetId());
         if (flowerFireAstrolabeItemModel != null) {
            if (flowerFireAstrolabeItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), flowerFireAstrolabeItemModel.getId(), flowerFireAstrolabeItemModel.getItemGroup()});
            } else if (dao.lotteryStage != flowerFireAstrolabeItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), flowerFireAstrolabeItemModel.getId(), flowerFireAstrolabeItemModel.getStage()});
            } else {
               int openDay = this.getActivityOpenDay();
               if (flowerFireAstrolabeItemModel.getDateEnd() == -1) {
                  if (flowerFireAstrolabeItemModel.getDateStart() > openDay) {
                     this.player.failure(0);
                     this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), flowerFireAstrolabeItemModel.getId(), openDay});
                     return;
                  }
               } else if (openDay < flowerFireAstrolabeItemModel.getDateStart() || openDay > flowerFireAstrolabeItemModel.getDateEnd()) {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), flowerFireAstrolabeItemModel.getId(), openDay});
                  return;
               }

               int activityDay = this.getSeverActivityDay();
               if (activityDay >= flowerFireAstrolabeItemModel.getStageStart() && activityDay <= flowerFireAstrolabeItemModel.getStageEnd()) {
                  if (flowerFireAstrolabeItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, flowerFireAstrolabeItemModel.getId(), 0);
                     if (selectNum >= flowerFireAstrolabeItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(flowerFireAstrolabeItemModel.getId()), flowerFireAstrolabeItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getTargetId();
                  dao.updateOp();
                  FlowerFireActivityMsg.S2C_FancyReward_17169.Builder builder = FlowerFireActivityMsg.S2C_FancyReward_17169.newBuilder();
                  builder.setResult(1);
                  builder.setTargetId(msg.getTargetId());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), flowerFireAstrolabeItemModel.getId(), activityDay});
               }
            }
         }
      }
   }

   public int getSmashEggStage() {
      Map<Integer, FlowerFireAstrolabeItemModel> allMap = this.player.getGameModelPool().getMap("FlowerfireLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(FlowerFireAstrolabeItemModel model : allMap.values()) {
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
   public void C2S_Draw_17105(FlowerFireActivityMsg.C2S_Draw_17105 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         FlowerFireCostModel costModel = (FlowerFireCostModel)ApplicationContextProvider.getModelPoolEntity("FlowerfireCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(32, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               FlowerFireDao dao = this.getFlowerFireDao();
               if (dao.fancyRewardId <= 0) {
                  this.player.failure(8024);
               } else {
                  List<ResourceModel> needModelList = new ArrayList();

                  for(ResourceModel consumeItem : costModel.getConsumeItems()) {
                     consumeItem.addResourceToList(needModelList);
                  }

                  if (this.player.checkResourceNum(needModelList)) {
                     int openDay = this.getActivityOpenDay();
                     int activityDay = this.getSeverActivityDay();
                     Map<Integer, FlowerFireAstrolabeItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        FlowerFireAstrolabeItemModel enjoyModel = (FlowerFireAstrolabeItemModel)this.player.getGameModelPool().getEntity("FlowerfireLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           FlowerFireAstrolabeItemModel itemModel = this.smashEgg(dao, itemModelMap);
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

                           ++dao.drawTime;

                           for(ResourceModel resourceModel : itemModel.getRewards()) {
                              addList.add(resourceModel);
                           }
                        }

                        int createTime = DateUtil.getIntTime(System.currentTimeMillis());

                        for(ResourceModel resourceModel : resourceModels) {
                           FlowerFireDao.RecordInfo recordInfo = new FlowerFireDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 8304, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_FLOWER_FIRE_ACTIVITY, this.getActivityLogModule(), 8306, 0, 0, "");
                        playerResetCustomCache.addDailyReset(32, lotteryNum);
                        FlowerFireActivityMsg.S2C_Draw_17106.Builder builder = FlowerFireActivityMsg.S2C_Draw_17106.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(32, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "火树银花-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, FlowerFireAstrolabeItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, FlowerFireAstrolabeItemModel> itemModelMap = this.player.getGameModelPool().getMap("FlowerfireLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, FlowerFireAstrolabeItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, FlowerFireAstrolabeItemModel> entry : itemModelMap.entrySet()) {
            if (((FlowerFireAstrolabeItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((FlowerFireAstrolabeItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((FlowerFireAstrolabeItemModel)entry.getValue()).getDateStart() || openDay > ((FlowerFireAstrolabeItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((FlowerFireAstrolabeItemModel)entry.getValue()).getStageStart() && activityDay <= ((FlowerFireAstrolabeItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private FlowerFireAstrolabeItemModel smashEgg(FlowerFireDao dao, Map<Integer, FlowerFireAstrolabeItemModel> itemModelMap) {
      Map<Integer, FlowerFireAstrolabeItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(FlowerFireAstrolabeItemModel lotteryItemModel : itemModelMap.values()) {
         if (!dao.seniorRewards.containsKey(lotteryItemModel.getId()) || lotteryItemModel.getSurplusNum() <= 0 || (Integer)dao.seniorRewards.get(lotteryItemModel.getId()) <= lotteryItemModel.getSurplusNum()) {
            int roundSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
            if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
               if (lotteryItemModel.getItemGroup() == 1) {
                  if (dao.fancyRewardId > 0 && dao.fancyRewardId == lotteryItemModel.getId()) {
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
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(FlowerFireAstrolabeItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_17103(FlowerFireActivityMsg.C2S_LuckDrawInfo_17103 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      FlowerFireDao dao = this.getFlowerFireDao();
      FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.Builder builder = FlowerFireActivityMsg.S2C_LuckDrawInfo_17104.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(32, 0);
      builder.setRecruitNum(recruitNum);

      for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      builder.setFancyId(dao.fancyRewardId);
      builder.setLotteryStage(dao.lotteryStage);
      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
      this.player.sendMsg(builder.build());
   }

   public List<FlowerFireAstrolabeItemModel> getDrawJackpot() {
      List<FlowerFireAstrolabeItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, FlowerFireAstrolabeItemModel>> flowerFireAstrolabeItemModel = ApplicationContextProvider.<Integer, Map<Integer, FlowerFireAstrolabeItemModel>>getModelPoolMap("CustomFlowerfireLotteryItem");
      TreeMap<Integer, Map<Integer, FlowerFireAstrolabeItemModel>> treeMap = new TreeMap(flowerFireAstrolabeItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, FlowerFireAstrolabeItemModel> modelMap = (Map)flowerFireAstrolabeItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(FlowerFireAstrolabeItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<FlowerFireAstrolabeItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("火树银花活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         FlowerFireAstrolabeItemModel model = (FlowerFireAstrolabeItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(FlowerFireAstrolabeItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadFlowerFireRecord_4226.Builder builder = CrossMsg.S2CR_UploadFlowerFireRecord_4226.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_17107(FlowerFireActivityMsg.C2S_OpenReward_17107 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         FlowerFireAddupAwardModel awardModel = (FlowerFireAddupAwardModel)ApplicationContextProvider.getModelPoolEntity("FlowerfireAddupAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               FlowerFireDao dao = this.getFlowerFireDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("火树银花活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("火树银花活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 8305, 0, 0, "");
                  FlowerFireActivityMsg.S2C_OpenReward_17108.Builder builder = FlowerFireActivityMsg.S2C_OpenReward_17108.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("火树银花活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_17109(FlowerFireActivityMsg.C2S_DrawRecord_17109 msg, String source) {
      FlowerFireActivityMsg.S2C_DrawRecord_17110.Builder builder = FlowerFireActivityMsg.S2C_DrawRecord_17110.newBuilder();
      FlowerFireDao dao = this.getFlowerFireDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         FlowerFireActivityMsg.DrawRecord.Builder drawRecord = FlowerFireActivityMsg.DrawRecord.newBuilder();
         drawRecord.setCreateTime(Integer.parseInt(arr[0]));
         String[] split = arr[1].split("_");
         CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
         itemInfo.setType(Integer.parseInt(split[0]));
         itemInfo.setId(Integer.parseInt(split[1]));
         itemInfo.setNum(Integer.parseInt(split[2]));
         drawRecord.addItemInfo(itemInfo);
         builder.addMyRecrod(drawRecord);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ServerDrawRecord_17170(FlowerFireActivityMsg.C2S_ServerDrawRecord_17170 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      FlowerFireAstrolabeItemModel model = (FlowerFireAstrolabeItemModel)this.player.getGameModelPool().getEntity("FlowerfireLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, FlowerFireAstrolabeItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               FlowerFireAstrolabeItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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
                     DrawViewLogInfo logInfo = (DrawViewLogInfo)entry.getValue();
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

   private FlowerFireAstrolabeItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, FlowerFireAstrolabeItemModel> itemModelMap) {
      Map<Integer, FlowerFireAstrolabeItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(FlowerFireAstrolabeItemModel lotteryItemModel : itemModelMap.values()) {
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
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(FlowerFireAstrolabeItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Pray_17121(FlowerFireActivityMsg.C2S_Pray_17121 msg, String source) {
      FlowerFireActivityTaskPart taskPart = (FlowerFireActivityTaskPart)this.player.getMgrPart(FlowerFireActivityTaskPart.class);
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      int hasPrayNum = taskPart.getCompleteTaskNum() - flowerFireDao.prayNum;
      if (hasPrayNum <= 0) {
         this.logger.info("剩余点火次数不足");
         return this.player.failure(76021);
      } else {
         List<KeyValFun> list = new ArrayList();
         Map<Integer, FlowerFirePotItemModel> modelMap = ApplicationContextProvider.<Integer, FlowerFirePotItemModel>getModelPoolMap("FlowerfireTubeItem");

         for(FlowerFirePotItemModel model : modelMap.values()) {
            list.add(new KeyValFun(model.getId(), model.getOdd()));
         }

         ++flowerFireDao.prayNum;
         flowerFireDao.updateOp();
         GamePlayer var10000 = this.player;
         int id = GamePlayer.countRate(list);
         FlowerFirePotItemModel model = (FlowerFirePotItemModel)modelMap.get(id);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_FLOWER_FIRE_TASK, 83, 8303, 0, 0, "");
         FlowerFireActivityMsg.S2C_Pray_17122.Builder builder = FlowerFireActivityMsg.S2C_Pray_17122.newBuilder();
         builder.setPrayNum(hasPrayNum - 1);
         builder.setIdx(msg.getIdx());
         this.player.sendMsg(builder.build());
         return true;
      }
   }

   public void finishPrayTask() {
      this.sendPrayInfo();
   }

   private void sendPrayInfo() {
      FlowerFireActivityTaskPart taskPart = (FlowerFireActivityTaskPart)this.player.getMgrPart(FlowerFireActivityTaskPart.class);
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      int prayNum = taskPart.getCompleteTaskNum() - flowerFireDao.prayNum;
      FlowerFireActivityMsg.S2C_PrayInfo_17126.Builder builder = FlowerFireActivityMsg.S2C_PrayInfo_17126.newBuilder();
      builder.setPrayNum(Math.max(0, prayNum));
      this.player.sendMsg(builder.build());
   }

   public void initPrayTask() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_FLOWER_FIRE_ACTIVITY);
      FlowerFireActivityTaskPart taskPart = (FlowerFireActivityTaskPart)this.player.getMgrPart(FlowerFireActivityTaskPart.class);
      taskPart.trigger();
   }

   @MsgHandlerAnno
   public void C2S_ItemShopInfo_17160(FlowerFireActivityMsg.C2S_ItemShopInfo_17160 msg, String source) {
      this.sendItemShopInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_BuyItem_17162(FlowerFireActivityMsg.C2S_BuyItem_17162 msg, String source) {
      int id = msg.getId();
      int amount = msg.getAmount();
      if (amount <= 0) {
         return this.player.failure(6);
      } else {
         FlowerFireShopModel model = (FlowerFireShopModel)this.player.getGameModelPool().getEntity("FlowerfireShop", id);
         if (null == model) {
            return this.player.failure(61225);
         } else if (ResourceModel.checkTotalNumError(model.getDisPrice(), amount)) {
            return false;
         } else {
            int resourceType = model.getResourceType();
            int resourceId = model.getResourceId();
            int disPrice = model.getDisPrice() * amount;
            int buyLimit = model.getBuyLimit();
            FlowerFireDao flowerFireDao = this.getFlowerFireDao();
            int buyTimes = flowerFireDao.itemBuyTimes.get(id) == null ? 0 : (Integer)flowerFireDao.itemBuyTimes.get(id);
            if (buyTimes + amount > buyLimit) {
               return this.player.failure(61215);
            } else if (!this.player.checkResourceNum(resourceType, resourceId, disPrice)) {
               return this.player.failure(18);
            } else {
               this.player.delResource(resourceType, resourceId, (long)disPrice, 83, 8308, 0, 0, "");
               int itemType = model.getItemType();
               int itemId = model.getItemId();
               int itemNum = model.getItemNum() * amount;
               this.player.addResource(itemType, itemId, itemNum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 83, 8307, 0, 0, "");
               flowerFireDao.itemBuyTimes.put(id, buyTimes + amount);
               flowerFireDao.updateOp();
               this.sendItemShopInfo();
               return true;
            }
         }
      }
   }

   public void sendItemShopInfo() {
      FlowerFireActivityMsg.S2C_ItemShopInfo_17161.Builder builder = FlowerFireActivityMsg.S2C_ItemShopInfo_17161.newBuilder();
      Map<Integer, FlowerFireShopModel> modelMap = this.player.getGameModelPool().getMap("FlowerfireShop");
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      Map<Integer, Integer> itemBuyTimes = flowerFireDao.itemBuyTimes;

      for(Integer id : modelMap.keySet()) {
         FlowerFireActivityMsg.ItemShopInfo.Builder infoBuilder = FlowerFireActivityMsg.ItemShopInfo.newBuilder();
         infoBuilder.setId(id);
         infoBuilder.setBuyTimes(itemBuyTimes.get(id) == null ? 0 : (Integer)itemBuyTimes.get(id));
         builder.addItemShopInfo(infoBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   public void resetDailyItemShopBuyTimes() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      Map<Integer, FlowerFireShopModel> flowerFireShopModelMap = this.player.getGameModelPool().getMap("FlowerfireShop");
      if (!flowerFireDao.itemBuyTimes.isEmpty()) {
         for(Integer id : flowerFireDao.itemBuyTimes.keySet()) {
            FlowerFireShopModel model = (FlowerFireShopModel)flowerFireShopModelMap.get(id);
            if (model != null && model.getResetType() == 1) {
               flowerFireDao.itemBuyTimes.put(id, 0);
            }
         }

         flowerFireDao.updateOp();
         this.sendItemShopInfo();
      }
   }

   public void itemShopEnd() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.itemBuyTimes.clear();
      flowerFireDao.updateOp();
   }

   public void resetDailyBattle() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.battleBuyTimes = 0;
      flowerFireDao.alreadyBattleTimes = 0;
      flowerFireDao.updateOp();
      this.sendBattleInfo();
   }

   public void battleModelEnd() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      flowerFireDao.battleBuyTimes = 0;
      flowerFireDao.alreadyBattleTimes = 0;
      flowerFireDao.maxDamage = 0L;
      flowerFireDao.updateOp();
   }

   public int getSurplusBattleTimes() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      int battleNum = ApplicationContextProvider.getConfigInt("FlowerFireBattleNum", 3);
      int battleBuyTimes = flowerFireDao.battleBuyTimes;
      int alreadyBattleTimes = flowerFireDao.alreadyBattleTimes;
      int surplus = battleNum + battleBuyTimes - alreadyBattleTimes;
      return surplus > 0 ? surplus : 0;
   }

   public int getSurplusBuyTimes() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      int battleBuyTimes = flowerFireDao.battleBuyTimes;
      String battleBuyCostStr = ApplicationContextProvider.getConfigString("FlowerFireBattleBuyCost", "50|100");
      String[] battleBuyCostStrArr = battleBuyCostStr.split("\\|");
      return battleBuyCostStrArr.length - battleBuyTimes > 0 ? battleBuyCostStrArr.length - battleBuyTimes : 0;
   }

   public int getBuyBattleCost() {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      if (this.getSurplusBuyTimes() <= 0) {
         return -1;
      } else {
         int battleBuyTimes = flowerFireDao.battleBuyTimes;
         String battleBuyCostStr = ApplicationContextProvider.getConfigString("FlowerFireBattleBuyCost", "50|100");
         String[] battleBuyCostStrArr = battleBuyCostStr.split("\\|");
         if (battleBuyTimes >= battleBuyCostStrArr.length) {
            return -1;
         } else {
            int battleBuyCost = Integer.parseInt(battleBuyCostStrArr[battleBuyTimes]);
            return battleBuyCost;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BattleInfo_17165(FlowerFireActivityMsg.C2S_BattleInfo_17165 msg, String source) {
      this.sendBattleInfo();
   }

   public void sendBattleInfo() {
      FlowerFireActivityMsg.S2C_BattleInfo_17166.Builder builder = FlowerFireActivityMsg.S2C_BattleInfo_17166.newBuilder();
      builder.setBattleNum(this.getSurplusBattleTimes());
      builder.setBattleBuyNum(this.getSurplusBuyTimes());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_BuyBattleTimes_17167(FlowerFireActivityMsg.C2S_BuyBattleTimes_17167 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         int buyBattleCost = this.getBuyBattleCost();
         if (this.getSurplusBuyTimes() > 0 && buyBattleCost != -1) {
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, buyBattleCost)) {
               return this.player.failure(31);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)buyBattleCost, 83, 8309, 0, 0, "");
               FlowerFireDao flowerFireDao = this.getFlowerFireDao();
               ++flowerFireDao.battleBuyTimes;
               flowerFireDao.updateOp();
               this.sendBattleInfo();
               return true;
            }
         } else {
            return this.player.failure(61164);
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (this.isServerActivityInvalid()) {
         return 8007;
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            return 76022;
         } else {
            int surplusBattleBuyTimes = this.getSurplusBattleTimes();
            if (surplusBattleBuyTimes <= 0) {
               return 41;
            } else {
               BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleDao.modelId);
               if (battleModel == null) {
                  return 6;
               } else {
                  BattlePKTeam myPKTeam = battleDao.scene.getPKTeam((byte)0);
                  if (myPKTeam.getEntityMap().size() == 0) {
                     return 4125;
                  } else {
                     BattlePKTeam enemyPKTeam = new BattlePKTeam(battleDao.modelId);
                     battleDao.scene.addPKTeam((byte)1, enemyPKTeam);
                     int unionGateFightTurn = ApplicationContextProvider.getConfigInt("FlowerfireBattleRound", 8);
                     battleDao.scene.setMaxRound((byte)unionGateFightTurn);
                     return 1;
                  }
               }
            }
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      FlowerFireDao flowerFireDao = this.getFlowerFireDao();
      ++flowerFireDao.alreadyBattleTimes;
      long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
      long maxDamage = flowerFireDao.maxDamage;
      if (maxDamage < damage) {
         flowerFireDao.maxDamage = damage;
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         rankPart.updateRank(RankDefine.RankModule.FLOWER_FIRE_BATTLE, damage, false);
      }

      flowerFireDao.updateOp();
      int mvpHeroId = 0;
      long tempDamage = 0L;

      for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
         if (entity.getAttackValue() > tempDamage) {
            tempDamage = entity.getAttackValue();
            mvpHeroId = entity.getDressHeroId();
         }
      }

      BattleMsg.S2C_BattleResult_6102.Builder builder = battleDao.scene.getBattleMsg();
      builder.addExParams(mvpHeroId);

      for(Integer param : battleDao.params) {
         builder.addExParams(param);
      }

      BattleMsg.S2C_Battle_Result.Builder result = builder.getResult().toBuilder();
      result.setResult(0);
      result.addSettleInfo(damage);
      FlowerFireBattleAwardModel battleAwardByPower = this.getBattleAwardByPower();
      if (null != battleAwardByPower) {
         battleDao.rewards.addAll(battleAwardByPower.getRewards());

         for(ResourceModel reward : battleAwardByPower.getRewards()) {
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(reward.getType()).setId(reward.getId()).setNum(reward.getValue()));
         }
      }

      builder.setResult(result);
      battleDao.scene.setBattleMsg(builder);
      this.sendBattleInfo();
   }

   public void endBattle(BattleDao battleDao) {
      List<ResourceModel> rewards = battleDao.rewards;
      if (null != rewards && rewards.size() > 0) {
         this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 83, 8310, 0, 0, "");
      }

      battleDao.rewards.clear();
   }

   public FlowerFireBattleAwardModel getBattleAwardByPower() {
      Map<Integer, FlowerFireBattleAwardModel> map = this.player.getGameModelPool().getMap("FlowerFireBattleAward");
      Collection<FlowerFireBattleAwardModel> values = map.values();
      long combat_power = this.player.getPlayerDao().combat_power;

      for(FlowerFireBattleAwardModel model : values) {
         if (model.getMaxHurt() != -1) {
            if (combat_power >= (long)model.getMinHurt() && combat_power <= (long)model.getMaxHurt()) {
               return model;
            }
         } else if (combat_power >= (long)model.getMinHurt()) {
            return model;
         }
      }

      return null;
   }

   public void gmTest(String string) {
      switch (string) {
         case "show":
            this.gmShowDrawRate();
            break;
         case "clear":
            this.gmClearRate();
            break;
         case "resetdraw":
            this.gmResetDraw();
            break;
         case "resetbattle":
            this.resetDailyBattle();
      }

   }

   public void gmShowDrawRate() {
      this.logger.info("总共抽了 {} 次", this.drawtimes);

      for(Map.Entry<Integer, Integer> entry : this.rateMap.entrySet()) {
         this.logger.info("id:{}, 抽中了 {} 次", entry.getKey(), entry.getValue());
      }

   }

   public void gmClearRate() {
      this.drawtimes = 0;
      this.rateMap.clear();
   }

   public void gmResetDraw() {
      this.drawEnd();
      this.sendDrawInfo();
   }

   public void checkAddUpIdListChange() {
      FlowerFireDao dao = this.getFlowerFireDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!addUpGotRewards.isEmpty()) {
         Map<Integer, FlowerFireMarkModel> stageModelMap = this.player.getGameModelPool().getMap("FlowerfireMark");
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<FlowerFireMarkModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(FlowerFireMarkModel model : stageModelMap.values()) {
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
               int nowAddUpStage = this.getNowStage();
               if (addUpIdSet.containsAll(addUpGotRewards) && dao.stage > nowAddUpStage || !addUpIdSet.containsAll(addUpGotRewards)) {
                  Set<Integer> newAddUpGotRewards = new HashSet();

                  for(int id : addUpGotRewards) {
                     FlowerFireMarkModel addUpModel = this.getFlowerFireLampRiddleModel(id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(FlowerFireMarkModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(FlowerFireMarkModel addUpRechargeModel : addUpRechargeModelList) {
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

   public void checkConIdListChange() {
      List<FlowerFireGemModel> conModelList = this.getFlowerFireGemModelList();
      if (conModelList != null && conModelList.size() > 0) {
         Set<Integer> conIdSet = new HashSet();

         for(FlowerFireGemModel model : conModelList) {
            conIdSet.add(model.getId());
         }

         FlowerFireDao dao = this.getFlowerFireDao();
         this.replaceConRewardIds(dao.canReceiveLowRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.canReceiveHighRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.hasReceiveRewardIds, conIdSet, conModelList);
         dao.updateOp();
      } else {
         this.logger.info("活动id:{} 连充配置表为空，请检查配置表", this.getActivityType());
      }
   }

   private void replaceConRewardIds(Set<Integer> daoRewardIds, Set<Integer> conIdSet, List<FlowerFireGemModel> conModelList) {
      if (!daoRewardIds.isEmpty() && !conIdSet.containsAll(daoRewardIds)) {
         Set<Integer> newHasReceiveRewardIds = new HashSet();

         for(Integer rewardId : daoRewardIds) {
            FlowerFireGemModel conModelById = this.getFlowerFireWineModelById(rewardId);
            if (null != conModelById) {
               int stageNum = conModelById.getStageNum();
               int rechargeGear = conModelById.getRechargeGear();

               for(FlowerFireGemModel model : conModelList) {
                  if (stageNum == model.getStageNum() && rechargeGear == model.getRechargeGear()) {
                     newHasReceiveRewardIds.add(model.getId());
                     break;
                  }
               }
            }
         }

         daoRewardIds.clear();
         daoRewardIds.addAll(newHasReceiveRewardIds);
      }

   }
}
