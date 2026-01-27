package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "liyuReward"
)
public class LiYuRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int activityId;
   @ModelColumnAnno
   private int pointType;
   @ModelColumnAnno
   private int pointId;
   @ModelColumnAnno
   private int pointValue;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> reward = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "高级奖励",
      columnName = "lockreward"
   )
   private List<ResourceModel> unloadReward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, LiYuRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LiYuRewardModel model = (LiYuRewardModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.activityId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customLiyuReward", tempHashMap);
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

   public int getPointType() {
      return this.pointType;
   }

   public void setPointType(int pointType) {
      this.checkModify();
      this.pointType = pointType;
   }

   public int getPointId() {
      return this.pointId;
   }

   public void setPointId(int pointId) {
      this.checkModify();
      this.pointId = pointId;
   }

   public int getPointValue() {
      return this.pointValue;
   }

   public void setPointValue(int pointValue) {
      this.checkModify();
      this.pointValue = pointValue;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }

   public List<ResourceModel> getUnloadReward() {
      return this.unloadReward;
   }

   public void setUnloadReward(List<ResourceModel> unloadReward) {
      this.checkModify();
      this.unloadReward = unloadReward;
   }
}
