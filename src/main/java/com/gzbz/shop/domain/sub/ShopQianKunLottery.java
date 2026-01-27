package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.QianKunLotteryPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.ShopQianKunNewModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Iterator;
import java.util.List;

public class ShopQianKunLottery extends AbstractShop {
   public ShopQianKunLottery(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "qianKunShopNew";
   }

   public int getShopId() {
      return 39;
   }

   public boolean buyItem(int id, int num) {
      ShopQianKunNewModel model = (ShopQianKunNewModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), id);
      if (model == null) {
         return this.player.failure(0);
      } else {
         QianKunLotteryPart qianKunLotteryPart = (QianKunLotteryPart)this.player.getMgrPart(QianKunLotteryPart.class);
         return qianKunLotteryPart.getPlayerActivityId() <= 0 ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      List<ShopItemBaseModel> shopItemBaseModels = super.getShopItemModelList();
      QianKunLotteryPart qianKunLotteryPart = (QianKunLotteryPart)this.player.getMgrPart(QianKunLotteryPart.class);
      int activityId = qianKunLotteryPart.getPlayerActivityId();
      int activityStartDay = qianKunLotteryPart.getActivityOpenDay();
      Iterator<ShopItemBaseModel> iterator = shopItemBaseModels.iterator();

      while(iterator.hasNext()) {
         ShopQianKunNewModel model = (ShopQianKunNewModel)iterator.next();
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
}
