package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.SpringIllustrationModel;
import com.gzbz.model.SpringPlantingModel;
import com.gzbz.model.SpringPrayersModel;
import com.gzbz.model.SpringWaterProbabilityModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.SpringEnjoyIllustrationTaskPart;
import com.gzbz.task.SpringEnjoyPrayTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SpringEnjoyPart extends AbstractActivityPart {
   @Autowired
   private WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_IllustrationMain_12901(ThemeActivityMsg.C2S_IllustrationMain_12901 msg, String source) {
      this.sendIllustrationMain();
   }

   @MsgHandlerAnno
   public void C2S_IllustrationTaskCommit_12903(ThemeActivityMsg.C2S_IllustrationTaskCommit_12903 msg, String source) {
      SpringEnjoyIllustrationTaskPart springEnjoyIllustrationTaskPart = (SpringEnjoyIllustrationTaskPart)this.player.getMgrPart(SpringEnjoyIllustrationTaskPart.class);
      springEnjoyIllustrationTaskPart.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_RainTreeMain_12907(ThemeActivityMsg.C2S_RainTreeMain_12907 msg, String source) {
      this.sendRainTreeMain();
   }

   @MsgHandlerAnno
   public void C2S_RainTreeWater_12909(ThemeActivityMsg.C2S_RainTreeWater_12909 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityMgr activityMgr = this.getActivityMgr();
         boolean needDelResource = false;
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         if (msg.getCount() > 1) {
            needDelResource = this.rainWaterCheckResource(msg.getCount());
            if (!needDelResource) {
               return;
            }
         } else {
            int freeCount = ApplicationContextProvider.getConfigInt("FreewaterTime", 0);
            if (themeActivityDao.springEnjoyData.free >= freeCount) {
               needDelResource = this.rainWaterCheckResource(msg.getCount());
               if (!needDelResource) {
                  return;
               }
            } else {
               ++themeActivityDao.springEnjoyData.free;
            }
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         int totalProcess = 0;
         List<ResourceModel> resourceModels = new ArrayList();

         for(int planCount = 1; planCount <= msg.getCount(); ++planCount) {
            int curCount = themeActivityDao.springEnjoyData.cycle + 1;
            Map<Integer, SpringWaterProbabilityModel> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("CustomSpringWaterprobability", this.getPlayerActivityId());
            if (CollectionUtils.isEmpty(modelMap) || !modelMap.containsKey(curCount)) {
               this.player.failure(0);
               break;
            }

            SpringWaterProbabilityModel springWaterProbabilityModel = (SpringWaterProbabilityModel)modelMap.get(curCount);
            List<Integer> weighConfigList = springWaterProbabilityModel.getProgressValue();
            List<WeightRandom.WeightObj<Integer>> weightList = new ArrayList();

            for(int index = 0; index < weighConfigList.size(); ++index) {
               weightList.add(new WeightRandom.WeightObj(index, (double)(Integer)weighConfigList.get(index)));
            }

            WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightList);
            int process = (Integer)weightRandom.next() + 1;
            if (process == weighConfigList.size()) {
               curCount = 0;
            }

            totalProcess += process;
            themeActivityDao.springEnjoyData.cycle = (byte)curCount;
            ++themeActivityDao.springEnjoyData.planCount;
            resourceModels.addAll(itemBagPart.getRandomAward((Integer)springWaterProbabilityModel.getPriceReward().get(process - 1), 1));
         }

         if (resourceModels.isEmpty()) {
            this.player.failure(0);
         } else {
            themeActivityDao.updateOp();
            ResourceModel delResModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("pourIntoMould", ""));
            if (needDelResource) {
               this.player.delResource(delResModel.getType(), delResModel.getId(), (long)(delResModel.getValue() * msg.getCount()), 8, 842, msg.getCount(), 0, "");
            }

            ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            int curProcess = (int)rankPart.getScore(RankDefine.RankModule.ACTIVITY_POINT, String.valueOf(this.getActivityType()), String.valueOf(activityInfo.id));
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)(curProcess + totalProcess), false, String.valueOf(this.getActivityType()), String.valueOf(activityInfo.id));
            this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_RAIN_WATER, 8, 842, totalProcess, msg.getCount(), "");
            this.sendRainTreeWater(totalProcess, msg.getCount());

            for(ResourceModel resourceModel : resourceModels) {
               String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
               this.player.getOperationMgr().addExtraLog(this.player, 198, "春雨净灵浇水", "", "", strings[0], strings[2], strings[1], "0");
            }

            activityMgr.pushTaskEx("springEnjoyRainWater", new Object[]{totalProcess});
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RainTreeServerRank_12911(ThemeActivityMsg.C2S_RainTreeServerRank_12911 msg, String source) {
      if (!super.isServerActivityInvalid()) {
         ;
      }
   }

   @MsgHandlerAnno
   public void C2S_GreenTreeMain_12913(ThemeActivityMsg.C2S_GreenTreeMain_12913 msg, String source) {
      this.sendGreenTreeMain();
   }

   @MsgHandlerAnno
   public void C2S_GreenTreeReward_12915(ThemeActivityMsg.C2S_GreenTreeReward_12915 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         SpringPlantingModel springPlantingModel = (SpringPlantingModel)ApplicationContextProvider.getModelPoolEntity("SpringplantingTreesChange", msg.getId());
         if (springPlantingModel != null && springPlantingModel.getActivityId() == this.getPlayerActivityId()) {
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            if (themeActivityDao.springEnjoyData.planGot.contains(msg.getId())) {
               this.player.failure(24);
            } else {
               if (springPlantingModel.getChangeType() == 1) {
                  if (themeActivityDao.springEnjoyData.planCount < springPlantingModel.getNeedNum()) {
                     this.player.failure(33);
                     return;
                  }
               } else {
                  if (springPlantingModel.getChangeType() != 2) {
                     this.player.failure(0);
                     return;
                  }

                  WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
                  if (((ActivityData)worldDao.jsonData).seedProcess < springPlantingModel.getNeedNum()) {
                     this.player.failure(33);
                     return;
                  }
               }

               themeActivityDao.springEnjoyData.planGot.add(msg.getId());
               themeActivityDao.updateOp();
               this.player.addResource(springPlantingModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 843, msg.getId(), 0, "");
               this.sendTreeReward(msg.getId());
               Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>> planMap = (Map)ApplicationContextProvider.getModelPoolEntity("customSpringplantingTreesChange", this.getPlayerActivityId());
               Map<Integer, TreeMap<Integer, SpringPlantingModel>> roundPlantingModels = (Map)MapUtil.getOrDefault(planMap, springPlantingModel.getChangeType(), ConcurrentHashMap.class);
               int numIndex = 0;

               for(Integer modelId : (MapUtil.getOrDefault(roundPlantingModels, springPlantingModel.getRounds(), TreeMap.class)).keySet()) {
                  ++numIndex;
                  if (modelId == msg.getId()) {
                     break;
                  }
               }

               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getPlayerActivityId(), "绿树成荫", springPlantingModel.getRounds() + "-" + numIndex, springPlantingModel.getRounds() + "-" + numIndex, 0, springPlantingModel.getChangeType(), 0);
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GreenTreeRoundReward_12917(ThemeActivityMsg.C2S_GreenTreeRoundReward_12917 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>> planMap = (Map)ApplicationContextProvider.getModelPoolEntity("customSpringplantingTreesChange", this.getPlayerActivityId());
         Map<Integer, TreeMap<Integer, SpringPlantingModel>> personalPlanMap = (Map)MapUtil.getOrDefault(planMap, 1, ConcurrentHashMap.class);
         if (!personalPlanMap.containsKey(msg.getRound())) {
            this.player.failure(0);
         } else {
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            byte round = (byte)msg.getRound();
            if (themeActivityDao.springEnjoyData.round.contains(round)) {
               this.player.failure(24);
            } else {
               TreeMap<Integer, SpringPlantingModel> modelTreeMap = (TreeMap)personalPlanMap.get(msg.getRound());
               if (((SpringPlantingModel)modelTreeMap.lastEntry().getValue()).getNeedNum() > themeActivityDao.springEnjoyData.planCount) {
                  this.player.failure(33);
               } else {
                  themeActivityDao.springEnjoyData.round.add(round);
                  themeActivityDao.updateOp();
                  List<ResourceModel> rewards = ((SpringPlantingModel)modelTreeMap.firstEntry().getValue()).getRoundsRewards();
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 844, round, 0, "");
                  this.sendTreeRoundReward(msg.getRound());
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getPlayerActivityId(), "绿树成荫", String.valueOf(round), String.valueOf(round), 0, 1, 0);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SpringEnjoyPrayMain_12921(ThemeActivityMsg.C2S_SpringEnjoyPrayMain_12921 msg, String source) {
      this.sendPrayMain();
   }

   @MsgHandlerAnno
   public void C2S_SpringEnjoyPray_12923(ThemeActivityMsg.C2S_SpringEnjoyPray_12923 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         if (!themeActivityDao.springEnjoyData.prays.isEmpty()) {
            this.player.failure(8018);
         } else {
            int prayNum = ApplicationContextProvider.getConfigInt("springRewardNum", 0);
            if (msg.getIdCount() != prayNum) {
               this.player.failure(0);
            } else {
               StringBuilder stringBuilder = new StringBuilder();
               Map<Integer, Boolean> prays = new HashMap();
               SpringEnjoyPrayTaskPart springEnjoyPrayTaskPart = (SpringEnjoyPrayTaskPart)this.player.getMgrPart(SpringEnjoyPrayTaskPart.class);

               for(Integer prayId : msg.getIdList()) {
                  SpringPrayersModel springPrayersModel = (SpringPrayersModel)ApplicationContextProvider.getModelPoolEntity("springprayers", prayId);
                  if (springPrayersModel == null || springPrayersModel.getActivityId() != this.getPlayerActivityId()) {
                     this.player.failure(0);
                     return;
                  }

                  if (springPrayersModel.getRewardsNeed() == 2) {
                     TaskData taskData = springEnjoyPrayTaskPart.getTask(springPrayersModel.getId());
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

               themeActivityDao.springEnjoyData.prays.putAll(prays);
               themeActivityDao.updateOp();
               this.sendPray(msg.getIdList());
               if (stringBuilder.length() > 0) {
                  stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getPlayerActivityId(), "暖春锦愿", stringBuilder.toString(), stringBuilder.toString(), 0, 0, 0);
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_IllustrationExchange_12929(ThemeActivityMsg.C2S_IllustrationExchange_12929 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         Map<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>>getModelPoolMap("cuistomSpringlllustration");
         Map<Integer, TreeMap<Integer, SpringIllustrationModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, ConcurrentHashMap.class);
         if (activityDataModelMap.containsKey(msg.getIllustrationId()) && !((TreeMap)activityDataModelMap.get(msg.getIllustrationId())).isEmpty()) {
            SpringEnjoyIllustrationTaskPart springEnjoyIllustrationTaskPart = (SpringEnjoyIllustrationTaskPart)this.player.getMgrPart(SpringEnjoyIllustrationTaskPart.class);
            Map<Integer, TaskData> taskDataMap = springEnjoyIllustrationTaskPart.getTasksMap();
            TreeMap<Integer, SpringIllustrationModel> illustrationModelMap = (TreeMap)activityDataModelMap.get(msg.getIllustrationId());
            boolean isSatisfy = true;

            for(SpringIllustrationModel springIllustrationModel : illustrationModelMap.values()) {
               TaskData taskData = (TaskData)taskDataMap.get(springIllustrationModel.getTaskId());
               if (taskData == null || taskData.state < 2) {
                  isSatisfy = false;
                  break;
               }
            }

            if (!illustrationModelMap.isEmpty() && isSatisfy) {
               SpringIllustrationModel springIllustrationModel = (SpringIllustrationModel)illustrationModelMap.firstEntry().getValue();
               if (!this.player.checkResourceNum(springIllustrationModel.getExchangeType(), springIllustrationModel.getExchangeId(), springIllustrationModel.getExchangeNum())) {
                  this.player.failure(34);
               } else {
                  this.player.delResource(springIllustrationModel.getExchangeType(), springIllustrationModel.getExchangeId(), (long)springIllustrationModel.getExchangeNum(), 8, 841, msg.getIllustrationId(), 0, "");
                  this.player.addResource(springIllustrationModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 841, msg.getIllustrationId(), 0, "");
                  this.sendExchange(msg.getIllustrationId());
               }
            } else {
               this.player.failure(8019);
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   private boolean rainWaterCheckResource(int count) {
      ResourceModel resourceModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("pourIntoMould", ""));
      if (ResourceModel.checkTotalNumError(resourceModel.getValue(), count)) {
         return false;
      } else if (!this.player.checkResourceNum(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * count)) {
         this.player.failure(34);
         return false;
      } else {
         return true;
      }
   }

   private void sendIllustrationMain() {
      if (!super.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         SpringEnjoyIllustrationTaskPart springEnjoyIllustrationTaskPart = (SpringEnjoyIllustrationTaskPart)this.player.getMgrPart(SpringEnjoyIllustrationTaskPart.class);
         Map<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>>getModelPoolMap("cuistomSpringlllustration");
         Map<Integer, TreeMap<Integer, SpringIllustrationModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, ConcurrentHashMap.class);
         ThemeActivityMsg.S2C_IllustrationMain_12902.Builder resp = ThemeActivityMsg.S2C_IllustrationMain_12902.newBuilder();
         resp.setDay(DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1);
         resp.setEndTime(activityInfo.end);

         for(Map.Entry<Integer, TreeMap<Integer, SpringIllustrationModel>> entry : activityDataModelMap.entrySet()) {
            int illustrationId = (Integer)entry.getKey();
            ThemeActivityMsg.IllustrationData.Builder builder = ThemeActivityMsg.IllustrationData.newBuilder();
            builder.setIllustrationId(illustrationId);
            TreeMap<Integer, SpringIllustrationModel> illustrationModelMap = (TreeMap)entry.getValue();

            for(SpringIllustrationModel springIllustrationModel : illustrationModelMap.values()) {
               TaskData taskData = springEnjoyIllustrationTaskPart.getTask(springIllustrationModel.getTaskId());
               if (taskData != null) {
                  builder.addTask(springEnjoyIllustrationTaskPart.buildTask(taskData));
               }
            }

            resp.addIllustration(builder);
         }

         this.player.sendMsg(resp.build());
      }
   }

   private void sendRainTreeMain() {
      if (!super.isServerActivityInvalid()) {
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         ThemeActivityMsg.S2C_RainTreeMain_12908.Builder resp = ThemeActivityMsg.S2C_RainTreeMain_12908.newBuilder();
         resp.setProcess(((ActivityData)worldDao.jsonData).seedProcess);
         resp.setFreeCount(themeActivityDao.springEnjoyData.free);
         resp.setCycleCount(themeActivityDao.springEnjoyData.cycle);
         resp.setPlanCount(themeActivityDao.springEnjoyData.planCount);
         this.player.sendMsg(resp.build());
      }
   }

   private void sendRainTreeWater(int process, int count) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      ThemeActivityMsg.S2C_RainTreeWater_12910.Builder resp = ThemeActivityMsg.S2C_RainTreeWater_12910.newBuilder();
      resp.setFreeCount(themeActivityDao.springEnjoyData.free);
      resp.setCycleCount(themeActivityDao.springEnjoyData.cycle);
      resp.setProcess(process);
      resp.setPlanCount(themeActivityDao.springEnjoyData.planCount);
      resp.setCount(count);
      this.player.sendMsg(resp.build());
   }

   private void sendGreenTreeMain() {
      if (!super.isServerActivityInvalid()) {
         ThemeActivityMsg.S2C_GreenTreeMain_12914.Builder resp = ThemeActivityMsg.S2C_GreenTreeMain_12914.newBuilder();
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>> planMap = (Map)ApplicationContextProvider.getModelPoolEntity("customSpringplantingTreesChange", this.getPlayerActivityId());
         Map<Integer, TreeMap<Integer, SpringPlantingModel>> personalPlanMap = (Map)MapUtil.getOrDefault(planMap, 1, ConcurrentHashMap.class);

         for(Map.Entry<Integer, TreeMap<Integer, SpringPlantingModel>> entry : personalPlanMap.entrySet()) {
            int round = (Integer)entry.getKey();
            TreeMap<Integer, SpringPlantingModel> springPlantingModelTreeMap = (TreeMap)entry.getValue();
            ThemeActivityMsg.GreenTreeRoundData.Builder builder = ThemeActivityMsg.GreenTreeRoundData.newBuilder();
            builder.setRound(round);
            builder.setRoundReward(themeActivityDao.springEnjoyData.round.contains((byte)round));

            for(int gotId : themeActivityDao.springEnjoyData.planGot) {
               if (springPlantingModelTreeMap.containsKey(gotId)) {
                  builder.addGotId(gotId);
               }
            }

            resp.addRoundData(builder);
         }

         Map<Integer, TreeMap<Integer, SpringPlantingModel>> serverPlanMap = (Map)MapUtil.getOrDefault(planMap, 2, ConcurrentHashMap.class);

         for(TreeMap<Integer, SpringPlantingModel> serverModelMap : serverPlanMap.values()) {
            for(int gotId : themeActivityDao.springEnjoyData.planGot) {
               if (serverModelMap.containsKey(gotId)) {
                  resp.addGotId(gotId);
               }
            }
         }

         this.player.sendMsg(resp.build());
      }
   }

   private void sendTreeReward(int id) {
      ThemeActivityMsg.S2C_GreenTreeReward_12916.Builder resp = ThemeActivityMsg.S2C_GreenTreeReward_12916.newBuilder();
      resp.setId(id);
      this.player.sendMsg(resp.build());
   }

   private void sendTreeRoundReward(int round) {
      ThemeActivityMsg.S2C_GreenTreeRoundReward_12918.Builder resp = ThemeActivityMsg.S2C_GreenTreeRoundReward_12918.newBuilder();
      resp.setRound(round);
      this.player.sendMsg(resp.build());
   }

   private void sendPrayMain() {
      if (!super.isServerActivityInvalid()) {
         ThemeActivityMsg.S2C_SpringEnjoyPrayMain_12922.Builder resp = ThemeActivityMsg.S2C_SpringEnjoyPrayMain_12922.newBuilder();
         SpringEnjoyPrayTaskPart springEnjoyPrayTaskPart = (SpringEnjoyPrayTaskPart)this.player.getMgrPart(SpringEnjoyPrayTaskPart.class);
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());

         for(TaskData taskData : springEnjoyPrayTaskPart.getTasksMap().values()) {
            resp.addTask(springEnjoyPrayTaskPart.buildTask(taskData));
         }

         resp.addAllId(themeActivityDao.springEnjoyData.prays.keySet());
         this.player.sendMsg(resp.build());
      }
   }

   private void sendPray(List<Integer> ids) {
      ThemeActivityMsg.S2C_SpringEnjoyPray_12924.Builder resp = ThemeActivityMsg.S2C_SpringEnjoyPray_12924.newBuilder();
      resp.addAllId(ids);
      this.player.sendMsg(resp.build());
   }

   private void sendExchange(int illustrationId) {
      ThemeActivityMsg.S2C_IllustrationExchange_12930.Builder msg = ThemeActivityMsg.S2C_IllustrationExchange_12930.newBuilder();
      msg.setIllustrationId(illustrationId);
      this.player.sendMsg(msg.build());
   }

   public void sendInfo() {
      this.sendIllustrationMain();
      this.sendPrayMain();
      this.sendRainTreeMain();
      this.sendGreenTreeMain();
   }

   public int getActivityType() {
      return 17;
   }

   public void activityEnd(int oldActivityId) {
      this.prayReward(oldActivityId);
   }

   public void rotateReset(int oldActivityId) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      themeActivityDao.springEnjoyData.reset();
      themeActivityDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_SPRING_ENJOY_ILLUSTRATION);
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_SPRING_ENJOY_PRAY);
      SpringEnjoyIllustrationTaskPart springEnjoyIllustrationTaskPart = (SpringEnjoyIllustrationTaskPart)this.player.getMgrPart(SpringEnjoyIllustrationTaskPart.class);
      springEnjoyIllustrationTaskPart.trigger();
      SpringEnjoyPrayTaskPart springEnjoyPrayTaskPart = (SpringEnjoyPrayTaskPart)this.player.getMgrPart(SpringEnjoyPrayTaskPart.class);
      springEnjoyPrayTaskPart.trigger();
      this.clearActivityGift(24);
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
            this.prayReward(this.getPlayerActivityId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_SPRING_ENJOY_PRAY);
            themeActivityDao.springEnjoyData.free = 0;
            themeActivityDao.updateOp();
            SpringEnjoyPrayTaskPart springEnjoyPrayTaskPart = (SpringEnjoyPrayTaskPart)this.player.getMgrPart(SpringEnjoyPrayTaskPart.class);
            springEnjoyPrayTaskPart.trigger();
         }
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         PlayerDao playerDao = this.player.getPlayerDao();
         int springWindowTime = ApplicationContextProvider.getConfigInt("springWindowTime", Integer.MAX_VALUE);
         if (!themeActivityDao.springEnjoyData.firstNotify) {
            themeActivityDao.springEnjoyData.firstNotify = true;
            themeActivityDao.updateOp();
            this.notifyActivityMainMsg();
         } else if (System.currentTimeMillis() - playerDao.lastLoginTime >= (long)springWindowTime * 1000L) {
            this.notifyActivityMainMsg();
         }

      }
   }

   private void notifyActivityMainMsg() {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         ThemeActivityMsg.S2C_SpringEnjoyMainNotify_12928.Builder msg = ThemeActivityMsg.S2C_SpringEnjoyMainNotify_12928.newBuilder();
         msg.setEndTime(activityInfo.end);
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         msg.addAllRank(rankPart.buildRankListDataMsg(RankDefine.RankModule.ACTIVITY_POINT, 3, String.valueOf(this.getActivityType()), String.valueOf(activityInfo.id)));
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         int myRank = rankMgr.getRank(RankDefine.RankModule.ACTIVITY_POINT, this.player.getPlayerId(), String.valueOf(this.getActivityType()), String.valueOf(activityInfo.id));
         RankData myRankData = new RankData(rankMgr.getScore(RankDefine.RankModule.ACTIVITY_POINT, this.player.getPlayerId(), String.valueOf(this.getActivityType()), String.valueOf(activityInfo.id)), myRank, this.player.getPlayerId());
         msg.setMyRank(rankPart.buildPlayerRankDataMsg(myRankData, RankDefine.RankModule.ACTIVITY_POINT));
         this.player.sendMsg(msg.build());
      }
   }

   private void prayReward(int activityId) {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      List<ResourceModel> resourceModels = new ArrayList();

      for(int prayId : themeActivityDao.springEnjoyData.prays.keySet()) {
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
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 8, 847);
      }

      themeActivityDao.springEnjoyData.prays.clear();
      themeActivityDao.updateOp();
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
         List<ResourceModel> resourceModels = new ArrayList();
         List<Integer> gotIds = new ArrayList();
         Map<Integer, SpringPlantingModel> modelMap = ApplicationContextProvider.<Integer, SpringPlantingModel>getModelPoolMap("SpringplantingTreesChange");

         for(SpringPlantingModel model : modelMap.values()) {
            if (model.getActivityId() == this.getPlayerActivityId() && !themeActivityDao.springEnjoyData.planGot.contains(model.getId())) {
               gotIds.add(model.getId());

               for(ResourceModel resourceModel : model.getRewards()) {
                  ResourceModel.addResourceToList(resourceModels, resourceModel);
               }
            }
         }

         themeActivityDao.springEnjoyData.planGot.addAll(gotIds);
         themeActivityDao.updateOp();
         this.sendMergeMail(CentreAwardModel.TYPE_MERGE_SPRING_ENJOY_PLAN_REWARD, resourceModels);
         List<ResourceModel> taskResourceList = new ArrayList();
         SpringEnjoyIllustrationTaskPart taskPart = (SpringEnjoyIllustrationTaskPart)this.player.getMgrPart(SpringEnjoyIllustrationTaskPart.class);

         for(TaskData taskData : taskPart.getTasksMap().values()) {
            if (taskData.state != 3) {
               SevenDaysTaskModel taskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
               if (taskModel != null) {
                  for(ResourceModel reward : taskModel.getRewards()) {
                     ResourceModel.addResourceToList(taskResourceList, reward);
                  }
               }
            }
         }

         TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
         taskCustomCache.delete(taskPart.getModule());
         this.sendMergeMail(CentreAwardModel.TYPE_MERGE_SPRING_ENJOY_TASK_REWARD, taskResourceList);
      }
   }
}
