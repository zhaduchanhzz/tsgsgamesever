package com.gzbz.battle.scene;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.ActionManager;
import com.gzbz.battle.action.BeautyAction;
import com.gzbz.battle.action.DragonAction;
import com.gzbz.battle.action.PetAction;
import com.gzbz.battle.action.WeaponAction;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.BeautyEntity;
import com.gzbz.battle.entity.DragonEntity;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.PetEntity;
import com.gzbz.battle.entity.WeaponEntity;
import com.gzbz.battle.listener.EventListener;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.battle.listener.ReserveEntityListener;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.model.BattleHeroTrainingBuffModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattleScene implements Serializable {
   protected long startTime = System.currentTimeMillis();
   static Logger logger = LoggerFactory.getLogger(BattleScene.class);
   protected int type;
   protected int setId;
   protected int battleId;
   protected BattlePKTeam[] pkTeams = new BattlePKTeam[2];
   protected HashMap<Byte, Entity> posEntity = new HashMap();
   protected ArrayList<Entity> speedList = new ArrayList();
   public byte round;
   protected byte maxRound;
   protected short wave;
   protected short curTotalRound;
   protected short totalWave;
   protected byte nextAction = 0;
   protected ActionManager actionManager = new ActionManager();
   protected byte winForce = 2;
   protected boolean isMaxRoundEnd = false;
   protected EventListener eventListener = new EventListener(this);
   protected int costTime;
   protected transient BattleMsg.S2C_BattleResult_6102.Builder battleMsg;
   protected DragonAction[] pkTeamDragonAction = new DragonAction[2];
   protected WeaponAction[] pkTeamWeaponAction = new WeaponAction[2];
   protected BeautyAction[] pkTeamBeautyAction = new BeautyAction[2];
   protected PetAction[] pkTeamPetAction = new PetAction[2];
   protected int paramId;
   public static AtomicBoolean battleLog = new AtomicBoolean(false);
   static HashSet<Integer> RECORD_KEY = new HashSet();
   HashMap<Integer, Long>[] forceRecordValue = new HashMap[2];
   protected Entity filedSkillEntity;

   public long getForceRecordValue(byte force, int recordType) {
      return this.forceRecordValue[force] == null ? 0L : (Long)this.forceRecordValue[force].getOrDefault(recordType, 0L);
   }

   protected void clearForceRecordValue() {
      for(byte force = 0; force < 2; ++force) {
         this.forceRecordValue[force].clear();
      }

   }

   protected void initForceRecordValue() {
      for(byte force = 0; force < 2; ++force) {
         this.forceRecordValue[force] = new HashMap();
      }

   }

   public void addRecordValue(byte force, int key, long value) {
      if (this.forceRecordValue[force] != null) {
         if (RECORD_KEY.contains(key)) {
            MapUtil.mapPlusLong(this.forceRecordValue[force], key, Math.abs(value));
         }
      }
   }

   protected void assemblyInit() {
      this.battleMsg = BattleMsg.S2C_BattleResult_6102.newBuilder();
      this.round = 0;
      this.nextAction = 0;
      this.battleMsg.setType(this.type);
      this.battleMsg.setSetId(this.setId);
      this.battleMsg.setBattleId(this.battleId);
      this.battleMsg.setRoundMax(this.maxRound);
      this.battleMsg.setWave(this.wave);
      this.battleMsg.setTotalWave(this.totalWave);
      this.battleMsg.setStartTime((int)(this.startTime / 1000L));
      this.battleMsg.setIsSkip(false);
   }

   public void setWave(short wave, short totalWave) {
      this.wave = wave;
      this.totalWave = totalWave;
   }

   public void setWave(short wave) {
      this.wave = wave;
   }

   protected BattleMsg.S2C_Battle_Entity.Builder assemblyEntity(Entity entity) {
      BattleMsg.S2C_Battle_Entity.Builder builder = BattleMsg.S2C_Battle_Entity.newBuilder();
      builder.setBattlePos(entity.getBattlePos());
      builder.setTeamPos(entity.getTeamPos());
      if (entity.getHeroMirror() != null && entity.getHeroMirror().dressHeroId > 0) {
         builder.setHeroId(entity.getHeroMirror().dressHeroId);
      } else {
         builder.setHeroId(entity.getId());
      }

      builder.setCurMax(entity.getBaseProperty(99));
      builder.setHpMax(entity.getBaseProperty(1));
      builder.setHeroLv(entity.getLevel());
      builder.setType(entity.getType());
      builder.setIsDead(entity.isDead());
      builder.setArtifactSkinId(entity.getSkinId());
      if (this.type == 1014) {
         builder.setOriginalPos(entity.getPlotIndex());
      } else {
         builder.setOriginalPos(entity.getOriginalPos());
      }

      if (!entity.getHeroSkills().isEmpty()) {
         for(int skillId : entity.getHeroSkills()) {
            builder.addHeroSkills(skillId);
         }
      }

      if (Debug.isDebug && entity.getHeroMirror() != null) {
         HashMap<Integer, Long> tempPros = new HashMap();

         for(Map.Entry<Integer, Long> entry : entity.getBaseProperties().entrySet()) {
            if ((Integer)entry.getKey() != 11 && (Integer)entry.getKey() != 14 && (Integer)entry.getKey() != 15 && (Integer)entry.getKey() != 23) {
               tempPros.put(entry.getKey(), entry.getValue());
            } else {
               tempPros.put(entry.getKey(), 10000L - (Long)entry.getValue());
            }
         }

         entity.getHeroMirror().totalShowProperties = tempPros;
      }

      if (entity.entityType == 4) {
         PetEntity petEntity = (PetEntity)entity;
         builder.setPetInfo(petEntity.getPetMirror().toBuilder());
      } else if (entity.getHeroMirror() != null) {
         builder.setHeroInfo(entity.getHeroMirror().toBuilder());
      }

      if (entity.isChangeShow() && entity.getHeroMirror() != null) {
         entity.getHeroMirror().totalShowProperties.putAll(entity.getShowBaseProperties());
      }

      for(Buff buff : entity.getBuffManager().getCodeBuffMap().values()) {
         BattleMsg.S2C_Battle_Init_Buff.Builder buffBuilder = BattleMsg.S2C_Battle_Init_Buff.newBuilder();
         buffBuilder.setBuffCode(buff.code);
         buffBuilder.setBuffId(buff.id);
         buffBuilder.setBuffRound(buff.round);
         buffBuilder.setBuffValue((int)buff.getValue(1));
         builder.addInitBuff(buffBuilder.build());
      }

      return builder;
   }

   protected void assemblyPKTeam() {
      for(BattlePKTeam pkTeam : this.pkTeams) {
         BattleMsg.S2C_Battle_PKTeam.Builder teamBuilder = BattleMsg.S2C_Battle_PKTeam.newBuilder();
         teamBuilder.setBeloogId(pkTeam.getBelongId());
         teamBuilder.setBeloogName(pkTeam.getBelongName() == null ? "unknow" : pkTeam.getBelongName());
         teamBuilder.setForce(pkTeam.getForce());
         teamBuilder.setFriendState(pkTeam.getFriendState());
         teamBuilder.setFriendNation(pkTeam.getFriendNation());
         teamBuilder.addAllCooperateBeauty(pkTeam.getCooperateBeauty());
         teamBuilder.addAllCooperateBeautySkill(pkTeam.getCooperateBeautySkill());
         PlayerMsg.PropertyCell.Builder lv_builder = PlayerMsg.PropertyCell.newBuilder();
         lv_builder.setProperty(PlayerDefine.PLAYER_LV);
         lv_builder.setValue(String.valueOf(pkTeam.getLv()));
         teamBuilder.addPlayerInfos(lv_builder);
         PlayerMsg.PropertyCell.Builder head_builder = PlayerMsg.PropertyCell.newBuilder();
         head_builder.setProperty(PlayerDefine.PLAYER_HEAD);
         head_builder.setValue(String.valueOf(pkTeam.getHead()));
         teamBuilder.addPlayerInfos(head_builder);
         PlayerMsg.PropertyCell.Builder headFrame_builder = PlayerMsg.PropertyCell.newBuilder();
         headFrame_builder.setProperty(PlayerDefine.PLAYER_HEADFRAME);
         headFrame_builder.setValue(String.valueOf(pkTeam.getHeadFrame()));
         teamBuilder.addPlayerInfos(headFrame_builder);
         if (pkTeam.getForce() == 1) {
            PlayerMsg.PropertyCell.Builder playerId_builder = PlayerMsg.PropertyCell.newBuilder();
            playerId_builder.setProperty(PlayerDefine.PLAYER_ID);
            playerId_builder.setValue(String.valueOf(pkTeam.getBelongId()));
            teamBuilder.addPlayerInfos(playerId_builder);
            PlayerMsg.PropertyCell.Builder serverId_builder = PlayerMsg.PropertyCell.newBuilder();
            serverId_builder.setProperty(PlayerDefine.SERVER_ID);
            serverId_builder.setValue(String.valueOf(pkTeam.getServerId()));
            teamBuilder.addPlayerInfos(serverId_builder);
         }

         HashMap<Byte, Entity> entityMap = pkTeam.getEntityMap();

         for(Entity entity : entityMap.values()) {
            teamBuilder.addEntites(this.assemblyEntity(entity));
         }

         Entity friendEntity = pkTeam.getFriendEntity();
         if (Objects.nonNull(friendEntity)) {
            teamBuilder.addEntites(this.assemblyEntity(friendEntity));
         }

         WeaponEntity weaponEntity = pkTeam.getWeaponEntity();
         if (Objects.nonNull(weaponEntity)) {
            teamBuilder.addEntites(this.assemblyEntity(weaponEntity));
         }

         BeautyEntity beautyAction = pkTeam.getBeautyEntity();
         if (Objects.nonNull(beautyAction)) {
            teamBuilder.addEntites(this.assemblyEntity(beautyAction));
         }

         if (Objects.nonNull(pkTeam.getReserveEntity())) {
            TreeMap<Long, Entity> reserveEntity = pkTeam.getReserveEntity();

            for(Entity entity : reserveEntity.values()) {
               teamBuilder.addPlotEntites(this.assemblyEntity(entity));
            }
         }

         DragonEntity dragonEntity = pkTeam.getDragonEntity();
         if (Objects.nonNull(dragonEntity)) {
            teamBuilder.addEntites(this.assemblyEntity(dragonEntity));
         }

         HashMap<Integer, PetEntity> petMap = pkTeam.getPetMap();
         if (petMap != null && petMap.size() > 0) {
            for(Map.Entry<Integer, PetEntity> petEntry : petMap.entrySet()) {
               PetEntity petEntity = (PetEntity)petEntry.getValue();
               petEntity.getPetMirror().toBuilder();
               teamBuilder.addPet(this.assemblyEntity((Entity)petEntry.getValue()));
            }
         }

         teamBuilder.setCombatPower(pkTeam.getCombatPower());
         teamBuilder.setPvpRank(pkTeam.getPvpRank());
         this.battleMsg.addTeams(teamBuilder);
      }

   }

   public BattleScene(int type, int setId) {
      this.type = type;
      this.setId = setId;
      this.initForceRecordValue();
   }

   public void sort() {
      this.speedList.sort((a, b) -> {
         long speedB = b.getBaseProperty(4) + (long)b.getBuffManager().getSpend();
         long speedA = a.getBaseProperty(4) + (long)a.getBuffManager().getSpend();
         if (speedB != speedA) {
            return (int)(speedB - speedA);
         } else {
            return b.getForce() != a.getForce() ? a.getForce() - b.getForce() : a.getBattlePos() - b.getBattlePos();
         }
      });
   }

   public BattleScene(BattleMsg.S2C_BattleResult_6102 battleMsg) {
      this.initForceRecordValue();
      this.type = battleMsg.getType();
      this.setId = battleMsg.getSetId();
      this.battleId = battleMsg.getBattleId();
      this.maxRound = (byte)battleMsg.getRoundMax();
      this.wave = (short)battleMsg.getWave();
      this.totalWave = (short)battleMsg.getTotalWave();
      this.startTime = (long)battleMsg.getStartTime() * 1000L;
      this.costTime = battleMsg.getCostTime() * 1000;
      this.battleMsg = battleMsg.toBuilder();
      if (battleMsg.hasResult() && battleMsg.getResult() != null) {
         BattleMsg.S2C_Battle_Result battleResult = battleMsg.getResult();
         this.winForce = (byte)battleResult.getResult();
         this.round = (byte)battleResult.getRound();
         this.isMaxRoundEnd = battleResult.getIsMaxRoundEnd();
      }

   }

   public void addPKTeam(BattlePKTeam leftTeam, BattlePKTeam rightTeam) {
      this.addPKTeam((byte)0, leftTeam);
      this.addPKTeam((byte)1, rightTeam);
   }

   public void addPKTeam(byte force, BattlePKTeam team) {
      if (this.pkTeams[force] != null) {
         this.pkTeams[force].destroy();
         if (this.type == 3004 || this.type == 3026 || this.type == 1980) {
            this.getEventListener().listenerMap.clear();
         }
      }

      this.pkTeams[force] = team;

      for(byte pos = 0; pos < 5; ++pos) {
         byte battlePos = BattleMisc.convertBattlePos(force, pos);
         this.posEntity.remove(battlePos);
      }

      for(Map.Entry<Byte, Entity> entry : team.getEntityMap().entrySet()) {
         byte pos = (Byte)entry.getKey();
         Entity entity = (Entity)entry.getValue();
         byte battlePos = BattleMisc.convertBattlePos(force, pos);
         entity.setBattlePos(battlePos);
         entity.init(this, pos, battlePos, team, force);
         this.posEntity.put(battlePos, entity);
      }

      WeaponEntity weaponEntity = team.getWeaponEntity();
      if (Objects.nonNull(weaponEntity)) {
         byte weaponPos = BattleMisc.getWeaponPos(force);
         team.getWeaponEntity().init(this, (byte)6, weaponPos, team, force);
      }

      Entity friendEntity = team.getFriendEntity();
      if (Objects.nonNull(friendEntity)) {
         byte friendPos = BattleMisc.getFriendPos(force);
         friendEntity.init(this, (byte)5, friendPos, team, force);
      }

      BeautyEntity beautyEntity = team.getBeautyEntity();
      if (Objects.nonNull(beautyEntity)) {
         byte beautyPos = BattleMisc.getBeautyPos(force);
         beautyEntity.init(this, (byte)7, beautyPos, team, force);
      }

      DragonEntity dragonEntity = team.getDragonEntity();
      if (Objects.nonNull(dragonEntity)) {
         byte dragonPos = BattleMisc.getDragonPos(force);
         dragonEntity.init(this, (byte)8, dragonPos, team, force);
      }

      TreeMap<Long, Entity> reserveEntityMap = team.getReserveEntity();
      if (Objects.nonNull(reserveEntityMap) && reserveEntityMap.size() > 0) {
         ReserveEntityListener reserveEntityListener = new ReserveEntityListener();
         reserveEntityListener.setBattlePKTeam(team);
         ListenerContext context = new ListenerContext();
         context.type = 3;
         this.getEventListener().addListener(reserveEntityListener, context, (byte)0);
      }

      HashMap<Integer, PetEntity> petSkillEntityMap = team.getSkillPetMap();
      if (petSkillEntityMap != null) {
         for(Map.Entry<Integer, PetEntity> petEntry : petSkillEntityMap.entrySet()) {
            Integer pos = (Integer)petEntry.getKey();
            PetEntity petEntity = (PetEntity)petEntry.getValue();
            Byte[] petPos = BattleMisc.getPetPos(force);

            for(Map.Entry<Integer, PetEntity> entityMap : team.getPetMap().entrySet()) {
               if (entityMap.getValue() == petEntity) {
                  petEntity.init(this, pos.byteValue(), petPos[(Integer)entityMap.getKey() - 1], team, force);
               }
            }
         }
      }

      team.init(force, this);
   }

   public void clearSkillOrder() {
      List<Entity> speedList = this.getSpeedList();
      speedList.clear();

      for(Entity entity : this.getPosEntity().values()) {
         speedList.add(entity);
      }

      this.sort();
      this.resetSkillOrder();
   }

   public BattleMsg.S2C_BattleResult_6102.Builder fight() {
      this.clearSkillOrder();
      if (this.maxRound <= 0) {
         throw new RuntimeException("需要传入最大战斗回合");
      } else {
         return this.fight(this.maxRound);
      }
   }

   public BattleMsg.S2C_BattleResult_6102.Builder fight(byte maxRound) {
      if (maxRound <= 0) {
         throw new RuntimeException("需要传入最大战斗回合");
      } else {
         this.maxRound = maxRound;
         this.fightBefore();
         this.startTime = System.currentTimeMillis();
         this.costTime = 0;
         this.initForceRecordValue();
         this.ready(this.maxRound);
         this.run();
         if (battleLog.get()) {
            File file = new File("./battlelog.txt");

            try {
               FileWriter fw = new FileWriter(file);
               fw.write(this.battleMsg.toString());
               fw.flush();
               fw.close();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }

         logger.info("战斗消耗时间:{} type:{}", System.currentTimeMillis() - this.startTime, this.type);
         return this.battleMsg;
      }
   }

   public void ready(byte maxRound) {
      this.maxRound = maxRound;
      this.winForce = 2;
      this.isMaxRoundEnd = false;
      this.actionManager.init(this);
      this.assemblyInit();

      for(byte force = 0; force < 2; ++force) {
         this.pkTeamDragonAction[force] = new DragonAction();
         this.pkTeamDragonAction[force].pkTeam = this.pkTeams[force];
         this.pkTeamDragonAction[force].setScene(this);
         this.pkTeamDragonAction[force].setType((byte)20);
         this.pkTeamWeaponAction[force] = new WeaponAction();
         this.pkTeamWeaponAction[force].pkTeam = this.pkTeams[force];
         this.pkTeamWeaponAction[force].setScene(this);
         this.pkTeamWeaponAction[force].setEntity(this.pkTeams[force].getWeaponEntity());
         this.pkTeamWeaponAction[force].setType((byte)21);
         this.pkTeamBeautyAction[force] = new BeautyAction();
         this.pkTeamBeautyAction[force].pkTeam = this.pkTeams[force];
         this.pkTeamBeautyAction[force].setScene(this);
         this.pkTeamBeautyAction[force].setEntity(this.pkTeams[force].getBeautyEntity());
         this.pkTeamBeautyAction[force].setType((byte)22);
         this.pkTeamPetAction[force] = new PetAction();
         this.pkTeamPetAction[force].pkTeam = this.pkTeams[force];
         this.pkTeamPetAction[force].setScene(this);
         this.pkTeamPetAction[force].setType((byte)23);
      }

      this.assemblyPKTeam();
   }

   public void run() {
      for(this.round = 0; this.round < this.maxRound && !this.isOver(); ++this.round) {
         ++this.curTotalRound;
         BattleMsg.S2C_Battle_Round.Builder roundMsg = BattleMsg.S2C_Battle_Round.newBuilder();
         roundMsg.setRound(this.round);

         for(BattleMsg.S2C_Battle_Action.Builder builder : this.actionManager.run()) {
            roundMsg.addActions(builder.build());
         }

         this.battleMsg.addRounds(roundMsg);
         if (this.checkOver()) {
            return;
         }

         this.setNextAction((byte)1);
      }

      if (this.winForce == 2) {
         switch (this.type) {
            case 1040:
            case 1110:
            case 1450:
            case 1500:
            case 1991:
            case 2000:
            case 2020:
            case 2030:
            case 2040:
            case 2041:
            case 2042:
            case 2131:
            case 3180:
            case 3192:
            case 3193:
            case 3194:
            case 3195:
            case 3198:
            case 4208:
            case 5950:
            case 6850:
               long[] totalAttackValue = new long[2];
               byte force = 0;

               for(; force < 2; ++force) {
                  BattlePKTeam pkTeam = this.getPKTeam(force);

                  for(Entity entity : pkTeam.getEntityMap().values()) {
                     totalAttackValue[force] += entity.getAttackValue();
                  }

                  if (pkTeam.getFriendEntity() != null) {
                     totalAttackValue[force] += pkTeam.getFriendEntity().getAttackValue();
                  }
               }

               if (totalAttackValue[0] > totalAttackValue[1]) {
                  this.winForce = 0;
               } else {
                  this.winForce = 1;
               }

               this.isMaxRoundEnd = true;
               break;
            default:
               this.winForce = 1;
         }

         this.over();
      }

   }

   public void addAction(Action action) {
      this.actionManager.addAction(action);
   }

   private void totalValue(Entity entity, ArrayList<BattleMsg.Battle_Result_Value> _damageList, ArrayList<BattleMsg.Battle_Result_Value> _hpList, ArrayList<BattleMsg.Battle_Result_Value> _hurtList) {
      if (entity != null) {
         BattleMsg.Battle_Result_Value.Builder damageResult = BattleMsg.Battle_Result_Value.newBuilder();
         damageResult.setPos(entity.getOriginalPos());
         damageResult.setNum(entity.getAttackValue());
         _damageList.add(damageResult.build());
         BattleMsg.Battle_Result_Value.Builder valueResult = BattleMsg.Battle_Result_Value.newBuilder();
         valueResult.setPos(entity.getOriginalPos());
         valueResult.setNum(entity.getRecoverHp());
         _hpList.add(valueResult.build());
         BattleMsg.Battle_Result_Value.Builder hurtResult = BattleMsg.Battle_Result_Value.newBuilder();
         hurtResult.setPos(entity.getOriginalPos());
         hurtResult.setNum(entity.getDamageValue());
         _hurtList.add(hurtResult.build());
      }
   }

   public void over() {
      BattleMsg.S2C_Battle_Result.Builder result = BattleMsg.S2C_Battle_Result.newBuilder();
      result.setResult(this.winForce);
      ArrayList<BattleMsg.Battle_Result_Value> _damageList = new ArrayList();
      ArrayList<BattleMsg.Battle_Result_Value> _hpList = new ArrayList();
      ArrayList<BattleMsg.Battle_Result_Value> _hurtList = new ArrayList();

      for(BattlePKTeam team : this.pkTeams) {
         for(Entity entity : team.getEntityMap().values()) {
            this.totalValue(entity, _damageList, _hpList, _hurtList);
            if (entity.getFieldSkillShowRound() > 0) {
               this.filedSkillEntity = entity;
            }
         }

         Entity friendEntity = team.getFriendEntity();
         if (Objects.nonNull(friendEntity)) {
            this.totalValue(friendEntity, _damageList, _hpList, _hurtList);
            if (friendEntity.getFieldSkillShowRound() > 0) {
               this.filedSkillEntity = friendEntity;
            }
         }
      }

      result.addAllDamage(_damageList);
      result.addAllRecover(_hpList);
      result.addAllHurt(_hurtList);
      result.setRound(this.round);
      result.setIsMaxRoundEnd(this.isMaxRoundEnd);
      this.battleMsg.setResult(result);
      this.battleMsg.setCostTime(this.getCostTime() / 1000);
      if (this.getType() == 1250) {
         BattlePKTeam battlePKTeam = this.getPKTeam((byte)0);
         if (this.getWave() == this.getTotalWave()) {
            BattleHeroTrainingBuffModel battleHeroTrainingBuffModel = (BattleHeroTrainingBuffModel)ApplicationContextProvider.getModelPoolEntity("battleHeroTrainingBuff", battlePKTeam.getBuffId());
            if (battleHeroTrainingBuffModel != null && battleHeroTrainingBuffModel.getBuffType() == 2) {
               for(Entity entity : battlePKTeam.getEntityMap().values()) {
                  entity.getBuffManager().forceDelete(battlePKTeam.getBuffId());
               }
            }
         }
      }

   }

   public boolean isOver() {
      return this.winForce != 2;
   }

   public HashMap<Byte, Entity> getPosEntity() {
      return this.posEntity;
   }

   public void putPosEntity(byte pos, Entity entity) {
      this.posEntity.put(pos, entity);
   }

   public boolean checkOver() {
      if (this.isOver()) {
         return true;
      } else {
         for(byte force = 1; force >= 0; --force) {
            if (this.pkTeams[force].isDead() && this.pkTeams[force].reserveEntityFinish()) {
               this.winForce = BattleMisc.oppositionForce(force);
               this.over();
               return true;
            }
         }

         return false;
      }
   }

   public BattlePKTeam getPKTeam(byte force) {
      return this.pkTeams[force];
   }

   public List<Entity> selectTarget(Action action, Entity sourceEntity, byte forceType, short type, int num, String param) {
      byte force;
      if (forceType == 1) {
         force = sourceEntity.getForce();
      } else {
         force = BattleMisc.oppositionForce(sourceEntity.getForce());
      }

      BattlePKTeam battlePKTeam = sourceEntity.getScene().getPKTeam(force);
      return battlePKTeam.getTargetSelector().getTargets(action, sourceEntity, type, num, param);
   }

   public BattlePKTeam[] getPkTeams() {
      return this.pkTeams;
   }

   public DragonAction getDragonAction(byte force) {
      return this.pkTeamDragonAction[force];
   }

   public WeaponAction getWeaponAction(byte force) {
      return this.pkTeamWeaponAction[force];
   }

   public BeautyAction getBeautyAction(byte force) {
      return this.pkTeamBeautyAction[force];
   }

   public PetAction getPetAction(byte force) {
      return this.pkTeamPetAction[force];
   }

   public byte getNextAction() {
      byte var10002 = this.nextAction;
      this.nextAction = (byte)(var10002 + 1);
      return var10002;
   }

   public ArrayList<Entity> getSpeedList() {
      return this.speedList;
   }

   public void setNextAction(byte nextAction) {
      this.nextAction = nextAction;
   }

   public void destroy() {
      for(byte force = 0; force < 2; ++force) {
         this.pkTeams[force].destroy();
         this.pkTeamDragonAction[force].destroy();
         this.pkTeamWeaponAction[force].destroy();
         this.pkTeamBeautyAction[force].destroy();
         this.pkTeams[force] = null;
         this.pkTeamDragonAction[force] = null;
         this.pkTeamWeaponAction[force] = null;
         this.pkTeamBeautyAction[force] = null;
      }

      this.posEntity.clear();
      this.posEntity = null;
      this.actionManager.destroy();
      this.actionManager = null;
      this.filedSkillEntity = null;
   }

   public ActionManager getActionManager() {
      return this.actionManager;
   }

   public byte getWinForce() {
      return this.winForce;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.battleId = battleId;
   }

   public void resetSkillOrder() {
      for(BattlePKTeam pkTeam : this.pkTeams) {
         pkTeam.resetSkillOrder();
      }

   }

   public int getCostTime() {
      return this.costTime;
   }

   public void addCostTime(int costTime) {
      this.costTime += costTime;
   }

   public EventListener getEventListener() {
      return this.eventListener;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsg() {
      return this.battleMsg;
   }

   public void setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder battleMsg) {
      this.battleMsg = battleMsg;
   }

   public short getWave() {
      return this.wave;
   }

   public short getTotalWave() {
      return this.totalWave;
   }

   public int getType() {
      return this.type;
   }

   public void setSetId(int setId) {
      this.setId = setId;
   }

   public void setMaxRound(byte maxRound) {
      this.maxRound = maxRound;
   }

   public int getParamId() {
      return this.paramId;
   }

   public void setParamId(int paramId) {
      this.paramId = paramId;
   }

   public Entity getFiledSkillEntity() {
      return this.filedSkillEntity;
   }

   public void setFiledSkillEntity(Entity filedSkillEntity) {
      this.filedSkillEntity = filedSkillEntity;
   }

   public void addHero(byte force, byte pos, HeroMirror heroMirror, List<PropertyModel> heroCompensate) {
      if (pos >= 0 && pos <= 5) {
         if (heroMirror == null) {
            logger.error("新武将加入队伍错误,武将信息为null");
         } else {
            BattlePKTeam pkTeam = this.pkTeams[force];
            if (pkTeam == null) {
               throw new RuntimeException("队伍不存在");
            } else {
               Entity entity;
               if (pos == 5) {
                  if (pkTeam.getFriendEntity() != null) {
                     logger.warn("增加援军英雄到队伍中错误,位置{}上已有英雄", pos);
                     return;
                  }

                  entity = new Entity(BattleMsg.EntityType.EntityType_Friend, heroMirror);
                  byte battlePos = BattleMisc.getFriendPos(force);
                  pkTeam.setFriendEntity(entity);
                  entity.init(this, pos, battlePos, pkTeam, force);
                  if (heroCompensate != null && !heroCompensate.isEmpty()) {
                     entity.modifyBaseProperty(heroCompensate);
                  }
               } else {
                  if (pkTeam.getEntity(pos) != null) {
                     logger.warn("增加英雄到队伍位置{}上不生效,已有英雄存在该位置", pos);
                     return;
                  }

                  entity = new Entity(BattleMsg.EntityType.EntityType_Hero, heroMirror);
                  byte battlePos = BattleMisc.convertBattlePos(force, pos);
                  pkTeam.getEntityMap().put(pos, entity);
                  entity.setBattlePos(battlePos);
                  entity.init(this, pos, battlePos, pkTeam, force);
                  if (heroCompensate != null && !heroCompensate.isEmpty()) {
                     entity.modifyBaseProperty(heroCompensate);
                  }

                  this.posEntity.put(battlePos, entity);
               }

               pkTeam.setCombatPower(pkTeam.getCombatPower() + entity.getCombatPower());
            }
         }
      } else {
         logger.error("新武将加入队伍错误,位置{}", pos);
      }
   }

   public byte getRound() {
      return this.round;
   }

   public short getCurTotalRound() {
      return this.curTotalRound;
   }

   private void fightBefore() {
   }

   static {
      RECORD_KEY.add(3);
      RECORD_KEY.add(17303);
      RECORD_KEY.add(17304);
      RECORD_KEY.add(200001);
      RECORD_KEY.add(200002);
      RECORD_KEY.add(200003);
      RECORD_KEY.add(200004);
      RECORD_KEY.add(200005);
   }
}
