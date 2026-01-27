package com.gzbz.battle.entity;

import cn.hutool.core.util.RandomUtil;
import com.gzbz.battle.BattleMisc;
import com.gzbz.db.HeroDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ExclusiveTreasure;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.BattleAddProLibModel;
import com.gzbz.model.BattleProGrowingModel;
import com.gzbz.model.DecisiveBattleMainModel;
import com.gzbz.model.DecisiveStampModel;
import com.gzbz.model.ExclusiveTreasureActivationModel;
import com.gzbz.model.ExclusiveTreasureBaseModel;
import com.gzbz.model.ExclusiveTreasureExtraModel;
import com.gzbz.model.ExclusiveTreasureStoneModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroBreachModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroUpStarModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ItemPropertyModel;
import com.gzbz.model.RobotWearModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.StampBasicPropertyModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.StampSetModel;
import com.gzbz.model.TalentLevelModel;
import com.gzbz.model.TalentSkillModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.ValListFun;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.robot.bean.MonsterWarrior;
import com.gzbz.robot.bean.MonsterWear;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Monster implements Serializable {
   Logger logger = LoggerFactory.getLogger(Monster.class);
   public int id;
   public int lv;
   public int limitLv;
   public int star;
   public int realStar;
   public int breachLv;
   public int quality;
   public int offset;
   public byte offsetType;
   public boolean isWear;
   public Map<Integer, EquipItem> equips = new HashMap();
   public Map<Integer, WarriorSignet> warriors = new HashMap();
   public Map<Integer, Integer> warcrafts = new HashMap();
   public ExclusiveTreasure exTreasure = null;
   public Map<Integer, OrnamentItem> ornament = new HashMap();
   public Map<Integer, List> talent = new HashMap();
   public HashMap<Integer, Long> totalFightProperties = new HashMap();
   public HashMap<Integer, Long> totalShowProperties = new HashMap();
   public List<Integer> heroUnlockSkills = new ArrayList();
   public long totalCombatPower;
   private long ornament_power;
   private Map<Integer, Long> ornamentProperties = new HashMap();
   public int inheritNation;
   private Map<Integer, Long> baseProperties = new HashMap();
   private Map<Integer, Integer> property_breach = new HashMap();
   private long combatPower_breach;
   private Map<Integer, Integer> property_star = new HashMap();
   private long combatPower_star;
   private List<PropertyModel> property_skill_hero = new ArrayList();
   private List<PropertyModel> property_skill_other = new ArrayList();
   private List<PropertyModel> offsetList = new ArrayList();
   private List<PropertyModel> property_equips = new ArrayList();
   private List<PropertyModel> property_warriorignet = new ArrayList();
   public Set<Integer> skill_warriorignet = new HashSet();
   public Set<Integer> skill_warcraft = new HashSet();
   private List<PropertyModel> property_exclusive_treasure = new ArrayList();
   private Set<Integer> skill_exclusive_treasure = new HashSet();
   public List<PropertyModel> property_ornament = new ArrayList();
   public List<PropertyModel> property_ornament_skill = new ArrayList();
   public List<Integer> skill_talent = new ArrayList();
   public long talent_power;

   public Monster(int id, int lv, int star, int offset, boolean isWear, BattleMonsterFun fun, List<WarriorSignet> warriorSignets) {
      this.id = id;
      this.lv = lv;
      this.limitLv = lv;
      this.star = star;
      this.realStar = star;
      this.isWear = isWear;
      this.offset = offset;
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", id);
      if (heroModel != null && heroModel.getNation() == 10) {
         this.inheritNation = 4;
      }

      if (warriorSignets != null && !warriorSignets.isEmpty() && warriorSignets.size() <= 2) {
         int pos = 5;

         for(WarriorSignet warriorSignet : warriorSignets) {
            this.warriors.put(pos, warriorSignet);
            ++pos;
         }
      }

      this.init();
      if (fun != null) {
         if (!fun.getWarriorSignet().isEmpty()) {
            this.skill_warriorignet.addAll(fun.getWarriorSignet());
         }

         if (!fun.getWarcrafts().isEmpty()) {
            this.skill_warcraft.addAll(fun.getWarcrafts());
         }

         if (!fun.getTotemSkills().isEmpty()) {
            this.skill_warcraft.addAll(fun.getTotemSkills());
         }

         if (!fun.getStampSkills().isEmpty()) {
            this.skill_warcraft.addAll(fun.getStampSkills());
         }

         if (!fun.getTalentSkills().isEmpty()) {
            this.skill_warcraft.addAll(fun.getStampSkills());
         }

         if (fun.getWarHorse() != null) {
            this.skill_warcraft.add(fun.getWarHorse().getExclusiveSkillId());
         }
      }

   }

   public Monster(int id, int lv, int star, int offset, boolean isWear, List<PropertyModel> proList) {
      this.id = id;
      this.lv = lv;
      this.limitLv = lv;
      this.star = star;
      this.realStar = star;
      this.isWear = isWear;
      this.offset = offset;
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", id);
      if (heroModel != null && heroModel.getNation() == 10) {
         this.inheritNation = 4;
      }

      if (!proList.isEmpty()) {
         this.property_exclusive_treasure.clear();
         this.property_exclusive_treasure.addAll(proList);
      }

      this.initForDragonWar();
   }

   public Monster(MonsterWear monsterWear) {
      this.id = monsterWear.id;
      this.lv = monsterWear.lv;
      this.limitLv = this.lv;
      this.isWear = false;
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.id);
      if (heroModel != null && heroModel.getNation() == 10) {
         this.inheritNation = 4;
      }

      int key_equip = 1;

      for(Integer equipId : monsterWear.equips) {
         EquipItem equipItem = new EquipItem();
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", equipId);
         equipItem.init(0, 1, itemModel, (GamePlayer)null);
         this.equips.put(key_equip, equipItem);
         ++key_equip;
      }

      int key_warrios = 1;

      for(MonsterWarrior warrior : monsterWear.warriors) {
         WarriorSignet warriorSignet = new WarriorSignet(0, warrior.id, warrior.score, warrior.pro, warrior.skills);
         this.warriors.put(key_warrios, warriorSignet);
         ++key_warrios;
      }

      int key_warcrafts = 1;

      for(Integer warcraftId : monsterWear.warcrafts) {
         this.warcrafts.put(key_warcrafts, warcraftId);
         ++key_warcrafts;
      }

      if (!monsterWear.stone.isEmpty()) {
         int key_stone = 1;
         ExclusiveTreasure exclusiveTreasure = new ExclusiveTreasure();

         for(Integer stoneId : monsterWear.stone) {
            exclusiveTreasure.stoneMap.put(CommonMsg.StonePosition.forNumber(key_stone), stoneId);
            ++key_stone;
         }

         this.exTreasure = exclusiveTreasure;
      }

      this.init();
   }

   private void init() {
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      int maxStar = monsterManager.getMaxStarOfHero(this.id);
      if (this.star == 0) {
         this.star = this.realStar = monsterManager.getStarByLv(this.id, this.lv);
         if (this.star > maxStar) {
            this.star = this.realStar = maxStar;
         }
      } else if (this.realStar < heroModel.getStar()) {
         this.star = this.realStar = heroModel.getStar();
      }

      if (this.star > maxStar) {
         this.realStar = maxStar;
      }

      int maxLv = MonsterManager.maxLvByStar[this.realStar];
      if (this.limitLv > maxLv) {
         this.limitLv = maxLv;
      }

      if (this.warriors.isEmpty() && this.isWear) {
         RobotWearModel robotWearModel = monsterManager.getRobotWearModel(this.lv);
         this.equips = monsterManager.getHeroEquip(robotWearModel);
         this.warriors = monsterManager.getHeroWarriors(robotWearModel);
         this.warcrafts = monsterManager.getHeroWarcrafts(robotWearModel);
         this.exTreasure = monsterManager.getHeroExclusiveTreasure(robotWearModel);
      }

      this.breachLv = monsterManager.getBreachLvByLv(this.realStar, this.limitLv);
      this.parseOffset();
      this.quality = heroModel.getQuality();
      this.baseProperties.putAll(heroModel.getProperty());
      this.flushHeroBreach();
      this.flushHeroStar();
      this.flushEquip();
      this.flushWarriorSignet();
      this.flushWarcraft();
      this.flushExclusiveTreasure();
      this.flushHeroSkill();
      this.flushOtherSkill();
      if (heroModel.getMonsterType() == 1) {
         this.totalShowProperties = heroModel.getProperty();
         this.totalFightProperties = heroModel.getProperty();
      } else {
         this.calTotalPorperty();
      }
   }

   private void initForDragonWar() {
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      int maxStar = monsterManager.getMaxStarOfHero(this.id);
      if (this.star == 0) {
         this.star = this.realStar = monsterManager.getStarByLv(this.id, this.lv);
         if (this.star > maxStar) {
            this.star = this.realStar = maxStar;
         }
      } else if (this.realStar < heroModel.getStar()) {
         this.star = this.realStar = heroModel.getStar();
      }

      if (this.star > maxStar) {
         this.realStar = maxStar;
      }

      int maxLv = MonsterManager.maxLvByStar[this.realStar];
      if (this.limitLv > maxLv) {
         this.limitLv = maxLv;
      }

      this.breachLv = monsterManager.getBreachLvByLv(this.realStar, this.limitLv);
      if (this.realStar == 5) {
         ++this.breachLv;
      }

      this.quality = heroModel.getQuality();
      this.baseProperties.putAll(heroModel.getProperty());
      this.flushHeroBreach();
      this.flushHeroStar();
      this.flushExclusiveTreasure();
      this.flushHeroSkill();
      this.flushOtherSkill();
      if (heroModel.getMonsterType() == 1) {
         this.totalShowProperties = heroModel.getProperty();
         this.totalFightProperties = heroModel.getProperty();
      } else {
         this.calTotalPorpertyForDragonWar();
      }
   }

   public void parseOffset() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      if (this.offset > 0) {
         BattleAddProLibModel battleAddProLibModel = (BattleAddProLibModel)gameModelPool.getEntity("battleAddProLib", this.offset);
         if (battleAddProLibModel != null) {
            this.offsetType = battleAddProLibModel.getOffsetType();

            for(PropertyModel data : battleAddProLibModel.getPro()) {
               this.offsetList.add(new PropertyModel(data.getType(), data.getWay(), data.getValue()));
            }
         }
      }

   }

   private void flushHeroBreach() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      HashMap<Integer, Integer> propertyMap = new HashMap();
      long combatPower = 0L;
      List<Integer> tempUnlockSkills = new ArrayList();
      tempUnlockSkills.add(heroModel.getSkills().get(1));
      tempUnlockSkills.add(heroModel.getSkills().get(2));

      for(int i = 0; i <= this.breachLv; ++i) {
         HeroBreachModel heroBreachModel = (HeroBreachModel)gameModelPool.getEntity("heroBreach", i);
         HashMap<Integer, Integer> map = new HashMap();
         map.put(1, heroBreachModel.getHpAward());
         map.put(2, heroBreachModel.getAtkAward());
         map.put(3, heroBreachModel.getDefAward());
         map.put(4, heroBreachModel.getSpdAward());
         MapUtil.mapMergeInt(propertyMap, map);
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", i);
         if (upgradeModel != null) {
            combatPower += (long)upgradeModel.getBreachAddCombat();
         }

         if (heroBreachModel.getUnlockSkillIndex() > 0 && heroModel.getSkills().size() >= heroBreachModel.getUnlockSkillIndex()) {
            int skillId = (Integer)heroModel.getSkills().get(heroBreachModel.getUnlockSkillIndex());
            tempUnlockSkills.add(skillId);
         }
      }

      this.property_breach = propertyMap;
      this.combatPower_breach = combatPower;
      this.heroUnlockSkills = tempUnlockSkills;
   }

   private void flushOrnament() {
      this.property_ornament.clear();
      this.property_ornament_skill.clear();
      if (!this.ornament.isEmpty()) {
         List<PropertyModel> tempPropertyList = new ArrayList();
         List<Integer> skillSet = new ArrayList();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

         for(Map.Entry<Integer, OrnamentItem> entry : this.ornament.entrySet()) {
            for(PropertyModel property : ((OrnamentItem)entry.getValue()).proMap.values()) {
               if (property.getType() == 4) {
                  tempPropertyList.add(new PropertyModel(property.getType(), property.getWay(), property.getValue() / 100L));
               } else {
                  tempPropertyList.add(new PropertyModel(property.getType(), property.getWay(), property.getValue()));
               }
            }

            StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", ((OrnamentItem)entry.getValue()).id);
            StampBasicPropertyModel baseModel = (StampBasicPropertyModel)gameModelPool.getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
            if (!Objects.isNull(baseModel)) {
               int realValue = 0;
               if (baseModel.getNextLvValue() != 0) {
                  if (((OrnamentItem)entry.getValue()).lev == 0) {
                     realValue = baseModel.getPropertyValue();
                  } else {
                     realValue = Math.floorDiv((baseModel.getNextLvValue() - baseModel.getPropertyValue()) * ((OrnamentItem)entry.getValue()).lev, ((ResourceModel)stampModel.getLevUpConsume().get(0)).getValue()) + baseModel.getPropertyValue();
                  }
               } else {
                  realValue = baseModel.getPropertyValue();
               }

               PropertyModel property = new PropertyModel(baseModel.getBasicPropertyId(), baseModel.getBasicPropertyWay(), (long)realValue);
               tempPropertyList.add(property);
            }
         }

         Map<String, ArrayList<StampModel>> setMap = new HashMap();

         for(OrnamentItem ornamentItem : this.ornament.values()) {
            StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", ornamentItem.id);
            if (stampModel != null) {
               if (setMap.containsKey(stampModel.getSetType() + "-" + stampModel.getSetId())) {
                  ((ArrayList)setMap.get(stampModel.getSetType() + "-" + stampModel.getSetId())).add(stampModel);
               } else {
                  ArrayList<StampModel> list = new ArrayList();
                  list.add(stampModel);
                  setMap.put(stampModel.getSetType() + "-" + stampModel.getSetId(), list);
               }
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
               Map<Integer, Integer> specialMap = new HashMap();

               for(StampModel stampModel : stampList) {
                  MapUtil.mapPlusInt(specialMap, stampModel.getStar(), 1);
               }

               int minStar = Integer.MAX_VALUE;
               if (!specialMap.isEmpty()) {
                  for(Map.Entry<Integer, Integer> entry : specialMap.entrySet()) {
                     if ((Integer)entry.getValue() >= 2 && (Integer)entry.getKey() > maxStar) {
                        maxStar = (Integer)entry.getKey();
                     }

                     if ((Integer)entry.getKey() < minStar) {
                        minStar = (Integer)entry.getKey();
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

         this.property_ornament = tempPropertyList;
         List<Integer> effectList = getEffectsOfAddProperty(skillSet);

         for(PropertyModel property : getPropertyOfSkillEffect(effectList, this.lv)) {
            PropertyModel.addLvProtities(this.property_ornament_skill, property);
         }

      }
   }

   public static List<PropertyModel> getPropertyOfSkillEffect(List<Integer> skillEffectList, int heroLv) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      SkillEffectModel skillEffectModel = null;
      List<PropertyModel> property_skill_temp = new ArrayList();

      for(Integer effectId : skillEffectList) {
         skillEffectModel = (SkillEffectModel)gameModelPool.getEntity("skillEffect", effectId);
         if (skillEffectModel != null && skillEffectModel.getProperty() > 0 && skillEffectModel.getFetterType() == 0 && skillEffectModel.getNation() == 0) {
            int propertyId = skillEffectModel.getProperty();
            if (propertyId > 0) {
               int value = skillEffectModel.getPropertyValue();
               if (value != 0) {
                  property_skill_temp.add(new PropertyModel(propertyId, skillEffectModel.getCalc(), (long)value));
               }
            }

            int propertyId_lv = skillEffectModel.getProperty_lv();
            if (propertyId_lv > 0) {
               int value = skillEffectModel.getPropertyValue_lv() * heroLv;
               if (value != 0) {
                  property_skill_temp.add(new PropertyModel(propertyId_lv, skillEffectModel.getCalc_lv(), (long)value));
               }
            }
         }
      }

      return property_skill_temp;
   }

   public static List<Integer> getEffectsOfAddProperty(List<Integer> resourceSkillList) {
      List<Integer> allEffects = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

      for(Integer skillId : resourceSkillList) {
         SkillModel skillModel = (SkillModel)gameModelPool.getEntity("skill", skillId);
         if (skillModel != null && (skillModel.getType() == 1 || skillModel.getType() == 3)) {
            for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
               allEffects.add(entry.getValue());
            }
         }
      }

      return allEffects;
   }

   private void flushTalent(HeroModel heroModel) {
      this.skill_talent.clear();
      this.skill_talent = getTalentSkill(this.id, this.star, this.talent, heroModel);
      this.talent_power = getTalentPower(this.talent);
   }

   public static Long getTalentPower(Map<Integer, List> talentMap) {
      long totalPower = 0L;
      if (!talentMap.isEmpty()) {
         for(Map.Entry<Integer, List> entry : talentMap.entrySet()) {
            if (((List)entry.getValue()).size() > 1) {
               int position = (Integer)entry.getKey();
               int curLv = (Integer)((List)entry.getValue()).get(0);
               if (curLv > 0) {
                  for(int i = 1; i <= curLv; ++i) {
                     UpgradeModel upgradeModel = (UpgradeModel)ApplicationContextProvider.getModelPoolEntity("upgrade", i);
                     if (upgradeModel != null) {
                        int key = position - 19;
                        totalPower += (long)(Integer)upgradeModel.getTalentCombat().get(key);
                     }
                  }
               }
            }
         }
      }

      return totalPower;
   }

   public static List<Integer> getTalentSkill(int heroId, int star, Map<Integer, List> talentMap, HeroModel heroModel) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      List<Integer> tempSkill = new ArrayList();
      if (talentMap != null && !talentMap.isEmpty()) {
         for(Map.Entry<Integer, List> entry : talentMap.entrySet()) {
            if (((List)entry.getValue()).size() > 1) {
               int position = (Integer)entry.getKey();
               int curLv = (Integer)((List)entry.getValue()).get(0);
               int index = (Integer)((List)entry.getValue()).get(1);
               TalentLevelModel talentLevelModel = (TalentLevelModel)gameModelPool.getEntity("talentLevel", position);
               if (talentLevelModel != null && talentLevelModel.getStar() <= star) {
                  int key = position - 19;
                  int normalSkillId = getSkillId(heroId, position, curLv, index);
                  tempSkill.add(normalSkillId);
               }
            }
         }
      }

      return tempSkill;
   }

   public static int getSkillId(int heroId, int position, int curLv, int index) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, TalentSkillModel> modelMap = (Map)gameModelPool.getEntity("customTalentSkill", heroId);
      if (modelMap != null && !modelMap.isEmpty()) {
         TalentSkillModel talentSkillModel = (TalentSkillModel)modelMap.get(curLv);
         if (talentSkillModel != null) {
            int key = position - 19;
            if (talentSkillModel.getSkills().containsKey(key)) {
               ValListFun valListFun = (ValListFun)talentSkillModel.getSkills().get(key);
               if (valListFun != null) {
                  switch (index) {
                     case 0:
                        return valListFun.getV0();
                     case 1:
                        return valListFun.getV1();
                     case 2:
                        return valListFun.getV2();
                  }
               }
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   private void flushHeroStar() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      int nextUpStarId = heroModel.getUpStarId();
      HashMap<Integer, Integer> tempTotalPropertyMap = new HashMap();
      int starLoop = 0;
      long combatPower = 0L;
      HeroUpStarModel heroUpStarModel = null;

      while(this.realStar - heroModel.getStar() > starLoop) {
         heroUpStarModel = (HeroUpStarModel)gameModelPool.getEntity("heroUpStar", nextUpStarId);
         ++starLoop;
         nextUpStarId = heroUpStarModel.getNext();
         HashMap<Integer, Integer> propertyMap = new HashMap();
         if (heroUpStarModel != null) {
            propertyMap.put(1, heroUpStarModel.getHpAward());
            propertyMap.put(2, heroUpStarModel.getAtkAward());
            propertyMap.put(3, heroUpStarModel.getDefAward());
            propertyMap.put(4, heroUpStarModel.getSpdAward());
            propertyMap.put(11, heroUpStarModel.getResistAward());
         }

         MapUtil.mapMergeInt(tempTotalPropertyMap, propertyMap);
         int skillSlot = heroUpStarModel.getSkillSlot();
         int size = this.heroUnlockSkills.size();
         switch (skillSlot) {
            case 1:
            case 2:
            case 3:
            case 4:
               if (size > skillSlot) {
                  if (heroUpStarModel.getNewSkillList().size() == 0) {
                     this.logger.warn("武将{}替换技能报错,槽位:{}", this.id, skillSlot);
                  } else {
                     int newSkill = (Integer)heroUpStarModel.getNewSkillList().get(0);
                     this.heroUnlockSkills.set(skillSlot, newSkill);
                  }
               }
               break;
            case 5:
               for(int i = 0; i < heroUpStarModel.getNewSkillList().size(); ++i) {
                  if (size > i + 1) {
                     this.heroUnlockSkills.set(i + 1, heroUpStarModel.getNewSkillList().get(i));
                  }
               }
         }
      }

      UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", this.realStar);
      if (upgradeModel != null) {
         combatPower += (long)upgradeModel.getStarAddCombat();
      }

      this.property_star = tempTotalPropertyMap;
      this.combatPower_star = combatPower;
   }

   private void flushEquip() {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      List<PropertyModel> temp_propertyModels = new ArrayList();

      for(Map.Entry<Integer, EquipItem> entry : this.equips.entrySet()) {
         ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", ((EquipItem)entry.getValue()).id);
         if (itemModel != null) {
            ItemPropertyModel itemPropertyModel = (ItemPropertyModel)gameModelPool.getEntity("itemProperty", itemModel.getProperty());
            if (itemPropertyModel != null) {
               for(PropertyModel model : itemPropertyModel.getProperties()) {
                  temp_propertyModels.add(model);
               }

               for(PropertyModel propertyModel : itemPropertyModel.getSuitProperty()) {
                  temp_propertyModels.add(propertyModel);
               }
            }
         }
      }

      this.property_equips = temp_propertyModels;
   }

   private void flushWarriorSignet() {
      Set<Integer> tempSkillList = new HashSet();
      List<PropertyModel> tempPropertyList = new ArrayList();

      for(Map.Entry<Integer, WarriorSignet> entry : this.warriors.entrySet()) {
         for(Integer skillId : ((WarriorSignet)entry.getValue()).skills) {
            tempSkillList.add(skillId);
         }

         List<Integer> skillIdList = WarriorSignetDefine.getSkillIdList(((WarriorSignet)entry.getValue()).id);
         tempSkillList.addAll(skillIdList);
         tempPropertyList.addAll(((WarriorSignet)entry.getValue()).properties);
      }

      this.property_warriorignet = tempPropertyList;
      this.skill_warriorignet = tempSkillList;
   }

   private void flushWarcraft() {
      Set<Integer> tempSet = new HashSet();

      for(Map.Entry<Integer, Integer> entry : this.warcrafts.entrySet()) {
         int k = (Integer)entry.getKey();
         int v = (Integer)entry.getValue();
         tempSet.add(v);
      }

      this.skill_warcraft = tempSet;
   }

   private void flushExclusiveTreasure() {
      if (null != this.exTreasure) {
         this.property_exclusive_treasure.clear();
         this.skill_exclusive_treasure.clear();
         List<PropertyModel> tempList = new ArrayList();
         int tempSkillId = 0;
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         Map<Integer, ExclusiveTreasureBaseModel> modelMap = gameModelPool.getMap("exclusiveTreasureBase");
         HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
         ArrayList<ExclusiveTreasureBaseModel> extraList = new ArrayList();

         for(ExclusiveTreasureBaseModel model : modelMap.values()) {
            if (model.getLev() <= this.exTreasure.lev && model.getStar() <= this.exTreasure.star && model.getNation() == heroModel.getType()) {
               extraList.add(model);
            }
         }

         for(int i = 0; i < extraList.size(); ++i) {
            ExclusiveTreasureBaseModel model = (ExclusiveTreasureBaseModel)extraList.get(i);
            tempList.add(new PropertyModel(model.getProId(), model.getProWay(), (long)model.getProValue()));
         }

         if (!this.exTreasure.stoneMap.isEmpty()) {
            for(Integer stoneId : this.exTreasure.stoneMap.values()) {
               ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
               if (!Objects.isNull(stoneModel)) {
                  tempList.add(new PropertyModel(stoneModel.getProType(), stoneModel.getProWay(), (long)stoneModel.getProValue()));
               }
            }
         }

         ExclusiveTreasureActivationModel activationModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition1);
         Map<Integer, Integer> numMap = new HashMap();
         if (!this.exTreasure.stoneMap.isEmpty()) {
            for(Integer stoneId : this.exTreasure.stoneMap.values()) {
               ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)gameModelPool.getEntity("exclusiveTreasureStone", stoneId);
               if (!Objects.isNull(stoneModel)) {
                  int tempNum = (Integer)numMap.getOrDefault(stoneModel.getType(), 0);
                  numMap.put(stoneModel.getType(), tempNum + 1);
               }
            }

            int num1 = (Integer)numMap.getOrDefault(1, 0);
            int num2 = (Integer)numMap.getOrDefault(2, 0);
            int num3 = (Integer)numMap.getOrDefault(3, 0);
            if (num1 >= activationModel.getTriangleNum() && num2 >= activationModel.getSquareNum() && num3 >= activationModel.getCircularNum()) {
               ExclusiveTreasureExtraModel extraModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.extraProId);
               if (!Objects.isNull(extraModel)) {
                  tempList.add(new PropertyModel(extraModel.getPropertyId(), extraModel.getPropertyWay(), (long)extraModel.getPropertyValue()));
               }
            }

            ExclusiveTreasureActivationModel skillModel = (ExclusiveTreasureActivationModel)gameModelPool.getEntity("exclusiveTreasureActivation", this.exTreasure.condition2);
            if (num1 >= skillModel.getTriangleNum() && num2 >= skillModel.getSquareNum() && num3 >= skillModel.getCircularNum()) {
               ExclusiveTreasureExtraModel extraSkillModel = (ExclusiveTreasureExtraModel)gameModelPool.getEntity("exclusiveTreasureExtra", this.exTreasure.skillId);
               if (!Objects.isNull(extraSkillModel)) {
                  tempSkillId = extraSkillModel.getSkillId();
               }
            }
         }

         this.property_exclusive_treasure = tempList;
         if (tempSkillId > 0) {
            this.skill_exclusive_treasure.add(tempSkillId);
         }

      }
   }

   private void flushHeroSkill() {
      List<Integer> allHeroSkills = new ArrayList();
      allHeroSkills.addAll(this.heroUnlockSkills);
      allHeroSkills.addAll(this.skill_talent);
      List<Integer> allEffects = HeroDao.getEffectsOfAddProperty(allHeroSkills);
      this.property_skill_hero = HeroDao.getPropertyOfSkillEffect(allEffects, this.lv);
   }

   private void flushOtherSkill() {
      List<Integer> allEffects = this.getOtherSkillEffectsOfAddProperty();
      this.property_skill_other = HeroDao.getPropertyOfSkillEffect(allEffects, this.lv);
   }

   private List<Integer> getOtherSkillEffectsOfAddProperty() {
      List<Integer> allEffects = new ArrayList();
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      Set<Integer> allSkills = new HashSet();
      allSkills.addAll(this.skill_warcraft);
      allSkills.addAll(this.skill_warriorignet);

      for(Integer skillId : monsterManager.getSkillOfRemoveChild(allSkills)) {
         WarriorSignetSkillModel warriorSignetSkillModel = (WarriorSignetSkillModel)gameModelPool.getEntity("warriorSignetSkill", skillId);
         if (warriorSignetSkillModel != null) {
            for(Map.Entry<Integer, Integer> entry : warriorSignetSkillModel.getEffects().entrySet()) {
               allEffects.add(entry.getValue());
            }
         }
      }

      List<Integer> allOtherSkillList = new ArrayList();
      allOtherSkillList.addAll(this.skill_exclusive_treasure);

      for(Integer skillId : allOtherSkillList) {
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
         if (skillModel == null) {
            this.logger.info("找不到技能配置，技能ID={}", skillId);
         }
      }

      return allEffects;
   }

   private void calTotalPorperty() {
      HashMap<Integer, Long> tempTotalFightProperties = new HashMap();
      HashMap<Integer, Long> tempTotalShowProperties = new HashMap();
      long tempTotalCombatPower = this.calCombatPowerOfOtherModel();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);

      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         int add_heroBreach = (Integer)this.property_breach.getOrDefault(key, 0);
         int add_heroUpStar = (Integer)this.property_star.getOrDefault(key, 0);
         long[] add_skill_val = this.claHeroSkillProperty(key, 0);
         long[] add_skill_per = this.claHeroSkillProperty(key, 1);
         long[] add_other_val = this.calOtherProperty(key, 0);
         long[] add_other_per = this.calOtherProperty(key, 1);
         long add_growing_lv = 0L;
         BattleProGrowingModel battleProGrowingModel = (BattleProGrowingModel)gameModelPool.getEntity("battleProGrowing", key);
         if (battleProGrowingModel != null) {
            add_growing_lv = (long)(Double.valueOf(battleProGrowingModel.getNum()) * (double)this.lv);
         }

         long base = (Long)entry.getValue();
         int growAdd = 0;
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         double tempResult = (double)0.0F;
         long tempFightResult = 0L;
         long tempShowResult = 0L;
         long tempCombatPower = 0L;
         if ((Integer)entry.getKey() == 1) {
            growAdd = configManager.getInt("hpLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * (double)(1.0F + (float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 2) {
            growAdd = configManager.getInt("atkLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * (double)(1.0F + (float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 3) {
            growAdd = configManager.getInt("defLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 4) {
            growAdd = configManager.getInt("spdLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 21) {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) + (double)add_other_val[0] + (double)add_skill_val[0] + (double)((float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf(tempResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 22) {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) + (double)add_other_val[0] + (double)add_skill_val[0] + (double)((float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf(tempResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 6) {
            int baseCritiDamage = configManager.getIntDefault("baseCritiDamage", 12000);
            tempResult = (double)((Long)entry.getValue() + (long)baseCritiDamage);
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0] + (double)add_growing_lv;
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            long combatResult = tempFightResult - (Long)heroModel.getProperty().get(key) - (long)baseCritiDamage;
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 8) {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0] + (double)add_growing_lv;
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            long combatResult = tempFightResult - (Long)heroModel.getProperty().get(key);
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 11) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv + (long)add_heroUpStar;
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = (long)((int)(Math.pow((double)1.0F - (double)tempShowResult / (double)50000.0F, (double)5.0F) * (double)10000.0F));
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 14) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv;
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = (long)((int)(Math.pow((double)1.0F - (double)tempShowResult / (double)50000.0F, (double)5.0F) * (double)10000.0F));
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 15) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv;
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = (long)((int)(Math.pow((double)1.0F - (double)tempShowResult / (double)50000.0F, (double)5.0F) * (double)10000.0F));
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 23) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv;
            tempFightResult = Double.valueOf(((double)1.0F - (double)(Long)entry.getValue() / (double)10000.0F) * ((double)1.0F - (double)add_other_val[1] / (double)10000.0F) * ((double)1.0F - (double)add_other_per[1] / (double)10000.0F) * ((double)1.0F - (double)add_skill_per[1] / (double)10000.0F) * ((double)1.0F - (double)add_skill_val[1] / (double)10000.0F) * ((double)1.0F - (double)add_growing_lv / (double)10000.0F) * (double)10000.0F).longValue();
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0] + (double)add_growing_lv;
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf(tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         }

         tempTotalCombatPower += tempCombatPower;
         tempTotalFightProperties.put(key, tempFightResult);
         tempTotalShowProperties.put(key, tempShowResult);
      }

      this.totalFightProperties = tempTotalFightProperties;
      this.totalShowProperties = tempTotalShowProperties;
      this.totalCombatPower = tempTotalCombatPower;
   }

   private void calTotalPorpertyForDragonWar() {
      HashMap<Integer, Long> tempTotalFightProperties = new HashMap();
      HashMap<Integer, Long> tempTotalShowProperties = new HashMap();
      long tempTotalCombatPower = this.calCombatPowerOfOtherModel();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);

      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         int add_heroBreach = (Integer)this.property_breach.getOrDefault(key, 0);
         int add_heroUpStar = (Integer)this.property_star.getOrDefault(key, 0);
         long[] add_skill_val = this.claHeroSkillProperty(key, 0);
         long[] add_skill_per = this.claHeroSkillProperty(key, 1);
         long[] add_other_val = this.calOtherProperty(key, 0);
         long[] add_other_per = this.calOtherProperty(key, 1);
         long add_growing_lv = 0L;
         long base = (Long)entry.getValue();
         int growAdd = 0;
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         double tempResult = (double)0.0F;
         long tempFightResult = 0L;
         long tempShowResult = 0L;
         long tempCombatPower = 0L;
         if ((Integer)entry.getKey() == 1) {
            growAdd = configManager.getInt("hpLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * (double)(1.0F + (float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 2) {
            growAdd = configManager.getInt("atkLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * (double)(1.0F + (float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 3) {
            growAdd = configManager.getInt("defLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 4) {
            growAdd = configManager.getInt("spdLevelGrowUp");
            tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            tempResult = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf((double)tempFightResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 21) {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) + (double)add_other_val[0] + (double)add_skill_val[0] + (double)((float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf(tempResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 22) {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) + (double)add_other_val[0] + (double)add_skill_val[0] + (double)((float)add_growing_lv / 10000.0F);
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf(tempResult * propertyToPowerRatio).longValue();
         } else if ((Integer)entry.getKey() == 6) {
            int baseCritiDamage = configManager.getIntDefault("baseCritiDamage", 12000);
            tempResult = (double)((Long)entry.getValue() + (long)baseCritiDamage);
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0] + (double)add_growing_lv;
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            long combatResult = tempFightResult - (Long)heroModel.getProperty().get(key) - (long)baseCritiDamage;
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 8) {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0] + (double)add_growing_lv;
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            long combatResult = tempFightResult - (Long)heroModel.getProperty().get(key);
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 11) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv + (long)add_heroUpStar;
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = (long)((int)(Math.pow((double)1.0F - (double)tempShowResult / (double)50000.0F, (double)5.0F) * (double)10000.0F));
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 14) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv;
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = (long)((int)(Math.pow((double)1.0F - (double)tempShowResult / (double)50000.0F, (double)5.0F) * (double)10000.0F));
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 15) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv;
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = (long)((int)(Math.pow((double)1.0F - (double)tempShowResult / (double)50000.0F, (double)5.0F) * (double)10000.0F));
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else if ((Integer)entry.getKey() == 23) {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0] + add_growing_lv;
            tempFightResult = Double.valueOf(((double)1.0F - (double)(Long)entry.getValue() / (double)10000.0F) * ((double)1.0F - (double)add_other_val[1] / (double)10000.0F) * ((double)1.0F - (double)add_other_per[1] / (double)10000.0F) * ((double)1.0F - (double)add_skill_per[1] / (double)10000.0F) * ((double)1.0F - (double)add_skill_val[1] / (double)10000.0F) * ((double)1.0F - (double)add_growing_lv / (double)10000.0F) * (double)10000.0F).longValue();
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         } else {
            tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0] + (double)add_growing_lv;
            tempFightResult = tempShowResult = Double.valueOf(tempResult).longValue();
            tempCombatPower = Double.valueOf(tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
         }

         tempTotalCombatPower += tempCombatPower;
         tempTotalFightProperties.put(key, tempFightResult);
         tempTotalShowProperties.put(key, tempShowResult);
      }

      this.totalFightProperties = tempTotalFightProperties;
      this.totalShowProperties = tempTotalShowProperties;
      this.totalCombatPower = tempTotalCombatPower;
   }

   private void calTotalPorpertyForDecisive() {
      HashMap<Integer, Long> tempTotalFightProperties = new HashMap();
      HashMap<Integer, Long> tempTotalShowProperties = new HashMap();
      long tempTotalCombatPower = this.calCombatPowerOfOtherModel();
      Map<Integer, Long> tempOrnamentProperties = new HashMap();
      double tempOrnamentPower = (double)0.0F;
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);

      for(Map.Entry<Integer, Long> entry : this.baseProperties.entrySet()) {
         int key = (Integer)entry.getKey();
         int add_heroBreach = (Integer)this.property_breach.getOrDefault(key, 0);
         int add_heroUpStar = (Integer)this.property_star.getOrDefault(key, 0);
         long[] add_skill_val = this.claHeroSkillProperty(key, 0);
         long[] add_skill_per = this.claHeroSkillProperty(key, 1);
         long[] add_other_val = this.calOtherProperty(key, 0);
         long[] add_other_per = this.calOtherProperty(key, 1);
         long add_growing_lv = 0L;
         long[] add_ornament_val = this.calListProperty(key, 0, this.property_ornament);
         long[] add_ornament_per = this.calListProperty(key, 1, this.property_ornament);
         long[] add_ornament_skill_val = this.calListProperty(key, 0, this.property_ornament_skill);
         long[] add_ornament_skill_per = this.calListProperty(key, 1, this.property_ornament_skill);
         long[] add_no_addition_val = new long[]{0L, 0L};
         long[] add_have_power_val = new long[]{0L, 0L};
         long add_friend_val = 0L;
         long base = (Long)entry.getValue();
         int growAdd = 0;
         UpgradeModel upgradeModel = (UpgradeModel)gameModelPool.getEntity("upgrade", key);
         double propertyToPowerRatio = Double.parseDouble(upgradeModel.getPropertyAddCombat());
         long tempFightResult;
         long tempShowResult;
         long tempCombatPower;
         double ornamentPropertyBefore;
         double ornamentPowerBefore;
         double ornamentPropertyAfter;
         double ornamentPowerAfter;
         if ((Integer)entry.getKey() == 1) {
            growAdd = configManager.getInt("hpLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 2) {
            growAdd = configManager.getInt("atkLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv) * (1.0F + (float)add_heroBreach / 10000.0F) * (1.0F + (float)add_heroUpStar / 10000.0F) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 3) {
            growAdd = configManager.getInt("defLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 4) {
            growAdd = configManager.getInt("spdLevelGrowUp");
            double tempResult = (double)(((float)base + (float)(base * (long)growAdd) / 10000.0F * (float)this.lv + (float)add_heroBreach + (float)add_heroUpStar) * (1.0F + (float)add_skill_per[0] / 10000.0F) + (float)add_skill_val[0]);
            ornamentPowerBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_ornament_val[0] + (double)add_ornament_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 21) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 22) {
            double tempResult = (double)(Long)entry.getValue();
            ornamentPowerBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F) * propertyToPowerRatio;
            ornamentPropertyBefore = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F);
            ornamentPropertyAfter = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            tempResult = (tempResult + (double)add_other_val[0] + (double)add_skill_val[0] + (double)add_ornament_skill_val[0] + (double)add_ornament_val[0]) * (double)(1.0F + (float)add_other_per[0] / 10000.0F + (float)add_skill_per[0] / 10000.0F + (float)add_ornament_skill_per[0] / 10000.0F + (float)add_ornament_per[0] / 10000.0F);
            ornamentPowerAfter = tempResult * propertyToPowerRatio;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 6) {
            int baseCritiDamage = configManager.getIntDefault("baseCritiDamage", 12000);
            double tempResult = (double)((Long)entry.getValue() + (long)baseCritiDamage);
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key) - (long)baseCritiDamage;
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() == 8) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            long combatResult = tempPowerResult - (Long)heroModel.getProperty().get(key);
            tempPowerResult += add_have_power_val[0];
            if (combatResult < 0L) {
               combatResult = 0L;
            }

            tempCombatPower = Double.valueOf((double)combatResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else if ((Integer)entry.getKey() != 11 && (Integer)entry.getKey() != 14 && (Integer)entry.getKey() != 15 && (Integer)entry.getKey() != 23) {
            double tempResult = (double)(Long)entry.getValue();
            tempResult = tempResult + (double)add_other_val[0] + (double)add_other_per[0] + (double)add_skill_per[0] + (double)add_skill_val[0];
            ornamentPowerBefore = tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            ornamentPropertyBefore = tempResult;
            ornamentPropertyAfter = tempResult + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            tempResult = tempResult + (double)add_ornament_skill_val[0] + (double)add_ornament_skill_per[0] + (double)add_ornament_val[0] + (double)add_ornament_per[0];
            ornamentPowerAfter = tempResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            long tempPowerResult = Double.valueOf(tempResult + (double)add_friend_val).longValue();
            tempPowerResult += add_have_power_val[0];
            tempCombatPower = Double.valueOf((double)tempPowerResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
            tempFightResult = tempShowResult = tempPowerResult + add_no_addition_val[0];
         } else {
            tempShowResult = (Long)entry.getValue() + add_other_val[0] + add_other_per[0] + add_skill_per[0] + add_skill_val[0];
            if (tempShowResult > 20000L) {
               tempShowResult = 20000L;
            }

            tempFightResult = Double.valueOf((double)((1.0F - (float)(Long)entry.getValue() / 10000.0F) * (1.0F - (float)add_other_val[1] / 10000.0F) * (1.0F - (float)add_other_per[1] / 10000.0F) * (1.0F - (float)add_skill_per[1] / 10000.0F) * (1.0F - (float)add_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_val[1] / 10000.0F) * (1.0F - (float)add_ornament_per[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_val[1] / 10000.0F) * (1.0F - (float)add_ornament_skill_per[1] / 10000.0F) * 10000.0F)).longValue();
            ornamentPowerBefore = (double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            ornamentPropertyBefore = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_val[0] + add_ornament_per[0];
            ornamentPropertyAfter = (double)tempShowResult;
            tempShowResult = tempShowResult + add_ornament_skill_val[0] + add_ornament_skill_per[0];
            ornamentPowerAfter = (double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F;
            tempShowResult += add_have_power_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_have_power_val[1] / 10000.0F))).longValue();
            tempCombatPower = Double.valueOf((double)tempShowResult * propertyToPowerRatio * (double)this.lv / (double)10.0F).longValue();
            tempShowResult += add_no_addition_val[0];
            tempFightResult = Double.valueOf((double)((float)tempFightResult * (1.0F - (float)add_no_addition_val[1] / 10000.0F))).longValue();
         }

         tempTotalCombatPower += tempCombatPower;
         tempTotalFightProperties.put(key, tempFightResult);
         tempTotalShowProperties.put(key, tempShowResult);
         tempOrnamentPower += (double)Double.valueOf(ornamentPowerAfter - ornamentPowerBefore).longValue();
         tempOrnamentProperties.put(key, Double.valueOf(ornamentPropertyAfter - ornamentPropertyBefore).longValue());
      }

      this.ornamentProperties = tempOrnamentProperties;
      this.ornament_power = Double.valueOf(tempOrnamentPower).longValue();
      this.totalFightProperties = tempTotalFightProperties;
      this.totalShowProperties = tempTotalShowProperties;
      tempTotalCombatPower += this.talent_power;
      this.totalCombatPower = tempTotalCombatPower;
   }

   private long[] calListProperty(int key, int way, List<PropertyModel> list) {
      long[] total = new long[]{0L, 0L};
      if (list != null && !list.isEmpty()) {
         for(PropertyModel propertyModel : mergePropertys(list)) {
            if (propertyModel.getType() == key && propertyModel.getWay() == way) {
               total[0] += propertyModel.getValue();
               total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
            }
         }

         return total;
      } else {
         return total;
      }
   }

   public static List<PropertyModel> mergePropertys(List<PropertyModel> oldList) {
      List<PropertyModel> newList = new ArrayList();

      for(PropertyModel propertyModel : oldList) {
         boolean isSame = false;

         for(PropertyModel model : newList) {
            if (model.getType() == propertyModel.getType() && model.getWay() == propertyModel.getWay()) {
               model.setValue(model.getValue() + propertyModel.getValue());
               isSame = true;
            }
         }

         if (!isSame) {
            newList.add(new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
         }
      }

      return newList;
   }

   private long[] claHeroSkillProperty(int key, int way) {
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : this.property_skill_hero) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   private long[] calOtherProperty(int key, int way) {
      long[] total = new long[]{0L, 0L};

      for(PropertyModel propertyModel : HeroDao.mergePropertys(this.property_equips)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : HeroDao.mergePropertys(this.property_warriorignet)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : HeroDao.mergePropertys(this.property_exclusive_treasure)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : HeroDao.mergePropertys(this.property_skill_other)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      for(PropertyModel propertyModel : HeroDao.mergePropertys(this.offsetList)) {
         if (propertyModel.getType() == key && propertyModel.getWay() == way) {
            total[0] += propertyModel.getValue();
            total[1] = this.addProperty(total[1], propertyModel.getValue(), key);
         }
      }

      return total;
   }

   public long addProperty(long base, long add, int key) {
      if (BattleMisc.isMultiplyProperty(key)) {
         return base == 0L ? add : 10000L - (10000L - base) * (10000L - add) / 10000L;
      } else {
         return base + add;
      }
   }

   private long calCombatPowerOfOtherModel() {
      int result = 0;
      result = (int)((long)result + this.combatPower_breach);
      result = (int)((long)result + this.combatPower_star);
      return (long)result;
   }

   public Set<Integer> getWearSkill() {
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      Set<Integer> wearSkills = new HashSet();
      wearSkills.addAll(this.skill_warcraft);
      wearSkills.addAll(this.skill_warriorignet);
      return monsterManager.getSkillOfRemoveChild(wearSkills);
   }

   public Monster(int step, int id, int lv, int star, int offset, List<WarriorSignet> warriorSignets, List<Integer> warcraftList, List<PropertyModel> proList) {
      this.id = id;
      this.lv = lv;
      this.limitLv = lv;
      this.star = star;
      this.realStar = star;
      this.isWear = false;
      this.offset = offset;
      if (warriorSignets != null && !warriorSignets.isEmpty() && warriorSignets.size() <= 2) {
         int pos = 5;

         for(WarriorSignet warriorSignet : warriorSignets) {
            this.warriors.put(pos, warriorSignet);
            ++pos;
         }
      }

      int key_warcrafts = CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1.getNumber();

      for(Integer warcraftId : warcraftList) {
         this.warcrafts.put(key_warcrafts, warcraftId);
         ++key_warcrafts;
      }

      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", id);
      DecisiveBattleMainModel mainModel = (DecisiveBattleMainModel)gameModelPool.getEntity("DecisiveBattleMain", step);
      if (heroModel != null && mainModel != null) {
         Map<Integer, DecisiveStampModel> modelMap = gameModelPool.getMap("DecisiveStamp");

         for(DecisiveStampModel model : modelMap.values()) {
            if (model.getType() == heroModel.getType()) {
               String[] stamp = model.getRobotStampId().split("\\|");
               String stampStr = stamp[RandomUtil.randomInt(0, stamp.length)];
               String[] stampList = stampStr.split(",");

               for(int i = 0; i < stampList.length; ++i) {
                  int stampId = Integer.parseInt(stampList[i]);
                  StampModel stampModel = (StampModel)gameModelPool.getEntity("Stamp", stampId);
                  int targetStampId = this.getStarOrnament(stampModel, mainModel.getStampStar());
                  OrnamentItem newOrnament = this.createOrnamentById(targetStampId);
                  StampBasicPropertyModel basicPropertyModel = (StampBasicPropertyModel)gameModelPool.getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
                  int pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_1.getNumber();
                  if (basicPropertyModel.getStampType() == 2) {
                     pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_2.getNumber();
                  } else if (basicPropertyModel.getStampType() == 3) {
                     pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_3.getNumber();
                  } else if (basicPropertyModel.getStampType() == 4) {
                     pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_4.getNumber();
                  }

                  this.ornament.put(pos, newOrnament);
               }
            }
         }

         Map<Integer, TalentLevelModel> talentLevelModelMap = gameModelPool.getMap("talentLevel");

         for(TalentLevelModel model : talentLevelModelMap.values()) {
            if (star >= model.getStar()) {
               List<Integer> tempList = new ArrayList();
               tempList.add(5);
               if (heroModel.getType() == HeroDefine.HERO_JOB_DEFEND) {
                  tempList.add(1);
                  this.talent.put(model.getId(), tempList);
               } else if (heroModel.getType() == HeroDefine.HERO_JOB_SUPPORT) {
                  tempList.add(2);
                  this.talent.put(model.getId(), tempList);
               } else {
                  tempList.add(0);
                  this.talent.put(model.getId(), tempList);
               }
            }
         }
      }

      this.initForDecisive(proList);
   }

   public int getStarOrnament(StampModel stampModel, int targetStar) {
      int curStar = stampModel.getStar();
      int curId = stampModel.getId();
      int flag = 0;

      while(true) {
         if (curStar < targetStar && flag < 10) {
            StampModel curModel = (StampModel)((GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class)).getEntity("Stamp", curId);
            if (curModel.getStar() != targetStar && curModel.getTargetStamp() != 0) {
               curId = curModel.getTargetStamp();
               ++flag;
               continue;
            }

            return curModel.getId();
         }

         return stampModel.getId();
      }
   }

   public OrnamentItem createOrnamentById(int stampId) {
      OrnamentItem item = new OrnamentItem();
      item.id = stampId;
      item.code = 0;
      item.lev = 0;
      return item;
   }

   private void initForDecisive(List<PropertyModel> proList) {
      MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.id);
      int maxStar = monsterManager.getMaxStarOfHero(this.id);
      if (this.star == 0) {
         this.star = this.realStar = monsterManager.getStarByLv(this.id, this.lv);
         if (this.star > maxStar) {
            this.star = this.realStar = maxStar;
         }
      } else if (this.realStar < heroModel.getStar()) {
         this.star = this.realStar = heroModel.getStar();
      }

      if (this.star > maxStar) {
         this.realStar = maxStar;
      }

      int maxLv = MonsterManager.maxLvByStar[this.realStar];
      if (this.limitLv > maxLv) {
         this.limitLv = maxLv;
      }

      this.breachLv = monsterManager.getBreachLvByLv(this.realStar, this.limitLv);
      this.parseOffset();
      this.quality = heroModel.getQuality();
      this.baseProperties.putAll(heroModel.getProperty());
      this.flushHeroBreach();
      this.flushHeroStar();
      this.flushWarriorSignet();
      this.flushWarcraft();
      if (!proList.isEmpty()) {
         this.property_exclusive_treasure = proList;
      }

      if (heroModel != null) {
         this.flushTalent(heroModel);
      }

      this.flushHeroSkill();
      this.flushOtherSkill();
      this.flushOrnament();
      if (heroModel.getMonsterType() == 1) {
         this.totalShowProperties = heroModel.getProperty();
         this.totalFightProperties = heroModel.getProperty();
      } else {
         this.calTotalPorpertyForDecisive();
      }
   }
}
