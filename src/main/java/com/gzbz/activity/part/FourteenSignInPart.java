package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.FourteenSignInDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FourteenTWResignTimesModel;
import com.gzbz.model.FourteenTWSignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.FourteenSignInMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FourteenSignInPart extends AddUpAndConRechargeActivityPart {
   public void sendInfo() {
      FourteenSignInMsg.S2C_FourteenSignInSign_24202.Builder builder = FourteenSignInMsg.S2C_FourteenSignInSign_24202.newBuilder();
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      FourteenSignInDao dao = this.getDao();
      builder.setActDay(this.getSeverActivityDay());
      if (!dao.isLogin && dao.loginDay == 0) {
         dao.loginDay = 1;
         dao.isLogin = true;
         dao.updateOp();
      }

      builder.setLoginDay(dao.loginDay);
      builder.setRetroactiveNum(dao.retroactiveNum);
      builder.addAllGotDay(dao.gotDay);
      builder.setTodayGetRetroactiveNum(dao.todayGetRetroactiveNum);
      builder.setOpenServerDay(((WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class)).getOpenServerDays());
      builder.setTodayRecharge(playerRechargeDao.dailyRecharge);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FourteenSignInSign_24201(FourteenSignInMsg.C2S_FourteenSignInSign_24201 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_FourteenSignInSign_24203(FourteenSignInMsg.C2S_FourteenSignInSign_24203 msg, String source) {
      List<Integer> signDayList = msg.getSignDayList();
      FourteenSignInDao dao = this.getDao();
      boolean isRepair = false;
      int needRepairDay = 0;
      if (dao.loginDay == 0) {
         dao.loginDay = 1;
         dao.updateOp();
      }

      for(Integer signDay : signDayList) {
         if (signDay > this.getSeverActivityDay() || dao.gotDay.contains(signDay)) {
            this.player.failure(6);
            return;
         }

         if (signDay > dao.loginDay) {
            if (dao.retroactiveNum <= 0) {
               this.player.failure(6);
               return;
            }

            ++needRepairDay;
            isRepair = true;
         }
      }

      if (dao.retroactiveNum < needRepairDay) {
         this.player.failure(6);
      } else {
         List<ResourceModel> rewards = this.mergeReward(signDayList);
         dao.gotDay.addAll(signDayList);
         if (isRepair) {
            dao.retroactiveNum -= signDayList.size();
            dao.loginDay += signDayList.size();
         }

         dao.updateOp();
         this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 141, 14101, 0, 0, "");
         this.sendInfo();
      }
   }

   private List<ResourceModel> mergeReward(List<Integer> days) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int openServerDays = worldMgr.getOpenServerDays();
      List<ResourceModel> rewards = new ArrayList();
      Map<Integer, FourteenTWSignAwardModel> map = this.player.getGameModelPool().getMap("FourteenTWSignAward");

      for(Integer signDay : days) {
         for(FourteenTWSignAwardModel awardModel : map.values()) {
            if (awardModel.theDayInRegion(openServerDays) && awardModel.getDay() == signDay) {
               ResourceModel.addResourceToList(rewards, awardModel.getRewards());
               break;
            }
         }
      }

      return rewards;
   }

   public void resetDaily() {
      FourteenSignInDao dao = this.getDao();
      if (!dao.isLogin && dao.loginDay + 1 <= this.getSeverActivityDay()) {
         ++dao.loginDay;
      }

      dao.isLogin = false;
      dao.todayGetRetroactiveNum = 0;
      dao.updateOp();
      this.sendInfo();
   }

   public void activityRecharge(int money) {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      int dailyRechargeGold = playerRechargeDao.dailyRecharge * 10;
      FourteenSignInDao dao = this.getDao();
      Map<Integer, FourteenTWResignTimesModel> map = this.player.getGameModelPool().getMap("FourteenTWResignTimes");
      int maxRepairNum = 0;

      for(FourteenTWResignTimesModel timesModel : map.values()) {
         if (dailyRechargeGold >= timesModel.getValue()) {
            maxRepairNum = Math.max(maxRepairNum, timesModel.getResignTimes());
         }
      }

      int retroactiveNum = maxRepairNum - dao.todayGetRetroactiveNum;
      int maxRepairDay = this.getSeverActivityDay() - dao.loginDay;
      retroactiveNum = retroactiveNum + dao.retroactiveNum > maxRepairDay ? maxRepairDay - dao.retroactiveNum : retroactiveNum;
      if (retroactiveNum > 0) {
         dao.todayGetRetroactiveNum += retroactiveNum;
         dao.retroactiveNum += retroactiveNum;
         dao.updateOp();
      }

      this.sendInfo();
   }

   public void activityEnd(int oldActivityId) {
      FourteenSignInDao dao = this.getDao();
      ArrayList<Integer> days = new ArrayList();

      for(int day = 1; day <= dao.loginDay; ++day) {
         if (!dao.gotDay.contains(day)) {
            days.add(day);
         }
      }

      List<ResourceModel> rewards = this.mergeReward(days);
      if (!rewards.isEmpty()) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.TYPE_FOURTEEN_SIGN_REWARD);
         if (null != centreAwardModel) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewards, 604800000L, this.getActivityLogModule(), 14102);
         }
      }

      dao.clean();
   }

   public FourteenSignInDao getDao() {
      return (FourteenSignInDao)this.player.getData("tb_activity_sign_in", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 141;
   }

   public int getAddUpLogReason() {
      return 0;
   }

   public int getAddUpMail() {
      return 0;
   }

   public String getAddUpExcelName() {
      return null;
   }

   public int getConLogReason() {
      return 0;
   }

   public int getConMail() {
      return 0;
   }

   public String getConExcelName() {
      return null;
   }

   public int getActivityType() {
      return 102;
   }

   public void gmOp(String order) {
      String[] split = order.split(",");
      switch (split[0]) {
         case "t1":
            break;
         case "t2":
            ArrayList<Integer> list = new ArrayList();

            for(int i = 1; i < split.length; ++i) {
               list.add(Integer.parseInt(split[i]));
            }

            this.C2S_FourteenSignInSign_24203(FourteenSignInMsg.C2S_FourteenSignInSign_24203.newBuilder().addAllSignDay(list).build(), (String)null);
            break;
         case "t3":
            FourteenSignInDao dao = this.getDao();
            dao.clean();
            break;
         default:
            this.player.failure(0);
            return;
      }

      this.sendInfo();
      this.player.failure(1);
   }
}
