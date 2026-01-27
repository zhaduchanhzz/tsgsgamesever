package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "buyNumTime"
)
public class GeneralWelfareModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "时间"
   )
   private int time;
   @ModelColumnAnno(
      comment = "次数下限",
      columnName = "numMin"
   )
   private int min;
   @ModelColumnAnno(
      comment = "次数上限",
      columnName = "numMax"
   )
   private int max;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, GeneralWelfareModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GeneralWelfareModel model = (GeneralWelfareModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.getType(), (v) -> new TreeMap())).put(model.getId(), model);
      }

      pool.putMap("customBuyNumTime", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public int getTime() {
      return this.time;
   }

   public int getMin() {
      return this.min;
   }

   public int getMax() {
      return this.max;
   }
}
