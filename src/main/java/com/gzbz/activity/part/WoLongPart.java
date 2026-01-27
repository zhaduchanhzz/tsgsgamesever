package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.WoLongTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WoLongPart extends AbstractActivityPart {
   public void sendInfo() {
      ActivityInfo playerActivityInfo = this.getPlayerActivityInfo();
      ActivityMsg.S2C_WoLong_6782.Builder msg = ActivityMsg.S2C_WoLong_6782.newBuilder();
      msg.setEndTime(playerActivityInfo.end);
      WoLongTaskPart woLongTaskPart = (WoLongTaskPart)this.player.getMgrPart(WoLongTaskPart.class);
      msg.addAllTasks(woLongTaskPart.buildTasks());
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      msg.setIsFinalGot(playerActivityDao.woLongGot);
      this.player.sendMsg(msg.build());
   }

   @MsgHandlerAnno
   public void C2S_WoLong_6781(ActivityMsg.C2S_WoLong_6781 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_WoLongCommit_6785(ActivityMsg.C2S_WoLongCommit_6785 msg, String source) {
      WoLongTaskPart woLongTaskPart = (WoLongTaskPart)this.player.getMgrPart(WoLongTaskPart.class);
      woLongTaskPart.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_WoLongCommitHero_6787(ActivityMsg.C2S_WoLongCommitHero_6787 msg, String source) {
      int result = this.finalReward(false);
      if (result != 1) {
         this.player.failure(result);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         ActivityMsg.S2C_WoLongCommitHero_6788.Builder resp = ActivityMsg.S2C_WoLongCommitHero_6788.newBuilder();
         resp.setIsFinalGot(playerActivityDao.woLongGot);
         this.player.sendMsg(resp.build());
      }
   }

   public void activityEnd(int oldActivityId) {
      this.finalReward(true);
   }

   public void rotateReset(int oldActivityId) {
      ActivityInfo playerActivityInfo = this.getPlayerActivityInfo();
      if (playerActivityInfo.id > 0 && playerActivityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis())) {
         WoLongTaskPart woLongTaskPart = (WoLongTaskPart)this.player.getMgrPart(WoLongTaskPart.class);
         woLongTaskPart.trigger();
      }

   }

   public int getActivityType() {
      return 10;
   }

   private int finalReward(boolean isMail) {
      WoLongTaskPart woLongTaskPart = (WoLongTaskPart)this.player.getMgrPart(WoLongTaskPart.class);
      Map<Integer, TaskData> taskDataMap = woLongTaskPart.getTasksMap();
      if (taskDataMap.isEmpty()) {
         return 0;
      } else {
         for(TaskData taskData : taskDataMap.values()) {
            if (taskData.state < 2) {
               return 8011;
            }
         }

         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         if (playerActivityDao.woLongGot) {
            return 24;
         } else {
            int heroConfig = ApplicationContextProvider.getConfigInt("wolongGetsAGeneral", 0);
            List<ResourceModel> resourceModelList = new ArrayList();
            ResourceModel resourceModel = new ResourceModel(3, heroConfig, 1);
            resourceModelList.add(resourceModel);
            if (isMail) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> woLongRewardMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_WO_LONG);
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)woLongRewardMap.firstEntry().getValue()).getTitle(), ((CentreAwardModel)woLongRewardMap.firstEntry().getValue()).getDesc(), resourceModelList, 604800000L, 8, 830);
            } else {
               this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 830, heroConfig, 0, "");
            }

            playerActivityDao.woLongGot = true;
            playerActivityDao.updateOp();
            return 1;
         }
      }
   }
}
