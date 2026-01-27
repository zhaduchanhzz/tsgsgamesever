package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "TongQueUpLevel"
)
public class TongQueUpLevelModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "upType",
      comment = "升级类型"
   )
   private int upType;
   @ModelColumnAnno(
      columnName = "exp",
      comment = "需要经验"
   )
   private int exp;
   @ModelColumnAnno(
      columnName = "atts",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "属性增加"
   )
   private List<PropertyModel> atts = new ArrayList();
   @ModelColumnAnno(
      columnName = "costs",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "道具消耗"
   )
   private List<ResourceModel> costs = new ArrayList();
   @ModelColumnAnno(
      columnName = "costNum",
      comment = "单次幽会增加经验值"
   )
   private int costNum;
   @ModelColumnAnno(
      columnName = "expOnceWeight",
      comment = "单次幽会增加经验值权重"
   )
   private int expOnceWeight;
   @ModelColumnAnno(
      columnName = "expRandomLower",
      comment = "单次幽会随机经验区间下限"
   )
   private int expRandomLower;
   @ModelColumnAnno(
      columnName = "expRandomHigher",
      comment = "单次幽会随机经验区间上限"
   )
   private int expRandomHigher;
   @ModelColumnAnno(
      columnName = "expRandomeWeight",
      comment = "单次幽会随机经验区间权重"
   )
   private int expRandomeWeight;
   @ModelColumnAnno(
      comment = "当前级别重置返还的幽会材料总和"
   )
   private String returnItems;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, TongQueUpLevelModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueUpLevelModel model = (TongQueUpLevelModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.upType, (v) -> new TreeMap())).put(model.getLv(), model);
      }

      pool.putMap("customTongQueUpLevel", tempHashMap);
   }

   public int calExp() {
      int totalWeight = this.expOnceWeight + this.expRandomeWeight;
      int random = RandomUtil.randInt(totalWeight);
      return random < this.expOnceWeight ? this.expRandomLower : RandomUtil.randInt(this.expRandomLower, this.expRandomHigher + 1);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public List<PropertyModel> getAtts() {
      return this.atts;
   }

   public void setAtts(List<PropertyModel> atts) {
      this.checkModify();
      this.atts = atts;
   }

   public List<ResourceModel> getCosts() {
      return this.costs;
   }

   public void setCosts(List<ResourceModel> costs) {
      this.checkModify();
      this.costs = costs;
   }

   public int getCostNum() {
      return this.costNum;
   }

   public void setCostNum(int costNum) {
      this.checkModify();
      this.costNum = costNum;
   }

   public int getExpOnceWeight() {
      return this.expOnceWeight;
   }

   public void setExpOnceWeight(int expOnceWeight) {
      this.checkModify();
      this.expOnceWeight = expOnceWeight;
   }

   public int getExpRandomLower() {
      return this.expRandomLower;
   }

   public void setExpRandomLower(int expRandomLower) {
      this.checkModify();
      this.expRandomLower = expRandomLower;
   }

   public int getExpRandomHigher() {
      return this.expRandomHigher;
   }

   public void setExpRandomHigher(int expRandomHigher) {
      this.checkModify();
      this.expRandomHigher = expRandomHigher;
   }

   public int getExpRandomeWeight() {
      return this.expRandomeWeight;
   }

   public void setExpRandomeWeight(int expRandomeWeight) {
      this.checkModify();
      this.expRandomeWeight = expRandomeWeight;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getUpType() {
      return this.upType;
   }

   public void setUpType(int upType) {
      this.checkModify();
      this.upType = upType;
   }

   public List<ResourceModel> getReturnItems() {
      return ResourceModel.buildResourcesPlus(this.returnItems);
   }

   public void setReturnItems(String returnItems) {
      this.returnItems = returnItems;
   }
}
