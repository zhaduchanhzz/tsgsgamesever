package com.gzbz.model;

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
   file = "SpringWaterprobability"
)
public class SpringWaterProbabilityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "第几次"
   )
   private int time;
   @ModelColumnAnno
   private int activityId;
   @ModelColumnAnno(
      columnName = "progressValue",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "进度值",
      count = 5
   )
   private List<Integer> progressValue = new ArrayList();
   @ModelColumnAnno(
      columnName = "priceReward",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "奖励组",
      count = 5
   )
   private List<Integer> priceReward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, SpringWaterProbabilityModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SpringWaterProbabilityModel model = (SpringWaterProbabilityModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new HashMap())).put(model.time, model);
      }

      pool.putMap("CustomSpringWaterprobability", tempHashMap);
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public List<Integer> getProgressValue() {
      return this.progressValue;
   }

   public void setProgressValue(List<Integer> progressValue) {
      this.checkModify();
      this.progressValue = progressValue;
   }

   public List<Integer> getPriceReward() {
      return this.priceReward;
   }

   public void setPriceReward(List<Integer> priceReward) {
      this.checkModify();
      this.priceReward = priceReward;
   }
}
