package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroBag"
)
public class HeroBagModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "BuyNum",
      isPrimaty = true,
      comment = "购买次数"
   )
   private int BuyNum;
   @ModelColumnAnno(
      columnName = "cost",
      comment = "花费元宝"
   )
   private int cost;
   @ModelColumnAnno(
      columnName = "lattice",
      comment = "背包购买开启格数"
   )
   private int lattice;
   @ModelColumnAnno(
      columnName = "petcost",
      comment = "花费元宝"
   )
   private int petcost;
   @ModelColumnAnno(
      columnName = "petlattice",
      comment = "背包购买开启格数"
   )
   private int petlattice;

   public int getBuyNum() {
      return this.BuyNum;
   }

   public void setBuyNum(int BuyNum) {
      this.checkModify();
      this.BuyNum = BuyNum;
   }

   public int getCost() {
      return this.cost;
   }

   public void setCost(int cost) {
      this.checkModify();
      this.cost = cost;
   }

   public int getLattice() {
      return this.lattice;
   }

   public void setLattice(int lattice) {
      this.checkModify();
      this.lattice = lattice;
   }

   public int getPetcost() {
      return this.petcost;
   }

   public void setPetcost(int petcost) {
      this.checkModify();
      this.petcost = petcost;
   }

   public int getPetlattice() {
      return this.petlattice;
   }

   public void setPetlattice(int petlattice) {
      this.checkModify();
      this.petlattice = petlattice;
   }
}
