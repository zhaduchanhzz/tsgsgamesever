package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopTrans extends AbstractShop {
   public ShopTrans(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopTrans";
   }

   public int getShopId() {
      return 16;
   }
}
