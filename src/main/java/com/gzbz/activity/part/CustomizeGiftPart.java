package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.CustomizeGiftData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CustomizeGiftBagModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class CustomizeGiftPart extends AbstractActivityPart {
   public void sendInfo() {
      ActivityInfo playerActivityInfo = this.getPlayerActivityInfo();
      ActivityMsg.S2C_CustomGift_6790.Builder msg = ActivityMsg.S2C_CustomGift_6790.newBuilder();
      msg.setEndTime(playerActivityInfo.end);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());

      for(Map.Entry<Integer, CustomizeGiftData> entry : playerActivityDao.customizeGiftDataMap.entrySet()) {
         msg.addGiftList(this.buildGiftData((Integer)entry.getKey(), (CustomizeGiftData)entry.getValue()));
      }

      this.player.sendMsg(msg.build());
   }

   @MsgHandlerAnno
   public void C2S_CustomGift_6789(ActivityMsg.C2S_CustomGift_6789 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_CustomGiftBuy_6791(ActivityMsg.C2S_CustomGiftBuy_6791 msg, String source) {
      ActivityInfo playerActivityInfo = this.getPlayerActivityInfo();
      if (playerActivityInfo.id != 0 && playerActivityInfo.end >= DateUtil.getIntTime(System.currentTimeMillis())) {
         CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", msg.getCustomId());
         if (customizeGiftBagModel != null && customizeGiftBagModel.getActivityId() == this.getPlayerActivityId()) {
            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(17);
            if (giftDaoMap.containsKey(msg.getCustomId())) {
               this.player.failure(25);
            } else {
               CustomizeGiftData customizeGiftData = new CustomizeGiftData();

               for(ActivityMsg.CustomGiftBuyItemData customGiftBuyItemData : msg.getBuyDataList()) {
                  SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", customGiftBuyItemData.getGroupId());
                  if (specificGroupModel == null) {
                     this.player.failure(0);
                     return;
                  }

                  List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
                  if (resourceModelList == null || resourceModelList.size() <= customGiftBuyItemData.getItemIndex()) {
                     this.player.failure(0);
                     return;
                  }

                  customizeGiftData.groupItems.add(MiscUtil.comboInteger(customGiftBuyItemData.getGroupId(), customGiftBuyItemData.getItemIndex()));
               }

               PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
               playerActivityDao.customizeGiftDataMap.put(msg.getCustomId(), customizeGiftData);
               playerActivityDao.updateOp();
               ActivityMsg.S2C_CustomGiftBuy_6792.Builder resp = ActivityMsg.S2C_CustomGiftBuy_6792.newBuilder();
               resp.setGiftData(this.buildGiftData(msg.getCustomId(), customizeGiftData));
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(0);
         }
      } else {
         this.player.failure(8007);
      }
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(17);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.customizeGiftDataMap.clear();
      playerActivityDao.updateOp();
   }

   public CustomizeGiftData getCustomizeGiftData(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (CustomizeGiftData)playerActivityDao.customizeGiftDataMap.get(buyId);
   }

   public void sendCustomizeGiftBuy(int buyId) {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      CustomizeGiftData customizeGiftData = (CustomizeGiftData)playerActivityDao.customizeGiftDataMap.get(buyId);
      if (customizeGiftData != null) {
         ActivityMsg.S2C_CustomGiftBuyFinish_6794.Builder msg = ActivityMsg.S2C_CustomGiftBuyFinish_6794.newBuilder();
         msg.setGiftData(this.buildGiftData(buyId, customizeGiftData));
         this.player.sendMsg(msg.build());
         ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
         if (shopLimitModel != null) {
            StringBuilder stringBuilder = new StringBuilder();

            for(long groupItem : customizeGiftData.groupItems) {
               int group = MiscUtil.getHiParam(groupItem);
               int itemIndex = MiscUtil.getLowParam(groupItem);
               SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", group);
               if (specificGroupModel != null) {
                  List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
                  if (resourceModelList != null && resourceModelList.size() > itemIndex) {
                     ResourceModel resourceModel = (ResourceModel)resourceModelList.get(itemIndex);
                     stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                  }
               }
            }

            if (stringBuilder.length() > 0) {
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "私人定制", shopLimitModel.getId() + "-" + shopLimitModel.getTips(), stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), 0, 0, 0);
            }
         }

      }
   }

   public int getActivityType() {
      return 12;
   }

   public void loginHandle() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      boolean updateFlag = false;

      for(CustomizeGiftData customizeGiftData : playerActivityDao.customizeGiftDataMap.values()) {
         for(Map.Entry<Integer, Integer> entry : customizeGiftData.groupItem.entrySet()) {
            long groupItem = MiscUtil.comboInteger((Integer)entry.getKey(), (Integer)entry.getValue());
            customizeGiftData.groupItems.add(groupItem);
            updateFlag = true;
         }

         customizeGiftData.groupItem.clear();
      }

      if (updateFlag) {
         playerActivityDao.updateOp();
      }

   }
}
