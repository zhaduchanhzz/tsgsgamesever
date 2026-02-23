package com.gzbz.db.bean;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.gzbz.battle.entity.Monster;
import com.gzbz.db.HeroDao;
import com.gzbz.exclusiveWeapon.EWeaponDefine;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ExclusiveTreasure;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.RuneStoneItem;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.gamePlayer.playerBag.Totem;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.model.ExclusiveTreasureActivationModel;
import com.gzbz.model.ExclusiveTreasureExtraModel;
import com.gzbz.model.ExclusiveTreasureStoneModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.RuneMainModel;
import com.gzbz.model.RuneRefineLvNatureModel;
import com.gzbz.model.RuneSuitModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.StampSetModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.rune.bean.Rune;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RunePropertiesAndSkills;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldPaint.WorldPaintInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import jodd.util.StringUtil;
import misc.MapUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeroMirror implements Cloneable, Serializable {
   static Logger logger = LoggerFactory.getLogger(HeroMirror.class);
   public int playerId;
   public int code;
   public int id;
   public int lv;
   public int limitLv;
   public int star;
   public int breachLv;
   public int quality;
   public int dressId;
   public int dressLv;
   public long combatPower;
   public int aide;
   public int aide2;
   public int aideTrammelsId;
   public int treasureLev;
   public int treasureStage;
   public int dressHeroId;
   public Totem totem;
   public WarFlag warFlag;
   public WarHorse warHorse;
   public ExclusiveTreasure exTreasure;
   public Map<Integer, EquipItem> equips = new HashMap();
   public Map<Integer, Integer> castSouls = new HashMap();
   public Map<Integer, WarriorSignet> warriors = new HashMap();
   public Map<Integer, Integer> warcrafts = new HashMap();
   public Map<Integer, OrnamentItem> ornament = new HashMap();
   public Map<Integer, RuneStoneItem> runeStone = new HashMap();
   public Map<Integer, List> talent = new HashMap();
   public List<Integer> talentSkills = new ArrayList();
   public HashMap<Integer, Long> totalFightProperties = new HashMap();
   public HashMap<Integer, Long> totalShowProperties = new HashMap();
   public List<PropertyModel> warHorseBasePros = new ArrayList();
   public List<Integer> heroSkills = new ArrayList();
   public Set<Integer> states = new HashSet();
   public Map<Integer, Integer> strengthLev = new HashMap();
   public Map<Integer, Integer> strengthSkill = new HashMap();
   public Set<Integer> activeDressIds = new HashSet();
   public int promoteLv;
   public List<Integer> destinySkills = new ArrayList();
   public int palaceTitle;
   public Rune rune = new Rune();
   public int shareHeroId;
   public Set<Integer> armyArraySkill = new HashSet();
   public List<ArmyArrayData> armyArrayDatas = new ArrayList();
   public Set<Integer> starAtlas = new HashSet();
   public List<Integer> starAtlasSkill = new ArrayList();
   public Map<Integer, StarMapPoint> starMap = new HashMap();
   public Map<Integer, WorldPaintInfo> worldPaintInfoMap = new HashMap();
   public Map<Integer, Integer> palaceStarSkill = new HashMap();
   public int type;
   public GodBeastItem godBeastItem;
   public int inheritNation;
   public Map<Integer, ExclusiveWeaponItem> exclusiveWeaponMap = new HashMap();
   public Map<Integer, Integer> soulSkill = new HashMap();
   public int invalidTime;
   public int linkCode;
   public int beLinkCode;
   public Set<Integer> dragonVeinSkills = new HashSet();

   public static HeroMirror fromHeroBean(HeroDao heroDao) {
      heroDao.flushTotalProperties();
      HeroMirror heroMirror = new HeroMirror();
      heroMirror.playerId = heroDao.playerId;
      heroMirror.code = heroDao.code;
      heroMirror.id = heroDao.id;
      heroMirror.lv = heroDao.getLvWithPromote();
      heroMirror.star = heroDao.getStar();
      heroMirror.breachLv = heroDao.getBreachLv();
      heroMirror.quality = heroDao.quality;
      heroMirror.dressId = heroDao.dressId;
      heroMirror.dressLv = heroDao.dressLv;
      heroMirror.combatPower = heroDao.combatPower;
      heroMirror.states.addAll(heroDao.getStateList());
      heroMirror.totalFightProperties.putAll(heroDao.totalFightProperties);
      heroMirror.totalShowProperties.putAll(heroDao.totalShowProperties);
      heroMirror.equips.putAll(heroDao.equips);
      heroMirror.castSouls.putAll(heroDao.castSouls);
      heroMirror.warriors.putAll(heroDao.warriors);
      heroMirror.warcrafts.putAll(heroDao.warcrafts);
      heroMirror.ornament.putAll(heroDao.ornament);
      heroMirror.totem = heroDao.getTotem();
      heroMirror.aide = heroDao.aide;
      heroMirror.aide2 = heroDao.aide2;
      heroMirror.aideTrammelsId = heroDao.aideTrammelsId;
      heroMirror.treasureLev = heroDao.getTreasure(1);
      heroMirror.treasureStage = heroDao.getTreasure(2);
      heroMirror.warFlag = heroDao.warFlag;
      heroMirror.runeStone = heroDao.runeStone;
      heroMirror.exTreasure = heroDao.exTreasure;
      heroMirror.heroSkills.addAll(heroDao.heroCastSoulSkills);
      heroMirror.talent = heroDao.talent;
      heroMirror.talentSkills.addAll(heroDao.getTalentSkill());
      heroMirror.dressHeroId = heroDao.dressHeroId;
      heroMirror.warHorse = heroDao.warHorse;
      heroMirror.warHorseBasePros.addAll(heroDao.warHorseBasePros);
      heroMirror.strengthLev.putAll(heroDao.strengthLev);
      heroMirror.strengthSkill.putAll(heroDao.strengthSkill);
      heroMirror.activeDressIds = heroDao.getActiveDressIds();
      heroMirror.promoteLv = heroDao.getPromoteLv();
      heroMirror.destinySkills.addAll(heroDao.destinySkills);
      heroMirror.palaceTitle = heroDao.palaceTitle;
      heroMirror.rune = heroDao.rune;
      heroMirror.shareHeroId = heroDao.shareHeroId;
      heroMirror.armyArraySkill.addAll(heroDao.armyArraySkill);
      heroMirror.armyArrayDatas.addAll(heroDao.getAllArmyArrayData());
      Map<Integer, StarMapPoint> heroStarMap = heroDao.recHeroStarMapPointMap();
      heroMirror.starMap.putAll((Map)(heroStarMap == null ? new HashMap() : heroStarMap));
      heroMirror.palaceStarSkill.putAll(heroDao.palaceStarSkill);
      heroMirror.worldPaintInfoMap.putAll((Map)(heroDao.worldPaintInfoMap == null ? new HashMap() : heroDao.worldPaintInfoMap));
      heroMirror.type = heroDao.type;
      heroMirror.godBeastItem = heroDao.godBeastItem;
      heroMirror.inheritNation = heroDao.inheritNation;
      heroMirror.exclusiveWeaponMap.putAll(heroDao.exclusiveWeaponMap);
      heroMirror.soulSkill.putAll(heroDao.soulSkill);
      heroMirror.invalidTime = heroDao.invalidTime;
      heroMirror.linkCode = heroDao.linkCode;
      heroMirror.beLinkCode = heroDao.beLinkCode;
      heroMirror.dragonVeinSkills = heroDao.dragonVeinSkills;
      return heroMirror;
   }

   public static HeroMirror fromMonster(Monster monster) {
      HeroMirror heroMirror = new HeroMirror();
      heroMirror.playerId = 0;
      heroMirror.code = 0;
      heroMirror.id = monster.id;
      heroMirror.lv = monster.lv <= 0 ? 1 : monster.lv;
      heroMirror.limitLv = monster.limitLv;
      heroMirror.star = monster.star;
      heroMirror.breachLv = monster.breachLv;
      heroMirror.quality = monster.quality;
      heroMirror.combatPower = monster.totalCombatPower;
      heroMirror.states = new TreeSet();
      heroMirror.totalFightProperties.putAll(monster.totalFightProperties);
      heroMirror.totalShowProperties.putAll(monster.totalShowProperties);
      heroMirror.equips.putAll(monster.equips);
      heroMirror.warcrafts.putAll(monster.warcrafts);
      heroMirror.warriors.putAll(monster.warriors);
      heroMirror.exTreasure = monster.exTreasure;
      heroMirror.ornament.putAll(monster.ornament);
      heroMirror.talent.putAll(monster.talent);
      heroMirror.talentSkills.addAll(monster.skill_talent);
      heroMirror.heroSkills.addAll(monster.heroUnlockSkills);
      heroMirror.inheritNation = monster.inheritNation;
      return heroMirror;
   }

   public boolean isNeedFlush() {
      if (this.states.size() > 0) {
         return true;
      } else if (this.lv > 1) {
         return true;
      } else if (this.lv == 1 && !this.equips.isEmpty()) {
         return true;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.id);
         return this.star > heroModel.getStar();
      }
   }

   public CommonMsg.HeroInfo.Builder toBuilder() {
      CommonMsg.HeroInfo.Builder heroBuilder = CommonMsg.HeroInfo.newBuilder();
      heroBuilder.setCode(this.code);
      heroBuilder.setId(this.id);
      heroBuilder.setLv(this.lv);
      heroBuilder.setQuality(this.quality);
      heroBuilder.setStar(this.star);
      heroBuilder.setBreachLv(this.breachLv);
      heroBuilder.setCombatPower(this.combatPower);
      heroBuilder.addAllState(this.states);
      heroBuilder.setAide(this.aide);
      heroBuilder.setAide2(this.aide2);
      heroBuilder.setAideTrammelsId(this.aideTrammelsId);
      heroBuilder.setPromoteLv(this.promoteLv);
      heroBuilder.addAllDestinySkills(this.destinySkills);
      heroBuilder.setPalaceTitle(this.palaceTitle);
      heroBuilder.setShareHeroId(this.shareHeroId);
      heroBuilder.setInvalidTime(this.invalidTime);
      if (null != this.godBeastItem) {
         heroBuilder.setGodBeastInfo(GodBeastDefine.recGodBeastInfoBuilder(this.godBeastItem));
      }

      heroBuilder.addAllExclusiveWeaponInfo(EWeaponDefine.toBuildExclusiveWeaponInfoList(this.exclusiveWeaponMap, this.soulSkill));
      if (this.dressId > 0) {
         heroBuilder.setDressId(this.dressId);
         heroBuilder.setDressLv(this.dressLv);
      }

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         if (this.totalShowProperties.get(i) != null) {
            heroBuilder.addProperties(((Long)this.totalShowProperties.get(i)).intValue());
         } else {
            heroBuilder.addProperties(0);
         }
      }

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         if (this.totalFightProperties.get(i) != null) {
            heroBuilder.addFightProperties(((Long)this.totalShowProperties.get(i)).intValue());
         } else {
            heroBuilder.addFightProperties(0);
         }
      }

      heroBuilder.addAllUnlockHeroSkills(this.heroSkills);
      if (this.isNeedFlush()) {
         for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroEquipInfo.Builder equipBuilder = CommonMsg.HeroEquipInfo.newBuilder();
            equipBuilder.setPosition(position);
            equipBuilder.setId(((EquipItem)entry.getValue()).id);
            heroBuilder.addEquips(equipBuilder);
         }

         for(Map.Entry<Integer, Integer> entry : this.castSouls.entrySet()) {
            CommonMsg.HeroCastInfo.Builder castSoulsBulider = CommonMsg.HeroCastInfo.newBuilder();
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            castSoulsBulider.setPosition(position);
            castSoulsBulider.setState((Integer)entry.getValue());
            heroBuilder.addCast(castSoulsBulider);
         }

         for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroWarriorSignetInfo.Builder warriorSignetBuilder = CommonMsg.HeroWarriorSignetInfo.newBuilder();
            warriorSignetBuilder.setPosition(position);
            warriorSignetBuilder.setId(((WarriorSignet)entry.getValue()).id);
            warriorSignetBuilder.setScore(((WarriorSignet)entry.getValue()).score);

            for(Integer skillId : ((WarriorSignet)entry.getValue()).skills) {
               warriorSignetBuilder.addSkills(skillId);
            }

            for(PropertyModel property : ((WarriorSignet)entry.getValue()).properties) {
               warriorSignetBuilder.addProperty(property.builder());
            }

            for(PropertyModel recastPro : ((WarriorSignet)entry.getValue()).recastPros) {
               warriorSignetBuilder.addRecastPros(recastPro.builder());
            }

            for(Integer recastSkill : ((WarriorSignet)entry.getValue()).recastSkills) {
               warriorSignetBuilder.addRecastSkills(recastSkill);
            }

            WarriorSignetDefine.addExclusiveAttrAndSkill(((WarriorSignet)entry.getValue()).id, warriorSignetBuilder);
            heroBuilder.addWarriorSignets(warriorSignetBuilder);
         }

         for(Map.Entry<Integer, RuneStoneItem> entry : this.runeStone.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.RuneStoneWear.Builder wearBuilder = CommonMsg.RuneStoneWear.newBuilder();
            wearBuilder.setPosition(position);
            wearBuilder.setId(((RuneStoneItem)entry.getValue()).id);
            wearBuilder.setStrengthen(((RuneStoneItem)entry.getValue()).strengthen);

            for(Map.Entry<Integer, PropertyModel> subEntry : ((RuneStoneItem)entry.getValue()).proMap.entrySet()) {
               wearBuilder.addPro(((RuneStoneItem)entry.getValue()).toBuilder((Integer)subEntry.getKey(), (PropertyModel)subEntry.getValue(), ((RuneStoneItem)entry.getValue()).strengthen));
            }

            heroBuilder.addRuneStone(wearBuilder);
         }

         heroBuilder.setOrnament(this.packOrnamentInfo());

         for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroWarcraftInfo.Builder warcraftBuilder = CommonMsg.HeroWarcraftInfo.newBuilder();
            warcraftBuilder.setPosition(position);
            warcraftBuilder.setId((Integer)entry.getValue());
            heroBuilder.addWarcraft(warcraftBuilder);
         }

         if (this.warFlag != null) {
            CommonMsg.WarFlagInfo.Builder warFlagBuilder = CommonMsg.WarFlagInfo.newBuilder();
            warFlagBuilder.setId(this.warFlag.id);
            warFlagBuilder.setStrongLv(this.warFlag.strongLv);
            warFlagBuilder.setRecastNum(this.warFlag.recastNum);
            warFlagBuilder.setHighRecastNum(this.warFlag.highRecastNum);

            for(PropertyModel strongProperty : this.warFlag.strongProperties) {
               warFlagBuilder.addStrongPros(strongProperty.builder());
            }

            for(PropertyModel recastProperty : this.warFlag.recastProperties) {
               warFlagBuilder.addRecastPros(recastProperty.builder());
            }

            heroBuilder.setWafFlag(warFlagBuilder);
         }

         if (this.totem != null) {
            CommonMsg.TotemInfo.Builder totemBuilder = CommonMsg.TotemInfo.newBuilder();
            totemBuilder.setId(this.totem.id);
            totemBuilder.setLevel(this.totem.level);
            totemBuilder.setBreachLv(this.totem.breachLv);
            heroBuilder.setTotemInfo(totemBuilder);
         }

         for(Map.Entry<Integer, List> entry : this.talent.entrySet()) {
            CommonMsg.TalentInfo.Builder infoBuilder = CommonMsg.TalentInfo.newBuilder();
            infoBuilder.setPosition(CommonMsg.WearPosition.forNumber((Integer)entry.getKey()));
            infoBuilder.setLv((Integer)((List)entry.getValue()).get(0));
            if (((List)entry.getValue()).size() > 1) {
               infoBuilder.setIndex((Integer)((List)entry.getValue()).get(1));
            } else {
               infoBuilder.setIndex(-1);
            }

            heroBuilder.addTalentInfos(infoBuilder.build());
         }

         heroBuilder.setTreasureLev(this.treasureLev);
         heroBuilder.setTreasureStage(this.treasureStage);
         if (this.exTreasure != null) {
            heroBuilder.setExclusiveInfo(this.packExclusive());
         }

         if (this.rune != null) {
            heroBuilder.setRuneAndRefineInfo(this.toBuilderRuneAndRefineInfo());
         }

         if (this.warHorse != null) {
            CommonMsg.WarHorseInfo.Builder warHorseBuilder = CommonMsg.WarHorseInfo.newBuilder();
            warHorseBuilder.setId(this.warHorse.id);
            warHorseBuilder.setLv(this.warHorse.lv);
            warHorseBuilder.setExp(this.warHorse.exp);
            warHorseBuilder.setArtificeVal(this.warHorse.artificeVal);
            warHorseBuilder.setSkinId(this.warHorse.skinId);
            warHorseBuilder.setIsLock(this.warHorse.isLock);
            warHorseBuilder.addAllHorseLockSkill(this.warHorse.lockSkilIndex);
            warHorseBuilder.addAllUpSkills(this.warHorse.upSkills);
            warHorseBuilder.setIsMainSkillUnlock(this.warHorse.isUnlock);
            warHorseBuilder.setIsAwaken(this.warHorse.isAwaken);

            for(PropertyModel warHorseBasePro : this.warHorseBasePros) {
               warHorseBuilder.addWarHorseBasePros(warHorseBasePro.builder());
            }

            if (!this.warHorse.awakenIndex.isEmpty()) {
               warHorseBuilder.addAllAwakenIndex(this.warHorse.awakenIndex);
            }

            heroBuilder.setWarHorse(warHorseBuilder);
         }

         if (!this.strengthLev.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : this.strengthLev.entrySet()) {
               if ((Integer)entry.getValue() > 0) {
                  CommonMsg.HeroEquipStrengthInfo.Builder strengthBuilder = CommonMsg.HeroEquipStrengthInfo.newBuilder();
                  CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
                  strengthBuilder.setPosition(position);
                  strengthBuilder.setStrengthLev((Integer)entry.getValue());
                  heroBuilder.addStrengthInfo(strengthBuilder);
               }
            }
         }

         if (!this.strengthSkill.isEmpty()) {
            this.packStrengthSKill(heroBuilder);
         }

         if (!this.armyArrayDatas.isEmpty()) {
            this.packArmyArrayData(heroBuilder);
         }

         heroBuilder.addAllStarMapPointInfo(StarMapDefine.toBuilderStarMapPointInfoList(this.starMap));
         heroBuilder.setStarMapTotalLv(StarMapDefine.recStarMapTotalLv(this.starMap));
         if (!this.palaceStarSkill.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : this.palaceStarSkill.entrySet()) {
               CommonMsg.MapDataII.Builder mapBuilder = CommonMsg.MapDataII.newBuilder();
               mapBuilder.setKey((Integer)entry.getKey());
               mapBuilder.setValue((Integer)entry.getValue());
               heroBuilder.addSelectSkill(mapBuilder);
            }
         }

         if (null != this.godBeastItem) {
            heroBuilder.setGodBeastInfo(GodBeastDefine.recGodBeastInfoBuilder(this.godBeastItem));
         }

         heroBuilder.setInheritNation(this.inheritNation);
         heroBuilder.setLinkCode(this.linkCode);
         heroBuilder.setBeLinkCode(this.beLinkCode);
      }

      return heroBuilder;
   }

   public CommonMsg.RuneAndRefineInfo.Builder toBuilderRuneAndRefineInfo() {
      CommonMsg.RuneAndRefineInfo.Builder runeAndRefineInfoBuilder = CommonMsg.RuneAndRefineInfo.newBuilder();
      if (null != this.rune && !this.rune.runeMap.isEmpty()) {
         Map<Integer, RuneItem> runeMap = this.rune.runeMap;
         Map<Integer, RuneRefineInheritItem> runeRefineMap = this.rune.runeRefineMap;

         for(Map.Entry<Integer, RuneItem> runeItemEntry : runeMap.entrySet()) {
            Integer positionNum = (Integer)runeItemEntry.getKey();
            RuneItem runeItem = (RuneItem)runeItemEntry.getValue();
            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (null == runeMainModel) {
               logger.error("RuneMain 缺少配置 id:{}", runeItem.id);
            } else {
               CommonMsg.RuneInfo.Builder runeInfoBuilder = CommonMsg.RuneInfo.newBuilder();
               runeInfoBuilder.setPosition(CommonMsg.RunePosition.forNumber(positionNum));
               runeInfoBuilder.setRuneId(runeMainModel.getId());
               runeInfoBuilder.setRuneLv(runeItem.level);
               runeInfoBuilder.setUpgradeProgress(runeItem.upgradeProgress);
               runeAndRefineInfoBuilder.addRuneInfo(runeInfoBuilder);
               RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeRefineMap.get(positionNum);
               if (null != runeRefineInheritItem) {
                  RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItem.breakUpTime);
                  if (null == runeRefineLvNatureModel) {
                     logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", positionNum, runeRefineInheritItem.breakUpTime);
                  } else {
                     CommonMsg.RuneRefineInfo.Builder runeRefineInfoBuilder = CommonMsg.RuneRefineInfo.newBuilder();
                     runeRefineInfoBuilder.setPosition(CommonMsg.RunePosition.forNumber(positionNum));
                     runeRefineInfoBuilder.setRefineLv(runeRefineLvNatureModel.getRefineLv());
                     runeRefineInfoBuilder.setBreakUpTime(runeRefineInheritItem.breakUpTime);

                     for(Map.Entry<Integer, PropertyModel> entry : runeRefineInheritItem.refinePro.entrySet()) {
                        runeRefineInfoBuilder.addRefineProperty(runeRefineInheritItem.toBuilderRefineProperty((Integer)entry.getKey()));
                     }

                     runeAndRefineInfoBuilder.addRuneRefineInfo(runeRefineInfoBuilder);
                  }
               }
            }
         }

         RunePropertiesAndSkills suitProAndSkillIdList = this.getSuitProAndSkillIdList();
         if (suitProAndSkillIdList != null && suitProAndSkillIdList.getSkillList().size() > 0) {
            for(int skillId : suitProAndSkillIdList.getSkillList()) {
               runeAndRefineInfoBuilder.addSkillId(skillId);
            }
         }

         return runeAndRefineInfoBuilder;
      } else {
         return runeAndRefineInfoBuilder;
      }
   }

   public RunePropertiesAndSkills getSuitProAndSkillIdList() {
      List<PropertyModel> suitProList = new ArrayList();
      List<Integer> suitSkillIdList = new ArrayList();
      if (null != this.rune && !this.rune.runeMap.isEmpty()) {
         Map<Integer, Set<Integer>> suitId_runeIdSetMap = new HashMap();
         Map<Integer, List<Integer>> suitId_runeQualityListMap = new HashMap();
         Map<Integer, Integer> suitId_minRuneQuality = new HashMap();

         for(Map.Entry<Integer, RuneItem> runeItemEntry : this.rune.runeMap.entrySet()) {
            RuneItem runeItem = (RuneItem)runeItemEntry.getValue();
            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (null != runeMainModel) {
               (suitId_runeIdSetMap.computeIfAbsent(runeMainModel.getSuitId(), (k) -> new HashSet())).add(runeMainModel.getId());
               ((List)suitId_runeQualityListMap.computeIfAbsent(runeMainModel.getSuitId(), (k) -> new ArrayList())).add(runeMainModel.getQuality());
               Integer minRuneQuality = (Integer)suitId_minRuneQuality.get(runeMainModel.getSuitId());
               if (null == minRuneQuality) {
                  suitId_minRuneQuality.put(runeMainModel.getSuitId(), runeMainModel.getQuality());
               } else if (minRuneQuality > runeMainModel.getQuality()) {
                  suitId_minRuneQuality.put(runeMainModel.getSuitId(), runeMainModel.getQuality());
               }
            }
         }

         int skill4SuitModelId = 0;

         for(Map.Entry<Integer, Set<Integer>> suitId_runeIds : suitId_runeIdSetMap.entrySet()) {
            Integer suitId = (Integer)suitId_runeIds.getKey();
            Set<Integer> runeIds = suitId_runeIds.getValue();
            if (runeIds.size() >= 2) {
               int suitSkill2RuneQuality = 0;
               if (runeIds.size() == 2) {
                  Integer minRuneQuality = (Integer)suitId_minRuneQuality.get(suitId);
                  if (null == minRuneQuality) {
                     logger.error("suitId_minRuneQuality未找到最低品质符文 suitId:{}", suitId);
                     continue;
                  }

                  suitSkill2RuneQuality = minRuneQuality;
               } else if (runeIds.size() > 2) {
                  List<Integer> runeQualityList = (List)suitId_runeQualityListMap.get(suitId);
                  if (runeQualityList == null || runeQualityList.size() <= 2) {
                     logger.error("suitId_runeQualityListMap未找到对应套装符文品质列表");
                     continue;
                  }

                  List<Integer> runeQualityListSorted = (List)runeQualityList.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
                  suitSkill2RuneQuality = (Integer)runeQualityListSorted.get(1);
               }

               RuneSuitModel runeSuitNature2Model = this.getRuneSuitNature2Model(suitId, suitSkill2RuneQuality);
               if (null != runeSuitNature2Model) {
                  suitProList.addAll(runeSuitNature2Model.getSuitSkill2());
               }
            }

            if (runeIds.size() >= 4) {
               Integer minRuneQuality = (Integer)suitId_minRuneQuality.get(suitId);
               if (null == minRuneQuality) {
                  logger.error("suitId_minRuneQuality未找到最低品质符文 suitId:{}", suitId);
               } else {
                  RuneSuitModel runeSuitSkill4Model = this.getRuneSuitSkill4Model(suitId, minRuneQuality);
                  if (null != runeSuitSkill4Model) {
                     suitSkillIdList.add(runeSuitSkill4Model.getSuitSkill4());
                     skill4SuitModelId = runeSuitSkill4Model.getId();
                  }
               }
            }
         }

         RunePropertiesAndSkills proAndSkills = new RunePropertiesAndSkills(suitProList, suitSkillIdList, skill4SuitModelId);
         return proAndSkills;
      } else {
         RunePropertiesAndSkills proAndSkills = new RunePropertiesAndSkills(suitProList, suitSkillIdList, 0);
         return proAndSkills;
      }
   }

   public RuneSuitModel getRuneSuitNature2Model(int suitId, int suitSkill2RuneQuality) {
      ConcurrentHashMap<Integer, RuneSuitModel> maxRuneNature_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneSuitNature2", suitId);
      if (null == maxRuneNature_model) {
         return null;
      } else {
         RuneSuitModel runeSuitModel = (RuneSuitModel)maxRuneNature_model.get(suitSkill2RuneQuality);
         return runeSuitModel;
      }
   }

   public RuneSuitModel getRuneSuitSkill4Model(int suitId, int minRuneQuality) {
      ConcurrentHashMap<Integer, RuneSuitModel> minRuneQuality_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneSuitSkill4", suitId);
      RuneSuitModel runeSuitModel = (RuneSuitModel)minRuneQuality_model.get(minRuneQuality);
      return runeSuitModel;
   }

   private void packStrengthSKill(CommonMsg.HeroInfo.Builder heroBuilder) {
      int minLev = this.getMinLev();
      if (!this.strengthSkill.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : this.strengthSkill.entrySet()) {
            if ((Integer)entry.getValue() > 0 && (Integer)entry.getKey() <= minLev) {
               CommonMsg.EquipStrengthSkillInfo.Builder strengthBuilder = CommonMsg.EquipStrengthSkillInfo.newBuilder();
               CommonMsg.StrengthSkillPosition position = CommonMsg.StrengthSkillPosition.forNumber((Integer)entry.getValue());
               strengthBuilder.setStrengthLev((Integer)entry.getKey());
               strengthBuilder.setPosition(position);
               heroBuilder.addStrengthSkillInfo(strengthBuilder);
            }
         }
      }

   }

   private void packArmyArrayData(CommonMsg.HeroInfo.Builder heroBuilder) {
      for(ArmyArrayData armyArrayData : this.armyArrayDatas) {
         CommonMsg.ArmyArrayData.Builder armyArrayDataMsg = CommonMsg.ArmyArrayData.newBuilder();
         armyArrayDataMsg.setArrayId(armyArrayData.arrayId);

         for(Map.Entry<Integer, ResourceModel> entry : armyArrayData.protectedMap.entrySet()) {
            ResourceModel resourceModel = (ResourceModel)entry.getValue();
            CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
            builder.setType(resourceModel.getType());
            builder.setId(resourceModel.getId());
            builder.setNum(resourceModel.getValue());
            builder.setPos((Integer)entry.getKey());
            armyArrayDataMsg.addProtectData(builder);
         }

         heroBuilder.addArmyArrayData(armyArrayDataMsg);
      }

   }

   public RuneMainModel getRuneMainModel(int runeId) {
      RuneMainModel model = (RuneMainModel)ApplicationContextProvider.getModelPoolEntity("RuneMain", runeId);
      if (null == model) {
         logger.error("RuneMain配置为空 id:{}", runeId);
      }

      return model;
   }

   public RuneRefineLvNatureModel getRuneRefineLvNatureModel(int seat, int breakUpTime) {
      ConcurrentHashMap<Integer, RuneRefineLvNatureModel> breakUpTime_model = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customRuneRefinelvNature", seat);
      if (null == breakUpTime_model) {
         logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         return null;
      } else {
         RuneRefineLvNatureModel model = (RuneRefineLvNatureModel)breakUpTime_model.get(breakUpTime);
         if (null == model) {
            logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         }

         return (RuneRefineLvNatureModel)breakUpTime_model.get(breakUpTime);
      }
   }

   public int getMinLev() {
      int minLev = Integer.MAX_VALUE;
      if (this.equips.size() != 4) {
         return 0;
      } else {
         String limit = ApplicationContextProvider.getConfigString("RefineOpenLevel", "6|4");
         String[] limitLev = limit.split("\\|");
         int limitQuality = Integer.parseInt(limitLev[0]);
         int limitStar = Integer.parseInt(limitLev[1]);
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

         for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
            if (!this.strengthLev.containsKey(entry.getKey())) {
               return 0;
            }

            if (minLev > (Integer)this.strengthLev.get(entry.getKey())) {
               minLev = (Integer)this.strengthLev.get(entry.getKey());
            }

            ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", ((EquipItem)entry.getValue()).id);
            if (itemModel == null) {
               return 0;
            }

            if (itemModel.getQuality() < limitQuality || itemModel.getStar() < limitStar) {
               return 0;
            }
         }

         return minLev;
      }
   }

   public CommonMsg.ExclusiveInfo.Builder packExclusive() {
      CommonMsg.ExclusiveInfo.Builder exclusiveBuilder = CommonMsg.ExclusiveInfo.newBuilder();
      exclusiveBuilder.setLev(this.exTreasure.lev);
      exclusiveBuilder.setStar(this.exTreasure.star);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      ExclusiveTreasureActivationModel activationModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition1);
      Map<Integer, Integer> numMap = new HashMap();
      if (!this.exTreasure.stoneMap.isEmpty()) {
         for(Integer stoneId : this.exTreasure.stoneMap.values()) {
            ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
            if (stoneModel != null) {
               int tempNum = (Integer)MapUtil.getOrDefault(numMap, stoneModel.getType(), 0);
               numMap.put(stoneModel.getType(), tempNum + 1);
            }
         }

         int num1 = (Integer)MapUtil.getOrDefault(numMap, 1, 0);
         int num2 = (Integer)MapUtil.getOrDefault(numMap, 2, 0);
         int num3 = (Integer)MapUtil.getOrDefault(numMap, 3, 0);
         if (num1 >= activationModel.getTriangleNum() && num2 >= activationModel.getSquareNum() && num3 >= activationModel.getCircularNum()) {
            ExclusiveTreasureExtraModel extraModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.extraProId);
            if (extraModel != null) {
               exclusiveBuilder.setExtraProId(this.exTreasure.extraProId);
            }
         }

         ExclusiveTreasureActivationModel skillModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition2);
         if (num1 >= skillModel.getTriangleNum() && num2 >= skillModel.getSquareNum() && num3 >= skillModel.getCircularNum()) {
            ExclusiveTreasureExtraModel extraSkillModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.skillId);
            if (extraSkillModel != null) {
               exclusiveBuilder.setSkillId(extraSkillModel.getSkillId());
            }
         }

         for(Map.Entry<CommonMsg.StonePosition, Integer> entry : this.exTreasure.stoneMap.entrySet()) {
            CommonMsg.TreasureStone.Builder stoneBuilder = CommonMsg.TreasureStone.newBuilder();
            stoneBuilder.setPosition((CommonMsg.StonePosition)entry.getKey());
            stoneBuilder.setId((Integer)entry.getValue());
            exclusiveBuilder.addExclusiveStone(stoneBuilder);
         }
      }

      return exclusiveBuilder;
   }

   public CommonMsg.HeroOrnamentInfo.Builder packOrnamentInfo() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Set<Integer> skillSet = new HashSet();
      CommonMsg.HeroOrnamentInfo.Builder ornamentBuilder = CommonMsg.HeroOrnamentInfo.newBuilder();

      for(Map.Entry<Integer, OrnamentItem> entry : this.ornament.entrySet()) {
         OrnamentItem data = (OrnamentItem)entry.getValue();
         CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
         CommonMsg.OrnamentWear.Builder wearBuilder = CommonMsg.OrnamentWear.newBuilder();
         wearBuilder.setPosition(position);
         wearBuilder.setId(data.id);
         wearBuilder.setLev(data.lev);
         wearBuilder.setClearNum1(data.clearNum1);
         wearBuilder.setClearNum2(data.clearNum2);
         wearBuilder.setClearNum3(data.clearNum3);
         wearBuilder.setClearNum4(data.clearNum4);
         wearBuilder.setClearNum5(data.clearNum5);
         wearBuilder.addClearNum(data.clearNum1);
         wearBuilder.addClearNum(data.clearNum2);
         wearBuilder.addClearNum(data.clearNum3);
         wearBuilder.addClearNum(data.clearNum4);
         wearBuilder.addClearNum(data.clearNum5);

         for(PropertyModel value : data.proMap.values()) {
            wearBuilder.addExtraPro(value.builder());
         }

         for(PropertyModel value : data.clearProMap.values()) {
            wearBuilder.addClearExtraPro(value.builder());
         }

         wearBuilder.addAllProColour(data.proColour);
         wearBuilder.addAllExtraProColour(data.clearProColour);
         ornamentBuilder.addInfo(wearBuilder);
      }

      Map<String, ArrayList<StampModel>> setMap = new HashMap();

      for(OrnamentItem ornamentItem : this.ornament.values()) {
         StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", ornamentItem.id);
         if (setMap.containsKey(stampModel.getSetType() + "-" + stampModel.getSetId())) {
            ((ArrayList)setMap.get(stampModel.getSetType() + "-" + stampModel.getSetId())).add(stampModel);
         } else {
            ArrayList<StampModel> list = new ArrayList();
            list.add(stampModel);
            setMap.put(stampModel.getSetType() + "-" + stampModel.getSetId(), list);
         }
      }

      for(List<StampModel> stampList : setMap.values()) {
         if (stampList.size() == 4) {
            int starMin = 100;

            for(int i = 0; i < stampList.size(); ++i) {
               if (starMin > ((StampModel)stampList.get(i)).getStar()) {
                  starMin = ((StampModel)stampList.get(i)).getStar();
               }
            }

            StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
            if (setModel.getSpSkillId().size() >= starMin) {
               skillSet.add(setModel.getSpSkillId().get(starMin - 1));
            }

            int maxStar = 0;
            int minStar = Integer.MAX_VALUE;
            Map<Integer, Integer> specialMap = new HashMap();

            for(StampModel stampModel : stampList) {
               MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
            }

            if (!specialMap.isEmpty()) {
               for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
                  if ((Integer)entry.getKey() < minStar) {
                     minStar = (Integer)entry.getKey();
                  }

                  if ((Integer)entry.getValue() >= 2 && (Integer)entry.getKey() > maxStar) {
                     maxStar = (Integer)entry.getKey();
                  }
               }
            }

            if (maxStar > 0 && setModel.getSetSkillId().size() >= maxStar) {
               skillSet.add(setModel.getSetSkillId().get(maxStar - 1));
            } else if (minStar != 0) {
               skillSet.add(setModel.getSetSkillId().get(minStar - 1));
            }
         } else if (stampList.size() == 2) {
            int minStar = Integer.MAX_VALUE;

            for(StampModel stampModel : stampList) {
               if (stampModel.getStar() < minStar) {
                  minStar = stampModel.getStar();
               }
            }

            StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
            if (setModel != null) {
               skillSet.add(setModel.getSetSkillId().get(minStar - 1));
            }
         } else if (stampList.size() == 3) {
            int specialStar = 0;
            int minStar = Integer.MAX_VALUE;
            Map<Integer, Integer> specialMap = new HashMap();

            for(StampModel stampModel : stampList) {
               MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
            }

            for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
               if ((Integer)entry.getKey() < minStar) {
                  minStar = (Integer)entry.getKey();
               }

               if ((Integer)entry.getValue() >= 2) {
                  specialStar = (Integer)entry.getKey();
               }
            }

            StampSetModel setModel = (StampSetModel)gameModelPool.getEntity("StampSet", ((StampModel)stampList.get(0)).getSetId());
            if (setModel != null) {
               if (specialStar != 0) {
                  skillSet.add(setModel.getSetSkillId().get(specialStar - 1));
               } else if (minStar != 0) {
                  skillSet.add(setModel.getSetSkillId().get(minStar - 1));
               }
            }
         }
      }

      ornamentBuilder.addAllSkill(skillSet);
      return ornamentBuilder;
   }

   public static HeroMirror fromHeroByDecisive(HeroDao heroDao) {
      HeroMirror heroMirror = new HeroMirror();
      heroMirror.playerId = heroDao.playerId;
      heroMirror.code = heroDao.code;
      heroMirror.id = heroDao.id;
      heroMirror.lv = heroDao.getLvWithPromote();
      heroMirror.star = heroDao.getStar();
      heroMirror.breachLv = heroDao.getBreachLv();
      heroMirror.quality = heroDao.quality;
      heroMirror.combatPower = heroDao.combatPower;
      heroMirror.states.addAll(heroDao.getStateList());
      heroMirror.totalFightProperties.putAll(heroDao.totalFightProperties);
      heroMirror.totalShowProperties.putAll(heroDao.totalShowProperties);
      heroMirror.warriors.putAll(heroDao.warriors);
      heroMirror.warcrafts.putAll(heroDao.warcrafts);
      heroMirror.ornament.putAll(heroDao.ornament);
      heroMirror.talent.putAll(heroDao.talent);
      heroMirror.talentSkills.clear();
      heroMirror.talentSkills.addAll(heroDao.getTalentSkill());
      heroMirror.heroSkills.addAll(heroDao.heroCastSoulSkills);
      heroMirror.inheritNation = heroDao.inheritNation;
      Map<Integer, StarMapPoint> heroStarMap = heroDao.recHeroStarMapPointMap();
      heroMirror.starMap.putAll((Map)(heroStarMap == null ? new HashMap() : heroStarMap));
      heroMirror.invalidTime = heroDao.invalidTime;
      heroMirror.linkCode = heroDao.linkCode;
      heroMirror.beLinkCode = heroDao.beLinkCode;
      heroMirror.dragonVeinSkills = heroDao.dragonVeinSkills;
      return heroMirror;
   }

   public CommonMsg.HeroInfo.Builder toBuilderForDecisive() {
      CommonMsg.HeroInfo.Builder heroBuilder = CommonMsg.HeroInfo.newBuilder();
      heroBuilder.setCode(this.code);
      heroBuilder.setId(this.id);
      heroBuilder.setLv(this.lv);
      heroBuilder.setQuality(this.quality);
      heroBuilder.setStar(this.star);
      heroBuilder.setBreachLv(this.breachLv);
      heroBuilder.setCombatPower(this.combatPower);
      heroBuilder.addAllState(this.states);
      heroBuilder.setAide(this.aide);
      heroBuilder.setAide2(this.aide2);
      heroBuilder.setAideTrammelsId(this.aideTrammelsId);
      heroBuilder.setPromoteLv(this.promoteLv);
      heroBuilder.addAllDestinySkills(this.destinySkills);
      heroBuilder.setPalaceTitle(this.palaceTitle);
      heroBuilder.setShareHeroId(this.shareHeroId);

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         if (this.totalShowProperties.get(i) != null) {
            heroBuilder.addProperties(((Long)this.totalShowProperties.get(i)).intValue());
         } else {
            heroBuilder.addProperties(0);
         }
      }

      for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
         if (this.totalFightProperties.get(i) != null) {
            heroBuilder.addFightProperties(((Long)this.totalShowProperties.get(i)).intValue());
         } else {
            heroBuilder.addFightProperties(0);
         }
      }

      heroBuilder.addAllUnlockHeroSkills(this.heroSkills);
      if (this.isNeedFlush()) {
         for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroWarriorSignetInfo.Builder warriorSignetBuilder = CommonMsg.HeroWarriorSignetInfo.newBuilder();
            warriorSignetBuilder.setPosition(position);
            warriorSignetBuilder.setId(((WarriorSignet)entry.getValue()).id);
            warriorSignetBuilder.setScore(((WarriorSignet)entry.getValue()).score);

            for(Integer skillId : ((WarriorSignet)entry.getValue()).skills) {
               warriorSignetBuilder.addSkills(skillId);
            }

            for(PropertyModel property : ((WarriorSignet)entry.getValue()).properties) {
               warriorSignetBuilder.addProperty(property.builder());
            }

            for(PropertyModel recastPro : ((WarriorSignet)entry.getValue()).recastPros) {
               warriorSignetBuilder.addRecastPros(recastPro.builder());
            }

            for(Integer recastSkill : ((WarriorSignet)entry.getValue()).recastSkills) {
               warriorSignetBuilder.addRecastSkills(recastSkill);
            }

            WarriorSignetDefine.addExclusiveAttrAndSkill(((WarriorSignet)entry.getValue()).id, warriorSignetBuilder);
            heroBuilder.addWarriorSignets(warriorSignetBuilder);
         }

         for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
            CommonMsg.WearPosition position = CommonMsg.WearPosition.forNumber((Integer)entry.getKey());
            CommonMsg.HeroWarcraftInfo.Builder warcraftBuilder = CommonMsg.HeroWarcraftInfo.newBuilder();
            warcraftBuilder.setPosition(position);
            warcraftBuilder.setId((Integer)entry.getValue());
            heroBuilder.addWarcraft(warcraftBuilder);
         }
      }

      heroBuilder.setInheritNation(this.inheritNation);
      heroBuilder.setLinkCode(this.linkCode);
      heroBuilder.setBeLinkCode(this.beLinkCode);
      return heroBuilder;
   }

   public HeroMirror clone() throws CloneNotSupportedException {
      return (HeroMirror)super.clone();
   }

   public byte[] toByteArray() {
      return this.encode().getBytes();
   }

   public static HeroMirror toHeroMirror(byte[] bytes) {
      String str = new String(bytes);
      if (str.startsWith("{")) {
         return (HeroMirror)JSONUtil.toBean(str, HeroMirror.class);
      } else {
         HeroMirror _mirror = new HeroMirror();
         _mirror.decode(str);
         return _mirror;
      }
   }

   public String encode() {
      StringBuffer sb = new StringBuffer();
      sb.append(this.playerId).append("\u0011");
      sb.append(this.code).append("\u0011");
      sb.append(this.id).append("\u0011");
      sb.append(this.lv).append("\u0011");
      sb.append(this.limitLv).append("\u0011");
      sb.append(this.star).append("\u0011");
      sb.append(this.breachLv).append("\u0011");
      sb.append(this.quality).append("\u0011");
      sb.append(this.dressId).append("\u0011");
      sb.append(this.dressLv).append("\u0011");
      sb.append(this.combatPower).append("\u0011");
      sb.append(this.aide).append("\u0011");
      sb.append(this.treasureLev).append("\u0011");
      sb.append(this.treasureStage).append("\u0011");
      sb.append(this.dressHeroId).append("\u0011");
      if (this.totem != null) {
         sb.append(this.totem.encode());
      }

      sb.append("\u0011");
      if (this.warFlag != null) {
         sb.append(this.warFlag.encode());
      }

      sb.append("\u0011");
      if (this.warHorse != null) {
         sb.append(this.warHorse.encode());
      }

      sb.append("\u0011");
      if (this.exTreasure != null) {
         sb.append(this.exTreasure.encode());
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(((EquipItem)entry.getValue()).encode()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Integer> entry : this.castSouls.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(((WarriorSignet)entry.getValue()).encode()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, OrnamentItem> entry : this.ornament.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(((OrnamentItem)entry.getValue()).encode()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, RuneStoneItem> entry : this.runeStone.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(((RuneStoneItem)entry.getValue()).encode()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, List> entry : this.talent.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");

         for(Object o : (List)entry.getValue()) {
            sb.append(o).append("\u0013");
         }

         sb.append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Long> entry : this.totalFightProperties.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Long> entry : this.totalShowProperties.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(PropertyModel warHorseBasePro : this.warHorseBasePros) {
         sb.append(warHorseBasePro.getType()).append("\u0013");
         sb.append(warHorseBasePro.getWay()).append("\u0013");
         sb.append(warHorseBasePro.getValue()).append("\u0013");
         sb.append("\u0012");
      }

      sb.append("\u0011");

      for(Integer heroSkill : this.heroSkills) {
         sb.append(heroSkill).append("\u0012");
      }

      sb.append("\u0011");

      for(Integer state : this.states) {
         sb.append(state).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Integer> entry : this.strengthLev.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Integer> entry : this.strengthSkill.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");

      for(Integer activeDressId : this.activeDressIds) {
         sb.append(activeDressId).append("\u0012");
      }

      sb.append("\u0011");
      sb.append(this.promoteLv);
      sb.append("\u0011");

      for(Integer activeDressId : this.destinySkills) {
         sb.append(activeDressId).append("\u0012");
      }

      sb.append("\u0011");
      sb.append(this.palaceTitle);
      sb.append("\u0011");

      for(Integer skillId : this.talentSkills) {
         sb.append(skillId).append("\u0012");
      }

      sb.append("\u0011");
      if (this.rune != null) {
         sb.append(this.rune.encode());
      }

      sb.append("\u0011");
      sb.append(this.shareHeroId);
      sb.append("\u0011");

      for(Integer skill : this.armyArraySkill) {
         sb.append(skill).append("\u0012");
      }

      sb.append("\u0011");

      for(ArmyArrayData armyArrayData : this.armyArrayDatas) {
         sb.append(armyArrayData.encode()).append("\u0012");
      }

      sb.append("\u0011");

      for(Integer pos : this.starAtlas) {
         sb.append(pos).append("\u0012");
      }

      sb.append("\u0011");

      for(Integer skillId : this.starAtlasSkill) {
         sb.append(skillId).append("\u0012");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : this.starMap.entrySet()) {
         StarMapPoint value = (StarMapPoint)starId_starMapPoint.getValue();
         sb.append(value.starId + ":" + value.starLv + ":" + value.optionSkillGroup);
         sb.append(",");
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, WorldPaintInfo> entry : this.worldPaintInfoMap.entrySet()) {
         WorldPaintInfo value = (WorldPaintInfo)entry.getValue();
         sb.append(value.getType() + ":" + value.getGrade() + ":" + value.getLv());
         sb.append(",");
      }

      sb.append("\u0011");
      if (this.godBeastItem != null) {
         sb.append(this.godBeastItem.encode());
      }

      sb.append("\u0011");

      for(Map.Entry<Integer, Integer> entry : this.palaceStarSkill.entrySet()) {
         sb.append(entry.getKey()).append("\u0013");
         sb.append(entry.getValue()).append("\u0012");
      }

      sb.append("\u0011");
      sb.append(this.type).append("\u0011");
      sb.append(this.aide2).append("\u0011");
      sb.append(this.aideTrammelsId).append("\u0011");
      sb.append(this.inheritNation).append("\u0011");
      if (null != this.exclusiveWeaponMap && this.exclusiveWeaponMap.size() > 0) {
         for(Map.Entry<Integer, ExclusiveWeaponItem> entry : this.exclusiveWeaponMap.entrySet()) {
            Integer pos = (Integer)entry.getKey();
            ExclusiveWeaponItem weaponItem = (ExclusiveWeaponItem)entry.getValue();
            sb.append(pos).append(":").append(weaponItem.encode()).append(";");
         }
      }

      sb.append("\u0011");
      if (null != this.soulSkill && this.soulSkill.size() > 0) {
         for(Map.Entry<Integer, Integer> entry : this.soulSkill.entrySet()) {
            Integer slot = (Integer)entry.getKey();
            Integer skillId = (Integer)entry.getValue();
            sb.append(slot).append(":").append(skillId).append(";");
         }
      }

      sb.append("\u0011");
      sb.append(this.invalidTime);
      sb.append("\u0011");
      sb.append(this.linkCode);
      sb.append("\u0011");
      sb.append(this.beLinkCode);
      sb.append("\u0011");

      for(Integer dragonVeinSkill : this.dragonVeinSkills) {
         sb.append(dragonVeinSkill).append("_");
      }

      sb.append("\u0011");
      return sb.toString();
   }

   public void decode(String str) {
      if (StrUtil.isNotEmpty(str)) {
         String[] array = str.split("\u0011");
         if (array.length < 15) {
            return;
         }

         this.playerId = Integer.parseInt(array[0]);
         this.code = Integer.parseInt(array[1]);
         this.id = Integer.parseInt(array[2]);
         this.lv = Integer.parseInt(array[3]);
         this.limitLv = Integer.parseInt(array[4]);
         this.star = Integer.parseInt(array[5]);
         this.breachLv = Integer.parseInt(array[6]);
         this.quality = Integer.parseInt(array[7]);
         this.dressId = Integer.parseInt(array[8]);
         this.dressLv = Integer.parseInt(array[9]);
         this.combatPower = Long.parseLong(array[10]);
         this.aide = Integer.parseInt(array[11]);
         this.treasureLev = Integer.parseInt(array[12]);
         this.treasureStage = Integer.parseInt(array[13]);
         this.dressHeroId = Integer.parseInt(array[14]);
         if (array.length > 15 && StrUtil.isNotEmpty(array[15])) {
            this.totem = new Totem();
            this.totem.decode(array[15]);
         }

         if (array.length > 16 && StrUtil.isNotEmpty(array[16])) {
            this.warFlag = new WarFlag();
            this.warFlag.decode(array[16]);
         }

         if (array.length > 17 && StrUtil.isNotEmpty(array[17])) {
            this.warHorse = new WarHorse();
            this.warHorse.decode(array[17]);
         }

         if (array.length > 18 && StrUtil.isNotEmpty(array[18])) {
            this.exTreasure = new ExclusiveTreasure();
            this.exTreasure.decode(array[18]);
         }

         if (array.length > 19 && StrUtil.isNotEmpty(array[19])) {
            String[] array_sub_1 = array[19].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  EquipItem equipItem = new EquipItem();
                  equipItem.decode(array_sub_2[1]);
                  this.equips.put(Integer.parseInt(array_sub_2[0]), equipItem);
               }
            }
         }

         if (array.length > 20 && StrUtil.isNotEmpty(array[20])) {
            String[] array_sub_1 = array[20].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.castSouls.put(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]));
               }
            }
         }

         if (array.length > 21 && StrUtil.isNotEmpty(array[21])) {
            String[] array_sub_1 = array[21].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  WarriorSignet warriorSignet = new WarriorSignet();
                  warriorSignet.decode(array_sub_2[1]);
                  this.warriors.put(Integer.parseInt(array_sub_2[0]), warriorSignet);
               }
            }
         }

         if (array.length > 22 && StrUtil.isNotEmpty(array[22])) {
            String[] array_sub_1 = array[22].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.warcrafts.put(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]));
               }
            }
         }

         if (array.length > 23 && StrUtil.isNotEmpty(array[23])) {
            String[] array_sub_1 = array[23].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  OrnamentItem ornamentItem = new OrnamentItem();
                  ornamentItem.decode(array_sub_2[1]);
                  this.ornament.put(Integer.parseInt(array_sub_2[0]), ornamentItem);
               }
            }
         }

         if (array.length > 24 && StrUtil.isNotEmpty(array[24])) {
            String[] array_sub_1 = array[24].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  RuneStoneItem runeStoneItem = new RuneStoneItem();
                  runeStoneItem.decode(array_sub_2[1]);
                  this.runeStone.put(Integer.parseInt(array_sub_2[0]), runeStoneItem);
               }
            }
         }

         if (array.length > 25 && StrUtil.isNotEmpty(array[25])) {
            String[] array_sub_1 = array[25].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  List list = new ArrayList();

                  for(int i = 1; i < array_sub_2.length; ++i) {
                     list.add(Integer.parseInt(array_sub_2[i]));
                  }

                  this.talent.put(Integer.parseInt(array_sub_2[0]), list);
               }
            }
         }

         if (array.length > 26 && StrUtil.isNotEmpty(array[26])) {
            String[] array_sub_1 = array[26].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.totalFightProperties.put(Integer.parseInt(array_sub_2[0]), Long.parseLong(array_sub_2[1]));
               }
            }
         }

         if (array.length > 27 && StrUtil.isNotEmpty(array[27])) {
            String[] array_sub_1 = array[27].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.totalShowProperties.put(Integer.parseInt(array_sub_2[0]), Long.parseLong(array_sub_2[1]));
               }
            }
         }

         if (array.length > 28 && StrUtil.isNotEmpty(array[28])) {
            String[] array_sub_1 = array[28].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 3) {
                  PropertyModel propertyModel = new PropertyModel(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]), Long.parseLong(array_sub_2[2]));
                  this.warHorseBasePros.add(propertyModel);
               }
            }
         }

         if (array.length > 29 && StrUtil.isNotEmpty(array[29])) {
            String[] array_sub_1 = array[29].split("\u0012");

            for(String skillId : array_sub_1) {
               this.heroSkills.add(Integer.parseInt(skillId));
            }
         }

         if (array.length > 30 && StrUtil.isNotEmpty(array[30])) {
            String[] array_sub_1 = array[30].split("\u0012");

            for(String state : array_sub_1) {
               this.states.add(Integer.parseInt(state));
            }
         }

         if (array.length > 31 && StrUtil.isNotEmpty(array[31])) {
            String[] array_sub_1 = array[31].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.strengthLev.put(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]));
               }
            }
         }

         if (array.length > 32 && StrUtil.isNotEmpty(array[32])) {
            String[] array_sub_1 = array[32].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.strengthSkill.put(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]));
               }
            }
         }

         if (array.length > 33 && StrUtil.isNotEmpty(array[33])) {
            String[] array_sub_1 = array[33].split("\u0012");

            for(String activeDressId : array_sub_1) {
               this.activeDressIds.add(Integer.parseInt(activeDressId));
            }
         }

         if (array.length > 34) {
            this.promoteLv = Integer.parseInt(array[34]);
         }

         if (array.length > 35 && StrUtil.isNotEmpty(array[35])) {
            String[] array_sub_1 = array[35].split("\u0012");

            for(String skillId : array_sub_1) {
               this.destinySkills.add(Integer.parseInt(skillId));
            }
         }

         if (array.length > 36) {
            this.palaceTitle = Integer.parseInt(array[36]);
         }

         if (array.length > 37 && StrUtil.isNotEmpty(array[37])) {
            String[] array_sub_1 = array[37].split("\u0012");

            for(String skillId : array_sub_1) {
               this.talentSkills.add(Integer.parseInt(skillId));
            }
         }

         if (array.length > 38 && StrUtil.isNotEmpty(array[38])) {
            this.rune = new Rune();
            this.rune.decode(array[38]);
         }

         if (array.length > 39) {
            this.shareHeroId = Integer.parseInt(array[39]);
         }

         if (array.length > 40 && StrUtil.isNotEmpty(array[40])) {
            String[] array_sub_1 = array[40].split("\u0012");

            for(String skill : array_sub_1) {
               this.armyArraySkill.add(Integer.parseInt(skill));
            }
         }

         if (array.length > 41 && StrUtil.isNotEmpty(array[41])) {
            String[] array_sub_1 = array[41].split("\u0012");

            for(String tempStr : array_sub_1) {
               ArmyArrayData armyArrayData = new ArmyArrayData();
               armyArrayData.decode(tempStr);
               this.armyArrayDatas.add(armyArrayData);
            }
         }

         if (array.length > 42 && StrUtil.isNotEmpty(array[42])) {
            String[] array_sub_1 = array[42].split("\u0012");

            for(String skill : array_sub_1) {
               this.starAtlas.add(Integer.parseInt(skill));
            }
         }

         if (array.length > 43 && StrUtil.isNotEmpty(array[43])) {
            String[] array_sub_1 = array[43].split("\u0012");

            for(String skill : array_sub_1) {
               this.starAtlasSkill.add(Integer.parseInt(skill));
            }
         }

         if (array.length > 44 && StrUtil.isNotEmpty(array[44])) {
            this.starMap.clear();
            String[] pointStrArr = array[44].split(",");
            if (pointStrArr.length > 0) {
               for(String pointStr : pointStrArr) {
                  String[] starId_starLv_starSkillGroup = pointStr.split(":");
                  if (starId_starLv_starSkillGroup.length >= 3) {
                     int starId = Integer.parseInt(starId_starLv_starSkillGroup[0]);
                     int starLv = Integer.parseInt(starId_starLv_starSkillGroup[1]);
                     int starSkillGroup = Integer.parseInt(starId_starLv_starSkillGroup[2]);
                     this.starMap.put(starId, new StarMapPoint(starId, starLv, starSkillGroup));
                  }
               }
            }
         }

         if (array.length > 45 && StrUtil.isNotEmpty(array[45])) {
            this.worldPaintInfoMap.clear();
            String[] infoStrArr = array[45].split(",");
            if (infoStrArr.length > 0) {
               for(String infoStr : infoStrArr) {
                  String[] type_grade_lv = infoStr.split(":");
                  if (type_grade_lv.length >= 3) {
                     int type = Integer.parseInt(type_grade_lv[0]);
                     int grade = Integer.parseInt(type_grade_lv[1]);
                     int lv = Integer.parseInt(type_grade_lv[2]);
                     this.worldPaintInfoMap.put(type, new WorldPaintInfo(type, grade, lv));
                  }
               }
            }
         }

         if (array.length > 46 && StringUtil.isNotBlank(array[46])) {
            this.godBeastItem = new GodBeastItem();
            this.godBeastItem.decode(array[46]);
         }

         if (array.length > 47 && StrUtil.isNotEmpty(array[47])) {
            String[] array_sub_1 = array[47].split("\u0012");

            for(String tempStr : array_sub_1) {
               String[] array_sub_2 = tempStr.split("\u0013");
               if (array_sub_2.length >= 2) {
                  this.palaceStarSkill.put(Integer.parseInt(array_sub_2[0]), Integer.parseInt(array_sub_2[1]));
               }
            }
         }

         if (array.length > 48) {
            this.type = Integer.parseInt(array[48]);
         }

         if (array.length > 49) {
            this.aide2 = Integer.parseInt(array[49]);
         }

         if (array.length > 50) {
            this.aideTrammelsId = Integer.parseInt(array[50]);
         }

         if (array.length > 51) {
            this.inheritNation = Integer.parseInt(array[51]);
         }

         if (array.length > 52 && StringUtils.isNotBlank(array[52])) {
            String[] pos_weaponItemStrArr = array[52].split(";");

            for(String pos_weaponItemStr : pos_weaponItemStrArr) {
               String[] pos_weaponItem = pos_weaponItemStr.split(":");
               if (pos_weaponItem.length >= 2) {
                  int pos = Integer.parseInt(pos_weaponItem[0]);
                  ExclusiveWeaponItem weaponItem = new ExclusiveWeaponItem();
                  weaponItem.decode(pos_weaponItem[1]);
                  this.exclusiveWeaponMap.put(pos, weaponItem);
               }
            }
         }

         if (array.length > 53 && StringUtils.isNotBlank(array[53])) {
            String[] slot_skillStrArr = array[53].split(";");

            for(String slot_skillStr : slot_skillStrArr) {
               String[] slot_skill = slot_skillStr.split(":");
               if (slot_skill.length >= 2) {
                  int slot = Integer.parseInt(slot_skill[0]);
                  int skill = Integer.parseInt(slot_skill[1]);
                  this.soulSkill.put(slot, skill);
               }
            }
         }

         if (array.length > 54 && StringUtils.isNotBlank(array[54])) {
            this.invalidTime = Integer.parseInt(array[54]);
         }

         if (array.length > 55 && StringUtils.isNotBlank(array[55])) {
            this.linkCode = Integer.parseInt(array[55]);
         }

         if (array.length > 56 && StringUtils.isNotBlank(array[56])) {
            this.beLinkCode = Integer.parseInt(array[56]);
         }

         if (array.length > 57 && StringUtils.isNotBlank(array[57])) {
            String[] skillIds = array[57].split("_");

            for(String skillIdStr : skillIds) {
               this.dragonVeinSkills.add(Integer.parseInt(skillIdStr));
            }
         }
      }

   }
}
