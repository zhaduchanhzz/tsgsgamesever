package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_we_chat",
   resultType = 5
)
public class WeChatDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "订阅类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "渠道"
   )
   public String channelId;
   @DBColumnAnno(
      comment = "状态"
   )
   public long state;
   @DBColumnAnno(
      comment = "最后一次时间"
   )
   public long lastTime;
   @DBColumnAnno(
      comment = "当天发送次数"
   )
   public int num;
   @DBColumnAnno(
      comment = "openId"
   )
   public String openId;
}
