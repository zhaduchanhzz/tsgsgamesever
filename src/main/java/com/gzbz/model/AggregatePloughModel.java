package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "aggregatePlough"
)
public class AggregatePloughModel extends BaseModel {
   @ModelColumnAnno(
      comment = "属性id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "科技分类"
   )
   private int tecType;
   @ModelColumnAnno(
      comment = "强化格子位置"
   )
   private int tecPlace;
   @ModelColumnAnno(
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "属性加成",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1
   )
   private List<PropertyModel> properties = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AggregatePloughModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AggregatePloughModel model = (AggregatePloughModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.tecType, (v) -> new ConcurrentHashMap())).put(model.tecPlace, model);
      }

      pool.putMap("customAggregatePlough", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTecType() {
      return this.tecType;
   }

   public void setTecType(int tecType) {
      this.checkModify();
      this.tecType = tecType;
   }

   public int getTecPlace() {
      return this.tecPlace;
   }

   public void setTecPlace(int tecPlace) {
      this.checkModify();
      this.tecPlace = tecPlace;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }
}
