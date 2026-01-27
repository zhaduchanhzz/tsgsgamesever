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
   file = "heroPromoteLevel"
)
public class HeroPromoteLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int stage;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "消耗材料"
   )
   private List<ResourceModel> lvMaterials = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "属性加成"
   )
   private List<PropertyModel> lvProperties = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, HeroPromoteLevelModel>> temp = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroPromoteLevelModel model = (HeroPromoteLevelModel)entry.getValue();
         ((ConcurrentHashMap)temp.computeIfAbsent(model.getLv(), (v) -> new ConcurrentHashMap())).put(model.getStage(), model);
      }

      pool.putMap("customHeroPromoteLevel", temp);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public List<ResourceModel> getLvMaterials() {
      return this.lvMaterials;
   }

   public void setLvMaterials(List<ResourceModel> lvMaterials) {
      this.checkModify();
      this.lvMaterials = lvMaterials;
   }

   public List<PropertyModel> getLvProperties() {
      return this.lvProperties;
   }

   public void setLvProperties(List<PropertyModel> lvProperties) {
      this.checkModify();
      this.lvProperties = lvProperties;
   }
}
