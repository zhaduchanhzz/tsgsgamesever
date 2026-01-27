package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.demonStrikes.DemonStrikesMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopMilitaryModel;
import com.gzbz.protobuf.DemonStrikesMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Iterator;

public class ShopDemonStrikesMilitary extends AbstractShop {
   public ShopDemonStrikesMilitary(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopMilitary";
   }

   public int getShopId() {
      return 28;
   }

   public ArrayList<ShopItemData> getShopList() {
      DemonStrikesMgr demonStrikesMgr = (DemonStrikesMgr)ApplicationContextProvider.getContext().getBean(DemonStrikesMgr.class);
      ArrayList<ShopItemData> shopItemDataList = super.getShopList();
      Iterator<ShopItemData> itemDataIterator = shopItemDataList.iterator();

      while(itemDataIterator.hasNext()) {
         ShopItemData shopItemData = (ShopItemData)itemDataIterator.next();
         ShopMilitaryModel shopMilitaryModel = (ShopMilitaryModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
         if (shopMilitaryModel == null) {
            itemDataIterator.remove();
         } else if (shopMilitaryModel.getMapType() != 2 || shopMilitaryModel.getMapId() != 0 && shopMilitaryModel.getMapId() != demonStrikesMgr.getMapId()) {
            itemDataIterator.remove();
         }
      }

      return shopItemDataList;
   }

   public boolean buyItem(int id, int num) {
      ShopMilitaryModel shopMilitaryModel = (ShopMilitaryModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (shopMilitaryModel == null) {
         return this.player.failure(0);
      } else if (shopMilitaryModel.getMapType() != 2) {
         return this.player.failure(0);
      } else {
         DemonStrikesMgr demonStrikesMgr = (DemonStrikesMgr)ApplicationContextProvider.getContext().getBean(DemonStrikesMgr.class);
         return shopMilitaryModel.getMapId() > 0 && shopMilitaryModel.getMapId() != demonStrikesMgr.getMapId() ? this.player.failure(0) : super.buyItem(id, num);
      }
   }

   public boolean isOpen() {
      DemonStrikesMgr demonStrikesMgr = (DemonStrikesMgr)ApplicationContextProvider.getContext().getBean(DemonStrikesMgr.class);
      return demonStrikesMgr.getState() != DemonStrikesMsg.SystemState.END && demonStrikesMgr.getStartTime() > 0 && demonStrikesMgr.getEndTime() > 0;
   }
}
