package com.gzbz.model;

import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shopUnionWarLv"
)
public class ShopUnionWarLvModel extends ShopItemBaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "军团争霸商城等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "下一级"
   )
   private int nextLevel;
   @ModelColumnAnno(
      comment = "升到下一级经验"
   )
   private int needItemNum;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getNextLevel() {
      return this.nextLevel;
   }

   public void setNextLevel(int nextLevel) {
      this.checkModify();
      this.nextLevel = nextLevel;
   }

   public int getNeedItemNum() {
      return this.needItemNum;
   }

   public void setNeedItemNum(int needItemNum) {
      this.checkModify();
      this.needItemNum = needItemNum;
   }
}
