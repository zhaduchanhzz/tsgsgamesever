package com.gzbz.log;

public enum ReasonDefine {
   REASON_BAG(1),
   REASON_HERO(2),
   REASON_ACTIVITY(3);

   public final int Id;

   private ReasonDefine(int id) {
      this.Id = id;
   }
}
