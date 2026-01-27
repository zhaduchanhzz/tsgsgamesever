package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_cross_mart_hot",
   dbType = 2,
   resultType = 5,
   mapKey = {"price"}
)
public class CrossMartHotDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "成交价"
   )
   public int price;
   @DBColumnAnno(
      comment = "物品code",
      columnType = "LONGTEXT",
      loadFun = "loadCodeList",
      saveFun = "saveCodeList"
   )
   public Set<Integer> codeList = new HashSet();

   public void loadCodeList(String data) {
      this.codeList = DataUtils.stringToIntSet(data);
   }

   public String saveCodeList() {
      return DataUtils.intSetToString(this.codeList);
   }
}
