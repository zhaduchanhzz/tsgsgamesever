package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_supreme_pvp",
   resultType = 0,
   selectKey = {"playerId"}
)
public class SupremePvpDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "历史挑战次数"
   )
   public int fightNum;
   @DBColumnAnno(
      comment = "今日已刷新次数"
   )
   public int dailyFlushTimes;
   @DBColumnAnno(
      comment = "今日已挑战次数"
   )
   public int dailyFightNum;
   @DBColumnAnno(
      comment = "今日已获得积分"
   )
   public int dailyIntegralNum;
   @DBColumnAnno(
      comment = "战令结束时间"
   )
   public long warOrderEndTime;
   @DBColumnAnno(
      comment = "战令等级"
   )
   public int warOrderLv;
   @DBColumnAnno(
      comment = "已领普通奖励最大等级"
   )
   public int gotCommonMaxLv;
   @DBColumnAnno(
      comment = "已领豪华奖励最大等级"
   )
   public int gotSuperMaxLv;
   @DBColumnAnno(
      comment = "本周参加时间"
   )
   public long joinTime;
}
