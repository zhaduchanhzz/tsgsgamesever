package com.gzbz.activity.part;

import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.CustomizeGiftData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.RechargeAwardModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.springframework.util.CollectionUtils;

public abstract class AbstractActivityPart extends PlayerPart {
   public abstract void sendInfo();

   public abstract int getActivityType();

   public void rotateReset(int oldActivityId) {
   }

   public int getShopId() {
      return 0;
   }

   public void activityEnd(int oldActivityId) {
   }

   public ResourceModel activityDrop(int minute) {
      return null;
   }

   public void customizeGiftBuy(int buyId, List<ResourceModel> resourceModels) {
      this.customGiftResources(this.getCustomizeGiftData(buyId), resourceModels);
   }

   protected CustomizeGiftData getCustomizeGiftData(int buyId) {
      return null;
   }

   public void sendCustomizeGiftBuy(int buyId) {
   }

   protected int checkAndBuy(int buyId, int reason) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      return giftPart.checkAndBuy(buyId, this.getPlayerActivityId(), 8, reason);
   }

   public int getPlayerActivityId() {
      return this.getPlayerActivityInfo().id;
   }

   protected ActivityInfo getPlayerActivityInfo() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, this.getActivityType(), ActivityInfo.class);
   }

   public ActivityInfo getServerActivityInfo() {
      return this.getActivityMgr().getActivityInfo(this.getActivityType());
   }

   public boolean isLastDay() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      return activityInfo != null && activityInfo.id > 0 && DateUtil.isSameDay((long)activityInfo.end * 1000L);
   }

   public List<RechargeAwardModel> getRechargeAwards(int rotaingActivityId) {
      List<RechargeAwardModel> rechargeAwardModels = new ArrayList();
      if (rotaingActivityId > 0) {
         Map<Integer, List<RechargeAwardModel>> allRewards = ApplicationContextProvider.<Integer, List<RechargeAwardModel>>getModelPoolMap("customRechargeAward");
         rechargeAwardModels.addAll((Collection)MapUtil.getOrDefault(allRewards, rotaingActivityId, ArrayList.class));
      }

      return rechargeAwardModels;
   }

   protected boolean checkRechargeAward(int awardId, int rotateActivityId) {
      List<RechargeAwardModel> rechargeAwardModels = this.getRechargeAwards(rotateActivityId);
      if (rechargeAwardModels != null && !rechargeAwardModels.isEmpty()) {
         for(RechargeAwardModel rechargeAwardModel : rechargeAwardModels) {
            if (rechargeAwardModel.getId() == awardId) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean isServerActivityInvalid() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0 && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis()) && activityInfo.open) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         if (activityOpenTimeModel == null) {
            return true;
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            List<String> areaLimit = activityOpenTimeModel.getAreanLimit();
            if (!CollectionUtils.isEmpty(areaLimit) && !areaLimit.contains(worldMgr.country)) {
               return true;
            } else {
               PlayerPublicDao playerPublicDao = this.player.getPublicDao();
               return activityOpenTimeModel.getNeedLevel() > playerPublicDao.lv || !this.player.isSystemOpen(activityOpenTimeModel.getSystemid());
            }
         }
      } else {
         return true;
      }
   }

   protected PlayerResetCustomCache getResetCache() {
      return (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
   }

   protected ActivityMgr getActivityMgr() {
      return (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
   }

   protected ConfigManager getConfigManager() {
      return (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
   }

   public int getActivityOpenDay() {
      return this.getActivityMgr().getActivityOpenDay(this.getActivityType());
   }

   public int getPlayerActivityOpenDay() {
      ActivityInfo playerActivityInfo = this.getPlayerActivityInfo();
      if (playerActivityInfo != null && playerActivityInfo.id != 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         int openServerDay = DateUtil.difftimeDay(new Timestamp(worldMgr.getOpenServerTime())) + 1;
         int activityStartDay = openServerDay - (DateUtil.difftimeDay(new Timestamp((long)playerActivityInfo.start * 1000L)) + 1) + 1;
         return activityStartDay <= 0 ? 1 : activityStartDay;
      } else {
         return 0;
      }
   }

   protected int getSeverActivityDay() {
      return this.getActivityMgr().getSeverActivityDay(this.getActivityType());
   }

   protected ActivityMsg.CustomGiftData.Builder buildGiftData(int customId, CustomizeGiftData customizeGiftData) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(17);
      ActivityMsg.CustomGiftData.Builder customGiftDataBuilder = ActivityMsg.CustomGiftData.newBuilder();
      customGiftDataBuilder.setCustomId(customId);
      customGiftDataBuilder.setIsBuy(giftDaoMap.containsKey(customId));
      if (customGiftDataBuilder.getIsBuy()) {
         for(long groupItem : customizeGiftData.groupItems) {
            int group = MiscUtil.getHiParam(groupItem);
            int itemIndex = MiscUtil.getLowParam(groupItem);
            SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", group);
            if (specificGroupModel != null) {
               List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
               if (resourceModelList != null && resourceModelList.size() > itemIndex) {
                  ActivityMsg.CustomGiftItemData.Builder customGiftItemBuilder = ActivityMsg.CustomGiftItemData.newBuilder();
                  customGiftItemBuilder.setGroupId(group);
                  customGiftItemBuilder.setItem(((ResourceModel)resourceModelList.get(itemIndex)).builder());
                  customGiftDataBuilder.addCustomItemData(customGiftItemBuilder);
               }
            }
         }
      }

      return customGiftDataBuilder;
   }

   private void customGiftResources(CustomizeGiftData customizeGiftData, List<ResourceModel> resourceModels) {
      if (customizeGiftData != null) {
         for(long groupItem : customizeGiftData.groupItems) {
            int group = MiscUtil.getHiParam(groupItem);
            int itemIndex = MiscUtil.getLowParam(groupItem);
            SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", group);
            if (specificGroupModel != null) {
               resourceModels.add(specificGroupModel.getRewards().get(itemIndex));
            }
         }

      }
   }

   protected void clearActivityGift(int giftType) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.removeGiftsByActivityType(giftType, this.getActivityType());
   }

   protected boolean inServerActDropTime() {
      if (this.isServerActivityInvalid()) {
         return false;
      } else {
         return this.getServerActivityInfo().drop > DateUtil.getIntTime(System.currentTimeMillis());
      }
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
   }

   protected void sendMergeMail(int mailType, List<ResourceModel> rewardList) {
      if (rewardList != null && !rewardList.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)allAwardModelMap.get(mailType);
         if (rewardMap != null && !rewardMap.isEmpty()) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMap.firstEntry().getValue();
            if (centreAwardModel == null) {
               this.logger.error("找不到类型{}的邮件配置", mailType);
            } else {
               ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", this.getPlayerActivityId());
               if (activityOpenTimeModel == null) {
                  this.logger.error("找不到活动{}的配置", this.getPlayerActivityId());
               } else {
                  SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", activityOpenTimeModel.getSystemid());
                  if (systemFunctionModel == null) {
                     this.logger.error("找不到系统{}的配置", activityOpenTimeModel.getSystemid());
                  } else {
                     MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                     mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, MessageFormat.format(centreAwardModel.getTitle(), systemFunctionModel.getName()), MessageFormat.format(centreAwardModel.getDesc(), systemFunctionModel.getName()), rewardList, 604800000L, 93, 9301);
                  }
               }
            }
         } else {
            this.logger.error("找不到类型{}的邮件配置", mailType);
         }
      }
   }

   public int calcAndReturnAddMoney(int money) {
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
      return addMoney;
   }

   public int getCrossActOpenDay() {
      ActivityInfo serverActivityInfo = this.getServerActivityInfo();
      return serverActivityInfo != null && serverActivityInfo.crossActOpenDay > 0 ? serverActivityInfo.crossActOpenDay : -1;
   }
}
