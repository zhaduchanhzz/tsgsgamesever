package com.yy.countryWar.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryWarCityData {
   public int cityId;
   public int mainServerId;
   public int occupyPlayer;
   public long occupyStartTime;
   public long settleTime;
   public List<Integer> defPlayers = new ArrayList();
   public Map<Integer, Integer> effectAttMap = new HashMap();
   public Map<Integer, Map<Integer, Long>> defBattlesHp = new HashMap();
   public int rewardId;
   public long rewardEndTime;
   public long settleFightTime;
   public long fightStateTime;
   public Map<Integer, List<TransferRecord>> transferRecord = new HashMap();
}
