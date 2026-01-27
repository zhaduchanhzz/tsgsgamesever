package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class CorrectWeightModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "correct",
      comment = "修正值"
   )
   private int correct;
   @ModelColumnAnno(
      columnName = "weight",
      comment = "权重"
   )
   private int weight;

   public int getCorrect() {
      return this.correct;
   }

   public void setCorrect(int correct) {
      this.checkModify();
      this.correct = correct;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
