package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopDragonWarModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopDragonWar extends AbstractShop {
   public ShopDragonWar(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopDragonWar";
   }

   public int getShopId() {
      return 42;
   }

   public boolean buyItem(int id, int num) {
      ShopDragonWarModel model = (ShopDragonWarModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      return model == null ? this.player.failure(8007) : super.buyItem(id, num);
   }

   public ArrayList<ShopItemData> getShopList() {
      ArrayList<ShopItemData> shopItemDataList = super.getShopList();
      ArrayList<ShopItemData> list = new ArrayList();

      for(ShopItemData shopItemData : shopItemDataList) {
         ShopDragonWarModel shopDragonWarModel = (ShopDragonWarModel)ApplicationContextProvider.getModelPoolEntity("shopDragonWar", shopItemData.id);
         if (shopDragonWarModel.getToSystem() <= 0 || this.player.isSystemOpen(shopDragonWarModel.getToSystem())) {
            list.add(shopItemData);
         }
      }

      return list;
   }
}
