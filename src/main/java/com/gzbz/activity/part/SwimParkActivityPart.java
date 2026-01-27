package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.SwimParkWineDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SwimParkLampRiddleModel;
import com.gzbz.model.SwimParkWineModel;
import com.gzbz.model.SwimparkAddupAwardModel;
import com.gzbz.model.SwimparkAstrolabelItemModel;
import com.gzbz.model.SwimparkCostModel;
import com.gzbz.model.SwimparkPotModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SwimParkActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.SwimParkActivitySilkBagTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
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
public class SwimParkActivityPart extends AbstractActivityPart {
   private static final String SWIM_PARK_LOWEST_NUM = "swimParkLowestNum";
   private static final int DI_BAO_GROUP = 1;
   private Map<Integer, Integer> rateMap = new HashMap();
   private int drawtimes;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendActivityInfo();
         this.lampRiddleRechargeHandle(0, true);
         this.swimParkWineRechargeHandle(0, true);
         this.sendDrawInfo();
         this.sendPrayInfo();
      }
   }

   public int getActivityType() {
      return 52;
   }

   public void rotateReset(int oldActivityId) {
      this.initPrayTask();
      this.clearActivityGift(24);
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      int lotteryStage = this.getSmashEggStage();
      swimParkWineDao.lotteryStage = lotteryStage;
      swimParkWineDao.updateOp();
   }

   public void activityEnd(int oldActivityId) {
      this.swimParkWineEnd();
      this.lampRiddleActivityEnd();
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
         SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
         swimParkWineDao.nowRechargeMoney = 0;
         swimParkWineDao.rechargeCut = 0;
         swimParkWineDao.prayNum = 0;
         swimParkWineDao.prayIdxMap.clear();
         int lotteryStage = this.getSmashEggStage();
         if (lotteryStage != swimParkWineDao.lotteryStage) {
            swimParkWineDao.lotteryStage = lotteryStage;
            swimParkWineDao.fancyRewardId = 0;
         }

         swimParkWineDao.updateOp();
         this.sendSwimParkWineRewardInfo();
         this.initPrayTask();
         this.isStageChange();
         this.sendDrawInfo();
         this.sendActivityInfo();
      }
   }

   public void activityRecharge(int money) {
      this.lampRiddleRechargeHandle(money, true);
      this.swimParkWineRechargeHandle(money, true);
   }

   public void sendActivityInfo() {
      SwimParkActivityMsg.S2C_ActivityInfo_16502.Builder builder = SwimParkActivityMsg.S2C_ActivityInfo_16502.newBuilder();
      builder.setActivityOpenDay(this.getActivityOpenDay());
      builder.setSeverActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_16501(SwimParkActivityMsg.C2S_ActivityInfo_16501 msg, String source) {
      this.sendActivityInfo();
   }

   public List<SwimParkLampRiddleModel> getAddUpRewardByStage(int stage) {
      List<SwimParkLampRiddleModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      List<SwimParkLampRiddleModel> stageModelList = (List)this.player.getGameModelPool().getEntity("CustomSwimparkLampRiddle", stage);
      if (null != stageModelList && stageModelList.size() > 0) {
         for(SwimParkLampRiddleModel model : stageModelList) {
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
         this.logger.info("{}阶段的SwimParkLampRiddle为空，请检查配置表", stage);
         return modelList;
      }
   }

   public SwimParkLampRiddleModel getLampRiddleModel(int id) {
      SwimParkLampRiddleModel model = (SwimParkLampRiddleModel)this.player.getGameModelPool().getEntity("SwimparkLampRiddle", id);
      return model;
   }

   public boolean isStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getNowStage();
      SwimParkWineDao dao = this.getSwimParkWineDao();
      if (nowStage != dao.stage) {
         this.sendLampRiddleNotReceiveRewardMail();
         dao.stage = nowStage;
         dao.updateOp();
         this.sendLampRiddleRechargeRewardInfo();
         return true;
      } else {
         return false;
      }
   }

   public int getNowStage() {
      int stage = 1;
      Map<Integer, SwimParkLampRiddleModel> allMap = this.player.getGameModelPool().getMap("SwimparkLampRiddle");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay <= 0) {
            return stage;
         }

         for(SwimParkLampRiddleModel model : allMap.values()) {
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
      SwimParkWineDao dao = this.getSwimParkWineDao();
      dao.stageRechargeMoney += addMoney;
      dao.updateOp();
      if (sendMsg) {
         this.sendLampRiddleRechargeRewardInfo();
      }

   }

   public void sendLampRiddleNotReceiveRewardMail() {
      SwimParkWineDao dao = this.getSwimParkWineDao();
      List<SwimParkLampRiddleModel> modelList = this.getAddUpRewardByStage(dao.stage);
      if (null != modelList && modelList.size() > 0) {
         List<Integer> notReceiveIdList = new ArrayList();
         List<ResourceModel> notReceiveRewardList = new ArrayList();

         for(SwimParkLampRiddleModel model : modelList) {
            Integer rewardId = model.getId();
            if (this.checkUnlockLampRiddle(rewardId) && !dao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
               notReceiveIdList.add(rewardId);
               notReceiveRewardList.addAll(model.getRewards());
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_SWIM_LAMP_RIDDLE);
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 79, 7901);
         }

         if (notReceiveIdList.size() > 0) {
            dao.addUpGotRewards.addAll(notReceiveIdList);
            dao.updateOp();
         }
      }

      dao.stageRechargeMoney = 0;
      dao.updateOp();
   }

   public void lampRiddleActivityEnd() {
      this.checkAddUpIdListChange();
      this.sendLampRiddleNotReceiveRewardMail();
      SwimParkWineDao dao = this.getSwimParkWineDao();
      dao.stage = 1;
      dao.addUpGotRewards.clear();
      dao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_LampRiddleTotalInfo_16553(SwimParkActivityMsg.C2S_LampRiddleTotalInfo_16553 msg, String source) {
      this.sendLampRiddleRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveLampRiddleReward_16555(SwimParkActivityMsg.C2S_ReceiveLampRiddleReward_16555 msg, String source) {
      this.isStageChange();
      int rewardId = msg.getRewardId();
      SwimParkWineDao dao = this.getSwimParkWineDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (addUpGotRewards.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         SwimParkLampRiddleModel model = this.getLampRiddleModel(rewardId);
         if (null == model) {
            return this.player.failure(37);
         } else if (!this.checkLampRiddleRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            return this.player.failure(61224);
         } else if (!this.checkUnlockLampRiddle(rewardId)) {
            return this.player.failure(61212);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 79, 7901, 0, 0, "");
            dao.addUpGotRewards.add(rewardId);
            dao.updateOp();
            this.sendLampRiddleRechargeRewardInfo();
            return true;
         }
      }
   }

   public boolean checkLampRiddleRewardStage(int id) {
      SwimParkLampRiddleModel model = (SwimParkLampRiddleModel)this.player.getGameModelPool().getEntity("SwimparkLampRiddle", id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         SwimParkWineDao dao = this.getSwimParkWineDao();
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

   public boolean checkUnlockLampRiddle(int id) {
      SwimParkLampRiddleModel SwimParkLampRiddleModel = this.getLampRiddleModel(id);
      if (null == SwimParkLampRiddleModel) {
         return false;
      } else {
         SwimParkWineDao dao = this.getSwimParkWineDao();
         return dao.stageRechargeMoney >= SwimParkLampRiddleModel.getRechargeNum();
      }
   }

   public void sendLampRiddleRechargeRewardInfo() {
      SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.Builder resp = SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.newBuilder();
      SwimParkWineDao dao = this.getSwimParkWineDao();
      resp.addAllGotRewards(dao.addUpGotRewards);
      resp.setStageRecharge(dao.stageRechargeMoney);
      resp.setStageEndTime(this.getAddUpRechargeStageEndTime());
      this.player.sendMsg(resp.build());
   }

   public long getAddUpRechargeStageEndTime() {
      List<SwimParkLampRiddleModel> addUpRewardByStage = this.getAddUpRewardByStage(this.getNowStage());
      if (null != addUpRewardByStage && addUpRewardByStage.size() > 0) {
         SwimParkLampRiddleModel model = (SwimParkLampRiddleModel)addUpRewardByStage.get(0);
         int stageEnd = model.getStageEnd();
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long startTime = (long)activityInfo.start * 1000L;
         long result = startTime + (long)stageEnd * 86400000L;
         return result;
      } else {
         return 0L;
      }
   }

   public List<SwimParkWineModel> getSwimParkWineModelList() {
      List<SwimParkWineModel> modelList = new ArrayList();
      Map<Integer, SwimParkWineModel> all = this.player.getGameModelPool().getMap("SwimparkWine");
      if (null != all && all.size() > 0) {
         Collection<SwimParkWineModel> values = all.values();
         int activityStartDay = this.getActivityOpenDay();

         for(SwimParkWineModel model : values) {
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
      List<SwimParkWineModel> swimParkWineModelList = this.getSwimParkWineModelList();
      if (null != swimParkWineModelList && swimParkWineModelList.size() > 0) {
         int maxStageNum = 1;

         for(SwimParkWineModel model : swimParkWineModelList) {
            if (model.getStageNum() > maxStageNum) {
               maxStageNum = model.getStageNum();
            }
         }

         return maxStageNum <= severActivityDay ? maxStageNum : severActivityDay;
      } else {
         return 1;
      }
   }

   public void swimParkWineRechargeHandle(int money, boolean sendMsg) {
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      if (swimParkWineDao.nowRechargeMoney == -1) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         swimParkWineDao.nowRechargeMoney = dailyRecharge;
      } else {
         swimParkWineDao.nowRechargeMoney += money;
      }

      swimParkWineDao.updateOp();
      SwimParkWineModel prepareUnlockLow = this.getPrepareUnlockSwimParkWine(false);
      if (null != prepareUnlockLow) {
         int unlockCondition = swimParkWineDao.nowRechargeMoney - swimParkWineDao.rechargeCut;
         if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
            swimParkWineDao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
            swimParkWineDao.rechargeCut = swimParkWineDao.nowRechargeMoney;
            swimParkWineDao.updateOp();
         }
      }

      SwimParkWineModel prepareUnlockHigh = this.getPrepareUnlockSwimParkWine(true);
      if (null != prepareUnlockHigh) {
         int nowRechargeMoney = swimParkWineDao.nowRechargeMoney;
         if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
            swimParkWineDao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
            swimParkWineDao.nowRechargeMoney = 0;
            swimParkWineDao.rechargeCut = 0;
            swimParkWineDao.updateOp();
         }
      }

      if (sendMsg) {
         this.sendSwimParkWineRewardInfo();
      }

   }

   public SwimParkWineModel getPrepareUnlockSwimParkWine(boolean isHighRechargeGear) {
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? swimParkWineDao.canReceiveHighRewardIds : swimParkWineDao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getSwimParkWineModelByStageNum(1, isHighRechargeGear);
      } else {
         List<Integer> canReceiveRewardIdList = (List)canReceiveRewardIds.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
         SwimParkWineModel swimParkWineModel = this.getSwimParkWineModelById((Integer)canReceiveRewardIdList.get(0));
         int nextStageNum = swimParkWineModel.getStageNum() + 1;
         return nextStageNum > nowUnlockStageNum ? null : this.getSwimParkWineModelByStageNum(nextStageNum, isHighRechargeGear);
      }
   }

   public void swimParkWineEnd() {
      this.checkConIdListChange();
      Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
      List<ResourceModel> notReceiveRewardList = new ArrayList();
      if (allCanReceiveRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
            SwimParkWineModel swimParkWineModel = this.getSwimParkWineModelById(canReceiveRewardId);
            if (null != swimParkWineModel && swimParkWineModel.getRewards().size() > 0) {
               notReceiveRewardList.addAll(swimParkWineModel.getRewards());
            }
         }
      }

      if (notReceiveRewardList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_SWIM_WINE);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 79, 7902);
      }

      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      swimParkWineDao.nowRechargeMoney = -1;
      swimParkWineDao.rechargeCut = 0;
      swimParkWineDao.canReceiveLowRewardIds.clear();
      swimParkWineDao.canReceiveHighRewardIds.clear();
      swimParkWineDao.hasReceiveRewardIds.clear();
      swimParkWineDao.drawTime = 0;
      swimParkWineDao.floorDrawMap.clear();
      swimParkWineDao.rewardCountMap.clear();
      swimParkWineDao.hadRewards.clear();
      swimParkWineDao.prayNum = 0;
      swimParkWineDao.prayIdxMap.clear();
      swimParkWineDao.recordList.clear();
      swimParkWineDao.fancyRewardId = 0;
      swimParkWineDao.seniorRewards.clear();
      swimParkWineDao.roundSmashNum.clear();
      int lotteryStage = this.getSmashEggStage();
      swimParkWineDao.lotteryStage = lotteryStage;
      swimParkWineDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_WineTotalInfo_16556(SwimParkActivityMsg.C2S_WineTotalInfo_16556 msg, String source) {
      this.sendSwimParkWineRewardInfo();
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      canReceiveRewardIds.addAll(swimParkWineDao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(swimParkWineDao.canReceiveHighRewardIds);
      if (swimParkWineDao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(swimParkWineDao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public void sendSwimParkWineRewardInfo() {
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      SwimParkActivityMsg.S2C_WineTotalInfo_16557.Builder builder = SwimParkActivityMsg.S2C_WineTotalInfo_16557.newBuilder();
      builder.setUnlockStageNum(this.getNowUnlockStageNum());
      builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
      builder.addAllHasReceiveRewardIds(swimParkWineDao.hasReceiveRewardIds);
      builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
      this.player.sendMsg(builder.build());
   }

   public List<SwimParkActivityMsg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<SwimParkActivityMsg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      SwimParkWineModel lowSwimParkWineModel = this.getPrepareUnlockSwimParkWine(false);
      if (null != lowSwimParkWineModel) {
         SwimParkActivityMsg.NextUnlockReceiveReward.Builder lowReceiveReward = SwimParkActivityMsg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowSwimParkWineModel.getId());
         double unlockCondition = (double)(swimParkWineDao.nowRechargeMoney - swimParkWineDao.rechargeCut);
         double progress = unlockCondition / (double)lowSwimParkWineModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      SwimParkWineModel highSwimParkWineModel = this.getPrepareUnlockSwimParkWine(true);
      if (null != highSwimParkWineModel) {
         SwimParkActivityMsg.NextUnlockReceiveReward.Builder highReceiveReward = SwimParkActivityMsg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highSwimParkWineModel.getId());
         double nowRechargeMoney = (double)swimParkWineDao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highSwimParkWineModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveWineReward_16558(SwimParkActivityMsg.C2S_ReceiveWineReward_16558 msg, String source) {
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      int rewardId = msg.getRewardId();
      SwimParkWineModel swimParkWineModel = this.getSwimParkWineModelById(rewardId);
      if (null == swimParkWineModel) {
         return this.player.failure(61212);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(61212);
      } else if (swimParkWineDao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         this.player.addResource(swimParkWineModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 79, 7902, 0, 0, "");
         swimParkWineDao.hasReceiveRewardIds.add(rewardId);
         swimParkWineDao.updateOp();
         this.sendSwimParkWineRewardInfo();
         return true;
      }
   }

   public SwimParkWineModel getSwimParkWineModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;

      for(SwimParkWineModel model : this.getSwimParkWineModelList()) {
         if (model.getStageNum() == stageNum && model.getRechargeGear() == rechargeGear) {
            return model;
         }
      }

      return null;
   }

   public SwimParkWineModel getSwimParkWineModelById(int id) {
      SwimParkWineModel swimParkWineModel = (SwimParkWineModel)this.player.getGameModelPool().getEntity("SwimparkWine", id);
      return swimParkWineModel;
   }

   public SwimParkWineDao getSwimParkWineDao() {
      SwimParkWineDao dao = (SwimParkWineDao)this.player.getData("tb_swim_park_wine", this.player.getPlayerId());
      return dao;
   }

   public void sendDrawInfo() {
      SwimParkWineDao swimParkWineDao = (SwimParkWineDao)this.player.getData("tb_swim_park_wine", this.player.getPlayerId());
      SwimParkActivityMsg.S2C_LuckDrawInfo_16504.Builder builder = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.newBuilder();
      builder.setDrawTimes(swimParkWineDao.drawTime);
      builder.addAllHadRewardId(swimParkWineDao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(31, 0);
      builder.setRecruitNum(recruitNum);

      for(Map.Entry<Integer, Integer> entry : swimParkWineDao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      builder.setFancyId(swimParkWineDao.fancyRewardId);
      builder.setLotterStage(swimParkWineDao.lotteryStage);
      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(swimParkWineDao.roundSmashNum, 1, 0));
      this.player.sendMsg(builder.build());
   }

   public List<SwimparkAstrolabelItemModel> getDrawJackpot() {
      List<SwimparkAstrolabelItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, SwimparkAstrolabelItemModel>> swimparkAstrolabelItemModel = ApplicationContextProvider.<Integer, Map<Integer, SwimparkAstrolabelItemModel>>getModelPoolMap("customSwimparkLotteryItem");
      TreeMap<Integer, Map<Integer, SwimparkAstrolabelItemModel>> treeMap = new TreeMap(swimparkAstrolabelItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, SwimparkAstrolabelItemModel> modelMap = (Map)swimparkAstrolabelItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(SwimparkAstrolabelItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<SwimparkAstrolabelItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("游园活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         SwimparkAstrolabelItemModel model = (SwimparkAstrolabelItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(SwimparkAstrolabelItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadSwimParkRecord_4227.Builder builder = CrossMsg.S2CR_UploadSwimParkRecord_4227.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_16507(SwimParkActivityMsg.C2S_OpenReward_16507 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         SwimparkAddupAwardModel awardModel = (SwimparkAddupAwardModel)ApplicationContextProvider.getModelPoolEntity("SwimparkAddupAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               SwimParkWineDao swimParkWineDao = (SwimParkWineDao)this.player.getData("tb_swim_park_wine", this.player.getPlayerId());
               if (swimParkWineDao.hadRewards.contains(id)) {
                  this.logger.info("游园活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > swimParkWineDao.drawTime) {
                  this.logger.info("游园活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", swimParkWineDao.drawTime, awardModel.getAddupNum());
               } else {
                  swimParkWineDao.hadRewards.add(id);
                  swimParkWineDao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 79, 7905, 0, 0, "");
                  SwimParkActivityMsg.S2C_OpenReward_16508.Builder builder = SwimParkActivityMsg.S2C_OpenReward_16508.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("游园活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_16509(SwimParkActivityMsg.C2S_DrawRecord_16509 msg, String source) {
      SwimParkActivityMsg.S2C_DrawRecord_16510.Builder builder = SwimParkActivityMsg.S2C_DrawRecord_16510.newBuilder();
      SwimParkWineDao swimParkWineDao = (SwimParkWineDao)this.player.getData("tb_swim_park_wine", this.player.getPlayerId());

      for(String record : swimParkWineDao.recordList) {
         String[] arr = record.split(":");
         SwimParkActivityMsg.DrawRecord.Builder drawRecord = SwimParkActivityMsg.DrawRecord.newBuilder();
         drawRecord.setCreateTime(Integer.parseInt(arr[0]));
         String[] split = arr[1].split(",");
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
   public void C2S_ServerDrawRecord_16561(SwimParkActivityMsg.C2S_ServerDrawRecord_16561 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_Pray_16521(SwimParkActivityMsg.C2S_Pray_16521 msg, String souce) {
      SwimParkActivitySilkBagTaskPart taskPart = (SwimParkActivitySilkBagTaskPart)this.player.getMgrPart(SwimParkActivitySilkBagTaskPart.class);
      SwimParkWineDao swimParkWineDao = (SwimParkWineDao)this.player.getData("tb_swim_park_wine", this.player.getPlayerId());
      int residueTime = taskPart.getCompleteTaskNum() - swimParkWineDao.prayNum;
      if (residueTime <= 0) {
         this.logger.info("剩余祈福次数不足");
      } else {
         List<KeyValFun> list = new ArrayList();
         Map<Integer, SwimparkPotModel> modelMap = ApplicationContextProvider.<Integer, SwimparkPotModel>getModelPoolMap("SwimparkPotItem");

         for(SwimparkPotModel model : modelMap.values()) {
            list.add(new KeyValFun(model.getId(), model.getOdd()));
         }

         int num = (Integer)MapUtil.getOrDefault(swimParkWineDao.prayIdxMap, msg.getIdx(), 0);
         swimParkWineDao.prayIdxMap.put(msg.getIdx(), num + 1);
         ++swimParkWineDao.prayNum;
         swimParkWineDao.updateOp();
         GamePlayer var10000 = this.player;
         int id = GamePlayer.countRate(list);
         SwimparkPotModel model = (SwimparkPotModel)modelMap.get(id);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 79, 7903, 0, 0, "");
         SwimParkActivityMsg.S2C_Pray_16522.Builder builder = SwimParkActivityMsg.S2C_Pray_16522.newBuilder();
         builder.setPrayNum(residueTime - 1);
         builder.setIdx(msg.getIdx());
         this.player.sendMsg(builder.build());
      }
   }

   public void finishPrayTask() {
      this.sendPrayInfo();
   }

   private void sendPrayInfo() {
      SwimParkActivitySilkBagTaskPart taskPart = (SwimParkActivitySilkBagTaskPart)this.player.getMgrPart(SwimParkActivitySilkBagTaskPart.class);
      SwimParkWineDao swimParkWineDao = (SwimParkWineDao)this.player.getData("tb_swim_park_wine", this.player.getPlayerId());
      int residueTime = taskPart.getCompleteTaskNum() - swimParkWineDao.prayNum;
      SwimParkActivityMsg.S2C_PrayInfo_16526.Builder builder = SwimParkActivityMsg.S2C_PrayInfo_16526.newBuilder();
      builder.setPrayNum(residueTime);

      for(int i = 1; i <= 3; ++i) {
         int num = (Integer)MapUtil.getOrDefault(swimParkWineDao.prayIdxMap, i, 0);
         builder.addCount(num);
      }

      this.player.sendMsg(builder.build());
   }

   public void initPrayTask() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_SWIM_PARK_ACTIVITY_PRAY);
      SwimParkActivitySilkBagTaskPart taskPart = (SwimParkActivitySilkBagTaskPart)this.player.getMgrPart(SwimParkActivitySilkBagTaskPart.class);
      taskPart.trigger();
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
      SwimParkWineDao swimParkWineDao = this.getSwimParkWineDao();
      swimParkWineDao.drawTime = 0;
      swimParkWineDao.floorDrawMap.clear();
      swimParkWineDao.rewardCountMap.clear();
      swimParkWineDao.updateOp();
      this.sendDrawInfo();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_16559(SwimParkActivityMsg.C2S_FancyReward_16559 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         SwimParkWineDao dao = this.getSwimParkWineDao();
         SwimparkAstrolabelItemModel swimparkAstrolabelItemModel = (SwimparkAstrolabelItemModel)this.player.getGameModelPool().getEntity("SwimparkLotteryItem", msg.getTargetId());
         if (swimparkAstrolabelItemModel != null) {
            if (swimparkAstrolabelItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), swimparkAstrolabelItemModel.getId(), swimparkAstrolabelItemModel.getItemGroup()});
            } else if (dao.lotteryStage != swimparkAstrolabelItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), swimparkAstrolabelItemModel.getId(), swimparkAstrolabelItemModel.getStage()});
            } else {
               int openDay = this.getActivityOpenDay();
               if (swimparkAstrolabelItemModel.getDateEnd() == -1) {
                  if (swimparkAstrolabelItemModel.getDateStart() > openDay) {
                     this.player.failure(0);
                     this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), swimparkAstrolabelItemModel.getId(), openDay});
                     return;
                  }
               } else if (openDay < swimparkAstrolabelItemModel.getDateStart() || openDay > swimparkAstrolabelItemModel.getDateEnd()) {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), swimparkAstrolabelItemModel.getId(), openDay});
                  return;
               }

               int activityDay = this.getSeverActivityDay();
               if (activityDay >= swimparkAstrolabelItemModel.getStageStart() && activityDay <= swimparkAstrolabelItemModel.getStageEnd()) {
                  if (swimparkAstrolabelItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, swimparkAstrolabelItemModel.getId(), 0);
                     if (selectNum >= swimparkAstrolabelItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(swimparkAstrolabelItemModel.getId()), swimparkAstrolabelItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getTargetId();
                  dao.updateOp();
                  SwimParkActivityMsg.S2C_FancyReward_16560.Builder builder = SwimParkActivityMsg.S2C_FancyReward_16560.newBuilder();
                  builder.setResult(1);
                  builder.setTargetId(msg.getTargetId());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), swimparkAstrolabelItemModel.getId(), activityDay});
               }
            }
         }
      }
   }

   public int getSmashEggStage() {
      Map<Integer, SwimparkAstrolabelItemModel> allMap = this.player.getGameModelPool().getMap("SwimparkLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(SwimparkAstrolabelItemModel model : allMap.values()) {
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
   public void C2S_Draw_16505(SwimParkActivityMsg.C2S_Draw_16505 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         SwimparkCostModel costModel = (SwimparkCostModel)ApplicationContextProvider.getModelPoolEntity("SwimparkCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(31, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               SwimParkWineDao dao = this.getSwimParkWineDao();
               if (dao.fancyRewardId <= 0) {
                  this.player.failure(76014);
               } else {
                  List<ResourceModel> needModelList = new ArrayList();

                  for(ResourceModel consumeItem : costModel.getConsumeItems()) {
                     consumeItem.addResourceToList(needModelList);
                  }

                  if (this.player.checkResourceNum(needModelList)) {
                     int openDay = this.getActivityOpenDay();
                     int activityDay = this.getSeverActivityDay();
                     Map<Integer, SwimparkAstrolabelItemModel> itemModelMap = this.getGreatCityLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        SwimparkAstrolabelItemModel enjoyModel = (SwimparkAstrolabelItemModel)this.player.getGameModelPool().getEntity("SwimparkLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           SwimparkAstrolabelItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           String record = createTime + ":" + resourceModel.getType() + "," + resourceModel.getId() + "," + resourceModel.getValue();
                           dao.recordList.add(record);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, 79, 7904, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_SWIM_PACK_ACTIVITY, 79, 7906, 0, 0, "");
                        playerResetCustomCache.addDailyReset(31, lotteryNum);
                        SwimParkActivityMsg.S2C_Draw_16506.Builder builder = SwimParkActivityMsg.S2C_Draw_16506.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(31, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : resourceModels) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "游园惊梦-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, SwimparkAstrolabelItemModel> getGreatCityLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, SwimparkAstrolabelItemModel> itemModelMap = this.player.getGameModelPool().getMap("SwimparkLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, SwimparkAstrolabelItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, SwimparkAstrolabelItemModel> entry : itemModelMap.entrySet()) {
            if (((SwimparkAstrolabelItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((SwimparkAstrolabelItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((SwimparkAstrolabelItemModel)entry.getValue()).getDateStart() || openDay > ((SwimparkAstrolabelItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((SwimparkAstrolabelItemModel)entry.getValue()).getStageStart() && activityDay <= ((SwimparkAstrolabelItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private SwimparkAstrolabelItemModel smashEgg(SwimParkWineDao dao, Map<Integer, SwimparkAstrolabelItemModel> itemModelMap) {
      Map<Integer, SwimparkAstrolabelItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(SwimparkAstrolabelItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(SwimparkAstrolabelItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   public void checkAddUpIdListChange() {
      SwimParkWineDao dao = this.getSwimParkWineDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!addUpGotRewards.isEmpty()) {
         Map<Integer, SwimParkLampRiddleModel> stageModelMap = this.player.getGameModelPool().getMap("SwimparkLampRiddle");
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<SwimParkLampRiddleModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(SwimParkLampRiddleModel model : stageModelMap.values()) {
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
                     SwimParkLampRiddleModel addUpModel = this.getLampRiddleModel(id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(SwimParkLampRiddleModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(SwimParkLampRiddleModel addUpRechargeModel : addUpRechargeModelList) {
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
      List<SwimParkWineModel> conModelList = this.getSwimParkWineModelList();
      if (conModelList != null && conModelList.size() > 0) {
         Set<Integer> conIdSet = new HashSet();

         for(SwimParkWineModel model : conModelList) {
            conIdSet.add(model.getId());
         }

         SwimParkWineDao dao = this.getSwimParkWineDao();
         this.replaceConRewardIds(dao.canReceiveLowRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.canReceiveHighRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.hasReceiveRewardIds, conIdSet, conModelList);
         dao.updateOp();
      } else {
         this.logger.info("活动id:{} 连充配置表为空，请检查配置表", this.getActivityType());
      }
   }

   private void replaceConRewardIds(Set<Integer> daoRewardIds, Set<Integer> conIdSet, List<SwimParkWineModel> conModelList) {
      if (!daoRewardIds.isEmpty() && !conIdSet.containsAll(daoRewardIds)) {
         Set<Integer> newHasReceiveRewardIds = new HashSet();

         for(Integer rewardId : daoRewardIds) {
            SwimParkWineModel conModelById = this.getSwimParkWineModelById(rewardId);
            if (null != conModelById) {
               int stageNum = conModelById.getStageNum();
               int rechargeGear = conModelById.getRechargeGear();

               for(SwimParkWineModel model : conModelList) {
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
