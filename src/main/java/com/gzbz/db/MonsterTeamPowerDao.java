package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_monster_team_power",
   resultType = 5,
   mapKey = {"code"}
)
public class MonsterTeamPowerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "机器人CODE"
   )
   public int code;
   @DBColumnAnno(
      comment = "机器人战力"
   )
   public long power;
}
