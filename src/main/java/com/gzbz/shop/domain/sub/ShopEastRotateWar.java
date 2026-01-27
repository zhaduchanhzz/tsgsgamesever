package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.EastWarRotatePart;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopEastWarRotateModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopEastRotateWar extends AbstractShop {
   public ShopEastRotateWar(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopEastRotateWar";
   }

   public int getShopId() {
      return 35;
   }

   public ArrayList<ShopItemData> getShopList() {
      EastWarRotatePart eastWarRotatePart = (EastWarRotatePart)this.player.getMgrPart(EastWarRotatePart.class);
      if (eastWarRotatePart.getPlayerActivityId() <= 0) {
         this.player.failure(8007);
         return null;
      } else if (!eastWarRotatePart.isLastDay()) {
         return null;
      } else {
         ArrayList<ShopItemData> shopItemDataList = super.getShopList();

         for(ShopItemData shopItemData : shopItemDataList) {
            ShopEastWarRotateModel shopEastWarRotateModel = (ShopEastWarRotateModel)ApplicationContextProvider.getModelPoolEntity("shopEastRotateWar", shopItemData.id);
            if (shopEastWarRotateModel.getActivityID() == eastWarRotatePart.getPlayerActivityId() && shopEastWarRotateModel.getItemType() == 2) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopEastWarRotateModel.getItemId());
               if (itemModel != null && itemModel.getUseFuncType() != 18) {
               }
            }
         }

         return shopItemDataList;
      }
   }

   public boolean buyItem(int id, int num) {
      ShopEastWarRotateModel model = (ShopEastWarRotateModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      return model == null ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
