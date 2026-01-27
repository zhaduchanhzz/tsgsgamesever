package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityRotateSignDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.RotateActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityQrywTaskPart extends AbstractActivityTaskPart {
   public void trigger() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo.id > 0 && activityInfo.open) {
         int day = this.getActivityDay();
         PlayerDao playerDao = this.player.getPlayerDao();
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         if (day > 0 && activityOpenTimeModel != null) {
            for(SevenDaysTaskModel sevenDaysTaskModel : this.getCurTaskList(day)) {
               super.createTask(sevenDaysTaskModel.getId());
            }

            this.sendInfo();
         } else {
            this.logger.error("七日任务活动->【{}】参与【{}】有误,当前天数【{}】", new Object[]{playerDao.playerName, activityInfo.id, day});
         }
      }
   }

   private List<SevenDaysTaskModel> getCurTaskList(int day) {
      PlayerDao playerDao = this.player.getPlayerDao();
      List<SevenDaysTaskModel> finalTasks = new ArrayList();
      List<SevenDaysTaskModel> taskModels = new ArrayList();

      for(SevenDaysTaskModel taskModel : super.getTaskModels()) {
         if (playerDao.lv >= taskModel.getLowLevel() && playerDao.lv <= taskModel.getMaxLevel()) {
            taskModels.add(taskModel);
         }
      }

      boolean isFirst = this.getTasksMap().isEmpty();

      for(SevenDaysTaskModel taskModel : taskModels) {
         if (isFirst) {
            if (taskModel.getTime() > day && taskModel.getTargetType() == 101) {
               continue;
            }
         } else if (taskModel.getTime() > day || taskModel.getTargetType() != 101) {
            continue;
         }

         finalTasks.add(taskModel);
      }

      return finalTasks;
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      RotateActivityMsg.S2C_QrywNotify_16146.Builder msg = RotateActivityMsg.S2C_QrywNotify_16146.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(taskData.toBuilder());
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_QRYW;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      RotateActivityMsg.S2C_QrywCommitTask_16144.Builder resp = RotateActivityMsg.S2C_QrywCommitTask_16144.newBuilder();
      resp.setTaskId(taskId);
      resp.setTaskPoint((Integer)MapUtil.getOrDefault(activityRotateSignDao.point, this.getActivityType(), 0));
      this.player.sendMsg(resp.build());
   }

   protected int rewardReason() {
      return 306;
   }

   protected int getActivityType() {
      return 48;
   }

   public void sendInfo() {
      RotateActivityMsg.S2C_Qryw_16140.Builder msg = RotateActivityMsg.S2C_Qryw_16140.newBuilder();
      ActivityInfo activityInfo = super.getPlayerActivityInfo();
      msg.setEndTime(activityInfo.end);
      int day = super.getActivityDay();

      for(TaskData taskData : this.getTasksMap().values()) {
         SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
         if (sevenDaysTaskModel != null) {
            if (taskData.state < 2) {
               super.checkComplete(taskData);
            }

            if (sevenDaysTaskModel.getTime() <= day) {
               msg.addTasks(taskData.toBuilder());
            }
         }
      }

      msg.setDay(day);
      ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      msg.addAllGotBoxIds((Iterable)MapUtil.getOrDefault(activityRotateSignDao.boxReward, this.getActivityType(), HashSet.class));
      msg.setTaskPoint((Integer)MapUtil.getOrDefault(activityRotateSignDao.point, this.getActivityType(), 0));
      this.player.sendMsg(msg.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel taskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void loginHandle() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo.id > 0 && activityInfo.open) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         if (activityOpenTimeModel != null) {
            Map<Integer, TaskData> taskDataMap = this.getTasksMap();
            if (taskDataMap.isEmpty()) {
               int day = this.getActivityDay();
               if (day <= 0) {
                  return;
               }

               PlayerDao playerDao = this.player.getPlayerDao();
               int createTaskModelCount = 0;
               List<SevenDaysTaskModel> finalTasks = this.getCurTaskList(day);
               createTaskModelCount += finalTasks.size();

               for(SevenDaysTaskModel sevenDaysTaskModel : finalTasks) {
                  super.createTask(sevenDaysTaskModel.getId());
               }

               this.logger.info("七日任务活动->【{}】参加【{}】,补发任务数量:{}", new Object[]{playerDao.playerName, activityOpenTimeModel.getTips(), createTaskModelCount});
            }

         }
      }
   }
}
