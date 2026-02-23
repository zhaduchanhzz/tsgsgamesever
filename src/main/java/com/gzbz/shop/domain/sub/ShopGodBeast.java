package com.gzbz.shop.domain.sub;

import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.ShopDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopGodBeastItemModel;
import com.gzbz.model.ShopGodBeastLibModel;
import com.gzbz.model.ShopGodBeastModel;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.RandomUtil;
import org.springframework.util.CollectionUtils;

public class ShopGodBeast extends AbstractShop {
   public ShopGodBeast(GamePlayer player) {
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
         ShopGodBeastItemModel model = (ShopGodBeastItemModel)this.player.getGameModelPool().getEntity("shopGodBeastItem", id);
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
      return "shopGodBeastItem";
   }

   public int getShopId() {
      return 44;
   }

   public boolean refresh() {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      int shopGodBeastFreeReflashNum = configManager.getIntDefault("shopGodBeastFreeReflashNum", 3);
      int shopGodBeastFreeReflashTime = configManager.getIntDefault("shopGodBeastFreeReflashTime", 28800);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int resumeTime = (Integer)playerResetCustomCache.getForeverNum(144, 0);
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      if (curTime < resumeTime && resumeTime - curTime >= shopGodBeastFreeReflashTime * (shopGodBeastFreeReflashNum - 1)) {
         int totalRefreshNum = (Integer)playerResetCustomCache.getDailyNum(143, 0);
         int shopGodBeastReflashNum = configManager.getIntDefault("shopGodBeastReflashNum", 20);
         if (totalRefreshNum >= shopGodBeastReflashNum) {
            this.player.failure(1000);
            return false;
         }

         int resourceType = Integer.parseInt(configManager.parseValue("shopGodBeastReflashCost", 0, "\\|"));
         int itemId = Integer.parseInt(configManager.parseValue("shopGodBeastReflashCost", 1, "\\|"));
         int itemNum = Integer.parseInt(configManager.parseValue("shopGodBeastReflashCost", 2, "\\|"));
         if (!this.player.checkResourceNum(resourceType, itemId, itemNum)) {
            this.player.failure(18);
            return false;
         }

         this.player.delResource(resourceType, itemId, (long)itemNum, 1, 106, 0, 0, "");
         playerResetCustomCache.addDailyReset(143, 1);
         ArrayList<ResourceModel> resourceModels = new ArrayList();
         resourceModels.add(new ResourceModel(resourceType, itemId, itemNum));
         String[] rewardsInfo = LogOperationMgr.toRewardsInfo(resourceModels);
         long leftNum = LogOperationMgr.getLeftNum(this.player, resourceType, itemId);
         this.player.getOperationMgr().addExtraLog(this.player, 177, this.getShopId() + "", "1", rewardsInfo[2], rewardsInfo[1], leftNum + "");
      } else {
         int beginTime = curTime > resumeTime ? curTime : resumeTime;
         int newResumeTime = beginTime + shopGodBeastFreeReflashTime;
         if (newResumeTime < curTime) {
            newResumeTime = curTime + shopGodBeastFreeReflashTime;
         }

         playerResetCustomCache.setForever(144, newResumeTime);
         this.player.getOperationMgr().addExtraLog(this.player, 177, this.getShopId() + "", "1", "-", "-", "-");
      }

      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData != null) {
         jsonData.map.clear();
         shopDao.updateOp();
      }

