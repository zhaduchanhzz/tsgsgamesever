package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.ActivityChineseNewYearPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.shop.domain.AbstractShop;

public class ShopChineseNewYear extends AbstractShop {
   public ShopChineseNewYear(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "ChunJieConvert";
   }

   public int getShopId() {
      return 47;
   }

   public boolean buyItem(int id, int num) {
      ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
      return chineseNewYearPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
