package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FlowerfireShop"
)
public class FlowerFireShopModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "重置类型"
   )
   private int resetType;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "物品数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "资源类型"
   )
   private int resourceType;
   @ModelColumnAnno(
      comment = "资源ID"
   )
   private int resourceId;
   @ModelColumnAnno(
      comment = "资源原价"
   )
   private int oriPrice;
   @ModelColumnAnno(
      comment = "资源折后价"
   )
   private int disPrice;
   @ModelColumnAnno(
      comment = "折扣"
   )
   private int discount;
   @ModelColumnAnno(
      comment = "购买次数限制"
   )
   private int buyLimit;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getResetType() {
      return this.resetType;
   }

   public void setResetType(int resetType) {
      this.checkModify();
      this.resetType = resetType;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getResourceType() {
      return this.resourceType;
   }

   public void setResourceType(int resourceType) {
      this.checkModify();
      this.resourceType = resourceType;
   }

   public int getResourceId() {
      return this.resourceId;
   }

   public void setResourceId(int resourceId) {
      this.checkModify();
      this.resourceId = resourceId;
   }

   public int getOriPrice() {
      return this.oriPrice;
   }

   public void setOriPrice(int oriPrice) {
      this.checkModify();
      this.oriPrice = oriPrice;
   }

   public int getDisPrice() {
      return this.disPrice;
   }

   public void setDisPrice(int disPrice) {
      this.checkModify();
      this.disPrice = disPrice;
   }

   public int getDiscount() {
      return this.discount;
   }

   public void setDiscount(int discount) {
      this.checkModify();
      this.discount = discount;
   }

   public int getBuyLimit() {
      return this.buyLimit;
   }

   public void setBuyLimit(int buyLimit) {
      this.checkModify();
      this.buyLimit = buyLimit;
   }
}
