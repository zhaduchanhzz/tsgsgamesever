package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ChapterTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.BattleChapterMsg;
import com.gzbz.protobuf.CommonMsg;
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
public class ChapterSectionTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_ChapterSectionTaskList_7231(BattleChapterMsg.C2S_ChapterSectionTaskList_7231 msg, String source) {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   @MsgHandlerAnno
   public void C2S_ChapterSectionTaskCommit_7233(BattleChapterMsg.C2S_ChapterSectionTaskCommit_7233 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      Map<Integer, ChapterTaskModel> chapterTaskModelMap = ApplicationContextProvider.<Integer, ChapterTaskModel>getModelPoolMap("chaptertask");
      if (chapterTaskModelMap != null && !chapterTaskModelMap.isEmpty()) {
         List<TaskData> taskDataList = new ArrayList();

         for(int taskId : chapterTaskModelMap.keySet()) {
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

   public void commit(int taskId) {
      ChapterTaskModel chapterTaskModel = (ChapterTaskModel)ApplicationContextProvider.getModelPoolEntity("chaptertask", taskId);
      if (chapterTaskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(chapterTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 15, 1507, taskId, 0, "");
            taskData.finish();
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         BattleChapterMsg.S2C_ChapterSectionTaskList_7232.Builder msg = BattleChapterMsg.S2C_ChapterSectionTaskList_7232.newBuilder();

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
      ChapterTaskModel chapterTaskModel = (ChapterTaskModel)ApplicationContextProvider.getModelPoolEntity("chaptertask", taskData.id);
      if (chapterTaskModel == null) {
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
      return TaskDefine.TaskModule.MODULE_CHAPTER_SECTION;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      BattleChapterMsg.S2C_ChapterSectionTaskCommit_7234.Builder msg = BattleChapterMsg.S2C_ChapterSectionTaskCommit_7234.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ChapterTaskModel chapterTaskModel = (ChapterTaskModel)ApplicationContextProvider.getModelPoolEntity("chaptertask", taskId);
      return chapterTaskModel == null ? null : new TaskTargetItem(chapterTaskModel.getTaskType(), 0, chapterTaskModel.getTarget());
   }

   public void loginHandle() {
      this.trigger();
   }
}
