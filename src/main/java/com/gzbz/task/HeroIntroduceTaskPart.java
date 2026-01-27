package com.gzbz.task;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.HeroIntroduceModel;
import com.gzbz.model.HeroIntroduceTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroIntroduceMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroIntroduceTaskPart extends AbstractTaskPart {
   public Set<Integer> getOpeningGroup() {
      Set<Integer> groupSet = new HashSet();
      Map<Integer, HeroIntroduceModel> modelMap = ApplicationContextProvider.<Integer, HeroIntroduceModel>getModelPoolMap("herointroduce");

      for(HeroIntroduceModel model : modelMap.values()) {
         int startTime = DateUtil.getIntTime(DateUtil.getLongTime(model.getOpentime(), "yyyy-MM-dd HH:mm:ss"));
         if (DateUtil.getIntTime(System.currentTimeMillis()) >= startTime && DateUtil.getIntTime(System.currentTimeMillis()) < startTime + model.getDuration()) {
            groupSet.add(model.getGroup());
         }
      }

      return groupSet;
   }

   public void trigger() {
      if (this.player.isSystemOpen(3100)) {
         Set<Integer> groupSet = this.getOpeningGroup();
         Map<Integer, HeroIntroduceTaskModel> taskModelMap = ApplicationContextProvider.<Integer, HeroIntroduceTaskModel>getModelPoolMap("herointroducetask");

         for(HeroIntroduceTaskModel taskModel : taskModelMap.values()) {
            if (groupSet.contains(taskModel.getGroup())) {
               super.createTask(taskModel.getId());
            }
         }

      }
   }

   public void commit(int taskId) {
      HeroIntroduceTaskModel taskModel = (HeroIntroduceTaskModel)ApplicationContextProvider.getModelPool().getEntity("herointroducetask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            taskData.finish();
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 70, 7001, taskId, 0, "");
         }

         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         HeroIntroduceMsg.S2C_IntroduceTaskList_14302.Builder builder = HeroIntroduceMsg.S2C_IntroduceTaskList_14302.newBuilder();

         for(TaskData taskData : taskDataList) {
            CommonMsg.Task taskBuilder = this.buildTask(taskData);
            if (taskBuilder != null) {
               builder.addTaskList(taskBuilder);
            }
         }

         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);

         for(int group : this.getOpeningGroup()) {
            HeroIntroduceModel model = (HeroIntroduceModel)ApplicationContextProvider.getModelPoolEntity("herointroduce", group);
            if (model != null) {
               int state = playerExtend.heroIntroduce.contains(group) ? 1 : 0;
               HeroIntroduceMsg.SimpleInfo.Builder simpleInfo = HeroIntroduceMsg.SimpleInfo.newBuilder();
               simpleInfo.setGroupId(group);
               simpleInfo.setState(state);
               int startTime = DateUtil.getIntTime(DateUtil.getLongTime(model.getOpentime(), "yyyy-MM-dd HH:mm:ss"));
               simpleInfo.setEndTime(startTime + model.getDuration());
               builder.addSimpleInfo(simpleInfo);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_HERO_INTRODUCE_TASK;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      HeroIntroduceMsg.S2C_IntroduceTaskCommit_14304.Builder builder = HeroIntroduceMsg.S2C_IntroduceTaskCommit_14304.newBuilder();
      builder.setTaskId(taskId);
      this.player.sendMsg(builder.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      HeroIntroduceTaskModel model = (HeroIntroduceTaskModel)ApplicationContextProvider.getModelPoolEntity("herointroducetask", taskId);
      return model == null ? null : (model.getTargets().isEmpty() ? null : (TaskTargetItem)model.getTargets().get(0));
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      HeroIntroduceTaskModel taskModel = (HeroIntroduceTaskModel)ApplicationContextProvider.getModelPool().getEntity("herointroducetask", taskData.id);
      if (taskModel == null) {
         return null;
      } else {
         CommonMsg.Task.Builder task = CommonMsg.Task.newBuilder();
         task.setTaskNum(taskData.tVal);
         task.setTaskId(taskData.id);
         task.setState(CommonMsg.TaskState.forNumber(taskData.state));
         return task.build();
      }
   }

   public void loginHandle() {
      this.trigger();
   }

   public void resetHour() {
      this.trigger();
      boolean isChange = false;
      Map<Integer, HeroIntroduceModel> map = ApplicationContextProvider.<Integer, HeroIntroduceModel>getModelPoolMap("herointroduce");

      for(HeroIntroduceModel model : map.values()) {
         long startTime = DateUtil.getLongTime(model.getOpentime(), "yyyy-MM-dd HH:mm:ss");
         if (DateUtil.isSameHour(startTime)) {
            isChange = true;
            break;
         }
      }

      if (isChange) {
         this.sendIntroduceTasks();
      }

   }

   @MsgHandlerAnno
   public void C2S_IntroduceTaskList_14301(HeroIntroduceMsg.C2S_IntroduceTaskList_14301 msg, String source) {
      this.sendIntroduceTasks();
   }

   private void sendIntroduceTasks() {
      List<TaskData> taskDataList = new ArrayList();
      List<TaskData> invaildList = new ArrayList();
      Set<Integer> groupSet = this.getOpeningGroup();
      Map<Integer, TaskData> tasksMap = this.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         HeroIntroduceTaskModel taskModel = (HeroIntroduceTaskModel)ApplicationContextProvider.getModelPool().getEntity("herointroducetask", taskData.id);
         if (taskModel != null && groupSet.contains(taskModel.getGroup())) {
            taskDataList.add(taskData);
         } else {
            invaildList.add(taskData);
         }
      }

      for(TaskData taskData : invaildList) {
         taskData.delete();
      }

      this.sendTaskList(taskDataList);
   }

   @MsgHandlerAnno
   public void C2S_IntroduceTaskCommit_14303(HeroIntroduceMsg.C2S_IntroduceTaskCommit_14303 msg, String source) {
      this.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_GroupReward_14305(HeroIntroduceMsg.C2S_GroupReward_14305 msg, String source) {
      HeroIntroduceModel model = (HeroIntroduceModel)ApplicationContextProvider.getModelPoolEntity("herointroduce", msg.getGroupId());
      if (model == null) {
         this.logger.error("任务模块{},总奖励{}配置不存在", this.getModule(), msg.getGroupId());
      } else {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         if (playerExtend.heroIntroduce.contains(msg.getGroupId())) {
            this.player.failure(61117);
         } else {
            int count = 0;
            Map<Integer, TaskData> tasksMap = this.getTasksMap();

            for(TaskData taskData : tasksMap.values()) {
               HeroIntroduceTaskModel taskModel = (HeroIntroduceTaskModel)ApplicationContextProvider.getModelPoolEntity("herointroducetask", taskData.id);
               if (taskModel != null && taskModel.getGroup() == msg.getGroupId()) {
                  ++count;
                  if (taskData.state == 1) {
                     this.player.failure(61118);
                     return;
                  }
               }
            }

            if (count == 0) {
               this.logger.warn("任务模块{}, 该任务组{}一个任务都没有，不可领奖", this.getModule(), count);
            } else {
               playerExtend.heroIntroduce.add(msg.getGroupId());
               this.player.updatePlayerExtend(13);
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 70, 7001, msg.getGroupId(), 0, "");
               HeroIntroduceMsg.S2C_GroupReward_14306.Builder builder = HeroIntroduceMsg.S2C_GroupReward_14306.newBuilder();
               builder.setGroupId(model.getGroup());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }
}
