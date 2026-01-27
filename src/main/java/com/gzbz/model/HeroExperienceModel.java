package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroExperience"
)
public class HeroExperienceModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "experienceHeroId"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "体验时长/s"
   )
   private int expTime;
   @ModelColumnAnno(
      comment = "可领取次数"
   )
   private int expNum;

   public int getHeroId() {
      return this.heroId;
   }

   public int getExpTime() {
      return this.expTime;
   }

   public int getExpNum() {
      return this.expNum;
   }
}
