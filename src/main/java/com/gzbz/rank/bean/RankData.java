package com.gzbz.rank.bean;

public class RankData {
   public long score;
   public int rank;
   public int value;

   public RankData() {
   }

   public RankData(long score, int value) {
      this.score = score;
      this.value = value;
   }

   public RankData(long score, int rank, int value) {
      this.score = score;
      this.rank = rank;
      this.value = value;
   }
}
