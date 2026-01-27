package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopSevenBarbarian extends AbstractShop {
   public ShopSevenBarbarian(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopSevenBarbarian";
   }

   public int getShopId() {
      return 24;
   }
}
