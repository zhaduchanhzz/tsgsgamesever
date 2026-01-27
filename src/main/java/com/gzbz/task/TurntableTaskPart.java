package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.TurntableActivityTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TurntableMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TurntableTaskPart extends AbstractActivityTaskPart {
   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, TurntableActivityTaskModel> taskModelMap = ApplicationContextProvider.<Integer, TurntableActivityTaskModel>getModelPoolMap("krTurntableTask");
         taskModelMap.values().forEach((task) -> this.createTask(task.getTaskId()));
      }
   }

   protected int rewardReason() {
      return 13901;
   }

   protected int getActivityType() {
      return 100;
   }

   protected void sendInfo() {
      this.sendTaskList((List)null);
   }

   protected List<ResourceModel> getRewards(int taskId) {
      TurntableActivityTaskModel taskModel = (TurntableActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("krTurntableTask", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void commit(int taskId) {
      TurntableActivityTaskModel taskModel = (TurntableActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("krTurntableTask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
            taskData.finish();
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      this.player.sendMsg(TurntableMsg.S2C_TurntableCommitTask_23804.newBuilder().addAllTaskList(this.getTasks(taskDataList)).build());
   }

   public List<ActivityMsg.TaskData> getTasks(List<TaskData> taskDataList) {
      Collection<TaskData> values = this.getTasksMap().values();
      if (!CollectionUtils.isEmpty(taskDataList)) {
         values = taskDataList;
      } else if (CollectionUtils.isEmpty(values)) {
         this.trigger();
         values = this.getTasksMap().values();
      }

      ArrayList<ActivityMsg.TaskData> tasks = new ArrayList();

      for(TaskData taskData : values) {
         TurntableActivityTaskModel taskModel = (TurntableActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("krTurntableTask", taskData.id);
         if (taskModel != null) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               tasks.add(task);
            }
         }
      }

      return tasks;
   }

   public void loginHandle() {
      this.trigger();
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_TURNTABLE;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      TurntableActivityTaskModel taskModel = (TurntableActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("krTurntableTask", taskId);
      return taskModel == null ? null : new TaskTargetItem(taskModel.getTargetType(), taskModel.getTargetId(), taskModel.getTargetNum());
   }
}
