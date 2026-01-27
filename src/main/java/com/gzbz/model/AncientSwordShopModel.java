package com.gzbz.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "AncientSwordShop"
)
public class AncientSwordShopModel extends ShopItemBaseModel {
   @ModelColumnAnno(
      comment = "刷出权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "商品组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "每周最大刷出次数"
   )
   private int maxTimes;

   public int getWeight() {
      return this.weight;
   }

   public int getGroup() {
      return this.group;
   }

   public int getMaxTimes() {
      return this.maxTimes;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<AncientSwordShopModel, Integer>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AncientSwordShopModel value = (AncientSwordShopModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(value.group, (k) -> new HashMap())).put(value, value.weight);
      }

      pool.putMap("cAncientSwordShop", tempMap);
   }
}
