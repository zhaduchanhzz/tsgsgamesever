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
   file = "ArtifactgridNewest"
)
public class ArtifactGridNewestModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      comment = "格子id"
   )
   private int gridId;
   @ModelColumnAnno(
      comment = "格子类型"
   )
   private int gridType;
   @ModelColumnAnno(
      comment = "战斗ID"
   )
   private int battleId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励",
      columnName = "reward"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "击杀后的奖励",
      columnName = "strikereward"
   )
   private List<ResourceModel> strikeReward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom1(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TreeMap<Integer, ArtifactGridNewestModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactGridNewestModel model = (ArtifactGridNewestModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.formatStartEnd(), (v) -> new TreeMap())).put(model.gridId, model);
      }

      pool.putMap("customArtifactgridNewest", tempHashMap);
   }

   public String getCustomExcelName() {
      return null;
   }

   public int getGridId() {
      return this.gridId;
   }

   public void setGridId(int gridId) {
      this.checkModify();
      this.gridId = gridId;
   }

   public int getGridType() {
      return this.gridType;
   }

   public void setGridType(int gridType) {
      this.checkModify();
      this.gridType = gridType;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getStrikeReward() {
      return this.strikeReward;
   }

   public void setStrikeReward(List<ResourceModel> strikeReward) {
      this.strikeReward = strikeReward;
   }
}
