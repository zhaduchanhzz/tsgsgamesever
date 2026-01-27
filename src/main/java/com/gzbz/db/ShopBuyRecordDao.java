package com.gzbz.db;

import com.gzbz.db.bean.ShopBuyRecordData;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;

@DBTableAnno(
   name = "tb_shop_buy_record",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ShopBuyRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "记录",
      columnType = "TEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord"
   )
   public Map<Integer, List<ShopBuyRecordData>> recordDataMap = new HashMap();

   public void loadRecord(String data) {
      int days = ApplicationContextProvider.getConfigInt("shopBuyRecordSaveDays", 3);
      String[] arr = data.split(",");

      for(String str : arr) {
         ShopBuyRecordData recordData = new ShopBuyRecordData();
         recordData.analyData(str);
         if (!DateUtil.checkTime((long)recordData.buyTime * 1000L, days)) {
            ((List)MapUtil.computeIfAbsent(this.recordDataMap, recordData.shopId, ArrayList.class)).add(recordData);
         }
      }

   }

   public String saveRecord() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, List<ShopBuyRecordData>> entry : this.recordDataMap.entrySet()) {
         for(ShopBuyRecordData recordData : (List)entry.getValue()) {
            stringBuilder.append(recordData.toString()).append(",");
         }
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
