package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityNewWeekDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.NewWeekLevelModel;
import com.gzbz.model.NewWeekTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityNewWeekMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityNewWeekTaskPart;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
public class ActivityNewWeekPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;

   public ActivityNewWeekDao getDao() {
      return (ActivityNewWeekDao)this.player.getData("tb_activity_new_week", this.player.getPlayerId());
   }

   public void sendInfo() {
   }

   public int getActivityType() {
      return 111;
   }

   public void resetDaily() {
   }

   public void activityEnd(int oldActivityId) {
      this.clearTreasureData();
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(43);
      ActivityNewWeekTaskPart taskPart = (ActivityNewWeekTaskPart)this.player.getMgrPart(ActivityNewWeekTaskPart.class);
      taskPart.trigger();
   }

   public void sendTreasureInfo() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      ActivityNewWeekDao dao = this.getDao();
      ActivityNewWeekMsg.S2C_NewWeekInfo_25102.Builder builder = ActivityNewWeekMsg.S2C_NewWeekInfo_25102.newBuilder();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      builder.setLevel(dao.treasureLv);
      Map<Integer, Map<Integer, NewWeekTaskModel>> allTaskModel = ApplicationContextProvider.<Integer, Map<Integer, NewWeekTaskModel>>getModelPoolMap("cNewWeekTask");
      ActivityNewWeekTaskPart taskPart = (ActivityNewWeekTaskPart)this.player.getMgrPart(ActivityNewWeekTaskPart.class);
      Map<Integer, TaskData> taskDataMap = taskPart.getTasksMap();

      for(Map.Entry<Integer, TaskGroupData> entry : dao.treasureTaskGroup.entrySet()) {
         TaskGroupData taskGroupData = (TaskGroupData)entry.getValue();
         ActivityNewWeekMsg.NewWeekGroupDate.Builder groupDataMsg = ActivityNewWeekMsg.NewWeekGroupDate.newBuilder();
         groupDataMsg.setStepId((Integer)entry.getKey());
         groupDataMsg.setEndTime(taskGroupData.end);
         Map<Integer, NewWeekTaskModel> modelMap = (Map)allTaskModel.get(entry.getKey());

         for(TaskData taskData : taskDataMap.values()) {
            if (modelMap.containsKey(taskData.id)) {
               groupDataMsg.addTask(taskPart.buildTask(taskData));
            }
         }

         builder.addTaskGroupData(groupDataMsg);
      }

      this.player.sendMsg(builder.build());
   }

   private NewWeekLevelModel getTreasureLevelModel(int level) {
      Map<Integer, NewWeekLevelModel> modelMap = ApplicationContextProvider.<Integer, NewWeekLevelModel>getModelPoolMap("NewWeekLevel");
      TreeMap<Integer, NewWeekLevelModel> treeMap = new TreeMap(modelMap);
      NewWeekLevelModel lastModel = (NewWeekLevelModel)treeMap.lastEntry().getValue();
      return level > lastModel.getLv() ? lastModel : (NewWeekLevelModel)modelMap.get(level);
   }

   public boolean checkUpgrade(List<ResourceModel> resourceModels) {
      ActivityNewWeekDao dao = this.getDao();
      NewWeekLevelModel levelModel = this.getTreasureLevelModel(dao.treasureLv);
      int numLimit = 0;
      int materialId = ApplicationContextProvider.getConfigInt("GuJuanScore", 7402);
      int oriLevel = dao.treasureLv;

      while(this.player.checkResourceNum(2, materialId, levelModel.getNum())) {
         this.player.delResource(2, materialId, (long)levelModel.getNum(), 151, 15101, dao.treasureLv, 0, "");
         ++dao.treasureLv;
         levelModel = this.getTreasureLevelModel(dao.treasureLv);
         ++numLimit;
         if (numLimit > 10) {
            this.logger.error("新琉璃宝鉴一下提升了{}级，请检查是否逻辑出错了 playerId:{}", numLimit, this.player.getPlayerId());
            break;
         }
      }

      dao.updateOp();
      boolean isUpgrade = dao.treasureLv > oriLevel;
      if (dao.treasureLv > oriLevel) {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.levelRewardList(resourceModels, dao.treasureLv, oriLevel, playerDao.new_week_treasure > 0);
         this.updateTreasureData();
      }

      return isUpgrade;
   }

   private void levelRewardList(List<ResourceModel> rewardList, int level, int gotLv, boolean isPrivilege) {
      for(int i = gotLv + 1; i <= level; ++i) {
         this.levelReward(rewardList, i, isPrivilege);
      }

   }

   private void levelReward(List<ResourceModel> allRewardList, int level, boolean isPrivilege) {
      this.heroLvReward(allRewardList, level);
      if (isPrivilege) {
         this.marquisLvReward(allRewardList, level);
      }

   }

   private void heroLvReward(List<ResourceModel> allRewardList, int level) {
      NewWeekLevelModel levelModel = this.getTreasureLevelModel(level);

      for(ResourceModel resourceModel : levelModel.getRewards()) {
         resourceModel.addResourceToList(allRewardList);
      }

   }

   private void marquisLvReward(List<ResourceModel> allRewardList, int level) {
      NewWeekLevelModel levelModel = this.getTreasureLevelModel(level);

      for(ResourceModel resourceModel : levelModel.getLockRewards()) {
         resourceModel.addResourceToList(allRewardList);
      }

   }

   public void buyMarquis(List<ResourceModel> resourceModels) {
      this.logger.info("购买新典藏宝鉴 playerId:{}", this.player.getPlayerId());
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.new_week_treasure > 0) {
         this.logger.error("已经购买新典藏宝鉴 playerId:{}", this.player.getPlayerId());
      } else {
         int materialId = ApplicationContextProvider.getConfigInt("GuJuanScore", 7402);
         int addPoint = 0;
         if (resourceModels != null) {
            Iterator<ResourceModel> iterator = resourceModels.iterator();

            while(iterator.hasNext()) {
               ResourceModel resourceModel = (ResourceModel)iterator.next();
               if (resourceModel.getType() == 2 && resourceModel.getId() == materialId) {
                  addPoint += resourceModel.getValue();
                  iterator.remove();
               }
            }
         }

         if (addPoint > 0) {
            this.player.addResource(2, materialId, addPoint, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 151, 15102, 0, 0, "");
         }

         this.checkUpgrade(resourceModels);
         ActivityNewWeekDao dao = this.getDao();

         for(int level = dao.treasureLv; level > 0; --level) {
            this.marquisLvReward(resourceModels, level);
         }

         dao.updateOp();
         this.updateTreasureData();
      }
   }

   @MsgHandlerAnno
   public void C2S_NewWeekInfo_25101(ActivityNewWeekMsg.C2S_NewWeekInfo_25101 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendTreasureInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_NewWeekBuy_25106(ActivityNewWeekMsg.C2S_NewWeekBuy_25106 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.new_week_treasure <= 0) {
            this.player.failure(0);
         } else {
            ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
            if (activityInfo != null) {
               if (DateUtil.isSameDay(System.currentTimeMillis(), (long)activityInfo.end * 1000L)) {
                  int type = msg.getType();
                  int count = msg.getCount();
                  if (count <= 0) {
                     this.player.failure(4);
                  } else {
                     List<ResourceModel> resourceModels = new ArrayList();
                     ActivityNewWeekDao dao = this.getDao();
                     int baoJianBuyMax = ApplicationContextProvider.getConfigInt("BaojianBuyMax", 40);
                     if (dao.treasureLv >= baoJianBuyMax) {
                        this.logger.info("新琉璃宝鉴已达到购买等级上限 playerId:{}", this.player.getPlayerId());
                     } else {
                        boolean isUpgrade = false;
                        List<ResourceModel> showResourceList = new ArrayList();
                        int oriLevel = dao.treasureLv;
                        int reason;
                        if (type == 1) {
                           if (oriLevel + count > baoJianBuyMax) {
                              this.logger.info("新琉璃宝鉴购买等级后超过上限 playerId:{}", this.player.getPlayerId());
                              return;
                           }

                           String[] costArr = ApplicationContextProvider.getConfigString("BaojianPayLv", "").split("\\|");
                           ResourceModel needResource = new ResourceModel(Integer.parseInt(costArr[0]), Integer.parseInt(costArr[1]), Integer.parseInt(costArr[2]) * count);
                           if (!this.player.checkResourceNum(needResource)) {
                              this.player.failure(31);
                              return;
                           }

                           this.player.delResource(needResource, 151, 15103, type, count, "");
                           dao.treasureLv += count;
                           dao.updateOp();
                           this.levelRewardList(resourceModels, dao.treasureLv, oriLevel, true);
                           reason = 15103;
                           isUpgrade = true;
                        } else {
                           if (type != 2) {
                              return;
                           }

                           String[] costArr = ApplicationContextProvider.getConfigString("BaojianPayIntegral", "").split(":");
                           int onceLimit = ApplicationContextProvider.getConfigInt("BaojianOncelimit", 1000);
                           if (Integer.parseInt(costArr[0]) * count > onceLimit) {
                              this.player.failure(25);
                              return;
                           }

                           ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(costArr[1]) * count);
                           if (!this.player.checkResourceNum(needResource)) {
                              this.player.failure(31);
                              return;
                           }

                           this.player.delResource(needResource, 151, 15104, type, count, "");
                           int materialId = ApplicationContextProvider.getConfigInt("GuJuanScore", 7402);
                           showResourceList.add(new ResourceModel(2, materialId, Integer.parseInt(costArr[0]) * count));
                           this.player.addResource(showResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 151, 15104, type, count, "");
                           isUpgrade = this.checkUpgrade(resourceModels);
                           reason = 15104;
                        }

                        if (isUpgrade) {
                           this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_NEW_WEEK, 151, reason, oriLevel, dao.treasureLv, "");
                        } else {
                           this.player.addResourceMsg(showResourceList);
                           this.player.sendResourceMsg();
                        }

                        ActivityNewWeekMsg.S2C_NewWeekBuy_25107.Builder builder = ActivityNewWeekMsg.S2C_NewWeekBuy_25107.newBuilder();
                        builder.setType(type);
                        builder.setCount(count);
                        builder.setLevel(dao.treasureLv);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   private void updateTreasureData() {
      ActivityNewWeekDao dao = this.getDao();
      ActivityNewWeekMsg.S2C_NewWeekUpdate_25108.Builder builder = ActivityNewWeekMsg.S2C_NewWeekUpdate_25108.newBuilder();
      builder.setLevel(dao.treasureLv);
      this.player.sendMsg(builder.build());
   }

   private void clearTreasureData() {
      List<ResourceModel> resourceModels = new ArrayList();
      ActivityNewWeekDao dao = this.getDao();
      dao.treasureLv = 0;
      ActivityNewWeekTaskPart taskPart = (ActivityNewWeekTaskPart)this.player.getMgrPart(ActivityNewWeekTaskPart.class);

      for(TaskData taskData : taskPart.getTasksMap().values()) {
         if (taskData.state >= 2) {
            NewWeekTaskModel taskModel = (NewWeekTaskModel)ApplicationContextProvider.getModelPool().getEntity("NewWeekTask", taskData.id);
            if (taskModel != null) {
               for(ResourceModel reward : taskModel.getRewards()) {
                  ResourceModel.addResourceToList(resourceModels, reward);
               }
            }
         }
      }

      dao.treasureTaskGroup.clear();
      dao.updateOp();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.new_week_treasure > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_NEW_WEEK_TREASURE, (long)playerDao.new_week_treasure, 151, 910, 0, 0, "");
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         giftPart.clearGifts(43);
      }

      taskPart.deleteTasks();
      int materialId = ApplicationContextProvider.getConfigInt("GuJuanScore", 7402);
      if (resourceModels.size() > 0) {
         resourceModels.removeIf((resourceModel) -> resourceModel.getType() == 2 && resourceModel.getId() == materialId);
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.ID_FIRST_YEAR_TREASUTE_MAIL);
         if (resourceModels.size() > 0 && null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 151, 15107);
         }
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int itemNum = itemBagPart.getItemNum(materialId);
      if (itemNum > 0) {
         this.player.delResource(2, materialId, (long)itemNum, 151, 910, 0, 0, "");
      }

   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      Map<Integer, NewWeekLevelModel> modelPoolMap = ApplicationContextProvider.<Integer, NewWeekLevelModel>getModelPoolMap("NewWeekLevel");
      List<NewWeekLevelModel> collect = (List)modelPoolMap.values().stream().sorted(Comparator.comparingInt(NewWeekLevelModel::getLv)).collect(Collectors.toList());
      if (!CollectionUtils.isEmpty(collect)) {
         collect.remove(collect.size() - 1);
         if (!CollectionUtils.isEmpty(collect)) {
            NewWeekLevelModel lastModel = (NewWeekLevelModel)collect.get(collect.size() - 1);
            ActivityNewWeekDao dao = this.getDao();
            ArrayList<ResourceModel> resourceModels = new ArrayList();
            PlayerDao playerDao = this.player.getPlayerDao();
            this.levelRewardList(resourceModels, lastModel.getLv(), dao.treasureLv, playerDao.new_week_treasure > 0);
            dao.treasureLv = lastModel.getLv();
            dao.updateOp();
            if (!CollectionUtils.isEmpty(resourceModels)) {
               this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, resourceModels);
            }

            this.clearTreasureData();
            ActivityNewWeekTaskPart taskPart = (ActivityNewWeekTaskPart)this.player.getMgrPart(ActivityNewWeekTaskPart.class);
            taskPart.trigger();
         }
      }
   }

   public void gmTest(String order) {
      ActivityNewWeekDao dao = this.getDao();
      ActivityNewWeekTaskPart part = (ActivityNewWeekTaskPart)this.player.getMgrPart(ActivityNewWeekTaskPart.class);
      String[] split = order.split(",");
      switch (split[0]) {
         case "removetasks":
            this.logger.info("周年庆活动 - 移除任务数据 playerId:{}", this.player.getPlayerId());
            dao.treasureTaskGroup.clear();
            dao.updateOp();

            for(TaskData taskData : part.getTasksMap().values()) {
               taskData.delete();
            }
            break;
         case "level":
            dao.treasureLv = Integer.parseInt(split[1]);
            dao.updateOp();
            this.sendTreasureInfo();
            break;
         case "clean":
            this.clearTreasureData();
            break;
         default:
            this.player.failure(0);
            return;
      }

      this.player.failure(1);
   }
}
