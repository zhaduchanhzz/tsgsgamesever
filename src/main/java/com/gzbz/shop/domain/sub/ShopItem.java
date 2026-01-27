package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.ShopItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.ResCountryDifUtils;
import java.util.ArrayList;

public class ShopItem extends AbstractShop {
   public ShopItem(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopItem";
   }

   public int getShopId() {
      return 1;
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
               int disPrice = ResCountryDifUtils.goldAdditionForJp(model.getResourceType(), model.getResourceId(), model.getDisPrice());
               int totalCost = num * disPrice;
               if (totalCost <= 0) {
                  this.player.failure(4);
                  this.player.closeChannel(LoginMsg.resultType.KICKOUT);
                  return false;
               } else if (ResourceModel.checkTotalNumError(num, disPrice)) {
                  return false;
               } else if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), num * disPrice)) {
                  String errorStr = ResourceModel.getResourceErrorTips(model.getResourceType(), model.getResourceId());
                  this.player.failure(53, errorStr);
                  return false;
               } else {
                  this.recordBuyState(model, num);
                  this.player.delResource(model.getResourceType(), model.getResourceId(), (long)(num * disPrice), 1, 101, 0, 0, "shopId:" + shopId);
                  ArrayList<ResourceModel> resourceModels = new ArrayList();
                  resourceModels.add(new ResourceModel(model.getResourceType(), model.getResourceId(), num * disPrice));
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

   public ArrayList<ShopItemData> getShopList() {
      ArrayList<ShopItemData> list = new ArrayList();

      for(ShopItemData shopItemData : super.getShopList()) {
         ShopItemModel shopItemModel = (ShopItemModel)ApplicationContextProvider.getModelPoolEntity(this.getExcelName(), shopItemData.id);
         if (shopItemModel.getToSystem() <= 0 || this.player.isSystemOpen(shopItemModel.getToSystem())) {
            list.add(shopItemData);
         }
      }

      return list;
   }
}
