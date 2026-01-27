package com.gzbz.catchDeer;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import com.google.protobuf.ByteString;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.FightPlayerData;
import com.gzbz.db.worldBean.PvpMergerData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.pvp.KingOfCentralPlainsMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CatchDeerMsg;
import com.gzbz.protobuf.ChatMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossCatchDeerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class CatchDeerMgr extends GameMgr {
   private Logger logger = LoggerFactory.getLogger(this.getClass());
   @Autowired
   GameModelPool gameModelPool;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   KingOfCentralPlainsMgr kingOfCentralPlainsMgr;
   private final WorldMgr worldMgr;
   private final CrossNettyClient crossNettyClient;
   public int state;
   public int startTime;
   public int downTime;
   public boolean isActivityDay;
   public List<Integer> enablePlayerIdList = new ArrayList();

   public CatchDeerMgr(WorldMgr worldMgr, CrossNettyClient crossNettyClient) {
      this.worldMgr = worldMgr;
      this.crossNettyClient = crossNettyClient;
   }

   protected void init() throws Exception {
   }

   public boolean isActivityPlayer(int playerId) {
      return this.enablePlayerIdList.contains(playerId);
   }

   public void sendArrayingToCross(GamePlayer gamePlayer) {
      if (this.isActivityPlayer(gamePlayer.getPlayerId())) {
         CrossCatchDeerMsg.S2CR_PlayerArraying_15487.Builder builder = CrossCatchDeerMsg.S2CR_PlayerArraying_15487.newBuilder();
         ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_KING_PLAINS);
         builder.setArraying(ByteString.copyFrom(arrayingMirror.toByteArray()));
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, gamePlayer.getPlayerId(), builder.build());
         this.logger.info("发送问鼎中原阵型到跨服");
      }

   }

   @MsgHandlerAnno
   public void CR2S_NoticeGameServerUpload_15472(CrossCatchDeerMsg.CR2S_NoticeGameServerUpload_15472 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("【群雄逐鹿】，接收跨服上传数据请求,move={},num={}", msg.getIsMoveServer(), msg.getNum());
      this.enablePlayerIdList.clear();
      CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.Builder builder = CrossCatchDeerMsg.S2CR_NoticeGameServerUpload_15471.newBuilder();
      if (!this.kingOfCentralPlainsMgr.rankMap.isEmpty() && this.kingOfCentralPlainsMgr.rankMap.size() >= 32 && !msg.getIsMoveServer()) {
         for(int i = 0; i < 32; ++i) {
            FightPlayerData fightPlayerData = (FightPlayerData)this.kingOfCentralPlainsMgr.rankMap.get(i + 1);
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(fightPlayerData.playerId);
            if (gamePlayer != null && !gamePlayer.isRobot()) {
               ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               gamePlayer.pushPartTaskEx(HeroArrayingPart.class, "copyHeroArraying", new Object[]{CommonMsg.HeroState.HERO_STATE_KING_PLAINS, CommonMsg.HeroState.HERO_STATE_ARRAYING});
               CrossCatchDeerMsg.CatchDeerPlayerArraying.Builder info = CrossCatchDeerMsg.CatchDeerPlayerArraying.newBuilder();
               info.setPlayerId(fightPlayerData.playerId);
               info.setPower(arrayingMirror.power);
               info.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
               builder.addPlayerArrayings(info);
               this.enablePlayerIdList.add(gamePlayer.getPlayerId());
            }
         }
      } else {
         List<RankData> rankDataList = new ArrayList();
         if (msg.getIsMoveServer()) {
            rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.PVP, msg.getNum());
         } else if (!DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
            rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, msg.getNum());
         }

         if (!rankDataList.isEmpty()) {
            for(RankData rankData : rankDataList) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
               if (gamePlayer != null && !gamePlayer.isRobot()) {
                  ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                  gamePlayer.pushPartTaskEx(HeroArrayingPart.class, "copyHeroArraying", new Object[]{CommonMsg.HeroState.HERO_STATE_KING_PLAINS, CommonMsg.HeroState.HERO_STATE_ARRAYING});
                  CrossCatchDeerMsg.CatchDeerPlayerArraying.Builder info = CrossCatchDeerMsg.CatchDeerPlayerArraying.newBuilder();
                  info.setPlayerId(gamePlayer.getPlayerId());
                  info.setPower(arrayingMirror.power);
                  info.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
                  builder.addPlayerArrayings(info);
                  this.enablePlayerIdList.add(gamePlayer.getPlayerId());
               }
            }
         }
      }

      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());

      for(Integer playerId : this.enablePlayerIdList) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            gamePlayer.pushTask(() -> gamePlayer.uploadCrossPlayer());
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_ActivityPlayer_15488(CrossCatchDeerMsg.CR2S_ActivityPlayer_15488 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("同步服务器玩家数据，size={}", msg.getPlayerIdCount());
      this.enablePlayerIdList.clear();

      for(Integer playerId : msg.getPlayerIdList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            this.enablePlayerIdList.add(playerId);
         }
      }

   }

   public void S2CR_MyFightUi_15401(int playerId) {
      CrossCatchDeerMsg.S2CR_MyFightUi_15401.Builder builder = CrossCatchDeerMsg.S2CR_MyFightUi_15401.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_MyRecordUi_15403(int playerId) {
      CrossCatchDeerMsg.S2CR_MyRecordUi_15403.Builder builder = CrossCatchDeerMsg.S2CR_MyRecordUi_15403.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_GuessUi_15411(int playerId) {
      CrossCatchDeerMsg.S2CR_GuessUi_15411.Builder builder = CrossCatchDeerMsg.S2CR_GuessUi_15411.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_Guess_15413(int playerId, int wagerSide, int wagerNum) {
      CrossCatchDeerMsg.S2CR_Guess_15413.Builder builder = CrossCatchDeerMsg.S2CR_Guess_15413.newBuilder();
      builder.setWagerNum(wagerNum);
      builder.setWagerSide(wagerSide);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_GuessRecord_15417(int playerId) {
      CrossCatchDeerMsg.S2CR_GuessRecord_15417.Builder builder = CrossCatchDeerMsg.S2CR_GuessRecord_15417.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_GuessRecordAll_15419(int playerId) {
      CrossCatchDeerMsg.S2CR_GuessRecordAll_15419.Builder builder = CrossCatchDeerMsg.S2CR_GuessRecordAll_15419.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_Rank32Ui_15431(int playerId) {
      CrossCatchDeerMsg.S2CR_Rank32Ui_15431.Builder builder = CrossCatchDeerMsg.S2CR_Rank32Ui_15431.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_RankUi_15441(int playerId, List<Integer> thumbsUps) {
      CrossCatchDeerMsg.S2CR_RankUi_15441.Builder builder = CrossCatchDeerMsg.S2CR_RankUi_15441.newBuilder();
      builder.addAllThumbsUps(thumbsUps);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_SeasonTopThree_15443(int playerId, int maxRank, List<Integer> thumbsUps) {
      CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.Builder builder = CrossCatchDeerMsg.S2CR_SeasonTopThree_15443.newBuilder();
      builder.setMaxRank(maxRank);
      builder.addAllThumbsUps(thumbsUps);
      if (DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
         builder.setIsOpenServer(true);
      }

      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_PlayerKCPSettle_15461(int playerId) {
      CrossCatchDeerMsg.S2CR_PlayerKCPSettle_15461.Builder builder = CrossCatchDeerMsg.S2CR_PlayerKCPSettle_15461.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_ThumbsUp_15465(int playerId, int beThumbsupPlayerId) {
      CrossCatchDeerMsg.S2CR_ThumbsUp_15465.Builder builder = CrossCatchDeerMsg.S2CR_ThumbsUp_15465.newBuilder();
      builder.setBeThumbsUpId(beThumbsupPlayerId);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_PlayerInfo_15467(GamePlayer gamePlayer, int destPlayerId, int destServerId) {
      if (this.worldMgr.getServersSet().contains(destServerId)) {
         GamePlayer otherPlayer = this.worldMgr.getPlayerById(destServerId);
         if (otherPlayer != null) {
            ChatMsg.S2C_PlayerDetailInfo_6010.Builder builder = ChatMsg.S2C_PlayerDetailInfo_6010.newBuilder();
            builder.setArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            builder.setPlayerInfo(otherPlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
            gamePlayer.sendMsg(builder.build());
         }
      } else {
         CrossCatchDeerMsg.S2CR_PlayerInfo_15467.Builder builder = CrossCatchDeerMsg.S2CR_PlayerInfo_15467.newBuilder();
         builder.setPlayerId(destPlayerId);
         builder.setServerId(destServerId);
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, gamePlayer.getPlayerId(), builder.build());
      }

   }

   public void S2CR_BattleRecordData_15469(int playerId, int recordId) {
      CrossCatchDeerMsg.S2CR_BattleRecordData_15469.Builder builder = CrossCatchDeerMsg.S2CR_BattleRecordData_15469.newBuilder();
      builder.setRecordId(recordId);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   public void S2CR_ActivityState_15451(int playerId) {
      CrossCatchDeerMsg.S2CR_ActivityState_15451.Builder builder = CrossCatchDeerMsg.S2CR_ActivityState_15451.newBuilder();
      if (DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
         builder.setIsOpenServer(true);
      }

      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_ActivityState_15474(CrossCatchDeerMsg.CR2S_ActivityState_15474 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int oldState = this.state;
      this.state = msg.getState();
      this.startTime = msg.getStartTime();
      this.downTime = msg.getDownTime();
      this.isActivityDay = msg.getIsActivityDay();
      this.logger.info("收到跨服返回活动状态，oldstate={},state={}，start={}，end={}，是否当天={}", new Object[]{oldState, this.state, this.startTime, this.downTime, this.isActivityDay});
      LocalDate localDate = LocalDate.now();
      if (localDate.getDayOfWeek() != DayOfWeek.SATURDAY && localDate.getDayOfWeek() != DayOfWeek.SUNDAY && localDate.getDayOfWeek() != DayOfWeek.MONDAY) {
         if (this.isServerEnable()) {
            CatchDeerMsg.S2C_ActivityState_15352.Builder builder = CatchDeerMsg.S2C_ActivityState_15352.newBuilder();
            builder.setState(this.state);
            builder.setStartTime(this.startTime);
            builder.setDownTime(this.downTime);
            builder.setIsActivityDay(this.isActivityDay);
            if (DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
               builder.setIsOpenDay(true);
            }

            CatchDeerMsg.S2C_ActivityState_15352 sendResult = builder.build();

            for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
               if (gamePlayer != null && this.isEnablePlayer(gamePlayer)) {
                  gamePlayer.sendMsg(sendResult);
               }
            }

         }
      }
   }

   public void S2CR_RoundAndState_15475(int playerId) {
      CrossCatchDeerMsg.S2CR_RoundAndState_15475.Builder builder = CrossCatchDeerMsg.S2CR_RoundAndState_15475.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_RoundAndState_15476(CrossCatchDeerMsg.CR2S_RoundAndState_15476 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.isServerEnable()) {
         CatchDeerMsg.S2C_RoundAndState_15350.Builder builder = CatchDeerMsg.S2C_RoundAndState_15350.newBuilder();
         builder.setRound(msg.getRound());
         builder.setState(msg.getState());
         builder.setStartTime(msg.getStartTime());
         builder.setDownTime(msg.getDownTime());
         builder.setNextTime(msg.getNextTime());

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer != null && this.isEnablePlayer(gamePlayer)) {
               builder.setIsEnable(this.enablePlayerIdList.contains(gamePlayer.getPlayerId()));
               gamePlayer.sendMsg(builder.build());
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_GuessOdds_15478(CrossCatchDeerMsg.CR2S_GuessOdds_15478 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.isServerEnable()) {
         CatchDeerMsg.S2C_GuessPush_15316.Builder builder = CatchDeerMsg.S2C_GuessPush_15316.newBuilder();
         builder.setLeftOdds(msg.getLeftOdds());
         builder.setRightOdds(msg.getRightOdds());
         CatchDeerMsg.S2C_GuessPush_15316 result = builder.build();

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer != null && this.isEnablePlayer(gamePlayer)) {
               gamePlayer.sendMsg(result);
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_GuessFightRecord_15480(CrossCatchDeerMsg.CR2S_GuessFightRecord_15480 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.isServerEnable()) {
         CatchDeerMsg.S2C_FightRecord_15354.Builder builder = CatchDeerMsg.S2C_FightRecord_15354.newBuilder();
         builder.setGuessRecordId(msg.getGuessRecordId());
         CatchDeerMsg.S2C_FightRecord_15354 result = builder.build();

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer != null && this.isEnablePlayer(gamePlayer)) {
               gamePlayer.sendMsg(result);
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_PlayerSettlePlains_15482(CrossCatchDeerMsg.CR2S_PlayerSettlePlains_15482 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> map = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      CentreAwardModel centreAwardModel = (CentreAwardModel)((TreeMap)map.get(CentreAwardModel.TYPE_KINGCP_GUESS_WIN)).firstEntry().getValue();

      for(CommonMsg.MapDataII data : msg.getPlainsList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.getKey());
         if (gamePlayer != null) {
            List<ResourceModel> addList = new ArrayList();
            addList.add(new ResourceModel(1, PlayerDefine.PLAYER_RENOW, data.getValue()));
            gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), addList, 604800000L, 77, 7701});
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_PlayerSettleRank_15484(CrossCatchDeerMsg.CR2S_PlayerSettleRank_15484 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, Map<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, Map<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      Map<Integer, CentreAwardModel> activityReward = (Map)rewardMap.get(CentreAwardModel.TYPE_CATCH_DEER);
      if (activityReward != null && !activityReward.isEmpty()) {
         for(Map.Entry<Integer, CentreAwardModel> entry : activityReward.entrySet()) {
            int minRank = ((CentreAwardModel)entry.getValue()).getMinRank();
            int maxRank = ((CentreAwardModel)entry.getValue()).getMaxRank();
            Map<Integer, String> needPlayerRank = new HashMap();

            for(CommonMsg.MapDataII dataII : msg.getRankList()) {
               int rank = dataII.getValue();
               if (rank >= minRank && rank <= maxRank) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(dataII.getKey());
                  if (gamePlayer != null && !gamePlayer.isRobot()) {
                     gamePlayer.pushPartTaskEx(CatchDeerPart.class, "runSendAward_highestRank", new Object[]{dataII.getValue()});
                     if (gamePlayer.isLogin()) {
                        String format = MessageFormat.format(((CentreAwardModel)entry.getValue()).getDesc(), rank);
                        gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), format, ((CentreAwardModel)entry.getValue()).getItems(), 604800000L, 77, 7702});
                     } else {
                        needPlayerRank.put(dataII.getKey(), String.valueOf(rank));
                     }

                     gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "群雄逐鹿", ((CentreAwardModel)entry.getValue()).getId() + "", ((CentreAwardModel)entry.getValue()).getId() + "", 0, 0, 0);
                  }
               }
            }

            if (needPlayerRank.size() > 0) {
               MailWorldMgr mailWorldMgr = (MailWorldMgr)ApplicationContextProvider.getContext().getBean(MailWorldMgr.class);
               mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), ((CentreAwardModel)entry.getValue()).getDesc(), ((CentreAwardModel)entry.getValue()).getItems(), needPlayerRank, 604800000L, 77, 7702, 0);
            }
         }

         WorldDao<PvpMergerData> worldDao = this.worldMgr.<PvpMergerData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_MERGE);
         if (!DateUtil.isSameDay((long)((PvpMergerData)worldDao.jsonData).time * 1000L)) {
            ((PvpMergerData)worldDao.jsonData).rankMap.clear();
         }

         for(CommonMsg.MapDataII mapDataII : msg.getRankList()) {
            ((PvpMergerData)worldDao.jsonData).rankMap.put(mapDataII.getKey(), mapDataII.getValue());
         }

         ((PvpMergerData)worldDao.jsonData).time = DateUtil.getIntTime(System.currentTimeMillis());
         worldDao.updateOp();
      }
   }

   @MsgHandlerAnno
   public void CR2S_PlayerSettlePrestige_15486(CrossCatchDeerMsg.CR2S_PlayerSettlePrestige_15486 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int winAllTitle = ApplicationContextProvider.getConfigInt("winAllTitle", 19533);

      for(CommonMsg.MapDataII mapDataII : msg.getPrestigeList()) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", 563);
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(mapDataII.getKey());
         List<ResourceModel> addList = new ArrayList();
         addList.add(new ResourceModel(2, mapDataII.getValue(), 1));
         if (gamePlayer != null) {
            gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), addList, 604800000L, 38, 3802});
            if (winAllTitle != 0 && winAllTitle == mapDataII.getValue()) {
               gamePlayer.pushTaskEx("triggerTask", new Object[]{324, 0, 1, 0});
            }
         }
      }

   }

   @MsgHandlerAnno
   public void S2C_PopThreeRank_15364(CatchDeerMsg.S2C_PopThreeRank_15364 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.isServerEnable()) {
         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer != null && this.isEnablePlayer(gamePlayer)) {
               gamePlayer.sendMsg(msg);
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_GuessSuccess_15490(CrossCatchDeerMsg.CR2S_GuessSuccess_15490 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("【群雄逐鹿】收到玩家竞猜成功信息，玩家ID={}", msg.getPlayerIdsList());

      for(Integer playerId : msg.getPlayerIdsList()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            gamePlayer.pushTaskEx("triggerTask", new Object[]{371, 0, 1, 1});
         }
      }

   }

   public boolean isServerEnable() {
      return !DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime());
   }

   public boolean isEnablePlayer(GamePlayer gamePlayer) {
      return gamePlayer.isSystemOpen(3180);
   }

   public void crossGm(String order) {
      CrossCatchDeerMsg.S2CR_Gm_15499.Builder msg = CrossCatchDeerMsg.S2CR_Gm_15499.newBuilder();
      msg.setOrder(order);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      try {
         LocalDateTime nowDateTime = LocalDateTime.now();
         if ((nowDateTime.getDayOfWeek() != DayOfWeek.THURSDAY || nowDateTime.getHour() > 20) && nowDateTime.getDayOfWeek() != DayOfWeek.TUESDAY && nowDateTime.getDayOfWeek() != DayOfWeek.WEDNESDAY) {
            return;
         }

         WorldDao<PvpMergerData> worldDao = this.worldMgr.<PvpMergerData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_MERGE);
         if (((PvpMergerData)worldDao.jsonData).rankMap.isEmpty()) {
            return;
         }

         if (DateUtil.getIntTime(System.currentTimeMillis()) > ((PvpMergerData)worldDao.jsonData).time + 604800) {
            return;
         }

         CentreAwardModel descModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_CATCH_DEER_SERVER_MERGE_AWARD);
         if (descModel == null) {
            return;
         }

         Map<Integer, Map<Integer, CentreAwardModel>> rewardMap = ApplicationContextProvider.<Integer, Map<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         Map<Integer, CentreAwardModel> activityReward = (Map)rewardMap.get(CentreAwardModel.TYPE_CATCH_DEER);
         if (activityReward == null || activityReward.isEmpty()) {
            return;
         }

         for(Map.Entry<Integer, CentreAwardModel> entry : activityReward.entrySet()) {
            int minRank = ((CentreAwardModel)entry.getValue()).getMinRank();
            int maxRank = ((CentreAwardModel)entry.getValue()).getMaxRank();

            for(Map.Entry<Integer, Integer> rankEntry : ((PvpMergerData)worldDao.jsonData).rankMap.entrySet()) {
               int rank = (Integer)rankEntry.getValue();
               if (rank >= minRank && rank <= maxRank) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)rankEntry.getKey());
                  if (gamePlayer != null && !gamePlayer.isRobot()) {
                     MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                     mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), descModel.getDesc(), ((CentreAwardModel)entry.getValue()).getItems(), 604800000L, 77, 7703);
                     gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "群雄逐鹿合服补偿", ((CentreAwardModel)entry.getValue()).getId() + "", ((CentreAwardModel)entry.getValue()).getId() + "", 0, 0, 0);
                  }
               }
            }
         }

         ((PvpMergerData)worldDao.jsonData).rankMap.clear();
         ((PvpMergerData)worldDao.jsonData).time = 0;
         worldDao.updateOp();
      } catch (Exception e) {
         this.logger.error(e.getMessage());
      }

   }
}
