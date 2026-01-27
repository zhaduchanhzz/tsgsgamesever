package com.gzbz.mergeActivity.part;

import allMgr.PartAnnotation;
import com.gzbz.db.PlayerMergeActivityDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.HashMap;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MergeActivityPart extends PlayerPart {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private MergeActivityMgr mergeActivityMgr;
   private HashMap<Integer, AbstractMergeActivityPart> mergeActivityPartMap = new HashMap();

   private void checkInitMergeActivityPart() {
      if (this.mergeActivityPartMap.isEmpty()) {
         for(AbstractMergeActivityPart activityPart : this.player.getMgrParts(AbstractMergeActivityPart.class)) {
            if (activityPart.getMergeSubActivityType() > 0) {
               this.mergeActivityPartMap.put(activityPart.getMergeSubActivityType(), activityPart);
            }
         }
      }

   }

   PlayerMergeActivityDao getDao() {
      return (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
   }

   public boolean isJoingingMergeActivity() {
      PlayerMergeActivityDao dao = (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
      return dao.isJoiningMergeActivity;
   }

   public void loginHandle() {
      super.loginHandle();
      this.checkEnd();
      if (this.mergeActivityMgr.isMergeActivityOpening()) {
         PlayerMergeActivityDao playerMergeActivityDao = this.getDao();
         if (!this.mergeActivityMgr.isInMergeActivityOpenTime(playerMergeActivityDao.lastJoinMergeActivityTime)) {
            playerMergeActivityDao.lastJoinMergeActivityTime = System.currentTimeMillis();
            playerMergeActivityDao.mergeActivityOpenTime = this.mergeActivityMgr.getMergeActivityOpenTime();
            playerMergeActivityDao.isJoiningMergeActivity = true;
            playerMergeActivityDao.updateOp();
            this.joinMergeActivity();
         }

         this.checkInitMergeActivityPart();

         for(AbstractMergeActivityPart activityPart : this.mergeActivityPartMap.values()) {
            activityPart.onLoginHandleOnMergeActivityOpening();
         }
      }

   }

   public void resetDaily() {
      this.checkEnd();
      if (this.mergeActivityMgr.isMergeActivityOpening()) {
         this.checkInitMergeActivityPart();

         for(AbstractMergeActivityPart activityPart : this.mergeActivityPartMap.values()) {
            activityPart.resetDailyOnMergeActivityOpening();
         }
      }

   }

   private void checkEnd() {
      PlayerMergeActivityDao playerMergeActivityDao = this.getDao();
      if (playerMergeActivityDao.isJoiningMergeActivity && (!this.mergeActivityMgr.isMergeActivityOpening() || this.mergeActivityMgr.getMergeActivityOpenTime() != playerMergeActivityDao.mergeActivityOpenTime)) {
         playerMergeActivityDao.isJoiningMergeActivity = false;
         playerMergeActivityDao.updateOp();
         this.endMergeActivity();
      }

   }

   private void joinMergeActivity() {
      PlayerMergeActivityDao playerMergeActivityDao = this.getDao();
      this.logger.info("玩家 {} 参加合服活动 玩家参与的合服活动开始时间 {}", this.player.getPlayerId(), DateUtil.transferLongToDate(playerMergeActivityDao.mergeActivityOpenTime));
      this.checkInitMergeActivityPart();

      for(AbstractMergeActivityPart activityPart : this.mergeActivityPartMap.values()) {
         activityPart.joinMergeActivity();
      }

   }

   private void endMergeActivity() {
      PlayerMergeActivityDao playerMergeActivityDao = this.getDao();
      this.logger.info("玩家 {} 结束合服活动 玩家参与的合服活动开始时间 {}", this.player.getPlayerId(), DateUtil.transferLongToDate(playerMergeActivityDao.mergeActivityOpenTime));
      this.checkInitMergeActivityPart();

      for(AbstractMergeActivityPart activityPart : this.mergeActivityPartMap.values()) {
         activityPart.endMergeActivity();
      }

   }
}
