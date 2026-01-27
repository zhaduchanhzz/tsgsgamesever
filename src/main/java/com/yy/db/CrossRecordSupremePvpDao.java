package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_supreme_pvp_record",
   dbType = 2,
   resultType = 5,
   selectKey = {"id"}
)
public class CrossRecordSupremePvpDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "记录ID"
   )
   public int recordId;
   @DBColumnAnno(
      comment = "左边玩家ID"
   )
   public int leftPlayerId;
   @DBColumnAnno(
      comment = "右边玩家ID"
   )
   public int rightPlayerId;
   @DBColumnAnno(
      comment = "左边玩家排名改变"
   )
   public int leftRankChange;
   @DBColumnAnno(
      comment = "右边玩家排名改变"
   )
   public int rightRankChange;
   @DBColumnAnno(
      comment = "输赢情况"
   )
   public int win;
   @DBColumnAnno(
      comment = "创建时间"
   )
   public long createTime;
}
