package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_gift",
   resultType = 3,
   selectKey = {"playerId"}
)
public class GiftDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "礼包类型"
   )
   public int giftType;
   @DBColumnAnno(
      isPrimary = true,
      comment = "礼包表id"
   )
   public int giftId;
   @DBColumnAnno(
      comment = "已购买次数"
   )
   public int count = 0;
   @DBColumnAnno(
      comment = "失效时间"
   )
   public long invalidTime = 0L;
   @DBColumnAnno(
      comment = "周卡/月卡/年卡/已领到第几天"
   )
   public int gotDay = 0;
}
