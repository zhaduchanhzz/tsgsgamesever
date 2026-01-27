package com.gzbz.union.bean;

public class UnionWarRankData {
   private int playerId = 0;
   private int rank = 0;
   private int star = 0;
   private int record = 0;
   private String playerName = "";
   private int head = 0;
   private int level = 0;

   public int getPlayerId() {
      return this.playerId;
   }

   public void setPlayerId(int playerId) {
      this.playerId = playerId;
   }

   public int getRank() {
      return this.rank;
   }

   public void setRank(int rank) {
      this.rank = rank;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.star = star;
   }

   public int getRecord() {
      return this.record;
   }

   public void setRecord(int record) {
      this.record = record;
   }

   public String getPlayerName() {
      return this.playerName;
   }

   public void setPlayerName(String playerName) {
      this.playerName = playerName;
   }

   public int getHead() {
      return this.head;
   }

   public void setHead(int head) {
      this.head = head;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public UnionWarRankData(int star, int record, int playerId, String playerName, int head, int level) {
      this.playerId = playerId;
      this.star = star;
      this.record = record;
      this.playerName = playerName;
      this.head = head;
      this.level = level;
   }

   public UnionWarRankData(int playerId, String playerName, int head, int level) {
      this.playerId = playerId;
      this.playerName = playerName;
      this.head = head;
      this.level = level;
   }
}
