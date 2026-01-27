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
   file = "aggregateUpLevel"
)
public class AggregateUpLevelModel extends BaseModel {
   @ModelColumnAnno(
      comment = "属性id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "强化类型"
   )
   private int tecPlace;
   @ModelColumnAnno(
      comment = "点亮次数"
   )
   private int lightenNum;
   @ModelColumnAnno(
      comment = "对应等级"
   )
   private int tecLevel;
   @ModelColumnAnno(
      comment = "点亮消耗",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> consumes = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AggregateUpLevelModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AggregateUpLevelModel model = (AggregateUpLevelModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.tecLevel, (v) -> new ConcurrentHashMap())).put(model.tecPlace, model);
      }

      pool.putMap("customAggregateUpLevel", tempHashMap);
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
