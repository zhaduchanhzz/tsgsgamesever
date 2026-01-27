package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "CommonBuy"
)
public class CommonBuyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "货币类型"
   )
   private int priceType;
   @ModelColumnAnno(
      comment = "货币id"
   )
   private int priceId;
   @ModelColumnAnno(
      comment = "货币数量"
   )
   private int priceNum;

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getPriceType() {
      return this.priceType;
   }

   public void setPriceType(int priceType) {
      this.checkModify();
      this.priceType = priceType;
   }

   public int getPriceId() {
      return this.priceId;
   }

   public void setPriceId(int priceId) {
      this.checkModify();
      this.priceId = priceId;
   }

   public int getPriceNum() {
      return this.priceNum;
   }

   public void setPriceNum(int priceNum) {
      this.checkModify();
      this.priceNum = priceNum;
   }
}
