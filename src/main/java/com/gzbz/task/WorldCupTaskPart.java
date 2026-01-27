package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.WorldCupTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WorldCupMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WorldCupTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 13201;
   }

   protected int getActivityType() {
      return 95;
   }

   public void sendInfo() {
      WorldCupMsg.S2C_TaskList_23012.Builder builder = WorldCupMsg.S2C_TaskList_23012.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         WorldCupTaskModel taskModel = (WorldCupTaskModel)ApplicationContextProvider.getModelPoolEntity("WorldCupTask", taskData.id);
         if (taskModel != null) {
            builder.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(builder.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      WorldCupTaskModel model = (WorldCupTaskModel)ApplicationContextProvider.getModelPoolEntity("WorldCupTask", taskId);
      return (List<ResourceModel>)(model == null ? new ArrayList() : model.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, WorldCupTaskModel> modelMap = ApplicationContextProvider.<Integer, WorldCupTaskModel>getModelPoolMap("WorldCupTask");

         for(WorldCupTaskModel model : modelMap.values()) {
            super.createTask(model.getId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      WorldCupMsg.S2C_TaskNotify_23016.Builder builder = WorldCupMsg.S2C_TaskNotify_23016.newBuilder();

      for(TaskData taskData : taskDataList) {
         builder.addTask(taskData.toBuilder());
      }

      this.player.sendMsg(builder.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_WORLD_CUP;
   }

   public void commit(int taskId) {
      if (this.checkCommit(taskId)) {
         TaskData taskData = this.getTask(taskId);
         taskData.finish();
         WorldCupTaskModel taskModel = (WorldCupTaskModel)ApplicationContextProvider.getModelPoolEntity("WorldCupTask", taskId);
         if (taskModel != null) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 132, this.rewardReason(), taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      WorldCupMsg.S2C_TaskReward_23014.Builder builder = WorldCupMsg.S2C_TaskReward_23014.newBuilder();
      builder.setTask(taskId);
      this.player.sendMsg(builder.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      WorldCupTaskModel taskModel = (WorldCupTaskModel)ApplicationContextProvider.getModelPoolEntity("WorldCupTask", taskId);
      return taskModel != null && !taskModel.getTargets().isEmpty() ? new TaskTargetItem(((TaskTargetItem)taskModel.getTargets().get(0)).getTargetType(), ((TaskTargetItem)taskModel.getTargets().get(0)).getTargetId(), ((TaskTargetItem)taskModel.getTargets().get(0)).getTargetValue()) : null;
   }
}
