package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_dragon_team_player",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossDragonPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "groupId"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "龙脉阶段"
   )
   public int dragonStage;
   @DBColumnAnno(
      comment = "当天挑战次数"
   )
   public int battleNum;
   @DBColumnAnno(
      comment = "是否已通关战斗"
   )
   public boolean passed;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "阵容"
   )
   public byte[] arraying;
}
