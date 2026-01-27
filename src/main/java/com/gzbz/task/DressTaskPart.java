package com.gzbz.task;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.model.ArtifactDressTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
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
public class DressTaskPart extends AbstractTaskPart {
   public void trigger() {
   }

   public void checkData() {
      Map<Integer, ArtifactDressTaskModel> map = this.player.getGameModelPool().getMap("artifactDressTask");
      List<Integer> haveList = new ArrayList();
      Map<Integer, TaskData> tasks = this.getTasksMap();

      for(Map.Entry<Integer, TaskData> taskDaoEntry : tasks.entrySet()) {
         TaskData taskData = (TaskData)taskDaoEntry.getValue();
         if (!map.containsKey(taskData.id)) {
            taskData.delete();
         } else {
            ArtifactDressTaskModel model = (ArtifactDressTaskModel)ApplicationContextProvider.getModelPool().getEntity("artifactDressTask", taskData.id);
            if (model == null) {
               taskData.delete();
            }

            haveList.add(taskData.id);
         }
      }

      for(Map.Entry<Integer, ArtifactDressTaskModel> entry : map.entrySet()) {
         if (!haveList.contains(entry.getKey())) {
            super.createTask((Integer)entry.getKey());
         }
      }

      this.trigger();
   }

   public void initTask(List<Integer> taskIds) {
      for(Integer taskId : taskIds) {
         super.createTask(taskId);
      }

   }

   public void commit(int taskId) {
      ArtifactDressTaskModel model = (ArtifactDressTaskModel)this.player.getGameModelPool().getEntity("artifactDressTask", taskId);
      if (model == null) {
         this.player.failure(0);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (taskData == null) {
            this.player.failure(0);
         } else {
            if (this.checkCommit(taskId)) {
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 3, 300, taskId, 0, "");
               taskData.finish();
            }

            this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.updateTask(taskDataList);
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_DRESS;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      System.out.println("sendCommitTaskResult");
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.takeSuccess(taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ArtifactDressTaskModel model = (ArtifactDressTaskModel)this.player.getGameModelPool().getEntity("artifactDressTask", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }
}
