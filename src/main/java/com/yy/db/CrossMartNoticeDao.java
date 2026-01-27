package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_cross_mart_notice",
   dbType = 2,
   resultType = 5,
   mapKey = {"itemId"}
)
public class CrossMartNoticeDao extends DBDao {
   @DBColumnAnno(
      comment = "物品id",
      isPrimary = true
   )
   public int itemId;
   @DBColumnAnno(
      comment = "玩家",
      columnType = "LONGTEXT",
      loadFun = "loadPlayerSet",
      saveFun = "savePlayerSet"
   )
   public Set<Integer> playerSet = new HashSet();

   public void loadPlayerSet(String string) {
      this.playerSet = DataUtils.stringToIntSet(string);
   }

   public String savePlayerSet() {
      return DataUtils.intSetToString(this.playerSet);
   }
}
