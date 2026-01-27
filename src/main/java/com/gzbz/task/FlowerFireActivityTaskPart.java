package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.FlowerFireActivityPart;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.FlowerFirePotTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.FlowerFireActivityMsg;
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
public class FlowerFireActivityTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 0;
   }

   protected int getActivityType() {
      return 56;
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
         Map<Integer, FlowerFirePotTaskModel> taskModelMap = ApplicationContextProvider.<Integer, FlowerFirePotTaskModel>getModelPoolMap("FlowerfireTubeTask");

         for(FlowerFirePotTaskModel model : taskModelMap.values()) {
            if (model.getDay() == day) {
               this.createTask(model.getId());
            }
         }

         this.sendAllTaskList();
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.Builder builder = FlowerFireActivityMsg.S2C_PrayTaskNotify_17124.newBuilder();

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
      return TaskDefine.TaskModule.MODULE_ACT_FLOWER_FIRE_ACTIVITY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      this.logger.info("烟花大会 - 点火任务 - sendCommitTaskResult taskId:{}", taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      FlowerFirePotTaskModel model = (FlowerFirePotTaskModel)ApplicationContextProvider.getModelPool().getEntity("FlowerfireTubeTask", taskId);
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
      FlowerFirePotTaskModel model = (FlowerFirePotTaskModel)ApplicationContextProvider.getModelPool().getEntity("FlowerfireTubeTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         if (this.checkCommit(taskId)) {
            TaskData taskData = this.getTask(taskId);
            taskData.finish();
            FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)this.player.getMgrPart(FlowerFireActivityPart.class);
            flowerFireActivityPart.finishPrayTask();
         }

      }
   }

   public void loginHandle() {
      this.trigger();
   }

   public void sendAllTaskList() {
      FlowerFireActivityMsg.S2C_PrayTaskList_17128.Builder builder = FlowerFireActivityMsg.S2C_PrayTaskList_17128.newBuilder();

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
