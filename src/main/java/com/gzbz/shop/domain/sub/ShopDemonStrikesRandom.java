package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.demonStrikes.DemonStrikesMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopCountryWarCityModel;
import com.gzbz.protobuf.DemonStrikesMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Iterator;

public class ShopDemonStrikesRandom extends AbstractShop {
   public ShopDemonStrikesRandom(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopRandom";
   }

   public int getShopId() {
      return 29;
   }

   public ArrayList<ShopItemData> getShopList() {
      ArrayList<ShopItemData> shopItemDataList = super.getShopList();
      Iterator<ShopItemData> itemDataIterator = shopItemDataList.iterator();

      while(itemDataIterator.hasNext()) {
         ShopItemData shopItemData = (ShopItemData)itemDataIterator.next();
         ShopCountryWarCityModel shopCountryWarCityModel = (ShopCountryWarCityModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
         if (shopCountryWarCityModel == null) {
            itemDataIterator.remove();
         } else if (shopCountryWarCityModel.getMapType() != 2) {
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
         return shopCountryWarCityModel.getMapType() != 2 ? this.player.failure(0) : super.buyItem(id, num);
      }
   }

   public boolean isOpen() {
      DemonStrikesMgr demonStrikesMgr = (DemonStrikesMgr)ApplicationContextProvider.getContext().getBean(DemonStrikesMgr.class);
      return demonStrikesMgr.getState() != DemonStrikesMsg.SystemState.END && demonStrikesMgr.getStartTime() > 0 && demonStrikesMgr.getEndTime() > 0;
   }
}
