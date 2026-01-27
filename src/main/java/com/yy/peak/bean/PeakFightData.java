package com.yy.peak.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PeakFightData {
   public double leftOdds = (double)1.75F;
   public double rightOdds = (double)1.75F;
   public int leftWagerNum;
   public int rightWagerNum;
   public int totalWagerNum;
   public int guessRecordId;
   public int guessWinSide = -1;
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, FightInfoData>> map_128_1 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, FightInfoData>> map_128_2 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, FightInfoData>> map_128_3 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, FightInfoData>> map_16_1 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, FightInfoData>> map_16_2 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, FightInfoData> map_4_1 = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, FightInfoData> map_4_2 = new ConcurrentHashMap();
   public Map<Integer, FightInfoData> guessData = new HashMap();
   public List<Integer> loseList = new ArrayList();

   public void init() {
      this.rightOdds = (double)1.75F;
      this.leftOdds = (double)1.75F;
      this.leftWagerNum = 0;
      this.rightWagerNum = 0;
      this.totalWagerNum = 0;
   }
}
