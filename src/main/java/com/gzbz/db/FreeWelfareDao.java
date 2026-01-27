package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_free_welfare",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FreeWelfareDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "广告观看次数",
      columnName = "advWatchNum",
      columnType = "TEXT",
      loadFun = "loadAdvWatchNum",
      saveFun = "saveAdvWatchNum"
   )
   public Map<Integer, Integer> advWatchNum = new HashMap();
   @DBColumnAnno(
      comment = "已领取的广告奖励id",
      columnName = "recAdvId",
      columnType = "TEXT",
      loadFun = "loadRecAdvId",
      saveFun = "saveRecAdvId"
   )
   public Set<Integer> recAdvId = new HashSet();

   public void loadAdvWatchNum(String data) {
      this.advWatchNum = DataUtils.stringToInt_intMap(data);
   }

   public String saveAdvWatchNum() {
      return DataUtils.int_intMapToString(this.advWatchNum);
   }

   public void loadRecAdvId(String data) {
      this.recAdvId = DataUtils.stringToIntSet(data);
   }

   public String saveRecAdvId() {
      return DataUtils.intSetToString(this.recAdvId);
   }
}
