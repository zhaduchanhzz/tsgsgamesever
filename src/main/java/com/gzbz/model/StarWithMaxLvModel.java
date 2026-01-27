package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "StarWithMaxLv"
)
public class StarWithMaxLvModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "star"
   )
   private int star;
   @ModelColumnAnno(
      comment = "最高等级"
   )
   private int maxLv;

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getMaxLv() {
      return this.maxLv;
   }

   public void setMaxLv(int maxLv) {
      this.checkModify();
      this.maxLv = maxLv;
   }
}
