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
import com.gzbz.model.GreenPlumAwardModel;
import com.gzbz.model.GreenPlumCoincidenceModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.GreenPlumMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.GreenPlumTaskPart;
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

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GreenPlumPart extends AbstractActivityPart {
   private final int COINCIDENCE_TYPE_REWARD = 1;
   private final int COINCIDENCE_TYPE_BOX = 2;
   private final String GREEN_PLUM_BOX_OPEN = "greenPlumBoxOpen";
   private final String COINCIDENCE_TIME = "greenPlumCoincidenceTime";
   private final String GREEN_PLUM_ID = "greenPlumId";
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      GreenPlumTaskPart greenPlumTaskPart = (GreenPlumTaskPart)this.player.getMgrPart(GreenPlumTaskPart.class);
      greenPlumTaskPart.checkLogin();
   }

   public void resetDaily() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.greenPlumData.freeDrinkNum = 0;
      playerActivityDao.updateOp();
      GreenPlumTaskPart greenPlumTaskPart = (GreenPlumTaskPart)this.player.getMgrPart(GreenPlumTaskPart.class);
      greenPlumTaskPart.checkResetDaily();
   }

   public void sendInfo() {
      GreenPlumMsg.S2C_OpenUiResult_13502.Builder builder = GreenPlumMsg.S2C_OpenUiResult_13502.newBuilder();
      ActivityInfo activityInfo = this.getServerActivityInfo();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      this.player.sendMsg(builder.build());
      this.sendOptionalGiftInfo();
      this.sendAppointment();
   }

   public int getActivityType() {
      return 22;
   }

   @MsgHandlerAnno
   public void C2S_OptionalGift_13511(GreenPlumMsg.C2S_OptionalGift_13511 msg, String source) {
      this.sendOptionalGiftInfo();
   }

   @MsgHandlerAnno
   public void C2S_OptionalGiftChoice_13513(GreenPlumMsg.C2S_OptionalGiftChoice_13513 msg, String source) {
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
               playerActivityDao.greenPlumData.optionalGift.put(msg.getCustomId(), customizeGiftData);
               playerActivityDao.updateOp();
               GreenPlumMsg.S2C_OptionalGiftChoice_13514.Builder resp = GreenPlumMsg.S2C_OptionalGiftChoice_13514.newBuilder();
               resp.setGiftData(this.buildGiftData(msg.getCustomId(), customizeGiftData));
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Appointment_13521(GreenPlumMsg.C2S_Appointment_13521 msg, String source) {
      this.sendAppointment();
   }

   public void sendAppointment() {
      if (!this.isServerActivityInvalid()) {
         this.caleCoincidenceReward();
         GreenPlumMsg.S2C_Appointment_13522.Builder builder = GreenPlumMsg.S2C_Appointment_13522.newBuilder();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         builder.addAllHadGetKey(playerActivityDao.greenPlumData.secretKey);
         builder.setTotalId(playerActivityDao.greenPlumData.totalId);
         builder.setHadGetId(playerActivityDao.greenPlumData.hadGetId);
         builder.addAllBoxs(playerActivityDao.greenPlumData.boxs);
         int today = this.getSeverActivityDay();
         builder.setCurDay(today);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawKey_13523(GreenPlumMsg.C2S_DrawKey_13523 msg, String source) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int today = this.getSeverActivityDay();
      if (msg.getId() > today) {
         this.logger.info("未达到天数");
      } else if (playerActivityDao.greenPlumData.secretKey.contains(msg.getId())) {
         this.logger.info("已领取");
      } else {
         GreenPlumAwardModel awardModel = (GreenPlumAwardModel)this.player.getGameModelPool().getEntity("greenPlumAward", msg.getId());
         if (awardModel != null && awardModel.getType() == GreenPlumAwardModel.TYPE_1) {
            playerActivityDao.greenPlumData.secretKey.add(msg.getId());
            playerActivityDao.updateOp();
            this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 852, 0, 0, "");
            GreenPlumMsg.S2C_DrawKey_13524.Builder builder = GreenPlumMsg.S2C_DrawKey_13524.newBuilder();
            builder.setId(msg.getId());
            this.player.sendMsg(builder.build());
            this.operationLog("钱春有约", "day:" + msg.getId(), awardModel.getRewards());
         } else {
            this.logger.info("领取的奖励配置错误");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Coincidence_13525(GreenPlumMsg.C2S_Coincidence_13525 msg, String source) {
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.greenPlumData.totalId == playerActivityDao.greenPlumData.hadGetId) {
         this.player.failure(61045);
      } else {
         List<ResourceModel> resourceModelList = new ArrayList();

         for(int i = playerActivityDao.greenPlumData.hadGetId + 1; i <= playerActivityDao.greenPlumData.totalId; ++i) {
            GreenPlumCoincidenceModel model = (GreenPlumCoincidenceModel)this.player.getGameModelPool().getEntity("greenPlumCoincidence", i);
            if (model != null && model.getAwardType() == 1) {
               for(ResourceModel resourceModel : model.getItems()) {
                  ResourceModel.addResourceToList(resourceModelList, resourceModel);
               }
            }
         }

         if (resourceModelList.size() == 0) {
            this.player.failure(61045);
         } else {
            playerActivityDao.greenPlumData.hadGetId = playerActivityDao.greenPlumData.totalId;
            playerActivityDao.updateOp();
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 853, 0, 0, "");
            GreenPlumMsg.S2C_Coincidence_13526.Builder builder = GreenPlumMsg.S2C_Coincidence_13526.newBuilder();
            builder.setHadGetId(playerActivityDao.greenPlumData.hadGetId);
            this.player.sendMsg(builder.build());
            this.operationLog("奇遇", "hadGetId:" + playerActivityDao.greenPlumData.hadGetId, resourceModelList);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CoincidenceBox_13527(GreenPlumMsg.C2S_CoincidenceBox_13527 msg, String source) {
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.greenPlumData.totalId < msg.getId()) {
         this.player.failure(61046);
      } else if (playerActivityDao.greenPlumData.boxs.contains(msg.getId())) {
         this.logger.info("已领取该宝箱");
      } else {
         GreenPlumCoincidenceModel model = (GreenPlumCoincidenceModel)this.player.getGameModelPool().getEntity("greenPlumCoincidence", msg.getId());
         if (model != null && model.getAwardType() == 2) {
            int itemType = Integer.parseInt(this.configManager.parseValue("greenPlumBoxOpen", 0, "\\|"));
            int itemId = Integer.parseInt(this.configManager.parseValue("greenPlumBoxOpen", 1, "\\|"));
            int itemValue = Integer.parseInt(this.configManager.parseValue("greenPlumBoxOpen", 2, "\\|"));
            if (!this.player.checkResourceNum(itemType, itemId, itemValue)) {
               this.player.failure(61052);
            } else {
               playerActivityDao.greenPlumData.boxs.add(msg.getId());
               playerActivityDao.updateOp();
               this.player.delResource(itemType, itemId, (long)itemValue, 8, 853, 0, 0, "");
               this.player.addResource(model.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 853, 0, 0, "");
               GreenPlumMsg.S2C_CoincidenceBox_13528.Builder builder = GreenPlumMsg.S2C_CoincidenceBox_13528.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
               this.operationLog("奇遇宝箱", "boxId:" + msg.getId(), model.getItems());
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CumulativeId_13529(GreenPlumMsg.C2S_CumulativeId_13529 msg, String source) {
      GreenPlumMsg.S2C_CumulativeId_13530.Builder builder = GreenPlumMsg.S2C_CumulativeId_13530.newBuilder();
      this.caleCoincidenceReward();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      builder.setTotalId(playerActivityDao.greenPlumData.totalId);
      this.player.sendMsg(builder.build());
   }

   public void caleCoincidenceReward() {
      int offsetSec = DateUtil.getIntTime(System.currentTimeMillis()) - this.getPlayerActivityInfo().start;
      int coincidenceTime = this.configManager.getIntDefault("greenPlumCoincidenceTime", 5);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, GreenPlumCoincidenceModel> modelMap = this.player.getGameModelPool().getMap("greenPlumCoincidence");
      if (playerActivityDao.greenPlumData.hadGetId < modelMap.size()) {
         int tempTotalId = Math.min(offsetSec / coincidenceTime, modelMap.size());
         if (tempTotalId > playerActivityDao.greenPlumData.totalId) {
            playerActivityDao.greenPlumData.totalId = tempTotalId;
            playerActivityDao.updateOp();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_MakeWine_13541(GreenPlumMsg.C2S_MakeWine_13541 msg, String source) {
      this.makeWine(msg.getNum());
   }

   @MsgHandlerAnno
   public void C2S_TakePlumReward_13543(GreenPlumMsg.C2S_TakePlumReward_13543 msg, String source) {
      this.takePlumReward();
   }

   @MsgHandlerAnno
   public void C2S_Drink_13545(GreenPlumMsg.C2S_Drink_13545 msg, String source) {
      this.drink();
   }

   @MsgHandlerAnno
   public void C2S_FreeDrinkNum_13547(GreenPlumMsg.C2S_FreeDrinkNum_13547 msg, String source) {
      this.freeDrinkNum();
   }

   public void makeWine(int num) {
      if (num <= 0) {
         this.player.failure(6);
      } else {
         List<ResourceModel> greenPlumMaterialList = this.configManager.getResourceModelList("greenPlumMaterial", "");
         List<ResourceModel> needList = new ArrayList();

         for(ResourceModel resourceModel : greenPlumMaterialList) {
            needList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * num));
         }

         if (this.player.checkResourceNum(needList)) {
            this.player.delResource((List)needList, 8, 848, 0, num, "makeWine");
            List<ResourceModel> addList = new ArrayList();
            List<GreenPlumAwardModel> awardModels = (List)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_2);
            if (awardModels != null && !awardModels.isEmpty()) {
               int totalWeight = 0;

               for(GreenPlumAwardModel model : awardModels) {
                  totalWeight += model.getWeight();
               }

               if (totalWeight > 0) {
                  int r = RandomUtil.randInt(totalWeight);
                  int temp = 0;

                  for(GreenPlumAwardModel awardModel : awardModels) {
                     temp += awardModel.getWeight();
                     if (temp > r) {
                        addList.addAll(awardModel.getRewards());
                        break;
                     }
                  }
               }
            }

            int greenPlumId = this.configManager.getIntDefault("greenPlumId", 1124);
            addList.add(new ResourceModel(2, greenPlumId, num));
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 848, 0, num, "");
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
            ++playerActivityDao.greenPlumData.totalWineNum;
            playerActivityDao.updateOp();
            GreenPlumMsg.S2C_MakeWine_13542.Builder builder = GreenPlumMsg.S2C_MakeWine_13542.newBuilder();
            builder.setResult(1);
            builder.setTotalWineNum(playerActivityDao.greenPlumData.totalWineNum);
            this.player.sendMsg(builder.build());
            this.operationLog("饮酒别春", "制酒", addList);
         }
      }
   }

   public void takePlumReward() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (!playerActivityDao.greenPlumData.isTakePlumNum) {
         int wineNum = playerActivityDao.greenPlumData.totalWineNum;
         int greenPlumMadevalue = this.configManager.getIntDefault("greenPlumMadevalue", 0);
         if (wineNum >= greenPlumMadevalue) {
            List<ResourceModel> addList = new ArrayList();

            for(GreenPlumAwardModel awardModel : (List<GreenPlumAwardModel>)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_3)) {
               addList.addAll(awardModel.getRewards());
            }

            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 848, 0, wineNum, "takePlumReward");
            playerActivityDao.greenPlumData.isTakePlumNum = true;
            playerActivityDao.updateOp();
            GreenPlumMsg.S2C_TakePlumReward_13544.Builder builder = GreenPlumMsg.S2C_TakePlumReward_13544.newBuilder();
            builder.setResult(1);
            this.player.sendMsg(builder.build());
            this.operationLog("饮酒别春", "制酒数量奖励", addList);
         }
      }
   }

   public void drink() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int greenPlumFreeTimes = this.configManager.getIntDefault("greenPlumFreeTimes", 0);
      int freeNum = greenPlumFreeTimes - playerActivityDao.greenPlumData.freeDrinkNum;
      if (freeNum > 0) {
         ++playerActivityDao.greenPlumData.freeDrinkNum;
         playerActivityDao.updateOp();
         --freeNum;
      } else {
         int greenPlumId = this.configManager.getIntDefault("greenPlumId", 1124);
         ResourceModel needModel = new ResourceModel(2, greenPlumId, 1);
         if (!this.player.checkResourceNum(needModel)) {
            return;
         }

         this.player.delResource(needModel, 8, 849, 0, 0, "");
      }

      List<ResourceModel> addList = new ArrayList();
      List<GreenPlumAwardModel> awardModels = (List)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_4);
      if (awardModels != null && !awardModels.isEmpty()) {
         int totalWeight = 0;

         for(GreenPlumAwardModel model : awardModels) {
            totalWeight += model.getWeight();
         }

         if (totalWeight > 0) {
            int r = RandomUtil.randInt(totalWeight);
            int temp = 0;

            for(GreenPlumAwardModel awardModel : awardModels) {
               temp += awardModel.getWeight();
               if (temp > r) {
                  addList.addAll(awardModel.getRewards());
                  break;
               }
            }
         }
      }

      this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 849, 0, 0, "");
      GreenPlumMsg.S2C_Drink_13546.Builder builder = GreenPlumMsg.S2C_Drink_13546.newBuilder();
      builder.setResult(1);
      builder.setFreeNum(freeNum);
      this.player.sendMsg(builder.build());
      this.operationLog("饮酒别春", "饮酒", addList);
   }

   public void freeDrinkNum() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      int greenPlumFreeTimes = this.configManager.getIntDefault("greenPlumFreeTimes", 0);
      int freeNum = greenPlumFreeTimes - playerActivityDao.greenPlumData.freeDrinkNum;
      GreenPlumMsg.S2C_FreeDrinkNum_13548.Builder builder = GreenPlumMsg.S2C_FreeDrinkNum_13548.newBuilder();
      builder.setFreeNum(freeNum);
      builder.setTotalWineNum(playerActivityDao.greenPlumData.totalWineNum);
      builder.setIsTaked(playerActivityDao.greenPlumData.isTakePlumNum);
      this.player.sendMsg(builder.build());
   }

   private void sendOptionalGiftInfo() {
      if (!this.isServerActivityInvalid()) {
         GreenPlumMsg.S2C_OptionalGift_13512.Builder msg = GreenPlumMsg.S2C_OptionalGift_13512.newBuilder();
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

         for(Map.Entry<Integer, CustomizeGiftData> entry : playerActivityDao.greenPlumData.optionalGift.entrySet()) {
            msg.addGiftList(this.buildGiftData((Integer)entry.getKey(), (CustomizeGiftData)entry.getValue()));
         }

         this.player.sendMsg(msg.build());
      }
   }

   public CustomizeGiftData getCustomizeGiftData(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (CustomizeGiftData)playerActivityDao.greenPlumData.optionalGift.get(buyId);
   }

   public void sendCustomizeGiftBuy(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      if (playerActivityDao.greenPlumData.optionalGift.containsKey(buyId)) {
         List<ResourceModel> resourceModels = new ArrayList();
         this.customizeGiftBuy(buyId, resourceModels);
         this.operationLog("自选商店", "buyId:" + buyId, resourceModels);
         playerActivityDao.greenPlumData.optionalGift.remove(buyId);
         playerActivityDao.updateOp();
      }
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(17);
      this.clearActivityGift(24);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.greenPlumData.optionalGift.clear();
      playerActivityDao.greenPlumData.freeDrinkNum = 0;
      playerActivityDao.greenPlumData.isTakePlumNum = false;
      playerActivityDao.greenPlumData.taskGroup.clear();
      playerActivityDao.greenPlumData.secretKey.clear();
      playerActivityDao.greenPlumData.totalId = 0;
      playerActivityDao.greenPlumData.hadGetId = 0;
      playerActivityDao.greenPlumData.boxs.clear();
      playerActivityDao.greenPlumData.totalWineNum = 0;
      playerActivityDao.updateOp();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(26);
   }

   private void operationLog(String activityType, String gearName, List<ResourceModel> resourceModels) {
      String award = "";
      if (resourceModels.size() > 0) {
         for(ResourceModel resourceModel : resourceModels) {
            award = award + resourceModel.getId() + "-" + resourceModel.getValue() + ",";
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getPlayerActivityId(), activityType, award, gearName, 0, 0, 1);
      }

   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Map<Integer, GreenPlumAwardModel> greenPlumAwardModelMap = this.player.getGameModelPool().getMap("greenPlumAward");
      if (greenPlumAwardModelMap != null) {
         List<ResourceModel> addList = new ArrayList();

         for(Map.Entry<Integer, GreenPlumAwardModel> entry : greenPlumAwardModelMap.entrySet()) {
            if (((GreenPlumAwardModel)entry.getValue()).getType() == GreenPlumAwardModel.TYPE_1 && !playerActivityDao.greenPlumData.secretKey.contains(entry.getKey())) {
               for(ResourceModel reward : ((GreenPlumAwardModel)entry.getValue()).getRewards()) {
                  ResourceModel.addResourceToList(addList, reward);
               }
            }
         }

         if (!addList.isEmpty()) {
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 93, 9304, 0, 0, "");
         }
      }

      int itemType = Integer.parseInt(this.configManager.parseValue("greenPlumBoxOpen", 0, "\\|"));
      int itemId = Integer.parseInt(this.configManager.parseValue("greenPlumBoxOpen", 1, "\\|"));
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int haveNum = itemBagPart.getItemNum(itemId);
      List<ResourceModel> rewardList = new ArrayList();
      int useNum = 0;
      if (haveNum > 0) {
         this.caleCoincidenceReward();
         Map<Integer, GreenPlumCoincidenceModel> greenPlumCoincidenceModelMap = this.player.getGameModelPool().getMap("greenPlumCoincidence");
         if (greenPlumCoincidenceModelMap != null) {
            Iterator taskCustomCache = greenPlumCoincidenceModelMap.entrySet().iterator();

            label80:
            while(true) {
               Map.Entry<Integer, GreenPlumCoincidenceModel> entry;
               while(true) {
                  if (!taskCustomCache.hasNext()) {
                     break label80;
                  }

                  entry = (Map.Entry)taskCustomCache.next();
                  if (!playerActivityDao.greenPlumData.boxs.contains(entry.getKey()) && (Integer)entry.getKey() <= playerActivityDao.greenPlumData.totalId) {
                     if (((GreenPlumCoincidenceModel)entry.getValue()).getAwardType() != 2) {
                        break;
                     }

                     if (useNum < haveNum) {
                        ++useNum;
                        break;
                     }
                  }
               }

               for(ResourceModel item : ((GreenPlumCoincidenceModel)entry.getValue()).getItems()) {
                  ResourceModel.addResourceToList(rewardList, item);
               }
            }
         }
      }

      if (useNum > 0) {
         this.player.delResource(itemType, itemId, (long)useNum, 93, 9304, 0, 0, "");
      }

      if (!playerActivityDao.greenPlumData.isTakePlumNum) {
         for(GreenPlumAwardModel awardModel : (List<GreenPlumAwardModel>)this.player.getGameModelPool().getEntity("customGreenPlumAward", GreenPlumAwardModel.TYPE_3)) {
            for(ResourceModel reward : awardModel.getRewards()) {
               ResourceModel.addResourceToList(rewardList, reward);
            }
         }
      }

      this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, rewardList);
      GreenPlumTaskPart greenPlumTaskPart = (GreenPlumTaskPart)this.player.getMgrPart(GreenPlumTaskPart.class);
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(greenPlumTaskPart.getModule());
      this.rotateReset(0);
   }
}
