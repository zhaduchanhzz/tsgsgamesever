package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastScore"
)
public class GodBeastScoreModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "评级id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "评级名"
   )
   private String scoreName;
   @ModelColumnAnno(
      comment = "评级品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "总评分下限"
   )
   private int scoreLow;
   @ModelColumnAnno(
      comment = "总评分上限"
   )
   private int scoreHigh;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getScoreName() {
      return this.scoreName;
   }

   public void setScoreName(String scoreName) {
      this.checkModify();
      this.scoreName = scoreName;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getScoreLow() {
      return this.scoreLow;
   }

   public void setScoreLow(int scoreLow) {
      this.checkModify();
      this.scoreLow = scoreLow;
   }

   public int getScoreHigh() {
      return this.scoreHigh;
   }

   public void setScoreHigh(int scoreHigh) {
      this.checkModify();
      this.scoreHigh = scoreHigh;
   }
}
