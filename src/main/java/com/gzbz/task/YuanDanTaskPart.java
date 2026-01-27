package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.YuanDanMsg;
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
public class YuanDanTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 12907;
   }

   protected int getActivityType() {
      return 92;
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
      YuanDanMsg.S2C_TaskNotify_22610.Builder msg = YuanDanMsg.S2C_TaskNotify_22610.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(taskData.toBuilder());
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_YUAN_DAN;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      YuanDanMsg.S2C_TaskReward_22612.Builder msg = YuanDanMsg.S2C_TaskReward_22612.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }
}
