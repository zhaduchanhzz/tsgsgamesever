package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.FaQiuActivityTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.FaQiuMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FaQiuTaskPart extends AbstractActivityTaskPart {
   public static final int TASK_TYPE_MUL = 1;

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, FaQiuActivityTaskModel> taskModelMap = ApplicationContextProvider.<Integer, FaQiuActivityTaskModel>getModelPoolMap("FaQiuActiveTask");
         int activityOpenDay = this.getActivityOpenDay();
         taskModelMap.values().stream().filter((model) -> model.dayInRange(activityOpenDay)).forEach((model) -> this.createTask(model.getId()));
      }
   }

   protected int rewardReason() {
      return 13601;
   }

   protected int getActivityType() {
      return 97;
   }

   protected void sendInfo() {
      this.sendTaskList();
   }

   protected List<ResourceModel> getRewards(int taskId) {
      FaQiuActivityTaskModel taskModel = (FaQiuActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("FaQiuActiveTask", taskId);
      return (List<ResourceModel>)(taskModel == null ? new ArrayList() : taskModel.getRewards());
   }

   public void commit(int taskId) {
      FaQiuActivityTaskModel taskModel = (FaQiuActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("FaQiuActiveTask", taskId);
      if (taskModel == null) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            this.player.addResource(taskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
            taskData.finish();
         }

      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null) {
         this.player.sendMsg(FaQiuMsg.S2C_FaQiuCommitTask_23604.newBuilder().addAllTaskList(this.getTasks()).build());
      }
   }

   public List<ActivityMsg.TaskData> getTasks() {
      Collection<TaskData> values = this.getTasksMap().values();
      if (CollectionUtils.isEmpty(values)) {
         this.trigger();
         values = this.getTasksMap().values();
      }

      List<TaskData> collect = (List)values.stream().sorted(Comparator.comparingInt((o) -> o.id)).collect(Collectors.toList());
      ArrayList<ActivityMsg.TaskData> tasks = new ArrayList();
      List<Integer> noShowTaskIdList = new ArrayList();

      for(TaskData taskData : collect) {
         if (!noShowTaskIdList.contains(taskData.id)) {
            FaQiuActivityTaskModel taskModel = (FaQiuActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("FaQiuActiveTask", taskData.id);
            if (taskModel != null) {
               if (taskModel.getTaskType() == 1) {
                  if (taskData.state <= 2 || taskModel.getNextTaskId() <= 0) {
                     ActivityMsg.TaskData task = this.buildTask(taskData);
                     if (task != null) {
                        tasks.add(task);
                     }

                     FaQiuActivityTaskModel nextTaskModel;
                     for(int nextTaskId = taskModel.getNextTaskId(); nextTaskId > 0; nextTaskId = nextTaskModel.getNextTaskId()) {
                        nextTaskModel = (FaQiuActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("FaQiuActiveTask", nextTaskId);
                        if (null == nextTaskModel) {
                           this.logger.error("FaQiuActivityTask 配置有误 id:{}", nextTaskId);
                           break;
                        }

                        noShowTaskIdList.add(nextTaskId);
                     }
                  }
               } else {
                  ActivityMsg.TaskData task = this.buildTask(taskData);
                  if (task != null) {
                     tasks.add(task);
                  }
               }
            }
         }
      }

      return tasks;
   }

   public void loginHandle() {
      this.trigger();
   }

   public void sendTaskList() {
      this.sendTaskList(new ArrayList(this.getTasksMap().values()));
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_FA_QIU;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      FaQiuActivityTaskModel faQiuActivityTaskModel = (FaQiuActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("FaQiuActiveTask", taskId);
      return faQiuActivityTaskModel == null ? null : new TaskTargetItem(faQiuActivityTaskModel.getTargetType(), faQiuActivityTaskModel.getTargetId(), faQiuActivityTaskModel.getTargetNum());
   }
}
