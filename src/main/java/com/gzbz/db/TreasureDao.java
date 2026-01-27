package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_player_treasure",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"treasureId"}
)
public class TreasureDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "宝物id"
   )
   public int treasureId;
   @DBColumnAnno(
      comment = "总星级"
   )
   public int starSum;
   @DBColumnAnno(
      comment = "宝物等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "当前经验"
   )
   public int exp;
   @DBColumnAnno(
      comment = "是否解锁"
   )
   public boolean unLock;
}
