package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.db.ActivityAnniversaryCelebrationDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.FirstYearTreasureTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityAnniversaryCelebrationMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FirstYearTreasureTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 12611;
   }

   protected int getActivityType() {
      return 91;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      FirstYearTreasureTaskModel model = (FirstYearTreasureTaskModel)ApplicationContextProvider.getModelPool().getEntity("FirstYearBaojianTask", taskId);
      return (List<ResourceModel>)(model == null ? new ArrayList() : model.getRewards());
   }

   public void resetDaily() {
      this.trigger();
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         ActivityAnniversaryCelebrationDao dao = this.getDao();
         boolean sendFlag = false;
         Map<Integer, Map<Integer, FirstYearTreasureTaskModel>> taskModelMap = ApplicationContextProvider.<Integer, Map<Integer, FirstYearTreasureTaskModel>>getModelPoolMap("customFirstYearBaojianTask");

         for(Integer type : taskModelMap.keySet()) {
            if (!dao.treasureTaskGroup.containsKey(type)) {
               this.rotate(type);
            } else {
               if (type == 3 || (long)((TaskGroupData)dao.treasureTaskGroup.get(type)).end * 1000L >= System.currentTimeMillis()) {
                  continue;
               }

               this.rotate(type);
            }

            sendFlag = true;
         }

         if (sendFlag) {
            AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
            anniversaryCelebrationPart.sendTreasureInfo();
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ActivityAnniversaryCelebrationMsg.S2C_HeroRiseTasks_22074.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_HeroRiseTasks_22074.newBuilder();

         for(TaskData taskData : taskDataList) {
            builder.addTask(this.buildTask(taskData));
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_FIRST_YEAR_TREASURE;
   }

   public TaskTargetItem getTargetItem(int taskId) {
      FirstYearTreasureTaskModel model = (FirstYearTreasureTaskModel)ApplicationContextProvider.getModelPool().getEntity("FirstYearBaojianTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetValue());
   }

   public void commit(int taskId) {
      FirstYearTreasureTaskModel taskModel = (FirstYearTreasureTaskModel)ApplicationContextProvider.getModelPoolEntity("FirstYearBaojianTask", taskId);
      if (taskModel == null) {
         this.logger.info("任务模块{},提交任务{}配置不存在 playerId:{}", new Object[]{this.getModule(), taskId, this.player.getPlayerId()});
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
            taskData.finish();
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 126, this.rewardReason(), taskId, 0, "");
            List<ResourceModel> resourceModels = new ArrayList();
            if (anniversaryCelebrationPart.checkUpgrade(resourceModels)) {
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_FIRST_YEAR_ACTIVITY_TREASURE_GIFT, 126, this.rewardReason(), 0, 0, "");
            } else {
               this.player.addResourceMsg(taskModel.getRewards());
               this.player.sendResourceMsg();
            }
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityAnniversaryCelebrationMsg.S2C_TreasureTaskReward_22076.Builder builder = ActivityAnniversaryCelebrationMsg.S2C_TreasureTaskReward_22076.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TreasureTaskReward_22075(ActivityAnniversaryCelebrationMsg.C2S_TreasureTaskReward_22075 msg, String source) {
      this.commit(msg.getTaskId());
   }

   private void rotate(int type) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         if (activityInfo != null) {
            PlayerDao playerDao = this.player.getPlayerDao();
            ActivityAnniversaryCelebrationDao dao = this.getDao();
            Map<Integer, Map<Integer, FirstYearTreasureTaskModel>> typeModelMap = ApplicationContextProvider.<Integer, Map<Integer, FirstYearTreasureTaskModel>>getModelPoolMap("customFirstYearBaojianTask");
            Map<Integer, FirstYearTreasureTaskModel> modelMap = (Map)typeModelMap.get(type);
            if (modelMap != null && modelMap.size() != 0) {
               int difDay = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L));
               int dailyEnd = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(System.currentTimeMillis()));
               int weekEnd = DateUtil.getIntTime(DateUtil.getSomeDayEndTime((long)activityInfo.start * 1000L + (long)(difDay + 7 - 1) * 86400000L));
               int endTime;
               if (type == 1) {
                  endTime = dailyEnd;
               } else if (type == 2) {
                  endTime = weekEnd;
               } else {
                  if (type != 3) {
                     this.logger.error("【周年庆琉璃宝鉴】 ->【{}】参与活动配置有误,未知的档位{}", playerDao.playerName, type);
                     return;
                  }

                  endTime = activityInfo.end;
               }

               Map<Integer, TaskGroupData> taskGroup = dao.treasureTaskGroup;

               for(FirstYearTreasureTaskModel treasureTaskModel : modelMap.values()) {
                  TaskData taskData = this.getTask(treasureTaskModel.getId());
                  if (taskData != null) {
                     taskData.delete();
                  }
               }

               TaskGroupData taskGroupData = (TaskGroupData)MapUtil.computeIfAbsent(taskGroup, type, new TaskGroupData(type, 0));
               taskGroupData.group = type;
               taskGroupData.end = endTime;

               for(FirstYearTreasureTaskModel treasureTaskModel : modelMap.values()) {
                  super.createTask(treasureTaskModel.getId());
               }

               dao.updateOp();
            }
         }
      }
   }

   private ActivityAnniversaryCelebrationDao getDao() {
      ActivityAnniversaryCelebrationDao dao = (ActivityAnniversaryCelebrationDao)this.player.getData("tb_activity_anniversary_celebration", this.player.getPlayerId());
      return dao;
   }

   public void deleteTasks() {
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         taskData.delete();
      }

   }
}
