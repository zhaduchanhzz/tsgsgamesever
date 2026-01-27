package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ProbabilityReward extends BaseModel {
   @ModelColumnAnno(
      columnName = "itemType",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "itemValue",
      comment = "数量"
   )
   private int num;
   @ModelColumnAnno(
      columnName = "permillage",
      comment = "概率(千分比)"
   )
   private int permillage;

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }

   public int getPermillage() {
      return this.permillage;
   }

   public void setPermillage(int permillage) {
      this.checkModify();
      this.permillage = permillage;
   }
}
