package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.magicBook.MagicBookPart;
import com.gzbz.model.MagicTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MagicBookMsg;
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
public class MagicTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_TaskList_10621(MagicBookMsg.C2S_TaskList_10621 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_10623(MagicBookMsg.C2S_CommitTask_10623 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      Map<Integer, MagicTaskModel> taskModelMap = ApplicationContextProvider.<Integer, MagicTaskModel>getModelPoolMap("Mystictask");

      for(MagicTaskModel magicTaskModel : taskModelMap.values()) {
         super.createTask(magicTaskModel.getId());
      }

   }

   public void commit(int taskId) {
      MagicTaskModel model = (MagicTaskModel)ApplicationContextProvider.getModelPool().getEntity("Mystictask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 47, 4711, taskId, 0, "");
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      MagicBookMsg.S2C_TaskList_10622.Builder msg = MagicBookMsg.S2C_TaskList_10622.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTasks(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      CommonMsg.Task.Builder msg = CommonMsg.Task.newBuilder();
      msg.setState(CommonMsg.TaskState.forNumber(taskData.state));
      msg.setTaskId(taskData.id);
      msg.setTaskNum(taskData.tVal);
      return msg.build();
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_MAGIC;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      MagicBookMsg.S2C_CommitTaskResult_10624.Builder msg = MagicBookMsg.S2C_CommitTaskResult_10624.newBuilder();
      msg.setTaskId(taskId);
      boolean isActive = true;

      for(TaskData taskData : this.getTasksMap().values()) {
         if (taskData.state != 3) {
            isActive = false;
            break;
         }
      }

      msg.setIsActive(!this.getTasksMap().isEmpty() && isActive);
      this.player.sendMsg(msg.build());
      if (isActive) {
         MagicBookPart magicBookPart = (MagicBookPart)this.player.getMgrPart(MagicBookPart.class);
         magicBookPart.activeMagicBook();

         for(TaskData taskData : this.getTasksMap().values()) {
            taskData.delete();
         }
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      MagicTaskModel magicTaskModel = (MagicTaskModel)ApplicationContextProvider.getModelPoolEntity("Mystictask", taskId);
      return magicTaskModel != null && !magicTaskModel.getTargets().isEmpty() ? (TaskTargetItem)magicTaskModel.getTargets().get(0) : null;
   }
}
