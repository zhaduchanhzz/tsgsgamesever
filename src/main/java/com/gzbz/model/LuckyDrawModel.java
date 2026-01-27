package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "luckyDraw"
)
public class LuckyDrawModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "drawWheel",
      comment = "抽取轮数 "
   )
   private int drawWheel;
   @ModelColumnAnno(
      columnName = "taskName",
      comment = "任务标题 "
   )
   private String taskName;
   @ModelColumnAnno(
      columnName = "targetType",
      comment = "目标类型 "
   )
   private int targetType;
   @ModelColumnAnno(
      columnName = "targetId",
      comment = "目标ID "
   )
   private int targetId;
   @ModelColumnAnno(
      columnName = "targetNum",
      comment = "目标数量 "
   )
   private int targetNum;

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_LUCK_DRAW.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDrawWheel() {
      return this.drawWheel;
   }

   public void setDrawWheel(int drawWheel) {
      this.checkModify();
      this.drawWheel = drawWheel;
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
}
