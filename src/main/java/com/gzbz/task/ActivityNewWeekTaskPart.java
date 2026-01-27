package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.ActivityNewWeekPart;
import com.gzbz.db.ActivityNewWeekDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.NewWeekTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityNewWeekMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractFunctionTaskPart;
import com.gzbz.util.TempUtil;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityNewWeekTaskPart extends AbstractFunctionTaskPart {
   protected int rewardReason() {
      return 15106;
   }

   protected int getActivityType() {
      return 111;
   }

   public void resetDaily() {
      this.trigger();
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         ActivityNewWeekPart part = (ActivityNewWeekPart)this.player.getMgrPart(ActivityNewWeekPart.class);
         ActivityNewWeekDao dao = part.getDao();
         boolean sendFlag = false;
         Map<Integer, Map<Integer, NewWeekTaskModel>> taskModelMap = ApplicationContextProvider.<Integer, Map<Integer, NewWeekTaskModel>>getModelPoolMap("cNewWeekTask");

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
            part.sendTreasureInfo();
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.Builder builder = ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.newBuilder();

         for(TaskData taskData : taskDataList) {
            builder.addTask(this.buildTask(taskData));
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_NEW_WEEK;
   }

   public void commit(int taskId) {
      NewWeekTaskModel taskModel = (NewWeekTaskModel)ApplicationContextProvider.getModelPoolEntity("NewWeekTask", taskId);
      if (taskModel == null) {
         this.logger.info("任务模块{},提交任务{}配置不存在 playerId:{}", new Object[]{this.getModule(), taskId, this.player.getPlayerId()});
      } else {
         TaskData taskData = this.getTask(taskId);
         ActivityNewWeekPart part = (ActivityNewWeekPart)this.player.getMgrPart(ActivityNewWeekPart.class);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 151, this.rewardReason(), taskId, 0, "");
            List<ResourceModel> resourceModels = new ArrayList();
            if (part.checkUpgrade(resourceModels)) {
               this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_NEW_WEEK, 151, this.rewardReason(), 0, 0, "");
            } else {
               this.player.addResourceMsg(taskModel.getRewards());
               this.player.sendResourceMsg();
            }
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityNewWeekMsg.S2C_NewWeekReward_25105.Builder builder = ActivityNewWeekMsg.S2C_NewWeekReward_25105.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_NewWeekReward_25104(ActivityNewWeekMsg.C2S_NewWeekReward_25104 msg, String source) {
      this.commit(msg.getTaskId());
   }

   private void rotate(int type) {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         if (activityInfo != null) {
            PlayerDao playerDao = this.player.getPlayerDao();
            ActivityNewWeekPart part = (ActivityNewWeekPart)this.player.getMgrPart(ActivityNewWeekPart.class);
            ActivityNewWeekDao dao = part.getDao();
            Map<Integer, Map<Integer, NewWeekTaskModel>> typeModelMap = ApplicationContextProvider.<Integer, Map<Integer, NewWeekTaskModel>>getModelPoolMap("cNewWeekTask");
            Map<Integer, NewWeekTaskModel> modelMap = (Map)typeModelMap.get(type);
            if (modelMap != null && modelMap.size() != 0) {
               int difDay = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L));
               int dailyEnd = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(System.currentTimeMillis()));
               int endTime;
               if (type != 1 && type != 2) {
                  if (type != 3) {
                     this.logger.error("【周年庆琉璃宝鉴】 ->【{}】参与活动配置有误,未知的档位{}", playerDao.playerName, type);
                     return;
                  }

                  endTime = activityInfo.end;
               } else {
                  endTime = dailyEnd;
               }

               Map<Integer, TaskGroupData> taskGroup = dao.treasureTaskGroup;

               for(NewWeekTaskModel newWeekTaskModel : modelMap.values()) {
                  TaskData taskData = this.getTask(newWeekTaskModel.getTaskId());
                  if (taskData != null) {
                     taskData.delete();
                  }
               }

               TaskGroupData taskGroupData = (TaskGroupData)MapUtil.computeIfAbsent(taskGroup, type, new TaskGroupData(type, 0));
               taskGroupData.group = type;
               taskGroupData.end = endTime;
               if (type == 2) {
                  List<NewWeekTaskModel> list = (List)modelMap.values().stream().filter((m) -> playerDao.lv >= m.getLowLevel() && playerDao.lv <= m.getMaxLevel()).collect(Collectors.toList());

                  for(NewWeekTaskModel newWeekTaskModel : TempUtil.getLotForCollection(list, 4, false)) {
                     this.createTask(newWeekTaskModel.getTaskId());
                  }
               } else {
                  for(NewWeekTaskModel newWeekTaskModel : modelMap.values()) {
                     this.createTask(newWeekTaskModel.getTaskId());
                  }
               }

               dao.updateOp();
            }
         }
      }
   }

   public void deleteTasks() {
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         taskData.delete();
      }

   }
}
