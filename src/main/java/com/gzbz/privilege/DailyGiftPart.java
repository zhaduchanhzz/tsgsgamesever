package com.gzbz.privilege;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ItemModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.PrivilegeMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DailyGiftPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_DailyGiftInfo_7907(PrivilegeMsg.C2S_DailyGiftInfo_7907 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_DailyGiftBuy_7909(PrivilegeMsg.C2S_DailyGiftBuy_7909 msg, String source) {
      int buyId = msg.getBuyId();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      int result = giftPart.checkAndBuy(buyId, 0, 19, 1902);
      if (result != 1) {
         this.player.failure(result);
      } else {
         this.sendBuyResult(buyId);
      }
   }

   @MsgHandlerAnno
   public void C2S_DailyGiftReward_7923(PrivilegeMsg.C2S_DailyGiftReward_7923 msg, String source) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int reward = (Integer)playerResetCustomCache.getDailyNum(8, 0);
      if (reward > 0) {
         this.player.failure(24);
      } else {
         playerResetCustomCache.setDailyReset(8, 1);
         int dailyGift = ApplicationContextProvider.getConfigInt("DailyGift", 0);
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", dailyGift);
         if (itemModel != null) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            List<ResourceModel> resourceModelList = itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1);
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 1906, dailyGift, 1, "");
         }

         this.sendRewardResult(1, (String)null);
      }
   }

   public void sendBuyResult(int buyId) {
      PrivilegeMsg.S2C_DailyGiftBuyResult_7910.Builder msg = PrivilegeMsg.S2C_DailyGiftBuyResult_7910.newBuilder();
      msg.setBuyId(buyId);
      this.player.sendMsg(msg.build());
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      logOperationMgr.pushTask(() -> logOperationMgr.addActivityLog(this.player, 1930, "每日礼包"));
   }

   private void sendRewardResult(int code, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      PrivilegeMsg.S2C_DailyGiftReward_7924.Builder msg = PrivilegeMsg.S2C_DailyGiftReward_7924.newBuilder();
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   public void sendInfo() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      PrivilegeMsg.S2C_DailyGiftResult_7908.Builder resp = PrivilegeMsg.S2C_DailyGiftResult_7908.newBuilder();
      resp.addAllGiftIds(giftPart.getBuyGifts(1).keySet());
      resp.setIsGot((Integer)playerResetCustomCache.getDailyNum(8, 0) > 0);
      this.player.sendMsg(resp.build());
   }

   public void oneKeyBuy(List<ResourceModel> resourceModels) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(6);
      if (rotaingPackagesModel == null) {
         this.logger.error("玩家{},每日礼包一键购买礼包错误,找不到轮换奖励配置", this.player.getPlayerId());
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         Map<Integer, ShopLimitModel> shopLimitModels = giftPart.getShopLimits(1, rotaingPackagesModel.getActivityId());

         for(ShopLimitModel shopLimitModel : shopLimitModels.values()) {
            giftPart.addGift(shopLimitModel);
            giftPart.sendBuyResult(shopLimitModel);
            this.sendBuyResult(shopLimitModel.getId());
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
            if (itemModel != null) {
               for(ResourceModel resourceModel : itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1)) {
                  resourceModel.addResourceToList(resourceModels);
               }
            }
         }

      }
   }
}
