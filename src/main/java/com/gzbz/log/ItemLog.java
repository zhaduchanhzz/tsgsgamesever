package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_item",
   dbType = 1
)
public class ItemLog extends DBDao {
   @DBColumnAnno(
      comment = "id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   public int playerId;
   public String playerName;
   public int itemId;
   public int num;
   public int chValue;
   public int module;
   public int reason;
   public int misc1;
   public int misc2;
   public String misc3;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
