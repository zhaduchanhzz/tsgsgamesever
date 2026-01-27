package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_kr_seven_welfare",
   resultType = 0,
   selectKey = {"playerId"}
)
public class KrSevenWelfareDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前天数"
   )
   public int curDay = 0;
   @DBColumnAnno(
      comment = "已领取的免费奖励天数",
      columnType = "TEXT",
      loadFun = "loadRecFreeRewardDays",
      saveFun = "saveRecFreeRewardDays"
   )
   public Set<Integer> recFreeRewardDays = new HashSet();
   @DBColumnAnno(
      comment = "已购买的折扣奖励天数",
      columnType = "TEXT",
      loadFun = "loadBuyDiscountDays",
      saveFun = "saveBuyDiscountDays"
   )
   public Set<Integer> buyDiscountDays = new HashSet();
   @DBColumnAnno(
      comment = "最近一次更新curDay的时间戳"
   )
   public long updateCurDayTime = 0L;

   public void loadRecFreeRewardDays(String data) {
      this.recFreeRewardDays = DataUtils.stringToIntSet(data);
   }

   public String saveRecFreeRewardDays() {
      return DataUtils.intSetToString(this.recFreeRewardDays);
   }

   public void loadBuyDiscountDays(String data) {
      this.buyDiscountDays = DataUtils.stringToIntSet(data);
   }

   public String saveBuyDiscountDays() {
      return DataUtils.intSetToString(this.buyDiscountDays);
   }
}
