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
   file = "dragonStrengthen"
)
public class DragonStrengthenModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "强化格子位置"
   )
   private int tecPlace;
   @ModelColumnAnno(
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "属性加成"
   )
   private List<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      comment = "最小次数"
   )
   private int minCount;
   @ModelColumnAnno(
      comment = "最大次数"
   )
   private int maxCount;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<DragonStrengthenModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DragonStrengthenModel model = (DragonStrengthenModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getTecPlace(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customDragonStrengthen", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
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

   public int getMinCount() {
      return this.minCount;
   }

   public void setMinCount(int minCount) {
      this.checkModify();
      this.minCount = minCount;
   }

   public int getMaxCount() {
      return this.maxCount;
   }

   public void setMaxCount(int maxCount) {
      this.checkModify();
      this.maxCount = maxCount;
   }
}
