package com.gzbz.model;

import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shopDragonWar"
)
public class ShopDragonWarModel extends ShopItemBaseModel {
   @ModelColumnAnno(
      columnName = "oriPrice",
      comment = "原价"
   )
   private int oriPrice;
   @ModelColumnAnno(
      columnName = "discount",
      comment = "折扣"
   )
   private int discount;
   @ModelColumnAnno(
      columnName = "sort",
      comment = "优先级排序"
   )
   private int sort;
   @ModelColumnAnno(
      columnName = "toSystem",
      comment = "开启系统"
   )
   private int toSystem;

   public int getOriPrice() {
      return this.oriPrice;
   }

   public void setOriPrice(int oriPrice) {
      this.checkModify();
      this.oriPrice = oriPrice;
   }

   public int getDiscount() {
      return this.discount;
   }

   public void setDiscount(int discount) {
      this.checkModify();
      this.discount = discount;
   }

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.checkModify();
      this.sort = sort;
   }

   public int getToSystem() {
      return this.toSystem;
   }

   public void setToSystem(int toSystem) {
      this.checkModify();
      this.toSystem = toSystem;
   }
}
