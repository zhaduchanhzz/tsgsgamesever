package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.model.StonehengeShopModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopStonehenge extends AbstractShop {
   public ShopStonehenge(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "stonehengeShop";
   }

   public int getShopId() {
      return 49;
   }

   public boolean buyItem(int id, int num) {
      StonehengeShopModel stonehengeShopModel = (StonehengeShopModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (null == stonehengeShopModel) {
         return this.player.failure(37);
      } else {
         return stonehengeShopModel.getIsPlatformOpen() > 0 && !GodBeastDefine.isPlatformOpen() ? this.player.failure(21) : super.buyItem(id, num);
      }
   }

   public ArrayList<ShopItemData> getShopList() {
      ArrayList<ShopItemData> shopItemDataList = super.getShopList();
      ArrayList<ShopItemData> list = new ArrayList();

      for(ShopItemData shopItemData : shopItemDataList) {
         StonehengeShopModel stonehengeShopModel = (StonehengeShopModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
         if (stonehengeShopModel.getToSystem() <= 0 || this.player.isSystemOpen(stonehengeShopModel.getToSystem())) {
            list.add(shopItemData);
         }
      }

      return list;
   }
}
