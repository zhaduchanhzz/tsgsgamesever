package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Date;

@DBTableAnno(
   name = "chat_msg"
)
public class ChatMsgDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "ID"
   )
   public int id;
   @DBColumnAnno(
      comment = "IP地址",
      len = 64,
      isNotNull = true
   )
   public String ip_addr;
   @DBColumnAnno(
      comment = "平台id",
      len = 8,
      isNotNull = true,
      columnType = "CHAR",
      index = 0,
      indexName = {"key4", "key5", "key6"}
   )
   public String zone_id;
   @DBColumnAnno(
      comment = "渠道ID",
      len = 8,
      isNotNull = true,
      columnType = "CHAR",
      index = 0,
      indexName = {"key1"}
   )
   public String plat_id;
   @DBColumnAnno(
      comment = "设备ID",
      len = 64,
      isNotNull = true
   )
   public String device_id;
   @DBColumnAnno(
      comment = "区服ID",
      len = 11,
      isNotNull = true,
      index = 0,
      indexName = {"key1", "key6"}
   )
   public int server_id;
   @DBColumnAnno(
      comment = "角色ID",
      len = 11,
      isNotNull = true,
      index = 0,
      indexName = {"key1", "key6"}
   )
   public int role_id;
   @DBColumnAnno(
      comment = "角色名",
      len = 64,
      isNotNull = true
   )
   public String role_name;
   @DBColumnAnno(
      comment = "用户ID",
      len = 64,
      isNotNull = true
   )
   public String user_id;
   @DBColumnAnno(
      comment = "角色等级",
      len = 11,
      isNotNull = true
   )
   public int role_level;
   @DBColumnAnno(
      comment = "剩余元宝",
      len = 11,
      isNotNull = true
   )
   public int role_gold;
   @DBColumnAnno(
      comment = "玩家身份 0/正常玩家 1/内玩玩家",
      len = 11,
      isNotNull = true,
      index = 0,
      indexName = {"key5"}
   )
   public int role_identity;
   @DBColumnAnno(
      comment = "仙盟名称",
      len = 255,
      isNotNull = true
   )
   public String guild_name;
   @DBColumnAnno(
      comment = "仙盟职业",
      len = 255,
      isNotNull = true
   )
   public String guild_position;
   @DBColumnAnno(
      comment = "聊天类型 1/2/3/4/5 世界/阵营/仙盟/组队/私聊",
      len = 11,
      isNotNull = true,
      index = 0,
      indexName = {"key2"}
   )
   public int chat_type;
   @DBColumnAnno(
      comment = "聊天消息",
      len = 512,
      isNotNull = true
   )
   public String chat_msg;
   @DBColumnAnno(
      comment = "聊天对象",
      len = 64,
      isNotNull = true
   )
   public String chat_role;
   @DBColumnAnno(
      comment = "发送时间",
      isNotNull = true,
      index = 0,
      indexName = {"key2", "key3", "key4"}
   )
   public Date chat_time;
}
