package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ActivityDropModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DropActivityPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_DropActivityInfo_6723(ActivityMsg.C2S_DropActivityInfo_6723 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null) {
         ActivityMsg.S2C_DropActivityResult_6724.Builder resp = ActivityMsg.S2C_DropActivityResult_6724.newBuilder();
         resp.setActivityId(activityInfo.id);
         resp.setDropEndTime(activityInfo.drop);
         this.player.sendMsg(resp.build());
      }
   }

   public int getActivityType() {
      return 4;
   }

   public void activityEnd(int activityId) {
      ActivityDropModel activityDropModel = (ActivityDropModel)ApplicationContextProvider.getModelPoolEntity("activityDrop", activityId);
      if (activityDropModel != null) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dropNum = (int)playerDao.getProperty(activityDropModel.getPropertyPropsId());
         if (dropNum > 0) {
            this.player.updateProperty(activityDropModel.getPropertyPropsId(), 0L, 8, 810, 0, 0, "");
            this.player.addResource(activityDropModel.getUsePropsType(), activityDropModel.getUseProps(), dropNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 810, 0, 0, "");
         }

      }
   }

   public ResourceModel activityDrop(int minute) {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo.id > 0 && activityInfo.drop >= DateUtil.getIntTime(System.currentTimeMillis())) {
         ActivityDropModel activityDropModel = (ActivityDropModel)ApplicationContextProvider.getModelPoolEntity("activityDrop", activityInfo.id);
         int dropNum = minute * 60 / activityDropModel.getDropTime();
         return dropNum <= 0 ? null : new ResourceModel(activityDropModel.getPropertyPropsType(), activityDropModel.getPropertyPropsId(), dropNum);
      } else {
         return null;
      }
   }
}
