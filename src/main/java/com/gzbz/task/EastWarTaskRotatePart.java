package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.EastWarTaskGroupModel;
import com.gzbz.model.EastWarTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.EastWarRotateMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class EastWarTaskRotatePart extends AbstractActivityTaskPart {
   public void checkLogin() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map == null || map.isEmpty()) {
         this.trigger();
      }

   }

   public void checkResetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.eastWarRotateData.dailyReset();
      playerActivityDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(this.getModule());
      this.trigger();
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_16251(EastWarRotateMsg.C2S_CommitTask_16251 msg, String source) {
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_EastWarTasks_16253(EastWarRotateMsg.C2S_EastWarTasks_16253 msg, String source) {
      this.taskList();
   }

   protected int rewardReason() {
      return 888;
   }

   protected int getActivityType() {
      return 42;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      EastWarTaskModel eastWarTaskModel = (EastWarTaskModel)ApplicationContextProvider.getModelPoolEntity("eastWarTask", taskId);
      if (eastWarTaskModel == null) {
         this.logger.error("踏浪东征任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return eastWarTaskModel.getRewards();
      }
   }

   public void trigger() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         if (activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Map<Integer, List<EastWarTaskGroupModel>> map = (Map)ApplicationContextProvider.getModelPoolEntity("customEastWarTaskGroup", this.getPlayerActivityId());
            List<Integer> enableGroupIdList = new ArrayList();

            for(Map.Entry<Integer, List<EastWarTaskGroupModel>> entry : map.entrySet()) {
               if (!playerActivityDao.eastWarRotateData.taskGroup.contains(entry.getKey())) {
                  enableGroupIdList.add(entry.getKey());
               }
            }

            if (!enableGroupIdList.isEmpty()) {
               Collections.shuffle(enableGroupIdList);
               int groupId = (Integer)enableGroupIdList.get(0);
               playerActivityDao.eastWarRotateData.taskGroup.add(groupId);

               for(EastWarTaskGroupModel task : (List)map.get(groupId)) {
                  super.createTask(task.getIncludeTaskId());
               }

            }
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         EastWarRotateMsg.S2C_UpdateTasks_16256.Builder builder = EastWarRotateMsg.S2C_UpdateTasks_16256.newBuilder();

         for(TaskData taskData : taskDataList) {
            if (taskData != null) {
               builder.addTask(taskData.toBuilder());
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_EAST_WAR_ROTATE;
   }

   public void commit(int taskId) {
      EastWarTaskModel model = (EastWarTaskModel)ApplicationContextProvider.getModelPoolEntity("eastWarTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            List<ResourceModel> resourceModelList = new ArrayList(this.getRewards(taskId));
            taskData.finish();
            this.player.addResource(resourceModelList, showType, 8, this.rewardReason(), 0, 0, "");
            String award = "";

            for(ResourceModel resourceModel : resourceModelList) {
               award = award + resourceModel.getId() + "-" + resourceModel.getValue() + ",";
            }

            EastWarTaskModel eastWarTaskModel = (EastWarTaskModel)ApplicationContextProvider.getModelPoolEntity("eastWarTask", taskId);
            if (eastWarTaskModel != null) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "踏浪东征轮换活动-任务", award, eastWarTaskModel.getTaskName(), 0, 0, 1);
            }
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      EastWarRotateMsg.S2C_CommitTask_16252.Builder builder = EastWarRotateMsg.S2C_CommitTask_16252.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public void taskList() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map != null && !map.isEmpty()) {
         EastWarRotateMsg.S2C_EastWarTasks_16254.Builder builder = EastWarRotateMsg.S2C_EastWarTasks_16254.newBuilder();

         for(Map.Entry<Integer, TaskData> entry : map.entrySet()) {
            builder.addTask(((TaskData)entry.getValue()).toBuilder());
         }

         this.player.sendMsg(builder.build());
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      EastWarTaskModel eastWarTaskModel = (EastWarTaskModel)ApplicationContextProvider.getModelPoolEntity("eastWarTask", taskId);
      return eastWarTaskModel != null && !eastWarTaskModel.getTargets().isEmpty() && eastWarTaskModel.getActivityId() == this.getPlayerActivityId() ? new TaskTargetItem(((TaskTargetItem)eastWarTaskModel.getTargets().get(0)).getTargetType(), ((TaskTargetItem)eastWarTaskModel.getTargets().get(0)).getTargetId(), ((TaskTargetItem)eastWarTaskModel.getTargets().get(0)).getTargetValue()) : null;
   }
}
