package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_union",
   dbType = 2,
   resultType = 5,
   mapKey = {"unionId"}
)
public class CrossUnionDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "军团名"
   )
   public String unionName;
   @DBColumnAnno(
      comment = "等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "最新副本id"
   )
   public int copyId;
   @DBColumnAnno(
      comment = "军团长"
   )
   public int leader;
   @DBColumnAnno(
      comment = "军团头像"
   )
   public int head;
}
