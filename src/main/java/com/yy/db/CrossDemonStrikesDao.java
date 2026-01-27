package com.yy.db;

import com.gzbz.db.bean.DemonStrikesLogData;
import com.gzbz.demonStrikes.bean.DemonStrikesCityData;
import com.gzbz.demonStrikes.bean.DemonStrikesNpcData;
import com.gzbz.demonStrikes.bean.DemonStrikesRankData;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_demon_strikes",
   resultType = 0,
   selectKey = {"group"}
)
public class CrossDemonStrikesDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      comment = "本期开始时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "本期结束时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "本期状态"
   )
   public int state = 3;
   @DBColumnAnno(
      comment = "最后一次通知奖励时间"
   )
   public int rewardTime;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "城池信息",
      loadFun = "loadCityData",
      saveFun = "saveCityData"
   )
   public TreeMap<Integer, DemonStrikesCityData> cityData = new TreeMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "npc信息",
      loadFun = "loadNpcData",
      saveFun = "saveNpcData"
   )
   public TreeMap<Integer, DemonStrikesNpcData> npcData = new TreeMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "抽奖记录",
      loadFun = "loadLuckyRecords",
      saveFun = "saveLuckyRecords"
   )
   public LinkedList<String> luckyRecords = new LinkedList();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "战场日志",
      loadFun = "loadWarLogs",
      saveFun = "saveWarLogs"
   )
   public LinkedList<DemonStrikesLogData> warLogs = new LinkedList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "调遣次数playerId->调遣次数",
      loadFun = "loadTransferCount",
      saveFun = "saveTransferCount"
   )
   public Map<Integer, Integer> transferCount = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "服务器排行",
      loadFun = "loadServerRankData",
      saveFun = "saveServerRankData"
   )
   public Map<Integer, DemonStrikesRankData> serverRankData = new HashMap();

   public void loadCityData(String data) {
      this.cityData = (TreeMap)JsonUtil.jsonToMap(data, Integer.class, DemonStrikesCityData.class, TreeMap.class);
   }

   public String saveCityData() {
      return JsonUtil.beanToJson(this.cityData);
   }

   public void loadNpcData(String data) {
      this.npcData = (TreeMap)JsonUtil.jsonToMap(data, Integer.class, DemonStrikesNpcData.class, TreeMap.class);
   }

   public String saveNpcData() {
      return JsonUtil.beanToJson(this.npcData);
   }

   public void loadLuckyRecords(String data) {
      this.luckyRecords.clear();
      List<String> list = JsonUtil.jsonToList(data, String.class);
      this.luckyRecords.addAll(list);
   }

   public String saveLuckyRecords() {
      return JsonUtil.beanToJson(this.luckyRecords);
   }

   public void loadWarLogs(String data) {
      this.warLogs.clear();
      List<DemonStrikesLogData> list = JsonUtil.jsonToList(data, DemonStrikesLogData.class);
      this.warLogs.addAll(list);
   }

   public String saveWarLogs() {
      return JsonUtil.beanToJson(this.warLogs);
   }

   public void loadTransferCount(String data) {
      this.transferCount = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveTransferCount() {
      return JsonUtil.beanToJson(this.transferCount);
   }

   public void loadServerRankData(String data) {
      this.serverRankData = JsonUtil.jsonToMap(data, Integer.class, DemonStrikesRankData.class);
   }

   public String saveServerRankData() {
      return JsonUtil.beanToJson(this.serverRankData);
   }

   public void addLuckyRecord(List<String> records) {
      int totalSize = this.luckyRecords.size() + records.size();
      int delNum = totalSize - ApplicationContextProvider.getConfigInt("demonHistoryLimit", 10);
      if (delNum > 0) {
         for(int i = 0; i < delNum; ++i) {
            this.luckyRecords.removeLast();
         }
      }

      for(String record : records) {
         this.luckyRecords.addFirst(record);
      }

   }

   public void addWarLog(DemonStrikesLogData logData) {
      int totalSize = this.warLogs.size() + 1;
      int delNum = totalSize - ApplicationContextProvider.getConfigInt("demonHistoryLimit", 10);
      if (delNum > 0) {
         for(int i = 0; i < delNum; ++i) {
            this.warLogs.removeLast();
         }
      }

      this.warLogs.addFirst(logData);
   }
}
