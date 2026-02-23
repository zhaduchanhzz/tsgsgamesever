package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.TongQueActivityTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TongQueParkMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TongQueParkTaskPart extends AbstractActivityTaskPart {
   @MsgHandlerAnno
   public void C2S_TongQueParkCommitTask_12113(TongQueParkMsg.C2S_TongQueParkCommitTask_12113 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customTongQueActivityTaskGroup");
         TreeMap<Integer, Set<Integer>> groupTasksModelMap = MapUtil.getOrDefault(allTaskModelMap, this.getServerActivityInfo().id, TreeMap.class);
         if (!groupTasksModelMap.isEmpty()) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Map<Integer, TongQueActivityTaskModel> tongQueActivityTaskModelMap = ApplicationContextProvider.<Integer, TongQueActivityTaskModel>getModelPoolMap("TongQueActivityTask");
            if (tongQueActivityTaskModelMap != null && !tongQueActivityTaskModelMap.isEmpty()) {
               for(Integer taskId : MapUtil.getOrDefault(groupTasksModelMap, playerActivityDao.activityTongQueParkData.taskGroup, HashSet.class)) {
                  TongQueActivityTaskModel taskModel = (TongQueActivityTaskModel)tongQueActivityTaskModelMap.get(taskId);
                  if (taskModel != null) {
                     super.createTask(taskId);
                  }
               }

            }
         }
      }
   }

   protected int rewardReason() {
      return 821;
   }

   protected int getActivityType() {
      return 13;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      TongQueActivityTaskModel taskModel = (TongQueActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTask", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void commit(int taskId) {
      TongQueActivityTaskModel taskModel = (TongQueActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "铜雀台任务", taskModel.getTaskName(), taskModel.getTaskName(), 0, 0, 1);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         TongQueParkMsg.S2C_TongQueParkTasks_12116.Builder msg = TongQueParkMsg.S2C_TongQueParkTasks_12116.newBuilder();

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

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_TONG_QUE_PARK;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      TongQueParkMsg.S2C_TongQueParkCommitTask_12114.Builder msg = TongQueParkMsg.S2C_TongQueParkCommitTask_12114.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      TongQueActivityTaskModel tongQueActivityTaskModel = (TongQueActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTask", taskId);
      return tongQueActivityTaskModel != null && !tongQueActivityTaskModel.getTargets().isEmpty() ? (TaskTargetItem)tongQueActivityTaskModel.getTargets().get(0) : null;
   }
}
