package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FirstYearResignTimes"
)
public class FirstYearResignTimesModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "补签次数"
   )
   private int resignTimes;
   @ModelColumnAnno(
      comment = "累充元宝数"
   )
   private int value;

   public int getResignTimes() {
      return this.resignTimes;
   }

   public int getValue() {
      return this.value;
   }
}
