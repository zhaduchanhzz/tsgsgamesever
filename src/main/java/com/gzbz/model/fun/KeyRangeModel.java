package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class KeyRangeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "key",
      comment = "key"
   )
   private int key;
   @ModelColumnAnno(
      columnName = "min",
      comment = "最小值"
   )
   private int min;
   @ModelColumnAnno(
      columnName = "max",
      comment = "最大值"
   )
   private int max;

   public int getKey() {
      return this.key;
   }

   public void setKey(int key) {
      this.checkModify();
      this.key = key;
   }

   public int getMin() {
      return this.min;
   }

   public void setMin(int min) {
      this.checkModify();
      this.min = min;
   }

   public int getMax() {
      return this.max;
   }

   public void setMax(int max) {
      this.checkModify();
      this.max = max;
   }
}
