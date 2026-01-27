package com.gzbz.task.base;

import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityRotateSignDao;
import com.gzbz.db.ActivityThanksgivingDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ActivitySpringFestivalData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityPointRewardModel;
import com.gzbz.model.ActivityPropsModel;
import com.gzbz.model.ArtifactGridTaskModel;
import com.gzbz.model.ArtifactGridTaskNewModel;
import com.gzbz.model.GanenTaskModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.SpringIllustrationModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;

public abstract class AbstractActivityTaskPart extends AbstractTaskPart {
   protected abstract int rewardReason();

   protected abstract int getActivityType();

   protected abstract void sendInfo();

   protected abstract List<ResourceModel> getRewards(int taskId);

   public void commit(int taskId) {
      SevenDaysTaskModel model = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      if (model != null && model.getActivityId() == this.getPlayerActivityId()) {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            List<ResourceModel> resourceModelList = new ArrayList(this.getRewards(taskId));
            if (this.getActivityType() == 1) {
               ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", this.getPlayerActivityId());
               if (activityPropsModel != null) {
                  if (activityPropsModel.getPointType() <= 0) {
                     if (playerActivityDao.sevenTaskPoint < activityPropsModel.getPointMax()) {
                        playerActivityDao.sevenTaskPoint = Math.min(playerActivityDao.sevenTaskPoint + activityPropsModel.getPointNum(), activityPropsModel.getPointMax());
                        playerActivityDao.updateOp();
                     }
                  } else {
                     PlayerDao playerDao = this.player.getPlayerDao();
                     int curPoint = (int)playerDao.getProperty(activityPropsModel.getPointId());
                     if (curPoint < activityPropsModel.getPointMax()) {
                        int addPoint = curPoint + activityPropsModel.getPointNum() > activityPropsModel.getPointMax() ? activityPropsModel.getPointMax() - curPoint : activityPropsModel.getPointNum();
                        ResourceModel.addResourceToList(resourceModelList, new ResourceModel(activityPropsModel.getPointType(), activityPropsModel.getPointId(), addPoint));
                        curPoint += addPoint;
                     }

                     if (this.getPlayerActivityId() == 1130) {
                        Map<Integer, TreeMap<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
                        TreeMap<Integer, ActivityPointRewardModel> activityPointRewardModelMap = (TreeMap)rewardMap.get(this.getPlayerActivityId());
                        int level = 0;

                        for(ActivityPointRewardModel activityPointRewardModel : activityPointRewardModelMap.values()) {
                           if (activityPointRewardModel.getPointNum() > curPoint) {
                              break;
                           }

                           level = activityPointRewardModel.getLevel();
                        }

                        String[] rewardInfo = LogOperationMgr.toRewardsInfo(resourceModelList);
                        this.player.getOperationMgr().addExtraLog(this.player, 187, model.getTaskDesc(), rewardInfo[2], rewardInfo[1], String.valueOf(curPoint), String.valueOf(curPoint), String.valueOf(level));
                     }
                  }
               }
            } else if (this.getActivityType() == 14) {
               String liYuPointStr = ApplicationContextProvider.getConfigString("liyuPoint", "");
               List<ResourceModel> liYuResourceList = ResourceModel.buildResources(liYuPointStr);
               boolean isBoxReward = true;
               if (!liYuResourceList.isEmpty()) {
                  for(ResourceModel resourceModel : resourceModelList) {
                     if (resourceModel.getType() == ((ResourceModel)liYuResourceList.get(0)).getType() && resourceModel.getId() == ((ResourceModel)liYuResourceList.get(0)).getId()) {
                        isBoxReward = false;
                        break;
                     }
                  }
               }

               if (isBoxReward) {
                  List<ResourceModel> getRewards = new ArrayList();
                  showType = PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  boolean isSuper = !giftPart.getBuyGifts(21).isEmpty();
                  if (!isSuper) {
                     resourceModelList.remove(0);
                  }

                  for(ResourceModel resourceModel : resourceModelList) {
                     if (resourceModel.getType() == 2) {
                        ActivitySpringFestivalData var10000 = playerActivityDao.activitySpringFestivalData;
                        var10000.box += resourceModel.getValue();
                     } else {
                        getRewards.add(resourceModel);
                     }
                  }

                  playerActivityDao.updateOp();
                  this.player.addResourceMsg(resourceModelList);
                  this.player.sendResourceMsg();
                  resourceModelList = getRewards;
               }

               List<TaskData> taskDataList = new ArrayList(this.getTasksMap().values());

               for(int i = 0; i < taskDataList.size(); ++i) {
                  if (((TaskData)taskDataList.get(i)).id == taskId) {
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "宴请礼盒", String.valueOf(i + 1), String.valueOf(i + 1), 0, 0, 0);
                     break;
                  }
               }
            } else if (this.getActivityType() == 17) {
               if (this.getModule() == TaskDefine.TaskModule.MODULE_SPRING_ENJOY_ILLUSTRATION) {
                  showType = PlayerMsg.ShowType.SHOW_TYPE_ILLUSTRATION;
               } else {
                  showType = PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
               }

               SpringIllustrationModel springIllustrationModel = (SpringIllustrationModel)ApplicationContextProvider.getModelPoolEntity("springlllustration", taskId);
               if (springIllustrationModel != null) {
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "丽日驰行", springIllustrationModel.getBigIllustrationId() + "-" + springIllustrationModel.getSquareNum(), springIllustrationModel.getBigIllustrationId() + "-" + springIllustrationModel.getSquareNum(), 0, 0, 0);
               }
            } else if (this.getActivityType() != 22) {
               if (this.getActivityType() == 21) {
                  int day = this.getActivityDay();
                  Map<Integer, TreeMap<Integer, ArtifactGridTaskModel>> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactGridTask", model.getActivityId());
                  if (taskModelMap != null) {
                     for(ArtifactGridTaskModel artifactGridTaskModel : ((TreeMap)MapUtil.getOrDefault(taskModelMap, day, TreeMap.class)).values()) {
                        if (artifactGridTaskModel.getTaskId() == taskId) {
                           this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "五魂之阵", day + "-" + artifactGridTaskModel.getGridNum(), day + "-" + artifactGridTaskModel.getGridNum(), 0, 0, 0);
                           break;
                        }
                     }
                  }
               } else if (this.getActivityType() == 32) {
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "华裳走月", String.valueOf(model.getTime()), model.getTaskDesc(), 0, 0, 0);
               } else if (this.getActivityType() == 48) {
                  ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", this.getPlayerActivityId());
                  if (activityPropsModel != null) {
                     ActivityRotateSignDao activityRotateSignDao = (ActivityRotateSignDao)this.player.getData("tb_activity_rotate_sign", this.player.getPlayerId());
                     int point = (Integer)MapUtil.getOrDefault(activityRotateSignDao.point, this.getActivityType(), 0);
                     if (point < activityPropsModel.getPointMax()) {
                        activityRotateSignDao.point.put(this.getActivityType(), Math.min(point + activityPropsModel.getPointNum(), activityPropsModel.getPointMax()));
                        activityRotateSignDao.updateOp();
                     }
                  }
               } else if (this.getActivityType() != 47 && this.getActivityType() != 46) {
                  if (this.getActivityType() == 45) {
                     List<TaskData> taskDataList = new ArrayList(this.getTasksMap().values());

                     for(int i = 0; i < taskDataList.size(); ++i) {
                        if (((TaskData)taskDataList.get(i)).id == taskId) {
                           this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "宴请礼盒", String.valueOf(i + 1), String.valueOf(i + 1), 0, 0, 0);
                           break;
                        }
                     }
                  } else if (this.getActivityType() == 55) {
                     showType = PlayerMsg.ShowType.SHOW_TYPE_ILLUSTRATION;
                     GanenTaskModel ganenTaskModel = (GanenTaskModel)ApplicationContextProvider.getModelPoolEntity("Ganenlllustration", taskId);
                     if (ganenTaskModel != null) {
                        this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "丽日驰行", ganenTaskModel.getBigIllustrationId() + "-" + ganenTaskModel.getSquareNum(), ganenTaskModel.getBigIllustrationId() + "-" + ganenTaskModel.getSquareNum(), 0, 0, 0);
                     }

                     ActivityThanksgivingDao activityThanksgivingDao = (ActivityThanksgivingDao)this.player.getData("tb_activity_thanksgiving", this.player.getPlayerId());
                     activityThanksgivingDao.taskPoint += ApplicationContextProvider.getConfigInt("GanenPoint", 0);
                     activityThanksgivingDao.updateOp();
                  } else if (this.getActivityType() == 70) {
                     int day = this.getActivityDay();
                     Map<Integer, TreeMap<Integer, ArtifactGridTaskNewModel>> taskModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customNewArtifactGridTask", model.getActivityId());
                     if (taskModelMap != null) {
                        for(ArtifactGridTaskNewModel artifactGridTaskModel : ((TreeMap)MapUtil.getOrDefault(taskModelMap, day, TreeMap.class)).values()) {
                           if (artifactGridTaskModel.getTaskId() == taskId) {
                              this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, model.getActivityId(), "五魂之阵(新)", day + "-" + artifactGridTaskModel.getGridNum(), day + "-" + artifactGridTaskModel.getGridNum(), 0, 0, 0);
                              break;
                           }
                        }
                     }
                  }
               } else {
                  ActivityPropsModel activityPropsModel = (ActivityPropsModel)ApplicationContextProvider.getModelPoolEntity("activityProps", this.getPlayerActivityId());
                  if (activityPropsModel != null) {
                     PlayerDao playerDao = this.player.getPlayerDao();
                     int curPoint = (int)playerDao.getProperty(activityPropsModel.getPointId());
                     if (curPoint < activityPropsModel.getPointMax()) {
                        int addPoint = curPoint + activityPropsModel.getPointNum() > activityPropsModel.getPointMax() ? activityPropsModel.getPointMax() - curPoint : activityPropsModel.getPointNum();
                        ResourceModel.addResourceToList(resourceModelList, new ResourceModel(activityPropsModel.getPointType(), activityPropsModel.getPointId(), addPoint));
                        curPoint += addPoint;
                     }

                     if (this.getActivityType() == 47) {
                        Map<Integer, TreeMap<Integer, ActivityPointRewardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ActivityPointRewardModel>>getModelPoolMap("customActivityPointReward");
                        TreeMap<Integer, ActivityPointRewardModel> activityPointRewardModelMap = (TreeMap)rewardMap.get(this.getPlayerActivityId());
                        if (activityPointRewardModelMap != null) {
                           int level = 0;

                           for(ActivityPointRewardModel activityPointRewardModel : activityPointRewardModelMap.values()) {
                              if (activityPointRewardModel.getPointNum() > curPoint) {
                                 break;
                              }

                              level = activityPointRewardModel.getLevel();
                           }

                           String[] rewardInfo = LogOperationMgr.toRewardsInfo(resourceModelList);
                           this.player.getOperationMgr().addExtraLog(this.player, 187, model.getTaskDesc(), rewardInfo[2], rewardInfo[1], String.valueOf(curPoint), String.valueOf(curPoint), String.valueOf(level));
                        }
                     }
                  }
               }
            }

            taskData.finish();
            this.player.addResource(resourceModelList, showType, 8, this.rewardReason(), 0, 0, "");
         }

         this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
      } else {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
         this.sendCommitTaskResult(taskId, 0L);
      }
   }

   protected List<SevenDaysTaskModel> getTaskModels() {
      int activityId = this.getPlayerActivityId();
      Map<Integer, List<SevenDaysTaskModel>> allTasks = ApplicationContextProvider.<Integer, List<SevenDaysTaskModel>>getModelPoolMap("customSevenDaysTasks");
      return allTasks.containsKey(activityId) ? new ArrayList((Collection)allTasks.get(activityId)) : new ArrayList();
   }

   public TaskTargetItem getTargetItem(int taskId) {
      SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskId);
      return sevenDaysTaskModel == null ? null : new TaskTargetItem(sevenDaysTaskModel.getTargetType(), sevenDaysTaskModel.getTargetId(), sevenDaysTaskModel.getTargetNum());
   }

   public ActivityMsg.TaskData buildTask(TaskData taskData) {
      if (taskData == null) {
         return null;
      } else {
         ActivityMsg.TaskData.Builder taskBuilder = ActivityMsg.TaskData.newBuilder();
         taskBuilder.setProgress(taskData.tVal);
         taskBuilder.setTaskId(taskData.id);
         taskBuilder.setState(taskData.state);

         for(ResourceModel resourceModel : this.getRewards(taskData.id)) {
            taskBuilder.addRewards(resourceModel.builder());
         }

         return taskBuilder.build();
      }
   }

   public Integer getPlayerActivityId() {
      return this.getPlayerActivityInfo().id;
   }

   protected ActivityMgr getActivityMgr() {
      return (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
   }

   protected ActivityInfo getPlayerActivityInfo() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (ActivityInfo)MapUtil.getOrDefault(playerActivityDao.activities, this.getActivityType(), ActivityInfo.class);
   }

   protected ActivityInfo getServerActivityInfo() {
      return this.getActivityMgr().getActivityInfo(this.getActivityType());
   }

   public boolean isServerActivityInvalid() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      if (activityInfo != null && activityInfo.id > 0 && activityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis()) && activityInfo.open) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityInfo.id);
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         return activityOpenTimeModel == null || activityOpenTimeModel.getNeedLevel() > playerPublicDao.lv || !this.player.isSystemOpen(activityOpenTimeModel.getSystemid());
      } else {
         return true;
      }
   }

   protected int getActivityDay() {
      return this.getActivityDay(this.getActivityType());
   }

   protected int getActivityDay(int type) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      ActivityInfo activityInfo = (ActivityInfo)playerActivityDao.activities.get(type);
      return activityInfo != null ? DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1 : 0;
   }

   public int getActivityOpenDay() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int openServerDay = DateUtil.difftimeDay(new Timestamp(worldMgr.getOpenServerTime())) + 1;
      int activityStartDay = openServerDay - this.getActivityDay() + 1;
      return activityStartDay <= 0 ? 1 : activityStartDay;
   }
}
