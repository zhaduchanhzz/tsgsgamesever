package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_server_merge",
   resultType = 0,
   selectKey = {"serverId"}
)
public class ServerMergeDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "合服次数"
   )
   public int mergeNum;
}
