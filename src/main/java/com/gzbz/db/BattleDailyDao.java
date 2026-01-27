package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_battle_daily",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"battleType"}
)
public class BattleDailyDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "日常副本类型"
   )
   public int battleType;
   @DBColumnAnno(
      comment = "已挑战次数"
   )
   public int count = 0;
   @DBColumnAnno(
      comment = "最后通关id"
   )
   public int lastPassId = 0;
   @DBColumnAnno(
      comment = "首通最后id"
   )
   public int firstPassId = 0;

   public void reset() {
      this.count = 0;
      this.updateOp();
   }
}
