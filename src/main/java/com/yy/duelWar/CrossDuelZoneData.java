package com.yy.duelWar;

import java.util.HashSet;
import java.util.Set;

public class CrossDuelZoneData {
   public long startTime;
   public long endTime;
   public int stage;
   public int stageStatus;
   public Set<Integer> settleZoneGroup = new HashSet();
   public boolean isSettle = false;
   public boolean isClose = false;
   public int season;
   public long prevStartTime;
   public long prevEndTime;
   public boolean isGroup = false;
   public boolean isGroup2 = false;
}
