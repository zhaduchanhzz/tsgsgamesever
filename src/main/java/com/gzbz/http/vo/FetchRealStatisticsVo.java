package com.gzbz.http.vo;

public class FetchRealStatisticsVo {
   private int create;
   private int online;
   private int payment;
   private int accountNum;

   public int getCreate() {
      return this.create;
   }

   public void setCreate(int create) {
      this.create = create;
   }

   public int getOnline() {
      return this.online;
   }

   public void setOnline(int online) {
      this.online = online;
   }

   public int getPayment() {
      return this.payment;
   }

   public void setPayment(int payment) {
      this.payment = payment;
   }

   public int getAccountNum() {
      return this.accountNum;
   }

   public void setAccountNum(int accountNum) {
      this.accountNum = accountNum;
   }
}
