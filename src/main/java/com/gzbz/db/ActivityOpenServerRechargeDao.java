package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import db.DBColumnAnno;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_activity_open_server_recharge",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityOpenServerRechargeDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "每日奖励是否领取"
   )
   public boolean dayReward = false;
}
