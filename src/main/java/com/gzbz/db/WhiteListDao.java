package com.gzbz.db;

import db.DBColumnAnno;
import db.DBTableAnno;

@DBTableAnno(
   name = "white_list"
)
public class WhiteListDao {
   @DBColumnAnno(
      columnName = "id",
      isPrimary = true,
      isAutoInc = true,
      len = 11
   )
   public int id;
   @DBColumnAnno(
      columnName = "ip",
      len = 255,
      comment = "ip地址",
      isNotNull = true
   )
   public String ip;
   @DBColumnAnno(
      columnName = "creator",
      len = 64,
      isNotNull = true
   )
   public String creator;
   @DBColumnAnno(
      columnName = "createtime",
      len = 20,
      isNotNull = true
   )
   public long createTime;
}
