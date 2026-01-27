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
   file = "YuanxiaoTask"
)
public class YuanXiaoTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int day;
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
   private int targetVal;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
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
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_YUAN_XIAO_2022.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }
}
