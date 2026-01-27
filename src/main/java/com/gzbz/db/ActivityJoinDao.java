package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_activity_join",
   resultType = 5,
   mapKey = {"activityId"}
)
public class ActivityJoinDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int activityId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "参与的玩家",
      loadFun = "loadPlayers",
      saveFun = "savePlayers"
   )
   public HashSet<Integer> players = new HashSet();
   @DBColumnAnno(
      comment = "是否已经结束"
   )
   public boolean isEnd;

   public void loadPlayers(String data) {
      this.players = (HashSet)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String savePlayers() {
      return JsonUtil.beanToJson(this.players);
   }
}
