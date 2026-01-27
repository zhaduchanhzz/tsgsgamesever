package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "boxAward"
)
public class BoxAwardModel extends BaseModel {
   public static final int FLOOR_TYPE_ONCE = 0;
   public static final int FLOOR_TYPE_MUL = 1;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "保底类型/一次性或多次累计"
   )
   private int floorType;
   @ModelColumnAnno(
      comment = "随机组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int resourceType;
   @ModelColumnAnno(
      comment = "物品id"
   )
   private int resourceId;
   @ModelColumnAnno(
      comment = "最小数"
   )
   private int min;
   @ModelColumnAnno(
      comment = "最大数"
   )
   private int max;
   @ModelColumnAnno(
      comment = "权重占比"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "保底获得所需次数(连开)"
   )
   private int floors;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, BoxAwardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         BoxAwardModel model = (BoxAwardModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.group, (v) -> new ConcurrentHashMap())).put(model.id, model);
      }

      pool.putMap("customBoxAward", tempHashMap);
   }

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

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
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

   public int getMin() {
      return this.min;
   }

   public void setMin(int min) {
      this.checkModify();
      this.min = min;
   }

   public int getMax() {
      return this.max;
   }

   public void setMax(int max) {
      this.checkModify();
      this.max = max;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getFloors() {
      return this.floors;
   }

   public void setFloors(int floors) {
      this.checkModify();
      this.floors = floors;
   }

   public int getFloorType() {
      return this.floorType;
   }

   public void setFloorType(int floorType) {
      this.checkModify();
      this.floorType = floorType;
   }
}
