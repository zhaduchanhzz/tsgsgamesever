package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.benefit.bean.PlayerBenefitExtend;
import com.gzbz.db.GiftDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ItemModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MonthlyPreferentialPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(MonthlyPreferentialPart.class);

   @MsgHandlerAnno
   public void C2S_MonthlyPreferentialInfo_8111(BenefitMsg.C2S_MonthlyPreferentialInfo_8111 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_MonthlyPreferentialBuy_8115(BenefitMsg.C2S_MonthlyPreferentialBuy_8115 msg, String source) {
      int buyId = msg.getBuyId();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      int result = giftPart.checkAndBuy(buyId, 0, 20, 2005);
      if (result != 1) {
         this.player.failure(result);
      } else {
         this.sendBuyResult(buyId);
      }
   }

   public void sendBuyResult(int buyId) {
      BenefitMsg.S2C_MonthlyPreferentialBuyResult_8116.Builder msg = BenefitMsg.S2C_MonthlyPreferentialBuyResult_8116.newBuilder();
      msg.setResult(1);
      msg.setBuyId(buyId);
      this.player.sendMsg(msg.build());
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      logOperationMgr.pushTask(() -> logOperationMgr.addActivityLog(this.player, 1305, "每月特惠"));
   }

   public void sendInfo() {
      BenefitMsg.S2C_MonthlyPreferentialResult_8112.Builder resp = BenefitMsg.S2C_MonthlyPreferentialResult_8112.newBuilder();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(4);
      TreeMap<Integer, ShopLimitModel> shopLimitModels = giftPart.getShopLimits(4, playerBenefitExtend.monthlyPreferentialRotate);
      shopLimitModels.values().forEach((shopLimitModel) -> {
         BenefitMsg.PreferentialData.Builder preferentialData = BenefitMsg.PreferentialData.newBuilder();
         preferentialData.setId(shopLimitModel.getId());
         preferentialData.setBuyCount(giftDaoMap.containsKey(shopLimitModel.getId()) ? ((GiftDao)giftDaoMap.get(shopLimitModel.getId())).count : 0);
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
         if (itemModel != null) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1).forEach((resourceModel) -> preferentialData.addRewards(resourceModel.builder()));
         }

         resp.addDataList(preferentialData);
      });
      this.player.sendMsg(resp.build());
   }

   public void checkRotate(boolean needSend) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(4);
      PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
      if (rotaingPackagesModel != null && playerBenefitExtend.monthlyPreferentialRotate != rotaingPackagesModel.getActivityId()) {
         playerBenefitExtend.monthlyPreferentialRotate = rotaingPackagesModel.getActivityId();
         this.player.updatePlayerExtend(20);
         if (needSend) {
            this.sendInfo();
         }
      }

   }

   public void loginHandle() {
      this.checkRotate(true);
   }

   public void levelUp(int preLv, int newLv) {
      this.checkRotate(true);
   }

   public void resetDaily() {
      this.checkRotate(true);
   }
}
