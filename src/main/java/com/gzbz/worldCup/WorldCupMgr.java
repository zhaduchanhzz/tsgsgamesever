package com.gzbz.worldCup;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.WorldCupDao;
import com.gzbz.db.bean.WorldCupData;
import com.gzbz.db.bean.WorldCupGuessData;
import com.gzbz.db.bean.WorldCupMatch;
import com.gzbz.db.bean.WorldCupResult;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.WorldCupCountryModel;
import com.gzbz.model.WorldCupMainModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.WorldCupMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class WorldCupMgr extends GameMgr {
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   @Autowired
   ActivityMgr activityMgr;
   @Autowired
   OnLineMgr onLineMgr;

   protected void init() throws Exception {
   }

   public void initData() {
      this.getWorldCupDaoMap();
   }

   @TaskMethod
   public void insertMatchInfo(List<WorldCupMatch> params) {
      logger.info("【世界杯】收到发送的场次数据");
      Set<Integer> matchSet = new HashSet();

      for(WorldCupMatch worldCupMatch : params) {
         logger.info("{}", worldCupMatch);
         this.insertWorldCupDao(worldCupMatch);
         matchSet.add(worldCupMatch.id);
      }

      this.sendNewMatchInfo(matchSet);
   }

   @TaskMethod
   public void setMatchResult(List<WorldCupResult> params) {
      logger.info("【世界杯】收到发送的比赛结果 {}", params);
      List<CommonMsg.MapDataII> resultList = new ArrayList();

      for(WorldCupResult worldCupResult : params) {
         logger.info("场次:{} 获胜队伍序号:{}", worldCupResult.id, worldCupResult.result);
         WorldCupDao worldCupDao = this.getWorldCupDao(worldCupResult.id);
         if (worldCupDao != null && worldCupDao.worldCupData != null) {
            this.setResult(worldCupResult.id, worldCupResult.result);
            resultList.add(CommonMsg.MapDataII.newBuilder().setKey(worldCupResult.id).setValue(worldCupResult.result).build());
         }
      }

      if (resultList.size() > 0) {
         WorldCupMsg.S2C_UpdateResult_23024.Builder builder = WorldCupMsg.S2C_UpdateResult_23024.newBuilder();
         builder.addAllResult(resultList);
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      }

   }

   @TaskMethod
   public void hourReset(int currentHour) {
      ActivityInfo activityInfo = this.activityMgr.getActivityInfo(95);
      if (activityInfo != null && activityInfo.open) {
         int updateHour = ApplicationContextProvider.getConfigInt("WorldCupRefreshTime", 6);
         int rewardHour = ApplicationContextProvider.getConfigInt("WorldCupRewardTime", 15);
         if (currentHour == updateHour) {
            this.refreshMatch();
         } else if (currentHour == rewardHour) {
            this.guessReward();
         }

      }
   }

   public Map<Integer, WorldCupDao> getWorldCupDaoMap() {
      return this.gameCachePool.getAllTableByMap("tb_worldCup");
   }

   public WorldCupDao getWorldCupDao(int id) {
      return (WorldCupDao)this.getWorldCupDaoMap().get(id);
   }

   private void insertWorldCupDao(WorldCupMatch worldCupMatch) {
      WorldCupMainModel worldCupMainModel = (WorldCupMainModel)ApplicationContextProvider.getModelPoolEntity("WorldCupMain", worldCupMatch.id);
      if (worldCupMainModel == null) {
         logger.error("插入比赛信息错误,场次信息{}不存在", worldCupMatch.id);
      } else {
         WorldCupCountryModel mainTeamModel = (WorldCupCountryModel)ApplicationContextProvider.getModelPoolEntity("WorldCupCountry", worldCupMatch.homeTeam);
         if (mainTeamModel == null) {
            logger.error("插入比赛信息错误,主队队伍信息{}不存在", worldCupMatch.homeTeam);
         } else {
            WorldCupCountryModel guestTeamModel = (WorldCupCountryModel)ApplicationContextProvider.getModelPoolEntity("WorldCupCountry", worldCupMatch.guestTeam);
            if (guestTeamModel == null) {
               logger.error("插入比赛信息错误,客队队伍信息{}不存在", worldCupMatch.guestTeam);
            } else {
               int oddsLimit = ApplicationContextProvider.getConfigInt("WorldCupOddsLimit", 50000);
               WorldCupDao worldCupDao = this.getWorldCupDao(worldCupMatch.id);
               if (worldCupDao != null) {
                  logger.info("【世界杯】已有赛事数据，覆盖更新，原有数据 id:{} homeTeam:{} guestTeam:{} odds:{}", new Object[]{worldCupDao.id, worldCupDao.worldCupData.teams.get(0), worldCupDao.worldCupData.teams.get(1), worldCupDao.worldCupData.odds});
                  if (!worldCupDao.worldCupData.teams.contains(worldCupMatch.homeTeam) || !worldCupDao.worldCupData.teams.contains(worldCupMatch.guestTeam)) {
                     this.switchTeams(worldCupDao, worldCupMatch.homeTeam, worldCupMatch.guestTeam);
                  }

                  worldCupDao.worldCupData.teams.clear();
                  worldCupDao.worldCupData.teams.add(worldCupMatch.homeTeam);
                  worldCupDao.worldCupData.teams.add(worldCupMatch.guestTeam);
                  worldCupDao.worldCupData.odds.clear();
                  worldCupDao.worldCupData.odds.add(Math.min(oddsLimit, worldCupMatch.homeOdds));
                  worldCupDao.worldCupData.odds.add(Math.min(oddsLimit, worldCupMatch.guestOdds));
                  worldCupDao.worldCupData.odds.add(Math.min(oddsLimit, worldCupMatch.drawOdds));
                  worldCupDao.updateOp();
               } else {
                  worldCupDao = new WorldCupDao();
                  worldCupDao.id = worldCupMatch.id;
                  WorldCupData worldCupData = new WorldCupData();
                  worldCupData.id = worldCupMatch.id;
                  worldCupData.teams.add(worldCupMatch.homeTeam);
                  worldCupData.teams.add(worldCupMatch.guestTeam);
                  worldCupData.odds.add(Math.min(oddsLimit, worldCupMatch.homeOdds));
                  worldCupData.odds.add(Math.min(oddsLimit, worldCupMatch.guestOdds));
                  worldCupData.odds.add(Math.min(oddsLimit, worldCupMatch.drawOdds));
                  worldCupDao.worldCupData = worldCupData;
                  this.gameCachePool.insertDao(worldCupDao, true);
               }

               logger.info("【世界杯】插入赛事数据 id:{} 主队:{} 客队:{} 赔率:{}", new Object[]{worldCupMatch.id, worldCupMatch.homeTeam, worldCupMatch.guestTeam, worldCupDao.worldCupData.odds});
            }
         }
      }
   }

   private void switchTeams(WorldCupDao worldCupDao, int newHomeTeam, int newGuessTeam) {
      if (worldCupDao != null && worldCupDao.worldCupData != null) {
         WorldCupData worldCupData = worldCupDao.worldCupData;
         int oriMainTeam = (Integer)worldCupData.teams.get(0);
         int oriGuestTeam = (Integer)worldCupData.teams.get(1);
         if (oriMainTeam != newHomeTeam || oriGuestTeam != newGuessTeam) {
            logger.info("【世界杯】插入的比赛主客队发生变化，需要修改原来的数据 场次:{} 原来主队:{}, 新主队:{} 原客队:{}, 新客队:{}", new Object[]{worldCupDao.id, oriMainTeam, newHomeTeam, oriGuestTeam, newGuessTeam});
            this.switchGuessData(worldCupData, oriMainTeam, newHomeTeam);
            this.switchGuessData(worldCupData, oriGuestTeam, newGuessTeam);
         }
      }
   }

   private void switchGuessData(WorldCupData worldCupData, int oriTeam, int newTeam) {
      Set<Integer> oriTotalSet = (Set)worldCupData.totalMap.getOrDefault(oriTeam, new HashSet());
      worldCupData.totalMap.put(newTeam, oriTotalSet);
      worldCupData.totalMap.remove(oriTeam);
      long oriTotalCoin = (Long)worldCupData.totalCoinMap.getOrDefault(oriTeam, 0L);
      worldCupData.totalCoinMap.put(newTeam, oriTotalCoin);
      worldCupData.totalCoinMap.remove(oriTeam);

      for(WorldCupGuessData worldCupGuessData : worldCupData.guessDataMap.values()) {
         if (worldCupGuessData.winId == oriTeam) {
            worldCupGuessData.winId = newTeam;
         }
      }

   }

   public void setResult(int id, int winId) {
      WorldCupDao worldCupDao = this.getWorldCupDao(id);
      if (worldCupDao == null) {
         logger.info("【世界杯】没有该场次竞猜数据 id:{}", id);
      } else if (winId != 0 && !worldCupDao.worldCupData.teams.contains(winId)) {
         logger.info("【世界杯】设置的结果有误，该场次没有此队伍 id:{} teams:{} winId:{}", new Object[]{id, worldCupDao.worldCupData.teams, winId});
      } else {
         worldCupDao.worldCupData.win = winId;
         worldCupDao.worldCupData.state = 2;
         worldCupDao.updateOp();
         logger.info("【世界杯】设置了场次胜负结果 场次id:{} 胜利队伍:{}", id, winId);
         this.checkGuessTask(id);
      }
   }

   @TaskMethod
   public void matchInfo(GamePlayer gamePlayer, int id) {
      WorldCupMsg.S2C_MatchInfos_23008.Builder builder = WorldCupMsg.S2C_MatchInfos_23008.newBuilder();
      Map<Integer, WorldCupDao> worldCupDaoMap = this.getWorldCupDaoMap();
      if (id == 0) {
         int updateHour = ApplicationContextProvider.getConfigInt("WorldCupRefreshTime", 6);
         Calendar calendar = Calendar.getInstance();
         calendar.set(11, updateHour);
         calendar.set(12, 0);
         calendar.set(13, 0);
         calendar.set(14, 0);
         long dayStartTime = 0L;
         if (System.currentTimeMillis() >= calendar.getTime().getTime()) {
            dayStartTime = DateUtil.getDayStartTimeStamp();
         } else {
            dayStartTime = DateUtil.getDayStartTimeStamp() - 86400000L;
         }

         for(WorldCupDao worldCupDao : worldCupDaoMap.values()) {
            WorldCupMainModel worldCupMainModel = (WorldCupMainModel)ApplicationContextProvider.getModelPoolEntity("WorldCupMain", worldCupDao.id);
            if (worldCupMainModel == null) {
               return;
            }

            long betTime = DateUtil.getLongTime(worldCupMainModel.getBetTime(), "yyyy-MM-dd");
            if (betTime == dayStartTime) {
               builder.addInfo(this.toMatchInfoBuilder(worldCupDao, gamePlayer.getPlayerId()));
            }
         }
      } else {
         WorldCupDao worldCupDao = (WorldCupDao)worldCupDaoMap.get(id);
         if (worldCupDao != null) {
            builder.addInfo(this.toMatchInfoBuilder(worldCupDao, gamePlayer.getPlayerId()));
         }
      }

      gamePlayer.sendMsg(builder.build());
   }

   @TaskMethod
   public void guess(GamePlayer gamePlayer, WorldCupMsg.GuessInfo guessInfoMsg) {
      int id = guessInfoMsg.getId();
      WorldCupDao worldCupDao = this.getWorldCupDao(id);
      if (worldCupDao != null && worldCupDao.worldCupData != null) {
         if (worldCupDao.worldCupData.win != -1) {
            logger.info("【世界杯】比赛结果已确定，不可再竞猜 id:{} win:{}", worldCupDao.worldCupData.id, worldCupDao.worldCupData.win);
            gamePlayer.failure(76305);
         } else if (worldCupDao.worldCupData.guessDataMap.containsKey(gamePlayer.getPlayerId())) {
            gamePlayer.failure(76303);
         } else {
            WorldCupMainModel worldCupMainModel = (WorldCupMainModel)ApplicationContextProvider.getModelPoolEntity("WorldCupMain", id);
            if (worldCupMainModel != null) {
               int offsetSec = ApplicationContextProvider.getConfigInt("WorldCupTimeLimit", 0);
               long betTime = DateUtil.getLongTime(worldCupMainModel.getBetTime(), "yyyy-MM-dd");
               long raceTime = DateUtil.getLongTime(worldCupMainModel.getRaceTime(), "yyyy-MM-dd HH:mm:ss");
               long curTime = System.currentTimeMillis();
               if (curTime > betTime && curTime < raceTime - (long)offsetSec * 1000L) {
                  int winId = guessInfoMsg.getWinId();
                  if (winId != 0 && !worldCupDao.worldCupData.teams.contains(winId)) {
                     gamePlayer.failure(76302);
                  } else {
                     WorldCupGuessData guessData = new WorldCupGuessData();
                     guessData.winId = winId;
                     guessData.wagerNum = guessInfoMsg.getWager();
                     worldCupDao.worldCupData.guessDataMap.put(gamePlayer.getPlayerId(), guessData);
                     ((Set)worldCupDao.worldCupData.totalMap.computeIfAbsent(winId, (v) -> new HashSet())).add(gamePlayer.getPlayerId());
                     long coins = (Long)worldCupDao.worldCupData.totalCoinMap.getOrDefault(winId, 0L);
                     worldCupDao.worldCupData.totalCoinMap.put(winId, coins + (long)guessInfoMsg.getWager());
                     worldCupDao.updateOp();
                     gamePlayer.pushTask(() -> {
                        int itemId = ApplicationContextProvider.getConfigInt("worldCupGuessItemId", 6991);
                        gamePlayer.delResource(2, itemId, (long)guessInfoMsg.getWager(), 132, 13204, 0, 0, "");
                        gamePlayer.triggerTask(730, 0, 1L, 1);
                        WorldCupMsg.S2C_GuessWin_23004.Builder builder = WorldCupMsg.S2C_GuessWin_23004.newBuilder();
                        builder.setGuessInfo(guessInfoMsg);
                        gamePlayer.sendMsg(builder.build());
                     });
                     WorldCupMsg.S2C_UpateTotalGuessCoin_23026.Builder msg = WorldCupMsg.S2C_UpateTotalGuessCoin_23026.newBuilder();
                     msg.setId(id);

                     for(int teamId : worldCupDao.worldCupData.teams) {
                        msg.addTotalGuessCoin((Long)worldCupDao.worldCupData.totalCoinMap.getOrDefault(teamId, 0L));
                     }

                     msg.addTotalGuessCoin((Long)worldCupDao.worldCupData.totalCoinMap.getOrDefault(0, 0L));
                     this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg.build()});
                  }
               } else {
                  gamePlayer.failure(76301);
               }
            }
         }
      }
   }

   @TaskMethod
   public void guessRecord(GamePlayer gamePlayer) {
      WorldCupMsg.S2C_GuessRecord_23022.Builder builder = WorldCupMsg.S2C_GuessRecord_23022.newBuilder();
      Map<Integer, WorldCupDao> worldCupDaoMap = this.getWorldCupDaoMap();

      for(Map.Entry<Integer, WorldCupDao> entry : worldCupDaoMap.entrySet()) {
         WorldCupDao worldCupDao = (WorldCupDao)entry.getValue();
         if (worldCupDao.worldCupData != null && worldCupDao.worldCupData.guessDataMap.containsKey(gamePlayer.getPlayerId()) && worldCupDao.worldCupData.win != -1) {
            WorldCupMsg.CellMatchInfo matchInfo = this.toMatchInfoBuilder(worldCupDao, gamePlayer.getPlayerId());
            builder.addInfo(matchInfo);
         }
      }

      gamePlayer.sendMsg(builder.build());
   }

   private WorldCupMsg.CellMatchInfo toMatchInfoBuilder(WorldCupDao worldCupDao, int playerId) {
      WorldCupMsg.CellMatchInfo.Builder matchInfoMsg = WorldCupMsg.CellMatchInfo.newBuilder();
      matchInfoMsg.setId(worldCupDao.id);
      matchInfoMsg.addAllTeams(worldCupDao.worldCupData.teams);
      matchInfoMsg.addAllOdds(worldCupDao.worldCupData.odds);
      WorldCupGuessData guessData = (WorldCupGuessData)worldCupDao.worldCupData.guessDataMap.get(playerId);
      matchInfoMsg.setWinId(worldCupDao.worldCupData.win);
      if (guessData != null) {
         WorldCupMsg.GuessInfo.Builder guessInfoMsg = WorldCupMsg.GuessInfo.newBuilder();
         guessInfoMsg.setId(worldCupDao.id);
         guessInfoMsg.setWinId(guessData.winId);
         guessInfoMsg.setWager(guessData.wagerNum);
         matchInfoMsg.setGuessInfo(guessInfoMsg);
      }

      int offsetSec = ApplicationContextProvider.getConfigInt("WorldCupTimeLimit", 0);
      WorldCupMainModel worldCupMainModel = (WorldCupMainModel)ApplicationContextProvider.getModelPoolEntity("WorldCupMain", worldCupDao.id);
      long raceTime = DateUtil.getLongTime(worldCupMainModel.getRaceTime(), "yyyy-MM-dd HH:mm:ss");
      int guessEndTime = DateUtil.getIntTime(raceTime) - offsetSec;
      matchInfoMsg.setGuessEndTime(guessEndTime);

      for(int teamId : worldCupDao.worldCupData.teams) {
         matchInfoMsg.addTotalGuessCoin((Long)worldCupDao.worldCupData.totalCoinMap.getOrDefault(teamId, 0L));
      }

      matchInfoMsg.addTotalGuessCoin((Long)worldCupDao.worldCupData.totalCoinMap.getOrDefault(0, 0L));
      return matchInfoMsg.build();
   }

   @TaskMethod
   public void refreshMatch() {
      Set<Integer> matchSet = new HashSet();
      int offsetSec = ApplicationContextProvider.getConfigInt("WorldCupTimeLimit", 0);
      Map<Integer, WorldCupMainModel> modelMap = ApplicationContextProvider.<Integer, WorldCupMainModel>getModelPoolMap("WorldCupMain");

      for(WorldCupMainModel worldCupMainModel : modelMap.values()) {
         WorldCupDao worldCupDao = this.getWorldCupDao(worldCupMainModel.getId());
         if (worldCupDao == null) {
            long betTime = DateUtil.getLongTime(worldCupMainModel.getBetTime(), "yyyy-MM-dd");
            long raceTime = DateUtil.getLongTime(worldCupMainModel.getRaceTime(), "yyyy-MM-dd HH:mm:ss");
            if (this.duringTheTimePeriod(betTime, raceTime - (long)offsetSec)) {
               WorldCupMatch worldCupMatch = new WorldCupMatch();
               worldCupMatch.id = worldCupMainModel.getId();
               worldCupMatch.homeTeam = worldCupMainModel.getHomeTeam();
               worldCupMatch.guestTeam = worldCupMainModel.getGuestTeam();
               worldCupMatch.homeOdds = (Integer)worldCupMainModel.getOdds().get(0);
               worldCupMatch.guestOdds = (Integer)worldCupMainModel.getOdds().get(1);
               worldCupMatch.drawOdds = (Integer)worldCupMainModel.getOdds().get(2);
               this.insertWorldCupDao(worldCupMatch);
               matchSet.add(worldCupMainModel.getId());
            }
         }
      }

      this.sendNewMatchInfo(matchSet);
   }

   private boolean duringTheTimePeriod(long startTime, long endTime) {
      long curTime = System.currentTimeMillis();
      return curTime >= startTime && curTime < endTime;
   }

   @TaskMethod
   public void guessReward() {
      int itemId = ApplicationContextProvider.getConfigInt("worldCupGuessItemId", 6991);
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardModelTreeMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_WORLD_CUP_REWARD);
      CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelTreeMap.firstEntry().getValue();
      Map<Integer, WorldCupDao> worldCupDaoMap = this.getWorldCupDaoMap();

      for(WorldCupDao worldCupDao : worldCupDaoMap.values()) {
         WorldCupData worldCupData = worldCupDao.worldCupData;
         if (worldCupData.state == 2) {
            worldCupData.state = 3;
            worldCupDao.updateOp();
            Set<Integer> playerSet = (Set)worldCupData.totalMap.get(worldCupData.win);
            if (playerSet != null && playerSet.size() != 0) {
               WorldCupMainModel worldCupMainModel = (WorldCupMainModel)ApplicationContextProvider.getModelPoolEntity("WorldCupMain", worldCupDao.id);
               if (worldCupMainModel != null) {
                  WorldCupCountryModel mainCountryModel = (WorldCupCountryModel)ApplicationContextProvider.getModelPoolEntity("WorldCupCountry", (Integer)worldCupData.teams.get(0));
                  WorldCupCountryModel guestCountryModel = (WorldCupCountryModel)ApplicationContextProvider.getModelPoolEntity("WorldCupCountry", (Integer)worldCupData.teams.get(1));
                  if (mainCountryModel != null && guestCountryModel != null) {
                     for(Integer playerId : playerSet) {
                        WorldCupGuessData worldCupGuessData = (WorldCupGuessData)worldCupData.guessDataMap.get(playerId);
                        if (worldCupGuessData != null && worldCupGuessData.wagerNum > 0) {
                           GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                           if (gamePlayer != null) {
                              BigDecimal bigDecimal = BigDecimal.valueOf(worldCupData.resultOdds()).multiply(BigDecimal.valueOf((long)worldCupGuessData.wagerNum));
                              int winWager = bigDecimal.intValue();
                              List<ResourceModel> rewards = new ArrayList();
                              rewards.add(new ResourceModel(2, itemId, winWager));
                              String matchResultDesc = this.getMatchResultDesc(worldCupData.win, worldCupData.teams);
                              String format = MessageFormat.format(centreAwardModel.getDesc(), mainCountryModel.getDesc(), guestCountryModel.getDesc(), matchResultDesc, worldCupGuessData.wagerNum, worldCupData.resultOdds(), winWager);
                              if (gamePlayer.isLogin()) {
                                 MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                                 mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, rewards, 604800000L, 132, 13203});
                              } else {
                                 Map<Integer, String> offlinePlayerRewardMap = new HashMap();
                                 offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), "");
                                 this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, rewards, offlinePlayerRewardMap, 604800000L, 132, 13203, 0);
                              }
                           }
                        }
                     }
                  } else {
                     logger.info("【世界杯】比赛的队伍数据错误 id:{} team:{}", worldCupDao.id, worldCupData.teams);
                  }
               }
            }
         }
      }

   }

   private void checkGuessTask(int id) {
      WorldCupDao worldCupDao = this.getWorldCupDao(id);
      if (worldCupDao != null && worldCupDao.worldCupData != null) {
         Set<Integer> playerSet = (Set)worldCupDao.worldCupData.totalMap.get(worldCupDao.worldCupData.win);
         if (playerSet != null && playerSet.size() != 0) {
            for(int playerId : playerSet) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null) {
                  gamePlayer.pushTask(() -> gamePlayer.triggerTask(731, 0, 1L, 1));
               }
            }

         }
      }
   }

   private void sendNewMatchInfo(Set<Integer> matchSet) {
      List<WorldCupMsg.CellMatchInfo> matchInfos = new ArrayList();

      for(int id : matchSet) {
         WorldCupDao worldCupDao = this.getWorldCupDao(id);
         if (worldCupDao != null && worldCupDao.worldCupData != null) {
            matchInfos.add(this.toMatchInfoBuilder(worldCupDao, 0));
         }
      }

      if (matchInfos.size() > 0) {
         WorldCupMsg.S2C_NewMatchInfo_23018.Builder builder = WorldCupMsg.S2C_NewMatchInfo_23018.newBuilder();
         builder.addAllInfo(matchInfos);
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      }

   }

   private String getMatchResultDesc(int winId, List<Integer> teamList) {
      String worldCupResultDesc = ApplicationContextProvider.getConfigString("worldCupResultDesc", "主场胜|客场胜|平局");
      String[] split = worldCupResultDesc.split("\\|");
      if (split.length == 3 && teamList.size() == 2) {
         if (winId == 0) {
            return split[2];
         } else {
            int index = teamList.indexOf(winId);
            return index != -1 ? split[index] : "";
         }
      } else {
         return "";
      }
   }

   @TaskMethod
   public void setOdds(int id, int homeOdds, int guestOdds, int drawOdds) {
      WorldCupDao worldCupDao = this.getWorldCupDao(id);
      if (worldCupDao == null) {
         logger.warn("【世界杯】没有该场次竞猜数据 id:{}", id);
      } else {
         List<Integer> oddsList = new ArrayList();
         oddsList.add(homeOdds);
         oddsList.add(guestOdds);
         oddsList.add(drawOdds);
         worldCupDao.worldCupData.odds.clear();
         worldCupDao.worldCupData.odds.addAll(oddsList);
         worldCupDao.updateOp();
         logger.info("【世界杯】场次赔率调整 id:{} 主队胜:{}->{} 主队负:{}->{} 平局:{}->{}", new Object[]{id, worldCupDao.worldCupData.odds.get(0), homeOdds, worldCupDao.worldCupData.odds.get(1), guestOdds, worldCupDao.worldCupData.odds.get(2), drawOdds});
         WorldCupMsg.S2C_UpdateOdds_23020.Builder builder = WorldCupMsg.S2C_UpdateOdds_23020.newBuilder();
         builder.setId(id);
         builder.addAllOdds(oddsList);
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      }
   }

   @TaskMethod
   public void gmSetState(int id, int state) {
      WorldCupDao worldCupDao = this.getWorldCupDao(id);
      if (worldCupDao != null) {
         worldCupDao.worldCupData.state = (byte)state;
         worldCupDao.updateOp();
      }

   }

   @TaskMethod
   public void gmClearGuess(int id, int playerId) {
      Map<Integer, WorldCupDao> worldCupDaoMap = this.getWorldCupDaoMap();
      if (id == 0) {
         for(WorldCupDao worldCupDao : worldCupDaoMap.values()) {
            this.gmClearGuess(worldCupDao, playerId);
         }
      } else {
         WorldCupDao worldCupDao = (WorldCupDao)worldCupDaoMap.get(id);
         this.gmClearGuess(worldCupDao, playerId);
      }

   }

   private void gmClearGuess(WorldCupDao worldCupDao, int playerId) {
      if (playerId == 0) {
         worldCupDao.worldCupData.guessDataMap.clear();
         worldCupDao.worldCupData.totalCoinMap.clear();
         worldCupDao.worldCupData.totalMap.clear();
      } else {
         worldCupDao.worldCupData.guessDataMap.remove(playerId);
         worldCupDao.worldCupData.totalCoinMap.remove(playerId);
         worldCupDao.worldCupData.totalMap.remove(playerId);
      }

      worldCupDao.updateOp();
   }

   @TaskMethod
   public void gmDeletematch(int id) {
      WorldCupDao worldCupDao = this.getWorldCupDao(id);
      if (worldCupDao != null) {
         logger.info("【世界杯】删除指定比赛 id:{}", id);
         this.gameCachePool.deleteDao(worldCupDao, true);
      }

   }
}
