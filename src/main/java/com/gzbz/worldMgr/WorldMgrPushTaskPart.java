package com.gzbz.worldMgr;

import allMgr.MgrParent;
import allMgr.PartAnnotation;
import allMgr.PartParent;
import allMgr.TaskMethod;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroSupportDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.db.worldBean.KingOfCentralPlainsData;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.demon.DemonMgr;
import com.gzbz.demonRotate.DemonRotateMgr;
import com.gzbz.dragon.DragonDiscipleMgr;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattleChapterMgr;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.horse.WarHorseMgr;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.playerExtend.PlayerExtendPart;
import com.gzbz.gamePlayer.playerReset.PlayerResetPart;
import com.gzbz.gamePlayer.pvp.KingOfCentralPlainsMgr;
import com.gzbz.gamePlayer.pvp.PvpSeasonMgr;
import com.gzbz.godBeast.GodBeastMgr;
import com.gzbz.megerWar.CoreWarMgr;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HeroModel;
import com.gzbz.rank.RankMgr;
import com.gzbz.rune.RuneMgr;
import com.gzbz.runeStone.RuneStoneMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.WaterTransportMgr;
import com.gzbz.union.UnionDailyGuessMgr;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.unionOffer.OfferMgr;
import com.gzbz.war.north.WarNorthMgr;
import com.gzbz.worldCup.WorldCupMgr;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = WorldMgr.class
)
public class WorldMgrPushTaskPart extends PartParent {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private WorldMgr worldMgr;
   @Autowired
   private UnionMgrParent unionMgrParent;
   @Autowired
   private PvpSeasonMgr pvpSeasonMgr;
   @Autowired
   private ActivityMgr activityMgr;
   @Autowired
   private KingOfCentralPlainsMgr kingOfCentralPlainsMgr;
   @Autowired
   private WorldBossMgr worldBossMgr;
   @Autowired
   private DemonMgr demonMgr;
   @Autowired
   private DemonRotateMgr demonRotateMgr;
   @Autowired
   private DragonDiscipleMgr dragonDiscipleMgr;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private WaterTransportMgr waterTransportMgr;
   @Autowired
   private RuneStoneMgr runeStoneMgr;
   @Autowired
   private WarNorthMgr warNorthMgr;
   @Autowired
   private OfferMgr offerMgr;
   @Autowired
   private WarHorseMgr warHorseMgr;
   @Autowired
   private BattleChapterMgr battleChapterMgr;
   @Autowired
   private UnionDailyGuessMgr unionDailyGuessMgr;
   @Autowired
   private MergeActivityMgr mergeActivityMgr;
   @Autowired
   private RuneMgr runeMgr;
   @Autowired
   private GodBeastMgr godBeastMgr;
   @Autowired
   private CoreWarMgr coreWarMgr;
   @Autowired
   private WorldCupMgr worldCupMgr;
   private final List<GamePlayer> waitResetPlayers = new ArrayList();
   private ScheduledFuture<?> playerResetFuture = null;
   private final List<GamePlayer> waitUploadCrossPlayers = new ArrayList();
   private ScheduledFuture<?> playerUploadCrossFuture = null;
   private final List<UnionMgr> waitUploadCrossUnion = new ArrayList();
   private ScheduledFuture<?> unionUploadCrossFuture = null;

   public void init(MgrParent mgr) {
      this._mgr = mgr;
      this.worldMgr = (WorldMgr)this._mgr;
   }

   @TaskMethod
   public void worldPushAutoBattle(Map<Integer, BattleDao> battleDaoMap, GamePlayer player) {
      BattlePart battlePart = (BattlePart)player.getMgrPart(BattlePart.class);
      WorldDao<HashSet<Integer>> worldDao = this.worldMgr.<HashSet<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE);
      if (((HashSet)worldDao.jsonData).contains(player.getPlayerId()) && !battleDaoMap.containsKey(1250)) {
         battlePart.pushTaskEx("checkCreateHeroTrainingBattle", new Object[0]);
      }

