package com.gzbz.http.vo;

public class FetchResourceVo {
   private int playerId;
   private int resType;
   private int resId;
   private long resNum;

   public int getPlayerId() {
      return this.playerId;
   }

   public void setPlayerId(int playerId) {
      this.playerId = playerId;
   }

   public int getResType() {
      return this.resType;
   }

   public void setResType(int resType) {
      this.resType = resType;
   }

   public int getResId() {
      return this.resId;
   }

   public void setResId(int resId) {
      this.resId = resId;
   }

   public long getResNum() {
      return this.resNum;
   }

   public void setResNum(long resNum) {
      this.resNum = resNum;
   }
}
