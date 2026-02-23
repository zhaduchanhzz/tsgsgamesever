package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.TongQueActivityTaskGroupNewModel;
import com.gzbz.model.TongQueActivityTaskNewModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TongQueRotateMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TongQueRotateTaskPart extends AbstractActivityTaskPart {
   @MsgHandlerAnno
   public void C2S_TongQueParkCommitTask_20113(TongQueRotateMsg.C2S_TongQueParkCommitTask_20113 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, TongQueActivityTaskGroupNewModel> allTaskModelMap = ApplicationContextProvider.<Integer, TongQueActivityTaskGroupNewModel>getModelPoolMap("TongQueActivityTaskGroupNew");
         ConcurrentHashMap<Integer, TreeMap<Integer, Set<Integer>>> tempHashMap = new ConcurrentHashMap();

         for(Map.Entry<Integer, TongQueActivityTaskGroupNewModel> entry : allTaskModelMap.entrySet()) {
            TongQueActivityTaskGroupNewModel model = (TongQueActivityTaskGroupNewModel)entry.getValue();
            if (model.getDateEnd() == -1) {
               if (this.getActivityOpenDay() >= model.getDateStart() && model.getActivityId() == this.getPlayerActivityId()) {
                  ((Set)((TreeMap)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new HashSet())).add(model.getIncludeTaskId());
               }
            } else if (this.getActivityOpenDay() >= model.getDateStart() && this.getActivityOpenDay() <= model.getDateEnd()) {
               ((Set)((TreeMap)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new HashSet())).add(model.getIncludeTaskId());
            }
         }

         TreeMap<Integer, Set<Integer>> groupTasksModelMap = MapUtil.getOrDefault(tempHashMap, this.getServerActivityInfo().id, TreeMap.class);
         if (!groupTasksModelMap.isEmpty()) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Map<Integer, TongQueActivityTaskNewModel> tongQueActivityTaskModelMap = ApplicationContextProvider.<Integer, TongQueActivityTaskNewModel>getModelPoolMap("TongQueActivityTaskNew");
            if (tongQueActivityTaskModelMap != null && !tongQueActivityTaskModelMap.isEmpty()) {
               for(Integer taskId : MapUtil.getOrDefault(groupTasksModelMap, playerActivityDao.activityTongQueRotateData.taskGroup, HashSet.class)) {
                  TongQueActivityTaskNewModel taskModel = (TongQueActivityTaskNewModel)tongQueActivityTaskModelMap.get(taskId);
                  if (taskModel != null) {
                     super.createTask(taskId);
                  }
               }

            }
         }
      }
   }

   protected int rewardReason() {
      return 902;
   }

   protected int getActivityType() {
      return 76;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      TongQueActivityTaskNewModel taskModel = (TongQueActivityTaskNewModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTaskNew", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void commit(int taskId) {
      TongQueActivityTaskNewModel taskModel = (TongQueActivityTaskNewModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTaskNew", taskId);
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
         TongQueRotateMsg.S2C_TongQueParkTasks_20116.Builder msg = TongQueRotateMsg.S2C_TongQueParkTasks_20116.newBuilder();

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
      return TaskDefine.TaskModule.MODULE_TONG_QUE_ROTATE;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      TongQueRotateMsg.S2C_TongQueParkCommitTask_20114.Builder msg = TongQueRotateMsg.S2C_TongQueParkCommitTask_20114.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      TongQueActivityTaskNewModel tongQueActivityTaskModel = (TongQueActivityTaskNewModel)ApplicationContextProvider.getModelPoolEntity("TongQueActivityTaskNew", taskId);
      return tongQueActivityTaskModel != null && !tongQueActivityTaskModel.getTargets().isEmpty() ? (TaskTargetItem)tongQueActivityTaskModel.getTargets().get(0) : null;
   }
}
