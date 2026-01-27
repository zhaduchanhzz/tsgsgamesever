package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.RechargeAwardModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.spring.ApplicationContextProvider;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DailyRechargePart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_DailyRechargeInfo_6711(ActivityMsg.C2S_DailyRechargeInfo_6711 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_DailyRechargeReward_6713(ActivityMsg.C2S_DailyRechargeReward_6713 msg, String source) {
      int id = msg.getId();
      RechargeAwardModel rechargeAwardModel = (RechargeAwardModel)ApplicationContextProvider.getModelPoolEntity("rechargeAward", id);
      if (rechargeAwardModel == null) {
         this.player.failure(0);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         if (playerActivityDao.dailyRechargeReward.contains(id)) {
            this.player.failure(24);
         } else if (!this.checkRechargeAward(id, (Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, 1, 0))) {
            this.logger.error("今日累充奖励{}不是该轮换类型奖励", id);
            this.player.failure(0);
         } else {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
            int result = playerRechargePart.rechargeTotalReward(id, playerRechargeDao.dailyRecharge, 8, 803);
            if (result != 1) {
               this.player.failure(result);
            } else {
               playerActivityDao.dailyRechargeReward.add(id);
               playerActivityDao.updateOp();
               this.sendRewardResult(id);
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1400);
               if (systemFunctionModel != null) {
                  this.player.getOperationMgr().addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), rechargeAwardModel.getMoney() + "", rechargeAwardModel.getTaskName(), rechargeAwardModel.getMoney(), id, 1);
               }

            }
         }
      }
   }

   public void loginHandle() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(1);
      if (rotaingPackagesModel != null && !playerActivityDao.activityRotateMap.containsKey(1)) {
         playerActivityDao.activityRotateMap.put(1, rotaingPackagesModel.getActivityId());
         playerActivityDao.updateOp();
      }

   }

   private void sendRewardResult(int id) {
      ActivityMsg.S2C_DailyRechargeRewardResult_6714.Builder msg = ActivityMsg.S2C_DailyRechargeRewardResult_6714.newBuilder();
      msg.setId(id);
      this.player.sendMsg(msg.build());
   }

   public void sendInfo() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityMsg.S2C_DailyRechargeResult_6712.Builder resp = ActivityMsg.S2C_DailyRechargeResult_6712.newBuilder();

      for(RechargeAwardModel rechargeAwardModel : this.getRechargeAwards((Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, 1, 0))) {
         ActivityMsg.DailyRechargeData.Builder dailyRechargeData = ActivityMsg.DailyRechargeData.newBuilder();
         dailyRechargeData.setId(rechargeAwardModel.getId());
         dailyRechargeData.setIsGot(playerActivityDao.dailyRechargeReward.contains(rechargeAwardModel.getId()));

         for(ResourceModel resourceModel : rechargeAwardModel.getItems()) {
            dailyRechargeData.addRewards(resourceModel.builder());
         }

         resp.addDataList(dailyRechargeData);
      }

      this.player.sendMsg(resp.build());
   }

   public int getActivityType() {
      return 0;
   }
}
