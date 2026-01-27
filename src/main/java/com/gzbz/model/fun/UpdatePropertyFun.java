package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class UpdatePropertyFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "property",
      comment = "属性ID"
   )
   private int property;
   @ModelColumnAnno(
      columnName = "type",
      comment = "计算方式"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "val",
      comment = "参数"
   )
   private int val;

   public int getProperty() {
      return this.property;
   }

   public void setProperty(int property) {
      this.checkModify();
      this.property = property;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getVal() {
      return this.val;
   }

   public void setVal(int val) {
      this.checkModify();
      this.val = val;
   }
}
