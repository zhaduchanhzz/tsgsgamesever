package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class BoxNeedFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "need",
      comment = "需求数"
   )
   private int need;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNeed() {
      return this.need;
   }

   public void setNeed(int need) {
      this.checkModify();
      this.need = need;
   }
}
