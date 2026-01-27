package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "upgrade"
)
public class UpgradeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "playerExp",
      comment = "君主等级经验需求"
   )
   private int playerExp;
   @ModelColumnAnno(
      columnName = "heroExp",
      comment = "英雄升级需要经验"
   )
   private int heroExp;
   @ModelColumnAnno(
      columnName = "expCost",
      comment = "武将经验升级消耗"
   )
   private int expCost;
   @ModelColumnAnno(
      columnName = "silverCost",
      comment = "铜钱升级消耗"
   )
   private int silverCost;
   @ModelColumnAnno(
      columnName = "nextLevel",
      comment = "武将下一级别"
   )
   private int nextLevel;
   @ModelColumnAnno(
      columnName = "levelUpReward",
      comment = "升级奖励元宝数"
   )
   private int levelUpReward;
   @ModelColumnAnno(
      columnName = "openContent",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "升級內容"
   )
   private List<Integer> openContent;
   @ModelColumnAnno(
      columnName = "breachAddCombat",
      comment = "升阶战力加成"
   )
   private int breachAddCombat;
   @ModelColumnAnno(
      columnName = "starAddCombat",
      comment = "升星战力加成"
   )
   private int starAddCombat;
   @ModelColumnAnno(
      columnName = "propertyAddCombat",
      comment = "属性加成战力"
   )
   private String propertyAddCombat;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "equipCastCombat",
      subCls = Integer.class,
      count = 4,
      comment = "装备铸魂战力"
   )
   private HashMap<Integer, Integer> equipCastCombat = new HashMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "talentCombat",
      subCls = Integer.class,
      count = 8,
      comment = "天赋加成"
   )
   private HashMap<Integer, Integer> talentCombat = new HashMap();
   @ModelColumnAnno(
      columnName = "petUpExp",
      comment = "神兽升级经验"
   )
   private int petUpExp;
   @ModelColumnAnno(
      columnName = "petStar",
      comment = "神兽星级战力加成"
   )
   private int petStar;
   @ModelColumnAnno(
      columnName = "petFly",
      comment = "神兽飞升战力加成"
   )
   private int petFly;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getPlayerExp() {
      return this.playerExp;
   }

   public void setPlayerExp(int playerExp) {
      this.checkModify();
      this.playerExp = playerExp;
   }

   public int getHeroExp() {
      return this.heroExp;
   }

   public void setHeroExp(int heroExp) {
      this.checkModify();
      this.heroExp = heroExp;
   }

   public int getExpCost() {
      return this.expCost;
   }

   public void setExpCost(int expCost) {
      this.checkModify();
      this.expCost = expCost;
   }

   public int getSilverCost() {
      return this.silverCost;
   }

   public void setSilverCost(int silverCost) {
      this.checkModify();
      this.silverCost = silverCost;
   }

   public int getNextLevel() {
      return this.nextLevel;
   }

   public void setNextLevel(int nextLevel) {
      this.checkModify();
      this.nextLevel = nextLevel;
   }

   public int getLevelUpReward() {
      return this.levelUpReward;
   }

   public void setLevelUpReward(int levelUpReward) {
      this.checkModify();
      this.levelUpReward = levelUpReward;
   }

   public List<Integer> getOpenContent() {
      return this.openContent;
   }

   public void setOpenContent(List<Integer> openContent) {
      this.checkModify();
      this.openContent = openContent;
   }

   public int getBreachAddCombat() {
      return this.breachAddCombat;
   }

   public void setBreachAddCombat(int breachAddCombat) {
      this.checkModify();
      this.breachAddCombat = breachAddCombat;
   }

   public int getStarAddCombat() {
      return this.starAddCombat;
   }

   public void setStarAddCombat(int starAddCombat) {
      this.checkModify();
      this.starAddCombat = starAddCombat;
   }

   public String getPropertyAddCombat() {
      return this.propertyAddCombat;
   }

   public void setPropertyAddCombat(String propertyAddCombat) {
      this.checkModify();
      this.propertyAddCombat = propertyAddCombat;
   }

   public HashMap<Integer, Integer> getEquipCastCombat() {
      return this.equipCastCombat;
   }

   public void setEquipCastCombat(HashMap<Integer, Integer> equipCastCombat) {
      this.equipCastCombat = equipCastCombat;
   }

   public HashMap<Integer, Integer> getTalentCombat() {
      return this.talentCombat;
   }

   public void setTalentCombat(HashMap<Integer, Integer> talentCombat) {
      this.checkModify();
      this.talentCombat = talentCombat;
   }

   public int getPetUpExp() {
      return this.petUpExp;
   }

   public void setPetUpExp(int petUpExp) {
      this.checkModify();
      this.petUpExp = petUpExp;
   }

   public int getPetStar() {
      return this.petStar;
   }

   public void setPetStar(int petStar) {
      this.checkModify();
      this.petStar = petStar;
   }

   public int getPetFly() {
      return this.petFly;
   }

   public void setPetFly(int petFly) {
      this.checkModify();
      this.petFly = petFly;
   }
}
