package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GreatCityGameTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SplendidCityMsg;
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
public class SplendidCityTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 8208;
   }

   protected int getActivityType() {
      return 57;
   }

   public void sendInfo() {
      SplendidCityMsg.S2C_GameTask_17212.Builder resp = SplendidCityMsg.S2C_GameTask_17212.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         GreatCityGameTaskModel greatCityGameTaskModel = (GreatCityGameTaskModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameTask", taskData.id);
         if (greatCityGameTaskModel != null) {
            resp.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(resp.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      GreatCityGameTaskModel greatCityGameTaskModel = (GreatCityGameTaskModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameTask", taskId);
      return (List<ResourceModel>)(greatCityGameTaskModel == null ? new ArrayList() : greatCityGameTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, GreatCityGameTaskModel> greatCityGameTaskModelMap = ApplicationContextProvider.<Integer, GreatCityGameTaskModel>getModelPoolMap("GreatCityGameTask");

         for(GreatCityGameTaskModel greatCityGameTaskModel : greatCityGameTaskModelMap.values()) {
            this.createTask(greatCityGameTaskModel.getTaskId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         SplendidCityMsg.S2C_GameTaskNotify_17216.Builder resp = SplendidCityMsg.S2C_GameTaskNotify_17216.newBuilder();

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
         GreatCityGameTaskModel greatCityGameTaskModel = (GreatCityGameTaskModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameTask", taskId);
         if (greatCityGameTaskModel != null) {
            this.player.addResource(greatCityGameTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, this.rewardReason(), taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_SPLENDID_CITY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      SplendidCityMsg.S2C_GameTaskCommit_17214.Builder resp = SplendidCityMsg.S2C_GameTaskCommit_17214.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void clearDailyTask() {
      for(TaskData taskData : this.getTasksMap().values()) {
         GreatCityGameTaskModel greatCityGameTaskModel = (GreatCityGameTaskModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameTask", taskData.id);
         if (greatCityGameTaskModel == null || greatCityGameTaskModel.getTaskType() == 1) {
            taskData.delete();
         }
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      GreatCityGameTaskModel greatCityGameTaskModel = (GreatCityGameTaskModel)ApplicationContextProvider.getModelPoolEntity("GreatCityGameTask", taskId);
      return greatCityGameTaskModel == null ? null : new TaskTargetItem(greatCityGameTaskModel.getTargetType(), greatCityGameTaskModel.getTargetId(), greatCityGameTaskModel.getTargetVal());
   }
}
