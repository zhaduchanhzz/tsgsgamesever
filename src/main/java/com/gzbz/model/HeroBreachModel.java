package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroBreach"
)
public class HeroBreachModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "进阶等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "next",
      comment = "下一阶"
   )
   private int next;
   @ModelColumnAnno(
      columnName = "heroLevel",
      comment = "武将等级上限"
   )
   private int heroLevel;
   @ModelColumnAnno(
      columnName = "heroStar",
      comment = "该进阶等级所需武将星数"
   )
   private int heroStar;
   @ModelColumnAnno(
      columnName = "unlockSkill",
      comment = "解锁位置"
   )
   private int unlockSkillIndex;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "需求物品id"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "itemNum",
      comment = "需求物品数"
   )
   private int itemNum;
   @ModelColumnAnno(
      columnName = "copper",
      comment = "需求铜钱"
   )
   private int copper;
   @ModelColumnAnno(
      columnName = "hpAward",
      comment = "进阶生命成长系数"
   )
   private int hpAward;
   @ModelColumnAnno(
      columnName = "atkAward",
      comment = "进阶攻击成长系数"
   )
   private int atkAward;
   @ModelColumnAnno(
      columnName = "defAward",
      comment = "进阶防御成长系数"
   )
   private int defAward;
   @ModelColumnAnno(
      columnName = "spdAward",
      comment = "进阶速度成长系数"
   )
   private int spdAward;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getNext() {
      return this.next;
   }

   public void setNext(int next) {
      this.checkModify();
      this.next = next;
   }

   public int getHeroLevel() {
      return this.heroLevel;
   }

   public void setHeroLevel(int heroLevel) {
      this.checkModify();
      this.heroLevel = heroLevel;
   }

   public int getHeroStar() {
      return this.heroStar;
   }

   public void setHeroStar(int heroStar) {
      this.checkModify();
      this.heroStar = heroStar;
   }

   public int getUnlockSkillIndex() {
      return this.unlockSkillIndex;
   }

   public void setUnlockSkillIndex(int unlockSkillIndex) {
      this.checkModify();
      this.unlockSkillIndex = unlockSkillIndex;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getCopper() {
      return this.copper;
   }

   public void setCopper(int copper) {
      this.checkModify();
      this.copper = copper;
   }

   public int getHpAward() {
      return this.hpAward;
   }

   public void setHpAward(int hpAward) {
      this.checkModify();
      this.hpAward = hpAward;
   }

   public int getAtkAward() {
      return this.atkAward;
   }

   public void setAtkAward(int atkAward) {
      this.checkModify();
      this.atkAward = atkAward;
   }

   public int getDefAward() {
      return this.defAward;
   }

   public void setDefAward(int defAward) {
      this.checkModify();
      this.defAward = defAward;
   }

   public int getSpdAward() {
      return this.spdAward;
   }

   public void setSpdAward(int spdAward) {
      this.checkModify();
      this.spdAward = spdAward;
   }
}
