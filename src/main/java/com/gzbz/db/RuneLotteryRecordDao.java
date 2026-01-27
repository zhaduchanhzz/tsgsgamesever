package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_rune_lottery_record",
   resultType = 5,
   mapKey = {"id"}
)
public class RuneLotteryRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "主键id"
   )
   public int id;
   @DBColumnAnno(
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "玩家名称"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "获得资源类型"
   )
   public int resourceType;
   @DBColumnAnno(
      comment = "获得资源id"
   )
   public int resourceId;
   @DBColumnAnno(
      comment = "获得资源数量"
   )
   public int resourceNum;
}
