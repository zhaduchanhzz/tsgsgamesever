package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "TongQueBeautyConnectGroup"
)
public class TongQueBeautyConnectGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int activityId;
   @ModelColumnAnno(
      columnName = "pos",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 9
   )
   private List<Integer> pos = new ArrayList();
   @ModelColumnAnno
   private int weight;
   @ModelColumnAnno(
      comment = "活动最大随机次数"
   )
   private int maxTimes;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, TongQueBeautyConnectGroupModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueBeautyConnectGroupModel model = (TongQueBeautyConnectGroupModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new ConcurrentHashMap())).put(model.id, model);
      }

      pool.putMap("customTongQueBeautyConnectGroup", tempHashMap);
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

   public List<Integer> getPos() {
      return this.pos;
   }

   public void setPos(List<Integer> pos) {
      this.checkModify();
      this.pos = pos;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getMaxTimes() {
      return this.maxTimes;
   }

   public void setMaxTimes(int maxTimes) {
      this.checkModify();
      this.maxTimes = maxTimes;
   }
}
