package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_fire_work",
   resultType = 0,
   selectKey = {"playerId"}
)
public class YuanDanFireWorkDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "hadGotRewards",
      comment = "已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadHadGotRewards",
      saveFun = "saveHadGotRewards"
   )
   public Set<Integer> hadGotRewards = new HashSet();

   public void loadHadGotRewards(String data) {
      this.hadGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveHadGotRewards() {
      return DataUtils.intSetToString(this.hadGotRewards);
   }
}
