package com.gzbz.krWelfare.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.KrSevenWelfareDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.KrSevenWelfareModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.KrWelfareMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class KrSevenWelfarePart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   public void resetDaily() {
      if (this.player.isSystemOpen(6560)) {
         int welfareEndDay = this.getWelfareEndDay();
         KrSevenWelfareDao dao = this.getDao();
         if (dao.curDay == welfareEndDay && !this.isTodayLogin()) {
            ++dao.curDay;
            dao.updateCurDayTime = System.currentTimeMillis();
            dao.updateOp();
            this.sendNoRecFreeRewardMail();
            this.sendInfo();
         }

      }
   }

   public boolean isTodayLogin() {
      KrSevenWelfareDao dao = this.getDao();
      return dao.updateCurDayTime <= 0L ? false : DateUtil.isSameDay(dao.updateCurDayTime);
   }

   public List<Integer> getNoRecFreeDayList() {
      KrSevenWelfareDao dao = this.getDao();
      Map<Integer, KrSevenWelfareModel> modelMap = ApplicationContextProvider.<Integer, KrSevenWelfareModel>getModelPoolMap("KrSevenWelfare");
      List<Integer> noRecDays = new ArrayList();

      for(Map.Entry<Integer, KrSevenWelfareModel> entry : modelMap.entrySet()) {
         int day = (Integer)entry.getKey();
         if (!dao.recFreeRewardDays.contains(day) && dao.curDay >= day) {
            noRecDays.add(day);
         }
      }

      return noRecDays;
   }

   public void sendNoRecFreeRewardMail() {
      if (this.player.isSystemOpen(6560)) {
         List<Integer> noRecFreeDayList = this.getNoRecFreeDayList();
         if (noRecFreeDayList.size() > 0) {
            List<ResourceModel> rewardList = new ArrayList();

            for(Integer day : noRecFreeDayList) {
               KrSevenWelfareModel krSevenWelfareModel = this.getKrSevenWelfareModel(day);

               for(ResourceModel rm : krSevenWelfareModel.getFreeReward()) {
                  rm.addResourceToList(rewardList);
               }
            }

            CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_KR_SEVEN_WELFARE_FREE_REWARD);
            if (null == centreAwardModel) {
               this.logger.error("CentreAward 未找到对应配置 id:{}", CentreAwardModel.ID_KR_SEVEN_WELFARE_FREE_REWARD);
               return;
            }

            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewardList, 604800000L, this.getLogModule(), 14601);
            KrSevenWelfareDao dao = this.getDao();
            dao.recFreeRewardDays.addAll(noRecFreeDayList);
            dao.updateOp();
         }

      }
   }

   public KrSevenWelfareDao getDao() {
      KrSevenWelfareDao dao = (KrSevenWelfareDao)this.player.getData("tb_kr_seven_welfare", this.player.getPlayerId());
      return dao;
   }

   public int getLogModule() {
      return 146;
   }

   public KrSevenWelfareModel getKrSevenWelfareModel(int day) {
      KrSevenWelfareModel welfareModel = (KrSevenWelfareModel)ApplicationContextProvider.getModelPoolEntity("KrSevenWelfare", day);
      if (null == welfareModel) {
         this.logger.error("KrSevenWelfare 配置有误 day:{}", day);
      }

      return welfareModel;
   }

   public int getWelfareEndDay() {
      int krFadeDays = this.configManager.getIntDefault("KrFadeDays", 10);
      return krFadeDays;
   }

   public void sendInfo() {
      KrSevenWelfareDao dao = this.getDao();
      KrWelfareMsg.S2C_Info_24802.Builder resp = KrWelfareMsg.S2C_Info_24802.newBuilder();
      resp.setCurDay(dao.curDay);
      resp.addAllRecFreeRewardDay(dao.recFreeRewardDays);
      resp.addAllBuyDiscountDay(dao.buyDiscountDays);
      resp.setHaveRecFreeReward(this.getNoRecFreeDayList().size() > 0);
      int welfareEndDay = this.getWelfareEndDay();
      if (dao.curDay > welfareEndDay) {
         resp.setCountdown(0L);
      } else if (dao.curDay == welfareEndDay) {
         long currentTimeMillis = System.currentTimeMillis();
         long todayEndTimeMillis = DateUtil.getSomeDayEndTime(currentTimeMillis);
         long todayEndTimeSecond = todayEndTimeMillis / 1000L;
         resp.setCountdown(todayEndTimeSecond);
      } else {
         resp.setCountdown(-1L);
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_Info_24801(KrWelfareMsg.C2S_Info_24801 msg, String source) {
      if (!this.player.isSystemOpen(6560)) {
         this.player.failure(8007);
      } else {
         KrSevenWelfareDao dao = this.getDao();
         int welfareEndDay = this.getWelfareEndDay();
         if (!this.isTodayLogin() && dao.curDay < welfareEndDay) {
            ++dao.curDay;
            dao.updateCurDayTime = System.currentTimeMillis();
            dao.updateOp();
         }

         this.sendInfo();
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecFreeReward_24803(KrWelfareMsg.C2S_RecFreeReward_24803 msg, String source) {
      if (!this.player.isSystemOpen(6560)) {
         return this.player.failure(8007);
      } else {
         KrSevenWelfareModel krSevenWelfareModel = this.getKrSevenWelfareModel(msg.getDay());
         if (null == krSevenWelfareModel) {
            return this.player.failure(8007);
         } else {
            KrSevenWelfareDao dao = this.getDao();
            if (dao.curDay < msg.getDay()) {
               return this.player.failure(76031);
            } else if (dao.recFreeRewardDays.contains(msg.getDay())) {
               return this.player.failure(76030);
            } else {
               this.player.addResource(krSevenWelfareModel.getFreeReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 14601, 0, 0, "");
               dao.recFreeRewardDays.add(msg.getDay());
               dao.updateOp();
               KrWelfareMsg.S2C_RecFreeReward_24804.Builder resp = KrWelfareMsg.S2C_RecFreeReward_24804.newBuilder();
               resp.addAllRecFreeRewardDay(dao.recFreeRewardDays);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuyDiscount_24805(KrWelfareMsg.C2S_BuyDiscount_24805 msg, String source) {
      if (!this.player.isSystemOpen(6560)) {
         return this.player.failure(8007);
      } else {
         KrSevenWelfareModel krSevenWelfareModel = this.getKrSevenWelfareModel(msg.getDay());
         if (null == krSevenWelfareModel) {
            return this.player.failure(8007);
         } else {
            KrSevenWelfareDao dao = this.getDao();
            if (dao.curDay < msg.getDay()) {
               return this.player.failure(76031);
            } else if (dao.buyDiscountDays.contains(msg.getDay())) {
               return this.player.failure(76030);
            } else {
               ResourceModel cost = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, krSevenWelfareModel.getPrice());
               if (!this.player.checkResourceNum(cost)) {
                  return this.player.failure(76135);
               } else {
                  this.player.delResource(cost, this.getLogModule(), 14603, 0, 0, "");
                  this.player.addResource(krSevenWelfareModel.getDiscount(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 14602, 0, 0, "");
                  dao.buyDiscountDays.add(msg.getDay());
                  dao.updateOp();
                  KrWelfareMsg.S2C_BuyDiscount_24806.Builder resp = KrWelfareMsg.S2C_BuyDiscount_24806.newBuilder();
                  resp.addAllBuyDiscountDay(dao.buyDiscountDays);
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      }
   }
}
