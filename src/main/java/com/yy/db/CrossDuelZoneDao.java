package com.yy.db;

import com.gzbz.model.fun.KeyValFun;
import com.yy.duelWar.CrossDuelData;
import com.yy.duelWar.GuessTotalData;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_duel_zone",
   dbType = 2,
   resultType = 5,
   selectKey = {"group"}
)
public class CrossDuelZoneDao extends CrossZoneDao {
   @DBColumnAnno(
      comment = "第几届"
   )
   public int season;
   @DBColumnAnno(
      comment = "赛季开始时间"
   )
   public long startTime;
   @DBColumnAnno(
      comment = "赛季开始时间"
   )
   public long endTime;
   @DBColumnAnno(
      comment = "上个赛季开始时间"
   )
   public long prevStartTime;
   @DBColumnAnno(
      comment = "上个赛季结束时间"
   )
   public long prevEndTime;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadSubGroups",
      saveFun = "saveSubGroups",
      comment = "小分区"
   )
   public Set<Integer> subGroups = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadGodHeroes",
      saveFun = "saveGodHeroes",
      comment = "天选武将 heroId->count"
   )
   public Map<Integer, KeyValFun> godHeroes = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadUploadGodHeroServers",
      saveFun = "saveUploadGodHeroServers",
      comment = "已上传过武将布阵统计的服务器"
   )
   public Set<Integer> uploadGodHeroServers = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadUploadBossServers",
      saveFun = "saveUploadBossServers",
      comment = "已上传过资格赛结果的服务器"
   )
   public Set<Integer> uploadBossServers = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "比武大会分区普通赛区数据",
      loadFun = "loadCommonData",
      saveFun = "saveCommonData"
   )
   public CrossDuelData commonData = new CrossDuelData();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "比武大会分区高级赛区数据",
      loadFun = "loadHighData",
      saveFun = "saveHighData"
   )
   public CrossDuelData highData = new CrossDuelData();
   @DBColumnAnno(
      comment = "积分赛在第几轮了"
   )
   public int pointBattleRound;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "积分赛竞猜玩家",
      loadFun = "loadPointGuess",
      saveFun = "savePointGuess"
   )
   public Set<Integer> pointGuessList = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "积分赛已经打过的轮",
      loadFun = "loadPointRound",
      saveFun = "savePointRound"
   )
   public Set<Integer> pointRoundList = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "淘汰赛竞猜玩家",
      loadFun = "loadPassGuess",
      saveFun = "savePassGuess"
   )
   public Set<Integer> passGuessList = new HashSet();
   @DBColumnAnno(
      comment = "积分赛是否结算过"
   )
   public boolean pointBattleSettle = false;
   @DBColumnAnno(
      comment = "小分区上传到大区的最后一个淘汰赛排名"
   )
   public int lastPassRank;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadGuessTotal",
      saveFun = "saveGuessTotal",
      comment = "每日竞猜统计"
   )
   public Map<Integer, GuessTotalData> guessTotal = new HashMap();

   public void loadGuessTotal(String data) {
      this.guessTotal = JsonUtil.jsonToMap(data, Integer.class, GuessTotalData.class);
   }

   public String saveGuessTotal() {
      return JsonUtil.beanToJson(this.guessTotal);
   }

   public void loadGodHeroes(String data) {
      this.godHeroes = JsonUtil.jsonToMap(data, Integer.class, KeyValFun.class);
   }

   public String saveGodHeroes() {
      return JsonUtil.beanToJson(this.godHeroes);
   }

   public void loadUploadGodHeroServers(String data) {
      this.uploadGodHeroServers = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveUploadGodHeroServers() {
      return JsonUtil.beanToJson(this.uploadGodHeroServers);
   }

   public void loadUploadBossServers(String data) {
      this.uploadBossServers = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveUploadBossServers() {
      return JsonUtil.beanToJson(this.uploadBossServers);
   }

   public void loadCommonData(String data) {
      this.commonData = (CrossDuelData)JsonUtil.jsonToBean(data, CrossDuelData.class);
   }

   public String saveCommonData() {
      return JsonUtil.beanToJson(this.commonData);
   }

   public void loadHighData(String data) {
      this.highData = (CrossDuelData)JsonUtil.jsonToBean(data, CrossDuelData.class);
   }

   public String saveHighData() {
      return JsonUtil.beanToJson(this.highData);
   }

   public void loadSubGroups(String data) {
      this.subGroups = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveSubGroups() {
      return JsonUtil.beanToJson(this.subGroups);
   }

   public void loadPointGuess(String data) {
      this.pointGuessList = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String savePointGuess() {
      return JsonUtil.beanToJson(this.pointGuessList);
   }

   public void loadPointRound(String data) {
      this.pointRoundList = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String savePointRound() {
      return JsonUtil.beanToJson(this.pointRoundList);
   }

   public void loadPassGuess(String data) {
      this.passGuessList = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String savePassGuess() {
      return JsonUtil.beanToJson(this.passGuessList);
   }
}
