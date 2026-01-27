package com.gzbz.gamePlayer.playerBag;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ItemModel;
import com.gzbz.protobuf.CommonMsg;

public class Totem extends ItemBase {
   public int level;
   public int breachLv;
   public int heroCode;

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.resetData();
   }

   public void resetData() {
      this.level = 1;
      this.breachLv = 1;
   }

   public Totem() {
   }

   public Totem(CommonMsg.TotemInfo info) {
      this.code = 0;
      this.id = info.getId();
      this.level = info.getLevel();
      this.breachLv = info.getBreachLv();
   }

   public void decode(String data) {
      String[] strs = data.split(",");
      this.code = Integer.parseInt(strs[0]);
      this.id = Integer.parseInt(strs[1]);
      this.num = Integer.parseInt(strs[2]);
      this.enableTime = Integer.parseInt(strs[3]);
      this.level = Integer.parseInt(strs[4]);
      this.breachLv = Integer.parseInt(strs[5]);
      this.heroCode = Integer.parseInt(strs[6]);
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
      stringBuilder.append(",");
      stringBuilder.append(this.level);
      stringBuilder.append(",");
      stringBuilder.append(this.breachLv);
      stringBuilder.append(",");
      stringBuilder.append(this.heroCode);
      return stringBuilder.toString();
   }
}
