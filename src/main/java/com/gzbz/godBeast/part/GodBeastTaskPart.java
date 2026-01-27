package com.gzbz.godBeast.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.GodBeastDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GodBeastTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.GodBeastMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GodBeastTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_TaskList_21629(GodBeastMsg.C2S_TaskList_21629 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   public void trigger() {
      if (this.player.isSystemOpen(6340)) {
         Map<Integer, GodBeastTaskModel> taskModelMap = ApplicationContextProvider.<Integer, GodBeastTaskModel>getModelPoolMap("GodBeastTask");
         if (null != taskModelMap && !taskModelMap.isEmpty()) {
            List<TaskData> taskDataList = new ArrayList();

            for(int taskId : taskModelMap.keySet()) {
               TaskData taskData = super.createTask(taskId);
               if (taskData != null) {
                  taskDataList.add(taskData);
               }
            }

            if (!taskDataList.isEmpty()) {
               this.sendTaskList(taskDataList);
            }

         }
      }
   }

   public boolean checkComplete(TaskData taskData) {
      if (!super.checkComplete(taskData)) {
         return false;
      } else {
         this.commit(taskData.id);
         return true;
      }
   }

   public void commit(int taskId) {
      GodBeastTaskModel taskModel = (GodBeastTaskModel)ApplicationContextProvider.getModelPoolEntity("GodBeastTask", taskId);
      if (null == taskModel) {
         this.logger.error("任务模块{}，提交任务id{}配置不存在", this.getModule().moduleId, taskId);
      } else {
         if (this.checkCommit(taskId)) {
            GodBeastDao godBeastDao = this.getGodBeastDao();
            Integer curScore = (Integer)godBeastDao.taskScore.getOrDefault(taskId, 0);
            if (curScore >= taskModel.getTotalLimit()) {
               return;
            }

            if (taskModel.getScore().size() > 0) {
               ResourceModel resourceModel = (ResourceModel)taskModel.getScore().get(0);
               int addValue = resourceModel.getValue();
               if (addValue + curScore > taskModel.getTotalLimit()) {
                  addValue = taskModel.getTotalLimit() - curScore;
               }

               ResourceModel scoreReward = new ResourceModel(resourceModel.getType(), resourceModel.getId(), addValue);
               this.player.addResource(scoreReward, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 123, 12326, 0, 0, "");
               this.player.getOperationMgr().addExtraLog(this.player, 16, "灵兽任务", taskModel.getTaskName(), scoreReward.getValue() + "");
               godBeastDao.taskScore.put(taskId, curScore + addValue);
               godBeastDao.updateOp();
            }

            TaskData taskData = this.getTask(taskId);
            if (null != taskData) {
               Integer taskTotalScore = (Integer)godBeastDao.taskScore.getOrDefault(taskId, 0);
               if (taskTotalScore < taskModel.getTotalLimit()) {
                  taskData.tVal = 0;
                  taskData.state = 1;
                  taskData.updateOp();
               }

               CommonMsg.Task taskBuilder = this.buildTask(taskData);
               if (null != taskBuilder) {
                  GodBeastMsg.S2C_TaskNotice_21631.Builder resp = GodBeastMsg.S2C_TaskNotice_21631.newBuilder();
                  GodBeastMsg.GodBeastTaskInfo.Builder godBeastTaskBuilder = GodBeastMsg.GodBeastTaskInfo.newBuilder();
                  godBeastTaskBuilder.setTask(taskBuilder);
                  godBeastTaskBuilder.setCompleteNum(0);
                  godBeastTaskBuilder.setTaskScore(taskTotalScore);
                  resp.setGodBeastTaskInfo(godBeastTaskBuilder);
                  this.player.sendMsg(resp.build());
               }
            }
         }

      }
   }

   public GodBeastDao getGodBeastDao() {
      GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
      return godBeastPart.getGodBeastDao();
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         GodBeastDao godBeastDao = this.getGodBeastDao();
         GodBeastMsg.S2C_TaskList_21630.Builder resp = GodBeastMsg.S2C_TaskList_21630.newBuilder();

         for(TaskData taskData : taskDataList) {
            CommonMsg.Task taskBuilder = this.buildTask(taskData);
            if (null != taskBuilder) {
               GodBeastMsg.GodBeastTaskInfo.Builder godBeastTaskBuilder = GodBeastMsg.GodBeastTaskInfo.newBuilder();
               godBeastTaskBuilder.setTask(taskBuilder);
               godBeastTaskBuilder.setCompleteNum(0);
               godBeastTaskBuilder.setTaskScore((Integer)godBeastDao.taskScore.getOrDefault(taskData.id, 0));
               resp.addGodBeastTaskInfo(godBeastTaskBuilder);
            }
         }

         this.player.sendMsg(resp.build());
      }
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      GodBeastTaskModel taskModel = (GodBeastTaskModel)ApplicationContextProvider.getModelPoolEntity("GodBeastTask", taskData.id);
      if (null == taskModel) {
         return null;
      } else {
         CommonMsg.Task.Builder task = CommonMsg.Task.newBuilder();
         task.setTaskNum(taskData.tVal);
         task.setTaskId(taskData.id);
         task.setState(CommonMsg.TaskState.forNumber(taskData.state));
         return task.build();
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_GOD_BEAST;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      this.logger.info("灵兽任务 - sendCommitTaskResult taskId:{}", taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      GodBeastTaskModel model = (GodBeastTaskModel)ApplicationContextProvider.getModelPoolEntity("GodBeastTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetValue());
   }

   public void loginHandle() {
      this.trigger();
      this.fieldMoveDataHandle();
   }

   public void fieldMoveDataHandle() {
      if (this.player.isSystemOpen(6340)) {
         GodBeastDao godBeastDao = this.getGodBeastDao();
         if (!godBeastDao.taskCompleteNum.isEmpty()) {
            boolean needHandle = false;

            for(Map.Entry<Integer, Integer> entry : godBeastDao.taskCompleteNum.entrySet()) {
               Integer completeNum = (Integer)entry.getValue();
               if (completeNum > 0) {
                  needHandle = true;
                  break;
               }
            }

            if (needHandle) {
               Map<Integer, TaskData> tasksMap = this.getTasksMap();

               for(Map.Entry<Integer, TaskData> taskId_taskData : tasksMap.entrySet()) {
                  TaskData taskData = (TaskData)taskId_taskData.getValue();
                  if (taskData.state > 1) {
                     taskData.tVal = 0;
                     taskData.state = 1;
                     taskData.updateOp();
                  }
               }

               godBeastDao.taskCompleteNum.clear();
               godBeastDao.updateOp();
            }

         }
      }
   }

   public void levelUp(int preLv, int newLv) {
      this.trigger();
   }

   public void gmClearGodBeastTaskProgress() {
      for(Map.Entry<Integer, TaskData> taskId_taskData : this.getTasksMap().entrySet()) {
         TaskData taskData = (TaskData)taskId_taskData.getValue();
         taskData.tVal = 0;
         taskData.state = 1;
         taskData.updateOp();
      }

      GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
      GodBeastDao godBeastDao = godBeastPart.getGodBeastDao();
      godBeastDao.taskCompleteNum.clear();
      godBeastDao.taskScore.clear();
      godBeastDao.updateOp();
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }
}
