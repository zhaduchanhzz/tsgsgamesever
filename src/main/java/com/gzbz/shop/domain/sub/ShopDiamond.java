package com.gzbz.shop.domain.sub;

import com.gzbz.db.PlayerDao;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopDiamondModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

public class ShopDiamond extends AbstractShop {
   public ShopDiamond(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopDiamond";
   }

   public int getShopId() {
      return 50;
   }

   public boolean buyItem(int id, int num) {
      if (num <= 0) {
         return this.player.failure(6);
      } else {
         int shopId = this.getShopId();
         ShopDiamondModel model = (ShopDiamondModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
         if (model == null) {
            return this.player.failure(0);
         } else if (model.getIsHide() == 1) {
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
               } else {
                  if (model.getResourceType() == 1 && model.getResourceId() == PlayerDefine.PLAYER_DIAMOND_CHIP) {
                     int diamondChipValue = totalCost;
                     int diamondValue = 0;
                     if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), totalCost)) {
                        PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
                        diamondChipValue = (int)playerDao.getProperty(PlayerDefine.PLAYER_DIAMOND_CHIP);
                        int offValue = totalCost - diamondChipValue;
                        if (offValue <= 0) {
                           return false;
                        }

                        int ration = ApplicationContextProvider.getConfigInt("AuctionExchange", 10000);
                        diamondValue = (int)((double)offValue * (double)10000.0F / (double)ration);
                        if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_DIAMOND, diamondValue)) {
                           return false;
                        }
                     }

                     if (diamondChipValue > 0) {
                        this.player.delResource(1, PlayerDefine.PLAYER_DIAMOND_CHIP, (long)diamondChipValue, 1, 101, 0, 0, "shopId:" + shopId);
                     }

                     if (diamondValue > 0) {
                        this.player.delResource(1, PlayerDefine.PLAYER_DIAMOND, (long)diamondValue, 1, 101, 0, 0, "shopId:" + shopId);
                     }
                  } else {
                     if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), totalCost)) {
                        String errorStr = ResourceModel.getResourceErrorTips(model.getResourceType(), model.getResourceId());
                        this.player.failure(53, errorStr);
                        return false;
                     }

                     this.player.delResource(model.getResourceType(), model.getResourceId(), (long)totalCost, 1, 101, 0, 0, "shopId:" + shopId);
                  }

                  this.recordBuyState(model, num);
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
}
