package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "tb_cross_offer_fight_record",
   dbType = 2,
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"id"}
)
public class CrossOfferFightRecordDao extends DBDao {
   @DBColumnAnno(
      comment = "序号id",
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   @DBColumnAnno(
      comment = "group",
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      comment = "记录类型"
   )
   public int subclass;
   @DBColumnAnno(
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "offerHero表id"
   )
   public int offerHeroId;
   @DBColumnAnno(
      comment = "伤害"
   )
   public long hurt;
   @DBColumnAnno(
      comment = "积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "发布悬赏军团id"
   )
   public int publicUnionId;
   @DBColumnAnno(
      comment = "剩余血量"
   )
   public long surplusHp;
   @DBColumnAnno(
      comment = "剩余血量进度"
   )
   public int hpPercent;
   @DBColumnAnno(
      comment = "悬赏code"
   )
   public int code;
   @DBColumnAnno(
      comment = "难度"
   )
   public int difficult;
   @DBColumnAnno(
      comment = "挑战时间"
   )
   public Timestamp createTime = new Timestamp(System.currentTimeMillis());
}
