package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarDefence"
)
public class CountryWarDefenceModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "战力最小值"
   )
   private long powerLow;
   @ModelColumnAnno(
      comment = "战力最大值"
   )
   private long powerMax;
   @ModelColumnAnno(
      comment = "破防系数"
   )
   private int coefficient;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public long getPowerLow() {
      return this.powerLow;
   }

   public void setPowerLow(long powerLow) {
      this.checkModify();
      this.powerLow = powerLow;
   }

   public long getPowerMax() {
      return this.powerMax;
   }

   public void setPowerMax(long powerMax) {
      this.checkModify();
      this.powerMax = powerMax;
   }

   public int getCoefficient() {
      return this.coefficient;
   }

   public void setCoefficient(int coefficient) {
      this.checkModify();
      this.coefficient = coefficient;
   }
}
