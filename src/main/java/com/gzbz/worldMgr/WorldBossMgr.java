package com.gzbz.worldMgr;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import cn.hutool.core.util.RandomUtil;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WarBarbarianDao;
import com.gzbz.db.WorldBossDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.NormalBossModel;
import com.gzbz.model.SavageInvadeModel;
import com.gzbz.protobuf.BarbarianMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.war.barbarian.BarbarianPart;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class WorldBossMgr extends GameMgr {
   private final RankMgr rankMgr;
   private final WorldMgr worldMgr;
   private final GameModelPool gameModelPool;
   private final MailWorldMgr mailWorldMgr;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   public final int TYPE_BARBARIAN = 9;
   public final int TYPE_SHA_MO_KE = 10;
   public final int TYPE_11 = 11;
   public final int TYPE_12 = 12;
   public final int STATE_CLOSE = 0;
   public final int STATE_OPEN = 1;

   public WorldBossMgr(RankMgr rankMgr, WorldMgr worldMgr, GameModelPool gameModelPool, MailWorldMgr mailWorldMgr) {
      this.rankMgr = rankMgr;
      this.worldMgr = worldMgr;
      this.gameModelPool = gameModelPool;
      this.mailWorldMgr = mailWorldMgr;
   }

   protected void init() {
   }

   public void initData() {
      for(int bossType : this.getAllBossModels().keySet()) {
         WorldBossDao worldBossDao = this.getWorldBossDao(bossType);
         int var10000 = worldBossDao.state;
         this.getClass();
         if (var10000 == 1 && !DateUtil.isSameDay(worldBossDao.lastOpenTime)) {
            this.logger.info("世界boss:{}失效关闭", this.getNormalBoss(bossType).getName());
            this.close(bossType);
         }

         boolean isOpen = this.checkBoss(bossType);
         this.logger.info("世界boss:{},状态:{}", this.getNormalBoss(bossType).getName(), isOpen ? "开启" : "关闭");
      }

   }

   public WorldBossDao getWorldBossDao(int bossType) {
      return (WorldBossDao)this.gameCachePool.getData("tb_world_boss", new Object[]{bossType});
   }

   public Map<Integer, TreeMap<Integer, NormalBossModel>> getAllBossModels() {
      return this.gameModelPool.getMap("customWorldBoss");
   }

   public NormalBossModel getNormalBoss(int bossType) {
      return (NormalBossModel)((TreeMap)this.getAllBossModels().get(bossType)).firstEntry().getValue();
   }

   public boolean isOpen(int bossType) {
      int var10000 = this.getWorldBossDao(bossType).state;
      this.getClass();
      return var10000 == 1;
   }

   @TaskMethod
   public void checkBoss() {
      for(int bossType : this.getAllBossModels().keySet()) {
         this.checkBoss(bossType);
      }

   }

   private boolean checkBoss(int bossType) {
      LocalDateTime nowTime = LocalDateTime.now();
      int cDayInWeek = nowTime.getDayOfWeek().getValue();
      int cHour = nowTime.getHour();
      NormalBossModel bossModel = this.getNormalBoss(bossType);
      if (bossModel == null) {
         return false;
      } else {
         boolean isOpen = false;
         int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
         NormalBossModel.OpenTime openTime = null;

         for(NormalBossModel.OpenTime checkOpenTime : bossModel.getOpenTimeList()) {
            if (openServerDay >= checkOpenTime.openServerDayBegin && openServerDay <= checkOpenTime.openServerDayEnd) {
               openTime = checkOpenTime;
               break;
            }
         }

         if (openTime != null) {
            boolean flag = false;

            for(int openWeek : openTime.openWeek) {
               if (cDayInWeek == openWeek) {
                  flag = true;
                  break;
               }
            }

            String[] openTimeArr = bossModel.getOpenTime().split(":");
            String[] closeTimeArr = bossModel.getCloseTime().split(":");
            isOpen = flag && cHour >= Integer.parseInt(openTimeArr[0]) && cHour < Integer.parseInt(closeTimeArr[0]);
         }

         if (isOpen) {
            this.open(bossType);
         } else {
            this.close(bossType);
         }

         return isOpen;
      }
   }

   public void open(int bossType) {
      WorldBossDao worldBossDao = this.getWorldBossDao(bossType);
      int var10000 = worldBossDao.state;
      this.getClass();
      if (var10000 != 1 || !DateUtil.isSameDay(System.currentTimeMillis(), worldBossDao.lastOpenTime)) {
         NormalBossModel normalBossModel = this.getNormalBoss(bossType);
         if (normalBossModel != null) {
            this.removeDamageRank(bossType);
            this.logger.info("世界boss:{}开启", normalBossModel.getName());
            worldBossDao.damage = 0L;
            this.getClass();
            worldBossDao.state = 1;
            worldBossDao.lastOpenTime = System.currentTimeMillis();
            worldBossDao.updateOp();

            for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
               BarbarianPart barbarianPart = (BarbarianPart)gamePlayer.getMgrPart(BarbarianPart.class);
               barbarianPart.pushTaskEx("barbarianPlayerOpen", new Object[]{worldBossDao.lastOpenTime});
            }

         }
      }
   }

   public void close(int bossType) {
      WorldBossDao worldBossDao = this.getWorldBossDao(bossType);
      int var10000 = worldBossDao.state;
      this.getClass();
      if (var10000 != 0) {
         NormalBossModel normalBossModel = this.getNormalBoss(bossType);
         if (normalBossModel != null) {
            this.logger.info("世界boss:{}关闭", normalBossModel.getName());
            long totalDamage = worldBossDao.damage;
            this.getClass();
            worldBossDao.state = 0;
            worldBossDao.damage = 0L;
            worldBossDao.updateOp();

            for(GamePlayer player : this.worldMgr.getOnlinePlayer()) {
               BarbarianPart barbarianPart = (BarbarianPart)player.getMgrPart(BarbarianPart.class);
               barbarianPart.pushTaskEx("barbarianPlayerClose", new Object[0]);
            }

            List<RankData> rankDataList = this.getDamageRanks(bossType, 99999);
            if (rankDataList != null && !rankDataList.isEmpty()) {
               int totalDamageRewardType = normalBossModel.getSavageHurtAward();
               int personalRankRewardType = normalBossModel.getSavageRankAward();
               this.rankMgr.grantRankAward(personalRankRewardType, RankDefine.RankModule.BOSS_DAMAGE, 32, 3203, String.valueOf(bossType));
               if (totalDamage > 0L) {
                  CentreAwardModel totalDamageReward = this.getCentreAwardModel(totalDamageRewardType, totalDamage);
                  Map<Integer, String> playerParams = new HashMap();

                  for(RankData rankData : rankDataList) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
                     if (gamePlayer != null) {
                        playerParams.put(gamePlayer.getPlayerId(), rankData.rank + "");
                        LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
                        logOperationMgr.addReceiveAwardNewLog(gamePlayer, 17, 0, totalDamageReward.getTitle(), String.valueOf(totalDamageReward.getId()), "-", 0, 0, 0);
                     }
                  }

                  this.mailWorldMgr.addParamsMailAndSendOnline(MailDefine.MailType.MAIL_TYPE_COMMON, totalDamageReward.getTitle(), totalDamageReward.getDesc(), totalDamageReward.getItems(), playerParams, 604800000L, 32, 3202, 0);
               }

               this.closeOtherHandle(normalBossModel, rankDataList);
               this.removeDamageRank(bossType);
            }
         }
      }
   }

   private void closeOtherHandle(NormalBossModel normalBossModel, List<RankData> rankDataList) {
      CentreAwardModel luckReward = this.getCentreAwardModel(normalBossModel.getSavageRankAward(), 0L);
      RankData luckyData = (RankData)rankDataList.get(RandomUtil.randomInt(rankDataList.size()));
      GamePlayer luckyPlayer = this.worldMgr.getPlayerById(luckyData.value);
      if (luckyPlayer != null) {
         BarbarianPart barbarianPart = (BarbarianPart)luckyPlayer.getMgrPart(BarbarianPart.class);
         barbarianPart.pushTaskEx("barbarianLuckyReward", new Object[]{normalBossModel, luckReward});
      }

   }

   public SavageInvadeModel barbarianPersonReward(long damage) {
      Map<Integer, TreeMap<Integer, SavageInvadeModel>> allRewards = this.gameModelPool.getMap("customSavageInvade");
      TreeMap<Integer, SavageInvadeModel> playerDamageReward = (TreeMap)allRewards.get(10);
      SavageInvadeModel finalReward = null;

      for(SavageInvadeModel savageInvadeModel : playerDamageReward.values()) {
         if ((long)savageInvadeModel.getMinHurt() <= damage && (long)savageInvadeModel.getMaxHurt() >= damage) {
            finalReward = savageInvadeModel;
            break;
         }
      }

      return finalReward == null ? (SavageInvadeModel)playerDamageReward.lastEntry().getValue() : finalReward;
   }

   @TaskMethod
   public void checkWorldBossStatus(GamePlayer player) {
      BarbarianPart barbarianPart = (BarbarianPart)player.getMgrPart(BarbarianPart.class);
      int openBoss = this.getOpenBoss();
      if (openBoss > 0) {
         NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", openBoss);
         WorldBossDao worldBossDao = this.getWorldBossDao(normalBossModel.getBossType());
         barbarianPart.pushTaskEx("barbarianPlayerOpen", new Object[]{worldBossDao.lastOpenTime});
      } else {
         barbarianPart.pushTaskEx("barbarianPlayerClose", new Object[0]);
      }

   }

   @TaskMethod
   public void worldBossSwapOneKey(int bossType, long damage, WarBarbarianDao warBarbarianDao, GamePlayer player) {
      if (this.isOpen(bossType)) {
         this.damageRank(bossType, player.getPlayerId(), warBarbarianDao.totalDamage);
         this.updateBossTotalDamage(bossType, damage);
      }

      BarbarianMsg.S2C_BarbarianSwapOneKey_9308.Builder resp = BarbarianMsg.S2C_BarbarianSwapOneKey_9308.newBuilder();
      resp.setInfo(this.buildInfo(warBarbarianDao));
      player.sendMsg(resp.build());
   }

   @TaskMethod
   public void worldBossChallenge(long damage, WarBarbarianDao warBarbarianDao, GamePlayer player) {
      int bossId = this.getOpenBoss();
      if (bossId > 0) {
         NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", bossId);
         this.damageRank(normalBossModel.getBossType(), player.getPlayerId(), warBarbarianDao.totalDamage);
         this.updateBossTotalDamage(normalBossModel.getBossType(), damage);
      }

      BarbarianMsg.S2C_BarbarianCrusade_9304.Builder resp = BarbarianMsg.S2C_BarbarianCrusade_9304.newBuilder();
      resp.setInfo(this.buildInfo(warBarbarianDao));
      player.sendMsg(resp.build());
   }

   public void damageRank(int bossType, int playerId, long damage) {
      this.rankMgr.updateRank(RankDefine.RankModule.BOSS_DAMAGE, damage, playerId, String.valueOf(bossType));
   }

   public void removeDamageRank(int bossType) {
      this.rankMgr.removeRanks(RankDefine.RankModule.BOSS_DAMAGE, String.valueOf(bossType));
   }

   public List<RankData> getDamageRanks(int bossType, int limit) {
      return this.rankMgr.getRanks(RankDefine.RankModule.BOSS_DAMAGE, limit, String.valueOf(bossType));
   }

   public int getDamageRank(int bossType, int player) {
      return this.rankMgr.getRank(RankDefine.RankModule.BOSS_DAMAGE, player, String.valueOf(bossType));
   }

   public void updateBossTotalDamage(int bossType, long damage) {
      WorldBossDao worldBossDao = this.getWorldBossDao(bossType);
      worldBossDao.damage += damage;
      worldBossDao.updateOp();
   }

   public long getBossTotalDamage(int bossType) {
      WorldBossDao worldBossDao = this.getWorldBossDao(bossType);
      return worldBossDao.damage;
   }

   public CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.gameModelPool.getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel centreAwardModel : rewardMap.values()) {
         if ((long)centreAwardModel.getMinRank() <= rank && (long)centreAwardModel.getMaxRank() >= rank) {
            rewardModel = centreAwardModel;
            break;
         }
      }

      return rewardModel == null ? (CentreAwardModel)rewardMap.lastEntry().getValue() : rewardModel;
   }

   public void gmPersonalReset(GamePlayer gamePlayer) {
      WarBarbarianDao warBarbarianDao = (WarBarbarianDao)gamePlayer.getData("tb_war_barbarian", gamePlayer.getPlayerId());
      warBarbarianDao.challengeCount = 0;
      warBarbarianDao.buyCount = 0;
      warBarbarianDao.updateOp();
      gamePlayer.sendMsg(this.buildInfo(warBarbarianDao));
   }

   public BarbarianMsg.S2C_BarbarianInfo_9302 buildInfo(WarBarbarianDao warBarbarianDao) {
      BarbarianMsg.S2C_BarbarianInfo_9302.Builder msg = BarbarianMsg.S2C_BarbarianInfo_9302.newBuilder();
      long totalDamage = 0L;
      long maxDamage = 0L;
      int count = 0;
      int buyCount = 0;
      long myTotalDamage = 0L;
      int myRank = 0;
      int bossId = this.getOpenBoss();
      NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", bossId);
      if (normalBossModel != null) {
         totalDamage = this.getBossTotalDamage(normalBossModel.getBossType());
         maxDamage = warBarbarianDao.todayDamage;
         count = warBarbarianDao.challengeCount;
         buyCount = warBarbarianDao.buyCount;
         myTotalDamage = warBarbarianDao.totalDamage;

         for(RankData rankData : this.getDamageRanks(normalBossModel.getBossType(), 3)) {
            RankMsg.RankData.Builder rankMsg = RankMsg.RankData.newBuilder();
            rankMsg.setRank(rankData.rank);
            rankMsg.setScore(rankData.score);
            rankMsg.setPlayerId(rankData.value);
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
            if (gamePlayer != null) {
               PlayerPublicDao playerDao = gamePlayer.getPublicDao();
               rankMsg.setPlayerName(playerDao.playerName);
               rankMsg.setHead(playerDao.head);
               rankMsg.setHeadFrame(playerDao.headFrame);
               rankMsg.setLevel(playerDao.lv);
               if (rankData.value == warBarbarianDao.playerId) {
                  myRank = rankData.rank;
               }
            }

            msg.addRanks(rankMsg);
         }

         if (myRank == 0) {
            myRank = this.getDamageRank(normalBossModel.getBossType(), warBarbarianDao.playerId);
         }
      }

      msg.setTotalDamage(totalDamage);
      msg.setMaxDamage(maxDamage);
      msg.setCount(count);
      msg.setBuyCount(buyCount);
      msg.setMyTotalDamage(myTotalDamage);
      msg.setMyRank(myRank);
      msg.setBossId(bossId);
      return msg.build();
   }

   @TaskMethod
   public void sendMainInfo(WarBarbarianDao warBarbarianDao, GamePlayer player) {
      player.sendMsg(this.buildInfo(warBarbarianDao));
   }

   public int getOpenBoss() {
      int openBoss = 0;

      for(int bossType : this.getAllBossModels().keySet()) {
         if (this.isOpen(bossType)) {
            NormalBossModel normalBossModel = this.getNormalBoss(bossType);
            if (normalBossModel != null) {
               openBoss = normalBossModel.getBossId();
            }
         }
      }

      return openBoss;
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      int openBossType = 0;

      for(int bossType : this.getAllBossModels().keySet()) {
         if (this.isOpen(bossType)) {
            openBossType = bossType;
         }
      }

      if (openBossType > 0) {
         WorldBossDao worldBossDao = this.getWorldBossDao(openBossType);
         int var10000 = worldBossDao.state;
         this.getClass();
         if (var10000 != 0) {
            NormalBossModel normalBossModel = this.getNormalBoss(openBossType);
            if (normalBossModel != null) {
               List<RankData> rankDataList = this.getDamageRanks(openBossType, 99999);
               if (rankDataList != null && !rankDataList.isEmpty()) {
                  this.rankMgr.grantRankAward(normalBossModel.getSavageRankAward(), RankDefine.RankModule.BOSS_DAMAGE, 32, 3203, String.valueOf(openBossType));
                  if (worldBossDao.damage > 0L) {
                     CentreAwardModel totalDamageReward = this.getCentreAwardModel(normalBossModel.getSavageHurtAward(), worldBossDao.damage);
                     Map<Integer, String> playerParams = new HashMap();

                     for(RankData rankData : rankDataList) {
                        GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
                        if (gamePlayer != null) {
                           playerParams.put(gamePlayer.getPlayerId(), rankData.rank + "");
                           LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
                           logOperationMgr.addReceiveAwardNewLog(gamePlayer, 17, 0, totalDamageReward.getTitle(), String.valueOf(totalDamageReward.getId()), "-", 0, 0, 0);
                        }
                     }

                     this.mailWorldMgr.addParamsMailAndSendOnline(MailDefine.MailType.MAIL_TYPE_COMMON, totalDamageReward.getTitle(), totalDamageReward.getDesc(), totalDamageReward.getItems(), playerParams, 604800000L, 32, 3202, 0);
                  }

                  worldBossDao.damage = 0L;
                  worldBossDao.updateOp();
                  this.closeOtherHandle(normalBossModel, rankDataList);

                  for(int bossType : this.getAllBossModels().keySet()) {
                     if (this.isOpen(bossType)) {
                        this.removeDamageRank(bossType);
                     }
                  }

               }
            }
         }
      }
   }
}
