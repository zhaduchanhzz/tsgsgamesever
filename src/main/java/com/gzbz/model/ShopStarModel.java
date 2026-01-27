package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shopStar"
)
public class ShopStarModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "商品id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "物品ID"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      comment = "叠加数量"
   )
   private int combineNum;
   @ModelColumnAnno(
      comment = "消耗道具类型"
   )
   private int priceType;
   @ModelColumnAnno(
      comment = "购买消耗道具id"
   )
   private int priceId;
   @ModelColumnAnno(
      comment = "折前价格"
   )
   private int oriPrice;
   @ModelColumnAnno(
      comment = "折扣"
   )
   private int discount;
   @ModelColumnAnno(
      comment = "折后价格"
   )
   private int disPrice;
   @ModelColumnAnno(
      comment = "购买次数限制"
   )
   private int buyLimit;
   @ModelColumnAnno(
      comment = "优先级排序"
   )
   private int sort;
   @ModelColumnAnno(
      comment = "世界等级"
   )
   private int worldlvLimit;
   @ModelColumnAnno(
      comment = "开启等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      comment = "强制开启等级"
   )
   private int lvLimitEx;
   @ModelColumnAnno(
      comment = "vip等級限制"
   )
   private int vipLimit;
   @ModelColumnAnno(
      comment = "自动重置"
   )
   private int autoReset;

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

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public int getCombineNum() {
      return this.combineNum;
   }

   public void setCombineNum(int combineNum) {
      this.checkModify();
      this.combineNum = combineNum;
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

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.checkModify();
      this.sort = sort;
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

   public int getAutoReset() {
      return this.autoReset;
   }

   public void setAutoReset(int autoReset) {
      this.checkModify();
      this.autoReset = autoReset;
   }
}
