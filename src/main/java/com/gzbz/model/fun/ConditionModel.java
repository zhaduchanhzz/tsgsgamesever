package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ConditionModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "condition",
      comment = "条件"
   )
   private short condition;
   @ModelColumnAnno(
      columnName = "conditionValue",
      comment = "条件值"
   )
   private int conditionValue;
   @ModelColumnAnno(
      columnName = "conditionParam",
      comment = "条件参数"
   )
   private String conditionParam;

   public short getCondition() {
      return this.condition;
   }

   public void setCondition(short condition) {
      this.checkModify();
      this.condition = condition;
   }

   public int getConditionValue() {
      return this.conditionValue;
   }

   public void setConditionValue(int conditionValue) {
      this.checkModify();
      this.conditionValue = conditionValue;
   }

   public String getConditionParam() {
      return this.conditionParam;
   }

   public void setConditionParam(String conditionParam) {
      this.checkModify();
      this.conditionParam = conditionParam;
   }
}
