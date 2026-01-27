package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class TaskTargetItem extends BaseModel {
   @ModelColumnAnno(
      columnName = "targetType",
      comment = "类型"
   )
   private int targetType;
   @ModelColumnAnno(
      columnName = "targetId",
      comment = "ID"
   )
   private int targetId;
   @ModelColumnAnno(
      columnName = "targetValue",
      comment = "数量"
   )
   private int targetValue;

   public TaskTargetItem() {
   }

   public TaskTargetItem(int targetType, int targetId, int targetValue) {
      this.targetType = targetType;
      this.targetId = targetId;
      this.targetValue = targetValue;
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
}
