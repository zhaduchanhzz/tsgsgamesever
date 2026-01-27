package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_register",
   dbType = 1
)
public class RegisterLog extends DBDao {
   @DBColumnAnno(
      comment = "id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   public int playerId;
   public String playerName;
   public String accountName;
   public String playerIp;
   public String devUID;
   public String devName;
   public String devOsVer;
   public String devRes;
   public String netOper;
   public String netInfo;
   public String version;
   public String groupId;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
