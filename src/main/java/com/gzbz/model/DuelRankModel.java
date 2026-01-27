package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "duelRank"
)
public class DuelRankModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "排序"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "pointsGap",
      comment = "积分差距比例（万分比）"
   )
   private int pointsGap;
   @ModelColumnAnno(
      columnName = "addPoints",
      comment = "胜者加分"
   )
   private int addPoints;
   @ModelColumnAnno(
      columnName = "reducePoints",
      comment = "败者扣分"
   )
   private int reducePoints;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPointsGap() {
      return this.pointsGap;
   }

   public void setPointsGap(int pointsGap) {
      this.checkModify();
      this.pointsGap = pointsGap;
   }

   public int getAddPoints() {
      return this.addPoints;
   }

   public void setAddPoints(int addPoints) {
      this.checkModify();
      this.addPoints = addPoints;
   }

   public int getReducePoints() {
      return this.reducePoints;
   }

   public void setReducePoints(int reducePoints) {
      this.checkModify();
      this.reducePoints = reducePoints;
   }
}
