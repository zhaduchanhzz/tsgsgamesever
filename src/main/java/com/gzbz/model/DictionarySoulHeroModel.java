package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "dictionarySoulHero"
)
public class DictionarySoulHeroModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "魂武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "图鉴等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "星级要求"
   )
   private int starLimit;
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 4,
      subCls = PropertyModel.class,
      comment = "属性"
   )
   private List<PropertyModel> passiveBuffs = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, DictionarySoulHeroModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DictionarySoulHeroModel value = (DictionarySoulHeroModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(value.getHeroId(), (k) -> new HashMap())).put(value.getLevel(), value);
      }

      pool.putMap("customDictionarySoulHero", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public int getLevel() {
      return this.level;
   }

   public int getStarLimit() {
      return this.starLimit;
   }

   public List<PropertyModel> getPassiveBuffs() {
      return this.passiveBuffs;
   }
}
