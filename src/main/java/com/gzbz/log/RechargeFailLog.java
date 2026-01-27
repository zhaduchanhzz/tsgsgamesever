package com.gzbz.log;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "log_recharge_fail",
   dbType = 1
)
public class RechargeFailLog extends DBDao {
   @DBColumnAnno(
      columnName = "id",
      isPrimary = true,
      isAutoInc = true,
      comment = "主键id"
   )
   public int id;
   @DBColumnAnno(
      columnName = "billNo",
      comment = "订单号"
   )
   public String billNo = "";
   @DBColumnAnno(
      columnName = "playerId",
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "account",
      comment = "玩家账号"
   )
   public String account = "";
   @DBColumnAnno(
      columnName = "playerName",
      comment = "玩家名称"
   )
   public String playerName = "";
   @DBColumnAnno(
      columnName = "serverId",
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      columnName = "platformId",
      comment = "平台id"
   )
   public int platformId;
   @DBColumnAnno(
      columnName = "rechargeId",
      comment = "充值表id"
   )
   public int rechargeId;
   @DBColumnAnno(
      columnName = "money",
      comment = "付款金额"
   )
   public double money;
   @DBColumnAnno(
      columnName = "extra",
      comment = "扩展信息"
   )
   public String extra;
   @DBColumnAnno(
      columnName = "reason",
      comment = "原因"
   )
   public String reason;
   @DBColumnAnno(
      columnName = "createTime",
      comment = "创建时间"
   )
   public long createTime = System.currentTimeMillis();
   @DBColumnAnno(
      columnName = "time",
      comment = "回调时间"
   )
   public int time;
}
