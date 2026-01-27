package com.gzbz.gameDefine;

public enum CrossCodeDefine {
   CROSS_RECORD(1);

   private int id;

   private CrossCodeDefine(int id) {
      this.id = id;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }
}
