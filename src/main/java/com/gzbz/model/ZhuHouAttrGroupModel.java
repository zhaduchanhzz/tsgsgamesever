package com.gzbz.model;

import com.google.common.collect.Maps;
import com.gzbz.model.fun.EquipAttrModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameAttrGroup"
)
public class ZhuHouAttrGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "排序"
   )
   private int id;
   @ModelColumnAnno(
      comment = "基础属性池"
   )
   private int groupBase;
   @ModelColumnAnno(
      comment = "等级区间下限"
   )
   private int levelDown;
   @ModelColumnAnno(
      comment = "等级区间上限"
   )
   private int levelUP;
   @ModelColumnAnno(
      comment = "属性权重",
      columnConvertType = 1,
      subCls = EquipAttrModel.class
   )
   private List<EquipAttrModel> addPros = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, LinkedHashMap<Limit, List<EquipAttrModel>>> tempMap = new ConcurrentHashMap();
      map.forEach((key, value) -> {
         ZhuHouAttrGroupModel model = (ZhuHouAttrGroupModel)value;
         Limit limit = new Limit(model.levelDown, model.levelUP);
         LinkedHashMap<Limit, List<EquipAttrModel>> attrMap = (LinkedHashMap)tempMap.getOrDefault(model.groupBase, Maps.newLinkedHashMap());
         attrMap.put(limit, model.addPros);
         tempMap.put(model.groupBase, attrMap);
      });
      pool.putMap("customHeroGameAttrGroup", tempMap);
   }

   public int getGroupBase() {
      return this.groupBase;
   }

   public void setGroupBase(int groupBase) {
      this.groupBase = groupBase;
   }

   public int getLevelDown() {
      return this.levelDown;
   }

   public void setLevelDown(int levelDown) {
      this.levelDown = levelDown;
   }

   public int getLevelUP() {
      return this.levelUP;
   }

   public void setLevelUP(int levelUP) {
      this.levelUP = levelUP;
   }

   public static class Limit {
      private int min;
      private int max;

      public Limit(int min, int max) {
         this.min = min;
         this.max = max;
      }

      public int getMin() {
         return this.min;
      }

      public void setMin(int min) {
         this.min = min;
      }

      public int getMax() {
         return this.max;
      }

      public void setMax(int max) {
         this.max = max;
      }
   }
}
