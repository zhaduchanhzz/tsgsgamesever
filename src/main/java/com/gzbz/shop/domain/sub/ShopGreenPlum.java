package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.GreenPlumPart;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopGreenPlumModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopGreenPlum extends AbstractShop {
   public ShopGreenPlum(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopGreenPlum";
   }

   public int getShopId() {
      return 26;
   }

   public ArrayList<ShopItemData> getShopList() {
      GreenPlumPart greenPlumPart = (GreenPlumPart)this.player.getMgrPart(GreenPlumPart.class);
      if (greenPlumPart.getPlayerActivityId() <= 0) {
         this.player.failure(8007);
         return null;
      } else if (!greenPlumPart.isLastDay()) {
         return null;
      } else {
         ArrayList<ShopItemData> shopItemDataList = super.getShopList();

         for(ShopItemData shopItemData : shopItemDataList) {
            ShopGreenPlumModel shopGreenPlumModel = (ShopGreenPlumModel)ApplicationContextProvider.getModelPoolEntity("shopGreenPlum", shopItemData.id);
            if (shopGreenPlumModel.getItemType() == 2) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopGreenPlumModel.getItemId());
               if (itemModel != null && itemModel.getUseFuncType() != 18) {
               }
            }
         }

         return shopItemDataList;
      }
   }

   public boolean buyItem(int id, int num) {
      ShopGreenPlumModel shopGreenPlumModel = (ShopGreenPlumModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      return shopGreenPlumModel == null ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
