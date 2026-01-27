package com.gzbz.gamePlayer;

import allMgr.ExecutorsFunc;
import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.PartParent;
import allMgr.TaskMethod;
import cache.CustomCacheData;
import cn.hutool.core.util.RandomUtil;
import com.google.common.base.Joiner;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.part.ActivityComeBackPart;
import com.gzbz.activity.part.ActivityNewWeekPart;
import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.activity.part.HeroRaisePart;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.benefit.RecommendPart;
import com.gzbz.catchDeer.CatchDeerMgr;
import com.gzbz.chat.ChatMgr;
import com.gzbz.countryWar.CountryWarMgr;
import com.gzbz.countryWar.CountryWarPart;
import com.gzbz.db.ActivityAnniversaryCelebrationDao;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.CodeDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroPromoteDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerExtendDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.MonthlyCardData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.demon.DemonActivityPart;
import com.gzbz.demonRotate.DemonRotatePart;
import com.gzbz.demonStrikes.DemonStrikesPart;
import com.gzbz.duel.DuelPart;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.ClientTrackingEnum;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.LogDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.Ladder.LadderPart;
import com.gzbz.gamePlayer.battle.FairylandPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroTalentPart;
import com.gzbz.gamePlayer.horse.WarHorsePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.playerBag.BagParent;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.playerReset.PlayerResetPart;
import com.gzbz.gamePlayer.pvp.KingOfCentralPlainsMgr;
import com.gzbz.gamePlayer.pvp.PvpSeasonMgr;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.gamePlayer.tracking.ClientTrackingPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.giveHeroDraw.GiveHeroDrawPart;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.part.GodBeastPart;
import com.gzbz.log.LogMgr;
import com.gzbz.log.LoginLog;
import com.gzbz.log.PropertyLog;
import com.gzbz.log.RegisterLog;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.medal.MedalPart;
import com.gzbz.mergeActivity.part.MergeActivityHeFuKuangHuanPart;
import com.gzbz.mine.part.MinePart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ChapterModel;
import com.gzbz.model.CityNameModel;
import com.gzbz.model.ErrorModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.GuideSectionModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.LegalNumModel;
import com.gzbz.model.LevelPromoteModel;
import com.gzbz.model.PlayerProperty;
import com.gzbz.model.ProvinceNameModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.net.GameServerHandler;
import com.gzbz.privilege.VipPart;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CountryWarMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.FailureMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.LoginMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.qqBigPlayer.part.QqBigPlayerPart;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.AdventureTaskPart;
import com.gzbz.task.PlayerTaskPart;
import com.gzbz.task.base.GlobalTaskPart;
import com.gzbz.transport.part.WaterTransportPart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.union.part.UnionTechnologyPart;
import com.gzbz.util.IPSeekerUtils;
import com.gzbz.util.NameFilter;
import com.gzbz.worldMgr.WorldMgr;
import debug.AppArgs;
import debug.Debug;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import misc.DateUtil;
import misc.MiscUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@MgrAnno(
   msgPriority = 2
)
public class GamePlayer extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(GamePlayer.class);
   private Channel channel;
   private int playerId;
   private String account;
   private int serverId;
   private AtomicBoolean createState;
   private PlayerPublicDao playerPublicDao;
   private final Map<Integer, Long> propertyRecord = new HashMap();
   private boolean isLogin = false;
   private boolean isRobot = false;
   private long lastHeartTime;
   private int heartFastCount;
   private long heartMsgLogTime;
   private PlayerMsg.S2C_ItemList_2005.Builder addBuilder = PlayerMsg.S2C_ItemList_2005.newBuilder();
   private PlayerMsg.S2C_ItemList_2005.Builder mailBuilder = PlayerMsg.S2C_ItemList_2005.newBuilder();
   public BagMsg.S2C_ItemUpdate_3006.Builder itemUpdateBuilder = BagMsg.S2C_ItemUpdate_3006.newBuilder();
   private long maxPlayerCombatPower;
   private String devUID;
   private boolean isGuest = false;
   private List<PlayerPart> PARTS_SORTED_LOGIN_PRIORITY;
   public static final String CITY_ID = "defaultCityId";
   private final int PLAYER_MAX_LV = 200;
   @Autowired
   protected GameModelPool gameModelPool;
   @Autowired
   protected CountryWarMgr countryWarMgr;
   @Autowired
   private LogMgr logMgr;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private LogOperationMgr operationMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ActivityMgr activityMgr;

   protected void init() {
      this.gameCachePool.setOpenCheckExpire(true);
   }

   public void wriedPart() {
   }

   public synchronized <T> T getMgrPart(Class<?> cls) {
      PartParent _part = (PartParent)super.getMgrPart(cls);
      if (_part != null) {
         return (T)_part;
      } else {
         List<Class<?>> listPart = (List)scanAnnotation.partMap.get(this.getClass());
         if (listPart != null && listPart.contains(cls)) {
            try {
               long time = System.currentTimeMillis();
               _part = (PartParent)this.context.getBean(cls);
               _part.init(this);
               this._cls2Parts.put(cls, _part);
               time = System.currentTimeMillis() - time;
               if (time > 5L) {
                  logger.info("初始化玩家【{}】的【{}】part, fee【{}】ms", new Object[]{this.getPlayerId(), cls.getSimpleName(), time});
               }

               return (T)_part;
            } catch (Exception e) {
               e.printStackTrace();
               logger.error("初始化玩家【{}】的【{}】part时发生错误【{}】", new Object[]{this.getPlayerId(), cls.getSimpleName(), e.getMessage()});
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public <T> List<T> getMgrParts(Class<T> parentCls) {
      long time = System.currentTimeMillis();
      List<T> mgrParts = new ArrayList();
      Stream var10000 = ((List)scanAnnotation.partMap.get(this.getClass())).stream();
      parentCls.getClass();

      for(Class<?> subClz : (List)var10000.filter(parentCls::isAssignableFrom).collect(Collectors.toList())) {
         mgrParts.add(this.getMgrPart(subClz));
      }

      time = System.currentTimeMillis() - time;
      if (time > 5L) {
         logger.info("初始化玩家【{}】的【{}】part下的子part, fee【{}】ms", new Object[]{this.getPlayerId(), parentCls.getSimpleName(), time});
      }

      return mgrParts;
   }

   public synchronized void setChannel(Channel channel) {
      channel.attr(AttributeKey.valueOf("playerId")).set(this.getPlayerId());
      this.channel = channel;
   }

   public synchronized Channel getChannel() {
      return this.channel;
   }

   public synchronized void closeChannel(LoginMsg.resultType type) {
      LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(type).build();
      this.sendMsg(protoMsg);
      if (this.channel != null) {
         this.channel.close();
      }

   }

   public PlayerDao getPlayerDao() {
      return (PlayerDao)this.getData("tb_player", this.playerId);
   }

   public PlayerPublicDao getPublicDao() {
      return (PlayerPublicDao)(!this.isRobot && !Objects.isNull(this.playerPublicDao) && !this.isLogin ? this.playerPublicDao : this.getPlayerDao());
   }

   public void setPublicDao(PlayerPublicDao dao) {
      this.playerPublicDao = dao;
   }

   public void login(boolean isReconnect) {
      long curTime = System.currentTimeMillis();
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      LoginMsg.S2C_ReconnectKey_1005.Builder builder = LoginMsg.S2C_ReconnectKey_1005.newBuilder();
      builder.setKey(Integer.toString(this.getPlayerId() ^ -235736076));
      this.sendMsg(builder.build());
      PlayerDao playerDao = this.getPlayerDao();
      if (StringUtils.isEmpty(playerDao.playerName)) {
         playerDao.serverId = this.serverId;
         playerDao.account = this.account;
         ActivityComeBackPart comeBackPart = (ActivityComeBackPart)this.getMgrPart(ActivityComeBackPart.class);
         if (!comeBackPart.isServerActivityInvalid()) {
            playerDao.comeBackActReg = 1;
            ArrayList<Integer> comeBackActGuideStep = this.configManager.getIntList("comeBackActGuideStep");
            if (null != comeBackActGuideStep && comeBackActGuideStep.size() > 1) {
               this.updateGuideStep((Integer)comeBackActGuideStep.get(0));
               this.updateStory((Integer)comeBackActGuideStep.get(1));
            }
         }

         playerDao.updateOp();
         this.setIpArea(this.getLogClientIp(), true);
         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         LoginMsg.S2C_LoginResult_1001.Builder protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.CREATE);
         protoMsg.setArea(playerExtend.ipProvince + "|" + playerExtend.ipCity);
         protoMsg.setIsReconnect(isReconnect ? 1 : 0);
         protoMsg.setLv(playerDao.lv);
         this.sendMsg(protoMsg.build());
         boolean isFirst = !MiscUtil.existBit((long)playerExtend.reward, 9);
         this.sendMsg(worldMgr.plotBattle(isFirst));
         if (isFirst) {
            playerExtend.reward = MiscUtil.setBit(playerExtend.reward, 9);
            this.updatePlayerExtend(13);
         }

         PlayerTaskPart playerTaskPart = (PlayerTaskPart)this.getMgrPart(PlayerTaskPart.class);
         playerTaskPart.trigger();
         this.sendPlayerBaseData(isReconnect, playerDao.logoutTime);
      } else {
         this.setIpArea(this.getLogClientIp(), false);
         long logoutTime = playerDao.logoutTime;
         playerDao.logoutTime = 0L;
         if (playerDao.birthTime <= 0L) {
            playerDao.birthTime = System.currentTimeMillis();
         }

         this.repairProvince();
         this.sendLoginSuccessData(isReconnect, logoutTime);
         playerDao.lastLoginTime = System.currentTimeMillis();
         playerDao.updateOp();
         LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.SUCCESS).setPlayerId(this.playerId).setPlayerName(playerDao.playerName).setLv(playerDao.lv).setIsReconnect(isReconnect ? 1 : 0).build();
         this.sendMsg(protoMsg);
         this.gameCachePool.setOpenCheckExpire(false);
         this.playerPublicDao = null;
         this.isLogin = true;
         this.removeInCrossMainPlayer(isReconnect);
         logger.info(this.getPlayerId() + ":登录花费时间：" + (System.currentTimeMillis() - curTime));
         String clientIp = this.getLogClientIp();
         if (clientIp.startsWith("null:")) {
            logger.warn("添加登录日志:无法获取玩家{}-{}的ip,{}", new Object[]{this.playerId, playerDao.playerName, clientIp.split(":")[1]});
         } else {
            this.operationMgr.addExtraLoginLog(clientIp, this);
         }

         this.operationMgr.changeHeadOldLog(this);
      }

   }

   private void removeInCrossMainPlayer(boolean isReconnect) {
      if (!isReconnect) {
         WaterTransportPart.IN_MAIN_PLAYERS.remove(this.getPlayerId());
         CountryWarMgr var10000 = this.countryWarMgr;
         CountryWarMgr.onActivityPlayerSet.remove(this.getPlayerId());
         MinePart.IN_MINE_PLAYERS.remove(this.getPlayerId());
         DemonStrikesPart.IN_MAIN_PLAYERS.remove(this.getPlayerId());
         DuelPart.IN_SYSTEM_PLAYER.remove(this.getPlayerId());
      }
   }

   public void setIpArea(String content, boolean isFirstLogin) {
      IPSeekerUtils ipSeekerUtils = (IPSeekerUtils)ApplicationContextProvider.getContext().getBean(IPSeekerUtils.class);
      String pattern = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
      Pattern r = Pattern.compile(pattern);
      Matcher m = r.matcher(content);
      if (m.find()) {
         String ip = m.group(0);
         String provinceName = "北京市";
         String cityName = "";
         String sCountry = ipSeekerUtils.getCountry(ip);
         if (sCountry.contains("省")) {
            String[] ipArea = sCountry.split("省");
            if (ipArea.length > 1) {
               provinceName = ipArea[0];
               String[] cityArray = ipArea[1].split("市");
               cityName = cityArray[0];
            } else if (ipArea.length == 1 && !"".equals(ipArea[0])) {
               provinceName = ipArea[0];
            }
         } else if (sCountry.startsWith("内蒙古") && sCountry.endsWith("市") && sCountry.length() > 3) {
            provinceName = "内蒙古";
            cityName = sCountry.substring(3).split("市")[0];
         } else {
            String[] cityArray = sCountry.split("市");
            if (cityArray.length > 1) {
               provinceName = cityArray[0];
               cityName = cityArray[1];
            } else {
               provinceName = cityArray[0];
            }
         }

         boolean findProvinceId = false;
         int provinceId = this.getDefaultProvinceId();
         int cityId = this.configManager.getIntDefault("defaultCityId", 1);
         Map<Integer, ProvinceNameModel> provinceNameModelMap = this.getGameModelPool().getMap("provinceName");

         for(Map.Entry<Integer, ProvinceNameModel> entry : provinceNameModelMap.entrySet()) {
            ProvinceNameModel provinceNameModel = (ProvinceNameModel)entry.getValue();
            if (provinceNameModel.getName().contains(provinceName)) {
               findProvinceId = true;
               provinceId = provinceNameModel.getId();
               provinceName = provinceNameModel.getName();
               List<CityNameModel> cityNameModelList = (List)this.getGameModelPool().getEntity("customCityName", provinceId);

               for(int i = 0; i < cityNameModelList.size(); ++i) {
                  CityNameModel cityNameModel = (CityNameModel)cityNameModelList.get(i);
                  if (0 == i) {
                     cityId = cityNameModel.getId();
                  }

                  if (cityNameModel.getName().contains(cityName)) {
                     cityId = cityNameModel.getId();
                     break;
                  }
               }
            }
         }

         if (isFirstLogin) {
            this.setIpProvince(provinceId, cityId);
            this.updatePlayerExtend(13);
         }

         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         String clientIp = this.getLogClientIp();
         if (clientIp.startsWith("null:")) {
            logger.warn("设置玩家IP归属地:无法获取玩家{}的ip:{}", this.playerId, clientIp.split(":")[1]);
         } else {
            String tmpIp = clientIp.substring(1).split(":")[0];
            StringBuilder sb = new StringBuilder();
            sb.append(tmpIp);
            if (findProvinceId) {
               ProvinceNameModel provinceNameModel = (ProvinceNameModel)ApplicationContextProvider.getModelPoolEntity("provinceName", provinceId);
               if (provinceNameModel != null) {
                  if (provinceNameModel.getAreanShow().equals("cn")) {
                     sb.append(" ");
                     sb.append(provinceNameModel.getName());
                  }
               } else {
                  logger.info("设置玩家 {} IP归属地，查询不到省份配置, provinceId:{}", this.getPlayerId(), provinceId);
               }
            }

            if (!sb.toString().equals(playerExtend.ipAttribution)) {
               playerExtend.ipAttribution = sb.toString();
               this.updatePlayerExtend(13);
               logger.info("更新玩家 {} IP归属地: {}", this.getPlayerId(), playerExtend.ipAttribution);
            }
         }
      }

   }

   public void repairProvince() {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      if (playerExtend.provinceId == 0 || playerExtend.cityId == 0 || playerExtend.areaId == 0) {
         boolean isFind = false;
         Map<Integer, ProvinceNameModel> provinceNameModelMap = ApplicationContextProvider.<Integer, ProvinceNameModel>getModelPoolMap("provinceName");

         for(ProvinceNameModel provinceNameModel : provinceNameModelMap.values()) {
            if (provinceNameModel.getName().contains(playerExtend.ipProvince)) {
               playerExtend.areaId = this.getAreaIdByModel(provinceNameModel);
               playerExtend.provinceId = provinceNameModel.getId();
               boolean isFindCity = false;
               List<CityNameModel> cityNameModelList = (List)ApplicationContextProvider.getModelPoolEntity("customCityName", provinceNameModel.getId());

               for(CityNameModel cityNameModel : cityNameModelList) {
                  if (cityNameModel.getName().contains(playerExtend.ipCity)) {
                     playerExtend.cityId = cityNameModel.getId();
                     isFindCity = true;
                     break;
                  }
               }

               if (!isFindCity) {
                  playerExtend.cityId = ((CityNameModel)cityNameModelList.get(0)).getId();
               }

               this.updatePlayerExtend(13);
               isFind = true;
               break;
            }
         }

         if (!isFind) {
            this.setIpProvince(0, 0);
         }
      }

      ProvinceNameModel provinceNameModel = (ProvinceNameModel)this.getGameModelPool().getEntity("provinceName", playerExtend.provinceId);
      if (provinceNameModel != null && this.getAreaIdByModel(provinceNameModel) != playerExtend.areaId) {
         playerExtend.areaId = this.getAreaIdByModel(provinceNameModel);
         this.updatePlayerExtend(13);
      }

   }

   public boolean pushTask(ExecutorsFunc func) {
      return super.pushTask(func);
   }

   private synchronized void checkInit_PARTS_SORTED_LOGIN_PRIORITY() {
      if (this.PARTS_SORTED_LOGIN_PRIORITY == null) {
         this.PARTS_SORTED_LOGIN_PRIORITY = this.<PlayerPart>getMgrParts(PlayerPart.class);
         this.PARTS_SORTED_LOGIN_PRIORITY.sort((o1, o2) -> o2.getLoginPriority() - o1.getLoginPriority());
      }

   }

   private void sendLoginSuccessData(boolean isReconnect, long loginOutTime) {
      this.sendPlayerBaseData(isReconnect, loginOutTime);
      this.sendZoneServerIds();
      PlayerResetPart playerResetPart = (PlayerResetPart)this.getMgrPart(PlayerResetPart.class);
      playerResetPart.playerReset(System.currentTimeMillis());
      this.sendWorldLv();
      this.checkInit_PARTS_SORTED_LOGIN_PRIORITY();
      this.PARTS_SORTED_LOGIN_PRIORITY.forEach((playerPart) -> {
         try {
            long curTime = System.currentTimeMillis();
            if (playerPart.loginHandleAsync()) {
               this.pushTask(playerPart::loginHandle);
            } else {
               playerPart.loginHandle();
            }

            long costTime = System.currentTimeMillis() - curTime;
            if (costTime > 5L) {
               logger.info("part 推送数据:" + playerPart.getClass().getName() + "----" + costTime);
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

      });
   }

   public void afterLogoutHandle(long logoutTime) {
      ActivityComeBackPart comeBackPart = (ActivityComeBackPart)this.getMgrPart(ActivityComeBackPart.class);
      comeBackPart.calActTotalOnlineTime(logoutTime);
      comeBackPart.logout();
      GiveHeroDrawPart giveHeroDrawPart = (GiveHeroDrawPart)this.getMgrPart(GiveHeroDrawPart.class);
      giveHeroDrawPart.calActTotalOnlineTime(logoutTime);
      giveHeroDrawPart.logout();
   }

   public void logout() {
      boolean createFlag = true;
      PlayerDao playerDao = this.getPlayerDao();
      if (StringUtils.isEmpty(playerDao.account)) {
         playerDao.account = this.account;
         createFlag = false;
      }

      if (playerDao.serverId <= 0) {
         playerDao.serverId = this.serverId;
         createFlag = false;
      }

      if (StringUtils.isEmpty(playerDao.playerName)) {
         createFlag = false;
      }

      playerDao.logoutTime = System.currentTimeMillis();
      playerDao.updateOp();
      long curOnline = 0L;
      if (playerDao.lastLoginTime > 0L) {
         curOnline = playerDao.logoutTime - playerDao.lastLoginTime;
         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         playerExtend.todayOnlineTime += curOnline;
         playerExtend.totalOnlineTime += curOnline;
         this.updatePlayerExtend(13);
         if (this.isGuest && !StringUtils.isEmpty(this.devUID)) {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            worldMgr.pushTask(() -> worldMgr.recordDeviceOnlineTime(this.devUID, curOnline));
         }

         ClientTrackingPart clientTrackingPart = (ClientTrackingPart)this.getMgrPart(ClientTrackingPart.class);
         clientTrackingPart.removeTrack(ClientTrackingEnum.SP_LAST_ONLINE_TIME, ClientTrackingEnum.SP_LAST_ONLINE_TIME.name());
         long curOnlineSeconds = curOnline / 1000L;
         clientTrackingPart.clientTrack(ClientTrackingEnum.SP_LAST_ONLINE_TIME, ClientTrackingEnum.SP_LAST_ONLINE_TIME.name(), "type=event_track", "event=Time_Spent", "time=" + curOnlineSeconds);
         this.afterLogoutHandle(playerDao.logoutTime);
      }

      if (createFlag) {
         this.operationMgr.changeHeadOldLog(this);
         String clientIp = this.getLogClientIp();
         if (clientIp.startsWith("null:")) {
            logger.warn("添加登出日志:无法获取玩家{}-{}的ip,{}", new Object[]{this.playerId, playerDao.playerName, clientIp.split(":")[1]});
         } else {
            this.operationMgr.addLogoutLog(this, curOnline, clientIp);
         }
      }

      this.checkInit_PARTS_SORTED_LOGIN_PRIORITY();
      this.PARTS_SORTED_LOGIN_PRIORITY.forEach((playerPart) -> {
         try {
            playerPart.logoutHandle();
         } catch (Exception e) {
            e.printStackTrace();
         }

      });
      this.gameCachePool.setOpenCheckExpire(true);
      this.isLogin = false;
      this.playerPublicDao = new PlayerPublicDao(playerDao);
   }

   public boolean isLogin() {
      return this.isLogin;
   }

   public boolean isEnableReceiveMail() {
      if (this.isRobot) {
         return false;
      } else {
         return this.getPublicDao().logoutTime == 0L || this.getPublicDao().logoutTime <= 1209600000L;
      }
   }

   public boolean isRobot() {
      return this.isRobot;
   }

   public void setRobot(boolean robot) {
      this.gameCachePool.setOpenCheckExpire(false);
      this.isRobot = robot;
   }

   public void setPlayerIdAndAccount(int playerId, String account, int serverId) {
      this.playerId = playerId;
      this.account = account;
      this.serverId = serverId;
   }

   @MsgHandlerAnno
   public void msgReconnect(LoginMsg.C2S_ReconnectKey_1006 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      Channel tempChannel = worldMgr.getChannel(source);
      Channel oldChannel = this.getChannel();
      if (oldChannel != null && oldChannel != tempChannel) {
         worldMgr.getChannelMap().remove(oldChannel.id().asLongText());
         oldChannel.attr(AttributeKey.valueOf("playerId")).set((Object)null);
         LoginMsg.S2C_LoginResult_1001 protoMsg = LoginMsg.S2C_LoginResult_1001.newBuilder().setResult(LoginMsg.resultType.OTHER).build();
         oldChannel.writeAndFlush(protoMsg);

         try {
            oldChannel.close().sync();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      if (Objects.isNull(tempChannel)) {
         logger.error("找不到连接信息!!!");
      } else if (AppArgs.isLoginLimit) {
         logger.error("GamePlayer.msgReconnect 登录限制开启，不允许登录!!!");
      } else {
         this.setChannel(tempChannel);
         worldMgr.pushTask(() -> {
            worldMgr.getChannelMap().put(this.getChannel().id().asLongText(), this);
            worldMgr.getOnlinePlayerMap().put(this.getPlayerId(), this);
            this.pushTask(() -> this.login(true));
         });
      }
   }

   @MsgHandlerAnno
   public void C2S_FilterRecommend_1007(LoginMsg.C2S_FilterRecommend_1007 msg, String source) {
      if (msg.hasRecommendCode()) {
         RecommendPart recommendPart = (RecommendPart)this.getMgrPart(RecommendPart.class);
         if (!recommendPart.filterRecommend(msg.getRecommendCode())) {
            LoginMsg.S2C_FilterRecommend_1008.Builder builder = LoginMsg.S2C_FilterRecommend_1008.newBuilder();
            builder.setResult(0);
            this.sendMsg(builder.build());
         } else {
            LoginMsg.S2C_FilterRecommend_1008.Builder builder = LoginMsg.S2C_FilterRecommend_1008.newBuilder();
            builder.setResult(1);
            this.sendMsg(builder.build());
         }
      }

   }

   public static boolean isValidNameForEN(String name) {
      if (!name.matches("[a-zA-Z' ]*")) {
         return false;
      } else {
         return !name.matches(".*\\s{4}.*");
      }
   }

   public boolean checkPlayerNameLength(String playerName) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      String playerNameLengthConfigStr = ApplicationContextProvider.getConfigString("playerNameLength", "cn:2|6,vn:2|12");
      String[] playerNameLengthConfigArr = playerNameLengthConfigStr.split(",");
      boolean isMatch = false;
      int defaultMin = 2;
      int defaultMax = 6;
      String[] var8 = playerNameLengthConfigArr;
      int var9 = playerNameLengthConfigArr.length;
      int var10 = 0;

      while(true) {
         label67: {
            if (var10 < var9) {
               String area_min_maxStr = var8[var10];
               String[] area_minMax = area_min_maxStr.split(":");
               if (area_minMax.length < 2) {
                  logger.error("config表playerNameLength 配置出错,请检查");
                  break label67;
               }

               String configCountry = area_minMax[0];
               String[] min_max = area_minMax[1].split("\\|");
               if (min_max.length < 2) {
                  logger.error("config表playerNameLength 配置出错,请检查");
                  break label67;
               }

               int min = Integer.parseInt(min_max[0]);
               int max = Integer.parseInt(min_max[1]);
               if (Objects.equals(configCountry, "cn")) {
                  defaultMin = min;
                  defaultMax = max;
               }

               if (!Objects.equals(worldMgr.country, configCountry)) {
                  break label67;
               }

               isMatch = true;
               if (playerName.length() < min || playerName.length() > max) {
                  return this.failure(13005);
               }
            }

            if (isMatch || playerName.length() >= defaultMin && playerName.length() <= defaultMax) {
               if (worldMgr.country.equals("en") && !isValidNameForEN(playerName)) {
                  return this.failure(13004);
               }

               if (!playerName.contains("{") && !playerName.contains("}")) {
                  return true;
               }

               return this.failure(13004);
            }

            return this.failure(13005);
         }

         ++var10;
      }
   }

   @MsgHandlerAnno
   public void msgCreateRole(LoginMsg.C2S_CreateRole_1002 msg, String source) {
      if (!Objects.nonNull(this.createState) || !this.createState.get()) {
         String playerName = msg.getPlayerName();
         playerName = playerName.trim();
         if (this.checkPlayerNameLength(playerName)) {
            if (NameFilter.hasBadWords(playerName)) {
               this.failure(13004);
            } else {
               this.createState = new AtomicBoolean(true);
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
               worldMgr.pushTask(() -> {
                  if (!worldMgr.playerNameIsExist(playerName)) {
                     this.pushTask(() -> {
                        PlayerDao playerDao = this.getPlayerDao();
                        if (playerDao.playerId < 20000) {
                           logger.error("错误的玩家id:【{}】", playerDao.playerId);
                        } else {
                           if (msg.hasRecommendCode()) {
                              RecommendPart recommendPart = (RecommendPart)this.getMgrPart(RecommendPart.class);
                              if (!recommendPart.invited(msg.getRecommendCode())) {
                                 this.failure(20007);
                                 worldMgr.pushTask(() -> worldMgr.getPlayerName().remove(playerName));
                                 this.createState.set(false);
                                 return;
                              }
                           }

                           if (!StringUtils.isEmpty(playerDao.playerName)) {
                              this.login(false);
                              this.createState.set(false);
                           } else {
                              playerDao.serverId = this.serverId;
                              playerDao.account = this.account;
                              playerDao.sex = (byte)msg.getSex();
                              playerDao.playerName = playerName;
                              playerDao.headFrame = 30001;
                              if (msg.getSex() == 1) {
                                 playerDao.head = 1;
                              } else {
                                 playerDao.head = 2;
                              }

                              ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
                              int monarchId = configManager.getInt("DefaultHeroMonarchImage");
                              playerDao.monarchId = monarchId;
                              playerDao.setProperty(PlayerDefine.PLAYER_LV, 1L);
                              playerDao.birthTime = System.currentTimeMillis();
                              this.gameCachePool.updateDao(playerDao, true);
                              int heroId = configManager.getInt("playerDefaultHero");
                              this.addResource(3, heroId, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 4, 400, 0, 0, "");
                              if ("jp".equals(worldMgr.country)) {
                                 this.addResource(ResourceModel.buildResources(ApplicationContextProvider.getConfigString("createRolesitem_jp", "1|9|44")), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 13, 1315, 0, 0, "");
                              }

                              this.saveArraying();
                              AdventureTaskPart adventureTaskPart = (AdventureTaskPart)this.getMgrPart(AdventureTaskPart.class);
                              adventureTaskPart.initTask();
                              this.isLogin = true;
                              this.registerLog(playerName, this.account);
                              this.login(false);
                              this.createState.set(false);
                              String clientIp = this.getLogClientIp();
                              if (clientIp.startsWith("null:")) {
                                 logger.warn("添加创角日志:无法获取玩家{}-{}的ip,{}", new Object[]{this.playerId, playerDao.playerName, clientIp.split(":")[1]});
                              } else {
                                 this.operationMgr.addCreateUserNewLog(this, clientIp);
                              }

                              this.operationMgr.addCreateUserOldLog(this);
                              if (ApplicationContextProvider.getConfigInt("iosGmOpen", 0) > 0) {
                                 ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
                                 chatMgr.gmAddLvByExp(this, ApplicationContextProvider.getConfigInt("iosPlayerLv", 100), 7, 7600, 0, 0, "ios");
                                 String heroStr = ApplicationContextProvider.getConfigString("iosHero", (String)null);
                                 if (heroStr != null) {
                                    String[] heroStrArr = heroStr.split("\\|");
                                    HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
                                    int heroLv = ApplicationContextProvider.getConfigInt("iosHeroLv", 255);
                                    int heroStar = ApplicationContextProvider.getConfigInt("iosHeroStar", 10);

                                    for(String hero : heroStrArr) {
                                       int heroId1 = Integer.parseInt(hero);
                                       heroBagPart.addHeroForAssign(heroId1, 1, heroLv, heroStar, 49, 7600, 0, 0, "ios");
                                    }
                                 }

                                 List<ResourceModel> addList = new ArrayList();
                                 addList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, ApplicationContextProvider.getConfigInt("iosPlayerGold", 100000)));
                                 addList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, ApplicationContextProvider.getConfigInt("iosPlayerMoney", 100000)));
                                 this.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 7600, 0, 0, "ios");
                                 this.saveArraying();
                                 CrossMsg.S2CR_PlayerBaseData_4202.Builder builder = CrossMsg.S2CR_PlayerBaseData_4202.newBuilder();
                                 builder.setServerId(this.getServerId());
                                 builder.setPlayerId(this.getPlayerId());
                                 builder.setPlayerName(playerDao.playerName);
                                 builder.setSex(playerDao.sex);
                                 builder.setLv(playerDao.lv);
                                 builder.setCombatPower(this.getPlayerCombatPower());
                                 builder.setHeroNum(this.getBattleTeam(CommonMsg.HeroState.HERO_STATE_ARRAYING, (Map)null).getEntityMap().size());
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

                                 this.crossNettyClient.sendCross(this.getServerId(), this.getPlayerId(), builder.build());
                              }

                              ActivityComeBackPart comeBackPart = (ActivityComeBackPart)this.getMgrPart(ActivityComeBackPart.class);
                              if (!comeBackPart.isServerActivityInvalid()) {
                                 comeBackPart.playerActRegHandle();
                              }

                           }
                        }
                     });
                  } else {
                     this.failure(13003);
                     this.createState.set(false);
                  }
               });
            }
         }
      }
   }

   public void testData() {
      List<ResourceModel> addList = new ArrayList();
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, 1000000));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, 999999999));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_BLESSING, 10000));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_FRIEND, 10000));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_HERO_EXP, 999999999));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_INFOMATION, 999999));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_SOUL, 999999));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_RECRUIT_STONE, 10000));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, 99999999));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_HERO_CLUB, 1000000));
      addList.add(new ResourceModel(2, 1001, 99999));
      addList.add(new ResourceModel(2, 1002, 9999));
      addList.add(new ResourceModel(2, 1003, 9999));
      addList.add(new ResourceModel(2, 1004, 9999));
      addList.add(new ResourceModel(2, 1005, 9999));
      addList.add(new ResourceModel(2, 1006, 99999));
      addList.add(new ResourceModel(2, 1006, 9999));
      addList.add(new ResourceModel(2, 1007, 9999));
      addList.add(new ResourceModel(2, 1008, 9999));
      addList.add(new ResourceModel(2, 1009, 9999));
      addList.add(new ResourceModel(2, 1010, 9999));
      addList.add(new ResourceModel(2, 1012, 9999));
      addList.add(new ResourceModel(2, 1014, 9999));
      addList.add(new ResourceModel(2, 1016, 9999));
      addList.add(new ResourceModel(2, 1017, 9999));
      addList.add(new ResourceModel(2, 1018, 9999));
      addList.add(new ResourceModel(2, 1019, 9999));
      addList.add(new ResourceModel(2, 1020, 9999));
      addList.add(new ResourceModel(2, 1021, 9999));
      addList.add(new ResourceModel(2, 1027, 9999));
      addList.add(new ResourceModel(2, 1028, 9999));
      addList.add(new ResourceModel(2, 1029, 9999));
      addList.add(new ResourceModel(2, 1030, 9999));
      addList.add(new ResourceModel(2, 1031, 9999));
      addList.add(new ResourceModel(2, 1032, 9999));
      addList.add(new ResourceModel(2, 1033, 9999));
      addList.add(new ResourceModel(2, 1038, 80000));
      addList.add(new ResourceModel(2, 1039, 80000));
      addList.add(new ResourceModel(2, 1040, 80000));
      addList.add(new ResourceModel(2, 1041, 80000));
      addList.add(new ResourceModel(2, 1042, 80000));
      addList.add(new ResourceModel(2, 1043, 48888));
      addList.add(new ResourceModel(2, 1044, 9999));
      addList.add(new ResourceModel(2, 1045, 9999));
      addList.add(new ResourceModel(2, 1046, 9999));
      addList.add(new ResourceModel(2, 1049, 9999));
      addList.add(new ResourceModel(2, 1050, 9999));
      addList.add(new ResourceModel(2, 1051, 9999));
      addList.add(new ResourceModel(2, 1053, 9999));
      addList.add(new ResourceModel(2, 1055, 9999));
      addList.add(new ResourceModel(2, 1056, 9999));
      addList.add(new ResourceModel(2, 1078, 88888));
      addList.add(new ResourceModel(2, 1079, 9999));
      addList.add(new ResourceModel(2, 1080, 9999));
      addList.add(new ResourceModel(2, 1081, 9999));
      addList.add(new ResourceModel(2, 1082, 9999));
      addList.add(new ResourceModel(2, 1085, 9999));
      addList.add(new ResourceModel(2, 1086, 9999));
      addList.add(new ResourceModel(2, 1087, 9999));
      addList.add(new ResourceModel(2, 1088, 9999));
      addList.add(new ResourceModel(2, 1088, 9999));
      addList.add(new ResourceModel(2, 1089, 999));
      addList.add(new ResourceModel(2, 1090, 9999));
      addList.add(new ResourceModel(2, 1103, 9999));
      addList.add(new ResourceModel(2, 1104, 9999));
      addList.add(new ResourceModel(2, 1105, 9999));
      addList.add(new ResourceModel(2, 1533, 9999));
      addList.add(new ResourceModel(2, 1534, 9999));
      addList.add(new ResourceModel(2, 2651, 12));
      addList.add(new ResourceModel(2, 2652, 12));
      addList.add(new ResourceModel(2, 2653, 12));
      addList.add(new ResourceModel(2, 2654, 12));
      addList.add(new ResourceModel(2, 99991, 12));
      addList.add(new ResourceModel(2, 99992, 12));
      addList.add(new ResourceModel(2, 99993, 12));
      addList.add(new ResourceModel(2, 99994, 12));
      addList.add(new ResourceModel(2, 1336, 99));
      addList.add(new ResourceModel(2, 1320, 99));
      addList.add(new ResourceModel(2, 1307, 99));
      addList.add(new ResourceModel(2, 1309, 99));
      addList.add(new ResourceModel(2, 1302, 99));
      addList.add(new ResourceModel(2, 4060, 12));
      addList.add(new ResourceModel(2, 1537, 99));
      addList.add(new ResourceModel(2, 6005, 1));
      addList.add(new ResourceModel(2, 6006, 1));
      addList.add(new ResourceModel(2, 6007, 1));
      addList.add(new ResourceModel(2, 6008, 1));
      addList.add(new ResourceModel(2, 6009, 1));
      addList.add(new ResourceModel(2, 6010, 1));
      addList.add(new ResourceModel(2, 1475, 99));
      addList.add(new ResourceModel(2, 1513, 500));
      addList.add(new ResourceModel(2, 60010, 9999));
      addList.add(new ResourceModel(2, 60020, 9999));
      addList.add(new ResourceModel(2, 60030, 9999));
      addList.add(new ResourceModel(2, 65015, 6));
      addList.add(new ResourceModel(2, 65006, 6));
      addList.add(new ResourceModel(2, 65002, 6));
      addList.add(new ResourceModel(2, 65004, 6));
      addList.add(new ResourceModel(2, 1487, 500));
      addList.add(new ResourceModel(2, 1453, 500));
      addList.add(new ResourceModel(2, 1491, 500));
      addList.add(new ResourceModel(2, 7001, 1));
      addList.add(new ResourceModel(2, 7002, 1));
      addList.add(new ResourceModel(2, 7003, 1));
      addList.add(new ResourceModel(2, 7004, 1));
      addList.add(new ResourceModel(2, 7005, 1));
      addList.add(new ResourceModel(2, 7006, 1));
      this.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 702, 0, 0, "gm testdata");
      HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
      heroBagPart.addHeroForAssign(23510, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(22507, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(22509, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(24504, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(21508, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(22504, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(22508, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(24508, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(24510, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(25504, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(25507, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(25509, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      heroBagPart.addHeroForAssign(25510, 1, 255, 13, 49, 452, 0, 0, "game testdata");
      ArtifactPart artifactPart = (ArtifactPart)this.getMgrPart(ArtifactPart.class);
      artifactPart.unlockArtifact();
      artifactPart.superArtifact();
      TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.getMgrPart(TongqueTerracePart.class);
      tongqueTerracePart.testOneKeyLvUp();
   }

   public void saveArraying() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.getMgrPart(HeroArrayingPart.class);
      List<HeroMsg.ArrayingInfo> arrayingList = new ArrayList();
      Map<Integer, HeroDao> heroDaoMap = this.gameCachePool.getMap("tb_hero_bag", new Object[]{this.playerId});
      int position = 0;
      int totalPower = 0;

      for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
         HeroMsg.ArrayingInfo.Builder info = HeroMsg.ArrayingInfo.newBuilder();
         info.setCode((Integer)entry.getKey());
         info.setCodeType(CommonMsg.CodeType.CODE_HERO);
         info.setPosition(position);
         arrayingList.add(info.build());
         totalPower = (int)((long)totalPower + ((HeroDao)entry.getValue()).getCombatPower());
         ++position;
         if (position > 4) {
            break;
         }
      }

      PlayerDao playerDao = this.getPlayerDao();
      playerDao.combat_power = (long)totalPower;
      playerDao.updateOp();
      heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING, arrayingList);
   }

   @MsgHandlerAnno
   public void msgHeart(PlayerMsg.A_Heart_2001 msg, String source) {
      long curTime = System.currentTimeMillis();
      if (curTime - this.lastHeartTime < 1000L) {
         ++this.heartFastCount;
         if (this.heartFastCount > 30) {
            this.heartFastCount = 0;
            this.channel.close();
            logger.warn(String.format("玩家(%d)心跳过快，被踢下线", this.playerId));
            return;
         }
      } else if (this.heartFastCount > 0) {
         --this.heartFastCount;
      }

      PlayerMsg.A_Heart_2001 res = PlayerMsg.A_Heart_2001.newBuilder().setTime((int)(curTime / 1000L)).build();
      this.sendMsg(res);
      this.lastHeartTime = curTime;
      if (curTime - this.heartMsgLogTime >= 300000L) {
         String clientIp = this.getLogClientIp();
         if (clientIp.startsWith("null:")) {
            logger.warn("添加心跳日志:无法获取玩家{}的ip,{}", this.playerId, clientIp.split(":")[1]);
         } else {
            this.operationMgr.addHeartMsgLog(this, clientIp);
         }

         this.heartMsgLogTime = curTime;
      }

   }

   public int getPlayerId() {
      return this.playerId;
   }

   public int getServerId() {
      return this.serverId;
   }

   public String getAccount() {
      return this.account;
   }

   public GameModelPool getGameModelPool() {
      return this.gameModelPool;
   }

   public LogMgr getLogMgr() {
      return this.logMgr;
   }

   public LogOperationMgr getOperationMgr() {
      return this.operationMgr;
   }

   public void sendMsg(GeneratedMessageV3 msg) {
      if (this.channel != null && msg != null) {
         this.channel.writeAndFlush(msg);
         if (GameServerHandler.getProtoLogState(msg.getClass())) {
            logger.info("【消息日志】:玩家【{}】发送消息【{}】【{}】", new Object[]{this.getPlayerId(), msg.getClass().getSimpleName(), msg});
         }

      }
   }

   public int getUniqueCode(CodeDefine codeDefine) {
      CodeDao codeDao = (CodeDao)this.gameCachePool.getData("tb_code", new Object[]{this.playerId});
      codeDao.updateOp();
      return codeDao.getCode(codeDefine);
   }

   public void checkUnionCode(CodeDefine codeDefine, int maxCode) {
      CodeDao codeDao = (CodeDao)this.gameCachePool.getData("tb_code", new Object[]{this.playerId});
      codeDao.checkMaxCode(codeDefine, maxCode);
   }

   public boolean failure(int id) {
      FailureMsg.S2C_Failure_101.Builder msgBuilder = FailureMsg.S2C_Failure_101.newBuilder();
      msgBuilder.setErrorCode(id);
      if (Debug.isDebug) {
         ErrorModel errorModel = (ErrorModel)ApplicationContextProvider.getModelPoolEntity("error", id);
         if (errorModel != null) {
            msgBuilder.setErrorStr(errorModel.getHint());
         }
      }

      this.sendMsg(msgBuilder.build());
      return false;
   }

   public boolean failure(int id, String errorStr) {
      FailureMsg.S2C_Failure_101.Builder msgBuilder = FailureMsg.S2C_Failure_101.newBuilder();
      msgBuilder.setErrorCode(id);
      msgBuilder.setErrorStr(errorStr);
      this.sendMsg(msgBuilder.build());
      return false;
   }

   private void sendPlayerBaseData(boolean isReconnect, long loginOutTime) {
      if (this.channel != null) {
         PlayerMsg.A_Heart_2001 res = PlayerMsg.A_Heart_2001.newBuilder().setTime((int)(System.currentTimeMillis() / 1000L)).build();
         this.sendMsg(res);
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         PlayerDao playerDao = this.getPlayerDao();

         try {
            PlayerMsg.S2C_UpdatePlayerData_2003.Builder msg = PlayerMsg.S2C_UpdatePlayerData_2003.newBuilder();
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.RE_CONNECT, isReconnect ? 1 : 0));

            for(Integer property : PlayerDefine.map.keySet()) {
               if (property == PlayerDefine.PLAYER_PVP_POINTS) {
                  PvpSeasonMgr pvpSeasonMgr = (PvpSeasonMgr)ApplicationContextProvider.getContext().getBean(PvpSeasonMgr.class);
                  msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_PVP_POINTS, pvpSeasonMgr.getPvpScore(this.playerId)));
               } else {
                  msg.addDatas(playerDao.toBasePropertyCell(property));
               }
            }

            PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_ID, this.playerId));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_HEROBAG_BUYNUM, playerExtend.heroBagBuyNum));
            BattleChapterDao battleChapterDao = (BattleChapterDao)this.getData("tb_battle_chapter", this.playerId);
            msg.addDatas(this.toPropertyCellForInt64(PlayerDefine.PLAYER_COMBAT_POWER_101, playerDao.combat_power));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_CHAPTER_ID, battleChapterDao.chapterId));
            msg.addDatas(this.toPropertyCellForString(PlayerDefine.PLAYER_NAME, playerDao.playerName));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_HEAD, playerDao.head));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_HEADFRAME, playerDao.headFrame));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_UNION_ID, playerDao.unionId));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_PRESTIGE, playerDao.prestige));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_MONARCHID, playerDao.monarchId));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.HERO_HIGHEST_LV, playerExtend.heroHighestLv));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.HERO_HIGHEST_STAR, playerExtend.heroHighestStar));
            msg.addDatas(this.toPropertyCellForInt64(PlayerDefine.PLAYER_HIGHEST_POWER, playerExtend.highestPower));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.OPEN_SERVER_TIME, DateUtil.getIntTime(worldMgr.getOpenServerTime())));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_LEAVE_TIME, (int)((System.currentTimeMillis() - loginOutTime) / 1000L)));
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.getData("tb_player_recharge", this.getPlayerId());
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_RECHARGE_DAILY_TOTAL, playerRechargeDao.dailyRecharge));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_RECHARGE_TOTAL, playerRechargeDao.totalRecharge));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_RECHARGE_TOTAL_DAY, playerRechargeDao.getTotalRechargeDay()));
            msg.addDatas(this.toPropertyCellForString(PlayerDefine.PLAYER_PROVINCE, this.getIpProvince() + "|" + this.getIpCity()));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_PROVINCE_ID, playerExtend.provinceId));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_CITY_ID, playerExtend.cityId));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_SEX, playerDao.sex));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_GUIDE_ID, playerExtend.guideStep));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_STORY_ID, playerExtend.storyId));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_RUNE_STONE, playerExtend.runeStone));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_TYPE, playerDao.type));
            String shortId = this.channel.id().asShortText();
            int key = 0;

            for(int i = 0; i < shortId.length(); ++i) {
               if ((6 >> i % 4 & 1) == 0) {
                  key |= shortId.charAt(i) << i % 4 * 8;
               } else {
                  key ^= shortId.charAt(i) << i % 4 * 8;
               }
            }

            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_KEY1, key));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_MASK, WorldMgr.MSG_MASK));
            this.channel.attr(AttributeKey.valueOf("de_mask")).set(WorldMgr.MSG_MASK);
            this.channel.attr(AttributeKey.valueOf("de_key")).set(key);
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_AGE, playerExtend.age));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_TODAY_ONLINE_TIME, DateUtil.getIntTime(playerExtend.todayOnlineTime)));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_TODAY_ONLINE_LIMIT, worldMgr.getOnlineLimitTime(playerExtend.age)));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_RECHARGE_MONTH_TOTAL, playerRechargeDao.monthlyRecharge));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_TOTAL_ONLINE_TIME, StringUtils.isEmpty(this.devUID) ? 0 : DateUtil.getIntTime(worldMgr.getDeviceOnlineTime(this.devUID))));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_BIRTH_TIME, DateUtil.getIntTime(playerDao.birthTime)));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_SHOW_VIP_LEVEL, playerDao.isShowVip ? 1 : 0));
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.getCustomCache("tb_player_reset", this.getPlayerId());
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_JOIN_UNION_CD, DateUtil.getIntTime((Long)playerResetCustomCache.getForeverNum(3, 0L))));
            msg.addDatas(this.toPropertyCellForString(PlayerDefine.CLIENT_VERSION, worldMgr.clientVersionContent));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PLAYER_SECOND_TITLE, playerDao.secondTitle));
            WorldDao<ActivityData> worldDao = worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.ACT_ARTIFACT_FLAG, ((ActivityData)worldDao.jsonData).firstArtifactEnd ? 1 : 0));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PET_BAG_NUM, playerExtend.petBagNum));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.PET_BAG_BUY_NUM, playerExtend.petBagBuyNum));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.CHAT_BUBBLE, playerExtend.bubble));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.SERVER_ID, this.getServerId()));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.STAR_13_HERO_NUM, playerExtend.star13Heros));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.CROSS_PK_CD, (Integer)playerResetCustomCache.getForeverNum(35, 0)));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.CROSS_PK_FLUSH_CD, (Integer)playerResetCustomCache.getForeverNum(34, 0)));
            HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.getData("tb_hero_promote", this.playerId);
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.HERO_PROMOTE_LEVEL, heroPromoteDao.level));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.HERO_PROMOTE_STAGE, heroPromoteDao.stage));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.CUSTOM_FACE_STATE, playerExtend.custom_face_state));
            msg.addDatas(this.toPropertyCellForString(PlayerDefine.ALL_SERVER_ID, Joiner.on(",").join(worldMgr.getServersSet())));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.MAIN_SERVER_ID, worldMgr.GAME_SERVER_ID));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.COME_BACK_ACT_REG, playerDao.comeBackActReg));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.IS_AFTER_MERGE, this.isAfterMerge() ? 1 : 0));
            QqBigPlayerPart qqBigPlayerPart = (QqBigPlayerPart)this.getMgrPart(QqBigPlayerPart.class);
            int wanKaLv = qqBigPlayerPart.recWanKaLv(true);
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.QQ_WAN_KA_LV, wanKaLv));
            msg.addDatas(this.toPropertyCellForString(PlayerDefine.QQ_WAN_KA_LOGO, qqBigPlayerPart.recWanKaLogo(wanKaLv, true)));
            msg.addDatas(this.toPropertyCellForInt32(PlayerDefine.COIN_TOTAL_RECHARGE, playerRechargeDao.coinTotalRecharge));
            this.sendMsg(msg.build());
         } catch (Exception e) {
            e.printStackTrace();
         }

      }
   }

   public PlayerMsg.PropertyCell.Builder toPropertyCellForInt32(int property, int value) {
      return this.toPropertyCell(property, String.valueOf(value), PlayerMsg.ValType.VALTYPE_INT32);
   }

   public PlayerMsg.PropertyCell.Builder toPropertyCellForInt64(int property, long value) {
      return this.toPropertyCell(property, String.valueOf(value), PlayerMsg.ValType.VALTYPE_INT64);
   }

   public PlayerMsg.PropertyCell.Builder toPropertyCellForString(int property, String value) {
      return this.toPropertyCell(property, value, PlayerMsg.ValType.VALTYPE_STRING);
   }

   private PlayerMsg.PropertyCell.Builder toPropertyCell(int property, String value, PlayerMsg.ValType valType) {
      PlayerMsg.PropertyCell.Builder info_builder = PlayerMsg.PropertyCell.newBuilder();
      info_builder.setProperty(property);
      info_builder.setValue(value);
      info_builder.setType(valType);
      return info_builder;
   }

   public boolean checkAddResourceItemBagNum(List<ResourceModel> resourceModelList) {
      int heroCount = 0;
      Map<Integer, Integer> itemMap = new HashMap();

      for(ResourceModel resourceModel : resourceModelList) {
         if (resourceModel.getType() == 2) {
            int oldVal = (Integer)itemMap.getOrDefault(resourceModel.getId(), 0);
            itemMap.put(resourceModel.getId(), oldVal + resourceModel.getValue());
         } else if (resourceModel.getType() == 3) {
            heroCount += resourceModel.getValue();
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
      if (heroCount > 0 && !heroBagPart.isEnableAddHero(heroCount)) {
         logger.info("武将背包超出限制");
         return false;
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);
         Map<Byte, Integer> subItemMap = new HashMap();

         for(Map.Entry<Integer, Integer> entry : itemMap.entrySet()) {
            int itemId = (Integer)entry.getKey();
            int value = (Integer)entry.getValue();
            ItemModel model = (ItemModel)this.getGameModelPool().getEntity("item", itemId);
            if (model != null) {
               int gridNum = 0;
               int maxCombine = itemBagPart.getMaxCombine(model.getId());
               if (model.getCombine() == 1) {
                  gridNum = value / maxCombine;
                  if (value % maxCombine != 0) {
                     ++gridNum;
                  }
               } else {
                  gridNum += value;
               }

               int oldGridNum = (Integer)subItemMap.getOrDefault(model.getSubclass(), 0);
               subItemMap.put(model.getSubclass(), oldGridNum + gridNum);
            }
         }

         for(Map.Entry<Byte, Integer> entry : subItemMap.entrySet()) {
            int subClass = (Byte)entry.getKey();
            int gridNum = (Integer)entry.getValue();
            ItemBagDao itemBagDao = (ItemBagDao)this.getData("tb_bag", this.playerId);
            BagParent<ItemBase> bag = itemBagDao.getBagBySublass(subClass);
            int maxLimit = itemBagPart.getMaxCount(subClass);
            if (bag.getBagSize() + gridNum > maxLimit) {
               logger.info("格子超出背包限制，背包格子={}，现有物品数={}，增加格子={}", new Object[]{maxLimit, bag.getBagSize(), gridNum});
               return false;
            }
         }

         return true;
      }
   }

   public boolean checkResourceNum(int type, int id, int num) {
      return this.checkResourceNumPrivate(type, id, num);
   }

   public boolean checkResourceNum(ResourceModel resourceModel) {
      return this.checkResourceNumPrivate(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue());
   }

   public boolean checkResourceNum(List<ResourceModel> resourceModelList) {
      if (resourceModelList.isEmpty()) {
         logger.info("玩家={}，检查资源消耗列表为空", this.playerId);
      }

      List<ResourceModel> actualList = new ArrayList();

      for(ResourceModel resourceModel : resourceModelList) {
         ResourceModel.addResourceToList(actualList, resourceModel);
      }

      for(ResourceModel resourceModel : actualList) {
         if (!this.checkResourceNum(resourceModel)) {
            return false;
         }
      }

      return true;
   }

   private boolean checkResourceNumPrivate(int type, int id, int num) {
      if (num == 0) {
         logger.warn("playerId={}，type={}，id={}，num={}", new Object[]{this.playerId, type, id, num});
         return true;
      } else if (num < 0) {
         (new Exception()).printStackTrace();
         return false;
      } else {
         switch (type) {
            case 1:
               PlayerDao playerDao = this.getPlayerDao();
               return playerDao.getProperty(id) >= (long)num;
            case 2:
               ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);
               return itemBagPart.getItemNum(id) >= num;
            case 3:
               HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
               List<HeroDao> heroById = heroBagPart.findHeroById(id);
               return heroById != null && heroById.size() >= num;
            default:
               return false;
         }
      }
   }

   @TaskMethod
   public long getResourceNum(int type, int id) {
      switch (type) {
         case 1:
            PlayerDao playerDao = this.getPlayerDao();
            return playerDao.getProperty(id);
         case 2:
            ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);
            return (long)itemBagPart.getItemNum(id);
         case 3:
            HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
            List<HeroDao> heroById = heroBagPart.findHeroById(id);
            return heroById == null ? 0L : (long)heroById.size();
         default:
            return 0L;
      }
   }

   public void addResource(int type, int id, int num, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode, int... battleType) {
      int oldLv = this.getPlayerDao().lv;
      List<ResourceModel> list = new ArrayList();
      list.add(new ResourceModel(type, id, num));
      this.addResourcePrivate(list, module, reason, useId, useNum, useCode);
      this.sendResourceMsg(showType, oldLv, "", battleType);
   }

   public void addResource(List<ResourceModel> resourceModelList, int module, int reason) {
      this.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, module, reason, 0, 0, "");
   }

   public void addResource(List<ResourceModel> resourceModelList, PlayerMsg.ShowType showType, int module, int reason) {
      this.addResource(resourceModelList, showType, module, reason, 0, 0, "");
   }

   public void addResource(List<ResourceModel> resourceModelList, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode, int... battleType) {
      if (resourceModelList != null && !resourceModelList.isEmpty()) {
         int oldLv = this.getPlayerDao().lv;
         this.addResourcePrivate(resourceModelList, module, reason, useId, useNum, useCode);
         if (showType == PlayerMsg.ShowType.SHOW_TYPE_HERO_RAISE) {
            PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.getData("tb_player_activity", this.getPlayerId());
            oldLv = playerActivityDao.heroRise.level;
         } else if (showType == PlayerMsg.ShowType.SHOW_FIRST_YEAR_ACTIVITY_TREASURE_GIFT) {
            ActivityAnniversaryCelebrationDao celebrationDao = (ActivityAnniversaryCelebrationDao)this.getData("tb_activity_anniversary_celebration", this.getPlayerId());
            oldLv = celebrationDao.treasureLv;
         } else if (showType == PlayerMsg.ShowType.SHOW_NEW_WEEK) {
            ActivityNewWeekPart part = (ActivityNewWeekPart)this.getMgrPart(ActivityNewWeekPart.class);
            oldLv = part.getDao().treasureLv;
         }

         this.sendResourceMsg(showType, oldLv, useCode, battleType);
      }
   }

   public void addResource(int times, List<ResourceModel> resourceModelList, int module, int reason, int useId, int useNum, String useCode) {
      if (resourceModelList != null && !resourceModelList.isEmpty()) {
         List<ResourceModel> finalList = new ArrayList();

         for(ResourceModel resourceModel : resourceModelList) {
            finalList.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * times));
         }

         int oldLv = this.getPlayerDao().lv;
         this.addResourcePrivate(finalList, module, reason, useId, useNum, useCode);
         this.sendResourceMsg(PlayerMsg.ShowType.SHOW_TYPE_COMMON, oldLv, "");
      }
   }

   public void addResource(ResourceModel resourceModel, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode, int... battleType) {
      if (resourceModel != null) {
         int oldLv = this.getPlayerDao().lv;
         List<ResourceModel> list = new ArrayList();
         list.add(resourceModel);
         this.addResourcePrivate(list, module, reason, useId, useNum, useCode);
         this.sendResourceMsg(showType, oldLv, "", battleType);
      }
   }

   @TaskMethod
   public void addResourceByNum(int type, int id, int num, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode) {
      this.addResource(type, id, num, showType, module, reason, useId, useNum, useCode, (int[])null);
   }

   @TaskMethod
   public void addResourceByNumAndBattleType(int type, int id, int num, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode, int battleType) {
      this.addResource(type, id, num, showType, module, reason, useId, useNum, useCode, battleType);
   }

   @TaskMethod
   public void addResourceByList(List<ResourceModel> resourceModelList, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode) {
      this.addResource(resourceModelList, showType, module, reason, useId, useNum, useCode, (int[])null);
   }

   @TaskMethod
   public void addResourceByListAndBattleType(List<ResourceModel> resourceModelList, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode, int battleType) {
      this.addResource(resourceModelList, showType, module, reason, useId, useNum, useCode, battleType);
   }

   @TaskMethod
   public void addResourceByListAndTIimes(int times, List<ResourceModel> resourceModelList, int module, int reason, int useId, int useNum, String useCode) {
      this.addResource(times, resourceModelList, module, reason, useId, useNum, useCode);
   }

   @TaskMethod
   public void addResourceByModel(ResourceModel resourceModel, PlayerMsg.ShowType showType, int module, int reason, int useId, int useNum, String useCode, int battleType) {
      this.addResource(resourceModel, showType, module, reason, useId, useNum, useCode, battleType);
   }

   private void addResourcePrivate(List<ResourceModel> list, int module, int reason, int useId, int useNum, String useCode, Object... params) {
      ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);
      List<ResourceModel> finalResourceModels = new ArrayList();

      for(ResourceModel model : list) {
         if (model.getType() == 2) {
            ItemModel itemModel = (ItemModel)this.getGameModelPool().getEntity("item", model.getId());
            if (itemModel == null) {
               String strError = String.format("playerId:%d 获得的物品不存在 itemId:%d", this.getPlayerId(), model.getId());
               logger.error("{}", strError);
            } else if (!Debug.isDebug && itemModel.getId() == ApplicationContextProvider.getConfigInt("SpecialMoneyId", 88888888) && reason != 1709 && reason != 4901) {
               logger.error("玩家【{}】,通过【{}-{}】获取三国币,不给予发放", new Object[]{this.playerId, reason, LogDefine.REASON_DEC_MAP.getOrDefault(reason, "未知")});
            } else if (itemModel.getTargetclass() != 2 && itemModel.getTargetclass() != 9) {
               finalResourceModels.add(model);
               (new Random()).nextGaussian();
               RandomUtil.randomInt(1000);
            } else {
               List<ResourceModel> resourcesByUseFun = itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), model.getValue());
               if (resourcesByUseFun.isEmpty()) {
                  logger.debug("自动打开的宝箱，没有配置物品 playerId:{}, useFuncType:{}, useFuncId:{}, useFuncValue:{}", new Object[]{this.playerId, itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), model.getValue()});
               }

               finalResourceModels.addAll(resourcesByUseFun);
            }
         } else {
            finalResourceModels.add(model);
         }
      }

      this.checkNumLegal(finalResourceModels);
      PlayerDao playerDao = this.getPlayerDao();
      Map<Integer, Integer> cumulativeMap = new HashMap();
      Set<Integer> propertyList = new HashSet();
      List<Integer> heroList = new ArrayList();

      for(ResourceModel model : finalResourceModels) {
         if (!itemBagPart.checkItemExist(model.getType(), model.getId())) {
            for(ResourceModel temp : list) {
               logger.info("物品 -> " + temp.toString());
            }

            logger.info("添加的物品不存在 type:{}, id:{}", model.getType(), model.getId());
            (new Exception()).printStackTrace();
            String strError = String.format("playerId:%d 获得的物品不存在 itemType:%d, itemId:%d", this.getPlayerId(), model.getType(), model.getId());
         } else {
            switch (model.getType()) {
               case 1:
                  this.modifyProperty(model.getId(), (long)model.getValue(), module, reason, useId, useNum, String.valueOf(useCode), false);
                  propertyList.add(model.getId());
                  CommonMsg.ItemInfo.Builder propertyBuilder = CommonMsg.ItemInfo.newBuilder();
                  propertyBuilder.setType(1);
                  propertyBuilder.setCode(-1);
                  propertyBuilder.setNum(model.getValue());
                  propertyBuilder.setId(model.getId());
                  this.addResourceMsgByBuilder(propertyBuilder);
                  break;
               case 2:
                  ItemModel itemModel = (ItemModel)this.getGameModelPool().getEntity("item", model.getId());
                  if (!this.checkCanAddItems(itemModel, model.getValue())) {
                     break;
                  }

                  if (itemModel.getSubclass() != 20 && itemModel.getSubclass() != 19 && itemModel.getSubclass() != 21 && itemModel.getSubclass() != 22) {
                     List<CommonMsg.ItemInfo.Builder> items = itemBagPart.addItem(model.getId(), model.getValue(), module, reason, useId, useNum, String.valueOf(useCode), model.getCreateTime());
                     items.forEach(this::addResourceMsgByBuilder);
                     if (model.getId() > 0 && model.getValue() > 0) {
                        this.triggerTask(537, model.getId(), (long)model.getValue(), 1);
                     }

                     if (itemModel.getId() != 888880 && itemModel.getUseFuncType() != 88 && itemModel.getUseFuncType() != 87 && itemModel.getUseFuncType() != 86) {
                        if (itemModel.getUseFuncType() == 18) {
                           TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.getMgrPart(TongqueTerracePart.class);
                           tongqueTerracePart.unlockBeauty(itemModel.getUseFuncId());
                        }
                     } else if (playerDao.type == 0) {
                        playerDao.type = 998;
                        playerDao.updateOp();
                        this.notifyPlayerData(PlayerDefine.PLAYER_TYPE, playerDao.type);
                     }

                     if (itemModel.getTargetclass() == 10) {
                        MonarchPart monarchPart = (MonarchPart)this.getMgrPart(MonarchPart.class);
                        monarchPart.addItemMonarch();
                     }
                  } else {
                     MonarchPart monarchPart = (MonarchPart)this.getMgrPart(MonarchPart.class);
                     monarchPart.addMonarch(itemModel.getSubclass(), model.getId());
                     CommonMsg.ItemInfo.Builder monarchBuilder = CommonMsg.ItemInfo.newBuilder();
                     monarchBuilder.setType(2);
                     monarchBuilder.setCode(-1);
                     monarchBuilder.setNum(model.getValue());
                     monarchBuilder.setId(model.getId());
                     this.addResourceMsgByBuilder(monarchBuilder);
                  }

                  if (itemModel.getTargetclass() == 8) {
                     PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
                     int oriNum = (Integer)playerExtend.cumulatives.getOrDefault(itemModel.getId(), 0);
                     playerExtend.cumulatives.put(itemModel.getId(), oriNum + model.getValue());
                     this.updatePlayerExtend(13);
                     cumulativeMap.put(itemModel.getId(), oriNum + model.getValue());
                  }

                  if (itemModel.getId() == ApplicationContextProvider.getConfigInt("SpecialMoneyId", 88888888)) {
                     this.getOperationMgr().addCoinNewLog(this, model.getValue(), this.getResourceNum(2, itemModel.getId()), (String)LogDefine.REASON_DEC_MAP.get(reason));
                     PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.getData("tb_player_recharge", this.getPlayerId());
                     playerRechargeDao.totalCoin += model.getValue();
                     playerRechargeDao.updateOp();
                     this.triggerTask(888, 0, (long)playerRechargeDao.totalCoin, 0);
                     PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.getMgrPart(PlayerRechargePart.class);
                     playerRechargePart.checkCoinTotalRecharge(model.getValue());
                  }

                  if (itemModel.getTargetclass() == 6) {
                     MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                     mergeActivityHeFuKuangHuanPart.updateGemRushRank(itemModel, model.getValue(), false);
                  }
                  break;
               case 3:
                  for(int i = 0; i < model.getValue(); ++i) {
                     heroList.add(model.getId());
                  }
            }
         }
      }

      this.notifyPlayerData(propertyList);
      this.sendCumulative(cumulativeMap);
      this.senditemUpdateMsg();
      if (!heroList.isEmpty()) {
         HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
         List<HeroDao> heroDaoList = heroBagPart.addHero(heroList, true, module, reason, useId, useNum, useCode);
         heroDaoList.forEach((heroDao) -> {
            CommonMsg.ItemInfo.Builder heroBuilder = CommonMsg.ItemInfo.newBuilder();
            heroBuilder.setType(3);
            heroBuilder.setCode(heroDao.code);
            heroBuilder.setNum(1);
            heroBuilder.setId(heroDao.id);
            heroBuilder.setStar(heroDao.getStar());
            this.addResourceMsgByBuilder(heroBuilder);
         });
         MonarchPart monarchPart = (MonarchPart)this.getMgrPart(MonarchPart.class);
         monarchPart.addHeroMonarch(heroList);
         monarchPart.addItemMonarch();
         Boolean haveKing = false;

         for(Integer heroId : heroList) {
            HeroModel heroModel = (HeroModel)this.gameModelPool.getEntity("hero", heroId);
            if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
               haveKing = true;
               break;
            }
         }

         if (haveKing) {
            heroBagPart.sendKingControlList();
         }
      }

   }

   public void additemUpdateBuilder(ItemBase itemBase) {
      this.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
   }

   public void senditemUpdateMsg() {
      if (this.itemUpdateBuilder.getItemsCount() > 0) {
         this.sendMsg(this.itemUpdateBuilder.build());
         this.itemUpdateBuilder.clear();
      }
   }

   public void addResourceMsg(ItemBase itemBase) {
      if (itemBase != null) {
         CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
         builder.setType(2);
         builder.setId(itemBase.id);
         builder.setCode(itemBase.code);
         builder.setNum(1);
         this.addBuilder.addItems(builder);
      }

   }

   public void addResourceMsgByBuilder(CommonMsg.ItemInfo.Builder builder) {
      if (builder.getId() != PlayerDefine.PLAYER_WARRIOR_SIGNET_TRACE) {
         this.addBuilder.addItems(builder);
      }
   }

   public void addResourceMsgByBuilder(List<CommonMsg.ItemInfo.Builder> list) {
      for(CommonMsg.ItemInfo.Builder builder : list) {
         if (builder.getId() != PlayerDefine.PLAYER_WARRIOR_SIGNET_TRACE) {
            this.addBuilder.addItems(builder);
         }
      }

   }

   public void addResourceMsg(List<ResourceModel> list) {
      for(ResourceModel resourceModel : list) {
         if (resourceModel.getType() > 0 && resourceModel.getId() > 0 && resourceModel.getId() != PlayerDefine.PLAYER_WARRIOR_SIGNET_TRACE) {
            CommonMsg.ItemInfo.Builder info_builder = CommonMsg.ItemInfo.newBuilder();
            info_builder.setType(resourceModel.getType());
            info_builder.setId(resourceModel.getId());
            info_builder.setCode(-1);
            info_builder.setNum(resourceModel.getValue());
            this.addBuilder.addItems(info_builder);
         }
      }

   }

   public void sendResourceMsg_OneKeyTakeMail() {
      if (!this.mailBuilder.getItemsBuilderList().isEmpty()) {
         this.mailBuilder.setShowType(PlayerMsg.ShowType.SHOW_TYPE_COMMON_NO_SORT);
         this.sendMsg(this.mailBuilder.build());
      }

      this.mailBuilder.clear();
   }

   public void sendResourceMsg() {
      this.sendResourceMsg(PlayerMsg.ShowType.SHOW_TYPE_COMMON, 0, "");
   }

   public void sendResourceMsg(PlayerMsg.ShowType showType) {
      this.sendResourceMsg(showType, 0, "");
   }

   public void sendResourceMsgForAssignHero(List<CommonMsg.ItemInfo.Builder> list) {
      for(CommonMsg.ItemInfo.Builder info_builder : list) {
         this.addBuilder.addItems(info_builder);
      }

      int oldLv = this.getPlayerDao().lv;
      this.addBuilder.setOldLv(oldLv);
      this.addBuilder.setShowType(PlayerMsg.ShowType.SHOW_TYPE_COMMON);
      this.sendMsg(this.addBuilder.build());
      this.addBuilder.clear();
   }

   public void clearAddBuilder() {
      this.addBuilder.clear();
   }

   public void sendResourceMsg(PlayerMsg.ShowType showType, int oldLv, String billNo, int... battleType) {
      this.addBuilder.setOldLv(oldLv);
      this.addBuilder.setBillNo(billNo);
      if (showType == PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW) {
         this.addBuilder.clear();
      } else if (showType != PlayerMsg.ShowType.SHOW_TYPE_MAIL_OKE_KEY_TAKE) {
         this.addBuilder.setShowType(showType);
         if (showType.getNumber() == 2) {
            if (battleType.length == 0) {
               throw new RuntimeException("请传入战斗类型");
            }

            this.addBuilder.setBattleType(battleType[0]);
         }

         if (this.addBuilder.getItemsCount() > 0) {
            this.sendMsg(this.addBuilder.build());
         }

         this.addBuilder.clear();
      } else {
         for(CommonMsg.ItemInfo.Builder builder : this.addBuilder.getItemsBuilderList()) {
            this.mailBuilder.addItems(builder);
         }

         this.addBuilder.clear();
      }
   }

   public void delItem(int id, long num, int module, int reason) {
      this.delResource(2, id, num, module, reason, 0, 0, "");
   }

   public void delResource(int type, int id, long num, int module, int reason, int useId, int useNum, String useCode) {
      if (num <= 0L) {
         logger.warn("玩家 {} 删除资源数量不对 type:{}, id:{}, num:{} module:{}, reason:{}", new Object[]{this.playerId, type, id, num, module, reason});
      } else {
         int delNum;
         if (num > 2147483647L) {
            delNum = Integer.MAX_VALUE;
            logger.warn("玩家一次性删除的资源数量过大，请检查是否发生错误 playerId:{} type:{} id:{} num:{}", new Object[]{this.playerId, type, id, num});
         } else {
            delNum = (int)num;
         }

         List<ResourceModel> list = new ArrayList();
         list.add(new ResourceModel(type, id, delNum));
         this.delResourcePrivate(list, module, reason, useId, useNum, useCode);
      }
   }

   public void delResource(ResourceModel resourceModel, int module, int reason, int useId, int useNum, String useCode) {
      List<ResourceModel> list = new ArrayList();
      list.add(resourceModel);
      this.delResourcePrivate(list, module, reason, useId, useNum, useCode);
   }

   public void delResource(List<ResourceModel> resourceModelList, int module, int reason, int useId, int useNum, String useCode) {
      this.delResourcePrivate(resourceModelList, module, reason, useId, useNum, useCode);
   }

   @TaskMethod
   public void delResourceByNum(int type, int id, int num, int module, int reason, int useId, int useNum, String useCode) {
      List<ResourceModel> list = new ArrayList();
      list.add(new ResourceModel(type, id, num));
      this.delResourcePrivate(list, module, reason, useId, useNum, useCode);
   }

   @TaskMethod
   public void delResourceByModel(ResourceModel resourceModel, int module, int reason, int useId, int useNum, String useCode) {
      List<ResourceModel> list = new ArrayList();
      list.add(resourceModel);
      this.delResourcePrivate(list, module, reason, useId, useNum, useCode);
   }

   @TaskMethod
   public void delResourceByList(List<ResourceModel> resourceModelList, int module, int reason, int useId, int useNum, String useCode) {
      this.delResourcePrivate(resourceModelList, module, reason, useId, useNum, useCode);
   }

   @TaskMethod
   public void delResourceAllNum(int type, int id, int module, int reason, int useId, int useNum, String useCode) {
      long val = 0L;
      if (type == 1) {
         val = this.getPlayerDao().getProperty(id);
      } else {
         if (type != 2) {
            logger.info("清除物品类型错误={}", type);
            return;
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);
         val = (long)itemBagPart.getItemNum(id);
      }

      if (val > 0L) {
         ResourceModel resourceModel = new ResourceModel(type, id, (int)val);
         this.delResource(resourceModel, module, reason, useId, useNum, useCode);
      }

   }

   private void delResourcePrivate(List<ResourceModel> resourceModels, int module, int reason, int useId, int useNum, String useCode) {
      Set<Integer> propertyList = new HashSet();
      List<Integer> heroList = new ArrayList();

      for(ResourceModel model : resourceModels) {
         switch (model.getType()) {
            case 1:
               this.modifyProperty(model.getId(), (long)(-model.getValue()), module, reason, useId, useNum, String.valueOf(useCode), false);
               propertyList.add(model.getId());
               break;
            case 2:
               ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemById(model.getId(), model.getValue(), module, reason, useId, useNum, useCode);
               break;
            case 3:
               if (model.getValue() > 1) {
                  logger.error("删除英雄个数大于1，code=" + model.getId() + ",num=" + model.getValue());
               }

               heroList.add(model.getId());
         }
      }

      if (!propertyList.isEmpty()) {
         this.notifyPlayerData(propertyList);
      }

      if (!heroList.isEmpty()) {
         HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
         boolean success = heroBagPart.deleteHero(heroList, HeroDefine.DelHeroType.DEL_USE, module, reason, useId, useNum, useCode);
         if (!success) {
            logger.info("删除武将失败 playerId:{} heroList:{}", this.getPlayerId(), heroList);
            return;
         }
      }

      this.senditemUpdateMsg();
      this.sendResourceMsg();
   }

   public void modifyProperty(int property, long value, int module, int reason, int misc1, int misc2, String misc3, boolean bSend) {
      PlayerDao playerDao = this.getPlayerDao();
      long ownNum = playerDao.getProperty(property);
      long tmp = ownNum + value;
      if (!playerDao.isLongType(property) && tmp > 2147483647L) {
         playerDao.setProperty(property, 2147483647L);
         PlayerProperty propertyModel = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", property);
         playerDao.updateOp();
         this.notifyPlayerData(property, playerDao.getProperty(property));
         LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "NumLimit");
         if (propertyModel != null) {
            this.failure(53, propertyModel.getName() + (languageModel == null ? "数量已达上限" : languageModel.getValue()));
         } else {
            this.failure(53, languageModel == null ? "数量已达上限" : languageModel.getValue());
         }

      } else if (property == PlayerDefine.PLAYER_LV) {
         logger.info("不能直接修改等级,玩家={}，修改={}", this.playerId, value);
      } else {
         if (property == PlayerDefine.PLAYER_EXP) {
            if (playerDao.lv >= this.getSystemLvLimit(1001)) {
               playerDao.exp = 0;
               playerDao.updateOp();
               return;
            }
         } else if (property == PlayerDefine.PLAYER_VIP_LV) {
            Map<Integer, VipModel> vipModelMap = ApplicationContextProvider.<Integer, VipModel>getModelPoolMap("vip");
            if (ownNum + value > (long)(vipModelMap.size() - 1)) {
               this.failure(26);
               return;
            }
         } else if (ownNum > 0L && value > 0L) {
            PlayerProperty playerProperty = (PlayerProperty)ApplicationContextProvider.getModelPoolEntity("playerProperty", property);
            if (playerProperty != null && playerProperty.getVipRight() == 1) {
               logger.info("{}已有特权,不需要再增加", this.getPlayerId());
               return;
            }
         }

         playerDao.modifyProperty(property, value);
         if (property == PlayerDefine.PLAYER_EXP) {
            this.playerUpgrade(module, reason, (int)value, misc2, misc3);
         } else if (property == PlayerDefine.PLAYER_UNION_CONTRIBUTION) {
            if (value > 0L && playerDao.unionId > 0 && reason != 927) {
               UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
               unionMgrParent.pushTask(() -> {
                  UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
                  if (unionMgr != null) {
                     unionMgr.recordContribution(this.getPlayerId(), (int)value);
                  }
               });
            }
         } else if (property == PlayerDefine.PLAYER_INFOMATION) {
            BattleChapterDao battleChapterDao = (BattleChapterDao)this.getData("tb_battle_chapter", this.playerId);
            int chapterId = battleChapterDao.chapterId;
            if (battleChapterDao.chapterId == 0) {
               chapterId = 1;
            }

            ChapterModel chapterModel = (ChapterModel)this.getGameModelPool().getEntity("chapter", chapterId);
            if (playerDao.getProperty(property) > (long)chapterModel.getAdventureMax()) {
               playerDao.setProperty(property, (long)chapterModel.getAdventureMax());
            }
         } else if (property == PlayerDefine.PLAYER_HERO_RAISE_INTEGRAL) {
            if (value > 0L) {
               HeroRaisePart heroRaisePart = (HeroRaisePart)this.getMgrPart(HeroRaisePart.class);
               heroRaisePart.checkUpgrade((List)null);
            }
         } else if (property == PlayerDefine.PLAYER_VIP_EXP) {
            if (value > 0L) {
               PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.getMgrPart(PlayerRechargePart.class);
               int totalRecharge = playerRechargePart.getRealTotalRecharge();
               this.operationMgr.addVipNewLog(this, 18, playerDao.vip_lv, (int)value, playerDao.vip_exp, totalRecharge);
               VipPart vipPart = (VipPart)this.getMgrPart(VipPart.class);
               vipPart.checkLvUp();
            }
         } else if (property == PlayerDefine.PLAYER_PR_TRANSPORT) {
            WaterTransportPart waterTransportPart = (WaterTransportPart)this.getMgrPart(WaterTransportPart.class);
            waterTransportPart.privilegeAddition();
         } else if (property == PlayerDefine.PLAYER_ACTIVE) {
            if (value > 0L) {
               this.triggerTask(377, 0, value, 1);
               DemonActivityPart demonActivityPart = (DemonActivityPart)this.getMgrPart(DemonActivityPart.class);
               demonActivityPart.recordActive((int)value);
               DemonRotatePart demonRotatePart = (DemonRotatePart)this.getMgrPart(DemonRotatePart.class);
               demonRotatePart.recordActive((int)value);
            }
         } else if (property == PlayerDefine.PLAYER_PR_MINE) {
            this.uploadCrossPlayer();
         } else if (property == PlayerDefine.PLAYER_GOLD) {
            AnniversaryCelebrationPart celebrationPart = (AnniversaryCelebrationPart)this.getMgrPart(AnniversaryCelebrationPart.class);
            celebrationPart.countConsume(value);
         }

         this.logItem(property, playerDao.getProperty(property), value, module, reason, misc1, misc2, misc3);
         if (value > 0L || reason != 3901 && reason != 1904 && reason != 2204 && reason != 101) {
            this.addOperationLog(property, playerDao.getProperty(property), value, reason, "");
         } else {
            this.addOperationLog(property, playerDao.getProperty(property), value, reason, misc1 + "-" + misc2 + "-" + misc3);
         }

         if (this.isNeedAddTask(reason)) {
            if (value < 0L) {
               this.triggerTask(532, property, Math.abs(value), 1);
            } else if (value > 0L) {
               this.triggerTask(533, property, value, 1);
            }
         }

         if (bSend) {
            this.notifyPlayerData(property, playerDao.getProperty(property));
         }

      }
   }

   public boolean isNeedAddTask(int reason) {
      switch (reason) {
         case 413:
         case 1206:
         case 1217:
         case 5009:
         case 5603:
            return false;
         default:
            return true;
      }
   }

   private void playerUpgrade(int module, int reason, int misc1, int misc2, String misc3) {
      PlayerDao playerDao = this.getPlayerDao();
      int preLv = playerDao.lv;

      while(this.lvUp() != 0) {
      }

      int newLv = playerDao.lv;
      if (newLv != preLv) {
         this.notifyPlayerData(PlayerDefine.PLAYER_LV, newLv);
         int gold = 0;

         for(int i = preLv; i < newLv; ++i) {
            UpgradeModel upgradeModel = (UpgradeModel)this.getGameModelPool().getEntity("upgrade", i);
            gold += upgradeModel.getLevelUpReward();
         }

         this.addResource(1, PlayerDefine.PLAYER_GOLD, gold, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 13, 1305, 0, 0, "");
         this.triggerTask(201, 0, (long)newLv, 0);
         this.checkInit_PARTS_SORTED_LOGIN_PRIORITY();

         for(PlayerPart playerPart : this.PARTS_SORTED_LOGIN_PRIORITY) {
            try {
               playerPart.levelUp(preLv, newLv);
            } catch (Exception e) {
               logger.error("【{}】升级处理出错,{}", new Object[]{playerPart.getClass().getSimpleName(), e.getMessage(), e});
            }
         }

         List<Integer> lvUpSystemSend = this.configManager.getIntList("lvUpSystemSend");
         if (lvUpSystemSend == null || lvUpSystemSend.size() < 4) {
            lvUpSystemSend = new ArrayList();
            lvUpSystemSend.add(40);
            lvUpSystemSend.add(2);
            lvUpSystemSend.add(1078);
            lvUpSystemSend.add(100);
         }

         int lvUpSystemSend_lv = (Integer)lvUpSystemSend.get(0);
         if (preLv < lvUpSystemSend_lv && newLv == lvUpSystemSend_lv) {
            this.addResource((Integer)lvUpSystemSend.get(1), (Integer)lvUpSystemSend.get(2), (Integer)lvUpSystemSend.get(3), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, -1, 1305, preLv, newLv, "40级发放道具");
         }

         if (preLv < 82 && newLv >= 82) {
            List<ResourceModel> addList = new ArrayList();
            addList.add(new ResourceModel(2, 1036, 5));
            addList.add(new ResourceModel(2, 1037, 1));
            addList.add(new ResourceModel(2, 61001, 1));
            this.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, -1, 1305, preLv, newLv, "82级引导");
         }

         this.uploadCrossPlayer();
         this.logItem(PlayerDefine.PLAYER_LV, (long)newLv, (long)(newLv - preLv), module, reason, misc1, preLv, misc3);
      }

      this.notifyPlayerData(PlayerDefine.PLAYER_EXP, playerDao.exp);
   }

   private int lvUp() {
      PlayerDao playerDao = this.getPlayerDao();
      UpgradeModel upgradeModel = (UpgradeModel)this.getGameModelPool().getEntity("upgrade", playerDao.lv);
      if (upgradeModel == null) {
         return 0;
      } else {
         int playerLvLimit = this.getSystemLvLimit(1001);
         if (playerDao.lv >= playerLvLimit) {
            if (playerDao.exp > upgradeModel.getPlayerExp()) {
               playerDao.exp = upgradeModel.getPlayerExp();
               playerDao.updateOp();
            }

            return 0;
         } else if (playerDao.exp < upgradeModel.getPlayerExp()) {
            return 0;
         } else {
            playerDao.exp -= upgradeModel.getPlayerExp();
            ++playerDao.lv;
            if (playerDao.lv >= playerLvLimit) {
               playerDao.exp = 0;
            }

            playerDao.updateOp();
            this.operationMgr.addUpLevelLog(this);
            return 1;
         }
      }
   }

   public void updateProperty(int property, long value, int module, int reason, int misc1, int misc2, String misc3) {
      PlayerDao playerDao = this.getPlayerDao();
      playerDao.setProperty(property, value);
      this.logItem(property, playerDao.getProperty(property), value, module, reason, misc1, misc2, misc3);
      this.notifyPlayerData(property, value);
   }

   public void notifyPlayerData(Set<Integer> propertyList) {
      if (!propertyList.isEmpty()) {
         PlayerDao playerDao = this.getPlayerDao();
         PlayerMsg.S2C_UpdatePlayerData_2003.Builder builder = PlayerMsg.S2C_UpdatePlayerData_2003.newBuilder();

         for(Integer property : propertyList) {
            PlayerMsg.PropertyCell.Builder dataBuilder = PlayerMsg.PropertyCell.newBuilder();
            dataBuilder.setProperty(property);
            dataBuilder.setValue(String.valueOf(playerDao.getProperty(property)));
            builder.addDatas(dataBuilder);
         }

         this.sendMsg(builder.build());
      }
   }

   public void sendCumulative(Map<Integer, Integer> cumulativeMap) {
      if (!CollectionUtils.isEmpty(cumulativeMap)) {
         BagMsg.S2C_UpdateCumulative_3208.Builder builder = BagMsg.S2C_UpdateCumulative_3208.newBuilder();

         for(Map.Entry<Integer, Integer> entry : cumulativeMap.entrySet()) {
            CommonMsg.MapDataII.Builder data = CommonMsg.MapDataII.newBuilder();
            data.setKey((Integer)entry.getKey());
            data.setValue((Integer)entry.getValue());
            builder.addValues(data);
         }

         this.sendMsg(builder.build());
      }
   }

   @TaskMethod
   public void notifyPlayerData(int property, int value) {
      PlayerMsg.S2C_UpdatePlayerData_2003.Builder builder = PlayerMsg.S2C_UpdatePlayerData_2003.newBuilder();
      PlayerMsg.PropertyCell.Builder dataBuilder = PlayerMsg.PropertyCell.newBuilder();
      dataBuilder.setProperty(property);
      dataBuilder.setValue(String.valueOf(value));
      builder.addDatas(dataBuilder);
      this.sendMsg(builder.build());
   }

   public void notifyPlayerData(int property, String value) {
      PlayerMsg.S2C_UpdatePlayerData_2003.Builder builder = PlayerMsg.S2C_UpdatePlayerData_2003.newBuilder();
      PlayerMsg.PropertyCell.Builder dataBuilder = PlayerMsg.PropertyCell.newBuilder();
      dataBuilder.setProperty(property);
      dataBuilder.setValue(value);
      dataBuilder.setType(PlayerMsg.ValType.VALTYPE_STRING);
      builder.addDatas(dataBuilder);
      this.sendMsg(builder.build());
   }

   public void notifyPlayerData(int property, long value) {
      PlayerMsg.S2C_UpdatePlayerData_2003.Builder builder = PlayerMsg.S2C_UpdatePlayerData_2003.newBuilder();
      PlayerMsg.PropertyCell.Builder dataBuilder = PlayerMsg.PropertyCell.newBuilder();
      dataBuilder.setProperty(property);
      dataBuilder.setValue(String.valueOf(value));
      dataBuilder.setType(PlayerMsg.ValType.VALTYPE_INT64);
      builder.addDatas(dataBuilder);
      this.sendMsg(builder.build());
   }

   private void logItem(int property, long num, long chValue, int module, int reason, int misc1, int misc2, String misc3) {
      PropertyLog log = new PropertyLog();
      PlayerDao playerDao = this.getPlayerDao();
      log.playerId = this.getPlayerId();
      log.playerName = playerDao.playerName;
      log.property = property;
      log.chValue = chValue;
      log.finalValue = num;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.logMgr.pushTask(() -> this.logMgr.addLog(log));
   }

   private void addOperationLog(int property, long num, long chValue, int reasonId, String desc) {
      if (LogDefine.REASON_DEC_MAP.containsKey(reasonId)) {
         String reason = (String)LogDefine.REASON_DEC_MAP.get(reasonId);
         int oldLogId = 0;
         int newLogId = 0;
         if (property == PlayerDefine.PLAYER_GOLD) {
            if (chValue > 0L) {
               oldLogId = 1;
               newLogId = 23;
            } else {
               oldLogId = 2;
               newLogId = 19;
            }

            this.operationMgr.addMoneyLog(this, oldLogId, Math.abs(chValue), num, reason);
            this.operationMgr.addMoneyNewLog(this, newLogId, Math.abs(chValue), num, reason, desc);
         } else if (property == PlayerDefine.PLAYER_COPPER) {
            if (chValue > 0L) {
               oldLogId = 3;
               newLogId = 24;
            } else {
               oldLogId = 4;
               newLogId = 20;
            }

            this.operationMgr.addMoneyLog(this, oldLogId, Math.abs(chValue), num, reason);
            this.operationMgr.addMoneyNewLog(this, newLogId, Math.abs(chValue), num, reason, desc);
         } else if (property == PlayerDefine.PLAYER_HERO_EXP) {
            if (chValue > 0L) {
               newLogId = 28;
            } else {
               newLogId = 31;
            }

            this.operationMgr.addHeroExpNewLog(this, newLogId, Math.abs(chValue), num, reason);
         } else if (property == PlayerDefine.PLAYER_UNION_CONTRIBUTION) {
            if (chValue > 0L) {
               newLogId = 27;
            } else {
               newLogId = 30;
            }

            this.operationMgr.addUnionNewLog(this, newLogId, Math.abs(chValue), num, reason);
         } else if (property != PlayerDefine.PLAYER_DIAMOND && property != PlayerDefine.PLAYER_DIAMOND_CHIP) {
            if (chValue > 0L) {
               oldLogId = 7;
               newLogId = 1;
            } else {
               oldLogId = 8;
               newLogId = 2;
            }

            this.operationMgr.addItemLog(this, oldLogId, property, Math.abs(chValue), reason);
            this.operationMgr.addItemNewLog(this, newLogId, property, Math.abs(chValue), num, reason);
         } else {
            if (chValue > 0L) {
               newLogId = 26;
            } else {
               newLogId = 22;
            }

            desc = property == PlayerDefine.PLAYER_DIAMOND ? "星钻" : "绑定星钻";
            this.operationMgr.addMoneyNewLog(this, newLogId, Math.abs(chValue), num, reason, desc);
         }

      }
   }

   public long getPlayerCombatPower() {
      return this.getPublicDao().combat_power;
   }

   public long getMaxPlayerCombatPower() {
      if (this.maxPlayerCombatPower <= 0L) {
         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         this.maxPlayerCombatPower = playerExtend.highestPower;
      }

      return this.maxPlayerCombatPower;
   }

   public void flushPlayerCombatPower(String model, long playerCombatPower) {
      this.notifyPlayerData(PlayerDefine.PLAYER_COMBAT_POWER_101, playerCombatPower);
      PlayerDao playerDao = this.getPlayerDao();
      playerDao.combat_power = playerCombatPower;
      playerDao.updateOp();
      this.triggerTask(216, 0, playerCombatPower, 0);
      this.triggerTask(10001, 1, playerCombatPower, 0);
      if (this.maxPlayerCombatPower <= 0L) {
         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         this.maxPlayerCombatPower = playerExtend.highestPower;
      }

      if (this.maxPlayerCombatPower < playerCombatPower) {
         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         playerExtend.highestPower = playerCombatPower;
         this.updatePlayerExtend(13);
         if (!this.isRobot) {
            RankPart rankPart = (RankPart)this.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.COMBAT_POWER, playerCombatPower, false);
            this.rankMgr.pushTaskEx("checkRankReward", new Object[]{this.getPlayerId(), 3, playerCombatPower});
         }

         this.maxPlayerCombatPower = playerCombatPower;
         this.notifyPlayerData(PlayerDefine.PLAYER_HIGHEST_POWER, this.maxPlayerCombatPower);
      }

      if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_POWER) > 0) {
         RankPart rankPart = (RankPart)this.getMgrPart(RankPart.class);
         rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_POWER, playerCombatPower, true);
      }

   }

   public HeroDao getHeroOfMaxCombatPower() {
      HeroDao maxCombatPowerHero = null;
      Map<Integer, HeroDao> map = this.<Integer, HeroDao>getMap("tb_hero_bag", this.playerId);

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         if (maxCombatPowerHero == null) {
            maxCombatPowerHero = (HeroDao)entry.getValue();
         } else if (((HeroDao)entry.getValue()).combatPower > maxCombatPowerHero.combatPower) {
            maxCombatPowerHero = (HeroDao)entry.getValue();
         }
      }

      return maxCombatPowerHero;
   }

   public TaskData getTask(TaskDefine.TaskModule module, int taskId) {
      return (TaskData)this.getTasksMap(module).get(taskId);
   }

   public Map<Integer, TaskData> getTasksMap(TaskDefine.TaskModule module) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.getCustomCache("tb_task", this.getPlayerId());
      return taskCustomCache.getMap(module);
   }

   @TaskMethod
   public void triggerTask(int targetType, int targetX, long opValue, int opType) {
      GlobalTaskPart globalTaskPart = (GlobalTaskPart)this.getMgrPart(GlobalTaskPart.class);
      globalTaskPart.triggerTask(targetType, targetX, (long)Long.valueOf(opValue).intValue(), opType);
   }

   public <T> T getPlayerExtend(int moduleId) {
      PlayerExtendDao<T> playerExtendDao = (PlayerExtendDao)this.gameCachePool.getData("tb_player_extend", new Object[]{this.playerId, moduleId});

      assert playerExtendDao != null;

      if (playerExtendDao.value == null) {
         playerExtendDao.loadValue("");
         this.updatePlayerExtend(moduleId);
      }

      return playerExtendDao.value;
   }

   public BattlePKTeam getBattleTeam(CommonMsg.HeroState heroState, Map<Byte, List<PropertyModel>> compensateMap) {
      ArrayingMirror playerArraying = this.getPlayerArraying(heroState);
      PlayerPublicDao publicDao = this.getPublicDao();
      return new BattlePKTeam(this.playerId, publicDao.playerName, playerArraying, publicDao.lv, publicDao.head, publicDao.headFrame, compensateMap);
   }

   public <T> void updatePlayerExtend(int moduleId) {
      PlayerExtendDao<T> playerExtendDao = (PlayerExtendDao)this.gameCachePool.getData("tb_player_extend", new Object[]{this.playerId, moduleId});

      assert playerExtendDao != null;

      playerExtendDao.updateOp();
   }

   public ArrayingMirror getPlayerArraying(CommonMsg.HeroState arrayingType) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.getMgrPart(HeroArrayingPart.class);
      return heroArrayingPart.getArrayingMirrorByType(arrayingType);
   }

   public ArrayingMirror getPlayerSpecialArraying(CommonMsg.HeroState arrayingType, List<CommonMsg.CodeType> removeList) {
      return new ArrayingMirror(this, arrayingType, removeList);
   }

   public static int countRate(List<KeyValFun> list) {
      if (list != null && !list.isEmpty()) {
         int maxRate = 0;

         for(KeyValFun fun : list) {
            if (fun.getVal() > 0) {
               maxRate += fun.getVal();
            }
         }

         if (maxRate == 0) {
            return -1;
         } else {
            int randInt = misc.RandomUtil.randInt(maxRate);

            for(KeyValFun fun : list) {
               if (fun.getVal() > 0) {
                  if (randInt < fun.getVal()) {
                     return fun.getKey();
                  }

                  randInt -= fun.getVal();
               }
            }

            return ((KeyValFun)list.get(0)).getKey();
         }
      } else {
         return -1;
      }
   }

   private boolean checkSelf(String tableName, Object... args) {
      if (args.length != 0 && (Integer)args[0] == this.playerId) {
         return true;
      } else {
         (new Exception("获取了非本玩家的数据" + tableName)).printStackTrace();
         return false;
      }
   }

   public synchronized <K, V> Map<K, V> getMap(String tableName, Object... args) {
      return this.checkSelf(tableName, args) ? this.gameCachePool.getMap(tableName, args) : null;
   }

   public synchronized <V> List<V> getList(String tableName, Object... args) {
      return this.checkSelf(tableName, args) ? this.gameCachePool.getList(tableName, args) : null;
   }

   public synchronized <V> V getData(String tableName, Object... args) {
      return (V)(this.checkSelf(tableName, args) ? this.gameCachePool.getData(tableName, args) : null);
   }

   public synchronized <V> V getDataNoInsert(String tableName, Object... args) {
      return (V)(this.checkSelf(tableName, args) ? this.gameCachePool.getDataNoInsert(tableName, args) : null);
   }

   public synchronized <T extends CustomCacheData> T getCustomCache(String tableName, Object... args) {
      return (T)(this.checkSelf(tableName, args) ? this.gameCachePool.getCustomCache(tableName, args) : null);
   }

   public <K, V> void insertDao(V dao) {
      this.gameCachePool.insertDao(dao, false);
   }

   public <V> void insertDao(V dao, boolean sync) {
      this.gameCachePool.insertDao(dao, sync);
   }

   public <V> void deleteDao(V dao, boolean sync) {
      this.gameCachePool.deleteDao(dao, sync);
   }

   public <V> void updateDao(V dao, boolean sync) {
      this.gameCachePool.updateDao(dao, sync);
   }

   public void sendWorldLv() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int worldLv = worldMgr.getWorldLv();
      PlayerMsg.S2C_WorldLv_2010 msg = PlayerMsg.S2C_WorldLv_2010.newBuilder().setWorldLv(worldLv).build();
      this.sendMsg(msg);
   }

   public String getIpProvince() {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      ProvinceNameModel provinceNameModel = (ProvinceNameModel)this.getGameModelPool().getEntity("provinceName", playerExtend.provinceId);
      if (provinceNameModel == null) {
         int defaultPrivinceId = this.getDefaultProvinceId();
         provinceNameModel = (ProvinceNameModel)ApplicationContextProvider.getModelPoolEntity("provinceName", defaultPrivinceId);
         if (provinceNameModel == null) {
            return "未知";
         }

         playerExtend.provinceId = provinceNameModel.getId();
         this.updatePlayerExtend(13);
      }

      return provinceNameModel.getName();
   }

   public String getIpCity() {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      CityNameModel cityNameModel = (CityNameModel)this.getGameModelPool().getEntity("cityName", playerExtend.cityId);
      if (cityNameModel == null) {
         ProvinceNameModel provinceNameModel = (ProvinceNameModel)ApplicationContextProvider.getModelPoolEntity("provinceName", playerExtend.provinceId);
         if (provinceNameModel == null) {
            logger.error("玩家 {} 获取不到城市", this.playerId);
            return "未知";
         } else {
            List<CityNameModel> cityNameModelList = (List)this.getGameModelPool().getEntity("customCityName", playerExtend.provinceId);
            if (CollectionUtils.isEmpty(cityNameModelList)) {
               logger.error("玩家 {} 获取不到城市,cityNameModelList为空", this.playerId);
               return "未知";
            } else {
               return ((CityNameModel)cityNameModelList.get(0)).getName();
            }
         }
      } else {
         return cityNameModel.getName();
      }
   }

   public String getIpAttribution() {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      return "".equals(playerExtend.ipAttributionByGm) ? playerExtend.ipAttribution : playerExtend.ipAttributionByGm;
   }

   public String getProvinceOfIpAttribution() {
      String ipAttribution = this.getIpAttribution();
      String province = "";
      String[] strArr = ipAttribution.split(" ");
      if (strArr.length >= 2) {
         province = strArr[1];
      }

      return province;
   }

   @TaskMethod
   public void setIpAttributionByGm(String ipAttribution) {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      playerExtend.ipAttributionByGm = ipAttribution;
      this.updatePlayerExtend(13);
   }

   public void setIpProvince(int provinceId, int cityId) {
      ProvinceNameModel provinceNameModel = (ProvinceNameModel)this.getGameModelPool().getEntity("provinceName", provinceId);
      if (provinceNameModel == null) {
         provinceId = this.getDefaultProvinceId();
         provinceNameModel = (ProvinceNameModel)this.getGameModelPool().getEntity("provinceName", provinceId);
         List<CityNameModel> cityNameModelList = (List)this.getGameModelPool().getEntity("customCityName", provinceNameModel.getId());
         if (!CollectionUtils.isEmpty(cityNameModelList)) {
            cityId = ((CityNameModel)cityNameModelList.get(0)).getId();
         }
      }

      CityNameModel cityNameModel = (CityNameModel)this.getGameModelPool().getEntity("cityName", cityId);
      if (cityNameModel == null || cityNameModel != null && cityNameModel.getProvinceId() != provinceId) {
         List<CityNameModel> cityNameModelList = (List)this.getGameModelPool().getEntity("customCityName", provinceId);
         if (!CollectionUtils.isEmpty(cityNameModelList)) {
            cityNameModel = (CityNameModel)cityNameModelList.get(0);
         }
      }

      if (provinceNameModel != null && cityNameModel != null) {
         PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
         playerExtend.ipProvince = provinceNameModel.getName();
         playerExtend.ipCity = cityNameModel.getName();
         playerExtend.provinceId = provinceNameModel.getId();
         playerExtend.cityId = cityNameModel.getId();
         playerExtend.areaId = this.getAreaIdByModel(provinceNameModel);
         this.updatePlayerExtend(13);
         logger.info("playerId:{} 省份：{} 城市：{} 地区:{}", new Object[]{this.playerId, provinceNameModel.getName(), cityNameModel.getName(), playerExtend.areaId});
      }
   }

   public boolean isSystemOpen(int systemId) {
      SystemFunctionModel model = (SystemFunctionModel)this.getGameModelPool().getEntity("systemFunction", systemId);
      if (model == null) {
         return false;
      } else {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         int worldLv = worldMgr.getWorldLv();
         PlayerPublicDao playerDao = this.getPublicDao();
         if (model.getHeroLvRequest() > 0) {
            PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
            if (playerExtend.heroHighestLv < model.getHeroLvRequest()) {
               return false;
            }
         }

         if (model.getLvLimitEx() > 0 && playerDao.lv >= model.getLvLimitEx()) {
            return true;
         } else if (this.checkChangeSystemOpen(systemId)) {
            return true;
         } else {
            switch (systemId) {
               default:
                  if (playerDao.lv >= model.getOpenLevel() && worldLv >= model.getWorldLevel()) {
                     if (model.getChapterId() > 0) {
                        BattleChapterDao battleChapterDao = (BattleChapterDao)this.getData("tb_battle_chapter", this.playerId);
                        if (battleChapterDao.chapterId < model.getChapterId()) {
                           return false;
                        }
                     }

                     if (systemId == 2000) {
                        LadderPart ladderPart = (LadderPart)this.getMgrPart(LadderPart.class);
                        return ladderPart.isOpen();
                     } else {
                        if (systemId == 6330 || systemId == 6340 || systemId == 6341 || systemId == 6400) {
                           if (!GodBeastDefine.isPlatformOpen()) {
                              return false;
                           }

                           if (systemId == 6340 || systemId == 6341 || systemId == 6400) {
                              GodBeastPart godBeastPart = (GodBeastPart)this.getMgrPart(GodBeastPart.class);
                              if (!godBeastPart.checkNoticeAllUnlock()) {
                                 return false;
                              }
                           }
                        }

                        if (model.getAfterMergeVersionsOpen() > 0 && !this.isAfterMerge()) {
                           return false;
                        } else {
                           int openServerDays = worldMgr.getOpenServerDays();
                           return model.getOpenDay() <= 0 || openServerDays >= model.getOpenDay();
                        }
                     }
                  } else {
                     return false;
                  }
            }
         }
      }
   }

   public boolean checkChangeSystemOpen(int systemId) {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      int oldOpenLv = 0;
      if (systemId != 3002 && systemId != 3005) {
         if (systemId != 5020 && systemId != 5010) {
            if (systemId != 3940) {
               return false;
            }

            oldOpenLv = this.configManager.getIntDefault("strengthOldOpenLv", 170);
         } else {
            oldOpenLv = this.configManager.getIntDefault("runeOldOpenLv", 170);
         }
      } else {
         oldOpenLv = this.configManager.getIntDefault("warHorseOldOpenLv", 150);
         FairylandPart fairylandPart = (FairylandPart)this.getMgrPart(FairylandPart.class);
         if (fairylandPart.isOpen()) {
            return true;
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.getMgrPart(HeroBagPart.class);
         if (heroBagPart.isHaveWarHorse()) {
            return true;
         }

         WarHorsePart warHorsePart = (WarHorsePart)this.getMgrPart(WarHorsePart.class);
         if (warHorsePart.isHaveWarHorseInBag()) {
            return true;
         }
      }

      return playerExtend.tempPlayerLv >= oldOpenLv;
   }

   public boolean isAfterMerge() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      return worldMgr.getServersSet().size() > 1;
   }

   public List<Integer> getAreaInfo() {
      List<Integer> list = new ArrayList();
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      ProvinceNameModel provinceNameModel = (ProvinceNameModel)this.getGameModelPool().getEntity("provinceName", playerExtend.provinceId);
      if (provinceNameModel == null) {
         int defaultProvinceId = this.getDefaultProvinceId();
         provinceNameModel = (ProvinceNameModel)this.getGameModelPool().getEntity("provinceName", defaultProvinceId);
         if (provinceNameModel == null) {
            (new Exception("省份配置表 provinceName.xls 错误")).printStackTrace();
            return null;
         }
      }

      int areaId = this.getAreaIdByModel(provinceNameModel);
      list.add(areaId);
      list.add(provinceNameModel.getId());
      CityNameModel cityNameModel = (CityNameModel)this.getGameModelPool().getEntity("cityName", playerExtend.cityId);
      if (cityNameModel != null && cityNameModel.getProvinceId() == playerExtend.provinceId) {
         list.add(playerExtend.cityId);
      } else {
         List<CityNameModel> cityNameModelList = (List)this.getGameModelPool().getEntity("customCityName", playerExtend.provinceId);
         list.add(((CityNameModel)cityNameModelList.get(0)).getId());
      }

      return list;
   }

   public int getAreaId() {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      return playerExtend.areaId;
   }

   @MsgHandlerAnno
   public void C2S_PlayerStory_2019(PlayerMsg.C2S_PlayerStory_2019 msg, String source) {
      this.updateStory(msg.getStoryId());
   }

   public void sendOldSystemOpen() {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      if (playerExtend.tempPlayerLv < 0) {
         playerExtend.tempPlayerLv = this.getPlayerDao().lv;
         this.updatePlayerExtend(13);
      }

      PlayerMsg.S2C_SystemOpen_2064.Builder builder = PlayerMsg.S2C_SystemOpen_2064.newBuilder();
      if (this.checkChangeSystemOpen(5020)) {
         builder.addSystemId(5020);
      }

      if (this.checkChangeSystemOpen(3002)) {
         builder.addSystemId(3002);
      }

      if (this.checkChangeSystemOpen(3940)) {
         builder.addSystemId(3940);
      }

      this.sendMsg(builder.build());
   }

   public void updateStory(int storyId) {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      playerExtend.storyId = storyId;
      this.updatePlayerExtend(13);
      PlayerMsg.S2C_PlayerStory_2020.Builder builder = PlayerMsg.S2C_PlayerStory_2020.newBuilder();
      builder.setStoryId(playerExtend.storyId);
      this.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_UpdatePlayerGuide_2021(PlayerMsg.C2S_UpdatePlayerGuide_2021 msg, String source) {
      int guideStep = msg.getStep();
      this.updateGuideStep(guideStep);
   }

   public void updateGuideStep(int guideStep) {
      if (guideStep > 0) {
         Map<Integer, GuideSectionModel> guideSectionModelMap = ApplicationContextProvider.<Integer, GuideSectionModel>getModelPoolMap("guideSection1");
         if (!guideSectionModelMap.containsKey(guideStep)) {
            log.info("前端更新的引导id不存在 guideStep:{}", guideStep);
         } else {
            PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
            playerExtend.guideStep = guideStep;
            this.updatePlayerExtend(13);
            PlayerMsg.S2C_UpdatePlayerGuideResult_2022.Builder builder = PlayerMsg.S2C_UpdatePlayerGuideResult_2022.newBuilder();
            builder.setStep(playerExtend.guideStep);
            this.sendMsg(builder.build());
         }
      }
   }

   public void removeGuideStep(int guideStep) {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      if (playerExtend.guideIds.contains(guideStep)) {
         playerExtend.guideIds.remove(guideStep);
      }

      this.updatePlayerExtend(13);
   }

   public void runTest(String key) {
      logger.info("GM测试方法");
      String[] keys = key.split(",");
      switch (keys[0]) {
         case "worldmail":
            MailWorldMgr mailWorldMgr = (MailWorldMgr)ApplicationContextProvider.getContext().getBean(MailWorldMgr.class);
            mailWorldMgr.serverMailTest();
            break;
         case "artifact":
            ArtifactPart artifactPart = (ArtifactPart)this.getMgrPart(ArtifactPart.class);
            switch (keys[1]) {
               case "1":
                  artifactPart.superArtifact();
                  return;
               default:
                  return;
            }
         case "king":
            KingOfCentralPlainsMgr kingOfCentralPlainsMgr = (KingOfCentralPlainsMgr)ApplicationContextProvider.getContext().getBean(KingOfCentralPlainsMgr.class);
            switch (keys[1]) {
               case "1":
                  kingOfCentralPlainsMgr.activityStart(true, false);
                  return;
               case "2":
                  kingOfCentralPlainsMgr.testClear();
                  return;
               case "3":
               default:
                  return;
               case "4":
                  kingOfCentralPlainsMgr.S2C_RoundAndState_9650(this);
                  return;
               case "5":
                  kingOfCentralPlainsMgr.clearPlayerGuessInfo(this);
                  return;
               case "6":
                  kingOfCentralPlainsMgr.S2C_ActivityState_9652(this);
                  return;
               case "7":
                  kingOfCentralPlainsMgr.activityStart(true, true);
                  return;
               case "9":
                  kingOfCentralPlainsMgr.rankreward();
                  return;
               case "10":
                  kingOfCentralPlainsMgr.C2S_PlayerKCPSettle_9661(this);
                  return;
            }
         case "country":
            CountryWarPart countryWarPart = (CountryWarPart)this.getMgrPart(CountryWarPart.class);
            CountryWarMgr countryWarMgr = (CountryWarMgr)ApplicationContextProvider.getContext().getBean(CountryWarMgr.class);
            switch (keys[1]) {
               case "1":
                  countryWarPart.C2S_MainUi_11301();
                  return;
               case "2":
               case "3":
               case "4":
               case "5":
               case "6":
               default:
                  return;
               case "7":
                  countryWarPart.C2S_OpenScoreRewardUi_11343((CountryWarMsg.C2S_OpenScoreRewardUi_11343)null, "");
                  return;
               case "8":
                  countryWarPart.C2S_OpenTurnTableUi_11361((CountryWarMsg.C2S_OpenTurnTableUi_11361)null, "");
                  return;
               case "9":
                  countryWarPart.C2S_TakeScoreTask_11345((CountryWarMsg.C2S_TakeScoreTask_11345)null, "");
                  return;
               case "10":
                  countryWarPart.C2S_OpenFlagTaskUi_11347((CountryWarMsg.C2S_OpenFlagTaskUi_11347)null, "");
                  return;
               case "11":
                  countryWarPart.C2S_TakeCityReward_11341((CountryWarMsg.C2S_TakeCityReward_11341)null, "");
                  return;
               case "12":
                  ShopPart shopPart = (ShopPart)this.getMgrPart(ShopPart.class);
                  shopPart.handleSendShopData(19, 2);
                  return;
            }
         case "talent":
            HeroTalentPart heroTalentPart = (HeroTalentPart)this.getMgrPart(HeroTalentPart.class);
            switch (keys[1]) {
               case "1":
                  heroTalentPart.C2S_ActivateTalent_5221();
                  return;
               default:
                  return;
            }
         case "herocomment":
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            worldMgr.testHeroComment(Integer.parseInt(keys[1]));
            break;
         case "handleexp":
            int exp = Integer.parseInt(keys[1]);
            if (exp <= 0) {
               return;
            }

            PlayerDao playerDao = this.getPlayerDao();
            int curExp = playerDao.exp;
            int curLv = playerDao.lv;
            int protect_count = 0;
            logger.info("玩家={}，扣除经验={}, 当前等级={},当前经验={}", new Object[]{this.getPlayerId(), exp, curLv, curExp});

            while(exp > 0) {
               int min = Math.min(curExp, exp);
               curExp -= exp;
               exp -= min;
               if (curExp < 0) {
                  UpgradeModel prevLvModel = (UpgradeModel)ApplicationContextProvider.getModelPoolEntity("upgrade", curLv - 1);
                  if (prevLvModel == null) {
                     curExp = 0;
                     break;
                  }

                  --curLv;
                  curExp = prevLvModel.getPlayerExp();
               }

               ++protect_count;
               if (protect_count > 9999) {
                  break;
               }
            }

            if (playerDao.lv != curLv) {
               playerDao.lv = curLv;
               playerDao.updateOp();
               this.notifyPlayerData(PlayerDefine.PLAYER_LV, curLv);
            }

            if (playerDao.exp != curExp) {
               playerDao.exp = curExp;
               playerDao.updateOp();
               this.notifyPlayerData(PlayerDefine.PLAYER_EXP, curExp);
            }

            logger.info("玩家={}，扣除经验后, 当前等级={},当前经验={}", new Object[]{this.getPlayerId(), curLv, curExp});
      }

   }

   public CommonMsg.PlayerInfo.Builder toPlayerInfo(CommonMsg.HeroState arrayingType) {
      PlayerDao playerDao = this.getPlayerDao();
      CommonMsg.PlayerInfo.Builder builder = CommonMsg.PlayerInfo.newBuilder();
      builder.setPlayerId(this.playerId);
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLevel(playerDao.lv);
      builder.setVipLv(playerDao.vip_lv);
      builder.setShowVip(playerDao.isShowVip);
      builder.setHead(playerDao.head);
      builder.setPrestige(playerDao.prestige);
      MonarchPart monarchPart = (MonarchPart)this.getMgrPart(MonarchPart.class);

      for(CommonMsg.MapDataIS mapDataIS : monarchPart.getCustomPrestiges()) {
         builder.addCustomPrestige(mapDataIS);
      }

      builder.setSecondTitle(playerDao.secondTitle);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setServerId(playerDao.serverId);
      builder.setProvince(this.getIpProvince());
      builder.setCity(this.getIpCity());
      builder.setIpAttribution(this.getProvinceOfIpAttribution());
      builder.setPalaceTitle(playerDao.palaceTitle);
      builder.setQqWanKaLv(playerDao.qqWanKaLv);
      builder.setQqLogo(playerDao.qqLogo);
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.getMgrPart(HeroArrayingPart.class);
      ArrayingMirror arrayingMirror = heroArrayingPart.getArrayingMirrorByType(arrayingType);
      builder.setPower(arrayingMirror.power > 0L ? arrayingMirror.power : this.getPlayerCombatPower());
      builder.setArraying(arrayingMirror.toPlayerArrayingInfo());
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (Objects.isNull(unionMgr)) {
            builder.setUnionName("");
         } else {
            UnionDao unionDao = unionMgr.getUnion();
            builder.setUnionName(unionDao.unionName);
         }
      } else {
         builder.setUnionName("");
      }

      UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)this.getMgrPart(UnionTechnologyPart.class);
      builder.addAllUnionTechnologyLevelList(unionTechnologyPart.getTechnologyLevelDataListMsg());
      builder.setMonarchId(playerDao.monarchId);
      builder.setStepId(playerDao.peak_lv);
      MedalPart medalPart = (MedalPart)this.getMgrPart(MedalPart.class);
      builder.addAllMedal(medalPart.getMedals());
      DuelPart duelPart = (DuelPart)this.getMgrPart(DuelPart.class);
      builder.addAllJadeIds(duelPart.getJadeList());
      return builder;
   }

   public CommonMsg.PlayerInfo.Builder toPlayerInfo(ArrayingMirror arrayingMirror) {
      PlayerDao playerDao = this.getPlayerDao();
      CommonMsg.PlayerInfo.Builder builder = CommonMsg.PlayerInfo.newBuilder();
      builder.setPlayerId(this.playerId);
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLevel(playerDao.lv);
      builder.setVipLv(playerDao.vip_lv);
      builder.setShowVip(playerDao.isShowVip);
      builder.setHead(playerDao.head);
      builder.setPower(arrayingMirror.power);
      builder.setPrestige(playerDao.prestige);
      builder.setSecondTitle(playerDao.secondTitle);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setServerId(playerDao.serverId);
      builder.setProvince(this.getIpProvince());
      builder.setCity(this.getIpCity());
      builder.setPalaceTitle(playerDao.palaceTitle);
      builder.setQqWanKaLv(playerDao.qqWanKaLv);
      builder.setQqLogo(playerDao.qqLogo);
      builder.setArraying(arrayingMirror.toPlayerArrayingInfo());
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (Objects.isNull(unionMgr)) {
            builder.setUnionName("");
         } else {
            UnionDao unionDao = unionMgr.getUnion();
            builder.setUnionName(unionDao.unionName);
         }
      } else {
         builder.setUnionName("");
      }

      UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)this.getMgrPart(UnionTechnologyPart.class);
      builder.addAllUnionTechnologyLevelList(unionTechnologyPart.getTechnologyLevelDataListMsg());
      builder.setMonarchId(playerDao.monarchId);
      builder.setStepId(playerDao.peak_lv);
      return builder;
   }

   public CommonMsg.PlayerInfo.Builder toPlayerInfo() {
      PlayerPublicDao playerDao = this.getPublicDao();
      CommonMsg.PlayerInfo.Builder builder = CommonMsg.PlayerInfo.newBuilder();
      builder.setPlayerId(this.playerId);
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLevel(playerDao.lv);
      builder.setVipLv(playerDao.vip_lv);
      builder.setShowVip(playerDao.isShowVip);
      builder.setHead(playerDao.head);
      builder.setPower(playerDao.combat_power);
      builder.setPrestige(playerDao.prestige);
      builder.setSecondTitle(playerDao.secondTitle);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setServerId(playerDao.serverId);
      builder.setPalaceTitle(playerDao.palaceTitle);
      builder.setQqWanKaLv(playerDao.qqWanKaLv);
      builder.setQqLogo(playerDao.qqLogo);
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (Objects.isNull(unionMgr)) {
            builder.setUnionName("");
         } else {
            UnionDao unionDao = unionMgr.getUnion();
            builder.setUnionName(unionDao.unionName);
         }
      } else {
         builder.setUnionName("");
      }

      builder.setMonarchId(playerDao.monarchId);
      builder.setStepId(playerDao.peak_lv);
      return builder;
   }

   public void uploadCrossPlayer() {
      PlayerPublicDao playerPublicDao = this.getPublicDao();
      CatchDeerMgr catchDeerMgr = (CatchDeerMgr)ApplicationContextProvider.getContext().getBean(CatchDeerMgr.class);
      if (catchDeerMgr.isActivityPlayer(this.playerId)) {
         this.crossNettyClient.sendCross(this.getServerId(), this.getPlayerId(), this.toUploadCrossPlayerBuilder().build());
      } else {
         SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1991);
         if (playerPublicDao.lv >= systemFunctionModel.getOpenLevel()) {
            this.crossNettyClient.sendCross(this.getServerId(), this.getPlayerId(), this.toUploadCrossPlayerBuilder().build());
         }
      }
   }

   public CrossMsg.S2CR_PlayerBaseData_4202.Builder toUploadCrossPlayerBuilder() {
      PlayerPublicDao playerDao = this.getPublicDao();
      CrossMsg.S2CR_PlayerBaseData_4202.Builder builder = CrossMsg.S2CR_PlayerBaseData_4202.newBuilder();
      builder.setServerId(playerDao.serverId);
      builder.setPlayerId(playerDao.playerId);
      builder.setPlayerName(playerDao.playerName);
      builder.setSex(playerDao.sex);
      builder.setLv(playerDao.lv);
      builder.setCombatPower(this.getPlayerCombatPower());
      builder.setHeroNum(this.getBattleTeam(CommonMsg.HeroState.HERO_STATE_ARRAYING, (Map)null).getEntityMap().size());
      builder.setHeadId(playerDao.head);
      builder.setHeadFrame(playerDao.headFrame);
      builder.setPrestige(playerDao.prestige);
      builder.setMonarchId(playerDao.monarchId);
      builder.setUnionId(playerDao.unionId);
      builder.setVipLev(playerDao.vip_lv);
      builder.setShowVip(playerDao.isShowVip);
      builder.setSecondTitle(playerDao.secondTitle);
      builder.setPalaceTitle(playerDao.palaceTitle);
      builder.setQqWanKaLv(playerDao.qqWanKaLv);
      builder.setQqLogo(playerDao.qqLogo);
      if (playerDao.unionId > 0) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerDao.unionId);
         if (unionMgr != null) {
            UnionDao unionDao = unionMgr.getUnion();
            if (unionDao != null) {
               builder.setUnionName(unionDao.unionName);
            }
         }
      } else {
         builder.setUnionName("");
      }

      builder.setPeakLv(playerDao.peak_lv);
      int prMineInvalidTime = 0;
      GiftPart giftPart = (GiftPart)this.getMgrPart(GiftPart.class);

      label50:
      for(GiftDao giftDao : giftPart.getBuyGifts(2).values()) {
         ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftDao.giftId);
         if (shopLimitModel != null) {
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
            if (itemModel != null && itemModel.getUseFuncType() != 0 && itemModel.getUseFuncId() != 0 && itemModel.getUseFuncValue() != 0) {
               ItemBagPart itemBagPart = (ItemBagPart)this.getMgrPart(ItemBagPart.class);

               for(ResourceModel resourceModel : itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), shopLimitModel.getItemNum())) {
                  if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_PR_MINE) {
                     prMineInvalidTime = DateUtil.getIntTime(giftDao.invalidTime);
                     break label50;
                  }
               }
            }
         }
      }

      builder.setPrivilegeMine(prMineInvalidTime);
      return builder;
   }

   public void registerLog(String playerName, String account) {
      RegisterLog log = new RegisterLog();
      log.playerId = this.getPlayerId();
      log.playerName = playerName;
      log.accountName = account;
      String playerIp = this.getLogClientIp();
      log.playerIp = playerIp;
      log.devUID = "";
      log.devName = "";
      log.devOsVer = "";
      log.devRes = "";
      log.netOper = "";
      log.netInfo = "";
      log.version = "";
      log.groupId = "";
      this.getLogMgr().pushTask(() -> this.getLogMgr().addLog(log));
   }

   public void loginLog(String devUID, String devName, String devOsVer, String devRes, String netOper, String netInfo, String version, byte isReConnect, int groupId) {
      PlayerDao playerDao = this.getPlayerDao();
      LoginLog log = new LoginLog();
      log.playerId = this.getPlayerId();
      log.playerName = playerDao.playerName;
      log.accountName = this.account;
      log.playerIp = this.getLogClientIp();
      log.level = playerDao.lv;
      log.vipLevel = playerDao.vip_lv;
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.getData("tb_player_recharge", this.playerId);

      for(Map.Entry<Integer, MonthlyCardData> entry : playerRechargeDao.monthlyCard.entrySet()) {
         if (((MonthlyCardData)entry.getValue()).isActivate) {
            if (((MonthlyCardData)entry.getValue()).type == 1) {
               log.isMoonCard = 1;
            } else if (((MonthlyCardData)entry.getValue()).type == 2) {
               log.isPermanentCard = 1;
            }
         }
      }

      log.devUID = devUID;
      log.devName = devName;
      log.devOsVer = devOsVer;
      log.devRes = devRes;
      log.netOper = netOper;
      log.netInfo = netInfo;
      log.version = version;
      log.isReConnect = isReConnect;
      log.groupId = groupId;
      this.getLogMgr().pushTask(() -> this.getLogMgr().addLog(log));
   }

   public void setDevUID(String devUID) {
      this.devUID = devUID;
   }

   public String getDevUID() {
      return this.devUID;
   }

   public void setGuest(boolean guest) {
      this.isGuest = guest;
   }

   private void checkNumLegal(List<ResourceModel> resourceModels) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (worldMgr.isPropertyMonitor()) {
         List<ResourceModel> list = new ArrayList();

         for(ResourceModel resourceModel : resourceModels) {
            ResourceModel.addResourceToList(list, resourceModel);
         }

         if (list.size() > 20) {
            logger.error("一次性发送了{}种类型的物品，请检查是否合理 - {}, playerId:{}", new Object[]{list.size(), list.toString(), this.playerId});
         }

         for(ResourceModel resourceModel : list) {
            if (resourceModel.getType() != 3) {
               this.checkMaxNumLegal(resourceModel);
            }
         }

      }
   }

   private boolean checkMaxNumLegal(ResourceModel resourceModel) {
      if (resourceModel.getType() == 1) {
         long value = (long)resourceModel.getValue() + (Long)this.propertyRecord.getOrDefault(resourceModel.getId(), 0L);
         this.propertyRecord.put(resourceModel.getId(), value);
      }

      Map<Integer, LegalNumModel> map = (Map)ApplicationContextProvider.getModelPoolEntity("customLegalNum", resourceModel.getType());
      if (!CollectionUtils.isEmpty(map) && map.containsKey(resourceModel.getId())) {
         long recoreValue = (Long)this.propertyRecord.getOrDefault(resourceModel.getId(), 0L);
         if (recoreValue >= (long)((LegalNumModel)map.get(resourceModel.getId())).getTotalNum()) {
            long propertyValue = this.getPlayerDao().getProperty(resourceModel.getId());
            String tips = "playerId:" + this.playerId + " 注意，今天获得的属性值较大，请检查 propertyId:" + resourceModel.getId() + " 已获得:" + recoreValue + " 当前拥有：" + propertyValue;
            logger.warn(tips);
         }

         boolean legal = true;
         if (resourceModel.getValue() >= ((LegalNumModel)map.get(resourceModel.getId())).getTotalNum()) {
            legal = false;
            logger.warn("playerId:" + this.playerId + " 单次获得的物品数据非常大，请检查是否合理 " + resourceModel.toString());
         }

         return legal && resourceModel.getValue() < ((LegalNumModel)map.get(resourceModel.getId())).getNum();
      } else {
         return true;
      }
   }

   public void resetLegalNumRecord() {
      this.propertyRecord.clear();
   }

   @MsgHandlerAnno
   public void C2S_RecordGuideId_2027(PlayerMsg.C2S_RecordGuideId_2027 msg, String source) {
      int type = msg.getType();
      PlayerMsg.S2C_RecordGuideId_2028.Builder builder = PlayerMsg.S2C_RecordGuideId_2028.newBuilder();
      builder.setType(type);
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      switch (type) {
         case 1:
            playerExtend.guideIds.add(msg.getGuideId());
            builder.addGuideIds(msg.getGuideId());
            this.updatePlayerExtend(13);
            break;
         case 2:
            builder.addAllGuideIds(playerExtend.guideIds);
      }

      this.sendMsg(builder.build());
   }

   @TaskMethod
   public void battleResult(BattleMsg.S2C_BattleResult_6102 msg, int id, int time) {
      try {
         BattleMsg.S2C_BattleResult_6102.Builder builder = msg.toBuilder();
         builder.setIsRecord(1).build();
         builder.setWave(0);
         builder.setTotalWave(1);
         builder.setIsNextWave(false);
         this.sendMsg(builder.build());
      } catch (Exception var5) {
      }

   }

   @TaskMethod
   public void kingOfCp_C2S_GuessUi_9611() {
      int heroRivalChipGive = this.configManager.getIntDefault("heroRivalChipGive", 60);
      PlayerDao playerDao = this.getPlayerDao();
      if (playerDao.winPlains > 0) {
         ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_WIN_PLAINS, playerDao.winPlains);
         this.delResource(resourceModel, 38, 3806, 0, 0, "C2S_GuessUi_9611");
      }

      this.addResource(1, PlayerDefine.PLAYER_WIN_PLAINS, heroRivalChipGive, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 38, 3806, 0, 0, "");
      KingOfCentralPlainsMgr kingOfCentralPlainsMgr = (KingOfCentralPlainsMgr)ApplicationContextProvider.getContext().getBean(KingOfCentralPlainsMgr.class);
      kingOfCentralPlainsMgr.pushTaskEx("openGuessUi", new Object[]{this.getPlayerId()});
   }

   @TaskMethod
   public void kingOfCp_clearActivity() {
      if (!this.isRobot()) {
         ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_WIN_PLAINS, this.getPlayerDao().winPlains);
         this.delResource(resourceModel, 38, 3806, 0, 0, "clearActivity");
      }

   }

   @TaskMethod
   public void kingOfCp_runReady_send(int round) {
      int heroRivalChipGive = this.configManager.getIntDefault("heroRivalChipGive", 60);
      int bottomLineChipGive = this.configManager.getIntDefault("bottomLineChipGive", 250);
      int heroRivalChipGive2 = this.configManager.getIntDefault("heroRivalChipGive2", 500);
      int addGivePlains = heroRivalChipGive;
      if (round >= 7 && this.getPlayerDao().winPlains < bottomLineChipGive) {
         addGivePlains = heroRivalChipGive2;
      }

      this.addResource(1, PlayerDefine.PLAYER_WIN_PLAINS, addGivePlains, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 38, 3804, 0, 0, "");
   }

   @TaskMethod
   public void kingOfCp_runSendAward_runSendAward() {
      if (!this.isRobot()) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> map = this.gameModelPool.getMap("customCentreAward");
         CentreAwardModel centreAwardModel = (CentreAwardModel)((TreeMap)map.get(CentreAwardModel.TYPE_KINGCP_GUESS_WIN)).firstEntry().getValue();
         if (this.getPlayerDao().winPlains > 0) {
            List<ResourceModel> winList = new ArrayList();
            ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_RENOW, this.getPlayerDao().winPlains);
            winList.add(resourceModel);
            MailPart mailPart = (MailPart)this.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), winList, 604800000L, 38, 3802);
         }

         this.delResource(1, PlayerDefine.PLAYER_WIN_PLAINS, (long)this.getPlayerDao().winPlains, 38, 3806, 0, 0, "runSendAward");
      }

   }

   public String getLogClientIp() {
      if (this.channel == null) {
         return "null:channel 为空";
      } else {
         return this.channel.remoteAddress() == null ? "null:channel remoteAddress 为空" : this.channel.remoteAddress().toString();
      }
   }

   public int getSystemLvLimit(int systemId) {
      int normalLvLimit = 0;
      switch (systemId) {
         case 1001:
            normalLvLimit = 200;
            break;
         case 1511:
            normalLvLimit = this.configManager.getIntDefault("treasureQualityLimirLv", 0);
            break;
         case 1891:
            normalLvLimit = this.configManager.getIntDefault("artifactSkillLimitLv", 0);
      }

      if (normalLvLimit <= 0) {
         logger.warn("需要配置系统{}的正常等级上限", systemId);
      }

      int raiseLv = this.getRaiseLv(systemId);
      return normalLvLimit + raiseLv;
   }

   public int getRaiseLv(int systemId) {
      PlayerExtend playerExtend = (PlayerExtend)this.getPlayerExtend(13);
      LevelPromoteModel levelPromoteModel = (LevelPromoteModel)ApplicationContextProvider.getModelPoolEntity("levelPromote", playerExtend.levelPromoteId);
      if (levelPromoteModel == null) {
         return 0;
      } else {
         int raiseLv = 0;

         for(KeyValFun keyValFun : levelPromoteModel.getRaise()) {
            if (keyValFun.getKey() == systemId) {
               raiseLv = keyValFun.getVal();
               break;
            }
         }

         return raiseLv;
      }
   }

   public boolean checkCanAddItems(ItemModel itemModel, int num) {
      if (itemModel == null) {
         return false;
      } else {
         if (itemModel.getSubclass() == 7) {
            if (num > this.configManager.getIntDefault("TheSameOfTotemNum", 1)) {
               logger.warn("玩家{} - 相同图腾只能拥有一个 id:{}", this.getPlayerId(), itemModel.getId());
               return false;
            }

            ItemBagDao itemBagDao = (ItemBagDao)this.getData("tb_bag", this.getPlayerId());
            List<ItemBase> list = itemBagDao.getItemById(itemModel.getId());
            if (list.size() > 0) {
               logger.warn("玩家{}已拥有id:{} name:{}，所以不再添加", new Object[]{this.getPlayerId(), itemModel.getId(), itemModel.getName()});
               return false;
            }
         }

         return true;
      }
   }

   protected void sendZoneServerIds() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      PlayerMsg.S2C_ZoneServerIds_2048.Builder builder = PlayerMsg.S2C_ZoneServerIds_2048.newBuilder();
      builder.addAllServerId(worldMgr.getServersSet());
      this.sendMsg(builder.build());
   }

   public String getUnionName() {
      PlayerDao playerDao = this.getPlayerDao();
      if (playerDao.unionId == 0) {
         return "";
      } else {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionDao unionDao = (UnionDao)unionMgrParent.getUnionDaoMap().get(playerDao.unionId);
         return unionDao != null ? unionDao.unionName : "";
      }
   }

   public int getAreaIdByModel(ProvinceNameModel provinceNameModel) {
      if (provinceNameModel == null) {
         return this.configManager.getIntDefault("provinceNameDefaultAreaId", 1);
      } else {
         List<String> replaceGrouptype = provinceNameModel.getReplaceGrouptype();
         if (replaceGrouptype.size() == 0) {
            return provinceNameModel.getGroupType();
         } else {
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

            for(String str : replaceGrouptype) {
               String[] arr = str.split(":");
               if (arr[0].equals(worldMgr.country)) {
                  return Integer.parseInt(arr[1]);
               }
            }

            return provinceNameModel.getGroupType();
         }
      }
   }

   public int getDefaultProvinceId() {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      TreeMap<Integer, ProvinceNameModel> provinceNameModelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("custom_province_name_server_type", worldMgr.country);
      int defaultProvinceId = this.configManager.getIntDefault("defaultUnknowProvinceId", 2050);
      switch (worldMgr.country) {
         case "cn":
            defaultProvinceId = this.configManager.getIntDefault("defaultProvinceId", 2000);
            break;
         case "kr":
            defaultProvinceId = this.configManager.getIntDefault("defaultKrProvinceId", 2051);
            break;
         case "tw":
            defaultProvinceId = this.configManager.getIntDefault("defaultTwProvinceId", 2035);
            break;
         case "jp":
            defaultProvinceId = this.configManager.getIntDefault("defaultJpProvinceId", 2050);
            break;
         case "vn":
            defaultProvinceId = this.configManager.getIntDefault("defaultVnProvinceId", 2047);
      }

      return defaultProvinceId;
   }

   @MsgHandlerAnno
   public void C2S_PlayerArraying_2055(PlayerMsg.C2S_PlayerArraying_2055 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (!worldMgr.getServersSet().contains(msg.getServerId()) && msg.getServerId() != 0) {
         PlayerMsg.S2S_PlayerArraying_2057.Builder builder = PlayerMsg.S2S_PlayerArraying_2057.newBuilder();
         builder.setArrayingType(msg.getArrayingType());
         this.crossNettyClient.send2Server(this.getServerId(), this.getPlayerId(), msg.getServerId(), msg.getPlayerId(), builder.build());
      } else {
         GamePlayer otherPlayer = worldMgr.getPlayerById(msg.getPlayerId());
         if (otherPlayer != null) {
            otherPlayer.pushTask(() -> {
               CommonMsg.HeroState arrayingType = msg.getArrayingType();
               ArrayingMirror playerArraying = otherPlayer.getPlayerArraying(arrayingType);
               PlayerMsg.S2C_PlayerArraying_2056.Builder builder = PlayerMsg.S2C_PlayerArraying_2056.newBuilder();
               builder.setArrayingType(arrayingType);
               builder.setArraying(playerArraying.toPlayerArrayingInfo());
               this.sendMsg(builder.build());
            });
         }
      }

   }

   @MsgHandlerAnno
   public void C2S_ArrayingRecommend_2059(PlayerMsg.C2S_ArrayingRecommend_2059 msg, String source) {
      this.crossNettyClient.sendCross(this.getServerId(), this.getPlayerId(), msg);
   }

   public void clearPublicUnionId() {
      if (this.playerPublicDao != null) {
         this.playerPublicDao.unionId = 0;
      }

   }
}
