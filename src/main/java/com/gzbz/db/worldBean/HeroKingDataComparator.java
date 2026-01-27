package com.gzbz.db.worldBean;

import java.util.Comparator;

public class HeroKingDataComparator implements Comparator<HeroComparatorData> {
   public int compare(HeroComparatorData o1, HeroComparatorData o2) {
      if (o1.star == o2.star) {
         return o1.lv == o2.lv ? (int)(o1.power - o2.power) : o1.lv - o2.lv;
      } else {
         return o1.star - o2.star;
      }
   }
}
