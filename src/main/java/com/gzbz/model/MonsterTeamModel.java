package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "monsterTeam"
)
public class MonsterTeamModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "heros",
      subCls = Integer.class,
      count = 5,
      comment = "英雄"
   )
   private Map<Integer, Integer> heros = new TreeMap();
   @ModelColumnAnno(
      columnName = "artifactId",
      comment = "神兵"
   )
   private int artifact;
   @ModelColumnAnno(
      columnName = "artifactSkillLv",
      comment = "神兵技能等级"
   )
   private int artifactSkillLv;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getArtifact() {
      return this.artifact;
   }

   public void setArtifact(int artifact) {
      this.checkModify();
      this.artifact = artifact;
   }

   public int getArtifactSkillLv() {
      return this.artifactSkillLv;
   }

   public void setArtifactSkillLv(int artifactSkillLv) {
      this.checkModify();
      this.artifactSkillLv = artifactSkillLv;
   }

   public Map<Integer, Integer> getHeros() {
      return this.heros;
   }

   public void setHeros(Map<Integer, Integer> heros) {
      this.checkModify();
      this.heros = heros;
   }
}
