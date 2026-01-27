package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.SupremeShopModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.List;

public class ShopSupremePvp extends AbstractShop {
   public ShopSupremePvp(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "JiuZhouShop";
   }

   public int getShopId() {
      return 56;
   }

   public boolean buyItem(int id, int num) {
      SupremeShopModel supremeShopModel = (SupremeShopModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (supremeShopModel == null) {
         return this.player.failure(0);
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         return supremeShopModel.getOpenTime() > worldMgr.getOpenServerDays() ? this.player.failure(54) : super.buyItem(id, num);
      }
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      List<ShopItemBaseModel> shopItemModelList = super.getShopItemModelList();
      if (shopItemModelList != null) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         int openServerDays = worldMgr.getOpenServerDays();
         shopItemModelList.removeIf((shopItemBaseModel) -> {
            SupremeShopModel supremeShopModel = (SupremeShopModel)shopItemBaseModel;
            return supremeShopModel.getOpenTime() > openServerDays;
         });
      }

      return shopItemModelList;
   }
}
