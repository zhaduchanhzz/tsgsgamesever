package com.gzbz.db;

import db.DBColumnAnno;
import db.DBTableAnno;

@DBTableAnno(
   name = "command"
)
public class CommandDao {
   @DBColumnAnno(
      columnName = "idcommand",
      isPrimary = true,
      isAutoInc = true,
      len = 11
   )
   public int idCommand;
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
   @DBColumnAnno(
      columnName = "type",
      len = 4,
      isNotNull = true
   )
   public byte type;
   @DBColumnAnno(
      columnName = "cmd",
      columnType = "TEXT"
   )
   public String cmd;
   @DBColumnAnno(
      columnName = "confirmtime",
      index = 0,
      indexName = {"confirmindex"},
      len = 20,
      isNotNull = true
   )
   public long confirmTime;
}
