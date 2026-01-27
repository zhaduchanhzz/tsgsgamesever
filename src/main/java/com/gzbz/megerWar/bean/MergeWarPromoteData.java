package com.gzbz.megerWar.bean;

import org.springframework.util.StringUtils;

public class MergeWarPromoteData {
   public int serverId;
   public int unionId;
   public long damage;

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.serverId).append("_");
      stringBuilder.append(this.unionId).append("_");
      stringBuilder.append(this.damage);
      return stringBuilder.toString();
   }

   public void decode(String str) {
      if (!StringUtils.isEmpty(str)) {
         String[] arr = str.split("_");
         this.serverId = Integer.parseInt(arr[0]);
         this.unionId = Integer.parseInt(arr[1]);
         this.damage = Long.parseLong(arr[2]);
      }
   }
}
