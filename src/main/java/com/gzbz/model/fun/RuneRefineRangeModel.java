package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class RuneRefineRangeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "quality",
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "min",
      comment = "最小值"
   )
   private int min;
   @ModelColumnAnno(
      columnName = "max",
      comment = "最大值"
   )
   private int max;

   public RuneRefineRangeModel() {
   }

   public RuneRefineRangeModel(int quality, int min, int max) {
      this.quality = quality;
      this.min = min;
      this.max = max;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getMin() {
      return this.min;
   }

   public void setMin(int min) {
      this.checkModify();
      this.min = min;
   }

   public int getMax() {
      return this.max;
   }

   public void setMax(int max) {
      this.checkModify();
      this.max = max;
   }
}
