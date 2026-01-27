package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ChiBiTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RedCliffMsg;
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
public class ChiBiTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_TaskList_4341(RedCliffMsg.C2S_TaskList_4341 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_4343(RedCliffMsg.C2S_CommitTask_4343 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      if (this.player.isSystemOpen(2010)) {
         Map<Integer, ChiBiTaskModel> chiBiTaskModelMap = ApplicationContextProvider.<Integer, ChiBiTaskModel>getModelPoolMap("chiBiTask");
         if (chiBiTaskModelMap != null && !chiBiTaskModelMap.isEmpty()) {
            List<TaskData> taskDataList = new ArrayList();

            for(int taskId : chiBiTaskModelMap.keySet()) {
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

   public void commit(int taskId) {
      ChiBiTaskModel model = (ChiBiTaskModel)ApplicationContextProvider.getModelPool().getEntity("chiBiTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 46, 4606, taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "联盟对阵", model.getTaskType() + "-" + ((TaskTargetItem)model.getTargets().get(0)).getTargetValue(), "-", 0, 0, 0);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         RedCliffMsg.S2C_TaskList_4342.Builder msg = RedCliffMsg.S2C_TaskList_4342.newBuilder();

         for(TaskData taskData : taskDataList) {
            CommonMsg.Task taskBuilder = this.buildTask(taskData);
            if (taskBuilder != null) {
               msg.addTaskList(taskBuilder);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      ChiBiTaskModel chiBiTaskModel = (ChiBiTaskModel)ApplicationContextProvider.getModelPoolEntity("chiBiTask", taskData.id);
      if (chiBiTaskModel == null) {
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
      return TaskDefine.TaskModule.MODULE_CHI_BI;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      RedCliffMsg.S2C_CommitTask_4344.Builder msg = RedCliffMsg.S2C_CommitTask_4344.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ChiBiTaskModel chiBiTaskModel = (ChiBiTaskModel)ApplicationContextProvider.getModelPoolEntity("chiBiTask", taskId);
      return chiBiTaskModel == null ? null : (chiBiTaskModel.getTargets().isEmpty() ? null : (TaskTargetItem)chiBiTaskModel.getTargets().get(0));
   }

   public void levelUp(int preLv, int newLv) {
      this.trigger();
   }
}
