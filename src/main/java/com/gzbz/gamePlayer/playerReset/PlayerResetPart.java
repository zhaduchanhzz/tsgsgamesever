package com.gzbz.gamePlayer.playerReset;

import allMgr.PartAnnotation;
import com.gzbz.activity.part.ActivityPart;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.PlayerItemResetCustomCache;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.qqBigPlayer.part.QqBigPlayerPart;
import java.util.List;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerResetPart extends PlayerPart {
   private static final Logger logger = LoggerFactory.getLogger(PlayerResetPart.class);

   public void playerReset(long currentTime) {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      boolean isSameHour = DateUtil.isSameHour(playerDao.updateTime, currentTime);
      if (!isSameHour) {
         boolean isSameDay = false;
         boolean isSameWeek = false;
         boolean isSameMonth = false;
         if (playerDao.updateTime > 0L) {
            isSameDay = DateUtil.isSameDay(playerDao.updateTime, currentTime);
            isSameWeek = DateUtil.isSameWeek(playerDao.updateTime, currentTime);
            isSameMonth = DateUtil.isSameMonth(playerDao.updateTime, currentTime);
         }

         List<PlayerPart> playerParts = this.player.<PlayerPart>getMgrParts(PlayerPart.class);
         playerParts.remove(this);
         playerParts.add(0, this);
         ActivityPart activityPart = (ActivityPart)this.player.getMgrPart(ActivityPart.class);
         playerParts.remove(activityPart);
         playerParts.add(1, activityPart);

         for(PlayerPart part : playerParts) {
            if (!isSameMonth) {
               this.resetMonth(part);
            }

            if (!isSameWeek) {
               this.resetWeek(part);
            }

            if (!isSameDay) {
               this.resetDaily(part);
            }

            this.resetHour(part);
         }

         if (!isSameDay) {
            this.player.notifyPlayerData(PlayerDefine.PLAYER_DAILY_RESET, 1);
         }

         playerDao.updateTime = currentTime;
         playerDao.updateOp();
      }
   }

   private void resetHour(PlayerPart part) {
      try {
         part.resetHour();
      } catch (Exception e) {
         logger.error("每小时重置异常:{}", e.getMessage(), e);
      }

   }

   private void resetDaily(PlayerPart part) {
      try {
         part.resetDaily();
      } catch (Exception e) {
         logger.error("每日重置异常:{}", e.getMessage(), e);
      }

   }

   private void resetWeek(PlayerPart part) {
      try {
         part.resetWeek();
      } catch (Exception e) {
         logger.error("每周重置异常:{}", e.getMessage(), e);
      }

   }

   private void resetMonth(PlayerPart part) {
      try {
         part.resetMonth();
      } catch (Exception e) {
         logger.error("每月重置异常:{}", e.getMessage(), e);
      }

   }

   public void resetDaily() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.todayOnlineTime = 0L;
      this.player.updatePlayerExtend(13);
      this.player.notifyPlayerData(PlayerDefine.PLAYER_TODAY_ONLINE_TIME, 0);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.reset(1, 0);
      PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
      playerItemResetCustomCache.reset(1, 0);
      playerResetCustomCache.addWeekReset(1, 1);
      playerResetCustomCache.addMonthReset(1, 1);
      playerResetCustomCache.addForever(1, 1);
      this.player.triggerTask(101, 0, 1L, 1);
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      int currentActive = playerDao.active;
      if (currentActive > 0) {
         this.player.modifyProperty(PlayerDefine.PLAYER_ACTIVE, (long)(-currentActive), 3, 301, 0, 0, "", true);
      }

      QqBigPlayerPart qqBigPlayerPart = (QqBigPlayerPart)this.player.getMgrPart(QqBigPlayerPart.class);
      qqBigPlayerPart.dailyReset();
   }

   public void resetWeek() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.reset(2, 0);
      PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
      playerItemResetCustomCache.reset(2, 0);
   }

   public void resetMonth() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.reset(3, 0);
      PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
      playerItemResetCustomCache.reset(3, 0);
   }
}
