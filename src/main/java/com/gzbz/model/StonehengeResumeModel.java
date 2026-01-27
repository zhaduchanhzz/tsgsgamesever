package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stonehengeResume"
)
public class StonehengeResumeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "恢复类型"
   )
   private int resumeType;
   @ModelColumnAnno(
      comment = "恢复参数"
   )
   private int resumeValue;
   @ModelColumnAnno(
      comment = "恢复参数"
   )
   private int resumeValue2;

   public int getId() {
      return this.id;
   }

   public int getResumeType() {
      return this.resumeType;
   }

   public int getResumeValue() {
      return this.resumeValue;
   }

   public int getResumeValue2() {
      return this.resumeValue2;
   }
}
