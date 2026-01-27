package com.gzbz.gameDefine;

public enum ClientTrackingEnum {
   SP_AF_LEVEL_ACHIEVED(true, new String[]{"tw", "kr"}),
   SP_AF_TUTORIAL_COMPLETION(true, new String[]{"tw", "kr"}),
   SP_AF_ACHIEVEMENT_UNLOCKED(true, new String[]{"tw", "kr"}),
   SP_AF_SUBSCRIBE(true, new String[]{"tw", "kr", "jp"}),
   SP_AF_KING_MONTH_CARD(true, new String[]{"jp"}),
   SP_AF_CREATEROLE(true, new String[]{"tw", "kr"}),
   SP_AF_FIRST_PAY(true, new String[]{"tw", "kr"}),
   SP_AF_DAILYCHECK(true, new String[]{"tw", "kr"}),
   SP_AF_PURCHASE(false, new String[]{"tw", "kr"}),
   SP_BUY_DIRECT_GIFT(false, new String[]{"th"}),
   SP_LAST_ONLINE_TIME(true, new String[]{"th"});

   private boolean once;
   private String[] country;

   private ClientTrackingEnum(boolean once, String... country) {
      this.once = once;
      this.country = country;
   }

   public boolean isOnce() {
      return this.once;
   }

   public void setOnce(boolean once) {
      this.once = once;
   }

   public String[] getCountry() {
      return this.country;
   }

   public void setCountry(String[] country) {
      this.country = country;
   }
}
