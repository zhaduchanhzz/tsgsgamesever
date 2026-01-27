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
   file = "GanenSign"
)
public class GanenSignModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "day",
      comment = "第几天"
   )
   private int day;
   @ModelColumnAnno(
      columnName = "activityId",
      comment = "活动ID"
   )
   private int activityId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "物品ID"
   )
   private List<ResourceModel> item = new ArrayList();

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

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, GanenSignModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GanenSignModel model = (GanenSignModel)entry.getValue();
         if (tempMap.containsKey(model.getActivityId())) {
            ((Map)tempMap.get(model.getActivityId())).put(model.getDay(), model);
         } else {
            Map<Integer, GanenSignModel> modelMap = new HashMap();
            modelMap.put(model.getDay(), model);
            tempMap.put(model.getActivityId(), modelMap);
         }
      }

      pool.putMap("cutomGanenSign", tempMap);
   }
}
