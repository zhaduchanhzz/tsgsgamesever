package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ExclusiveWeaponLevel"
)
public class ExclusiveWeaponLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "升到下一级需要的经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "等级对应的已获得经验"
   )
   private int getEX;

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public int getGetEX() {
      return this.getEX;
   }

   public void setGetEX(int getEX) {
      this.checkModify();
      this.getEX = getEX;
   }
}
