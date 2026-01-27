package com.gzbz.shop.domain.sub;

import com.gzbz.db.ShopDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopHeroModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Map;

public class ShopHero extends AbstractShop {
   public ShopHero(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopHero";
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
      Map<Integer, ShopHeroModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());

      for(Map.Entry<Integer, ShopHeroModel> entry : modelMap.entrySet()) {
         ShopHeroModel model = (ShopHeroModel)entry.getValue();
         int hadBuyNum = (Integer)jsonData.map.getOrDefault(model.getId(), 0);
         if (this.checkLv(model.getLvLimit(), model.getLvLimitEx(), model.getWorldlvLimit())) {
            ShopItemData shopItemData = new ShopItemData();
            shopItemData.id = model.getId();
            int restNum = 0 == model.getBuyLimit() ? 0 : Math.max(model.getBuyLimit() - hadBuyNum, 0);
            shopItemData.restNum = restNum;
            list.add(shopItemData);
         }
      }

      return list;
   }

   public boolean buyItem(int id, int num) {
      if (!super.buyItem(id, num)) {
         return false;
      } else {
         if (this.isSellOut()) {
            this.autoRefresh(true);
         }

         return true;
      }
   }

   public int getShopId() {
      return 2;
   }

   public boolean refresh() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      int resourceType = Integer.parseInt(configManager.parseValue("shopHeroResetCost", 0, "\\|"));
      int itemId = Integer.parseInt(configManager.parseValue("shopHeroResetCost", 1, "\\|"));
      int itemNum = Integer.parseInt(configManager.parseValue("shopHeroResetCost", 2, "\\|"));
      if (!this.player.checkResourceNum(resourceType, itemId, itemNum)) {
         this.player.failure(18);
         return false;
      } else {
         this.player.delResource(resourceType, itemId, (long)itemNum, 1, 103, 0, 0, "");
         this.autoRefresh(false);
         ArrayList<ResourceModel> resourceModels = new ArrayList();
         resourceModels.add(new ResourceModel(resourceType, itemId, itemNum));
         String[] rewardsInfo = LogOperationMgr.toRewardsInfo(resourceModels);
         long leftNum = LogOperationMgr.getLeftNum(this.player, resourceType, itemId);
         this.player.getOperationMgr().addExtraLog(this.player, 177, this.getShopId() + "", "1", rewardsInfo[2], rewardsInfo[1], leftNum + "");
         return true;
      }
   }

   private boolean isSellOut() {
      int shopId = this.getShopId();
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData == null) {
         return false;
      } else {
         Map<Integer, ShopHeroModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());

         for(Map.Entry<Integer, ShopHeroModel> entry : modelMap.entrySet()) {
            ShopHeroModel model = (ShopHeroModel)entry.getValue();
            if (!jsonData.map.containsKey(model.getId())) {
               return false;
            }

            int hadBuyNum = (Integer)jsonData.map.getOrDefault(model.getId(), 0);
            if (model.getBuyLimit() > 0 && hadBuyNum < model.getBuyLimit()) {
               return false;
            }
         }

         return true;
      }
   }

   private void autoRefresh(boolean bSend) {
      int shopId = this.getShopId();
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData != null) {
         jsonData.map.clear();
         shopDao.updateOp();
      }

      if (bSend) {
         ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
         shopPart.handleSendShopData(shopId, 1);
      }

   }
}
