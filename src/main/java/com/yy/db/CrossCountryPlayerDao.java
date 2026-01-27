package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_country_player",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossCountryPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "groupId"
   )
   public int groupId;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "阵型"
   )
   public byte[] playerArraying = null;
}
