package com.gzbz.activity;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.bean.BeautyTreasureRecord;
import com.gzbz.activity.bean.GmActivitySetting;
import com.gzbz.activity.part.AbstractActivityPart;
import com.gzbz.activity.part.ActivityPart;
import com.gzbz.activity.part.BroodPart;
import com.gzbz.activity.part.FlowerPart;
import com.gzbz.db.ActivityJoinDao;
import com.gzbz.db.ActivityLampRecordDao;
import com.gzbz.db.FlowerFireRecordDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.SpringFestivalBlessDao;
import com.gzbz.db.StarsActivityDrawServerDao;
import com.gzbz.db.SwimparkActivityDrawServerDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.db.worldBean.GameManagerData;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.gameDefine.ActivityDefine;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.ArtifactDressModel;
import com.gzbz.model.BeautyMainModel;
import com.gzbz.model.BroodRankRewardModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.PrizePoolModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityLampMsg;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.BeautyTreasureMsg;
import com.gzbz.protobuf.BeautyTreasureRotateMsg;
import com.gzbz.protobuf.BroodMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossActivityMsg;
import com.gzbz.protobuf.HuaJiaActMsg;
import com.gzbz.protobuf.KittyActivityMsg;
import com.gzbz.protobuf.NationalDayMsg;
import com.gzbz.protobuf.PrayMsg;
import com.gzbz.protobuf.QianKunLotteryMsg;
import com.gzbz.protobuf.QianKunTreasureMsg;
import com.gzbz.protobuf.SpringFestivalMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.protobuf.TongQueRotateMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldCup.WorldCupMgr;
import com.gzbz.worldMgr.GmMgr;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ScheduledFuture;
import misc.ComparatorUtil;
import misc.DataUtils;
import misc.DateUtil;
import misc.JsonUtil;
import misc.MapUtil;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.redisson.api.RMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@MgrAnno
@Component
@DependsOn({"worldMgr"})
public class ActivityMgr extends GameMgr {
   public static final Set<Integer> NEED_OFFLINE_HANDLE_ACTIVITY = new HashSet();
   private final Logger logger = LoggerFactory.getLogger(ActivityMgr.class);
   private final WorldMgr worldMgr;
   private final GameModelPool gameModelPool;
   private final OnLineMgr onLineMgr;
   private final RankMgr rankMgr;
   private final ConfigManager configManager;
   private final MailWorldMgr mailWorldMgr;
   private final CrossNettyClient crossNettyClient;
   private final Map<Integer, LinkedList<PrayRewardRecord>> prayRecordMap = new HashMap();
   private ScheduledFuture<?> offLinePlayerFuture;
   private final ConcurrentSkipListMap<Integer, Set<Integer>> offLinePlayerActivityMap = new ConcurrentSkipListMap();

   public ActivityMgr(WorldMgr worldMgr, GameModelPool gameModelPool, OnLineMgr onLineMgr, RankMgr rankMgr, ConfigManager configManager, MailWorldMgr mailWorldMgr, CrossNettyClient crossNettyClient) {
      this.worldMgr = worldMgr;
      this.gameModelPool = gameModelPool;
      this.onLineMgr = onLineMgr;
      this.rankMgr = rankMgr;
      this.configManager = configManager;
      this.mailWorldMgr = mailWorldMgr;
      this.crossNettyClient = crossNettyClient;
   }

   protected void init() {
   }

   public void initData() {
      this.checkRotate();
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

      for(Map.Entry<Integer, ActivityInfo> entry : ((ActivityData)worldDao.jsonData).timeRotates.entrySet()) {
         int activityType = (Integer)entry.getKey();
         ActivityInfo activityInfo = (ActivityInfo)entry.getValue();
         ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", activityType);
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         if (activityRuleModel != null && activityOpenTimeModel != null) {
            this.logger.info("全服活动【{}】-【{}({}中)】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{},当前第{}期", new Object[]{activityRuleModel.getName(), activityOpenTimeModel.getTips(), activityInfo.open ? "开启" : "关闭", DateUtil.transferLongToDate((long)activityInfo.start * 1000L), DateUtil.transferLongToDate((long)activityInfo.drop * 1000L), DateUtil.transferLongToDate((long)activityInfo.end * 1000L), DateUtil.transferLongToDate((long)activityInfo.nextTime(activityRuleModel) * 1000L), activityInfo.times});
         }
      }

      this.getSpringFestivalBlessMap();
      this.getLampRecordList();
      this.gameCachePool.getAllTableByList("tb_stars_activity_draw_server");
      this.gameCachePool.getAllTableByList("tb_swim_park_draw_server");
      this.gameCachePool.getAllTableByList("tb_flower_fire_record");
   }

   @TaskMethod
   public void dailyReset() {
      this.checkRotate();
      this.clearSpringFestivalBless();
   }

