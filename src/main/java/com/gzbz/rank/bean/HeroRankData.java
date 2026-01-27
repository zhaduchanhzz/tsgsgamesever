package com.gzbz.rank.bean;

public class HeroRankData extends RankData {
   public int code;
   public int id;
   public int lv;
   public int star;
   public int starMapTotalLv;

   public HeroRankData() {
   }

   public HeroRankData(long score, int value) {
      super(score, value);
   }

   public HeroRankData(long score, int rank, int value) {
      super(score, rank, value);
   }

   public String toString() {
      return "HeroRankData{id=" + this.id + ", score=" + this.score + '}';
   }
}
