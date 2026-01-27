package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_offer_person",
   resultType = 0,
   selectKey = {"playerId"}
)
public class OfferPersonDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "单人刷出悬赏次数"
   )
   public int publishNum;
   @DBColumnAnno(
      comment = "今日已战斗次数"
   )
   public int fight;
   @DBColumnAnno(
      comment = "今日缉拿次数"
   )
   public int kill;
   @DBColumnAnno(
      comment = "今日已购买次数"
   )
   public int buy;
   @DBColumnAnno(
      comment = "战斗冷却时间"
   )
   public int coolTime;

   public void reset() {
      this.publishNum = 0;
      this.fight = 0;
      this.kill = 0;
      this.buy = 0;
   }
}
