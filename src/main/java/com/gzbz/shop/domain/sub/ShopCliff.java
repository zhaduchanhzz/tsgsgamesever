package com.gzbz.shop.domain.sub;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.shop.domain.AbstractShop;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopCliff extends AbstractShop {
   public ShopCliff(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopCliff";
   }

   public int getShopId() {
      return 12;
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      List<ShopItemBaseModel> list = new ArrayList();
      Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());
      if (modelMap == null) {
         return list;
      } else {
         for(Map.Entry<Integer, ShopItemBaseModel> modelEntry : modelMap.entrySet()) {
            ShopItemBaseModel shopItemBaseModel = (ShopItemBaseModel)modelEntry.getValue();
            if (this.checkLv(shopItemBaseModel.getLvLimit(), shopItemBaseModel.getLvLimitEx(), shopItemBaseModel.getWorldlvLimit()) || shopItemBaseModel.getItemType() == 2 && shopItemBaseModel.getItemId() == 1048) {
               list.add(shopItemBaseModel);
            }
         }

         return list;
      }
   }
}
