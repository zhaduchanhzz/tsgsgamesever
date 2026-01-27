package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopEventhero extends AbstractShop {
   public ShopEventhero(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopEventHero";
   }

   public int getShopId() {
      return 25;
   }
}
