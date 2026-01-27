package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorldCupData {
   public int id;
   public List<Integer> teams = new ArrayList();
   public int win = -1;
   public List<Integer> odds = new ArrayList();
   public Map<Integer, WorldCupGuessData> guessDataMap = new HashMap();
   public Map<Integer, Set<Integer>> totalMap = new HashMap();
   public Map<Integer, Long> totalCoinMap = new HashMap();
   public byte state = 0;

   public void init(int id, int homeTeam, int guestTeam) {
      this.id = id;
      this.teams.add(homeTeam);
      this.teams.add(guestTeam);
   }

   public double resultOdds() {
      int resultOdds = 0;
      if (this.win == 0) {
         resultOdds = (Integer)this.odds.get(2);
      } else if (this.win == (Integer)this.teams.get(0)) {
         resultOdds = (Integer)this.odds.get(0);
      } else if (this.win == (Integer)this.teams.get(1)) {
         resultOdds = (Integer)this.odds.get(1);
      }

      double tempOdds = (double)resultOdds / (double)10000.0F;
      return tempOdds;
   }
}
