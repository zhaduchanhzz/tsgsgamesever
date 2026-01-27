package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_device",
   resultType = 0,
   selectKey = {"devUID"}
)
public class DeviceDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "设备唯一ID"
   )
   public String devUID;
   @DBColumnAnno(
      comment = "游客每隔15天首次登录时间"
   )
   public long guestLoginTime = 0L;
   @DBColumnAnno(
      comment = "游客每隔15天累计在线时长"
   )
   public long guestOnlineTime = 0L;
   @DBColumnAnno(
      columnName = "jsonData",
      columnType = "TEXT",
      comment = "玩家设备信息"
   )
   public String jsonData = "";
}
