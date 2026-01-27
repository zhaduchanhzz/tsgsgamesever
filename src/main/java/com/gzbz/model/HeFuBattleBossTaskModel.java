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
   file = "HefuBattleTask"
)
public class HeFuBattleBossTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String taskName;
   @ModelColumnAnno(
      comment = "目标类型"
   )
   private int targetType;
   @ModelColumnAnno(
      comment = "目标id"
   )
   private int targetId;
   @ModelColumnAnno(
      comment = "目标数量"
   )
   private int targetNum;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_MERGEWAR_BOSS.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
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

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
