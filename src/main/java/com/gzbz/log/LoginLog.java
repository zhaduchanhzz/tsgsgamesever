package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "log_login",
   dbType = 1
)
public class LoginLog extends DBDao {
   @DBColumnAnno(
      comment = "id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   public String accountName;
   public int playerId;
   public String playerName;
   public String playerIp;
   public int level;
   public int vipLevel;
   public byte isMoonCard;
   public byte isPermanentCard;
   public String devUID;
   public String devName;
   public String devOsVer;
   public String devRes;
   public String netOper;
   public String netInfo;
   public String version;
   public byte isReConnect;
   public int groupId;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
