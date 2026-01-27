package com.gzbz.worldMgr;

import allMgr.AllMgr;
import allMgr.ExecutorsFunc;
import allMgr.MgrAnno;
import allMgr.MgrParent;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import cn.hutool.core.io.FileUtil;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.BeautyTreasureRecord;
import com.gzbz.activity.bean.decisiveBattle.DecisiveRecordData;
import com.gzbz.alliance.AllianceMgr;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.db.AccountDao;
import com.gzbz.db.AccountRobotDao;
import com.gzbz.db.DecisiveBattleRecordDao;
import com.gzbz.db.DeviceDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.DeviceData;
import com.gzbz.db.parseResult.IntQueryResult;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.dragon.DragonDiscipleMgr;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.LogDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameAllMgr;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroCommentPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.pvp.KingOfCentralPlainsMgr;
import com.gzbz.gamePlayer.pvp.PvpSeasonMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mine.MineMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.EventHeroMainNewModel;
import com.gzbz.model.FourteenTWSignAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroBreachModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.MineVeinModel;
import com.gzbz.model.PlotBattleModel;
import com.gzbz.model.RobotModel;
import com.gzbz.model.RobotWearModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.TurntableActivityTaskModel;
import com.gzbz.model.TurntableRewardModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.fun.HeroRandomFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.HeroCommentMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.HuaJiaActMsg;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.protobuf.PeakBattleMsg;
import com.gzbz.protobuf.PeakExtraMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.QianKunLotteryMsg;
import com.gzbz.protobuf.QianKunTreasureMsg;
import com.gzbz.protobuf.RedCliffMsg;
import com.gzbz.protobuf.TongQueRotateMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.robot.MonsterManager;
import com.gzbz.robot.bean.MonsterMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.GlobalTaskPart;
import com.gzbz.transport.WaterTransportMgr;
import com.gzbz.union.UnionDailyGuessMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.util.HolidaysLoader;
import com.gzbz.util.HotSwapUtil;
import com.gzbz.util.NameFilter;
import com.gzbz.util.WordsFilter;
import com.gzbz.war.jingzhou.JingZhouData;
import com.gzbz.worldCup.WorldCupMgr;
import db.DBPool;
import debug.AppArgs;
import debug.Debug;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import ip.AddressUtils;
import java.io.File;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jodd.util.StringUtil;
import misc.DateUtil;
import misc.JsonUtil;
import misc.MD5Util;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.redisson.api.RMap;
import org.redisson.api.RScoredSortedSet;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@MgrAnno
@Component
@DependsOn({"gameProtobufScanContext", "gameServerScan", "gameModelPool", "gameDBPool", "applicationContextProvider", "gameRedisTool"})
public class WorldMgr extends GameMgr {
   public static final int SERVER_STATE_INIT = 0;
   public static final int SERVER_STATE_OPEN = 1;
   public static final int SERVER_STATE_CLOSED = 2;
   public static final int SERVER_STATE_ERROR = 3;
   public static byte MSG_MASK = 0;
   static Logger logger = LoggerFactory.getLogger(WorldMgr.class);
   private ArrayList<BattleTestMgr> battleTestMgrList = new ArrayList();
   @Value("${ServerName}")
   public String GAME_SERVER_NAME;
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   @Value("${PlatformId}")
   public int PLATFORM_ID;
   @Value("${PlatformName}")
   public String PLATFORM_NAME;
   @Value("${sdk.loginKey}")
   public String LOGIN_KEY;
   @Value("${cardExchangeUrl}")
   public String CARD_EXCHANGE_URL;
   @Value("${recharge.appKey}")
   public String GM_APP_KEY;
   @Value("${server.port}")
   public int httpPort;
   @Value("${hotAgent.classpath}")
   private String hotSwapClassPath;
   @Value("${hotAgent.jarPath}")
   private String hotSwapJarPath;
   public String country = "cn";
   public int groupId;
   public static AtomicInteger serverState = new AtomicInteger(0);
   public static AtomicBoolean isInitFinish = new AtomicBoolean(false);
   @Autowired
   private GameModelPool gameModelPool;
   @Autowired
   private GameRedisTool gameRedisTool;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private MonsterMgr monsterMgr;
   @Autowired
   private MonsterManager monsterManager;
   @Autowired
   private LogOperationMgr operationMgr;
   @Autowired
   private GameDBPool gameDBPool;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private Environment env;
   @Autowired
   private UnionDailyGuessMgr unionDailyGuessMgr;
   @Autowired
   private UnionMgrParent unionMgrParent;
   @Autowired
   private PvpSeasonMgr pvpSeasonMgr;
   @Autowired
   private ActivityMgr activityMgr;
   @Autowired
   private WorldBossMgr worldBossMgr;
   @Autowired
   private KingOfCentralPlainsMgr kingOfCentralPlainsMgr;
   @Autowired
   private AllianceMgr allianceMgr;
   @Autowired
   private DragonDiscipleMgr dragonDiscipleMgr;
   @Autowired
   private OnLineMgr onLineMgr;
   @Autowired
   private GmMgr gmMgr;
   @Autowired
   private WaterTransportMgr waterTransportMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   @Autowired
   private MineMgr mineMgr;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   @Autowired
   private GcMgr gcMgr;
   @Autowired
   private WorldCupMgr worldCupMgr;
   @Value("${badWordPath}")
   public String badWordsPath;
   @Value("${holidaysPath}")
   private String holidaysPath;
   @Value("${propertyMonitor}")
   private boolean propertyMonitor;
   @Value("${clientVersionFilePath}")
   private String clientVersionFilePath;
   public String clientVersionContent = "";
   private AtomicInteger loadRef = new AtomicInteger();
   public long worldLvStamp = System.currentTimeMillis();
   private int worldLv = 11;
   private int pvpPlayerId = 10261;
   private long openServerTime;
   private long mergeServerTime;
   private static final int CHECK_CHANNEL_TIME = 600000;
   private static final int UPDATE_TIME = 600000;
   private static final int SERVER_INFO_TIME = 1200000;
   private static final int INNER_PLAYER_BATTIME = 5256000;
   private static final int INNER_PLAYER_UNSEAL_INTERVAL_TIME = 3600000;
   @Autowired
   private ConfigurableApplicationContext context;
   private ConcurrentHashMap<String, Channel> allChannel = new ConcurrentHashMap();
   private ConcurrentHashMap<Integer, GamePlayer> playerMap = new ConcurrentHashMap();
   private Set<String> playerNameSet = new HashSet();
   private ConcurrentHashMap<String, GamePlayer> accountMap = new ConcurrentHashMap();
   private ConcurrentHashMap<String, GamePlayer> channelMap = new ConcurrentHashMap();
   private ConcurrentHashMap<Integer, GamePlayer> onlinePlayerMap = new ConcurrentHashMap();
   private TreeSet<Integer> serversSet = new TreeSet();
   private Iterator<Map.Entry<Integer, GamePlayer>> playerIt;
   private long calcTotalPower;
   private long calcAlivePlayerNum;
   private long curAvgPower;
   private long curAlivePlayerNum;
   private Set<String> robotNameSet = new HashSet();
   private Map<Integer, List<ResourceModel>> upgradeMap = new HashMap();
   private Map<Integer, List<ResourceModel>> upBreachMap = new HashMap();
   public static List<Integer> heroArrayingStateList = new ArrayList();
   private Set<String> mailServerPlayerNameSet;
   private Map<Integer, GamePlayer> slaveServerPlayerMap;

   public ScheduledFuture<?> schedule(long initialDelay, long period, ExecutorsFunc func) {
      return super.schedule(initialDelay, period, func);
   }

   @Value("${openServerTime}")
   public void setOpenServerTime(String openServerTimeStr) {
      this.openServerTime = DateUtil.getLongTime(openServerTimeStr, "yyyy-MM-dd HH:mm:ss");
      if (this.openServerTime <= 0L) {
         this.openServerTime = System.currentTimeMillis();
      }

   }

   /** @deprecated */
   @Deprecated
   public String getZoneRedisKey() {
      String SERVER_ZONE = this.env.getProperty("ServerZone");
      return this.PLATFORM_NAME + ":ZoneServer:" + SERVER_ZONE + ":Server_" + this.GAME_SERVER_ID;
   }

   @TaskMethod
   public void updateCenterInfo() {
      CenterServerPart centerServerPart = (CenterServerPart)this.getMgrPart(CenterServerPart.class);
      centerServerPart.startUpdateCenterInfo();
   }

   @MsgHandlerAnno
   public void CR2S_ChangeInfoResult_4212(CrossMsg.CR2S_ChangeInfoResult_4212 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.crossNettyClient.pushTaskEx("confirmCrossNewGroup", new Object[]{msg.getGroup()});
   }

