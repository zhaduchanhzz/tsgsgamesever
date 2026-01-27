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
   file = "unionTec"
)
public class UnionTecModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "属性id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "tecType",
      comment = "联盟科技分类"
   )
   private int tecType;
   @ModelColumnAnno(
      columnName = "tecPlace",
      comment = "强化格子位置"
   )
   private int tecPlace;
   @ModelColumnAnno(
      columnName = "icon",
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      columnName = "properties",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "属性加成"
   )
   private List<PropertyModel> properties = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, UnionTecModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionTecModel model = (UnionTecModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.tecType, (v) -> new ConcurrentHashMap())).put(model.tecPlace, model);
      }

      pool.putMap("customUnionTec", tempHashMap);
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
