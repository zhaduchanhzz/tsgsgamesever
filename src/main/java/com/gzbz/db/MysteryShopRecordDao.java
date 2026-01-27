package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "tb_mystery_shop_record",
   resultType = 1,
   selectKey = {"playerId"}
)
public class MysteryShopRecordDao extends DBDao {
   @DBColumnAnno(
      isAutoInc = true,
      isPrimary = true,
      comment = "记录ID"
   )
   public int idx;
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "modelId"
   )
   public int id;
   @DBColumnAnno(
      comment = "物品类型"
   )
   public int itemType;
   @DBColumnAnno(
      comment = "物品id"
   )
   public int itemId;
   @DBColumnAnno(
      comment = "数量"
   )
   public int num;
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
