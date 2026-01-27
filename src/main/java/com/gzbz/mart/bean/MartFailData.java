package com.gzbz.mart.bean;

import org.springframework.util.StringUtils;

public class MartFailData {
   public int code;
   public int priceType;
   public int priceId;
   public int priceValue;
   public int time;
   public int rewardTime;

   public void decode(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] arr = data.split(",");
         this.code = Integer.parseInt(arr[0]);
         this.priceType = Integer.parseInt(arr[1]);
         this.priceId = Integer.parseInt(arr[2]);
         this.priceValue = Integer.parseInt(arr[3]);
         this.time = Integer.parseInt(arr[4]);
         this.rewardTime = Integer.parseInt(arr[5]);
      }
   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code).append(",");
      stringBuilder.append(this.priceType).append(",");
      stringBuilder.append(this.priceId).append(",");
      stringBuilder.append(this.priceValue).append(",");
      stringBuilder.append(this.time).append(",");
      stringBuilder.append(this.rewardTime);
      return stringBuilder.toString();
   }
}
