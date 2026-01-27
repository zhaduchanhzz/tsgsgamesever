package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_catch_deer_player",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossCatchDeerPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "groupId"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "power"
   )
   public long power;
   @DBColumnAnno(
      comment = "serverId"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "playerName"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "sex"
   )
   public int sex;
   @DBColumnAnno(
      comment = "lv"
   )
   public int lv;
   @DBColumnAnno(
      comment = "head"
   )
   public int head;
   @DBColumnAnno(
      comment = "headFrame"
   )
   public int headFrame;
   @DBColumnAnno(
      comment = "monarchId"
   )
   public int monarchId;
   @DBColumnAnno(
      comment = "weekBeThumbsupNum"
   )
   public int weekBeThumbsupNum;
   @DBColumnAnno(
      comment = "isRobot"
   )
   public boolean isRobot;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "阵型"
   )
   public byte[] playerArraying = null;
}
