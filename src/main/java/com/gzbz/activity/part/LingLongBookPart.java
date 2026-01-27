package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.LingLongBookDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LingLongBookLevelModel;
import com.gzbz.model.LingLongBookTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.LingLongBookMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.LingLongBookTaskPart;
import java.util.ArrayList;
import java.util.Iterator;
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
public class LingLongBookPart extends AbstractActivityPart {
   public void sendInfo() {
   }

   public LingLongBookDao getDao() {
      return (LingLongBookDao)this.player.getData("tb_ling_long_book", this.player.getPlayerId());
   }

   public int getActivityType() {
      return 116;
   }

   public void rotateReset(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LING_LONG_BOOK);
      LingLongBookTaskPart lingLongBookTaskPart = (LingLongBookTaskPart)this.player.getMgrPart(LingLongBookTaskPart.class);
      lingLongBookTaskPart.trigger();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(61, 0);
   }

   public void activityEnd(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LING_LONG_BOOK);
      this.clearLingLongBookData();
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            if (!this.inServerActDropTime()) {
               TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
               taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LING_LONG_BOOK);
            } else {
               LingLongBookTaskPart lingLongBookTaskPart = (LingLongBookTaskPart)this.player.getMgrPart(LingLongBookTaskPart.class);
               lingLongBookTaskPart.trigger();
            }
         }
      }
   }

   public void loginHandle() {
   }

   @MsgHandlerAnno
   public void C2S_LingLongBookTaskInfo_28971(LingLongBookMsg.C2S_LingLongBookTaskInfo_28971 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendLingLongBookInfo();
      }
   }

   private void clearLingLongBookData() {
      List<ResourceModel> resourceModels = new ArrayList();
      LingLongBookDao dao = this.getDao();
      dao.level = 0;
      LingLongBookTaskPart lingLongBookTaskPart = (LingLongBookTaskPart)this.player.getMgrPart(LingLongBookTaskPart.class);

      for(TaskData taskData : lingLongBookTaskPart.getTasksMap().values()) {
         if (taskData.state >= 2) {
            LingLongBookTaskModel taskModel = (LingLongBookTaskModel)ApplicationContextProvider.getModelPool().getEntity("LingLongBaojianTask", taskData.id);
            if (taskModel != null) {
               for(ResourceModel reward : taskModel.getRewards()) {
                  ResourceModel.addResourceToList(resourceModels, reward);
               }
            }
         }
      }

      dao.taskGroup.clear();
      dao.updateOp();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.lingLongBook > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_LING_LONG_BOOK, (long)playerDao.lingLongBook, 160, 910, 0, 0, "");
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         giftPart.clearGifts(46);
      }

      lingLongBookTaskPart.deleteTasks();
      int materialId = ApplicationContextProvider.getConfigInt("LingLongBaojianScore", 7516);
      if (resourceModels.size() > 0) {
         resourceModels.removeIf((resourceModel) -> resourceModel.getType() == 2 && resourceModel.getId() == materialId);
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.ID_LING_LONG_BOOK_FORGOT);
         if (resourceModels.size() > 0 && null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 160, 16007);
         }
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int itemNum = itemBagPart.getItemNum(materialId);
      if (itemNum > 0) {
         this.player.delResource(2, materialId, (long)itemNum, 160, 910, 0, 0, "");
      }

   }

   public void sendLingLongBookInfo() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      LingLongBookDao dao = this.getDao();
      LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.Builder builder = LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.newBuilder();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      builder.setLevel(dao.level);
      Map<Integer, Map<Integer, LingLongBookTaskModel>> allTaskModel = ApplicationContextProvider.<Integer, Map<Integer, LingLongBookTaskModel>>getModelPoolMap("customLingLongBookTask");
      LingLongBookTaskPart taskPart = (LingLongBookTaskPart)this.player.getMgrPart(LingLongBookTaskPart.class);
      Map<Integer, TaskData> taskDataMap = taskPart.getTasksMap();

      for(Map.Entry<Integer, TaskGroupData> entry : dao.taskGroup.entrySet()) {
         TaskGroupData taskGroupData = (TaskGroupData)entry.getValue();
         LingLongBookMsg.LingLongBookTaskGroupDate.Builder groupDataMsg = LingLongBookMsg.LingLongBookTaskGroupDate.newBuilder();
         groupDataMsg.setStepId((Integer)entry.getKey());
         groupDataMsg.setEndTime(taskGroupData.end);
         Map<Integer, LingLongBookTaskModel> modelMap = (Map)allTaskModel.get(entry.getKey());

         for(TaskData taskData : taskDataMap.values()) {
            if (modelMap.containsKey(taskData.id)) {
               groupDataMsg.addTask(taskPart.buildTask(taskData));
            }
         }

         builder.addTaskGroupData(groupDataMsg);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LingLongBookBuy_28975(LingLongBookMsg.C2S_LingLongBookBuy_28975 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (playerDao.lingLongBook <= 0) {
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
                     LingLongBookDao dao = this.getDao();
                     int baoJianBuyMax = ApplicationContextProvider.getConfigInt("LingLongBaojianBuyMax", 40);
                     if (dao.level >= baoJianBuyMax) {
                        this.logger.info("玲珑宝典已达到购买等级上限 playerId:{}", this.player.getPlayerId());
                     } else {
                        boolean isUpgrade = false;
                        List<ResourceModel> showResourceList = new ArrayList();
                        int oldLevel = dao.level;
                        int reason;
                        if (type == 1) {
                           if (oldLevel + count > baoJianBuyMax) {
                              this.logger.info("玲珑宝典购买等级后超过上限 playerId:{}", this.player.getPlayerId());
                              return;
                           }

                           String[] costArr = ApplicationContextProvider.getConfigString("LingLongBaojianPayLv", "").split("\\|");
                           ResourceModel needResource = new ResourceModel(Integer.parseInt(costArr[0]), Integer.parseInt(costArr[1]), Integer.parseInt(costArr[2]) * count);
                           if (!this.player.checkResourceNum(needResource)) {
                              this.player.failure(31);
                              return;
                           }

                           this.player.delResource(needResource, 160, 16003, type, count, "");
                           dao.level += count;
                           dao.updateOp();
                           this.levelRewardList(resourceModels, dao.level, oldLevel, true);
                           reason = 16003;
                           isUpgrade = true;
                        } else {
                           if (type != 2) {
                              return;
                           }

                           String[] costArr = ApplicationContextProvider.getConfigString("LingLongBaojianPayIntegral", "").split(":");
                           int onceLimit = ApplicationContextProvider.getConfigInt("LingLongBaojianOncelimit", 1000);
                           if (Integer.parseInt(costArr[0]) * count > onceLimit) {
                              this.player.failure(25);
                              return;
                           }

                           ResourceModel needResource = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(costArr[1]) * count);
                           if (!this.player.checkResourceNum(needResource)) {
                              this.player.failure(31);
                              return;
                           }

                           this.player.delResource(needResource, 160, 16004, type, count, "");
                           int materialId = ApplicationContextProvider.getConfigInt("LingLongBaojianScore", 7516);
                           showResourceList.add(new ResourceModel(2, materialId, Integer.parseInt(costArr[0]) * count));
                           this.player.addResource(showResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 160, 16004, type, count, "");
                           isUpgrade = this.checkUpgrade(resourceModels);
                           reason = 16004;
                        }

                        if (isUpgrade) {
                           this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_LING_LONG_BOOK_GIFT, 160, reason, oldLevel, dao.level, "");
                        } else {
                           this.player.addResourceMsg(showResourceList);
                           this.player.sendResourceMsg();
                        }

                        LingLongBookMsg.S2C_LingLongBookBuy_28976.Builder builder = LingLongBookMsg.S2C_LingLongBookBuy_28976.newBuilder();
                        builder.setType(type);
                        builder.setCount(count);
                        builder.setLevel(dao.level);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   public boolean checkUpgrade(List<ResourceModel> resourceModels) {
      LingLongBookDao dao = this.getDao();
      LingLongBookLevelModel levelModel = this.getLingLongBookLevelModel(dao.level);
      int numLimit = 0;
      int materialId = ApplicationContextProvider.getConfigInt("LingLongBaojianScore", 7516);
      int oldLevel = dao.level;

      while(this.player.checkResourceNum(2, materialId, levelModel.getNum())) {
         this.player.delResource(2, materialId, (long)levelModel.getNum(), 160, 16001, dao.level, 0, "");
         ++dao.level;
         levelModel = this.getLingLongBookLevelModel(dao.level);
         ++numLimit;
         if (numLimit > 10) {
            this.logger.error("玲珑宝典 一下提升了{}级，请检查是否逻辑出错了 playerId:{}", numLimit, this.player.getPlayerId());
            break;
         }
      }

      dao.updateOp();
      boolean isUpgrade = dao.level > oldLevel;
      if (dao.level > oldLevel) {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.levelRewardList(resourceModels, dao.level, oldLevel, playerDao.lingLongBook > 0);
         this.updateLingLongBookData();
      }

      return isUpgrade;
   }

   private LingLongBookLevelModel getLingLongBookLevelModel(int level) {
      Map<Integer, LingLongBookLevelModel> modelMap = ApplicationContextProvider.<Integer, LingLongBookLevelModel>getModelPoolMap("LingLongBaojianLevel");
      TreeMap<Integer, LingLongBookLevelModel> treeMap = new TreeMap(modelMap);
      LingLongBookLevelModel lastModel = (LingLongBookLevelModel)treeMap.lastEntry().getValue();
      return level > lastModel.getLv() ? lastModel : (LingLongBookLevelModel)modelMap.get(level);
   }

   private void updateLingLongBookData() {
      LingLongBookDao dao = this.getDao();
      LingLongBookMsg.S2C_LingLongBookUpdate_28977.Builder builder = LingLongBookMsg.S2C_LingLongBookUpdate_28977.newBuilder();
      builder.setLevel(dao.level);
      this.player.sendMsg(builder.build());
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
      LingLongBookLevelModel levelModel = this.getLingLongBookLevelModel(level);

      for(ResourceModel resourceModel : levelModel.getRewards()) {
         resourceModel.addResourceToList(allRewardList);
      }

   }

   private void marquisLvReward(List<ResourceModel> allRewardList, int level) {
      LingLongBookLevelModel levelModel = this.getLingLongBookLevelModel(level);

      for(ResourceModel resourceModel : levelModel.getLockRewards()) {
         resourceModel.addResourceToList(allRewardList);
      }

   }

   public void buyMarquis(List<ResourceModel> resourceModels) {
      this.logger.info("充值购买玲珑宝典 playerId:{}", this.player.getPlayerId());
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.lingLongBook > 0) {
         this.logger.error("已经购买玲珑宝典 playerId:{}", this.player.getPlayerId());
      } else {
         int materialId = ApplicationContextProvider.getConfigInt("LingLongBaojianScore", 7516);
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
            this.player.addResource(2, materialId, addPoint, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 910, 16002, 0, 0, "");
         }

         this.checkUpgrade(resourceModels);
         LingLongBookDao dao = this.getDao();

         for(int level = dao.level; level > 0; --level) {
            this.marquisLvReward(resourceModels, level);
         }

         dao.updateOp();
         this.updateLingLongBookData();
      }
   }
}
