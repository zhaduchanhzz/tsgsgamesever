package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "charge"
)
public class AdminChargeDao extends DBDao {
   @DBColumnAnno(
      comment = "充值订单",
      isAutoInc = true,
      isPrimary = true
   )
   public int id;
   @DBColumnAnno(
      comment = "服务器ID"
   )
   public int server_id;
   @DBColumnAnno(
      comment = "订单号",
      index = 1,
      indexName = {"paynum"}
   )
   public String paynum;
   @DBColumnAnno(
      comment = "充值方式"
   )
   public String mode;
   @DBColumnAnno(
      comment = "充值账号,即平台号"
   )
   public String user;
   @DBColumnAnno(
      comment = "角色ID"
   )
   public int role_id;
   @DBColumnAnno(
      comment = "角色名称"
   )
   public String role_name;
   @DBColumnAnno(
      comment = "等级"
   )
   public int lv;
   @DBColumnAnno(
      comment = "充值金额",
      columnType = "double(21,3)"
   )
   public double money;
   @DBColumnAnno(
      comment = "充值元宝"
   )
   public int gold;
   @DBColumnAnno(
      comment = "充值时间"
   )
   public int time;
   @DBColumnAnno(
      comment = "验签串"
   )
   public String ticket;
   @DBColumnAnno(
      comment = "请求ip"
   )
   public String ip;
   @DBColumnAnno(
      comment = "充值结果"
   )
   public int result;
}
