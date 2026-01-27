package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_hero_promote",
   resultType = 0,
   selectKey = {"playerId"}
)
public class HeroPromoteDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "解锁状态"
   )
   public boolean state;
   @DBColumnAnno(
      comment = "等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "阶级"
   )
   public int stage;
   @DBColumnAnno(
      comment = "额外等级上限"
   )
   public int levelLimit;
}
