package com.gzbz.gamePlayer.mysteryShop;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.MysteryShopDao;
import com.gzbz.db.MysteryShopRecordDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.MysteryShopLibModel;
import com.gzbz.model.MysteryShopModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.MysteryShopMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.ResCountryDifUtils;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MysteryShopPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(PlayerChatPart.class);
   public static final int RATE_COUNT = 6;
   public static final String FREE_REFRESH = "FreeRefresh";
   public static final String PURCHASE_REFRESH = "PurchaseRefresh";
   public static final String DEFAULT_PRODUCT = "DefaultProduct";
   public static final String APPEAR_COUNT = "mysteryShopAppearCount";
   public static final int FAST_BUY = 1;
   private final List<ResourceModel> showList = new ArrayList();
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void msgMysteryData(MysteryShopMsg.C2S_MysteryShopData_7301 msg, String source) {
      this.checkFreeRefreshTime();
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      if (mysteryShopDao.items.isEmpty()) {
         mysteryShopDao.items.clear();
         List list = this.randomShopData();
         mysteryShopDao.items.addAll(list);
         mysteryShopDao.updateOp();
      }

      this.msgSendShopData();
   }

   public void checkFreeRefreshTime() {
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      int interval = Integer.parseInt(this.configManager.parseValue("FreeRefresh", 1, "\\|"));
      long curTime = System.currentTimeMillis();
      if (mysteryShopDao.usedFreeTimes <= 0) {
         mysteryShopDao.refreshTime = new Timestamp(curTime + (long)(interval * 1000));
      } else {
         long tempRefreshTime;
         for(tempRefreshTime = mysteryShopDao.refreshTime.getTime(); mysteryShopDao.usedFreeTimes > 0 && tempRefreshTime < curTime; tempRefreshTime += (long)(1000 * interval)) {
            --mysteryShopDao.usedFreeTimes;
         }

         mysteryShopDao.refreshTime = new Timestamp(tempRefreshTime);
         if (mysteryShopDao.usedFreeTimes == 0) {
            mysteryShopDao.refreshTime = new Timestamp(curTime + (long)(interval * 1000));
         }
      }

      mysteryShopDao.updateOp();
   }

   @MsgHandlerAnno
   public void msgRefresh(MysteryShopMsg.C2S_Refresh_7303 msg, String source) {
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      int refreshPrice = Integer.parseInt(this.configManager.parseValue("PurchaseRefresh", 0, "\\|"));
      int maxBuyTimes = Integer.parseInt(this.configManager.parseValue("PurchaseRefresh", 1, "\\|"));
      int freeTimes = Integer.parseInt(this.configManager.parseValue("FreeRefresh", 0, "\\|"));
      if (mysteryShopDao.usedFreeTimes >= freeTimes && mysteryShopDao.totalTimes >= maxBuyTimes) {
         this.player.failure(1000);
      } else {
         if (mysteryShopDao.usedFreeTimes >= freeTimes) {
            PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
            if (playerDao.getProperty(PlayerDefine.PLAYER_GOLD) < (long)refreshPrice) {
               this.player.failure(18);
               return;
            }

            ++mysteryShopDao.totalTimes;
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)refreshPrice, 14, 1401, 0, 0, "");
         } else {
            ++mysteryShopDao.usedFreeTimes;
         }

         this.checkFreeRefreshTime();
         mysteryShopDao.items.clear();
         List list = this.randomShopData();
         mysteryShopDao.items.addAll(list);
         mysteryShopDao.updateOp();
         if (msg.hasAutoBuy() && msg.getAutoBuy() && this.autoBuyItems()) {
            this.player.addResourceMsg(this.showList);
            this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_MYSTERY_SHOP);
            this.showList.clear();
         }

         this.msgSendShopData();
         this.player.triggerTask(612, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void msgBuyItem(MysteryShopMsg.C2S_BuyItem_7305 msg, String source) {
      int idx = msg.getIdx();
      int itemId = msg.getItemId();
      int itemType = msg.getItemType();
      int num = msg.getNum();
      int result = this.buyItems(idx, itemType, itemId, num, false);
      if (result != 1) {
         if (result != 53) {
            this.player.failure(result);
         }

      } else {
         MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
         MysteryShopItem shopItem = (MysteryShopItem)mysteryShopDao.items.get(idx);
         MysteryShopModel model = (MysteryShopModel)this.player.getGameModelPool().getEntity("mysteryShop", shopItem.id);
         MysteryShopMsg.S2C_BuyItem_7306.Builder builder = MysteryShopMsg.S2C_BuyItem_7306.newBuilder();
         builder.setIdx(idx);
         builder.setRestNum(model.getBuyLimit() - shopItem.hadBuyNum);
         this.player.sendMsg(builder.build());
         this.player.addResourceMsg(this.showList);
         this.player.sendResourceMsg();
         this.showList.clear();
         if (msg.hasGuideStep()) {
            this.player.updateGuideStep(msg.getGuideStep());
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_AutoBuyIds_7307(MysteryShopMsg.C2S_AutoBuyIds_7307 msg, String source) {
      List<Integer> idxList = msg.getIdxList();

      for(Integer id : idxList) {
         MysteryShopModel model = (MysteryShopModel)ApplicationContextProvider.getModelPoolEntity("mysteryShop", id);
         if (model != null && model.getFastBuy() != 1) {
            this.player.failure(6);
            return;
         }
      }

      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      mysteryShopDao.fastIds.clear();
      mysteryShopDao.fastIds.addAll(idxList);
      mysteryShopDao.updateOp();
      this.sendFastIds();
   }

   @MsgHandlerAnno
   public void C2S_Record_7309(MysteryShopMsg.C2S_Record_7309 msg, String source) {
      MysteryShopMsg.S2C_Record_7310.Builder builder = MysteryShopMsg.S2C_Record_7310.newBuilder();

      for(MysteryShopRecordDao recordDao : this.player.getList("tb_mystery_shop_record", this.player.getPlayerId())) {
         MysteryShopMsg.RecordInfo.Builder recordInfo = MysteryShopMsg.RecordInfo.newBuilder();
         recordInfo.setItemType(recordDao.itemType);
         recordInfo.setItemId(recordDao.itemId);
         recordInfo.setNum(recordDao.num);
         recordInfo.setTime(DateUtil.getIntTime(recordDao.createTime.getTime()));
         builder.addInfo(recordInfo);
      }

      this.player.sendMsg(builder.build());
   }

   private void msgSendShopData() {
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      MysteryShopMsg.S2C_MysteryShopData_7302.Builder builder = MysteryShopMsg.S2C_MysteryShopData_7302.newBuilder();
      builder.setUsedFreeTimes(mysteryShopDao.usedFreeTimes);
      builder.setTotalTimes(mysteryShopDao.totalTimes);
      builder.setRefreshTimes(mysteryShopDao.refreshTime.getTime());

      for(int i = 0; i < mysteryShopDao.items.size(); ++i) {
         MysteryShopItem item = (MysteryShopItem)mysteryShopDao.items.get(i);
         MysteryShopModel model = (MysteryShopModel)this.player.getGameModelPool().getEntity("mysteryShop", item.id);
         if (model != null) {
            MysteryShopMsg.MysteryShopItem.Builder shopItemBuilder = MysteryShopMsg.MysteryShopItem.newBuilder();
            shopItemBuilder.setIdx(i);
            shopItemBuilder.setId(item.id);
            shopItemBuilder.setItemType(model.getItemType());
            shopItemBuilder.setItemId(model.getItemId());
            shopItemBuilder.setCombineNum(model.getCombineNum());
            int restNum = model.getBuyLimit() - item.hadBuyNum;
            shopItemBuilder.setRestNum(Math.max(restNum, 0));
            shopItemBuilder.setResourceType(model.getResourceType());
            shopItemBuilder.setResourceId(model.getResourceId());
            int oriPrice = ResCountryDifUtils.goldAdditionForJp(model.getResourceType(), model.getResourceId(), model.getOriPrice());
            int disPrice = ResCountryDifUtils.goldAdditionForJp(model.getResourceType(), model.getResourceId(), model.getDisPrice());
            shopItemBuilder.setOriPrice(oriPrice);
            shopItemBuilder.setDisPrice(disPrice);
            shopItemBuilder.setVipLimit(model.getVipLimit());
            shopItemBuilder.setDiscont(model.getDiscount());
            shopItemBuilder.setRecommend(model.getRecommend());
            boolean timeLimit = model.getRefreshStartTime() != null && model.getRefreshStartTime() != "" && model.getRefreshEndTime() != null && model.getRefreshEndTime() != "";
            shopItemBuilder.setTimeLimit(timeLimit);
            builder.addItems(shopItemBuilder);
         } else {
            logger.error("神秘商店的配置出错,没有此物品了 mysteryShop表  id:{}", item.id);
         }
      }

      this.player.sendMsg(builder.build());
   }

   private void msgSendBuyItem(int idx, int restNum) {
      MysteryShopMsg.S2C_BuyItem_7306.Builder builder = MysteryShopMsg.S2C_BuyItem_7306.newBuilder();
      builder.setIdx(idx);
      builder.setRestNum(restNum);
      this.player.sendMsg(builder.build());
   }

   public List<MysteryShopItem> randomShopData() {
      List<MysteryShopItem> list = new ArrayList();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int mysteryShopGuideState = (Integer)playerResetCustomCache.getForeverNum(361, 0);
      if (0 == mysteryShopGuideState) {
         playerResetCustomCache.setForever(361, 1);

         for(Integer id : this.configManager.getIntList("DefaultProduct")) {
            MysteryShopItem shopItem = new MysteryShopItem(id, 0);
            list.add(shopItem);
         }

         return list;
      } else {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         int appearCount = this.configManager.getIntDefault("mysteryShopAppearCount", 1);
         int appearInDay = this.configManager.getIntDefault("mysteryShopAppearInDay", 1);
         long currentTime = System.currentTimeMillis();
         Map<Integer, Integer> recordMap = new HashMap();
         int randomMaxCount = this.configManager.getIntDefault("mysteryShopRandomMaxCount", 200);

         for(int i = 0; i < randomMaxCount; ++i) {
            int group = this.getShopGroup();
            int id = this.randomShopItem(group);
            MysteryShopModel mysteryShopModel = (MysteryShopModel)ApplicationContextProvider.getModelPoolEntity("mysteryShop", id);
            if (mysteryShopModel != null) {
               int tempCount = (Integer)MapUtil.getOrDefault(playerExtend.mysteryShopItems, id, 0);
               if (tempCount > 0 && tempCount >= appearInDay) {
                  continue;
               }

               int count = (Integer)MapUtil.getOrDefault(recordMap, mysteryShopModel.getItemId(), 0);
               if (count < appearCount) {
                  if (mysteryShopModel.getRefreshStartTime() != null && mysteryShopModel.getRefreshEndTime() != null && mysteryShopModel.getRefreshStartTime() != "" && mysteryShopModel.getRefreshEndTime() != "") {
                     long startTime = DateUtil.getLongTime(mysteryShopModel.getRefreshStartTime(), "yyyy-MM-dd");
                     long endTime = DateUtil.getLongTime(mysteryShopModel.getRefreshEndTime(), "yyyy-MM-dd");
                     if (currentTime > startTime && currentTime < endTime) {
                        playerExtend.mysteryShopItems.put(id, tempCount + 1);
                        recordMap.put(mysteryShopModel.getItemId(), count + 1);
                        list.add(new MysteryShopItem(id, 0));
                     }
                  } else {
                     recordMap.put(mysteryShopModel.getItemId(), count + 1);
                     list.add(new MysteryShopItem(id, 0));
                  }
               }
            }

            if (list.size() >= 6) {
               break;
            }
         }

         this.player.updatePlayerExtend(13);
         return list;
      }
   }

   public int randomShopItem(int group) {
      List<KeyValFun> keyValFunList = new ArrayList();

      for(MysteryShopModel shopModel : (List)ApplicationContextProvider.getModelPoolEntity("customMysteryShop", group)) {
         keyValFunList.add(new KeyValFun(shopModel.getId(), shopModel.getWeight()));
      }

      GamePlayer var10000 = this.player;
      int id = GamePlayer.countRate(keyValFunList);
      return id;
   }

   private int getShopGroup() {
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      ArrayList<KeyValFun> funList = new ArrayList();
      Map<Integer, MysteryShopLibModel> modelMap = ApplicationContextProvider.<Integer, MysteryShopLibModel>getModelPoolMap("mysteryShopLib");

      for(Map.Entry<Integer, MysteryShopLibModel> entry : modelMap.entrySet()) {
         MysteryShopLibModel libModel = (MysteryShopLibModel)entry.getValue();
         if (playerDao.lv >= libModel.getLevelBegin() && playerDao.lv < libModel.getLevelLimit()) {
            funList.add(new KeyValFun(libModel.getId(), libModel.getWeight()));
         }
      }

      GamePlayer var10000 = this.player;
      int id = GamePlayer.countRate(funList);
      if (modelMap.containsKey(id)) {
         return ((MysteryShopLibModel)modelMap.get(id)).getGroup();
      } else {
         logger.warn("神秘商店 mysteryShopLib 表配置错误");
         return 0;
      }
   }

   public void resetDaily() {
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      mysteryShopDao.totalTimes = 0;
      mysteryShopDao.updateOp();
      this.msgSendShopData();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.mysteryShopItems.clear();
      this.player.updatePlayerExtend(13);
   }

   public void loginHandle() {
      this.sendFastIds();
   }

   public void sendFastIds() {
      MysteryShopMsg.S2C_AutoBuyIds_7308.Builder builder = MysteryShopMsg.S2C_AutoBuyIds_7308.newBuilder();
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      Set<Integer> removeList = new HashSet();

      for(Integer id : mysteryShopDao.fastIds) {
         MysteryShopModel model = (MysteryShopModel)ApplicationContextProvider.getModelPoolEntity("mysteryShop", id);
         if (model != null && model.getFastBuy() == 1) {
            builder.addIdx(id);
         } else {
            removeList.add(id);
         }
      }

      this.player.sendMsg(builder.build());
      if (removeList.size() > 0) {
         for(Integer id : removeList) {
            mysteryShopDao.fastIds.remove(id);
         }

         mysteryShopDao.updateOp();
      }

   }

   public int buyItems(int idx, int itemType, int itemId, int num, boolean isAuto) {
      if (num > 0 && idx >= 0) {
         MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
         if (idx >= mysteryShopDao.items.size()) {
            return 6;
         } else {
            MysteryShopItem shopItem = (MysteryShopItem)mysteryShopDao.items.get(idx);
            MysteryShopModel model = (MysteryShopModel)this.player.getGameModelPool().getEntity("mysteryShop", shopItem.id);
            if (model == null) {
               return 5;
            } else if (model.getItemId() == itemId && model.getItemType() == itemType) {
               PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
               if (model.getVipLimit() > playerDao.vip_lv) {
                  return 19;
               } else if (num > model.getBuyLimit() - shopItem.hadBuyNum) {
                  return 4;
               } else {
                  int disPrice = ResCountryDifUtils.goldAdditionForJp(model.getResourceType(), model.getResourceId(), model.getDisPrice());
                  if (ResourceModel.checkTotalNumError(disPrice, num)) {
                     return 6;
                  } else {
                     int totalPrice = disPrice * num;
                     if (!this.player.checkResourceNum(model.getResourceType(), model.getResourceId(), totalPrice)) {
                        LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "NotEnough");
                        String errorStr = languageModel.getValue();
                        if (model.getResourceType() == 1) {
                           PlayerProperty propertyModel = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", model.getResourceId());
                           this.player.failure(53, MessageFormat.format(errorStr, propertyModel.getName()));
                        } else if (model.getResourceType() == 2) {
                           ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", model.getResourceId());
                           if (itemModel != null) {
                              this.player.failure(53, MessageFormat.format(errorStr, itemModel.getName()));
                           }
                        }

                        return 53;
                     } else {
                        shopItem.hadBuyNum += num;
                        this.player.delResource(model.getResourceType(), model.getResourceId(), (long)totalPrice, 14, 1402, itemId, num, "mysteryShop");
                        mysteryShopDao.updateOp();
                        this.player.addResource(itemType, itemId, num * model.getCombineNum(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 14, 1402, itemId, num, "mysteryShop");
                        this.addShowList(new ResourceModel(itemType, itemId, num * model.getCombineNum()));
                        this.player.triggerTask(402, 2, (long)num, 1);
                        if (isAuto) {
                           this.record(shopItem.id, itemType, itemId, num * model.getCombineNum());
                        }

                        return 1;
                     }
                  }
               }
            } else {
               return 6;
            }
         }
      } else {
         return 6;
      }
   }

   public boolean autoBuyItems() {
      MysteryShopDao mysteryShopDao = (MysteryShopDao)this.player.getData("tb_mystery_shop", this.player.getPlayerId());
      if (mysteryShopDao.fastIds.size() == 0) {
         return false;
      } else {
         boolean buySuccess = false;

         for(int idx = 0; idx < mysteryShopDao.items.size(); ++idx) {
            MysteryShopItem shopItem = (MysteryShopItem)mysteryShopDao.items.get(idx);
            if (mysteryShopDao.fastIds.contains(shopItem.id)) {
               MysteryShopModel model = (MysteryShopModel)ApplicationContextProvider.getModelPoolEntity("mysteryShop", shopItem.id);
               if (model != null) {
                  int result = this.buyItems(idx, model.getItemType(), model.getItemId(), model.getBuyLimit(), true);
                  if (result == 1) {
                     buySuccess = true;
                  }
               }
            }
         }

         return buySuccess;
      }
   }

   private void addShowList(ResourceModel resourceModel) {
      this.showList.add(resourceModel);
   }

   public void record(int id, int itemType, int itemId, int num) {
      List<MysteryShopRecordDao> recordDaoList = this.player.<MysteryShopRecordDao>getList("tb_mystery_shop_record", this.player.getPlayerId());
      if (recordDaoList.size() >= this.configManager.getIntDefault("mysteryShopRecordNum", 30)) {
         this.player.deleteDao(recordDaoList.get(0), false);
      }

      MysteryShopRecordDao recordDao = new MysteryShopRecordDao();
      recordDao.playerId = this.player.getPlayerId();
      recordDao.id = id;
      recordDao.itemType = itemType;
      recordDao.itemId = itemId;
      recordDao.num = num;
      this.player.insertDao(recordDao);
   }
}
