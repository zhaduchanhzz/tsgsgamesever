package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ArtifactGridTaskNewestModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
import com.gzbz.protobuf.ArtifactSkinActivityMsg;
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
public class ActivityArtifactSkinTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 6404;
   }

   protected int getActivityType() {
      return 81;
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
         Map<Integer, TreeMap<Integer, ArtifactGridTaskNewestModel>> taskModelMap = ActivityOpenServerTimeBaseModel.getModelMap("customArtifactGridTaskNewest", this.getActivityOpenDay());
         if (taskModelMap.containsKey(day)) {
            for(ArtifactGridTaskNewestModel artifactGridTaskModel : ((TreeMap)taskModelMap.get(day)).values()) {
               this.createTask(artifactGridTaskModel.getTaskId());
            }

            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            if (day > themeActivityDao.artifactSkinData.actDay) {
               themeActivityDao.artifactSkinData.actDay = day;
               themeActivityDao.updateOp();
            }

         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.Builder msg = ArtifactSkinActivityMsg.S2C_LineTaskNotify_20724.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ARTIFACT_SKIN_ACTIVITY;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ArtifactSkinActivityMsg.S2C_LineTaskReward_20726.Builder msg = ArtifactSkinActivityMsg.S2C_LineTaskReward_20726.newBuilder();
      msg.setTask(taskId);
      this.player.sendMsg(msg.build());
   }

   public void loginHandle() {
      this.trigger();
   }
}
