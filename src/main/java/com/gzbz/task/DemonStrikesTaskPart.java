package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.DemonStrikesDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.demonStrikes.DemonStrikesPart;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.DemonStrikesTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DemonStrikesMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
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
public class DemonStrikesTaskPart extends AbstractTaskPart {
   public void trigger() {
      Map<Integer, Map<Integer, DemonStrikesTaskModel>> taskModelMap = ApplicationContextProvider.<Integer, Map<Integer, DemonStrikesTaskModel>>getModelPoolMap("customDemonWarTask");
      DemonStrikesDao demonStrikesDao = (DemonStrikesDao)this.player.getData("tb_demon_strikes", this.player.getPlayerId());
      if (demonStrikesDao.integralData.taskStepGroup.isEmpty()) {
         for(Map.Entry<Integer, Map<Integer, DemonStrikesTaskModel>> entry : taskModelMap.entrySet()) {
            if ((Integer)entry.getKey() != 4) {
               TaskGroupData taskGroupData = new TaskGroupData();
               taskGroupData.group = (Integer)entry.getKey();
               this.createGroupTask(taskGroupData);
               demonStrikesDao.integralData.taskStepGroup.add(taskGroupData);
            }
         }
      } else {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());

         for(TaskGroupData taskGroupData : demonStrikesDao.integralData.taskStepGroup) {
            if (taskGroupData.end <= curTime) {
               this.createGroupTask(taskGroupData);
            }
         }
      }

   }

   private void createGroupTask(TaskGroupData taskGroupData) {
      int end = 0;
      switch (taskGroupData.group) {
         case 1:
            end = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(System.currentTimeMillis()));
            break;
         case 2:
            end = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(System.currentTimeMillis() + 345600000L));
         case 3:
      }

      taskGroupData.end = end;
      Map<Integer, Map<Integer, DemonStrikesTaskModel>> taskModelMap = ApplicationContextProvider.<Integer, Map<Integer, DemonStrikesTaskModel>>getModelPoolMap("customDemonWarTask");
      Map<Integer, DemonStrikesTaskModel> groupTaskModelMap = (Map)taskModelMap.get(taskGroupData.group);
      if (groupTaskModelMap != null) {
         for(int taskId : groupTaskModelMap.keySet()) {
            TaskData taskData = this.getTask(taskId);
            if (taskData != null) {
               taskData.delete();
            }

            this.createTask(taskId);
         }

      }
   }

   public void commit(int taskId) {
      DemonStrikesTaskModel model = (DemonStrikesTaskModel)ApplicationContextProvider.getModelPool().getEntity("demonWarTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 69, 6906, taskId, 0, "");
            taskData.finish();
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      DemonStrikesMsg.S2C_TaskNotify_13930.Builder msg = DemonStrikesMsg.S2C_TaskNotify_13930.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTasks(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      CommonMsg.Task.Builder msg = CommonMsg.Task.newBuilder();
      msg.setTaskNum(taskData.tVal);
      msg.setTaskId(taskData.id);
      msg.setState(CommonMsg.TaskState.forNumber(taskData.state));
      return msg.build();
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_DEMON_STRIKES;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      DemonStrikesPart demonStrikesPart = (DemonStrikesPart)this.player.getMgrPart(DemonStrikesPart.class);
      DemonStrikesMsg.S2C_CommitTask_13928.Builder resp = DemonStrikesMsg.S2C_CommitTask_13928.newBuilder();
      resp.setTaskId(taskId);
      resp.setIntegralReward(this.hasCompleteTask() || demonStrikesPart.hasIntegralReward());
      this.player.sendMsg(resp.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      DemonStrikesTaskModel model = (DemonStrikesTaskModel)ApplicationContextProvider.getModelPool().getEntity("demonWarTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetValue());
   }

   private boolean hasCompleteTask() {
      for(TaskData taskData : this.getTasksMap().values()) {
         if (taskData.state == 2) {
            return true;
         }
      }

      return false;
   }
}
