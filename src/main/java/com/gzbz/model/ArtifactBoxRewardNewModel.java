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
   file = "NewArtifactboxrewards"
)
public class ArtifactBoxRewardNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int days;
   @ModelColumnAnno(
      columnName = "gridid",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "格子id",
      count = 3
   )
   private List<Integer> gridId = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "宝箱奖励",
      columnName = "boxreward"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, TreeMap<Integer, ArtifactBoxRewardNewModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactBoxRewardNewModel model = (ArtifactBoxRewardNewModel)entry.getValue();
         ((TreeMap)((TreeMap)tempMap.computeIfAbsent(model.activityId, (v) -> new TreeMap())).computeIfAbsent(model.days, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customNewArtifactBoxReward", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDays() {
      return this.days;
   }

   public void setDays(int days) {
      this.checkModify();
      this.days = days;
   }

   public List<Integer> getGridId() {
      return this.gridId;
   }

   public void setGridId(List<Integer> gridId) {
      this.checkModify();
      this.gridId = gridId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }
}
