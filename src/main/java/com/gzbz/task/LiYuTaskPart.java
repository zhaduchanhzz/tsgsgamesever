package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.RotateActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LiYuTaskPart extends AbstractActivityTaskPart {
   @MsgHandlerAnno
   public void C2S_LiYuTasks_16147(RotateActivityMsg.C2S_LiYuTasks_16147 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_LiYuTaskCommitTask_16149(RotateActivityMsg.C2S_LiYuTaskCommitTask_16149 msg, String source) {
      this.commit(msg.getTaskId());
   }

   protected int rewardReason() {
      return 896;
   }

   protected int getActivityType() {
      return 45;
   }

   public void sendInfo() {
      RotateActivityMsg.S2C_LiYuTasks_16148.Builder resp = RotateActivityMsg.S2C_LiYuTasks_16148.newBuilder();
      if (!this.isServerActivityInvalid()) {
         for(TaskData taskData : this.getTasksMap().values()) {
            resp.addTask(taskData.toBuilder());
         }
      }

      this.player.sendMsg(resp.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return (List<ResourceModel>)(sevenDaysTaskModel == null ? new ArrayList() : sevenDaysTaskModel.getRewards());
   }

   public void trigger() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         this.giftReward();
         if (activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
            int day = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1;

            for(SevenDaysTaskModel sevenDaysTaskModel : this.getTaskModels()) {
               if (sevenDaysTaskModel.getTime() == day) {
                  super.createTask(sevenDaysTaskModel.getId());
               }
            }

         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         RotateActivityMsg.S2C_LiYuTasksNotify_16152.Builder msg = RotateActivityMsg.S2C_LiYuTasksNotify_16152.newBuilder();

         for(TaskData taskData : taskDataList) {
            msg.addTask(taskData.toBuilder());
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_LI_YU_ROTATE;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      RotateActivityMsg.S2C_LiYuTaskCommitTask_16150.Builder resp = RotateActivityMsg.S2C_LiYuTaskCommitTask_16150.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void loginHandle() {
      this.trigger();
   }

   public void giftReward() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         int day = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1;
         if (day >= 2) {
            for(TaskData taskData : this.getTasksMap().values()) {
               SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
               if (sevenDaysTaskModel == null) {
                  taskData.delete();
               } else if (sevenDaysTaskModel.getTime() != day) {
                  taskData.delete();
               }
            }

         }
      }
   }
}