      battlePart.pushTaskEx("autoBattleHandle", new Object[0]);
   }

   @TaskMethod
   public void addAutoBattle(GameDefine.WorldModule gameDefine, int playerId) {
      WorldDao<HashSet<Integer>> worldDao = this.worldMgr.<HashSet<Integer>>getWorldDao(gameDefine);
      if (((HashSet)worldDao.jsonData).add(playerId)) {
         worldDao.updateOp();
      }

   }

   @TaskMethod
   public void removeAutoBattle(GameDefine.WorldModule gameDefine, int playerId) {
      WorldDao<HashSet<Integer>> worldDao = this.worldMgr.<HashSet<Integer>>getWorldDao(gameDefine);
      if (((HashSet)worldDao.jsonData).remove(playerId)) {
         worldDao.updateOp();
      }

   }

   @TaskMethod
   public void checkAutoBattle(GamePlayer player) {
      WorldDao<HashSet<Integer>> autoBattlePlayers = this.worldMgr.<HashSet<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_AUTO_BATTLE);
      WorldDao<HashSet<Integer>> heroTrainingEnterBattlePlayers = this.worldMgr.<HashSet<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE);
      if (((HashSet)autoBattlePlayers.jsonData).contains(player.getPlayerId()) || ((HashSet)heroTrainingEnterBattlePlayers.jsonData).contains(player.getPlayerId())) {
         BattlePart battlePart = (BattlePart)player.getMgrPart(BattlePart.class);
         battlePart.pushTaskEx("autoBattleJob", new Object[0]);
      }

   }

   @TaskMethod
   public void addHeroSupport(HeroSupportDao.SupportModule supportModule, HeroDao heroDao, PlayerPart playerPart, String supportSucCallback) {
      HeroSupportDao heroSupportDao = this.getHeroSupportDao(supportModule, playerPart.getPlayer().getPlayerId());
      if (heroDao == null) {
         playerPart.getPlayer().failure(5005);
      } else if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
         playerPart.getPlayer().failure(76042);
      } else if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK && heroDao.linkCode <= 0) {
         playerPart.getPlayer().failure(76509);
      } else if (heroDao.invalidTime > 0) {
         playerPart.getPlayer().failure(76512);
      } else if (HeroModel.isReplacementHero(heroDao.id)) {
         playerPart.getPlayer().failure(76182);
      } else {
         if (heroSupportDao != null) {
            if (DateUtil.isSameDay((long)heroSupportDao.time * 1000L)) {
               playerPart.getPlayer().failure(5006);
               return;
            }

            heroSupportDao.time = DateUtil.getIntTime(System.currentTimeMillis());
            heroSupportDao.heroSupport = HeroMirror.fromHeroBean(heroDao);
            heroSupportDao.updateOp();
         } else {
            heroSupportDao = new HeroSupportDao(playerPart.getPlayer().getPlayerId(), supportModule, HeroMirror.fromHeroBean(heroDao));
            heroSupportDao.time = DateUtil.getIntTime(System.currentTimeMillis());
            this.worldMgr.getGameCachePool().insertDao(heroSupportDao, false);
         }

         if (!StringUtils.isEmpty(supportSucCallback)) {
            playerPart.pushTaskEx(supportSucCallback, new Object[]{supportModule});
         }

      }
   }

   @TaskMethod
   public void choiceHeroSupport(HeroSupportDao.SupportModule supportModule, int friendPlayerId, PlayerPart playerPart, String choiceSucCallback) {
      HeroSupportDao heroSupportDao = this.getHeroSupportDao(supportModule, friendPlayerId);
      if (heroSupportDao == null) {
         playerPart.getPlayer().failure(5007);
      } else {
         playerPart.pushTaskEx(choiceSucCallback, new Object[]{heroSupportDao});
      }
   }

   public HeroSupportDao getHeroSupportDao(HeroSupportDao.SupportModule supportModule, int playerId) {
      Map<String, HeroSupportDao> heroSupportDaoMap = this.worldMgr.getGameCachePool().getAllTableByMap("tb_hero_support");
      return (HeroSupportDao)heroSupportDaoMap.get(supportModule.module + "-" + playerId + "-");
   }

   public List<HeroSupportDao> getHeroSupportDaoList(int playerId) {
      List<HeroSupportDao> list = new ArrayList();
      Map<String, HeroSupportDao> heroSupportDaoMap = this.worldMgr.getGameCachePool().getAllTableByMap("tb_hero_support");

      for(HeroSupportDao.SupportModule supportModule : HeroSupportDao.SupportModule.values()) {
         HeroSupportDao heroSupportDao = (HeroSupportDao)heroSupportDaoMap.get(supportModule.module + "-" + playerId + "-");
         if (heroSupportDao != null) {
            list.add(heroSupportDao);
         }
      }

      return list;
   }

   public void dailyResetHeroSupport() {
      Map<String, HeroSupportDao> heroSupportDaoMap = this.worldMgr.getGameCachePool().getAllTableByMap("tb_hero_support");
      Map<Integer, Set<String>> tempMap = new HashMap();

      for(Map.Entry<String, HeroSupportDao> entry : heroSupportDaoMap.entrySet()) {
         HeroSupportDao heroSupportDao = (HeroSupportDao)entry.getValue();
         if (!heroSupportDao.isAuto) {
            String[] keyArr = ((String)entry.getKey()).split("-");
            ((Set)MapUtil.computeIfAbsent(tempMap, Integer.parseInt(keyArr[0]), HashSet.class)).add(entry.getKey());
         }
      }

      for(HeroSupportDao.SupportModule supportModule : HeroSupportDao.SupportModule.values()) {
         boolean needReset = supportModule.reset == 0;
         if (supportModule.reset == 2) {
            needReset = DateUtil.todayOfWeek() == 2;
         }

         if (needReset) {
            try {
               this.worldMgr.getGameDBPool().query("DELETE FROM tb_hero_support WHERE moduleId=? AND isAuto=0", new Object[]{supportModule.module});

               for(String supportKey : (Set)MapUtil.getOrDefault(tempMap, supportModule.module, HashSet.class)) {
                  heroSupportDaoMap.remove(supportKey);
               }
            } catch (Throwable throwable) {
               throwable.printStackTrace();
            }
         }
      }

   }

   @TaskMethod
   public void serverHourCheck(long curTime) {
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      this.logger.info("定时任务: 当前时间【{}】上次检查时间【{}】", DateUtil.transferLongToDate(curTime), DateUtil.transferLongToDate(((WorldData)worldDao.jsonData).updateTime));
      if (!DateUtil.isSameHour(((WorldData)worldDao.jsonData).updateTime)) {
         long lastTime = ((WorldData)worldDao.jsonData).updateTime;
         ((WorldData)worldDao.jsonData).updateTime = curTime;
         worldDao.updateOp();
         this.logger.info("定时任务: 每小时检查");
         int currentHour = DateUtil.hour(curTime);
         if (currentHour == 0 || lastTime > 0L && !DateUtil.isSameDay(lastTime, curTime)) {
            this.logger.info("定时任务: 跨天检查");
            this.mgrDailyReset(curTime);
         }

         this.activityMgr.checkOpenServerRank(currentHour);
         this.activityMgr.checkLaborOpenServerRank(currentHour);
         UnionMgrParent var10001 = this.unionMgrParent;
         this.unionMgrParent.pushTask(var10001::hourReset);
         WorldBossMgr var10 = this.worldBossMgr;
         this.worldBossMgr.pushTask(var10::checkBoss);
         this.waitResetPlayers.clear();
         this.waitResetPlayers.addAll(this.worldMgr.getOnlinePlayer());
         if (this.playerResetFuture != null) {
            this.playerResetFuture.cancel(false);
            this.playerResetFuture = null;
         }

         if (!this.waitResetPlayers.isEmpty()) {
            int period = 20000 / this.waitResetPlayers.size();
            if (period <= 0) {
               period = 1;
            }

            this.playerResetFuture = this.scheduleEx(0L, (long)period, "doResetPlayer", new Object[]{curTime});
         }

         PvpSeasonMgr var11 = this.pvpSeasonMgr;
         this.pvpSeasonMgr.pushTask(var11::dayAward);
         this.demonMgr.pushTaskEx("doJob", new Object[]{currentHour});
         this.demonRotateMgr.pushTaskEx("doJob", new Object[]{currentHour});
         this.dragonDiscipleMgr.pushTaskEx("checkTeamTime", new Object[0]);
         this.mailWorldMgr.pushTaskEx("mailWorldCheck", new Object[0]);
         LocalDate date = LocalDate.now();
         WorldDao<KingOfCentralPlainsData> kingCPWorldDao = this.worldMgr.<KingOfCentralPlainsData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_KING_CP);
         if (date.getDayOfWeek() != DayOfWeek.MONDAY && ((KingOfCentralPlainsData)kingCPWorldDao.jsonData).activityState == 2) {
            this.logger.info("问鼎中数据重置，日期={},", DateUtil.transferLongToDate());
            ((KingOfCentralPlainsData)kingCPWorldDao.jsonData).activityState = 3;
            ((KingOfCentralPlainsData)kingCPWorldDao.jsonData).activityEnd = 1;
            ((KingOfCentralPlainsData)kingCPWorldDao.jsonData).state = 0;
            ((KingOfCentralPlainsData)kingCPWorldDao.jsonData).round = 0;
            ((KingOfCentralPlainsData)kingCPWorldDao.jsonData).state = 0;
            kingCPWorldDao.updateOp();
         }

         this.worldCupMgr.pushTaskEx("hourReset", new Object[]{currentHour});
      }
   }

   @TaskMethod
   public void doResetPlayer(long curTime) {
      if (this.waitResetPlayers.isEmpty()) {
         if (this.playerResetFuture != null) {
            this.playerResetFuture.cancel(false);
            this.playerResetFuture = null;
         }

      } else {
         GamePlayer player = (GamePlayer)this.waitResetPlayers.remove(this.waitResetPlayers.size() - 1);
         if (player != null) {
            player.pushTask(() -> {
               PlayerDao playerDao = player.getPlayerDao();
               if (!StringUtils.isEmpty(playerDao.playerName)) {
                  PlayerResetPart playerResetPart = (PlayerResetPart)player.getMgrPart(PlayerResetPart.class);
                  playerResetPart.playerReset(curTime);
               }

            });
         }
      }
   }

   public void mgrDailyReset(long curTime) {
      this.activityMgr.dailyReset();
      this.rankMgr.pushTask(() -> this.rankMgr.grantRankAward(CentreAwardModel.TYPE_HERO_TRAINING, RankDefine.RankModule.HERO_TRAINING, 5, 516));
      this.dailyResetFriendSupport();
      if (DateUtil.dayOfWeek(curTime) == 2) {
         this.logger.info("周一刷新荆州之战，每周武将数据");
         this.worldMgr.warHeroReset();
         this.rankMgr.pushTask(() -> this.rankMgr.sendWarRankAward());
         this.rankMgr.pushTask(() -> this.rankMgr.sendWarHlRankAward());
         this.rankMgr.pushTask(() -> {
            this.rankMgr.grantRankAward(CentreAwardModel.TYPE_TRANSPORT, RankDefine.RankModule.WATER_TRANSPORT, 33, 3306);
            this.rankMgr.removeRanks(RankDefine.RankModule.WATER_TRANSPORT);
         });
         this.rankMgr.pushTask(() -> {
            this.rankMgr.grantRankAward(CentreAwardModel.TYPE_TRANSPORT_INTERCEPT, RankDefine.RankModule.WATER_TRANSPORT_INTERCEPT, 33, 3313);
            this.rankMgr.removeRanks(RankDefine.RankModule.WATER_TRANSPORT_INTERCEPT);
         });
         this.rankMgr.pushTask(() -> {
            String[] miniProgramRankRewardArr = ApplicationContextProvider.getConfigString("QqShareCanal", "hkw:1770|qkw:1890").split("\\|");
            String miniProgramRankReward = null;

            for(String temp : miniProgramRankRewardArr) {
               if (temp.startsWith(this.worldMgr.PLATFORM_NAME + ":")) {
                  miniProgramRankReward = temp;
                  break;
               }
            }

            if (miniProgramRankReward != null) {
               this.rankMgr.grantRankAward(Integer.parseInt(miniProgramRankReward.split(":")[1]), RankDefine.RankModule.WECHAT_INVITE, 13, 1308);
               this.rankMgr.removeRanks(RankDefine.RankModule.WECHAT_INVITE);
            }

         });
      }

      this.unionMgrParent.pushTask(() -> this.unionMgrParent.dailyReset());
      this.runeStoneMgr.pushTask(() -> this.runeStoneMgr.resetDaily());
      this.warNorthMgr.pushTask(() -> this.warNorthMgr.resetDaily());
      this.runeMgr.pushTask(() -> this.runeMgr.resetDaily());
      this.kingOfCentralPlainsMgr.reset();
      this.waterTransportMgr.pushTask(() -> this.waterTransportMgr.dailyReset());
      this.offerMgr.pushTask(() -> this.offerMgr.dailyReset());
      this.warHorseMgr.pushTask(() -> this.warHorseMgr.resetDaily());
      this.unionDailyGuessMgr.pushTask(() -> this.unionDailyGuessMgr.resetUnionDailyGuessChapter());
      this.mergeActivityMgr.pushTask(() -> this.mergeActivityMgr.dailyReset());
      this.coreWarMgr.pushTask(() -> this.coreWarMgr.dailyReset(curTime));
      this.resetPlayerTodayOnline();
      this.resetStonehengePathType(curTime);
   }

   private void dailyResetFriendSupport() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      worldMgrPushTaskPart.dailyResetHeroSupport();
   }

   @TaskMethod
   public void recordPlayerTodayOnline() {
      for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
         gamePlayer.pushPartTaskEx(PlayerExtendPart.class, "recordTodayOnline", new Object[0]);
      }

   }

   private void resetPlayerTodayOnline() {
      GameDBPool gameDBPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);

      try {
         gameDBPool.query("UPDATE tb_player_detail SET todayOnlineSecond=0;", new Object[0]);

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            gamePlayer.pushPartTaskEx(PlayerExtendPart.class, "resetTodayOnlineRecordTime", new Object[0]);
         }
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

   }

   public void resetStonehengePathType(long curTime) {
      if (DateUtil.dayOfWeek(curTime) == 2) {
         String stonehengePathRatio = ApplicationContextProvider.getConfigString("stonehengePathRatio", "1,2,3,4");
         ArrayList<Integer> randomPaths = new ArrayList();
         WorldDao<ArrayList<Integer>> worldDao = this.worldMgr.<ArrayList<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_STONEHENGE_PATH);

         try {
            for(String path : stonehengePathRatio.split(",")) {
               int pathType = Integer.parseInt(path);
               if (!((ArrayList)worldDao.jsonData).contains(pathType)) {
                  randomPaths.add(pathType);
               }
            }

            if (CollectionUtils.isEmpty(randomPaths)) {
               ((ArrayList)worldDao.jsonData).remove(((ArrayList)worldDao.jsonData).get(((ArrayList)worldDao.jsonData).size() - 1));
               randomPaths.addAll((Collection)worldDao.jsonData);
               ((ArrayList)worldDao.jsonData).clear();
            }

            int index = (new Random()).nextInt(randomPaths.size());
            int newType = (Integer)randomPaths.get(index);
            ((ArrayList)worldDao.jsonData).add(newType);
            worldDao.updateOp();
         } catch (NumberFormatException e) {
            this.logger.error("石兵八阵路线轮换发生异常");
            e.printStackTrace();
         }
      }

   }

   public void crossChangeCheck() {
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (((WorldData)worldDao.jsonData).crossChange) {
         if (this.playerUploadCrossFuture != null) {
            this.playerUploadCrossFuture.cancel(true);
            this.playerUploadCrossFuture = null;
         }

         this.waitUploadCrossPlayers.clear();
         this.waitUploadCrossPlayers.addAll(this.worldMgr.getAllPlayer());
         this.playerUploadCrossFuture = this.scheduleEx(10L, 20L, "uploadPlayerToCross", new Object[0]);
         if (this.unionUploadCrossFuture != null) {
            this.unionUploadCrossFuture.cancel(true);
            this.unionUploadCrossFuture = null;
         }

         this.waitUploadCrossUnion.clear();
         this.waitUploadCrossUnion.addAll(this.unionMgrParent.getUnionMgrMap().values());
         this.unionUploadCrossFuture = this.scheduleEx(15L, 150L, "uploadUnionToCross", new Object[0]);
         ((WorldData)worldDao.jsonData).crossChange = false;
         worldDao.updateOp();
      }
   }

   @TaskMethod
   public void uploadPlayerToCross() {
      if (this.waitUploadCrossPlayers.isEmpty()) {
         if (this.playerUploadCrossFuture != null) {
            this.playerUploadCrossFuture.cancel(false);
            this.playerUploadCrossFuture = null;
            this.logger.info("上报玩家信息到跨服完成");
         }

      } else {
         GamePlayer player = (GamePlayer)this.waitUploadCrossPlayers.remove(this.waitUploadCrossPlayers.size() - 1);
         if (player != null) {
            player.pushTask(player::uploadCrossPlayer);
         }
      }
   }

   @TaskMethod
   public void uploadUnionToCross() {
      if (this.waitUploadCrossUnion.isEmpty()) {
         if (this.unionUploadCrossFuture != null) {
            this.unionUploadCrossFuture.cancel(false);
            this.unionUploadCrossFuture = null;
            this.logger.info("上报军团信息到跨服完成");
         }

      } else {
         UnionMgr unionMgr = (UnionMgr)this.waitUploadCrossUnion.remove(this.waitUploadCrossUnion.size() - 1);
         if (unionMgr != null) {
            this.unionMgrParent.pushTask(() -> unionMgr.uploadToCross(false, false));
         }
      }
   }

   public static HeroSupportDao.SupportModule int2SupportModule(int module) {
      HeroSupportDao.SupportModule[] modules = HeroSupportDao.SupportModule.values();

      for(HeroSupportDao.SupportModule supportModule : modules) {
         if (supportModule.module == module) {
            return supportModule;
         }
      }

      return null;
   }

   @TaskMethod
   public void setAutoHeroSupport(int module, boolean isAuto, PlayerPart playerPart, String callback) {
      HeroSupportDao.SupportModule supportModule = int2SupportModule(module);
      if (supportModule == null) {
         playerPart.getPlayer().failure(76138);
      } else {
         HeroSupportDao heroSupportDao = this.getHeroSupportDao(supportModule, playerPart.getPlayer().getPlayerId());
         if (heroSupportDao != null) {
            heroSupportDao.isAuto = isAuto;
            heroSupportDao.updateOp();
            if (!StringUtils.isEmpty(callback)) {
               playerPart.pushTaskEx(callback, new Object[]{module, isAuto});
            }
         }

      }
   }
}
