package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopCountryWarCityModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Iterator;

public class ShopCountryWarCity extends AbstractShop {
   public ShopCountryWarCity(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopRandom";
   }

   public int getShopId() {
      return 19;
   }

   public ArrayList<ShopItemData> getShopList() {
      ArrayList<ShopItemData> shopItemDataList = super.getShopList();
      Iterator<ShopItemData> itemDataIterator = shopItemDataList.iterator();

      while(itemDataIterator.hasNext()) {
         ShopItemData shopItemData = (ShopItemData)itemDataIterator.next();
         ShopCountryWarCityModel shopCountryWarCityModel = (ShopCountryWarCityModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
         if (shopCountryWarCityModel == null) {
            itemDataIterator.remove();
         } else if (shopCountryWarCityModel.getMapType() != 1) {
            itemDataIterator.remove();
         }
      }

      return shopItemDataList;
   }

   public boolean buyItem(int id, int num) {
      ShopCountryWarCityModel shopCountryWarCityModel = (ShopCountryWarCityModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (shopCountryWarCityModel == null) {
         return this.player.failure(0);
      } else {
         return shopCountryWarCityModel.getMapType() != 1 ? this.player.failure(0) : super.buyItem(id, num);
      }
   }
}
