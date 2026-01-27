package com.gzbz.model;

import com.gzbz.model.fun.ArtifactSkillPropertyFun;
import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifact"
)
public class ArtifactModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "神兵id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "神兵名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "describe",
      comment = "神兵描述"
   )
   private String describe;
   @ModelColumnAnno(
      columnName = "skillKey",
      comment = "技能Key"
   )
   private int skillKey;
   @ModelColumnAnno(
      columnName = "nextId",
      comment = "下一个开启神兵"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "artifactSkill",
      comment = "神兵技能"
   )
   private int artifactSkill;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "tasks",
      subCls = Integer.class,
      count = 4,
      comment = "神兵任务"
   )
   private Map<Integer, Integer> tasks = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 1,
      columnName = "passiveBuffs",
      subCls = ArtifactSkillPropertyFun.class,
      count = 3,
      comment = "神兵任务"
   )
   private Map<Integer, ArtifactSkillPropertyFun> passiveBuffs = new TreeMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public String getDescribe() {
      return this.describe;
   }

   public void setDescribe(String describe) {
      this.checkModify();
      this.describe = describe;
   }

   public int getSkillKey() {
      return this.skillKey;
   }

   public void setSkillKey(int skillKey) {
      this.checkModify();
      this.skillKey = skillKey;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getArtifactSkill() {
      return this.artifactSkill;
   }

   public void setArtifactSkill(int artifactSkill) {
      this.checkModify();
      this.artifactSkill = artifactSkill;
   }

   public Map<Integer, Integer> getTasks() {
      return this.tasks;
   }

   public void setTasks(Map<Integer, Integer> tasks) {
      this.checkModify();
      this.tasks = tasks;
   }

   public Map<Integer, ArtifactSkillPropertyFun> getPassiveBuffs() {
      return this.passiveBuffs;
   }

   public void setPassiveBuffs(Map<Integer, ArtifactSkillPropertyFun> passiveBuffs) {
      this.checkModify();
      this.passiveBuffs = passiveBuffs;
   }
}
