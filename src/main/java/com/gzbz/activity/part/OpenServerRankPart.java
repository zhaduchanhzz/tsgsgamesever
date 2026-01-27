package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.GreenPlumMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.worldMgr.WorldMgr;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class OpenServerRankPart extends AbstractActivityPart {
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ActivityMgr activityMgr;

   @MsgHandlerAnno
   public void C2S_OpenServerRank_6795(GreenPlumMsg.C2S_OpenServerRank_13559 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      GreenPlumMsg.S2C_OpenServerRank_13560.Builder resp = GreenPlumMsg.S2C_OpenServerRank_13560.newBuilder();
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.open) {
         int endTime = activityInfo.end - 10800;
         int extraTime = activityInfo.end - DateUtil.getIntTime(System.currentTimeMillis());
         if (extraTime >= 0 && extraTime <= 10800) {
            endTime = 0;
         }

         if (endTime < 0) {
            endTime = -1;
         }

         resp.setTime(endTime);
      } else {
         resp.setTime(-1);
      }

      resp.setType(16);
      this.player.sendMsg(resp.build());
   }

   public int getActivityType() {
      return 16;
   }

   public void activityEnd(int oldActivityId) {
      GreenPlumMsg.S2C_OpenServerRank_13560.Builder resp = GreenPlumMsg.S2C_OpenServerRank_13560.newBuilder();
      resp.setTime(-1);
      resp.setType(16);
      this.player.sendMsg(resp.build());
   }
}
