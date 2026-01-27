package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "shopLimit"
)
public class ShopLimitModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "主键id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "第几期",
      columnName = "WhichIssue"
   )
   private int whichIssue;
   @ModelColumnAnno(
      comment = "礼包类型"
   )
   private int giftType;
   @ModelColumnAnno(
      comment = "重置时间"
   )
   private int refresh;
   @ModelColumnAnno(
      comment = "物品ID"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "物品数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "原价"
   )
   private int oriPrice;
   @ModelColumnAnno(
      comment = "价格类型"
   )
   private int priceType;
   @ModelColumnAnno(
      comment = "价格"
   )
   private int price;
   @ModelColumnAnno(
      comment = "排序"
   )
   private int sort;
   @ModelColumnAnno(
      comment = "限购类型"
   )
   private int limitType;
   @ModelColumnAnno(
      comment = "限购次数"
   )
   private int limitCount;
   @ModelColumnAnno(
      comment = "获得vip经验"
   )
   private int expVip;
   @ModelColumnAnno(
      comment = "需求等级"
   )
   private int needLevel;
   @ModelColumnAnno(
      comment = "vip等级限制"
   )
   private int needvipLevel;
   @ModelColumnAnno(
      comment = "需要开启系统的id"
   )
   private int sytemFunctionId;
   @ModelColumnAnno(
      comment = "最低等级"
   )
   private int lowLevel;
   @ModelColumnAnno(
      comment = "最高等级"
   )
   private int maxLevel;
   @ModelColumnAnno(
      comment = "时间段"
   )
   private int period;
   @ModelColumnAnno(
      comment = "礼包期限"
   )
   private int timeLimit;
   @ModelColumnAnno(
      comment = "过期邮件"
   )
   private int timeEmail;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, TreeMap<Integer, ShopLimitModel>>> tempHashMap = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, List<ShopLimitModel>> activityShopLimitMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ShopLimitModel model = (ShopLimitModel)entry.getValue();
         ((TreeMap)((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.giftType, (v) -> new ConcurrentHashMap())).computeIfAbsent(model.activityId, (v) -> new TreeMap())).put(model.id, model);
         ((List)activityShopLimitMap.computeIfAbsent(model.activityId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customShopLimit", tempHashMap);
      pool.putMap("customActivityShopLimit", activityShopLimitMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getGiftType() {
      return this.giftType;
   }

   public void setGiftType(int giftType) {
      this.checkModify();
      this.giftType = giftType;
   }

   public int getRefresh() {
      return this.refresh;
   }

   public void setRefresh(int refresh) {
      this.checkModify();
      this.refresh = refresh;
   }

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

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getOriPrice() {
      return this.oriPrice;
   }

   public void setOriPrice(int oriPrice) {
      this.checkModify();
      this.oriPrice = oriPrice;
   }

   public int getPriceType() {
      return this.priceType;
   }

   public void setPriceType(int priceType) {
      this.checkModify();
      this.priceType = priceType;
   }

   public int getPrice() {
      return this.price;
   }

   public void setPrice(int price) {
      this.checkModify();
      this.price = price;
   }

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.checkModify();
      this.sort = sort;
   }

   public int getLimitType() {
      return this.limitType;
   }

   public void setLimitType(int limitType) {
      this.checkModify();
      this.limitType = limitType;
   }

   public int getLimitCount() {
      return this.limitCount;
   }

   public void setLimitCount(int limitCount) {
      this.checkModify();
      this.limitCount = limitCount;
   }

   public int getExpVip() {
      return this.expVip;
   }

   public void setExpVip(int expVip) {
      this.checkModify();
      this.expVip = expVip;
   }

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getNeedvipLevel() {
      return this.needvipLevel;
   }

   public void setNeedvipLevel(int needvipLevel) {
      this.checkModify();
      this.needvipLevel = needvipLevel;
   }

   public int getSytemFunctionId() {
      return this.sytemFunctionId;
   }

   public void setSytemFunctionId(int sytemFunctionId) {
      this.checkModify();
      this.sytemFunctionId = sytemFunctionId;
   }

   public int getLowLevel() {
      return this.lowLevel;
   }

   public void setLowLevel(int lowLevel) {
      this.checkModify();
      this.lowLevel = lowLevel;
   }

   public int getMaxLevel() {
      return this.maxLevel;
   }

   public void setMaxLevel(int maxLevel) {
      this.checkModify();
      this.maxLevel = maxLevel;
   }

   public int getPeriod() {
      return this.period;
   }

   public void setPeriod(int period) {
      this.checkModify();
      this.period = period;
   }

   public int getTimeLimit() {
      return this.timeLimit;
   }

   public void setTimeLimit(int timeLimit) {
      this.checkModify();
      this.timeLimit = timeLimit;
   }

   public int getTimeEmail() {
      return this.timeEmail;
   }

   public void setTimeEmail(int timeEmail) {
      this.checkModify();
      this.timeEmail = timeEmail;
   }

   public int getWhichIssue() {
      return this.whichIssue;
   }

   public void setWhichIssue(int whichIssue) {
      this.checkModify();
      this.whichIssue = whichIssue;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }
}
