package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.NewYear2022TaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.NewYear2022Msg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class NewYear2022TaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 8219;
   }

   protected int getActivityType() {
      return 65;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      List<ResourceModel> resourceModels = new ArrayList();
      NewYear2022TaskModel newYear2022TaskModel = (NewYear2022TaskModel)ApplicationContextProvider.getModelPoolEntity("xinChunTask", taskId);
      if (newYear2022TaskModel != null) {
         resourceModels.addAll(newYear2022TaskModel.getRewards());
      }

      return resourceModels;
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, Map<Integer, NewYear2022TaskModel>> modelMap = ApplicationContextProvider.<Integer, Map<Integer, NewYear2022TaskModel>>getModelPoolMap("customXinChunTask");
         if (modelMap != null && !modelMap.isEmpty() && modelMap.containsKey(this.getServerActivityInfo().id)) {
            int activityDay = this.getActivityDay();
            long curTime = System.currentTimeMillis();
            long updateTime = this.player.getPlayerDao().updateTime;
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());

            for(NewYear2022TaskModel taskModel : (modelMap.get(this.getServerActivityInfo().id)).values()) {
               if (taskModel.getTime() == 1 && taskModel.getDays() != activityDay) {
                  TaskData taskData = this.getTask(taskModel.getId());
                  if (taskData != null) {
                     taskData.delete();
                  }
               } else {
                  TaskData taskData = this.createTask(taskModel.getId());
                  if (taskData != null && DateUtil.isSameDay(curTime, updateTime) && taskModel.getTargetType() == 510) {
                     taskData.tVal = playerRechargeDao.dailyRecharge;
                     taskData.updateOp();
                     this.checkComplete(taskData);
                  }
               }
            }

         }
      }
   }

   public void commit(int taskId) {
      NewYear2022TaskModel newYear2022TaskModel = (NewYear2022TaskModel)ApplicationContextProvider.getModelPoolEntity("xinChunTask", taskId);
      if (newYear2022TaskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else if (newYear2022TaskModel.getActId() != this.getServerActivityInfo().id) {
         this.logger.error("任务模块{},提交任务{}非本活动任务", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(newYear2022TaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, this.rewardReason(), taskId, 0, "");
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         NewYear2022Msg.S2C_NewYearTaskNotify_18006.Builder builder = NewYear2022Msg.S2C_NewYearTaskNotify_18006.newBuilder();

         for(TaskData taskData : taskDataList) {
            builder.addTask(taskData.toBuilder());
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_NEW_YEAR_2022;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      NewYear2022Msg.S2C_NewYearTaskCommit_18008.Builder builder = NewYear2022Msg.S2C_NewYearTaskCommit_18008.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      NewYear2022TaskModel newYear2022TaskModel = (NewYear2022TaskModel)ApplicationContextProvider.getModelPoolEntity("xinChunTask", taskId);
      return newYear2022TaskModel == null ? null : new TaskTargetItem(newYear2022TaskModel.getTargetType(), newYear2022TaskModel.getTargetId(), newYear2022TaskModel.getTargetNum());
   }
}
