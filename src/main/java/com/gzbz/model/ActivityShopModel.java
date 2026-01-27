package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "activityShop"
)
public class ActivityShopModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "活动类型"
   )
   private int activityType;
   @ModelColumnAnno(
      comment = "优先级"
   )
   private int priority;
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
      comment = "是否超值"
   )
   private int extraItem;
   @ModelColumnAnno(
      comment = "限购次数"
   )
   private int quota;
   @ModelColumnAnno(
      comment = "兑换道具类型"
   )
   private int exchangeType;
   @ModelColumnAnno(
      comment = "兑换道具id"
   )
   private int exchangeId;
   @ModelColumnAnno(
      comment = "兑换道具数量"
   )
   private int exchangeNum;
   @ModelColumnAnno(
      comment = "兑换道具类型"
   )
   private int exchangeType1;
   @ModelColumnAnno(
      comment = "兑换道具id"
   )
   private int exchangeId1;
   @ModelColumnAnno(
      comment = "兑换道具数量"
   )
   private int exchangeNum1;
   @ModelColumnAnno(
      comment = "商城类型"
   )
   private int shopType;
   @ModelColumnAnno(
      comment = "起始天数"
   )
   private int openTime;
   @ModelColumnAnno(
      comment = "截止天数"
   )
   private int endTime;
   @ModelColumnAnno(
      comment = "是否可重复购买"
   )
   private int repeatPurchase;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getActivityType() {
      return this.activityType;
   }

   public void setActivityType(int activityType) {
      this.checkModify();
      this.activityType = activityType;
   }

   public int getPriority() {
      return this.priority;
   }

   public void setPriority(int priority) {
      this.checkModify();
      this.priority = priority;
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

   public int getExtraItem() {
      return this.extraItem;
   }

   public void setExtraItem(int extraItem) {
      this.checkModify();
      this.extraItem = extraItem;
   }

   public int getQuota() {
      return this.quota;
   }

   public void setQuota(int quota) {
      this.checkModify();
      this.quota = quota;
   }

   public int getExchangeType() {
      return this.exchangeType;
   }

   public void setExchangeType(int exchangeType) {
      this.checkModify();
      this.exchangeType = exchangeType;
   }

   public int getExchangeId() {
      return this.exchangeId;
   }

   public void setExchangeId(int exchangeId) {
      this.checkModify();
      this.exchangeId = exchangeId;
   }

   public int getExchangeNum() {
      return this.exchangeNum;
   }

   public void setExchangeNum(int exchangeNum) {
      this.checkModify();
      this.exchangeNum = exchangeNum;
   }

   public int getExchangeType1() {
      return this.exchangeType1;
   }

   public void setExchangeType1(int exchangeType1) {
      this.checkModify();
      this.exchangeType1 = exchangeType1;
   }

   public int getExchangeId1() {
      return this.exchangeId1;
   }

   public void setExchangeId1(int exchangeId1) {
      this.checkModify();
      this.exchangeId1 = exchangeId1;
   }

   public int getExchangeNum1() {
      return this.exchangeNum1;
   }

   public void setExchangeNum1(int exchangeNum1) {
      this.checkModify();
      this.exchangeNum1 = exchangeNum1;
   }

   public int getShopType() {
      return this.shopType;
   }

   public void setShopType(int shopType) {
      this.checkModify();
      this.shopType = shopType;
   }

   public int getRepeatPurchase() {
      return this.repeatPurchase;
   }

   public void setRepeatPurchase(int repeatPurchase) {
      this.checkModify();
      this.repeatPurchase = repeatPurchase;
   }

   public int getOpenTime() {
      return this.openTime;
   }

   public void setOpenTime(int openTime) {
      this.openTime = openTime;
   }

   public int getEndTime() {
      return this.endTime;
   }

   public void setEndTime(int endTime) {
      this.endTime = endTime;
   }
}
