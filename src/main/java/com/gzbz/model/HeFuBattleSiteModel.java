package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuBattleSite"
)
public class HeFuBattleSiteModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "建筑类型"
   )
   private int buildingType;
   @ModelColumnAnno(
      comment = "耐久值"
   )
   private int hp;
   @ModelColumnAnno(
      comment = "护盾cd"
   )
   private int hefuUnmatchedCd;
   @ModelColumnAnno(
      comment = "触发护盾血量值"
   )
   private int bloodValue;
   @ModelColumnAnno(
      comment = "单次伤害值"
   )
   private int onceDamage;
   @ModelColumnAnno(
      comment = "挑战cd"
   )
   private int challengeCd;
   @ModelColumnAnno(
      comment = "单次消耗行动力"
   )
   private int expendActive;
   @ModelColumnAnno(
      comment = "积分"
   )
   private int score;
   @ModelColumnAnno(
      comment = "最后一击积分"
   )
   private int lastScore;
   @ModelColumnAnno(
      comment = "修补值"
   )
   private int repair;
   @ModelColumnAnno(
      comment = "修补cd"
   )
   private int mendCd;
   @ModelColumnAnno(
      comment = "最高显示人数"
   )
   private int peopleName;
   @ModelColumnAnno(
      comment = "据点事件"
   )
   private int eventId;

   public int getBuildingType() {
      return this.buildingType;
   }

   public void setBuildingType(int buildingType) {
      this.checkModify();
      this.buildingType = buildingType;
   }

   public int getHp() {
      return this.hp;
   }

   public void setHp(int hp) {
      this.checkModify();
      this.hp = hp;
   }

   public int getHefuUnmatchedCd() {
      return this.hefuUnmatchedCd;
   }

   public void setHefuUnmatchedCd(int hefuUnmatchedCd) {
      this.checkModify();
      this.hefuUnmatchedCd = hefuUnmatchedCd;
   }

   public int getBloodValue() {
      return this.bloodValue;
   }

   public void setBloodValue(int bloodValue) {
      this.checkModify();
      this.bloodValue = bloodValue;
   }

   public int getOnceDamage() {
      return this.onceDamage;
   }

   public void setOnceDamage(int onceDamage) {
      this.checkModify();
      this.onceDamage = onceDamage;
   }

   public int getChallengeCd() {
      return this.challengeCd;
   }

   public void setChallengeCd(int challengeCd) {
      this.checkModify();
      this.challengeCd = challengeCd;
   }

   public int getExpendActive() {
      return this.expendActive;
   }

   public void setExpendActive(int expendActive) {
      this.checkModify();
      this.expendActive = expendActive;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }

   public int getLastScore() {
      return this.lastScore;
   }

   public void setLastScore(int lastScore) {
      this.checkModify();
      this.lastScore = lastScore;
   }

   public int getRepair() {
      return this.repair;
   }

   public void setRepair(int repair) {
      this.checkModify();
      this.repair = repair;
   }

   public int getMendCd() {
      return this.mendCd;
   }

   public void setMendCd(int mendCd) {
      this.checkModify();
      this.mendCd = mendCd;
   }

   public int getPeopleName() {
      return this.peopleName;
   }

   public void setPeopleName(int peopleName) {
      this.checkModify();
      this.peopleName = peopleName;
   }

   public int getEventId() {
      return this.eventId;
   }

   public void setEventId(int eventId) {
      this.checkModify();
      this.eventId = eventId;
   }
}
