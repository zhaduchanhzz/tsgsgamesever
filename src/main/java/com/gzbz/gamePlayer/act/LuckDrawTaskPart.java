package com.gzbz.gamePlayer.act;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.LuckyDrawModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
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
public class LuckDrawTaskPart extends AbstractTaskPart {
   public void trigger() {
      this.logger.info("玩家达到幸运十连抽等级，初始化十连抽任务，时间={}", DateUtil.transferLongToDate());
      Map<Integer, LuckyDrawModel> luckyDrawModelMap = this.player.getGameModelPool().getMap("luckyDraw");

      for(Map.Entry<Integer, LuckyDrawModel> entry : luckyDrawModelMap.entrySet()) {
         super.createTask((Integer)entry.getKey());
      }

   }

   public void commit(int taskId) {
      LuckyDrawModel model = (LuckyDrawModel)ApplicationContextProvider.getModelPool().getEntity("luckyDraw", taskId);
      if (model == null) {
         this.player.failure(0);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (taskData == null) {
            this.player.failure(0);
         } else {
            this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      LuckDrawPart luckDrawPart = (LuckDrawPart)this.player.getMgrPart(LuckDrawPart.class);
      luckDrawPart.updateTask(taskDataList);
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_LUCK_DRAW;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      LuckDrawPart luckDrawPart = (LuckDrawPart)this.player.getMgrPart(LuckDrawPart.class);
      luckDrawPart.takeSuccess(taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      LuckyDrawModel model = (LuckyDrawModel)ApplicationContextProvider.getModelPool().getEntity("luckyDraw", taskId);
      TaskTargetItem taskTargetItem = new TaskTargetItem();
      taskTargetItem.setTargetId(model.getTargetId());
      taskTargetItem.setTargetType(model.getTargetType());
      taskTargetItem.setTargetValue(model.getTargetNum());
      return taskTargetItem;
   }

   public void deleteTask() {
      Map<Integer, TaskData> tasks = this.getTasksMap();

      for(Map.Entry<Integer, TaskData> taskDaoEntry : tasks.entrySet()) {
         ((TaskData)taskDaoEntry.getValue()).delete();
      }

   }
}
