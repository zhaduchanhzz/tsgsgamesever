package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stoneCircleSecretEvent"
)
public class StoneCircleSecretEventModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "事件类型"
   )
   private int unitType;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getUnitType() {
      return this.unitType;
   }

   public void setUnitType(int unitType) {
      this.checkModify();
      this.unitType = unitType;
   }
}
