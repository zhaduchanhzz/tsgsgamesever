package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WorkersDayRewardMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WorkersDayRewardActivityPart extends AbstractActivityPart {
   public static final String WORKERS_DAY_PACKET = "JieRiHongBao";

   public void sendInfo() {
      this.sendWorkersDayRewardInfo();
   }

   public int getActivityType() {
      return 72;
   }

   public void activityEnd(int oldActivityId) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      if (!playerActivityDao.isReceiveWorkersDayReward) {
         this.sendNotReceiveEmail();
      }

      playerActivityDao.isReceiveWorkersDayReward = false;
      playerActivityDao.updateOp();
   }

   public void sendNotReceiveEmail() {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_WORKERS_DAY_PACKET);
      CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), this.getWorkersDayPacketReward(), 604800000L, 95, 9501);
   }

   public List<ResourceModel> getWorkersDayPacketReward() {
      String rewardStr = ApplicationContextProvider.getConfigString("JieRiHongBao", "");
      return ResourceModel.buildResources(rewardStr);
   }

   public void sendWorkersDayRewardInfo() {
      WorkersDayRewardMsg.S2C_GetWorkersDayRewardInfo_19702.Builder builder = WorkersDayRewardMsg.S2C_GetWorkersDayRewardInfo_19702.newBuilder();
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      builder.setIsReceiveReward(playerActivityDao.isReceiveWorkersDayReward);
      this.player.sendMsg(builder.build());
   }

   public PlayerActivityDao getPlayerActivityDao() {
      PlayerActivityDao dao = (PlayerActivityDao)this.player.getGameCachePool().getData("tb_player_activity", new Object[]{this.player.getPlayerId()});
      return dao;
   }

   @MsgHandlerAnno
   public void C2S_GetWorkersDayRewardInfo_19701(WorkersDayRewardMsg.C2S_GetWorkersDayRewardInfo_19701 msg, String source) {
      this.sendWorkersDayRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveWorkersDayReward_19703(WorkersDayRewardMsg.C2S_ReceiveWorkersDayReward_19703 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
         if (playerActivityDao.isReceiveWorkersDayReward) {
            return this.player.failure(61211);
         } else {
            this.player.addResource(this.getWorkersDayPacketReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 95, 9501, 0, 0, "");
            playerActivityDao.isReceiveWorkersDayReward = true;
            playerActivityDao.updateOp();
            this.sendWorkersDayRewardInfo();
            return true;
         }
      }
   }
}
