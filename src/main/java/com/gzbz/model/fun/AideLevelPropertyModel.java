package com.gzbz.model.fun;

import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class AideLevelPropertyModel extends PropertyModel {
   @ModelColumnAnno(
      columnName = "showway",
      comment = "前端显示：0实数1百分比"
   )
   private int showway;

   public int getShowway() {
      return this.showway;
   }

   public void setShowway(int showway) {
      this.checkModify();
      this.showway = showway;
   }
}
