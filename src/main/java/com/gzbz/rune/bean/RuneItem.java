package com.gzbz.rune.bean;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.ItemModel;
import com.gzbz.spring.ApplicationContextProvider;

public class RuneItem extends ItemBase {
   public int upgradeProgress;
   public int level;

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.upgradeProgress = 0;
      this.level = this.getRuneInitLv();
   }

   public int getRuneInitLv() {
      int runeInitLv = ApplicationContextProvider.getConfigInt("RuneInitLv", 1);
      return runeInitLv;
   }

   public RuneItem() {
   }

   public RuneItem(int code, RuneItem data) {
      this.code = code;
      this.id = data.id;
      this.num = 1;
      this.enableTime = data.enableTime;
      this.upgradeProgress = data.upgradeProgress;
      this.level = data.level;
   }

   public void decode(String data) {
      String[] strs = data.split(",");
      this.code = Integer.parseInt(strs[0]);
      this.id = Integer.parseInt(strs[1]);
      this.num = Integer.parseInt(strs[2]);
      this.enableTime = Integer.parseInt(strs[3]);
      this.upgradeProgress = Integer.parseInt(strs[4]);
      this.level = Integer.parseInt(strs[5]);
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
      stringBuilder.append(this.upgradeProgress);
      stringBuilder.append(",");
      stringBuilder.append(this.level);
      return stringBuilder.toString();
   }
}
