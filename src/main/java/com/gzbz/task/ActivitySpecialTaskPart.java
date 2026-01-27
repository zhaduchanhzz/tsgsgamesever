package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
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
public class ActivitySpecialTaskPart extends AbstractActivityTaskPart {
   public void trigger() {
      PlayerDao playerDao = this.player.getPlayerDao();
      int activityId = this.getPlayerActivityId();
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
      if (activityOpenTimeModel == null) {
         this.logger.error("特定任务活动->【{}】参加错误的活动【{}】", playerDao.playerName, activityId);
      } else {
         for(SevenDaysTaskModel sevenDaysTaskModel : super.getTaskModels()) {
            super.createTask(sevenDaysTaskModel.getId());
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      ActivityMsg.S2C_SpecialTasksNotify_6764.Builder msg = ActivityMsg.S2C_SpecialTasksNotify_6764.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACTIVITY_SPECIAL;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityMsg.S2C_SpecialTaskCommitTask_6754.Builder resp = ActivityMsg.S2C_SpecialTaskCommitTask_6754.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   protected int rewardReason() {
      return 305;
   }

   protected int getActivityType() {
      return 2;
   }

   public void sendInfo() {
      ActivityMsg.S2C_SpecialTaskActivityNotify_6742.Builder msg = ActivityMsg.S2C_SpecialTaskActivityNotify_6742.newBuilder();
      ActivityInfo activityInfo = super.getPlayerActivityInfo();
      msg.setEndTime(activityInfo.end);

      for(TaskData taskData : this.getTasksMap().values()) {
         msg.addTask(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel taskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void loginHandle() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo.id > 0 && activityInfo.open) {
         List<SevenDaysTaskModel> sevenDaysTaskModels = super.getTaskModels();

         for(TaskData taskData : this.getTasksMap().values()) {
            SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
            if (sevenDaysTaskModel != null && sevenDaysTaskModel.getActivityId() != activityInfo.id) {
               taskData.delete();
            }
         }

         if (this.getTasksMap().size() < sevenDaysTaskModels.size()) {
            PlayerDao playerDao = this.player.getPlayerDao();
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
            this.logger.info("特定任务活动->【{}】参加【{}】,补发任务数量:{}", new Object[]{playerDao.playerName, activityOpenTimeModel.getTips(), sevenDaysTaskModels.size() - this.getTasksMap().size()});
            this.trigger();
         }
      }

   }
}
