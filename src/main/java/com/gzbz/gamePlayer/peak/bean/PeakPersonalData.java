package com.gzbz.gamePlayer.peak.bean;

import java.util.HashMap;
import java.util.Map;

public class PeakPersonalData {
   public int playerId;
   public int sourceServerId;
   public int curStep = 1;
   public int curPoint;
   public int maxStep = 1;
   public int maxPoint;
   public int commonTimes;
   public int commWin;
   public int peakTimes;
   public int peakWin;
   public long maxHurt;
   public int maxStreakWin;
   public int streakWin;
   public Map<Integer, Integer> heroMvp = new HashMap();
   public PlayerDetailData enemyData;
}
