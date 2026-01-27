package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "Diceplate"
)
public class DicePlateModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "DiceName",
      comment = "骰子名称"
   )
   private String diceName;
   @ModelColumnAnno(
      columnName = "targetNum",
      comment = "目标数量"
   )
   private int targetNum;
   @ModelColumnAnno(
      columnName = "diceNum",
      comment = "骰子数量"
   )
   private int diceNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getDiceName() {
      return this.diceName;
   }

   public void setDiceName(String diceName) {
      this.checkModify();
      this.diceName = diceName;
   }

   public int getTargetNum() {
      return this.targetNum;
   }

   public void setTargetNum(int targetNum) {
      this.checkModify();
      this.targetNum = targetNum;
   }

   public int getDiceNum() {
      return this.diceNum;
   }

   public void setDiceNum(int diceNum) {
      this.checkModify();
      this.diceNum = diceNum;
   }
}
