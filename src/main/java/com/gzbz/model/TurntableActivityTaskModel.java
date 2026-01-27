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
   file = "krTurntableTask"
)
public class TurntableActivityTaskModel extends BaseModel {
   @ModelColumnAnno(
      comment = "任务id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "每日重置1是 2否"
   )
   private int time;
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
   @ModelColumnAnno(
      comment = "地区限制"
   )
   private String areanShow;
   @ModelColumnAnno(
      comment = "旧序号"
   )
   private int oldId;

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_ACT_TURNTABLE.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.targetType, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.targetId, (v) -> new ConcurrentHashSet())).add(this.id);
   }

   public int getTaskId() {
      return this.id;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public int getTargetNum() {
      return this.targetNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public int getTime() {
      return this.time;
   }

   public String getAreanShow() {
      return this.areanShow;
   }

   public int getOldId() {
      return this.oldId;
   }

   public void setId(int id) {
      this.id = id;
   }
}
