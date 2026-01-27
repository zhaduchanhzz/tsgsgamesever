package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class NeedItemsFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "star",
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "num",
      comment = "数量"
   )
   private int num;

   public NeedItemsFun() {
   }

   public NeedItemsFun(int type, int star, int num) {
      this.type = type;
      this.star = star;
      this.num = num;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }
}
