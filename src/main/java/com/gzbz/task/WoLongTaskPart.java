package com.gzbz.task;

import allMgr.PartAnnotation;
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
public class WoLongTaskPart extends AbstractActivityTaskPart {
   public void trigger() {
      PlayerDao playerDao = this.player.getPlayerDao();
      int activityId = this.getPlayerActivityId();
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
      if (activityOpenTimeModel == null) {
         this.logger.error("卧龙在世->【{}】参加错误的活动【{}】", playerDao.playerName, activityId);
      } else {
         for(SevenDaysTaskModel sevenDaysTaskModel : super.getTaskModels()) {
            super.createTask(sevenDaysTaskModel.getId());
         }

      }
   }

   protected int rewardReason() {
      return 829;
   }

   protected int getActivityType() {
      return 10;
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel taskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   protected void sendInfo() {
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      ActivityMsg.S2C_WoLongTasks_6784.Builder msg = ActivityMsg.S2C_WoLongTasks_6784.newBuilder();

      for(TaskData taskData : taskDataList) {
         ActivityMsg.TaskData taskMsg = this.buildTask(taskData);
         if (taskMsg != null) {
            msg.addTasks(taskMsg);
         }
      }

      this.player.sendMsg(msg.build());
   }

   public List<ActivityMsg.TaskData> buildTasks() {
      List<ActivityMsg.TaskData> taskDataList = new ArrayList();

      for(TaskData taskData : this.getTasksMap().values()) {
         ActivityMsg.TaskData taskMsg = this.buildTask(taskData);
         if (taskMsg != null) {
            taskDataList.add(taskMsg);
         }
      }

      return taskDataList;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_WO_LONG;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityMsg.S2C_WoLongCommit_6786.Builder msg = ActivityMsg.S2C_WoLongCommit_6786.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }
}
