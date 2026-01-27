package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_mart_recent",
   dbType = 2,
   resultType = 5,
   mapKey = {"dealCode"}
)
public class CrossMartRecentDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "成交的code"
   )
   public int dealCode;
   @DBColumnAnno(
      comment = "道具id"
   )
   public int itemId;
   @DBColumnAnno(
      comment = "资质id"
   )
   public int scoreId;
   @DBColumnAnno(
      comment = "成交价格"
   )
   public int price;
   @DBColumnAnno(
      comment = "成交时间(秒)"
   )
   public long dealTime;
}
