package com.gzbz.megerWar.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MergeWarPlayerData {
   public int playerId;
   public int unionId;
   public int armatureId;
   public int gridId;
   public Map<Integer, HpData> hpDatas = new HashMap();
   public int activity;
   public int moveTime;
   public int atkTime;
   public int defTime;
   public int score;
   public int repairTime;
   public Set<Integer> scoreReward = new HashSet();
   public int winNum;
   public int atkBuildingTime;
   public int deadTime;

   public MergeWarPlayerData() {
   }

   public MergeWarPlayerData(int playerId, int unionId, int gridId) {
      this.playerId = playerId;
      this.unionId = unionId;
      this.gridId = gridId;
   }

   public void reset() {
      this.gridId = 0;
      this.hpDatas.clear();
      this.activity = 0;
      this.moveTime = 0;
      this.atkTime = 0;
      this.defTime = 0;
      this.repairTime = 0;
      this.scoreReward.clear();
      this.winNum = 0;
      this.atkBuildingTime = 0;
      this.deadTime = 0;
   }

   public static class HpData {
      public long hp;
      public int hpPercent;
      public byte state;
   }
}
