package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.ActGoldWeekPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopActGoldWeek extends AbstractShop {
   public ShopActGoldWeek(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "HJWeekMonopolyShop";
   }

   public int getShopId() {
      return 51;
   }

   public boolean buyItem(int id, int num) {
      ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
      return actGoldWeekPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
