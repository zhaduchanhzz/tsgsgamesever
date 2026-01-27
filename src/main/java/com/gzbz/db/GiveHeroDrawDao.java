package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_give_hero_draw",
   resultType = 0,
   selectKey = {"playerId"}
)
public class GiveHeroDrawDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "lastCalTime",
      comment = "最近一次计算登录时长的时间"
   )
   public long lastCalTime;
   @DBColumnAnno(
      columnName = "loginState",
      comment = "登录状态 1:已完成登录 0:未完成登录"
   )
   public int loginState;
   @DBColumnAnno(
      columnName = "actTotalOnlineTime",
      comment = "活动内累计在线时长(秒)"
   )
   public long actTotalOnlineTime;
   @DBColumnAnno(
      columnName = "tenDrawUseIds",
      comment = "已使用的十连抽id",
      columnType = "TEXT",
      loadFun = "loadTenDrawUseIds",
      saveFun = "saveTenDrawUseIds"
   )
   public Set<Integer> tenDrawUseIds = new HashSet();

   public void loadTenDrawUseIds(String data) {
      this.tenDrawUseIds = DataUtils.stringToIntSet(data);
   }

   public String saveTenDrawUseIds() {
      return DataUtils.intSetToString(this.tenDrawUseIds);
   }
}
