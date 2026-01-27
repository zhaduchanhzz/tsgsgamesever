package com.gzbz.shop.domain.sub;

import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.ShopUnionWarLvModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import java.util.ArrayList;
import java.util.TreeMap;

public class ShopUnionWar extends AbstractShop {
   public ShopUnionWar(GamePlayer player) {
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

   public String getExcelName() {
      return "shopUnionWar";
   }

   public int getShopId() {
      return 17;
   }

   public boolean isOpen() {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      return playerDao.unionId > 0;
   }

   public boolean checkLv(int lvLimit, int lvLimitEx, int worldlvLimit) {
      TreeMap<Integer, ShopUnionWarLvModel> shopUnionWarLvModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("shopUnionWarLv"));
      int showWarShopLv = Math.min(this.getUnionShopLv() + 1, (Integer)shopUnionWarLvModelMap.lastKey());
      return showWarShopLv >= lvLimit;
   }

   public boolean buyItem(int id, int num) {
      if (num <= 0) {
         return this.player.failure(6);
      } else {
         ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
         if (model == null) {
            return this.player.failure(0);
         } else {
            int showWarShopLv = this.getUnionShopLv();
            if (showWarShopLv < model.getLvLimit()) {
               return this.player.failure(0);
            } else {
               if (model.getBuyLimit() != 0) {
                  int restNum = this.getRestNum(id);
                  if (num > restNum) {
                     return this.player.failure(4);
                  }
               }

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
                  this.player.delResource(model.getResourceType(), model.getResourceId(), (long)(num * model.getDisPrice()), 1, 101, 0, 0, "shopId:" + this.getShopId());
                  ArrayList<ResourceModel> resourceModels = new ArrayList();
                  resourceModels.add(new ResourceModel(model.getResourceType(), model.getResourceId(), num * model.getDisPrice()));
                  String[] rewardsInfo = LogOperationMgr.toRewardsInfo(resourceModels);
                  long leftNum = LogOperationMgr.getLeftNum(this.player, model.getResourceType(), model.getResourceId());
                  String[] getItemInfo = LogOperationMgr.toRewardsInfo(new ResourceModel(model.getItemType(), model.getItemId(), num));
                  this.player.getOperationMgr().addExtraLog(this.player, 176, this.getShopId() + "", getItemInfo[0], getItemInfo[2], num + "", rewardsInfo[2], rewardsInfo[1], leftNum + "");
                  return true;
               }
            }
         }
      }
   }

   private int getUnionShopLv() {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
      UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
      if (unionMgr == null) {
         return 0;
      } else {
         UnionDao unionDao = unionMgr.getUnion();
         return unionDao == null ? 0 : unionDao.warShopLv;
      }
   }
}
