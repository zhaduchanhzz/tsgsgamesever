package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastLevelEXP"
)
public class GodBeastLevelEXPModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "升到下级所需经验值"
   )
   private int needEXP;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getNeedEXP() {
      return this.needEXP;
   }

   public void setNeedEXP(int needEXP) {
      this.checkModify();
      this.needEXP = needEXP;
   }
}
