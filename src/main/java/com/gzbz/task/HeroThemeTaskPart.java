package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.EventHeroCallTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.HeroThemeMsg;
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
public class HeroThemeTaskPart extends AbstractActivityTaskPart {
   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         HeroThemeMsg.S2C_TaskModify_13016.Builder builder = HeroThemeMsg.S2C_TaskModify_13016.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData data = this.buildTask(taskData);
            if (data != null) {
               builder.addTask(data);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_HERO_THEME;
   }

   public void commit(int taskId) {
      EventHeroCallTaskModel model = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (taskData == null) {
            this.logger.error("任务模块{},提交任务{} 数据错误", this.getModule(), taskId);
            this.sendCommitTaskResult(taskId, 0L);
         } else {
            if (this.checkCommit(taskId)) {
               taskData.finish();
               PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
               List<ResourceModel> resourceModelList = new ArrayList(this.getRewards(taskId));
               this.player.addResource(resourceModelList, showType, 61, this.rewardReason(), taskId, 0, "");
            }

            this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
            this.player.getOperationMgr().pushTask(() -> this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "魔仙秘录", taskId + "", taskId + "", 0, 0, 1));
         }
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      HeroThemeMsg.S2C_TaskCommitTask_13014.Builder builder = HeroThemeMsg.S2C_TaskCommitTask_13014.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   protected int rewardReason() {
      return 6104;
   }

   protected int getActivityType() {
      return 18;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      EventHeroCallTaskModel model = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskId);
      if (model == null) {
         this.logger.error("主题武将活动：{}配置不存在", taskId);
         return new ArrayList();
      } else {
         List<ResourceModel> rewardList = new ArrayList(model.getRewards());
         return rewardList;
      }
   }

   public void loginHandle() {
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.id > 0 && activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
         for(Map.Entry<Integer, TaskData> taskDataEntry : this.getTasksMap().entrySet()) {
            TaskData taskData = (TaskData)taskDataEntry.getValue();
            EventHeroCallTaskModel model = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskData.id);
            if (model == null) {
               taskData.delete();
            }
         }

         this.trigger();
      }

   }

   public void trigger() {
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
      if (activityInfo != null && activityInfo.id > 0) {
         if (activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
            Map<Integer, EventHeroCallTaskModel> allTasks = ApplicationContextProvider.<Integer, EventHeroCallTaskModel>getModelPoolMap("eventHeroCallTask");

            for(EventHeroCallTaskModel eventHeroCallTaskModel : allTasks.values()) {
               if (eventHeroCallTaskModel.getActivityId() == this.getPlayerActivityId()) {
                  super.createTask(eventHeroCallTaskModel.getId());
               }
            }

         }
      }
   }

   public TaskTargetItem getTargetItem(int taskId) {
      EventHeroCallTaskModel model = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetNum());
   }
}
