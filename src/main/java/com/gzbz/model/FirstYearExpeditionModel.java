package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FirstYearExpendition"
)
public class FirstYearExpeditionModel extends BaseModel {
   @ModelColumnAnno(
      comment = "远征章节id",
      isPrimaty = true
   )
   private int chapterId;
   @ModelColumnAnno(
      comment = "系统id"
   )
   private int systemId;
   @ModelColumnAnno(
      comment = "开启天数"
   )
   private int openDay;

   public int getChapterId() {
      return this.chapterId;
   }

   public int getSystemId() {
      return this.systemId;
   }

   public int getOpenDay() {
      return this.openDay;
   }
}
