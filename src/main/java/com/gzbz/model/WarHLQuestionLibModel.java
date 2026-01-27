package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLQuestionLib"
)
public class WarHLQuestionLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "问题描述"
   )
   private String question;
   @ModelColumnAnno(
      comment = "答案1"
   )
   private String option1;
   @ModelColumnAnno(
      comment = "答案2"
   )
   private String option2;
   @ModelColumnAnno(
      comment = "答案3"
   )
   private String option3;
   @ModelColumnAnno(
      comment = "答案4"
   )
   private String option4;
   @ModelColumnAnno(
      comment = "正确答案序号"
   )
   private int trueOption;
   @ModelColumnAnno(
      comment = "权重占比"
   )
   private int pro;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getQuestion() {
      return this.question;
   }

   public void setQuestion(String question) {
      this.checkModify();
      this.question = question;
   }

   public String getOption1() {
      return this.option1;
   }

   public void setOption1(String option1) {
      this.checkModify();
      this.option1 = option1;
   }

   public String getOption2() {
      return this.option2;
   }

   public void setOption2(String option2) {
      this.checkModify();
      this.option2 = option2;
   }

   public String getOption3() {
      return this.option3;
   }

   public void setOption3(String option3) {
      this.checkModify();
      this.option3 = option3;
   }

   public String getOption4() {
      return this.option4;
   }

   public void setOption4(String option4) {
      this.checkModify();
      this.option4 = option4;
   }

   public int getTrueOption() {
      return this.trueOption;
   }

   public void setTrueOption(int trueOption) {
      this.checkModify();
      this.trueOption = trueOption;
   }

   public int getPro() {
      return this.pro;
   }

   public void setPro(int pro) {
      this.checkModify();
      this.pro = pro;
   }
}
