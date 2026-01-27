package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.HuaJiaActPart;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.model.HuaJiaActivityShopNewModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopHuaJiaAct extends AbstractShop {
   public ShopHuaJiaAct(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "HuaJiaActivityShopNew";
   }

   public int getShopId() {
      return 52;
   }

   public boolean buyItem(int id, int num) {
      HuaJiaActivityShopNewModel model = (HuaJiaActivityShopNewModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (model == null) {
         return this.player.failure(0);
      } else {
         HuaJiaActPart HuaJiaActPart = (HuaJiaActPart)this.player.getMgrPart(HuaJiaActPart.class);
         return HuaJiaActPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      List<ShopItemBaseModel> shopItemBaseModels = super.getShopItemModelList();
      HuaJiaActPart HuaJiaActPart = (HuaJiaActPart)this.player.getMgrPart(HuaJiaActPart.class);
      int activityId = HuaJiaActPart.getPlayerActivityId();
      int activityStartDay = HuaJiaActPart.getActivityOpenDay();
      Iterator<ShopItemBaseModel> iterator = shopItemBaseModels.iterator();

      while(iterator.hasNext()) {
         HuaJiaActivityShopNewModel model = (HuaJiaActivityShopNewModel)iterator.next();
         if (model.getActId() != activityId) {
            iterator.remove();
         } else if (model.getDateEnd() == -1) {
            if (activityStartDay < model.getDateStart()) {
               iterator.remove();
            }
         } else if (activityStartDay < model.getDateStart() || activityStartDay > model.getDateEnd()) {
            iterator.remove();
         }
      }

      return shopItemBaseModels;
   }

   public ArrayList<ShopItemData> getShopList() {
      HuaJiaActPart tongQueParkPart = (HuaJiaActPart)this.player.getMgrPart(HuaJiaActPart.class);
      if (tongQueParkPart.getPlayerActivityId() <= 0) {
         this.player.failure(8007);
         return null;
      } else {
         ArrayList<ShopItemData> shopItemDataList = super.getShopList();
         TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);

         for(ShopItemData shopItemData : shopItemDataList) {
            HuaJiaActivityShopNewModel shopBeautyModel = (HuaJiaActivityShopNewModel)ApplicationContextProvider.getModelPoolEntity("HuaJiaActivityShopNew", shopItemData.id);
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
}
