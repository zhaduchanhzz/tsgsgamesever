package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroCardDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.heroCard.part.HeroCardPart;
import com.gzbz.model.TaskModel;
import com.gzbz.model.TaskPointsBoxModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TaskMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import com.gzbz.task.bean.PlayerTaskExtend;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_TaskList_6501(TaskMsg.C2S_TaskList_6501 msg, String source) {
      int taskType = msg.getTaskType();
      this.sendTaskList(taskType);
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_6503(TaskMsg.C2S_CommitTask_6503 msg, String source) {
      int taskId = msg.getTaskId();
      this.commit(taskId);
   }

   @MsgHandlerAnno
   public void C2S_GetActiveBox_6505(TaskMsg.C2S_GetActiveBox_6505 msg, String source) {
      int boxId = msg.getBoxId();
      PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)this.player.getPlayerExtend(3);
      if (playerTaskExtend.boxes.contains(boxId)) {
         this.player.failure(24);
      } else {
         TaskPointsBoxModel taskPointsBoxModel = (TaskPointsBoxModel)ApplicationContextProvider.getModelPoolEntity("taskPointsBox", boxId);
         if (taskPointsBoxModel == null) {
            this.player.failure(0);
         } else {
            int active = taskPointsBoxModel.getNeedPonits();
            PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
            if (playerDao.active < active) {
               this.player.failure(27);
            } else {
               playerTaskExtend.boxes.add(boxId);
               this.player.updatePlayerExtend(3);
               this.player.addResource(taskPointsBoxModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 3, 302, boxId, 0, "");
               this.sendGetActiveBoxResult(boxId);
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 0, "日常任务", String.valueOf(taskPointsBoxModel.getNeedPonits()), String.valueOf(taskPointsBoxModel.getNeedPonits()), 0, 0, 100);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyCommit_6511(TaskMsg.C2S_OneKeyCommit_6511 msg, String source) {
      int taskType = msg.getTaskType();
      if (taskType <= 0) {
         this.player.failure(0);
      } else {
         Map<Integer, List<TaskModel>> taskTypeModelMap = ApplicationContextProvider.<Integer, List<TaskModel>>getModelPoolMap("custom_task");
         if (!taskTypeModelMap.containsKey(taskType)) {
            this.player.failure(0);
         } else {
            TaskMsg.S2C_OneKeyCommit_6512.Builder resp = TaskMsg.S2C_OneKeyCommit_6512.newBuilder();
            resp.setTaskType(taskType);
            List<ResourceModel> rewards = new ArrayList();
            PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)this.player.getPlayerExtend(3);
            List<TaskData> unlockTaskList = new ArrayList();

            for(TaskData taskData : this.getTasksMap().values()) {
               if (taskData.state == 2) {
                  TaskModel model = (TaskModel)ApplicationContextProvider.getModelPool().getEntity("task", taskData.id);
                  if (model != null && model.getTaskType() == taskType) {
                     this.addTaskLog(1203, taskData.id);

                     for(ResourceModel reward : model.getRewards()) {
                        reward.addResourceToList(rewards);
                     }

                     switch (model.getTaskType()) {
                        case 1:
                           taskData.finish();
                           this.player.triggerTask(380, 0, 1L, 1);
                           break;
                        case 2:
                        case 6:
                           taskData.delete();
                           playerTaskExtend.doneTasks.add(taskData.id);
                           this.player.updatePlayerExtend(3);
                           break;
                        case 3:
                        case 5:
                        case 7:
                           taskData.finish();
                        case 4:
                     }

                     resp.addTaskId(taskData.id);
                     List<TaskData> taskDataList = this.unlockNextTask(model.getId());
                     if (null != taskDataList && taskDataList.size() > 0) {
                        unlockTaskList.addAll(taskDataList);
                     }
                  }
               }
            }

            if (taskType != 5 && taskType != 6 && taskType != 7) {
               PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
               Map<Integer, TaskPointsBoxModel> taskPointsBoxModelMap = ApplicationContextProvider.<Integer, TaskPointsBoxModel>getModelPoolMap("taskPointsBox");

               for(TaskPointsBoxModel taskPointsBoxModel : taskPointsBoxModelMap.values()) {
                  if (!playerTaskExtend.boxes.contains(taskPointsBoxModel.getId()) && playerDao.active >= taskPointsBoxModel.getNeedPonits()) {
                     for(ResourceModel taskPointsBoxModelItem : taskPointsBoxModel.getItems()) {
                        taskPointsBoxModelItem.addResourceToList(rewards);
                     }

                     playerTaskExtend.boxes.add(taskPointsBoxModel.getId());
                     this.player.updatePlayerExtend(3);
                     resp.addBox(taskPointsBoxModel.getId());
                  }
               }
            }

            if (!rewards.isEmpty()) {
               this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 3, 300, 0, 0, "taskIdList:" + resp.getTaskIdList() + ",boxes:" + resp.getBoxList());
            }

            if (unlockTaskList.size() > 0) {
               this.sendTaskList(unlockTaskList);
            }

            this.player.sendMsg(resp.build());
         }
      }
   }

   public void todayTrigger() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(58, System.currentTimeMillis());
   }

   public boolean isTodayTrigger() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      Long taskLastTriggerTime = (Long)playerResetCustomCache.getForeverNum(58, 0L);
      return taskLastTriggerTime <= 0L ? false : DateUtil.isSameDay(taskLastTriggerTime);
   }

   public void resetDaily() {
      if (!this.isTodayTrigger()) {
         Map<Integer, TaskModel> taskModelMap = ApplicationContextProvider.getModelPool().getMap("task");
         Map<Integer, TaskData> tasks = this.getTasksMap();

         for(Map.Entry<Integer, TaskData> taskDataEntry : tasks.entrySet()) {
            TaskData taskData = (TaskData)taskDataEntry.getValue();
            if (!taskModelMap.containsKey(taskData.id)) {
               taskData.delete();
            } else {
               TaskModel model = (TaskModel)ApplicationContextProvider.getModelPool().getEntity("task", taskData.id);
               if (model.getTaskType() == 1 || model.getTaskType() == 5) {
                  taskData.delete();
               }
            }
         }

         PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)this.player.getPlayerExtend(3);
         Iterator<Integer> iterator = playerTaskExtend.doneTasks.iterator();

         while(iterator.hasNext()) {
            if (!taskModelMap.containsKey(iterator.next())) {
               iterator.remove();
            }
         }

         playerTaskExtend.boxes.clear();
         this.player.updatePlayerExtend(3);
         this.trigger();
      }

   }

   public void loginHandle() {
      this.sendTaskList(0);
   }

   public void trigger() {
      Map<Integer, TaskModel> taskModelMap = ApplicationContextProvider.getModelPool().getMap("task");
      if (taskModelMap != null && !taskModelMap.isEmpty()) {
         PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)this.player.getPlayerExtend(3);
         Set<Integer> finishesTaskIds = playerTaskExtend.doneTasks;
         Set<Integer> doingTaskIds = this.getTasksMap().keySet();
         List<TaskData> taskDataList = new ArrayList();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

         for(TaskModel taskModel : taskModelMap.values()) {
            if (taskModel.getInitClear() > 0) {
               if (!StringUtils.isEmpty(taskModel.getAreantask())) {
                  String[] countryArr = taskModel.getAreantask().split("\\|");
                  if (Arrays.stream(countryArr).noneMatch((country) -> worldMgr.country.equals(country))) {
                     continue;
                  }
               }

               if (taskModel.getTaskType() != 1 && taskModel.getTaskType() != 5) {
                  if (!doingTaskIds.contains(taskModel.getId()) && !finishesTaskIds.contains(taskModel.getId())) {
                     TaskData taskData = super.createTask(taskModel.getId());
                     if (taskData != null) {
                        taskDataList.add(taskData);
                     }
                  }
               } else if (!doingTaskIds.contains(taskModel.getId())) {
                  TaskData taskData = super.createTask(taskModel.getId());
                  if (taskData != null) {
                     taskDataList.add(taskData);
                  }
               }
            }
         }

         if (!taskDataList.isEmpty()) {
            this.sendTaskList(taskDataList);
         }

         this.todayTrigger();
      }
   }

   public void commit(int taskId) {
      TaskModel model = (TaskModel)ApplicationContextProvider.getModelPool().getEntity("task", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 3, 300, taskId, 0, "");
            switch (model.getTaskType()) {
               case 1:
                  taskData.finish();
                  this.player.triggerTask(380, 0, 1L, 1);
                  break;
               case 2:
               case 6:
                  taskData.delete();
                  PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)this.player.getPlayerExtend(3);
                  playerTaskExtend.doneTasks.add(taskData.id);
                  this.player.updatePlayerExtend(3);
                  break;
               case 3:
               case 5:
               case 7:
                  taskData.finish();
               case 4:
            }

            List<TaskData> taskDataList = this.unlockNextTask(taskId);
            if (null != taskDataList && taskDataList.size() > 0) {
               this.sendTaskList(taskDataList);
            }

            if (model.getTaskType() == 6 || model.getTaskType() == 5) {
               String taskTypeStr = model.getTaskType() == 6 ? "完成枭雄主线任务" : "完成枭雄日常任务";
               this.player.getOperationMgr().addExtraLog(this.player, 16, model.getId() + "-" + taskTypeStr, model.getTaskDesc(), "奖励:" + model.getRewards().toString());
            }
         }

         this.sendCommitTaskResult(taskId, taskData == null ? 0L : (long)taskData.cpTime * 1000L);
      }
   }

   public List<TaskData> unlockNextTask(int curTaskId) {
      TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", curTaskId);
      if (null != taskModel && taskModel.getClearTask().size() > 0) {
         List<TaskData> taskDataList = new ArrayList();

         for(Integer taskId : taskModel.getClearTask()) {
            TaskData taskData = this.createTask(taskId);
            TaskModel unlockTaskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskId);
            if (null != taskData && null != unlockTaskModel) {
               taskDataList.add(taskData);
            }
         }

         return taskDataList;
      } else {
         return null;
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         TaskMsg.S2C_TasksNotify_6510.Builder msg = TaskMsg.S2C_TasksNotify_6510.newBuilder();

         for(TaskData taskData : taskDataList) {
            TaskMsg.TaskData taskMsg = this.buildTask(taskData);
            if (taskMsg != null) {
               msg.addTask(taskMsg);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public void sendTaskList(int taskType) {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      TaskMsg.S2C_TaskListResult_6502.Builder tasksBuilder = TaskMsg.S2C_TaskListResult_6502.newBuilder();
      tasksBuilder.setActive(playerDao.active);
      PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)this.player.getPlayerExtend(3);
      tasksBuilder.addAllBoxId(playerTaskExtend.boxes);

      for(TaskData task : this.getTasksMap().values()) {
         TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", task.id);
         if (taskType > 0) {
            if (taskModel != null && taskModel.getTaskType() == taskType) {
               TaskMsg.TaskData taskMsg = this.buildTask(task);
               if (taskMsg != null) {
                  tasksBuilder.addTasks(taskMsg);
               }
            }
         } else {
            TaskMsg.TaskData taskMsg = this.buildTask(task);
            if (taskMsg != null) {
               tasksBuilder.addTasks(taskMsg);
            }
         }
      }

      this.player.sendMsg(tasksBuilder.build());
   }

   protected TaskMsg.TaskData buildTask(TaskData taskData) {
      TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskData.id);
      if (taskModel != null) {
         TaskMsg.TaskData.Builder taskBuilder = TaskMsg.TaskData.newBuilder();
         taskBuilder.setTaskId(taskData.id);
         taskBuilder.setState(taskData.state);
         taskBuilder.setTaskType(taskModel.getTaskType());
         taskBuilder.setCompleteTime(taskData.cpTime);
         taskBuilder.setProgress(taskData.tVal);
         return taskBuilder.build();
      } else {
         return null;
      }
   }

   public void completeTask(int taskId) {
      TaskModel model = (TaskModel)ApplicationContextProvider.getModelPool().getEntity("task", taskId);
      if (model != null) {
         TaskData taskData = this.getTask(taskId);
         if (taskData != null) {
            taskData.tVal = ((TaskTargetItem)model.getTargets().get(0)).getTargetValue();
            taskData.complete();
            this.sendTaskList(model.getTaskType());
         }
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_COMMON;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      TaskMsg.S2C_CommitTaskResult_6504.Builder resp = TaskMsg.S2C_CommitTaskResult_6504.newBuilder();
      resp.setResult(1);
      resp.setTaskId(taskId);
      resp.setCompleteTime(DateUtil.getIntTime(completeTime));
      this.player.sendMsg(resp.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      TaskModel model = (TaskModel)ApplicationContextProvider.getModelPool().getEntity("task", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }

   public boolean checkComplete(TaskData taskData) {
      byte curState = taskData.state;
      boolean checkComplete = super.checkComplete(taskData);
      byte newState = taskData.state;
      if (curState < 2 && newState != curState) {
         TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskData.id);
         if (taskModel != null && taskModel.getTaskType() == 6) {
            HeroCardPart heroCardPart = (HeroCardPart)this.player.getMgrPart(HeroCardPart.class);
            HeroCardDao dao = heroCardPart.getDao();
            if (taskData.id > dao.completeMainTaskId) {
               dao.completeMainTaskId = taskData.id;
               dao.updateOp();
            }
         }
      }

      return checkComplete;
   }

   private void sendGetActiveBoxResult(int boxId) {
      TaskMsg.S2C_GetActiveBoxResult_6506.Builder resp = TaskMsg.S2C_GetActiveBoxResult_6506.newBuilder();
      resp.setResult(1);
      resp.setBoxId(boxId);
      this.player.sendMsg(resp.build());
   }
}
