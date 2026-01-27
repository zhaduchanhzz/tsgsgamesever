package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "WorldPaintLevel"
)
public class WorldPaintLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int grade;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "下一步id"
   )
   private int nextId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "突破-属性加成"
   )
   private ArrayList<PropertyModel> topProperties = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "消耗材料"
   )
   private ArrayList<ResourceModel> materials = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, WorldPaintLevelModel> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         WorldPaintLevelModel model = (WorldPaintLevelModel)entry.getValue();
         String key = model.getType() + "_" + model.getGrade() + "_" + model.getLv();
         allMap.put(key, model);
      }

      pool.putMap("customWorldPaintLevel", allMap);
   }

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

   public int getGrade() {
      return this.grade;
   }

   public void setGrade(int grade) {
      this.checkModify();
      this.grade = grade;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public ArrayList<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(ArrayList<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public ArrayList<PropertyModel> getTopProperties() {
      return this.topProperties;
   }

   public void setTopProperties(ArrayList<PropertyModel> topProperties) {
      this.checkModify();
      this.topProperties = topProperties;
   }

   public ArrayList<ResourceModel> getMaterials() {
      return this.materials;
   }

   public void setMaterials(ArrayList<ResourceModel> materials) {
      this.checkModify();
      this.materials = materials;
   }
}
