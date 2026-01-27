package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopCut extends AbstractShop {
   public ShopCut(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopCut";
   }

   public int getShopId() {
      return 3;
   }
}
