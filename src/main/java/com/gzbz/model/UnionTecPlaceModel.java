package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "unionTecPlace"
)
public class UnionTecPlaceModel extends BaseModel {
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
      columnName = "tecLevel",
      comment = "对应等级"
   )
   private int tecLevel;
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
      ConcurrentHashMap<Integer, TreeMap<Integer, UnionTecPlaceModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionTecPlaceModel model = (UnionTecPlaceModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.tecPlace, (v) -> new TreeMap())).put(model.tecLevel, model);
      }

      pool.putMap("customUnionTecPlace", tempHashMap);
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

   public int getTecLevel() {
      return this.tecLevel;
   }

   public void setTecLevel(int tecLevel) {
      this.checkModify();
      this.tecLevel = tecLevel;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }
}
