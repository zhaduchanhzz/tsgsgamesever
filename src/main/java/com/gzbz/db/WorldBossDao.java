package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_world_boss",
   resultType = 0,
   selectKey = {"bossId"}
)
public class WorldBossDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "bossId,normalBoss表bossType"
   )
   public int bossId;
   @DBColumnAnno(
      comment = "等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "累积被打伤害"
   )
   public long damage;
   @DBColumnAnno(
      comment = "最后一次开启时间"
   )
   public long lastOpenTime;
}
