package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_player_item_reset",
   resultType = 3,
   selectKey = {"playerId"}
)
public class PlayerItemResetDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "longtext",
      comment = "每日重置数据"
   )
   public String dailyValue;
   @DBColumnAnno(
      columnType = "longtext",
      comment = "每周重置数据"
   )
   public String weekValue;
   @DBColumnAnno(
      columnType = "longtext",
      comment = "每月重置数据"
   )
   public String monthValue;
   @DBColumnAnno(
      columnType = "longtext",
      comment = "永久数据"
   )
   public String foreverValue;
}
