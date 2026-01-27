package com.gzbz.task;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.model.ArtifactTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ArtifactTaskPart extends AbstractTaskPart {
   public void trigger() {
      Map<Integer, ArtifactTaskModel> artifactTaskModelMap = this.player.getGameModelPool().getMap("artifactTask");

      for(Map.Entry<Integer, ArtifactTaskModel> entry : artifactTaskModelMap.entrySet()) {
         super.createTask((Integer)entry.getKey());
      }

   }

   public void commit(int taskId) {
      ArtifactTaskModel model = (ArtifactTaskModel)ApplicationContextProvider.getModelPool().getEntity("artifactTask", taskId);
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
      if (this.player.getPlayerDao().lv > 1) {
         ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
         artifactPart.updateTask(taskDataList);
      }

   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ARTIFACT;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
      artifactPart.takeSuccess(taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ArtifactTaskModel model = (ArtifactTaskModel)ApplicationContextProvider.getModelPool().getEntity("artifactTask", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }
}
