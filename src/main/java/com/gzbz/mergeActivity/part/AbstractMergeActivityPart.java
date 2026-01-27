package com.gzbz.mergeActivity.part;

import com.gzbz.db.PlayerMergeActivityDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.protobuf.MergeActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.Map;
import misc.DateUtil;

public abstract class AbstractMergeActivityPart extends PlayerPart {
   public abstract int getMergeSubActivityType();

   public abstract void joinSubActivity();

   public abstract void endSubActivity();

   public void resetDailyOnJoiningSubActivity() {
   }

   public void onLoginHandleOnJoiningSubActivity() {
   }

   public boolean isJoiningSubActivity() {
      PlayerMergeActivityDao dao = (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
      return dao.joiningSubActivity.contains(this.getMergeSubActivityType());
   }

   public long getSubActivityOpenTime() {
      MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
      return mergeActivityMgr.getSubActivityOpenTime(this.getMergeSubActivityType());
   }

   public long getSubActivityEndTime() {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", this.getMergeSubActivityType());
      if (null != activityRuleModel && activityRuleModel.getOpenType() == 7 && activityRuleModel.getOpenTime() >= 0 && activityRuleModel.getDuration() > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         long mergeServerBeginTime = DateUtil.getSomeDayBeginTime(worldMgr.getMergeServerTime());
         long subActivityOpenTime = mergeServerBeginTime + (long)activityRuleModel.getOpenTime() * 86400000L;
         return subActivityOpenTime + (long)(activityRuleModel.getDuration() * 1000);
      } else {
         return 0L;
      }
   }

   public long getSubActivityDropTime() {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", this.getMergeSubActivityType());
      if (null != activityRuleModel && activityRuleModel.getOpenType() == 7 && activityRuleModel.getOpenTime() >= 0 && activityRuleModel.getDuration() > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         long mergeServerBeginTime = DateUtil.getSomeDayBeginTime(worldMgr.getMergeServerTime());
         long subActivityOpenTime = mergeServerBeginTime + (long)activityRuleModel.getOpenTime() * 86400000L;
         return subActivityOpenTime + (long)(activityRuleModel.getDropTime() * 1000);
      } else {
         return 0L;
      }
   }

   public boolean isInSubActivityTime() {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", this.getMergeSubActivityType());
      if (null != activityRuleModel && activityRuleModel.getOpenType() == 7 && activityRuleModel.getOpenTime() >= 0 && activityRuleModel.getDuration() > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         long mergeServerBeginTime = DateUtil.getSomeDayBeginTime(worldMgr.getMergeServerTime());
         long subActivityOpenTime = mergeServerBeginTime + (long)activityRuleModel.getOpenTime() * 86400000L;
         long subActivityEndTime = subActivityOpenTime + (long)(activityRuleModel.getDuration() * 1000);
         long currentTime = System.currentTimeMillis();
         return currentTime >= subActivityOpenTime && currentTime < subActivityEndTime;
      } else {
         return false;
      }
   }

   protected void sendSubActivityInfo() {
      MergeActivityMsg.S2C_MergeSubActivityInfo_18937.Builder builder = MergeActivityMsg.S2C_MergeSubActivityInfo_18937.newBuilder();
      builder.setActivityType(this.getMergeSubActivityType());
      builder.setOpenTime(this.getSubActivityOpenTime());
      builder.setEndTime(this.getSubActivityEndTime());
      this.player.sendMsg(builder.build());
   }

   private void checkJoinSubActivity() {
      if (this.isInSubActivityTime() && !this.isJoiningSubActivity()) {
         ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", this.getMergeSubActivityType());
         if (null != activityRuleModel) {
            Map<Integer, ActivityOpenTimeModel> activityOpenTimeModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customActivityOpenTime", activityRuleModel.getActivityType());
            if (null != activityOpenTimeModelMap) {
               PlayerPublicDao playerPublicDao = this.player.getPublicDao();

               for(ActivityOpenTimeModel model : activityOpenTimeModelMap.values()) {
                  boolean canJoin = model.getIsClose() == 0 && playerPublicDao.lv >= model.getNeedLevel() && this.player.isSystemOpen(model.getSystemid());
                  if (canJoin) {
                     this.logger.info("玩家 {} 参与合服子活动 活动类型: {}", this.player.getPlayerId(), this.getMergeSubActivityType());
                     PlayerMergeActivityDao dao = (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
                     dao.joiningSubActivity.add(this.getMergeSubActivityType());
                     dao.updateOp();
                     this.sendSubActivityInfo();
                     this.joinSubActivity();
                  }
               }
            }
         }
      }

   }

   private void checkEndSubActivity(boolean forceEnd) {
      if ((forceEnd || !this.isInSubActivityTime()) && this.isJoiningSubActivity()) {
         this.logger.info("玩家 {} 结束合服子活动 活动类型: {}", this.player.getPlayerId(), this.getMergeSubActivityType());
         PlayerMergeActivityDao dao = (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
         dao.joiningSubActivity.remove(this.getMergeSubActivityType());
         dao.updateOp();
         this.endSubActivity();
      }

   }

   public final void joinMergeActivity() {
      this.checkJoinSubActivity();
   }

   public final void endMergeActivity() {
      this.checkEndSubActivity(true);
   }

   public final void onLoginHandleOnMergeActivityOpening() {
      this.checkEndSubActivity(false);
      this.checkJoinSubActivity();
      if (this.isJoiningSubActivity()) {
         this.sendSubActivityInfo();
         this.onLoginHandleOnJoiningSubActivity();
      }

   }

   public final void resetDailyOnMergeActivityOpening() {
      this.checkEndSubActivity(false);
      this.checkJoinSubActivity();
      if (this.isJoiningSubActivity()) {
         this.resetDailyOnJoiningSubActivity();
      }

   }

   public int getActivityOpenDay(long startTime) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int openServerDay = DateUtil.difftimeDay(new Timestamp(worldMgr.getOpenServerTime())) + 1;
      int activityStartDay = openServerDay - (DateUtil.difftimeDay(new Timestamp(startTime)) + 1) + 1;
      return activityStartDay <= 0 ? 1 : activityStartDay;
   }

   public int getSeverActivityDay() {
      MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
      return mergeActivityMgr.getSeverActivityDay(this.getMergeSubActivityType());
   }
}
