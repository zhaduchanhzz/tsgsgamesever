package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.HandBookTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
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
public class HandBookTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_HandBookTaskList_2023(PlayerMsg.C2S_HandBookTaskList_2023 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   @MsgHandlerAnno
   public void C2S_HandBookTaskCommit_2025(PlayerMsg.C2S_HandBookTaskCommit_2025 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      PlayerDao playerDao = this.player.getPlayerDao();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int openServerDays = worldMgr.getOpenServerDays();
      Map<Integer, HandBookTaskModel> handBookTaskModelMap = ApplicationContextProvider.<Integer, HandBookTaskModel>getModelPoolMap("handbooktask");
      Set<Integer> doingTaskIds = this.getTasksMap().keySet();

      for(HandBookTaskModel handBookTaskModel : handBookTaskModelMap.values()) {
         if (!doingTaskIds.contains(handBookTaskModel.getTaskID()) && playerDao.lv >= handBookTaskModel.getTasklv() && (handBookTaskModel.getOpenDay() <= 0 || handBookTaskModel.getOpenDay() <= openServerDays)) {
            super.createTask(handBookTaskModel.getTaskID());
         }
      }

   }

   public void commit(int taskId) {
      HandBookTaskModel handBookTaskModel = (HandBookTaskModel)ApplicationContextProvider.getModelPoolEntity("handbooktask", taskId);
      if (handBookTaskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            if (taskId == 14180) {
               this.player.addResource(handBookTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_HAND_BOOK_REWARD, 13, 1306, taskId, 0, "");
            } else {
               this.player.addResource(handBookTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1306, taskId, 0, "");
            }

            taskData.finish();
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         PlayerMsg.S2C_HandBookTaskList_2024.Builder msg = PlayerMsg.S2C_HandBookTaskList_2024.newBuilder();

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
      HandBookTaskModel handBookTaskModel = (HandBookTaskModel)ApplicationContextProvider.getModelPoolEntity("handbooktask", taskData.id);
      if (handBookTaskModel == null) {
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
      return TaskDefine.TaskModule.MODULE_HAND_BOOK;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      PlayerMsg.S2C_HandBookTaskCommit_2026.Builder msg = PlayerMsg.S2C_HandBookTaskCommit_2026.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      HandBookTaskModel handBookTaskModel = (HandBookTaskModel)ApplicationContextProvider.getModelPoolEntity("handbooktask", taskId);
      return handBookTaskModel == null ? null : (handBookTaskModel.getTargets().isEmpty() ? null : (TaskTargetItem)handBookTaskModel.getTargets().get(0));
   }

   public void loginHandle() {
      this.trigger();
   }

   public void levelUp(int preLv, int newLv) {
      this.trigger();
   }
}
