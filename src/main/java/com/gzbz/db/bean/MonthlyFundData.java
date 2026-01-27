package com.gzbz.db.bean;

public class MonthlyFundData {
   public int reward = 0;
   public int buy = 0;
   public int end = 0;

   public void close() {
      this.end = 0;
      this.buy = 0;
      this.reward = 0;
   }
}
