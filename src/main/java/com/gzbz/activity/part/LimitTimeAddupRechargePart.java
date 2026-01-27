package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LimitTimeAddupRechargeModel;
import com.gzbz.protobuf.ActivityExtendMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LimitTimeAddupRechargePart extends AbstractActivityPart {
   public void activityRecharge(int money) {
      this.addUpRechargeHandle(money, true);
   }

   public int getActivityType() {
      return 80;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendAddUpRechargeInfo();
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.addUpRechargeHandle(0, true);
      }
   }

   public void sendAddUpRechargeInfo() {
      ActivityExtendMsg.S2C_GetLimitTimeAddupRechargeRewardInfo_19908.Builder builder = ActivityExtendMsg.S2C_GetLimitTimeAddupRechargeRewardInfo_19908.newBuilder();
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      Integer totalRecharge = 0;
      Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
      if (null != activityRecharge) {
         totalRecharge = activityRecharge;
      }

      builder.setTotalRecharge(totalRecharge);
      builder.setGotGear(playerActivityDao.limitTimeAddupRechargeGotGear);
      this.player.sendMsg(builder.build());
   }

   public void addUpRechargeHandle(int money, boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         this.calcAndReturnAddMoney(money);
         if (sendMsg) {
            this.sendAddUpRechargeInfo();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_GetLimitTimeAddupRechargeRewardInfo_19907(ActivityExtendMsg.C2S_GetLimitTimeAddupRechargeRewardInfo_19907 msg, String source) {
      this.sendAddUpRechargeInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveLimitTimeAddupRechargeReward_19909(ActivityExtendMsg.C2S_ReceiveLimitTimeAddupRechargeReward_19909 msg, String source) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
      if (null == activityRecharge) {
         return false;
      } else {
         Map<Integer, LimitTimeAddupRechargeModel> modelMap = this.getNowAddupRechargeModelMap();
         LimitTimeAddupRechargeModel model = (LimitTimeAddupRechargeModel)modelMap.get(playerActivityDao.limitTimeAddupRechargeGotGear + 1);
         if (null == model) {
            return false;
         } else if (activityRecharge < model.getRechargeNum()) {
            return this.player.failure(35);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 102, 9503, 0, 0, "");
            playerActivityDao.limitTimeAddupRechargeGotGear = model.getGear();
            playerActivityDao.updateOp();
            this.sendAddUpRechargeInfo();
            return true;
         }
      }
   }

   public Map<Integer, LimitTimeAddupRechargeModel> getNowAddupRechargeModelMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, LimitTimeAddupRechargeModel> modelMap = new HashMap();
      Map<Integer, LimitTimeAddupRechargeModel> allModel = this.player.getGameModelPool().getMap("LimitTimeAddupRecharge");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, LimitTimeAddupRechargeModel> entry : allModel.entrySet()) {
            LimitTimeAddupRechargeModel model = (LimitTimeAddupRechargeModel)entry.getValue();
            if (model.getDateEnd() == -1) {
               if (activityOpenDay >= model.getDateStart()) {
                  modelMap.put(model.getGear(), model);
               }
            } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
               modelMap.put(model.getGear(), model);
            }
         }

         return modelMap;
      } else {
         return modelMap;
      }
   }

   public PlayerActivityDao getPlayerActivityDao() {
      PlayerActivityDao dao = (PlayerActivityDao)this.player.getGameCachePool().getData("tb_player_activity", new Object[]{this.player.getPlayerId()});
      return dao;
   }

   public void activityEnd(int oldActivityId) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      Integer activityRecharge = (Integer)playerActivityDao.activityRecharge.get(this.getActivityType());
      if (null != activityRecharge) {
         Map<Integer, LimitTimeAddupRechargeModel> modelMap = this.getNowAddupRechargeModelMap();

         for(Map.Entry<Integer, LimitTimeAddupRechargeModel> entry : modelMap.entrySet()) {
            LimitTimeAddupRechargeModel model = (LimitTimeAddupRechargeModel)entry.getValue();
            if (activityRecharge >= model.getRechargeNum() && playerActivityDao.limitTimeAddupRechargeGotGear < model.getGear()) {
               this.sendNotReceiveEmail(model);
            }
         }

         playerActivityDao.limitTimeAddupRechargeGotGear = 0;
         playerActivityDao.activityRecharge.remove(this.getActivityType());
         playerActivityDao.updateOp();
      }
   }

   public void sendNotReceiveEmail(LimitTimeAddupRechargeModel model) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_LIMIT_TIME_ADDUP_RECHARGE_PACKET);
      CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), model.getRewards(), 604800000L, 96, 9503);
   }
}
