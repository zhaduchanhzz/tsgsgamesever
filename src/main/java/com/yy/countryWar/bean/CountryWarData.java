package com.yy.countryWar.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountryWarData {
   public Map<Integer, CountryPlayerData> playerDataMap = new TreeMap();
   public Map<Integer, CountryMainServerData> mainServerDataMap = new TreeMap();
   public Map<Integer, Integer> baseCityMainServerId = new HashMap();
   public Map<Integer, CountryWarCityData> cityMap = new HashMap();
   public Set<Integer> allianceServerIds = new HashSet();
   public LinkedList<String> turnTableRecord = new LinkedList();
   public int shopCityId;

   public void addTurnTableRecord(List<String> records) {
      int totalSize = this.turnTableRecord.size() + records.size();
      int delNum = totalSize - 10;
      if (delNum > 0) {
         for(int i = 0; i < delNum; ++i) {
            this.turnTableRecord.removeLast();
         }
      }

      for(String record : records) {
         this.turnTableRecord.addFirst(record);
      }

   }
}
