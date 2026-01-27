package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.FirstYearTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityAnniversaryCelebrationMsg;
import com.gzbz.protobuf.PlayerMsg;
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
public class ActivityFirstYearTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 12636;
   }

   protected int getActivityType() {
      return 91;
   }

   public void sendInfo() {
      ActivityAnniversaryCelebrationMsg.S2C_GameTask_22034.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameTask_22034.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         FirstYearTaskModel taskModel = (FirstYearTaskModel)ApplicationContextProvider.getModelPoolEntity("FristYearTask", taskData.id);
         if (taskModel != null) {
            resp.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(resp.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      FirstYearTaskModel taskModel = (FirstYearTaskModel)ApplicationContextProvider.getModelPoolEntity("FristYearTask", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, FirstYearTaskModel> greatCityGameTaskModelMap = ApplicationContextProvider.<Integer, FirstYearTaskModel>getModelPoolMap("FristYearTask");

         for(FirstYearTaskModel taskModel : greatCityGameTaskModelMap.values()) {
            this.createTask(taskModel.getTaskId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ActivityAnniversaryCelebrationMsg.S2C_GameTaskNotify_22037.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameTaskNotify_22037.newBuilder();

         for(TaskData taskData : taskDataList) {
            resp.addTask(taskData.toBuilder());
         }

         this.player.sendMsg(resp.build());
      }
   }

   public void commit(int taskId) {
      if (this.checkCommit(taskId)) {
         TaskData taskData = this.getTask(taskId);
         taskData.finish();
         FirstYearTaskModel taskModel = (FirstYearTaskModel)ApplicationContextProvider.getModelPoolEntity("FristYearTask", taskId);
         if (taskModel != null) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, this.rewardReason(), taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_FIRST_YEAR;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityAnniversaryCelebrationMsg.S2C_GameTaskCommit_22036.Builder resp = ActivityAnniversaryCelebrationMsg.S2C_GameTaskCommit_22036.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void clearDailyTask() {
      for(TaskData taskData : this.getTasksMap().values()) {
         FirstYearTaskModel taskModel = (FirstYearTaskModel)ApplicationContextProvider.getModelPoolEntity("FristYearTask", taskData.id);
         if (taskModel == null || taskModel.getTaskType() == 1) {
            taskData.delete();
         }
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      FirstYearTaskModel taskModel = (FirstYearTaskModel)ApplicationContextProvider.getModelPoolEntity("FristYearTask", taskId);
      return taskModel == null ? null : new TaskTargetItem(taskModel.getTargetType(), taskModel.getTargetId(), taskModel.getTargetValue());
   }

   public void loginHandle() {
      this.trigger();
   }
}
