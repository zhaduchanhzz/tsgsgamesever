package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.SignModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import misc.MiscUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DailySignPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(DailySignPart.class);

   @MsgHandlerAnno
   public void C2S_DailySignInfo_8101(BenefitMsg.C2S_DailySignInfo_8101 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_DailySign_8103(BenefitMsg.C2S_DailySign_8103 msg, String source) {
      int day = msg.getDay();
      SignModel signModel = (SignModel)ApplicationContextProvider.getModelPoolEntity("sign", day);
      if (signModel == null) {
         this.player.failure(0);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int todaySignCount = (Integer)playerResetCustomCache.getDailyNum(6, 0);
         int monthSignCount = (Integer)playerResetCustomCache.getMonthNum(6, 0);
         int loginDays = (Integer)playerResetCustomCache.getMonthNum(1, 0);
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (day > loginDays) {
            this.player.failure(20000);
         } else {
            if (day == loginDays) {
               if (todaySignCount > 1) {
                  this.sendSignResult(20001, day, "签到:第{}天,今日已签到", day);
                  return;
               }

               if (todaySignCount == 1 && playerRechargeDao.dailyRecharge <= 0) {
                  this.sendSignResult(28, day, "签到:第{}天,今日已签到,再签一次需充值", day);
                  return;
               }

               playerResetCustomCache.addDailyReset(6, 1);
            } else if (MiscUtil.existBit((long)monthSignCount, day)) {
               this.sendSignResult(20002, day, "签到:第{}天已签到", day);
               return;
            }

            playerResetCustomCache.setMonthReset(6, MiscUtil.setBit(monthSignCount, day));
            this.player.addResource(signModel.getItemType(), signModel.getItemId(), signModel.getItemNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 2001, signModel.getItemId(), signModel.getItemNum(), "");
            this.sendSignResult(1, day, (String)null);
            LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
            logOperationMgr.pushTask(() -> {
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1325);
               if (systemFunctionModel != null) {
                  logOperationMgr.addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                  logOperationMgr.addReceiveAwardNewLog(this.player, 16, systemFunctionModel.getId(), systemFunctionModel.getName(), "-", "-", 0, day, 30);
               }

            });
         }
      }
   }

   public void resetDaily() {
      this.sendInfo();
   }

   public void loginHandle() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      if ((Integer)playerResetCustomCache.getMonthNum(1, 0) <= 0) {
         playerResetCustomCache.setMonthReset(1, 1);
      }

   }

   public void gmSetDay(int day) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setMonthReset(1, day);
      playerResetCustomCache.setMonthReset(6, 0);
      playerResetCustomCache.setDailyReset(6, 0);
      this.sendInfo();
   }

   private void sendInfo() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      BenefitMsg.S2C_DailySignInfoResult_8102.Builder resp = BenefitMsg.S2C_DailySignInfoResult_8102.newBuilder();
      resp.setTodaySign((Integer)playerResetCustomCache.getDailyNum(6, 0));
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      resp.setTodayRecharge(playerRechargeDao.dailyRecharge > 0);
      int monthSignCount = (Integer)playerResetCustomCache.getMonthNum(6, 0);
      resp.addAllDays(MiscUtil.getBitPos((long)monthSignCount));
      resp.setLoginDays((Integer)playerResetCustomCache.getMonthNum(1, 0));
      this.player.sendMsg(resp.build());
   }

   private void sendSignResult(int code, int day, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      BenefitMsg.S2C_DailySignResult_8104.Builder msg = BenefitMsg.S2C_DailySignResult_8104.newBuilder();
      msg.setResult(code);
      msg.setDay(day);
      this.player.sendMsg(msg.build());
   }
}
