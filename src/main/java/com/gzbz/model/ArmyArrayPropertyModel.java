package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "armyArrayProperty"
)
public class ArmyArrayPropertyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   public int id;
   @ModelColumnAnno(
      comment = "阵营类型"
   )
   private int arrayId;
   @ModelColumnAnno(
      comment = "格子位置"
   )
   private int campType;
   @ModelColumnAnno(
      comment = "属性加成",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2
   )
   private List<PropertyModel> property = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, ArmyArrayPropertyModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArmyArrayPropertyModel model = (ArmyArrayPropertyModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(model.getArrayId(), (k) -> new HashMap())).put(model.getCampType(), model);
      }

      pool.putMap("curtomArmyArrayProperty", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getArrayId() {
      return this.arrayId;
   }

   public void setArrayId(int arrayId) {
      this.checkModify();
      this.arrayId = arrayId;
   }

   public int getCampType() {
      return this.campType;
   }

   public void setCampType(int campType) {
      this.checkModify();
      this.campType = campType;
   }

   public List<PropertyModel> getProperty() {
      return this.property;
   }

   public void setProperty(List<PropertyModel> property) {
      this.checkModify();
      this.property = property;
   }
}
