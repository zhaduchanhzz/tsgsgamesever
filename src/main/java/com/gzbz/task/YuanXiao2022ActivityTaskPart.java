package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.YuanXiao2022ActivityPart;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.YuanXiaoTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.YuanXiao2022Msg;
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
public class YuanXiao2022ActivityTaskPart extends AbstractActivityTaskPart {
   protected int getActivityType() {
      return 66;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      YuanXiaoTaskModel taskModel = (YuanXiaoTaskModel)ApplicationContextProvider.getModelPoolEntity("YuanxiaoTask", taskId);
      if (null == taskModel) {
         this.logger.error("送花活跃任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return taskModel.getRewards();
      }
   }

   protected int rewardReason() {
      return 8903;
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
         ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
         int day = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1;
         Map<Integer, YuanXiaoTaskModel> taskModelMap = ApplicationContextProvider.<Integer, YuanXiaoTaskModel>getModelPoolMap("YuanxiaoTask");

         for(YuanXiaoTaskModel model : taskModelMap.values()) {
            if (model.getDay() == day) {
               this.createTask(model.getId());
            }
         }

         this.sendAllTaskList();
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         YuanXiao2022Msg.S2C_PrayTaskNotify_18308.Builder builder = YuanXiao2022Msg.S2C_PrayTaskNotify_18308.newBuilder();

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
      return TaskDefine.TaskModule.MODULE_YUAN_XIAO_2022;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      this.logger.info("上元春宵 - 送花活跃任务 - sendCommitTaskResult taskId:{}", taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      YuanXiaoTaskModel model = (YuanXiaoTaskModel)ApplicationContextProvider.getModelPool().getEntity("YuanxiaoTask", taskId);
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
      if (!this.isServerActivityInvalid()) {
         YuanXiaoTaskModel model = (YuanXiaoTaskModel)ApplicationContextProvider.getModelPool().getEntity("YuanxiaoTask", taskId);
         if (model == null) {
            this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         } else {
            if (this.checkCommit(taskId)) {
               TaskData taskData = this.getTask(taskId);
               taskData.finish();
               this.player.addResource(this.getRewards(taskId), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 89, this.rewardReason(), 0, 0, "");
               YuanXiao2022ActivityPart activityPart = (YuanXiao2022ActivityPart)this.player.getMgrPart(YuanXiao2022ActivityPart.class);
               activityPart.sendPrayInfo();
            }

         }
      }
   }

   public void loginHandle() {
      this.trigger();
   }

   public void sendAllTaskList() {
      YuanXiao2022Msg.S2C_PrayTaskList_18310.Builder builder = YuanXiao2022Msg.S2C_PrayTaskList_18310.newBuilder();

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
