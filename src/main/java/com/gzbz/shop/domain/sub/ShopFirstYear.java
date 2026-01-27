package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopFirstYear extends AbstractShop {
   public ShopFirstYear(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "FristYearConvert";
   }

   public int getShopId() {
      return 46;
   }

   public boolean buyItem(int id, int num) {
      AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
      return anniversaryCelebrationPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
