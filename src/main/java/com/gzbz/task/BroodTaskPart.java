package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.BroodTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.BroodMsg;
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
public class BroodTaskPart extends AbstractActivityTaskPart {
   private static final String modelName = "broodTask";

   @MsgHandlerAnno
   public void C2S_CommitTask_26011(BroodMsg.C2S_CommitTask_26011 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, BroodTaskModel> allTaskModelMap = ApplicationContextProvider.<Integer, BroodTaskModel>getModelPoolMap("broodTask");

         for(BroodTaskModel taskModel : allTaskModelMap.values()) {
            this.createTask(taskModel.getId());
         }

      }
   }

   protected int rewardReason() {
      return 15001;
   }

   protected int getActivityType() {
      return 108;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_BROOD;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      BroodTaskModel broodTaskModel = (BroodTaskModel)ApplicationContextProvider.getModelPoolEntity("broodTask", taskId);
      return (List<ResourceModel>)(broodTaskModel == null ? new ArrayList() : broodTaskModel.getItems());
   }

   public void commit(int taskId) {
      BroodTaskModel taskModel = (BroodTaskModel)ApplicationContextProvider.getModelPoolEntity("broodTask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 150, this.rewardReason(), taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "跨服孵蛋活动", taskModel.getId() + "", taskModel.getId() + "", 0, 0, 1);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         BroodMsg.S2C_TaskNotice_26013.Builder msg = BroodMsg.S2C_TaskNotice_26013.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addTaskList(task);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.trigger();
      }
   }

   public List<ActivityMsg.TaskData> getTaskListMsg() {
      List<ActivityMsg.TaskData> taskList = new ArrayList();

      for(TaskData taskData : this.getTasksMap().values()) {
         taskList.add(this.buildTask(taskData));
      }

      return taskList;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      BroodMsg.S2C_CommitTask_26012.Builder msg = BroodMsg.S2C_CommitTask_26012.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      BroodTaskModel taskModel = (BroodTaskModel)ApplicationContextProvider.getModelPoolEntity("broodTask", taskId);
      return taskModel == null ? null : new TaskTargetItem(taskModel.getTargetType(), taskModel.getTargetId(), taskModel.getTargetValue());
   }
}
