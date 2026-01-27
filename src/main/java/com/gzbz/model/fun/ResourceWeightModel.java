package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ResourceWeightModel extends BaseModel {
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
      columnName = "weight",
      comment = "随机权重"
   )
   private int weight;

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
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
}
