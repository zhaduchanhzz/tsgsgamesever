package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityRotateSignDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityPointRewardModel;
import com.gzbz.model.ActivityPropsModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RotateActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityQrywTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class QrywActivityPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_Qryw_16139(RotateActivityMsg.C2S_Qryw_16139 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_QrywCommitTask_16143(RotateActivityMsg.C2S_QrywCommitTask_16143 msg, String source) {
      int taskId = msg.getTaskId();
      ActivityQrywTaskPart activityQrywTaskPart = (ActivityQrywTaskPart)this.player.getMgrPart(ActivityQrywTaskPart.class);
      activityQrywTaskPart.commit(taskId);
   }

   @MsgHandlerAnno
   public void C2S_QrywBoxReward_16141(RotateActivityMsg.C2S_QrywBoxReward_16141 msg, String source) {
      int boxId = msg.getBoxId();
      int activityId = this.getPlayerActivityId();
      if (activityId <= 0) {
         this.player.failure(8007);
      } else {
         Map<Integer, Map<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, Map<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
         if (rewardMap.containsKey(activityId) && ((Map)rewardMap.get(activityId)).containsKey(boxId)) {
            ActivityPointRewardModel activityPointRewardModel = (ActivityPointRewardModel)((Map)rewardMap.get(activityId)).get(boxId);
            ActivityRotateSignDao rotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
            HashSet boxReward = (HashSet)rotateSignDao.boxReward.get(this.getActivityType());
            if (boxReward != null && boxReward.contains(boxId)) {
               this.player.failure(24);
            } else if ((Integer)MapUtil.getOrDefault(rotateSignDao.point, this.getActivityType(), 0) < activityPointRewardModel.getPointNum()) {
               this.player.failure(36);
            } else {
               if (boxReward == null) {
                  boxReward = new HashSet();
               }

               boxReward.add(boxId);
               rotateSignDao.boxReward.put(this.getActivityType(), boxReward);
               rotateSignDao.updateOp();
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

   public void sendInfo() {
      ActivityQrywTaskPart activityQrywTaskPart = (ActivityQrywTaskPart)this.player.getMgrPart(ActivityQrywTaskPart.class);
      activityQrywTaskPart.sendInfo();
   }

   public int getActivityType() {
      return 48;
   }

   public void rotateReset(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_QRYW);
      ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      activityRotateSignDao.boxReward.remove(this.getActivityType());
      activityRotateSignDao.point.remove(this.getActivityType());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      activityRotateSignDao.updateOp();
      giftPart.clearGifts(12);
      ActivityQrywTaskPart activityQrywTaskPart = (ActivityQrywTaskPart)this.player.getMgrPart(ActivityQrywTaskPart.class);
      activityQrywTaskPart.trigger();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   public void resetDaily() {
      ActivityQrywTaskPart activityQrywTaskPart = (ActivityQrywTaskPart)this.player.getMgrPart(ActivityQrywTaskPart.class);
      activityQrywTaskPart.trigger();
   }

   private void sendBoxRewardResult(int boxId) {
      RotateActivityMsg.S2C_QrywBoxReward_16142.Builder msg = RotateActivityMsg.S2C_QrywBoxReward_16142.newBuilder();
      msg.setBoxId(boxId);
      this.player.sendMsg(msg.build());
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", this.getPlayerActivityId());
         if (activityOpenTimeModel != null) {
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", activityOpenTimeModel.getSystemid());
            if (systemFunctionModel != null) {
               ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
               ActivityQrywTaskPart activityQrywTaskPart = (ActivityQrywTaskPart)this.player.getMgrPart(ActivityQrywTaskPart.class);
               List<ResourceModel> rewardList = new ArrayList();
               int point = (Integer)MapUtil.getOrDefault(activityRotateSignDao.point, this.getActivityType(), 0);

               for(TaskData taskData : activityQrywTaskPart.getTasksMap().values()) {
                  if (taskData.state == CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
                     SevenDaysTaskModel taskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
                     if (taskModel != null) {
                        for(ResourceModel reward : taskModel.getRewards()) {
                           reward.addResourceToList(rewardList);
                        }
                     }

                     ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", this.getPlayerActivityId());
                     if (activityPropsModel != null && point < activityPropsModel.getPointMax()) {
                        point = Math.min(point + activityPropsModel.getPointNum(), activityPropsModel.getPointMax());
                     }
                  }
               }

               activityRotateSignDao.point.put(this.getActivityType(), point);
               Map<Integer, Map<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, Map<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
               HashSet boxReward = (HashSet)activityRotateSignDao.boxReward.get(this.getActivityType());
               if (rewardMap.containsKey(this.getPlayerActivityId())) {
                  for(ActivityPointRewardModel activityPointRewardModel : (rewardMap.get(this.getPlayerActivityId())).values()) {
                     if ((boxReward == null || !boxReward.contains(activityPointRewardModel.getId())) && point >= activityPointRewardModel.getPointNum()) {
                        if (boxReward == null) {
                           boxReward = new HashSet();
                        }

                        boxReward.add(activityPointRewardModel.getId());

                        for(ResourceModel reward : activityPointRewardModel.getRewards()) {
                           reward.addResourceToList(rewardList);
                        }
                     }
                  }
               }

               activityRotateSignDao.boxReward.put(this.getActivityType(), boxReward);
               activityRotateSignDao.updateOp();
               TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
               taskCustomCache.delete(TaskDefine.TaskModule.MODULE_QRYW);
               this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_GOT_REWARD, rewardList);
            }
         }
      }
   }
}
