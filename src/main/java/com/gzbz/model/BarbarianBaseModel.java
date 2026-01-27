package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "barbarianBase"
)
public class BarbarianBaseModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "battle",
      comment = "战斗id"
   )
   private int battle;
   @ModelColumnAnno(
      columnName = "bossName",
      comment = "boss名称"
   )
   private String bossName;
   @ModelColumnAnno(
      columnName = "battleScene",
      comment = "战斗场景id"
   )
   private int battleScene;
   @ModelColumnAnno(
      columnName = "rounds",
      comment = "回合数"
   )
   private int rounds;
   @ModelColumnAnno(
      columnName = "freeChallenge",
      comment = "免费挑战次数"
   )
   private int freeChallenge;
   @ModelColumnAnno(
      columnName = "buyChallenge",
      comment = "额外购买次数"
   )
   private int buyChallenge;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBattle() {
      return this.battle;
   }

   public void setBattle(int battle) {
      this.checkModify();
      this.battle = battle;
   }

   public int getBattleScene() {
      return this.battleScene;
   }

   public void setBattleScene(int battleScene) {
      this.checkModify();
      this.battleScene = battleScene;
   }

   public int getRounds() {
      return this.rounds;
   }

   public void setRounds(int rounds) {
      this.checkModify();
      this.rounds = rounds;
   }

   public int getFreeChallenge() {
      return this.freeChallenge;
   }

   public void setFreeChallenge(int freeChallenge) {
      this.checkModify();
      this.freeChallenge = freeChallenge;
   }

   public int getBuyChallenge() {
      return this.buyChallenge;
   }

   public void setBuyChallenge(int buyChallenge) {
      this.checkModify();
      this.buyChallenge = buyChallenge;
   }

   public String getBossName() {
      return this.bossName;
   }

   public void setBossName(String bossName) {
      this.checkModify();
      this.bossName = bossName;
   }
}
