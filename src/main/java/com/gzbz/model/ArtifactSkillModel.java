package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactSkill"
)
public class ArtifactSkillModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "技能级别"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "strongLv",
      comment = "需要强化等级"
   )
   private int strongLv;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "道具"
   )
   private ArrayList<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "skills",
      subCls = Integer.class,
      count = 5,
      comment = "神兵技能"
   )
   private Map<Integer, Integer> skills = new TreeMap();
   @ModelColumnAnno(
      columnName = "buffId",
      comment = "被动技能ID"
   )
   private int buffId;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getStrongLv() {
      return this.strongLv;
   }

   public void setStrongLv(int strongLv) {
      this.checkModify();
      this.strongLv = strongLv;
   }

   public ArrayList<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(ArrayList<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getBuffId() {
      return this.buffId;
   }

   public void setBuffId(int buffId) {
      this.checkModify();
      this.buffId = buffId;
   }

   public Map<Integer, Integer> getSkills() {
      return this.skills;
   }

   public void setSkills(Map<Integer, Integer> skills) {
      this.checkModify();
      this.skills = skills;
   }
}
