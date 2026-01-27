package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_union_red_packet_give",
   resultType = 2,
   selectKey = {"unionId"},
   mapKey = {"id"}
)
public class UnionRedPacketGiveDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "主键id"
   )
   public int id;
   @DBColumnAnno(
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "发放者玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "红包配置表id"
   )
   public int redPacketId;
   @DBColumnAnno(
      comment = "红包剩余个数"
   )
   public int redPacketNum;
   @DBColumnAnno(
      comment = "红包剩余钱币"
   )
   public int redPacketItemNum;
   @DBColumnAnno(
      comment = "发送时间"
   )
   public long giveTime = System.currentTimeMillis();
   @DBColumnAnno(
      comment = "发放者职位"
   )
   public int position;
}
