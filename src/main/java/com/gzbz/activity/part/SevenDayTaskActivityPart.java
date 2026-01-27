package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityPointRewardModel;
import com.gzbz.model.ActivityPropsModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.RechargeAwardModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivitySevenDayTaskPart;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SevenDayTaskActivityPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_SevenTaskActivity_6747(ActivityMsg.C2S_SevenTaskActivity_6747 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_SevenTaskCommitTask_6755(ActivityMsg.C2S_SevenTaskCommitTask_6755 msg, String source) {
      int taskId = msg.getTaskId();
      ActivitySevenDayTaskPart activitySevenDayTaskPart = (ActivitySevenDayTaskPart)this.player.getMgrPart(ActivitySevenDayTaskPart.class);
      activitySevenDayTaskPart.commit(taskId);
   }

   @MsgHandlerAnno
   public void C2S_SevenTaskBoxReward_6749(ActivityMsg.C2S_SevenTaskBoxReward_6749 msg, String source) {
      int boxId = msg.getBoxId();
      int activityId = this.getPlayerActivityId();
      if (activityId <= 0) {
         this.player.failure(8007);
      } else {
         Map<Integer, Map<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, Map<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
         if (rewardMap.containsKey(activityId) && ((Map)rewardMap.get(activityId)).containsKey(boxId)) {
            ActivityPointRewardModel activityPointRewardModel = (ActivityPointRewardModel)((Map)rewardMap.get(activityId)).get(boxId);
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            if (playerActivityDao.boxReward.contains(boxId)) {
               this.player.failure(24);
            } else {
               if (activityPointRewardModel.getPointType() > 0) {
                  if (!this.player.checkResourceNum(activityPointRewardModel.getPointType(), activityPointRewardModel.getPointId(), activityPointRewardModel.getPointNum())) {
                     this.player.failure(36);
                     return;
                  }
               } else if (playerActivityDao.sevenTaskPoint < activityPointRewardModel.getPointNum()) {
                  this.player.failure(36);
                  return;
               }

               playerActivityDao.boxReward.add(boxId);
               playerActivityDao.updateOp();
               this.player.addResource(activityPointRewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 813, boxId, 0, "");
               this.sendBoxRewardResult(boxId);
               ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
               if (activityOpenTimeModel != null) {
                  SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", activityOpenTimeModel.getSystemid());
                  if (systemFunctionModel != null) {
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, systemFunctionModel.getId(), systemFunctionModel.getName(), String.valueOf(activityPointRewardModel.getPointNum()), String.valueOf(activityPointRewardModel.getPointNum()), 0, 0, 100);
                  }
               }
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SevenTaskRechargeTotalReward_6751(ActivityMsg.C2S_SevenTaskRechargeTotalReward_6751 msg, String source) {
      int id = msg.getRewardId();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.sevenTaskRechargeReward.contains(id)) {
         this.player.failure(24);
      } else if (!this.checkRechargeAward(id, (Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, this.getActivityRotateType(), 0))) {
         this.logger.error("七日任务活动累充奖励{}不是该轮换类型奖励", id);
         this.player.failure(0);
      } else {
         PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
         int result = playerRechargePart.rechargeTotalReward(id, (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0), 8, 819);
         if (result != 1) {
            this.player.failure(result);
         } else {
            playerActivityDao.sevenTaskRechargeReward.add(id);
            playerActivityDao.updateOp();
            this.sendRechargeRewardResult(id);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SevenTaskRechargeTotalInfo_6773(ActivityMsg.C2S_SevenTaskRechargeTotalInfo_6773 msg, String source) {
      this.sendRechargeRewardInfo();
   }

   public void sendInfo() {
      ActivitySevenDayTaskPart activitySevenDayTaskPart = (ActivitySevenDayTaskPart)this.player.getMgrPart(ActivitySevenDayTaskPart.class);
      activitySevenDayTaskPart.sendInfo();
   }

   public int getActivityType() {
      return 1;
   }

   public int getActivityRotateType() {
      int activityId = this.getPlayerActivityId();
      if (activityId == 0) {
         return 0;
      } else if (activityId == 1110) {
         return 8;
      } else {
         return activityId == 1130 ? 7 : 0;
      }
   }

   public void loginHandle() {
   }

   public void rotateReset(int oldActivityId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACTIVITY_SEVEN);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.boxReward.clear();
      playerActivityDao.sevenTaskRechargeReward.clear();
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", oldActivityId);
      if (activityPropsModel != null) {
         if (activityPropsModel.getPointType() > 0) {
            this.player.delResource(activityPropsModel.getPointType(), activityPropsModel.getPointId(), playerDao.getProperty(activityPropsModel.getPointId()), 8, 820, oldActivityId, 0, "");
         } else {
            playerActivityDao.sevenTaskPoint = 0;
         }
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(this.getActivityRotateType());
      if (rotaingPackagesModel != null && (Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, this.getActivityRotateType(), 0) != rotaingPackagesModel.getActivityId()) {
         playerActivityDao.activityRotateMap.put(this.getActivityRotateType(), rotaingPackagesModel.getActivityId());
         playerActivityDao.updateOp();
      }

      playerActivityDao.updateOp();
      giftPart.clearGifts(12);
      this.checkActivityRotateType();
      ActivitySevenDayTaskPart activitySevenDayTaskPart = (ActivitySevenDayTaskPart)this.player.getMgrPart(ActivitySevenDayTaskPart.class);
      activitySevenDayTaskPart.trigger();
   }

   public void resetDaily() {
      ActivitySevenDayTaskPart activitySevenDayTaskPart = (ActivitySevenDayTaskPart)this.player.getMgrPart(ActivitySevenDayTaskPart.class);
      activitySevenDayTaskPart.clearTasks();
      activitySevenDayTaskPart.trigger();
   }

   private void checkActivityRotateType() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(this.getActivityRotateType());
      if (rotaingPackagesModel != null && rotaingPackagesModel.getActivityId() != (Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, this.getActivityRotateType(), 0)) {
         playerActivityDao.activityRotateMap.put(this.getActivityRotateType(), rotaingPackagesModel.getActivityId());
         playerActivityDao.updateOp();
      }

   }

   public void gmSetDay(int day) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityInfo activityInfo = (ActivityInfo)playerActivityDao.activities.get(this.getActivityType());
      if (activityInfo != null) {
         ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", this.getActivityType());
         activityInfo.start = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis()) - (long)(day - 1) * 86400000L);
         activityInfo.drop = activityInfo.start + activityRuleModel.getDropTime() - 1;
         activityInfo.end = activityInfo.start + activityRuleModel.getDuration() - 1;
         playerActivityDao.updateOp();
         ActivityPart activityPart = (ActivityPart)this.player.getMgrPart(ActivityPart.class);
         activityPart.resetDaily();
         this.resetDaily();
      }
   }

   public void gmAddPoint(int point) {
      int activityId = this.getPlayerActivityId();
      ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", activityId);
      if (activityPropsModel != null) {
         if (activityPropsModel.getPointType() > 0) {
            this.player.addResource(activityPropsModel.getPointType(), activityPropsModel.getPointId(), point, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 306, activityId, 0, "");
         } else {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            playerActivityDao.sevenTaskPoint += point;
            playerActivityDao.updateOp();
            this.sendInfo();
         }
      }

   }

   private void sendBoxRewardResult(int boxId) {
      ActivityMsg.S2C_SevenTaskBoxRewardResult_6750.Builder msg = ActivityMsg.S2C_SevenTaskBoxRewardResult_6750.newBuilder();
      msg.setBoxId(boxId);
      this.player.sendMsg(msg.build());
   }

   private void sendRechargeRewardResult(int id) {
      ActivityMsg.S2C_SevenTaskRechargeTotalReward_6752.Builder msg = ActivityMsg.S2C_SevenTaskRechargeTotalReward_6752.newBuilder();
      msg.setRewardId(id);
      this.player.sendMsg(msg.build());
   }

   public void sendRechargeRewardInfo() {
      ActivityMsg.S2C_SevenTaskRechargeTotalInfo_6774.Builder resp = ActivityMsg.S2C_SevenTaskRechargeTotalInfo_6774.newBuilder();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int rotateId = (Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, this.getActivityRotateType(), 0);
      if (rotateId == 0) {
         this.checkActivityRotateType();
      }

      for(RechargeAwardModel rechargeAwardModel : this.getRechargeAwards((Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, this.getActivityRotateType(), 0))) {
         ActivityMsg.RechargeTotalData.Builder rechargeTotalData = ActivityMsg.RechargeTotalData.newBuilder();
         rechargeTotalData.setId(rechargeAwardModel.getId());
         rechargeTotalData.setIsGot(playerActivityDao.sevenTaskRechargeReward.contains(rechargeAwardModel.getId()));

         for(ResourceModel resourceModel : rechargeAwardModel.getItems()) {
            rechargeTotalData.addRewards(resourceModel.builder());
         }

         resp.addRewardList(rechargeTotalData);
      }

      resp.setRechargeTotal((Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0));
      this.player.sendMsg(resp.build());
   }
}
