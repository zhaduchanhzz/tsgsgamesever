package com.gzbz.model;

import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "mineNum"
)
public class MineNumModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "线路"
   )
   private int id;
   @ModelColumnAnno(
      comment = "条件1-最高占领矿脉等级"
   )
   private int term1mineLevel;
   @ModelColumnAnno(
      comment = "条件1-最高矿脉占领人数"
   )
   private int term1minePlayerNum;
   @ModelColumnAnno(
      comment = "条件2-最高矿脉占领人数"
   )
   private int term2minePlayerNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getTerm1mineLevel() {
      return this.term1mineLevel;
   }

   public void setTerm1mineLevel(int term1mineLevel) {
      this.term1mineLevel = term1mineLevel;
   }

   public int getTerm1minePlayerNum() {
      return this.term1minePlayerNum;
   }

   public void setTerm1minePlayerNum(int term1minePlayerNum) {
      this.term1minePlayerNum = term1minePlayerNum;
   }

   public int getTerm2minePlayerNum() {
      return this.term2minePlayerNum;
   }

   public void setTerm2minePlayerNum(int term2minePlayerNum) {
      this.term2minePlayerNum = term2minePlayerNum;
   }
}
