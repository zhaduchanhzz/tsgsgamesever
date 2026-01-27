package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_hero_dress",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"id"}
)
public class HeroDressDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "时装ID"
   )
   public int id;
   @DBColumnAnno(
      comment = "状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "使用英雄ID"
   )
   public int heroId;
   @DBColumnAnno(
      comment = "等级"
   )
   public int lv;
   @DBColumnAnno(
      comment = "到期时间"
   )
   public long endTime;
}
