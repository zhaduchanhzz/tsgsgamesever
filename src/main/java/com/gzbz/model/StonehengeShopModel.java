package com.gzbz.model;

import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stonehengeShop"
)
public class StonehengeShopModel extends ShopItemBaseModel {
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
      columnName = "isPlatformOpen",
      comment = "是否受渠道开关影响"
   )
   private int isPlatformOpen;
   @ModelColumnAnno(
      columnName = "toSystem",
      comment = "关联的系统id"
   )
   private int toSystem;

   public int getToSystem() {
      return this.toSystem;
   }

   public void setToSystem(int toSystem) {
      this.checkModify();
      this.toSystem = toSystem;
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

   public int getIsPlatformOpen() {
      return this.isPlatformOpen;
   }
}
