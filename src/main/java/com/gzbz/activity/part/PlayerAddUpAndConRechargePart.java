package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.AddUpAndConRechargeMsg;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerAddUpAndConRechargePart extends PlayerPart {
   public AddUpAndConRechargeActivityPart getAddUpAndConRechargeActivityPart(int activityType) {
      List<AddUpAndConRechargeActivityPart> partList = this.player.<AddUpAndConRechargeActivityPart>getMgrParts(AddUpAndConRechargeActivityPart.class);
      if (partList != null && partList.size() > 0) {
         for(AddUpAndConRechargeActivityPart addUpAndConRechargeActivityPart : partList) {
            if (addUpAndConRechargeActivityPart.getActivityType() == activityType) {
               return addUpAndConRechargeActivityPart;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean checkAllow(AddUpAndConRechargeActivityPart addUpAndConRechargeActivityPart) {
      if (null == addUpAndConRechargeActivityPart) {
         return this.player.failure(6);
      } else {
         return addUpAndConRechargeActivityPart.isServerActivityInvalid() ? this.player.failure(8007) : true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_AddUpInfo_18601(AddUpAndConRechargeMsg.C2S_AddUpInfo_18601 msg, String source) {
      int activityType = msg.getActivityType();
      AddUpAndConRechargeActivityPart addUpAndConRechargeActivityPart = this.getAddUpAndConRechargeActivityPart(activityType);
      if (!this.checkAllow(addUpAndConRechargeActivityPart)) {
         return false;
      } else {
         addUpAndConRechargeActivityPart.S2C_SendAddUpRechargeRewardInfo();
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveAddUpReward_18603(AddUpAndConRechargeMsg.C2S_ReceiveAddUpReward_18603 msg, String source) {
      int activityType = msg.getActivityType();
      int rewardId = msg.getRewardId();
      AddUpAndConRechargeActivityPart addUpAndConRechargeActivityPart = this.getAddUpAndConRechargeActivityPart(activityType);
      return !this.checkAllow(addUpAndConRechargeActivityPart) ? false : addUpAndConRechargeActivityPart.C2S_ReceiveAddUpReward(rewardId);
   }

   @MsgHandlerAnno
   public boolean C2S_ConInfo_18604(AddUpAndConRechargeMsg.C2S_ConInfo_18604 msg, String source) {
      int activityType = msg.getActivityType();
      AddUpAndConRechargeActivityPart addUpAndConRechargeActivityPart = this.getAddUpAndConRechargeActivityPart(activityType);
      if (!this.checkAllow(addUpAndConRechargeActivityPart)) {
         return false;
      } else {
         addUpAndConRechargeActivityPart.S2C_SendConRewardInfo();
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveConReward_18606(AddUpAndConRechargeMsg.C2S_ReceiveConReward_18606 msg, String source) {
      int activityType = msg.getActivityType();
      int rewardId = msg.getRewardId();
      AddUpAndConRechargeActivityPart addUpAndConRechargeActivityPart = this.getAddUpAndConRechargeActivityPart(activityType);
      return !this.checkAllow(addUpAndConRechargeActivityPart) ? false : addUpAndConRechargeActivityPart.C2S_ReceiveConReward(rewardId);
   }
}
