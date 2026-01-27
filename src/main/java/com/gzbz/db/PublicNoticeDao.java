package com.gzbz.db;

import db.DBColumnAnno;
import db.DBTableAnno;

@DBTableAnno(
   name = "publicnotice"
)
public class PublicNoticeDao {
   @DBColumnAnno(
      columnName = "idpublicnotice",
      isPrimary = true,
      isAutoInc = true,
      len = 11
   )
   public int idPublicNotice;
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
      columnName = "begin_send_time",
      len = 20,
      comment = "公告开始时间",
      isNotNull = true
   )
   public long beginSendTime;
   @DBColumnAnno(
      columnName = "send_interval",
      len = 20,
      comment = "公告间隔(秒)",
      isNotNull = true
   )
   public long sendInterval;
   @DBColumnAnno(
      columnName = "end_send_time",
      len = 20,
      comment = "公告结束时间",
      index = 0,
      indexName = {"time_index"},
      isNotNull = true
   )
   public long endSendTime;
   @DBColumnAnno(
      columnName = "next_send_time",
      len = 20,
      comment = "下次发送时间",
      index = 0,
      indexName = {"time_index"},
      isNotNull = true
   )
   public long nextSendTime;
   @DBColumnAnno(
      columnName = "content",
      len = 512,
      comment = "公告内容",
      isNotNull = true
   )
   public String content;
   @DBColumnAnno(
      columnName = "type",
      len = 11,
      comment = "1 系统公告,2 系统信息",
      isNotNull = true
   )
   public int type;
   @DBColumnAnno(
      columnName = "color",
      len = 11,
      comment = "#FFFFOO 公告颜色",
      isNotNull = true
   )
   public int color;
   @DBColumnAnno(
      columnName = "is_forbid",
      len = 11,
      isNotNull = true
   )
   public int isForbid;
   @DBColumnAnno(
      columnName = "is_urgent",
      len = 11,
      comment = "1 紧急播报,0 正常播报",
      isNotNull = true
   )
   public int isUrgent;
}
