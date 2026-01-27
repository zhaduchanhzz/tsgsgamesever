package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_property",
   dbType = 1
)
public class PropertyLog extends DBDao {
   @DBColumnAnno(
      comment = "id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   public int playerId;
   public String playerName;
   public int property;
   public long chValue;
   public long finalValue;
   public int module;
   public int reason;
   public int misc1;
   public int misc2;
   public String misc3;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
