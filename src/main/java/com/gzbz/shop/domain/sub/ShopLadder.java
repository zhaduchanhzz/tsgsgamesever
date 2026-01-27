package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopLadder extends AbstractShop {
   public ShopLadder(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopLadder";
   }

   public int getShopId() {
      return 11;
   }
}
