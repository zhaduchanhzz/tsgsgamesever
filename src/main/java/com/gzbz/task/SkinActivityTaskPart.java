package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.ActivityHeroSkinData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.SkinActivityTaskGroupModel;
import com.gzbz.model.SkinActivityTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SkinActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
public class SkinActivityTaskPart extends AbstractActivityTaskPart {
   public void checkLogin() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map == null || map.isEmpty()) {
         this.trigger();
      }

   }

   public void checkResetDaily() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(this.getModule());
      this.trigger();
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_13651(SkinActivityMsg.C2S_CommitTask_13651 msg, String source) {
      this.logger.info("领取任务奖励={}", msg.getTaskId());
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_SkinAvtivityTasks_13653(SkinActivityMsg.C2S_SkinAvtivityTasks_13653 msg, String source) {
      this.taskList();
   }

   protected int rewardReason() {
      return 854;
   }

   protected int getActivityType() {
      return 19;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SkinActivityTaskModel skinActivityTaskModel = (SkinActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("skinActivityTask", taskId);
      if (skinActivityTaskModel == null) {
         this.logger.error("神鬼降临任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return skinActivityTaskModel.getRewards();
      }
   }

   public void trigger() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      if (!this.isServerActivityInvalid()) {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         ActivityHeroSkinData skinActivity = themeActivityDao.skinActivity;
         List<SkinActivityTaskGroupModel> activityTaskMap = (List)this.player.getGameModelPool().getEntity("customSkinActivityTaskGroup", activityInfo.id);
         if (activityTaskMap != null && !activityTaskMap.isEmpty()) {
            Map<Integer, List<SkinActivityTaskGroupModel>> tempGroupMap = new HashMap();

            for(SkinActivityTaskGroupModel skinActivityTaskGroupModel : activityTaskMap) {
               List<SkinActivityTaskGroupModel> tempList = (List)MapUtil.getOrDefault(tempGroupMap, skinActivityTaskGroupModel.getTaskGroup(), ArrayList.class);
               tempList.add(skinActivityTaskGroupModel);
               tempGroupMap.put(skinActivityTaskGroupModel.getTaskGroup(), tempList);
            }

            List<Integer> enableGroupIdList = new ArrayList();

            for(Map.Entry<Integer, List<SkinActivityTaskGroupModel>> entry : tempGroupMap.entrySet()) {
               if (!skinActivity.taskGroup.contains(entry.getKey())) {
                  enableGroupIdList.add(entry.getKey());
               }
            }

            this.logger.info("已经使用的任务组={}", skinActivity.taskGroup);
            if (!enableGroupIdList.isEmpty()) {
               Collections.shuffle(enableGroupIdList);
               int groupId = (Integer)enableGroupIdList.get(0);
               themeActivityDao.skinActivity.taskGroup.add(groupId);
               themeActivityDao.updateOp();

               for(SkinActivityTaskGroupModel task : (List)tempGroupMap.get(groupId)) {
                  super.createTask(task.getIncludeTaskId());
               }

            }
         } else {
            this.logger.info("英雄皮肤任务为空,活动ID={}", activityInfo.id);
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         SkinActivityMsg.S2C_UpdateTasks_13656.Builder builder = SkinActivityMsg.S2C_UpdateTasks_13656.newBuilder();

         for(TaskData taskData : taskDataList) {
            if (taskData != null) {
               builder.addTask(taskData.toBuilder());
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_SKIN_ACTIVITY_TASK;
   }

   public void commit(int taskId) {
      SkinActivityTaskModel model = (SkinActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("skinActivityTask", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            List<ResourceModel> resourceModelList = new ArrayList(this.getRewards(taskId));
            taskData.finish();
            this.player.addResource(resourceModelList, showType, 8, this.rewardReason(), 0, 0, "");
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      SkinActivityMsg.S2C_CommitTask_13652.Builder builder = SkinActivityMsg.S2C_CommitTask_13652.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public void taskList() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map != null && !map.isEmpty()) {
         SkinActivityMsg.S2C_SkinAvtivityTasks_13654.Builder builder = SkinActivityMsg.S2C_SkinAvtivityTasks_13654.newBuilder();

         for(Map.Entry<Integer, TaskData> entry : map.entrySet()) {
            builder.addTask(((TaskData)entry.getValue()).toBuilder());
         }

         this.player.sendMsg(builder.build());
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      SkinActivityTaskModel skinActivityTaskModel = (SkinActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("skinActivityTask", taskId);
      return skinActivityTaskModel != null && !skinActivityTaskModel.getTargets().isEmpty() ? new TaskTargetItem(((TaskTargetItem)skinActivityTaskModel.getTargets().get(0)).getTargetType(), ((TaskTargetItem)skinActivityTaskModel.getTargets().get(0)).getTargetId(), ((TaskTargetItem)skinActivityTaskModel.getTargets().get(0)).getTargetValue()) : null;
   }
}
