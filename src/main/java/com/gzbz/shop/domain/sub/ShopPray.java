package com.gzbz.shop.domain.sub;

import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.ShopDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopTreasureItemModel;
import com.gzbz.model.ShopTreasureLibModel;
import com.gzbz.model.ShopTreasureModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopPray extends AbstractShop {
   Logger logger = LoggerFactory.getLogger(ShopPray.class);

   public ShopPray(GamePlayer player) {
      super(player);
   }

   public ArrayList<ShopItemData> getShopList() {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData == null || jsonData.map.isEmpty()) {
         jsonData = this.randomShop();
         shopDao.setData(shopId, jsonData);
         shopDao.updateOp();
      }

      ArrayList<ShopItemData> list = new ArrayList();

      for(Map.Entry<Integer, Integer> entry : jsonData.map.entrySet()) {
         int id = (Integer)entry.getKey();
         ShopTreasureItemModel model = (ShopTreasureItemModel)this.player.getGameModelPool().getEntity("shopTreasureItem", id);
         if (model != null) {
            ShopItemData shopItemData = new ShopItemData();
            shopItemData.id = model.getId();
            shopItemData.restNum = 0 == model.getBuyLimit() ? 0 : Math.max(model.getBuyLimit() - (Integer)entry.getValue(), 0);
            list.add(shopItemData);
         }
      }

      return list;
   }

   public String getExcelName() {
      return "shopTreasureItem";
   }

   public int getShopId() {
      return 6;
   }

   public boolean refresh() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      int resourceType = Integer.parseInt(configManager.parseValue("shopTreasureReflashCost", 0, "\\|"));
      int itemId = Integer.parseInt(configManager.parseValue("shopTreasureReflashCost", 1, "\\|"));
      int itemNum = Integer.parseInt(configManager.parseValue("shopTreasureReflashCost", 2, "\\|"));
      if (!this.player.checkResourceNum(resourceType, itemId, itemNum)) {
         return this.player.failure(18);
      } else {
         this.player.delResource(resourceType, itemId, (long)itemNum, 1, 104, 0, 0, "");
         ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
         int shopId = this.getShopId();
         ShopJsonData jsonData = shopDao.getData(shopId);
         if (jsonData != null) {
            jsonData.map.clear();
            shopDao.updateOp();
         }

         ArrayList<ResourceModel> resourceModels = new ArrayList();
         resourceModels.add(new ResourceModel(resourceType, itemId, itemNum));
         String[] rewardsInfo = LogOperationMgr.toRewardsInfo(resourceModels);
         long leftNum = LogOperationMgr.getLeftNum(this.player, resourceType, itemId);
         this.player.getOperationMgr().addExtraLog(this.player, 177, this.getShopId() + "", "1", rewardsInfo[2], rewardsInfo[1], leftNum + "");
         return true;
      }
   }

   public void addExtraParams(ShopMsg.S2C_ShopData_7602.Builder builder) {
      long startTime = DateUtil.getDayStartTimeStamp() + 86400000L;
      builder.setRefreshTimes(startTime);
   }

   private ShopJsonData randomShop() {
      ShopJsonData shopJsonData = new ShopJsonData();
      Map<Integer, ShopTreasureModel> modelMap = this.player.getGameModelPool().getMap("shopTreasure");

      for(Map.Entry<Integer, ShopTreasureModel> entry : modelMap.entrySet()) {
         ShopTreasureModel model = (ShopTreasureModel)entry.getValue();
         int groupId = model.getGroupId();

         for(int i = 0; i < 100; ++i) {
            int id = this.getShopItem(groupId);
            if (id > 0 && !shopJsonData.map.containsKey(id)) {
               ShopTreasureItemModel itemModel = (ShopTreasureItemModel)this.player.getGameModelPool().getEntity("shopTreasureItem", id);
               if (itemModel != null) {
                  shopJsonData.map.put(itemModel.getId(), 0);
                  break;
               }
            }
         }
      }

      if (shopJsonData.map.size() != modelMap.size()) {
         this.logger.info("----- 祈福商城 随机的物品数量不对 -----");
      }

      return shopJsonData;
   }

   private int getShopItem(int groupId) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      int totalWeight = 0;
      List<ShopTreasureLibModel> list = new ArrayList();
      Map<Integer, ShopTreasureLibModel> modelMap = this.player.getGameModelPool().getMap("shopTreasureLib");

      for(Map.Entry<Integer, ShopTreasureLibModel> entry : modelMap.entrySet()) {
         ShopTreasureLibModel model = (ShopTreasureLibModel)entry.getValue();
         if (model.getGroupId() == groupId && (playerDao.lv >= model.getLvLimitEx() || playerDao.lv >= model.getLvLimit())) {
            totalWeight += model.getWeight();
            list.add(model);
         }
      }

      int tempValue = 0;
      int r = RandomUtil.randInt(totalWeight);

      for(ShopTreasureLibModel model : list) {
         tempValue += model.getWeight();
         if (tempValue > r) {
            return model.getShopItem();
         }
      }

      return 0;
   }
}
