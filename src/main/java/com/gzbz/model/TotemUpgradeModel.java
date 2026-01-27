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
   file = "totemUpgrade"
)
public class TotemUpgradeModel extends BaseModel {
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
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "属性",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2
   )
   private List<PropertyModel> propertys = new ArrayList();
   @ModelColumnAnno(
      comment = "升级材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> needItems = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TotemUpgradeModel> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TotemUpgradeModel totemUpgradeModel = (TotemUpgradeModel)entry.getValue();
         String key = String.format("%d_%d", totemUpgradeModel.totemId, totemUpgradeModel.level);
         tempHashMap.putIfAbsent(key, totemUpgradeModel);
      }

      pool.putMap("custom_totemUpgrade", tempHashMap);
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

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
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
