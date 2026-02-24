package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.ChineseNewYearDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.ChineseNewYearCityBuildData;
import com.gzbz.db.bean.ChineseNewYearCityChallengeData;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.SubjectData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ChineseNewYearAddUpReturnModel;
import com.gzbz.model.ChineseNewYearBattleModel;
import com.gzbz.model.ChineseNewYearEventModel;
import com.gzbz.model.ChineseNewYearGridModel;
import com.gzbz.model.ChineseNewYearLevelTaskModel;
import com.gzbz.model.ChineseNewYearLotteryCostModel;
import com.gzbz.model.ChineseNewYearLotteryItemModel;
import com.gzbz.model.ChineseNewYearMakeUpModel;
import com.gzbz.model.ChineseNewYearSelectRewardModel;
import com.gzbz.model.ChineseNewYearShopAddUpModel;
import com.gzbz.model.ChineseNewYearShopModel;
import com.gzbz.model.ChineseNewYearSignAwardModel;
import com.gzbz.model.ChineseNewYearSiteModel;
import com.gzbz.model.ChineseNewYearSubjectModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.ChineseNewYearMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ChineseNewYearMonopolyTaskPart;
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
import java.util.concurrent.ConcurrentHashMap;
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
public class ActivityChineseNewYearPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   ConfigManager configManager;

   public ChineseNewYearDao getDao() {
      return (ChineseNewYearDao)this.player.getData("tb_activity_chinese_new_year", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 131;
   }

   public int getAddUpLogReason() {
      return 13001;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_CHINESE_NEW_YEAR_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "ChunJieAddupRecharge";
   }

   public int getConLogReason() {
      return 13021;
   }

   public int getConMail() {
      return CentreAwardModel.TYPE_CHINESE_NEW_YEAR_CON_RECHARGE;
   }

   public String getConExcelName() {
      return "ChunJieBlessing";
   }

   public int getActivityType() {
      return 94;
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
         ChineseNewYearDao dao = this.getDao();
         dao.buyGoldDiceNum = 0;
         dao.updateOp();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
         ChineseNewYearMonopolyTaskPart chineseNewYearMonopolyTaskPart = (ChineseNewYearMonopolyTaskPart)this.player.getMgrPart(ChineseNewYearMonopolyTaskPart.class);
         chineseNewYearMonopolyTaskPart.clearDailyTask();
         chineseNewYearMonopolyTaskPart.trigger();
         this.gameCityDailyReset();
         this.sendGameMain();
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
      ChineseNewYearMonopolyTaskPart chineseNewYearMonopolyTaskPart = (ChineseNewYearMonopolyTaskPart)this.player.getMgrPart(ChineseNewYearMonopolyTaskPart.class);

      for(TaskData taskData : chineseNewYearMonopolyTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      this.clearActTreasure();
   }

   public void rotateReset(int oldActivityId) {
      ChineseNewYearDao dao = this.getDao();
      dao.lotteryStage = this.getSmashEggStage();
      dao.updateOp();
      this.signEnd();
      this.drawEnd();
      this.shopAddUpReset();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(47);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_CHINESE_NEW_YEAR);
      ChineseNewYearMonopolyTaskPart taskPart = (ChineseNewYearMonopolyTaskPart)this.player.getMgrPart(ChineseNewYearMonopolyTaskPart.class);
      taskPart.trigger();
      this.clearActivityGift(24);
      dao.lotteryStage = this.getSmashEggStage();
      dao.updateOp();
      dao.building.clear();
      dao.buyGoldDiceNum = 0;
      dao.diceRecover = 0;
      dao.diceMaxRecover = 0;
      Map<Integer, ChineseNewYearGridModel> chineseNewYearGridModelMap = ApplicationContextProvider.<Integer, ChineseNewYearGridModel>getModelPoolMap("ChunJieGrid");
      TreeSet<Integer> gridIds = new TreeSet(chineseNewYearGridModelMap.keySet());
      dao.grid = (Integer)gridIds.first();
      dao.point = 0;
      dao.makeUpReceiveIds.clear();
      dao.pointLv = 0;
      dao.challengeData = null;
      dao.onHookSecond = 0L;
      dao.updateOp();
      int pointId = ApplicationContextProvider.getConfigInt("ChunJieBoomPoint", 6881);
      this.player.delResourceAllNum(2, pointId, this.getActivityLogModule(), 13011, 0, 0, "");
      int woodItemId = ApplicationContextProvider.getConfigInt("DFWmucai", 6968);
      this.player.delResourceAllNum(2, woodItemId, this.getActivityLogModule(), 13011, 0, 0, "");
      this.resetDice("ChunJieDiceNum", "ChunJieDiceID");
      this.resetDice("ChunJieGoldDiceNum", "ChunJieGoldDiceID");
      this.clearActTreasure();
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_22801(ChineseNewYearMsg.C2S_ActivityInfo_22801 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ChineseNewYearMsg.S2C_ActivityInfo_22802.Builder builder = ChineseNewYearMsg.S2C_ActivityInfo_22802.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ChineseNewYearDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_22803(ChineseNewYearMsg.C2S_ShopAddUpInfo_22803 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_22805(ChineseNewYearMsg.C2S_ReceiveShopAddUpReward_22805 msg, String source) {
      int id = msg.getId();
      ChineseNewYearDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         ChineseNewYearShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13002, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ChineseNewYearMsg.S2C_ShopAddUpInfo_22804.Builder builder = ChineseNewYearMsg.S2C_ShopAddUpInfo_22804.newBuilder();
      ChineseNewYearDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ChineseNewYearDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, ChineseNewYearShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            ChineseNewYearShopAddUpModel model = (ChineseNewYearShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ChineseNewYearDao dao = this.getDao();
      Map<Integer, ChineseNewYearShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(ChineseNewYearShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_CHINESE_NEW_YEAR_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 13002);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      ChineseNewYearShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ChineseNewYearDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public ChineseNewYearShopAddUpModel getShopAddUpModel(int id) {
      return (ChineseNewYearShopAddUpModel)this.player.getGameModelPool().getEntity("ChunJieShopAddup", id);
   }

   public Map<Integer, ChineseNewYearShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, ChineseNewYearShopAddUpModel> modelMap = new HashMap();
      Map<Integer, ChineseNewYearShopAddUpModel> allModel = this.player.getGameModelPool().getMap("ChunJieShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, ChineseNewYearShopAddUpModel> entry : allModel.entrySet()) {
            ChineseNewYearShopAddUpModel model = (ChineseNewYearShopAddUpModel)entry.getValue();
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
   public void C2S_SignTotalInfo_22806(ChineseNewYearMsg.C2S_SignTotalInfo_22806 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ChineseNewYearMsg.S2C_SignTotalInfo_22807.Builder builder = ChineseNewYearMsg.S2C_SignTotalInfo_22807.newBuilder();
      ChineseNewYearDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      ChineseNewYearSignAwardModel model = (ChineseNewYearSignAwardModel)this.player.getGameModelPool().getEntity("ChunJieSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ChineseNewYearDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_22808(ChineseNewYearMsg.C2S_Sign_22808 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         ChineseNewYearDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         ChineseNewYearSignAwardModel model = (ChineseNewYearSignAwardModel)this.player.getGameModelPool().getEntity("ChunJieSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13003, 0, 0, "");
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ChineseNewYearDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   public void drawEnd() {
      ChineseNewYearDao dao = this.getDao();
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
      ChineseNewYearDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_22813(ChineseNewYearMsg.C2S_FancyReward_22813 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ChineseNewYearDao dao = this.getDao();
         ChineseNewYearLotteryItemModel lotteryItemModel = (ChineseNewYearLotteryItemModel)this.player.getGameModelPool().getEntity("ChunJieLotteryItem", msg.getTargetId());
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
                  ChineseNewYearMsg.S2C_FancyReward_22814.Builder builder = ChineseNewYearMsg.S2C_FancyReward_22814.newBuilder();
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
      Map<Integer, ChineseNewYearLotteryItemModel> allMap = this.player.getGameModelPool().getMap("ChunJieLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(ChineseNewYearLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_22817(ChineseNewYearMsg.C2S_Draw_22817 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ChineseNewYearLotteryCostModel costModel = (ChineseNewYearLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("ChunJieLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = ApplicationContextProvider.getConfigInt("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(52, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ChineseNewYearDao dao = this.getDao();
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
                     Map<Integer, ChineseNewYearLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        ChineseNewYearLotteryItemModel enjoyModel = (ChineseNewYearLotteryItemModel)this.player.getGameModelPool().getEntity("ChunJieLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           ChineseNewYearLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ChineseNewYearDao.RecordInfo recordInfo = new ChineseNewYearDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 13005, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_CHINESE_NEW_YEAR_ACTIVITY, this.getActivityLogModule(), 13004, 0, 0, "");
                        playerResetCustomCache.addDailyReset(52, lotteryNum);
                        ChineseNewYearMsg.S2C_Draw_22818.Builder builder = ChineseNewYearMsg.S2C_Draw_22818.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(52, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "春节庆典-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, ChineseNewYearLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, ChineseNewYearLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("ChunJieLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, ChineseNewYearLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, ChineseNewYearLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((ChineseNewYearLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((ChineseNewYearLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((ChineseNewYearLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((ChineseNewYearLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((ChineseNewYearLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((ChineseNewYearLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private ChineseNewYearLotteryItemModel smashEgg(ChineseNewYearDao dao, Map<Integer, ChineseNewYearLotteryItemModel> itemModelMap) {
      Map<Integer, ChineseNewYearLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(ChineseNewYearLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(ChineseNewYearLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_22815(ChineseNewYearMsg.C2S_LuckDrawInfo_22815 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ChineseNewYearDao dao = this.getDao();
      ChineseNewYearMsg.S2C_LuckDrawInfo_22816.Builder builder = ChineseNewYearMsg.S2C_LuckDrawInfo_22816.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(52, 0);
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

   public List<ChineseNewYearLotteryItemModel> getDrawJackpot() {
      List<ChineseNewYearLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, ChineseNewYearLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, ChineseNewYearLotteryItemModel>>getModelPoolMap("customChunJieLotteryItem");
      TreeMap<Integer, Map<Integer, ChineseNewYearLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, ChineseNewYearLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(ChineseNewYearLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<ChineseNewYearLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("春节庆典活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         ChineseNewYearLotteryItemModel model = (ChineseNewYearLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(ChineseNewYearLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadChineseNewYearRecord_4255.Builder builder = CrossMsg.S2CR_UploadChineseNewYearRecord_4255.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_22819(ChineseNewYearMsg.C2S_OpenReward_22819 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         ChineseNewYearAddUpReturnModel awardModel = (ChineseNewYearAddUpReturnModel)ApplicationContextProvider.getModelPoolEntity("ChunJieAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ChineseNewYearDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("春节庆典活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("春节庆典活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13006, 0, 0, "");
                  ChineseNewYearMsg.S2C_OpenReward_22820.Builder builder = ChineseNewYearMsg.S2C_OpenReward_22820.newBuilder();
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
   public void C2S_DrawRecord_22821(ChineseNewYearMsg.C2S_DrawRecord_22821 msg, String source) {
      ChineseNewYearMsg.S2C_DrawRecord_22822.Builder builder = ChineseNewYearMsg.S2C_DrawRecord_22822.newBuilder();
      ChineseNewYearDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ChineseNewYearMsg.MyDrawRecord.Builder drawRecord = ChineseNewYearMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_22823(ChineseNewYearMsg.C2S_ServerDrawRecord_22823 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      ChineseNewYearLotteryItemModel model = (ChineseNewYearLotteryItemModel)this.player.getGameModelPool().getEntity("ChunJieLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, ChineseNewYearLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               ChineseNewYearLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private ChineseNewYearLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, ChineseNewYearLotteryItemModel> itemModelMap) {
      Map<Integer, ChineseNewYearLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(ChineseNewYearLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     ChineseNewYearDao dao = this.getDao();
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

         for(ChineseNewYearLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   public void gameCityDailyReset() {
      ChineseNewYearDao dao = this.getDao();

      for(Map.Entry<Integer, ChineseNewYearCityBuildData> entry : dao.building.entrySet()) {
         ChineseNewYearCityBuildData value = (ChineseNewYearCityBuildData)entry.getValue();
         value.dailyChallengeNum = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_GameTask_22831(ChineseNewYearMsg.C2S_GameTask_22831 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ChineseNewYearMonopolyTaskPart chineseNewYearMonopolyTaskPart = (ChineseNewYearMonopolyTaskPart)this.player.getMgrPart(ChineseNewYearMonopolyTaskPart.class);
         chineseNewYearMonopolyTaskPart.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTaskCommit_22833(ChineseNewYearMsg.C2S_GameTaskCommit_22833 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ChineseNewYearMonopolyTaskPart chineseNewYearMonopolyTaskPart = (ChineseNewYearMonopolyTaskPart)this.player.getMgrPart(ChineseNewYearMonopolyTaskPart.class);
         chineseNewYearMonopolyTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameMain_22838(ChineseNewYearMsg.C2S_GameMain_22838 msg, String source) {
      this.sendGameMain();
   }

   @MsgHandlerAnno
   public void C2S_GameRollDice_22840(ChineseNewYearMsg.C2S_GameRollDice_22840 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ChineseNewYearDao dao = this.getDao();
         if (dao.event.eventId > 0) {
            ChineseNewYearEventModel chineseNewYearEventModel = (ChineseNewYearEventModel)ApplicationContextProvider.getModelPoolEntity("ChunJieEvent", dao.event.eventId);
            if (chineseNewYearEventModel != null && chineseNewYearEventModel.getEventType() == 3) {
               this.player.failure(0);
               return;
            }
         }

         String diceItem;
         int num;
         if (msg.getType() == 1) {
            diceItem = "ChunJieDiceID";
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

            diceItem = "ChunJieGoldDiceID";
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
      ChineseNewYearDao dao = this.getDao();
      List<ResourceModel> rewardList = new ArrayList();
      ChineseNewYearGridModel chineseNewYearGridModel = this.eventMove(num);
      ChineseNewYearMsg.S2C_GameRollDice_22841.Builder resp = ChineseNewYearMsg.S2C_GameRollDice_22841.newBuilder();
      resp.setGrid(dao.grid);
      dao.updateOp();
      resp.setType(type);
      resp.setNum(num);
      resp.setDiceRecover(dao.diceRecover);
      if (chineseNewYearGridModel != null) {
         ChineseNewYearMsg.GameEvent.Builder builder = this.triggerEvent(chineseNewYearGridModel.getEventId(), chineseNewYearGridModel.getParam(), rewardList);
         if (builder != null) {
            ChineseNewYearEventModel chineseNewYearEventModel = (ChineseNewYearEventModel)ApplicationContextProvider.getModelPoolEntity("ChunJieEvent", builder.getEventId());
            if (chineseNewYearEventModel.getEventType() == 1) {
               resp.setEvent(builder);
               resp.setBuilding(dao.getBuildData(builder.getEventParam(0)).buildMsg());
            } else if (chineseNewYearEventModel.getEventType() != 2) {
               resp.setEvent(builder);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_CHINESE_NEW_YEAR_ACTIVITY_CITY_GAME, this.getActivityLogModule(), 13008, num, dao.grid, "");
      }

      this.player.triggerTask(722, 0, 1L, 1);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_GameAddRandomDice_22842(ChineseNewYearMsg.C2S_GameAddRandomDice_22842 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ChineseNewYearDao dao = this.getDao();
         ChineseNewYearMsg.S2C_GameAddRandomDice_22843.Builder resp = ChineseNewYearMsg.S2C_GameAddRandomDice_22843.newBuilder();
         resp.setDiceRecover(dao.diceRecover);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameGoldDiceBuy_22844(ChineseNewYearMsg.C2S_GameGoldDiceBuy_22844 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ChineseNewYearDao dao = this.getDao();
         String feeStr = ApplicationContextProvider.getConfigString("ChunJieGoldDicePrice", "");
         List<ResourceModel> buyFeeList = ResourceModel.buildResources(feeStr);
         if (dao.buyGoldDiceNum >= buyFeeList.size()) {
            this.player.failure(25);
         } else {
            ResourceModel feeGold = (ResourceModel)buyFeeList.get(dao.buyGoldDiceNum);
            if (!this.player.checkResourceNum(feeGold)) {
               this.player.failure(31);
            } else {
               this.player.delResource(feeGold, this.getActivityLogModule(), 13007, 0, 0, "");
               ++dao.buyGoldDiceNum;
               dao.updateOp();
               this.addDice("ChunJieGoldDiceID", 13007, 1);
               ChineseNewYearMsg.S2C_GameGoldDiceBuy_22845.Builder resp = ChineseNewYearMsg.S2C_GameGoldDiceBuy_22845.newBuilder();
               resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameEvent_22846(ChineseNewYearMsg.C2S_GameEvent_22846 msg, String source) {
      if (!msg.hasEvent()) {
         this.player.failure(0);
      } else if (this.isServerActivityInvalid()) {
         this.player.failure(0);
      } else {
         ChineseNewYearDao dao = this.getDao();
         ChineseNewYearEventModel chineseNewYearEventModel = (ChineseNewYearEventModel)ApplicationContextProvider.getModelPoolEntity("ChunJieEvent", msg.getEvent().getEventId());
         if (chineseNewYearEventModel == null) {
            this.player.sendMsg(this.eventHandleDone(msg.getEvent(), dao.grid).build());
         } else {
            List<ResourceModel> rewardList = new ArrayList();
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            if (chineseNewYearEventModel.getEventType() == 3) {
               ChineseNewYearMsg.S2C_GameEvent_22847.Builder resp = this.eventHandleDone(msg.getEvent(), dao.grid);
               ChineseNewYearGridModel chineseNewYearGridModel = (ChineseNewYearGridModel)ApplicationContextProvider.getModelPoolEntity("ChunJieGrid", dao.grid);
               if (chineseNewYearGridModel != null) {
                  ChineseNewYearMsg.GameEvent.Builder nextEvent = this.triggerEvent(chineseNewYearGridModel.getEventId(), chineseNewYearGridModel.getParam(), rewardList);
                  if (nextEvent != null) {
                     ChineseNewYearEventModel nextGameEventModel = (ChineseNewYearEventModel)ApplicationContextProvider.getModelPoolEntity("ChunJieEvent", nextEvent.getEventId());
                     if (nextGameEventModel.getEventType() == 1) {
                        resp.setNextEvent(nextEvent);
                        resp.setBuilding(dao.getBuildData(nextEvent.getEventParam(0)).buildMsg());
                     } else if (nextGameEventModel.getEventType() != 2) {
                        resp.setNextEvent(nextEvent);
                     }
                  }
               }

               this.player.sendMsg(resp.build());
               showType = PlayerMsg.ShowType.SHOW_CHINESE_NEW_YEAR_ACTIVITY_CITY_GAME;
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
               this.player.addResource(rewardList, showType, this.getActivityLogModule(), 13012, msg.getEvent().getEventId(), 0, "");
            }

         }
      }
   }

   public void checkDiceCountRecover() {
      if (!this.isServerActivityInvalid()) {
         ChineseNewYearDao dao = this.getDao();
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int maxCount = ApplicationContextProvider.getConfigInt("ChunJieDiceUpLimit", 0);
         int recoverTime = ApplicationContextProvider.getConfigInt("ChunJieDiceTime", 10800);
         int diceNum = this.getDiceNum("ChunJieDiceID");
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
               this.addDice("ChunJieDiceID", 13013, addNum);
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
         int maxCount = ApplicationContextProvider.getConfigInt("ChunJieDiceUpLimit", 0);
         int diceNum = this.getDiceNum("ChunJieDiceID");
         ChineseNewYearDao dao = this.getDao();
         if (diceNum >= maxCount && dao.diceRecover > 0) {
            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (dao.diceRecover > curTime) {
               dao.diceMaxRecover = dao.diceRecover - curTime;
            } else {
               dao.diceMaxRecover = 0;
            }

            dao.diceRecover = 0;
            dao.updateOp();
            ChineseNewYearMsg.S2C_GameAddRandomDice_22843.Builder resp = ChineseNewYearMsg.S2C_GameAddRandomDice_22843.newBuilder();
            resp.setDiceRecover(dao.diceRecover);
            this.player.sendMsg(resp.build());
         }

      }
   }

   public void updateGameRank(int num) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.drop > DateUtil.getIntTime(System.currentTimeMillis())) {
            ChineseNewYearDao dao = this.getDao();
            int newPoint = dao.point + num;
            dao.point = newPoint;
            dao.updateOp();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_CHINESE_NEW_YEAR, (long)newPoint, false);
         }
      }
   }

   private void resetDice(String initNumConfig, String itemConfig) {
      int initDiceNum = ApplicationContextProvider.getConfigInt(initNumConfig, 0);
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      int curNum = (int)this.player.getResourceNum(2, diceItem);
      if (curNum > initDiceNum) {
         this.player.delResource(2, diceItem, (long)(curNum - initDiceNum), this.getActivityLogModule(), 13011, 0, 0, "");
      } else if (curNum < initDiceNum) {
         this.player.addResource(2, diceItem, initDiceNum - curNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 13011, 0, 0, "");
      }

   }

   private int getDiceNum(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      return (int)this.player.getResourceNum(2, diceItem);
   }

   private void useDice(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.delResource(2, diceItem, 1L, this.getActivityLogModule(), 13008, 0, 0, "");
   }

   private void addDice(String itemConfig, int reason, int num) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.addResource(2, diceItem, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), reason, 0, 0, "");
   }

   private ChineseNewYearMsg.GameEvent.Builder triggerEvent(int eventId, List<Integer> param, List<ResourceModel> rewardList) {
      if (eventId <= 0) {
         return null;
      } else {
         Map<Integer, TreeMap<Integer, ChineseNewYearEventModel>> eventMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ChineseNewYearEventModel>>getModelPoolMap("customChunJieEvent");
         ChineseNewYearEventModel chineseNewYearEventModel;
         if (eventId == 301) {
            List<ChineseNewYearEventModel> luckyEvents = new ArrayList();
            TreeMap<Integer, ChineseNewYearEventModel> id_model = (TreeMap)eventMap.get(eventId);
            if (param != null && param.size() > 0) {
               for(Integer id : param) {
                  luckyEvents.add(id_model.get(id));
               }
            } else {
               luckyEvents.addAll(id_model.values());
            }

            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < luckyEvents.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((ChineseNewYearEventModel)luckyEvents.get(index)).getRandOdd()));
            }

            WeightRandom<Integer> weightRandom = cn.hutool.core.util.RandomUtil.weightRandom(weightList);
            chineseNewYearEventModel = (ChineseNewYearEventModel)luckyEvents.get((Integer)weightRandom.next());
         } else {
            chineseNewYearEventModel = (ChineseNewYearEventModel)((TreeMap)eventMap.get(eventId)).firstEntry().getValue();
         }

         ChineseNewYearDao dao = this.getDao();
         ChineseNewYearMsg.GameEvent.Builder eventBuilder = null;
         switch (chineseNewYearEventModel.getEventType()) {
            case 1:
               dao.event.eventId = chineseNewYearEventModel.getId();
               dao.event.eventParams.clear();
               dao.event.eventParams.addAll(chineseNewYearEventModel.getParam());
               eventBuilder = ChineseNewYearMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams);
               break;
            case 2:
               eventBuilder = this.eventHandle(chineseNewYearEventModel.getId(), chineseNewYearEventModel.getParam(), rewardList);
               break;
            case 3:
               int moveNum = cn.hutool.core.util.RandomUtil.randomInt((Integer)chineseNewYearEventModel.getParam().get(0), (Integer)chineseNewYearEventModel.getParam().get(1) + 1);
               List<Integer> paramList = new ArrayList();
               paramList.add(moveNum);
               eventBuilder = this.eventHandle(chineseNewYearEventModel.getId(), paramList, rewardList);
               break;
            case 4:
            case 6:
               dao.event.eventId = chineseNewYearEventModel.getId();
               dao.event.eventParams.clear();
               eventBuilder = ChineseNewYearMsg.GameEvent.newBuilder().setEventId(dao.event.eventId);
               break;
            case 5:
               dao.event.eventId = chineseNewYearEventModel.getId();
               dao.event.eventParams.clear();
               Map<Integer, ChineseNewYearShopModel> chineseNewYearShopModelMap = ApplicationContextProvider.<Integer, ChineseNewYearShopModel>getModelPoolMap("ChunJieShop");
               List<KeyValFun> id_ratioList = new ArrayList();

               for(Map.Entry<Integer, ChineseNewYearShopModel> entry : chineseNewYearShopModelMap.entrySet()) {
                  Integer key = (Integer)entry.getKey();
                  ChineseNewYearShopModel value = (ChineseNewYearShopModel)entry.getValue();
                  id_ratioList.add(new KeyValFun(key, value.getRatio()));
               }

               Integer num = (Integer)chineseNewYearEventModel.getParam().get(0);
               List<Integer> randomShopIds = new ArrayList();

               for(int i = 0; i < num; ++i) {
                  int id = GamePlayer.countRate(id_ratioList);
                  randomShopIds.add(id);
                  id_ratioList.removeIf((keyValFun) -> keyValFun.getKey() == id);
               }

               dao.event.eventParams.addAll(randomShopIds);
               eventBuilder = ChineseNewYearMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams);
         }

         dao.updateOp();
         this.player.triggerTask(718, eventId, 1L, 1);
         return eventBuilder;
      }
   }

   private ChineseNewYearMsg.GameEvent.Builder eventHandle(int eventId, List<Integer> eventParams, List<ResourceModel> rewardList) {
      ChineseNewYearMsg.GameEvent.Builder builder = ChineseNewYearMsg.GameEvent.newBuilder();
      builder.setEventId(eventId);
      ChineseNewYearEventModel chineseNewYearEventModel = (ChineseNewYearEventModel)ApplicationContextProvider.getModelPoolEntity("ChunJieEvent", eventId);
      if (chineseNewYearEventModel == null) {
         return builder;
      } else {
         switch (chineseNewYearEventModel.getEventType()) {
            case 1:
               this.eventBuildArrive(chineseNewYearEventModel, rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 2:
               for(ResourceModel reward : chineseNewYearEventModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }
               break;
            case 3:
               this.eventMove((Integer)eventParams.get(0));
               builder.addAllEventParam(eventParams);
               break;
            case 4:
               if ((Integer)eventParams.get(0) > 0) {
                  this.eventBattle(chineseNewYearEventModel.getId());
               }
               break;
            case 5:
               if ((Integer)eventParams.get(0) > 0 && !this.eventBuy(chineseNewYearEventModel.getId(), rewardList)) {
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

   public void sendGameMain() {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ChineseNewYearDao dao = this.getDao();
         ChineseNewYearMsg.S2C_GameMain_22839.Builder resp = ChineseNewYearMsg.S2C_GameMain_22839.newBuilder();
         resp.setGrid(dao.grid);
         resp.setDiceRecover(dao.diceRecover);
         resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
         Map<Integer, TreeMap<Integer, ChineseNewYearSiteModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ChineseNewYearSiteModel>>getModelPoolMap("customChunJieSite");

         for(int buildId : buildingMap.keySet()) {
            ChineseNewYearCityBuildData cityBuildData = dao.getBuildData(buildId);
            if (cityBuildData != null) {
               resp.addBuilding(cityBuildData.buildMsg());
            } else {
               resp.addBuilding(ChineseNewYearMsg.GameBuilding.newBuilder().setBuildId(buildId).setLv(0).setDailyChallengeNum(0));
            }
         }

         if (dao.event.eventId > 0) {
            resp.setEvent(ChineseNewYearMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams));
         }

         resp.addAllMakeUpReceiveId(dao.makeUpReceiveIds);
         resp.setPointLv(dao.pointLv);
         this.player.sendMsg(resp.build());
      }
   }

   private ChineseNewYearMsg.S2C_GameEvent_22847.Builder eventHandleDone(ChineseNewYearMsg.GameEvent gameEvent, int grid) {
      ChineseNewYearMsg.S2C_GameEvent_22847.Builder resp = ChineseNewYearMsg.S2C_GameEvent_22847.newBuilder();
      resp.setEvent(gameEvent);
      resp.setGrid(grid);
      return resp;
   }

   public void uploadChineseNewYearTreasureNum() {
      CrossMsg.S2CR_UploadChineseNewYearTreasureNum_4254.Builder builder = CrossMsg.S2CR_UploadChineseNewYearTreasureNum_4254.newBuilder();
      builder.setServerId(this.player.getServerId());
      builder.setPlayerId(this.player.getPlayerId());
      builder.setChineseNewYearTreasureNum(this.getAllActTreasureNum());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public long getAllActTreasureNum() {
      List<ItemModel> itemModelList = (List)ApplicationContextProvider.getModelPoolEntity("customTargetClassItem", 21);
      if (null != itemModelList && !itemModelList.isEmpty()) {
         long num = 0L;

         for(ItemModel itemModel : itemModelList) {
            long resourceNum = this.player.getResourceNum(2, itemModel.getId());
            if (resourceNum > 0L) {
               num += resourceNum;
            }
         }

         return num;
      } else {
         return 0L;
      }
   }

   public void clearActTreasure() {
      List<ItemModel> itemModelList = (List)ApplicationContextProvider.getModelPoolEntity("customTargetClassItem", 21);
      if (null != itemModelList && !itemModelList.isEmpty()) {
         for(ItemModel itemModel : itemModelList) {
            this.player.delResourceAllNum(2, itemModel.getId(), this.getActivityLogModule(), 13015, 0, 0, "");
         }

         this.uploadChineseNewYearTreasureNum();
      }
   }

   private void eventBuildArrive(ChineseNewYearEventModel chineseNewYearEventModel, List<ResourceModel> rewardList) {
      int buildId = (Integer)chineseNewYearEventModel.getParam().get(0);
      ChineseNewYearDao dao = this.getDao();
      ChineseNewYearCityBuildData chineseNewYearCityBuildData = dao.getBuildData(buildId);
      if (null == chineseNewYearCityBuildData) {
         this.logger.error("ChineseNewYearSite缺少建筑类型 type:{}", buildId);
      } else {
         ChineseNewYearSiteModel chineseNewYearSiteModel = this.getChineseNewYearSiteModel(buildId, chineseNewYearCityBuildData.lv);
         if (null != chineseNewYearSiteModel) {
            if (!chineseNewYearSiteModel.getStrikeReward().isEmpty()) {
               for(ResourceModel resourceModel : chineseNewYearSiteModel.getStrikeReward()) {
                  resourceModel.addResourceToList(rewardList);
               }
            }

            if (!chineseNewYearSiteModel.getCharacter().isEmpty()) {
               int quality = -1;
               List<KeyValFun> qualityKeyValFunList = new ArrayList();
               Map<Integer, Integer> quality_moneyNum = new HashMap();

               for(String quality_weightStr : chineseNewYearSiteModel.getCharacter()) {
                  String[] quality_weightArr = quality_weightStr.split(":");
                  if (quality_weightArr.length >= 3) {
                     int tempQuality = Integer.parseInt(quality_weightArr[0]);
                     int tempWeight = Integer.parseInt(quality_weightArr[1]);
                     int tempMoneyNum = Integer.parseInt(quality_weightArr[2]);
                     quality_moneyNum.put(tempQuality, tempMoneyNum);
                     qualityKeyValFunList.add(new KeyValFun(tempQuality, tempWeight));
                  }
               }

               quality = GamePlayer.countRate(qualityKeyValFunList);
               if (quality == 0) {
                  Integer copperNum = (Integer)quality_moneyNum.get(quality);
                  ResourceModel copper = new ResourceModel(1, PlayerDefine.PLAYER_COPPER, copperNum);
                  copper.addResourceToList(rewardList);
               } else if (quality > 0) {
                  List<KeyValFun> itemIdKeyValFunList = new ArrayList();
                  List<ItemModel> itemModelList = (List)ApplicationContextProvider.getModelPoolEntity("customTargetClassItem", 21);
                  if (null != itemModelList && itemModelList.size() > 0) {
                     for(ItemModel itemModel : itemModelList) {
                        if (itemModel.getQuality() == quality) {
                           itemIdKeyValFunList.add(new KeyValFun(itemModel.getId(), 1));
                        }
                     }
                  }

                  int itemId = GamePlayer.countRate(itemIdKeyValFunList);
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
                  if (null != itemModel) {
                     ResourceModel resourceModel = new ResourceModel(2, itemId, 1);
                     resourceModel.addResourceToList(rewardList);
                     Integer treasureMoneyNum = (Integer)quality_moneyNum.get(quality);
                     if (treasureMoneyNum != null && treasureMoneyNum > 0) {
                        int treasureMoneyItemId = ApplicationContextProvider.getConfigInt("ChunJieBoomPoint", 6881);
                        ResourceModel treasureMoney = new ResourceModel(2, treasureMoneyItemId, treasureMoneyNum);
                        treasureMoney.addResourceToList(rewardList);
                     }
                  }
               }
            }

         }
      }
   }

   private ChineseNewYearGridModel eventMove(int num) {
      if (num <= 6 && num >= -6) {
         Map<Integer, ChineseNewYearGridModel> monopolyMapModel = ApplicationContextProvider.<Integer, ChineseNewYearGridModel>getModelPoolMap("ChunJieGrid");
         if (monopolyMapModel != null && !monopolyMapModel.isEmpty()) {
            ChineseNewYearDao dao = this.getDao();
            int curGrid = dao.grid + num;
            if (curGrid < 0) {
               curGrid += monopolyMapModel.size();
            } else if (curGrid > monopolyMapModel.size()) {
               curGrid -= monopolyMapModel.size();
               this.player.triggerTask(717, this.getPlayerActivityId(), 1L, 1);
            }

            ChineseNewYearGridModel chineseNewYearGridModel = (ChineseNewYearGridModel)monopolyMapModel.get(curGrid);
            if (chineseNewYearGridModel == null) {
               return null;
            } else {
               dao.grid = curGrid;
               dao.updateOp();
               return chineseNewYearGridModel;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void eventBattle(int eventId) {
      Map<Integer, ChineseNewYearBattleModel> greatCityGameBattleModelMap = ApplicationContextProvider.<Integer, ChineseNewYearBattleModel>getModelPoolMap("ChunJieBattle");
      if (greatCityGameBattleModelMap != null && !greatCityGameBattleModelMap.isEmpty()) {
         TreeSet<Integer> greatCityGameBattleIds = new TreeSet(greatCityGameBattleModelMap.keySet());
         ChineseNewYearBattleModel matchModel = null;

         for(int id : greatCityGameBattleIds) {
            ChineseNewYearBattleModel chineseNewYearBattleModel = (ChineseNewYearBattleModel)greatCityGameBattleModelMap.get(id);
            if (this.player.getMaxPlayerCombatPower() >= (long)chineseNewYearBattleModel.getPowerStart() && this.player.getMaxPlayerCombatPower() <= (long)chineseNewYearBattleModel.getPowerEnd()) {
               matchModel = chineseNewYearBattleModel;
               break;
            }
         }

         if (matchModel == null) {
            matchModel = (ChineseNewYearBattleModel)greatCityGameBattleModelMap.get(greatCityGameBattleIds.last());
         }

         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         BattleMsg.C2S_BattleBegin_6107.Builder builder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
         builder.setModelId(matchModel.getId());
         builder.setType(6305);
         builder.addParams(eventId);
         battlePart.begin(builder.build(), "");
      }
   }

   public int enterBattle(BattleDao battleDao) {
      ChineseNewYearBattleModel chineseNewYearBattleModel = (ChineseNewYearBattleModel)ApplicationContextProvider.getModelPoolEntity("ChunJieBattle", battleDao.modelId);
      BattlePKTeam rightTeam = new BattlePKTeam(chineseNewYearBattleModel.getBattleId());
      battleDao.scene.addPKTeam((byte)1, rightTeam);
      battleDao.scene.setMaxRound((byte)chineseNewYearBattleModel.getRound());
      battleDao.scene.setBattleId(chineseNewYearBattleModel.getBattleId());
      return 1;
   }

   public void afterBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         ChineseNewYearBattleModel chineseNewYearBattleModel = (ChineseNewYearBattleModel)ApplicationContextProvider.getModelPoolEntity("ChunJieBattle", battleDao.modelId);
         battleDao.rewards.addAll(chineseNewYearBattleModel.getRewards());
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
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13012, (Integer)battleDao.params.get(0), battleDao.modelId, "");
      }
   }

   private boolean eventBuy(int eventId, List<ResourceModel> rewardList) {
      ChineseNewYearDao dao = this.getDao();
      List<ResourceModel> feeResourceList = new ArrayList();

      for(int eventParam : dao.event.eventParams) {
         ChineseNewYearShopModel greatCityGameRandomShopModel = (ChineseNewYearShopModel)ApplicationContextProvider.getModelPoolEntity("ChunJieShop", eventParam);
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
         this.player.delResource((List)feeResourceList, this.getActivityLogModule(), 13012, eventId, 0, "");
         return true;
      }
   }

   private void eventGrant(int grantIndex, List<ResourceModel> rewardList) {
      Map<Integer, ChineseNewYearSelectRewardModel> chineseNewYearSelectRewardModelMap = ApplicationContextProvider.<Integer, ChineseNewYearSelectRewardModel>getModelPoolMap("ChunJieSelectReward");
      if (chineseNewYearSelectRewardModelMap != null && !chineseNewYearSelectRewardModelMap.isEmpty()) {
         List<ChineseNewYearSelectRewardModel> chineseNewYearSelectRewardModels = new ArrayList(chineseNewYearSelectRewardModelMap.values());
         Collections.shuffle(chineseNewYearSelectRewardModels);
         ResourceModel rewardModel = (ResourceModel)((ChineseNewYearSelectRewardModel)chineseNewYearSelectRewardModels.get(0)).getRewards().get(grantIndex);
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
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_CHINESE_NEW_YEAR_DRAW, this.getActivityLogModule(), 13008, eventId, 0, "");
            }
            break;
         case "rolldice":
            this.rollDice(2, Integer.parseInt(split[1]));
      }

      this.sendGameMain();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveMakeUpReward_22883(ChineseNewYearMsg.C2S_ReceiveMakeUpReward_22883 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ChineseNewYearMakeUpModel makeUpModel = (ChineseNewYearMakeUpModel)ApplicationContextProvider.getModelPoolEntity("ChunJieMakeUP", msg.getId());
         if (null == makeUpModel) {
            return this.player.failure(37);
         } else {
            ChineseNewYearDao dao = this.getDao();
            if (dao.makeUpReceiveIds.contains(msg.getId())) {
               return this.player.failure(76030);
            } else {
               List<Integer> makeup = makeUpModel.getMakeup();
               List<ResourceModel> unLockItemList = new ArrayList();

               for(Integer itemId : makeup) {
                  unLockItemList.add(new ResourceModel(2, itemId, 1));
               }

               if (!this.player.checkResourceNum(unLockItemList)) {
                  return this.player.failure(76031);
               } else {
                  dao.makeUpReceiveIds.add(msg.getId());
                  dao.updateOp();
                  this.player.addResource(makeUpModel.getMakeitem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13016, 0, 0, "");
                  ChineseNewYearMsg.S2C_ReceiveMakeUpReward_22884.Builder resp = ChineseNewYearMsg.S2C_ReceiveMakeUpReward_22884.newBuilder();
                  resp.addAllMakeUpReceiveId(dao.makeUpReceiveIds);
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_PointLvUp_22885(ChineseNewYearMsg.C2S_PointLvUp_22885 msg, String source) {
      ChineseNewYearDao dao = this.getDao();
      ChineseNewYearLevelTaskModel nextLevelTaskModel = (ChineseNewYearLevelTaskModel)ApplicationContextProvider.getModelPoolEntity("ChunJieLevelTask", dao.pointLv + 1);
      if (null == nextLevelTaskModel) {
         return this.player.failure(6);
      } else {
         for(Integer taskId : nextLevelTaskModel.getTaskId()) {
            TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ACT_CHINESE_NEW_YEAR, taskId);
            if (null == taskData || taskData.state < 2) {
               return this.player.failure(76031);
            }
         }

         ++dao.pointLv;
         dao.updateOp();
         this.player.addResource(nextLevelTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13017, 0, 0, "");
         ChineseNewYearMsg.S2C_PointLvUp_22886.Builder resp = ChineseNewYearMsg.S2C_PointLvUp_22886.newBuilder();
         resp.setPointLv(dao.pointLv);
         this.player.sendMsg(resp.build());
         return true;
      }
   }

   public ChineseNewYearSiteModel getChineseNewYearSiteModel(int type, int level) {
      ConcurrentHashMap<Integer, ChineseNewYearSiteModel> chineseNewYearSiteModelMap = this.getChineseNewYearSiteModelMap(type);
      return null == chineseNewYearSiteModelMap ? null : (ChineseNewYearSiteModel)chineseNewYearSiteModelMap.get(level);
   }

   public ConcurrentHashMap<Integer, ChineseNewYearSiteModel> getChineseNewYearSiteModelMap(int type) {
      return (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customChunJieSite", type);
   }

   @MsgHandlerAnno
   public boolean C2S_BuildLvUp_22890(ChineseNewYearMsg.C2S_BuildLvUp_22890 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ChineseNewYearDao dao = this.getDao();
         ChineseNewYearCityBuildData chineseNewYearCityBuildData = dao.getBuildData(msg.getBuildId());
         if (null == chineseNewYearCityBuildData) {
            return this.player.failure(6);
         } else {
            int nextLv = chineseNewYearCityBuildData.lv + 1;
            ChineseNewYearSiteModel chineseNewYearSiteModel = this.getChineseNewYearSiteModel(msg.getBuildId(), nextLv);
            if (null == chineseNewYearSiteModel) {
               return this.player.failure(37);
            } else if (!this.player.checkResourceNum(chineseNewYearSiteModel.getLeveItem())) {
               return this.player.failure(76135);
            } else {
               this.player.delResource((List)chineseNewYearSiteModel.getLeveItem(), this.getActivityLogModule(), 13018, 0, 0, "");
               chineseNewYearCityBuildData.lv = chineseNewYearSiteModel.getLevel();
               chineseNewYearCityBuildData.subjectList.clear();
               ChineseNewYearCityChallengeData challengeData = dao.challengeData;
               if (null != challengeData && challengeData.buildId == chineseNewYearCityBuildData.buildId) {
                  dao.challengeData = null;
               }

               dao.updateOp();
               this.triggerTaskAllBuildLvUp();
               ChineseNewYearMsg.S2C_BuildLvUp_22891.Builder resp = ChineseNewYearMsg.S2C_BuildLvUp_22891.newBuilder();
               resp.setBuildId(msg.getBuildId());
               resp.setBuildLv(chineseNewYearSiteModel.getLevel());
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   public void triggerTaskAllBuildLvUp() {
      Map<Integer, ConcurrentHashMap<Integer, ChineseNewYearSiteModel>> modelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, ChineseNewYearSiteModel>>getModelPoolMap("customChunJieSite");
      Set<Integer> buildIdSet = modelMap.keySet();
      ChineseNewYearDao dao = this.getDao();
      Map<Integer, ChineseNewYearCityBuildData> building = dao.building;
      if (buildIdSet.size() > building.size()) {
         this.player.triggerTask(716, this.getPlayerActivityId(), 0L, 0);
      } else {
         int minBuildLv = 999;

         for(Map.Entry<Integer, ChineseNewYearCityBuildData> entry : building.entrySet()) {
            ChineseNewYearCityBuildData value = (ChineseNewYearCityBuildData)entry.getValue();
            if (value.lv < minBuildLv) {
               minBuildLv = value.lv;
            }
         }

         this.player.triggerTask(716, this.getPlayerActivityId(), (long)minBuildLv, 0);
      }

   }

   public List<Integer> randomSubjectIdList(int type, int num) {
      List<Integer> randomSubjectIdList = new ArrayList();
      if (num <= 0) {
         return randomSubjectIdList;
      } else {
         List<ChineseNewYearSubjectModel> allList = (List)ApplicationContextProvider.getModelPoolEntity("customChunJieSubject", type);
         if (allList != null && !allList.isEmpty()) {
            List<KeyValFun> id_ratioList = new ArrayList();

            for(ChineseNewYearSubjectModel model : allList) {
               id_ratioList.add(new KeyValFun(model.getId(), model.getRatio()));
            }

            for(int i = 0; i < num; ++i) {
               int id = GamePlayer.countRate(id_ratioList);
               randomSubjectIdList.add(id);
               id_ratioList.removeIf((keyValFun) -> keyValFun.getKey() == id);
            }

            return randomSubjectIdList;
         } else {
            return randomSubjectIdList;
         }
      }
   }

   public List<SubjectData> getChallengeSubjectList(int type, int challengeLv) {
      List<SubjectData> subjectList = new ArrayList();
      ChineseNewYearSiteModel chineseNewYearSiteModel = this.getChineseNewYearSiteModel(type, challengeLv);
      int targetValue = chineseNewYearSiteModel.getTargetValue();
      if (targetValue <= 0) {
         return subjectList;
      } else {
         switch (type) {
            case 1:
            case 2:
               for(Integer randomSubjectId : this.randomSubjectIdList(type, targetValue)) {
                  subjectList.add(new SubjectData(randomSubjectId, 0));
               }
               break;
            case 3:
               for(int i = 0; i < targetValue; ++i) {
                  int param1 = RandomUtil.randInt(1, 6);
                  int param2 = RandomUtil.randInt(param1, 11);
                  subjectList.add(new SubjectData(param1, param2));
               }
               break;
            case 4:
               for(int i = 0; i < targetValue; ++i) {
                  SubjectData subjectData = new SubjectData(RandomUtil.randInt(1, 4), 0);
                  subjectList.add(subjectData);
               }
         }

         return subjectList;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuildChallenge_22892(ChineseNewYearMsg.C2S_BuildChallenge_22892 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      }

      ChineseNewYearDao dao = this.getDao();
      dao.challengeData = null;
      dao.updateOp();
      ChineseNewYearCityBuildData buildData = dao.getBuildData(msg.getBuildId());
      if (null != buildData && buildData.lv >= msg.getBuildLv()) {
         if (buildData.rewardLv.contains(msg.getBuildLv())) {
            return this.player.failure(76180);
         } else {
            List<SubjectData> challengeSubjectList = this.getChallengeSubjectList(msg.getBuildId(), msg.getBuildLv());
            if (null != challengeSubjectList && !challengeSubjectList.isEmpty()) {
               buildData.subjectList.clear();
               buildData.subjectList.addAll(challengeSubjectList);
               dao.updateOp();
               ChineseNewYearCityChallengeData challengeData = new ChineseNewYearCityChallengeData(msg.getBuildId(), msg.getBuildLv());
               dao.challengeData = challengeData;
               dao.updateOp();
               ChineseNewYearMsg.S2C_BuildChallenge_22893.Builder resp = ChineseNewYearMsg.S2C_BuildChallenge_22893.newBuilder();
               resp.setBuildId(msg.getBuildId());

               for(SubjectData subject : buildData.subjectList) {
                  ChineseNewYearMsg.ChallengeData.Builder challengeDataBuilder = ChineseNewYearMsg.ChallengeData.newBuilder();
                  challengeDataBuilder.setParam1(subject.param1);
                  challengeDataBuilder.setParam2(subject.param2);
                  resp.addSubject(challengeDataBuilder);
               }

               resp.setLastCommitTime(challengeData.lastCommitTime);
               resp.setBuildLv(msg.getBuildLv());
               this.player.sendMsg(resp.build());
               return true;
            } else {
               return this.player.failure(37);
            }
         }
      } else {
         return this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuildAnswer_22894(ChineseNewYearMsg.C2S_BuildAnswer_22894 msg, String source) {
      long currentTimeMillis = System.currentTimeMillis();
      ChineseNewYearDao dao = this.getDao();
      ChineseNewYearCityChallengeData challengeData = dao.challengeData;
      if (null != challengeData && challengeData.buildId == msg.getBuildId() && challengeData.buildLv == msg.getBuildLv()) {
         if (this.checkAnswerCommitFinish(msg.getBuildId())) {
            return this.player.failure(76179);
         } else {
            ChineseNewYearCityBuildData chineseNewYearCityBuildData = dao.getBuildData(msg.getBuildId());
            if (chineseNewYearCityBuildData.rewardLv.contains(msg.getBuildLv())) {
               return this.player.failure(76180);
            } else {
               if (challengeData.answerList.size() <= 0) {
                  ++chineseNewYearCityBuildData.dailyChallengeNum;
                  dao.updateOp();
               }

               ChineseNewYearSiteModel chineseNewYearSiteModel = this.getChineseNewYearSiteModel(msg.getBuildId(), msg.getBuildLv());
               if (null == chineseNewYearSiteModel) {
                  return this.player.failure(37);
               } else {
                  ChineseNewYearMsg.S2C_BuildAnswer_22895.Builder resp = ChineseNewYearMsg.S2C_BuildAnswer_22895.newBuilder();
                  long cd = currentTimeMillis - challengeData.lastCommitTime;
                  long targetCd = (long)(chineseNewYearSiteModel.getCd() + 3000);
                  if (chineseNewYearSiteModel.getCd() > 0 && cd > targetCd) {
                     challengeData.answerList.add(new SubjectData(-1, 0));
                     challengeData.lastCommitTime = System.currentTimeMillis() + (long)chineseNewYearSiteModel.getAccountCd();
                     dao.updateOp();
                     resp.setAnswerState(0);
                  } else {
                     ChineseNewYearMsg.ChallengeData answer = msg.getAnswer();
                     SubjectData subjectData = new SubjectData(answer.getParam1(), answer.getParam2());
                     challengeData.answerList.add(subjectData);
                     challengeData.lastCommitTime = System.currentTimeMillis() + (long)chineseNewYearSiteModel.getAccountCd();
                     dao.updateOp();
                     boolean checkAnswerRight = this.checkAnswerRight(msg.getBuildId(), subjectData, challengeData.answerList.size() - 1);
                     if (checkAnswerRight) {
                        resp.setAnswerState(1);
                     } else {
                        resp.setAnswerState(0);
                     }
                  }

                  if (this.checkAnswerAllRight(msg.getBuildId())) {
                     chineseNewYearCityBuildData.subjectList.clear();
                     this.player.addResource(chineseNewYearSiteModel.getRewardItem(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 126, 13019, 0, 0, "");
                     chineseNewYearCityBuildData.rewardLv.add(chineseNewYearSiteModel.getLevel());
                     dao.updateOp();
                     this.sendGameMain();
                  }

                  int challengeState = 0;
                  if (this.checkAnswerCommitFinish(msg.getBuildId())) {
                     resp.setNextSubjectIndex(-1);
                     challengeState = chineseNewYearCityBuildData.rewardLv.contains(msg.getBuildLv()) ? 1 : 2;
                  } else {
                     int nextSubjectIndex = challengeData.answerList.size();
                     resp.setNextSubjectIndex(nextSubjectIndex);
                  }

                  resp.setLastCommitTime(challengeData.lastCommitTime);
                  resp.setChallengeState(challengeState);
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      } else {
         return this.player.failure(76178);
      }
   }

   public boolean checkAnswerAllRight(int buildId) {
      if (this.checkAnswerCommitFinish(buildId)) {
         ChineseNewYearDao dao = this.getDao();
         List<SubjectData> answerList = dao.challengeData.answerList;

         for(int i = 0; i < answerList.size(); ++i) {
            SubjectData answer = (SubjectData)answerList.get(i);
            if (!this.checkAnswerRight(buildId, answer, i)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean checkAnswerRight(int buildId, SubjectData answer, int subjectIndex) {
      ChineseNewYearDao dao = this.getDao();
      ChineseNewYearCityBuildData buildData = dao.getBuildData(buildId);
      if (null != buildData && buildData.subjectList.size() >= subjectIndex + 1) {
         SubjectData subject = (SubjectData)buildData.subjectList.get(subjectIndex);
         switch (buildId) {
            case 1:
            case 2:
               ChineseNewYearSubjectModel subjectModel = (ChineseNewYearSubjectModel)ApplicationContextProvider.getModelPoolEntity("ChunJieSubject", subject.param1);
               if (null == subjectModel) {
                  this.logger.error("ChineseNewYearSubject 缺少配置 id:{}", subject);
                  return false;
               }

               if (subjectModel.getAnswer() == answer.param1) {
                  return true;
               }
               break;
            case 3:
               boolean playerFlag = subject.param1 + answer.param1 == answer.param2;
               boolean robotFlag = subject.param1 + answer.param1 == subject.param2;
               if (playerFlag && !robotFlag) {
                  return true;
               }
               break;
            case 4:
               int param1 = subject.param1;
               if (param1 == 1 && answer.param1 == 3) {
                  return true;
               }

               if (param1 == 2 && answer.param1 == 1) {
                  return true;
               }

               if (param1 == 3 && answer.param1 == 2) {
                  return true;
               }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean checkAnswerCommitFinish(int buildId) {
      ChineseNewYearDao dao = this.getDao();
      ChineseNewYearCityBuildData buildData = dao.getBuildData(buildId);
      if (null == buildData) {
         return true;
      } else {
         ChineseNewYearCityChallengeData challengeData = dao.challengeData;
         if (null == challengeData) {
            return true;
         } else {
            List<SubjectData> subjectIdList = buildData.subjectList;
            return subjectIdList == null || subjectIdList.isEmpty() || subjectIdList.size() <= challengeData.answerList.size();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GetOnHookSecond_22896(ChineseNewYearMsg.C2S_GetOnHookSecond_22896 msg, String source) {
      ChineseNewYearMsg.S2C_GetOnHookSecond_22897.Builder resp = ChineseNewYearMsg.S2C_GetOnHookSecond_22897.newBuilder();
      resp.setOnHookSecond(this.getOnHookSecond());
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveOnHookReward_22898(ChineseNewYearMsg.C2S_ReceiveOnHookReward_22898 msg, String source) {
      ChineseNewYearDao dao = this.getDao();
      Map<Integer, ChineseNewYearCityBuildData> building = dao.building;
      List<ResourceModel> rewardList = new ArrayList();
      long onHookSecond = this.getOnHookSecond();
      int onHookHour = (int)(onHookSecond / 3600L);
      if (onHookHour < 1) {
         return this.player.failure(6);
      } else {
         for(Map.Entry<Integer, ChineseNewYearCityBuildData> entry : building.entrySet()) {
            ChineseNewYearCityBuildData value = (ChineseNewYearCityBuildData)entry.getValue();
            ChineseNewYearSiteModel chineseNewYearSiteModel = this.getChineseNewYearSiteModel(value.buildId, value.lv);
            if (null != chineseNewYearSiteModel) {
               int pointItemId = this.configManager.getIntDefault("ChunJieBoomPoint", 6881);
               int num = onHookHour * chineseNewYearSiteModel.getProfit();
               ResourceModel reward = new ResourceModel(2, pointItemId, num);
               reward.addResourceToList(rewardList);
            }
         }

         if (rewardList.isEmpty()) {
            return this.player.failure(6);
         } else {
            this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 13020, 0, 0, "");
            long remainderSecond = onHookSecond % 3600L;
            dao.onHookSecond = remainderSecond;
            dao.updateOp();
            ChineseNewYearMsg.S2C_ReceiveOnHookReward_22899.Builder resp = ChineseNewYearMsg.S2C_ReceiveOnHookReward_22899.newBuilder();
            resp.setOnHookSecond(dao.onHookSecond);
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public long getOnHookSecond() {
      this.calOnHookSecond(System.currentTimeMillis());
      ChineseNewYearDao dao = this.getDao();
      return dao.onHookSecond;
   }

   public void calOnHookSecond(long calTime) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (null != activityInfo) {
            ChineseNewYearDao dao = this.getDao();
            long actStartTime = (long)activityInfo.start * 1000L;
            if (dao.lastCalTime < actStartTime) {
               dao.lastCalTime = actStartTime;
            }

            long curOnlineSecond = (calTime - dao.lastCalTime) / 1000L;
            dao.onHookSecond += curOnlineSecond;
            dao.lastCalTime = calTime;
            dao.updateOp();
         }
      }
   }

   private void sendCumulativeDraw(ChineseNewYearDao dao) {
      if (dao.drawTime > 0) {
         List<ResourceModel> notReceiveRewards = new ArrayList();
         List<ChineseNewYearAddUpReturnModel> awardModel = this.getAvailableModels();
         if (!ObjectUtils.isEmpty(awardModel)) {
            for(ChineseNewYearAddUpReturnModel model : awardModel) {
               if (model.getAddupNum() <= dao.drawTime && !dao.hadRewards.contains(model.getId())) {
                  notReceiveRewards.addAll(model.getRewards());
               }
            }

            if (!ObjectUtils.isEmpty(notReceiveRewards)) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_CHINESE_NEW_YEAR_ADD_UP_RETURN_AWARD);
               if (!ObjectUtils.isEmpty(centreAwardMap)) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 13006);
               }
            }
         }
      }

   }

   private List<ChineseNewYearAddUpReturnModel> getAvailableModels() {
      Map<Integer, ChineseNewYearAddUpReturnModel> addUpReturnAwardModelMap = ApplicationContextProvider.<Integer, ChineseNewYearAddUpReturnModel>getModelPoolMap("ChunJieAddupReturnAward");
      if (ObjectUtils.isEmpty(addUpReturnAwardModelMap)) {
         return new ArrayList();
      } else {
         List<ChineseNewYearAddUpReturnModel> result = new ArrayList();
         int serverOpenDay = this.getPlayerActivityOpenDay();

         for(ChineseNewYearAddUpReturnModel model : addUpReturnAwardModelMap.values()) {
            if (serverOpenDay >= model.getDateStart() && serverOpenDay <= model.getDateEnd() || serverOpenDay >= model.getDateStart() && model.getDateEnd() == -1) {
               result.add(model);
            }
         }

         return result;
      }
   }
}
