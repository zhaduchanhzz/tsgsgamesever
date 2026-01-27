package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_spring_festival_bless",
   resultType = 5,
   mapKey = {"id"}
)
public class SpringFestivalBlessDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   @DBColumnAnno(
      comment = "所属玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "祈福内容"
   )
   public String content;
}
