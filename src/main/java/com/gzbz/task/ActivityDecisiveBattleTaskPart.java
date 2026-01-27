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
import com.gzbz.model.DecisiveBattleTaskRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.DecisiveBattleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityDecisiveBattleTaskPart extends AbstractActivityTaskPart {
   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         for(Integer taskId : this.getOpeningGroup()) {
            super.createTask(taskId);
         }

      }
   }

   public Set<Integer> getOpeningGroup() {
      int openDay = this.getActivityOpenDay();
      Set<Integer> groupSet = new HashSet();
      Map<Integer, DecisiveBattleTaskRewardModel> modelMap = ApplicationContextProvider.<Integer, DecisiveBattleTaskRewardModel>getModelPoolMap("DecisiveBattleTaskReward");

      for(DecisiveBattleTaskRewardModel model : modelMap.values()) {
         if (openDay >= model.getDateStart() && (openDay <= model.getDateEnd() || model.getDateEnd() == -1) && model.getType() == 1) {
            groupSet.add(model.getId());
         }
      }

      return groupSet;
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
      DecisiveBattleTaskRewardModel taskModel = (DecisiveBattleTaskRewardModel)ApplicationContextProvider.getModelPoolEntity("DecisiveBattleTaskReward", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "决战之巅活动任务", taskModel.getTaskDesc(), taskModel.getTaskDesc(), 0, 0, 1);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         DecisiveBattleMsg.S2C_ActivityTaskNotify_21837.Builder msg = DecisiveBattleMsg.S2C_ActivityTaskNotify_21837.newBuilder();

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
      return TaskDefine.TaskModule.MODULE_DECISIVE_BATTLE_ACTIVITY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      DecisiveBattleMsg.S2C_CommitTask_21834.Builder msg = DecisiveBattleMsg.S2C_CommitTask_21834.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      DecisiveBattleTaskRewardModel eventHeroPrograssTaskModel = (DecisiveBattleTaskRewardModel)ApplicationContextProvider.getModelPoolEntity("DecisiveBattleTaskReward", taskId);
      return eventHeroPrograssTaskModel != null && !eventHeroPrograssTaskModel.getTargets().isEmpty() ? (TaskTargetItem)eventHeroPrograssTaskModel.getTargets().get(0) : null;
   }

   protected int rewardReason() {
      return 12701;
   }

   protected int getActivityType() {
      return 84;
   }

   protected void sendInfo() {
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_21833(DecisiveBattleMsg.C2S_CommitTask_21833 msg, String source) {
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_ActivityTaskList_21835(DecisiveBattleMsg.C2S_ActivityTaskList_21835 msg, String source) {
      this.sendHeroTasks();
   }

   private void sendHeroTasks() {
      List<TaskData> taskDataList = new ArrayList();
      List<TaskData> invalidList = new ArrayList();
      Set<Integer> taskSet = this.getOpeningGroup();
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         DecisiveBattleTaskRewardModel taskModel = (DecisiveBattleTaskRewardModel)ApplicationContextProvider.getModelPool().getEntity("DecisiveBattleTaskReward", taskData.id);
         if (taskModel != null && taskSet.contains(taskModel.getId())) {
            taskDataList.add(taskData);
         } else {
            invalidList.add(taskData);
         }
      }

      for(TaskData taskData : invalidList) {
         taskData.delete();
      }

      DecisiveBattleMsg.S2C_ActivityTaskList_21836.Builder msg = DecisiveBattleMsg.S2C_ActivityTaskList_21836.newBuilder();

      for(TaskData taskData : taskDataList) {
         ActivityMsg.TaskData task = this.buildTask(taskData);
         if (task != null) {
            msg.addTask(task);
         }
      }

      this.player.sendMsg(msg.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      DecisiveBattleTaskRewardModel taskModel = (DecisiveBattleTaskRewardModel)ApplicationContextProvider.getModelPoolEntity("DecisiveBattleTaskReward", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }
}
