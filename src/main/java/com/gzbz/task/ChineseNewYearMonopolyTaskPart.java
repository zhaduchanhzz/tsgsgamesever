package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ChineseNewYearMonopolyTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ChineseNewYearMsg;
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
public class ChineseNewYearMonopolyTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 13009;
   }

   protected int getActivityType() {
      return 94;
   }

   public void sendInfo() {
      ChineseNewYearMsg.S2C_GameTask_22832.Builder resp = ChineseNewYearMsg.S2C_GameTask_22832.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         ChineseNewYearMonopolyTaskModel chineseNewYearMonopolyTaskModel = (ChineseNewYearMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("ChunJieTask", taskData.id);
         if (chineseNewYearMonopolyTaskModel != null) {
            resp.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(resp.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      ChineseNewYearMonopolyTaskModel chineseNewYearMonopolyTaskModel = (ChineseNewYearMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("ChunJieTask", taskId);
      return (List<ResourceModel>)(chineseNewYearMonopolyTaskModel == null ? new ArrayList() : chineseNewYearMonopolyTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, ChineseNewYearMonopolyTaskModel> greatCityGameTaskModelMap = ApplicationContextProvider.<Integer, ChineseNewYearMonopolyTaskModel>getModelPoolMap("ChunJieTask");

         for(ChineseNewYearMonopolyTaskModel chineseNewYearMonopolyTaskModel : greatCityGameTaskModelMap.values()) {
            this.createTask(chineseNewYearMonopolyTaskModel.getTaskId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ChineseNewYearMsg.S2C_GameTaskNotify_22836.Builder resp = ChineseNewYearMsg.S2C_GameTaskNotify_22836.newBuilder();

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
         ChineseNewYearMonopolyTaskModel chineseNewYearMonopolyTaskModel = (ChineseNewYearMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("ChunJieTask", taskId);
         if (chineseNewYearMonopolyTaskModel != null) {
            this.player.addResource(chineseNewYearMonopolyTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, this.rewardReason(), taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_CHINESE_NEW_YEAR;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ChineseNewYearMsg.S2C_GameTaskCommit_22834.Builder resp = ChineseNewYearMsg.S2C_GameTaskCommit_22834.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void clearDailyTask() {
      for(TaskData taskData : this.getTasksMap().values()) {
         ChineseNewYearMonopolyTaskModel chineseNewYearMonopolyTaskModel = (ChineseNewYearMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("ChunJieTask", taskData.id);
         if (chineseNewYearMonopolyTaskModel == null || chineseNewYearMonopolyTaskModel.getTaskType() == 1) {
            taskData.delete();
         }
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      ChineseNewYearMonopolyTaskModel chineseNewYearMonopolyTaskModel = (ChineseNewYearMonopolyTaskModel)ApplicationContextProvider.getModelPoolEntity("ChunJieTask", taskId);
      return chineseNewYearMonopolyTaskModel == null ? null : new TaskTargetItem(chineseNewYearMonopolyTaskModel.getTargetType(), chineseNewYearMonopolyTaskModel.getTargetId(), chineseNewYearMonopolyTaskModel.getTargetVal());
   }

   public void loginHandle() {
      this.trigger();
   }
}
