package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "offerRewardStep"
)
public class OfferRewardStepModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int taskGroup;
   @ModelColumnAnno(
      comment = "公共悬赏上限"
   )
   private int numLimit;

   public int getTaskGroup() {
      return this.taskGroup;
   }

   public void setTaskGroup(int taskGroup) {
      this.checkModify();
      this.taskGroup = taskGroup;
   }

   public int getNumLimit() {
      return this.numLimit;
   }

   public void setNumLimit(int numLimit) {
      this.checkModify();
      this.numLimit = numLimit;
   }
}
