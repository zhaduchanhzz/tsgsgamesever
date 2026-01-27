package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastNeiDanType"
)
public class GodBeastNeiDanTypeModel extends BaseModel {
   @ModelColumnAnno(
      comment = "种类id",
      isPrimaty = true
   )
   private int typeId;
   @ModelColumnAnno(
      comment = "种类抽取权重"
   )
   private int typeWeight;

   public int getTypeId() {
      return this.typeId;
   }

   public void setTypeId(int typeId) {
      this.checkModify();
      this.typeId = typeId;
   }

   public int getTypeWeight() {
      return this.typeWeight;
   }

   public void setTypeWeight(int typeWeight) {
      this.checkModify();
      this.typeWeight = typeWeight;
   }
}
