package com.gzbz.duel;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.gzbz.db.DuelBossRecordDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.worldBean.DuelData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.WuDaoEnterModel;
import com.gzbz.model.WuDaoSelectPointModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossDuelMsg;
import com.gzbz.protobuf.DuelBattleMsg;
import com.gzbz.protobuf.DuelExtraMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import misc.MapUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class DuelMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(DuelMgr.class);
   private final CrossNettyClient crossNettyClient;
   private final WorldMgr worldMgr;
   private final OnLineMgr onLineMgr;
   private final RankMgr rankMgr;
   private final ConfigManager configManager;
   private final List<GamePlayer> waitSendMainPlayers = new ArrayList();
   private ScheduledFuture<?> waitSendMainFuture = null;
   private ScheduledFuture<?> uploadArrayingSf = null;
   private final TreeMap<Integer, Integer> uploadArrayingPlayer = new TreeMap();
   private ScheduledFuture<?> zoneUpdateArrayingSf = null;
   private final List<Integer> zoneUpdateArrayingPlayer = new ArrayList();
   private long prevStartTime;
   private long prevEndTime;
   private long startTime;
   private long endTime;
   private int season;
   private int stage;
   private int stageStatus;
   private int passRound;
   private int passState;
   private final Map<Integer, Set<Long>> playerBossRecords = new HashMap();
   public Set<Integer> pointUIPlayer = new HashSet();
   public Set<Integer> passUIPlayer = new HashSet();
   public Set<Integer> guessUIPlayer = new HashSet();
   public boolean isGroup = false;

   public DuelMgr(CrossNettyClient crossNettyClient, WorldMgr worldMgr, OnLineMgr onLineMgr, RankMgr rankMgr, ConfigManager configManager) {
      this.crossNettyClient = crossNettyClient;
      this.worldMgr = worldMgr;
      this.onLineMgr = onLineMgr;
      this.rankMgr = rankMgr;
      this.configManager = configManager;
   }

   protected void init() throws Exception {
   }

   public void initData() {
      for(DuelBossRecordDao duelBossRecordDao : this.getBossRecords().values()) {
         (MapUtil.computeIfAbsent(this.playerBossRecords, duelBossRecordDao.playerId, HashSet.class)).add(duelBossRecordDao.id);
      }

   }

   @MsgHandlerAnno
   public void CR2S_DuelMain_15702(CrossDuelMsg.CR2S_DuelMain_15702 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getStartTime() > 0L) {
         WuDaoEnterModel wuDaoEnterModel = (WuDaoEnterModel)ApplicationContextProvider.getModelPoolEntity("wudaoEnter", msg.getStage());
         logger.info("【第{}届武道大会】开始时间【{}】,结束时间【{}】,阶段【{}】,阶段状态【{}】", new Object[]{msg.getSeason(), DateUtil.transferLongToDate(msg.getStartTime()), DateUtil.transferLongToDate(msg.getEndTime()), wuDaoEnterModel == null ? "未开始" : wuDaoEnterModel.getName(), msg.getStageStatus() == 0 ? "未开始" : (msg.getStageStatus() == 1 ? "进行中" : "已结束")});
      } else {
         logger.info("【武道大会】关闭");
      }

      int oldStage = this.stage;
      int oldSeason = this.season;
      this.startTime = msg.getStartTime();
      this.endTime = msg.getEndTime();
      this.season = msg.getSeason();
      this.stageStatus = msg.getStageStatus();
      this.stage = msg.getStage();
      this.prevStartTime = msg.getPrevStartTime();
      this.prevEndTime = msg.getPrevEndTime();
      this.passRound = msg.getPassRound();
      this.passState = msg.getPassState();
      this.isGroup = false;
      if (msg.hasIsGroup()) {
         this.isGroup = msg.getIsGroup();
      }

      WorldDao<DuelData> duelData = this.worldMgr.<DuelData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_DUEL);
      if (this.season > 0) {
         long curTime = System.currentTimeMillis();
         if (((DuelData)duelData.jsonData).season > 0 && ((DuelData)duelData.jsonData).startTime == 0L && this.startTime <= curTime && this.endTime >= curTime) {
            ((DuelData)duelData.jsonData).startTime = this.startTime;
            duelData.updateOp();
         }

         if (this.season == ((DuelData)duelData.jsonData).season && this.startTime == ((DuelData)duelData.jsonData).startTime) {
            if (oldStage > 0 && oldStage != this.stage && this.stage == 5) {
               if (this.zoneUpdateArrayingSf != null) {
                  this.zoneUpdateArrayingSf.cancel(true);
                  this.zoneUpdateArrayingSf = null;
               }

               this.zoneUpdateArrayingPlayer.clear();
               this.zoneUpdateArrayingPlayer.addAll(((DuelData)duelData.jsonData).enterZone);
               if (!this.zoneUpdateArrayingPlayer.isEmpty()) {
                  this.zoneUpdateArrayingSf = this.scheduleEx(1000L, 1000L, "zoneUpdatePlayerArraying", new Object[0]);
               }
            }
         } else {
            logger.info("【武道大会】换届,重置数据");
            if (((DuelData)duelData.jsonData).season > 0) {
               this.rankMgr.removeRanks(RankDefine.RankModule.DUEL_BOSS);
               this.gameCachePool.deleteAll("tb_duel_boss_record");
               this.playerBossRecords.clear();
               this.getBossRecords();
            }

            ((DuelData)duelData.jsonData).enterZone.clear();
            ((DuelData)duelData.jsonData).bossSettle = false;
            ((DuelData)duelData.jsonData).playerZone.clear();
            ((DuelData)duelData.jsonData).season = this.season;
            ((DuelData)duelData.jsonData).startTime = this.startTime;
            duelData.updateOp();
         }
      }

      if (oldStage != this.stage || oldSeason != this.season) {
         this.checkBroadcastMainInfo();
      }

   }

   @MsgHandlerAnno
   public void CR2S_BossSettle_15712(CrossDuelMsg.CR2S_BossSettle_15712 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.settleBoss(msg.getIsGm());
   }

   @MsgHandlerAnno
   public void CR2S_EnterZonePlayer_15739(CrossDuelMsg.CR2S_EnterZonePlayer_15739 msg, CrossSubscribeMsg crossSubscribeMsg) {
      WorldDao<DuelData> duelData = this.worldMgr.<DuelData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_DUEL);
      ((DuelData)duelData.jsonData).enterZone.addAll(msg.getPlayerIdList());
      duelData.updateOp();
   }

   @TaskMethod
   public void zoneUpdatePlayerArraying() {
      if (this.zoneUpdateArrayingPlayer.isEmpty()) {
         if (this.zoneUpdateArrayingSf != null) {
            this.zoneUpdateArrayingSf.cancel(false);
            this.zoneUpdateArrayingSf = null;
         }

      } else {
         int playerId = (Integer)this.zoneUpdateArrayingPlayer.remove(this.zoneUpdateArrayingPlayer.size() - 1);
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            gamePlayer.pushPartTaskEx(DuelPart.class, "enterZoneCheckArraying", new Object[0]);
         }
      }
   }

   @TaskMethod
   public void disConnect() {
      logger.info("【武道大会】跨服关闭");
      this.startTime = 0L;
      this.endTime = 0L;
      this.season = 0;
      this.stage = 0;
      this.stageStatus = 0;
      this.prevEndTime = 0L;
      this.prevStartTime = 0L;
      this.checkBroadcastMainInfo();
   }

   public boolean isInvalid() {
      long curTime = System.currentTimeMillis();
      return this.startTime > curTime || this.endTime <= curTime || this.season <= 0 || this.stage <= 0;
   }

   public boolean isBossInvalid() {
      LocalDateTime localDateTime = LocalDateTime.now();
      long curTime = System.currentTimeMillis();
      if (this.startTime <= curTime && this.endTime > curTime && this.season > 0) {
         String[] timeConfigArr = ApplicationContextProvider.getConfigString("wudaoSection1time", "").split(",");
         String[] startTimeConfigArr = timeConfigArr[0].split("\\|")[1].split(":");
         String[] endTimeConfigArr = timeConfigArr[1].split("\\|")[1].split(":");
         LocalDateTime startDateTime = LocalDateTime.now().withHour(Integer.parseInt(startTimeConfigArr[0])).withMinute(Integer.parseInt(startTimeConfigArr[1])).withSecond(0);
         LocalDateTime endDateTime = LocalDateTime.now().withHour(Integer.parseInt(endTimeConfigArr[0])).withMinute(Integer.parseInt(endTimeConfigArr[1])).withSecond(0);
         int difDay = DateUtil.difftimeDay(new Timestamp(this.startTime));
         if (difDay == 0) {
            endDateTime = endDateTime.plusDays(1L);
         } else {
            if (difDay != 1) {
               return true;
            }

            startDateTime = startDateTime.plusDays(-1L);
         }

         return startDateTime.isAfter(localDateTime) || endDateTime.isBefore(localDateTime);
      } else {
         return true;
      }
   }

   @TaskMethod
   public void addBossRecord(long damage, long totalDamage, int playerId, String playerName) {
      DuelBossRecordDao duelBossRecordDao = new DuelBossRecordDao();
      duelBossRecordDao.playerId = playerId;
      duelBossRecordDao.playerName = playerName;
      duelBossRecordDao.damage = damage;
      duelBossRecordDao.totalDamage = totalDamage;
      duelBossRecordDao.challengeTime = System.currentTimeMillis();
      this.gameCachePool.insertDao(duelBossRecordDao, true);
      (MapUtil.computeIfAbsent(this.playerBossRecords, playerId, HashSet.class)).add(duelBossRecordDao.id);
      DuelBattleMsg.S2C_DuelBossRecord_4526.Builder msg = DuelBattleMsg.S2C_DuelBossRecord_4526.newBuilder();
      msg.setRecord(duelBossRecordDao.buildMsg());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
      int maxRecord = ApplicationContextProvider.getConfigInt("wudaoSection1Recod", 30);
      Map<Long, DuelBossRecordDao> duelBossRecordDaoMap = this.getBossRecords();
      if (duelBossRecordDaoMap.size() > maxRecord) {
         List<Long> recordIds = new ArrayList(duelBossRecordDaoMap.keySet());
         Collections.sort(recordIds);

         for(long recordId : recordIds.subList(maxRecord, recordIds.size())) {
            DuelBossRecordDao delRecordDao = (DuelBossRecordDao)duelBossRecordDaoMap.get(recordId);
            if (delRecordDao != null) {
               (this.playerBossRecords.get(delRecordDao.playerId)).remove(recordId);
               this.gameCachePool.deleteDao(delRecordDao, true);
            }
         }
      }

   }

   public Map<Long, DuelBossRecordDao> getBossRecords() {
      return this.gameCachePool.getAllTableByMap("tb_duel_boss_record");
   }

   public List<DuelBattleMsg.BattleBossRecord> getBossRecordMsgList(int playerId) {
      Map<Long, DuelBossRecordDao> duelBossRecordDaoMap = this.getBossRecords();
      List<DuelBattleMsg.BattleBossRecord> duelBossRecordDaoList = new ArrayList();
      Set<Long> recordIds;
      if (playerId > 0) {
         recordIds = this.playerBossRecords.get(playerId);
      } else {
         recordIds = duelBossRecordDaoMap.keySet();
      }

      if (recordIds != null && !recordIds.isEmpty()) {
         for(long recordId : recordIds) {
            DuelBossRecordDao duelBossRecordDao = (DuelBossRecordDao)duelBossRecordDaoMap.get(recordId);
            if (duelBossRecordDao != null) {
               duelBossRecordDaoList.add(duelBossRecordDao.buildMsg());
            }
         }

         return duelBossRecordDaoList;
      } else {
         return duelBossRecordDaoList;
      }
   }

   @TaskMethod
   public void broadcastMainInfo() {
      if (this.waitSendMainPlayers.isEmpty()) {
         if (this.waitSendMainFuture != null) {
            this.waitSendMainFuture.cancel(false);
            this.waitSendMainFuture = null;
         }

      } else {
         GamePlayer player = (GamePlayer)this.waitSendMainPlayers.remove(this.waitSendMainPlayers.size() - 1);
         if (player != null && player.isLogin()) {
            player.pushPartTaskEx(DuelPart.class, "sendDuelMainInfo", new Object[0]);
         }
      }
   }

   public DuelBattleMsg.S2C_DuelInfo_4502.Builder buildInfoMsg(int playerId) {
      WorldDao<DuelData> duelData = this.worldMgr.<DuelData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_DUEL);
      DuelBattleMsg.S2C_DuelInfo_4502.Builder msg = DuelBattleMsg.S2C_DuelInfo_4502.newBuilder();
      msg.setSeason(this.getSeason());
      msg.setEndTime(DateUtil.getIntTime(this.getEndTime()));
      msg.setStartTime(DateUtil.getIntTime(this.getStartTime()));
      msg.setStage(this.getStage());
      msg.setPrevEndTime(DateUtil.getIntTime(this.getPrevEndTime()));
      msg.setPrevStartTime(DateUtil.getIntTime(this.getPrevStartTime()));
      msg.setZone((Integer)MapUtil.getOrDefault(((DuelData)duelData.jsonData).playerZone, playerId, 0));
      msg.setPassRound(this.getPassRound());
      msg.setGuessState(this.getPassState());
      return msg;
   }

   public void settleBoss(boolean isGm) {
      WorldDao<DuelData> duelData = this.worldMgr.<DuelData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_DUEL);
      if (isGm || !((DuelData)duelData.jsonData).bossSettle) {
         if (this.uploadArrayingSf != null) {
            this.uploadArrayingSf.cancel(false);
            this.uploadArrayingSf = null;
         }

         this.uploadArrayingPlayer.clear();
         if (!this.checkServerDay()) {
            logger.info("【武道大会】服务器未满参与条件,跳过资格赛结算");
         } else {
            Map<Integer, WuDaoSelectPointModel> wuDaoSelectPointModelMap = ApplicationContextProvider.<Integer, WuDaoSelectPointModel>getModelPoolMap("wudaoSelectPoint");
            Set<Integer> challengePlayers = new HashSet();
            int maxUploadSize = wuDaoSelectPointModelMap.size();
            this.rankMgr.pushTaskEx("grantRankAwardEx", new Object[]{ApplicationContextProvider.getConfigInt("wudaoSection1reward", 0), RankDefine.RankModule.DUEL_BOSS, 76, 7602});
            List<RankData> list = this.getDamageRanks(wuDaoSelectPointModelMap.size());
            Iterator<RankData> iterator = list.iterator();

            while(iterator.hasNext()) {
               RankData rankData = (RankData)iterator.next();
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
               if (gamePlayer != null && !gamePlayer.isRobot()) {
                  challengePlayers.add(rankData.value);
               } else {
                  iterator.remove();
               }
            }

            int needAutoJoin = maxUploadSize - challengePlayers.size();
            if (needAutoJoin > 0) {
               for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, maxUploadSize)) {
                  if (!challengePlayers.contains(rankData.value)) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
                     if (gamePlayer != null && !gamePlayer.isRobot()) {
                        if (!gamePlayer.isSystemOpen(3190)) {
                           logger.warn("玩家【{}】,不满足武道大会系统开启条件,不参与选拔赛替补", rankData.value);
                        } else {
                           list.add(rankData);
                           --needAutoJoin;
                           if (needAutoJoin <= 0) {
                              break;
                           }
                        }
                     }
                  }
               }

               logger.info("【比武大会】参与选拔赛玩家个数不足{}, 拉取战力排行榜{}个", maxUploadSize, maxUploadSize - challengePlayers.size());
            }

            int rank = 0;

            for(RankData rankData : list) {
               ++rank;
               this.uploadArrayingPlayer.put(rankData.value, rank);
            }

            ((DuelData)duelData.jsonData).bossSettle = true;
            duelData.updateOp();
            CrossDuelMsg.S2CR_BossSettle_15713.Builder builder = CrossDuelMsg.S2CR_BossSettle_15713.newBuilder();
            this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
            if (!this.uploadArrayingPlayer.isEmpty()) {
               long period = 1000L;
               if (isGm) {
                  period = 10L;
               }

               this.uploadArrayingSf = this.scheduleEx(0L, period, "checkAndUploadBossRank", new Object[0]);
            }

         }
      }
   }

   @TaskMethod
   public void checkAndUploadBossRank() {
      if (this.uploadArrayingPlayer.isEmpty()) {
         if (this.uploadArrayingSf != null) {
            this.uploadArrayingSf.cancel(false);
            this.uploadArrayingSf = null;
         }

      } else {
         int playerId = (Integer)this.uploadArrayingPlayer.lastKey();
         int rank = (Integer)this.uploadArrayingPlayer.remove(playerId);
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer != null) {
            gamePlayer.pushPartTaskEx(DuelPart.class, "checkAndUploadBossRank", new Object[]{rank});
         }
      }
   }

   @TaskMethod
   public void uploadBossRank(GamePlayer player, int rank, int serialChampion) {
      WuDaoSelectPointModel wuDaoSelectPointModel = (WuDaoSelectPointModel)ApplicationContextProvider.getModelPoolEntity("wudaoSelectPoint", rank);
      WorldDao<DuelData> duelData = this.worldMgr.<DuelData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_DUEL);
      ((DuelData)duelData.jsonData).playerZone.put(player.getPlayerId(), rank > 32 ? 2 : 1);
      duelData.updateOp();
      CrossDuelMsg.S2S_sendBossRank_15733.Builder msg = CrossDuelMsg.S2S_sendBossRank_15733.newBuilder();
      msg.setRank(rank);
      msg.setBossPoint(wuDaoSelectPointModel == null ? 0 : wuDaoSelectPointModel.getPoint());
      msg.setSerialChampion(serialChampion);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg.build());
      logger.info("【武道大会】上传玩家【{}】积分数据,积分【{}】,排行【{}】,连续冠军次数【{}】", new Object[]{player.getPublicDao().playerName, msg.getBossPoint(), rank, serialChampion});
      if (this.getStage() != 1) {
         player.sendMsg(this.buildInfoMsg(player.getPlayerId()).build());
      }

   }

   public boolean checkHadHero(ArrayingMirror arrayingMirror) {
      boolean flag = false;

      for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
         if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
            flag = true;
            break;
         }
      }

      return flag;
   }

   @TaskMethod
   public void enterUi(int playerId, int type, int isLeave) {
      if (type == 1) {
         if (isLeave == 2) {
            if (this.pointUIPlayer.contains(playerId)) {
               this.pointUIPlayer.remove(playerId);
            }
         } else {
            this.pointUIPlayer.add(playerId);
         }
      } else if (type == 2) {
         if (isLeave == 2) {
            if (this.passUIPlayer.contains(playerId)) {
               this.passUIPlayer.remove(playerId);
            }
         } else {
            this.passUIPlayer.add(playerId);
         }
      } else if (isLeave == 2) {
         if (this.guessUIPlayer.contains(playerId)) {
            this.guessUIPlayer.remove(playerId);
         }
      } else {
         this.guessUIPlayer.add(playerId);
      }

   }

   @MsgHandlerAnno
   public void S2C_NotifyPointGuess_4541(DuelBattleMsg.S2C_NotifyPointGuess_4541 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2C_NotifyPointBattle_16714(DuelExtraMsg.S2C_NotifyPointBattle_16714 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2C_NotifyPointBattle_4542(DuelBattleMsg.S2C_NotifyPointBattle_4542 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2C_NotifyPassBattle_4562(DuelBattleMsg.S2C_NotifyPassBattle_4562 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2C_NotifyPassGuess_4561(DuelBattleMsg.S2C_NotifyPassGuess_4561 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2C_NotifyPassBattle_16728(DuelExtraMsg.S2C_NotifyPassBattle_16728 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   @MsgHandlerAnno
   public void S2C_NotifyPassGuessBegin_16762(DuelExtraMsg.S2C_NotifyPassGuessBegin_16762 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.checkServerDay()) {
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
      }
   }

   @MsgHandlerAnno
   public void S2C_NotifyPassStateChange_16763(DuelExtraMsg.S2C_NotifyPassStateChange_16763 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.setPassRound(msg.getPassRound());
      this.setPassState(msg.getPassState());
      if (this.checkServerDay()) {
         logger.info("收到了跨服通知 淘汰赛阶段变化：{}-------------{}", msg.getPassRound(), msg.getPassState());
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
      }
   }

   public boolean checkServerDay() {
      int day = this.configManager.getIntDefault("wudaoOpenInletDay", 45);
      long dayStartTime = DateUtil.getSomeDayBeginTime(this.worldMgr.getOpenServerTime());
      int realDay = DateUtil.difftimeDay(new Timestamp(dayStartTime)) + 1;
      return realDay >= day;
   }

   public List<RankData> getDamageRanks(int limit) {
      return this.rankMgr.getRanks(RankDefine.RankModule.DUEL_BOSS, limit);
   }

   public long getDamage(int playerId) {
      return this.rankMgr.getScore(RankDefine.RankModule.DUEL_BOSS, playerId);
   }

   @MsgHandlerAnno
   public void S2C_NotifyRedPacket_16753(DuelExtraMsg.S2C_NotifyRedPacket_16753 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.checkServerDay()) {
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
      }
   }

   @MsgHandlerAnno
   public void S2C_Promotion_16776(DuelExtraMsg.S2C_Promotion_16776 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.checkServerDay()) {
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
      }
   }

   private void checkBroadcastMainInfo() {
      if (this.waitSendMainFuture != null) {
         this.waitSendMainFuture.cancel(true);
         this.waitSendMainFuture = null;
      }

      this.waitSendMainPlayers.clear();
      this.waitSendMainPlayers.addAll(this.worldMgr.getOnlinePlayer());
      if (!this.waitSendMainPlayers.isEmpty()) {
         this.waitSendMainFuture = this.scheduleEx(0L, 10L, "broadcastMainInfo", new Object[0]);
      }
   }

   public long getStartTime() {
      return this.startTime;
   }

   public long getEndTime() {
      return this.endTime;
   }

   public int getSeason() {
      return this.season;
   }

   public int getStage() {
      return this.stage;
   }

   public int getLastSettleStage() {
      switch (this.stage) {
         case 1:
            if (this.stageStatus == 2) {
               String[] timeConfigArr = ApplicationContextProvider.getConfigString("wudaoSection1time", "").split(",");
               String[] bossEndTimeConfigArr = timeConfigArr[1].split("\\|")[1].split(":");
               LocalDateTime nowDateTime = LocalDateTime.now();
               if (nowDateTime.getHour() > Integer.parseInt(bossEndTimeConfigArr[0]) || nowDateTime.getMinute() > Integer.parseInt(bossEndTimeConfigArr[1]) + 6) {
                  return this.stage;
               }
            }
         case 3:
         case 5:
         default:
            return 0;
         case 2:
            if (this.stageStatus == 2) {
               return this.stage;
            }

            return 1;
         case 4:
            return 2;
         case 6:
            if (this.stageStatus == 2) {
               return this.stage;
            }

            return 2;
         case 7:
            return 6;
      }
   }

   public int getStageStatus() {
      return this.stageStatus;
   }

   public long getPrevStartTime() {
      return this.prevStartTime;
   }

   public long getPrevEndTime() {
      return this.prevEndTime;
   }

   public int getPassRound() {
      return this.passRound;
   }

   public void setPassRound(int passRound) {
      this.passRound = passRound;
   }

   public int getPassState() {
      return this.passState;
   }

   public void setPassState(int passState) {
      this.passState = passState;
   }
}
