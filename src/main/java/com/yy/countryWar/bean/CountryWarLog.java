package com.yy.countryWar.bean;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CountryWarLog {
   public static int maxLogNum = 10;
   public LinkedList<CountryWarLogInfo> serverLog = new LinkedList();
   public Map<Integer, LinkedList<CountryWarLogInfo>> playerLogMap = new HashMap();

   public void addServerLog(CountryWarLogInfo info) {
      if (this.serverLog.size() >= maxLogNum) {
         this.serverLog.removeLast();
      }

      this.serverLog.addFirst(info);
   }

   public void addPlayerAttackLog(int playerId, CountryWarLogInfo info) {
      LinkedList<CountryWarLogInfo> list = (LinkedList)this.playerLogMap.getOrDefault(playerId, new LinkedList());
      if (list.isEmpty()) {
         list.add(info);
         this.playerLogMap.put(playerId, list);
      } else {
         if (list.size() >= maxLogNum) {
            list.removeLast();
         }

         list.addFirst(info);
      }

   }
}
