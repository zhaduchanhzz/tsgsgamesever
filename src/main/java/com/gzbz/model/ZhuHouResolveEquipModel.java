package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "heroGameDecompose"
)
public class ZhuHouResolveEquipModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "任务标题"
   )
   private int levelDown;
   @ModelColumnAnno(
      comment = "任务描述"
   )
   private int levelUP;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "分解补偿"
   )
   private List<ResourceModel> resolve = new ArrayList();
   @ModelColumnAnno(
      comment = "分解获得的经验值"
   )
   private int exp;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      LinkedHashMap<Limit, ZhuHouResolveEquipModel> resolveEquipMap = new LinkedHashMap();
      map.forEach((key, value) -> {
         ZhuHouResolveEquipModel model = (ZhuHouResolveEquipModel)value;
         Limit limit = new Limit(model.levelDown, model.levelUP);
         resolveEquipMap.put(limit, model);
      });
      ConcurrentHashMap<String, LinkedHashMap<Limit, ZhuHouResolveEquipModel>> tempMap = new ConcurrentHashMap();
      tempMap.put("customHeroGameDecompose", resolveEquipMap);
      pool.putMap("customHeroGameDecompose", tempMap);
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

   public List<ResourceModel> getResolve() {
      return this.resolve;
   }

   public void setResolve(List<ResourceModel> resolve) {
      this.resolve = resolve;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.exp = exp;
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
