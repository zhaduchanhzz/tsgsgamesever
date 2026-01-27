package com.gzbz.rank;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import cn.hutool.core.util.NumberUtil;
import com.gzbz.db.HeroNationRankDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.RankRewardDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HefuRushRankModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.RankRewardModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleChapterMsg;
import com.gzbz.protobuf.CrossRankMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.rank.bean.HeroRankData;
import com.gzbz.rank.bean.PlayerRankExtend;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.custom.CustomRankMgr;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.war.jingzhou.JingzhouWarPart;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import misc.BitMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.redisson.api.RScoredSortedSet;
import org.redisson.client.protocol.ScoredEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class RankMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(RankMgr.class);
   private final GameRedisTool gameRedisTool;
   private final WorldMgr worldMgr;
   private final GameModelPool gameModelPool;
   private final MailWorldMgr mailWorldMgr;
   private final UnionMgrParent unionMgrParent;
   private final ConfigManager configManager;
   public Map<String, CustomRankMgr> customRankMgrMap = new ConcurrentHashMap();
   public int gmOpenServer = 0;

   public RankMgr(GameRedisTool gameRedisTool, WorldMgr worldMgr, GameModelPool gameModelPool, MailWorldMgr mailWorldMgr, UnionMgrParent unionMgrParent, ConfigManager configManager) {
      this.gameRedisTool = gameRedisTool;
      this.worldMgr = worldMgr;
      this.gameModelPool = gameModelPool;
      this.mailWorldMgr = mailWorldMgr;
      this.unionMgrParent = unionMgrParent;
      this.configManager = configManager;
   }

   protected void init() {
   }

   public void initData() {
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (MiscUtil.existBit((long)((WorldData)worldDao.jsonData).otherFlag, 2)) {
         this.pushTask(this::getHeroNationRankMap);
      } else {
         ((WorldData)worldDao.jsonData).otherFlag = MiscUtil.setBit(((WorldData)worldDao.jsonData).otherFlag, 2);
         worldDao.updateOp();
         this.pushTask(this::initNationRank);
      }
   }

   public void initNationRank() {
      this.getHeroNationRankMap();
      long time = System.currentTimeMillis();

      try {
         String[] limit = ApplicationContextProvider.getConfigString("groupIntoRule", "100|6").split("\\|");
         AtomicInteger prevPlayerId = new AtomicInteger(0);
         Map<Integer, HeroRankData> prePlayerHeroRankDataMap = new HashMap();
         this.worldMgr.getGameDBPool().query(String.format("SELECT %s FROM %s WHERE playerId > 20000 AND lv > %d AND star > %d ORDER BY playerId", "playerId,`code`,id,lv,star,combatPower,state,starMapTotalLv,invalidTime", "tb_hero_bag", Integer.parseInt(limit[0]), Integer.parseInt(limit[1])), (resultSet) -> {
            while(true) {
               try {
                  if (!resultSet.next()) {
                     if (prevPlayerId.get() > 0) {
                        this.updateNationHeroesRank(prePlayerHeroRankDataMap);
                     }

                     return;
                  }

                  BitMap stateBitMap = new BitMap(BitMap.longToByteArray(resultSet.getLong("state")));
                  if (stateBitMap.getBit(1) == 1) {
                     int heroId = resultSet.getInt("id");
                     int invalidTime = resultSet.getInt("invalidTime");
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
                     if (heroModel != null && heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_PALACE && invalidTime <= 0) {
                        int playerId = resultSet.getInt("playerId");
                        if (prevPlayerId.get() == 0) {
                           prevPlayerId.set(playerId);
                        } else if (prevPlayerId.get() != playerId) {
                           this.updateNationHeroesRank(prePlayerHeroRankDataMap);
                           prevPlayerId.set(playerId);
                           prePlayerHeroRankDataMap.clear();
                        }

                        long power = resultSet.getLong("combatPower");
                        if (!prePlayerHeroRankDataMap.containsKey(heroModel.getNation()) || ((HeroRankData)prePlayerHeroRankDataMap.get(heroModel.getNation())).score <= power) {
                           HeroRankData heroRankData = new HeroRankData();
                           heroRankData.score = power;
                           heroRankData.star = resultSet.getInt("star");
                           heroRankData.lv = resultSet.getInt("lv");
                           heroRankData.code = resultSet.getInt("code");
                           heroRankData.starMapTotalLv = resultSet.getInt("starMapTotalLv");
                           heroRankData.id = heroId;
                           heroRankData.value = playerId;
                           prePlayerHeroRankDataMap.put(heroModel.getNation(), heroRankData);
                        }
                     }
                  }
               } catch (SQLException e) {
                  e.printStackTrace();
               }
            }
         }, new Object[0]);
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      Map<Integer, HeroNationRankDao> heroNationRankMap = this.getHeroNationRankMap();

      for(HeroNationRankDao heroNationRankDao : heroNationRankMap.values()) {
         int index = 1;
         long delay = 0L;

         for(Map.Entry<Integer, HeroRankData> entry : heroNationRankDao.rankDataMap.entrySet()) {
            delay += 1500L;
            this.scheduleEx(delay, "checkRankReward", new Object[]{entry.getKey(), RankRewardModel.HERO_NATION_RANK.getOrDefault(heroNationRankDao.nation, -1), ((HeroRankData)entry.getValue()).score});
            ++index;
            if (index > 5) {
               break;
            }
         }
      }

      this.logger.info("初始化武将阵营排行榜耗时{}ms", System.currentTimeMillis() - time);
   }

   @TaskMethod
   public void removeNationHeroRank(int playerId, int nation, int code) {
      Map<Integer, HeroNationRankDao> heroNationRankMap = this.getHeroNationRankMap();
      HeroNationRankDao heroNationRankDao = (HeroNationRankDao)heroNationRankMap.get(nation);
      if (heroNationRankDao != null) {
         HeroRankData heroRankData = (HeroRankData)heroNationRankDao.rankDataMap.get(playerId);
         if (heroRankData != null) {
            if (heroRankData.code == code) {
               heroNationRankDao.rankDataMap.remove(playerId);
               heroNationRankDao.updateOp();
               GamePlayer player = this.worldMgr.getPlayerById(playerId);
               player.pushPartTaskEx(HeroBagPart.class, "resetNationHeroRank", new Object[]{nation});
            }
         }
      }
   }

   private void updateNationHeroesRank(Map<Integer, HeroRankData> heroRankDataMap) {
      for(Map.Entry<Integer, HeroRankData> entry : heroRankDataMap.entrySet()) {
         this.updateNationHeroRank((Integer)entry.getKey(), (HeroRankData)entry.getValue());
      }

   }

   @TaskMethod
   public void updateNationHeroRank(int nation, HeroRankData heroRankData) {
      Map<Integer, HeroNationRankDao> heroNationRankMap = this.getHeroNationRankMap();
      HeroNationRankDao heroNationRankDao;
      if (!heroNationRankMap.containsKey(nation)) {
         heroNationRankDao = new HeroNationRankDao();
         heroNationRankDao.nation = nation;
         this.gameCachePool.insertDao(heroNationRankDao, false);
      } else {
         heroNationRankDao = (HeroNationRankDao)heroNationRankMap.get(nation);
         if (heroNationRankDao.rankDataMap.containsKey(heroRankData.value) && ((HeroRankData)heroNationRankDao.rankDataMap.get(heroRankData.value)).score > heroRankData.score) {
            return;
         }
      }

      heroNationRankDao.rankDataMap.put(heroRankData.value, heroRankData);
      heroNationRankDao.rankDataMap = (LinkedHashMap)heroNationRankDao.rankDataMap.entrySet().stream().sorted((o1, o2) -> NumberUtil.compare(((HeroRankData)o2.getValue()).score, ((HeroRankData)o1.getValue()).score)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
      heroNationRankDao.updateOp();
   }

   public List<HeroRankData> getNationHeroRanks(int nation, int limit) {
      Map<Integer, HeroNationRankDao> heroNationRankMap = this.getHeroNationRankMap();
      List<HeroRankData> rankDataList = new ArrayList();
      if (heroNationRankMap.containsKey(nation)) {
         rankDataList.addAll(((HeroNationRankDao)heroNationRankMap.get(nation)).rankDataMap.values());
         rankDataList = rankDataList.subList(0, Math.min(rankDataList.size(), limit));
      }

      return rankDataList;
   }

   public void clearInvalidPlayers() {
      this.logger.info("排行榜检查并清理不存在的玩家排行信息");

      for(String key : this.gameRedisTool.getClient().getKeys().getKeysByPattern(this.getRankRedisKey() + ":*")) {
         RankDefine.RankModule rankModule = null;

         for(RankDefine.RankModule tempModule : RankDefine.RankModule.values()) {
            if (!tempModule.isCross && key.startsWith(this.getRedisKey(tempModule))) {
               rankModule = tempModule;
               break;
            }
         }

         if (rankModule == null) {
            this.logger.error("key:【{}】找不到匹配的排行榜模块", key);
         } else if (rankModule.isPlayer) {
            if (rankModule == RankDefine.RankModule.PVP) {
               this.logger.info("PVP不处理，稍后自行处理，此时机器人还没有加入playerMap");
            } else {
               Set<Integer> removeValues = new HashSet();
               RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(key);
               Collection<Integer> playerIds = rScoredSortedSet.valueRange(0, rScoredSortedSet.size() - 1);
               if (playerIds != null) {
                  for(Integer playerId : playerIds) {
                     if (!this.worldMgr.getPlayerMap().containsKey(playerId)) {
                        removeValues.add(playerId);
                     }
                  }

                  if (!removeValues.isEmpty()) {
                     rScoredSortedSet.removeAll(removeValues);
                  }
               }
            }
         }
      }

      String unionCombatPowerKey = this.getRedisKey(RankDefine.RankModule.UNION_COMBAT_POWER);
      Set<Integer> removeValues = new HashSet();
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(unionCombatPowerKey);
      Collection<Integer> unionIds = rScoredSortedSet.valueRange(0, rScoredSortedSet.size() - 1);
      if (unionIds != null) {
         for(Integer unionId : unionIds) {
            if (!this.unionMgrParent.getUnionMgrMap().containsKey(unionId)) {
               removeValues.add(unionId);
            }
         }

         if (!removeValues.isEmpty()) {
            rScoredSortedSet.removeAll(removeValues);
         }
      }

      Map<Integer, Map<Integer, RankRewardModel>> allRankRewardMap = this.gameModelPool.getMap("customRankReward");

      for(Integer type : allRankRewardMap.keySet()) {
         this.gameCachePool.getMap("tb_rank_reward", new Object[]{type});
      }

   }

   @TaskMethod
   public void checkRankReward(int playerId, int type, long value) {
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      Map<Integer, RankRewardDao> rewardDaoMap = this.gameCachePool.getMap("tb_rank_reward", new Object[]{type});
      if (rewardDaoMap != null) {
         GamePlayer rankPlayer = this.worldMgr.getPlayerById(playerId);
         if (rankPlayer != null) {
            PlayerPublicDao rankPlayerDao = rankPlayer.getPublicDao();
            Map<Integer, TreeMap<Integer, RankRewardModel>> allRankRewardMap = this.gameModelPool.getMap("customRankReward");
            TreeMap<Integer, RankRewardModel> currentTypeModelsMap = (TreeMap)MapUtil.getOrDefault(allRankRewardMap, type, TreeMap.class);
            List<RankMsg.RankRewardData> firstFinishRankRewards = new ArrayList();

            for(RankRewardModel rankRewardModel : currentTypeModelsMap.values()) {
               if ((long)rankRewardModel.getNeed() > value) {
                  break;
               }

               if (!rewardDaoMap.containsKey(rankRewardModel.getId())) {
                  RankRewardDao rewardDao = new RankRewardDao();
                  rewardDao.type = type;
                  rewardDao.modelId = rankRewardModel.getId();
                  rewardDao.finishDataList.put(playerId, curTime);
                  this.gameCachePool.insertDao(rewardDao);
                  RankMsg.RankRewardData.Builder rankRewardData = RankMsg.RankRewardData.newBuilder();
                  rankRewardData.addRankData(this.buildRankRewardRankData(1, curTime, rankPlayerDao));
                  rankRewardData.setIsGot(false);
                  rankRewardData.setId(rankRewardModel.getId());
                  firstFinishRankRewards.add(rankRewardData.build());
               } else {
                  RankRewardDao rewardDao = (RankRewardDao)rewardDaoMap.get(rankRewardModel.getId());
                  if (!rewardDao.finishDataList.containsKey(playerId) && rewardDao.finishDataList.size() < 5) {
                     rewardDao.finishDataList.put(playerId, curTime);
                     rewardDao.updateOp();
                  }
               }
            }

            if (!firstFinishRankRewards.isEmpty()) {
               RankMsg.S2C_RankRewardInfo_8812.Builder notifyMsg = RankMsg.S2C_RankRewardInfo_8812.newBuilder();
               notifyMsg.setType(type);
               notifyMsg.addAllRewardDataList(firstFinishRankRewards);
               OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
               onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
            }
         }
      }
   }

   public void sendRankRewardInfo(GamePlayer gamePlayer, int type) {
      RankMsg.S2C_RankRewardInfo_8812.Builder msg = RankMsg.S2C_RankRewardInfo_8812.newBuilder();
      msg.setType(type);
      Map<Integer, RankRewardDao> rewardDaoMap = this.gameCachePool.getMap("tb_rank_reward", new Object[]{type});
      PlayerRankExtend playerRankExtend = (PlayerRankExtend)gamePlayer.getPlayerExtend(44);

      for(RankRewardDao rankRewardDao : rewardDaoMap.values()) {
         RankMsg.RankRewardData.Builder rewardBuilder = RankMsg.RankRewardData.newBuilder();
         rewardBuilder.setId(rankRewardDao.modelId);
         rewardBuilder.setIsGot(playerRankExtend.rankReward.contains(rankRewardDao.modelId));
         int rank = 0;

         for(Map.Entry<Integer, Integer> finishData : (List)rankRewardDao.finishDataList.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList())) {
            GamePlayer rankPlayer = this.worldMgr.getPlayerById((Integer)finishData.getKey());
            if (rankPlayer != null) {
               PlayerPublicDao rankPlayerDao = rankPlayer.getPublicDao();
               ++rank;
               RankMsg.RankData.Builder rankBuilder = this.buildRankRewardRankData(rank, (Integer)finishData.getValue(), rankPlayerDao);
               rewardBuilder.addRankData(rankBuilder);
            }
         }

         msg.addRewardDataList(rewardBuilder);
      }

      gamePlayer.sendMsg(msg.build());
   }

   private RankMsg.RankData.Builder buildRankRewardRankData(int rank, int finishTime, PlayerPublicDao rankPlayerDao) {
      RankMsg.RankData.Builder rankBuilder = RankMsg.RankData.newBuilder();
      rankBuilder.setRank(rank);
      rankBuilder.setScore((long)finishTime);
      rankBuilder.setPlayerId(rankPlayerDao.playerId);
      rankBuilder.setPlayerName(rankPlayerDao.playerName);
      rankBuilder.setLevel(rankPlayerDao.lv);
      rankBuilder.setHead(rankPlayerDao.head);
      rankBuilder.setHeadFrame(rankPlayerDao.headFrame);
      return rankBuilder;
   }

   public boolean isRewardFinish(int type, int id) {
      Map<Integer, RankRewardDao> rewardDaoMap = this.gameCachePool.getMap("tb_rank_reward", new Object[]{type});
      if (rewardDaoMap == null) {
         return false;
      } else if (!rewardDaoMap.containsKey(id)) {
         return false;
      } else {
         return !((RankRewardDao)rewardDaoMap.get(id)).finishDataList.isEmpty();
      }
   }

   public List<RankData> getMergeRushRanks(RankDefine.RankModule module, int limitCount) {
      if (module == null) {
         throw new RuntimeException("redis key 不能为空!");
      } else {
         List<RankData> rankDataList = new ArrayList();
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module));
         Collection<ScoredEntry<Integer>> rankCollection = rScoredSortedSet.entryRangeReversed(0, limitCount - 1);
         int rushRankId = 0;
         if (module == RankDefine.RankModule.RECRUIT_RUSH) {
            rushRankId = 1;
         } else if (module == RankDefine.RankModule.RECRUITMENT_RUSH) {
            rushRankId = 2;
         } else if (module == RankDefine.RankModule.STONE_RUSH) {
            rushRankId = 3;
         }

         if (rushRankId == 0) {
            return rankDataList;
         } else {
            HefuRushRankModel rushRankModel = (HefuRushRankModel)ApplicationContextProvider.getModelPoolEntity("HefuRushRank", rushRankId);
            int rank = 0;

            for(ScoredEntry<Integer> scoredEntry : rankCollection) {
               ++rank;
               long score = module.sortByTime ? (long)MiscUtil.getHiParam(scoredEntry.getScore().longValue()) : scoredEntry.getScore().longValue();
               if (rank == 1 && rushRankModel.getNeedPoint1() > 0 && score < (long)rushRankModel.getNeedPoint1()) {
                  ++rank;
               }

               if (rank == 2 && rushRankModel.getNeedPoint2() > 0 && score < (long)rushRankModel.getNeedPoint2()) {
                  ++rank;
               }

               if (rank == 3 && rushRankModel.getNeedPoint3() > 0 && score < (long)rushRankModel.getNeedPoint3()) {
                  ++rank;
               }

               rankDataList.add(new RankData(score, rank, (Integer)scoredEntry.getValue()));
            }

            return rankDataList;
         }
      }
   }

   public List<RankData> getMergeRushRanksByRank(RankDefine.RankModule module, int minRank, int maxRank, String... keyAppends) {
      List<RankData> rankDataList = new ArrayList();
      if (minRank > 0 && maxRank > 0) {
         for(RankData rankData : this.getMergeRushRanks(module, maxRank + 100)) {
            if (rankData.rank > maxRank) {
               break;
            }

            if (rankData.rank >= minRank && rankData.rank <= maxRank) {
               rankDataList.add(rankData);
            }
         }

         return rankDataList;
      } else {
         return rankDataList;
      }
   }

   public List<RankData> getRanks(RankDefine.RankModule module, int limitCount, String... keyAppends) {
      if (module == null) {
         throw new RuntimeException("redis key 不能为空!");
      } else {
         List<RankData> rankDataList = new ArrayList();
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module, keyAppends));
         Collection<ScoredEntry<Integer>> rankCollection = rScoredSortedSet.entryRangeReversed(0, limitCount - 1);
         int rank = 0;

         for(ScoredEntry<Integer> scoredEntry : rankCollection) {
            ++rank;
            if (!module.sortByTime) {
               rankDataList.add(new RankData(scoredEntry.getScore().longValue(), rank, (Integer)scoredEntry.getValue()));
            } else {
               int value = MiscUtil.getHiParam(scoredEntry.getScore().longValue());
               rankDataList.add(new RankData((long)value, rank, (Integer)scoredEntry.getValue()));
            }
         }

         return rankDataList;
      }
   }

   public int getRankSize(RankDefine.RankModule module, String... keyAppends) {
      if (module == null) {
         throw new RuntimeException("redis key 不能为空!");
      } else {
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module, keyAppends));
         return rScoredSortedSet.size();
      }
   }

   public long getScore(RankDefine.RankModule module, int value, String... keyAppends) {
      long score = 0L;

      try {
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module, keyAppends));
         Double redisScore = rScoredSortedSet.getScore(value);
         if (redisScore == null) {
            return score;
         }

         score = redisScore.longValue();
         if (module.sortByTime) {
            score = (long)MiscUtil.getHiParam(score);
         }
      } catch (Exception e) {
         e.printStackTrace();
         this.logger.error("redis getScore error,change to custom rank manage,error info:{}", e.getMessage());
      }

      return score;
   }

   public int getRank(RankDefine.RankModule module, int value, String... keyAppends) {
      Integer rank = null;

      try {
         rank = this.getRank(this.getRedisKey(module, keyAppends), value);
      } catch (Exception e) {
         e.printStackTrace();
         this.logger.error("redis getRank error,change to custom rank manage,error info:{}", e.getMessage());
      }

      return rank == null ? 0 : rank;
   }

   public int getRank(String key, int value) {
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(key);
      Integer rank = rScoredSortedSet.revRank(value);
      return rank == null ? 0 : rank + 1;
   }

   public void updateRank(RankDefine.RankModule module, long score, int value, String... keyAppends) {
      if (module.sortByTime) {
         score = MiscUtil.comboInteger((int)score, Integer.MAX_VALUE - DateUtil.getIntTime(System.currentTimeMillis()));
      }

      if (module.isCross) {
         if (!module.isPlayer) {
            return;
         }

         GamePlayer player = this.worldMgr.getPlayerById(value);
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), player.toUploadCrossPlayerBuilder().build());
         CrossRankMsg.S2CR_UpdateRank_10901.Builder builder = CrossRankMsg.S2CR_UpdateRank_10901.newBuilder();
         builder.setModuleId(module.id);
         builder.setScore(score);
         builder.setValue(value);
         if (keyAppends != null) {
            for(String keyAppend : keyAppends) {
               builder.addParams(keyAppend);
            }
         }

         crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), builder.build());
      } else {
         this.updateRank(this.getRedisKey(module, keyAppends), score, value);
      }

   }

   @TaskMethod
   public void updateRankEx(RankDefine.RankModule module, int score, int value) {
      this.updateRank(module, (long)score, value, (String[])null);
   }

   public void updateRankHigher(RankDefine.RankModule module, long score, int value, String... keyAppends) {
      if (this.getScore(module, value, keyAppends) < score) {
         this.updateRank(module, score, value, keyAppends);
      }

   }

   public List<RankData> getRanks(RankDefine.RankModule module, long scoreMin, long scoreMax, String... keyAppends) {
      if (module != RankDefine.RankModule.COMBAT_POWER) {
         throw new RuntimeException("当前仅支持战力类型的值区间排行");
      } else {
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module, keyAppends));
         Collection<ScoredEntry<Integer>> entryList = rScoredSortedSet.entryRange((double)scoreMin, true, (double)scoreMax, true);
         List<RankData> rankDataList = new ArrayList();
         if (entryList != null) {
            int rank = 0;

            for(ScoredEntry<Integer> integerScoredEntry : entryList) {
               ++rank;
               rankDataList.add(new RankData(integerScoredEntry.getScore().longValue(), rank, (Integer)integerScoredEntry.getValue()));
            }
         }

         return rankDataList;
      }
   }

   public List<RankData> getRanksByRank(RankDefine.RankModule module, int minRank, int maxRank, String... keyAppends) {
      List<RankData> rankDataList = new ArrayList();
      if (minRank > 0 && maxRank > 0) {
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module, keyAppends));
         Collection<ScoredEntry<Integer>> entryList = rScoredSortedSet.entryRangeReversed(minRank - 1, maxRank - 1);
         if (entryList != null) {
            int rank = minRank - 1;

            for(ScoredEntry<Integer> integerScoredEntry : entryList) {
               ++rank;
               if (!module.sortByTime) {
                  rankDataList.add(new RankData(integerScoredEntry.getScore().longValue(), rank, (Integer)integerScoredEntry.getValue()));
               } else {
                  int value = MiscUtil.getHiParam(integerScoredEntry.getScore().longValue());
                  rankDataList.add(new RankData((long)value, rank, (Integer)integerScoredEntry.getValue()));
               }
            }
         }

         return rankDataList;
      } else {
         return rankDataList;
      }
   }

   public void removeRank(RankDefine.RankModule module, int value, String... keyAppends) {
      this.removeRank(this.getRedisKey(module, keyAppends), value);
   }

   public void removeRanks(RankDefine.RankModule module, String... keyAppends) {
      this.removeRanks(this.getRedisKey(module, keyAppends));
   }

   public String getRedisKey(RankDefine.RankModule module, String... keyAppends) {
      StringBuilder stringBuilder = new StringBuilder();
      if (module.isCross) {
         throw new RuntimeException("跨服不在此处处理");
      } else {
         stringBuilder.append(this.getRankRedisKey()).append(":").append(module.name());
         if (keyAppends != null && keyAppends.length > 0) {
            for(String keyAppend : keyAppends) {
               stringBuilder.append(":").append(keyAppend);
            }
         }

         return stringBuilder.toString().toLowerCase();
      }
   }

   private String getRankRedisKey() {
      return this.worldMgr.PLATFORM_NAME + ":server_" + this.worldMgr.GAME_SERVER_ID + ":rank";
   }

   private void updateRank(String key, long score, int value) {
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(key);
      rScoredSortedSet.add((double)score, value);
   }

   private void removeRank(String key, int value) {
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(key);
      rScoredSortedSet.remove(value);
   }

   private void removeRanks(String key) {
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(key);
      rScoredSortedSet.delete();
   }

   @TaskMethod
   public void battlleChapterRanks(GamePlayer player, int playerRank) {
      BattleChapterMsg.S2C_ChapterRankResult_7210.Builder builder = BattleChapterMsg.S2C_ChapterRankResult_7210.newBuilder();
      builder.setMyRank(playerRank);

      for(RankData rankData : this.getRanks(RankDefine.RankModule.BATTLE_CHAPTER_CROSS, 100)) {
         BattleChapterMsg.RankInfo.Builder info_builder = BattleChapterMsg.RankInfo.newBuilder();
         info_builder.setRank(rankData.rank);
         GamePlayer rankPlayer = this.worldMgr.getPlayerById(rankData.value);
         PlayerPublicDao rankPlayerDao = rankPlayer.getPublicDao();
         info_builder.setPlayerId(rankData.value);
         info_builder.setLv(rankPlayerDao.lv);
         info_builder.setName(rankPlayerDao.playerName);
         info_builder.setHead(rankPlayerDao.head);
         info_builder.setCrossNum((int)rankData.score);
         builder.addInfos(info_builder);
      }

      player.sendMsg(builder.build());
   }

   public void grantRankAward(int typeId, RankDefine.RankModule rankModule, int module, int reason, String... keyAppends) {
      Map<Integer, Map<Integer, CentreAwardModel>> rewardMap = this.gameModelPool.getMap("customCentreAward");
      Map<Integer, CentreAwardModel> activityReward = (Map)rewardMap.get(typeId);
      if (activityReward != null && !activityReward.isEmpty()) {
         this.logger.info("发放排行奖励，类型={}，模块={}", typeId, rankModule.id);

         for(Map.Entry<Integer, CentreAwardModel> entry : activityReward.entrySet()) {
            int minRank = ((CentreAwardModel)entry.getValue()).getMinRank();
            int maxRank = ((CentreAwardModel)entry.getValue()).getMaxRank();
            List<RankData> rankDataList;
            if (rankModule != RankDefine.RankModule.RECRUIT_RUSH && rankModule != RankDefine.RankModule.RECRUITMENT_RUSH && rankModule != RankDefine.RankModule.STONE_RUSH) {
               rankDataList = this.getRanksByRank(rankModule, minRank, maxRank, keyAppends);
            } else {
               rankDataList = this.getMergeRushRanksByRank(rankModule, minRank, maxRank);
            }

            Map<Integer, String> needPlayerRank = new HashMap();

            for(RankData data : rankDataList) {
               if ((rankModule == RankDefine.RankModule.RECRUIT_RUSH || rankModule == RankDefine.RankModule.RECRUITMENT_RUSH || rankModule == RankDefine.RankModule.STONE_RUSH) && data.rank <= 100) {
                  this.logger.info("RankModule={},rank={},playerId={},score={}", new Object[]{rankModule.id, data.rank, data.value, this.getScore(rankModule, data.value)});
               }

               GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.value);
               if (gamePlayer != null && !gamePlayer.isRobot()) {
                  if (gamePlayer.isLogin()) {
                     String format = MessageFormat.format(((CentreAwardModel)entry.getValue()).getDesc(), data.rank);
                     gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), format, ((CentreAwardModel)entry.getValue()).getItems(), 604800000L, module, reason});
                     gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, ((CentreAwardModel)entry.getValue()).getTitle(), ((CentreAwardModel)entry.getValue()).getMinRank() + "-" + ((CentreAwardModel)entry.getValue()).getMaxRank(), ((CentreAwardModel)entry.getValue()).getMinRank() + "-" + ((CentreAwardModel)entry.getValue()).getMaxRank(), 0, 0, 0);
                     if (rankModule == RankDefine.RankModule.WAR_JZ_PASS) {
                        gamePlayer.pushPartTaskEx(JingzhouWarPart.class, "clearWeekPass", new Object[0]);
                     }
                  } else {
                     needPlayerRank.put(data.value, String.valueOf(data.rank));
                  }

                  if (data.rank <= 10 && rankModule == RankDefine.RankModule.WAR_JZ_PASS) {
                     gamePlayer.pushTask(() -> gamePlayer.triggerTask(319, data.rank, 1L, 2));
                  }
               }
            }

            if (needPlayerRank.size() > 0) {
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), ((CentreAwardModel)entry.getValue()).getDesc(), ((CentreAwardModel)entry.getValue()).getItems(), needPlayerRank, 604800000L, module, reason, 0);
            }
         }

      }
   }

   public void sendWarRankAward() {
      this.grantRankAward(CentreAwardModel.TYPE_JING_ZHOU, RankDefine.RankModule.WAR_JZ_PASS, 28, 2111);
      this.removeRanks(RankDefine.RankModule.WAR_JZ_PASS);
   }

   public void sendWarHlRankAward() {
      this.grantRankAward(CentreAwardModel.TYPE_HL, RankDefine.RankModule.WAR_HL_FLOOR, 21, 2119);
      this.removeHLRank();
   }

   public void removeHLRank() {
      int rankSize = this.getRankSize(RankDefine.RankModule.WAR_HL_FLOOR);
      List<RankData> rankDataList = this.getRanks(RankDefine.RankModule.WAR_HL_FLOOR, rankSize);
      List<Integer> tempList = new ArrayList();

      for(RankData rankData : rankDataList) {
         int playerId = rankData.value;
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
         if (gamePlayer == null) {
            tempList.add(playerId);
         } else if (gamePlayer.getPublicDao().logoutTime != 0L && gamePlayer.getPublicDao().logoutTime < System.currentTimeMillis() - 604800000L) {
            tempList.add(playerId);
         }
      }

      if (!tempList.isEmpty()) {
         this.removeRank(RankDefine.RankModule.WAR_HL_FLOOR, tempList);
      }

   }

   public void removeRank(RankDefine.RankModule module, List<Integer> value, String... keyAppends) {
      String key = this.getRedisKey(module, keyAppends);
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(key);
      rScoredSortedSet.removeAll(value);
   }

   public void clearPvpRedis(RankDefine.RankModule module) {
      String redisKey = this.getRedisKey(module);
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(redisKey);
      rScoredSortedSet.removeAll(rScoredSortedSet.readAll());
   }

   public void gmOp(int gmStatus) {
      if (gmStatus != 100 && gmStatus != 0) {
         if (gmStatus == 1) {
            int reason = 4402;
            int limitRank = this.configManager.getIntDefault("rankMemberNum", 20);
            int limitScore = this.configManager.getIntDefault("powerRankCondition", 50000);
            this.sendOpenServerRankAward(33, 38, RankDefine.RankModule.OPEN_SERVER_POWER, 28, reason, limitScore, 1, limitRank);
            limitScore = this.configManager.getIntDefault("levelRankCondition", 20);
            this.sendOpenServerRankAward(34, 39, RankDefine.RankModule.OPEN_SERVER_LEV, 29, reason, limitScore, 1, limitRank);
            limitScore = this.configManager.getIntDefault("employeeRankCondition", 10);
            this.sendOpenServerRankAward(35, 40, RankDefine.RankModule.OPEN_SERVER_RECRUIT, 30, reason, limitScore, 1, limitRank);
            limitScore = this.configManager.getIntDefault("recruitRankCondition", 10);
            this.sendOpenServerRankAward(36, 41, RankDefine.RankModule.OPEN_SERVER_ASSEMBLE, 31, reason, limitScore, 1, limitRank);
            limitScore = this.configManager.getIntDefault("towerRankCondition", 10);
            this.sendOpenServerRankAward(37, 42, RankDefine.RankModule.OPEN_SERVER_TOWER, 32, reason, limitScore, 1, limitRank);
         } else if (gmStatus == 2) {
            this.removeRanks(RankDefine.RankModule.OPEN_SERVER_HERO_LEV);
         }
      } else {
         this.gmOpenServer = gmStatus;
      }

   }

   public void sendOpenServerRankAward(int typeId, int commonType, RankDefine.RankModule rankModule, int module, int reason, int limitScore, int commonScore, int limitRank, String... keyAppends) {
      List<RankData> rankDataList = this.getOpenServerRanks(rankModule, keyAppends);
      Map<Integer, String> commonPlayerRank = new HashMap();

      for(RankData data : rankDataList) {
         if (data.score >= (long)commonScore) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(data.value);
            if (gamePlayer != null) {
               if (data.rank <= limitRank && data.score >= (long)limitScore) {
                  CentreAwardModel rewardModel = this.getCentreAwardModel(typeId, (long)data.rank);
                  String format = MessageFormat.format(rewardModel.getDesc(), data.rank);
                  gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), format, rewardModel.getItems(), 604800000L, module, reason});
                  gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "开服冲榜", "开服冲榜-" + rankModule.id + "-" + typeId, "-", 0, 0, 1);
               } else if (gamePlayer.isLogin()) {
                  MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                  CentreAwardModel rewardModel = this.getCentreAwardModel(commonType, 1L);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, module, reason);
                  gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "开服冲榜", "开服冲榜-" + rankModule.id + "-" + commonType, "-", 0, 0, 1);
               } else {
                  commonPlayerRank.put(data.value, String.valueOf(data.rank));
               }
            }
         }
      }

      if (commonPlayerRank.size() > 0) {
         CentreAwardModel rewardModel = this.getCentreAwardModel(commonType, 1L);
         this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), commonPlayerRank, 604800000L, module, reason, 0);
      }

   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.gameModelPool.getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel value : rewardMap.values()) {
         if ((long)value.getMinRank() <= rank && (long)value.getMaxRank() >= rank) {
            rewardModel = value;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   public List<RankData> getOpenServerRanks(RankDefine.RankModule module, String... keyAppends) {
      if (module == null) {
         throw new RuntimeException("redis key 不能为空!");
      } else {
         List<RankData> rankDataList = new ArrayList();
         RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(module, keyAppends));
         Collection<ScoredEntry<Integer>> rankCollection = rScoredSortedSet.entryRangeReversed(0, rScoredSortedSet.size() - 1);
         int rank = 0;

         for(ScoredEntry<Integer> scoredEntry : rankCollection) {
            ++rank;
            if (!module.sortByTime) {
               rankDataList.add(new RankData(scoredEntry.getScore().longValue(), rank, (Integer)scoredEntry.getValue()));
            } else {
               int value = MiscUtil.getHiParam(scoredEntry.getScore().longValue());
               rankDataList.add(new RankData((long)value, rank, (Integer)scoredEntry.getValue()));
            }
         }

         return rankDataList;
      }
   }

   public void removeOpenServerRank(int activityId) {
      if (activityId == 3001) {
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_LEV);
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_RECRUIT);
         this.logger.info("开服冲榜清除第一期活动数据");
      } else if (activityId == 3003) {
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_POWER);
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_ASSEMBLE);
         this.logger.info("开服冲榜清除第二期活动数据");
      } else if (activityId == 3004) {
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_TOWER);
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_UNDER_PALACE);
         this.logger.info("开服冲榜清除第三期活动数据");
      } else if (activityId == 3005) {
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_HERO_LEV);
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_RECRUIT);
         this.logger.info("开服冲榜清除第四期活动数据");
      }

   }

   public void removeLaborOpenServerRank(int activityId) {
      if (activityId == 3012) {
         this.removeRanks(RankDefine.RankModule.OPEN_SERVER_ASSEMBLE);
         this.logger.info("五一开服冲榜清除活动数据");
      }

   }

   @TaskMethod
   public void updateRankHigherEx(RankDefine.RankModule module, long score, int value) {
      this.updateRankHigher(module, score, value);
   }

   @TaskMethod
   public void grantRankAwardEx(int typeId, RankDefine.RankModule rankModule, int module, int reason) {
      this.grantRankAward(typeId, rankModule, module, reason);
   }

   public void sendDayHurtAward() {
      List<RankData> rankDataList = this.getRanks(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, 100);
      if (rankDataList != null && !rankDataList.isEmpty()) {
         this.grantRankAward(CentreAwardModel.DEMON_ACTIVITY_DAY_HURT, RankDefine.RankModule.DEMON_BOSS_DAY_HURT, 67, 6701);
      }
   }

   public void sendRotateDayHurtAward() {
      List<RankData> rankDataList = this.getRanks(RankDefine.RankModule.DEMON_ROTATE_BOSS_DAY_HURT, 100);
      if (rankDataList != null && !rankDataList.isEmpty()) {
         this.grantRankAward(CentreAwardModel.DEMON_ACTIVITY_DAY_HURT, RankDefine.RankModule.DEMON_ROTATE_BOSS_DAY_HURT, 67, 6701);
      }
   }

   public void sendTotalPointAward() {
      List<RankData> rankDataList = this.getRanks(RankDefine.RankModule.DEMON_COPY_POINT, 100);
      if (rankDataList != null && !rankDataList.isEmpty()) {
         this.grantRankAward(CentreAwardModel.DEMON_ACTIVITY_TOTAL_POINT, RankDefine.RankModule.DEMON_COPY_POINT, 67, 6702);
         this.removeRanks(RankDefine.RankModule.DEMON_COPY_POINT);
      }
   }

   public void sendLastAward() {
      this.sendTotalPointAward();
   }

   public void sendDemonRotateTotalPointAward() {
      List<RankData> rankDataList = this.getRanks(RankDefine.RankModule.DEMON_ROTATE_COPY_POINT, 100);
      if (rankDataList != null && !rankDataList.isEmpty()) {
         this.grantRankAward(CentreAwardModel.DEMON_ACTIVITY_TOTAL_POINT, RankDefine.RankModule.DEMON_ROTATE_COPY_POINT, 67, 6702);
         this.removeRanks(RankDefine.RankModule.DEMON_ROTATE_COPY_POINT);
      }
   }

   public void sendDemonRotateLastAward() {
      this.sendDemonRotateTotalPointAward();
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      int limitCount = 99999;
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.COMBAT_POWER);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.HERO_TRAINING);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.BATTLE_TOWER);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.PLAYER_LV);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.BATTLE_CHAPTER_CROSS);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.UNDER_PALACE);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.TRAIL_TOWER);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.WAR_NORTH);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.WAR_HL_FLOOR);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.WAR_JZ_PASS);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.FAIRYLAND_BATTLE);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.WECHAT_INVITE);
      this.mergeInSlaveRankToMain(mainServerId, 99999, RankDefine.RankModule.S_VIP_INVITE);
   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      this.unionMgrParent.updateCombatPower();
   }

   public void mergeInSlaveRankToMain(int mainServerId, int limitCount, RankDefine.RankModule rankModule, String... keyAppends) throws Exception {
      Map<Integer, Double> addAllMap = new HashMap();
      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(this.getRedisKey(rankModule, keyAppends));

      for(ScoredEntry<Integer> scoredEntry : rScoredSortedSet.entryRangeReversed(0, limitCount - 1)) {
         addAllMap.put(scoredEntry.getValue(), scoredEntry.getScore());
      }

      if (!addAllMap.isEmpty()) {
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append(this.worldMgr.PLATFORM_NAME).append(":server_").append(mainServerId).append(":rank").append(":").append(rankModule.name());
         if (keyAppends != null && keyAppends.length > 0) {
            for(String keyAppend : keyAppends) {
               stringBuilder.append(":").append(keyAppend);
            }
         }

         RScoredSortedSet<Integer> mainSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(stringBuilder.toString().toLowerCase());

         try {
            mainSortedSet.addAll(addAllMap);
         } catch (Exception e) {
            mainSortedSet.removeAll(addAllMap.keySet());
            throw new Exception("mergeInSlaveRankToMain fail,add result is not equal add count,execute rollback! exception:" + e.getMessage());
         }

         this.logger.info(String.format("success merge rank: %s,slave: %d,main: %d, ", rankModule.name(), this.worldMgr.GAME_SERVER_ID, mainServerId));
         this.gameModelPool.systemOperationLog(String.format("success merge rank: %s,slave: %d,main: %d, ", rankModule.name(), this.worldMgr.GAME_SERVER_ID, mainServerId), System.currentTimeMillis());
      }
   }

   public Map<Integer, HeroNationRankDao> getHeroNationRankMap() {
      return this.gameCachePool.getAllTableByMap("tb_hero_nation_rank");
   }
}
