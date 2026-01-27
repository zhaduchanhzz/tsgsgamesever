package com.gzbz.demon.bean;

import java.util.Comparator;

public class DemonBossDataComparator implements Comparator<DemonBossData> {
   public int compare(DemonBossData o1, DemonBossData o2) {
      return (int)(o2.heroPower - o1.heroPower);
   }
}
