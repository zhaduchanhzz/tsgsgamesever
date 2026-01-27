package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_battle_record",
   dbType = 1
)
public class ErrorRecordLog extends DBDao {
   @DBColumnAnno(
      comment = "玩家ID",
      isPrimary = true,
      index = 0
   )
   public int playerId;
   @DBColumnAnno(
      comment = "原录像",
      isPrimary = true,
      index = 0
   )
   public int code;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "对战记录"
   )
   public byte[] stream;
   public int module;
   public int reason;
   public int misc1;
   public int misc2;
   @DBColumnAnno(
      columnType = "TEXT"
   )
   public String misc3;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
