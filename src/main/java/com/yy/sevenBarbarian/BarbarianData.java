package com.yy.sevenBarbarian;

import java.util.HashMap;
import java.util.Map;

public class BarbarianData {
   public int playerId;
   public int serverId;
   public int sourceServerId;
   public String playerName;
   public int sex;
   public int level;
   public int vipLv;
   public int head;
   public int headFrame;
   public long power;
   public int prestige;
   public String province;
   public String city;
   public int stepId;
   public int secondTitle;
   public Map<Integer, Long> maxHurtMap = new HashMap();
   public Map<Integer, Long> hurtSumMap = new HashMap();
   public Map<Integer, byte[]> playerArraying = new HashMap();
}
