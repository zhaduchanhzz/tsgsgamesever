package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_war_barbarian",
   resultType = 0,
   selectKey = {"playerId"}
)
public class WarBarbarianDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "今日最高伤害"
   )
   public long todayDamage;
   @DBColumnAnno(
      comment = "已挑战次数"
   )
   public int challengeCount;
   @DBColumnAnno(
      comment = "已购买次数"
   )
   public int buyCount;
   @DBColumnAnno(
      comment = "最后一次参加时间"
   )
   public long lastJoin;
   @DBColumnAnno(
      comment = "总伤害"
   )
   public long totalDamage;

   public void reset() {
      this.todayDamage = 0L;
      this.challengeCount = 0;
      this.buyCount = 0;
      this.lastJoin = 0L;
      this.totalDamage = 0L;
      this.updateOp();
   }
}
