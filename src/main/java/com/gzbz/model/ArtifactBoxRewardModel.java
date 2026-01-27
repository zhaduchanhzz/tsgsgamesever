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
   file = "artifactboxrewards"
)
public class ArtifactBoxRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
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
      ConcurrentHashMap<Integer, TreeMap<Integer, ArtifactBoxRewardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactBoxRewardModel model = (ArtifactBoxRewardModel)entry.getValue();
         if (tempMap.containsKey(model.days)) {
            ((TreeMap)tempMap.get(model.days)).put(model.id, model);
         } else {
            TreeMap<Integer, ArtifactBoxRewardModel> artifactGridTaskModelTreeMap = new TreeMap();
            artifactGridTaskModelTreeMap.put(model.id, model);
            tempMap.put(model.days, artifactGridTaskModelTreeMap);
         }
      }

      pool.putMap("customArtifactBoxReward", tempMap);
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
}
