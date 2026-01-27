package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GreenPlumTaskGroupModel;
import com.gzbz.model.GreenPlumTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.GreenPlumMsg;
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
public class GreenPlumTaskPart extends AbstractActivityTaskPart {
   public void checkLogin() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map == null || map.isEmpty()) {
         this.trigger();
      }

   }

   public void checkResetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.greenPlumData.dailyReset();
      playerActivityDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(this.getModule());
      this.trigger();
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_13551(GreenPlumMsg.C2S_CommitTask_13551 msg, String source) {
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_GreenPlumTasks_13553(GreenPlumMsg.C2S_GreenPlumTasks_13553 msg, String source) {
      this.taskList();
   }

   protected int rewardReason() {
      return 850;
   }

   protected int getActivityType() {
      return 22;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      GreenPlumTaskModel greenPlumTaskModel = (GreenPlumTaskModel)ApplicationContextProvider.getModelPoolEntity("greenPlumTask", taskId);
      if (greenPlumTaskModel == null) {
         this.logger.error("青梅煮酒任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return greenPlumTaskModel.getRewards();
      }
   }

   public void trigger() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0) {
         if (activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Map<Integer, List<GreenPlumTaskGroupModel>> map = this.player.getGameModelPool().getMap("customGreenPlumTaskGroup");
            List<Integer> enableGroupIdList = new ArrayList();

            for(Map.Entry<Integer, List<GreenPlumTaskGroupModel>> entry : map.entrySet()) {
               if (!playerActivityDao.greenPlumData.taskGroup.contains(entry.getKey())) {
                  enableGroupIdList.add(entry.getKey());
               }
            }

            if (!enableGroupIdList.isEmpty()) {
               Collections.shuffle(enableGroupIdList);
               int groupId = (Integer)enableGroupIdList.get(0);
               playerActivityDao.greenPlumData.taskGroup.add(groupId);

               for(GreenPlumTaskGroupModel task : (List)map.get(groupId)) {
                  super.createTask(task.getIncludeTaskId());
               }

            }
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         GreenPlumMsg.S2C_UpdateTasks_13556.Builder builder = GreenPlumMsg.S2C_UpdateTasks_13556.newBuilder();

         for(TaskData taskData : taskDataList) {
            if (taskData != null) {
               builder.addTask(taskData.toBuilder());
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_GREEN_PLUM_ACTIVITY;
   }

   public void commit(int taskId) {
      GreenPlumTaskModel model = (GreenPlumTaskModel)ApplicationContextProvider.getModelPoolEntity("greenPlumTask", taskId);
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
            String award = "";

            for(ResourceModel resourceModel : resourceModelList) {
               award = award + resourceModel.getId() + "-" + resourceModel.getValue() + ",";
            }

            GreenPlumTaskModel greenPlumTaskModel = (GreenPlumTaskModel)ApplicationContextProvider.getModelPoolEntity("greenPlumTask", taskId);
            if (greenPlumTaskModel != null) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "青梅煮酒-任务", award, greenPlumTaskModel.getTaskName(), 0, 0, 1);
            }
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      GreenPlumMsg.S2C_CommitTask_13552.Builder builder = GreenPlumMsg.S2C_CommitTask_13552.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public void taskList() {
      Map<Integer, TaskData> map = this.getTasksMap();
      if (map != null && !map.isEmpty()) {
         GreenPlumMsg.S2C_GreenPlumTasks_13554.Builder builder = GreenPlumMsg.S2C_GreenPlumTasks_13554.newBuilder();

         for(Map.Entry<Integer, TaskData> entry : map.entrySet()) {
            builder.addTask(((TaskData)entry.getValue()).toBuilder());
         }

         this.player.sendMsg(builder.build());
      }

   }

   public TaskTargetItem getTargetItem(int taskId) {
      GreenPlumTaskModel greenPlumTaskModel = (GreenPlumTaskModel)ApplicationContextProvider.getModelPoolEntity("greenPlumTask", taskId);
      return greenPlumTaskModel != null && !greenPlumTaskModel.getTargets().isEmpty() ? new TaskTargetItem(((TaskTargetItem)greenPlumTaskModel.getTargets().get(0)).getTargetType(), ((TaskTargetItem)greenPlumTaskModel.getTargets().get(0)).getTargetId(), ((TaskTargetItem)greenPlumTaskModel.getTargets().get(0)).getTargetValue()) : null;
   }
}
