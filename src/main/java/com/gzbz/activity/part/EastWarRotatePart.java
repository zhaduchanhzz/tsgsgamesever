package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.CustomizeGiftData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CustomizeGiftBagModel;
import com.gzbz.model.EastWarAwardModel;
import com.gzbz.model.EastWarCoincidenceModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.EastWarRotateMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.EastWarTaskRotatePart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class EastWarRotatePart extends AbstractActivityPart {
   private final int COINCIDENCE_TYPE_REWARD = 1;
   private final int COINCIDENCE_TYPE_BOX = 2;
   private final String EAST_WAR_BOX_OPEN2 = "eastWarBoxOpen2";
   private final String COINCIDENCE_TIME2 = "eastWarCoincidenceTime2";
   private final String EAST_WAR_ID2 = "eastWarId2";
   private final String EAST_WAR_MATERIAL2 = "eastWarMaterial2";
   private final String EAST_WAR_MADEVALUE2 = "eastWarMadevalue2";
   private final String EAST_WAR_FREE_TIME2 = "eastWarFreeTimes2";
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      EastWarTaskRotatePart eastWarTaskRotatePart = (EastWarTaskRotatePart)this.player.getMgrPart(EastWarTaskRotatePart.class);
      eastWarTaskRotatePart.checkLogin();
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.eastWarRotateData.freeDrinkNum = 0;
      playerActivityDao.updateOp();
      EastWarTaskRotatePart eastWarTaskRotatePart = (EastWarTaskRotatePart)this.player.getMgrPart(EastWarTaskRotatePart.class);
      eastWarTaskRotatePart.checkResetDaily();
   }

   public void sendInfo() {
      EastWarRotateMsg.S2C_OpenUiResult_16202.Builder builder = EastWarRotateMsg.S2C_OpenUiResult_16202.newBuilder();
      ActivityInfo activityInfo = this.getServerActivityInfo();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      this.player.sendMsg(builder.build());
      this.sendOptionalGiftInfo();
      this.sendAppointment();
   }

   public int getActivityType() {
      return 42;
   }

   @MsgHandlerAnno
   public void C2S_OptionalGift_16211(EastWarRotateMsg.C2S_OptionalGift_16211 msg, String source) {
      this.sendOptionalGiftInfo();
   }

   @MsgHandlerAnno
   public void C2S_OptionalGiftChoice_16213(EastWarRotateMsg.C2S_OptionalGiftChoice_16213 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", msg.getCustomId());
         if (customizeGiftBagModel != null && customizeGiftBagModel.getActivityId() == this.getPlayerActivityId()) {
            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            if (giftPart.isLimit(msg.getCustomId())) {
               this.player.failure(25);
            } else {
               CustomizeGiftData customizeGiftData = new CustomizeGiftData();
               int groupId = 0;
               List<Integer> itemIndexList = new ArrayList();

               for(ActivityMsg.CustomGiftBuyItemData customGiftBuyItemData : msg.getBuyDataList()) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", customGiftBuyItemData.getGroupId());
                  if (specificGroupModel == null) {
                     this.player.failure(0);
                     return;
                  }

                  if (groupId > 0) {
                     if (specificGroupModel.getItemgroupID() != groupId) {
                        this.logger.error("玩家{}选择自选礼包错误,当前定制组:{},不同的定制组:{}", new Object[]{this.player.getPlayerId(), groupId, specificGroupModel.getItemgroupID()});
                        this.player.failure(0);
                        return;
                     }
                  } else {
                     groupId = specificGroupModel.getItemgroupID();
                  }

                  List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
                  if (resourceModelList == null || resourceModelList.size() <= customGiftBuyItemData.getItemIndex()) {
                     this.player.failure(0);
                     return;
                  }

                  if (itemIndexList.contains(customGiftBuyItemData.getItemIndex())) {
                     this.logger.error("玩家{}选择自选礼包错误,重复的物品,所有物品下标:{},当前物品下标:{}", new Object[]{this.player.getPlayerId(), itemIndexList, customGiftBuyItemData.getItemIndex()});
                     this.player.failure(0);
                     return;
                  }

                  itemIndexList.add(customGiftBuyItemData.getItemIndex());
                  long groupItemValue = MiscUtil.comboInteger(customGiftBuyItemData.getGroupId(), customGiftBuyItemData.getItemIndex());
                  customizeGiftData.groupItems.add(groupItemValue);
               }

               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               playerActivityDao.eastWarRotateData.optionalGift.put(msg.getCustomId(), customizeGiftData);
               playerActivityDao.updateOp();
               EastWarRotateMsg.S2C_OptionalGiftChoice_16214.Builder resp = EastWarRotateMsg.S2C_OptionalGiftChoice_16214.newBuilder();
               resp.setGiftData(this.buildGiftData(msg.getCustomId(), customizeGiftData));
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Appointment_16221(EastWarRotateMsg.C2S_Appointment_16221 msg, String source) {
      this.sendAppointment();
   }

   public void sendAppointment() {
      if (!this.isServerActivityInvalid()) {
         this.caleCoincidenceReward();
         EastWarRotateMsg.S2C_Appointment_16222.Builder builder = EastWarRotateMsg.S2C_Appointment_16222.newBuilder();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         builder.addAllHadGetKey(playerActivityDao.eastWarRotateData.secretKey);
         builder.setTotalId(playerActivityDao.eastWarRotateData.totalId);
         builder.setHadGetId(playerActivityDao.eastWarRotateData.hadGetId);
         builder.addAllBoxs(playerActivityDao.eastWarRotateData.boxs);
         int today = this.getSeverActivityDay();
         builder.setCurDay(today);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawKey_16223(EastWarRotateMsg.C2S_DrawKey_16223 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarRotateData.secretKey.contains(msg.getId())) {
         this.logger.info("已领取");
      } else {
         EastWarAwardModel awardModel = (EastWarAwardModel)this.player.getGameModelPool().getEntity("eastWarAward", msg.getId());
         if (awardModel != null && awardModel.getType() == EastWarAwardModel.TYPE_1 && awardModel.getActivityId() == this.getPlayerActivityId()) {
            int today = this.getSeverActivityDay();
            if (awardModel.getDay() > today) {
               this.logger.info("未达到天数");
            } else {
               playerActivityDao.eastWarRotateData.secretKey.add(msg.getId());
               playerActivityDao.updateOp();
               this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 889, 0, 0, "");
               EastWarRotateMsg.S2C_DrawKey_16224.Builder builder = EastWarRotateMsg.S2C_DrawKey_16224.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
               this.operationLog("踏浪寻珍(轮换)", "day:" + msg.getId(), awardModel.getRewards());
            }
         } else {
            this.logger.info("领取的奖励配置错误");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Coincidence_16225(EastWarRotateMsg.C2S_Coincidence_16225 msg, String source) {
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarRotateData.totalId == playerActivityDao.eastWarRotateData.hadGetId) {
         this.player.failure(61186);
      } else {
         List<ResourceModel> resourceModelList = new ArrayList();

         for(int i = playerActivityDao.eastWarRotateData.hadGetId + 1; i <= playerActivityDao.eastWarRotateData.totalId; ++i) {
            EastWarCoincidenceModel model = (EastWarCoincidenceModel)this.player.getGameModelPool().getEntity("eastWarCoincidence", i);
            if (model != null && model.getAwardType() == 1) {
               for(ResourceModel resourceModel : model.getItems()) {
                  ResourceModel.addResourceToList(resourceModelList, resourceModel);
               }
            }
         }

         if (resourceModelList.size() == 0) {
            this.player.failure(61186);
         } else {
            playerActivityDao.eastWarRotateData.hadGetId = playerActivityDao.eastWarRotateData.totalId;
            playerActivityDao.updateOp();
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 890, 0, 0, "");
            EastWarRotateMsg.S2C_Coincidence_16226.Builder builder = EastWarRotateMsg.S2C_Coincidence_16226.newBuilder();
            builder.setHadGetId(playerActivityDao.eastWarRotateData.hadGetId);
            this.player.sendMsg(builder.build());
            this.operationLog("踏浪寻珍奇遇(轮换)", "hadGetId:" + playerActivityDao.eastWarRotateData.hadGetId, resourceModelList);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CoincidenceBox_16227(EastWarRotateMsg.C2S_CoincidenceBox_16227 msg, String source) {
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarRotateData.totalId < msg.getId()) {
         this.player.failure(61187);
      } else if (playerActivityDao.eastWarRotateData.boxs.contains(msg.getId())) {
         this.logger.info("已领取该宝箱");
      } else {
         EastWarCoincidenceModel model = (EastWarCoincidenceModel)this.player.getGameModelPool().getEntity("eastWarCoincidence", msg.getId());
         if (model != null && model.getAwardType() == 2) {
            int itemType = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen2", 0, "\\|"));
            int itemId = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen2", 1, "\\|"));
            int itemValue = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen2", 2, "\\|"));
            if (!this.player.checkResourceNum(itemType, itemId, itemValue)) {
               this.player.failure(61188);
            } else {
               playerActivityDao.eastWarRotateData.boxs.add(msg.getId());
               playerActivityDao.updateOp();
               this.player.delResource(itemType, itemId, (long)itemValue, 8, 890, 0, 0, "");
               this.player.addResource(model.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 890, 0, 0, "");
               EastWarRotateMsg.S2C_CoincidenceBox_16228.Builder builder = EastWarRotateMsg.S2C_CoincidenceBox_16228.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
               this.operationLog("踏浪寻珍奇遇宝箱(轮换)", "boxId:" + msg.getId(), model.getItems());
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CumulativeId_16229(EastWarRotateMsg.C2S_CumulativeId_16229 msg, String source) {
      EastWarRotateMsg.S2C_CumulativeId_16230.Builder builder = EastWarRotateMsg.S2C_CumulativeId_16230.newBuilder();
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      builder.setTotalId(playerActivityDao.eastWarRotateData.totalId);
      this.player.sendMsg(builder.build());
   }

   public void caleCoincidenceReward() {
      int offsetSec = DateUtil.getIntTime(System.currentTimeMillis()) - this.getPlayerActivityInfo().start;
      int coincidenceTime = this.configManager.getIntDefault("eastWarCoincidenceTime2", 3600);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, EastWarCoincidenceModel> modelMap = this.player.getGameModelPool().getMap("eastWarCoincidence");
      if (playerActivityDao.eastWarRotateData.hadGetId < modelMap.size()) {
         int tempTotalId = Math.min(offsetSec / coincidenceTime, modelMap.size());
         if (tempTotalId > playerActivityDao.eastWarRotateData.totalId) {
            playerActivityDao.eastWarRotateData.totalId = tempTotalId;
            playerActivityDao.updateOp();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_MakeWine_16241(EastWarRotateMsg.C2S_MakeWine_16241 msg, String source) {
      this.makeWine(msg.getNum());
   }

   @MsgHandlerAnno
   public void C2S_TakePlumReward_16243(EastWarRotateMsg.C2S_TakePlumReward_16243 msg, String source) {
      this.takePlumReward();
   }

   @MsgHandlerAnno
   public void C2S_Drink_16245(EastWarRotateMsg.C2S_Drink_16245 msg, String source) {
      this.drink();
   }

   @MsgHandlerAnno
   public void C2S_FreeDrinkNum_16247(EastWarRotateMsg.C2S_FreeDrinkNum_16247 msg, String source) {
      this.freeDrinkNum();
   }

   public void makeWine(int num) {
      if (num <= 0) {
         this.player.failure(6);
      } else {
         List<ResourceModel> eastWarMaterialList = this.configManager.getResourceModelList("eastWarMaterial2", "2|1181|2,2|1182|4,2|1183|2,2|1184|2");
         List<ResourceModel> needList = new ArrayList();

         for(ResourceModel resourceModel : eastWarMaterialList) {
            needList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * num));
         }

         if (this.player.checkResourceNum(needList)) {
            this.player.delResource((List)needList, 8, 891, 0, num, "makeWine");
            List<ResourceModel> addList = new ArrayList();
            List<EastWarAwardModel> awardModels = this.getEastWarAwards(EastWarAwardModel.TYPE_2);
            if (awardModels != null && !awardModels.isEmpty()) {
               int totalWeight = 0;

               for(EastWarAwardModel model : awardModels) {
                  totalWeight += model.getWeight();
               }

               if (totalWeight > 0) {
                  int r = RandomUtil.randInt(totalWeight);
                  int temp = 0;

                  for(EastWarAwardModel awardModel : awardModels) {
                     temp += awardModel.getWeight();
                     if (temp > r) {
                        addList.addAll(awardModel.getRewards());
                        break;
                     }
                  }
               }
            }

            int eastWarId = this.configManager.getIntDefault("eastWarId2", 1180);
            addList.add(new ResourceModel(2, eastWarId, num));
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 891, 0, num, "");
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            ++playerActivityDao.eastWarRotateData.totalWineNum;
            playerActivityDao.updateOp();
            EastWarRotateMsg.S2C_MakeWine_16242.Builder builder = EastWarRotateMsg.S2C_MakeWine_16242.newBuilder();
            builder.setResult(1);
            builder.setTotalWineNum(playerActivityDao.eastWarRotateData.totalWineNum);
            this.player.sendMsg(builder.build());
            this.operationLog("踏浪东征轮换活动", "海韵风味", addList);
         }
      }
   }

   public void takePlumReward() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (!playerActivityDao.eastWarRotateData.isTakeEastWar) {
         int wineNum = playerActivityDao.eastWarRotateData.totalWineNum;
         int eastWarMadevalue = this.configManager.getIntDefault("eastWarMadevalue2", 0);
         if (wineNum >= eastWarMadevalue) {
            List<ResourceModel> addList = new ArrayList();
            List<EastWarAwardModel> awardModels = this.getEastWarAwards(EastWarAwardModel.TYPE_3);
            if (!CollectionUtils.isEmpty(awardModels)) {
               for(EastWarAwardModel awardModel : awardModels) {
                  addList.addAll(awardModel.getRewards());
               }

               this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 891, 0, wineNum, "takeWarReward");
               playerActivityDao.eastWarRotateData.isTakeEastWar = true;
               playerActivityDao.updateOp();
               EastWarRotateMsg.S2C_TakePlumReward_16244.Builder builder = EastWarRotateMsg.S2C_TakePlumReward_16244.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
               this.operationLog("踏浪东征轮换活动", "海韵风味数量奖励", addList);
            }
         }
      }
   }

   public void drink() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int eastWarFreeTimes = this.configManager.getIntDefault("eastWarFreeTimes2", 1);
      int freeNum = eastWarFreeTimes - playerActivityDao.eastWarRotateData.freeDrinkNum;
      if (freeNum > 0) {
         ++playerActivityDao.eastWarRotateData.freeDrinkNum;
         playerActivityDao.updateOp();
         --freeNum;
      } else {
         int eastWarId = this.configManager.getIntDefault("eastWarId2", 1180);
         ResourceModel needModel = new ResourceModel(2, eastWarId, 1);
         if (!this.player.checkResourceNum(needModel)) {
            return;
         }

         this.player.delResource(needModel, 8, 892, 0, 0, "");
      }

      List<ResourceModel> addList = new ArrayList();
      List<EastWarAwardModel> awardModels = this.getEastWarAwards(EastWarAwardModel.TYPE_4);
      if (awardModels != null && !awardModels.isEmpty()) {
         int totalWeight = 0;

         for(EastWarAwardModel model : awardModels) {
            totalWeight += model.getWeight();
         }

         if (totalWeight > 0) {
            int r = RandomUtil.randInt(totalWeight);
            int temp = 0;

            for(EastWarAwardModel awardModel : awardModels) {
               temp += awardModel.getWeight();
               if (temp > r) {
                  addList.addAll(awardModel.getRewards());
                  break;
               }
            }
         }
      }

      this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 892, 0, 0, "");
      EastWarRotateMsg.S2C_Drink_16246.Builder builder = EastWarRotateMsg.S2C_Drink_16246.newBuilder();
      builder.setResult(1);
      builder.setFreeNum(freeNum);
      this.player.sendMsg(builder.build());
      this.operationLog("踏浪东征轮换活动", "欢宴时分", addList);
   }

   public void freeDrinkNum() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int eastWarFreeTimes = this.configManager.getIntDefault("eastWarFreeTimes2", 1);
      int freeNum = eastWarFreeTimes - playerActivityDao.eastWarRotateData.freeDrinkNum;
      EastWarRotateMsg.S2C_FreeDrinkNum_16248.Builder builder = EastWarRotateMsg.S2C_FreeDrinkNum_16248.newBuilder();
      builder.setFreeNum(freeNum);
      builder.setTotalWineNum(playerActivityDao.eastWarRotateData.totalWineNum);
      builder.setIsTaked(playerActivityDao.eastWarRotateData.isTakeEastWar);
      this.player.sendMsg(builder.build());
   }

   private void sendOptionalGiftInfo() {
      if (!this.isServerActivityInvalid()) {
         EastWarRotateMsg.S2C_OptionalGift_16212.Builder msg = EastWarRotateMsg.S2C_OptionalGift_16212.newBuilder();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(Map.Entry<Integer, CustomizeGiftData> entry : playerActivityDao.eastWarRotateData.optionalGift.entrySet()) {
            msg.addGiftList(this.buildGiftData((Integer)entry.getKey(), (CustomizeGiftData)entry.getValue()));
         }

         this.player.sendMsg(msg.build());
      }
   }

   public CustomizeGiftData getCustomizeGiftData(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (CustomizeGiftData)playerActivityDao.eastWarRotateData.optionalGift.get(buyId);
   }

   public void sendCustomizeGiftBuy(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarRotateData.optionalGift.containsKey(buyId)) {
         List<ResourceModel> resourceModels = new ArrayList();
         this.customizeGiftBuy(buyId, resourceModels);
         this.operationLog("踏浪东征自选商店", "buyId:" + buyId, resourceModels);
         playerActivityDao.eastWarRotateData.optionalGift.remove(buyId);
         playerActivityDao.updateOp();
      }
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(17);
      this.clearActivityGift(24);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.eastWarRotateData.optionalGift.clear();
      playerActivityDao.eastWarRotateData.freeDrinkNum = 0;
      playerActivityDao.eastWarRotateData.isTakeEastWar = false;
      playerActivityDao.eastWarRotateData.taskGroup.clear();
      playerActivityDao.eastWarRotateData.secretKey.clear();
      playerActivityDao.eastWarRotateData.totalId = 0;
      playerActivityDao.eastWarRotateData.hadGetId = 0;
      playerActivityDao.eastWarRotateData.boxs.clear();
      playerActivityDao.eastWarRotateData.totalWineNum = 0;
      playerActivityDao.updateOp();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(35);
      this.clearActivityGift(24);
   }

   private void operationLog(String activityType, String gearName, List<ResourceModel> resourceModels) {
      String award = "";
      if (resourceModels.size() > 0) {
         for(ResourceModel resourceModel : resourceModels) {
            award = award + resourceModel.getId() + "-" + resourceModel.getValue() + ",";
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, activityType, award, gearName, 0, 0, 1);
      }

   }

   private List<EastWarAwardModel> getEastWarAwards(int type) {
      Map<Integer, List<EastWarAwardModel>> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customEastWarAward", this.getPlayerActivityId());
      if (CollectionUtils.isEmpty(modelMap)) {
         return null;
      } else {
         List<EastWarAwardModel> eastWarAwardModels = (List)modelMap.get(type);
         return eastWarAwardModels;
      }
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, List<EastWarAwardModel>> eastWarAwardModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customEastWarAward", this.getPlayerActivityId());
      if (eastWarAwardModelMap != null) {
         List<ResourceModel> addList = new ArrayList();

         for(EastWarAwardModel awardModel : (List)eastWarAwardModelMap.get(EastWarAwardModel.TYPE_1)) {
            if (!playerActivityDao.eastWarData.secretKey.contains(awardModel.getId())) {
               for(ResourceModel reward : awardModel.getRewards()) {
                  ResourceModel.addResourceToList(addList, reward);
               }
            }
         }

         if (!addList.isEmpty()) {
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 93, 9304, 0, 0, "");
         }
      }

      int itemType = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen2", 0, "\\|"));
      int itemId = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen2", 1, "\\|"));
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int haveNum = itemBagPart.getItemNum(itemId);
      List<ResourceModel> rewardList = new ArrayList();
      int useNum = 0;
      if (haveNum > 0) {
         this.caleCoincidenceReward();
         Map<Integer, EastWarCoincidenceModel> eastWarCoincidenceModelMap = this.player.getGameModelPool().getMap("eastWarCoincidence");
         if (eastWarCoincidenceModelMap != null) {
            Iterator taskCustomCache = eastWarCoincidenceModelMap.entrySet().iterator();

            label78:
            while(true) {
               Map.Entry<Integer, EastWarCoincidenceModel> entry;
               while(true) {
                  if (!taskCustomCache.hasNext()) {
                     break label78;
                  }

                  entry = (Map.Entry)taskCustomCache.next();
                  if (!playerActivityDao.eastWarRotateData.boxs.contains(entry.getKey()) && (Integer)entry.getKey() <= playerActivityDao.eastWarRotateData.totalId) {
                     if (((EastWarCoincidenceModel)entry.getValue()).getAwardType() != 2) {
                        break;
                     }

                     if (useNum < haveNum) {
                        ++useNum;
                        break;
                     }
                  }
               }

               for(ResourceModel item : ((EastWarCoincidenceModel)entry.getValue()).getItems()) {
                  ResourceModel.addResourceToList(rewardList, item);
               }
            }
         }
      }

      if (useNum > 0) {
         this.player.delResource(itemType, itemId, (long)useNum, 93, 9304, 0, 0, "");
      }

      if (!playerActivityDao.eastWarRotateData.isTakeEastWar) {
         Map<Integer, List<EastWarAwardModel>> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customEastWarAward", this.getPlayerActivityId());

         for(EastWarAwardModel awardModel : (List)modelMap.get(EastWarAwardModel.TYPE_3)) {
            for(ResourceModel reward : awardModel.getRewards()) {
               ResourceModel.addResourceToList(rewardList, reward);
            }
         }
      }

      this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, rewardList);
      EastWarTaskRotatePart eastWarTaskRotatePart = (EastWarTaskRotatePart)this.player.getMgrPart(EastWarTaskRotatePart.class);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(eastWarTaskRotatePart.getModule());
      this.rotateReset(0);
   }
}
