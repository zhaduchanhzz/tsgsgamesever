package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityThanksgivingDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GanenTaskModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ThanksgivingDayMsg;
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

@Scope("prototype")
@Component
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ThanksgivingDayTaskPart extends AbstractActivityTaskPart {
   protected int rewardReason() {
      return 8203;
   }

   protected int getActivityType() {
      return 55;
   }

   protected void sendInfo() {
   }

   protected List<ResourceModel> getRewards(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      if (sevenDaysTaskModel == null) {
         this.logger.error("感恩节活动任务:{}配置不存在", taskId);
         return new ArrayList();
      } else {
         return new ArrayList(sevenDaysTaskModel.getRewards());
      }
   }

   public void trigger() {
      if (!this.isServerActivityInvalid()) {
         ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
         ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
         Map<Integer, Map<Integer, TreeMap<Integer, GanenTaskModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, GanenTaskModel>>>getModelPoolMap("customGanenlllustration");
         Map<Integer, TreeMap<Integer, GanenTaskModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, ConcurrentHashMap.class);
         List<TaskData> taskList = new ArrayList();

         for(TreeMap<Integer, GanenTaskModel> ganenTaskModelTreeMap : activityDataModelMap.values()) {
            for(GanenTaskModel ganenTaskModel : ganenTaskModelTreeMap.values()) {
               TaskData taskData = this.createTask(ganenTaskModel.getTaskId());
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
         ThanksgivingDayMsg.S2C_TaskNotify_17010.Builder msg = ThanksgivingDayMsg.S2C_TaskNotify_17010.newBuilder();

         for(TaskData taskData : taskDataList) {
            msg.addTask(taskData.toBuilder());
         }

         this.player.sendMsg(msg.build());
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ACT_THANKSGIVING;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      ActivityThanksgivingDao activityThanksgivingDao = (ActivityThanksgivingDao)this.player.getData("tb_activity_thanksgiving", this.player.getPlayerId());
      ThanksgivingDayMsg.S2C_TaskCommit_17008.Builder resp = ThanksgivingDayMsg.S2C_TaskCommit_17008.newBuilder();
      resp.setTaskId(taskId);
      resp.setTaskPoint(activityThanksgivingDao.taskPoint);
      this.player.sendMsg(resp.build());
   }

   public void loginHandle() {
      this.trigger();
   }
}
