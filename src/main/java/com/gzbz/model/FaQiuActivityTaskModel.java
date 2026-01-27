package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuActiveTask"
)
public class FaQiuActivityTaskModel extends BaseModel {
   @ModelColumnAnno(
      comment = "任务id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "1每日重置 2活动期间不重置"
   )
   private int time;
   @ModelColumnAnno(
      comment = "任务类型"
   )
   private int taskType;
   @ModelColumnAnno(
      comment = "下一个任务"
   )
   private int nextTaskId;
   @ModelColumnAnno(
      comment = "日期组开始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组结束"
   )
   private int dateEnd;
   @ModelColumnAnno
   private int targetType;
   @ModelColumnAnno
   private int targetId;
   @ModelColumnAnno
   private int targetNum;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private final List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getTaskType() {
      return this.taskType;
   }

   public void setTaskType(int taskType) {
      this.checkModify();
      this.taskType = taskType;
   }

   public int getNextTaskId() {
      return this.nextTaskId;
   }

   public void setNextTaskId(int nextTaskId) {
      this.checkModify();
      this.nextTaskId = nextTaskId;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public void setTargetType(int targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public void setTargetId(int targetId) {
      this.checkModify();
      this.targetId = targetId;
   }

   public int getTargetNum() {
      return this.targetNum;
   }

   public void setTargetNum(int targetNum) {
      this.checkModify();
      this.targetNum = targetNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_ACT_FA_QIU.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }

   public boolean dayInRange(int activityOpenDay) {
      return activityOpenDay >= this.dateStart && activityOpenDay <= this.dateEnd || this.dateEnd == -1 && activityOpenDay >= this.dateStart;
   }
}
