package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_pvp",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PvpDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "最高排名"
   )
   public int maxRank;
   @DBColumnAnno(
      comment = "跳过战斗解锁"
   )
   public int fastUnlock;
   @DBColumnAnno(
      comment = "赛季"
   )
   public int seasonId;
   @DBColumnAnno(
      comment = "连赢次数"
   )
   public int straightWinNum;
   @DBColumnAnno(
      comment = "周战斗次数"
   )
   public int weekFightNum;
   @DBColumnAnno(
      comment = "周被点赞数"
   )
   public int weekBeThumbsupNum;
   @DBColumnAnno(
      comment = "第一次刷新"
   )
   public boolean firstFlush;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTakeAwardIds",
      saveFun = "saveTakeAwardIds"
   )
   public List<Integer> takeAwardIds = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadThumbsUps",
      saveFun = "saveThumbsUps"
   )
   public List<Integer> thumbsUps = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadFightPlayerIds",
      saveFun = "saveFightPlayerIds"
   )
   public List<Integer> waitPlayerIds = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadDeerThumbsUps",
      saveFun = "saveDeerThumbsUps"
   )
   public List<Integer> deerThumbsUps = new ArrayList();

   public void loadTakeAwardIds(String data) {
      this.takeAwardIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakeAwardIds() {
      return JSON.toJSONString(this.takeAwardIds);
   }

   public void loadThumbsUps(String data) {
      this.thumbsUps = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveThumbsUps() {
      return JSON.toJSONString(this.thumbsUps);
   }

   public void loadFightPlayerIds(String data) {
      this.waitPlayerIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveFightPlayerIds() {
      return JSON.toJSONString(this.waitPlayerIds);
   }

   public void loadDeerThumbsUps(String data) {
      this.deerThumbsUps = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveDeerThumbsUps() {
      return JSON.toJSONString(this.deerThumbsUps);
   }
}
