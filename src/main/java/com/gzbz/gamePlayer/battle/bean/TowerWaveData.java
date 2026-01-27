package com.gzbz.gamePlayer.battle.bean;

public class TowerWaveData {
   private int recordId;
   private long crossPower;
   private int crossTime;
   private int startTime;
   private int heroArrayState;

   public TowerWaveData() {
   }

   public TowerWaveData(int recordId, long crossPower, int crossTime, int startTime, int heroArrayState) {
      this.recordId = recordId;
      this.crossPower = crossPower;
      this.crossTime = crossTime;
      this.startTime = startTime;
      this.heroArrayState = heroArrayState;
   }

   public int getRecordId() {
      return this.recordId;
   }

   public void setRecordId(int recordId) {
      this.recordId = recordId;
   }

   public long getCrossPower() {
      return this.crossPower;
   }

   public void setCrossPower(long crossPower) {
      this.crossPower = crossPower;
   }

   public int getCrossTime() {
      return this.crossTime;
   }

   public void setCrossTime(int crossTime) {
      this.crossTime = crossTime;
   }

   public int getStartTime() {
      return this.startTime;
   }

   public void setStartTime(int startTime) {
      this.startTime = startTime;
   }

   public int getHeroArrayState() {
      return this.heroArrayState;
   }

   public void setHeroArrayState(int heroArrayState) {
      this.heroArrayState = heroArrayState;
   }
}
