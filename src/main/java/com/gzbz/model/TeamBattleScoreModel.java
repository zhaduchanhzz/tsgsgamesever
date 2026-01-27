package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "teamBattleScore"
)
public class TeamBattleScoreModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "分数差距"
   )
   private List<Integer> scoretDiff = new ArrayList();
   @ModelColumnAnno(
      comment = "挑战者-分数高-1",
      columnName = "atkerHigh1"
   )
   private int attackerHigh1;
   @ModelColumnAnno(
      comment = "挑战者-分数高-2",
      columnName = "atkerHigh2"
   )
   private int attackerHigh2;
   @ModelColumnAnno(
      comment = "挑战者-分数低-1",
      columnName = "atkerLow1"
   )
   private int attackerLow1;
   @ModelColumnAnno(
      comment = "挑战者-分数低-2",
      columnName = "atkerLow2"
   )
   private int attackerLow2;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getScoretDiff() {
      return this.scoretDiff;
   }

   public void setScoretDiff(List<Integer> scoretDiff) {
      this.checkModify();
      this.scoretDiff = scoretDiff;
   }

   public int getAttackerHigh1() {
      return this.attackerHigh1;
   }

   public void setAttackerHigh1(int attackerHigh1) {
      this.checkModify();
      this.attackerHigh1 = attackerHigh1;
   }

   public int getAttackerHigh2() {
      return this.attackerHigh2;
   }

   public void setAttackerHigh2(int attackerHigh2) {
      this.checkModify();
      this.attackerHigh2 = attackerHigh2;
   }

   public int getAttackerLow1() {
      return this.attackerLow1;
   }

   public void setAttackerLow1(int attackerLow1) {
      this.checkModify();
      this.attackerLow1 = attackerLow1;
   }

   public int getAttackerLow2() {
      return this.attackerLow2;
   }

   public void setAttackerLow2(int attackerLow2) {
      this.checkModify();
      this.attackerLow2 = attackerLow2;
   }
}
