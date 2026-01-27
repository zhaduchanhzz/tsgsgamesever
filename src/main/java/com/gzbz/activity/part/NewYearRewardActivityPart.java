package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.NewYearRewardMsg;
import com.gzbz.protobuf.PlayerMsg;
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
public class NewYearRewardActivityPart extends AbstractActivityPart {
   public static final String NEW_YEAR_PACKET = "YuandanPacket";

   public void sendInfo() {
      this.sendNewYearRewardInfo();
   }

   public int getActivityType() {
      return 60;
   }

   public void activityEnd(int oldActivityId) {
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      if (!playerActivityDao.isReceiveNewYearReward) {
         this.sendNotReceiveEmail();
      }

      playerActivityDao.isReceiveNewYearReward = false;
      playerActivityDao.updateOp();
   }

   public void sendNotReceiveEmail() {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_NEW_YEAR_PACKET);
      CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), this.getNewYearPacketReward(), 604800000L, 86, 8601);
   }

   public List<ResourceModel> getNewYearPacketReward() {
      String rewardStr = ApplicationContextProvider.getConfigString("YuandanPacket", "");
      return ResourceModel.buildResources(rewardStr);
   }

   public void sendNewYearRewardInfo() {
      NewYearRewardMsg.S2C_GetNewYearRewardInfo_17602.Builder builder = NewYearRewardMsg.S2C_GetNewYearRewardInfo_17602.newBuilder();
      PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
      builder.setIsReceiveReward(playerActivityDao.isReceiveNewYearReward);
      this.player.sendMsg(builder.build());
   }

   public PlayerActivityDao getPlayerActivityDao() {
      PlayerActivityDao dao = (PlayerActivityDao)this.player.getGameCachePool().getData("tb_player_activity", new Object[]{this.player.getPlayerId()});
      return dao;
   }

   @MsgHandlerAnno
   public void C2S_GetNewYearRewardInfo_17601(NewYearRewardMsg.C2S_GetNewYearRewardInfo_17601 msg, String source) {
      this.sendNewYearRewardInfo();
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveNewYearReward_17603(NewYearRewardMsg.C2S_ReceiveNewYearReward_17603 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = this.getPlayerActivityDao();
         if (playerActivityDao.isReceiveNewYearReward) {
            return this.player.failure(61211);
         } else {
            this.player.addResource(this.getNewYearPacketReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 86, 8601, 0, 0, "");
            playerActivityDao.isReceiveNewYearReward = true;
            playerActivityDao.updateOp();
            this.sendNewYearRewardInfo();
            return true;
         }
      }
   }
}
