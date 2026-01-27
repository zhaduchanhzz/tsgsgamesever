package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_task",
   resultType = 3,
   selectKey = {"playerId"}
)
public class TaskDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "longtext",
      comment = "任务列表"
   )
   public String tasks;
   @DBColumnAnno(
      columnType = "MEDIUMBLOB",
      comment = "任务列表(新)"
   )
   public byte[] tasksData;
}
