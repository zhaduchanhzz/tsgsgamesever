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
   file = "ArtifacttreasureNewest"
)
public class ArtifactTreasureNewestModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      comment = "轮次"
   )
   private int round;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom1(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TreeMap<Integer, List<ArtifactTreasureNewestModel>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactTreasureNewestModel model = (ArtifactTreasureNewestModel)entry.getValue();
         ((List)((TreeMap)tempHashMap.computeIfAbsent(model.formatStartEnd(), (v) -> new TreeMap())).computeIfAbsent(model.getRound(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customArtifactTreasureNewest", tempHashMap);
   }

   public String getCustomExcelName() {
      return null;
   }

   public int getRound() {
      return this.round;
   }

   public void setRound(int round) {
      this.checkModify();
      this.round = round;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
