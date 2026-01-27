package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.LinkedList;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_mart_price",
   dbType = 2,
   resultType = 5,
   mapKey = {"key"}
)
public class CrossMartPriceDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "组合键"
   )
   public String key;
   @DBColumnAnno(
      comment = "最近成交列表",
      columnType = "LONGTEXT",
      loadFun = "loadDealCodes",
      saveFun = "saveDealCodes"
   )
   public LinkedList<Integer> dealCodes = new LinkedList();
   @DBColumnAnno(
      comment = "成交数量"
   )
   public int dealNum;

   public void loadDealCodes(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] arr = data.split("\\|");

         for(String strCode : arr) {
            this.dealCodes.add(Integer.parseInt(strCode));
         }

      }
   }

   public String saveDealCodes() {
      if (this.dealCodes.isEmpty()) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(Integer code : this.dealCodes) {
            stringBuilder.append(code).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }
}
