package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_value_package",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"type"}
)
public class ValuePackageDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "活动类型",
      isPrimary = true
   )
   public int type;
   @DBColumnAnno(
      comment = "当前id"
   )
   public int id;
   @DBColumnAnno(
      comment = "起始id"
   )
   public int beginId;
   @DBColumnAnno(
      comment = "总购买次数"
   )
   public int totalTimes;
   @DBColumnAnno(
      comment = "已购次数"
   )
   public int buyTimes;
   @DBColumnAnno(
      comment = "免费id"
   )
   public int freeId;
   @DBColumnAnno(
      comment = "初始免费id"
   )
   public int beginFreeId;
   @DBColumnAnno(
      comment = "是否已购免费物品"
   )
   public int freeState;
}
