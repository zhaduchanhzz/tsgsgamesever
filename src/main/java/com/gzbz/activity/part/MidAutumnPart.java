package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityMidAutumnDao;
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
import com.gzbz.model.MidAutumnAddUpReturnAwardModel;
import com.gzbz.model.MidAutumnBanquetModel;
import com.gzbz.model.MidAutumnLotteryCostModel;
import com.gzbz.model.MidAutumnLotteryItemModel;
import com.gzbz.model.MidAutumnPlayModel;
import com.gzbz.model.MidAutumnPrayModel;
import com.gzbz.model.MidAutumnRewardModel;
import com.gzbz.model.MidAutumnShopAddUpModel;
import com.gzbz.model.MidAutumnSignAwardModel;
import com.gzbz.model.fun.MidAutumnStageModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.MidAutumnMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.MidAutumnTaskPart;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MidAutumnPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   ConfigManager configManager;

   public ActivityMidAutumnDao getDao() {
      ActivityMidAutumnDao activityMidAutumnDao = (ActivityMidAutumnDao)this.player.getData("tb_activity_mid_autumn", this.player.getPlayerId());
      return activityMidAutumnDao;
   }

   public int getActivityLogModule() {
      return 121;
   }

   public int getAddUpLogReason() {
      return 12101;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_MID_AUTUMN_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "ZhongqiuAddupRecharge";
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

   public void sendInfo() {
      super.sendInfo();
      if (!this.isServerActivityInvalid()) {
         this.flushReward();
         MidAutumnTaskPart midAutumnTaskPart = (MidAutumnTaskPart)this.player.getMgrPart(MidAutumnTaskPart.class);
         midAutumnTaskPart.trigger();
         ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
         MidAutumnMsg.S2C_Main_15102.Builder msg = MidAutumnMsg.S2C_Main_15102.newBuilder();
         msg.setDay(this.getSeverActivityDay());
         msg.setEnterCount(activityMidAutumnDao.makeCount);
         msg.addAllGotSiteReward(activityMidAutumnDao.gotSite);
         msg.setTier(activityMidAutumnDao.tier);
         msg.setEnjoy(activityMidAutumnDao.enjoy);
         msg.addAllFinishShow(activityMidAutumnDao.finishShow);
         msg.setFirstBanquet(activityMidAutumnDao.firstBanquet);
         msg.addAllTierRewardId(activityMidAutumnDao.posReward);

         for(TaskData taskData : midAutumnTaskPart.getTasksMap().values()) {
            msg.addTask(taskData.toBuilder());
         }

         msg.setGotWalk(activityMidAutumnDao.gotWalk);
         msg.addAllSignReceiveIds(activityMidAutumnDao.signReceiveIds);
         msg.setActivityOpenDay(this.getActivityOpenDay());
         this.player.sendMsg(msg.build());
         this.shopAddUpRechargeHandle(true);
         this.sendDrawInfo();
      }
   }

   public int getActivityType() {
      return 32;
   }

   public void rotateReset(int oldActivityId) {
      ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
      activityMidAutumnDao.gotSite.clear();
      activityMidAutumnDao.tier = 1;
      activityMidAutumnDao.enjoy = 0;
      activityMidAutumnDao.finishShow.clear();
      activityMidAutumnDao.makeCount = 0;
      activityMidAutumnDao.prayNum = 0;
      activityMidAutumnDao.totalPoint = 0;
      activityMidAutumnDao.rewardIds.clear();
      activityMidAutumnDao.posReward.clear();
      activityMidAutumnDao.firstBanquet = true;
      activityMidAutumnDao.gotWalk = false;
      activityMidAutumnDao.signReceiveIds.clear();
      activityMidAutumnDao.updateOp();
      this.drawReset();
      this.flushReward();
      this.clearActivityGift(24);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_MID_AUTUMN);
      MidAutumnTaskPart midAutumnTaskPart = (MidAutumnTaskPart)this.player.getMgrPart(MidAutumnTaskPart.class);
      midAutumnTaskPart.trigger();
      this.shopAddUpReset();
      this.clearActivityGift(24);
   }

   public void resetDaily() {
      super.resetDaily();
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
            activityMidAutumnDao.makeCount = 0;
            activityMidAutumnDao.updateOp();
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
   public void C2S_Main_15101(MidAutumnMsg.C2S_Main_15101 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_ExitBanquet_15105(MidAutumnMsg.C2S_ExitBanquet_15105 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
         if (activityMidAutumnDao.makeCount >= ApplicationContextProvider.getConfigInt("BanquetTime", 0)) {
            this.player.failure(51);
         } else {
            int banquetTime = ApplicationContextProvider.getConfigInt("ManufactureTime", 0);
            float makeTime = ApplicationContextProvider.getConfigFloat("makeTime", 0.0F);
            float maxTime = (makeTime + 1.0F) * (float)msg.getGuestCount();
            if (maxTime > (float)banquetTime) {
               this.player.failure(6);
            } else {
               List<ResourceModel> resourceModels = new ArrayList();
               int maxScore = 0;
               Map<Integer, MidAutumnBanquetModel> midAutumnBanquetModelMap = ApplicationContextProvider.<Integer, MidAutumnBanquetModel>getModelPoolMap("ZhongqiuBanquet");

               for(int guest : msg.getGuestList()) {
                  if (!midAutumnBanquetModelMap.containsKey(guest)) {
                     this.player.failure(6);
                     return;
                  }

                  MidAutumnBanquetModel midAutumnBanquetModel = (MidAutumnBanquetModel)midAutumnBanquetModelMap.get(guest);
                  maxScore += ((MidAutumnStageModel)midAutumnBanquetModel.getStage().get(0)).getScore();

                  for(ResourceModel resourceModel : midAutumnBanquetModel.getReward()) {
                     resourceModel.addResourceToList(resourceModels);
                  }
               }

               if (maxScore < msg.getScore()) {
                  this.player.failure(6);
               } else {
                  if (!resourceModels.isEmpty()) {
                     this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 121, 874, msg.getScore(), 0, msg.getGuestList().toString());
                  }

                  if (msg.getScore() > 0) {
                     activityMidAutumnDao.totalPoint += msg.getScore();
                     RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                     rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)activityMidAutumnDao.totalPoint, false, String.valueOf(this.getActivityType()), String.valueOf(this.getServerActivityInfo().id));
                  }

                  if (!activityMidAutumnDao.firstBanquet) {
                     ++activityMidAutumnDao.makeCount;
                  }

                  activityMidAutumnDao.firstBanquet = false;
                  activityMidAutumnDao.updateOp();
                  MidAutumnMsg.S2C_ExitBanquet_15106.Builder resp = MidAutumnMsg.S2C_ExitBanquet_15106.newBuilder();
                  resp.setScore(msg.getScore());
                  resp.setEnterCount(activityMidAutumnDao.makeCount);
                  resp.addAllGuest(msg.getGuestList());
                  resp.setFirstBanquet(activityMidAutumnDao.firstBanquet);
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
   public void C2S_PlayFinish_15107(MidAutumnMsg.C2S_PlayFinish_15107 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         MidAutumnPlayModel midAutumnPlayModel = (MidAutumnPlayModel)ApplicationContextProvider.getModelPoolEntity("ZhongqiuPlay", msg.getId());
         if (midAutumnPlayModel == null) {
            this.player.failure(6);
         } else {
            ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
            activityMidAutumnDao.finishShow.add(msg.getId());
            activityMidAutumnDao.updateOp();
            MidAutumnMsg.S2C_PlayFinish_15108.Builder resp = MidAutumnMsg.S2C_PlayFinish_15108.newBuilder();
            resp.setId(msg.getId());
            this.player.sendMsg(resp.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskReward_15111(MidAutumnMsg.C2S_TaskReward_15111 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         MidAutumnTaskPart midAutumnTaskPart = (MidAutumnTaskPart)this.player.getMgrPart(MidAutumnTaskPart.class);
         midAutumnTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_WalkReward_15113(MidAutumnMsg.C2S_WalkReward_15113 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
         if (activityMidAutumnDao.gotWalk) {
            this.player.failure(24);
         } else {
            List<Integer> configList = this.getConfigManager().getIntList("ZhongqiuWalk");
            int finishCount = 0;
            MidAutumnTaskPart midAutumnTaskPart = (MidAutumnTaskPart)this.player.getMgrPart(MidAutumnTaskPart.class);
            Map<Integer, TaskData> taskDataMap = midAutumnTaskPart.getTasksMap();

            for(TaskData taskData : taskDataMap.values()) {
               if (taskData.state >= 3) {
                  ++finishCount;
               }
            }

            if (finishCount < (Integer)configList.get(0)) {
               this.player.failure(33);
            } else {
               this.player.addResource(2, (Integer)configList.get(1), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 121, 875, finishCount, 0, "");
               activityMidAutumnDao.gotWalk = true;
               activityMidAutumnDao.updateOp();
               MidAutumnMsg.S2C_WalkReward_15114.Builder resp = MidAutumnMsg.S2C_WalkReward_15114.newBuilder();
               resp.setGotWalk(activityMidAutumnDao.gotWalk);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PrayEnjoy_15115(MidAutumnMsg.C2S_PrayEnjoy_15115 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         MidAutumnPrayModel midAutumnPrayModel = (MidAutumnPrayModel)ApplicationContextProvider.getModelPoolEntity("zhongqiuPray", msg.getEnjoy());
         if (midAutumnPrayModel == null) {
            this.player.failure(0);
         } else {
            ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
            if (activityMidAutumnDao.tier < midAutumnPrayModel.getTier()) {
               this.player.failure(0);
            } else {
               activityMidAutumnDao.enjoy = msg.getEnjoy();
               activityMidAutumnDao.updateOp();
               MidAutumnMsg.S2C_PrayEnjoy_15116.Builder resp = MidAutumnMsg.S2C_PrayEnjoy_15116.newBuilder();
               resp.setEnjoy(msg.getEnjoy());
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Pray_15117(MidAutumnMsg.C2S_Pray_15117 msg, String source) {
      if (msg.getCount() != 1) {
         this.player.failure(6);
      } else if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
         if (activityMidAutumnDao.enjoy <= 0) {
            this.player.failure(8024);
         } else {
            this.flushReward();
            Map<Integer, MidAutumnPrayModel> midAutumnPrayModelMap = ApplicationContextProvider.<Integer, MidAutumnPrayModel>getModelPoolMap("zhongqiuPray");
            if (midAutumnPrayModelMap != null && !midAutumnPrayModelMap.isEmpty()) {
               TreeMap<Integer, MidAutumnPrayModel> prayModelTreeMap = new TreeMap(midAutumnPrayModelMap);
               int totalTier = ((MidAutumnPrayModel)prayModelTreeMap.lastEntry().getValue()).getTier();
               ResourceModel feeResModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("Zhongqiurandeng", ""));
               if (!ResourceModel.checkTotalNumError(feeResModel.getValue(), msg.getCount())) {
                  feeResModel.setValue(feeResModel.getValue() * msg.getCount());
                  if (!this.player.checkResourceNum(feeResModel)) {
                     this.player.failure(8023);
                  } else {
                     MidAutumnPrayModel midAutumnPrayModel = (MidAutumnPrayModel)midAutumnPrayModelMap.get(activityMidAutumnDao.enjoy);
                     if (midAutumnPrayModel == null) {
                        this.player.failure(0);
                     } else {
                        List<WeightRandom.WeightObj<String>> weightObjList = new ArrayList();

                        for(int rewardId : activityMidAutumnDao.rewardIds) {
                           MidAutumnRewardModel midAutumnRewardModel = (MidAutumnRewardModel)ApplicationContextProvider.getModelPoolEntity("Zhongqiureward", rewardId);
                           if (midAutumnRewardModel != null && midAutumnRewardModel.getReward() != null && !midAutumnRewardModel.getReward().isEmpty()) {
                              weightObjList.add(new WeightRandom.WeightObj("c-" + midAutumnRewardModel.getId(), (double)midAutumnRewardModel.getWeight()));
                           }
                        }

                        if (weightObjList.isEmpty()) {
                           this.player.failure(37);
                        } else {
                           WeightRandom<String> weightRandom = RandomUtil.weightRandom(weightObjList);
                           int prayNum = activityMidAutumnDao.prayNum;
                           int tier = activityMidAutumnDao.tier;
                           List<ResourceModel> resourceModels = new ArrayList();
                           int rewardModelId = 0;
                           if (prayNum == activityMidAutumnDao.rewardIds.size()) {
                              if (midAutumnPrayModel.getReward() != null && !midAutumnPrayModel.getReward().isEmpty()) {
                                 resourceModels.addAll(midAutumnPrayModel.getReward());
                              }

                              if (totalTier == tier) {
                                 tier = 1;
                              } else {
                                 ++tier;
                              }

                              prayNum = 0;
                           } else {
                              ++prayNum;
                              if (prayNum >= midAutumnPrayModel.getFloorNum() && weightObjList.size() == activityMidAutumnDao.rewardIds.size() && midAutumnPrayModel.getReward() != null && !midAutumnPrayModel.getReward().isEmpty()) {
                                 weightRandom.add(new WeightRandom.WeightObj("e-" + midAutumnPrayModel.getId(), (double)midAutumnPrayModel.getWeight()));
                              }

                              String randomKey = (String)weightRandom.next();
                              rewardModelId = Integer.parseInt(randomKey.split("-")[1]);
                              if (randomKey.startsWith("e-")) {
                                 resourceModels.addAll(midAutumnPrayModel.getReward());
                                 if (totalTier == tier) {
                                    tier = 1;
                                 } else {
                                    ++tier;
                                 }

                                 prayNum = 0;
                              } else {
                                 MidAutumnRewardModel midAutumnRewardModel = (MidAutumnRewardModel)ApplicationContextProvider.getModelPoolEntity("Zhongqiureward", rewardModelId);
                                 resourceModels.addAll(midAutumnRewardModel.getReward());
                              }
                           }

                           this.player.delResource(feeResModel, 121, 876, msg.getCount(), 0, "");
                           this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 121, 876, 0, 0, "");
                           StringBuilder stringBuilder = new StringBuilder();

                           for(ResourceModel resourceModel : resourceModels) {
                              stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                           }

                           if (tier != activityMidAutumnDao.tier) {
                              activityMidAutumnDao.rewardIds.clear();
                              activityMidAutumnDao.enjoy = 0;
                              this.flushReward();
                              if (stringBuilder.length() > 0) {
                                 this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "燃灯祈福", stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), "是", activityMidAutumnDao.tier, 0, 0);
                              }
                           } else if (rewardModelId > 0) {
                              List<Integer> posList = new ArrayList();

                              for(int i = 0; i < activityMidAutumnDao.posReward.size(); ++i) {
                                 if ((Integer)activityMidAutumnDao.posReward.get(i) <= 0) {
                                    posList.add(i);
                                 }
                              }

                              activityMidAutumnDao.posReward.set((Integer)posList.get(RandomUtil.randomInt(0, posList.size())), rewardModelId);
                              if (stringBuilder.length() > 0) {
                                 this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "燃灯祈福", stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), "否", activityMidAutumnDao.tier, 0, 0);
                              }
                           }

                           activityMidAutumnDao.tier = tier;
                           activityMidAutumnDao.prayNum = prayNum;
                           activityMidAutumnDao.updateOp();
                           MidAutumnMsg.S2C_Pray_15118.Builder resp = MidAutumnMsg.S2C_Pray_15118.newBuilder();
                           resp.setTier(activityMidAutumnDao.tier);
                           resp.setCount(msg.getCount());
                           resp.setEnjoy(activityMidAutumnDao.enjoy);
                           resp.addAllTierRewardId(activityMidAutumnDao.posReward);
                           this.player.sendMsg(resp.build());
                        }
                     }
                  }
               }
            } else {
               this.player.failure(0);
            }
         }
      }
   }

   private void flushReward() {
      ActivityMidAutumnDao activityMidAutumnDao = this.getDao();
      if (activityMidAutumnDao.rewardIds.isEmpty()) {
         Map<Integer, MidAutumnRewardModel> midAutumnRewardModelMap = ApplicationContextProvider.<Integer, MidAutumnRewardModel>getModelPoolMap("Zhongqiureward");
         if (midAutumnRewardModelMap != null && !midAutumnRewardModelMap.isEmpty()) {
            int randomCount = ApplicationContextProvider.getConfigInt("OrdinaryReward", 0);
            Map<Integer, WeightRandom.WeightObj<Integer>> weightObjMap = new HashMap();

            for(MidAutumnRewardModel autumnRewardModel : midAutumnRewardModelMap.values()) {
               if (autumnRewardModel.getReward() != null && !autumnRewardModel.getReward().isEmpty()) {
                  weightObjMap.put(autumnRewardModel.getId(), new WeightRandom.WeightObj(autumnRewardModel.getId(), (double)autumnRewardModel.getWeight()));
               }
            }

            activityMidAutumnDao.posReward.clear();

            for(int i = 0; i < randomCount; ++i) {
               WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightObjMap.values());
               int rewardId = (Integer)weightRandom.next();
               activityMidAutumnDao.rewardIds.add(rewardId);
               activityMidAutumnDao.posReward.add(0);
               activityMidAutumnDao.updateOp();
               weightObjMap.remove(rewardId);
            }

         }
      }
   }

   public MidAutumnSignAwardModel getCurMidAutumnSignAwardModel() {
      ActivityMidAutumnDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      Map<Integer, MidAutumnSignAwardModel> signModelMap = ApplicationContextProvider.<Integer, MidAutumnSignAwardModel>getModelPoolMap("ZhongqiuSignAward");
      Set<Integer> canReceiveDays = new HashSet();

      for(Map.Entry<Integer, MidAutumnSignAwardModel> entry : signModelMap.entrySet()) {
         MidAutumnSignAwardModel model = (MidAutumnSignAwardModel)entry.getValue();
         if (!dao.signReceiveIds.contains(model.getDay()) && severActivityDay >= model.getDay()) {
            canReceiveDays.add(model.getDay());
         }
      }

      if (canReceiveDays != null && !canReceiveDays.isEmpty()) {
         Integer minDay = (Integer)canReceiveDays.stream().min((o1, o2) -> o1 - o2).get();
         return (MidAutumnSignAwardModel)signModelMap.get(minDay);
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_SignReceive_15119(MidAutumnMsg.C2S_SignReceive_15119 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         MidAutumnSignAwardModel curMidAutumnSignAwardModel = this.getCurMidAutumnSignAwardModel();
         if (curMidAutumnSignAwardModel == null) {
            return this.player.failure(76031);
         } else {
            ActivityMidAutumnDao dao = this.getDao();
            dao.signReceiveIds.add(curMidAutumnSignAwardModel.getDay());
            dao.updateOp();
            this.player.addResource(curMidAutumnSignAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 121, 12103, 0, 0, "");
            MidAutumnMsg.S2C_SignReceive_15120.Builder resp = MidAutumnMsg.S2C_SignReceive_15120.newBuilder();
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
            ActivityMidAutumnDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_15121(MidAutumnMsg.C2S_ShopAddUpInfo_15121 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_15123(MidAutumnMsg.C2S_ReceiveShopAddUpReward_15123 msg, String source) {
      int id = msg.getId();
      ActivityMidAutumnDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         MidAutumnShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12102, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      MidAutumnMsg.S2C_ShopAddUpInfo_15122.Builder builder = MidAutumnMsg.S2C_ShopAddUpInfo_15122.newBuilder();
      ActivityMidAutumnDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityMidAutumnDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, MidAutumnShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            MidAutumnShopAddUpModel model = (MidAutumnShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityMidAutumnDao dao = this.getDao();
      Map<Integer, MidAutumnShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(MidAutumnShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_MID_AUTUMN_SHOP_ADD_UP_RECHARGE);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 12102);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      MidAutumnShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityMidAutumnDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public MidAutumnShopAddUpModel getShopAddUpModel(int id) {
      MidAutumnShopAddUpModel model = (MidAutumnShopAddUpModel)this.player.getGameModelPool().getEntity("ZhongqiuShopAddup", id);
      return model;
   }

   public Map<Integer, MidAutumnShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, MidAutumnShopAddUpModel> modelMap = new HashMap();
      Map<Integer, MidAutumnShopAddUpModel> allModel = this.player.getGameModelPool().getMap("ZhongqiuShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, MidAutumnShopAddUpModel> entry : allModel.entrySet()) {
            MidAutumnShopAddUpModel model = (MidAutumnShopAddUpModel)entry.getValue();
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
      ActivityMidAutumnDao dao = this.getDao();
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
      ActivityMidAutumnDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_15124(MidAutumnMsg.C2S_FancyReward_15124 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityMidAutumnDao dao = this.getDao();
         MidAutumnLotteryItemModel lotteryItemModel = (MidAutumnLotteryItemModel)this.player.getGameModelPool().getEntity("ZhongqiuLotteryItem", msg.getTargetId());
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
                  MidAutumnMsg.S2C_FancyReward_15125.Builder builder = MidAutumnMsg.S2C_FancyReward_15125.newBuilder();
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
      Map<Integer, MidAutumnLotteryItemModel> allMap = this.player.getGameModelPool().getMap("ZhongqiuLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(MidAutumnLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_15128(MidAutumnMsg.C2S_Draw_15128 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         MidAutumnLotteryCostModel costModel = (MidAutumnLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("ZhongqiuLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(46, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityMidAutumnDao dao = this.getDao();
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
                     Map<Integer, MidAutumnLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        MidAutumnLotteryItemModel enjoyModel = (MidAutumnLotteryItemModel)this.player.getGameModelPool().getEntity("ZhongqiuLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           MidAutumnLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ActivityMidAutumnDao.RecordInfo recordInfo = new ActivityMidAutumnDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 12105, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_MID_AUTUMN_DRAW_ACTIVITY, this.getActivityLogModule(), 12104, 0, 0, "");
                        playerResetCustomCache.addDailyReset(46, lotteryNum);
                        MidAutumnMsg.S2C_Draw_15129.Builder builder = MidAutumnMsg.S2C_Draw_15129.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(46, 0);
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

   public Map<Integer, MidAutumnLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, MidAutumnLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("ZhongqiuLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, MidAutumnLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, MidAutumnLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((MidAutumnLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((MidAutumnLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((MidAutumnLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((MidAutumnLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((MidAutumnLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((MidAutumnLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private MidAutumnLotteryItemModel smashEgg(ActivityMidAutumnDao dao, Map<Integer, MidAutumnLotteryItemModel> itemModelMap) {
      Map<Integer, MidAutumnLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(MidAutumnLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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
         int r = misc.RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(MidAutumnLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_15126(MidAutumnMsg.C2S_LuckDrawInfo_15126 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityMidAutumnDao dao = this.getDao();
      MidAutumnMsg.S2C_LuckDrawInfo_15127.Builder builder = MidAutumnMsg.S2C_LuckDrawInfo_15127.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(46, 0);
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

   public List<MidAutumnLotteryItemModel> getDrawJackpot() {
      List<MidAutumnLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, MidAutumnLotteryItemModel>> lotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, MidAutumnLotteryItemModel>>getModelPoolMap("customZhongqiuLotteryItem");
      TreeMap<Integer, Map<Integer, MidAutumnLotteryItemModel>> treeMap = new TreeMap(lotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, MidAutumnLotteryItemModel> modelMap = (Map)lotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(MidAutumnLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<MidAutumnLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("砥兵砺伍活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         MidAutumnLotteryItemModel model = (MidAutumnLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(MidAutumnLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadMidAutumnRecord_4229.Builder builder = CrossMsg.S2CR_UploadMidAutumnRecord_4229.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(model.getStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_15130(MidAutumnMsg.C2S_OpenReward_15130 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         MidAutumnAddUpReturnAwardModel awardModel = (MidAutumnAddUpReturnAwardModel)ApplicationContextProvider.getModelPoolEntity("ZhongqiuAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityMidAutumnDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("砥兵砺伍活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("砥兵砺伍活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 12106, 0, 0, "");
                  MidAutumnMsg.S2C_OpenReward_15131.Builder builder = MidAutumnMsg.S2C_OpenReward_15131.newBuilder();
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
   public void C2S_DrawRecord_15132(MidAutumnMsg.C2S_DrawRecord_15132 msg, String source) {
      MidAutumnMsg.S2C_DrawRecord_15133.Builder builder = MidAutumnMsg.S2C_DrawRecord_15133.newBuilder();
      ActivityMidAutumnDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         MidAutumnMsg.MyDrawRecord.Builder drawRecord = MidAutumnMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_15134(MidAutumnMsg.C2S_ServerDrawRecord_15134 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      MidAutumnLotteryItemModel model = (MidAutumnLotteryItemModel)this.player.getGameModelPool().getEntity("ZhongqiuLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, MidAutumnLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               MidAutumnLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private MidAutumnLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, MidAutumnLotteryItemModel> itemModelMap) {
      Map<Integer, MidAutumnLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(MidAutumnLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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
         int r = misc.RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(MidAutumnLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
