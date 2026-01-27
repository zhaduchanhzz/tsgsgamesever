package com.yy.db;

import com.yy.sevenBarbarian.BarbarianData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_seven_barbarian",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossBarbarianDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "sourceServerId"
   )
   public int sourceServerId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadBarbarian",
      saveFun = "saveBarbarian",
      comment = "每天战绩"
   )
   public BarbarianData data;

   public void loadBarbarian(String str) {
      this.data = (BarbarianData)JsonUtil.jsonToBean(str, BarbarianData.class);
   }

   public String saveBarbarian() {
      return JsonUtil.object2String(this.data);
   }
}
