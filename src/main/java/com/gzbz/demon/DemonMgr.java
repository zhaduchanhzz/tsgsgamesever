package com.gzbz.demon;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.DemonActivityDao;
import com.gzbz.db.DemonBossDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.demon.bean.ArrayingEntityComparator;
import com.gzbz.demon.bean.DemonBossData;
import com.gzbz.demon.bean.DemonBossDataComparator;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.model.FengmoBattleModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DemonMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class DemonMgr extends GameMgr {
   static final Logger logger = LoggerFactory.getLogger(DemonMgr.class);
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private ActivityMgr activityMgr;
   @Autowired
   private OnLineMgr onLineMgr;
   public static final int DEMON_BOSS_TYPE = 1;
   public Set<Integer> inBossPlayers = new HashSet();

   protected void init() throws Exception {
   }

   public DemonBossDao getBossDao() {
      DemonBossDao demonBossDao = (DemonBossDao)this.gameCachePool.getData("tb_demon_boss", new Object[]{1});
      if (demonBossDao.bossLev == 0) {
         demonBossDao.bossLev = 1;
         demonBossDao.updateOp();
      }

      return demonBossDao;
   }

   @TaskMethod
   public void buildCopyInfo(GamePlayer player, DemonActivityDao demonActivityDao) {
      DemonBossDao bossDao = this.getBossDao();
      DemonMsg.S2C_DemonCopyInfo_4802.Builder builder = DemonMsg.S2C_DemonCopyInfo_4802.newBuilder();
      if (this.checkOpen()) {
         builder.setIsOpen(true);
      } else {
         builder.setIsOpen(false);
      }

      builder.setBuff(demonActivityDao.buff);
      builder.setFightNum(demonActivityDao.fightNum);
      builder.setBuyFightNum(demonActivityDao.buyFightNum);
      builder.addAllCopyIds(demonActivityDao.copyIds);
      builder.setRefreshCopyNum(demonActivityDao.refreshCopyNum);
      builder.setTokenNum(bossDao.tokenNum);
      builder.addAllBuffAward(demonActivityDao.buffAward);
      PlayerDao playerDao = player.getPlayerDao();
      builder.setMaxPoint(playerDao.fengmo_point);
      builder.addAllReceiveTaskId(demonActivityDao.receiveTask);
      builder.addAllFightCopys(demonActivityDao.fightCopys);
      player.sendMsg(builder.build());
   }

   @TaskMethod
   public void buildBossInfo(GamePlayer player, DemonActivityDao demonActivityDao) {
      DemonMsg.S2C_DemonBossInfo_4804.Builder builder = DemonMsg.S2C_DemonBossInfo_4804.newBuilder();
      if (this.checkOpen()) {
         builder.setIsOpen(true);
      } else {
         builder.setIsOpen(false);
      }

      DemonBossDao bossDao = this.getBossDao();
      builder.setTotalDamage(bossDao.damage);
      builder.setFightBossNum(demonActivityDao.bossFightNum);
      builder.setRandHeroNum(demonActivityDao.randHeroNum);
      builder.addAllReceiveBox(demonActivityDao.receiveBox);
      builder.setTokenNum(bossDao.tokenNum);
      builder.setBossLev(bossDao.bossLev);
      builder.setBuff(demonActivityDao.buff);
      builder.addAllRandRule(demonActivityDao.randRule);
      builder.addAllBuffAward(demonActivityDao.buffAward);
      int myRank = 0;

      for(RankData rankData : this.getDamageRanks(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, 3)) {
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
            if (rankData.value == player.getPlayerId()) {
               myRank = rankData.rank;
               builder.setMyRank(rankMsg);
            }
         }

         builder.addRanks(rankMsg);
      }

      if (myRank == 0) {
         RankPart rankPart = (RankPart)player.getMgrPart(RankPart.class);
         myRank = this.getDamageRank(player.getPlayerId());
         RankData myRankData = new RankData(this.rankMgr.getScore(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, player.getPlayerId()), myRank, player.getPlayerId());
         builder.setMyRank(rankPart.buildPlayerRankDataMsg(myRankData, RankDefine.RankModule.DEMON_BOSS_DAY_HURT));
      }

      for(byte[] bytes : demonActivityDao.joinHero) {
         HeroMirror mirror = HeroMirror.toHeroMirror(bytes);
         builder.addHeros(mirror.toBuilder());
      }

      for(DemonBossData bossData : demonActivityDao.hitHero) {
         DemonMsg.RandHeroData.Builder heroBuilder = DemonMsg.RandHeroData.newBuilder();
         heroBuilder.setHeroPlayerId(bossData.playerId);
         heroBuilder.setHeroPlayerName(bossData.playerName);
         HeroMirror mirror = HeroMirror.toHeroMirror(bossData.bytes);
         heroBuilder.setHeroInfo(mirror.toBuilder());
         heroBuilder.setIsSelect(true);
         builder.addSelHeros(heroBuilder);
      }

      player.sendMsg(builder.build());
      this.inBossPlayers.add(player.getPlayerId());
   }

   @TaskMethod
   public void leaveBossUI(GamePlayer player) {
      if (this.inBossPlayers.contains(player.getPlayerId())) {
         this.inBossPlayers.remove(player.getPlayerId());
      }

   }

   public int getDamageRank(int player) {
      return this.rankMgr.getRank(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, player);
   }

   @TaskMethod
   public void fightBoss(GamePlayer player, DemonActivityDao demonActivityDao, long damage) {
      DemonBossDao bossDao = this.getBossDao();
      FengmoBattleModel model = (FengmoBattleModel)player.getGameModelPool().getEntity("fengmoBattle", bossDao.bossLev);
      if (model == null) {
         bossDao.bossLev = 1;
      } else {
         long score = this.rankMgr.getScore(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, player.getPlayerId());
         long totalDamage = score + damage;
         this.updatedDamageRank(player.getPlayerId(), totalDamage);
         DemonMsg.S2C_NotifyBossBattle_4846.Builder builder4846 = DemonMsg.S2C_NotifyBossBattle_4846.newBuilder();
         builder4846.setBossFightNum(demonActivityDao.bossFightNum);
         builder4846.setBossLev(bossDao.bossLev);
         builder4846.setTotalDamage(bossDao.damage);
         player.sendMsg(builder4846.build());
         if (damage + bossDao.damage >= model.getDamageValue()) {
            if (model.getNextId() != 0) {
               bossDao.bossLev = model.getNextId();
               bossDao.damage = 0L;
               DemonMsg.S2C_NotifyBoss_4825.Builder builder = DemonMsg.S2C_NotifyBoss_4825.newBuilder();
               builder.setBossLev(bossDao.bossLev);
               builder.setTotalDamage(bossDao.damage);
               this.builderRankThree(builder);
               this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
            } else {
               bossDao.damage += damage;
               DemonMsg.S2C_NotifyBoss_4825.Builder builder = DemonMsg.S2C_NotifyBoss_4825.newBuilder();
               builder.setBossLev(bossDao.bossLev);
               builder.setTotalDamage(bossDao.damage);
               this.builderRankThree(builder);
               this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
            }
         } else {
            bossDao.damage += damage;
            DemonMsg.S2C_NotifyBoss_4825.Builder builder = DemonMsg.S2C_NotifyBoss_4825.newBuilder();
            builder.setBossLev(bossDao.bossLev);
            builder.setTotalDamage(bossDao.damage);
            this.builderRankThree(builder);
            this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
         }

         bossDao.updateOp();
      }
   }

   public void builderRankThree(DemonMsg.S2C_NotifyBoss_4825.Builder builder) {
      for(RankData rankData : this.getDamageRanks(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, 3)) {
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
         }

         builder.addRanks(rankMsg);
      }

   }

   public void updatedDamageRank(int playerId, long damage) {
      if (damage >= 0L) {
         this.rankMgr.updateRank(RankDefine.RankModule.DEMON_BOSS_DAY_HURT, damage, playerId);
      }
   }

   public boolean checkOpen() {
      ActivityInfo activityData = this.activityMgr.getActivityInfo(24);
      return activityData != null && activityData.open;
   }

   @TaskMethod
   public void updateTokenNum(GamePlayer gamePlayer, int num, DemonActivityDao demonActivityDao) {
      DemonBossDao bossDao = this.getBossDao();
      bossDao.tokenNum += num;
      bossDao.updateOp();
      DemonMsg.S2C_NotifyCopyBattle_4823.Builder builder = DemonMsg.S2C_NotifyCopyBattle_4823.newBuilder();
      builder.setBuyFightNum(demonActivityDao.buyFightNum);
      builder.setFightNum(demonActivityDao.fightNum);
      builder.setTokenNum(bossDao.tokenNum);
      builder.setMaxPoint(demonActivityDao.maxPoint);
      builder.addAllFightCopys(demonActivityDao.fightCopys);
      gamePlayer.sendMsg(builder.build());
   }

   @TaskMethod
   public void delPoolHero(GamePlayer player, int heroCode) {
      DemonBossDao bossDao = this.getBossDao();
      if (bossDao.heroMap.containsKey(player.getPlayerId())) {
         ArrayList<DemonBossData> list = (ArrayList)bossDao.heroMap.get(player.getPlayerId());
         Iterator<DemonBossData> it = list.iterator();

         while(it.hasNext()) {
            DemonBossData data = (DemonBossData)it.next();
            if (data.heroCode == heroCode) {
               it.remove();
            }
         }
      }

      bossDao.updateOp();
   }

   @TaskMethod
   public void oneHeroInfo(GamePlayer player, int heroPlayerId, int heroCode) {
      DemonBossDao bossDao = this.getBossDao();
      DemonMsg.S2C_OneHeroInfo_4831.Builder builder = DemonMsg.S2C_OneHeroInfo_4831.newBuilder();
      if (bossDao.heroMap.containsKey(heroPlayerId)) {
         for(DemonBossData bossData : (ArrayList)bossDao.heroMap.get(heroPlayerId)) {
            if (bossData.heroCode == heroCode) {
               HeroMirror mirror = HeroMirror.toHeroMirror(bossData.bytes);
               builder.setInfo(mirror.toBuilder());
               break;
            }
         }
      }

      builder.setHeroCode(heroCode);
      builder.setHeroPlayerId(heroPlayerId);
      player.sendMsg(builder.build());
   }

   @TaskMethod
   public void addPoolHero(GamePlayer player, DemonBossData data) {
      DemonBossDao bossDao = this.getBossDao();
      if (bossDao.heroMap.containsKey(player.getPlayerId())) {
         Iterator<DemonBossData> it = ((ArrayList)bossDao.heroMap.get(player.getPlayerId())).iterator();

         while(it.hasNext()) {
            DemonBossData bossData = (DemonBossData)it.next();
            if (bossData.playerId == data.playerId && bossData.heroCode == data.heroCode) {
               it.remove();
            }
         }

         if (((ArrayList)bossDao.heroMap.get(player.getPlayerId())).size() >= 2) {
            ((ArrayList)bossDao.heroMap.get(player.getPlayerId())).remove(0);
            ((ArrayList)bossDao.heroMap.get(player.getPlayerId())).add(data);
         } else {
            ((ArrayList)bossDao.heroMap.get(player.getPlayerId())).add(data);
         }
      } else {
         ArrayList<DemonBossData> byteList = new ArrayList();
         byteList.add(data);
         bossDao.heroMap.put(player.getPlayerId(), byteList);
      }

      bossDao.updateOp();
   }

   @TaskMethod
   public void randPoolHero(GamePlayer player, DemonActivityDao demonActivityDao, int type) {
      List<Integer> rule = new ArrayList();

      for(int i = 1; i <= 4; ++i) {
         rule.add(i);
      }

      if (!demonActivityDao.randRule.isEmpty() && demonActivityDao.randRule.size() == 4) {
         rule.clear();
         rule.addAll(demonActivityDao.randRule);
      }

      int firstType = (Integer)rule.get(0);
      int secondType = (Integer)rule.get(1);
      int thirdType = (Integer)rule.get(2);
      int fourType = (Integer)rule.get(3);
      List<DemonBossData> list = new ArrayList();
      List<DemonBossData> list1 = this.randHeroByType(3, player.getPlayerId(), firstType, demonActivityDao.randExist);
      if (list1.isEmpty()) {
         demonActivityDao.randExist.clear();
         demonActivityDao.updateOp();
      }

      list.addAll(list1);
      List<DemonBossData> list2 = this.randHeroByType(1 + (3 - list1.size()), player.getPlayerId(), secondType, (List)null);
      list.addAll(list2);
      List<DemonBossData> list3 = this.randHeroByType(5 - list.size(), player.getPlayerId(), thirdType, (List)null);
      list.addAll(list3);
      if (list.size() < 5) {
         List<DemonBossData> list4 = this.randHeroByType(5 - list.size(), player.getPlayerId(), fourType, (List)null);
         list.addAll(list4);
      }

      if (type == 1) {
         player.pushPartTaskEx(DemonActivityPart.class, "freeRandHeroResult", new Object[]{list});
      } else {
         player.pushPartTaskEx(DemonActivityPart.class, "randHeroResult", new Object[]{list});
      }

   }

   public List<DemonBossData> randHeroByType(int heroNum, int playerId, int heroType, List<Long> existHero) {
      DemonBossDao bossDao = this.getBossDao();
      List<DemonBossData> resultList = new ArrayList();
      List<DemonBossData> tempList = new ArrayList();

      for(Map.Entry<Integer, ArrayList<DemonBossData>> entry : bossDao.heroMap.entrySet()) {
         if ((Integer)entry.getKey() != playerId) {
            for(DemonBossData bossData : (ArrayList)entry.getValue()) {
               if (bossData.heroType == heroType && (existHero == null || !existHero.contains(bossData.heroFlag))) {
                  tempList.add(bossData);
               }
            }
         }
      }

      int count = tempList.size();
      if (count <= heroNum) {
         resultList.addAll(tempList);
      } else {
         int flag = 0;

         while(resultList.size() < heroNum && flag < 600) {
            ++flag;
            DemonBossData hero = (DemonBossData)tempList.get(RandomUtil.randInt(count));
            if (!resultList.contains(hero)) {
               resultList.add(hero);
            }
         }
      }

      return resultList;
   }

   @TaskMethod
   public void heroPoolInfo(GamePlayer player) {
      int maxNum = this.configManager.getIntDefault("heroGroupNum", 500);
      List<DemonBossData> list = this.randHero(maxNum, -1);
      Collections.sort(list, new DemonBossDataComparator());
      DemonMsg.S2C_HeroPool_4829.Builder builder = DemonMsg.S2C_HeroPool_4829.newBuilder();

      for(DemonBossData data : list) {
         DemonMsg.HeroData.Builder heroBuilder = DemonMsg.HeroData.newBuilder();
         heroBuilder.setHeroCode(data.heroCode);
         heroBuilder.setHeroId(data.heroId);
         heroBuilder.setHeroLv(data.heroLv);
         heroBuilder.setHeroStar(data.heroStar);
         heroBuilder.setHeroPlayerId(data.playerId);
         heroBuilder.setHeroPlayerName(data.playerName);
         heroBuilder.setDressId(data.dressId);
         heroBuilder.addAllStarMapPointInfo(StarMapDefine.toBuilderStarMapPointInfoList(data.starMap));
         builder.addHeroInfo(heroBuilder);
      }

      player.sendMsg(builder.build());
   }

   public List<DemonBossData> randHero(int heroNum, int playerId) {
      DemonBossDao bossDao = this.getBossDao();
      List<DemonBossData> resultList = new ArrayList();
      List<DemonBossData> tempList = new ArrayList();

      for(Map.Entry<Integer, ArrayList<DemonBossData>> entry : bossDao.heroMap.entrySet()) {
         if ((Integer)entry.getKey() != playerId) {
            tempList.addAll((Collection)entry.getValue());
         }
      }

      int count = tempList.size();
      if (resultList.size() <= heroNum) {
         resultList.addAll(tempList);
      } else {
         int flag = 0;

         while(resultList.size() < heroNum && flag < 600) {
            ++flag;
            DemonBossData hero = (DemonBossData)tempList.get(RandomUtil.randInt(count));
            if (!resultList.contains(hero)) {
               resultList.add(hero);
            }
         }
      }

      return resultList;
   }

   @TaskMethod
   public void randHero(boolean firstDay) {
      logger.info("封魔活动boss开始前五分钟，开始放入武将池武将");
      int joinNum = this.configManager.getIntDefault("bossHeroPond", 2);
      List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, 100);
      DemonBossDao bossDao = this.getBossDao();
      if (firstDay) {
         Map<Integer, HeroModel> modelMap = ApplicationContextProvider.<Integer, HeroModel>getModelPoolMap("hero");

         for(RankData rankData : rankDataList) {
            int playerId = rankData.value;
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null) {
               SystemFunctionModel systemModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 3084);
               PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
               if (playerPublicDao.lv >= systemModel.getOpenLevel()) {
                  if (bossDao.heroMap.containsKey(gamePlayer.getPlayerId())) {
                     ((ArrayList)bossDao.heroMap.get(gamePlayer.getPlayerId())).clear();
                  }

                  gamePlayer.pushTask(() -> {
                     Map<Integer, ArrayList<DemonBossData>> tempMap = new HashMap();
                     DemonActivityDao demonActivityDao = (DemonActivityDao)gamePlayer.getData("tb_demon_activity", gamePlayer.getPlayerId());
                     if (!demonActivityDao.joinHero.isEmpty()) {
                        for(byte[] joinHero : demonActivityDao.joinHero) {
                           HeroMirror mirror = HeroMirror.toHeroMirror(joinHero);
                           DemonBossData data = new DemonBossData();
                           data.playerId = gamePlayer.getPlayerId();
                           data.playerName = playerPublicDao.playerName;
                           data.bytes = joinHero;
                           data.heroCode = mirror.code;
                           data.heroId = mirror.id;
                           data.heroLv = mirror.lv;
                           data.heroStar = mirror.star;
                           data.heroPower = mirror.combatPower;
                           data.heroFlag = MiscUtil.comboInteger(data.playerId, mirror.code);
                           data.dressId = mirror.dressId;
                           data.resetStarMap(mirror.starMap);
                           if (modelMap.containsKey(mirror.id)) {
                              data.heroType = ((HeroModel)modelMap.get(mirror.id)).getType();
                           }

                           if (tempMap.containsKey(gamePlayer.getPlayerId())) {
                              ((ArrayList)tempMap.get(gamePlayer.getPlayerId())).add(data);
                           } else {
                              ArrayList<DemonBossData> joinHeroList = new ArrayList();
                              joinHeroList.add(data);
                              tempMap.put(gamePlayer.getPlayerId(), joinHeroList);
                           }
                        }
                     }

                     if (demonActivityDao.joinHero.size() < joinNum) {
                        int realNum = joinNum - demonActivityDao.joinHero.size();
                        ArrayList<Integer> joinHeroList = new ArrayList();

                        for(byte[] bytes : demonActivityDao.joinHero) {
                           HeroMirror mirror = HeroMirror.toHeroMirror(bytes);
                           joinHeroList.add(mirror.code);
                        }

                        ArrayingMirror mirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                        List<ArrayingEntity> list = new ArrayList();

                        for(ArrayingEntity entity : mirror.arrayingElementsMap.values()) {
                           if ((entity.entityType() == CommonMsg.CodeType.CODE_HERO || entity.entityType() == CommonMsg.CodeType.CODE_FRIEND) && !joinHeroList.contains(entity.code)) {
                              list.add(entity);
                           }
                        }

                        Collections.sort(list, new ArrayingEntityComparator());
                        int flag = 0;

                        for(int i = 0; i < list.size() && flag < realNum; ++i) {
                           HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);
                           HeroDao heroDao = heroBagPart.getHeroByCode(((ArrayingEntity)list.get(i)).code);
                           if (heroDao != null) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                              if ((heroModel == null || heroModel.getNation() != 10 || heroDao.inheritNation > 0) && heroDao.invalidTime <= 0) {
                                 ++flag;
                                 heroBagPart.heroBagFlushProperties(heroDao);
                                 HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
                                 byte[] bytes = heroMirror.toByteArray();
                                 DemonBossData data = new DemonBossData();
                                 data.playerId = gamePlayer.getPlayerId();
                                 data.playerName = playerPublicDao.playerName;
                                 data.bytes = bytes;
                                 data.heroCode = heroDao.code;
                                 data.heroId = heroDao.id;
                                 data.heroLv = heroDao.getLv();
                                 data.heroStar = heroDao.getStar();
                                 data.heroPower = heroDao.combatPower;
                                 data.heroFlag = MiscUtil.comboInteger(data.playerId, heroDao.code);
                                 Map<Integer, StarMapPoint> starMapPointMap = heroDao.recHeroStarMapPointMap();
                                 if (null != starMapPointMap && starMapPointMap.size() > 0) {
                                    data.resetStarMap(starMapPointMap);
                                 }

                                 if (modelMap.containsKey(heroDao.id)) {
                                    data.heroType = ((HeroModel)modelMap.get(heroDao.id)).getType();
                                 }

                                 if (tempMap.containsKey(gamePlayer.getPlayerId())) {
                                    ((ArrayList)tempMap.get(gamePlayer.getPlayerId())).add(data);
                                 } else {
                                    ArrayList<DemonBossData> byteList = new ArrayList();
                                    byteList.add(data);
                                    tempMap.put(gamePlayer.getPlayerId(), byteList);
                                 }

                                 demonActivityDao.joinHero.add(bytes);
                                 if (((ArrayList)tempMap.get(gamePlayer.getPlayerId())).size() >= 2) {
                                    break;
                                 }
                              }
                           }
                        }

                        demonActivityDao.updateOp();
                     }

                     this.pushTask(() -> {
                        bossDao.heroMap.putAll(tempMap);
                        bossDao.updateOp();
                     });
                  });
               }
            }
         }

         bossDao.updateOp();
      }
   }

   public boolean checkBossOpen() {
      ActivityInfo activityData = this.activityMgr.getActivityInfo(24);
      if (activityData != null && activityData.open) {
         int cHour = DateUtil.cHour();
         int cMinute = DateUtil.cMinute();
         String openTime = this.configManager.getStrByDefault("DuplicateTime", "20:30|23:59");
         String[] time = openTime.split("\\|");
         String startTime = time[0];
         String endTime = time[1];
         return cHour > Integer.parseInt(startTime.split(":")[0]) && cHour < Integer.parseInt(endTime.split(":")[0]) || cHour == Integer.parseInt(startTime.split(":")[0]) && cMinute >= Integer.parseInt(startTime.split(":")[1]) || cHour == Integer.parseInt(endTime.split(":")[0]) && cMinute <= Integer.parseInt(endTime.split(":")[1]);
      } else {
         return false;
      }
   }

   public boolean checkBossHeroOpen() {
      ActivityInfo activityData = this.activityMgr.getActivityInfo(24);
      if (activityData != null && activityData.open) {
         int cHour = DateUtil.cHour();
         int cMinute = DateUtil.cMinute();
         String openTime = this.configManager.getStrByDefault("DuplicateTime", "20:30|23:59");
         String[] time = openTime.split("\\|");
         String startTime = time[0];
         int startHour = Integer.parseInt(startTime.split(":")[0]);
         int startminut = Integer.parseInt(startTime.split(":")[1]);
         if (startminut == 0) {
            --startHour;
            startminut = 55;
         } else {
            startminut -= 5;
         }

         return cHour < startHour || cHour == startHour && cMinute < startminut;
      } else {
         return false;
      }
   }

   public void bossJob(int hour, boolean firstDay) {
      String openTime = this.configManager.getStrByDefault("DuplicateTime", "20:30|23:59");
      String[] time = openTime.split("\\|");
      String startTime = time[0];
      int startHour = Integer.parseInt(startTime.split(":")[0]);
      if (hour == startHour) {
         this.rankMgr.removeRanks(RankDefine.RankModule.DEMON_BOSS_DAY_HURT);
         this.randHero(firstDay);
      }

      String endTime = time[1];
      int endHour = Integer.parseInt(endTime.split(":")[0]);
      int endMinut = Integer.parseInt(endTime.split(":")[1]);
      if (hour == endHour) {
         int nowMinute = DateUtil.cMinute();
         int tempMinute = endMinut - nowMinute;
         if (tempMinute < 0) {
            tempMinute = 0;
         }

         int totalTime = tempMinute * 60 + 60;
         this.scheduleEx((long)(totalTime * 1000), "sendRankDamageAward", new Object[0]);
      }

   }

   @TaskMethod
   public void sendRankDamageAward() {
      logger.info("发送封魔活动伤害排行榜奖励！！！");
      this.rankMgr.sendDayHurtAward();
   }

   @TaskMethod
   public void doJob(int hour) {
      ActivityInfo activityData = this.activityMgr.getActivityInfo(24);
      if (activityData != null && activityData.open) {
         boolean firstDay = false;
         if (activityData.start == DateUtil.getIntTime(DateUtil.getDayStartTimeStamp())) {
            firstDay = true;
         }

         this.bossJob(hour, firstDay);
      }
   }

   public List<RankData> getDamageRanks(RankDefine.RankModule module, int limit) {
      return this.rankMgr.getRanks(module, limit);
   }

   public void gmOp(String gm, GamePlayer gamePlayer) {
      String[] str = gm.split(",");
      int op = Integer.parseInt(str[0]);
      int value = Integer.parseInt(str[1]);
      DemonBossDao demonBossDao = this.getBossDao();
      if (op == 1) {
         demonBossDao.heroMap.clear();
      } else if (op == 2) {
         demonBossDao.heroMap.clear();
         this.randHero(true);
      } else if (op == 3) {
         demonBossDao.tokenNum = value;
      } else if (op == 4) {
         demonBossDao.bossLev = value;
      } else if (op == 5) {
         demonBossDao.damage = (long)value;
      } else if (op == 6) {
         DemonActivityDao demonActivityDao = (DemonActivityDao)gamePlayer.getGameCachePool().getData("tb_demon_activity", new Object[]{gamePlayer.getPlayerId()});
         demonActivityDao.maxPoint += value;
         demonActivityDao.updateOp();
      } else if (op == 7) {
         this.rankMgr.sendDayHurtAward();
      } else if (op == 8) {
         DemonActivityDao demonActivityDao = (DemonActivityDao)gamePlayer.getGameCachePool().getData("tb_demon_activity", new Object[]{gamePlayer.getPlayerId()});
         demonActivityDao.bossFightNum = 0;
         demonActivityDao.updateOp();
      } else if (op == 9) {
         DemonActivityDao demonActivityDao = (DemonActivityDao)gamePlayer.getGameCachePool().getData("tb_demon_activity", new Object[]{gamePlayer.getPlayerId()});
         demonActivityDao.fightNum = 0;
         demonActivityDao.buyFightNum = 0;
         demonActivityDao.updateOp();
      }

      demonBossDao.updateOp();
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      this.rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.DEMON_COPY_POINT);
      this.rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.DEMON_BOSS_DAY_HURT);
   }
}
