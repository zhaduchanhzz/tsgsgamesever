package com.gzbz.mart;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import com.gzbz.db.MartPlayerDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.mart.bean.MartDetailData;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CrossMartMsg;
import com.gzbz.protobuf.MartMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class MartMgr extends GameMgr {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private OnLineMgr onLineMgr;
   public int state;
   public Boolean specialState = false;

   protected void init() throws Exception {
   }

   public int getState() {
      return this.state;
   }

   public Boolean getSpecialState() {
      return this.specialState;
   }

   @MsgHandlerAnno
   public void CR2S_ChangInfo_23320(CrossMartMsg.CR2S_ChangInfo_23320 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【拍卖场】调整大战区，下架所有拍卖场的物品 serverId:{}", this.worldMgr.GAME_SERVER_ID);

      for(MartMsg.Goods goodsMsg : msg.getGoodsList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(goodsMsg.getSeller());
         if (gamePlayer != null) {
            MartPlayerDao martPlayerDao = (MartPlayerDao)gamePlayer.getData("tb_mart_player", gamePlayer.getPlayerId());
            MartDetailData martDetailData = new MartDetailData();
            martDetailData.intt(goodsMsg);
            martPlayerDao.sellMartDetails.put(martDetailData.code, martDetailData);
            martPlayerDao.updateOp();
            StringBuilder stringBuilder = new StringBuilder();

            for(PropertyModel propertyModel : martDetailData.attrMap.values()) {
               stringBuilder.append(propertyModel.getType()).append(",").append(propertyModel.getWay()).append(",").append(propertyModel.getValue()).append("|");
            }

            logger.info("【拍卖场】 playerId:{} code:{} itemId:{} propertys:{}", new Object[]{gamePlayer.getPlayerId(), martDetailData.code, martDetailData.itemId, stringBuilder.toString()});
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_ReturnPrices_23324(CrossMartMsg.CR2S_ReturnPrices_23324 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(CrossMartMsg.ReturnPriceData priceData : msg.getDataList()) {
         GamePlayer player = this.worldMgr.getPlayerById(priceData.getPlayerId());
         if (player != null) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            int awardId = ApplicationContextProvider.getConfigInt("martMailReturnPrice", 3211);
            TreeMap<Integer, CentreAwardModel> modelMap = (TreeMap)centreAwardMap.get(awardId);
            if (modelMap != null && !modelMap.isEmpty()) {
               MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
               CentreAwardModel centreAwardModel = (CentreAwardModel)modelMap.firstEntry().getValue();
               List<ResourceModel> resourceModels = new ArrayList();
               resourceModels.add(new ResourceModel(priceData.getPriceType(), priceData.getPriceId(), priceData.getPriceValue()));
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", priceData.getItemId());
               String itemName = itemModel != null ? itemModel.getName() : "";
               String content = MessageFormat.format(centreAwardModel.getDesc(), priceData.getPriceValue(), itemName);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), content, resourceModels, MailPart.FOREVER, 134, 13409);
            }

            this.notifyFailValue(player);
         }
      }

   }

   @MsgHandlerAnno
   public void S2C_NotifyDealForCare_23160(MartMsg.S2C_NotifyDealForCare_23160 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void CR2S_UpdateMartState_23328(CrossMartMsg.CR2S_UpdateMartState_23328 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.state = msg.getState();
      MartMsg.S2C_MartState_23164.Builder builder = MartMsg.S2C_MartState_23164.newBuilder();
      builder.setState(msg.getState());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void S2C_NotifyMartSpecialState_23168(MartMsg.S2C_NotifyMartSpecialState_23168 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.specialState = msg.getSpecialState();
      MartMsg.S2C_NotifyMartSpecialState_23168.Builder builder = MartMsg.S2C_NotifyMartSpecialState_23168.newBuilder();
      builder.setSpecialState(msg.getSpecialState());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_UnGetGoods_23330(CrossMartMsg.CR2S_UnGetGoods_23330 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<MartMsg.Goods> goodsList = msg.getGoodsList();
      logger.info("【拍卖场】调整大战区，买家购买成功但未领取的灵兽 serverId:{} size:{}", this.worldMgr.GAME_SERVER_ID, goodsList.size());

      for(MartMsg.Goods goodsMsg : goodsList) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(goodsMsg.getBuyer());
         if (gamePlayer != null) {
            MartPlayerDao martPlayerDao = (MartPlayerDao)gamePlayer.getData("tb_mart_player", gamePlayer.getPlayerId());
            MartDetailData martDetailData = new MartDetailData();
            martDetailData.intt(goodsMsg);
            martPlayerDao.unGetGoods.put(martDetailData.code, martDetailData);
            martPlayerDao.updateOp();
            StringBuilder stringBuilder = new StringBuilder();

            for(PropertyModel propertyModel : martDetailData.attrMap.values()) {
               stringBuilder.append(propertyModel.getType()).append(",").append(propertyModel.getWay()).append(",").append(propertyModel.getValue()).append("|");
            }

            logger.info("【拍卖场】 playerId:{} code:{} itemId:{} propertys:{}", new Object[]{gamePlayer.getPlayerId(), martDetailData.code, martDetailData.itemId, stringBuilder.toString()});
            MartMsg.S2C_RedState_23162.Builder builder = MartMsg.S2C_RedState_23162.newBuilder();
            builder.setRewardNum(martPlayerDao.unGetGoods.size());
            builder.setPassIn(martPlayerDao.sellMartDetails.size() > 0);
            gamePlayer.sendMsg(builder.build());
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_UnGetPrices_23332(CrossMartMsg.CR2S_UnGetPrices_23332 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<CrossMartMsg.ReturnPriceData> dataList = msg.getDataList();
      logger.info("【拍卖场】调整大战区，卖家成功售出但未领取的货币 serverId:{} size:{}", this.worldMgr.GAME_SERVER_ID, dataList.size());

      for(CrossMartMsg.ReturnPriceData priceData : dataList) {
         GamePlayer player = this.worldMgr.getPlayerById(priceData.getPlayerId());
         if (player != null) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            int awardId = ApplicationContextProvider.getConfigInt("martMailBuyerNotGet", 3213);
            TreeMap<Integer, CentreAwardModel> modelMap = (TreeMap)centreAwardMap.get(awardId);
            if (modelMap != null && !modelMap.isEmpty()) {
               int price = priceData.getPriceValue();
               int ratio = ApplicationContextProvider.getConfigInt("AuctionServriceChage", 1000);
               int chargeValue = Math.max(1, (int)((float)(price * ratio) / 10000.0F));
               int rewardValue = price - chargeValue;
               MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
               CentreAwardModel centreAwardModel = (CentreAwardModel)((TreeMap)centreAwardMap.get(awardId)).firstEntry().getValue();
               List<ResourceModel> resourceModels = new ArrayList();
               ResourceModel resourceModel = MartPart.switchPrice(priceData.getPriceType(), priceData.getPriceId(), rewardValue);
               resourceModels.add(resourceModel);
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", priceData.getItemId());
               String itemName = itemModel != null ? itemModel.getName() : "";
               String content = MessageFormat.format(centreAwardModel.getDesc(), itemName, price, ratio / 100, chargeValue, rewardValue);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), content, resourceModels, MailPart.FOREVER, 134, 13409);
               logger.info("【拍卖场】玩家{}未领取的货币 type:{} id:{} value:{}", new Object[]{player.getPlayerId(), priceData.getPriceType(), priceData.getPriceId(), priceData.getPriceValue()});
            }
         }
      }

   }

   @MsgHandlerAnno
   public void S2C_UpdateGoodsPrice_23166(MartMsg.S2C_UpdateGoodsPrice_23166 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   private void notifyFailValue(GamePlayer player) {
      MartMsg.S2C_Surpass_23144.Builder builder = MartMsg.S2C_Surpass_23144.newBuilder();
      builder.setFailValue(0);
      player.sendMsg(builder.build());
   }
}
