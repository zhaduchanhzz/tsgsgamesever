package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityExtendMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ServerOpenTotalRechargePart extends AbstractActivityPart {
   public static final String SERVER_OPEN_REWARD = "OpenServiceReward";
   public static final String SERVER_OPEN_MONEY = "OpenServiceMoney";

   public void activityRecharge(int money) {
      this.addUpRechargeHandle(money, true);
   }

   public void addUpRechargeHandle(int money, boolean sendMsg) {
      this.calcAndReturnAddMoney(money);
      if (sendMsg) {
         this.sendServerOpenTotalRechargeRewardInfo();
      }

   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.addUpRechargeHandle(0, true);
      }
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendServerOpenTotalRechargeRewardInfo();
      }
   }

   public int getActivityType() {
      return 73;
   }

   public void activityEnd(int oldActivityId) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      if (!playerActivityDao.isGotServerOpenTotalRechargeReward) {
         Integer needTotalRecharge = ApplicationContextProvider.getConfigInt("OpenServiceMoney", 0);
         Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
         if (null != activityRecharge && activityRecharge >= needTotalRecharge) {
            this.sendNotReceiveEmail();
         }
      }

      playerActivityDao.isGotServerOpenTotalRechargeReward = false;
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   public void sendNotReceiveEmail() {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_SERVER_OPEN_TOTAL_RECHARGE_PACKET);
      CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), this.getServerOpenTotalRechargePacketReward(), 604800000L, 96, 9502);
   }

   public List<ResourceModel> getServerOpenTotalRechargePacketReward() {
      String rewardStr = ApplicationContextProvider.getConfigString("OpenServiceReward", "");
      return ResourceModel.buildResources(rewardStr);
   }

   public void sendServerOpenTotalRechargeRewardInfo() {
      ActivityExtendMsg.S2C_GetServerOpenTotalRechargeRewardInfo_19902.Builder builder = ActivityExtendMsg.S2C_GetServerOpenTotalRechargeRewardInfo_19902.newBuilder();
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      builder.setIsReceiveReward(playerActivityDao.isGotServerOpenTotalRechargeReward);
      Integer totalRecharge = 0;
      Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
      if (null != activityRecharge) {
         totalRecharge = activityRecharge;
      }

      builder.setTotalRecharge(totalRecharge);
      this.player.sendMsg(builder.build());
   }

   public PlayerActivityDao getPlayerActivityDao() {
      PlayerActivityDao dao = (PlayerActivityDao)this.player.getGameCachePool().getData("tb_player_activity", new Object[]{this.player.getPlayerId()});
      return dao;
   }

   @MsgHandlerAnno
   public void C2S_GetServerOpenTotalRechargeRewardInfo_19901(ActivityExtendMsg.C2S_GetServerOpenTotalRechargeRewardInfo_19901 msg, String source) {
      this.sendServerOpenTotalRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveServerOpenTotalRechargeReward_19903(ActivityExtendMsg.C2S_ReceiveServerOpenTotalRechargeReward_19903 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
         if (playerActivityDao.isGotServerOpenTotalRechargeReward) {
            return this.player.failure(61211);
         } else {
            Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
            if (null == activityRecharge) {
               return false;
            } else {
               Integer needTotalRecharge = ApplicationContextProvider.getConfigInt("OpenServiceMoney", 0);
               if (activityRecharge < needTotalRecharge) {
                  return this.player.failure(35);
               } else {
                  this.player.addResource(this.getServerOpenTotalRechargePacketReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 96, 9502, 0, 0, "");
                  playerActivityDao.isGotServerOpenTotalRechargeReward = true;
                  playerActivityDao.updateOp();
                  this.sendServerOpenTotalRechargeRewardInfo();
                  return true;
               }
            }
         }
      }
   }
}
