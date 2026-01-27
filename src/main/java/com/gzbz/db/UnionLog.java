package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_union_log",
   resultType = 1,
   selectKey = {"unionId"}
)
public class UnionLog extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "id",
      skipMerge = true
   )
   public int id;
   @DBColumnAnno(
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "操作类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "玩家名称"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "描述"
   )
   public String desc;
   @DBColumnAnno(
      comment = "创建时间"
   )
   public long createTime = System.currentTimeMillis();
}
