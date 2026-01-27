package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "MonthlyFundRewards"
)
public class MonthlyFundRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "day",
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      columnName = "type",
      comment = "基金类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "itemType",
      comment = "物品类型"
   )
   private int itemType;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "num",
      comment = "物品数量"
   )
   private int num;
   @ModelColumnAnno(
      columnName = "RewardPreview",
      comment = "奖励预览"
   )
   private int rewardPreview;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, MonthlyFundRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MonthlyFundRewardModel model = (MonthlyFundRewardModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.type, (v) -> new ConcurrentHashMap())).put(model.day, model);
      }

      pool.putMap("customMonthlyFundReward", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
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

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }

   public int getRewardPreview() {
      return this.rewardPreview;
   }

   public void setRewardPreview(int rewardPreview) {
      this.checkModify();
      this.rewardPreview = rewardPreview;
   }
}
