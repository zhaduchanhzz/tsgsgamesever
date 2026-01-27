package com.gzbz.db.bean;

public class HeroClubRecord implements Comparable {
   public int heroId;
   public int time;

   public HeroClubRecord() {
   }

   public HeroClubRecord(int heroId, int time) {
      this.heroId = heroId;
      this.time = time;
   }

   public int compareTo(Object o) {
      HeroClubRecord data = (HeroClubRecord)o;
      if (this.time > data.time) {
         return -1;
      } else {
         return this.time < data.time ? 1 : 0;
      }
   }
}
