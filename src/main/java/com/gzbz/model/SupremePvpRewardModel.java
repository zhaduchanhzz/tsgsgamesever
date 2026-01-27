package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelColumnAnno;
import model.ModelPool;

public abstract class SupremePvpRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "最小排名"
   )
   private int minRank;
   @ModelColumnAnno(
      comment = "最大排名"
   )
   private int maxRank;
   @ModelColumnAnno(
      comment = "段位"
   )
   private int floor;

   public abstract List<ResourceModel> getRewards();

   public int getId() {
      return this.id;
   }

   public int getMinRank() {
      return this.minRank;
   }

   public int getMaxRank() {
      return this.maxRank;
   }

   public int getFloor() {
      return this.floor;
   }

   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map, String customName) {
      ConcurrentHashMap<Integer, TreeMap<Integer, SupremePvpRewardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SupremePvpRewardModel model = (SupremePvpRewardModel)entry.getValue();
         ((TreeMap)tempMap.computeIfAbsent(model.getFloor(), (v) -> new TreeMap())).put(model.getId(), model);
      }

      pool.putMap(customName, tempMap);
   }
}
