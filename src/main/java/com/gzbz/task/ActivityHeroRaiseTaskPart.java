package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.HeroRaisePart;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.TaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityHeroRaiseTaskPart extends AbstractActivityTaskPart {
   @Autowired
   private ActivityMgr activityMgr;

   public void sendInfo() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      PlayerDao playerDao = this.player.getPlayerDao();
      ActivityMsg.S2C_HeroRiseInfo_6766.Builder msg = ActivityMsg.S2C_HeroRiseInfo_6766.newBuilder();
      msg.setIntegral(playerDao.hero_raise_integral);
      msg.setLevel(playerActivityDao.heroRise.level);
      msg.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      msg.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskGroup = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customHeroRiseSharplyTask");
      Map<Integer, TaskData> taskDataMap = this.getTasksMap();

      for(Map.Entry<Integer, TaskGroupData> entry : playerActivityDao.heroRise.taskStepGroup.entrySet()) {
         ActivityMsg.HeroRiseTaskGroupData.Builder taskGroupBuilder = ActivityMsg.HeroRiseTaskGroupData.newBuilder();
         taskGroupBuilder.setStepId((Integer)entry.getKey());
         taskGroupBuilder.setEndTime(((TaskGroupData)entry.getValue()).end);
         TreeMap<Integer, Set<Integer>> taskGroupMap = (TreeMap)allTaskGroup.get(entry.getKey());
         if (taskGroupMap != null && taskGroupMap.containsKey(((TaskGroupData)entry.getValue()).group)) {
            Set<Integer> tasks = (Set)MapUtil.getOrDefault(taskGroupMap, ((TaskGroupData)entry.getValue()).group, HashSet.class);

            for(TaskData taskData : taskDataMap.values()) {
               if (tasks.contains(taskData.id)) {
                  taskGroupBuilder.addTask(this.buildTask(taskData));
               }
            }
         }

         msg.addTaskGroupData(taskGroupBuilder);
      }

      msg.setBuyIntegral(playerActivityDao.heroRise.buyIntegral);
      msg.setBuyLv(playerActivityDao.heroRise.buyLevel);
      this.player.sendMsg(msg.build());
   }

   protected List<ResourceModel> getRewards(int taskId) {
      TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   protected int rewardReason() {
      return 815;
   }

   public int getActivityType() {
      return 8;
   }

   public void resetDaily() {
      this.trigger();
   }

   public void trigger() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, TaskGroupData> taskStepGroup = playerActivityDao.heroRise.taskStepGroup;
      if (!this.isServerActivityInvalid()) {
         boolean sendFlag = false;
         Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskGroup = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customHeroRiseSharplyTask");

         for(Integer stepId : allTaskGroup.keySet()) {
            if (!taskStepGroup.containsKey(stepId)) {
               this.rotate(stepId);
            } else {
               if (stepId == 3 || (long)((TaskGroupData)taskStepGroup.get(stepId)).end * 1000L >= System.currentTimeMillis()) {
                  continue;
               }

               this.rotate(stepId);
            }

            sendFlag = true;
         }

         if (sendFlag) {
            this.sendInfo();
         }

      }
   }

   public void rotate(int stepId) {
      ActivityInfo activityInfo = this.activityMgr.getActivityInfo(this.getActivityType());
      if (activityInfo != null) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         PlayerDao playerDao = this.player.getPlayerDao();
         if (activityOpenTimeModel == null) {
            this.logger.error("群雄崛起->【{}】参与【{}】有误", playerDao.playerName, activityInfo.id);
         } else {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            Map<Integer, TaskGroupData> taskStepGroup = playerActivityDao.heroRise.taskStepGroup;
            Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskGroup = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customHeroRiseSharplyTask");
            TreeMap<Integer, Set<Integer>> taskGroupMap = (TreeMap)allTaskGroup.get(stepId);
            if (taskGroupMap != null && !taskGroupMap.isEmpty()) {
               int difDay = DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L));
               int dailyEnd = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(System.currentTimeMillis()));
               int weekEnd = DateUtil.getIntTime(DateUtil.getSomeDayEndTime((long)activityInfo.start * 1000L + (long)(difDay + 7 - 1) * 86400000L));
               int endTime;
               if (stepId == 1) {
                  endTime = dailyEnd;
               } else if (stepId == 2) {
                  endTime = weekEnd;
               } else {
                  if (stepId != 3) {
                     this.logger.error("群雄崛起->【{}】参与【{}】有误,未知的档位{}", new Object[]{playerDao.playerName, activityOpenTimeModel.getTips(), stepId});
                     return;
                  }

                  endTime = activityInfo.end;
               }

               TaskGroupData taskGroup = (TaskGroupData)MapUtil.computeIfAbsent(taskStepGroup, stepId, new TaskGroupData((Integer)taskGroupMap.firstKey(), 0));

               for(Set<Integer> taskSet : taskGroupMap.values()) {
                  for(int taskId : taskSet) {
                     TaskData taskData = this.getTask(taskId);
                     if (taskData != null) {
                        taskData.delete();
                     }
                  }
               }

               if (taskGroup.end == 0) {
                  taskGroup.group = (Integer)taskGroupMap.firstKey();
               } else {
                  taskGroup.group = taskGroup.group >= (Integer)taskGroupMap.lastKey() ? (Integer)taskGroupMap.firstKey() : taskGroup.group + 1;
               }

               taskGroup.end = endTime;

               for(int taskId : (Set)MapUtil.getOrDefault(taskGroupMap, taskGroup.group, HashSet.class)) {
                  super.createTask(taskId);
               }

               playerActivityDao.updateOp();
            } else {
               this.logger.error("群雄崛起->【{}】参与【{}】有误,没有档位{}的任务分组", new Object[]{playerDao.playerName, activityOpenTimeModel.getTips(), stepId});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroRiseTaskReward_6769(ActivityMsg.C2S_HeroRiseTaskReward_6769 msg, String source) {
      int taskId = msg.getTaskId();
      this.commit(taskId);
   }

   public void commit(int taskId) {
      TaskModel model = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskId);
      if (model == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            PlayerDao playerDao = this.player.getPlayerDao();
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            int totalIntegral = 0;

            for(ResourceModel resourceModel : model.getRewards()) {
               if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL) {
                  totalIntegral += resourceModel.getValue();
               }
            }

            if (totalIntegral > 0) {
               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               HeroRaisePart heroRaisePart = (HeroRaisePart)this.player.getMgrPart(HeroRaisePart.class);
               int upgradeNeed = heroRaisePart.getLevelModel(playerActivityDao.heroRise.level).getIntegral();
               if (playerDao.hero_raise_integral + totalIntegral >= upgradeNeed) {
                  showType = PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
               }
            }

            this.player.addResource(model.getRewards(), showType, 3, this.rewardReason(), taskId, 0, "");
            taskData.finish();
            this.sendInfo();
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      ActivityMsg.S2C_HeroRiseTasks_6768.Builder msg = ActivityMsg.S2C_HeroRiseTasks_6768.newBuilder();

      for(TaskData taskData : taskDataList) {
         msg.addTask(this.buildTask(taskData));
      }

      this.player.sendMsg(msg.build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACTIVITY_HERO_RAISE;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityMsg.S2C_HeroRiseTaskReward_6770.Builder resp = ActivityMsg.S2C_HeroRiseTaskReward_6770.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      TaskModel taskModel = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskId);
      return taskModel == null ? null : new TaskTargetItem(((TaskTargetItem)taskModel.getTargets().get(0)).getTargetType(), ((TaskTargetItem)taskModel.getTargets().get(0)).getTargetId(), ((TaskTargetItem)taskModel.getTargets().get(0)).getTargetValue());
   }
}
