package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuMapFragment"
)
public class FaQiuMapFragmentModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;

   public int getId() {
      return this.id;
   }
}
