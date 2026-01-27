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
   file = "GodBeastTask"
)
public class GodBeastTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "目标类型"
   )
   private int targetType;
   @ModelColumnAnno(
      comment = "目标ID"
   )
   private int targetId;
   @ModelColumnAnno(
      comment = "目标数量"
   )
   private int targetValue;
   @ModelColumnAnno(
      comment = "任务名称"
   )
   private String taskName;
   @ModelColumnAnno(
      columnName = "score",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "完成任务获得积分"
   )
   private List<ResourceModel> score = new ArrayList();
   @ModelColumnAnno(
      comment = "周期内可获得积分上限"
   )
   private int totalLimit;

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_GOD_BEAST.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   public int getTargetValue() {
      return this.targetValue;
   }

   public void setTargetValue(int targetValue) {
      this.checkModify();
      this.targetValue = targetValue;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public void setTaskName(String taskName) {
      this.checkModify();
      this.taskName = taskName;
   }

   public List<ResourceModel> getScore() {
      return this.score;
   }

   public void setScore(List<ResourceModel> score) {
      this.checkModify();
      this.score = score;
   }

   public int getTotalLimit() {
      return this.totalLimit;
   }

   public void setTotalLimit(int totalLimit) {
      this.checkModify();
      this.totalLimit = totalLimit;
   }
}
