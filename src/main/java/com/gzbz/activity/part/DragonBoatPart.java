package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GreenPlumAwardModel;
import com.gzbz.model.SpringPrayersModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.DragonBoatMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.DragonBoatPrayTaskPart;
import com.gzbz.task.DragonBoatTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DragonBoatPart extends AbstractActivityPart {
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   private static final String DRAGON_BOAT_MATERIAL = "dragonBoatMaterial";
   private static final String GREEN_PLUM_FREE_TIMES = "greenPlumFreeTimes";
   private static final String GREEN_PLUM_MADEVALUE = "greenPlumMadevalue";
   private static final String CONFIG_DRAGON_BOAT_PRAY_NUM = "springRewardNum";
   private static final String DRAGON_BOAT_ID = "dragonBoatId";

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         DragonBoatTaskPart dragonBoatTaskPart = (DragonBoatTaskPart)this.player.getMgrPart(DragonBoatTaskPart.class);
         dragonBoatTaskPart.checkTasks();
      }
   }

   public int getActivityType() {
      return 27;
   }

   public void rotateReset(int oldActivityId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.dragonBoatData.reset();
      this.clearActivityGift(24);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_DRAGON_BOAT_PRAY_TASK);
      DragonBoatPrayTaskPart prayTaskPart = (DragonBoatPrayTaskPart)this.player.getMgrPart(DragonBoatPrayTaskPart.class);
      prayTaskPart.trigger();
   }

   public void activityEnd(int oldActivityId) {
      this.prayReward(oldActivityId);
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            this.prayReward(this.getPlayerActivityId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_DRAGON_BOAT_PRAY_TASK);
            DragonBoatPrayTaskPart prayTaskPart = (DragonBoatPrayTaskPart)this.player.getMgrPart(DragonBoatPrayTaskPart.class);
            prayTaskPart.trigger();
            playerActivityDao.dragonBoatData.freeDrinkNum = 0;
            playerActivityDao.updateOp();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MakeWine_14001(DragonBoatMsg.C2S_MakeWine_14001 msg, String source) {
      this.makeWine(msg.getNum());
   }

   @MsgHandlerAnno
   public void C2S_TakePlumReward_14003(DragonBoatMsg.C2S_TakePlumReward_14003 msg, String source) {
      this.takePlumReward();
   }

   @MsgHandlerAnno
   public void C2S_Drink_14005(DragonBoatMsg.C2S_Drink_14005 msg, String source) {
      this.drink();
   }

   @MsgHandlerAnno
   public void C2S_FreeDrinkNum_14007(DragonBoatMsg.C2S_FreeDrinkNum_14007 msg, String source) {
      this.freeDrinkNum();
   }

   public void makeWine(int num) {
      if (num <= 0) {
         this.player.failure(6);
      } else {
         List<ResourceModel> greenPlumMaterialList = this.configManager.getResourceModelList("dragonBoatMaterial", "");
         List<ResourceModel> needList = new ArrayList();

         for(ResourceModel resourceModel : greenPlumMaterialList) {
            if (!ResourceModel.checkTotalNumError(resourceModel.getValue(), num)) {
               needList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * num));
            }
         }

         if (this.player.checkResourceNum(needList)) {
            this.player.delResource((List)needList, 8, 848, 0, num, "makeWine");
            List<ResourceModel> addList = new ArrayList();
            List<GreenPlumAwardModel> awardModels = (List)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_2);
            if (awardModels != null && !awardModels.isEmpty()) {
               int totalWeight = 0;

               for(GreenPlumAwardModel model : awardModels) {
                  totalWeight += model.getWeight();
               }

               if (totalWeight > 0) {
                  int r = RandomUtil.randInt(totalWeight);
                  int temp = 0;

                  for(GreenPlumAwardModel awardModel : awardModels) {
                     temp += awardModel.getWeight();
                     if (temp > r) {
                        addList.addAll(awardModel.getRewards());
                        break;
                     }
                  }
               }
            }

            int dragonBoatId = this.configManager.getIntDefault("dragonBoatId", 1143);
            addList.add(new ResourceModel(2, dragonBoatId, num));
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 848, 0, num, "");
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            ++playerActivityDao.dragonBoatData.totalWineNum;
            playerActivityDao.updateOp();
            DragonBoatMsg.S2C_MakeWine_14002.Builder builder = DragonBoatMsg.S2C_MakeWine_14002.newBuilder();
            builder.setResult(1);
            builder.setTotalWineNum(playerActivityDao.dragonBoatData.totalWineNum);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void takePlumReward() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (!playerActivityDao.dragonBoatData.isTakePlumNum) {
         int wineNum = playerActivityDao.dragonBoatData.totalWineNum;
         int greenPlumMadevalue = this.configManager.getIntDefault("greenPlumMadevalue", 0);
         if (wineNum >= greenPlumMadevalue) {
            List<ResourceModel> addList = new ArrayList();

            for(GreenPlumAwardModel awardModel : (List<GreenPlumAwardModel>)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_3)) {
               addList.addAll(awardModel.getRewards());
            }

            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 848, 0, wineNum, "takePlumReward");
            playerActivityDao.dragonBoatData.isTakePlumNum = true;
            playerActivityDao.updateOp();
            DragonBoatMsg.S2C_TakePlumReward_14004.Builder builder = DragonBoatMsg.S2C_TakePlumReward_14004.newBuilder();
            builder.setResult(1);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void drink() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int greenPlumFreeTimes = this.configManager.getIntDefault("greenPlumFreeTimes", 0);
      int freeNum = greenPlumFreeTimes - playerActivityDao.dragonBoatData.freeDrinkNum;
      if (freeNum > 0) {
         ++playerActivityDao.dragonBoatData.freeDrinkNum;
         playerActivityDao.updateOp();
         --freeNum;
      } else {
         int dragonBoatId = this.configManager.getIntDefault("dragonBoatId", 1143);
         ResourceModel needModel = new ResourceModel(2, dragonBoatId, 1);
         if (!this.player.checkResourceNum(needModel)) {
            return;
         }

         this.player.delResource(needModel, 8, 849, 0, 0, "");
      }

      List<ResourceModel> addList = new ArrayList();
      List<GreenPlumAwardModel> awardModels = (List)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_4);
      if (awardModels != null && !awardModels.isEmpty()) {
         int totalWeight = 0;

         for(GreenPlumAwardModel model : awardModels) {
            totalWeight += model.getWeight();
         }

         if (totalWeight > 0) {
            int r = RandomUtil.randInt(totalWeight);
            int temp = 0;

            for(GreenPlumAwardModel awardModel : awardModels) {
               temp += awardModel.getWeight();
               if (temp > r) {
                  addList.addAll(awardModel.getRewards());
                  break;
               }
            }
         }
      }

      this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 849, 0, 0, "");
      DragonBoatMsg.S2C_Drink_14006.Builder builder = DragonBoatMsg.S2C_Drink_14006.newBuilder();
      builder.setResult(1);
      builder.setFreeNum(freeNum);
      this.player.sendMsg(builder.build());
   }

   public void freeDrinkNum() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int greenPlumFreeTimes = this.configManager.getIntDefault("greenPlumFreeTimes", 0);
      int freeNum = greenPlumFreeTimes - playerActivityDao.dragonBoatData.freeDrinkNum;
      DragonBoatMsg.S2C_FreeDrinkNum_14008.Builder builder = DragonBoatMsg.S2C_FreeDrinkNum_14008.newBuilder();
      builder.setFreeNum(freeNum);
      builder.setTotalWineNum(playerActivityDao.dragonBoatData.totalWineNum);
      builder.setIsTaked(playerActivityDao.dragonBoatData.isTakePlumNum);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_DragonBoatPrayMain_14021(DragonBoatMsg.C2S_DragonBoatPrayMain_14021 msg, String source) {
      this.sendPrayMain();
   }

   @MsgHandlerAnno
   public void C2S_DragonBoatPray_14023(DragonBoatMsg.C2S_DragonBoatPray_14023 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         if (!playerActivityDao.dragonBoatData.prays.isEmpty()) {
            this.player.failure(61099);
         } else {
            int prayNum = ApplicationContextProvider.getConfigInt("springRewardNum", 0);
            if (msg.getIdCount() != prayNum) {
               this.player.failure(0);
            } else {
               StringBuilder stringBuilder = new StringBuilder();
               Map<Integer, Boolean> prays = new HashMap();
               DragonBoatPrayTaskPart dragonBoatPrayTaskPart = (DragonBoatPrayTaskPart)this.player.getMgrPart(DragonBoatPrayTaskPart.class);

               for(Integer prayId : msg.getIdList()) {
                  SpringPrayersModel springPrayersModel = (SpringPrayersModel)ApplicationContextProvider.getModelPoolEntity("springprayers", prayId);
                  if (springPrayersModel == null || springPrayersModel.getActivityId() != this.getPlayerActivityId()) {
                     this.player.failure(0);
                     return;
                  }

                  if (springPrayersModel.getRewardsNeed() == 2) {
                     TaskData taskData = dragonBoatPrayTaskPart.getTask(springPrayersModel.getId());
                     if (taskData == null || taskData.state < 2) {
                        this.player.failure(3000);
                        return;
                     }
                  }

                  prays.put(prayId, false);

                  for(ResourceModel resourceModel : springPrayersModel.getRewards()) {
                     stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append("-");
                  }
               }

               playerActivityDao.dragonBoatData.prays.putAll(prays);
               playerActivityDao.updateOp();
               this.sendPray(msg.getIdList());
               if (stringBuilder.length() > 0) {
                  stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getPlayerActivityId(), "端午锦愿", stringBuilder.toString(), stringBuilder.toString(), 0, 0, 0);
               }

            }
         }
      }
   }

   private void sendPrayMain() {
      if (!super.isServerActivityInvalid()) {
         DragonBoatMsg.S2C_DragonBoatPrayMain_14022.Builder resp = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.newBuilder();
         resp.setDay(this.getSeverActivityDay());
         DragonBoatPrayTaskPart dragonBoatPrayTaskPart = (DragonBoatPrayTaskPart)this.player.getMgrPart(DragonBoatPrayTaskPart.class);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(TaskData taskData : dragonBoatPrayTaskPart.getTasksMap().values()) {
            resp.addTask(dragonBoatPrayTaskPart.buildTask(taskData));
         }

         resp.addAllId(playerActivityDao.dragonBoatData.prays.keySet());
         this.player.sendMsg(resp.build());
      }
   }

   private void sendPray(List<Integer> ids) {
      DragonBoatMsg.S2C_DragonBoatPray_14024.Builder resp = DragonBoatMsg.S2C_DragonBoatPray_14024.newBuilder();
      resp.addAllId(ids);
      this.player.sendMsg(resp.build());
   }

   private void prayReward(int activityId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      List<ResourceModel> resourceModels = new ArrayList();

      for(int prayId : playerActivityDao.dragonBoatData.prays.keySet()) {
         SpringPrayersModel springPrayersModel = (SpringPrayersModel)ApplicationContextProvider.getModelPoolEntity("springprayers", prayId);
         if (springPrayersModel != null && springPrayersModel.getActivityId() == activityId) {
            resourceModels.addAll(springPrayersModel.getRewards());
         }
      }

      if (!resourceModels.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_SPRING_ENJOY_PRAY);
         CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMailMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 8, 864);
      }

      playerActivityDao.dragonBoatData.prays.clear();
      playerActivityDao.updateOp();
   }
}
