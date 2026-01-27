package com.yy.decisiveBattleMgr;

import org.springframework.util.StringUtils;

public class CrossDecisiveHeroRecord {
   public int heroId;
   public int arrayingSum;
   public int winSum;
   public int fightSum;
   public int winRate;

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.heroId).append("_");
      stringBuilder.append(this.arrayingSum).append("_");
      stringBuilder.append(this.winSum).append("_");
      stringBuilder.append(this.fightSum).append("_");
      stringBuilder.append(this.winRate);
      return stringBuilder.toString();
   }

   public void decode(String str) {
      if (!StringUtils.isEmpty(str)) {
         String[] arr = str.split("_");
         if (arr.length > 0) {
            this.heroId = Integer.parseInt(arr[0]);
         }

         if (arr.length > 1) {
            this.arrayingSum = Integer.parseInt(arr[1]);
         }

         if (arr.length > 2) {
            this.winSum = Integer.parseInt(arr[2]);
         }

         if (arr.length > 3) {
            this.fightSum = Integer.parseInt(arr[3]);
         }

         if (arr.length > 4) {
            this.winRate = Integer.parseInt(arr[4]);
         }

      }
   }
}
