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
   file = "AncientSwordRandomWeapon"
)
public class AncientSwordRandomWeaponModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "组"
   )
   private int randomGroup;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private final List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<AncientSwordRandomWeaponModel, Integer>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AncientSwordRandomWeaponModel value = (AncientSwordRandomWeaponModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(value.randomGroup, (k) -> new HashMap())).put(value, value.weight);
      }

      pool.putMap("cAncientSwordRandomWeapon", tempMap);
   }
}
