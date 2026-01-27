package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stoneCircleShop"
)
public class StoneCircleShopModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "数量"
   )
   private int combineNum;
   @ModelColumnAnno(
      comment = "资源类型"
   )
   private int resourceType;
   @ModelColumnAnno(
      comment = "资源id"
   )
   private int resourceId;
   @ModelColumnAnno(
      comment = "现价"
   )
   private int disPrice;
   @ModelColumnAnno(
      comment = "出现层数"
   )
   private int appearStage;
   @ModelColumnAnno(
      comment = "商店类型"
   )
   private int shopType;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   public int getCombineNum() {
      return this.combineNum;
   }

   public void setCombineNum(int combineNum) {
      this.checkModify();
      this.combineNum = combineNum;
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

   public int getDisPrice() {
      return this.disPrice;
   }

   public void setDisPrice(int disPrice) {
      this.checkModify();
      this.disPrice = disPrice;
   }

   public int getAppearStage() {
      return this.appearStage;
   }

   public void setAppearStage(int appearStage) {
      this.checkModify();
      this.appearStage = appearStage;
   }

   public int getShopType() {
      return this.shopType;
   }

   public void setShopType(int shopType) {
      this.checkModify();
      this.shopType = shopType;
   }
}
