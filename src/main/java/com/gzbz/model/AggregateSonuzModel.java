package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "aggregateSonuz"
)
public class AggregateSonuzModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阵营"
   )
   private int camp;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "聚义厅等级限制"
   )
   private int hallLvLimit;
   @ModelColumnAnno(
      comment = "属性加成",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 6
   )
   private List<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      comment = "消耗材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> resources = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AggregateSonuzModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AggregateSonuzModel model = (AggregateSonuzModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.camp, (v) -> new ConcurrentHashMap())).put(model.lv, model);
      }

      pool.putMap("customAggregateSonuz", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setCamp(int camp) {
      this.checkModify();
      this.camp = camp;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getHallLvLimit() {
      return this.hallLvLimit;
   }

   public void setHallLvLimit(int hallLvLimit) {
      this.checkModify();
      this.hallLvLimit = hallLvLimit;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public List<ResourceModel> getResources() {
      return this.resources;
   }

   public void setResources(List<ResourceModel> resources) {
      this.checkModify();
      this.resources = resources;
   }
}
