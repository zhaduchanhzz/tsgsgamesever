package com.yy.duelWar;

import java.util.Comparator;

public class DuelRankDataComparator implements Comparator<DuelRankData> {
   public int compare(DuelRankData o1, DuelRankData o2) {
      return o2.point - o1.point == 0 ? (int)(o2.power - o1.power) : o2.point - o1.point;
   }
}
