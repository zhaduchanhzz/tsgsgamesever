package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleIntegral"
)
public class DecisiveBattleIntegralModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "积分差下限"
   )
   private int integrallow;
   @ModelColumnAnno(
      comment = "积分差上限"
   )
   private int integralhigh;
   @ModelColumnAnno(
      comment = "胜利获得积分"
   )
   private int winget;
   @ModelColumnAnno(
      comment = "失败减少积分"
   )
   private int losedecrease;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIntegrallow() {
      return this.integrallow;
   }

   public void setIntegrallow(int integrallow) {
      this.checkModify();
      this.integrallow = integrallow;
   }

   public int getIntegralhigh() {
      return this.integralhigh;
   }

   public void setIntegralhigh(int integralhigh) {
      this.checkModify();
      this.integralhigh = integralhigh;
   }

   public int getWinget() {
      return this.winget;
   }

   public void setWinget(int winget) {
      this.checkModify();
      this.winget = winget;
   }

   public int getLosedecrease() {
      return this.losedecrease;
   }

   public void setLosedecrease(int losedecrease) {
      this.checkModify();
      this.losedecrease = losedecrease;
   }
}
