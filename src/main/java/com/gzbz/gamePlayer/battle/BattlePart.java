package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.util.ObjectUtil;
import com.gzbz.activity.part.ActGoldWeekPart;
import com.gzbz.activity.part.ActivityChineseNewYearPart;
import com.gzbz.activity.part.ActivityEventHeroPart;
import com.gzbz.activity.part.ActivityKrEventHeroPart;
import com.gzbz.activity.part.ActivityLiuBeiPart;
import com.gzbz.activity.part.ActivityMaChaoPart;
import com.gzbz.activity.part.ActivitySiMaYiPart;
import com.gzbz.activity.part.ActivityZhangFeiPart;
import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.activity.part.ArtifactActivityPart;
import com.gzbz.activity.part.ArtifactRotateActivityPart;
import com.gzbz.activity.part.ArtifactSkinActivityPart;
import com.gzbz.activity.part.DecisiveBattlePart;
import com.gzbz.activity.part.FlowerFireActivityPart;
import com.gzbz.activity.part.GuoQingActivityPart;
import com.gzbz.activity.part.HeroSkinActivityPart;
import com.gzbz.activity.part.HeroThemePart;
import com.gzbz.activity.part.SplendidCityPart;
import com.gzbz.alliance.part.AlliancePart;
import com.gzbz.battle.BattleArraying;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.WeaponEntity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.countryWar.CountryWarPart;
import com.gzbz.db.BattleDao;
import com.gzbz.db.BattleHeroTrainingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.demon.DemonActivityPart;
import com.gzbz.demonRotate.DemonRotatePart;
import com.gzbz.demonStrikes.DemonStrikesPart;
import com.gzbz.duel.DuelPart;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.levelPromote.LevelPromotePart;
import com.gzbz.gamePlayer.peak.PeakBattlePart;
import com.gzbz.gamePlayer.playerBag.HeroDressPart;
import com.gzbz.gamePlayer.pvp.PvpPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.megerWar.part.MergeWarBossPart;
import com.gzbz.mine.part.MinePart;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.BattleCondition;
import com.gzbz.model.BuffModel;
import com.gzbz.model.ErrorModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.PlotBattleModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.TongqueTerraceModel;
import com.gzbz.nineContinent.sevenBarbarian.SevenBarbarianPart;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.scan.GameServerScan;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.transport.part.WaterTransportPart;
import com.gzbz.union.part.UnionCopyPart;
import com.gzbz.union.part.UnionDailyGuessPart;
import com.gzbz.union.part.UnionWarPart;
import com.gzbz.unionOffer.OfferPart;
import com.gzbz.war.ancientSword.AncientSwordPart;
import com.gzbz.war.barbarian.BarbarianPart;
import com.gzbz.war.dragonwar.DragonWarPart;
import com.gzbz.war.hl.WarPart;
import com.gzbz.war.jingzhou.JingzhouWarPart;
import com.gzbz.war.north.WarNorthPart;
import com.gzbz.war.stonehenge.StonehengePart;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import debug.Debug;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Function;
import misc.CalculateUtil;
import misc.DateUtil;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BattlePart extends PlayerPart {
   private final WorldMgr worldMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private ScheduledFuture<?> autoBattleScheduled;
   private static final Set<Integer> HAS_FIGHTING_FLAG_BATTLE = new HashSet();

   public BattlePart(WorldMgr worldMgr) {
      this.worldMgr = worldMgr;
   }

   @MsgHandlerAnno
   public void C2S_BattleList_6113(BattleMsg.C2S_BattleList_6113 msg, String source) {
      for(BattleDao battleDao : this.getBattleDaoMap().values()) {
         if (battleDao.scene != null && battleDao.scene.getBattleMsg() != null) {
            BattleMsg.S2C_BattleResult_6102.Builder battleMsg = battleDao.scene.getBattleMsg();
            if (battleMsg.hasResult() && battleMsg.getResult().hasResult()) {
               battleMsg.setFlag(true);
               this.player.sendMsg(battleMsg.build());
            }
         }
      }

   }

   @MsgHandlerAnno
   public void begin(BattleMsg.C2S_BattleBegin_6107 msg, String source) {
      if (msg.getType() != 2090 && msg.getType() != 1990 && msg.getType() != 3005 && !this.player.isSystemOpen(msg.getType())) {
         this.player.failure(21);
      } else {
         int buffId = 0;
         if (msg.hasBuffId()) {
            buffId = msg.getBuffId();
         }

         BattleDao battleDao = this.getBattleDao(msg.getType());
         boolean needCreate = true;
         if (battleDao != null) {
            if (msg.getType() == 1250) {
               if (battleDao.status == 0) {
                  this.sendBattleResult(battleDao.type, true, 44);
                  return;
               }

               if (battleDao.status == 2) {
                  this.sendBattleResult(battleDao.type, true, 43);
                  return;
               }

               if (battleDao.stream != null && battleDao.stream.length > 0 && (battleDao.scene != null || this.initScene(battleDao) == 1) && battleDao.scene.getWave() != battleDao.scene.getTotalWave()) {
                  this.sendBattleResult(battleDao.type, true, 6);
                  return;
               }

               needCreate = false;
            } else if (msg.getType() == 5950) {
               this.logger.error("战斗-->{}进入【{}】第{}波战斗异常,原因:已存在该战斗,直接跳过", new Object[]{this.player.getPlayerId(), this.getBattleName(battleDao.type), battleDao.scene == null ? 0 : battleDao.scene.getWave()});
            } else {
               if (battleDao.stream != null && battleDao.stream.length > 0 && this.initScene(battleDao) == 1) {
                  this.logger.error("战斗-->{}进入【{}】第{}波战斗异常,原因:已存在该战斗,不处理", new Object[]{this.player.getPlayerId(), this.getBattleName(battleDao.type), battleDao.scene == null ? 0 : battleDao.scene.getWave()});
                  return;
               }

               if (msg.getType() == 1450) {
                  this.begin(battleDao);
                  return;
               }

               this.autoEnd(msg.getType());
            }
         } else if (msg.getType() == 1250) {
            BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
            if (!battleHeroTrainingPart.isInBattle()) {
               this.sendBattleResult(msg.getType(), true, 6);
               return;
            }
         }

         if (needCreate) {
            battleDao = new BattleDao();
            battleDao.playerId = this.player.getPlayerId();
            battleDao.type = msg.getType();
            this.player.insertDao(battleDao);
         }

         battleDao.needRecord = true;
         battleDao.modelId = msg.getModelId();
         battleDao.params.clear();
         if (msg.getParamsCount() > 0) {
            battleDao.params.addAll(msg.getParamsList());
         }

         battleDao.buffId = buffId;
         battleDao.isSkip = msg.hasIsSkip() && msg.getIsSkip();
         battleDao.needSendMsg = true;
         if (msg.hasBackground()) {
            battleDao.background = msg.getBackground();
         }

         try {
            battleDao.updateOp();
            this.begin(battleDao);
         } catch (Exception e) {
            this.logger.error("战斗-->{}进入【{}】第{}波战斗异常", new Object[]{this.player.getPlayerId(), this.getBattleName(battleDao.type), battleDao.scene == null ? 0 : battleDao.scene.getWave()});
            e.printStackTrace();
            this.sendBattleResult(battleDao.type, true, 0);
            return;
         }

         this.player.updateGuideStep(msg.getGuideStep());
      }
   }

   public void begin(BattleDao battleDao) {
      String battleName = this.getBattleName(battleDao.type);
      int result = this.initScene(battleDao);
      if (result != 1) {
         this.sendBattleResult(battleDao.type, true, result);
      } else {
         result = 0;
         switch (battleDao.type) {
            case 1014:
               PlotBattleModel plotBattleModel1 = (PlotBattleModel)ApplicationContextProvider.getModelPoolEntity("plotBattle", 1);
               PlotBattleModel plotBattleModel2 = (PlotBattleModel)ApplicationContextProvider.getModelPoolEntity("plotBattle", 2);
               BattlePKTeam leftPkTeam = new BattlePKTeam(plotBattleModel1);
               leftPkTeam.setBelongName(plotBattleModel1.getName());
               BattlePKTeam rightPkTeam = new BattlePKTeam(plotBattleModel2);
               rightPkTeam.setBelongName(plotBattleModel2.getName());
               battleDao.scene.addPKTeam(leftPkTeam, rightPkTeam);
               battleDao.scene.setMaxRound((byte)20);
               result = 1;
            case 1040:
            case 1270:
            default:
               break;
            case 1110:
               PvpPart pvpPart = (PvpPart)this.player.getMgrPart(PvpPart.class);
               result = pvpPart.beginBattle(battleDao);
               break;
            case 1130:
               BattleTowerPart battleTowerPart = (BattleTowerPart)this.player.getMgrPart(BattleTowerPart.class);
               result = battleTowerPart.enterBattle(battleDao);
               break;
            case 1240:
               BattleDailyPart battleDailyPart = (BattleDailyPart)this.player.getMgrPart(BattleDailyPart.class);
               result = battleDailyPart.enterBattle(battleDao);
               break;
            case 1250:
               BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
               result = battleHeroTrainingPart.beginTraining(battleDao);
               break;
            case 1260:
               BattleCutPart battleCutPart = (BattleCutPart)this.player.getMgrPart(BattleCutPart.class);
               result = battleCutPart.enterBattle(battleDao);
               break;
            case 1450:
               UnionWarPart unionWarPart = (UnionWarPart)this.player.getMgrPart(UnionWarPart.class);
               result = unionWarPart.enterBattle(battleDao);
               if (result == 1) {
                  return;
               }
               break;
            case 1470:
               UnionCopyPart unionCopyPart = (UnionCopyPart)this.player.getMgrPart(UnionCopyPart.class);
               result = unionCopyPart.enterBattle(battleDao);
               if (result == 1) {
                  return;
               }
               break;
            case 1491:
               UnionDailyGuessPart unionDailyGuessPart = (UnionDailyGuessPart)this.player.getMgrPart(UnionDailyGuessPart.class);
               result = unionDailyGuessPart.enterBattle(battleDao);
               break;
            case 1650:
               BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
               result = battleChapterPart.beginBattle(battleDao);
               break;
            case 1960:
               WarPart warPart = (WarPart)this.player.getMgrPart(WarPart.class);
               result = warPart.beginBattle(battleDao);
               break;
            case 1970:
               JingzhouWarPart jingzhouWarPart = (JingzhouWarPart)this.player.getMgrPart(JingzhouWarPart.class);
               result = jingzhouWarPart.enterBattle(battleDao);
               break;
            case 1980:
               BarbarianPart barbarianPart = (BarbarianPart)this.player.getMgrPart(BarbarianPart.class);
               result = barbarianPart.enterBattle(battleDao);
               break;
            case 1990:
               WarNorthPart warNorthPart = (WarNorthPart)this.player.getMgrPart(WarNorthPart.class);
               result = warNorthPart.enterBattle(battleDao);
               break;
            case 1991:
               WaterTransportPart waterTransportPart = (WaterTransportPart)this.player.getMgrPart(WaterTransportPart.class);
               result = waterTransportPart.enterBattle(battleDao);
               if (result == 1) {
                  this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
                  return;
               }
               break;
            case 2001:
               MinePart minePart = (MinePart)this.player.getMgrPart(MinePart.class);
               result = minePart.enterBattle(battleDao);
               if (result == 1) {
                  this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
                  return;
               }
               break;
            case 2020:
               CountryWarPart countryWarPart = (CountryWarPart)this.player.getMgrPart(CountryWarPart.class);
               countryWarPart.enterBattle(battleDao);
               this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
               return;
            case 2021:
               DemonStrikesPart demonStrikesPart = (DemonStrikesPart)this.player.getMgrPart(DemonStrikesPart.class);
               result = demonStrikesPart.enterBattle(battleDao);
               if (result == 1) {
                  this.logger.info("战斗-->{}请求进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
                  return;
               }
               break;
            case 2030:
               AlliancePart alliancePart = (AlliancePart)this.player.getMgrPart(AlliancePart.class);
               result = alliancePart.enterBattle(battleDao);
               if (result == 1) {
                  return;
               }
               break;
            case 2040:
               PeakBattlePart peakPart = (PeakBattlePart)this.player.getMgrPart(PeakBattlePart.class);
               result = peakPart.enterBattle(battleDao);
               this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
               break;
            case 2090:
               ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
               result = expeditionPart.enterBattle(battleDao);
               break;
            case 2130:
               TrailTowerPart trailTowerPart = (TrailTowerPart)this.player.getMgrPart(TrailTowerPart.class);
               result = trailTowerPart.enterBattle(battleDao);
               break;
            case 2410:
               SevenBarbarianPart sevenBarbarianPart = (SevenBarbarianPart)this.player.getMgrPart(SevenBarbarianPart.class);
               result = sevenBarbarianPart.enterBattle(battleDao);
               this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
               break;
            case 2880:
               UnderPalacePart underPalacePart = (UnderPalacePart)this.player.getMgrPart(UnderPalacePart.class);
               result = underPalacePart.enterBattle(battleDao);
               break;
            case 3004:
               HeroThemePart themePart = (HeroThemePart)this.player.getMgrPart(HeroThemePart.class);
               result = themePart.enterBattle(battleDao);
               break;
            case 3005:
               FairylandPart fairylandPart = (FairylandPart)this.player.getMgrPart(FairylandPart.class);
               result = fairylandPart.enterBattle(battleDao);
               break;
            case 3006:
               int leftBattleId = (Integer)battleDao.params.get(0);
               int rightBattleId = (Integer)battleDao.params.get(1);
               int round = (Integer)battleDao.params.get(2);
               BattlePKTeam leftTeam = new BattlePKTeam(leftBattleId);
               BattlePKTeam rightTeam = new BattlePKTeam(rightBattleId);
               if ((battleDao.modelId == 3031 || battleDao.modelId == 4413 || battleDao.modelId == 5213) && battleDao.params.size() == 7) {
                  int artifactId = (Integer)battleDao.params.get(3);
                  int skillId = (Integer)battleDao.params.get(4);
                  int level = (Integer)battleDao.params.get(5);
                  int skinId = (Integer)battleDao.params.get(6);
                  leftTeam.setWeaponEntity(new WeaponEntity(BattleMsg.EntityType.EntityType_Artifact, artifactId, skillId, level, skinId));
               }

               HeroDressPart dressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);

               for(Entity entity : leftTeam.getEntityMap().values()) {
                  entity.setActiveDressIds(dressPart.getActiveDressIdByHeroId(entity.getId(), true));
               }

               battleDao.scene.addPKTeam(leftTeam, rightTeam);
               battleDao.scene.setMaxRound((byte)round);
               result = 1;
               break;
            case 3026:
               HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
               result = heroSkinActivityPart.enterBattle(battleDao);
               break;
            case 3031:
               ArtifactActivityPart artifactActivityPart = (ArtifactActivityPart)this.player.getMgrPart(ArtifactActivityPart.class);
               result = artifactActivityPart.enterBattle(battleDao);
               break;
            case 3083:
               DemonActivityPart demonActivityPart = (DemonActivityPart)this.player.getMgrPart(DemonActivityPart.class);
               result = demonActivityPart.enterBattle(battleDao);
               break;
            case 3084:
               DemonActivityPart demonPart = (DemonActivityPart)this.player.getMgrPart(DemonActivityPart.class);
               result = demonPart.enterBossBattle(battleDao);
               break;
            case 3103:
               OfferPart offerPart = (OfferPart)this.player.getMgrPart(OfferPart.class);
               result = offerPart.enterBattle(battleDao);
               if (result == 1) {
                  this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
                  return;
               }
               break;
            case 3178:
               GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
               result = guoQingActivityPart.enterBattle(battleDao);
               break;
            case 3191:
               DuelPart duelPart = (DuelPart)this.player.getMgrPart(DuelPart.class);
               result = duelPart.enterChallengeBoss(battleDao);
               break;
            case 3281:
               DemonRotatePart demonRotatePart = (DemonRotatePart)this.player.getMgrPart(DemonRotatePart.class);
               result = demonRotatePart.enterBattle(battleDao);
               break;
            case 3282:
               DemonRotatePart boosRotatePart = (DemonRotatePart)this.player.getMgrPart(DemonRotatePart.class);
               result = boosRotatePart.enterBossBattle(battleDao);
               break;
            case 3653:
               FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)this.player.getMgrPart(FlowerFireActivityPart.class);
               result = flowerFireActivityPart.enterBattle(battleDao);
               break;
            case 3661:
               SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
               result = splendidCityPart.enterBattle(battleDao);
               break;
            case 3700:
               ActivityZhangFeiPart zhangFeiPart = (ActivityZhangFeiPart)this.player.getMgrPart(ActivityZhangFeiPart.class);
               result = zhangFeiPart.enterBattle(battleDao);
               break;
            case 3850:
               ActivitySiMaYiPart siMaYiPart = (ActivitySiMaYiPart)this.player.getMgrPart(ActivitySiMaYiPart.class);
               result = siMaYiPart.enterBattle(battleDao);
               break;
            case 3900:
               LevelPromotePart levelPromotePart = (LevelPromotePart)this.player.getMgrPart(LevelPromotePart.class);
               result = levelPromotePart.enterBattle(battleDao);
               break;
            case 4010:
               ActivityLiuBeiPart liuBeiPart = (ActivityLiuBeiPart)this.player.getMgrPart(ActivityLiuBeiPart.class);
               result = liuBeiPart.enterBattle(battleDao);
               break;
            case 4207:
               MergeWarBossPart mergeWarBossPart = (MergeWarBossPart)this.player.getMgrPart(MergeWarBossPart.class);
               result = mergeWarBossPart.enterBattle(battleDao);
               break;
            case 4413:
               ArtifactRotateActivityPart artifactRotateActivityPart = (ArtifactRotateActivityPart)this.player.getMgrPart(ArtifactRotateActivityPart.class);
               result = artifactRotateActivityPart.enterBattle(battleDao);
               break;
            case 4800:
               ActivityMaChaoPart maChaoPart = (ActivityMaChaoPart)this.player.getMgrPart(ActivityMaChaoPart.class);
               result = maChaoPart.enterBattle(battleDao);
               break;
            case 5010:
               DragonWarPart dragonWarPart = (DragonWarPart)this.player.getMgrPart(DragonWarPart.class);
               result = dragonWarPart.enterBattle(battleDao);
               break;
            case 5213:
               ArtifactSkinActivityPart artifactSkinActivityPart = (ArtifactSkinActivityPart)this.player.getMgrPart(ArtifactSkinActivityPart.class);
               result = artifactSkinActivityPart.enterBattle(battleDao);
               break;
            case 5300:
               ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
               result = eventHeroPart.enterBattle(battleDao);
               break;
            case 5950:
               DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)this.player.getMgrPart(DecisiveBattlePart.class);
               result = decisiveBattlePart.enterBattle(battleDao);
               if (result == 1) {
                  return;
               }
               break;
            case 6116:
               AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
               result = anniversaryCelebrationPart.enterBattle(battleDao);
               break;
            case 6305:
               ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
               result = chineseNewYearPart.enterBattle(battleDao);
               break;
            case 6310:
               StonehengePart stonehengePart = (StonehengePart)this.player.getMgrPart(StonehengePart.class);
               result = stonehengePart.enterBattle(battleDao);
               break;
            case 6435:
               ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
               result = actGoldWeekPart.enterBattle(battleDao);
               break;
            case 6620:
               AncientSwordPart ancientSwordPart = (AncientSwordPart)this.player.getMgrPart(AncientSwordPart.class);
               result = ancientSwordPart.enterBattle(battleDao);
               break;
            case 6700:
               ActivityKrEventHeroPart eventKrHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
               result = eventKrHeroPart.enterBattle(battleDao);
               break;
            case 6850:
               SupremePvpPart supremePvpPart = (SupremePvpPart)this.player.getMgrPart(SupremePvpPart.class);
               result = supremePvpPart.enterBattle(battleDao);
               if (result == 1) {
                  this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
                  return;
               }
         }

         if (result != 1) {
            this.sendBattleResult(battleDao.type, true, result);
         } else {
            this.beginBattle(battleDao);
         }
      }
   }

   public boolean beginBattle(BattleDao battleDao) {
      try {
         int result = this.fight(battleDao);
         if (result != 1) {
            this.sendBattleResult(battleDao.type, true, result);
            return false;
         }
      } catch (Exception e) {
         e.printStackTrace();
         this.sendBattleResult(battleDao.type, true, 0);
         return false;
      }

      if (battleDao.isSkip) {
         this.end(battleDao.type, false);
         return true;
      } else {
         if (battleDao.status == 2) {
            this.sendBattleResult(battleDao.type, true, 43);
         } else {
            this.sendBattleResult(battleDao.type, true, 1);
         }

         return true;
      }
   }

   @MsgHandlerAnno
   public void next(BattleMsg.C2S_BattleNext_6109 msg, String source) {
      BattleDao battleDao = this.getBattleDao(msg.getType());
      if (battleDao == null) {
         this.sendBattleResult(msg.getType(), false, 44);
      } else if (battleDao.status == 0 && battleDao.type != 2030) {
         this.sendBattleResult(battleDao.type, false, 44);
      } else if (battleDao.status == 2) {
         this.sendBattleResult(battleDao.type, false, 43);
      } else if (battleDao.scene.getWave() == battleDao.scene.getTotalWave()) {
         this.sendBattleResult(battleDao.type, false, 44);
      } else {
         battleDao.modelId = msg.getModelId();
         battleDao.needSendMsg = true;

         try {
            battleDao.updateOp();
            this.next(battleDao);
         } catch (Exception e) {
            this.logger.error("战斗-->{}进入【{}】下一场战斗,modelId:{},错误", new Object[]{this.player.getPlayerId(), this.getBattleName(battleDao.type), battleDao.modelId});
            e.printStackTrace();
            this.sendBattleResult(battleDao.type, false, 44);
         }

      }
   }

   private void next(BattleDao battleDao) {
      int result = this.initScene(battleDao);
      if (result != 1) {
         this.sendBattleResult(battleDao.type, false, result);
      } else {
         result = 0;
         switch (battleDao.type) {
            case 1250:
               BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
               result = battleHeroTrainingPart.nextTraining(battleDao);
               break;
            case 1980:
               BarbarianPart barbarianPart = (BarbarianPart)this.player.getMgrPart(BarbarianPart.class);
               result = barbarianPart.nextBattle(battleDao);
               break;
            case 1990:
               WarNorthPart warNorthPart = (WarNorthPart)this.player.getMgrPart(WarNorthPart.class);
               result = warNorthPart.nextBattle(battleDao);
               break;
            case 2030:
               AlliancePart alliancePart = (AlliancePart)this.player.getMgrPart(AlliancePart.class);
               alliancePart.nextBattle(battleDao);
               return;
            case 2130:
               TrailTowerPart trailTowerPart = (TrailTowerPart)this.player.getMgrPart(TrailTowerPart.class);
               result = trailTowerPart.nextBattle(battleDao);
               break;
            case 2880:
               UnderPalacePart underPalacePart = (UnderPalacePart)this.player.getMgrPart(UnderPalacePart.class);
               result = underPalacePart.nextBattle(battleDao);
               break;
            case 3004:
               HeroThemePart themePart = (HeroThemePart)this.player.getMgrPart(HeroThemePart.class);
               result = themePart.nextBattle(battleDao);
               break;
            case 3026:
               HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
               result = heroSkinActivityPart.nextBattle(battleDao);
               break;
            case 3700:
               ActivityZhangFeiPart zhangFeiPart = (ActivityZhangFeiPart)this.player.getMgrPart(ActivityZhangFeiPart.class);
               result = zhangFeiPart.nextBattle(battleDao);
               break;
            case 3850:
               ActivitySiMaYiPart siMaYiPart = (ActivitySiMaYiPart)this.player.getMgrPart(ActivitySiMaYiPart.class);
               result = siMaYiPart.nextBattle(battleDao);
               break;
            case 3900:
               LevelPromotePart levelPromotePart = (LevelPromotePart)this.player.getMgrPart(LevelPromotePart.class);
               result = levelPromotePart.enterBattle(battleDao);
               break;
            case 4010:
               ActivityLiuBeiPart liuBeiPart = (ActivityLiuBeiPart)this.player.getMgrPart(ActivityLiuBeiPart.class);
               result = liuBeiPart.nextBattle(battleDao);
               break;
            case 4207:
               MergeWarBossPart mergeWarBossPart = (MergeWarBossPart)this.player.getMgrPart(MergeWarBossPart.class);
               result = mergeWarBossPart.enterBattle(battleDao);
               break;
            case 4800:
               ActivityMaChaoPart maChaoPart = (ActivityMaChaoPart)this.player.getMgrPart(ActivityMaChaoPart.class);
               result = maChaoPart.nextBattle(battleDao);
               break;
            case 5010:
               DragonWarPart dragonWarPart = (DragonWarPart)this.player.getMgrPart(DragonWarPart.class);
               result = dragonWarPart.enterBattle(battleDao);
               break;
            case 5300:
               ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
               result = eventHeroPart.nextBattle(battleDao);
               break;
            case 5950:
               DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)this.player.getMgrPart(DecisiveBattlePart.class);
               decisiveBattlePart.enterBattle(battleDao);
               return;
            case 6310:
               StonehengePart stonehengePart = (StonehengePart)this.player.getMgrPart(StonehengePart.class);
               result = stonehengePart.nextBattle(battleDao);
               break;
            case 6700:
               ActivityKrEventHeroPart eventKrHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
               result = eventKrHeroPart.nextBattle(battleDao);
         }

         if (result != 1) {
            this.sendBattleResult(battleDao.type, false, result);
         } else {
            try {
               result = this.fight(battleDao);
               if (result != 1) {
                  this.sendBattleResult(battleDao.type, false, result);
                  return;
               }
            } catch (Exception e) {
               e.printStackTrace();
               this.sendBattleResult(battleDao.type, false, 0);
               return;
            }

            if (battleDao.status == 2) {
               this.sendBattleResult(battleDao.type, false, 43);
            } else {
               this.sendBattleResult(battleDao.type, false, 1);
            }

         }
      }
   }

   @MsgHandlerAnno
   public void end(BattleMsg.C2S_BattleEnd_6111 msg, String source) {
      this.end(msg.getType(), msg.hasForce() && msg.getForce());
   }

   @MsgHandlerAnno
   public void S2C_BattleResult_6102(BattleMsg.S2C_BattleResult_6102 msg, CrossSubscribeMsg crossSubscribeMsg) {
      BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
      BattleMsg.S2C_BattleResult_6102.Builder builder = msg.toBuilder();
      battleRecordMgr.addBattleRecord(msg.getSetId(), 0, this.player.getPlayerId(), msg.getTeams(1).getBeloogId(), builder);
      this.player.sendMsg(builder.build());
   }

   public void autoEnd(int type) {
      BattleDao battleDao = this.getBattleDao(type);
      if (battleDao != null) {
         battleDao.autoSettle = true;
      }

      this.end(type, true);
   }

   private void autoEnd(int type, int result) {
      this.autoEnd(type);
      BattleMsg.S2C_BattleBegin_6108.Builder resp = BattleMsg.S2C_BattleBegin_6108.newBuilder();
      resp.setType(type);
      resp.setResult(result);
      this.player.sendMsg(resp.build());
   }

   @TaskMethod
   public void sendBattleResult(int type, boolean beginOrNext, int result) {
      if (result != 1) {
         this.player.failure(result);
         BattleDao battleDao = this.getBattleDao(type);
         ErrorModel errorModel = (ErrorModel)ApplicationContextProvider.getModelPoolEntity("error", result);
         if (errorModel != null) {
            this.logger.error("战斗-->{}进入【{}】第{}波战斗,{},自动结算", new Object[]{this.player.getPlayerId(), this.getBattleName(type), battleDao != null && battleDao.scene != null ? battleDao.scene.getWave() : 0, errorModel.getHint()});
         } else {
            this.logger.error("战斗-->{}进入【{}】第{}波战斗,未知错误{},自动结算", new Object[]{this.player.getPlayerId(), this.getBattleName(type), battleDao != null && battleDao.scene != null ? battleDao.scene.getWave() : 0, result});
         }

         this.autoEnd(type);
      }

      if (beginOrNext) {
         BattleMsg.S2C_BattleBegin_6108.Builder resp = BattleMsg.S2C_BattleBegin_6108.newBuilder();
         resp.setType(type);
         resp.setResult(result);
         this.player.sendMsg(resp.build());
      } else {
         BattleMsg.S2C_BattleNext_6110.Builder resp = BattleMsg.S2C_BattleNext_6110.newBuilder();
         resp.setType(type);
         resp.setResult(result);
         this.player.sendMsg(resp.build());
      }

   }

   public void end(int type, boolean force) {
      BattleDao battleDao = this.getBattleDao(type);
      if (battleDao == null) {
         if (!HAS_FIGHTING_FLAG_BATTLE.contains(type)) {
            return;
         }
      } else {
         if ((battleDao.scene == null || battleDao.scene.getBattleMsg() == null) && !HAS_FIGHTING_FLAG_BATTLE.contains(type)) {
            this.player.deleteDao(battleDao, false);
            return;
         }

         if (!force && battleDao.status == 1) {
            this.logger.error("战斗-->{}结束【{}】战斗错误,战斗未结束", this.player.getPlayerId(), this.getBattleName(type));
            return;
         }
      }

      this.logger.info("战斗-->{}结束【{}】战斗", this.player.getPlayerId(), this.getBattleName(type));
      switch (type) {
         case 1040:
         case 1270:
         default:
            break;
         case 1110:
            PvpPart pvpPart = (PvpPart)this.player.getMgrPart(PvpPart.class);
            pvpPart.endBattle(battleDao);
            break;
         case 1130:
            BattleTowerPart battleTowerPart = (BattleTowerPart)this.player.getMgrPart(BattleTowerPart.class);
            battleTowerPart.endBattle(battleDao);
            break;
         case 1240:
            BattleDailyPart battleDailyPart = (BattleDailyPart)this.player.getMgrPart(BattleDailyPart.class);
            battleDailyPart.endBattle(battleDao);
            break;
         case 1250:
            BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
            battleHeroTrainingPart.endTraining(battleDao);
            break;
         case 1260:
            BattleCutPart battleCutPart = (BattleCutPart)this.player.getMgrPart(BattleCutPart.class);
            battleCutPart.endBattle(battleDao);
            break;
         case 1450:
            UnionWarPart unionWarPart = (UnionWarPart)this.player.getMgrPart(UnionWarPart.class);
            unionWarPart.endBattle(battleDao);
            break;
         case 1470:
            UnionCopyPart unionCopyPart = (UnionCopyPart)this.player.getMgrPart(UnionCopyPart.class);
            unionCopyPart.endBattle(battleDao);
            break;
         case 1650:
            BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
            battleChapterPart.endBattle(battleDao);
            break;
         case 1960:
            WarPart warPart = (WarPart)this.player.getMgrPart(WarPart.class);
            warPart.endBattle(battleDao);
            break;
         case 1970:
            JingzhouWarPart jingzhouWarPart = (JingzhouWarPart)this.player.getMgrPart(JingzhouWarPart.class);
            jingzhouWarPart.endBattle(battleDao);
            break;
         case 1980:
            BarbarianPart barbarianPart = (BarbarianPart)this.player.getMgrPart(BarbarianPart.class);
            barbarianPart.endBattle(battleDao);
            break;
         case 1990:
            WarNorthPart warNorthPart = (WarNorthPart)this.player.getMgrPart(WarNorthPart.class);
            warNorthPart.endBattle(battleDao);
            break;
         case 1991:
            WaterTransportPart waterTransportPart = (WaterTransportPart)this.player.getMgrPart(WaterTransportPart.class);
            waterTransportPart.endBattle(battleDao);
            break;
         case 2020:
            CountryWarPart countryWarPart = (CountryWarPart)this.player.getMgrPart(CountryWarPart.class);
            countryWarPart.endBattle(battleDao);
            break;
         case 2030:
            AlliancePart alliancePart = (AlliancePart)this.player.getMgrPart(AlliancePart.class);
            alliancePart.endBattle();
            break;
         case 2040:
            PeakBattlePart peakBattlePart = (PeakBattlePart)this.player.getMgrPart(PeakBattlePart.class);
            peakBattlePart.endBattle(battleDao);
            break;
         case 2130:
            TrailTowerPart trailTowerPart = (TrailTowerPart)this.player.getMgrPart(TrailTowerPart.class);
            trailTowerPart.endBattle(battleDao);
            break;
         case 2880:
            UnderPalacePart underPalacePart = (UnderPalacePart)this.player.getMgrPart(UnderPalacePart.class);
            underPalacePart.endBattle(battleDao);
            break;
         case 3004:
            HeroThemePart themePart = (HeroThemePart)this.player.getMgrPart(HeroThemePart.class);
            themePart.endBattle(battleDao);
            break;
         case 3005:
            FairylandPart fairylandPart = (FairylandPart)this.player.getMgrPart(FairylandPart.class);
            fairylandPart.endBattle(battleDao);
            break;
         case 3026:
            HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
            heroSkinActivityPart.endBattle(battleDao);
            break;
         case 3031:
            ArtifactActivityPart artifactActivityPart = (ArtifactActivityPart)this.player.getMgrPart(ArtifactActivityPart.class);
            artifactActivityPart.endBattle(battleDao);
            break;
         case 3083:
            DemonActivityPart demonActivityPart = (DemonActivityPart)this.player.getMgrPart(DemonActivityPart.class);
            demonActivityPart.endBattle(battleDao);
            break;
         case 3084:
            DemonActivityPart demonPart = (DemonActivityPart)this.player.getMgrPart(DemonActivityPart.class);
            demonPart.endBossBattle(battleDao);
            break;
         case 3103:
            OfferPart offerPart = (OfferPart)this.player.getMgrPart(OfferPart.class);
            offerPart.endBattle(battleDao);
            break;
         case 3178:
            GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
            guoQingActivityPart.endBattle(battleDao);
            break;
         case 3191:
            DuelPart duelPart = (DuelPart)this.player.getMgrPart(DuelPart.class);
            duelPart.endChallengeBoss(battleDao);
            break;
         case 3281:
            DemonRotatePart demonRotatePart = (DemonRotatePart)this.player.getMgrPart(DemonRotatePart.class);
            demonRotatePart.endBattle(battleDao);
            break;
         case 3282:
            DemonRotatePart bossRotatePart = (DemonRotatePart)this.player.getMgrPart(DemonRotatePart.class);
            bossRotatePart.endBossBattle(battleDao);
            break;
         case 3653:
            FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)this.player.getMgrPart(FlowerFireActivityPart.class);
            flowerFireActivityPart.endBattle(battleDao);
            break;
         case 3661:
            SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
            splendidCityPart.endBattle(battleDao);
            break;
         case 3700:
            ActivityZhangFeiPart zhangFeiPart = (ActivityZhangFeiPart)this.player.getMgrPart(ActivityZhangFeiPart.class);
            zhangFeiPart.endBattle(battleDao);
            break;
         case 3850:
            ActivitySiMaYiPart siMaYiPart = (ActivitySiMaYiPart)this.player.getMgrPart(ActivitySiMaYiPart.class);
            siMaYiPart.endBattle(battleDao);
            break;
         case 3900:
            LevelPromotePart levelPromotePart = (LevelPromotePart)this.player.getMgrPart(LevelPromotePart.class);
            levelPromotePart.endBattle(battleDao);
            break;
         case 4010:
            ActivityLiuBeiPart liuBeiPart = (ActivityLiuBeiPart)this.player.getMgrPart(ActivityLiuBeiPart.class);
            liuBeiPart.endBattle(battleDao);
         case 4207:
            MergeWarBossPart mergeWarBossPart = (MergeWarBossPart)this.player.getMgrPart(MergeWarBossPart.class);
            mergeWarBossPart.endBattle(battleDao);
            break;
         case 4413:
            ArtifactRotateActivityPart artifactRotateActivityPart = (ArtifactRotateActivityPart)this.player.getMgrPart(ArtifactRotateActivityPart.class);
            artifactRotateActivityPart.endBattle(battleDao);
            break;
         case 4800:
            ActivityMaChaoPart maChaoPart = (ActivityMaChaoPart)this.player.getMgrPart(ActivityMaChaoPart.class);
            maChaoPart.endBattle(battleDao);
            break;
         case 5010:
            DragonWarPart dragonWarPart = (DragonWarPart)this.player.getMgrPart(DragonWarPart.class);
            dragonWarPart.endBattle(battleDao);
            break;
         case 5213:
            ArtifactSkinActivityPart artifactSkinActivityPart = (ArtifactSkinActivityPart)this.player.getMgrPart(ArtifactSkinActivityPart.class);
            artifactSkinActivityPart.endBattle(battleDao);
            break;
         case 5300:
            ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
            eventHeroPart.endBattle(battleDao);
            break;
         case 5950:
            DecisiveBattlePart decisiveBattlePart = (DecisiveBattlePart)this.player.getMgrPart(DecisiveBattlePart.class);
            decisiveBattlePart.endBattle(battleDao);
            break;
         case 6116:
            AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
            anniversaryCelebrationPart.endBattle(battleDao);
            break;
         case 6305:
            ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
            chineseNewYearPart.endBattle(battleDao);
            break;
         case 6435:
            ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
            actGoldWeekPart.endBattle(battleDao);
            break;
         case 6700:
            ActivityKrEventHeroPart eventKrHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
            eventKrHeroPart.endBattle(battleDao);
            break;
         case 6850:
            SupremePvpPart supremePvpPart = (SupremePvpPart)this.player.getMgrPart(SupremePvpPart.class);
            supremePvpPart.endBattle(battleDao);
      }

      if (battleDao != null) {
         this.triggerBattleTask(battleDao);
         this.player.deleteDao(battleDao, false);
      }

   }

   private void triggerBattleTask(BattleDao battleDao) {
      try {
         if (battleDao.type != 3006) {
            this.player.triggerTask(309, 0, battleDao.scene.getForceRecordValue((byte)1, 17304), 0);
            this.player.triggerTask(310, 0, battleDao.scene.getForceRecordValue((byte)1, 17303), 0);
            this.player.triggerTask(311, 0, battleDao.scene.getForceRecordValue((byte)1, 3), 0);
         }

         if (battleDao.scene != null && battleDao.scene.getBattleMsg() != null && battleDao.scene.getWinForce() == 0) {
            long rightPower = battleDao.scene.getBattleMsg().getTeams(1).getCombatPower();
            long leftMaxPower = this.player.getMaxPlayerCombatPower();
            if (leftMaxPower < rightPower && (battleDao.type == 1110 || battleDao.type == 2040 || battleDao.type == 1450 || battleDao.type == 1991 || battleDao.type == 2020 || battleDao.type == 2001)) {
               this.player.triggerTask(614, CalculateUtil.calPercent(rightPower - leftMaxPower, leftMaxPower), 1L, 3);
            }
         }
      } catch (Exception e) {
         this.logger.error("玩家【{}】触发战斗任务失败,【{}】", new Object[]{this.player.getPlayerId(), e.getMessage(), e});
      }

   }

   public void removeBattle(int type) {
      BattleDao battleDao = this.getBattleDao(type);
      if (battleDao != null) {
         this.player.deleteDao(battleDao, false);
      }

   }

   private void recordBattle(int win, int type, int chapterId, BattleDao battleDao) {
      boolean isNeedRecord = true;
      switch (type) {
         case 1250:
         case 3004:
         case 3700:
         case 3850:
         case 4010:
         case 4800:
         case 5300:
         case 6700:
            isNeedRecord = false;
         default:
            if (isNeedRecord) {
               int defPlayerId = battleDao.scene.getBattleMsg().getTeams(1).getBeloogId();
               BattleRecordMgr battleRecordMgr = (BattleRecordMgr)ApplicationContextProvider.getContext().getBean(BattleRecordMgr.class);
               battleRecordMgr.addBattleRecord(type, chapterId, this.player.getPlayerId(), defPlayerId, battleDao.scene.getBattleMsg());
            }

      }
   }

   private int fight(BattleDao battleDao) {
      if (battleDao.scene.getBattleMsg() != null && battleDao.scene.getBattleMsg().getResult().getResult() == 1 && battleDao.type != 3900 && battleDao.type != 4207 && battleDao.type != 5010 && battleDao.type != 6310) {
         return 45;
      } else {
         battleDao.scene.getPKTeam((byte)0).setBuffId(battleDao.buffId);
         battleDao.scene.fight();
         battleDao.totalTime += (long)battleDao.scene.getCostTime();
         String battleName = this.getBattleName(battleDao.type);
         if (battleDao.needSendMsg) {
            this.logger.info("战斗-->{}进入【{}】第{}波战斗,配置ID:{},战斗ID:{}", new Object[]{this.player.getPlayerId(), battleName, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
         }

         if (battleDao.scene.getWinForce() == 0) {
            if (battleDao.scene.getWave() == 0) {
               battleDao.status = 0;
            } else {
               BattlePKTeam leftTeam = battleDao.scene.getPKTeam((byte)0);
               battleDao.leftTeam = ObjectUtil.serialize(leftTeam);
            }
         } else if ((battleDao.type != 3004 && battleDao.type != 3026 && battleDao.type != 3700 && battleDao.type != 3850 && battleDao.type != 4010 && battleDao.type != 4800 && battleDao.type != 1980 && battleDao.type != 5300 && battleDao.type != 6700 && battleDao.type != 6310 || battleDao.scene.getWave() != 1) && battleDao.type != 3900 && battleDao.type != 4207 && battleDao.type != 5010) {
            battleDao.status = 0;
         }

         battleDao.scene.getBattleMsg().setIsSkip(battleDao.isSkip);
         battleDao.scene.getBattleMsg().setBackground(battleDao.background);
         battleDao.scene.getBattleMsg().setIsEnd(battleDao.status != 1);
         this.recordBattle(battleDao.scene.getWinForce(), battleDao.type, battleDao.modelId, battleDao);
         int result = this.afterFight(battleDao);
         if (result != 1) {
            battleDao.updateOp();
            return result;
         } else {
            battleDao.stream = battleDao.scene.getBattleMsg().build().toByteArray();
            if (battleDao.needSendMsg) {
               this.player.sendMsg(battleDao.scene.getBattleMsg().build());
               printTextOfBattleMsg(battleDao.scene.getBattleMsg());
            }

            battleDao.updateOp();
            return 1;
         }
      }
   }

   private int afterFight(BattleDao battleDao) {
      int result = 1;
      switch (battleDao.type) {
         case 1040:
         case 1270:
         default:
            break;
         case 1110:
            PvpPart pvpPart = (PvpPart)this.player.getMgrPart(PvpPart.class);
            pvpPart.afterFight(battleDao);
            break;
         case 1130:
            BattleTowerPart battleTowerPart = (BattleTowerPart)this.player.getMgrPart(BattleTowerPart.class);
            battleTowerPart.afterFight(battleDao);
            break;
         case 1240:
            BattleDailyPart battleDailyPart = (BattleDailyPart)this.player.getMgrPart(BattleDailyPart.class);
            battleDailyPart.afterFight(battleDao);
            break;
         case 1250:
            BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
            battleHeroTrainingPart.trainingFight(battleDao);
            break;
         case 1260:
            BattleCutPart battleCutPart = (BattleCutPart)this.player.getMgrPart(BattleCutPart.class);
            battleCutPart.afterFight(battleDao);
            break;
         case 1470:
            UnionCopyPart unionCopyPart = (UnionCopyPart)this.player.getMgrPart(UnionCopyPart.class);
            result = unionCopyPart.afterFight(battleDao);
            break;
         case 1491:
            UnionDailyGuessPart unionDailyGuessPart = (UnionDailyGuessPart)this.player.getMgrPart(UnionDailyGuessPart.class);
            unionDailyGuessPart.afterFight(battleDao);
            break;
         case 1650:
            BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
            battleChapterPart.afterFight(battleDao);
            break;
         case 1960:
            WarPart warPart = (WarPart)this.player.getMgrPart(WarPart.class);
            warPart.afterFight(battleDao);
            break;
         case 1970:
            JingzhouWarPart jingzhouWarPart = (JingzhouWarPart)this.player.getMgrPart(JingzhouWarPart.class);
            jingzhouWarPart.afterFight(battleDao);
            break;
         case 1980:
            BarbarianPart barbarianPart = (BarbarianPart)this.player.getMgrPart(BarbarianPart.class);
            barbarianPart.afterFight(battleDao);
            break;
         case 1990:
            WarNorthPart warNorthPart = (WarNorthPart)this.player.getMgrPart(WarNorthPart.class);
            warNorthPart.afterFight(battleDao);
            break;
         case 2020:
            CountryWarPart countryWarPart = (CountryWarPart)this.player.getMgrPart(CountryWarPart.class);
            countryWarPart.afterFight();
            break;
         case 2040:
            PeakBattlePart peakBattlePart = (PeakBattlePart)this.player.getMgrPart(PeakBattlePart.class);
            peakBattlePart.afterFight(battleDao);
            break;
         case 2090:
            ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
            expeditionPart.afterFight(battleDao);
            break;
         case 2130:
            TrailTowerPart trailTowerPart = (TrailTowerPart)this.player.getMgrPart(TrailTowerPart.class);
            trailTowerPart.afterFight(battleDao);
            break;
         case 2410:
            SevenBarbarianPart sevenBarbarianPart = (SevenBarbarianPart)this.player.getMgrPart(SevenBarbarianPart.class);
            sevenBarbarianPart.afterFight(battleDao);
            break;
         case 2880:
            UnderPalacePart underPalacePart = (UnderPalacePart)this.player.getMgrPart(UnderPalacePart.class);
            underPalacePart.afterFight(battleDao);
            break;
         case 3004:
            HeroThemePart themePart = (HeroThemePart)this.player.getMgrPart(HeroThemePart.class);
            themePart.afterFight(battleDao);
            break;
         case 3005:
            FairylandPart fairylandPart = (FairylandPart)this.player.getMgrPart(FairylandPart.class);
            fairylandPart.afterFight(battleDao);
            break;
         case 3026:
            HeroSkinActivityPart heroSkinActivityPart = (HeroSkinActivityPart)this.player.getMgrPart(HeroSkinActivityPart.class);
            heroSkinActivityPart.afterFight(battleDao);
            break;
         case 3031:
            ArtifactActivityPart artifactActivityPart = (ArtifactActivityPart)this.player.getMgrPart(ArtifactActivityPart.class);
            artifactActivityPart.afterFight(battleDao);
            break;
         case 3083:
            DemonActivityPart demonActivityPart = (DemonActivityPart)this.player.getMgrPart(DemonActivityPart.class);
            demonActivityPart.afterFight(battleDao);
            break;
         case 3084:
            DemonActivityPart demonPart = (DemonActivityPart)this.player.getMgrPart(DemonActivityPart.class);
            demonPart.afterBossFight(battleDao);
            break;
         case 3178:
            GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
            guoQingActivityPart.afterBattle(battleDao);
            break;
         case 3191:
            DuelPart duelPart = (DuelPart)this.player.getMgrPart(DuelPart.class);
            duelPart.afterChallengeBoss(battleDao);
            break;
         case 3281:
            DemonRotatePart demonRotatePart = (DemonRotatePart)this.player.getMgrPart(DemonRotatePart.class);
            demonRotatePart.afterFight(battleDao);
            break;
         case 3282:
            DemonRotatePart bossRotatePart = (DemonRotatePart)this.player.getMgrPart(DemonRotatePart.class);
            bossRotatePart.afterBossFight(battleDao);
            break;
         case 3653:
            FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)this.player.getMgrPart(FlowerFireActivityPart.class);
            flowerFireActivityPart.afterFight(battleDao);
            break;
         case 3661:
            SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
            splendidCityPart.afterBattle(battleDao);
            break;
         case 3700:
            ActivityZhangFeiPart zhangFeiPart = (ActivityZhangFeiPart)this.player.getMgrPart(ActivityZhangFeiPart.class);
            zhangFeiPart.afterFight(battleDao);
            break;
         case 3850:
            ActivitySiMaYiPart siMaYiPart = (ActivitySiMaYiPart)this.player.getMgrPart(ActivitySiMaYiPart.class);
            siMaYiPart.afterFight(battleDao);
            break;
         case 3900:
            LevelPromotePart levelPromotePart = (LevelPromotePart)this.player.getMgrPart(LevelPromotePart.class);
            levelPromotePart.afterFight(battleDao);
            break;
         case 4010:
            ActivityLiuBeiPart liuBeiPart = (ActivityLiuBeiPart)this.player.getMgrPart(ActivityLiuBeiPart.class);
            liuBeiPart.afterFight(battleDao);
            break;
         case 4207:
            MergeWarBossPart mergeWarBossPart = (MergeWarBossPart)this.player.getMgrPart(MergeWarBossPart.class);
            mergeWarBossPart.afterFight(battleDao);
            break;
         case 4413:
            ArtifactRotateActivityPart artifactRotateActivityPart = (ArtifactRotateActivityPart)this.player.getMgrPart(ArtifactRotateActivityPart.class);
            artifactRotateActivityPart.afterFight(battleDao);
            break;
         case 4800:
            ActivityMaChaoPart maChaoPart = (ActivityMaChaoPart)this.player.getMgrPart(ActivityMaChaoPart.class);
            maChaoPart.afterFight(battleDao);
            break;
         case 5010:
            DragonWarPart dragonWarPart = (DragonWarPart)this.player.getMgrPart(DragonWarPart.class);
            dragonWarPart.afterFight(battleDao);
            break;
         case 5213:
            ArtifactSkinActivityPart artifactSkinActivityPart = (ArtifactSkinActivityPart)this.player.getMgrPart(ArtifactSkinActivityPart.class);
            artifactSkinActivityPart.afterFight(battleDao);
            break;
         case 5300:
            ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
            eventHeroPart.afterFight(battleDao);
            break;
         case 6116:
            AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
            anniversaryCelebrationPart.afterBattle(battleDao);
            break;
         case 6305:
            ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
            chineseNewYearPart.afterBattle(battleDao);
            break;
         case 6310:
            StonehengePart stonehengePart = (StonehengePart)this.player.getMgrPart(StonehengePart.class);
            stonehengePart.afterBattle(battleDao);
            break;
         case 6435:
            ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
            actGoldWeekPart.afterBattle(battleDao);
            break;
         case 6620:
            AncientSwordPart ancientSwordPart = (AncientSwordPart)this.player.getMgrPart(AncientSwordPart.class);
            ancientSwordPart.afterBattle(battleDao);
            break;
         case 6700:
            ActivityKrEventHeroPart eventKrHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
            eventKrHeroPart.afterFight(battleDao);
      }

      return result;
   }

   private int initScene(BattleDao battleDao) {
      if (battleDao.scene == null) {
         BattlePKTeam leftTeam = null;
         BattleScene scene;
         if (battleDao.stream != null && battleDao.stream.length > 0) {
            try {
               scene = new BattleScene(BattleMsg.S2C_BattleResult_6102.parseFrom(battleDao.stream));
               if (battleDao.leftTeam != null && battleDao.leftTeam.length > 0) {
                  leftTeam = (BattlePKTeam)ObjectUtil.deserialize(battleDao.leftTeam);
               }
            } catch (Exception e) {
               this.logger.warn("还原战斗失败,{}", e.getMessage());
               return 0;
            }
         } else {
            scene = new BattleScene(battleDao.type, battleDao.modelId);
            scene.setWave((short)0, (short)1);
            if (battleDao.type == 3006 || battleDao.type == 1014 || battleDao.type == 1960 || battleDao.type == 2040 || battleDao.type == 3004 || battleDao.type == 1260 || battleDao.type == 3026 || battleDao.type == 3700 || battleDao.type == 1980 || battleDao.type == 3900 || battleDao.type == 3850 || battleDao.type == 4010 || battleDao.type == 4800 || battleDao.type == 4207 || battleDao.type == 5010 || battleDao.type == 5300 || battleDao.type == 6700 || battleDao.type == 5950 || battleDao.type == 6310 || battleDao.type == 6620 || battleDao.type == 2880) {
               battleDao.scene = scene;
               return 1;
            }

            CommonMsg.HeroState arrayingType = null;

            for(BattleArraying battleArraying : BattleArraying.values()) {
               if (battleArraying.getType() == battleDao.type) {
                  arrayingType = battleArraying.getArrayingType();
                  break;
               }
            }

            if (arrayingType == null) {
               this.logger.error("战斗【{}】找不到对应阵型", this.getBattleName(battleDao.type));
               return 0;
            }

            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(arrayingType);
            if (arrayingMirror == null) {
               this.logger.error("战斗【{}】对应阵型数据为空", this.getBattleName(battleDao.type));
               return 4125;
            }

            PlayerDao playerDao = this.player.getPlayerDao();
            leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
         }

         if (leftTeam == null) {
            this.logger.error("{}战斗队伍创建失败", this.player.getPlayerId());
            return 0;
         }

         scene.addPKTeam((byte)0, leftTeam);
         battleDao.scene = scene;
      }

      return 1;
   }

   public BattleDao getBattleDao(int type) {
      return (BattleDao)this.getBattleDaoMap().get(type);
   }

   public Map<Integer, BattleDao> getBattleDaoMap() {
      return this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
   }

   public void loginHandle() {
      int maxWave = ApplicationContextProvider.getConfigInt("BHTBackstageNum", 50);
      this.cancelBattleJob();
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());

      for(BattleDao battleDao : this.getBattleDaoMap().values()) {
         if (battleDao.stream != null && battleDao.stream.length > 0) {
            if (this.initScene(battleDao) != 1) {
               this.player.deleteDao(battleDao, false);
            } else {
               String battleName = this.getBattleName(battleDao.type);
               if (battleDao.autoBattleWave >= maxWave) {
                  this.logger.info("战斗-->{}【{}】后台自动战斗波次已达最大{},自动结算", new Object[]{this.player.getPlayerId(), battleName, maxWave});
                  this.autoEnd(battleDao.type, 44);
               } else if (battleDao.status == 1) {
                  this.loginSend(battleDao);
               } else {
                  int passTime = curTime - (battleDao.scene.getBattleMsg().getStartTime() + battleDao.scene.getBattleMsg().getCostTime());
                  if (passTime < 0) {
                     this.loginSend(battleDao);
                  } else if (battleDao.status == 2) {
                     this.logger.info("战斗-->{}【{}】已全部通关且战斗播放时间过期,自动结算", this.player.getPlayerId(), battleName);
                     this.autoEnd(battleDao.type, 43);
                  } else {
                     this.logger.info("战斗-->{}【{}】战斗播放时间过期,自动结算", this.player.getPlayerId(), battleName);
                     this.autoEnd(battleDao.type, 44);
                  }
               }
            }
         } else {
            this.player.deleteDao(battleDao, false);
         }
      }

   }

   private void loginSend(BattleDao battleDao) {
      battleDao.needSendMsg = true;
      BattleMsg.S2C_BattleResult_6102.Builder battleMsg = battleDao.scene.getBattleMsg();
      if (battleDao.scene != null && battleMsg != null) {
         battleMsg.setFlag(true);
         this.player.sendMsg(battleMsg.build());
      }
   }

   public void logoutHandle() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      int heroTrainingMaxWave = ApplicationContextProvider.getConfigInt("BHTBackstageNum", 50);
      Set<Integer> autoBattles = new HashSet();

      for(BattleDao battleDao : this.getBattleDaoMap().values()) {
         if (battleDao.status == 1 && (battleDao.type != 1250 || battleDao.autoBattleWave < heroTrainingMaxWave)) {
            autoBattles.add(battleDao.type);
         }
      }

      if (!autoBattles.isEmpty()) {
         worldMgrPushTaskPart.pushTaskEx("addAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_AUTO_BATTLE, this.player.getPlayerId()});
      } else {
         worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_AUTO_BATTLE, this.player.getPlayerId()});
      }

      if (!autoBattles.contains(1250)) {
         if (this.player.isSystemOpen(1250)) {
            BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
            BattleHeroTrainingDao battleHeroTrainingDao = battleHeroTrainingPart.getBattleHeroTrainingDao();
            if (battleHeroTrainingDao.battleRound == 0 && battleHeroTrainingDao.randomBuffTime > 0) {
               worldMgrPushTaskPart.pushTaskEx("addAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE, this.player.getPlayerId()});
            } else {
               worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE, this.player.getPlayerId()});
            }
         }
      } else {
         worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE, this.player.getPlayerId()});
      }

      worldMgrPushTaskPart.pushTaskEx("checkAutoBattle", new Object[]{this.player});
   }

   @TaskMethod
   public void autoBattleJob() {
      if (this.autoBattleScheduled == null) {
         this.autoBattleScheduled = this.scheduleEx((long)RandomUtil.randInt(60000, 120000), "autoBattle", new Object[0]);
      }
   }

   @TaskMethod
   public void autoBattle() {
      if (this.autoBattleScheduled != null) {
         Map<Integer, BattleDao> battleDaoMap = this.getBattleDaoMap();
         WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
         worldMgrPushTaskPart.pushTaskEx("worldPushAutoBattle", new Object[]{battleDaoMap, this.player});
      }
   }

   private void cancelBattleJob() {
      if (this.autoBattleScheduled != null) {
         this.autoBattleScheduled.cancel(false);
         this.autoBattleScheduled = null;
      }
   }

   @TaskMethod
   public void autoBattleHandle() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      int heroTrainingMaxWave = ApplicationContextProvider.getConfigInt("BHTBackstageNum", 50);
      int currentTime = DateUtil.getIntTime(System.currentTimeMillis());
      List<BattleDao> battleDaoList = new ArrayList();

      for(BattleDao battleDao : this.getBattleDaoMap().values()) {
         if (battleDao.status == 1 && (battleDao.type != 1250 || battleDao.autoBattleWave < heroTrainingMaxWave)) {
            battleDaoList.add(battleDao);
         }
      }

      Iterator<BattleDao> iterator = battleDaoList.iterator();

      while(iterator.hasNext()) {
         BattleDao battleDao = (BattleDao)iterator.next();
         if (battleDao.stream != null && battleDao.stream.length > 0 && this.initScene(battleDao) == 1) {
            String battleName = this.getBattleName(battleDao.type);

            try {
               int passTime = currentTime - (battleDao.scene.getBattleMsg().getStartTime() + battleDao.scene.getBattleMsg().getCostTime());
               if (passTime > 0) {
                  battleDao.needSendMsg = false;
                  battleDao.isSkip = false;
                  short currentWave = battleDao.scene.getWave();
                  if (currentWave == 5) {
                     if (battleDao.type == 1250) {
                        BattleHeroTrainingDao battleHeroTrainingDao = (BattleHeroTrainingDao)this.player.getData("tb_battle_hero_training", this.player.getPlayerId());
                        int buffTime = battleHeroTrainingDao.randomBuffTime - currentTime;
                        if (buffTime > 0) {
                           continue;
                        }

                        battleDao.totalTime += (long)buffTime;
                        this.begin(battleDao);
                     } else {
                        this.next(battleDao);
                     }
                  } else {
                     this.next(battleDao);
                  }

                  this.logger.info("战斗-->{}后台自动进入【{}】第{}波战斗,配置ID:{},战斗ID:{},当前自动打第{}波", new Object[]{this.player.getPlayerId(), "血战长坂", battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId(), battleDao.autoBattleWave + 1});
                  ++battleDao.autoBattleWave;
                  battleDao.updateOp();
                  if (battleDao.type == 1250 && battleDao.autoBattleWave >= heroTrainingMaxWave) {
                     this.logger.info("战斗-->{}服务器自动【{}】战斗已达最大波数{},停止自动战斗", new Object[]{this.player.getPlayerId(), battleName, heroTrainingMaxWave});
                     iterator.remove();
                     continue;
                  }

                  if (battleDao.status != 1) {
                     this.logger.info("战斗-->{}服务器自动【{}】战斗,战斗已结束", this.player.getPlayerId(), battleName);
                     iterator.remove();
                     continue;
                  }
               }

               if (battleDao.scene.getBattleMsg() == null || !battleDao.scene.getBattleMsg().hasResult() || !battleDao.scene.getBattleMsg().getResult().hasResult()) {
                  this.autoEnd(battleDao.type);
                  iterator.remove();
                  this.logger.error("战斗-->{}服务器自动【{}】战斗处理移除,移除战斗,无效的战斗,", this.player.getPlayerId(), battleName);
               }
            } catch (Exception e) {
               this.autoEnd(battleDao.type);
               iterator.remove();
               this.logger.error("战斗-->{}服务器自动【{}】战斗处理移除,移除战斗,错误信息:{},", new Object[]{this.player.getPlayerId(), battleName, e.getMessage(), e});
            }
         } else {
            this.player.deleteDao(battleDao, false);
            iterator.remove();
         }
      }

      this.cancelBattleJob();
      if (battleDaoList.isEmpty()) {
         worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_AUTO_BATTLE, this.player.getPlayerId()});
      }

      worldMgrPushTaskPart.pushTaskEx("checkAutoBattle", new Object[]{this.player});
   }

   @TaskMethod
   public void checkCreateHeroTrainingBattle() {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      BattleHeroTrainingDao battleHeroTrainingDao = (BattleHeroTrainingDao)this.player.getData("tb_battle_hero_training", this.player.getPlayerId());
      if (battleHeroTrainingDao.battleRound == 0 && battleHeroTrainingDao.randomBuffTime > 0) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         if (battleHeroTrainingDao.randomBuffTime + 3600 < curTime) {
            this.autoEnd(1250);
            worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE, this.player.getPlayerId()});
         } else if (battleHeroTrainingDao.randomBuffTime <= curTime) {
            BattleDao battleDao = new BattleDao();
            battleDao.playerId = this.player.getPlayerId();
            battleDao.type = 1250;
            battleDao.needRecord = true;
            battleDao.modelId = battleHeroTrainingDao.startTier;
            battleDao.params.add(Integer.valueOf(battleHeroTrainingDao.friendPos));
            battleDao.buffId = 0;
            battleDao.needSendMsg = false;
            this.player.insertDao(battleDao);
            this.begin(battleDao);
            this.logger.info("战斗-->{}buff选择时间到,后台自动进入【{}】第{}波战斗,配置ID:{},战斗ID:{},当前自动打第{}波", new Object[]{this.player.getPlayerId(), "血战长坂", battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId(), battleDao.autoBattleWave + 1});
            ++battleDao.autoBattleWave;
            battleDao.updateOp();
            worldMgrPushTaskPart.pushTaskEx("addAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_AUTO_BATTLE, this.player.getPlayerId()});
            worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE, this.player.getPlayerId()});
         }
      } else {
         worldMgrPushTaskPart.pushTaskEx("removeAutoBattle", new Object[]{GameDefine.WorldModule.WORLD_DAO_HERO_TRAINING_ENTER_BATTLE, this.player.getPlayerId()});
      }

   }

   public List<Integer> satisfiedConditions(BattleDao battleDao, List<Integer> conditions) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      List<Integer> list = new ArrayList();
      if (battleDao != null && battleDao.scene != null && battleDao.scene.getBattleMsg() != null && conditions != null && !conditions.isEmpty()) {
         BattlePKTeam battlePKTeam = battleDao.scene.getPKTeam((byte)0);
         if (battlePKTeam == null) {
            return list;
         } else {
            Map<Byte, Entity> entityMap = battlePKTeam.getEntityMap();
            if (entityMap == null) {
               return list;
            } else {
               List<Entity> entityList = new ArrayList();

               for(Entity entity : entityMap.values()) {
                  if (entity.getOriginalPos() != BattleMisc.FRIEND_POS[0]) {
                     entityList.add(entity);
                  }
               }

               Entity friendEntity = battlePKTeam.getFriendEntity();
               if (friendEntity != null && friendEntity.getOriginalPos() == BattleMisc.FRIEND_POS[0]) {
                  friendEntity = null;
               }

               if (entityList.isEmpty() && friendEntity == null) {
                  return list;
               } else {
                  for(Integer condition : conditions) {
                     BattleCondition battleCondition = (BattleCondition)ApplicationContextProvider.getModelPoolEntity("battleCondition", condition);
                     switch (battleCondition.getType()) {
                        case 1:
                           if (battleDao.scene.getWinForce() != 0) {
                              list.clear();
                              return list;
                           }

                           list.add(condition);
                           break;
                        case 2:
                           long maxHp = 0L;
                           long curHp = 0L;

                           for(Entity entity : entityList) {
                              maxHp += entity.getBaseProperty(1);
                              curHp += entity.getBaseProperty(99);
                           }

                           if (friendEntity != null) {
                              maxHp += friendEntity.getBaseProperty(1);
                              curHp += friendEntity.getBaseProperty(99);
                           }

                           if ((float)curHp > (float)maxHp * ((float)battleCondition.getValue() / 10000.0F)) {
                              list.add(condition);
                           }
                           break;
                        case 3:
                           boolean allAlive = true;

                           for(Entity entity : entityList) {
                              if (entity.isDead()) {
                                 allAlive = false;
                                 break;
                              }
                           }

                           if (allAlive && (friendEntity == null || friendEntity.isAlive())) {
                              list.add(condition);
                           }
                           break;
                        case 4:
                           int deadCount = 0;

                           for(Entity entity : entityList) {
                              if (entity.isDead()) {
                                 ++deadCount;
                              }
                           }

                           if (friendEntity != null && friendEntity.isDead()) {
                              ++deadCount;
                           }

                           if (deadCount <= battleCondition.getValue()) {
                              list.add(condition);
                           }
                           break;
                        case 5:
                           int upCount = entityList.size();
                           if (friendEntity != null) {
                              ++upCount;
                           }

                           if (upCount <= battleCondition.getValue()) {
                              list.add(condition);
                           }
                           break;
                        case 6:
                           if (battleDao.scene.getRound() < battleCondition.getValue()) {
                              list.add(condition);
                           }
                           break;
                        case 7:
                           int nationCount = 0;

                           for(Entity entity : entityList) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                              int realNation = heroModel.getNation();
                              if (heroModel.getNation() == 10) {
                                 HeroDao heroDao = heroBagPart.getHeroByCode(entity.getHeroCode());
                                 if (heroDao != null && heroDao.inheritNation > 0) {
                                    realNation = heroDao.inheritNation;
                                 }
                              }

                              if (heroModel != null && realNation == battleCondition.getExtra()) {
                                 ++nationCount;
                              }
                           }

                           if (friendEntity != null) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                              if (heroModel != null && heroModel.getNation() == battleCondition.getExtra()) {
                                 ++nationCount;
                              }
                           }

                           if (nationCount >= battleCondition.getValue()) {
                              list.add(condition);
                           }
                           break;
                        case 8:
                           int nationCount1 = 0;

                           for(Entity entity : entityList) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                              int realNation = heroModel.getNation();
                              if (heroModel.getNation() == 10) {
                                 HeroDao heroDao = heroBagPart.getHeroByCode(entity.getHeroCode());
                                 if (heroDao != null && heroDao.inheritNation > 0) {
                                    realNation = heroDao.inheritNation;
                                 }
                              }

                              if (heroModel != null && realNation == battleCondition.getExtra()) {
                                 ++nationCount1;
                              }
                           }

                           if (friendEntity != null) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                              if (heroModel != null && heroModel.getNation() == battleCondition.getExtra()) {
                                 ++nationCount1;
                              }
                           }

                           if (nationCount1 <= battleCondition.getValue()) {
                              list.add(condition);
                           }
                           break;
                        case 9:
                           int typeCount = 0;

                           for(Entity entity : entityList) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                              if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                                 ++typeCount;
                              }
                           }

                           if (friendEntity != null) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                              if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                                 ++typeCount;
                              }
                           }

                           if (typeCount >= battleCondition.getValue()) {
                              list.add(condition);
                           }
                           break;
                        case 10:
                           int typeCount2 = 0;

                           for(Entity entity : entityList) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                              if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                                 ++typeCount2;
                              }
                           }

                           if (friendEntity != null) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                              if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                                 ++typeCount2;
                              }
                           }

                           if (typeCount2 <= battleCondition.getValue()) {
                              list.add(condition);
                           }
                     }
                  }

                  return list;
               }
            }
         }
      } else {
         return list;
      }
   }

   public List<Integer> satisfiedConditions(List<Entity> leftEntityList, List<Entity> leftFriendEntityList, List<Integer> conditions, int maxRoundSum) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      List<Integer> list = new ArrayList();

      for(Integer condition : conditions) {
         BattleCondition battleCondition = (BattleCondition)ApplicationContextProvider.getModelPoolEntity("battleCondition", condition);
         switch (battleCondition.getType()) {
            case 1:
               list.add(condition);
               break;
            case 2:
               long maxHp = 0L;
               long curHp = 0L;

               for(Entity entity : leftEntityList) {
                  maxHp += entity.getBaseProperty(1);
                  curHp += entity.getBaseProperty(99);
               }

               if (!leftFriendEntityList.isEmpty()) {
                  for(Entity entity : leftFriendEntityList) {
                     maxHp += entity.getBaseProperty(1);
                     curHp += entity.getBaseProperty(99);
                  }
               }

               if ((float)curHp > (float)maxHp * ((float)battleCondition.getValue() / 10000.0F)) {
                  list.add(condition);
               }
               break;
            case 3:
               boolean allAlive = true;

               for(Entity entity : leftEntityList) {
                  if (entity.isDead()) {
                     allAlive = false;
                     break;
                  }
               }

               if (!allAlive) {
                  break;
               }

               Boolean friendAlive = true;

               for(Entity entity : leftFriendEntityList) {
                  if (entity.isDead()) {
                     friendAlive = false;
                     break;
                  }
               }

               if (friendAlive) {
                  list.add(condition);
               }
               break;
            case 4:
               int deadCount = 0;

               for(Entity entity : leftEntityList) {
                  if (entity.isDead()) {
                     ++deadCount;
                  }
               }

               for(Entity friendEntity : leftFriendEntityList) {
                  if (friendEntity != null && friendEntity.isDead()) {
                     ++deadCount;
                  }
               }

               if (deadCount <= battleCondition.getValue()) {
                  list.add(condition);
               }
               break;
            case 5:
               int upCount = leftEntityList.size();

               for(Entity friendEntity : leftFriendEntityList) {
                  if (friendEntity != null) {
                     ++upCount;
                  }
               }

               if (upCount <= battleCondition.getValue()) {
                  list.add(condition);
               }
               break;
            case 6:
               if (maxRoundSum < battleCondition.getValue()) {
                  list.add(condition);
               }
               break;
            case 7:
               int nationCount = 0;

               for(Entity entity : leftEntityList) {
                  HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                  int realNation = heroModel.getNation();
                  if (heroModel.getNation() == 10) {
                     HeroDao heroDao = heroBagPart.getHeroByCode(entity.getHeroCode());
                     if (heroDao != null && heroDao.inheritNation > 0) {
                        realNation = heroDao.inheritNation;
                     }
                  }

                  if (heroModel != null && realNation == battleCondition.getExtra()) {
                     ++nationCount;
                  }
               }

               for(Entity friendEntity : leftFriendEntityList) {
                  if (friendEntity != null) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                     if (heroModel != null && heroModel.getNation() == battleCondition.getExtra()) {
                        ++nationCount;
                     }
                  }
               }

               if (nationCount >= battleCondition.getValue()) {
                  list.add(condition);
               }
               break;
            case 8:
               int nationCount3 = 0;

               for(Entity entity : leftEntityList) {
                  HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                  int realNation = heroModel.getNation();
                  if (heroModel.getNation() == 10) {
                     HeroDao heroDao = heroBagPart.getHeroByCode(entity.getHeroCode());
                     if (heroDao != null && heroDao.inheritNation > 0) {
                        realNation = heroDao.inheritNation;
                     }
                  }

                  if (heroModel != null && realNation == battleCondition.getExtra()) {
                     ++nationCount3;
                  }
               }

               for(Entity friendEntity : leftFriendEntityList) {
                  if (friendEntity != null) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                     if (heroModel != null && heroModel.getNation() == battleCondition.getExtra()) {
                        ++nationCount3;
                     }
                  }
               }

               if (nationCount3 <= battleCondition.getValue()) {
                  list.add(condition);
               }
               break;
            case 9:
               int typeCount = 0;

               for(Entity entity : leftEntityList) {
                  HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                  if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                     ++typeCount;
                  }
               }

               for(Entity friendEntity : leftFriendEntityList) {
                  if (friendEntity != null) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                     if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                        ++typeCount;
                     }
                  }
               }

               if (typeCount >= battleCondition.getValue()) {
                  list.add(condition);
               }
               break;
            case 10:
               int typeCountz = 0;

               for(Entity entity : leftEntityList) {
                  HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
                  if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                     ++typeCountz;
                  }
               }

               for(Entity friendEntity : leftFriendEntityList) {
                  if (friendEntity != null) {
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friendEntity.getId());
                     if (heroModel != null && heroModel.getType() == battleCondition.getExtra()) {
                        ++typeCountz;
                     }
                  }
               }

               if (typeCountz <= battleCondition.getValue()) {
                  list.add(condition);
               }
         }
      }

      return list;
   }

   private String getBattleName(int type) {
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", type);
      return systemFunctionModel != null ? systemFunctionModel.getName() : "未知战斗:" + type;
   }

   public static String getTextOfBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder battleMsg) {
      Function<Integer, String> getIndent = (count) -> {
         StringBuilder stringBuilder = new StringBuilder();

         for(int i = 0; i < count; ++i) {
            stringBuilder.append('\t');
         }

         return stringBuilder.toString();
      };
      Function<Integer, String> getSideDesc = (force) -> {
         if (force == 0) {
            return "左侧";
         } else {
            return force == 1 ? "右侧" : "无效侧";
         }
      };
      Function<Integer, String> getSideDescByPos = (pos) -> {
         if (pos >= 0 && pos <= 4) {
            return "左侧";
         } else {
            return pos >= 5 && pos <= 9 ? "右侧" : "pos" + pos;
         }
      };
      Function<BattleMsg.S2C_Battle_Effect, String> getBattleEffectDesc = (battleEffectx) -> {
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("[");
         if (battleEffectx.hasEffectValue()) {
            stringBuilder.append(String.format("effectValue(%d) ", battleEffectx.getEffectValue()));
         }

         if (battleEffectx.hasFinalValue()) {
            stringBuilder.append(String.format("finalValue(%d) ", battleEffectx.getFinalValue()));
         }

         if (battleEffectx.hasCrit()) {
            stringBuilder.append(String.format("crit(%d) ", battleEffectx.getCrit()));
         }

         if (battleEffectx.hasTime()) {
            stringBuilder.append(String.format("time(%d) ", battleEffectx.getTime()));
         }

         if (battleEffectx.hasEffectSetId()) {
            stringBuilder.append(String.format("effectSetId(%d) ", battleEffectx.getEffectSetId()));
         }

         int lastSpaceIndex = stringBuilder.lastIndexOf(" ");
         if (lastSpaceIndex != -1) {
            stringBuilder.deleteCharAt(lastSpaceIndex);
         }

         stringBuilder.append("]");
         return stringBuilder.toString();
      };
      Function<Integer, String> getEntityName = (entityId) -> {
         String entityName = "";
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entityId);
         if (heroModel != null) {
            entityName = heroModel.getName();
         }

         if (entityName.isEmpty()) {
            TongqueTerraceModel tongqueTerraceModel = (TongqueTerraceModel)ApplicationContextProvider.getModelPoolEntity("TongQueBase", entityId);
            if (tongqueTerraceModel != null) {
               entityName = tongqueTerraceModel.getName();
            }
         }

         if (entityName.isEmpty()) {
            ArtifactModel artifactModel = (ArtifactModel)ApplicationContextProvider.getModelPoolEntity("artifact", entityId);
            if (artifactModel != null) {
               entityName = artifactModel.getName();
            }
         }

         return entityName.isEmpty() ? "?" : entityName;
      };
      Function<Integer, String> getMsgEffectDesc = (effectTypex) -> {
         if (effectTypex == 1) {
            return "闪避";
         } else if (effectTypex == 2) {
            return "吸收";
         } else if (effectTypex == 3) {
            return "清除buff";
         } else if (effectTypex == 4) {
            return "更新buff";
         } else if (effectTypex == 5) {
            return "增加buff";
         } else if (effectTypex == 6) {
            return "伤害类";
         } else if (effectTypex == 7) {
            return "复活效果";
         } else if (effectTypex == 8) {
            return "加血";
         } else if (effectTypex == 9) {
            return "通知死亡";
         } else if (effectTypex == 10) {
            return "神兵的能量";
         } else if (effectTypex == 11) {
            return "抵抗";
         } else if (effectTypex == 12) {
            return "友军上线";
         } else if (effectTypex == 13) {
            return "无效";
         } else if (effectTypex == 14) {
            return "剧情人员";
         } else if (effectTypex == 15) {
            return "人员伤害量";
         } else if (effectTypex == 16) {
            return "抵抗暴击";
         } else if (effectTypex == 17) {
            return "清初buff通知";
         } else if (effectTypex == 18) {
            return "变灯";
         } else if (effectTypex == 19) {
            return "净化失败";
         } else if (effectTypex == 20) {
            return "引爆buff";
         } else if (effectTypex == 21) {
            return "被动触发的效果  只飘字用";
         } else if (effectTypex == 22) {
            return "统计数据";
         } else if (effectTypex == 23) {
            return "分摊出来的伤害";
         } else if (effectTypex == 24) {
            return "通知hp变化";
         } else if (effectTypex == 25) {
            return "战斗属性";
         } else if (effectTypex == 26) {
            return "格挡";
         } else if (effectTypex == 27) {
            return "治愈 从";
         } else if (effectTypex == 28) {
            return "禁止治疗";
         } else if (effectTypex == 29) {
            return "buff击杀";
         } else if (effectTypex == 30) {
            return "链接伤害";
         } else {
            return effectTypex == 31 ? "额外伤害" : "未知效果类型";
         }
      };
      GameServerScan scan = ApplicationContextProvider.getGameScan();
      Map<Integer, BattleMsg.S2C_Battle_Entity> posToEntityMap = new HashMap();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("==========================================");
      stringBuilder.append(new Timestamp(System.currentTimeMillis()));
      stringBuilder.append('\n');
      stringBuilder.append((String)getIndent.apply(1));
      stringBuilder.append(String.format("战斗类型%d", battleMsg.getType()));
      stringBuilder.append("-");
      String battleName = "未知战斗";
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", battleMsg.getType());
      if (systemFunctionModel != null) {
         battleName = systemFunctionModel.getName();
      }

      stringBuilder.append(battleName);
      stringBuilder.append(":\n");
      stringBuilder.append((String)getIndent.apply(1));
      stringBuilder.append("基础信息:\n");
      stringBuilder.append((String)getIndent.apply(1));
      stringBuilder.append("战斗结果:\n");
      stringBuilder.append((String)getIndent.apply(2));
      stringBuilder.append(String.format("胜利方:%s", getSideDesc.apply(battleMsg.getResult().getResult())));
      stringBuilder.append('\n');
      stringBuilder.append((String)getIndent.apply(2));
      stringBuilder.append(String.format("recordId: %d", battleMsg.getResult().getRecordId()));
      stringBuilder.append('\n');
      stringBuilder.append((String)getIndent.apply(1));
      stringBuilder.append("双方阵容:\n");

      for(int team_index = 0; team_index < battleMsg.getTeamsCount(); ++team_index) {
         BattleMsg.S2C_Battle_PKTeam battleTeam = battleMsg.getTeams(team_index);
         stringBuilder.append((String)getIndent.apply(2));
         stringBuilder.append(String.format("%s阵容:\n", getSideDesc.apply(battleTeam.getForce())));

         for(int entity_index = 0; entity_index < battleTeam.getEntitesCount(); ++entity_index) {
            BattleMsg.S2C_Battle_Entity battleEntity = battleTeam.getEntites(entity_index);
            posToEntityMap.put(battleEntity.getBattlePos(), battleEntity);
            int heroId = battleEntity.getHeroId();
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
            if (heroModel != null) {
               stringBuilder.append((String)getIndent.apply(3));
               stringBuilder.append(String.format("英雄:%s 英雄ID:%d 站位:%d", heroModel.getName(), heroId, battleEntity.getBattlePos()));
               stringBuilder.append('\n');
            }
         }

         stringBuilder.append('\n');
      }

      stringBuilder.append((String)getIndent.apply(1));
      stringBuilder.append(String.format("回合信息: 战斗回合数: %d\n", battleMsg.getRoundsCount()));

      for(int round = 0; round < battleMsg.getRoundsCount(); ++round) {
         BattleMsg.S2C_Battle_Round battleRound = battleMsg.getRounds(round);
         stringBuilder.append((String)getIndent.apply(2));
         stringBuilder.append(String.format("回合%d:\n", round + 1));

         for(int action_index = 0; action_index < battleRound.getActionsCount(); ++action_index) {
            BattleMsg.S2C_Battle_Action battleAction = battleRound.getActions(action_index);
            stringBuilder.append((String)getIndent.apply(3));
            Class<?> actionCls = (Class)scan.actionMap.get((byte)battleAction.getActionType());
            String actionName = actionCls != null ? actionCls.getSimpleName() : "行为" + battleAction.getActionType();
            stringBuilder.append(String.format("开始行为:%s\n", actionName));
            if (battleAction.hasBattlePos()) {
               int skillId = battleAction.getId();
               SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
               String entityName = (String)getEntityName.apply(((BattleMsg.S2C_Battle_Entity)posToEntityMap.get(battleAction.getBattlePos())).getHeroId());
               int entityId = ((BattleMsg.S2C_Battle_Entity)posToEntityMap.get(battleAction.getBattlePos())).getHeroId();
               if (skillModel != null) {
                  stringBuilder.append((String)getIndent.apply(4));
                  stringBuilder.append(String.format("执行行为的实体: 【%s %d】 站位%d(%s) %s(技能id%d)", entityName, entityId, battleAction.getBattlePos(), getSideDescByPos.apply(battleAction.getBattlePos()), skillModel.getName(), skillId));
                  if (battleAction.getFlexibleParamsCount() > 0) {
                     stringBuilder.append(" flexible: " + battleAction.getFlexibleParamsList());
                  }

                  stringBuilder.append("\n");
               }
            }

            for(int effects_index = 0; effects_index < battleAction.getEffectesCount(); ++effects_index) {
               BattleMsg.S2C_Battle_Effects battleEffects = battleAction.getEffectes(effects_index);
               stringBuilder.append((String)getIndent.apply(5));
               stringBuilder.append(String.format("插槽:%d\n", battleEffects.getSlot(), battleEffects.getBattlePosList()));

               for(int effect_index = 0; effect_index < battleEffects.getEffectsCount(); ++effect_index) {
                  BattleMsg.S2C_Battle_Effect battleEffect = battleEffects.getEffects(effect_index);
                  int effectType = battleEffect.getEffectType();
                  String targetName = "?";
                  BattleMsg.S2C_Battle_Entity targetEntity = (BattleMsg.S2C_Battle_Entity)posToEntityMap.get(battleEffect.getTargetBattlePos());
                  if (targetEntity != null) {
                     int targetHeroId = targetEntity.getHeroId();
                     HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", targetHeroId);
                     if (heroModel != null) {
                        targetName = heroModel.getName();
                     }
                  }

                  SkillEffectModel skillEffectModel = null;
                  BuffModel buffModel = null;
                  int effectId = battleEffect.getEffectId();
                  switch (effectType) {
                     case 1:
                     case 6:
                     case 7:
                     case 8:
                     case 17:
                     case 21:
                     case 23:
                     case 29:
                     case 30:
                     case 31:
                        skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
                     case 2:
                     case 9:
                     case 10:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 19:
                     case 22:
                     case 24:
                     case 25:
                     case 26:
                     case 27:
                     case 28:
                     default:
                        break;
                     case 3:
                     case 4:
                     case 5:
                     case 11:
                     case 18:
                     case 20:
                        buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", effectId);
                  }

                  if (skillEffectModel != null) {
                     Class<?> effectCls = (Class)scan.effectMap.get(skillEffectModel.getFunc());
                     if (effectCls != null) {
                        String effectName = skillEffectModel.getName();
                        if (effectName == null) {
                           effectName = "";
                        }

                        stringBuilder.append((String)getIndent.apply(6));
                        stringBuilder.append(String.format("(%d %s) EffectFunc: (%d %s %s) 作用目标: %s(站位%d %s) %s", effectType, getMsgEffectDesc.apply(effectType), skillEffectModel.getId(), effectCls.getSimpleName(), effectName, targetName, battleEffect.getTargetBattlePos(), getSideDescByPos.apply(battleEffect.getTargetBattlePos()), getBattleEffectDesc.apply(battleEffect)));
                        stringBuilder.append('\n');
                     }
                  } else if (buffModel != null) {
                     Class<?> buffCls = (Class)scan.buffMap.get((short)buffModel.getType());
                     if (buffCls != null) {
                        String buffName = buffModel.getName();
                        if (buffName == null) {
                           buffName = "";
                        }

                        stringBuilder.append((String)getIndent.apply(6));
                        stringBuilder.append(String.format("(%d %s) buff: (%d %s) 作用目标: %s(站位%d %s) %s", effectType, getMsgEffectDesc.apply(effectType), buffModel.getId(), buffName, targetName, battleEffect.getTargetBattlePos(), getSideDescByPos.apply(battleEffect.getTargetBattlePos()), getBattleEffectDesc.apply(battleEffect)));
                        stringBuilder.append('\n');
                     }
                  } else {
                     int targetPos = battleEffect.getTargetBattlePos();
                     String targetPosStr = "站位" + targetPos + " " + (String)getSideDescByPos.apply(targetPos);
                     if (effectType == 15) {
                        targetPosStr = (String)getSideDesc.apply(targetPos);
                        targetName = "";
                     }

                     stringBuilder.append((String)getIndent.apply(6));
                     stringBuilder.append(String.format("(%d %s) 作用目标: %s(%s) %s", effectType, getMsgEffectDesc.apply(effectType), targetName, targetPosStr, getBattleEffectDesc.apply(battleEffect)));
                     stringBuilder.append('\n');
                  }
               }
            }
         }
      }

      stringBuilder.append("==========================================");
      return stringBuilder.toString();
   }

   public static void printTextOfBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder battleMsg) {
      if (Debug.isDebug) {
         try {
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
            String writePath = (new File(gameModelPool.getSystemOperationPath())).getParent() + File.separator + "textOfBattleMsg.txt";
            File file = new File(writePath);
            if (file.exists()) {
               FileWriter fileWriter = new FileWriter(writePath, false);
               BufferedWriter bw = new BufferedWriter(fileWriter);
               bw.write(getTextOfBattleMsg(battleMsg));
               bw.close();
               fileWriter.close();
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

      }
   }

   static {
      HAS_FIGHTING_FLAG_BATTLE.add(2030);
      HAS_FIGHTING_FLAG_BATTLE.add(1250);
      HAS_FIGHTING_FLAG_BATTLE.add(2430);
   }
}
