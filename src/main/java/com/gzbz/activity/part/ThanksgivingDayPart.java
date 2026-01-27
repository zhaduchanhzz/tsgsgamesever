package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityThanksgivingDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityPrizeModel;
import com.gzbz.model.GanenRewardModel;
import com.gzbz.model.GanenSignModel;
import com.gzbz.model.GanenTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ChongYangMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ThanksgivingDayMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ThanksgivingDayTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ThanksgivingDayPart extends AbstractActivityPart {
   @Autowired
   private ConfigManager configManager;

   public void sendInfo() {
   }

   public int getActivityType() {
      return 55;
   }

   public void rotateReset(int oldActivityId) {
      ActivityThanksgivingDao activityThanksgivingDao = this.getThanksgivingDao();
      activityThanksgivingDao.useFree = 0;
      activityThanksgivingDao.signDays.clear();
      activityThanksgivingDao.roundNum = 0;
      activityThanksgivingDao.luckNum = 0;
      activityThanksgivingDao.taskPoint = 0;
      activityThanksgivingDao.pointReward.clear();
      activityThanksgivingDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_THANKSGIVING);
      ThanksgivingDayTaskPart thanksgivingDayTaskPart = (ThanksgivingDayTaskPart)this.player.getMgrPart(ThanksgivingDayTaskPart.class);
      thanksgivingDayTaskPart.trigger();
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            ActivityThanksgivingDao activityThanksgivingDao = this.getThanksgivingDao();
            activityThanksgivingDao.useFree = 0;
            activityThanksgivingDao.updateOp();
         }
      }
   }

   public void activityEnd(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_THANKSGIVING);
   }

   @MsgHandlerAnno
   public void C2S_Main_17001(ThanksgivingDayMsg.C2S_Main_17001 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityThanksgivingDao activityThanksgivingDao = this.getThanksgivingDao();
         ThanksgivingDayMsg.S2C_Main_17002.Builder resp = ThanksgivingDayMsg.S2C_Main_17002.newBuilder();

         for(Map.Entry<Integer, Integer> entry : activityThanksgivingDao.signDays.entrySet()) {
            ChongYangMsg.SignInfo.Builder builder = ChongYangMsg.SignInfo.newBuilder();
            builder.setDay((Integer)entry.getKey());
            builder.setState((Integer)entry.getValue());
            resp.addInfos(builder);
         }

         resp.setUseFree(activityThanksgivingDao.useFree);
         resp.setRoundNum(activityThanksgivingDao.roundNum);
         resp.setDay(this.getSeverActivityDay());
         resp.setTaskPoint(activityThanksgivingDao.taskPoint);
         resp.addAllPointReward(activityThanksgivingDao.pointReward);
         Map<Integer, Map<Integer, TreeMap<Integer, GanenTaskModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, GanenTaskModel>>>getModelPoolMap("customGanenlllustration");
         Map<Integer, TreeMap<Integer, GanenTaskModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, this.getServerActivityInfo().id, ConcurrentHashMap.class);
         ThanksgivingDayTaskPart thanksgivingDayTaskPart = (ThanksgivingDayTaskPart)this.player.getMgrPart(ThanksgivingDayTaskPart.class);

         for(Map.Entry<Integer, TreeMap<Integer, GanenTaskModel>> entry : activityDataModelMap.entrySet()) {
            int illustrationId = (Integer)entry.getKey();
            ThemeActivityMsg.IllustrationData.Builder builder = ThemeActivityMsg.IllustrationData.newBuilder();
            builder.setIllustrationId(illustrationId);
            TreeMap<Integer, GanenTaskModel> illustrationModelMap = (TreeMap)entry.getValue();

            for(GanenTaskModel ganenTaskModel : illustrationModelMap.values()) {
               TaskData taskData = thanksgivingDayTaskPart.getTask(ganenTaskModel.getTaskId());
               if (taskData != null) {
                  builder.addTask(thanksgivingDayTaskPart.buildTask(taskData));
               }
            }

            resp.addIllustration(builder);
         }

         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_Sign_17003(ThanksgivingDayMsg.C2S_Sign_17003 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         int activityDay = this.getSeverActivityDay();
         if (msg.getDay() >= 1 && msg.getDay() <= activityDay) {
            ActivityThanksgivingDao activityThanksgivingDao = this.getThanksgivingDao();
            if (activityThanksgivingDao.signDays.containsKey(msg.getDay())) {
               this.player.failure(24);
            } else {
               Map<Integer, GanenSignModel> ganenSignModelMap = (Map)this.player.getGameModelPool().getEntity("cutomGanenSign", this.getServerActivityInfo().id);
               if (ganenSignModelMap == null) {
                  this.player.failure(0);
               } else {
                  GanenSignModel ganenSignModel = (GanenSignModel)ganenSignModelMap.get(msg.getDay());
                  if (ganenSignModel == null) {
                     this.player.failure(0);
                  } else {
                     int state = 1;
                     List<ResourceModel> needResourceList = this.configManager.getResourceModelList("ganenSign", "1|9|50");
                     if (activityDay != msg.getDay()) {
                        if (needResourceList == null || needResourceList.isEmpty()) {
                           this.player.failure(0);
                           return;
                        }

                        if (!this.player.checkResourceNum(needResourceList)) {
                           this.player.failure(31);
                           return;
                        }

                        this.player.delResource((List)needResourceList, 82, 8201, msg.getDay(), 0, "");
                        state = 2;
                     }

                     this.player.addResource(ganenSignModel.getItem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8201, msg.getDay(), 0, "");
                     activityThanksgivingDao.signDays.put(msg.getDay(), state);
                     activityThanksgivingDao.updateOp();
                     ThanksgivingDayMsg.S2C_Sign_17004.Builder resp = ThanksgivingDayMsg.S2C_Sign_17004.newBuilder();

                     for(Map.Entry<Integer, Integer> entry : activityThanksgivingDao.signDays.entrySet()) {
                        ChongYangMsg.SignInfo.Builder builder = ChongYangMsg.SignInfo.newBuilder();
                        builder.setDay((Integer)entry.getKey());
                        builder.setState((Integer)entry.getValue());
                        resp.addInfos(builder);
                     }

                     this.player.sendMsg(resp.build());
                     int itemId = 0;
                     int itemNum = 0;
                     if (state == 2) {
                        for(ResourceModel resourceModel : needResourceList) {
                           itemId = resourceModel.getId();
                           itemNum = resourceModel.getValue();
                        }
                     }

                     for(ResourceModel resourceModel : ganenSignModel.getItem()) {
                        String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                        this.player.getOperationMgr().addExtraLog(this.player, 198, "感恩节-签到", itemId + "", itemNum + "", strings[0], strings[2], strings[1], "0");
                     }

                  }
               }
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_FindTreasure_17005(ThanksgivingDayMsg.C2S_FindTreasure_17005 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, ActivityPrizeModel> activityPrizeModelMap = (Map)this.player.getGameModelPool().getEntity("customActivityPrize", this.getServerActivityInfo().id);
         if (activityPrizeModelMap == null) {
            this.player.failure(0);
         } else {
            int freeNum = ApplicationContextProvider.getConfigInt("ganenTime", 0);
            ActivityThanksgivingDao activityThanksgivingDao = this.getThanksgivingDao();
            ResourceModel needFeeResource = null;
            if (activityThanksgivingDao.useFree >= freeNum) {
               String needFeeStr = ApplicationContextProvider.getConfigString("ganenMould", "2|1201|1");
               needFeeResource = ResourceModel.buildResource(needFeeStr);
               if (ResourceModel.checkTotalNumError(needFeeResource.getValue(), msg.getNum())) {
                  return;
               }

               needFeeResource.setValue(needFeeResource.getValue() * msg.getNum());
               if (!this.player.checkResourceNum(needFeeResource)) {
                  this.player.failure(61223);
                  return;
               }
            } else if (msg.getNum() != 1) {
               this.player.failure(0);
               return;
            }

            List<Integer> awardList = this.configManager.getIntList("ganenGroup");
            if (awardList.isEmpty()) {
               this.player.failure(37);
            } else {
               List<Integer> ganenTreasure = this.configManager.getIntList("ganenTreasure");
               if (ganenTreasure.size() < 2) {
                  this.player.failure(37);
               } else {
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  List<ResourceModel> addList = new ArrayList();

                  for(int i = 0; i < msg.getNum(); ++i) {
                     int awardGroupId = 0;
                     boolean isRoundAward = false;
                     boolean isLuck = false;
                     if (activityThanksgivingDao.luckNum + 1 >= (Integer)ganenTreasure.get(1)) {
                        awardGroupId = (Integer)ganenTreasure.get(0);
                        isLuck = true;
                     } else {
                        ActivityPrizeModel activityPrizeModel = (ActivityPrizeModel)activityPrizeModelMap.get(activityThanksgivingDao.roundNum + 1);
                        if (activityPrizeModel == null) {
                           return;
                        }

                        if (awardList.size() != activityPrizeModel.getProgressValue().size()) {
                           return;
                        }

                        int totalVal = 0;

                        for(Integer val : activityPrizeModel.getProgressValue()) {
                           totalVal += val;
                        }

                        int groupRandom = RandomUtil.randInt(totalVal);
                        int temp_val = 0;

                        for(int j = 0; j < activityPrizeModel.getProgressValue().size(); ++j) {
                           temp_val += (Integer)activityPrizeModel.getProgressValue().get(j);
                           if (temp_val > groupRandom) {
                              awardGroupId = (Integer)awardList.get(j);
                              if (j == activityPrizeModel.getProgressValue().size() - 1) {
                                 isRoundAward = true;
                              }
                              break;
                           }
                        }
                     }

                     addList.addAll(itemBagPart.getRandomAward(awardGroupId, 1));
                     if (isLuck) {
                        activityThanksgivingDao.roundNum = 0;
                        activityThanksgivingDao.luckNum = 0;
                     } else if (isRoundAward) {
                        activityThanksgivingDao.roundNum = 0;
                        ++activityThanksgivingDao.luckNum;
                     } else {
                        ++activityThanksgivingDao.roundNum;
                        ++activityThanksgivingDao.luckNum;
                     }
                  }

                  activityThanksgivingDao.updateOp();
                  if (needFeeResource == null) {
                     ++activityThanksgivingDao.useFree;
                     activityThanksgivingDao.updateOp();
                  } else {
                     this.player.delResource(needFeeResource, 82, 8202, 0, msg.getNum(), "");
                  }

                  this.player.addResource(addList, PlayerMsg.ShowType.SHOW_CHONG_YANG, 82, 8202, 0, msg.getNum(), "");
                  ThanksgivingDayMsg.S2C_FindTreasure_17006.Builder resp = ThanksgivingDayMsg.S2C_FindTreasure_17006.newBuilder();
                  resp.setUseFree(activityThanksgivingDao.useFree);
                  resp.setRoundNum(activityThanksgivingDao.roundNum);
                  this.player.sendMsg(resp.build());
                  int itemId = 0;
                  int itemNum = 0;
                  if (needFeeResource != null) {
                     itemId = needFeeResource.getId();
                     itemNum = needFeeResource.getValue();
                  }

                  for(ResourceModel resourceModel : addList) {
                     String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                     this.player.getOperationMgr().addExtraLog(this.player, 198, "感恩节-探宝", itemId + "", itemNum + "", strings[0], strings[2], strings[1], "0");
                  }

               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskCommit_17007(ThanksgivingDayMsg.C2S_TaskCommit_17007 msg, String source) {
      ThanksgivingDayTaskPart thanksgivingDayTaskPart = (ThanksgivingDayTaskPart)this.player.getMgrPart(ThanksgivingDayTaskPart.class);
      thanksgivingDayTaskPart.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_TaskPointReward_17011(ThanksgivingDayMsg.C2S_TaskPointReward_17011 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         GanenRewardModel ganenRewardModel = (GanenRewardModel)ApplicationContextProvider.getModelPoolEntity("GanenReward", msg.getPointReward());
         if (ganenRewardModel == null) {
            this.player.failure(0);
         } else {
            ActivityThanksgivingDao activityThanksgivingDao = this.getThanksgivingDao();
            if (activityThanksgivingDao.pointReward.contains(msg.getPointReward())) {
               this.player.failure(24);
            } else if (ganenRewardModel.getPoint() > activityThanksgivingDao.taskPoint) {
               this.player.failure(36);
            } else {
               activityThanksgivingDao.pointReward.add(msg.getPointReward());
               activityThanksgivingDao.updateOp();
               this.player.addResource(ganenRewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8204, 0, msg.getPointReward(), "");
               ThanksgivingDayMsg.S2C_TaskPointReward_17012.Builder resp = ThanksgivingDayMsg.S2C_TaskPointReward_17012.newBuilder();
               resp.setPointReward(msg.getPointReward());
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   public ActivityThanksgivingDao getThanksgivingDao() {
      return (ActivityThanksgivingDao)this.player.getData("tb_activity_thanksgiving", this.player.getPlayerId());
   }
}
