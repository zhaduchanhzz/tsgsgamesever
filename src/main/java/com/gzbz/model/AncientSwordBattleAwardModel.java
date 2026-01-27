package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "AncientSwordBattleAward"
)
public class AncientSwordBattleAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "掉落组id"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private final List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "Weight",
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "随机幻武掉落组"
   )
   private int randomGroup;

   public int getId() {
      return this.id;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public int getWeight() {
      return this.weight;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public int getRandomGroup() {
      return this.randomGroup;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<AncientSwordBattleAwardModel, Integer>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AncientSwordBattleAwardModel value = (AncientSwordBattleAwardModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(value.groupId, (k) -> new HashMap())).put(value, value.weight);
      }

      pool.putMap("cAncientSwordBattleAward", tempMap);
   }
}
