package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopHeroPalace extends AbstractShop {
   public ShopHeroPalace(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopHeroPalace";
   }

   public int getShopId() {
      return 40;
   }
}
