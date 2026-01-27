package com.gzbz.shop.domain.sub;

import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopUnionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.shop.domain.AbstractShop;
import java.util.ArrayList;

public class ShopUnion extends AbstractShop {
   public ShopUnion(GamePlayer player) {
      super(player);
   }

   public ArrayList<ShopItemData> getShopList() {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      if (playerDao.unionId <= 0) {
         this.player.failure(23);
         return null;
      } else {
         return super.getShopList();
      }
   }

   public boolean buyItem(int id, int num) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      if (playerDao.unionId <= 0) {
         return this.player.failure(23);
      } else {
         int shopId = this.getShopId();
         ShopUnionModel model = (ShopUnionModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
         if (model.getBuyLimit() != 0) {
            int restNum = this.getRestNum(id);
            if (num > restNum) {
               return this.player.failure(4);
            }
         }

         if (!this.checkLv(model.getLvLimit(), model.getLvLimitEx(), model.getWorldlvLimit())) {
            return this.player.failure(20);
         } else if (model.getVipLimit() > playerDao.vip_lv) {
            return this.player.failure(19);
         } else if (ResourceModel.checkTotalNumError(num, model.getDisPrice())) {
            return false;
         } else if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), num * model.getDisPrice())) {
            return this.player.failure(18);
         } else {
            this.recordBuyState(model, num);
            this.player.delResource(model.getResourceType(), model.getResourceId(), (long)(num * model.getDisPrice()), 1, 101, 0, 0, "shopId:" + shopId);
            this.player.triggerTask(503, 0, 1L, 1);
            ArrayList<ResourceModel> resourceModels = new ArrayList();
            resourceModels.add(new ResourceModel(model.getResourceType(), model.getResourceId(), num * model.getDisPrice()));
            String[] rewardsInfo = LogOperationMgr.toRewardsInfo(resourceModels);
            long leftNum = LogOperationMgr.getLeftNum(this.player, model.getResourceType(), model.getResourceId());
            String[] getItemInfo = LogOperationMgr.toRewardsInfo(new ResourceModel(model.getItemType(), model.getItemId(), num));
            this.player.getOperationMgr().addExtraLog(this.player, 176, shopId + "", getItemInfo[0], getItemInfo[2], num + "", rewardsInfo[2], rewardsInfo[1], leftNum + "");
            return true;
         }
      }
   }

   public String getExcelName() {
      return "shopUnion";
   }

   public int getShopId() {
      return 5;
   }

   public boolean isOpen() {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      return playerDao.unionId > 0;
   }
}
