package com.gzbz.union.bean;

public class UnionGateBattleRecordInfo {
   private int chapterId;
   private int playerId;
   private long passTime;
   private int type;

   public UnionGateBattleRecordInfo(int chapterId, int playerId, long passTime, int type) {
      this.chapterId = chapterId;
      this.playerId = playerId;
      this.passTime = passTime;
      this.type = type;
   }

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.chapterId = chapterId;
   }

   public int getPlayerId() {
      return this.playerId;
   }

   public void setPlayerId(int playerId) {
      this.playerId = playerId;
   }

   public long getPassTime() {
      return this.passTime;
   }

   public void setPassTime(long passTime) {
      this.passTime = passTime;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }
}
