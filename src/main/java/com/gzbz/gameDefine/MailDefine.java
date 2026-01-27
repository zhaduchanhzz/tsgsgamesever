package com.gzbz.gameDefine;

public interface MailDefine {
   int MAX_SIZE = 200;
   int NOT_RECEIVE_TIEM = 1209600000;
   int MAIL_TYPE_COMMON = 0;
   int MAIL_TYPE_SYSTEM = 1;
   int MAIL_SEND_TYPE_TO_ALL = 0;
   int MAIL_SEND_TYPE_TO_LIST = 1;
   int MAIL_STATE_NEW = 0;
   int MAIL_STATE_READ = 1;
   int MAIL_STATE_TAKE = 2;

   public static enum MailType {
      MAIL_TYPE_COMMON(0),
      MAIL_TYPE_SYSTEM(1);

      private int id;

      private MailType(int id) {
         this.id = id;
      }

      public int getId() {
         return this.id;
      }

      public void setId(int id) {
         this.id = id;
      }

      public static MailType getMailType(int id) {
         switch (id) {
            case 0:
               return MAIL_TYPE_COMMON;
            case 1:
               return MAIL_TYPE_SYSTEM;
            default:
               return null;
         }
      }
   }
}
