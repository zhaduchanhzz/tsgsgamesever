package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopPeak extends AbstractShop {
   public ShopPeak(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopPeak";
   }

   public int getShopId() {
      return 7;
   }
}
