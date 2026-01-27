package com.yy.duelWar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class CrossDuelData {
   public int zoneType;
   public boolean matchStatus = false;
   public Set<Integer> bossPlayer = new HashSet();
   public Map<Integer, List<DuelFightData>> matchPlayer = new HashMap();
   public Map<Integer, DuelGuessData> pointGuess = new TreeMap();
   public Map<Integer, Map<Integer, DuelGuessData>> pointGuessExtra = new TreeMap();
   public Map<Integer, DuelRankData> pointRank = new TreeMap();
   public Map<Integer, DuelRankData> passRank = new HashMap();
   public boolean pointToPass = false;
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> group_64 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> group_32 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> group_16 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, DuelFightData>> group_8 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, DuelFightData> group_4 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, DuelFightData> group_2 = new ConcurrentHashMap();
   public Map<Integer, Map<Integer, Map<Integer, Map<Integer, DuelFightData>>>> passGroup_64 = new HashMap();
   public Map<Integer, Map<Integer, Map<Integer, Map<Integer, DuelFightData>>>> passGroup_32 = new HashMap();
   public Map<Integer, Map<Integer, Map<Integer, Map<Integer, DuelFightData>>>> passGroup_16 = new HashMap();
   public Map<Integer, Map<Integer, Map<Integer, DuelFightData>>> passGroup_8 = new HashMap();
   public Map<Integer, Map<Integer, DuelFightData>> passGroup_4 = new HashMap();
   public Map<Integer, Map<Integer, DuelFightData>> passGroup_2 = new HashMap();
   public Map<Integer, DuelFightData> passGroup_1 = new HashMap();
   public Map<Integer, DuelFightData> passGroup_0 = new HashMap();
   public DuelFightData lastPassExtraFight = null;
   public Map<Integer, DuelGuessData> passGuess = new HashMap();
   public DuelGuessData extraGuessData = null;
   public int passBattleRound = 0;
   public Set<Integer> passRoundList = new HashSet();
}
