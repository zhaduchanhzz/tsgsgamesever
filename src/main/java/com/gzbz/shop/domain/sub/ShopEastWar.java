package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.EastWarPart;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopEastWarModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopEastWar extends AbstractShop {
   public ShopEastWar(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopEastWar";
   }

   public int getShopId() {
      return 33;
   }

   public ArrayList<ShopItemData> getShopList() {
      EastWarPart eastWarPart = (EastWarPart)this.player.getMgrPart(EastWarPart.class);
      if (eastWarPart.getPlayerActivityId() <= 0) {
         this.player.failure(8007);
         return null;
      } else if (!eastWarPart.isLastDay()) {
         return null;
      } else {
         ArrayList<ShopItemData> shopItemDataList = super.getShopList();

         for(ShopItemData shopItemData : shopItemDataList) {
            ShopEastWarModel shopEastWarModel = (ShopEastWarModel)ApplicationContextProvider.getModelPoolEntity("shopEastWar", shopItemData.id);
            if (shopEastWarModel.getActivityID() == eastWarPart.getPlayerActivityId() && shopEastWarModel.getItemType() == 2) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopEastWarModel.getItemId());
               if (itemModel != null && itemModel.getUseFuncType() != 18) {
               }
            }
         }

         return shopItemDataList;
      }
   }

   public boolean buyItem(int id, int num) {
      ShopEastWarModel model = (ShopEastWarModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      return model == null ? this.player.failure(8007) : super.buyItem(id, num);
   }
}
