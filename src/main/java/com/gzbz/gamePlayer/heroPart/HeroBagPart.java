package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.part.ActHeroImprovePart;
import com.gzbz.activity.part.KrActHeroImprovePart;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.db.HeroSupportDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.KingControlDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.StonehengeDao;
import com.gzbz.db.worldBean.ControlData;
import com.gzbz.db.worldBean.HeroComparatorData;
import com.gzbz.db.worldBean.HeroKingDataComparator;
import com.gzbz.divineGanerals.DivineGeneralsPart;
import com.gzbz.dragon.part.DragonStrengthenPart;
import com.gzbz.duel.DuelPart;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.LogDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.armyArray.ArmyArrayPart;
import com.gzbz.gamePlayer.battle.BattleCutPart;
import com.gzbz.gamePlayer.battle.BattleHeroTrainingPart;
import com.gzbz.gamePlayer.equip.CastSoulPart;
import com.gzbz.gamePlayer.heroAide.HeroAidePart;
import com.gzbz.gamePlayer.heroPart.bean.PlayerHeroExtend;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.pet.PetPart;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.HeroAideItem;
import com.gzbz.gamePlayer.playerBag.HeroDressPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.RuneStoneItem;
import com.gzbz.gamePlayer.playerBag.RuneStonePart;
import com.gzbz.gamePlayer.playerBag.Totem;
import com.gzbz.gamePlayer.playerBag.TotemPart;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.log.HeroBagLog;
import com.gzbz.log.LogMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mine.part.MinePart;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.EquipRefineModel;
import com.gzbz.model.ExclusiveTreasureBaseModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroBagModel;
import com.gzbz.model.HeroBreachModel;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.HeroExperienceModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroUpStarModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LinkHeroMainModel;
import com.gzbz.model.PostModel;
import com.gzbz.model.RankRewardModel;
import com.gzbz.model.ShrineReturnModel;
import com.gzbz.model.SkillKingModel;
import com.gzbz.model.SkillKingTalentModel;
import com.gzbz.model.StarMapTypeModel;
import com.gzbz.model.StonehengeBuffModel;
import com.gzbz.model.SupportHeroModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.TalentLevelModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.WarFlagModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossHeroRankMsg;
import com.gzbz.protobuf.HeroExtendMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.HeroRankData;
import com.gzbz.robot.MonsterManager;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.union.part.UnionActivePart;
import com.gzbz.union.part.UnionTechnologyPart;
import com.gzbz.war.jingzhou.TreasurePart;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroBagPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(HeroBagPart.class);
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   HeroRankMgr heroRankMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   private List<PropertyModel> property_tongque;
   private List<PropertyModel> property_tongque_new_beauty;
   private List<PropertyModel> property_divine_generals;
   private Map<Integer, List<PropertyModel>> property_reasuret_map;
   private Map<Integer, List<PropertyModel>> property_union_skill_map;
   private Map<Integer, Integer> union_skill_lv_score_map;
   private List<PropertyModel> property_union_activity;
   private List<PropertyModel> property_artifact_dress;
   private List<PropertyModel> property_artifact_castSoul;
   private List<PropertyModel> property_artifact_refine;
   private List<PropertyModel> property_artifact_refine_add;
   private List<PropertyModel> property_artifact_strong;
   private Map<Integer, List<HeroDressPart.HeroDressEndTimeAndPros>> heroDressEndTimeAndProsMap;
   private List<PropertyModel> property_pet;
   private List<PropertyModel> property_dragon_strengthen;
   private Map<Integer, Map<Integer, List<PropertyModel>>> property_friend;
   private List<PropertyModel> property_hero_dress_all;
   private List<PropertyModel> property_hero_dress_all_base;
   private List<PropertyModel> property_hero_dress_collect;
   private Map<Integer, Map<Integer, Map<Integer, List<PropertyModel>>>> property_king;
   private List<PropertyModel> property_hero_promote;
   private List<PropertyModel> property_hero_palace;
   private Map<Integer, Map<Integer, Long>> property_soul_palace;
   public Map<Integer, Map<Integer, List<PropertyModel>>> property_king_extra = new HashMap();
   private long power_divine = 0L;
   private Map<Integer, ConcurrentHashMap> heroScoreMap = new ConcurrentHashMap();
   private List<HeroDao> linkHeroDaoList = new ArrayList();
   public static final int KING_ADD_CONTROL = 0;
   public static final String FLUSH_TYPE = "NoFlushKingToKing";

   public void loginHandle() {
      HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
      heroPalacePart.init();
      this.sendHerosBaseData();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.star13Heros <= 0) {
         this.checkStar13HeroNum(playerExtend);
      }

      this.checkKingControl();
      this.sendAutoSupportData();
      this.updateSupportCallBack();
      this.checkHeroInvalidAndLinkState();
   }

   public void resetDaily() {
      this.updateSupportCallBack();
   }

   public void updateSupportCallBack() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);

      for(HeroSupportDao heroSupportDao : worldMgrPushTaskPart.getHeroSupportDaoList(this.player.getPlayerId())) {
         if (heroSupportDao.isAuto && !DateUtil.isSameDay((long)heroSupportDao.time * 1000L)) {
            HeroDao heroDao = this.getHeroByCode(heroSupportDao.heroSupport.code);
            if (heroDao != null) {
               HeroSupportDao.SupportModule supportModule = WorldMgrPushTaskPart.int2SupportModule(heroSupportDao.moduleId);
               if (supportModule != null) {
                  worldMgrPushTaskPart.pushTaskEx("addHeroSupport", new Object[]{supportModule, heroDao, this, "addHeroSupportCallback"});
               }
            }
         }
      }

   }

   @TaskMethod
   public void addHeroSupportCallback(HeroSupportDao.SupportModule supportModule) {
      switch (supportModule) {
         case CUT:
            BattleCutPart battleCutPart = (BattleCutPart)this.player.getMgrPart(BattleCutPart.class);
            battleCutPart.cutDispatch(supportModule);
            break;
         case HERO_TRAIL:
            BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
            battleHeroTrainingPart.heroTrailDispatch(supportModule);
            break;
         case MINE:
            MinePart minePart = (MinePart)this.player.getMgrPart(MinePart.class);
            minePart.dispatchHero(supportModule);
      }

   }

   public void sendHerosBaseData() {
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      heroArrayingPart.checkKingCode(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      this.updateFriendAndKingProperty(true, HeroDefine.HeroPropertyModel.MODEL_HERO);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);

      for(HeroDao heroDao : herosMap.values()) {
         this.updateNationHeroRank(heroDao, true);
         if (playerExtend.handleWarFlagTime == 0 && heroDao.warFlag != null && heroDao.warFlag.recastNum > 0) {
            WarFlagModel warFlagModel = (WarFlagModel)ApplicationContextProvider.getModelPoolEntity("countryWarFlag", heroDao.warFlag.id);
            if (warFlagModel != null && warFlagModel.getQuality() == 7 && heroDao.warFlag.recastNum > 0) {
               WarFlag var10000 = heroDao.warFlag;
               var10000.highRecastNum += heroDao.warFlag.recastNum;
               heroDao.warFlag.recastNum = 0;
               heroDao.updateOp();
            }
         }

         if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime == 0) {
            this.recordMaxStar(heroDao.id, heroDao.getStar(), true);
         }
      }

      this.pushTaskEx("sendHeroList2Client", new Object[]{herosMap});
      if (playerExtend.handleWarFlagTime == 0) {
         playerExtend.handleWarFlagTime = DateUtil.getIntTime(System.currentTimeMillis());
         this.player.updatePlayerExtend(13);
      }

   }

   @MsgHandlerAnno
   public void C2S_HeroList_5001(HeroMsg.C2S_HeroList_5001 msg, String source) {
      System.out.println("------收到客户端请求英雄背包数据协议, playerId: " + this.player.getPlayerId());
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      System.out.println("玩家英雄数量：" + herosMap.size());
      this.sendHeroList2Client(herosMap);
   }

   @MsgHandlerAnno
   public void C2S_HeroTotalProperty_5091(HeroMsg.C2S_HeroTotalProperty_5091 msg, String source) {
      HeroDao heroDao = this.getHeroByCode(msg.getCode());
      if (heroDao != null) {
         Map<Integer, Long> map = heroDao.getClientShowProperties();
         HeroMsg.S2C_HeroTotalPropertyResult_5092.Builder builder = HeroMsg.S2C_HeroTotalPropertyResult_5092.newBuilder();

         for(Map.Entry<Integer, Long> entry : map.entrySet()) {
            CommonMsg.MapDataII.Builder infoBuilder = CommonMsg.MapDataII.newBuilder();
            infoBuilder.setKey((Integer)entry.getKey());
            infoBuilder.setValue(((Long)entry.getValue()).intValue());
            builder.addProperties(infoBuilder);
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroLock_5093(HeroMsg.C2S_HeroLock_5093 msg, String source) {
      HeroDao heroDao = this.getHeroByCode(msg.getCode());
      if (heroDao != null && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
         heroDao.lock = !heroDao.lock;
         heroDao.updateOp();
         HeroMsg.S2C_HeroLockResult_5094.Builder builder = HeroMsg.S2C_HeroLockResult_5094.newBuilder();
         builder.setCode(msg.getCode());
         builder.setLock(heroDao.lock);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenHeroRankUi_13201(HeroExtendMsg.C2S_OpenHeroRankUi_13201 msg, String source) {
      this.heroRankMgr.pushTaskEx("getHeroRank", new Object[]{this.player, msg.getHeroId(), msg});
   }

   @MsgHandlerAnno
   public void C2S_OpenHeroBagUi_13203(HeroExtendMsg.C2S_OpenHeroBagUi_13203 msg, String source) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      if (heroArrayingDao != null) {
         if (heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            Map<Integer, Integer> map = new HashMap();

            for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
               if ((Byte)entry.getKey() <= 5) {
                  HeroDao heroDao = this.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null && heroDao.invalidTime == 0) {
                     map.put(entry.getValue(), heroDao.id);
                  }
               }
            }

            if (!map.isEmpty()) {
               this.heroRankMgr.pushTaskEx("getCommonArrayingHeroRank", new Object[]{this.player, map});
            }

         }
      }
   }

   public void logHero(HeroDao heroDao, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      HeroBagLog log = new HeroBagLog();
      log.playerId = this.player.getPlayerId();
      log.code = heroDao.code;
      log.heroId = heroDao.id;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().addLog(log);
      if (451 != reason) {
         this.addOperationLog(heroDao.id, 1, chValue, reason);
      }

   }

   public void addOperationLog(int id, int num, int chValue, int reasonId) {
      if (LogDefine.REASON_DEC_MAP.containsKey(reasonId)) {
         String reason = (String)LogDefine.REASON_DEC_MAP.get(reasonId);
         int oldLogId = 0;
         int newLogId = 0;
         if (chValue > 0) {
            oldLogId = 7;
            newLogId = 1;
         } else {
            oldLogId = 8;
            newLogId = 2;
         }

         LogOperationMgr operationMgr = this.player.getOperationMgr();
         operationMgr.addItemLog(this.player, oldLogId, id, (long)Math.abs(chValue), reason);
         operationMgr.addItemNewLog(this.player, newLogId, id, (long)Math.abs(chValue), (long)num, reason);
      }
   }

   public HeroDao getHeroByCode(int code) {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      if (map.get(code) != null) {
         HeroDao heroDao = (HeroDao)map.get(code);
         heroDao.flushTotalProperties();
         return heroDao;
      } else {
         return null;
      }
   }

   public List<HeroDao> getHeroById(int heroId) {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      List<HeroDao> resultList = new ArrayList();
      if (map != null) {
         for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
            if (((HeroDao)entry.getValue()).id == heroId) {
               ((HeroDao)entry.getValue()).flushTotalProperties();
               resultList.add(entry.getValue());
            }
         }
      }

      return resultList;
   }

   public HeroDao getHeroByCode(int code, CommonMsg.HeroState state) {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      HeroDao heroDao = (HeroDao)map.get(code);
      if (state != null && heroDao != null) {
         HeroDao newHero = null;
         if (state == CommonMsg.HeroState.HERO_STATE_STONEHENGE_1 || state == CommonMsg.HeroState.HERO_STATE_STONEHENGE_2) {
            newHero = HeroInfo.getHeroDaoForStonehenge(heroDao);
            StonehengeDao stonehengeDao = (StonehengeDao)this.player.getData("tb_stonehenge", this.player.getPlayerId());

            for(Integer buff : stonehengeDao.buffs) {
               StonehengeBuffModel buffModel = (StonehengeBuffModel)this.player.getGameModelPool().getEntity("stonehengeBuff", buff);
               newHero.property_temp.addAll(buffModel.getBuffs());
            }
         }

         if (newHero != null) {
            newHero.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, true, false);
         }

         return newHero;
      } else {
         return null;
      }
   }

   public void flushHero(HeroDefine.HeroPropertyModel model, HeroDao heroDao) {
      long oldPower = this.player.getPlayerCombatPower();
      if (heroDao.containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber())) {
         this.updateFriendAndKingProperty(false, model);
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         Set<Integer> heroSet = heroArrayingPart.getArrayingHeroCodes(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         this.flushHeroIdAndArrayingForCodeList(model, heroSet, false, false);
         if (heroDao.invalidTime == 0) {
            this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), heroDao.id, heroDao.getCombatPower(), heroDao.code});
         }

         this.updateNationHeroRank(heroDao, true);
         heroArrayingPart.flushHeroArrayingMirror(model, oldPower, false);
         heroSet.add(heroDao.code);
         this.sendHeroList2ClientByCode(heroSet);
      } else {
         heroDao.flushHero(model, false, false);
         List<HeroDao> list = new ArrayList();
         list.add(heroDao);
         this.sendHeroList2Client(list);
      }

      if (heroDao.containState(70)) {
         SupremePvpPart supremePvpPart = (SupremePvpPart)this.player.getMgrPart(SupremePvpPart.class);
         supremePvpPart.uploadArraying();
      }

   }

   public void flushAllHeroAndArraying(HeroDefine.HeroPropertyModel model) {
      long oldPower = this.player.getPlayerCombatPower();
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      int friendCode = this.updateFriendAndKingProperty(false, model);
      List<HeroDao> changeHeroCodeList = new ArrayList();

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         boolean isNeedFlush = ((HeroDao)entry.getValue()).isNeedFlush();
         if (isNeedFlush) {
            if ((Integer)entry.getKey() != friendCode) {
               ((HeroDao)entry.getValue()).flushHero(model, false, false);
            }

            changeHeroCodeList.add(entry.getValue());
            switch (model) {
               case MODEL_UNION_SKILL:
               case MODEL_ARTIFACT_STRONGLV:
                  this.updateHeroScore(model, (HeroDao)entry.getValue());
               default:
                  this.updateNationHeroRank((HeroDao)entry.getValue(), true);
            }
         }
      }

      this.sendHeroList2Client(changeHeroCodeList);
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      heroArrayingPart.flushHeroArrayingMirror(model, oldPower, true);
   }

   public void flushAllHeroAndArraying(HeroDefine.HeroPropertyModel model, int type) {
      long oldPower = this.player.getPlayerCombatPower();
      int friendCode = this.updateFriendAndKingProperty(false, model);
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      Set<Integer> arrayingHeroCodeSet = heroArrayingPart.getArrayingHeroCodes(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      List<HeroDao> changeHeroCodeList = new ArrayList();
      boolean isArraying = false;

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         boolean isNeedFlush = ((HeroDao)entry.getValue()).isNeedFlush();
         if (isNeedFlush) {
            if ((Integer)entry.getKey() == friendCode) {
               changeHeroCodeList.add(entry.getValue());
            } else {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", ((HeroDao)entry.getValue()).id);
               if (heroModel.getType() == type || arrayingHeroCodeSet.contains(entry.getKey())) {
                  ((HeroDao)entry.getValue()).flushHero(model, false, false);
                  changeHeroCodeList.add(entry.getValue());
                  switch (model) {
                     case MODEL_UNION_SKILL:
                     case MODEL_ARTIFACT_STRONGLV:
                        this.updateHeroScore(model, (HeroDao)entry.getValue());
                     default:
                        if (((HeroDao)entry.getValue()).containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber())) {
                           if (((HeroDao)entry.getValue()).invalidTime == 0) {
                              this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), ((HeroDao)entry.getValue()).id, ((HeroDao)entry.getValue()).getCombatPower(), ((HeroDao)entry.getValue()).code});
                           }

                           this.updateNationHeroRank((HeroDao)entry.getValue(), true);
                           isArraying = true;
                        }
                  }
               }
            }
         }
      }

      this.sendHeroList2Client(changeHeroCodeList);
      if (isArraying) {
         heroArrayingPart.flushHeroArrayingMirror(model, oldPower, false);
      }

   }

   public void flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel model, Set<Integer> heroCodeSet, boolean isSendToClient, boolean isFlushPower) {
      if (!heroCodeSet.isEmpty()) {
         long oldPower = this.player.getPlayerCombatPower();
         Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
         List<HeroDao> changeHeroCodeList = new ArrayList();
         boolean isArraying = false;

         for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
            if (heroCodeSet.contains(entry.getKey())) {
               ((HeroDao)entry.getValue()).flushHero(model, false, false);
               changeHeroCodeList.add(entry.getValue());
               switch (model) {
                  case MODEL_UNION_SKILL:
                  case MODEL_ARTIFACT_STRONGLV:
                     this.updateHeroScore(model, (HeroDao)entry.getValue());
               }

               if (((HeroDao)entry.getValue()).containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber())) {
                  isArraying = true;
                  if (((HeroDao)entry.getValue()).invalidTime == 0) {
                     this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), ((HeroDao)entry.getValue()).id, ((HeroDao)entry.getValue()).getCombatPower(), ((HeroDao)entry.getValue()).code});
                  }
               }
            }
         }

         if (isSendToClient) {
            this.sendHeroList2Client(changeHeroCodeList);
         }

         if (isArraying && isFlushPower) {
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            heroArrayingPart.flushHeroArrayingMirror(model, oldPower, false);
         }

      }
   }

   public void flushHeroIdAndArraying(HeroDefine.HeroPropertyModel model, List<Integer> heroIdList) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      int friendCode = this.updateFriendAndKingProperty(false, model);
      Set<Integer> arrayingHeroSet = heroArrayingPart.getArrayingHeroCodes(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      long oldPower = this.player.getPlayerCombatPower();
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      List<HeroDao> changeHeroCodeList = new ArrayList();
      boolean isArraying = false;

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         if (heroIdList.contains(((HeroDao)entry.getValue()).id) || arrayingHeroSet.contains(entry.getKey())) {
            if ((Integer)entry.getKey() != friendCode) {
               ((HeroDao)entry.getValue()).flushHero(model, false, false);
            }

            changeHeroCodeList.add(entry.getValue());
            switch (model) {
               case MODEL_UNION_SKILL:
               case MODEL_ARTIFACT_STRONGLV:
                  this.updateHeroScore(model, (HeroDao)entry.getValue());
               default:
                  if (((HeroDao)entry.getValue()).containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber())) {
                     isArraying = true;
                     if (((HeroDao)entry.getValue()).invalidTime == 0) {
                        this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), ((HeroDao)entry.getValue()).id, ((HeroDao)entry.getValue()).getCombatPower(), ((HeroDao)entry.getValue()).code});
                     }

                     this.updateNationHeroRank((HeroDao)entry.getValue(), true);
                  }
            }
         }
      }

      this.sendHeroList2Client(changeHeroCodeList);
      if (isArraying) {
         heroArrayingPart.flushHeroArrayingMirror(model, oldPower, false);
      }

   }

   public void flushNationHeroAndArraying(HeroDefine.HeroPropertyModel model, int nation) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      int friendCode = this.updateFriendAndKingProperty(false, model);
      Set<Integer> arrayingHeroCodeSet = heroArrayingPart.getArrayingHeroCodes(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      long oldPower = this.player.getPlayerCombatPower();
      Map<Integer, HeroModel> heroModelMap = this.player.getGameModelPool().getMap("hero");
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      List<HeroDao> changeHeroCodeList = new ArrayList();
      boolean isArraying = false;

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         boolean isNeedFlush = ((HeroDao)entry.getValue()).isNeedFlush();
         if (isNeedFlush) {
            int realNation = this.getHeroNation((HeroDao)entry.getValue());
            if (realNation == nation || arrayingHeroCodeSet.contains(entry.getKey())) {
               if ((Integer)entry.getKey() != friendCode) {
                  ((HeroDao)entry.getValue()).flushHero(model, false, false);
               }

               changeHeroCodeList.add(entry.getValue());
               switch (model) {
                  case MODEL_UNION_SKILL:
                  case MODEL_ARTIFACT_STRONGLV:
                     this.updateHeroScore(model, (HeroDao)entry.getValue());
                  default:
                     if (((HeroDao)entry.getValue()).containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber())) {
                        isArraying = true;
                        if (((HeroDao)entry.getValue()).invalidTime == 0) {
                           this.heroRankMgr.pushTaskEx("updateHeroRank", new Object[]{this.player.getPlayerId(), ((HeroDao)entry.getValue()).id, ((HeroDao)entry.getValue()).getCombatPower(), ((HeroDao)entry.getValue()).code});
                        }

                        this.updateNationHeroRank((HeroDao)entry.getValue(), true);
                     }
               }
            }
         }
      }

      this.sendHeroList2Client(changeHeroCodeList);
      if (isArraying) {
         heroArrayingPart.flushHeroArrayingMirror(model, oldPower, false);
      }

   }

   public void sendHeroList2ClientByHeroDao(HeroDao heroDao) {
      List<HeroDao> heroList = new ArrayList();
      heroList.add(heroDao);
      this.sendHeroList2Client(heroList);
   }

   public void sendHeroList2ClientByCode(Set<Integer> codeSet) {
      if (!codeSet.isEmpty()) {
         List<HeroDao> list = new ArrayList();

         for(Integer code : codeSet) {
            HeroDao heroDao = this.getHeroByCode(code);
            list.add(heroDao);
         }

         this.sendHeroList2Client(list);
      }
   }

   public void sendHeroList2Client(List<HeroDao> heroDaoList) {
      if (heroDaoList.isEmpty()) {
         this.logger.info("玩家={}，发送英雄列表为空", this.player.getPlayerId());
      } else {
         HeroMsg.S2C_HeroBaseData_5002.Builder builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
         int highestLv = 1;
         int highestStar = 1;

         for(HeroDao heroDao : heroDaoList) {
            builder.addHeros(heroDao.toHeroInfo());
            if (heroDao.getLv() > highestLv) {
               highestLv = heroDao.getLv();
            }

            if (heroDao.getStar() > highestStar) {
               highestStar = heroDao.getStar();
            }
         }

         this.player.sendMsg(builder.build());
         if (!this.player.isRobot()) {
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            if (playerExtend.heroHighestLv < highestLv) {
               playerExtend.heroHighestLv = highestLv;
               this.player.updatePlayerExtend(13);
               this.player.notifyPlayerData(PlayerDefine.HERO_HIGHEST_LV, playerExtend.heroHighestLv);
            }

            if (playerExtend.heroHighestStar < highestStar) {
               playerExtend.heroHighestStar = highestStar;
               this.player.updatePlayerExtend(13);
               this.player.notifyPlayerData(PlayerDefine.HERO_HIGHEST_STAR, playerExtend.heroHighestStar);
            }
         }

      }
   }

   @TaskMethod
   public void sendHeroList2Client(Map<Integer, HeroDao> herosMap) {
      long startTime = System.currentTimeMillis();
      if (!herosMap.isEmpty()) {
         List<HeroDao> list = new ArrayList();
         int maxCode = 0;

         for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
            if (((HeroDao)entry.getValue()).code > maxCode) {
               maxCode = ((HeroDao)entry.getValue()).code;
            }

            list.add(entry.getValue());
         }

         this.sendHeroList2Client(list);
         this.player.checkUnionCode(CodeDefine.HERO_CODE, maxCode);
      }
   }

   public HeroDao addHero(int id, boolean isSend, int module, int reason, int misc1, int misc2, String misc3) {
      HeroDao heroDao = this.addHeroPrivate(id, module, reason, misc1, misc2, misc3);
      ((HeroArchivePart)this.player.getMgrPart(HeroArchivePart.class)).takeNewHero(id);
      if (isSend && heroDao != null) {
         List<HeroDao> successList = new ArrayList();
         successList.add(heroDao);
         this.sendHeroList2Client(successList);
      }

      return heroDao;
   }

   public List<HeroDao> addHero(int id, int num, boolean isSend, int module, int reason, int misc1, int misc2, String misc3) {
      List<HeroDao> successList = new ArrayList();

      for(int i = 0; i < num; ++i) {
         HeroDao heroDao = this.addHeroPrivate(id, module, reason, misc1, misc2, misc3);
         ((HeroArchivePart)this.player.getMgrPart(HeroArchivePart.class)).takeNewHero(id);
         if (heroDao != null) {
            successList.add(heroDao);
         }
      }

      if (isSend && successList.size() > 0) {
         this.sendHeroList2Client(successList);
      }

      return successList;
   }

   public List<HeroDao> addHero(List<Integer> ids, boolean isSend, int module, int reason, int misc1, int misc2, String misc3) {
      List<HeroDao> successList = new ArrayList();

      for(Integer id : ids) {
         HeroDao heroDao = this.addHeroPrivate(id, module, reason, misc1, misc2, misc3);
         ((HeroArchivePart)this.player.getMgrPart(HeroArchivePart.class)).takeNewHero(id);
         if (heroDao != null) {
            successList.add(heroDao);
         }
      }

      if (isSend) {
         this.sendHeroList2Client(successList);
      }

      return successList;
   }

   private HeroDao addHeroPrivate(int id, int module, int reason, int misc1, int misc2, String misc3) {
      HeroModel heroMode1 = (HeroModel)this.player.getGameModelPool().getEntity("hero", id);
      if (heroMode1 == null) {
         this.logger.info(String.format("模板id为%d的英雄不存在", id));
         return null;
      } else {
         List<HeroDao> heroDaoList = this.getHeroById(id);
         if (!heroDaoList.isEmpty()) {
            HeroDao heroDao = (HeroDao)heroDaoList.get(0);
            if (heroDao.invalidTime > 0) {
            }
         }

         if (this.isEnableAddHero(1)) {
            HeroDao heroDao = this.insertHero(heroMode1, module, reason, misc1, misc2, misc3);
            return heroDao;
         } else {
            this.logger.info("武将背包已满，发送到邮件中 heroId:{}, num:{}", id, 1);
            this.player.failure(51019);
            this.sendHeroMail(id, 1, module, reason);
            return null;
         }
      }
   }

   public int getBagMaxNumber() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      PlayerPublicDao playerDao = this.player.getPublicDao();
      int buyNum = playerExtend.heroBagBuyNum;
      VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", playerDao.vip_lv);
      int totalNum = vipModel.getHeroLimit();
      if (buyNum > 0) {
         for(int i = 0; i < buyNum; ++i) {
            HeroBagModel heroBagModel = (HeroBagModel)this.player.getGameModelPool().getEntity("heroBag", i + 1);
            totalNum += heroBagModel.getLattice();
         }
      }

      return totalNum;
   }

   private HeroDao insertHero(HeroModel heroMode1, int module, int reason, int misc1, int misc2, String misc3) {
      List<HeroDao> invalidHeroes = this.getHeroById(heroMode1.getId());
      if (invalidHeroes.size() == 1 && ((HeroDao)invalidHeroes.get(0)).invalidTime > 0) {
         HeroDao heroDao = (HeroDao)invalidHeroes.get(0);
         heroDao.invalidTime = 0;
         heroDao.updateOp();
         return heroDao;
      } else {
         HeroDao heroDao = new HeroDao();
         heroDao.playerId = this.player.getPlayerId();
         heroDao.code = this.player.getUniqueCode(CodeDefine.HERO_CODE);
         heroDao.id = heroMode1.getId();
         heroDao.type = heroMode1.getHeroSpType();
         heroDao.quality = heroMode1.getQuality();
         heroDao.setBreachLv(0);
         heroDao.setLv(1);
         heroDao.setStar(heroMode1.getStar());
         this.player.insertDao(heroDao);
         this.logHero(heroDao, 1, module, reason, misc1, misc2, misc3);
         if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            if (!this.player.isRobot()) {
               this.triggerHeroStarTask(heroDao, true);
            }

            ActHeroImprovePart actHeroImprovePart = (ActHeroImprovePart)this.player.getMgrPart(ActHeroImprovePart.class);
            actHeroImprovePart.checkHeroMaxStarChange(heroDao.id);
            KrActHeroImprovePart krActHeroImprovePart = (KrActHeroImprovePart)this.player.getMgrPart(KrActHeroImprovePart.class);
            krActHeroImprovePart.checkHeroMaxStarChange(heroDao.id);
            this.recordMaxStar(heroDao.id, heroDao.getStar(), false);
         } else {
            this.player.triggerTask(758, 0, 1L, 1);
         }

         return heroDao;
      }
   }

   private HeroDao insertHero(HeroModel heroMode1, int experienceTime, int module, int reason, int misc1, int misc2, String misc3) {
      HeroDao heroDao = new HeroDao();
      heroDao.playerId = this.player.getPlayerId();
      heroDao.code = this.player.getUniqueCode(CodeDefine.HERO_CODE);
      heroDao.id = heroMode1.getId();
      heroDao.type = heroMode1.getHeroSpType();
      heroDao.quality = heroMode1.getQuality();
      heroDao.setBreachLv(0);
      heroDao.setLv(1);
      heroDao.setStar(heroMode1.getStar());
      heroDao.invalidTime = DateUtil.getIntTime(System.currentTimeMillis()) + experienceTime;
      this.player.insertDao(heroDao);
      this.logHero(heroDao, 1, module, reason, misc1, misc2, misc3);
      if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
         this.player.triggerTask(758, 0, 1L, 1);
      }

      return heroDao;
   }

   public HeroDao insertRobotHero(int heroId, int lv, int breach, int star, Map<Integer, EquipItem> equips, Map<Integer, WarriorSignet> warriors, Map<Integer, Integer> warcrafts) {
      HeroModel heroMode1 = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
      if (heroMode1 == null) {
         this.logger.info(String.format("模板id为%d的英雄不存在", heroId));
         return null;
      } else {
         int code = this.player.getUniqueCode(CodeDefine.HERO_CODE);
         this.getHeroByCode(code);
         HeroDao heroDao = new HeroDao();
         heroDao.playerId = this.player.getPlayerId();
         heroDao.code = code;
         heroDao.id = heroMode1.getId();
         heroDao.type = heroMode1.getHeroSpType();
         heroDao.quality = heroMode1.getQuality();
         heroDao.setBreachLv(breach);
         heroDao.setLv(lv);
         heroDao.setStar(star);
         heroDao.equips = equips;
         heroDao.warriors = warriors;
         heroDao.warcrafts = warcrafts;
         this.player.insertDao(heroDao);
         this.logHero(heroDao, 1, 4, 451, 0, 0, "");
         return heroDao;
      }
   }

   public void addHeroForAssign(int heroId, int num, int lv, int star, int module, int reason, int misc1, int misc2, String misc3) {
      List<HeroDao> successList = new ArrayList();
      List<CommonMsg.ItemInfo.Builder> resourceModels = new ArrayList();

      for(int i = 0; i < num; ++i) {
         HeroDao heroDao = this.insertSpecialHero(heroId, lv, star, module, reason, misc1, misc2, misc3);
         ((HeroArchivePart)this.player.getMgrPart(HeroArchivePart.class)).takeNewHero(heroId);
         if (heroDao != null) {
            CommonMsg.ItemInfo.Builder info_builder = CommonMsg.ItemInfo.newBuilder();
            info_builder.setType(3);
            info_builder.setId(heroId);
            info_builder.setCode(heroDao.code);
            info_builder.setNum(1);
            info_builder.setStar(heroDao.getStar());
            resourceModels.add(info_builder);
            this.triggerHeroStarTask(heroDao, true);
            successList.add(heroDao);
         }
      }

      if (star == 13) {
         this.checkStar13HeroNum((PlayerExtend)this.player.getPlayerExtend(13));
      }

      this.sendHeroList2Client(successList);
      this.player.sendResourceMsgForAssignHero(resourceModels);
      HeroPromotePart heroPromotePart = (HeroPromotePart)this.player.getMgrPart(HeroPromotePart.class);
      heroPromotePart.checkExtraLvLimit(star);
   }

   public HeroDao insertHeroPalace(HeroModel heroMode1) {
      int code = this.player.getUniqueCode(CodeDefine.HERO_CODE);
      this.getHeroByCode(code);
      HeroDao heroDao = new HeroDao();
      heroDao.playerId = this.player.getPlayerId();
      heroDao.code = code;
      heroDao.id = heroMode1.getId();
      heroDao.quality = heroMode1.getQuality();
      heroDao.setBreachLv(0);
      heroDao.setLv(1);
      heroDao.setStar(heroMode1.getStar());
      heroDao.type = heroMode1.getHeroSpType();
      this.player.insertDao(heroDao);
      this.logHero(heroDao, 1, 90, 9001, 0, 0, "");
      return heroDao;
   }

   private HeroDao insertSpecialHero(int heroId, int lv, int star, int module, int reason, int misc1, int misc2, String misc3) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
      if (heroModel == null) {
         this.logger.info(String.format("模板id为%d的英雄不存在", heroId));
         return null;
      } else {
         int fixLv = lv;
         int fixStar = Math.max(star, heroModel.getStar());
         MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
         int maxStar = monsterManager.getMaxStarOfHero(heroId);
         if (fixStar > maxStar) {
            fixStar = maxStar;
         }

         if (lv > MonsterManager.maxLvByStar[fixStar]) {
            fixLv = MonsterManager.maxLvByStar[star];
         }

         int fixBreach = monsterManager.getBreachLvByLv(fixStar, fixLv);
         HeroDao heroDao = new HeroDao();
         heroDao.playerId = this.player.getPlayerId();
         heroDao.code = this.player.getUniqueCode(CodeDefine.HERO_CODE);
         heroDao.id = heroModel.getId();
         heroDao.type = heroModel.getHeroSpType();
         heroDao.quality = heroModel.getQuality();
         heroDao.setBreachLv(fixBreach);
         heroDao.setLv(fixLv);
         heroDao.setStar(fixStar);
         if (fixStar > heroModel.getStar()) {
            HeroUpStarModel heroUpStarModel = null;
            int upStarId = heroModel.getUpStarId();
            int loop = 0;

            do {
               heroUpStarModel = (HeroUpStarModel)this.player.getGameModelPool().getEntity("heroUpStar", upStarId);
               if (heroUpStarModel == null) {
                  return null;
               }

               upStarId = heroUpStarModel.getNext();
               ++loop;
            } while(fixStar > heroUpStarModel.getStarLevel() && loop <= 100);

            if (loop >= 100) {
               this.logger.error("处理升星模板出错，玩家={}，heroid={}，lv={},star={}", new Object[]{this.player.getPlayerId(), heroId, lv, star});
               return null;
            }

            heroDao.upStarId = heroUpStarModel.getNext();
         }

         this.player.insertDao(heroDao);
         this.logHero(heroDao, 1, module, reason, misc1, misc2, misc3);
         this.player.triggerTask(204, lv, 1L, 1);
         this.recordMaxStar(heroDao.id, heroDao.getStar(), false);
         return heroDao;
      }
   }

   public boolean handleHeroRecall(int code) {
      HeroDao heroDao = this.getHeroByCode(code);
      if (heroDao == null) {
         this.logger.warn("删除的英雄不存在:" + code);
         return false;
      } else {
         HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
         HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();
         if (heroDao.code == heroPalaceDao.heroCode) {
            return this.player.failure(76042);
         } else if (heroDao.code == heroPalaceDao.shareCode) {
            return this.player.failure(76047);
         } else if (this.linkHeroCantDo(heroDao)) {
            return false;
         } else if (heroDao.isHaveArrayingState()) {
            this.logger.warn("英雄状态不为普通，code={}，state={}", code, heroDao.getStateList());
            return false;
         } else if (heroDao.lock) {
            this.logger.warn("英雄已锁，code={}，lock={}", code, heroDao.lock);
            return false;
         } else {
            int star = heroDao.getStar();
            int shrineRecallProp = this.configManager.getInt("shrineRecallProp");
            HashMap<Integer, Integer> mapPropNum = this.configManager.getIntMap("shrineRecallPropNum");
            if (!mapPropNum.containsKey(star)) {
               this.logger.warn("转生神坛-回溯消耗配置错误 shrineRecallPropNum");
               return false;
            } else {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               HashMap<Integer, Integer> mapChip = this.configManager.getIntMap("shrineReturnRandomChip");
               if (!mapChip.containsKey(heroModel.getNation())) {
                  this.logger.warn("转生神坛-配置错误 shrineReturnRandomChip");
                  return false;
               } else {
                  int needNum = (Integer)mapPropNum.get(star);
                  if (!this.player.checkResourceNum(2, shrineRecallProp, needNum)) {
                     return this.player.failure(3);
                  } else {
                     List<ResourceModel> returnResourceList = new ArrayList();
                     List<CommonMsg.ItemInfo.Builder> showList = new ArrayList();
                     int shrine_recall_type = 3;
                     if (heroModel.getNation() == 10) {
                        shrine_recall_type = 6;
                     }

                     for(ResourceModel resourceModel : this.shrineReturn(shrine_recall_type, heroDao)) {
                        ResourceModel.addResourceToList(returnResourceList, resourceModel);
                     }

                     this.starMapResetAndReturn(heroDao.code, returnResourceList, true);
                     HeroUpgradePart heroUpgradePart = (HeroUpgradePart)this.player.getMgrPart(HeroUpgradePart.class);
                     int levelMax = heroUpgradePart.getLevelMax(heroDao.id, heroDao.getBreachLv(), 9);
                     if (levelMax < heroDao.getLv()) {
                        List<ResourceModel> upgradeList = this.getUpgradeMaterial(levelMax, heroDao.getLv());
                        if (!upgradeList.isEmpty()) {
                           returnResourceList.addAll(upgradeList);
                        }
                     }

                     Map<Integer, Integer> materialMap = this.getStarUpMaterial(heroDao.id, 9, heroDao.getStar());

                     for(Map.Entry<Integer, Integer> entry : materialMap.entrySet()) {
                        ResourceModel.addResourceToList(returnResourceList, new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
                     }

                     heroUpgradePart.recallHero(heroDao.code);
                     this.player.delResource(2, shrineRecallProp, (long)needNum, 26, 2603, 0, 0, "");
                     CommonMsg.ItemInfo.Builder itemInfoBuilder = CommonMsg.ItemInfo.newBuilder();
                     itemInfoBuilder.setType(3);
                     itemInfoBuilder.setId(heroDao.id);
                     itemInfoBuilder.setNum(1);
                     itemInfoBuilder.setCode(heroDao.code);
                     itemInfoBuilder.setStar(heroDao.getStar());
                     this.player.addResourceMsgByBuilder(itemInfoBuilder);
                     TotemPart totemPart = (TotemPart)this.player.getMgrPart(TotemPart.class);
                     totemPart.takeOffTotem(heroDao.code);
                     HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
                     if (heroDao.warFlag != null) {
                        int warFlagId = heroDao.warFlag.id;
                        int warFloagCode = heroWearPart.handleUndressWarFlag(heroDao.code);
                        showList.add(this.buildCommonItemInfo(2, warFlagId, 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_FLAG.getNumber(), warFloagCode));
                     }

                     if (!heroDao.castSouls.isEmpty()) {
                        CastSoulPart castSoulPart = (CastSoulPart)this.player.getMgrPart(CastSoulPart.class);
                        List<ResourceModel> resourceModels = castSoulPart.getResetCastSoulResource(heroDao);
                        if (castSoulPart.resetCastSoul(heroDao)) {
                           for(ResourceModel resourceModel : resourceModels) {
                              ResourceModel.addResourceToList(returnResourceList, resourceModel);
                           }
                        }
                     }

                     if (!heroDao.strengthLev.isEmpty()) {
                        for(Integer lev : heroDao.strengthLev.values()) {
                           EquipRefineModel model = (EquipRefineModel)this.player.getGameModelPool().getEntity("EquipRefine", lev);
                           if (model != null) {
                              for(ResourceModel resourceModel : model.getBackMaterial()) {
                                 ResourceModel.addResourceToList(returnResourceList, resourceModel);
                              }
                           }
                        }

                        heroDao.strengthLev.clear();
                        heroDao.strengthSkill.clear();
                     }

                     if (heroDao.aide > 0) {
                        HeroAidePart heroAidePart = (HeroAidePart)this.player.getMgrPart(HeroAidePart.class);
                        CommonMsg.ItemInfo.Builder builder = heroAidePart.handleHeroAideDown(heroDao, 1, false);
                        if (builder != null) {
                           showList.add(builder);
                        }
                     }

                     if (heroDao.aide2 > 0) {
                        HeroAidePart heroAidePart = (HeroAidePart)this.player.getMgrPart(HeroAidePart.class);
                        CommonMsg.ItemInfo.Builder builder = heroAidePart.handleHeroAideDown(heroDao, 2, false);
                        if (builder != null) {
                           showList.add(builder);
                        }
                     }

                     if (heroDao.warHorse != null) {
                        ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                        WarHorse newWarHorse = itemBagPart.addWarHorse(heroDao.warHorse, 12, 1217, heroDao.code, 0, "undressHorse");
                        this.player.additemUpdateBuilder(newWarHorse);
                        heroDao.warHorse = null;
                        heroDao.updateOp();
                        showList.add(this.buildCommonItemInfo(2, newWarHorse.id, 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_HORSE.getNumber(), newWarHorse.code));
                     }

                     if (heroDao.exclusiveWeaponMap != null && heroDao.exclusiveWeaponMap.size() > 0) {
                        ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

                        for(Map.Entry<Integer, ExclusiveWeaponItem> entry : heroDao.exclusiveWeaponMap.entrySet()) {
                           ExclusiveWeaponItem addEwItem = itemBagPart.addExclusiveWeaponItem((ExclusiveWeaponItem)entry.getValue(), 26, 2603, 0, 0, "");
                           this.player.additemUpdateBuilder(addEwItem);
                           showList.add(this.buildCommonItemInfo(2, addEwItem.id, 1, heroDao.code, (Integer)entry.getKey(), addEwItem.code));
                        }

                        heroDao.exclusiveWeaponMap.clear();
                        heroDao.soulSkill.clear();
                        heroDao.updateOp();
                     }

                     List<Integer> forgetList = new ArrayList();
                     if (heroDao.warcrafts.containsKey(8)) {
                        forgetList.add(8);
                     }

                     if (heroDao.warcrafts.containsKey(9)) {
                        forgetList.add(9);
                     }

                     if (heroDao.warcrafts.containsKey(31)) {
                        forgetList.add(31);
                     }

                     if (!forgetList.isEmpty()) {
                        HeroWearPart wearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);

                        for(ResourceModel resourceModel : wearPart.forgetWarcraft(heroDao, forgetList, true)) {
                           ResourceModel.addResourceToList(returnResourceList, resourceModel);
                        }
                     }

                     if (!heroDao.runeStone.isEmpty()) {
                        RuneStonePart runeStonePart = (RuneStonePart)this.player.getMgrPart(RuneStonePart.class);
                        runeStonePart.heroReborn(heroDao);
                     }

                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                     this.player.addResource(returnResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 26, 2603, 0, 0, "");
                     this.player.addResourceMsg(returnResourceList);
                     this.player.addResourceMsgByBuilder(showList);
                     this.player.sendResourceMsg();
                     this.player.getOperationMgr().addExtraLog(this.player, 171, heroModel.getType() + "&" + heroModel.getName() + "&" + star, needNum + "");
                     return true;
                  }
               }
            }
         }
      }
   }

   public List<CommonMsg.ItemInfo.Builder> getDelHeroReturnResourceList(List<Integer> codeList, HeroDefine.DelHeroReturnShowType type) {
      for(Integer code : codeList) {
         HeroDao heroDao = this.getHeroByCode(code);
         if (heroDao == null) {
            this.logger.warn("删除的英雄不存在:" + code);
            return null;
         }

         if (heroDao.isHaveArrayingState()) {
            this.logger.warn("英雄状态不为普通，code={}，state={}", code, heroDao.getStateList());
            return null;
         }

         if (heroDao.lock) {
            this.logger.warn("英雄已锁，code={}，lock={}", code, heroDao.lock);
            return null;
         }
      }

      List<ResourceModel> returnList = new ArrayList();
      Map<Integer, Integer> equipNumMap = new HashMap();
      List<CommonMsg.ItemInfo.Builder> itemInfoBuilderList = new ArrayList();

      for(Integer code : codeList) {
         HeroDao heroDao = this.getHeroByCode(code);
         if (type != HeroDefine.DelHeroReturnShowType.RECALL) {
            for(Map.Entry<Integer, EquipItem> itemEntry : heroDao.equips.entrySet()) {
               int oldNum = (Integer)equipNumMap.getOrDefault(((EquipItem)itemEntry.getValue()).id, 0);
               equipNumMap.put(((EquipItem)itemEntry.getValue()).id, oldNum + 1);
            }

            if (!heroDao.warriors.isEmpty()) {
               for(Map.Entry<Integer, WarriorSignet> entry : heroDao.warriors.entrySet()) {
                  WarriorSignet warriorSignet = (WarriorSignet)entry.getValue();
                  itemInfoBuilderList.add(this.buildCommonItemInfo(2, warriorSignet.id, 1, heroDao.code, (Integer)entry.getKey()));
               }
            }

            if (heroDao.exTreasure != null && !heroDao.exTreasure.stoneMap.isEmpty()) {
               if (!heroDao.exTreasure.stoneMap.isEmpty()) {
                  for(Map.Entry<CommonMsg.StonePosition, Integer> entry : heroDao.exTreasure.stoneMap.entrySet()) {
                     ResourceModel.addResourceToList(returnList, new ResourceModel(2, (Integer)entry.getValue(), 1));
                  }
               }

               Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               List<ExclusiveTreasureBaseModel> extraLevList = new ArrayList();

               for(ExclusiveTreasureBaseModel baseModel : modelMap.values()) {
                  if (baseModel.getLev() < heroDao.exTreasure.lev && baseModel.getStar() <= heroDao.exTreasure.star && baseModel.getNation() == heroModel.getType()) {
                     extraLevList.add(baseModel);
                  }
               }

               for(int i = 0; i < extraLevList.size(); ++i) {
                  for(ResourceModel resourceModel : ((ExclusiveTreasureBaseModel)extraLevList.get(i)).getUpLevConsume()) {
                     ResourceModel.addResourceToList(returnList, resourceModel);
                  }
               }

               List<ExclusiveTreasureBaseModel> extraStarList = new ArrayList();

               for(ExclusiveTreasureBaseModel value : modelMap.values()) {
                  if (value.getLev() <= heroDao.exTreasure.lev && value.getStar() < heroDao.exTreasure.star && value.getNation() == heroModel.getType()) {
                     extraStarList.add(value);
                  }
               }

               for(int i = 0; i < extraStarList.size(); ++i) {
                  for(ResourceModel resourceModel : ((ExclusiveTreasureBaseModel)extraStarList.get(i)).getUpStarConsume()) {
                     ResourceModel.addResourceToList(returnList, resourceModel);
                  }
               }
            }

            if (!heroDao.ornament.isEmpty()) {
               for(Map.Entry<Integer, OrnamentItem> entry : heroDao.ornament.entrySet()) {
                  OrnamentItem ornamentItem = (OrnamentItem)entry.getValue();
                  itemInfoBuilderList.add(this.buildCommonItemInfo(2, ornamentItem.id, 1, heroDao.code, (Integer)entry.getKey()));
               }
            }
         }

         if (heroDao.warFlag != null) {
            itemInfoBuilderList.add(this.buildCommonItemInfo(2, heroDao.warFlag.id, 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_FLAG.getNumber()));
         }

         if (!heroDao.runeStone.isEmpty()) {
            for(Map.Entry<Integer, RuneStoneItem> entry : heroDao.runeStone.entrySet()) {
               RuneStoneItem runeStoneItem = (RuneStoneItem)entry.getValue();
               itemInfoBuilderList.add(this.buildCommonItemInfo(2, runeStoneItem.id, 1, heroDao.code, (Integer)entry.getKey()));
            }
         }

         if (heroDao.warHorse != null) {
            itemInfoBuilderList.add(this.buildCommonItemInfo(2, heroDao.warHorse.id, 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_HORSE.getNumber()));
         }

         if (!heroDao.strengthLev.isEmpty()) {
            for(Integer lev : heroDao.strengthLev.values()) {
               EquipRefineModel model = (EquipRefineModel)this.player.getGameModelPool().getEntity("EquipRefine", lev);
               if (model != null) {
                  for(ResourceModel resourceModel : model.getBackMaterial()) {
                     ResourceModel.addResourceToList(returnList, resourceModel);
                  }
               }
            }
         }

         if (heroDao.aide > 0) {
            AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
            if (aideLevelModel != null) {
               itemInfoBuilderList.add(this.buildCommonItemInfo(2, aideLevelModel.getAideId(), 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_AIDE.getNumber()));
            }
         }

         if (heroDao.aide2 > 0) {
            AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide2);
            if (aideLevelModel != null) {
               itemInfoBuilderList.add(this.buildCommonItemInfo(2, aideLevelModel.getAideId(), 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_AIDE.getNumber()));
            }
         }

         List<Integer> forgetList = new ArrayList();
         if (type == HeroDefine.DelHeroReturnShowType.RECALL) {
            if (heroDao.warcrafts.containsKey(8)) {
               forgetList.add(8);
            }

            if (heroDao.warcrafts.containsKey(9)) {
               forgetList.add(9);
            }

            if (heroDao.warcrafts.containsKey(31)) {
               forgetList.add(31);
            }

            if (!forgetList.isEmpty()) {
               HeroWearPart wearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);

               for(ResourceModel resourceModel : wearPart.forgetWarcraft(heroDao, forgetList, false)) {
                  ResourceModel.addResourceToList(returnList, resourceModel);
               }
            }
         } else if (!heroDao.warcrafts.isEmpty()) {
            HeroWearPart wearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);

            for(ResourceModel resourceModel : wearPart.forgetWarcraft(heroDao, new ArrayList(heroDao.warcrafts.keySet()), false)) {
               ResourceModel.addResourceToList(returnList, resourceModel);
            }
         }

         if (!heroDao.castSouls.isEmpty()) {
            CastSoulPart castSoulPart = (CastSoulPart)this.player.getMgrPart(CastSoulPart.class);

            for(ResourceModel resourceModel : castSoulPart.getResetCastSoulResource(heroDao)) {
               ResourceModel.addResourceToList(returnList, resourceModel);
            }
         }

         this.starMapResetAndReturn(heroDao.code, returnList, false);
         if (heroDao.godBeastItem != null) {
            itemInfoBuilderList.add(this.buildCommonItemInfo(2, heroDao.godBeastItem.id, 1, heroDao.code, CommonMsg.WearPosition.WEARPOSITION_GOD_BEAST.getNumber()));
         }

         if (heroDao.exclusiveWeaponMap != null && heroDao.exclusiveWeaponMap.size() > 0) {
            for(Map.Entry<Integer, ExclusiveWeaponItem> entry : heroDao.exclusiveWeaponMap.entrySet()) {
               Integer pos = (Integer)entry.getKey();
               ExclusiveWeaponItem ewItem = (ExclusiveWeaponItem)entry.getValue();
               itemInfoBuilderList.add(this.buildCommonItemInfo(2, ewItem.id, 1, heroDao.code, pos));
            }
         }

         if (!heroDao.talent.isEmpty()) {
            HeroTalentPart heroTalentPart = (HeroTalentPart)this.player.getMgrPart(HeroTalentPart.class);

            for(ResourceModel recallReturnResource : heroTalentPart.getRecallReturnResources(heroDao)) {
               ResourceModel.addResourceToList(returnList, recallReturnResource);
            }
         }

         if (type == HeroDefine.DelHeroReturnShowType.RECALL) {
            int maxLv = MonsterManager.maxLvByStar[9];

            for(ResourceModel resourceModel : this.getUpgradeMaterial(maxLv, heroDao.getLv())) {
               ResourceModel.addResourceToList(returnList, resourceModel);
            }

            Map<Integer, Integer> materialMap = this.getStarUpMaterial(heroDao.id, 9, heroDao.getStar());

            for(Map.Entry<Integer, Integer> entry : materialMap.entrySet()) {
               ResourceModel.addResourceToList(returnList, new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
            }
         } else {
            if (heroDao.getLv() > 1) {
               for(ResourceModel resourceModel : this.worldMgr.getUpgradeConsume(heroDao.getLv())) {
                  ResourceModel.addResourceToList(returnList, resourceModel);
               }
            }

            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel != null) {
               Map<Integer, Integer> materialMap = this.getStarUpMaterial(heroDao.id, heroModel.getStar(), heroDao.getStar());

               for(Map.Entry<Integer, Integer> entry : materialMap.entrySet()) {
                  ResourceModel.addResourceToList(returnList, new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
               }
            }

            if (heroDao.getBreachLv() > 0) {
               for(ResourceModel resourceModel : this.worldMgr.getBreachConsume(heroDao.getBreachLv())) {
                  ResourceModel.addResourceToList(returnList, resourceModel);
               }
            }
         }

         switch (type) {
            case SACRIFICE:
               PostModel postModel = (PostModel)this.player.getGameModelPool().getEntity("post", heroDao.getStar());
               if (postModel != null) {
                  for(ResourceModel resourceModel : postModel.getRewards()) {
                     ResourceModel.addResourceToList(returnList, resourceModel);
                  }
               }
               break;
            case RECALL:
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               if (heroModel == null) {
                  return null;
               }

               HashMap<Integer, Integer> mapChip = this.configManager.getIntMap("shrineReturnRandomChip");
               if (!mapChip.containsKey(heroModel.getNation())) {
                  this.logger.warn("转生神坛-配置错误 shrineReturnRandomChip");
                  return null;
               }

               int shrine_recall_type = 3;
               if (heroModel.getNation() == 10) {
                  shrine_recall_type = 6;
               }

               for(ResourceModel resourceModel : this.shrineReturn(shrine_recall_type, heroDao)) {
                  ResourceModel.addResourceToList(returnList, resourceModel);
               }

               CommonMsg.ItemInfo.Builder recallHeroItemInfo = CommonMsg.ItemInfo.newBuilder();
               recallHeroItemInfo.setType(3);
               recallHeroItemInfo.setId(heroDao.id);
               recallHeroItemInfo.setNum(1);
               recallHeroItemInfo.setStar(9);
               itemInfoBuilderList.add(recallHeroItemInfo);
         }
      }

      List<CommonMsg.ItemInfo.Builder> showBuilder = new ArrayList();

      for(ResourceModel resourceModel : returnList) {
         CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
         builder.setType(resourceModel.getType());
         builder.setId(resourceModel.getId());
         builder.setCode(-1);
         builder.setNum(resourceModel.getValue());
         showBuilder.add(builder);
      }

      for(Map.Entry<Integer, Integer> entry : equipNumMap.entrySet()) {
         CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
         builder.setType(2);
         builder.setId((Integer)entry.getKey());
         builder.setCode(-1);
         builder.setNum((Integer)entry.getValue());
         showBuilder.add(builder);
      }

      showBuilder.addAll(itemInfoBuilderList);
      return showBuilder;
   }

   public CommonMsg.ItemInfo.Builder buildCommonItemInfo(int type, int id, int num, int heroCode, int pos) {
      CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
      builder.setType(type);
      builder.setId(id);
      builder.setNum(num);
      builder.setHeroCode(heroCode);
      builder.setPos(pos);
      return builder;
   }

   public CommonMsg.ItemInfo.Builder buildCommonItemInfo(int type, int id, int num, int heroCode, int pos, int itemCode) {
      CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
      builder.setType(type);
      builder.setId(id);
      builder.setNum(num);
      builder.setHeroCode(heroCode);
      builder.setPos(pos);
      builder.setCode(itemCode);
      return builder;
   }

   public boolean deleteHero(List<Integer> codeList, HeroDefine.DelHeroType type, int module, int reason, int misc1, int misc2, String misc3) {
      Set<Integer> tempCodes = new HashSet(codeList);
      if (codeList.size() != 0 && tempCodes.size() == codeList.size()) {
         Set<Integer> delKingNation = new HashSet();

         for(Integer code : codeList) {
            HeroDao heroDao = this.getHeroByCode(code);
            if (heroDao == null) {
               this.logger.warn("删除的英雄不存在:" + code);
               return false;
            }

            if (heroDao.invalidTime == 0) {
               if ((heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE || heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) && reason != 411) {
                  return false;
               }

               if (heroDao.rune.runeRefineMap != null && !heroDao.rune.runeRefineMap.isEmpty()) {
                  this.logger.warn("英雄有洗炼属性，code={}", code);
                  return false;
               }
            } else if (type == HeroDefine.DelHeroType.DEL_USE) {
               this.logger.warn("限时武将无法使用，code={}", code);
               return false;
            }

            if (heroDao.isHaveArrayingState()) {
               this.logger.warn("英雄状态不为普通，code={}，state={}", code, heroDao.getStateList());
               return false;
            }

            if (heroDao.lock) {
               this.logger.warn("英雄已锁，code={}，lock={}", code, heroDao.lock);
               return false;
            }

            if (heroDao.isOnlyInvalidHeroAfterLeaveArraying()) {
               this.logger.warn("英雄code={}下阵之后只有限时英雄在阵上", code);
               return false;
            }

            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
               HeroDao kingDao = this.getKingHeroDao(heroModel.getNation());
               if (kingDao != null && kingDao.code == heroDao.code) {
                  delKingNation.add(heroModel.getNation());
               }
            }
         }

         this.heroUndressReturnItem(true, codeList, false, type, module, reason, misc1, misc2, misc3);
         ArmyArrayPart armyArrayPart = (ArmyArrayPart)this.player.getMgrPart(ArmyArrayPart.class);
         armyArrayPart.checkEyes(codeList);
         if (!delKingNation.isEmpty()) {
            for(Integer nation : delKingNation) {
               this.flushControlHero(HeroDefine.HeroPropertyModel.MODEL_HERO, nation);
            }
         }

         return true;
      } else {
         this.logger.warn("删除的英雄为空，或者有重复值 playerId:{} codes:{}", this.player.getPlayerId(), codeList);
         return false;
      }
   }

   public void heroUndressReturnItem(boolean isDel, List<Integer> codeList, boolean isSendItemUpdate, HeroDefine.DelHeroType type, int module, int reason, int misc1, int misc2, String misc3) {
      List<ResourceModel> heroReturns_AddTask = new ArrayList();
      List<ResourceModel> heroReturns_NoTask = new ArrayList();
      List<Integer> successList = new ArrayList();
      HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
      Map<Integer, Integer> equipMap = new HashMap();
      List<WarriorSignet> warriorList = new ArrayList();
      List<Totem> totemList = new ArrayList();
      List<WarFlag> warFlagList = new ArrayList();
      List<Integer> stoneList = new ArrayList();
      List<OrnamentItem> ornamentList = new ArrayList();
      List<RuneStoneItem> runeStoneItemList = new ArrayList();
      List<Integer> aideItemList = new ArrayList();
      List<WarHorse> warHorseList = new ArrayList();
      List<Integer> strengthList = new ArrayList();
      List<RuneItem> runeItemList = new ArrayList();
      List<GodBeastItem> godBeastItemList = new ArrayList();
      List<ExclusiveWeaponItem> exclusiveWeaponItemList = new ArrayList();
      List<RuneRefineInheritItem> runeRefineInheritItemList = new ArrayList();

      for(Integer code : codeList) {
         HeroDao heroDao = this.getHeroByCode(code);
         if (!heroDao.equips.isEmpty()) {
            for(Map.Entry<Integer, EquipItem> itemEntry : heroDao.equips.entrySet()) {
               int oldNum = (Integer)equipMap.getOrDefault(((EquipItem)itemEntry.getValue()).id, 0);
               equipMap.put(((EquipItem)itemEntry.getValue()).id, oldNum + 1);
            }
         }

         if (!heroDao.warriors.isEmpty()) {
            warriorList.addAll(heroDao.warriors.values());
         }

         Totem totem = heroDao.getTotem();
         if (totem != null) {
            totemList.add(totem);
         }

         if (heroDao.warFlag != null) {
            warFlagList.add(heroDao.warFlag);
         }

         if (heroDao.exTreasure != null) {
            Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            List<ExclusiveTreasureBaseModel> extraLevList = new ArrayList();

            for(ExclusiveTreasureBaseModel value : modelMap.values()) {
               if (value.getLev() < heroDao.exTreasure.lev && value.getStar() <= heroDao.exTreasure.star && value.getNation() == heroModel.getType()) {
                  extraLevList.add(value);
               }
            }

            for(int i = 0; i < extraLevList.size(); ++i) {
               for(ResourceModel resourceModel : ((ExclusiveTreasureBaseModel)extraLevList.get(i)).getUpLevConsume()) {
                  ResourceModel.addResourceToList(heroReturns_NoTask, resourceModel);
               }
            }

            List<ExclusiveTreasureBaseModel> extraStarList = new ArrayList();

            for(ExclusiveTreasureBaseModel value : modelMap.values()) {
               if (value.getLev() <= heroDao.exTreasure.lev && value.getStar() < heroDao.exTreasure.star && value.getNation() == heroModel.getType()) {
                  extraStarList.add(value);
               }
            }

            for(int i = 0; i < extraStarList.size(); ++i) {
               for(ResourceModel resourceModel : ((ExclusiveTreasureBaseModel)extraStarList.get(i)).getUpStarConsume()) {
                  ResourceModel.addResourceToList(heroReturns_NoTask, resourceModel);
               }
            }

            if (!heroDao.exTreasure.stoneMap.isEmpty()) {
               stoneList.addAll(heroDao.exTreasure.stoneMap.values());
            }
         }

         if (!heroDao.ornament.isEmpty()) {
            ornamentList.addAll(heroDao.ornament.values());
         }

         if (!heroDao.runeStone.isEmpty()) {
            runeStoneItemList.addAll(heroDao.runeStone.values());
         }

         if (heroDao.aide > 0) {
            aideItemList.add(heroDao.aide);
         }

         if (heroDao.aide2 > 0) {
            aideItemList.add(heroDao.aide2);
         }

         for(ResourceModel model : heroWearPart.forgetWarcraft(heroDao)) {
            ResourceModel.addResourceToList(heroReturns_NoTask, model);
         }

         if (!heroDao.castSouls.isEmpty()) {
            CastSoulPart castSoulPart = (CastSoulPart)this.player.getMgrPart(CastSoulPart.class);

            for(ResourceModel resourceModel : castSoulPart.getResetCastSoulResource(heroDao)) {
               ResourceModel.addResourceToList(heroReturns_NoTask, resourceModel);
            }
         }

         if (!heroDao.talent.isEmpty()) {
            HeroTalentPart heroTalentPart = (HeroTalentPart)this.player.getMgrPart(HeroTalentPart.class);

            for(ResourceModel resetReturnResource : heroTalentPart.getResetReturnResources(heroDao)) {
               ResourceModel.addResourceToList(heroReturns_NoTask, resetReturnResource);
            }
         }

         if (heroDao.warHorse != null) {
            warHorseList.add(heroDao.warHorse);
         }

         if (!heroDao.strengthLev.isEmpty()) {
            strengthList.addAll(heroDao.strengthLev.values());
         }

         if (!heroDao.rune.runeMap.isEmpty()) {
            runeItemList.addAll(heroDao.rune.runeMap.values());
         }

         this.starMapResetAndReturn(heroDao.code, heroReturns_NoTask, true);
         if (heroDao.godBeastItem != null) {
            godBeastItemList.add(heroDao.godBeastItem);
         }

         if (heroDao.exclusiveWeaponMap != null && heroDao.exclusiveWeaponMap.size() > 0) {
            for(Map.Entry<Integer, ExclusiveWeaponItem> entry : heroDao.exclusiveWeaponMap.entrySet()) {
               exclusiveWeaponItemList.add(entry.getValue());
            }
         }

         if (heroDao.rune.runeRefineMap != null && !heroDao.rune.runeRefineMap.isEmpty()) {
            for(Map.Entry<Integer, RuneRefineInheritItem> entry : heroDao.rune.runeRefineMap.entrySet()) {
               runeRefineInheritItemList.add(entry.getValue());
            }
         }

         if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            if (heroDao.getLv() > 1) {
               for(ResourceModel resourceModel : this.worldMgr.getUpgradeConsume(heroDao.getLv())) {
                  ResourceModel.addResourceToList(heroReturns_NoTask, resourceModel);
               }
            }

            if (heroDao.getBreachLv() > 0) {
               for(ResourceModel resourceModel : this.worldMgr.getBreachConsume(heroDao.getBreachLv())) {
                  ResourceModel.addResourceToList(heroReturns_NoTask, resourceModel);
               }
            }
         }

         if (isDel) {
            switch (type) {
               case DEL_USE:
               default:
                  break;
               case SACRIFICE:
                  if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
                     break;
                  }

                  PostModel postModel = (PostModel)this.player.getGameModelPool().getEntity("post", heroDao.getStar());
                  if (postModel != null) {
                     for(ResourceModel reward : postModel.getRewards()) {
                        ResourceModel.addResourceToList(heroReturns_AddTask, reward);
                     }
                  }

                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  if (heroModel == null) {
                     break;
                  }

                  Map<Integer, Integer> materialMap = this.getStarUpMaterial(heroDao.id, heroModel.getStar(), heroDao.getStar());

                  for(Map.Entry<Integer, Integer> entry : materialMap.entrySet()) {
                     ResourceModel.addResourceToList(heroReturns_NoTask, new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
                  }
                  break;
               case REBORN:
                  if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
                     break;
                  }

                  int shrine_rebirth_type = 1;
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  if (heroModel.getNation() == 10) {
                     shrine_rebirth_type = 4;
                  }

                  for(ResourceModel model : this.shrineReturn(shrine_rebirth_type, heroDao)) {
                     ResourceModel.addResourceToList(heroReturns_NoTask, model);
                  }

                  HeroModel reornHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  if (reornHeroModel == null) {
                     break;
                  }

                  Map<Integer, Integer> materialMap = this.getStarUpMaterial(heroDao.id, reornHeroModel.getStar(), heroDao.getStar());

                  for(Map.Entry<Integer, Integer> entry : materialMap.entrySet()) {
                     ResourceModel.addResourceToList(heroReturns_NoTask, new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
                  }
                  break;
               case INVALID:
                  if (heroDao.dressId > 0) {
                     HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);

                     for(ResourceModel resourceModel : heroDressPart.deleteDress(heroDao.dressId, "武将过期失效")) {
                        ResourceModel.addResourceToList(heroReturns_NoTask, resourceModel);
                     }
                  }
            }

            if (heroDao.linkCode > 0) {
               HeroDao linkHeroDao = this.getHeroByCode(heroDao.linkCode);
               if (null != linkHeroDao && linkHeroDao.beLinkCode == heroDao.code) {
                  linkHeroDao.beLinkCode = 0;
                  linkHeroDao.updateOp();
                  this.linkHeroDaoList.add(linkHeroDao);
               }
            }

            this.logHero(heroDao, -1, module, reason, misc1, misc2, misc3);
            this.player.deleteDao(heroDao, false);
            successList.add(code);
         } else {
            heroDao.equips.clear();
            heroDao.warriors.clear();
            TotemPart totemPart = (TotemPart)this.player.getMgrPart(TotemPart.class);
            totemPart.takeOffTotem(code);
            heroDao.warFlag = null;
            heroDao.exTreasure = null;
            heroDao.ornament.clear();
            heroDao.runeStone.clear();
            heroDao.aide = 0;
            heroDao.aide2 = 0;
            heroDao.castSouls.clear();
            heroDao.talent.clear();
            heroDao.warHorse = null;
            heroDao.strengthLev.clear();
            heroDao.rune.runeMap.clear();
            heroDao.godBeastItem = null;
            heroDao.exclusiveWeaponMap.clear();
            heroDao.rune.runeRefineMap.clear();
            heroDao.updateOp();
            this.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
         }
      }

      if (successList.size() > 0) {
         HeroMsg.S2C_HeroOperationResultDel_5008.Builder builder = HeroMsg.S2C_HeroOperationResultDel_5008.newBuilder();
         builder.setResult(1);

         for(Integer code : successList) {
            builder.addCodes(code);
         }

         this.player.sendMsg(builder.build());
      }

      if (this.linkHeroDaoList.size() > 0) {
         this.sendHeroList2Client(this.linkHeroDaoList);
         this.linkHeroDaoList.clear();
      }

      if (!equipMap.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : equipMap.entrySet()) {
            heroReturns_NoTask.add(new ResourceModel(2, (Integer)entry.getKey(), (Integer)entry.getValue()));
         }
      }

      if (!warriorList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(WarriorSignet warriorSignet : warriorList) {
            WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet(warriorSignet, module, 413, 0, 0, "");
            this.player.additemUpdateBuilder(newWarriorSignet);
            this.player.addResourceMsg(newWarriorSignet);
         }
      }

      if (!totemList.isEmpty()) {
         for(Totem totem : totemList) {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            totem.heroCode = 0;
            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(totem);
         }
      }

      if (!warFlagList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(WarFlag warFlag : warFlagList) {
            WarFlag newWarFlag = itemBagPart.addWarFlag(warFlag, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(newWarFlag);
            this.player.addResourceMsg(newWarFlag);
         }
      }

      if (!stoneList.isEmpty()) {
         for(int i = 0; i < stoneList.size(); ++i) {
            heroReturns_NoTask.add(new ResourceModel(2, (Integer)stoneList.get(i), 1));
         }
      }

      if (!ornamentList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(OrnamentItem ornament : ornamentList) {
            OrnamentItem newOrnament = itemBagPart.addOrnament(ornament, module, 413, 0, 0, "");
            this.player.additemUpdateBuilder(newOrnament);
            this.player.addResourceMsg(newOrnament);
         }
      }

      if (!runeStoneItemList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(RuneStoneItem rune : runeStoneItemList) {
            RuneStoneItem newRune = itemBagPart.addRuneStoneItem(rune, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(newRune);
            this.player.addResourceMsg(newRune);
         }
      }

      if (!aideItemList.isEmpty()) {
         for(Integer aideId : aideItemList) {
            AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideId);
            if (aideLevelModel != null) {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               HeroAideItem heroAideItem = itemBagPart.addHeroAide(aideLevelModel, module, 413, 0, 0, "");
               this.player.additemUpdateBuilder(heroAideItem);
               this.player.addResourceMsg(heroAideItem);
            }
         }
      }

      if (!warHorseList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(WarHorse horse : warHorseList) {
            WarHorse newWarHorse = itemBagPart.addWarHorse(horse, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(newWarHorse);
            this.player.addResourceMsg(newWarHorse);
         }
      }

      if (!strengthList.isEmpty()) {
         for(Integer lev : strengthList) {
            EquipRefineModel model = (EquipRefineModel)this.player.getGameModelPool().getEntity("EquipRefine", lev);
            if (model != null) {
               for(ResourceModel resourceModel : model.getBackMaterial()) {
                  heroReturns_NoTask.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue()));
               }
            }
         }
      }

      if (!runeItemList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(RuneItem data : runeItemList) {
            RuneItem runeItem = itemBagPart.addRuneItem(data, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(runeItem);
            this.player.addResourceMsg(runeItem);
         }
      }

      if (!godBeastItemList.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(GodBeastItem data : godBeastItemList) {
            if (data.mainNeiDan != null) {
               NeiDanItem neiDanItem = itemBagPart.addNeiDanItem(data.mainNeiDan, module, 413, misc1, misc2, misc3);
               this.player.additemUpdateBuilder(neiDanItem);
               this.player.addResourceMsg(neiDanItem);
               data.mainNeiDan = null;
            }

            GodBeastItem godBeastItem = itemBagPart.addGodBeastItem(data, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(godBeastItem);
            this.player.addResourceMsg(godBeastItem);
         }
      }

      if (exclusiveWeaponItemList.size() > 0) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(ExclusiveWeaponItem weaponItem : exclusiveWeaponItemList) {
            ExclusiveWeaponItem addEwItem = itemBagPart.addExclusiveWeaponItem(weaponItem, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(addEwItem);
            this.player.addResourceMsg(addEwItem);
         }
      }

      if (runeRefineInheritItemList.size() > 0) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(RuneRefineInheritItem runeRefineInheritItem : runeRefineInheritItemList) {
            RuneRefineInheritItem addRRItem = itemBagPart.addRuneRefineInheritItem(runeRefineInheritItem, module, 413, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(addRRItem);
            this.player.addResourceMsg(addRRItem);
         }
      }

      Set<Integer> propertyList = new HashSet();

      for(ResourceModel model : heroReturns_NoTask) {
         switch (model.getType()) {
            case 1:
               this.player.modifyProperty(model.getId(), (long)model.getValue(), module, reason, misc1, misc2, misc3, false);
               propertyList.add(model.getId());
               CommonMsg.ItemInfo.Builder propertyBuilder = CommonMsg.ItemInfo.newBuilder();
               propertyBuilder.setType(1);
               propertyBuilder.setCode(-1);
               propertyBuilder.setNum(model.getValue());
               propertyBuilder.setId(model.getId());
               this.player.addResourceMsgByBuilder(propertyBuilder);
               break;
            case 2:
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(CommonMsg.ItemInfo.Builder item : itemBagPart.addItem(model.getId(), model.getValue(), module, reason, misc1, misc2, misc3, 0)) {
                  this.player.addResourceMsgByBuilder(item);
               }
         }
      }

      for(ResourceModel model : heroReturns_AddTask) {
         switch (model.getType()) {
            case 1:
               this.player.modifyProperty(model.getId(), (long)model.getValue(), module, reason, misc1, misc2, misc3, false);
               propertyList.add(model.getId());
               CommonMsg.ItemInfo.Builder propertyBuilder = CommonMsg.ItemInfo.newBuilder();
               propertyBuilder.setType(1);
               propertyBuilder.setCode(-1);
               propertyBuilder.setNum(model.getValue());
               propertyBuilder.setId(model.getId());
               this.player.addResourceMsgByBuilder(propertyBuilder);
               break;
            case 2:
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

               for(CommonMsg.ItemInfo.Builder item : itemBagPart.addItem(model.getId(), model.getValue(), module, reason, misc1, misc2, misc3, 0)) {
                  this.player.addResourceMsgByBuilder(item);
               }
         }
      }

      if (!propertyList.isEmpty()) {
         this.player.notifyPlayerData(propertyList);
      }

      if (isSendItemUpdate) {
         this.player.senditemUpdateMsg();
         this.player.sendResourceMsg();
      }

   }

   public boolean isEnableAddHero(int num) {
      int emptyGridNum = this.getEmptyGridNumber();
      if (num > emptyGridNum) {
         System.out.println("背包容量超出，MAX：" + this.getBagMaxNumber());
         return false;
      } else {
         return true;
      }
   }

   public int getEmptyGridNumber() {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      if (map == null) {
         return 0;
      } else {
         int size = 0;

         for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
            if (((HeroDao)entry.getValue()).id != 26901) {
               ++size;
            }
         }

         int maxLimit = this.getBagMaxNumber();
         int num = maxLimit - size;
         return num < 0 ? 0 : num;
      }
   }

   public boolean isHaveHeroId(int heroId) {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      if (map == null) {
         return false;
      } else {
         for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
            if (((HeroDao)entry.getValue()).id == heroId) {
               return true;
            }
         }

         return false;
      }
   }

   public List<HeroDao> findHeroById(int heroId) {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      List<HeroDao> list = new ArrayList();

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         if (((HeroDao)entry.getValue()).id == heroId) {
            list.add(entry.getValue());
         }
      }

      return list;
   }

   public void updateHeroScore(HeroDefine.HeroPropertyModel model, HeroDao heroDao) {
      String rankModule = "";
      int score = 0;
      switch (model) {
         case MODEL_UNION_SKILL:
            rankModule = "7";
            score = heroDao.score_union;
            break;
         case MODEL_ARTIFACT_STRONGLV:
            rankModule = "6";
            score = heroDao.score_artifact_strong;
            break;
         case MODEL_HERO_UP_LV:
            rankModule = "2";
            score = heroDao.score_lv;
            break;
         case MODEL_WEAR_EQUIP:
            rankModule = "3";
            score = heroDao.score_equip;
            break;
         case MODEL_TREASURE_STAR:
            rankModule = "4";
            score = heroDao.score_star;
            break;
         case MODEL_HERO_UP_BREACH:
            rankModule = "5";
            score = heroDao.score_breach;
            break;
         case MODEL_WEAR_WARRIORSIGNET:
            rankModule = "8";
            score = heroDao.score_warriorignet;
      }

      int oldScore = this.getScore(rankModule, heroDao.id);
      if (score > oldScore) {
         int totalSocre = heroDao.totalScore;
         this.updateTotalHeroScore(heroDao.id, rankModule, score);
         this.updateTotalHeroScore(heroDao.id, "1", totalSocre);
         this.worldMgr.updateRankHigher(heroDao.id, rankModule, score);
         this.worldMgr.updateRankHigher(heroDao.id, "1", totalSocre);
      }

   }

   private void updateTotalHeroScore(int heroId, String module, int score) {
      if (this.heroScoreMap.get(heroId) == null) {
         ConcurrentHashMap<String, Integer> moduleMap = new ConcurrentHashMap();
         moduleMap.put(module, score);
         this.heroScoreMap.put(heroId, moduleMap);
      } else {
         Map<String, Integer> moduleMap = (Map)this.heroScoreMap.get(heroId);
         int oldSocre = (Integer)moduleMap.getOrDefault(module, 0);
         if (score > oldSocre) {
            moduleMap.put(module, score);
         }
      }

   }

   public int getScore(String module, int heroId) {
      Map<String, Integer> moduleMap = (Map)this.heroScoreMap.getOrDefault(heroId, new ConcurrentHashMap());
      return (Integer)moduleMap.getOrDefault(module, 0);
   }

   public List<PropertyModel> getProperty_tongque() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_tongque == null) {
            TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);
            tongqueTerracePart.flushTongqueProperties();
         }

         return (List<PropertyModel>)(this.property_tongque == null ? new ArrayList() : this.property_tongque);
      }
   }

   public void setProperty_tongque(List<PropertyModel> property_tongque) {
      this.property_tongque = property_tongque;
   }

   public List<PropertyModel> getProperty_tongque_new_beauty() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_tongque_new_beauty == null) {
            TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);
            tongqueTerracePart.flushTongqueProperties();
         }

         return (List<PropertyModel>)(this.property_tongque_new_beauty == null ? new ArrayList() : this.property_tongque_new_beauty);
      }
   }

   public void setProperty_tongque_new_beauty(List<PropertyModel> property_tongque_new_beauty) {
      this.property_tongque_new_beauty = property_tongque_new_beauty;
   }

   public List<PropertyModel> getProperty_divine_generals() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_divine_generals == null) {
            DivineGeneralsPart divineGeneralsPart = (DivineGeneralsPart)this.player.getMgrPart(DivineGeneralsPart.class);
            this.property_divine_generals = divineGeneralsPart.getPropertyAdditions();
            this.flushDivinePower();
         }

         return (List<PropertyModel>)(this.property_divine_generals == null ? new ArrayList() : this.property_divine_generals);
      }
   }

   public void setProperty_divine_generals(List<PropertyModel> property_divine_generals) {
      this.property_divine_generals = property_divine_generals;
      this.flushDivinePower();
   }

   public void flushDivinePower() {
      this.power_divine = 0L;

      for(PropertyModel propertyModel : this.property_divine_generals) {
         if (propertyModel.getType() <= 4) {
            this.power_divine = (long)((double)this.power_divine + HeroDao.calPowerByType(propertyModel.getType(), propertyModel.getValue()));
         }
      }

   }

   public long getDivinePower() {
      return this.power_divine;
   }

   public List<PropertyModel> getProperty_hero_promote() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_hero_promote == null) {
            HeroPromotePart heroPromotePart = (HeroPromotePart)this.player.getMgrPart(HeroPromotePart.class);
            this.property_hero_promote = heroPromotePart.getPropertyAdditions();
         }

         return (List<PropertyModel>)(this.property_hero_promote == null ? new ArrayList() : this.property_hero_promote);
      }
   }

   public void setProperty_hero_promote(List<PropertyModel> property_hero_promote) {
      this.property_hero_promote = property_hero_promote;
   }

   public List<PropertyModel> getProperty_army_array() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         ArmyArrayPart armyArrayPart = (ArmyArrayPart)this.player.getMgrPart(ArmyArrayPart.class);
         return armyArrayPart.getPropertyNormalAll();
      }
   }

   public List<PropertyModel> getProperty_eys_army_array(int grid) {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         ArmyArrayPart armyArrayPart = (ArmyArrayPart)this.player.getMgrPart(ArmyArrayPart.class);
         return armyArrayPart.getPropertyEyeAdditions(grid);
      }
   }

   public List<PropertyModel> getProperty_reasuret(int nation) {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_reasuret_map == null) {
            TreasurePart treasurePart = (TreasurePart)this.player.getMgrPart(TreasurePart.class);
            this.property_reasuret_map = treasurePart.getTreasurePro();
         }

         return (List<PropertyModel>)(this.property_reasuret_map == null ? new ArrayList() : (List)this.property_reasuret_map.getOrDefault(nation, new ArrayList()));
      }
   }

   public void setProperty_reasuret_map(Map<Integer, List<PropertyModel>> property_reasuret_map) {
      this.property_reasuret_map = property_reasuret_map;
   }

   public List<PropertyModel> getProperty_union_skill(int type) {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_union_skill_map == null) {
            UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)this.player.getMgrPart(UnionTechnologyPart.class);
            this.property_union_skill_map = unionTechnologyPart.getTechnologyPropertyAdditions();
            this.union_skill_lv_score_map = unionTechnologyPart.getTechnologyLevelScore();
         }

         return (List<PropertyModel>)(this.property_union_skill_map != null && this.property_union_skill_map.get(type) != null ? (List)this.property_union_skill_map.getOrDefault(type, new ArrayList()) : new ArrayList());
      }
   }

   public int getUnionTechnologyLevelScore(int type) {
      if (this.player.isRobot()) {
         return 0;
      } else {
         if (this.union_skill_lv_score_map == null) {
            UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)this.player.getMgrPart(UnionTechnologyPart.class);
            this.property_union_skill_map = unionTechnologyPart.getTechnologyPropertyAdditions();
            this.union_skill_lv_score_map = unionTechnologyPart.getTechnologyLevelScore();
         }

         return this.union_skill_lv_score_map != null && this.union_skill_lv_score_map.get(type) != null ? (Integer)this.union_skill_lv_score_map.get(type) : 0;
      }
   }

   public void setProperty_union_skill_map(Map<Integer, List<PropertyModel>> property_union_skill_map, Map<Integer, Integer> union_skill_lv_score_map) {
      this.property_union_skill_map = property_union_skill_map;
      this.union_skill_lv_score_map = union_skill_lv_score_map;
   }

   public List<PropertyModel> getProperty_union_activity() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_union_activity == null) {
            UnionActivePart unionActivePart = (UnionActivePart)this.player.getMgrPart(UnionActivePart.class);
            this.property_union_activity = unionActivePart.getActivePropertyAdditions();
         }

         return (List<PropertyModel>)(this.property_union_activity == null ? new ArrayList() : this.property_union_activity);
      }
   }

   public void setProperty_union_activity(List<PropertyModel> property_union_activity) {
      this.property_union_activity = property_union_activity;
   }

   public List<PropertyModel> getProperty_artifact_dress() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
         if (this.property_artifact_dress == null) {
            this.property_artifact_dress = artifactDressPart.getDressProperties();
         } else if (artifactDressPart.checkEndTime(true)) {
            this.property_artifact_dress = artifactDressPart.getDressProperties();
         }

         return (List<PropertyModel>)(this.property_artifact_dress == null ? new ArrayList() : this.property_artifact_dress);
      }
   }

   public void setProperty_artifact_dress(List<PropertyModel> property_artifact_dress) {
      this.property_artifact_dress = property_artifact_dress;
   }

   public List<PropertyModel> getProperty_artifact_strong() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_artifact_strong == null) {
            ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
            this.property_artifact_strong = artifactPart.getLvProperties();
         }

         return (List<PropertyModel>)(this.property_artifact_strong == null ? new ArrayList() : this.property_artifact_strong);
      }
   }

   public void setProperty_artifact_strong(List<PropertyModel> property_artifact_strong) {
      this.property_artifact_strong = property_artifact_strong;
   }

   public List<PropertyModel> getProperty_artifact_refine() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_artifact_refine == null) {
            ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
            Map<Integer, List<PropertyModel>> map = artifactPart.getRefineProperties();
            this.property_artifact_refine = (List)map.get(1);
            this.property_artifact_refine_add = (List)map.get(2);
         }

         return (List<PropertyModel>)(this.property_artifact_refine == null ? new ArrayList() : this.property_artifact_refine);
      }
   }

   public List<PropertyModel> getProperty_artifact_refine_add() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_artifact_refine_add == null) {
            ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
            Map<Integer, List<PropertyModel>> map = artifactPart.getRefineProperties();
            this.property_artifact_refine = (List)map.get(1);
            this.property_artifact_refine_add = (List)map.get(2);
         }

         return (List<PropertyModel>)(this.property_artifact_refine_add == null ? new ArrayList() : this.property_artifact_refine_add);
      }
   }

   public void setProperty_artifact_refine(Map<Integer, List<PropertyModel>> property_artifact_refine) {
      this.property_artifact_refine = (List)property_artifact_refine.get(1);
      this.property_artifact_refine_add = (List)property_artifact_refine.get(2);
   }

   public List<PropertyModel> getProperty_artifact_castSoul() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_artifact_castSoul == null) {
            ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
            this.property_artifact_castSoul = artifactPart.getTotalSoulProperties();
         }

         return (List<PropertyModel>)(this.property_artifact_castSoul == null ? new ArrayList() : this.property_artifact_castSoul);
      }
   }

   public void setProperty_artifact_castSoul(List<PropertyModel> property_artifact_castSoul) {
      this.property_artifact_castSoul = property_artifact_castSoul;
   }

   public List<HeroDressPart.HeroDressEndTimeAndPros> getHeroDressEndTimeAndPros(int heroId) {
      List<HeroDressPart.HeroDressEndTimeAndPros> resultList = new ArrayList();
      if (this.player.isRobot()) {
         return resultList;
      } else {
         if (this.heroDressEndTimeAndProsMap == null) {
            HeroDressPart heroDressPar = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
            heroDressPar.checkEndTimeAndSetProperty();
         }

         List<HeroDressPart.HeroDressEndTimeAndPros> beanList = (List)this.heroDressEndTimeAndProsMap.get(heroId);
         if (beanList != null) {
            for(HeroDressPart.HeroDressEndTimeAndPros bean : beanList) {
               if (bean.endTime == 0L || bean.endTime > 0L && bean.endTime > System.currentTimeMillis()) {
                  resultList.add(bean);
               }
            }
         }

         return resultList;
      }
   }

   public void setHeroDressEndTimeAndPros(Map<Integer, List<HeroDressPart.HeroDressEndTimeAndPros>> heroDressEndTimeAndProsMap) {
      this.heroDressEndTimeAndProsMap = heroDressEndTimeAndProsMap;
   }

   public List<PropertyModel> getProperty_hero_dress_all() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_hero_dress_all == null) {
            HeroDressPart heroDressPar = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
            heroDressPar.checkEndTimeAndSetProperty();
         }

         return this.property_hero_dress_all;
      }
   }

   public void setProperty_hero_dress_all(List<PropertyModel> property_hero_dress_all) {
      this.property_hero_dress_all = property_hero_dress_all;
   }

   public List<PropertyModel> getProperty_hero_dress_collect() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_hero_dress_collect == null) {
            HeroDressPart heroDressPar = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
            heroDressPar.checkEndTimeAndSetProperty();
         }

         return this.property_hero_dress_collect;
      }
   }

   public void setProperty_hero_dress_collect(List<PropertyModel> property_hero_dress_collect) {
      this.property_hero_dress_collect = property_hero_dress_collect;
   }

   public List<PropertyModel> getProperty_hero_dress_all_base() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_hero_dress_all_base == null) {
            HeroDressPart heroDressPar = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
            heroDressPar.checkEndTimeAndSetProperty();
         }

         return this.property_hero_dress_all_base;
      }
   }

   public void setProperty_hero_dress_all_base(List<PropertyModel> property_hero_dress_all_base) {
      this.property_hero_dress_all_base = property_hero_dress_all_base;
   }

   public List<PropertyModel> getProperty_hero_palace() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_hero_palace == null) {
            HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
            heroPalacePart.calHeroPalaceAddProperty((HeroPalaceDao)null);
         }

         return this.property_hero_palace;
      }
   }

   public void setProperty_hero_palace(List<PropertyModel> property_hero_palace) {
      this.property_hero_palace = property_hero_palace;
   }

   public Map<Integer, Map<Integer, Long>> getProperty_soul_palace() {
      if (this.player.isRobot()) {
         return new HashMap();
      } else {
         if (this.property_soul_palace == null) {
            HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
            heroPalacePart.calSoulDictionaryAddProperty();
         }

         return this.property_soul_palace;
      }
   }

   public void setProperty_soul_palace(Map<Integer, Map<Integer, Long>> property_soul_palace) {
      this.property_soul_palace = property_soul_palace;
   }

   public List<Long> getPowerAVG(int count) {
      List<Long> powerList = new ArrayList();
      List<Integer> levelList = new ArrayList();
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         powerList.add(heroDao.getCombatPower());
         levelList.add(heroDao.getLv());
      }

      List<Long> list = new ArrayList();
      Collections.sort(powerList);
      Collections.sort(levelList);
      long totalPower = 0L;
      int tempCount = Math.min(count, powerList.size());

      for(int i = powerList.size() - 1; i >= 0 && i >= powerList.size() - tempCount; --i) {
         totalPower += (Long)powerList.get(i);
      }

      list.add(totalPower / (long)tempCount);
      long totalLevel = 0L;

      for(int i = levelList.size() - 1; i >= 0 && i >= levelList.size() - tempCount; --i) {
         totalLevel += (long)(Integer)levelList.get(i);
      }

      list.add(totalLevel / (long)tempCount);
      return list;
   }

   public HeroDao getMaxPower() {
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      if (herosMap != null && !herosMap.isEmpty()) {
         HeroDao maxHeroDao = null;

         for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
            HeroDao tempHeroDao = (HeroDao)entry.getValue();
            if (tempHeroDao.type != HeroDefine.HERO_SP_TYPE_PALACE) {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", tempHeroDao.id);
               if (heroModel != null && (heroModel.getNation() != 10 || tempHeroDao.inheritNation > 0) && tempHeroDao.invalidTime <= 0 && (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_LINK || tempHeroDao.linkCode > 0)) {
                  if (maxHeroDao == null) {
                     maxHeroDao = (HeroDao)entry.getValue();
                  } else if (((HeroDao)entry.getValue()).combatPower > maxHeroDao.combatPower) {
                     maxHeroDao = (HeroDao)entry.getValue();
                  }
               }
            }
         }

         return maxHeroDao;
      } else {
         return null;
      }
   }

   public List<HeroDao> getMaxPower(int num) {
      List<HeroDao> list = new ArrayList();
      if (num <= 0) {
         return list;
      } else {
         Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
         if (herosMap != null && !herosMap.isEmpty()) {
            if (num >= herosMap.size()) {
               for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
                  list.add(entry.getValue());
               }
            } else {
               List<Long> powerList = new ArrayList();

               for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
                  powerList.add(((HeroDao)entry.getValue()).getCombatPower());
               }

               Collections.sort(powerList);
               long power = (Long)powerList.get(powerList.size() - num);

               for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
                  if (((HeroDao)entry.getValue()).combatPower >= power) {
                     list.add(entry.getValue());
                     if (list.size() >= num) {
                        break;
                     }
                  }
               }
            }

            return list;
         } else {
            return list;
         }
      }
   }

   public int getMaxStars() {
      int star = 1;
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         star = Math.max(star, heroDao.getStar());
      }

      return star;
   }

   public void triggerHeroStarTask(HeroDao heroDao, boolean bNewHero) {
      if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.invalidTime <= 0) {
         this.player.triggerTask(203, heroDao.getStar(), 1L, 1);
         this.player.triggerTask(666, heroDao.id, 1L, 1);
         if (bNewHero) {
            this.player.triggerTask(340, heroDao.getStar(), 1L, 3);
         }

         this.player.triggerTask(404, heroDao.getStar(), 1L, 3);
         this.player.triggerTask(540, heroDao.id, (long)heroDao.getStar(), 0);
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
         if (heroModel != null) {
            switch (heroModel.getNation()) {
               case 1:
                  this.player.triggerTask(336, heroDao.getStar(), 1L, 3);
                  break;
               case 2:
                  this.player.triggerTask(337, heroDao.getStar(), 1L, 3);
                  break;
               case 3:
                  this.player.triggerTask(338, heroDao.getStar(), 1L, 3);
                  break;
               case 4:
                  this.player.triggerTask(335, heroDao.getStar(), 1L, 3);
                  break;
               case 5:
                  this.player.triggerTask(334, heroDao.getStar(), 1L, 3);
            }

         }
      }
   }

   public Map<Integer, Integer> getHeroNumInStar() {
      Map<Integer, Integer> map = new HashMap();
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
         if (heroModel != null && heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_PALACE && heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_LINK) {
            int num = (Integer)map.getOrDefault(heroDao.getStar(), 0);
            map.put(heroDao.getStar(), num + 1);
         }
      }

      return map;
   }

   public void sendHeroMail(int id, int num, int module, int reason) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      List<ResourceModel> list = new ArrayList();
      ResourceModel itemData = new ResourceModel(3, id, num);
      list.add(itemData);
      CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", 131);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), list, 604800000L, module, reason);
   }

   public List<PropertyModel> getProperty_pet() {
      if (this.player.isRobot()) {
         return new ArrayList();
      } else {
         if (this.property_pet == null) {
            PetPart petPart = (PetPart)this.player.getMgrPart(PetPart.class);
            petPart.getPetAddHeroPerperty();
         }

         return this.property_pet;
      }
   }

   public void setProperty_pet(List<PropertyModel> property_pet) {
      this.property_pet = property_pet;
   }

   public List<PropertyModel> getProperty_dragon_strengthen() {
      if (this.property_dragon_strengthen == null) {
         DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)this.player.getMgrPart(DragonStrengthenPart.class);
         this.property_dragon_strengthen = dragonStrengthenPart.getPropertyAdditions();
      }

      return this.property_dragon_strengthen;
   }

   public void setProperty_dragon_strengthen(List<PropertyModel> property_dragon_strengthen) {
      this.property_dragon_strengthen = property_dragon_strengthen;
   }

   public List<PropertyModel> getProperty_friend(int nation, int type) {
      if (this.property_friend == null) {
         this.getFriendProperty();
      }

      if (this.property_friend.containsKey(nation)) {
         Map<Integer, List<PropertyModel>> map = (Map)this.property_friend.get(nation);
         if (map != null && map.containsKey(type)) {
            return (List)map.get(type);
         }
      }

      return null;
   }

   private void getFriendProperty() {
      this.updateFriendPropertyPrivate(HeroDefine.HeroPropertyModel.MODEL_HERO);
      if (this.property_friend == null) {
         this.property_friend = new HashMap();
      }

   }

   public int updateFriendAndKingProperty(boolean isNeedCalArrayingHero, HeroDefine.HeroPropertyModel model) {
      this.property_king = null;
      int friendCode = this.updateFriendPropertyPrivate(model);
      this.updateKingProperty(model);
      return friendCode;
   }

   public void updateKingProperty(HeroDefine.HeroPropertyModel model) {
      for(int nation = 1; nation <= 5; ++nation) {
         this.flushControlHero(model, nation);
      }

   }

   private int updateFriendPropertyPrivate(HeroDefine.HeroPropertyModel model) {
      Map<Integer, Map<Integer, List<PropertyModel>>> temp_property = new HashMap();
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      int friendCode = 0;
      if (heroArrayingDao != null) {
         if (heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
               if ((Byte)entry.getKey() == 5) {
                  friendCode = (Integer)entry.getValue();
               }
            }
         }

         if (friendCode > 0) {
            HeroDao friendHeroDao = null;
            Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
            if (map.get(friendCode) != null) {
               HeroDao heroDao = (HeroDao)map.get(friendCode);
               heroDao.flushHero(model, true, true);
               friendHeroDao = heroDao;
            }

            if (friendHeroDao != null) {
               GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
               HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", friendHeroDao.id);
               if (heroModel != null) {
                  int friendJob = heroModel.getType();
                  if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING && heroArrayingDao.friendJob > 0) {
                     friendJob = heroArrayingDao.friendJob;
                  }

                  int key = friendJob * 100 + friendHeroDao.getStar();
                  SupportHeroModel supportHeroModel = (SupportHeroModel)gameModelPool.getEntity("supportHero", key);
                  if (supportHeroModel != null && friendHeroDao.totalFightProperties.containsKey(supportHeroModel.getAddpro())) {
                     long val = (Long)friendHeroDao.totalFightProperties.get(supportHeroModel.getAddpro()) * (long)supportHeroModel.getAddper() / 10000L;

                     for(int i = 1; i <= 5; ++i) {
                        Map<Integer, List<PropertyModel>> tempMap = new HashMap();

                        for(int j = 1; j <= 4; ++j) {
                           List<PropertyModel> list = new ArrayList();
                           list.add(new PropertyModel(supportHeroModel.getAddpro(), 0, val));
                           tempMap.put(j, list);
                        }

                        temp_property.put(i, tempMap);
                     }
                  }

                  if (friendHeroDao.code == heroArrayingDao.kingCode) {
                  }
               }

               if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                  friendHeroDao.flushHero(model, true, false);
               }
            }
         }
      }

      this.property_friend = temp_property;
      return friendCode;
   }

   public void calcFriendAdd(HeroDao friendHeroDao) {
      Map<Integer, Map<Integer, List<PropertyModel>>> temp_property = new HashMap();
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", friendHeroDao.id);
      int friendJob = heroModel.getType();
      if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING && heroArrayingDao.friendJob > 0) {
         friendJob = heroArrayingDao.friendJob;
      }

      int key = friendJob * 100 + friendHeroDao.getStar();
      SupportHeroModel supportHeroModel = (SupportHeroModel)this.player.getGameModelPool().getEntity("supportHero", key);
      if (supportHeroModel != null && friendHeroDao.totalFightProperties.containsKey(supportHeroModel.getAddpro())) {
         long val = (Long)friendHeroDao.totalFightProperties.get(supportHeroModel.getAddpro()) * (long)supportHeroModel.getAddper() / 10000L;

         for(int i = 1; i <= 5; ++i) {
            Map<Integer, List<PropertyModel>> tempMap = new HashMap();

            for(int j = 1; j <= 4; ++j) {
               List<PropertyModel> list = new ArrayList();
               list.add(new PropertyModel(supportHeroModel.getAddpro(), 0, val));
               tempMap.put(j, list);
            }

            temp_property.put(i, tempMap);
         }
      }

      this.property_friend = temp_property;
   }

   public List<PropertyModel> getProperty_king(int nation, int type, int code) {
      List<PropertyModel> resultList = new ArrayList();
      if (this.property_king == null) {
         return resultList;
      } else {
         for(Map.Entry<Integer, Map<Integer, Map<Integer, List<PropertyModel>>>> entry : this.property_king.entrySet()) {
            if ((Integer)entry.getKey() == code) {
            }

            if (((Map)entry.getValue()).containsKey(nation) && ((Map)((Map)entry.getValue()).get(nation)).containsKey(type)) {
               for(PropertyModel propertyModel : (List)((Map)((Map)entry.getValue()).get(nation)).get(type)) {
                  PropertyModel.addLvProtities(resultList, propertyModel);
               }
            }
         }

         return resultList;
      }
   }

   private void updateKingPropertyPrivate(boolean isNeedCalArrayingHero, HeroDefine.HeroPropertyModel model) {
      this.property_king = null;
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      if (heroArrayingDao != null) {
         Map<Integer, Map<Integer, Map<Integer, List<PropertyModel>>>> temp_property = new HashMap();
         boolean isHaveKingHero = false;
         if (heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
            boolean isFriendKing = false;
            Integer friendCode = (Integer)heroArrayingDao.elements.get((byte)5);
            if (friendCode != null && heroArrayingDao.kingCode == friendCode) {
               isFriendKing = true;
            }

            for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
               if ((Byte)entry.getKey() < 5) {
                  Map<Integer, Map<Integer, List<PropertyModel>>> temp_hero_property = new HashMap();
                  HeroDao heroDao = null;
                  Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
                  if (map.containsKey(entry.getValue())) {
                     heroDao = (HeroDao)map.get(entry.getValue());
                     if (heroDao != null) {
                        HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                           heroDao.flushHero(model, true, false);
                           isHaveKingHero = true;
                           if (!isFriendKing && isArrayingAdd(heroDao) && heroDao.code == heroArrayingDao.kingCode) {
                              addKingProperty(temp_hero_property, heroDao.id, heroDao.totalFightProperties);
                              addTalenProperty(temp_hero_property, heroDao.getTalentSkill(), heroDao.totalFightProperties, 2);
                           }

                           if (!temp_hero_property.isEmpty()) {
                              temp_property.put(heroDao.code, temp_hero_property);
                           }
                        }
                     }
                  }
               }
            }
         }

         this.property_king = temp_property;
         if (isNeedCalArrayingHero || isHaveKingHero) {
            for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
               if ((Byte)entry.getKey() < 5) {
                  Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
                  if (map.containsKey(entry.getValue())) {
                     HeroDao heroDao = (HeroDao)map.get(entry.getValue());
                     heroDao.flushHero(model, true, false);
                  }
               }
            }
         }

         if (isNeedCalArrayingHero) {
            this.player.flushPlayerCombatPower("下发英雄列表", heroArrayingPart.getPlayerCombatPower(false));
         }

      }
   }

   public static void addKingProperty(Map<Integer, Map<Integer, List<PropertyModel>>> resultMap, int heroId, Map<Integer, Long> totalFightProperties) {
      SkillKingModel skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", heroId);
      if (skillKingModel != null) {
         for(int i = 1; i <= 5; ++i) {
            Map<Integer, List<PropertyModel>> map = (Map)MapUtil.getOrDefault(resultMap, i, new HashMap());

            for(PropertyModel buff : skillKingModel.getBuffs()) {
               for(int j = 1; j <= 4; ++j) {
                  List<PropertyModel> list = (List)MapUtil.getOrDefault(map, j, new ArrayList());
                  if (buff.getWay() == 0) {
                     PropertyModel.addLvProtities(list, buff.clone());
                  } else if (buff.getWay() == 1) {
                     float tempVal = (float)(Long)totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                     PropertyModel.addLvProtities(list, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                  }

                  map.put(j, list);
               }
            }

            if (i == skillKingModel.getNation()) {
               for(PropertyModel addBuff : skillKingModel.getAddBuffs()) {
                  for(int j = 1; j <= 4; ++j) {
                     List<PropertyModel> list = (List)MapUtil.getOrDefault(map, j, new ArrayList());
                     if (addBuff.getWay() == 0) {
                        PropertyModel.addLvProtities(list, addBuff.clone());
                     } else if (addBuff.getWay() == 1) {
                        float tempVal = (float)(Long)totalFightProperties.get(addBuff.getType()) * ((float)addBuff.getValue() / 10000.0F);
                        PropertyModel.addLvProtities(list, new PropertyModel(addBuff.getType(), 0, Float.valueOf(tempVal).longValue()));
                     }

                     map.put(j, list);
                  }
               }
            }

            if (skillKingModel.getOccuBuffs().isEmpty()) {
               resultMap.put(i, map);
            } else {
               for(int j = 1; j <= 4; ++j) {
                  List<PropertyModel> list = (List)MapUtil.getOrDefault(map, j, new ArrayList());
                  PropertyModel occBuff = (PropertyModel)skillKingModel.getOccuBuffs().get(j);
                  if (!Objects.isNull(occBuff)) {
                     if (occBuff.getWay() == 0) {
                        PropertyModel.addLvProtities(list, occBuff.clone());
                     } else if (occBuff.getWay() == 1) {
                        float tempVal = (float)(Long)totalFightProperties.get(occBuff.getType()) * ((float)occBuff.getValue() / 10000.0F);
                        PropertyModel.addLvProtities(list, new PropertyModel(occBuff.getType(), 0, Float.valueOf(tempVal).longValue()));
                     }

                     map.put(j, list);
                  }
               }

               resultMap.put(i, map);
            }
         }

      }
   }

   public static boolean addTalenProperty(Map<Integer, Map<Integer, List<PropertyModel>>> resultMap, List<Integer> talentSkill, Map<Integer, Long> totalFightProperties, int spType) {
      boolean isArrayingAdd = false;
      if (talentSkill != null && !talentSkill.isEmpty()) {
         for(Integer skillId : talentSkill) {
            SkillKingTalentModel skillKingTalentModel = (SkillKingTalentModel)ApplicationContextProvider.getModelPoolEntity("skillKingTalent", skillId);
            if (skillKingTalentModel != null) {
               if (skillKingTalentModel.getType() == 2) {
                  isArrayingAdd = true;
               }

               if (spType == 1 || spType == 2 && skillKingTalentModel.getType() == 2) {
                  for(int i = 1; i <= 5; ++i) {
                     Map<Integer, List<PropertyModel>> map = (Map)MapUtil.getOrDefault(resultMap, i, new HashMap());

                     for(PropertyModel buff : skillKingTalentModel.getBuffs()) {
                        for(int j = 1; j <= 4; ++j) {
                           List<PropertyModel> list = (List)MapUtil.getOrDefault(map, j, new ArrayList());
                           if (buff.getWay() == 0) {
                              PropertyModel.addLvProtities(list, buff.clone());
                           } else if (buff.getWay() == 1) {
                              float tempVal = (float)(Long)totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                              PropertyModel.addLvProtities(list, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                           }

                           map.put(j, list);
                        }
                     }

                     resultMap.put(i, map);
                  }
               }
            }
         }

         return isArrayingAdd;
      } else {
         return isArrayingAdd;
      }
   }

   public static boolean isRightWearTypeOfPositon(CommonMsg.WearType wearType, CommonMsg.WearPosition wearPosition) {
      boolean result = false;
      switch (wearType) {
         case WEARTYPE_EQUIP:
            switch (wearPosition) {
               case WEARPOSITION_EQUIP_1:
               case WEARPOSITION_EQUIP_2:
               case WEARPOSITION_EQUIP_3:
               case WEARPOSITION_EQUIP_4:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_WARRIORSIGNET:
            switch (wearPosition) {
               case WEARPOSITION_WARRIORSIGNET_1:
               case WEARPOSITION_WARRIORSIGNET_2:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_WARCRAFT:
            switch (wearPosition) {
               case WEARPOSITION_WARCRAFT_1:
               case WEARPOSITION_WARCRAFT_2:
               case WEARPOSITION_WARCRAFT_3:
               case WEARPOSITION_WARCRAFT_4:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_ORANMENT:
            switch (wearPosition) {
               case WEARPOSITION_ORANMENT_1:
               case WEARPOSITION_ORANMENT_2:
               case WEARPOSITION_ORANMENT_3:
               case WEARPOSITION_ORANMENT_4:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_TOTEM:
            switch (wearPosition) {
               case WEARPOSITION_TOTEM:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_FLAG:
            switch (wearPosition) {
               case WEARPOSITION_FLAG:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_RUNESTONE:
            switch (wearPosition) {
               case WEARPOSITION_RUNESTONE_1:
               case WEARPOSITION_RUNESTONE_2:
               case WEARPOSITION_RUNESTONE_3:
               case WEARPOSITION_RUNESTONE_4:
                  result = true;
                  return result;
               default:
                  return result;
            }
         case WEARTYPE_TALENT:
            switch (wearPosition) {
               case WEARPOSITION_TALENT_1:
               case WEARPOSITION_TALENT_2:
               case WEARPOSITION_TALENT_3:
               case WEARPOSITION_TALENT_4:
               case WEARPOSITION_TALENT_5:
               case WEARPOSITION_TALENT_6:
               case WEARPOSITION_TALENT_7:
               case WEARPOSITION_TALENT_8:
               case WEARPOSITION_TALENT_9:
               case WEARPOSITION_TALENT_10:
                  result = true;
            }
      }

      return result;
   }

   public List<ResourceModel> getUpgradeMaterial(int begin, int end) {
      List<ResourceModel> resourceModelList = new ArrayList();
      if (begin >= end) {
         return resourceModelList;
      } else {
         int totalExpCost = 0;
         int totalSilverCost = 0;
         Map<Integer, UpgradeModel> upgradeModelMap = this.player.getGameModelPool().getMap("upgrade");

         for(UpgradeModel upgradeModel = (UpgradeModel)upgradeModelMap.get(begin); upgradeModel != null && upgradeModel.getNextLevel() <= end; upgradeModel = (UpgradeModel)upgradeModelMap.get(upgradeModel.getNextLevel())) {
            totalExpCost += upgradeModel.getExpCost();
            totalSilverCost += upgradeModel.getSilverCost();
         }

         if (totalExpCost > 0) {
            resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_HERO_EXP, totalExpCost));
         }

         if (totalSilverCost > 0) {
            resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, totalSilverCost));
         }

         return resourceModelList;
      }
   }

   public Map<Integer, Integer> getStarUpMaterial(int heroId, int begin, int end) {
      Map<Integer, Integer> map = new HashMap();
      int totalNum = 0;
      if (begin >= end) {
         return map;
      } else {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
         if (heroModel == null) {
            this.logger.warn("没有此武将,heroId:{}", heroId);
            return map;
         } else if (heroModel.getStar() > begin) {
            return map;
         } else {
            Map<Integer, HeroUpStarModel> heroUpStarModelMap = this.player.getGameModelPool().getMap("heroUpStar");

            for(HeroUpStarModel heroUpStarModel = (HeroUpStarModel)heroUpStarModelMap.get(heroModel.getUpStarId()); heroUpStarModel != null && heroUpStarModel.getStarLevel() <= end; heroUpStarModel = (HeroUpStarModel)heroUpStarModelMap.get(heroUpStarModel.getNext())) {
               if (heroUpStarModel.getStarLevel() > begin) {
                  totalNum += heroUpStarModel.getItemNum();
                  if (heroUpStarModel.getSpecialItem() > 0 && heroUpStarModel.getSpecialItemNum() > 0) {
                     int tempNum = (Integer)map.getOrDefault(heroUpStarModel.getSpecialItem(), 0);
                     map.put(heroUpStarModel.getSpecialItem(), tempNum + heroUpStarModel.getSpecialItemNum());
                  }

                  if (heroUpStarModel.getSpecialItem2() > 0 && heroUpStarModel.getSpecialItemNum2() > 0) {
                     int tempNum = (Integer)map.getOrDefault(heroUpStarModel.getSpecialItem2(), 0);
                     map.put(heroUpStarModel.getSpecialItem2(), tempNum + heroUpStarModel.getSpecialItemNum2());
                  }
               }
            }

            int stoneNum = (Integer)map.getOrDefault(1001, 0);
            if (stoneNum + totalNum <= 0) {
               map.remove(1001);
            } else {
               map.put(1001, stoneNum + totalNum);
            }

            return map;
         }
      }
   }

   public List<ResourceModel> getBreachUpMaterial(int breachLv) {
      List<ResourceModel> list = new ArrayList();
      if (breachLv <= 0) {
         return list;
      } else {
         for(int i = 0; i < breachLv; ++i) {
            HeroBreachModel heroBreachModel = (HeroBreachModel)this.player.getGameModelPool().getEntity("heroBreach", i);
            if (heroBreachModel != null) {
               ResourceModel.addResourceToList(list, new ResourceModel(2, heroBreachModel.getItemId(), heroBreachModel.getItemNum()));
               ResourceModel.addResourceToList(list, new ResourceModel(1, PlayerDefine.PLAYER_COPPER, heroBreachModel.getCopper()));
            }
         }

         return list;
      }
   }

   public List<ResourceModel> shrineReturn(int type, HeroDao heroDao) {
      List<ResourceModel> resourceModelList = new ArrayList();
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
      HashMap<Integer, Integer> mapChip = this.configManager.getIntMap("shrineReturnRandomChip");
      HashMap<Integer, Integer> mapSelect = this.configManager.getIntMap("shrineReturnselectChip");
      if (mapChip.containsKey(heroModel.getNation()) && mapSelect.containsKey(heroModel.getNation())) {
         Map<Integer, TreeMap<Integer, ShrineReturnModel>> shrineReturnCustomMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ShrineReturnModel>>getModelPoolMap("customShrineReturn");
         if (!shrineReturnCustomMap.containsKey(type)) {
            this.logger.warn("转生神坛-配置错误 shrineReturn.xls");
            return resourceModelList;
         } else {
            TreeMap<Integer, ShrineReturnModel> shrineReturnModelMap = (TreeMap)shrineReturnCustomMap.get(type);
            if (!CollectionUtils.isEmpty(shrineReturnModelMap) && shrineReturnModelMap.containsKey(heroDao.getStar())) {
               ShrineReturnModel shrineReturnModel = (ShrineReturnModel)shrineReturnModelMap.get(heroDao.getStar());
               if (shrineReturnModel.getSelfChipNum() > 0) {
                  resourceModelList.add(new ResourceModel(2, heroModel.getChipId(), shrineReturnModel.getSelfChipNum()));
               }

               if (shrineReturnModel.getNationChipNum() > 0) {
                  resourceModelList.add(new ResourceModel(2, (Integer)mapChip.get(heroModel.getNation()), shrineReturnModel.getNationChipNum()));
               }

               if (shrineReturnModel.getGiftBoxNum() > 0) {
                  resourceModelList.add(new ResourceModel(2, (Integer)mapSelect.get(heroModel.getNation()), shrineReturnModel.getGiftBoxNum()));
               }

               if (shrineReturnModel.getMaterialHeroNum() > 0) {
                  int shrineRecallReplaceHero = this.configManager.getInt("shrineRecallReplaceHero");
                  resourceModelList.add(new ResourceModel(3, shrineRecallReplaceHero, shrineReturnModel.getMaterialHeroNum()));
               }

               return resourceModelList;
            } else {
               this.logger.warn("转生神坛-配置错误 shrineReturnModel");
               return resourceModelList;
            }
         }
      } else {
         this.logger.warn("转生神坛-配置错误 shrineReturnRandomChip 或 shrineReturnselectChip");
         return resourceModelList;
      }
   }

   public void gmDeleteHeros(int star) {
      if (star >= 0) {
         List<Integer> delList = new ArrayList();
         Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
         Iterator<Map.Entry<Integer, HeroDao>> iterator = herosMap.entrySet().iterator();

         while(iterator.hasNext()) {
            HeroDao heroDao = (HeroDao)((Map.Entry)iterator.next()).getValue();
            if (!heroDao.isHaveArrayingState() && heroDao.getStar() <= star) {
               delList.add(heroDao.code);
            }
         }

         boolean success = this.deleteHero(delList, HeroDefine.DelHeroType.SACRIFICE, 7, 411, 0, 0, "star:" + star);
         if (!success) {
            this.logger.info("删除武将失败 playerId:{} delList:{}", this.player.getPlayerId(), delList);
         } else {
            this.player.sendResourceMsg();
         }
      }
   }

   public void testAddHeroState(String order) {
      String[] orders = order.split(",");
      HeroDao heroDao = this.getHeroByCode(Integer.valueOf(orders[0]));
      if (heroDao != null) {
         heroDao.addState(Integer.valueOf(orders[1]));
         heroDao.updateOp();
      }

   }

   public void testDelHeroState(String order) {
      String[] orders = order.split(",");
      HeroDao heroDao = this.getHeroByCode(Integer.valueOf(orders[0]));
      if (heroDao != null) {
         heroDao.delState(Integer.valueOf(orders[1]));
         heroDao.updateOp();
      }

   }

   public void testHeroState() {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      int state = 1;

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         if (!((HeroDao)entry.getValue()).isHaveArrayingState()) {
            if (state >= 63) {
               break;
            }

            ((HeroDao)entry.getValue()).addState(state);
            ((HeroDao)entry.getValue()).updateOp();
            this.logger.info("英雄={}，id={}，state={}", new Object[]{((HeroDao)entry.getValue()).code, ((HeroDao)entry.getValue()).id, ((HeroDao)entry.getValue()).isHaveArrayingState()});
            ++state;
         }
      }

   }

   public void gmDelHeroById(int heroId) {
      List<Integer> needDelCodes = new ArrayList();
      String codeStr = "";
      Map<Integer, HeroDao> allHeroMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      if (allHeroMap != null && !allHeroMap.isEmpty()) {
         for(Map.Entry<Integer, HeroDao> entry : allHeroMap.entrySet()) {
            if (((HeroDao)entry.getValue()).id == heroId) {
               if (((HeroDao)entry.getValue()).isHaveArrayingState()) {
                  boolean isSuccess = heroArrayingPart.heroLeaveArraying(((HeroDao)entry.getValue()).code, false, false);
                  if (!isSuccess) {
                     continue;
                  }
               }

               needDelCodes.add(((HeroDao)entry.getValue()).code);
               codeStr = codeStr + ((HeroDao)entry.getValue()).code + ":";
            }
         }
      }

      if (!needDelCodes.isEmpty()) {
         boolean isSuccess = this.deleteHero(needDelCodes, HeroDefine.DelHeroType.DEL_USE, 49, 411, heroId, heroId, codeStr);
         if (isSuccess) {
            this.player.senditemUpdateMsg();
            this.player.clearAddBuilder();
         }
      }

   }

   public void gmDelHeroByCode(int code) {
      List<Integer> needDelCodes = new ArrayList();
      String codeStr = "";
      HeroDao heroDao = this.getHeroByCode(code);
      if (heroDao != null) {
         needDelCodes.add(code);
         codeStr = codeStr + code + ":";
         if (heroDao.isHaveArrayingState()) {
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            boolean isSuccess = heroArrayingPart.heroLeaveArraying(heroDao.code, false, false);
            if (isSuccess) {
               this.deleteHero(needDelCodes, HeroDefine.DelHeroType.DEL_USE, 49, 411, code, code, codeStr);
               this.player.senditemUpdateMsg();
               this.player.clearAddBuilder();
            }
         }
      }

   }

   public void heroBagFlushProperties(HeroDao heroDao) {
      if (heroDao.heroCastSoulSkills.size() == 0) {
         heroDao.isChange = true;
         heroDao.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO, true, false);
      }

   }

   public boolean isHaveWarHorse() {
      Map<Integer, HeroDao> herosMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : herosMap.entrySet()) {
         if (((HeroDao)entry.getValue()).warHorse != null) {
            return true;
         }
      }

      return false;
   }

   public Map<Integer, HeroDao> getHeroDaoMap() {
      return this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
   }

   public void addAllItemsAndHeros(boolean isHaveSystem, boolean isHaveHero) {
      if (isHaveSystem) {
         ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
         artifactPart.superArtifact();
         ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
         artifactDressPart.gmUnlockDress();
         TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);
         tongqueTerracePart.unlockBeauty(1);
         tongqueTerracePart.unlockBeauty(2);
         tongqueTerracePart.unlockBeauty(3);
         tongqueTerracePart.gmAddAll();
         UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)this.player.getMgrPart(UnionTechnologyPart.class);
         unionTechnologyPart.gmSetAllTechnologyLevel();
         TreasurePart treasurePart = (TreasurePart)this.player.getMgrPart(TreasurePart.class);
         treasurePart.gmAddAll();
         DivineGeneralsPart divineGeneralsPart = (DivineGeneralsPart)this.player.getMgrPart(DivineGeneralsPart.class);
         divineGeneralsPart.quickUpgrade(15);
         BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
         if (battleChapterDao.chapterId < 400) {
            battleChapterDao.chapterId = 400;
            battleChapterDao.updateOp();
         }

         DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)this.player.getMgrPart(DragonStrengthenPart.class);
         dragonStrengthenPart.gmResetStrengthen(54);
      }

      List<Integer> num_5W_list = new ArrayList();
      num_5W_list.add(1056);
      num_5W_list.add(1036);
      List<Integer> num_9W_list = new ArrayList();
      num_9W_list.add(1012);
      num_9W_list.add(1046);
      num_9W_list.add(1055);
      List<Integer> num_90W_list = new ArrayList();
      num_90W_list.add(1115);
      num_90W_list.add(1006);
      Map<Integer, ItemModel> map = this.player.getGameModelPool().getMap("item");
      List<ResourceModel> addList = new ArrayList();

      for(Map.Entry<Integer, ItemModel> entry : map.entrySet()) {
         if (((ItemModel)entry.getValue()).getSubclass() == 2) {
            if ((Integer)entry.getKey() == 2737 || (Integer)entry.getKey() == 2738 || (Integer)entry.getKey() == 2739 || (Integer)entry.getKey() == 2740) {
               addList.add(new ResourceModel(2, (Integer)entry.getKey(), 6));
            }
         } else if (((ItemModel)entry.getValue()).getSubclass() == 5) {
            if (((ItemModel)entry.getValue()).getQuality() == 7) {
               addList.add(new ResourceModel(2, (Integer)entry.getKey(), 1));
            }
         } else if (((ItemModel)entry.getValue()).getSubclass() == 7) {
            addList.add(new ResourceModel(2, (Integer)entry.getKey(), 1));
         } else if (((ItemModel)entry.getValue()).getSubclass() == 10) {
            if (((ItemModel)entry.getValue()).getQuality() == 7) {
               addList.add(new ResourceModel(2, (Integer)entry.getKey(), 6));
            }
         } else if (((ItemModel)entry.getValue()).getCombine() > 0 && ((ItemModel)entry.getValue()).getSubclass() == 1 && ((ItemModel)entry.getValue()).getUseFuncType() == 29) {
            int num = 9999;
            if (num_5W_list.contains(entry.getKey())) {
               num = 49999;
            }

            if (num_9W_list.contains(entry.getKey())) {
               num = 99999;
            } else if (num_90W_list.contains(entry.getKey())) {
               num = 999999;
            }

            addList.add(new ResourceModel(2, (Integer)entry.getKey(), num));
         }
      }

      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, 2000000000));
      addList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, 2000000000));
      int num = 10 - this.player.getPublicDao().vip_lv;
      if (num > 0) {
         addList.add(new ResourceModel(1, PlayerDefine.PLAYER_VIP_LV, 10));
      }

      addList.add(new ResourceModel(2, 14704, 99));
      addList.add(new ResourceModel(2, 1520, 300));
      addList.add(new ResourceModel(2, 1450100, 96));
      addList.add(new ResourceModel(2, 14401, 114));
      addList.add(new ResourceModel(2, 14402, 114));
      addList.add(new ResourceModel(2, 14403, 114));
      addList.add(new ResourceModel(2, 14404, 114));
      addList.add(new ResourceModel(2, 2097, 200));
      addList.add(new ResourceModel(2, 4060, 12));
      addList.add(new ResourceModel(2, 6011, 6));
      addList.add(new ResourceModel(2, 1509, 999));
      addList.add(new ResourceModel(2, 1090, 99999));
      addList.add(new ResourceModel(2, 1176, 9999));
      addList.add(new ResourceModel(2, 1177, 9999));
      addList.add(new ResourceModel(2, 1178, 9999));
      this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 49, 452, 0, 0, "");
      if (isHaveHero) {
         Map<Integer, HeroModel> heroModelMap = this.player.getGameModelPool().getMap("hero");
         List<HeroDao> successList = new ArrayList();
         List<CommonMsg.ItemInfo.Builder> resourceModels = new ArrayList();

         for(Map.Entry<Integer, HeroModel> entry : heroModelMap.entrySet()) {
            if (((HeroModel)entry.getValue()).getShowOpen() > 0 && ((HeroModel)entry.getValue()).getQuality() >= 5 && ((HeroModel)entry.getValue()).getSkills().size() >= 5 && ((HeroModel)entry.getValue()).getHeroSpType() != HeroDefine.HERO_SP_TYPE_LINK) {
               HeroDao heroDao = this.insertSpecialHero((Integer)entry.getKey(), 350, 13, 49, 452, 0, 0, "");
               ((HeroArchivePart)this.player.getMgrPart(HeroArchivePart.class)).takeNewHero((Integer)entry.getKey());
               if (heroDao != null) {
                  CommonMsg.ItemInfo.Builder info_builder = CommonMsg.ItemInfo.newBuilder();
                  info_builder.setType(3);
                  info_builder.setId((Integer)entry.getKey());
                  info_builder.setCode(heroDao.code);
                  info_builder.setNum(1);
                  info_builder.setStar(heroDao.getStar());
                  resourceModels.add(info_builder);
                  this.triggerHeroStarTask(heroDao, true);
                  successList.add(heroDao);
               }
            }
         }

         this.sendHeroList2Client(successList);
         this.player.addResourceMsgByBuilder(resourceModels);
      }

      HeroPromotePart heroPromotePart = (HeroPromotePart)this.player.getMgrPart(HeroPromotePart.class);
      heroPromotePart.checkExtraLvLimit(13);
   }

   private static boolean isArrayingAdd(HeroDao heroDao) {
      boolean isArrayingAdd = false;
      if (heroDao == null) {
         return isArrayingAdd;
      } else if (heroDao.talent == null) {
         return isArrayingAdd;
      } else if (heroDao.getTalentSkill().isEmpty()) {
         return isArrayingAdd;
      } else {
         for(Integer skillId : heroDao.getTalentSkill()) {
            SkillKingTalentModel skillKingTalentModel = (SkillKingTalentModel)ApplicationContextProvider.getModelPoolEntity("skillKingTalent", skillId);
            if (skillKingTalentModel != null && skillKingTalentModel.getType() == 2) {
               isArrayingAdd = true;
               break;
            }
         }

         return isArrayingAdd;
      }
   }

   public boolean resetKingCodeCheck() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      boolean isChange = false;
      if (heroArrayingDao.arrayingType == CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber() && heroArrayingDao.kingCode != 0) {
         Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
         HeroDao heroDao = (HeroDao)map.get(heroArrayingDao.kingCode);
         if (!isArrayingAdd(heroDao)) {
            Integer friendCode = (Integer)heroArrayingDao.elements.get((byte)5);
            if (friendCode != null) {
               heroDao = (HeroDao)map.get(friendCode);
               if (heroDao != null) {
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                     heroArrayingDao.kingCode = heroDao.code;
                     heroArrayingDao.updateOp();
                     return true;
                  }
               }
            }

            if (heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
               for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                  if ((Byte)entry.getKey() < 5) {
                     heroDao = (HeroDao)map.get(entry.getValue());
                     if (heroDao != null) {
                        HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING && isArrayingAdd(heroDao)) {
                           heroArrayingDao.kingCode = heroDao.code;
                           heroArrayingDao.updateOp();
                           isChange = true;
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      return isChange;
   }

   public void checkStar13HeroNum(PlayerExtend playerExtend) {
      Map<Integer, Integer> herostatMap = this.getHeroNumInStar();
      if (herostatMap.containsKey(13)) {
         int currentNum = (Integer)herostatMap.get(13);
         if (currentNum > playerExtend.star13Heros) {
            playerExtend.star13Heros = currentNum;
            this.player.updatePlayerExtend(13);
            this.player.notifyPlayerData(PlayerDefine.STAR_13_HERO_NUM, playerExtend.star13Heros);
         }
      }

   }

   public boolean isEnableDelHero(List<Integer> codeList) {
      for(Integer code : codeList) {
         HeroDao heroDao = this.getHeroByCode(code);
         if (heroDao == null) {
            return false;
         }

         if (heroDao.isHaveArrayingState()) {
            return false;
         }

         if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
            return false;
         }
      }

      return true;
   }

   public void checkKingControl() {
      KingControlDao kingControlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
      if (!kingControlDao.loginFlag) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         if (heroArrayingDao != null) {
            boolean isKingControl = false;
            int kingControlNation = 0;
            Set<HeroDao> flushCodeList = new HashSet();
            if (heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
               Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

               for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                  if ((Byte)entry.getKey() <= 5 && map.containsKey(entry.getValue())) {
                     HeroDao heroDao = (HeroDao)map.get(entry.getValue());
                     if (heroDao != null) {
                        HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_KING) {
                           flushCodeList.add(heroDao);
                        } else if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                           kingControlNation = heroModel.getNation();
                           isKingControl = true;
                        }
                     }
                  }
               }
            }

            TreeSet<Integer> controlSet = new TreeSet();
            if (isKingControl && kingControlNation > 0) {
               List<ControlData> tempList = new ArrayList();
               int pos = 0;

               for(HeroDao heroDao : flushCodeList) {
                  ++pos;
                  controlSet.add(heroDao.code);
                  tempList.add(new ControlData(heroDao.code, pos));
               }

               kingControlDao.controlData.controlMap.put(kingControlNation, tempList);
            }

            kingControlDao.loginFlag = true;
            kingControlDao.updateOp();
            if (!controlSet.isEmpty()) {
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODULE_KING_CONTROL, controlSet, true, true);
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SaveKingControl_5229(HeroMsg.C2S_SaveKingControl_5229 msg, String source) {
      int kingNation = msg.getControl().getKingNation();
      if (kingNation >= 1 && kingNation <= 5) {
         HeroDao heroDao = this.getKingHeroDao(kingNation);
         if (heroDao != null) {
            Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
               KingControlDao kingControlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
               Set<Integer> flushCodeList = new HashSet();
               List<Integer> otherList = new ArrayList();

               for(Map.Entry<Integer, List<ControlData>> entry : kingControlDao.controlData.controlMap.entrySet()) {
                  if ((Integer)entry.getKey() != kingNation) {
                     for(ControlData controlData : (List)entry.getValue()) {
                        otherList.add(controlData.heroCode);
                     }
                  }
               }

               List<Integer> posList = new ArrayList();
               List<Integer> codeList = new ArrayList();
               Iterator var20 = msg.getControl().getControlInfoList().iterator();

               while(true) {
                  if (var20.hasNext()) {
                     HeroMsg.ControlInfo info = (HeroMsg.ControlInfo)var20.next();
                     if (!heroDaoMap.containsKey(info.getHeroCode())) {
                        return;
                     }

                     if (otherList.contains(info.getHeroCode())) {
                        this.logger.error("管制武将中含有其他君主管制武将：{}", info.getHeroCode());
                        return;
                     }

                     HeroDao controlHeroDao = (HeroDao)heroDaoMap.get(info.getHeroCode());
                     HeroModel controlModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", controlHeroDao.id);
                     if (HeroModel.isReplacementHero(controlHeroDao.id)) {
                        return;
                     }

                     if (controlModel != null && controlModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_KING) {
                        if (controlModel.getNation() == 10 && controlHeroDao.inheritNation <= 0) {
                           this.logger.error("管制武将中含有未继承阵营的魂武将：{}", info.getHeroCode());
                           return;
                        }

                        if (info.getPos() >= 1 && info.getPos() <= 5) {
                           if (posList.contains(info.getPos())) {
                              this.logger.error("君主管制武将位置重复：{}", info.getPos());
                              return;
                           }

                           if (codeList.contains(info.getHeroCode())) {
                              this.logger.error("君主管制武将code重复：{}", info.getHeroCode());
                              return;
                           }

                           posList.add(info.getPos());
                           codeList.add(info.getHeroCode());
                           continue;
                        }

                        this.logger.error("君主管制武将位置错误：{}", info.getPos());
                        return;
                     }

                     this.logger.error("管制武将中含有君主武将：{}", info.getHeroCode());
                     return;
                  }

                  if (kingControlDao.controlData.controlMap.containsKey(kingNation)) {
                     for(ControlData controlData : (List)kingControlDao.controlData.controlMap.get(kingNation)) {
                        if (heroDaoMap.containsKey(controlData.heroCode)) {
                           flushCodeList.add(controlData.heroCode);
                        }
                     }

                     kingControlDao.controlData.controlMap.remove(kingNation);
                  }

                  List<ControlData> tempList = new ArrayList();

                  for(HeroMsg.ControlInfo info : msg.getControl().getControlInfoList()) {
                     flushCodeList.add(info.getHeroCode());
                     tempList.add(new ControlData(info.getHeroCode(), info.getPos()));
                  }

                  kingControlDao.controlData.controlMap.put(kingNation, tempList);
                  kingControlDao.updateOp();
                  HeroMsg.S2C_SaveKingControl_5230.Builder builder = HeroMsg.S2C_SaveKingControl_5230.newBuilder();
                  builder.setControl(this.buildKingControl(kingNation, (List)kingControlDao.controlData.controlMap.get(kingNation)));
                  this.player.sendMsg(builder.build());
                  if (!flushCodeList.isEmpty()) {
                     this.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODULE_KING_CONTROL, flushCodeList, true, true);
                  }

                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

                  for(Integer code : flushCodeList) {
                     HeroDao heroByCode = heroBagPart.getHeroByCode(code);
                     heroBagPart.updateNationHeroRank(heroByCode, true);
                  }

                  return;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_KingControlInfo_5231(HeroMsg.C2S_KingControlInfo_5231 msg, String source) {
      this.sendKingControlList();
   }

   public void sendKingControlList() {
      KingControlDao controlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
      HeroMsg.S2C_KingControlInfo_5232.Builder builder = HeroMsg.S2C_KingControlInfo_5232.newBuilder();

      for(Map.Entry<Integer, List<ControlData>> entry : controlDao.controlData.controlMap.entrySet()) {
         builder.addControlInfo(this.buildKingControl((Integer)entry.getKey(), (List)entry.getValue()));
      }

      this.player.sendMsg(builder.build());
   }

   public HeroMsg.KingControl.Builder buildKingControl(int kingNation, List<ControlData> list) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroMsg.KingControl.Builder builder = HeroMsg.KingControl.newBuilder();
      builder.setKingNation(kingNation);

      for(ControlData controlData : list) {
         if (heroBagPart.getHeroByCode(controlData.heroCode) == null) {
            this.logger.error("君主管制未找到武将：{}", controlData.heroCode);
         } else {
            HeroMsg.ControlInfo.Builder info = HeroMsg.ControlInfo.newBuilder();
            info.setHeroCode(controlData.heroCode);
            info.setPos(controlData.pos);
            builder.addControlInfo(info);
         }
      }

      return builder;
   }

   public HeroDao getKingHeroDao(int nation) {
      List<HeroComparatorData> kingHeroList = new ArrayList();
      Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(HeroDao heroDao : heroDaoMap.values()) {
         if (heroDao != null) {
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel != null && heroModel.getNation() == nation && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
               int talentLv = 0;
               if (this.checkActivationTalent(heroDao)) {
                  talentLv = 1;
               }

               kingHeroList.add(new HeroComparatorData(heroDao.code, heroDao.getStar(), talentLv, heroDao.getCombatPower()));
            }
         }
      }

      if (!kingHeroList.isEmpty()) {
         Collections.sort(kingHeroList, new HeroKingDataComparator());
         int targetCode = ((HeroComparatorData)kingHeroList.get(kingHeroList.size() - 1)).code;
         if (heroDaoMap.containsKey(targetCode)) {
            return (HeroDao)heroDaoMap.get(targetCode);
         }
      }

      KingControlDao kingControlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
      if (kingControlDao.controlData.controlMap.containsKey(nation)) {
         Set<Integer> flushCodeList = new HashSet();

         for(ControlData controlData : (List)kingControlDao.controlData.controlMap.get(nation)) {
            HeroDao heroDao = this.getHeroByCode(controlData.heroCode);
            if (heroDao != null) {
               flushCodeList.add(heroDao.code);
            }
         }

         kingControlDao.controlData.controlMap.remove(nation);
         kingControlDao.updateOp();
         if (!flushCodeList.isEmpty()) {
            this.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODULE_KING_CONTROL, flushCodeList, true, true);
         }
      }

      return null;
   }

   public List<PropertyModel> getKingControlAdd(HeroDao heroDao) {
      List<PropertyModel> resultList = new ArrayList();
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
      if (heroModel == null) {
         return resultList;
      } else if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
         return resultList;
      } else {
         int nation = this.checkIsControl(heroDao);
         if (nation == 0) {
            return resultList;
         } else {
            HeroDao kingHeroDao = this.getKingHeroDao(nation);
            if (kingHeroDao == null) {
               return resultList;
            } else {
               int realNation = heroModel.getNation();
               if (heroModel.getNation() == 10 && heroDao.inheritNation > 0) {
                  realNation = heroDao.inheritNation;
               }

               if (this.property_king_extra.containsKey(nation)) {
                  for(Map.Entry<Integer, List<PropertyModel>> entry : ((Map)this.property_king_extra.get(nation)).entrySet()) {
                     if ((Integer)entry.getKey() == 0 || (Integer)entry.getKey() == realNation) {
                        resultList.addAll((Collection)entry.getValue());
                     }
                  }
               }

               return resultList;
            }
         }
      }
   }

   public void calcKingControl(HeroDao heroDao) {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.getDressHeroId());
      SkillKingModel skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", heroDao.getDressHeroId());
      if (heroModel != null) {
         for(HeroDressPart.HeroDressEndTimeAndPros pro : this.getHeroDressEndTimeAndPros(heroDao.id)) {
            HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", pro.dressId);
            if (heroDressModel != null && heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
               skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", heroDressModel.getChangedHeroId());
               break;
            }
         }

         if (skillKingModel == null) {
            skillKingModel = (SkillKingModel)ApplicationContextProvider.getModelPoolEntity("skillKing", heroDao.id);
            if (skillKingModel == null) {
               return;
            }
         }

         HeroDao kingHeroDao = this.getKingHeroDao(heroModel.getNation());
         if (kingHeroDao != null && kingHeroDao.code == heroDao.code) {
            if (this.property_king_extra.containsKey(heroModel.getNation())) {
               this.property_king_extra.remove(heroModel.getNation());
            }

            Map<Integer, List<PropertyModel>> tempMap = new HashMap();
            List<PropertyModel> tempList = new ArrayList();

            for(PropertyModel buff : skillKingModel.getBuffs()) {
               if (!heroDao.totalFightProperties.isEmpty() && heroDao.totalFightProperties.containsKey(buff.getType())) {
                  if (buff.getWay() == 0) {
                     PropertyModel.addLvProtities(tempList, buff.clone());
                  } else if (buff.getWay() == 1) {
                     float tempVal = (float)(Long)heroDao.totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                     PropertyModel.addLvProtities(tempList, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                  }
               }
            }

            tempMap.put(0, tempList);
            List<PropertyModel> var16 = new ArrayList();

            for(PropertyModel addBuff : skillKingModel.getAddBuffs()) {
               if (!heroDao.totalFightProperties.isEmpty() && heroDao.totalFightProperties.containsKey(addBuff.getType())) {
                  if (addBuff.getWay() == 0) {
                     PropertyModel.addLvProtities(var16, addBuff.clone());
                  } else if (addBuff.getWay() == 1) {
                     float tempVal = (float)(Long)heroDao.totalFightProperties.get(addBuff.getType()) * ((float)addBuff.getValue() / 10000.0F);
                     PropertyModel.addLvProtities(var16, new PropertyModel(addBuff.getType(), 0, Float.valueOf(tempVal).longValue()));
                  }
               }
            }

            tempMap.put(heroModel.getNation(), var16);

            for(Integer skillId : heroDao.getTalentSkill()) {
               SkillKingTalentModel skillKingTalentModel = (SkillKingTalentModel)ApplicationContextProvider.getModelPoolEntity("skillKingTalent", skillId);
               if (skillKingTalentModel != null) {
                  var16 = new ArrayList();

                  for(PropertyModel buff : skillKingTalentModel.getBuffs()) {
                     if (!heroDao.totalFightProperties.isEmpty() && heroDao.totalFightProperties.containsKey(buff.getType())) {
                        if (buff.getWay() == 0) {
                           PropertyModel.addLvProtities(var16, buff.clone());
                        } else if (buff.getWay() == 1) {
                           float tempVal = (float)(Long)heroDao.totalFightProperties.get(buff.getType()) * ((float)buff.getValue() / 10000.0F);
                           PropertyModel.addLvProtities(var16, new PropertyModel(buff.getType(), 0, Float.valueOf(tempVal).longValue()));
                        }
                     }
                  }

                  if (tempMap.containsKey(0)) {
                     ((List)tempMap.get(0)).addAll(var16);
                  } else {
                     tempMap.put(0, var16);
                  }
               }
            }

            this.property_king_extra.put(heroModel.getNation(), tempMap);
         }
      }
   }

   public int checkIsControl(HeroDao heroDao) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
      if (heroModel == null) {
         return 0;
      } else {
         KingControlDao kingControlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());

         for(Map.Entry<Integer, List<ControlData>> entry : kingControlDao.controlData.controlMap.entrySet()) {
            for(ControlData data : (List)entry.getValue()) {
               if (data.heroCode == heroDao.code) {
                  return (Integer)entry.getKey();
               }
            }
         }

         return 0;
      }
   }

   public SkillKingTalentModel getKingTalentModel(HeroDao kingDao) {
      for(Integer skillId : kingDao.getTalentSkill()) {
         SkillKingTalentModel skillKingTalentModel = (SkillKingTalentModel)ApplicationContextProvider.getModelPoolEntity("skillKingTalent", skillId);
         if (skillKingTalentModel != null && skillKingTalentModel.getType() == 2) {
            return skillKingTalentModel;
         }
      }

      return null;
   }

   public Boolean checkActivationTalent(HeroDao heroDao) {
      for(Integer skillId : heroDao.getTalentSkill()) {
         SkillKingTalentModel skillKingTalentModel = (SkillKingTalentModel)ApplicationContextProvider.getModelPoolEntity("skillKingTalent", skillId);
         if (skillKingTalentModel != null) {
            return true;
         }
      }

      return false;
   }

   public void flushControlHero(HeroDefine.HeroPropertyModel model, int nation) {
      HeroDao kingHeroDao = this.getKingHeroDao(nation);
      KingControlDao controlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
      if (kingHeroDao == null) {
         if (controlDao.controlData.controlMap.containsKey(nation)) {
            controlDao.controlData.controlMap.remove(nation);
            controlDao.updateOp();
         }

      } else {
         kingHeroDao.flushHero(model, true, false);
         if (controlDao.controlData.controlMap.containsKey(nation)) {
            Set<Integer> flushCodeList = new HashSet();

            for(ControlData data : (List)controlDao.controlData.controlMap.get(nation)) {
               HeroDao heroDao = this.getHeroByCode(data.heroCode);
               if (heroDao != null) {
                  flushCodeList.add(heroDao.code);
               }
            }

            this.flushHeroIdAndArrayingForCodeList(model, flushCodeList, true, true);
         }

      }
   }

   public void checkFlushControl(HeroDao flushHeroDao) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", flushHeroDao.id);
      if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
         HeroDao kingHeroDao = this.getKingHeroDao(heroModel.getNation());
         if (kingHeroDao != null && kingHeroDao.code == flushHeroDao.code) {
            if (!flushHeroDao.containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber())) {
               KingControlDao controlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
               Boolean flag = false;

               for(Map.Entry<Integer, List<ControlData>> entry : controlDao.controlData.controlMap.entrySet()) {
                  Iterator<ControlData> it = ((List)entry.getValue()).iterator();

                  while(it.hasNext()) {
                     ControlData controlData = (ControlData)it.next();
                     HeroDao heroDao = this.getHeroByCode(controlData.heroCode);
                     if (heroDao != null) {
                        HeroModel controlModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (controlModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                           flag = true;
                           this.logger.error("有被管制武将是君主：{}", this.player.getPlayerId());
                           it.remove();
                        }
                     }
                  }
               }

               if (flag) {
                  controlDao.updateOp();
               }

               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               if (heroArrayingDao != null && heroArrayingDao.elements != null && !heroArrayingDao.elements.isEmpty()) {
                  for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                     if ((Byte)entry.getKey() <= 5 && (Integer)entry.getValue() == flushHeroDao.code) {
                        this.logger.error("有君主英雄在阵容上，state状态没有标记在阵容上：{}--{}--{}", new Object[]{flushHeroDao.code, entry.getKey(), flushHeroDao.getStateList().toString()});
                        return;
                     }
                  }
               }

               if (controlDao.controlData.controlMap.containsKey(heroModel.getNation())) {
                  Set<Integer> flushCodeList = new HashSet();

                  for(ControlData data : (List)controlDao.controlData.controlMap.get(heroModel.getNation())) {
                     HeroDao heroDao = this.getHeroByCode(data.heroCode);
                     if (heroDao != null) {
                        flushCodeList.add(heroDao.code);
                     }
                  }

                  this.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODULE_KING_CONTROL_NOT_ARRAYING, flushCodeList, true, true);
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AutoHeroSupport_5233(HeroMsg.C2S_AutoHeroSupport_5233 msg, String source) {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroMsg.AtuoHeroData atuoHeroData = msg.getData();
      worldMgrPushTaskPart.pushTaskEx("setAutoHeroSupport", new Object[]{atuoHeroData.getModule(), atuoHeroData.getIsAuto(), this, "autoHeroSupport"});
   }

   @TaskMethod
   public void autoHeroSupport(int module, boolean isAuto) {
      HeroMsg.S2C_AutoHeroSupport_5234.Builder builder = HeroMsg.S2C_AutoHeroSupport_5234.newBuilder();
      HeroMsg.AtuoHeroData.Builder autoHeroData = HeroMsg.AtuoHeroData.newBuilder();
      autoHeroData.setModule(module);
      autoHeroData.setIsAuto(isAuto);
      builder.setData(autoHeroData);
      this.player.sendMsg(builder.build());
   }

   public void sendAutoSupportData() {
      HeroMsg.S2C_AutoHeroDatas_5236.Builder builder = HeroMsg.S2C_AutoHeroDatas_5236.newBuilder();
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);

      for(HeroSupportDao heroSupportDao : worldMgrPushTaskPart.getHeroSupportDaoList(this.player.getPlayerId())) {
         HeroMsg.AtuoHeroData.Builder heroDataMsg = HeroMsg.AtuoHeroData.newBuilder();
         heroDataMsg.setModule(heroSupportDao.moduleId);
         heroDataMsg.setIsAuto(heroSupportDao.isAuto);
         builder.addData(heroDataMsg);
      }

      this.player.sendMsg(builder.build());
   }

   public void checkArrayingHaveKingControl(Map<Byte, Integer> elements, GamePlayer gamePlayer) {
      if (!gamePlayer.isLogin() && !gamePlayer.isRobot()) {
         Set<Integer> tempList = new HashSet();

         for(Map.Entry<Byte, Integer> entry : elements.entrySet()) {
            if ((Byte)entry.getKey() <= 5) {
               HeroDao heroDao = this.getHeroByCode((Integer)entry.getValue());
               if (heroDao != null) {
                  int nation = this.checkIsControl(heroDao);
                  if (nation > 0) {
                     tempList.add(nation);
                  }
               }
            }
         }

         for(Integer nation : tempList) {
            this.flushKingByNation(nation);
         }

      }
   }

   public void flushKingByNation(int nation) {
      HeroDao kingHeroDao = this.getKingHeroDao(nation);
      KingControlDao controlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
      if (kingHeroDao == null) {
         if (controlDao.controlData.controlMap.containsKey(nation)) {
            controlDao.controlData.controlMap.remove(nation);
            controlDao.updateOp();
         }

      } else {
         kingHeroDao.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO, true, false);
         if (controlDao.controlData.controlMap.containsKey(nation)) {
            for(ControlData data : (List)controlDao.controlData.controlMap.get(nation)) {
               HeroDao heroDao = this.getHeroByCode(data.heroCode);
               if (heroDao != null) {
                  heroDao.flushHero(HeroDefine.HeroPropertyModel.MODULE_KING_CONTROL, false, false);
               }
            }
         }

      }
   }

   public void uploadHeroRankInfo(List<Integer> heroCodeList) {
      CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.Builder builder = CrossHeroRankMsg.S2CR_UploadHeroInfo_14905.newBuilder();

      for(int heroCode : heroCodeList) {
         HeroDao heroDao = this.getHeroByCode(heroCode);
         if (heroDao != null && heroDao.invalidTime <= 0) {
            CommonMsg.HeroInfo.Builder heroInfo = heroDao.toHeroInfo();
            CrossHeroRankMsg.CrossHeroInfo.Builder infoMsg = CrossHeroRankMsg.CrossHeroInfo.newBuilder();
            infoMsg.setPlayerId(this.player.getPlayerId());
            infoMsg.setHeroInfo(heroInfo);
            builder.addCrossHeroInfo(infoMsg);
         }
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void removeHeroRankInfo(List<Integer> heroCodeList) {
      List<Integer> heroIds = new ArrayList();

      for(int heroCode : heroCodeList) {
         HeroDao heroDao = this.getHeroByCode(heroCode);
         if (heroDao != null) {
            heroIds.add(heroDao.id);
         }
      }

      if (heroIds.size() != 0) {
         CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.Builder builder = CrossHeroRankMsg.S2CR_RemoveHeroInfo_14907.newBuilder();
         builder.addAllHeroIds(heroIds);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   public void gmTest(String str) {
      String[] arr = str.split(",");
      switch (arr[0]) {
         case "autosupport":
            WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
            worldMgrPushTaskPart.pushTaskEx("setAutoHeroSupport", new Object[]{Integer.parseInt(arr[1]), Integer.parseInt(arr[2]) == 1, this, "autoHeroSupport"});
         default:
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroInfo_13225(HeroExtendMsg.C2S_HeroInfo_13225 msg, String source) {
      if (this.worldMgr.getServersSet().contains(msg.getServerId())) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(msg.getPlayerId());
         if (gamePlayer == null) {
            this.player.failure(17);
            return;
         }

         gamePlayer.pushTask(() -> {
            HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(msg.getCode());
            if (heroDao == null) {
               this.player.failure(76109);
            } else {
               HeroExtendMsg.S2C_HeroInfo_13226.Builder resp = HeroExtendMsg.S2C_HeroInfo_13226.newBuilder();
               resp.setHeroInfo(heroDao.toHeroInfo());
               this.player.sendMsg(resp.build());
            }
         });
      }

   }

   @MsgHandlerAnno
   public void C2S_SoulHeroInherit_5237(HeroMsg.C2S_SoulHeroInherit_5237 msg, String source) {
      HeroDao heroDao = this.getHeroByCode(msg.getCode());
      if (heroDao != null) {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
         if (heroModel != null) {
            if (heroModel.getNation() == 10) {
               if (msg.getNation() >= 1 && msg.getNation() <= 5) {
                  if (heroDao.inheritNation != msg.getNation()) {
                     int oldNation = heroDao.inheritNation;
                     List<ResourceModel> returnResourceList = new ArrayList();
                     List<CommonMsg.ItemInfo.Builder> showList = new ArrayList();
                     if (heroDao.aide > 0) {
                        HeroAidePart heroAidePart = (HeroAidePart)this.player.getMgrPart(HeroAidePart.class);
                        CommonMsg.ItemInfo.Builder builder = heroAidePart.handleHeroAideDown(heroDao, 1, false);
                        if (builder != null) {
                           showList.add(builder);
                        }
                     }

                     if (heroDao.aide2 > 0) {
                        HeroAidePart heroAidePart = (HeroAidePart)this.player.getMgrPart(HeroAidePart.class);
                        CommonMsg.ItemInfo.Builder builder = heroAidePart.handleHeroAideDown(heroDao, 2, false);
                        if (builder != null) {
                           showList.add(builder);
                        }
                     }

                     this.starMapResetAndReturn(heroDao.code, returnResourceList, true);
                     if (!returnResourceList.isEmpty()) {
                        this.player.addResource(returnResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 4, 454, 0, 0, "");
                     }

                     if (!returnResourceList.isEmpty() || !showList.isEmpty()) {
                        this.player.addResourceMsg(returnResourceList);
                        this.player.addResourceMsgByBuilder(showList);
                        this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_SOUL_HERO_INHERIT);
                     }

                     heroDao.inheritNation = msg.getNation();
                     heroDao.updateOp();
                     this.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                     HeroMsg.S2C_SoulHeroInherit_5238.Builder builder = HeroMsg.S2C_SoulHeroInherit_5238.newBuilder();
                     builder.setCode(msg.getCode());
                     builder.setNation(msg.getNation());
                     builder.setOldNation(oldNation);
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LinkHero_5241(HeroMsg.C2S_LinkHero_5241 msg, String source) {
      if (!this.player.isSystemOpen(6745)) {
         return this.player.failure(21);
      } else {
         HeroDao heroDao = this.getHeroByCode(msg.getCode());
         if (heroDao == null) {
            return this.player.failure(4100);
         } else if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            return this.player.failure(76504);
         } else if (heroDao.linkCode == msg.getLinkCode()) {
            return this.player.failure(1);
         } else {
            this.linkHeroDaoList.clear();
            int oldLinkCode = heroDao.linkCode;
            DuelPart duelPart = (DuelPart)this.player.getMgrPart(DuelPart.class);
            if (oldLinkCode > 0 && this.player.isSystemOpen(3190) && duelPart.checkServerDay() && (heroDao.containState(56) || heroDao.containState(57) || heroDao.containState(58)) && !duelPart.checkCanUploadArraying()) {
               return this.player.failure(76005);
            } else {
               if (msg.getLinkCode() > 0) {
                  HeroDao linkHeroDao = this.getHeroByCode(msg.getLinkCode());
                  if (linkHeroDao == null) {
                     return this.player.failure(4100);
                  }

                  if (linkHeroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
                     return this.player.failure(76505);
                  }

                  if (linkHeroDao.invalidTime > 0) {
                     return this.player.failure(76508);
                  }

                  if (this.getHeroDaoMap().values().stream().anyMatch((checkHeroDao) -> checkHeroDao.type == HeroDefine.HERO_SP_TYPE_LINK && checkHeroDao.linkCode == linkHeroDao.code)) {
                     return this.player.failure(76507);
                  }

                  LinkHeroMainModel linkHeroMainModel = (LinkHeroMainModel)ApplicationContextProvider.getModelPoolEntity("linkHeroMain", heroDao.id);
                  if (linkHeroMainModel == null) {
                     return this.player.failure(0);
                  }

                  HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                  if (heroArrayingPart.isInSameHeroArraying(heroDao.code, linkHeroDao.code)) {
                     return this.player.failure(76510);
                  }

                  switch (linkHeroMainModel.getLinkType()) {
                     case 1:
                        if (!linkHeroMainModel.getLinkHeroArray().contains(linkHeroDao.id)) {
                           return this.player.failure(76508);
                        }
                        break;
                     case 2:
                        HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", linkHeroDao.id);
                        if (heroModel == null || !linkHeroMainModel.getLinkHeroArray().contains(heroModel.getNation())) {
                           return this.player.failure(76508);
                        }
                        break;
                     default:
                        return this.player.failure(0);
                  }

                  linkHeroDao.beLinkCode = heroDao.code;
                  linkHeroDao.updateOp();
                  this.linkHeroDaoList.add(linkHeroDao);
               } else if (!this.cancelLinkAfterHandle(heroDao)) {
                  return false;
               }

               if (heroDao.linkCode > 0 && heroDao.linkCode != msg.getLinkCode()) {
                  HeroDao curLinkHero = this.getHeroByCode(heroDao.linkCode);
                  curLinkHero.beLinkCode = 0;
                  curLinkHero.updateOp();
                  this.linkHeroDaoList.add(curLinkHero);
               }

               heroDao.linkCode = msg.getLinkCode();
               heroDao.updateOp();
               if (oldLinkCode > 0 && heroDao.linkCode > 0) {
                  this.handleHeroRecall(heroDao, 4, 455);
               }

               this.sendHeroList2Client(this.linkHeroDaoList);
               this.linkHeroDaoList.clear();
               this.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
               this.player.sendMsg(HeroMsg.S2C_LinkHero_5242.newBuilder().setCode(msg.getCode()).setLinkCode(msg.getLinkCode()).build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ExperienceHero_5243(HeroMsg.C2S_ExperienceHero_5243 msg, String source) {
      HeroMsg.S2C_ExperienceHero_5244.Builder resp = HeroMsg.S2C_ExperienceHero_5244.newBuilder();
      PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)this.player.getPlayerExtend(4);

      for(Map.Entry<Integer, Integer> entry : playerHeroExtend.experience.entrySet()) {
         resp.addGot(CommonMsg.MapDataII.newBuilder().setKey((Integer)entry.getKey()).setValue((Integer)entry.getValue()));
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_GetExperienceHero_5245(HeroMsg.C2S_GetExperienceHero_5245 msg, String source) {
      HeroExperienceModel heroExperienceModel = (HeroExperienceModel)ApplicationContextProvider.getModelPoolEntity("heroExperience", msg.getKey());
      if (heroExperienceModel == null) {
         return this.player.failure(0);
      } else {
         PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)this.player.getPlayerExtend(4);
         int gotNum = (Integer)playerHeroExtend.experience.getOrDefault(heroExperienceModel.getHeroId(), 0);
         if (gotNum >= heroExperienceModel.getExpNum()) {
            return this.player.failure(51);
         } else if (!this.getHeroById(heroExperienceModel.getHeroId()).isEmpty()) {
            return this.player.failure(76511);
         } else {
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroExperienceModel.getHeroId());
            if (heroModel == null) {
               this.logger.info(String.format("模板id为%d的英雄不存在", heroExperienceModel.getHeroId()));
               return this.player.failure(0);
            } else if (!this.isEnableAddHero(1)) {
               return this.player.failure(22);
            } else {
               HeroDao heroDao = this.insertHero(heroModel, heroExperienceModel.getExpTime(), 4, 456, 0, 0, "");
               this.sendHeroList2ClientByHeroDao(heroDao);
               CommonMsg.ItemInfo.Builder heroBuilder = CommonMsg.ItemInfo.newBuilder();
               heroBuilder.setType(3);
               heroBuilder.setCode(heroDao.code);
               heroBuilder.setNum(1);
               heroBuilder.setId(heroDao.id);
               heroBuilder.setStar(heroDao.getStar());
               this.player.addResourceMsgByBuilder(heroBuilder);
               this.player.sendResourceMsg();
               if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                  this.sendKingControlList();
               }

               ++gotNum;
               playerHeroExtend.experience.put(msg.getKey(), gotNum);
               this.player.updatePlayerExtend(4);
               this.player.sendMsg(HeroMsg.S2C_GetExperienceHero_5246.newBuilder().setKey(heroExperienceModel.getHeroId()).setVal(gotNum).build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ExperienceHeroInvalid_5247(HeroMsg.C2S_ExperienceHeroInvalid_5247 msg, String source) {
      HeroDao heroDao = this.getHeroByCode(msg.getCode());
      if (heroDao != null) {
         this.player.sendMsg(HeroMsg.S2C_ExperienceHeroInvalid_5248.newBuilder().setCode(msg.getCode()).setInvalidTime(this.checkHeroInvalid(heroDao)).build());
      }
   }

   public void updateNationHeroRank(HeroDao heroDao, boolean checkMaxPower) {
      if (!this.player.isRobot() && heroDao != null && heroDao.containState(1) && heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.invalidTime <= 0) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
         if (heroModel != null) {
            if (nationHeroRankLimit(heroDao)) {
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               if (!checkMaxPower || (Long)playerExtend.nationMaxPower.getOrDefault(heroModel.getNation(), 0L) < heroDao.combatPower) {
                  if ((Long)playerExtend.nationMaxPower.getOrDefault(heroModel.getNation(), 0L) < heroDao.combatPower) {
                     playerExtend.nationMaxPower.put(heroModel.getNation(), heroDao.combatPower);
                     this.player.updatePlayerExtend(13);
                  }

                  HeroRankData heroRankData = new HeroRankData();
                  heroRankData.score = heroDao.combatPower;
                  heroRankData.star = heroDao.getStar();
                  heroRankData.lv = heroDao.getLv();
                  heroRankData.code = heroDao.code;
                  heroRankData.id = heroDao.id;
                  heroRankData.value = this.player.getPlayerId();
                  heroRankData.starMapTotalLv = heroDao.recStarMapTotalLv();
                  RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
                  rankMgr.pushTaskEx("updateNationHeroRank", new Object[]{heroModel.getNation(), heroRankData});
                  rankMgr.pushTaskEx("checkRankReward", new Object[]{this.player.getPlayerId(), RankRewardModel.HERO_NATION_RANK.getOrDefault(heroModel.getNation(), -1), heroRankData.score});
               }
            }
         }
      }
   }

   private static boolean nationHeroRankLimit(HeroDao heroDao) {
      String[] limit = ApplicationContextProvider.getConfigString("groupIntoRule", "100|6").split("\\|");
      return heroDao.getLv() >= Integer.parseInt(limit[0]) && heroDao.getStar() >= Integer.parseInt(limit[1]);
   }

   @TaskMethod
   public void resetNationHeroRank(int nation) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.nationMaxPower.remove(nation);
      this.player.updatePlayerExtend(13);
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);

      for(int heroCode : heroArrayingDao.elements.values()) {
         HeroDao heroDao = this.getHeroByCode(heroCode);
         this.updateNationHeroRank(heroDao, false);
      }

   }

   public void starMapResetAndReturn(int heroCode, List<ResourceModel> returnResourceList, boolean isClear) {
      HeroDao heroDao = this.getHeroByCode(heroCode);
      if (heroDao != null) {
         if (heroDao.starMap != null && heroDao.starMap.size() > 0) {
            HeroStarAtlasPart heroStarAtlasPart = (HeroStarAtlasPart)this.player.getMgrPart(HeroStarAtlasPart.class);
            List<ResourceModel> starMapResetReturnRewards = heroStarAtlasPart.getStarMapResetReturnRewards(heroCode);
            if (starMapResetReturnRewards != null && starMapResetReturnRewards.size() > 0) {
               for(ResourceModel rm : starMapResetReturnRewards) {
                  ResourceModel.addResourceToList(returnResourceList, new ResourceModel(rm.getType(), rm.getId(), rm.getValue()));
               }
            }

            if (isClear) {
               heroDao.starMap.clear();
               heroDao.palaceStarSkill.clear();
               heroDao.updateOp();
            }
         }

      }
   }

   public int getHeroNation(HeroDao heroDao) {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
      if (heroModel == null) {
         return 1;
      } else {
         return heroModel.getNation() == 10 ? heroDao.inheritNation : heroModel.getNation();
      }
   }

   public int getHeroNation(int heroCode) {
      HeroDao heroDao = this.getHeroByCode(heroCode);
      return heroDao == null ? 1 : this.getHeroNation(heroDao);
   }

   public void recordMaxStar(int heroId, int star, boolean login) {
      HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
      PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)this.player.getPlayerExtend(4);
      if (playerHeroExtend.maxStar.containsKey(heroId)) {
         if (star > (Integer)playerHeroExtend.maxStar.get(heroId)) {
            playerHeroExtend.maxStar.put(heroId, star);
            this.player.updatePlayerExtend(4);
            heroPalacePart.sendSoulDictionaryInfo(heroId, login);
         }
      } else {
         playerHeroExtend.maxStar.put(heroId, star);
         this.player.updatePlayerExtend(4);
         heroPalacePart.sendSoulDictionaryInfo(heroId, login);
      }

   }

   @MsgHandlerAnno
   public void C2S_LinkHeroNoticeInfo_5249(HeroMsg.C2S_LinkHeroNoticeInfo_5249 msg, String source) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      Integer dailyNum = (Integer)playerResetCustomCache.getDailyNum(57, 0);
      HeroMsg.S2C_LinkHeroNoticeInfo_5250.Builder resp = HeroMsg.S2C_LinkHeroNoticeInfo_5250.newBuilder();
      resp.setHasRecDailyReward(dailyNum > 0);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_RecLinkHeroNoticeReward_5251(HeroMsg.C2S_RecLinkHeroNoticeReward_5251 msg, String source) {
      if (!this.player.isSystemOpen(6742)) {
         return this.player.failure(21);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         Integer dailyNum = (Integer)playerResetCustomCache.getDailyNum(57, 0);
         if (dailyNum > 0) {
            return this.player.failure(76030);
         } else {
            List<ResourceModel> linkHeroPreviewReward = this.configManager.getResourceModelList("linkHeroPreviewReward", "1|8|10000,1|9|100");
            if (linkHeroPreviewReward != null && !linkHeroPreviewReward.isEmpty()) {
               this.player.addResource(linkHeroPreviewReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 4, 458);
               playerResetCustomCache.setDailyReset(57, dailyNum + 1);
               HeroMsg.S2C_RecLinkHeroNoticeReward_5252.Builder builder = HeroMsg.S2C_RecLinkHeroNoticeReward_5252.newBuilder();
               this.player.sendMsg(builder.build());
               return true;
            } else {
               return this.player.failure(37);
            }
         }
      }
   }

   public boolean linkHeroCantDo(HeroDao heroDao) {
      if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
         this.player.failure(76505);
         return true;
      } else if (this.getHeroDaoMap().values().stream().anyMatch((checkHeroDao) -> checkHeroDao.type == HeroDefine.HERO_SP_TYPE_LINK && checkHeroDao.linkCode == heroDao.code)) {
         this.player.failure(76506);
         return true;
      } else {
         return false;
      }
   }

   public void handleHeroRecall(HeroDao heroDao, int logModule, int logReason) {
      int heroLv = heroDao.getLv();
      int heroStar = heroDao.getStar();
      HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      List<ResourceModel> returnResourceList = new ArrayList();
      int openStar = this.configManager.getIntDefault("soulSlotUnlock2", 7);
      if (heroStar < openStar && heroDao.warriors.containsKey(6)) {
         WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet((WarriorSignet)heroDao.warriors.get(6), logModule, logReason, 0, 0, "");
         heroDao.warriors.remove(6);
         heroDao.updateOp();
         this.player.additemUpdateBuilder(newWarriorSignet);
         this.player.addResourceMsg(newWarriorSignet);
      }

      int openLv = this.configManager.getIntDefault("soulSlotUnlock1", 100);
      if (heroLv < openLv && heroDao.warriors.containsKey(5)) {
         WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet((WarriorSignet)heroDao.warriors.get(5), logModule, logReason, 0, 0, "");
         heroDao.warriors.remove(5);
         heroDao.updateOp();
         this.player.additemUpdateBuilder(newWarriorSignet);
         this.player.addResourceMsg(newWarriorSignet);
      }

      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2089);
      if (heroStar < systemFunctionModel.getHeroStarLevel()) {
         Totem totem = heroDao.getTotem();
         if (totem != null) {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            totem.heroCode = 0;
            itemBagDao.updateOp();
            this.player.additemUpdateBuilder(totem);
         }
      }

      openStar = this.configManager.getIntDefault("countryWarFlagOpenStar", 10);
      if (heroStar < openStar && heroDao.warFlag != null) {
         WarFlag newBagWarFlag = itemBagPart.addWarFlag(heroDao.warFlag, logModule, logReason, heroDao.code, heroDao.warFlag.id, "");
         heroDao.warFlag = null;
         heroDao.updateOp();
         this.player.additemUpdateBuilder(newBagWarFlag);
         this.player.addResourceMsg(newBagWarFlag);
      }

      systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2100);
      if (heroStar < systemFunctionModel.getHeroStarLevel() && heroDao.exTreasure != null) {
         for(Integer itemId : heroDao.exTreasure.stoneMap.values()) {
            ResourceModel.addResourceToList(returnResourceList, new ResourceModel(2, itemId, 1));
         }

         Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);

         for(ExclusiveTreasureBaseModel exclusiveTreasureBaseModel : modelMap.values()) {
            if (exclusiveTreasureBaseModel.getLev() < heroDao.exTreasure.lev && exclusiveTreasureBaseModel.getStar() <= heroDao.exTreasure.star && exclusiveTreasureBaseModel.getNation() == heroModel.getType()) {
               for(ResourceModel resourceModel : exclusiveTreasureBaseModel.getUpLevConsume()) {
                  ResourceModel.addResourceToList(returnResourceList, resourceModel);
               }
            }

            if (exclusiveTreasureBaseModel.getLev() <= heroDao.exTreasure.lev && exclusiveTreasureBaseModel.getStar() < heroDao.exTreasure.star && exclusiveTreasureBaseModel.getNation() == heroModel.getType()) {
               for(ResourceModel resourceModel : exclusiveTreasureBaseModel.getUpStarConsume()) {
                  ResourceModel.addResourceToList(returnResourceList, resourceModel);
               }
            }
         }

         heroDao.exTreasure = null;
         heroDao.updateOp();
      }

      openStar = this.configManager.getIntDefault("cardstamOpenStar", 6);
      if (heroStar < openStar) {
         for(OrnamentItem ornamentItem : heroDao.ornament.values()) {
            OrnamentItem newOrnament = itemBagPart.addOrnament(ornamentItem, logModule, logReason, 0, 0, "");
            this.player.additemUpdateBuilder(newOrnament);
            this.player.addResourceMsg(newOrnament);
         }

         heroDao.ornament.clear();
         heroDao.updateOp();
      }

      systemFunctionModel = (SystemFunctionModel)this.player.getGameModelPool().getEntity("systemFunction", 2070);
      if (heroStar < systemFunctionModel.getHeroStarLevel()) {
         for(RuneStoneItem rune : heroDao.runeStone.values()) {
            RuneStoneItem newRune = itemBagPart.addRuneStoneItem(rune, logModule, logReason, 0, 0, "");
            this.player.additemUpdateBuilder(newRune);
            this.player.addResourceMsg(newRune);
         }

         heroDao.runeStone.clear();
         heroDao.runeLv = 0;
         heroDao.updateOp();
      }

      systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2050);
      if (heroStar < systemFunctionModel.getHeroStarLevel()) {
         if (heroDao.aide > 0) {
            AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
            if (aideLevelModel != null) {
               HeroAideItem heroAideItem = itemBagPart.addHeroAide(aideLevelModel, logModule, logReason, 0, 0, "");
               this.player.additemUpdateBuilder(heroAideItem);
               this.player.addResourceMsg(heroAideItem);
            }

            heroDao.aide = 0;
            heroDao.updateOp();
         }

         if (heroDao.aide2 > 0) {
            AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide2);
            if (aideLevelModel != null) {
               HeroAideItem heroAideItem = itemBagPart.addHeroAide(aideLevelModel, logModule, logReason, 0, 0, "");
               this.player.additemUpdateBuilder(heroAideItem);
               this.player.addResourceMsg(heroAideItem);
            }

            heroDao.aide2 = 0;
            heroDao.updateOp();
         }
      }

      List<Integer> forgetList = new ArrayList();
      openStar = this.configManager.getIntDefault("tacticsSlotUnlock1", 6);
      if (heroStar < openStar && heroDao.warcrafts.containsKey(7)) {
         forgetList.add(7);
      }

      openStar = this.configManager.getIntDefault("tacticsSlotUnlock2", 11);
      if (heroStar < openStar && heroDao.warcrafts.containsKey(8)) {
         forgetList.add(8);
      }

      openStar = this.configManager.getIntDefault("tacticsSlotUnlock3", 13);
      if (heroStar < openStar && heroDao.warcrafts.containsKey(9)) {
         forgetList.add(9);
      }

      openStar = this.configManager.getIntDefault("tacticsSlotUnlock4", 14);
      if (heroStar < openStar && heroDao.warcrafts.containsKey(31)) {
         forgetList.add(31);
      }

      if (!forgetList.isEmpty()) {
         for(ResourceModel resourceModel : heroWearPart.forgetWarcraft(heroDao, forgetList, true)) {
            ResourceModel.addResourceToList(returnResourceList, resourceModel);
         }
      }

      openStar = this.configManager.getIntDefault("equipCastHeroStarLimit", 10);
      if (heroStar < openStar) {
         if (!heroDao.castSouls.isEmpty()) {
            CastSoulPart castSoulPart = (CastSoulPart)this.player.getMgrPart(CastSoulPart.class);
            List<ResourceModel> resourceModels = castSoulPart.getResetCastSoulResource(heroDao);
            if (castSoulPart.resetCastSoul(heroDao)) {
               for(ResourceModel resourceModel : resourceModels) {
                  ResourceModel.addResourceToList(returnResourceList, resourceModel);
               }
            }
         }

         if (!heroDao.strengthLev.isEmpty()) {
            for(Integer lev : heroDao.strengthLev.values()) {
               EquipRefineModel model = (EquipRefineModel)this.player.getGameModelPool().getEntity("EquipRefine", lev);
               if (model != null) {
                  for(ResourceModel resourceModel : model.getBackMaterial()) {
                     ResourceModel.addResourceToList(returnResourceList, resourceModel);
                  }
               }
            }

            heroDao.strengthLev.clear();
            heroDao.strengthSkill.clear();
            heroDao.updateOp();
         }
      }

      Iterator<Map.Entry<Integer, List>> iterator = heroDao.talent.entrySet().iterator();

      while(iterator.hasNext()) {
         Map.Entry<Integer, List> entry = (Map.Entry)iterator.next();
         if (((List)entry.getValue()).size() > 0) {
            int lv = (Integer)((List)entry.getValue()).get(0);
            if (lv > 0) {
               TalentLevelModel talentLevelModel = (TalentLevelModel)this.player.getGameModelPool().getEntity("talentLevel", entry.getKey());
               if (talentLevelModel != null && talentLevelModel.getStar() > heroStar) {
                  for(int i = 1; i <= lv; ++i) {
                     if (talentLevelModel.getConsume().containsKey(i)) {
                        ResourceModel.addResourceToList(returnResourceList, (ResourceModel)talentLevelModel.getConsume().get(i));
                     }
                  }

                  iterator.remove();
                  heroDao.updateOp();
               }
            }
         }
      }

      systemFunctionModel = (SystemFunctionModel)this.player.getGameModelPool().getEntity("systemFunction", 3002);
      if (heroStar < systemFunctionModel.getHeroStarLevel() && heroDao.warHorse != null) {
         WarHorse newWarHorse = itemBagPart.addWarHorse(heroDao.warHorse, 12, 1217, heroDao.code, 0, "undressHorse");
         heroDao.warHorse = null;
         heroDao.updateOp();
         this.player.additemUpdateBuilder(newWarHorse);
         this.player.addResourceMsg(newWarHorse);
      }

      StarMapTypeModel starMapTypeModel = StarMapDefine.getStarMapTypeModel(heroDao);
      if (starMapTypeModel == null || heroStar < starMapTypeModel.getStar()) {
         this.starMapResetAndReturn(heroDao.code, returnResourceList, true);
      }

      systemFunctionModel = (SystemFunctionModel)this.player.getGameModelPool().getEntity("systemFunction", 6610);
      if (heroStar < systemFunctionModel.getHeroStarLevel() && heroDao.exclusiveWeaponMap != null && heroDao.exclusiveWeaponMap.size() > 0) {
         for(Map.Entry<Integer, ExclusiveWeaponItem> entry : heroDao.exclusiveWeaponMap.entrySet()) {
            ExclusiveWeaponItem addEwItem = itemBagPart.addExclusiveWeaponItem((ExclusiveWeaponItem)entry.getValue(), logModule, logReason, 0, 0, "");
            this.player.additemUpdateBuilder(addEwItem);
            this.player.addResourceMsg(addEwItem);
         }

         heroDao.exclusiveWeaponMap.clear();
         heroDao.soulSkill.clear();
         heroDao.updateOp();
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
      this.player.addResource(returnResourceList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, logModule, logReason, 0, 0, "");
      this.player.senditemUpdateMsg();
      this.player.sendResourceMsg();
   }

   private int checkHeroInvalid(HeroDao heroDao) {
      if (heroDao != null && heroDao.invalidTime != 0) {
         int invalidTime = heroDao.invalidTime;
         if (invalidTime <= DateUtil.getIntTime(System.currentTimeMillis())) {
            int heroId = heroDao.id;
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            heroArrayingPart.heroLeaveArraying(heroDao.code, false, false);
            List<Integer> delList = new ArrayList();
            delList.add(heroDao.code);
            boolean isSuccess = this.deleteHero(delList, HeroDefine.DelHeroType.INVALID, 4, 457, 0, 0, "");
            if (isSuccess) {
               this.player.senditemUpdateMsg();
               this.player.clearAddBuilder();
               invalidTime = 0;
               this.sendHeroInvalidMail(heroId);
            }
         }

         return invalidTime;
      } else {
         return 0;
      }
   }

   public void sendHeroInvalidMail(int heroId) {
      CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_HERO_INVALID);
      if (centreAwardModel == null) {
         this.logger.error("配置异常 未找到通知体验英雄过期邮件id:{}", CentreAwardModel.ID_HERO_INVALID);
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
         if (null == heroModel) {
            this.logger.error("配置异常 hero表未找到英雄heroId:{}", heroId);
         } else {
            String content = MessageFormat.format(centreAwardModel.getDesc(), heroModel.getName());
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), content, (List)null, 604800000L, 4, 457);
         }
      }
   }

   public boolean cancelLinkAfterHandle(HeroDao heroDao) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      if (!heroDao.getStateList().isEmpty() && !heroArrayingPart.heroLeaveArraying(heroDao.code, true, false)) {
         return false;
      } else {
         this.heroUndressReturnItem(false, Collections.singletonList(heroDao.code), true, HeroDefine.DelHeroType.UNDRESS_ALL, 4, 459, 0, 0, "");
         this.worldMgr.pushTask(() -> {
            Map<String, HeroSupportDao> heroSupportDaoMap = this.worldMgr.getGameCachePool().getAllTableByMap("tb_hero_support");

            for(HeroSupportDao.SupportModule supportModule : HeroSupportDao.SupportModule.values()) {
               HeroSupportDao heroSupportDao = (HeroSupportDao)heroSupportDaoMap.get(supportModule.module + "-" + this.player.getPlayerId() + "-");
               if (heroSupportDao != null && heroSupportDao.isAuto && heroSupportDao.heroSupport.code == heroDao.code) {
                  heroSupportDao.isAuto = false;
                  heroSupportDao.updateOp();
                  this.autoHeroSupport(supportModule.module, heroSupportDao.isAuto);
               }
            }

         });
         return true;
      }
   }

   private void checkHeroInvalidAndLinkState() {
      Map<Integer, HeroDao> heroDaoMap = new HashMap(this.getHeroDaoMap());
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      this.linkHeroDaoList.clear();

      for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         if (heroDao.invalidTime > 0 && heroDao.invalidTime <= curTime) {
            this.checkHeroInvalid(heroDao);
            if (heroDao.linkCode > 0) {
               HeroDao linkHeroDao = (HeroDao)heroDaoMap.get(heroDao.linkCode);
               if (linkHeroDao != null) {
                  linkHeroDao.beLinkCode = 0;
                  linkHeroDao.updateOp();
                  this.linkHeroDaoList.add(linkHeroDao);
               }
            } else if (heroDao.beLinkCode > 0) {
               HeroDao beLinkHeroDao = (HeroDao)heroDaoMap.get(heroDao.beLinkCode);
               if (beLinkHeroDao != null) {
                  beLinkHeroDao.linkCode = 0;
                  beLinkHeroDao.updateOp();
                  this.cancelLinkAfterHandle(beLinkHeroDao);
                  this.linkHeroDaoList.add(beLinkHeroDao);
               }
            }
         }
      }

      if (!this.linkHeroDaoList.isEmpty()) {
         this.sendHeroList2Client(this.linkHeroDaoList);
         this.linkHeroDaoList.clear();
      }
   }
}
