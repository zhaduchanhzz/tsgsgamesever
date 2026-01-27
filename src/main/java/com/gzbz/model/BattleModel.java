package com.gzbz.model;

import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battle"
)
public class BattleModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "主id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "isGrowing",
      comment = "是否特殊成长"
   )
   private int isGrowing;
   @ModelColumnAnno(
      columnName = "name",
      comment = "战斗名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "monster",
      columnConvertType = 1,
      count = 6,
      subCls = BattleMonsterFun.class,
      comment = "怪物"
   )
   private List<BattleMonsterFun> monsters = new ArrayList();
   @ModelColumnAnno(
      columnName = "shield",
      comment = "是否屏蔽特殊加成"
   )
   private int shield;
   private int dragonId;
   private List<Integer> dragonSkills = new ArrayList();
   private int weaponId;
   private int weaponSkill;
   private int weaponSkillLv;
   private int beautyId;
   private int beautySkills;

   public int getDragonId() {
      return this.dragonId;
   }

   public void setDragonId(int dragonId) {
      this.checkModify();
      this.dragonId = dragonId;
   }

   public int getWeaponId() {
      return this.weaponId;
   }

   public void setWeaponId(int weaponId) {
      this.checkModify();
      this.weaponId = weaponId;
   }

   public List<Integer> getDragonSkills() {
      return this.dragonSkills;
   }

   public void setDragonSkills(List<Integer> dragonSkills) {
      this.checkModify();
      this.dragonSkills = dragonSkills;
   }

   public int getWeaponSkill() {
      return this.weaponSkill;
   }

   public void setWeaponSkill(int weaponSkill) {
      this.checkModify();
      this.weaponSkill = weaponSkill;
   }

   public int getWeaponSkillLv() {
      return this.weaponSkillLv;
   }

   public void setWeaponSkillLv(int weaponSkillLv) {
      this.checkModify();
      this.weaponSkillLv = weaponSkillLv;
   }

   public int getBeautySkills() {
      return this.beautySkills;
   }

   public void setBeautySkills(int beautySkills) {
      this.checkModify();
      this.beautySkills = beautySkills;
   }

   public int getBeautyId() {
      return this.beautyId;
   }

   public void setBeautyId(int beautyId) {
      this.checkModify();
      this.beautyId = beautyId;
   }

   public String toString() {
      String str = "";

      for(BattleMonsterFun func : this.monsters) {
         str = str + func.toString();
      }

      return str;
   }

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

   public List<BattleMonsterFun> getMonsters() {
      return this.monsters;
   }

   public void setMonsters(List<BattleMonsterFun> monsters) {
      this.checkModify();
      this.monsters = monsters;
   }

   public int getIsGrowing() {
      return this.isGrowing;
   }

   public void setIsGrowing(int isGrowing) {
      this.checkModify();
      this.isGrowing = isGrowing;
   }

   public int getShield() {
      return this.shield;
   }

   public void setShield(int shield) {
      this.checkModify();
      this.shield = shield;
   }

   public long getMasterHp() {
      long hp = 0L;
      BattlePKTeam right = new BattlePKTeam(this.getId());

      for(Entity entity : right.getEntityMap().values()) {
         hp += entity.getBaseProperty(1);
      }

      return hp;
   }
}
