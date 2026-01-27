package com.yy.countryWar.bean;

import java.util.TreeSet;

public class ServerPowerBean implements Comparable {
   public int serverId;
   public long power;
   public TreeSet<Integer> subServerIds = new TreeSet();

   public int compareTo(Object o) {
      ServerPowerBean data = (ServerPowerBean)o;
      if (this.power > data.power) {
         return 1;
      } else {
         return this.power < data.power ? -1 : 0;
      }
   }
}
