package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_union_apply",
   resultType = 2,
   selectKey = {"unionId"},
   mapKey = {"playerId"}
)
public class UnionApplyDao extends DBDao {
   @DBColumnAnno(
      columnName = "unionId",
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "applyTime",
      comment = "申请时间"
   )
   public long applyTime = System.currentTimeMillis();
}
