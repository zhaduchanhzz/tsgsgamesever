package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_pvp_record",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"code"}
)
public class PvpRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "战斗记录code"
   )
   public int code;
   @DBColumnAnno(
      comment = "对战玩家ID"
   )
   public int fightPlayerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "战斗结果"
   )
   public int win;
   @DBColumnAnno(
      comment = "排名改变"
   )
   public int rankChange;
   @DBColumnAnno(
      comment = "战斗时间"
   )
   public long fightTime;
   @DBColumnAnno(
      comment = "战斗录像ID"
   )
   public int recordId;
}
