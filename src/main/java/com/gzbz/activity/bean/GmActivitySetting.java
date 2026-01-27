package com.gzbz.activity.bean;

public class GmActivitySetting {
   private int id = 0;
   private int start = 0;
   private int end = 0;
   private boolean close = false;

   public int getId() {
      return this.id;
   }

   public GmActivitySetting setId(int id) {
      this.id = id;
      return this;
   }

   public int getStart() {
      return this.start;
   }

   public GmActivitySetting setStart(int start) {
      this.start = start;
      return this;
   }

   public int getEnd() {
      return this.end;
   }

   public GmActivitySetting setEnd(int end) {
      this.end = end;
      return this;
   }

   public boolean isClose() {
      return this.close;
   }

   public GmActivitySetting setClose(boolean close) {
      this.close = close;
      return this;
   }
}
