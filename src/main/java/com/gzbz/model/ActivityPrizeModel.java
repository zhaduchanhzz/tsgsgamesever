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
   file = "ActivityPrize"
)
public class ActivityPrizeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动ID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "第几次"
   )
   private int time;
   @ModelColumnAnno(
      columnName = "progressValue",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "进度值",
      count = 5
   )
   private List<Integer> progressValue = new ArrayList();

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

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public List<Integer> getProgressValue() {
      return this.progressValue;
   }

   public void setProgressValue(List<Integer> progressValue) {
      this.checkModify();
      this.progressValue = progressValue;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, ActivityPrizeModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ActivityPrizeModel model = (ActivityPrizeModel)entry.getValue();
         if (tempMap.containsKey(model.getActivityId())) {
            ((Map)tempMap.get(model.getActivityId())).put(model.getTime(), model);
         } else {
            Map<Integer, ActivityPrizeModel> modelMap = new HashMap();
            modelMap.put(model.getTime(), model);
            tempMap.put(model.getActivityId(), modelMap);
         }
      }

      pool.putMap("customActivityPrize", tempMap);
   }
}
