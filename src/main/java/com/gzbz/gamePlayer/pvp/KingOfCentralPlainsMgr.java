package com.gzbz.gamePlayer.pvp;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import cn.hutool.core.util.NumberUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.db.BattleRecordDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PvpDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.FightData;
import com.gzbz.db.bean.FightPlayerData;
import com.gzbz.db.bean.GuessData;
import com.gzbz.db.worldBean.KingOfCentralPlainsData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.PvpDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.KingOfCentralPlainsMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;

import java.text.MessageFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class KingOfCentralPlainsMgr extends GameMgr {
    Logger logger = LoggerFactory.getLogger(KingOfCentralPlainsMgr.class);
    @Autowired
    GameModelPool gameModelPool;
    @Autowired
    WorldMgr worldMgr;
    @Autowired
    PvpSeasonMgr pvpSeasonMgr;
    @Autowired
    RankMgr rankMgr;
    @Autowired
    BattleRecordMgr battleRecordMgr;
    @Autowired
    ConfigManager configManager;
    private Map<Integer, ArrayingMirror> arrayingMap = new HashMap();
    private boolean isTest = false;
    public Map<Integer, FightPlayerData> rankMap = new HashMap();

    protected void init() {
    }

    public void reset() {
        this.logger.info("问鼎中原每日重置");
        LocalDate date = LocalDate.now();
        if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
            this.logger.info("问鼎中原活动日={},修改状态", DateUtil.transferLongToDate());
            WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
            ((KingOfCentralPlainsData) worldDao.jsonData).activityState = 1;
            ((KingOfCentralPlainsData) worldDao.jsonData).round = 0;
            ((KingOfCentralPlainsData) worldDao.jsonData).state = 0;
            worldDao.updateOp();
        }

    }

    public void initData() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("服务器开启，初始化问鼎中原数据，状态={}，round={}，state={}，end={}", new Object[]{((KingOfCentralPlainsData) worldDao.jsonData).activityState, ((KingOfCentralPlainsData) worldDao.jsonData).round, ((KingOfCentralPlainsData) worldDao.jsonData).state, ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd});
        if (!((KingOfCentralPlainsData) worldDao.jsonData).players128.isEmpty()) {
            List<FightPlayerData> player128List = new ArrayList(((KingOfCentralPlainsData) worldDao.jsonData).players128.values());
            Collections.sort(player128List);
            Map<Integer, FightPlayerData> tempRankMap = new HashMap();

            for (int i = 0; i < player128List.size(); ++i) {
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(((FightPlayerData) player128List.get(i)).playerId)).rank = i + 1;
                tempRankMap.put(i + 1, player128List.get(i));
            }

            this.logger.info("战斗结束，重新处理排名，个数={}", tempRankMap.size());
            this.rankMap = tempRankMap;
        }

        int[] state = this.getActivityState();
        if (state[0] == 2) {
            this.logger.info("活动期间重启服务器，问鼎中原活动继续，时间={}", DateUtil.transferLongToDate());
            ((KingOfCentralPlainsData) worldDao.jsonData).activityState = 2;
            if (((KingOfCentralPlainsData) worldDao.jsonData).players128.size() >= 128) {
                this.initRunRound(((KingOfCentralPlainsData) worldDao.jsonData).round);
            }
        } else if (((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 0 && (((KingOfCentralPlainsData) worldDao.jsonData).round != 0 || ((KingOfCentralPlainsData) worldDao.jsonData).state != 0)) {
            this.logger.info("不在活动期内，但是活动已经开始过，继续直到结束");
            if (((KingOfCentralPlainsData) worldDao.jsonData).players128.size() >= 128) {
                this.initRunRound(((KingOfCentralPlainsData) worldDao.jsonData).round);
            }
        }

        worldDao.updateOp();
    }

    public void activityStart(boolean isTest, boolean isFast) {
        LocalDate localDate = LocalDate.now();
        if (System.currentTimeMillis() < this.worldMgr.getOpenServerTime()) {
            this.logger.info("没有到开服时间不能开启问鼎中原活动");
        } else if (DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
            this.logger.info("开服当天不能开启问鼎中原活动");
        } else {
            if (localDate.getDayOfWeek() == DayOfWeek.MONDAY || isTest) {
                this.logger.info("问鼎中原开始,时间={},是否是测试={}", DateUtil.transferLongToDate(System.currentTimeMillis()), isTest);
                WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
                this.clearActivity();
                this.isTest = isFast;
                ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd = 0;
                this.initActivityPlayers();
                if (((KingOfCentralPlainsData) worldDao.jsonData).players128.size() < 128) {
                    this.logger.info("抓取数据小于120个，size={}", ((KingOfCentralPlainsData) worldDao.jsonData).players128.size());
                    return;
                }

                ((KingOfCentralPlainsData) worldDao.jsonData).state = 0;
                ((KingOfCentralPlainsData) worldDao.jsonData).startTime = System.currentTimeMillis();
                ((KingOfCentralPlainsData) worldDao.jsonData).activityState = 2;
                worldDao.updateOp();

                for (Map.Entry<Integer, FightPlayerData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).players128.entrySet()) {
                    this.saveArrayingToCache((Integer) entry.getKey());
                }

                int round = 1;
                this.runRound(round);

                for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
                    if (gamePlayer.isSystemOpen(1500)) {
                        this.S2C_ActivityState_9652(gamePlayer);
                    }
                }
            }

        }
    }

    public void clearActivity() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.battleRecordMgr.delRecordOfRetainNeed(1500);
        this.arrayingMap.clear();
        this.isTest = false;

        for (Integer givePlainsPlayerId : ((KingOfCentralPlainsData) worldDao.jsonData).givePlainsPlayerIds) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(givePlainsPlayerId);
            gamePlayer.pushTaskEx("kingOfCp_clearActivity", new Object[0]);
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).givePlainsPlayerIds.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).guessPlayerIds.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).players128.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).guessData.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).map_trial.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).map_32.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).map_16.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).map_8.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).map_4.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).map_2.clear();
        ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd = 1;
        ((KingOfCentralPlainsData) worldDao.jsonData).startTime = 0L;
        ((KingOfCentralPlainsData) worldDao.jsonData).activityState = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).round = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).state = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).stepTime = System.currentTimeMillis();
        ((KingOfCentralPlainsData) worldDao.jsonData).leftOdds = (double) 1.75F;
        ((KingOfCentralPlainsData) worldDao.jsonData).rightOdds = (double) 1.75F;
        ((KingOfCentralPlainsData) worldDao.jsonData).leftWagerNum = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).rightWagerNum = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).totalWagerNum = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).loseScore.clear();
        worldDao.updateOp();

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.isSystemOpen(1500)) {
                this.S2C_ActivityState_9652(gamePlayer);
            }
        }

    }

    public void initActivityPlayers() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.PVP, 200);
        this.logger.info("PVP排行榜获取玩家={}", rankDataList.size());
        int num = 0;
        Map<Integer, FightPlayerData> tempRankMap = new HashMap();
        String heroRivalTrialTotalPoint = this.configManager.getStrByDefault("heroRivalTrialTotalPoint", "5000|5000");
        String[] heroRivalTrialTotalPointArray = heroRivalTrialTotalPoint.split("\\|");
        float f1 = Float.parseFloat(heroRivalTrialTotalPointArray[0]);
        float f2 = Float.parseFloat(heroRivalTrialTotalPointArray[0]) + Float.valueOf(heroRivalTrialTotalPointArray[1]);
        double ratio = NumberUtil.div(f1, f2, 2);

        for (RankData data : rankDataList) {
            FightPlayerData fightPlayerData = new FightPlayerData();
            fightPlayerData.pvpRank = data.rank;
            fightPlayerData.rank = data.rank;
            fightPlayerData.roudRank = 128;
            fightPlayerData.playerId = data.value;
            GamePlayer rankPlayer = this.worldMgr.getPlayerById(data.value);
            if (rankPlayer != null) {
                if (!rankPlayer.isRobot()) {
                    rankPlayer.pushTask(() -> {
                        HeroArrayingPart heroArrayingPart = (HeroArrayingPart) rankPlayer.getMgrPart(HeroArrayingPart.class);
                        heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.HERO_STATE_KING_PLAINS, CommonMsg.HeroState.HERO_STATE_ARRAYING);
                    });
                }

                fightPlayerData.power = rankPlayer.getPlayerCombatPower();
                fightPlayerData.score = (int) ((double) data.score * ratio);
                ((KingOfCentralPlainsData) worldDao.jsonData).players128.put(data.value, fightPlayerData);
                tempRankMap.put(data.rank, fightPlayerData);
                ++num;
                if (num >= 128) {
                    break;
                }
            }
        }

        this.rankMap = tempRankMap;
        worldDao.updateOp();
    }

    public void runRound(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("==========第{}轮,状态={}=========", round, ((KingOfCentralPlainsData) worldDao.jsonData).state);
        this.runReady(round);
        int readyTime = this.configManager.getIntDefault("heroRivalReadyTime", 30) * 1000;
        int guessTime = this.configManager.getIntDefault("heroRivalGuessTime", 90) * 1000;
        int fightTime = this.configManager.getIntDefault("heroRivalBattleTime", 180) * 1000;
        if (this.isTest) {
            readyTime = 5000;
            guessTime = 10000;
            fightTime = 10000;
        }

        this.scheduleEx((long) readyTime, "runGuess", new Object[]{round});
        int totalTime = readyTime + guessTime;
        this.scheduleEx((long) totalTime, "runFight", new Object[]{round});
        totalTime += fightTime;
        this.scheduleEx((long) totalTime, "runSettle", new Object[]{round});
    }

    public void initRunRound(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("==========第{}轮,状态={}=========", round, ((KingOfCentralPlainsData) worldDao.jsonData).state);
        ((KingOfCentralPlainsData) worldDao.jsonData).stepTime = System.currentTimeMillis();
        int readyTime = this.configManager.getIntDefault("heroRivalReadyTime", 30) * 1000;
        int guessTime = this.configManager.getIntDefault("heroRivalGuessTime", 90) * 1000;
        int fightTime = this.configManager.getIntDefault("heroRivalBattleTime", 180) * 1000;
        int totalTime = 0;
        if (((KingOfCentralPlainsData) worldDao.jsonData).state <= 1) {
            totalTime = readyTime;
            this.logger.info("初始化：runGuess");
            this.scheduleEx((long) readyTime, "runGuess", new Object[]{round});
        }

        if (((KingOfCentralPlainsData) worldDao.jsonData).state <= 2) {
            totalTime += guessTime;
            this.logger.info("初始化：runFight");
            this.scheduleEx((long) totalTime, "runFight", new Object[]{round});
        }

        if (((KingOfCentralPlainsData) worldDao.jsonData).state <= 3) {
            totalTime += fightTime;
            this.logger.info("初始化： runSettle");
            this.scheduleEx((long) totalTime, "runSettle", new Object[]{round});
        }

    }

    public void runReady(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("准备,time={}", DateUtil.transferLongToDate(System.currentTimeMillis()));
        ((KingOfCentralPlainsData) worldDao.jsonData).stepTime = System.currentTimeMillis();
        ((KingOfCentralPlainsData) worldDao.jsonData).round = round;
        ((KingOfCentralPlainsData) worldDao.jsonData).state = 1;
        Map<Integer, GuessData> guessDataMap = ((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round - 1);
        if (guessDataMap != null) {
            for (Map.Entry<Integer, GuessData> entry : guessDataMap.entrySet()) {
                GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer) entry.getKey());
                gamePlayer.pushTaskEx("kingOfCp_runReady_send", new Object[]{((KingOfCentralPlainsData) worldDao.jsonData).round});
            }
        }

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.isSystemOpen(1500)) {
                this.S2C_RoundAndState_9650(gamePlayer);
            }
        }

        this.toGrouping(round);
    }

    public void toGrouping(int round) {
        switch (round) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.initTrialGroup(round);
                break;
            case 7:
                this.initGroup32();
                break;
            case 8:
                this.initGroup16();
                break;
            case 9:
                this.initGroup8();
                break;
            case 10:
                this.initGroup4();
                break;
            case 11:
                this.initGroup2();
        }

    }

    @TaskMethod
    public void runGuess(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("竞猜,time={}", DateUtil.transferLongToDate(System.currentTimeMillis()));
        ((KingOfCentralPlainsData) worldDao.jsonData).state = 2;
        ((KingOfCentralPlainsData) worldDao.jsonData).stepTime = System.currentTimeMillis();
        ((KingOfCentralPlainsData) worldDao.jsonData).leftOdds = (double) 1.75F;
        ((KingOfCentralPlainsData) worldDao.jsonData).rightOdds = (double) 1.75F;
        ((KingOfCentralPlainsData) worldDao.jsonData).leftWagerNum = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).rightWagerNum = 0;
        ((KingOfCentralPlainsData) worldDao.jsonData).totalWagerNum = 0;
        this.loadPlayerNewArraying(round);

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.isSystemOpen(1500)) {
                this.S2C_RoundAndState_9650(gamePlayer);
                KingOfCentralPlainsMsg.S2C_GuessPush_9616.Builder builder = KingOfCentralPlainsMsg.S2C_GuessPush_9616.newBuilder();
                builder.setLeftOdds(((KingOfCentralPlainsData) worldDao.jsonData).leftOdds);
                builder.setRightOdds(((KingOfCentralPlainsData) worldDao.jsonData).rightOdds);
                gamePlayer.sendMsg(builder.build());
            }
        }

        this.fightTime(round);
    }

    public void loadPlayerNewArraying(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        switch (round) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                for (Map.Entry<Integer, FightPlayerData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).players128.entrySet()) {
                    this.saveArrayingToCache((Integer) entry.getKey());
                }
                break;
            case 7:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        this.saveArrayingToCache(((FightData) subEntry.getValue()).lId);
                        this.saveArrayingToCache(((FightData) subEntry.getValue()).rId);
                    }
                }
                break;
            case 8:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_16.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        this.saveArrayingToCache(((FightData) subEntry.getValue()).lId);
                        this.saveArrayingToCache(((FightData) subEntry.getValue()).rId);
                    }
                }
                break;
            case 9:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_8.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        this.saveArrayingToCache(((FightData) subEntry.getValue()).lId);
                        this.saveArrayingToCache(((FightData) subEntry.getValue()).rId);
                    }
                }
                break;
            case 10:
                for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_4.entrySet()) {
                    this.saveArrayingToCache(((FightData) entry.getValue()).lId);
                    this.saveArrayingToCache(((FightData) entry.getValue()).rId);
                }
                break;
            case 11:
                for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_2.entrySet()) {
                    this.saveArrayingToCache(((FightData) entry.getValue()).lId);
                    this.saveArrayingToCache(((FightData) entry.getValue()).rId);
                }
        }

    }

    //   public void saveArrayingToCache(int playerId) {
