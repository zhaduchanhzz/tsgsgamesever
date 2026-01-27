package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityLampRecordDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.ActivityLampMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import misc.DateUtil;
import misc.RandomUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityLampPart extends AbstractActivityPart {
   public void sendInfo() {
   }

   public int getActivityType() {
      return 35;
   }

   @MsgHandlerAnno
   public void C2S_Main_15501(ActivityLampMsg.C2S_Main_15501 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         ActivityLampMsg.S2C_Main_15502.Builder resp = ActivityLampMsg.S2C_Main_15502.newBuilder();
         resp.setGotTimes((Integer)playerResetCustomCache.getDailyNum(12, 0));
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GetReward_15503(ActivityLampMsg.C2S_GetReward_15503 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         int enterDayTime = ApplicationContextProvider.getConfigInt("EnterDayTime", 7);
         int enterNightTime = ApplicationContextProvider.getConfigInt("EnterNightTime", 19);
         int cHour = DateUtil.cHour();
         if (cHour >= enterDayTime && cHour < enterNightTime) {
            this.player.failure(0);
         } else {
            int maxCount = ApplicationContextProvider.getConfigInt("denglongNumber", 0);
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int curCount = (Integer)playerResetCustomCache.getDailyNum(12, 0);
            if (curCount >= maxCount) {
               this.player.failure(51);
            } else {
               List<Integer> goldList = this.getConfigManager().getIntList("denglongAward");
               int gold = RandomUtil.randInt((Integer)goldList.get(0), (Integer)goldList.get(1) + 1);
               ++curCount;
               playerResetCustomCache.setDailyReset(12, curCount);
               this.player.addResource(1, PlayerDefine.PLAYER_GOLD, gold, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 878, curCount, 0, "");
               PlayerPublicDao playerPublicDao = this.player.getPublicDao();
               ActivityLampRecordDao activityLampRecordDao = new ActivityLampRecordDao();
               activityLampRecordDao.getTime = System.currentTimeMillis();
               activityLampRecordDao.name = playerPublicDao.playerName;
               activityLampRecordDao.head = playerPublicDao.head;
               activityLampRecordDao.num = gold;
               this.getActivityMgr().pushTaskEx("addLampRecord", new Object[]{activityLampRecordDao, this.player, msg.getId()});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RewardRecord_15505(ActivityLampMsg.C2S_RewardRecord_15505 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityLampMsg.S2C_RewardRecord_15506.Builder resp = ActivityLampMsg.S2C_RewardRecord_15506.newBuilder();

         for(ActivityLampRecordDao activityLampRecordDao : this.getActivityMgr().getLampRecordList()) {
            ActivityLampMsg.RewardRecordData.Builder builder = ActivityLampMsg.RewardRecordData.newBuilder();
            builder.setHead(activityLampRecordDao.head);
            builder.setName(activityLampRecordDao.name);
            builder.setNum(activityLampRecordDao.num);
            builder.setTime(DateUtil.getIntTime(activityLampRecordDao.getTime));
            resp.addRecordData(builder);
         }

         this.player.sendMsg(resp.build());
      }
   }
}
