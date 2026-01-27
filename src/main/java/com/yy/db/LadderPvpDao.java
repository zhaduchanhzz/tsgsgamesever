package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_ladder",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class LadderPvpDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "已战斗次数"
   )
   public int fightTimes;
   @DBColumnAnno(
      comment = "已购买战斗次数"
   )
   public int buyFightTimes;
   @DBColumnAnno(
      comment = "当前排名"
   )
   public int rank;
   @DBColumnAnno(
      comment = "玩家目标服务器"
   )
   public int sourceServerId;
   @DBColumnAnno(
      comment = "玩家可挑战时间"
   )
   public int canFight;
   @DBColumnAnno(
      comment = "玩家连续胜场"
   )
   public int winNum;
}
