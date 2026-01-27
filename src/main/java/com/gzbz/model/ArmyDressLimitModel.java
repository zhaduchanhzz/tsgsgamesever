package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "armyDressLimit"
)
public class ArmyDressLimitModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "时装id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "皮肤品质"
   )
   private int character;

   public int getId() {
      return this.id;
   }

   public int getCharacter() {
      return this.character;
   }
}
