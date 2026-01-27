package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.DateUtil;

@DBTableAnno(
   name = "tb_cross_qi_xi_draw_record",
   dbType = 2,
   resultType = 4
)
public class CrossQiXiDrawRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "记录id"
   )
   public int id;
   @DBColumnAnno(
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "玩家名字"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "心仪道具序号"
   )
   public int belovedItemId;
   @DBColumnAnno(
      comment = "时间"
   )
   public int createTime = DateUtil.getIntTime(System.currentTimeMillis());
   @DBColumnAnno(
      comment = "活动阶段"
   )
   public int stage;
}
