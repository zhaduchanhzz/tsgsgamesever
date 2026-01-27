package com.gzbz.battle.pkteam;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.BeautyEntity;
import com.gzbz.battle.entity.DragonEntity;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.PetEntity;
import com.gzbz.battle.entity.WeaponEntity;
import com.gzbz.battle.listener.Listener;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.HeroDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.ArtifactArrayingEntity;
import com.gzbz.db.arraying.BeautyArrayingEntity;
import com.gzbz.db.arraying.DragonArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.arraying.PetArrayingEntity;
import com.gzbz.db.arraying.PetMirror;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.BattleMonsterWearModel;
import com.gzbz.model.BattleWearModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroNationAdditionModel;
import com.gzbz.model.PlotBattleModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.SupportHeroModel;
import com.gzbz.model.WarFlagModel;
import com.gzbz.model.fun.ArtifactSkillPropertyFun;
import com.gzbz.model.fun.BattleMonsterFun;
import com.gzbz.model.fun.PlotBattleMonsterFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.WarriorsModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattlePKTeam implements Serializable {
   Logger logger;
   protected int belongId;
   protected String belongName;
   private byte force;
   private transient BattleScene scene;
   private WeaponEntity weaponEntity;
   private BeautyEntity beautyEntity;
   private DragonEntity dragonEntity;
   private Entity friendEntity;
   private TargetSelector targetSelector;
   protected HashMap<Byte, Entity> entityMap;
   protected HashMap<Integer, Entity> passiveSkill;
   protected TreeMap<Long, Entity> reserveEntity;
   protected HashMap<Integer, PetEntity> petMap;
   protected HashMap<Integer, PetEntity> skillPetMap;
   private boolean friendOnFormation;
   private byte skillOrder;
   protected int buffId;
   protected HashSet<Integer> onlyPassive;
   private long combatPower;
   private int pvpRank;
   private int lv;
   private int head;
   private int headFrame;
   private boolean isPlayer;
   private long highestPower;
   private int maxLevel;
   private int countryWarScoreAdd;
   private int friendState;
   private int friendNation;
   private int friendJob;
   private List<Integer> cooperateBeauty;
   private List<Integer> cooperateBeautySkill;
   private int serverId;
   private int soulHeroId;

   public int getServerId() {
      return this.serverId;
   }

   public void setServerId(int serverId) {
      this.serverId = serverId;
   }

   public int getSoulHeroId() {
      return this.soulHeroId;
   }

   public void setSoulHeroId(int soulHeroId) {
      this.soulHeroId = soulHeroId;
   }

   public BattlePKTeam() {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
   }

   public void init(byte force, BattleScene scene) {
      this.force = force;
      this.scene = scene;
      this.targetSelector = new TargetSelector(this, scene);
   }

   public BattlePKTeam(int battleId) {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
      if (battleModel == null) {
         throw new RuntimeException("生成pkteam时未找到战斗id:" + battleId);
      } else {
         long totalPower = 0L;
         int tempSoulHeroId = 0;

         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            Entity entity = new Entity(BattleMsg.EntityType.EntityType_Monster, fun, getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
            totalPower += entity.getCombatPower();
            if (fun.getPos() == BattleMisc.FORCE_FRIEND_TEAM_POS) {
               this.friendEntity = entity;
               this.friendEntity.setType(BattleMsg.EntityType.EntityType_Friend);
            } else {
               this.entityMap.put(fun.getPos(), entity);
            }

            if (entity.getHeroMirror().inheritNation > 0) {
               tempSoulHeroId = entity.getHeroMirror().id;
            }
         }

         this.combatPower = totalPower;
         this.belongId = battleModel.getId();
         this.belongName = battleModel.getName();
         this.soulHeroId = tempSoulHeroId;
         this.initOtherAddProperty();
      }
   }

   public BattlePKTeam(int battleId, int type) {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
      if (battleModel == null) {
         throw new RuntimeException("生成pkteam时未找到战斗id:" + battleId);
      } else {
         long totalPower = 0L;
         int tempSoulHeroId = 0;

         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            Entity entity = new Entity(BattleMsg.EntityType.EntityType_Monster, fun);
            totalPower += entity.getCombatPower();
            if (fun.getPos() == BattleMisc.FORCE_FRIEND_TEAM_POS) {
               this.friendEntity = entity;
               this.friendEntity.setType(BattleMsg.EntityType.EntityType_Friend);
            } else {
               this.entityMap.put(fun.getPos(), entity);
            }

            if (entity.getHeroMirror().inheritNation > 0) {
               tempSoulHeroId = entity.getHeroMirror().id;
            }
         }

         this.combatPower = totalPower;
         this.belongId = battleModel.getId();
         this.belongName = battleModel.getName();
         this.soulHeroId = tempSoulHeroId;
         this.initArrayingAddProperty();
         this.initFetterAddProperty();
      }
   }

   public static List<WarriorSignet> getWarriorSignetByLv(int heroId, int lv, int limit) {
      List<WarriorSignet> warriorSignetList = new ArrayList();
      if (limit == 1) {
         return warriorSignetList;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
         if (heroModel == null) {
            return warriorSignetList;
         } else {
            TreeMap<Integer, BattleMonsterWearModel> treeMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customBattleMonsterWear", heroModel.getType());
            if (treeMap != null && !treeMap.isEmpty()) {
               BattleMonsterWearModel battleMonsterWearModel = null;

               for(Map.Entry<Integer, BattleMonsterWearModel> entry : treeMap.entrySet()) {
                  if (lv > ((BattleMonsterWearModel)entry.getValue()).getLv()) {
                     battleMonsterWearModel = (BattleMonsterWearModel)entry.getValue();
                  }
               }

               if (battleMonsterWearModel == null) {
                  return warriorSignetList;
               } else {
                  for(WarriorsModel warrior : battleMonsterWearModel.getWarriors()) {
                     warriorSignetList.add(warrior.toWarriorSignet());
                  }

                  return warriorSignetList;
               }
            } else {
               return warriorSignetList;
            }
         }
      }
   }

   public static List<WarriorSignet> getWarriorSignetByBattleId(int battleId, int pos) {
      List<WarriorSignet> warriorSignetList = new ArrayList();
      BattleWearModel wearModel = (BattleWearModel)ApplicationContextProvider.getModelPoolEntity("DecisiveBattleRobotWear", battleId);
      if (wearModel == null) {
         return warriorSignetList;
      } else {
         if (pos == 0) {
            for(WarriorsModel model : wearModel.getWarrior1()) {
               warriorSignetList.add(model.toWarriorSignet());
            }
         } else if (pos == 1) {
            for(WarriorsModel model : wearModel.getWarrior2()) {
               warriorSignetList.add(model.toWarriorSignet());
            }
         } else if (pos == 2) {
            for(WarriorsModel model : wearModel.getWarrior3()) {
               warriorSignetList.add(model.toWarriorSignet());
            }
         } else if (pos == 3) {
            for(WarriorsModel model : wearModel.getWarrior4()) {
               warriorSignetList.add(model.toWarriorSignet());
            }
         } else if (pos == 4) {
            for(WarriorsModel model : wearModel.getWarrior5()) {
               warriorSignetList.add(model.toWarriorSignet());
            }
         } else if (pos == 5) {
            for(WarriorsModel model : wearModel.getWarrior6()) {
               warriorSignetList.add(model.toWarriorSignet());
            }
         }

         return warriorSignetList;
      }
   }

   public BattlePKTeam(int playerId, String playerName, ArrayingMirror arrayingMirror, int lv, int head, int headFrame, Map<Byte, List<PropertyModel>> compensateMap) {
      this(playerId, playerName, arrayingMirror.arrayingElementsMap, lv, head, headFrame, arrayingMirror.friendState, arrayingMirror.friendNation, arrayingMirror.friendJob, compensateMap, arrayingMirror.soulHeroId);
   }

   public BattlePKTeam(int playerId, String playerName, Map<Byte, ArrayingEntity> arrayingInfoDataMap, int lv, int head, int headFrame, int friendState, int friendNation, int friendJob, Map<Byte, List<PropertyModel>> compensateMap, int soulHeroId) {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
      this.belongId = playerId;
      this.belongName = playerName;
      this.lv = lv;
      this.head = head;
      this.headFrame = headFrame;
      this.isPlayer = false;
      this.highestPower = 0L;
      this.friendState = friendState;
      this.friendNation = friendNation;
      this.friendJob = friendJob;
      this.soulHeroId = soulHeroId;
      long power = 0L;

      for(Map.Entry<Byte, ArrayingEntity> entry : arrayingInfoDataMap.entrySet()) {
         try {
            switch (((ArrayingEntity)entry.getValue()).entityType()) {
               case CODE_HERO:
                  HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)entry.getValue();
                  if (heroArrayingEntity.mirror.invalidTime > 0 && heroArrayingEntity.mirror.invalidTime < DateUtil.getIntTime(System.currentTimeMillis())) {
                     break;
                  }

                  this.entityMap.put(entry.getKey(), new Entity(BattleMsg.EntityType.EntityType_Hero, heroArrayingEntity.mirror));
                  if (compensateMap != null && compensateMap.containsKey(entry.getKey())) {
                     ((Entity)this.entityMap.get(entry.getKey())).modifyBaseProperty((List)compensateMap.get(entry.getKey()));
                  }

                  power += heroArrayingEntity.mirror.combatPower;
                  break;
               case CODE_FRIEND:
                  FriendArrayingEntity friendArrayingEntity = (FriendArrayingEntity)entry.getValue();
                  if (friendArrayingEntity.mirror.invalidTime > 0 && friendArrayingEntity.mirror.invalidTime < DateUtil.getIntTime(System.currentTimeMillis())) {
                     break;
                  }

                  this.friendEntity = new Entity(BattleMsg.EntityType.EntityType_Friend, friendArrayingEntity.mirror);
                  if (compensateMap != null && compensateMap.containsKey(entry.getKey())) {
                     this.friendEntity.modifyBaseProperty((List)compensateMap.get(entry.getKey()));
                  }

                  power += friendArrayingEntity.mirror.combatPower;
                  break;
               case CODE_ARTIFACT:
                  ArtifactArrayingEntity artifactArrayingEntity = (ArtifactArrayingEntity)entry.getValue();
                  this.weaponEntity = new WeaponEntity(BattleMsg.EntityType.EntityType_Artifact, artifactArrayingEntity.code, artifactArrayingEntity.skillId, artifactArrayingEntity.level, artifactArrayingEntity.skinId);
                  break;
               case CODE_BEAUTY:
                  BeautyArrayingEntity beautyArrayingEntity = (BeautyArrayingEntity)entry.getValue();
                  this.beautyEntity = new BeautyEntity(BattleMsg.EntityType.EntityType_Beauty, beautyArrayingEntity.code, beautyArrayingEntity.skillId);
                  if (beautyArrayingEntity.assistantBeauty != null) {
                     this.cooperateBeauty.addAll(beautyArrayingEntity.assistantBeauty.beautyList);
                     this.cooperateBeautySkill.addAll(beautyArrayingEntity.assistantBeauty.beautySkillList);
                  }
                  break;
               case CODE_DRAGON:
                  DragonArrayingEntity dragonArrayingEntity = (DragonArrayingEntity)entry.getValue();
                  this.dragonEntity = new DragonEntity(BattleMsg.EntityType.EntityType_Dragon, dragonArrayingEntity.code, new ArrayList(dragonArrayingEntity.skillIds.values()), dragonArrayingEntity.dragonStrengthen);
                  power += dragonArrayingEntity.power();
                  break;
               case CODE_PET:
                  this.petMap = new HashMap();
                  this.skillPetMap = new HashMap();
                  PetArrayingEntity petArrayingEntity = (PetArrayingEntity)entry.getValue();

                  for(Map.Entry<Integer, PetMirror> mirrorEntry : petArrayingEntity.skillsMap.entrySet()) {
                     int skillIndex = (Integer)mirrorEntry.getKey();
                     PetMirror petMirror = (PetMirror)mirrorEntry.getValue();
                     PetEntity petEntity = new PetEntity(BattleMsg.EntityType.EntityType_Pet, petMirror);
                     this.petMap.put(petMirror.index, petEntity);
                     this.skillPetMap.put(skillIndex, petEntity);
                  }
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      this.combatPower = power;
      this.initOtherAddProperty();
   }

   public BattlePKTeam(int battleId, Map<Integer, Long> hpMap) {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", battleId);
      if (battleModel == null) {
         throw new RuntimeException("生成pkteam时未找到战斗id:" + battleId);
      } else {
         for(BattleMonsterFun fun : battleModel.getMonsters()) {
            if (hpMap.get(Integer.valueOf(fun.getPos())) != null && (Long)hpMap.get(Integer.valueOf(fun.getPos())) != 0L) {
               Entity entity = new Entity(BattleMsg.EntityType.EntityType_Monster, fun, getWarriorSignetByLv(fun.getId(), fun.getLv(), battleModel.getShield()));
               this.entityMap.put(fun.getPos(), entity);
            } else {
               this.logger.info("怪物死了，战役ID={}，怪物站位={}，怪物ID={}", new Object[]{this.buffId, fun.getPos(), fun.getId()});
            }
         }

         this.belongId = battleModel.getId();
         this.belongName = battleModel.getName();
         this.initOtherAddProperty();

         for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
            long oldHp = (Long)hpMap.get(Integer.valueOf((Byte)entry.getKey()));
            ((Entity)entry.getValue()).setBaseProperty(99, oldHp);
         }

      }
   }

   public BattlePKTeam(PlotBattleModel plotBattleModel) {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
      if (plotBattleModel == null) {
         this.logger.error("配置文件为空");
      } else {
         this.reserveEntity = new TreeMap();
         this.belongId = plotBattleModel.getId();
         this.belongName = plotBattleModel.getName();

         for(int i : plotBattleModel.getMonsters().keySet()) {
            PlotBattleMonsterFun monsterFun = (PlotBattleMonsterFun)plotBattleModel.getMonsters().get(i);
            Entity entity;
            if (monsterFun.getEvent() == 0) {
               entity = new Entity(BattleMsg.EntityType.EntityType_Monster, monsterFun, (List)null);
               this.entityMap.put(monsterFun.getPos(), entity);
            } else {
               entity = new Entity(BattleMsg.EntityType.EntityType_Monster, monsterFun, (List)null);
               entity.setPkTeam(this);
               entity.setTeamPos(monsterFun.getPos());
               long key = MiscUtil.comboInteger(i, monsterFun.getParam());
               this.reserveEntity.put(key, entity);
            }

            entity.setPlotIndex((byte)i);
         }

      }
   }

   public BattlePKTeam(BattleModel battleModel) {
      this.logger = LoggerFactory.getLogger(BattlePKTeam.class);
      this.belongId = 0;
      this.belongName = "";
      this.force = -1;
      this.scene = null;
      this.entityMap = new HashMap();
      this.passiveSkill = new HashMap();
      this.friendOnFormation = false;
      this.onlyPassive = new HashSet();
      this.isPlayer = false;
      this.cooperateBeauty = new ArrayList();
      this.cooperateBeautySkill = new ArrayList();
      if (battleModel != null) {
         for(BattleMonsterFun battleMonsterFun : battleModel.getMonsters()) {
            Entity entity = new Entity(BattleMsg.EntityType.EntityType_Monster, battleMonsterFun, getWarriorSignetByLv(battleMonsterFun.getId(), battleMonsterFun.getLv(), battleModel.getShield()));
            if (battleMonsterFun.getPos() == BattleMisc.FORCE_FRIEND_TEAM_POS) {
               this.friendEntity = entity;
               this.friendEntity.setType(BattleMsg.EntityType.EntityType_Friend);
            } else {
               this.entityMap.put(battleMonsterFun.getPos(), entity);
            }
         }

         if (battleModel.getWeaponId() > 0) {
            this.weaponEntity = new WeaponEntity(BattleMsg.EntityType.EntityType_Artifact, battleModel.getWeaponId(), battleModel.getWeaponSkill(), battleModel.getWeaponSkillLv(), 0);
         }

         if (battleModel.getBeautyId() > 0) {
            this.beautyEntity = new BeautyEntity(BattleMsg.EntityType.EntityType_Beauty, battleModel.getBeautyId(), battleModel.getBeautySkills());
         }

         if (battleModel.getDragonId() > 0) {
            this.dragonEntity = new DragonEntity(BattleMsg.EntityType.EntityType_Dragon, battleModel.getDragonId(), battleModel.getDragonSkills(), new HashMap());
         }

         this.belongId = battleModel.getId();
         this.belongName = battleModel.getName();
         this.initOtherAddProperty();
      }
   }

   public Entity getEntity(byte pos) {
      return (Entity)this.entityMap.get(pos);
   }

   public HashMap<Byte, Entity> getEntityMap() {
      return this.entityMap;
   }

   public HashMap<Byte, Entity> getAllEntity() {
      HashMap<Byte, Entity> map = new HashMap(this.entityMap);
      if (this.friendEntity != null) {
         map.put((byte)5, this.friendEntity);
      }

      return map;
   }

   public byte getForce() {
      return this.force;
   }

   public TargetSelector getTargetSelector() {
      return this.targetSelector;
   }

   public int getTotalSpeed() {
      int totalSpeed = 0;

      for(Entity entity : this.entityMap.values()) {
         if (!entity.isDead()) {
            totalSpeed = (int)((long)totalSpeed + entity.getBaseProperty(4));
         }
      }

      return totalSpeed;
   }

   public int getBelongId() {
      return this.belongId;
   }

   public String getBelongName() {
      return this.belongName;
   }

   public int getFriendState() {
      return this.friendState;
   }

   public int getFriendNation() {
      return this.friendNation;
   }

   public boolean isDead() {
      for(Entity entity : this.entityMap.values()) {
         if (entity.isAlive()) {
            return false;
         }
      }

      if (this.friendEntity != null && this.friendEntity.isAlive() && this.getFriendState() == 0) {
         return false;
      } else {
         return true;
      }
   }

   public void destroy() {
      Set<Listener> removeListeners = new HashSet();

      for(ConcurrentHashMap<Short, ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>>> subMap : this.scene.getEventListener().listenerMap.values()) {
         for(ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>> priorityMap : subMap.values()) {
            for(ConcurrentHashMap<Listener, HashSet<ListenerContext>> listenerMap : priorityMap.values()) {
               for(HashSet<ListenerContext> listenerContextSet : listenerMap.values()) {
                  for(ListenerContext listenerContext : listenerContextSet) {
                     for(Entity entity : this.getEntityMap().values()) {
                        if (entity == listenerContext.entity) {
                           removeListeners.add(listenerContext.listener);
                        }
                     }

                     if (listenerContext.entity == this.friendEntity || listenerContext.entity == this.dragonEntity || listenerContext.entity == this.beautyEntity || listenerContext.entity == this.weaponEntity) {
                        removeListeners.add(listenerContext.listener);
                     }
                  }
               }
            }
         }
      }

      for(Listener listener : removeListeners) {
         this.scene.getEventListener().removeListener(listener);
      }

      this.scene = null;
      if (this.weaponEntity != null) {
         this.weaponEntity.destroy();
      }

      this.weaponEntity = null;
      if (this.dragonEntity != null) {
         this.dragonEntity.destroy();
      }

      this.dragonEntity = null;
      this.targetSelector.destroy();
      this.targetSelector = null;
      this.entityMap.clear();
      this.entityMap = null;
   }

   public WeaponEntity getWeaponEntity() {
      return this.weaponEntity;
   }

   public void setBelongId(int belongId) {
      this.belongId = belongId;
   }

   public void setBelongName(String belongName) {
      this.belongName = belongName;
   }

   public long getCombatPower() {
      return this.combatPower;
   }

   public void setCombatPower(long combatPower) {
      this.combatPower = combatPower;
   }

   public int getPvpRank() {
      return this.pvpRank;
   }

   public void setPvpRank(int pvpRank) {
      this.pvpRank = pvpRank;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.lv = lv;
   }

   public int getHead() {
      return this.head;
   }

   public int getHeadFrame() {
      return this.headFrame;
   }

   public void setWeaponEntity(WeaponEntity weaponEntity) {
      this.weaponEntity = weaponEntity;
   }

   public void addProPerty(List<PropertyModel> propertyModelList) {
      for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
         for(PropertyModel propertyModel : propertyModelList) {
            if (propertyModel.getWay() == 0) {
               ((Entity)entry.getValue()).modifyBaseProperty(propertyModel.getType(), propertyModel.getValue());
            } else {
               long oldValue = ((Entity)entry.getValue()).getBaseProperty(propertyModel.getType());
               long addValue = Double.valueOf((double)(oldValue * propertyModel.getValue()) / (double)10000.0F).longValue();
               ((Entity)entry.getValue()).modifyBaseProperty(propertyModel.getType(), addValue);
            }
         }
      }

   }

   public void initOtherAddProperty() {
      this.initArtifactAddProperty();
      this.initArrayingAddProperty();
      this.initFetterAddProperty();
      this.initTalentAddProperty();
   }

   public void initCountryWarAdd(int countrryWarMapId) {
      if (countrryWarMapId > 0) {
         for(Map.Entry<Byte, Entity> heroEntry : this.entityMap.entrySet()) {
            if (((Entity)heroEntry.getValue()).getHeroMirror().warFlag != null) {
               WarFlagModel warFlagModel = (WarFlagModel)ApplicationContextProvider.getModelPoolEntity("countryWarFlag", ((Entity)heroEntry.getValue()).getHeroMirror().warFlag.id);
               if (warFlagModel != null && (warFlagModel.getType() == countrryWarMapId || warFlagModel.getQuality() > 6)) {
                  List<PropertyModel> list = HeroDao.getWarFlagProperty(((Entity)heroEntry.getValue()).getHeroMirror().warFlag);
                  ((Entity)heroEntry.getValue()).modifyBaseProperty(list);
               }
            }
         }

         if (this.friendEntity != null && this.friendEntity.getHeroMirror().warFlag != null) {
            WarFlagModel warFlagModel = (WarFlagModel)ApplicationContextProvider.getModelPoolEntity("countryWarFlag", this.friendEntity.getHeroMirror().warFlag.id);
            if (warFlagModel != null && (warFlagModel.getType() == countrryWarMapId || warFlagModel.getQuality() > 6)) {
               List<PropertyModel> list = HeroDao.getWarFlagProperty(this.friendEntity.getHeroMirror().warFlag);
               this.friendEntity.modifyBaseProperty(list);
            }
         }
      }

   }

   private void initTalentAddProperty() {
      Map<Integer, Long> heroNationMap = this.getArrayingHeroNation();
      if (this.entityMap != null && !this.entityMap.isEmpty()) {
         for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", ((Entity)entry.getValue()).getId());
            if (heroModel != null) {
               int nation = heroModel.getNation();
               if (heroModel.getNation() == 10) {
                  nation = ((Entity)entry.getValue()).inheritNation;
               }

               this.addTalentProperty((Entity)entry.getValue(), heroNationMap, nation);
            }
         }
      }

      if (this.friendEntity != null) {
         int fnation = this.getFriendNationForArraying();
         if (fnation > 0) {
            long oldVal = (Long)MapUtil.getOrDefault(heroNationMap, fnation, 0L);
            heroNationMap.put(fnation, oldVal + 1L);
         }

         this.addTalentProperty(this.friendEntity, heroNationMap, fnation);
      }

   }

   private void addTalentProperty(Entity entity, Map<Integer, Long> nationMap, int nation) {
      if (entity.getHeroMirror() != null && entity.getHeroMirror().talentSkills != null && !entity.getHeroMirror().talentSkills.isEmpty()) {
         for(Integer skillId : entity.getHeroMirror().talentSkills) {
            SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
            if (skillModel != null) {
               for(Map.Entry<Integer, Integer> effectEntry : skillModel.getEffects().entrySet()) {
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)effectEntry.getValue());
                  if (skillEffectModel != null) {
                     Long num = 0L;
                     switch (skillEffectModel.getNation()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                           if (nationMap.containsKey(skillEffectModel.getNation())) {
                              num = (Long)nationMap.get(skillEffectModel.getNation());
                           }
                           break;
                        case 6:
                           if (nationMap.containsKey(nation)) {
                              num = (Long)nationMap.get(nation);
                           }
                     }

                     if (num > 0L) {
                        PropertyModel propertyModel = new PropertyModel(skillEffectModel.getProperty(), skillEffectModel.getCalc(), (long)skillEffectModel.getPropertyValue() * num);
                        entity.modifyBaseProperty(propertyModel);
                        entity.modifyHeroMirrorProperty(propertyModel);
                     }
                  }
               }
            }
         }

      }
   }

   public void initFriendAddProperty() {
      if (this.friendEntity != null) {
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         HeroModel heroModel = (HeroModel)gameModelPool.getEntity("hero", this.friendEntity.getId());
         int key = heroModel.getType() * 100 + this.friendEntity.getStar();
         SupportHeroModel supportHeroModel = (SupportHeroModel)gameModelPool.getEntity("supportHero", key);
         if (supportHeroModel != null) {
            PropertyModel propertyModel = new PropertyModel(supportHeroModel.getAddpro(), supportHeroModel.getAddway(), (long)supportHeroModel.getAddper());

            for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
               ((Entity)entry.getValue()).modifyBaseProperty(propertyModel);
            }
         }
      }

   }

   public void initFetterAddProperty() {
      List<Integer> heroIdList = new ArrayList();
      List<Entity> openForthSkillEntiry = new ArrayList();
      if (this.entityMap != null && !this.entityMap.isEmpty()) {
         for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
            heroIdList.add(((Entity)entry.getValue()).getId());
            if (((Entity)entry.getValue()).getHeroSkills().size() >= 5) {
               openForthSkillEntiry.add(entry.getValue());
            }
         }
      }

      if (this.friendEntity != null) {
         heroIdList.add(this.friendEntity.getId());
         if (this.friendEntity.getHeroSkills().size() >= 5) {
            this.addFetter(this.friendEntity, heroIdList);
         }
      }

      if (!openForthSkillEntiry.isEmpty()) {
         for(Entity entity : openForthSkillEntiry) {
            this.addFetter(entity, heroIdList);
         }
      }

   }

   public void addFetter(Entity heroEntity, List<Integer> heroIdList) {
      int skillId = (Integer)heroEntity.getHeroSkills().get(4);
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      SkillModel skillModel = (SkillModel)gameModelPool.getEntity("skill", skillId);
      if (skillModel != null) {
         for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)gameModelPool.getEntity("skillEffect", entry.getValue());
            if (skillEffectModel != null) {
               int effectNum = 0;
               switch (skillEffectModel.getFetterType()) {
                  case 1:
                     for(Integer fetterId : skillEffectModel.getFetterId()) {
                        if (heroIdList.contains(fetterId)) {
                           effectNum = 1;
                           break;
                        }
                     }
                     break;
                  case 2:
                     Set<Integer> fetterIdSet = new HashSet();

                     for(Integer fetterId : skillEffectModel.getFetterId()) {
                        if (heroIdList.contains(fetterId) && !fetterIdSet.contains(fetterId)) {
                           ++effectNum;
                           fetterIdSet.add(fetterId);
                        }
                     }
                     break;
                  case 3:
                     for(Integer fetterId : skillEffectModel.getFetterId()) {
                        if (heroIdList.contains(fetterId)) {
                           ++effectNum;
                        }
                     }
               }

               if (effectNum > 0) {
                  PropertyModel propertyModel = new PropertyModel(skillEffectModel.getProperty(), skillEffectModel.getCalc(), (long)(skillEffectModel.getPropertyValue() * effectNum));
                  heroEntity.modifyBaseProperty(propertyModel);
               }
            }
         }

      }
   }

   public void initArtifactAddProperty() {
      if (this.weaponEntity != null) {
         int id = this.weaponEntity.getId();
         int skillLv = this.weaponEntity.getLevel();
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
         ArtifactModel artifactModel = (ArtifactModel)gameModelPool.getEntity("artifact", id);

         for(Map.Entry<Integer, ArtifactSkillPropertyFun> entry : artifactModel.getPassiveBuffs().entrySet()) {
            if (skillLv >= ((ArtifactSkillPropertyFun)entry.getValue()).getVal()) {
               PropertyModel addProperty = new PropertyModel(((ArtifactSkillPropertyFun)entry.getValue()).getProperty(), ((ArtifactSkillPropertyFun)entry.getValue()).getWay(), ((ArtifactSkillPropertyFun)entry.getValue()).getPropertyValue());

               for(Map.Entry<Byte, Entity> entityEntry : this.entityMap.entrySet()) {
                  ((Entity)entityEntry.getValue()).modifyBaseProperty(addProperty);
                  long hpMax = (Long)((Entity)entityEntry.getValue()).getBaseProperties().getOrDefault(1, 0L);
                  ((Entity)entityEntry.getValue()).getBaseProperties().put(99, hpMax);
               }

               if (this.friendEntity != null) {
                  this.friendEntity.modifyBaseProperty(addProperty);
                  long hpMax = (Long)this.friendEntity.getBaseProperties().getOrDefault(1, 0L);
                  this.friendEntity.getBaseProperties().put(99, hpMax);
               }
            }
         }
      }

   }

   public void initArrayingAddProperty() {
      Map<Integer, Long> heroNationMap = this.getArrayingHeroNation();
      if (this.friendEntity != null) {
         int fnation = this.getFriendNationForArraying();
         if (fnation > 0) {
            long oldVal = (Long)MapUtil.getOrDefault(heroNationMap, fnation, 0L);
            heroNationMap.put(fnation, oldVal + 1L);
         }
      }

      Map<Integer, Map<Integer, Long>> addProperty = this.getArrayingAdd(heroNationMap);
      Map<Integer, Long> valAddMap = (Map)addProperty.get(0);
      Map<Integer, Long> perAddMap = (Map)addProperty.get(1);

      for(Map.Entry<Byte, Entity> heroEntry : this.entityMap.entrySet()) {
         if (heroEntry != null && (Byte)heroEntry.getKey() < 5) {
            for(Map.Entry<Integer, Long> addPropertyEntry : perAddMap.entrySet()) {
               double val = (double)(((Entity)heroEntry.getValue()).getBaseProperty((Integer)addPropertyEntry.getKey()) * (Long)addPropertyEntry.getValue()) / (double)10000.0F;
               ((Entity)heroEntry.getValue()).modifyBaseProperty((Integer)addPropertyEntry.getKey(), Double.valueOf(val).longValue());
            }

            for(Map.Entry<Integer, Long> entry : valAddMap.entrySet()) {
               if (BattleMisc.isMultiplyProperty((Integer)entry.getKey())) {
                  long oldValue = ((Entity)heroEntry.getValue()).getBaseProperty((Integer)entry.getKey());
                  if (oldValue == 0L) {
                     oldValue = 10000L;
                  }

                  oldValue = (long)((float)(oldValue * (Long)entry.getValue()) / 10000.0F);
                  ((Entity)heroEntry.getValue()).setBaseProperty((Integer)entry.getKey(), oldValue);
               } else {
                  ((Entity)heroEntry.getValue()).modifyBaseProperty((Integer)entry.getKey(), (Long)entry.getValue());
               }
            }

            if (((Entity)heroEntry.getValue()).getBaseProperties().containsKey(1)) {
               long hpMax = (Long)((Entity)heroEntry.getValue()).getBaseProperties().get(1);
               ((Entity)heroEntry.getValue()).getBaseProperties().put(99, hpMax);
            }
         }
      }

      if (this.friendEntity != null) {
         for(Map.Entry<Integer, Long> addPropertyEntry : perAddMap.entrySet()) {
            double val = (double)(this.friendEntity.getBaseProperty((Integer)addPropertyEntry.getKey()) * (Long)addPropertyEntry.getValue()) / (double)10000.0F;
            this.friendEntity.modifyBaseProperty((Integer)addPropertyEntry.getKey(), Double.valueOf(val).longValue());
         }

         for(Map.Entry<Integer, Long> entry : valAddMap.entrySet()) {
            if (BattleMisc.isMultiplyProperty((Integer)entry.getKey())) {
               long oldValue = this.friendEntity.getBaseProperty((Integer)entry.getKey());
               if (oldValue == 0L) {
                  oldValue = 10000L;
               }

               oldValue = (long)((float)(oldValue * (Long)entry.getValue()) / 10000.0F);
               this.friendEntity.setBaseProperty((Integer)entry.getKey(), oldValue);
            } else {
               this.friendEntity.modifyBaseProperty((Integer)entry.getKey(), (Long)entry.getValue());
            }
         }

         if (this.friendEntity.getBaseProperties().containsKey(1)) {
            long hpMax = (Long)this.friendEntity.getBaseProperties().get(1);
            this.friendEntity.getBaseProperties().put(99, hpMax);
         }
      }

   }

   public Map<Integer, Map<Integer, Long>> getArrayingAdd(Map<Integer, Long> nationMap) {
      Map<Integer, Map<Integer, Long>> arrayingAddMap = new HashMap();
      Map<Integer, Long> valAddMap = new HashMap();
      Map<Integer, Long> perAddMap = new HashMap();
      if (nationMap.size() == 5) {
         String addKey = "12345";
         HeroNationAdditionModel heroNationAdditionModel = (HeroNationAdditionModel)ApplicationContextProvider.getModelPoolEntity("heroNationAddition", addKey);
         if (heroNationAdditionModel != null) {
            for(PropertyModel propertyModel : heroNationAdditionModel.getAddProperties().values()) {
               if (BattleMisc.isMultiplyProperty(propertyModel.getType())) {
                  double oldValue = (double)(Long)perAddMap.getOrDefault(propertyModel.getType(), 10000L) * ((double)(10000L - propertyModel.getValue()) / (double)10000.0F);
                  valAddMap.put(propertyModel.getType(), Double.valueOf(oldValue).longValue());
               } else {
                  switch (propertyModel.getWay()) {
                     case 0:
                        if (propertyModel.getType() != 11 && propertyModel.getType() != 14 && propertyModel.getType() != 15) {
                           long oldVal = (Long)valAddMap.getOrDefault(propertyModel.getType(), 0L);
                           valAddMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                           break;
                        }

                        long oldVal = (Long)valAddMap.getOrDefault(propertyModel.getType(), 1L);
                        valAddMap.put(propertyModel.getType(), oldVal * (1L - propertyModel.getValue()));
                        break;
                     case 1:
                        if (propertyModel.getType() != 11 && propertyModel.getType() != 14 && propertyModel.getType() != 15) {
                           long oldPer = (Long)perAddMap.getOrDefault(propertyModel.getType(), 0L);
                           perAddMap.put(propertyModel.getType(), oldPer + propertyModel.getValue());
                        } else {
                           long oldPer = (Long)perAddMap.getOrDefault(propertyModel.getType(), 1L);
                           perAddMap.put(propertyModel.getType(), oldPer * (1L - propertyModel.getValue()));
                        }
                  }
               }
            }
         }
      } else {
         for(Map.Entry<Integer, Long> entry : nationMap.entrySet()) {
            String addKey = entry.getKey() + "" + entry.getValue();
            HeroNationAdditionModel heroNationAdditionModel = (HeroNationAdditionModel)ApplicationContextProvider.getModelPoolEntity("heroNationAddition", addKey);
            if (heroNationAdditionModel != null) {
               for(PropertyModel propertyModel : heroNationAdditionModel.getAddProperties().values()) {
                  if (BattleMisc.isMultiplyProperty(propertyModel.getType())) {
                     double oldValue = (double)(Long)perAddMap.getOrDefault(propertyModel.getType(), 10000L) * ((double)(10000L - propertyModel.getValue()) / (double)10000.0F);
                     valAddMap.put(propertyModel.getType(), Double.valueOf(oldValue).longValue());
                  } else {
                     switch (propertyModel.getWay()) {
                        case 0:
                           if (propertyModel.getType() != 11 && propertyModel.getType() != 14 && propertyModel.getType() != 15) {
                              long oldVal = (Long)valAddMap.getOrDefault(propertyModel.getType(), 0L);
                              valAddMap.put(propertyModel.getType(), oldVal + propertyModel.getValue());
                              break;
                           }

                           long oldVal = (Long)valAddMap.getOrDefault(propertyModel.getType(), 1L);
                           valAddMap.put(propertyModel.getType(), oldVal * (1L - propertyModel.getValue()));
                           break;
                        case 1:
                           if (propertyModel.getType() != 11 && propertyModel.getType() != 14 && propertyModel.getType() != 15) {
                              long oldPer = (Long)MapUtil.getOrDefault(perAddMap, propertyModel.getType(), 0L);
                              perAddMap.put(propertyModel.getType(), oldPer + propertyModel.getValue());
                           } else {
                              long oldPer = (Long)MapUtil.getOrDefault(perAddMap, propertyModel.getType(), 0L);
                              perAddMap.put(propertyModel.getType(), oldPer * (1L - propertyModel.getValue()));
                           }
                     }
                  }
               }
            }
         }
      }

      arrayingAddMap.put(0, valAddMap);
      arrayingAddMap.put(1, perAddMap);
      return arrayingAddMap;
   }

   public void playerFightDmgResist(int addValue) {
      if (this.entityMap != null && !this.entityMap.isEmpty()) {
         for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
            ((Entity)entry.getValue()).modifyBaseProperty(11, (long)addValue);
         }
      }

      if (this.friendEntity != null) {
         this.friendEntity.modifyBaseProperty(11, (long)addValue);
      }

   }

   public Map<Integer, Long> getArrayingHeroNation() {
      Map<Integer, Long> nationMap = new HashMap();

      for(Map.Entry<Byte, Entity> entry : this.entityMap.entrySet()) {
         if ((Byte)entry.getKey() <= 4) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", ((Entity)entry.getValue()).getId());
            if (heroModel != null) {
               int nation = heroModel.getNation();
               if (heroModel.getNation() == 10) {
                  nation = ((Entity)entry.getValue()).inheritNation;
               }

               long oldNum = (Long)nationMap.getOrDefault(nation, 0L);
               nationMap.put(nation, oldNum + 1L);
            }
         }
      }

      return nationMap;
   }

   public int getFriendNationForArraying() {
      if (this.friendEntity != null) {
         int supportHeroEffectStar = ApplicationContextProvider.getConfigInt("supportHeroEffectStar", 10);
         if (this.friendEntity.getHeroMirror().star >= supportHeroEffectStar) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.friendEntity.getId());
            if (heroModel != null) {
               if (this.friendNation >= 1 && this.friendNation <= 5) {
                  ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
                  String supportHeroLimit1 = configManager.getStrByDefault("supportHeroLimit1", "10|1,2,3");
                  String[] supportHeroLimitArraying_1 = supportHeroLimit1.split("\\|");
                  int star_1 = Integer.valueOf(supportHeroLimitArraying_1[0]);
                  String friendNationKey = this.friendNation + "";
                  if (supportHeroLimitArraying_1[1].contains(friendNationKey)) {
                     if (this.friendEntity.getHeroMirror().star >= star_1) {
                        return this.friendNation;
                     }
                  } else {
                     String supportHeroLimit2 = configManager.getStrByDefault("supportHeroLimit2", "13|4,5");
                     String[] supportHeroLimitArraying_2 = supportHeroLimit2.split("\\|");
                     int star_2 = Integer.valueOf(supportHeroLimitArraying_2[0]);
                     if (supportHeroLimitArraying_2[1].contains(friendNationKey) && (this.friendEntity.getHeroMirror().star >= star_2 || (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING || heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_PALACE) && this.friendEntity.getHeroMirror().star >= star_1)) {
                        return this.friendNation;
                     }
                  }
               }

               if (heroModel.getNation() == 10) {
                  return this.friendEntity.inheritNation;
               }

               return heroModel.getNation();
            }
         }
      }

      return 0;
   }

   public void setSkillOrder(Entity entity) {
      entity.setSkillOrder(++this.skillOrder);
   }

   public void resetSkillOrder() {
      this.skillOrder = 0;

      for(Entity entity : this.entityMap.values()) {
         entity.setSkillOrder((byte)-1);
      }

   }

   public int getAliveNum() {
      int num = 0;

      for(Entity entity : this.entityMap.values()) {
         if (entity.isAlive()) {
            ++num;
         }
      }

      return num;
   }

   public int getBuffId() {
      return this.buffId;
   }

   public void setBuffId(int buffId) {
      this.buffId = buffId;
   }

   public Entity getFriendEntity() {
      return this.friendEntity;
   }

   public void setFriendEntity(Entity friendEntity) {
      this.friendEntity = friendEntity;
   }

   public Long teamAttackValue() {
      long damage = 0L;
      boolean bFriend = false;

      for(Entity entity : this.entityMap.values()) {
         damage += entity.getAttackValue();
         if (entity == this.friendEntity) {
            bFriend = true;
         }
      }

      if (this.friendEntity != null && !bFriend) {
         damage += this.friendEntity.getAttackValue();
      }

      DragonEntity dragonEntity = this.getDragonEntity();
      if (null != dragonEntity) {
         damage += this.dragonEntity.getAttackValue();
      }

      BeautyEntity beautyEntity = this.getBeautyEntity();
      if (null != beautyEntity) {
         damage += this.beautyEntity.getAttackValue();
      }

      WeaponEntity weaponEntity = this.getWeaponEntity();
      if (null != weaponEntity) {
         damage += this.weaponEntity.getAttackValue();
      }

      return damage;
   }

   public void clearPassiveSkill() {
      this.passiveSkill.clear();
   }

   public boolean checkPassiveSkill(int skillId, Entity entity) {
      return true;
   }

   public int getMaxLevel() {
      if (this.maxLevel == 0) {
         for(Entity entity : this.entityMap.values()) {
            if (entity.getLevel() > this.maxLevel) {
               this.maxLevel = entity.getLevel();
            }
         }
      }

      if (this.friendEntity != null && this.friendEntity.getLevel() > this.maxLevel) {
         this.maxLevel = this.friendEntity.getLevel();
      }

      return this.maxLevel;
   }

   public TreeMap<Long, Entity> getReserveEntity() {
      return this.reserveEntity;
   }

   public boolean reserveEntityFinish() {
      return null == this.reserveEntity ? true : this.reserveEntity.isEmpty();
   }

   public long geAttackValue() {
      long total = 0L;

      for(Entity entity : this.entityMap.values()) {
         total += entity.getAttackValue();
      }

      return total;
   }

   public long getDamageValue() {
      long total = 0L;

      for(Entity entity : this.entityMap.values()) {
         total += entity.getDamageValue();
      }

      return total;
   }

   public int getCountryWarScoreAdd() {
      return this.countryWarScoreAdd;
   }

   public void setCountryWarScoreAdd(int countryWarScoreAdd) {
      this.countryWarScoreAdd = countryWarScoreAdd;
   }

   public BeautyEntity getBeautyEntity() {
      return this.beautyEntity;
   }

   public DragonEntity getDragonEntity() {
      return this.dragonEntity;
   }

   public BattleScene getScene() {
      return this.scene;
   }

   public void setScene(BattleScene scene) {
      this.scene = scene;
   }

   public void setFriendOnFormation() {
      this.friendOnFormation = true;
   }

   public boolean isFriendOnFormation() {
      return this.friendOnFormation;
   }

   public void resetDirty() {
      for(Entity entity : this.entityMap.values()) {
         entity.setAttackDirty(false);
         entity.setRecoverDirty(false);
         entity.setDamageDirty(false);
      }

   }

   public void sendStatistics(Action action) {
      long forceDamage = 0L;

      for(Entity entity : this.entityMap.values()) {
         if (entity.isAttackDirty() && entity.getAttackValue() != 0L || entity.isRecoverDirty() && entity.getRecoverHp() != 0L) {
            BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
            s2C_battle_effect.setEffectType(22);
            s2C_battle_effect.setTargetBattlePos(entity.getBattlePos());
            if (entity.isAttackDirty() && entity.getAttackValue() != 0L) {
               s2C_battle_effect.setEffectValue(entity.getAttackValue());
            }

            if (entity.isRecoverDirty() && entity.getRecoverHp() != 0L) {
               s2C_battle_effect.setFinalValue(entity.getRecoverHp());
            }

            action.getBlackboard().addBattleEffect(s2C_battle_effect);
         }

         forceDamage += entity.getDamageValue();
      }

      BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
      s2C_battle_effect.setEffectType(15);
      s2C_battle_effect.setTargetBattlePos(this.force);
      s2C_battle_effect.setEffectValue(forceDamage);
      action.getBlackboard().addBattleEffect(s2C_battle_effect);
   }

   public boolean isPlayer() {
      return this.isPlayer;
   }

   public long getHighestPower() {
      return this.highestPower;
   }

   public List<Integer> getCooperateBeauty() {
      return this.cooperateBeauty;
   }

   public List<Integer> getCooperateBeautySkill() {
      return this.cooperateBeautySkill;
   }

   public void addHero(byte pos, HeroMirror heroMirror, List<PropertyModel> heroCompensate) {
      if (heroMirror.invalidTime <= 0 || heroMirror.invalidTime >= DateUtil.getIntTime(System.currentTimeMillis())) {
         Entity entity;
         if (pos == 5) {
            if (this.getFriendEntity() != null) {
               this.logger.warn("增加援军英雄到队伍中错误,位置{}上已有英雄", pos);
               return;
            }

            entity = new Entity(BattleMsg.EntityType.EntityType_Friend, heroMirror);
            if (heroCompensate != null && !heroCompensate.isEmpty()) {
               entity.modifyBaseProperty(heroCompensate);
            }

            this.setFriendEntity(entity);
         } else {
            if (this.getEntity(pos) != null) {
               this.logger.warn("增加英雄到队伍位置{}上不生效,已有英雄存在该位置", pos);
               return;
            }

            entity = new Entity(BattleMsg.EntityType.EntityType_Hero, heroMirror);
            if (heroCompensate != null && !heroCompensate.isEmpty()) {
               entity.modifyBaseProperty(heroCompensate);
            }

            this.getEntityMap().put(pos, entity);
         }

         this.setCombatPower(this.getCombatPower() + entity.getCombatPower());
      }
   }

   public HashSet<Integer> getOnlyPassive() {
      return this.onlyPassive;
   }

   public void setOnlyPassive(HashSet<Integer> onlyPassive) {
      this.onlyPassive = onlyPassive;
   }

   public HashMap<Integer, PetEntity> getPetMap() {
      return this.petMap;
   }

   public HashMap<Integer, PetEntity> getSkillPetMap() {
      return this.skillPetMap;
   }

   public int checkArraying() {
      List<Integer> heroIds = new ArrayList();
      List<Entity> entityList = new ArrayList();
      if (this.friendEntity != null) {
         entityList.add(this.friendEntity);
      }

      entityList.addAll(this.entityMap.values());

      for(Entity entity : entityList) {
         if (heroIds.contains(entity.getId())) {
            return 58109;
         }

         heroIds.add(entity.getId());
      }

      return 1;
   }
}
