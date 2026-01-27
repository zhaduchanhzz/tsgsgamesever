package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class NeedItemsFun2 extends BaseModel {
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
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "道具id"
   )
   private int itemId;

   public NeedItemsFun2() {
   }

   public NeedItemsFun2(int type, int star, int num) {
      this.type = type;
      this.star = star;
      this.num = num;
   }

   public NeedItemsFun2(int type, int star, int num, int itemId) {
      this.type = type;
      this.star = star;
      this.num = num;
      this.itemId = itemId;
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

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }
}
