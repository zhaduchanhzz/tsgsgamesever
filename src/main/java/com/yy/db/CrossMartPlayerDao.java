package com.yy.db;

import com.gzbz.mart.bean.MartFailData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import misc.DataUtils;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_mart_player",
   dbType = 2,
   resultType = 5,
   mapKey = {"playerId"}
)
public class CrossMartPlayerDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "竞价失败",
      loadFun = "loadFailDeal",
      saveFun = "saveFailDeal"
   )
   public List<MartFailData> failDeal = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "交易记录",
      loadFun = "loadRecord",
      saveFun = "saveRecord"
   )
   public List<String> recordList = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "出售完成的",
      loadFun = "loadSellFinishCodes",
      saveFun = "saveSellFinishCodes"
   )
   public Set<Integer> sellFinishCodes = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "购买成功的",
      loadFun = "loadBuySuccessCodes",
      saveFun = "saveBuySuccessCodes"
   )
   public Set<Integer> buySuccessCodes = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "当前出售中的",
      loadFun = "loadCurrentSells",
      saveFun = "saveCurrentSells"
   )
   public Set<Integer> currentSells = new HashSet();

   public void loadFailDeal(String string) {
      if (!StringUtils.isEmpty(string)) {
         String[] arr = string.split("\\|");

         for(int i = 0; i < arr.length; ++i) {
            MartFailData martFailData = new MartFailData();
            martFailData.decode(arr[i]);
            if (martFailData.code > 0) {
               this.failDeal.add(martFailData);
            }
         }

      }
   }

   public String saveFailDeal() {
      if (this.failDeal.size() == 0) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(MartFailData martFailData : this.failDeal) {
            stringBuilder.append(martFailData.encode()).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }

   public void loadRecord(String string) {
      if (!StringUtils.isEmpty(string)) {
         String[] split = string.split("\\|");

         for(String str : split) {
            this.recordList.add(str);
         }

      }
   }

   public String saveRecord() {
      if (this.recordList.size() == 0) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(String str : this.recordList) {
            stringBuilder.append(str).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }

   public void loadCurrentSells(String string) {
      this.currentSells = DataUtils.stringToIntSet(string);
   }

   public String saveCurrentSells() {
      return DataUtils.intSetToString(this.currentSells);
   }

   public void loadSellFinishCodes(String string) {
      this.sellFinishCodes = DataUtils.stringToIntSet(string);
   }

   public String saveSellFinishCodes() {
      return DataUtils.intSetToString(this.sellFinishCodes);
   }

   public void loadBuySuccessCodes(String string) {
      this.buySuccessCodes = DataUtils.stringToIntSet(string);
   }

   public String saveBuySuccessCodes() {
      return DataUtils.intSetToString(this.buySuccessCodes);
   }
}
