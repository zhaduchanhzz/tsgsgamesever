package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "dragonStrengthenCost"
)
public class DragonStrengthenCostModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "属性id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "tecPlace",
      comment = "强化格子位置"
   )
   private int tecPlace;
   @ModelColumnAnno(
      columnName = "lightenNum",
      comment = "点亮次数"
   )
   private int lightenNum;
   @ModelColumnAnno(
      columnName = "chapter",
      comment = "对应章节"
   )
   private int chapter;
   @ModelColumnAnno(
      columnName = "consumes",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "点亮消耗"
   )
   private List<ResourceModel> consumes = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DragonStrengthenCostModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DragonStrengthenCostModel model = (DragonStrengthenCostModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.lightenNum, (v) -> new ConcurrentHashMap())).put(model.tecPlace, model);
      }

      pool.putMap("customDragonStrengthenCost", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTecPlace() {
      return this.tecPlace;
   }

   public void setTecPlace(int tecPlace) {
      this.checkModify();
      this.tecPlace = tecPlace;
   }

   public int getLightenNum() {
      return this.lightenNum;
   }

   public void setLightenNum(int lightenNum) {
      this.checkModify();
      this.lightenNum = lightenNum;
   }

   public int getChapter() {
      return this.chapter;
   }

   public void setChapter(int chapter) {
      this.chapter = chapter;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }
}