   private void clearSpringFestivalBless() {
      ActivityInfo activityInfo = this.getActivityInfo(14);
      if (activityInfo != null && activityInfo.id > 0 && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis()) && activityInfo.open) {
         TreeSet<Integer> recordIds = new TreeSet(this.getSpringFestivalBlessMap().keySet());
         if (!recordIds.isEmpty()) {
            if ((Integer)recordIds.last() > 1073741823) {
               this.gameCachePool.dropAndCreate("tb_spring_festival_bless");
            } else {
               this.gameCachePool.deleteAll("tb_spring_festival_bless");
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_ActivitySettle_13102(CrossActivityMsg.CR2S_ActivitySettle_13102 msg, CrossSubscribeMsg crossSubscribeMsg) {
      ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", msg.getActivityType());
      if (activityRuleModel == null) {
         this.logger.error("【{}】:收到跨服通知活动结算,找不到活动配置", msg.getActivityType());
      } else {
         this.logger.info("【{}】:收到跨服通知活动结算", activityRuleModel.getName());
         List<CrossActivityMsg.ActivityRank> activityRankList = msg.getActivityRankList();
         if (null != activityRankList && !activityRankList.isEmpty()) {
            switch (activityRuleModel.getActivityType()) {
               case 34:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_GUO_QING_POINT_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 125, 12510, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_GUO_QING_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 125, 12510, false);
                  }
                  break;
               case 56:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_FLOWER_FIRE_BATTLE_RANK_AWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 83, 8311, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_FLOWER_FIRE_BATTLE_RANK_AWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 83, 8311, false);
                  }
                  break;
               case 57:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_GREAT_CITY_POINT_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 82, 8211, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_GREAT_CITY_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 82, 8211, false);
                  }
                  break;
               case 75:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_LABOR_DAY_ARCHERY_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 98, 9810, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_LABOR_DAY_ARCHERY_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 98, 9810, false);
                  }
                  break;
               case 79:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_ZONG_QING_PICK_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 101, 10110, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_ZONG_QING_PICK_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 101, 10107, false);
                  }
                  break;
               case 91:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_FIRST_YEAR_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 126, 12639, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_FIRST_YEAR_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 126, 12639, false);
                  }
                  break;
               case 94:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_CHINESE_NEW_YEAR_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 131, 13010, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_CHINESE_NEW_YEAR_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 131, 13010, false);
                  }
                  break;
               case 101:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_GOLD_WEEK_POINT_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 140, 14010, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_GOLD_WEEK_POINT_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 140, 14010, false);
                  }
                  break;
               case 105:
                  for(CrossActivityMsg.ActivityRank activityRank : activityRankList) {
                     int rankType = activityRank.getRankType();
                     if (rankType == RankDefine.RankModule.ACTIVITY_SEND_FLOWER.id) {
                        this.activityRankSettle(CentreAwardModel.TYPE_ACT_SEND_FLOWER_RANK, activityRank.getRankList(), 145, 14507, false);
                     } else if (rankType == RankDefine.RankModule.ACTIVITY_GET_FLOWER.id) {
                        this.activityRankSettle(CentreAwardModel.TYPE_ACT_GET_FLOWER_RANK, activityRank.getRankList(), 145, 14508, false);
                     }
                  }
                  break;
               case 107:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_CHILD_PICK_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 148, 14810, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_CHILD_PICK_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 148, 14810, false);
                  }
                  break;
               case 113:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_SUMMER_FESTIVAL_ARCHERY_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 154, 15409, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_SUMMER_FESTIVAL_ARCHERY_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 154, 15409, false);
                  }
                  break;
               case 115:
                  if (msg.hasCrossChange() && msg.getCrossChange()) {
                     this.activityRankSettle(CentreAwardModel.TYPE_WINTER_FESTIVAL_ARCHERY_RANK_REWARD2, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 158, 15809, true);
                  } else {
                     this.activityRankSettle(CentreAwardModel.TYPE_WINTER_FESTIVAL_ARCHERY_RANK_REWARD, ((CrossActivityMsg.ActivityRank)activityRankList.get(0)).getRankList(), 158, 15809, false);
                  }
                  break;
               default:
                  this.logger.error("跨服活动结算:未知的活动类型");
            }

         } else {
            this.logger.error("【{}】:收到跨服通知活动结算，排行榜数据为空", msg.getActivityType());
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_FlowerRankInfo_13106(CrossActivityMsg.CR2S_FlowerRankInfo_13106 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<CrossActivityMsg.ActivityRank> activityRankList = msg.getActivityRankList();
      if (activityRankList != null && !activityRankList.isEmpty()) {
         for(CrossActivityMsg.ActivityRank rank : activityRankList) {
            this.sendFlowerRankMail(rank.getRankType(), rank.getRankList());
         }

      } else {
         this.logger.error("CR2S_FlowerRankInfo_13106 游戏服接收到的排行榜信息为空");
      }
   }

   public void sendFlowerRankMail(int rankModuleId, List<CrossActivityMsg.PlayerActRankInfo> rankList) {
      if (rankList != null && rankList.size() > 0) {
         int mailId;
         if (rankModuleId == RankDefine.RankModule.ACTIVITY_SEND_FLOWER.id) {
            mailId = CentreAwardModel.ID_SEND_FLOWER_RANK;
         } else {
            if (rankModuleId != RankDefine.RankModule.ACTIVITY_GET_FLOWER.id) {
               this.logger.error("sendFlowerRankMail方法异常，{}非鲜花榜排名类型", rankModuleId);
               return;
            }

            mailId = CentreAwardModel.ID_GET_FLOWER_RANK;
         }

         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", mailId);
         if (null == centreAwardModel) {
            this.logger.error("centreAward 配置缺失 id:{}", mailId);
         } else {
            int flowerRankNum = this.configManager.getIntDefault("flowerRankNum", 10);
            String flowerRankDesc = this.configManager.getStrByDefault("flowerRankDesc", "第{0}名，{1}，积分{2}");
            StringBuilder sb = new StringBuilder();
            int curFlowerRankNum = 0;

            for(CrossActivityMsg.PlayerActRankInfo rankInfo : rankList) {
               int rank = rankInfo.getRank();
               String playerName = rankInfo.getPlayerName();
               long score = rankInfo.getScore();
               String format = MessageFormat.format(flowerRankDesc, rank, playerName, score);
               sb.append(format);
               ++curFlowerRankNum;
               if (curFlowerRankNum >= flowerRankNum) {
                  break;
               }
            }

            String title = centreAwardModel.getTitle();
            String desc = MessageFormat.format(centreAwardModel.getDesc(), curFlowerRankNum, sb.toString());
            List<GamePlayer> allPlayer = this.worldMgr.getAllPlayer();
            Map<Integer, String> offlinePlayerMap = new HashMap();

            for(GamePlayer player : allPlayer) {
               if (player.isLogin()) {
                  MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
                  mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, title, desc, null, 604800000L, 145, 14509});
               } else {
                  offlinePlayerMap.put(player.getPlayerId(), "");
               }
            }

            if (offlinePlayerMap.size() > 0) {
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, title, desc, (List)null, offlinePlayerMap, 604800000L, 145, 14509, 0);
            }

         }
      } else {
         this.logger.error("sendFlowerRankMail 异常 rankList为空");
      }
   }

   @MsgHandlerAnno
   public void CR2S_NoticeCrossActOpenDay_13105(CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105 msg, String source) {
      ActivityInfo activityInfo = this.getActivityInfo(msg.getActivityType());
      if (null == activityInfo) {
         this.logger.error("CR2S_NoticeCrossActOpenDay_13105 异常，游戏服没有相关活动信息 activityType:{}", msg.getActivityType());
      } else {
         activityInfo.crossActOpenDay = msg.getCrossActOpenDay();
         this.updateActivityData();
         int crossActOpenDay = msg.getCrossActOpenDay();
         if (msg.getActivityType() == 105) {
            for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
               gamePlayer.pushPartTaskEx(FlowerPart.class, "noticeCrossActOpenDay", new Object[]{crossActOpenDay});
            }
         } else if (msg.getActivityType() == 108) {
            for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
               gamePlayer.pushPartTaskEx(BroodPart.class, "noticeCrossActOpenDay", new Object[0]);
            }
         }

      }
   }

   @TaskMethod
   public void addPrayRecord(int prayId, String playerName, ResourceModel resourceModel) {
      LinkedList<PrayRewardRecord> linkedList;
      if (this.prayRecordMap.containsKey(prayId)) {
         linkedList = (LinkedList)this.prayRecordMap.get(prayId);
      } else {
         linkedList = new LinkedList();
         this.prayRecordMap.put(prayId, linkedList);
      }

      PrayRewardRecord record = new PrayRewardRecord(playerName, resourceModel);
      linkedList.add(record);
      int maxRecord = this.configManager.getIntDefault("PrayRecordMaxNum", 10);
      if (linkedList.size() > maxRecord) {
         linkedList.pop();
      }

   }

   @TaskMethod
   public void sendPrayRecord(GamePlayer player, int prayId) {
      PrayMsg.S2C_PlayerAwardInfo_7510.Builder builder = PrayMsg.S2C_PlayerAwardInfo_7510.newBuilder();
      builder.setPrayId(prayId);
      if (this.prayRecordMap.containsKey(prayId)) {
         for(PrayRewardRecord record : this.prayRecordMap.get(prayId)) {
            PrayMsg.Pray_RecordData.Builder recordData = PrayMsg.Pray_RecordData.newBuilder();
            recordData.setPlayerName(record.playerName);
            CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
            itemInfo.setType(record.resourceModel.getType());
            itemInfo.setId(record.resourceModel.getId());
            itemInfo.setNum(record.resourceModel.getValue());
            recordData.setReward(itemInfo);
            builder.addData(recordData);
         }
      }

      player.sendMsg(builder.build());
   }

   public void checkRotate() {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      this.checkRotate((ActivityData)worldDao.jsonData);
      worldDao.updateOp();
   }

   private void checkRotate(ActivityData activityData) {
      long serverOpenTime = this.worldMgr.getOpenServerTime();
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      Map<Integer, ActivityRuleModel> activityRuleModelMap = ApplicationContextProvider.<Integer, ActivityRuleModel>getModelPoolMap("activityRule");
      Map<Integer, TreeMap<Integer, ActivityOpenTimeModel>> activityAllMap = this.gameModelPool.getMap("customActivityOpenTime");
      Set<Integer> activityTypeSet = new HashSet(activityData.timeRotates.keySet());
      Map<Integer, Integer> activitySameGroupMap = new HashMap();

      for(int activityType : activityTypeSet) {
         ActivityInfo activityInfo = (ActivityInfo)activityData.timeRotates.get(activityType);
         ActivityRuleModel activityRuleModel = (ActivityRuleModel)activityRuleModelMap.get(activityType);
         if (activityRuleModel == null) {
            this.logger.error("活动【{}】的活动类型【{}】配置不存在,移除活动", activityInfo.id, activityType);
            activityData.timeRotates.remove(activityType);
         } else if (activityAllMap.containsKey(activityType) && ((TreeMap)activityAllMap.get(activityType)).containsKey(activityInfo.id)) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)((TreeMap)activityAllMap.get(activityType)).get(activityInfo.id);
            if (activityOpenTimeModel.getSameTypeActivity() > 0 && activityInfo.end > curTime && activityInfo.open) {
               activitySameGroupMap.put(activityOpenTimeModel.getSameTypeActivity(), activityInfo.id);
            }
         } else {
            this.logger.error("活动【{}】配置不存在,移除活动", activityInfo.id);
            activityData.timeRotates.remove(activityType);
         }
      }

      WorldDao<GameManagerData> gmWorldDao = this.worldMgr.<GameManagerData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GAME_MANAGER);

      for(ActivityRuleModel activityRuleModel : activityRuleModelMap.values()) {
         try {
            int activityType = activityRuleModel.getActivityType();
            if (activityRuleModel.getOpenTime() >= 0 && activityRuleModel.getRotationRule() == 2) {
               TreeMap<Integer, ActivityOpenTimeModel> activityOpenTimeModelMap = (TreeMap)MapUtil.getOrDefault(activityAllMap, activityType, TreeMap.class);
               if (activityOpenTimeModelMap != null && !activityOpenTimeModelMap.isEmpty()) {
                  Map<Integer, GmActivitySetting> gmActivitySettings = (Map)MapUtil.getOrDefault(((GameManagerData)gmWorldDao.jsonData).activities, activityType, HashMap.class);
                  ActivityInfo currentActivity = (ActivityInfo)activityData.timeRotates.get(activityType);
                  ActivityOpenTimeModel oldActivityModel = null;
                  if (currentActivity != null) {
                     oldActivityModel = (ActivityOpenTimeModel)activityOpenTimeModelMap.get(currentActivity.id);
                     if (oldActivityModel == null) {
                        activityData.timeRotates.remove(activityType);
                        currentActivity = null;
                     } else {
                        GmActivitySetting curGmSetting = (GmActivitySetting)gmActivitySettings.get(currentActivity.id);
                        boolean needClose = false;
                        if (currentActivity.gmOp) {
                           if (curGmSetting != null && curGmSetting.isClose()) {
                              needClose = true;
                           }
                        } else if (activityRuleModel.getOpenTime() < 0 || oldActivityModel.getIsClose() > 0) {
                           needClose = true;
                        }

                        if (needClose) {
                           if (!currentActivity.forceClose) {
                              this.logger.info("全服活动【{}】关闭", oldActivityModel.getTips());
                              this.activityClose(currentActivity, activityData);
                              this.pushTaskEx("activityEndSetJoinState", new Object[]{currentActivity.id});
                           }
                        } else {
                           if (currentActivity.dropping && currentActivity.drop <= curTime) {
                              this.logger.info("全服活动【{}】掉落结束", oldActivityModel.getTips());
                              this.activityDropEndAfterHandle(currentActivity, activityData);
                           }

                           if (currentActivity.open && currentActivity.end <= curTime) {
                              this.logger.info("全服活动【{}】结束", oldActivityModel.getTips());
                              this.activityEndAfterHandle(currentActivity, activityData);
                              this.pushTaskEx("activityEndSetJoinState", new Object[]{currentActivity.id});
                           }
                        }

                        if (currentActivity.open) {
                           continue;
                        }
                     }
                  }

                  if (DateUtil.checkTime(serverOpenTime, activityRuleModel.getOpenTime()) && !this.checkOpenTimeLimit(activityRuleModel.getName(), activityRuleModel.getLimitTime()) && this.checkDateStartLimit(activityRuleModel.getOpenTime(), activityRuleModel.getDuration(), activityRuleModel.getDateStartLimit(), activityRuleModel.getSysLimitTime())) {
                     List<ActivityOpenTimeModel> openActivityModels = new ArrayList();
                     this.openActivityList(activityOpenTimeModelMap, openActivityModels);
                     Collections.sort(openActivityModels, ComparatorUtil.createComparatorByMethod(ActivityOpenTimeModel.class, "getSort"));
                     int startTime = this.getStartTime(activityRuleModel, openActivityModels);
                     int endTime = startTime + activityRuleModel.getDuration() - 1;
                     boolean gmOp = false;
                     GmActivitySetting gmOpenActivitySetting = this.getOpenActSetting(gmActivitySettings);
                     if (gmOpenActivitySetting != null) {
                        if (curTime >= endTime) {
                           startTime = gmOpenActivitySetting.getStart();
                           endTime = gmOpenActivitySetting.getEnd();
                           openActivityModels.clear();
                           openActivityModels.add(activityOpenTimeModelMap.get(gmOpenActivitySetting.getId()));
                           gmOp = true;
                        } else if (gmOpenActivitySetting.getStart() <= endTime && gmOpenActivitySetting.getEnd() >= startTime) {
                           startTime = gmOpenActivitySetting.getStart();
                           endTime = gmOpenActivitySetting.getEnd();
                           openActivityModels.clear();
                           openActivityModels.add(activityOpenTimeModelMap.get(gmOpenActivitySetting.getId()));
                           gmOp = true;
                        } else if (curTime < gmOpenActivitySetting.getEnd() && gmOpenActivitySetting.getStart() <= startTime) {
                           startTime = gmOpenActivitySetting.getStart();
                           endTime = gmOpenActivitySetting.getEnd();
                           openActivityModels.clear();
                           openActivityModels.add(activityOpenTimeModelMap.get(gmOpenActivitySetting.getId()));
                           gmOp = true;
                        } else {
                           this.filterActivity(openActivityModels, gmActivitySettings, startTime, endTime);
                        }
                     } else {
                        this.filterActivity(openActivityModels, gmActivitySettings, startTime, endTime);
                     }

                     if (curTime >= startTime && curTime < endTime && !openActivityModels.isEmpty()) {
                        ActivityOpenTimeModel currentOpenActivityModel = null;
                        if (currentActivity == null) {
                           currentActivity = (ActivityInfo)MapUtil.computeIfAbsent(activityData.timeRotates, activityType, ActivityInfo.class);
                           currentOpenActivityModel = (ActivityOpenTimeModel)openActivityModels.get(0);
                        } else {
                           if (activityRuleModel.getRotateType() == 3) {
                              continue;
                           }

                           if (activityRuleModel.getRotateType() == 1 || activityRuleModel.getOpenType() == 3 || activityRuleModel.getOpenTimeType() == 1 && activityRuleModel.getRotateType() != 3) {
                              currentOpenActivityModel = (ActivityOpenTimeModel)openActivityModels.get(0);
                           }

                           for(ActivityOpenTimeModel activityOpenTimeModel : openActivityModels) {
                              if (activityOpenTimeModel.getSort() > oldActivityModel.getSort()) {
                                 currentOpenActivityModel = activityOpenTimeModel;
                                 break;
                              }
                           }
                        }

                        if (currentOpenActivityModel != null) {
                           WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
                           List<String> areaLimit = currentOpenActivityModel.getAreanLimit();
                           if (!CollectionUtils.isEmpty(areaLimit) && !areaLimit.contains(worldMgr.country)) {
                              String area = DataUtils.stringListToString(areaLimit);
                              this.logger.info("全服活动【{}】地区限制为【{}】，当前地区【{}】不符合开启条件！", new Object[]{currentOpenActivityModel.getTips(), area, worldMgr.country});
                           } else {
                              boolean hasSameActivity = activitySameGroupMap.containsKey(currentOpenActivityModel.getSameTypeActivity());
                              if (!hasSameActivity || currentActivity.id != currentOpenActivityModel.getActivityId() || currentActivity.start != startTime || currentActivity.end != endTime) {
                                 currentActivity.id = currentOpenActivityModel.getActivityId();
                                 currentActivity.start = startTime;
                                 currentActivity.end = endTime;
                                 if (gmOpenActivitySetting == null) {
                                    currentActivity.drop = currentActivity.start + activityRuleModel.getDropTime() - 1;
                                 } else {
                                    currentActivity.drop = currentActivity.end;
                                 }

                                 currentActivity.open = !hasSameActivity;
                                 currentActivity.dropping = !hasSameActivity;
                                 currentActivity.drop = currentActivity.drop < currentActivity.start ? currentActivity.end : currentActivity.drop;
                                 currentActivity.forceClose = false;
                                 currentActivity.gmOp = gmOp;
                                 if (hasSameActivity) {
                                    this.logger.info("全服活动【{}】已存在相同类型活动【{}】,不开启", currentOpenActivityModel.getTips(), activitySameGroupMap.get(currentOpenActivityModel.getSameTypeActivity()));
                                 } else {
                                    this.pushTaskEx("checkOfflineJob", new Object[]{currentOpenActivityModel.getActivityId()});
                                    ++currentActivity.times;
                                    if (oldActivityModel == null) {
                                       this.logger.info("开启新全服活动【{}】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{},当前第{}期", new Object[]{currentOpenActivityModel.getTips(), DateUtil.transferLongToDate((long)currentActivity.start * 1000L), DateUtil.transferLongToDate((long)currentActivity.drop * 1000L), DateUtil.transferLongToDate((long)currentActivity.end * 1000L), DateUtil.transferLongToDate((long)currentActivity.nextTime(activityRuleModel) * 1000L), currentActivity.times});
                                    } else {
                                       this.logger.info("全服活动【{}】轮换,开启活动【{}】,开始时间:{},掉落结束时间:{},活动结束时间:{},下一轮开启时间:{},当前第{}期", new Object[]{oldActivityModel.getTips(), currentOpenActivityModel.getTips(), DateUtil.transferLongToDate((long)currentActivity.start * 1000L), DateUtil.transferLongToDate((long)currentActivity.drop * 1000L), DateUtil.transferLongToDate((long)currentActivity.end * 1000L), DateUtil.transferLongToDate((long)currentActivity.nextTime(activityRuleModel) * 1000L), currentActivity.times});
                                    }

                                    if (currentOpenActivityModel.getSameTypeActivity() > 0) {
                                       activitySameGroupMap.put(currentOpenActivityModel.getSameTypeActivity(), currentActivity.id);
                                    }

                                    this.activityRotate(currentOpenActivityModel, activityData);
                                 }

                                 activityData.timeRotates.put(activityType, currentActivity);
                              }
                           }
                        } else {
                           this.logger.warn("检查:全服活动【{}】未找到符合条件的活动", activityRuleModel.getName());
                        }
                     } else {
                        this.logger.warn("检查:全服活动【{}】不满足开启条件,开启时间【{}】,结束时间【{}】,活动个数【{}】", new Object[]{activityRuleModel.getName(), DateUtil.transferLongToDate((long)startTime * 1000L), DateUtil.transferLongToDate((long)endTime * 1000L), openActivityModels.size()});
                     }
                  }
               } else {
                  activityData.timeRotates.remove(activityType);
                  this.logger.error("检查:找不到活动类型【{}】的活动配置", activityType);
               }
            } else {
               activityData.timeRotates.remove(activityType);
            }
         } catch (Exception e) {
            this.logger.error("活动类型:【{}】检查轮换出错,{}", new Object[]{activityRuleModel.getName(), e.getMessage(), e});
         }
      }

      this.pushTaskEx("activityEndOffLineHandle", new Object[0]);
   }

   public boolean checkDateStartLimit(int openTime, int duration, int dateStartLimit, String sysLimitTime) {
      if (dateStartLimit <= 0) {
         return true;
      } else {
         long actCanStarTime = DateUtil.getLongTime(sysLimitTime, "yyyy-MM-dd");
         long currentTimeMillis = System.currentTimeMillis();
         if (actCanStarTime > 0L && currentTimeMillis >= actCanStarTime) {
            long serverOpenTime = this.worldMgr.getOpenServerTime() <= 0L ? System.currentTimeMillis() : this.worldMgr.getOpenServerTime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(DateUtil.getSomeDayBeginTime(serverOpenTime));
            calendar.add(5, openTime);
            long firstOpenMillis = calendar.getTimeInMillis();
            long curDayBeginTime = DateUtil.getSomeDayBeginTime(currentTimeMillis);
            int durationDay = duration / 86400;
            int firstStarIntervalDay = (int)((curDayBeginTime - firstOpenMillis) / 86400000L);
            return firstStarIntervalDay >= 0 && firstStarIntervalDay % durationDay == 0;
         } else {
            return false;
         }
      }
   }

   @TaskMethod
   public void activityEndOffLineHandle() {
      Map<Integer, ActivityJoinDao> activityJoinDaoMap = this.getActivityJoinMap();

      for(int activityId : activityJoinDaoMap.keySet()) {
         ActivityJoinDao activityJoinDao = (ActivityJoinDao)activityJoinDaoMap.get(activityId);
         if (activityJoinDao != null && activityJoinDao.isEnd) {
            ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityJoinDao.activityId);
            if (activityOpenTimeModel == null) {
               this.gameCachePool.deleteDao(activityJoinDao, false);
            } else if (!NEED_OFFLINE_HANDLE_ACTIVITY.contains(activityOpenTimeModel.getActivityType())) {
               this.gameCachePool.deleteDao(activityJoinDao, false);
            } else {
               Iterator<Integer> iterator = activityJoinDao.players.iterator();

               while(iterator.hasNext()) {
                  int playerId = (Integer)iterator.next();
                  if (this.worldMgr.getPlayerMap().containsKey(playerId) && !this.worldMgr.getOnlinePlayerMap().containsKey(playerId)) {
                     ((Set)MapUtil.computeIfAbsent(this.offLinePlayerActivityMap, playerId, HashSet.class)).add(activityId);
                  } else {
                     iterator.remove();
                     activityJoinDao.updateOp();
                  }
               }

               if (activityJoinDao.players.isEmpty()) {
                  this.gameCachePool.deleteDao(activityJoinDao, false);
               } else {
                  this.logger.info("活动【{}】总共需要结算【{}】个玩家", activityOpenTimeModel.getTips(), activityJoinDao.players.size());
               }
            }
         }
      }

      if (this.offLinePlayerActivityMap.isEmpty()) {
         if (this.offLinePlayerFuture != null) {
            this.offLinePlayerFuture.cancel(false);
            this.offLinePlayerFuture = null;
         }
      } else if (this.offLinePlayerFuture == null) {
         int period = 1800000 / this.offLinePlayerActivityMap.size();
         if (period <= 0) {
            period = 100;
         }

         this.offLinePlayerFuture = this.scheduleEx(0L, (long)period, "activityEndOffLinePlayerHandle", new Object[0]);
      }
   }

   @TaskMethod
   public void activityEndOffLinePlayerHandle() {
      if (!this.offLinePlayerActivityMap.isEmpty() && WorldMgr.serverState.get() == 1) {
         Map<Integer, ActivityJoinDao> activityJoinDaoMap = this.getActivityJoinMap();
         int playerId = (Integer)this.offLinePlayerActivityMap.lastKey();
         Set<Integer> activities = (Set)this.offLinePlayerActivityMap.remove(playerId);
         Iterator<Integer> iterator = activities.iterator();

         while(iterator.hasNext()) {
            int activityId = (Integer)iterator.next();
            ActivityJoinDao activityJoinDao = (ActivityJoinDao)activityJoinDaoMap.get(activityId);
            if (activityJoinDao != null && activityJoinDao.players.contains(playerId) && activityJoinDao.isEnd) {
               activityJoinDao.players.remove(playerId);
               if (activityJoinDao.players.isEmpty()) {
                  this.gameCachePool.deleteDao(activityJoinDao, false);
               } else {
                  activityJoinDao.updateOp();
               }
            } else {
               iterator.remove();
            }
         }

         if (!activities.isEmpty()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            gamePlayer.pushPartTaskEx(ActivityPart.class, "activityEndOfflineHandle", new Object[]{activities});
         }

         if (this.offLinePlayerActivityMap.isEmpty() && this.offLinePlayerFuture != null) {
            this.offLinePlayerFuture.cancel(false);
            this.offLinePlayerFuture = null;
         }

      } else {
         if (this.offLinePlayerFuture != null) {
            this.offLinePlayerFuture.cancel(false);
            this.offLinePlayerFuture = null;
         }

      }
   }

   private void openActivityList(Map<Integer, ActivityOpenTimeModel> activityOpenTimeModelMap, List<ActivityOpenTimeModel> openActivityModels) {
      for(ActivityOpenTimeModel activityOpenTimeModel : activityOpenTimeModelMap.values()) {
         if (activityOpenTimeModel.getIsClose() == 0 && !this.checkOpenTimeLimit(activityOpenTimeModel.getTips(), activityOpenTimeModel.getLimitTime())) {
            openActivityModels.add(activityOpenTimeModel);
         }
      }

   }

   private void filterActivity(List<ActivityOpenTimeModel> openActivityModels, Map<Integer, GmActivitySetting> gmActivitySettings, int startTime, int endTime) {
      Iterator<ActivityOpenTimeModel> iterator = openActivityModels.iterator();

      while(iterator.hasNext()) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)iterator.next();
         if (gmActivitySettings.containsKey(activityOpenTimeModel.getActivityId())) {
            GmActivitySetting gmActivitySetting = (GmActivitySetting)gmActivitySettings.get(activityOpenTimeModel.getActivityId());
            if (gmActivitySetting.isClose() && startTime == gmActivitySetting.getStart() && endTime == gmActivitySetting.getEnd()) {
               iterator.remove();
            }
         }
      }

   }

   private GmActivitySetting getOpenActSetting(Map<Integer, GmActivitySetting> activitySettingMap) {
      List<GmActivitySetting> gmActivitySettingList = new ArrayList();

      for(GmActivitySetting gmActivitySetting : activitySettingMap.values()) {
         if (!gmActivitySetting.isClose()) {
            gmActivitySettingList.add(gmActivitySetting);
         }
      }

      if (gmActivitySettingList.isEmpty()) {
         return null;
      } else {
         gmActivitySettingList.sort(ComparatorUtil.createComparatorByMethod(GmActivitySetting.class, "getStart"));
         return (GmActivitySetting)gmActivitySettingList.get(0);
      }
   }

   public void activityFlush() {
      this.checkRotate();

      for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
         ActivityPart activityPart = (ActivityPart)gamePlayer.getMgrPart(ActivityPart.class);
         activityPart.pushTaskEx("timeRotateReset", new Object[]{false});
         GiftPart giftPart = (GiftPart)gamePlayer.getMgrPart(GiftPart.class);
         giftPart.pushTaskEx("sendGiftList", new Object[0]);
      }

   }

   public void checkLaborOpenServerRank(int hour) {
      ActivityInfo info = this.getActivityInfo(23);
      if (info != null && info.open) {
         int reason = 4402;
         int limitRank = this.configManager.getIntDefault("rankMemberNum", 100);
         String endTime = "7|9";
         endTime = this.configManager.getStrByDefault("recruitRankEndTime", "7|9");
         if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
            int startTime = info.start;
            int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
            if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
               int commonScore = this.configManager.getIntDefault("recruitAwardCondition", 10);
               int limitScore = this.configManager.getIntDefault("recruitRankCondition", 10);
               this.rankMgr.sendOpenServerRankAward(54, 55, RankDefine.RankModule.OPEN_SERVER_ASSEMBLE, 31, reason, limitScore, commonScore, limitRank);
            }
         }

      }
   }

   @TaskMethod
   public void checkOpenServerRank(int hour) {
      ActivityInfo info = this.getActivityInfo(16);
      if (info != null && info.open) {
         int reason = 4402;
         int limitRank = this.configManager.getIntDefault("rankMemberNum", 100);
         String endTime = "7|9";
         if (info.id == 3001) {
            endTime = this.configManager.getStrByDefault("employeeRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("employeeAwardCondition", 10);
                  int limitScore = this.configManager.getIntDefault("employeeRankCondition", 10);
                  this.rankMgr.sendOpenServerRankAward(35, 40, RankDefine.RankModule.OPEN_SERVER_RECRUIT, 30, reason, limitScore, commonScore, limitRank);
               }
            }

            endTime = this.configManager.getStrByDefault("levelRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("levelAwardCondition", 20);
                  int limitScore = this.configManager.getIntDefault("levelRankCondition", 20);
                  this.rankMgr.sendOpenServerRankAward(34, 39, RankDefine.RankModule.OPEN_SERVER_LEV, 29, reason, limitScore, commonScore, limitRank);
               }
            }
         } else if (info.id == 3003) {
            endTime = this.configManager.getStrByDefault("recruitRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("recruitAwardCondition", 10);
                  int limitScore = this.configManager.getIntDefault("recruitRankCondition", 10);
                  this.rankMgr.sendOpenServerRankAward(36, 41, RankDefine.RankModule.OPEN_SERVER_ASSEMBLE, 31, reason, limitScore, commonScore, limitRank);
               }
            }

            endTime = this.configManager.getStrByDefault("powerRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("powerAwardCondition", 50000);
                  int limitScore = this.configManager.getIntDefault("powerRankCondition", 50000);
                  this.rankMgr.sendOpenServerRankAward(33, 38, RankDefine.RankModule.OPEN_SERVER_POWER, 28, reason, limitScore, commonScore, limitRank);
               }
            }
         } else if (info.id == 3004) {
            endTime = this.configManager.getStrByDefault("underPalaceRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("underPalaceAwardCondition", 1);
                  int limitScore = this.configManager.getIntDefault("underPalaceRankCondition", 1);
                  this.rankMgr.sendOpenServerRankAward(44, 46, RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE, RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE.id, reason, limitScore, commonScore, limitRank);
               }
            }

            endTime = this.configManager.getStrByDefault("towerRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("towerAwardCondition", 10);
                  int limitScore = this.configManager.getIntDefault("towerRankCondition", 10);
                  this.rankMgr.sendOpenServerRankAward(37, 42, RankDefine.RankModule.OPEN_SERVER_TOWER, 32, reason, limitScore, commonScore, limitRank);
               }
            }
         } else if (info.id == 3005) {
            endTime = this.configManager.getStrByDefault("heroLevelRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("heroLevelAwardCondition", 10);
                  int limitScore = this.configManager.getIntDefault("heroLevelRankCondition", 10);
                  this.rankMgr.sendOpenServerRankAward(43, 45, RankDefine.RankModule.OPEN_SERVER_HERO_LEV, RankDefine.RankModule.OPEN_SERVER_HERO_LEV.id, reason, limitScore, commonScore, limitRank);
               }
            }

            endTime = this.configManager.getStrByDefault("employeeRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("employeeAwardCondition", 10);
                  int limitScore = this.configManager.getIntDefault("employeeRankCondition", 10);
                  this.rankMgr.sendOpenServerRankAward(35, 40, RankDefine.RankModule.OPEN_SERVER_RECRUIT, 30, reason, limitScore, commonScore, limitRank);
               }
            }
         } else if (info.id == 3012) {
            endTime = this.configManager.getStrByDefault("recruitRankEndTime", "7|9");
            if (Integer.parseInt(endTime.split("\\|")[1]) == hour) {
               int startTime = info.start;
               int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60;
               if (DateUtil.isSameDay((long)realEndTime * 1000L)) {
                  int commonScore = this.configManager.getIntDefault("recruitAwardCondition", 10);
                  int limitScore = this.configManager.getIntDefault("recruitRankCondition", 10);
                  this.rankMgr.sendOpenServerRankAward(36, 41, RankDefine.RankModule.OPEN_SERVER_ASSEMBLE, 31, reason, limitScore, commonScore, limitRank);
               }
            }
         }

      }
   }

   public int checkLaborOpenServerRankTime(RankDefine.RankModule module) {
      ActivityInfo info = this.getActivityInfo(16);
      if (info == null || !info.open) {
         info = this.getActivityInfo(23);
         if (info == null || !info.open) {
            return 0;
         }
      }

      String endTime = "7|9";
      if (module.id == RankDefine.RankModule.OPEN_SERVER_ASSEMBLE.id) {
         if (info.id == 3012) {
            endTime = this.configManager.getStrByDefault("wuyiRecruitRankEndTime", "2|21");
         } else {
            if (info.id != 3003) {
               return 0;
            }

            endTime = this.configManager.getStrByDefault("recruitRankEndTime", "2|21");
         }
      }

      int startTime = info.start;
      int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60 + Integer.parseInt(endTime.split("\\|")[1]) * 60 * 60;
      int serverTime = DateUtil.getIntTime(System.currentTimeMillis());
      if (serverTime > realEndTime) {
         return 0;
      } else {
         return realEndTime;
      }
   }

   public int checkOpenServerRankTime(RankDefine.RankModule module) {
      ActivityInfo info = this.getActivityInfo(16);
      if (info != null && info.open) {
         String endTime = "7|9";
         if (module.id == RankDefine.RankModule.OPEN_SERVER_POWER.id) {
            endTime = this.configManager.getStrByDefault("powerRankEndTime", "7|9");
            if (info.id != 3003) {
               return 0;
            }
         } else if (module.id == RankDefine.RankModule.OPEN_SERVER_LEV.id) {
            endTime = this.configManager.getStrByDefault("levelRankEndTime", "7|9");
            if (info.id != 3001) {
               return 0;
            }
         } else if (module.id == RankDefine.RankModule.OPEN_SERVER_TOWER.id) {
            endTime = this.configManager.getStrByDefault("towerRankEndTime", "7|9");
            if (info.id != 3004) {
               return 0;
            }
         } else if (module.id == RankDefine.RankModule.OPEN_SERVER_ASSEMBLE.id) {
            if (info.id == 3012) {
               endTime = this.configManager.getStrByDefault("wuyiRecruitRankEndTime", "2|21");
            } else {
               if (info.id != 3003) {
                  return 0;
               }

               endTime = this.configManager.getStrByDefault("recruitRankEndTime", "2|21");
            }
         } else if (module.id == RankDefine.RankModule.OPEN_SERVER_RECRUIT.id) {
            endTime = this.configManager.getStrByDefault("employeeRankEndTime", "7|9");
            if (info.id != 3001 && info.id != 3005) {
               return 0;
            }
         } else if (module.id == RankDefine.RankModule.OPEN_SERVER_HERO_LEV.id) {
            endTime = this.configManager.getStrByDefault("heroLevelRankEndTime", "7|9");
            if (info.id != 3005) {
               return 0;
            }
         } else if (module.id == RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE.id) {
            endTime = this.configManager.getStrByDefault("underPalaceRankEndTime", "7|9");
            if (info.id != 3004) {
               return 0;
            }
         }

         int startTime = info.start;
         int realEndTime = startTime + Integer.parseInt(endTime.split("\\|")[0]) * 24 * 60 * 60 + Integer.parseInt(endTime.split("\\|")[1]) * 60 * 60;
         int serverTime = DateUtil.getIntTime(System.currentTimeMillis());
         return serverTime > realEndTime ? 0 : realEndTime;
      } else {
         return 0;
      }
   }

   @TaskMethod
   public void weekendKoiBuy(int playerId) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      ((ActivityData)worldDao.jsonData).weekendKoiBuys.add(playerId);
      worldDao.updateOp();
   }

   private int getStartTime(ActivityRuleModel activityRuleModel, List<ActivityOpenTimeModel> openActivities) {
      long curTime = System.currentTimeMillis();
      Iterator<ActivityOpenTimeModel> iterator = openActivities.iterator();
      if (activityRuleModel.getOpenType() == 1) {
         if (activityRuleModel.getOpenTimeType() == 1) {
            long serverOpenTime = this.worldMgr.getOpenServerTime() <= 0L ? System.currentTimeMillis() : this.worldMgr.getOpenServerTime();
            Calendar openTime = Calendar.getInstance();
            openTime.setTimeInMillis(DateUtil.getSomeDayBeginTime(serverOpenTime));
            openTime.add(5, activityRuleModel.getOpenTime());
            long startTime = openTime.getTimeInMillis();
            long endTime = startTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
            if (activityRuleModel.getRotateType() == 1) {
               while(endTime - 1000L < curTime && activityRuleModel.getDuration() > 0) {
                  startTime = endTime;
                  endTime = endTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
               }
            } else if (activityRuleModel.getRotateType() == 2 || activityRuleModel.getRotateType() == 3) {
               boolean curActivityFlag = false;

               while(iterator.hasNext()) {
                  iterator.next();
                  if (!curActivityFlag) {
                     if (endTime - 1000L >= curTime) {
                        curActivityFlag = true;
                        continue;
                     }

                     startTime = endTime;
                     endTime = endTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
                  }

                  iterator.remove();
               }

               if (!curActivityFlag) {
                  openActivities.clear();
               }
            }

            return DateUtil.getIntTime(startTime);
         } else {
            return DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(curTime));
         }
      } else if (activityRuleModel.getOpenType() == 2) {
         int openDayOfWeek = Integer.parseInt(activityRuleModel.getSpecificTime()) + 1;
         openDayOfWeek = openDayOfWeek > 7 ? openDayOfWeek - 7 : openDayOfWeek;
         Calendar calendar = Calendar.getInstance();
         calendar.set(7, openDayOfWeek);
         long startTime = DateUtil.getSomeDayBeginTime(calendar.getTimeInMillis());
         startTime = startTime > curTime ? startTime - 604800000L : startTime;
         return DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(startTime));
      } else if (activityRuleModel.getOpenType() == 3) {
         long startTime = DateUtil.getLongTime(activityRuleModel.getSpecificTime(), "yyyy-MM-dd");
         long endTime = startTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
         if (activityRuleModel.getRotateType() == 1) {
            while(endTime - 1000L < curTime && activityRuleModel.getDuration() > 0) {
               startTime = endTime;
               endTime = endTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
            }
         } else if (activityRuleModel.getRotateType() == 2 || activityRuleModel.getRotateType() == 3) {
            boolean curActivityFlag = false;

            while(iterator.hasNext()) {
               iterator.next();
               if (!curActivityFlag) {
                  if (endTime - 1000L >= curTime) {
                     curActivityFlag = true;
                     continue;
                  }

                  startTime = endTime;
                  endTime = endTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
               }

               iterator.remove();
            }

            if (!curActivityFlag) {
               openActivities.clear();
            }
         }

         return DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(startTime));
      } else if (activityRuleModel.getOpenType() == 4) {
         int openDayOfMonth = Integer.parseInt(activityRuleModel.getSpecificTime());
         Calendar calendar = Calendar.getInstance();
         calendar.set(5, openDayOfMonth);
         return DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(calendar.getTimeInMillis()));
      } else {
         if (activityRuleModel.getOpenType() == 5) {
            ActivityInfo activityInfo = this.getActivityInfo(activityRuleModel.getRelationType());
            if (activityInfo != null && !activityInfo.open && (long)activityInfo.end < curTime) {
               int difDay = DateUtil.difftimeDay(new Timestamp((long)activityInfo.end * 1000L));
               if (difDay == Integer.parseInt(activityRuleModel.getSpecificTime()) + 1) {
                  return DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(curTime));
               }
            }
         } else if (activityRuleModel.getOpenType() == 6) {
            int difDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;

            while(iterator.hasNext()) {
               ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)iterator.next();
               if (difDay < activityOpenTimeModel.getEarlyTime() || difDay > activityOpenTimeModel.getEvenTime()) {
                  iterator.remove();
               }
            }

            return DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(curTime));
         }

         return 0;
      }
   }

   public static void main(String[] args) {
      ActivityRuleModel activityRuleModel = new ActivityRuleModel();
      activityRuleModel.setOpenTime(21);
      activityRuleModel.setDuration(604800);
      activityRuleModel.setNextTime(49);
      long serverOpenTime = DateUtil.getLongTime("2021-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
      Calendar openTime = Calendar.getInstance();
      openTime.setTimeInMillis(DateUtil.getSomeDayBeginTime(serverOpenTime));
      openTime.add(5, activityRuleModel.getOpenTime());
      long startTime = openTime.getTimeInMillis();
      long endTime = startTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L;
      List<ActivityOpenTimeModel> openActivities = new ArrayList();
      ActivityOpenTimeModel activityOpenTimeModel = new ActivityOpenTimeModel();
      openActivities.add(activityOpenTimeModel);
      openActivities.add(activityOpenTimeModel);
      int curActivityIndex = -1;
      Iterator<ActivityOpenTimeModel> iterator = openActivities.iterator();

      for(int curTime = DateUtil.getIntTime(System.currentTimeMillis()); iterator.hasNext(); endTime = endTime + (long)activityRuleModel.getDuration() * 1000L + (long)activityRuleModel.getNextTime() * 86400000L) {
         iterator.next();
         if (endTime - 1000L >= (long)curTime && curActivityIndex == -1) {
            ++curActivityIndex;
         } else {
            iterator.remove();
         }
      }

      if (curActivityIndex == -1) {
         openActivities.clear();
      }

      System.out.println(openActivities.size());
   }

   private void activityDropEndAfterHandle(ActivityInfo activityInfo, ActivityData activityData) {
      activityInfo.dropping = false;
      ActivityOpenTimeModel model = (ActivityOpenTimeModel)this.gameModelPool.getEntity("activityopenTime", activityInfo.id);
      if (model.getActivityType() == 7) {
         this.weekendKoiLottery(activityData);
      }

   }

   private void activityEndAfterHandle(ActivityInfo activityInfo, ActivityData activityData) {
      activityInfo.open = false;
      activityInfo.crossActOpenDay = 0;
      ActivityOpenTimeModel model = (ActivityOpenTimeModel)this.gameModelPool.getEntity("activityopenTime", activityInfo.id);
      if (model.getActivityType() == 14) {
         this.springFestivalRankReward(activityInfo.id);
      } else if (model.getActivityType() == 16) {
         this.rankMgr.removeOpenServerRank(activityInfo.id);
      } else if (model.getActivityType() == 23) {
         this.rankMgr.removeLaborOpenServerRank(activityInfo.id);
      } else if (model.getActivityType() == 2) {
         this.specialTaskRankReward(activityInfo.id);
      } else if (model.getActivityType() == 17) {
         this.springEnjoyRankReward(activityInfo.id);
         activityData.seedProcess = 0;
      } else if (model.getActivityType() == 43) {
         this.kittyRankReward(activityInfo.id);
         activityData.kittySeedProcess = 0;
      } else if (model.getActivityType() == 21) {
         activityData.firstArtifactEnd = true;
         int dressId = Integer.parseInt(model.getExtendParams());
         ArtifactDressModel artifactDressModel = (ArtifactDressModel)ApplicationContextProvider.getModelPoolEntity("artifactDress", dressId);
         if (artifactDressModel != null) {
            WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
            ((WorldData)worldDao.jsonData).openArtDress.add(artifactDressModel.getId());
            worldDao.updateOp();
         }

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (artifactDressModel != null) {
               gamePlayer.pushPartTaskEx(ArtifactDressPart.class, "openArtifactDress", new Object[]{artifactDressModel.getId()});
            }

            gamePlayer.pushPartTaskEx(ActivityPart.class, "activityArtifactFlagNotify", new Object[0]);
         }
      } else if (model.getActivityType() == 24) {
         this.rankMgr.sendLastAward();
         this.rankMgr.removeRanks(RankDefine.RankModule.DEMON_BOSS_DAY_HURT);
         this.gameCachePool.deleteAll("tb_demon_boss");
      } else if (model.getActivityType() == 44) {
         this.rankMgr.sendDemonRotateLastAward();
         this.rankMgr.removeRanks(RankDefine.RankModule.DEMON_ROTATE_BOSS_DAY_HURT);
         this.gameCachePool.deleteAll("tb_demon_rotate_boss");
      } else if (model.getActivityType() == 28) {
         this.tongQueArcheryRankReward(model.getActivityId());
      } else if (model.getActivityType() == 32) {
         this.midAutumnRankReward(model.getActivityId());
      } else if (model.getActivityType() == 35) {
         this.lampReset();
      } else if (model.getActivityType() == 39) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ((ActivityData)worldDao.jsonData).beautyTreasureRecord.clear();
         worldDao.updateOp();
      } else if (model.getActivityType() == 54) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord.clear();
         worldDao.updateOp();
      } else if (model.getActivityType() == 45) {
         this.liYuRankReward(activityInfo.id);
      } else if (model.getActivityType() == 51) {
         this.gameCachePool.deleteAll("tb_stars_activity_draw_server");
      } else if (model.getActivityType() == 52) {
         this.gameCachePool.deleteAll("tb_swim_park_draw_server");
      } else if (model.getActivityType() == 56) {
         this.gameCachePool.deleteAll("tb_flower_fire_record");
      } else if (model.getActivityType() == 61) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ((ActivityData)worldDao.jsonData).qianKunTreasureHighRecord.clear();
         ((ActivityData)worldDao.jsonData).qianKunTreasureCommonRecord.clear();
         worldDao.updateOp();
      } else if (model.getActivityType() == 74) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ((ActivityData)worldDao.jsonData).qianKunLotteryHighRecord.clear();
         ((ActivityData)worldDao.jsonData).qianKunLotteryCommonRecord.clear();
         worldDao.updateOp();
      } else if (model.getActivityType() == 66) {
         this.yuanXiaoRankReward(model.getActivityId());
      } else if (model.getActivityType() == 76) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ((ActivityData)worldDao.jsonData).tongQueLotteryRecord.clear();
         worldDao.updateOp();
      } else if (model.getActivityType() == 104) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ((ActivityData)worldDao.jsonData).huaJiaLotteryRecord.clear();
         worldDao.updateOp();
      } else if (model.getActivityType() == 83) {
         this.qiXiDrumRankReward(model.getActivityId());
      } else if (model.getActivityType() == 92) {
         this.yuanDanRankReward(model.getActivityId());
      } else if (model.getActivityType() == 95) {
         WorldCupMgr worldCupMgr = (WorldCupMgr)ApplicationContextProvider.getContext().getBean(WorldCupMgr.class);
         worldCupMgr.pushTask(() -> worldCupMgr.getGameCachePool().deleteAll("tb_worldCup"));
      }

   }

   public void activityClose(ActivityInfo activityInfo, ActivityData activityData) {
      activityInfo.forceClose = true;
      if (activityInfo.dropping) {
         this.activityDropEndAfterHandle(activityInfo, activityData);
      }

      if (activityInfo.open) {
         this.activityEndAfterHandle(activityInfo, activityData);
      }

      activityInfo.open = false;
      ActivityOpenTimeModel model = (ActivityOpenTimeModel)this.gameModelPool.getEntity("activityopenTime", activityInfo.id);
      if (ActivityDefine.CROSS_ACTIVITY.containsKey(model.getActivityType())) {
         this.uploadCross(model.getActivityType());
      }

   }

   private void activityRotate(ActivityOpenTimeModel activityOpenTimeModel, ActivityData activityData) {
      if (activityOpenTimeModel.getActivityType() == 7) {
         activityData.weekendKoiWinner = "";
      } else if (activityOpenTimeModel.getActivityType() == 2) {
         Map<Integer, TreeMap<Integer, ActivityOpenTimeModel>> activityModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ActivityOpenTimeModel>>getModelPoolMap("customActivityOpenTime");

         for(int activityId : (MapUtil.getOrDefault(activityModelMap, activityOpenTimeModel.getActivityType(), TreeMap.class)).keySet()) {
            this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(2), String.valueOf(activityId));
         }
      } else if (activityOpenTimeModel.getActivityType() == 17) {
         activityData.seedProcess = 0;
      } else if (activityOpenTimeModel.getActivityType() == 14) {
         this.clearSpringFestivalBless();
      } else if (activityOpenTimeModel.getActivityType() == 95) {
         WorldCupMgr worldCupMgr = (WorldCupMgr)ApplicationContextProvider.getContext().getBean(WorldCupMgr.class);
         worldCupMgr.pushTask(() -> worldCupMgr.refreshMatch());
      }

      if (ActivityDefine.CROSS_ACTIVITY.containsKey(activityOpenTimeModel.getActivityType())) {
         this.uploadCross(activityOpenTimeModel.getActivityType());
      }

   }

   private void weekendKoiLottery(ActivityData activityData) {
      ActivityInfo activityInfo = (ActivityInfo)activityData.timeRotates.get(7);
      if (activityInfo != null) {
         if (activityData.weekendKoiBuys.isEmpty()) {
            this.logger.error("【周末锦鲤】无人购买锦鲤礼包,跳过锦鲤大奖抽奖");
         } else {
            int randInt = RandomUtil.randInt(0, activityData.weekendKoiBuys.size());
            int prizePlayerId = (Integer)activityData.weekendKoiBuys.get(randInt);
            activityData.weekendKoiBuys.clear();
            GamePlayer prizeGamePlayer = this.worldMgr.getPlayerById(prizePlayerId);
            if (prizeGamePlayer == null) {
               this.logger.error("【周末锦鲤】无法找到锦鲤大奖获奖者【{}】GamePlayer", prizePlayerId);
            } else {
               PlayerDao playerDao = prizeGamePlayer.getPlayerDao();
               activityData.weekendKoiWinner = playerDao.playerName;
               ActivityMsg.S2C_WeekendKoiLuckyPlayer_6776.Builder msg = ActivityMsg.S2C_WeekendKoiLuckyPlayer_6776.newBuilder();
               msg.setPlayerName(activityData.weekendKoiWinner);
               this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
               TreeMap<Integer, PrizePoolModel> finalPrizePoolModels = PrizePoolModel.getPrizePoolByServerOpenTime(this.worldMgr.getOpenServerDays());
               if (finalPrizePoolModels != null && !finalPrizePoolModels.isEmpty()) {
                  Map<Integer, TreeMap<Integer, CentreAwardModel>> rewardMap = this.gameModelPool.getMap("customCentreAward");
                  TreeMap<Integer, CentreAwardModel> activityReward = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_WEEKEND_KOI);
                  if (activityReward != null && !activityReward.isEmpty()) {
                     List<ResourceModel> rewardList = new ArrayList();
                     rewardList.add(new ResourceModel(((PrizePoolModel)finalPrizePoolModels.firstEntry().getValue()).getCarpItemType(), ((PrizePoolModel)finalPrizePoolModels.firstEntry().getValue()).getCarpItemId(), ((PrizePoolModel)finalPrizePoolModels.firstEntry().getValue()).getCarItemNum()));
                     MailPart mailPart = (MailPart)prizeGamePlayer.getMgrPart(MailPart.class);
                     mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)activityReward.firstEntry().getValue()).getTitle(), ((CentreAwardModel)activityReward.firstEntry().getValue()).getDesc(), rewardList, 604800000L, 8, 811});
                  } else {
                     this.logger.error("【周末锦鲤】无法找到锦鲤大奖邮件配置");
                  }
               } else {
                  this.logger.error("【周末锦鲤】无法找到开服天数【{}】对应锦鲤大奖对应配置", this.worldMgr.getOpenServerDays());
               }
            }
         }
      }
   }

   public ActivityInfo getActivityInfo(int type) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      return (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(type);
   }

   public void updateActivityData() {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      worldDao.updateOp();
   }

   public int getActivityOpenDay(int type) {
      int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      int activityStartDay = openServerDay - this.getSeverActivityDay(type) + 1;
      return activityStartDay <= 0 ? 1 : activityStartDay;
   }

   public int getSeverActivityDay(int type) {
      ActivityInfo activityInfo = this.getActivityInfo(type);
      return activityInfo != null && activityInfo.id != 0 ? DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1 : 0;
   }

   public ArrayList<ActivityInfo> getOpeningActivityList() {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      ArrayList<ActivityInfo> activityList = new ArrayList();

      for(Map.Entry<Integer, ActivityInfo> entry : ((ActivityData)worldDao.jsonData).timeRotates.entrySet()) {
         ActivityInfo activityInfo = (ActivityInfo)entry.getValue();
         if (activityInfo.open) {
            activityList.add(activityInfo);
         }
      }

      return activityList;
   }

   public String getWeekendKoiWinner() {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      return ((ActivityData)worldDao.jsonData).weekendKoiWinner;
   }

   @TaskMethod
   public void addSpringFestivalBless(String content, int playerId) {
      SpringFestivalBlessDao springFestivalBlessDao = new SpringFestivalBlessDao();
      springFestivalBlessDao.content = content;
      springFestivalBlessDao.playerId = playerId;
      this.gameCachePool.insertDao(springFestivalBlessDao, true);
      SpringFestivalMsg.S2C_EnvelopeBlessNotify_12408.Builder msg = SpringFestivalMsg.S2C_EnvelopeBlessNotify_12408.newBuilder();
      SpringFestivalMsg.BlessData.Builder builder = SpringFestivalMsg.BlessData.newBuilder();
      builder.setPlayerId(playerId);
      builder.setContent(content);
      msg.setBlessData(builder);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
   }

   public Map<Integer, SpringFestivalBlessDao> getSpringFestivalBlessMap() {
      return this.gameCachePool.getAllTableByMap("tb_spring_festival_bless");
   }

   public void requestCrossRainTreeServerRank(GamePlayer gamePlayer, int activityId, int endTime) {
   }

   public void gmActivityRotate(GamePlayer gamePlayer, int activityType) {
      Map<Integer, ActivityRuleModel> activityRuleModelMap = this.gameModelPool.getMap("activityRule");
      if (activityRuleModelMap.containsKey(activityType)) {
         ActivityRuleModel activityRuleModel = (ActivityRuleModel)activityRuleModelMap.get(activityType);
         int yesterdayBeginTime = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis() - 86400000L));
         if (activityRuleModel.getRotationRule() == 2) {
            WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
            ActivityInfo activityInfo = (ActivityInfo)MapUtil.getOrDefault(((ActivityData)worldDao.jsonData).timeRotates, activityType, ActivityInfo.class);
            activityInfo.end = yesterdayBeginTime;
            activityInfo.open = false;
            activityInfo.forceClose = false;
            if (((ActivityData)worldDao.jsonData).timeRotates.containsKey(activityType)) {
               WorldDao<GameManagerData> gmWorldDao = this.worldMgr.<GameManagerData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_GAME_MANAGER);
               if (((GameManagerData)gmWorldDao.jsonData).activities.containsKey(activityType) && ((Map)((GameManagerData)gmWorldDao.jsonData).activities.get(activityType)).containsKey(activityInfo.id)) {
                  ((GmActivitySetting)((Map)((GameManagerData)gmWorldDao.jsonData).activities.get(activityType)).get(activityInfo.id)).setClose(false);
                  gmWorldDao.updateOp();
               }
            }

            worldDao.updateOp();
            this.activityFlush();
         } else {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)gamePlayer.getData("tb_player_activity", gamePlayer.getPlayerId());
            ActivityInfo activityInfo = (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, activityType, ActivityInfo.class);
            activityInfo.end = yesterdayBeginTime - DateUtil.getIntTime(2592000000L);
            activityInfo.open = true;
            activityInfo.forceClose = false;
            playerActivityDao.updateOp();
            ActivityPart activityPart = (ActivityPart)gamePlayer.getMgrPart(ActivityPart.class);
            activityPart.timeRotateReset(false);
         }

      }
   }

   private void springFestivalRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_SPRING_FESTIVAL, RankDefine.RankModule.ACTIVITY_POINT, 8, 833, String.valueOf(14), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(14), String.valueOf(activityId));
   }

   private void liYuRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_SPRING_FESTIVAL, RankDefine.RankModule.ACTIVITY_POINT, 8, 895, String.valueOf(45), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(45), String.valueOf(activityId));
   }

   private void specialTaskRankReward(int activityId) {
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
      if (activityOpenTimeModel != null) {
         Map<Integer, Map<Integer, CentreAwardModel>> rewardMap = this.gameModelPool.getMap("customCentreAward");
         Map<Integer, CentreAwardModel> activityReward = (Map)rewardMap.get(CentreAwardModel.TYPE_ACTIVITY);
         if (activityReward != null && !activityReward.isEmpty()) {
            for(Map.Entry<Integer, CentreAwardModel> entry : activityReward.entrySet()) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)entry.getValue();
               String title = MessageFormat.format(centreAwardModel.getTitle(), activityOpenTimeModel.getTips());
               String desc = MessageFormat.format(centreAwardModel.getDesc(), activityOpenTimeModel.getTips(), "{0}");
               List<RankData> rankDataList = this.rankMgr.getRanksByRank(RankDefine.RankModule.ACTIVITY_POINT, centreAwardModel.getMinRank(), centreAwardModel.getMaxRank(), "2:" + activityId);
               Map<Integer, String> needPlayerRank = new HashMap();

               for(RankData data : rankDataList) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.value);
                  if (!gamePlayer.isRobot()) {
                     if (gamePlayer.isLogin()) {
                        MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                        String rankDesc = MessageFormat.format(desc, data.rank);
                        mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, title, rankDesc, centreAwardModel.getItems(), 604800000L, 8, 812});
                     } else {
                        needPlayerRank.put(data.value, String.valueOf(data.rank));
                     }

                     gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, title, centreAwardModel.getTitle() + "-" + centreAwardModel.getId(), title + "-" + centreAwardModel.getId(), 0, 0, 0);
                  }
               }

               if (needPlayerRank.size() > 0) {
                  this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, title, desc, ((CentreAwardModel)entry.getValue()).getItems(), needPlayerRank, 604800000L, 8, 812, 0);
               }
            }

            this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(2), String.valueOf(activityId));
         }
      }
   }

   private void springEnjoyRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_SPRING_ENJOY_WATER_PERSONAL, RankDefine.RankModule.ACTIVITY_POINT, 8, 845, String.valueOf(17), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(17), String.valueOf(activityId));
   }

   private void kittyRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_KITTY_WATER_PERSONAL, RankDefine.RankModule.ACTIVITY_POINT, 8, 897, String.valueOf(43), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(43), String.valueOf(activityId));
   }

   private void tongQueArcheryRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_TONG_QUE_ARCHERY, RankDefine.RankModule.ACTIVITY_POINT, 8, 872, String.valueOf(28), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(28), String.valueOf(activityId));
   }

   private void midAutumnRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_MID_AUTUMN, RankDefine.RankModule.ACTIVITY_POINT, 8, 877, String.valueOf(32), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(32), String.valueOf(activityId));
   }

   private void yuanDanRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_YUAN_DAN, RankDefine.RankModule.ACTIVITY_POINT, 8, 12911, String.valueOf(92), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(92), String.valueOf(activityId));
   }

   private void lampReset() {
      this.gameCachePool.deleteAll("tb_activity_lamp_record");
   }

   private void yuanXiaoRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_YUAN_XIAO_RANK, RankDefine.RankModule.ACTIVITY_POINT, 8, 8222, String.valueOf(66), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(66), String.valueOf(activityId));
   }

   private void qiXiDrumRankReward(int activityId) {
      this.rankMgr.grantRankAward(CentreAwardModel.TYPE_QI_XI_DRUM, RankDefine.RankModule.ACTIVITY_POINT, 8, 10709, String.valueOf(83), String.valueOf(activityId));
      this.rankMgr.removeRanks(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(83), String.valueOf(activityId));
   }

   @TaskMethod
   public void springEnjoyRainWater(int process) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      long seedProcess = (long)(((ActivityData)worldDao.jsonData).seedProcess + process);
      long maxValue = 2147483646L;
      seedProcess = Math.min(maxValue, seedProcess);
      ((ActivityData)worldDao.jsonData).seedProcess = (int)seedProcess;
      worldDao.updateOp();
      OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
      ThemeActivityMsg.S2C_RainTreeProcess_12920.Builder notifyMsg = ThemeActivityMsg.S2C_RainTreeProcess_12920.newBuilder();
      notifyMsg.setProcess(((ActivityData)worldDao.jsonData).seedProcess);
      onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @TaskMethod
   public void nationalDaySacrifice(int process) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      long sacrificeProcess = (long)(((ActivityData)worldDao.jsonData).sacrificeProcess + process);
      long maxValue = 2147483646L;
      sacrificeProcess = Math.min(maxValue, sacrificeProcess);
      ((ActivityData)worldDao.jsonData).sacrificeProcess = (int)sacrificeProcess;
      worldDao.updateOp();
      OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
      NationalDayMsg.S2C_SacrificeProcess_15208.Builder notifyMsg = NationalDayMsg.S2C_SacrificeProcess_15208.newBuilder();
      notifyMsg.setServerProcess(((ActivityData)worldDao.jsonData).sacrificeProcess);
      onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @TaskMethod
   public void playerJoinActivity(int activityId, int playerId) {
      ActivityJoinDao activityJoinDao = (ActivityJoinDao)this.getActivityJoinMap().get(activityId);
      if (activityJoinDao == null) {
         activityJoinDao = new ActivityJoinDao();
         activityJoinDao.activityId = activityId;
         activityJoinDao.players.add(playerId);
         this.gameCachePool.insertDao(activityJoinDao, false);
      } else if (!activityJoinDao.players.contains(playerId) && !activityJoinDao.isEnd) {
         activityJoinDao.players.add(playerId);
         activityJoinDao.updateOp();
      }

   }

   @TaskMethod
   public void activityEndSetJoinState(int activityId) {
      ActivityJoinDao activityJoinDao = (ActivityJoinDao)this.getActivityJoinMap().get(activityId);
      if (activityJoinDao != null) {
         activityJoinDao.isEnd = true;
         activityJoinDao.updateOp();
      }

   }

   @TaskMethod
   public void checkOfflineJob(int activityId) {
      ActivityJoinDao activityJoinDao = (ActivityJoinDao)this.getActivityJoinMap().get(activityId);
      if (activityJoinDao != null && activityJoinDao.isEnd) {
         this.logger.info("活动【{}】结算离线玩家过程中重新开启该活动,停止结算", activityId);
         activityJoinDao.isEnd = false;
         activityJoinDao.players.clear();
         activityJoinDao.updateOp();

         for(Set<Integer> activities : this.offLinePlayerActivityMap.values()) {
            activities.remove(activityId);
         }
      }

   }

   private Map<Integer, ActivityJoinDao> getActivityJoinMap() {
      return this.gameCachePool.getAllTableByMap("tb_activity_join");
   }

   public boolean checkOpenTimeLimit(String activityName, String openServerLimitTime) {
      if (StringUtils.isEmpty(openServerLimitTime)) {
         return false;
      } else {
         String[] limitTimeArr = openServerLimitTime.split("\\|");
         if (limitTimeArr.length != 2) {
            this.logger.error("活动【{}】指定时间前后开服配置有误【{}】", activityName, openServerLimitTime);
            return true;
         } else {
            try {
               int flag = Integer.parseInt(limitTimeArr[0]);
               Date limitDate = DateUtil.parse(limitTimeArr[1], "yyyy-MM-dd");
               if (flag < 0) {
                  if (this.worldMgr.getOpenServerTime() < limitDate.getTime()) {
                     return false;
                  }
               } else if (this.worldMgr.getOpenServerTime() >= limitDate.getTime()) {
                  return false;
               }
            } catch (Exception var6) {
               this.logger.error("活动【{}】指定时间前后开服配置有误【{}】", activityName, openServerLimitTime);
            }

            return true;
         }
      }
   }

   @TaskMethod
   public void addLampRecord(ActivityLampRecordDao recordData, GamePlayer player, int id) {
      List<ActivityLampRecordDao> lampRecordList = this.getLampRecordList();
      lampRecordList.sort(ComparatorUtil.createReversedComparatorByFiled(ActivityLampRecordDao.class, "getTime"));
      int delNum = lampRecordList.size() + 1 - 50;
      if (delNum > 0) {
         for(int i = 0; i < delNum; ++i) {
            this.gameCachePool.deleteDao(lampRecordList.get(lampRecordList.size() - 1), false);
         }
      }

      this.gameCachePool.insertDao(recordData);
      ActivityLampMsg.S2C_GetReward_15504.Builder resp = ActivityLampMsg.S2C_GetReward_15504.newBuilder();
      resp.setGotTimes(recordData.num);
      resp.setId(id);
      player.sendMsg(resp.build());
   }

   public List<ActivityLampRecordDao> getLampRecordList() {
      return this.gameCachePool.getAllTableByList("tb_activity_lamp_record");
   }

   @MsgHandlerAnno
   public void S2S_RecruitRecord_5320(BeautyTreasureMsg.S2S_RecruitRecord_5320 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      BeautyMainModel beautyMainModel1 = (BeautyMainModel)this.gameModelPool.getEntity("beautyMain", 1);
      BeautyMainModel beautyMainModel2 = (BeautyMainModel)this.gameModelPool.getEntity("beautyMain", 2);

      for(BeautyTreasureMsg.RecruitRecord record : msg.getRecordList()) {
         BeautyTreasureRecord data = new BeautyTreasureRecord();
         data.awardId = record.getAwardId();
         data.playerId = record.getPlayerId();
         data.playerName = record.getPlayerName();
         data.recruitType = record.getRecruitType();
         data.serverId = record.getServerId();
         ((ActivityData)worldDao.jsonData).beautyTreasureRecord.add(data);
      }

      List<BeautyTreasureRecord> tempList1 = new ArrayList();
      List<BeautyTreasureRecord> tempList2 = new ArrayList();

      for(BeautyTreasureRecord record : ((ActivityData)worldDao.jsonData).beautyTreasureRecord) {
         if (record.recruitType == 1) {
            tempList1.add(record);
         } else if (record.recruitType == 2) {
            tempList2.add(record);
         }
      }

      for(; !tempList1.isEmpty() && tempList1.size() > beautyMainModel1.getCodeTimes(); tempList1.remove(0)) {
         if (((ActivityData)worldDao.jsonData).beautyTreasureRecord.contains(tempList1.get(0))) {
            ((ActivityData)worldDao.jsonData).beautyTreasureRecord.remove(tempList1.get(0));
         }
      }

      for(; !tempList2.isEmpty() && tempList2.size() > beautyMainModel2.getCodeTimes(); tempList2.remove(0)) {
         if (((ActivityData)worldDao.jsonData).beautyTreasureRecord.contains(tempList2.get(0))) {
            ((ActivityData)worldDao.jsonData).beautyTreasureRecord.remove(tempList2.get(0));
         }
      }

      worldDao.updateOp();
      BeautyTreasureMsg.S2C_RecruitRecordInfo_5305.Builder builder = BeautyTreasureMsg.S2C_RecruitRecordInfo_5305.newBuilder();

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).beautyTreasureRecord) {
         BeautyTreasureMsg.RecruitRecord.Builder record = BeautyTreasureMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addAllRecord(record);
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void S2S_RecruitRecord_9920(BeautyTreasureRotateMsg.S2S_RecruitRecord_9920 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      BeautyMainModel beautyMainModel1 = (BeautyMainModel)this.gameModelPool.getEntity("beautyMain", 3);
      BeautyMainModel beautyMainModel2 = (BeautyMainModel)this.gameModelPool.getEntity("beautyMain", 4);

      for(BeautyTreasureRotateMsg.RecruitRecord record : msg.getRecordList()) {
         BeautyTreasureRecord data = new BeautyTreasureRecord();
         data.awardId = record.getAwardId();
         data.playerId = record.getPlayerId();
         data.playerName = record.getPlayerName();
         data.recruitType = record.getRecruitType();
         data.serverId = record.getServerId();
         ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord.add(data);
      }

      List<BeautyTreasureRecord> tempList1 = new ArrayList();
      List<BeautyTreasureRecord> tempList2 = new ArrayList();

      for(BeautyTreasureRecord record : ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord) {
         if (record.recruitType == 3) {
            tempList1.add(record);
         } else if (record.recruitType == 4) {
            tempList2.add(record);
         }
      }

      for(; !tempList1.isEmpty() && tempList1.size() > beautyMainModel1.getCodeTimes(); tempList1.remove(0)) {
         if (((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord.contains(tempList1.get(0))) {
            ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord.remove(tempList1.get(0));
         }
      }

      for(; !tempList2.isEmpty() && tempList2.size() > beautyMainModel2.getCodeTimes(); tempList2.remove(0)) {
         if (((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord.contains(tempList2.get(0))) {
            ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord.remove(tempList2.get(0));
         }
      }

      worldDao.updateOp();
      BeautyTreasureRotateMsg.S2C_RecruitRecordInfo_9905.Builder builder = BeautyTreasureRotateMsg.S2C_RecruitRecordInfo_9905.newBuilder();

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).beautyTreasureRotateRecord) {
         BeautyTreasureRotateMsg.RecruitRecord.Builder record = BeautyTreasureRotateMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addAllRecord(record);
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void S2S_RecruitRecord_17708(QianKunTreasureMsg.S2S_RecruitRecord_17708 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.worldMgr.pushTaskEx("qianKunTreasureRecord", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2S_RecruitRecord_19808(QianKunLotteryMsg.S2S_RecruitRecord_19808 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.worldMgr.pushTaskEx("qianKunLotteryRecord", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2S_RecruitRecord_20127(TongQueRotateMsg.S2S_RecruitRecord_20127 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.worldMgr.pushTaskEx("tongQueLotteryRecord", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2S_RecruitRecord_24427(HuaJiaActMsg.S2S_RecruitRecord_24427 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.worldMgr.pushTaskEx("huaJiaLotteryRecord", new Object[]{msg});
   }

   @TaskMethod
   public void kittyRainWater(int process) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      long seedProcess = (long)(((ActivityData)worldDao.jsonData).kittySeedProcess + process);
      long maxValue = 2147483646L;
      seedProcess = Math.min(maxValue, seedProcess);
      ((ActivityData)worldDao.jsonData).kittySeedProcess = (int)seedProcess;
      worldDao.updateOp();
      OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
      KittyActivityMsg.S2C_RainTreeProcess_15920.Builder notifyMsg = KittyActivityMsg.S2C_RainTreeProcess_15920.newBuilder();
      notifyMsg.setProcess(((ActivityData)worldDao.jsonData).kittySeedProcess);
      onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @TaskMethod
   public void addStarsActivityDrawRecord(StarsActivityDrawServerDao dao) {
      this.gameCachePool.insertDao(dao);
   }

   @TaskMethod
   public void addSwimparkActivityDrawRecord(SwimparkActivityDrawServerDao dao) {
      this.gameCachePool.insertDao(dao);
   }

   @TaskMethod
   public void addFlowerFireRecordDao(FlowerFireRecordDao dao) {
      this.gameCachePool.insertDao(dao);
   }

   private void activityRankSettle(int rewardType, List<CrossActivityMsg.PlayerActRankInfo> rankList, int logModule, int reason, boolean resetData) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allRankRewardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rankRewardModelMap = (TreeMap)allRankRewardModelMap.get(rewardType);
      if (rankRewardModelMap != null && !rankRewardModelMap.isEmpty()) {
         Map<Integer, Map<Integer, String>> offlineRewardMap = new HashMap();

         for(CrossActivityMsg.PlayerActRankInfo rankData : rankList) {
            GamePlayer player = this.worldMgr.getPlayerById(rankData.getPlayerId());
            if (player != null) {
               CentreAwardModel rewardModel = null;

               for(CentreAwardModel centreAwardModel : rankRewardModelMap.values()) {
                  if (rankData.getRank() >= centreAwardModel.getMinRank() && rankData.getRank() <= centreAwardModel.getMaxRank()) {
                     rewardModel = centreAwardModel;
                     break;
                  }
               }

               if (rewardModel == null) {
                  rewardModel = (CentreAwardModel)rankRewardModelMap.lastEntry().getValue();
               }

               if (player.isLogin()) {
                  MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
                  String format = MessageFormat.format(rewardModel.getDesc(), rankData.getRank());
                  mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), format, rewardModel.getItems(), 604800000L, logModule, reason});
               } else {
                  Map<Integer, String> offlinePlayerRewardMap = (Map)offlineRewardMap.get(rewardModel.getId());
                  if (offlinePlayerRewardMap == null) {
                     offlinePlayerRewardMap = new HashMap();
                  }

                  offlinePlayerRewardMap.put(player.getPlayerId(), String.valueOf(rankData.getRank()));
                  offlineRewardMap.put(rewardModel.getId(), offlinePlayerRewardMap);
               }

               if (resetData) {
                  player.pushPartTaskEx(ActivityPart.class, "resetPersonRankData", new Object[]{reason});
               }
            }
         }

         for(Map.Entry<Integer, Map<Integer, String>> entry : offlineRewardMap.entrySet()) {
            if (entry.getValue() != null && !((Map)entry.getValue()).isEmpty()) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", (Integer)entry.getKey());
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), (Map)entry.getValue(), 604800000L, logModule, reason, 0);
            }
         }

      }
   }

   public void uploadCross() {
      for(int crossActivity : ActivityDefine.CROSS_ACTIVITY.keySet()) {
         this.uploadCross(crossActivity);
      }

   }

   public void uploadCross(int activityType) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      if (activityType == 84) {
         CrossActivityMsg.S2CR_DecisiveActivityUpload_13104.Builder msg = CrossActivityMsg.S2CR_DecisiveActivityUpload_13104.newBuilder();
         ActivityInfo activityInfo = (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(activityType);
         if (activityInfo != null && activityInfo.open) {
            msg.setDropTime(activityInfo.drop);
            msg.setEndTime(activityInfo.end);
         } else {
            msg.setDropTime(0);
            msg.setEndTime(0);
         }

         msg.setActivityType(activityType);
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
      } else if (activityType == 108) {
         CrossActivityMsg.S2CR_Activity8Upload_13110.Builder msg = CrossActivityMsg.S2CR_Activity8Upload_13110.newBuilder();
         ActivityInfo activityInfo = (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(activityType);
         if (activityInfo != null && activityInfo.open) {
            msg.setDropTime(activityInfo.drop);
            msg.setEndTime(activityInfo.end);
            msg.setActOpenDay(this.getActivityOpenDay(activityType));
         } else {
            msg.setDropTime(0);
            msg.setEndTime(0);
            msg.setActOpenDay(0);
         }

         msg.setActivityType(activityType);
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
      } else {
         CrossActivityMsg.S2CR_ActivityUpload_13101.Builder msg = CrossActivityMsg.S2CR_ActivityUpload_13101.newBuilder();
         ActivityInfo activityInfo = (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(activityType);
         if (activityInfo != null && activityInfo.open) {
            msg.setDropTime(activityInfo.drop);
            msg.setEndTime(activityInfo.end);
            msg.setActOpenDay(this.getActivityOpenDay(activityType));
         } else {
            msg.setDropTime(0);
            msg.setEndTime(0);
            msg.setActOpenDay(0);
         }

         msg.setActivityType(activityType);
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
      }

   }

   public void _mainServerMergeBegin() {
      ArrayList<ActivityInfo> openingActivityList = this.getOpeningActivityList();
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      String key = this.worldMgr.getOpengingActivityRedisKey(this.worldMgr.GAME_SERVER_ID);
      RMap<Integer, String> map = gameRedisTool.getClient().getMap(key);
      map.clear();

      for(ActivityInfo activityInfo : openingActivityList) {
         map.put(activityInfo.id, JsonUtil.beanToJson(activityInfo));
      }

   }

   private List<ResourceModel> slaveFaQiuActCompensate(ActivityInfo mainServerActInfo, ActivityInfo slaveServerActInfo) {
      CentreAwardModel mailModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_FA_QIU_COMPENSATE);
      if (null == mailModel) {
         this.logger.error("CentreAward 找不到腾龙秘宝补偿邮件 id:{}", CentreAwardModel.ID_FA_QIU_COMPENSATE);
         return null;
      } else if (slaveServerActInfo != null && slaveServerActInfo.id > 0 && slaveServerActInfo.end >= DateUtil.getIntTime(System.currentTimeMillis()) && slaveServerActInfo.open) {
         long calStarTime;
         if (mainServerActInfo != null && mainServerActInfo.id > 0 && mainServerActInfo.end >= DateUtil.getIntTime(System.currentTimeMillis()) && mainServerActInfo.open) {
            calStarTime = (long)mainServerActInfo.end * 1000L;
         } else {
            calStarTime = System.currentTimeMillis();
         }

         long shortenTime = (long)slaveServerActInfo.end * 1000L - calStarTime;
         if (shortenTime <= 0L) {
            return null;
         } else {
            int shortenDay = (int)(shortenTime / 86400000L);
            int compensateNum = shortenDay / 2;
            int faQiuHeFuCompensateMin = this.configManager.getIntDefault("FaQiuHeFuCompensateMin", 1);
            int faQiuHeFuCompensateMax = this.configManager.getIntDefault("FaQiuHeFuCompensateMax", 5);
            if (compensateNum < faQiuHeFuCompensateMin) {
               compensateNum = faQiuHeFuCompensateMin;
            } else if (compensateNum > faQiuHeFuCompensateMax) {
               compensateNum = faQiuHeFuCompensateMax;
            }

            int faQiuHeFuItem = this.configManager.getIntDefault("FaQiuHeFuItem", 7022);
            List<ResourceModel> compensateItems = new ArrayList();
            compensateItems.add(new ResourceModel(2, faQiuHeFuItem, compensateNum));
            return compensateItems;
         }
      } else {
         return null;
      }
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      HashMap<Integer, ActivityInfo> mainServerOpeningActivityMap = new HashMap();
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      String key = this.worldMgr.getOpengingActivityRedisKey(mainServerId);
      RMap<Integer, String> map = gameRedisTool.getClient().getMap(key);
      if (map.isEmpty()) {
         this.logger.warn("WorldMgr.slaveServerMergeBegin 主服无活动正在开启中");
      }

      for(Map.Entry<Integer, String> entry : map.entrySet()) {
         ActivityInfo activityInfo = (ActivityInfo)JsonUtil.jsonToBean((String)entry.getValue(), ActivityInfo.class);
         mainServerOpeningActivityMap.put(entry.getKey(), activityInfo);
      }

      Map<Integer, ActivityRuleModel> activityRuleModelMap = ApplicationContextProvider.<Integer, ActivityRuleModel>getModelPoolMap("activityRule");
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      List<ResourceModel> faQiuActCompensate = this.slaveFaQiuActCompensate((ActivityInfo)mainServerOpeningActivityMap.get(5660), (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(97));

      for(int activityType : ((ActivityData)worldDao.jsonData).timeRotates.keySet()) {
         ActivityRuleModel activityRuleModel = (ActivityRuleModel)activityRuleModelMap.get(activityType);
         if (activityRuleModel != null) {
            this.mergeServerHandleAct(mainServerId, activityType, (ActivityData)worldDao.jsonData, mainServerOpeningActivityMap);
         }
      }

      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      Map<Integer, String> playerParams = new HashMap();

      for(GamePlayer gamePlayer : this.worldMgr.getPlayerMap().values()) {
         if (!gamePlayer.isRobot()) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)gamePlayer.getDataNoInsert("tb_player_activity", gamePlayer.getPlayerId());
            if (playerActivityDao != null) {
               playerParams.put(gamePlayer.getPlayerId(), "");
               ActivityPart activityPart = (ActivityPart)gamePlayer.getMgrPart(ActivityPart.class);

               for(AbstractActivityPart abstractActivityPart : activityPart.getActivityPartMap().values()) {
                  int activityType = abstractActivityPart.getActivityType();
                  ActivityRuleModel activityRuleModel = (ActivityRuleModel)activityRuleModelMap.get(activityType);
                  if (activityRuleModel != null && activityRuleModel.getRotationRule() == 2) {
                     ActivityInfo playerActivity = (ActivityInfo)playerActivityDao.activities.get(activityType);
                     if (playerActivity != null && playerActivity.id > 0 && playerActivity.open && playerActivity.start < curTime && playerActivity.end > curTime) {
                        boolean mainServerOpen = mainServerOpeningActivityMap.containsKey(playerActivity.id);
                        if (mainServerOpen) {
                           ActivityInfo mainServerActivityInfo = (ActivityInfo)mainServerOpeningActivityMap.get(playerActivity.id);
                           playerActivityDao.activities.put(activityType, mainServerActivityInfo);
                           playerActivityDao.updateOp();
                        }

                        abstractActivityPart._slaveServerActSettle(mainServerOpen, mainServerId);
                     }
                  }
               }
            }
         }
      }

      if (null != faQiuActCompensate && faQiuActCompensate.size() > 0 && playerParams.size() > 0) {
         CentreAwardModel mailModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_FA_QIU_COMPENSATE);
         this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, mailModel.getTitle(), mailModel.getDesc(), faQiuActCompensate, playerParams, 604800000L, 136, 13611, 0);
      }

   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);

      for(int slaveServer : slaveServerSet) {
         String key = this.worldMgr.getServerInfoRedisKey(slaveServer);
         RMap<String, String> map = gameRedisTool.getClient().getMap(key);
         if (null != map && !map.isEmpty()) {
            String koiBuy = (String)map.get("koiBuy");
            if (!StringUtils.isEmpty(koiBuy)) {
               for(String s : koiBuy.split(",")) {
                  ((ActivityData)worldDao.jsonData).weekendKoiBuys.add(Integer.parseInt(s));
               }
            }

            String kittySeedProcess = (String)map.get("kittySeedProcess");
            if (!StringUtils.isEmpty(kittySeedProcess)) {
               ((ActivityData)worldDao.jsonData).kittySeedProcess += Integer.parseInt(kittySeedProcess);
            }

            String seedProcess = (String)map.get("seedProcess");
            if (!StringUtils.isEmpty(seedProcess)) {
               ((ActivityData)worldDao.jsonData).seedProcess += Integer.parseInt(seedProcess);
            }

            worldDao.updateOp();
            map.remove("koiBuy");
            map.remove("kittySeedProcess");
            map.remove("seedProcess");
         }
      }

      GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
      gmMgr.pushTaskEx("closeActivity", new Object[]{3360});
   }

   private void mergeServerHandleAct(int mainServerId, int activityType, ActivityData activityData, Map<Integer, ActivityInfo> mainServerOpeningActivityMap) throws Exception {
      ActivityInfo curActivity = (ActivityInfo)activityData.timeRotates.get(activityType);
      if (curActivity != null && curActivity.open) {
         ActivityInfo mainActivity = (ActivityInfo)mainServerOpeningActivityMap.get(curActivity.id);
         if (mainActivity != null && mainActivity.open && curActivity.id == mainActivity.id) {
            this.rankMgr.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(activityType), String.valueOf(curActivity.id));
         } else {
            this.activityDropEndAfterHandle(curActivity, activityData);
            this.activityEndAfterHandle(curActivity, activityData);
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_BroodActivitySettle_13108(CrossActivityMsg.CR2S_BroodActivitySettle_13108 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getPoolType() != 0) {
         boolean isCrossChange = msg.hasCrossChange() && msg.getCrossChange();
         this.broodRankSettle(msg.getServerRank().getRankList(), 150, 15004, isCrossChange, msg.getPoolType(), msg.getCrossOpenDay());
         Map<Integer, Integer> map = Maps.newHashMap();
         map.put(1, CentreAwardModel.TYPE_BROOD_ACT_RANK1_INFO);
         map.put(2, CentreAwardModel.TYPE_BROOD_ACT_RANK2_INFO);
         map.put(3, CentreAwardModel.TYPE_BROOD_ACT_RANK3_INFO);
         if (map.containsKey(msg.getPoolType())) {
            this.sendBroodRankMail((Integer)map.get(msg.getPoolType()), msg.getTenRank().getRankList());
         }
      }

   }

   private void broodRankSettle(List<CrossActivityMsg.PlayerActRankInfo> rankList, int logModule, int reason, boolean resetData, int poolType, int crossActDay) {
      Table<Integer, Integer, String> table = HashBasedTable.create();

      for(CrossActivityMsg.PlayerActRankInfo rankData : rankList) {
         GamePlayer player = this.worldMgr.getPlayerById(rankData.getPlayerId());
         if (player != null) {
            BroodRankRewardModel broodRankReward = this.getBroodRankReward(poolType, crossActDay, rankData.getRank());
            if (broodRankReward != null) {
               CentreAwardModel rewardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", broodRankReward.getMailId());
               if (rewardModel != null) {
                  if (player.isLogin()) {
                     MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
                     String format = MessageFormat.format(rewardModel.getDesc(), rankData.getRank());
                     mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), format, broodRankReward.getRewards(), 604800000L, logModule, reason});
                  } else {
                     table.put(broodRankReward.getId(), player.getPlayerId(), String.valueOf(rankData.getRank()));
                  }

                  if (resetData) {
                     player.pushPartTaskEx(ActivityPart.class, "resetPersonRankData", new Object[]{reason});
                  }
               }
            }
         }
      }

      for(Map.Entry<Integer, Map<Integer, String>> entry : table.rowMap().entrySet()) {
         BroodRankRewardModel broodRankReward = (BroodRankRewardModel)this.gameModelPool.getEntity("broodRankReward", entry.getKey());
         CentreAwardModel centreAwardModel = (CentreAwardModel)this.gameModelPool.getEntity("centreAward", broodRankReward.getMailId());
         this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), broodRankReward.getRewards(), (Map)entry.getValue(), 604800000L, logModule, reason, 0);
      }

   }

   public void sendBroodRankMail(int mailId, List<CrossActivityMsg.PlayerActRankInfo> rankList) {
      if (rankList != null && rankList.size() > 0) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", mailId);
         if (null == centreAwardModel) {
            this.logger.error("centreAward 配置缺失 id:{}", mailId);
         } else {
            int flowerRankNum = this.configManager.getIntDefault("flowerRankNum", 10);
            String flowerRankDesc = this.configManager.getStrByDefault("flowerRankDesc", "第{0}名，{1}，积分{2}");
            StringBuilder sb = new StringBuilder();
            int curFlowerRankNum = 0;

            for(CrossActivityMsg.PlayerActRankInfo rankInfo : rankList) {
               int rank = rankInfo.getRank();
               String playerName = rankInfo.getPlayerName();
               long score = rankInfo.getScore();
               String format = MessageFormat.format(flowerRankDesc, rank, playerName, score);
               sb.append(format);
               ++curFlowerRankNum;
               if (curFlowerRankNum >= flowerRankNum) {
                  break;
               }
            }

            String title = centreAwardModel.getTitle();
            String desc = MessageFormat.format(centreAwardModel.getDesc(), curFlowerRankNum, sb.toString());
            List<GamePlayer> allPlayer = this.worldMgr.getAllPlayer();
            Map<Integer, String> offlinePlayerMap = new HashMap();

            for(GamePlayer player : allPlayer) {
               if (player.isLogin()) {
                  MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
                  mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, title, desc, null, 604800000L, 145, 14509});
               } else {
                  offlinePlayerMap.put(player.getPlayerId(), "");
               }
            }

            if (offlinePlayerMap.size() > 0) {
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, title, desc, (List)null, offlinePlayerMap, 604800000L, 145, 14509, 0);
            }

         }
      } else {
         this.logger.error("sendBroodRankMail 异常 rankList为空");
      }
   }

   @MsgHandlerAnno
   public void CR2S_BroodRankScoreUpdate_13113(CrossActivityMsg.CR2S_BroodRankScoreUpdate_13113 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BroodMsg.S2C_RankTotalScoreUpdate_26052 resp = BroodMsg.S2C_RankTotalScoreUpdate_26052.newBuilder().setTotalScore(msg.getTotalScore()).build();

      for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
         gamePlayer.sendMsg(resp);
      }

   }

   public BroodRankRewardModel getBroodRankReward(int poolType, int maxActOpenDay, int rank) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, BroodRankRewardModel> itemModelMap = gameModelPool.getMap("broodRankReward");
      return (BroodRankRewardModel)itemModelMap.values().stream().filter((broodMainModel) -> broodMainModel.getRewardType() == poolType).filter((broodMainModel) -> {
         boolean b1 = broodMainModel.getDateEnd() == 9999 && maxActOpenDay >= broodMainModel.getDateStart();
         boolean b2 = broodMainModel.getDateStart() <= maxActOpenDay && maxActOpenDay <= broodMainModel.getDateEnd();
         return b1 || b2;
      }).filter((broodMainModel) -> broodMainModel.getRankMin() <= rank && rank <= broodMainModel.getRankMax()).findFirst().orElse(null);
   }

   @MsgHandlerAnno
   public void CR2S_BroodUnlockPoolNotify_13115(CrossActivityMsg.CR2S_BroodUnlockPoolNotify_13115 msg, CrossSubscribeMsg crossSubscribeMsg) {
      HashMap<Integer, Integer> map = this.configManager.getIntMap("broodUnlockPoolMail");
      if (map != null && map.containsKey(msg.getNewPoolType())) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", (Integer)map.get(msg.getNewPoolType()));
         List<GamePlayer> allPlayer = this.worldMgr.getAllPlayer();
         Map<Integer, String> offlinePlayerMap = new HashMap();

         for(GamePlayer player : allPlayer) {
            if (!player.isLogin()) {
               offlinePlayerMap.put(player.getPlayerId(), "");
            } else {
               MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
               mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), null, 604800000L, 150, 15003});
            }
         }

         if (offlinePlayerMap.size() > 0) {
            this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), (List)null, offlinePlayerMap, 604800000L, 150, 15003, 0);
         }

      }
   }

   static class PrayRewardRecord {
      public String playerName;
      public ResourceModel resourceModel;

      public PrayRewardRecord(String name, ResourceModel resource) {
         this.playerName = name;
         this.resourceModel = resource;
      }
   }
}
