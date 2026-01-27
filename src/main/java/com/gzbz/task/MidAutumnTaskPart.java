package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.MidAutumnMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MidAutumnTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 873;
   }

   protected int getActivityType() {
      return 32;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return (List<ResourceModel>)(sevenDaysTaskModel == null ? new ArrayList() : sevenDaysTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         for(SevenDaysTaskModel sevenDaysTaskModel : this.getTaskModels()) {
            super.createTask(sevenDaysTaskModel.getId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      MidAutumnMsg.S2C_TaskNotify_15110.Builder msg = MidAutumnMsg.S2C_TaskNotify_15110.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(taskData.toBuilder());
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_MID_AUTUMN;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      MidAutumnMsg.S2C_TaskReward_15112.Builder msg = MidAutumnMsg.S2C_TaskReward_15112.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }
}
