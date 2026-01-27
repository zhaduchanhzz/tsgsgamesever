package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopAlliance extends AbstractShop {
   public ShopAlliance(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopAlliance";
   }

   public int getShopId() {
      return 14;
   }
}
