package com.gzbz.gameDefine;

public enum CodeDefine {
   HERO_CODE(0),
   ITEM_CODE(1),
   PET_CODE(2),
   CHAT_CODE(3),
   MAIL_CODE(4),
   BATTLE_RECORD(5),
   PVP_RECORD(6),
   HERO_CARD_CODE(7),
   DRAGON_SOUL_CODE(8);

   private int id;

   private CodeDefine(int id) {
      this.id = id;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }
}
