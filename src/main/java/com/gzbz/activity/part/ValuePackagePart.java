package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.ValuePackageDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.ValuePackageModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ValuePackageMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.util.ResCountryDifUtils;
import com.gzbz.util.TempUtil;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ValuePackagePart extends PlayerPart {
   private static final int STATE_NORMAL = 0;
   private static final int STATE_HAD_BUY = 1;
   private static final String GIFT_REFRESH_TIME = "giftRefreshTime";
   Logger logger = LoggerFactory.getLogger(FriendPart.class);
   @Autowired
   ConfigManager configManager;
   @Autowired
   UnionMgrParent unionMgrParent;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   MailWorldMgr mailWorldMgr;

   @MsgHandlerAnno
   public void C2S_ValuePackageInfo_10501(ValuePackageMsg.C2S_ValuePackageInfo_10501 msg, String source) {
      ValuePackageMsg.S2C_ValuePackageInfo_10502.Builder builder = ValuePackageMsg.S2C_ValuePackageInfo_10502.newBuilder();
      long refreshTime = this.getResreshTime();
      builder.setRefreshTime((int)(refreshTime / 1000L));
      Map<Integer, ValuePackageDao> map = this.getInfo();

      for(Map.Entry<Integer, ValuePackageDao> entry : map.entrySet()) {
         ValuePackageDao valuePackageDao = (ValuePackageDao)entry.getValue();
         int id = valuePackageDao.freeId > 0 ? valuePackageDao.freeId : valuePackageDao.id;
         ValuePackageModel valuePackageModel = (ValuePackageModel)this.player.getGameModelPool().getEntity("valuePackage", id);
         if (valuePackageModel != null) {
            ValuePackageMsg.ValueInfo.Builder valueInfo = this.packageValueInfo(valuePackageDao);
            builder.addInfo(valueInfo);
         } else {
            this.logger.info("超值礼包 id = {} 没有配置数据", id);
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_BuyItem_10503(ValuePackageMsg.C2S_BuyItem_10503 msg, String source) {
      int id = msg.getId();
      ValuePackageModel valuePackageModel = (ValuePackageModel)this.player.getGameModelPool().getEntity("valuePackage", id);
      if (valuePackageModel == null) {
         return this.player.failure(5);
      } else {
         Map<Integer, ValuePackageDao> valuePackageDaoMap = this.player.<Integer, ValuePackageDao>getMap("tb_value_package", this.player.getPlayerId());
         ValuePackageDao valuePackageDao = (ValuePackageDao)valuePackageDaoMap.get(valuePackageModel.getType());
         if (valuePackageDao == null) {
            this.logger.warn("超值礼包 购买的物品不存在 playerId:{} id:{}", this.player.getPlayerId(), id);
            return false;
         } else {
            int disPrice = valuePackageModel.getDisPrice();
            if (disPrice == 0) {
               if (valuePackageDao.id != id && valuePackageDao.freeId != id) {
                  return this.player.failure(6);
               }

               if (valuePackageDao.freeState == 1) {
                  return this.player.failure(19000);
               }

               valuePackageDao.freeId = 0;
               valuePackageDao.freeState = 1;
               if (valuePackageDao.id == id) {
                  valuePackageDao.id = valuePackageModel.getNextId();
               }
            } else {
               if (valuePackageDao.id != id) {
                  return this.player.failure(6);
               }

               if (valuePackageDao.buyTimes >= valuePackageDao.totalTimes) {
                  return this.player.failure(25);
               }

               disPrice = ResCountryDifUtils.goldAdditionForJp(1, PlayerDefine.PLAYER_GOLD, disPrice);
               if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, disPrice)) {
                  return this.player.failure(28);
               }

               ++valuePackageDao.buyTimes;
               if (valuePackageModel.getNextId() != 0) {
                  valuePackageDao.id = valuePackageModel.getNextId();
               }
            }

            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)disPrice, 39, 3901, id, 1, valuePackageModel.getName());
            this.player.addResource(valuePackageModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 39, 3901, id, 0, "");
            valuePackageDao.updateOp();
            ValuePackageMsg.ValueInfo.Builder valueInfo = this.packageValueInfo(valuePackageDao);
            ValuePackageMsg.S2C_BuyItem_10504.Builder builder = ValuePackageMsg.S2C_BuyItem_10504.newBuilder();
            builder.setInfo(valueInfo);
            this.player.sendMsg(builder.build());
            PlayerDao playerDao = this.player.getPlayerDao();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int freeNum = (Integer)playerResetCustomCache.getDailyNum(392, 0);
            if (disPrice > 0 || disPrice == 0 && freeNum == 0) {
               if (disPrice == 0) {
                  playerResetCustomCache.addDailyReset(392, 1);
               }

               UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerDao.unionId);
               if (unionMgr != null) {
                  int centreAwardId = this.configManager.getIntDefault("centreAwardId", valuePackageModel.getAwardId());
                  CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", centreAwardId);
                  String name = TempUtil.fixNameForMessageFormat(playerDao.playerName);
                  String context = MessageFormat.format(centreAwardModel.getDesc(), name);
                  Map<Integer, String> playerParams = new HashMap();
                  int giftDailyLimit = this.configManager.getIntDefault("GiftDailyLimit", 500);
                  Map<Integer, UnionMemberDao> daoMap = unionMgr.getUnionMembers();

                  for(Map.Entry<Integer, UnionMemberDao> entry : daoMap.entrySet()) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(((UnionMemberDao)entry.getValue()).playerId);
                     if (gamePlayer != null) {
                        PlayerResetCustomCache tmpCustomCache = (PlayerResetCustomCache)gamePlayer.getCustomCache("tb_player_reset", gamePlayer.getPlayerId());
                        int tmpReceiveMailNum = (Integer)tmpCustomCache.getDailyNum(393, 0);
                        if (tmpReceiveMailNum < giftDailyLimit) {
                           playerParams.put(gamePlayer.getPlayerId(), gamePlayer.getPublicDao().playerName);
                           tmpCustomCache.setDailyReset(393, tmpReceiveMailNum + 1);
                        }
                     }
                  }

                  this.mailWorldMgr.addParamsMailAndSendOnline(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), context, centreAwardModel.getItems(), playerParams, 604800000L, 39, 3902, 0);
               }
            }

            LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2400);
            if (systemFunctionModel != null) {
               logOperationMgr.addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
               logOperationMgr.addReceiveAwardNewLog(this.player, 15, systemFunctionModel.getId(), systemFunctionModel.getName(), valuePackageModel.getName(), valuePackageModel.getName(), disPrice, 1, 1);
            }

            return true;
         }
      }
   }

   private ValuePackageMsg.ValueInfo.Builder packageValueInfo(ValuePackageDao valuePackageDao) {
      ValuePackageMsg.ValueInfo.Builder valueInfo = ValuePackageMsg.ValueInfo.newBuilder();
      valueInfo.setType(valuePackageDao.type);
      int id = valuePackageDao.freeId > 0 ? valuePackageDao.freeId : valuePackageDao.id;
      ValuePackageModel valuePackageModel = (ValuePackageModel)this.player.getGameModelPool().getEntity("valuePackage", id);
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int oriPrice = ResCountryDifUtils.goldAdditionForJp(1, PlayerDefine.PLAYER_GOLD, valuePackageModel.getOriPrice());
      int disPrice = ResCountryDifUtils.goldAdditionForJp(1, PlayerDefine.PLAYER_GOLD, valuePackageModel.getDisPrice());
      valueInfo.setId(id);
      valueInfo.setTotalTimes(valuePackageDao.totalTimes);
      valueInfo.setBuyTimes(valuePackageDao.buyTimes);
      valueInfo.setOriPrice(oriPrice);
      valueInfo.setDisPrice(disPrice);
      valueInfo.setLvLimit(valuePackageModel.getLvLimit());

      for(ResourceModel resourceModel : valuePackageModel.getRewards()) {
         if (itemBagPart.checkItemExist(resourceModel.getType(), resourceModel.getId())) {
            valueInfo.addItems(resourceModel.builder());
         } else {
            this.logger.info("超值礼包配置数据错误 type={}, id={}", resourceModel.getType(), resourceModel.getId());
         }
      }

      return valueInfo;
   }

   private Map<Integer, ValuePackageDao> getInfo() {
      Map<Integer, ValuePackageDao> map = this.player.<Integer, ValuePackageDao>getMap("tb_value_package", this.player.getPlayerId());
      if (!CollectionUtils.isEmpty(map)) {
         return map;
      } else {
         Map<Integer, ValuePackageModel> modelMap = this.player.getGameModelPool().getMap("valuePackage");
         Map<Integer, ValuePackageModel> tempMap = new HashMap();
         Map<Integer, Integer> totalTimeMap = new HashMap();
         Map<Integer, Integer> freeMap = new HashMap();

         for(Map.Entry<Integer, ValuePackageModel> entry : modelMap.entrySet()) {
            ValuePackageModel valuePackageModel = (ValuePackageModel)entry.getValue();
            ValuePackageModel oriModel = (ValuePackageModel)tempMap.get(valuePackageModel.getType());
            if (oriModel != null) {
               if (valuePackageModel.getId() < oriModel.getId()) {
                  tempMap.put(valuePackageModel.getType(), valuePackageModel);
               }
            } else {
               tempMap.put(valuePackageModel.getType(), valuePackageModel);
            }

            if (valuePackageModel.getDisPrice() > 0) {
               totalTimeMap.put(valuePackageModel.getType(), (Integer)MapUtil.getOrDefault(totalTimeMap, valuePackageModel.getType(), 0) + 1);
            } else {
               MapUtil.computeIfAbsent(freeMap, valuePackageModel.getType(), valuePackageModel.getId());
            }
         }

         map = new HashMap();

         for(Map.Entry<Integer, ValuePackageModel> entry : tempMap.entrySet()) {
            ValuePackageDao valuePackageDao = new ValuePackageDao();
            ValuePackageModel valuePackageModel = (ValuePackageModel)entry.getValue();
            valuePackageDao.playerId = this.player.getPlayerId();
            valuePackageDao.type = valuePackageModel.getType();
            valuePackageDao.id = valuePackageModel.getId();
            valuePackageDao.beginId = valuePackageModel.getId();
            valuePackageDao.totalTimes = (Integer)MapUtil.getOrDefault(totalTimeMap, valuePackageModel.getType(), 0);
            valuePackageDao.buyTimes = 0;
            valuePackageDao.freeId = (Integer)MapUtil.getOrDefault(freeMap, valuePackageModel.getType(), 0);
            valuePackageDao.beginFreeId = valuePackageDao.freeId;
            valuePackageDao.freeState = 0;
            this.player.insertDao(valuePackageDao);
            map.put(valuePackageModel.getType(), valuePackageDao);
         }

         return map;
      }
   }

   public void resetHour() {
      this.getResreshTime();
   }

   private long getResreshTime() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      long refreshTime = (Long)playerResetCustomCache.getForeverNum(391, 0L);
      if (refreshTime <= System.currentTimeMillis()) {
         long stamp = DateUtil.getDayStartTimeStamp();
         int giftRefreshTime = this.configManager.getIntDefault("giftRefreshTime", 2);
         int hour = DateUtil.cHour();
         refreshTime = stamp + (long)(((int)Math.floor((double)(hour / giftRefreshTime)) + 1) * giftRefreshTime * 3600 * 1000);
         playerResetCustomCache.setForever(391, refreshTime);
         Map<Integer, ValuePackageDao> map = this.getInfo();
         if (!CollectionUtils.isEmpty(map)) {
            for(Map.Entry<Integer, ValuePackageDao> entry : map.entrySet()) {
               ValuePackageDao valuePackageDao = (ValuePackageDao)entry.getValue();
               valuePackageDao.freeId = valuePackageDao.beginFreeId;
               valuePackageDao.freeState = 0;
               valuePackageDao.updateOp();
            }

            this.C2S_ValuePackageInfo_10501((ValuePackageMsg.C2S_ValuePackageInfo_10501)null, "");
         }
      }

      return refreshTime;
   }

   public void resetDaily() {
      Map<Integer, ValuePackageDao> map = this.getInfo();
      if (!CollectionUtils.isEmpty(map)) {
         for(Map.Entry<Integer, ValuePackageDao> entry : map.entrySet()) {
            ValuePackageDao valuePackageDao = (ValuePackageDao)entry.getValue();
            valuePackageDao.id = valuePackageDao.beginId;
            valuePackageDao.buyTimes = 0;
            valuePackageDao.freeId = valuePackageDao.beginFreeId;
            valuePackageDao.freeState = 0;
            valuePackageDao.freeState = 0;
            valuePackageDao.updateOp();
         }

         this.C2S_ValuePackageInfo_10501((ValuePackageMsg.C2S_ValuePackageInfo_10501)null, "");
      }

   }
}
