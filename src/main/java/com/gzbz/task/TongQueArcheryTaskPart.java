package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ArcheryTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TongQueArcheryTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 868;
   }

   protected int getActivityType() {
      return 28;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      ArcheryTaskModel archeryTaskModel = (ArcheryTaskModel)ApplicationContextProvider.getModelPoolEntity("archeryTask", taskId);
      return (List<ResourceModel>)(archeryTaskModel == null ? new ArrayList() : archeryTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         int taskNum = ApplicationContextProvider.getConfigInt("archerTaskRanNum", 9);
         if (this.getTasksMap().size() < taskNum + 1) {
            Map<Integer, ArcheryTaskModel> archeryTaskModelMap = ApplicationContextProvider.<Integer, ArcheryTaskModel>getModelPoolMap("archeryTask");
            if (archeryTaskModelMap != null && !archeryTaskModelMap.isEmpty()) {
               List<Integer> archeryTaskModels = new ArrayList(archeryTaskModelMap.keySet());
               Collections.sort(archeryTaskModels);
               int dailyLoginTask = (Integer)archeryTaskModels.remove(0);
               Collections.shuffle(archeryTaskModels);
               int needCreateNum = taskNum - this.getTasksMap().size();
               if (archeryTaskModels.size() < needCreateNum) {
                  needCreateNum = archeryTaskModels.size();
               }

               for(int taskId : archeryTaskModels.subList(0, needCreateNum)) {
                  this.createTask(taskId);
               }

               this.createTask(dailyLoginTask);
            }
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ThemeActivityMsg.S2C_ArcheryTaskNotify_12944.Builder msg = ThemeActivityMsg.S2C_ArcheryTaskNotify_12944.newBuilder();

         for(TaskData taskData : taskDataList) {
            msg.addDailyTask(this.buildTask(taskData));
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_TONG_QUE_ARCHERY_DAILY;
   }

   public void commit(int taskId) {
      ArcheryTaskModel archeryTaskModel = (ArcheryTaskModel)ApplicationContextProvider.getModelPoolEntity("archeryTask", taskId);
      if (archeryTaskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(this.getRewards(taskId), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), 0, 0, "");
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ThemeActivityMsg.S2C_ArcheryTaskReward_12946.Builder msg = ThemeActivityMsg.S2C_ArcheryTaskReward_12946.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public void loginHandle() {
      this.trigger();
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ArcheryTaskModel archeryTaskModel = (ArcheryTaskModel)ApplicationContextProvider.getModelPoolEntity("archeryTask", taskId);
      return archeryTaskModel == null ? null : new TaskTargetItem(archeryTaskModel.getTargetType(), archeryTaskModel.getTargetId(), archeryTaskModel.getTargetVal());
   }
}
