package com.gzbz.shop.domain.sub;

import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.ShopDao;
import com.gzbz.db.TrailTowerDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.shop.domain.AbstractShop;
import java.util.ArrayList;
import java.util.Map;

public class ShopTrailTower extends AbstractShop {
   public ShopTrailTower(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopTrailTower";
   }

   public int getShopId() {
      return 18;
   }

   public ArrayList<ShopItemData> getShopList() {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData == null) {
         jsonData = new ShopJsonData();
         shopDao.setData(shopId, jsonData);
         shopDao.updateOp();
      }

      ArrayList<ShopItemData> list = new ArrayList();
      Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());

      for(Map.Entry<Integer, ShopItemBaseModel> entry : modelMap.entrySet()) {
         ShopItemBaseModel model = (ShopItemBaseModel)entry.getValue();
         int hadBuyNum = (Integer)jsonData.map.getOrDefault(model.getId(), 0);
         ShopItemData shopItemData = new ShopItemData();
         shopItemData.id = model.getId();
         int restNum = 0 == model.getBuyLimit() ? 0 : Math.max(model.getBuyLimit() - hadBuyNum, 0);
         shopItemData.restNum = restNum;
         list.add(shopItemData);
      }

      return list;
   }

   public boolean buyItem(int id, int num) {
      int shopId = this.getShopId();
      ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      if (model.getBuyLimit() != 0) {
         int restNum = this.getRestNum(id);
         if (num > restNum) {
            return this.player.failure(4);
         }
      }

      TrailTowerDao trailTowerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
      if (trailTowerDao.totalStar < model.getLvLimit()) {
         return this.player.failure(5034);
      } else {
         PlayerPublicDao playerDao = this.player.getPublicDao();
         if (model.getVipLimit() > playerDao.vip_lv) {
            return this.player.failure(19);
         } else {
            int totalCost = num * model.getDisPrice();
            if (totalCost <= 0) {
               this.player.failure(4);
               this.player.closeChannel(LoginMsg.resultType.KICKOUT);
               return false;
            } else if (ResourceModel.checkTotalNumError(num, model.getDisPrice())) {
               return false;
            } else if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), num * model.getDisPrice())) {
               return this.player.failure(18);
            } else {
               this.recordBuyState(model, num);
               this.player.delResource(model.getResourceType(), model.getResourceId(), (long)(num * model.getDisPrice()), 1, 101, 0, 0, "shopId:" + shopId);
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
   }
}
