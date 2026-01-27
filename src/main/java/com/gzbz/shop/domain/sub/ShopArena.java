package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopArena extends AbstractShop {
   public ShopArena(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopArena";
   }

   public int getShopId() {
      return 4;
   }
}
