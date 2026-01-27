package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GuoQingMonopolyTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityGuoQingMsg;
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
public class GuoQingMonopolyTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 12509;
   }

   protected int getActivityType() {
      return 34;
   }

   public void sendInfo() {
      ActivityGuoQingMsg.S2C_GameTask_21942.Builder resp = ActivityGuoQingMsg.S2C_GameTask_21942.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         GuoQingMonopolyTaskModel guoQingMonopolyTaskModel = (GuoQingMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyTask", taskData.id);
         if (guoQingMonopolyTaskModel != null) {
            resp.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(resp.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      GuoQingMonopolyTaskModel guoQingMonopolyTaskModel = (GuoQingMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyTask", taskId);
      return (List<ResourceModel>)(guoQingMonopolyTaskModel == null ? new ArrayList() : guoQingMonopolyTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, GuoQingMonopolyTaskModel> greatCityGameTaskModelMap = ApplicationContextProvider.<Integer, GuoQingMonopolyTaskModel>getModelPoolMap("GuoQingMonopolyTask");

         for(GuoQingMonopolyTaskModel guoQingMonopolyTaskModel : greatCityGameTaskModelMap.values()) {
            this.createTask(guoQingMonopolyTaskModel.getTaskId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ActivityGuoQingMsg.S2C_GameTaskNotify_21946.Builder resp = ActivityGuoQingMsg.S2C_GameTaskNotify_21946.newBuilder();

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
         GuoQingMonopolyTaskModel guoQingMonopolyTaskModel = (GuoQingMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyTask", taskId);
         if (guoQingMonopolyTaskModel != null) {
            this.player.addResource(guoQingMonopolyTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, this.rewardReason(), taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_GUO_QING;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityGuoQingMsg.S2C_GameTaskCommit_21944.Builder resp = ActivityGuoQingMsg.S2C_GameTaskCommit_21944.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void clearDailyTask() {
      for(TaskData taskData : this.getTasksMap().values()) {
         GuoQingMonopolyTaskModel guoQingMonopolyTaskModel = (GuoQingMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyTask", taskData.id);
         if (guoQingMonopolyTaskModel == null || guoQingMonopolyTaskModel.getTaskType() == 1) {
            taskData.delete();
         }
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      GuoQingMonopolyTaskModel guoQingMonopolyTaskModel = (GuoQingMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("GuoQingMonopolyTask", taskId);
      return guoQingMonopolyTaskModel == null ? null : new TaskTargetItem(guoQingMonopolyTaskModel.getTargetType(), guoQingMonopolyTaskModel.getTargetId(), guoQingMonopolyTaskModel.getTargetVal());
   }
}
