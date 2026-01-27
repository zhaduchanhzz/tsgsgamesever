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
   file = "totemBreach"
)
public class TotemBreachModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "图腾id"
   )
   private int totemId;
   @ModelColumnAnno(
      comment = "进阶等级"
   )
   private int breackLv;
   @ModelColumnAnno(
      comment = "最大等级"
   )
   private int limitLv;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "品质名称"
   )
   private String qualityName;
   @ModelColumnAnno(
      comment = "解锁技能"
   )
   private int skill;
   @ModelColumnAnno(
      comment = "属性",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2
   )
   private List<PropertyModel> propertys = new ArrayList();
   @ModelColumnAnno(
      comment = "进阶材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> needItems = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TotemBreachModel> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TotemBreachModel totemBreachModel = (TotemBreachModel)entry.getValue();
         String key = String.format("%d_%d", totemBreachModel.totemId, totemBreachModel.breackLv);
         tempHashMap.putIfAbsent(key, totemBreachModel);
      }

      pool.putMap("custom_totemBreach", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTotemId() {
      return this.totemId;
   }

   public void setTotemId(int totemId) {
      this.checkModify();
      this.totemId = totemId;
   }

   public int getBreackLv() {
      return this.breackLv;
   }

   public void setBreackLv(int breackLv) {
      this.checkModify();
      this.breackLv = breackLv;
   }

   public int getLimitLv() {
      return this.limitLv;
   }

   public void setLimitLv(int limitLv) {
      this.checkModify();
      this.limitLv = limitLv;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public String getQualityName() {
      return this.qualityName;
   }

   public void setQualityName(String qualityName) {
      this.checkModify();
      this.qualityName = qualityName;
   }

   public int getSkill() {
      return this.skill;
   }

   public void setSkill(int skill) {
      this.checkModify();
      this.skill = skill;
   }

   public List<PropertyModel> getPropertys() {
      return this.propertys;
   }

   public void setPropertys(List<PropertyModel> propertys) {
      this.checkModify();
      this.propertys = propertys;
   }

   public List<ResourceModel> getNeedItems() {
      return this.needItems;
   }

   public void setNeedItems(List<ResourceModel> needItems) {
      this.checkModify();
      this.needItems = needItems;
   }
}
