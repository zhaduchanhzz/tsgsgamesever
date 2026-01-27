package com.gzbz.db.bean;

public class PlayerResetData<T> {
   public int uqId;
   private T num;
   public long updateTime;
   public int cls;

   public PlayerResetData() {
   }

   public T getNum() {
      return this.num;
   }

   public void setNum(T num) {
      this.num = num;
   }

   public PlayerResetData(int uqId, T num, Class cls) {
      this.uqId = uqId;
      this.num = num;
      this.cls = getClzInt(cls.getName());
   }

   public static PlayerResetData NewPlayerResetData(String uqId, String num, String clsIntStr, String updateTime) {
      PlayerResetData resetData = null;
      int clsInt = Integer.parseInt(clsIntStr);
      switch (clsInt) {
         case 1:
            resetData = new PlayerResetData();
            resetData.num = (T)Byte.parseByte(num);
            break;
         case 2:
            resetData = new PlayerResetData();
            resetData.num = (T)Short.parseShort(num);
            break;
         case 3:
            resetData = new PlayerResetData();
            resetData.num = (T)Integer.parseInt(num);
            break;
         case 4:
            resetData = new PlayerResetData();
            resetData.num = (T)Long.parseLong(num);
      }

      resetData.uqId = Integer.parseInt(uqId);
      resetData.updateTime = Long.parseLong(updateTime);
      resetData.cls = clsInt;
      return resetData;
   }

   public static int getClzInt(String clz) {
      int clzInt = 0;
      switch (clz) {
         case "java.lang.Byte":
         case "byte":
            clzInt = 1;
            break;
         case "java.lang.Short":
         case "short":
            clzInt = 2;
            break;
         case "java.lang.Integer":
         case "int":
            clzInt = 3;
            break;
         case "java.lang.Long":
         case "long":
            clzInt = 4;
      }

      return clzInt;
   }
}
