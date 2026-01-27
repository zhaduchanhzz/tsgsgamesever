package com.gzbz.db.bean;

import com.gzbz.spring.ApplicationContextProvider;

public class MonthlyCardData {
   public int type = 0;
   public int totalRecharge = 0;
   public boolean isActivate = false;
   public boolean isGotToday = false;
   public int gotDays = 0;
   public long startTime = 0L;
   public long endTime = 0L;

   public MonthlyCardData() {
   }

   public MonthlyCardData(int type) {
      this.type = type;
   }

   public void unActivate() {
      this.totalRecharge = 0;
      this.isGotToday = false;
      this.endTime = 0L;
      this.startTime = 0L;
      this.gotDays = 0;
      this.isActivate = false;
   }

   public void activate(long startTime, long endTime) {
      this.isActivate = true;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   public boolean isMaxRecharge() {
      if (this.type == 1) {
         return this.totalRecharge >= ApplicationContextProvider.getConfigInt("ActivateMonthlyCard1", Integer.MAX_VALUE);
      } else if (this.type == 2) {
         return this.totalRecharge >= ApplicationContextProvider.getConfigInt("ActivateMonthlyCard2", Integer.MAX_VALUE);
      } else {
         return true;
      }
   }
}
