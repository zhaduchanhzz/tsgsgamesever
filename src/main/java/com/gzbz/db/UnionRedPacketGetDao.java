package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_union_red_packet_get",
   resultType = 2,
   selectKey = {"redPacketGiveId"},
   mapKey = {"playerId"}
)
public class UnionRedPacketGetDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "union_red_packet_give表id"
   )
   public int redPacketGiveId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "领取的玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "领取钱币数量"
   )
   public int money;
   @DBColumnAnno(
      comment = "领取时间"
   )
   public long getTime = System.currentTimeMillis();
   @DBColumnAnno(
      comment = "领取者职位"
   )
   public int position;
}
