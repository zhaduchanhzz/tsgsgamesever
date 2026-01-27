package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopBarbarianModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopBarbarian extends AbstractShop {
   public ShopBarbarian(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopBarbarian";
   }

   public int getShopId() {
      return 15;
   }

   public ArrayList<ShopItemData> getShopList() {
      ArrayList<ShopItemData> shopItemDataList = super.getShopList();
      ArrayList<ShopItemData> list = new ArrayList();

      for(ShopItemData shopItemData : shopItemDataList) {
         ShopBarbarianModel shopBarbarianModel = (ShopBarbarianModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
         if (shopBarbarianModel.getToSystem() <= 0 || this.player.isSystemOpen(shopBarbarianModel.getToSystem())) {
            list.add(shopItemData);
         }
      }

      return list;
   }
}
