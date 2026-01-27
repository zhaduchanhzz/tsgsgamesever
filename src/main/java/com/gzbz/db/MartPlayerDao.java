package com.gzbz.db;

import com.gzbz.mart.bean.MartDetailData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_mart_player",
   resultType = 0,
   selectKey = {"playerId"}
)
public class MartPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "上架的序号",
      loadFun = "loadSellSet",
      saveFun = "saveSellSet"
   )
   public Set<Integer> sellSet = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "物品详情",
      loadFun = "loadSellMartDetails",
      saveFun = "saveSellMartDetails"
   )
   public Map<Integer, MartDetailData> sellMartDetails = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "竞价被超越的code",
      loadFun = "loadSurpass",
      saveFun = "saveSurpass"
   )
   public Set<Integer> surpassSet = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "物品详情",
      loadFun = "loadUnGetGoods",
      saveFun = "saveUnGetGoods"
   )
   public Map<Integer, MartDetailData> unGetGoods = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "临停时下架和领取记录",
      loadFun = "loadOpRecordMap",
      saveFun = "saveOpRecordMap"
   )
   public Map<Integer, List<String>> opRecordMap = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "购买的拍卖场槽位下标",
      loadFun = "loadAddGridIndex",
      saveFun = "saveAddGridIndex"
   )
   public List<Integer> addGridIndex = new ArrayList();

   public void loadAddGridIndex(String data) {
      this.addGridIndex = DataUtils.stringToIntList(data);
   }

   public String saveAddGridIndex() {
      return DataUtils.intListToString(this.addGridIndex);
   }

   public void loadSellSet(String string) {
      this.sellSet = DataUtils.stringToIntSet(string);
   }

   public String saveSellSet() {
      return DataUtils.intSetToString(this.sellSet);
   }

   public void loadSellMartDetails(String string) {
      if (!StringUtils.isEmpty(string)) {
         String[] split = string.split("\\|");

         for(String str : split) {
            MartDetailData martDetailData = new MartDetailData();
            martDetailData.decode(str);
            this.sellMartDetails.put(martDetailData.code, martDetailData);
         }

      }
   }

   public String saveSellMartDetails() {
      if (this.sellMartDetails.size() == 0) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(MartDetailData martDetailData : this.sellMartDetails.values()) {
            stringBuilder.append(martDetailData.encode()).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }

   public void loadSurpass(String string) {
      this.surpassSet = DataUtils.stringToIntSet(string);
   }

   public String saveSurpass() {
      return DataUtils.intSetToString(this.surpassSet);
   }

   public void loadUnGetGoods(String string) {
      if (!StringUtils.isEmpty(string)) {
         String[] split = string.split("\\|");

         for(String str : split) {
            MartDetailData martDetailData = new MartDetailData();
            martDetailData.decode(str);
            this.unGetGoods.put(martDetailData.code, martDetailData);
         }

      }
   }

   public String saveUnGetGoods() {
      if (this.unGetGoods.size() == 0) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(MartDetailData martDetailData : this.unGetGoods.values()) {
            stringBuilder.append(martDetailData.encode()).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }

   public void loadOpRecordMap(String string) {
      String[] split = string.split("\\|");

      for(String cell : split) {
         String[] arr = cell.split(":");
         String[] datas = arr[1].split(",");
         List<String> list = new ArrayList(Arrays.asList(datas));
         this.opRecordMap.put(Integer.parseInt(arr[0]), list);
      }

   }

   public String saveOpRecordMap() {
      if (this.opRecordMap.isEmpty()) {
         return "";
      } else {
         StringBuilder sb = new StringBuilder();

         for(Map.Entry<Integer, List<String>> entry : this.opRecordMap.entrySet()) {
            sb.append(entry.getKey()).append(":");

            for(String str : (List)entry.getValue()) {
               sb.append(str).append(",");
            }

            sb.append("|");
         }

         sb.deleteCharAt(sb.length() - 1);
         return sb.toString();
      }
   }
}
