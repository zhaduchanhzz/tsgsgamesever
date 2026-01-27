package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_fortune",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityFortuneDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "活动内累充总数"
   )
   public int rechargeTotal = 0;
   @DBColumnAnno(
      comment = "活动内累充已给额外积分"
   )
   public int rechargePoint = 0;
   @DBColumnAnno(
      comment = "是否已经计算过活动前的累充奖励"
   )
   public boolean calcRecharge = false;
   @DBColumnAnno(
      comment = "积分奖励",
      columnType = "TEXT",
      loadFun = "loadPointReward",
      saveFun = "savePointReward"
   )
   public Set<Integer> pointReward = new HashSet();

   public void loadPointReward(String str) {
      this.pointReward = DataUtils.stringToIntSet(str);
   }

   public String savePointReward() {
      return DataUtils.intSetToString(this.pointReward);
   }
}
