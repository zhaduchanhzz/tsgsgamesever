package com.gzbz.db.worldBean;

import com.gzbz.db.bean.FightData;
import com.gzbz.db.bean.FightPlayerData;
import com.gzbz.db.bean.GuessData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KingOfCentralPlainsData {
   public int activityEnd = 1;
   public long startTime = 0L;
   public int activityState = 0;
   public int round = 0;
   public int state = 0;
   public long stepTime;
   public double leftOdds = (double)1.75F;
   public double rightOdds = (double)1.75F;
   public int leftWagerNum;
   public int rightWagerNum;
   public int totalWagerNum;
   public List<Integer> givePlainsPlayerIds = new ArrayList();
   public Set<Integer> guessPlayerIds = new HashSet();
   public Map<Integer, FightPlayerData> players128 = new HashMap();
   public Map<Integer, FightData> guessFightDataMap = new HashMap();
   public Map<Integer, Map<Integer, GuessData>> guessData = new HashMap();
   public Map<Integer, List<FightData>> map_trial = new HashMap();
   public Map<Integer, Map<Integer, FightData>> map_32 = new HashMap();
   public Map<Integer, Map<Integer, FightData>> map_16 = new HashMap();
   public Map<Integer, Map<Integer, FightData>> map_8 = new HashMap();
   public Map<Integer, FightData> map_4 = new HashMap();
   public Map<Integer, FightData> map_2 = new HashMap();
   public List<FightPlayerData> top3 = new ArrayList();
   public Set<Integer> loseScore = new HashSet();
}
