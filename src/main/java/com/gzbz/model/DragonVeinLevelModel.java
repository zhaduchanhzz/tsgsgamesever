package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DragonVeinLevel"
)
public class DragonVeinLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "等级id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "升到下一级需要的经验"
   )
   private int exp;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }
}
