package com.gzbz.warOrder;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.WarOrderDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattleTowerPart;
import com.gzbz.gamePlayer.battle.TrailTowerPart;
import com.gzbz.gamePlayer.battle.UnderPalacePart;
import com.gzbz.gift.GiftMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.gift.bean.PlayerGiftExtend;
import com.gzbz.model.GeneralWelfareRewardModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.WarOrderBaseModel;
import com.gzbz.protobuf.GiftMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.warOrder.inf.WarOrderInf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WarOrderPart extends PlayerPart {
   private static final Map<Integer, Class<? extends WarOrderInf>> SYSTEM_CLASS = new HashMap();

   @MsgHandlerAnno
   public void C2S_WarOrder_8629(GiftMsg.C2S_WarOrder_8629 msg, String source) {
      GiftMsg.S2C_WarOrder_8630.Builder resp = GiftMsg.S2C_WarOrder_8630.newBuilder();

      for(WarOrderDao warOrderDao : this.getWarOrders().values()) {
         resp.addWarOrder(warOrderDao.builder());
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_WarOrderReward_8631(GiftMsg.C2S_WarOrderReward_8631 msg, String source) {
      WarOrderInf warOrderHandler = this.getWarOrderHandler(msg.getSystem());
      if (warOrderHandler == null) {
         return false;
      } else {
         WarOrderBaseModel warOrderBaseModel = (WarOrderBaseModel)ApplicationContextProvider.getModelPoolEntity(warOrderHandler.excel(), msg.getReward());
         if (warOrderBaseModel == null) {
            return this.player.failure(0);
         } else {
            List<ResourceModel> rewards = new ArrayList();
            int result = this.warOrderReward(warOrderHandler, warOrderBaseModel, rewards);
            if (result != 1) {
               return this.player.failure(result);
            } else {
               if (!rewards.isEmpty()) {
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2210, warOrderHandler.system(), msg.getReward(), "");
               }

               GiftMsg.S2C_WarOrderReward_8632.Builder resp = GiftMsg.S2C_WarOrderReward_8632.newBuilder();
               resp.setWarOrder(this.getWarOrder(msg.getSystem()).builder());
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_WarOrderOneKeyReward_8633(GiftMsg.C2S_WarOrderOneKeyReward_8633 msg, String source) {
      WarOrderInf warOrderHandler = this.getWarOrderHandler(msg.getSystem());
      if (warOrderHandler != null && msg.getStageType() > 1) {
         List<ResourceModel> rewards = new ArrayList();
         Map<Integer, WarOrderBaseModel> warOrderBaseModelMap = ApplicationContextProvider.<Integer, WarOrderBaseModel>getModelPoolMap(warOrderHandler.excel());

         for(WarOrderBaseModel warOrderBaseModel : warOrderBaseModelMap.values()) {
            if (warOrderBaseModel.getStageType() == msg.getStageType()) {
               this.warOrderReward(warOrderHandler, warOrderBaseModel, rewards);
            }
         }

         if (!rewards.isEmpty()) {
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2210, warOrderHandler.system(), -1, "");
         }

         GiftMsg.S2C_WarOrderOneKeyReward_8634.Builder resp = GiftMsg.S2C_WarOrderOneKeyReward_8634.newBuilder();
         resp.setStageType(msg.getStageType());
         resp.setWarOrder(this.getWarOrder(msg.getSystem()).builder());
         this.player.sendMsg(resp.build());
         return true;
      } else {
         return this.player.failure(0);
      }
   }

   @MsgHandlerAnno
   public void C2S_GeneralWelfare_8623(GiftMsg.C2S_GeneralWelfare_8623 msg, String source) {
      PlayerGiftExtend playerGiftExtend = (PlayerGiftExtend)this.player.getPlayerExtend(22);
      GiftMgr giftMgr = (GiftMgr)ApplicationContextProvider.getContext().getBean(GiftMgr.class);
      Set<Integer> commonGot = new HashSet();
      if (playerGiftExtend.welfareC.containsKey(msg.getType())) {
         commonGot.addAll((Collection)playerGiftExtend.welfareC.get(msg.getType()));
      }

      Set<Integer> supGot = new HashSet();
      if (playerGiftExtend.welfareS.containsKey(msg.getType())) {
         supGot.addAll((Collection)playerGiftExtend.welfareS.get(msg.getType()));
      }

      giftMgr.pushTask(() -> giftMgr.sendGeneralWelfare(this.player, msg.getType(), commonGot, supGot));
   }

   @MsgHandlerAnno
   public void C2S_GeneralWelfareReward_8625(GiftMsg.C2S_GeneralWelfareReward_8625 msg, String source) {
      this.generalWelfareReward(msg.getReward());
   }

   private WarOrderInf getWarOrderHandler(int system) {
      if (!SYSTEM_CLASS.containsKey(system)) {
         this.player.failure(0);
         return null;
      } else {
         Class<?> aClass = (Class)SYSTEM_CLASS.get(system);
         WarOrderInf warOrder = (WarOrderInf)this.player.getMgrPart(aClass);
         if (!this.player.isSystemOpen(warOrder.system())) {
            this.player.failure(21);
            return null;
         } else {
            return warOrder;
         }
      }
   }

   private int warOrderReward(WarOrderInf warOrderHandler, WarOrderBaseModel warOrderBaseModel, List<ResourceModel> rewards) {
      if (warOrderBaseModel.getStageType() <= 1) {
         return 0;
      } else {
         WarOrderDao warOrder = this.getWarOrder(warOrderHandler.system());
         if (!warOrderHandler.check(warOrderBaseModel)) {
            return 33;
         } else {
            if (!warOrder.commonReward.contains(warOrderBaseModel.getId())) {
               rewards.addAll(warOrderBaseModel.rewards());
               warOrder.commonReward.add(warOrderBaseModel.getId());
            }

            if (!warOrder.superReward.contains(warOrderBaseModel.getId()) && warOrderHandler.isBuy(warOrderBaseModel)) {
               rewards.addAll(warOrderBaseModel.rewards1());
               warOrder.superReward.add(warOrderBaseModel.getId());
            }

            warOrder.updateOp();
            return 1;
         }
      }
   }

   public Map<Integer, WarOrderDao> getWarOrders() {
      return this.player.<Integer, WarOrderDao>getMap("tb_war_order", this.player.getPlayerId());
   }

   public WarOrderDao getWarOrder(int system) {
      WarOrderDao warOrderDao = (WarOrderDao)this.getWarOrders().get(system);
      if (warOrderDao == null) {
         warOrderDao = new WarOrderDao();
         warOrderDao.playerId = this.player.getPlayerId();
         warOrderDao.system = system;
         this.player.insertDao(warOrderDao);
      }

      return warOrderDao;
   }

   public void generalWelfareReward(int rewardId) {
      GeneralWelfareRewardModel rewardModel = (GeneralWelfareRewardModel)ApplicationContextProvider.getModelPoolEntity("personExtraReward", rewardId);
      if (rewardModel == null) {
         this.player.failure(0);
      } else {
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         PlayerDao playerDao = this.player.getPlayerDao();
         boolean isBuy = false;
         switch (rewardModel.getType()) {
            case 1:
               isBuy = playerDao.tongtian_order > 0 || playerDao.tongtian_token > 0;
               break;
            case 2:
               isBuy = playerDao.trail_king > 0;
               break;
            case 3:
               isBuy = giftPart.getBuyGifts(10).containsKey(1758);
               break;
            case 4:
               PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               isBuy = playerRechargeDao.hasGrowFund;
         }

         if (!isBuy) {
            Map<Integer, Integer> gift2RewardMap = ApplicationContextProvider.<Integer, Integer>getModelPoolMap("customPersonExtraReward");

            for(Map.Entry<Integer, Integer> entry : gift2RewardMap.entrySet()) {
               if ((Integer)entry.getValue() == rewardModel.getType()) {
                  int giftId = (Integer)entry.getKey();
                  ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftId);
                  if (shopLimitModel != null && giftPart.getBuyGifts(shopLimitModel.getGiftType()).containsKey(giftId)) {
                     isBuy = true;
                     break;
                  }
               }
            }
         }

         PlayerGiftExtend playerGiftExtend = (PlayerGiftExtend)this.player.getPlayerExtend(22);
         if (!playerGiftExtend.welfareC.containsKey(rewardModel.getType()) || !((Set)playerGiftExtend.welfareC.get(rewardModel.getType())).contains(rewardId) || isBuy && (!playerGiftExtend.welfareS.containsKey(rewardModel.getType()) || !((Set)playerGiftExtend.welfareS.get(rewardModel.getType())).contains(rewardId))) {
            GiftMgr giftMgr = (GiftMgr)ApplicationContextProvider.getContext().getBean(GiftMgr.class);
            boolean finalIsBuy = isBuy;
            giftMgr.pushTask(() -> giftMgr.generalWelfareReward(this.player, rewardModel, finalIsBuy));
         } else {
            this.player.failure(24);
         }
      }
   }

   public void generalWelfareReward(GeneralWelfareRewardModel rewardModel, boolean isBuy) {
      PlayerGiftExtend playerGiftExtend = (PlayerGiftExtend)this.player.getPlayerExtend(22);
      List<ResourceModel> rewardList = new ArrayList();
      int type = rewardModel.getType();
      if (!playerGiftExtend.welfareC.containsKey(type) || !((Set)playerGiftExtend.welfareC.get(type)).contains(rewardModel.getId())) {
         rewardList.addAll(rewardModel.getRewards());
         ((Set)playerGiftExtend.welfareC.computeIfAbsent(rewardModel.getType(), (v) -> new HashSet())).add(rewardModel.getId());
         this.player.updatePlayerExtend(22);
      }

      if (isBuy && (!playerGiftExtend.welfareS.containsKey(type) || !((Set)playerGiftExtend.welfareS.get(type)).contains(rewardModel.getId()))) {
         rewardList.addAll(rewardModel.getRewards1());
         ((Set)playerGiftExtend.welfareS.computeIfAbsent(rewardModel.getType(), (v) -> new HashSet())).add(rewardModel.getId());
         this.player.updatePlayerExtend(22);
      }

      this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 22, 2211, rewardModel.getId(), 0, "");
      GiftMsg.S2C_GeneralWelfareReward_8626.Builder builder = GiftMsg.S2C_GeneralWelfareReward_8626.newBuilder();
      builder.setReward(rewardModel.getId());
      builder.addAllRewardCommon((Iterable)playerGiftExtend.welfareC.getOrDefault(type, new HashSet()));
      builder.addAllRewardSuper((Iterable)playerGiftExtend.welfareS.getOrDefault(type, new HashSet()));
      this.player.sendMsg(builder.build());
   }

   static {
      SYSTEM_CLASS.put(1130, BattleTowerPart.class);
      SYSTEM_CLASS.put(2130, TrailTowerPart.class);
      SYSTEM_CLASS.put(2880, UnderPalacePart.class);
   }
}
