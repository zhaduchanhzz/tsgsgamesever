package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.NewYearGiftMsg;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class NewYearGiftPart extends AbstractActivityPart {
   @Autowired
   private WorldMgr worldMgr;

   public void sendInfo() {
      this.sendActivityInfo_18202(false);
   }

   public int getActivityType() {
      return 64;
   }

   public void rotateReset(int oldActivityId) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      playerActivityDao.newYearGiftPlayerLv = this.player.getPlayerDao().lv;
      playerActivityDao.updateOp();
   }

   public void activityEnd(int oldActivityId) {
      this.clearActivityGift(24);
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.sendActivityInfo_18202(true);
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.sendInfo();
      }
   }

   public PlayerActivityDao getPlayerActivityDao() {
      PlayerActivityDao dao = (PlayerActivityDao)this.player.getGameCachePool().getData("tb_player_activity", new Object[]{this.player.getPlayerId()});
      return dao;
   }

   public void sendActivityInfo_18202(boolean isResetDaily) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      NewYearGiftMsg.S2C_ActivityInfo_18202.Builder builder = NewYearGiftMsg.S2C_ActivityInfo_18202.newBuilder();
      builder.setNewYearGiftPlayerLv(playerActivityDao.newYearGiftPlayerLv);
      builder.setOpenDay(this.getOpenDay());
      if (isResetDaily) {
         builder.setIsResetDaily(true);
      } else {
         builder.setIsResetDaily(false);
      }

      this.player.sendMsg(builder.build());
   }

   public int getOpenDay() {
      int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      int activityStartDay = openServerDay - this.getSeverActivityDay() + 1;
      return activityStartDay <= 0 ? 1 : activityStartDay;
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_18201(NewYearGiftMsg.C2S_ActivityInfo_18201 msg, String source) {
      this.sendActivityInfo_18202(false);
   }
}
