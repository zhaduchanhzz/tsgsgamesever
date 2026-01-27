package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "divineGeneralsMaxLevel"
)
public class DivineGeneralsMaxLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "玩家等级"
   )
   private int playerLevel;
   @ModelColumnAnno(
      comment = "下一级提升"
   )
   private int nextLevelUp;
   @ModelColumnAnno(
      comment = "神将录等级上限"
   )
   private int divineGeneralsMaxLevel;

   public int getPlayerLevel() {
      return this.playerLevel;
   }

   public void setPlayerLevel(int playerLevel) {
      this.checkModify();
      this.playerLevel = playerLevel;
   }

   public int getNextLevelUp() {
      return this.nextLevelUp;
   }

   public void setNextLevelUp(int nextLevelUp) {
      this.checkModify();
      this.nextLevelUp = nextLevelUp;
   }

   public int getDivineGeneralsMaxLevel() {
      return this.divineGeneralsMaxLevel;
   }

   public void setDivineGeneralsMaxLevel(int divineGeneralsMaxLevel) {
      this.checkModify();
      this.divineGeneralsMaxLevel = divineGeneralsMaxLevel;
   }
}
