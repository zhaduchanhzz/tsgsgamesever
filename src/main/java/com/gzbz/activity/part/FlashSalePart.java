package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FlashSalePart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_FlashSaleInfo_6715(ActivityMsg.C2S_FlashSaleInfo_6715 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_FlashSaleBuy_6717(ActivityMsg.C2S_FlashSaleBuy_6717 msg, String source) {
      int buyId = msg.getBuyId();
      int result = this.checkAndBuy(buyId, 804);
      if (result != 1) {
         this.player.failure(result);
      } else {
         this.sendBuyResult(buyId);
      }
   }

   public void sendBuyResult(int buyId) {
      ActivityMsg.S2C_FlashSaleBuyResult_6718.Builder msg = ActivityMsg.S2C_FlashSaleBuyResult_6718.newBuilder();
      msg.setBuyId(buyId);
      this.player.sendMsg(msg.build());
      this.player.getOperationMgr().addActivityLog(this.player, 1401, "限时抢购");
   }

   public void sendInfo() {
      ActivityMsg.S2C_FlashSaleResult_6716.Builder resp = ActivityMsg.S2C_FlashSaleResult_6716.newBuilder();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(5);
      TreeMap<Integer, ShopLimitModel> shopLimitModels = giftPart.getShopLimits(5, this.getPlayerActivityInfo().id);
      this.addFlashSaleData(resp, shopLimitModels, giftDaoMap);
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(14);
      if (activityInfo != null && activityInfo.end < curTime) {
         shopLimitModels = giftPart.getShopLimits(5, activityInfo.id);
         this.addFlashSaleData(resp, shopLimitModels, giftDaoMap);
      }

      resp.setEndTime(this.getPlayerActivityInfo().end);
      this.player.sendMsg(resp.build());
   }

   private void addFlashSaleData(ActivityMsg.S2C_FlashSaleResult_6716.Builder resp, Map<Integer, ShopLimitModel> shopLimitModels, Map<Integer, GiftDao> giftDaoMap) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      PlayerDao playerDao = this.player.getPlayerDao();

      for(ShopLimitModel shopLimitModel : shopLimitModels.values()) {
         if (playerDao.lv >= shopLimitModel.getLowLevel() && (shopLimitModel.getMaxLevel() <= 0 || playerDao.lv <= shopLimitModel.getMaxLevel())) {
            ActivityMsg.FlashSaleData.Builder flashSaleData = ActivityMsg.FlashSaleData.newBuilder();
            flashSaleData.setId(shopLimitModel.getId());
            flashSaleData.setBuyNum(((GiftDao)MapUtil.getOrDefault(giftDaoMap, shopLimitModel.getId(), GiftDao.class)).count);
            if (shopLimitModel.getActivityId() == this.getPlayerActivityId()) {
               if (shopLimitModel.getItemType() == 2) {
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
                  if (itemModel != null) {
                     for(ResourceModel resourceModel : itemBagPart.getSpecialAward(itemModel.getUseFuncId(), shopLimitModel.getItemNum())) {
                        flashSaleData.addResourceList(resourceModel.builder());
                     }
                  }
               } else {
                  flashSaleData.addResourceList((new ResourceModel(shopLimitModel.getItemType(), shopLimitModel.getItemId(), shopLimitModel.getItemNum())).builder());
               }

               resp.addFlashSaleDataList(flashSaleData);
            }
         }
      }

   }

   public void buyFlashSale(int buyId, List<ResourceModel> resourceModels) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
      if (shopLimitModel.getActivityId() != this.getPlayerActivityId()) {
         SpringFestivalPart springFestivalPart = (SpringFestivalPart)this.player.getMgrPart(SpringFestivalPart.class);
         resourceModels.addAll(springFestivalPart.getEndSaleResourceList(shopLimitModel.getActivityId()));
      }

   }

   public int getActivityType() {
      return 9;
   }

   public void activityEnd(int oldActivityId) {
   }

   public void rotateReset(int oldActivityId) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.removeGiftsByActivityType(5, this.getActivityType());
   }
}
