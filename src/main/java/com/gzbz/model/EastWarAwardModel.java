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
   file = "eastWarAward"
)
public class EastWarAwardModel extends BaseModel {
   public static int TYPE_1 = 1;
   public static int TYPE_2 = 2;
   public static int TYPE_3 = 3;
   public static int TYPE_4 = 4;
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "奖励类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励道具"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "weight",
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, List<EastWarAwardModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EastWarAwardModel model = (EastWarAwardModel)entry.getValue();
         ((List)((Map)tempMap.computeIfAbsent(model.getActivityId(), (v) -> new HashMap())).computeIfAbsent(model.getType(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customEastWarAward", tempMap);
   }
}
