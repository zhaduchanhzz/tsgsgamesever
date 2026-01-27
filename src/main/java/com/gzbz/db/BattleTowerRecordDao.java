package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_battle_tower_record",
   resultType = 2,
   selectKey = {"type", "towerId"},
   mapKey = {"playerId"}
)
public class BattleTowerRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "类型"
   )
   public int type;
   @DBColumnAnno(
      isPrimary = true,
      comment = "层数"
   )
   public int towerId;
   @DBColumnAnno(
      comment = "通关战力"
   )
   public long crossPower;
   @DBColumnAnno(
      comment = "通关时间"
   )
   public int crossTime;
   @DBColumnAnno(
      comment = "通关录像ID"
   )
   public int recordId;
   @DBColumnAnno(
      comment = "战斗开始时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "战斗布阵"
   )
   public int heroArrayState;
   @DBColumnAnno(
      comment = "通关战力2"
   )
   public long crossPower2;
   @DBColumnAnno(
      comment = "通关时间2"
   )
   public int crossTime2;
   @DBColumnAnno(
      comment = "通关录像ID2"
   )
   public int recordId2;
   @DBColumnAnno(
      comment = "战斗开始时间2"
   )
   public int startTime2;
   @DBColumnAnno(
      comment = "战斗布阵2"
   )
   public int heroArrayState2;
}
