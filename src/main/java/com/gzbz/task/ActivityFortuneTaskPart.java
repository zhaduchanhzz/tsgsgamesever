package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.FortuneTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.FortuneMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityFortuneTaskPart extends AbstractActivityTaskPart {
   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, FortuneTaskModel> modelMap = ApplicationContextProvider.<Integer, FortuneTaskModel>getModelPoolMap("hongYunTask");

         for(FortuneTaskModel model : modelMap.values()) {
            super.createTask(model.getId());
         }

      }
   }

   public void resetTask(int taskType) {
      Map<Integer, FortuneTaskModel> taskModelMap = ApplicationContextProvider.getModelPool().getMap("hongYunTask");
      Map<Integer, TaskData> tasks = this.getTasksMap();

      for(Map.Entry<Integer, TaskData> taskDaoEntry : tasks.entrySet()) {
         TaskData taskData = (TaskData)taskDaoEntry.getValue();
         if (!taskModelMap.containsKey(taskData.id)) {
            taskData.delete();
         } else {
            FortuneTaskModel model = (FortuneTaskModel)taskModelMap.get(taskData.id);
            if (model == null || model.getTime() == taskType) {
               taskData.delete();
            }
         }
      }

      this.trigger();
   }

   public boolean isServerActivityInvalid() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0 && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis()) && activityInfo.open) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         return activityOpenTimeModel == null || activityOpenTimeModel.getNeedLevel() > playerPublicDao.lv || !this.player.isSystemOpen(activityOpenTimeModel.getSystemid());
      } else {
         return true;
      }
   }

   protected ActivityInfo getServerActivityInfo() {
      return this.getActivityMgr().getActivityInfo(this.getActivityType());
   }

   public Integer getPlayerActivityId() {
      return this.getPlayerActivityInfo().id;
   }

   protected ActivityMgr getActivityMgr() {
      return (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
   }

   public void commit(int taskId) {
      FortuneTaskModel taskModel = (FortuneTaskModel)ApplicationContextProvider.getModelPoolEntity("hongYunTask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鸿运福禄活动任务", taskModel.getTaskName(), taskModel.getTaskName(), 0, 0, 1);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         FortuneMsg.S2C_ActivityTaskNotify_23709.Builder msg = FortuneMsg.S2C_ActivityTaskNotify_23709.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addTask(task);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_FORTUNE;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      FortuneMsg.S2C_CommitTask_23706.Builder msg = FortuneMsg.S2C_CommitTask_23706.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      FortuneTaskModel fortuneTaskModel = (FortuneTaskModel)ApplicationContextProvider.getModelPoolEntity("hongYunTask", taskId);
      return new TaskTargetItem(fortuneTaskModel.getTargetType(), fortuneTaskModel.getTargetId(), fortuneTaskModel.getTargetNum());
   }

   protected int rewardReason() {
      return 13701;
   }

   protected int getActivityType() {
      return 98;
   }

   protected void sendInfo() {
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_23705(FortuneMsg.C2S_CommitTask_23705 msg, String source) {
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_ActivityTaskList_23707(FortuneMsg.C2S_ActivityTaskList_23707 msg, String source) {
      this.sendTasks();
   }

   private void sendTasks() {
      List<TaskData> taskDataList = new ArrayList();
      Map<Integer, FortuneTaskModel> modelMap = ApplicationContextProvider.<Integer, FortuneTaskModel>getModelPoolMap("hongYunTask");
      List<TaskData> invalidList = new ArrayList();
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         FortuneTaskModel taskModel = (FortuneTaskModel)ApplicationContextProvider.getModelPool().getEntity("hongYunTask", taskData.id);
         if (taskModel != null && modelMap.containsKey(taskModel.getId())) {
            taskDataList.add(taskData);
         } else {
            invalidList.add(taskData);
         }
      }

      for(TaskData taskData : invalidList) {
         taskData.delete();
      }

      FortuneMsg.S2C_ActivityTaskList_23708.Builder msg = FortuneMsg.S2C_ActivityTaskList_23708.newBuilder();

      for(TaskData taskData : taskDataList) {
         ActivityMsg.TaskData task = this.buildTask(taskData);
         if (task != null) {
            msg.addTask(task);
         }
      }

      this.player.sendMsg(msg.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      FortuneTaskModel taskModel = (FortuneTaskModel)ApplicationContextProvider.getModelPoolEntity("hongYunTask", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }
}
