package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.part.ActivityKrEventHeroPart;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.EventHeroMainModel;
import com.gzbz.model.EventHeroPrograssTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityKrEventHeroMsg;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityKrEventHeroTaskPart extends AbstractActivityTaskPart {
   @MsgHandlerAnno
   public void C2S_KrCommitTask_25041(ActivityKrEventHeroMsg.C2S_KrCommitTask_25041 msg, String source) {
      if (this.isAdvanceTask()) {
         this.commit(msg.getTaskId());
      }

   }

   public void trigger() {
      if (!this.isServerActivityInvalid() && this.isAdvanceTask()) {
         for(Integer taskId : this.getOpeningGroup()) {
            super.createTask(taskId);
         }

      }
   }

   protected int rewardReason() {
      return 6106;
   }

   protected int getActivityType() {
      return 109;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      EventHeroPrograssTaskModel taskModel = (EventHeroPrograssTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroPrograssTask", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void commit(int taskId) {
      EventHeroPrograssTaskModel taskModel = (EventHeroPrograssTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroPrograssTask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "武将展示子活动任务", taskModel.getTaskDesc(), taskModel.getTaskDesc(), 0, 0, 1);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   @MsgHandlerAnno
   public void C2S_KrActivityTaskList_25044(ActivityKrEventHeroMsg.C2S_KrActivityTaskList_25044 msg, String source) {
      this.sendHeroTasks();
   }

   private void sendHeroTasks() {
      if (this.isAdvanceTask()) {
         List<TaskData> taskDataList = new ArrayList();
         List<TaskData> invalidList = new ArrayList();
         Set<Integer> taskSet = this.getOpeningGroup();
         Map<Integer, TaskData> tasksMap = this.getTasksMap();

         for(TaskData taskData : tasksMap.values()) {
            EventHeroPrograssTaskModel taskModel = (EventHeroPrograssTaskModel)ApplicationContextProvider.getModelPool().getEntity("eventHeroPrograssTask", taskData.id);
            if (taskModel != null && taskSet.contains(taskModel.getId())) {
               taskDataList.add(taskData);
            } else {
               invalidList.add(taskData);
            }
         }

         for(TaskData taskData : invalidList) {
            taskData.delete();
         }

         ActivityKrEventHeroMsg.S2C_KrActivityTaskList_25045.Builder msg = ActivityKrEventHeroMsg.S2C_KrActivityTaskList_25045.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addTask(task);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && this.isAdvanceTask()) {
         ActivityKrEventHeroMsg.S2C_KrActivityTaskNotify_25046.Builder msg = ActivityKrEventHeroMsg.S2C_KrActivityTaskNotify_25046.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addTask(task);
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

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_KR_EVENT_HERO_ACTIVITY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityKrEventHeroMsg.S2C_KrCommitTask_25042.Builder msg = ActivityKrEventHeroMsg.S2C_KrCommitTask_25042.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      EventHeroPrograssTaskModel eventHeroPrograssTaskModel = (EventHeroPrograssTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroPrograssTask", taskId);
      return eventHeroPrograssTaskModel != null && !eventHeroPrograssTaskModel.getTargets().isEmpty() ? (TaskTargetItem)eventHeroPrograssTaskModel.getTargets().get(0) : null;
   }

   public Set<Integer> getOpeningGroup() {
      ActivityKrEventHeroPart eventHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
      int mainId = eventHeroPart.getMainId();
      Set<Integer> groupSet = new HashSet();
      Map<Integer, EventHeroPrograssTaskModel> modelMap = ApplicationContextProvider.<Integer, EventHeroPrograssTaskModel>getModelPoolMap("eventHeroPrograssTask");

      for(EventHeroPrograssTaskModel model : modelMap.values()) {
         if (model.getMainId() == mainId && model.getType() == 1) {
            groupSet.add(model.getId());
         }
      }

      return groupSet;
   }

   private boolean isAdvanceTask() {
      ActivityKrEventHeroPart part = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
      EventHeroMainModel eventHeroMainModel = part.getEventHeroMainModel();
      return eventHeroMainModel == null || eventHeroMainModel.getIsAdvance();
   }
}
