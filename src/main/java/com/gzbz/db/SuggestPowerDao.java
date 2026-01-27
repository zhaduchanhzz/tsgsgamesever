package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_suggest_power",
   resultType = 2,
   selectKey = {"systemId"},
   mapKey = {"code"}
)
public class SuggestPowerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "系统id"
   )
   public int systemId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "对应索引"
   )
   public int code;
   @DBColumnAnno(
      comment = "战力"
   )
   public long power;
   @DBColumnAnno(
      comment = "是否正式的"
   )
   public boolean bFormal;
}
