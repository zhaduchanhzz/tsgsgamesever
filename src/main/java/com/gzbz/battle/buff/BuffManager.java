package com.gzbz.battle.buff;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.ActionFactory;
import com.gzbz.battle.action.AntiAtkAction;
import com.gzbz.battle.action.ContinueAtkAction;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.effectFunc.DamageFunc;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.model.BuffModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.MapUtil;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BuffManager implements Serializable {
   private Entity entity;
   static Logger logger = LoggerFactory.getLogger(BuffManager.class);
   private int increaseCode = 0;
   private TreeMap<Integer, Buff> codeBuffMap = new TreeMap();
   private HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> priorityBuffsMap = new HashMap();
   private HashMap<Integer, TreeMap<Integer, TreeSet<Integer>>> battlePropertyBuff = new HashMap();
   private HashSet<Integer> shieldBuff = new HashSet();
   private HashSet<Integer> beCureshieldBuff = new HashSet();
   private HashMap<Short, TreeSet<Integer>> subTypeMap = new HashMap();
   private HashMap<Short, TreeSet<Integer>> offsetBuff = new HashMap();
   private HashMap<Short, Short> buffCount = new HashMap();
   private boolean delBufTrigger = true;

   public void clear() {
      this.subTypeMap.clear();
      this.shieldBuff.clear();
      this.battlePropertyBuff.clear();
      this.priorityBuffsMap.clear();
      this.codeBuffMap.clear();
      this.buffCount.clear();
      this.beCureshieldBuff.clear();
   }

   public int getNewCode() {
      return ++this.increaseCode;
   }

   public boolean isExistId(int buffId) {
      for(HashMap<Integer, TreeMap<Integer, Buff>> map : this.priorityBuffsMap.values()) {
         if (map.containsKey(buffId) && ((TreeMap)map.get(buffId)).size() > 0) {
            return true;
         }
      }

      return false;
   }

   public TreeMap<Integer, Buff> getBuffsById(int buffId) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buffId);
      HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
      return Objects.isNull(idMaps) ? null : (TreeMap)idMaps.get(buffId);
   }

   public boolean isExistSubType(short subType) {
      return this.subTypeMap.containsKey(subType) && ((TreeSet)this.subTypeMap.get(subType)).size() > 0;
   }

   public void init(Entity entity) {
      this.entity = entity;
   }

   private boolean _doDependent(Action action, Entity sourceEntity, BuffModel buffModel, Buff buff) {
      for(int index = 1; index <= 2; ++index) {
         if (buffModel.getFuncs().containsKey(index)) {
            Entity dependentEntity = this.entity;
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(index);
            if (!Objects.isNull(useFun)) {
               long dependentValue = (long)useFun.getUseValue();
               switch (useFun.getDependentTarget()) {
                  case 1:
                     dependentEntity = sourceEntity;
                     break;
                  case 2:
                     dependentEntity = this.entity;
                     break;
                  case 3:
                     dependentEntity = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
                     break;
                  case 4:
                     for(Entity member : this.entity.getPkTeam().getEntityMap().values()) {
                        if (!member.isDead()) {
                           if (dependentEntity == null) {
                              dependentEntity = member;
                           } else {
                              int property = useFun.getDependentId();
                              if (member.getBaseProperty(property) > dependentEntity.getBaseProperty(property)) {
                                 dependentEntity = member;
                              }
                           }
                        }
                     }
                     break;
                  case 5:
                     byte force = BattleMisc.oppositionForce(this.entity.getForce());
                     BattlePKTeam forcePkTeam = this.entity.getScene().getPKTeam(force);

                     for(Entity member : forcePkTeam.getEntityMap().values()) {
                        if (!member.isDead()) {
                           if (dependentEntity == null) {
                              dependentEntity = member;
                           } else {
                              int property = useFun.getDependentId();
                              if (member.getBaseProperty(property) > dependentEntity.getBaseProperty(property)) {
                                 dependentEntity = member;
                              }
                           }
                        }
                     }
                     break;
                  case 6:
                     for(Entity member : this.entity.getPkTeam().getEntityMap().values()) {
                        if (!member.isDead() && member != this.entity) {
                           if (dependentEntity == null) {
                              dependentEntity = member;
                           } else {
                              int property = useFun.getDependentId();
                              if (member.getBaseProperty(property) > dependentEntity.getBaseProperty(property)) {
                                 dependentEntity = member;
                              }
                           }
                        }
                     }
                     break;
                  case 7:
                     Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
                     if (Objects.nonNull(attacker)) {
                        dependentEntity = attacker;
                     }
               }

               Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
               if (Objects.nonNull(dependentEntity)) {
                  switch (useFun.getDependentType()) {
                     case 1:
                        dependentValue = dependentEntity.getBattleProperty(action, useFun.getDependentId());
                        break;
                     case 2:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(500 + dependentEntity.getBattlePos(), 0L);
                        break;
                     case 3:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(400 + dependentEntity.getBattlePos(), 0L);
                        dependentValue = (long)((float)dependentValue * ((float)useFun.getUseValue() / 10000.0F));
                        int limitValue = useFun.getExDependentValue();
                        if (limitValue != 0) {
                           limitValue = (int)((float)(this.entity.getBattleProperty(action, 1) * (long)limitValue) / 10000.0F);
                           dependentValue = dependentValue >= (long)limitValue ? (long)limitValue : dependentValue;
                        }
                        break;
                     case 4:
                        dependentValue = DamageFunc.getMagicAttack(action, sourceEntity.getBattleProperty(action, 2), sourceEntity, this.entity);
                        break;
                     case 5:
                        dependentValue = DamageFunc.getPhyAttack(action, sourceEntity.getBattleProperty(action, 2), sourceEntity, this.entity);
                        break;
                     case 6:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(700 + dependentEntity.getBattlePos(), 0L);
                        break;
                     case 7:
                        dependentEntity = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
                        if (Objects.isNull(dependentEntity) || Objects.isNull(sourceEntity)) {
                           return false;
                        }

                        dependentValue = (long)((float)(dependentEntity.getBaseProperty(useFun.getDependentId()) * (long)useFun.getDependentValue()) / 10000.0F);
                        dependentValue += (long)((float)(sourceEntity.getBaseProperty(useFun.getDependentId()) * (long)useFun.getExDependentValue()) / 10000.0F);
                        break;
                     case 8:
                        dependentValue = this.entity.getBaseProperty(1) * dependentValue / 10000L;
                        if (dependentValue >= sourceEntity.getBaseProperty(2) * (long)useFun.getExDependentValue()) {
                           dependentValue = sourceEntity.getBaseProperty(2) * (long)useFun.getExDependentValue();
                        }
                        break;
                     case 9:
                        dependentValue = (long)this.entity.getPkTeam().getCountryWarScoreAdd() * dependentEntity.getBaseProperty(useFun.getDependentId());
                        break;
                     case 10:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(1200 + dependentEntity.getBattlePos(), 0L);
                        break;
                     case 11:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(1100 + dependentEntity.getBattlePos(), 0L);
                        dependentValue = (long)((float)dependentValue * ((float)useFun.getUseValue() / 10000.0F));
                        int limitValue1 = useFun.getExDependentValue();
                        if (limitValue1 != 0) {
                           limitValue1 = (int)((float)(this.entity.getBattleProperty(action, 1) * (long)limitValue1) / 10000.0F);
                           dependentValue = dependentValue >= (long)limitValue1 ? (long)limitValue1 : dependentValue;
                        }
                        break;
                     case 12:
                        dependentValue = dependentEntity.getBaseProperty(useFun.getDependentId());
                        break;
                     case 13:
                        EntitySkill dependentSkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
                        if (dependentSkill != null) {
                           MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", dependentSkill.getSkillId());
                           int propertyIndex = useFun.getDependentId() - 1;
                           if (propertyIndex < magicSkillModel.getProperties().size()) {
                              PropertyModel propertyModel = (PropertyModel)magicSkillModel.getProperties().get(propertyIndex);
                              dependentValue = propertyModel.getValue();
                           }
                        }
                        break;
                     case 14:
                        dependentValue = dependentEntity.getBattleProperty(action, useFun.getDependentId());
                        break;
                     case 15:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(800 + dependentEntity.getBattlePos(), 0L);
                        break;
                     case 16:
                        dependentValue = dependentEntity.getMaxHpMax();
                        break;
                     case 17:
                        dependentValue = dependentEntity.getBaseProperty(useFun.getDependentId());
                        break;
                     case 18:
                        dependentValue = (Long)action.getBlackboard().getSkillParam(1100 + dependentEntity.getBattlePos(), 0L);
                        List<Entity> targets = (List)action.getBlackboard().getSkillParam(57);
                        if (Objects.nonNull(targets) && !targets.isEmpty()) {
                           dependentValue /= (long)targets.size();
                        }

                        dependentValue = (long)((float)dependentValue * ((float)useFun.getUseValue() / 10000.0F));
                        int limitValue2 = useFun.getExDependentValue();
                        if (limitValue2 != 0) {
                           limitValue2 = (int)((float)(this.entity.getBattleProperty(action, 1) * (long)limitValue2) / 10000.0F);
                           dependentValue = dependentValue >= (long)limitValue2 ? (long)limitValue2 : dependentValue;
                        }
                  }

                  switch (useFun.getDependentCalcType()) {
                     case 0:
                        dependentValue += (long)useFun.getDependentValue();
                        break;
                     case 1:
                        dependentValue = (long)((float)dependentValue * ((float)useFun.getDependentValue() / 10000.0F));
                  }

                  if (useFun.getDependentType() == 1 && useFun.getExDependentValue() != 0) {
                     long limitValue1 = (long)((float)(this.entity.getBattleProperty(action, 2) * (long)useFun.getExDependentValue()) / 10000.0F);
                     dependentValue = dependentValue >= limitValue1 ? limitValue1 : dependentValue;
                  } else if (useFun.getDependentType() == 17 && useFun.getExDependentValue() != 0) {
                     long limitVal = (long)((float)(dependentEntity.getBaseProperty(2) * (long)useFun.getExDependentValue()) / 10000.0F);
                     dependentValue = Math.min(limitVal, dependentValue);
                  }
               }

               int offsetRate = sourceEntity.getConditionPropertyManager().getBuffCondition(buffModel.getSubCls());
               if (sourceEntity == null || sourceEntity.getPkTeam() == null || sourceEntity.getPkTeam().getEntityMap() == null) {
                  return false;
               }

               for(Entity teammate : sourceEntity.getPkTeam().getEntityMap().values()) {
                  if (!teammate.isDead()) {
                     offsetRate += teammate.getConditionPropertyManager().getAllBuffCondition(buffModel.getSubCls());
                  }
               }

               if (buffModel.getSubCls() == 77 && index == 2) {
                  dependentValue = (long)((float)(useFun.getExDependentValue() == 2 ? -dependentValue : dependentValue) * (1.0F + (float)offsetRate / 10000.0F));
               } else {
                  dependentValue = (long)((float)(buffModel.getType() == 2 ? -dependentValue : dependentValue) * (1.0F + (float)offsetRate / 10000.0F));
               }

               buff.setValue(index, dependentValue);
            }
         }
      }

      return true;
   }

   public Buff addBuff(Action action, int id, Entity caster, Event event) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", id);
      if (Objects.isNull(buffModel)) {
         logger.error("增加buff时，无法找到buff:" + id);
         return null;
      } else if (this.entity.isDead() && buffModel.getForever() == 0) {
         return null;
      } else {
         Buff buff = BuffFactory.getBuff(buffModel, this.entity, caster, this);
         if (buff == null) {
            return null;
         } else if (!this._doDependent(action, caster, buffModel, buff)) {
            buff.destroy();
            return null;
         } else if (this.addBuff(action, buff, buffModel, event)) {
            return buff;
         } else {
            buff.destroy();
            return null;
         }
      }
   }

   public void addBuff(Action action, List<Integer> buffs, Entity caster, Event event) {
      for(Integer buffId : buffs) {
         this.addBuff(action, buffId, caster, event);
      }

   }

   private boolean _combine(Action action, BuffModel buffModel, Buff buff) {
      HashMap<Integer, TreeMap<Integer, Buff>> priorityBuff = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
      TreeMap<Integer, Buff> idMap = (TreeMap)priorityBuff.get(buffModel.getId());
      if (buffModel.getCombine() == -2) {
         if (idMap.size() > 0) {
            Buff countBuff = (Buff)((Map.Entry)idMap.entrySet().iterator().next()).getValue();
            ++countBuff.count;
            return true;
         }
      } else if (buffModel.getCombine() == -3 && idMap.size() > 0) {
         Buff maxBuff = (Buff)((Map.Entry)idMap.entrySet().iterator().next()).getValue();
         if (maxBuff.getValue(1) > buff.getValue(1)) {
            return false;
         }

         this.delBufTrigger = false;
         this.deleteBuffByCode(action, maxBuff.code, false);
      } else if (buffModel.getCombine() == -1) {
         for(Buff refreshBuff : idMap.values()) {
            this.delBufTrigger = false;
            this.deleteBuffByCode(action, refreshBuff.code, false);
         }
      } else if (buffModel.getCombine() == -4) {
         ArrayList<Integer> delList = new ArrayList();
         TreeSet<Integer> subMap = (TreeSet)this.subTypeMap.get(buffModel.getSubCls());
         if (subMap == null || subMap.size() == 0) {
            return true;
         }

         for(int code : subMap) {
            if (this.getBuff(code).id <= buffModel.getId()) {
               delList.add(code);
            }
         }

         if (delList.size() == 0) {
            return false;
         }

         for(int code : delList) {
            this.getBuff(code);
            this.deleteBuffByCode(action, code, false);
         }
      } else if (buffModel.getCombine() == 0 && idMap.size() > 0 || buffModel.getCombine() > 0 && idMap.size() >= buffModel.getCombine()) {
         Buff delBuff = null;

         for(Buff buffTmp : idMap.values()) {
            if (Objects.isNull(delBuff)) {
               delBuff = buffTmp;
            } else if (delBuff.round > buffTmp.round) {
               delBuff = buffTmp;
            }
         }

         if (Objects.isNull(delBuff)) {
            return false;
         }

         this.deleteBuffByCode(action, delBuff.code, false);
      } else if (buffModel.getCombine() == -6 && idMap.size() > 0) {
         Buff existBuff = (Buff)((Map.Entry)idMap.entrySet().iterator().next()).getValue();
         existBuff.addValue(1, buff.getValue(1));
         return false;
      }

      return true;
   }

   public boolean addBuff(Action action, Buff buff, BuffModel buffModel, Event event) {
      if (buffModel.getType() != 2 || !this.entity.getStateManager().checkState((short)22) && !this.entity.getStateManager().checkState((short)25) && (!this.entity.getStateManager().checkState((short)26) || buffModel.getNoDispel() != 0)) {
         if (this.isMmuneControl(buffModel)) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(13);
            effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
            action.getBlackboard().addBattleEffect(effectBuilder);
            return false;
         } else if (this.isOffsetDebuf(action, buffModel, event)) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(11);
            effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
            action.getBlackboard().addBattleEffect(effectBuilder);
            return false;
         } else if (buffModel.getType() == 1 && this.entity.getStateManager().checkState((short)24) && buff.caster.getForce() == this.entity.getForce() && buff.caster != this.entity) {
            return false;
         } else {
            BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.nonNull(fun)) {
               if (this.entity.getStateManager().checkState((short)21) && buffModel.getSubCls() == 46) {
                  return false;
               }

               if (this.entity.isDead() && fun.getUseFunc() != 3 && fun.getUseValue() != 9) {
                  return true;
               }

               if (fun.getUseFunc() == 3) {
                  if (fun.getUseValue() == 17 && (buffModel.getIsForce() == 1 || this.entity.getStateManager().checkState((short)20))) {
                     return true;
                  }

                  switch (fun.getUseId()) {
                     case 1:
                     case 2:
                     case 11:
                     case 12:
                     case 16:
                     case 17:
                     case 18:
                        Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
                        if (attacker != null) {
                           action.getBlackboard().plusSkillIntParam(100000 + attacker.getBattlePos() * 1000 + fun.getUseId(), 1);
                        }

                        if (this.entity.getStateManager().checkState((short)19)) {
                           BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                           effectBuilder.setEffectType(13);
                           effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
                           action.getBlackboard().addBattleEffect(effectBuilder);
                           return false;
                        }

                        if (this.checkSubBuff((short)42)) {
                           Set<Integer> typeBuff = this.getSubBuff((short)42);
                           if (typeBuff != null && typeBuff.size() > 0) {
                              int code = (Integer)typeBuff.iterator().next();
                              this.deleteBuffByCode(action, code, false);
                              BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                              effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
                              effectBuilder.setEffectId(buffModel.getId());
                              effectBuilder.setEffectType(11);
                              effectBuilder.setEffectValue(1L);
                              action.getBlackboard().addBattleEffect(effectBuilder);
                              return false;
                           }
                        }
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 13:
                     case 14:
                     case 15:
                  }
               }
            }

            if (buff.code <= 0) {
               buff.code = this.getNewCode();
            }

            if (!this.isAddBuff(action, buffModel)) {
               return false;
            } else if (!this.weakenShield(buffModel, buff)) {
               return false;
            } else {
               HashMap<Integer, TreeMap<Integer, Buff>> priorityBuff = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
               if (Objects.isNull(priorityBuff)) {
                  priorityBuff = new HashMap();
                  this.priorityBuffsMap.put(buffModel.getType(), priorityBuff);
               }

               TreeMap<Integer, Buff> idMap = (TreeMap)priorityBuff.get(buffModel.getId());
               if (Objects.isNull(idMap)) {
                  idMap = new TreeMap();
                  priorityBuff.put(buffModel.getId(), idMap);
               }

               if (!this._combine(action, buffModel, buff)) {
                  return false;
               } else {
                  idMap.put(buff.code, buff);
                  this.codeBuffMap.put(buff.code, buff);
                  TreeSet<Integer> subTypeSet = (TreeSet)this.subTypeMap.get(buffModel.getSubCls());
                  if (subTypeSet == null) {
                     subTypeSet = new TreeSet();
                     this.subTypeMap.put(buffModel.getSubCls(), subTypeSet);
                  }

                  subTypeSet.add(buff.code);
                  if (buffModel.getSubCls() == 64) {
                     BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                     TreeSet<Integer> set = (TreeSet)MapUtil.computeIfAbsent(this.offsetBuff, (short)buffUseFun.getUseId(), TreeSet.class);
                     set.add(buff.code);
                  }

                  TreeSet<Integer> offset = (TreeSet)this.offsetBuff.get(buffModel.getSubCls());
                  if (offset != null && offset.size() > 0) {
                     Buff offsetBuff = null;

                     while(offset.size() > 0) {
                        int code = (Integer)offset.first();
                        offsetBuff = this.getBuff(code);
                        if (offsetBuff != null) {
                           break;
                        }

                        offset.remove(code);
                     }

                     if (offsetBuff != null) {
                        BuffModel offsetModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", offsetBuff.id);
                        BuffUseFun buffUseFun = (BuffUseFun)offsetModel.getFuncs().get(1);
                        buff.round = (short)(buff.round + buffUseFun.getUseValue());
                     }
                  }

                  BattleMsg.S2C_Battle_Effect.Builder builder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  builder.setTargetBattlePos(this.entity.getBattlePos());
                  builder.setEffectType(5);
                  builder.setEffectId(buff.id);
                  builder.setEffectCode(buff.code);
                  builder.setEffectValue(buff.getValue(1));
                  builder.setCrit(buff.round);
                  builder.setFinalValue((long)(buff.round - buffModel.getRound()));
                  action.getBlackboard().addBattleEffect(builder);
                  this.processEnter(buff, action, event);
                  BattleTestMgr.analyseBuffEffect((byte)5, buff.caster != null ? buff.caster.getId() : 0, buff.id, buff.getValue(1));
                  if (buffModel.getSubCls() == 81) {
                     MapUtil.mapPlusShort(this.buffCount, buffModel.getSubCls(), (short)1);
                  }

                  Event changeEvent = new Event((short)7, action, event);
                  changeEvent.addParam(7, buffModel.getSubCls());
                  changeEvent.addParam(3, this.entity);
                  changeEvent.addParam(2, buff.caster);
                  changeEvent.addParam(19, buff.id);
                  this.entity.getScene().getEventListener().pushEvent(changeEvent);
                  return true;
               }
            }
         }
      } else {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectType(13);
         effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
         action.getBlackboard().addBattleEffect(effectBuilder);
         return false;
      }
   }

   private void printCurBuff() {
      for(Buff buff : this.codeBuffMap.values()) {
         logger.info(this.entity.getBattlePos() + " 当前buff：code :" + buff.code + " id:" + buff.id + " round:" + buff.round);
      }

   }

   public void deleteBuffById(Action action, int id) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", id);
      if (Objects.isNull(buffModel)) {
         logger.error("删除buff时，无法找到buff:" + id);
      } else if (buffModel.getNoDispel() <= 0) {
         HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
         if (!Objects.isNull(idMaps)) {
            TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.remove(id);
            if (!Objects.isNull(codeMap)) {
               for(Map.Entry<Integer, Buff> entry : codeMap.entrySet()) {
                  this.deleteBuffByCode(action, (Integer)entry.getKey(), false);
               }

            }
         }
      }
   }

   public void deleteBuffByCode(Action action, int code, boolean leaveFun) {
      this.deleteBuffByCode(action, code, leaveFun, false, 0, false);
   }

   private long _doLeave(Action action, Buff buff, BuffModel buffModel) {
      long useValue = 0L;
      BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(2);
      if (Objects.isNull(fun)) {
         return useValue;
      } else {
         switch (fun.getUseFunc()) {
            case 1:
            case 2:
            case 4:
               useValue = buff.getValue(2);
               if (buffModel.getType() == 2) {
                  if (this.entity.getStateManager().checkState((short)25)) {
                     return 0L;
                  }

                  EffectUtil.doShield(action, buff.caster, this.entity, -buff.getValue(2), (SkillEffectModel)null, false, false, (Event)null, (byte)0);
               } else {
                  this.entity.recoverHp(action, buff.caster, (SkillEffectModel)null, false, useValue, (Event)null, true);
               }
               break;
            case 10:
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", fun.getUseId());
               List<Entity> entityList = this.entity.getScene().selectTarget(action, this.entity, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
               if (entityList != null && entityList.size() != 0) {
                  Entity oldAttacker = (Entity)action.getBlackboard().getSkillParam(1);

                  for(Entity target : entityList) {
                     if (fun.getDependentTarget() == 1) {
                        action.getBlackboard().addSkillParam(1, buff.caster);
                        EffectFuncProcessor.doFunc(action, buff.caster, target, (List)null, skillEffectModel, (Event)null);
                     } else if (fun.getDependentTarget() == 2) {
                        action.getBlackboard().addSkillParam(1, this.entity);
                        EffectFuncProcessor.doFunc(action, this.entity, target, (List)null, skillEffectModel, (Event)null);
                     }
                  }

                  action.getBlackboard().addSkillParam(1, oldAttacker);
                  Event buffEffectEvent = new Event((short)45, action, (Event)null);
                  buffEffectEvent.addParam(7, buffModel.getSubCls());
                  buffEffectEvent.addParam(3, this.entity);
                  buffEffectEvent.addParam(2, buff.caster);
                  buffEffectEvent.addParam(19, buff.id);
                  buffEffectEvent.addParam(33, skillEffectModel.getId());
                  this.entity.getScene().getEventListener().pushEvent(buffEffectEvent);
               }
               break;
            case 11:
               if (buffModel.getConditions().size() != 0) {
                  ConditionModel conditionModel = (ConditionModel)buffModel.getConditions().get(0);
                  if (conditionModel.getConditionValue() - 1 == this.entity.getScene().getRound() || !this.entity.isAlive()) {
                     this.entity.setBaseProperty(99, 0L);
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setEffectType(9);
                     effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
                     action.getBlackboard().addBattleEffect(effectBuilder);
                  }
               }
               break;
            case 21:
               SkillEffectModel yuEffectMode = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", fun.getUseId());
               if (yuEffectMode != null) {
                  List<Entity> yuEntityList = this.entity.getScene().selectTarget(action, this.entity, yuEffectMode.getTargetType(), yuEffectMode.getSelectType(), yuEffectMode.getSelectNum(), yuEffectMode.getSelectParam());
                  if (yuEntityList != null) {
                     action.getBlackboard().addSkillParam(26, buff.getValue(1));

                     for(Entity target : yuEntityList) {
                        EffectFuncProcessor.doFunc(action, this.entity, target, yuEntityList, yuEffectMode, (Event)null);
                     }
                  }
               }
         }

         return useValue;
      }
   }

   public void deleteBuffByCode(Action action, int code, boolean leaveFun, boolean dead, int modelId, boolean last) {
      boolean isTrigger = this.delBufTrigger;
      if (!this.delBufTrigger) {
         this.delBufTrigger = true;
      }

      Buff buff = (Buff)this.codeBuffMap.get(code);
      if (!Objects.isNull(buff)) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
         if (!dead || buffModel.getForever() <= 0) {
            this.codeBuffMap.remove(code);
            HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
            if (Objects.nonNull(idMaps)) {
               TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(buff.id);
               if (Objects.nonNull(codeMap)) {
                  codeMap.remove(code);
               }
            }

            long useValue = 0L;
            if (leaveFun && action != null) {
               useValue = this._doLeave(action, buff, buffModel);
            }

            BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.nonNull(fun)) {
               switch (fun.getUseFunc()) {
                  case 3:
                     if (fun.getUseId() == 21 && this.entity.getStateManager().checkState((short)21) && this.entity.isAlive() && action != null) {
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setEffectType(18);
                        effectBuilder.setEffectValue((long)BuffSevenStar.BUFF_SEVEN_STAR_TYPE_DEL);
                        effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
                        effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
                        effectBuilder.setEffectId(buff.id);
                        action.getBlackboard().addBattleEffect(effectBuilder);
                     }

                     this.entity.getStateManager().removeState(buff.attachedCode);
                     break;
                  case 5:
                  case 22:
                  case 23:
                     this.delBattleProperty(action, fun.getUseId(), buff);
                     if (buffModel.getSubCls() == 77) {
                        BuffUseFun endUsefun = (BuffUseFun)buffModel.getFuncs().get(2);
                        if (Objects.nonNull(endUsefun) && endUsefun.getUseFunc() == 5) {
                           this.delBattleProperty(action, endUsefun.getUseId(), buff);
                        }
                     }
                     break;
                  case 6:
                     this.shieldBuff.remove(buff.code);
                     break;
                  case 9:
                     this.beCureshieldBuff.remove(buff.code);
               }

               if (buffModel.getSubCls() == 109) {
                  BuffUseFun endUsefun = (BuffUseFun)buffModel.getFuncs().get(2);
                  if (Objects.nonNull(endUsefun) && endUsefun.getUseFunc() == 5) {
                     this.delBattleProperty(action, endUsefun.getUseId(), buff);
                  }
               }
            }

            if (this.subTypeMap.containsKey(buffModel.getSubCls())) {
               ((TreeSet)this.subTypeMap.get(buffModel.getSubCls())).remove(code);
            }

            this.shieldBuff.remove(code);
            if (buffModel.getSubCls() == 64) {
               BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
               TreeSet<Integer> codeSet = (TreeSet)this.offsetBuff.get((short)buffUseFun.getUseId());
               if (codeSet != null) {
                  codeSet.remove(buff.code);
               }
            }

            if (Objects.nonNull(action)) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(3);
               effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
               effectBuilder.setEffectId(buff.id);
               effectBuilder.setEffectCode(buff.code);
               effectBuilder.setEffectValue(Math.abs(useValue));
               effectBuilder.setEffectSetId(modelId);
               effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
               if (!last) {
                  action.getBlackboard().addBattleEffect(effectBuilder);
               } else {
                  action.getBlackboard().addLastEffect(effectBuilder);
               }
            }

            if (buffModel.getSubCls() == 49) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
               effectBuilder.setEffectType(27);
               effectBuilder.setEffectValue(-1L);
               action.getBlackboard().addBattleEffect(effectBuilder);
            }

            if (isTrigger && action != null) {
               Event buffDelEvent = new Event((short)33, action, (Event)null);
               buffDelEvent.addParam(7, buffModel.getSubCls());
               buffDelEvent.addParam(3, this.entity);
               buffDelEvent.addParam(2, buff.caster);
               buffDelEvent.addParam(19, buff.id);
               buffDelEvent.addParam(30, leaveFun);
               this.entity.getScene().getEventListener().pushEvent(buffDelEvent);
            }

            buff.destroy();
            this.delLinkBuff(action, buffModel);
         }
      }
   }

   public void update(Action action) {
      HashSet<Buff> delSet = new HashSet();
      HashSet<Buff> shieldBuffSet = new HashSet();
      BuffUseFun immuneBuffUseFun = null;
      if (this.isExistSubType((short)76)) {
         TreeSet<Integer> subMap = (TreeSet)this.subTypeMap.get(Short.valueOf((short)76));
         ArrayList<Integer> list = new ArrayList(subMap);
         Integer code = (Integer)list.get(0);
         Buff buff = this.getBuff(code);
         if (buff != null) {
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
            immuneBuffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         }
      }

      for(int code : new ArrayList(this.codeBuffMap.keySet())) {
         Buff buff = this.getBuff(code);
         if (buff != null) {
            buff.update(action);
            --buff.round;
            if (buff.round <= 0) {
               delSet.add(buff);
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
               BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
               if (fun != null && fun.getUseFunc() == 6) {
                  shieldBuffSet.add(buff);
               }
            }

            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
            BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (!Objects.isNull(fun) && buffModel.getSubCls() != 76 && (Objects.isNull(immuneBuffUseFun) || buffModel.getSubCls() != 3 && buffModel.getSubCls() != 17303 || RandomUtil.randTenThousand() >= immuneBuffUseFun.getUseValue())) {
               switch (fun.getUseFunc()) {
                  case 1:
                  case 2:
                  case 4:
                     this.buffModifyHp(action, buff, buffModel, delSet, (byte)4, (Event)null);
                     break;
                  case 20:
                     this.tuoTuoBuffPro(action, buff, buffModel, delSet, (byte)4);
               }
            }
         }
      }

      TreeSet<Integer> xuanWuBuffSet = this.getSubBuff((short)71);
      if (xuanWuBuffSet != null && xuanWuBuffSet.size() > 0) {
         int xuanWuCode = (Integer)xuanWuBuffSet.first();
         Buff xuanWuBuff = this.getBuff(xuanWuCode);
         BuffModel xuanWuModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", xuanWuBuff.id);
         BuffUseFun buffUseFun = (BuffUseFun)xuanWuModel.getFuncs().get(1);
         long value = (long)((float)(xuanWuBuff.caster.getBaseProperty(1) * (long)buffUseFun.getUseValue()) / 10000.0F);

         for(Buff delShieldBuff : shieldBuffSet) {
            this.entity.recoverHp(action, this.entity, (SkillEffectModel)null, false, value, (Event)null, true);
         }
      }

      for(Buff delBuff : delSet) {
         this.deleteBuffByCode(action, delBuff.code, true);
      }

      if (this.entity.isDead()) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
         effectBuilder.setEffectType(9);
         effectBuilder.setEffectValue(1L);
         effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
         action.getBlackboard().addBattleEffect(effectBuilder);
         EffectUtil.putDeadEvent(action, this.entity, this.entity, (Event)null);
         this.entity.clear(action);
      }

   }

   public long buffModifyHp(Action action, Buff buff, BuffModel buffModel, HashSet<Buff> delSet, byte effectType, Event event) {
      long value;
      if (20 == effectType) {
         value = buff.getValue(1) * (long)buff.round;
      } else {
         value = buff.getValue(1);
      }

      if (value > 0L) {
         BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(endUseFun) && endUseFun.getExDependentValue() == 1) {
            float totalRate = (float)(10000L + this.entity.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + this.entity.getBattleProperty(action, 19)) / 10000.0F;
            value = (long)((float)value * totalRate);
         }

         this.entity.recoverHp(action, buff.caster, (SkillEffectModel)null, false, value, event, false);
         if (effectType != 20) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
            effectBuilder.setEffectType(effectType);
            effectBuilder.setEffectId(buff.id);
            effectBuilder.setEffectCode(buff.code);
            effectBuilder.setEffectValue(Math.abs(value));
            effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
            effectBuilder.setCrit(buff.round);
            action.getBlackboard().addBattleEffect(effectBuilder);
         }
      } else {
         if (this.entity.getStateManager().checkState((short)25)) {
            return 0L;
         }

         long shieldValue = 0L;
         if (buffModel.getSubCls() == 105) {
            BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
            if (Objects.nonNull(endUseFun)) {
               shieldValue = (long)((float)(-this.getShieldValue() * (long)endUseFun.getUseValue()) / 10000.0F);
               if (endUseFun.getExDependentValue() > 0) {
                  value += shieldValue;
               }
            }
         }

         if (buffModel.getSubCls() == 117) {
            BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
            if (Objects.nonNull(endUseFun)) {
               int buffNum = this.getPriorityBuffsNum((byte)2);
               int addRate = Math.min(buffNum * endUseFun.getUseValue(), endUseFun.getExDependentValue());
               value = (long)((float)value + (float)(value * (long)addRate) / 10000.0F);
            }
         }

         byte oppositionForce = BattleMisc.oppositionForce(this.entity.getForce());
         BattlePKTeam oppositionPKTeam = this.entity.getScene().getPKTeam(oppositionForce);
         int offsetRate = 0;

         for(Entity teammate : oppositionPKTeam.getEntityMap().values()) {
            if (!teammate.isDead()) {
               offsetRate += teammate.getConditionPropertyManager().getValue142(action, teammate, this.entity, buffModel.getSubCls());
            }
         }

         value = (long)((float)value + (float)(value * (long)offsetRate) / 10000.0F);
         offsetRate = 0;

         for(Entity teammate : this.entity.getPkTeam().getEntityMap().values()) {
            if (!teammate.isDead()) {
               offsetRate += teammate.getConditionPropertyManager().getValue142(action, teammate, this.entity, buffModel.getSubCls());
            }
         }

         value = (long)((float)value + (float)(value * (long)offsetRate) / 10000.0F);
         long tempValue = EffectUtil.linkBuffPositive(action, event, buff.caster, this.entity, -value);
         tempValue = EffectUtil.liveAndDieBuf(buff.caster, this.entity, tempValue);
         action.getBlackboard().addSkillParam(50, buffModel.getSubCls());
         value = -tempValue;
         long newValue = 0L;
         if (buffModel.getSubCls() != 114) {
            newValue = this.modifyBaseProperty(action, value + shieldValue, delSet);
         } else {
            newValue = value + shieldValue;
         }

         if (newValue == 0L) {
            BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectAbsorbBuilder.setTargetBattlePos(this.entity.getBattlePos());
            effectAbsorbBuilder.setEffectType(2);
            effectAbsorbBuilder.setEffectId(buff.id);
            effectAbsorbBuilder.setEffectValue(Math.abs(value));
            action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
         } else if (newValue != value) {
            this.entity.modifyHp(action, newValue, event, buff.caster);
            if (effectType != 20) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
               effectBuilder.setEffectType(effectType);
               effectBuilder.setEffectId(buff.id);
               effectBuilder.setEffectCode(buff.code);
               effectBuilder.setEffectValue(Math.abs(newValue));
               effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
               effectBuilder.setCrit(buff.round);
               action.getBlackboard().addBattleEffect(effectBuilder);
            }

            BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectAbsorbBuilder.setEffectType(2);
            effectAbsorbBuilder.setEffectValue(Math.abs(value - newValue));
            effectAbsorbBuilder.setTargetBattlePos(this.entity.getBattlePos());
            effectAbsorbBuilder.setEffectId(buffModel.getId());
            action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
         } else {
            this.entity.modifyHp(action, newValue, event, buff.caster);
            if (effectType != 20) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
               effectBuilder.setEffectType(effectType);
               effectBuilder.setEffectId(buff.id);
               effectBuilder.setEffectCode(buff.code);
               effectBuilder.setEffectValue(Math.abs(value));
               effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
               effectBuilder.setCrit(buff.round);
               action.getBlackboard().addBattleEffect(effectBuilder);
            }
         }

         buff.caster.addAttackValue(action, Math.abs(value), event);
         this.entity.addDamageValue(Math.abs(value));
         this.entity.getScene().addRecordValue(this.entity.getForce(), buffModel.getSubCls(), value);
      }

      return value;
   }

   protected void processEnter(Buff buff, Action action, Event event) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
      BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
      if (Objects.nonNull(fun)) {
         switch (fun.getUseFunc()) {
            case 3:
               buff.attachedCode = this.entity.getStateManager().addState(buff.code, (short)fun.getUseId());
               if (buff.caster == buff.caster.getPkTeam().getWeaponEntity() && fun.getUseId() == 1) {
                  buff.caster.getScene().addRecordValue(buff.caster.getForce(), 200002, 1L);
               }
               break;
            case 5:
            case 22:
               this.addBattleProperty(action, fun.getUseId(), buff.id, buff.code);
               if (fun.getUseId() == 1) {
                  BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  if (buffModel.getType() == 2) {
                     int var10000 = -buffUseFun.getUseValue();
                  } else {
                     buffUseFun.getUseValue();
                  }

                  long value = 0L;
                  if (buffUseFun.getDependentTarget() == 0) {
                     if (buffUseFun.getCalcFun() == 1) {
                        value = (long)((float)(this.entity.getBaseProperty(98) * (long)buffUseFun.getUseValue()) / 10000.0F);
                     } else {
                        value = (long)buffUseFun.getUseValue();
                     }

                     buff.setValue(1, (long)((int)value));
                  } else {
                     value = buff.getValue(1);
                  }

                  if (buffModel.getSubCls() == 94) {
                     BuffUseFun endFun = (BuffUseFun)buffModel.getFuncs().get(2);
                     if (Objects.nonNull(endFun)) {
                        long limitValue = -buff.caster.getBattleProperty(action, endFun.getUseId()) * (long)endFun.getUseValue() / 10000L;
                        value = value < limitValue ? limitValue : value;
                     }
                  }

                  if (value > 0L) {
                     this.entity.modifyBaseProperty(1, value);
                     value -= this.correctMaxHpMax(this.entity.getBaseProperty(1));
                  }

                  this.entity.recoverHp(action, (Entity)null, (SkillEffectModel)null, false, value, event, false);
                  if (buffModel.getSubCls() == 94 && value < 0L) {
                     if (buff.caster != null) {
                        buff.caster.addAttackValue(action, -value, event);
                     }

                     this.entity.addDamageValue(-value);
                     this.entity.modifyHp(action, value, event, buff.caster);
                     this.entity.modifyBaseProperty(1, value);
                     if (this.entity.isDead()) {
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
                        effectBuilder.setEffectType(9);
                        effectBuilder.setEffectValue(1L);
                        effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
                        action.getBlackboard().addBattleEffect(effectBuilder);
                        EffectUtil.putDeadEvent(action, buff.caster, this.entity, event);
                        this.entity.clear(action);
                     }
                  }

                  BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
                  s2C_battle_effect.setTargetBattlePos(this.entity.getBattlePos());
                  s2C_battle_effect.setEffectType(24);
                  s2C_battle_effect.setEffectValue(this.entity.getBaseProperty(99));
                  s2C_battle_effect.setFinalValue(this.entity.getBaseProperty(1));
                  action.getBlackboard().addBattleEffect(s2C_battle_effect);
               }
               break;
            case 6:
               this.shieldBuff.add(buff.code);
               break;
            case 9:
               this.beCureshieldBuff.add(buff.code);
               break;
            case 23:
               this.addBattleProperty(action, fun.getUseId(), buff.id, buff.code);
         }
      }

      fun = (BuffUseFun)buffModel.getFuncs().get(2);
      if (Objects.nonNull(fun)) {
         switch (fun.getUseFunc()) {
            case 7:
               TreeSet<Integer> allZhaoYunCode = this.getSubBuff(buffModel.getSubCls());
               if (allZhaoYunCode.size() >= buffModel.getCombine()) {
                  label129: {
                     SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", fun.getExDependentValue());
                     List<Entity> list = new ArrayList();
                     list.add(this.entity);
                     if (skillEffectModel != null) {
                        EffectFuncProcessor.doFunc(action, this.entity, this.entity, list, skillEffectModel, event);
                     }

                     Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
                     if (attacker.getPkTeam().getForce() == this.entity.getForce()) {
                        EntitySkill entitySkill = this.entity.getSkillManager().getIndexSkill(4);
                        ContinueAtkAction continueAtkAction = (ContinueAtkAction)ActionFactory.getAction(this.entity.getScene(), (byte)43);
                        continueAtkAction.setEntity(this.entity);
                        continueAtkAction.setForce((byte)1);
                        continueAtkAction.setSkill(entitySkill, fun.getDependentValue(), fun.getDependentValue(), fun.getDependentValue(), (Integer)null);
                        continueAtkAction.setPriority((byte)2);
                        action.setEntity(this.entity);
                        this.entity.getScene().getActionManager().addAction(continueAtkAction);
                     } else {
                        if (attacker.entityType != 0) {
                           break label129;
                        }

                        AntiAtkAction antiAtkAction = (AntiAtkAction)ActionFactory.getAction(this.entity.getScene(), (byte)42);
                        antiAtkAction.setEntity(this.entity);
                        antiAtkAction.setTargetEntity(attacker, fun.getDependentValue(), fun.getDependentValue(), fun.getDependentValue(), 4);
                        antiAtkAction.setPriority((byte)3);
                        this.entity.getScene().getActionManager().addAction(antiAtkAction);
                     }

                     for(int code : new ArrayList(allZhaoYunCode)) {
                        this.deleteBuffByCode(action, code, false);
                     }
                  }
               }
               break;
            case 8:
               TreeSet<Integer> allZhaoYunCodeAtt = this.getSubBuff(buffModel.getSubCls());
               if (allZhaoYunCodeAtt.size() >= buffModel.getCombine()) {
                  for(int code : new ArrayList(allZhaoYunCodeAtt)) {
                     this.deleteBuffByCode(action, code, false);
                  }
               }
         }
      }

      if (buffModel.getSubCls() == 49) {
         long maxValue = (long)((float)((BuffUseFun)buffModel.getFuncs().get(2)).getDependentValue() / 10000.0F * (float)this.entity.getBaseProperty(98));
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
         effectBuilder.setEffectType(27);
         effectBuilder.setEffectValue(0L);
         effectBuilder.setFinalValue(maxValue);
         action.getBlackboard().addBattleEffect(effectBuilder);
      }

      if (buffModel.getSubCls() == 77) {
         BuffUseFun endUsefun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(endUsefun) && endUsefun.getUseFunc() == 5) {
            this.addBattleProperty(action, endUsefun.getUseId(), buff.id, buff.code);
         }
      }

      if (buffModel.getSubCls() == 109) {
         BuffUseFun endUsefun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(endUsefun) && endUsefun.getUseFunc() == 5) {
            this.addBattleProperty(action, endUsefun.getUseId(), buff.id, buff.code);
         }
      }

   }

   private void addBattleProperty(Action action, int property, int id, int code) {
      TreeMap<Integer, TreeSet<Integer>> propertyTreeMap = (TreeMap)this.battlePropertyBuff.get(property);
      if (propertyTreeMap == null) {
         propertyTreeMap = new TreeMap();
         this.battlePropertyBuff.put(property, propertyTreeMap);
      }

      TreeSet<Integer> idTreeMap = (TreeSet)propertyTreeMap.get(id);
      if (idTreeMap == null) {
         idTreeMap = new TreeSet();
         propertyTreeMap.put(id, idTreeMap);
      }

      idTreeMap.add(code);
   }

   private void delBattleProperty(Action action, int property, Buff buff) {
      TreeMap<Integer, TreeSet<Integer>> propertyTreeMap = (TreeMap)this.battlePropertyBuff.get(property);
      if (propertyTreeMap == null) {
         logger.info("delBattleProperty 未找该属性buff, {}", buff.id);
      } else {
         TreeSet<Integer> idTreeMap = (TreeSet)propertyTreeMap.get(buff.id);
         if (idTreeMap == null) {
            logger.info("delBattleProperty 未找到该id的buff，{}", buff.id);
         } else {
            idTreeMap.remove(buff.code);
            if (property == 1) {
               long max = this.entity.getBattleProperty(action, property);
               this.entity.modifyBaseProperty(1, -buff.getValue(1));
               if (this.entity.getBaseProperty(99) > max) {
                  this.entity.setBaseProperty(99, max);
               }

               if (action != null) {
                  BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
                  s2C_battle_effect.setTargetBattlePos(this.entity.getBattlePos());
                  s2C_battle_effect.setEffectType(24);
                  s2C_battle_effect.setEffectValue(this.entity.getBaseProperty(99));
                  s2C_battle_effect.setFinalValue(this.entity.getBaseProperty(1));
                  action.getBlackboard().addBattleEffect(s2C_battle_effect);
               }
            }

         }
      }
   }

   public long getBattleProperty(Action action, int property, HashMap<Integer, Integer> percentMap) {
      TreeMap<Integer, TreeSet<Integer>> propertyTreeMap = (TreeMap)this.battlePropertyBuff.get(property);
      if (!Objects.isNull(propertyTreeMap) && !propertyTreeMap.isEmpty()) {
         if (property == 1) {
            return 0L;
         } else {
            Buff recordBuff1 = null;
            Buff recordBuff2 = null;
            long value = 0L;
            if (BattleMisc.isMultiplyProperty(property)) {
               value = 10000L;

               for(TreeSet<Integer> buffs : propertyTreeMap.values()) {
                  for(int code : buffs) {
                     Buff buff = (Buff)this.codeBuffMap.get(code);
                     if (buff == null) {
                        logger.error("buff未移除干净");
                     } else {
                        BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                        BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                        switch (buffUseFun.getUseFunc()) {
                           case 22:
                              int buffNum = this.getPriorityBuffsCodeNum((byte)buffUseFun.getDependentId());
                              if (buffNum > buffUseFun.getDependentValue()) {
                                 buffNum = buffUseFun.getDependentValue();
                              }

                              value = (long)((float)value * ((float)(10000 - buffUseFun.getUseValue() * buffNum) / 10000.0F));
                              break;
                           case 23:
                              float lostRate = 1.0F - (float)this.entity.getBattleProperty(action, 99) * 1.0F / (float)this.entity.getBattleProperty(action, 1);
                              lostRate = lostRate * (float)buffUseFun.getUseValue() * 100.0F;
                              value = (long)((float)value * (1.0F - lostRate / 10000.0F));
                              break;
                           default:
                              Entity target = (Entity)action.getBlackboard().getSkillParam(3);
                              if (ConditionProcessor.checkCondition(action, buffModel.getConditionType(), buffModel.getConditions(), this.entity, target, (Event)null)) {
                                 if (buffModel.getSubCls() == 77) {
                                    for(int index = 1; index <= 2; ++index) {
                                       BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(index);
                                       if (Objects.nonNull(useFun) && useFun.getUseId() == property) {
                                          value = (long)((float)value * ((float)(10000 - useFun.getUseValue()) / 10000.0F));
                                          break;
                                       }
                                    }
                                 } else if (buffModel.getSubCls() == 109) {
                                    BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
                                    if (Objects.nonNull(endUseFun) && endUseFun.getUseId() == property) {
                                       value = (long)((float)value * ((float)(10000 - endUseFun.getUseValue()) / 10000.0F));
                                    }
                                 } else {
                                    value = (long)((float)value * ((float)(10000 - buffUseFun.getUseValue()) / 10000.0F));
                                 }
                              }
                        }
                     }
                  }
               }
            } else {
               for(TreeSet<Integer> buffs : propertyTreeMap.values()) {
                  for(int code : buffs) {
                     Buff buff = (Buff)this.codeBuffMap.get(code);
                     if (buff == null) {
                        logger.error("buff未移除干净");
                     } else {
                        BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                        if (ConditionProcessor.checkCondition(action, buffModel.getConditionType(), buffModel.getConditions(), this.entity, (Entity)null, (Event)null)) {
                           BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                           int buffValue = buffModel.getType() == 2 ? -buffUseFun.getUseValue() : buffUseFun.getUseValue();
                           if (buffUseFun.getUseFunc() == 22) {
                              int buffNum = this.getPriorityBuffsCodeNum((byte)buffUseFun.getDependentId());
                              if (buffNum > buffUseFun.getDependentValue()) {
                                 buffNum = buffUseFun.getDependentValue();
                              }

                              buffValue *= buffNum;
                              value += (long)buffValue;
                              break;
                           }

                           if (buffUseFun.getUseFunc() == 23) {
                              float lostRate = 1.0F - (float)this.entity.getBattleProperty(action, 99) * 1.0F / (float)this.entity.getBattleProperty(action, 1);
                              int num = 0;
                              if (lostRate == 0.0F) {
                                 num = 1;
                              } else {
                                 num = (int)Math.ceil((double)(lostRate * 10.0F));
                              }

                              BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
                              if (Objects.nonNull(useFun) && num > useFun.getExDependentValue()) {
                                 num = useFun.getExDependentValue();
                              }

                              value += (long)num * buff.getValue(1);
                              break;
                           }

                           if (buffModel.getSubCls() == 77) {
                              for(int index = 1; index <= 2; ++index) {
                                 BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(index);
                                 if (Objects.nonNull(useFun) && useFun.getUseId() == property) {
                                    if (useFun.getCalcFun() == 1) {
                                       int useValue;
                                       if (index == 2) {
                                          useValue = useFun.getExDependentValue() == 2 ? -useFun.getUseValue() : useFun.getUseValue();
                                       } else {
                                          useValue = buffModel.getType() == 2 ? -useFun.getUseValue() : useFun.getUseValue();
                                       }

                                       MapUtil.mapPlusInt(percentMap, useFun.getUseId(), useValue);
                                    } else {
                                       value += buff.getValue(index);
                                    }
                                    break;
                                 }
                              }
                           } else if (buffModel.getSubCls() == 109) {
                              BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
                              if (Objects.nonNull(endUseFun) && endUseFun.getUseId() == property) {
                                 if (endUseFun.getCalcFun() == 1) {
                                    int useValue = buffModel.getType() == 2 ? -endUseFun.getUseValue() : endUseFun.getUseValue();
                                    MapUtil.mapPlusInt(percentMap, endUseFun.getUseId(), useValue);
                                 } else {
                                    value += buff.getValue(2);
                                 }
                              }
                           } else if (buffUseFun.getCalcFun() == 1) {
                              if (property == 19) {
                                 if (recordBuff2 == null || buff.getValue(1) < recordBuff2.getValue(1)) {
                                    recordBuff2 = buff;
                                 }
                              } else {
                                 MapUtil.mapPlusInt(percentMap, buffUseFun.getUseId(), buffValue);
                              }
                           } else if (property == 19) {
                              if (recordBuff1 == null || buff.getValue(1) < recordBuff1.getValue(1)) {
                                 recordBuff1 = buff;
                              }
                           } else {
                              value += buff.getValue(1);
                           }
                        }
                     }
                  }
               }
            }

            if (recordBuff1 != null) {
               value += recordBuff1.getValue(1);
            }

            if (recordBuff2 != null) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", recordBuff2.id);
               BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
               int buffValue = buffModel.getType() == 2 ? -buffUseFun.getUseValue() : buffUseFun.getUseValue();
               MapUtil.mapPlusInt(percentMap, 19, buffValue);
            }

            return value;
         }
      } else {
         return BattleMisc.isMultiplyProperty(property) ? 10000L : 0L;
      }
   }

   public long modifyBaseProperty(Action action, long value, HashSet<Buff> delSet) {
      if (value > 0L) {
         logger.info("buff里面只能扣血");
         return value;
      } else {
         for(int code : this.shieldBuff) {
            Buff buff = (Buff)this.codeBuffMap.get(code);
            if (!Objects.isNull(buff)) {
               Object param = action.getBlackboard().getSkillParam(50);
               short subCla = param instanceof Short ? (Short)param : 0;
               if (-value == buff.getValue(1)) {
                  delSet.add(buff);
                  this.recordHurtValue(buff, -value);
                  if (subCla == 18001) {
                     buff.setValue(1, 0L);
                  }

                  return 0L;
               }

               if (-value <= buff.getValue(1)) {
                  buff.addValue(1, value);
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
                  effectBuilder.setEffectType(4);
                  effectBuilder.setEffectId(buff.id);
                  effectBuilder.setEffectCode(buff.code);
                  effectBuilder.setEffectValue(buff.getValue(1));
                  effectBuilder.setCrit(buff.round);
                  action.getBlackboard().addBattleEffect(effectBuilder);
                  this.recordHurtValue(buff, -value);
                  return 0L;
               }

               delSet.add(buff);
               value += buff.getValue(1);
               this.recordHurtValue(buff, buff.getValue(1));
               if (subCla == 18001) {
                  buff.setValue(1, 0L);
               }
            }
         }

         return value;
      }
   }

   private void recordHurtValue(Buff buff, long hurtValue) {
      if (hurtValue >= 0L) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
         if (buffModel != null && buffModel.getSubCls() == 99) {
            BuffShieldHurtToHp tempBuff = (BuffShieldHurtToHp)buff;
            tempBuff.hurtValue += hurtValue;
         }

         if (buffModel != null && buffModel.getSubCls() == 106) {
            BuffDarkShield tempBuff = (BuffDarkShield)buff;
            tempBuff.hurtValue += hurtValue;
         }

         if (buffModel != null && buffModel.getSubCls() == 107) {
            BuffXuanShield tempBuff = (BuffXuanShield)buff;
            tempBuff.hurtValue += hurtValue;
         }

      }
   }

   public long getShieldValue() {
      long value = 0L;

      for(int code : this.shieldBuff) {
         Buff buff = (Buff)this.codeBuffMap.get(code);
         value += buff.getValue(1);
      }

      return value;
   }

   public HashSet<Integer> getShieldBuff() {
      return this.shieldBuff;
   }

   public float getBeCureValue() {
      float totalRate = 1.0F;
      HashMap<Integer, Long> map = new HashMap();

      for(int code : this.beCureshieldBuff) {
         Buff buff = (Buff)this.codeBuffMap.get(code);
         MapUtil.mapMergeSingleLong(map, buff.id, -buff.getValue(1));
      }

      for(Map.Entry<Integer, Long> e : map.entrySet()) {
         totalRate = totalRate * (float)(10000L - (Long)e.getValue()) / 10000.0F;
      }

      return totalRate;
   }

   public HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> getPriorityBuffsMap() {
      return this.priorityBuffsMap;
   }

   public int getPriorityBuffsNum(byte type) {
      return !this.priorityBuffsMap.containsKey(type) ? 0 : ((HashMap)this.priorityBuffsMap.get(type)).size();
   }

   public int getPriorityBuffsCodeNum(byte type) {
      if (!this.priorityBuffsMap.containsKey(type)) {
         return 0;
      } else {
         int num = 0;
         HashMap<Integer, TreeMap<Integer, Buff>> idMap = (HashMap)this.priorityBuffsMap.get(type);

         for(TreeMap<Integer, Buff> codeMap : idMap.values()) {
            for(Buff buff : codeMap.values()) {
               if (buff.count == 0) {
                  ++num;
               } else {
                  num += buff.count;
               }
            }
         }

         return num;
      }
   }

   public void forceDelete(int id) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", id);
      HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
      if (!Objects.isNull(idMaps)) {
         TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.remove(id);
         if (!Objects.isNull(codeMap)) {
            for(Integer code : codeMap.keySet()) {
               this.deleteBuffByCode((Action)null, code, false);
            }

         }
      }
   }

   public List<Integer> getDispel(byte type) {
      ArrayList<Integer> list = new ArrayList();
      HashMap<Integer, TreeMap<Integer, Buff>> tmpMap = (HashMap)this.priorityBuffsMap.get(type);
      if (Objects.isNull(tmpMap)) {
         return list;
      } else {
         for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : tmpMap.entrySet()) {
            if (((TreeMap)entry.getValue()).size() != 0) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", entry.getKey());
               if (buffModel.getNoDispel() == 0) {
                  list.add(entry.getKey());
               }
            }
         }

         return list;
      }
   }

   public List<Integer> getDispel(byte type, int controlType) {
      ArrayList<Integer> list = new ArrayList();
      ArrayList<Integer> noCtrlList = new ArrayList();
      ArrayList<Integer> ctrlList = new ArrayList();
      HashMap<Integer, TreeMap<Integer, Buff>> tmpMap = (HashMap)this.priorityBuffsMap.get(type);
      if (Objects.isNull(tmpMap)) {
         return list;
      } else {
         for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : tmpMap.entrySet()) {
            if (((TreeMap)entry.getValue()).size() != 0) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", entry.getKey());
               if (buffModel.getNoDispel() == 0) {
                  BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  if (!Objects.isNull(buffUseFun)) {
                     if (buffUseFun.getUseFunc() == 3 && BattleMisc.isControlBuf((byte)buffUseFun.getUseId())) {
                        ctrlList.add(entry.getKey());
                     } else {
                        noCtrlList.add(entry.getKey());
                     }
                  }
               }
            }
         }

         if (controlType == 1) {
            list.addAll(noCtrlList);
         } else {
            list.addAll(ctrlList);
         }

         return list;
      }
   }

   public boolean isHaveDispel(byte type) {
      HashMap<Integer, TreeMap<Integer, Buff>> tmpMap = (HashMap)this.priorityBuffsMap.get(type);
      if (Objects.isNull(tmpMap)) {
         return false;
      } else {
         for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : tmpMap.entrySet()) {
            if (((TreeMap)entry.getValue()).size() != 0) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", entry.getKey());
               if (buffModel.getNoDispel() == 0) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public Map<Integer, TreeMap<Integer, Buff>> getDispelEx(byte type) {
      return (Map)this.priorityBuffsMap.get(type);
   }

   public boolean checkPriority(byte type) {
      HashMap<Integer, TreeMap<Integer, Buff>> tmpMap = (HashMap)this.priorityBuffsMap.get(type);
      if (tmpMap == null) {
         return false;
      } else {
         for(TreeMap<Integer, Buff> map : tmpMap.values()) {
            if (map.size() > 0) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean checkSubBuff(short type) {
      if (!this.subTypeMap.containsKey(type)) {
         return false;
      } else {
         return ((TreeSet)this.subTypeMap.get(type)).size() > 0;
      }
   }

   public TreeSet<Integer> getSubBuff(short type) {
      return (TreeSet)this.subTypeMap.get(type);
   }

   public Buff getBuff(int code) {
      return (Buff)this.codeBuffMap.get(code);
   }

   public void deadClear(Action action) {
      ArrayList<Integer> delList = new ArrayList();
      delList.addAll(this.codeBuffMap.keySet());

      for(int code : delList) {
         this.deleteBuffByCode(action, code, false, true, 0, false);
      }

   }

   public void tuoTuoBuffPro(Action action, Buff buff, BuffModel buffModel, HashSet<Buff> delSet, byte effectType) {
      this.buffModifyHp(action, buff, buffModel, delSet, (byte)4, (Event)null);

      for(Buff delBuff : delSet) {
         this.deleteBuffByCode(action, delBuff.code, true);
      }

      BattlePKTeam casterPkTeam = buff.caster.getScene().getPKTeam(buff.caster.getForce());
      ArrayList<Entity> shareEntityList = new ArrayList();

      for(byte i = 0; i <= 4; ++i) {
         Entity member = casterPkTeam.getEntity(i);
         if (Objects.nonNull(member) && member.isAlive()) {
            shareEntityList.add(member);
         }
      }

      if (shareEntityList.size() != 0) {
         long value = Math.abs(buff.getValue(1));
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         value = (long)((float)value * ((float)buffUseFun.getExDependentValue() / 10000.0F));
         value /= (long)shareEntityList.size();

         for(Entity entity : shareEntityList) {
            boolean isCrit = (long)RandomUtil.randTenThousand() < buff.caster.getBattleProperty(action, 24);
            long tempValue = value;
            if (isCrit) {
               tempValue = (long)((float)(value * (10000L + buff.caster.getBattleProperty(action, 25))) / 10000.0F);
            }

            entity.recoverHp(action, buff.caster, (SkillEffectModel)null, isCrit, tempValue, (Event)null, true);
         }

      }
   }

   public int getSpend() {
      TreeMap<Integer, TreeSet<Integer>> idSpeedMap = (TreeMap)this.battlePropertyBuff.get(4);
      if (idSpeedMap != null && idSpeedMap.size() != 0) {
         int value = 0;

         for(TreeSet<Integer> speedMap : idSpeedMap.values()) {
            for(int code : speedMap) {
               Buff buff = this.getBuff(code);
               if (!Objects.isNull(buff)) {
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
                  if (buffModel.getSubCls() == 77) {
                     for(int index = 1; index <= 2; ++index) {
                        BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(index);
                        if (Objects.nonNull(useFun) && useFun.getUseId() == 4) {
                           value = (int)((long)value + buff.getValue(index));
                           break;
                        }
                     }
                  } else if (buffModel.getSubCls() == 109) {
                     BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
                     if (Objects.nonNull(endUseFun) && endUseFun.getUseId() == 4) {
                        value = (int)((long)value + buff.getValue(2));
                     }
                  } else {
                     value = (int)((long)value + buff.getValue(1));
                  }
               }
            }
         }

         return value;
      } else {
         return 0;
      }
   }

   public TreeMap<Integer, Buff> getCodeBuffMap() {
      return this.codeBuffMap;
   }

   public Short getBuffCount(Short subCls) {
      return (Short)this.buffCount.get(subCls);
   }

   public void resetBuffCount(Short subCls) {
      this.buffCount.put(subCls, Short.valueOf((short)0));
   }

   public boolean checkBlock(Action action) {
      Set<Integer> codeSet = this.getSubBuff((short)48);
      if (codeSet != null && codeSet.size() != 0) {
         int code = (Integer)codeSet.iterator().next();
         this.deleteBuffByCode(action, code, true);
         return true;
      } else {
         return false;
      }
   }

   public Set<Integer> checkFreeze(Action action) {
      Set<Integer> codeSet = this.getSubBuff((short)59);
      return codeSet != null && codeSet.size() != 0 ? codeSet : null;
   }

   public void addYuSlave(Action action, long value) {
      Set<Integer> codeSet = this.getSubBuff((short)50);
      if (codeSet != null && codeSet.size() != 0) {
         int code = (Integer)codeSet.iterator().next();
         Buff slaveBuff = this.getBuff(code);
         if (slaveBuff != null) {
            if (slaveBuff.caster != null && !slaveBuff.caster.isDead()) {
               TreeSet<Integer> mainSet = slaveBuff.caster.getBuffManager().getSubBuff((short)49);
               if (mainSet != null && mainSet.size() != 0) {
                  int mainCode = (Integer)mainSet.iterator().next();
                  Buff mainBuff = slaveBuff.caster.getBuffManager().getBuff(mainCode);
                  if (mainBuff != null) {
                     BuffModel slaveBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", slaveBuff.id);
                     BuffModel mainBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", mainBuff.id);
                     value = (long)((float)value * ((float)((BuffUseFun)slaveBuffModel.getFuncs().get(1)).getDependentValue() / 10000.0F));
                     long maxValue = (long)((float)((BuffUseFun)mainBuffModel.getFuncs().get(2)).getDependentValue() / 10000.0F * (float)slaveBuff.caster.getBaseProperty(98));
                     mainBuff.addValue(1, value);
                     if (mainBuff.getValue(1) > maxValue) {
                        mainBuff.setValue(1, maxValue);
                     }

                     if (value != 0L) {
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setTargetBattlePos(slaveBuff.caster.getBattlePos());
                        effectBuilder.setEffectType(27);
                        effectBuilder.setEffectCode((int)value);
                        effectBuilder.setEffectValue(mainBuff.getValue(1));
                        effectBuilder.setFinalValue(maxValue);
                        action.getBlackboard().addBattleEffect(effectBuilder);
                     }

                  }
               }
            }
         }
      }
   }

   public void delSubClsBuff(Action action, short type) {
      TreeSet<Integer> subCode = this.getSubBuff(type);
      if (subCode != null && subCode.size() != 0) {
         Integer[] arrays = (Integer[])subCode.toArray(new Integer[subCode.size()]);
         Integer[] var5 = arrays;
         int var6 = arrays.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            int code = var5[var7];
            this.deleteBuffByCode(action, code, false);
         }

      }
   }

   private boolean isAddBuff(Action action, BuffModel buffModel) {
      if (buffModel.getSubCls() != 76) {
         return true;
      } else if (!this.isExistSubType((short)76)) {
         return true;
      } else {
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (Objects.isNull(useFun)) {
            return false;
         } else {
            TreeSet<Integer> subMap = (TreeSet)this.subTypeMap.get(Short.valueOf((short)76));
            ArrayList<Integer> list = new ArrayList(subMap);
            Integer code = (Integer)list.get(0);
            Buff tempBuff = this.getBuff(code);
            BuffModel tempBuffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", tempBuff.id);
            BuffUseFun tempUseFun = (BuffUseFun)tempBuffModel.getFuncs().get(1);
            if (!Objects.isNull(tempUseFun) && tempUseFun.getUseValue() >= useFun.getUseValue()) {
               return false;
            } else {
               this.deleteBuffByCode(action, code, false);
               return true;
            }
         }
      }
   }

   public boolean weakenShield(BuffModel buffModel, Buff buff) {
      BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
      if (Objects.nonNull(fun) && fun.getUseFunc() == 6) {
         long value = buff.getValue(1);
         if (value <= 0L) {
            return false;
         }

         Set<Integer> codeSet = this.getSubBuff((short)93);
         if (codeSet == null || codeSet.size() == 0) {
            return true;
         }

         int useValue = 0;

         for(int code : codeSet) {
            Buff tempBuff = this.getBuff(code);
            BuffModel codeBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", tempBuff.id);
            BuffUseFun tempFun = (BuffUseFun)codeBuffModel.getFuncs().get(1);
            if (!Objects.isNull(tempFun)) {
               useValue += tempFun.getUseValue();
            }
         }

         if (useValue != 0) {
            value = (long)((float)value - (float)(value * (long)useValue) / 10000.0F);
            if (value <= 0L) {
               value = 0L;
            }

            buff.setValue(1, value);
         }

         if (value == 0L) {
            return false;
         }
      }

      return true;
   }

   private boolean isMmuneControl(BuffModel buffModel) {
      if (buffModel.getType() == 2 && this.isExistSubType((short)104)) {
         TreeSet<Integer> subTypeSet = (TreeSet)this.subTypeMap.get(Short.valueOf((short)104));
         int code = (Integer)subTypeSet.last();
         Buff buff = this.getBuff(code);
         BuffModel immuneModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);

         for(int index = 1; index <= 2; ++index) {
            if (immuneModel.getFuncs().containsKey(index)) {
               BuffUseFun useFun = (BuffUseFun)immuneModel.getFuncs().get(index);
               if (!Objects.isNull(useFun) && useFun.getExDependentValue() == buffModel.getSubCls()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean isOffsetDebuf(Action action, BuffModel buffModel, Event event) {
      if (buffModel.getType() == 2 && buffModel.getNoDispel() == 0 && this.isExistSubType((short)115)) {
         TreeSet<Integer> subTypeSet = (TreeSet)this.subTypeMap.get(Short.valueOf((short)115));
         int code = (Integer)subTypeSet.first();
         Buff buff = this.getBuff(code);
         BuffModel offsetModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
         BuffUseFun useFun = (BuffUseFun)offsetModel.getFuncs().get(1);
         if (Objects.nonNull(useFun)) {
            boolean ctrl = false;
            BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.nonNull(fun) && fun.getUseFunc() == 3 && BattleMisc.isControlBuf((byte)fun.getUseId())) {
               ctrl = true;
            }

            int type = useFun.getExDependentValue();
            if (type == 3 || type == 1 && !ctrl || type == 2 && ctrl) {
               this.deleteBuffByCode(action, code, false);
               BuffUseFun endFun = (BuffUseFun)offsetModel.getFuncs().get(2);
               if (Objects.nonNull(endFun)) {
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", endFun.getExDependentValue());
                  if (skillEffectModel != null) {
                     List<Entity> list = new ArrayList();
                     list.add(this.entity);
                     EffectFuncProcessor.doFunc(action, buff.caster, this.entity, list, skillEffectModel, event);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void delLinkBuff(Action action, BuffModel buffModel) {
      if (buffModel.getSubCls() == 87 || buffModel.getSubCls() == 88) {
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(useFun)) {
            int linkBuffId = useFun.getExDependentValue();
            Entity linkEntity = null;
            byte force = BattleMisc.oppositionForce(this.entity.getForce());

            for(Entity entity : this.entity.getScene().getPKTeam(force).getEntityMap().values()) {
               if (entity.getBuffManager().isExistId(linkBuffId)) {
                  linkEntity = entity;
                  break;
               }
            }

            if (Objects.nonNull(linkEntity)) {
               BuffModel linkBuffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", linkBuffId);
               if (Objects.isNull(linkBuffModel)) {
                  logger.error("删除buff时，无法找到buff:" + linkBuffId);
                  return;
               }

               HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)linkEntity.getBuffManager().getPriorityBuffsMap().get(linkBuffModel.getType());
               if (Objects.isNull(idMaps)) {
                  return;
               }

               TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.remove(linkBuffId);
               if (Objects.isNull(codeMap)) {
                  return;
               }

               for(Map.Entry<Integer, Buff> entry : codeMap.entrySet()) {
                  linkEntity.getBuffManager().delLinkBuffByCode(action, (Integer)entry.getKey(), 0, false);
               }
            }
         }
      }

   }

   private void delLinkBuffByCode(Action action, int code, int modelId, boolean last) {
      Buff buff = (Buff)this.codeBuffMap.get(code);
      if (!Objects.isNull(buff)) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
         this.codeBuffMap.remove(code);
         HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.priorityBuffsMap.get(buffModel.getType());
         if (Objects.nonNull(idMaps)) {
            TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(buff.id);
            if (Objects.nonNull(codeMap)) {
               codeMap.remove(code);
            }
         }

         long useValue = 0L;
         if (this.subTypeMap.containsKey(buffModel.getSubCls())) {
            ((TreeSet)this.subTypeMap.get(buffModel.getSubCls())).remove(code);
         }

         if (Objects.nonNull(action)) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(3);
            effectBuilder.setTargetBattlePos(this.entity.getBattlePos());
            effectBuilder.setEffectId(buff.id);
            effectBuilder.setEffectCode(buff.code);
            effectBuilder.setEffectValue(Math.abs(useValue));
            effectBuilder.setEffectSetId(modelId);
            effectBuilder.setFinalValue(this.entity.getBaseProperty(99));
            if (!last) {
               action.getBlackboard().addBattleEffect(effectBuilder);
            } else {
               action.getBlackboard().addLastEffect(effectBuilder);
            }
         }

         buff.destroy();
      }
   }

   private long correctMaxHpMax(long currHpMax) {
      long value = 0L;
      if (currHpMax > this.entity.getMaxHpMax()) {
         long correctValue = currHpMax - this.entity.getMaxHpMax();
         this.entity.setMaxHpMax(currHpMax);
         Set<Integer> codeSet = this.getSubBuff((short)94);
         if (Objects.isNull(codeSet)) {
            return value;
         }

         int totalValue = 0;

         for(int code : codeSet) {
            Buff buff = this.getBuff(code);
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (!Objects.isNull(useFun)) {
               totalValue += useFun.getDependentValue();
            }
         }

         if (correctValue > 0L) {
            value = (long)((float)(correctValue * (long)totalValue) / 10000.0F);
         }
      }

      return value;
   }
}
