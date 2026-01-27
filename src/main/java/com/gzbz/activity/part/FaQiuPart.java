package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.FaQiuDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FaQiuActivityTaskModel;
import com.gzbz.model.FaQiuCollectRewardModel;
import com.gzbz.model.FaQiuExploreLotteryModel;
import com.gzbz.model.FaQiuGetFragmentModel;
import com.gzbz.model.FaQiuGetLastRewardModel;
import com.gzbz.model.FaQiuLotteryCostModel;
import com.gzbz.model.FaQiuMapFragmentModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.FaQiuMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.FaQiuTaskPart;
import com.gzbz.util.TempUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FaQiuPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;
   public static final int DAILY_TASK = 1;
   public static final int ACT_TASK = 2;

   @MsgHandlerAnno
   public void C2S_FaQiuMain_23601(FaQiuMsg.C2S_FaQiuMain_23601 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         FaQiuDao faQiuDao = this.getDao();
         FaQiuMsg.S2C_FaQiuMain_23602.Builder builder = FaQiuMsg.S2C_FaQiuMain_23602.newBuilder();
         builder.setFinalReward(this.getDao().finalReward);
         builder.addAllOpenChip(faQiuDao.openChips);
         builder.addAllCollectReward(faQiuDao.collectRewards);
         FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
         builder.addAllTaskList(faQiuTaskPart.getTasks());
         this.player.sendMsg(builder.build());
      }
   }

   public void sendInfo() {
   }

   @MsgHandlerAnno
   public void C2S_FaQiuCommitTask_23603(FaQiuMsg.C2S_FaQiuCommitTask_23603 msg, String source) {
      FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
      faQiuTaskPart.commit(msg.getTaskId());
      faQiuTaskPart.sendTaskList();
   }

   @MsgHandlerAnno
   public void C2S_FaQiuDraw_23605(FaQiuMsg.C2S_FaQiuDraw_23605 msg, String source) {
      FaQiuLotteryCostModel costModel = (FaQiuLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("FaQiuLotteryCost", msg.getId());
      if (!this.isServerActivityInvalid() && costModel != null) {
         ResourceModel cost = costModel.getCost();
         if (!this.player.checkResourceNum(cost)) {
            this.player.failure(3);
         } else {
            int activityOpenDay = this.getActivityOpenDay();
            Map<Integer, FaQiuExploreLotteryModel> lotteryModelMap = ApplicationContextProvider.<Integer, FaQiuExploreLotteryModel>getModelPoolMap("FaQiuExploreLottery");
            Map<FaQiuExploreLotteryModel, Integer> weightMap = (Map)lotteryModelMap.values().stream().filter((m) -> m.dayInRange(activityOpenDay)).collect(Collectors.toMap(Function.identity(), FaQiuExploreLotteryModel::getWeight));
            ArrayList<ResourceModel> rewards = new ArrayList();
            int drawCount = cost.getValue();

            for(FaQiuExploreLotteryModel lotteryModel : TempUtil.getLotForMap(weightMap, drawCount, true)) {
               ResourceModel.addResourceToListPlus(rewards, lotteryModel.getRewards());
            }

            if (CollectionUtils.isEmpty(rewards)) {
               this.player.failure(6);
            } else {
               this.player.delResource(cost, 136, 13603, 0, 0, "");
               this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_ACTFAQIU_DRAW, 136, 13602, 0, 0, "");

               for(ResourceModel resourceModel : rewards) {
                  String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                  this.player.getOperationMgr().addExtraLog(this.player, 198, "发丘秘藏-抽奖", cost.getId() + "", cost.getValue() + "", strings[0], strings[2], strings[1], "0");
               }

               FaQiuDao faQiuDao = this.getDao();
               faQiuDao.totalDraw += cost.getValue();
               faQiuDao.updateOp();
               Map<Integer, FaQiuMapFragmentModel> gridMap = ApplicationContextProvider.<Integer, FaQiuMapFragmentModel>getModelPoolMap("FaQiuMapFragment");
               List<Integer> gridList = (List)gridMap.values().stream().map(FaQiuMapFragmentModel::getId).collect(Collectors.toList());
               gridList.removeAll(faQiuDao.openChips);
               List<Integer> chips = new ArrayList();

               for(int i = 0; i < drawCount; ++i) {
                  if (CollectionUtils.isEmpty(gridList)) {
                     chips.add(TempUtil.getOneForCollection(faQiuDao.openChips));
                  } else {
                     Map<Integer, FaQiuGetFragmentModel> gridRatioMap = ApplicationContextProvider.<Integer, FaQiuGetFragmentModel>getModelPoolMap("FaQiuGetFragment");

                     for(FaQiuGetFragmentModel value : gridRatioMap.values()) {
                        if (value.numInRegion(faQiuDao.openChips.size())) {
                           boolean minDraw = true;
                           if (gridList.size() == 1) {
                              int faQiuGetAllFrontTime = this.configManager.getIntDefault("FaQiuGetAllFrontTime", 100);
                              minDraw = faQiuDao.totalDraw > faQiuGetAllFrontTime;
                           }

                           if (minDraw && TempUtil.judgeWeight(value.getWeight())) {
                              Integer chip = (Integer)TempUtil.getOneForCollection(gridList);
                              faQiuDao.openChips.add(chip);
                              faQiuDao.updateOp();
                              gridList.remove(chip);
                              chips.add(chip);
                              break;
                           }

                           chips.add(TempUtil.getOneForCollection(faQiuDao.openChips));
                           break;
                        }
                     }
                  }
               }

               if (CollectionUtils.isEmpty(chips)) {
                  chips = TempUtil.<Integer>getLotForCollection(faQiuDao.openChips, drawCount, true);
               }

               this.player.sendMsg(FaQiuMsg.S2C_FaQiuDraw_23606.newBuilder().addAllOpenChip(chips).build());
            }
         }
      } else {
         this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public void C2S_FaQiuGetCollectReward_23607(FaQiuMsg.C2S_FaQiuGetCollectReward_23607 msg, String source) {
      FaQiuCollectRewardModel collectRewardModel = (FaQiuCollectRewardModel)ApplicationContextProvider.getModelPoolEntity("FaQiuCollectReward", msg.getRewardId());
      FaQiuDao faQiuDao = this.getDao();
      if (collectRewardModel != null && collectRewardModel.dayInRange(this.getActivityOpenDay()) && !faQiuDao.collectRewards.contains(msg.getRewardId()) && faQiuDao.openChips.containsAll(collectRewardModel.getGridId())) {
         faQiuDao.collectRewards.add(msg.getRewardId());
         faQiuDao.updateOp();
         this.player.addResource(collectRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 136, 13604, 0, 0, "");
         this.player.sendMsg(FaQiuMsg.S2C_FaQiuGetCollectReward_23608.newBuilder().addAllCollectReward(faQiuDao.collectRewards).build());
      } else {
         this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public void C2S_FaQiuGetUltimateReward_23609(FaQiuMsg.C2S_FaQiuGetUltimateReward_23609 msg, String source) {
      FaQiuGetLastRewardModel lastRewardModel = (FaQiuGetLastRewardModel)ApplicationContextProvider.getModelPoolEntity("FaQiuLastReward", msg.getRewardId());
      FaQiuDao faQiuDao = this.getDao();
      Map<Integer, FaQiuMapFragmentModel> gridMap = ApplicationContextProvider.<Integer, FaQiuMapFragmentModel>getModelPoolMap("FaQiuMapFragment");
      List<Integer> gridList = (List)gridMap.values().stream().map(FaQiuMapFragmentModel::getId).collect(Collectors.toList());
      if (lastRewardModel != null && lastRewardModel.dayInRange(this.getActivityOpenDay()) && !faQiuDao.finalReward && faQiuDao.openChips.containsAll(gridList)) {
         faQiuDao.finalReward = true;
         faQiuDao.updateOp();
         this.player.addResource(lastRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 136, 13605, 0, 0, "");
         this.player.sendMsg(FaQiuMsg.S2C_FaQiuGetUltimateReward_23610.newBuilder().setFinalReward(faQiuDao.finalReward).build());
      } else {
         this.player.failure(6);
      }
   }

   public FaQiuDao getDao() {
      return (FaQiuDao)this.player.getData("tb_activity_fa_qiu", this.player.getPlayerId());
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.sendDailyTaskReward();
         this.clearDailyTask();
         FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
         faQiuTaskPart.trigger();
         faQiuTaskPart.sendTaskList();
      }
   }

   private void clearDailyTask() {
      FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
      Map<Integer, TaskData> taskDataMap = faQiuTaskPart.getTasksMap();
      Map<Integer, FaQiuActivityTaskModel> allTaskMap = ApplicationContextProvider.<Integer, FaQiuActivityTaskModel>getModelPoolMap("FaQiuActiveTask");

      for(Map.Entry<Integer, FaQiuActivityTaskModel> entry : allTaskMap.entrySet()) {
         FaQiuActivityTaskModel taskModel = (FaQiuActivityTaskModel)entry.getValue();
         if (taskModel.getTime() == 1) {
            TaskData taskData = (TaskData)taskDataMap.get(taskModel.getId());
            if (null != taskData) {
               taskData.delete();
            }
         }
      }

   }

   private void sendDailyTaskReward() {
      FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
      ArrayList<ResourceModel> reissueList = new ArrayList();

      for(TaskData taskData : faQiuTaskPart.getTasksMap().values()) {
         if (taskData != null && taskData.state == 2) {
            FaQiuActivityTaskModel taskModel = (FaQiuActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("FaQiuActiveTask", taskData.id);
            if (taskModel != null && taskModel.getTime() == 1 && !DateUtil.isSameDay((long)taskData.ctTime * 1000L, System.currentTimeMillis())) {
               ResourceModel.addResourceToList(reissueList, taskModel.getRewards());
               taskData.finish();
            }
         }
      }

      this.sendReissueMail(CentreAwardModel.TYPE_TASK_REWARD, reissueList, 13609);
   }

   private void sendReissueMail(int mailId, List<ResourceModel> reissueList, int log) {
      if (!CollectionUtils.isEmpty(reissueList)) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", mailId);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), reissueList, 604800000L, 136, log);
      }
   }

   public void activityEnd(int oldActivityId) {
      this.sendDailyTaskReward();
      this.sendCollectReward();
      this.sendUltimateReward();
      this.sendChipReward();
      this.getDao().clear();
      this.clearActivityGift(24);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_FA_QIU);
   }

   private void sendCollectReward() {
      int activityOpenDay = this.getActivityOpenDay();
      FaQiuDao faQiuDao = this.getDao();
      Map<Integer, FaQiuCollectRewardModel> map = ApplicationContextProvider.<Integer, FaQiuCollectRewardModel>getModelPoolMap("FaQiuCollectReward");
      ArrayList<ResourceModel> reissueList = new ArrayList();

      for(FaQiuCollectRewardModel model : map.values()) {
         if (model.dayInRange(activityOpenDay) && !faQiuDao.collectRewards.contains(model.getId()) && faQiuDao.openChips.containsAll(model.getGridId())) {
            ResourceModel.addResourceToList(reissueList, model.getReward());
         }
      }

      this.sendReissueMail(CentreAwardModel.TYPE_COLLECT_REWARD, reissueList, 13606);
   }

   private void sendUltimateReward() {
      FaQiuDao faQiuDao = this.getDao();
      if (!faQiuDao.finalReward) {
         Map<Integer, FaQiuMapFragmentModel> gridMap = ApplicationContextProvider.<Integer, FaQiuMapFragmentModel>getModelPoolMap("FaQiuMapFragment");
         List<Integer> gridList = (List)gridMap.values().stream().map(FaQiuMapFragmentModel::getId).collect(Collectors.toList());
         if (faQiuDao.openChips.containsAll(gridList)) {
            int activityOpenDay = this.getActivityOpenDay();
            Map<Integer, FaQiuGetLastRewardModel> map = ApplicationContextProvider.<Integer, FaQiuGetLastRewardModel>getModelPoolMap("FaQiuLastReward");
            map.values().stream().filter((m) -> m.dayInRange(activityOpenDay)).min(Comparator.comparing(FaQiuGetLastRewardModel::getId)).ifPresent((rewardModel) -> this.sendReissueMail(CentreAwardModel.TYPE_ULTIMATE_REWARD, Collections.singletonList(rewardModel.getReward()), 13607));
         }
      }
   }

   private void sendChipReward() {
      Map<Integer, FaQiuLotteryCostModel> map = ApplicationContextProvider.<Integer, FaQiuLotteryCostModel>getModelPoolMap("FaQiuLotteryCost");
      Optional<FaQiuLotteryCostModel> any = map.values().stream().findAny();
      if (any.isPresent()) {
         ResourceModel cost = ((FaQiuLotteryCostModel)any.get()).getCost();
         long num = this.player.getResourceNum(cost.getType(), cost.getId());
         if (num > 0L) {
            this.player.delResourceAllNum(cost.getType(), cost.getId(), 136, 13610, 0, 0, "");
            ResourceModel model = new ResourceModel(2, 1003, (int)num);
            this.sendReissueMail(CentreAwardModel.TYPE_DRAW_CHIP, Collections.singletonList(model), 13608);
         }
      }

   }

   public int getActivityType() {
      return 97;
   }

   public void gmOp(String order) {
      FaQiuDao faQiuDao = this.getDao();
      String[] split = order.split(",");
      switch (split[0]) {
         case "t1":
            FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
            faQiuTaskPart.sendTaskList();
            break;
         case "t2":
            this.C2S_FaQiuCommitTask_23603(FaQiuMsg.C2S_FaQiuCommitTask_23603.newBuilder().setTaskId(Integer.parseInt(split[1])).build(), "");
            break;
         case "t3":
            this.C2S_FaQiuDraw_23605(FaQiuMsg.C2S_FaQiuDraw_23605.newBuilder().setId(Integer.parseInt(split[1])).build(), "");
            break;
         case "t4":
            this.C2S_FaQiuGetCollectReward_23607(FaQiuMsg.C2S_FaQiuGetCollectReward_23607.newBuilder().setRewardId(Integer.parseInt(split[1])).build(), "");
            break;
         case "t5":
            this.C2S_FaQiuGetUltimateReward_23609(FaQiuMsg.C2S_FaQiuGetUltimateReward_23609.newBuilder().setRewardId(Integer.parseInt(split[1])).build(), "");
            break;
         case "open":
            faQiuDao.openChips.add(Integer.parseInt(split[1]));
            faQiuDao.updateOp();
            break;
         case "pass":
            Map<Integer, FaQiuMapFragmentModel> gridMap = ApplicationContextProvider.<Integer, FaQiuMapFragmentModel>getModelPoolMap("FaQiuMapFragment");
            List<Integer> gridList = (List)gridMap.values().stream().map(FaQiuMapFragmentModel::getId).collect(Collectors.toList());
            faQiuDao.openChips.addAll(gridList);
            faQiuDao.updateOp();
            break;
         case "clear":
            faQiuDao.clear();
            FaQiuTaskPart faQiuTaskPart = (FaQiuTaskPart)this.player.getMgrPart(FaQiuTaskPart.class);
            faQiuTaskPart.getTasksMap().values().forEach(TaskData::delete);
            faQiuTaskPart.trigger();
      }

      this.C2S_FaQiuMain_23601((FaQiuMsg.C2S_FaQiuMain_23601)null, (String)null);
   }
}
