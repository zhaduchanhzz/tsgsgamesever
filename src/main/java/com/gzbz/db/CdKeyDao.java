package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cd_key",
   resultType = 2,
   selectKey = {"playerId", "type"},
   mapKey = {"cdKey"}
)
public class CdKeyDao extends DBDao {
   public static final int TYPE_CD_KEY = 0;
   public static final int TYPE_GIFT_CARD = 1;
   @DBColumnAnno(
      isPrimary = true,
      comment = "激活码/礼包码"
   )
   public String cdKey;
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
      comment = "已领次数"
   )
   public int count;
   @DBColumnAnno(
      comment = "兑换时间秒数"
   )
   public long exchangeTime;
}
