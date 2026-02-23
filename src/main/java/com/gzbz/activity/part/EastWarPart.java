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
import com.gzbz.protobuf.EastWarMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.EastWarTaskPart;
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
public class EastWarPart extends AbstractActivityPart {
   private final int COINCIDENCE_TYPE_REWARD = 1;
   private final int COINCIDENCE_TYPE_BOX = 2;
   private final String EAST_WAR_BOX_OPEN = "eastWarBoxOpen";
   private final String COINCIDENCE_TIME = "eastWarCoincidenceTime";
   private final String EAST_WAR_ID = "eastWarId";
   private final String EAST_WAR_MATERIAL = "eastWarMaterial";
   private final String EAST_WAR_MADEVALUE = "eastWarMadevalue";
   private final String EAST_WAR_FREE_TIME = "eastWarFreeTimes";
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      EastWarTaskPart eastWarTaskPart = (EastWarTaskPart)this.player.getMgrPart(EastWarTaskPart.class);
      eastWarTaskPart.checkLogin();
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.eastWarData.freeDrinkNum = 0;
      playerActivityDao.updateOp();
      EastWarTaskPart eastWarTaskPart = (EastWarTaskPart)this.player.getMgrPart(EastWarTaskPart.class);
      eastWarTaskPart.checkResetDaily();
   }

   public void sendInfo() {
      EastWarMsg.S2C_OpenUiResult_15602.Builder builder = EastWarMsg.S2C_OpenUiResult_15602.newBuilder();
      ActivityInfo activityInfo = this.getServerActivityInfo();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      this.player.sendMsg(builder.build());
      this.sendOptionalGiftInfo();
      this.sendAppointment();
   }

   public int getActivityType() {
      return 40;
   }

   @MsgHandlerAnno
   public void C2S_OptionalGift_15611(EastWarMsg.C2S_OptionalGift_15611 msg, String source) {
      this.sendOptionalGiftInfo();
   }

   @MsgHandlerAnno
   public void C2S_OptionalGiftChoice_15613(EastWarMsg.C2S_OptionalGiftChoice_15613 msg, String source) {
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
               playerActivityDao.eastWarData.optionalGift.put(msg.getCustomId(), customizeGiftData);
               playerActivityDao.updateOp();
               EastWarMsg.S2C_OptionalGiftChoice_15614.Builder resp = EastWarMsg.S2C_OptionalGiftChoice_15614.newBuilder();
               resp.setGiftData(this.buildGiftData(msg.getCustomId(), customizeGiftData));
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Appointment_15621(EastWarMsg.C2S_Appointment_15621 msg, String source) {
      this.sendAppointment();
   }

   public void sendAppointment() {
      if (!this.isServerActivityInvalid()) {
         this.caleCoincidenceReward();
         EastWarMsg.S2C_Appointment_15622.Builder builder = EastWarMsg.S2C_Appointment_15622.newBuilder();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         builder.addAllHadGetKey(playerActivityDao.eastWarData.secretKey);
         builder.setTotalId(playerActivityDao.eastWarData.totalId);
         builder.setHadGetId(playerActivityDao.eastWarData.hadGetId);
         builder.addAllBoxs(playerActivityDao.eastWarData.boxs);
         int today = this.getSeverActivityDay();
         builder.setCurDay(today);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawKey_15623(EastWarMsg.C2S_DrawKey_15623 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarData.secretKey.contains(msg.getId())) {
         this.logger.info("已领取");
      } else {
         EastWarAwardModel awardModel = (EastWarAwardModel)this.player.getGameModelPool().getEntity("eastWarAward", msg.getId());
         if (awardModel != null && awardModel.getType() == EastWarAwardModel.TYPE_1 && awardModel.getActivityId() == this.getPlayerActivityId()) {
            int today = this.getSeverActivityDay();
            if (awardModel.getDay() > today) {
               this.logger.info("未达到天数");
            } else {
               playerActivityDao.eastWarData.secretKey.add(msg.getId());
               playerActivityDao.updateOp();
               this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 889, 0, 0, "");
               EastWarMsg.S2C_DrawKey_15624.Builder builder = EastWarMsg.S2C_DrawKey_15624.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
               this.operationLog("踏浪寻珍", "day:" + msg.getId(), awardModel.getRewards());
            }
         } else {
            this.logger.info("领取的奖励配置错误");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Coincidence_15625(EastWarMsg.C2S_Coincidence_15625 msg, String source) {
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarData.totalId == playerActivityDao.eastWarData.hadGetId) {
         this.player.failure(61186);
      } else {
         List<ResourceModel> resourceModelList = new ArrayList();

         for(int i = playerActivityDao.eastWarData.hadGetId + 1; i <= playerActivityDao.eastWarData.totalId; ++i) {
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
            playerActivityDao.eastWarData.hadGetId = playerActivityDao.eastWarData.totalId;
            playerActivityDao.updateOp();
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 890, 0, 0, "");
            EastWarMsg.S2C_Coincidence_15626.Builder builder = EastWarMsg.S2C_Coincidence_15626.newBuilder();
            builder.setHadGetId(playerActivityDao.eastWarData.hadGetId);
            this.player.sendMsg(builder.build());
            this.operationLog("踏浪寻珍奇遇", "hadGetId:" + playerActivityDao.eastWarData.hadGetId, resourceModelList);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CoincidenceBox_15627(EastWarMsg.C2S_CoincidenceBox_15627 msg, String source) {
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarData.totalId < msg.getId()) {
         this.player.failure(61187);
      } else if (playerActivityDao.eastWarData.boxs.contains(msg.getId())) {
         this.logger.info("已领取该宝箱");
      } else {
         EastWarCoincidenceModel model = (EastWarCoincidenceModel)this.player.getGameModelPool().getEntity("eastWarCoincidence", msg.getId());
         if (model != null && model.getAwardType() == 2) {
            int itemType = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen", 0, "\\|"));
            int itemId = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen", 1, "\\|"));
            int itemValue = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen", 2, "\\|"));
            if (!this.player.checkResourceNum(itemType, itemId, itemValue)) {
               this.player.failure(61188);
            } else {
               playerActivityDao.eastWarData.boxs.add(msg.getId());
               playerActivityDao.updateOp();
               this.player.delResource(itemType, itemId, (long)itemValue, 8, 890, 0, 0, "");
               this.player.addResource(model.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 890, 0, 0, "");
               EastWarMsg.S2C_CoincidenceBox_15628.Builder builder = EastWarMsg.S2C_CoincidenceBox_15628.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
               this.operationLog("踏浪寻珍奇遇宝箱", "boxId:" + msg.getId(), model.getItems());
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CumulativeId_15629(EastWarMsg.C2S_CumulativeId_15629 msg, String source) {
      EastWarMsg.S2C_CumulativeId_15630.Builder builder = EastWarMsg.S2C_CumulativeId_15630.newBuilder();
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      builder.setTotalId(playerActivityDao.eastWarData.totalId);
      this.player.sendMsg(builder.build());
   }

   public void caleCoincidenceReward() {
      int offsetSec = DateUtil.getIntTime(System.currentTimeMillis()) - this.getPlayerActivityInfo().start;
      int coincidenceTime = this.configManager.getIntDefault("eastWarCoincidenceTime", 5);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, EastWarCoincidenceModel> modelMap = this.player.getGameModelPool().getMap("eastWarCoincidence");
      if (playerActivityDao.eastWarData.hadGetId < modelMap.size()) {
         int tempTotalId = Math.min(offsetSec / coincidenceTime, modelMap.size());
         if (tempTotalId > playerActivityDao.eastWarData.totalId) {
            playerActivityDao.eastWarData.totalId = tempTotalId;
            playerActivityDao.updateOp();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_MakeWine_15641(EastWarMsg.C2S_MakeWine_15641 msg, String source) {
      this.makeWine(msg.getNum());
   }

   @MsgHandlerAnno
   public void C2S_TakePlumReward_15643(EastWarMsg.C2S_TakePlumReward_15643 msg, String source) {
      this.takePlumReward();
   }

   @MsgHandlerAnno
   public void C2S_Drink_15645(EastWarMsg.C2S_Drink_15645 msg, String source) {
      this.drink();
   }

   @MsgHandlerAnno
   public void C2S_FreeDrinkNum_15647(EastWarMsg.C2S_FreeDrinkNum_15647 msg, String source) {
      this.freeDrinkNum();
   }

   public void makeWine(int num) {
      if (num <= 0) {
         this.player.failure(6);
      } else {
         List<ResourceModel> eastWarMaterialList = this.configManager.getResourceModelList("eastWarMaterial", "");
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

            int eastWarId = this.configManager.getIntDefault("eastWarId", 1124);
            addList.add(new ResourceModel(2, eastWarId, num));
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 891, 0, num, "");
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            ++playerActivityDao.eastWarData.totalWineNum;
            playerActivityDao.updateOp();
            EastWarMsg.S2C_MakeWine_15642.Builder builder = EastWarMsg.S2C_MakeWine_15642.newBuilder();
            builder.setResult(1);
            builder.setTotalWineNum(playerActivityDao.eastWarData.totalWineNum);
            this.player.sendMsg(builder.build());
            this.operationLog("踏浪东征", "海韵风味", addList);
         }
      }
   }

   public void takePlumReward() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (!playerActivityDao.eastWarData.isTakeEastWar) {
         int wineNum = playerActivityDao.eastWarData.totalWineNum;
         int eastWarMadevalue = this.configManager.getIntDefault("eastWarMadevalue", 12);
         if (wineNum >= eastWarMadevalue) {
            List<ResourceModel> addList = new ArrayList();
            List<EastWarAwardModel> awardModels = this.getEastWarAwards(EastWarAwardModel.TYPE_3);
            if (!CollectionUtils.isEmpty(awardModels)) {
               for(EastWarAwardModel awardModel : awardModels) {
                  addList.addAll(awardModel.getRewards());
               }

               this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 891, 0, wineNum, "takeWarReward");
               playerActivityDao.eastWarData.isTakeEastWar = true;
               playerActivityDao.updateOp();
               EastWarMsg.S2C_TakePlumReward_15644.Builder builder = EastWarMsg.S2C_TakePlumReward_15644.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
               this.operationLog("踏浪东征", "海韵风味数量奖励", addList);
            }
         }
      }
   }

   public void drink() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int eastWarFreeTimes = this.configManager.getIntDefault("eastWarFreeTimes", 1);
      int freeNum = eastWarFreeTimes - playerActivityDao.eastWarData.freeDrinkNum;
      if (freeNum > 0) {
         ++playerActivityDao.eastWarData.freeDrinkNum;
         playerActivityDao.updateOp();
         --freeNum;
      } else {
         int eastWarId = this.configManager.getIntDefault("eastWarId", 1124);
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
      EastWarMsg.S2C_Drink_15646.Builder builder = EastWarMsg.S2C_Drink_15646.newBuilder();
      builder.setResult(1);
      builder.setFreeNum(freeNum);
      this.player.sendMsg(builder.build());
      this.operationLog("踏浪东征", "欢宴时分", addList);
   }

   public void freeDrinkNum() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int eastWarFreeTimes = this.configManager.getIntDefault("eastWarFreeTimes", 1);
      int freeNum = eastWarFreeTimes - playerActivityDao.eastWarData.freeDrinkNum;
      EastWarMsg.S2C_FreeDrinkNum_15648.Builder builder = EastWarMsg.S2C_FreeDrinkNum_15648.newBuilder();
      builder.setFreeNum(freeNum);
      builder.setTotalWineNum(playerActivityDao.eastWarData.totalWineNum);
      builder.setIsTaked(playerActivityDao.eastWarData.isTakeEastWar);
      this.player.sendMsg(builder.build());
   }

   private void sendOptionalGiftInfo() {
      if (!this.isServerActivityInvalid()) {
         EastWarMsg.S2C_OptionalGift_15612.Builder msg = EastWarMsg.S2C_OptionalGift_15612.newBuilder();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(Map.Entry<Integer, CustomizeGiftData> entry : playerActivityDao.eastWarData.optionalGift.entrySet()) {
            msg.addGiftList(this.buildGiftData((Integer)entry.getKey(), (CustomizeGiftData)entry.getValue()));
         }

         this.player.sendMsg(msg.build());
      }
   }

   public CustomizeGiftData getCustomizeGiftData(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (CustomizeGiftData)playerActivityDao.eastWarData.optionalGift.get(buyId);
   }

   public void sendCustomizeGiftBuy(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.eastWarData.optionalGift.containsKey(buyId)) {
         List<ResourceModel> resourceModels = new ArrayList();
         this.customizeGiftBuy(buyId, resourceModels);
         this.operationLog("踏浪东征自选商店", "buyId:" + buyId, resourceModels);
         playerActivityDao.eastWarData.optionalGift.remove(buyId);
         playerActivityDao.updateOp();
      }
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(17);
      this.clearActivityGift(24);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.eastWarData.optionalGift.clear();
      playerActivityDao.eastWarData.freeDrinkNum = 0;
      playerActivityDao.eastWarData.isTakeEastWar = false;
      playerActivityDao.eastWarData.taskGroup.clear();
      playerActivityDao.eastWarData.secretKey.clear();
      playerActivityDao.eastWarData.totalId = 0;
      playerActivityDao.eastWarData.hadGetId = 0;
      playerActivityDao.eastWarData.boxs.clear();
      playerActivityDao.eastWarData.totalWineNum = 0;
      playerActivityDao.updateOp();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(33);
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
      Map<Integer, List<EastWarAwardModel>> eastWarAwardModelMap = (Map)this.player.getGameModelPool().getEntity("customEastWarAward", this.getPlayerActivityId());
      if (eastWarAwardModelMap != null) {
         List<ResourceModel> addList = new ArrayList();

         for(EastWarAwardModel awardModel : eastWarAwardModelMap.get(EastWarAwardModel.TYPE_1)) {
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

      int itemType = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen", 0, "\\|"));
      int itemId = Integer.parseInt(this.configManager.parseValue("eastWarBoxOpen", 1, "\\|"));
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
                  if (!playerActivityDao.eastWarData.boxs.contains(entry.getKey()) && (Integer)entry.getKey() <= playerActivityDao.eastWarData.totalId) {
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

      if (!playerActivityDao.eastWarData.isTakeEastWar) {
         Map<Integer, List<EastWarAwardModel>> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customEastWarAward", this.getPlayerActivityId());

         for(EastWarAwardModel awardModel : modelMap.get(EastWarAwardModel.TYPE_3)) {
            for(ResourceModel reward : awardModel.getRewards()) {
               ResourceModel.addResourceToList(rewardList, reward);
            }
         }
      }

      this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, rewardList);
      EastWarTaskPart eastWarTaskPart = (EastWarTaskPart)this.player.getMgrPart(EastWarTaskPart.class);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(eastWarTaskPart.getModule());
      this.rotateReset(0);
   }
}
