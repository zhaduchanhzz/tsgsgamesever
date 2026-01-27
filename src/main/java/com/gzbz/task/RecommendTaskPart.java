package com.gzbz.task;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.benefit.RecommendPart;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.RecommendModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
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
public class RecommendTaskPart extends AbstractTaskPart {
   public void trigger() {
      Map<Integer, RecommendModel> recommendModelMap = ApplicationContextProvider.<Integer, RecommendModel>getModelPoolMap("recommend");
      if (recommendModelMap != null && !recommendModelMap.isEmpty()) {
         Set<Integer> doingTaskIds = this.getTasksMap().keySet();

         for(RecommendModel recommendModel : recommendModelMap.values()) {
            if (!doingTaskIds.contains(recommendModel.getTaskId())) {
               super.createTask(recommendModel.getTaskId());
            }
         }

      }
   }

   public boolean checkComplete(TaskData taskData) {
      if (super.checkComplete(taskData)) {
         taskData.delete();
         RecommendPart recommendPart = (RecommendPart)this.player.getMgrPart(RecommendPart.class);
         recommendPart.invitedPlayerComplete(taskData.id);
         return true;
      } else {
         return false;
      }
   }

   public void commit(int taskId) {
   }

   public void sendTaskList(List<TaskData> taskDataList) {
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_RECOMMEND;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      RecommendModel recommendModel = (RecommendModel)ApplicationContextProvider.getModelPoolEntity("recommend", taskId);
      if (recommendModel == null) {
         return null;
      } else {
         TaskTargetItem taskTargetItem = new TaskTargetItem();
         taskTargetItem.setTargetType(10001);
         taskTargetItem.setTargetId(recommendModel.getTaskType());
         taskTargetItem.setTargetValue(recommendModel.getNeed());
         return taskTargetItem;
      }
   }
}
