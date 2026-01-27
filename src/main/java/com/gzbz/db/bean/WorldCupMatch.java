package com.gzbz.db.bean;

public class WorldCupMatch {
   public int id;
   public int homeTeam;
   public int guestTeam;
   public int homeOdds;
   public int guestOdds;
   public int drawOdds;

   public String toString() {
      return "WorldCupMatch{id=" + this.id + ", homeTeam=" + this.homeTeam + ", guestTeam=" + this.guestTeam + ", homeOdds=" + this.homeOdds + ", guestOdds=" + this.guestOdds + ", drawOdds=" + this.drawOdds + '}';
   }
}
