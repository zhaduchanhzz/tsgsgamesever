package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.LingLongBookPart;
import com.gzbz.db.LingLongBookDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.LingLongBookTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.LingLongBookMsg;
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
public class LingLongBookTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 16006;
   }

   protected int getActivityType() {
      return 116;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      LingLongBookTaskModel model = (LingLongBookTaskModel)ApplicationContextProvider.getModelPool().getEntity("LingLongBaojianTask", taskId);
      return (List<ResourceModel>)(model == null ? new ArrayList() : model.getRewards());
   }

   public void resetDaily() {
      this.trigger();
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         LingLongBookDao dao = this.getDao();
         boolean sendFlag = false;
         Map<Integer, Map<Integer, LingLongBookTaskModel>> taskModelMap = ApplicationContextProvider.<Integer, Map<Integer, LingLongBookTaskModel>>getModelPoolMap("customLingLongBookTask");

         for(Integer type : taskModelMap.keySet()) {
            if (!dao.taskGroup.containsKey(type)) {
               this.rotate(type);
            } else {
               if (type == 3 || (long)((TaskGroupData)dao.taskGroup.get(type)).end * 1000L >= System.currentTimeMillis()) {
                  continue;
               }

               this.rotate(type);
            }

            sendFlag = true;
         }

         if (sendFlag) {
            LingLongBookPart lingLongBookPart = (LingLongBookPart)this.player.getMgrPart(LingLongBookPart.class);
            lingLongBookPart.sendLingLongBookInfo();
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         LingLongBookMsg.S2C_LingLongBookTasks_28978.Builder builder = LingLongBookMsg.S2C_LingLongBookTasks_28978.newBuilder();

         for(TaskData taskData : taskDataList) {
            builder.addTask(this.buildTask(taskData));
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_LING_LONG_BOOK;
   }

   public TaskTargetItem getTargetItem(int taskId) {
      LingLongBookTaskModel model = (LingLongBookTaskModel)ApplicationContextProvider.getModelPool().getEntity("LingLongBaojianTask", taskId);
      return model == null ? null : new TaskTargetItem(model.getTargetType(), model.getTargetId(), model.getTargetValue());
   }

   public void commit(int taskId) {
      LingLongBookTaskModel taskModel = (LingLongBookTaskModel)ApplicationContextProvider.getModelPoolEntity("LingLongBaojianTask", taskId);
      if (taskModel == null) {
         this.logger.info("任务模块{},提交任务{}配置不存在 playerId:{}", new Object[]{this.getModule(), taskId, this.player.getPlayerId()});
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            LingLongBookPart lingLongBookPart = (LingLongBookPart)this.player.getMgrPart(LingLongBookPart.class);
            taskData.finish();
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 160, this.rewardReason(), taskId, 0, "");
            List<ResourceModel> resourceModels = new ArrayList();
            if (lingLongBookPart.checkUpgrade(resourceModels)) {
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_LING_LONG_BOOK_GIFT, 160, this.rewardReason(), 0, 0, "");
            } else {
               this.player.addResourceMsg(taskModel.getRewards());
               this.player.sendResourceMsg();
            }
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      LingLongBookMsg.S2C_LingLongBookTaskReward_28974.Builder builder = LingLongBookMsg.S2C_LingLongBookTaskReward_28974.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LingLongBookTaskReward_28973(LingLongBookMsg.C2S_LingLongBookTaskReward_28973 msg, String source) {
      this.commit(msg.getTaskId());
   }

   private void rotate(int type) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         if (activityInfo != null) {
            PlayerDao playerDao = this.player.getPlayerDao();
            LingLongBookDao dao = this.getDao();
            Map<Integer, Map<Integer, LingLongBookTaskModel>> typeModelMap = ApplicationContextProvider.<Integer, Map<Integer, LingLongBookTaskModel>>getModelPoolMap("customLingLongBookTask");
            Map<Integer, LingLongBookTaskModel> modelMap = (Map)typeModelMap.get(type);
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
                     this.logger.error("【玲珑宝典】 ->【{}】参与活动配置有误,未知的档位{}", playerDao.playerName, type);
                     return;
                  }

                  endTime = activityInfo.end;
               }

               Map<Integer, TaskGroupData> taskGroup = dao.taskGroup;

               for(LingLongBookTaskModel treasureTaskModel : modelMap.values()) {
                  TaskData taskData = this.getTask(treasureTaskModel.getId());
                  if (taskData != null) {
                     taskData.delete();
                  }
               }

               TaskGroupData taskGroupData = (TaskGroupData)MapUtil.computeIfAbsent(taskGroup, type, new TaskGroupData(type, 0));
               taskGroupData.group = type;
               taskGroupData.end = endTime;

               for(LingLongBookTaskModel taskModel : modelMap.values()) {
                  super.createTask(taskModel.getId());
               }

               dao.updateOp();
            }
         }
      }
   }

   private LingLongBookDao getDao() {
      LingLongBookDao dao = (LingLongBookDao)this.player.getData("tb_ling_long_book", this.player.getPlayerId());
      return dao;
   }

   public void deleteTasks() {
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         taskData.delete();
      }

   }
}
