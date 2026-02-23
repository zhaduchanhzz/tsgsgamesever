package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityYuanXiaoDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.YuanXiaoAddUpRechargeModel;
import com.gzbz.model.YuanXiaoGuestModel;
import com.gzbz.model.YuanXiaoStillCostModel;
import com.gzbz.model.YuanXiaoTaskAwardModel;
import com.gzbz.model.YuanxiaoLotteryItemModel;
import com.gzbz.model.YuanxiaoReturnAwardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.MidAutumnStageModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.YuanXiao2022Msg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.YuanXiao2022ActivityTaskPart;
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
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class YuanXiao2022ActivityPart extends AbstractActivityPart {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.addUpRechargeHandle(0, false);
         this.yuanXiaoStillCostRechargeHandle(0, true);
         this.sendPrayInfo();
      }
   }

   public int getActivityType() {
      return 66;
   }

   public void rotateReset(int oldActivityId) {
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      activityYuanXiaoDao.makeCount = 0;
      activityYuanXiaoDao.firstMake = true;
      activityYuanXiaoDao.totalPoint = 0;
      activityYuanXiaoDao.favorCount = 0;
      activityYuanXiaoDao.receiveState = 0;
      activityYuanXiaoDao.fancyRewardId = 0;
      activityYuanXiaoDao.smashEggNum = 0;
      activityYuanXiaoDao.roundSmashNum.clear();
      activityYuanXiaoDao.takedLuck.clear();
      activityYuanXiaoDao.seniorRewards.clear();
      activityYuanXiaoDao.updateOp();
      this.initPrayTask();
      this.clearTaskItem();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (DateUtil.isSameDay(playerDao.updateTime)) {
         this.initPrayTask();
      }

      this.clearActivityGift(24);
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.isStageChange();
         this.initPrayTask();
         ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
         this.sendStillCostRewardInfo();
         activityYuanXiaoDao.nowRechargeMoney = 0;
         activityYuanXiaoDao.rechargeCut = 0;
         activityYuanXiaoDao.makeCount = 0;
         activityYuanXiaoDao.updateOp();
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.checkAddUpIdListChange();
         this.checkConIdListChange();
         this.sendInfo();
      }
   }

   public void activityEnd(int oldActivityId) {
      this.addUpActivityEnd();
      this.yuanXiaoStillCostEnd();
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_18301(YuanXiao2022Msg.C2S_ActivityInfo_18301 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
         YuanXiao2022Msg.S2C_ActivityInfo_18302.Builder resp = YuanXiao2022Msg.S2C_ActivityInfo_18302.newBuilder();
         resp.setMakeCount(activityYuanXiaoDao.makeCount);
         resp.setFirstMake(activityYuanXiaoDao.firstMake);
         resp.setOpenDay(this.getActivityOpenDay());
         resp.setActivityDay(this.getSeverActivityDay());
         resp.setSmashEggStage(this.getSmashEggStage());
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_Make_18321(YuanXiao2022Msg.C2S_Make_18321 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
         if (activityYuanXiaoDao.makeCount >= ApplicationContextProvider.getConfigInt("yuanxiaoMakeChance", 0)) {
            this.player.failure(51);
         } else {
            int banquetTime = ApplicationContextProvider.getConfigInt("YuanxiaoEveryTime", 0);
            float makeTime = ApplicationContextProvider.getConfigFloat("yuanxiaoMakeTime", 0.0F);
            float maxTime = (makeTime + 1.0F) * (float)msg.getGuestCount();
            if (maxTime > (float)banquetTime) {
               this.player.failure(6);
            } else {
               List<ResourceModel> resourceModels = new ArrayList();
               int maxScore = 0;
               Map<Integer, YuanXiaoGuestModel> yuanXiaoGuestModelMap = ApplicationContextProvider.<Integer, YuanXiaoGuestModel>getModelPoolMap("YuanxiaoGuest");

               for(int guest : msg.getGuestList()) {
                  if (!yuanXiaoGuestModelMap.containsKey(guest)) {
                     this.player.failure(6);
                     return;
                  }

                  YuanXiaoGuestModel yuanXiaoGuestModel = (YuanXiaoGuestModel)yuanXiaoGuestModelMap.get(guest);
                  maxScore += ((MidAutumnStageModel)yuanXiaoGuestModel.getStage().get(0)).getScore();

                  for(ResourceModel resourceModel : yuanXiaoGuestModel.getReward()) {
                     resourceModel.addResourceToList(resourceModels);
                  }
               }

               if (maxScore < msg.getScore()) {
                  this.player.failure(6);
               } else {
                  if (!resourceModels.isEmpty()) {
                     this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8221, msg.getScore(), 0, msg.getGuestList().toString());
                  }

                  if (msg.getScore() > 0) {
                     activityYuanXiaoDao.totalPoint += msg.getScore();
                     RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                     rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)activityYuanXiaoDao.totalPoint, false, String.valueOf(this.getActivityType()), String.valueOf(this.getServerActivityInfo().id));
                  }

                  if (!activityYuanXiaoDao.firstMake) {
                     ++activityYuanXiaoDao.makeCount;
                  }

                  activityYuanXiaoDao.firstMake = false;
                  activityYuanXiaoDao.updateOp();
                  YuanXiao2022Msg.S2C_Make_18322.Builder resp = YuanXiao2022Msg.S2C_Make_18322.newBuilder();
                  resp.setScore(msg.getScore());
                  resp.addAllGuest(msg.getGuestList());
                  resp.setMakeCount(activityYuanXiaoDao.makeCount);
                  resp.setFirstMake(activityYuanXiaoDao.firstMake);
                  this.player.sendMsg(resp.build());
               }
            }
         }
      }
   }

   public ActivityYuanXiaoDao getDao() {
      return (ActivityYuanXiaoDao)this.player.getData("tb_activity_yuan_xiao", this.player.getPlayerId());
   }

   public void activityRecharge(int money) {
      this.addUpRechargeHandle(money, true);
      this.yuanXiaoStillCostRechargeHandle(money, true);
   }

   public List<YuanXiaoAddUpRechargeModel> getAddUpRewardByStage(int stage) {
      List<YuanXiaoAddUpRechargeModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      List<YuanXiaoAddUpRechargeModel> stageModelList = (List)this.player.getGameModelPool().getEntity("customYuanxiaoAddupRecharge", stage);
      if (null != stageModelList && stageModelList.size() > 0) {
         for(YuanXiaoAddUpRechargeModel model : stageModelList) {
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
         this.logger.info("{}阶段的YuanXiaoAddUpRecharge为空，请检查配置表", stage);
         return modelList;
      }
   }

   public YuanXiaoAddUpRechargeModel getAddUpRechargeModel(int id) {
      YuanXiaoAddUpRechargeModel model = (YuanXiaoAddUpRechargeModel)this.player.getGameModelPool().getEntity("YuanxiaoAddupRecharge", id);
      return model;
   }

   public boolean isStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getRechargeStage();
      ActivityYuanXiaoDao dao = this.getDao();
      if (nowStage != dao.stage) {
         this.sendAddUpNotReceiveRewardMail();
         dao.stage = nowStage;
         dao.updateOp();
         this.sendAddUpRechargeRewardInfo();
         return true;
      } else {
         return false;
      }
   }

   public int getRechargeStage() {
      int stage = 1;
      Map<Integer, YuanXiaoAddUpRechargeModel> allMap = this.player.getGameModelPool().getMap("YuanxiaoAddupRecharge");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay <= 0) {
            return stage;
         }

         for(YuanXiaoAddUpRechargeModel model : allMap.values()) {
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

   public void addUpRechargeHandle(int money, boolean sendMsg) {
      int addMoney = this.calcAndReturnAddMoney(money);
      this.isStageChange();
      ActivityYuanXiaoDao dao = this.getDao();
      dao.stageRechargeMoney += addMoney;
      dao.updateOp();
      if (sendMsg) {
         this.sendAddUpRechargeRewardInfo();
      }

   }

   public void sendAddUpNotReceiveRewardMail() {
      ActivityYuanXiaoDao dao = this.getDao();
      List<YuanXiaoAddUpRechargeModel> modelList = this.getAddUpRewardByStage(dao.stage);
      if (null != modelList && modelList.size() > 0) {
         List<Integer> notReceiveIdList = new ArrayList();
         List<ResourceModel> notReceiveRewardList = new ArrayList();

         for(YuanXiaoAddUpRechargeModel model : modelList) {
            Integer rewardId = model.getId();
            if (this.checkUnlockAddUpReward(rewardId) && !dao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
               notReceiveIdList.add(rewardId);
               notReceiveRewardList.addAll(model.getRewards());
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_YUAN_XIAO_ADD_UP_REWARD);
            if (centreAwardMap != null && centreAwardMap.size() > 0) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 89, 8901);
            }
         }

         if (notReceiveIdList.size() > 0) {
            dao.addUpGotRewards.addAll(notReceiveIdList);
            dao.updateOp();
         }
      }

      dao.stageRechargeMoney = 0;
      dao.updateOp();
   }

   public void addUpActivityEnd() {
      this.checkAddUpIdListChange();
      this.sendAddUpNotReceiveRewardMail();
      ActivityYuanXiaoDao dao = this.getDao();
      dao.stage = 1;
      dao.addUpGotRewards.clear();
      dao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   public boolean checkAddUpRewardStage(int id) {
      YuanXiaoAddUpRechargeModel model = (YuanXiaoAddUpRechargeModel)this.player.getGameModelPool().getEntity("YuanxiaoAddupRecharge", id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         ActivityYuanXiaoDao dao = this.getDao();
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

   public boolean checkUnlockAddUpReward(int id) {
      YuanXiaoAddUpRechargeModel model = this.getAddUpRechargeModel(id);
      if (null == model) {
         return false;
      } else {
         ActivityYuanXiaoDao dao = this.getDao();
         return dao.stageRechargeMoney >= model.getRechargeNum();
      }
   }

   public void sendAddUpRechargeRewardInfo() {
      YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.Builder builder = YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.newBuilder();
      ActivityYuanXiaoDao dao = this.getDao();
      builder.addAllGotRewards(dao.addUpGotRewards);
      builder.setStageRecharge(dao.stageRechargeMoney);
      builder.setStageEndTime(this.getAddUpRechargeStageEndTime());
      this.player.sendMsg(builder.build());
   }

   public long getAddUpRechargeStageEndTime() {
      List<YuanXiaoAddUpRechargeModel> addUpRewardByStage = this.getAddUpRewardByStage(this.getRechargeStage());
      if (null != addUpRewardByStage && addUpRewardByStage.size() > 0) {
         YuanXiaoAddUpRechargeModel model = (YuanXiaoAddUpRechargeModel)addUpRewardByStage.get(0);
         int stageEnd = model.getStageEnd();
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long startTime = (long)activityInfo.start * 1000L;
         long result = startTime + (long)stageEnd * 86400000L;
         return result;
      } else {
         return 0L;
      }
   }

   @MsgHandlerAnno
   public void C2S_AddUpTotalInfo_18303(YuanXiao2022Msg.C2S_AddUpTotalInfo_18303 msg, String source) {
      this.sendAddUpRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveAddUpReward_18305(YuanXiao2022Msg.C2S_ReceiveAddUpReward_18305 msg, String source) {
      this.isStageChange();
      int rewardId = msg.getRewardId();
      ActivityYuanXiaoDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (addUpGotRewards.contains(rewardId)) {
         return this.player.failure(61211);
      } else {
         YuanXiaoAddUpRechargeModel model = this.getAddUpRechargeModel(rewardId);
         if (null == model) {
            return this.player.failure(37);
         } else if (!this.checkAddUpRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            return this.player.failure(61224);
         } else if (!this.checkUnlockAddUpReward(rewardId)) {
            return this.player.failure(61212);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 89, 8901, 0, 0, "");
            dao.addUpGotRewards.add(rewardId);
            dao.updateOp();
            this.sendAddUpRechargeRewardInfo();
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Pray_18306(YuanXiao2022Msg.C2S_Pray_18306 msg, String source) {
      ActivityYuanXiaoDao dao = this.getDao();
      String yuanXiaoGiveFlower = this.configManager.getStr("YuanxiaoGiveFlower");
      if (StringUtils.isBlank(yuanXiaoGiveFlower)) {
         return this.player.failure(37);
      } else {
         ResourceModel costResource = ResourceModel.buildResource(yuanXiaoGiveFlower);
         if (!this.player.checkResourceNum(costResource)) {
            this.logger.info("送花活跃赠送次数不足");
            return this.player.failure(76027);
         } else {
            List<KeyValFun> list = new ArrayList();
            Map<Integer, YuanXiaoTaskAwardModel> modelMap = ApplicationContextProvider.<Integer, YuanXiaoTaskAwardModel>getModelPoolMap("YuanxiaoTaskAward");

            for(YuanXiaoTaskAwardModel model : modelMap.values()) {
               list.add(new KeyValFun(model.getId(), model.getOdd()));
            }

            GamePlayer var10000 = this.player;
            int id = GamePlayer.countRate(list);
            YuanXiaoTaskAwardModel model = (YuanXiaoTaskAwardModel)modelMap.get(id);
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_YUAN_XIAO_TASK, 89, 8902, 0, 0, "");
            this.player.delResource(costResource, 89, 8905, 0, 0, "");
            ++dao.favorCount;
            dao.updateOp();
            this.sendPrayInfo();
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveFavorReward_18311(YuanXiao2022Msg.C2S_ReceiveFavorReward_18311 msg, String source) {
      ActivityYuanXiaoDao dao = this.getDao();
      if (dao.receiveState == 1) {
         return this.player.failure(61206);
      } else {
         int yuanXiaoLike = this.configManager.getIntDefault("YuanxiaoLike", 18);
         if (dao.favorCount < yuanXiaoLike) {
            this.logger.info("送花活跃好感度不足");
            return this.player.failure(8009);
         } else {
            String yuanXiaoLikeAward = this.configManager.getStr("YuanxiaoLikeAward");
            if (StringUtils.isBlank(yuanXiaoLikeAward)) {
               return this.player.failure(37);
            } else {
               List<ResourceModel> resourceModelList = ResourceModel.buildResources(yuanXiaoLikeAward);
               this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 89, 8904, 0, 0, "");
               dao.receiveState = 1;
               dao.updateOp();
               this.sendPrayInfo();
               return true;
            }
         }
      }
   }

   public void sendPrayInfo() {
      ActivityYuanXiaoDao dao = this.getDao();
      YuanXiao2022Msg.S2C_Pray_18307.Builder builder = YuanXiao2022Msg.S2C_Pray_18307.newBuilder();
      builder.setFavorCount(dao.favorCount);
      builder.setReceiveState(dao.receiveState);
      this.player.sendMsg(builder.build());
   }

   public void initPrayTask() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_YUAN_XIAO_2022);
      YuanXiao2022ActivityTaskPart taskPart = (YuanXiao2022ActivityTaskPart)this.player.getMgrPart(YuanXiao2022ActivityTaskPart.class);
      taskPart.trigger();
   }

   public void clearTaskItem() {
      String yuanXiaoGiveFlower = this.configManager.getStr("YuanxiaoGiveFlower");
      if (!StringUtils.isBlank(yuanXiaoGiveFlower)) {
         ResourceModel costResource = ResourceModel.buildResource(yuanXiaoGiveFlower);
         this.player.delResourceAllNum(costResource.getType(), costResource.getId(), 89, 8906, 0, 0, "");
      }

   }

   public int getSmashEggStage() {
      Map<Integer, YuanxiaoLotteryItemModel> allMap = this.player.getGameModelPool().getMap("YuanxiaoLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(YuanxiaoLotteryItemModel model : allMap.values()) {
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
   public void C2S_OpenEggUi_17237(YuanXiao2022Msg.C2S_OpenEggUi_17237 msg, String source) {
      ActivityYuanXiaoDao dao = this.getDao();
      YuanXiao2022Msg.S2C_OpenEggUi_17238.Builder builder = YuanXiao2022Msg.S2C_OpenEggUi_17238.newBuilder();
      builder.setFancyId(dao.fancyRewardId);
      builder.setSmashEggNum(dao.smashEggNum);
      builder.addAllTakedLuck(dao.takedLuck);
      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));

      for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_17231(YuanXiao2022Msg.C2S_FancyReward_17231 msg, String source) {
      ActivityYuanXiaoDao dao = this.getDao();
      YuanxiaoLotteryItemModel yuanxiaoLotteryItemModel = (YuanxiaoLotteryItemModel)this.player.getGameModelPool().getEntity("YuanxiaoLotteryItem", msg.getItemIndex());
      if (yuanxiaoLotteryItemModel != null) {
         int openDay = this.getActivityOpenDay();
         if (yuanxiaoLotteryItemModel.getDateEnd() == -1) {
            if (yuanxiaoLotteryItemModel.getDateStart() > openDay) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), yuanxiaoLotteryItemModel.getId(), openDay});
               return;
            }
         } else if (openDay < yuanxiaoLotteryItemModel.getDateStart() || openDay > yuanxiaoLotteryItemModel.getDateEnd()) {
            this.player.failure(0);
            this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), yuanxiaoLotteryItemModel.getId(), openDay});
            return;
         }

         int activityDay = this.getSeverActivityDay();
         if (activityDay >= yuanxiaoLotteryItemModel.getStageStart() && activityDay <= yuanxiaoLotteryItemModel.getStageEnd()) {
            if (yuanxiaoLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), yuanxiaoLotteryItemModel.getId(), yuanxiaoLotteryItemModel.getItemGroup()});
            } else if (yuanxiaoLotteryItemModel.getSurplusNum() > 0 && dao.seniorRewards.containsKey(yuanxiaoLotteryItemModel.getId()) && (Integer)dao.seniorRewards.get(yuanxiaoLotteryItemModel.getId()) >= yuanxiaoLotteryItemModel.getSurplusNum()) {
               this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(yuanxiaoLotteryItemModel.getId()), yuanxiaoLotteryItemModel.getSurplusNum());
            } else {
               dao.fancyRewardId = msg.getItemIndex();
               dao.updateOp();
               YuanXiao2022Msg.S2C_FancyReward_17232.Builder builder = YuanXiao2022Msg.S2C_FancyReward_17232.newBuilder();
               builder.setResult(1);
               builder.setItemIndex(msg.getItemIndex());
               this.player.sendMsg(builder.build());
            }
         } else {
            this.player.failure(0);
            this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), yuanxiaoLotteryItemModel.getId(), activityDay});
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SmashEgg_17233(YuanXiao2022Msg.C2S_SmashEgg_17233 msg, String source) {
      if (msg.getNum() != 1 && msg.getNum() != 10 && msg.getNum() != 50) {
         this.player.failure(0);
      } else {
         ActivityYuanXiaoDao dao = this.getDao();
         if (dao.fancyRewardId <= 0) {
            this.player.failure(76014);
         } else {
            int yuanxiaoLottery = this.configManager.getIntDefault("YuanxiaoLottery", 1220);
            int needNum = this.handleNumByConfig(msg.getNum());
            ResourceModel needModel = new ResourceModel(2, yuanxiaoLottery, needNum);
            if (this.player.checkResourceNum(needModel)) {
               int openDay = this.getActivityOpenDay();
               int activityDay = this.getSeverActivityDay();
               Map<Integer, YuanxiaoLotteryItemModel> itemModelMap = this.getYuanxiaoLotteryItemMap(openDay, activityDay);
               if (itemModelMap != null && !itemModelMap.isEmpty()) {
                  YuanxiaoLotteryItemModel enjoyModel = (YuanxiaoLotteryItemModel)this.player.getGameModelPool().getEntity("YuanxiaoLotteryItem", dao.fancyRewardId);
                  List<ResourceModel> addList = new ArrayList();
                  List<ResourceModel> resourceModels = new ArrayList();
                  boolean isHaveFancy = false;

                  for(int i = 0; i < msg.getNum(); ++i) {
                     int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                     dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                     int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                     dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                     YuanxiaoLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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

                     ++dao.smashEggNum;

                     for(ResourceModel resourceModel : itemModel.getRewards()) {
                        addList.add(resourceModel);
                     }
                  }

                  int createTime = DateUtil.getIntTime(System.currentTimeMillis());

                  for(ResourceModel resourceModel : resourceModels) {
                     String record = createTime + ":" + resourceModel.getType() + "," + resourceModel.getId() + "," + resourceModel.getValue();
                     dao.recordList.add(record);
                  }

                  dao.updateOp();
                  this.player.delResource(needModel, 89, 8223, 0, 0, "");
                  this.player.addResource(addList, PlayerMsg.ShowType.SHOW_YUAN_XIAO_EGG, 82, 8223, 0, 0, "");
                  YuanXiao2022Msg.S2C_SmashEgg_17234.Builder builder = YuanXiao2022Msg.S2C_SmashEgg_17234.newBuilder();
                  builder.setResult(1);
                  builder.setIsHaveFancy(isHaveFancy);

                  for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                     CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                     info.setKey((Integer)entry.getKey());
                     info.setValue((Integer)entry.getValue());
                     builder.addSeniorNum(info);
                  }

                  builder.setSmashEggNum(dao.smashEggNum);
                  builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                  this.player.sendMsg(builder.build());
                  int itemId = 0;
                  int itemNum = 0;

                  for(ResourceModel resourceModel : addList) {
                     itemId = resourceModel.getId();
                     itemNum = resourceModel.getValue();
                  }

                  int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                  for(ResourceModel resourceModel : addList) {
                     String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                     this.player.getOperationMgr().addExtraLog(this.player, 198, "元宵活动-吃汤圆", itemId + "", itemNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                  }

               }
            }
         }
      }
   }

   public Map<Integer, YuanxiaoLotteryItemModel> getYuanxiaoLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, YuanxiaoLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("YuanxiaoLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, YuanxiaoLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, YuanxiaoLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((YuanxiaoLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((YuanxiaoLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((YuanxiaoLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((YuanxiaoLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((YuanxiaoLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((YuanxiaoLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   public YuanxiaoLotteryItemModel smashEgg(ActivityYuanXiaoDao dao, Map<Integer, YuanxiaoLotteryItemModel> itemModelMap) {
      Map<Integer, YuanxiaoLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(Map.Entry<Integer, YuanxiaoLotteryItemModel> entry : itemModelMap.entrySet()) {
         if (!dao.seniorRewards.containsKey(entry.getKey()) || ((YuanxiaoLotteryItemModel)entry.getValue()).getSurplusNum() <= 0 || (Integer)dao.seniorRewards.get(entry.getKey()) <= ((YuanxiaoLotteryItemModel)entry.getValue()).getSurplusNum()) {
            int roundSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, ((YuanxiaoLotteryItemModel)entry.getValue()).getItemGroup(), 0);
            if (((YuanxiaoLotteryItemModel)entry.getValue()).getPreposeNum() <= 0 || roundSmashNum >= ((YuanxiaoLotteryItemModel)entry.getValue()).getPreposeNum()) {
               if (((YuanxiaoLotteryItemModel)entry.getValue()).getItemGroup() == 1) {
                  if (dao.fancyRewardId > 0 && dao.fancyRewardId == (Integer)entry.getKey()) {
                     if (((YuanxiaoLotteryItemModel)entry.getValue()).getMustNum() > 0 && roundSmashNum >= ((YuanxiaoLotteryItemModel)entry.getValue()).getMustNum()) {
                        return (YuanxiaoLotteryItemModel)entry.getValue();
                     }

                     tempMap.put(entry.getKey(), entry.getValue());
                     totalOdds += ((YuanxiaoLotteryItemModel)entry.getValue()).getRealOdd();
                  }
               } else {
                  if (((YuanxiaoLotteryItemModel)entry.getValue()).getMustNum() > 0 && roundSmashNum >= ((YuanxiaoLotteryItemModel)entry.getValue()).getMustNum()) {
                     return (YuanxiaoLotteryItemModel)entry.getValue();
                  }

                  tempMap.put(entry.getKey(), entry.getValue());
                  totalOdds += ((YuanxiaoLotteryItemModel)entry.getValue()).getRealOdd();
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

         for(Map.Entry<Integer, YuanxiaoLotteryItemModel> entry : tempMap.entrySet()) {
            loop += ((YuanxiaoLotteryItemModel)entry.getValue()).getRealOdd();
            if (loop > r) {
               return (YuanxiaoLotteryItemModel)entry.getValue();
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeLuckReward_17235(YuanXiao2022Msg.C2S_TakeLuckReward_17235 msg, String source) {
      ActivityYuanXiaoDao dao = this.getDao();
      if (!dao.takedLuck.contains(msg.getRewardId())) {
         YuanxiaoReturnAwardModel model = (YuanxiaoReturnAwardModel)this.player.getGameModelPool().getEntity("YuanxiaoReturnAward", msg.getRewardId());
         if (model != null) {
            if (dao.smashEggNum >= model.getAddupNum()) {
               int openDay = this.getActivityOpenDay();
               if (model.getDateEnd() == -1) {
                  if (openDay < model.getDateStart()) {
                     return;
                  }
               } else if (openDay < model.getDateStart() || openDay > model.getDateEnd()) {
                  return;
               }

               dao.takedLuck.add(msg.getRewardId());
               dao.updateOp();
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8224, 0, 0, "");
               YuanXiao2022Msg.S2C_TakeLuckReward_17236.Builder builder = YuanXiao2022Msg.S2C_TakeLuckReward_17236.newBuilder();
               builder.setResult(1);
               builder.addAllTakedId(dao.takedLuck);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void gmTest(String orderStr) {
      String[] orders = orderStr.split(",");
      if (orders.length < 1) {
         this.logger.info("GM命令参数错误，oder={}", orderStr);
      } else {
         for (String cmd : orders){
            switch (cmd.toLowerCase()) {
               case "clearegg":
                  this.resetEggs();
               default:
            }
         }
      }
   }

   public void resetEggs() {
      ActivityYuanXiaoDao dao = this.getDao();
      dao.fancyRewardId = 0;
      dao.smashEggNum = 0;
      dao.roundSmashNum.clear();
      dao.takedLuck.clear();
      dao.seniorRewards.clear();
      dao.updateOp();
      this.C2S_OpenEggUi_17237((YuanXiao2022Msg.C2S_OpenEggUi_17237)null, (String)null);
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_17241(YuanXiao2022Msg.C2S_DrawRecord_17241 msg, String source) {
      YuanXiao2022Msg.S2C_DrawRecord_17242.Builder builder = YuanXiao2022Msg.S2C_DrawRecord_17242.newBuilder();
      ActivityYuanXiaoDao yuanXiaoDao = this.getDao();

      for(String record : yuanXiaoDao.recordList) {
         String[] arr = record.split(":");
         YuanXiao2022Msg.DrawRecord.Builder drawRecord = YuanXiao2022Msg.DrawRecord.newBuilder();
         drawRecord.setCreateTime(Integer.parseInt(arr[0]));
         String[] split = arr[1].split(",");
         CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
         itemInfo.setType(Integer.parseInt(split[0]));
         itemInfo.setId(Integer.parseInt(split[1]));
         itemInfo.setNum(Integer.parseInt(split[2]));
         drawRecord.addItemInfo(itemInfo);
         builder.addMyRecrod(drawRecord);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ServerDrawRecord_17239(YuanXiao2022Msg.C2S_ServerDrawRecord_17239 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public void checkAddUpIdListChange() {
      ActivityYuanXiaoDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!addUpGotRewards.isEmpty()) {
         Map<Integer, YuanXiaoAddUpRechargeModel> stageModelMap = this.player.getGameModelPool().getMap("YuanxiaoAddupRecharge");
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<YuanXiaoAddUpRechargeModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(YuanXiaoAddUpRechargeModel model : stageModelMap.values()) {
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
               int nowAddUpStage = this.getRechargeStage();
               if (addUpIdSet.containsAll(addUpGotRewards) && dao.stage > nowAddUpStage || !addUpIdSet.containsAll(addUpGotRewards)) {
                  Set<Integer> newAddUpGotRewards = new HashSet();

                  for(int id : addUpGotRewards) {
                     YuanXiaoAddUpRechargeModel addUpModel = this.getAddUpRechargeModel(id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(YuanXiaoAddUpRechargeModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(YuanXiaoAddUpRechargeModel addUpRechargeModel : addUpRechargeModelList) {
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

   public boolean drawView(int lotteryId, int round) {
      YuanxiaoLotteryItemModel model = (YuanxiaoLotteryItemModel)this.player.getGameModelPool().getEntity("YuanxiaoLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, YuanxiaoLotteryItemModel> lotteryItemMap = this.getYuanxiaoLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               YuanxiaoLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private YuanxiaoLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, YuanxiaoLotteryItemModel> itemModelMap) {
      Map<Integer, YuanxiaoLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(YuanxiaoLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(YuanxiaoLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   public List<YuanXiaoStillCostModel> getYuanXiaoStillCostModelList() {
      List<YuanXiaoStillCostModel> modelList = new ArrayList();
      Map<Integer, YuanXiaoStillCostModel> all = this.player.getGameModelPool().getMap("YuanXiaoStillCost");
      if (null != all && all.size() > 0) {
         Collection<YuanXiaoStillCostModel> values = all.values();
         int activityStartDay = this.getActivityOpenDay();

         for(YuanXiaoStillCostModel model : values) {
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
      int severActivityDay = super.getSeverActivityDay();
      List<YuanXiaoStillCostModel> yuanXiaoStillCostList = this.getYuanXiaoStillCostModelList();
      if (null != yuanXiaoStillCostList && yuanXiaoStillCostList.size() > 0) {
         int maxStageNum = 1;

         for(YuanXiaoStillCostModel model : yuanXiaoStillCostList) {
            if (model.getStageNum() > maxStageNum) {
               maxStageNum = model.getStageNum();
            }
         }

         return Math.min(maxStageNum, severActivityDay);
      } else {
         return 1;
      }
   }

   public void yuanXiaoStillCostRechargeHandle(int money, boolean sendMsg) {
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      if (activityYuanXiaoDao.nowRechargeMoney == -1) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         activityYuanXiaoDao.nowRechargeMoney = dailyRecharge;
      } else {
         activityYuanXiaoDao.nowRechargeMoney += money;
      }

      activityYuanXiaoDao.updateOp();
      YuanXiaoStillCostModel prepareUnlockLow = this.getPrepareUnlockStillCost(false);
      if (null != prepareUnlockLow) {
         int unlockCondition = activityYuanXiaoDao.nowRechargeMoney - activityYuanXiaoDao.rechargeCut;
         if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
            activityYuanXiaoDao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
            activityYuanXiaoDao.rechargeCut = activityYuanXiaoDao.nowRechargeMoney;
            activityYuanXiaoDao.updateOp();
         }
      }

      YuanXiaoStillCostModel prepareUnlockHigh = this.getPrepareUnlockStillCost(true);
      if (null != prepareUnlockHigh) {
         int nowRechargeMoney = activityYuanXiaoDao.nowRechargeMoney;
         if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
            activityYuanXiaoDao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
            activityYuanXiaoDao.nowRechargeMoney = 0;
            activityYuanXiaoDao.rechargeCut = 0;
            activityYuanXiaoDao.updateOp();
         }
      }

      if (sendMsg) {
         this.sendStillCostRewardInfo();
      }

   }

   public YuanXiaoStillCostModel getPrepareUnlockStillCost(boolean isHighRechargeGear) {
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? activityYuanXiaoDao.canReceiveHighRewardIds : activityYuanXiaoDao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getYuanXiaoStillCostModelByStageNum(1, isHighRechargeGear);
      } else {
         List<Integer> canReceiveRewardIdList = (List)canReceiveRewardIds.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
         YuanXiaoStillCostModel yuanXiaoStillCost = this.getYuanXiaoStillCostModelById((Integer)canReceiveRewardIdList.get(0));
         int nextStageNum = yuanXiaoStillCost.getStageNum() + 1;
         return nextStageNum > nowUnlockStageNum ? null : this.getYuanXiaoStillCostModelByStageNum(nextStageNum, isHighRechargeGear);
      }
   }

   public void yuanXiaoStillCostEnd() {
      this.checkConIdListChange();
      Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
      List<ResourceModel> notReceiveRewardList = new ArrayList();
      if (allCanReceiveRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
            YuanXiaoStillCostModel yuanXiaoStillCost = this.getYuanXiaoStillCostModelById(canReceiveRewardId);
            if (null != yuanXiaoStillCost && yuanXiaoStillCost.getRewards().size() > 0) {
               notReceiveRewardList.addAll(yuanXiaoStillCost.getRewards());
            }
         }
      }

      if (notReceiveRewardList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_YUAN_XIAO_STILL_COST);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 89, 8231);
      }

      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      activityYuanXiaoDao.nowRechargeMoney = -1;
      activityYuanXiaoDao.rechargeCut = 0;
      activityYuanXiaoDao.canReceiveLowRewardIds.clear();
      activityYuanXiaoDao.canReceiveHighRewardIds.clear();
      activityYuanXiaoDao.hasReceiveRewardIds.clear();
      activityYuanXiaoDao.recordList.clear();
      activityYuanXiaoDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_StillCostTotalInfo_18356(YuanXiao2022Msg.C2S_StillCostTotalInfo_18356 msg, String source) {
      this.sendStillCostRewardInfo();
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      canReceiveRewardIds.addAll(activityYuanXiaoDao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(activityYuanXiaoDao.canReceiveHighRewardIds);
      if (activityYuanXiaoDao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(activityYuanXiaoDao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public void sendStillCostRewardInfo() {
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.Builder builder = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.newBuilder();
      builder.setUnlockStageNum(this.getNowUnlockStageNum());
      builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
      builder.addAllHasReceiveRewardIds(activityYuanXiaoDao.hasReceiveRewardIds);
      builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
      this.player.sendMsg(builder.build());
   }

   public List<YuanXiao2022Msg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<YuanXiao2022Msg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      YuanXiaoStillCostModel lowYuanXiaoStillCostModel = this.getPrepareUnlockStillCost(false);
      if (null != lowYuanXiaoStillCostModel) {
         YuanXiao2022Msg.NextUnlockReceiveReward.Builder lowReceiveReward = YuanXiao2022Msg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowYuanXiaoStillCostModel.getId());
         double unlockCondition = (double)(activityYuanXiaoDao.nowRechargeMoney - activityYuanXiaoDao.rechargeCut);
         double progress = unlockCondition / (double)lowYuanXiaoStillCostModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      YuanXiaoStillCostModel highYuanXiaoStillCostModel = this.getPrepareUnlockStillCost(true);
      if (null != highYuanXiaoStillCostModel) {
         YuanXiao2022Msg.NextUnlockReceiveReward.Builder highReceiveReward = YuanXiao2022Msg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highYuanXiaoStillCostModel.getId());
         double nowRechargeMoney = (double)activityYuanXiaoDao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highYuanXiaoStillCostModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveStillCostReward_18358(YuanXiao2022Msg.C2S_ReceiveStillCostReward_18358 msg, String source) {
      ActivityYuanXiaoDao activityYuanXiaoDao = this.getDao();
      int rewardId = msg.getRewardId();
      YuanXiaoStillCostModel yuanXiaoStillCost = this.getYuanXiaoStillCostModelById(rewardId);
      if (null == yuanXiaoStillCost) {
         return this.player.failure(76031);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(76031);
      } else if (activityYuanXiaoDao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(76030);
      } else {
         this.player.addResource(yuanXiaoStillCost.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 89, 8231, 0, 0, "");
         activityYuanXiaoDao.hasReceiveRewardIds.add(rewardId);
         activityYuanXiaoDao.updateOp();
         this.sendStillCostRewardInfo();
         return true;
      }
   }

   public YuanXiaoStillCostModel getYuanXiaoStillCostModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;

      for(YuanXiaoStillCostModel model : this.getYuanXiaoStillCostModelList()) {
         if (model.getStageNum() == stageNum && model.getRechargeGear() == rechargeGear) {
            return model;
         }
      }

      return null;
   }

   public YuanXiaoStillCostModel getYuanXiaoStillCostModelById(int id) {
      return (YuanXiaoStillCostModel)this.player.getGameModelPool().getEntity("YuanXiaoStillCost", id);
   }

   public void checkConIdListChange() {
      List<YuanXiaoStillCostModel> conModelList = this.getYuanXiaoStillCostModelList();
      if (conModelList != null && conModelList.size() > 0) {
         Set<Integer> conIdSet = new HashSet();

         for(YuanXiaoStillCostModel model : conModelList) {
            conIdSet.add(model.getId());
         }

         ActivityYuanXiaoDao dao = this.getDao();
         this.replaceConRewardIds(dao.canReceiveLowRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.canReceiveHighRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.hasReceiveRewardIds, conIdSet, conModelList);
         dao.updateOp();
      } else {
         this.logger.info("活动id:{} 连充配置表为空，请检查配置表", this.getActivityType());
      }
   }

   private void replaceConRewardIds(Set<Integer> daoRewardIds, Set<Integer> conIdSet, List<YuanXiaoStillCostModel> conModelList) {
      if (!daoRewardIds.isEmpty() && !conIdSet.containsAll(daoRewardIds)) {
         Set<Integer> newHasReceiveRewardIds = new HashSet();

         for(Integer rewardId : daoRewardIds) {
            YuanXiaoStillCostModel conModelById = this.getYuanXiaoStillCostModelById(rewardId);
            if (null != conModelById) {
               int stageNum = conModelById.getStageNum();
               int rechargeGear = conModelById.getRechargeGear();

               for(YuanXiaoStillCostModel model : conModelList) {
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

   private int handleNumByConfig(int msgNum) {
      String configString = this.configManager.getStrByDefault("YuanXiaoItemCost", "1,1|10,10|50,45");
      String[] costStr = configString.split("\\|");
      Map<Integer, Integer> map = new HashMap();

      for(String s : costStr) {
         String[] temp = s.split(",");
         map.put(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
      }

      return (Integer)map.get(msgNum);
   }

   private void recordServer(YuanxiaoLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadYuanXiaoRecord_4256.Builder builder = CrossMsg.S2CR_UploadYuanXiaoRecord_4256.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }
}
