package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_koi_record",
   dbType = 2,
   resultType = 4
)
public class CrossKoiRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "记录id"
   )
   public long id;
   @DBColumnAnno(
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "玩家名字"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "奖品标签"
   )
   public int label;
}
