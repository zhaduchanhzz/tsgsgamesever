package com.gzbz.db.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ActivityHeroThemeData {
   public byte fight = 0;
   public long totalDamage = 0L;
   public long firstDamage = 0L;
   public long secondDamage = 0L;
   public int mvpHeroId = 0;
   public int employTime = 0;
   public Set<Integer> fightReward = new HashSet();
   public int totalPoint;
   public Set<Integer> pointReward = new HashSet();
   public Map<Integer, Integer> employRecord = new HashMap();
   public int lib = 1;
   public Map<Integer, Integer> employLimit = new HashMap();
   public int matchPlayerId;

   public void reset() {
      this.fight = 0;
      this.totalDamage = 0L;
      this.firstDamage = 0L;
      this.employTime = 0;
      this.fightReward.clear();
      this.totalPoint = 0;
      this.pointReward.clear();
      this.employRecord.clear();
      this.employLimit.clear();
   }
}
