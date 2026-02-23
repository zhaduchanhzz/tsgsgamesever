package com.gzbz.test;

import allMgr.PartAnnotation;
import com.gzbz.alliance.AllianceMgr;
import com.gzbz.db.ArtifactDao;
import com.gzbz.db.ArtifactDressDao;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.DivineGeneralsDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.MagicBookDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.TreasureDao;
import com.gzbz.db.bean.ArtifactData;
import com.gzbz.db.bean.UnionTechnologyPlaceData;
import com.gzbz.divineGanerals.DivineGeneralsPart;
import com.gzbz.dragon.DragonDiscipleExtend;
import com.gzbz.dragon.part.DragonStrengthenPart;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.magicBook.MagicBookPart;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ExclusiveTreasure;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.RuneStoneItem;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MagicBookMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.bean.PlayerUnionExtend;
import com.gzbz.union.part.UnionTechnologyPart;
import com.gzbz.war.jingzhou.TreasurePart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class CopyPlayerTest extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(CopyPlayerTest.class);
   @Autowired
   private WorldMgr worldMgr;

   public void copyPlayer(int sourcePlayerId) {
      logger.info("复制玩家={}数据到={}", sourcePlayerId, this.player.getPlayerId());
      GamePlayer sourcePlayer = this.worldMgr.getPlayerById(sourcePlayerId);
      if (sourcePlayer != null) {
         BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
         if (battleChapterDao.chapterId < 400) {
            battleChapterDao.chapterId = 400;
            battleChapterDao.updateOp();
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         ArtifactPart sourceArtifactPart = (ArtifactPart)sourcePlayer.getMgrPart(ArtifactPart.class);
         ArtifactDao sourceArtifactDao = sourceArtifactPart.getArtifactDao();
         ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
         artifactDao.strongLv = sourceArtifactDao.strongLv;
         artifactDao.strongExp = sourceArtifactDao.strongExp;
         artifactDao.refineLv = sourceArtifactDao.refineLv;
         artifactDao.soulNum = sourceArtifactDao.soulNum;
         artifactDao.skillLv = sourceArtifactDao.skillLv;
         artifactDao.allUnlock = sourceArtifactDao.allUnlock;
         artifactDao.artifacts.clear();
         if (!sourceArtifactDao.artifacts.isEmpty()) {
            for(Map.Entry<Integer, ArtifactData> entry : sourceArtifactDao.artifacts.entrySet()) {
               ArtifactData data = new ArtifactData();
               data.id = ((ArtifactData)entry.getValue()).id;
               data.state = ((ArtifactData)entry.getValue()).state;
               data.skillId = ((ArtifactData)entry.getValue()).skillId;
               artifactDao.artifacts.put(entry.getKey(), data);
            }
         }

         artifactDao.updateOp();
         ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
         heroBagPart.setProperty_artifact_strong(artifactPart.getLvProperties());
         heroBagPart.setProperty_artifact_refine(artifactPart.getRefineProperties());
         PlayerExtend sourcePlayerExtend = (PlayerExtend)sourcePlayer.getPlayerExtend(13);
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerExtend.soulNum = sourcePlayerExtend.soulNum;
         this.player.updatePlayerExtend(13);
         heroBagPart.setProperty_artifact_castSoul(artifactPart.getTotalSoulProperties());
         TongqueTerracePart sourceTongqueTerracePart = (TongqueTerracePart)sourcePlayer.getMgrPart(TongqueTerracePart.class);
         Map<Integer, TongqueTerraceDao> sourceTongqueTerraceDaoMap = sourceTongqueTerracePart.getUnlockBeautyMap();
         if (sourceTongqueTerraceDaoMap != null) {
            for(Map.Entry<Integer, TongqueTerraceDao> entry : sourceTongqueTerraceDaoMap.entrySet()) {
               Map<Integer, TongqueTerraceDao> tongqueTerraceDaoMap = this.player.<Integer, TongqueTerraceDao>getMap("tb_tongque_terrace", this.player.getPlayerId());
               if (tongqueTerraceDaoMap != null && tongqueTerraceDaoMap.containsKey(entry.getKey())) {
                  TongqueTerraceDao tongqueTerraceDao = (TongqueTerraceDao)tongqueTerraceDaoMap.get(entry.getKey());
                  tongqueTerraceDao.state = ((TongqueTerraceDao)entry.getValue()).state;
                  tongqueTerraceDao.unlockStep = ((TongqueTerraceDao)entry.getValue()).unlockStep;
                  tongqueTerraceDao.trystLv = ((TongqueTerraceDao)entry.getValue()).trystLv;
                  tongqueTerraceDao.trystExp = ((TongqueTerraceDao)entry.getValue()).trystExp;
                  tongqueTerraceDao.bestowNum = ((TongqueTerraceDao)entry.getValue()).bestowNum;
                  tongqueTerraceDao.skillId = ((TongqueTerraceDao)entry.getValue()).skillId;
                  tongqueTerraceDao.patronizeLv = ((TongqueTerraceDao)entry.getValue()).patronizeLv;
                  tongqueTerraceDao.updateOp();
               } else {
                  TongqueTerraceDao tongqueTerraceDao = new TongqueTerraceDao();
                  tongqueTerraceDao.playerId = this.player.getPlayerId();
                  tongqueTerraceDao.beautyId = ((TongqueTerraceDao)entry.getValue()).beautyId;
                  tongqueTerraceDao.state = ((TongqueTerraceDao)entry.getValue()).state;
                  tongqueTerraceDao.unlockStep = ((TongqueTerraceDao)entry.getValue()).unlockStep;
                  tongqueTerraceDao.trystLv = ((TongqueTerraceDao)entry.getValue()).trystLv;
                  tongqueTerraceDao.trystExp = ((TongqueTerraceDao)entry.getValue()).trystExp;
                  tongqueTerraceDao.bestowNum = ((TongqueTerraceDao)entry.getValue()).bestowNum;
                  tongqueTerraceDao.skillId = ((TongqueTerraceDao)entry.getValue()).skillId;
                  tongqueTerraceDao.patronizeLv = ((TongqueTerraceDao)entry.getValue()).patronizeLv;
                  this.player.insertDao(tongqueTerraceDao, false);
               }
            }

            TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);
            tongqueTerracePart.flushTongqueProperties();
         }

         Map<Integer, TreasureDao> sourceTreasureDaoMap = sourcePlayer.<Integer, TreasureDao>getMap("tb_player_treasure", sourcePlayer.getPlayerId());
         if (sourceTreasureDaoMap != null) {
            Map<Integer, TreasureDao> treasureDaoMap = this.player.<Integer, TreasureDao>getMap("tb_player_treasure", this.player.getPlayerId());

            for(Map.Entry<Integer, TreasureDao> entry : sourceTreasureDaoMap.entrySet()) {
               if (treasureDaoMap != null && treasureDaoMap.containsKey(entry.getKey())) {
                  TreasureDao treasureDao = (TreasureDao)treasureDaoMap.get(entry.getKey());
                  treasureDao.treasureId = ((TreasureDao)entry.getValue()).treasureId;
                  treasureDao.starSum = ((TreasureDao)entry.getValue()).starSum;
                  treasureDao.level = ((TreasureDao)entry.getValue()).level;
                  treasureDao.exp = ((TreasureDao)entry.getValue()).exp;
                  treasureDao.unLock = ((TreasureDao)entry.getValue()).unLock;
                  treasureDao.updateOp();
               } else {
                  TreasureDao treasureDao = new TreasureDao();
                  treasureDao.playerId = this.player.getPlayerId();
                  treasureDao.treasureId = ((TreasureDao)entry.getValue()).treasureId;
                  treasureDao.starSum = ((TreasureDao)entry.getValue()).starSum;
                  treasureDao.level = ((TreasureDao)entry.getValue()).level;
                  treasureDao.exp = ((TreasureDao)entry.getValue()).exp;
                  treasureDao.unLock = ((TreasureDao)entry.getValue()).unLock;
                  this.player.insertDao(treasureDao, false);
               }
            }

            TreasurePart treasurePart = (TreasurePart)this.player.getMgrPart(TreasurePart.class);
            heroBagPart.setProperty_reasuret_map(treasurePart.getTreasurePro());
         }

         PlayerUnionExtend sourceUnionExtend = (PlayerUnionExtend)sourcePlayer.getPlayerExtend(9);
         if (!sourceUnionExtend.technology.isEmpty()) {
            PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)this.player.getPlayerExtend(9);
            Map<Integer, Map<Integer, UnionTechnologyPlaceData>> tempMap = new HashMap();

            for(Map.Entry<Integer, Map<Integer, UnionTechnologyPlaceData>> entry : sourceUnionExtend.technology.entrySet()) {
               Map<Integer, UnionTechnologyPlaceData> dataMap = new HashMap();

               for(Map.Entry<Integer, UnionTechnologyPlaceData> subEntry : (entry.getValue()).entrySet()) {
                  UnionTechnologyPlaceData data = new UnionTechnologyPlaceData(((UnionTechnologyPlaceData)subEntry.getValue()).place, ((UnionTechnologyPlaceData)subEntry.getValue()).modelId, ((UnionTechnologyPlaceData)subEntry.getValue()).isLight);
                  dataMap.put(subEntry.getKey(), data);
               }

               tempMap.put(entry.getKey(), dataMap);
            }

            playerUnionExtend.technology = tempMap;
            this.player.updatePlayerExtend(9);
            UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)this.player.getMgrPart(UnionTechnologyPart.class);
            heroBagPart.setProperty_union_skill_map(unionTechnologyPart.getTechnologyPropertyAdditions(), unionTechnologyPart.getTechnologyLevelScore());
         }

         DivineGeneralsDao sourceDivineGeneralsDao = (DivineGeneralsDao)sourcePlayer.getData("tb_divine_generals", sourcePlayer.getPlayerId());
         DivineGeneralsDao divineGeneralsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());
         divineGeneralsDao.useNewIds.clear();
         divineGeneralsDao.useNewIds.addAll(sourceDivineGeneralsDao.useNewIds);
         divineGeneralsDao.infoMap.clear();
         divineGeneralsDao.infoMap.putAll(sourceDivineGeneralsDao.infoMap);
         divineGeneralsDao.updateOp();
         DivineGeneralsPart divineGeneralsPart = (DivineGeneralsPart)this.player.getMgrPart(DivineGeneralsPart.class);
         heroBagPart.setProperty_divine_generals(divineGeneralsPart.getPropertyAdditions());
         DragonDiscipleExtend sourceDragonDiscipleExtend = (DragonDiscipleExtend)sourcePlayer.getPlayerExtend(65);
         if (sourceDragonDiscipleExtend != null) {
            DragonDiscipleExtend dragonDiscipleExtend = (DragonDiscipleExtend)this.player.getPlayerExtend(65);
            dragonDiscipleExtend.battleNum = sourceDragonDiscipleExtend.battleNum;
            dragonDiscipleExtend.breachLv = sourceDragonDiscipleExtend.breachLv;
            dragonDiscipleExtend.passed = sourceDragonDiscipleExtend.passed;
            dragonDiscipleExtend.tecPlace.addAll(sourceDragonDiscipleExtend.tecPlace);
            this.player.updatePlayerExtend(65);
            DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)this.player.getMgrPart(DragonStrengthenPart.class);
            heroBagPart.setProperty_dragon_strengthen(dragonStrengthenPart.getPropertyAdditions());
         }

         Map<Integer, HeroDao> heroDaoMap = sourcePlayer.<Integer, HeroDao>getMap("tb_hero_bag", sourcePlayer.getPlayerId());
         List<HeroDao> addList = new ArrayList();

         for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
            if (((HeroDao)entry.getValue()).getLv() > 1 && ((HeroDao)entry.getValue()).getStar() > 5 && ((HeroDao)entry.getValue()).getBreachLv() > 1) {
               HeroDao heroDao = new HeroDao();
               heroDao.playerId = this.player.getPlayerId();
               heroDao.code = this.player.getUniqueCode(CodeDefine.HERO_CODE);
               heroDao.id = ((HeroDao)entry.getValue()).id;
               heroDao.type = ((HeroDao)entry.getValue()).type;
               heroDao.setLv(((HeroDao)entry.getValue()).getLv());
               heroDao.exp = ((HeroDao)entry.getValue()).exp;
               heroDao.quality = ((HeroDao)entry.getValue()).quality;
               heroDao.setStar(((HeroDao)entry.getValue()).getStar());
               heroDao.upStarId = ((HeroDao)entry.getValue()).upStarId;
               heroDao.setBreachLv(((HeroDao)entry.getValue()).getBreachLv());
               heroDao.combatPower = ((HeroDao)entry.getValue()).combatPower;
               heroDao.runeLv = ((HeroDao)entry.getValue()).runeLv;
               heroDao.aide = ((HeroDao)entry.getValue()).aide;
               heroDao.aide2 = ((HeroDao)entry.getValue()).aide2;
               heroDao.isLockStone = ((HeroDao)entry.getValue()).isLockStone;
               if (!((HeroDao)entry.getValue()).equips.isEmpty()) {
                  for(Map.Entry<Integer, EquipItem> itemEntry : ((HeroDao)entry.getValue()).equips.entrySet()) {
                     EquipItem equipItem = new EquipItem();
                     equipItem.setNum(1);
                     equipItem.id = ((EquipItem)itemEntry.getValue()).id;
                     heroDao.equips.put(itemEntry.getKey(), equipItem);
                  }
               }

               if (!((HeroDao)entry.getValue()).strengthLev.isEmpty()) {
                  heroDao.strengthLev.clear();
                  heroDao.strengthLev.putAll(((HeroDao)entry.getValue()).strengthLev);
               }

               if (!((HeroDao)entry.getValue()).castSouls.isEmpty()) {
                  heroDao.castSouls.putAll(((HeroDao)entry.getValue()).castSouls);
               }

               if (!((HeroDao)entry.getValue()).warriors.isEmpty()) {
                  for(Map.Entry<Integer, WarriorSignet> subEntry : ((HeroDao)entry.getValue()).warriors.entrySet()) {
                     WarriorSignet warriorSignet = new WarriorSignet();
                     warriorSignet.score = ((WarriorSignet)subEntry.getValue()).score;
                     warriorSignet.id = ((WarriorSignet)subEntry.getValue()).id;

                     for(PropertyModel property : ((WarriorSignet)subEntry.getValue()).properties) {
                        warriorSignet.properties.add(property.clone());
                     }

                     warriorSignet.skills.addAll(((WarriorSignet)subEntry.getValue()).skills);

                     for(PropertyModel recastPro : ((WarriorSignet)subEntry.getValue()).recastPros) {
                        warriorSignet.recastPros.add(recastPro.clone());
                     }

                     warriorSignet.recastSkills.addAll(((WarriorSignet)subEntry.getValue()).recastSkills);
                     heroDao.warriors.put(subEntry.getKey(), warriorSignet);
                  }
               }

               if (!((HeroDao)entry.getValue()).warcrafts.isEmpty()) {
                  heroDao.warcrafts.putAll(((HeroDao)entry.getValue()).warcrafts);
               }

               if (!((HeroDao)entry.getValue()).ornament.isEmpty()) {
                  for(Map.Entry<Integer, OrnamentItem> subEntry : ((HeroDao)entry.getValue()).ornament.entrySet()) {
                     OrnamentItem ornamentItem = new OrnamentItem();
                     ornamentItem.code = ((OrnamentItem)subEntry.getValue()).code;
                     ornamentItem.id = ((OrnamentItem)subEntry.getValue()).id;
                     ornamentItem.setNum(1);
                     ornamentItem.lev = ((OrnamentItem)subEntry.getValue()).lev;
                     ornamentItem.clearNum1 = ((OrnamentItem)subEntry.getValue()).clearNum1;
                     ornamentItem.clearNum2 = ((OrnamentItem)subEntry.getValue()).clearNum2;
                     ornamentItem.clearNum3 = ((OrnamentItem)subEntry.getValue()).clearNum3;
                     ornamentItem.clearNum4 = ((OrnamentItem)subEntry.getValue()).clearNum4;
                     ornamentItem.clearNum5 = ((OrnamentItem)subEntry.getValue()).clearNum5;
                     ornamentItem.clearRound = ((OrnamentItem)subEntry.getValue()).clearRound;
                     ornamentItem.lockList.addAll(((OrnamentItem)subEntry.getValue()).lockList);
                     ornamentItem.posList.addAll(((OrnamentItem)subEntry.getValue()).posList);
                     ornamentItem.clearPosList.addAll(((OrnamentItem)subEntry.getValue()).clearPosList);
                     ornamentItem.proColour.addAll(((OrnamentItem)subEntry.getValue()).proColour);
                     ornamentItem.clearProColour.addAll(((OrnamentItem)subEntry.getValue()).clearProColour);
                     ornamentItem.groupList.addAll(((OrnamentItem)subEntry.getValue()).groupList);
                     if (!((OrnamentItem)subEntry.getValue()).proMap.isEmpty()) {
                        for(Map.Entry<Integer, PropertyModel> proEntry : ((OrnamentItem)subEntry.getValue()).proMap.entrySet()) {
                           ornamentItem.proMap.put(proEntry.getKey(), ((PropertyModel)proEntry.getValue()).clone());
                        }
                     }

                     if (!((OrnamentItem)subEntry.getValue()).clearProMap.isEmpty()) {
                        for(Map.Entry<Integer, PropertyModel> clearProEntry : ((OrnamentItem)subEntry.getValue()).clearProMap.entrySet()) {
                           ornamentItem.clearProMap.put(clearProEntry.getKey(), ((PropertyModel)clearProEntry.getValue()).clone());
                        }
                     }

                     heroDao.ornament.put(subEntry.getKey(), ornamentItem);
                  }
               }

               if (!((HeroDao)entry.getValue()).runeStone.isEmpty()) {
                  for(Map.Entry<Integer, RuneStoneItem> subEntry : ((HeroDao)entry.getValue()).runeStone.entrySet()) {
                     RuneStoneItem runeStoneItem = new RuneStoneItem();
                     runeStoneItem.setNum(1);
                     runeStoneItem.id = ((RuneStoneItem)subEntry.getValue()).id;
                     runeStoneItem.code = ((RuneStoneItem)subEntry.getValue()).code;
                     if (!((RuneStoneItem)subEntry.getValue()).proMap.isEmpty()) {
                        for(Map.Entry<Integer, PropertyModel> proEntry : ((RuneStoneItem)subEntry.getValue()).proMap.entrySet()) {
                           runeStoneItem.proMap.put(proEntry.getKey(), ((PropertyModel)proEntry.getValue()).clone());
                        }
                     }

                     heroDao.runeStone.put(subEntry.getKey(), runeStoneItem);
                  }
               }

               if (((HeroDao)entry.getValue()).warFlag != null) {
                  WarFlag warFlag = new WarFlag();
                  warFlag.code = ((HeroDao)entry.getValue()).warFlag.code;
                  warFlag.id = ((HeroDao)entry.getValue()).warFlag.id;
                  warFlag.setNum(1);
                  warFlag.strongLv = ((HeroDao)entry.getValue()).warFlag.strongLv;
                  warFlag.recastNum = ((HeroDao)entry.getValue()).warFlag.recastNum;
                  warFlag.highRecastNum = ((HeroDao)entry.getValue()).warFlag.highRecastNum;
                  if (!((HeroDao)entry.getValue()).warFlag.strongProperties.isEmpty()) {
                     for(PropertyModel strongProperty : ((HeroDao)entry.getValue()).warFlag.strongProperties) {
                        warFlag.strongProperties.add(strongProperty.clone());
                     }
                  }

                  if (!((HeroDao)entry.getValue()).warFlag.recastProperties.isEmpty()) {
                     for(PropertyModel strongProperty : ((HeroDao)entry.getValue()).warFlag.recastProperties) {
                        warFlag.recastProperties.add(strongProperty.clone());
                     }
                  }

                  heroDao.warFlag = warFlag;
               }

               if (((HeroDao)entry.getValue()).exTreasure != null) {
                  ExclusiveTreasure exclusiveTreasure = new ExclusiveTreasure();
                  exclusiveTreasure.lev = ((HeroDao)entry.getValue()).exTreasure.lev;
                  exclusiveTreasure.star = ((HeroDao)entry.getValue()).exTreasure.star;
                  exclusiveTreasure.extraProId = ((HeroDao)entry.getValue()).exTreasure.extraProId;
                  exclusiveTreasure.condition1 = ((HeroDao)entry.getValue()).exTreasure.condition1;
                  exclusiveTreasure.condition2 = ((HeroDao)entry.getValue()).exTreasure.condition2;
                  exclusiveTreasure.skillId = ((HeroDao)entry.getValue()).exTreasure.skillId;
                  exclusiveTreasure.recastProId = ((HeroDao)entry.getValue()).exTreasure.recastProId;
                  exclusiveTreasure.recastCondition1 = ((HeroDao)entry.getValue()).exTreasure.recastCondition1;
                  exclusiveTreasure.recastCondition2 = ((HeroDao)entry.getValue()).exTreasure.recastCondition2;
                  exclusiveTreasure.recastSkillId = ((HeroDao)entry.getValue()).exTreasure.recastSkillId;
                  exclusiveTreasure.stoneMap.putAll(((HeroDao)entry.getValue()).exTreasure.stoneMap);
                  heroDao.exTreasure = exclusiveTreasure;
               }

               if (!((HeroDao)entry.getValue()).talent.isEmpty()) {
                  for(Map.Entry<Integer, List> subEntry : ((HeroDao)entry.getValue()).talent.entrySet()) {
                     List list = new ArrayList();
                     list.addAll((Collection)subEntry.getValue());
                     heroDao.talent.put(subEntry.getKey(), list);
                  }
               }

               if (((HeroDao)entry.getValue()).warHorse != null) {
                  WarHorse warHorse = new WarHorse(0, ((HeroDao)entry.getValue()).warHorse);
                  heroDao.warHorse = warHorse;
               }

               heroDao.rune.runeMap.clear();
               heroDao.rune.runeRefineMap.clear();
               heroDao.rune.runeMap.putAll(((HeroDao)entry.getValue()).rune.runeMap);
               heroDao.rune.runeRefineMap.putAll(((HeroDao)entry.getValue()).rune.runeRefineMap);
               heroDao.starMap.clear();
               heroDao.starMap.putAll(((HeroDao)entry.getValue()).starMap);
               heroDao.worldPaintInfoMap.clear();
               heroDao.worldPaintInfoMap.putAll(((HeroDao)entry.getValue()).worldPaintInfoMap);
               heroDao.godBeastItem = ((HeroDao)entry.getValue()).godBeastItem;
               heroDao.exclusiveWeaponMap = ((HeroDao)entry.getValue()).exclusiveWeaponMap;
               heroDao.soulSkill = ((HeroDao)entry.getValue()).soulSkill;
               this.player.insertDao(heroDao);
               if (!this.player.isRobot()) {
                  heroBagPart.triggerHeroStarTask(heroDao, true);
               }

               addList.add(heroDao);
            }
         }

         this.copyMagicBook(sourcePlayer);
         this.copyArtifactDress(sourcePlayer);
         this.player.failure(1);
         heroBagPart.sendHeroList2Client(addList);
         logger.info("复制完成，武将数量={}", addList.size());
      }
   }

   private void copyMagicBook(GamePlayer sourcePlayer) {
      if (sourcePlayer.isSystemOpen(1520)) {
         MagicBookDao sourceMagicBookDao = (MagicBookDao)sourcePlayer.getData("tb_magic_book", sourcePlayer.getPlayerId());
         MagicBookDao thisMagicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         thisMagicBookDao.playerId = this.player.getPlayerId();
         thisMagicBookDao.identityId = sourceMagicBookDao.identityId;
         thisMagicBookDao.magicBookId = sourceMagicBookDao.magicBookId;
         thisMagicBookDao.authProcess.clear();
         thisMagicBookDao.skillPosition.clear();
         thisMagicBookDao.originals.clear();
         thisMagicBookDao.authCount.clear();
         thisMagicBookDao.authProcess.putAll(sourceMagicBookDao.authProcess);
         thisMagicBookDao.skillPosition.putAll(sourceMagicBookDao.skillPosition);
         thisMagicBookDao.originals.putAll(sourceMagicBookDao.originals);
         thisMagicBookDao.authCount.putAll(sourceMagicBookDao.authCount);
         thisMagicBookDao.updateOp();
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         MagicBookPart magicBookPart = (MagicBookPart)this.player.getMgrPart(MagicBookPart.class);
         long power = heroArrayingPart.getPlayerCombatPower(false);
         this.player.flushPlayerCombatPower("英雄属性改变", power);
         magicBookPart.sendInfo();
         MagicBookMsg.S2C_MagicSkillUp_10618.Builder resp = MagicBookMsg.S2C_MagicSkillUp_10618.newBuilder();
         resp.addAllMagics(this.buildMagicListMsg());
         this.player.sendMsg(resp.build());
         AllianceMgr allianceMgr = (AllianceMgr)ApplicationContextProvider.getContext().getBean(AllianceMgr.class);
         allianceMgr.pushTaskEx("allianceUploadArraying", new Object[]{this.player});
      }
   }

   private void copyArtifactDress(GamePlayer sourcePlayer) {
      Map<Integer, ArtifactDressDao> sourceArtifactDressMap = sourcePlayer.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", sourcePlayer.getPlayerId());
      if (sourceArtifactDressMap != null && !sourceArtifactDressMap.isEmpty()) {
         Map<Integer, ArtifactDressDao> thisArtifactDressMap = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());

         for(Map.Entry<Integer, ArtifactDressDao> entry : sourceArtifactDressMap.entrySet()) {
            ArtifactDressDao sourceDressDao = (ArtifactDressDao)entry.getValue();
            ArtifactDressDao myArtifactDressDao = (ArtifactDressDao)thisArtifactDressMap.get(entry.getKey());
            if (myArtifactDressDao == null) {
               myArtifactDressDao = new ArtifactDressDao();
               myArtifactDressDao.playerId = this.player.getPlayerId();
               myArtifactDressDao.id = sourceDressDao.id;
               myArtifactDressDao.lv = sourceDressDao.lv;
               myArtifactDressDao.state = sourceDressDao.state;
               myArtifactDressDao.artifact = sourceDressDao.artifact;
               myArtifactDressDao.endTime = sourceDressDao.endTime;
               this.player.insertDao(myArtifactDressDao);
            } else {
               myArtifactDressDao.playerId = this.player.getPlayerId();
               myArtifactDressDao.lv = sourceDressDao.lv;
               myArtifactDressDao.state = sourceDressDao.state;
               myArtifactDressDao.artifact = sourceDressDao.artifact;
               myArtifactDressDao.endTime = sourceDressDao.endTime;
               myArtifactDressDao.updateOp();
            }
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
         heroBagPart.setProperty_artifact_dress(artifactDressPart.getDressProperties());
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
         artifactDressPart.S2C_MainResult_11102();
      }

   }

   private List<CommonMsg.MagicInfo> buildMagicListMsg() {
      List<CommonMsg.MagicInfo> magicInfoList = new ArrayList();
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());

      for(Map.Entry<Integer, Integer> entry : magicBookDao.skillPosition.entrySet()) {
         if ((Integer)entry.getValue() > 0) {
            CommonMsg.MagicInfo.Builder magicInfo = CommonMsg.MagicInfo.newBuilder();
            magicInfo.setSkillId((Integer)entry.getValue());
            magicInfo.setPosition((Integer)entry.getKey());
            magicInfoList.add(magicInfo.build());
         }
      }

      return magicInfoList;
   }
}
