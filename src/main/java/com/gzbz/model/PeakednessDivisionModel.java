package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "peakednessDivision"
)
public class PeakednessDivisionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "赛区id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "赛区名字"
   )
   private String name;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }
}