//      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
//      if (gamePlayer != null) {
//         if (gamePlayer.isRobot()) {
//            if (!this.arrayingMap.containsKey(gamePlayer.getPlayerId())) {
//               gamePlayer.pushTask(() -> {
//                  ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
//                  this.pushTask(() -> this.arrayingMap.put(gamePlayer.getPlayerId(), arrayingMirror));
//               });
//            }
//         } else {
//            gamePlayer.pushTask(() -> {
//               ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_KING_PLAINS);
//               if (arrayingMirror.arrayingHeroIsEmpty()) {
//                  arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
//                  HeroArrayingPart heroArrayingPart = (HeroArrayingPart)gamePlayer.getMgrPart(HeroArrayingPart.class);
//                  heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_KING_PLAINS);
//               }
//
//                ArrayingMirror finalArrayingMirror = arrayingMirror;
//                this.pushTask(() -> this.arrayingMap.put(gamePlayer.getPlayerId(), finalArrayingMirror));
//            });
//         }
//      }
//   }
    public void saveArrayingToCache(int playerId) {

        GamePlayer gamePlayer = worldMgr.getPlayerById(playerId);
        if (gamePlayer == null) {
            return;
        }

        // Robot player handling
        if (gamePlayer.isRobot()) {

            if (arrayingMap.containsKey(gamePlayer.getPlayerId())) {
                return;
            }

            gamePlayer.pushTask(() -> {
                ArrayingMirror mirror =
                        gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);

                if (mirror == null) {
                    return;
                }

                this.pushTask(() ->
                        arrayingMap.put(gamePlayer.getPlayerId(), mirror)
                );
            });

            return;
        }

        // Normal player handling
        gamePlayer.pushTask(() -> {

            ArrayingMirror mirror =
                    gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_KING_PLAINS);

            if (mirror == null || mirror.arrayingHeroIsEmpty()) {

                mirror = gamePlayer.getPlayerArraying(
                        CommonMsg.HeroState.HERO_STATE_ARRAYING
                );
                HeroArrayingPart heroArrayingPart =
                        (HeroArrayingPart) gamePlayer.getMgrPart(HeroArrayingPart.class);

                if (heroArrayingPart != null) {
                    heroArrayingPart.saveHeroArrayingSameCommon(
                            CommonMsg.HeroState.HERO_STATE_KING_PLAINS
                    );
                }
            }
            ArrayingMirror finalMirror = mirror;

            if (finalMirror == null) {
                return;
            }

            this.pushTask(() ->
                    arrayingMap.put(gamePlayer.getPlayerId(), finalMirror)
            );
        });
    }

    public ArrayingMirror getArrayingMirror(int playerId) {
        return this.arrayingMap.containsKey(playerId) ? (ArrayingMirror) this.arrayingMap.get(playerId) : null;
    }

    public void fightTime(int round) {
        this.logger.info("提前执行战斗，round={}", round);
        List<FightData> fightDataList = this.getFightDataList(round);
        int winScore = 0;
        if (round <= 6) {
            int heroRivalTrialWinPoint = this.configManager.getIntDefault("heroRivalTrialWinPoint", 100);
            String heroRivalTrialTotalPoint = this.configManager.getStrByDefault("heroRivalTrialTotalPoint", "5000|5000");
            String[] heroRivalTrialTotalPointArray = heroRivalTrialTotalPoint.split("\\|");
            float f1 = Float.parseFloat(heroRivalTrialTotalPointArray[0]);
            float f2 = Float.parseFloat(heroRivalTrialTotalPointArray[0]) + Float.valueOf(heroRivalTrialTotalPointArray[1]);
            double ratio = NumberUtil.div(f1, f2, 2);
            winScore = (int) ((double) heroRivalTrialWinPoint * ratio);
        }

        this.logger.info("战斗开始，size={}", fightDataList.size());
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        FightData guessFightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
        KingOfCentarlPlainsFightMgr fightMgr = (KingOfCentarlPlainsFightMgr) ApplicationContextProvider.getContext().getBean(KingOfCentarlPlainsFightMgr.class);
        fightMgr.pushTaskEx("fight", new Object[]{fightDataList, guessFightData, round, winScore, this.isTest, this});
    }

    public List<FightData> getFightDataList(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        List<FightData> fightDataList = new ArrayList();
        switch (round) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                fightDataList = ((KingOfCentralPlainsData) worldDao.jsonData).map_trial.get(round);
                break;
            case 7:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        fightDataList.add(subEntry.getValue());
                    }
                }
                break;
            case 8:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_16.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        fightDataList.add(subEntry.getValue());
                    }
                }
                break;
            case 9:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_8.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        fightDataList.add(subEntry.getValue());
                    }
                }
                break;
            case 10:
                for (Map.Entry<Integer, FightData> subEntry : ((KingOfCentralPlainsData) worldDao.jsonData).map_4.entrySet()) {
                    fightDataList.add(subEntry.getValue());
                }
                break;
            case 11:
                for (Map.Entry<Integer, FightData> subEntry : ((KingOfCentralPlainsData) worldDao.jsonData).map_2.entrySet()) {
                    fightDataList.add(subEntry.getValue());
                }
        }

        return fightDataList;
    }

    @TaskMethod
    public void runFight(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("战斗阶段,time={}", DateUtil.transferLongToDate(System.currentTimeMillis()));
        ((KingOfCentralPlainsData) worldDao.jsonData).state = 3;
        ((KingOfCentralPlainsData) worldDao.jsonData).stepTime = System.currentTimeMillis();

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.isSystemOpen(1500)) {
                this.S2C_RoundAndState_9650(gamePlayer);
            }
        }

        for (FightData fightData : this.getFightDataList(round)) {
            int winPlayerId;
            if (fightData.win == 0) {
                winPlayerId = fightData.lId;
            } else {
                winPlayerId = fightData.rId;
            }

            FightPlayerData var10000 = (FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(winPlayerId);
            var10000.score += fightData.winScore;
            this.flushPlayerFightData(round, winPlayerId, fightData.winScore, fightData);
        }

        List<FightPlayerData> player128List = new ArrayList(((KingOfCentralPlainsData) worldDao.jsonData).players128.values());
        Collections.sort(player128List);
        Map<Integer, FightPlayerData> tempRankMap = new HashMap();

        for (int i = 0; i < player128List.size(); ++i) {
            ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(((FightPlayerData) player128List.get(i)).playerId)).rank = i + 1;
            tempRankMap.put(i + 1, player128List.get(i));
        }

        this.logger.info("战斗阶段，重新处理排名，个数={}", tempRankMap.size());
        this.rankMap = tempRankMap;
        worldDao.updateOp();
        FightData guessFightData = this.getCurrentGuessFightData();
        int guessRecordId = guessFightData == null ? 0 : guessFightData.record;

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.isSystemOpen(1500)) {
                FightData fightData = this.getPlayerCurrentFightData(gamePlayer.getPlayerId(), false);
                int fightRecordId = fightData == null ? 0 : fightData.record;
                KingOfCentralPlainsMsg.S2C_FightRecord_9654.Builder builder = KingOfCentralPlainsMsg.S2C_FightRecord_9654.newBuilder();
                builder.setFightRecordId(fightRecordId);
                builder.setFightRecordTime(0);
                builder.setGuessRecordId(guessRecordId);
                builder.setGuessRecordTime(0);
                gamePlayer.sendMsg(builder.build());
            }
        }

    }

    @TaskMethod
    public void runSettle(int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("第{}轮结算,time={}", ((KingOfCentralPlainsData) worldDao.jsonData).round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        Map<Integer, GuessData> guessDataMap = ((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round);
        if (guessDataMap != null) {
            FightData fightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);

            for (Map.Entry<Integer, GuessData> entry : guessDataMap.entrySet()) {
                GuessData data = (GuessData) entry.getValue();
                if (fightData.win == 0 && data.wagerId == fightData.lId || fightData.win == 1 && data.wagerId == fightData.rId) {
                    ((GuessData) entry.getValue()).win = 1;
                    double odds = ((KingOfCentralPlainsData) worldDao.jsonData).rightOdds;
                    if (data.wagerId == fightData.lId) {
                        odds = ((KingOfCentralPlainsData) worldDao.jsonData).leftOdds;
                    }

                    int addWinPlains = (int) ((double) ((GuessData) entry.getValue()).wagerNum * odds);
                    ((GuessData) entry.getValue()).winNum = addWinPlains;
                    if (addWinPlains > 0) {
                        GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer) entry.getKey());
                        gamePlayer.pushTaskEx("addResourceByNum", new Object[]{1, PlayerDefine.PLAYER_WIN_PLAINS, addWinPlains, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 38, 3802, 0, 0, ""});
                        gamePlayer.pushTaskEx("triggerTask", new Object[]{371, 0, 1, 1});
                    } else {
                        this.logger.info("玩家{}问鼎中原竞猜胜利，第{}轮，没有获得筹码，" + entry.getKey(), ((KingOfCentralPlainsData) worldDao.jsonData).round);
                    }
                } else {
                    if (((GuessData) entry.getValue()).wagerNum >= 3000) {
                        ((KingOfCentralPlainsData) worldDao.jsonData).loseScore.add(((GuessData) entry.getValue()).id);
                    }

                    ((GuessData) entry.getValue()).win = -1;
                    GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer) entry.getKey());
                    if (gamePlayer.getPublicDao().privilege_kingcp > 0) {
                        ((GuessData) entry.getValue()).winNum = -((GuessData) entry.getValue()).wagerNum / 2;
                        gamePlayer.pushTaskEx("addResourceByNum", new Object[]{1, PlayerDefine.PLAYER_WIN_PLAINS, ((GuessData) entry.getValue()).wagerNum / 2, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 38, 3801, ((GuessData) entry.getValue()).wagerNum, 0, ""});
                    } else {
                        ((GuessData) entry.getValue()).winNum = -((GuessData) entry.getValue()).wagerNum;
                    }
                }
            }
        }

        if (round < 11) {
            int newRound = round + 1;
            this.runRound(newRound);
        } else {
            this.runEndAcitvity();
        }

    }

    public void runEndAcitvity() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("==========活动结束,活动结算=========");
        ((KingOfCentralPlainsData) worldDao.jsonData).activityState = 3;
        ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd = 1;
        ((KingOfCentralPlainsData) worldDao.jsonData).state = 0;
        this.isTest = false;

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.isSystemOpen(1500)) {
                this.S2C_ActivityState_9652(gamePlayer);
            }
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).top3.clear();

        for (int i = 0; i < 3; ++i) {
            FightPlayerData oldData = (FightPlayerData) this.rankMap.get(i + 1);
            FightPlayerData newData = new FightPlayerData();
            newData.score = oldData.score;
            newData.playerId = oldData.playerId;
            newData.roudRank = oldData.roudRank;
            newData.power = oldData.power;
            newData.rank = oldData.rank;
            newData.pvpRank = oldData.pvpRank;
            ((KingOfCentralPlainsData) worldDao.jsonData).top3.add(newData);
        }

        worldDao.updateOp();
        this.scheduleEx(10000L, "runSendAward", new Object[0]);
    }

    @TaskMethod
    public void runSendAward() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

        for (Integer givePlainsPlayerId : ((KingOfCentralPlainsData) worldDao.jsonData).givePlainsPlayerIds) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(givePlainsPlayerId);
            if (!((KingOfCentralPlainsData) worldDao.jsonData).guessPlayerIds.contains(givePlainsPlayerId)) {
                gamePlayer.pushTaskEx("delResourceAllNum", new Object[]{1, PlayerDefine.PLAYER_WIN_PLAINS, 38, 3806, 0, 0, "clearActivity"});
            } else {
                gamePlayer.pushTaskEx("kingOfCp_runSendAward_runSendAward", new Object[0]);
            }
        }

        this.runRankAward(38, 3805);
        worldDao.updateOp();

        for (Map.Entry<Integer, FightPlayerData> entry : this.rankMap.entrySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(((FightPlayerData) entry.getValue()).playerId);
            if (!gamePlayer.isRobot()) {
                gamePlayer.pushPartTaskEx(KingOfCentralPlainsPart.class, "runSendAward_highestRank", new Object[]{entry.getKey()});
            }
        }

        Map<Integer, Integer> successMap = new HashMap();
        Map<Integer, Integer> loseMap = new HashMap();

        for (int i = 1; i <= 11; ++i) {
            Map<Integer, GuessData> map = ((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(i);
            if (map != null) {
                for (Map.Entry<Integer, GuessData> entry : map.entrySet()) {
                    if (((GuessData) entry.getValue()).win == 1) {
                        int oldVal = (Integer) MapUtil.getOrDefault(successMap, entry.getKey(), 0);
                        successMap.put(entry.getKey(), oldVal + 1);
                    } else {
                        int oldVal = (Integer) MapUtil.getOrDefault(loseMap, entry.getKey(), 0);
                        loseMap.put(entry.getKey(), oldVal + 1);
                    }
                }
            }
        }

        int loseAllTitle = this.configManager.getIntDefault("loseAllTitle", 19532);
        int winAllTitle = this.configManager.getIntDefault("winAllTitle", 19533);
        int AllinTitle = this.configManager.getIntDefault("AllinTitle", 19534);
        int titleNeedNum = this.configManager.getIntDefault("titleNeedNum", 11);
        Map<Integer, List<ResourceModel>> guessRewaed = new HashMap();
        Map<Integer, String> stringMap = new HashMap();

        for (Map.Entry<Integer, Integer> entry : successMap.entrySet()) {
            if ((Integer) entry.getValue() >= titleNeedNum) {
                List<ResourceModel> resourceModels = (List) MapUtil.getOrDefault(guessRewaed, entry.getKey(), new ArrayList());
                resourceModels.add(new ResourceModel(2, winAllTitle, 1));
                guessRewaed.put(entry.getKey(), resourceModels);
                String str = (String) MapUtil.getOrDefault(stringMap, entry.getKey(), "");
                stringMap.put(entry.getKey(), str + "赢" + entry.getValue() + "次，");
                GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer) entry.getKey());
                if (gamePlayer != null) {
                    gamePlayer.pushTaskEx("triggerTask", new Object[]{324, 0, 1, 0});
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : loseMap.entrySet()) {
            if ((Integer) entry.getValue() >= titleNeedNum) {
                List<ResourceModel> resourceModels = (List) MapUtil.getOrDefault(guessRewaed, entry.getKey(), new ArrayList());
                resourceModels.add(new ResourceModel(2, loseAllTitle, 1));
                guessRewaed.put(entry.getKey(), resourceModels);
            }

            String str = (String) MapUtil.getOrDefault(stringMap, entry.getKey(), "");
            stringMap.put(entry.getKey(), str + "输" + entry.getValue() + "次，");
        }

        for (Integer playerId : ((KingOfCentralPlainsData) worldDao.jsonData).loseScore) {
            List<ResourceModel> resourceModels = (List) MapUtil.getOrDefault(guessRewaed, playerId, new ArrayList());
            resourceModels.add(new ResourceModel(2, AllinTitle, 1));
            guessRewaed.put(playerId, resourceModels);
        }

        for (Map.Entry<Integer, List<ResourceModel>> entry : guessRewaed.entrySet()) {
            CentreAwardModel centreAwardModel = (CentreAwardModel) this.gameModelPool.getEntity("centreAward", 563);
            GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer) entry.getKey());
            String mailStr = (String) stringMap.get(entry.getKey());
            if (gamePlayer != null) {
                gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), entry.getValue(), 604800000L, 38, 3802});
            }
        }

        this.popSeasonTopThreeResult();
        this.arrayingMap.clear();
    }

    public void runRankAward(int module, int reason) {
        Map<Integer, Map<Integer, CentreAwardModel>> rewardMap = this.gameModelPool.getMap("customCentreAward");
        Map<Integer, CentreAwardModel> activityReward = (Map) rewardMap.get(CentreAwardModel.AWARD_TYPE_5);
        if (activityReward != null && !activityReward.isEmpty()) {
            for (Map.Entry<Integer, CentreAwardModel> entry : activityReward.entrySet()) {
                int minRank = ((CentreAwardModel) entry.getValue()).getMinRank();
                int maxRank = ((CentreAwardModel) entry.getValue()).getMaxRank();
                Map<Integer, String> needPlayerRank = new HashMap();

                for (int i = minRank; i <= maxRank; ++i) {
                    FightPlayerData fightPlayerData = (FightPlayerData) this.rankMap.get(i);
                    GamePlayer gamePlayer = this.worldMgr.getPlayerById(fightPlayerData.playerId);
                    if (gamePlayer != null && !gamePlayer.isRobot()) {
                        if (gamePlayer.isLogin()) {
                            String format = MessageFormat.format(((CentreAwardModel) entry.getValue()).getDesc(), i);
                            gamePlayer.pushPartTaskEx(MailPart.class, "addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel) entry.getValue()).getTitle(), format, ((CentreAwardModel) entry.getValue()).getItems(), 604800000L, module, reason});
                        } else {
                            needPlayerRank.put(fightPlayerData.playerId, String.valueOf(i));
                        }

                        gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, "问鼎中原", ((CentreAwardModel) entry.getValue()).getId() + "", ((CentreAwardModel) entry.getValue()).getId() + "", 0, 0, 0);
                    }
                }

                if (needPlayerRank.size() > 0) {
                    MailWorldMgr mailWorldMgr = (MailWorldMgr) ApplicationContextProvider.getContext().getBean(MailWorldMgr.class);
                    mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel) entry.getValue()).getTitle(), ((CentreAwardModel) entry.getValue()).getDesc(), ((CentreAwardModel) entry.getValue()).getItems(), needPlayerRank, 604800000L, module, reason, 0);
                }
            }

        }
    }

    public void initTrialGroup(int round) {
        this.logger.info("预选赛分组,round={},time={}", round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        List<Integer> waitList = new ArrayList();
        List<FightPlayerData> guessList = new ArrayList();
        List<FightData> fightDataList = new ArrayList();
        int[] rank = PvpDefine.GUESS_FIRST_PLAYER_RANK[round - 1];
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

        for (Map.Entry<Integer, FightPlayerData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).players128.entrySet()) {
            if (((FightPlayerData) entry.getValue()).pvpRank >= rank[0] && ((FightPlayerData) entry.getValue()).pvpRank <= rank[1]) {
                guessList.add(entry.getValue());
            }
        }

        FightPlayerData leftFightPlayerData = null;
        int loop = 0;

        do {
            ++loop;
            int random = RandomUtil.randInt(guessList.size());
            leftFightPlayerData = (FightPlayerData) guessList.get(random);
        } while (this.isHavePlayer(leftFightPlayerData) && loop <= 10);

        long leftPower = this.worldMgr.getPlayerById(leftFightPlayerData.playerId).getPlayerCombatPower();
        FightPlayerData rightFightPlayerData = null;

        for (Map.Entry<Integer, FightPlayerData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).players128.entrySet()) {
            if (((FightPlayerData) entry.getValue()).playerId != leftFightPlayerData.playerId) {
                if (rightFightPlayerData == null) {
                    rightFightPlayerData = (FightPlayerData) entry.getValue();
                } else {
                    long rightPower = ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(rightFightPlayerData.playerId)).power;
                    long tempPower = ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(((FightPlayerData) entry.getValue()).playerId)).power;
                    if (Math.abs(leftPower - rightPower) > Math.abs(leftPower - tempPower)) {
                        rightFightPlayerData = (FightPlayerData) entry.getValue();
                    }
                }
            }
        }

        FightData guessFightData = new FightData();
        guessFightData.round = round;
        guessFightData.lId = leftFightPlayerData.playerId;
        guessFightData.rId = rightFightPlayerData.playerId;
        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.put(round, guessFightData);
        fightDataList.add(guessFightData);

        for (Map.Entry<Integer, FightPlayerData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).players128.entrySet()) {
            if (((FightPlayerData) entry.getValue()).playerId != leftFightPlayerData.playerId && ((FightPlayerData) entry.getValue()).playerId != rightFightPlayerData.playerId) {
                waitList.add(((FightPlayerData) entry.getValue()).playerId);
            }
        }

        Collections.shuffle(waitList);
        int totalNum = waitList.size();
        int groupNum = totalNum / 2;

        for (int i = 0; i < groupNum; ++i) {
            FightData fightData = new FightData();
            fightData.round = round;
            fightData.lId = (Integer) waitList.get(2 * i);
            fightData.rId = (Integer) waitList.get(2 * i + 1);
            fightDataList.add(fightData);
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).map_trial.put(round, fightDataList);
    }

    public boolean isHavePlayer(FightPlayerData leftFightPlayerData) {
        if (leftFightPlayerData == null) {
            return false;
        } else {
            WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

            for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.entrySet()) {
                if (((FightData) entry.getValue()).lId == leftFightPlayerData.playerId || ((FightData) entry.getValue()).rId == leftFightPlayerData.playerId) {
                    return true;
                }
            }

            return false;
        }
    }

    public void initGroup32() {
        int round = 7;
        this.logger.info("32强分组,round={},time={}", round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        List<FightPlayerData> fightPlayerDataList = new ArrayList();
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

        for (Map.Entry<Integer, FightPlayerData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).players128.entrySet()) {
            if (((FightPlayerData) entry.getValue()).rank <= 32) {
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(((FightPlayerData) entry.getValue()).playerId)).roudRank = 32;
                fightPlayerDataList.add(entry.getValue());
            }
        }

        FightData tempFightData = null;
        long dPower = 0L;
        Collections.shuffle(fightPlayerDataList);
        int teamSize = fightPlayerDataList.size() / 2;

        for (int i = 0; i < teamSize; ++i) {
            int mapKey = i / 4;
            int subMapKey = i % 4;
            FightData fightData = new FightData();
            fightData.round = round;
            fightData.lId = ((FightPlayerData) fightPlayerDataList.get(2 * i)).playerId;
            fightData.rId = ((FightPlayerData) fightPlayerDataList.get(2 * i + 1)).playerId;
            if (((KingOfCentralPlainsData) worldDao.jsonData).map_32.get(mapKey) == null) {
                Map<Integer, FightData> subMap = new HashMap();
                subMap.put(subMapKey, fightData);
                ((KingOfCentralPlainsData) worldDao.jsonData).map_32.put(mapKey, subMap);
            } else {
                (((KingOfCentralPlainsData) worldDao.jsonData).map_32.get(mapKey)).put(subMapKey, fightData);
            }

            if (tempFightData == null) {
                tempFightData = fightData;
            } else {
                long tempDPower = Math.abs(((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(fightData.lId)).power - ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(fightData.rId)).power);
                if (tempDPower < dPower) {
                    tempFightData = fightData;
                    dPower = tempDPower;
                }
            }
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.put(round, tempFightData);
        worldDao.updateOp();
    }

    public void initGroup16() {
        int round = 8;
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        this.logger.info("16强分组,round={},time={}", round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        FightData tempFightData = null;
        long dPower = 0L;

        for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
            int tempsize = (entry.getValue()).size() / 2;

            for (int i = 0; i < tempsize; ++i) {
                FightData leftFightData = (FightData) (entry.getValue()).get(2 * i);
                FightData rightFightData = (FightData) (entry.getValue()).get(2 * i + 1);
                FightData newFightData = new FightData();
                newFightData.round = round;
                newFightData.lId = leftFightData.win == 0 ? leftFightData.lId : leftFightData.rId;
                newFightData.rId = rightFightData.win == 0 ? rightFightData.lId : rightFightData.rId;
                if (((KingOfCentralPlainsData) worldDao.jsonData).map_16.get(entry.getKey()) == null) {
                    Map<Integer, FightData> subMap = new HashMap();
                    subMap.put(i, newFightData);
                    ((KingOfCentralPlainsData) worldDao.jsonData).map_16.put(entry.getKey(), subMap);
                } else {
                    (((KingOfCentralPlainsData) worldDao.jsonData).map_16.get(entry.getKey())).put(i, newFightData);
                }

                if (tempFightData == null) {
                    tempFightData = newFightData;
                } else {
                    long tempDPower = Math.abs(((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.lId)).power - ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.rId)).power);
                    if (tempDPower < dPower) {
                        tempFightData = newFightData;
                        dPower = tempDPower;
                    }
                }
            }
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.put(round, tempFightData);
        worldDao.updateOp();
    }

    public void initGroup8() {
        int round = 9;
        this.logger.info("8强分组,round={},time={}", round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        FightData tempFightData = null;
        long dPower = 0L;
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

        for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_16.entrySet()) {
            int tempsize = (entry.getValue()).size() / 2;

            for (int i = 0; i < tempsize; ++i) {
                FightData leftFightData = (FightData) (entry.getValue()).get(2 * i);
                FightData rightFightData = (FightData) (entry.getValue()).get(2 * i + 1);
                FightData newFightData = new FightData();
                newFightData.round = round;
                newFightData.lId = leftFightData.win == 0 ? leftFightData.lId : leftFightData.rId;
                newFightData.rId = rightFightData.win == 0 ? rightFightData.lId : rightFightData.rId;
                if (((KingOfCentralPlainsData) worldDao.jsonData).map_8.get(entry.getKey()) == null) {
                    Map<Integer, FightData> subMap = new HashMap();
                    subMap.put(i, newFightData);
                    ((KingOfCentralPlainsData) worldDao.jsonData).map_8.put(entry.getKey(), subMap);
                } else {
                    (((KingOfCentralPlainsData) worldDao.jsonData).map_8.get(entry.getKey())).put(i, newFightData);
                }

                if (tempFightData == null) {
                    tempFightData = newFightData;
                } else {
                    long tempDPower = Math.abs(((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.lId)).power - ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.rId)).power);
                    if (tempDPower < dPower) {
                        tempFightData = newFightData;
                        dPower = tempDPower;
                    }
                }
            }
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.put(round, tempFightData);
        worldDao.updateOp();
    }

    public void initGroup4() {
        int round = 10;
        this.logger.info("4强分组,round={},time={}", round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        List<Integer> winPlayerIdList = new LinkedList();
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

        for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_8.entrySet()) {
            for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                winPlayerIdList.add(((FightData) subEntry.getValue()).win == 0 ? ((FightData) subEntry.getValue()).lId : ((FightData) subEntry.getValue()).rId);
            }
        }

        Collections.shuffle(winPlayerIdList);
        FightData tempFightData = null;
        long dPower = 0L;
        int groupNum = winPlayerIdList.size() / 2;

        for (int i = 0; i < groupNum; ++i) {
            FightData newFightData = new FightData();
            newFightData.round = round;
            newFightData.lId = (Integer) winPlayerIdList.get(2 * i);
            newFightData.rId = (Integer) winPlayerIdList.get(2 * i + 1);
            ((KingOfCentralPlainsData) worldDao.jsonData).map_4.put(i, newFightData);
            if (tempFightData == null) {
                tempFightData = newFightData;
            } else {
                long tempDPower = Math.abs(((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.lId)).power - ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.rId)).power);
                if (tempDPower < dPower) {
                    tempFightData = newFightData;
                    dPower = tempDPower;
                }
            }
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.put(round, tempFightData);
    }

    public void initGroup2() {
        int round = 11;
        this.logger.info("2强分组,round={},time={}", round, DateUtil.transferLongToDate(System.currentTimeMillis()));
        FightData tempFightData = null;
        long dPower = 0L;
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        int tempsize = ((KingOfCentralPlainsData) worldDao.jsonData).map_4.size() / 2;

        for (int i = 0; i < tempsize; ++i) {
            FightData leftFightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).map_4.get(2 * i);
            FightData rightFightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).map_4.get(2 * i + 1);
            FightData newFightData = new FightData();
            newFightData.round = round;
            newFightData.lId = leftFightData.win == 0 ? leftFightData.lId : leftFightData.rId;
            newFightData.rId = rightFightData.win == 0 ? rightFightData.lId : rightFightData.rId;
            ((KingOfCentralPlainsData) worldDao.jsonData).map_2.put(i, newFightData);
            if (tempFightData == null) {
                tempFightData = newFightData;
            } else {
                long tempDPower = Math.abs(((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.lId)).power - ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(newFightData.rId)).power);
                if (tempDPower < dPower) {
                    tempFightData = newFightData;
                    dPower = tempDPower;
                }
            }
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.put(round, tempFightData);
        worldDao.updateOp();
    }

    public void flushPlayerFightData(int round, int winPlayerId, int winScore, FightData fightData) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        switch (round) {
            case 7:
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(winPlayerId)).roudRank = 16;
                break;
            case 8:
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(winPlayerId)).roudRank = 8;
                break;
            case 9:
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(winPlayerId)).roudRank = 4;
                break;
            case 10:
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(winPlayerId)).roudRank = 2;
                break;
            case 11:
                ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(winPlayerId)).roudRank = 1;
        }

        worldDao.updateOp();
    }

    @TaskMethod
    public void S2C_ActivityState_9652(GamePlayer gamePlayer) {
        KingOfCentralPlainsMsg.S2C_ActivityState_9652.Builder builder = KingOfCentralPlainsMsg.S2C_ActivityState_9652.newBuilder();
        LocalDate localDate = LocalDate.now();
        if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
            if (!DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
                builder.setIsActivityDay(true);
            } else {
                builder.setIsOpenDay(true);
            }
        }

        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).activityState == 2) {
            builder.setIsActivityDay(true);
            builder.setState(2);
            builder.setDownTime((int) ((((KingOfCentralPlainsData) worldDao.jsonData).startTime + (long) this.getTotalActivityTime()) / 1000L));
        } else {
            int[] state = this.getActivityState();
            builder.setState(state[0]);
            builder.setStartTime(state[1]);
            builder.setDownTime(state[1]);
        }

        gamePlayer.sendMsg(builder.build());
    }

    @TaskMethod
    public void S2C_RoundAndState_9650(GamePlayer gamePlayer) {
        KingOfCentralPlainsMsg.S2C_RoundAndState_9650.Builder builder = KingOfCentralPlainsMsg.S2C_RoundAndState_9650.newBuilder();
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        builder.setRound(((KingOfCentralPlainsData) worldDao.jsonData).round);
        builder.setState(((KingOfCentralPlainsData) worldDao.jsonData).state);
        builder.setStartTime((int) (((KingOfCentralPlainsData) worldDao.jsonData).stepTime / 1000L));
        switch (((KingOfCentralPlainsData) worldDao.jsonData).state) {
            case 0:
                int rank = this.rankMgr.getRank(RankDefine.RankModule.PVP, gamePlayer.getPlayerId());
                builder.setIsEnable(rank <= 128);
                int[] state = this.getActivityState();
                builder.setDownTime(state[1]);
                builder.setRound(0);
                builder.setState(0);
                builder.setNextTime(state[1]);
                break;
            case 1:
                int readyTime = this.configManager.getIntDefault("heroRivalReadyTime", 30) * 1000;
                if (this.isTest) {
                    readyTime = 5000;
                }

                int downReadyTime = (int) ((((KingOfCentralPlainsData) worldDao.jsonData).stepTime + (long) readyTime) / 1000L);
                builder.setDownTime(downReadyTime);
                builder.setIsEnable(((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId()) != null);
                break;
            case 2:
                int guessTime = this.configManager.getIntDefault("heroRivalGuessTime", 90) * 1000;
                if (this.isTest) {
                    guessTime = 10000;
                }

                int downGuessTime = (int) ((((KingOfCentralPlainsData) worldDao.jsonData).stepTime + (long) guessTime) / 1000L);
                builder.setDownTime(downGuessTime);
                builder.setIsEnable(((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId()) != null);
                break;
            case 3:
                int fightTime = this.configManager.getIntDefault("heroRivalBattleTime", 180) * 1000;
                if (this.isTest) {
                    fightTime = 10000;
                }

                int downFightTime = (int) ((((KingOfCentralPlainsData) worldDao.jsonData).stepTime + (long) fightTime) / 1000L);
                builder.setDownTime(downFightTime);
                builder.setIsEnable(((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId()) != null);
        }

        gamePlayer.sendMsg(builder.build());
    }

    @TaskMethod
    public void S2C_MyFightResult_9602(int playerId) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).players128.get(playerId) == null) {
            this.logger.info("玩家不在128名内");
            this.worldMgr.getPlayerById(playerId).failure(10006);
        } else {
            FightData fightData = this.getPlayerCurrentFightData(playerId, true);
            KingOfCentralPlainsMsg.S2C_MyFightResult_9602.Builder builder = KingOfCentralPlainsMsg.S2C_MyFightResult_9602.newBuilder();
            builder.setFight(this.toFightData(fightData, true));
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            gamePlayer.sendMsg(builder.build());
        }
    }

    public FightData getPlayerCurrentFightData(int playerId, boolean isEnablePreviousRound) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).players128.get(playerId) == null) {
            return null;
        } else {
            int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
            FightPlayerData fightPlayerData = (FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(playerId);
            FightData fightData = this.getFightDataByPlayerId(round, playerId);
            if (fightData == null && isEnablePreviousRound) {
                int oldRound = this.getRoundByRoundRank(fightPlayerData.roudRank);
                this.logger.info("第{}轮没有玩家数据,去拿玩家最后一次参加的战斗,round={}", round, oldRound);
                fightData = this.getFightDataByPlayerId(oldRound, playerId);
            }

            return fightData;
        }
    }

    @TaskMethod
    public void openGuessUi(int playerId) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
        int state = ((KingOfCentralPlainsData) worldDao.jsonData).state;
        if (state == 1) {
            --round;
        }

        FightData fightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
        GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
        KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.Builder builder = KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.newBuilder();
        builder.setLeftOdds(((KingOfCentralPlainsData) worldDao.jsonData).leftOdds);
        builder.setRightOdds(((KingOfCentralPlainsData) worldDao.jsonData).rightOdds);
        if (fightData != null) {
            builder.setFight(this.toFightData(fightData, true));
            builder.setGuessInfo(this.toGuessInfo(round, playerId));
        }

        gamePlayer.sendMsg(builder.build());
    }

    public FightData getCurrentGuessFightData() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
        int state = ((KingOfCentralPlainsData) worldDao.jsonData).state;
        if (state == 1) {
            --round;
        }

        return (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
    }

    @TaskMethod
    public void S2C_GuessRecordResult_9618(GamePlayer gamePlayer) {
        KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.Builder builder = KingOfCentralPlainsMsg.S2C_GuessRecordResult_9618.newBuilder();
        List<KingOfCentralPlainsMsg.GuessRecordInfo.Builder> builderList = new ArrayList();
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);

        for (Map.Entry<Integer, Map<Integer, GuessData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).guessData.entrySet()) {
            int round = (Integer) entry.getKey();

            for (Map.Entry<Integer, GuessData> subEntry : (entry.getValue()).entrySet()) {
                if (((GuessData) subEntry.getValue()).id == gamePlayer.getPlayerId() && ((GuessData) subEntry.getValue()).winNum != 0) {
                    builderList.add(this.toGuessRecordInfo(round, (GuessData) subEntry.getValue()));
                }
            }
        }

        Collections.reverse(builderList);

        for (KingOfCentralPlainsMsg.GuessRecordInfo.Builder infoBuilder : builderList) {
            builder.addInfos(infoBuilder);
        }

        gamePlayer.sendMsg(builder.build());
    }

    @TaskMethod
    public void C2S_GuessRecordAll_9619(GamePlayer gamePlayer) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.Builder builder = KingOfCentralPlainsMsg.S2C_GuessRecordAll_9620.newBuilder();

        for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.entrySet()) {
            KingOfCentralPlainsMsg.GuessRecord.Builder info = KingOfCentralPlainsMsg.GuessRecord.newBuilder();
            int round = (Integer) entry.getKey();
            info.setRound(round);
            info.setFight(this.toFightData((FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round), false));
            Map<Integer, GuessData> tempMap = ((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round);
            if (tempMap != null && tempMap.containsKey(gamePlayer.getPlayerId()) && ((GuessData) tempMap.get(gamePlayer.getPlayerId())).winNum != 0) {
                info.setWagerId(((GuessData) tempMap.get(gamePlayer.getPlayerId())).wagerId);
                info.setWinNum(((GuessData) tempMap.get(gamePlayer.getPlayerId())).winNum);
                info.setSocre(((GuessData) tempMap.get(gamePlayer.getPlayerId())).wagerNum);
            }

            builder.addInfos(info);
        }

        gamePlayer.sendMsg(builder.build());
    }

    public int getRoundByRoundRank(int roundRank) {
        int round = 6;
        switch (roundRank) {
            case 2:
                round = 11;
                break;
            case 4:
                round = 10;
                break;
            case 8:
                round = 9;
                break;
            case 16:
                round = 8;
                break;
            case 32:
                round = 7;
        }

        return round;
    }

    @TaskMethod
    public void guess(GamePlayer gamePlayer, int wagerSide, int wagerNum) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
        int state = ((KingOfCentralPlainsData) worldDao.jsonData).state;
        if (state != 2) {
            this.logger.info("当前不是竞猜阶段，state={}", state);
            gamePlayer.failure(10007);
        } else {
            if (((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round) == null) {
                Map<Integer, GuessData> playerGuessMap = new HashMap();
                ((KingOfCentralPlainsData) worldDao.jsonData).guessData.put(round, playerGuessMap);
            }

            int heroRivalGuessChipMin = this.configManager.getIntDefault("heroRivalGuessChipMin", 10);
            int heroRivalGuessChipMax = this.configManager.getIntDefault("heroRivalGuessChipMax", 3500);
            if (wagerNum >= heroRivalGuessChipMin && wagerNum <= heroRivalGuessChipMax) {
                GuessData guessData = (GuessData) (((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round)).get(gamePlayer.getPlayerId());
                int oldGuessNum = 0;
                if (guessData != null) {
                    oldGuessNum = guessData.wagerNum;
                }

                int returnNum = oldGuessNum - wagerNum;
                ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_WIN_PLAINS, Math.abs(returnNum));
                if (returnNum >= 0 || gamePlayer.checkResourceNum(resourceModel)) {
                    FightData fightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
                    if (guessData != null) {
                        if (guessData.wagerId == fightData.lId) {
                            KingOfCentralPlainsData var10000 = (KingOfCentralPlainsData) worldDao.jsonData;
                            var10000.leftWagerNum -= oldGuessNum;
                        } else {
                            KingOfCentralPlainsData var16 = (KingOfCentralPlainsData) worldDao.jsonData;
                            var16.rightWagerNum -= oldGuessNum;
                        }

                        KingOfCentralPlainsData var17 = (KingOfCentralPlainsData) worldDao.jsonData;
                        var17.totalWagerNum -= oldGuessNum;
                    } else {
                        ((KingOfCentralPlainsData) worldDao.jsonData).guessPlayerIds.add(gamePlayer.getPlayerId());
                        guessData = new GuessData();
                        guessData.id = gamePlayer.getPlayerId();
                    }

                    if (returnNum > 0) {
                        gamePlayer.addResource(1, PlayerDefine.PLAYER_WIN_PLAINS, returnNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 38, 3801, oldGuessNum, wagerNum, "");
                    } else if (returnNum < 0) {
                        gamePlayer.delResource(1, PlayerDefine.PLAYER_WIN_PLAINS, (long) (-returnNum), 38, 3801, oldGuessNum, wagerNum, "");
                    }

                    guessData.wagerId = wagerSide == 0 ? fightData.lId : fightData.rId;
                    guessData.wagerNum = wagerNum;
                    if (wagerSide == 0) {
                        KingOfCentralPlainsData var18 = (KingOfCentralPlainsData) worldDao.jsonData;
                        var18.leftWagerNum += wagerNum;
                    } else {
                        KingOfCentralPlainsData var19 = (KingOfCentralPlainsData) worldDao.jsonData;
                        var19.rightWagerNum += wagerNum;
                    }

                    KingOfCentralPlainsData var20 = (KingOfCentralPlainsData) worldDao.jsonData;
                    var20.totalWagerNum += wagerNum;
                    (((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round)).put(gamePlayer.getPlayerId(), guessData);
                    this.updateOdds(wagerSide, wagerNum, gamePlayer.getPlayerId());
                    worldDao.updateOp();
                    KingOfCentralPlainsMsg.S2C_GuessResult_9614.Builder builder = KingOfCentralPlainsMsg.S2C_GuessResult_9614.newBuilder();
                    builder.setLeftOdds(((KingOfCentralPlainsData) worldDao.jsonData).leftOdds);
                    builder.setRightOdds(((KingOfCentralPlainsData) worldDao.jsonData).rightOdds);
                    builder.setWagerSide(wagerSide);
                    builder.setWagerNum(wagerNum);
                    gamePlayer.sendMsg(builder.build());
                }
            } else {
                this.logger.error("玩家押注超出限制,num={}", wagerNum);
            }
        }
    }

    @TaskMethod
    public void S2C_Rank32UiResult_9632(int playerId) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
        KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.Builder builder = KingOfCentralPlainsMsg.S2C_Rank32UiResult_9632.newBuilder();

        for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
            KingOfCentralPlainsMsg.FightMap32.Builder map32Builder = KingOfCentralPlainsMsg.FightMap32.newBuilder();
            int group = (Integer) entry.getKey();
            map32Builder.setGroup(group);

            for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                map32Builder.addFight32(this.toGroupFightData((FightData) subEntry.getValue(), (Integer) subEntry.getKey(), 7));
            }

            if (round >= 8 || ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 1) {
                for (Map.Entry<Integer, FightData> subEntry : (((KingOfCentralPlainsData) worldDao.jsonData).map_16.get(group)).entrySet()) {
                    map32Builder.addFight16(this.toGroupFightData((FightData) subEntry.getValue(), (Integer) subEntry.getKey(), 8));
                }
            }

            if (round >= 9 || ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 1) {
                for (Map.Entry<Integer, FightData> subEntry : (((KingOfCentralPlainsData) worldDao.jsonData).map_8.get(group)).entrySet()) {
                    map32Builder.addFight8(this.toGroupFightData((FightData) subEntry.getValue(), (Integer) subEntry.getKey(), 9));
                }
            }

            builder.addMap32(map32Builder);
        }

        if (round >= 10 || ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 1) {
            KingOfCentralPlainsMsg.FightMap4.Builder map4Builder = KingOfCentralPlainsMsg.FightMap4.newBuilder();
            Map<Integer, FightData> map_4 = ((KingOfCentralPlainsData) worldDao.jsonData).map_4;

            for (Map.Entry<Integer, FightData> entry : map_4.entrySet()) {
                map4Builder.addFight4(this.toGroupFightData((FightData) entry.getValue(), (Integer) entry.getKey(), 10));
            }

            if (round >= 11 || ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 1) {
                for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_2.entrySet()) {
                    map4Builder.addFight2(this.toGroupFightData((FightData) entry.getValue(), (Integer) entry.getKey(), 11));
                }
            }

            builder.setMap4(map4Builder);
        }

        GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
        gamePlayer.sendMsg(builder.build());
    }

    @TaskMethod
    public void S2C_RankUiResult_9642(GamePlayer gamePlayer) {
        PvpDao pvpDao = (PvpDao) gamePlayer.getData("tb_pvp", gamePlayer.getPlayerId());
        KingOfCentralPlainsMsg.S2C_RankUiResult_9642.Builder builder = KingOfCentralPlainsMsg.S2C_RankUiResult_9642.newBuilder();
        builder.setThumbsUpNum(pvpDao.thumbsUps.size());
        if (this.rankMap.isEmpty()) {
            gamePlayer.sendMsg(builder.build());
        } else {
            WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
            FightPlayerData myData = (FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId());
            if (myData != null) {
                builder.setMyInfo(this.toRankInfo(gamePlayer.getPlayerId(), gamePlayer, myData.rank, myData.score, pvpDao.thumbsUps));
            }

            for (Map.Entry<Integer, FightPlayerData> entry : this.rankMap.entrySet()) {
                GamePlayer rankPlayer = this.worldMgr.getPlayerById(((FightPlayerData) entry.getValue()).playerId);
                if (rankPlayer != null) {
                    builder.addInfos(this.toRankInfo(gamePlayer.getPlayerId(), rankPlayer, ((FightPlayerData) entry.getValue()).rank, ((FightPlayerData) entry.getValue()).score, pvpDao.thumbsUps));
                }
            }

            gamePlayer.sendMsg(builder.build());
        }
    }

    @TaskMethod
    public void S2C_SeasonTopThreeResult_9644(GamePlayer gamePlayer) {
        PvpDao pvpDao = (PvpDao) gamePlayer.getData("tb_pvp", gamePlayer.getPlayerId());
        KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.Builder builder = KingOfCentralPlainsMsg.S2C_SeasonTopThreeResult_9644.newBuilder();
        PlayerExtend playerExtend = (PlayerExtend) gamePlayer.getPlayerExtend(13);
        builder.setTopRank(playerExtend.kingTopRank);
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        builder.setRound(((KingOfCentralPlainsData) worldDao.jsonData).round);
        builder.setThumbsUpNum(pvpDao.thumbsUps.size());
        String DateFormat = "yyyy-MM-dd";
        if (this.worldMgr.country.equals("id")) {
            DateFormat = "dd-MM-yyyy";
        }

        int[] state = this.getActivityState();
        builder.setSeasonTime(DateUtil.transferLongToDate((long) state[1] * 1000L, DateFormat));
        if (((KingOfCentralPlainsData) worldDao.jsonData).activityState == 2) {
            builder.setState(2);
            builder.setDownTime(0);
        } else {
            builder.setState(state[0]);
            builder.setDownTime(state[1]);
        }

        if (((KingOfCentralPlainsData) worldDao.jsonData).top3.isEmpty()) {
            for (RankData data : this.rankMgr.getRanks(RankDefine.RankModule.PVP, 3)) {
                GamePlayer rankPlayer = this.worldMgr.getPlayerById(data.value);
                if (rankPlayer != null) {
                    builder.addInfos(this.toRankInfo(gamePlayer.getPlayerId(), rankPlayer, data.rank, (int) data.score, pvpDao.thumbsUps));
                }
            }

            gamePlayer.sendMsg(builder.build());
        } else {
            FightPlayerData myData = (FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId());
            if (myData != null) {
                builder.setMyInfo(this.toRankInfo(gamePlayer.getPlayerId(), gamePlayer, myData.rank, myData.score, pvpDao.thumbsUps));
            }

            for (FightPlayerData fightPlayerData : ((KingOfCentralPlainsData) worldDao.jsonData).top3) {
                GamePlayer rankPlayer = this.worldMgr.getPlayerById(fightPlayerData.playerId);
                if (rankPlayer != null) {
                    builder.addInfos(this.toRankInfo(gamePlayer.getPlayerId(), rankPlayer, fightPlayerData.rank, fightPlayerData.score, pvpDao.thumbsUps));
                }
            }

            gamePlayer.sendMsg(builder.build());
        }
    }

    public KingOfCentralPlainsMsg.S2C_PopThreeRank_9664 toSeasonTopThreeBuilder() {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.Builder builder = KingOfCentralPlainsMsg.S2C_PopThreeRank_9664.newBuilder();
        builder.setStartTime((int) (((KingOfCentralPlainsData) worldDao.jsonData).startTime / 1000L));

        for (int i = 0; i < 3; ++i) {
            FightPlayerData fightPlayerData = (FightPlayerData) this.rankMap.get(i + 1);
            GamePlayer rankPlayer = this.worldMgr.getPlayerById(fightPlayerData.playerId);
            KingOfCentralPlainsMsg.PopRankInfo.Builder infoBuilder = KingOfCentralPlainsMsg.PopRankInfo.newBuilder();
            PlayerPublicDao playerDao = rankPlayer.getPublicDao();
            infoBuilder.setRank(i + 1);
            infoBuilder.setHead(playerDao.head);
            infoBuilder.setHeadFrame(playerDao.headFrame);
            infoBuilder.setLv(playerDao.lv);
            infoBuilder.setName(playerDao.playerName);
            infoBuilder.setPrestige(playerDao.prestige);
            infoBuilder.setMonarchid(playerDao.monarchId);
            infoBuilder.setServerId(playerDao.serverId);
            infoBuilder.setPlayerId(playerDao.playerId);
            builder.addInfos(infoBuilder);
        }

        return builder.build();
    }

    public void popSeasonTopThreeResult() {
        if (!this.worldMgr.getOnlinePlayer().isEmpty()) {
            KingOfCentralPlainsMsg.S2C_PopThreeRank_9664 buider = this.toSeasonTopThreeBuilder();

            for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
                gamePlayer.sendMsg(buider);
            }
        }

    }

    @TaskMethod
    public void popSeasonTopThreeForLogin(GamePlayer gamePlayer) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        long secondDay = ((KingOfCentralPlainsData) worldDao.jsonData).startTime + 86400000L;
        long curTime = System.currentTimeMillis();
        if (DateUtil.isSameDay(((KingOfCentralPlainsData) worldDao.jsonData).startTime, curTime) || DateUtil.isSameDay(secondDay, curTime)) {
            KingOfCentralPlainsMsg.S2C_PopThreeRank_9664 buider = this.toSeasonTopThreeBuilder();
            gamePlayer.sendMsg(buider);
        }
    }

    @TaskMethod
    public void C2S_PlayerKCPSettle_9661(GamePlayer gamePlayer) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).state == 2) {
            this.logger.info("活动正在进行中");
        } else if (!((KingOfCentralPlainsData) worldDao.jsonData).players128.containsKey(gamePlayer.getPlayerId())) {
            this.logger.info("玩家上期没有参加,id={}", gamePlayer.getPlayerId());
        } else {
            int rank = ((FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId())).rank;
            int fight = 6;
            int win = 0;

            for (Map.Entry<Integer, List<FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_trial.entrySet()) {
                for (FightData fightData : entry.getValue()) {
                    if (fightData.lId == gamePlayer.getPlayerId() || fightData.rId == gamePlayer.getPlayerId()) {
                        if (this.isWinFightData(fightData, gamePlayer.getPlayerId())) {
                            ++win;
                        }
                        break;
                    }
                }
            }

            boolean isHaveFight = false;

            label145:
            for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
                for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                    if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                        ++fight;
                        if (this.isWinFightData((FightData) subEntry.getValue(), gamePlayer.getPlayerId())) {
                            ++win;
                            isHaveFight = true;
                        }
                        break label145;
                    }
                }
            }

            if (isHaveFight) {
                isHaveFight = false;

                label128:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_16.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                            ++fight;
                            if (this.isWinFightData((FightData) subEntry.getValue(), gamePlayer.getPlayerId())) {
                                ++win;
                                isHaveFight = true;
                            }
                            break label128;
                        }
                    }
                }
            }

            if (isHaveFight) {
                isHaveFight = false;

                label112:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_8.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                            ++fight;
                            if (this.isWinFightData((FightData) subEntry.getValue(), gamePlayer.getPlayerId())) {
                                ++win;
                                isHaveFight = true;
                            }
                            break label112;
                        }
                    }
                }
            }

            if (isHaveFight) {
                isHaveFight = false;

                for (Map.Entry<Integer, FightData> subEntry : ((KingOfCentralPlainsData) worldDao.jsonData).map_4.entrySet()) {
                    if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                        ++fight;
                        if (this.isWinFightData((FightData) subEntry.getValue(), gamePlayer.getPlayerId())) {
                            ++win;
                            isHaveFight = true;
                        }
                        break;
                    }
                }
            }

            if (isHaveFight) {
                for (Map.Entry<Integer, FightData> subEntry : ((KingOfCentralPlainsData) worldDao.jsonData).map_2.entrySet()) {
                    if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                        ++fight;
                        if (this.isWinFightData((FightData) subEntry.getValue(), gamePlayer.getPlayerId())) {
                            ++win;
                        }
                        break;
                    }
                }
            }

            KingOfCentralPlainsMsg.S2C_PlayerKCPSettle_9662.Builder builder = KingOfCentralPlainsMsg.S2C_PlayerKCPSettle_9662.newBuilder();
            builder.setRank(rank);
            builder.setFight(fight);
            builder.setWin(win);
            gamePlayer.sendMsg(builder.build());
        }
    }

    public boolean isWinFightData(FightData fightData, int playerId) {
        if (fightData.lId == playerId) {
            if (fightData.win == 0) {
                return true;
            }
        } else if (fightData.win == 1) {
            return true;
        }

        return false;
    }

    @TaskMethod
    public void S2C_MyRecordResult_9604(GamePlayer gamePlayer) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        FightPlayerData fightPlayerData = (FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(gamePlayer.getPlayerId());
        if (fightPlayerData == null) {
            this.logger.info("玩家不在活动名单中");
        } else {
            List<FightData> fightDataList = new ArrayList();
            if (fightPlayerData.roudRank <= 2) {
                for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_2.entrySet()) {
                    if (((FightData) entry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) entry.getValue()).rId == gamePlayer.getPlayerId()) {
                        fightDataList.add(entry.getValue());
                        break;
                    }
                }
            }

            if (fightPlayerData.roudRank <= 4) {
                for (Map.Entry<Integer, FightData> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_4.entrySet()) {
                    if (((FightData) entry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) entry.getValue()).rId == gamePlayer.getPlayerId()) {
                        fightDataList.add(entry.getValue());
                        break;
                    }
                }
            }

            if (fightPlayerData.roudRank <= 8) {
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_8.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                            fightDataList.add(subEntry.getValue());
                            break;
                        }
                    }
                }
            }

            if (fightPlayerData.roudRank <= 16) {
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_16.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                            fightDataList.add(subEntry.getValue());
                            break;
                        }
                    }
                }
            }

            if (fightPlayerData.roudRank <= 32) {
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).lId == gamePlayer.getPlayerId() || ((FightData) subEntry.getValue()).rId == gamePlayer.getPlayerId()) {
                            fightDataList.add(subEntry.getValue());
                            break;
                        }
                    }
                }
            }

            for (int i = 6; i > 0; --i) {
                List<FightData> list = ((KingOfCentralPlainsData) worldDao.jsonData).map_trial.get(i);
                if (list != null && list.size() != 0) {
                    for (FightData fightData : list) {
                        if (fightData.lId == gamePlayer.getPlayerId() || fightData.rId == gamePlayer.getPlayerId()) {
                            fightDataList.add(fightData);
                            break;
                        }
                    }
                }
            }

            if (fightDataList.size() == 0) {
                this.logger.info("没有查询到战斗记录");
            } else {
                KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.Builder builder = KingOfCentralPlainsMsg.S2C_MyRecordResult_9604.newBuilder();

                for (FightData fightData : fightDataList) {
                    if (fightData.round != ((KingOfCentralPlainsData) worldDao.jsonData).round || ((KingOfCentralPlainsData) worldDao.jsonData).activityState != 2) {
                        builder.addInfos(this.toFightRecordInfo(fightData, gamePlayer.getPlayerId()));
                    }
                }

                gamePlayer.sendMsg(builder.build());
            }
        }
    }

    public void updateOdds(int wagerSide, int wagerNum, int playerId) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        double temp = NumberUtil.div((double) ((KingOfCentralPlainsData) worldDao.jsonData).leftWagerNum, (double) ((KingOfCentralPlainsData) worldDao.jsonData).totalWagerNum, 2);
        double tempLeftOdds = (double) 2.0F - temp * (double) 0.5F;
        if (tempLeftOdds < 1.51) {
            tempLeftOdds = 1.51;
        } else if (tempLeftOdds > 1.99) {
            tempLeftOdds = 1.99;
        }

        ((KingOfCentralPlainsData) worldDao.jsonData).leftOdds = NumberUtil.round(tempLeftOdds, 2).doubleValue();
        ((KingOfCentralPlainsData) worldDao.jsonData).rightOdds = NumberUtil.round((double) 3.5F - tempLeftOdds, 2).doubleValue();
        worldDao.updateOp();
        double newLeftOdds = ((KingOfCentralPlainsData) worldDao.jsonData).leftOdds;
        double newRightOdds = ((KingOfCentralPlainsData) worldDao.jsonData).rightOdds;

        for (GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (((KingOfCentralPlainsData) worldDao.jsonData).players128.containsKey(gamePlayer.getPlayerId()) && playerId != gamePlayer.getPlayerId()) {
                KingOfCentralPlainsMsg.S2C_GuessPush_9616.Builder builder = KingOfCentralPlainsMsg.S2C_GuessPush_9616.newBuilder();
                builder.setLeftOdds(newLeftOdds);
                builder.setRightOdds(newRightOdds);
                gamePlayer.sendMsg(builder.build());
            }
        }

    }

    public FightData getFightDataByPlayerId(int round, int playerId) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        switch (round) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                for (FightData data : ((KingOfCentralPlainsData) worldDao.jsonData).map_trial.get(round)) {
                    if (data.lId == playerId || data.rId == playerId) {
                        return data;
                    }
                }
                break;
            case 7:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_32.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).rId == playerId || ((FightData) subEntry.getValue()).lId == playerId) {
                            return (FightData) subEntry.getValue();
                        }
                    }
                }
                break;
            case 8:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_16.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).rId == playerId || ((FightData) subEntry.getValue()).lId == playerId) {
                            return (FightData) subEntry.getValue();
                        }
                    }
                }
                break;
            case 9:
                for (Map.Entry<Integer, Map<Integer, FightData>> entry : ((KingOfCentralPlainsData) worldDao.jsonData).map_8.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).rId == playerId || ((FightData) subEntry.getValue()).lId == playerId) {
                            return (FightData) subEntry.getValue();
                        }
                    }
                }
                break;
            case 10:
                for (Map.Entry<Integer, FightData> subEntry : ((KingOfCentralPlainsData) worldDao.jsonData).map_4.entrySet()) {
                    if (((FightData) subEntry.getValue()).rId == playerId || ((FightData) subEntry.getValue()).lId == playerId) {
                        return (FightData) subEntry.getValue();
                    }
                }
                break;
            case 11:
                for (Map.Entry<Integer, FightData> subEntry : ((KingOfCentralPlainsData) worldDao.jsonData).map_2.entrySet()) {
                    if (((FightData) subEntry.getValue()).rId == playerId || ((FightData) subEntry.getValue()).lId == playerId) {
                        return (FightData) subEntry.getValue();
                    }
                }
        }

        return null;
    }

    public long nextOpenTime(long currentTime, long[] openTime) {
        long secondDayTime = openTime[0];
        long fiveDayTime = openTime[1];
        long resultTime = 0L;
        if (currentTime < secondDayTime + 75900000L) {
            resultTime = secondDayTime;
        } else if (currentTime < fiveDayTime + 75900000L) {
            resultTime = fiveDayTime;
        } else {
            long nextSecondDayTime = secondDayTime + 604800000L;
            resultTime = nextSecondDayTime;
        }

        return resultTime;
    }

    public int[] getActivityState() {
        int[] result = new int[2];
        long currentTime = System.currentTimeMillis();
        LocalDate localDate = LocalDate.now();
        if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
            if (DateUtil.isSameDay(System.currentTimeMillis(), this.worldMgr.getOpenServerTime())) {
                result[0] = 0;
                Date date = DateUtil.getNextWeekDay(currentTime, 1);
                result[1] = (int) ((date.getTime() + 75900000L) / 1000L);
                return result;
            } else {
                long activityEndTime = (long) (75900000 + this.getTotalActivityTime());
                long mondayTime = DateUtil.getSomeDayBeginTime(currentTime);
                if (currentTime >= mondayTime + activityEndTime) {
                    this.logger.info("活动已结束，当前时间={}", DateUtil.transferLongToDate(currentTime));
                    result[0] = 3;
                    Date date = DateUtil.getNextWeekDay(currentTime, 1);
                    result[1] = (int) ((date.getTime() + 75900000L) / 1000L);
                    return result;
                } else if (currentTime >= mondayTime + 75900000L) {
                    this.logger.info("活动正在进行中，当前时间={}", DateUtil.transferLongToDate(currentTime));
                    result[0] = 2;
                    result[1] = (int) ((mondayTime + activityEndTime) / 1000L);
                    return result;
                } else {
                    this.logger.info("活动当天准备中，当前时间={}", DateUtil.transferLongToDate(currentTime));
                    result[0] = 1;
                    result[1] = (int) ((mondayTime + 75900000L) / 1000L);
                    return result;
                }
            }
        } else {
            result[0] = 3;
            Date date = DateUtil.getNextWeekDay(currentTime, 1);
            result[1] = (int) ((date.getTime() + 75900000L) / 1000L);
            return result;
        }
    }

    public KingOfCentralPlainsMsg.FightRecordInfo.Builder toFightRecordInfo(FightData fightData, int playerId) {
        KingOfCentralPlainsMsg.FightRecordInfo.Builder builder = KingOfCentralPlainsMsg.FightRecordInfo.newBuilder();
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        builder.setRond(fightData.round);
        FightPlayerData fightPlayerData = (FightPlayerData) ((KingOfCentralPlainsData) worldDao.jsonData).players128.get(playerId);
        builder.setSocre(fightPlayerData.score);
        if (fightData.lId == playerId) {
            builder.setLeftId(fightData.lId);
            builder.setRightId(fightData.rId);
            GamePlayer leftPlayer = this.worldMgr.getPlayerById(fightData.lId);
            PlayerPublicDao leftPlayerDao = leftPlayer.getPublicDao();
            builder.setLeftName(leftPlayerDao.playerName);
            builder.setLeftHead(leftPlayerDao.head);
            GamePlayer rightPlayer = this.worldMgr.getPlayerById(fightData.rId);
            PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
            builder.setRightName(rightPlayerDao.playerName);
            builder.setRightHead(rightPlayerDao.head);
            builder.setWin(fightData.win);
            builder.setRecordId(fightData.record);
            builder.setSocre(fightData.win == 0 ? fightData.winScore : 0);
            builder.setStartTime(0);
        } else {
            builder.setLeftId(fightData.rId);
            builder.setRightId(fightData.lId);
            GamePlayer leftPlayer = this.worldMgr.getPlayerById(fightData.rId);
            PlayerPublicDao leftPlayerDao = leftPlayer.getPublicDao();
            builder.setLeftName(leftPlayerDao.playerName);
            builder.setLeftHead(leftPlayerDao.head);
            GamePlayer rightPlayer = this.worldMgr.getPlayerById(fightData.lId);
            PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
            builder.setRightName(rightPlayerDao.playerName);
            builder.setRightHead(rightPlayerDao.head);
            builder.setWin(fightData.win == 0 ? 1 : 0);
            builder.setRecordId(fightData.record);
            builder.setSocre(fightData.win == 0 ? 0 : fightData.winScore);
            builder.setStartTime(0);
        }

        return builder;
    }

    public KingOfCentralPlainsMsg.RankInfo.Builder toRankInfo(int myPlayerId, GamePlayer gamePlayer, int rank, int score, List<Integer> thumbsUps) {
        KingOfCentralPlainsMsg.RankInfo.Builder builder = KingOfCentralPlainsMsg.RankInfo.newBuilder();
        PlayerPublicDao playerDao = gamePlayer.getPublicDao();
        builder.setRank(rank);
        builder.setHead(playerDao.head);
        builder.setHeadFrame(playerDao.headFrame);
        builder.setLv(playerDao.lv);
        builder.setName(playerDao.playerName);
        builder.setPower(gamePlayer.getPlayerCombatPower());
        PvpDao pvpDao = (PvpDao) gamePlayer.getData("tb_pvp", gamePlayer.getPlayerId());
        builder.setThumbsNum(pvpDao.weekBeThumbsupNum);
        builder.setSocre(score);
        builder.setPlayerId(gamePlayer.getPlayerId());
        builder.setPrestige(playerDao.prestige);
        builder.setMonarchid(playerDao.monarchId);
        boolean isThumbsUp = false;
        if (gamePlayer.getPlayerId() == myPlayerId || thumbsUps.contains(gamePlayer.getPlayerId())) {
            isThumbsUp = true;
        }

        builder.setIsThumbsUp(isThumbsUp);
        return builder;
    }

    public KingOfCentralPlainsMsg.FightData.Builder toFightData(FightData fightData, boolean isNeedFightRecord) {
        boolean isShowWin = false;
        boolean isShowRecord = false;
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 1) {
            isShowWin = true;
            isShowRecord = true;
        } else if (((KingOfCentralPlainsData) worldDao.jsonData).round > fightData.round) {
            isShowWin = true;
            isShowRecord = true;
        } else if (((KingOfCentralPlainsData) worldDao.jsonData).round == fightData.round && ((KingOfCentralPlainsData) worldDao.jsonData).state == 3) {
            isShowRecord = true;
        }

        KingOfCentralPlainsMsg.FightData.Builder builder = KingOfCentralPlainsMsg.FightData.newBuilder();
        GamePlayer leftPlayer = this.worldMgr.getPlayerById(fightData.lId);
        GamePlayer rightPlayer = this.worldMgr.getPlayerById(fightData.rId);
        if (isShowWin) {
            builder.setWin(fightData.win);
        } else {
            builder.setWin(-1);
        }

        BattleMsg.S2C_BattleResult_6102.Builder battleMsg = null;
        if (isShowRecord) {
            builder.setRecordId(fightData.record);
            if (isNeedFightRecord) {
                battleMsg = this.getBattleResult(fightData.record);
            }
        }

        if (battleMsg == null) {
            ArrayingMirror left = null;
            ArrayingMirror right = null;
            if (leftPlayer.isRobot()) {
                left = (ArrayingMirror) this.arrayingMap.get(leftPlayer.getPlayerId());
                if (left == null) {
                    left = leftPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                }
            } else {
                if (((KingOfCentralPlainsData) worldDao.jsonData).state != 1 && ((KingOfCentralPlainsData) worldDao.jsonData).state != 0) {
                    left = (ArrayingMirror) this.arrayingMap.get(leftPlayer.getPlayerId());
                } else {
                    left = leftPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_KING_PLAINS);
                }

                if (left == null || left.arrayingHeroIsEmpty()) {
                    left = leftPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                }
            }

            if (rightPlayer.isRobot()) {
                right = (ArrayingMirror) this.arrayingMap.get(rightPlayer.getPlayerId());
                if (right == null) {
                    right = rightPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                }
            } else {
                if (((KingOfCentralPlainsData) worldDao.jsonData).state != 1 && ((KingOfCentralPlainsData) worldDao.jsonData).state != 0) {
                    right = (ArrayingMirror) this.arrayingMap.get(rightPlayer.getPlayerId());
                } else {
                    right = rightPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_KING_PLAINS);
                }

                if (right == null || right.arrayingHeroIsEmpty()) {
                    right = rightPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                }
            }

            builder.setLeftPlayerInfo(leftPlayer.toPlayerInfo(left));
            builder.setRightPlayerInfo(rightPlayer.toPlayerInfo(right));
        } else {
            builder.setResult(battleMsg.build());
        }

        return builder;
    }

    public BattleMsg.S2C_BattleResult_6102.Builder getBattleResult(int recordId) {
        try {
            BattleRecordDao battleRecordDao = this.battleRecordMgr.getBattleRecordDao(recordId);
            if (battleRecordDao != null) {
                return battleRecordDao.toS2C_BattleResult_6102(false);
            }
        } catch (InvalidProtocolBufferException e) {
            this.logger.error("录像ID={}", recordId);
            e.printStackTrace();
        }

        return null;
    }

    public KingOfCentralPlainsMsg.GroupFightData.Builder toGroupFightData(FightData fightData, int index, int mapRound) {
        KingOfCentralPlainsMsg.GroupFightData.Builder builder = KingOfCentralPlainsMsg.GroupFightData.newBuilder();
        builder.setIndex(index);
        GamePlayer leftPlayer = this.worldMgr.getPlayerById(fightData.lId);
        GamePlayer rightPlayer = this.worldMgr.getPlayerById(fightData.rId);
        PlayerPublicDao leftPlayerDao = leftPlayer.getPublicDao();
        PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
        builder.setLeftName(leftPlayerDao.playerName);
        builder.setRightName(rightPlayerDao.playerName);
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).round != mapRound || ((KingOfCentralPlainsData) worldDao.jsonData).activityEnd == 1) {
            builder.setWin(fightData.win);
            builder.setRecordId(fightData.record);
        }

        builder.setLeftHead(leftPlayerDao.head);
        builder.setLeftServerId(leftPlayer.getServerId());
        builder.setLeftPlayerId(leftPlayer.getPlayerId());
        builder.setRightHead(rightPlayerDao.head);
        builder.setRightServerId(rightPlayer.getServerId());
        builder.setRightPlayerId(rightPlayer.getPlayerId());
        builder.setStartTime(0);
        return builder;
    }

    public KingOfCentralPlainsMsg.GuessInfo.Builder toGuessInfo(int round, int playerId) {
        KingOfCentralPlainsMsg.GuessInfo.Builder builder = KingOfCentralPlainsMsg.GuessInfo.newBuilder();
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        Map<Integer, GuessData> guessDataMap = ((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round);
        if (guessDataMap == null) {
            return builder;
        } else {
            GuessData guessData = (GuessData) guessDataMap.get(playerId);
            if (guessData == null) {
                return builder;
            } else {
                FightData fightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
                builder.setWagerSide(fightData.lId == guessData.wagerId ? 0 : 1);
                builder.setWagerNum(guessData.wagerNum);
                return builder;
            }
        }
    }

    public KingOfCentralPlainsMsg.GuessRecordInfo.Builder toGuessRecordInfo(int round, GuessData guessData) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        FightData fightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
        KingOfCentralPlainsMsg.GuessRecordInfo.Builder builder = KingOfCentralPlainsMsg.GuessRecordInfo.newBuilder();
        builder.setRound(round);
        GamePlayer leftPlayer = this.worldMgr.getPlayerById(fightData.lId);
        PlayerPublicDao leftPlayerDao = leftPlayer.getPublicDao();
        builder.setLeftId(fightData.lId);
        builder.setLeftName(leftPlayerDao.playerName);
        builder.setLeftHead(leftPlayerDao.head);
        builder.setLeftLv(leftPlayerDao.lv);
        GamePlayer rightPlayer = this.worldMgr.getPlayerById(fightData.rId);
        PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
        builder.setRightId(fightData.rId);
        builder.setRightName(rightPlayerDao.playerName);
        builder.setRightHead(rightPlayerDao.head);
        builder.setRightLv(rightPlayerDao.lv);
        builder.setWin(guessData.winNum == 0 ? -1 : fightData.win);
        builder.setWagerName(fightData.win == 0 ? leftPlayerDao.playerName : rightPlayerDao.playerName);
        builder.setSocre(guessData.wagerNum);
        builder.setRecordId(fightData.record);
        builder.setWinNum(guessData.winNum);
        builder.setStartTIme(0);
        return builder;
    }

    public void gmOpenOpenGuessUi(GamePlayer gamePlayer, int round) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.Builder builder = KingOfCentralPlainsMsg.S2C_GuessUiResult_9612.newBuilder();
        builder.setLeftOdds(((KingOfCentralPlainsData) worldDao.jsonData).leftOdds);
        builder.setRightOdds(((KingOfCentralPlainsData) worldDao.jsonData).rightOdds);
        FightData fightData = (FightData) ((KingOfCentralPlainsData) worldDao.jsonData).guessFightDataMap.get(round);
        if (fightData != null) {
            builder.setFight(this.toFightData(fightData, true));
            builder.setGuessInfo(this.toGuessInfo(round, gamePlayer.getPlayerId()));
        }

        gamePlayer.sendMsg(builder.build());
    }

    public void clearPlayerGuessInfo(GamePlayer gamePlayer) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
        if (((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round) != null) {
            GuessData guessData = (GuessData) (((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round)).get(gamePlayer.getPlayerId());
            if (guessData != null) {
                (((KingOfCentralPlainsData) worldDao.jsonData).guessData.get(round)).remove(gamePlayer.getPlayerId());
            }

        }
    }

    public void testClear() {
        this.clearActivity();
    }

    public void rankreward() {
        this.runRankAward(38, 3805);
    }

    @TaskMethod
    public void C2S_GuessUi_9611(GamePlayer gamePlayer) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (!((KingOfCentralPlainsData) worldDao.jsonData).givePlainsPlayerIds.contains(gamePlayer.getPlayerId())) {
            ((KingOfCentralPlainsData) worldDao.jsonData).givePlainsPlayerIds.add(gamePlayer.getPlayerId());
            gamePlayer.pushTaskEx("kingOfCp_C2S_GuessUi_9611", new Object[0]);
        } else {
            this.openGuessUi(gamePlayer.getPlayerId());
        }

    }

    public boolean isFightPlayer(int playerId) {
        WorldDao<KingOfCentralPlainsData> worldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
        if (((KingOfCentralPlainsData) worldDao.jsonData).activityState == 2 && ((KingOfCentralPlainsData) worldDao.jsonData).state == 2) {
            int round = ((KingOfCentralPlainsData) worldDao.jsonData).round;
            if (round >= 1 && round <= 6) {
                if (((KingOfCentralPlainsData) worldDao.jsonData).players128.containsKey(playerId)) {
                    return true;
                }
            } else if (round != 7 && round != 8 && round != 9) {
                if (round == 10 || round == 11) {
                    Map<Integer, FightData> tempMap = new HashMap();
                    if (round == 10) {
                        tempMap = ((KingOfCentralPlainsData) worldDao.jsonData).map_4;
                    } else if (round == 11) {
                        tempMap = ((KingOfCentralPlainsData) worldDao.jsonData).map_2;
                    }

                    for (Map.Entry<Integer, FightData> entry : tempMap.entrySet()) {
                        if (((FightData) entry.getValue()).lId == playerId || ((FightData) entry.getValue()).rId == playerId) {
                            return true;
                        }
                    }
                }
            } else {
                Map<Integer, Map<Integer, FightData>> tempMap = new HashMap();
                if (round == 7) {
                    tempMap = ((KingOfCentralPlainsData) worldDao.jsonData).map_32;
                } else if (round == 8) {
                    tempMap = ((KingOfCentralPlainsData) worldDao.jsonData).map_16;
                } else if (round == 9) {
                    tempMap = ((KingOfCentralPlainsData) worldDao.jsonData).map_8;
                }

                for (Map.Entry<Integer, Map<Integer, FightData>> entry : tempMap.entrySet()) {
                    for (Map.Entry<Integer, FightData> subEntry : (entry.getValue()).entrySet()) {
                        if (((FightData) subEntry.getValue()).lId == playerId || ((FightData) subEntry.getValue()).rId == playerId) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public int getTotalActivityTime() {
        int readyTime = this.configManager.getIntDefault("heroRivalReadyTime", 30) * 1000;
        int guessTime = this.configManager.getIntDefault("heroRivalGuessTime", 90) * 1000;
        int fightTime = this.configManager.getIntDefault("heroRivalBattleTime", 180) * 1000;
        return (readyTime + guessTime + fightTime) * 11;
    }
}
