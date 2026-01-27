package com.gzbz.mergeActivity;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.MergeActivityData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.HefuRushRankModel;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Map;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class MergeActivityMgr extends GameMgr {
   private final Logger logger = LoggerFactory.getLogger(ActivityMgr.class);
   @Autowired
   private WorldMgr worldMgr;

   protected void init() {
   }

   public void _mainServerMergeBegin() throws Exception {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      if (((MergeActivityData)worldDao.jsonData).isOpening) {
         this.logger.warn("_mainServerMergeBegin 合服活动尚未关闭, 强制关闭");
         ((MergeActivityData)worldDao.jsonData).isOpening = false;
         worldDao.updateOp();
         this.mergeActivityEnd();
      }

   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      long mergeServerTime = this.worldMgr.getMergeServerTime();
      int mergeActivityOpenDays = ApplicationContextProvider.getConfigInt("mergeActivityOpenDays", 7);
      if (mergeActivityOpenDays <= 0) {
         throw new Exception("_mainServerMergeFinish 初始化合服活动错误 合服活动开启天数不能小于等于0");
      } else {
         WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
         if (!((MergeActivityData)worldDao.jsonData).isOpening) {
            long endTime = DateUtil.getSomeDayBeginTime(mergeServerTime) + (long)mergeActivityOpenDays * 86400000L - 1L;
            if (System.currentTimeMillis() < endTime) {
               ((MergeActivityData)worldDao.jsonData).isOpening = true;
               ((MergeActivityData)worldDao.jsonData).mergeActivityOpenTime = DateUtil.getSomeDayBeginTime(mergeServerTime);
               ((MergeActivityData)worldDao.jsonData).mergeActivityEndTime = DateUtil.getSomeDayBeginTime(mergeServerTime) + (long)mergeActivityOpenDays * 86400000L - 1L;
               ((MergeActivityData)worldDao.jsonData).rushRankId = this.getNowRankModelId();
               worldDao.updateOp();
               this.mergeActivityOpen();
            } else {
               this.logger.warn("_mainServerMergeFinish 错误的合服时间 合服活动无法正常开启 mergeServerTime: {}", DateUtil.transferLongToDate(mergeServerTime));
            }
         } else {
            this.logger.warn("_mainServerMergeFinish 合服活动尚在开启");
         }

      }
   }

   @TaskMethod
   public void dailyReset() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      if (((MergeActivityData)worldDao.jsonData).isOpening) {
         long curTime = System.currentTimeMillis();
         if (curTime >= ((MergeActivityData)worldDao.jsonData).mergeActivityEndTime) {
            ((MergeActivityData)worldDao.jsonData).isOpening = false;
            ((MergeActivityData)worldDao.jsonData).rushRankId = 0;
            worldDao.updateOp();
            this.mergeActivityEnd();
         }

         this.checkRushRankChange();
      }

   }

   void mergeActivityOpen() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      this.logger.info("合服活动开启 结束时间: {}", DateUtil.transferLongToDate(((MergeActivityData)worldDao.jsonData).mergeActivityEndTime));
   }

   void mergeActivityEnd() {
      this.logger.info("合服活动结束");
   }

   public boolean isMergeActivityOpening() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      return ((MergeActivityData)worldDao.jsonData).isOpening;
   }

   public boolean isInMergeActivityOpenTime(long time) {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      return time >= ((MergeActivityData)worldDao.jsonData).mergeActivityOpenTime && time < ((MergeActivityData)worldDao.jsonData).mergeActivityEndTime;
   }

   public long getMergeActivityOpenTime() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      return ((MergeActivityData)worldDao.jsonData).mergeActivityOpenTime;
   }

   public long getMergeActivityEndTime() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      return ((MergeActivityData)worldDao.jsonData).mergeActivityEndTime;
   }

   public int getMergeActivityOpenDays() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      return ((MergeActivityData)worldDao.jsonData).isOpening ? DateUtil.difftimeDay(new Timestamp(((MergeActivityData)worldDao.jsonData).mergeActivityOpenTime)) + 1 : 0;
   }

   public boolean checkSubMergeActivityOpen(int mergeSubActivityType) {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", mergeSubActivityType);
      if (null != activityRuleModel && activityRuleModel.getOpenType() == 7 && activityRuleModel.getOpenTime() >= 0 && activityRuleModel.getDuration() > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         long subActivityOpenTime = worldMgr.getMergeServerTime() + (long)activityRuleModel.getOpenTime() * 86400000L;
         long subActivityEndTime = subActivityOpenTime + (long)(activityRuleModel.getDuration() * 1000);
         long currentTime = System.currentTimeMillis();
         return currentTime >= subActivityOpenTime && currentTime < subActivityEndTime;
      } else {
         return false;
      }
   }

   public void checkRushRankChange() {
      WorldDao<MergeActivityData> worldDao = this.worldMgr.<MergeActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      if (((MergeActivityData)worldDao.jsonData).isOpening) {
         int dataRushRankId = ((MergeActivityData)worldDao.jsonData).rushRankId;
         int nowRankModelId = this.getNowRankModelId();
         if (dataRushRankId != nowRankModelId) {
            HefuRushRankModel rushRankModel = (HefuRushRankModel)ApplicationContextProvider.getModelPoolEntity("HefuRushRank", dataRushRankId);
            RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
            if (dataRushRankId == 1) {
               rankMgr.grantRankAward(rushRankModel.getCentreType(), RankDefine.RankModule.RECRUIT_RUSH, 93, 9306);
               rankMgr.removeRanks(RankDefine.RankModule.RECRUIT_RUSH);
            } else if (dataRushRankId == 2) {
               rankMgr.grantRankAward(rushRankModel.getCentreType(), RankDefine.RankModule.RECRUITMENT_RUSH, 93, 9307);
               rankMgr.removeRanks(RankDefine.RankModule.RECRUITMENT_RUSH);
            } else if (dataRushRankId == 3) {
               rankMgr.grantRankAward(rushRankModel.getCentreType(), RankDefine.RankModule.STONE_RUSH, 93, 9308);
               rankMgr.removeRanks(RankDefine.RankModule.STONE_RUSH);
            }

            ((MergeActivityData)worldDao.jsonData).rushRankId = nowRankModelId;
            worldDao.updateOp();
         }
      }
   }

   public int getNowRankModelId() {
      HefuRushRankModel nowRankModel = this.getNowRankModel();
      return nowRankModel == null ? 0 : nowRankModel.getId();
   }

   public HefuRushRankModel getNowRankModel() {
      int severActivityDay = this.getSeverActivityDay(8001);
      Map<Integer, HefuRushRankModel> rankModelMap = ApplicationContextProvider.<Integer, HefuRushRankModel>getModelPoolMap("HefuRushRank");

      for(Map.Entry<Integer, HefuRushRankModel> entry : rankModelMap.entrySet()) {
         HefuRushRankModel value = (HefuRushRankModel)entry.getValue();
         if (severActivityDay >= value.getStartDay() && severActivityDay <= value.getEndDay()) {
            return value;
         }
      }

      return null;
   }

   public int getSeverActivityDay(int mergeSubActivityType) {
      return DateUtil.difftimeDay(new Timestamp(this.getSubActivityOpenTime(mergeSubActivityType))) + 1;
   }

   public long getSubActivityOpenTime(int mergeSubActivityType) {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", mergeSubActivityType);
      if (null != activityRuleModel && activityRuleModel.getOpenType() == 7 && activityRuleModel.getOpenTime() >= 0 && activityRuleModel.getDuration() > 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         long mergeServerBeginTime = DateUtil.getSomeDayBeginTime(worldMgr.getMergeServerTime());
         return mergeServerBeginTime + (long)activityRuleModel.getOpenTime() * 86400000L;
      } else {
         return 0L;
      }
   }
}
