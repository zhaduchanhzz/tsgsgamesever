package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.SplendidCityPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopGreatCityGame extends AbstractShop {
   public ShopGreatCityGame(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "GreatCityGameShop";
   }

   public int getShopId() {
      return 37;
   }

   public boolean buyItem(int id, int num) {
      SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
      return splendidCityPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
