package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.StarsActivityDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.WishStarBlessingModel;
import com.gzbz.model.WishStarSkyLampModel;
import com.gzbz.model.WishStartLotteryModel;
import com.gzbz.model.WishstarAddupAwardModel;
import com.gzbz.model.WishstarCostModel;
import com.gzbz.model.WishstarSilkBagItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.StarsActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.StarsActivitySilkBagTaskPart;
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
public class StarsActivityPart extends AbstractActivityPart {
   private static final String WISHSTAR_LOWEST_NUM = "WishstarLowestNum";
   private static final int DI_BAO_GROUP = 1;
   private Map<Integer, Integer> rateMap = new HashMap();
   private int drawtimes;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;

   public void rotateReset(int oldActivityId) {
      StarsActivityDao starsActivityDao = this.getDao();
      starsActivityDao.drawTime = 0;
      starsActivityDao.floorDrawMap.clear();
      starsActivityDao.rewardCountMap.clear();
      starsActivityDao.hadRewards.clear();
      starsActivityDao.prayNum = 0;
      starsActivityDao.recordList.clear();
      int lotteryStage = this.getSmashEggStage();
      starsActivityDao.lotteryStage = lotteryStage;
      starsActivityDao.fancyRewardId = 0;
      starsActivityDao.seniorRewards.clear();
      starsActivityDao.roundSmashNum.clear();
      starsActivityDao.updateOp();
      this.initPrayTask();
      this.clearActivityGift(24);
   }

