package com.gzbz.shop.part;

import allMgr.MgrParent;
import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.ShopBuyRecordDao;
import com.gzbz.db.ShopDao;
import com.gzbz.db.bean.ShopBuyRecordData;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ShopMsg;
import com.gzbz.shop.ShopHelper;
import com.gzbz.shop.domain.AbstractShop;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ShopPart extends PlayerPart {
   public static final int BUY_NUM_LIMIT = 9999;
   public static final int RESET_DAY = 1;
   public static final int RESET_WEEK = 2;
   public static final int RESET_MONTH = 3;
   public static final int RESET_ACT_ROTATE = 5;
   private final Map<Integer, AbstractShop> shopMap = new HashMap();

   public void init(MgrParent mgr) {
      super.init(mgr);
      ShopHelper.shopClasses.forEach((shopClass) -> {
         try {
            Constructor constructor = shopClass.getDeclaredConstructor(GamePlayer.class);
            AbstractShop abstractShop = (AbstractShop)constructor.newInstance(this.player);
            this.shopMap.put(abstractShop.getShopId(), abstractShop);
         } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException e) {
            this.logger.error("初始化玩家{}商城错误:{}", new Object[]{this.player.getPlayerId(), ((ReflectiveOperationException)e).getMessage(), e});
         }

      });
   }

   @MsgHandlerAnno
   public void msgShopData(ShopMsg.C2S_ShopData_7601 msg, String source) {
      int shopId = msg.getShopId();
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop == null) {
         this.player.failure(6);
      } else if (!shop.isOpen()) {
         this.player.failure(21);
      } else {
         this.handleSendShopData(shopId, 2);
      }
   }

   @MsgHandlerAnno
   public void msgBuyItem(ShopMsg.C2S_BuyItem_7605 msg, String source) {
      int shopId = msg.getShopId();
      int id = msg.getId();
      int num = msg.getNum();
      int hintCode = this.buyHandle(shopId, id, num, PlayerMsg.ShowType.SHOW_TYPE_COMMON);
      if (hintCode != 1) {
         this.logger.info("玩家{}购买物品失败 shopId:{} id:{} num:{} hintCode:{}", new Object[]{this.player.getPlayerId(), shopId, id, num, hintCode});
      }

   }

   public int buyHandle(int shopId, int id, int num, PlayerMsg.ShowType showType) {
      if (num > 0 && num < 9999) {
         AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
         if (shop != null && shop.isOpen()) {
            ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(shop.getExcelName(), id);
            if (model == null) {
               return 5;
            } else if (shop.buyItem(id, num)) {
               long totalNum = (long)(num * model.getCombineNum());
               if (totalNum > 2147483647L) {
                  return 4;
               } else {
                  this.player.addResource(model.getItemType(), model.getItemId(), (int)totalNum, showType, 1, 101, 0, 0, "shopId:" + shopId);
                  int restNum = shop.getRestNum(id);
                  ShopMsg.S2C_BuyItem_7606.Builder builder = ShopMsg.S2C_BuyItem_7606.newBuilder();
                  builder.setShopId(shopId);
                  builder.setId(id);
                  builder.setRestNum(restNum);
                  this.player.sendMsg(builder.build());
                  if (shopId == 1) {
                     this.player.triggerTask(402, 1, (long)num, 1);
                  }

                  this.player.triggerTask(405, shopId, (long)num, 1);
                  return 1;
               }
            } else {
               return 0;
            }
         } else {
            return 21;
         }
      } else {
         return 4;
      }
   }

   public void buyItems(int shopId, Set<Integer> ids) {
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop == null) {
         this.player.failure(6);
      } else {
         List<ResourceModel> resourceModels = new ArrayList();

         for(Integer id : ids) {
            int num = 1;
            int hintCode = this.buyHandle(shopId, id, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW);
            if (hintCode == 1) {
               ShopItemBaseModel model = (ShopItemBaseModel)this.player.getGameModelPool().getEntity(shop.getExcelName(), id);
               resourceModels.add(new ResourceModel(model.getItemType(), model.getItemId(), model.getCombineNum() * num));
               this.buyRecord(shopId, model.getItemType(), model.getItemId(), model.getCombineNum() * num, 1);
            }
         }

         if (resourceModels.size() > 0) {
            this.player.addResourceMsg(resourceModels);
            this.player.sendResourceMsg();
         }

      }
   }

   @MsgHandlerAnno
   public boolean refresh(ShopMsg.C2S_Refresh_7603 msg, String source) {
      int shopId = msg.getShopId();
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop == null) {
         return this.player.failure(6);
      } else {
         if (shop.refresh()) {
            this.handleSendShopData(shopId, 3);
         }

         if (msg.getAutoBuy()) {
            shop.autoBuyItems();
         }

         return true;
      }
   }

   @MsgHandlerAnno
   public void C2S_AutoInfo_7607(ShopMsg.C2S_AutoInfo_7607 msg, String source) {
      int shopId = msg.getShopId();
      this.sendAutoInfo(shopId);
   }

   @MsgHandlerAnno
   public void C2S_SetAutoBuy_7609(ShopMsg.C2S_SetAutoBuy_7609 msg, String source) {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = msg.getShopId();
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop == null) {
         this.logger.info("playerId:{} 设置的自动购买错误 shopId:{} 不存在", this.player.getPlayerId(), shopId);
      } else {
         Set<Integer> autoIdSet = new HashSet();
         Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(shop.getExcelName());

         for(Integer id : msg.getIdList()) {
            ShopItemBaseModel itemBaseModel = (ShopItemBaseModel)modelMap.get(id);
            if (itemBaseModel != null && itemBaseModel.getAutoBuy() != 0) {
               autoIdSet.add(id);
            }
         }

         shopDao.autoMap.put(shopId, autoIdSet);
         shopDao.updateOp();
         this.sendAutoInfo(shopId);
      }
   }

   public void sendAutoInfo(int shopId) {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      List<ShopMsg.AutoInfo> list = new ArrayList();
      if (shopId == 0) {
         for(Map.Entry<Integer, Set<Integer>> entry : shopDao.autoMap.entrySet()) {
            list.add(this.autoInfoBuild((Integer)entry.getKey(), (Set)entry.getValue()).build());
         }
      } else {
         Set<Integer> autoIdSet = (Set)MapUtil.getOrDefault(shopDao.autoMap, shopId, HashSet.class);
         list.add(this.autoInfoBuild(shopId, autoIdSet).build());
      }

      ShopMsg.S2C_SetAutoBuy_7610.Builder builder = ShopMsg.S2C_SetAutoBuy_7610.newBuilder();
      builder.addAllAutoInfo(list);
      this.player.sendMsg(builder.build());
   }

   public ShopMsg.AutoInfo.Builder autoInfoBuild(int shopId, Set<Integer> autoIdSet) {
      ShopMsg.AutoInfo.Builder builder = ShopMsg.AutoInfo.newBuilder();
      builder.setShopId(shopId);
      builder.addAllId(autoIdSet);
      return builder;
   }

   public void resetDaily() {
      this.resetShop(1);
   }

   public void resetWeek() {
      this.resetShop(2);
   }

   public void resetMonth() {
      this.resetShop(3);
   }

   private void resetShop(int type) {
      for(Map.Entry<Integer, AbstractShop> entry : this.shopMap.entrySet()) {
         AbstractShop shop = (AbstractShop)entry.getValue();
         shop.handleReset(type);
      }

   }

   public void resetShop(int type, int shopId) {
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (null != shop) {
         shop.handleReset(type);
      }
   }

   public void resetShopById(int shopId) {
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop != null) {
         shop.resetShop();
      }

   }

   public void handleSendShopData(int shopId, int opType) {
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop != null) {
         List<ShopItemData> list = shop.getShopList();
         if (list != null) {
            ShopMsg.S2C_ShopData_7602.Builder builder = ShopMsg.S2C_ShopData_7602.newBuilder();
            builder.setShopId(shopId);
            builder.setOpType(opType);

            for(ShopItemData data : list) {
               ShopMsg.Shop_Item.Builder itemBuilder = ShopMsg.Shop_Item.newBuilder();
               itemBuilder.setId(data.id);
               itemBuilder.setRestNum(data.restNum);
               builder.addItem(itemBuilder);
            }

            shop.addExtraParams(builder);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void checkShopItemUnlock() {
      PlayerDao playerDao = this.player.getPlayerDao();

      for(Map.Entry<Integer, AbstractShop> entry : this.shopMap.entrySet()) {
         AbstractShop shop = (AbstractShop)entry.getValue();
         if (shop.isOpen()) {
            List<ShopItemBaseModel> models = shop.getShopItemModelList();
            if (models != null && !models.isEmpty()) {
               boolean unlock = false;

               for(ShopItemBaseModel model : models) {
                  if ((model.getLvLimit() == playerDao.lv || model.getLvLimitEx() == playerDao.lv) && shop.checkLv(model.getLvLimit(), model.getLvLimitEx(), model.getWorldlvLimit())) {
                     unlock = true;
                     break;
                  }
               }

               if (unlock) {
                  this.handleSendShopData((Integer)entry.getKey(), 1);
               }
            }
         }
      }

   }

   public void levelUp(int preLv, int newLv) {
      this.checkShopItemUnlock();
   }

   public void loginHandle() {
      this.resetWarcraftShopAutoInfo();
      this.sendAutoInfo(0);
   }

   public void buyRecord(int shopId, int itemType, int itemId, int num, int buyType) {
      ShopBuyRecordData recordData = new ShopBuyRecordData();
      recordData.shopId = shopId;
      recordData.itemType = itemType;
      recordData.itemId = itemId;
      recordData.num = num;
      recordData.buyType = buyType;
      ShopBuyRecordDao recordDao = (ShopBuyRecordDao)this.player.getData("tb_shop_buy_record", this.player.getPlayerId());
      ((List)MapUtil.computeIfAbsent(recordDao.recordDataMap, shopId, ArrayList.class)).add(recordData);
      recordDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_ShopBuyRecord_7611(ShopMsg.C2S_ShopBuyRecord_7611 msg, String source) {
      ShopBuyRecordDao recordDao = (ShopBuyRecordDao)this.player.getData("tb_shop_buy_record", this.player.getPlayerId());
      ShopMsg.S2C_ShopBuyRecord_7612.Builder builder = ShopMsg.S2C_ShopBuyRecord_7612.newBuilder();
      ShopMsg.ShopRecordInfos.Builder recordInfos = ShopMsg.ShopRecordInfos.newBuilder();
      recordInfos.setShopId(msg.getShopId());

      for(ShopBuyRecordData recordData : MapUtil.getOrDefault(recordDao.recordDataMap, msg.getShopId(), ArrayList.class)) {
         ShopMsg.RecordInfo.Builder info = ShopBuyRecordData.builderRecord(recordData);
         recordInfos.addRecordInfo(info);
      }

      builder.addRecords(recordInfos);
      this.player.sendMsg(builder.build());
   }

   private void resetWarcraftShopAutoInfo() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.warcraftReset <= 0) {
         playerExtend.warcraftReset = DateUtil.getIntTime(System.currentTimeMillis());
         this.player.updatePlayerExtend(13);
         this.resetAutoInfo(10);
      }
   }

   private void resetAutoInfo(int shopId) {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      AbstractShop shop = (AbstractShop)this.shopMap.get(shopId);
      if (shop != null) {
         shopDao.autoMap.remove(shopId);
         shopDao.updateOp();
      }
   }
}
