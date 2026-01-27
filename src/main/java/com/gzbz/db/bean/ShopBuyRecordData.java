package com.gzbz.db.bean;

import com.gzbz.protobuf.ShopMsg;
import misc.DateUtil;

public class ShopBuyRecordData {
   public int shopId;
   public int itemType;
   public int itemId;
   public int num;
   public int buyTime = DateUtil.getIntTime(System.currentTimeMillis());
   public int buyType;

   public void analyData(String str) {
      String[] arr = str.split("\\|");
      this.shopId = Integer.parseInt(arr[0]);
      this.itemType = Integer.parseInt(arr[1]);
      this.itemId = Integer.parseInt(arr[2]);
      this.num = Integer.parseInt(arr[3]);
      this.buyTime = Integer.parseInt(arr[4]);
      this.buyType = Integer.parseInt(arr[5]);
   }

   public String toString() {
      return this.shopId + "|" + this.itemType + "|" + this.itemId + "|" + this.num + "|" + this.buyTime + "|" + this.buyType;
   }

   public static ShopMsg.RecordInfo.Builder builderRecord(ShopBuyRecordData recordData) {
      ShopMsg.RecordInfo.Builder builder = ShopMsg.RecordInfo.newBuilder();
      builder.setItemType(recordData.itemType);
      builder.setItemId(recordData.itemId);
      builder.setNum(recordData.num);
      builder.setTime(recordData.buyTime);
      return builder;
   }
}
