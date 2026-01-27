package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopWorldCup extends AbstractShop {
   public ShopWorldCup(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "WorldCupShop";
   }

   public int getShopId() {
      return 48;
   }
}
