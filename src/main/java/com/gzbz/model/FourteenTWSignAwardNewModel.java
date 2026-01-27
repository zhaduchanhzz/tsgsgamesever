package com.gzbz.model;

import db.DBColumnAnno;
import model.ModelAnno;

@ModelAnno(
   file = "OverseasSignAward"
)
public class FourteenTWSignAwardNewModel extends FourteenTWSignAwardModel {
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
