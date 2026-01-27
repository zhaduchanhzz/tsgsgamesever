package com.gzbz.model;

import com.gzbz.model.fun.AideLevelPropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "aideLevel"
)
public class AideLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "副将id"
   )
   private int aideId;
   @ModelColumnAnno(
      comment = "副将名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "技能相关ID"
   )
   private int aideSkillId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = AideLevelPropertyModel.class,
      count = 4,
      comment = "属性加成"
   )
   private List<AideLevelPropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "升级需要材料"
   )
   private List<ResourceModel> needItems = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, AideLevelModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         AideLevelModel model = (AideLevelModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.aideId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customAideLevel", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAideId() {
      return this.aideId;
   }

   public void setAideId(int aideId) {
      this.checkModify();
      this.aideId = aideId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getAideSkillId() {
      return this.aideSkillId;
   }

   public void setAideSkillId(int aideSkillId) {
      this.checkModify();
      this.aideSkillId = aideSkillId;
   }

   public List<AideLevelPropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<AideLevelPropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public List<ResourceModel> getNeedItems() {
      return this.needItems;
   }

   public void setNeedItems(List<ResourceModel> needItems) {
      this.checkModify();
      this.needItems = needItems;
   }
}
