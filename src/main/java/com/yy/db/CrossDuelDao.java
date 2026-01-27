package com.yy.db;

import com.yy.duelWar.CrossDuelData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_duel",
   dbType = 2,
   selectKey = {"group"}
)
public class CrossDuelDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区id"
   )
   public int group;
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
      comment = "积分赛是否结算过"
   )
   public boolean pointBattleSettle = false;
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
      columnType = "LONGTEXT",
      loadFun = "loadTopWorshipLike",
      saveFun = "saveTopWorshipLike",
      comment = "巅峰膜拜点赞玩家zone->like"
   )
   public Map<Integer, Integer> topWorshipLike = new HashMap();

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

   public void loadTopWorshipLike(String data) {
      this.topWorshipLike = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveTopWorshipLike() {
      return JsonUtil.beanToJson(this.topWorshipLike);
   }
}
