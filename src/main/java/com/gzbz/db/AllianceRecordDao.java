package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_alliance_record",
   resultType = 2,
   selectKey = {"teamId"},
   mapKey = {"groupId"}
)
public class AllianceRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "队伍ID"
   )
   public int teamId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "录像分组ID"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "第一场录像ID"
   )
   public int recordId;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "左方队伍信息"
   )
   public byte[] leftTeam;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "右方队伍信息"
   )
   public byte[] rightTeam;
   @DBColumnAnno(
      comment = "录像时间"
   )
   public int recordTime;
}
