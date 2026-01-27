package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_all_server_duel",
   dbType = 2,
   resultType = 5,
   mapKey = {"playerId"}
)
public class CrossAllServerDuelDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "胜利场次"
   )
   public int win;
   @DBColumnAnno(
      comment = "坚持最长回合数"
   )
   public int wave;
   @DBColumnAnno(
      comment = "坚持最长回合数的战斗"
   )
   public String longestRecord;
   @DBColumnAnno(
      comment = "失败场次纪录",
      columnType = "LONGTEXT",
      loadFun = "loadRecordList",
      saveFun = "saveRecordList"
   )
   public List<String> recordList = new ArrayList();
   @DBColumnAnno(
      comment = "发布时间"
   )
   public int publishTime;

   public void loadRecordList(String string) {
      this.recordList = JsonUtil.jsonToList(string, String.class);
   }

   public String saveRecordList() {
      return JsonUtil.beanToJson(this.recordList);
   }

   public void reset() {
      this.win = 0;
      this.wave = 0;
      this.longestRecord = "";
      this.recordList.clear();
      this.updateOp();
   }
}
