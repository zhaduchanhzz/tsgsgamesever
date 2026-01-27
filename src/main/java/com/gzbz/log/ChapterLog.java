package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_chapter",
   dbType = 1
)
public class ChapterLog extends DBDao {
   @DBColumnAnno(
      comment = "id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   public int playerId;
   public int code;
   public int chValue;
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
