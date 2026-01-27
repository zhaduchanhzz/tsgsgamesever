package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.TaskData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopDuelModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.DuelTaskPart;

public class ShopDuel extends AbstractShop {
   public ShopDuel(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopWudao";
   }

   public int getShopId() {
      return 34;
   }

   public boolean buyItem(int id, int num) {
      if (!super.buyItem(id, num)) {
         return false;
      } else {
         ShopDuelModel shopDuelModel = (ShopDuelModel)ApplicationContextProvider.getModelPoolEntity("shopWudao", id);
         if (shopDuelModel.getTask() <= 0) {
            return true;
         } else {
            DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
            TaskData taskData = duelTaskPart.getTask(shopDuelModel.getTask());
            return taskData != null && taskData.state == 3;
         }
      }
   }
}
