package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ResourceBackModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "id",
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "value",
      comment = "数量"
   )
   private int value;
   @ModelColumnAnno(
      columnName = "back",
      comment = "重置返还数量"
   )
   private int back;

   public ResourceBackModel() {
   }

   public ResourceBackModel(int type, int id, int value, int back) {
      this.type = type;
      this.id = id;
      this.value = value;
      this.back = back;
   }

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

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public int getBack() {
      return this.back;
   }

   public void setBack(int back) {
      this.checkModify();
      this.back = back;
   }
}
