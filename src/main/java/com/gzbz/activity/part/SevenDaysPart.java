package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ItemModel;
import com.gzbz.model.SevenDaysActivityModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SevenDaysPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_SevenDays_6701(ActivityMsg.C2S_SevenDays_6701 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_SevenDaysReward_6703(ActivityMsg.C2S_SevenDaysReward_6703 msg, String source) {
      int day = msg.getDay();
      SevenDaysActivityModel model = (SevenDaysActivityModel)this.player.getGameModelPool().getEntity("sevenDaysActivity", day);
      if (model == null) {
         this.sendRewardResult(0, day, "领取七天活动第{}天奖励失败,非法请求,玩家{}", day, this.player.getPlayerId());
      } else {
         PlayerResetCustomCache playerResetCustomCache = this.getResetCache();
         int currentDay = (Integer)playerResetCustomCache.getForeverNum(1, 0);
         if (currentDay == 0) {
            this.sendRewardResult(8000, day, "领取七天活动第{}天奖励失败,未参与活动,玩家{}", day, this.player.getPlayerId());
         } else if (currentDay < day) {
            this.sendRewardResult(8001, day, "领取七天活动第{}天奖励失败,登录天数未到,玩家{}", day, this.player.getPlayerId());
         } else {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            if (playerActivityDao.isGotSevenDaysReward(day)) {
               this.sendRewardResult(24, day, "领取七天活动第{}天奖励失败,已领取过,玩家{}", day, this.player.getPlayerId());
            } else {
               playerActivityDao.addSevenDaysReward(day);
               playerActivityDao.updateOp();
               this.player.addResource(model.getLoginItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 801, 0, 0, "");

               for(ResourceModel loginItem : model.getLoginItems()) {
                  if (loginItem.getType() == 2) {
                     ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", loginItem.getId());
                     if (itemModel != null) {
                        this.player.triggerTask(526, itemModel.getId(), 1L, 0);
                     }
                  }
               }

               this.sendRewardResult(1, day, "");
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1820);
               if (systemFunctionModel != null) {
                  this.player.getOperationMgr().addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, systemFunctionModel.getId(), systemFunctionModel.getName(), "-", "-", 0, day, 7);
               }

            }
         }
      }
   }

   public void gmSetDay(int day) {
      if (day >= 0 && day <= 7) {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         playerResetCustomCache.setForever(1, day);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(int loginDay = 1; loginDay <= 7; ++loginDay) {
            playerActivityDao.sevenDays = MiscUtil.delBit(playerActivityDao.sevenDays, loginDay);
         }

         playerActivityDao.updateOp();
         this.sendInfo();
      } else {
         this.player.failure(0);
      }
   }

   private boolean inOpen() {
      PlayerResetCustomCache playerResetCustomCache = this.getResetCache();
      int currentDay = (Integer)playerResetCustomCache.getForeverNum(1, 0);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      return activityInfo.id > 0 && currentDay > 0 && playerActivityDao.sevenDaysRewards().size() < 7;
   }

   public void sendInfo() {
      PlayerResetCustomCache playerResetCustomCache = this.getResetCache();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityMsg.S2C_SevenDaysInfo_6702.Builder builder = ActivityMsg.S2C_SevenDaysInfo_6702.newBuilder();
      builder.addAllGotDay(playerActivityDao.sevenDaysRewards());
      builder.setIsOpen(this.inOpen());
      int currentDay = (Integer)playerResetCustomCache.getForeverNum(1, 0);
      builder.setCurrentDay(Math.min(currentDay, 7));
      this.player.sendMsg(builder.build());
   }

   public int getActivityType() {
      return 3;
   }

   private void sendRewardResult(int code, int day, String message, Object... args) {
      if (code != 1 && !StringUtils.isEmpty(message)) {
      }

      ActivityMsg.S2C_SevenDaysRewardResult_6704.Builder resp = ActivityMsg.S2C_SevenDaysRewardResult_6704.newBuilder();
      resp.setDay(day);
      resp.setResult(code);
      this.player.sendMsg(resp.build());
   }
}
