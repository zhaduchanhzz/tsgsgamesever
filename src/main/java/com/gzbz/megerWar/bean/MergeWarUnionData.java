package com.gzbz.megerWar.bean;

import java.util.HashSet;
import java.util.Set;

public class MergeWarUnionData {
   public int unionId;
   public int promoteRank;
   public int ownTime;
   public int totalScore;
   public int force;
   public long coreDamage;
   public Set<Integer> destGrid = new HashSet();
   public int updateScoreTime;

   public MergeWarUnionData() {
   }

   public MergeWarUnionData(int unionId) {
      this.unionId = unionId;
   }
}
