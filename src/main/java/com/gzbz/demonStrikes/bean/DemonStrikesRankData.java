package com.gzbz.demonStrikes.bean;

import misc.DateUtil;

public class DemonStrikesRankData {
   private int uid;
   private long integral = 0L;
   private int updateTime = 0;
   private boolean isSettle = false;

   public DemonStrikesRankData(int uid, long integral) {
      this.uid = uid;
      this.integral = integral;
   }

   public DemonStrikesRankData() {
   }

   public int getUid() {
      return this.uid;
   }

   public DemonStrikesRankData setUid(int uid) {
      this.uid = uid;
      return this;
   }

   public long getIntegral() {
      return this.integral;
   }

   public DemonStrikesRankData setIntegral(long integral) {
      this.integral = integral;
      this.updateTime = DateUtil.getIntTime(System.currentTimeMillis());
      return this;
   }

   public int getUpdateTime() {
      return this.updateTime;
   }

   public DemonStrikesRankData setUpdateTime(int updateTime) {
      this.updateTime = updateTime;
      return this;
   }

   public boolean isSettle() {
      return this.isSettle;
   }

   public void setSettle(boolean settle) {
      this.isSettle = settle;
   }
}
