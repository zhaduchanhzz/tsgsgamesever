package com.gzbz.db.worldBean;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class WorldData {
   public int worldLv = 1;
   public boolean registerLimit = false;
   public int otherFlag = 0;
   public Set<Integer> openArtDress = new HashSet();
   public long updateTime;
   public boolean isInitMonster = false;
   public int mergeServerTimes = 0;
   public boolean openCrossDragon = false;
   public boolean crossChange = false;
   public LinkedHashMap<Long, Long> alivePleyers = new LinkedHashMap();
}
