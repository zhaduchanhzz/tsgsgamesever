package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityYuanDanDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.YuanDanAddUpReturnAwardModel;
import com.gzbz.model.YuanDanBanquetModel;
import com.gzbz.model.YuanDanLotteryCostModel;
import com.gzbz.model.YuanDanLotteryItemModel;
import com.gzbz.model.YuanDanShopAddUpModel;
import com.gzbz.model.YuanDanSignAwardModel;
import com.gzbz.model.fun.MidAutumnStageModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.YuanDanMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.YuanDanTaskPart;
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
public class YuanDanPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   ConfigManager configManager;

   public ActivityYuanDanDao getDao() {
      return (ActivityYuanDanDao)this.player.getData("tb_activity_yuan_dan", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 129;
   }

   public int getAddUpLogReason() {
      return 12901;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_YUAN_DAN_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "YuanDanAddupRecharge";
   }

   public int getConLogReason() {
      return 12913;
   }

   public int getConMail() {
      return CentreAwardModel.TYPE_YUAN_DAN_CON_RECHARGE;
   }

   public String getConExcelName() {
      return "YuanDanBlessing";
   }

   public void sendInfo() {
      super.sendInfo();
      if (!this.isServerActivityInvalid()) {
         YuanDanTaskPart yuanDanTaskPart = (YuanDanTaskPart)this.player.getMgrPart(YuanDanTaskPart.class);
         yuanDanTaskPart.trigger();
         ActivityYuanDanDao activityYuanDanDao = this.getDao();
         YuanDanMsg.S2C_Main_22602.Builder msg = YuanDanMsg.S2C_Main_22602.newBuilder();
         msg.setDay(this.getSeverActivityDay());
         msg.setEnterCount(activityYuanDanDao.makeCount);
         msg.addAllGotSiteReward(activityYuanDanDao.gotSite);
         msg.setTier(activityYuanDanDao.tier);
         msg.setEnjoy(activityYuanDanDao.enjoy);
         msg.addAllFinishShow(activityYuanDanDao.finishShow);
         msg.setFirstBanquet(activityYuanDanDao.firstBanquet);
         msg.addAllTierRewardId(activityYuanDanDao.posReward);

         for(TaskData taskData : yuanDanTaskPart.getTasksMap().values()) {
            msg.addTask(taskData.toBuilder());
         }

         msg.setGotWalk(activityYuanDanDao.gotWalk);
         msg.addAllSignReceiveIds(activityYuanDanDao.signReceiveIds);
         msg.setActivityOpenDay(this.getActivityOpenDay());
         this.player.sendMsg(msg.build());
         this.shopAddUpRechargeHandle(true);
         this.sendDrawInfo();
      }
   }

   public int getActivityType() {
      return 92;
   }

   public void rotateReset(int oldActivityId) {
      ActivityYuanDanDao activityYuanDanDao = this.getDao();
      activityYuanDanDao.gotSite.clear();
      activityYuanDanDao.tier = 1;
      activityYuanDanDao.enjoy = 0;
      activityYuanDanDao.finishShow.clear();
      activityYuanDanDao.makeCount = 0;
      activityYuanDanDao.prayNum = 0;
      activityYuanDanDao.totalPoint = 0;
      activityYuanDanDao.rewardIds.clear();
      activityYuanDanDao.posReward.clear();
      activityYuanDanDao.firstBanquet = true;
      activityYuanDanDao.gotWalk = false;
      activityYuanDanDao.signReceiveIds.clear();
      activityYuanDanDao.updateOp();
      this.drawReset();
      this.clearActivityGift(24);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_YUAN_DAN);
      YuanDanTaskPart yuanDanTaskPart = (YuanDanTaskPart)this.player.getMgrPart(YuanDanTaskPart.class);
      yuanDanTaskPart.trigger();
      this.shopAddUpReset();
      this.clearActivityGift(24);
   }

   public void resetDaily() {
      super.resetDaily();
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            ActivityYuanDanDao activityYuanDanDao = this.getDao();
            activityYuanDanDao.makeCount = 0;
            activityYuanDanDao.updateOp();
            this.shopAddUpReset();
            this.sendShopAddUpInfo();
            this.drawResetDaily();
            this.sendDrawInfo();
         }
      }
   }

   public void loginHandle() {
      super.loginHandle();
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      this.shopAddUpReset();
      this.drawReset();
   }

   @MsgHandlerAnno
   public void C2S_Main_22601(YuanDanMsg.C2S_Main_22601 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_ExitBanquet_22605(YuanDanMsg.C2S_ExitBanquet_22605 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityYuanDanDao activityYuanDanDao = this.getDao();
         if (activityYuanDanDao.makeCount >= ApplicationContextProvider.getConfigInt("YuanDanBanquetTime", 0)) {
            this.player.failure(51);
         } else {
            int banquetTime = ApplicationContextProvider.getConfigInt("YuanDanManufactureTime", 0);
            float makeTime = ApplicationContextProvider.getConfigFloat("YuanDanMakeTime", 0.0F);
            float maxTime = (makeTime + 1.0F) * (float)msg.getGuestCount();
            if (maxTime > (float)banquetTime) {
               this.player.failure(6);
            } else {
               List<ResourceModel> resourceModels = new ArrayList();
               int maxScore = 0;
               Map<Integer, YuanDanBanquetModel> yuanDanBanquetModelMap = ApplicationContextProvider.<Integer, YuanDanBanquetModel>getModelPoolMap("YuanDanBanquet");

               for(int guest : msg.getGuestList()) {
                  if (!yuanDanBanquetModelMap.containsKey(guest)) {
                     this.player.failure(6);
                     return;
                  }

                  YuanDanBanquetModel yuanDanBanquetModel = (YuanDanBanquetModel)yuanDanBanquetModelMap.get(guest);
                  maxScore += ((MidAutumnStageModel)yuanDanBanquetModel.getStage().get(0)).getScore();

                  for(ResourceModel resourceModel : yuanDanBanquetModel.getReward()) {
                     resourceModel.addResourceToList(resourceModels);
                  }
               }

               if (maxScore < msg.getScore()) {
                  this.player.failure(6);
               } else {
                  if (!resourceModels.isEmpty()) {
                     this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 129, 12908, msg.getScore(), 0, msg.getGuestList().toString());
                  }

                  if (msg.getScore() > 0) {
                     activityYuanDanDao.totalPoint += msg.getScore();
                     RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                     rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)activityYuanDanDao.totalPoint, false, String.valueOf(this.getActivityType()), String.valueOf(this.getServerActivityInfo().id));
                  }

                  if (!activityYuanDanDao.firstBanquet) {
                     ++activityYuanDanDao.makeCount;
                  }

                  activityYuanDanDao.firstBanquet = false;
                  activityYuanDanDao.updateOp();
                  YuanDanMsg.S2C_ExitBanquet_22606.Builder resp = YuanDanMsg.S2C_ExitBanquet_22606.newBuilder();
                  resp.setScore(msg.getScore());
                  resp.setEnterCount(activityYuanDanDao.makeCount);
                  resp.addAllGuest(msg.getGuestList());
                  resp.setFirstBanquet(activityYuanDanDao.firstBanquet);
                  this.player.sendMsg(resp.build());
                  this.player.triggerTask(624, 0, 1L, 1);
                  this.player.triggerTask(625, 0, (long)msg.getGuestCount(), 1);
                  StringBuilder stringBuilder = new StringBuilder();

                  for(ResourceModel resourceModel : resourceModels) {
                     stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                  }

                  if (stringBuilder.length() > 0) {
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "团圆宴会", stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), String.valueOf(msg.getScore()), 0, 0, 0);
                  }

               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskReward_22611(YuanDanMsg.C2S_TaskReward_22611 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         YuanDanTaskPart yuanDanTaskPart = (YuanDanTaskPart)this.player.getMgrPart(YuanDanTaskPart.class);
         yuanDanTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_WalkReward_22613(YuanDanMsg.C2S_WalkReward_22613 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityYuanDanDao activityYuanDanDao = this.getDao();
         if (activityYuanDanDao.gotWalk) {
            this.player.failure(24);
         } else {
            List<Integer> configList = this.getConfigManager().getIntList("ZhongqiuWalk");
            int finishCount = 0;
            YuanDanTaskPart yuanDanTaskPart = (YuanDanTaskPart)this.player.getMgrPart(YuanDanTaskPart.class);
            Map<Integer, TaskData> taskDataMap = yuanDanTaskPart.getTasksMap();

            for(TaskData taskData : taskDataMap.values()) {
               if (taskData.state >= 3) {
                  ++finishCount;
               }
            }

            if (finishCount < (Integer)configList.get(0)) {
               this.player.failure(33);
            } else {
               this.player.addResource(2, (Integer)configList.get(1), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 129, 12909, finishCount, 0, "");
               activityYuanDanDao.gotWalk = true;
               activityYuanDanDao.updateOp();
               YuanDanMsg.S2C_WalkReward_22614.Builder resp = YuanDanMsg.S2C_WalkReward_22614.newBuilder();
               resp.setGotWalk(activityYuanDanDao.gotWalk);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   public YuanDanSignAwardModel getCurYuanDanSignAwardModel() {
      ActivityYuanDanDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      Map<Integer, YuanDanSignAwardModel> signModelMap = ApplicationContextProvider.<Integer, YuanDanSignAwardModel>getModelPoolMap("YuanDanSignAward");
      Set<Integer> canReceiveDays = new HashSet();

      for(Map.Entry<Integer, YuanDanSignAwardModel> entry : signModelMap.entrySet()) {
         YuanDanSignAwardModel model = (YuanDanSignAwardModel)entry.getValue();
         if (!dao.signReceiveIds.contains(model.getDay()) && severActivityDay >= model.getDay()) {
            canReceiveDays.add(model.getDay());
         }
      }

      if (canReceiveDays != null && !canReceiveDays.isEmpty()) {
         Integer minDay = (Integer)canReceiveDays.stream().min((o1, o2) -> o1 - o2).get();
         return (YuanDanSignAwardModel)signModelMap.get(minDay);
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_SignReceive_22619(YuanDanMsg.C2S_SignReceive_22619 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         YuanDanSignAwardModel curYuanDanSignAwardModel = this.getCurYuanDanSignAwardModel();
         if (curYuanDanSignAwardModel == null) {
            return this.player.failure(76031);
         } else {
            ActivityYuanDanDao dao = this.getDao();
            dao.signReceiveIds.add(curYuanDanSignAwardModel.getDay());
            dao.updateOp();
            this.player.addResource(curYuanDanSignAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 129, 12903, 0, 0, "");
            YuanDanMsg.S2C_SignReceive_22620.Builder resp = YuanDanMsg.S2C_SignReceive_22620.newBuilder();
            resp.addAllReceiveIds(dao.signReceiveIds);
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivityYuanDanDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_22621(YuanDanMsg.C2S_ShopAddUpInfo_22621 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_22623(YuanDanMsg.C2S_ReceiveShopAddUpReward_22623 msg, String source) {
      int id = msg.getId();
      ActivityYuanDanDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         YuanDanShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12902, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      YuanDanMsg.S2C_ShopAddUpInfo_22622.Builder builder = YuanDanMsg.S2C_ShopAddUpInfo_22622.newBuilder();
      ActivityYuanDanDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      builder.setOpenDay(this.getSeverActivityDay());
      builder.setActivityDay(this.getActivityOpenDay());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityYuanDanDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, YuanDanShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            YuanDanShopAddUpModel model = (YuanDanShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityYuanDanDao dao = this.getDao();
      Map<Integer, YuanDanShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(YuanDanShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_YUAN_DAN_SHOP_ADD_UP_RECHARGE);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 12902);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      YuanDanShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityYuanDanDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public YuanDanShopAddUpModel getShopAddUpModel(int id) {
      YuanDanShopAddUpModel model = (YuanDanShopAddUpModel)this.player.getGameModelPool().getEntity("YuanDanShopAddup", id);
      return model;
   }

   public Map<Integer, YuanDanShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, YuanDanShopAddUpModel> modelMap = new HashMap();
      Map<Integer, YuanDanShopAddUpModel> allModel = this.player.getGameModelPool().getMap("YuanDanShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, YuanDanShopAddUpModel> entry : allModel.entrySet()) {
            YuanDanShopAddUpModel model = (YuanDanShopAddUpModel)entry.getValue();
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

   public void drawReset() {
      ActivityYuanDanDao dao = this.getDao();
      this.sendCumulativeDraw(dao);
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
      ActivityYuanDanDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_22624(YuanDanMsg.C2S_FancyReward_22624 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityYuanDanDao dao = this.getDao();
         YuanDanLotteryItemModel lotteryItemModel = (YuanDanLotteryItemModel)this.player.getGameModelPool().getEntity("YuanDanLotteryItem", msg.getTargetId());
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
                  YuanDanMsg.S2C_FancyReward_22625.Builder builder = YuanDanMsg.S2C_FancyReward_22625.newBuilder();
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
      Map<Integer, YuanDanLotteryItemModel> allMap = this.player.getGameModelPool().getMap("YuanDanLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(YuanDanLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_22628(YuanDanMsg.C2S_Draw_22628 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         YuanDanLotteryCostModel costModel = (YuanDanLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("YuanDanLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(51, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityYuanDanDao dao = this.getDao();
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
                     Map<Integer, YuanDanLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        YuanDanLotteryItemModel enjoyModel = (YuanDanLotteryItemModel)this.player.getGameModelPool().getEntity("YuanDanLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           YuanDanLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ActivityYuanDanDao.RecordInfo recordInfo = new ActivityYuanDanDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 12905, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_YUAN_DAN_DRAW_ACTIVITY, this.getActivityLogModule(), 12904, 0, 0, "");
                        playerResetCustomCache.addDailyReset(51, lotteryNum);
                        YuanDanMsg.S2C_Draw_22629.Builder builder = YuanDanMsg.S2C_Draw_22629.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(51, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "花好月圆-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, YuanDanLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, YuanDanLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("YuanDanLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, YuanDanLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, YuanDanLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((YuanDanLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((YuanDanLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((YuanDanLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((YuanDanLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((YuanDanLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((YuanDanLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private YuanDanLotteryItemModel smashEgg(ActivityYuanDanDao dao, Map<Integer, YuanDanLotteryItemModel> itemModelMap) {
      Map<Integer, YuanDanLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(YuanDanLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(YuanDanLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_22626(YuanDanMsg.C2S_LuckDrawInfo_22626 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityYuanDanDao dao = this.getDao();
      YuanDanMsg.S2C_LuckDrawInfo_22627.Builder builder = YuanDanMsg.S2C_LuckDrawInfo_22627.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(51, 0);
      builder.setRecruitNum(recruitNum);

      for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      builder.setFancyId(dao.fancyRewardId);
      builder.setLotteryStage(dao.lotteryStage);
      builder.setOpenDay(this.getPlayerActivityOpenDay());
      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
      this.player.sendMsg(builder.build());
   }

   public List<YuanDanLotteryItemModel> getDrawJackpot() {
      List<YuanDanLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, YuanDanLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, YuanDanLotteryItemModel>>getModelPoolMap("customYuanDanLotteryItem");
      TreeMap<Integer, Map<Integer, YuanDanLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, YuanDanLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(YuanDanLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<YuanDanLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         YuanDanLotteryItemModel model = (YuanDanLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(YuanDanLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadYuanDanRecord_22636.Builder builder = CrossMsg.S2CR_UploadYuanDanRecord_22636.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(model.getStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_22630(YuanDanMsg.C2S_OpenReward_22630 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         YuanDanAddUpReturnAwardModel awardModel = (YuanDanAddUpReturnAwardModel)ApplicationContextProvider.getModelPoolEntity("YuanDanAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityYuanDanDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("砥兵砺伍活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("砥兵砺伍活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12906, 0, 0, "");
                  YuanDanMsg.S2C_OpenReward_22631.Builder builder = YuanDanMsg.S2C_OpenReward_22631.newBuilder();
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
   public void C2S_ServerDrawRecord_22634(YuanDanMsg.C2S_ServerDrawRecord_22634 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      YuanDanLotteryItemModel model = (YuanDanLotteryItemModel)this.player.getGameModelPool().getEntity("YuanDanLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8025);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, YuanDanLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               YuanDanLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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
                      logInfo = entry.getValue();
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

   private YuanDanLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, YuanDanLotteryItemModel> itemModelMap) {
      Map<Integer, YuanDanLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(YuanDanLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(YuanDanLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   private void sendCumulativeDraw(ActivityYuanDanDao dao) {
      if (dao.drawTime != 0) {
         List<ResourceModel> notReceiveRewards = new ArrayList();
         List<YuanDanAddUpReturnAwardModel> awardModel = this.getAvailableModels();
         if (!ObjectUtils.isEmpty(awardModel)) {
            for(YuanDanAddUpReturnAwardModel model : awardModel) {
               if (model.getAddupNum() <= dao.drawTime && !dao.hadRewards.contains(model.getId())) {
                  notReceiveRewards.addAll(model.getRewards());
               }
            }

            if (!ObjectUtils.isEmpty(notReceiveRewards)) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_YUAN_DAN_ADD_UP_RETURN_AWARD);
               if (null != centreAwardMap && centreAwardMap.size() > 0) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 12906);
               }
            }
         }

      }
   }

   private List<YuanDanAddUpReturnAwardModel> getAvailableModels() {
      Map<Integer, YuanDanAddUpReturnAwardModel> addUpReturnAwardModelMap = ApplicationContextProvider.<Integer, YuanDanAddUpReturnAwardModel>getModelPoolMap("YuanDanAddupReturnAward");
      if (ObjectUtils.isEmpty(addUpReturnAwardModelMap)) {
         return new ArrayList();
      } else {
         List<YuanDanAddUpReturnAwardModel> result = new ArrayList();
         int serverOpenDay = this.getPlayerActivityOpenDay();

         for(YuanDanAddUpReturnAwardModel model : addUpReturnAwardModelMap.values()) {
            if (serverOpenDay >= model.getDateStart() && serverOpenDay <= model.getDateEnd() || serverOpenDay >= model.getDateStart() && model.getDateEnd() == -1) {
               result.add(model);
            }
         }

         return result;
      }
   }
}
