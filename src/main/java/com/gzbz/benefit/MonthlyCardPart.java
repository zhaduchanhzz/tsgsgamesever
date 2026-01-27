package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.MonthlyCardData;
import com.gzbz.gameDefine.ClientTrackingEnum;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.tracking.ClientTrackingPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.privilege.VipPart;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MonthlyCardPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_MonthlyCardInfo_8105(BenefitMsg.C2S_MonthlyCardInfo_8105 msg, String source) {
      int type = msg.getType();
      this.sendMonthlyCard(type);
   }

   @MsgHandlerAnno
   public void C2S_MonthlyCardReward_8107(BenefitMsg.C2S_MonthlyCardReward_8107 msg, String source) {
      int type = msg.getType();
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyCardData monthlyCardData = (MonthlyCardData)playerRechargeDao.monthlyCard.get(type);
      if (monthlyCardData == null) {
         this.sendRewardResult(6, type, false, 0, "玩家{}领取{}月卡奖励失败,未知月卡类型", this.player.getPlayerId(), type);
      } else if (!monthlyCardData.isActivate) {
         this.sendRewardResult(20003, type, false, 0, "玩家{}领取{}月卡奖励失败,月卡尚未激活", this.player.getPlayerId(), type);
      } else {
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int rewardType;
         int rewardNum;
         int rewardId;
         int rewardDays;
         int logReason;
         int systemId;
         switch (type) {
            case 1:
               String[] aristocraticConfig = configManager.getStr("AristocraticMonthlyCard").split("\\|");
               rewardType = Integer.parseInt(aristocraticConfig[0]);
               rewardNum = Integer.parseInt(aristocraticConfig[1]);
               rewardId = Integer.parseInt(aristocraticConfig[2]);
               rewardDays = Integer.parseInt(aristocraticConfig[3]);
               logReason = 2002;
               systemId = 1320;
               break;
            case 2:
               String[] kingConfig = configManager.getStr("KingMonthlyCard").split("\\|");
               rewardType = Integer.parseInt(kingConfig[0]);
               rewardNum = Integer.parseInt(kingConfig[1]);
               rewardId = Integer.parseInt(kingConfig[2]);
               rewardDays = Integer.parseInt(kingConfig[3]);
               logReason = 2003;
               systemId = 1315;
               break;
            default:
               return;
         }

         if (monthlyCardData.gotDays >= rewardDays) {
            this.sendRewardResult(6, type, false, 0, "玩家{}领取{}月卡奖励失败,已超过领取天数", this.player.getPlayerId(), type);
         } else if (monthlyCardData.isGotToday) {
            this.sendRewardResult(24, type, false, 0, "玩家{}领取{}月卡奖励失败,今日已领取", this.player.getPlayerId(), type);
         } else {
            this.player.addResource(rewardType, rewardId, rewardNum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, logReason, rewardId, rewardNum, "");
            monthlyCardData.isGotToday = true;
            ++monthlyCardData.gotDays;
            playerRechargeDao.updateOp();
            this.sendRewardResult(1, type, true, monthlyCardData.gotDays, (String)null);
            LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
            logOperationMgr.pushTask(() -> {
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", systemId);
               if (systemFunctionModel != null) {
                  logOperationMgr.addActivityLog(this.player, systemId, systemFunctionModel.getName());
                  logOperationMgr.addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), monthlyCardData.type + "", monthlyCardData.type + "-" + monthlyCardData.gotDays, 0, monthlyCardData.gotDays, rewardDays);
               }

            });
         }
      }
   }

   public void resetDaily() {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      boolean updateFlag = false;

      for(MonthlyCardData monthlyCardData : playerRechargeDao.monthlyCard.values()) {
         if (monthlyCardData.isActivate && monthlyCardData.endTime < System.currentTimeMillis()) {
            monthlyCardData.unActivate();
            updateFlag = true;
         }

         monthlyCardData.isGotToday = false;
         this.sendMonthlyCard(monthlyCardData.type);
      }

      playerRechargeDao.updateOp();
      if (updateFlag) {
         VipPart vipPart = (VipPart)this.player.getMgrPart(VipPart.class);
         vipPart.sendVipGiftInfo();
      }

   }

   public void monthlyCardActivate(int money) {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      long startTime = DateUtil.getDayStartTimeStamp();
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      playerRechargeDao.monthlyCard.computeIfAbsent(1, (k) -> new MonthlyCardData(1));
      playerRechargeDao.monthlyCard.computeIfAbsent(2, (k) -> new MonthlyCardData(2));

      for(MonthlyCardData monthlyCardData : playerRechargeDao.monthlyCard.values()) {
         if (!monthlyCardData.isActivate) {
            monthlyCardData.totalRecharge += money;
            if (monthlyCardData.isMaxRecharge()) {
               int rewardDays;
               if (monthlyCardData.type == 1) {
                  rewardDays = Integer.parseInt(configManager.getStr("AristocraticMonthlyCard").split("\\|")[3]);
                  ClientTrackingPart clientTrackingPart = (ClientTrackingPart)this.player.getMgrPart(ClientTrackingPart.class);
                  clientTrackingPart.clientTrack(ClientTrackingEnum.SP_AF_SUBSCRIBE, ClientTrackingEnum.SP_AF_SUBSCRIBE.name(), "RoleLevel=" + this.player.getPublicDao().lv);
               } else {
                  rewardDays = Integer.parseInt(configManager.getStr("KingMonthlyCard").split("\\|")[3]);
                  this.player.triggerTask(527, 0, 1L, 0);
                  ClientTrackingPart clientTrackingPart = (ClientTrackingPart)this.player.getMgrPart(ClientTrackingPart.class);
                  clientTrackingPart.clientTrack(ClientTrackingEnum.SP_AF_KING_MONTH_CARD, ClientTrackingEnum.SP_AF_KING_MONTH_CARD.name(), "RoleLevel=" + this.player.getPublicDao().lv);
               }

               monthlyCardData.activate(startTime, DateUtil.getSomeDayEndTime(startTime + (long)(rewardDays - 1) * 86400000L));
               VipPart vipPart = (VipPart)this.player.getMgrPart(VipPart.class);
               vipPart.sendVipGiftInfo();
            }

            this.sendMonthlyCard(monthlyCardData.type);
         }
      }

      playerRechargeDao.updateOp();
   }

   private void sendMonthlyCard(int type) {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyCardData monthlyCardData = (MonthlyCardData)playerRechargeDao.monthlyCard.getOrDefault(type, new MonthlyCardData(type));
      BenefitMsg.S2C_MonthlyCardResult_8106.Builder resp = BenefitMsg.S2C_MonthlyCardResult_8106.newBuilder();
      resp.setRechargeTotal(monthlyCardData.totalRecharge);
      resp.setEndTime(DateUtil.getIntTime(monthlyCardData.endTime));
      resp.setGotDays(monthlyCardData.gotDays);
      resp.setIsActivate(monthlyCardData.isActivate);
      resp.setStartTime(DateUtil.getIntTime(monthlyCardData.startTime));
      resp.setType(type);
      resp.setIsGotToday(monthlyCardData.isGotToday);
      this.player.sendMsg(resp.build());
   }

   public void gmSetDay(int type, int day) {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyCardData monthlyCardData = (MonthlyCardData)playerRechargeDao.monthlyCard.getOrDefault(type, new MonthlyCardData(type));
      if (!monthlyCardData.isActivate) {
         this.player.failure(20003);
      } else {
         monthlyCardData.gotDays = day;
         monthlyCardData.isGotToday = false;
         playerRechargeDao.updateOp();
         this.sendMonthlyCard(type);
      }
   }

   private void sendRewardResult(int code, int type, boolean isGotToday, int gotDays, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      BenefitMsg.S2C_monthlyCardRewardResult_8108.Builder msg = BenefitMsg.S2C_monthlyCardRewardResult_8108.newBuilder();
      msg.setResult(code);
      msg.setType(type);
      msg.setGotDays(gotDays);
      msg.setIsGotToday(isGotToday);
      this.player.sendMsg(msg.build());
   }
}
