package com.gzbz.db;

import db.DBColumnAnno;
import db.DBTableAnno;

@DBTableAnno(
   name = "online"
)
public class OnlineLogDao {
   @DBColumnAnno(
      columnName = "year",
      isPrimary = true,
      comment = "生成时间(年)",
      len = 4
   )
   public int year;
   @DBColumnAnno(
      columnName = "month",
      isPrimary = true,
      comment = "生成时间(月)"
   )
   public byte month;
   @DBColumnAnno(
      columnName = "day",
      isPrimary = true,
      comment = "生成时间(日)"
   )
   public byte day;
   @DBColumnAnno(
      columnName = "hour",
      isPrimary = true,
      comment = "生成时间(小时)"
   )
   public byte hour;
   @DBColumnAnno(
      columnName = "minute",
      isPrimary = true,
      comment = "生成时间(分)"
   )
   public byte minute;
   @DBColumnAnno(
      columnName = "online",
      isNotNull = true,
      comment = "在线人数"
   )
   public int online;
}
