package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActivityAnniversaryCelebrationDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.FirstYearCityBuildData;
import com.gzbz.db.bean.FirstYearCityChallengeData;
import com.gzbz.db.bean.SubjectData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityDropModel;
import com.gzbz.model.AnniversaryConsumeActivityModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FirstYearAddUpRechargeModel;
import com.gzbz.model.FirstYearBattleModel;
import com.gzbz.model.FirstYearEventModel;
import com.gzbz.model.FirstYearExpeditionModel;
import com.gzbz.model.FirstYearFourteenSignAwardModel;
import com.gzbz.model.FirstYearGridModel;
import com.gzbz.model.FirstYearLevelTaskModel;
import com.gzbz.model.FirstYearLotteryCostModel;
import com.gzbz.model.FirstYearLotteryItemModel;
import com.gzbz.model.FirstYearLotteryReturnAwardModel;
import com.gzbz.model.FirstYearMakeUpModel;
import com.gzbz.model.FirstYearResignTimesModel;
import com.gzbz.model.FirstYearSelectRewardModel;
import com.gzbz.model.FirstYearShopAddUpModel;
import com.gzbz.model.FirstYearShopDetailsModel;
import com.gzbz.model.FirstYearShopModel;
import com.gzbz.model.FirstYearSiteModel;
import com.gzbz.model.FirstYearSubjectModel;
import com.gzbz.model.FirstYearTowerChapterModel;
import com.gzbz.model.FirstYearTreasureLevelModel;
import com.gzbz.model.FirstYearTreasureTaskModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityAnniversaryCelebrationMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityFirstYearTaskPart;
import com.gzbz.task.FirstYearTreasureTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
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
public class AnniversaryCelebrationPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   ConfigManager configManager;
   @Autowired
   private CrossNettyClient crossNettyClient;

   public ActivityAnniversaryCelebrationDao getDao() {
      return (ActivityAnniversaryCelebrationDao)this.player.getData("tb_activity_anniversary_celebration", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 126;
   }

   public int getAddUpLogReason() {
      return 12631;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_FIRST_YEAR_ADD_UP_MAIL;
   }

   public String getAddUpExcelName() {
      return "FirstYearAddupRecharge";
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
      return 91;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         this.shopAddUpRechargeHandle(true);
         this.sendSignInfo();
         this.sendShopInfo();
         this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.OPEN_MAIN);
         this.sendDrawInfo();
         this.resetDailyConsumeActivity();
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         super.resetDaily();
         this.addUpRechargeEndHandle();
         this.resetSignDaily();
         this.resetTowerDaily();
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         dao.buyGoldDiceNum = 0;
         dao.updateOp();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.drawResetDaily();
         this.sendDrawInfo();
         ActivityFirstYearTaskPart taskPart = (ActivityFirstYearTaskPart)this.player.getMgrPart(ActivityFirstYearTaskPart.class);
         taskPart.clearDailyTask();
         taskPart.trigger();
         this.gameCityDailyReset();
         this.sendGameMain();
         this.resetDailyConsumeActivity();
         this.checkExpeditionUnlock();
      }
   }

   public boolean checkAddUpRechargeEnd() {
      Map<Integer, FirstYearAddUpRechargeModel> modelMap = ApplicationContextProvider.<Integer, FirstYearAddUpRechargeModel>getModelPoolMap(this.getAddUpExcelName());
      if (modelMap != null && !modelMap.isEmpty()) {
         int maxStateEnd = 0;

         for(FirstYearAddUpRechargeModel model : modelMap.values()) {
            if (model.getStageEnd() > maxStateEnd) {
               maxStateEnd = model.getStageEnd();
            }
         }

         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay > maxStateEnd) {
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public void addUpRechargeEndHandle() {
      boolean isEnd = this.checkAddUpRechargeEnd();
      if (isEnd) {
         this.checkAddUpIdListChange();
         this.sendAddUpNotReceiveRewardMail();
      }

   }

   public void activityRecharge(int money) {
      if (!this.checkAddUpRechargeEnd()) {
         super.activityRecharge(money);
      }

      this.calcRetroactiveNum();
   }

   public void loginHandle() {
      super.loginHandle();
      this.handleConsumeFirstOpen();
      this.checkExpeditionUnlock();
   }

   public long getOnHookSecond() {
      this.calOnHookSecond(System.currentTimeMillis());
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      return dao.onHookSecond;
   }

   public void calOnHookSecond(long calTime) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (null != activityInfo) {
            ActivityAnniversaryCelebrationDao dao = this.getDao();
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

   public void logout() {
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      this.shopAddUpReset();
      this.drawEnd();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_FIRST_YEAR);
      this.consumeActivityEnd();
      this.signEnd();
      this.shopEnd();
      this.towerEnd();
      this.clearTreasureData();
      this.clearExpeditionData();
      this.clearActTreasure();
   }

   public void rotateReset(int oldActivityId) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.lotteryStage = this.getSmashEggStage();
      dao.updateOp();
      this.shopAddUpReset();
      dao.building.clear();
      dao.buyGoldDiceNum = 0;
      dao.diceRecover = 0;
      dao.diceMaxRecover = 0;
      Map<Integer, FirstYearGridModel> firstYearGridModelMap = ApplicationContextProvider.<Integer, FirstYearGridModel>getModelPoolMap("FristYearGrid");
      TreeSet<Integer> gridIds = new TreeSet(firstYearGridModelMap.keySet());
      dao.grid = (Integer)gridIds.first();
      dao.point = 0;
      dao.makeUpReceiveIds.clear();
      dao.pointLv = 0;
      dao.challengeData = null;
      dao.onHookSecond = 0L;
      dao.updateOp();
      int pointId = ApplicationContextProvider.getConfigInt("FristYearBoomPoint", 6881);
      this.player.delResourceAllNum(2, pointId, this.getActivityLogModule(), 12640, 0, 0, "");
      int woodItemId = ApplicationContextProvider.getConfigInt("DFWmucai", 6968);
      this.player.delResourceAllNum(2, woodItemId, this.getActivityLogModule(), 12640, 0, 0, "");
      this.resetDice("FristYearDiceNum", "FristYearDiceID");
      this.resetDice("FristYearGoldDiceNum", "FristYearGoldDiceID");
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(46);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_FIRST_YEAR);
      ActivityFirstYearTaskPart taskPart = (ActivityFirstYearTaskPart)this.player.getMgrPart(ActivityFirstYearTaskPart.class);
      taskPart.trigger();
      this.clearActivityGift(24);
      FirstYearTreasureTaskPart firstYearTreasureTaskPart = (FirstYearTreasureTaskPart)this.player.getMgrPart(FirstYearTreasureTaskPart.class);
      firstYearTreasureTaskPart.trigger();
      this.clearExpeditionData();
      this.checkExpeditionUnlock();
      this.clearActTreasure();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(59, 0);
   }

   @MsgHandlerAnno
   public void C2S_AnniversaryCelebrationSign_22001(ActivityAnniversaryCelebrationMsg.C2S_AnniversaryCelebrationSign_22001 msg, String source) {
      this.sendSignInfo();
   }

   @MsgHandlerAnno
   public void C2S_AnniversaryCelebrationSign_22003(ActivityAnniversaryCelebrationMsg.C2S_AnniversaryCelebrationSign_22003 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         List<Integer> signDayList = msg.getSignDayList();
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         boolean isRepair = false;
         int needRepairDay = 0;
         if (dao.loginDay == 0) {
            dao.loginDay = 1;
            dao.updateOp();
         }

         for(Integer signDay : signDayList) {
            if (signDay > this.getSeverActivityDay() || dao.gotDay.contains(signDay)) {
               this.player.failure(6);
               return;
            }

            if (signDay > dao.loginDay) {
               if (dao.retroactiveNum <= 0) {
                  this.player.failure(6);
                  return;
               }

               ++needRepairDay;
               isRepair = true;
            }
         }

         if (dao.retroactiveNum < needRepairDay) {
            this.player.failure(6);
         } else {
            List<ResourceModel> rewards = this.mergeReward(signDayList);
            dao.gotDay.addAll(signDayList);
            if (isRepair) {
               dao.retroactiveNum -= signDayList.size();
               dao.loginDay += signDayList.size();
            }

            dao.updateOp();
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 126, 12601, 0, 0, "");
            this.sendSignInfo();
         }
      }
   }

   public void sendSignInfo() {
      ActivityAnniversaryCelebrationMsg.S2C_AnniversaryCelebrationSign_22002.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_AnniversaryCelebrationSign_22002.newBuilder();
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      builder.setActDay(this.getSeverActivityDay());
      if (dao.loginDay == 0) {
         dao.loginDay = 1;
         dao.updateOp();
      }

      builder.setLoginDay(dao.loginDay);
      builder.setRetroactiveNum(dao.retroactiveNum);
      builder.addAllGotDay(dao.gotDay);
      builder.setTodayGetRetroactiveNum(dao.todayGetRetroactiveNum);
      builder.setOpenServerDay(((WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class)).getOpenServerDays());
      builder.setTodayRecharge(playerRechargeDao.dailyRecharge);
      this.player.sendMsg(builder.build());
   }

   public void resetSignDaily() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      if (dao.loginDay + 1 <= this.getSeverActivityDay()) {
         ++dao.loginDay;
      }

      dao.todayGetRetroactiveNum = 0;
      dao.updateOp();
      this.sendSignInfo();
   }

   public void calcRetroactiveNum() {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      int dailyRechargeGold = playerRechargeDao.dailyRecharge * 10;
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      Map<Integer, FirstYearResignTimesModel> map = this.player.getGameModelPool().getMap("FirstYearResignTimes");
      int maxRepairNum = 0;

      for(FirstYearResignTimesModel timesModel : map.values()) {
         if (dailyRechargeGold >= timesModel.getValue()) {
            maxRepairNum = Math.max(maxRepairNum, timesModel.getResignTimes());
         }
      }

      int retroactiveNum = maxRepairNum - dao.todayGetRetroactiveNum;
      int maxRepairDay = this.getSeverActivityDay() - dao.loginDay;
      retroactiveNum = retroactiveNum + dao.retroactiveNum > maxRepairDay ? maxRepairDay - dao.retroactiveNum : retroactiveNum;
      if (retroactiveNum > 0) {
         dao.todayGetRetroactiveNum += retroactiveNum;
         dao.retroactiveNum += retroactiveNum;
         dao.updateOp();
      }

      this.sendSignInfo();
   }

   private void signEnd() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      ArrayList<Integer> days = new ArrayList();

      for(int day = 1; day <= dao.loginDay; ++day) {
         if (!dao.gotDay.contains(day)) {
            days.add(day);
         }
      }

      List<ResourceModel> rewards = this.mergeReward(days);
      if (!rewards.isEmpty()) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.TYPE_FIRST_YEAR_SIGN_REWARD);
         if (null != centreAwardModel) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewards, 604800000L, this.getActivityLogModule(), 12601);
         }
      }

      dao.loginDay = 0;
      dao.retroactiveNum = 0;
      dao.todayGetRetroactiveNum = 0;
      dao.gotDay.clear();
      dao.updateOp();
   }

   private List<ResourceModel> mergeReward(List<Integer> days) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int openServerDays = worldMgr.getOpenServerDays();
      List<ResourceModel> rewards = new ArrayList();
      Map<Integer, FirstYearFourteenSignAwardModel> map = this.player.getGameModelPool().getMap("FirstYearFourteenSignAward");

      for(Integer signDay : days) {
         for(FirstYearFourteenSignAwardModel awardModel : map.values()) {
            if (awardModel.theDayInRegion(openServerDays) && awardModel.getDay() == signDay) {
               ResourceModel.addResourceToList(rewards, awardModel.getRewards());
               break;
            }
         }
      }

      return rewards;
   }

   @MsgHandlerAnno
   public void C2S_AnniversaryCelebrationShop_22004(ActivityAnniversaryCelebrationMsg.C2S_AnniversaryCelebrationShop_22004 msg, String source) {
      this.sendShopInfo();
   }

   @MsgHandlerAnno
   public void C2S_AnniversaryCelebrationShop_22006(ActivityAnniversaryCelebrationMsg.C2S_AnniversaryCelebrationShop_22006 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         int openServerDays = this.getActivityOpenDay();
         Integer buyNum = (Integer)MapUtil.getOrDefault(dao.shopData, id, 0);
         FirstYearShopDetailsModel model = (FirstYearShopDetailsModel)this.player.getGameModelPool().getEntity("FirstYearShopDetails", id);
         if (model != null && model.getLimitBuyFrequency() > buyNum && model.theDayInRegion(openServerDays)) {
            ResourceModel consume = new ResourceModel(model.getResourceType(), model.getResourceId(), model.getPrice());
            ResourceModel reward = new ResourceModel(2, model.getItemId(), model.getQuantity());
            if (!this.player.checkResourceNum(consume)) {
               this.player.failure(21010);
            } else {
               dao.shopData.merge(id, 1, Integer::sum);
               dao.updateOp();
               this.player.delResource(consume, 126, 12602, 0, 0, "");
               this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 126, 12602, 0, 0, "");
               this.sendShopInfo();
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   public void sendShopInfo() {
      ActivityAnniversaryCelebrationMsg.S2C_AnniversaryCelebrationShop_22005.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_AnniversaryCelebrationShop_22005.newBuilder();
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      builder.setActDay(this.getSeverActivityDay());
      builder.setOpenServerDay(this.getActivityOpenDay());

      for(Map.Entry<Integer, Integer> shop : dao.shopData.entrySet()) {
         builder.addShop(ActivityAnniversaryCelebrationMsg.ShopInfo.newBuilder().setId((Integer)shop.getKey()).setBuy((Integer)shop.getValue()));
      }

      this.player.sendMsg(builder.build());
   }

   private void shopEnd() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.shopData.clear();
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_ACTower_22007(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22007 msg, String source) {
      this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.OPEN_MAIN);
   }

   @MsgHandlerAnno
   public void C2S_ACTower_22009(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22009 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         if (dao.HP > 0) {
            --dao.HP;
            dao.updateOp();
            this.player.triggerTask(720, 0, 1L, 1);
            this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.CHALLENGE);
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            playerResetCustomCache.setForever(59, 1);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ACTower_22010(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22010 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         if (0 == (Integer)playerResetCustomCache.getForeverNum(59, 0)) {
            this.player.failure(6);
         } else {
            int id = msg.getId();
            ActivityAnniversaryCelebrationDao dao = this.getDao();
            FirstYearTowerChapterModel model = (FirstYearTowerChapterModel)this.player.getGameModelPool().getEntity("FirstYearTowerChapter", id);
            if (id <= dao.maxPass + 1 && model != null) {
               this.player.addResource(id > dao.maxPass ? model.getFirstReward() : model.getPassReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 126, 12603, 0, 0, "");
               playerResetCustomCache.setForever(59, 0);
               if (id > dao.maxPass) {
                  int donateHP = model.getNum();
                  if (donateHP > 0) {
                     int maxCanAddHp = ApplicationContextProvider.getConfigInt("TowerLifeMax", 5) - dao.HP;
                     donateHP = Math.min(donateHP, maxCanAddHp);
                     dao.HP += donateHP;
                  }

                  dao.maxPass = id;
                  dao.updateOp();
               }

               this.player.triggerTask(721, id, 1L, 1);
               this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.PASS);
            } else {
               this.player.failure(6);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ACTower_22011(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22011 msg, String source) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      ActivityAnniversaryCelebrationMsg.S2C_ACTower_22012.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_ACTower_22012.newBuilder();
      builder.setCanBuy(!dao.buySet.contains(msg.getId()));
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ACTower_22013(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22013 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         int maxCanAddHp = ApplicationContextProvider.getConfigInt("TowerLifeMax", 5) - dao.HP;
         int everydayLimit = ApplicationContextProvider.getConfigInt("TowerBuyMax", 3);
         List<ResourceModel> consumeList = ResourceModel.buildResources(ApplicationContextProvider.getConfigString("TowerBuyLife", "1|9|50,1|9|100,1|9|100"));
         if (maxCanAddHp > 0 && dao.buyHPTime < everydayLimit && consumeList.size() >= dao.buyHPTime + 1) {
            ResourceModel consume = (ResourceModel)consumeList.get(dao.buyHPTime - 1 + 1);
            if (!this.player.checkResourceNum(consume)) {
               this.player.failure(21010);
            } else {
               this.player.delResource(consume, 126, 12604, 0, 0, "");
               ++dao.HP;
               ++dao.buyHPTime;
               dao.updateOp();
               this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.BUY_HP);
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ACTower_22014(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22014 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         if (dao.chatSet.contains(id)) {
            this.player.failure(6);
         } else {
            dao.chatSet.add(id);
            dao.updateOp();
            this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.CHAT);
         }
      }
   }

   public void resetTowerDaily() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      if (this.getSeverActivityDay() != dao.actDay) {
         int addHP = ApplicationContextProvider.getConfigInt("TowerDayLife", 2);
         int maxCanAddHp = ApplicationContextProvider.getConfigInt("TowerLifeMax", 5) - dao.HP;
         addHP = Math.min(addHP, maxCanAddHp);
         dao.HP += addHP;
         dao.buyHPTime = 0;
         dao.actDay = this.getSeverActivityDay();
         dao.updateOp();
         this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.OPEN_MAIN);
      }
   }

   public void sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType towerReturnType) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      this.resetTowerDaily();
      ActivityAnniversaryCelebrationMsg.S2C_ACTower_22008.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_ACTower_22008.newBuilder();
      builder.setHP(dao.HP);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      builder.setStartTime(Math.min((int)(worldMgr.getOpenServerTime() / 1000L), this.getServerActivityInfo().start));
      builder.setMaxPass(dao.maxPass);
      builder.addAllBuy(dao.buySet);
      builder.addAllChat(dao.chatSet);
      builder.setBuyHPTime(dao.buyHPTime);
      builder.setReturnType(towerReturnType);
      this.player.sendMsg(builder.build());
   }

   public void towerGiftBuyRecord(int id) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.buySet.add(id);
      dao.updateOp();
      this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.BUY_GIFT);
   }

   private void towerEnd() {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.clearGifts(36);
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.HP = 0;
      dao.maxPass = 0;
      dao.totalDonateHP = 0;
      dao.buySet.clear();
      dao.chatSet.clear();
      dao.buyHPTime = 0;
      dao.updateOp();
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         int severActivityDay = this.getSeverActivityDay();
         Map<Integer, FirstYearShopAddUpModel> shopAddUpModelMap = ApplicationContextProvider.<Integer, FirstYearShopAddUpModel>getModelPoolMap("FirstYearShopAddup");
         if (null != shopAddUpModelMap && !shopAddUpModelMap.isEmpty()) {
            FirstYearShopAddUpModel firstYearShopAddUpModel = (FirstYearShopAddUpModel)shopAddUpModelMap.values().stream().findFirst().get();
            if (severActivityDay >= firstYearShopAddUpModel.getStageStart() && severActivityDay <= firstYearShopAddUpModel.getStageEnd()) {
               PlayerDao playerDao = this.player.getPlayerDao();
               if (DateUtil.isSameDay(playerDao.updateTime)) {
                  ActivityAnniversaryCelebrationDao dao = this.getDao();
                  PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
                  dao.dailyRecharge = playerRechargeDao.dailyRecharge;
                  dao.updateOp();
               }

               if (sendMsg) {
                  this.sendShopAddUpInfo();
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ShopAddUpInfo_22061(ActivityAnniversaryCelebrationMsg.C2S_ShopAddUpInfo_22061 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.shopAddUpRechargeHandle(true);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_22063(ActivityAnniversaryCelebrationMsg.C2S_ReceiveShopAddUpReward_22063 msg, String source) {
      int id = msg.getId();
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         FirstYearShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12632, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ActivityAnniversaryCelebrationMsg.S2C_ShopAddUpInfo_22062.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_ShopAddUpInfo_22062.newBuilder();
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, FirstYearShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            FirstYearShopAddUpModel model = (FirstYearShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      Map<Integer, FirstYearShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(FirstYearShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_FIRST_YEAR_SHOP_ADD_UP_MAIL);
         if (null != centreAwardModel) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 12632);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      FirstYearShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public FirstYearShopAddUpModel getShopAddUpModel(int id) {
      return (FirstYearShopAddUpModel)this.player.getGameModelPool().getEntity("FirstYearShopAddup", id);
   }

   public Map<Integer, FirstYearShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, FirstYearShopAddUpModel> modelMap = new HashMap();
      Map<Integer, FirstYearShopAddUpModel> allModel = this.player.getGameModelPool().getMap("FirstYearShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, FirstYearShopAddUpModel> entry : allModel.entrySet()) {
            FirstYearShopAddUpModel model = (FirstYearShopAddUpModel)entry.getValue();
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

   public void drawEnd() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
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
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_22021(ActivityAnniversaryCelebrationMsg.C2S_FancyReward_22021 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         FirstYearLotteryItemModel lotteryItemModel = (FirstYearLotteryItemModel)this.player.getGameModelPool().getEntity("FristYearLotteryItem", msg.getTargetId());
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
                  ActivityAnniversaryCelebrationMsg.S2C_FancyReward_22022.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_FancyReward_22022.newBuilder();
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
      Map<Integer, FirstYearLotteryItemModel> allMap = this.player.getGameModelPool().getMap("FristYearLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(FirstYearLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_22025(ActivityAnniversaryCelebrationMsg.C2S_Draw_22025 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         FirstYearLotteryCostModel costModel = (FirstYearLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("FristYearLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(50, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityAnniversaryCelebrationDao dao = this.getDao();
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
                     Map<Integer, FirstYearLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        FirstYearLotteryItemModel enjoyModel = (FirstYearLotteryItemModel)this.player.getGameModelPool().getEntity("FristYearLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           FirstYearLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           addList.addAll(itemModel.getRewards());
                        }

                        int createTime = DateUtil.getIntTime(System.currentTimeMillis());

                        for(ResourceModel resourceModel : resourceModels) {
                           ActivityAnniversaryCelebrationDao.RecordInfo recordInfo = new ActivityAnniversaryCelebrationDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 12634, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_FIRST_YEAR_DRAW, this.getActivityLogModule(), 12633, 0, 0, "");
                        playerResetCustomCache.addDailyReset(50, lotteryNum);
                        ActivityAnniversaryCelebrationMsg.S2C_Draw_22026.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_Draw_22026.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(50, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "周年庆-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, FirstYearLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, FirstYearLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("FristYearLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, FirstYearLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, FirstYearLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((FirstYearLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((FirstYearLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((FirstYearLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((FirstYearLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((FirstYearLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((FirstYearLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private FirstYearLotteryItemModel smashEgg(ActivityAnniversaryCelebrationDao dao, Map<Integer, FirstYearLotteryItemModel> itemModelMap) {
      Map<Integer, FirstYearLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(FirstYearLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(FirstYearLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_22023(ActivityAnniversaryCelebrationMsg.C2S_LuckDrawInfo_22023 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      ActivityAnniversaryCelebrationMsg.S2C_LuckDrawInfo_22024.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_LuckDrawInfo_22024.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(50, 0);
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
      builder.setOpenDay(this.getActivityOpenDay());
      this.player.sendMsg(builder.build());
   }

   public List<FirstYearLotteryItemModel> getDrawJackpot() {
      List<FirstYearLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, FirstYearLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, FirstYearLotteryItemModel>>getModelPoolMap("customFristYearLotteryItem");
      TreeMap<Integer, Map<Integer, FirstYearLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, FirstYearLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(FirstYearLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<FirstYearLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("周年庆活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         FirstYearLotteryItemModel model = (FirstYearLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         return (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
      }
   }

   private void recordServer(FirstYearLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadFirstYearRecord_4252.Builder builder = CrossMsg.S2CR_UploadFirstYearRecord_4252.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(model.getStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_22027(ActivityAnniversaryCelebrationMsg.C2S_OpenReward_22027 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         FirstYearLotteryReturnAwardModel awardModel = (FirstYearLotteryReturnAwardModel)ApplicationContextProvider.getModelPoolEntity("FristYearLotteryReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityAnniversaryCelebrationDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("周年庆活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("周年庆活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12635, 0, 0, "");
                  ActivityAnniversaryCelebrationMsg.S2C_OpenReward_22028.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_OpenReward_22028.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("周年庆活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_22029(ActivityAnniversaryCelebrationMsg.C2S_DrawRecord_22029 msg, String source) {
      ActivityAnniversaryCelebrationMsg.S2C_DrawRecord_22030.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_DrawRecord_22030.newBuilder();
      ActivityAnniversaryCelebrationDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ActivityAnniversaryCelebrationMsg.MyDrawRecord.Builder drawRecord = ActivityAnniversaryCelebrationMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_22031(ActivityAnniversaryCelebrationMsg.C2S_ServerDrawRecord_22031 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      FirstYearLotteryItemModel model = (FirstYearLotteryItemModel)this.player.getGameModelPool().getEntity("FristYearLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, FirstYearLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               FirstYearLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

               if (lotteryItemModel.getId() == lotteryId) {
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
               String infoStr = "{0}~{1}次抽中目标奖励，{2}次，占比{3}%";

               for(Map.Entry<Integer, DrawViewLogInfo> entry : drawViewLogInfoMap.entrySet()) {
                   logInfo = (DrawViewLogInfo)entry.getValue();
                  double proportion = (double)logInfo.getGetFancyNum() / (double)round * (double)100.0F;
                  String format = MessageFormat.format(infoStr, logInfo.getStartNum(), logInfo.getEndNum(), logInfo.getGetFancyNum(), proportion);
                  this.logger.info(format);
               }

               return true;
            }

            ++n;
         }
      }
   }

   private FirstYearLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, FirstYearLotteryItemModel> itemModelMap) {
      Map<Integer, FirstYearLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(FirstYearLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(FirstYearLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTask_22033(ActivityAnniversaryCelebrationMsg.C2S_GameTask_22033 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityFirstYearTaskPart taskPart = (ActivityFirstYearTaskPart)this.player.getMgrPart(ActivityFirstYearTaskPart.class);
         taskPart.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_GameTaskCommit_22035(ActivityAnniversaryCelebrationMsg.C2S_GameTaskCommit_22035 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityFirstYearTaskPart taskPart = (ActivityFirstYearTaskPart)this.player.getMgrPart(ActivityFirstYearTaskPart.class);
         taskPart.commit(msg.getTaskId());
      }
   }

   public void gameCityDailyReset() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();

      for(Map.Entry<Integer, FirstYearCityBuildData> entry : dao.building.entrySet()) {
         FirstYearCityBuildData value = (FirstYearCityBuildData)entry.getValue();
         value.dailyChallengeNum = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_GameMain_22038(ActivityAnniversaryCelebrationMsg.C2S_GameMain_22038 msg, String source) {
      this.sendGameMain();
   }

   @MsgHandlerAnno
   public void C2S_GameRollDice_22040(ActivityAnniversaryCelebrationMsg.C2S_GameRollDice_22040 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         if (dao.event.eventId > 0) {
            FirstYearEventModel firstYearEventModel = (FirstYearEventModel)ApplicationContextProvider.getModelPoolEntity("FristYearEvent", dao.event.eventId);
            if (firstYearEventModel != null && firstYearEventModel.getEventType() == 3) {
               this.player.failure(0);
               return;
            }
         }

         String diceItem;
         int num;
         if (msg.getType() == 1) {
            diceItem = "FristYearDiceID";
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

            diceItem = "FristYearGoldDiceID";
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
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      List<ResourceModel> rewardList = new ArrayList();
      FirstYearGridModel firstYearGridModel = this.eventMove(num);
      ActivityAnniversaryCelebrationMsg.S2C_GameRollDice_22041.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameRollDice_22041.newBuilder();
      resp.setGrid(dao.grid);
      dao.updateOp();
      resp.setType(type);
      resp.setNum(num);
      resp.setDiceRecover(dao.diceRecover);
      if (firstYearGridModel != null) {
         ActivityAnniversaryCelebrationMsg.GameEvent.Builder builder = this.triggerEvent(firstYearGridModel.getEventId(), firstYearGridModel.getParam(), rewardList);
         if (builder != null) {
            FirstYearEventModel firstYearEventModel = (FirstYearEventModel)ApplicationContextProvider.getModelPoolEntity("FristYearEvent", builder.getEventId());
            if (firstYearEventModel.getEventType() == 1) {
               resp.setEvent(builder);
               resp.setBuilding(dao.getBuildData(builder.getEventParam(0)).buildMsg());
            } else if (firstYearEventModel.getEventType() != 2) {
               resp.setEvent(builder);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_FIRST_YEAR_ACTIVITY_CITY_GAME, this.getActivityLogModule(), 12638, num, dao.grid, "");
      }

      this.player.triggerTask(722, 0, 1L, 1);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_GameAddRandomDice_22042(ActivityAnniversaryCelebrationMsg.C2S_GameAddRandomDice_22042 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.checkDiceCountRecover();
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         ActivityAnniversaryCelebrationMsg.S2C_GameAddRandomDice_22043.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameAddRandomDice_22043.newBuilder();
         resp.setDiceRecover(dao.diceRecover);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GameGoldDiceBuy_22044(ActivityAnniversaryCelebrationMsg.C2S_GameGoldDiceBuy_22044 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         String feeStr = ApplicationContextProvider.getConfigString("FristYearGoldDicePrice", "");
         List<ResourceModel> buyFeeList = ResourceModel.buildResources(feeStr);
         if (dao.buyGoldDiceNum >= buyFeeList.size()) {
            this.player.failure(25);
         } else {
            ResourceModel feeGold = (ResourceModel)buyFeeList.get(dao.buyGoldDiceNum);
            if (!this.player.checkResourceNum(feeGold)) {
               this.player.failure(31);
            } else {
               this.player.delResource(feeGold, this.getActivityLogModule(), 12637, 0, 0, "");
               ++dao.buyGoldDiceNum;
               dao.updateOp();
               this.addDice("FristYearGoldDiceID", 12637, 1);
               ActivityAnniversaryCelebrationMsg.S2C_GameGoldDiceBuy_22045.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameGoldDiceBuy_22045.newBuilder();
               resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GameEvent_22046(ActivityAnniversaryCelebrationMsg.C2S_GameEvent_22046 msg, String source) {
      if (!msg.hasEvent()) {
         this.player.failure(0);
      } else if (this.isServerActivityInvalid()) {
         this.player.failure(0);
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         FirstYearEventModel firstYearEventModel = (FirstYearEventModel)ApplicationContextProvider.getModelPoolEntity("FristYearEvent", msg.getEvent().getEventId());
         if (firstYearEventModel == null) {
            this.player.sendMsg(this.eventHandleDone(msg.getEvent(), dao.grid).build());
         } else {
            List<ResourceModel> rewardList = new ArrayList();
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            if (firstYearEventModel.getEventType() == 3) {
               ActivityAnniversaryCelebrationMsg.S2C_GameEvent_22047.Builder resp = this.eventHandleDone(msg.getEvent(), dao.grid);
               FirstYearGridModel firstYearGridModel = (FirstYearGridModel)ApplicationContextProvider.getModelPoolEntity("FristYearGrid", dao.grid);
               if (firstYearGridModel != null) {
                  ActivityAnniversaryCelebrationMsg.GameEvent.Builder nextEvent = this.triggerEvent(firstYearGridModel.getEventId(), firstYearGridModel.getParam(), rewardList);
                  if (nextEvent != null) {
                     FirstYearEventModel nextGameEventModel = (FirstYearEventModel)ApplicationContextProvider.getModelPoolEntity("FristYearEvent", nextEvent.getEventId());
                     if (nextGameEventModel.getEventType() == 1) {
                        resp.setNextEvent(nextEvent);
                        resp.setBuilding(dao.getBuildData(nextEvent.getEventParam(0)).buildMsg());
                     } else if (nextGameEventModel.getEventType() != 2) {
                        resp.setNextEvent(nextEvent);
                     }
                  }
               }

               this.player.sendMsg(resp.build());
               showType = PlayerMsg.ShowType.SHOW_FIRST_YEAR_ACTIVITY_CITY_GAME;
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
               this.player.addResource(rewardList, showType, this.getActivityLogModule(), 12641, msg.getEvent().getEventId(), 0, "");
            }

         }
      }
   }

   public void checkDiceCountRecover() {
      if (!this.isServerActivityInvalid()) {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int maxCount = ApplicationContextProvider.getConfigInt("FristYearDiceUpLimit", 0);
         int recoverTime = ApplicationContextProvider.getConfigInt("FristYearDiceTime", 10800);
         int diceNum = this.getDiceNum("FristYearDiceID");
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
               this.addDice("FristYearDiceID", 12642, addNum);
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
         int maxCount = ApplicationContextProvider.getConfigInt("FristYearDiceUpLimit", 0);
         int diceNum = this.getDiceNum("FristYearDiceID");
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         if (diceNum >= maxCount && dao.diceRecover > 0) {
            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (dao.diceRecover > curTime) {
               dao.diceMaxRecover = dao.diceRecover - curTime;
            } else {
               dao.diceMaxRecover = 0;
            }

            dao.diceRecover = 0;
            dao.updateOp();
            ActivityAnniversaryCelebrationMsg.S2C_GameAddRandomDice_22043.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameAddRandomDice_22043.newBuilder();
            resp.setDiceRecover(dao.diceRecover);
            this.player.sendMsg(resp.build());
         }

      }
   }

   public void updateGameRank(int num) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         if (activityInfo.drop > DateUtil.getIntTime(System.currentTimeMillis())) {
            ActivityAnniversaryCelebrationDao dao = this.getDao();
            int newPoint = dao.point + num;
            dao.point = newPoint;
            dao.updateOp();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_FIRST_YEAR, (long)newPoint, false);
         }
      }
   }

   private void resetDice(String initNumConfig, String itemConfig) {
      int initDiceNum = ApplicationContextProvider.getConfigInt(initNumConfig, 0);
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      int curNum = (int)this.player.getResourceNum(2, diceItem);
      if (curNum > initDiceNum) {
         this.player.delResource(2, diceItem, (long)(curNum - initDiceNum), this.getActivityLogModule(), 12640, 0, 0, "");
      } else if (curNum < initDiceNum) {
         this.player.addResource(2, diceItem, initDiceNum - curNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 12640, 0, 0, "");
      }

   }

   private int getDiceNum(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      return (int)this.player.getResourceNum(2, diceItem);
   }

   private void useDice(String itemConfig) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.delResource(2, diceItem, 1L, this.getActivityLogModule(), 12638, 0, 0, "");
   }

   private void addDice(String itemConfig, int reason, int num) {
      int diceItem = ApplicationContextProvider.getConfigInt(itemConfig, 0);
      this.player.addResource(2, diceItem, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), reason, 0, 0, "");
   }

   private ActivityAnniversaryCelebrationMsg.GameEvent.Builder triggerEvent(int eventId, List<Integer> param, List<ResourceModel> rewardList) {
      if (eventId <= 0) {
         return null;
      } else {
         Map<Integer, TreeMap<Integer, FirstYearEventModel>> eventMap = ApplicationContextProvider.<Integer, TreeMap<Integer, FirstYearEventModel>>getModelPoolMap("customFristYearEvent");
         FirstYearEventModel firstYearEventModel;
         if (eventId == 301) {
            List<FirstYearEventModel> luckyEvents = new ArrayList();
            TreeMap<Integer, FirstYearEventModel> id_model = (TreeMap)eventMap.get(eventId);
            if (param != null && param.size() > 0) {
               for(Integer id : param) {
                  luckyEvents.add(id_model.get(id));
               }
            } else {
               luckyEvents.addAll(id_model.values());
            }

            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < luckyEvents.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)((FirstYearEventModel)luckyEvents.get(index)).getRandOdd()));
            }

            WeightRandom<Integer> weightRandom = cn.hutool.core.util.RandomUtil.weightRandom(weightList);
            firstYearEventModel = (FirstYearEventModel)luckyEvents.get((Integer)weightRandom.next());
         } else {
            firstYearEventModel = (FirstYearEventModel)((TreeMap)eventMap.get(eventId)).firstEntry().getValue();
         }

         ActivityAnniversaryCelebrationDao dao = this.getDao();
         ActivityAnniversaryCelebrationMsg.GameEvent.Builder eventBuilder = null;
         switch (firstYearEventModel.getEventType()) {
            case 1:
               dao.event.eventId = firstYearEventModel.getId();
               dao.event.eventParams.clear();
               dao.event.eventParams.addAll(firstYearEventModel.getParam());
               eventBuilder = ActivityAnniversaryCelebrationMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams);
               break;
            case 2:
               eventBuilder = this.eventHandle(firstYearEventModel.getId(), firstYearEventModel.getParam(), rewardList);
               break;
            case 3:
               int moveNum = cn.hutool.core.util.RandomUtil.randomInt((Integer)firstYearEventModel.getParam().get(0), (Integer)firstYearEventModel.getParam().get(1) + 1);
               List<Integer> paramList = new ArrayList();
               paramList.add(moveNum);
               eventBuilder = this.eventHandle(firstYearEventModel.getId(), paramList, rewardList);
               break;
            case 4:
            case 6:
               dao.event.eventId = firstYearEventModel.getId();
               dao.event.eventParams.clear();
               eventBuilder = ActivityAnniversaryCelebrationMsg.GameEvent.newBuilder().setEventId(dao.event.eventId);
               break;
            case 5:
               dao.event.eventId = firstYearEventModel.getId();
               dao.event.eventParams.clear();
               Map<Integer, FirstYearShopModel> firstYearShopModelMap = ApplicationContextProvider.<Integer, FirstYearShopModel>getModelPoolMap("FristYearShop");
               List<KeyValFun> id_ratioList = new ArrayList();

               for(Map.Entry<Integer, FirstYearShopModel> entry : firstYearShopModelMap.entrySet()) {
                  Integer key = (Integer)entry.getKey();
                  FirstYearShopModel value = (FirstYearShopModel)entry.getValue();
                  id_ratioList.add(new KeyValFun(key, value.getRatio()));
               }

               Integer num = (Integer)firstYearEventModel.getParam().get(0);
               List<Integer> randomShopIds = new ArrayList();

               for(int i = 0; i < num; ++i) {
                  int id = GamePlayer.countRate(id_ratioList);
                  randomShopIds.add(id);
                  id_ratioList.removeIf((keyValFun) -> keyValFun.getKey() == id);
               }

               dao.event.eventParams.addAll(randomShopIds);
               eventBuilder = ActivityAnniversaryCelebrationMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams);
         }

         dao.updateOp();
         this.player.triggerTask(718, eventId, 1L, 1);
         return eventBuilder;
      }
   }

   private ActivityAnniversaryCelebrationMsg.GameEvent.Builder eventHandle(int eventId, List<Integer> eventParams, List<ResourceModel> rewardList) {
      ActivityAnniversaryCelebrationMsg.GameEvent.Builder builder = ActivityAnniversaryCelebrationMsg.GameEvent.newBuilder();
      builder.setEventId(eventId);
      FirstYearEventModel firstYearEventModel = (FirstYearEventModel)ApplicationContextProvider.getModelPoolEntity("FristYearEvent", eventId);
      if (firstYearEventModel == null) {
         return builder;
      } else {
         switch (firstYearEventModel.getEventType()) {
            case 1:
               this.eventBuildArrive(firstYearEventModel, rewardList);
               builder.addAllEventParam(eventParams);
               break;
            case 2:
               for(ResourceModel reward : firstYearEventModel.getRewards()) {
                  reward.addResourceToList(rewardList);
               }
               break;
            case 3:
               this.eventMove((Integer)eventParams.get(0));
               builder.addAllEventParam(eventParams);
               break;
            case 4:
               if ((Integer)eventParams.get(0) > 0) {
                  this.eventBattle(firstYearEventModel.getId());
               }
               break;
            case 5:
               if ((Integer)eventParams.get(0) > 0 && !this.eventBuy(firstYearEventModel.getId(), rewardList)) {
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
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         ActivityAnniversaryCelebrationMsg.S2C_GameMain_22039.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameMain_22039.newBuilder();
         resp.setGrid(dao.grid);
         resp.setDiceRecover(dao.diceRecover);
         resp.setBuyGoldDiceNum(dao.buyGoldDiceNum);
         Map<Integer, TreeMap<Integer, FirstYearSiteModel>> buildingMap = ApplicationContextProvider.<Integer, TreeMap<Integer, FirstYearSiteModel>>getModelPoolMap("customFristYearSite");

         for(int buildId : buildingMap.keySet()) {
            FirstYearCityBuildData cityBuildData = dao.getBuildData(buildId);
            if (cityBuildData != null) {
               resp.addBuilding(cityBuildData.buildMsg());
            } else {
               resp.addBuilding(ActivityAnniversaryCelebrationMsg.GameBuilding.newBuilder().setBuildId(buildId).setLv(0).setDailyChallengeNum(0));
            }
         }

         if (dao.event.eventId > 0) {
            resp.setEvent(ActivityAnniversaryCelebrationMsg.GameEvent.newBuilder().setEventId(dao.event.eventId).addAllEventParam(dao.event.eventParams));
         }

         resp.addAllMakeUpReceiveId(dao.makeUpReceiveIds);
         resp.setPointLv(dao.pointLv);
         this.player.sendMsg(resp.build());
      }
   }

   private ActivityAnniversaryCelebrationMsg.S2C_GameEvent_22047.Builder eventHandleDone(ActivityAnniversaryCelebrationMsg.GameEvent gameEvent, int grid) {
      ActivityAnniversaryCelebrationMsg.S2C_GameEvent_22047.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameEvent_22047.newBuilder();
      resp.setEvent(gameEvent);
      resp.setGrid(grid);
      return resp;
   }

   public void uploadFirstYearTreasureNum() {
      CrossMsg.S2CR_UploadFirstYearTreasureNum_4253.Builder builder = CrossMsg.S2CR_UploadFirstYearTreasureNum_4253.newBuilder();
      builder.setServerId(this.player.getServerId());
      builder.setPlayerId(this.player.getPlayerId());
      builder.setFirstYearTreasureNum(this.getAllActTreasureNum());
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public long getAllActTreasureNum() {
      List<ItemModel> itemModelList = (List)ApplicationContextProvider.getModelPoolEntity("customTargetClassItem", 20);
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
      List<ItemModel> itemModelList = (List)ApplicationContextProvider.getModelPoolEntity("customTargetClassItem", 20);
      if (null != itemModelList && !itemModelList.isEmpty()) {
         for(ItemModel itemModel : itemModelList) {
            this.player.delResourceAllNum(2, itemModel.getId(), this.getActivityLogModule(), 12650, 0, 0, "");
         }

         this.uploadFirstYearTreasureNum();
      }
   }

   private void eventBuildArrive(FirstYearEventModel firstYearEventModel, List<ResourceModel> rewardList) {
      int buildId = (Integer)firstYearEventModel.getParam().get(0);
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      FirstYearCityBuildData firstYearCityBuildData = dao.getBuildData(buildId);
      if (null == firstYearCityBuildData) {
         this.logger.error("FirstYearSite缺少建筑类型 type:{}", buildId);
      } else {
         FirstYearSiteModel firstYearSiteModel = this.getFirstYearSiteModel(buildId, firstYearCityBuildData.lv);
         if (null != firstYearSiteModel) {
            if (!firstYearSiteModel.getStrikeReward().isEmpty()) {
               for(ResourceModel resourceModel : firstYearSiteModel.getStrikeReward()) {
                  resourceModel.addResourceToList(rewardList);
               }
            }

            if (!firstYearSiteModel.getCharacter().isEmpty()) {
               int quality = -1;
               List<KeyValFun> qualityKeyValFunList = new ArrayList();
               Map<Integer, Integer> quality_moneyNum = new HashMap();

               for(String quality_weightStr : firstYearSiteModel.getCharacter()) {
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
                  List<ItemModel> itemModelList = (List)ApplicationContextProvider.getModelPoolEntity("customTargetClassItem", 20);
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
                        int treasureMoneyItemId = ApplicationContextProvider.getConfigInt("FristYearBoomPoint", 6881);
                        ResourceModel treasureMoney = new ResourceModel(2, treasureMoneyItemId, treasureMoneyNum);
                        treasureMoney.addResourceToList(rewardList);
                     }
                  }
               }
            }

         }
      }
   }

   private FirstYearGridModel eventMove(int num) {
      if (num <= 6 && num >= -6) {
         Map<Integer, FirstYearGridModel> monopolyMapModel = ApplicationContextProvider.<Integer, FirstYearGridModel>getModelPoolMap("FristYearGrid");
         if (monopolyMapModel != null && !monopolyMapModel.isEmpty()) {
            ActivityAnniversaryCelebrationDao dao = this.getDao();
            int curGrid = dao.grid + num;
            if (curGrid < 0) {
               curGrid += monopolyMapModel.size();
            } else if (curGrid > monopolyMapModel.size()) {
               curGrid -= monopolyMapModel.size();
               this.player.triggerTask(717, this.getPlayerActivityId(), 1L, 1);
            }

            FirstYearGridModel firstYearGridModel = (FirstYearGridModel)monopolyMapModel.get(curGrid);
            if (firstYearGridModel == null) {
               return null;
            } else {
               dao.grid = curGrid;
               dao.updateOp();
               return firstYearGridModel;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void eventBattle(int eventId) {
      Map<Integer, FirstYearBattleModel> greatCityGameBattleModelMap = ApplicationContextProvider.<Integer, FirstYearBattleModel>getModelPoolMap("FristYearBattle");
      if (greatCityGameBattleModelMap != null && !greatCityGameBattleModelMap.isEmpty()) {
         TreeSet<Integer> greatCityGameBattleIds = new TreeSet(greatCityGameBattleModelMap.keySet());
         FirstYearBattleModel matchModel = null;

         for(int id : greatCityGameBattleIds) {
            FirstYearBattleModel firstYearBattleModel = (FirstYearBattleModel)greatCityGameBattleModelMap.get(id);
            if (this.player.getMaxPlayerCombatPower() >= (long)firstYearBattleModel.getPowerStart() && this.player.getMaxPlayerCombatPower() <= (long)firstYearBattleModel.getPowerEnd()) {
               matchModel = firstYearBattleModel;
               break;
            }
         }

         if (matchModel == null) {
            matchModel = (FirstYearBattleModel)greatCityGameBattleModelMap.get(greatCityGameBattleIds.last());
         }

         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         BattleMsg.C2S_BattleBegin_6107.Builder builder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
         builder.setModelId(matchModel.getId());
         builder.setType(6116);
         builder.addParams(eventId);
         battlePart.begin(builder.build(), "");
      }
   }

   public int enterBattle(BattleDao battleDao) {
      FirstYearBattleModel firstYearBattleModel = (FirstYearBattleModel)ApplicationContextProvider.getModelPoolEntity("FristYearBattle", battleDao.modelId);
      BattlePKTeam rightTeam = new BattlePKTeam(firstYearBattleModel.getBattleId());
      battleDao.scene.addPKTeam((byte)1, rightTeam);
      battleDao.scene.setMaxRound((byte)firstYearBattleModel.getRound());
      battleDao.scene.setBattleId(firstYearBattleModel.getBattleId());
      return 1;
   }

   public void afterBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         FirstYearBattleModel firstYearBattleModel = (FirstYearBattleModel)ApplicationContextProvider.getModelPoolEntity("FristYearBattle", battleDao.modelId);
         battleDao.rewards.addAll(firstYearBattleModel.getRewards());
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
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12641, (Integer)battleDao.params.get(0), battleDao.modelId, "");
      }
   }

   private boolean eventBuy(int eventId, List<ResourceModel> rewardList) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      List<ResourceModel> feeResourceList = new ArrayList();

      for(int eventParam : dao.event.eventParams) {
         FirstYearShopModel greatCityGameRandomShopModel = (FirstYearShopModel)ApplicationContextProvider.getModelPoolEntity("FristYearShop", eventParam);
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
         this.player.delResource((List)feeResourceList, this.getActivityLogModule(), 12641, eventId, 0, "");
         return true;
      }
   }

   private void eventGrant(int grantIndex, List<ResourceModel> rewardList) {
      Map<Integer, FirstYearSelectRewardModel> firstYearSelectRewardModelMap = ApplicationContextProvider.<Integer, FirstYearSelectRewardModel>getModelPoolMap("FristYearSelectReward");
      if (firstYearSelectRewardModelMap != null && !firstYearSelectRewardModelMap.isEmpty()) {
         List<FirstYearSelectRewardModel> firstYearSelectRewardModels = new ArrayList(firstYearSelectRewardModelMap.values());
         Collections.shuffle(firstYearSelectRewardModels);
         ResourceModel rewardModel = (ResourceModel)((FirstYearSelectRewardModel)firstYearSelectRewardModels.get(0)).getRewards().get(grantIndex);
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
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_FIRST_YEAR_DRAW, this.getActivityLogModule(), 12638, eventId, 0, "");
            }
            break;
         case "rolldice":
            this.rollDice(2, Integer.parseInt(split[1]));
      }

      this.sendGameMain();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveMakeUpReward_22083(ActivityAnniversaryCelebrationMsg.C2S_ReceiveMakeUpReward_22083 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         FirstYearMakeUpModel makeUpModel = (FirstYearMakeUpModel)ApplicationContextProvider.getModelPoolEntity("FristYearMakeUP", msg.getId());
         if (null == makeUpModel) {
            return this.player.failure(37);
         } else {
            ActivityAnniversaryCelebrationDao dao = this.getDao();
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
                  this.player.addResource(makeUpModel.getMakeitem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12644, 0, 0, "");
                  ActivityAnniversaryCelebrationMsg.S2C_ReceiveMakeUpReward_22084.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_ReceiveMakeUpReward_22084.newBuilder();
                  resp.addAllMakeUpReceiveId(dao.makeUpReceiveIds);
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_PointLvUp_22085(ActivityAnniversaryCelebrationMsg.C2S_PointLvUp_22085 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(6);
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         FirstYearLevelTaskModel nextLevelTaskModel = (FirstYearLevelTaskModel)ApplicationContextProvider.getModelPoolEntity("FristYearLevelTask", dao.pointLv + 1);
         if (null == nextLevelTaskModel) {
            return this.player.failure(6);
         } else {
            for(Integer taskId : nextLevelTaskModel.getTaskId()) {
               TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ACT_FIRST_YEAR, taskId);
               if (null == taskData || taskData.state < 2) {
                  return this.player.failure(76031);
               }
            }

            ++dao.pointLv;
            dao.updateOp();
            this.player.addResource(nextLevelTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12645, 0, 0, "");
            ActivityAnniversaryCelebrationMsg.S2C_PointLvUp_22086.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_PointLvUp_22086.newBuilder();
            resp.setPointLv(dao.pointLv);
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public FirstYearSiteModel getFirstYearSiteModel(int type, int level) {
      ConcurrentHashMap<Integer, FirstYearSiteModel> firstYearSiteModelMap = this.getFirstYearSiteModelMap(type);
      return null == firstYearSiteModelMap ? null : (FirstYearSiteModel)firstYearSiteModelMap.get(level);
   }

   public ConcurrentHashMap<Integer, FirstYearSiteModel> getFirstYearSiteModelMap(int type) {
      return (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customFristYearSite", type);
   }

   @MsgHandlerAnno
   public boolean C2S_BuildLvUp_22090(ActivityAnniversaryCelebrationMsg.C2S_BuildLvUp_22090 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         FirstYearCityBuildData firstYearCityBuildData = dao.getBuildData(msg.getBuildId());
         if (null == firstYearCityBuildData) {
            return this.player.failure(6);
         } else {
            int nextLv = firstYearCityBuildData.lv + 1;
            FirstYearSiteModel firstYearSiteModel = this.getFirstYearSiteModel(msg.getBuildId(), nextLv);
            if (null == firstYearSiteModel) {
               return this.player.failure(37);
            } else if (!this.player.checkResourceNum(firstYearSiteModel.getLeveItem())) {
               return this.player.failure(76135);
            } else {
               this.player.delResource((List)firstYearSiteModel.getLeveItem(), this.getActivityLogModule(), 12646, 0, 0, "");
               firstYearCityBuildData.lv = firstYearSiteModel.getLevel();
               firstYearCityBuildData.subjectList.clear();
               FirstYearCityChallengeData challengeData = dao.challengeData;
               if (null != challengeData && challengeData.buildId == firstYearCityBuildData.buildId) {
                  dao.challengeData = null;
               }

               dao.updateOp();
               this.triggerTaskAllBuildLvUp();
               ActivityAnniversaryCelebrationMsg.S2C_BuildLvUp_22091.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_BuildLvUp_22091.newBuilder();
               resp.setBuildId(msg.getBuildId());
               resp.setBuildLv(firstYearSiteModel.getLevel());
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   public void triggerTaskAllBuildLvUp() {
      Map<Integer, ConcurrentHashMap<Integer, FirstYearSiteModel>> modelMap = ApplicationContextProvider.<Integer, ConcurrentHashMap<Integer, FirstYearSiteModel>>getModelPoolMap("customFristYearSite");
      Set<Integer> buildIdSet = modelMap.keySet();
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      Map<Integer, FirstYearCityBuildData> building = dao.building;
      if (buildIdSet.size() > building.size()) {
         this.player.triggerTask(716, this.getPlayerActivityId(), 0L, 0);
      } else {
         int minBuildLv = 999;

         for(Map.Entry<Integer, FirstYearCityBuildData> entry : building.entrySet()) {
            FirstYearCityBuildData value = (FirstYearCityBuildData)entry.getValue();
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
         List<FirstYearSubjectModel> allList = (List)ApplicationContextProvider.getModelPoolEntity("customFristYearSubject", type);
         if (allList != null && !allList.isEmpty()) {
            List<KeyValFun> id_ratioList = new ArrayList();

            for(FirstYearSubjectModel model : allList) {
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
      FirstYearSiteModel firstYearSiteModel = this.getFirstYearSiteModel(type, challengeLv);
      int targetValue = firstYearSiteModel.getTargetValue();
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
   public boolean C2S_BuildChallenge_22092(ActivityAnniversaryCelebrationMsg.C2S_BuildChallenge_22092 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      }

      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.challengeData = null;
      dao.updateOp();
      FirstYearCityBuildData buildData = dao.getBuildData(msg.getBuildId());
      if (null != buildData && buildData.lv >= msg.getBuildLv()) {
         if (buildData.rewardLv.contains(msg.getBuildLv())) {
            return this.player.failure(76180);
         } else {
            List<SubjectData> challengeSubjectList = this.getChallengeSubjectList(msg.getBuildId(), msg.getBuildLv());
            if (null != challengeSubjectList && !challengeSubjectList.isEmpty()) {
               buildData.subjectList.clear();
               buildData.subjectList.addAll(challengeSubjectList);
               dao.updateOp();
               FirstYearCityChallengeData challengeData = new FirstYearCityChallengeData(msg.getBuildId(), msg.getBuildLv());
               dao.challengeData = challengeData;
               dao.updateOp();
               ActivityAnniversaryCelebrationMsg.S2C_BuildChallenge_22093.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_BuildChallenge_22093.newBuilder();
               resp.setBuildId(msg.getBuildId());

               for(SubjectData subject : buildData.subjectList) {
                  ActivityAnniversaryCelebrationMsg.ChallengeData.Builder challengeDataBuilder = ActivityAnniversaryCelebrationMsg.ChallengeData.newBuilder();
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
   public boolean C2S_BuildAnswer_22094(ActivityAnniversaryCelebrationMsg.C2S_BuildAnswer_22094 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(6);
      } else {
         long currentTimeMillis = System.currentTimeMillis();
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         FirstYearCityChallengeData challengeData = dao.challengeData;
         if (null != challengeData && challengeData.buildId == msg.getBuildId() && challengeData.buildLv == msg.getBuildLv()) {
            if (this.checkAnswerCommitFinish(msg.getBuildId())) {
               return this.player.failure(76179);
            } else {
               FirstYearCityBuildData firstYearCityBuildData = dao.getBuildData(msg.getBuildId());
               if (firstYearCityBuildData.rewardLv.contains(msg.getBuildLv())) {
                  return this.player.failure(76180);
               } else {
                  if (challengeData.answerList.size() <= 0) {
                     ++firstYearCityBuildData.dailyChallengeNum;
                     dao.updateOp();
                  }

                  FirstYearSiteModel firstYearSiteModel = this.getFirstYearSiteModel(msg.getBuildId(), msg.getBuildLv());
                  if (null == firstYearSiteModel) {
                     return this.player.failure(37);
                  } else {
                     ActivityAnniversaryCelebrationMsg.S2C_BuildAnswer_22095.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_BuildAnswer_22095.newBuilder();
                     long cd = currentTimeMillis - challengeData.lastCommitTime;
                     long targetCd = (long)(firstYearSiteModel.getCd() + 3000);
                     if (firstYearSiteModel.getCd() > 0 && cd > targetCd) {
                        challengeData.answerList.add(new SubjectData(-1, 0));
                        challengeData.lastCommitTime = System.currentTimeMillis() + (long)firstYearSiteModel.getAccountCd();
                        dao.updateOp();
                        resp.setAnswerState(0);
                     } else {
                        ActivityAnniversaryCelebrationMsg.ChallengeData answer = msg.getAnswer();
                        SubjectData subjectData = new SubjectData(answer.getParam1(), answer.getParam2());
                        challengeData.answerList.add(subjectData);
                        challengeData.lastCommitTime = System.currentTimeMillis() + (long)firstYearSiteModel.getAccountCd();
                        dao.updateOp();
                        boolean checkAnswerRight = this.checkAnswerRight(msg.getBuildId(), subjectData, challengeData.answerList.size() - 1);
                        if (checkAnswerRight) {
                           resp.setAnswerState(1);
                        } else {
                           resp.setAnswerState(0);
                        }
                     }

                     if (this.checkAnswerAllRight(msg.getBuildId())) {
                        firstYearCityBuildData.subjectList.clear();
                        this.player.addResource(firstYearSiteModel.getRewardItem(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 126, 12648, 0, 0, "");
                        firstYearCityBuildData.rewardLv.add(firstYearSiteModel.getLevel());
                        dao.updateOp();
                        this.sendGameMain();
                     }

                     int challengeState = 0;
                     if (this.checkAnswerCommitFinish(msg.getBuildId())) {
                        resp.setNextSubjectIndex(-1);
                        challengeState = firstYearCityBuildData.rewardLv.contains(msg.getBuildLv()) ? 1 : 2;
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
   }

   public boolean checkAnswerAllRight(int buildId) {
      if (this.checkAnswerCommitFinish(buildId)) {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
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
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      FirstYearCityBuildData buildData = dao.getBuildData(buildId);
      if (null != buildData && buildData.subjectList.size() >= subjectIndex + 1) {
         SubjectData subject = (SubjectData)buildData.subjectList.get(subjectIndex);
         switch (buildId) {
            case 1:
            case 2:
               FirstYearSubjectModel subjectModel = (FirstYearSubjectModel)ApplicationContextProvider.getModelPoolEntity("FristYearSubject", subject.param1);
               if (null == subjectModel) {
                  this.logger.error("FirstYearSubject 缺少配置 id:{}", subject);
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
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      FirstYearCityBuildData buildData = dao.getBuildData(buildId);
      if (null == buildData) {
         return true;
      } else {
         FirstYearCityChallengeData challengeData = dao.challengeData;
         if (null == challengeData) {
            return true;
         } else {
            List<SubjectData> subjectIdList = buildData.subjectList;
            return subjectIdList == null || subjectIdList.isEmpty() || subjectIdList.size() <= challengeData.answerList.size();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GetOnHookSecond_22096(ActivityAnniversaryCelebrationMsg.C2S_GetOnHookSecond_22096 msg, String source) {
      ActivityAnniversaryCelebrationMsg.S2C_GetOnHookSecond_22097.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GetOnHookSecond_22097.newBuilder();
      resp.setOnHookSecond(this.getOnHookSecond());
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveOnHookReward_22098(ActivityAnniversaryCelebrationMsg.C2S_ReceiveOnHookReward_22098 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(6);
      } else {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         Map<Integer, FirstYearCityBuildData> building = dao.building;
         List<ResourceModel> rewardList = new ArrayList();
         long onHookSecond = this.getOnHookSecond();
         int onHookHour = (int)(onHookSecond / 3600L);
         if (onHookHour < 1) {
            return this.player.failure(6);
         } else {
            for(Map.Entry<Integer, FirstYearCityBuildData> entry : building.entrySet()) {
               FirstYearCityBuildData value = (FirstYearCityBuildData)entry.getValue();
               FirstYearSiteModel firstYearSiteModel = this.getFirstYearSiteModel(value.buildId, value.lv);
               if (null != firstYearSiteModel) {
                  int pointItemId = this.configManager.getIntDefault("FristYearBoomPoint", 6881);
                  int num = onHookHour * firstYearSiteModel.getProfit();
                  ResourceModel reward = new ResourceModel(2, pointItemId, num);
                  reward.addResourceToList(rewardList);
               }
            }

            if (rewardList.isEmpty()) {
               return this.player.failure(6);
            } else {
               this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12649, 0, 0, "");
               long remainderSecond = onHookSecond % 3600L;
               dao.onHookSecond = remainderSecond;
               dao.updateOp();
               ActivityAnniversaryCelebrationMsg.S2C_ReceiveOnHookReward_22099.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_ReceiveOnHookReward_22099.newBuilder();
               resp.setOnHookSecond(dao.onHookSecond);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AnniversaryAddUpGold_22051(ActivityAnniversaryCelebrationMsg.C2S_AnniversaryConsumeGold_22051 msg, String source) {
      this.sendConsumeInfo();
   }

   @MsgHandlerAnno
   public void C2S_AnniversaryGetReward_22053(ActivityAnniversaryCelebrationMsg.C2S_AnniversaryGetReward_22053 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         AnniversaryConsumeActivityModel consumeActivityModel = (AnniversaryConsumeActivityModel)ApplicationContextProvider.getModelPoolEntity("FirstYearCostAward", id);
         if (consumeActivityModel == null) {
            this.logger.error("周年庆消费狂欢，不存在对应奖励id：{}", id);
         } else {
            if (this.checkResource(id, consumeActivityModel)) {
               ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
               activityAnniversaryCelebrationDao.hadGotRewards.add(id);
               activityAnniversaryCelebrationDao.updateOp();
               this.player.addResource(consumeActivityModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 126, 12605, 0, 0, "");
               ActivityAnniversaryCelebrationMsg.S2C_AnniversaryGetReward_22054.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_AnniversaryGetReward_22054.newBuilder();
               this.player.sendMsg(builder.setId(id).build());
            }

         }
      }
   }

   private void handleConsumeFirstOpen() {
      if (!this.isServerActivityInvalid()) {
         ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
         if (activityAnniversaryCelebrationDao.cumulativeStage == 0 || activityAnniversaryCelebrationDao.cumulativeStage == -2) {
            this.resetDailyConsumeActivity();
         }

      }
   }

   private void sendConsumeInfo() {
      ActivityAnniversaryCelebrationMsg.S2C_AnniversaryConsumeGoldInfo_22052.Builder respInfo = ActivityAnniversaryCelebrationMsg.S2C_AnniversaryConsumeGoldInfo_22052.newBuilder();
      ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
      respInfo.setCumulativeSpend(activityAnniversaryCelebrationDao.cumulativeSpend);
      respInfo.addAllHadGotRewards(activityAnniversaryCelebrationDao.hadGotRewards);
      respInfo.setServerOpenDay(this.getPlayerActivityOpenDay());
      respInfo.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(respInfo.build());
   }

   private void resetDailyConsumeActivity() {
      List<AnniversaryConsumeActivityModel> availableModels = this.getAvailableModels();
      if (availableModels != null) {
         int nowStage = this.getNowStage(availableModels);
         ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
         if (activityAnniversaryCelebrationDao.cumulativeStage != nowStage) {
            if (activityAnniversaryCelebrationDao.cumulativeStage != -2 && activityAnniversaryCelebrationDao.cumulativeStage != 0) {
               this.sendNotReceive(availableModels, false);
            }

            activityAnniversaryCelebrationDao.cumulativeStage = nowStage;
            activityAnniversaryCelebrationDao.cumulativeSpend = 0;
            activityAnniversaryCelebrationDao.hadGotRewards.clear();
            activityAnniversaryCelebrationDao.updateOp();
         }

      }
   }

   private void sendNotReceive(List<AnniversaryConsumeActivityModel> availableModels, boolean isActivityEnd) {
      List<ResourceModel> notReceiveRewards = new ArrayList();
      ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
      int cumulativeSpend = activityAnniversaryCelebrationDao.cumulativeSpend;
      int stage = activityAnniversaryCelebrationDao.cumulativeStage;
      Set<Integer> hadGotRewards = activityAnniversaryCelebrationDao.hadGotRewards;

      for(AnniversaryConsumeActivityModel availableModel : availableModels) {
         if (cumulativeSpend >= availableModel.getYuanBaoCost() && !hadGotRewards.contains(availableModel.getId()) && stage == availableModel.getStage()) {
            notReceiveRewards.addAll(availableModel.getRewards());
         }
      }

      if (!notReceiveRewards.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> treeMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_FIRST_YEAR_CONSUME_RETURN_MAIL);
         if (null != treeMap) {
            CentreAwardModel awardModel = (CentreAwardModel)treeMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            int logReason = 12605;
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), notReceiveRewards, 604800000L, logReason, logReason);
         }
      }

      if (isActivityEnd) {
         activityAnniversaryCelebrationDao.cumulativeStage = 0;
         activityAnniversaryCelebrationDao.hadGotRewards.clear();
         activityAnniversaryCelebrationDao.cumulativeSpend = 0;
         activityAnniversaryCelebrationDao.updateOp();
      }

   }

   private boolean checkResource(int id, AnniversaryConsumeActivityModel model) {
      if (model == null) {
         return false;
      } else if (this.isServerActivityInvalid()) {
         return false;
      } else {
         int activityStartDay = this.getPlayerActivityOpenDay();
         Predicate<Integer> predicate = (day) -> day >= model.getDateStart() && day <= model.getDateEnd() || day >= model.getDateStart() && model.getDateEnd() == -1;
         if (!predicate.test(activityStartDay)) {
            return false;
         } else {
            ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
            if (activityAnniversaryCelebrationDao.hadGotRewards.contains(id)) {
               return false;
            } else if (activityAnniversaryCelebrationDao.cumulativeStage != model.getStage()) {
               return false;
            } else {
               return model.getYuanBaoCost() <= activityAnniversaryCelebrationDao.cumulativeSpend;
            }
         }
      }
   }

   private void consumeActivityEnd() {
      List<AnniversaryConsumeActivityModel> availableModels = this.getAvailableModels();
      if (availableModels != null) {
         this.sendNotReceive(availableModels, true);
      }
   }

   private List<AnniversaryConsumeActivityModel> getAvailableModels() {
      Map<Integer, AnniversaryConsumeActivityModel> consumeActivityModels = ApplicationContextProvider.<Integer, AnniversaryConsumeActivityModel>getModelPoolMap("FirstYearCostAward");
      if (consumeActivityModels != null && !consumeActivityModels.isEmpty()) {
         List<AnniversaryConsumeActivityModel> result = new ArrayList();
         int serverOpenDay = this.getPlayerActivityOpenDay();

         for(AnniversaryConsumeActivityModel model : consumeActivityModels.values()) {
            if (serverOpenDay >= model.getDateStart() && serverOpenDay <= model.getDateEnd() || serverOpenDay >= model.getDateStart() && model.getDateEnd() == -1) {
               result.add(model);
            }
         }

         return result;
      } else {
         return null;
      }
   }

   private int getNowStage(List<AnniversaryConsumeActivityModel> list) {
      int activityDay = this.getSeverActivityDay();

      for(AnniversaryConsumeActivityModel model : list) {
         if (activityDay >= model.getStageStart() && activityDay <= model.getStageEnd()) {
            return model.getStage();
         }
      }

      return -2;
   }

   public void countConsume(long cost) {
      if (!this.isServerActivityInvalid() && cost < 0L) {
         ActivityAnniversaryCelebrationDao activityAnniversaryCelebrationDao = this.getDao();
         if (activityAnniversaryCelebrationDao.cumulativeStage != -2 && activityAnniversaryCelebrationDao.cumulativeStage != 0) {
            cost = -cost;
            activityAnniversaryCelebrationDao.cumulativeSpend = (int)((long)activityAnniversaryCelebrationDao.cumulativeSpend + cost);
            activityAnniversaryCelebrationDao.updateOp();
            this.sendConsumeInfo();
         }

      }
   }

   public ResourceModel activityDrop(int minute) {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo == null) {
         return null;
      } else if (activityInfo.id > 0 && activityInfo.drop >= DateUtil.getIntTime(System.currentTimeMillis())) {
         ActivityDropModel activityDropModel = (ActivityDropModel)ApplicationContextProvider.getModelPoolEntity("activityDrop", activityInfo.id);
         if (activityDropModel == null) {
            return null;
         } else {
            int dropNum = minute * 60 / activityDropModel.getDropTime();
            return dropNum <= 0 ? null : new ResourceModel(activityDropModel.getPropertyPropsType(), activityDropModel.getPropertyPropsId(), dropNum);
         }
      } else {
         return null;
      }
   }

   public void sendTreasureInfo() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      ActivityAnniversaryCelebrationMsg.S2C_TreasureTaskInfo_22072.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_TreasureTaskInfo_22072.newBuilder();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      builder.setLevel(dao.treasureLv);
      Map<Integer, Map<Integer, FirstYearTreasureTaskModel>> allTaskModel = ApplicationContextProvider.<Integer, Map<Integer, FirstYearTreasureTaskModel>>getModelPoolMap("customFirstYearBaojianTask");
      FirstYearTreasureTaskPart taskPart = (FirstYearTreasureTaskPart)this.player.getMgrPart(FirstYearTreasureTaskPart.class);
      Map<Integer, TaskData> taskDataMap = taskPart.getTasksMap();

      for(Map.Entry<Integer, TaskGroupData> entry : dao.treasureTaskGroup.entrySet()) {
         TaskGroupData taskGroupData = (TaskGroupData)entry.getValue();
         ActivityAnniversaryCelebrationMsg.TreasureTaskGroupDate.Builder groupDataMsg = ActivityAnniversaryCelebrationMsg.TreasureTaskGroupDate.newBuilder();
         groupDataMsg.setStepId((Integer)entry.getKey());
         groupDataMsg.setEndTime(taskGroupData.end);
         Map<Integer, FirstYearTreasureTaskModel> modelMap = (Map)allTaskModel.get(entry.getKey());

         for(TaskData taskData : taskDataMap.values()) {
            if (modelMap.containsKey(taskData.id)) {
               groupDataMsg.addTask(taskPart.buildTask(taskData));
            }
         }

         builder.addTaskGroupData(groupDataMsg);
      }

      this.player.sendMsg(builder.build());
   }

   private FirstYearTreasureLevelModel getTreasureLevelModel(int level) {
      Map<Integer, FirstYearTreasureLevelModel> modelMap = ApplicationContextProvider.<Integer, FirstYearTreasureLevelModel>getModelPoolMap("FirstYearBaojianLevel");
      TreeMap<Integer, FirstYearTreasureLevelModel> treeMap = new TreeMap(modelMap);
      FirstYearTreasureLevelModel lastModel = (FirstYearTreasureLevelModel)treeMap.lastEntry().getValue();
      return level > lastModel.getLv() ? lastModel : (FirstYearTreasureLevelModel)modelMap.get(level);
   }

   public boolean checkUpgrade(List<ResourceModel> resourceModels) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      FirstYearTreasureLevelModel levelModel = this.getTreasureLevelModel(dao.treasureLv);
      int numLimit = 0;
      int materialId = ApplicationContextProvider.getConfigInt("BaojianScore", 6970);
      int oriLevel = dao.treasureLv;

      while(this.player.checkResourceNum(2, materialId, levelModel.getNum())) {
         this.player.delResource(2, materialId, (long)levelModel.getNum(), 126, 12606, dao.treasureLv, 0, "");
         ++dao.treasureLv;
         levelModel = this.getTreasureLevelModel(dao.treasureLv);
         ++numLimit;
         if (numLimit > 10) {
            this.logger.error("【周年庆】- 琉璃宝鉴一下提升了{}级，请检查是否逻辑出错了 playerId:{}", numLimit, this.player.getPlayerId());
            break;
         }
      }

      dao.updateOp();
      boolean isUpgrade = dao.treasureLv > oriLevel;
      if (dao.treasureLv > oriLevel) {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.levelRewardList(resourceModels, dao.treasureLv, oriLevel, playerDao.first_year_treasure > 0);
         this.updateTreasureData();
      }

      return isUpgrade;
   }

   private void levelRewardList(List<ResourceModel> rewardList, int level, int gotLv, boolean isPrivilege) {
      for(int i = gotLv + 1; i <= level; ++i) {
         this.levelReward(rewardList, i, isPrivilege);
      }

   }

   private void levelReward(List<ResourceModel> allRewardList, int level, boolean isPrivilege) {
      this.heroLvReward(allRewardList, level);
      if (isPrivilege) {
         this.marquisLvReward(allRewardList, level);
      }

   }

   private void heroLvReward(List<ResourceModel> allRewardList, int level) {
      FirstYearTreasureLevelModel levelModel = this.getTreasureLevelModel(level);

      for(ResourceModel resourceModel : levelModel.getRewards()) {
         resourceModel.addResourceToList(allRewardList);
      }

   }

   private void marquisLvReward(List<ResourceModel> allRewardList, int level) {
      FirstYearTreasureLevelModel levelModel = this.getTreasureLevelModel(level);

      for(ResourceModel resourceModel : levelModel.getLockRewards()) {
         resourceModel.addResourceToList(allRewardList);
      }

   }

   public void buyMarquis(List<ResourceModel> resourceModels) {
      this.logger.info("【周年庆】充值购买典藏宝鉴 playerId:{}", this.player.getPlayerId());
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.first_year_treasure > 0) {
         this.logger.error("【周年庆】已经购买典藏宝鉴 playerId:{}", this.player.getPlayerId());
      } else {
         int materialId = ApplicationContextProvider.getConfigInt("BaojianScore", 6970);
         int addPoint = 0;
         if (resourceModels != null) {
            Iterator<ResourceModel> iterator = resourceModels.iterator();

            while(iterator.hasNext()) {
               ResourceModel resourceModel = (ResourceModel)iterator.next();
               if (resourceModel.getType() == 2 && resourceModel.getId() == materialId) {
                  addPoint += resourceModel.getValue();
                  iterator.remove();
               }
            }
         }

         if (addPoint > 0) {
            this.player.addResource(2, materialId, addPoint, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 126, 12607, 0, 0, "");
         }

         this.checkUpgrade(resourceModels);
         ActivityAnniversaryCelebrationDao dao = this.getDao();

         for(int level = dao.treasureLv; level > 0; --level) {
            this.marquisLvReward(resourceModels, level);
         }

         dao.updateOp();
         this.updateTreasureData();
      }
   }

   @MsgHandlerAnno
   public void C2S_TreasureTaskInfo_22071(ActivityAnniversaryCelebrationMsg.C2S_TreasureTaskInfo_22071 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendTreasureInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_TreasureBuy_22077(ActivityAnniversaryCelebrationMsg.C2S_TreasureBuy_22077 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.first_year_treasure <= 0) {
            this.player.failure(0);
         } else {
            ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
            if (activityInfo != null) {
               if (DateUtil.isSameDay(System.currentTimeMillis(), (long)activityInfo.end * 1000L)) {
                  int type = msg.getType();
                  int count = msg.getCount();
                  if (count <= 0) {
                     this.player.failure(4);
                  } else {
                     List<ResourceModel> resourceModels = new ArrayList();
                     ActivityAnniversaryCelebrationDao dao = this.getDao();
                     int baoJianBuyMax = ApplicationContextProvider.getConfigInt("BaojianBuyMax", 40);
                     if (dao.treasureLv >= baoJianBuyMax) {
                        this.logger.info("【周年庆】琉璃宝鉴已达到购买等级上限 playerId:{}", this.player.getPlayerId());
                     } else {
                        boolean isUpgrade = false;
                        List<ResourceModel> showResourceList = new ArrayList();
                        int oriLevel = dao.treasureLv;
                        int reason;
                        if (type == 1) {
                           if (oriLevel + count > baoJianBuyMax) {
                              this.logger.info("【周年庆】琉璃宝鉴购买等级后超过上限 playerId:{}", this.player.getPlayerId());
                              return;
                           }

                           String[] costArr = ApplicationContextProvider.getConfigString("BaojianPayLv", "").split("\\|");
                           ResourceModel needResource = new ResourceModel(Integer.parseInt(costArr[0]), Integer.parseInt(costArr[1]), Integer.parseInt(costArr[2]) * count);
                           if (!this.player.checkResourceNum(needResource)) {
                              this.player.failure(31);
                              return;
                           }

                           this.player.delResource(needResource, 126, 12608, type, count, "");
                           dao.treasureLv += count;
                           dao.updateOp();
                           this.levelRewardList(resourceModels, dao.treasureLv, oriLevel, true);
                           reason = 12608;
                           isUpgrade = true;
                        } else {
                           if (type != 2) {
                              return;
                           }

                           String[] costArr = ApplicationContextProvider.getConfigString("BaojianPayIntegral", "").split(":");
                           int onceLimit = ApplicationContextProvider.getConfigInt("BaojianOncelimit", 1000);
                           if (Integer.parseInt(costArr[0]) * count > onceLimit) {
                              this.player.failure(25);
                              return;
                           }

                           ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(costArr[1]) * count);
                           if (!this.player.checkResourceNum(needResource)) {
                              this.player.failure(31);
                              return;
                           }

                           this.player.delResource(needResource, 126, 12609, type, count, "");
                           int materialId = ApplicationContextProvider.getConfigInt("BaojianScore", 6970);
                           showResourceList.add(new ResourceModel(2, materialId, Integer.parseInt(costArr[0]) * count));
                           this.player.addResource(showResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 126, 12609, type, count, "");
                           isUpgrade = this.checkUpgrade(resourceModels);
                           reason = 12609;
                        }

                        if (isUpgrade) {
                           this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_FIRST_YEAR_ACTIVITY_TREASURE_GIFT, 126, reason, oriLevel, dao.treasureLv, "");
                        } else {
                           this.player.addResourceMsg(showResourceList);
                           this.player.sendResourceMsg();
                        }

                        ActivityAnniversaryCelebrationMsg.S2C_TreasureBuy_22078.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_TreasureBuy_22078.newBuilder();
                        builder.setType(type);
                        builder.setCount(count);
                        builder.setLevel(dao.treasureLv);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   private void updateTreasureData() {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      ActivityAnniversaryCelebrationMsg.S2C_TreasureUpdate_22082.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_TreasureUpdate_22082.newBuilder();
      builder.setLevel(dao.treasureLv);
      this.player.sendMsg(builder.build());
   }

   private void clearTreasureData() {
      List<ResourceModel> resourceModels = new ArrayList();
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.treasureLv = 0;
      FirstYearTreasureTaskPart firstYearTreasureTaskPart = (FirstYearTreasureTaskPart)this.player.getMgrPart(FirstYearTreasureTaskPart.class);

      for(TaskData taskData : firstYearTreasureTaskPart.getTasksMap().values()) {
         if (taskData.state >= 2) {
            FirstYearTreasureTaskModel taskModel = (FirstYearTreasureTaskModel)ApplicationContextProvider.getModelPool().getEntity("FirstYearBaojianTask", taskData.id);
            if (taskModel != null) {
               for(ResourceModel reward : taskModel.getRewards()) {
                  ResourceModel.addResourceToList(resourceModels, reward);
               }
            }
         }
      }

      dao.treasureTaskGroup.clear();
      dao.updateOp();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.first_year_treasure > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_FIRST_YEAR_TREASURE, (long)playerDao.first_year_treasure, 126, 910, 0, 0, "");
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         giftPart.clearGifts(35);
      }

      firstYearTreasureTaskPart.deleteTasks();
      int materialId = ApplicationContextProvider.getConfigInt("BaojianScore", 6970);
      if (resourceModels.size() > 0) {
         resourceModels.removeIf((resourceModel) -> resourceModel.getType() == 2 && resourceModel.getId() == materialId);
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.ID_FIRST_YEAR_TREASUTE_MAIL);
         if (resourceModels.size() > 0 && null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, this.getActivityLogModule(), 12612);
         }
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int itemNum = itemBagPart.getItemNum(materialId);
      if (itemNum > 0) {
         this.player.delResource(2, materialId, (long)itemNum, 126, 910, 0, 0, "");
      }

   }

   private void checkExpeditionUnlock() {
      ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
      int activityDay = this.getSeverActivityDay();
      Map<Integer, FirstYearExpeditionModel> modelMap = ApplicationContextProvider.<Integer, FirstYearExpeditionModel>getModelPoolMap("FirstYearExpendition");

      for(FirstYearExpeditionModel model : modelMap.values()) {
         if (activityDay >= model.getOpenDay()) {
            expeditionPart.unlockChapter(model.getChapterId(), false);
         }
      }

   }

   private void clearExpeditionData() {
      ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
      Map<Integer, FirstYearExpeditionModel> modelMap = ApplicationContextProvider.<Integer, FirstYearExpeditionModel>getModelPoolMap("FirstYearExpendition");

      for(FirstYearExpeditionModel model : modelMap.values()) {
         expeditionPart.clearChapter(model.getChapterId());
      }

   }

   public void gmTest(String order) {
      String[] split = order.split(",");
      switch (split[0]) {
         case "removetasks":
            this.gmRemvoeTasks();
            break;
         case "level":
            this.gmSetLevel(Integer.parseInt(split[1]));
            break;
         case "pass":
            int max = Integer.parseInt(split[1]);
            Map<Integer, FirstYearTowerChapterModel> map = this.player.getGameModelPool().getMap("FirstYearTowerChapter");

            for(Integer id : map.keySet()) {
               if (id <= max) {
                  this.C2S_ACTower_22010(ActivityAnniversaryCelebrationMsg.C2S_ACTower_22010.newBuilder().setId(id).build(), (String)null);
               }
            }
            break;
         case "clearbuyset":
            ActivityAnniversaryCelebrationDao dao = this.getDao();
            dao.buySet.clear();
            dao.updateOp();
            this.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.BUY_GIFT);
      }

   }

   private void gmRemvoeTasks() {
      this.logger.info("周年庆活动 - 移除任务数据 playerId:{}", this.player.getPlayerId());
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.treasureTaskGroup.clear();
      dao.updateOp();
      FirstYearTreasureTaskPart firstYearTreasureTaskPart = (FirstYearTreasureTaskPart)this.player.getMgrPart(FirstYearTreasureTaskPart.class);
      Map<Integer, TaskData> tasksMap = firstYearTreasureTaskPart.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         taskData.delete();
      }

   }

   private void gmSetLevel(int level) {
      ActivityAnniversaryCelebrationDao dao = this.getDao();
      dao.treasureLv = level;
      dao.updateOp();
      this.sendTreasureInfo();
   }
}
