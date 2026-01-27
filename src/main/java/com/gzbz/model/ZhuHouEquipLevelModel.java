package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroGameLevel"
)
public class ZhuHouEquipLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "玩法等级"
   )
   private int id;
   @ModelColumnAnno(
      comment = "等级区间下限"
   )
   private int levelDown;
   @ModelColumnAnno(
      comment = "等级区间上限"
   )
   private int levelUP;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      comment = "等级权重"
   )
   private List<KeyValFun> level = new ArrayList();
   private static LinkedHashMap<Limit, List<KeyValFun>> levelEquipMap = new LinkedHashMap();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      levelEquipMap.clear();
      map.forEach((key, value) -> {
         ZhuHouEquipLevelModel model = (ZhuHouEquipLevelModel)value;
         Limit limit = new Limit(model.levelDown, model.levelUP);
         levelEquipMap.put(limit, model.level);
      });
      ConcurrentHashMap<String, Map<Limit, List<KeyValFun>>> tempMap = new ConcurrentHashMap();
      tempMap.put("customHeroGameLevel", levelEquipMap);
      pool.putMap("customHeroGameLevel", tempMap);
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
