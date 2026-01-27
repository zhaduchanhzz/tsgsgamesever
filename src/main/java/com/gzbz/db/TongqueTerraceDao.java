package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_tongque_terrace",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"beautyId"}
)
public class TongqueTerraceDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "美人ID"
   )
   public int beautyId;
   @DBColumnAnno(
      comment = "状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "解锁进度"
   )
   public int unlockStep;
   @DBColumnAnno(
      comment = "幽会等级"
   )
   public int trystLv;
   @DBColumnAnno(
      comment = "幽会经验"
   )
   public int trystExp;
   @DBColumnAnno(
      comment = "已赏赐次数"
   )
   public int bestowNum;
   @DBColumnAnno(
      comment = "技能ID"
   )
   public int skillId;
   @DBColumnAnno(
      comment = "宠幸等级"
   )
   public int patronizeLv;
   @DBColumnAnno(
      comment = "同心策类型"
   )
   public int cooperateType;
   @DBColumnAnno(
      comment = "美人级别"
   )
   public int beautyGrade = -1;
}
