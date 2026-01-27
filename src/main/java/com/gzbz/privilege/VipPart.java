package com.gzbz.privilege;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.MonthlyCardData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mini.MiniProgramPart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.PrivilegeMsg;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class VipPart extends PlayerPart {
   private final LogOperationMgr logOperationMgr;

   public VipPart(LogOperationMgr logOperationMgr) {
      this.logOperationMgr = logOperationMgr;
   }

   @MsgHandlerAnno
   public void C2S_VipGiftInfo_7903(PrivilegeMsg.C2S_VipGiftInfo_7903 msg, String source) {
      this.sendVipGiftInfo();
   }

   @MsgHandlerAnno
   public void C2S_VipGiftBuy_7905(PrivilegeMsg.C2S_VipGiftBuy_7905 msg, String source) {
      int vipLevel = msg.getVipLevel();
      VipModel vipModel = (VipModel)ApplicationContextProvider.getModelPoolEntity("vip", vipLevel);
      if (vipModel == null) {
         this.player.failure(0);
      } else {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.vip_lv < vipLevel) {
            ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
            ActivityInfo activityInfo = activityMgr.getActivityInfo(114);
            if (activityInfo == null || activityInfo.id <= 0 || activityInfo.end < DateUtil.getIntTime(System.currentTimeMillis()) || !activityInfo.open) {
               this.player.failure(19);
               return;
            }
         }

         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         int result = giftPart.checkAndBuy(vipModel.getIPrivilegePackage(), 0, 19, 1901);
         if (result != 1) {
            this.player.failure(result);
         } else {
            this.sendBuyResult(vipLevel);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_VipMonthlyReward_7921(PrivilegeMsg.C2S_VipMonthlyReward_7921 msg, String source) {
      int vipLevel = msg.getVipLevel();
      PlayerDao playerDao = this.player.getPlayerDao();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      if ((Integer)playerResetCustomCache.getDailyNum(10, -1) > -1) {
         this.player.failure(24);
      } else if (this.getMaxMonthlyCard() <= 0) {
         this.player.failure(20003);
      } else {
         VipModel vipModel = (VipModel)ApplicationContextProvider.getModelPoolEntity("vip", playerDao.vip_lv);
         if (vipModel == null) {
            this.player.failure(0);
         } else {
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", vipModel.getReward());
            if (itemModel == null) {
               this.player.failure(0);
            } else {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               List<ResourceModel> resourceModelList = itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1);
               this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 19, 1905, 0, 0, "");
               playerResetCustomCache.setDailyReset(10, playerDao.vip_lv);
               this.sendMonthlyRewardResult(playerDao.vip_lv);
            }
         }
      }
   }

   public void checkLvUp() {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      int curVipLv = playerDao.vip_lv;
      Map<Integer, VipModel> vipModelMap = ApplicationContextProvider.<Integer, VipModel>getModelPoolMap("vip");
      boolean upgradeFlag = false;

      for(VipModel vipModel : vipModelMap.values()) {
         if (vipModel.getId() > playerDao.vip_lv) {
            if (playerDao.vip_exp < vipModel.getVipExp()) {
               break;
            }

            this.player.addResource(1, PlayerDefine.PLAYER_VIP_LV, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 13, 1301, PlayerDefine.PLAYER_VIP_LV, 1, "");
            this.player.addResource(vipModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 13, 1301, PlayerDefine.PLAYER_VIP_LV, 1, "");
            this.player.triggerTask(10001, 2, (long)playerDao.vip_lv, 0);
            upgradeFlag = true;
         }
      }

      if (upgradeFlag) {
         PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
         int totalRecharge = playerRechargePart.getRealTotalRecharge();
         this.logOperationMgr.pushTask(() -> this.logOperationMgr.addVipNewLog(this.player, 6, curVipLv, 0, playerDao.vip_exp, totalRecharge));
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         playerResetCustomCache.setDailyReset(10, -1);
         this.sendVipGiftInfo();
         MiniProgramPart miniProgramPart = (MiniProgramPart)this.player.getMgrPart(MiniProgramPart.class);
         miniProgramPart.checkBeInviteTask(2, playerDao.vip_lv);
         this.player.uploadCrossPlayer();
      }

   }

   public void sendVipGiftInfo() {
      PrivilegeMsg.S2C_VipGiftResult_7904.Builder resp = PrivilegeMsg.S2C_VipGiftResult_7904.newBuilder();
      resp.addAllGiftIds(this.getBuyVipGift());
      resp.setMonthlyCard(this.getMaxMonthlyCard());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int rewardLevel = (Integer)playerResetCustomCache.getDailyNum(10, -1);
      if (rewardLevel > -1) {
         resp.addRewardLevels(rewardLevel);
      }

      this.player.sendMsg(resp.build());
   }

   private Set<Integer> getBuyVipGift() {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Set<Integer> buyVipGifts = giftPart.getBuyGifts(7).keySet();
      Set<Integer> buyVipLevelSet = new HashSet();
      Map<Integer, VipModel> vipModelMap = ApplicationContextProvider.<Integer, VipModel>getModelPoolMap("vip");
      vipModelMap.values().forEach((vipModel) -> {
         if (buyVipGifts.contains(vipModel.getIPrivilegePackage())) {
            buyVipLevelSet.add(vipModel.getId());
         }

      });
      return buyVipLevelSet;
   }

   private void sendBuyResult(int level) {
      PrivilegeMsg.S2C_VipGiftBuyResult_7906.Builder msg = PrivilegeMsg.S2C_VipGiftBuyResult_7906.newBuilder();
      msg.setVipLevel(level);
      this.player.sendMsg(msg.build());
   }

   private int getMaxMonthlyCard() {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      Optional<MonthlyCardData> opt = playerRechargeDao.monthlyCard.values().stream().filter((monthlyCard) -> monthlyCard.isActivate).max(Comparator.comparingInt((o) -> o.type));
      return playerRechargeDao.monthlyCard.isEmpty() ? 0 : (Integer)opt.map((monthlyCardData) -> monthlyCardData.type).orElse(0);
   }

   private void sendMonthlyRewardResult(int vipLevel) {
      PrivilegeMsg.S2C_VipMonthlyRewardResult_7922.Builder msg = PrivilegeMsg.S2C_VipMonthlyRewardResult_7922.newBuilder();
      msg.setVipLevel(vipLevel);
      this.player.sendMsg(msg.build());
   }
}
