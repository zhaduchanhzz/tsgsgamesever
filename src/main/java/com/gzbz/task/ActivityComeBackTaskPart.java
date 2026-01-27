package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.part.ActivityComeBackPart;
import com.gzbz.db.ActivityComeBackDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ComeBackActivityTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityComeBackMsg;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
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
public class ActivityComeBackTaskPart extends AbstractActivityTaskPart {
   protected int getActivityType() {
      return 90;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      ComeBackActivityTaskModel taskModel = (ComeBackActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTask", taskId);
      if (null == taskModel) {
         this.logger.error("ComeBackActivityTask缺少配置 id:{}", taskId);
         return new ArrayList();
      } else {
         return taskModel.getRewards();
      }
   }

   protected int rewardReason() {
      return 10805;
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, ComeBackActivityTaskModel> taskModelMap = ApplicationContextProvider.<Integer, ComeBackActivityTaskModel>getModelPoolMap("comeBackActivityTask");

         for(ComeBackActivityTaskModel model : taskModelMap.values()) {
            this.createTask(model.getId());
         }

         ActivityComeBackPart comeBackPart = (ActivityComeBackPart)this.player.getMgrPart(ActivityComeBackPart.class);
         comeBackPart.sendActivityInfo();
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (!this.isServerActivityInvalid()) {
         if (taskDataList != null && !taskDataList.isEmpty()) {
            int activityDay = this.getActivityDay();
            ActivityComeBackMsg.S2C_PrayTaskNotify_21211.Builder builder = ActivityComeBackMsg.S2C_PrayTaskNotify_21211.newBuilder();

            for(TaskData taskData : taskDataList) {
               ComeBackActivityTaskModel taskModel = (ComeBackActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTask", taskData.id);
               if (null != taskModel && (taskModel.getType() != 1 || activityDay >= taskModel.getDay())) {
                  ActivityMsg.TaskData task = this.buildTask(taskData);
                  if (task != null) {
                     builder.addTask(task);
                  }
               }
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_COME_BACK_ACT;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      this.logger.info("回归活动 - 任务 - sendCommitTaskResult taskId:{}", taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      ComeBackActivityTaskModel model = (ComeBackActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetValue());
   }

   public boolean checkComplete(TaskData taskData) {
      return super.checkComplete(taskData);
   }

   public void commit(int taskId) {
      if (!this.isServerActivityInvalid()) {
         ComeBackActivityTaskModel model = (ComeBackActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTask", taskId);
         if (model == null) {
            this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
            this.player.failure(37);
         } else {
            int activityDay = this.getActivityDay();
            if (model.getType() == 1 && activityDay < model.getDay()) {
               this.player.failure(6);
            } else {
               if (this.checkCommit(taskId)) {
                  TaskData taskData = this.getTask(taskId);
                  taskData.finish();
                  this.player.addResource(this.getRewards(taskId), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, this.rewardReason(), 0, 0, "");
                  ActivityComeBackPart activityComeBackPart = (ActivityComeBackPart)this.player.getMgrPart(ActivityComeBackPart.class);
                  ActivityComeBackDao dao = activityComeBackPart.getDao();
                  dao.power += model.getPower();
                  dao.updateOp();
                  activityComeBackPart.S2C_PowerUpdate_21218();
               }

            }
         }
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.trigger();
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.trigger();
      }
   }
}
