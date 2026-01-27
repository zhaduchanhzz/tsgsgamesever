package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.GuoQingActivityPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopActGuoQing extends AbstractShop {
   public ShopActGuoQing(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "GuoQingMonopolyShop";
   }

   public int getShopId() {
      return 45;
   }

   public boolean buyItem(int id, int num) {
      GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
      return guoQingActivityPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
