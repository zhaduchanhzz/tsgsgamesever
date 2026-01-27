package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ProbabilityFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "probability",
      comment = "概率"
   )
   private int probability;
   @ModelColumnAnno(
      columnName = "val",
      comment = "值"
   )
   private int val;

   public int getProbability() {
      return this.probability;
   }

   public void setProbability(int probability) {
      this.checkModify();
      this.probability = probability;
   }

   public int getVal() {
      return this.val;
   }

   public void setVal(int val) {
      this.checkModify();
      this.val = val;
   }
}
