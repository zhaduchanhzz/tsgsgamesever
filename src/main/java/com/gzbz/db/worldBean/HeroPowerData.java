package com.gzbz.db.worldBean;

public class HeroPowerData implements Comparable {
   public int playerId;
   public long power;
   public int code;

   public HeroPowerData() {
   }

   public HeroPowerData(int playerId, int code, long power) {
      this.playerId = playerId;
      this.code = code;
      this.power = power;
   }

   public int compareTo(Object o) {
      HeroPowerData data = (HeroPowerData)o;
      if (this.power > data.power) {
         return -1;
      } else {
         return this.power < data.power ? 1 : 0;
      }
   }
}
