package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;

public class ShopItemBaseModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "itemType",
      comment = "大类型"
   )
   private int itemType;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "combineNum",
      comment = "叠加数量"
   )
   private int combineNum;
   @ModelColumnAnno(
      columnName = "resourceType",
      comment = "资源类型"
   )
   private int resourceType;
   @ModelColumnAnno(
      columnName = "resourceId",
      comment = "资源id"
   )
   private int resourceId;
   @ModelColumnAnno(
      columnName = "disPrice",
      comment = "现价"
   )
   private int disPrice;
   @ModelColumnAnno(
      columnName = "buyLimit",
      comment = "购买次数限制"
   )
   private int buyLimit;
   @ModelColumnAnno(
      columnName = "autoReset",
      comment = "自动重置"
   )
   private int autoReset;
   @ModelColumnAnno(
      columnName = "worldlvLimit",
      comment = "世界等级"
   )
   private int worldlvLimit;
   @ModelColumnAnno(
      columnName = "lvLimit",
      comment = "开启等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      columnName = "lvLimitEx",
      comment = "强制开启等级"
   )
   private int lvLimitEx;
   @ModelColumnAnno(
      columnName = "vipLimit",
      comment = "vip等级"
   )
   private int vipLimit;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "自动购买"
   )
   private int autoBuy;

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

   public int getBuyLimit() {
      return this.buyLimit;
   }

   public void setBuyLimit(int buyLimit) {
      this.checkModify();
      this.buyLimit = buyLimit;
   }

   public int getAutoReset() {
      return this.autoReset;
   }

   public void setAutoReset(int autoReset) {
      this.checkModify();
      this.autoReset = autoReset;
   }

   public int getWorldlvLimit() {
      return this.worldlvLimit;
   }

   public void setWorldlvLimit(int worldlvLimit) {
      this.checkModify();
      this.worldlvLimit = worldlvLimit;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public int getLvLimitEx() {
      return this.lvLimitEx;
   }

   public void setLvLimitEx(int lvLimitEx) {
      this.checkModify();
      this.lvLimitEx = lvLimitEx;
   }

   public int getVipLimit() {
      return this.vipLimit;
   }

   public void setVipLimit(int vipLimit) {
      this.checkModify();
      this.vipLimit = vipLimit;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getAutoBuy() {
      return this.autoBuy;
   }

   public void setAutoBuy(int autoBuy) {
      this.checkModify();
      this.autoBuy = autoBuy;
   }
}
