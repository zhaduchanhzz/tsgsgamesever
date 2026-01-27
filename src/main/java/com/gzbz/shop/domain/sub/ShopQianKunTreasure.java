package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.QianKunTreasurePart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.ShopQianKunTreasureModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Iterator;
import java.util.List;

public class ShopQianKunTreasure extends AbstractShop {
   public ShopQianKunTreasure(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "qianKunShop";
   }

   public int getShopId() {
      return 38;
   }

   public boolean buyItem(int id, int num) {
      ShopQianKunTreasureModel shopBeautyTreasureModel = (ShopQianKunTreasureModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (shopBeautyTreasureModel == null) {
         return this.player.failure(0);
      } else {
         QianKunTreasurePart beautyTreasurePart = (QianKunTreasurePart)this.player.getMgrPart(QianKunTreasurePart.class);
         return beautyTreasurePart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      List<ShopItemBaseModel> shopItemBaseModels = super.getShopItemModelList();
      QianKunTreasurePart qianKunTreasurePart = (QianKunTreasurePart)this.player.getMgrPart(QianKunTreasurePart.class);
      int activityId = qianKunTreasurePart.getPlayerActivityId();
      Iterator<ShopItemBaseModel> iterator = shopItemBaseModels.iterator();

      while(iterator.hasNext()) {
         ShopQianKunTreasureModel shopQianKunTreasureModel = (ShopQianKunTreasureModel)iterator.next();
         if (shopQianKunTreasureModel.getActId() != activityId) {
            iterator.remove();
         }
      }

      return shopItemBaseModels;
   }
}
