package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_trail_tower_owner",
   resultType = 5
)
public class TrailTowerOwnerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "层数"
   )
   public int towerId;
   @DBColumnAnno(
      comment = "玩家id"
   )
   public int playerId;
}
