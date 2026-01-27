package com.gzbz.db;

import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.Date;

@DBTableAnno(
   name = "log_quick"
)
public class LogQuickDao {
   @DBColumnAnno(
      isNotNull = true,
      index = 0,
      indexName = {"time"},
      comment = "时间"
   )
   public Date time = new Date();
   @DBColumnAnno(
      len = 20,
      isNotNull = true,
      comment = "日志id"
   )
   public long n1;
   @DBColumnAnno(
      len = 64,
      comment = "账号名"
   )
   public String z1;
   @DBColumnAnno(
      len = 20,
      comment = "角色id"
   )
   public long n2;
   @DBColumnAnno(
      len = 64,
      comment = "角色名"
   )
   public String z2;
   @DBColumnAnno(
      len = 64,
      comment = "平台名"
   )
   public String z3;
   @DBColumnAnno(
      len = 64,
      comment = "渠道名"
   )
   public String z4;
   @DBColumnAnno(
      len = 64,
      comment = "元宝数"
   )
   public String n3;
   @DBColumnAnno(
      len = 20,
      comment = "剩余元宝"
   )
   public long n4;
   @DBColumnAnno(
      len = 255,
      comment = "行为"
   )
   public String z5;
   @DBColumnAnno(
      len = 255
   )
   public String z6;
   @DBColumnAnno(
      len = 255
   )
   public String z7;
   @DBColumnAnno(
      len = 255
   )
   public String z8;
}
