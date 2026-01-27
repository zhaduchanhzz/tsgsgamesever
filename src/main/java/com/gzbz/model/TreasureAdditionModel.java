package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "treasureAddition"
)
public class TreasureAdditionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "下一级"
   )
   private int nextLv;
   @ModelColumnAnno(
      comment = "所需经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "一次增加经验值"
   )
   private int upgradeExp;
   @ModelColumnAnno(
      comment = "总经验给予攻击"
   )
   private int proAtk;
   @ModelColumnAnno(
      comment = "总经验给予生命"
   )
   private int proHp;
   @ModelColumnAnno(
      comment = "需求道具类型"
   )
   private int itemType1;
   @ModelColumnAnno(
      comment = "需求道具id"
   )
   private int itemId1;
   @ModelColumnAnno(
      comment = "需求道具数量"
   )
   private int itemNum1;
   @ModelColumnAnno(
      comment = "需求道具类型"
   )
   private int itemType2;
   @ModelColumnAnno(
      comment = "需求道具id"
   )
   private String itemId2;
   @ModelColumnAnno(
      comment = "需求道具数量"
   )
   private int itemNum2;
   @ModelColumnAnno(
      comment = "每升一级给予攻击"
   )
   private int levelUpAtk;
   @ModelColumnAnno(
      comment = "每升一级给予生命"
   )
   private int levelUpHp;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public int getUpgradeExp() {
      return this.upgradeExp;
   }

   public void setUpgradeExp(int upgradeExp) {
      this.checkModify();
      this.upgradeExp = upgradeExp;
   }

   public int getProAtk() {
      return this.proAtk;
   }

   public void setProAtk(int proAtk) {
      this.checkModify();
      this.proAtk = proAtk;
   }

   public int getProHp() {
      return this.proHp;
   }

   public void setProHp(int proHp) {
      this.checkModify();
      this.proHp = proHp;
   }

   public int getItemType1() {
      return this.itemType1;
   }

   public void setItemType1(int itemType1) {
      this.checkModify();
      this.itemType1 = itemType1;
   }

   public int getItemId1() {
      return this.itemId1;
   }

   public void setItemId1(int itemId1) {
      this.checkModify();
      this.itemId1 = itemId1;
   }

   public int getItemNum1() {
      return this.itemNum1;
   }

   public void setItemNum1(int itemNum1) {
      this.checkModify();
      this.itemNum1 = itemNum1;
   }

   public int getItemType2() {
      return this.itemType2;
   }

   public void setItemType2(int itemType2) {
      this.checkModify();
      this.itemType2 = itemType2;
   }

   public String getItemId2() {
      return this.itemId2;
   }

   public void setItemId2(String itemId2) {
      this.checkModify();
      this.itemId2 = itemId2;
   }

   public int getItemNum2() {
      return this.itemNum2;
   }

   public void setItemNum2(int itemNum2) {
      this.checkModify();
      this.itemNum2 = itemNum2;
   }

   public int getLevelUpAtk() {
      return this.levelUpAtk;
   }

   public void setLevelUpAtk(int levelUpAtk) {
      this.checkModify();
      this.levelUpAtk = levelUpAtk;
   }

   public int getLevelUpHp() {
      return this.levelUpHp;
   }

   public void setLevelUpHp(int levelUpHp) {
      this.checkModify();
      this.levelUpHp = levelUpHp;
   }

   public int getNextLv() {
      return this.nextLv;
   }

   public void setNextLv(int nextLv) {
      this.nextLv = nextLv;
   }
}
