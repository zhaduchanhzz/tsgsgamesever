package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.BeautyTreasureRotatePart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopBeautyTreasureRotateModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;

public class ShopBeautyTreasureRotate extends AbstractShop {
   public ShopBeautyTreasureRotate(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "beautyShopCopy";
   }

   public int getShopId() {
      return 36;
   }

   public boolean buyItem(int id, int num) {
      ShopBeautyTreasureRotateModel shopBeautyTreasureModel = (ShopBeautyTreasureRotateModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (shopBeautyTreasureModel == null) {
         return this.player.failure(0);
      } else {
         BeautyTreasureRotatePart beautyTreasurePart = (BeautyTreasureRotatePart)this.player.getMgrPart(BeautyTreasureRotatePart.class);
         return beautyTreasurePart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }
}
