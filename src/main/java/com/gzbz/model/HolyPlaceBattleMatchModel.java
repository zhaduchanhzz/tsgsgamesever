package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "holyPlaceBattleMatch"
)
public class HolyPlaceBattleMatchModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "minPower",
      comment = "最小战力"
   )
   private int minPower;
   @ModelColumnAnno(
      columnName = "maxPower",
      comment = "最大战力"
   )
   private int maxPower;
   @ModelColumnAnno(
      columnName = "easyBattle",
      comment = "简单战斗"
   )
   private int easyBattle;
   @ModelColumnAnno(
      columnName = "normalBattle",
      comment = "普通战斗"
   )
   private int normalBattle;
   @ModelColumnAnno(
      columnName = "hardBattle",
      comment = "困难战斗"
   )
   private int hardBattle;
   @ModelColumnAnno(
      columnName = "hellBattle",
      comment = "噩梦战斗"
   )
   private int hellBattle;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMinPower() {
      return this.minPower;
   }

   public void setMinPower(int minPower) {
      this.checkModify();
      this.minPower = minPower;
   }

   public int getMaxPower() {
      return this.maxPower;
   }

   public void setMaxPower(int maxPower) {
      this.checkModify();
      this.maxPower = maxPower;
   }

   public int getEasyBattle() {
      return this.easyBattle;
   }

   public void setEasyBattle(int easyBattle) {
      this.checkModify();
      this.easyBattle = easyBattle;
   }

   public int getNormalBattle() {
      return this.normalBattle;
   }

   public void setNormalBattle(int normalBattle) {
      this.checkModify();
      this.normalBattle = normalBattle;
   }

   public int getHardBattle() {
      return this.hardBattle;
   }

   public void setHardBattle(int hardBattle) {
      this.checkModify();
      this.hardBattle = hardBattle;
   }

   public int getHellBattle() {
      return this.hellBattle;
   }

   public void setHellBattle(int hellBattle) {
      this.checkModify();
      this.hellBattle = hellBattle;
   }
}
