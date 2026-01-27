package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_cross_flower",
   dbType = 2,
   resultType = 0,
   selectKey = {"playerId"}
)
public class CrossFlowerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "送花的玩家id及赠送数量",
      columnType = "LONGTEXT",
      loadFun = "loadSendFlowerMap",
      saveFun = "saveSendFlowerMap"
   )
   public Map<Integer, Integer> sendFlowerMap = new ConcurrentHashMap();

   public void loadSendFlowerMap(String data) {
      this.sendFlowerMap = DataUtils.stringToInt_intMap(data);
   }

   public String saveSendFlowerMap() {
      return DataUtils.int_intMapToString(this.sendFlowerMap);
   }
}
