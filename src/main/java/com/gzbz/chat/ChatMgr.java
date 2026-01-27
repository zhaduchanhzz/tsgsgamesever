package com.gzbz.chat;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import cn.hutool.core.convert.Convert;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.base.Splitter;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.bean.WeChatGiftInfo;
import com.gzbz.activity.part.ActGoldWeekPart;
import com.gzbz.activity.part.ActHeroImprovePart;
import com.gzbz.activity.part.ActivityComeBackPart;
import com.gzbz.activity.part.ActivityEventHeroPart;
import com.gzbz.activity.part.ActivityKrEventHeroPart;
import com.gzbz.activity.part.ActivityNewWeekPart;
import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.activity.part.ArtifactActivityPart;
import com.gzbz.activity.part.BeautyTreasurePart;
import com.gzbz.activity.part.BroodPart;
import com.gzbz.activity.part.ChildActPart;
import com.gzbz.activity.part.ChongYangPart;
import com.gzbz.activity.part.DecisiveBattlePart;
import com.gzbz.activity.part.FaQiuPart;
import com.gzbz.activity.part.FlowerFireActivityPart;
import com.gzbz.activity.part.FourteenSignInPart;
import com.gzbz.activity.part.GuoQingActivityPart;
import com.gzbz.activity.part.HeroRaisePart;
import com.gzbz.activity.part.HeroSkinActivityPart;
import com.gzbz.activity.part.HeroThemePart;
import com.gzbz.activity.part.KrActHeroImprovePart;
import com.gzbz.activity.part.LaborDayActivityPart;
import com.gzbz.activity.part.MidAutumnPart;
import com.gzbz.activity.part.MonthlyFundPart;
import com.gzbz.activity.part.QiXiActivityPart;
import com.gzbz.activity.part.SevenDayTaskActivityPart;
import com.gzbz.activity.part.SevenDaysPart;
import com.gzbz.activity.part.SplendidCityPart;
import com.gzbz.activity.part.StarsActivityPart;
import com.gzbz.activity.part.SwimParkActivityPart;
import com.gzbz.activity.part.ThanksgivingDayPart;
import com.gzbz.activity.part.TongQueParkPart;
import com.gzbz.activity.part.TurntablePart;
import com.gzbz.activity.part.WeekendKoiPart;
import com.gzbz.activity.part.WorldCupPart;
import com.gzbz.activity.part.YuanXiao2022ActivityPart;
import com.gzbz.activity.part.ZongQingActivityPart;
import com.gzbz.advertisement.AdvertisementVnPart;
import com.gzbz.alliance.AllianceMgr;
import com.gzbz.battle.entity.Monster;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.benefit.CdKeyPart;
import com.gzbz.benefit.DailySignPart;
import com.gzbz.benefit.MonthlyCardPart;
import com.gzbz.catchDeer.CatchDeerMgr;
import com.gzbz.chatServer.ChatServerClient;
import com.gzbz.countryWar.CountryWarMgr;
import com.gzbz.countryWar.CountryWarPart;
import com.gzbz.db.ActivityAnniversaryCelebrationDao;
import com.gzbz.db.ActivityComeBackDao;
import com.gzbz.db.ActivityThanksgivingDao;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.ChatDao;
import com.gzbz.db.DragonVeinDao;
import com.gzbz.db.ExclusiveWeaponDao;
import com.gzbz.db.ExpeditionDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroNationRankDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.KrSevenWelfareDao;
import com.gzbz.db.MagicBookDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.PlayerReportDao;
import com.gzbz.db.QqBigPlayerDao;
import com.gzbz.db.RankRewardDao;
import com.gzbz.db.ShopDao;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.TrailTowerDao;
import com.gzbz.db.TrailTowerStarDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.ChatData;
import com.gzbz.db.bean.HeroTypeAttrData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.demon.DemonMgr;
import com.gzbz.demonRotate.DemonRotateMgr;
import com.gzbz.demonStrikes.DemonStrikesMgr;
import com.gzbz.divineGanerals.DivineGeneralsPart;
import com.gzbz.dragon.part.DragonPart;
import com.gzbz.dragon.part.DragonStrengthenPart;
import com.gzbz.dragonVein.DragonVeinDefine;
import com.gzbz.dragonVein.part.DragonVeinPart;
import com.gzbz.duel.DuelPart;
import com.gzbz.exclusiveWeapon.part.ExclusiveWeaponPart;
import com.gzbz.freeWelfare.part.VideoRewardPart;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.Ladder.LadderPart;
import com.gzbz.gamePlayer.act.LuckDrawPart;
import com.gzbz.gamePlayer.armyArray.ArmyArrayPart;
import com.gzbz.gamePlayer.battle.BattleChapterPart;
import com.gzbz.gamePlayer.battle.BattleHeroTrainingPart;
import com.gzbz.gamePlayer.battle.BattleTemplePart;
import com.gzbz.gamePlayer.battle.BattleTowerPart;
import com.gzbz.gamePlayer.battle.FairylandPart;
import com.gzbz.gamePlayer.battle.TrailTowerPart;
import com.gzbz.gamePlayer.battle.UnderPalacePart;
import com.gzbz.gamePlayer.equip.CastSoulPart;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroMail.HeroMailPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroPalacePart;
import com.gzbz.gamePlayer.heroPart.HeroPromotePart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.heroPart.HeroUpgradePart;
import com.gzbz.gamePlayer.heroPart.bean.PlayerHeroExtend;
import com.gzbz.gamePlayer.horse.WarHorsePart;
import com.gzbz.gamePlayer.levelPromote.LevelPromotePart;
import com.gzbz.gamePlayer.littleGame.LittleGamePart;
import com.gzbz.gamePlayer.magicBook.MagicBookPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.peak.PeakBattlePart;
import com.gzbz.gamePlayer.peak.PeakRedPacketMgr;
import com.gzbz.gamePlayer.pet.PetPart;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.playerBag.HeroDressPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerBag.RuneStonePart;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.playerReset.PlayerResetPart;
import com.gzbz.gamePlayer.pvp.KingOfCentralPlainsMgr;
import com.gzbz.gamePlayer.pvp.PvpSeasonMgr;
import com.gzbz.gamePlayer.record.BattleRecordPart;
import com.gzbz.gamePlayer.record.SpecialRecordMgr;
import com.gzbz.gamePlayer.stoneCircle.StoneCirclePart;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.gift.GiftMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.godBeast.part.GodBeastPart;
import com.gzbz.godBeast.part.GodBeastTaskPart;
import com.gzbz.godBeast.part.NeiDanPart;
import com.gzbz.http.RechargeController;
import com.gzbz.http.vo.ChatLimitData;
import com.gzbz.krWelfare.part.KrSevenWelfarePart;
import com.gzbz.mart.MartPart;
import com.gzbz.megerWar.part.MergeWarBossPart;
import com.gzbz.megerWar.part.MergeWarGamePart;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.mergeActivity.part.MergeActivityHeFuKuangHuanPart;
import com.gzbz.mine.part.MinePart;
import com.gzbz.mini.MiniProgramPart;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ActivityRuleModel;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.BattleTowerModel;
import com.gzbz.model.CdKeyModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ChapterModel;
import com.gzbz.model.GodBeastNeiDanBaseModel;
import com.gzbz.model.GodBeastNeiDanEntryModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ImportGiftModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.PkHerosModel;
import com.gzbz.model.PkLvAndStarModel;
import com.gzbz.model.PlotBattleModel;
import com.gzbz.model.RankRewardModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.RuneMainModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.TongqueTerraceModel;
import com.gzbz.model.TrailTowerModel;
import com.gzbz.model.UnionBuffModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.WuDaoDateModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.net.GameServerHandler;
import com.gzbz.protobuf.ActivityAnniversaryCelebrationMsg;
import com.gzbz.protobuf.AdvertisementMsg;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.ChatMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossChatMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.DBServerMsg;
import com.gzbz.protobuf.GiftMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.LittleGameMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ThanksgivingDayMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.protobuf.TongqueTerraceMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.qqBigPlayer.part.QqBigPlayerPart;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.recharge.bean.RechargeNotifyData;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.robot.MonsterManager;
import com.gzbz.robot.bean.MonsterMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.task.ChatBubblePart;
import com.gzbz.task.CountryWarTaskPart;
import com.gzbz.task.PlayerTaskPart;
import com.gzbz.task.base.AbstractTaskPart;
import com.gzbz.task.bean.PlayerTaskExtend;
import com.gzbz.test.AdventureTaskTestPart;
import com.gzbz.test.BattleIdTestMgr;
import com.gzbz.test.CopyPlayerTest;
import com.gzbz.test.HeroClubTestPart;
import com.gzbz.test.HeroRecruitmentTestMgr;
import com.gzbz.test.PrayTest;
import com.gzbz.test.ShopWarcraftTestPart;
import com.gzbz.test.WarHorseTestPart;
import com.gzbz.test.WarriorSignetCompoundTestPart;
import com.gzbz.test.WarriorSignetRecastTestPart;
import com.gzbz.test.WarriorSignetTestPart;
import com.gzbz.transport.WaterTransportMgr;
import com.gzbz.udp.DBNettyClient;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.union.bean.PlayerUnionExtend;
import com.gzbz.union.part.UnionDailyGuessPart;
import com.gzbz.union.part.UnionPrivilegePart;
import com.gzbz.union.part.UnionTechnologyPart;
import com.gzbz.unionOffer.OfferPart;
import com.gzbz.war.ancientSword.AncientSwordPart;
import com.gzbz.war.dragonwar.DragonWarPart;
import com.gzbz.war.hl.WarPart;
import com.gzbz.war.jingzhou.JingzhouWarPart;
import com.gzbz.war.jingzhou.TreasurePart;
import com.gzbz.war.north.WarNorthPart;
import com.gzbz.war.redcliff.RedCliffPart;
import com.gzbz.war.stonehenge.StonehengePart;
import com.gzbz.worldMgr.GmMgr;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldBossMgr;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiFunction;
import java.util.function.Function;
import jodd.util.StringUtil;
import misc.DateUtil;
import misc.JsonUtil;
import misc.MapUtil;
import misc.MiscUtil;
import misc.SignUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
@MgrAnno
public class ChatMgr extends GameMgr {
   @Autowired
   private DBNettyClient dbNettyClient;
   @Autowired
   private ChatServerClient chatServerClient;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   @Autowired
   private ActivityMgr activityMgr;
   @Value("${ServerId}")
   public int GAME_SERVER_ID;
   static Logger logger = LoggerFactory.getLogger(ChatMgr.class);
   public static final String CHAT_MEMORY = "chatmemory";
   private BattleTestMgr battleTestMgr = null;
   private final Queue<ChatMsg.Chat_Info> worldQueue = new ConcurrentLinkedQueue();
   private final Map<String, Queue<ChatMsg.Chat_Info>> provinceMap = new ConcurrentHashMap();
   private final Map<Integer, Queue<ChatMsg.Chat_Info>> unionQueueMap = new ConcurrentHashMap();
   private final Queue<ChatMsg.Chat_Info> countryWarQueue = new ConcurrentLinkedQueue();
   private final Queue<ChatMsg.Chat_Info> systemQueue = new ConcurrentLinkedQueue();
   private final Queue<ChatMsg.Chat_Info> newInternationalQueue = new ConcurrentLinkedQueue();
   private final Map<Integer, Queue<ChatMsg.Chat_Info>> areaMap = new ConcurrentHashMap();
   public final Map<Byte, ChatLimitData> chatLimitDataMap = new ConcurrentHashMap();
   private final WorldMgr worldMgr;
   private final WorldBossMgr worldBossMgr;
   private final UnionMgrParent unionMgrParent;
   private final CrossNettyClient crossNettyClient;
   private final OnLineMgr onLineMgr;
   private final CountryWarMgr countryWarMgr;
   private final RankMgr rankMgr;

   public ChatMgr(WorldMgr worldMgr, WorldBossMgr worldBossMgr, UnionMgrParent unionMgrParent, CrossNettyClient crossNettyClient, OnLineMgr onLineMgr, CountryWarMgr countryWarMgr, RankMgr rankMgr) {
      this.worldMgr = worldMgr;
      this.worldBossMgr = worldBossMgr;
      this.unionMgrParent = unionMgrParent;
      this.crossNettyClient = crossNettyClient;
      this.onLineMgr = onLineMgr;
      this.countryWarMgr = countryWarMgr;
      this.rankMgr = rankMgr;
   }

   protected void init() {
   }

   public Queue<ChatMsg.Chat_Info> getCacheChat(int channel) {
      switch (channel) {
         case 2:
            return this.worldQueue;
         case 3:
         case 5:
         default:
            return null;
         case 4:
            return this.systemQueue;
         case 6:
            return this.newInternationalQueue;
         case 7:
            return this.countryWarQueue;
      }
   }

   public Queue<ChatMsg.Chat_Info> getProvinceQueue(String ipProvince) {
      return this.provinceMap.containsKey(ipProvince) ? (Queue)this.provinceMap.get(ipProvince) : null;
   }

   public Queue<ChatMsg.Chat_Info> getAreaQueue(int areaId) {
      return this.areaMap.containsKey(areaId) ? (Queue)this.areaMap.get(areaId) : null;
   }

   public Queue<ChatMsg.Chat_Info> getUnionQueue(int unionId) {
      return this.unionQueueMap.containsKey(unionId) ? (Queue)this.unionQueueMap.get(unionId) : null;
   }

   public void handleMsg(ChatData chatData) {
      switch (chatData.channel) {
         case 2:
            this.structureWorldChat(chatData);
            break;
         case 3:
            this.structureUnionChat(chatData);
         case 4:
         default:
            break;
         case 5:
            this.sendToCrossCityServer(chatData);
            break;
         case 6:
            this.sendToCrossServer(chatData);
            break;
         case 7:
            this.countryWarMgr.pushTask(() -> {
               ChatMsg.Chat_Info.Builder chatInfo = this.packChatInfo(chatData);
               CrossChatMsg.S2CR_ChatCountryWar_11703.Builder builder = CrossChatMsg.S2CR_ChatCountryWar_11703.newBuilder();
               builder.setChatInfo(chatInfo);
               this.crossNettyClient.sendCross(chatData.serverId, chatData.senderId, builder.build());
            });
      }

   }

   private void structureWorldChat(ChatData chatData) {
      GamePlayer sender = this.worldMgr.getPlayerById(chatData.senderId);
      if (Objects.isNull(sender)) {
         logger.info("找不到发送者:" + chatData.senderId);
      } else {
         ChatMsg.S2C_Chat_6004.Builder builder = this.createChat(chatData);
         if (builder == null) {
            logger.info("构建聊天内容");
         } else {
            this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
            ChatMsg.Chat_Info chatInfo = builder.getInfos(0);
            if (chatInfo != null) {
               this.cacheChatInfo(chatInfo, 0);
            }

         }
      }
   }

   @TaskMethod
   public void chatEx(int serverId, int senderId, int channel, String content, int subclass, CommonMsg.HeroInfo heroInfoMsg, int appointId, BagMsg.Item_Info itemInfoMsg, String shareTips, int bubble) {
   }

   @MsgHandlerAnno
   public void CR2S_ChatCountryWar_11704(CrossChatMsg.CR2S_ChatCountryWar_11704 msg, CrossSubscribeMsg crossSubscribeMsg) {
      ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
      builder.addInfos(msg.getChatInfo());
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
      this.cacheChatInfo(msg.getChatInfo(), 0);
   }

   @MsgHandlerAnno
   public void S2CR_PlayerDetailInfo_11705(CrossChatMsg.S2CR_PlayerDetailInfo_11705 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.respCrossPlayerDetail(crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId, crossSubscribeMsg.destMgrId, msg.getArraying());
   }

   @MsgHandlerAnno
   public void S2CR_PlayerDetailInfoForCross_11708(CrossChatMsg.S2CR_PlayerDetailInfoForCross_11708 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.respCrossPlayerDetail(msg.getDestServerId(), msg.getDestPlayerId(), crossSubscribeMsg.destMgrId, msg.getArraying());
   }

