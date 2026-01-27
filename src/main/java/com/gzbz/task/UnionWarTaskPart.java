package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.UnionWarTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionWarMsg;
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
public class UnionWarTaskPart extends AbstractTaskPart {
   @MsgHandlerAnno
   public void C2S_WarBattleAchievementList_9723(UnionWarMsg.C2S_WarBattleAchievementList_9723 msg, String source) {
      if (!this.checkJoinUnion()) {
         this.player.failure(23);
      } else {
         List<TaskData> taskDataList = new ArrayList(this.getTasksMap().values());
         this.sendTaskList(taskDataList);
      }
   }

   @MsgHandlerAnno
   public void C2S_WarBattleCommitAchievementList_9725(UnionWarMsg.C2S_WarBattleCommitAchievementList_9725 msg, String source) {
      int achievementId = msg.getAchievementId();
      this.commit(achievementId);
   }

   public void trigger() {
      if (this.checkJoinUnion()) {
         Map<Integer, UnionWarTaskModel> taskModelMap = ApplicationContextProvider.<Integer, UnionWarTaskModel>getModelPoolMap("unionWarTask");
         if (taskModelMap != null && !taskModelMap.isEmpty()) {
            boolean updateFlag = false;
            Set<Integer> doingTaskIds = this.getTasksMap().keySet();

            for(UnionWarTaskModel taskModel : taskModelMap.values()) {
               if (!doingTaskIds.contains(taskModel.getId())) {
                  TaskData taskData = super.createTask(taskModel.getId());
                  if (taskData != null) {
                     updateFlag = true;
                  }
               }
            }

            if (updateFlag) {
               List<TaskData> taskData = new ArrayList(this.getTasksMap().values());
               this.sendTaskList(taskData);
            }
         }
      }
   }

   public void commit(int taskId) {
      UnionWarTaskModel model = (UnionWarTaskModel)ApplicationContextProvider.getModelPoolEntity("unionWarTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 9, 933, taskId, 0, "");
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      UnionWarMsg.S2C_WarBattleAchievementList_9724.Builder msg = UnionWarMsg.S2C_WarBattleAchievementList_9724.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addAchievements(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   protected UnionWarMsg.WarBattleAchievementData buildTask(TaskData taskData) {
      UnionWarMsg.WarBattleAchievementData.Builder builder = UnionWarMsg.WarBattleAchievementData.newBuilder();
      builder.setAchievementId(taskData.id);
      builder.setState(taskData.state);
      builder.setProgress(taskData.tVal);
      return builder.build();
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_UNION_WAR;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      UnionWarMsg.S2C_WarBattleCommitAchievementList_9726.Builder msg = UnionWarMsg.S2C_WarBattleCommitAchievementList_9726.newBuilder();
      msg.setAchievementId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      UnionWarTaskModel model = (UnionWarTaskModel)ApplicationContextProvider.getModelPoolEntity("unionWarTask", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }

   private boolean checkJoinUnion() {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      return playerDao.unionId > 0;
   }

   public void resetDaily() {
      this.trigger();
   }

   public void loginHandle() {
      this.trigger();
   }
}
