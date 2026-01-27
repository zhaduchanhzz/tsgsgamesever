package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "JiuZhouRankDivide"
)
public class SupremePvpGradeModel extends BaseModel {
   @ModelColumnAnno(
      comment = "段位",
      isPrimaty = true,
      columnName = "id"
   )
   private int grade;
   @ModelColumnAnno(
      comment = "段位名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "跨服范围"
   )
   private int server;
   @ModelColumnAnno(
      comment = "分组人数上限"
   )
   private int people;
   @ModelColumnAnno(
      comment = "结算类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "升段人数"
   )
   private int rise;
   @ModelColumnAnno(
      comment = "保段人数"
   )
   private int keep;
   @ModelColumnAnno(
      comment = "降段人数"
   )
   private int reduce;
   @ModelColumnAnno(
      comment = "保段百分比"
   )
   private int keepPercent;
   @ModelColumnAnno(
      comment = "达成段位称号"
   )
   private int prestige;

   public int getGrade() {
      return this.grade;
   }

   public int getRise() {
      return this.rise;
   }

   public int getReduce() {
      return this.reduce;
   }

   public int getKeep() {
      return this.keep;
   }

   public int getKeepPercent() {
      return this.keepPercent;
   }

   public int getServer() {
      return this.server;
   }

   public int getPeople() {
      return this.people;
   }

   public int getType() {
      return this.type;
   }

   public String getName() {
      return this.name;
   }

   public int getPrestige() {
      return this.prestige;
   }

   public static int calKeepNum(int grade, int size) {
      int keepNum = 0;
      SupremePvpGradeModel supremePvpGradeModel = (SupremePvpGradeModel)ApplicationContextProvider.getModelPoolEntity("JiuZhouRankDivide", grade);
      if (supremePvpGradeModel == null) {
         return keepNum;
      } else {
         if (supremePvpGradeModel.getType() == 2 && supremePvpGradeModel.getKeepPercent() > 0) {
            keepNum = (int)((float)(size * supremePvpGradeModel.getKeepPercent()) / 100.0F);
         } else {
            keepNum = supremePvpGradeModel.getKeep();
         }

         return keepNum;
      }
   }
}
