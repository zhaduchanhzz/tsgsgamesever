package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopMedal extends AbstractShop {
   public ShopMedal(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopMedal";
   }

   public int getShopId() {
      return 8;
   }
}
