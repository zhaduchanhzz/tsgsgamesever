package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class MidAutumnStageModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "score",
      comment = "积分"
   )
   private int score;
   @ModelColumnAnno(
      columnName = "time",
      comment = "时间"
   )
   private int time;
   @ModelColumnAnno(
      columnName = "face",
      comment = "图标"
   )
   private int face;

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getFace() {
      return this.face;
   }

   public void setFace(int face) {
      this.checkModify();
      this.face = face;
   }
}
