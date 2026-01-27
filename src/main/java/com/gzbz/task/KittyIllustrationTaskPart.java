package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.SpringIllustrationModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.KittyActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractActivityTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class KittyIllustrationTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 840;
   }

   protected int getActivityType() {
      return 43;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      if (sevenDaysTaskModel == null) {
         this.logger.error("万物复苏任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return new ArrayList(sevenDaysTaskModel.getRewards());
      }
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
         ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
         Map<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>>getModelPoolMap("cuistomSpringlllustration");
         Map<Integer, TreeMap<Integer, SpringIllustrationModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, ConcurrentHashMap.class);
         List<TaskData> taskList = new ArrayList();

         for(TreeMap<Integer, SpringIllustrationModel> springIllustrationModelTreeMap : activityDataModelMap.values()) {
            for(SpringIllustrationModel springIllustrationModel : springIllustrationModelTreeMap.values()) {
               TaskData taskData = this.createTask(springIllustrationModel.getTaskId());
               if (taskData != null) {
                  taskList.add(taskData);
               }
            }
         }

         this.sendTaskList(taskList);
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         KittyActivityMsg.S2C_IllustrationTasksNotify_15906.Builder msg = KittyActivityMsg.S2C_IllustrationTasksNotify_15906.newBuilder();

         for(TaskData taskData : taskDataList) {
            ActivityMsg.TaskData task = this.buildTask(taskData);
            if (task != null) {
               msg.addTask(task);
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_KITTY_ILLUSTRATION;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      KittyActivityMsg.S2C_IllustrationTaskCommit_15904.Builder resp = KittyActivityMsg.S2C_IllustrationTaskCommit_15904.newBuilder();
      resp.setTaskId(taskId);
      this.player.sendMsg(resp.build());
   }

   public void loginHandle() {
      this.trigger();
   }
}
