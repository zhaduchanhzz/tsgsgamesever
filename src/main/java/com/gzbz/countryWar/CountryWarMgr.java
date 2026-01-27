package com.gzbz.countryWar;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.db.GameDBPool;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CountryWarMapModel;
import com.gzbz.model.CountryWarRankRewardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CountryWarMsg;
import com.gzbz.protobuf.CrossCountryWarMsg;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jodd.util.StringUtil;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.redisson.api.RMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class CountryWarMgr extends GameMgr {
   private Logger logger = LoggerFactory.getLogger(this.getClass());
   @Autowired
   GameModelPool gameModelPool;
   @Autowired
   private GameDBPool dbPool;
   private final WorldMgr worldMgr;
   private final CrossNettyClient crossNettyClient;
   private int activityId;
   private int mapId;
   private int state;
   public static final Set<Integer> onActivityPlayerSet = new ConcurrentHashSet();

   public CountryWarMgr(WorldMgr worldMgr, CrossNettyClient crossNettyClient) {
      this.worldMgr = worldMgr;
      this.crossNettyClient = crossNettyClient;
   }

   public int getState() {
      return this.state;
   }

   @TaskMethod
   public void setState(int state) {
      this.state = state;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public int getMapId() {
      return this.mapId;
   }

   public void removeOnActivityPlayerId(int playerId) {
      if (onActivityPlayerSet.contains(playerId)) {
         onActivityPlayerSet.remove(playerId);
      }

   }

   public void addOnActivityPlayerId(int playerId) {
      onActivityPlayerSet.add(playerId);
   }

   public boolean isActivityStart() {
      return this.state == 1;
   }

   protected void init() {
   }

   @MsgHandlerAnno
   public void CR2S_ActivityState_11404(CrossCountryWarMsg.CR2S_ActivityState_11404 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.activityId = msg.getActivityId();
      this.mapId = msg.getMapId();
      this.state = msg.getState();
      if (this.state == 2) {
         for(Integer playerId : this.queryAllCountryDao()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            gamePlayer.pushTask(() -> {
               CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
               countryWarPart.grantTaskScoreReward();
               countryWarPart.clearCountryDao();
            });
         }
      }

      this.noticePlayerOfCWState();
   }

   public void noticePlayerOfCWState() {
      for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
         gamePlayer.pushTask(() -> {
            CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
            countryWarPart.sendActivityState(countryWarPart.getCountryWarDao(), this.state);
         });
      }

   }

   @MsgHandlerAnno
   public void CR2S_ChangeCityInfo_11402(CrossCountryWarMsg.CR2S_ChangeCityInfo_11402 msg, CrossSubscribeMsg crossSubscribeMsg) {
      CountryWarMsg.S2C_CityChange_11304.Builder builder = CountryWarMsg.S2C_CityChange_11304.newBuilder();
      builder.setReason(msg.getReason());
      if (msg.getReason() != 0) {
         builder.setPlayerId(msg.getPlayerId());
         builder.setPlayerName(msg.getPlayerName());
         builder.setServerId(msg.getServerId());
         builder.setDestCityId(msg.getDestCityId());
      }

      builder.addAllInfos(msg.getInfosList());
      builder.setAllianceMainServerId(msg.getAllianceMainServerId());

      for(Integer playerId : onActivityPlayerSet) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         gamePlayer.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void CR2S_LuckDrawRecord_11464(CrossCountryWarMsg.CR2S_LuckDrawRecord_11464 msg, CrossSubscribeMsg crossSubscribeMsg) {
      CountryWarMsg.S2C_NoitceLuckDrawRecord_11366.Builder builder = CountryWarMsg.S2C_NoitceLuckDrawRecord_11366.newBuilder();
      builder.addAllRecords(msg.getRecordsList());

      for(Integer playerId : onActivityPlayerSet) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         gamePlayer.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void CR2S_UpdateCityReward_11416(CrossCountryWarMsg.CR2S_UpdateCityReward_11416 msg, CrossSubscribeMsg crossSubscribeMsg) {
      CountryWarMsg.S2C_UpdateCityReward_11316.Builder builder = CountryWarMsg.S2C_UpdateCityReward_11316.newBuilder();
      builder.addAllInfos(msg.getInfosList());

      for(Integer playerId : onActivityPlayerSet) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         gamePlayer.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void CR2S_UpLoadPlayerInfo_11406(CrossCountryWarMsg.CR2S_UpLoadPlayerInfo_11406 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.mapId = msg.getMapId();
      this.activityId = msg.getActivityId();
      this.state = msg.getState();
      this.noticePlayerOfCWState();
   }

   @MsgHandlerAnno
   public void CR2S_SeasonReward_11468(CrossCountryWarMsg.CR2S_SeasonReward_11468 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rank = msg.getCountryRank();
      List<Integer> noSendRewardServerList = new ArrayList();
      if (msg.getSendType() == 2) {
         noSendRewardServerList = this.getNoSendRewardServerList();
      }

      Map<Integer, CountryWarRankRewardModel> countryWarRankRewardModelMap = (Map)this.gameModelPool.getEntity("coustomCountryWarRankreward", CountryWarRankRewardModel.REWARD_TYPE_COUNTRY);
      CountryWarRankRewardModel countryWarRankRewardModel = this.getCuntryWarRankRewardModel(countryWarRankRewardModelMap, rank);
      if (countryWarRankRewardModelMap != null && countryWarRankRewardModel != null) {
         for(Integer playerId : msg.getPlayersList()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null && !gamePlayer.isRobot() && !noSendRewardServerList.contains(gamePlayer.getServerId())) {
               gamePlayer.pushTask(() -> {
                  MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                  String contentFormat = MessageFormat.format(countryWarRankRewardModel.getDesc(), rank);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, countryWarRankRewardModel.getTitle(), contentFormat, countryWarRankRewardModel.getRankreward(), 604800000L, 50, 5010);
               });
               gamePlayer.getOperationMgr().pushTask(() -> gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "国战", countryWarRankRewardModel.getTitle() + "-" + countryWarRankRewardModel.getId(), countryWarRankRewardModel.getTitle() + "-" + countryWarRankRewardModel.getId(), 0, 0, 0));
            }
         }
      }

      for(CrossCountryWarMsg.RewardInfo rewardInfo : msg.getRewardInfosList()) {
         this.sendPlayerRankReward(rewardInfo, noSendRewardServerList);
      }

   }

   @MsgHandlerAnno
   public void CR2S_SeasonCityReward_11470(CrossCountryWarMsg.CR2S_SeasonCityReward_11470 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(CrossCountryWarMsg.PlayerReward playerReward : msg.getPlayerRewardsList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerReward.getPlayerId());
         if (gamePlayer != null) {
            gamePlayer.pushTask(() -> {
               CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
               countryWarPart.grantCityReward(playerReward.getItemInfosList());
            });
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_NoticeGrantTaskReward_11420(CrossCountryWarMsg.CR2S_NoticeGrantTaskReward_11420 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(Integer playerId : this.queryAllCountryDao()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         gamePlayer.pushTask(() -> {
            CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
            countryWarPart.grantTaskScoreReward();
         });
      }

   }

   public List<Integer> queryAllCountryDao() {
      List<Integer> result = new ArrayList();
      String sql = "SELECT playerId FROM tb_country_war;";

      try {
         this.dbPool.query(sql, (resultSet) -> {
            try {
               while(resultSet.next()) {
                  result.add(resultSet.getInt("playerId"));
               }
            } catch (Exception e) {
               e.printStackTrace();
            }

         }, new Object[0]);
      } catch (Throwable t) {
         t.printStackTrace();
      }

      return result;
   }

   public CountryWarRankRewardModel getCuntryWarRankRewardModel(Map<Integer, CountryWarRankRewardModel> countryWarRankRewardModelMap, int rank) {
      for(Map.Entry<Integer, CountryWarRankRewardModel> entry : countryWarRankRewardModelMap.entrySet()) {
         if (((CountryWarRankRewardModel)entry.getValue()).getRank().size() == 1) {
            if (((CountryWarRankRewardModel)entry.getValue()).getRank().contains(rank)) {
               return (CountryWarRankRewardModel)entry.getValue();
            }
         } else if (rank >= (Integer)((CountryWarRankRewardModel)entry.getValue()).getRank().get(0) && rank <= (Integer)((CountryWarRankRewardModel)entry.getValue()).getRank().get(1)) {
            return (CountryWarRankRewardModel)entry.getValue();
         }
      }

      return null;
   }

   public void sendPlayerRankReward(CrossCountryWarMsg.RewardInfo rewardInfo, List<Integer> noSendRewardServerList) {
      Map<Integer, CountryWarRankRewardModel> countryWarRankRewardModelMap = (Map)this.gameModelPool.getEntity("coustomCountryWarRankreward", rewardInfo.getType());

      for(CrossCountryWarMsg.PlayerRewardInfo info : rewardInfo.getInfosList()) {
         CountryWarRankRewardModel countryWarRankRewardModel = this.getCuntryWarRankRewardModel(countryWarRankRewardModelMap, info.getRank());
         if (countryWarRankRewardModel != null) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(info.getPlayerId());
            if (!noSendRewardServerList.contains(gamePlayer.getServerId())) {
               gamePlayer.pushTask(() -> {
                  MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                  String contentFormat = MessageFormat.format(countryWarRankRewardModel.getDesc(), info.getRank());
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, countryWarRankRewardModel.getTitle(), contentFormat, countryWarRankRewardModel.getRankreward(), 604800000L, 50, 5010);
                  gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "国战", countryWarRankRewardModel.getTitle() + "-" + countryWarRankRewardModel.getId(), countryWarRankRewardModel.getTitle() + "-" + countryWarRankRewardModel.getId(), 0, 0, 0);
               });
            }
         }
      }

   }

   public void crossGm(String cmd, List<Integer> params) {
      CrossCountryWarMsg.S2CR_CountryWarGm_11471.Builder msg = CrossCountryWarMsg.S2CR_CountryWarGm_11471.newBuilder();
      msg.setCmd(cmd);
      msg.addAllParams(params);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      CountryWarMapModel countryWarMapModel = (CountryWarMapModel)this.gameModelPool.getEntity("countryWarMap", this.mapId);
      int shopLimitId = 0;
      if (countryWarMapModel != null) {
         shopLimitId = countryWarMapModel.getShopLimitId();
      }

      for(Integer playerId : this.queryAllCountryDao()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
            countryWarPart.slaveServerMergeBegin(shopLimitId, 1, true);
         }
      }

   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      for(Integer playerId : this.queryAllCountryDao()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
         countryWarPart.mainServerMergeFinish();
      }

   }

   @MsgHandlerAnno
   public void CR2S_ServerTerminationLeave_11478(CrossCountryWarMsg.CR2S_ServerTerminationLeave_11478 msg, CrossSubscribeMsg crossSubscribeMsg) {
      try {
         CountryWarMapModel countryWarMapModel = (CountryWarMapModel)this.gameModelPool.getEntity("countryWarMap", this.mapId);
         int shopLimitId = 0;
         if (countryWarMapModel != null) {
            shopLimitId = countryWarMapModel.getShopLimitId();
         }

         List<Integer> countryWardaoList = this.queryAllCountryDao();
         List<Integer> noSendList = this.getNoSendRewardServerList();

         for(Integer playerId : countryWardaoList) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null) {
               boolean isSendReward = true;
               if (noSendList.contains(gamePlayer.getServerId())) {
                  isSendReward = false;
               }

               CountryWarPart countryWarPart = (CountryWarPart)gamePlayer.getMgrPart(CountryWarPart.class);
               countryWarPart.slaveServerMergeBegin(shopLimitId, 2, isSendReward);
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   @MsgHandlerAnno
   public void CR2S_ServerTerminationJoin_11480(CrossCountryWarMsg.CR2S_ServerTerminationJoin_11480 msg, CrossSubscribeMsg crossSubscribeMsg) {
      try {
         this._mainServerMergeFinish((HashSet)null);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public List<Integer> getNoSendRewardServerList() {
      List<Integer> slaveList = new ArrayList();
      if (this.isMergeServer()) {
         String key = this.worldMgr.getServerInfoRedisKey(this.worldMgr.GAME_SERVER_ID);
         GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
         RMap<String, String> map = gameRedisTool.getClient().getMap(key);
         if (null != map && !map.isEmpty() && map.containsKey("waitMergeSlaveServerIds")) {
            String waitMergeSlaveServerIds = (String)map.get("waitMergeSlaveServerIds");
            if (StringUtil.isNotBlank(waitMergeSlaveServerIds)) {
               String[] slaves = waitMergeSlaveServerIds.split(";");

               for(String slave : slaves) {
                  slaveList.add(Integer.parseInt(slave));
               }
            }
         }

         this.logger.info("合服当天移动服务器，从服={}", slaveList);
      }

      return slaveList;
   }

   public boolean isMergeServer() {
      String key = this.getServerInfoRedisKey(this.worldMgr.GAME_SERVER_ID);
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      RMap<String, String> map = gameRedisTool.getClient().getMap(key);
      if (null != map && !map.isEmpty()) {
         if (!map.containsKey("mergeServerTime")) {
            return false;
         } else {
            String mergeServerTime = (String)map.get("mergeServerTime");
            if (StringUtil.isBlank(mergeServerTime)) {
               return false;
            } else {
               long mergeTime = Long.parseLong(mergeServerTime);
               return DateUtil.isSameDay(mergeTime);
            }
         }
      } else {
         return false;
      }
   }

   public String getServerInfoRedisKey(int serverId) {
      StringBuilder stringBuilder = new StringBuilder();
      String key = stringBuilder.append(this.worldMgr.PLATFORM_NAME).append(":server_").append(serverId).append(":info").toString().toLowerCase();
      return key;
   }
}
