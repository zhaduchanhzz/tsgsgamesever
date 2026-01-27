package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.UnionTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
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
public class UnionTaskPart extends AbstractTaskPart {
   public void resetDaily() {
      this.reset(1);
   }

   public void resetWeek() {
      this.reset(2);
   }

   public void trigger() {
      if (this.checkJoinUnion()) {
         Map<Integer, UnionTaskModel> taskModelMap = ApplicationContextProvider.getModelPool().getMap("unionTask");
         if (taskModelMap != null && !taskModelMap.isEmpty()) {
            Set<Integer> doingTaskIds = this.getTasksMap().keySet();

            for(UnionTaskModel taskModel : taskModelMap.values()) {
               if (!doingTaskIds.contains(taskModel.getId())) {
                  super.createTask(taskModel.getId());
               }
            }

         }
      }
   }

   public void commit(int taskId) {
      if (!this.checkJoinUnion()) {
         this.player.failure(23);
      } else {
         if (this.checkCommit(taskId)) {
            TaskData taskData = this.getTask(taskId);
            taskData.finish();
            UnionTaskModel model = (UnionTaskModel)ApplicationContextProvider.getModelPool().getEntity("unionTask", taskId);
            if (model == null) {
               this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
               this.sendCommitTaskResult(taskId, 0L);
               return;
            }

            String unionName = "";
            PlayerDao playerDao = this.player.getPlayerDao();
            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
            if (unionMgr != null) {
               UnionDao unionDao = unionMgr.getUnion();
               unionName = unionDao.unionName;
            }

            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());

            for(ResourceModel rewardItem : model.getRewards()) {
               if (rewardItem.getType() == 1 && rewardItem.getId() == PlayerDefine.PLAYER_UNION_ACTIVE) {
                  playerResetCustomCache.addDailyReset(4, rewardItem.getValue());
                  playerResetCustomCache.addWeekReset(4, rewardItem.getValue());
                  this.player.getOperationMgr().addExtraLog(this.player, 111, unionName, model.getTaskDesc(), String.valueOf(rewardItem.getValue()), String.valueOf(playerResetCustomCache.getDailyNum(4, 0)), String.valueOf(playerResetCustomCache.getWeekNum(4, 0)));
               }
            }

            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 3, 303, taskId, 0, "");
            UnionMsg.S2C_UnionActiveInfo_6942.Builder resp = UnionMsg.S2C_UnionActiveInfo_6942.newBuilder();
            resp.setExp(playerDao.union_active);
            resp.setToday((Integer)playerResetCustomCache.getDailyNum(4, 0));
            resp.setWeek((Integer)playerResetCustomCache.getWeekNum(4, 0));
            resp.setOpType(2);
            this.player.sendMsg(resp.build());
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      UnionMsg.S2C_UnionActiveInfo_6942.Builder tasksBuilder = UnionMsg.S2C_UnionActiveInfo_6942.newBuilder();
      tasksBuilder.addAllUnionTask(this.getUnionTasksMsg());
      tasksBuilder.setOpType(3);
      this.player.sendMsg(tasksBuilder.build());
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      return taskData.toBuilder().build();
   }

   public List<CommonMsg.Task> getUnionTasksMsg() {
      List<CommonMsg.Task> unionTaskList = new ArrayList();

      for(TaskData task : this.getTasksMap().values()) {
         unionTaskList.add(this.buildTask(task));
      }

      return unionTaskList;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      UnionMsg.S2C_UnionActiveTaskReward_6940.Builder msg = UnionMsg.S2C_UnionActiveTaskReward_6940.newBuilder();
      msg.setTaskId(taskId);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      UnionTaskModel model = (UnionTaskModel)ApplicationContextProvider.getModelPool().getEntity("unionTask", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_UNION;
   }

   private void reset(int taskType) {
      Map<Integer, UnionTaskModel> taskModelMap = ApplicationContextProvider.getModelPool().getMap("unionTask");
      Map<Integer, TaskData> tasks = this.getTasksMap();

      for(Map.Entry<Integer, TaskData> taskDaoEntry : tasks.entrySet()) {
         TaskData taskData = (TaskData)taskDaoEntry.getValue();
         if (!taskModelMap.containsKey(taskData.id)) {
            taskData.delete();
         } else {
            UnionTaskModel model = (UnionTaskModel)ApplicationContextProvider.getModelPool().getEntity("unionTask", taskData.id);
            if (model == null || model.getTaskType() == taskType) {
               taskData.delete();
            }
         }
      }

      this.trigger();
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      UnionMgr unionMgr = unionMgrParent.getUnionMgr(this.player.getPublicDao().unionId);
      if (unionMgr != null && unionMgr.getUnion().finishActivate) {
         this.player.triggerTask(707, 0, 1L, 1);
      }

   }

   private boolean checkJoinUnion() {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      return playerDao.unionId > 0;
   }
}
