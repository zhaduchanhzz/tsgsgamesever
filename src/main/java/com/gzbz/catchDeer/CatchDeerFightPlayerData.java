package com.gzbz.catchDeer;

public class CatchDeerFightPlayerData implements Comparable {
   public int rank;
   public int pvpRank;
   public int roudRank;
   public int playerId;
   public long power;
   public int score;
   public int serverId;
   public boolean isRobot = false;

   public int compareTo(Object o) {
      CatchDeerFightPlayerData data = (CatchDeerFightPlayerData)o;
      if (this.roudRank > data.roudRank) {
         return 1;
      } else if (this.roudRank < data.roudRank) {
         return -1;
      } else if (this.score > data.score) {
         return -1;
      } else if (this.score < data.score) {
         return 1;
      } else if (this.power > data.power) {
         return -1;
      } else {
         return this.power < data.power ? 1 : 0;
      }
   }
}
