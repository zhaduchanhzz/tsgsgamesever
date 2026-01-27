package com.gzbz.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "broodReward"
)
public class BroodRewardModel extends AbstractDrawItemModel {
   @ModelColumnAnno(
      comment = "奖励池类型"
   )
   private int rewardSlot;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, BroodRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         BroodRewardModel model = (BroodRewardModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.getDateStart(), (v) -> new HashMap())).put(model.getId(), model);
      }

      pool.putMap("CustomBroodReward", tempHashMap);
   }

   public int getRewardSlot() {
      return this.rewardSlot;
   }

   public void setRewardSlot(int rewardSlot) {
      this.rewardSlot = rewardSlot;
   }
}
