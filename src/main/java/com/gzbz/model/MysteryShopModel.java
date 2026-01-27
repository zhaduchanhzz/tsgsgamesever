package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "mysteryShop"
)
public class MysteryShopModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "主id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "比重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "叠加数量"
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
      comment = "原价"
   )
   private int oriPrice;
   @ModelColumnAnno(
      comment = "折后价格"
   )
   private int disPrice;
   @ModelColumnAnno(
      comment = "折扣"
   )
   private int discount;
   @ModelColumnAnno(
      comment = "vip限制"
   )
   private int vipLimit;
   @ModelColumnAnno(
      comment = "购买次数限制"
   )
   private int buyLimit;
   @ModelColumnAnno(
      comment = "推荐"
   )
   private int recommend;
   @ModelColumnAnno(
      comment = "刷出起始时间"
   )
   private String refreshStartTime;
   @ModelColumnAnno(
      comment = "结束刷出时间"
   )
   private String refreshEndTime;
   @ModelColumnAnno(
      comment = "快捷购买"
   )
   private int fastBuy;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
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

   public int getVipLimit() {
      return this.vipLimit;
   }

   public void setVipLimit(int vipLimit) {
      this.checkModify();
      this.vipLimit = vipLimit;
   }

   public int getBuyLimit() {
      return this.buyLimit;
   }

   public void setBuyLimit(int buyLimit) {
      this.checkModify();
      this.buyLimit = buyLimit;
   }

   public int getRecommend() {
      return this.recommend;
   }

   public void setRecommend(int recommend) {
      this.checkModify();
      this.recommend = recommend;
   }

   public String getRefreshStartTime() {
      return this.refreshStartTime;
   }

   public void setRefreshStartTime(String refreshStartTime) {
      this.refreshStartTime = refreshStartTime;
   }

   public String getRefreshEndTime() {
      return this.refreshEndTime;
   }

   public void setRefreshEndTime(String refreshEndTime) {
      this.refreshEndTime = refreshEndTime;
   }

   public int getFastBuy() {
      return this.fastBuy;
   }

   public void setFastBuy(int fastBuy) {
      this.checkModify();
      this.fastBuy = fastBuy;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<MysteryShopModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MysteryShopModel model = (MysteryShopModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getGroup(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customMysteryShop", tempMap);
   }
}
