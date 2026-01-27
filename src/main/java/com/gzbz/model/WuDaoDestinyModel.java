package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wudaoDestiny"
)
public class WuDaoDestinyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "武将序号"
   )
   private int id;
   @ModelColumnAnno
   private int star;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }
}
