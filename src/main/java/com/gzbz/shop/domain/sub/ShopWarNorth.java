package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopWarNorth extends AbstractShop {
   public ShopWarNorth(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopSeal";
   }

   public int getShopId() {
      return 20;
   }
}
