package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ArcherySignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
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
public class TongQueArcheryPrayTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 0;
   }

   protected int getActivityType() {
      return 28;
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
         Map<Integer, ArcherySignAwardModel> archerySignAwardModelMap = ApplicationContextProvider.<Integer, ArcherySignAwardModel>getModelPoolMap("archerySignAward");
         List<TaskData> taskList = new ArrayList();

         for(ArcherySignAwardModel archerySignAwardModel : archerySignAwardModelMap.values()) {
            if (day == archerySignAwardModel.getDay() && archerySignAwardModel.getRewardsNeed() == 2) {
               TaskData taskData = this.createTask(archerySignAwardModel.getId());
               if (taskData != null) {
                  taskList.add(taskData);
               }
            }
         }

         this.sendTaskList(taskList);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ThemeActivityMsg.S2C_ArcheryPrayTaskNotify_12943.Builder msg = ThemeActivityMsg.S2C_ArcheryPrayTaskNotify_12943.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addPrayTask(task);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_TONG_QUE_ARCHERY_PRAY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ArcherySignAwardModel archerySignAwardModel = (ArcherySignAwardModel)ApplicationContextProvider.getModelPoolEntity("archerySignAward", taskId);
      return archerySignAwardModel == null ? null : new TaskTargetItem(archerySignAwardModel.getTargetType(), archerySignAwardModel.getTargetId(), archerySignAwardModel.getTargetNum());
   }

   public void loginHandle() {
      this.trigger();
   }
}
