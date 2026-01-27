package com.yy.duelWar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CrossDuelHighData {
   public static final int STATE_POINT_MATCH = 1;
   public boolean point_round_1 = false;
   public boolean point_round_2 = false;
   public boolean point_round_3 = false;
   public boolean point_round_4 = false;
   public int status = 0;
   public List<Integer> highBoss = new ArrayList();
   public Map<Integer, Map<Integer, List<DuelFightData>>> matchHighPlayer = new HashMap();
   public Map<Integer, DuelGuessData> highPointGuess = new HashMap();
   public Map<Integer, Integer> highRank = new HashMap();
   public Map<Integer, Integer> highPoint = new HashMap();
   public Map<Integer, Integer> highPointRank = new HashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> high_64 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> high_32 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> high_16 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> high_8 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, DuelFightData> high_4 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, DuelFightData> high_2 = new ConcurrentHashMap();
   public Map<Integer, Integer> highPassRank = new HashMap();
}
