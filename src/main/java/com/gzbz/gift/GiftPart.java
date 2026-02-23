package com.gzbz.gift;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.AbstractActivityPart;
import com.gzbz.activity.part.FlashSalePart;
import com.gzbz.activity.part.WeekendKoiPart;
import com.gzbz.benefit.MonthlyPreferentialPart;
import com.gzbz.benefit.WeeklyPreferentialPart;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WarHLDao;
import com.gzbz.db.bean.LevelGiftData;
import com.gzbz.gameCache.GiftCustomCache;
import com.gzbz.gameDefine.ClientTrackingEnum;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.tracking.ClientTrackingPart;
import com.gzbz.gift.bean.LifeTimeCardData;
import com.gzbz.gift.bean.PlayerGiftExtend;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CustomizeGiftBagModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LevelGiftBagModel;
import com.gzbz.model.LifetimeCardRewardModel;
import com.gzbz.model.MonthAwardModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.PopupPackageModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SpecialWeeklyCardBaseModel;
import com.gzbz.model.SpecialWeeklySevenAwardModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.WeeklyAward2Model;
import com.gzbz.model.WeeklyAwardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.privilege.DailyGiftPart;
import com.gzbz.privilege.PrivilegeMallPart;
import com.gzbz.protobuf.GiftMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GiftPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_GiftBuy_8609(GiftMsg.C2S_GiftBuy_8609 msg, String source) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", msg.getBuyId());
      if (shopLimitModel == null) {
         this.player.failure(0);
      } else {
         int result = this.checkAndBuy(msg.getBuyId(), 0, 22, 2204);
         if (result != 1) {
            this.player.failure(result);
         } else {
            GiftDao giftDao = (GiftDao)this.getBuyGifts(shopLimitModel.getGiftType()).get(msg.getBuyId());
            GiftMsg.S2C_GiftBuy_8610.Builder resp = GiftMsg.S2C_GiftBuy_8610.newBuilder();
            resp.setBuyId(msg.getBuyId());
            resp.setBuyCount(giftDao.count);
            resp.setEndTime(DateUtil.getIntTime(giftDao.invalidTime));
            resp.setGotDay(0);
            this.player.sendMsg(resp.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GiftList_8611(GiftMsg.C2S_GiftList_8611 msg, String source) {
      this.sendGiftList();
   }

   @MsgHandlerAnno
   public void C2S_TimeLimitGiftBuy_8604(GiftMsg.C2S_TimeLimitGiftBuy_8604 msg, String source) {
      int buyId = msg.getBuyId();
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
      if (shopLimitModel == null) {
         this.player.failure(0);
      } else {
         PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", shopLimitModel.getActivityId());
         if (popupPackageModel == null) {
            this.player.failure(0);
         } else {
            PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
            if (!playerGiftExtend.timeLimit.containsKey(popupPackageModel.getType())) {
               this.player.failure(22001);
            } else {
               int result = this.checkAndBuy(buyId, 0, 22, 2201);
               if (result != 1) {
                  this.player.failure(result);
               } else {
                  GiftMsg.S2C_TimeLimitGiftBuy_8605.Builder resp = GiftMsg.S2C_TimeLimitGiftBuy_8605.newBuilder();
                  resp.setBuyId(buyId);
                  this.player.sendMsg(resp.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TimeLimitGiftList_8606(GiftMsg.C2S_TimeLimitGiftList_8606 msg, String source) {
      this.sendTimeLimitGiftList();
   }

   @MsgHandlerAnno
   public void C2S_LevelGiftMain_8613(GiftMsg.C2S_LevelGiftMain_8613 msg, String source) {
      this.sendLevelGiftMain();
   }

   @MsgHandlerAnno
   public void C2S_LevelGiftReward_8615(GiftMsg.C2S_LevelGiftReward_8615 msg, String source) {
      GiftMsg.LevelGiftData levelGiftData = msg.getGetGift();
      Map<Integer, Map<Integer, LevelGiftBagModel>> allLevelGiftModelMap = ApplicationContextProvider.<Integer, Map<Integer, LevelGiftBagModel>>getModelPoolMap("customlevelGiftBag");
      if (!allLevelGiftModelMap.containsKey(levelGiftData.getType())) {
         this.player.failure(0);
      } else {
         Map<Integer, LevelGiftBagModel> levelGiftBagModelMap = (Map)allLevelGiftModelMap.get(levelGiftData.getType());
         if (!levelGiftBagModelMap.containsKey(levelGiftData.getLevel())) {
            this.player.failure(0);
         } else {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            if (playerActivityDao.levelGiftGot.containsKey(levelGiftData.getType()) && ((LevelGiftData)playerActivityDao.levelGiftGot.get(levelGiftData.getType())).getLevel().contains(levelGiftData.getLevel())) {
               this.player.failure(24);
            } else {
               if (levelGiftData.getType() == 2) {
                  Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(22);
                  if (giftDaoMap.isEmpty()) {
                     this.player.failure(22002);
                     return;
                  }
               }

               PlayerDao playerDao = this.player.getPlayerDao();
               if (playerDao.lv < levelGiftData.getLevel()) {
                  this.player.failure(20);
               } else {
                  LevelGiftBagModel levelGiftBagModel = (LevelGiftBagModel)levelGiftBagModelMap.get(levelGiftData.getLevel());
                  LevelGiftData data = (LevelGiftData)playerActivityDao.levelGiftGot.get(levelGiftBagModel.getAwardGroup());
                  if (data == null) {
                     data = new LevelGiftData(levelGiftBagModel.getAwardGroup());
                  }

                  data.getLevel().add(levelGiftBagModel.getTaskName());
                  playerActivityDao.levelGiftGot.put(levelGiftBagModel.getAwardGroup(), data);
                  playerActivityDao.updateOp();
                  this.player.addResource(levelGiftBagModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2205, levelGiftBagModel.getTaskName(), levelGiftBagModel.getAwardGroup(), "");
                  GiftMsg.S2C_LevelGiftReward_8616.Builder resp = GiftMsg.S2C_LevelGiftReward_8616.newBuilder();
                  resp.setGetGift(msg.getGetGift());
                  this.player.sendMsg(resp.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WeeklyCardReward_8619(GiftMsg.C2S_WeeklyCardReward_8619 msg, String source) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", msg.getGiftId());
      if (shopLimitModel != null && shopLimitModel.getGiftType() == 25) {
         Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(25);
         GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
         if (giftDao == null) {
            this.player.failure(22002);
         } else {
            long buyTime = giftDao.invalidTime - (long)shopLimitModel.getTimeLimit() * 86400000L + 1000L;
            if (msg.getDay() > 0 && DateUtil.difftimeDay(new Timestamp(buyTime)) >= msg.getDay() - 1) {
               int result = this.weeklyCardReward(shopLimitModel, msg.getDay(), false);
               if (result != 1) {
                  this.player.failure(result);
               } else {
                  GiftMsg.S2C_WeeklyCardReward_8620.Builder resp = GiftMsg.S2C_WeeklyCardReward_8620.newBuilder();
                  resp.setDay(msg.getDay());
                  resp.setGiftId(msg.getGiftId());
                  this.player.sendMsg(resp.build());
               }
            } else {
               this.player.failure(0);
            }
         }
      } else {
         this.player.failure(0);
      }
   }

   public void afterBuyTimeLimitGift(int buyId) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
      if (shopLimitModel != null) {
         int giftType = shopLimitModel.getGiftType();
         Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(giftType);
         GiftMsg.S2C_TimeLimitGiftBuy_8605.Builder resp = GiftMsg.S2C_TimeLimitGiftBuy_8605.newBuilder();
         resp.setBuyId(buyId);
         resp.setBuyCount(((GiftDao)MapUtil.getOrDefault(giftDaoMap, buyId, GiftDao.class)).count);
         this.player.sendMsg(resp.build());
         PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", shopLimitModel.getActivityId());
         if (popupPackageModel != null) {
            PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
            playerGiftExtend.addTrigger(popupPackageModel.getType());
            Map<Integer, Map<Integer, Map<Integer, ShopLimitModel>>> shopLimitMap = ApplicationContextProvider.<Integer, Map<Integer, Map<Integer, ShopLimitModel>>>getModelPoolMap("customShopLimit");
            Map<Integer, ShopLimitModel> timeLimitGiftMap = MapUtil.getOrDefault(MapUtil.getOrDefault(shopLimitMap, giftType, ConcurrentHashMap.class), shopLimitModel.getActivityId(), TreeMap.class);
            Set<Integer> emptyGifts = new HashSet();

            for(GiftDao giftDao : giftDaoMap.values()) {
               if (timeLimitGiftMap.containsKey(giftDao.giftId) && ((ShopLimitModel)timeLimitGiftMap.get(giftDao.giftId)).getLimitCount() <= giftDao.count) {
                  emptyGifts.add(giftDao.giftId);
               }
            }

            if (emptyGifts.size() >= timeLimitGiftMap.size()) {
               playerGiftExtend.timeLimit.remove(shopLimitModel.getActivityId());
               if (popupPackageModel.getGiftType() == 1 || popupPackageModel.getGiftType() == 3) {
                  if (popupPackageModel.getBuyAllTriggerTimes() > 0 && !playerGiftExtend.todayBuyLimit.containsKey(popupPackageModel.getType())) {
                     playerGiftExtend.todayBuyLimit.put(popupPackageModel.getType(), 0);
                  }

                  GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());

                  for(int giftId : emptyGifts) {
                     GiftDao giftDao = (GiftDao)giftDaoMap.get(giftId);
                     if (giftDao != null) {
                        giftCustomCache.removeGift(giftDao);
                     }
                  }
               }
            }

            this.updatePlayerGiftExtend();
         }
      }
   }

   public Map<Integer, GiftDao> getBuyGifts(int giftType) {
      GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
      return giftCustomCache.getBuyGifts(giftType);
   }

   public Map<Integer, GiftDao> getBuyGifts(int giftType, int activityId) {
      Map<Integer, GiftDao> resultMap = new ConcurrentHashMap();
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(giftType);

      for(Map.Entry<Integer, GiftDao> giftDaoEntry : giftDaoMap.entrySet()) {
         ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", (Integer)giftDaoEntry.getKey());
         if (shopLimitModel != null && shopLimitModel.getActivityId() == activityId) {
            resultMap.put(giftDaoEntry.getKey(), giftDaoEntry.getValue());
         }
      }

      return resultMap;
   }

   public boolean isLimit(int giftId) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftId);
      if (shopLimitModel == null) {
         return true;
      } else {
         Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(shopLimitModel.getGiftType());
         GiftDao giftDao = (GiftDao)giftDaoMap.get(giftId);
         if (giftDao == null) {
            return false;
         } else {
            return giftDao.count >= shopLimitModel.getLimitCount();
         }
      }
   }

   public void clearGifts(int giftType) {
      if (giftType == 24) {
         this.logger.error("主题礼包被多个模块共享，不能一次性删除 清使用 clearActivityGift");
      } else {
         for(int gift : this.getBuyGifts(giftType).keySet()) {
            ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", gift);
            if (shopLimitModel != null) {
               this.resetPrivilege(shopLimitModel);
            }
         }

         GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
         giftCustomCache.clearGifts(giftType);
      }
   }

   public void removeGift(int giftId) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftId);
      if (shopLimitModel != null) {
         GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
         Map<Integer, GiftDao> giftDaoMap = giftCustomCache.getBuyGifts(shopLimitModel.getGiftType());
         GiftDao giftDao = (GiftDao)giftDaoMap.get(giftId);
         if (giftDao != null) {
            giftCustomCache.removeGift(giftDao);
         }

         this.resetPrivilege(shopLimitModel);
      }
   }

   public void removeGiftsByActivityType(int giftType, int activityType) {
      GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(giftType);

      for(Map.Entry<Integer, GiftDao> giftDaoEntry : giftDaoMap.entrySet()) {
         GiftDao giftDao = (GiftDao)giftDaoEntry.getValue();
         ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftDao.giftId);
         if (shopLimitModel == null) {
            giftCustomCache.removeGift(giftDao);
         } else {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", shopLimitModel.getActivityId());
            if (activityOpenTimeModel != null && activityOpenTimeModel.getActivityType() == activityType) {
               giftCustomCache.removeGift(giftDao);
               this.resetPrivilege(shopLimitModel);
            }
         }
      }

   }

   public boolean addGift(ShopLimitModel shopLimitModel) {
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(shopLimitModel.getGiftType());
      GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
      long offsetTime = 0L;
      if (giftDao != null && giftDao.giftType == 34) {
         this.logger.info("【月卡】失效前玩家又购买了月卡，先把未发奖励全部发完 playerId:{} giftId:{}", this.player.getPlayerId(), giftDao.giftId);
         this.monthCardAllReward(giftDao);
         GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
         giftCustomCache.removeGift(giftDao);
         giftDao = null;
         offsetTime = 86400000L;
      }

      if (giftDao == null) {
         giftDao = new GiftDao();
         giftDao.count = 1;
         giftDao.giftId = shopLimitModel.getId();
         giftDao.playerId = this.player.getPlayerId();
         giftDao.giftType = shopLimitModel.getGiftType();
         long invalidTime = 0L;
         switch (shopLimitModel.getRefresh()) {
            case 1:
               invalidTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis()) + 86400000L;
               break;
            case 2:
               invalidTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis()) + 604800000L;
               break;
            case 3:
               invalidTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis()) + 2592000000L;
               break;
            case 4:
               if (shopLimitModel.getTimeLimit() > 0) {
                  invalidTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis()) + 86400000L * (long)shopLimitModel.getTimeLimit();
                  if (shopLimitModel.getGiftType() == 34) {
                     invalidTime += offsetTime;
                  }
               }
         }

         giftDao.invalidTime = invalidTime;
         GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
         giftCustomCache.addGift(giftDao);
      } else {
         if (shopLimitModel.getLimitCount() > 0 && giftDao.count + 1 > shopLimitModel.getLimitCount()) {
            this.logger.error("玩家{}购买【{}】已限购{}", new Object[]{this.player.getPlayerId(), shopLimitModel.getTips(), shopLimitModel.getLimitCount()});
            return false;
         }

         if (shopLimitModel.getGiftType() == 42) {
            if (giftDao.invalidTime < DateUtil.getSomeDayBeginTime(System.currentTimeMillis())) {
               giftDao.invalidTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis()) + 86400000L * (long)shopLimitModel.getTimeLimit();
            } else {
               giftDao.invalidTime += 86400000L * (long)shopLimitModel.getTimeLimit();
            }
         }

         ++giftDao.count;
         giftDao.updateOp();
      }

      if (giftDao.giftType == 34 && offsetTime == 0L) {
         this.monthCardReward(shopLimitModel, 1, true);
      }

      return true;
   }

   public void triggerTimeLimitGift(int condition) {
      if (this.player.isSystemOpen(1880)) {
         PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
         int curValue = (Integer)MapUtil.getOrDefault(playerGiftExtend.triggerValue, condition, 0);
         Map<Integer, Integer> maxCountMap = ApplicationContextProvider.<Integer, Integer>getModelPoolMap("customPopupPackageConditionMax");
         if (curValue < (Integer)MapUtil.getOrDefault(maxCountMap, condition, 0)) {
            ++curValue;
            playerGiftExtend.triggerValue.put(condition, curValue);
            this.updatePlayerGiftExtend();
         }

         this.triggerTimeLimitGift(condition, curValue, true);
      }
   }

   public void triggerTimeLimitGift(int condition, int value) {
      this.triggerTimeLimitGift(condition, value, false);
   }

   public void triggerTimeLimitGift(int condition, int value, boolean bigger) {
      if (this.player.isSystemOpen(1880)) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
         Map<Integer, PopupPackageModel> popupPackageModelMap = ApplicationContextProvider.<Integer, PopupPackageModel>getModelPoolMap("popupPackage");
         GiftMsg.S2C_TimeLimitGiftListNotify_8601.Builder giftsMsg = GiftMsg.S2C_TimeLimitGiftListNotify_8601.newBuilder();

         for(PopupPackageModel popupPackageModel : popupPackageModelMap.values()) {
            if (popupPackageModel.getIsTrigger() == 1) {
               boolean existCondition = false;

               for(KeyValFun keyValFun : popupPackageModel.getConditions()) {
                  if (keyValFun.getKey() == condition && (!bigger && keyValFun.getVal() == value || bigger && keyValFun.getVal() <= value)) {
                     existCondition = true;
                     break;
                  }
               }

               if (existCondition && this.checkSatisfied(popupPackageModel)) {
                  int todayBuyLimit = (Integer)MapUtil.getOrDefault(playerGiftExtend.todayBuyLimit, popupPackageModel.getType(), 0);
                  if (popupPackageModel.getNumberOfTriggers() == 1 && popupPackageModel.getBuyAllTriggerTimes() > 0) {
                     if (!playerGiftExtend.todayBuyLimit.containsKey(popupPackageModel.getType())) {
                        if ((Integer)MapUtil.getOrDefault(playerGiftExtend.timeLimit, popupPackageModel.getType(), 0) > curTime) {
                           continue;
                        }
                     } else if (todayBuyLimit >= popupPackageModel.getBuyAllTriggerTimes()) {
                        continue;
                     }
                  }

                  if (popupPackageModel.getNumberOfTriggers() != 2 || !playerGiftExtend.isTrigger(popupPackageModel.getType())) {
                     playerGiftExtend.addTrigger(popupPackageModel.getType());
                     int endTime = curTime + popupPackageModel.getTimeLeft();
                     playerGiftExtend.timeLimit.put(popupPackageModel.getType(), endTime);
                     playerGiftExtend.giftTypePlayerLv.put(popupPackageModel.getType(), this.player.getPlayerDao().lv);
                     giftsMsg.addGiftData(this.buildTimeLimitGiftData(popupPackageModel.getType(), endTime, this.player.getPlayerDao().lv));
                     if (popupPackageModel.getBuyAllTriggerTimes() > 0 && playerGiftExtend.todayBuyLimit.containsKey(popupPackageModel.getType())) {
                        playerGiftExtend.todayBuyLimit.put(popupPackageModel.getType(), todayBuyLimit + 1);
                     }

                     this.removePopupGift(popupPackageModel.getType());
                     this.updatePlayerGiftExtend();
                  }
               }
            }
         }

         if (giftsMsg.getGiftDataList().size() > 0) {
            this.player.sendMsg(giftsMsg.build());
         }

      }
   }

   public void sendBuyResult(ShopLimitModel shopLimitModel) {
      GiftDao giftDao = (GiftDao)this.getBuyGifts(shopLimitModel.getGiftType()).get(shopLimitModel.getId());
      if (giftDao == null) {
         this.logger.error("礼包【{}】购买后找不到限购数据", shopLimitModel.getId());
      } else {
         GiftMsg.S2C_GiftBuy_8610.Builder msg = GiftMsg.S2C_GiftBuy_8610.newBuilder();
         msg.setBuyId(shopLimitModel.getId());
         msg.setBuyCount(giftDao.count);
         msg.setEndTime(DateUtil.getIntTime(giftDao.invalidTime));
         msg.setGotDay(giftDao.gotDay);
         this.player.sendMsg(msg.build());
      }
   }

   public void customizeGiftBuy(ShopLimitModel shopLimitModel, List<ResourceModel> resourceModels) {
      for(AbstractActivityPart activityPart : this.player.getMgrParts(AbstractActivityPart.class)) {
         if (activityPart.getPlayerActivityId() == shopLimitModel.getActivityId()) {
            activityPart.customizeGiftBuy(shopLimitModel.getId(), resourceModels);
            break;
         }
      }

   }

   public void customizeGiftBuyFinish(ShopLimitModel shopLimitModel) {
      for(AbstractActivityPart activityPart : this.player.getMgrParts(AbstractActivityPart.class)) {
         if (activityPart.getPlayerActivityId() == shopLimitModel.getActivityId()) {
            activityPart.sendCustomizeGiftBuy(shopLimitModel.getId());
            break;
         }
      }

   }

   public void giftGm(String gmCmd) {
      String[] cmdArr = gmCmd.split("\\|");
      switch (cmdArr[0]) {
         case "clear":
            int giftType = Integer.parseInt(cmdArr[1]);
            this.clearGifts(giftType);
            this.sendGiftInfo(giftType);
            this.sendGiftList();
            break;
         case "triggerLimitGift":
            this.gmTriggerTimeLimitGift(Integer.parseInt(cmdArr[1]));
            break;
         case "setLimitTime":
            this.setLimitTime(cmdArr[1] + "|" + cmdArr[2]);
            break;
         case "removegift":
            this.removeGift(Integer.parseInt(cmdArr[1]));
            break;
         case "resetlifetimecard":
            this.gmResetLifeTimeCard();
      }

   }

   private void gmTriggerTimeLimitGift(int popId) {
      GiftMsg.S2C_TimeLimitGiftListNotify_8601.Builder giftsMsg = GiftMsg.S2C_TimeLimitGiftListNotify_8601.newBuilder();
      PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", popId);
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      playerGiftExtend.addTrigger(popupPackageModel.getType());
      int endTime = DateUtil.getIntTime(System.currentTimeMillis()) + popupPackageModel.getTimeLeft();
      playerGiftExtend.timeLimit.put(popupPackageModel.getType(), endTime);
      playerGiftExtend.giftTypePlayerLv.put(popupPackageModel.getType(), this.player.getPlayerDao().lv);
      this.updatePlayerGiftExtend();
      giftsMsg.addGiftData(this.buildTimeLimitGiftData(popupPackageModel.getType(), endTime, this.player.getPlayerDao().lv));
      this.removePopupGift(popupPackageModel.getType());
      this.player.sendMsg(giftsMsg.build());
   }

   private void setLimitTime(String params) {
      String[] paramArr = params.split("\\|");
      int popId = Integer.parseInt(paramArr[0]);
      Date date = DateUtil.parse(paramArr[1], "yyyy-MM-dd-HH-mm-ss");
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      if (playerGiftExtend.timeLimit.containsKey(popId)) {
         playerGiftExtend.timeLimit.put(popId, DateUtil.getIntTime(date.getTime()));
         this.updatePlayerGiftExtend();
         this.sendTimeLimitGiftList();
      }
   }

   @TaskMethod
   public void importLimitGift(int giftId) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftId);
      if (shopLimitModel != null) {
         PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", shopLimitModel.getActivityId());
         if (popupPackageModel != null && popupPackageModel.getGiftType() == 2) {
            PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
            playerGiftExtend.addTrigger(popupPackageModel.getType());
            this.updatePlayerGiftExtend();
            if (this.addGift(shopLimitModel)) {
               this.sendBuyResult(shopLimitModel);
            }

         }
      }
   }

   private boolean checkSatisfied(PopupPackageModel popupPackageModel) {
      if (popupPackageModel.getConditions().isEmpty()) {
         return false;
      } else if (popupPackageModel.getTriggerLimit() == 1) {
         return true;
      } else if (popupPackageModel.getTriggerLimit() == 2) {
         for(KeyValFun condition : popupPackageModel.getConditions()) {
            switch (condition.getKey()) {
               case 6:
                  WarHLDao warHLDao = (WarHLDao)this.player.getData("tb_war_hl", this.player.getPlayerId());
                  if (warHLDao.curFloor < condition.getVal()) {
                     return false;
                  }
                  break;
               case 7:
                  PlayerDao playerDao = this.player.getPlayerDao();
                  if (playerDao.lv < condition.getVal()) {
                     return false;
                  }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private GiftMsg.TimeLimitGiftData buildTimeLimitGiftData(int type, int endTime, int playerLv) {
      GiftMsg.TimeLimitGiftData.Builder giftDataBuilder = GiftMsg.TimeLimitGiftData.newBuilder();
      giftDataBuilder.setType(type);
      giftDataBuilder.setEnd(endTime);
      giftDataBuilder.setPlayerLv(playerLv);
      return giftDataBuilder.build();
   }

   public void loginHandle() {
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      Iterator<Map.Entry<Integer, Integer>> typeIt = playerGiftExtend.timeLimit.entrySet().iterator();

      while(typeIt.hasNext()) {
         Map.Entry<Integer, Integer> typeEntry = (Map.Entry)typeIt.next();
         if ((Integer)typeEntry.getValue() <= DateUtil.getIntTime(System.currentTimeMillis())) {
            this.removePopupGift((Integer)typeEntry.getKey());
            typeIt.remove();
         }
      }

      this.updatePlayerGiftExtend();
      this.clearGifts(0);
   }

   public int checkAndBuy(int buyId, int activityId, int module, int reason) {
      int checkCode = this.check(buyId, activityId);
      if (checkCode != 1) {
         return checkCode;
      } else {
         List<ResourceModel> resourceModels = new ArrayList();
         this.buy(resourceModels, buyId, module, reason);
         this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, module, reason, buyId, 1, "");
         return 1;
      }
   }

   public boolean buy(List<ResourceModel> resourceModels, int buyId, int module, int reason) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
      if (shopLimitModel == null) {
         this.logger.error("玩家{}购买buyId:{}配置表不存在", this.player.getPlayerId(), buyId);
         return false;
      } else {
         if (shopLimitModel.getPriceType() == 0 && shopLimitModel.getPrice() > 0) {
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)shopLimitModel.getPrice(), module, reason, shopLimitModel.getGiftType(), shopLimitModel.getId(), shopLimitModel.getTips());
         }

         if (shopLimitModel.getExpVip() > 0) {
            this.player.addResource(1, PlayerDefine.PLAYER_VIP_EXP, shopLimitModel.getExpVip(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, module, reason, shopLimitModel.getGiftType(), buyId, "");
         }

         if (!this.buy(resourceModels, shopLimitModel)) {
            return false;
         } else {
            this.player.triggerTask(520, buyId, 1L, 1);
            RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", shopLimitModel.getPriceType());
            float amount = rechargeModel != null ? rechargeModel.getMoneyTh() : 0.0F;
            ClientTrackingPart clientTrackingPart = (ClientTrackingPart)this.player.getMgrPart(ClientTrackingPart.class);
            clientTrackingPart.clientTrack(ClientTrackingEnum.SP_BUY_DIRECT_GIFT, buyId + "", "type=event_track", "event=Purchase", "suggest_currency=THB", "amount=" + amount, "pakcage_id=" + buyId);
            return true;
         }
      }
   }

   public boolean buy(List<ResourceModel> resourceModels, ShopLimitModel shopLimitModel) {
      if (!this.addGift(shopLimitModel)) {
         return false;
      } else {
         if (shopLimitModel.getItemType() == 2) {
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
            if (itemModel != null) {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               resourceModels.addAll(itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1));
            }
         } else if (shopLimitModel.getItemType() > 0 && shopLimitModel.getItemId() > 0 && shopLimitModel.getItemNum() > 0) {
            resourceModels.add(new ResourceModel(shopLimitModel.getItemType(), shopLimitModel.getItemId(), shopLimitModel.getItemNum()));
         }

         CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", shopLimitModel.getId());
         if (null != customizeGiftBagModel && customizeGiftBagModel.getRegular() > 0) {
            SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", customizeGiftBagModel.getRegular());
            if (null != specificGroupModel) {
               resourceModels.addAll(specificGroupModel.getRewards());
            }
         }

         return true;
      }
   }

   public void sendLevelGiftMain() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftMsg.S2C_LevelGiftMain_8614.Builder msg = GiftMsg.S2C_LevelGiftMain_8614.newBuilder();

      for(LevelGiftData levelGiftData : playerActivityDao.levelGiftGot.values()) {
         for(int level : levelGiftData.getLevel()) {
            GiftMsg.LevelGiftData.Builder builder = GiftMsg.LevelGiftData.newBuilder();
            builder.setLevel(level);
            builder.setType(levelGiftData.getType());
            msg.addGotGift(builder);
         }
      }

      this.player.sendMsg(msg.build());
   }

   public RotaingPackagesModel getRotatePackage(int rotateType) {
      Map<Integer, List<RotaingPackagesModel>> allPackageModels = ApplicationContextProvider.<Integer, List<RotaingPackagesModel>>getModelPoolMap("customRotaingPackages");
      List<RotaingPackagesModel> packagesModels = (List)allPackageModels.get(rotateType);
      if (packagesModels != null && !packagesModels.isEmpty()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         RotaingPackagesModel lastModel = (RotaingPackagesModel)packagesModels.get(0);

         for(RotaingPackagesModel rotaingPackagesModel : packagesModels) {
            if (lastModel.getActivityId() < rotaingPackagesModel.getActivityId()) {
               lastModel = rotaingPackagesModel;
            }

            boolean levelCondition = rotaingPackagesModel.getMaxLevel() <= 0 ? true : playerDao.lv >= rotaingPackagesModel.getMinLevel() && playerDao.lv <= rotaingPackagesModel.getMaxLevel();
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            int openServerDay = DateUtil.difftimeDay(new Timestamp(worldMgr.getOpenServerTime())) + 1;
            boolean openDayCondition = rotaingPackagesModel.getDateEnd() <= 0 ? true : openServerDay >= rotaingPackagesModel.getDateStart() && openServerDay <= rotaingPackagesModel.getDateEnd();
            if (levelCondition && openDayCondition) {
               return rotaingPackagesModel;
            }
         }

         return lastModel;
      } else {
         return null;
      }
   }

   public TreeMap<Integer, ShopLimitModel> getShopLimits(int giftType, int activityId) {
      Map<Integer, Map<Integer, TreeMap<Integer, ShopLimitModel>>> tempHashMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, ShopLimitModel>>>getModelPoolMap("customShopLimit");
      return MapUtil.getOrDefault(MapUtil.getOrDefault(tempHashMap, giftType, ConcurrentHashMap.class), activityId, TreeMap.class);
   }

   public void resetDaily() {
      this.weeklyCardReward();
      this.specialWeeklyCardSendMail();
      this.monthCardReward();
      this.lifeTimeCardReward();
      this.resetBuyItems(1);
      this.sendGiftList();
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      playerGiftExtend.todayBuyLimit.clear();
      this.updatePlayerGiftExtend();
   }

   public void resetWeek() {
      this.resetBuyItems(2);
   }

   public void resetMonth() {
      this.resetBuyItems(3);
   }

   private void resetBuyItems(int resetType) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      PlayerDao playerDao = this.player.getPlayerDao();
      GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
      long curTime = System.currentTimeMillis();
      Map<Integer, ConcurrentHashMap<Integer, TreeMap<Integer, ShopLimitModel>>> allModelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, TreeMap<Integer, ShopLimitModel>>>getModelPoolMap("customShopLimit");

      for(int giftType : allModelMap.keySet()) {
         boolean curGiftUpdateFlag = false;
         Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(giftType);
         if (giftType != 42) {
            for(Map.Entry<Integer, GiftDao> giftDaoEntry : giftDaoMap.entrySet()) {
               int giftId = (Integer)giftDaoEntry.getKey();
               GiftDao giftDao = (GiftDao)giftDaoEntry.getValue();
               ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftId);
               if (shopLimitModel != null) {
                  if (giftDao.invalidTime <= 0L) {
                     continue;
                  }

                  if (shopLimitModel.getRefresh() == 4) {
                     if (resetType != 1 || giftDao.invalidTime > curTime) {
                        continue;
                     }

                     this.resetPrivilege(shopLimitModel);
                  } else if (shopLimitModel.getRefresh() != resetType) {
                     continue;
                  }

                  if (shopLimitModel.getTimeEmail() > 0) {
                     CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", shopLimitModel.getTimeEmail());
                     if (centreAwardModel != null) {
                        mailPart.addMailOfEffectTimeByCentreAwardId(MailDefine.MailType.MAIL_TYPE_SYSTEM, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), 604800000L, 22, 2203, centreAwardModel.getId());
                     }
                  }
               }

               curGiftUpdateFlag = true;
               giftCustomCache.removeGift(giftDao);
            }

            if (curGiftUpdateFlag) {
               this.sendGiftInfo(giftType);
            }
         }
      }

   }

   private List<ResourceModel> getPrivilegeResource(ShopLimitModel shopLimitModel) {
      if (shopLimitModel == null) {
         return null;
      } else {
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
         if (itemModel != null && itemModel.getUseFuncType() != 0 && itemModel.getUseFuncId() != 0 && itemModel.getUseFuncValue() != 0) {
            List<ResourceModel> resourceModelList = null;
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

            for(ResourceModel resourceModel : itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), shopLimitModel.getItemNum())) {
               if (resourceModel.getType() == 1) {
                  PlayerProperty playerProperty = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", resourceModel.getId());
                  if (playerProperty != null && playerProperty.getVipRight() == 1) {
                     if (resourceModelList == null) {
                        resourceModelList = new ArrayList();
                     }

                     resourceModelList.add(resourceModel);
                  }
               }
            }

            return resourceModelList;
         } else {
            return null;
         }
      }
   }

   private int check(int buyId, int activityId) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
      if (shopLimitModel == null) {
         this.logger.error("玩家{}购买失败,{}商品配置不存在", this.player.getPlayerId(), buyId);
         return 0;
      } else if (activityId > 0 && shopLimitModel.getActivityId() != activityId) {
         this.logger.error("玩家{}购买失败,{}商品对应的礼包类型出错", this.player.getPlayerId(), buyId);
         return 22000;
      } else {
         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
         if (shopLimitModel.getGiftType() == 24 && shopLimitModel.getActivityId() > 0) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", shopLimitModel.getActivityId());
            if (activityOpenTimeModel == null) {
               return 8007;
            }

            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            List<String> areaLimit = activityOpenTimeModel.getAreanLimit();
            if (!CollectionUtils.isEmpty(areaLimit) && !areaLimit.contains(worldMgr.country)) {
               return 8007;
            }

            if (activityOpenTimeModel.getActivityType() != 8001 && activityOpenTimeModel.getActivityType() != 8002) {
               ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
               ActivityInfo activityInfo = activityMgr.getActivityInfo(activityOpenTimeModel.getActivityType());
               if (activityInfo == null || activityInfo.id <= 0 || activityInfo.end < DateUtil.getIntTime(System.currentTimeMillis()) || !activityInfo.open) {
                  return 8007;
               }
            } else {
               MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
               if (!mergeActivityMgr.isMergeActivityOpening()) {
                  return 8007;
               }
            }

            if (activityOpenTimeModel.getNeedLevel() > playerDao.lv || !this.player.isSystemOpen(activityOpenTimeModel.getSystemid())) {
               return 8007;
            }
         }

         if (playerDao.lv < shopLimitModel.getNeedLevel()) {
            this.logger.error("玩家{}购买{}失败,等级不足{}", new Object[]{this.player.getPlayerId(), buyId, shopLimitModel.getNeedLevel()});
            return 20;
         } else {
            if (playerDao.vip_lv < shopLimitModel.getNeedvipLevel()) {
               ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
               ActivityInfo activityInfo = activityMgr.getActivityInfo(114);
               if (activityInfo == null || activityInfo.id <= 0 || activityInfo.end < DateUtil.getIntTime(System.currentTimeMillis()) || !activityInfo.open) {
                  this.logger.error("玩家{}购买{}失败,VIP等级不足{}", new Object[]{this.player.getPlayerId(), buyId, shopLimitModel.getNeedvipLevel()});
                  return 19;
               }
            }

            Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(shopLimitModel.getGiftType());
            if (giftDaoMap.containsKey(buyId) && ((GiftDao)giftDaoMap.get(buyId)).count >= shopLimitModel.getLimitCount()) {
               this.logger.error("玩家{}购买商品{}失败,商品购买次数已达限购次数{}", new Object[]{this.player.getPlayerId(), buyId, shopLimitModel.getLimitCount()});
               return 25;
            } else if (shopLimitModel.getPriceType() > 0 && shopLimitModel.getPriceType() != 0) {
               this.logger.error("玩家{}购买失败,{}商品需要前往充值", this.player.getPlayerId(), buyId);
               return 28;
            } else if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, shopLimitModel.getPrice())) {
               this.logger.error("玩家{}购买{}失败,元宝不足{}", new Object[]{this.player.getPlayerId(), buyId, shopLimitModel.getPrice()});
               return 31;
            } else {
               return 1;
            }
         }
      }
   }

   public PlayerGiftExtend getPlayerGiftExtend() {
      return (PlayerGiftExtend)this.player.getPlayerExtend(22);
   }

   private void updatePlayerGiftExtend() {
      this.player.updatePlayerExtend(22);
   }

   private void sendGiftInfo(int giftType) {
      switch (giftType) {
         case 1:
            DailyGiftPart dailyGiftPart = (DailyGiftPart)this.player.getMgrPart(DailyGiftPart.class);
            dailyGiftPart.sendInfo();
            break;
         case 2:
            PrivilegeMallPart privilegeMallPart = (PrivilegeMallPart)this.player.getMgrPart(PrivilegeMallPart.class);
            privilegeMallPart.sendInfo();
            break;
         case 3:
            WeeklyPreferentialPart weeklyPreferentialPart = (WeeklyPreferentialPart)this.player.getMgrPart(WeeklyPreferentialPart.class);
            weeklyPreferentialPart.sendInfo();
            break;
         case 4:
            MonthlyPreferentialPart monthlyPreferentialPart = (MonthlyPreferentialPart)this.player.getMgrPart(MonthlyPreferentialPart.class);
            monthlyPreferentialPart.sendInfo();
            break;
         case 5:
            FlashSalePart flashSalePart = (FlashSalePart)this.player.getMgrPart(FlashSalePart.class);
            flashSalePart.sendInfo();
            break;
         case 6:
            WeekendKoiPart weekendKoiPart = (WeekendKoiPart)this.player.getMgrPart(WeekendKoiPart.class);
            weekendKoiPart.sendInfo();
      }

   }

   public void removePopupGift(int type) {
      PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", type);
      if (popupPackageModel != null && popupPackageModel.getGiftType() == 1) {
         GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
         Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(8);
         TreeMap<Integer, ShopLimitModel> typeShopLimitMap = this.getShopLimits(8, type);

         for(Integer giftId : typeShopLimitMap.keySet()) {
            GiftDao giftDao = (GiftDao)giftDaoMap.get(giftId);
            if (giftDao != null) {
               giftCustomCache.removeGift(giftDao);
            }
         }

      }
   }

   @TaskMethod
   public void sendGiftList() {
      GiftMsg.S2C_GiftList_8612.Builder resp = GiftMsg.S2C_GiftList_8612.newBuilder();
      Map<Integer, ConcurrentHashMap<Integer, TreeMap<Integer, ShopLimitModel>>> allModelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, TreeMap<Integer, ShopLimitModel>>>getModelPoolMap("customShopLimit");

      for(int giftType : allModelMap.keySet()) {
         for(GiftDao giftDao : this.getBuyGifts(giftType).values()) {
            GiftMsg.GiftData.Builder giftData = GiftMsg.GiftData.newBuilder();
            giftData.setBuyCount(giftDao.count);
            giftData.setId(giftDao.giftId);
            giftData.setEndTime(DateUtil.getIntTime(giftDao.invalidTime));
            giftData.setGotDay(giftDao.gotDay);
            resp.addGifts(giftData);
         }
      }

      this.player.sendMsg(resp.build());
   }

   private void weeklyCardReward() {
      long todayBeginTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis());
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(25);

      for(Map.Entry<Integer, GiftDao> entry : giftDaoMap.entrySet()) {
         GiftDao giftDao = (GiftDao)entry.getValue();
         if (giftDao.invalidTime > 0L) {
            ShopLimitModel shopLimitModel = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", giftDao.giftId);
            if (shopLimitModel != null) {
               WeeklyAwardModel weeklyAwardModel = (WeeklyAwardModel)this.player.getGameModelPool().getEntity("weeklyAward", shopLimitModel.getItemId());
               if (weeklyAwardModel != null) {
                  long buyTime = giftDao.invalidTime - (long)shopLimitModel.getTimeLimit() * 86400000L + 1000L;
                  int gotDay = giftDao.gotDay;
                  ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", shopLimitModel.getActivityId());
                  if (activityOpenTimeModel != null) {
                     if (activityOpenTimeModel.getActivityType() != 37 && activityOpenTimeModel.getActivityType() != 49 && activityOpenTimeModel.getActivityType() != 59) {
                        for(int day = gotDay + 1; day <= shopLimitModel.getTimeLimit(); ++day) {
                           this.weeklyCardReward(shopLimitModel, day, true);
                           if (buyTime + (long)day * 86400000L > DateUtil.getSomeDayEndTime(System.currentTimeMillis())) {
                              break;
                           }
                        }
                     } else {
                        for(int day = gotDay; day < shopLimitModel.getTimeLimit() && (day <= 0 || buyTime + (long)day * 86400000L <= todayBeginTime); ++day) {
                           this.weeklyCardReward(shopLimitModel, day + 1, true);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public int weeklyCardReward(ShopLimitModel shopLimitModel, int day, boolean isMail) {
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(25);
      GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
      if (giftDao == null) {
         return 22002;
      } else {
         WeeklyAwardModel weeklyAwardModel = (WeeklyAwardModel)this.player.getGameModelPool().getEntity("weeklyAward", shopLimitModel.getItemId());
         if (weeklyAwardModel != null && weeklyAwardModel.getItem().size() >= day) {
            if (giftDao.gotDay >= day) {
               return 24;
            } else {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               List<ResourceModel> resourceModelList = this.getWeeklyAward(weeklyAwardModel, day);
               if (isMail) {
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, weeklyAwardModel.getTitle(), weeklyAwardModel.getDesc(), resourceModelList, 604800000L, 22, 2206);
               } else {
                  this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2206, shopLimitModel.getId(), day, "");
               }

               giftDao.gotDay = day;
               giftDao.updateOp();
               return 1;
            }
         } else {
            return 0;
         }
      }
   }

   public void weeklyCardBuy(ShopLimitModel shopLimitModel) {
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", shopLimitModel.getActivityId());
      if (activityOpenTimeModel != null && activityOpenTimeModel.getActivityType() != 37 && activityOpenTimeModel.getActivityType() != 49 && activityOpenTimeModel.getActivityType() != 59) {
         this.weeklyCardReward(shopLimitModel, 1, true);
      }
   }

   private void monthCardReward() {
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(34);

      for(Map.Entry<Integer, GiftDao> entry : giftDaoMap.entrySet()) {
         GiftDao giftDao = (GiftDao)entry.getValue();
         if (giftDao.invalidTime > 0L) {
            ShopLimitModel shopLimitModel = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", giftDao.giftId);
            if (shopLimitModel != null) {
               Map<Integer, MonthAwardModel> monthAwardModelMap = (Map)this.player.getGameModelPool().getEntity("customMonthAward", shopLimitModel.getItemId());
               if (!CollectionUtils.isEmpty(monthAwardModelMap)) {
                  long buyTime = giftDao.invalidTime - (long)shopLimitModel.getTimeLimit() * 86400000L + 1000L;
                  int gotDay = giftDao.gotDay;

                  for(int day = gotDay + 1; day <= monthAwardModelMap.size(); ++day) {
                     this.monthCardReward(shopLimitModel, day, true);
                     if (buyTime + (long)day * 86400000L > DateUtil.getSomeDayEndTime(System.currentTimeMillis())) {
                        break;
                     }
                  }
               }
            }
         }
      }

   }

   public int monthCardReward(ShopLimitModel shopLimitModel, int day, boolean isMail) {
      this.logger.info("【月卡奖励】playerId:{}  id:{} itemId:{} day:{} isMail:{}", new Object[]{this.player.getPlayerId(), shopLimitModel.getId(), shopLimitModel.getItemId(), day, isMail});
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(34);
      GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
      if (giftDao == null) {
         this.logger.info("【月卡奖励】找不到月卡数据 playerId:{}", this.player.getPlayerId());
         return 22002;
      } else {
         Map<Integer, MonthAwardModel> monthAwardModelMap = (Map)this.player.getGameModelPool().getEntity("customMonthAward", shopLimitModel.getItemId());
         if (monthAwardModelMap != null && monthAwardModelMap.containsKey(day)) {
            if (giftDao.gotDay >= day) {
               this.logger.info("【月卡奖励】已领当天奖励 gotDay:{} day:{} ", giftDao.gotDay, day);
               return 24;
            } else {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               MonthAwardModel monthAwardModel = (MonthAwardModel)monthAwardModelMap.get(day);
               if (isMail) {
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, monthAwardModel.getTitle(), monthAwardModel.getDesc(), monthAwardModel.getItem(), 604800000L, 22, 2207);
               } else {
                  this.player.addResource(monthAwardModel.getItem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2207, shopLimitModel.getId(), day, "");
               }

               giftDao.gotDay = day;
               giftDao.updateOp();
               return 1;
            }
         } else {
            this.logger.info("【月卡奖励】找不到月卡配置 day:{}", day);
            return 0;
         }
      }
   }

   public void levelUp(int preLv, int lv) {
      this.triggerTimeLimitGift(7, lv);
   }

   private void sendTimeLimitGiftList() {
      GiftMsg.S2C_TimeLimitGiftList_8607.Builder resp = GiftMsg.S2C_TimeLimitGiftList_8607.newBuilder();
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(8);

      for(Map.Entry<Integer, Integer> entry : playerGiftExtend.timeLimit.entrySet()) {
         GiftMsg.TimeLimitGiftData.Builder builder = GiftMsg.TimeLimitGiftData.newBuilder();
         builder.setType((Integer)entry.getKey());
         builder.setEnd((Integer)entry.getValue());
         Integer playerLv = (Integer)playerGiftExtend.giftTypePlayerLv.getOrDefault(entry.getKey(), this.player.getPlayerDao().lv);
         builder.setPlayerLv(playerLv);
         resp.addGiftDataList(builder);
      }

      for(GiftDao giftDao : giftDaoMap.values()) {
         GiftMsg.TimeLimitGiftBuyData.Builder builder = GiftMsg.TimeLimitGiftBuyData.newBuilder();
         builder.setBuyCount(giftDao.count);
         builder.setId(giftDao.giftId);
         resp.addBuyGiftList(builder);
      }

      Map<Integer, GiftDao> heroActTimeLimitOptionMap = this.getBuyGifts(37);
      if (heroActTimeLimitOptionMap != null && heroActTimeLimitOptionMap.size() > 0) {
         for(GiftDao giftDao : heroActTimeLimitOptionMap.values()) {
            GiftMsg.TimeLimitGiftBuyData.Builder builder = GiftMsg.TimeLimitGiftBuyData.newBuilder();
            builder.setBuyCount(giftDao.count);
            builder.setId(giftDao.giftId);
            resp.addBuyGiftList(builder);
         }
      }

      Map<Integer, GiftDao> krHeroActTimeLimitOptionMap = this.getBuyGifts(40);
      if (krHeroActTimeLimitOptionMap != null && krHeroActTimeLimitOptionMap.size() > 0) {
         for(GiftDao giftDao : krHeroActTimeLimitOptionMap.values()) {
            GiftMsg.TimeLimitGiftBuyData.Builder builder = GiftMsg.TimeLimitGiftBuyData.newBuilder();
            builder.setBuyCount(giftDao.count);
            builder.setId(giftDao.giftId);
            resp.addBuyGiftList(builder);
         }
      }

      this.player.sendMsg(resp.build());
   }

   public List<ResourceModel> getWeeklyAward(WeeklyAwardModel weeklyAwardModel, int day) {
      List<ResourceModel> resourceModelList = new ArrayList();
      if (weeklyAwardModel == null) {
         return resourceModelList;
      } else {
         resourceModelList.add(weeklyAwardModel.getItem().get(day - 1));
         if (weeklyAwardModel.getMoreAward() == 1) {
            Map<Integer, WeeklyAward2Model> weeklyAward2ModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customWeeklyAward2", weeklyAwardModel.getId());
            if (!CollectionUtils.isEmpty(weeklyAward2ModelMap) && weeklyAward2ModelMap.containsKey(day)) {
               WeeklyAward2Model weeklyAward2Model = (WeeklyAward2Model)weeklyAward2ModelMap.get(day);

               for(ResourceModel resourceModel : weeklyAward2Model.getItem()) {
                  ResourceModel.addResourceToList(resourceModelList, resourceModel);
               }
            }
         }

         return resourceModelList;
      }
   }

   private void resetPrivilege(ShopLimitModel shopLimitModel) {
      List<ResourceModel> privilegeResourceList = this.getPrivilegeResource(shopLimitModel);
      if (privilegeResourceList != null) {
         PlayerDao playerDao = this.player.getPlayerDao();

         for(ResourceModel resourceModel : privilegeResourceList) {
            long privilegeProperty = playerDao.getProperty(resourceModel.getId());
            if (privilegeProperty != 0L) {
               this.player.modifyProperty(resourceModel.getId(), -privilegeProperty, 22, 2203, shopLimitModel.getId(), 0, "", true);
            }
         }

      }
   }

   private void monthCardAllReward(GiftDao giftDao) {
      if (giftDao != null && giftDao.invalidTime != 0L) {
         ShopLimitModel shopLimitModel = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", giftDao.giftId);
         if (shopLimitModel != null) {
            Map<Integer, MonthAwardModel> monthAwardModelMap = (Map)this.player.getGameModelPool().getEntity("customMonthAward", shopLimitModel.getItemId());
            if (!CollectionUtils.isEmpty(monthAwardModelMap)) {
               long buyTime = giftDao.invalidTime - (long)shopLimitModel.getTimeLimit() * 86400000L + 1000L;
               int gotDay = giftDao.gotDay;

               for(int day = gotDay + 1; day <= monthAwardModelMap.size(); ++day) {
                  this.monthCardReward(shopLimitModel, day, true);
                  if (buyTime + (long)day * 86400000L > DateUtil.getSomeDayEndTime(giftDao.invalidTime)) {
                     break;
                  }

                  this.logger.info("【月卡】发送上期未发送的全部奖励 playerId:{} day:{}", this.player.getPlayerId(), day);
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SpecialWeeklyCardReward_8635(GiftMsg.C2S_SpecialWeeklyCardReward_8635 msg, String source) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", msg.getGiftId());
      if (shopLimitModel != null && shopLimitModel.getGiftType() == 42) {
         Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(42);
         GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
         if (giftDao == null) {
            this.player.failure(22002);
         } else {
            long todayBeginTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis());
            int limitTime = ApplicationContextProvider.getConfigInt("SpecialsWeeklyCloseTime", 5);
            if (System.currentTimeMillis() >= todayBeginTime + (long)(limitTime * 60 * 1000)) {
               int sum = giftDao.count * shopLimitModel.getTimeLimit();
               if (msg.getDay() > 0 && giftDao.invalidTime >= todayBeginTime && giftDao.gotDay < sum) {
                  int leftDay = sum + 1 - (int)((giftDao.invalidTime - todayBeginTime) / 86400000L) - giftDao.gotDay;
                  if (leftDay <= 0) {
                     this.player.failure(0);
                  } else {
                     SpecialWeeklyCardBaseModel weeklyAwardModel = this.getSpecialWeeklyModel(msg.getDay(), shopLimitModel.getItemId());
                     if (weeklyAwardModel == null) {
                        this.logger.error("发送特殊周卡奖励未找到对表数据：{}--{}", msg.getDay(), shopLimitModel.getItemId());
                        this.player.failure(22002);
                     } else {
                        giftDao.gotDay = msg.getDay();
                        giftDao.updateOp();
                        PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                        if (!playerExtend.weeklyCardPointGot.contains(todayBeginTime)) {
                           PlayerDao playerDao = this.player.getPlayerDao();
                           ++playerDao.weekly_card_point;
                           playerDao.updateOp();
                           this.player.notifyPlayerData(PlayerDefine.PLAYER_WEEKLY_CARD_POINT, playerDao.weekly_card_point);
                           playerExtend.weeklyCardPointGot.add(todayBeginTime);
                           this.player.updatePlayerExtend(13);
                        }

                        this.player.addResource(weeklyAwardModel.getItem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2208, shopLimitModel.getId(), msg.getDay(), "");
                        GiftMsg.S2C_SpecialWeeklyCardReward_8636.Builder resp = GiftMsg.S2C_SpecialWeeklyCardReward_8636.newBuilder();
                        resp.setDay(msg.getDay());
                        resp.setGiftId(msg.getGiftId());
                        this.player.sendMsg(resp.build());
                     }
                  }
               } else {
                  this.player.failure(0);
               }
            }
         }
      } else {
         this.player.failure(0);
      }
   }

   public List<ResourceModel> getSpecialWeeklyCardReward(ShopLimitModel shopLimitModel, int day, long todayBeginTime) {
      List<ResourceModel> resourceModelList = new ArrayList();
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(42);
      GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
      if (giftDao == null) {
         return resourceModelList;
      } else if (giftDao.gotDay >= day) {
         return resourceModelList;
      } else {
         SpecialWeeklyCardBaseModel weeklyAwardModel = this.getSpecialWeeklyModel(day, shopLimitModel.getItemId());
         if (weeklyAwardModel == null) {
            this.logger.error("发送特殊周卡奖励未找到对表数据：{}--{}", day, shopLimitModel.getItemId());
            return resourceModelList;
         } else {
            giftDao.gotDay = day;
            giftDao.updateOp();
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            if (!playerExtend.weeklyCardPointGot.contains(todayBeginTime)) {
               PlayerDao playerDao = this.player.getPlayerDao();
               ++playerDao.weekly_card_point;
               playerDao.updateOp();
               this.player.notifyPlayerData(PlayerDefine.PLAYER_WEEKLY_CARD_POINT, playerDao.weekly_card_point);
               playerExtend.weeklyCardPointGot.add(todayBeginTime);
               this.player.updatePlayerExtend(13);
            }

            ResourceModel.addResourceToList(resourceModelList, weeklyAwardModel.getItem());
            return resourceModelList;
         }
      }
   }

   private void specialWeeklyCardSendMail() {
      List<ResourceModel> resourceModelList = new ArrayList();
      long todayBeginTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis());
      Map<Integer, GiftDao> giftDaoMap = this.getBuyGifts(42);
      int oldPoint = this.player.getPlayerDao().weekly_card_point;

      for(Map.Entry<Integer, GiftDao> entry : giftDaoMap.entrySet()) {
         GiftDao giftDao = (GiftDao)entry.getValue();
         if (giftDao.invalidTime > 0L) {
            ShopLimitModel shopLimitModel = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", giftDao.giftId);
            if (shopLimitModel != null) {
               int gotDay = giftDao.gotDay;
               int sum = giftDao.count * shopLimitModel.getTimeLimit();
               if (gotDay < sum) {
                  int leftDay = 0;
                  if (giftDao.invalidTime > todayBeginTime) {
                     leftDay = sum - gotDay - (int)((giftDao.invalidTime - todayBeginTime) / 86400000L);
                  } else {
                     leftDay = sum - gotDay;
                  }

                  if (leftDay > 0) {
                     for(int day = gotDay; day < leftDay + gotDay; ++day) {
                        long beginDayTime = todayBeginTime - (long)(leftDay + gotDay - day) * 86400000L;
                        List<ResourceModel> resourceModels = this.getSpecialWeeklyCardReward(shopLimitModel, day + 1, beginDayTime);
                        if (!resourceModels.isEmpty()) {
                           ResourceModel.addResourceToList(resourceModelList, resourceModels);
                        }
                     }
                  }
               }
            }
         }
      }

      if (!resourceModelList.isEmpty()) {
         int point = this.player.getPlayerDao().weekly_card_point - oldPoint;
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.TYPE_SPECIAL_WEEKLY_REWARD);
         String format = MessageFormat.format(centreAwardModel.getDesc(), point);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, resourceModelList, 604800000L, 22, 2208);
      }

   }

   public SpecialWeeklyCardBaseModel getSpecialWeeklyModel(int day, int limitGiftId) {
      Map<Integer, SpecialWeeklyCardBaseModel> modelMap = this.player.getGameModelPool().getMap("SpecialsWeeklyCardBase");

      for(SpecialWeeklyCardBaseModel model : modelMap.values()) {
         if (model.getItemid() == limitGiftId && model.getDateStart() <= day && (model.getDateEnd() >= day || model.getDateEnd() == -1)) {
            return model;
         }
      }

      return null;
   }

   @MsgHandlerAnno
   public void C2S_SpecialWeeklyCardPointReward_8637(GiftMsg.C2S_SpecialWeeklyCardPointReward_8637 msg, String source) {
      int costPoint = ApplicationContextProvider.getConfigInt("SpecialsWeeklyZhenBaoDian", 7);
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.weekly_card_point >= costPoint) {
         SpecialWeeklySevenAwardModel model = (SpecialWeeklySevenAwardModel)this.player.getGameModelPool().getEntity("SpecialsWeeklySevenAward", msg.getAwardId());
         if (model != null) {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            int openServerDay = worldMgr.getOpenServerDays();
            if (openServerDay >= model.getDateStart() && (openServerDay <= model.getDateEnd() || model.getDateEnd() == -1)) {
               if (playerDao.lv >= model.getOpenLevel()) {
                  playerDao.weekly_card_point -= costPoint;
                  playerDao.updateOp();
                  this.player.addResource(model.getRewardType(), model.getRewardId(), model.getRewardValue(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2209, 0, 0, "");
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_WEEKLY_CARD_POINT, playerDao.weekly_card_point);
                  GiftMsg.S2C_SpecialWeeklyCardPointReward_8638.Builder resp = GiftMsg.S2C_SpecialWeeklyCardPointReward_8638.newBuilder();
                  resp.setAwardId(msg.getAwardId());
                  this.player.sendMsg(resp.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LifeTimeCardGiftBuyInfo_8639(GiftMsg.C2S_LifeTimeCardGiftBuyInfo_8639 msg, String source) {
      this.sendLifeTimeCardGiftBuyInfo();
   }

   private void sendLifeTimeCardGiftBuyInfo() {
      GiftMsg.S2C_LifeTimeCardGiftBuyInfo_8640.Builder builder = GiftMsg.S2C_LifeTimeCardGiftBuyInfo_8640.newBuilder();
      builder.setIsBuy(this.hasBuyLifeTimeCardGift());
      this.player.sendMsg(builder.build());
   }

   private boolean hasBuyLifeTimeCardGift() {
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      return playerGiftExtend.lifeTimeCardData.buyTime > 0L;
   }

   private void lifeTimeCardReward() {
      if (this.hasBuyLifeTimeCardGift()) {
         PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
         if (playerGiftExtend.lifeTimeCardData.lastDailyRewardTime == 0L) {
            playerGiftExtend.lifeTimeCardData.lastDailyRewardTime = playerGiftExtend.lifeTimeCardData.buyTime;
            this.updatePlayerGiftExtend();
         }

         if (playerGiftExtend.lifeTimeCardData.lastWeekRewardTime == 0L) {
            playerGiftExtend.lifeTimeCardData.lastWeekRewardTime = playerGiftExtend.lifeTimeCardData.buyTime;
            this.updatePlayerGiftExtend();
         }

         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         long curTime = System.currentTimeMillis();
         long lastDailyRewardZeroTime = DateUtil.getSomeDayBeginTime(playerGiftExtend.lifeTimeCardData.lastDailyRewardTime);
         long nextRewardTime = lastDailyRewardZeroTime + 86400000L;
         boolean hasGiveReward = false;

         for(int protectCnt = 0; nextRewardTime <= curTime && protectCnt++ < 999; nextRewardTime += 86400000L) {
            LifetimeCardRewardModel lifetimeCardRewardModel = (LifetimeCardRewardModel)ApplicationContextProvider.getModelPoolEntity("LifetimeCardReward", 1);
            if (lifetimeCardRewardModel != null) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_LIFE_TIME_CARD_DAILY_REWARD);
               if (null != centreAwardModel) {
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), lifetimeCardRewardModel.getReward(), 604800000L, 22, 2213);
               }
            }

            playerGiftExtend.lifeTimeCardData.lastDailyRewardTime = nextRewardTime;
            hasGiveReward = true;
         }

         if (hasGiveReward) {
            this.updatePlayerGiftExtend();
         }

         lastDailyRewardZeroTime = DateUtil.getSomeDayBeginTime(playerGiftExtend.lifeTimeCardData.lastWeekRewardTime);
         nextRewardTime = lastDailyRewardZeroTime + 604800000L;
         if (playerGiftExtend.lifeTimeCardData.lastWeekRewardTime == playerGiftExtend.lifeTimeCardData.buyTime) {
            nextRewardTime = lastDailyRewardZeroTime + 518400000L;
         }

         hasGiveReward = false;

         for(int protectCnt = 0; nextRewardTime <= curTime && protectCnt++ < 999; nextRewardTime += 604800000L) {
            LifetimeCardRewardModel lifetimeCardRewardModel = (LifetimeCardRewardModel)ApplicationContextProvider.getModelPoolEntity("LifetimeCardReward", 2);
            if (lifetimeCardRewardModel != null) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_LIFE_TIME_CARD_WEKK_REWARD);
               if (null != centreAwardModel) {
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), lifetimeCardRewardModel.getReward(), 604800000L, 22, 2214);
               }
            }

            playerGiftExtend.lifeTimeCardData.lastWeekRewardTime = nextRewardTime;
            hasGiveReward = true;
         }

         if (hasGiveReward) {
            this.updatePlayerGiftExtend();
         }

      }
   }

   public void onLifeTimeCardGiftBuy() {
      if (!this.hasBuyLifeTimeCardGift()) {
         PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
         playerGiftExtend.lifeTimeCardData.buyTime = System.currentTimeMillis();
         this.updatePlayerGiftExtend();
         this.sendLifeTimeCardGiftBuyInfo();
         LifetimeCardRewardModel lifetimeCardRewardModel = (LifetimeCardRewardModel)ApplicationContextProvider.getModelPoolEntity("LifetimeCardReward", 1);
         if (lifetimeCardRewardModel != null) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_LIFE_TIME_CARD_DAILY_REWARD);
            if (null != centreAwardModel) {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), lifetimeCardRewardModel.getReward(), 604800000L, 22, 2212);
               playerGiftExtend.lifeTimeCardData.lastDailyRewardTime = System.currentTimeMillis();
               this.updatePlayerGiftExtend();
               this.player.failure(76260);
            }
         }

      }
   }

   private void gmResetLifeTimeCard() {
      this.clearGifts(44);
      PlayerGiftExtend playerGiftExtend = this.getPlayerGiftExtend();
      playerGiftExtend.lifeTimeCardData = new LifeTimeCardData();
      this.updatePlayerGiftExtend();
      this.sendLifeTimeCardGiftBuyInfo();
   }
}
