package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "WorldCupCountry"
)
public class WorldCupCountryModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "队伍序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "国家名"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public String getDesc() {
      return this.desc;
   }
}
