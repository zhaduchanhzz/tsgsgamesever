package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopSkin extends AbstractShop {
   public ShopSkin(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopSkin";
   }

   public int getShopId() {
      return 9;
   }
}
