package com.gzbz.db.worldBean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuelData {
   public int season;
   public Map<Integer, Integer> playerZone = new HashMap();
   public boolean bossSettle;
   public Set<Integer> enterZone = new HashSet();
   public long startTime;
}
