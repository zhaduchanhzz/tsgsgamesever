package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarFlagProperty"
)
public class WarFlagPropertyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "属性值"
   )
   private int proprety;
   @ModelColumnAnno(
      comment = "属性加成"
   )
   private String propretyCount;
   @ModelColumnAnno(
      comment = "系数"
   )
   private int ratio;

   public int getProprety() {
      return this.proprety;
   }

   public void setProprety(int proprety) {
      this.checkModify();
      this.proprety = proprety;
   }

   public String getPropretyCount() {
      return this.propretyCount;
   }

   public void setPropretyCount(String propretyCount) {
      this.checkModify();
      this.propretyCount = propretyCount;
   }

   public int getRatio() {
      return this.ratio;
   }

   public void setRatio(int ratio) {
      this.checkModify();
      this.ratio = ratio;
   }
}
