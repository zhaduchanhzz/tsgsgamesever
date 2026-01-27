package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
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
   file = "ArtifactboxrewardsNewest"
)
public class ArtifactBoxRewardNewestModel extends ActivityOpenServerTimeBaseModel {
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
   public static void loadCustom1(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TreeMap<Integer, TreeMap<Integer, ArtifactBoxRewardNewestModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactBoxRewardNewestModel model = (ArtifactBoxRewardNewestModel)entry.getValue();
         ((TreeMap)((TreeMap)tempMap.computeIfAbsent(model.formatStartEnd(), (v) -> new TreeMap())).computeIfAbsent(model.days, (v) -> new TreeMap())).put(model.getId(), model);
      }

      pool.putMap("customArtifactBoxRewardNewest", tempMap);
   }

   public String getCustomExcelName() {
      return null;
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
