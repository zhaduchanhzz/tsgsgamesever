package com.gzbz.megerWar.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeWarGameData {
   public Map<Integer, MergeWarGridData> gridDataMap = new HashMap();
   public Map<Integer, MergeWarBuildingData> buildingDataMap = new HashMap();
   public Map<Integer, MergeWarPlayerData> playerDataMap = new HashMap();
   public Map<Integer, MergeWarUnionData> unionDataMap = new HashMap();
   public int lastGetCoreTime = 0;
   public List<Integer> unionRank = new ArrayList();
   public long totalCoreDamage = 0L;
}
