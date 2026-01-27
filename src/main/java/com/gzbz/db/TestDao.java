package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_test",
   resultType = 3,
   selectKey = {"playerId"}
)
public class TestDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家Id"
   )
   public int playerId;
   public int rank;
   public String name;
}
