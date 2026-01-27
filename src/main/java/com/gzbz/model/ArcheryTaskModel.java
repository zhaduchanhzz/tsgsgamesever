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
   file = "archeryTask"
)
public class ArcheryTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id",
      columnName = "id"
   )
   private int taskId;
   @ModelColumnAnno(
      comment = "任务描述",
      columnName = "taskDesc"
   )
   private String taskDesc;
   @ModelColumnAnno(
      comment = "任务目标类型",
      columnName = "targetType"
   )
   private int targetType;
   @ModelColumnAnno(
      comment = "任务目标id",
      columnName = "targetId"
   )
   private int targetId;
   @ModelColumnAnno(
      comment = "任务目标值",
      columnName = "targetVal"
   )
   private int targetVal;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getTaskId() {
      return this.taskId;
   }

   public void setTaskId(int taskId) {
      this.checkModify();
      this.taskId = taskId;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
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

   public int getTargetVal() {
      return this.targetVal;
   }

   public void setTargetVal(int targetVal) {
      this.checkModify();
      this.targetVal = targetVal;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_TONG_QUE_ARCHERY_DAILY.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getTaskId());
   }
}
