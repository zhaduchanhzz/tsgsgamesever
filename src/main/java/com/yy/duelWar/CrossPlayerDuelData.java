package com.yy.duelWar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrossPlayerDuelData {
   public int point;
   public int myZone;
   public Map<Integer, DuelFightData> myPointFight = new HashMap();
   public Map<Integer, Map<Integer, DuelMyGuess>> myPointGuess = new HashMap();
   public Map<Integer, Map<Integer, Map<Integer, DuelMyGuess>>> myPointGuessCopy = new HashMap();
   public Map<Integer, DuelArrayingData> arrayings = new HashMap();
   public Map<Integer, DuelFightData> myPassFight = new HashMap();
   public Map<Integer, Map<Integer, DuelMyGuess>> myPassGuess = new HashMap();
   public List<DuelFightRecordData> recordList = new ArrayList();
   public Map<Integer, DuelFightData> zonePointFight = new HashMap();
   public Map<Integer, Map<Integer, DuelMyGuess>> zonePointGuess = new HashMap();
   public Map<Integer, DuelFightData> zonePassFight = new HashMap();
   public Map<Integer, Map<Integer, DuelMyGuess>> zonePassGuess = new HashMap();
   public Map<Integer, DuelMyGuess> extraPassGuess = new HashMap();
   public int passGroup = 1;
}