      return true;
   }

   public void autoBuyItems() {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      Set<Integer> autoIdSet = shopDao.autoMap.get(this.getShopId());
      Set<Integer> actualBuy = new HashSet();
      if (!CollectionUtils.isEmpty(autoIdSet)) {
         for(ShopItemData shopItemData : this.getShopList()) {
            if (autoIdSet.contains(shopItemData.id)) {
               ShopGodBeastItemModel model = (ShopGodBeastItemModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
               if (model != null && model.getAutoBuy() == 1 && (model.getBuyLimit() == 0 || shopItemData.restNum > 0)) {
                  int hintCode = this.checkBuyCondition(model);
                  if (hintCode == 1 && this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), model.getDisPrice())) {
                     actualBuy.add(shopItemData.id);
                  }
               }
            }
         }
      }

      if (actualBuy.size() > 0) {
         ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
         List<ResourceModel> resourceModels = new ArrayList();

         for(Integer id : actualBuy) {
            int num = 1;
            int hintCode = shopPart.buyHandle(this.getShopId(), id, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW);
            if (hintCode == 1) {
               ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
               resourceModels.add(new ResourceModel(model.getItemType(), model.getItemId(), model.getCombineNum() * num));
               shopPart.buyRecord(this.getShopId(), model.getItemType(), model.getItemId(), model.getCombineNum() * num, 1);
            }
         }

         if (resourceModels.size() > 0) {
            this.player.addResourceMsg(resourceModels);
            this.player.sendResourceMsg();
         }
      }

   }

   public void addExtraParams(ShopMsg.S2C_ShopData_7602.Builder builder) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int totalRefreshNum = (Integer)playerResetCustomCache.getDailyNum(143, 0);
      builder.setTotalTimes(totalRefreshNum);
      int refreshTime = (Integer)playerResetCustomCache.getForeverNum(144, 0);
      int useFreeTime = 0;
      if (refreshTime != 0) {
         int offset = refreshTime - DateUtil.getIntTime(System.currentTimeMillis());
         if (offset > 0) {
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            int shopGodBeastFreeReflashTime = configManager.getIntDefault("shopGodBeastFreeReflashTime", 28800);
            useFreeTime = (offset - 1) / shopGodBeastFreeReflashTime + 1;
         }
      }

      builder.setUseFreeTime(useFreeTime);
      builder.setRefreshTimes((long)refreshTime);
   }

   private ShopJsonData randomShop() {
      ShopJsonData shopJsonData = new ShopJsonData();
      Map<Integer, ShopGodBeastModel> modelMap = this.player.getGameModelPool().getMap("shopGodBeast");

      for(Map.Entry<Integer, ShopGodBeastModel> entry : modelMap.entrySet()) {
         ShopGodBeastModel model = (ShopGodBeastModel)entry.getValue();
         int groupId = model.getGroupId();

         for(int i = 0; i < 100; ++i) {
            int id = this.getShopItem(groupId);
            if (id > 0 && !shopJsonData.map.containsKey(id)) {
               ShopGodBeastItemModel itemModel = (ShopGodBeastItemModel)this.player.getGameModelPool().getEntity("shopGodBeastItem", id);
               if (itemModel != null) {
                  shopJsonData.map.put(itemModel.getId(), 0);
                  break;
               }
            }
         }
      }

      if (shopJsonData.map.size() != modelMap.size()) {
         System.out.println("----- 灵兽技能书商城 随机的物品数量不对 -----");
      }

      return shopJsonData;
   }

   private int getShopItem(int groupId) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      int totalWeight = 0;
      List<ShopGodBeastLibModel> list = new ArrayList();
      Map<Integer, ShopGodBeastLibModel> modelMap = this.player.getGameModelPool().getMap("shopGodBeastLib");

      for(Map.Entry<Integer, ShopGodBeastLibModel> entry : modelMap.entrySet()) {
         ShopGodBeastLibModel model = (ShopGodBeastLibModel)entry.getValue();
         if (model.getGroupId() == groupId && (playerDao.lv >= model.getLvLimitEx() || playerDao.lv >= model.getLvLimit())) {
            totalWeight += model.getWeight();
            list.add(model);
         }
      }

      int tempValue = 0;
      int r = RandomUtil.randInt(totalWeight);

      for(ShopGodBeastLibModel model : list) {
         tempValue += model.getWeight();
         if (tempValue > r) {
            return model.getShopItem();
         }
      }

      return 0;
   }
}
