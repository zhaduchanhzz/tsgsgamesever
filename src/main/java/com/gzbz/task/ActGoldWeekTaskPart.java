package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GoldWeekMonopolyTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActGoldWeekMsg;
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
public class ActGoldWeekTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 14009;
   }

   protected int getActivityType() {
      return 101;
   }

   public void sendInfo() {
      ActGoldWeekMsg.S2C_GameTask_24042.Builder resp = ActGoldWeekMsg.S2C_GameTask_24042.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         GoldWeekMonopolyTaskModel goldWeekMonopolyTaskModel = (GoldWeekMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyTask", taskData.id);
         if (goldWeekMonopolyTaskModel != null) {
            resp.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(resp.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      GoldWeekMonopolyTaskModel goldWeekMonopolyTaskModel = (GoldWeekMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyTask", taskId);
      return (List<ResourceModel>)(goldWeekMonopolyTaskModel == null ? new ArrayList() : goldWeekMonopolyTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, GoldWeekMonopolyTaskModel> greatCityGameTaskModelMap = ApplicationContextProvider.<Integer, GoldWeekMonopolyTaskModel>getModelPoolMap("HJWeekMonopolyTask");

         for(GoldWeekMonopolyTaskModel goldWeekMonopolyTaskModel : greatCityGameTaskModelMap.values()) {
            this.createTask(goldWeekMonopolyTaskModel.getTaskId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ActGoldWeekMsg.S2C_GameTaskNotify_24046.Builder resp = ActGoldWeekMsg.S2C_GameTaskNotify_24046.newBuilder();

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
         GoldWeekMonopolyTaskModel goldWeekMonopolyTaskModel = (GoldWeekMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyTask", taskId);
         if (goldWeekMonopolyTaskModel != null) {
            this.player.addResource(goldWeekMonopolyTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 140, this.rewardReason(), taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_GOLD_WEEK;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActGoldWeekMsg.S2C_GameTaskCommit_24044.Builder resp = ActGoldWeekMsg.S2C_GameTaskCommit_24044.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void clearDailyTask() {
      for(TaskData taskData : this.getTasksMap().values()) {
         GoldWeekMonopolyTaskModel goldWeekMonopolyTaskModel = (GoldWeekMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyTask", taskData.id);
         if (goldWeekMonopolyTaskModel == null || goldWeekMonopolyTaskModel.getTaskType() == 1) {
            taskData.delete();
         }
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      GoldWeekMonopolyTaskModel goldWeekMonopolyTaskModel = (GoldWeekMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("HJWeekMonopolyTask", taskId);
      return goldWeekMonopolyTaskModel == null ? null : new TaskTargetItem(goldWeekMonopolyTaskModel.getTargetType(), goldWeekMonopolyTaskModel.getTargetId(), goldWeekMonopolyTaskModel.getTargetVal());
   }
}
