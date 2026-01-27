package com.gzbz.db.bean;

public class DrawViewLogInfo {
   private int startNum;
   private int endNum;
   private int getFancyNum;

   public DrawViewLogInfo(int startNum, int endNum, int getFancyNum) {
      this.startNum = startNum;
      this.endNum = endNum;
      this.getFancyNum = getFancyNum;
   }

   public int getStartNum() {
      return this.startNum;
   }

   public void setStartNum(int startNum) {
      this.startNum = startNum;
   }

   public int getEndNum() {
      return this.endNum;
   }

   public void setEndNum(int endNum) {
      this.endNum = endNum;
   }

   public int getGetFancyNum() {
      return this.getFancyNum;
   }

   public void setGetFancyNum(int getFancyNum) {
      this.getFancyNum = getFancyNum;
   }
}
