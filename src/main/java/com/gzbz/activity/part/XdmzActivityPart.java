package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityRotateSignDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityPointRewardModel;
import com.gzbz.model.ActivityPropsModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.RechargeAwardModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RotateActivityMsg;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityXdmzTaskPart;
import java.util.ArrayList;
import java.util.HashSet;
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
public class XdmzActivityPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_Xdmz_16127(RotateActivityMsg.C2S_Xdmz_16127 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_XdmzCommitTask_16133(RotateActivityMsg.C2S_XdmzCommitTask_16133 msg, String source) {
      int taskId = msg.getTaskId();
      ActivityXdmzTaskPart activityXdmzTaskPart = (ActivityXdmzTaskPart)this.player.getMgrPart(ActivityXdmzTaskPart.class);
      activityXdmzTaskPart.commit(taskId);
   }

   @MsgHandlerAnno
   public void C2S_XdmzBoxReward_16129(RotateActivityMsg.C2S_XdmzBoxReward_16129 msg, String source) {
      int boxId = msg.getBoxId();
      int activityId = this.getPlayerActivityId();
      if (activityId <= 0) {
         this.player.failure(8007);
      } else {
         Map<Integer, Map<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, Map<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
         if (rewardMap.containsKey(activityId) && ((Map)rewardMap.get(activityId)).containsKey(boxId)) {
            ActivityPointRewardModel activityPointRewardModel = (ActivityPointRewardModel)((Map)rewardMap.get(activityId)).get(boxId);
            ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
            HashSet boxReward = (HashSet)activityRotateSignDao.boxReward.get(this.getActivityType());
            if (boxReward != null && boxReward.contains(boxId)) {
               this.player.failure(24);
            } else if (!this.player.checkResourceNum(activityPointRewardModel.getPointType(), activityPointRewardModel.getPointId(), activityPointRewardModel.getPointNum())) {
               this.player.failure(36);
            } else {
               if (boxReward == null) {
                  boxReward = new HashSet();
               }

               boxReward.add(boxId);
               activityRotateSignDao.boxReward.put(this.getActivityType(), boxReward);
               activityRotateSignDao.updateOp();
               this.player.addResource(activityPointRewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 813, boxId, 0, "");
               this.sendBoxRewardResult(boxId);
               ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
               if (activityOpenTimeModel != null) {
                  SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", activityOpenTimeModel.getSystemid());
                  if (systemFunctionModel != null) {
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, systemFunctionModel.getId(), systemFunctionModel.getName(), String.valueOf(activityPointRewardModel.getPointNum()), String.valueOf(activityPointRewardModel.getPointNum()), 0, 0, 100);
                  }
               }
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_XdmzRechargeTotalReward_16131(RotateActivityMsg.C2S_XdmzRechargeTotalReward_16131 msg, String source) {
      int id = msg.getRewardId();
      ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      HashSet rechargeReward = (HashSet)activityRotateSignDao.rechargeReward.get(this.getActivityRotateType());
      if (rechargeReward != null && rechargeReward.contains(id)) {
         this.player.failure(24);
      } else if (!this.checkRechargeAward(id, (Integer)MapUtil.getOrDefault(activityRotateSignDao.activityRotateMap, this.getActivityRotateType(), 0))) {
         this.logger.error("七日任务活动累充奖励{}不是该轮换类型奖励", id);
         this.player.failure(0);
      } else {
         PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         int result = playerRechargePart.rechargeTotalReward(id, (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0), 8, 819);
         if (result != 1) {
            this.player.failure(result);
         } else {
            if (rechargeReward == null) {
               rechargeReward = new HashSet();
            }

            rechargeReward.add(id);
            activityRotateSignDao.rechargeReward.put(this.getActivityRotateType(), rechargeReward);
            activityRotateSignDao.updateOp();
            this.sendRechargeRewardResult(id);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_XdmzRechargeTotalInfo_16137(RotateActivityMsg.C2S_XdmzRechargeTotalInfo_16137 msg, String source) {
      this.sendRechargeRewardInfo();
   }

   public void sendInfo() {
      ActivityXdmzTaskPart activityXdmzTaskPart = (ActivityXdmzTaskPart)this.player.getMgrPart(ActivityXdmzTaskPart.class);
      activityXdmzTaskPart.sendInfo();
   }

   public int getActivityType() {
      return 47;
   }

   public int getActivityRotateType() {
      return 7;
   }

   public void loginHandle() {
   }

   public void rotateReset(int oldActivityId) {
      PlayerDao playerDao = this.player.getPlayerDao();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_XDMZ);
      ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      activityRotateSignDao.boxReward.remove(this.getActivityType());
      activityRotateSignDao.rechargeReward.remove(this.getActivityRotateType());
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
      ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", this.getServerActivityInfo().id);
      if (activityPropsModel != null) {
         this.player.delResource(activityPropsModel.getPointType(), activityPropsModel.getPointId(), playerDao.getProperty(activityPropsModel.getPointId()), 8, 820, this.getServerActivityInfo().id, 0, "");
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(this.getActivityRotateType());
      if (rotaingPackagesModel != null && (Integer)MapUtil.getOrDefault(activityRotateSignDao.activityRotateMap, this.getActivityRotateType(), 0) != rotaingPackagesModel.getActivityId()) {
         activityRotateSignDao.activityRotateMap.put(this.getActivityRotateType(), rotaingPackagesModel.getActivityId());
      }

      activityRotateSignDao.updateOp();
      giftPart.clearGifts(12);
      this.checkActivityRotateType();
      ActivityXdmzTaskPart activityXdmzTaskPart = (ActivityXdmzTaskPart)this.player.getMgrPart(ActivityXdmzTaskPart.class);
      activityXdmzTaskPart.trigger();
   }

   public void resetDaily() {
      ActivityXdmzTaskPart activityXdmzTaskPart = (ActivityXdmzTaskPart)this.player.getMgrPart(ActivityXdmzTaskPart.class);
      activityXdmzTaskPart.clearTasks();
      activityXdmzTaskPart.trigger();
   }

   private void checkActivityRotateType() {
      ActivityRotateSignDao playerActivityDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(this.getActivityRotateType());
      if (rotaingPackagesModel != null && rotaingPackagesModel.getActivityId() != (Integer)MapUtil.getOrDefault(playerActivityDao.activityRotateMap, this.getActivityRotateType(), 0)) {
         playerActivityDao.activityRotateMap.put(this.getActivityRotateType(), rotaingPackagesModel.getActivityId());
         playerActivityDao.updateOp();
      }

   }

   private void sendBoxRewardResult(int boxId) {
      RotateActivityMsg.S2C_XdmzBoxReward_16130.Builder msg = RotateActivityMsg.S2C_XdmzBoxReward_16130.newBuilder();
      msg.setBoxId(boxId);
      this.player.sendMsg(msg.build());
   }

   private void sendRechargeRewardResult(int id) {
      RotateActivityMsg.S2C_XdmzRechargeTotalReward_16132.Builder msg = RotateActivityMsg.S2C_XdmzRechargeTotalReward_16132.newBuilder();
      msg.setRewardId(id);
      this.player.sendMsg(msg.build());
   }

   public void sendRechargeRewardInfo() {
      RotateActivityMsg.S2C_XdmzRechargeTotalInfo_16138.Builder resp = RotateActivityMsg.S2C_XdmzRechargeTotalInfo_16138.newBuilder();
      ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
      int rotateId = (Integer)MapUtil.getOrDefault(activityRotateSignDao.activityRotateMap, this.getActivityRotateType(), 0);
      if (rotateId == 0) {
         this.checkActivityRotateType();
      }

      for(RechargeAwardModel rechargeAwardModel : this.getRechargeAwards((Integer)MapUtil.getOrDefault(activityRotateSignDao.activityRotateMap, this.getActivityRotateType(), 0))) {
         RotateActivityMsg.RechargeTotalData.Builder rechargeTotalData = RotateActivityMsg.RechargeTotalData.newBuilder();
         rechargeTotalData.setId(rechargeAwardModel.getId());
         rechargeTotalData.setIsGot(((HashSet)MapUtil.getOrDefault(activityRotateSignDao.rechargeReward, this.getActivityRotateType(), HashSet.class)).contains(rechargeAwardModel.getId()));

         for(ResourceModel resourceModel : rechargeAwardModel.getItems()) {
            rechargeTotalData.addRewards(resourceModel.builder());
         }

         resp.addRewardList(rechargeTotalData);
      }

      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      resp.setRechargeTotal((Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0));
      this.player.sendMsg(resp.build());
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         List<ResourceModel> rewardList = new ArrayList();
         ActivityRotateSignDao rotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
         Map<Integer, TreeMap<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
         TreeMap<Integer, ActivityPointRewardModel> activityPointRewardModelMap = (TreeMap)rewardMap.get(this.getPlayerActivityId());
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", this.getPlayerActivityId());
         if (activityOpenTimeModel != null) {
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", activityOpenTimeModel.getSystemid());
            if (systemFunctionModel != null) {
               HashSet boxReward = (HashSet)rotateSignDao.boxReward.get(this.getActivityType());

               for(ActivityPointRewardModel activityPointRewardModel : activityPointRewardModelMap.values()) {
                  if (boxReward == null || !boxReward.contains(activityPointRewardModel.getId())) {
                     if (boxReward == null) {
                        boxReward = new HashSet();
                     }

                     boxReward.add(activityPointRewardModel.getId());

                     for(ResourceModel reward : activityPointRewardModel.getRewards()) {
                        reward.addResourceToList(rewardList);
                     }
                  }
               }

               rotateSignDao.boxReward.put(this.getActivityType(), boxReward);
               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               HashSet rechargeReward = (HashSet)rotateSignDao.rechargeReward.get(this.getActivityRotateType());
               Integer activityRotateId = (Integer)MapUtil.getOrDefault(rotateSignDao.activityRotateMap, this.getActivityRotateType(), 0);

               for(RechargeAwardModel rechargeAwardModel : this.getRechargeAwards(activityRotateId)) {
                  if ((rechargeReward == null || !rechargeReward.contains(rechargeAwardModel.getId())) && this.checkRechargeAward(rechargeAwardModel.getId(), (Integer)MapUtil.getOrDefault(rotateSignDao.activityRotateMap, this.getActivityRotateType(), 0)) && (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0) >= rechargeAwardModel.getMoney()) {
                     if (rechargeReward == null) {
                        rechargeReward = new HashSet();
                     }

                     rechargeReward.add(rechargeAwardModel.getId());

                     for(ResourceModel item : rechargeAwardModel.getItems()) {
                        item.addResourceToList(rewardList);
                     }
                  }
               }

               rotateSignDao.rechargeReward.put(this.getActivityRotateType(), rechargeReward);
               rotateSignDao.updateOp();
               TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
               taskCustomCache.delete(TaskDefine.TaskModule.MODULE_XDMZ);
               this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, rewardList);
            }
         }
      }
   }
}
