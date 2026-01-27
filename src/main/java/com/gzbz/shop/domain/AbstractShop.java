package com.gzbz.shop.domain;

import com.gzbz.db.PlayerDao;
import com.gzbz.db.ShopDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractShop {
   protected GamePlayer player;
   protected Logger logger = LoggerFactory.getLogger(this.getClass());

   public abstract String getExcelName();

   public abstract int getShopId();

   public AbstractShop(GamePlayer player) {
      this.player = player;
   }

   public ArrayList<ShopItemData> getShopList() {
      return this.getShopItemDataList(this.getShopItemModelList());
   }

   public ArrayList<ShopItemData> getShopItemDataList(List<ShopItemBaseModel> shopItemModelList) {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData == null) {
         jsonData = new ShopJsonData();
         shopDao.setData(shopId, jsonData);
         shopDao.updateOp();
      }

      ArrayList<ShopItemData> list = new ArrayList();
      if (shopItemModelList == null) {
         return list;
      } else {
         for(ShopItemBaseModel shopItemBaseModel : shopItemModelList) {
            int hadBuyNum = (Integer)MapUtil.getOrDefault(jsonData.map, shopItemBaseModel.getId(), 0);
            ShopItemData shopItemData = new ShopItemData();
            shopItemData.id = shopItemBaseModel.getId();
            shopItemData.restNum = 0 == shopItemBaseModel.getBuyLimit() ? 0 : Math.max(shopItemBaseModel.getBuyLimit() - hadBuyNum, 0);
            list.add(shopItemData);
         }

         return list;
      }
   }

   public List<ShopItemBaseModel> getShopItemModelList() {
      Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());
      if (modelMap == null) {
         this.logger.info("商城配置出错 shopId:{}, excelName:{}", this.getShopId(), this.getExcelName());
         return null;
      } else {
         List<ShopItemBaseModel> list = new ArrayList();

         for(Map.Entry<Integer, ShopItemBaseModel> modelEntry : modelMap.entrySet()) {
            ShopItemBaseModel shopItemBaseModel = (ShopItemBaseModel)modelEntry.getValue();
            if (this.checkLv(shopItemBaseModel.getLvLimit(), shopItemBaseModel.getLvLimitEx(), shopItemBaseModel.getWorldlvLimit())) {
               list.add(shopItemBaseModel);
            }
         }

         return list;
      }
   }

   public boolean buyItem(int id, int num) {
      if (num <= 0) {
         return this.player.failure(6);
      } else {
         int shopId = this.getShopId();
         ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
         if (model == null) {
            this.logger.error("商品:{}不存在", id);
            return this.player.failure(0);
         } else {
            if (model.getBuyLimit() != 0) {
               int restNum = this.getRestNum(id);
               if (num > restNum) {
                  return this.player.failure(4);
               }
            }

            int hintCode = this.checkBuyCondition(model);
            if (hintCode != 1) {
               this.player.failure(hintCode);
               return false;
            } else {
               int totalCost = num * model.getDisPrice();
               if (model.getDisPrice() > 0 && totalCost < model.getDisPrice()) {
                  this.player.failure(4);
                  this.player.closeChannel(LoginMsg.resultType.KICKOUT);
                  return false;
               } else if (ResourceModel.checkTotalNumError(num, model.getDisPrice())) {
                  return false;
               } else if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), num * model.getDisPrice())) {
                  String errorStr = ResourceModel.getResourceErrorTips(model.getResourceType(), model.getResourceId());
                  this.player.failure(53, errorStr);
                  return false;
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

   public int checkBuyCondition(ShopItemBaseModel model) {
      if (model == null) {
         return 0;
      } else if (!this.checkLv(model.getLvLimit(), model.getLvLimitEx(), model.getWorldlvLimit())) {
         return 20;
      } else {
         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
         return model.getVipLimit() > playerDao.vip_lv ? 19 : 1;
      }
   }

   public boolean refresh() {
      return false;
   }

   public void addExtraParams(ShopMsg.S2C_ShopData_7602.Builder builder) {
   }

   public void handleReset(int restType) {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData != null) {
         Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());
         ArrayList<Integer> list = new ArrayList();

         for(Map.Entry<Integer, Integer> entry : jsonData.map.entrySet()) {
            int id = (Integer)entry.getKey();
            ShopItemBaseModel model = (ShopItemBaseModel)modelMap.get(id);
            if (model == null) {
               this.logger.warn("表名:" + this.getExcelName() + " 物品id:" + id + " 没有了,请检查");
               list.add(id);
            }

            if (model != null && model.getAutoReset() == restType) {
               list.add(id);
            }
         }

         for(Integer id : list) {
            jsonData.map.remove(id);
         }
      }

      shopDao.updateOp();
   }

   public void resetShop() {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData != null) {
         jsonData.map.clear();
         shopDao.updateOp();
      }

   }

   public int getRestNum(int id) {
      String excelName = this.getExcelName();
      ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(excelName, id);
      if (model == null) {
         return 0;
      } else if (model.getBuyLimit() == 0) {
         return 0;
      } else {
         int shopId = this.getShopId();
         ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
         ShopJsonData shopJsonData = shopDao.getData(shopId);
         if (shopJsonData != null && shopJsonData.map.containsKey(id)) {
            int hadBuyNum = (Integer)MapUtil.getOrDefault(shopJsonData.map, id, 0);
            return Math.max(model.getBuyLimit() - hadBuyNum, 0);
         } else {
            return model.getBuyLimit();
         }
      }
   }

   public boolean isOpen() {
      return true;
   }

   protected void recordBuyState(ShopItemBaseModel model, int num) {
      if (model.getBuyLimit() != 0) {
         int shopId = this.getShopId();
         ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
         ShopJsonData shopJsonData = shopDao.getData(shopId);
         if (shopJsonData == null) {
            shopJsonData = new ShopJsonData();
            shopDao.setData(shopId, shopJsonData);
         }

         int hadBuyNum = (Integer)MapUtil.getOrDefault(shopJsonData.map, model.getId(), 0);
         shopJsonData.map.put(model.getId(), hadBuyNum + num);
         shopDao.updateOp();
      }
   }

   public boolean checkLv(int lvLimit, int lvLimitEx, int worldlvLimit) {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.lv >= lvLimitEx) {
         return true;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         return playerDao.lv >= lvLimit && worldMgr.getWorldLv() >= worldlvLimit;
      }
   }

   public void autoBuyItems() {
   }
}
