package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ChapterUpStarTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.BattleChapterMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
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
public class ChapterUpStarTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_ChapterUpStarTaskList_7227(BattleChapterMsg.C2S_ChapterUpStarTaskList_7227 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   @MsgHandlerAnno
   public void C2S_ChapterUpStarTaskCommit_7229(BattleChapterMsg.C2S_ChapterUpStarTaskCommit_7229 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      Map<Integer, ChapterUpStarTaskModel> chapterUpStarTaskModelMap = ApplicationContextProvider.<Integer, ChapterUpStarTaskModel>getModelPoolMap("chapterUpStarTask");
      if (chapterUpStarTaskModelMap != null && !chapterUpStarTaskModelMap.isEmpty()) {
         List<TaskData> taskDataList = new ArrayList();
         Set<Integer> doingTaskIds = this.getTasksMap().keySet();

         for(int taskId : chapterUpStarTaskModelMap.keySet()) {
            if (!doingTaskIds.contains(taskId)) {
               TaskData taskData = super.createTask(taskId);
               if (taskData != null) {
                  taskDataList.add(taskData);
               }
            }
         }

         if (!taskDataList.isEmpty()) {
            this.sendTaskList(taskDataList);
         }

      }
   }

   public void commit(int taskId) {
      ChapterUpStarTaskModel chapterUpStarTaskModel = (ChapterUpStarTaskModel)ApplicationContextProvider.getModelPoolEntity("chapterUpStarTask", taskId);
      if (chapterUpStarTaskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(chapterUpStarTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 15, 1506, taskId, 0, "");
            taskData.finish();
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.Builder msg = BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.newBuilder();

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
      ChapterUpStarTaskModel chapterUpStarTaskModel = (ChapterUpStarTaskModel)ApplicationContextProvider.getModelPoolEntity("chapterUpStarTask", taskData.id);
      if (chapterUpStarTaskModel == null) {
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
      return TaskDefine.TaskModule.MODULE_CHAPTER_UP_STAR;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      BattleChapterMsg.S2C_ChapterUpStarTaskCommit_7230.Builder msg = BattleChapterMsg.S2C_ChapterUpStarTaskCommit_7230.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ChapterUpStarTaskModel chapterUpStarTaskModel = (ChapterUpStarTaskModel)ApplicationContextProvider.getModelPoolEntity("chapterUpStarTask", taskId);
      return chapterUpStarTaskModel != null && chapterUpStarTaskModel.getTargets() != null && !chapterUpStarTaskModel.getTargets().isEmpty() ? (TaskTargetItem)chapterUpStarTaskModel.getTargets().get(0) : null;
   }

   public void loginHandle() {
      this.trigger();
   }
}
