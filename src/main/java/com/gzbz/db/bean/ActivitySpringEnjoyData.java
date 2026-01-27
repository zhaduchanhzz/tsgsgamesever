package com.gzbz.db.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ActivitySpringEnjoyData {
   public Set<Integer> illustrations = new HashSet();
   public byte free = 0;
   public byte cycle = 0;
   public Set<Byte> round = new HashSet();
   public Map<Integer, Boolean> prays = new HashMap();
   public int planCount = 0;
   public Set<Integer> planGot = new HashSet();
   public boolean firstNotify = false;

   public void reset() {
      this.free = 0;
      this.cycle = 0;
      this.round.clear();
      this.planCount = 0;
      this.planGot.clear();
      this.prays.clear();
      this.firstNotify = false;
   }
}
