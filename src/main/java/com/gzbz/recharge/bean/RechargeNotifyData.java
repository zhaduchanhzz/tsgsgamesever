package com.gzbz.recharge.bean;

public class RechargeNotifyData {
   private String billNo;
   private Integer money;
   private String extra;
   private String data_to_client;
   private String sign;

   public String getBillNo() {
      return this.billNo;
   }

   public Integer getMoney() {
      return this.money;
   }

   public void setMoney(Integer money) {
      this.money = money;
   }

   public String getExtra() {
      return this.extra;
   }

   public String getSign() {
      return this.sign;
   }

   public void setSign(String sign) {
      this.sign = sign;
   }

   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   public void setExtra(String extra) {
      this.extra = extra;
   }

   public String getData_to_client() {
      return this.data_to_client;
   }

   public void setData_to_client(String data_to_client) {
      this.data_to_client = data_to_client;
   }

   public String toString() {
      return "RechargeNotifyData{billNo='" + this.billNo + '\'' + ", money=" + this.money + ", extra='" + this.extra + '\'' + ", data_to_client='" + this.data_to_client + '\'' + ", sign='" + this.sign + '\'' + '}';
   }
}
