package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.SwimParkActivityPart;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.SwimparkPotTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.SwimParkActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.sql.Timestamp;
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
public class SwimParkActivitySilkBagTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 0;
   }

   protected int getActivityType() {
      return 52;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      return new ArrayList();
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
         ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
         int day = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1;
         Map<Integer, SwimparkPotTaskModel> taskModelMap = ApplicationContextProvider.<Integer, SwimparkPotTaskModel>getModelPoolMap("SwimparkPotTask");

         for(SwimparkPotTaskModel model : taskModelMap.values()) {
            if (model.getDay() == day) {
               this.createTask(model.getId());
            }
         }

         this.sendAllTaskList();
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         SwimParkActivityMsg.S2C_PrayTaskNotify_16524.Builder builder = SwimParkActivityMsg.S2C_PrayTaskNotify_16524.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               builder.addTask(task);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_SWIM_PARK_ACTIVITY_PRAY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      this.logger.info("游园活动 - 投壶射礼 - sendCommitTaskResult taskId:{}", taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      SwimparkPotTaskModel model = (SwimparkPotTaskModel)ApplicationContextProvider.getModelPool().getEntity("SwimparkPotTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetVal());
   }

   public boolean checkComplete(TaskData taskData) {
      if (!super.checkComplete(taskData)) {
         return false;
      } else {
         this.commit(taskData.id);
         return true;
      }
   }

   public void commit(int taskId) {
      SwimparkPotTaskModel model = (SwimparkPotTaskModel)ApplicationContextProvider.getModelPool().getEntity("SwimparkPotTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         if (this.checkCommit(taskId)) {
            TaskData taskData = this.getTask(taskId);
            taskData.finish();
            SwimParkActivityPart swimParkActivityPart = (SwimParkActivityPart)this.player.getMgrPart(SwimParkActivityPart.class);
            swimParkActivityPart.finishPrayTask();
         }

      }
   }

   public void loginHandle() {
      this.trigger();
   }

   public void sendAllTaskList() {
      SwimParkActivityMsg.S2C_PrayTaskList_16528.Builder builder = SwimParkActivityMsg.S2C_PrayTaskList_16528.newBuilder();

      for(TaskData taskData : this.getTasksMap().values()) {
         ActivityMsg.TaskData task = this.buildTask(taskData);
         if (task != null) {
            builder.addTask(task);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public int getCompleteTaskNum() {
      int num = 0;

      for(TaskData taskData : this.getTasksMap().values()) {
         if (taskData.state >= 2) {
            ++num;
         }
      }

      return num;
   }
}
