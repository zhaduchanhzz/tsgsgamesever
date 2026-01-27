package com.gzbz.model;

import com.gzbz.model.fun.WarriorsModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "battleMonsterWear"
)
public class BattleMonsterWearModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "职业"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "warriors",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warriors = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public List<WarriorsModel> getWarriors() {
      return this.warriors;
   }

   public void setWarriors(List<WarriorsModel> warriors) {
      this.checkModify();
      this.warriors = warriors;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, BattleMonsterWearModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         BattleMonsterWearModel model = (BattleMonsterWearModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.type, (v) -> new TreeMap())).put(model.lv, model);
      }

      pool.putMap("customBattleMonsterWear", tempHashMap);
   }
}
