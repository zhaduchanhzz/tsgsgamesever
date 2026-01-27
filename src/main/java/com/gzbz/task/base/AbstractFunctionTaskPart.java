package com.gzbz.task.base;

import com.gzbz.db.bean.TaskData;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.model.manager.BaseTaskModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.util.CollectionUtils;

public abstract class AbstractFunctionTaskPart extends AbstractActivityTaskPart {
   public boolean commitTask(int taskId, boolean isSend) {
      Object taskModel = this.getTaskModel(taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         return false;
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            List<ResourceModel> rewards = this.getRewards(taskId);
            if (!CollectionUtils.isEmpty(rewards)) {
               this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
               taskData.finish();
            }
         }

         if (isSend) {
            this.sendTaskList((List)null);
         }

         return true;
      }
   }

   public List<ActivityMsg.TaskData> buildTasks(List<TaskData> taskDataList, boolean trigger) {
      Collection<TaskData> values = this.getTasksMap().values();
      if (!CollectionUtils.isEmpty(taskDataList)) {
         values = taskDataList;
      } else if (CollectionUtils.isEmpty(values) && trigger) {
         this.trigger();
         values = this.getTasksMap().values();
      }

      ArrayList<ActivityMsg.TaskData> tasks = new ArrayList();

      for(TaskData taskData : values) {
         if (this.getTaskModel(taskData.id) != null) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               tasks.add(task);
            }
         }
      }

      return tasks;
   }

   public void trigger() {
      Map<Integer, BaseTaskModel> taskModelMap = ApplicationContextProvider.<Integer, BaseTaskModel>getModelPoolMap(this.getModule().excelName);
      if (!CollectionUtils.isEmpty(taskModelMap)) {
         taskModelMap.values().forEach((task) -> this.createTask(task.getTaskId()));
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      BaseTaskModel baseTaskModel = (BaseTaskModel)ApplicationContextProvider.getModelPoolEntity(this.getModule().excelName, taskId);
      return baseTaskModel == null ? null : new TaskTargetItem(baseTaskModel.getTargetType(), baseTaskModel.getTargetId(), baseTaskModel.getTargetValue());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      BaseTaskModel baseTaskModel = (BaseTaskModel)this.getTaskModel(taskId);
      return (List<ResourceModel>)(baseTaskModel == null ? new ArrayList() : baseTaskModel.getRewards());
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   protected void sendInfo() {
      this.sendTaskList((List)null);
   }

   public void loginHandle() {
      this.trigger();
   }

   public boolean checkTaskConfig(int taskId) {
      return this.getTaskModel(taskId) == null;
   }

   public <T> T getTaskModel(int taskId) {
      return (T)ApplicationContextProvider.getModelPoolEntity(this.getModule().excelName, taskId);
   }

   public void resetTaskList(List<TaskData> taskDataList) {
      taskDataList.forEach(this::resetTask);
   }

   public void resetAllTask() {
      this.getTasksMap().values().forEach(this::resetTask);
   }
}
