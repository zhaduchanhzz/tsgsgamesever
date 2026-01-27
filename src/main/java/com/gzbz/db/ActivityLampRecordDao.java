package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_activity_lamp_record",
   resultType = 4
)
public class ActivityLampRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   @DBColumnAnno(
      comment = "头像"
   )
   public int head;
   @DBColumnAnno(
      comment = "玩家名"
   )
   public String name;
   @DBColumnAnno(
      comment = "领取数量"
   )
   public int num;
   @DBColumnAnno(
      comment = "领取时间"
   )
   public long getTime;
}
