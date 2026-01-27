package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
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
   file = "unionWarTask"
)
public class UnionWarTaskModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "taskName",
      comment = "任务标题"
   )
   private String taskName;
   @ModelColumnAnno(
      columnName = "taskDesc",
      comment = "任务描述"
   )
   private String taskDesc;
   @ModelColumnAnno(
      columnName = "needLevel",
      comment = "需求等级"
   )
   private int needLevel;
   @ModelColumnAnno(
      columnName = "lvLimit",
      comment = "最高等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      columnName = "taskType",
      comment = "任务类型"
   )
   private int taskType;
   @ModelColumnAnno(
      columnName = "subType",
      comment = "任务副类型"
   )
   private int subType;
   @ModelColumnAnno(
      columnName = "nextTask",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "触发任务"
   )
   private List<Integer> nextTask;
   @ModelColumnAnno(
      columnName = "ToSystemFunId",
      comment = "前往系统id"
   )
   private int ToSystemFunId;
   @ModelColumnAnno(
      columnName = "targets",
      columnConvertType = 1,
      subCls = TaskTargetItem.class,
      count = 3,
      comment = "目标"
   )
   private List<TaskTargetItem> targets = new ArrayList();
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "prioriy",
      comment = "排序优先级"
   )
   private int prioriy;

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_UNION_WAR.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTargets().get(0)).getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTargets().get(0)).getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public void setTaskName(String taskName) {
      this.checkModify();
      this.taskName = taskName;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
   }

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public int getTaskType() {
      return this.taskType;
   }

   public void setTaskType(int taskType) {
      this.checkModify();
      this.taskType = taskType;
   }

   public int getSubType() {
      return this.subType;
   }

   public void setSubType(int subType) {
      this.checkModify();
      this.subType = subType;
   }

   public List<Integer> getNextTask() {
      return this.nextTask;
   }

   public void setNextTask(List<Integer> nextTask) {
      this.checkModify();
      this.nextTask = nextTask;
   }

   public int getToSystemFunId() {
      return this.ToSystemFunId;
   }

   public void setToSystemFunId(int ToSystemFunId) {
      this.checkModify();
      this.ToSystemFunId = ToSystemFunId;
   }

   public List<TaskTargetItem> getTargets() {
      return this.targets;
   }

   public void setTargets(List<TaskTargetItem> targets) {
      this.checkModify();
      this.targets = targets;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getPrioriy() {
      return this.prioriy;
   }

   public void setPrioriy(int prioriy) {
      this.checkModify();
      this.prioriy = prioriy;
   }
}
