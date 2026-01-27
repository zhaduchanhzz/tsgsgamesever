package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.DragonBoatTaskGroupModel;
import com.gzbz.model.DragonBoatTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.DragonBoatMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.Collections;
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
public class DragonBoatTaskPart extends AbstractActivityTaskPart {
   public void loginHandle() {
      super.loginHandle();
      this.checkTasks();
   }

   public void checkTasks() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map == null || map.isEmpty()) {
         this.trigger();
      }

   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.dragonBoatData.freeDrinkNum = 0;
      playerActivityDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(this.getModule());
      this.trigger();
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_14011(DragonBoatMsg.C2S_CommitTask_14011 msg, String source) {
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_DragonBoatTasks_14013(DragonBoatMsg.C2S_DragonBoatTasks_14013 msg, String source) {
      this.taskList();
   }

   protected int rewardReason() {
      return 863;
   }

   protected int getActivityType() {
      return 27;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      DragonBoatTaskModel dragonBoatTaskModel = (DragonBoatTaskModel)ApplicationContextProvider.getModelPoolEntity("dragonBoatTask", taskId);
      if (dragonBoatTaskModel == null) {
         this.logger.error("端午活动任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return dragonBoatTaskModel.getRewards();
      }
   }

   public void trigger() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         if (activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Map<Integer, List<DragonBoatTaskGroupModel>> map = this.player.getGameModelPool().getMap("customDragonBoatTask");
            List<Integer> enableGroupIdList = new ArrayList();

            for(Map.Entry<Integer, List<DragonBoatTaskGroupModel>> entry : map.entrySet()) {
               if (!playerActivityDao.dragonBoatData.taskGroup.contains(entry.getKey())) {
                  enableGroupIdList.add(entry.getKey());
               }
            }

            if (!enableGroupIdList.isEmpty()) {
               Collections.shuffle(enableGroupIdList);
               int groupId = (Integer)enableGroupIdList.get(0);
               playerActivityDao.dragonBoatData.taskGroup.add(groupId);

               for(DragonBoatTaskGroupModel task : (List)map.get(groupId)) {
                  super.createTask(task.getIncludeTaskId());
               }

            }
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         DragonBoatMsg.S2C_UpdateTasks_14016.Builder builder = DragonBoatMsg.S2C_UpdateTasks_14016.newBuilder();

         for(TaskData taskData : taskDataList) {
            if (taskData != null) {
               builder.addTask(taskData.toBuilder());
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_DRAGON_BOAT_TASK;
   }

   public void commit(int taskId) {
      DragonBoatTaskModel model = (DragonBoatTaskModel)ApplicationContextProvider.getModelPoolEntity("dragonBoatTask", taskId);
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
      DragonBoatMsg.S2C_CommitTask_14012.Builder builder = DragonBoatMsg.S2C_CommitTask_14012.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public void taskList() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map != null && !map.isEmpty()) {
         DragonBoatMsg.S2C_DragonBoatTasks_14014.Builder builder = DragonBoatMsg.S2C_DragonBoatTasks_14014.newBuilder();

         for(Map.Entry<Integer, TaskData> entry : map.entrySet()) {
            builder.addTask(((TaskData)entry.getValue()).toBuilder());
         }

         this.player.sendMsg(builder.build());
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      DragonBoatTaskModel dragonBoatTaskModel = (DragonBoatTaskModel)ApplicationContextProvider.getModelPoolEntity("dragonBoatTask", taskId);
      return dragonBoatTaskModel != null && !dragonBoatTaskModel.getTargets().isEmpty() ? new TaskTargetItem(((TaskTargetItem)dragonBoatTaskModel.getTargets().get(0)).getTargetType(), ((TaskTargetItem)dragonBoatTaskModel.getTargets().get(0)).getTargetId(), ((TaskTargetItem)dragonBoatTaskModel.getTargets().get(0)).getTargetValue()) : null;
   }
}
