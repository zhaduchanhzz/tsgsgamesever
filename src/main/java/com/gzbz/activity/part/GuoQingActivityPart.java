package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActivityGuoQingDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.GuoQingCityBuildData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GreatCityGameMapModel;
import com.gzbz.model.GuoQingAddUpReturnModel;
import com.gzbz.model.GuoQingLotteryCostModel;
import com.gzbz.model.GuoQingLotteryItemModel;
import com.gzbz.model.GuoQingMonopolyBattleModel;
import com.gzbz.model.GuoQingMonopolyBuildModel;
import com.gzbz.model.GuoQingMonopolyChooseModel;
import com.gzbz.model.GuoQingMonopolyEventModel;
import com.gzbz.model.GuoQingMonopolyMapModel;
import com.gzbz.model.GuoQingMonopolyRandomShopModel;
import com.gzbz.model.GuoQingShopAddUpModel;
import com.gzbz.model.GuoQingSignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityGuoQingMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.GuoQingMonopolyTaskPart;
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
import misc.RandomUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GuoQingActivityPart extends AddUpAndConRechargeActivityPart {
   public ActivityGuoQingDao getDao() {
      ActivityGuoQingDao dao = (ActivityGuoQingDao)this.player.getData("tb_activity_guo_qing", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 125;
   }

   public int getAddUpLogReason() {
      return 12501;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_GUO_QING_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "GuoQingAddupRecharge";
   }

   public int getConLogReason() {
      return 12515;
   }

   public int getConMail() {
      return CentreAwardModel.TYPE_GUO_QING_BLESSING_RECHARGE;
   }

   public String getConExcelName() {
      return "GuoQingBlessing";
   }

   public int getActivityType() {
      return 34;
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
         ActivityGuoQingDao dao = this.getDao();
         dao.buyGoldDiceNum = 0;
         dao.updateOp();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
         GuoQingMonopolyTaskPart guoQingMonopolyTaskPart = (GuoQingMonopolyTaskPart)this.player.getMgrPart(GuoQingMonopolyTaskPart.class);
         guoQingMonopolyTaskPart.clearDailyTask();
         guoQingMonopolyTaskPart.trigger();
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
      GuoQingMonopolyTaskPart guoQingMonopolyTaskPart = (GuoQingMonopolyTaskPart)this.player.getMgrPart(GuoQingMonopolyTaskPart.class);

      for(TaskData taskData : guoQingMonopolyTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

   }

   public void rotateReset(int oldActivityId) {
      ActivityGuoQingDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.updateOp();
      this.signEnd();
      this.drawEnd();
      this.shopAddUpReset();
      dao.building.clear();
      dao.buyGoldDiceNum = 0;
      dao.diceRecover = 0;
      dao.diceMaxRecover = 0;
      Map<Integer, GreatCityGameMapModel> greatCityGameMapModelMap = ApplicationContextProvider.<Integer, GreatCityGameMapModel>getModelPoolMap("GreatCityGameMap");
      TreeSet<Integer> gridIds = new TreeSet(greatCityGameMapModelMap.keySet());
      dao.grid = (Integer)gridIds.first();
      dao.point = 0;
      dao.updateOp();
      int pointId = ApplicationContextProvider.getConfigInt("GuoQingMonopolyBoomPoint", 0);
      this.player.delResourceAllNum(2, pointId, 125, 12511, 0, 0, "");
      this.resetDice("GuoQingMonopolyDiceNum", "GuoQingMonopolyDiceID");
      this.resetDice("GuoQingMonopolyGoldDiceNum", "GuoQingMonopolyGoldDiceID");
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(45);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_GUO_QING);
      GuoQingMonopolyTaskPart taskPart = (GuoQingMonopolyTaskPart)this.player.getMgrPart(GuoQingMonopolyTaskPart.class);
      taskPart.trigger();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_21901(ActivityGuoQingMsg.C2S_ActivityInfo_21901 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ActivityGuoQingMsg.S2C_ActivityInfo_21902.Builder builder = ActivityGuoQingMsg.S2C_ActivityInfo_21902.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivityGuoQingDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_21903(ActivityGuoQingMsg.C2S_ShopAddUpInfo_21903 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_21905(ActivityGuoQingMsg.C2S_ReceiveShopAddUpReward_21905 msg, String source) {
      int id = msg.getId();
      ActivityGuoQingDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         GuoQingShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12502, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.Builder builder = ActivityGuoQingMsg.S2C_ShopAddUpInfo_21904.newBuilder();
      ActivityGuoQingDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityGuoQingDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, GuoQingShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            GuoQingShopAddUpModel model = (GuoQingShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityGuoQingDao dao = this.getDao();
      Map<Integer, GuoQingShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(GuoQingShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_GUO_QING_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 12502);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      GuoQingShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityGuoQingDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public GuoQingShopAddUpModel getShopAddUpModel(int id) {
      GuoQingShopAddUpModel model = (GuoQingShopAddUpModel)this.player.getGameModelPool().getEntity("GuoQingShopAddup", id);
      return model;
   }

   public Map<Integer, GuoQingShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, GuoQingShopAddUpModel> modelMap = new HashMap();
      Map<Integer, GuoQingShopAddUpModel> allModel = this.player.getGameModelPool().getMap("GuoQingShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, GuoQingShopAddUpModel> entry : allModel.entrySet()) {
            GuoQingShopAddUpModel model = (GuoQingShopAddUpModel)entry.getValue();
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
   public void C2S_SignTotalInfo_21906(ActivityGuoQingMsg.C2S_SignTotalInfo_21906 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ActivityGuoQingMsg.S2C_SignTotalInfo_21907.Builder builder = ActivityGuoQingMsg.S2C_SignTotalInfo_21907.newBuilder();
      ActivityGuoQingDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      GuoQingSignAwardModel model = (GuoQingSignAwardModel)this.player.getGameModelPool().getEntity("GuoQingSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActivityGuoQingDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_21908(ActivityGuoQingMsg.C2S_Sign_21908 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         ActivityGuoQingDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         GuoQingSignAwardModel model = (GuoQingSignAwardModel)this.player.getGameModelPool().getEntity("GuoQingSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12503, 0, 0, "");
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActivityGuoQingDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   public void drawEnd() {
      ActivityGuoQingDao dao = this.getDao();
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
      ActivityGuoQingDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_21913(ActivityGuoQingMsg.C2S_FancyReward_21913 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityGuoQingDao dao = this.getDao();
         GuoQingLotteryItemModel lotteryItemModel = (GuoQingLotteryItemModel)this.player.getGameModelPool().getEntity("GuoQingLotteryItem", msg.getTargetId());
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
                  ActivityGuoQingMsg.S2C_FancyReward_21914.Builder builder = ActivityGuoQingMsg.S2C_FancyReward_21914.newBuilder();
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
      Map<Integer, GuoQingLotteryItemModel> allMap = this.player.getGameModelPool().getMap("GuoQingLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(GuoQingLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_21917(ActivityGuoQingMsg.C2S_Draw_21917 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         GuoQingLotteryCostModel costModel = (GuoQingLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("GuoQingLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = ApplicationContextProvider.getConfigInt("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(49, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityGuoQingDao dao = this.getDao();
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
                     Map<Integer, GuoQingLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        GuoQingLotteryItemModel enjoyModel = (GuoQingLotteryItemModel)this.player.getGameModelPool().getEntity("GuoQingLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           GuoQingLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ActivityGuoQingDao.RecordInfo recordInfo = new ActivityGuoQingDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 12505, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_GUO_QING_ACTIVITY, this.getActivityLogModule(), 12504, 0, 0, "");
                        playerResetCustomCache.addDailyReset(49, lotteryNum);
                        ActivityGuoQingMsg.S2C_Draw_21918.Builder builder = ActivityGuoQingMsg.S2C_Draw_21918.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(49, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "国庆-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, GuoQingLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, GuoQingLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("GuoQingLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, GuoQingLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, GuoQingLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((GuoQingLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((GuoQingLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((GuoQingLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((GuoQingLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((GuoQingLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((GuoQingLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private GuoQingLotteryItemModel smashEgg(ActivityGuoQingDao dao, Map<Integer, GuoQingLotteryItemModel> itemModelMap) {
      Map<Integer, GuoQingLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(GuoQingLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(GuoQingLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_21915(ActivityGuoQingMsg.C2S_LuckDrawInfo_21915 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityGuoQingDao dao = this.getDao();
      ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.Builder builder = ActivityGuoQingMsg.S2C_LuckDrawInfo_21916.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(49, 0);
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

   public List<GuoQingLotteryItemModel> getDrawJackpot() {
      List<GuoQingLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, GuoQingLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, GuoQingLotteryItemModel>>getModelPoolMap("customGuoQingLotteryItem");
      TreeMap<Integer, Map<Integer, GuoQingLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, GuoQingLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(GuoQingLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<GuoQingLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("国庆活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         GuoQingLotteryItemModel model = (GuoQingLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(GuoQingLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadGuoQingRecord_4251.Builder builder = CrossMsg.S2CR_UploadGuoQingRecord_4251.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_21919(ActivityGuoQingMsg.C2S_OpenReward_21919 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         GuoQingAddUpReturnModel awardModel = (GuoQingAddUpReturnModel)ApplicationContextProvider.getModelPoolEntity("GuoQingAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityGuoQingDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("国庆活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("国庆活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12506, 0, 0, "");
                  ActivityGuoQingMsg.S2C_OpenReward_21920.Builder builder = ActivityGuoQingMsg.S2C_OpenReward_21920.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("国庆活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_21921(ActivityGuoQingMsg.C2S_DrawRecord_21921 msg, String source) {
      ActivityGuoQingMsg.S2C_DrawRecord_21922.Builder builder = ActivityGuoQingMsg.S2C_DrawRecord_21922.newBuilder();
      ActivityGuoQingDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ActivityGuoQingMsg.MyDrawRecord.Builder drawRecord = ActivityGuoQingMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_21923(ActivityGuoQingMsg.C2S_ServerDrawRecord_21923 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      GuoQingLotteryItemModel model = (GuoQingLotteryItemModel)this.player.getGameModelPool().getEntity("GuoQingLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, GuoQingLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               GuoQingLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private GuoQingLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, GuoQingLotteryItemModel> itemModelMap) {
      Map<Integer, GuoQingLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(GuoQingLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     ActivityGuoQingDao dao = this.getDao();
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

         for(GuoQingLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_GameMain_17201(ActivityGuoQingMsg.C2S_GameMain_21931 msg, String source) {
      this.sendGameMain();
   }

   @MsgHandlerAnno
   public void C2S_GameRollDice_21933(ActivityGuoQingMsg.C2S_GameRollDice_21933 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityGuoQingDao dao = this.getDao();
         if (dao.event.eventId > 0) {
            GuoQingMonopolyEventModel guoQingMonopolyEventModel = (GuoQingMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyEvent", dao.event.eventId);
            if (guoQingMonopolyEventModel != null && guoQingMonopolyEventModel.getEventType() == 3) {
               this.player.failure(0);
               return;
            }
         }

         String diceItem;
         int num;
         if (msg.getType() == 1) {
            diceItem = "GuoQingMonopolyDiceID";
            num = cn.hutool.core.util.RandomUtil.randomInt(1, 7);
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

            diceItem = "GuoQingMonopolyGoldDiceID";
         }

         int diceNum = this.getDiceNum(diceItem);
         if (diceNum <= 0) {
            this.player.failure(51);
         } else {
            this.useDice(diceItem);
            if (msg.getType() == 1) {
               this.checkDiceCountRecover();
            }

            this.rollDice(msg.getType(), num);
         }
      }
   }

   private void rollDice(int type, int num) {
      ActivityGuoQingDao dao = this.getDao();
      List<ResourceModel> rewardList = new ArrayList();
      GuoQingMonopolyMapModel guoQingMonopolyMapModel = this.eventMove(num, rewardList);
      ActivityGuoQingMsg.S2C_GameRollDice_21934.Builder resp = ActivityGuoQingMsg.S2C_GameRollDice_21934.newBuilder();
      resp.setGrid(dao.grid);
      dao.updateOp();
      resp.setType(type);
      resp.setNum(num);
      resp.setDiceRecover(dao.diceRecover);
      if (guoQingMonopolyMapModel != null) {
         ActivityGuoQingMsg.GameEvent.Builder builder = this.triggerEvent(guoQingMonopolyMapModel.getEventId(), rewardList);
         if (builder != null) {
            GuoQingMonopolyEventModel guoQingMonopolyEventModel = (GuoQingMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyEvent", builder.getEventId());
            if (guoQingMonopolyEventModel.getEventType() == 1) {
               resp.setBuilding(((GuoQingCityBuildData)dao.building.get(builder.getEventParam(0))).buildMsg());
            } else if (guoQingMonopolyEventModel.getEventType() != 2) {
               resp.setEvent(builder);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_GUO_QING_ACTIVITY_CITY_GAME, 125, 12508, num, dao.grid, "");
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_GameAddRandomDice_21935(ActivityGuoQingMsg.C2S_GameAddRandomDice_21935 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ActivityGuoQingDao dao = this.getDao();
         ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.Builder resp = ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.newBuilder();
         resp.setDiceRecover(dao.diceRecover);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameGoldDiceBuy_21937(ActivityGuoQingMsg.C2S_GameGoldDiceBuy_21937 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityGuoQingDao dao = this.getDao();
         String feeStr = ApplicationContextProvider.getConfigString("GuoQingMonopolyGoldDicePrice", "");
         List<ResourceModel> buyFeeList = ResourceModel.buildResources(feeStr);
         if (dao.buyGoldDiceNum >= buyFeeList.size()) {
            this.player.failure(25);
         } else {
            ResourceModel feeGold = (ResourceModel)buyFeeList.get(dao.buyGoldDiceNum);
            if (!this.player.checkResourceNum(feeGold)) {
               this.player.failure(31);
            } else {
               this.player.delResource(feeGold, 125, 12507, 0, 0, "");
               ++dao.buyGoldDiceNum;
               dao.updateOp();
               this.addDice("GuoQingMonopolyGoldDiceID", 12507, 1);
               ActivityGuoQingMsg.S2C_GameGoldDiceBuy_21938.Builder resp = ActivityGuoQingMsg.S2C_GameGoldDiceBuy_21938.newBuilder();
               resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameEvent_21939(ActivityGuoQingMsg.C2S_GameEvent_21939 msg, String source) {
      if (!msg.hasEvent()) {
         this.player.failure(0);
      } else if (this.isServerActivityInvalid()) {
         this.player.failure(0);
      } else {
         ActivityGuoQingDao dao = this.getDao();
         GuoQingMonopolyEventModel guoQingMonopolyEventModel = (GuoQingMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyEvent", msg.getEvent().getEventId());
         if (guoQingMonopolyEventModel == null) {
            this.player.sendMsg(this.eventHandleDone(msg.getEvent(), dao.grid).build());
         } else {
            List<ResourceModel> rewardList = new ArrayList();
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            if (guoQingMonopolyEventModel.getEventType() == 3) {
               ActivityGuoQingMsg.S2C_GameEvent_21940.Builder resp = this.eventHandleDone(msg.getEvent(), dao.grid);
               GuoQingMonopolyMapModel guoQingMonopolyMapModel = (GuoQingMonopolyMapModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyMap", dao.grid);
               if (guoQingMonopolyMapModel != null) {
                  ActivityGuoQingMsg.GameEvent.Builder nextEvent = this.triggerEvent(guoQingMonopolyMapModel.getEventId(), rewardList);
                  if (nextEvent != null) {
                     GuoQingMonopolyEventModel nextGameEventModel = (GuoQingMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyEvent", nextEvent.getEventId());
                     if (nextGameEventModel.getEventType() == 1) {
                        resp.setBuilding(((GuoQingCityBuildData)dao.building.get(nextEvent.getEventParam(0))).buildMsg());
                     } else if (nextGameEventModel.getEventType() != 2) {
                        resp.setNextEvent(nextEvent);
                     }
                  }
               }

               this.player.sendMsg(resp.build());
               showType = PlayerMsg.ShowType.SHOW_GUO_QING_ACTIVITY_CITY_GAME;
            } else {
               if (dao.event.eventId != msg.getEvent().getEventId()) {
                  this.player.sendMsg(this.eventHandleDone(msg.getEvent(), dao.grid).build());
                  return;
               }

               if (this.eventHandle(msg.getEvent().getEventId(), msg.getEvent().getEventParamList(), rewardList) == null) {
                  return;
               }

               dao.event.clear();
               dao.updateOp();
               this.player.sendMsg(this.eventHandleDone(msg.getEvent(), dao.grid).build());
            }

            if (!rewardList.isEmpty()) {
               this.player.addResource(rewardList, showType, 125, 12512, msg.getEvent().getEventId(), 0, "");
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTask_21941(ActivityGuoQingMsg.C2S_GameTask_21941 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         GuoQingMonopolyTaskPart guoQingMonopolyTaskPart = (GuoQingMonopolyTaskPart)this.player.getMgrPart(GuoQingMonopolyTaskPart.class);
         guoQingMonopolyTaskPart.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTaskCommit_21943(ActivityGuoQingMsg.C2S_GameTaskCommit_21943 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         GuoQingMonopolyTaskPart guoQingMonopolyTaskPart = (GuoQingMonopolyTaskPart)this.player.getMgrPart(GuoQingMonopolyTaskPart.class);
         guoQingMonopolyTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameBuildingReward_21947(ActivityGuoQingMsg.C2S_GameBuildingReward_21947 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>>getModelPoolMap("cusTomGuoQingMonopolyBuild");
         if (!buildingMap.containsKey(msg.getBuildingId())) {
            this.player.failure(0);
         } else {
            TreeMap<Integer, GuoQingMonopolyBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(msg.getBuildingId());
            if (!curBuildModelMap.containsKey(msg.getLv())) {
               this.player.failure(0);
            } else {
               ActivityGuoQingDao dao = this.getDao();
               if (!dao.building.containsKey(msg.getBuildingId())) {
                  this.player.failure(0);
               } else {
                  GuoQingCityBuildData guoQingCityBuildData = (GuoQingCityBuildData)dao.building.get(msg.getBuildingId());
                  if (guoQingCityBuildData.lv < msg.getLv()) {
                     this.player.failure(0);
                  } else if (guoQingCityBuildData.rewardLv.contains(msg.getLv())) {
                     this.player.failure(24);
                  } else {
                     guoQingCityBuildData.rewardLv.add(msg.getLv());
                     dao.updateOp();
                     GuoQingMonopolyBuildModel guoQingMonopolyBuildModel = (GuoQingMonopolyBuildModel)curBuildModelMap.get(msg.getLv());
                     this.player.addResource(guoQingMonopolyBuildModel.getRoundRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 125, 12514, msg.getBuildingId(), msg.getLv(), "");
                     ActivityGuoQingMsg.S2C_GameBuildingReward_21948.Builder resp = ActivityGuoQingMsg.S2C_GameBuildingReward_21948.newBuilder();
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
         ActivityGuoQingDao dao = this.getDao();
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int maxCount = ApplicationContextProvider.getConfigInt("GuoQingMonopolyDiceUpLimit", 0);
         int recoverTime = ApplicationContextProvider.getConfigInt("GuoQingMonopolyDiceTime", 10800);
         int diceNum = this.getDiceNum("GuoQingMonopolyDiceID");
         if (diceNum < maxCount) {
            if (dao.diceRecover == 0) {
               if (dao.diceMaxRecover > 0) {
                  dao.diceRecover = curTime + dao.diceMaxRecover;
                  dao.diceMaxRecover = 0;
               } else {
                  dao.diceRecover = curTime + recoverTime;
               }

               dao.updateOp();
            }

            int addNum;
            for(addNum = 0; dao.diceRecover < curTime && diceNum + addNum < maxCount; ++addNum) {
               dao.diceRecover += recoverTime;
               dao.updateOp();
            }

            if (addNum > 0) {
               this.addDice("GuoQingMonopolyDiceID", 12513, addNum);
               if (diceNum + addNum >= maxCount) {
                  dao.diceRecover = 0;
                  dao.updateOp();
               }
            }

         }
      }
   }

   public void checkRandomDiceMax() {
      if (!this.isServerActivityInvalid()) {
         int maxCount = ApplicationContextProvider.getConfigInt("GuoQingMonopolyDiceUpLimit", 0);
         int diceNum = this.getDiceNum("GuoQingMonopolyDiceID");
         ActivityGuoQingDao dao = this.getDao();
         if (diceNum >= maxCount && dao.diceRecover > 0) {
            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (dao.diceRecover > curTime) {
               dao.diceMaxRecover = dao.diceRecover - curTime;
            } else {
               dao.diceMaxRecover = 0;
            }

            dao.diceRecover = 0;
            dao.updateOp();
            ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.Builder resp = ActivityGuoQingMsg.S2C_GameAddRandomDice_21936.newBuilder();
            resp.setDiceRecover(dao.diceRecover);
            this.player.sendMsg(resp.build());
         }

      }
   }

   public void updateGameRank(int num) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.drop > DateUtil.getIntTime(System.currentTimeMillis())) {
            ActivityGuoQingDao dao = this.getDao();
            dao.point += num;
            dao.updateOp();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_GUO_QING, (long)dao.point, false);
         }
      }
   }

   private void resetDice(String initNumConfig, String itemConfig) {
      int initDiceNum = ApplicationContextProvider.getConfigInt(initNumConfig, 0);
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      int curNum = (int)this.player.getResourceNum(2, diceItem);
      if (curNum > initDiceNum) {
         this.player.delResource(2, diceItem, (long)(curNum - initDiceNum), 125, 12511, 0, 0, "");
      } else if (curNum < initDiceNum) {
         this.player.addResource(2, diceItem, initDiceNum - curNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 125, 12511, 0, 0, "");
      }

   }

   private int getDiceNum(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      return (int)this.player.getResourceNum(2, diceItem);
   }

   private void useDice(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.delResource(2, diceItem, 1L, 125, 12508, 0, 0, "");
   }

   private void addDice(String itemConfig, int reason, int num) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.addResource(2, diceItem, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 125, reason, 0, 0, "");
   }

   private ActivityGuoQingMsg.GameEvent.Builder triggerEvent(int eventId, List<ResourceModel> rewardList) {
      if (eventId <= 0) {
         return null;
      } else {
         Map<Integer, TreeMap<Integer, GuoQingMonopolyEventModel>> eventMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GuoQingMonopolyEventModel>>getModelPoolMap("customGuoQingMonopolyEvent");
         GuoQingMonopolyEventModel guoQingMonopolyEventModel;
         if (eventId == 301) {
            List<GuoQingMonopolyEventModel> luckyEvents = new ArrayList(((TreeMap)eventMap.get(eventId)).values());
            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < luckyEvents.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((GuoQingMonopolyEventModel)luckyEvents.get(index)).getRandOdd()));
            }

            WeightRandom<Integer> weightRandom = cn.hutool.core.util.RandomUtil.weightRandom(weightList);
            guoQingMonopolyEventModel = (GuoQingMonopolyEventModel)luckyEvents.get((Integer)weightRandom.next());
         } else {
            guoQingMonopolyEventModel = (GuoQingMonopolyEventModel)((TreeMap)eventMap.get(eventId)).firstEntry().getValue();
         }

         this.logger.info("触发事件【{}】", guoQingMonopolyEventModel.getId());
         ActivityGuoQingDao dao = this.getDao();
         ActivityGuoQingMsg.GameEvent.Builder eventBuilder = null;
         switch (guoQingMonopolyEventModel.getEventType()) {
            case 1:
            case 2:
               eventBuilder = this.eventHandle(guoQingMonopolyEventModel.getId(), guoQingMonopolyEventModel.getParam(), rewardList);
               break;
            case 3:
               int moveNum = cn.hutool.core.util.RandomUtil.randomInt((Integer)guoQingMonopolyEventModel.getParam().get(0), (Integer)guoQingMonopolyEventModel.getParam().get(1) + 1);
               List<Integer> paramList = new ArrayList();
               paramList.add(moveNum);
               eventBuilder = this.eventHandle(guoQingMonopolyEventModel.getId(), paramList, rewardList);
               break;
            case 4:
            case 6:
               dao.event.eventId = guoQingMonopolyEventModel.getId();
               dao.event.eventParams.clear();
               eventBuilder = ActivityGuoQingMsg.GameEvent.newBuilder().setEventId(dao.event.eventId);
               break;
            case 5:
               dao.event.eventId = guoQingMonopolyEventModel.getId();
               dao.event.eventParams.clear();
               Map<Integer, GuoQingMonopolyRandomShopModel> guoQingMonopolyRandomShopModelMap = ApplicationContextProvider.<Integer, GuoQingMonopolyRandomShopModel>getModelPoolMap("GuoQingMonopolyRandomShop");
               List<Integer> randomShopIds = new ArrayList(guoQingMonopolyRandomShopModelMap.keySet());
               Collections.shuffle(randomShopIds);
               dao.event.eventParams.addAll(randomShopIds.subList(0, (Integer)guoQingMonopolyEventModel.getParam().get(0)));
               eventBuilder = ActivityGuoQingMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams);
         }

         dao.updateOp();
         this.player.triggerTask(667, eventId, 1L, 1);
         return eventBuilder;
      }
   }

   private ActivityGuoQingMsg.GameEvent.Builder eventHandle(int eventId, List<Integer> eventParams, List<ResourceModel> rewardList) {
      ActivityGuoQingMsg.GameEvent.Builder builder = ActivityGuoQingMsg.GameEvent.newBuilder();
      builder.setEventId(eventId);
      GuoQingMonopolyEventModel guoQingMonopolyEventModel = (GuoQingMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyEvent", eventId);
      if (guoQingMonopolyEventModel == null) {
         return builder;
      } else {
         switch (guoQingMonopolyEventModel.getEventType()) {
            case 1:
               this.eventBuildUpgrade(guoQingMonopolyEventModel, rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 2:
               for(ResourceModel reward : guoQingMonopolyEventModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }
               break;
            case 3:
               this.eventMove((Integer)eventParams.get(0), rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 4:
               if ((Integer)eventParams.get(0) > 0) {
                  this.eventBattle(guoQingMonopolyEventModel.getId());
               }
               break;
            case 5:
               if ((Integer)eventParams.get(0) > 0 && !this.eventBuy(guoQingMonopolyEventModel.getId(), rewardList)) {
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
         ActivityGuoQingDao dao = this.getDao();
         ActivityGuoQingMsg.S2C_GameMain_21932.Builder resp = ActivityGuoQingMsg.S2C_GameMain_21932.newBuilder();
         resp.setGrid(dao.grid);
         resp.setDiceRecover(dao.diceRecover);
         resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
         Map<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>>getModelPoolMap("cusTomGuoQingMonopolyBuild");

         for(int buildId : buildingMap.keySet()) {
            GuoQingCityBuildData guoQingCityBuildData = (GuoQingCityBuildData)dao.building.get(buildId);
            if (guoQingCityBuildData != null) {
               resp.addBuilding(guoQingCityBuildData.buildMsg());
            } else {
               resp.addBuilding(ActivityGuoQingMsg.GameBuilding.newBuilder().setBuildId(buildId).setLv(0));
            }
         }

         if (dao.event.eventId > 0) {
            resp.setEvent(ActivityGuoQingMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams));
         }

         this.player.sendMsg(resp.build());
      }
   }

   private ActivityGuoQingMsg.S2C_GameEvent_21940.Builder eventHandleDone(ActivityGuoQingMsg.GameEvent gameEvent, int grid) {
      ActivityGuoQingMsg.S2C_GameEvent_21940.Builder resp = ActivityGuoQingMsg.S2C_GameEvent_21940.newBuilder();
      resp.setEvent(gameEvent);
      resp.setGrid(grid);
      return resp;
   }

   private void eventBuildUpgrade(GuoQingMonopolyEventModel guoQingMonopolyEventModel, List<ResourceModel> rewardList) {
      int buildId = (Integer)guoQingMonopolyEventModel.getParam().get(0);
      Map<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>>getModelPoolMap("cusTomGuoQingMonopolyBuild");
      if (!buildingMap.containsKey(buildId)) {
         this.logger.error("玩家【{}】升级建筑【{}】失败,建筑配置不存在", this.player.getPlayerId(), buildId);
      } else {
         ActivityGuoQingDao dao = this.getDao();
         TreeMap<Integer, GuoQingMonopolyBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(buildId);
         GuoQingCityBuildData guoQingCityBuildData = (GuoQingCityBuildData)dao.building.get(buildId);
         if (guoQingCityBuildData == null) {
            guoQingCityBuildData = new GuoQingCityBuildData();
            guoQingCityBuildData.buildId = buildId;
         }

         if (guoQingCityBuildData.lv >= (Integer)curBuildModelMap.lastKey()) {
            GuoQingMonopolyBuildModel guoQingMonopolyBuildModel = (GuoQingMonopolyBuildModel)curBuildModelMap.get(guoQingCityBuildData.lv);

            for(ResourceModel reward : guoQingMonopolyBuildModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }

         } else if (!curBuildModelMap.containsKey(guoQingCityBuildData.lv + 1)) {
            this.logger.error("玩家【{}】升级建筑【{}】失败,等级【{}】配置不存在", new Object[]{this.player.getPlayerId(), buildId, guoQingCityBuildData.lv + 1});
         } else {
            ++guoQingCityBuildData.lv;
            dao.building.put(buildId, guoQingCityBuildData);
            dao.updateOp();
            GuoQingMonopolyBuildModel guoQingMonopolyBuildModel = (GuoQingMonopolyBuildModel)curBuildModelMap.get(guoQingCityBuildData.lv);

            for(ResourceModel reward : guoQingMonopolyBuildModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }

            this.player.triggerTask(668, buildId, (long)guoQingCityBuildData.lv, 0);
         }
      }
   }

   private GuoQingMonopolyMapModel eventMove(int num, List<ResourceModel> rewardList) {
      if (num <= 6 && num >= -6) {
         Map<Integer, GuoQingMonopolyMapModel> monopolyMapModel = ApplicationContextProvider.<Integer, GuoQingMonopolyMapModel>getModelPoolMap("GuoQingMonopolyMap");
         if (monopolyMapModel != null && !monopolyMapModel.isEmpty()) {
            ActivityGuoQingDao dao = this.getDao();
            int curGrid = dao.grid + num;
            if (curGrid < 0) {
               curGrid += monopolyMapModel.size();
            } else if (curGrid > monopolyMapModel.size()) {
               curGrid -= monopolyMapModel.size();
               Map<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GuoQingMonopolyBuildModel>>getModelPoolMap("cusTomGuoQingMonopolyBuild");

               for(GuoQingCityBuildData guoQingCityBuildData : dao.building.values()) {
                  if (buildingMap.containsKey(guoQingCityBuildData.buildId)) {
                     TreeMap<Integer, GuoQingMonopolyBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(guoQingCityBuildData.buildId);
                     if (curBuildModelMap.containsKey(guoQingCityBuildData.lv)) {
                        GuoQingMonopolyBuildModel guoQingMonopolyBuildModel = (GuoQingMonopolyBuildModel)curBuildModelMap.get(guoQingCityBuildData.lv);

                        for(ResourceModel roundReward : guoQingMonopolyBuildModel.getRoundRewards()) {
                           roundReward.addResourceToList(rewardList);
                        }
                     }
                  }
               }
            }

            GuoQingMonopolyMapModel guoQingMonopolyMapModel = (GuoQingMonopolyMapModel)monopolyMapModel.get(curGrid);
            if (guoQingMonopolyMapModel == null) {
               return null;
            } else {
               dao.grid = curGrid;
               dao.updateOp();
               return guoQingMonopolyMapModel;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void eventBattle(int eventId) {
      Map<Integer, GuoQingMonopolyBattleModel> greatCityGameBattleModelMap = ApplicationContextProvider.<Integer, GuoQingMonopolyBattleModel>getModelPoolMap("GuoQingMonopolyBattle");
      if (greatCityGameBattleModelMap != null && !greatCityGameBattleModelMap.isEmpty()) {
         TreeSet<Integer> greatCityGameBattleIds = new TreeSet(greatCityGameBattleModelMap.keySet());
         GuoQingMonopolyBattleModel matchModel = null;

         for(int id : greatCityGameBattleIds) {
            GuoQingMonopolyBattleModel guoQingMonopolyBattleModel = (GuoQingMonopolyBattleModel)greatCityGameBattleModelMap.get(id);
            if (this.player.getMaxPlayerCombatPower() >= (long)guoQingMonopolyBattleModel.getPowerStart() && this.player.getMaxPlayerCombatPower() <= (long)guoQingMonopolyBattleModel.getPowerEnd()) {
               matchModel = guoQingMonopolyBattleModel;
               break;
            }
         }

         if (matchModel == null) {
            matchModel = (GuoQingMonopolyBattleModel)greatCityGameBattleModelMap.get(greatCityGameBattleIds.last());
         }

         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         BattleMsg.C2S_BattleBegin_6107.Builder builder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
         builder.setModelId(matchModel.getId());
         builder.setType(3178);
         builder.addParams(eventId);
         battlePart.begin(builder.build(), "");
      }
   }

   public int enterBattle(BattleDao battleDao) {
      GuoQingMonopolyBattleModel guoQingMonopolyBattleModel = (GuoQingMonopolyBattleModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyBattle", battleDao.modelId);
      BattlePKTeam rightTeam = new BattlePKTeam(guoQingMonopolyBattleModel.getBattleId());
      battleDao.scene.addPKTeam((byte)1, rightTeam);
      battleDao.scene.setMaxRound((byte)guoQingMonopolyBattleModel.getRound());
      battleDao.scene.setBattleId(guoQingMonopolyBattleModel.getBattleId());
      return 1;
   }

   public void afterBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         GuoQingMonopolyBattleModel guoQingMonopolyBattleModel = (GuoQingMonopolyBattleModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyBattle", battleDao.modelId);
         battleDao.rewards.addAll(guoQingMonopolyBattleModel.getRewards());
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
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 125, 12512, (Integer)battleDao.params.get(0), battleDao.modelId, "");
      }
   }

   private boolean eventBuy(int eventId, List<ResourceModel> rewardList) {
      ActivityGuoQingDao dao = this.getDao();
      List<ResourceModel> feeResourceList = new ArrayList();

      for(int eventParam : dao.event.eventParams) {
         GuoQingMonopolyRandomShopModel greatCityGameRandomShopModel = (GuoQingMonopolyRandomShopModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyRandomShop", eventParam);
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
         this.player.delResource((List)feeResourceList, 125, 12512, eventId, 0, "");
         return true;
      }
   }

   private void eventGrant(int grantIndex, List<ResourceModel> rewardList) {
      Map<Integer, GuoQingMonopolyChooseModel> guoQingMonopolyChooseModelMap = ApplicationContextProvider.<Integer, GuoQingMonopolyChooseModel>getModelPoolMap("GuoQingMonopolyChoose");
      if (guoQingMonopolyChooseModelMap != null && !guoQingMonopolyChooseModelMap.isEmpty()) {
         List<GuoQingMonopolyChooseModel> guoQingMonopolyChooseModels = new ArrayList(guoQingMonopolyChooseModelMap.values());
         Collections.shuffle(guoQingMonopolyChooseModels);
         ResourceModel rewardModel = (ResourceModel)((GuoQingMonopolyChooseModel)guoQingMonopolyChooseModels.get(0)).getRewards().get(grantIndex);
         rewardModel.addResourceToList(rewardList);
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
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_GUO_QING_ACTIVITY, 125, 12508, eventId, 0, "");
            }
            break;
         case "rolldice":
            this.rollDice(2, Integer.parseInt(split[1]));
      }

      this.sendGameMain();
   }
}
