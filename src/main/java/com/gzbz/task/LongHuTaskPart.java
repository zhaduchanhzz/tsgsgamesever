package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.part.LongHuPart;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.EastWarTaskModel;
import com.gzbz.model.LongHuTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.LongHuMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
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
public class LongHuTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 8225;
   }

   protected int getActivityType() {
      return 8002;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      List<ResourceModel> resourceModels = new ArrayList();
      LongHuTaskModel longHuTaskModel = (LongHuTaskModel)ApplicationContextProvider.getModelPoolEntity("LonghuTask", taskId);
      if (longHuTaskModel != null) {
         resourceModels.addAll(longHuTaskModel.getRewards());
      }

      return resourceModels;
   }

   public void trigger() {
      Map<Integer, Map<Integer, LongHuTaskModel>> modelMap = ApplicationContextProvider.<Integer, Map<Integer, LongHuTaskModel>>getModelPoolMap("customLonghuTask");
      if (modelMap != null && !modelMap.isEmpty()) {
         LongHuPart longHuPart = (LongHuPart)this.player.getMgrPart(LongHuPart.class);
         int activityDay = longHuPart.getSeverActivityDay();
         this.logger.info("合服活动第{}天", activityDay);
         long curTime = System.currentTimeMillis();
         long updateTime = this.player.getPlayerDao().updateTime;
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());

         for(LongHuTaskModel taskModel : ((Map)modelMap.get(3350)).values()) {
            if (taskModel.getTime() == 1 && taskModel.getDays() != activityDay) {
               TaskData taskData = this.getTask(taskModel.getId());
               if (taskData != null) {
                  taskData.delete();
               }
            } else {
               TaskData taskData = this.createTask(taskModel.getId());
               if (taskData != null && DateUtil.isSameDay(curTime, updateTime) && taskModel.getTargetType() == 510) {
                  taskData.tVal = playerRechargeDao.dailyRecharge;
                  taskData.updateOp();
                  this.checkComplete(taskData);
               }
            }
         }

      }
   }

   public void commit(int taskId) {
      LongHuTaskModel longHuTaskModel = (LongHuTaskModel)ApplicationContextProvider.getModelPoolEntity("LonghuTask", taskId);
      if (longHuTaskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else if (longHuTaskModel.getActId() != 3350) {
         this.logger.error("任务模块{},提交任务{}非本活动任务", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(longHuTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, this.rewardReason(), taskId, 0, "");
            String award = "";

            for(ResourceModel resourceModel : longHuTaskModel.getRewards()) {
               award = award + resourceModel.getId() + "-" + resourceModel.getValue() + ",";
            }

            EastWarTaskModel eastWarTaskModel = (EastWarTaskModel)ApplicationContextProvider.getModelPoolEntity("eastWarTask", taskId);
            if (eastWarTaskModel != null) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "龙虎庆典任务奖励", award, eastWarTaskModel.getTaskName(), 0, 0, 1);
            }
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         LongHuMsg.S2C_LongHuTaskNotify_19006.Builder builder = LongHuMsg.S2C_LongHuTaskNotify_19006.newBuilder();

         for(TaskData taskData : taskDataList) {
            builder.addTask(taskData.toBuilder());
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_LONG_HU;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      LongHuMsg.S2C_LongHuTaskCommit_19008.Builder builder = LongHuMsg.S2C_LongHuTaskCommit_19008.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      LongHuTaskModel longHuTaskModel = (LongHuTaskModel)ApplicationContextProvider.getModelPoolEntity("LonghuTask", taskId);
      return longHuTaskModel == null ? null : new TaskTargetItem(longHuTaskModel.getTargetType(), longHuTaskModel.getTargetId(), longHuTaskModel.getTargetNum());
   }
}