   public void activityEnd(int oldActivityId) {
      this.WishBlessingEnd();
      this.lampRiddleActivityEnd();
      StarsActivityDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.updateOp();
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
         StarsActivityDao dao = this.getDao();
         int lotteryStage = this.getSmashEggStage();
         if (lotteryStage != dao.lotteryStage) {
            dao.lotteryStage = lotteryStage;
            dao.fancyRewardId = 0;
         }

         dao.nowRechargeMoney = 0;
         dao.rechargeCut = 0;
         dao.prayNum = 0;
         dao.updateOp();
         this.sendWishStarBlessingRewardInfo();
         this.initPrayTask();
         this.isStageChange();
         this.sendActivityInfo();
         this.sendDrawInfo();
      }
   }

   public void initPrayTask() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_STARS_ACTIVITY_PRAY);
      StarsActivitySilkBagTaskPart starsActivitySilkBagTaskPart = (StarsActivitySilkBagTaskPart)this.player.getMgrPart(StarsActivitySilkBagTaskPart.class);
      starsActivitySilkBagTaskPart.trigger();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendActivityInfo();
         this.lampRiddleRechargeHandle(0, true);
         this.WishBlessingRechargeHandle(0, true);
         this.sendDrawInfo();
         this.sendPrayInfo();
      }
   }

   public int getActivityType() {
      return 51;
   }

   protected int getSeverActivityDay() {
      return super.getSeverActivityDay();
   }

   public void activityRecharge(int money) {
      this.lampRiddleRechargeHandle(money, true);
      this.WishBlessingRechargeHandle(money, true);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_16401(StarsActivityMsg.C2S_ActivityInfo_16401 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      StarsActivityMsg.S2C_ActivityInfo_16402.Builder builder = StarsActivityMsg.S2C_ActivityInfo_16402.newBuilder();
      builder.setActivityOpenDay(this.getActivityOpenDay());
      builder.setSeverActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public List<WishStarSkyLampModel> getAddUpRewardByStage(int stage) {
      List<WishStarSkyLampModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      List<WishStarSkyLampModel> stageModelList = (List)this.player.getGameModelPool().getEntity("CustomWishstarSkyLamp", stage);
      if (null != stageModelList && stageModelList.size() > 0) {
         for(WishStarSkyLampModel model : stageModelList) {
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
         this.logger.info("{}阶段的WishStarSkyLamp为空，请检查配置表", stage);
         return modelList;
      }
   }

   public WishStarSkyLampModel getLampRiddleModel(int id) {
      WishStarSkyLampModel model = (WishStarSkyLampModel)this.player.getGameModelPool().getEntity("WishstarSkyLamp", id);
      return model;
   }

   public boolean isStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getNowStage();
      StarsActivityDao dao = this.getDao();
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
      Map<Integer, WishStarSkyLampModel> allMap = this.player.getGameModelPool().getMap("WishstarSkyLamp");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay <= 0) {
            return stage;
         }

         for(WishStarSkyLampModel model : allMap.values()) {
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
      StarsActivityDao dao = this.getDao();
      dao.stageRechargeMoney += addMoney;
      dao.updateOp();
      if (sendMsg) {
         this.sendLampRiddleRechargeRewardInfo();
      }

   }

   public void sendLampRiddleNotReceiveRewardMail() {
      StarsActivityDao dao = this.getDao();
      List<WishStarSkyLampModel> modelList = this.getAddUpRewardByStage(dao.stage);
      if (null != modelList && modelList.size() > 0) {
         List<Integer> notReceiveIdList = new ArrayList();
         List<ResourceModel> notReceiveRewardList = new ArrayList();

         for(WishStarSkyLampModel model : modelList) {
            Integer rewardId = model.getId();
            if (this.checkUnlockLampRiddle(rewardId) && !dao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
               notReceiveIdList.add(rewardId);
               notReceiveRewardList.addAll(model.getRewards());
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_STARS_KMTD);
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 78, 7805);
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
      StarsActivityDao dao = this.getDao();
      dao.stage = 1;
      dao.addUpGotRewards.clear();
      dao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_SkyLampRechargeTotalInfo_16451(StarsActivityMsg.C2S_SkyLampRechargeTotalInfo_16451 msg, String source) {
      this.sendLampRiddleRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveKmtdReward_16453(StarsActivityMsg.C2S_ReceiveKmtdReward_16453 msg, String source) {
      this.isStageChange();
      int rewardId = msg.getRewardId();
      StarsActivityDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (addUpGotRewards.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         WishStarSkyLampModel model = this.getLampRiddleModel(rewardId);
         if (null == model) {
            return this.player.failure(37);
         } else if (!this.checkLampRiddleRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            return this.player.failure(61224);
         } else if (!this.checkUnlockLampRiddle(rewardId)) {
            return this.player.failure(61212);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 78, 7805, 0, 0, "");
            dao.addUpGotRewards.add(rewardId);
            dao.updateOp();
            this.sendLampRiddleRechargeRewardInfo();
            return true;
         }
      }
   }

   public boolean checkLampRiddleRewardStage(int id) {
      WishStarSkyLampModel model = (WishStarSkyLampModel)this.player.getGameModelPool().getEntity("WishstarSkyLamp", id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         StarsActivityDao dao = this.getDao();
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
      WishStarSkyLampModel WishStarSkyLampModel = this.getLampRiddleModel(id);
      if (null == WishStarSkyLampModel) {
         return false;
      } else {
         StarsActivityDao dao = this.getDao();
         return dao.stageRechargeMoney >= WishStarSkyLampModel.getRechargeNum();
      }
   }

   public void sendLampRiddleRechargeRewardInfo() {
      StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.Builder resp = StarsActivityMsg.S2C_SkyLampRechargeTotalInfo_16452.newBuilder();
      StarsActivityDao dao = this.getDao();
      resp.addAllGotRewards(dao.addUpGotRewards);
      resp.setStageRecharge(dao.stageRechargeMoney);
      resp.setStageEndTime(this.getAddUpRechargeStageEndTime());
      this.player.sendMsg(resp.build());
   }

   public long getAddUpRechargeStageEndTime() {
      List<WishStarSkyLampModel> addUpRewardByStage = this.getAddUpRewardByStage(this.getNowStage());
      if (null != addUpRewardByStage && addUpRewardByStage.size() > 0) {
         WishStarSkyLampModel model = (WishStarSkyLampModel)addUpRewardByStage.get(0);
         int stageEnd = model.getStageEnd();
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long startTime = (long)activityInfo.start * 1000L;
         long result = startTime + (long)stageEnd * 86400000L;
         return result;
      } else {
         return 0L;
      }
   }

   public List<WishStarBlessingModel> getWishStarBlessingModelList() {
      List<WishStarBlessingModel> modelList = new ArrayList();
      Map<Integer, WishStarBlessingModel> all = this.player.getGameModelPool().getMap("WishstarBlessing");
      if (null != all && all.size() > 0) {
         Collection<WishStarBlessingModel> values = all.values();
         int activityStartDay = this.getActivityOpenDay();

         for(WishStarBlessingModel model : values) {
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
      int severActivityDay = this.getSeverActivityDay();
      List<WishStarBlessingModel> wishStarBlessingModelList = this.getWishStarBlessingModelList();
      if (null != wishStarBlessingModelList && wishStarBlessingModelList.size() > 0) {
         int maxStageNum = 1;

         for(WishStarBlessingModel model : wishStarBlessingModelList) {
            if (model.getStageNum() > maxStageNum) {
               maxStageNum = model.getStageNum();
            }
         }

         return maxStageNum <= severActivityDay ? maxStageNum : severActivityDay;
      } else {
         return 1;
      }
   }

   public void WishBlessingRechargeHandle(int money, boolean sendMsg) {
      StarsActivityDao dao = this.getDao();
      if (dao.nowRechargeMoney == -1) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         dao.nowRechargeMoney = dailyRecharge;
      } else {
         dao.nowRechargeMoney += money;
      }

      dao.updateOp();
      WishStarBlessingModel prepareUnlockLow = this.getPrepareUnlockWishStarBlessing(false);
      if (null != prepareUnlockLow) {
         int unlockCondition = dao.nowRechargeMoney - dao.rechargeCut;
         if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
            dao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
            dao.rechargeCut = dao.nowRechargeMoney;
            dao.updateOp();
         }
      }

      WishStarBlessingModel prepareUnlockHigh = this.getPrepareUnlockWishStarBlessing(true);
      if (null != prepareUnlockHigh) {
         int nowRechargeMoney = dao.nowRechargeMoney;
         if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
            dao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
            dao.nowRechargeMoney = 0;
            dao.rechargeCut = 0;
            dao.updateOp();
         }
      }

      if (sendMsg) {
         this.sendWishStarBlessingRewardInfo();
      }

   }

   public WishStarBlessingModel getPrepareUnlockWishStarBlessing(boolean isHighRechargeGear) {
      StarsActivityDao dao = this.getDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? dao.canReceiveHighRewardIds : dao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getWishStarBlessingModelByStageNum(1, isHighRechargeGear);
      } else {
         List<Integer> canReceiveRewardIdList = (List)canReceiveRewardIds.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
         WishStarBlessingModel wishStarBlessingModel = this.getWishStarBlessingModelById((Integer)canReceiveRewardIdList.get(0));
         int nextStageNum = wishStarBlessingModel.getStageNum() + 1;
         return nextStageNum > nowUnlockStageNum ? null : this.getWishStarBlessingModelByStageNum(nextStageNum, isHighRechargeGear);
      }
   }

   public void WishBlessingEnd() {
      this.checkConIdListChange();
      Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
      List<ResourceModel> notReceiveRewardList = new ArrayList();
      if (allCanReceiveRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
            WishStarBlessingModel wishStarBlessingModel = this.getWishStarBlessingModelById(canReceiveRewardId);
            if (null != wishStarBlessingModel && wishStarBlessingModel.getRewards().size() > 0) {
               notReceiveRewardList.addAll(wishStarBlessingModel.getRewards());
            }
         }
      }

      if (notReceiveRewardList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_STARS_WISH_BLESSING);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 78, 7806);
      }

      StarsActivityDao dao = this.getDao();
      dao.nowRechargeMoney = -1;
      dao.rechargeCut = 0;
      dao.canReceiveLowRewardIds.clear();
      dao.canReceiveHighRewardIds.clear();
      dao.hasReceiveRewardIds.clear();
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_WishStarBlessingTotalInfo_16455(StarsActivityMsg.C2S_WishStarBlessingTotalInfo_16455 msg, String source) {
      this.sendWishStarBlessingRewardInfo();
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      StarsActivityDao dao = this.getDao();
      canReceiveRewardIds.addAll(dao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(dao.canReceiveHighRewardIds);
      if (dao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(dao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public void sendWishStarBlessingRewardInfo() {
      StarsActivityDao dao = this.getDao();
      StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.Builder builder = StarsActivityMsg.S2C_WishStarBlessingTotalInfo_16456.newBuilder();
      builder.setUnlockStageNum(this.getNowUnlockStageNum());
      builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
      builder.addAllHasReceiveRewardIds(dao.hasReceiveRewardIds);
      builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
      this.player.sendMsg(builder.build());
   }

   public List<StarsActivityMsg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<StarsActivityMsg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      StarsActivityDao dao = this.getDao();
      WishStarBlessingModel lowModel = this.getPrepareUnlockWishStarBlessing(false);
      if (null != lowModel) {
         StarsActivityMsg.NextUnlockReceiveReward.Builder lowReceiveReward = StarsActivityMsg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowModel.getId());
         double unlockCondition = (double)(dao.nowRechargeMoney - dao.rechargeCut);
         double progress = unlockCondition / (double)lowModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      WishStarBlessingModel highModel = this.getPrepareUnlockWishStarBlessing(true);
      if (null != highModel) {
         StarsActivityMsg.NextUnlockReceiveReward.Builder highReceiveReward = StarsActivityMsg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highModel.getId());
         double nowRechargeMoney = (double)dao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveWishStarBlessingReward_16457(StarsActivityMsg.C2S_ReceiveWishStarBlessingReward_16457 msg, String source) {
      StarsActivityDao dao = this.getDao();
      int rewardId = msg.getRewardId();
      WishStarBlessingModel wishStarBlessingModel = this.getWishStarBlessingModelById(rewardId);
      if (null == wishStarBlessingModel) {
         return this.player.failure(61207);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(61207);
      } else if (dao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(61206);
      } else {
         this.player.addResource(wishStarBlessingModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 78, 7806, 0, 0, "");
         dao.hasReceiveRewardIds.add(rewardId);
         dao.updateOp();
         this.sendWishStarBlessingRewardInfo();
         return true;
      }
   }

   public StarsActivityDao getDao() {
      StarsActivityDao dao = (StarsActivityDao)this.player.getData("tb_stars_activity", this.player.getPlayerId());
      return dao;
   }

   public WishStarBlessingModel getWishStarBlessingModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;

      for(WishStarBlessingModel model : this.getWishStarBlessingModelList()) {
         if (model.getStageNum() == stageNum && model.getRechargeGear() == rechargeGear) {
            return model;
         }
      }

      return null;
   }

   public WishStarBlessingModel getWishStarBlessingModelById(int id) {
      WishStarBlessingModel wishStarBlessingModel = (WishStarBlessingModel)this.player.getGameModelPool().getEntity("WishstarBlessing", id);
      return wishStarBlessingModel;
   }

   public void sendDrawInfo() {
      StarsActivityDao dao = this.getDao();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      StarsActivityMsg.S2C_LuckDrawInfo_16404.Builder builder = StarsActivityMsg.S2C_LuckDrawInfo_16404.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(26, 0);
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

   public List<WishStartLotteryModel> getDrawJackpot() {
      List<WishStartLotteryModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, WishStartLotteryModel>> wishstarItemGroupModelMap = ApplicationContextProvider.<Integer, Map<Integer, WishStartLotteryModel>>getModelPoolMap("CustomWishStarLotteryItem");
      TreeMap<Integer, Map<Integer, WishStartLotteryModel>> treeMap = new TreeMap(wishstarItemGroupModelMap);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, WishStartLotteryModel> modelMap = (Map)wishstarItemGroupModelMap.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(WishStartLotteryModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<WishStartLotteryModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("愿起星辰 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         WishStartLotteryModel model = (WishStartLotteryModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(WishStartLotteryModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadWishStarRecord_4224.Builder builder = CrossMsg.S2CR_UploadWishStarRecord_4224.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_16407(StarsActivityMsg.C2S_OpenReward_16407 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         WishstarAddupAwardModel awardModel = (WishstarAddupAwardModel)ApplicationContextProvider.getModelPoolEntity("WishstarAddupAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               StarsActivityDao starsActivityDao = this.getDao();
               if (starsActivityDao.hadRewards.contains(id)) {
                  this.logger.info("愿起星辰 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > starsActivityDao.drawTime) {
                  this.logger.info("愿起星辰 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", starsActivityDao.drawTime, awardModel.getAddupNum());
               } else {
                  starsActivityDao.hadRewards.add(id);
                  starsActivityDao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 78, 7803, 0, 0, "");
                  StarsActivityMsg.S2C_OpenReward_16408.Builder builder = StarsActivityMsg.S2C_OpenReward_16408.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("愿起星辰 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Pray_16421(StarsActivityMsg.C2S_Pray_16421 msg, String souce) {
      StarsActivitySilkBagTaskPart taskPart = (StarsActivitySilkBagTaskPart)this.player.getMgrPart(StarsActivitySilkBagTaskPart.class);
      StarsActivityDao starsActivityDao = this.getDao();
      int residueTime = taskPart.getCompleteTaskNum() - starsActivityDao.prayNum;
      if (residueTime <= 0) {
         this.logger.info("剩余祈福次数不足");
      } else {
         List<KeyValFun> list = new ArrayList();
         Map<Integer, WishstarSilkBagItemModel> modelMap = ApplicationContextProvider.<Integer, WishstarSilkBagItemModel>getModelPoolMap("WishstarSilkBagItem");

         for(WishstarSilkBagItemModel model : modelMap.values()) {
            list.add(new KeyValFun(model.getId(), model.getOdd()));
         }

         ++starsActivityDao.prayNum;
         starsActivityDao.updateOp();
         GamePlayer var10000 = this.player;
         int id = GamePlayer.countRate(list);
         WishstarSilkBagItemModel model = (WishstarSilkBagItemModel)modelMap.get(id);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 78, 7801, 0, 0, "");
         StarsActivityMsg.S2C_Pray_16422.Builder builder = StarsActivityMsg.S2C_Pray_16422.newBuilder();
         builder.setPrayNum(residueTime - 1);
         this.player.sendMsg(builder.build());
      }
   }

   public void finishPrayTask() {
      this.sendPrayInfo();
   }

   private void sendPrayInfo() {
      StarsActivitySilkBagTaskPart taskPart = (StarsActivitySilkBagTaskPart)this.player.getMgrPart(StarsActivitySilkBagTaskPart.class);
      StarsActivityDao starsActivityDao = this.getDao();
      int residueTime = taskPart.getCompleteTaskNum() - starsActivityDao.prayNum;
      StarsActivityMsg.S2C_PrayInfo_16426.Builder builder = StarsActivityMsg.S2C_PrayInfo_16426.newBuilder();
      builder.setPrayNum(residueTime);
      this.player.sendMsg(builder.build());
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
      StarsActivityDao starsActivityDao = this.getDao();
      starsActivityDao.drawTime = 0;
      starsActivityDao.floorDrawMap.clear();
      starsActivityDao.rewardCountMap.clear();
      starsActivityDao.updateOp();
      this.sendDrawInfo();
   }

   public void checkAddUpIdListChange() {
      StarsActivityDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!addUpGotRewards.isEmpty()) {
         Map<Integer, WishStarSkyLampModel> stageModelMap = this.player.getGameModelPool().getMap("WishstarSkyLamp");
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<WishStarSkyLampModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(WishStarSkyLampModel model : stageModelMap.values()) {
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
                     WishStarSkyLampModel addUpModel = this.getLampRiddleModel(id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(WishStarSkyLampModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(WishStarSkyLampModel addUpRechargeModel : addUpRechargeModelList) {
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
      List<WishStarBlessingModel> conModelList = this.getWishStarBlessingModelList();
      if (conModelList != null && conModelList.size() > 0) {
         Set<Integer> conIdSet = new HashSet();

         for(WishStarBlessingModel model : conModelList) {
            conIdSet.add(model.getId());
         }

         StarsActivityDao dao = this.getDao();
         this.replaceConRewardIds(dao.canReceiveLowRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.canReceiveHighRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.hasReceiveRewardIds, conIdSet, conModelList);
         dao.updateOp();
      } else {
         this.logger.info("活动id:{} 连充配置表为空，请检查配置表", this.getActivityType());
      }
   }

   private void replaceConRewardIds(Set<Integer> daoRewardIds, Set<Integer> conIdSet, List<WishStarBlessingModel> conModelList) {
      if (!daoRewardIds.isEmpty() && !conIdSet.containsAll(daoRewardIds)) {
         Set<Integer> newHasReceiveRewardIds = new HashSet();

         for(Integer rewardId : daoRewardIds) {
            WishStarBlessingModel conModelById = this.getWishStarBlessingModelById(rewardId);
            if (null != conModelById) {
               int stageNum = conModelById.getStageNum();
               int rechargeGear = conModelById.getRechargeGear();

               for(WishStarBlessingModel model : conModelList) {
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

   @MsgHandlerAnno
   public void C2S_FancyReward_20013(StarsActivityMsg.C2S_FancyReward_16413 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         StarsActivityDao dao = this.getDao();
         WishStartLotteryModel laborDayLotteryItemModel = (WishStartLotteryModel)this.player.getGameModelPool().getEntity("WishstarLotteryItem", msg.getTargetId());
         if (laborDayLotteryItemModel != null) {
            if (laborDayLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), laborDayLotteryItemModel.getId(), laborDayLotteryItemModel.getItemGroup()});
            } else if (dao.lotteryStage != laborDayLotteryItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), laborDayLotteryItemModel.getId(), laborDayLotteryItemModel.getStage()});
            } else {
               int openDay = this.getActivityOpenDay();
               if (laborDayLotteryItemModel.getDateEnd() == -1) {
                  if (laborDayLotteryItemModel.getDateStart() > openDay) {
                     this.player.failure(0);
                     this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), laborDayLotteryItemModel.getId(), openDay});
                     return;
                  }
               } else if (openDay < laborDayLotteryItemModel.getDateStart() || openDay > laborDayLotteryItemModel.getDateEnd()) {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), laborDayLotteryItemModel.getId(), openDay});
                  return;
               }

               int activityDay = this.getSeverActivityDay();
               if (activityDay >= laborDayLotteryItemModel.getStageStart() && activityDay <= laborDayLotteryItemModel.getStageEnd()) {
                  if (laborDayLotteryItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, laborDayLotteryItemModel.getId(), 0);
                     if (selectNum >= laborDayLotteryItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(laborDayLotteryItemModel.getId()), laborDayLotteryItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getTargetId();
                  dao.updateOp();
                  StarsActivityMsg.S2C_FancyReward_16414.Builder builder = StarsActivityMsg.S2C_FancyReward_16414.newBuilder();
                  builder.setResult(1);
                  builder.setTargetId(msg.getTargetId());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), laborDayLotteryItemModel.getId(), activityDay});
               }
            }
         }
      }
   }

   public int getSmashEggStage() {
      Map<Integer, WishStartLotteryModel> allMap = this.player.getGameModelPool().getMap("WishstarLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(WishStartLotteryModel model : allMap.values()) {
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
   public void C2S_Draw_16405(StarsActivityMsg.C2S_Draw_16405 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         WishstarCostModel costModel = (WishstarCostModel)ApplicationContextProvider.getModelPoolEntity("WishstarCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(26, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               StarsActivityDao dao = this.getDao();
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
                     Map<Integer, WishStartLotteryModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        WishStartLotteryModel enjoyModel = (WishStartLotteryModel)this.player.getGameModelPool().getEntity("WishstarLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           WishStartLotteryModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           StarsActivityDao.RecordInfo recordInfo = new StarsActivityDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, 78, 7802, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_STARS_ACTIVITY, 78, 7804, 0, 0, "");
                        playerResetCustomCache.addDailyReset(26, lotteryNum);
                        StarsActivityMsg.S2C_Draw_16406.Builder builder = StarsActivityMsg.S2C_Draw_16406.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(26, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : resourceModels) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "愿起星辰-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, WishStartLotteryModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, WishStartLotteryModel> itemModelMap = this.player.getGameModelPool().getMap("WishstarLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, WishStartLotteryModel> resultMap = new HashMap();

         for(Map.Entry<Integer, WishStartLotteryModel> entry : itemModelMap.entrySet()) {
            if (((WishStartLotteryModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((WishStartLotteryModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((WishStartLotteryModel)entry.getValue()).getDateStart() || openDay > ((WishStartLotteryModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((WishStartLotteryModel)entry.getValue()).getStageStart() && activityDay <= ((WishStartLotteryModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private WishStartLotteryModel smashEgg(StarsActivityDao dao, Map<Integer, WishStartLotteryModel> itemModelMap) {
      Map<Integer, WishStartLotteryModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(WishStartLotteryModel lotteryItemModel : itemModelMap.values()) {
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

         for(WishStartLotteryModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_16409(StarsActivityMsg.C2S_DrawRecord_16409 msg, String source) {
      StarsActivityMsg.S2C_DrawRecord_16410.Builder builder = StarsActivityMsg.S2C_DrawRecord_16410.newBuilder();
      StarsActivityDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         StarsActivityMsg.MyDrawRecord.Builder drawRecord = StarsActivityMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_16411(StarsActivityMsg.C2S_ServerDrawRecord_16411 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      WishStartLotteryModel model = (WishStartLotteryModel)this.player.getGameModelPool().getEntity("WishstarLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, WishStartLotteryModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               WishStartLotteryModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private WishStartLotteryModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, WishStartLotteryModel> itemModelMap) {
      Map<Integer, WishStartLotteryModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(WishStartLotteryModel lotteryItemModel : itemModelMap.values()) {
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

         for(WishStartLotteryModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
