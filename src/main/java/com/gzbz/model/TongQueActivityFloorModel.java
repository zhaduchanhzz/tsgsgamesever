package com.gzbz.model;

import com.gzbz.model.fun.ResourceWeightModel;
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
   file = "TongQueActivityFloor"
)
public class TongQueActivityFloorModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "楼层"
   )
   private int stepId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceWeightModel.class,
      count = 4,
      comment = "道具"
   )
   private List<ResourceWeightModel> goods = new ArrayList();
   @ModelColumnAnno(
      comment = "必出解楼道具抽奖次数"
   )
   private int sureTimes;

   public int getStepId() {
      return this.stepId;
   }

   public void setStepId(int stepId) {
      this.checkModify();
      this.stepId = stepId;
   }

   public List<ResourceWeightModel> getGoods() {
      return this.goods;
   }

   public void setGoods(List<ResourceWeightModel> goods) {
      this.checkModify();
      this.goods = goods;
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

   public int getSureTimes() {
      return this.sureTimes;
   }

   public void setSureTimes(int sureTimes) {
      this.sureTimes = sureTimes;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, TongQueActivityFloorModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueActivityFloorModel model = (TongQueActivityFloorModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.activityId, (v) -> new TreeMap())).put(model.stepId, model);
      }

      pool.putMap("customTongQueActivityFloor", tempHashMap);
   }
}
