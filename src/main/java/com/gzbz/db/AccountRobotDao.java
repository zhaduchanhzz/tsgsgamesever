package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_account_robot",
   resultType = 4,
   selectKey = {"account"}
)
public class AccountRobotDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "机器人Id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "账号"
   )
   public String account = "";
   @DBColumnAnno(
      isPrimary = true,
      comment = "服务器Id"
   )
   public int serverId;
}
