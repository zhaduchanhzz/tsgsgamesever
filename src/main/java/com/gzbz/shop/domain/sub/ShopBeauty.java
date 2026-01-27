package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.TongQueParkPart;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopBeautyModel;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopBeauty extends AbstractShop {
   public ShopBeauty(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopBeauty";
   }

   public int getShopId() {
      return 22;
   }

   public ArrayList<ShopItemData> getShopList() {
      TongQueParkPart tongQueParkPart = (TongQueParkPart)this.player.getMgrPart(TongQueParkPart.class);
      if (tongQueParkPart.getPlayerActivityId() <= 0) {
         this.player.failure(8007);
         return null;
      } else {
         ArrayList<ShopItemData> shopItemDataList = super.getShopList();
         TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);

         for(ShopItemData shopItemData : shopItemDataList) {
            ShopBeautyModel shopBeautyModel = (ShopBeautyModel)ApplicationContextProvider.getModelPoolEntity("shopBeauty", shopItemData.id);
            if (shopBeautyModel.getItemType() == 2) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopBeautyModel.getItemId());
               if (itemModel != null && itemModel.getUseFuncType() == 18) {
                  TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao(itemModel.getUseFuncId());
                  if (tongqueTerraceDao != null && tongqueTerraceDao.state >= 2) {
                     shopItemData.restNum = 0;
                  }
               }
            }
         }

         return shopItemDataList;
      }
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      List<ShopItemBaseModel> shopItemBaseModels = super.getShopItemModelList();
      TongQueParkPart tongQueParkPart = (TongQueParkPart)this.player.getMgrPart(TongQueParkPart.class);
      int activityId = tongQueParkPart.getPlayerActivityId();
      Iterator<ShopItemBaseModel> iterator = shopItemBaseModels.iterator();

      while(iterator.hasNext()) {
         ShopBeautyModel shopBeautyModel = (ShopBeautyModel)iterator.next();
         if (shopBeautyModel.getActivityId() != activityId) {
            iterator.remove();
         }
      }

      return shopItemBaseModels;
   }

   public boolean buyItem(int id, int num) {
      ShopBeautyModel shopBeautyModel = (ShopBeautyModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      if (shopBeautyModel == null) {
         return this.player.failure(8007);
      } else {
         TongQueParkPart tongQueParkPart = (TongQueParkPart)this.player.getMgrPart(TongQueParkPart.class);
         int activityId = tongQueParkPart.getPlayerActivityId();
         return shopBeautyModel.getActivityId() != activityId ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }
}