   @MsgHandlerAnno
   public void S2CR_PlayerBeautyInfo_11719(CrossChatMsg.S2CR_PlayerBeautyInfo_11719 msg, CrossSubscribeMsg crossSubscribeMsg) {
      GamePlayer otherPlayer = this.worldMgr.getPlayerById(crossSubscribeMsg.destMgrId);
      if (otherPlayer != null) {
         otherPlayer.pushTask(() -> {
            TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)otherPlayer.getMgrPart(TongqueTerracePart.class);
            TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.Builder builder = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.newBuilder();
            tongqueTerracePart.packPlayerBeautyInfo(builder, msg.getBeautyId());
            this.crossNettyClient.send2Client(crossSubscribeMsg.sourceServerId, crossSubscribeMsg.sourcePlayerId, builder.build());
         });
      }

   }

   private void structureUnionChat(ChatData chatData) {
      GamePlayer sender = this.worldMgr.getPlayerById(chatData.senderId);
      if (!Objects.isNull(sender)) {
         ChatMsg.S2C_Chat_6004.Builder builder = this.createChat(chatData);
         if (builder != null) {
            PlayerPublicDao playerPublicDao = sender.getPublicDao();
            sender.pushTask(() -> {
               FriendDao friendDao = (FriendDao)sender.getData("tb_friend", sender.getPlayerId());
               Set<Integer> blackSet = friendDao.getDatas(4);
               List<Integer> list = new ArrayList();
               if (!CollectionUtils.isEmpty(blackSet)) {
                  list.addAll(blackSet);
               }

               list.add(chatData.senderId);
               this.unionMgrParent.pushTask(() -> {
                  UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerPublicDao.unionId);
                  if (unionMgr != null) {
                     unionMgr.broadcast(builder.build(), list);
                  }
               });
            });
            if (builder.getInfosCount() > 0) {
               ChatMsg.Chat_Info chatInfo = builder.getInfos(0);
               this.cacheUnionChat(chatInfo, playerPublicDao.unionId);
            }

         }
      }
   }

   private ChatMsg.S2C_Chat_6004.Builder createChat(ChatData chatData) {
      ChatMsg.Chat_Info.Builder chatInfo = this.packChatInfo(chatData);
      if (chatInfo == null) {
         return null;
      } else {
         ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
         builder.addInfos(chatInfo);
         return builder;
      }
   }

   private ChatMsg.Chat_Info.Builder packChatInfo(ChatData chatData) {
      GamePlayer sender = this.worldMgr.getPlayerById(chatData.senderId);
      if (Objects.isNull(sender)) {
         return null;
      } else {
         PlayerPublicDao senderDao = sender.getPublicDao();
         ChatMsg.Chat_Info.Builder chatInfo = ChatMsg.Chat_Info.newBuilder();
         chatInfo.setChatId(-1);
         chatInfo.setChannel(chatData.channel);
         chatInfo.setContent(chatData.content);
         chatInfo.setPlayerId(chatData.senderId);
         chatInfo.setPlayerName(senderDao.playerName);
         chatInfo.setSex(senderDao.sex);
         chatInfo.setLevel(senderDao.lv);
         chatInfo.setVipLv(senderDao.vip_lv);
         chatInfo.setShowVip(senderDao.isShowVip);
         chatInfo.setHead(senderDao.head);
         chatInfo.setHeadFrame(senderDao.headFrame);
         chatInfo.setPrestige(senderDao.prestige);
         chatInfo.setSecondTitle(senderDao.secondTitle);
         chatInfo.setServerId(senderDao.serverId);
         chatInfo.setProvince(sender.getIpProvince());
         chatInfo.setCity(sender.getIpCity());
         chatInfo.setQqWanKaLv(senderDao.qqWanKaLv);
         chatInfo.setQqLogo(senderDao.qqLogo);
         List<Integer> areaInfoList = sender.getAreaInfo();
         if (areaInfoList != null) {
            chatInfo.setAreaId((Integer)areaInfoList.get(0));
            chatInfo.setProvinceId((Integer)areaInfoList.get(1));
            chatInfo.setCityId((Integer)areaInfoList.get(2));
         }

         chatInfo.setSubclass(chatData.subclass);
         chatInfo.setExtra1(0);
         chatInfo.setExtra2("");
         chatInfo.setChatTime((int)(System.currentTimeMillis() / 1000L));
         chatInfo.setAppointId(chatData.appointId);
         if (chatData.heroInfoMsg != null) {
            chatInfo.setHeroInfo(chatData.heroInfoMsg);
         }

         if (chatData.itemInfoMsg != null) {
            chatInfo.setItemInfo(chatData.itemInfoMsg);
         }

         if (chatData.bubble > 0) {
            chatInfo.setBubble(chatData.bubble);
         }

         chatInfo.setShareTips(chatData.shareTips);
         if (chatData.medals != null && !chatData.medals.isEmpty()) {
            chatInfo.addAllMedal(chatData.medals);
         }

         if (chatData.customPrestige != null) {
            for(CommonMsg.MapDataIS mapDataIS : chatData.customPrestige) {
               chatInfo.addCustomPrestige(mapDataIS);
            }
         }

         return chatInfo;
      }
   }

   private void cacheUnionChat(ChatMsg.Chat_Info chatInfo, int unionId) {
      Queue<ChatMsg.Chat_Info> unionQueue = (Queue)this.unionQueueMap.computeIfAbsent(unionId, (v) -> new ConcurrentLinkedQueue());
      if (unionQueue.size() > this.getChatCountLimit(3)) {
         unionQueue.poll();
      }

      unionQueue.add(chatInfo);
   }

   private void cacheProvinceChat(ChatMsg.Chat_Info chatInfo) {
      String ipProvince = chatInfo.getProvince();
      Queue<ChatMsg.Chat_Info> queue = null;
      if (this.provinceMap.containsKey(ipProvince)) {
         queue = (Queue)this.provinceMap.get(ipProvince);
      } else {
         queue = new ConcurrentLinkedQueue();
         this.provinceMap.put(ipProvince, queue);
      }

      if (queue.size() > this.getChatCountLimit(5)) {
         queue.poll();
      }

      queue.add(chatInfo);
   }

   private void cacheAreaChat(ChatMsg.Chat_Info chatInfo) {
      int areaId = chatInfo.getAreaId();
      Queue<ChatMsg.Chat_Info> queue = (Queue)MapUtil.computeIfAbsent(this.areaMap, areaId, ConcurrentLinkedQueue.class);
      if (queue.size() > this.getChatCountLimit(5)) {
         queue.poll();
      }

      queue.add(chatInfo);
   }

   private void cacheChatInfo(ChatMsg.Chat_Info chatInfo, int unionId) {
      int channel = chatInfo.getChannel();
      int senderId = chatInfo.getPlayerId();
      if (channel == 5) {
         this.cacheAreaChat(chatInfo);
      } else if (channel == 3) {
         if (unionId <= 0) {
            return;
         }

         GamePlayer sender = this.worldMgr.getPlayerById(senderId);
         if (Objects.isNull(sender)) {
            return;
         }

         this.cacheUnionChat(chatInfo, unionId);
      } else if (channel == 6) {
         int limit = this.getChatCountLimit(channel);
         if (this.newInternationalQueue.size() >= limit) {
            this.newInternationalQueue.poll();
         }

         this.newInternationalQueue.add(chatInfo);
      } else {
         Queue<ChatMsg.Chat_Info> chatDaoQueue = this.getCacheChat(channel);
         int limit = this.getChatCountLimit(channel);
         if (chatDaoQueue != null) {
            if (chatDaoQueue.size() >= limit) {
               chatDaoQueue.poll();
            }

            chatDaoQueue.add(chatInfo);
         }
      }

   }

   private ChatDao createChatDao(int channel, int senderId, String content, int subclass, String extra_2, CommonMsg.HeroInfo heroInfoMsg, int appointId) {
      ChatDao chatDao = new ChatDao();
      chatDao.channel = channel;
      chatDao.playerId = senderId;
      chatDao.content = content;
      chatDao.subclass = subclass;
      chatDao.extra_2 = extra_2;
      chatDao.appointId = appointId;
      if (heroInfoMsg != null) {
         chatDao.heroShare = heroInfoMsg.toByteArray();
      }

      return chatDao;
   }

   @TaskMethod
   public void sendSystem(byte channel, byte subclass, int playerId, String playerName, String content) {
      ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
      ChatMsg.Chat_Info.Builder chatInfo = ChatMsg.Chat_Info.newBuilder();
      chatInfo.setChatId(-1);
      chatInfo.setChannel(channel);
      chatInfo.setSubclass(subclass);
      chatInfo.setContent(content);
      chatInfo.setPlayerName(playerName);
      chatInfo.setChatTime((int)(System.currentTimeMillis() / 1000L));
      builder.addInfos(chatInfo);
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
      if (subclass == 2) {
         this.cacheChatInfo(builder.getInfos(0), 0);
      }

   }

   @TaskMethod
   public void sendBattleTemple(GamePlayer player, String format) {
      PlayerPublicDao playerPublicDao = player.getPublicDao();
      this.sendSystem((byte)4, (byte)2, player.getPlayerId(), playerPublicDao.playerName, format);
      this.sendSystem((byte)4, (byte)5, player.getPlayerId(), playerPublicDao.playerName, format);
   }

   public void sendUnionSystem(int unionId, String content, int subclass) {
      UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(unionId);
      if (unionMgr != null) {
         int unionSystemHead = ApplicationContextProvider.getConfigInt("unionSysPortrait", 30002);
         ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
         ChatMsg.Chat_Info.Builder chatInfo = ChatMsg.Chat_Info.newBuilder();
         chatInfo.setChatId(-1);
         chatInfo.setChannel(3);
         chatInfo.setContent(content);
         chatInfo.setPlayerId(0);
         chatInfo.setPlayerName("系统消息");
         chatInfo.setHead(unionSystemHead);
         chatInfo.setSubclass(subclass);
         chatInfo.setChatTime((int)(System.currentTimeMillis() / 1000L));
         builder.addInfos(chatInfo);
         this.unionMgrParent.pushTask(() -> unionMgr.broadcast(builder.build(), (List)null));
         this.cacheUnionChat(chatInfo.build(), unionId);
      }
   }

   private int getChatCountLimit(int channel) {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      String str = "";
      switch (channel) {
         case 2:
            str = "chatmemory3";
            break;
         case 3:
            str = "chatmemory4";
            break;
         case 4:
            str = "chatmemory5";
            break;
         case 5:
            str = "chatmemory2";
            break;
         case 6:
            str = "chatmemory1";
            break;
         case 7:
            str = "chatmemory6";
      }

      return configManager.getIntDefault(str, 60);
   }

   private void sendToCrossServer(ChatData chatData) {
      ChatMsg.Chat_Info.Builder chatInfo = this.packChatInfo(chatData);
      CrossChatMsg.S2CR_Chat_11701.Builder builder = CrossChatMsg.S2CR_Chat_11701.newBuilder();
      builder.setChatInfo(chatInfo);
      this.crossNettyClient.sendCross(chatData.serverId, chatData.senderId, builder.build());
   }

   private void sendToCrossCityServer(ChatData chatData) {
      ChatMsg.Chat_Info.Builder chatInfo = this.packChatInfo(chatData);
      CrossChatMsg.S2CR_CityChat_11721.Builder builder = CrossChatMsg.S2CR_CityChat_11721.newBuilder();
      builder.setChatInfo(chatInfo);
      this.crossNettyClient.sendCross(chatData.serverId, chatData.senderId, builder.build());
   }

   public void reqCrossPlayerDetailToCross(int sourceServerId, int sourcePlayerId, int sourcePlayerLv, int targetServer, int targetPlayerId, CommonMsg.HeroState arrayingType) {
      CrossChatMsg.S2CR_PlayerDetailInfoForCross_11707.Builder reqMsg = CrossChatMsg.S2CR_PlayerDetailInfoForCross_11707.newBuilder();
      reqMsg.setDestServerId(targetServer);
      reqMsg.setDestPlayerId(targetPlayerId);
      reqMsg.setArraying(arrayingType);
      reqMsg.setSourcePlayerLv(sourcePlayerLv);
      this.crossNettyClient.sendCross(sourceServerId, sourcePlayerId, reqMsg.build());
   }

   public void reqCrossBeautyDetail(int sourceServerId, int sourcePlayerId, int targetServer, int targetPlayerId) {
      CrossChatMsg.S2CR_PlayerBeautyInfo_11719.Builder reqMsg = CrossChatMsg.S2CR_PlayerBeautyInfo_11719.newBuilder();
      this.crossNettyClient.send2Server(sourceServerId, sourcePlayerId, targetServer, targetPlayerId, reqMsg.build());
   }

   public void respCrossPlayerDetail(int sourceServerId, int sourcePlayerId, int targetPlayerId, CommonMsg.HeroState arrayingType) {
      GamePlayer otherPlayer = this.worldMgr.getPlayerById(targetPlayerId);
      if (otherPlayer != null) {
         otherPlayer.pushTask(() -> {
            CommonMsg.HeroState tempArrayingType = arrayingType;
            ChatMsg.S2C_PlayerDetailInfo_6010.Builder builder = ChatMsg.S2C_PlayerDetailInfo_6010.newBuilder();
            builder.setArraying(arrayingType);
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)otherPlayer.getMgrPart(HeroArrayingPart.class);
            HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(arrayingType);
            if (heroArrayingDao == null) {
               tempArrayingType = CommonMsg.HeroState.HERO_STATE_ARRAYING;
            }

            builder.setPlayerInfo(otherPlayer.toPlayerInfo(tempArrayingType));
            builder.setReport(false);
            this.crossNettyClient.send2Client(sourceServerId, sourcePlayerId, builder.build());
         });
      }

   }

   @MsgHandlerAnno
   public void CR2S_Chat_11702(CrossChatMsg.CR2S_Chat_11702 msg, CrossSubscribeMsg crossSubscribeMsg) {
      ChatMsg.Chat_Info chatInfo = msg.getChatInfo();
      ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
      builder.addInfos(chatInfo);
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
      this.cacheChatInfo(chatInfo, 0);
   }

   @TaskMethod
   public void CR2S_Chat_11702(ChatMsg.Chat_Info chatInfo) {
      ChatMsg.S2C_Chat_6004.Builder builder = ChatMsg.S2C_Chat_6004.newBuilder();
      builder.addInfos(chatInfo);
      this.onLineMgr.pushTask(() -> this.onLineMgr.onlineBroadcast(builder.build()));
      this.cacheChatInfo(chatInfo, 0);
   }

   public void playerReport(int playerId, int beReportId, List<Integer> list) {
      PlayerReportDao playerReportDao = (PlayerReportDao)this.gameCachePool.getData("tb_player_report", new Object[]{beReportId});
      if (!playerReportDao.reportInfo.containsKey(playerId)) {
         ++playerReportDao.count;
         Set<Integer> infos = new HashSet(list);
         playerReportDao.reportInfo.put(playerId, infos);
         playerReportDao.updateOp();
      }

   }

   public void handleGMCommand(GamePlayer player, String content) {
      logger.info(content);
      if (player != null) {
         BroodPart broodPart = (BroodPart)player.getMgrPart(BroodPart.class);
         String[] order = content.substring(2).split(" ");
         label1640:
         switch (order[1].toLowerCase()) {
            case "robotreset":
               this.worldMgr.gmResetRobot();
               break;
            case "powerreset":
               this.worldMgr.gmResetPlayerPower();
               break;
            case "clearbag":
               this.clearBag(player);
               break;
            case "clearallbag":
               this.clearAllBag(player);
               break;
            case "addbase":
               String[] addStrs = order[2].replace(" ", "").split(",");
               this.gmAddPlayerBase(player, Integer.parseInt(addStrs[0]), Integer.parseInt(addStrs[1]), 7, 701, 0, 0, content);
               break;
            case "setbase":
               String[] baseStrs = order[2].replace(" ", "").split(",");
               int type = Integer.parseInt(baseStrs[0]);
               long value = Long.parseLong(baseStrs[1]);
               value = value >= Long.MAX_VALUE ? Long.MAX_VALUE : value;
               this.gmSetPlayerBase(player, type, value, 7, 701, 0, 0, content);
               break;
            case "addlv":
               int addlv = Integer.parseInt(order[2]);
               this.gmAddLvByExp(player, addlv, 7, 701, 0, 0, content);
               break;
            case "additem":
               String[] itemStr = order[2].split(",");
               if (itemStr.length != 2) {
                  return;
               }

               int itemId = Integer.parseInt(itemStr[0]);
               int itemNum = Integer.parseInt(itemStr[1]);
               this.gmUpdatePlayerItem(player, itemId, itemNum, 7, 702, itemId, itemNum, content);
               break;
            case "addhero":
               String[] heroStr = order[2].split(",");
               if (heroStr.length != 2) {
                  return;
               }

               int heroId = Integer.parseInt(heroStr[0]);
               int heroNum = Integer.parseInt(heroStr[1]);
               this.gmUpdatePlayerHero(player, heroId, heroNum, 7, 703, heroId, heroNum, content);
               break;
            case "addhero1":
               String[] heroStarStr = order[2].split(",");
               if (heroStarStr.length != 4) {
                  return;
               }

               int heroStarId = Integer.parseInt(heroStarStr[0]);
               int heroStarNum = Integer.parseInt(heroStarStr[1]);
               int heroStar = Integer.parseInt(heroStarStr[2]);
               int heroLv = Integer.parseInt(heroStarStr[3]);
               HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart.addHeroForAssign(heroStarId, heroStarNum, heroLv, heroStar, 49, 452, heroStarNum, heroStar, Convert.toStr(order));
               break;
            case "monster":
               String[] monsterStarStr = order[2].split(",");
               if (monsterStarStr.length != 3) {
                  return;
               }

               int monsterStarId = Integer.parseInt(monsterStarStr[0]);
               int monsterStar = Integer.parseInt(monsterStarStr[1]);
               int monsterLv = Integer.parseInt(monsterStarStr[2]);
               new Monster(monsterStarId, monsterLv, monsterStar, 0, false, (BattleMonsterFun)null, (List)null);
               break;
            case "removeitem":
               String[] deleteItemStr = order[2].split(",");
               if (deleteItemStr.length != 2) {
                  return;
               }

               this.gmRemovePlayerItem(player, Integer.parseInt(deleteItemStr[0]), Integer.parseInt(deleteItemStr[1]), 7, 704, 0, 0, content);
               break;
            case "removeitems":
               this.gmRemoveItems(player, Integer.parseInt(order[2]));
               break;
            case "loadtb":
               GmLoadTbThread gmLoadTbThread = new GmLoadTbThread(this.worldMgr, player);
               gmLoadTbThread.start();
               break;
            case "pk":
               String team1 = order[2];
               String team2 = order[3];
               BattleModel battleModel1 = this.parseTeam(team1, 1);
               BattleModel battleModel2 = this.parseTeam(team2, 2);
               BattlePKTeam left = new BattlePKTeam(battleModel1);
               left.setBelongName("1");
               BattlePKTeam right = new BattlePKTeam(battleModel2);
               right.setBelongName("2");
               BattleScene scene = new BattleScene(1040, 1);
               scene.addPKTeam(left, right);
               BattleMsg.S2C_BattleResult_6102.Builder battleMsg = scene.fight((byte)20);
               player.sendMsg(battleMsg.build());
               break;
            case "pkm":
               String team1_m = order[2];
               String team2_m = order[3];
               BattleModel battleModel1_m = this.parseTeam(team1_m, 1);
               BattleModel battleModel2_m = this.parseTeam(team2_m, 2);
               BattlePKTeam left_m = new BattlePKTeam(battleModel1_m);
               left_m.setBelongName("1");
               BattlePKTeam right_m = new BattlePKTeam(battleModel2_m);
               right_m.setBelongName("2");
               BattleScene scene_m = new BattleScene(1040, 1);
               scene_m.addPKTeam(left_m, right_m);
               BattleMsg.S2C_BattleResult_6102.Builder battleMsg_m = scene_m.fight((byte)20);
               player.sendMsg(battleMsg_m.build());
               break;
            case "pkt":
               String tId = order[2];
               PkHerosModel pkHerosModel_3 = (PkHerosModel)ApplicationContextProvider.getModelPoolEntity("pkHeros", Integer.valueOf(tId));
               BattleModel battleModel1_t = this.parseTeam(1, pkHerosModel_3.getLeftHeros());
               BattleModel battleModel2_t = this.parseTeam(2, pkHerosModel_3.getRightHeros());
               BattlePKTeam left_t = new BattlePKTeam(battleModel1_t);
               left_t.setBelongName("1");
               BattlePKTeam right_t = new BattlePKTeam(battleModel2_t);
               right_t.setBelongName("2");
               BattleScene scene_t = new BattleScene(1040, 1);
               scene_t.addPKTeam(left_t, right_t);
               BattleMsg.S2C_BattleResult_6102.Builder battleMsg_t = scene_t.fight((byte)20);
               player.sendMsg(battleMsg_t.build());
               break;
            case "setworldlv":
               int worldLv = Integer.parseInt(order[2]);
               this.gmSetWorldLv(worldLv);
               break;
            case "centreaward":
               int centreAwardId = Integer.parseInt(order[2]);
               this.gmCentreAward(player, centreAwardId);
               break;
            case "completetask":
               int taskModule = Integer.parseInt(order[2]);
               int taskId = Integer.parseInt(order[3]);
               this.gmCompleteTask(player, taskModule, taskId);
               break;
            case "resettask":
               this.gmResetTask(player);
               break;
            case "removetask":
               this.gmRemoveTask(player, Integer.parseInt(order[2]));
               break;
            case "triggertask":
               this.gmTriggerTask(player, Integer.parseInt(order[2]));
               break;
            case "printtask":
               this.gmPrintTask(player);
               break;
            case "printarraying":
               this.gmPrintArraying(player);
               break;
            case "printherodao":
               this.gmPrintHeroDao(player, Integer.parseInt(order[2]));
               break;
            case "printbuygifts":
               this.gmPrintBuyGifts(player);
               break;
            case "printshop":
               this.gmPrintShop(player);
               break;
            case "printactivity":
               this.gmPrintActivity();
               break;
            case "dailyreset":
               this.gmDailyReset(player);
               break;
            case "mgrdailyreset":
               this.mgrDailyReset();
               break;
            case "dailyresetall":
               this.mgrDailyReset();
               this.gmDailyReset(player);
               break;
            case "dailyresetallplayer":
               this.mgrDailyReset();
               this.dailyResetAllPlayer();
               break;
            case "activity":
               this.gmActivity(player, order[2]);
               break;
            case "addmail":
               int mailType = 0;
               if (order.length > 2) {
                  mailType = Integer.valueOf(order[2]);
               }

               this.gmTestMail(player, mailType);
               break;
            case "addmails":
               int num = Integer.valueOf(order[2]);

               for(int i = 0; i < num; ++i) {
                  this.gmTestMail(player, 0);
               }
               break;
            case "additemtomail":
               this.gmItemToMail(player, order[2]);
               break;
            case "worldboss":
               String[] cmdArr = order[2].split("\\|");
               int bossType = Integer.parseInt(cmdArr[1]);
               switch (cmdArr[0]) {
                  case "open":
                     this.worldBossMgr.open(bossType);
                     return;
                  case "close":
                     this.worldBossMgr.close(bossType);
                     return;
                  case "reset":
                     this.worldBossPersonalReset(player);
                     return;
                  case "damage":
                     this.worldBossTotalDamage(player, bossType);
                     return;
                  default:
                     return;
               }
            case "addmonarch":
               String[] monarch = order[2].split(",");
               this.gmSetMonarch(player, monarch);
               break;
            case "monarch":
               MonarchPart monarchPart = (MonarchPart)player.getMgrPart(MonarchPart.class);
               monarchPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "recharge":
               String[] rechargeInfo = order[2].split(",");
               String extra = rechargeInfo[1];
               String[] extraArr = extra.split("\\|");
               RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("custom_recharge", extraArr[0] + "-" + extraArr[1] + "-" + Integer.parseInt(rechargeInfo[0]));
               if (order.length == 3) {
                  player.pushTask(() -> {
                     PlayerRechargePart playerRechargePart = (PlayerRechargePart)player.getMgrPart(PlayerRechargePart.class);
                     playerRechargePart.recharge("", "", rechargeModel, Integer.parseInt(extraArr[2]), 7, 1705, "");
                  });
               } else if (order.length == 4 && "true".equals(order[3])) {
                  RechargeController rechargeController = (RechargeController)ApplicationContextProvider.getContext().getBean(RechargeController.class);
                  RechargeNotifyData rechargeNotifyData = new RechargeNotifyData();
                  rechargeNotifyData.setBillNo(UUID.randomUUID().toString().replaceAll("-", ""));
                  rechargeNotifyData.setMoney(Integer.parseInt(rechargeInfo[0]));
                  rechargeNotifyData.setExtra(extraArr[0] + "|" + this.worldMgr.GAME_SERVER_ID + "|" + player.getAccount() + "|" + player.getPlayerId() + "|" + extraArr[1] + "|" + extraArr[2] + "|" + DateUtil.getIntTime(System.currentTimeMillis()));
                  rechargeNotifyData.setData_to_client("com.xxsy600.tw|60元宝|0.88");
                  Map<String, String> params = new HashMap();

                  for(Field field : RechargeNotifyData.class.getDeclaredFields()) {
                     if (!field.getName().equals("sign")) {
                        field.setAccessible(true);

                        try {
                           if (field.get(rechargeNotifyData) != null) {
                              params.put(field.getName(), URLEncoder.encode(field.get(rechargeNotifyData).toString() + "", "UTF-8"));
                           }
                        } catch (Exception e) {
                           e.printStackTrace();
                        }
                     }
                  }

                  String sign = SignUtil.sign(params, rechargeController.rechargeKey, true);
                  rechargeNotifyData.setSign(sign);
                  rechargeController.rechargeNotify(rechargeNotifyData);
               }
               break;
            case "firstrecharge":
               if (order[2].toLowerCase().equals("beforetime")) {
                  int day = Integer.parseInt(order[3]);
                  this.gmFirstRechargeTime(player, day);
               }
               break;
            case "krrecharge":
               PlayerRechargePart playerRechargePart = (PlayerRechargePart)player.getMgrPart(PlayerRechargePart.class);
               playerRechargePart.gmOp(order[2]);
               break;
            case "cargoship":
               this.gmCargoShip(player, order[2]);
               break;
            case "ceshi":
               player.pushTask(() -> player.runTest(order[2]));
               break;
            case "addcdkey":
               this.gmCDKey(player, order[2]);
               break;
            case "unionwar":
               switch (order[2]) {
                  case "status":
                     int status = Integer.parseInt(order[3]);
                     this.gmUnionWarStatus(status);
                     return;
                  default:
                     return;
               }
            case "chapter":
               this.gmChapter(player, Integer.parseInt(order[2]));
               break;
            case "plot":
               String[] plotBattleIds = order[2].split(",");
               int plot1 = Integer.parseInt(plotBattleIds[0]);
               int plot2 = Integer.parseInt(plotBattleIds[1]);
               PlotBattleModel plotBattleModel1 = (PlotBattleModel)ApplicationContextProvider.getModelPoolEntity("plotBattle", plot1);
               PlotBattleModel plotBattleModel2 = (PlotBattleModel)ApplicationContextProvider.getModelPoolEntity("plotBattle", plot2);
               BattlePKTeam leftPkTeam = new BattlePKTeam(plotBattleModel1);
               leftPkTeam.setBelongName("1");
               BattlePKTeam rightPkTeam = new BattlePKTeam(plotBattleModel2);
               rightPkTeam.setBelongName("2");
               BattleScene plotScene = new BattleScene(1014, 1);
               plotScene.addPKTeam(leftPkTeam, rightPkTeam);
               BattleMsg.S2C_BattleResult_6102.Builder plotBattleMsg = plotScene.fight((byte)20);
               player.sendMsg(plotBattleMsg.build());
               break;
            case "tongque":
               TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)player.getMgrPart(TongqueTerracePart.class);
               String[] tongqueOrder = order[2].split(",");
               switch (tongqueOrder[0]) {
                  case "time":
                     tongqueTerracePart.gmClearStartTime();
                     return;
                  case "maxlv":
                     tongqueTerracePart.testOneKeyLvUp();
                     return;
                  case "unlock":
                     tongqueTerracePart.gmUnlockBeauty(Integer.valueOf(tongqueOrder[1]));
                     return;
                  case "setbeautylv":
                     tongqueTerracePart.setBeautyLv(Integer.valueOf(tongqueOrder[1]), Integer.valueOf(tongqueOrder[2]));
                     return;
                  case "addall":
                     tongqueTerracePart.gmAddAll();
                     return;
                  default:
                     return;
               }
            case "openladder":
               LadderPart ladderPart = (LadderPart)player.getMgrPart(LadderPart.class);
               int status = Integer.parseInt(order[2]);
               ladderPart.gmOpenLadder(status);
               break;
            case "redcliff":
               RedCliffPart redCliffPart = (RedCliffPart)player.getMgrPart(RedCliffPart.class);
               redCliffPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "artifactopen":
               ArtifactPart artifactPart = (ArtifactPart)player.getMgrPart(ArtifactPart.class);
               artifactPart.unlockArtifact();
               break;
            case "artifactstrong":
               ArtifactPart artifactPart_1 = (ArtifactPart)player.getMgrPart(ArtifactPart.class);
               artifactPart_1.addArtifactStrongLv(Integer.parseInt(order[2]));
               break;
            case "artifactaddrefine":
               ArtifactPart artifactPart_2 = (ArtifactPart)player.getMgrPart(ArtifactPart.class);
               artifactPart_2.addArtifactRefineLv(Integer.parseInt(order[2]));
               break;
            case "artifactresetlv":
               ArtifactPart artifactPart_3 = (ArtifactPart)player.getMgrPart(ArtifactPart.class);
               artifactPart_3.resetLv();
               break;
            case "nw":
               ActivityNewWeekPart part = (ActivityNewWeekPart)player.getMgrPart(ActivityNewWeekPart.class);
               part.gmTest(order[2]);
               break;
            case "battletower":
               this.gmBattleTower(player, Integer.parseInt(order[2]));
               break;
            case "trailtower":
               this.gmTrailTower(player, Integer.parseInt(order[2]));
               break;
            case "yzchapter":
               this.gmYZChapter(player, Integer.parseInt(order[2]));
               break;
            case "setday":
               this.gmSetDay(player, order[2]);
               break;
            case "helpme":
               player.testData();
               break;
            case "kingcp":
               KingOfCentralPlainsMgr kingOfCentralPlainsMgr = (KingOfCentralPlainsMgr)ApplicationContextProvider.getContext().getBean(KingOfCentralPlainsMgr.class);
               String kingOrder = order[2];
               if ("clear".equals(kingOrder)) {
                  kingOfCentralPlainsMgr.testClear();
               } else if ("start".equals(kingOrder)) {
                  kingOfCentralPlainsMgr.activityStart(true, false);
               } else if ("guessui".equals(kingOrder)) {
                  int round = 1;
                  if (order.length > 3) {
                     round = Integer.valueOf(order[3]);
                  }

                  kingOfCentralPlainsMgr.gmOpenOpenGuessUi(player, round);
               }
               break;
            case "removeyz":
               this.gmRemoveYZ(player, Integer.parseInt(order[2]));
               break;
            case "resetyz":
               this.gmResetyz(player, Integer.parseInt(order[2]));
               break;
            case "finishyz":
               this.gmFinishyz(player, Integer.parseInt(order[2]));
               break;
            case "jingzhoureset":
               JingzhouWarPart jingzhouWarPart = (JingzhouWarPart)player.getMgrPart(JingzhouWarPart.class);
               jingzhouWarPart.gmReset();
               break;
            case "union":
               this.gmUnion(player, order[2]);
               break;
            case "magicbook":
               this.gmMagicBook(player, order[2]);
               break;
            case "battle":
               BattlePKTeam battlePKTeam1 = new BattlePKTeam(Integer.parseInt(order[2]));
               BattlePKTeam battlePKTeam2 = new BattlePKTeam(Integer.parseInt(order[2]));
               BattleScene scene1 = new BattleScene(1040, 1);
               scene1.addPKTeam(battlePKTeam1, battlePKTeam2);
               BattleMsg.S2C_BattleResult_6102.Builder battleMsg1 = scene1.fight((byte)20);
               player.sendMsg(battleMsg1.build());
               break;
            case "battlerobot":
               int battleId = Integer.parseInt(order[2]);
               this.gmBattleRobot(player, battleId);
               break;
            case "country":
               CountryWarMgr countryWarMgr = (CountryWarMgr)ApplicationContextProvider.getContext().getBean(CountryWarMgr.class);
               CountryWarPart countryWarPart = (CountryWarPart)player.getMgrPart(CountryWarPart.class);
               String[] countryOrder = order[2].split(",");
               List<Integer> params = new ArrayList();
               switch (countryOrder[0]) {
                  case "serversocre":
                     params.add(Integer.valueOf(countryOrder[1]));
                     params.add(Integer.valueOf(countryOrder[2]));
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "cityserver":
                     params.add(Integer.valueOf(countryOrder[1]));
                     params.add(Integer.valueOf(countryOrder[2]));
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "cityreward":
                     params.add(Integer.valueOf(countryOrder[1]));
                     params.add(Integer.valueOf(countryOrder[2]));
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "setreward":
                     params.add(Integer.valueOf(countryOrder[1]));
                     params.add(Integer.valueOf(countryOrder[2]));
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "resetreward":
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "otime":
                     params.add(Integer.valueOf(countryOrder[1]));
                     String occTime = countryOrder[2];
                     long occLongTime = DateUtil.getLongTime(occTime, "yyyy-MM-dd HH:mm:ss");
                     params.add(Long.valueOf(occLongTime).intValue());
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "atoken":
                     countryWarPart.addAttToken(Integer.valueOf(countryOrder[1]));
                     return;
                  case "mtoken":
                     countryWarPart.addMoveToken(Integer.valueOf(countryOrder[1]));
                     return;
                  case "checkreward":
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "seasonreward":
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "stopSeason":
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "resedao":
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "playerscore":
                     params.add(Integer.valueOf(countryOrder[1]));
                     params.add(player.getPlayerId());
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "setmap":
                     params.add(Integer.valueOf(countryOrder[1]));
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "setcitystate":
                     params.add(Integer.valueOf(countryOrder[1]));
                     if (countryOrder.length > 2) {
                        params.add(Integer.valueOf(countryOrder[2]));
                     } else {
                        params.add(0);
                     }

                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  case "cleartransfertime":
                     countryWarMgr.crossGm(countryOrder[0], params);
                     return;
                  default:
                     return;
               }
            case "herotraining":
               BattleHeroTrainingPart heroTrainingPart = (BattleHeroTrainingPart)player.getMgrPart(BattleHeroTrainingPart.class);
               switch (order[2]) {
                  case "setstarttier":
                     heroTrainingPart.gmSetStartTier(Integer.parseInt(order[3]));
                     return;
                  case "setbattletime":
                     heroTrainingPart.gmBattleTime(order[3]);
                     return;
                  case "joinrandomrank":
                     List<GamePlayer> gamePlayers = new ArrayList(this.worldMgr.getPlayerMap().values());
                     Collections.shuffle(gamePlayers);

                     for(int i = 0; i < gamePlayers.size() && i < Integer.parseInt(order[3]); ++i) {
                        GamePlayer joinPlayer = (GamePlayer)gamePlayers.get(i);
                        joinPlayer.pushTask(() -> {
                           BattleHeroTrainingPart joinPlayerTrainingPart = (BattleHeroTrainingPart)joinPlayer.getMgrPart(BattleHeroTrainingPart.class);
                           joinPlayerTrainingPart.gmJoinRandomRank();
                        });
                     }

                     return;
                  case "reloadrank":
                     for(GamePlayer gamePlayer : this.worldMgr.getPlayerMap().values()) {
                        if (!gamePlayer.isRobot()) {
                           gamePlayer.pushTask(() -> {
                              BattleHeroTrainingPart resetPlayerTrainingPart = (BattleHeroTrainingPart)gamePlayer.getMgrPart(BattleHeroTrainingPart.class);
                              resetPlayerTrainingPart.reloadRank();
                           });
                        }
                     }
                     break label1640;
                  default:
                     return;
               }
            case "addallhero":
               this.gmAddAllHero(player);
               break;
            case "alliance":
               this.gmAlliance(player, order[2]);
               break;
            case "battlepower":
               this.gmAllBattlePower();
               break;
            case "printwarriors":
               this.gmPrintWarriors(player);
               break;
            case "battleid":
               this.gmBattleIdPower(player, order[2]);
               break;
            case "resetcountrytask":
               CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)player.getMgrPart(CountryWarTaskPart.class);
               countryWarTaskPart.resetAllTask();
               break;
            case "herorecruiment":
               HeroRecruitmentTestMgr heroRecruitmentTestMgr = (HeroRecruitmentTestMgr)ApplicationContextProvider.getContext().getBean(HeroRecruitmentTestMgr.class);
               heroRecruitmentTestMgr.pushTask(() -> {
                  int sleepNum = 0;
                  if (order.length > 3) {
                     sleepNum = 1;
                  }

                  heroRecruitmentTestMgr.testHeroRecruitment(Integer.valueOf(order[2]), sleepNum);
               });
               break;
            case "testpray":
               switch (order[2]) {
                  case "refresh":
                     this.gmTestPrayRefresh(player, order[3]);
                     return;
                  case "drawcard":
                     this.gmTestPrayDrawCard(player, order[3]);
                     return;
                  default:
                     return;
               }
            case "heroclub":
               HeroClubTestPart heroClubTestPart = (HeroClubTestPart)player.getMgrPart(HeroClubTestPart.class);
               heroClubTestPart.test();
               break;
            case "mart":
               MartPart martPart = (MartPart)player.getMgrPart(MartPart.class);
               martPart.gmTest(order[2]);
               break;
            case "giftcard":
               CdKeyPart cdKeyPart = (CdKeyPart)player.getMgrPart(CdKeyPart.class);
               cdKeyPart.cardExchange(order[2]);
               break;
            case "castsoul":
               CastSoulPart castSoulPart = (CastSoulPart)player.getMgrPart(CastSoulPart.class);
               castSoulPart.gmCastSoul(order[2]);
               break;
            case "peak":
               PeakBattlePart peakPart = (PeakBattlePart)player.getMgrPart(PeakBattlePart.class);
               peakPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "adventuretasktest":
               AdventureTaskTestPart adventureTaskTestPart = (AdventureTaskTestPart)player.getMgrPart(AdventureTaskTestPart.class);
               adventureTaskTestPart.test();
               break;
            case "divine":
               DivineGeneralsPart divineGeneralsPart = (DivineGeneralsPart)player.getMgrPart(DivineGeneralsPart.class);
               divineGeneralsPart.quickUpgrade(Integer.parseInt(order[2]));
               break;
            case "mine":
               this.gmMine(player, order[2]);
               break;
            case "crossgm":
               this.crossGm(order[2], player.getPlayerId());
               break;
            case "underpalace":
               UnderPalacePart underPalacePart = (UnderPalacePart)player.getMgrPart(UnderPalacePart.class);
               underPalacePart.gmOp(Integer.parseInt(order[2].split(",")[0]), Integer.parseInt(order[2].split(",")[1]));
               break;
            case "deleteheros":
               HeroBagPart heroBagPart1 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart1.gmDeleteHeros(Integer.parseInt(order[2]));
               break;
            case "composehero":
               ItemBagPart itemBagPart = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
               itemBagPart.gmTestComposeHero(Integer.parseInt(order[2]), Integer.parseInt(order[3]));
               break;
            case "setguidestep":
               player.updateGuideStep(Integer.parseInt(order[2]));
               break;
            case "removeguidestep":
               player.removeGuideStep(Integer.parseInt(order[2]));
               break;
            case "gift":
               GiftPart giftPart = (GiftPart)player.getMgrPart(GiftPart.class);
               giftPart.giftGm(order[2]);
               break;
            case "importgift":
               Map<Integer, ImportGiftModel> importGiftModelMap = ApplicationContextProvider.<Integer, ImportGiftModel>getModelPoolMap("importGift");
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

               for(ImportGiftModel importGiftModel : importGiftModelMap.values()) {
                  GamePlayer gamePlayer = worldMgr.getPlayerById(importGiftModel.getPlayerId());
                  if (gamePlayer != null) {
                     GiftPart playerGiftPart = (GiftPart)gamePlayer.getMgrPart(GiftPart.class);
                     playerGiftPart.pushTaskEx("importLimitGift", new Object[]{importGiftModel.getGiftId()});
                  }
               }
               break;
            case "changehero":
               ItemBagPart itemBagPart1 = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
               itemBagPart1.gmChangeHero(Integer.parseInt(order[2].split(",")[0]), Integer.parseInt(order[2].split(",")[1]));
               break;
            case "addherostate":
               HeroBagPart heroBagPart2 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart2.testAddHeroState(order[2]);
               break;
            case "delherostate":
               HeroBagPart heroBagPart3 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart3.testDelHeroState(order[2]);
               break;
            case "openserverrank":
               this.rankMgr.pushTask(() -> this.rankMgr.gmOp(Integer.parseInt(order[2])));
               break;
            case "reluckdraw":
               LuckDrawPart luckDrawPart = (LuckDrawPart)player.getMgrPart(LuckDrawPart.class);
               luckDrawPart.resetLuckDraw();
               break;
            case "reportplayer":
               this.deletePlayerChatInfo(Integer.parseInt(order[2]));
               break;
            case "delheroid":
               HeroBagPart heroBagPart_4 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart_4.gmDelHeroById(Integer.parseInt(order[2]));
               break;
            case "delherocode":
               HeroBagPart heroBagPart_5 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart_5.gmDelHeroByCode(Integer.parseInt(order[2]));
               break;
            case "battleidpro":
               BattleIdTestMgr battleIdTestMgr = (BattleIdTestMgr)ApplicationContextProvider.getContext().getBean(BattleIdTestMgr.class);
               battleIdTestMgr.test();
               break;
            case "herotheme":
               HeroThemePart heroThemePart = (HeroThemePart)player.getMgrPart(HeroThemePart.class);
               heroThemePart.gmHeroTheme(order[2]);
               break;
            case "recruiment":
               HeroRecruitmentTestMgr heroRecruitmentTestMgr_1 = (HeroRecruitmentTestMgr)ApplicationContextProvider.getContext().getBean(HeroRecruitmentTestMgr.class);
               heroRecruitmentTestMgr_1.test(player);
            case "herorank":
            default:
               break;
            case "fairyland":
               FairylandPart fairylandPart = (FairylandPart)player.getMgrPart(FairylandPart.class);
               fairylandPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "clearhorse":
               WarHorsePart warHorsePart = (WarHorsePart)player.getMgrPart(WarHorsePart.class);
               warHorsePart.clearHorse();
               break;
            case "horserandom":
               WarHorsePart warHorsePart1 = (WarHorsePart)player.getMgrPart(WarHorsePart.class);
               warHorsePart1.gmRandmoTest();
               break;
            case "horseskilltest":
               WarHorseTestPart warHorseTestPart = (WarHorseTestPart)player.getMgrPart(WarHorseTestPart.class);
               warHorseTestPart.gmHorseSkillTest();
               break;
            case "delartdress":
               ArtifactDressPart artifactDressPart = (ArtifactDressPart)player.getMgrPart(ArtifactDressPart.class);
               artifactDressPart.gmClearDress(Integer.parseInt(order[2]));
               break;
            case "openartdress":
               ArtifactDressPart artifactDressPart_1 = (ArtifactDressPart)player.getMgrPart(ArtifactDressPart.class);
               artifactDressPart_1.gmOpenArtifactDress(Integer.parseInt(order[2]));
               break;
            case "clearworlddress":
               ArtifactDressPart artifactDressPart_2 = (ArtifactDressPart)player.getMgrPart(ArtifactDressPart.class);
               artifactDressPart_2.gmClearWorldDress(Integer.parseInt(order[2]));
               break;
            case "unlockartifactdress":
               ArtifactDressPart artifactDressPart_3 = (ArtifactDressPart)player.getMgrPart(ArtifactDressPart.class);
               artifactDressPart_3.gmUnlockDress();
               break;
            case "testbattle":
               if (this.battleTestMgr == null) {
                  Environment env = ApplicationContextProvider.getContext().getEnvironment();
                  String heroPath = env.getProperty("heroPath");
                  BattleTestMgr.readyData(heroPath);
                  this.battleTestMgr = (BattleTestMgr)ApplicationContextProvider.getContext().getBean(BattleTestMgr.class);
                  BattleScene battleScene = this.battleTestMgr.testRandom();
                  BattleMsg.S2C_BattleResult_6102.Builder testMsg = battleScene.getBattleMsg();
                  player.sendMsg(testMsg.build());
                  int id = (int)(Math.random() * (double)Integer.MAX_VALUE);
                  int time = testMsg.getStartTime();
                  this.dbNettyClient.sendBattleMsg(testMsg.build(), this.GAME_SERVER_ID, id, time);
               } else {
                  BattleScene battleScene = this.battleTestMgr.testRandom();
                  BattleMsg.S2C_BattleResult_6102.Builder testMsg = battleScene.getBattleMsg();
                  player.sendMsg(testMsg.build());
                  int id = (int)(Math.random() * (double)Integer.MAX_VALUE);
                  int time = testMsg.getStartTime();
                  this.dbNettyClient.sendBattleMsg(testMsg.build(), this.GAME_SERVER_ID, id, time);
               }
               break;
            case "dragonstrengthen":
               this.gmDragonStrengthen(player, Integer.parseInt(order[2]));
               break;
            case "resetartifactdata":
               ArtifactActivityPart artifactActivityPart = (ArtifactActivityPart)player.getMgrPart(ArtifactActivityPart.class);
               artifactActivityPart.gmResetActivityData();
               break;
            case "treasurelv":
               TreasurePart treasurePart = (TreasurePart)player.getMgrPart(TreasurePart.class);
               treasurePart.gmOp(order[2]);
               break;
            case "dragonnum":
               DragonPart dragonPart = (DragonPart)player.getMgrPart(DragonPart.class);
               dragonPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "heroskin":
               HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)player.getMgrPart(HeroSkinActivityPart.class);
               heroSkinActivityPart.gmHeroSkin(order[2]);
               break;
            case "herodress":
               HeroDressPart heroDressPart = (HeroDressPart)player.getMgrPart(HeroDressPart.class);
               heroDressPart.gmHeroDress(order[2]);
               break;
            case "heromail":
               HeroMailPart heroMailPart = (HeroMailPart)player.getMgrPart(HeroMailPart.class);
               heroMailPart.gmHeroMail(order[2]);
               break;
            case "warnorth":
               WarNorthPart warNorthPart = (WarNorthPart)player.getMgrPart(WarNorthPart.class);
               warNorthPart.gmWarNorth(order[2]);
               break;
            case "addrunestone":
               RuneStonePart runeStonePart = (RuneStonePart)player.getMgrPart(RuneStonePart.class);
               runeStonePart.gmOp(order[2]);
               break;
            case "demonboss":
               DemonMgr demonMgr = (DemonMgr)ApplicationContextProvider.getContext().getBean(DemonMgr.class);
               demonMgr.gmOp(order[2], player);
               break;
            case "demonrotate":
               DemonRotateMgr demonRotateMgr = (DemonRotateMgr)ApplicationContextProvider.getContext().getBean(DemonRotateMgr.class);
               demonRotateMgr.gmOp(order[2], player);
               break;
            case "peakpacket":
               PeakRedPacketMgr peakRedPacketMgr = (PeakRedPacketMgr)ApplicationContextProvider.getContext().getBean(PeakRedPacketMgr.class);
               peakRedPacketMgr.gmOp(Integer.parseInt(order[2]), player.getPlayerId());
               break;
            case "testbox":
               ItemBagPart itemBagPart2 = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
               itemBagPart2.gmTestRandomBox(order[2]);
               break;
            case "pvp":
               PvpSeasonMgr pvpSeasonMgr = (PvpSeasonMgr)ApplicationContextProvider.getContext().getBean(PvpSeasonMgr.class);
               pvpSeasonMgr.gmTestPvp(order[2], player);
               break;
            case "stonecircle":
               StoneCirclePart stoneCirclePart = (StoneCirclePart)player.getMgrPart(StoneCirclePart.class);
               stoneCirclePart.gmOp(order[2]);
               break;
            case "playerextend":
               this.playerExtendUpdate(order[2], player);
               break;
            case "unionoffer":
               OfferPart offerPart = (OfferPart)player.getMgrPart(OfferPart.class);
               offerPart.gmOp(order[2]);
               break;
            case "hlwar":
               WarPart warPart = (WarPart)player.getMgrPart(WarPart.class);
               warPart.gmOp(order[2]);
               break;
            case "decisive":
               DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)player.getMgrPart(DecisiveBattlePart.class);
               decisiveBattlePart.gm(order[2]);
               break;
            case "dragonwar":
               DragonWarPart dragonWarPart = (DragonWarPart)player.getMgrPart(DragonWarPart.class);
               dragonWarPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "battlelog":
               DBServerMsg.S2DB_RequireLog_14503.Builder require = DBServerMsg.S2DB_RequireLog_14503.newBuilder();
               String[] requireArr = order[2].split(",");
               require.setId(Integer.parseInt(requireArr[0]));
               require.setTime((long)Integer.parseInt(requireArr[1]));
               this.dbNettyClient.sendMsg(require.build(), player.getPlayerId());
               break;
            case "battletemple":
               BattleTemplePart battleTemplePart = (BattleTemplePart)player.getMgrPart(BattleTemplePart.class);
               battleTemplePart.gmOp();
               break;
            case "beautytreasure":
               BeautyTreasurePart beautyTreasurePart = (BeautyTreasurePart)player.getMgrPart(BeautyTreasurePart.class);
               beautyTreasurePart.gmOp(Integer.parseInt(order[2]));
               break;
            case "otherlog":
               DBServerMsg.S2DB_RequireLog_14503.Builder requireLog = DBServerMsg.S2DB_RequireLog_14503.newBuilder();
               String[] requireArrLog = order[2].split(",");
               requireLog.setId(Integer.parseInt(requireArrLog[0]));
               requireLog.setTime((long)Integer.parseInt(requireArrLog[1]));
               this.dbNettyClient.sendMsg(requireLog.build(), player.getPlayerId(), 2, "dev", (byte)1);
               break;
            case "record":
               BattleRecordPart battleRecordPart = (BattleRecordPart)player.getMgrPart(BattleRecordPart.class);
               battleRecordPart.gmTestPlay(order[2]);
               break;
            case "wscomtest":
               WarriorSignetCompoundTestPart warriorSignetCompoundTestPart = (WarriorSignetCompoundTestPart)player.getMgrPart(WarriorSignetCompoundTestPart.class);
               warriorSignetCompoundTestPart.gmTest(order[2]);
               break;
            case "demonstrikes":
               DemonStrikesMgr demonStrikesMgr = (DemonStrikesMgr)ApplicationContextProvider.getContext().getBean(DemonStrikesMgr.class);
               switch (order[2]) {
                  case "resetData":
                     demonStrikesMgr.crossGm(player, "resetData", (List)null);
                     return;
                  case "setRandomReward":
                     List<Long> deParams = new ArrayList();
                     deParams.add(Long.parseLong(order[3]));
                     deParams.add(Long.parseLong(order[4]));
                     demonStrikesMgr.crossGm(player, "setRandomReward", deParams);
                     return;
                  case "settleRankReward":
                     List<Long> settleParams = new ArrayList();
                     if (order.length == 4) {
                        settleParams.add(Long.parseLong(order[3]));
                     }

                     demonStrikesMgr.crossGm(player, "settleRankReward", settleParams);
                     return;
                  case "npcGroupBack":
                     List<Long> npcGroupBackParams = new ArrayList();
                     npcGroupBackParams.add(Long.parseLong(order[3]));
                     npcGroupBackParams.add(Long.parseLong(order[4]));
                     demonStrikesMgr.crossGm(player, "npcGroupBack", npcGroupBackParams);
                     return;
                  case "inCityNpcBack":
                     List<Long> inCityNpcBackParams = new ArrayList();
                     inCityNpcBackParams.add(Long.parseLong(order[3]));
                     demonStrikesMgr.crossGm(player, "inCityNpcBack", inCityNpcBackParams);
                     return;
                  case "clearTransferCD":
                     demonStrikesMgr.crossGm(player, "clearTransferCD", (List)null);
                     return;
                  case "setCityState":
                     List<Long> setCityStateParams = new ArrayList();
                     setCityStateParams.add(Long.parseLong(order[3]));
                     setCityStateParams.add(Long.parseLong(order[4]));
                     demonStrikesMgr.crossGm(player, "setCityState", setCityStateParams);
                     return;
                  case "resetAllCityState":
                     demonStrikesMgr.crossGm(player, "resetAllCityState", (List)null);
                     return;
                  default:
                     return;
               }
            case "pet":
               PetPart petPart = (PetPart)player.getMgrPart(PetPart.class);
               petPart.gmTest(order[2]);
               break;
            case "duel":
               DuelPart duelPart = (DuelPart)player.getMgrPart(DuelPart.class);
               duelPart.gmOp(Integer.parseInt(order[2]));
               break;
            case "shopwarcrafttest":
               ShopWarcraftTestPart shopWarcraftTestPart = (ShopWarcraftTestPart)player.getMgrPart(ShopWarcraftTestPart.class);
               shopWarcraftTestPart.test();
               break;
            case "setiteminvalid":
               String[] thisParams = order[2].split(",");
               int item_id = Integer.parseInt(thisParams[0]);
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", item_id);
               if (itemModel == null) {
                  player.failure(37);
                  return;
               }

               ItemBagDao itemBagDao = (ItemBagDao)player.getData("tb_bag", player.getPlayerId());
               List<ItemBase> itemBases = itemBagDao.getItemById(item_id);
               if (itemBases == null || itemBases.isEmpty()) {
                  player.failure(2);
                  return;
               }

               ItemBase itemBase = (ItemBase)itemBases.get(0);
               itemBase.enableTime = DateUtil.getIntTime(DateUtil.parse(thisParams[1], "yyyy-MM-dd-HH-mm-ss").getTime());
               itemBagDao.updateOp();
               player.additemUpdateBuilder(itemBase);
               player.senditemUpdateMsg();
               if (itemModel.getSubclass() == 17) {
                  ChatBubblePart chatBubblePart = (ChatBubblePart)player.getMgrPart(ChatBubblePart.class);
                  chatBubblePart.checkBubbleInvalid(itemModel.getId());
               }
               break;
            case "warriorrecast":
               WarriorSignetRecastTestPart warriorSignetRecastTestPart = (WarriorSignetRecastTestPart)player.getMgrPart(WarriorSignetRecastTestPart.class);
               warriorSignetRecastTestPart.gmTest();
               break;
            case "forbidchat":
               GmMgr gmMgr = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
               String[] chatParams = order[2].split(",");
               gmMgr.gmForbidChat(Integer.parseInt(chatParams[0]), Integer.parseInt(chatParams[1]));
               break;
            case "loadonlineplayer":
               int maxOnlineNum = Integer.parseInt(order[2]);
               List<GamePlayer> gamePlayerList = new ArrayList(this.worldMgr.getAllPlayer());
               Collections.shuffle(gamePlayerList);

               for(int i = 0; i < gamePlayerList.size() && maxOnlineNum > 0; ++i) {
                  GamePlayer gamePlayer = (GamePlayer)gamePlayerList.get(i);
                  if (!gamePlayer.isRobot()) {
                     PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                     if (!StringUtils.isEmpty(playerPublicDao.playerName)) {
                        this.worldMgr.getOnlinePlayerMap().put(gamePlayer.getPlayerId(), gamePlayer);
                        gamePlayer.pushTask(() -> gamePlayer.login(false));
                        --maxOnlineNum;
                     }
                  }
               }
               break;
            case "outlineplayer":
               int maxOutlineNum = Integer.parseInt(order[2]);

               for(int i = 0; i < this.worldMgr.getOnlinePlayer().size() && maxOutlineNum > 0; ++i) {
                  GamePlayer gamePlayer = (GamePlayer)this.worldMgr.getOnlinePlayer().get(i);
                  if (!gamePlayer.isRobot()) {
                     this.worldMgr.getOnlinePlayerMap().remove(gamePlayer.getPlayerId());
                     gamePlayer.pushTask(gamePlayer::logout);
                     --maxOutlineNum;
                  }
               }
               break;
            case "wechatgift":
               GmMgr gmMgr1 = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
               switch (order[2]) {
                  case "open":
                     String[] weChatGiftInfoContent = order[3].split(",");
                     gmMgr1.weChatGiftInfo = new WeChatGiftInfo();
                     gmMgr1.weChatGiftInfo.setOpen_level(Integer.parseInt(weChatGiftInfoContent[0]));
                     gmMgr1.weChatGiftInfo.setBackground(Integer.parseInt(weChatGiftInfoContent[1]));
                     gmMgr1.weChatGiftInfo.setWechat_account("公众号名称100个英文");
                     gmMgr1.weChatGiftInfo.setWechat_account_article("公众号内容500个字");
                     gmMgr1.weChatGiftInfo.setWechat_subscribe("订阅号名称99个英文");
                     gmMgr1.weChatGiftInfo.setWechat_subscribe_article("订阅号内容102个字");
                     Map<String, String> qrcodeUrl = new HashMap();
                     qrcodeUrl.put("0", "1,1|http://192.168.10.66:10001/11.jpg");
                     qrcodeUrl.put("1", "2,2|http://192.168.10.66:10001/22.jpg");
                     qrcodeUrl.put("2", "3,3|http://192.168.10.66:10001/11.jpg");
                     gmMgr1.weChatGiftInfo.setQrcode_url(qrcodeUrl);
                     gmMgr1.weChatGiftInfo.setPlayer_communication_group("QQ36474747");
                     gmMgr1.weChatGiftInfo.setPlayer_communication_article("大家一起来艹B");
                     gmMgr1.weChatGiftInfo.setUpdate_time(DateUtil.getIntTime(System.currentTimeMillis()));
                     gmMgr1.weChatGiftInfo.setServerQrCodeUrl("http://192.168.10.66:10001/33.png");
                     gmMgr1.sendWeChatGiftInfo((GamePlayer)null);
                     return;
                  case "close":
                     gmMgr1.weChatGiftInfo = null;
                     gmMgr1.sendWeChatGiftInfo((GamePlayer)null);
                     return;
                  default:
                     return;
               }
            case "crossdeer":
               CatchDeerMgr catchDeerMgr = (CatchDeerMgr)ApplicationContextProvider.getContext().getBean(CatchDeerMgr.class);
               catchDeerMgr.crossGm(order[2]);
               break;
            case "chongyang":
               ChongYangPart chongYangPart = (ChongYangPart)player.getMgrPart(ChongYangPart.class);
               chongYangPart.gmTest(order[2]);
               break;
            case "starsactivity":
               StarsActivityPart starsActivityPart = (StarsActivityPart)player.getMgrPart(StarsActivityPart.class);
               starsActivityPart.gmTest(order[2]);
               break;
            case "swimparkactivity":
               SwimParkActivityPart swimParkActivityPart = (SwimParkActivityPart)player.getMgrPart(SwimParkActivityPart.class);
               swimParkActivityPart.gmTest(order[2]);
               break;
            case "flowerfireactivity":
               FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)player.getMgrPart(FlowerFireActivityPart.class);
               flowerFireActivityPart.gmTest(order[2]);
               break;
            case "guanjia":
               GuanJiaPart guanJiaPart = (GuanJiaPart)player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.gmTest(order[2]);
               break;
            case "wechat":
               BattleChapterPart battleChapterPart = (BattleChapterPart)player.getMgrPart(BattleChapterPart.class);
               battleChapterPart.gmTest(order[2]);
               break;
            case "thanksgiving":
               ActivityThanksgivingDao activityThanksgivingDao = (ActivityThanksgivingDao)player.getData("tb_activity_thanksgiving", player.getPlayerId());
               activityThanksgivingDao.taskPoint = Integer.parseInt(order[3]);
               activityThanksgivingDao.updateOp();
               ThanksgivingDayPart thanksgivingDayPart = (ThanksgivingDayPart)player.getMgrPart(ThanksgivingDayPart.class);
               thanksgivingDayPart.C2S_Main_17001((ThanksgivingDayMsg.C2S_Main_17001)null, (String)null);
               break;
            case "uniongate":
               String subOrder = order[2];
               UnionDailyGuessPart mgrPart = (UnionDailyGuessPart)player.getMgrPart(UnionDailyGuessPart.class);
               mgrPart.gmTest(subOrder);
               break;
            case "initmonster":
               MonsterMgr monsterMgr = (MonsterMgr)ApplicationContextProvider.getContext().getBean(MonsterMgr.class);
               monsterMgr.pushTaskEx("gmReset", new Object[0]);
               break;
            case "addall":
               HeroBagPart heroBagPart4 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart4.addAllItemsAndHeros(true, true);
               break;
            case "copyplayer":
               CopyPlayerTest copyPlayerTest = (CopyPlayerTest)player.getMgrPart(CopyPlayerTest.class);
               copyPlayerTest.copyPlayer(Integer.valueOf(order[2]));
               break;
            case "spcity":
               SplendidCityPart splendidCityPart = (SplendidCityPart)player.getMgrPart(SplendidCityPart.class);
               splendidCityPart.gmTest(order[2]);
               break;
            case "splendidgame":
               SplendidCityPart splendidCityPart1 = (SplendidCityPart)player.getMgrPart(SplendidCityPart.class);
               splendidCityPart1.gameGm(order[2]);
               break;
            case "serveropenday":
               player.failure(53, "当前开服第" + (DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1) + "天");
               break;
            case "levelpromote":
               LevelPromotePart levelPromotePart = (LevelPromotePart)player.getMgrPart(LevelPromotePart.class);
               levelPromotePart.gmTest(order[2]);
               break;
            case "addallitem":
               HeroBagPart heroBagPart5 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart5.addAllItemsAndHeros(false, false);
               break;
            case "inviteplayer":
               this.rankMgr.updateRank(RankDefine.RankModule.WECHAT_INVITE, (long)Integer.parseInt(order[2]), player.getPlayerId());
               this.rankMgr.updateRank(RankDefine.RankModule.S_VIP_INVITE, (long)Integer.parseInt(order[2]), player.getPlayerId());
               break;
            case "collectspecialrecord":
               SpecialRecordMgr specialRecordMgr = (SpecialRecordMgr)ApplicationContextProvider.getContext().getBean(SpecialRecordMgr.class);
               specialRecordMgr.collectSpecialRecord();
               break;
            case "queryspecialrecord":
               BattleRecordPart battleRecordPart1 = (BattleRecordPart)player.getMgrPart(BattleRecordPart.class);
               int page = Integer.parseInt(order[2]);
               int pageSize = Integer.parseInt(order[3]);
               List<Integer> nationList = new ArrayList();

               for(String s : order[4].split("\\|")) {
                  nationList.add(Integer.parseInt(s));
               }

               battleRecordPart1.sendSpecialRecords(page, pageSize, nationList);
               break;
            case "watchspecialrecord":
               BattleRecordPart battleRecordPart2 = (BattleRecordPart)player.getMgrPart(BattleRecordPart.class);
               battleRecordPart2.watchSpecialRecord(Long.parseLong(order[2]));
               break;
            case "miniinvite":
               MiniProgramPart miniProgramPart = (MiniProgramPart)player.getMgrPart(MiniProgramPart.class);
               GamePlayer beInvitePlayer = this.worldMgr.getGamePlayerByAccount(order[2], this.worldMgr.GAME_SERVER_ID);
               if (beInvitePlayer == null) {
                  player.failure(17);
                  return;
               }

               miniProgramPart.invitePlayer(order[2]);
               break;
            case "mergefinish":
               MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
               HashSet<Integer> slaveServerSet = new HashSet();
               slaveServerSet.add(this.GAME_SERVER_ID);

               try {
                  mergeActivityMgr._mainServerMergeFinish(slaveServerSet);
               } catch (Exception e) {
                  e.printStackTrace();
               }
               break;
            case "mergemainbegin":
               GmMgr gmMgr2 = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
               gmMgr2.gmMergeMainBegin(order[2]);
               break;
            case "mergeslavebegin":
               GmMgr gmMgr3 = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
               gmMgr3.gmMergeSlaveBegin(order[2]);
               break;
            case "protolog":
               boolean open = order[2].equals("open");
               Set<Integer> cmd = new HashSet();
               cmd.add(0);
               if (open && order.length > 3) {
                  cmd.clear();

                  for(String s : order[3].split(",")) {
                     cmd.add(Integer.parseInt(s));
                  }
               }

               GameServerHandler.setProtoLogState(open, cmd);
               break;
            case "setgemscore":
               String scoreStr = order[2];
               long score = Long.parseLong(scoreStr);
               RankPart rankPart = (RankPart)player.getMgrPart(RankPart.class);
               rankPart.updateRank(RankDefine.RankModule.STONE_RUSH, score, false);
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)player.getCustomCache("tb_player_reset", player.getPlayerId());
               playerResetCustomCache.setForever(202, score);
               break;
            case "printgemranks":
               String numStr = order[2];
               int limitCount = 999;
               if (StringUtil.isNotBlank(numStr)) {
                  limitCount = Integer.parseInt(numStr);
               }

               for(RankData mergeRushRank : this.rankMgr.getMergeRushRanks(RankDefine.RankModule.STONE_RUSH, limitCount)) {
                  logger.info("宝石榜排名>>> 玩家id:{},排名:{},分数:{}", new Object[]{mergeRushRank.value, mergeRushRank.rank, mergeRushRank.score});
               }
               break;
            case "onekeyupgrade":
               HeroUpgradePart upgradePart = (HeroUpgradePart)player.getMgrPart(HeroUpgradePart.class);
               upgradePart.gmTestOneKeyHeroUpdateStar();
               break;
            case "crosspk":
               switch (order[2]) {
                  case "list":
                     FriendPart friendPart = (FriendPart)player.getMgrPart(FriendPart.class);
                     friendPart.sendCrossPKListReq((long)Integer.parseInt(order[3]), (long)Integer.parseInt(order[4]), order.length > 5 && !StringUtils.isEmpty(order[5]) ? order[5].trim() : null);
                     return;
                  case "fight":
                     PlayerChatPart playerChatPart = (PlayerChatPart)player.getMgrPart(PlayerChatPart.class);
                     ChatMsg.C2S_FightToFriend_6007.Builder crossPkMsg = ChatMsg.C2S_FightToFriend_6007.newBuilder();
                     crossPkMsg.setCross(true);
                     crossPkMsg.setPlayerId(Integer.parseInt(order[3]));
                     crossPkMsg.setServerId(Integer.parseInt(order[4]));
                     playerChatPart.fightToFriend(crossPkMsg.build(), "");
                     return;
                  default:
                     return;
               }
            case "allplayeruploadcross":
               for(GamePlayer gamePlayer : this.worldMgr.getAllPlayer()) {
                  gamePlayer.pushTask(gamePlayer::uploadCrossPlayer);
               }
               break;
            case "heropromote":
               HeroPromotePart heroPromotePart = (HeroPromotePart)player.getMgrPart(HeroPromotePart.class);
               heroPromotePart.gmTest(order[2]);
               break;
            case "heropalace":
               HeroPalacePart heroPalacePart = (HeroPalacePart)player.getMgrPart(HeroPalacePart.class);
               heroPalacePart.gmTest(order[2]);
               break;
            case "delmail":
               MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
               mailPart.gmDelAllMail();
               break;
            case "drawview":
               String[] drawParam = order[2].split(",");
               if (drawParam.length < 3) {
                  return;
               }

               int actType = Integer.parseInt(drawParam[0]);
               int lotteryId = Integer.parseInt(drawParam[1]);
               int round = Integer.parseInt(drawParam[2]);
               this.drawView(player, actType, lotteryId, round);
               break;
            case "addalldress":
               HeroDressPart heroDressPart_1 = (HeroDressPart)player.getMgrPart(HeroDressPart.class);
               TongqueTerracePart tongqueTerracePart_2 = (TongqueTerracePart)player.getMgrPart(TongqueTerracePart.class);
               ArtifactDressPart artifactDressPart_4 = (ArtifactDressPart)player.getMgrPart(ArtifactDressPart.class);
               Map<Integer, ItemModel> map = player.getGameModelPool().getMap("item");

               for(Map.Entry<Integer, ItemModel> entry : map.entrySet()) {
                  ItemModel itemModel_1 = (ItemModel)entry.getValue();
                  switch (itemModel_1.getUseFuncType()) {
                     case 15:
                        heroDressPart_1.addHeroDressByUseItem(itemModel_1);
                        break;
                     case 18:
                        tongqueTerracePart_2.unlockBeauty(itemModel_1.getUseFuncId());
                        break;
                     case 21:
                        artifactDressPart_4.addArtifactDress(itemModel_1.getUseFuncId());
                        break;
                     case 25:
                        artifactDressPart_4.addArtifactDressForver(itemModel_1.getUseFuncId());
                  }
               }

               heroDressPart_1.flushHero();
               break;
            case "mergewarboss":
               MergeWarBossPart mergeWarBossPart = (MergeWarBossPart)player.getMgrPart(MergeWarBossPart.class);
               mergeWarBossPart.gmTest(order[2]);
               break;
            case "mergewargame":
               MergeWarGamePart mergeWarGamePart = (MergeWarGamePart)player.getMgrPart(MergeWarGamePart.class);
               mergeWarGamePart.gmTest(order[2]);
               break;
            case "cmdsetavatar":
               GmMgr gmMgr4 = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
               String[] avatarInfo = order[2].split(",");
               gmMgr4.cmdSetAvatar(avatarInfo[0], avatarInfo[1], avatarInfo[2]);
               break;
            case "activitystatus":
               this.gmActivityStatus(Integer.parseInt(order[2]));
               break;
            case "activitynextstate":
               String[] infos = order[2].split(",");
               int activityId = Integer.parseInt(infos[0]);
               ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
               if (activityOpenTimeModel == null) {
                  logger.error("gm activitynextstate 错误，活动【{}】配置不存在", activityId);
               } else {
                  WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
                  ActivityInfo currentActivity = (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(activityOpenTimeModel.getActivityType());
                  GmMgr gmMgr5 = (GmMgr)ApplicationContextProvider.getContext().getBean(GmMgr.class);
                  if (currentActivity != null && currentActivity.open) {
                     gmMgr5.closeActivity(activityId);
                  } else {
                     int openDays = 7;
                     if (infos.length >= 2) {
                        openDays = Integer.parseInt(infos[1]);
                     }

                     long start = System.currentTimeMillis() / 1000L;
                     long end = start + (long)openDays * 86400000L / 1000L;
                     gmMgr5.settingActivity(activityId, start, end, 0);
                  }
               }
               break;
            case "addallrune":
               Integer runeNum = Integer.parseInt(order[2]);
               Map<Integer, RuneMainModel> allRuneMap = player.getGameModelPool().getMap("RuneMain");
               List<ResourceModel> allRuneResource = new ArrayList();

               for(Map.Entry<Integer, RuneMainModel> runeId_model : allRuneMap.entrySet()) {
                  allRuneResource.add(new ResourceModel(2, (Integer)runeId_model.getKey(), runeNum));
               }

               player.addResource(allRuneResource, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 7, 702, 0, 0, "");
               break;
            case "nextduelseasonend":
               player.failure(53, "下个比武大会结算时间:" + DateUtil.transferLongToDate(WuDaoDateModel.getNextSeasonSettleTime()));
               break;
            case "cleansingend":
               String[] cleansingInfo2 = order[2].split(",");
               LittleGameMsg.C2S_CleansingTowerFinish_20803.Builder cleansingendmsg = LittleGameMsg.C2S_CleansingTowerFinish_20803.newBuilder();
               cleansingendmsg.setChapter(Integer.parseInt(cleansingInfo2[0]));
               cleansingendmsg.setLevel(Integer.parseInt(cleansingInfo2[1]));
               LittleGamePart littleGamePart2 = (LittleGamePart)player.getMgrPart(LittleGamePart.class);
               littleGamePart2.C2S_CleansingTowerFinish_20803(cleansingendmsg.build(), "");
               break;
            case "cleansingbox":
               String[] cleansingInfo = order[2].split(",");
               LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804.Builder cleansingboxmsg = LittleGameMsg.C2S_CleansingTowerGetBoxReward_20804.newBuilder();
               cleansingboxmsg.setChapter(Integer.parseInt(cleansingInfo[0]));
               cleansingboxmsg.setBoxRewardIndex(Integer.parseInt(cleansingInfo[1]));
               LittleGamePart littleGamePart = (LittleGamePart)player.getMgrPart(LittleGamePart.class);
               littleGamePart.C2S_CleansingTowerGetBoxReward_20804(cleansingboxmsg.build(), "");
               break;
            case "armyarray":
               ArmyArrayPart armyArrayPart = (ArmyArrayPart)player.getMgrPart(ArmyArrayPart.class);
               armyArrayPart.gmTest(order[2]);
               break;
            case "addcomebackactpower":
               ActivityComeBackPart activityComeBackPart = (ActivityComeBackPart)player.getMgrPart(ActivityComeBackPart.class);
               ActivityComeBackDao activityComeBackDao = activityComeBackPart.getDao();
               int addComeBackPower = Integer.parseInt(order[2]);
               activityComeBackDao.power += addComeBackPower;
               activityComeBackDao.updateOp();
               activityComeBackPart.S2C_PowerUpdate_21218();
               break;
            case "hero":
               HeroBagPart heroBagPart6 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               heroBagPart6.gmTest(order[2]);
               break;
            case "combatpower":
               PlayerDao playerDao = player.getPlayerDao();
               playerDao.combat_power = (long)Math.max(1, Integer.parseInt(order[2]));
               playerDao.updateOp();
               player.notifyPlayerData(PlayerDefine.PLAYER_COMBAT_POWER_101, playerDao.combat_power);
               break;
            case "save":
               player.getGameCachePool().save();
               player.failure(1);
               break;
            case "setservertime":
               this.worldMgr.setOpenServerTime(order[2] + " " + order[3]);
               player.failure(1);
               break;
            case "reloadnationrank":
               for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
                  gamePlayer.getGameCachePool().save();
               }

               this.rankMgr.pushTask(() -> {
                  Map<Integer, HeroNationRankDao> heroNationRankMap = this.rankMgr.getHeroNationRankMap();

                  for(HeroNationRankDao heroNationRankDao : heroNationRankMap.values()) {
                     Map<Integer, RankRewardDao> rewardDaoMap = this.rankMgr.getGameCachePool().getMap("tb_rank_reward", new Object[]{RankRewardModel.HERO_NATION_RANK.getOrDefault(heroNationRankDao.nation, -1)});

                     for(RankRewardDao rankRewardDao : rewardDaoMap.values()) {
                        this.rankMgr.getGameCachePool().deleteDao(rankRewardDao, true);
                     }

                     this.rankMgr.getGameCachePool().deleteDao(heroNationRankDao, true);
                  }

                  this.rankMgr.initNationRank();
               });
               break;
            case "zhounianqing":
               AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)player.getMgrPart(AnniversaryCelebrationPart.class);
               anniversaryCelebrationPart.gmTest(order[2]);
               break;
            case "resethp":
               AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)player.getMgrPart(AnniversaryCelebrationPart.class);
               ActivityAnniversaryCelebrationDao dao = anniversaryCelebrationPart.getDao();
               dao.buyHPTime = 0;
               dao.updateOp();
               anniversaryCelebrationPart.sendTowerInfo(ActivityAnniversaryCelebrationMsg.TowerReturnType.OPEN_MAIN);
               break;
            case "worldcup":
               WorldCupPart worldCupPart = (WorldCupPart)player.getMgrPart(WorldCupPart.class);
               worldCupPart.gmOp(order[2]);
               break;
            case "sh":
               StonehengePart stonehengePart = (StonehengePart)player.getMgrPart(StonehengePart.class);
               stonehengePart.gmOp(order[2]);
               break;
            case "fq":
               FaQiuPart faQiuPart = (FaQiuPart)player.getMgrPart(FaQiuPart.class);
               faQiuPart.gmOp(order[2]);
               break;
            case "as":
               AncientSwordPart ancientSwordPart = (AncientSwordPart)player.getMgrPart(AncientSwordPart.class);
               ancientSwordPart.gmOp(order[2]);
               break;
            case "uploadall":
               for(GamePlayer gamePlayer : this.worldMgr.getPlayerMap().values()) {
                  if (gamePlayer.getPlayerId() > 20000) {
                     gamePlayer.uploadCrossPlayer();
                  }
               }

               player.failure(53, "本服所有玩家基础信息上传跨服成功！");
               break;
            case "kr":
               TurntablePart turntablePart = (TurntablePart)player.getMgrPart(TurntablePart.class);
               turntablePart.gmOp(order[2]);
               break;
            case "tw":
               FourteenSignInPart fourteenSignInPart = (FourteenSignInPart)player.getMgrPart(FourteenSignInPart.class);
               fourteenSignInPart.gmOp(order[2]);
               break;
            case "addgodbeast":
               String hatchLibIdStr = order[2];
               if (org.apache.commons.lang3.StringUtils.isBlank(hatchLibIdStr)) {
                  player.failure(6);
                  return;
               }

               int hatchLibId = Integer.parseInt(hatchLibIdStr);
               GodBeastPart godBeastPart = (GodBeastPart)player.getMgrPart(GodBeastPart.class);
               godBeastPart.gmAddGodBeast(hatchLibId);
               break;
            case "addgodbeast2":
               String[] itemId_proStr = order[2].split(",");
               if (itemId_proStr.length < 2) {
                  player.failure(6);
                  return;
               }

               int godBeastId = Integer.parseInt(itemId_proStr[0]);
               String[] proStrArr = itemId_proStr[1].split("\\|");
               if (null == proStrArr || proStrArr.length < 1) {
                  player.failure(6);
                  return;
               }

               Map<Integer, PropertyModel> attrMap = new HashMap();

               for(String proStr : proStrArr) {
                  String[] type_way_valStr = proStr.split(":");
                  if (type_way_valStr.length < 3) {
                     player.failure(6);
                     return;
                  }

                  int proType = Integer.parseInt(type_way_valStr[0]);
                  int proWay = Integer.parseInt(type_way_valStr[1]);
                  int proVal = Integer.parseInt(type_way_valStr[2]);
                  attrMap.put(proType, new PropertyModel(proType, proWay, (long)proVal));
               }

               GodBeastPart godBeastPart = (GodBeastPart)player.getMgrPart(GodBeastPart.class);
               godBeastPart.gmAddGodBeast(godBeastId, attrMap);
               break;
            case "godbeasthatch":
               int hatchNum = Integer.parseInt(order[2]);
               GodBeastPart godBeastPart = (GodBeastPart)player.getMgrPart(GodBeastPart.class);
               godBeastPart.gmGodBeastHatch(hatchNum);
               break;
            case "remgodbeasttaskprogress":
               GodBeastTaskPart godBeastTaskPart = (GodBeastTaskPart)player.getMgrPart(GodBeastTaskPart.class);
               godBeastTaskPart.gmClearGodBeastTaskProgress();
               break;
            case "taskprogress":
               String[] targetStr = order[2].split(",");
               if (targetStr.length < 3) {
                  player.failure(6);
                  return;
               }

               int targetType = Integer.parseInt(targetStr[0]);
               int targetId = Integer.parseInt(targetStr[1]);
               int targetValue = Integer.parseInt(targetStr[2]);
               player.triggerTask(targetType, targetId, (long)targetValue, 1);
               break;
            case "acteventherogift":
               ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)player.getMgrPart(ActivityEventHeroPart.class);
               eventHeroPart.gmTriggerOptionGift();
               ActivityKrEventHeroPart eventHeroPart1 = (ActivityKrEventHeroPart)player.getMgrPart(ActivityKrEventHeroPart.class);
               eventHeroPart1.gmTriggerOptionGift();
               break;
            case "remeventherogift":
               ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)player.getMgrPart(ActivityEventHeroPart.class);
               eventHeroPart.gmClearOptionGift();
               ActivityKrEventHeroPart eventHeroPart1 = (ActivityKrEventHeroPart)player.getMgrPart(ActivityKrEventHeroPart.class);
               eventHeroPart1.gmClearOptionGift();
               break;
            case "actheroimprove":
               ActHeroImprovePart actHeroImprovePart = (ActHeroImprovePart)player.getMgrPart(ActHeroImprovePart.class);
               actHeroImprovePart.gmTest(order[2]);
               KrActHeroImprovePart krActHeroImprovePart = (KrActHeroImprovePart)player.getMgrPart(KrActHeroImprovePart.class);
               krActHeroImprovePart.gmTest(order[2]);
               break;
            case "wanka":
               String[] paramStrArr = order[2].split(",");
               if (paramStrArr.length < 8) {
                  player.failure(6);
                  return;
               }

               long score1 = Long.parseLong(paramStrArr[0]);
               int level = Integer.parseInt(paramStrArr[1]);
               boolean binding = Boolean.parseBoolean(paramStrArr[2]);
               int discount = Integer.parseInt(paramStrArr[3]);
               int payReturnCount = Integer.parseInt(paramStrArr[4]);
               boolean isUsingCard = Boolean.parseBoolean(paramStrArr[5]);
               int realLevel = Integer.parseInt(paramStrArr[6]);
               long cardExpireTs = Long.parseLong(paramStrArr[7]);
               player.pushPartTaskEx(QqBigPlayerPart.class, "updateWanKaInfo", new Object[]{score1, level, binding, discount, payReturnCount, isUsingCard, realLevel, cardExpireTs});
               break;
            case "updatepayreturncount":
               int payReturnCount = Integer.parseInt(order[2]);
               player.pushPartTaskEx(QqBigPlayerPart.class, "updatePayReturnCount", new Object[]{payReturnCount});
               break;
            case "wankahighorder":
               int day = Integer.parseInt(order[2]);
               if (day < 0) {
                  player.failure(6);
                  return;
               }

               QqBigPlayerPart qqBigPlayerPart = (QqBigPlayerPart)player.getMgrPart(QqBigPlayerPart.class);
               qqBigPlayerPart.pushTaskEx("addHighOrder", new Object[]{day});
               break;
            case "clearwankaweekgift":
               QqBigPlayerPart qqBigPlayerPart = (QqBigPlayerPart)player.getMgrPart(QqBigPlayerPart.class);
               QqBigPlayerDao wanKaDao = qqBigPlayerPart.getDao();
               wanKaDao.recWeekGifts.clear();
               wanKaDao.updateOp();
               qqBigPlayerPart.sendInfoMsg();
               break;
            case "setcrossopenday":
               String[] actType_dayArr = order[2].split(",");
               int crossActType = Integer.parseInt(actType_dayArr[0]);
               int crossOpenDay = Integer.parseInt(actType_dayArr[1]);
               ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
               activityMgr.pushTask(() -> {
                  ActivityInfo activityInfo = activityMgr.getActivityInfo(crossActType);
                  if (null != activityInfo) {
                     activityInfo.crossActOpenDay = crossOpenDay;
                     activityMgr.updateActivityData();
                  }

               });
               break;
            case "uploadactcross":
               int actType = Integer.parseInt(order[2]);
               ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
               activityMgr.pushTask(() -> activityMgr.uploadCross(actType));
               break;
            case "setkrwelfareday":
               int day1 = Integer.parseInt(order[2]);
               KrSevenWelfarePart krSevenWelfarePart = (KrSevenWelfarePart)player.getMgrPart(KrSevenWelfarePart.class);
               KrSevenWelfareDao krSevenWelfareDao = krSevenWelfarePart.getDao();
               krSevenWelfareDao.curDay = day1;
               krSevenWelfareDao.updateCurDayTime = System.currentTimeMillis();
               krSevenWelfareDao.updateOp();
               krSevenWelfarePart.sendInfo();
               break;
            case "brood":
               String[] paramBrood = order[2].split(",");
               broodPart.handleGm(paramBrood[0], paramBrood.length == 1 ? "" : paramBrood[1]);
               break;
            case "clearewnotice":
               ExclusiveWeaponPart exclusiveWeaponPart = (ExclusiveWeaponPart)player.getMgrPart(ExclusiveWeaponPart.class);
               ExclusiveWeaponDao exclusiveWeaponDao = exclusiveWeaponPart.getDao();
               exclusiveWeaponDao.unlockNoticeIds.clear();
               exclusiveWeaponDao.updateOp();
               exclusiveWeaponPart.sendNoticeInfo();
               break;
            case "video":
               VideoRewardPart videoRewardPart = (VideoRewardPart)player.getMgrPart(VideoRewardPart.class);
               String[] videos = order[2].split(",");
               videoRewardPart.handleGm(videos[0], videos.length == 1 ? "" : videos[1]);
               break;
            case "generalwelfarecounter":
               GiftMgr giftMgr = (GiftMgr)ApplicationContextProvider.getContext().getBean(GiftMgr.class);
               giftMgr.pushTask(() -> giftMgr.generalWelfareCounter(Integer.parseInt(order[2]), Integer.parseInt(order[3])));
               break;
            case "giftbuy":
               GiftMsg.C2S_GiftBuy_8609.Builder builder = GiftMsg.C2S_GiftBuy_8609.newBuilder();
               builder.setBuyId(Integer.parseInt(order[2]));
               GiftPart giftPart1 = (GiftPart)player.getMgrPart(GiftPart.class);
               giftPart1.C2S_GiftBuy_8609(builder.build(), (String)null);
               break;
            case "copyheroarraying":
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)player.getMgrPart(HeroArrayingPart.class);
               String[] target_sourceArr = order[2].split(",");
               if (target_sourceArr.length < 2) {
                  player.failure(6);
                  return;
               }

               int targetArr = Integer.parseInt(target_sourceArr[0]);
               int sourceArr = Integer.parseInt(target_sourceArr[1]);
               heroArrayingPart.copyHeroArraying(CommonMsg.HeroState.forNumber(targetArr), CommonMsg.HeroState.forNumber(sourceArr));
               break;
            case "handleherorecall":
               HeroBagPart heroBagPart7 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               player.pushTask(() -> {
                  HeroDao heroDao = heroBagPart7.getHeroByCode(Integer.parseInt(order[2]));
                  heroDao.setStar(Integer.parseInt(order[3]));
                  heroDao.setLv(Integer.parseInt(order[4]));
                  heroDao.updateOp();
                  heroBagPart7.handleHeroRecall(heroDao, 4, 455);
               });
               break;
            case "heroinvalid":
               HeroBagPart heroBagPart8 = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
               String[] heroCode_minuteArr = order[2].split(",");
               int heroCode = Integer.parseInt(heroCode_minuteArr[0]);
               int seconds = Integer.parseInt(heroCode_minuteArr[1]);
               int invalidTime = (int)(System.currentTimeMillis() / 1000L + (long)seconds);
               HeroDao heroDao = heroBagPart8.getHeroByCode(heroCode);
               heroDao.invalidTime = invalidTime;
               heroDao.updateOp();
               heroBagPart8.sendHeroList2ClientByHeroDao(heroDao);
               break;
            case "delheroexperience":
               PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)player.getPlayerExtend(4);
               int heroid = Integer.parseInt(order[2]);
               playerHeroExtend.experience.remove(heroid);
               player.updatePlayerExtend(4);
               HeroMsg.S2C_ExperienceHero_5244.Builder resp = HeroMsg.S2C_ExperienceHero_5244.newBuilder();

               for(Map.Entry<Integer, Integer> entry : playerHeroExtend.experience.entrySet()) {
                  resp.addGot(CommonMsg.MapDataII.newBuilder().setKey((Integer)entry.getKey()).setValue((Integer)entry.getValue()));
               }

               player.sendMsg(resp.build());
               break;
            case "supremepvp":
               SupremePvpPart supremePvpPart = (SupremePvpPart)player.getMgrPart(SupremePvpPart.class);
               player.pushTask(() -> supremePvpPart.gm(order[2]));
               break;
            case "advvn":
               int id = Integer.parseInt(order[2]);
               AdvertisementVnPart advertisementVnPart = (AdvertisementVnPart)player.getMgrPart(AdvertisementVnPart.class);
               AdvertisementMsg.C2S_VNReward_21703.Builder vnMsg = AdvertisementMsg.C2S_VNReward_21703.newBuilder();
               vnMsg.setId(id);
               advertisementVnPart.reqReward(vnMsg.build(), "");
               break;
            case "addneidan":
               String[] itemId_entryId_lvStrArr = order[2].split(",");
               if (itemId_entryId_lvStrArr.length < 2) {
                  player.failure(6);
                  return;
               }

               int neiDanId = Integer.parseInt(itemId_entryId_lvStrArr[0]);
               int entryId = Integer.parseInt(itemId_entryId_lvStrArr[1]);
               int lv = itemId_entryId_lvStrArr.length > 2 ? Integer.parseInt(itemId_entryId_lvStrArr[2]) : 0;
               GodBeastNeiDanBaseModel baseModel = NeiDanDefine.getBaseModel(neiDanId);
               GodBeastNeiDanEntryModel entryModel = NeiDanDefine.getEntryModel(entryId);
               if (null == baseModel || entryModel == null) {
                  player.failure(37);
                  return;
               }

               NeiDanItem neiDanItem = new NeiDanItem(neiDanId, lv, 0, entryId, entryModel.getBaseAtt());
               NeiDanPart neiDanPart = (NeiDanPart)player.getMgrPart(NeiDanPart.class);
               neiDanPart.addNeiDanItem(neiDanItem, 7, 702, true);
               break;
            case "dragonveinclear":
               DragonVeinPart dragonVeinPart = (DragonVeinPart)player.getMgrPart(DragonVeinPart.class);
               DragonVeinDao dragonVeinDao = dragonVeinPart.getDao();
               dragonVeinDao.posSoul.clear();
               dragonVeinDao.bagSoul.clear();
               dragonVeinDao.updateOp();
               dragonVeinPart.sendDragonVeinInfo();
               break;
            case "dragonsoulvalreset":
               DragonVeinPart dragonVeinPart2 = (DragonVeinPart)player.getMgrPart(DragonVeinPart.class);
               DragonVeinDao dragonVeinDao2 = dragonVeinPart2.getDao();
               dragonVeinDao2.dragonSoulVal = 1;
               dragonVeinDao2.updateOp();
               dragonVeinPart2.sendDragonVeinInfo();
               break;
            case "dragonveinlv":
               int dragonVeinLv = Integer.parseInt(order[2]);
               DragonVeinPart dragonVeinPart3 = (DragonVeinPart)player.getMgrPart(DragonVeinPart.class);
               DragonVeinDao dragonVeinDao3 = dragonVeinPart3.getDao();
               dragonVeinDao3.dragonVeinLv = dragonVeinLv;
               dragonVeinDao3.updateOp();
               dragonVeinPart3.sendDragonVeinInfo();
               break;
            case "dragonsoulattr":
               String[] pos_soulLv_soulQuality = order[2].split(",");
               int pos = Integer.parseInt(pos_soulLv_soulQuality[0]);
               int soulLv = Integer.parseInt(pos_soulLv_soulQuality[1]);
               int soulQuality = Integer.parseInt(pos_soulLv_soulQuality[2]);
               List<HeroTypeAttrData> heroTypeAttrData = DragonVeinDefine.drawSoulAttr(pos, soulLv, soulQuality);
               System.err.println("计算得到的龙脉属性:" + heroTypeAttrData.toString());
         }

      }
   }

   public void drawView(GamePlayer player, int actType, int lotteryId, int round) {
      switch (actType) {
         case 32:
            MidAutumnPart midAutumnPart = (MidAutumnPart)player.getMgrPart(MidAutumnPart.class);
            midAutumnPart.drawView(lotteryId, round);
            break;
         case 34:
            GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)player.getMgrPart(GuoQingActivityPart.class);
            guoQingActivityPart.drawView(lotteryId, round);
            break;
         case 51:
            StarsActivityPart starsActivityPart = (StarsActivityPart)player.getMgrPart(StarsActivityPart.class);
            starsActivityPart.drawView(lotteryId, round);
            break;
         case 56:
            FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)player.getMgrPart(FlowerFireActivityPart.class);
            flowerFireActivityPart.drawView(lotteryId, round);
            break;
         case 57:
            SplendidCityPart splendidCityPart = (SplendidCityPart)player.getMgrPart(SplendidCityPart.class);
            splendidCityPart.drawView(lotteryId, round);
            break;
         case 66:
            YuanXiao2022ActivityPart yuanXiao2022ActivityPart = (YuanXiao2022ActivityPart)player.getMgrPart(YuanXiao2022ActivityPart.class);
            yuanXiao2022ActivityPart.drawView(lotteryId, round);
            break;
         case 75:
            LaborDayActivityPart laborDayActivityPart = (LaborDayActivityPart)player.getMgrPart(LaborDayActivityPart.class);
            laborDayActivityPart.drawView(lotteryId, round);
            break;
         case 79:
            ZongQingActivityPart zongQingActivityPart = (ZongQingActivityPart)player.getMgrPart(ZongQingActivityPart.class);
            zongQingActivityPart.drawView(lotteryId, round);
            break;
         case 82:
            ActivityEventHeroPart activityEventHeroPart = (ActivityEventHeroPart)player.getMgrPart(ActivityEventHeroPart.class);
            activityEventHeroPart.drawView(lotteryId, round);
            break;
         case 83:
            QiXiActivityPart qiXiActivityPart = (QiXiActivityPart)player.getMgrPart(QiXiActivityPart.class);
            qiXiActivityPart.drawView(lotteryId, round);
            break;
         case 91:
            AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)player.getMgrPart(AnniversaryCelebrationPart.class);
            anniversaryCelebrationPart.drawView(lotteryId, round);
            break;
         case 101:
            ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)player.getMgrPart(ActGoldWeekPart.class);
            actGoldWeekPart.drawView(lotteryId, round);
            break;
         case 107:
            ChildActPart childActPart = (ChildActPart)player.getMgrPart(ChildActPart.class);
            childActPart.drawView(lotteryId, round);
            break;
         case 8001:
            MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
            mergeActivityHeFuKuangHuanPart.drawView(lotteryId, round);
            break;
         default:
            logger.error("没有写对应活动 activityType:{}", actType);
            player.failure(0);
      }

   }

   public void playerExtendUpdate(String cmd, GamePlayer gamePlayer) {
      String[] orders = cmd.split(",");
      PlayerExtend playerExtend = (PlayerExtend)gamePlayer.getPlayerExtend(13);
      switch (orders[0]) {
         case "clearmailtime":
            playerExtend.mailWorldTime = 0L;
            gamePlayer.updatePlayerExtend(13);
            break;
         case "clearmailid":
            playerExtend.mailWorldMaxId = 0;
            gamePlayer.updatePlayerExtend(13);
            break;
         case "guideStep":
            playerExtend.guideStep = Integer.parseInt(orders[1]);
            gamePlayer.updatePlayerExtend(13);
            break;
         case "storyId":
            playerExtend.storyId = Integer.parseInt(orders[1]);
            gamePlayer.updatePlayerExtend(13);
      }

   }

   public void crossGm(String cmd, int playerId) {
      CrossMsg.S2CR_CrossGm_4209.Builder msg = CrossMsg.S2CR_CrossGm_4209.newBuilder();
      msg.setCmd(cmd);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, msg.build());
   }

   private BattleModel parseTeam(String team, int side) {
      Map<String, String> teamMap = Splitter.on(",").withKeyValueSeparator(":").split(team);
      BattleModel battleModel = new BattleModel();

      for(Map.Entry<String, String> monster : teamMap.entrySet()) {
         BattleMonsterFun fun = new BattleMonsterFun();
         fun.setPos(Byte.parseByte((String)monster.getKey()));
         fun.setId(Integer.parseInt((String)monster.getValue()));
         int key = side * 10 + Integer.valueOf((String)monster.getKey());
         PkLvAndStarModel pkLvAndStarModel = (PkLvAndStarModel)ApplicationContextProvider.getModelPoolEntity("pkLvAndStar", key);
         fun.setLv(pkLvAndStarModel.getLv());
         fun.setStar(pkLvAndStarModel.getStar());
         battleModel.getMonsters().add(fun);
      }

      return battleModel;
   }

   private BattleModel parseTeam(int side, Map<Integer, Integer> heros) {
      BattleModel battleModel = new BattleModel();

      for(Map.Entry<Integer, Integer> entry : heros.entrySet()) {
         BattleMonsterFun fun = new BattleMonsterFun();
         fun.setPos((byte)((Integer)entry.getKey() - 1));
         fun.setId((Integer)entry.getValue());
         int key = side * 10 + (Integer)entry.getKey() - 1;
         PkLvAndStarModel pkLvAndStarModel = (PkLvAndStarModel)ApplicationContextProvider.getModelPoolEntity("pkLvAndStar", key);
         fun.setLv(pkLvAndStarModel.getLv());
         fun.setStar(pkLvAndStarModel.getStar());
         battleModel.getMonsters().add(fun);
      }

      return battleModel;
   }

   private void clearBag(GamePlayer player) {
      if (player != null) {
         ItemBagPart itemBagPart = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
         itemBagPart.clearBag();
      }
   }

   private void clearAllBag(GamePlayer player) {
      if (player != null) {
         ItemBagPart itemBagPart = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
         itemBagPart.clearAllBag();
      }
   }

   private void gmAddPlayerBase(GamePlayer player, int type, int value, int module, int reason, int misc1, int misc2, String misc3) {
      if (player != null) {
         player.modifyProperty(type, (long)value, module, reason, misc1, misc2, misc3, true);
      }
   }

   private void gmSetPlayerBase(GamePlayer player, int type, long value, int module, int reason, int misc1, int misc2, String misc3) {
      if (player != null) {
         player.updateProperty(type, value, module, reason, misc1, misc2, misc3);
      }
   }

   public void gmAddLvByExp(GamePlayer player, int addlv, int module, int reason, int misc1, int misc2, String misc3) {
      if (addlv > 0) {
         PlayerDao playerDao = player.getPlayerDao();
         int destLv = playerDao.lv + addlv;
         long totalExp = (long)(-playerDao.exp);
         Map<Integer, UpgradeModel> map = player.getGameModelPool().getMap("upgrade");
         UpgradeModel upgradeModel = (UpgradeModel)map.get(playerDao.lv);
         if (upgradeModel != null) {
            do {
               totalExp += (long)upgradeModel.getPlayerExp();
               upgradeModel = (UpgradeModel)map.get(upgradeModel.getLevel() + 1);
            } while(upgradeModel != null && upgradeModel.getLevel() < destLv);

            System.out.println("totalExp:" + totalExp);
            if (totalExp > 0L) {
               player.modifyProperty(PlayerDefine.PLAYER_EXP, (long)((int)totalExp), module, reason, misc1, misc2, misc3, true);
            }

         }
      }
   }

   private boolean gmUpdatePlayerItem(GamePlayer player, int id, int num, int module, int reason, int misc1, int misc2, String misc3) {
      if (player == null) {
         return false;
      } else {
         ItemModel itemModel = (ItemModel)player.getGameModelPool().getEntity("item", id);
         if (itemModel == null) {
            return player.failure(5);
         } else {
            if (itemModel.getCombine() == 1) {
               int maxCombine = ApplicationContextProvider.getConfigInt("normalItemMaxCombine", 9999);
               num = Math.min(maxCombine * 200, num);
            } else {
               num = Math.min(200, num);
            }

            if (num > 0) {
               player.addResource(2, id, num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, module, reason, misc1, misc2, misc3);
            } else if (num < 0) {
               player.delResource(2, id, (long)(-num), module, reason, misc1, misc2, misc3);
            }

            return true;
         }
      }
   }

   private boolean gmUpdatePlayerHero(GamePlayer player, int id, int num, int module, int reason, int misc1, int misc2, String misc3) {
      if (player == null) {
         return false;
      } else if (num > 100) {
         return player.failure(4);
      } else {
         HeroModel heroModel = (HeroModel)player.getGameModelPool().getEntity("hero", id);
         if (heroModel == null) {
            return player.failure(4100);
         } else {
            player.addResource(3, id, num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, module, reason, misc1, misc2, misc3);
            return true;
         }
      }
   }

   private void gmRemovePlayerItem(GamePlayer player, int id, int num, int module, int reason, int misc1, int misc2, String misc3) {
      if (player != null) {
         ItemBagPart itemBagPart = (ItemBagPart)player.getMgrPart(ItemBagPart.class);
         int totalNum = itemBagPart.getItemNum(id);
         if (num < 0 || num > totalNum) {
            num = totalNum;
         }

         itemBagPart.deleteItemById(id, num, module, reason, misc1, misc2, misc3, true);
      }
   }

   private void gmSetWorldLv(int worldLv) {
      if (worldLv >= 0) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         worldMgr.forceWorldLv(worldLv);
      }
   }

   private void gmSetMonarch(GamePlayer player, String[] str) {
      MonarchPart monarchPart = (MonarchPart)player.getMgrPart(MonarchPart.class);
      monarchPart.updateMonarchTitle(Integer.parseInt(str[0]), Integer.parseInt(str[1]), 0);
   }

   private void gmCentreAward(GamePlayer player, int centreAwardId) {
      MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
      CentreAwardModel centreAwardModel = (CentreAwardModel)player.getGameModelPool().getEntity("centreAward", centreAwardId);
      if (centreAwardModel != null) {
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), 604800000L, 7, 706);
      } else {
         player.failure(6);
      }

   }

   private void gmTestMail(GamePlayer player, int type) {
      MailDefine.MailType mailType = MailDefine.MailType.MAIL_TYPE_COMMON;
      if (type > 0) {
         mailType = MailDefine.MailType.MAIL_TYPE_SYSTEM;
      }

      MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
      List<ResourceModel> items = new ArrayList();
      items.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, 100));
      mailPart.addMailOfEffectTime(mailType, "标题", "内容", items, 604800000L, 7, 706);
   }

   private void gmItemToMail(GamePlayer player, String string) {
      List<ResourceModel> resourceModels = new ArrayList();
      String[] strArr = string.split("\\|");

      for(String cellStr : strArr) {
         String[] arr = cellStr.split(",");
         if (arr.length == 2) {
            resourceModels.add(new ResourceModel(2, Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
         }
      }

      if (resourceModels.size() > 0) {
         MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, "标题", "内容", resourceModels, 604800000L, 7, 706);
      }

   }

   private void gmCompleteTask(GamePlayer player, int taskModule, int taskId) {
      PlayerTaskPart playerTaskPart = (PlayerTaskPart)player.getMgrPart(PlayerTaskPart.class);

      for(AbstractTaskPart taskPart : player.getMgrParts(AbstractTaskPart.class)) {
         if (taskPart.getModule().moduleId == taskModule) {
            TaskData taskData = taskPart.getTask(taskId);
            if (taskData == null) {
               player.failure(0);
            } else {
               TaskTargetItem taskTargetItem = taskPart.getTargetItem(taskId);
               if (taskTargetItem == null) {
                  player.failure(0);
               } else {
                  taskData.tVal = taskTargetItem.getTargetValue();
                  taskData.complete();
                  List<TaskData> taskDataList = new ArrayList();
                  taskDataList.add(taskData);
                  taskPart.sendTaskList(taskDataList);
               }
            }
         }
      }

      playerTaskPart.completeTask(taskId);
   }

   private void gmResetTask(GamePlayer player) {
      PlayerTaskPart playerTaskPart = (PlayerTaskPart)player.getMgrPart(PlayerTaskPart.class);
      PlayerTaskExtend playerTaskExtend = (PlayerTaskExtend)player.getPlayerExtend(3);
      playerTaskExtend.doneTasks.clear();
      player.updatePlayerExtend(3);
      playerTaskPart.getTasksMap().values().forEach(TaskData::delete);
      playerTaskPart.trigger();
   }

   private void gmRemoveTask(GamePlayer player, int taskModule) {
      for(AbstractTaskPart taskPart : player.getMgrParts(AbstractTaskPart.class)) {
         if (taskPart.getModule().moduleId == taskModule) {
            Map<Integer, TaskData> tasksMap = player.getTasksMap(taskPart.getModule());
            if (tasksMap != null) {
               for(TaskData taskData : tasksMap.values()) {
                  taskData.delete();
               }
            }
         }
      }

   }

   private void gmTriggerTask(GamePlayer player, int taskModule) {
      player.pushTask(() -> {
         for(AbstractTaskPart taskPart : player.getMgrParts(AbstractTaskPart.class)) {
            if (taskPart.getModule().moduleId == taskModule) {
               taskPart.trigger();
               break;
            }
         }

      });
   }

   private void gmPrintTask(GamePlayer player) {
      BiFunction<TaskData, TaskDefine.TaskModule, String> getTaskDesc = (taskDatax, taskModule) -> {
         StringBuilder taskDescBuilder = new StringBuilder();
         String desc = "";
         String otherDesc = "";
         BaseModel baseModel = (BaseModel)ApplicationContextProvider.getModelPoolEntity(taskModule.excelName, taskDatax.id);
         if (baseModel != null) {
            try {
               Field[] fileds = baseModel.getClass().getDeclaredFields();

               for(Field field : fileds) {
                  if (field.getName().equalsIgnoreCase("taskDesc")) {
                     field.setAccessible(true);
                     desc = (String)field.get(baseModel);
                     break;
                  }

                  if (field.getName().equalsIgnoreCase("taskName")) {
                     field.setAccessible(true);
                     otherDesc = (String)field.get(baseModel);
                  }
               }
            } catch (Exception var11) {
               desc = "任务描述字段获取失败";
            }
         }

         if (desc.isEmpty()) {
            if (!otherDesc.isEmpty()) {
               desc = otherDesc;
            } else {
               desc = "未知任务";
            }
         }

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         String createTimeDesc = (new Timestamp((long)taskDatax.ctTime * 1000L)).toLocalDateTime().format(formatter);
         String completeTimeDesc = taskDatax.cpTime == 0 ? "?" : (new Timestamp((long)taskDatax.cpTime * 1000L)).toLocalDateTime().format(formatter);
         taskDescBuilder.append(String.format("task_id:%d (%s) 进度:%d 完成次数%d 状态:%d-%s 任务创建时间:(%s) 任务完成时间:(%s)", taskDatax.id, desc, taskDatax.tVal, taskDatax.count, taskDatax.state, taskDatax.state == 1 ? "进行中" : (taskDatax.state == 2 ? "完成未领取奖励" : (taskDatax.state == 3 ? "完成已领取" : "未知")), createTimeDesc, completeTimeDesc));
         return taskDescBuilder.toString();
      };
      StringBuilder stringBuilder = new StringBuilder();
      PlayerDao playerDao = player.getPlayerDao();
      stringBuilder.append(String.format("玩家 %d %s 的任务如下:\n", playerDao.playerId, playerDao.playerName));
      List<AbstractTaskPart> taskParts = player.<AbstractTaskPart>getMgrParts(AbstractTaskPart.class);
      taskParts.sort((l, r) -> {
         if (l.getModule().moduleId == r.getModule().moduleId) {
            return 0;
         } else {
            return l.getModule().moduleId < r.getModule().moduleId ? -1 : 1;
         }
      });

      for(AbstractTaskPart taskPart : taskParts) {
         Map<Integer, TaskData> tasksMap = player.getTasksMap(taskPart.getModule());
         if (tasksMap != null && !tasksMap.isEmpty()) {
            String taskModuleName = taskPart.getModule().moduleName;
            String excelName = taskPart.getModule().excelName;
            stringBuilder.append(String.format("\t%d-%s-%s-%s.xls:\n", taskPart.getModule().moduleId, taskPart.getClass().getSimpleName(), taskModuleName, excelName));

            for(TaskData taskData : tasksMap.values()) {
               stringBuilder.append(String.format("\t\t%s\n", getTaskDesc.apply(taskData, taskPart.getModule())));
            }
         }
      }

      System.out.println(stringBuilder.toString());
   }

   private void gmDailyReset(GamePlayer player) {
      PlayerDao playerDao = player.getPlayerDao();
      playerDao.updateTime = DateUtil.getSomeDayEndTime(System.currentTimeMillis() - 86400000L);
      playerDao.updateOp();
      PlayerResetPart playerResetPart = (PlayerResetPart)player.getMgrPart(PlayerResetPart.class);
      playerResetPart.playerReset(System.currentTimeMillis());
   }

   private void dailyResetAllPlayer() {
      this.worldMgr.getOnlinePlayer().forEach((onLinePlayer) -> onLinePlayer.pushTask(() -> this.gmDailyReset(onLinePlayer)));
   }

   private void mgrDailyReset() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      worldMgrPushTaskPart.mgrDailyReset(System.currentTimeMillis());
   }

   private void gmActivity(GamePlayer player, String gm) {
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      String[] cmd = gm.split("\\|");
      switch (cmd[0].toLowerCase()) {
         case "flush":
            activityMgr.pushTask(activityMgr::activityFlush);
            break;
         case "rotate":
            activityMgr.gmActivityRotate(player, Integer.parseInt(cmd[1]));
            break;
         case "heroraiseresttask":
            HeroRaisePart heroRaisePart = (HeroRaisePart)player.getMgrPart(HeroRaisePart.class);
            heroRaisePart.gmTaskGroupReset(Integer.parseInt(cmd[1]));
            break;
         case "monthlyfundresetend":
            MonthlyFundPart monthlyFundPart = (MonthlyFundPart)player.getMgrPart(MonthlyFundPart.class);
            monthlyFundPart.gmResetEnd(Integer.parseInt(cmd[1]));
            break;
         case "setrechargeday":
            int totalRechargeDay = Integer.parseInt(cmd[1]);
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)player.getData("tb_player_recharge", player.getPlayerId());
            playerRechargeDao.totalRechargeDay = MiscUtil.comboInteger(totalRechargeDay, DateUtil.getIntTime(System.currentTimeMillis()));
            playerRechargeDao.updateOp();
            player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_TOTAL_DAY, totalRechargeDay);
            break;
         case "addpoint":
            SevenDayTaskActivityPart sevenDayTaskActivityPart = (SevenDayTaskActivityPart)player.getMgrPart(SevenDayTaskActivityPart.class);
            sevenDayTaskActivityPart.gmAddPoint(Integer.parseInt(cmd[1]));
            break;
         case "resetweekendkoiblessing":
            WeekendKoiPart weekendKoiPart = (WeekendKoiPart)player.getMgrPart(WeekendKoiPart.class);
            weekendKoiPart.resetWeekendKoiBlessing();
            break;
         case "rotateall":
            activityMgr.gmActivityRotate((GamePlayer)null, 0);
            break;
         case "tongquefloorreset":
            TongQueParkPart tongQueParkPart = (TongQueParkPart)player.getMgrPart(TongQueParkPart.class);
            tongQueParkPart.gmFloorReset();
            break;
         case "setartifactactivetime":
            ThemeActivityDao themeActivityDao = (ThemeActivityDao)player.getData("tb_player_theme_activity", player.getPlayerId());
            themeActivityDao.artifactData.totalLineBoxes = Integer.parseInt(cmd[1]);
            themeActivityDao.updateOp();
            break;
         case "rainwaterprocess":
            activityMgr.pushTask(() -> {
               WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
               ((ActivityData)worldDao.jsonData).seedProcess = Integer.parseInt(cmd[1]);
               worldDao.updateOp();
               OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
               ThemeActivityMsg.S2C_RainTreeProcess_12920.Builder notifyMsg = ThemeActivityMsg.S2C_RainTreeProcess_12920.newBuilder();
               notifyMsg.setProcess(((ActivityData)worldDao.jsonData).seedProcess);
               onLineMgr.pushTask(() -> onLineMgr.onlineBroadcast(notifyMsg.build()));
            });
            break;
         case "setartifactdice":
            ThemeActivityDao themeActivityDao1 = (ThemeActivityDao)player.getData("tb_player_theme_activity", player.getPlayerId());
            if (Integer.parseInt(cmd[1]) == 1) {
               themeActivityDao1.artifactData.random = Integer.parseInt(cmd[2]);
               themeActivityDao1.updateOp();
            } else if (Integer.parseInt(cmd[1]) == 2) {
               themeActivityDao1.artifactData.appoint = Integer.parseInt(cmd[2]);
               themeActivityDao1.updateOp();
            }
            break;
         case "setnewartifactdice":
            ThemeActivityDao themeActivityDao2 = (ThemeActivityDao)player.getData("tb_player_theme_activity", player.getPlayerId());
            if (Integer.parseInt(cmd[1]) == 1) {
               themeActivityDao2.artifactRotateData.random = Integer.parseInt(cmd[2]);
               themeActivityDao2.updateOp();
            } else if (Integer.parseInt(cmd[1]) == 2) {
               themeActivityDao2.artifactRotateData.appoint = Integer.parseInt(cmd[2]);
               themeActivityDao2.updateOp();
            }
            break;
         case "setartifactskindice":
            ThemeActivityDao themeActivityDao3 = (ThemeActivityDao)player.getData("tb_player_theme_activity", player.getPlayerId());
            if (Integer.parseInt(cmd[1]) == 1) {
               themeActivityDao3.artifactSkinData.random = Integer.parseInt(cmd[2]);
               themeActivityDao3.updateOp();
            } else if (Integer.parseInt(cmd[1]) == 2) {
               themeActivityDao3.artifactSkinData.appoint = Integer.parseInt(cmd[2]);
               themeActivityDao3.updateOp();
            }
      }

   }

   private void gmActivityStatus(int activityType) {
      WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);
      ActivityInfo activityInfo = (ActivityInfo)((ActivityData)worldDao.jsonData).timeRotates.get(activityType);
      logger.info("活动id {} 类型 {} 的当前状态：{}", new Object[]{activityInfo.id, activityType, String.format("是否开启中 %s, 开启时间 %s, 结束时间 %s", activityInfo.open ? "true" : "false", DateUtil.transferLongToDate((long)activityInfo.start * 1000L), DateUtil.transferLongToDate((long)activityInfo.end * 1000L))});
   }

   private void gmSetDay(GamePlayer player, String gm) {
      String[] cmd = gm.split("\\|");
      String system = cmd[0];
      int day = Integer.parseInt(cmd[1]);
      MonthlyFundPart monthlyFundPart = (MonthlyFundPart)player.getMgrPart(MonthlyFundPart.class);
      MonthlyCardPart monthlyCardPart = (MonthlyCardPart)player.getMgrPart(MonthlyCardPart.class);
      PlayerRechargePart playerRechargePart = (PlayerRechargePart)player.getMgrPart(PlayerRechargePart.class);
      switch (system.toLowerCase()) {
         case "dailysign":
            DailySignPart dailySignPart = (DailySignPart)player.getMgrPart(DailySignPart.class);
            dailySignPart.gmSetDay(day);
            break;
         case "sevendaylogin":
            SevenDaysPart sevenDaysPart = (SevenDaysPart)player.getMgrPart(SevenDaysPart.class);
            sevenDaysPart.gmSetDay(day);
            break;
         case "monthlyfund":
            monthlyFundPart.gmSetDay(Integer.parseInt(cmd[2]), day);
            break;
         case "monthlycard1":
            monthlyCardPart.gmSetDay(1, day);
            break;
         case "monthlycard2":
            monthlyCardPart.gmSetDay(2, day);
            break;
         case "sevendaytask":
            SevenDayTaskActivityPart sevenDayTaskActivityPart = (SevenDayTaskActivityPart)player.getMgrPart(SevenDayTaskActivityPart.class);
            sevenDayTaskActivityPart.gmSetDay(day);
            break;
         case "valuerechargeday6":
            playerRechargePart.gmSetValueRechargeDay(6, day);
            break;
         case "valuerechargeday100":
            playerRechargePart.gmSetValueRechargeDay(100, day);
      }

   }

   private void worldBossPersonalReset(GamePlayer gamePlayer) {
      this.worldBossMgr.gmPersonalReset(gamePlayer);
   }

   private void worldBossTotalDamage(GamePlayer player, int bossType) {
      PlayerChatPart playerChatPart = (PlayerChatPart)player.getMgrPart(PlayerChatPart.class);
      playerChatPart.handlePersonalSender(2, player.getPlayerId(), this.worldBossMgr.getBossTotalDamage(bossType) + "", 0, (CommonMsg.HeroInfo)null, (BagMsg.Item_Info)null, "", 0, (Set)null, (List)null);
   }

   private void gmFirstRechargeTime(GamePlayer gamePlayer, int day) {
      PlayerRechargePart playerRechargePart = (PlayerRechargePart)gamePlayer.getMgrPart(PlayerRechargePart.class);
      playerRechargePart.gmFirstRechargeTime(day);
   }

   private void gmCargoShip(GamePlayer player, String gm) {
      WaterTransportMgr waterTransportMgr = (WaterTransportMgr)ApplicationContextProvider.getContext().getBean(WaterTransportMgr.class);
      String[] cmd = gm.split("\\|");
      switch (cmd[0].toLowerCase()) {
         case "settransport":
            waterTransportMgr.gmSetTransport(player, Integer.parseInt(cmd[1]));
            break;
         case "setintercept":
            waterTransportMgr.gmSetIntercept(player, Integer.parseInt(cmd[1]));
            break;
         case "setquality":
            waterTransportMgr.gmSetQuality(player, Integer.parseInt(cmd[1]));
            break;
         case "setaltarexp":
            waterTransportMgr.gmSetAltarExp(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
            break;
         case "setshipintercept":
            waterTransportMgr.gmSetBeIntercept(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
            break;
         case "setallintercept":
            waterTransportMgr.gmSetAllBeIntercept(Integer.parseInt(cmd[1]));
            break;
         case "arrive":
            waterTransportMgr.gmArrive(player.getPlayerId());
            break;
         case "allarrive":
            waterTransportMgr.gmArrive();
            break;
         case "rankreset":
            this.rankMgr.pushTask(() -> {
               this.rankMgr.grantRankAward(CentreAwardModel.TYPE_TRANSPORT, RankDefine.RankModule.WATER_TRANSPORT, 33, 3306);
               this.rankMgr.removeRanks(RankDefine.RankModule.WATER_TRANSPORT);
            });
            this.rankMgr.pushTask(() -> {
               this.rankMgr.grantRankAward(CentreAwardModel.TYPE_TRANSPORT_INTERCEPT, RankDefine.RankModule.WATER_TRANSPORT_INTERCEPT, 33, 3313);
               this.rankMgr.removeRanks(RankDefine.RankModule.WATER_TRANSPORT_INTERCEPT);
            });
            break;
         case "addrobot":
            waterTransportMgr.gmAddRobot(Integer.parseInt(cmd[1]));
            break;
         case "setarrivetime":
            waterTransportMgr.gmSetArriveTime(player.getPlayerId(), Integer.parseInt(cmd[2]));
            break;
         case "clearprotect":
            waterTransportMgr.gmClearProtect();
            break;
         case "resetlucky":
            waterTransportMgr.gmResetLucky(player);
            break;
         case "resetgoldcd":
            waterTransportMgr.gmResetGoldCD(player);
            break;
         case "resetgoldintercept":
            waterTransportMgr.gmResetGoldInterceptCount(player);
            break;
         case "setgoldshipstage":
            waterTransportMgr.gmSetGoldShipStage(Integer.parseInt(cmd[1]));
            break;
         case "setgoldshipdamage":
            waterTransportMgr.gmSetGoldShiDamage(Long.parseLong(cmd[1]));
            break;
         case "setgoldshipattackdamage":
            waterTransportMgr.gmSetGoldShiAttackDamage(player.getPlayerId(), Long.parseLong(cmd[1]));
      }

   }

   private void gmCDKey(GamePlayer player, String cdKey) {
      CdKeyModel cdKeyModel = (CdKeyModel)ApplicationContextProvider.getModelPoolEntity("cdkey", cdKey);
      if (cdKeyModel != null) {
         player.addResource(cdKeyModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 7, 707, 0, 0, "");
      }

   }

   private void gmUnionWarStatus(int status) {
      this.unionMgrParent.unionWarStatusChange(status);
   }

   private void gmUnion(GamePlayer player, String gm) {
      String[] cmd = gm.split("\\|");
      String system = cmd[0];
      PlayerDao playerDao = player.getPlayerDao();
      UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(playerDao.unionId);
      switch (system.toLowerCase()) {
         case "addexp":
            if (unionMgr == null) {
               player.failure(23);
               return;
            }

            unionMgr.addExp(Integer.parseInt(cmd[1]));
            unionMgr.sendUnion((GamePlayer)null);
            break;
         case "setbuff":
            if (unionMgr == null) {
               player.failure(23);
               return;
            }

            this.unionMgrParent.pushTask(() -> {
               UnionDao unionDao = unionMgr.getUnion();
               int buff = Integer.parseInt(cmd[1]);
               UnionBuffModel unionBuffModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", buff);
               if (unionBuffModel != null) {
                  unionDao.copyBuffLv = buff;
                  if (buff > 0) {
                     unionDao.copyBuffTime = System.currentTimeMillis() + (long)(unionBuffModel.getAddTime() * 60 * 60) * 1000L;
                  } else {
                     unionDao.copyBuffTime = 0L;
                  }

                  unionDao.updateOp();
                  unionMgr.sendUnionCopyInfo();
               }
            });
            break;
         case "resetcd":
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)player.getCustomCache("tb_player_reset", player.getPlayerId());
            playerResetCustomCache.setForever(3, 0L);
            break;
         case "setteclv":
            UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)player.getMgrPart(UnionTechnologyPart.class);
            unionTechnologyPart.gmSetTechnologyLevel(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
         case "settecall":
            UnionTechnologyPart unionTechnologyPart1 = (UnionTechnologyPart)player.getMgrPart(UnionTechnologyPart.class);
            unionTechnologyPart1.gmSetAllTechnologyLevel();
            break;
         case "resettechnology":
            PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)player.getPlayerExtend(9);
            playerUnionExtend.technology.clear();
            player.updatePlayerExtend(9);
            unionMgr.initUnionMemberTechnology(playerDao.playerId);
            UnionTechnologyPart unionTechnologyPart2 = (UnionTechnologyPart)player.getMgrPart(UnionTechnologyPart.class);
            unionTechnologyPart2.flushTechnology();
            break;
         case "addshopexp":
            if (unionMgr == null) {
               player.failure(23);
               return;
            }

            unionMgr.addWarShopExp(Integer.parseInt(cmd[1]));
            break;
         case "setcopy":
            if (unionMgr == null) {
               player.failure(23);
               return;
            }

            this.unionMgrParent.pushTask(() -> {
               UnionDao unionDao = unionMgr.getUnion();
               UnionCopyModel copyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", Integer.parseInt(cmd[1]));
               unionDao.copyId = copyModel.getId();
               unionDao.masterHp = copyModel.getCopyMasterHp();
               unionDao.copyChallenge.clear();
               unionDao.updateOp();
               unionMgr.sendUnionCopyInfo();
            });
            break;
         case "printcopyhp":
            Map<Integer, UnionCopyModel> unionCopyModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("unionCopy"));
            unionCopyModelMap.values().forEach((unionCopyModel) -> logger.info("第【{}】章血量 : 【{}】", unionCopyModel.getSectionId(), unionCopyModel.getCopyMasterHp()));
            break;
         case "addmember":
            if (unionMgr == null) {
               player.failure(23);
               return;
            }

            int count = Integer.parseInt(cmd[1]);
            int cur = 0;
            List<GamePlayer> gamePlayerList = this.worldMgr.getAllPlayer();
            Collections.shuffle(gamePlayerList);

            for(GamePlayer gamePlayer : gamePlayerList) {
               gamePlayer.pushTask(() -> {
                  PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                  if (!StringUtils.isEmpty(playerPublicDao.playerName) && playerPublicDao.unionId <= 0) {
                     this.unionMgrParent.pushTask(() -> {
                        UnionPrivilegePart unionPrivilegePart = (UnionPrivilegePart)gamePlayer.getMgrPart(UnionPrivilegePart.class);
                        if (unionMgr.getUnionMembers().size() >= unionPrivilegePart.getUnionNum(unionMgr.getUnion())) {
                           player.failure(9010);
                        } else {
                           unionMgr.joinUnion(gamePlayer, false);
                           logger.info("玩家【{}】加入军团【{}】", playerPublicDao.playerId, unionMgr.getUnion().unionName);
                        }
                     });
                  }
               });
               ++cur;
               if (cur >= count) {
                  return;
               }
            }
            break;
         case "adddonate":
            this.unionMgrParent.pushTask(() -> {
               UnionDao unionDao = unionMgr.getUnion();
               unionDao.donateProgress += Integer.parseInt(cmd[1]);
               unionDao.updateOp();
               unionMgr.sendUnionDonateProgress();
            });
            break;
         case "clearcreateunioncd":
            PlayerResetCustomCache unionPlayerResetCustomCache = (PlayerResetCustomCache)player.getCustomCache("tb_player_reset", player.getPlayerId());
            unionPlayerResetCustomCache.setForever(13, 0);
            break;
         case "apply":
            UnionMsg.C2S_UnionApply_6917.Builder builder = UnionMsg.C2S_UnionApply_6917.newBuilder();
            builder.setUnionId(Integer.parseInt(cmd[1]));
            builder.setIsCancel(Boolean.parseBoolean(cmd[2]));
            UnionPrivilegePart unionPrivilegePart = (UnionPrivilegePart)player.getMgrPart(UnionPrivilegePart.class);
            unionPrivilegePart.C2S_UnionApply_6917(builder.build(), "");
            break;
         case "setcopyhp":
            UnionDao unionDao = unionMgr.getUnion();
            unionDao.masterHp = Long.parseLong(cmd[1]);
            unionDao.updateOp();
            unionMgr.sendUnionCopyInfo();
      }

   }

   private void gmChapter(GamePlayer player, int chapterId) {
      player.pushTask(() -> {
         BattleChapterDao chapterDao = (BattleChapterDao)player.getData("tb_battle_chapter", player.getPlayerId());
         ChapterModel chapterModel = (ChapterModel)player.getGameModelPool().getEntity("chapter", chapterId);
         if (chapterModel != null) {
            chapterDao.chapterId = chapterId;
            chapterDao.updateOp();
            player.triggerTask(401, 0, (long)chapterId, 0);
            player.notifyPlayerData(PlayerDefine.PLAYER_CHAPTER_ID, chapterId);
            RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
            rankMgr.pushTask(() -> rankMgr.checkRankReward(player.getPlayerId(), 1, (long)chapterId));
         }
      });
   }

   private void gmBattleRobot(GamePlayer player, int battleId) {
      HeroRankMgr heroRankMgr = (HeroRankMgr)ApplicationContextProvider.getContext().getBean(HeroRankMgr.class);
      ArrayingMirror arrayingMirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      PlayerDao playerDao = player.getPlayerDao();
      BattlePKTeam leftTeam = new BattlePKTeam(player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, heroRankMgr.getHeroRankCompensate(arrayingMirror, player.isRobot()));
      BattlePKTeam rightTeam = new BattlePKTeam(battleId);
      BattleScene scene = new BattleScene(1040, 1);
      scene.addPKTeam(leftTeam, rightTeam);
      BattleMsg.S2C_BattleResult_6102.Builder battleMsg = scene.fight((byte)20);
      player.sendMsg(battleMsg.build());
   }

   private void gmBattleTower(GamePlayer player, int towerId) {
      player.pushTask(() -> {
         BattleTowerDao towerDao = (BattleTowerDao)player.getData("tb_battle_tower", player.getPlayerId());
         if (towerId >= 1) {
            BattleTowerModel towerModel = (BattleTowerModel)player.getGameModelPool().getEntity("battleTower", towerId);
            if (towerModel != null) {
               towerDao.towerId = towerId;
               towerDao.fightTowerId = 0;
               towerDao.sweepCount = 0;
               towerDao.buyTimes = 0;
               towerDao.updateOp();
               BattleTowerPart towerPart = (BattleTowerPart)player.getMgrPart(BattleTowerPart.class);
               towerPart.sendTowerInfo();
               RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
               rankMgr.checkRankReward(player.getPlayerId(), 2, (long)towerDao.towerId);
               TrailTowerPart trailTowerPart = (TrailTowerPart)player.getMgrPart(TrailTowerPart.class);
               trailTowerPart.trailTowerUnlockHeroArrayingHandle();
            }
         }
      });
   }

   private void gmTrailTower(GamePlayer player, int towerId) {
      player.pushTask(() -> {
         TrailTowerDao trailTowerDao = (TrailTowerDao)player.getData("tb_trail_tower", player.getPlayerId());
         TrailTowerModel trailTowerModel = (TrailTowerModel)player.getGameModelPool().getEntity("trailTower", towerId);
         if (trailTowerModel != null) {
            trailTowerDao.towerId = towerId;
            trailTowerDao.sweepCount = 0;
            trailTowerDao.buyTimes = 0;
            trailTowerDao.totalStar = towerId * 3;
            trailTowerDao.fightTowerId = 0;
            trailTowerDao.updateOp();
            Map<Integer, TrailTowerStarDao> starDaoMap = player.<Integer, TrailTowerStarDao>getMap("tb_trail_tower_star", player.getPlayerId());
            starDaoMap.clear();

            for(int i = 1; i <= towerId; ++i) {
               TrailTowerStarDao starDao = new TrailTowerStarDao();
               List<Integer> condition = new ArrayList();
               condition.add(1);
               condition.add(10);
               condition.add(20);
               starDao.init(player.getPlayerId(), i, condition);
               player.insertDao(starDao);
            }

            TrailTowerPart trailTowerPart = (TrailTowerPart)player.getMgrPart(TrailTowerPart.class);
            trailTowerPart.sendTowerInfo();
         }
      });
   }

   private void gmYZChapter(GamePlayer player, int chapterId) {
      player.pushTask(() -> {
         ExpeditionPart expeditionPart = (ExpeditionPart)player.getMgrPart(ExpeditionPart.class);
         expeditionPart.unlockChapter(chapterId, true);
      });
   }

   private void gmRemoveYZ(GamePlayer player, int chapterId) {
      player.pushTask(() -> {
         Map<Integer, ExpeditionDao> daoMap = player.<Integer, ExpeditionDao>getMap("tb_expedition", player.getPlayerId());
         if (daoMap != null) {
            if (chapterId == 0) {
               for(Map.Entry<Integer, ExpeditionDao> entry : daoMap.entrySet()) {
                  player.deleteDao(entry.getValue(), true);
               }
            } else if (daoMap != null && daoMap.containsKey(chapterId)) {
               player.deleteDao(daoMap.get(chapterId), true);
            }
         }

      });
   }

   private void gmResetyz(GamePlayer player, int chapterId) {
      ExpeditionPart expeditionPart = (ExpeditionPart)player.getMgrPart(ExpeditionPart.class);
      expeditionPart.resetChatpter(chapterId);
   }

   private void gmFinishyz(GamePlayer player, int chapterId) {
      Map<Integer, ExpeditionDao> daoMap = player.<Integer, ExpeditionDao>getMap("tb_expedition", player.getPlayerId());
      if (daoMap.containsKey(chapterId)) {
         ExpeditionDao expeditionDao = (ExpeditionDao)daoMap.get(chapterId);
         expeditionDao.openedBoxNum = expeditionDao.totalBoxNum;
         expeditionDao.passed = true;
         expeditionDao.updateOp();
         ExpeditionPart expeditionPart = (ExpeditionPart)player.getMgrPart(ExpeditionPart.class);
         expeditionPart.sendChapterInfos();
      }
   }

   public void gmMagicBook(GamePlayer player, String gm) {
      String[] cmd = gm.split("\\|");
      String system = cmd[0];
      MagicBookPart magicBookPart = (MagicBookPart)player.getMgrPart(MagicBookPart.class);
      switch (system.toLowerCase()) {
         case "setlv":
            int lv = Integer.parseInt(cmd[1]);
            magicBookPart.gmSetMagicBookLv(lv);
            break;
         case "setauthlv":
            int authLv = Integer.parseInt(cmd[1]);
            magicBookPart.gmSetAuthLv(authLv);
            break;
         case "authspeedup":
            String[] paramArr = cmd[1].split(",");
            magicBookPart.gmAuthSpeedUp(Integer.parseInt(paramArr[0]), Integer.parseInt(paramArr[1]));
            break;
         case "reset":
            magicBookPart.gmReset();
      }

   }

   private void gmAddAllHero(GamePlayer player) {
      List<ResourceModel> list = new ArrayList();
      Map<Integer, HeroModel> map = ApplicationContextProvider.<Integer, HeroModel>getModelPoolMap("hero");

      for(Map.Entry<Integer, HeroModel> entry : map.entrySet()) {
         HeroModel heroModel = (HeroModel)entry.getValue();
         if (1 == heroModel.getShowOpen()) {
            list.add(new ResourceModel(3, heroModel.getId(), 1));
         }
      }

      player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 7, 708, 0, 0, "gmAllHeros");
   }

   private void gmAlliance(GamePlayer player, String gm) {
      String[] gmArr = gm.split("\\|");
      AllianceMgr allianceMgr = (AllianceMgr)ApplicationContextProvider.getContext().getBean(AllianceMgr.class);
      switch (gmArr[0]) {
         case "changestatus":
            allianceMgr.gmChangeStatus(player, Integer.parseInt(gmArr[1]));
            break;
         case "setchallengecount":
            allianceMgr.gmSetChallengeCount(player, Integer.parseInt(gmArr[1]));
            break;
         case "setintegral":
            allianceMgr.gmSetTeamIntegral(player, Integer.parseInt(gmArr[1]));
            break;
         case "addrobot":
            allianceMgr.pushTask(() -> allianceMgr.addRobot(player, Integer.parseInt(gmArr[1]), Integer.parseInt(gmArr[2])));
            break;
         case "clearrobot":
            allianceMgr.pushTask(allianceMgr::gmClearRobot);
            break;
         case "randomteam":
            allianceMgr.pushTask(() -> allianceMgr.addRandomTeam(player, Integer.parseInt(gmArr[1])));
            break;
         case "randomchallege":
            allianceMgr.pushTask(allianceMgr::randomChallenge);
      }

   }

   private void gmAllBattlePower() {
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      monsterManager.printBattlePower();
   }

   private void gmPrintWarriors(GamePlayer player) {
      WarriorSignetTestPart warriorSignetTestPart = (WarriorSignetTestPart)player.getMgrPart(WarriorSignetTestPart.class);
      warriorSignetTestPart.test();
   }

   private void gmBattleIdPower(GamePlayer gamePlayer, String battleId) {
      BattleModel battleModel = (BattleModel)gamePlayer.getGameModelPool().getEntity("battle", Integer.valueOf(battleId));
      if (battleModel != null) {
         StringBuffer sb = new StringBuffer();
         long totalPower = 0L;
         sb.append(String.format("id：%d--[", battleModel.getId()));

         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            if (fun.getPos() < 5) {
               Monster monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, fun, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
               sb.append(String.format("%d:%d,", fun.getPos(), monster.totalCombatPower));
               totalPower += monster.totalCombatPower;
            } else if (fun.getPos() == 5) {
               Monster monster = new Monster(fun.getId(), fun.getLv(), fun.getStar(), fun.getOffset(), false, fun, BattlePKTeam.getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
               sb.append(String.format("%d:%d,", fun.getPos(), monster.totalCombatPower));
               totalPower += monster.totalCombatPower;
            }
         }

         sb.append(String.format("],total：%d", totalPower));
         ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
         chatMgr.pushTask(() -> chatMgr.sendSystem((byte)4, (byte)5, gamePlayer.getPlayerId(), battleModel.getName(), sb.toString()));
      }
   }

   public void gmTestPrayRefresh(GamePlayer player, String params) {
      String[] itemStr = params.split(",");
      if (itemStr.length == 2) {
         int prayId = Integer.parseInt(itemStr[0]);
         int count = Integer.parseInt(itemStr[1]);
         PrayTest prayTest = (PrayTest)player.getMgrPart(PrayTest.class);
         prayTest.testPrayRefresh(prayId, count);
      }
   }

   public void gmTestPrayDrawCard(GamePlayer player, String params) {
      String[] itemStr = params.split(",");
      if (itemStr.length == 3) {
         int prayId = Integer.parseInt(itemStr[0]);
         int prayIndex = Integer.parseInt(itemStr[1]);
         int count = Integer.parseInt(itemStr[2]);
         PrayTest prayTest = (PrayTest)player.getMgrPart(PrayTest.class);
         prayTest.testDrawCard(prayId, prayIndex, count);
      }
   }

   public void gmMine(GamePlayer player, String params) {
      MinePart minePart = (MinePart)player.getMgrPart(MinePart.class);
      minePart.gmMine(params);
   }

   public Queue<ChatMsg.Chat_Info> getInternationalChat() {
      return this.newInternationalQueue;
   }

   public void removeChatInfo(int playerId) {
      CrossChatMsg.S2CR_RemoveChatInfo_11729.Builder builder = CrossChatMsg.S2CR_RemoveChatInfo_11729.newBuilder();
      builder.addPlayerIds(playerId);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
   }

   public ChatLimitData getChatLimitData(byte channel) {
      return (ChatLimitData)this.chatLimitDataMap.get(channel);
   }

   public Map<Byte, ChatLimitData> getChatLimitDataMap() {
      return this.chatLimitDataMap;
   }

   private void gmRemoveItems(GamePlayer gamePlayer, int itemId) {
      ItemBagPart itemBagPart = (ItemBagPart)gamePlayer.getMgrPart(ItemBagPart.class);
      itemBagPart.deleteItems(itemId, 7, 452, itemId, 0, "gm命令删除物品");
   }

   private void gmDragonStrengthen(GamePlayer gamePlayer, int strengthenLv) {
      DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)gamePlayer.getMgrPart(DragonStrengthenPart.class);
      dragonStrengthenPart.gmResetStrengthen(strengthenLv);
   }

   private void gmPrintArraying(GamePlayer player) {
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      PlayerPublicDao publicDao = player.getPublicDao();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(String.format("玩家 %d %s 的阵容如下:\n", publicDao.playerId, publicDao.playerName));
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)player.getMgrPart(HeroArrayingPart.class);

      for(CommonMsg.HeroState state : CommonMsg.HeroState.values()) {
         ArrayingMirror arrayingMirror = heroArrayingPart.getArrayingMirrorByType(state);
         if (arrayingMirror != null) {
            stringBuilder.append(String.format("\t阵容 %d-%s:\n", state.getNumber(), state));
            stringBuilder.append(String.format("\t\t战力:%d, friendNation:%d, friendState:%d\n", arrayingMirror.power, arrayingMirror.friendNation, arrayingMirror.friendState));

            for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
               String entityDesc = "?";
               byte pos = (Byte)entry.getKey();
               ArrayingEntity arrayingEntity = (ArrayingEntity)entry.getValue();
               if (pos >= 0 && pos <= 5) {
                  HeroDao heroDao = heroBagPart.getHeroByCode(((ArrayingEntity)entry.getValue()).code);
                  if (heroDao != null) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                     if (heroModel != null) {
                        entityDesc = String.format("武将 %s 星级-%d", heroModel.getName(), heroDao.getStar());
                     }
                  }
               } else if (pos == 6) {
                  ArtifactModel artifactModel = (ArtifactModel)ApplicationContextProvider.getModelPoolEntity("artifact", arrayingEntity.code);
                  if (artifactModel != null) {
                     entityDesc = String.format("神兵 %s", artifactModel.getName());
                  }
               } else if (pos == 7) {
                  TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)ApplicationContextProvider.getModelPoolEntity("TongQueBase", arrayingEntity.code);
                  if (tongqueTerraceModel != null) {
                     entityDesc = String.format("美人 %s", tongqueTerraceModel.getName());
                  }
               } else if (pos == 8) {
                  MagicBookDao magicBookDao = (MagicBookDao)player.getData("tb_magic_book", player.getPlayerId());
                  StringBuilder magicBookDescBuilder = new StringBuilder();
                  magicBookDescBuilder.append("奇谋:");

                  for(Map.Entry<Integer, Integer> skillEntry : magicBookDao.skillPosition.entrySet()) {
                     int skillId = (Integer)skillEntry.getValue();
                     MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", skillId);
                     if (magicSkillModel != null) {
                        magicBookDescBuilder.append(String.format(" %s-%d星", magicSkillModel.getName(), magicSkillModel.getStar()));
                     }
                  }

                  entityDesc = magicBookDescBuilder.toString();
               }

               stringBuilder.append(String.format("\t\t站位:%d code:%d (%s)\n", entry.getKey(), ((ArrayingEntity)entry.getValue()).code, entityDesc));
            }
         }
      }

      System.out.println(stringBuilder.toString());
   }

   private void gmPrintHeroDao(GamePlayer player, int code) {
      String heroDesc = "未找到该英雄";
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);
      if (heroDao != null) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
         if (heroModel != null) {
            String heroDaoJson = JsonUtil.beanToJson(heroDao);
            String formattedHeroDaoStr = JSON.toJSONString(JSON.parseObject(heroDaoJson), new SerializerFeature[]{SerializerFeature.PrettyFormat});
            heroDesc = String.format("玩家英雄（%s id: %d, code: %d）的Dao为:\n%s\n", heroModel.getName(), heroDao.id, code, formattedHeroDaoStr);
         }
      }

      System.out.println(heroDesc);
   }

   private void gmPrintBuyGifts(GamePlayer player) {
      player.pushTask(() -> {
         GiftPart giftPart = (GiftPart)player.getMgrPart(GiftPart.class);
         Map<Integer, Map<Integer, Map<Integer, ShopLimitModel>>> shopLimitMap = ApplicationContextProvider.<Integer, Map<Integer, Map<Integer, ShopLimitModel>>>getModelPoolMap("customShopLimit");
         PlayerDao playerDao = player.getPlayerDao();
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append(String.format("玩家 %d %s 的已购礼包如下:\n", playerDao.playerId, playerDao.playerName));

         for(Integer giftType : shopLimitMap.keySet()) {
            Map<Integer, GiftDao> buyGifts = giftPart.getBuyGifts(giftType);
            if (!buyGifts.isEmpty()) {
               stringBuilder.append(String.format("\t礼包类型 %d\n", giftType));
            }

            for(Map.Entry<Integer, GiftDao> entry : buyGifts.entrySet()) {
               Integer id = (Integer)entry.getKey();
               GiftDao giftDao = (GiftDao)entry.getValue();
               ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", id);
               if (shopLimitModel == null) {
                  logger.warn("未找到礼包id %d 的配置！", id);
               } else {
                  stringBuilder.append(String.format("\t\t%s,id: %d, 购买次数: %d\n", shopLimitModel.getTips(), id, giftDao.count));
               }
            }
         }

         System.out.println(stringBuilder.toString());
      });
   }

   private void gmPrintShop(GamePlayer player) {
      player.pushTask(() -> {
         PlayerDao playerDao = player.getPlayerDao();
         StringBuilder sb = new StringBuilder();
         sb.append(String.format("玩家%s %d的商店购买情况:\n", playerDao.playerName, player.getPlayerId()));
         ShopDao shopDao = (ShopDao)player.getData("tb_shop", player.getPlayerId());

         for(Map.Entry<Integer, ShopJsonData> entry : shopDao.jsonData.entrySet()) {
            int shopId = (Integer)entry.getKey();
            ShopJsonData shopJsonData = (ShopJsonData)entry.getValue();
            sb.append(String.format("\t商店ID %d 的购买情况: \n", shopId));

            for(Map.Entry<Integer, Integer> dataEntry : shopJsonData.map.entrySet()) {
               int id = (Integer)dataEntry.getKey();
               int count = (Integer)dataEntry.getValue();
               sb.append(String.format("\t\t配置ID: %d, 购买数量: %d\n", id, count));
            }
         }

         System.out.println(sb.toString());
      });
   }

   private void gmPrintActivity() {
      Function<Integer, String> getOpenTypeDesc = (openType) -> {
         switch (openType) {
            case 1:
               return openType + "（开服时间后第几天开启）";
            case 2:
               return openType + "（周几开启）";
            case 3:
               return openType + "（指定年月日开启）";
            case 4:
               return openType + "（指定每月几号开启）";
            case 5:
               return openType + "（某活动结束x天后开启）";
            case 6:
               return openType + "（服务器开服时间范围）";
            case 7:
               return openType + "（服务器合服后x天开启）";
            default:
               return "未知";
         }
      };
      ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
      activityMgr.pushTask(() -> {
         StringBuilder sb = new StringBuilder("当前活动状态如下：\n");
         WorldDao<ActivityData> worldDao = this.worldMgr.<ActivityData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_ACTIVITY);

         for(Map.Entry<Integer, ActivityInfo> entry : ((ActivityData)worldDao.jsonData).timeRotates.entrySet()) {
            int activityType = (Integer)entry.getKey();
            ActivityInfo activityInfo = (ActivityInfo)entry.getValue();
            ActivityRuleModel activityRuleModel = (ActivityRuleModel)ApplicationContextProvider.getModelPoolEntity("activityRule", activityType);
            sb.append(String.format("\t类型: %d, ID: %d, %s, 开启类型: %s, 轮换类型：%d, %s, 开启时间: %s, 结束时间: %s\n", activityType, activityInfo.id, activityRuleModel.getName(), getOpenTypeDesc.apply(activityRuleModel.getOpenType()), activityRuleModel.getRotationRule(), activityInfo.open ? "开启中" : "已关闭", DateUtil.transferLongToDate((long)activityInfo.start * 1000L), DateUtil.transferLongToDate((long)activityInfo.end * 1000L)));
         }

         System.out.println(sb.toString());
      });
   }

   @MsgHandlerAnno
   public void CR2S_KingOfRecord_11728(CrossChatMsg.CR2S_KingOfRecord_11728 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreModelMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_KING_OF_CHALLENGE_MAIL_ID);
      if (!CollectionUtils.isEmpty(centreModelMap)) {
         Map<Integer, String> personalParam = new HashMap();
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreModelMap.firstEntry().getValue();

         for(String info : msg.getRecordInfoList()) {
            String[] arr = info.split("\\|");
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(Integer.parseInt(arr[0]));
            if (gamePlayer != null) {
               int win = Integer.parseInt(arr[1]);
               int lose = Integer.parseInt(arr[2]);
               personalParam.put(gamePlayer.getPlayerId(), win + lose + "@" + win);
            }
         }

         this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), personalParam, 604800000L, 7, 711, 0);
      }
   }

   @MsgHandlerAnno
   public void CR2S_RemoveChatInfo_11730(CrossChatMsg.CR2S_RemoveChatInfo_11730 msg, CrossSubscribeMsg crossSubscribeMsg) {
      for(int playerId : msg.getPlayerIdsList()) {
         this.deletePlayerChatInfo(playerId);
      }

   }

   public void deletePlayerChatInfo(int playerId) {
      List<Integer> list = new ArrayList();
      list.add(2);
      list.add(6);
      list.add(7);

      for(Integer channel : list) {
         Queue<ChatMsg.Chat_Info> chatDaoQueue = this.getCacheChat(channel);
         if (chatDaoQueue != null) {
            chatDaoQueue.removeIf((chatInfo) -> chatInfo.getPlayerId() == playerId);
         }
      }

      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null) {
         PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
         if (playerPublicDao.unionId > 0) {
            Queue<ChatMsg.Chat_Info> unionQueue = this.getUnionQueue(playerPublicDao.unionId);
            if (unionQueue != null) {
               unionQueue.removeIf((chatInfo) -> chatInfo.getPlayerId() == playerId);
            }
         }
      }

      for(Map.Entry<Integer, Queue<ChatMsg.Chat_Info>> entry : this.areaMap.entrySet()) {
         Queue<ChatMsg.Chat_Info> chatDaoQueue = (Queue)entry.getValue();
         if (chatDaoQueue != null) {
            chatDaoQueue.removeIf((chatInfo) -> chatInfo.getPlayerId() == playerId);
         }
      }

      this.worldMgr.getOnlinePlayer().forEach((onLinePlayer) -> onLinePlayer.pushTask(() -> {
            ChatMsg.S2C_RemoveMessage_6018.Builder builder = ChatMsg.S2C_RemoveMessage_6018.newBuilder();
            builder.addPlayerId(playerId);
            onLinePlayer.sendMsg(builder.build());
         }));
   }
}
