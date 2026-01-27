package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonWarHelpHero"
)
public class DragonWarHelpHeroModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "英雄id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "英雄星级"
   )
   private int maxStar;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getMaxStar() {
      return this.maxStar;
   }

   public void setMaxStar(int maxStar) {
      this.checkModify();
      this.maxStar = maxStar;
   }
}