   public void updateServerInfo() {
      RedissonClient client = this.gameRedisTool.getClient();
      if (!Objects.isNull(client)) {
         String zoneName = this.getZoneRedisKey();
         RMap<String, Object> serverRMap = client.getMap(zoneName, new JsonJacksonCodec());
         if (this.playerIt == null || !this.playerIt.hasNext()) {
            this.playerIt = this.playerMap.entrySet().iterator();
         }

         int indexTimes = 0;
         long curTimes = System.currentTimeMillis();

         while(this.playerIt.hasNext()) {
            ++indexTimes;
            if (indexTimes > 2000) {
               break;
            }

            Map.Entry<Integer, GamePlayer> entry = (Map.Entry)this.playerIt.next();
            if (!((GamePlayer)entry.getValue()).isRobot() && (((GamePlayer)entry.getValue()).getPublicDao().logoutTime == 0L || curTimes - ((GamePlayer)entry.getValue()).getPublicDao().logoutTime <= 86400000L)) {
               this.calcTotalPower += ((GamePlayer)entry.getValue()).getPublicDao().combat_power;
               ++this.calcAlivePlayerNum;
            }
         }

         if (!this.playerIt.hasNext()) {
            if (this.calcAlivePlayerNum == 0L) {
               this.curAvgPower = 0L;
            } else {
               this.curAvgPower = this.calcTotalPower / this.calcAlivePlayerNum;
            }

            this.curAlivePlayerNum = this.calcAlivePlayerNum;
            this.calcTotalPower = 0L;
            this.calcAlivePlayerNum = 0L;
         }

         try {
            serverRMap.put("serverId", this.GAME_SERVER_ID);
            serverRMap.put("serverName", this.GAME_SERVER_NAME);
            serverRMap.put("platformName", this.PLATFORM_NAME);
            Environment environment = ApplicationContextProvider.getContext().getEnvironment();
            String serverNettyIp = environment.getProperty("NettyIp");
            if (StringUtils.isEmpty(serverNettyIp)) {
               serverRMap.put("serverIp", AddressUtils.getLocalIp());
            } else {
               serverRMap.put("serverIp", serverNettyIp);
            }

            serverRMap.put("ServerIds", this.serversSet);
            serverRMap.put("WorldLv", this.getWorldLv());
            serverRMap.put("openTime", this.openServerTime);
            if (this.curAvgPower == 0L) {
               serverRMap.put("curAlivePlayerNum", this.calcAlivePlayerNum);
               serverRMap.put("curAvgPower", this.calcAlivePlayerNum == 0L ? 0L : this.calcTotalPower / this.calcAlivePlayerNum);
            } else {
               serverRMap.put("curAlivePlayerNum", this.curAlivePlayerNum);
               serverRMap.put("curAvgPower", this.curAvgPower);
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

         serverRMap.touchAsync();
      }
   }

   public void update() {
      for(Map.Entry<String, Channel> entry : this.allChannel.entrySet()) {
         Channel channel = (Channel)entry.getValue();
         long lifeTime = (Long)channel.attr(AttributeKey.valueOf("life")).get();
         if (System.currentTimeMillis() - lifeTime > 600000L) {
            channel.close();
         }
      }

      this.updateWorldLv(false);
   }

   public void addNewPlayer(GamePlayer player) {
      this.playerMap.put(player.getPlayerId(), player);
      this.accountMap.put(String.format("%s-%d", player.getAccount(), player.getServerId()), player);
      this.channelMap.put(player.getChannel().id().asLongText(), player);
      this.onlinePlayerMap.put(player.getPlayerId(), player);
   }

   public boolean checkBean() {
      DependsOn dependsOn = (DependsOn)WorldMgr.class.getDeclaredAnnotation(DependsOn.class);
      String[] beansName = dependsOn.value();

      for(String beanName : beansName) {
         Object obj = ApplicationContextProvider.getContext().getBean(beanName);
         if (Objects.isNull(obj)) {
            logger.error("无法找到必要的BEAN：" + beanName);
            Runtime.getRuntime().exit(0);
            return false;
         }
      }

      return true;
   }

   protected void init() throws Exception {
      if (!this.checkBean()) {
         serverState.set(3);
         throw new Exception("服务器状态错误");
      } else {
         this.checkDbIncrementValue();
         LogDefine.initCheck();
         this.mergeServerTime = 0L;
         String mergeServerTimeStr = this.env.getProperty("mergeServerTime");
         if (mergeServerTimeStr != null && !mergeServerTimeStr.isEmpty()) {
            this.mergeServerTime = DateUtil.getLongTime(mergeServerTimeStr, "yyyy-MM-dd HH:mm:ss");
         }

         String countryStr = this.env.getProperty("country");
         if (countryStr != null && !countryStr.isEmpty()) {
            this.country = countryStr;
         } else {
            this.country = "cn";
         }

         for(CommonMsg.HeroStateArraying value : CommonMsg.HeroStateArraying.values()) {
            heroArrayingStateList.add(value.getNumber());
         }

         this.serversSet.add(this.GAME_SERVER_ID);
         MSG_MASK = (byte)(RandomUtil.randInt(126) + 1);
         this.initBadWords();
         HolidaysLoader.load(this.holidaysPath);
         WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.getMgrPart(WorldMgrPushTaskPart.class);
         List<AccountDao> accountList = this.gameCachePool.getAllTableByList("tb_account");
         logger.info("WorldMgr.init 开始初始化全部GamePlayer, account size: {}", accountList.size());
         long initAllGamePlayerTime = System.currentTimeMillis();

         for(AccountDao accountDao : accountList) {
            GamePlayer player = (GamePlayer)this.context.getBean(GamePlayer.class);
            player.setPlayerIdAndAccount(accountDao.playerId, accountDao.account, accountDao.serverId);
            this.playerMap.put(accountDao.playerId, player);
            String account = String.format("%s-%d", accountDao.account, accountDao.serverId);
            this.accountMap.put(account, player);
            this.serversSet.add(accountDao.serverId);
            worldMgrPushTaskPart.checkAutoBattle(player);
         }

         logger.info("WorldMgr.init 结束初始化全部GamePlayer, 耗时 {}", System.currentTimeMillis() - initAllGamePlayerTime);
         this.incRef();
         Debug.sleep(1L);
         this.initExeclModel();
         this.schedule(600000L, 600000L, this::update);
         WorldMgrPart worldMgrPart = (WorldMgrPart)this.getMgrPart(WorldMgrPart.class);
         worldMgrPart.preLoadPlayerName();
         worldMgrPart.preLoadActivityPlayer();
         if (!worldMgrPart.prePlayerPublicDao()) {
            logger.error("预加载玩家公共数据错误");
         }

         logger.info("WorldMgr.init 开始初始化全部管理器");
         long initAllMgrTime = System.currentTimeMillis();
         this.initMgrData();
         logger.info("WorldMgr.init 结束初始化全部管理器, 耗时 {}", System.currentTimeMillis() - initAllMgrTime);
         this.playerIt = this.playerMap.entrySet().iterator();
         this.loadClientVersion();
         WorldDao<WorldData> worldDataWorldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
         if (((WorldData)worldDataWorldDao.jsonData).updateTime > 0L) {
            worldMgrPushTaskPart.serverHourCheck(System.currentTimeMillis());
         } else {
            ((WorldData)worldDataWorldDao.jsonData).updateTime = System.currentTimeMillis();
            worldDataWorldDao.updateOp();
         }

         this.decRef();
         GcMgr.doFullGc();
         logger.info("启动world完成,执行GC...");
         isInitFinish.set(true);
         HotSwapUtil.hotUpdateCheck(this, this.hotSwapClassPath, this.hotSwapJarPath, true);
         HotSwapUtil.UPDATING.getAndSet(false);
         this.pushTask(() -> {
            if (!Debug.isDebug) {
               worldMgrPart.preLoadPlayerDBData();
               worldMgrPart.preLoadHeroSupportData();
            }
         });
      }
   }

   public void startBattleTest() {
      Environment env = ApplicationContextProvider.getContext().getEnvironment();
      String heroPath = env.getProperty("heroPath");
      if (heroPath != null && heroPath.length() > 0) {
         BattleTestMgr.readyData(heroPath);

         for(int i = 0; i < 4; ++i) {
            BattleTestMgr mgr = (BattleTestMgr)ApplicationContextProvider.getContext().getBean(BattleTestMgr.class);
            this.battleTestMgrList.add(mgr);
            mgr.begin();
         }

         logger.info("开始就算战斗时间:{}", System.currentTimeMillis());
      }

   }

   public void stopBattleTest() {
      for(BattleTestMgr mgr : this.battleTestMgrList) {
         mgr.stop();
      }

   }

   public void testOne() {
      if (this.battleTestMgrList.size() == 0) {
         Environment env = ApplicationContextProvider.getContext().getEnvironment();
         String heroPath = env.getProperty("heroPath");
         BattleTestMgr.readyData(heroPath);
         BattleTestMgr mgr = (BattleTestMgr)ApplicationContextProvider.getContext().getBean(BattleTestMgr.class);
         this.battleTestMgrList.add(mgr);
      }

      BattleTestMgr mgr = (BattleTestMgr)this.battleTestMgrList.get(0);
      mgr.pushTask(() -> mgr.testRandom());
   }

   private RobotParsingResult loadRobotPlayerData() {
      RobotParsingResult robotParsingResult = new RobotParsingResult();
      robotParsingResult.gameDBPool = this.gameDBPool;
      robotParsingResult.dbTableNode = this.gameCachePool.getDBTableNode(PlayerDao.class);

      try {
         this.gameDBPool.query("select * from tb_player where playerId < 20000", robotParsingResult, new Object[0]);
      } catch (Throwable e) {
         e.printStackTrace();
      }

      return robotParsingResult;
   }

   private void initRobot(boolean isSync) {
      logger.info("初始化机器人，isSync={}", isSync);
      RobotParsingResult robotParsingResult = this.loadRobotPlayerData();
      Map<Integer, RobotModel> robotModelMap = this.gameModelPool.getMap("robot");

      for(Map.Entry<Integer, RobotModel> robotModelEntry : robotModelMap.entrySet()) {
         if ((Integer)robotModelEntry.getKey() > 20000) {
            logger.info("机器人配置不能大于20000");
            (new Exception()).printStackTrace();
         }

         try {
            Debug.sleep(10L);
         } catch (Exception var11) {
         }

         GamePlayer player = (GamePlayer)this.context.getBean(GamePlayer.class);
         int playerId = (Integer)robotModelEntry.getKey();
         PlayerDao playerDao = (PlayerDao)robotParsingResult.resultMap.get(playerId);
         String account = "robot-" + ((RobotModel)robotModelEntry.getValue()).getId();
         player.setPlayerIdAndAccount(playerId, account, this.GAME_SERVER_ID);
         if (playerDao != null) {
            player.getGameCachePool().insertCache(robotParsingResult.dbTableNode, playerDao);
         }

         playerDao = player.getPlayerDao();
         player.setRobot(true);
         this.playerMap.put(playerId, player);
         this.accountMap.put(String.format("%s-%d", account, this.GAME_SERVER_ID), player);
         if (playerDao.playerName == null || playerDao.playerName.isEmpty() || isSync) {
            this.initRobotPlayerDao(isSync, playerId, account, (RobotModel)robotModelEntry.getValue(), playerDao);
         }

         if (!StringUtils.isEmpty(playerDao.playerName)) {
            this.getPlayerName().add(playerDao.playerName);
            this.robotNameSet.add(playerDao.playerName);
         }

         int firstDuel = this.configManager.getIntDefault("firstDuel", 10261);
         if (playerDao.robotId == firstDuel) {
            this.pvpPlayerId = playerDao.playerId;
         }

         robotParsingResult.resultMap.put(playerDao.playerId, playerDao);
      }

   }

   public void initMgrData() throws Exception {
      this.incRef();
      long curTime = System.currentTimeMillis();
      this.monsterMgr.initBaseRobot();
      logger.info("【init消耗】monsterMgr.initBaseRobot {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.unionMgrParent.initData();
      logger.info("【init消耗】unionMgrParent.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      logger.info("【init消耗】rankMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.pvpSeasonMgr.initData();
      logger.info("【init消耗】pvpSeasonMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      int initNewRobot = this.configManager.getIntDefault("initNewRobot", 0);
      this.initRobot(initNewRobot == 1);
      logger.info("【init消耗】initRobot {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.pvpSeasonMgr.updatePlayerScore();
      logger.info("【init消耗】pvpSeasonMgr.updatePlayerScore {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.initWarHero();
      logger.info("【init消耗】initWarHero {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.activityMgr.initData();
      logger.info("【init消耗】activityMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.worldBossMgr.initData();
      logger.info("【init消耗】worldBossMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.kingOfCentralPlainsMgr.initData();
      logger.info("【init消耗】kingOfCentralPlainsMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.allianceMgr.initData();
      logger.info("【init消耗】allianceMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.dragonDiscipleMgr.initData();
      logger.info("【init消耗】dragonDiscipleMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.gmMgr.initData();
      logger.info("【init消耗】gmMgr.initData {}ms", System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      this.gcMgr.initData();
      logger.info("【init消耗】gcMgr.initData {}ms", System.currentTimeMillis() - curTime);
      this.unionDailyGuessMgr.pushTask(() -> this.unionDailyGuessMgr.resetUnionDailyGuessChapter());
      this.mailWorldMgr.pushTaskEx("initData", new Object[0]);
      this.getWorldDao(GameDefine.WorldModule.WORLD_DAO_MERGE_ACTIVITY);
      this.rankMgr.initData();
      this.worldCupMgr.initData();
      this.decRef();
   }

   protected void loadDataFinish() {
      WorldMgrPart worldMgrPart = (WorldMgrPart)this.getMgrPart(WorldMgrPart.class);
      worldMgrPart.autoOpenPort();
   }

   public synchronized void save() {
      super.save();
   }

   public void crossConnectSuc(CrossMsg.CR2S_Login_4204 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("游戏服确认登录到跨服，可以开始跨服玩法");
      this.gameModelPool.systemOperationLog("WorldMgr.crossConnectSuc", System.currentTimeMillis());
      this.unionMgrParent.requestCrossData();
      this.allianceMgr.requestCrossInit();
      this.waterTransportMgr.requestAltar();
      this.mineMgr.connectCrossMgr = true;
      this.heroRankMgr.connectCrossServer();
      this.activityMgr.uploadCross();
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.getMgrPart(WorldMgrPushTaskPart.class);
      worldMgrPushTaskPart.crossChangeCheck();
      this.uploadWeeklyAliveNum();
   }

   private void closeChanelAndNotice(Channel channel) {
      LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.CLOSED).build();
      channel.writeAndFlush(protoMsg);
      channel.close();
   }

   @TaskMethod
   public void channelActive(Channel channel) {
      if (serverState.get() == 2) {
         this.closeChanelAndNotice(channel);
      } else {
         String channelId = channel.id().asLongText();
         this.allChannel.put(channelId, channel);
      }
   }

   public void channelInactive(Channel channel) {
      String id = channel.id().asLongText();
      this.allChannel.remove(id);
      GamePlayer gamePlayer = (GamePlayer)this.channelMap.remove(id);
      if (gamePlayer != null) {
         Integer playerId = (Integer)channel.attr(AttributeKey.valueOf("playerId")).get();
         if (playerId != null) {
            gamePlayer.pushTask(gamePlayer::logout);
         }

         this.onlinePlayerMap.remove(gamePlayer.getPlayerId(), gamePlayer);
      }
   }

   @MsgHandlerAnno
   public void msgLogin(LoginMsg.C2S_Login_1000 msg, String source) {
      Channel channel = (Channel)this.allChannel.get(source);
      if (channel == null) {
         (new RuntimeException(String.format("source:%s,channel is null", source))).printStackTrace();
      } else if (!this.serversSet.contains(msg.getServerId())) {
         LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.SERVERID).build();
         channel.writeAndFlush(protoMsg);
         channel.close();
         logger.error(String.format("%s账号的服务器id错误", msg.getAccountName()));
      } else {
         long nowTime = System.currentTimeMillis();
         if (this.openServerTime > nowTime) {
            InetSocketAddress address = (InetSocketAddress)channel.remoteAddress();
            if (!this.gmMgr.PLATFORM_WHITE_LIST.contains(address.getAddress().getHostAddress())) {
               Integer advanceEnter = (Integer)ApplicationContextProvider.getModelPoolEntity("customAdvanceEnterGame", this.country);
               if (advanceEnter == null || nowTime < this.openServerTime - (long)advanceEnter * 1000L) {
                  LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.SERVER_OPEN_TIME).build();
                  channel.writeAndFlush(protoMsg);
                  channel.close();
                  return;
               }
            }
         }

         if (AppArgs.isLoginLimit) {
            LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.SERVER_OPEN_TIME).build();
            channel.writeAndFlush(protoMsg);
            channel.close();
         } else if (this.onlinePlayerMap.size() > ApplicationContextProvider.getConfigInt("ServerFull", 5000)) {
            LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.FULL).build();
            channel.writeAndFlush(protoMsg);
            channel.close();
         } else {
            this.addDevice(msg);
            GamePlayer gamePlayer = this.getGamePlayerByAccount(msg.getAccountName(), msg.getServerId());
            if (gamePlayer == null && this.isRegisterLimit() && !this.gmMgr.getAllAccountWhiteList().containsKey(msg.getAccountName())) {
               LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.REGISTER_LIMIT).build();
               channel.writeAndFlush(protoMsg);
               channel.close();
            } else {
               boolean isGuest = msg.hasIsGuest() && msg.getIsGuest();
               if (isGuest) {
                  LoginMsg.resultType guestCheck = this.guestLimitTrigger(gamePlayer, msg.getDevUID());
                  if (guestCheck != null) {
                     LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(guestCheck).build();
                     channel.writeAndFlush(protoMsg);
                     channel.close();
                     return;
                  }
               } else if (msg.hasAge()) {
                  LoginMsg.resultType antiAddiction = this.antiAddictionTrigger(gamePlayer, msg.getAge());
                  if (antiAddiction != null) {
                     LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(antiAddiction).build();
                     channel.writeAndFlush(protoMsg);
                     channel.close();
                     return;
                  }
               }

               if (gamePlayer == null) {
                  if (this.isRegisterLimit() && !this.gmMgr.getAllAccountWhiteList().containsKey(msg.getAccountName())) {
                     LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.REGISTER_LIMIT).build();
                     channel.writeAndFlush(protoMsg);
                     channel.close();
                  } else {
                     AccountDao dao = new AccountDao();
                     dao.serverId = msg.getServerId();
                     dao.account = msg.getAccountName();

                     try {
                        this.gameCachePool.insertDao(dao, true);
                     } catch (Exception var18) {
                        LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.KICKOUT).build();
                        channel.writeAndFlush(protoMsg);
                        channel.close();
                        return;
                     }

                     GamePlayer newPlayer = (GamePlayer)this.context.getBean(GamePlayer.class);
                     newPlayer.setChannel(channel);
                     newPlayer.setPlayerIdAndAccount(dao.playerId, dao.account, dao.serverId);
                     newPlayer.setDevUID(msg.getDevUID());
                     newPlayer.setGuest(isGuest);
                     this.addNewPlayer(newPlayer);
                     newPlayer.pushTask(() -> newPlayer.login(false));
                  }
               } else {
                  if (!StringUtils.isEmpty(msg.getSign())) {
                     logger.info("sdk登录验证,accountName:{},accountType:{},loginTime:{},channelId:{},account:{},sign:{}", new Object[]{msg.getAccountName(), msg.hasAccountType() ? msg.getAccountType() : -1, msg.hasLoginTime() ? msg.getLoginTime() : 0, msg.getChannelId(), msg.getAccount(), msg.getSign()});
                     if (StringUtils.isEmpty(msg.getAccountName()) || !msg.hasAccountType() || !msg.hasLoginTime() || msg.getLoginTime() <= 0 || StringUtils.isEmpty(msg.getChannelId()) || StringUtils.isEmpty(msg.getAccount())) {
                        LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.LOGIN_AUTH_FAIL).build();
                        channel.writeAndFlush(protoMsg);
                        channel.close();
                        logger.error("sdk登录验证失败,存在空值参数");
                        return;
                     }

                     String signStr = msg.getChannelId() + msg.getAccount() + msg.getAccountName() + msg.getAccountType() + msg.getLoginTime() + this.LOGIN_KEY;
                     logger.info("sdk验签字符串:{}", signStr);
                     String loginSign = MD5Util.encode(signStr);
                     if (!loginSign.equals(msg.getSign())) {
                        LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.LOGIN_AUTH_FAIL).build();
                        channel.writeAndFlush(protoMsg);
                        channel.close();
                        logger.error("sdk登录验证失败,验签失败,服务器验证:{},客户端验签:{},key:{}", new Object[]{loginSign, msg.getSign(), this.LOGIN_KEY});
                        return;
                     }
                  }

                  gamePlayer.setDevUID(msg.getDevUID());
                  gamePlayer.setGuest(isGuest);
                  byte isTempReConnect = 0;
                  if (gamePlayer.getChannel() != null && gamePlayer.getChannel() != channel) {
                     this.channelMap.remove(gamePlayer.getChannel().id().asLongText());
                     gamePlayer.getChannel().attr(AttributeKey.valueOf("playerId")).set((Object)null);
                     gamePlayer.closeChannel(LoginMsg.resultType.OTHER);
                     isTempReConnect = 1;
                  }

                  Object key = channel.attr(AttributeKey.valueOf("playerId")).get();
                  if (!Objects.nonNull(key)) {
                     PlayerDao playerDao = gamePlayer.getPlayerDao();
                     if (playerDao.banEndTime > nowTime) {
                        LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.REFUSE).build();
                        channel.writeAndFlush(protoMsg);
                        channel.close();
                     } else {
                        if (!Debug.isDebug && playerDao.type == 998 && playerDao.logoutTime > 0L) {
                           long offlineTime = nowTime - playerDao.logoutTime;
                           long unseaIntvalTime = nowTime - playerDao.unsealTime;
                           long offlineDaysBan = (long)ApplicationContextProvider.getConfigInt("innterPlayerOfflineDaysBan", 7);
                           if (offlineTime >= offlineDaysBan * 24L * 3600L * 1000L && unseaIntvalTime > 3600000L) {
                              logger.info("内玩【{}】{}日未登录封号,上次登出时间【{}】", new Object[]{playerDao.playerName, offlineDaysBan, DateUtil.transferLongToDate(playerDao.logoutTime)});
                              this.gmMgr.gmBanRole(playerDao.playerId, 5256000);
                              LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.REFUSE).build();
                              channel.writeAndFlush(protoMsg);
                              channel.close();
                              return;
                           }
                        }

                        channel.attr(AttributeKey.valueOf("playerId")).set(gamePlayer.getPlayerId());
                        gamePlayer.setChannel(channel);
                        gamePlayer.pushTask(() -> gamePlayer.loginLog(msg.getDevUID(), msg.getDevName(), msg.getDevOsVer(), msg.getDevRes(), msg.getNetOper(), msg.getNetInfo(), msg.getVersion(), isTempReConnect, 0));
                        this.channelMap.put(gamePlayer.getChannel().id().asLongText(), gamePlayer);
                        this.onlinePlayerMap.put(gamePlayer.getPlayerId(), gamePlayer);
                        gamePlayer.pushTask(() -> gamePlayer.login(false));
                     }
                  }
               }
            }
         }
      }
   }

   public void addDevice(LoginMsg.C2S_Login_1000 msg) {
      DeviceDao deviceDao = (DeviceDao)this.gameCachePool.getData("tb_device", new Object[]{msg.getDevUID()});
      DeviceData data = new DeviceData();
      data.agentId = msg.getChannelId();
      data.netInfo = msg.getNetInfo();
      data.groupId = msg.getGroupId();
      data.devUID = msg.getDevUID();
      data.devName = msg.getDevName();
      data.devOsVer = msg.getDevOsVer();
      data.devRes = msg.getDevRes();
      data.netOper = msg.getNetOper();
      data.accountName = msg.getAccountName();
      deviceDao.jsonData = JsonUtil.beanToJson(data);
      deviceDao.updateOp();
   }

   public GamePlayer getPlayerByChannel(String id) {
      return (GamePlayer)this.channelMap.get(id);
   }

   public GamePlayer getPlayerById(int id) {
      return (GamePlayer)this.playerMap.get(id);
   }

   public List<GamePlayer> getOnlinePlayer() {
      return new LinkedList(this.onlinePlayerMap.values());
   }

   public GamePlayer getOnlinePlayer(int playerId) {
      return (GamePlayer)this.onlinePlayerMap.get(playerId);
   }

   public ConcurrentHashMap<Integer, GamePlayer> getPlayerMap() {
      return this.playerMap;
   }

   public List<GamePlayer> getAllPlayer() {
      return new LinkedList(this.playerMap.values());
   }

   public GamePlayer getGamePlayerByAccount(String account, int serverId) {
      return (GamePlayer)this.accountMap.get(String.format("%s-%d", account, serverId));
   }

   public ConcurrentHashMap<String, GamePlayer> getAccountMap() {
      return this.accountMap;
   }

   public Set<Integer> getServersSet() {
      return this.serversSet;
   }

   public <T> WorldDao<T> getWorldDao(GameDefine.WorldModule module) {
      WorldDao<T> worldDao = (WorldDao)this.gameCachePool.getData("tb_world", new Object[]{module.id});
      if (worldDao.jsonData == null) {
         worldDao.loadData("");
         worldDao.updateOp();
      }

      return worldDao;
   }

   public void updateWorldLv(boolean bInit) {
      int worldLevelRefreshCd = this.configManager.getIntDefault("worldLevelRefreshCd", 3600);
      long interval = System.currentTimeMillis() - this.worldLvStamp;
      if (bInit || interval >= (long)worldLevelRefreshCd * 1000L) {
         int worldLevelPlayerNum = this.configManager.getIntDefault("worldLevelPlayerNum", 10);
         List<RankData> ranks = this.rankMgr.getRanks(RankDefine.RankModule.PLAYER_LV, worldLevelPlayerNum);
         int count = 0;
         int totalLevel = 0;
         long threeDayMillis = System.currentTimeMillis() - 259200000L;

         for(RankData rankData : ranks) {
            GamePlayer player = this.getPlayerById(rankData.value);
            if (player != null) {
               PlayerPublicDao publicDao = player.getPublicDao();
               if (player.isLogin() || publicDao.logoutTime > threeDayMillis) {
                  ++count;
                  totalLevel += publicDao.lv;
               }
            }
         }

         if (count != 0) {
            int worldLv = totalLevel / count;
            WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
            WorldData worldData = (WorldData)worldDao.jsonData;
            if (worldData.worldLv < worldLv) {
               worldData.worldLv = worldLv;
               worldDao.updateOp();
               this.worldLvStamp = System.currentTimeMillis();
               this.sendWorldLv();
            }
         }
      }
   }

   private void sendWorldLv() {
      this.pushTask(() -> this.onlinePlayerMap.forEach((key, player) -> player.pushTask(() -> player.sendWorldLv())));
   }

   public int getWorldLv() {
      WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      WorldData worldData = (WorldData)worldDao.jsonData;
      return worldData != null ? Math.max(worldData.worldLv, 10) : 10;
   }

   public void forceWorldLv(int worldLv) {
      WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      WorldData worldData = (WorldData)worldDao.jsonData;
      if (worldData != null) {
         worldData.worldLv = worldLv;
         worldDao.updateOp();
      }

      this.sendWorldLv();
   }

   public void openServer() {
      serverState.set(1);
   }

   public String getOpengingActivityRedisKey(int serverId) {
      StringBuilder stringBuilder = new StringBuilder();
      String key = stringBuilder.append(this.PLATFORM_NAME).append(":server_").append(serverId).append(":opening_activity").toString().toLowerCase();
      return key;
   }

   public String getServerInfoRedisKey(int serverId) {
      StringBuilder stringBuilder = new StringBuilder();
      String key = stringBuilder.append(this.PLATFORM_NAME).append(":server_").append(serverId).append(":info").toString().toLowerCase();
      return key;
   }

   public void setServerInfoToRedis(HashSet<Integer> slaveServerIds) {
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      String key = this.getServerInfoRedisKey(this.GAME_SERVER_ID);
      RMap<String, String> map = gameRedisTool.getClient().getMap(key);
      map.clear();
      map.put("openServerTime", String.valueOf(this.getOpenServerTime()));
      map.put("mergeServerTime", String.valueOf(this.getMergeServerTime()));
      map.put("serverName", this.GAME_SERVER_NAME);
      if (!slaveServerIds.isEmpty()) {
         String slaveServerIdsStr = Joiner.on(";").join(slaveServerIds);
         map.put("waitMergeSlaveServerIds", slaveServerIdsStr);
      }

      WorldDao<ActivityData> worldDao = this.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      map.put("koiBuy", Joiner.on(",").join(((ActivityData)worldDao.jsonData).weekendKoiBuys));
      map.put("kittySeedProcess", String.valueOf(((ActivityData)worldDao.jsonData).kittySeedProcess));
      map.put("seedProcess", String.valueOf(((ActivityData)worldDao.jsonData).seedProcess));
      StringBuilder stringBuilder = new StringBuilder();
      WorldDao<HashMap<Integer, ArrayList<String>>> promoteWorldDao = this.<HashMap<Integer, ArrayList<String>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_LEVEL_PROMOTE_RECORD);

      for(Map.Entry<Integer, ArrayList<String>> entry : ((HashMap)promoteWorldDao.jsonData).entrySet()) {
         ArrayList<String> stringList = (ArrayList)entry.getValue();
         if (stringList.size() > 0) {
            stringBuilder.append(entry.getKey()).append("_");

            for(String str : stringList) {
               stringBuilder.append(str).append(",");
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }

         stringBuilder.append(";");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         map.put("levelPromote", stringBuilder.toString());
      }

      GameDBPool dbPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
      String sql = "SELECT id FROM tb_battle_record ORDER BY id DESC LIMIT 1;";

      try {
         dbPool.query(sql, (resultSet) -> {
            try {
               if (resultSet.next()) {
                  int id = resultSet.getInt(1);
                  map.put("maxIdOfBattleRecord", String.valueOf(id));
               }
            } catch (Exception e) {
               logger.info("查询BattleRecord主键错误");
               e.printStackTrace();
            }

         }, new Object[0]);
      } catch (Throwable t) {
         t.printStackTrace();
      }

   }

   @TaskMethod
   public void mainServerMergeBegin(HashSet<Integer> mergeServerIds) {
      if (!this.onlinePlayerMap.isEmpty()) {
         logger.error("WorldMgr.mainServerMergeBegin，但仍有在线玩家，请检查!!!");
      } else if (mergeServerIds.isEmpty()) {
         logger.error("WorldMgr.mainServerMergeBegin, 但无从服，清检查!!!");
      } else if (this.playerMap.keySet().stream().noneMatch((playerId) -> playerId > 20000)) {
         logger.error("WorldMgr.mainServerMergeBegin，但主服玩家列表为空，请检查!!!");
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            logger.error("WorldMgr.mainServerMergeBegin, 跨服还未连接，清检查!!!");
         } else {
            this.setServerInfoToRedis(mergeServerIds);
            Map<String, GameMgr> gameMgrMap = ApplicationContextProvider.getContext().getBeansOfType(GameMgr.class);

            try {
               for(GameMgr gameMgr : gameMgrMap.values()) {
                  gameMgr._mainServerMergeBegin();
               }
            } catch (Exception e) {
               e.printStackTrace();
               this.gameModelPool.systemOperationLog("WorldMgr.mainServerMergeBegin fail, throw exception", System.currentTimeMillis());
               return;
            }

            if (mergeServerIds.isEmpty()) {
               logger.info("WorldMgr.mainServerMergeBegin success");
               this.gameModelPool.systemOperationLog("WorldMgr.mainServerMergeBegin success", System.currentTimeMillis());
            } else {
               CrossMsg.S2CR_MergeServer_4217.Builder builder = CrossMsg.S2CR_MergeServer_4217.newBuilder();
               builder.setMainid(this.GAME_SERVER_ID);
               builder.addAllSlaveIds(mergeServerIds);
               crossNettyClient.sendCross(this.GAME_SERVER_ID, 0, builder.build());
            }

         }
      }
   }

   @MsgHandlerAnno
   public void S2CR_MergeServer_4218(CrossMsg.S2CR_MergeServer_4218 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getResult()) {
         logger.info("WorldMgr.mainServerMergeBegin success");
         this.gameModelPool.systemOperationLog("WorldMgr.mainServerMergeBegin success", System.currentTimeMillis());
      } else {
         this.gameModelPool.systemOperationLog("WorldMgr.mainServerMergeBegin fail, throw exception", System.currentTimeMillis());
      }

   }

