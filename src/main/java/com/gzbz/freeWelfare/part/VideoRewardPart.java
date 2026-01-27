package com.gzbz.freeWelfare.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.VideoRewardDao;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.VideoRewardModel;
import com.gzbz.model.VideoTimeRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.VideoMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Comparator;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class VideoRewardPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;
   private static final int REWARD_TYPE_WATCH = 1;
   private static final int REWARD_TYPE_ITEM = 2;
   private static final int REWARD_TYPE_FAIL = 3;

   public void resetDaily() {
      if (!this.functionLimit()) {
         VideoRewardDao dao = this.getDao();
         dao.videoRewards.clear();
         dao.rechargeMails.clear();
         dao.failRewardTimes = 0;
         dao.updateOp();
         this.sendInfo();
      }
   }

   public void resetHour() {
      if (!this.functionLimit()) {
         VideoRewardDao dao = this.getDao();
         long curTime = System.currentTimeMillis();
         int refreshHour = ApplicationContextProvider.getConfigInt("MovieTaskReset", -1);
         long todayBeginTime = DateUtil.getSomeDayBeginTime(curTime);
         int difDay = (int)((todayBeginTime - dao.timesRewardResetTime) / 86400000L);
         if (difDay != 0) {
            if (difDay > 1 || DateUtil.cHour() >= refreshHour) {
               dao.timesRewardResetTime = todayBeginTime;
               dao.maxRoundRewardId = 0;
               dao.viewVideoCount = 0;
               dao.updateOp();
               this.sendInfo();
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_VideoInfo_28401(VideoMsg.C2S_VideoInfo_28401 msg, String source) {
      if (!this.functionLimit()) {
         this.sendInfo();
      }
   }

   public void sendInfo() {
      if (!this.functionLimit()) {
         VideoMsg.S2C_VideoInfo_28402.Builder msg = VideoMsg.S2C_VideoInfo_28402.newBuilder();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         msg.setOpenServerDay(worldMgr.getOpenServerDays());
         VideoRewardDao dao = this.getDao();
         dao.videoRewards.forEach((k, v) -> msg.addVideoRewards(CommonMsg.MapDataII.newBuilder().setKey(k).setValue(v)));
         msg.setMaxRoundRewardId(dao.maxRoundRewardId);
         msg.setViewDideoCount(dao.viewVideoCount);
         msg.addAllRechargeNum(dao.rechargeMails);
         msg.setFailRewardTimes(dao.failRewardTimes);
         this.player.sendMsg(msg.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_WatchAndReward_28403(VideoMsg.C2S_WatchAndReward_28403 msg, String source) {
      if (!this.functionLimit()) {
         this.watchAndReward(msg.getPackage(), 1);
         VideoRewardDao dao = this.getDao();
         VideoMsg.S2C_WatchAndReward_28404.Builder resp = VideoMsg.S2C_WatchAndReward_28404.newBuilder();
         resp.setPackage(msg.getPackage());
         resp.setRewardTime((Integer)MapUtil.getOrDefault(dao.videoRewards, msg.getPackage(), 0));
         resp.setViewDideoCount(dao.viewVideoCount);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_VideoTimeReward_28405(VideoMsg.C2S_VideoTimeReward_28405 msg, String source) {
      if (!this.functionLimit()) {
         VideoRewardDao dao = this.getDao();
         int lastGetTimes = 0;
         VideoTimeRewardModel videoTimeRewardModel = (VideoTimeRewardModel)ApplicationContextProvider.getModelPoolEntity("videoTimeReward", dao.maxRoundRewardId);
         if (videoTimeRewardModel != null) {
            lastGetTimes = videoTimeRewardModel.getTime();
         }

         Map<Integer, VideoTimeRewardModel> videoTimeRewardModelMap = ApplicationContextProvider.<Integer, VideoTimeRewardModel>getModelPoolMap("videoTimeReward");
         VideoTimeRewardModel nextVideoTimeRewardModel = (VideoTimeRewardModel)videoTimeRewardModelMap.values().stream().filter((checkModel) -> checkModel.getTime() > lastGetTimes).min(Comparator.comparingInt(VideoTimeRewardModel::getTime)).orElse((Object)null);
         if (nextVideoTimeRewardModel == null) {
            this.player.failure(24);
         } else if (dao.viewVideoCount < nextVideoTimeRewardModel.getTime()) {
            this.player.failure(51);
         } else {
            this.player.addResource(nextVideoTimeRewardModel.getReward(), 155, 15502);
            dao.maxRoundRewardId = nextVideoTimeRewardModel.getId();
            dao.updateOp();
            this.player.sendMsg(VideoMsg.S2C_WatchAndReward_28406.newBuilder().setMaxRoundRewardId(dao.maxRoundRewardId).build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SkipVideoReward_28407(VideoMsg.C2S_SkipVideoReward_28407 msg, String source) {
      if (!this.functionLimit()) {
         this.watchAndReward(msg.getPackage(), 2);
         VideoRewardDao dao = this.getDao();
         VideoMsg.S2C_SkipVideoReward_28408.Builder resp = VideoMsg.S2C_SkipVideoReward_28408.newBuilder();
         resp.setPackage(msg.getPackage());
         resp.setRewardTime((Integer)MapUtil.getOrDefault(dao.videoRewards, msg.getPackage(), 0));
         resp.setViewDideoCount(dao.viewVideoCount);
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DailyRechargeReward_28409(VideoMsg.C2S_DailyRechargeReward_28409 msg, String source) {
      if (!this.functionLimit()) {
         if (!this.configManager.getIntList("MovieRecharge").contains(msg.getRechargeNum())) {
            this.player.failure(0);
         } else {
            VideoRewardDao videoRewardDao = this.getDao();
            int movieAddUpLimit = this.configManager.getInt("MovieAddUpLimit");
            if (videoRewardDao.rechargeMails.size() >= movieAddUpLimit) {
               this.player.failure(51);
            } else if (videoRewardDao.rechargeMails.contains(msg.getRechargeNum())) {
               this.player.failure(24);
            } else {
               PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               if (playerRechargeDao.dailyRecharge < msg.getRechargeNum()) {
                  this.player.failure(35);
               } else {
                  int item = ApplicationContextProvider.getConfigInt("MovieItem", 7514);
                  this.player.addResource(2, item, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 155, 15503, 0, 0, String.valueOf(msg.getRechargeNum()));
                  videoRewardDao.rechargeMails.add(msg.getRechargeNum());
                  videoRewardDao.updateOp();
                  this.player.sendMsg(VideoMsg.S2C_DailyRechargeReward_28410.newBuilder().setRechargeNum(msg.getRechargeNum()).build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WatchFailReward_28411(VideoMsg.C2S_WatchFailReward_28411 msg, String source) {
      if (!this.functionLimit()) {
         this.watchAndReward(msg.getPackage(), 3);
         VideoRewardDao dao = this.getDao();
         VideoMsg.S2C_WatchFailReward_28412.Builder resp = VideoMsg.S2C_WatchFailReward_28412.newBuilder();
         resp.setPackage(msg.getPackage());
         resp.setRewardTime((Integer)MapUtil.getOrDefault(dao.videoRewards, msg.getPackage(), 0));
         resp.setViewDideoCount(dao.viewVideoCount);
         resp.setFailRewardTimes(dao.failRewardTimes);
         this.player.sendMsg(resp.build());
      }
   }

   public boolean functionLimit() {
      return !this.player.isSystemOpen(6780);
   }

   public VideoRewardModel getVideoRewardModel(int packageId) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      Map<Integer, VideoRewardModel> videoRewardModels = ApplicationContextProvider.<Integer, VideoRewardModel>getModelPoolMap("videoReward");
      return (VideoRewardModel)videoRewardModels.values().stream().filter((model) -> model.getPackageId() == packageId).filter((model) -> {
         if (model.getDateStart() == 0 && model.getDateEnd() == 0) {
            return true;
         } else if (model.getDateEnd() == -1) {
            return worldMgr.getOpenServerDays() >= model.getDateStart();
         } else {
            return worldMgr.getOpenServerDays() >= model.getDateStart() && worldMgr.getOpenServerDays() <= model.getDateEnd();
         }
      }).findAny().orElse((Object)null);
   }

   public VideoRewardDao getDao() {
      VideoRewardDao dao = (VideoRewardDao)this.player.getData("tb_video_reward", this.player.getPlayerId());
      if (dao.timesRewardResetTime == 0L) {
         long curTime = System.currentTimeMillis();
         int refreshHour = ApplicationContextProvider.getConfigInt("MovieTaskReset", -1);
         long todayBeginTime = DateUtil.getSomeDayBeginTime(curTime);
         if (DateUtil.cHour() >= refreshHour) {
            dao.timesRewardResetTime = todayBeginTime;
         } else {
            dao.timesRewardResetTime = todayBeginTime - 86400000L;
         }
      }

      return dao;
   }

   public void watchAndReward(int packageId, int rewardType) {
      if (!this.functionLimit()) {
         VideoRewardDao dao = this.getDao();
         VideoRewardModel videoRewardModel = this.getVideoRewardModel(packageId);
         if (videoRewardModel == null) {
            this.logger.error("玩家{}观看广告奖励发放时,找不到配置,packageId={}", this.player.getPlayerId(), packageId);
         } else {
            int watchTime = (Integer)dao.videoRewards.getOrDefault(packageId, 0);
            if (watchTime >= videoRewardModel.getTime()) {
               this.logger.error("玩家{}观看广告奖励发放时,最大次数={},已达上限={},packageId={}", new Object[]{this.player.getPlayerId(), watchTime, videoRewardModel.getTime(), packageId});
            } else {
               if (rewardType == 2) {
                  int item = ApplicationContextProvider.getConfigInt("MovieItem", 7514);
                  if (!this.player.checkResourceNum(2, item, 1)) {
                     this.player.failure(51);
                     return;
                  }

                  this.player.delItem(item, 1L, 155, 15504);
               } else if (rewardType == 3) {
                  int dailyFailTimesLimit = this.configManager.getInt("MovieWatchFailedCostTimes");
                  if (dao.failRewardTimes >= dailyFailTimesLimit) {
                     this.player.failure(51);
                     return;
                  }

                  int failFeeGold = this.configManager.getInt("MovieWatchFailedCost");
                  if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, failFeeGold)) {
                     this.player.failure(31);
                     return;
                  }

                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)failFeeGold, 155, 15501, 0, 0, String.valueOf(packageId));
                  ++dao.failRewardTimes;
               }

               this.player.addResource(videoRewardModel.getReward(), 155, 15501);
               MapUtil.mapPlusInt(dao.videoRewards, videoRewardModel.getPackageId(), 1);
               ++dao.viewVideoCount;
               dao.updateOp();
               if (!videoRewardModel.getReward().isEmpty()) {
                  StringBuilder logRewardStr = new StringBuilder();

                  for(ResourceModel resourceModel : videoRewardModel.getReward()) {
                     logRewardStr.append(resourceModel.getId()).append("&").append(resourceModel.getValue()).append("-");
                  }

                  this.player.getOperationMgr().addExtraLog(this.player, 233, String.valueOf(rewardType), String.valueOf(dao.viewVideoCount), logRewardStr.deleteCharAt(logRewardStr.length() - 1).toString());
               }

            }
         }
      }
   }

   public void handleGm(String type, String ext) {
      CrossActivityMsg.S2CR_BroodSettleTest_13114.Builder msg = CrossActivityMsg.S2CR_BroodSettleTest_13114.newBuilder();
      switch (type) {
         case "info":
            this.sendInfo();
            break;
         case "watch":
            this.C2S_WatchAndReward_28403(VideoMsg.C2S_WatchAndReward_28403.newBuilder().setPackage(Integer.parseInt(ext)).build(), (String)null);
            break;
         case "skip":
            this.C2S_SkipVideoReward_28407(VideoMsg.C2S_SkipVideoReward_28407.newBuilder().setPackage(Integer.parseInt(ext)).build(), (String)null);
            break;
         case "fail":
            this.C2S_WatchFailReward_28411(VideoMsg.C2S_WatchFailReward_28411.newBuilder().setPackage(Integer.parseInt(ext)).build(), (String)null);
            break;
         case "reward":
            this.C2S_VideoTimeReward_28405(VideoMsg.C2S_VideoTimeReward_28405.newBuilder().build(), (String)null);
            break;
         case "clear":
            this.getDao().videoRewards.clear();
            this.getDao().rechargeMails.clear();
            this.getDao().maxRoundRewardId = 0;
            this.getDao().viewVideoCount = 0;
            this.getDao().updateOp();
            this.sendInfo();
      }

   }
}
