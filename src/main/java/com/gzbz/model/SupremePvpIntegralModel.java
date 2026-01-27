package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "JiuZhouIntegral"
)
public class SupremePvpIntegralModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "积分差距比例(万分比)"
   )
   private int pointsGap;
   @ModelColumnAnno(
      comment = "胜者加分"
   )
   private int addPoints;
   @ModelColumnAnno(
      comment = "败者扣分"
   )
   private int reducePoints;

   public int getPointsGap() {
      return this.pointsGap;
   }

   public int getAddPoints() {
      return this.addPoints;
   }

   public int getReducePoints() {
      return this.reducePoints;
   }
}
