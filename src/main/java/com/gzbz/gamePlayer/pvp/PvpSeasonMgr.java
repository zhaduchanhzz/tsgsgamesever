package com.gzbz.gamePlayer.pvp;

import allMgr.ExecutorsFunc;
import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PvpDao;
import com.gzbz.db.PvpRecordDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.worldBean.PvpPlayerData;
import com.gzbz.db.worldBean.PvpSeasonData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.RobotModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PvpMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
@DependsOn({"worldMgr"})
public class PvpSeasonMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(PvpSeasonMgr.class);
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   MailWorldMgr mailWorldMgr;
   @Autowired
   private GameModelPool gameModelPool;

   public ScheduledFuture<?> schedule(long initialDelay, long period, ExecutorsFunc func) {
      return super.schedule(initialDelay, period, func);
   }

   protected void init() throws Exception {
   }

   public void initData() {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      long currentTime = System.currentTimeMillis();
      if (((PvpSeasonData)worldDao.jsonData).seasonId <= 0) {
         this.logger.info("一个全新的赛季,开服时间={}", DateUtil.transferLongToDate(this.worldMgr.getOpenServerTime()));
         this.addNewSeason((PvpSeasonData)worldDao.jsonData, currentTime);
         worldDao.updateOp();
      } else if (currentTime >= ((PvpSeasonData)worldDao.jsonData).endTime) {
         this.logger.info("前一个赛季已经过期,赛季结束时间={}", DateUtil.transferLongToDate(((PvpSeasonData)worldDao.jsonData).endTime));
         this.addNewSeason((PvpSeasonData)worldDao.jsonData, currentTime);
         worldDao.updateOp();
      }

   }

   public void updatePlayerScore() {
      this.updateAllPlayerScore(false);
   }

   public void addNewSeason(PvpSeasonData pvpSeasonData, long currentTime) {
      long dayStartTime = DateUtil.getSomeDayBeginTime(this.worldMgr.getOpenServerTime());
      long week = (currentTime - dayStartTime) / 604800000L;
      long startTime = dayStartTime + week * 604800000L;
      pvpSeasonData.seasonId = (int)week;
      pvpSeasonData.startTime = startTime;
      long nextWeekDayTime = startTime + 604800000L - 86400000L;
      pvpSeasonData.endTime = DateUtil.getSomeDayEndTime(nextWeekDayTime);
      pvpSeasonData.state = 0;
   }

   public int getPvpSeasonId() {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      return ((PvpSeasonData)worldDao.jsonData).seasonId;
   }

   public long getStartTime() {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      return ((PvpSeasonData)worldDao.jsonData).startTime;
   }

   @TaskMethod
   public void insetNewPlayer(int playerId, int score) {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      if (((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(playerId)) {
         ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score = score;
         ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).activeTime = System.currentTimeMillis();
      } else {
         PvpPlayerData data = new PvpPlayerData();
         data.playerId = playerId;
         data.score = score;
         data.activeTime = System.currentTimeMillis();
         ((PvpSeasonData)worldDao.jsonData).scoreMap.put(playerId, data);
      }

      worldDao.updateOp();
   }

   public void dayAward() {
      int hour = DateUtil.hour(System.currentTimeMillis());
      if (hour == 21) {
         WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
         this.logger.info("PVP日常奖励方法调用，hour={}", hour);
         if (DateUtil.isSameDay(((PvpSeasonData)worldDao.jsonData).endTime)) {
            this.seasonSettle();
         } else {
            this.daySettle();
         }
      }

   }

   public void daySettle() {
      this.logger.info("日常奖励发放");
      this.rankMgr.pushTaskEx("grantRankAwardEx", new Object[]{CentreAwardModel.AWARD_TYPE_11111, RankDefine.RankModule.PVP, 10, 1002});
   }

   public void seasonSettle() {
      this.logger.info("赛季奖励发放");
      this.rankMgr.pushTaskEx("grantRankAwardEx", new Object[]{CentreAwardModel.AWARD_TYPE_11112, RankDefine.RankModule.PVP, 10, 1003});
   }

   public void seasonReset() {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      this.logger.info("赛季重置");
      if (DateUtil.isSameDay(((PvpSeasonData)worldDao.jsonData).endTime)) {
         this.logger.info("赛季最后一天，重置开始");
         ((PvpSeasonData)worldDao.jsonData).state = 0;
         long nextStart = ((PvpSeasonData)worldDao.jsonData).startTime + 604800000L;
         ((PvpSeasonData)worldDao.jsonData).startTime = nextStart;
         long nextWeekDayTime = nextStart + 604800000L - 86400000L;
         ((PvpSeasonData)worldDao.jsonData).endTime = DateUtil.getSomeDayEndTime(nextWeekDayTime);
         ++((PvpSeasonData)worldDao.jsonData).seasonId;
         worldDao.updateOp();
         this.logger.info("赛季重置，玩家的积分处理，更改所有玩家积分，并且更改redis所有玩家积分");
         this.updateAllPlayerScore(true);
      }

   }

   @TaskMethod
   public void OpenPvpUi(GamePlayer player, PvpDao pvpDao, int useFreeNum, boolean isSkipFight) {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      PvpMsg.S2C_OpenPvpUiResult_6802.Builder result_builder = PvpMsg.S2C_OpenPvpUiResult_6802.newBuilder();
      result_builder.setRank(this.rankMgr.getRank(RankDefine.RankModule.PVP, player.getPlayerId()));
      result_builder.setPoint(this.getPvpScore(player.getPlayerId()));
      result_builder.setFightNum(pvpDao.weekFightNum);
      result_builder.setDrawFreeNum(useFreeNum);
      result_builder.setStartTime(((PvpSeasonData)worldDao.jsonData).startTime);
      result_builder.setEndTime(((PvpSeasonData)worldDao.jsonData).endTime);
      long downTime = ((PvpSeasonData)worldDao.jsonData).endTime - System.currentTimeMillis();
      result_builder.setDownTime(downTime);
      result_builder.setIsSkip(isSkipFight);

      for(Integer fightPlayerId : pvpDao.waitPlayerIds) {
         result_builder.addInfos(this.toPvpFihgtPlayerInfo(fightPlayerId));
      }

      result_builder.addAllTakedIds(pvpDao.takeAwardIds);
      result_builder.setThumbsUpNum(pvpDao.thumbsUps.size());
      player.sendMsg(result_builder.build());
      if (((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(player.getPlayerId())) {
         ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(player.getPlayerId())).activeTime = System.currentTimeMillis();
         worldDao.updateOp();
      }

   }

   public List<Integer> flushPvpFightList(GamePlayer player, boolean haveFirstFlush) {
      int myRank = this.rankMgr.getRank(RankDefine.RankModule.PVP, player.getPlayerId());
      int rankSize = this.rankMgr.getRankSize(RankDefine.RankModule.PVP);
      List<Integer> selectRankList = new ArrayList();
      int deltNum = this.configManager.getInt("pvpFlushNum");
      if (rankSize <= deltNum * 2) {
         for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.PVP, rankSize)) {
            selectRankList.add(rankData.rank);
         }
      } else {
         int startRank;
         int endRank;
         if (myRank == 0) {
            endRank = rankSize;
            startRank = rankSize - 2 * deltNum;
         } else if (myRank <= deltNum) {
            startRank = 1;
            endRank = startRank + 2 * deltNum;
         } else if (myRank + deltNum >= rankSize) {
            endRank = rankSize;
            startRank = rankSize - 2 * deltNum;
         } else {
            startRank = myRank - deltNum;
            endRank = myRank + deltNum;
         }

         for(int i = startRank; i < endRank; ++i) {
            selectRankList.add(i);
         }
      }

      Collections.shuffle(selectRankList);
      List<Integer> playerIdList = new ArrayList();
      int num = 0;

      for(Integer rank : selectRankList) {
         RankData data = (RankData)this.rankMgr.getRanksByRank(RankDefine.RankModule.PVP, rank, rank).get(0);
         if (data.value != player.getPlayerId()) {
            playerIdList.add(data.value);
            ++num;
         }

         if (num >= 3) {
            break;
         }
      }

      if (!haveFirstFlush && !playerIdList.contains(this.worldMgr.getPvpPlayerId())) {
         playerIdList.set(0, this.worldMgr.getPvpPlayerId());
      }

      return playerIdList;
   }

   @TaskMethod
   public void C2S_TakeAwardsResult_6806(GamePlayer player, List<Integer> waitPlayerIds, int weekFightNum, int useFreeNum, boolean isSkipFight) {
      PvpMsg.S2C_TakeAwardsResult_6806.Builder result_builder = PvpMsg.S2C_TakeAwardsResult_6806.newBuilder();
      result_builder.setRank(this.rankMgr.getRank(RankDefine.RankModule.PVP, player.getPlayerId()));
      result_builder.setPoint(this.getPvpScore(player.getPlayerId()));
      result_builder.setFightNum(weekFightNum);
      result_builder.setDrawFreeNum(useFreeNum);
      result_builder.setIsSkip(isSkipFight);

      for(Integer fightPlayerId : waitPlayerIds) {
         result_builder.addInfos(this.toPvpFihgtPlayerInfo(fightPlayerId));
      }

      player.sendMsg(result_builder.build());
   }

   @TaskMethod
   public void pvpRanksToClient(GamePlayer player, PvpMsg.PvpRankType type, List<Integer> thumbsUps) {
      int rankNum = 100;
      if (type == PvpMsg.PvpRankType.PvpRankType_Rank3) {
         rankNum = 3;
      }

      List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.PVP, rankNum);
      PvpMsg.S2C_PvpRankResult_6808.Builder result_builder = PvpMsg.S2C_PvpRankResult_6808.newBuilder();
      result_builder.setType(type);
      int myRank = this.rankMgr.getRank(RankDefine.RankModule.PVP, player.getPlayerId());
      long myScore = (long)this.getPvpScore(player.getPlayerId());
      result_builder.setMyInfo(this.toPvpRankInfo(myRank, (int)myScore, player.getPlayerId(), player.getPlayerId(), thumbsUps));

      for(RankData rankData : rankDataList) {
         result_builder.addPlayers(this.toPvpRankInfo(rankData.rank, (int)rankData.score, rankData.value, player.getPlayerId(), thumbsUps));
      }

      player.sendMsg(result_builder.build());
   }

   private PvpMsg.PvpRankInfo.Builder toPvpRankInfo(int rank, int score, int playerId, int requestPlayerId, List<Integer> thumbsUps) {
      PvpMsg.PvpRankInfo.Builder info_builder = PvpMsg.PvpRankInfo.newBuilder();
      GamePlayer player = this.worldMgr.getPlayerById(playerId);
      if (player == null) {
         return info_builder;
      } else {
         PlayerPublicDao playerDao = player.getPublicDao();
         info_builder.setRank(rank);
         info_builder.setPlayerId(playerId);
         info_builder.setName(playerDao.playerName);
         info_builder.setLv(playerDao.lv);
         info_builder.setCombatPower(player.getPlayerCombatPower());
         info_builder.setPvpPoints((long)score);
         info_builder.setHeadId(playerDao.head);
         info_builder.setServerId(playerDao.serverId);
         PvpDao pvpDao = (PvpDao)player.getData("tb_pvp", playerId);
         info_builder.setThumbsUpNum(pvpDao.weekBeThumbsupNum);
         boolean isThumbsUp = false;
         if (playerId == requestPlayerId || thumbsUps.contains(playerId)) {
            isThumbsUp = true;
         }

         info_builder.setIsThumbsUp(isThumbsUp);
         info_builder.setPrestige(playerDao.prestige);
         info_builder.setMonarchid(playerDao.monarchId);
         info_builder.setHeadFrame(playerDao.headFrame);
         return info_builder;
      }
   }

   public PvpMsg.PvpPlayerInfo.Builder toPvpFihgtPlayerInfo(int fightPlayerId) {
      PvpMsg.PvpPlayerInfo.Builder info_builder = PvpMsg.PvpPlayerInfo.newBuilder();
      GamePlayer fightPlayer = this.worldMgr.getPlayerById(fightPlayerId);
      if (fightPlayer == null) {
         return null;
      } else {
         PlayerPublicDao playerDao = fightPlayer.getPublicDao();
         info_builder.setPlayerId(fightPlayerId);
         info_builder.setName(playerDao.playerName);
         info_builder.setLv(playerDao.lv);
         info_builder.setCombatPower(fightPlayer.getPlayerCombatPower());
         info_builder.setHeadId(playerDao.head);
         info_builder.setScore(this.getPvpScore(playerDao.playerId));
         info_builder.setPrestige(playerDao.prestige);
         info_builder.setServerId(playerDao.serverId);
         return info_builder;
      }
   }

   public void updateAllPlayerScore(boolean isSeasonChange) {
      long currentTime = System.currentTimeMillis();
      float pvpRestPoint = 1.0F;
      if (isSeasonChange) {
         pvpRestPoint = this.configManager.getFloatDefault("pvpRestPoint", 0.7F);
      }

      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      this.rankMgr.removeRanks(RankDefine.RankModule.PVP);
      int newRankSize = 0;
      if (((PvpSeasonData)worldDao.jsonData).scoreMap.isEmpty()) {
         Map<Integer, RobotModel> robotModelMap = this.gameModelPool.getMap("robot");

         for(Map.Entry<Integer, RobotModel> entry : robotModelMap.entrySet()) {
            if (((RobotModel)entry.getValue()).getType() == 2) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
               if (gamePlayer != null) {
                  PvpPlayerData pvpPlayerData = new PvpPlayerData();
                  pvpPlayerData.playerId = (Integer)entry.getKey();
                  pvpPlayerData.score = ((RobotModel)entry.getValue()).getScore();
                  pvpPlayerData.activeTime = currentTime;
                  ((PvpSeasonData)worldDao.jsonData).scoreMap.put(entry.getKey(), pvpPlayerData);
                  this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, pvpPlayerData.score, entry.getKey()});
                  ++newRankSize;
               }
            }
         }

         worldDao.updateOp();
      } else {
         List<Integer> needDelList = new ArrayList();

         for(Map.Entry<Integer, PvpPlayerData> entry : ((PvpSeasonData)worldDao.jsonData).scoreMap.entrySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
            if (gamePlayer == null) {
               needDelList.add(entry.getKey());
            } else if (gamePlayer.isRobot()) {
               if (((PvpPlayerData)entry.getValue()).score < 1000) {
                  ((PvpPlayerData)entry.getValue()).score = 1000;
               }

               this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, ((PvpPlayerData)entry.getValue()).score, entry.getKey()});
               ++newRankSize;
            } else {
               PvpPlayerData var10000 = (PvpPlayerData)entry.getValue();
               var10000.score = (int)((float)var10000.score * pvpRestPoint);
               if (((PvpPlayerData)entry.getValue()).activeTime + 604800000L > currentTime) {
                  if (((PvpPlayerData)entry.getValue()).score < 1000) {
                     ((PvpPlayerData)entry.getValue()).score = 1000;
                  }

                  this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, ((PvpPlayerData)entry.getValue()).score, entry.getKey()});
                  ++newRankSize;
               } else if (((PvpPlayerData)entry.getValue()).score < 1000) {
                  needDelList.add(entry.getKey());
               }
            }
         }

         if (!needDelList.isEmpty()) {
            this.logger.info("删除不活跃玩家PVP数据={}", needDelList);

            for(Integer playerId : needDelList) {
               ((PvpSeasonData)worldDao.jsonData).scoreMap.remove(playerId);
            }
         }

         this.logger.info("pvp排行榜数量={}", newRankSize);
         if (newRankSize < 128) {
            this.logger.info("worldDao里面的PVP数据小于128，补充机器人");
            Map<Integer, RobotModel> robotModelMap = this.gameModelPool.getMap("robot");

            for(Map.Entry<Integer, RobotModel> entry : robotModelMap.entrySet()) {
               if (((RobotModel)entry.getValue()).getType() == 2) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
                  if (gamePlayer != null) {
                     PvpPlayerData pvpPlayerData = new PvpPlayerData();
                     pvpPlayerData.playerId = (Integer)entry.getKey();
                     pvpPlayerData.score = ((RobotModel)entry.getValue()).getScore();
                     pvpPlayerData.activeTime = currentTime;
                     ((PvpSeasonData)worldDao.jsonData).scoreMap.put(entry.getKey(), pvpPlayerData);
                     this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, pvpPlayerData.score, entry.getKey()});
                  }
               }
            }
         }

         worldDao.updateOp();
      }

   }

   public void flushRedisData() {
      long currentTime = System.currentTimeMillis();
      this.rankMgr.removeRanks(RankDefine.RankModule.PVP);
      List<Integer> needDelList = new ArrayList();
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);

      for(Map.Entry<Integer, PvpPlayerData> entry : ((PvpSeasonData)worldDao.jsonData).scoreMap.entrySet()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
         if (gamePlayer == null) {
            needDelList.add(entry.getKey());
         } else if (gamePlayer.isRobot()) {
            if (((PvpPlayerData)entry.getValue()).score < 1000) {
               ((PvpPlayerData)entry.getValue()).score = 1000;
            }

            this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, ((PvpPlayerData)entry.getValue()).score, entry.getKey()});
         } else {
            if (((PvpPlayerData)entry.getValue()).score < 1000) {
               ((PvpPlayerData)entry.getValue()).score = 1000;
            }

            if (((PvpPlayerData)entry.getValue()).activeTime + 604800000L > currentTime) {
               this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, ((PvpPlayerData)entry.getValue()).score, entry.getKey()});
            } else if (((PvpPlayerData)entry.getValue()).score < 1000) {
               needDelList.add(entry.getKey());
            }
         }
      }

      if (!needDelList.isEmpty()) {
         this.logger.info("删除不活跃玩家PVP数据={}", needDelList);

         for(Integer playerId : needDelList) {
            ((PvpSeasonData)worldDao.jsonData).scoreMap.remove(playerId);
         }
      }

      worldDao.updateOp();
   }

   @TaskMethod
   public void showPlayerInfo(GamePlayer gamePlayer, int showPlayerId) {
      GamePlayer showGamePlayer = this.worldMgr.getPlayerById(showPlayerId);
      if (showGamePlayer != null) {
         PlayerPublicDao playerDao = showGamePlayer.getPublicDao();
         PvpMsg.S2C_ShowPlayerInfoResult_6814.Builder builder = PvpMsg.S2C_ShowPlayerInfoResult_6814.newBuilder();
         builder.setId(showPlayerId);
         builder.setName(playerDao.playerName);
         builder.setLv(playerDao.lv);
         builder.setHead(playerDao.head);
         builder.setHeadFrame(playerDao.headFrame);
         builder.setPower(showGamePlayer.getPlayerCombatPower());
         builder.setScore((int)this.rankMgr.getScore(RankDefine.RankModule.PVP, showPlayerId));
         ArrayingMirror heroArrayingDao = showGamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);

         for(Map.Entry<Byte, ArrayingEntity> entry : heroArrayingDao.arrayingElementsMap.entrySet()) {
            if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
               builder.addHero((CommonMsg.HeroInfo)((ArrayingEntity)entry.getValue()).toBuilder());
            }
         }

         gamePlayer.sendMsg(builder.build());
      }
   }

   @TaskMethod
   public void pvpFightRecordToClient(GamePlayer player, Map<Integer, PvpRecordDao> pvpRecordDaoMa, PlayerDao playerDao) {
      PvpMsg.S2C_PvpFightRecordResult_6810.Builder result_builder = PvpMsg.S2C_PvpFightRecordResult_6810.newBuilder();
      Map<Integer, PvpRecordDao> pvpRecordDaoMap = player.<Integer, PvpRecordDao>getMap("tb_pvp_record", player.getPlayerId());
      TreeMap<Integer, PvpRecordDao> tempMap = new TreeMap(pvpRecordDaoMap);

      for(Map.Entry<Integer, PvpRecordDao> entry : tempMap.descendingMap().entrySet()) {
         GamePlayer rightGamePlayer = this.worldMgr.getPlayerById(((PvpRecordDao)entry.getValue()).fightPlayerId);
         PlayerPublicDao rightPlayerDao = rightGamePlayer.getPublicDao();
         PvpMsg.PvpRecordInfo.Builder infoBuilder = PvpMsg.PvpRecordInfo.newBuilder();
         infoBuilder.setAttType(((PvpRecordDao)entry.getValue()).type);
         infoBuilder.setFightPlayerId(((PvpRecordDao)entry.getValue()).fightPlayerId);
         infoBuilder.setFightPlayerName(rightPlayerDao.playerName);
         infoBuilder.setFightPlayerLv(rightPlayerDao.lv);
         infoBuilder.setFightPlayerHead(rightPlayerDao.head);
         infoBuilder.setPlayerId(((PvpRecordDao)entry.getValue()).playerId);
         infoBuilder.setPlayerName(playerDao.playerName);
         infoBuilder.setPlayerLv(playerDao.lv);
         infoBuilder.setPlayerHead(playerDao.head);
         infoBuilder.setReocrdId(((PvpRecordDao)entry.getValue()).recordId);
         infoBuilder.setScoreChange(((PvpRecordDao)entry.getValue()).rankChange);
         infoBuilder.setTime((int)(((PvpRecordDao)entry.getValue()).fightTime / 1000L));
         infoBuilder.setWin(((PvpRecordDao)entry.getValue()).win);
         result_builder.addInfos(infoBuilder);
      }

      player.sendMsg(result_builder.build());
   }

   public int getPvpScore(int playerId) {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      return ((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(playerId) ? ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score : 0;
   }

   @TaskMethod
   public void addPvpScore(int playerId, int score) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null) {
         WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
         if (!((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(playerId)) {
            PvpPlayerData data = new PvpPlayerData();
            data.playerId = playerId;
            data.score = score;
            data.activeTime = System.currentTimeMillis();
            ((PvpSeasonData)worldDao.jsonData).scoreMap.put(playerId, data);
         } else {
            PvpPlayerData var10000 = (PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId);
            var10000.score += score;
         }

         if (((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score < 1000) {
            ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score = 1000;
         }

         worldDao.updateOp();
         int newSocre = ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score;
         RankPart rankPart = (RankPart)gamePlayer.getMgrPart(RankPart.class);
         rankPart.updateRank(RankDefine.RankModule.PVP, (long)newSocre, false);
         gamePlayer.triggerTask(208, 0, (long)newSocre, 0);
         gamePlayer.pushTaskEx("notifyPlayerData", new Object[]{PlayerDefine.PLAYER_PVP_POINTS, newSocre});
      }
   }

   @TaskMethod
   public void playerLoginCheckEx(int playerId) {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
      if (!((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(playerId)) {
         this.addPvpScore(playerId, 1000);
      } else {
         int playerScore = ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score;
         if (playerScore < 1000) {
            this.addPvpScore(playerId, 1000 - playerScore);
         }
      }

   }

   public void gmTestPvp(String orderStr, GamePlayer player) {
      String[] orders = orderStr.split(",");
      if (orders.length < 1) {
         this.logger.info("GM命令参数错误，oder={}", orderStr);
      } else {
         String cmd = orders[0];
         cmd = cmd.toLowerCase();
         int playerId = player.getPlayerId();
         WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);
         switch (cmd) {
            case "cleartime":
               if (orders.length > 1) {
                  playerId = Integer.valueOf(orders[1]);
               }

               if (((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(playerId)) {
                  ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).activeTime = 0L;
                  worldDao.updateOp();
               } else {
                  this.logger.info("参数有错误，没有该玩家");
               }
               break;
            case "setscore":
               if (orders.length > 2) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                  if (gamePlayer == null) {
                     this.logger.info("参数有错误，没有该玩家");
                     return;
                  }

                  playerId = Integer.valueOf(orders[2]);
               }

               int tempScore = Integer.valueOf(orders[1]);
               if (((PvpSeasonData)worldDao.jsonData).scoreMap.containsKey(tempScore)) {
                  ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score = tempScore;
                  worldDao.updateOp();
               } else {
                  PvpPlayerData data = new PvpPlayerData();
                  data.activeTime = System.currentTimeMillis();
                  data.score = tempScore;
                  data.playerId = playerId;
                  ((PvpSeasonData)worldDao.jsonData).scoreMap.put(playerId, data);
                  worldDao.updateOp();
               }

               this.rankMgr.pushTaskEx("updateRankEx", new Object[]{RankDefine.RankModule.PVP, ((PvpPlayerData)((PvpSeasonData)worldDao.jsonData).scoreMap.get(playerId)).score, playerId});
               break;
            case "seasonaward":
               this.seasonSettle();
               break;
            case "dailyaward":
               this.daySettle();
               break;
            case "seasonupdate":
               this.updateAllPlayerScore(true);
         }

      }
   }

   public void _slaveServerMergeBegin(int mainServerId) {
      WorldDao<PvpSeasonData> worldDao = this.worldMgr.<PvpSeasonData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_PVP_REASON);

      for(Map.Entry<Integer, PvpPlayerData> entry : ((PvpSeasonData)worldDao.jsonData).scoreMap.entrySet()) {
         if (((PvpPlayerData)entry.getValue()).playerId >= 20000) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(((PvpPlayerData)entry.getValue()).playerId);
            if (gamePlayer != null) {
               PlayerDao playerDao = gamePlayer.getPlayerDao();
               playerDao.pvp_points = ((PvpPlayerData)entry.getValue()).score;
               playerDao.updateOp();
            }
         }
      }

   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      for(GamePlayer gamePlayer : this.worldMgr.getSlaveServerPlayerMap().values()) {
         PlayerDao playerDao = gamePlayer.getPlayerDao();
         if (playerDao.pvp_points > 1000) {
            this.insetNewPlayer(playerDao.playerId, playerDao.pvp_points);
            this.rankMgr.updateRank(RankDefine.RankModule.PVP, (long)playerDao.pvp_points, playerDao.playerId);
         }
      }

   }
}
