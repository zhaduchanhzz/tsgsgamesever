package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CumulativeAwardModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class RechargeTotalDayPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_RechargeDayInfo_6719(ActivityMsg.C2S_RechargeDayInfo_6719 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_RechargeDayReward_6721(ActivityMsg.C2S_RechargeDayReward_6721 msg, String source) {
      int id = msg.getId();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      CumulativeAwardModel cumulativeAwardModel = (CumulativeAwardModel)this.currentCumulativeAwardMap((Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, 2, 0)).get(id);
      if (cumulativeAwardModel == null) {
         this.player.failure(0);
      } else if (playerActivityDao.rechargeTotalDayReward.contains(id)) {
         this.player.failure(24);
      } else {
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (playerRechargeDao.getTotalRechargeDay() < cumulativeAwardModel.getDays()) {
            this.player.failure(8002);
         } else {
            playerActivityDao.rechargeTotalDayReward.add(id);
            playerActivityDao.updateOp();
            this.player.addResource(cumulativeAwardModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 805, 0, 0, "");
            this.sendRewardResult(id);
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1402);
            if (systemFunctionModel != null) {
               this.player.getOperationMgr().addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), cumulativeAwardModel.getDays() + "", cumulativeAwardModel.getTaskName(), 0, id, 1);
            }

         }
      }
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(2);
      if (rotaingPackagesModel != null && !playerActivityDao.activityRotateMap.containsKey(2)) {
         playerActivityDao.activityRotateMap.put(2, rotaingPackagesModel.getActivityId());
         playerActivityDao.updateOp();
      }

      this.checkLevelRotate();
      this.sendInfo();
   }

   public void loginHandle() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(2);
      if (rotaingPackagesModel != null && !playerActivityDao.activityRotateMap.containsKey(2)) {
         playerActivityDao.activityRotateMap.put(2, rotaingPackagesModel.getActivityId());
         playerActivityDao.updateOp();
      }

   }

   public void sendInfo() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityMsg.S2C_RechargeDayResult_6720.Builder resp = ActivityMsg.S2C_RechargeDayResult_6720.newBuilder();

      for(CumulativeAwardModel cumulativeAwardModel : this.currentCumulativeAwardMap((Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, 2, 0)).values()) {
         ActivityMsg.RechargeDayData.Builder rechargeDayData = ActivityMsg.RechargeDayData.newBuilder();
         rechargeDayData.setId(cumulativeAwardModel.getId());
         rechargeDayData.setIsGot(playerActivityDao.rechargeTotalDayReward.contains(cumulativeAwardModel.getId()));

         for(ResourceModel resourceModel : cumulativeAwardModel.getItems()) {
            rechargeDayData.addResourceList(resourceModel.builder());
         }

         resp.addDataList(rechargeDayData);
      }

      this.player.sendMsg(resp.build());
   }

   public int getActivityType() {
      return 0;
   }

   private void sendRewardResult(int id) {
      ActivityMsg.S2C_RechargeDayRewardResult_6722.Builder msg = ActivityMsg.S2C_RechargeDayRewardResult_6722.newBuilder();
      msg.setId(id);
      this.player.sendMsg(msg.build());
   }

   public void checkLevelRotate() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      TreeMap<Integer, CumulativeAwardModel> currentModelMap = this.currentCumulativeAwardMap((Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, 2, 0));
      if (currentModelMap != null && !currentModelMap.isEmpty()) {
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (playerRechargeDao.getTotalRechargeDay() >= currentModelMap.size()) {
            List<ResourceModel> resourceModels = new ArrayList();

            for(CumulativeAwardModel cumulativeAwardModel : currentModelMap.values()) {
               if (!playerActivityDao.rechargeTotalDayReward.contains(cumulativeAwardModel.getId())) {
                  resourceModels.addAll(cumulativeAwardModel.getItems());
               }
            }

            if (!resourceModels.isEmpty()) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(CentreAwardModel.TYPE_TOTAL_RECHARGE);
               CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 17, 805);
            }

            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(2);
            if (rotaingPackagesModel != null) {
               playerActivityDao.activityRotateMap.put(2, rotaingPackagesModel.getActivityId());
            }

            playerActivityDao.rechargeTotalDayReward.clear();
            playerActivityDao.updateOp();
            playerRechargeDao.totalRechargeDay = 0L;
            playerRechargeDao.updateOp();
            this.player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_TOTAL_DAY, 0);
         }

      }
   }

   private TreeMap<Integer, CumulativeAwardModel> currentCumulativeAwardMap(int rechargeTotalDayId) {
      Map<Integer, TreeMap<Integer, CumulativeAwardModel>> cumulativeAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CumulativeAwardModel>>getModelPoolMap("customCumulativeAward");
      return MapUtil.getOrDefault(cumulativeAwardModelMap, rechargeTotalDayId, TreeMap.class);
   }
}
