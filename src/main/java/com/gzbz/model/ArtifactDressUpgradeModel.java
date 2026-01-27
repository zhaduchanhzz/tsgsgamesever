package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
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
   file = "artifactDressUpgrade"
)
public class ArtifactDressUpgradeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "dressid",
      comment = "时装ID"
   )
   private int dressid;
   @ModelColumnAnno(
      columnName = "level",
      comment = "皮肤级别"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "nextLv",
      comment = "下一级"
   )
   private int nextLv;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      count = 2,
      subCls = ResourceModel.class,
      comment = "强化道具"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "propertys",
      columnConvertType = 1,
      count = 2,
      subCls = PropertyModel.class,
      comment = "强化属性"
   )
   private List<PropertyModel> propertys = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, ArtifactDressUpgradeModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactDressUpgradeModel model = (ArtifactDressUpgradeModel)entry.getValue();
         Map<Integer, ArtifactDressUpgradeModel> modelMap = (Map)tempHashMap.get(model.dressid);
         if (modelMap == null) {
            modelMap = new HashMap();
         }

         modelMap.put(model.level, model);
         tempHashMap.put(model.dressid, modelMap);
      }

      pool.putMap("customArtifactSkin", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDressid() {
      return this.dressid;
   }

   public void setDressid(int dressid) {
      this.checkModify();
      this.dressid = dressid;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getNextLv() {
      return this.nextLv;
   }

   public void setNextLv(int nextLv) {
      this.checkModify();
      this.nextLv = nextLv;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public List<PropertyModel> getPropertys() {
      return this.propertys;
   }

   public void setPropertys(List<PropertyModel> propertys) {
      this.checkModify();
      this.propertys = propertys;
   }
}
