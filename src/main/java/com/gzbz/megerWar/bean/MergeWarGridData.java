package com.gzbz.megerWar.bean;

import java.util.HashSet;
import java.util.Set;

public class MergeWarGridData extends MergeWarBaseGrid {
   public Set<Integer> playerIds = new HashSet();

   public MergeWarGridData() {
   }

   public MergeWarGridData(int grid) {
      this.grid = grid;
   }
}
