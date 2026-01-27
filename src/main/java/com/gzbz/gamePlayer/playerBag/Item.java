package com.gzbz.gamePlayer.playerBag;

public class Item extends ItemBase {
   public void decode(String data) {
      String[] strs = data.split(",");
      this.code = Integer.parseInt(strs[0]);
      this.id = Integer.parseInt(strs[1]);
      this.num = Integer.parseInt(strs[2]);
      this.enableTime = Integer.parseInt(strs[3]);
   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code);
      stringBuilder.append(",");
      stringBuilder.append(this.id);
      stringBuilder.append(",");
      stringBuilder.append(this.num);
      stringBuilder.append(",");
      stringBuilder.append(this.enableTime);
      return stringBuilder.toString();
   }
}
