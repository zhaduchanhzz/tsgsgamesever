package com.gzbz.db.worldBean;

import java.util.HashMap;
import java.util.Map;

public class PvpSeasonData {
   public int seasonId;
   public int state;
   public long startTime;
   public long endTime;
   public Map<Integer, PvpPlayerData> scoreMap = new HashMap();
}
