package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_action",
   dbType = 1
)
public class PlayerActionLog extends DBDao {
   @DBColumnAnno(
      comment = "id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   @DBColumnAnno(
      isPrimary = true
   )
   public String account;
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   public int action;
   public int misc1;
   public int misc2;
   public String misc3;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
