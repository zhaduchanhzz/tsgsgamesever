package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.ShopJsonData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_shop",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ShopDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "物品列表",
      columnName = "jsonData",
      columnType = "TEXT",
      loadFun = "loadItems",
      saveFun = "saveItems"
   )
   public Map<Integer, ShopJsonData> jsonData = new HashMap();
   @DBColumnAnno(
      comment = "自动购买",
      columnType = "TEXT",
      loadFun = "loadAutoMap",
      saveFun = "saveAutoMap"
   )
   public Map<Integer, Set<Integer>> autoMap = new HashMap();

   public void loadItems(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.jsonData = JsonUtil.jsonToMap(data, Integer.class, ShopJsonData.class);
      }
   }

   public String saveItems() {
      return JSON.toJSONString(this.jsonData);
   }

   public ShopJsonData getData(int shopId) {
      return (ShopJsonData)this.jsonData.get(shopId);
   }

   public void setData(int shopId, ShopJsonData data) {
      this.jsonData.put(shopId, data);
   }

   public void loadAutoMap(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] shopAutoInfos = data.split(";");

         for(String shopAutoInfo : shopAutoInfos) {
            String[] strArr = shopAutoInfo.split(":");
            Set<Integer> autoIdSet = new HashSet();

            for(String id : strArr[1].split("_")) {
               autoIdSet.add(Integer.parseInt(id));
            }

            this.autoMap.put(Integer.parseInt(strArr[0]), autoIdSet);
         }

      }
   }

   public String saveAutoMap() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, Set<Integer>> entry : this.autoMap.entrySet()) {
         Set<Integer> autoIdSet = (Set)entry.getValue();
         if (!CollectionUtils.isEmpty(autoIdSet)) {
            stringBuilder.append(entry.getKey()).append(":");

            for(Integer id : autoIdSet) {
               stringBuilder.append(id).append("_");
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append(";");
         }
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
