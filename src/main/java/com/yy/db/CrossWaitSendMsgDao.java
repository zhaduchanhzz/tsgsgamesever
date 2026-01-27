package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_wait_send_msg",
   dbType = 2,
   resultType = 5,
   mapKey = {"msgId"}
)
public class CrossWaitSendMsgDao extends DBDao {
   public static final int MAX_TRY_TIMES = 50;
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true
   )
   public long msgId;
   @DBColumnAnno(
      comment = "消息码"
   )
   public int cmd;
   @DBColumnAnno(
      comment = "目标服务器"
   )
   public int destServerId;
   @DBColumnAnno(
      comment = "目标管理器"
   )
   public int destMgrId;
   @DBColumnAnno(
      comment = "路由方式"
   )
   public byte route;
   @DBColumnAnno(
      columnType = "MEDIUMBLOB",
      comment = "协议"
   )
   public byte[] proto;
   @DBColumnAnno(
      comment = "创建时间"
   )
   public long createTime = System.currentTimeMillis();
}
