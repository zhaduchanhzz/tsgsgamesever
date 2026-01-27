package com.gzbz.db.bean;

public class HeroRecruitmentRecord implements Comparable {
   public int heroId;
   public int time;

   public HeroRecruitmentRecord() {
   }

   public HeroRecruitmentRecord(int heroId, int time) {
      this.heroId = heroId;
      this.time = time;
   }

   public int compareTo(Object o) {
      HeroRecruitmentRecord data = (HeroRecruitmentRecord)o;
      if (this.time > data.time) {
         return -1;
      } else {
         return this.time < data.time ? 1 : 0;
      }
   }
}
