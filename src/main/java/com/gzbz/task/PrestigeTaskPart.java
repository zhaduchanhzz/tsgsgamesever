package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.PrestigeTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MonarchMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PrestigeTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_PrestigeTaskList_9021(MonarchMsg.C2S_PrestigeTaskList_9021 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   public void trigger() {
      Map<Integer, PrestigeTaskModel> prestigeTaskModelMap = ApplicationContextProvider.<Integer, PrestigeTaskModel>getModelPoolMap("prestigetask");
      if (!CollectionUtils.isEmpty(prestigeTaskModelMap)) {
         for(Integer taskId : prestigeTaskModelMap.keySet()) {
            super.createTask(taskId);
         }

      }
   }

   public void commit(int taskId) {
      PrestigeTaskModel model = (PrestigeTaskModel)ApplicationContextProvider.getModelPoolEntity("prestigetask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.logger.info("发放称号奖励 称号 playerId:{} id:{}", this.player.getPlayerId(), model.getPrestigeid());
            this.player.addResource(2, model.getPrestigeid(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 63, 6301, taskId, 0, "");
            taskData.finish();
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         MonarchMsg.S2C_PrestigeTaskList_9022.Builder builder = MonarchMsg.S2C_PrestigeTaskList_9022.newBuilder();

         for(TaskData taskData : taskDataList) {
            CommonMsg.Task taskBuilder = this.buildTask(taskData);
            if (taskBuilder != null) {
               builder.addTaskList(taskBuilder);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      PrestigeTaskModel model = (PrestigeTaskModel)ApplicationContextProvider.getModelPoolEntity("prestigetask", taskData.id);
      if (model == null) {
         return null;
      } else {
         CommonMsg.Task.Builder task = CommonMsg.Task.newBuilder();
         task.setTaskId(taskData.id);
         task.setTaskNum(taskData.tVal);
         task.setState(CommonMsg.TaskState.forNumber(taskData.state));
         return task.build();
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_PRESTIGET;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      PrestigeTaskModel model = (PrestigeTaskModel)ApplicationContextProvider.getModelPoolEntity("prestigetask", taskId);
      return model == null ? null : (model.getTarget().isEmpty() ? null : (TaskTargetItem)model.getTarget().get(0));
   }

   public void loginHandle() {
      this.trigger();
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }
}
