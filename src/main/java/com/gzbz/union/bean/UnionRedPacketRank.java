package com.gzbz.union.bean;

public class UnionRedPacketRank {
   public String playerName = "";
   public int num = 0;
   public long money = 0L;

   public UnionRedPacketRank() {
   }

   public UnionRedPacketRank(String playerName) {
      this.playerName = playerName;
   }

   public UnionRedPacketRank(String playerName, int num, long money) {
      this.playerName = playerName;
      this.num = num;
      this.money = money;
   }
}
