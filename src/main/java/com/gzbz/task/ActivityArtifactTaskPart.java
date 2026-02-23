package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ArtifactGridTaskModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ArtifactActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityArtifactTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 6404;
   }

   protected int getActivityType() {
      return 21;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return (List<ResourceModel>)(sevenDaysTaskModel == null ? new ArrayList() : sevenDaysTaskModel.getRewards());
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         int day = this.getActivityDay();
         Map<Integer, TreeMap<Integer, ArtifactGridTaskModel>> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactGridTask", this.getPlayerActivityId());
         if (taskModelMap != null && !taskModelMap.isEmpty() && taskModelMap.get(day) != null) {
            for(ArtifactGridTaskModel artifactGridTaskModel : (taskModelMap.get(day)).values()) {
               this.createTask(artifactGridTaskModel.getTaskId());
            }

            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            if (day > themeActivityDao.artifactData.actDay) {
               themeActivityDao.artifactData.actDay = day;
               themeActivityDao.updateOp();
            }

         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      ArtifactActivityMsg.S2C_LineTaskNotify_13462.Builder msg = ArtifactActivityMsg.S2C_LineTaskNotify_13462.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ARTIFACT_ACTIVITY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ArtifactActivityMsg.S2C_LineTaskReward_13464.Builder msg = ArtifactActivityMsg.S2C_LineTaskReward_13464.newBuilder();
      msg.setTask(taskId);
      this.player.sendMsg(msg.build());
   }

   public void loginHandle() {
      this.trigger();
   }
}
