package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActGoldWeekDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.GoldWeekCityBuildData;
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
import com.gzbz.model.GoldWeekAddUpReturnModel;
import com.gzbz.model.GoldWeekLotteryCostModel;
import com.gzbz.model.GoldWeekLotteryItemModel;
import com.gzbz.model.GoldWeekMonopolyBattleModel;
import com.gzbz.model.GoldWeekMonopolyBuildModel;
import com.gzbz.model.GoldWeekMonopolyChooseModel;
import com.gzbz.model.GoldWeekMonopolyEventModel;
import com.gzbz.model.GoldWeekMonopolyMapModel;
import com.gzbz.model.GoldWeekMonopolyRandomShopModel;
import com.gzbz.model.GoldWeekShopAddUpModel;
import com.gzbz.model.GoldWeekSignAwardModel;
import com.gzbz.model.GreatCityGameMapModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActGoldWeekMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActGoldWeekTaskPart;
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
public class ActGoldWeekPart extends AddUpAndConRechargeActivityPart {
   public ActGoldWeekDao getDao() {
      ActGoldWeekDao dao = (ActGoldWeekDao)this.player.getData("tb_act_god_week", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 140;
   }

   public int getAddUpLogReason() {
      return 14001;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_GOLD_WEEK_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "HJWeekAddupRecharge";
   }

   public int getConLogReason() {
      return 0;
   }

   public int getConMail() {
      return 0;
   }

   public String getConExcelName() {
      return null;
   }

   public int getActivityType() {
      return 101;
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
         ActGoldWeekDao dao = this.getDao();
         dao.buyGoldDiceNum = 0;
         dao.updateOp();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
         ActGoldWeekTaskPart goldWeekMonopolyTaskPart = (ActGoldWeekTaskPart)this.player.getMgrPart(ActGoldWeekTaskPart.class);
         goldWeekMonopolyTaskPart.clearDailyTask();
         goldWeekMonopolyTaskPart.trigger();
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
      ActGoldWeekTaskPart goldWeekMonopolyTaskPart = (ActGoldWeekTaskPart)this.player.getMgrPart(ActGoldWeekTaskPart.class);

      for(TaskData taskData : goldWeekMonopolyTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

   }

   public void rotateReset(int oldActivityId) {
      ActGoldWeekDao dao = this.getDao();
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
      int pointId = ApplicationContextProvider.getConfigInt("HJWeekMonopolyBoomPoint", 0);
      this.player.delResourceAllNum(2, pointId, 140, 14011, 0, 0, "");
      this.resetDice("HJWeekMonopolyDiceNum", "HJWeekMonopolyDiceID");
      this.resetDice("HJWeekMonopolyGoldDiceNum", "HJWeekMonopolyGoldDiceID");
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(51);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_GOLD_WEEK);
      ActGoldWeekTaskPart taskPart = (ActGoldWeekTaskPart)this.player.getMgrPart(ActGoldWeekTaskPart.class);
      taskPart.trigger();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_24001(ActGoldWeekMsg.C2S_ActivityInfo_24001 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ActGoldWeekMsg.S2C_ActivityInfo_24002.Builder builder = ActGoldWeekMsg.S2C_ActivityInfo_24002.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActGoldWeekDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_24003(ActGoldWeekMsg.C2S_ShopAddUpInfo_24003 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_24005(ActGoldWeekMsg.C2S_ReceiveShopAddUpReward_24005 msg, String source) {
      int id = msg.getId();
      ActGoldWeekDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         GoldWeekShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 14002, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.Builder builder = ActGoldWeekMsg.S2C_ShopAddUpInfo_24004.newBuilder();
      ActGoldWeekDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActGoldWeekDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, GoldWeekShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            GoldWeekShopAddUpModel model = (GoldWeekShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActGoldWeekDao dao = this.getDao();
      Map<Integer, GoldWeekShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(GoldWeekShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_GOLD_WEEK_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 14002);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      GoldWeekShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActGoldWeekDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public GoldWeekShopAddUpModel getShopAddUpModel(int id) {
      GoldWeekShopAddUpModel model = (GoldWeekShopAddUpModel)this.player.getGameModelPool().getEntity("HJWeekShopAddup", id);
      return model;
   }

   public Map<Integer, GoldWeekShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, GoldWeekShopAddUpModel> modelMap = new HashMap();
      Map<Integer, GoldWeekShopAddUpModel> allModel = this.player.getGameModelPool().getMap("HJWeekShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, GoldWeekShopAddUpModel> entry : allModel.entrySet()) {
            GoldWeekShopAddUpModel model = (GoldWeekShopAddUpModel)entry.getValue();
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
   public void C2S_SignTotalInfo_24006(ActGoldWeekMsg.C2S_SignTotalInfo_24006 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ActGoldWeekMsg.S2C_SignTotalInfo_24007.Builder builder = ActGoldWeekMsg.S2C_SignTotalInfo_24007.newBuilder();
      ActGoldWeekDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      GoldWeekSignAwardModel model = (GoldWeekSignAwardModel)this.player.getGameModelPool().getEntity("HJWeekSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActGoldWeekDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_24008(ActGoldWeekMsg.C2S_Sign_24008 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         ActGoldWeekDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         GoldWeekSignAwardModel model = (GoldWeekSignAwardModel)this.player.getGameModelPool().getEntity("HJWeekSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 14003, 0, 0, "");
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActGoldWeekDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   public void drawEnd() {
      ActGoldWeekDao dao = this.getDao();
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
      ActGoldWeekDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_24013(ActGoldWeekMsg.C2S_FancyReward_24013 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActGoldWeekDao dao = this.getDao();
         GoldWeekLotteryItemModel lotteryItemModel = (GoldWeekLotteryItemModel)this.player.getGameModelPool().getEntity("HJWeekLotteryItem", msg.getTargetId());
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
                  ActGoldWeekMsg.S2C_FancyReward_24014.Builder builder = ActGoldWeekMsg.S2C_FancyReward_24014.newBuilder();
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
      Map<Integer, GoldWeekLotteryItemModel> allMap = this.player.getGameModelPool().getMap("HJWeekLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(GoldWeekLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_24017(ActGoldWeekMsg.C2S_Draw_24017 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         GoldWeekLotteryCostModel costModel = (GoldWeekLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("HJWeekLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = ApplicationContextProvider.getConfigInt("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(53, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActGoldWeekDao dao = this.getDao();
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
                     Map<Integer, GoldWeekLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        GoldWeekLotteryItemModel enjoyModel = (GoldWeekLotteryItemModel)this.player.getGameModelPool().getEntity("HJWeekLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           GoldWeekLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ActGoldWeekDao.RecordInfo recordInfo = new ActGoldWeekDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 14005, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_GOLD_WEEK_DRAW, this.getActivityLogModule(), 14004, 0, 0, "");
                        playerResetCustomCache.addDailyReset(53, lotteryNum);
                        ActGoldWeekMsg.S2C_Draw_24018.Builder builder = ActGoldWeekMsg.S2C_Draw_24018.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(53, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "黄金周-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, GoldWeekLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, GoldWeekLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("HJWeekLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, GoldWeekLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, GoldWeekLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((GoldWeekLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((GoldWeekLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((GoldWeekLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((GoldWeekLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((GoldWeekLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((GoldWeekLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private GoldWeekLotteryItemModel smashEgg(ActGoldWeekDao dao, Map<Integer, GoldWeekLotteryItemModel> itemModelMap) {
      Map<Integer, GoldWeekLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(GoldWeekLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(GoldWeekLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_24015(ActGoldWeekMsg.C2S_LuckDrawInfo_24015 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActGoldWeekDao dao = this.getDao();
      ActGoldWeekMsg.S2C_LuckDrawInfo_24016.Builder builder = ActGoldWeekMsg.S2C_LuckDrawInfo_24016.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(53, 0);
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

   public List<GoldWeekLotteryItemModel> getDrawJackpot() {
      List<GoldWeekLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, GoldWeekLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, GoldWeekLotteryItemModel>>getModelPoolMap("customHJWeekLotteryItem");
      TreeMap<Integer, Map<Integer, GoldWeekLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, GoldWeekLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(GoldWeekLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<GoldWeekLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("黄金周活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         GoldWeekLotteryItemModel model = (GoldWeekLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(GoldWeekLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadGoldWeekRecord_4259.Builder builder = CrossMsg.S2CR_UploadGoldWeekRecord_4259.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_24019(ActGoldWeekMsg.C2S_OpenReward_24019 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         GoldWeekAddUpReturnModel awardModel = (GoldWeekAddUpReturnModel)ApplicationContextProvider.getModelPoolEntity("HJWeekAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActGoldWeekDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("黄金周活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("黄金周活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 14006, 0, 0, "");
                  ActGoldWeekMsg.S2C_OpenReward_24020.Builder builder = ActGoldWeekMsg.S2C_OpenReward_24020.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("黄金周活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_24021(ActGoldWeekMsg.C2S_DrawRecord_24021 msg, String source) {
      ActGoldWeekMsg.S2C_DrawRecord_24022.Builder builder = ActGoldWeekMsg.S2C_DrawRecord_24022.newBuilder();
      ActGoldWeekDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ActGoldWeekMsg.MyDrawRecord.Builder drawRecord = ActGoldWeekMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_24023(ActGoldWeekMsg.C2S_ServerDrawRecord_24023 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      GoldWeekLotteryItemModel model = (GoldWeekLotteryItemModel)this.player.getGameModelPool().getEntity("HJWeekLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, GoldWeekLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               GoldWeekLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private GoldWeekLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, GoldWeekLotteryItemModel> itemModelMap) {
      Map<Integer, GoldWeekLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(GoldWeekLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     ActGoldWeekDao dao = this.getDao();
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

         for(GoldWeekLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_GameMain_17201(ActGoldWeekMsg.C2S_GameMain_24031 msg, String source) {
      this.sendGameMain();
   }

   @MsgHandlerAnno
   public void C2S_GameRollDice_24033(ActGoldWeekMsg.C2S_GameRollDice_24033 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActGoldWeekDao dao = this.getDao();
         if (dao.event.eventId > 0) {
            GoldWeekMonopolyEventModel goldWeekMonopolyEventModel = (GoldWeekMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyEvent", dao.event.eventId);
            if (goldWeekMonopolyEventModel != null && goldWeekMonopolyEventModel.getEventType() == 3) {
               this.player.failure(0);
               return;
            }
         }

         String diceItem;
         int num;
         if (msg.getType() == 1) {
            diceItem = "HJWeekMonopolyDiceID";
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

            diceItem = "HJWeekMonopolyGoldDiceID";
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
      ActGoldWeekDao dao = this.getDao();
      List<ResourceModel> rewardList = new ArrayList();
      GoldWeekMonopolyMapModel goldWeekMonopolyMapModel = this.eventMove(num, rewardList);
      ActGoldWeekMsg.S2C_GameRollDice_24034.Builder resp = ActGoldWeekMsg.S2C_GameRollDice_24034.newBuilder();
      resp.setGrid(dao.grid);
      dao.updateOp();
      resp.setType(type);
      resp.setNum(num);
      resp.setDiceRecover(dao.diceRecover);
      if (goldWeekMonopolyMapModel != null) {
         ActGoldWeekMsg.GameEvent.Builder builder = this.triggerEvent(goldWeekMonopolyMapModel.getEventId(), rewardList);
         if (builder != null) {
            GoldWeekMonopolyEventModel goldWeekMonopolyEventModel = (GoldWeekMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyEvent", builder.getEventId());
            if (goldWeekMonopolyEventModel.getEventType() == 1) {
               resp.setBuilding(((GoldWeekCityBuildData)dao.building.get(builder.getEventParam(0))).buildMsg());
            } else if (goldWeekMonopolyEventModel.getEventType() != 2) {
               resp.setEvent(builder);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_GOLD_WEEK_ACTIVITY_CITY_GAME, 140, 14008, num, dao.grid, "");
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_GameAddRandomDice_24035(ActGoldWeekMsg.C2S_GameAddRandomDice_24035 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ActGoldWeekDao dao = this.getDao();
         ActGoldWeekMsg.S2C_GameAddRandomDice_24036.Builder resp = ActGoldWeekMsg.S2C_GameAddRandomDice_24036.newBuilder();
         resp.setDiceRecover(dao.diceRecover);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameGoldDiceBuy_24037(ActGoldWeekMsg.C2S_GameGoldDiceBuy_24037 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActGoldWeekDao dao = this.getDao();
         String feeStr = ApplicationContextProvider.getConfigString("HJWeekMonopolyGoldDicePrice", "");
         List<ResourceModel> buyFeeList = ResourceModel.buildResources(feeStr);
         if (dao.buyGoldDiceNum >= buyFeeList.size()) {
            this.player.failure(25);
         } else {
            ResourceModel feeGold = (ResourceModel)buyFeeList.get(dao.buyGoldDiceNum);
            if (!this.player.checkResourceNum(feeGold)) {
               this.player.failure(31);
            } else {
               this.player.delResource(feeGold, 140, 14007, 0, 0, "");
               ++dao.buyGoldDiceNum;
               dao.updateOp();
               this.addDice("HJWeekMonopolyGoldDiceID", 14007, 1);
               ActGoldWeekMsg.S2C_GameGoldDiceBuy_24038.Builder resp = ActGoldWeekMsg.S2C_GameGoldDiceBuy_24038.newBuilder();
               resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameEvent_24039(ActGoldWeekMsg.C2S_GameEvent_24039 msg, String source) {
      if (!msg.hasEvent()) {
         this.player.failure(0);
      } else if (this.isServerActivityInvalid()) {
         this.player.failure(0);
      } else {
         ActGoldWeekDao dao = this.getDao();
         GoldWeekMonopolyEventModel goldWeekMonopolyEventModel = (GoldWeekMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyEvent", msg.getEvent().getEventId());
         if (goldWeekMonopolyEventModel == null) {
            this.player.sendMsg(this.eventHandleDone(msg.getEvent(), dao.grid).build());
         } else {
            List<ResourceModel> rewardList = new ArrayList();
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            if (goldWeekMonopolyEventModel.getEventType() == 3) {
               ActGoldWeekMsg.S2C_GameEvent_24040.Builder resp = this.eventHandleDone(msg.getEvent(), dao.grid);
               GoldWeekMonopolyMapModel goldWeekMonopolyMapModel = (GoldWeekMonopolyMapModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyMap", dao.grid);
               if (goldWeekMonopolyMapModel != null) {
                  ActGoldWeekMsg.GameEvent.Builder nextEvent = this.triggerEvent(goldWeekMonopolyMapModel.getEventId(), rewardList);
                  if (nextEvent != null) {
                     GoldWeekMonopolyEventModel nextGameEventModel = (GoldWeekMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyEvent", nextEvent.getEventId());
                     if (nextGameEventModel.getEventType() == 1) {
                        resp.setBuilding(((GoldWeekCityBuildData)dao.building.get(nextEvent.getEventParam(0))).buildMsg());
                     } else if (nextGameEventModel.getEventType() != 2) {
                        resp.setNextEvent(nextEvent);
                     }
                  }
               }

               this.player.sendMsg(resp.build());
               showType = PlayerMsg.ShowType.SHOW_GOLD_WEEK_ACTIVITY_CITY_GAME;
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
               this.player.addResource(rewardList, showType, 140, 14012, msg.getEvent().getEventId(), 0, "");
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTask_24041(ActGoldWeekMsg.C2S_GameTask_24041 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActGoldWeekTaskPart actGoldWeekTaskPart = (ActGoldWeekTaskPart)this.player.getMgrPart(ActGoldWeekTaskPart.class);
         actGoldWeekTaskPart.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTaskCommit_24043(ActGoldWeekMsg.C2S_GameTaskCommit_24043 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActGoldWeekTaskPart actGoldWeekTaskPart = (ActGoldWeekTaskPart)this.player.getMgrPart(ActGoldWeekTaskPart.class);
         actGoldWeekTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameBuildingReward_24047(ActGoldWeekMsg.C2S_GameBuildingReward_24047 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>>getModelPoolMap("cusTomHJWeekMonopolyBuild");
         if (!buildingMap.containsKey(msg.getBuildingId())) {
            this.player.failure(0);
         } else {
            TreeMap<Integer, GoldWeekMonopolyBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(msg.getBuildingId());
            if (!curBuildModelMap.containsKey(msg.getLv())) {
               this.player.failure(0);
            } else {
               ActGoldWeekDao dao = this.getDao();
               if (!dao.building.containsKey(msg.getBuildingId())) {
                  this.player.failure(0);
               } else {
                  GoldWeekCityBuildData goldWeekCityBuildData = (GoldWeekCityBuildData)dao.building.get(msg.getBuildingId());
                  if (goldWeekCityBuildData.lv < msg.getLv()) {
                     this.player.failure(0);
                  } else if (goldWeekCityBuildData.rewardLv.contains(msg.getLv())) {
                     this.player.failure(24);
                  } else {
                     goldWeekCityBuildData.rewardLv.add(msg.getLv());
                     dao.updateOp();
                     GoldWeekMonopolyBuildModel goldWeekMonopolyBuildModel = (GoldWeekMonopolyBuildModel)curBuildModelMap.get(msg.getLv());
                     this.player.addResource(goldWeekMonopolyBuildModel.getRoundRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 140, 14014, msg.getBuildingId(), msg.getLv(), "");
                     ActGoldWeekMsg.S2C_GameBuildingReward_24048.Builder resp = ActGoldWeekMsg.S2C_GameBuildingReward_24048.newBuilder();
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
         ActGoldWeekDao dao = this.getDao();
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int maxCount = ApplicationContextProvider.getConfigInt("HJWeekMonopolyDiceUpLimit", 0);
         int recoverTime = ApplicationContextProvider.getConfigInt("HJWeekMonopolyDiceTime", 10800);
         int diceNum = this.getDiceNum("HJWeekMonopolyDiceID");
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
               this.addDice("HJWeekMonopolyDiceID", 14013, addNum);
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
         int maxCount = ApplicationContextProvider.getConfigInt("HJWeekMonopolyDiceUpLimit", 0);
         int diceNum = this.getDiceNum("HJWeekMonopolyDiceID");
         ActGoldWeekDao dao = this.getDao();
         if (diceNum >= maxCount && dao.diceRecover > 0) {
            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (dao.diceRecover > curTime) {
               dao.diceMaxRecover = dao.diceRecover - curTime;
            } else {
               dao.diceMaxRecover = 0;
            }

            dao.diceRecover = 0;
            dao.updateOp();
            ActGoldWeekMsg.S2C_GameAddRandomDice_24036.Builder resp = ActGoldWeekMsg.S2C_GameAddRandomDice_24036.newBuilder();
            resp.setDiceRecover(dao.diceRecover);
            this.player.sendMsg(resp.build());
         }

      }
   }

   public void updateGameRank(int num) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.drop > DateUtil.getIntTime(System.currentTimeMillis())) {
            ActGoldWeekDao dao = this.getDao();
            dao.point += num;
            dao.updateOp();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_GOLD_WEEK, (long)dao.point, false);
         }
      }
   }

   private void resetDice(String initNumConfig, String itemConfig) {
      int initDiceNum = ApplicationContextProvider.getConfigInt(initNumConfig, 0);
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      int curNum = (int)this.player.getResourceNum(2, diceItem);
      if (curNum > initDiceNum) {
         this.player.delResource(2, diceItem, (long)(curNum - initDiceNum), 140, 14011, 0, 0, "");
      } else if (curNum < initDiceNum) {
         this.player.addResource(2, diceItem, initDiceNum - curNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 140, 14011, 0, 0, "");
      }

   }

   private int getDiceNum(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      return (int)this.player.getResourceNum(2, diceItem);
   }

   private void useDice(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.delResource(2, diceItem, 1L, 140, 14008, 0, 0, "");
   }

   private void addDice(String itemConfig, int reason, int num) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.addResource(2, diceItem, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 140, reason, 0, 0, "");
   }

   private ActGoldWeekMsg.GameEvent.Builder triggerEvent(int eventId, List<ResourceModel> rewardList) {
      if (eventId <= 0) {
         return null;
      } else {
         Map<Integer, TreeMap<Integer, GoldWeekMonopolyEventModel>> eventMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GoldWeekMonopolyEventModel>>getModelPoolMap("customHJWeekMonopolyEvent");
         GoldWeekMonopolyEventModel goldWeekMonopolyEventModel;
         if (eventId == 301) {
            List<GoldWeekMonopolyEventModel> luckyEvents = new ArrayList(((TreeMap)eventMap.get(eventId)).values());
            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < luckyEvents.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((GoldWeekMonopolyEventModel)luckyEvents.get(index)).getRandOdd()));
            }

            WeightRandom<Integer> weightRandom = cn.hutool.core.util.RandomUtil.weightRandom(weightList);
            goldWeekMonopolyEventModel = (GoldWeekMonopolyEventModel)luckyEvents.get((Integer)weightRandom.next());
         } else {
            goldWeekMonopolyEventModel = (GoldWeekMonopolyEventModel)((TreeMap)eventMap.get(eventId)).firstEntry().getValue();
         }

         this.logger.info("触发事件【{}】", goldWeekMonopolyEventModel.getId());
         ActGoldWeekDao dao = this.getDao();
         ActGoldWeekMsg.GameEvent.Builder eventBuilder = null;
         switch (goldWeekMonopolyEventModel.getEventType()) {
            case 1:
            case 2:
               eventBuilder = this.eventHandle(goldWeekMonopolyEventModel.getId(), goldWeekMonopolyEventModel.getParam(), rewardList);
               break;
            case 3:
               int moveNum = cn.hutool.core.util.RandomUtil.randomInt((Integer)goldWeekMonopolyEventModel.getParam().get(0), (Integer)goldWeekMonopolyEventModel.getParam().get(1) + 1);
               List<Integer> paramList = new ArrayList();
               paramList.add(moveNum);
               eventBuilder = this.eventHandle(goldWeekMonopolyEventModel.getId(), paramList, rewardList);
               break;
            case 4:
            case 6:
               dao.event.eventId = goldWeekMonopolyEventModel.getId();
               dao.event.eventParams.clear();
               eventBuilder = ActGoldWeekMsg.GameEvent.newBuilder().setEventId(dao.event.eventId);
               break;
            case 5:
               dao.event.eventId = goldWeekMonopolyEventModel.getId();
               dao.event.eventParams.clear();
               Map<Integer, GoldWeekMonopolyRandomShopModel> goldWeekMonopolyRandomShopModelMap = ApplicationContextProvider.<Integer, GoldWeekMonopolyRandomShopModel>getModelPoolMap("HJWeekMonopolyRandomShop");
               List<Integer> randomShopIds = new ArrayList(goldWeekMonopolyRandomShopModelMap.keySet());
               Collections.shuffle(randomShopIds);
               dao.event.eventParams.addAll(randomShopIds.subList(0, (Integer)goldWeekMonopolyEventModel.getParam().get(0)));
               eventBuilder = ActGoldWeekMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams);
         }

         dao.updateOp();
         this.player.triggerTask(667, eventId, 1L, 1);
         return eventBuilder;
      }
   }

   private ActGoldWeekMsg.GameEvent.Builder eventHandle(int eventId, List<Integer> eventParams, List<ResourceModel> rewardList) {
      ActGoldWeekMsg.GameEvent.Builder builder = ActGoldWeekMsg.GameEvent.newBuilder();
      builder.setEventId(eventId);
      GoldWeekMonopolyEventModel goldWeekMonopolyEventModel = (GoldWeekMonopolyEventModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyEvent", eventId);
      if (goldWeekMonopolyEventModel == null) {
         return builder;
      } else {
         switch (goldWeekMonopolyEventModel.getEventType()) {
            case 1:
               this.eventBuildUpgrade(goldWeekMonopolyEventModel, rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 2:
               for(ResourceModel reward : goldWeekMonopolyEventModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }
               break;
            case 3:
               this.eventMove((Integer)eventParams.get(0), rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 4:
               if ((Integer)eventParams.get(0) > 0) {
                  this.eventBattle(goldWeekMonopolyEventModel.getId());
               }
               break;
            case 5:
               if ((Integer)eventParams.get(0) > 0 && !this.eventBuy(goldWeekMonopolyEventModel.getId(), rewardList)) {
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
         ActGoldWeekDao dao = this.getDao();
         ActGoldWeekMsg.S2C_GameMain_24032.Builder resp = ActGoldWeekMsg.S2C_GameMain_24032.newBuilder();
         resp.setGrid(dao.grid);
         resp.setDiceRecover(dao.diceRecover);
         resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
         Map<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>>getModelPoolMap("cusTomHJWeekMonopolyBuild");

         for(int buildId : buildingMap.keySet()) {
            GoldWeekCityBuildData goldWeekCityBuildData = (GoldWeekCityBuildData)dao.building.get(buildId);
            if (goldWeekCityBuildData != null) {
               resp.addBuilding(goldWeekCityBuildData.buildMsg());
            } else {
               resp.addBuilding(ActGoldWeekMsg.GameBuilding.newBuilder().setBuildId(buildId).setLv(0));
            }
         }

         if (dao.event.eventId > 0) {
            resp.setEvent(ActGoldWeekMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams));
         }

         this.player.sendMsg(resp.build());
      }
   }

   private ActGoldWeekMsg.S2C_GameEvent_24040.Builder eventHandleDone(ActGoldWeekMsg.GameEvent gameEvent, int grid) {
      ActGoldWeekMsg.S2C_GameEvent_24040.Builder resp = ActGoldWeekMsg.S2C_GameEvent_24040.newBuilder();
      resp.setEvent(gameEvent);
      resp.setGrid(grid);
      return resp;
   }

   private void eventBuildUpgrade(GoldWeekMonopolyEventModel goldWeekMonopolyEventModel, List<ResourceModel> rewardList) {
      int buildId = (Integer)goldWeekMonopolyEventModel.getParam().get(0);
      Map<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>>getModelPoolMap("cusTomHJWeekMonopolyBuild");
      if (!buildingMap.containsKey(buildId)) {
         this.logger.error("玩家【{}】升级建筑【{}】失败,建筑配置不存在", this.player.getPlayerId(), buildId);
      } else {
         ActGoldWeekDao dao = this.getDao();
         TreeMap<Integer, GoldWeekMonopolyBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(buildId);
         GoldWeekCityBuildData goldWeekCityBuildData = (GoldWeekCityBuildData)dao.building.get(buildId);
         if (goldWeekCityBuildData == null) {
            goldWeekCityBuildData = new GoldWeekCityBuildData();
            goldWeekCityBuildData.buildId = buildId;
         }

         if (goldWeekCityBuildData.lv >= (Integer)curBuildModelMap.lastKey()) {
            GoldWeekMonopolyBuildModel goldWeekMonopolyBuildModel = (GoldWeekMonopolyBuildModel)curBuildModelMap.get(goldWeekCityBuildData.lv);

            for(ResourceModel reward : goldWeekMonopolyBuildModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }

         } else if (!curBuildModelMap.containsKey(goldWeekCityBuildData.lv + 1)) {
            this.logger.error("玩家【{}】升级建筑【{}】失败,等级【{}】配置不存在", new Object[]{this.player.getPlayerId(), buildId, goldWeekCityBuildData.lv + 1});
         } else {
            ++goldWeekCityBuildData.lv;
            dao.building.put(buildId, goldWeekCityBuildData);
            dao.updateOp();
            GoldWeekMonopolyBuildModel goldWeekMonopolyBuildModel = (GoldWeekMonopolyBuildModel)curBuildModelMap.get(goldWeekCityBuildData.lv);

            for(ResourceModel reward : goldWeekMonopolyBuildModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }

            this.player.triggerTask(668, buildId, (long)goldWeekCityBuildData.lv, 0);
         }
      }
   }

   private GoldWeekMonopolyMapModel eventMove(int num, List<ResourceModel> rewardList) {
      if (num <= 6 && num >= -6) {
         Map<Integer, GoldWeekMonopolyMapModel> monopolyMapModel = ApplicationContextProvider.<Integer, GoldWeekMonopolyMapModel>getModelPoolMap("HJWeekMonopolyMap");
         if (monopolyMapModel != null && !monopolyMapModel.isEmpty()) {
            ActGoldWeekDao dao = this.getDao();
            int curGrid = dao.grid + num;
            if (curGrid < 0) {
               curGrid += monopolyMapModel.size();
            } else if (curGrid > monopolyMapModel.size()) {
               curGrid -= monopolyMapModel.size();
               Map<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, GoldWeekMonopolyBuildModel>>getModelPoolMap("cusTomHJWeekMonopolyBuild");

               for(GoldWeekCityBuildData goldWeekCityBuildData : dao.building.values()) {
                  if (buildingMap.containsKey(goldWeekCityBuildData.buildId)) {
                     TreeMap<Integer, GoldWeekMonopolyBuildModel> curBuildModelMap = (TreeMap)buildingMap.get(goldWeekCityBuildData.buildId);
                     if (curBuildModelMap.containsKey(goldWeekCityBuildData.lv)) {
                        GoldWeekMonopolyBuildModel goldWeekMonopolyBuildModel = (GoldWeekMonopolyBuildModel)curBuildModelMap.get(goldWeekCityBuildData.lv);

                        for(ResourceModel roundReward : goldWeekMonopolyBuildModel.getRoundRewards()) {
                           roundReward.addResourceToList(rewardList);
                        }
                     }
                  }
               }
            }

            GoldWeekMonopolyMapModel goldWeekMonopolyMapModel = (GoldWeekMonopolyMapModel)monopolyMapModel.get(curGrid);
            if (goldWeekMonopolyMapModel == null) {
               return null;
            } else {
               dao.grid = curGrid;
               dao.updateOp();
               return goldWeekMonopolyMapModel;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void eventBattle(int eventId) {
      Map<Integer, GoldWeekMonopolyBattleModel> greatCityGameBattleModelMap = ApplicationContextProvider.<Integer, GoldWeekMonopolyBattleModel>getModelPoolMap("HJWeekMonopolyBattle");
      if (greatCityGameBattleModelMap != null && !greatCityGameBattleModelMap.isEmpty()) {
         TreeSet<Integer> greatCityGameBattleIds = new TreeSet(greatCityGameBattleModelMap.keySet());
         GoldWeekMonopolyBattleModel matchModel = null;

         for(int id : greatCityGameBattleIds) {
            GoldWeekMonopolyBattleModel goldWeekMonopolyBattleModel = (GoldWeekMonopolyBattleModel)greatCityGameBattleModelMap.get(id);
            if (this.player.getMaxPlayerCombatPower() >= (long)goldWeekMonopolyBattleModel.getPowerStart() && this.player.getMaxPlayerCombatPower() <= (long)goldWeekMonopolyBattleModel.getPowerEnd()) {
               matchModel = goldWeekMonopolyBattleModel;
               break;
            }
         }

         if (matchModel == null) {
            matchModel = (GoldWeekMonopolyBattleModel)greatCityGameBattleModelMap.get(greatCityGameBattleIds.last());
         }

         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         BattleMsg.C2S_BattleBegin_6107.Builder builder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
         builder.setModelId(matchModel.getId());
         builder.setType(6435);
         builder.addParams(eventId);
         battlePart.begin(builder.build(), "");
      }
   }

   public int enterBattle(BattleDao battleDao) {
      GoldWeekMonopolyBattleModel goldWeekMonopolyBattleModel = (GoldWeekMonopolyBattleModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyBattle", battleDao.modelId);
      BattlePKTeam rightTeam = new BattlePKTeam(goldWeekMonopolyBattleModel.getBattleId());
      battleDao.scene.addPKTeam((byte)1, rightTeam);
      battleDao.scene.setMaxRound((byte)goldWeekMonopolyBattleModel.getRound());
      battleDao.scene.setBattleId(goldWeekMonopolyBattleModel.getBattleId());
      return 1;
   }

   public void afterBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         GoldWeekMonopolyBattleModel goldWeekMonopolyBattleModel = (GoldWeekMonopolyBattleModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyBattle", battleDao.modelId);
         battleDao.rewards.addAll(goldWeekMonopolyBattleModel.getRewards());
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
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 140, 14012, (Integer)battleDao.params.get(0), battleDao.modelId, "");
      }
   }

   private boolean eventBuy(int eventId, List<ResourceModel> rewardList) {
      ActGoldWeekDao dao = this.getDao();
      List<ResourceModel> feeResourceList = new ArrayList();

      for(int eventParam : dao.event.eventParams) {
         GoldWeekMonopolyRandomShopModel greatCityGameRandomShopModel = (GoldWeekMonopolyRandomShopModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyRandomShop", eventParam);
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
         this.player.delResource((List)feeResourceList, 140, 14012, eventId, 0, "");
         return true;
      }
   }

   private void eventGrant(int grantIndex, List<ResourceModel> rewardList) {
      Map<Integer, GoldWeekMonopolyChooseModel> goldWeekMonopolyChooseModelMap = ApplicationContextProvider.<Integer, GoldWeekMonopolyChooseModel>getModelPoolMap("HJWeekMonopolyChoose");
      if (goldWeekMonopolyChooseModelMap != null && !goldWeekMonopolyChooseModelMap.isEmpty()) {
         List<GoldWeekMonopolyChooseModel> goldWeekMonopolyChooseModels = new ArrayList(goldWeekMonopolyChooseModelMap.values());
         Collections.shuffle(goldWeekMonopolyChooseModels);
         ResourceModel rewardModel = (ResourceModel)((GoldWeekMonopolyChooseModel)goldWeekMonopolyChooseModels.get(0)).getRewards().get(grantIndex);
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
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_GOLD_WEEK_ACTIVITY_CITY_GAME, 140, 14008, eventId, 0, "");
            }
            break;
         case "rolldice":
            this.rollDice(2, Integer.parseInt(split[1]));
      }

      this.sendGameMain();
   }
}
