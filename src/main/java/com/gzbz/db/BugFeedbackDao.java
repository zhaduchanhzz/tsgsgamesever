package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "tb_bug_feedback",
   resultType = 4,
   selectKey = {"id"}
)
public class BugFeedbackDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "序号"
   )
   public int id;
   @DBColumnAnno(
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "玩家名字"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "标题"
   )
   public String title;
   @DBColumnAnno(
      comment = "问题描述"
   )
   public String message;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
