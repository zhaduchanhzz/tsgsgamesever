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
   file = "ActivityPointReward"
)
public class ActivityPointRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据ID"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动ID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "积分类型"
   )
   private int pointType;
   @ModelColumnAnno(
      comment = "积分id"
   )
   private int pointId;
   @ModelColumnAnno(
      comment = "积分数量"
   )
   private int pointNum;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ActivityPointRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ActivityPointRewardModel model = (ActivityPointRewardModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.activityId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customActivityPointReward", tempHashMap);
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

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
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

   public int getPointNum() {
      return this.pointNum;
   }

   public void setPointNum(int pointNum) {
      this.checkModify();
      this.pointNum = pointNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
