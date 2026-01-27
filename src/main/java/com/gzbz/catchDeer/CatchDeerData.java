package com.gzbz.catchDeer;

import com.gzbz.db.bean.FightData;
import com.gzbz.db.bean.FightPlayerTopData;
import com.gzbz.db.bean.GuessData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CatchDeerData {
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
   public Map<Integer, Integer> givePlainsPlayerIds = new HashMap();
   public Map<Integer, Integer> playerShip = new HashMap();
   public Set<Integer> guessPlayerIds = new HashSet();
   public Map<Integer, CatchDeerFightPlayerData> players128 = new HashMap();
   public Map<Integer, FightData> guessFightDataMap = new HashMap();
   public Map<Integer, Map<Integer, GuessData>> guessData = new HashMap();
   public Map<Integer, List<FightData>> map_trial = new HashMap();
   public Map<Integer, Map<Integer, FightData>> map_32 = new HashMap();
   public Map<Integer, Map<Integer, FightData>> map_16 = new HashMap();
   public Map<Integer, Map<Integer, FightData>> map_8 = new HashMap();
   public Map<Integer, FightData> map_4 = new HashMap();
   public Map<Integer, FightData> map_2 = new HashMap();
   public Map<Integer, FightPlayerTopData> top3 = new HashMap();
   public Set<Integer> loseScore = new HashSet();
   public TreeSet<Integer> uploadServers = new TreeSet();
   public Map<Integer, List<Integer>> uploadPlayer = new HashMap();
}
