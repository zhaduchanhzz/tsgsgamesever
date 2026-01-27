package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.GiftDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.gift.bean.PlayerGiftExtend;
import com.gzbz.mergeActivity.part.AbstractMergeActivityPart;
import com.gzbz.model.PopupPackageModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.protobuf.GiftMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LimitShopPart extends AbstractMergeActivityPart {
   @MsgHandlerAnno
   public void C2S_ActLimitShop_8617(GiftMsg.C2S_ActLimitShop_8617 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      if (this.isJoiningSubActivity()) {
         int startTime = (int)(this.getSubActivityOpenTime() / 1000L);
         Map<Integer, Map<Integer, ShopLimitModel>> limitGiftMap = (Map)ApplicationContextProvider.getModelPoolEntity("customShopLimit", 8);
         GiftMsg.S2C_ActLimitShop_8618.Builder resp = GiftMsg.S2C_ActLimitShop_8618.newBuilder();
         PlayerGiftExtend playerGiftExtend = (PlayerGiftExtend)this.player.getPlayerExtend(22);

         for(int limitType : playerGiftExtend.triggers) {
            PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", limitType);
            if (popupPackageModel != null && popupPackageModel.getGiftType() == 2 && (!playerGiftExtend.timeLimit.containsKey(popupPackageModel.getType()) || (Integer)playerGiftExtend.timeLimit.get(popupPackageModel.getType()) < startTime)) {
               Map<Integer, ShopLimitModel> shopLimitModelMap = (Map)limitGiftMap.get(popupPackageModel.getType());
               if (shopLimitModelMap != null) {
                  for(int giftId : shopLimitModelMap.keySet()) {
                     if (!playerGiftExtend.beforeLimitActBuy.contains(giftId)) {
                        resp.addActTriggerGifts(giftId);
                     }
                  }
               }
            }
         }

         this.player.sendMsg(resp.build());
      }
   }

   private void initActivityData() {
      PlayerGiftExtend playerGiftExtend = (PlayerGiftExtend)this.player.getPlayerExtend(22);
      playerGiftExtend.beforeLimitActBuy.clear();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> buyGifts = giftPart.getBuyGifts(8);

      for(GiftDao giftDao : buyGifts.values()) {
         ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftDao.giftId);
         if (shopLimitModel != null) {
            PopupPackageModel popupPackageModel = (PopupPackageModel)ApplicationContextProvider.getModelPoolEntity("popupPackage", shopLimitModel.getActivityId());
            if (popupPackageModel != null && popupPackageModel.getGiftType() == 2) {
               playerGiftExtend.beforeLimitActBuy.add(giftDao.giftId);
            }
         }
      }

      this.player.updatePlayerExtend(22);
   }

   public int getMergeSubActivityType() {
      return 26;
   }

   public void joinSubActivity() {
      this.initActivityData();
   }

   public void endSubActivity() {
   }
}
