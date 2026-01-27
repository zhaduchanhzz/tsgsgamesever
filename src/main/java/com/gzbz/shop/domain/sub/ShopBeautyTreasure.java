package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.BeautyTreasurePart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopBeautyTreasureModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;

public class ShopBeautyTreasure extends AbstractShop {
   public ShopBeautyTreasure(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "beautyShop";
   }

   public int getShopId() {
      return 32;
   }

   public boolean buyItem(int id, int num) {
      ShopBeautyTreasureModel shopBeautyTreasureModel = (ShopBeautyTreasureModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (shopBeautyTreasureModel == null) {
         return this.player.failure(0);
      } else {
         BeautyTreasurePart beautyTreasurePart = (BeautyTreasurePart)this.player.getMgrPart(BeautyTreasurePart.class);
         return beautyTreasurePart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }
}
