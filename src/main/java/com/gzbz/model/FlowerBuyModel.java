package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "flowerBuy"
)
public class FlowerBuyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "上一个档位id"
   )
   private int preId;
   @ModelColumnAnno(
      comment = "下一档id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "奖励类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "奖励id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "奖励数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "限购次数"
   )
   private int quota;
   @ModelColumnAnno(
      comment = "消耗类型"
   )
   private int exchangeType;
   @ModelColumnAnno(
      comment = "消耗道具id"
   )
   private int exchangeId;
   @ModelColumnAnno(
      comment = "消耗道具数量"
   )
   private int exchangeNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPreId() {
      return this.preId;
   }

   public void setPreId(int preId) {
      this.checkModify();
      this.preId = preId;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
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
}
