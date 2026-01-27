package com.gzbz.db.bean;

import java.util.HashSet;
import java.util.Set;
import org.springframework.util.StringUtils;

public class HeroAdvanceNoticeData {
   public int id;
   public int startTime;
   public int endTime;
   public Set<Integer> rewards = new HashSet();

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.id).append("_");
      stringBuilder.append(this.startTime).append("_");
      stringBuilder.append(this.endTime).append("_");

      for(Integer day : this.rewards) {
         stringBuilder.append(day).append(",");
      }

      if (this.rewards.size() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void decode(String str) {
      if (!StringUtils.isEmpty(str)) {
         String[] arr = str.split("_");
         this.id = Integer.parseInt(arr[0]);
         this.startTime = Integer.parseInt(arr[1]);
         this.endTime = Integer.parseInt(arr[2]);
         if (arr.length > 3) {
            String[] dayArr = arr[3].split(",");

            for(String day : dayArr) {
               this.rewards.add(Integer.parseInt(day));
            }
         }

      }
   }
}
