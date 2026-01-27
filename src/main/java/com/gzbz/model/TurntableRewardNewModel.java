package com.gzbz.model;

import db.DBColumnAnno;
import model.ModelAnno;

@ModelAnno(
   file = "OverseasTurntableDraw"
)
public class TurntableRewardNewModel extends TurntableRewardModel {
   @DBColumnAnno(
      isPrimary = true,
      comment = "地区"
   )
   private String area;

   public String getArea() {
      return this.area;
   }

   public void setArea(String area) {
      this.area = area;
   }
}
