package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_account",
   resultType = 4,
   selectKey = {"account"}
)
public class AccountDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "玩家Id"
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
