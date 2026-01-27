package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.KittyActivityDao;
import com.gzbz.db.PlayerDao;
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
import com.gzbz.protobuf.KittyActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.KittyIllustrationTaskPart;
import com.gzbz.task.KittyPrayTaskPart;
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
public class KittyPart extends AbstractActivityPart {
   @Autowired
   private WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_IllustrationMain_15901(KittyActivityMsg.C2S_IllustrationMain_15901 msg, String source) {
      this.sendIllustrationMain();
   }

   @MsgHandlerAnno
   public void C2S_IllustrationTaskCommit_15903(KittyActivityMsg.C2S_IllustrationTaskCommit_15903 msg, String source) {
      KittyIllustrationTaskPart kittyIllustrationTaskPart = (KittyIllustrationTaskPart)this.player.getMgrPart(KittyIllustrationTaskPart.class);
      kittyIllustrationTaskPart.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_RainTreeMain_15907(KittyActivityMsg.C2S_RainTreeMain_15907 msg, String source) {
      this.sendRainTreeMain();
   }

   @MsgHandlerAnno
   public void C2S_RainTreeWater_15909(KittyActivityMsg.C2S_RainTreeWater_15909 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityMgr activityMgr = this.getActivityMgr();
         boolean needDelResource = false;
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
         if (msg.getCount() > 1) {
            needDelResource = this.rainWaterCheckResource(msg.getCount());
            if (!needDelResource) {
               return;
            }
         } else {
            int freeCount = ApplicationContextProvider.getConfigInt("kittyFreeWaterTime", 0);
            if (kittyActivityDao.springEnjoyData.free >= freeCount) {
               needDelResource = this.rainWaterCheckResource(msg.getCount());
               if (!needDelResource) {
                  return;
               }
            } else {
               ++kittyActivityDao.springEnjoyData.free;
            }
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         int totalProcess = 0;
         List<ResourceModel> resourceModels = new ArrayList();

         for(int planCount = 1; planCount <= msg.getCount(); ++planCount) {
            int curCount = kittyActivityDao.springEnjoyData.cycle + 1;
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
            kittyActivityDao.springEnjoyData.cycle = (byte)curCount;
            ++kittyActivityDao.springEnjoyData.planCount;
            resourceModels.addAll(itemBagPart.getRandomAward((Integer)springWaterProbabilityModel.getPriceReward().get(process - 1), 1));
         }

         if (resourceModels.isEmpty()) {
            this.player.failure(0);
         } else {
            kittyActivityDao.updateOp();
            ResourceModel delResModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("kittyWaterRes", ""));
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
               this.player.getOperationMgr().addExtraLog(this.player, 198, "春意盎然活动换皮", "", "", strings[0], strings[2], strings[1], "0");
            }

            activityMgr.pushTaskEx("kittyRainWater", new Object[]{totalProcess});
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RainTreeServerRank_15911(KittyActivityMsg.C2S_RainTreeServerRank_15911 msg, String source) {
      if (!super.isServerActivityInvalid()) {
         ;
      }
   }

   @MsgHandlerAnno
   public void C2S_GreenTreeMain_15913(KittyActivityMsg.C2S_GreenTreeMain_15913 msg, String source) {
      this.sendGreenTreeMain();
   }

   @MsgHandlerAnno
   public void C2S_GreenTreeReward_15915(KittyActivityMsg.C2S_GreenTreeReward_15915 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         SpringPlantingModel springPlantingModel = (SpringPlantingModel)ApplicationContextProvider.getModelPoolEntity("SpringplantingTreesChange", msg.getId());
         if (springPlantingModel != null && springPlantingModel.getActivityId() == this.getPlayerActivityId()) {
            KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
            if (kittyActivityDao.springEnjoyData.planGot.contains(msg.getId())) {
               this.player.failure(24);
            } else {
               if (springPlantingModel.getChangeType() == 1) {
                  if (kittyActivityDao.springEnjoyData.planCount < springPlantingModel.getNeedNum()) {
                     this.player.failure(33);
                     return;
                  }
               } else {
                  if (springPlantingModel.getChangeType() != 2) {
                     this.player.failure(0);
                     return;
                  }

                  WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
                  if (((ActivityData)worldDao.jsonData).kittySeedProcess < springPlantingModel.getNeedNum()) {
                     this.player.failure(33);
                     return;
                  }
               }

               kittyActivityDao.springEnjoyData.planGot.add(msg.getId());
               kittyActivityDao.updateOp();
               this.player.addResource(springPlantingModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 843, msg.getId(), 0, "");
               this.sendTreeReward(msg.getId());
               Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>> planMap = (Map)ApplicationContextProvider.getModelPoolEntity("customSpringplantingTreesChange", this.getPlayerActivityId());
               Map<Integer, TreeMap<Integer, SpringPlantingModel>> roundPlantingModels = (Map)MapUtil.getOrDefault(planMap, springPlantingModel.getChangeType(), ConcurrentHashMap.class);
               int numIndex = 0;

               for(Integer modelId : ((TreeMap)MapUtil.getOrDefault(roundPlantingModels, springPlantingModel.getRounds(), TreeMap.class)).keySet()) {
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
   public void C2S_GreenTreeRoundReward_15917(KittyActivityMsg.C2S_GreenTreeRoundReward_15917 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>> planMap = (Map)ApplicationContextProvider.getModelPoolEntity("customSpringplantingTreesChange", this.getPlayerActivityId());
         Map<Integer, TreeMap<Integer, SpringPlantingModel>> personalPlanMap = (Map)MapUtil.getOrDefault(planMap, 1, ConcurrentHashMap.class);
         if (!personalPlanMap.containsKey(msg.getRound())) {
            this.player.failure(0);
         } else {
            KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
            byte round = (byte)msg.getRound();
            if (kittyActivityDao.springEnjoyData.round.contains(round)) {
               this.player.failure(24);
            } else {
               TreeMap<Integer, SpringPlantingModel> modelTreeMap = (TreeMap)personalPlanMap.get(msg.getRound());
               if (((SpringPlantingModel)modelTreeMap.lastEntry().getValue()).getNeedNum() > kittyActivityDao.springEnjoyData.planCount) {
                  this.player.failure(33);
               } else {
                  kittyActivityDao.springEnjoyData.round.add(round);
                  kittyActivityDao.updateOp();
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
   public void C2S_SpringEnjoyPrayMain_15921(KittyActivityMsg.C2S_SpringEnjoyPrayMain_15921 msg, String source) {
      this.sendPrayMain();
   }

   @MsgHandlerAnno
   public void C2S_SpringEnjoyPray_15923(KittyActivityMsg.C2S_SpringEnjoyPray_15923 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
         if (!kittyActivityDao.springEnjoyData.prays.isEmpty()) {
            this.player.failure(8018);
         } else {
            int prayNum = ApplicationContextProvider.getConfigInt("springPrayNum", 0);
            if (msg.getIdCount() != prayNum) {
               this.player.failure(0);
            } else {
               StringBuilder stringBuilder = new StringBuilder();
               Map<Integer, Boolean> prays = new HashMap();
               KittyPrayTaskPart kittyPrayTaskPart = (KittyPrayTaskPart)this.player.getMgrPart(KittyPrayTaskPart.class);

               for(Integer prayId : msg.getIdList()) {
                  SpringPrayersModel springPrayersModel = (SpringPrayersModel)ApplicationContextProvider.getModelPoolEntity("springprayers", prayId);
                  if (springPrayersModel == null || springPrayersModel.getActivityId() != this.getPlayerActivityId()) {
                     this.player.failure(0);
                     return;
                  }

                  if (springPrayersModel.getRewardsNeed() == 2) {
                     TaskData taskData = kittyPrayTaskPart.getTask(springPrayersModel.getId());
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

               kittyActivityDao.springEnjoyData.prays.putAll(prays);
               kittyActivityDao.updateOp();
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
   public void C2S_IllustrationExchange_15929(KittyActivityMsg.C2S_IllustrationExchange_15929 msg, String source) {
      if (super.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         Map<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>>getModelPoolMap("cuistomSpringlllustration");
         Map<Integer, TreeMap<Integer, SpringIllustrationModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, ConcurrentHashMap.class);
         if (activityDataModelMap.containsKey(msg.getIllustrationId()) && !((TreeMap)activityDataModelMap.get(msg.getIllustrationId())).isEmpty()) {
            KittyIllustrationTaskPart kittyIllustrationTaskPart = (KittyIllustrationTaskPart)this.player.getMgrPart(KittyIllustrationTaskPart.class);
            Map<Integer, TaskData> taskDataMap = kittyIllustrationTaskPart.getTasksMap();
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
      ResourceModel resourceModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("kittyWaterRes", ""));
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
         KittyIllustrationTaskPart kittyIllustrationTaskPart = (KittyIllustrationTaskPart)this.player.getMgrPart(KittyIllustrationTaskPart.class);
         Map<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>> allModelMap = ApplicationContextProvider.<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>>getModelPoolMap("cuistomSpringlllustration");
         Map<Integer, TreeMap<Integer, SpringIllustrationModel>> activityDataModelMap = (Map)MapUtil.getOrDefault(allModelMap, activityInfo.id, ConcurrentHashMap.class);
         KittyActivityMsg.S2C_IllustrationMain_15902.Builder resp = KittyActivityMsg.S2C_IllustrationMain_15902.newBuilder();
         resp.setDay(DateUtil.difftimeDay(new Timestamp((long)activityInfo.start * 1000L)) + 1);
         resp.setEndTime(activityInfo.end);

         for(Map.Entry<Integer, TreeMap<Integer, SpringIllustrationModel>> entry : activityDataModelMap.entrySet()) {
            int illustrationId = (Integer)entry.getKey();
            KittyActivityMsg.IllustrationData.Builder builder = KittyActivityMsg.IllustrationData.newBuilder();
            builder.setIllustrationId(illustrationId);
            TreeMap<Integer, SpringIllustrationModel> illustrationModelMap = (TreeMap)entry.getValue();

            for(SpringIllustrationModel springIllustrationModel : illustrationModelMap.values()) {
               TaskData taskData = kittyIllustrationTaskPart.getTask(springIllustrationModel.getTaskId());
               if (taskData != null) {
                  builder.addTask(kittyIllustrationTaskPart.buildTask(taskData));
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
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
         KittyActivityMsg.S2C_RainTreeMain_15908.Builder resp = KittyActivityMsg.S2C_RainTreeMain_15908.newBuilder();
         resp.setProcess(((ActivityData)worldDao.jsonData).kittySeedProcess);
         resp.setFreeCount(kittyActivityDao.springEnjoyData.free);
         resp.setCycleCount(kittyActivityDao.springEnjoyData.cycle);
         resp.setPlanCount(kittyActivityDao.springEnjoyData.planCount);
         this.player.sendMsg(resp.build());
      }
   }

   private void sendRainTreeWater(int process, int count) {
      KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
      KittyActivityMsg.S2C_RainTreeWater_15910.Builder resp = KittyActivityMsg.S2C_RainTreeWater_15910.newBuilder();
      resp.setFreeCount(kittyActivityDao.springEnjoyData.free);
      resp.setCycleCount(kittyActivityDao.springEnjoyData.cycle);
      resp.setProcess(process);
      resp.setPlanCount(kittyActivityDao.springEnjoyData.planCount);
      resp.setCount(count);
      this.player.sendMsg(resp.build());
   }

   private void sendGreenTreeMain() {
      if (!super.isServerActivityInvalid()) {
         KittyActivityMsg.S2C_GreenTreeMain_15914.Builder resp = KittyActivityMsg.S2C_GreenTreeMain_15914.newBuilder();
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
         Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>> planMap = (Map)ApplicationContextProvider.getModelPoolEntity("customSpringplantingTreesChange", this.getPlayerActivityId());
         Map<Integer, TreeMap<Integer, SpringPlantingModel>> personalPlanMap = (Map)MapUtil.getOrDefault(planMap, 1, ConcurrentHashMap.class);

         for(Map.Entry<Integer, TreeMap<Integer, SpringPlantingModel>> entry : personalPlanMap.entrySet()) {
            int round = (Integer)entry.getKey();
            TreeMap<Integer, SpringPlantingModel> springPlantingModelTreeMap = (TreeMap)entry.getValue();
            KittyActivityMsg.GreenTreeRoundData.Builder builder = KittyActivityMsg.GreenTreeRoundData.newBuilder();
            builder.setRound(round);
            builder.setRoundReward(kittyActivityDao.springEnjoyData.round.contains((byte)round));

            for(int gotId : kittyActivityDao.springEnjoyData.planGot) {
               if (springPlantingModelTreeMap.containsKey(gotId)) {
                  builder.addGotId(gotId);
               }
            }

            resp.addRoundData(builder);
         }

         Map<Integer, TreeMap<Integer, SpringPlantingModel>> serverPlanMap = (Map)MapUtil.getOrDefault(planMap, 2, ConcurrentHashMap.class);

         for(TreeMap<Integer, SpringPlantingModel> serverModelMap : serverPlanMap.values()) {
            for(int gotId : kittyActivityDao.springEnjoyData.planGot) {
               if (serverModelMap.containsKey(gotId)) {
                  resp.addGotId(gotId);
               }
            }
         }

         this.player.sendMsg(resp.build());
      }
   }

   private void sendTreeReward(int id) {
      KittyActivityMsg.S2C_GreenTreeReward_15916.Builder resp = KittyActivityMsg.S2C_GreenTreeReward_15916.newBuilder();
      resp.setId(id);
      this.player.sendMsg(resp.build());
   }

   private void sendTreeRoundReward(int round) {
      KittyActivityMsg.S2C_GreenTreeRoundReward_15918.Builder resp = KittyActivityMsg.S2C_GreenTreeRoundReward_15918.newBuilder();
      resp.setRound(round);
      this.player.sendMsg(resp.build());
   }

   private void sendPrayMain() {
      if (!super.isServerActivityInvalid()) {
         KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.Builder resp = KittyActivityMsg.S2C_SpringEnjoyPrayMain_15922.newBuilder();
         KittyPrayTaskPart kittyPrayTaskPart = (KittyPrayTaskPart)this.player.getMgrPart(KittyPrayTaskPart.class);
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());

         for(TaskData taskData : kittyPrayTaskPart.getTasksMap().values()) {
            resp.addTask(kittyPrayTaskPart.buildTask(taskData));
         }

         resp.addAllId(kittyActivityDao.springEnjoyData.prays.keySet());
         this.player.sendMsg(resp.build());
      }
   }

   private void sendPray(List<Integer> ids) {
      KittyActivityMsg.S2C_SpringEnjoyPray_15924.Builder resp = KittyActivityMsg.S2C_SpringEnjoyPray_15924.newBuilder();
      resp.addAllId(ids);
      this.player.sendMsg(resp.build());
   }

   private void sendExchange(int illustrationId) {
      KittyActivityMsg.S2C_IllustrationExchange_15930.Builder msg = KittyActivityMsg.S2C_IllustrationExchange_15930.newBuilder();
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
      return 43;
   }

   public void activityEnd(int oldActivityId) {
      this.prayReward(oldActivityId);
   }

   public void rotateReset(int oldActivityId) {
      KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
      kittyActivityDao.springEnjoyData.reset();
      kittyActivityDao.updateOp();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_KITTY_ILLUSTRATION);
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_KITTY_PRAY);
      KittyIllustrationTaskPart kittyIllustrationTaskPart = (KittyIllustrationTaskPart)this.player.getMgrPart(KittyIllustrationTaskPart.class);
      kittyIllustrationTaskPart.trigger();
      KittyPrayTaskPart kittyPrayTaskPart = (KittyPrayTaskPart)this.player.getMgrPart(KittyPrayTaskPart.class);
      kittyPrayTaskPart.trigger();
      this.clearActivityGift(24);
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
            this.prayReward(this.getPlayerActivityId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_KITTY_PRAY);
            kittyActivityDao.springEnjoyData.free = 0;
            kittyActivityDao.updateOp();
            KittyPrayTaskPart kittyPrayTaskPart = (KittyPrayTaskPart)this.player.getMgrPart(KittyPrayTaskPart.class);
            kittyPrayTaskPart.trigger();
         }
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
         PlayerDao playerDao = this.player.getPlayerDao();
         int springWindowTime = ApplicationContextProvider.getConfigInt("kittyWindowTime", Integer.MAX_VALUE);
         if (!kittyActivityDao.springEnjoyData.firstNotify) {
            kittyActivityDao.springEnjoyData.firstNotify = true;
            kittyActivityDao.updateOp();
            this.notifyActivityMainMsg();
         } else if (System.currentTimeMillis() - playerDao.lastLoginTime >= (long)springWindowTime * 1000L) {
            this.notifyActivityMainMsg();
         }

      }
   }

   private void notifyActivityMainMsg() {
      if (!this.isServerActivityInvalid()) {
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.Builder msg = KittyActivityMsg.S2C_SpringEnjoyMainNotify_15928.newBuilder();
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
      KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
      List<ResourceModel> resourceModels = new ArrayList();

      for(int prayId : kittyActivityDao.springEnjoyData.prays.keySet()) {
         SpringPrayersModel springPrayersModel = (SpringPrayersModel)ApplicationContextProvider.getModelPoolEntity("springprayers", prayId);
         if (springPrayersModel != null && springPrayersModel.getActivityId() == activityId) {
            resourceModels.addAll(springPrayersModel.getRewards());
         }
      }

      if (!resourceModels.isEmpty()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> rewardMailMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_KITTY_PRAY);
         CentreAwardModel centreAwardModel = (CentreAwardModel)rewardMailMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 8, 847);
      }

      kittyActivityDao.springEnjoyData.prays.clear();
      kittyActivityDao.updateOp();
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         KittyActivityDao kittyActivityDao = (KittyActivityDao)this.player.getData("tb_kitty_activity", this.player.getPlayerId());
         List<ResourceModel> resourceModels = new ArrayList();
         List<Integer> gotIds = new ArrayList();
         Map<Integer, SpringPlantingModel> modelMap = ApplicationContextProvider.<Integer, SpringPlantingModel>getModelPoolMap("SpringplantingTreesChange");

         for(SpringPlantingModel model : modelMap.values()) {
            if (model.getActivityId() == this.getPlayerActivityId() && !kittyActivityDao.springEnjoyData.planGot.contains(model.getId())) {
               gotIds.add(model.getId());

               for(ResourceModel resourceModel : model.getRewards()) {
                  ResourceModel.addResourceToList(resourceModels, resourceModel);
               }
            }
         }

         kittyActivityDao.springEnjoyData.planGot.addAll(gotIds);
         kittyActivityDao.updateOp();
         this.sendMergeMail(CentreAwardModel.TYPE_MERGE_KITTY_PLAN_REWARD, resourceModels);
         List<ResourceModel> taskResourceList = new ArrayList();
         KittyIllustrationTaskPart taskPart = (KittyIllustrationTaskPart)this.player.getMgrPart(KittyIllustrationTaskPart.class);

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
         this.sendMergeMail(CentreAwardModel.TYPE_MERGE_KITTY_TASK_REWARD, taskResourceList);
      }
   }
}
