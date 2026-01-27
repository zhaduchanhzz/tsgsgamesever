package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_limit_skin",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityLimitSkinDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "是否初始化过数据"
   )
   public boolean hadInit;
   @DBColumnAnno(
      comment = "活动开开始时玩家可以购买的皮肤",
      columnType = "TEXT",
      loadFun = "loadLimitSkinIds",
      saveFun = "saveLimitSkinIds"
   )
   public List<Integer> limitSkinIds = new ArrayList();

   public void loadLimitSkinIds(String str) {
      this.limitSkinIds = DataUtils.stringToIntList(str);
   }

   public String saveLimitSkinIds() {
      return DataUtils.intListToString(this.limitSkinIds);
   }
}
