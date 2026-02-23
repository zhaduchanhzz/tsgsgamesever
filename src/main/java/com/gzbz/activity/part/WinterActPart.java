package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.WinterActDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.SummerFestivalFishData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.WinterAddUpReturnAwardModel;
import com.gzbz.model.WinterFishingDictionModel;
import com.gzbz.model.WinterFishingRewardModel;
import com.gzbz.model.WinterFishingUnlockRewardModel;
import com.gzbz.model.WinterLotteryCostModel;
import com.gzbz.model.WinterLotteryItemModel;
import com.gzbz.model.WinterShopAddUpModel;
import com.gzbz.model.WinterSignAwardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WinterActMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.util.ArrayList;
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
import org.springframework.util.ObjectUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WinterActPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   private ConfigManager configManager;
   public static final int FISH_COMMON = 1;
   public int curFishingId;
   public int curFishingLength;
   public WinterActMsg.FishLength curLight;

   public WinterActDao getDao() {
      WinterActDao dao = (WinterActDao)this.player.getData("tb_activity_winter", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 158;
   }

   public int getAddUpLogReason() {
      return 15801;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_WINTER_FESTIVAL_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "WinterAddupRecharge";
   }

   public int getConLogReason() {
      return 15811;
   }

   public int getConMail() {
      return CentreAwardModel.TYPE_WINTER_FESTIVAL_BLESSING_REWARD;
   }

   public String getConExcelName() {
      return "WinterBlessing";
   }

   public int getActivityType() {
      return 115;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         this.sendActivityInfo();
         this.shopAddUpRechargeHandle(true);
         this.sendDrawInfo();
         this.sendSignTotalInfo();
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         super.resetDaily();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.fishingResetDaily();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
         this.clearCurFishing();
         this.sendFishingGameInfo();
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         super.loginHandle();
      }
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      this.shopAddUpReset();
      this.signEnd();
      this.drawEnd();
      this.fishingEnd();
   }

   public void rotateReset(int oldActivityId) {
      WinterActDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.updateOp();
      this.shopAddUpReset();
      this.shopAddUpReset();
      this.fishingEnd();
      this.fishingResetDaily();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_28701(WinterActMsg.C2S_ActivityInfo_28701 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      WinterActMsg.S2C_ActivityInfo_28702.Builder builder = WinterActMsg.S2C_ActivityInfo_28702.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            WinterActDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_28703(WinterActMsg.C2S_ShopAddUpInfo_28703 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_28705(WinterActMsg.C2S_ReceiveShopAddUpReward_28705 msg, String source) {
      int id = msg.getId();
      WinterActDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         WinterShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 15802, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      WinterActMsg.S2C_ShopAddUpInfo_28704.Builder builder = WinterActMsg.S2C_ShopAddUpInfo_28704.newBuilder();
      WinterActDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      WinterActDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, WinterShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            WinterShopAddUpModel model = (WinterShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      WinterActDao dao = this.getDao();
      Map<Integer, WinterShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(WinterShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_WINTER_FESTIVAL_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 15802);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      WinterShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         WinterActDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public WinterShopAddUpModel getShopAddUpModel(int id) {
      WinterShopAddUpModel model = (WinterShopAddUpModel)this.player.getGameModelPool().getEntity("WinterShopAddup", id);
      return model;
   }

   public Map<Integer, WinterShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, WinterShopAddUpModel> modelMap = new HashMap();
      Map<Integer, WinterShopAddUpModel> allModel = this.player.getGameModelPool().getMap("WinterShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, WinterShopAddUpModel> entry : allModel.entrySet()) {
            WinterShopAddUpModel model = (WinterShopAddUpModel)entry.getValue();
            if (model.getDateEnd() == -1) {
               if (activityOpenDay >= model.getDateStart()) {
                  modelMap.put(model.getRechargeNum(), model);
               }
            } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
               modelMap.put(model.getRechargeNum(), model);
            }
         }

         return modelMap;
      } else {
         return modelMap;
      }
   }

   @MsgHandlerAnno
   public void C2S_SignTotalInfo_28706(WinterActMsg.C2S_SignTotalInfo_28706 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      WinterActMsg.S2C_SignTotalInfo_28707.Builder builder = WinterActMsg.S2C_SignTotalInfo_28707.newBuilder();
      WinterActDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      WinterSignAwardModel model = (WinterSignAwardModel)this.player.getGameModelPool().getEntity("WinterSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         WinterActDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_28708(WinterActMsg.C2S_Sign_28708 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         WinterSignAwardModel model = (WinterSignAwardModel)this.player.getGameModelPool().getEntity("WinterSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 15803, 0, 0, "");
         WinterActDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      WinterActDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   public void drawEnd() {
      WinterActDao dao = this.getDao();
      this.sendCumulativeDraw(dao);
      dao.drawTime = 0;
      dao.fancyRewardId = 0;
      dao.lotteryStage = this.getSmashEggStage();
      dao.seniorRewards.clear();
      dao.roundSmashNum.clear();
      dao.recordList.clear();
      dao.hadRewards.clear();
      dao.updateOp();
   }

   public void drawResetDaily() {
      WinterActDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_28709(WinterActMsg.C2S_FancyReward_28709 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         WinterActDao dao = this.getDao();
         WinterLotteryItemModel lotteryItemModel = (WinterLotteryItemModel)this.player.getGameModelPool().getEntity("WinterLotteryItem", msg.getTargetId());
         if (lotteryItemModel != null) {
            if (lotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), lotteryItemModel.getId(), lotteryItemModel.getItemGroup()});
            } else if (dao.lotteryStage != lotteryItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), lotteryItemModel.getId(), lotteryItemModel.getStage()});
            } else {
               int openDay = this.getActivityOpenDay();
               if (lotteryItemModel.getDateEnd() == -1) {
                  if (lotteryItemModel.getDateStart() > openDay) {
                     this.player.failure(0);
                     this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), lotteryItemModel.getId(), openDay});
                     return;
                  }
               } else if (openDay < lotteryItemModel.getDateStart() || openDay > lotteryItemModel.getDateEnd()) {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), lotteryItemModel.getId(), openDay});
                  return;
               }

               int activityDay = this.getSeverActivityDay();
               if (activityDay >= lotteryItemModel.getStageStart() && activityDay <= lotteryItemModel.getStageEnd()) {
                  if (lotteryItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, lotteryItemModel.getId(), 0);
                     if (selectNum >= lotteryItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(lotteryItemModel.getId()), lotteryItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getTargetId();
                  dao.updateOp();
                  WinterActMsg.S2C_FancyReward_28710.Builder builder = WinterActMsg.S2C_FancyReward_28710.newBuilder();
                  builder.setResult(1);
                  builder.setTargetId(msg.getTargetId());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), lotteryItemModel.getId(), activityDay});
               }
            }
         }
      }
   }

   public int getSmashEggStage() {
      Map<Integer, WinterLotteryItemModel> allMap = this.player.getGameModelPool().getMap("WinterLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(WinterLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_28713(WinterActMsg.C2S_Draw_28713 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         WinterLotteryCostModel costModel = (WinterLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("WinterLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = ApplicationContextProvider.getConfigInt("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(60, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               WinterActDao dao = this.getDao();
               if (dao.fancyRewardId <= 0) {
                  this.player.failure(8024);
               } else {
                  List<ResourceModel> needModelList = new ArrayList();

                  for(ResourceModel consumeItem : costModel.getConsumeItems()) {
                     consumeItem.addResourceToList(needModelList);
                  }

                  if (!this.player.checkResourceNum(needModelList)) {
                     this.player.failure(3);
                  } else {
                     int openDay = this.getActivityOpenDay();
                     int activityDay = this.getSeverActivityDay();
                     Map<Integer, WinterLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        WinterLotteryItemModel enjoyModel = (WinterLotteryItemModel)this.player.getGameModelPool().getEntity("WinterLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           WinterLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           WinterActDao.RecordInfo recordInfo = new WinterActDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 15805, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_WINTER_ACT_DRAW, this.getActivityLogModule(), 15804, 0, 0, "");
                        playerResetCustomCache.addDailyReset(60, lotteryNum);
                        WinterActMsg.S2C_Draw_28714.Builder builder = WinterActMsg.S2C_Draw_28714.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(60, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "冬季盛典-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, WinterLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, WinterLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("WinterLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, WinterLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, WinterLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((WinterLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((WinterLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((WinterLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((WinterLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((WinterLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((WinterLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private WinterLotteryItemModel smashEgg(WinterActDao dao, Map<Integer, WinterLotteryItemModel> itemModelMap) {
      Map<Integer, WinterLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(WinterLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(WinterLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_28711(WinterActMsg.C2S_LuckDrawInfo_28711 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      WinterActDao dao = this.getDao();
      WinterActMsg.S2C_LuckDrawInfo_28712.Builder builder = WinterActMsg.S2C_LuckDrawInfo_28712.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(60, 0);
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
      builder.setOpenDay(this.getPlayerActivityOpenDay());
      this.player.sendMsg(builder.build());
   }

   public List<WinterLotteryItemModel> getDrawJackpot() {
      List<WinterLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, WinterLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, WinterLotteryItemModel>>getModelPoolMap("customWinterLotteryItem");
      TreeMap<Integer, Map<Integer, WinterLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, WinterLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(WinterLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<WinterLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("春节庆典活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         WinterLotteryItemModel model = (WinterLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(WinterLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadWinterRecord_4265.Builder builder = CrossMsg.S2CR_UploadWinterRecord_4265.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_28715(WinterActMsg.C2S_OpenReward_28715 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         WinterAddUpReturnAwardModel awardModel = (WinterAddUpReturnAwardModel)ApplicationContextProvider.getModelPoolEntity("WinterAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               WinterActDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("春节庆典活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("春节庆典活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 15806, 0, 0, "");
                  WinterActMsg.S2C_OpenReward_28716.Builder builder = WinterActMsg.S2C_OpenReward_28716.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("春节庆典活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_28717(WinterActMsg.C2S_DrawRecord_28717 msg, String source) {
      WinterActMsg.S2C_DrawRecord_28718.Builder builder = WinterActMsg.S2C_DrawRecord_28718.newBuilder();
      WinterActDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         WinterActMsg.MyDrawRecord.Builder drawRecord = WinterActMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_28719(WinterActMsg.C2S_ServerDrawRecord_28719 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      WinterLotteryItemModel model = (WinterLotteryItemModel)this.player.getGameModelPool().getEntity("WinterLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, WinterLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               WinterLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private WinterLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, WinterLotteryItemModel> itemModelMap) {
      Map<Integer, WinterLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(WinterLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     WinterActDao dao = this.getDao();
                     this.logger.error("已经达到保底次数，直接返回心仪奖励，本轮抽奖次数={}，需要次数={}", roundSmashNum, lotteryItemModel.getMustNum());
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

         for(WinterLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   private void sendCumulativeDraw(WinterActDao dao) {
      if (dao.drawTime > 0) {
         List<ResourceModel> notReceiveRewards = new ArrayList();
         List<WinterAddUpReturnAwardModel> awardModel = this.getAvailableModels();
         if (!ObjectUtils.isEmpty(awardModel)) {
            for(WinterAddUpReturnAwardModel model : awardModel) {
               if (model.getAddupNum() <= dao.drawTime && !dao.hadRewards.contains(model.getId())) {
                  notReceiveRewards.addAll(model.getRewards());
               }
            }

            if (!ObjectUtils.isEmpty(notReceiveRewards)) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_WINTER_FESTIVAL_DRAW_REWARD);
               if (!ObjectUtils.isEmpty(centreAwardMap)) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 15806);
               }
            }
         }
      }

   }

   private List<WinterAddUpReturnAwardModel> getAvailableModels() {
      Map<Integer, WinterAddUpReturnAwardModel> addUpReturnAwardModelMap = ApplicationContextProvider.<Integer, WinterAddUpReturnAwardModel>getModelPoolMap("WinterAddupReturnAward");
      if (ObjectUtils.isEmpty(addUpReturnAwardModelMap)) {
         return new ArrayList();
      } else {
         List<WinterAddUpReturnAwardModel> result = new ArrayList();
         int serverOpenDay = this.getPlayerActivityOpenDay();

         for(WinterAddUpReturnAwardModel model : addUpReturnAwardModelMap.values()) {
            if (serverOpenDay >= model.getDateStart() && serverOpenDay <= model.getDateEnd() || serverOpenDay >= model.getDateStart() && model.getDateEnd() == -1) {
               result.add(model);
            }
         }

         return result;
      }
   }

   @MsgHandlerAnno
   public void C2S_FishingGameInfo_28721(WinterActMsg.C2S_FishingGameInfo_28721 msg, String source) {
      this.sendFishingGameInfo();
   }

   public void sendFishingGameInfo() {
      WinterActDao dao = this.getDao();
      WinterActMsg.S2C_FishingGameInfo_28722.Builder builder = WinterActMsg.S2C_FishingGameInfo_28722.newBuilder();
      builder.setBuyFishingTimes(dao.buyFishingTimes);
      builder.addAllReceivedAward(dao.receiveFishCollectAward);
      builder.setFishingPointSum(dao.fishingPoint);
      builder.addAllActivationAward(dao.receiveActivationAward);

      for(SummerFestivalFishData fishData : dao.fishCollect.values()) {
         builder.addFishInfo(this.buildFishData(fishData));
      }

      this.player.sendMsg(builder.build());
   }

   public WinterActMsg.FishInfo.Builder buildFishData(SummerFestivalFishData fishData) {
      WinterActMsg.FishInfo.Builder info = WinterActMsg.FishInfo.newBuilder();
      info.setId(fishData.id);
      info.setLengthMin(fishData.lengthMin);
      info.setLengthMax(fishData.lengthMax);
      info.setPointMin(fishData.pointMin);
      info.setPointMax(fishData.pointMax);
      info.setFishSum(fishData.fishSum);
      return info;
   }

   @MsgHandlerAnno
   public void C2S_FishingBegin_28723(WinterActMsg.C2S_FishingBegin_28723 msg, String source) {
      ResourceModel resourceModel = new ResourceModel();
      resourceModel.setType(2);
      resourceModel.setId(2753);
      resourceModel.setValue(1);
      if (!this.player.checkResourceNum(resourceModel)) {
         this.player.failure(76503);
      } else {
         int fishLevel = this.getFishLevel(msg.getLength());
         WinterFishingDictionModel fishModel = this.getFishModel(fishLevel);
         int realLength = this.getFishingLength(msg.getLength(), fishModel);
         this.updateCurFishing(realLength, msg.getLength(), fishModel.getId());
         WinterActMsg.S2C_FishingBegin_28724.Builder builder = WinterActMsg.S2C_FishingBegin_28724.newBuilder();
         builder.setFishId(fishModel.getId());
         this.player.sendMsg(builder.build());
         if (fishModel.getFishLevel() == 1) {
            this.fishingGameEnd(true);
         }

      }
   }

   public void updateCurFishing(int realLength, WinterActMsg.FishLength light, int fishId) {
      this.curFishingLength = realLength;
      this.curLight = light;
      this.curFishingId = fishId;
   }

   public void clearCurFishing() {
      this.curFishingLength = 0;
      this.curLight = null;
      this.curFishingId = 0;
   }

   public void sendFishingEndInfo(WinterFishingDictionModel fishModel, int realLength, int point, List<ResourceModel> resourceModelList) {
      WinterActDao dao = this.getDao();
      WinterActMsg.S2C_FishingEnd_28732.Builder builder = WinterActMsg.S2C_FishingEnd_28732.newBuilder();
      builder.setFishId(fishModel.getId());
      builder.setLength(realLength);
      builder.setPoint(point);
      builder.setFishingPointSum(dao.fishingPoint);
      builder.setFishInfo(this.buildFishData((SummerFestivalFishData)dao.fishCollect.get(fishModel.getId())));

      for(ResourceModel model : resourceModelList) {
         builder.addItemInfo(model.builder());
      }

      this.player.sendMsg(builder.build());
   }

   public void fishingGameEnd(Boolean success) {
      WinterFishingDictionModel fishModel = (WinterFishingDictionModel)this.player.getGameModelPool().getEntity("WinterFishingDictionary", this.curFishingId);
      if (fishModel == null) {
         fishModel = this.getFishModel(0);
      }

      int realLength = this.curFishingLength;
      if (!success && fishModel.getFishLevel() > 1) {
         fishModel = this.getFishModel(fishModel.getFishLevel() - 1);
         if (this.curLight != null) {
            realLength = this.getFishingLength(this.curLight, fishModel);
         } else {
            realLength = this.getFishingLength(WinterActMsg.FishLength.LENGTH_HIGH, fishModel);
         }
      }

      WinterActDao dao = this.getDao();
      int point = (int)((float)(fishModel.getBaseScore() * realLength) / fishModel.getBaseLength() / 10.0F);
      if (dao.fishCollect.containsKey(fishModel.getId())) {
         SummerFestivalFishData data = (SummerFestivalFishData)dao.fishCollect.get(fishModel.getId());
         if (data.lengthMin > realLength) {
            data.lengthMin = realLength;
         }

         if (data.lengthMax < realLength) {
            data.lengthMax = realLength;
         }

         if (data.pointMin > point) {
            data.pointMin = point;
         }

         if (data.pointMax < point) {
            data.pointMax = point;
         }

         ++data.fishSum;
      } else {
         SummerFestivalFishData data = new SummerFestivalFishData();
         data.id = fishModel.getId();
         data.fishSum = 1;
         data.lengthMax = realLength;
         data.lengthMin = realLength;
         data.pointMin = point;
         data.pointMax = point;
         dao.fishCollect.put(fishModel.getId(), data);
      }

      dao.fishingPoint += point;
      dao.updateOp();
      ResourceModel resourceModel = new ResourceModel();
      resourceModel.setType(2);
      resourceModel.setId(2753);
      resourceModel.setValue(1);
      this.player.delResource(resourceModel, this.getActivityLogModule(), 15813, 0, 0, "");
      WinterFishingRewardModel rewardModel = this.getFishingRewardModel();
      if (rewardModel != null) {
         this.player.addResource(rewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 15812, 0, 0, "");
      }

      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      rankPart.updateRank(RankDefine.RankModule.ACTIVITY_WINTER_ACT_FISHING, (long)dao.fishingPoint, false);
      this.sendFishingEndInfo(fishModel, realLength, point, rewardModel.getRewards());
      this.clearCurFishing();
   }

   public int getFishingLength(WinterActMsg.FishLength length, WinterFishingDictionModel fishModel) {
      int realLength = 0;
      if (length == WinterActMsg.FishLength.LENGTH_NORMAL) {
         realLength = this.getFishLength(fishModel.getNormolLengthMin(), fishModel.getNormolLengthMax());
      } else if (length == WinterActMsg.FishLength.LENGTH_HIGH) {
         realLength = this.getFishLength(fishModel.getHighLengthMin(), fishModel.getHighLengthMax());
      } else {
         realLength = this.getFishLength(fishModel.getBestLengthMin(), fishModel.getBestLengthMax());
      }

      return realLength;
   }

   @MsgHandlerAnno
   public void C2S_FishingEnd_28731(WinterActMsg.C2S_FishingEnd_28731 msg, String source) {
      ResourceModel resourceModel = new ResourceModel();
      resourceModel.setType(2);
      resourceModel.setId(2753);
      resourceModel.setValue(1);
      if (!this.player.checkResourceNum(resourceModel)) {
         this.player.failure(76503);
      } else {
         this.fishingGameEnd(msg.getAreaSuccess());
      }
   }

   public WinterFishingRewardModel getFishingRewardModel() {
      List<KeyValFun> list = new ArrayList();
      Map<Integer, WinterFishingRewardModel> modelMap = this.player.getGameModelPool().getMap("WinterFishingReward");

      for(WinterFishingRewardModel rewardModel : modelMap.values()) {
         list.add(new KeyValFun(rewardModel.getId(), rewardModel.getWeight()));
      }

      int targetId = GamePlayer.countRate(list);
      return (WinterFishingRewardModel)modelMap.get(targetId);
   }

   public int getFishLength(float min, float max) {
      int start = (int)(min * 10.0F);
      int end = (int)(max * 10.0F);
      int length = RandomUtil.randInt(start, end);
      return length;
   }

   @MsgHandlerAnno
   public void C2S_ReceiveFishBook_28727(WinterActMsg.C2S_ReceiveFishBook_28727 msg, String source) {
      WinterFishingUnlockRewardModel model = (WinterFishingUnlockRewardModel)this.player.getGameModelPool().getEntity("WinterFishingUnlockReward", msg.getId());
      if (model != null) {
         WinterActDao dao = this.getDao();
         if (dao.receiveFishCollectAward.contains(msg.getId())) {
            this.logger.error("已经领取该鱼图鉴奖励:" + msg.getId());
         } else {
            for(Integer id : model.getPara1()) {
               if (!dao.receiveActivationAward.contains(id)) {
                  return;
               }
            }

            dao.receiveFishCollectAward.add(msg.getId());
            dao.updateOp();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 15815, 0, 0, "");
            WinterActMsg.S2C_ReceiveFishBook_28728.Builder builder = WinterActMsg.S2C_ReceiveFishBook_28728.newBuilder();
            builder.addAllReceivedAward(dao.receiveFishCollectAward);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveActivationAward_28729(WinterActMsg.C2S_ReceiveActivationAward_28729 msg, String source) {
      WinterFishingDictionModel fishModel = (WinterFishingDictionModel)this.player.getGameModelPool().getEntity("WinterFishingDictionary", msg.getId());
      if (fishModel == null) {
         this.logger.error("找不到鱼id:" + msg.getId());
      } else {
         WinterActDao dao = this.getDao();
         if (dao.receiveActivationAward.contains(msg.getId())) {
            this.logger.error("激活奖励已领取id:" + msg.getId());
         } else if (!dao.fishCollect.containsKey(msg.getId())) {
            this.logger.error("该鱼图鉴未解锁:" + msg.getId());
         } else {
            dao.receiveActivationAward.add(msg.getId());
            dao.updateOp();
            this.player.addResource(fishModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 15815, 0, 0, "");
            WinterActMsg.S2C_ReceiveActivationAward_28730.Builder builder = WinterActMsg.S2C_ReceiveActivationAward_28730.newBuilder();
            builder.addAllActivationAward(dao.receiveActivationAward);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public WinterFishingDictionModel getFishModel(int level) {
      WinterActDao dao = this.getDao();
      Map<Integer, WinterFishingDictionModel> modelMap = this.player.getGameModelPool().getMap("WinterFishingDictionary");
      List<KeyValFun> list = new ArrayList();

      for(WinterFishingDictionModel model : modelMap.values()) {
         if ((level == 0 || level == model.getFishLevel()) && !dao.fishCollect.containsKey(model.getId())) {
            KeyValFun fun = new KeyValFun(model.getId(), model.getWeight());
            list.add(fun);
         }
      }

      if (list.isEmpty()) {
         for(WinterFishingDictionModel model : modelMap.values()) {
            if (level == 0 || level == model.getFishLevel()) {
               KeyValFun fun = new KeyValFun(model.getId(), model.getWeight());
               list.add(fun);
            }
         }
      }

      if (list.isEmpty()) {
         this.logger.error("冬季盛典钓鱼活动未获取到配置表！");
         return null;
      } else {
         return (WinterFishingDictionModel)modelMap.get(GamePlayer.countRate(list));
      }
   }

   public int getFishLevel(WinterActMsg.FishLength length) {
      List<KeyValFun> list = new ArrayList();
      String fishLimit = "";
      if (length == WinterActMsg.FishLength.LENGTH_NORMAL) {
         fishLimit = this.configManager.getStrByDefault("winterFishingStrength1", "1:8000|2:2000");
      } else if (length == WinterActMsg.FishLength.LENGTH_HIGH) {
         fishLimit = this.configManager.getStrByDefault("winterFishingStrength2", "1:3500|2:5000|3:1500");
      } else {
         fishLimit = this.configManager.getStrByDefault("winterFishingStrength3", "1:2000|2:5000|3:3000");
      }

      String[] str = fishLimit.split("\\|");

      for(int i = 0; i < str.length; ++i) {
         String[] limit = str[i].split(":");
         list.add(new KeyValFun(Integer.parseInt(limit[0]), Integer.parseInt(limit[1])));
      }

      return GamePlayer.countRate(list);
   }

   @MsgHandlerAnno
   public void C2S_BuyFishingTimes_28725(WinterActMsg.C2S_BuyFishingTimes_28725 msg, String source) {
      String buyLimit = this.configManager.getStrByDefault("winterFishingBuy", "30|30|50|100|150");
      String[] limit = buyLimit.split("\\|");
      WinterActDao dao = this.getDao();
      if (dao.buyFishingTimes < limit.length) {
         int cost = Integer.parseInt(limit[dao.buyFishingTimes]);
         if (this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
            this.player.addResource(2, 2753, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 15814, 0, 0, "");
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, this.getActivityLogModule(), 15814, 0, 0, "");
            ++dao.buyFishingTimes;
            dao.updateOp();
            WinterActMsg.S2C_BuyFishingTimes_28726.Builder builder = WinterActMsg.S2C_BuyFishingTimes_28726.newBuilder();
            builder.setBuyFishingTimes(dao.buyFishingTimes);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void fishingEnd() {
      WinterActDao dao = this.getDao();
      dao.fishingPoint = 0;
      dao.buyFishingTimes = 0;
      dao.giveArrowDays.clear();
      dao.fishCollect.clear();
      dao.receiveFishCollectAward.clear();
      dao.receiveActivationAward.clear();
      dao.updateOp();
      this.sendChipReward();
   }

   private void sendChipReward() {
      List<ResourceModel> resourceModels = new ArrayList();
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int count = itemBagPart.getItemNum(2753);
      if (count > 0) {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", 2753);
         if (itemModel == null) {
            return;
         }

         this.player.delResourceAllNum(2, 2753, this.getActivityLogModule(), 15810, 0, 0, "");
         if (itemModel.getSell() != null && !itemModel.getSell().isEmpty() && itemModel.getSell().size() == 3) {
            int type = (Integer)itemModel.getSell().get(0);
            int id = (Integer)itemModel.getSell().get(1);
            int num = (Integer)itemModel.getSell().get(2);
            resourceModels.add(new ResourceModel(type, id, num * count));
         }

         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.TYPE_WINTER_FESTIVAL_FISHING_EXCHANGE);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), resourceModels, 604800000L, this.getActivityLogModule(), 15810);
      }

   }

   public void fishingResetDaily() {
      WinterActDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      if (!dao.giveArrowDays.contains(severActivityDay)) {
         int laborDayArrowNum = this.configManager.getIntDefault("winterFishingFreeTime", 5);
         this.player.addResource(2, 2753, laborDayArrowNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 15808, 0, 0, "");
         dao.buyFishingTimes = 0;
         dao.giveArrowDays.add(severActivityDay);
         dao.updateOp();
      }
   }
}
