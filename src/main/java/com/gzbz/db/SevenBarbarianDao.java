package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_seven_barbarian"
)
public class SevenBarbarianDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBarbarian",
      saveFun = "saveBarbarian",
      comment = "每天战绩"
   )
   public Map<Integer, Long> data = new HashMap();
   @DBColumnAnno(
      columnName = "battleTimes",
      comment = "已挑战次数"
   )
   public int battleTimes;
   @DBColumnAnno(
      columnName = "buyTimes",
      comment = "已购买次数"
   )
   public int buyTimes;

   public void loadBarbarian(String str) {
      this.data = JsonUtil.jsonToMap(str, Integer.class, Long.class);
   }

   public String saveBarbarian() {
      return JsonUtil.object2String(this.data);
   }
}
