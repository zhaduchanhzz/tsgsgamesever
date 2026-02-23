package com.gzbz.battle.entity;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffManager;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.conditionProperty.ConditionPropertyManager;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.passive.PassiveSkillMgr;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.dragonVein.DragonVeinDefine;
import com.gzbz.exclusiveWeapon.EWeaponDefine;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.RuneStoneItem;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.NeiDanSkillAndPro;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.AideTrammelsModel;
import com.gzbz.model.BattleHeroTrainingBuffModel;
import com.gzbz.model.BuffModel;
import com.gzbz.model.ExclusiveTreasureActivationModel;
import com.gzbz.model.ExclusiveTreasureExtraModel;
import com.gzbz.model.ExclusiveTreasureStoneModel;
import com.gzbz.model.FormationGemLvUpModel;
import com.gzbz.model.FormationGemSetModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.LeaderPalaceSkillConsumeModel;
import com.gzbz.model.LeaderTacticsSkillModel;
import com.gzbz.model.RefineSkillModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.StampSetModel;
import com.gzbz.model.StarPvpSystemModel;
import com.gzbz.model.TotemBreachModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.rune.bean.RunePropertiesAndSkills;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Entity implements Serializable {
   public static byte ENTITY_OFFSET_TYPE_BOSS = 1;
   public byte entityType;
   static Logger logger = LoggerFactory.getLogger(Entity.class);
   protected long attackValue;
   protected long damageValue;
   protected long recoverHp;
   protected BattleScene scene;
   protected byte originalPos;
   protected byte plotIndex;
   protected byte battlePos;
   protected byte teamPos;
   protected BattlePKTeam pkTeam;
   protected byte force;
   protected int id;
   protected int star;
   protected int code;
   protected int level;
   protected int skinId;
   protected byte skillOrder;
   protected byte offsetType;
   protected boolean attackDirty;
   protected boolean recoverDirty;
   protected boolean damageDirty;
   protected BattleMsg.EntityType type;
   protected HashMap<Integer, Long> baseProperties;
   protected HashMap<Integer, Long> showBaseProperties;
   protected boolean isChangeShow;
   protected ConditionPropertyManager conditionPropertyManager;
   protected EntitySkillManager skillManager;
   protected PassiveSkillMgr passiveSkillMgr;
   protected BuffManager buffManager;
   protected EntityStateManager stateManager;
   protected long skillDamageValue;
   protected long skillShowValue;
   protected long skillDamageValueLimit;
   protected Set<Integer> warriorSkillIds;
   protected Set<Integer> warcraftSkillwIds;
   protected List<Integer> heroSkills;
   protected Set<Integer> buffSkills;
   protected Set<Integer> activeDressIds;
   protected byte deadTimes;
   protected int aideBuff;
   protected int aideBuff2;
   protected int aideTrammelsSkillId;
   protected HeroMirror heroMirror;
   protected Entity recordEntity;
   protected long recordHpValue;
   protected byte hurtTimes;
   protected boolean attacked;
   protected long maxHpMax;
   private List<Integer> triggerEffectList;
   private long stageHpValue;
   public int inheritNation;
   private int fieldSkillShowRound;
   private int fieldSkillShowEffectId;
   private boolean firstModifyHp;

   public Entity() {
      this.entityType = 0;
      this.attackDirty = false;
      this.recoverDirty = false;
      this.damageDirty = false;
      this.baseProperties = new HashMap();
      this.showBaseProperties = new HashMap();
      this.isChangeShow = false;
      this.conditionPropertyManager = new ConditionPropertyManager();
      this.skillManager = new EntitySkillManager();
      this.passiveSkillMgr = new PassiveSkillMgr();
      this.buffManager = new BuffManager();
      this.stateManager = new EntityStateManager();
      this.skillDamageValue = 0L;
      this.skillShowValue = 0L;
      this.skillDamageValueLimit = -1L;
      this.warriorSkillIds = new HashSet();
      this.warcraftSkillwIds = new HashSet();
      this.heroSkills = new ArrayList();
      this.buffSkills = new HashSet();
      this.activeDressIds = new HashSet();
      this.triggerEffectList = new ArrayList();
      this.fieldSkillShowRound = -1;
      this.skillManager.init(this);
      this.buffManager.init(this);
      this.stateManager.init(this);
      this.passiveSkillMgr.init(this);
   }

   public Set<Integer> getWarriorSkillIds() {
      return this.warriorSkillIds;
   }

   public Entity(BattleMsg.EntityType type, HeroMirror heroMirror) {
      this();
      this.type = type;

      for(Map.Entry<Integer, Long> entry : heroMirror.totalFightProperties.entrySet()) {
         this.baseProperties.put(entry.getKey(), (Long)entry.getValue());
      }

      for(Map.Entry<Integer, Long> entry : heroMirror.totalShowProperties.entrySet()) {
         this.showBaseProperties.put(entry.getKey(), (Long)entry.getValue());
      }

      this.baseProperties.put(99, this.baseProperties.get(1));
      this.baseProperties.put(98, this.baseProperties.get(1));
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", heroMirror.id);
      if (heroModel == null) {
         logger.error("生成怪物时无法找到怪物id:" + heroMirror.id);
      } else {
         this.id = heroMirror.id;
         this.star = heroMirror.star;
         this.level = heroMirror.lv;
         this.maxHpMax = (Long)this.baseProperties.get(1);
         this.inheritNation = heroMirror.inheritNation;
         if (type == BattleMsg.EntityType.EntityType_Hero || type == BattleMsg.EntityType.EntityType_Friend) {
            this.code = heroMirror.code;
            this.heroMirror = heroMirror;
            if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_PALACE) {
               for(Integer heroSkill : heroMirror.heroSkills) {
                  LeaderTacticsSkillModel leaderTacticsSkillModel = (LeaderTacticsSkillModel)gameModelPool.getEntity("leaderTacticsSkill", heroSkill);
                  if (leaderTacticsSkillModel != null) {
                     this.heroSkills.add(leaderTacticsSkillModel.getJobskill().get(heroModel.getType() - 1));
                  } else {
                     this.heroSkills.add(heroSkill);
                  }
               }
            } else {
               this.heroSkills = heroMirror.heroSkills;
            }

            for(int v : heroMirror.warcrafts.values()) {
               this.warcraftSkillwIds.add(v);
            }

            for(WarriorSignet v : heroMirror.warriors.values()) {
               this.warriorSkillIds.addAll(v.skills);
               List<Integer> skillIdList = WarriorSignetDefine.getSkillIdList(v.id);
               this.warriorSkillIds.addAll(skillIdList);
            }

            if (heroMirror.aide > 0) {
               AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroMirror.aide);
               if (aideLevelModel != null) {
                  this.aideBuff = aideLevelModel.getAideSkillId();
               }

               if (heroMirror.aide2 > 0) {
                  AideLevelModel aideLevelModel2 = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroMirror.aide2);
                  if (aideLevelModel2 != null) {
                     this.aideBuff2 = aideLevelModel2.getAideSkillId();
                  }
               }
            }

            this.setActiveDressIds(this.heroMirror.activeDressIds);
            AideTrammelsModel trammelsModel = (AideTrammelsModel)ApplicationContextProvider.getModelPoolEntity("aideTrammels", heroMirror.aideTrammelsId);
            if (trammelsModel != null) {
               this.aideTrammelsSkillId = trammelsModel.getSkillId();
            }
         }

      }
   }

   public Entity(BattleMsg.EntityType type, BattleMonsterFun fun, List<WarriorSignet> warriorSignets) {
      this();
      this.type = type;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", fun.getId());
      if (heroModel == null) {
         logger.error("生成怪物时无法找到怪物id:" + fun.getId());
      } else {
         this.id = fun.getId();
         this.star = fun.getStar();
         this.level = fun.getLv();
         if (fun.getShowLv() > 0) {
            this.level = fun.getShowLv();
         }

         Monster monster = new Monster(this.id, fun.getLv(), this.star, fun.getOffset(), false, fun, warriorSignets);

         for(Map.Entry<Integer, Long> entry : monster.totalFightProperties.entrySet()) {
            this.baseProperties.put(entry.getKey(), (Long)entry.getValue());
         }

         this.heroMirror = HeroMirror.fromMonster(monster);
         this.heroSkills = monster.heroUnlockSkills;
         this.offsetType = monster.offsetType;
         this.warcraftSkillwIds = monster.skill_warriorignet;
         this.warriorSkillIds = monster.skill_warcraft;
         if (this.offsetType == ENTITY_OFFSET_TYPE_BOSS) {
            this.baseProperties.put(99, 137438953471L);
            this.baseProperties.put(1, 137438953471L);
            this.baseProperties.put(98, 137438953471L);
         } else {
            this.baseProperties.put(99, this.baseProperties.get(1));
            this.baseProperties.put(98, this.baseProperties.get(1));
         }

         Monster var9 = null;
      }
   }

   public Entity(BattleMsg.EntityType type, BattleMonsterFun fun) {
      this();
      this.type = type;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", fun.getId());
      if (heroModel == null) {
         logger.error("生成怪物时无法找到怪物id:" + fun.getId());
      } else {
         if (heroModel.getNation() == 10) {
            this.inheritNation = 4;
         }

         this.id = fun.getId();
         this.star = fun.getStar();
         this.level = fun.getLv();
         if (fun.getShowLv() > 0) {
            this.level = fun.getShowLv();
         }

         Monster monster = new Monster(this.id, fun.getLv(), this.star, fun.getOffset(), false, new ArrayList());

         for(Map.Entry<Integer, Long> entry : monster.totalFightProperties.entrySet()) {
            this.baseProperties.put(entry.getKey(), (Long)entry.getValue());
         }

         this.heroMirror = HeroMirror.fromMonster(monster);
         this.heroSkills = monster.heroUnlockSkills;
         this.offsetType = monster.offsetType;
         this.warcraftSkillwIds = monster.skill_warriorignet;
         this.warriorSkillIds = monster.skill_warcraft;
         if (this.offsetType == ENTITY_OFFSET_TYPE_BOSS) {
            this.baseProperties.put(99, 137438953471L);
            this.baseProperties.put(1, 137438953471L);
            this.baseProperties.put(98, 137438953471L);
         } else {
            this.baseProperties.put(99, this.baseProperties.get(1));
            this.baseProperties.put(98, this.baseProperties.get(1));
         }

         Monster var8 = null;
      }
   }

   private HashMap<Integer, HashMap<Integer, Integer>> getReplaceTalentSkill() {
      if (this.heroMirror != null && this.heroMirror.talent != null) {
         if (this.heroMirror.talentSkills != null && this.heroMirror.talentSkills.size() != 0) {
            HashMap<Integer, HashMap<Integer, Integer>> replaceSkill = new HashMap();

            for(int skillId : this.heroMirror.talentSkills) {
               SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
               if (skillModel != null) {
                  for(int effectId : skillModel.getEffects().values()) {
                     SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
                     if (skillEffectModel != null && (skillEffectModel.getParentSkillSlot() != 0 || skillEffectModel.getParentEffectIndex() != 0)) {
                        HashMap<Integer, Integer> skillHashMap = (HashMap)MapUtil.computeIfAbsent(replaceSkill, skillEffectModel.getParentSkillSlot(), HashMap.class);
                        skillHashMap.put(skillEffectModel.getParentEffectIndex(), skillEffectModel.getId());
                     }
                  }
               }
            }

            return replaceSkill;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void init(BattleScene scene, byte teamPos, byte battlePos, BattlePKTeam pkTeam, byte force) {
      this.scene = scene;
      this.teamPos = teamPos;
      this.battlePos = battlePos;
      if (this.originalPos == 0) {
         this.originalPos = battlePos;
      }

      this.pkTeam = pkTeam;
      this.force = force;
      this.conditionPropertyManager.init(scene, this);
      Boolean fieldSkillAssert = false;
      if (pkTeam.getSoulHeroId() > 0 && pkTeam.getSoulHeroId() == this.id) {
         fieldSkillAssert = true;
      }

      HashMap<Integer, HashMap<Integer, Integer>> replaceEffect = this.getReplaceTalentSkill();

      for(int i = 0; i < this.heroSkills.size(); ++i) {
         boolean hit = false;
         LeaderPalaceSkillConsumeModel leaderPalaceSkillConsumeModel = (LeaderPalaceSkillConsumeModel)ApplicationContextProvider.getModelPoolEntity("leaderPalaceSkillConsume", (Integer)this.heroSkills.get(i));
         if (leaderPalaceSkillConsumeModel != null) {
            this.skillManager.addSkill(leaderPalaceSkillConsumeModel.getIndex() + 1, (Integer)this.heroSkills.get(i), replaceEffect, fieldSkillAssert);
            hit = true;
         }

         if (!hit) {
            LeaderTacticsSkillModel leaderTacticsSkillModel = (LeaderTacticsSkillModel)ApplicationContextProvider.getModelPoolEntity("leaderTacticsSkill", (Integer)this.heroSkills.get(i));
            if (leaderTacticsSkillModel != null) {
               this.skillManager.addSkill(leaderTacticsSkillModel.getType() + 1, (Integer)this.heroSkills.get(i), replaceEffect, fieldSkillAssert);
               hit = true;
            }
         }

         if (!hit) {
            this.skillManager.addSkill(i + 1, (Integer)this.heroSkills.get(i), replaceEffect, fieldSkillAssert);
         }
      }

      Set<Integer> warriorAndWarcraftSkills = new HashSet();
      warriorAndWarcraftSkills.addAll(this.warriorSkillIds);
      warriorAndWarcraftSkills.addAll(this.warcraftSkillwIds);
      if (warriorAndWarcraftSkills != null) {
         MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
         Set<Integer> mergeSkills = monsterManager.getSkillOfRemoveChild(warriorAndWarcraftSkills);
         if (mergeSkills != null) {
            for(int warriorSkill : mergeSkills) {
               WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)ApplicationContextProvider.getModelPoolEntity("warriorSignetSkill", warriorSkill);
               if (warriorSignetSkillModel != null) {
                  for(int effectId : warriorSignetSkillModel.getEffects().values()) {
                     SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
                     if (skillEffectModel != null && skillEffectModel.getIsPassive() == 1) {
                        this.skillManager.addPassiveEffect((byte)6, (SkillModel)null, skillEffectModel);
                     }
                  }
               }
            }
         }
      }

      List<Integer> totemSkillIds = this.getTotemSkill();
      this.addPassiveEffect((byte)1, totemSkillIds);
      List<Integer> ornamentSkillIds = this.getOrnamentSkill();
      this.addPassiveEffect((byte)2, ornamentSkillIds);
      List<Integer> exTreasureSkillIds = this.getExTreasureSkill();
      this.addPassiveEffect((byte)3, exTreasureSkillIds);
      this.addPassiveEffect((byte)10, this.getRuneSuitSkill());
      List<Integer> strengthSkills = this.getStrengthSkill();
      this.addPassiveEffect((byte)9, strengthSkills);
      List<Integer> armyArraySkills = this.getArmyArraySkill();
      this.addPassiveEffect((byte)11, armyArraySkills);
      if (this.heroMirror != null) {
         this.addGodBeastSkillList(scene.getType());
         this.addExclusiveWeaponSkillList(scene.getType());
         this.addDragonVeinSkillList(scene.getType());
         this.addPassiveEffect((byte)4, this.heroMirror.talentSkills, true);
         if (this.heroMirror.type == HeroDefine.HERO_SP_TYPE_PALACE) {
            List<Integer> skillList = new ArrayList();
            skillList.addAll(this.heroMirror.palaceStarSkill.values());
            this.addPassiveEffect((byte)13, skillList, false);
         } else {
            this.addPassiveEffect((byte)13, this.getStarMapSkillList(), false);
            this.addStarMapPvpSkillList(scene.getType(), scene.getParamId());
         }

         if (this.heroMirror.warHorse != null) {
            if (this.heroMirror.warHorse.isAwaken) {
               WarHorseBaseModel WarHorseBaseModel = (WarHorseBaseModel)ApplicationContextProvider.getModelPoolEntity("warHorseBase", this.heroMirror.warHorse.id);
               if (WarHorseBaseModel != null) {
                  SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", WarHorseBaseModel.getWakeUpSkillId());
                  if (skillModel != null) {
                     List<Integer> effectList = new ArrayList(skillModel.getEffects().values());
                     this.buffSkills.addAll(effectList);
                  }
               }
            } else if (this.heroMirror.warHorse.isUnlock) {
               WarHorseBaseModel WarHorseBaseModel = (WarHorseBaseModel)ApplicationContextProvider.getModelPoolEntity("warHorseBase", this.heroMirror.warHorse.id);
               if (WarHorseBaseModel != null) {
                  SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", WarHorseBaseModel.getExclusiveSkillId());
                  if (skillModel != null) {
                     List<Integer> effectList = new ArrayList(skillModel.getEffects().values());
                     this.buffSkills.addAll(effectList);
                  }
               }
            }
         }
      }

      List<Integer> runeStoneSkillList = this.getRuneStoneSkill();
      if (runeStoneSkillList != null) {
         this.buffSkills.addAll(runeStoneSkillList);
      }

      if (this.buffSkills != null) {
         for(int runeSkill : this.buffSkills) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", runeSkill);
            if (skillEffectModel != null) {
               this.skillManager.addPassiveEffect((byte)5, (SkillModel)null, skillEffectModel);
            }
         }
      }

   }

   public void addPassiveEffect(byte type, List<Integer> skillList, boolean noReplace) {
      if (skillList != null) {
         for(int talentSkill : skillList) {
            SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", talentSkill);
            if (skillModel != null) {
               for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)entry.getValue());
                  if (skillEffectModel != null && (!noReplace || skillEffectModel.getParentSkillSlot() == 0 || skillEffectModel.getParentEffectIndex() == 0)) {
                     this.skillManager.addPassiveEffect(type, skillModel, skillEffectModel);
                  }
               }
            }
         }
      }

   }

   public void addPassiveEffect(byte type, List<Integer> skillList) {
      this.addPassiveEffect(type, skillList, false);
   }

   public void addUnderPalaceEffect(Set<Integer> skillList) {
      if (skillList != null) {
         for(int talentSkill : skillList) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", talentSkill);
            if (skillEffectModel != null) {
               this.skillManager.addPassiveEffect((byte)7, (SkillModel)null, skillEffectModel);
            }
         }
      }

   }

   public void addExtraSkill(Set<Integer> skillList) {
      for(int talentSkill : skillList) {
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", talentSkill);
         if (skillModel != null) {
            for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)entry.getValue());
               if (skillEffectModel != null) {
                  this.skillManager.addPassiveEffect((byte)18, skillModel, skillEffectModel);
               }
            }
         }
      }

   }

   private long _getBattleProperty(Action action, int property, boolean convert) {
      long value = 0L;
      if (BattleMisc.isMultiplyProperty(property)) {
         value = 10000L;
      }

      if (this.getStateManager().checkState((short)21)) {
         switch (property) {
            case 3:
               return 0L;
            case 11:
            case 14:
            case 15:
               return 10000L;
         }
      }

      if (BattleMisc.isMultiplyProperty(property)) {
         HashMap<Integer, Integer> percentMap = new HashMap();
         value = this.getBaseProperty(property);
         if (value == 0L) {
            value = 10000L;
         }

         value = (long)((float)value * ((float)this.conditionPropertyManager.getConditionProperty(action, property, percentMap) / 10000.0F));
         value = (long)((float)value * ((float)this.buffManager.getBattleProperty(action, property, percentMap) / 10000.0F));
         value = (long)((float)value * ((float)this.getExProperty(property, percentMap) / 10000.0F));
      } else {
         long baseValue = 0L;
         if (this.baseProperties.containsKey(property)) {
            value += this.getBaseProperty(property);
            baseValue = value;
         }

         HashMap<Integer, Integer> percentMap = new HashMap();
         value += this.conditionPropertyManager.getConditionProperty(action, property, percentMap);
         value += this.buffManager.getBattleProperty(action, property, percentMap);
         value += (long)this.getExProperty(property, percentMap);
         if (percentMap.containsKey(property)) {
            int rate = (Integer)percentMap.get(property);
            value = (long)((float)value + (float)(baseValue * (long)rate) / 10000.0F);
         }
      }

      if (convert && this.conditionPropertyManager.beConvertProperty.containsKey(property)) {
         ArrayList<ConditionProperty> conditionProperties = (ArrayList)this.conditionPropertyManager.beConvertProperty.get(property);
         int beConvertValue = 0;

         for(ConditionProperty conditionProperty : conditionProperties) {
            Entity target = (Entity)action.getBlackboard().getSkillParam(3, null);
            if (ConditionProcessor.checkCondition(action, conditionProperty.skillEffectModel.getConditionType(), conditionProperty.skillEffectModel.getConditions(), this, target, (Event)null)) {
               int minValue = conditionProperty.skillEffectModel.getParam("minValue");
               if (value >= (long)minValue) {
                  int maxValue = conditionProperty.skillEffectModel.getParam("maxValue");
                  long cValue = 0L;
                  if (value > (long)maxValue) {
                     value -= (long)(maxValue - minValue);
                  } else {
                     value = (long)minValue;
                  }
               }
            }
         }
      }

      if (convert && this.conditionPropertyManager.convertProperty.containsKey(property)) {
         ArrayList<ConditionProperty> conditionProperties = (ArrayList)this.conditionPropertyManager.convertProperty.get(property);
         int convertValue = 0;

         for(ConditionProperty conditionProperty : conditionProperties) {
            Entity target = (Entity)action.getBlackboard().getSkillParam(3, null);
            if (ConditionProcessor.checkCondition(action, conditionProperty.skillEffectModel.getConditionType(), conditionProperty.skillEffectModel.getConditions(), this, target, (Event)null)) {
               int cId = conditionProperty.skillEffectModel.getParam("cId");
               if (cId != 0) {
                  long cValue = this._getBattleProperty(action, cId, false);
                  int minValue = conditionProperty.skillEffectModel.getParam("minValue");
                  if (cValue >= (long)minValue) {
                     int maxValue = conditionProperty.skillEffectModel.getParam("maxValue");
                     if (cValue > (long)maxValue) {
                        cValue = (long)(maxValue - minValue);
                     } else {
                        cValue -= (long)minValue;
                     }

                     convertValue = (int)((float)convertValue + (float)(cValue * (long)conditionProperty.skillEffectModel.getParam("rate")) / 10000.0F);
                  }
               }
            }
         }

         value += (long)convertValue;
      }

      if (property == 2) {
         long limitValue = (long)((float)((Long)this.baseProperties.get(2) * (long)ApplicationContextProvider.getConfigInt("AttackLimit", 3000)) / 10000.0F);
         if (value < limitValue) {
            value = limitValue;
         }
      }

      switch (property) {
         case 7:
         case 10:
         case 18:
         case 19:
         case 20:
            value = value < -9999L ? -9999L : value;
            break;
         case 11:
         case 14:
         case 15:
            if (value < 0L) {
               value = 0L;
            } else if (value > 9999L) {
               value = 9999L;
            }
            break;
         case 102:
            value = value > 0L ? 0L : value;
            break;
         default:
            value = value < 0L ? 0L : value;
      }

      if (property == 6) {
         int minLimit = ApplicationContextProvider.getConfigInt("critiDamageMin", 20000);
         int maxLimit = ApplicationContextProvider.getConfigInt("critiDamageMax", 30000);
         int weakRate = ApplicationContextProvider.getConfigInt("critiDamageWeakRate", 100);
         if (value > (long)minLimit && value < (long)maxLimit) {
            float weakFinalRate = 1.0F - (float)((value - (long)minLimit) * (long)weakRate) / 10000.0F / (float)(maxLimit - minLimit);
            value = (long)((float)value * weakFinalRate);
         } else if (value >= (long)maxLimit) {
            value = (long)((float)value * (1.0F - (float)weakRate / 10000.0F));
         }
      }

      return value;
   }

   public long getBattleProperty(Action action, int property) {
      return this._getBattleProperty(action, property, true);
   }

   private int getExProperty(int property, HashMap<Integer, Integer> percentMap) {
      int value = 0;
      if (BattleMisc.isMultiplyProperty(property)) {
         value = 10000;
      }

      BattleHeroTrainingBuffModel model = (BattleHeroTrainingBuffModel)ApplicationContextProvider.getModelPool().getEntity("battleHeroTrainingBuff", this.pkTeam.getBuffId());
      if (model == null) {
         return value;
      } else {
         for(PropertyModel buff : model.getBuffs()) {
            if (buff.getType() == property) {
               if (BattleMisc.isMultiplyProperty(property)) {
                  value = (int)((float)value * ((float)(10000L - buff.getValue()) / 10000.0F));
               } else if (buff.getWay() == 0) {
                  value = (int)((long)value + buff.getValue());
               } else {
                  MapUtil.mapPlusInt(percentMap, buff.getType(), value);
               }
            }
         }

         return value;
      }
   }

   public long getBaseProperty(int property) {
      return this.baseProperties.containsKey(property) ? (Long)this.baseProperties.get(property) : 0L;
   }

   public int getHpRate() {
      return (int)((Long)this.baseProperties.get(99) * 10000L / (Long)this.baseProperties.get(1));
   }

   private void doRecoverHp(Action action, Entity source, SkillEffectModel model, boolean isCriti, long value, Event event, boolean notice) {
      if (source != null) {
         source.addRecoverHp(value);
      }

      this.modifyBaseProperty(99, value);
      if (notice) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectType(8);
         effectBuilder.setEffectId(model == null ? -1 : model.getId());
         effectBuilder.setEffectValue(value);
         effectBuilder.setFinalValue(this.getBaseProperty(99));
         effectBuilder.setTargetBattlePos(this.getBattlePos());
         effectBuilder.setCrit(isCriti ? 1 : 0);
         action.getBlackboard().addBattleEffect(effectBuilder);
      }

   }

   public void recoverHp(Action action, Entity source, SkillEffectModel model, boolean isCriti, long value, Event event, boolean notice) {
      if (value > 0L) {
         long covertValue = EffectUtil.hurtCureExchange(action, source, this, value, model, false, false, event);
         value -= covertValue;
         if (value != 0L) {
            value = this.linkBuffNegative(action, source, model, isCriti, value, event, notice);
            TreeSet<Integer> buffSet = this.getBuffManager().getSubBuff((short)58);
            long leftValue = value;
            if (buffSet != null && buffSet.size() > 0) {
               for(int code : buffSet) {
                  Buff buff = this.getBuffManager().getBuff(code);
                  if (buff != null && buff.caster != null && !buff.caster.isDead()) {
                     if (leftValue == 0L) {
                        break;
                     }

                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                     BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                     if (buffUseFun != null) {
                        long damageValue = (long)((float)buffUseFun.getUseValue() / 10000.0F * (float)value);
                        if (leftValue < damageValue) {
                           buff.caster.doRecoverHp(action, buff.caster, model, isCriti, leftValue, event, true);
                           leftValue = 0L;
                        } else {
                           buff.caster.doRecoverHp(action, buff.caster, model, isCriti, damageValue, event, true);
                           leftValue -= damageValue;
                        }
                     }
                  }
               }
            }

            this.doRecoverHp(action, source, model, isCriti, leftValue, event, notice);
         }
      }
   }

   public void modifyHp(Action action, long value, Event event, Entity source) {
      if (value > 0L) {
         logger.info("扣血使用正数:{}", value);
         (new Exception()).printStackTrace();
      }

      long lastHp = this.getBaseProperty(99);
      if (lastHp != 0L || value >= 0L) {
         if (value < 0L) {
            long limitValue = 0L;
            Set<Integer> buffCodeSet = this.getBuffManager().getSubBuff((short)45);
            if (buffCodeSet != null) {
               for(int code : buffCodeSet) {
                  Buff buff = this.getBuffManager().getBuff(code);
                  if (buff != null) {
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                     if (buffModel != null) {
                        BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                        if (buffUseFun != null) {
                           limitValue = (long)Math.ceil((double)((float)(this.getBaseProperty(1) * (long)buffUseFun.getUseValue()) / 10000.0F));
                           break;
                        }
                     }
                  }
               }
            }

            Event modifyBeforeEvent = new Event((short)28, action, event);
            modifyBeforeEvent.addParam(12, action);
            modifyBeforeEvent.addParam(3, this);
            modifyBeforeEvent.addParam(2, source);
            modifyBeforeEvent.addParam(26, this.skillDamageValue);
            modifyBeforeEvent.addParam(27, value);
            this.getScene().getEventListener().pushEvent(modifyBeforeEvent);
            if (this.skillDamageValueLimit > 0L) {
               limitValue = limitValue > 0L ? Math.min(limitValue, this.skillDamageValueLimit) : this.skillDamageValueLimit;
            }

            if (limitValue > 0L && this.skillDamageValue - value > limitValue) {
               long oldValue = value;
               value = this.skillDamageValue - limitValue;
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(this.getBattlePos());
               effectBuilder.setEffectType(26);
               effectBuilder.setEffectValue(value - oldValue);
               effectBuilder.setFinalValue(this.getBaseProperty(99));
               action.getBlackboard().addBattleEffect(effectBuilder);
            }
         }

         if (value < 0L) {
            this.skillDamageValue -= value;
         }

         if (value < 0L && lastHp + value <= 0L) {
            if (!this.buffManager.checkBlock(action) && !this.stateManager.checkState((short)22) && !this.stateManager.checkState((short)25)) {
               Set<Integer> freezeMap = this.buffManager.checkFreeze(action);
               if (freezeMap != null && freezeMap.size() > 0) {
                  int code = (Integer)freezeMap.iterator().next();
                  Buff freezeBuff = this.buffManager.getBuff(code);
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", freezeBuff.id);
                  this.buffManager.deleteBuffByCode(action, code, true);
                  int freezeBuffId = ((BuffUseFun)buffModel.getFuncs().get(1)).getUseId();
                  this.buffManager.addBuff(action, freezeBuffId, this, event);
                  this.setBaseProperty(99, 1L);
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setTargetBattlePos(this.getBattlePos());
                  effectBuilder.setEffectType(6);
                  effectBuilder.setEffectValue(-(value + lastHp + 1L));
                  effectBuilder.setFinalValue(this.getBaseProperty(99));
                  action.getBlackboard().addBattleEffect(effectBuilder);
               } else {
                  if (this.getBuffManager().checkSubBuff((short)85)) {
                     TreeSet<Integer> codeSet = this.getBuffManager().getSubBuff((short)85);
                     Integer code = (Integer)codeSet.first();
                     Buff buff = this.getBuffManager().getBuff(code);
                     if (buff != null) {
                        BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                        if (buff.curUseTime < buffModel.getUseTimes()) {
                           Event mhpDeadEvent = new Event((short)34, action, event);
                           mhpDeadEvent.addParam(12, action);
                           mhpDeadEvent.addParam(3, this);
                           mhpDeadEvent.addParam(2, source);
                           mhpDeadEvent.addParam(27, value);
                           this.getScene().getEventListener().pushEvent(mhpDeadEvent);
                           return;
                        }
                     }
                  }

                  if (this.getBuffManager().checkSubBuff((short)90)) {
                     this.getBuffManager().delSubClsBuff(action, (short)90);
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setEffectType(13);
                     effectBuilder.setTargetBattlePos(this.getBattlePos());
                     action.getBlackboard().addBattleEffect(effectBuilder);
                     return;
                  }

                  this.modifyBaseProperty(99, value);
                  boolean isCureHurt = (Boolean)action.getBlackboard().getSkillParam(2700 + this.getBattlePos(), false);
                  if (this.isDead() && isCureHurt) {
                     this.modifyBaseProperty(99, 1L);
                     action.getBlackboard().removeSkillParam(2700 + this.getBattlePos());
                  }
               }
            } else {
               this.setBaseProperty(99, 1L);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(this.getBattlePos());
               effectBuilder.setEffectType(26);
               effectBuilder.setEffectValue(-(value + lastHp + 1L));
               effectBuilder.setFinalValue(this.getBaseProperty(99));
               action.getBlackboard().addBattleEffect(effectBuilder);
            }
         } else {
            this.modifyBaseProperty(99, value);
            boolean isCureHurt = (Boolean)action.getBlackboard().getSkillParam(2700 + this.getBattlePos(), false);
            if (this.isDead() && isCureHurt) {
               this.modifyBaseProperty(99, 1L);
               action.getBlackboard().removeSkillParam(2700 + this.getBattlePos());
            }
         }

         long curHp = this.getBaseProperty(99);
         Event modifyEvent = new Event((short)13, action, event);
         modifyEvent.addParam(25, curHp - lastHp);
         modifyEvent.addParam(12, action);
         modifyEvent.addParam(3, this);
         modifyEvent.addParam(16, lastHp);
         modifyEvent.addParam(17, curHp);
         this.getScene().getEventListener().pushEvent(modifyEvent);
         Event modifyEventEnd = new Event((short)37, action, event);
         modifyEventEnd.addParam(25, curHp - lastHp);
         modifyEventEnd.addParam(12, action);
         modifyEventEnd.addParam(3, this);
         modifyEventEnd.addParam(16, lastHp);
         modifyEventEnd.addParam(17, curHp);
         this.getScene().getEventListener().pushEvent(modifyEventEnd);
         if (this.recordEntity == source && value < 0L) {
            this.recordHpValue += lastHp - curHp;
         }

      }
   }

   public long modifyBaseProperty(int property, long value) {
      if (this.baseProperties.get(property) == null) {
         this.baseProperties.put(property, value);
      } else if (BattleMisc.isMultiplyProperty(property)) {
         long oldValue = (Long)this.baseProperties.get(property);
         if (oldValue == 0L) {
            oldValue = 10000L;
         }

         oldValue = (long)((float)oldValue * ((float)(10000L - value) / 10000.0F));
         this.baseProperties.put(property, oldValue);
      } else {
         MapUtil.mapMergeSingleLong(this.baseProperties, property, value);
      }

      if ((Long)this.baseProperties.get(99) > (Long)this.baseProperties.get(1)) {
         this.baseProperties.put(99, this.baseProperties.get(1));
      }

      return (Long)this.baseProperties.get(property);
   }

   public long setBaseProperty(int property, long value) {
      this.baseProperties.put(property, value);
      return (Long)this.baseProperties.get(property);
   }

   public void modifyBaseProperty(List<PropertyModel> propertyModels) {
      for(PropertyModel propertyModel : propertyModels) {
         this.modifyBaseProperty(propertyModel);
      }

   }

   public void modifyBaseProperty(PropertyModel propertyModel) {
      if (this.baseProperties.containsKey(propertyModel.getType())) {
         long value = (Long)this.baseProperties.get(propertyModel.getType());
         if (BattleMisc.isMultiplyProperty(propertyModel.getType())) {
            if (value == 0L) {
               value = 10000L;
            }

            value = (long)((float)value * ((float)(10000L - propertyModel.getValue()) / 10000.0F));
         } else if (propertyModel.getWay() == 0) {
            value += propertyModel.getValue();
         } else if (propertyModel.getWay() == 1) {
            value = (long)((float)value + (float)value * ((float)propertyModel.getValue() / 10000.0F));
         }

         this.setBaseProperty(propertyModel.getType(), value);
         if (propertyModel.getType() == 1) {
            this.setBaseProperty(99, value);
         }
      }

   }

   public void modifyBaseProperty(int addRatio) {
      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         float value;
         if (BattleMisc.isMultiplyProperty((Integer)entry.getKey())) {
            long originVal = 10000L - (Long)entry.getValue();
            float newVal = (float)originVal * (1.0F + (float)addRatio / 10000.0F);
            value = 10000.0F - newVal;
         } else {
            value = (float)(Long)entry.getValue() * (1.0F + (float)addRatio / 10000.0F);
         }

         long longVal = Float.valueOf(value).longValue();
         this.setBaseProperty((Integer)entry.getKey(), longVal);
         if ((Integer)entry.getKey() == 1) {
            this.setBaseProperty(99, longVal);
         }
      }

   }

   public void modifyHeroMirrorProperty(PropertyModel propertyModel) {
      if (this.heroMirror.totalShowProperties.containsKey(propertyModel.getType())) {
         long value = (Long)MapUtil.getOrDefault(this.heroMirror.totalShowProperties, propertyModel.getType(), 0L);
         if (propertyModel.getWay() == 0) {
            value += propertyModel.getValue();
         } else if (propertyModel.getWay() == 1) {
            value = (long)((float)value + (float)value * ((float)propertyModel.getValue() / 10000.0F));
         }

         this.heroMirror.totalShowProperties.put(propertyModel.getType(), value);
         this.isChangeShow = true;
      }

   }

   public boolean isAlive() {
      return this.getBaseProperty(99) > 0L;
   }

   public boolean isDead() {
      return this.getBaseProperty(99) <= 0L;
   }

   public HashMap<Integer, Long> getBaseProperties() {
      return this.baseProperties;
   }

   public HashMap<Integer, Long> getShowBaseProperties() {
      return this.showBaseProperties;
   }

   public void destroy() {
      this.pkTeam = null;
      this.baseProperties.clear();
      this.baseProperties = null;
   }

   public List<Integer> getTotemSkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         List<Integer> list = new ArrayList();
         if (this.heroMirror.totem != null) {
            GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
            String key = this.heroMirror.totem.id + "_" + this.heroMirror.totem.breachLv;
            TotemBreachModel totemBreachModel = (TotemBreachModel)gameModelPool.getEntity("custom_totemBreach", key);
            if (totemBreachModel != null) {
               list.add(totemBreachModel.getSkill());
            }
         }

         return list;
      }
   }

   public List<Integer> getOrnamentSkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         List<Integer> skillSet = new ArrayList();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         Map<String, ArrayList<StampModel>> setMap = new HashMap();

         for(OrnamentItem ornamentItem : this.heroMirror.ornament.values()) {
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

         return skillSet;
      }
   }

   public List<Integer> getExTreasureSkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         List<Integer> skillSet = new ArrayList();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         Map<Integer, Integer> numMap = new HashMap();
         if (this.heroMirror.exTreasure != null && !this.heroMirror.exTreasure.stoneMap.isEmpty()) {
            for(Integer stoneId : this.heroMirror.exTreasure.stoneMap.values()) {
               ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
               if (stoneModel != null) {
                  int tempNum = (Integer)MapUtil.getOrDefault(numMap, stoneModel.getType(), 0);
                  numMap.put(stoneModel.getType(), tempNum + 1);
               }
            }

            int num1 = (Integer)MapUtil.getOrDefault(numMap, 1, 0);
            int num2 = (Integer)MapUtil.getOrDefault(numMap, 2, 0);
            int num3 = (Integer)MapUtil.getOrDefault(numMap, 3, 0);
            ExclusiveTreasureActivationModel skillModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.heroMirror.exTreasure.condition2);
            if (num1 >= skillModel.getTriangleNum() && num2 >= skillModel.getSquareNum() && num3 >= skillModel.getCircularNum()) {
               ExclusiveTreasureExtraModel extraSkillModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.heroMirror.exTreasure.skillId);
               if (extraSkillModel != null && extraSkillModel.getSkillId() > 0) {
                  skillSet.add(extraSkillModel.getSkillId());
               }
            }
         }

         return skillSet;
      }
   }

   public List<Integer> getRuneSuitSkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         RunePropertiesAndSkills suitProAndSkillIdList = this.heroMirror.getSuitProAndSkillIdList();
         return null != suitProAndSkillIdList && suitProAndSkillIdList.getSkillList() != null ? suitProAndSkillIdList.getSkillList() : null;
      }
   }

   public List<Integer> getRuneStoneSkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         List<Integer> skillSet = new ArrayList();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         int levSum = 0;

         for(RuneStoneItem item : this.heroMirror.runeStone.values()) {
            FormationGemLvUpModel model = (FormationGemLvUpModel)gameModelPool.getEntity("formationGemLvup", item.id);
            if (model != null) {
               levSum += model.getLv();
            }
         }

         HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
         Map<Integer, FormationGemSetModel> gemMap = gameModelPool.getMap("formationGemSet");
         int finalLevSum = levSum / 10 * 10;
         List<FormationGemSetModel> list = new ArrayList();

         for(FormationGemSetModel model : gemMap.values()) {
            if (model.getHotLv() <= finalLevSum && (model.getJob() == heroModel.getType() || model.getJob() == 0)) {
               list.add(model);
            }
         }

         for(FormationGemSetModel setModel : list) {
            if (finalLevSum < 40 || setModel.getHotLv() != 30) {
               for(KeyValFun fun : setModel.getHotSkill()) {
                  if (fun.getKey() > 0) {
                     skillSet.add(fun.getKey());
                  }
               }
            }
         }

         return skillSet;
      }
   }

   public List<Integer> getStrengthSkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         List<Integer> resultSet = new ArrayList();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         Map<Integer, RefineSkillModel> skillModelMap = gameModelPool.getMap("RefineSkill");
         int minLev = this.heroMirror.getMinLev();
         if (!this.heroMirror.strengthSkill.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : this.heroMirror.strengthSkill.entrySet()) {
               if ((Integer)entry.getValue() > 0 && (Integer)entry.getKey() <= minLev && skillModelMap.containsKey(entry.getKey()) && ((RefineSkillModel)skillModelMap.get(entry.getKey())).getSkills().size() >= (Integer)entry.getValue()) {
                  int skillId = (Integer)((RefineSkillModel)skillModelMap.get(entry.getKey())).getSkills().get((Integer)entry.getValue() - 1);
                  resultSet.add(skillId);
               }
            }
         }

         return resultSet;
      }
   }

   public List<Integer> getArmyArraySkill() {
      if (this.heroMirror == null) {
         return null;
      } else {
         List<Integer> resultSet = new ArrayList();
         resultSet.addAll(this.heroMirror.armyArraySkill);
         return resultSet;
      }
   }

   public void setActiveDressIds(Set<Integer> dressIds) {
      this.activeDressIds = dressIds;
   }

   public Set<Integer> getActiveDressIds() {
      return this.activeDressIds;
   }

   public Set<Integer> getWarriorAndWarcraftBaseSkillIds() {
      Set<Integer> resultSet = new HashSet();

      for(Integer warriorSkillId : this.warriorSkillIds) {
         WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)ApplicationContextProvider.getModelPoolEntity("warriorSignetSkill", warriorSkillId);
         if (warriorSignetSkillModel != null) {
            resultSet.add(warriorSignetSkillModel.getBaseSkill());
         }
      }

      for(Integer warcraftSkillwId : this.warcraftSkillwIds) {
         WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)ApplicationContextProvider.getModelPoolEntity("warriorSignetSkill", warcraftSkillwId);
         if (warriorSignetSkillModel != null) {
            resultSet.add(warriorSignetSkillModel.getBaseSkill());
         }
      }

      return resultSet;
   }

   public ConditionPropertyManager getConditionPropertyManager() {
      return this.conditionPropertyManager;
   }

   public EntitySkillManager getSkillManager() {
      return this.skillManager;
   }

   public EntityStateManager getStateManager() {
      return this.stateManager;
   }

   public BuffManager getBuffManager() {
      return this.buffManager;
   }

   public BattleScene getScene() {
      return this.scene;
   }

   public int getId() {
      return this.id;
   }

   public int getDressHeroId() {
      return this.heroMirror != null && this.heroMirror.dressHeroId > 0 ? this.heroMirror.dressHeroId : this.id;
   }

   public int getSkinId() {
      return this.skinId;
   }

   public void setScene(BattleScene scene) {
      this.scene = scene;
   }

   public void setBattlePos(byte battlePos) {
      this.battlePos = battlePos;
   }

   public void setTeamPos(byte teamPos) {
      this.teamPos = teamPos;
   }

   public void setPkTeam(BattlePKTeam pkTeam) {
      this.pkTeam = pkTeam;
   }

   public void setForce(byte force) {
      this.force = force;
   }

   public void setId(int id) {
      this.id = id;
   }

   public byte getForce() {
      return this.force;
   }

   public byte getBattlePos() {
      return this.battlePos;
   }

   public byte getOriginalPos() {
      return this.originalPos == 0 ? this.battlePos : this.originalPos;
   }

   public BattlePKTeam getPkTeam() {
      return this.pkTeam;
   }

   public byte getTeamPos() {
      return this.teamPos;
   }

   public int getLevel() {
      return this.level;
   }

   public PassiveSkillMgr getPassiveSkillMgr() {
      return this.passiveSkillMgr;
   }

   public void clear(Action action) {
      this.buffManager.deadClear(action);
   }

   public int getHeroCode() {
      return this.code;
   }

   public int getStar() {
      return this.heroMirror.star;
   }

   public long getCombatPower() {
      return this.heroMirror.combatPower;
   }

   public List<Integer> getHeroSkills() {
      return this.heroSkills;
   }

   public List<WarriorSignet> getWarriorSignet() {
      List<WarriorSignet> list = new ArrayList();

      for(Map.Entry<Integer, WarriorSignet> entry : this.heroMirror.warriors.entrySet()) {
         list.add(entry.getValue());
      }

      return list;
   }

   public BattleMsg.EntityType getType() {
      return this.type;
   }

   public byte getSkillOrder() {
      return this.skillOrder;
   }

   public void setSkillOrder(byte skillOrder) {
      this.skillOrder = skillOrder;
   }

   public void setType(BattleMsg.EntityType type) {
      this.type = type;
   }

   public long getAttackValue() {
      return this.attackValue;
   }

   public long getDamageValue() {
      return this.damageValue;
   }

   public long getRecoverHp() {
      return this.recoverHp;
   }

   public void addAttackValue(Action action, long value, Event event) {
      this.attackValue += Math.abs(value);
      this.attackDirty = true;
      this.buffManager.addYuSlave(action, value);
      Event event1 = new Event((short)18, action, event);
      event1.addParam(1, value);
      event1.addParam(2, this);
      this.getScene().getEventListener().pushEvent(event1);
   }

   public void addDamageValue(long value) {
      this.setDamageDirty(true);
      value = Math.abs(value);
      this.skillShowValue += value;
      this.damageValue += value;
   }

   public void addRecoverHp(long value) {
      value = Math.abs(value);
      this.recoverHp += value;
      this.recoverDirty = true;
   }

   public byte getPlotIndex() {
      return this.plotIndex;
   }

   public void setPlotIndex(byte plotIndex) {
      this.plotIndex = plotIndex;
   }

   public byte getDeadTimes() {
      return this.deadTimes;
   }

   public void addDeadTimesAndClear(Action action) {
      ++this.deadTimes;
      if (!this.getStateManager().checkState((short)21)) {
         this.clear(action);
      }

      Event buffClearEnd = new Event((short)41, action, (Event)null);
      buffClearEnd.addParam(3, this);
      action.getScene().getEventListener().pushEvent(buffClearEnd);
   }

   public int getAideBuff() {
      return this.aideBuff;
   }

   public HeroMirror getHeroMirror() {
      return this.heroMirror;
   }

   public void setHeroMirror(HeroMirror heroMirror) {
      this.heroMirror = heroMirror;
   }

   public void addBuffSkills(Set<Integer> buffSkills) {
      this.buffSkills.addAll(buffSkills);
   }

   public long getSpeed() {
      return this.getBaseProperty(4) + (long)this.getBuffManager().getSpend();
   }

   public boolean isAttackDirty() {
      return this.attackDirty;
   }

   public void setAttackDirty(boolean damageDirty) {
      this.attackDirty = damageDirty;
   }

   public boolean isRecoverDirty() {
      return this.recoverDirty;
   }

   public void setRecoverDirty(boolean recoverDirty) {
      this.recoverDirty = recoverDirty;
   }

   public boolean isDamageDirty() {
      return this.damageDirty;
   }

   public void setDamageDirty(boolean damageDirty) {
      this.damageDirty = damageDirty;
   }

   public void recordHp(Entity entity) {
      this.recordHpValue = 0L;
      this.recordEntity = entity;
   }

   public long getReduceValue(Entity entity) {
      return entity != this.recordEntity ? 0L : this.recordHpValue;
   }

   public void clearRoundDamage() {
      this.skillDamageValue = 0L;
      this.skillShowValue = 0L;
      this.skillDamageValueLimit = -1L;
   }

   public boolean isChangeShow() {
      return this.isChangeShow;
   }

   public long getSkillDamageValue() {
      return this.skillDamageValue;
   }

   public long getSkillShowValue() {
      return this.skillShowValue;
   }

   public long getSkillDamageValueLimit() {
      return this.skillDamageValueLimit;
   }

   public void setSkillDamageValueLimit(long damageMax) {
      this.skillDamageValueLimit = damageMax;
   }

   public byte getHurtTimes() {
      return this.hurtTimes;
   }

   public void addHurtTimes() {
      ++this.hurtTimes;
   }

   public void resetHurtTimes() {
      this.hurtTimes = 0;
   }

   public void setAttacked() {
      this.attacked = true;
   }

   public boolean isAttacked() {
      return this.attacked;
   }

   public void resetAttacked() {
      this.attacked = false;
   }

   public long getMaxHpMax() {
      return this.maxHpMax;
   }

   public void setMaxHpMax(long hpMax) {
      this.maxHpMax = hpMax;
   }

   public List<Integer> getTriggerEffectList() {
      return this.triggerEffectList;
   }

   public void addTriggerEffect(int effectId) {
      this.triggerEffectList.add(effectId);
   }

   public long getStageHpValue() {
      return this.stageHpValue;
   }

   public void setStageHpValue(long stageHpValue) {
      this.stageHpValue = stageHpValue;
   }

   public void addStageHpValue(long value) {
      this.stageHpValue += value;
   }

   public int getFieldSkillShowRound() {
      return this.fieldSkillShowRound;
   }

   public void setFieldSkillShowRound(int fieldSkillShowRound) {
      if (fieldSkillShowRound > 0) {
         this.fieldSkillShowRound = fieldSkillShowRound;
      }

   }

   public void resetFieldSkillShowRound() {
      this.fieldSkillShowRound = -1;
   }

   public void decrFieldSkillShowRound() {
      --this.fieldSkillShowRound;
      if (this.fieldSkillShowRound <= 0) {
         this.fieldSkillShowRound = 0;
      }

   }

   public int getFieldSkillShowEffectId() {
      return this.fieldSkillShowEffectId;
   }

   public void setFieldSkillShowEffectId(int fieldSkillShowEffectId) {
      this.fieldSkillShowEffectId = fieldSkillShowEffectId;
   }

   public boolean isFirstModifyHp() {
      return this.firstModifyHp;
   }

   public void setFirstModifyHp(boolean firstModifyHp) {
      this.firstModifyHp = firstModifyHp;
   }

   private long linkBuffNegative(Action action, Entity source, SkillEffectModel model, boolean isCriti, long value, Event event, boolean notice) {
      if (this.getBuffManager().isExistSubType((short)88)) {
         TreeSet<Integer> subMap = this.getBuffManager().getSubBuff((short)88);
         int code = (Integer)subMap.last();
         Buff buff = this.getBuffManager().getBuff(code);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.isNull(useFun)) {
            return value;
         }

         int linkBuffId = useFun.getExDependentValue();
         Entity linkEntity = null;
         byte force = BattleMisc.oppositionForce(this.force);

         for(Entity entity : this.getScene().getPKTeam(force).getEntityMap().values()) {
            if (entity.getBuffManager().isExistId(linkBuffId)) {
               linkEntity = entity;
               break;
            }
         }

         if (Objects.isNull(linkEntity)) {
            return value;
         }

         if (linkEntity.getBuffManager().isExistSubType((short)88)) {
            TreeSet<Integer> linkSubMap = linkEntity.getBuffManager().getSubBuff((short)88);
            int linkCode = (Integer)linkSubMap.last();
            Buff linkBuff = linkEntity.getBuffManager().getBuff(linkCode);
            BuffModel linkBuffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", linkBuff.id);
            BuffUseFun linkUseFun = (BuffUseFun)linkBuffModel.getFuncs().get(2);
            if (Objects.nonNull(linkUseFun)) {
               int buffId = linkUseFun.getExDependentValue();
               Entity entity = null;

               for(Entity e : this.getPkTeam().getEntityMap().values()) {
                  if (e.getBuffManager().isExistId(buffId)) {
                     entity = e;
                     break;
                  }
               }

               if (Objects.nonNull(entity)) {
                  useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  linkUseFun = (BuffUseFun)linkBuffModel.getFuncs().get(1);
                  long newValue = (long)((float)(value * (long)useFun.getExDependentValue()) / 10000.0F);
                  long damageValue = (long)((float)(newValue * (long)linkUseFun.getExDependentValue()) / 10000.0F);
                  if (entity == this) {
                     newValue -= damageValue;
                     value -= newValue;
                     linkEntity.recoverLinkBufHp(action, source, model, isCriti, newValue, event, notice);
                     return value;
                  }

                  value -= newValue;
                  newValue -= damageValue;
                  linkEntity.recoverLinkBufHp(action, source, model, isCriti, newValue, event, notice);
                  entity.recoverLinkBufHp(action, source, model, isCriti, damageValue, event, notice);
                  return value;
               }
            }
         }

         useFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (Objects.nonNull(useFun)) {
            long newValue = (long)((float)(value * (long)useFun.getExDependentValue()) / 10000.0F);
            linkEntity.recoverLinkBufHp(action, source, model, isCriti, newValue, event, notice);
            value -= newValue;
            return value;
         }
      }

      return value;
   }

   private void recoverLinkBufHp(Action action, Entity source, SkillEffectModel model, boolean isCriti, long value, Event event, boolean notice) {
      if (value > 0L) {
         TreeSet<Integer> buffSet = this.getBuffManager().getSubBuff((short)58);
         long leftValue = value;
         if (buffSet != null && buffSet.size() > 0) {
            for(int code : buffSet) {
               Buff buff = this.getBuffManager().getBuff(code);
               if (buff != null && buff.caster != null && !buff.caster.isDead()) {
                  if (leftValue == 0L) {
                     break;
                  }

                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                  BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  if (buffUseFun != null) {
                     long damageValue = (long)((float)buffUseFun.getUseValue() / 10000.0F * (float)value);
                     if (leftValue < damageValue) {
                        buff.caster.doRecoverHp(action, buff.caster, model, isCriti, leftValue, event, true);
                        leftValue = 0L;
                     } else {
                        buff.caster.doRecoverHp(action, buff.caster, model, isCriti, damageValue, event, true);
                        leftValue -= damageValue;
                     }
                  }
               }
            }
         }

         this.doRecoverHp(action, source, model, isCriti, leftValue, event, notice);
      }
   }

   public List<Integer> getStarMapSkillList() {
      List<Integer> starMapSkillList = new ArrayList();
      if (this.heroMirror != null && this.heroMirror.starMap != null) {
         int starMapTotalLv = 0;

         for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : this.heroMirror.starMap.entrySet()) {
            StarMapPoint value = (StarMapPoint)starId_starMapPoint.getValue();
            starMapTotalLv += value.starLv;
         }

         List<Integer> skillStarMapList = StarMapDefine.getSkillStarMapList(this.heroMirror.id, this.heroMirror.lv, starMapTotalLv);
         if (null != skillStarMapList && skillStarMapList.size() > 0) {
            starMapSkillList.addAll(skillStarMapList);
         }
      }

      return starMapSkillList;
   }

   public List<Integer> getStarMapPvpSkillList() {
      List<Integer> starMapPvpSkillList = new ArrayList();
      if (this.heroMirror != null && this.heroMirror.starMap != null) {
         int starMapTotalLv = 0;

         for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : this.heroMirror.starMap.entrySet()) {
            StarMapPoint value = (StarMapPoint)starId_starMapPoint.getValue();
            starMapTotalLv += value.starLv;
         }

         List<Integer> skillPvpStarMapList = StarMapDefine.getSkillPvpStarMapList(this.heroMirror, starMapTotalLv);
         if (null != skillPvpStarMapList && skillPvpStarMapList.size() > 0) {
            starMapPvpSkillList.addAll(skillPvpStarMapList);
         }
      }

      return starMapPvpSkillList;
   }

   public void addStarMapPvpSkillList(int systemId, int paramId) {
      Map<Integer, StarPvpSystemModel> starPvpSystemModelMap = ApplicationContextProvider.<Integer, StarPvpSystemModel>getModelPoolMap("starPvpSystem");
      if (starPvpSystemModelMap != null && starPvpSystemModelMap.size() > 0) {
         Set<Integer> systemIdSet = starPvpSystemModelMap.keySet();
         if (systemIdSet.contains(systemId)) {
            boolean addStarMapPvpSkill = true;
            if (systemId == 1991 && paramId != 1) {
               addStarMapPvpSkill = false;
            } else if (systemId == 2001 && paramId != 2) {
               addStarMapPvpSkill = false;
            }

            if (addStarMapPvpSkill) {
               this.addPassiveEffect((byte)14, this.getStarMapPvpSkillList(), false);
            }
         }
      }

   }

   public void addGodBeastSkillList(int systemId) {
      if (null != this.heroMirror.godBeastItem) {
         List<Integer> godBeastUnEffectSys = GodBeastDefine.getGodBeastUnEffectSys();
         if (!godBeastUnEffectSys.contains(systemId)) {
            List<Integer> godBeastSkillList = GodBeastDefine.getAllSkillIdList(this.heroMirror.godBeastItem);
            if (null != this.heroMirror.godBeastItem.mainNeiDan) {
               NeiDanSkillAndPro neiDanSkillAndPro = NeiDanDefine.calAddHeroPro(this.heroMirror.godBeastItem.mainNeiDan);
               if (null != neiDanSkillAndPro && neiDanSkillAndPro.getSkillList().size() > 0) {
                  godBeastSkillList.addAll(neiDanSkillAndPro.getSkillList());
               }
            }

            this.addPassiveEffect((byte)12, godBeastSkillList);
         }
      }

   }

   public void addExclusiveWeaponSkillList(int systemId) {
      List<Integer> unEffectSys = EWeaponDefine.getUnEffectSys();
      if (!unEffectSys.contains(systemId)) {
         if (null != this.heroMirror.exclusiveWeaponMap) {
            ExclusiveWeaponItem mainWeaponItem = (ExclusiveWeaponItem)this.heroMirror.exclusiveWeaponMap.get(34);
            int mainWeaponId = mainWeaponItem == null ? 0 : mainWeaponItem.id;
            int weaponStarId = mainWeaponItem == null ? 0 : mainWeaponItem.getStarId();
            List<Integer> skillList = EWeaponDefine.getSkillList(this.heroMirror.id, mainWeaponId, weaponStarId, this.heroMirror.soulSkill);
            if (skillList.size() > 0) {
               this.addPassiveEffect((byte)17, skillList);
            }

         }
      }
   }

   public void addDragonVeinSkillList(int systemId) {
      if (this.heroMirror != null) {
         List<Integer> unEffectSys = DragonVeinDefine.getUnEffectSys();
         if (!unEffectSys.contains(systemId)) {
            if (!this.heroMirror.dragonVeinSkills.isEmpty()) {
               this.addPassiveEffect((byte)19, new ArrayList(this.heroMirror.dragonVeinSkills));
            }
         }
      }
   }

   public int getAideTrammelsSkillId() {
      return this.aideTrammelsSkillId;
   }

   public int getAideBuff2() {
      return this.aideBuff2;
   }
}
