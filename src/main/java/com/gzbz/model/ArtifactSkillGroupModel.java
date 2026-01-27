package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "artifactSkillGroup"
)
public class ArtifactSkillGroupModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "dressId",
      comment = "幻化ID"
   )
   private int dressId;
   @ModelColumnAnno(
      columnName = "level",
      comment = "技能级别"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "dressSkills",
      subCls = Integer.class,
      count = 5,
      comment = "幻化技能"
   )
   private Map<Integer, Integer> dressSkills = new TreeMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDressId() {
      return this.dressId;
   }

   public void setDressId(int dressId) {
      this.checkModify();
      this.dressId = dressId;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public Map<Integer, Integer> getDressSkills() {
      return this.dressSkills;
   }

   public void setDressSkills(Map<Integer, Integer> dressSkills) {
      this.checkModify();
      this.dressSkills = dressSkills;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, ArtifactSkillGroupModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactSkillGroupModel model = (ArtifactSkillGroupModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.getDressId(), (v) -> new ConcurrentHashMap())).put(model.getLevel(), model);
      }

      pool.putMap("customArtifactSkillGroup", tempHashMap);
   }
}