   @TaskMethod
   public void slaveServerMergeBegin(int mainServerId) {
      long beginTime = System.currentTimeMillis();
      if (!this.onlinePlayerMap.isEmpty()) {
         logger.error("WorldMgr.slaveServerMergeBegin，但仍有在线玩家，请检查!!!");
      } else if (this.serversSet.contains(mainServerId)) {
         logger.error("WorldMgr.slaveServerMergeBegin 非法的主服ID: {}", mainServerId);
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            logger.error("WorldMgr.slaveServerMergeBegin, 跨服还未连接，清检查!!!");
         } else {
            GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
            String key = this.getServerInfoRedisKey(mainServerId);
            RMap<String, String> map = gameRedisTool.getClient().getMap(key);
            if (null != map && !map.isEmpty()) {
               String slaveServerIds = (String)map.get("waitMergeSlaveServerIds");
               HashSet<String> slaveServerSet = new HashSet(Arrays.asList(slaveServerIds.split(";")));
               if (!slaveServerSet.contains(String.valueOf(this.GAME_SERVER_ID))) {
                  logger.error("WorldMgr.slaveServerMergeBegin 主服合服列表[{}]中无当前服信息!!!", slaveServerIds);
               } else {
                  logger.info("WorldMgr.slaveServerMergeBegin mainServerId is: {}", mainServerId);
                  Map<String, GameMgr> gameMgrMap = ApplicationContextProvider.getContext().getBeansOfType(GameMgr.class);

                  try {
                     this.setServerInfoToRedis(new HashSet());

                     for(GameMgr gameMgr : gameMgrMap.values()) {
                        gameMgr._slaveServerMergeBegin(mainServerId);
                     }
                  } catch (Exception e) {
                     e.printStackTrace();
                     this.gameModelPool.systemOperationLog("WorldMgr.slaveServerMergeBegin fail, throw exception", System.currentTimeMillis());
                     return;
                  }

                  logger.info("WorldMgr.slaveServerMergeBegin success");
                  logger.info("WorldMgr.slaveServerMergeBegin 消耗时间: {}", System.currentTimeMillis() - beginTime);
                  this.gameModelPool.systemOperationLog("WorldMgr.slaveServerMergeBegin success", System.currentTimeMillis());
               }
            } else {
               logger.error("WorldMgr.slaveServerMergeBegin 无法从redis找到主服 {} 信息", mainServerId);
            }
         }
      }
   }

   @TaskMethod
   public void mainServerMergeFinish(HashSet<Integer> slaveServerSet) {
      long beginTime = System.currentTimeMillis();
      if (slaveServerSet.isEmpty()) {
         logger.error("WorldMgr.mainServerMergeFinish，没有从服ID，请检查!!!");
      } else {
         for(Integer serverId : slaveServerSet) {
            if (serverId == this.GAME_SERVER_ID) {
               logger.error("WorldMgr.mainServerMergeFinish，非法的从服ID {}，从服ID和主服ID一样，请检查!!!", serverId);
               return;
            }

            if (!this.serversSet.contains(serverId)) {
               logger.error("WorldMgr.mainServerMergeFinish，非法的从服ID {}，从服ID不存在，请检查!!!", serverId);
               return;
            }
         }

         if (!this.onlinePlayerMap.isEmpty()) {
            logger.error("WorldMgr.mainServerMergeFinish，但仍有在线玩家，请检查!!!");
         } else if (!isInitFinish.get()) {
            logger.error("WorldMgr.mainServerMergeFinish，但服务器还未初始化完毕，请检查!!!");
         } else {
            CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
            if (!crossNettyClient.isLogin()) {
               logger.error("WorldMgr.mainServerMergeFinish, 跨服还未连接，清检查!!!");
            } else {
               boolean checkMergeDate = 0L != this.mergeServerTime && DateUtil.isSameYear(System.currentTimeMillis(), this.getMergeServerTime()) && DateUtil.isSameDay(this.getMergeServerTime());
               if (!checkMergeDate) {
                  logger.error("WorldMgr.mainServerMergeFinish，合服日期与配置的合服日期不匹配，请检查!!!");
               } else {
                  this.mailServerPlayerNameSet = new HashSet();
                  this.slaveServerPlayerMap = new HashMap();

                  for(Map.Entry<Integer, GamePlayer> entry : this.playerMap.entrySet()) {
                     GamePlayer tempPlayer = (GamePlayer)entry.getValue();
                     int playerServerId = tempPlayer.getServerId();
                     if (playerServerId != this.GAME_SERVER_ID && slaveServerSet.contains(playerServerId)) {
                        this.slaveServerPlayerMap.put(tempPlayer.getPlayerId(), tempPlayer);
                     } else {
                        PlayerPublicDao playerPublicDao = tempPlayer.getPublicDao();
                        if (!StringUtils.isEmpty(playerPublicDao.playerName)) {
                           this.mailServerPlayerNameSet.add(playerPublicDao.playerName);
                        }
                     }
                  }

                  Map<String, GameMgr> gameMgrMap = ApplicationContextProvider.getContext().getBeansOfType(GameMgr.class);

                  try {
                     for(GameMgr gameMgr : gameMgrMap.values()) {
                        gameMgr._mainServerMergeFinish(slaveServerSet);
                        System.gc();
                     }
                  } catch (Exception e) {
                     e.printStackTrace();
                     this.gameModelPool.systemOperationLog("WorldMgr.mainServerMergeFinish fail, throw exception", System.currentTimeMillis());
                     return;
                  }

                  int oldWorldLv = this.getWorldLv();
                  this.updateWorldLv(true);
                  logger.info("WorldMgr.mainServerMergeFinish 更新世界等级 {} -> {}", oldWorldLv, this.getWorldLv());
                  int maxBattleRecordId = 0;

                  for(int serverId : this.serversSet) {
                     String key = this.getServerInfoRedisKey(serverId);
                     RMap<String, String> map = this.gameRedisTool.getClient().getMap(key);
                     if (null != map && !map.isEmpty()) {
                        try {
                           String tmpIdStr = (String)map.get("maxIdOfBattleRecord");
                           if (!StringUtil.isEmpty(tmpIdStr)) {
                              int tmpId = Integer.parseInt(tmpIdStr);
                              if (tmpId > maxBattleRecordId) {
                                 maxBattleRecordId = tmpId;
                              }
                           }
                        } catch (Exception e) {
                           logger.info("WorldMgr.mainServerMergeFinish 更新BattleRecord.id错误");
                           e.printStackTrace();
                        }
                     }
                  }

                  if (maxBattleRecordId > 0) {
                     GameDBPool dbPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);
                     String sql = String.format("ALTER TABLE tb_battle_record AUTO_INCREMENT=%d", maxBattleRecordId + 1);

                     try {
                        dbPool.query(sql, new Object[0]);
                        logger.info("WorldMgr.mainServerMergeFinish 更新BattleRecord.id自增值为{}", maxBattleRecordId + 1);
                     } catch (Throwable t) {
                        t.printStackTrace();
                     }
                  }

                  WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
                  ++((WorldData)worldDao.jsonData).mergeServerTimes;
                  worldDao.updateOp();
                  logger.info("WorldMgr.mainServerMergeFinish success");
                  logger.info("WorldMgr.mainServerMergeFinish 消耗时间: {}", System.currentTimeMillis() - beginTime);
                  this.gameModelPool.systemOperationLog("WorldMgr.mainServerMergeFinish success", System.currentTimeMillis());
               }
            }
         }
      }
   }

   public void closeServer() {
      serverState.set(2);
      DBPool.GlobalSave.set(true);
      Iterator<Map.Entry<String, Channel>> it = this.allChannel.entrySet().iterator();

      while(it.hasNext()) {
         Map.Entry<String, Channel> entry = (Map.Entry)it.next();
         it.remove();
         LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.CLOSED).build();
         ((Channel)entry.getValue()).writeAndFlush(protoMsg);
         ((Channel)entry.getValue()).close();
         GamePlayer gamePlayer = (GamePlayer)this.channelMap.get(entry.getKey());
         if (gamePlayer != null) {
            gamePlayer.logout();
            gamePlayer.stopAutoSave();
         }
      }

      AllMgr allMgr = (AllMgr)ApplicationContextProvider.getContext().getBean(GameAllMgr.class);
      HashSet<MgrParent> allMgrSet = allMgr.getAllMgr();
      AtomicInteger count = new AtomicInteger(allMgrSet.size());

      for(MgrParent mgr : allMgrSet) {
         if (mgr instanceof GameMgr) {
            GameMgr gameMgr = (GameMgr)mgr;
            gameMgr.pushTask(() -> {
               gameMgr.stopAutoSave();
               gameMgr.save();
               count.decrementAndGet();
               if (count.get() == 0 && this.gameDBPool.getProcessNum().get() == 0L) {
                  DBPool.GlobalSave.set(false);
                  logger.info("1.0 closeServer:服务器保存成功!!!!!!!!!!!!!!");
               }

            });
         } else {
            count.decrementAndGet();
            if (count.get() == 0 && this.gameDBPool.getProcessNum().get() == 0L) {
               DBPool.GlobalSave.set(false);
               logger.info("1.1 closeServer:服务器保存成功!!!!!!!!!!!!!!");
            }
         }
      }

      LogOperationMgr var10001 = this.operationMgr;
      this.operationMgr.pushTask(var10001::closeServerSave);
      if (count.get() == 0 && this.gameDBPool.getProcessNum().get() == 0L) {
         DBPool.GlobalSave.set(false);
         logger.info("2.closeServer:服务器保存成功!!!!!!!!!!!!!!");
      }

   }

   public Set<String> getPlayerName() {
      return this.playerNameSet;
   }

   public boolean playerNameIsExist(String playerName) {
      if (!this.playerNameSet.contains(playerName)) {
         this.playerNameSet.add(playerName);
         return false;
      } else {
         return true;
      }
   }

   public void createWarHero(int round) {
      WorldDao<JingZhouData> worldDao = this.<JingZhouData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WAR_JZ_HERO);
      String str = this.configManager.getStr("warOfJingZhouNameAndDesc");
      String[] arr = str.split(":");
      worldDao.jsonData = (T)(new JingZhouData());

      for(int i = 0; i < arr.length; ++i) {
         String[] realStr = arr[i].split("\\|");
         String bossId = "";
         if (Integer.parseInt(realStr[1]) == 1) {
            bossId = this.configManager.getStr("factionBossWei");
         } else if (Integer.parseInt(realStr[1]) == 2) {
            bossId = this.configManager.getStr("factionBossShu");
         } else if (Integer.parseInt(realStr[1]) == 3) {
            bossId = this.configManager.getStr("factionBossWu");
         } else if (Integer.parseInt(realStr[1]) == 4) {
            bossId = this.configManager.getStr("factionBossShen");
         } else {
            bossId = this.configManager.getStr("factionBossMo");
         }

         ((JingZhouData)worldDao.jsonData).map.put(Integer.parseInt(realStr[1]), Integer.parseInt(bossId.split("\\|")[round - 1]));
      }

      ++round;
      if (round > 5) {
         round = 1;
      }

      ((JingZhouData)worldDao.jsonData).round = round;
      worldDao.updateOp();
   }

   public void warHeroReset() {
      WorldDao<JingZhouData> worldDao = this.<JingZhouData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WAR_JZ_HERO);
      JingZhouData data = (JingZhouData)worldDao.jsonData;
      if (data.round > 5) {
         this.createWarHero(1);
      } else {
         this.createWarHero(data.round);
      }

      worldDao.updateOp();
   }

   public void initWarHero() {
      WorldDao<JingZhouData> worldDao = this.<JingZhouData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WAR_JZ_HERO);
      if (((JingZhouData)worldDao.jsonData).map.isEmpty()) {
         this.createWarHero(1);
      }

   }

   @MsgHandlerAnno
   public void CR2S_PlayerBaseData_4201(CrossMsg.CR2S_PlayerBaseData_4201 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int playerId = msg.getPlayerId();
      logger.info("跨服发来的请求玩家数据{}", playerId);
      GamePlayer player = (GamePlayer)this.playerMap.get(playerId);
      if (!Objects.isNull(player)) {
         player.pushTask(() -> {
            CrossMsg.S2CR_PlayerBaseData_4202.Builder builder = CrossMsg.S2CR_PlayerBaseData_4202.newBuilder();
            PlayerPublicDao playerDao = player.getPublicDao();
            builder.setServerId(player.getServerId());
            builder.setPlayerId(player.getPlayerId());
            builder.setPlayerName(playerDao.playerName);
            builder.setSex(playerDao.sex);
            builder.setLv(playerDao.lv);
            builder.setCombatPower(player.getPlayerCombatPower());
            builder.setHeroNum(player.getBattleTeam(CommonMsg.HeroState.HERO_STATE_ARRAYING, (Map)null).getEntityMap().size());
            builder.setHeadId(playerDao.head);
            builder.setHeadFrame(playerDao.headFrame);
            builder.setPrestige(playerDao.prestige);
            builder.setMonarchId(playerDao.monarchId);
            builder.setUnionId(playerDao.unionId);
            builder.setVipLev(playerDao.vip_lv);
            builder.setUnionName("");
            builder.setPeakLv(playerDao.peak_lv);
            if (playerDao.unionId > 0) {
               UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
               UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
               builder.setUnionName(unionDao.unionName);
            }

            this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), builder.build());
         });
      }
   }

   @MsgHandlerAnno
   public void S2S_RedCliffGuessStart_4345(RedCliffMsg.S2S_RedCliffGuessStart_4345 msg, CrossSubscribeMsg crossSubscribeMsg) {
      RedCliffMsg.S2S_RedCliffGuessStart_4345.Builder builder = msg.toBuilder();
      String showItem = this.configManager.getStr("chibiaward");
      String[] items = showItem.split(",");

      for(int i = 0; i < items.length; ++i) {
         String[] item = items[i].split("\\|");
         CommonMsg.ItemInfo.Builder info = CommonMsg.ItemInfo.newBuilder();
         info.setType(Integer.parseInt(item[0]));
         info.setId(Integer.parseInt(item[1]));
         info.setNum(1);
         builder.addItem(info);
      }

      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
   }

   @MsgHandlerAnno
   public void S2S_PeakGuessStart_4459(PeakBattleMsg.S2S_PeakGuessStart_4459 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PeakBattleMsg.S2S_PeakGuessStart_4459.Builder builder = msg.toBuilder();
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
   }

   @MsgHandlerAnno
   public void S2C_TopThreeInfo_4469(PeakExtraMsg.S2C_TopThreeInfo_4469 msg, CrossSubscribeMsg crossSubscribeMsg) {
      PeakExtraMsg.S2C_TopThreeInfo_4469.Builder builder = msg.toBuilder();
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
   }

   public void updateRankHigher(int heroId, String module, int score) {
      WorldDao<ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>>> worldDao = this.<ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_SCORE);
      ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>> heroScoreMap = (ConcurrentHashMap)worldDao.jsonData;
      if (heroScoreMap.get(heroId) == null) {
         ConcurrentHashMap<String, Integer> moduleMap = new ConcurrentHashMap();
         moduleMap.put(module, score);
         heroScoreMap.put(heroId, moduleMap);
         worldDao.updateOp();
      } else {
         Map<String, Integer> moduleMap = (Map)heroScoreMap.get(heroId);
         int oldSocre = (Integer)moduleMap.getOrDefault(module, 0);
         if (score > oldSocre) {
            moduleMap.put(module, score);
            worldDao.updateOp();
         }
      }

   }

   public int getScore(String module, int heroId) {
      WorldDao<ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>>> worldDao = this.<ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_SCORE);
      Map<String, Integer> moduleMap = (Map)((ConcurrentHashMap)worldDao.jsonData).getOrDefault(heroId, new ConcurrentHashMap());
      return (Integer)moduleMap.getOrDefault(module, 0);
   }

   public Channel getChannel(String id) {
      return (Channel)this.allChannel.get(id);
   }

   public ConcurrentHashMap<String, GamePlayer> getChannelMap() {
      return this.channelMap;
   }

   public ConcurrentHashMap<Integer, GamePlayer> getOnlinePlayerMap() {
      return this.onlinePlayerMap;
   }

   public long getOpenServerTime() {
      return this.openServerTime;
   }

   public int getOpenServerDays() {
      return DateUtil.difftimeDay(new Timestamp(this.openServerTime)) + 1;
   }

   public long getMergeServerTime() {
      return this.mergeServerTime;
   }

   public int getPvpPlayerId() {
      return this.pvpPlayerId;
   }

   public RMap<String, String> getServerInfoFromRedis(int gameServerId) {
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      String key = this.getServerInfoRedisKey(gameServerId);
      return gameRedisTool.getClient().getMap(key);
   }

   public long getOpenServerTimeFromRedis(int gameServerId) {
      GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
      String key = this.getServerInfoRedisKey(gameServerId);
      RMap<String, String> map = gameRedisTool.getClient().getMap(key);
      if (null != map && !map.isEmpty()) {
         String openServerTime = (String)map.get("openServerTime");
         return StringUtil.isBlank(openServerTime) ? 0L : Long.parseLong(openServerTime);
      } else {
         return 0L;
      }
   }

   public String getServerNameFromRedis(int gameServerId) {
      return String.valueOf(gameServerId);
   }

   public LoginMsg.resultType antiAddictionTrigger(GamePlayer gamePlayer, int age) {
      if (gamePlayer != null) {
         PlayerExtend playerExtend = (PlayerExtend)gamePlayer.getPlayerExtend(13);
         playerExtend.age = age;
         gamePlayer.updatePlayerExtend(13);
      }

      return age >= 18 ? null : null;
   }

   public void recordDeviceOnlineTime(String devUID, long onlineTime) {
      DeviceDao deviceDao = this.getDevice(devUID);
      deviceDao.guestOnlineTime += onlineTime;
      deviceDao.updateOp();
   }

   public long getDeviceOnlineTime(String devUID) {
      return this.getDevice(devUID).guestOnlineTime;
   }

   public DeviceDao getDevice(String devUID) {
      return (DeviceDao)this.gameCachePool.getData("tb_device", new Object[]{devUID});
   }

   private LoginMsg.resultType guestLimitTrigger(GamePlayer gamePlayer, String devUID) {
      if (StringUtils.isEmpty(devUID)) {
         return LoginMsg.resultType.DEVICE_UID;
      } else {
         long curTime = System.currentTimeMillis();
         DeviceDao deviceDao = (DeviceDao)this.gameCachePool.getData("tb_device", new Object[]{devUID});
         if (deviceDao.guestLoginTime == 0L) {
            deviceDao.guestLoginTime = curTime;
            return null;
         } else if (curTime - deviceDao.guestLoginTime >= 1296000000L) {
            deviceDao.guestOnlineTime = 0L;
            deviceDao.guestLoginTime = 0L;
            deviceDao.updateOp();
            return null;
         } else {
            return null;
         }
      }
   }

   public int getOnlineLimitTime(int age) {
      if (age >= 18) {
         return 0;
      } else {
         return HolidaysLoader.isHolidayToday() ? 10800 : 5400;
      }
   }

   public void registerLimit() {
      WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (worldDao != null) {
         WorldData worldData = (WorldData)worldDao.jsonData;
         worldData.registerLimit = true;
         worldDao.updateOp();
      }
   }

   public void openRegister() {
      WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      if (worldDao != null) {
         WorldData worldData = (WorldData)worldDao.jsonData;
         worldData.registerLimit = false;
         worldDao.updateOp();
      }
   }

   public boolean isRegisterLimit() {
      WorldDao<WorldData> worldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      return worldDao == null ? false : ((WorldData)worldDao.jsonData).registerLimit;
   }

   public void initExeclModel() throws Exception {
      Map<Integer, ActivityRuleModel> activityRuleModelMap = ApplicationContextProvider.<Integer, ActivityRuleModel>getModelPoolMap("activityRule");

      for(ActivityRuleModel activityRuleModel : activityRuleModelMap.values()) {
         if (activityRuleModel.getOpenType() == 3) {
            Map<Integer, ActivityOpenTimeModel> activityOpenTimeModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customActivityOpenTime", activityRuleModel.getActivityType());
            if (activityOpenTimeModelMap != null) {
               int count = 0;

               for(ActivityOpenTimeModel activityOpenTimeModel : activityOpenTimeModelMap.values()) {
                  if (activityOpenTimeModel.getIsClose() == 0) {
                     ++count;
                     if (count > 1) {
                        throw new Exception("指定日期开启的活动" + activityOpenTimeModel.getActivityId() + "不能同时开启两个,请检查activityopenTime.xls");
                     }
                  }
               }
            }
         }
      }

      long mergeActivityOpenTime = DateUtil.getSomeDayBeginTime(this.mergeServerTime);
      int mergeActivityOpenDays = ApplicationContextProvider.getConfigInt("mergeActivityOpenDays", 7);
      long mergeActivityEndTime = DateUtil.getSomeDayBeginTime(this.mergeServerTime) + (long)mergeActivityOpenDays * 86400000L - 1L;

      for(ActivityRuleModel activityRuleModel : activityRuleModelMap.values()) {
         if (activityRuleModel.getOpenType() == 7) {
            long subActivityOpenTime = DateUtil.getSomeDayBeginTime(this.mergeServerTime) + (long)activityRuleModel.getOpenTime() * 86400000L;
            long subActivityEndTime = subActivityOpenTime + (long)(activityRuleModel.getDuration() * 1000);
            boolean timeValid = subActivityOpenTime < subActivityEndTime && subActivityOpenTime >= mergeActivityOpenTime && subActivityEndTime <= mergeActivityEndTime;
            if (!timeValid) {
               throw new Exception(String.format("合服子活动%d时间配置错误，超过了合服活动时间范围", activityRuleModel.getActivityType()));
            }
         }
      }

      Map<Integer, MineVeinModel> mineVeinModelMap = ApplicationContextProvider.<Integer, MineVeinModel>getModelPoolMap("mineVein");

      for(Map.Entry<Integer, MineVeinModel> entry : mineVeinModelMap.entrySet()) {
         MineVeinModel mineVeinModel = (MineVeinModel)entry.getValue();
         long power = this.monsterManager.getTotalPowerByBattleId(mineVeinModel.getBattleId());
         mineVeinModel.setSuggesPower(power);
      }

      Map<Integer, UpgradeModel> upgradeModelMap = ApplicationContextProvider.<Integer, UpgradeModel>getModelPoolMap("upgrade");
      Map<Integer, List<ResourceModel>> tempUpgradeMap = new HashMap();
      int totalExpCost = 0;
      int totalSilverCost = 0;
      if (upgradeModelMap != null) {
         for(Map.Entry<Integer, UpgradeModel> entry : upgradeModelMap.entrySet()) {
            List<ResourceModel> list = new ArrayList();
            if (totalExpCost > 0) {
               list.add(new ResourceModel(1, PlayerDefine.PLAYER_HERO_EXP, totalExpCost));
            }

            if (totalSilverCost > 0) {
               list.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, totalSilverCost));
            }

            tempUpgradeMap.put(entry.getKey(), list);
            totalExpCost += ((UpgradeModel)entry.getValue()).getExpCost();
            totalSilverCost += ((UpgradeModel)entry.getValue()).getSilverCost();
         }
      }

      this.upgradeMap = tempUpgradeMap;
      Map<Integer, List<ResourceModel>> tempUpBreachMap = new HashMap();
      int totalItem = 0;
      int totalCopper = 0;

      for(int i = 0; i < 6; ++i) {
         HeroBreachModel heroBreachModel = (HeroBreachModel)ApplicationContextProvider.getModelPoolEntity("heroBreach", i);
         totalItem += heroBreachModel.getItemNum();
         totalCopper += heroBreachModel.getCopper();
         List<ResourceModel> list = new ArrayList();
         list.add(new ResourceModel(2, heroBreachModel.getItemId(), totalItem));
         list.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, totalCopper));
         tempUpBreachMap.put(i + 1, list);
      }

      this.upBreachMap = tempUpBreachMap;
      Map<Integer, TurntableActivityTaskModel> map = this.gameModelPool.getMap("krTurntableTask");
      Map<Integer, TurntableActivityTaskModel> newMap = Maps.newHashMap();
      if (map != null) {
         for(Map.Entry<Integer, TurntableActivityTaskModel> entry : map.entrySet()) {
            if (this.country.equals(((TurntableActivityTaskModel)entry.getValue()).getAreanShow())) {
               ((TurntableActivityTaskModel)entry.getValue()).setId(((TurntableActivityTaskModel)entry.getValue()).getOldId());
               newMap.put(((TurntableActivityTaskModel)entry.getValue()).getOldId(), entry.getValue());
            }
         }

         map.clear();
         map.putAll(newMap);
      }

      GlobalTaskPart.initTriggers();
      ConcurrentHashMap<String, Integer> advanceEnterConfigMap = new ConcurrentHashMap();
      String advanceEnterConfig = ApplicationContextProvider.getConfigString("advanceEnterGame", "tw:600");
      if (!StringUtils.isEmpty(advanceEnterConfig)) {
         String[] advanceEnterConfigArr = advanceEnterConfig.split("\\|");

         for(String advanceEnterConfigStr : advanceEnterConfigArr) {
            String[] countryConfigArr = advanceEnterConfigStr.split(":");
            advanceEnterConfigMap.put(countryConfigArr[0], Integer.parseInt(countryConfigArr[1]));
         }
      }

      this.gameModelPool.putMap("customAdvanceEnterGame", advanceEnterConfigMap);
      logger.info("替换配置开始");
      Map<Integer, SkillModel> skillModelMap = this.gameModelPool.getMap("skill");
      Map<Integer, SkillModel> newSkillModelMap = this.gameModelPool.getMap("skillNew");
      if (skillModelMap != null && newSkillModelMap != null) {
         for(Map.Entry<Integer, SkillModel> entry : newSkillModelMap.entrySet()) {
            if (skillModelMap.containsKey(entry.getKey())) {
               skillModelMap.put(entry.getKey(), entry.getValue());
               logger.info("替换技能配置 skillId: {}", entry.getKey());
            }
         }
      }

      skillModelMap = this.gameModelPool.getMap("skillEffect");
      newSkillModelMap = this.gameModelPool.getMap("skillEffectNew");
      if (skillModelMap != null && newSkillModelMap != null) {
         for(Map.Entry<Integer, SkillEffectModel> entry : newSkillModelMap.entrySet()) {
            if (skillModelMap.containsKey(entry.getKey())) {
               skillModelMap.put(entry.getKey(), entry.getValue());
               logger.info("替换技能效果配置 effectId: {}", entry.getKey());
            }
         }
      }

      skillModelMap = this.gameModelPool.getMap("eventHeroMain");
      newSkillModelMap = this.gameModelPool.getMap("eventHeroMainNew");
      if (skillModelMap != null && newSkillModelMap != null) {
         for(Map.Entry<Integer, EventHeroMainNewModel> entry : newSkillModelMap.entrySet()) {
            if (skillModelMap.containsKey(entry.getKey())) {
               skillModelMap.put(entry.getKey(), entry.getValue());
            }
         }
      }

      skillModelMap = this.gameModelPool.getMap("FourteenTWSignAward");
      newSkillModelMap = Maps.newHashMap();
      if (skillModelMap != null) {
         for(Map.Entry<Integer, FourteenTWSignAwardModel> entry : skillModelMap.entrySet()) {
            if (this.country.equals(((FourteenTWSignAwardModel)entry.getValue()).getAreanShow())) {
               ((FourteenTWSignAwardModel)entry.getValue()).setId(((FourteenTWSignAwardModel)entry.getValue()).getOldId());
               newSkillModelMap.put(((FourteenTWSignAwardModel)entry.getValue()).getOldId(), entry.getValue());
            }
         }

         skillModelMap.clear();
         skillModelMap.putAll(newSkillModelMap);
      }

      skillModelMap = this.gameModelPool.getMap("krTurntableDraw");
      newSkillModelMap = Maps.newHashMap();
      if (skillModelMap != null) {
         for(Map.Entry<Integer, TurntableRewardModel> entry : skillModelMap.entrySet()) {
            if (this.country.equals(((TurntableRewardModel)entry.getValue()).getAreanShow())) {
               ((TurntableRewardModel)entry.getValue()).setId(((TurntableRewardModel)entry.getValue()).getOldId());
               newSkillModelMap.put(((TurntableRewardModel)entry.getValue()).getOldId(), entry.getValue());
            }
         }

         skillModelMap.clear();
         skillModelMap.putAll(newSkillModelMap);
      }

      logger.info("替换配置结束");
   }

   public List<ResourceModel> getUpgradeConsume(int heroLv) {
      if (!this.upgradeMap.containsKey(heroLv)) {
         logger.info("没有级别={}的消耗", heroLv);
         return new ArrayList();
      } else {
         return (List)this.upgradeMap.get(heroLv);
      }
   }

   public List<ResourceModel> getBreachConsume(int heroBreach) {
      if (!this.upgradeMap.containsKey(heroBreach)) {
         logger.info("没有该升阶={}的消耗", heroBreach);
         return new ArrayList();
      } else {
         return (List)this.upBreachMap.get(heroBreach);
      }
   }

   public boolean isInRobotTable(int playerId) {
      Map<Integer, RobotModel> robotModelMap = this.gameModelPool.getMap("robot");
      return robotModelMap.keySet().contains(playerId);
   }

   private AccountRobotDao initRobotAccount(int playerId) {
      AccountRobotDao dao = new AccountRobotDao();
      dao.playerId = playerId;
      dao.serverId = this.GAME_SERVER_ID;
      StringBuffer sb = new StringBuffer();
      sb.append("robot_");
      sb.append(System.currentTimeMillis());
      sb.append(RandomUtil.randInt(100, 1000));
      dao.account = sb.toString();
      this.gameCachePool.insertDao(dao, false);
      return dao;
   }

   public void initRobotPlayerDao(boolean isSync, int playerId, String account, RobotModel robotModel, PlayerDao playerDao) {
      playerDao.playerId = playerId;
      playerDao.serverId = this.GAME_SERVER_ID;
      playerDao.account = account;
      playerDao.type = robotModel.getType();
      playerDao.lv = RandomUtil.randInt((Integer)robotModel.getPlayerLv().get(0), (Integer)robotModel.getPlayerLv().get(1));
      playerDao.sex = RandomUtil.randInt(2);
      playerDao.robotId = robotModel.getId();
      playerDao.headFrame = 30001;
      playerDao.birthTime = System.currentTimeMillis();
      playerDao.monarchId = 21101;
      List<Integer> monarchList = (List)ApplicationContextProvider.getModelPoolEntity("customMonarchImage", 1);
      if (monarchList != null && !monarchList.isEmpty()) {
         int r = RandomUtil.randInt(monarchList.size());
         playerDao.monarchId = (Integer)monarchList.get(r);
      }

      List<Integer> headList = (List)ApplicationContextProvider.getModelPoolEntity("customGeneralAvatar", 1);
      if (headList != null && !headList.isEmpty()) {
         int r = RandomUtil.randInt(headList.size());
         playerDao.head = (Integer)headList.get(r);
      } else if (playerDao.sex == 0) {
         playerDao.head = 1;
      } else {
         playerDao.head = 2;
      }

      playerDao.playerName = this.monsterManager.getMonsterName(playerDao.sex);
      int loop = 0;

      while(this.playerNameSet.contains(playerDao.playerName)) {
         logger.info("有重复名字={},重新生成！", playerDao.playerName);
         playerDao.playerName = this.monsterManager.getMonsterName(playerDao.sex);
         ++loop;
         if (loop > 100) {
            break;
         }
      }

      playerDao.updateOp();
      this.initRobotAddHeroAndArraying(isSync, robotModel, playerDao);
   }

   public void initRobotAddHeroAndArraying(boolean isSync, RobotModel robotModel, PlayerDao playerDao) {
      GamePlayer robot = (GamePlayer)this.playerMap.get(playerDao.playerId);
      HeroBagPart heroBagPart = (HeroBagPart)robot.getMgrPart(HeroBagPart.class);
      Map<Integer, HeroDao> heroDaoMap = this.getGameCachePool().getMap("tb_hero_bag", new Object[]{robot.getPlayerId()});
      if (heroDaoMap == null || heroDaoMap.isEmpty() || isSync) {
         List<HeroDao> needDelHero = new ArrayList();
         if (heroDaoMap != null && !heroDaoMap.isEmpty()) {
            for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
               needDelHero.add(entry.getValue());
            }
         }

         List<HeroMsg.ArrayingInfo> arrayingList = new ArrayList();
         long totalPower = 0L;

         for(int i = 0; i < robotModel.getHeros().size(); ++i) {
            HeroRandomFun heroRandomFun = (HeroRandomFun)robotModel.getHeros().get(i);
            if (heroRandomFun.getLv() > 0) {
               int heroLv = heroRandomFun.getLv();
               int star = heroRandomFun.getStar();
               int breach = 0;
               int heroId;
               if (heroRandomFun.getId() > 0) {
                  heroId = heroRandomFun.getId();
               } else {
                  HeroModel heroModel = this.monsterManager.getHeroModelByStarAndNataionAndType(heroRandomFun.getStar(), heroRandomFun.getNation(), heroRandomFun.getType());
                  if (heroModel == null) {
                     continue;
                  }

                  heroId = heroModel.getId();
               }

               HeroModel heroModel = (HeroModel)this.gameModelPool.getEntity("hero", heroId);
               if (heroModel != null) {
                  int maxStar = this.monsterManager.getMaxStarOfHero(heroId);
                  if (heroLv > MonsterManager.maxLvByStar[maxStar]) {
                     heroLv = MonsterManager.maxLvByStar[maxStar];
                  }

                  Map<Integer, EquipItem> equips = new HashMap();
                  Map<Integer, WarriorSignet> warriors = new HashMap();
                  Map<Integer, Integer> warcrafts = new HashMap();
                  if (heroRandomFun.getWearId() > 0) {
                     RobotWearModel robotWearModel = (RobotWearModel)this.gameModelPool.getEntity("robotwear", heroRandomFun.getWearId());
                     if (robotWearModel != null) {
                        equips = this.monsterManager.getHeroEquip(robotWearModel);
                        warriors = this.monsterManager.getHeroWarriors(robotWearModel);
                        warcrafts = this.monsterManager.getHeroWarcrafts(robotWearModel);
                     }
                  }

                  breach = this.monsterManager.getBreachLvByLv(maxStar, heroLv);
                  if (star == 0) {
                     star = this.monsterManager.getStarByLv(heroId, heroLv);
                  }

                  HeroDao heroDao = heroBagPart.insertRobotHero(heroId, heroLv, breach, star, equips, warriors, warcrafts);
                  HeroMsg.ArrayingInfo.Builder info = HeroMsg.ArrayingInfo.newBuilder();
                  info.setCode(heroDao.code);
                  if (i > 5) {
                     info.setCodeType(CommonMsg.CodeType.CODE_FRIEND);
                  } else {
                     info.setCodeType(CommonMsg.CodeType.CODE_HERO);
                  }

                  info.setPosition(i);
                  arrayingList.add(info.build());
                  heroDao.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, false, false);
                  totalPower += heroDao.getCombatPower();
               }
            }
         }

         if (!arrayingList.isEmpty()) {
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)robot.getMgrPart(HeroArrayingPart.class);
            heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING, arrayingList);
            heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_ALLIANCE, arrayingList);
            playerDao.combat_power = totalPower;
            if (playerDao.type == 2) {
               this.pvpSeasonMgr.insetNewPlayer(playerDao.playerId, robotModel.getScore());
            }

            playerDao.updateOp();
            robot.pushTask(() -> {
               robot.getPlayerDao().combat_power = totalPower;
               robot.getPlayerDao().updateOp();
            });

            for(HeroDao delHero : needDelHero) {
               delHero.deleteOp();
            }
         }
      }

   }

   public void gmResetRobot() {
      this.initRobot(true);
   }

   public void gmResetPlayerPower() {
      for(Map.Entry<Integer, GamePlayer> entry : this.playerMap.entrySet()) {
         if (!((GamePlayer)entry.getValue()).isRobot()) {
            ((GamePlayer)entry.getValue()).pushTask(() -> {
               ArrayingMirror arrayingMirror = ((GamePlayer)entry.getValue()).getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               long power = 0L;

               for(Map.Entry<Byte, ArrayingEntity> arrayingEntityEntry : arrayingMirror.arrayingElementsMap.entrySet()) {
                  switch (((ArrayingEntity)arrayingEntityEntry.getValue()).entityType()) {
                     case CODE_HERO:
                        power += ((HeroArrayingEntity)arrayingEntityEntry.getValue()).mirror.combatPower;
                        break;
                     case CODE_FRIEND:
                        power += ((FriendArrayingEntity)arrayingEntityEntry.getValue()).mirror.combatPower;
                  }
               }

               ((GamePlayer)entry.getValue()).getPlayerDao().combat_power = power;
               ((GamePlayer)entry.getValue()).getPlayerDao().updateOp();
            });
         }
      }

   }

   public ArrayList<BattleTestMgr> getBattleTestMgrList() {
      return this.battleTestMgrList;
   }

   public BattleMsg.S2C_BattleResult_6102 plotBattle(boolean isFirst) {
      PlotBattleModel plotLeftModel = (PlotBattleModel)this.gameModelPool.getEntity("plotBattle", 1);
      PlotBattleModel plotRightModel = (PlotBattleModel)this.gameModelPool.getEntity("plotBattle", 2);
      BattleScene battleScene = new BattleScene(1014, 0);
      battleScene.addPKTeam(new BattlePKTeam(plotLeftModel), new BattlePKTeam(plotRightModel));
      return battleScene.fight((byte)2).setFlag(isFirst).build();
   }

   public boolean isPropertyMonitor() {
      return this.propertyMonitor;
   }

   public void setPropertyMonitor(boolean propertyMonitor) {
      this.propertyMonitor = propertyMonitor;
   }

   public void flushPvpRedis() {
      this.pvpSeasonMgr.flushRedisData();
   }

   public void flushPowerRedis() {
      String redisKey = this.rankMgr.getRedisKey(RankDefine.RankModule.COMBAT_POWER);
      Map<Integer, Double> newMap = new HashMap();

      for(Map.Entry<Integer, GamePlayer> gamePlayerEntry : this.playerMap.entrySet()) {
         GamePlayer gamePlayer = (GamePlayer)gamePlayerEntry.getValue();
         PlayerDao playerDao = gamePlayer.getPlayerDao();
         if (!gamePlayer.isRobot()) {
            double score = Double.valueOf((double)playerDao.combat_power);
            if (!(score <= (double)0.0F)) {
               newMap.put(gamePlayer.getPlayerId(), score);
            }
         }
      }

      RScoredSortedSet<Integer> rScoredSortedSet = this.gameRedisTool.getClient().getScoredSortedSet(redisKey);
      rScoredSortedSet.addAll(newMap);
   }

   public GameDBPool getGameDBPool() {
      return this.gameDBPool;
   }

   public void initBadWords() {
      WordsFilter.load(this.badWordsPath);
      NameFilter.load(this.getNameFilterPath());
   }

   public String getNameFilterPath() {
      String nameWord = "NameWords";
      String badWord = "BadWords";
      String str = this.badWordsPath;
      String temp = str.replace(badWord, nameWord);
      return temp;
   }

   public void testHeroComment(int heroId) {
      for(Map.Entry<Integer, GamePlayer> entry : this.playerMap.entrySet()) {
         ((GamePlayer)entry.getValue()).pushTask(() -> {
            if (!((GamePlayer)entry.getValue()).isRobot()) {
               HeroCommentPart heroCommentPart = (HeroCommentPart)((GamePlayer)entry.getValue()).getMgrPart(HeroCommentPart.class);
               HeroCommentMsg.C2S_Comment_8305.Builder builder = HeroCommentMsg.C2S_Comment_8305.newBuilder();
               builder.setHeroId(heroId);
               builder.setContext("基恶姆测试发送");
               heroCommentPart.C2S_Comment_8305(builder.build(), (String)null);
            }

         });
      }

   }

   public boolean loadClientVersion() {
      try {
         String clientVersionContent = FileUtil.readString(new File(this.clientVersionFilePath), StandardCharsets.UTF_8);
         clientVersionContent = clientVersionContent == null ? "" : clientVersionContent.trim();
         if (!clientVersionContent.equals(this.clientVersionContent)) {
            logger.info("客户端版本文件内容有更改,旧内容:{},新内容:{}", this.clientVersionContent, clientVersionContent);
            this.clientVersionContent = clientVersionContent;
            return true;
         }
      } catch (Exception var2) {
      }

      return false;
   }

   @TaskMethod
   public void changeName(GamePlayer player, String tmp) {
      PlayerDao playerDao = player.getPlayerDao();
      if (!this.playerNameIsExist(tmp)) {
         this.getPlayerName().remove(playerDao.playerName);
         player.pushPartTaskEx(MonarchPart.class, "changeName", new Object[]{tmp});
      } else {
         player.failure(13003);
      }
   }

   public int getRoleNum() {
      return this.getPlayerName().size() - this.robotNameSet.size();
   }

   private void checkDbIncrementValue() throws Exception {
      if (this.GAME_SERVER_ID <= 21000) {
         String jdbcUrlNoParam = this.gameDBPool.getHikariConfig().getJdbcUrl().split("\\?")[0];
         String dbName = jdbcUrlNoParam.substring(jdbcUrlNoParam.lastIndexOf("/") + 1);
         this.checkDbIncrementValue(dbName, "tb_account");
         this.checkDbIncrementValue(dbName, "tb_union");
         this.checkDbIncrementValue(dbName, "tb_alliance_team");
      }
   }

   private void checkDbIncrementValue(String dbName, String tableName) throws Exception {
      try {
         IntQueryResult queryRowResult = new IntQueryResult("rowNum");
         this.gameDBPool.query("SELECT COUNT(1) AS " + queryRowResult.getColumnName() + " FROM " + tableName + ";", queryRowResult, new Object[0]);
         if (queryRowResult.getValue() == null) {
            if (queryRowResult.getException() != null) {
               throw queryRowResult.getException();
            } else {
               throw new Exception("查询表记录时结果为null");
            }
         } else {
            IntQueryResult queryIncResult = new IntQueryResult("autoIncNum");
            this.gameDBPool.query("SELECT AUTO_INCREMENT AS " + queryIncResult.getColumnName() + " FROM information_schema.`TABLES` WHERE table_schema='" + dbName + "' AND table_name='" + tableName + "';", queryIncResult, new Object[0]);
            if (queryIncResult.getValue() == null) {
               if (queryIncResult.getException() != null) {
                  throw queryIncResult.getException();
               } else {
                  throw new Exception("查询表自增值时结果为null");
               }
            } else {
               int increaseStart = this.GAME_SERVER_ID * 100000;
               if (queryRowResult.getValue() == 0) {
                  this.gameDBPool.reviseAutoIncrease(tableName, queryIncResult.getValue(), increaseStart);
               } else if (queryIncResult.getValue() < increaseStart) {
                  logger.error("表【{}】的自增值错误,当前自增值【{}】,必须从【{}】开始", new Object[]{tableName, queryIncResult.getValue(), increaseStart});
               }

            }
         }
      } catch (Throwable throwable) {
         throw new Exception(throwable);
      }
   }

   public void incRef() {
      this.loadRef.incrementAndGet();
   }

   public void decRef() {
      if (this.loadRef.decrementAndGet() == 0) {
         this.loadDataFinish();
      }

   }

   @TaskMethod
   public void qianKunTreasureRecord(QianKunTreasureMsg.S2S_RecruitRecord_17708 msg) {
      int limitNum = this.configManager.getIntDefault("qianKunRecordLimit", 100);
      WorldDao<ActivityData> worldDao = this.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

      for(QianKunTreasureMsg.RecruitRecord record : msg.getRecordList()) {
         BeautyTreasureRecord data = new BeautyTreasureRecord();
         data.awardId = record.getAwardId();
         data.playerId = record.getPlayerId();
         data.playerName = record.getPlayerName();
         data.recruitType = record.getRecruitType();
         data.serverId = record.getServerId();
         if (data.recruitType == 1) {
            ((ActivityData)worldDao.jsonData).qianKunTreasureHighRecord.add(data);
            if (((ActivityData)worldDao.jsonData).qianKunTreasureHighRecord.size() > limitNum) {
               ((ActivityData)worldDao.jsonData).qianKunTreasureHighRecord.remove(0);
            }
         } else {
            ((ActivityData)worldDao.jsonData).qianKunTreasureCommonRecord.add(data);
            if (((ActivityData)worldDao.jsonData).qianKunTreasureCommonRecord.size() > limitNum) {
               ((ActivityData)worldDao.jsonData).qianKunTreasureCommonRecord.remove(0);
            }
         }
      }

      worldDao.updateOp();
      QianKunTreasureMsg.S2C_RecruitRecordInfo_17705.Builder builder = QianKunTreasureMsg.S2C_RecruitRecordInfo_17705.newBuilder();

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunTreasureHighRecord) {
         QianKunTreasureMsg.RecruitRecord.Builder record = QianKunTreasureMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addAllRecord(record);
      }

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunTreasureCommonRecord) {
         QianKunTreasureMsg.RecruitRecord.Builder record = QianKunTreasureMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addAllRecord(record);
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @TaskMethod
   public void qianKunLotteryRecord(QianKunLotteryMsg.S2S_RecruitRecord_19808 msg) {
      int limitNum = this.configManager.getIntDefault("qianKunRecordLimit", 100);
      WorldDao<ActivityData> worldDao = this.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

      for(QianKunLotteryMsg.RecruitRecord record : msg.getRecordList()) {
         BeautyTreasureRecord data = new BeautyTreasureRecord();
         data.awardId = record.getAwardId();
         data.playerId = record.getPlayerId();
         data.playerName = record.getPlayerName();
         data.recruitType = record.getRecruitType();
         data.serverId = record.getServerId();
         if (data.recruitType == 1) {
            ((ActivityData)worldDao.jsonData).qianKunLotteryHighRecord.add(data);
            if (((ActivityData)worldDao.jsonData).qianKunLotteryHighRecord.size() > limitNum) {
               ((ActivityData)worldDao.jsonData).qianKunLotteryHighRecord.remove(0);
            }
         } else {
            ((ActivityData)worldDao.jsonData).qianKunLotteryCommonRecord.add(data);
            if (((ActivityData)worldDao.jsonData).qianKunLotteryCommonRecord.size() > limitNum) {
               ((ActivityData)worldDao.jsonData).qianKunLotteryCommonRecord.remove(0);
            }
         }
      }

      worldDao.updateOp();
      QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.Builder builder = QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.newBuilder();

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunLotteryHighRecord) {
         QianKunLotteryMsg.RecruitRecord.Builder record = QianKunLotteryMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addAllRecord(record);
      }

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).qianKunLotteryCommonRecord) {
         QianKunLotteryMsg.RecruitRecord.Builder record = QianKunLotteryMsg.RecruitRecord.newBuilder();
         record.setRecruitType(treasureRecord.recruitType);
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         record.setBroadcast(false);
         builder.addAllRecord(record);
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @TaskMethod
   public void tongQueLotteryRecord(TongQueRotateMsg.S2S_RecruitRecord_20127 msg) {
      int limitNum = this.configManager.getIntDefault("qianKunRecordLimit", 100);
      WorldDao<ActivityData> worldDao = this.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

      for(TongQueRotateMsg.RecruitRecord record : msg.getRecordList()) {
         BeautyTreasureRecord data = new BeautyTreasureRecord();
         data.awardId = record.getAwardId();
         data.playerId = record.getPlayerId();
         data.playerName = record.getPlayerName();
         data.serverId = record.getServerId();
         ((ActivityData)worldDao.jsonData).tongQueLotteryRecord.add(data);
         if (((ActivityData)worldDao.jsonData).tongQueLotteryRecord.size() > limitNum) {
            ((ActivityData)worldDao.jsonData).tongQueLotteryRecord.remove(0);
         }
      }

      worldDao.updateOp();
      TongQueRotateMsg.S2C_RecruitRecordInfo_20124.Builder builder = TongQueRotateMsg.S2C_RecruitRecordInfo_20124.newBuilder();

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).tongQueLotteryRecord) {
         TongQueRotateMsg.RecruitRecord.Builder record = TongQueRotateMsg.RecruitRecord.newBuilder();
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         builder.addAllRecord(record);
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @TaskMethod
   public void huaJiaLotteryRecord(HuaJiaActMsg.S2S_RecruitRecord_24427 msg) {
      int limitNum = this.configManager.getIntDefault("qianKunRecordLimit", 100);
      WorldDao<ActivityData> worldDao = this.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

      for(HuaJiaActMsg.RecruitRecord record : msg.getRecordList()) {
         BeautyTreasureRecord data = new BeautyTreasureRecord();
         data.awardId = record.getAwardId();
         data.playerId = record.getPlayerId();
         data.playerName = record.getPlayerName();
         data.serverId = record.getServerId();
         ((ActivityData)worldDao.jsonData).huaJiaLotteryRecord.add(data);
         if (((ActivityData)worldDao.jsonData).huaJiaLotteryRecord.size() > limitNum) {
            ((ActivityData)worldDao.jsonData).huaJiaLotteryRecord.remove(0);
         }
      }

      worldDao.updateOp();
      HuaJiaActMsg.S2C_RecruitRecordInfo_24424.Builder builder = HuaJiaActMsg.S2C_RecruitRecordInfo_24424.newBuilder();

      for(BeautyTreasureRecord treasureRecord : ((ActivityData)worldDao.jsonData).huaJiaLotteryRecord) {
         HuaJiaActMsg.RecruitRecord.Builder record = HuaJiaActMsg.RecruitRecord.newBuilder();
         record.setPlayerName(treasureRecord.playerName);
         record.setPlayerId(treasureRecord.playerId);
         record.setServerId(treasureRecord.serverId);
         record.setAwardId(treasureRecord.awardId);
         builder.addAllRecord(record);
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) {
      for(GamePlayer slaveGamePlayer : this.slaveServerPlayerMap.values()) {
         PlayerPublicDao slaveGamePlayerPublicDao = slaveGamePlayer.getPublicDao();
         if (this.mailServerPlayerNameSet.contains(slaveGamePlayerPublicDao.playerName)) {
            slaveGamePlayer.pushTask(() -> {
               PlayerDao playerDao = slaveGamePlayer.getPlayerDao();
               slaveGamePlayerPublicDao.playerName = "s" + slaveGamePlayer.getServerId() + "_" + slaveGamePlayerPublicDao.playerName;
               playerDao.playerName = slaveGamePlayerPublicDao.playerName;
               playerDao.updateOp();
               this.mailServerPlayerNameSet.add(slaveGamePlayerPublicDao.playerName);
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> repeatNameRewardMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_COMBINE_REPEAT_P_NAME_CONTENT);
               if (null != repeatNameRewardMap) {
                  CentreAwardModel awardModel = (CentreAwardModel)repeatNameRewardMap.firstEntry().getValue();
                  MailPart mailPart = (MailPart)slaveGamePlayer.getMgrPart(MailPart.class);
                  int logReason = 9201;
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_SYSTEM, awardModel.getTitle(), awardModel.getDesc(), awardModel.getItems(), MailPart.FOREVER, -1, logReason);
               }

            });
         }
      }

   }

   public Map<Integer, GamePlayer> getSlaveServerPlayerMap() {
      return this.slaveServerPlayerMap;
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      CrossMsg.S2CR_SlaveBeMerge_4219.Builder builder = CrossMsg.S2CR_SlaveBeMerge_4219.newBuilder();
      builder.setMainId(mainServerId);
      this.crossNettyClient.sendCross(this.GAME_SERVER_ID, 0, builder.build());
   }

   @MsgHandlerAnno
   public void S2S_PlayerArraying_2057(PlayerMsg.S2S_PlayerArraying_2057 msg, CrossSubscribeMsg crossSubscribeMsg) {
      GamePlayer gamePlayer = this.getPlayerById(crossSubscribeMsg.destMgrId);
      if (gamePlayer != null) {
         gamePlayer.pushTask(() -> {
            CommonMsg.HeroState arrayingType = msg.getArrayingType();
            ArrayingMirror playerArraying = gamePlayer.getPlayerArraying(arrayingType);
            PlayerMsg.S2C_PlayerArraying_2056.Builder builder = PlayerMsg.S2C_PlayerArraying_2056.newBuilder();
            builder.setArrayingType(arrayingType);
            builder.setArraying(playerArraying.toPlayerArrayingInfo());
            this.crossNettyClient.send2Client(crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId, builder.build());
         });
      }

   }

   @MsgHandlerAnno
   public void S2S_ArrayingRecommend_2062(PlayerMsg.S2S_ArrayingRecommend_2062 msg, CrossSubscribeMsg crossSubscribeMsg) {
      GamePlayer gamePlayer = this.getPlayerById(crossSubscribeMsg.destMgrId);
      if (gamePlayer != null) {
         gamePlayer.pushTask(() -> {
            PlayerMsg.S2C_ArrayingRecommend_2060.Builder builder = PlayerMsg.S2C_ArrayingRecommend_2060.newBuilder();
            builder.setHeroId(msg.getHeroId());
            builder.setRank(msg.getRank());
            builder.setPlayerInfo(gamePlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
            this.crossNettyClient.send2Client(msg.getServerId(), msg.getPlayerId(), builder.build());
         });
      }

   }

   @TaskMethod
   public void addDecisiveRecord(int step, List<DecisiveRecordData> recordList) {
      DecisiveBattleRecordDao recordDao = (DecisiveBattleRecordDao)this.gameCachePool.getData("tb_decisive_battle_record", new Object[]{step});

      for(DecisiveRecordData data : recordList) {
         if (recordDao.record.containsKey(data.heroId)) {
            DecisiveRecordData record = (DecisiveRecordData)recordDao.record.get(data.heroId);
            record.fightNum += data.fightNum;
            record.loseNum += data.loseNum;
            record.winNum += data.winNum;
         } else {
            recordDao.record.put(data.heroId, data);
         }
      }

      recordDao.updateOp();
   }

   private void uploadWeeklyAliveNum() {
      int openServerDays = this.getOpenServerDays();
      int days = ApplicationContextProvider.getConfigInt("MartOpenServerDays", 100);
      if (openServerDays >= days) {
         int day = 0;
         long totalPlayerNum = 0L;
         WorldDao<WorldData> worldDataWorldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);

         for(Map.Entry<Long, Long> entry : ((WorldData)worldDataWorldDao.jsonData).alivePleyers.entrySet()) {
            totalPlayerNum += (Long)entry.getValue();
            ++day;
         }

         if (totalPlayerNum > 0L) {
            long averageNum = Math.max(1L, totalPlayerNum / (long)day);
            CrossMsg.S2CR_UploadAliveNum_4257.Builder builder = CrossMsg.S2CR_UploadAliveNum_4257.newBuilder();
            builder.setLastWeeklyNum(averageNum);
            this.crossNettyClient.sendCross(this.GAME_SERVER_ID, 0, builder.build());
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_UploadAliveNum_4258(CrossMsg.CR2S_UploadAliveNum_4258 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.uploadWeeklyAliveNum();
   }

   public void recordAlivePlayer(long alivePlayerNum) {
      long startTime = DateUtil.getDayStartTimeStamp();
      WorldDao<WorldData> worldDataWorldDao = this.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      ((WorldData)worldDataWorldDao.jsonData).alivePleyers.put(startTime, alivePlayerNum);
      int recordCount = ApplicationContextProvider.getConfigInt("alivePlayerRecordCount", 7);
      if (((WorldData)worldDataWorldDao.jsonData).alivePleyers.size() > recordCount) {
         Iterator<Map.Entry<Long, Long>> iterator = ((WorldData)worldDataWorldDao.jsonData).alivePleyers.entrySet().iterator();
         if (iterator.hasNext()) {
            Map.Entry<Long, Long> entry = (Map.Entry)iterator.next();
            ((WorldData)worldDataWorldDao.jsonData).alivePleyers.remove(entry.getKey());
         }
      }

      worldDataWorldDao.updateOp();
   }

   public void gmUpdateCenterInfo() {
      CenterServerPart centerServerPart = (CenterServerPart)this.getMgrPart(CenterServerPart.class);
      centerServerPart.updateCenterInfo((byte)0);
   }
}
