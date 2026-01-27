package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleHero"
)
public class DecisiveBattleHeroModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "Id",
      isPrimaty = true,
      comment = "id"
   )
   private int Id;
   @ModelColumnAnno(
      columnName = "heroId",
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      columnName = "maxStar",
      comment = "最高星级"
   )
   private int maxStar;

   public int getId() {
      return this.Id;
   }

   public void setId(int id) {
      this.checkModify();
      this.Id = id;
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
