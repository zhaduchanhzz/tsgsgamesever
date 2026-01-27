package com.gzbz.model;

import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "JiuZhouShop"
)
public class SupremeShopModel extends ShopItemBaseModel {
   @ModelColumnAnno(
      columnName = "openTime",
      comment = "开服天数"
   )
   private int openTime;
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

   public int getOpenTime() {
      return this.openTime;
   }

   public int getOriPrice() {
      return this.oriPrice;
   }

   public int getDiscount() {
      return this.discount;
   }

   public int getSort() {
      return this.sort;
   }
}
