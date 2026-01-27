package com.gzbz.transport;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.db.WaterTransportDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CargoGoldenModel;
import com.gzbz.model.CargoShipAddModel;
import com.gzbz.model.CargoShipModel;
import com.gzbz.model.CargoShipSacrificesModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.PropertyExtModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossWaterTransportMsg;
import com.gzbz.protobuf.WaterTransportMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.part.WaterTransportPart;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.ComparatorUtil;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class WaterTransportMgr extends GameMgr {
   private static final Logger logger = LoggerFactory.getLogger(WaterTransportMgr.class);
   private final WorldMgr worldMgr;
   private final CrossNettyClient crossNettyClient;
   private final OnLineMgr onLineMgr;
   private final RankMgr rankMgr;
   private final MailWorldMgr mailWorldMgr;
   private final Map<Integer, Integer> altarDataMap = new ConcurrentHashMap();

   public WaterTransportMgr(WorldMgr worldMgr, CrossNettyClient crossNettyClient, OnLineMgr onLineMgr, RankMgr rankMgr, MailWorldMgr mailWorldMgr) {
      this.worldMgr = worldMgr;
      this.crossNettyClient = crossNettyClient;
      this.onLineMgr = onLineMgr;
      this.rankMgr = rankMgr;
      this.mailWorldMgr = mailWorldMgr;
   }

   protected void init() {
   }

   public void dailyReset() {
   }

   @MsgHandlerAnno
   public void CR2S_Ship_10213(CrossWaterTransportMsg.CR2S_Ship_10213 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WaterTransportMsg.S2C_WaterTransportShipNotify_9530.Builder notifyMsg = WaterTransportMsg.S2C_WaterTransportShipNotify_9530.newBuilder();
      notifyMsg.setShip(msg.getShipData());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @MsgHandlerAnno
   public void CR2S_SacrificeInfo_10204(CrossWaterTransportMsg.CR2S_SacrificeInfo_10204 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.hasAltar()) {
         this.altarDataMap.put(msg.getAltar().getType(), msg.getAltar().getExp());
         if (msg.getIsNotify()) {
            this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{this.buildAltarMsg()});
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_ShipArrive_10210(CrossWaterTransportMsg.CR2S_ShipArrive_10210 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WaterTransportMsg.S2C_WaterTransportArrive_9526.Builder notifyMsg = WaterTransportMsg.S2C_WaterTransportArrive_9526.newBuilder();
      notifyMsg.setShipId(msg.getShipId());
      notifyMsg.setRiver(msg.getRiver());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @MsgHandlerAnno
   public void CR2S_RankReward_10214(CrossWaterTransportMsg.CR2S_RankReward_10214 msg, CrossSubscribeMsg crossSubscribeMsg) {
   }

   @MsgHandlerAnno
   public void CR2S_Remains_10216(CrossWaterTransportMsg.CR2S_Remains_10216 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WaterTransportMsg.S2C_RemainsNotify_9540.Builder notifyMsg = WaterTransportMsg.S2C_RemainsNotify_9540.newBuilder();
      notifyMsg.setRemains(msg.getRemains());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   @MsgHandlerAnno
   public void CR2S_GoldShipNotify_10225(CrossWaterTransportMsg.CR2S_GoldShipNotify_10225 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.getGoldInfo()});
   }

   @MsgHandlerAnno
   public void CR2S_GoldShipDamageReward_10226(CrossWaterTransportMsg.CR2S_GoldShipDamageReward_10226 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardModelTreeMap = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_GOLD_SHIP_SETTLE);
      CentreAwardModel allSettleMail = (CentreAwardModel)centreAwardModelTreeMap.lastEntry().getValue();
      List<ResourceModel> allSettleRewards = new ArrayList();
      Map<Integer, CargoGoldenModel> cargoGoldenModelMap = ApplicationContextProvider.<Integer, CargoGoldenModel>getModelPoolMap("cargoGolden");
      List<CargoGoldenModel> cargoGoldenModels = new ArrayList(cargoGoldenModelMap.values());
      Collections.sort(cargoGoldenModels, ComparatorUtil.createComparatorByMethod(CargoGoldenModel.class, "getId"));

      for(CargoGoldenModel cargoGoldenModel : cargoGoldenModels) {
         if (cargoGoldenModel.getMinHurt() <= msg.getDamage() && cargoGoldenModel.getMaxHurt() >= msg.getDamage()) {
            allSettleRewards.addAll(cargoGoldenModel.getCountRewards());
            break;
         }
      }

      if (allSettleRewards.isEmpty()) {
         if (msg.getDamage() <= 0L) {
            allSettleRewards.addAll(((CargoGoldenModel)cargoGoldenModels.get(0)).getCountRewards());
         } else {
            allSettleRewards.addAll(((CargoGoldenModel)cargoGoldenModels.get(cargoGoldenModels.size() - 1)).getCountRewards());
         }
      }

      Map<Integer, String> allSettleOffLineParam = new HashMap();
      Map<Integer, Map<Integer, String>> personalRankOffLineParam = new HashMap();

      for(CrossWaterTransportMsg.CargoShipRankData rankData : msg.getRankDataList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.getPlayerId());
         if (gamePlayer != null) {
            CentreAwardModel personalMail = this.getGoldShipRankAwardModel(rankData.getRank());
            if (gamePlayer.isLogin()) {
               MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
               mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, allSettleMail.getTitle(), MessageFormat.format(allSettleMail.getDesc(), msg.getDamage()), allSettleRewards, 604800000L, 33, 3311});
               mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, personalMail.getTitle(), MessageFormat.format(personalMail.getDesc(), rankData.getRank()), personalMail.getItems(), 604800000L, 33, 3312});
            } else {
               allSettleOffLineParam.put(rankData.getPlayerId(), String.valueOf(msg.getDamage()));
               ((Map)MapUtil.computeIfAbsent(personalRankOffLineParam, personalMail.getId(), HashMap.class)).put(rankData.getPlayerId(), String.valueOf(rankData.getRank()));
            }
         }
      }

      if (!allSettleOffLineParam.isEmpty()) {
         this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, allSettleMail.getTitle(), MessageFormat.format(allSettleMail.getDesc(), msg.getDamage()), allSettleRewards, allSettleOffLineParam, 604800000L, 33, 3311, 0);
      }

      if (!personalRankOffLineParam.isEmpty()) {
         for(Map.Entry<Integer, Map<Integer, String>> entry : personalRankOffLineParam.entrySet()) {
            CentreAwardModel personalMail = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", (Integer)entry.getKey());
            this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, personalMail.getTitle(), personalMail.getDesc(), personalMail.getItems(), (Map)entry.getValue(), 604800000L, 33, 3312, 0);
         }
      }

   }

   public void requestAltar(GamePlayer gamePlayer) {
      gamePlayer.sendMsg(this.buildAltarMsg());
   }

   public void requestAltar() {
      Map<Integer, TreeMap<Integer, CargoShipAddModel>> cargoShipAddMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CargoShipAddModel>>getModelPoolMap("customCargoShipAdd");

      for(int type : cargoShipAddMap.keySet()) {
         CrossWaterTransportMsg.S2CR_Altar_10202.Builder requestMsg = CrossWaterTransportMsg.S2CR_Altar_10202.newBuilder();
         requestMsg.setType(type);
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, requestMsg.build());
      }

   }

   public void requestMyShips(int playerId, GamePlayer gamePlayer) {
      CrossWaterTransportMsg.S2CR_PlayerShips_10221.Builder msg = CrossWaterTransportMsg.S2CR_PlayerShips_10221.newBuilder();
      msg.setPlayerId(playerId);
      this.crossNettyClient.sendCross(gamePlayer.getServerId(), gamePlayer.getPlayerId(), msg.build());
   }

   public void requestGoldDamageRank(Integer limit, GamePlayer gamePlayer) {
      CrossWaterTransportMsg.S2CR_GoldDamageRank_10223.Builder msg = CrossWaterTransportMsg.S2CR_GoldDamageRank_10223.newBuilder();
      if (limit != null) {
         msg.setLimit(limit);
      }

      this.crossNettyClient.sendCross(gamePlayer.getServerId(), gamePlayer.getPlayerId(), msg.build());
   }

   @TaskMethod
   public void waterTransportSail(WaterTransportMsg.ShipInfo shipData, int playerId, ArrayingMirror arrayingMirror, int level) {
      CrossWaterTransportMsg.S2CR_Sail_10205.Builder msg = CrossWaterTransportMsg.S2CR_Sail_10205.newBuilder();
      msg.setShipData(shipData);
      msg.setArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
      msg.setLevel(level);
      this.crossNettyClient.sendCross(shipData.getServer(), playerId, msg.build());
   }

   public void sendWaterTransportInfo(GamePlayer gamePlayer, int river, Set<Integer> gotRiverRemainsRewardList) {
      CrossWaterTransportMsg.S2CR_ShipList_10201.Builder msg = CrossWaterTransportMsg.S2CR_ShipList_10201.newBuilder();
      msg.setRiver(river);
      msg.addAllGotRemains(gotRiverRemainsRewardList);
      this.crossNettyClient.sendCross(gamePlayer.getServerId(), gamePlayer.getPlayerId(), msg.build());
   }

   @TaskMethod
   public void waterTransportInterceptPlayer(GamePlayer player, int shipId, ArrayingMirror arrayingMirror, int interceptCount) {
      if (shipId > 0) {
         CrossWaterTransportMsg.S2CR_Intercept_10207.Builder msg = CrossWaterTransportMsg.S2CR_Intercept_10207.newBuilder();
         msg.setShipId(shipId);
         msg.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
         msg.setMyInterceptCount(interceptCount);
         msg.setHighPower(player.getMaxPlayerCombatPower());
         this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
      }
   }

   @TaskMethod
   public void waterTransportInterceptGoldShip(GamePlayer player, int shipType, ArrayingMirror arrayingMirror) {
      CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.Builder msg = CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.newBuilder();
      msg.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
      msg.setShipType(shipType);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   @TaskMethod
   public void waterTransportSacrifice(CargoShipSacrificesModel cargoShipSacrificesModel, GamePlayer gamePlayer) {
      CrossWaterTransportMsg.S2CR_Sacrifice_10203.Builder msg = CrossWaterTransportMsg.S2CR_Sacrifice_10203.newBuilder();
      msg.setType(cargoShipSacrificesModel.getType());
      msg.setExp(cargoShipSacrificesModel.getExpReward());
      msg.setOp(1);
      this.crossNettyClient.sendCross(gamePlayer.getServerId(), gamePlayer.getPlayerId(), msg.build());
   }

   public void broadcastAlreadySupport(int playerId) {
      WaterTransportMsg.S2C_AlreadySupportNotify_9548.Builder notifyMsg = WaterTransportMsg.S2C_AlreadySupportNotify_9548.newBuilder();
      notifyMsg.setFriendId(playerId);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
   }

   public void requestArrayingInfo(GamePlayer player, int shipId) {
      CrossWaterTransportMsg.S2CR_WaterTransportArrayingInfo_10215.Builder msg = CrossWaterTransportMsg.S2CR_WaterTransportArrayingInfo_10215.newBuilder();
      msg.setShipId(shipId);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void requestRemainsReward(GamePlayer player, int remainsId, int river) {
      CrossWaterTransportMsg.S2CR_RemainsReward_10217.Builder msg = CrossWaterTransportMsg.S2CR_RemainsReward_10217.newBuilder();
      msg.setRemainsId(remainsId);
      msg.setRiver(river);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void requestRemainsRewardOneKey(GamePlayer player, int river, Set<Integer> gotRiverRemainsRewardList) {
      CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.Builder msg = CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.newBuilder();
      msg.setRiver(river);
      msg.addAllGotRemains(gotRiverRemainsRewardList);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public void requestGoldShipInfo(GamePlayer player) {
      CrossWaterTransportMsg.S2CR_GoldShip_10222.Builder msg = CrossWaterTransportMsg.S2CR_GoldShip_10222.newBuilder();
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
   }

   public PropertyExtModel getBuff(int buffType) {
      Map<Integer, TreeMap<Integer, CargoShipAddModel>> cargoShipAddMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CargoShipAddModel>>getModelPoolMap("customCargoShipAdd");

      for(Map.Entry<Integer, Integer> entry : this.altarDataMap.entrySet()) {
         Integer type = (Integer)entry.getKey();
         Integer exp = (Integer)entry.getValue();
         TreeMap<Integer, CargoShipAddModel> cargoShipAddModelTreeMap = (TreeMap)cargoShipAddMap.get(type);
         if (cargoShipAddModelTreeMap != null) {
            for(CargoShipAddModel cargoShipAddModel : cargoShipAddModelTreeMap.values()) {
               if (cargoShipAddModel.getExp() > exp) {
                  break;
               }

               for(PropertyExtModel propertyExtModel : cargoShipAddModel.getBuffs()) {
                  if (propertyExtModel.getType() == buffType) {
                     return propertyExtModel;
                  }
               }
            }
         }
      }

      return null;
   }

   public void altarBuffTrigger(GamePlayer gamePlayer) {
      PropertyExtModel propertyExtModel = this.getBuff(306);
      if (propertyExtModel != null) {
         WaterTransportPart waterTransportPart = (WaterTransportPart)gamePlayer.getMgrPart(WaterTransportPart.class);
         waterTransportPart.pushTaskEx("sendWaterTransportMain", new Object[0]);
      }

   }

   public void gmSetTransport(GamePlayer player, int count) {
      WaterTransportPart waterTransportPart = (WaterTransportPart)player.getMgrPart(WaterTransportPart.class);
      waterTransportPart.gmSetTransport(count);
   }

   public void gmSetIntercept(GamePlayer player, int count) {
      WaterTransportPart waterTransportPart = (WaterTransportPart)player.getMgrPart(WaterTransportPart.class);
      waterTransportPart.gmSetInterceptCount(count);
   }

   public void gmSetQuality(GamePlayer player, int quality) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)player.getData("tb_water_transport", player.getPlayerId());
      waterTransportDao.shipModelId = CargoShipModel.getInitShipModel(quality);
      waterTransportDao.updateOp();
   }

   public void gmSetAltarExp(int type, int exp) {
      CrossWaterTransportMsg.S2CR_Sacrifice_10203.Builder msg = CrossWaterTransportMsg.S2CR_Sacrifice_10203.newBuilder();
      msg.setType(type);
      msg.setExp(exp);
      msg.setOp(0);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   public void gmSetBeIntercept(int shipId, int count) {
      List<Long> params = new ArrayList();
      params.add((long)shipId);
      params.add((long)count);
      this.crossGm("beInterceptCount", params);
   }

   public void gmSetAllBeIntercept(int count) {
      List<Long> params = new ArrayList();
      params.add(0L);
      params.add((long)count);
      this.crossGm("beInterceptCount", params);
   }

   public void gmArrive() {
      List<Long> params = new ArrayList();
      this.crossGm("arriveAll", params);
   }

   public void gmArrive(int playerId) {
      List<Long> params = new ArrayList();
      params.add((long)playerId);
      this.crossGm("arrive", params);
   }

   public void gmAddRobot(int num) {
      List<Long> params = new ArrayList();
      params.add((long)num);
      params.add((long)this.worldMgr.getWorldLv());
      this.crossGm("addRobot", params);
   }

   public void gmSetArriveTime(int playerId, int arriveTime) {
      int finalArriveTime = DateUtil.getIntTime(System.currentTimeMillis()) + arriveTime;
      List<Long> params = new ArrayList();
      params.add((long)playerId);
      params.add((long)finalArriveTime);
      this.crossGm("arriveTime", params);
   }

   public void gmClearProtect() {
      List<Long> params = new ArrayList();
      this.crossGm("clearProtect", params);
   }

   public void gmResetLucky(GamePlayer player) {
      WaterTransportPart waterTransportPart = (WaterTransportPart)player.getMgrPart(WaterTransportPart.class);
      waterTransportPart.gmResetLucky();
   }

   public void gmResetGoldCD(GamePlayer player) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)player.getData("tb_water_transport", player.getPlayerId());

      for(Map.Entry<Integer, Long> entry : waterTransportDao.goldInterceptCount.entrySet()) {
         int interceptCount = MiscUtil.getHiParam((Long)entry.getValue());
         entry.setValue(MiscUtil.comboInteger(interceptCount, 0));
      }

      waterTransportDao.updateOp();
      WaterTransportPart waterTransportPart = (WaterTransportPart)player.getMgrPart(WaterTransportPart.class);
      waterTransportPart.sendWaterTransportMain();
   }

   public void gmResetGoldInterceptCount(GamePlayer player) {
      WaterTransportDao waterTransportDao = (WaterTransportDao)player.getData("tb_water_transport", player.getPlayerId());
      waterTransportDao.goldInterceptCount.clear();
      waterTransportDao.updateOp();
      WaterTransportPart waterTransportPart = (WaterTransportPart)player.getMgrPart(WaterTransportPart.class);
      waterTransportPart.sendWaterTransportMain();
   }

   public void gmSetGoldShipStage(int stage) {
      List<Long> params = new ArrayList();
      params.add((long)stage);
      this.crossGm("setGoldShipStage", params);
   }

   public void gmSetGoldShiDamage(long damage) {
      List<Long> params = new ArrayList();
      params.add(damage);
      this.crossGm("setGoldShipDamage", params);
   }

   public void gmSetGoldShiAttackDamage(int playerId, long damage) {
      List<Long> params = new ArrayList();
      params.add(damage);
      params.add((long)playerId);
      this.crossGm("setGoldShipAttackDamage", params);
   }

   private void crossGm(String cmd, List<Long> params) {
      CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.Builder msg = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.newBuilder();
      msg.setCmd(cmd);
      msg.addAllParams(params);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   private WaterTransportMsg.S2C_WaterTransportSacrificeInfo_9522 buildAltarMsg() {
      WaterTransportMsg.S2C_WaterTransportSacrificeInfo_9522.Builder msg = WaterTransportMsg.S2C_WaterTransportSacrificeInfo_9522.newBuilder();
      msg.setTailWindExp((Integer)MapUtil.getOrDefault(this.altarDataMap, 1, 0));
      msg.setDeadWindExp((Integer)MapUtil.getOrDefault(this.altarDataMap, 2, 0));
      return msg.build();
   }

   private CentreAwardModel getGoldShipRankAwardModel(int rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardModelTreeMap = (TreeMap)rewardMap.get(CentreAwardModel.TYPE_GOLD_SHIP_PERSONAL_RANK);

      for(CentreAwardModel centreAwardModel : centreAwardModelTreeMap.values()) {
         if (rank >= centreAwardModel.getMinRank() && rank <= centreAwardModel.getMaxRank()) {
            return centreAwardModel;
         }
      }

      return (CentreAwardModel)centreAwardModelTreeMap.lastEntry().getValue();
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      this.rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.WATER_TRANSPORT);
      this.rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.WATER_TRANSPORT_INTERCEPT);
   }
}
