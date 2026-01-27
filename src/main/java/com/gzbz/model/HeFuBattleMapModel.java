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
   file = "HefuBattleMap"
)
public class HeFuBattleMapModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "关卡id"
   )
   private int chapterId;
   @ModelColumnAnno(
      comment = "格子"
   )
   private int grid;
   @ModelColumnAnno(
      comment = "地块类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "建筑类型"
   )
   private int buildingType;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, HeFuBattleMapModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeFuBattleMapModel model = (HeFuBattleMapModel)entry.getValue();
         ((TreeMap)tempMap.computeIfAbsent(model.getChapterId(), (v) -> new TreeMap())).put(model.getGrid(), model);
      }

      pool.putMap("customHefuBattleMap", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.checkModify();
      this.chapterId = chapterId;
   }

   public int getGrid() {
      return this.grid;
   }

   public void setGrid(int grid) {
      this.checkModify();
      this.grid = grid;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getBuildingType() {
      return this.buildingType;
   }

   public void setBuildingType(int buildingType) {
      this.checkModify();
      this.buildingType = buildingType;
   }
}
