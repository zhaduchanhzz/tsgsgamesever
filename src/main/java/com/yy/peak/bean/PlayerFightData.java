package com.yy.peak.bean;

public class PlayerFightData implements Comparable {
   public int rank;
   public int roundRank;
   public int playerId;
   public long power;
   public int point;

   public int compareTo(Object o) {
      PlayerFightData data = (PlayerFightData)o;
      if (this.roundRank > data.roundRank) {
         return 1;
      } else if (this.roundRank < data.roundRank) {
         return -1;
      } else if (this.point > data.point) {
         return -1;
      } else {
         return this.point < data.point ? 1 : 0;
      }
   }
}
