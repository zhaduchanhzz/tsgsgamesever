package com.gzbz.model.manager;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelColumnAnno;

public abstract class BaseTaskModel extends BaseModel {
   @ModelColumnAnno(
      comment = "任务id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int targetType;
   @ModelColumnAnno
   private int targetId;
   @ModelColumnAnno
   private int targetValue;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private final List<ResourceModel> rewards = new ArrayList();

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(this.module().moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.targetType, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.targetId, (v) -> new ConcurrentHashSet())).add(this.id);
   }

   protected abstract TaskDefine.TaskModule module();

   public int getTaskId() {
      return this.id;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public int getTargetValue() {
      return this.targetValue;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }
}
