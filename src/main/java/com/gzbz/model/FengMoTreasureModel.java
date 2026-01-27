package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "fengmoTreasure"
)
public class FengMoTreasureModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "轮次"
   )
   private int wheel;
   @ModelColumnAnno(
      comment = "组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> item = new ArrayList();
   @ModelColumnAnno(
      comment = "保底需求次数"
   )
   private int floorNum;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "消耗道具",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> consumeitem = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, List<FengMoTreasureModel>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FengMoTreasureModel model = (FengMoTreasureModel)entry.getValue();
         ((List)((Map)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new HashMap())).computeIfAbsent(model.wheel, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("custom_fengmoTreasure", tempHashMap);
   }

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

   public int getWheel() {
      return this.wheel;
   }

   public void setWheel(int wheel) {
      this.checkModify();
      this.wheel = wheel;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }

   public int getFloorNum() {
      return this.floorNum;
   }

   public void setFloorNum(int floorNum) {
      this.checkModify();
      this.floorNum = floorNum;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public List<ResourceModel> getConsumeitem() {
      return this.consumeitem;
   }

   public void setConsumeitem(List<ResourceModel> consumeitem) {
      this.checkModify();
      this.consumeitem = consumeitem;
   }
}
