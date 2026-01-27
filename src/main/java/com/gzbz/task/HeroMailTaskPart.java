package com.gzbz.task;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroMail.HeroMailPart;
import com.gzbz.model.HeroMailTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroMailTaskPart extends AbstractTaskPart {
   public TaskData addTask(int taskId) {
      return this.createTask(taskId);
   }

   public void delTask(int taskId) {
      TaskData taskData = this.getTask(taskId);
      if (taskData != null) {
         taskData.delete();
      }

   }

   public void trigger() {
   }

   public void commit(int taskId) {
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      HeroMailPart heroMailPart = (HeroMailPart)this.player.getMgrPart(HeroMailPart.class);
      heroMailPart.updateTask(taskDataList);
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_HERO_MAIL_TASK;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
   }

   public TaskTargetItem getTargetItem(int taskId) {
      HeroMailTaskModel model = (HeroMailTaskModel)ApplicationContextProvider.getModelPool().getEntity("heromailtask", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }
}
