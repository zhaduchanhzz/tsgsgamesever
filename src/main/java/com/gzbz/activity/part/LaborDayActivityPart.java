package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityLaborDayDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LaborDayAddUpReturnModel;
import com.gzbz.model.LaborDayLotteryCostModel;
import com.gzbz.model.LaborDayLotteryItemModel;
import com.gzbz.model.LaborDayPointAwardModel;
import com.gzbz.model.LaborDayShopAddUpModel;
import com.gzbz.model.LaborDaySignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityLaborDayMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
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

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LaborDayActivityPart extends AddUpAndConRechargeActivityPart {
   private String LABOR_DAY_ARROW_NUM = "LaborDayArrowNum";
   private String LABOR_DAY_ARROW_BUY = "LaborDayArrowBuy";
   private int CAN_NOT_BUY_ARROW = -1;
   @Autowired
   private ConfigManager configManager;

   public ActivityLaborDayDao getDao() {
      ActivityLaborDayDao dao = (ActivityLaborDayDao)this.player.getData("tb_activity_labor_day", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 98;
   }

   public int getAddUpLogReason() {
      return 9801;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_LABOR_DAY_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "LaborDayAddupRecharge";
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
      return 75;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         this.sendActivityInfo();
         this.shopAddUpRechargeHandle(true);
         this.sendDrawInfo();
         this.sendArcheryInfo();
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
         this.archeryResetDaily();
         this.sendArcheryInfo();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
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
      this.archeryEnd();
      this.drawEnd();
   }

   public void rotateReset(int oldActivityId) {
      ActivityLaborDayDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.updateOp();
      this.shopAddUpReset();
      this.archeryEnd();
      this.archeryResetDaily();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_20001(ActivityLaborDayMsg.C2S_ActivityInfo_20001 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ActivityLaborDayMsg.S2C_ActivityInfo_20002.Builder builder = ActivityLaborDayMsg.S2C_ActivityInfo_20002.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivityLaborDayDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_20003(ActivityLaborDayMsg.C2S_ShopAddUpInfo_20003 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_20005(ActivityLaborDayMsg.C2S_ReceiveShopAddUpReward_20005 msg, String source) {
      int id = msg.getId();
      ActivityLaborDayDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         LaborDayShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 9802, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ActivityLaborDayMsg.S2C_ShopAddUpInfo_20004.Builder builder = ActivityLaborDayMsg.S2C_ShopAddUpInfo_20004.newBuilder();
      ActivityLaborDayDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityLaborDayDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, LaborDayShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            LaborDayShopAddUpModel model = (LaborDayShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityLaborDayDao dao = this.getDao();
      Map<Integer, LaborDayShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(LaborDayShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_LABOR_DAY_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 9802);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      LaborDayShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityLaborDayDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public LaborDayShopAddUpModel getShopAddUpModel(int id) {
      LaborDayShopAddUpModel model = (LaborDayShopAddUpModel)this.player.getGameModelPool().getEntity("LaborDayShopAddup", id);
      return model;
   }

   public Map<Integer, LaborDayShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, LaborDayShopAddUpModel> modelMap = new HashMap();
      Map<Integer, LaborDayShopAddUpModel> allModel = this.player.getGameModelPool().getMap("LaborDayShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, LaborDayShopAddUpModel> entry : allModel.entrySet()) {
            LaborDayShopAddUpModel model = (LaborDayShopAddUpModel)entry.getValue();
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
   public void C2S_SignTotalInfo_20006(ActivityLaborDayMsg.C2S_SignTotalInfo_20006 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ActivityLaborDayMsg.S2C_SignTotalInfo_20007.Builder builder = ActivityLaborDayMsg.S2C_SignTotalInfo_20007.newBuilder();
      ActivityLaborDayDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      LaborDaySignAwardModel model = (LaborDaySignAwardModel)this.player.getGameModelPool().getEntity("LaborDaySignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActivityLaborDayDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_20008(ActivityLaborDayMsg.C2S_Sign_20008 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         LaborDaySignAwardModel model = (LaborDaySignAwardModel)this.player.getGameModelPool().getEntity("LaborDaySignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 9803, 0, 0, "");
         ActivityLaborDayDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActivityLaborDayDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_ArcheryInfo_20009(ActivityLaborDayMsg.C2S_ArcheryInfo_20009 msg, String source) {
      this.sendArcheryInfo();
   }

   public void sendArcheryInfo() {
      ActivityLaborDayDao dao = this.getDao();
      ActivityLaborDayMsg.S2C_ArcheryInfo_20010.Builder builder = ActivityLaborDayMsg.S2C_ArcheryInfo_20010.newBuilder();
      builder.setPoint(dao.point);
      builder.setArrowBuyTimes(dao.arrowBuyTimes);
      builder.setArrowBuyCost(this.getArrowBuyCost());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_ArcheryShoot_20011(ActivityLaborDayMsg.C2S_ArcheryShoot_20011 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            return this.player.failure(76022);
         } else {
            int curPoint = msg.getCurPoint();
            ResourceModel resourceModel = new ResourceModel();
            resourceModel.setType(2);
            resourceModel.setId(1256);
            resourceModel.setValue(1);
            if (!this.player.checkResourceNum(resourceModel)) {
               return this.player.failure(76046);
            } else {
               LaborDayPointAwardModel model = (LaborDayPointAwardModel)this.player.getGameModelPool().getEntity("LaborDayPointAward", curPoint);
               if (null == model) {
                  return this.player.failure(37);
               } else {
                  this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 9807, 0, 0, "");
                  this.player.delResource(resourceModel, this.getActivityLogModule(), 9809, 0, 0, "");
                  ActivityLaborDayDao dao = this.getDao();
                  dao.point += curPoint;
                  dao.updateOp();
                  RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                  rankPart.updateRank(RankDefine.RankModule.LABOR_DAY_ARCHERY, (long)dao.point, false);
                  ActivityLaborDayMsg.S2C_ArcheryShoot_20012.Builder builder = ActivityLaborDayMsg.S2C_ArcheryShoot_20012.newBuilder();
                  builder.setCurPoint(curPoint);
                  builder.setPoint(dao.point);
                  this.player.sendMsg(builder.build());
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuyArrow_20025(ActivityLaborDayMsg.C2S_BuyArrow_20025 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         int arrowBuyCost = this.getArrowBuyCost();
         if (this.getSurplusBuyTimes() > 0 && arrowBuyCost != this.CAN_NOT_BUY_ARROW) {
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, arrowBuyCost)) {
               return this.player.failure(31);
            } else {
               this.player.addResource(2, 1256, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 9811, 0, 0, "");
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)arrowBuyCost, this.getActivityLogModule(), 9812, 0, 0, "");
               ActivityLaborDayDao dao = this.getDao();
               ++dao.arrowBuyTimes;
               dao.updateOp();
               this.sendArcheryInfo();
               return true;
            }
         } else {
            return this.player.failure(61164);
         }
      }
   }

   public int getSurplusBuyTimes() {
      ActivityLaborDayDao dao = this.getDao();
      int arrowBuyTimes = dao.arrowBuyTimes;
      String laborDayArrowBuyStr = this.configManager.getStrByDefault(this.LABOR_DAY_ARROW_BUY, "50|100|150|200");
      String[] laborDayArrowBuyStrArr = laborDayArrowBuyStr.split("\\|");
      return laborDayArrowBuyStrArr.length - arrowBuyTimes > 0 ? laborDayArrowBuyStrArr.length - arrowBuyTimes : 0;
   }

   public int getArrowBuyCost() {
      ActivityLaborDayDao dao = this.getDao();
      String laborDayArrowBuyStr = this.configManager.getStrByDefault(this.LABOR_DAY_ARROW_BUY, "50|100|150|200");
      String[] laborDayArrowBuyStrArr = laborDayArrowBuyStr.split("\\|");
      int arrowBuyTimes = dao.arrowBuyTimes;
      if (arrowBuyTimes >= laborDayArrowBuyStrArr.length) {
         return this.CAN_NOT_BUY_ARROW;
      } else {
         int buyCost = Integer.parseInt(laborDayArrowBuyStrArr[arrowBuyTimes]);
         return buyCost;
      }
   }

   public void archeryResetDaily() {
      ActivityLaborDayDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      if (!dao.giveArrowDays.contains(severActivityDay)) {
         int laborDayArrowNum = this.configManager.getIntDefault(this.LABOR_DAY_ARROW_NUM, 7);
         this.player.addResource(2, 1256, laborDayArrowNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 9808, 0, 0, "");
         dao.arrowBuyTimes = 0;
         dao.giveArrowDays.add(severActivityDay);
         dao.updateOp();
      }
   }

   public void archeryEnd() {
      ActivityLaborDayDao dao = this.getDao();
      dao.point = 0;
      dao.arrowBuyTimes = 0;
      dao.giveArrowDays.clear();
      dao.updateOp();
      this.player.delResourceAllNum(2, 1256, this.getActivityLogModule(), 9813, 0, 0, "");
   }

   public void drawEnd() {
      ActivityLaborDayDao dao = this.getDao();
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
      ActivityLaborDayDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_20013(ActivityLaborDayMsg.C2S_FancyReward_20013 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityLaborDayDao dao = this.getDao();
         LaborDayLotteryItemModel laborDayLotteryItemModel = (LaborDayLotteryItemModel)this.player.getGameModelPool().getEntity("LaborDayLotteryItem", msg.getTargetId());
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
                  ActivityLaborDayMsg.S2C_FancyReward_20014.Builder builder = ActivityLaborDayMsg.S2C_FancyReward_20014.newBuilder();
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
      Map<Integer, LaborDayLotteryItemModel> allMap = this.player.getGameModelPool().getMap("LaborDayLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(LaborDayLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_20017(ActivityLaborDayMsg.C2S_Draw_20017 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         LaborDayLotteryCostModel costModel = (LaborDayLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("LaborDayLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(38, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityLaborDayDao dao = this.getDao();
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
                     Map<Integer, LaborDayLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        LaborDayLotteryItemModel enjoyModel = (LaborDayLotteryItemModel)ApplicationContextProvider.getModelPoolEntity("LaborDayLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           LaborDayLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ActivityLaborDayDao.RecordInfo recordInfo = new ActivityLaborDayDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 9805, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_LABOR_DAY_DRAW_ACTIVITY, this.getActivityLogModule(), 9804, 0, 0, "");
                        playerResetCustomCache.addDailyReset(38, lotteryNum);
                        ActivityLaborDayMsg.S2C_Draw_20018.Builder builder = ActivityLaborDayMsg.S2C_Draw_20018.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(38, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "砥兵砺伍-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, LaborDayLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, LaborDayLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("LaborDayLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, LaborDayLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, LaborDayLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((LaborDayLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((LaborDayLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((LaborDayLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((LaborDayLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((LaborDayLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((LaborDayLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private LaborDayLotteryItemModel smashEgg(ActivityLaborDayDao dao, Map<Integer, LaborDayLotteryItemModel> itemModelMap) {
      Map<Integer, LaborDayLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(LaborDayLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(LaborDayLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_20015(ActivityLaborDayMsg.C2S_LuckDrawInfo_20015 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityLaborDayDao dao = this.getDao();
      ActivityLaborDayMsg.S2C_LuckDrawInfo_20016.Builder builder = ActivityLaborDayMsg.S2C_LuckDrawInfo_20016.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(38, 0);
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

   public List<LaborDayLotteryItemModel> getDrawJackpot() {
      List<LaborDayLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, LaborDayLotteryItemModel>> laborDayLotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, LaborDayLotteryItemModel>>getModelPoolMap("CustomLaborDayLotteryItem");
      TreeMap<Integer, Map<Integer, LaborDayLotteryItemModel>> treeMap = new TreeMap(laborDayLotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, LaborDayLotteryItemModel> modelMap = (Map)laborDayLotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(LaborDayLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<LaborDayLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("砥兵砺伍活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         LaborDayLotteryItemModel model = (LaborDayLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(LaborDayLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadLaborDayRecord_4223.Builder builder = CrossMsg.S2CR_UploadLaborDayRecord_4223.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_20019(ActivityLaborDayMsg.C2S_OpenReward_20019 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         LaborDayAddUpReturnModel awardModel = (LaborDayAddUpReturnModel)ApplicationContextProvider.getModelPoolEntity("LaborDayAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityLaborDayDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("砥兵砺伍活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("砥兵砺伍活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 9806, 0, 0, "");
                  ActivityLaborDayMsg.S2C_OpenReward_20020.Builder builder = ActivityLaborDayMsg.S2C_OpenReward_20020.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("砥兵砺伍活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_20021(ActivityLaborDayMsg.C2S_DrawRecord_20021 msg, String source) {
      ActivityLaborDayMsg.S2C_DrawRecord_20022.Builder builder = ActivityLaborDayMsg.S2C_DrawRecord_20022.newBuilder();
      ActivityLaborDayDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ActivityLaborDayMsg.MyDrawRecord.Builder drawRecord = ActivityLaborDayMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_20023(ActivityLaborDayMsg.C2S_ServerDrawRecord_20023 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      LaborDayLotteryItemModel model = (LaborDayLotteryItemModel)this.player.getGameModelPool().getEntity("LaborDayLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, LaborDayLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               LaborDayLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private LaborDayLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, LaborDayLotteryItemModel> itemModelMap) {
      Map<Integer, LaborDayLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(LaborDayLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(LaborDayLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
