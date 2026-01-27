package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HeFuBattleGameTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MergeWarGameMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MergeWarGameTaskPart extends AbstractTaskPart {
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_TaskList_19543(MergeWarGameMsg.C2S_TaskList_19543 msg, String source) {
      this.trigger();
      this.sendAllTasks(new ArrayList(this.getTasksMap().values()));
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_19545(MergeWarGameMsg.C2S_CommitTask_19545 msg, String source) {
      this.commit(msg.getTaskId());
   }

   public void trigger() {
      Map<Integer, HeFuBattleGameTaskModel> modelMap = ApplicationContextProvider.<Integer, HeFuBattleGameTaskModel>getModelPoolMap("hefuBattletask2");
      if (!CollectionUtils.isEmpty(modelMap)) {
         List<TaskData> taskDataList = new ArrayList();

         for(HeFuBattleGameTaskModel model : modelMap.values()) {
            TaskData taskData = super.createTask(model.getId());
            if (taskData != null) {
               taskDataList.add(taskData);
            }
         }

         if (!taskDataList.isEmpty()) {
            this.sendAllTasks(taskDataList);
         }

      }
   }

   public void commit(int taskId) {
      HeFuBattleGameTaskModel model = (HeFuBattleGameTaskModel)ApplicationContextProvider.getModelPoolEntity("hefuBattletask2", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         if (this.checkCommit(taskId)) {
            TaskData taskData = this.getTask(taskId);
            this.player.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 94, 9408, taskId, 0, "");
            taskData.finish();
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "合服争霸 - 跨服", "" + model.getTargetType(), "-", 0, 0, 0);
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         MergeWarGameMsg.S2C_UpdateTask_19548.Builder builder = MergeWarGameMsg.S2C_UpdateTask_19548.newBuilder();

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
      HeFuBattleGameTaskModel taskModel = (HeFuBattleGameTaskModel)ApplicationContextProvider.getModelPoolEntity("hefuBattletask2", taskData.id);
      if (taskModel == null) {
         return null;
      } else {
         CommonMsg.Task.Builder taskBuilder = CommonMsg.Task.newBuilder();
         taskBuilder.setTaskId(taskData.id);
         taskBuilder.setTaskNum(taskData.tVal);
         taskBuilder.setState(CommonMsg.TaskState.forNumber(taskData.state));
         return taskBuilder.build();
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_MERGEWAR_GAME;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      MergeWarGameMsg.S2C_CommitTask_19546.Builder builder = MergeWarGameMsg.S2C_CommitTask_19546.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      HeFuBattleGameTaskModel taskModel = (HeFuBattleGameTaskModel)ApplicationContextProvider.getModelPoolEntity("hefuBattletask2", taskId);
      return taskModel == null ? null : new TaskTargetItem(taskModel.getTargetType(), taskModel.getTargetId(), taskModel.getTargetNum());
   }

   public void sendAllTasks(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         MergeWarGameMsg.S2C_TaskList_19544.Builder builder = MergeWarGameMsg.S2C_TaskList_19544.newBuilder();

         for(TaskData taskData : taskDataList) {
            CommonMsg.Task taskBuilder = this.buildTask(taskData);
            if (taskBuilder != null) {
               builder.addTaskList(taskBuilder);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public void deleteTask() {
      List<ResourceModel> resourceModels = new ArrayList();
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         if (taskData.state == 2) {
            HeFuBattleGameTaskModel taskModel = (HeFuBattleGameTaskModel)ApplicationContextProvider.getModelPoolEntity("hefuBattletask2", taskData.id);
            if (taskModel != null) {
               resourceModels.addAll(taskModel.getReward());
            }
         }
      }

      if (resourceModels.size() > 0) {
         int awardType = this.configManager.getIntDefault("mergewarGameFightMailType", 2520);
         Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardModelMap = (TreeMap)centreAwardModelMap.get(awardType);
         if (!CollectionUtils.isEmpty(rewardModelMap)) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)rewardModelMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 94, 9408});
         }
      }

      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(this.getModule());
   }
}
