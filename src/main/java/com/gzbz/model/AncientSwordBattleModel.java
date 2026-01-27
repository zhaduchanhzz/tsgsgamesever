package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "AncientSwordBattle"
)
public class AncientSwordBattleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "怪物类型(1每日 2每周)"
   )
   private int type;
   @ModelColumnAnno(
      comment = "怪物名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "刷出数量"
   )
   private int brushNum;
   @ModelColumnAnno(
      comment = "战力下限百分比"
   )
   private int fightPowerMin;
   @ModelColumnAnno(
      comment = "战力上限百分比"
   )
   private int fightPowerMax;
   @ModelColumnAnno(
      comment = "匹配扩大百分比"
   )
   private int upDownPrecent;
   @ModelColumnAnno(
      comment = "机器人组"
   )
   private int robotGroup;
   @ModelColumnAnno(
      comment = "回合数"
   )
   private byte boutCount;
   @ModelColumnAnno(
      comment = "刷新权重（周怪）"
   )
   private int renovateWeight;
   @ModelColumnAnno(
      comment = "胜利奖励组"
   )
   private int weaponWinGroup;
   @ModelColumnAnno(
      comment = "失败奖励组"
   )
   private int weaponLoseGroup;

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public String getName() {
      return this.name;
   }

   public int getBrushNum() {
      return this.brushNum;
   }

   public int getFightPowerMin() {
      return this.fightPowerMin;
   }

   public int getFightPowerMax() {
      return this.fightPowerMax;
   }

   public int getUpDownPrecent() {
      return this.upDownPrecent;
   }

   public int getRobotGroup() {
      return this.robotGroup;
   }

   public byte getBoutCount() {
      return this.boutCount;
   }

   public int getRenovateWeight() {
      return this.renovateWeight;
   }

   public int getWeaponWinGroup() {
      return this.weaponWinGroup;
   }

   public int getWeaponLoseGroup() {
      return this.weaponLoseGroup;
   }
}
