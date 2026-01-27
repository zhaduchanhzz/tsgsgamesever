package com.yy.db;

import com.yy.duelWar.CrossPlayerDuelData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.TreeMap;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_duel_player",
   dbType = 2,
   resultType = 5,
   mapKey = {"playerId"}
)
public class CrossPlayerDuelDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "比武大会玩家数据",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public CrossPlayerDuelData duelData = new CrossPlayerDuelData();
   @DBColumnAnno(
      comment = "阶段排名",
      loadFun = "loadStageRank",
      saveFun = "saveStageRank"
   )
   public TreeMap<Integer, Integer> stageRank = new TreeMap();
   @DBColumnAnno(
      comment = "对阵演武次数"
   )
   public int maneuverCount;
   @DBColumnAnno(
      comment = "对阵演武胜利次数"
   )
   public int maneuverWinCount;
   @DBColumnAnno(
      comment = "对阵演武最后匹配玩家"
   )
   public int maneuverLastMatch;
   @DBColumnAnno(
      comment = "截止上赛季连续冠军次数"
   )
   public int serialChampion;

   public void loadData(String data) {
      this.duelData = (CrossPlayerDuelData)JsonUtil.jsonToBean(data, CrossPlayerDuelData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.duelData);
   }

   public void loadStageRank(String data) {
      this.stageRank = (TreeMap)JsonUtil.jsonToMap(data, Integer.class, Integer.class, TreeMap.class);
   }

   public String saveStageRank() {
      return JsonUtil.beanToJson(this.stageRank);
   }
}
