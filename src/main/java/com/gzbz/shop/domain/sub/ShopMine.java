package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopMine extends AbstractShop {
   public ShopMine(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopMine";
   }

   public int getShopId() {
      return 21;
   }
}
