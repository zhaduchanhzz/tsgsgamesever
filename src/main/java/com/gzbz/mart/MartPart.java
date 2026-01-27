package com.gzbz.mart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.db.MartPlayerDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.godBeast.part.GodBeastPart;
import com.gzbz.godBeast.part.NeiDanPart;
import com.gzbz.mart.bean.MartDetailData;
import com.gzbz.model.AuctionGodBeastNeiDanModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GodBeastNeiDanBaseModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.MartAutoGodBeastModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMartMsg;
import com.gzbz.protobuf.MartMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MartPart extends PlayerPart {
   private final ConfigManager configManager;
   private final WorldMgr worldMgr;
   private final MartMgr martMgr;
   public static Set<Integer> IN_MART_PLAYERS = new ConcurrentHashSet();
   @Autowired
   private CrossNettyClient crossNettyClient;

   public MartPart(ConfigManager configManager, WorldMgr worldMgr, MartMgr martMgr) {
      this.configManager = configManager;
      this.worldMgr = worldMgr;
      this.martMgr = martMgr;
   }

   public MartPlayerDao getMartPlayerDao() {
      return (MartPlayerDao)this.player.getData("tb_mart_player", this.player.getPlayerId());
   }

   private boolean isOpen() {
      return this.player.isSystemOpen(6400);
   }

   public void loginHandle() {
      MartPlayerDao martPlayerDao = this.getMartPlayerDao();
      if (martPlayerDao.surpassSet.size() > 0) {
         MartMsg.S2C_Surpass_23144.Builder builder = MartMsg.S2C_Surpass_23144.newBuilder();
         builder.addAllCodes(martPlayerDao.surpassSet);
         this.player.sendMsg(builder.build());
         martPlayerDao.surpassSet.clear();
         martPlayerDao.updateOp();
      }

      MartMsg.S2C_MartState_23164.Builder builder = MartMsg.S2C_MartState_23164.newBuilder();
      builder.setState(this.martMgr.getState());
      this.player.sendMsg(builder.build());
      MartMsg.S2C_NotifyMartSpecialState_23168.Builder specialBuilder = MartMsg.S2C_NotifyMartSpecialState_23168.newBuilder();
      specialBuilder.setSpecialState(this.martMgr.getSpecialState());
      this.player.sendMsg(specialBuilder.build());
   }

   @MsgHandlerAnno
   public void C2S_MartInfo_23101(MartMsg.C2S_MartInfo_23101 msg, String source) {
      if (this.isOpen()) {
         MartPlayerDao martPlayerDao = this.getMartPlayerDao();
         if (this.martMgr.getState() != 0) {
            MartMsg.S2C_MartInfo_23102.Builder builder = MartMsg.S2C_MartInfo_23102.newBuilder();

            for(Map.Entry<Integer, MartDetailData> entry : martPlayerDao.sellMartDetails.entrySet()) {
               MartDetailData martDetailData = (MartDetailData)entry.getValue();
               builder.addMyGoods(martDetailData.toGoodsBuilder());
            }

            builder.addAllAddGridIndex(martPlayerDao.addGridIndex);
            this.player.sendMsg(builder.build());
         } else {
            CrossMartMsg.S2CR_MartInfo_23301.Builder builder = CrossMartMsg.S2CR_MartInfo_23301.newBuilder();
            builder.addAllAddGridIndex(martPlayerDao.addGridIndex);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }

      }
   }

   public int getTotalGridNum() {
      int totalNum = ApplicationContextProvider.getConfigInt("martFreeGrid", 3);
      PlayerDao playerDao = this.player.getPlayerDao();
      String unlockStr = ApplicationContextProvider.getConfigString("martGridUnlock", "3,1|6,1");
      String[] arr = unlockStr.split("\\|");

      for(String cell : arr) {
         String[] str = cell.split(",");
         if (playerDao.vip_lv >= Integer.parseInt(str[0])) {
            totalNum += Integer.parseInt(str[1]);
         }
      }

      MartPlayerDao martPlayerDao = this.getMartPlayerDao();
      totalNum += martPlayerDao.addGridIndex.size();
      return totalNum;
   }

   @MsgHandlerAnno
   public boolean C2S_AddGrid_23169(MartMsg.C2S_AddGrid_23169 msg, String source) {
      MartPlayerDao martPlayerDao = this.getMartPlayerDao();
      if (martPlayerDao.addGridIndex.contains(msg.getIndex())) {
         return this.player.failure(6);
      } else {
         ArrayList<Integer> martGridGold = this.configManager.getIntList("martGridGold");
         Integer costGold = (Integer)martGridGold.get(msg.getIndex());
         if (null != costGold && costGold > 0) {
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, costGold)) {
               return this.player.failure(31);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)costGold, 134, 13412, 0, 0, "");
               martPlayerDao.addGridIndex.add(msg.getIndex());
               martPlayerDao.updateOp();
               MartMsg.S2C_AddGrid_23170.Builder builder = MartMsg.S2C_AddGrid_23170.newBuilder();
               builder.addAllAddGridIndex(martPlayerDao.addGridIndex);
               this.player.sendMsg(builder.build());
               return true;
            }
         } else {
            return this.player.failure(37);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HotList_23105(MartMsg.C2S_HotList_23105 msg, String source) {
      if (this.isOpen()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_Sell_23107(MartMsg.C2S_Sell_23107 msg, String source) {
      if (this.isOpen()) {
         if (this.martMgr.getState() != 0) {
            this.player.failure(76408);
         } else {
            this.sellHit(msg.getItemCode(), msg.getOriPrice(), msg.getMaxPrice(), msg.getHie());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Buy_23111(MartMsg.C2S_Buy_23111 msg, String source) {
      if (this.isOpen()) {
         if (this.martMgr.getState() != 0) {
            this.player.failure(76408);
         } else {
            CrossMartMsg.S2CR_BuyHit_23311.Builder builder = CrossMartMsg.S2CR_BuyHit_23311.newBuilder();
            builder.setCode(msg.getCode());
            builder.setOfferPrice(msg.getOfferPrice());
            builder.setHide(msg.getHide());
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DealPrice_23117(MartMsg.C2S_DealPrice_23117 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_HistoryPrice_23119(MartMsg.C2S_HistoryPrice_23119 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_Care_23123(MartMsg.C2S_Care_23123 msg, String source) {
      if (this.isOpen()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_Off_23125(MartMsg.C2S_Off_23125 msg, String source) {
      if (this.isOpen()) {
         if (this.martMgr.getState() != 0) {
            MartPlayerDao martPlayerDao = this.getMartPlayerDao();

            for(int code : msg.getCodeList()) {
               MartDetailData martDetailData = (MartDetailData)martPlayerDao.sellMartDetails.get(code);
               if (martDetailData != null && martDetailData.state == 3) {
                  martPlayerDao.sellMartDetails.remove(code);
                  ((List)martPlayerDao.opRecordMap.computeIfAbsent(2, (v) -> new ArrayList())).add(martDetailData.code + "_" + DateUtil.getIntTime(System.currentTimeMillis()));
                  martPlayerDao.updateOp();
                  this.returnItem((MartDetailData)martDetailData, 13403);
               }
            }
         } else {
            List<Integer> codeList = msg.getCodeList();
            Set<Integer> codeSet = new HashSet(msg.getCodeList());
            if (codeList.size() == 0 || codeSet.size() != codeList.size()) {
               return;
            }

            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_Enter_23127(MartMsg.C2S_Enter_23127 msg, String source) {
      if (this.isOpen()) {
         if (msg.hasIsEnter() && msg.getIsEnter()) {
            IN_MART_PLAYERS.add(this.player.getPlayerId());
            this.checkOffGoods();
         } else {
            IN_MART_PLAYERS.remove(this.player.getPlayerId());
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveGoods_23129(MartMsg.C2S_ReceiveGoods_23129 msg, String source) {
      if (this.isOpen()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveReturn_23131(MartMsg.C2S_ReceiveReturn_23131 msg, String source) {
      if (this.isOpen()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_CareList_23133(MartMsg.C2S_CareList_23133 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_ReturnList_23137(MartMsg.C2S_ReturnList_23137 msg, String source) {
      if (this.isOpen()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_RewardDeal_23139(MartMsg.C2S_RewardDeal_23139 msg, String source) {
      if (this.isOpen()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         if (!itemBagPart.isEnableAddToBag(32, 1)) {
            this.player.failure(76409);
         } else {
            if (this.martMgr.getState() != 0) {
               MartPlayerDao martPlayerDao = this.getMartPlayerDao();
               MartDetailData martDetailData = (MartDetailData)martPlayerDao.unGetGoods.get(msg.getCode());
               if (martDetailData != null && martDetailData.buyer == this.player.getPlayerId() && martDetailData.state == 2) {
                  martPlayerDao.unGetGoods.remove(msg.getCode());
                  ((List)martPlayerDao.opRecordMap.computeIfAbsent(1, (v) -> new ArrayList())).add(martDetailData.code + "_" + DateUtil.getIntTime(System.currentTimeMillis()));
                  martPlayerDao.updateOp();
                  this.returnItem((MartDetailData)martDetailData, 13404);
                  MartMsg.S2C_RewardDeal_23140.Builder builder = MartMsg.S2C_RewardDeal_23140.newBuilder();
                  builder.setGoods(martDetailData.toGoodsBuilder());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
               }
            } else {
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DealInfo_23141(MartMsg.C2S_DealInfo_23141 msg, String source) {
      if (this.martMgr.getState() != 0) {
         MartMsg.S2C_DealInfo_23142.Builder builder = MartMsg.S2C_DealInfo_23142.newBuilder();
         MartPlayerDao martPlayerDao = this.getMartPlayerDao();

         for(MartDetailData martDetailData : martPlayerDao.unGetGoods.values()) {
            builder.addMyDeals(martDetailData.toGoodsBuilder());
         }

         this.player.sendMsg(builder.build());
      } else {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }

   }

   @MsgHandlerAnno
   public void C2S_Surpass_23143(MartMsg.C2S_Surpass_23143 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_AllGoods_23145(MartMsg.C2S_AllGoods_23145 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_RangeGoods_23147(MartMsg.C2S_RangeGoods_23147 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_AppointGoods_23149(MartMsg.C2S_AppointGoods_23149 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_SellAgain_23151(MartMsg.C2S_SellAgain_23151 msg, String source) {
      if (this.isOpen()) {
         if (this.martMgr.getState() != 0) {
            this.player.failure(76408);
         } else {
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_QueryGoodsInfo_23155(MartMsg.C2S_QueryGoodsInfo_23155 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_RedState_23161(MartMsg.C2S_RedState_23161 msg, String source) {
      if (this.martMgr.getState() != 0) {
         this.updateRedState();
      } else {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }

   }

   private void sellHit(int code, int oriPrice, int maxPrice, int hide) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase != null) {
         if (!(itemBase instanceof GodBeastItem) && !(itemBase instanceof NeiDanItem)) {
            this.player.failure(76404);
         } else {
            if (itemBase instanceof GodBeastItem) {
               GodBeastItem godBeastItem = (GodBeastItem)itemBase;
               if (godBeastItem.checkReset()) {
                  return;
               }

               if (godBeastItem.mainNeiDan != null) {
                  this.player.failure(76550);
                  return;
               }

               int scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
               MartAutoGodBeastModel martAutoGodBeastModel = (MartAutoGodBeastModel)ApplicationContextProvider.getModelPoolEntity("auctionGodBeast", scoreId);
               if (martAutoGodBeastModel == null || martAutoGodBeastModel.getStartPriceMin() == 0) {
                  this.player.failure(76404);
                  return;
               }

               if (oriPrice < martAutoGodBeastModel.getStartPriceMin() || oriPrice > martAutoGodBeastModel.getStartPriceMax()) {
                  this.player.failure(6);
                  return;
               }

               if (maxPrice < martAutoGodBeastModel.getFixPriceMin() || maxPrice > martAutoGodBeastModel.getFixPriceMax()) {
                  this.player.failure(6);
                  return;
               }

               int coolTime = ApplicationContextProvider.getConfigInt("AuctionCoolingTime", 604800);
               int curTime = DateUtil.getIntTime(System.currentTimeMillis());
               if (godBeastItem.martRecTime + coolTime > curTime) {
                  this.player.failure(76402);
                  return;
               }
            } else {
               NeiDanItem neiDanItem = (NeiDanItem)itemBase;
               if (neiDanItem.checkReset()) {
                  return;
               }

               if (neiDanItem.deputyNeiDan.size() > 0) {
                  this.player.failure(76533);
                  return;
               }

               if (neiDanItem.state == 1) {
                  this.player.failure(76549);
                  return;
               }

               GodBeastNeiDanBaseModel neiDanBaseModel = NeiDanDefine.getBaseModel(neiDanItem.id);
               if (null == neiDanBaseModel) {
                  return;
               }

               AuctionGodBeastNeiDanModel auctionModel = NeiDanDefine.getAuctionModel(neiDanBaseModel.getQuality());
               if (null == auctionModel || auctionModel.getStartPriceMin() == 0) {
                  this.player.failure(76404);
                  return;
               }

               if (oriPrice < auctionModel.getStartPriceMin() || oriPrice > auctionModel.getStartPriceMax()) {
                  this.player.failure(6);
                  return;
               }

               if (maxPrice < auctionModel.getFixPriceMin() || maxPrice > auctionModel.getFixPriceMax()) {
                  this.player.failure(6);
                  return;
               }
            }

            int upfrontPriceLimit = ApplicationContextProvider.getConfigInt("UpfrontPriceLimit", 10300);
            if (oriPrice * upfrontPriceLimit > maxPrice * 10000) {
               this.player.failure(76405);
            } else {
               CrossMartMsg.S2CR_SellHit_23305.Builder builder = CrossMartMsg.S2CR_SellHit_23305.newBuilder();
               builder.setItemCode(code);
               builder.setOriPrice(oriPrice);
               builder.setMaxPrice(maxPrice);
               builder.setHie(hide);
               builder.setTotalGridNum(this.getTotalGridNum());
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         }
      }
   }

   private void sellSubmit(int code, int oriPrice, int maxPrice, int hide) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(code);
      if (itemBase != null) {
         itemBagPart.deleteItemByCode(itemBase.code, 1, 134, 13401, 0, 0, "");
         this.player.senditemUpdateMsg();
         CrossMartMsg.S2CR_Sell_23307.Builder builder = CrossMartMsg.S2CR_Sell_23307.newBuilder();
         BagMsg.Item_Info.Builder itemInfoMsg = BagMsg.Item_Info.newBuilder();
         itemInfoMsg.setCode(itemBase.code);
         itemInfoMsg.setId(itemBase.id);
         itemInfoMsg.setNum(1);
         int scoreId = 0;
         if (itemBase instanceof GodBeastItem) {
            GodBeastItem godBeastItem = (GodBeastItem)itemBase;

            for(PropertyModel propertyModel : godBeastItem.attrMap.values()) {
               CommonMsg.PropertyInfo.Builder propertyMsg = CommonMsg.PropertyInfo.newBuilder();
               propertyMsg.setId(propertyModel.getType());
               propertyMsg.setWay(propertyModel.getWay());
               propertyMsg.setValue((double)propertyModel.getValue());
               itemInfoMsg.addProperties(propertyMsg);
            }

            scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
         } else if (itemBase instanceof NeiDanItem) {
            NeiDanItem neiDanItem = (NeiDanItem)itemBase;

            for(PropertyModel propertyModel : neiDanItem.entryPro) {
               CommonMsg.PropertyInfo.Builder propertyMsg = CommonMsg.PropertyInfo.newBuilder();
               propertyMsg.setId(propertyModel.getType());
               propertyMsg.setWay(propertyModel.getWay());
               propertyMsg.setValue((double)propertyModel.getValue());
               itemInfoMsg.addProperties(propertyMsg);
            }

            itemInfoMsg.setParamId(neiDanItem.entryId);
         }

         builder.setItemInfo(itemInfoMsg);
         builder.setOriPrice(oriPrice);
         builder.setMaxPrice(maxPrice);
         builder.setHide(hide);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         this.player.triggerTask(734, 0, 1L, 1);
         PlayerDao playerDao = this.player.getPlayerDao();
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemBase.id);
         this.player.getOperationMgr().addExtraLog(this.player, 43, itemBase.id + "", itemModel.getName(), "1", "2", itemModel.getSubclass() + "", scoreId + "", itemModel.getQuality() + "", PlayerDefine.PLAYER_DIAMOND + "", oriPrice + "", maxPrice + "", playerDao.lv + "", playerDao.combat_power + "");
      }
   }

   @MsgHandlerAnno
   public void S2C_Buy_23112(MartMsg.S2C_Buy_23112 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int result = msg.getResult();
      if (result == 1 || result == 2) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         int mineRewardCentreId = ApplicationContextProvider.getConfigInt("martMailDeal", 3210);
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPool().getEntity("centreAward", mineRewardCentreId);
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", msg.getItemId());
         String itemName = itemModel != null ? itemModel.getName() : "";
         String content = MessageFormat.format(centreAwardModel.getDesc(), msg.getPrice(), itemName);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), content, (List)null, 604800000L, 134, 13410);
      }

      this.player.sendMsg(msg);
   }

   @MsgHandlerAnno
   public void S2C_ReceiveReturn_23132(MartMsg.S2C_ReceiveReturn_23132 msg, CrossSubscribeMsg crossSubscribeMsg) {
      List<CommonMsg.ItemInfo> itemInfoList = msg.getItemInfoList();
      List<ResourceModel> resourceModels = new ArrayList();

      for(CommonMsg.ItemInfo itemInfo : itemInfoList) {
         resourceModels.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
      }

      this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 134, 13408, 0, 0, "");
      this.player.sendMsg(msg);
   }

   @MsgHandlerAnno
   public void S2C_RewardDeal_23140(MartMsg.S2C_RewardDeal_23140 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.returnItem((MartMsg.Goods)msg.getGoods(), 13404);
      this.player.sendMsg(msg);
   }

   @MsgHandlerAnno
   public void CR2S_Off_23310(CrossMartMsg.CR2S_Off_23310 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(MartMsg.Goods goods : msg.getGoodsList()) {
         this.returnItem((MartMsg.Goods)goods, 13403);
      }

      MartMsg.S2C_Off_23126.Builder builder = MartMsg.S2C_Off_23126.newBuilder();
      builder.addAllCode(msg.getCodeList());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_BuyHit_23312(CrossMartMsg.CR2S_BuyHit_23312 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getResult() == 1) {
         CommonMsg.ItemInfo priceInfo = msg.getPriceInfo();
         if (!this.player.checkResourceNum(priceInfo.getType(), priceInfo.getId(), priceInfo.getNum())) {
            this.player.failure(3);
            return;
         }

         this.player.delResource(priceInfo.getType(), priceInfo.getId(), (long)priceInfo.getNum(), 134, 13405, 0, 0, "");
         CrossMartMsg.S2CR_BuySubmit_23313.Builder builder = CrossMartMsg.S2CR_BuySubmit_23313.newBuilder();
         builder.setCode(msg.getCode());
         builder.setOfferPrice(priceInfo.getNum());
         builder.setHide(msg.getHide());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void CR2S_ReceiveGoods_23318(CrossMartMsg.CR2S_ReceiveGoods_23318 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int price = msg.getPrice();
      int rewardValue = price - msg.getServiceCharge();
      if (rewardValue > 0) {
         ResourceModel resourceModel = switchPrice(msg.getPriceType(), msg.getPriceId(), rewardValue);
         this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 134, 13407, 0, 0, "");
      }

      MartMsg.S2C_ReceiveGoods_23130.Builder builder = MartMsg.S2C_ReceiveGoods_23130.newBuilder();
      builder.setCode(msg.getCode());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_SellHit_23306(CrossMartMsg.CR2S_SellHit_23306 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.sellSubmit(msg.getItemCode(), msg.getOriPrice(), msg.getMaxPrice(), msg.getHie());
   }

   @MsgHandlerAnno
   public void CR2S_NotifyDeal_23326(CrossMartMsg.CR2S_NotifyDeal_23326 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int price = msg.getPrice();
      int charge = ApplicationContextProvider.getConfigInt("AuctionServriceChage", 1000);
      double ratio = (double)((float)(charge * 100) / 10000.0F);
      int chargeValue = msg.getServiceCharge();
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      int mineRewardCentreId = ApplicationContextProvider.getConfigInt("martMailDealForSeller", 3212);
      CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPool().getEntity("centreAward", mineRewardCentreId);
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", msg.getItemId());
      String itemName = itemModel != null ? itemModel.getName() : "";
      String content = MessageFormat.format(centreAwardModel.getDesc(), itemName, price, ratio, chargeValue, price - chargeValue);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), content, (List)null, 604800000L, 134, 13410);
   }

   @MsgHandlerAnno
   public void S2C_Surpass_23144(MartMsg.S2C_Surpass_23144 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.player.isLogin()) {
         this.player.sendMsg(msg);
      } else {
         MartPlayerDao martPlayerDao = this.getMartPlayerDao();
         martPlayerDao.surpassSet.addAll(msg.getCodesList());
         martPlayerDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void CR2S_Deal_23334(CrossMartMsg.CR2S_Deal_23334 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PlayerDao playerDao = this.player.getPlayerDao();
      MartMsg.Goods goods = msg.getGoods();
      BagMsg.Item_Info itemInfo = goods.getItemInfo();
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemInfo.getId());
      this.player.getOperationMgr().addExtraLog(this.player, 46, itemInfo.getId() + "", itemModel.getName(), "1", "2", itemModel.getSubclass() + "", goods.getScoreId() + "", itemModel.getQuality() + "", PlayerDefine.PLAYER_DIAMOND + "", goods.getPriceInfo().getCurPrice() + "", goods.getPriceInfo().getOriPrice() + "", playerDao.lv + "", playerDao.combat_power + "", goods.getSeller() + "", goods.getSellerName());
   }

   private void returnItem(MartMsg.Goods goods, int reason) {
      BagMsg.Item_Info itemInfo = goods.getItemInfo();
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemInfo.getId());
      if (itemModel != null) {
         if (itemModel.getSubclass() == 32 || itemModel.getSubclass() == 36) {
            if (itemModel.getSubclass() == 32) {
               Map<Integer, PropertyModel> attrMap = new HashMap();

               for(CommonMsg.PropertyInfo propertyInfo : itemInfo.getPropertiesList()) {
                  PropertyModel propertyModel = new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue()));
                  attrMap.put(propertyModel.getType(), propertyModel);
               }

               GodBeastItem beastItem = new GodBeastItem(attrMap);
               beastItem.init(0, 1, itemModel, this.player);
               beastItem.martRecTime = reason == 13404 ? DateUtil.getIntTime(System.currentTimeMillis()) : 0;
               GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
               godBeastPart.addGodBeastItem(beastItem, 134, reason, true);
            } else {
               List<PropertyModel> entryPro = new ArrayList();

               for(CommonMsg.PropertyInfo propertyInfo : itemInfo.getPropertiesList()) {
                  PropertyModel propertyModel = new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue()));
                  entryPro.add(propertyModel);
               }

               NeiDanItem neiDanItem = new NeiDanItem(itemInfo.getId(), 0, 0, itemInfo.getParamId(), entryPro);
               neiDanItem.martRecTime = reason == 13404 ? DateUtil.getIntTime(System.currentTimeMillis()) : 0;
               NeiDanPart neiDanPart = (NeiDanPart)this.player.getMgrPart(NeiDanPart.class);
               neiDanPart.addNeiDanItem(neiDanItem, 134, reason, true);
            }

            PlayerDao playerDao = this.player.getPlayerDao();
            if (reason == 13403) {
               this.player.getOperationMgr().addExtraLog(this.player, 44, itemModel.getId() + "", itemModel.getName(), "1", "2", itemModel.getSubclass() + "", goods.getScoreId() + "", itemModel.getQuality() + "", PlayerDefine.PLAYER_DIAMOND + "", goods.getPriceInfo().getCurPrice() + "", goods.getPriceInfo().getOriPrice() + "", "-", "-", playerDao.lv + "", playerDao.combat_power + "");
            }

         }
      }
   }

   private void returnItem(MartDetailData martDetailData, int reason) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", martDetailData.itemId);
      if (itemModel != null) {
         if (itemModel.getSubclass() == 32 || itemModel.getSubclass() == 36) {
            if (itemModel.getSubclass() == 32) {
               GodBeastItem beastItem = new GodBeastItem(martDetailData.attrMap);
               beastItem.init(0, 1, itemModel, this.player);
               beastItem.martRecTime = reason == 13404 ? DateUtil.getIntTime(System.currentTimeMillis()) : 0;
               GodBeastPart godBeastPart = (GodBeastPart)this.player.getMgrPart(GodBeastPart.class);
               godBeastPart.addGodBeastItem(beastItem, 134, reason, true);
            } else if (itemModel.getSubclass() == 36) {
               NeiDanItem neiDanItem = new NeiDanItem(itemModel.getId(), 0, 0, martDetailData.entryId, new ArrayList(martDetailData.attrMap.values()));
               neiDanItem.martRecTime = reason == 13404 ? DateUtil.getIntTime(System.currentTimeMillis()) : 0;
               NeiDanPart neiDanPart = (NeiDanPart)this.player.getMgrPart(NeiDanPart.class);
               neiDanPart.addNeiDanItem(neiDanItem, 134, reason, true);
            }

            PlayerDao playerDao = this.player.getPlayerDao();
            if (reason == 13403) {
               this.player.getOperationMgr().addExtraLog(this.player, 44, itemModel.getId() + "", itemModel.getName(), "1", "2", itemModel.getSubclass() + "", martDetailData.scoreId + "", itemModel.getQuality() + "", PlayerDefine.PLAYER_DIAMOND + "", martDetailData.priceType + "", martDetailData.curPrice + "", "-", "-", playerDao.lv + "", playerDao.combat_power + "");
            }

         }
      }
   }

   private void checkOffGoods() {
      if (this.crossNettyClient.isLogin()) {
         if (this.martMgr.getState() == 0) {
            MartPlayerDao martPlayerDao = this.getMartPlayerDao();
            if (!martPlayerDao.sellMartDetails.isEmpty() || !martPlayerDao.unGetGoods.isEmpty()) {
               CrossMartMsg.S2CR_UploadOffGoods_23321.Builder builder = CrossMartMsg.S2CR_UploadOffGoods_23321.newBuilder();

               for(MartDetailData martDetailData : martPlayerDao.sellMartDetails.values()) {
                  this.logger.info("【拍卖场】上传因调服而被下架的物品 playerId:{} code:{}", this.player.getPlayerId(), martDetailData.code);
                  MartMsg.Goods.Builder goodsMsg = martDetailData.toGoodsBuilder();
                  builder.addTakeOffGoods(goodsMsg);
               }

               martPlayerDao.sellMartDetails.clear();

               for(MartDetailData martDetailData : martPlayerDao.unGetGoods.values()) {
                  this.logger.info("【拍卖场】上传调服时未领取的神兽数据 playerId:{} code:{}", this.player.getPlayerId(), martDetailData.code);
                  MartMsg.Goods.Builder goodsMsg = martDetailData.toGoodsBuilder();
                  builder.addUnGetGoods(goodsMsg);
               }

               martPlayerDao.unGetGoods.clear();
               martPlayerDao.updateOp();
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         }
      }
   }

   public static ResourceModel switchPrice(int priceType, int priceId, int value) {
      int switchPrice = ApplicationContextProvider.getConfigInt("martSwitchPrice", 0);
      if (switchPrice == 0 && priceId == PlayerDefine.PLAYER_DIAMOND) {
         int switchRatio = ApplicationContextProvider.getConfigInt("martDiamondToChipRatio", 10000);
         int switchValue = (int)((double)(value * switchRatio) / (double)10000.0F);
         return new ResourceModel(priceType, PlayerDefine.PLAYER_DIAMOND_CHIP, switchValue);
      } else {
         return new ResourceModel(priceType, priceId, value);
      }
   }

   public void updateRedState() {
      MartPlayerDao martPlayerDao = this.getMartPlayerDao();
      MartMsg.S2C_RedState_23162.Builder builder = MartMsg.S2C_RedState_23162.newBuilder();
      builder.setRewardNum(martPlayerDao.unGetGoods.size());
      builder.setPassIn(martPlayerDao.sellMartDetails.size() > 0);
      this.player.sendMsg(builder.build());
   }

   public void gmTest(String string) {
      String[] split = string.split("\\|");
      if ("cross".equals(split[0])) {
         CrossMartMsg.S2CR_GM_23381.Builder builder = CrossMartMsg.S2CR_GM_23381.newBuilder();
         builder.setString(split[1]);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      } else {
         String[] arr = split[0].split(",");
         switch (arr[0]) {
            case "sell":
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               List<ItemBase> itemBaseList = itemBagPart.getItemBaseById(Integer.parseInt(arr[1]));
               if (itemBaseList.size() > 0) {
                  int code = ((ItemBase)itemBaseList.get(0)).code;
                  this.logger.info("【拍卖场】gm上架物品 playerId:{} code:{} itemId:{}", new Object[]{this.player.getPlayerId(), code, ((ItemBase)itemBaseList.get(0)).id});
                  this.sellHit(code, Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));
               }
               break;
            case "enter":
               MartMsg.C2S_Enter_23127.Builder builder = MartMsg.C2S_Enter_23127.newBuilder();
               builder.setIsEnter(Integer.parseInt(arr[1]) == 1);
               this.C2S_Enter_23127(builder.build(), (String)null);
               break;
            case "showalive":
               WorldDao<WorldData> worldDataWorldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);

               for(Map.Entry<Long, Long> entry : ((WorldData)worldDataWorldDao.jsonData).alivePleyers.entrySet()) {
                  this.logger.info("时间:{} 活跃人数:{}", DateUtil.transferLongToDate((Long)entry.getKey()), entry.getValue());
               }
               break;
            case "updatecenterinfo":
               this.worldMgr.pushTask(() -> this.worldMgr.gmUpdateCenterInfo());
         }
      }

   }
}
