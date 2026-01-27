package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.ActivityHeroRiseData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HeroRiseSharplyLevelModel;
import com.gzbz.model.TaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityHeroRaiseTaskPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroRaisePart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_HeroRiseInfo_6765(ActivityMsg.C2S_HeroRiseInfo_6765 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_HeroRiseBuy_6771(ActivityMsg.C2S_HeroRiseBuy_6771 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int type = msg.getType();
         int count = msg.getCount();
         if (count <= 0) {
            this.player.failure(4);
         } else {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            PlayerDao playerDao = this.player.getPlayerDao();
            if (playerDao.privilege_marquis <= 0) {
               this.player.failure(0);
            } else {
               if (type == 0) {
                  int maxCount = ApplicationContextProvider.getConfigInt("heroRiseLevelLimit", 0);
                  String[] feeArr = ApplicationContextProvider.getConfigString("heroRiseSharplyPayLv", "").split("\\|");
                  if (count + playerActivityDao.heroRise.buyLevel > maxCount) {
                     this.player.failure(25);
                     return;
                  }

                  if (ResourceModel.checkTotalNumError(Integer.parseInt(feeArr[2]), count)) {
                     return;
                  }

                  int totalFee = Integer.parseInt(feeArr[2]) * count;
                  if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, totalFee)) {
                     this.player.failure(31);
                     return;
                  }

                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)totalFee, 8, 816, type, count, "");
                  ActivityHeroRiseData var10000 = playerActivityDao.heroRise;
                  var10000.buyLevel += count;
                  int currentLevel = playerActivityDao.heroRise.level;
                  int finalLevel = currentLevel + count;
                  List<ResourceModel> allRewardList = new ArrayList();

                  for(int level = currentLevel + 1; level <= finalLevel; ++level) {
                     this.levelUp(allRewardList, 0);
                  }

                  this.player.addResource(allRewardList, PlayerMsg.ShowType.SHOW_TYPE_HERO_RAISE, 8, 816, type, count, "");
                  this.sendInfo();
               } else {
                  if (type != 1) {
                     this.player.failure(0);
                     return;
                  }

                  int maxCount = ApplicationContextProvider.getConfigInt("heroRiseIntegrationLimit", 0);
                  String[] feeArr = ApplicationContextProvider.getConfigString("heroRiseSharplyPayIntegral", "").split(":");
                  int totalIntegral = Integer.parseInt(feeArr[0]) * count;
                  if (totalIntegral + playerActivityDao.heroRise.buyIntegral > maxCount) {
                     this.player.failure(25);
                     return;
                  }

                  if (ResourceModel.checkTotalNumError(Integer.parseInt(feeArr[1]), count)) {
                     return;
                  }

                  int totalFee = Integer.parseInt(feeArr[1]) * count;
                  if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, totalFee)) {
                     this.player.failure(31);
                     return;
                  }

                  this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)totalFee, 8, 816, type, count, "");
                  ActivityHeroRiseData var21 = playerActivityDao.heroRise;
                  var21.buyIntegral += totalIntegral;
                  PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_COMMON;
                  int upgradeNeed = this.getLevelModel(playerActivityDao.heroRise.level).getIntegral();
                  if (playerDao.hero_raise_integral + totalIntegral >= upgradeNeed) {
                     showType = PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
                  }

                  this.player.addResource(1, PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL, totalIntegral, showType, 8, 816, type, count, "");
               }

               playerActivityDao.updateOp();
               ActivityMsg.S2C_HeroRiseBuy_6772.Builder resp = ActivityMsg.S2C_HeroRiseBuy_6772.newBuilder();
               resp.setCount(count);
               resp.setType(type);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   public void buyMarquis(List<ResourceModel> resourceModels) {
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.privilege_marquis > 0) {
         this.logger.error("玩家{}已经是王侯", this.player.getPlayerId());
      } else {
         int addIntegral = 0;
         Iterator<ResourceModel> iterator = resourceModels.iterator();

         while(iterator.hasNext()) {
            ResourceModel resourceModel = (ResourceModel)iterator.next();
            if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL) {
               addIntegral += resourceModel.getValue();
               iterator.remove();
            }
         }

         playerDao.modifyProperty(PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL, (long)addIntegral);
         playerDao.updateOp();
         this.checkUpgrade(resourceModels);
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(int level = playerActivityDao.heroRise.level; level > 0; --level) {
            this.marquisLvReward(resourceModels, level);
         }

      }
   }

   public void checkUpgrade(List<ResourceModel> resourceModelList) {
      PlayerDao playerDao = this.player.getPlayerDao();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int currentLevel = playerActivityDao.heroRise.level;
      List<ResourceModel> allRewardList = new ArrayList();

      for(int upgradeNeed = this.getLevelModel(playerActivityDao.heroRise.level).getIntegral(); playerDao.hero_raise_integral >= upgradeNeed; upgradeNeed = this.getLevelModel(playerActivityDao.heroRise.level).getIntegral()) {
         this.levelUp(allRewardList, upgradeNeed);
      }

      if (playerActivityDao.heroRise.level > currentLevel) {
         if (resourceModelList != null) {
            for(ResourceModel resourceModel : allRewardList) {
               resourceModel.addResourceToList(resourceModelList);
            }
         } else {
            this.player.addResource(allRewardList, PlayerMsg.ShowType.SHOW_TYPE_HERO_RAISE, 8, 814, currentLevel, playerActivityDao.heroRise.level, "");
            this.sendInfo();
         }
      }

   }

   private void levelUp(List<ResourceModel> allRewardList, int integral) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (integral > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL, (long)integral, 8, 814, playerActivityDao.heroRise.level, 0, "");
      }

      ++playerActivityDao.heroRise.level;
      playerActivityDao.updateOp();
      this.heroLvReward(allRewardList, playerActivityDao.heroRise.level);
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.privilege_marquis > 0) {
         this.marquisLvReward(allRewardList, playerActivityDao.heroRise.level);
      }

   }

   public HeroRiseSharplyLevelModel getLevelModel(int level) {
      Map<Integer, HeroRiseSharplyLevelModel> heroRiseSharplyLevelModelMap = ApplicationContextProvider.<Integer, HeroRiseSharplyLevelModel>getModelPoolMap("heroRiseSharplyLevel");
      TreeMap<Integer, HeroRiseSharplyLevelModel> heroRiseSharplyLevelModelTreeMap = new TreeMap(heroRiseSharplyLevelModelMap);
      HeroRiseSharplyLevelModel lastModel = (HeroRiseSharplyLevelModel)heroRiseSharplyLevelModelTreeMap.lastEntry().getValue();
      return level > lastModel.getLv() - 1 ? lastModel : (HeroRiseSharplyLevelModel)heroRiseSharplyLevelModelTreeMap.get(level);
   }

   private void heroLvReward(List<ResourceModel> allRewardList, int level) {
      if (this.canReward(level)) {
         HeroRiseSharplyLevelModel levelModel = this.getLevelModel(level);

         for(ResourceModel resourceModel : levelModel.getRewards()) {
            resourceModel.addResourceToList(allRewardList);
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "群雄崛起", "将军-" + level, "-", 0, 0, 0);
      }

   }

   private void marquisLvReward(List<ResourceModel> allRewardList, int level) {
      if (this.canReward(level)) {
         HeroRiseSharplyLevelModel levelModel = this.getLevelModel(level);

         for(ResourceModel resourceModel : levelModel.getLockRewards()) {
            resourceModel.addResourceToList(allRewardList);
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "群雄崛起", "王侯-" + level, "-", 0, 0, 0);
      }

   }

   private boolean canReward(int level) {
      Map<Integer, HeroRiseSharplyLevelModel> heroRiseSharplyLevelModelMap = ApplicationContextProvider.<Integer, HeroRiseSharplyLevelModel>getModelPoolMap("heroRiseSharplyLevel");
      TreeMap<Integer, HeroRiseSharplyLevelModel> heroRiseSharplyLevelModelTreeMap = new TreeMap(heroRiseSharplyLevelModelMap);
      int maxLevel = (Integer)heroRiseSharplyLevelModelTreeMap.lastKey() - 1;
      int eveyXLevel = ApplicationContextProvider.getConfigInt("heroRiseSharplyLv", Integer.MAX_VALUE);
      return level <= maxLevel || (level - maxLevel) % eveyXLevel == 0;
   }

   public void sendInfo() {
      ActivityHeroRaiseTaskPart activityHeroRaiseTaskPart = (ActivityHeroRaiseTaskPart)this.player.getMgrPart(ActivityHeroRaiseTaskPart.class);
      activityHeroRaiseTaskPart.sendInfo();
   }

   public int getActivityType() {
      return 8;
   }

   public void rotateReset(int oldActivityId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.heroRise.buyIntegral = 0;
      playerActivityDao.heroRise.buyLevel = 0;
      playerActivityDao.heroRise.level = 0;
      playerActivityDao.updateOp();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.hero_raise_integral > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL, (long)playerDao.hero_raise_integral, 8, 817, 0, 0, "");
      }

      if (playerDao.privilege_marquis > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_PR_MARQUIS, (long)playerDao.privilege_marquis, 8, 817, 0, 0, "");
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         giftPart.clearGifts(11);
      }

      ActivityHeroRaiseTaskPart activityHeroRaiseTaskPart = (ActivityHeroRaiseTaskPart)this.player.getMgrPart(ActivityHeroRaiseTaskPart.class);
      Map<Integer, TreeMap<Integer, Set<Integer>>> allTaskGroup = ApplicationContextProvider.<Integer, TreeMap<Integer, Set<Integer>>>getModelPoolMap("customHeroRiseSharplyTask");

      for(int stepId : allTaskGroup.keySet()) {
         activityHeroRaiseTaskPart.rotate(stepId);
      }

   }

   public void gmTaskGroupReset(int stepId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      long time = 0L;
      if (stepId == 1) {
         time = 86400000L;
      } else {
         if (stepId != 2) {
            return;
         }

         time = 691200000L;
      }

      TaskGroupData taskGroup = (TaskGroupData)playerActivityDao.heroRise.taskStepGroup.get(stepId);
      if (taskGroup != null) {
         taskGroup.end -= DateUtil.getIntTime(time);
         playerActivityDao.updateOp();
         ActivityHeroRaiseTaskPart activityHeroRaiseTaskPart = (ActivityHeroRaiseTaskPart)this.player.getMgrPart(ActivityHeroRaiseTaskPart.class);
         activityHeroRaiseTaskPart.trigger();
      }
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         PlayerDao playerDao = this.player.getPlayerDao();
         List<ResourceModel> resourceModels = new ArrayList();
         ActivityHeroRaiseTaskPart activityHeroRaiseTaskPart = (ActivityHeroRaiseTaskPart)this.player.getMgrPart(ActivityHeroRaiseTaskPart.class);
         Iterator playerActivityDao = activityHeroRaiseTaskPart.getTasksMap().values().iterator();

         while(true) {
            TaskData taskData;
            while(true) {
               if (!playerActivityDao.hasNext()) {
                  this.checkUpgrade(resourceModels);
                  if (playerDao.privilege_marquis > 0) {
                     PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
                     Map<Integer, HeroRiseSharplyLevelModel> heroRiseSharplyLevelModelMap = ApplicationContextProvider.<Integer, HeroRiseSharplyLevelModel>getModelPoolMap("heroRiseSharplyLevel");
                     TreeMap<Integer, HeroRiseSharplyLevelModel> heroRiseSharplyLevelModelTreeMap = new TreeMap(heroRiseSharplyLevelModelMap);

                     for(HeroRiseSharplyLevelModel heroRiseSharplyLevelModel : heroRiseSharplyLevelModelTreeMap.values()) {
                        if (heroRiseSharplyLevelModel.getLv() > playerActivityDao.heroRise.level) {
                           if (heroRiseSharplyLevelModel.getLv() == (Integer)heroRiseSharplyLevelModelTreeMap.lastKey()) {
                              break;
                           }

                           for(ResourceModel resourceModel : heroRiseSharplyLevelModel.getRewards()) {
                              resourceModel.addResourceToList(resourceModels);
                           }

                           for(ResourceModel resourceModel : heroRiseSharplyLevelModel.getLockRewards()) {
                              resourceModel.addResourceToList(resourceModels);
                           }
                        }
                     }

                     this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, resourceModels);
                  } else {
                     this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_GOT_REWARD, resourceModels);
                  }

                  return;
               }

               taskData = (TaskData)playerActivityDao.next();
               if (playerDao.privilege_marquis > 0) {
                  if (taskData.state == 3) {
                     continue;
                  }
               } else if (taskData.state != 2) {
                  continue;
               }
               break;
            }

            TaskModel model = (TaskModel)ApplicationContextProvider.getModelPoolEntity("task", taskData.id);
            if (model != null) {
               for(ResourceModel resourceModel : model.getRewards()) {
                  if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL) {
                     playerDao.hero_raise_integral += resourceModel.getValue();
                     playerDao.updateOp();
                  }
               }

               taskData.finish();
            }
         }
      }
   }
}
