package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_account_white_list",
   resultType = 5,
   mapKey = {"account"}
)
public class AccountWhiteListDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "白名单账号"
   )
   public String account;
}
