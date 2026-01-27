package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_offer_fight_num",
   resultType = 0,
   selectKey = {"group"}
)
public class CrossOfferFightNumDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      comment = "今天军团追缉次数",
      columnType = "TEXT",
      loadFun = "loadUnionFightMap",
      saveFun = "saveUnionFightMap"
   )
   public Map<Integer, Integer> unionFightMap = new HashMap();
   @DBColumnAnno(
      comment = "今天军团击杀次数",
      columnType = "TEXT",
      loadFun = "loadUnionKillMap",
      saveFun = "saveUnionKillMap"
   )
   public Map<Integer, Integer> unionKillMap = new HashMap();
   @DBColumnAnno(
      comment = "今天玩家追缉次数",
      columnType = "TEXT",
      loadFun = "loadPlayerFightMap",
      saveFun = "savePlayerFightMap"
   )
   public Map<Integer, Integer> playerFightMap = new HashMap();
   @DBColumnAnno(
      comment = "今天玩家击杀次数",
      columnType = "TEXT",
      loadFun = "loadPlayerKillMap",
      saveFun = "savePlayerKillMap"
   )
   public Map<Integer, Integer> playerKillMap = new HashMap();
   @DBColumnAnno(
      comment = "个人总追缉次数",
      columnType = "TEXT",
      loadFun = "loadPlayerFightTotalMap",
      saveFun = "savePlayerFightTotalMap"
   )
   public Map<Integer, Integer> playerFightTotalMap = new HashMap();
   @DBColumnAnno(
      comment = "军团本周追缉次数",
      columnType = "TEXT",
      loadFun = "loadUnionWeekFightMap",
      saveFun = "saveUnionWeekFightMap"
   )
   public Map<Integer, Integer> unionWeekFightMap = new HashMap();
   @DBColumnAnno(
      comment = "军团上周追缉次数",
      columnType = "TEXT",
      loadFun = "loadPreWeekFightMap",
      saveFun = "savePreWeekFightMap"
   )
   public Map<Integer, Integer> unionPreWeekFightMap = new HashMap();
   @DBColumnAnno(
      comment = "军团总追缉次数",
      columnType = "TEXT",
      loadFun = "loadUnionFightTotalMap",
      saveFun = "saveUnionFightTotalMap"
   )
   public Map<Integer, Integer> unionFightTotalMap = new HashMap();
   @DBColumnAnno(
      comment = "昨日军团排行",
      columnType = "TEXT",
      loadFun = "loadPreUnionRank",
      saveFun = "savePreUnionRank"
   )
   public Map<Integer, Integer> preUnionRank = new HashMap();
   @DBColumnAnno(
      comment = "昨日军团榜首"
   )
   public String unionHeighest;
   @DBColumnAnno(
      comment = "昨日军团记录",
      columnType = "TEXT",
      loadFun = "loadPreUnionMap",
      saveFun = "savePreUnionMap"
   )
   public Map<Integer, String> preUnionMap = new HashMap();
   @DBColumnAnno(
      comment = "昨日玩家记录",
      columnType = "TEXT",
      loadFun = "loadPrePlayerMap",
      saveFun = "savePrePlayerMap"
   )
   public Map<Integer, String> prePlayerMap = new HashMap();
   @DBColumnAnno(
      comment = "记录时间"
   )
   public Timestamp timestamp;

   public void loadUnionFightMap(String str) {
      this.unionFightMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveUnionFightMap() {
      return JsonUtil.beanToJson(this.unionFightMap);
   }

   public void loadUnionKillMap(String str) {
      this.unionKillMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveUnionKillMap() {
      return JsonUtil.beanToJson(this.unionKillMap);
   }

   public void loadPlayerFightMap(String str) {
      this.playerFightMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String savePlayerFightMap() {
      return JsonUtil.beanToJson(this.playerFightMap);
   }

   public void loadPlayerKillMap(String str) {
      this.playerKillMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String savePlayerKillMap() {
      return JsonUtil.beanToJson(this.playerKillMap);
   }

   public void loadPlayerFightTotalMap(String str) {
      this.playerFightTotalMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String savePlayerFightTotalMap() {
      return JsonUtil.beanToJson(this.playerFightTotalMap);
   }

   public void loadUnionWeekFightMap(String str) {
      this.unionWeekFightMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveUnionWeekFightMap() {
      return JsonUtil.beanToJson(this.unionWeekFightMap);
   }

   public void loadPreWeekFightMap(String str) {
      this.unionPreWeekFightMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String savePreWeekFightMap() {
      return JsonUtil.beanToJson(this.unionPreWeekFightMap);
   }

   public void loadUnionFightTotalMap(String str) {
      this.unionFightTotalMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveUnionFightTotalMap() {
      return JsonUtil.beanToJson(this.unionFightTotalMap);
   }

   public void loadPreUnionRank(String str) {
      this.preUnionRank = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String savePreUnionRank() {
      return JsonUtil.beanToJson(this.preUnionRank);
   }

   public void loadPreUnionMap(String str) {
      this.preUnionMap = JsonUtil.jsonToMap(str, Integer.class, String.class);
   }

   public String savePreUnionMap() {
      return JsonUtil.beanToJson(this.preUnionMap);
   }

   public void loadPrePlayerMap(String str) {
      this.prePlayerMap = JsonUtil.jsonToMap(str, Integer.class, String.class);
   }

   public String savePrePlayerMap() {
      return JsonUtil.beanToJson(this.prePlayerMap);
   }
}
