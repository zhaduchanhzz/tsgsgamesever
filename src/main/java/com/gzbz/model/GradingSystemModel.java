package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "gradingSystem"
)
public class GradingSystemModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "lv",
      isPrimaty = true,
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "equipQualityStar",
      comment = "装备品质星级"
   )
   private int equipQualityStar;
   @ModelColumnAnno(
      columnName = "heroStar",
      comment = "武将星级"
   )
   private int heroStar;
   @ModelColumnAnno(
      columnName = "heroAdvanced",
      comment = "武将进阶"
   )
   private int heroAdvanced;
   @ModelColumnAnno(
      columnName = "unionTechnology",
      comment = "联盟科技"
   )
   private int unionTechnology;
   @ModelColumnAnno(
      columnName = "counsellor",
      comment = "神兵培养"
   )
   private int counsellor;
   @ModelColumnAnno(
      columnName = "warriorSignet",
      comment = "将印培养"
   )
   private int warriorSignet;
   @ModelColumnAnno(
      columnName = "equipEx",
      comment = "附魔培养"
   )
   private int equipEx;

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getEquipQualityStar() {
      return this.equipQualityStar;
   }

   public void setEquipQualityStar(int equipQualityStar) {
      this.checkModify();
      this.equipQualityStar = equipQualityStar;
   }

   public int getHeroStar() {
      return this.heroStar;
   }

   public void setHeroStar(int heroStar) {
      this.checkModify();
      this.heroStar = heroStar;
   }

   public int getHeroAdvanced() {
      return this.heroAdvanced;
   }

   public void setHeroAdvanced(int heroAdvanced) {
      this.checkModify();
      this.heroAdvanced = heroAdvanced;
   }

   public int getUnionTechnology() {
      return this.unionTechnology;
   }

   public void setUnionTechnology(int unionTechnology) {
      this.checkModify();
      this.unionTechnology = unionTechnology;
   }

   public int getCounsellor() {
      return this.counsellor;
   }

   public void setCounsellor(int counsellor) {
      this.checkModify();
      this.counsellor = counsellor;
   }

   public int getWarriorSignet() {
      return this.warriorSignet;
   }

   public void setWarriorSignet(int warriorSignet) {
      this.checkModify();
      this.warriorSignet = warriorSignet;
   }

   public int getEquipEx() {
      return this.equipEx;
   }

   public void setEquipEx(int equipEx) {
      this.checkModify();
      this.equipEx = equipEx;
   }
}
