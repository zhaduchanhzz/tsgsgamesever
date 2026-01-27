package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "pkLvAndStar"
)
public class PkLvAndStarModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "index",
      isPrimaty = true,
      comment = "位置"
   )
   private int index;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "star",
      comment = "星级"
   )
   private int star;

   public int getIndex() {
      return this.index;
   }

   public void setIndex(int index) {
      this.checkModify();
      this.index = index;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }
}
