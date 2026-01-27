package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityOpenServerRechargeDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityOpenServerRechargePart extends AddUpAndConRechargeActivityPart {
   @Autowired
   ConfigManager configManager;

   public ActivityOpenServerRechargeDao getDao() {
      return (ActivityOpenServerRechargeDao)this.player.getData("tb_activity_open_server_recharge", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 152;
   }

   public int getAddUpLogReason() {
      return 15202;
   }

   public int getAddUpMail() {
      return CentreAwardModel.ID_OPEN_SERVER_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "openServerRecharge";
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
      return 112;
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenServerRechargeDay_6796(ActivityMsg.C2S_OpenServerRechargeDay_6796 msg, String source) {
      if (!this.isServerActivityInvalid()) {
      }

   }
}
