package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_merge_war_player",
   resultType = 0,
   selectKey = {"playerId"}
)
public class MergeWarPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "今日挑战次数"
   )
   public int figth;
   @DBColumnAnno(
      comment = "今日购买战斗次数"
   )
   public int buy;
   @DBColumnAnno(
      comment = "上一场战斗伤害值(三波)"
   )
   public long lastDamage;
   @DBColumnAnno(
      comment = "累计战斗次数"
   )
   public int totalFight;

   public void reset() {
      this.figth = 0;
      this.buy = 0;
      this.lastDamage = 0L;
      this.totalFight = 0;
      this.updateOp();
   }
}
