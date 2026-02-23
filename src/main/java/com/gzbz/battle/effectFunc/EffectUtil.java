package com.gzbz.battle.effectFunc;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.SkillUtil;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffDemoniseCao;
import com.gzbz.battle.buff.BuffLiveAndDie;
import com.gzbz.battle.entity.EffectContent;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.model.BuffModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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

public class EffectUtil implements Serializable {
   static Logger logger = LoggerFactory.getLogger(EffectUtil.class);
   public static HashSet<Byte> HURT_CURE_EXCHANGE_ACTION = new HashSet();

   public static void doShield(Action action, Entity source, Entity target, long damage, SkillEffectModel model, boolean isCrit, boolean apportion, Event event, byte specialDamageMsgEffect) {
      if (damage < 0L) {
         logger.info("伤害值必须是正数");
      } else {
         if (model != null) {
            action.getBlackboard().addSkillParam(2200 + target.getBattlePos(), 0L);
         }

         if (!target.getStateManager().checkState((short)25)) {
            if (target.entityType == 0 && damage != 0L) {
               action.getBlackboard().addSkillParam(3300 + target.getBattlePos(), apportion);
               if (!apportion) {
                  Event preHurtEvent = new Event((short)42, action, event);
                  preHurtEvent.addParam(2, source);
                  preHurtEvent.addParam(3, target);
                  preHurtEvent.addParam(31, model);
                  source.getScene().getEventListener().pushEvent(preHurtEvent);
               }

               long covertValue = hurtCureExchange(action, source, target, damage, model, true, apportion, event);
               damage -= covertValue;
               if (damage == 0L) {
                  if (!target.isDead()) {
                     doHurtToCure(action, source, target, covertValue, model, event);
                  }

               } else {
                  long tranCure = hurtTranCure(action, source, target, damage, model, apportion, event);
                  damage -= tranCure;
                  if (damage == 0L) {
                     if (!target.isDead()) {
                        doHurtToCure(action, source, target, covertValue, model, event);
                     }

                  } else {
                     covertValue += tranCure;
                     damage = source.getConditionPropertyManager().getValue130(action, damage);
                     damage = target.getConditionPropertyManager().getValue136(action, damage, target);
                     boolean ignoreShield = source.getConditionPropertyManager().ignoreShieldEffect(action);
                     boolean isCall = (Boolean)action.getBlackboard().getSkillParam(2000 + target.getBattlePos(), false);
                     if (!isCall) {
                        damage = linkBuffPositive(action, event, source, target, damage);
                     } else {
                        action.getBlackboard().removeSkillParam(2000 + target.getBattlePos());
                     }

                     damage = liveAndDieBuf(source, target, damage);
                     long takeDamage = demoniseBuffHurt(target, damage);
                     damage -= takeDamage;
                     long offsetDamage = offsetHurtBuff(action, source, target, damage, model, event);
                     damage -= offsetDamage;
                     if (model != null) {
                        action.getBlackboard().addSkillParam(2200 + target.getBattlePos(), damage);
                     }

                     if (source != null) {
                        source.addAttackValue(action, damage, event);
                     }

                     if (target != null) {
                        target.addDamageValue(damage);
                     }

                     HashSet<Buff> delSet = new HashSet();
                     long newValue = damage;
                     if (!ignoreShield) {
                        newValue = -target.getBuffManager().modifyBaseProperty(action, -damage, delSet);
                     }

                     for(Buff buffCode : delSet) {
                        BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buffCode.id);
                        BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
                        if (fun != null && fun.getUseFunc() == 6) {
                           TreeSet<Integer> xuanWuBuffSet = target.getBuffManager().getSubBuff((short)71);
                           if (xuanWuBuffSet != null && xuanWuBuffSet.size() > 0) {
                              int xuanWuCode = (Integer)xuanWuBuffSet.first();
                              Buff xuanWuBuff = target.getBuffManager().getBuff(xuanWuCode);
                              BuffModel xuanWuModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", xuanWuBuff.id);
                              BuffUseFun buffUseFun = (BuffUseFun)xuanWuModel.getFuncs().get(2);
                              long value = (long)((float)(xuanWuBuff.caster.getBaseProperty(2) * (long)buffUseFun.getUseValue()) / 10000.0F);
                              source.modifyHp(action, -value, event, xuanWuBuff.caster);
                              BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                              effectBuilder.setEffectType(6);
                              effectBuilder.setEffectId(0);
                              effectBuilder.setEffectValue(value);
                              effectBuilder.setTargetBattlePos(source.getBattlePos());
                              effectBuilder.setFinalValue(source.getBaseProperty(99));
                              effectBuilder.setCrit(0);
                              effectBuilder.setEffectSetId(0);
                              action.getBlackboard().addBattleEffect(effectBuilder);
                              if (source.isDead()) {
                                 effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                                 effectBuilder.setTargetBattlePos(source.getBattlePos());
                                 effectBuilder.setEffectType(9);
                                 effectBuilder.setEffectValue(1L);
                                 effectBuilder.setFinalValue(source.getBaseProperty(99));
                                 action.getBlackboard().addBattleEffect(effectBuilder);
                                 putDeadEvent(action, xuanWuBuff.caster, source, event);
                              }
                           }
                        }

                        target.getBuffManager().deleteBuffByCode(action, buffCode.code, true, false, 0, true);
                     }

                     byte damageMsgEffect = 6;
                     if (specialDamageMsgEffect != 0) {
                        damageMsgEffect = specialDamageMsgEffect;
                     }

                     if (newValue == 0L) {
                        BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectAbsorbBuilder.setTargetBattlePos(target.getBattlePos());
                        effectAbsorbBuilder.setEffectType(2);
                        effectAbsorbBuilder.setCrit(apportion ? 1 : 0);
                        effectAbsorbBuilder.setEffectValue(Math.abs(damage));
                        effectAbsorbBuilder.setEffectId(model == null ? 0 : model.getId());
                        effectAbsorbBuilder.setEffectSetId(model == null ? 0 : model.getId());
                        action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
                     } else if (newValue != damage) {
                        target.modifyHp(action, -newValue, event, source);
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        if (apportion) {
                           effectBuilder.setEffectType(23);
                        } else {
                           effectBuilder.setEffectType(damageMsgEffect);
                        }

                        effectBuilder.setEffectId(model == null ? 0 : model.getId());
                        effectBuilder.setEffectValue(newValue);
                        effectBuilder.setTargetBattlePos(target.getBattlePos());
                        effectBuilder.setCrit(isCrit ? 1 : 0);
                        effectBuilder.setEffectSetId(model == null ? 0 : model.getId());
                        effectBuilder.setFinalValue(target.getBaseProperty(99));
                        action.getBlackboard().addBattleEffect(effectBuilder);
                        BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectAbsorbBuilder.setEffectType(2);
                        effectAbsorbBuilder.setCrit(apportion ? 1 : 0);
                        effectAbsorbBuilder.setEffectValue(Math.abs(damage - newValue));
                        effectAbsorbBuilder.setTargetBattlePos(target.getBattlePos());
                        effectAbsorbBuilder.setEffectSetId(model == null ? 0 : model.getId());
                        action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
                     } else {
                        target.modifyHp(action, -newValue, event, source);
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        if (apportion) {
                           effectBuilder.setEffectType(23);
                        } else {
                           effectBuilder.setEffectType(damageMsgEffect);
                        }

                        effectBuilder.setEffectId(model == null ? 0 : model.getId());
                        effectBuilder.setEffectValue(newValue);
                        effectBuilder.setTargetBattlePos(target.getBattlePos());
                        effectBuilder.setFinalValue(target.getBaseProperty(99));
                        effectBuilder.setCrit(isCrit ? 1 : 0);
                        effectBuilder.setEffectSetId(model == null ? 0 : model.getId());
                        action.getBlackboard().addBattleEffect(effectBuilder);
                        if (Debug.isDebug) {
                           Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
                           if (Objects.nonNull(attacker)) {
                              BattleTestMgr.analyseBuffEffect(damageMsgEffect, attacker.getId(), model == null ? 0 : attacker.getId(), (long)((int)newValue));
                           }
                        }
                     }

                     demoniseBuffRecoverHp(action, source, target, takeDamage, event);
                     if (!target.isDead()) {
                        doHurtToCure(action, source, target, covertValue, model, event);
                     }

                  }
               }
            }
         }
      }
   }

   protected static boolean doApportion(Action action, Entity source, Entity target, long damage, SkillEffectModel model, boolean isCrit, Event event, int noApportionRate) {
      long covertValue = hurtCureExchange(action, source, target, damage, model, true, false, event);
      damage -= covertValue;
      if (damage == 0L) {
         if (!target.isDead()) {
            doHurtToCure(action, source, target, covertValue, model, event);
         }

         return true;
      } else {
         long tranCure = hurtTranCure(action, source, target, damage, model, false, event);
         damage -= tranCure;
         if (damage == 0L) {
            if (!target.isDead()) {
               doHurtToCure(action, source, target, tranCure, model, event);
            }

            return true;
         } else {
            covertValue += tranCure;
            damage = linkBuffPositive(action, event, source, target, damage);
            action.getBlackboard().addSkillParam(2000 + target.getBattlePos(), true);
            byte oppositionForce = BattleMisc.oppositionForce(target.getForce());
            BattlePKTeam oppositionTeam = action.getScene().getPKTeam(oppositionForce);
            if (oppositionTeam != null) {
               long leftValue = damage;

               for(Entity member : oppositionTeam.getEntityMap().values()) {
                  if (!member.isDead()) {
                     TreeSet<Integer> buffSet = member.getBuffManager().getSubBuff((short)57);
                     if (buffSet != null && buffSet.size() != 0) {
                        for(int code : buffSet) {
                           Buff buff = member.getBuffManager().getBuff(code);
                           if (buff != null && target == buff.caster) {
                              if (leftValue == 0L) {
                                 break;
                              }

                              BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                              BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                              if (buffUseFun != null) {
                                 long damageValue = (long)((float)buffUseFun.getUseValue() / 10000.0F * (float)damage);
                                 if (leftValue < damageValue) {
                                    doShield(action, source, member, leftValue, model, isCrit, true, event, (byte)0);
                                    leftValue = 0L;
                                 } else {
                                    leftValue -= damageValue;
                                    doShield(action, source, member, damageValue, model, isCrit, true, event, (byte)0);
                                 }

                                 if (member.isDead()) {
                                    BattleMsg.S2C_Battle_Effect.Builder deadEffectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                                    deadEffectBuilder.setTargetBattlePos(member.getBattlePos());
                                    deadEffectBuilder.setEffectType(9);
                                    deadEffectBuilder.setEffectValue(1L);
                                    deadEffectBuilder.setFinalValue(target.getBaseProperty(99));
                                    deadEffectBuilder.setEffectSetId(model.getId());
                                    action.getBlackboard().addBattleEffect(deadEffectBuilder);
                                    putDeadEvent(action, source, member, event);
                                    member.addDeadTimesAndClear(action);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               damage = leftValue;
            }

            if (damage == 0L) {
               return true;
            } else {
               Set<Integer> initiativeBuffCodes = target.getBuffManager().getSubBuff((short)30);
               HashSet<Entity> averageBuffEntity = new HashSet();
               HashSet<Entity> memberAverage = new HashSet();

               for(Entity member : target.getPkTeam().getEntityMap().values()) {
                  if (!member.isDead() && member.getBuffManager().checkSubBuff((short)44) && (model.getIsForce() != 0 || !member.getStateManager().checkState((short)17)) && member != target && !target.getStateManager().checkState((short)21) && target.getHpRate() <= member.getHpRate()) {
                     memberAverage.add(member);
                     break;
                  }
               }

               for(Entity member : target.getPkTeam().getEntityMap().values()) {
                  if (!member.isDead()) {
                     Set<Integer> averageBuffCodes = member.getBuffManager().getSubBuff((short)31);
                     if (!Objects.isNull(averageBuffCodes) && averageBuffCodes.size() != 0) {
                        averageBuffEntity.add(member);
                     }
                  }
               }

               if (memberAverage.isEmpty() && (Objects.isNull(initiativeBuffCodes) || initiativeBuffCodes.isEmpty()) && averageBuffEntity.isEmpty()) {
                  action.getBlackboard().plusSkillLongParam(1500 + target.getBattlePos(), damage);
                  if (covertValue > 0L) {
                     action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
                  }

                  doShield(action, source, target, damage, model, isCrit, false, event, (byte)0);
                  if (!target.isDead()) {
                     doHurtToCure(action, source, target, covertValue, model, event);
                  }

                  return false;
               } else if (noApportionRate != 0) {
                  HashSet<Entity> apportionSet = new HashSet();

                  for(Entity memberAverageEntity : memberAverage) {
                     apportionSet.add(memberAverageEntity);
                     if (covertValue > 0L) {
                        action.getBlackboard().addSkillParam(2500 + memberAverageEntity.getBattlePos(), true);
                     }
                  }

                  if (Objects.nonNull(initiativeBuffCodes) && initiativeBuffCodes.size() > 0) {
                     for(int code : new TreeSet(initiativeBuffCodes)) {
                        Buff buff = target.getBuffManager().getBuff(code);
                        if (buff.caster != null && !buff.caster.isDead() && buff.caster != target) {
                           apportionSet.add(buff.caster);
                           if (covertValue > 0L) {
                              action.getBlackboard().addSkillParam(2500 + buff.caster.getBattlePos(), true);
                           }
                        }
                     }
                  }

                  for(Entity member : averageBuffEntity) {
                     if (member != target) {
                        apportionSet.add(member);
                        if (covertValue > 0L) {
                           action.getBlackboard().addSkillParam(2500 + member.getBattlePos(), true);
                        }
                     }
                  }

                  if (covertValue > 0L) {
                     action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
                  }

                  doNoApportion(action, source, target, damage, model, isCrit, event, noApportionRate, apportionSet);
                  if (!target.isDead()) {
                     doHurtToCure(action, source, target, covertValue, model, event);
                  }

                  return false;
               } else {
                  HashMap<Entity, Long> hurtEntity = new HashMap();

                  for(Entity memberAverageEntity : memberAverage) {
                     for(int code : memberAverageEntity.getBuffManager().getSubBuff((short)44)) {
                        Buff averageBuff = memberAverageEntity.getBuffManager().getBuff(code);
                        BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", averageBuff.id);
                        long averageValue = (long)((float)(damage * (long)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue()) / 10000.0F);
                        damage -= averageValue;
                        averageValue = (long)((float)averageValue * ((float)((BuffUseFun)buffModel.getFuncs().get(2)).getUseValue() / 10000.0F));
                        doShield(action, source, memberAverageEntity, averageValue, model, isCrit, true, event, (byte)0);
                        MapUtil.mapPlusLong(hurtEntity, memberAverageEntity, averageValue);
                     }
                  }

                  if (Objects.nonNull(initiativeBuffCodes) && initiativeBuffCodes.size() > 0) {
                     for(int code : new TreeSet(initiativeBuffCodes)) {
                        Buff buff = target.getBuffManager().getBuff(code);
                        BuffModel initiativeModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                        if (buff.caster != null && !buff.caster.isDead() && buff.caster != target) {
                           int value = (int)((float)buff.getValue(1) / 10000.0F * (float)damage);
                           damage -= (long)value;
                           BuffUseFun leaveFun = (BuffUseFun)initiativeModel.getFuncs().get(2);
                           if (leaveFun != null) {
                              value = (int)((float)value * ((float)leaveFun.getUseValue() / 10000.0F));
                           }

                           doShield(action, source, buff.caster, (long)value, model, isCrit, true, event, (byte)0);
                           MapUtil.mapPlusLong(hurtEntity, buff.caster, (long)value);
                           BattleTestMgr.analyseBuffEffect((byte)6, source.getId(), model.getId(), (long)value);
                        }
                     }
                  }

                  if (averageBuffEntity.size() > 0) {
                     int num = averageBuffEntity.size();
                     damage /= (long)num;

                     for(Entity member : averageBuffEntity) {
                        if (member != target) {
                           doShield(action, source, member, damage, model, isCrit, true, event, (byte)0);
                           MapUtil.mapPlusLong(hurtEntity, member, damage);
                        }
                     }
                  }

                  if (damage != 0L) {
                     action.getBlackboard().plusSkillLongParam(1500 + target.getBattlePos(), damage);
                     if (covertValue > 0L) {
                        action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
                     }

                     doShield(action, source, target, damage, model, isCrit, false, event, (byte)0);
                     if (!target.isDead()) {
                        doHurtToCure(action, source, target, covertValue, model, event);
                     }
                  }

                  MapUtil.mapPlusLong(hurtEntity, target, damage);

                  for(Map.Entry<Entity, Long> entry : hurtEntity.entrySet()) {
                     if (((Entity)entry.getKey()).isDead() && entry.getKey() != target) {
                        BattleMsg.S2C_Battle_Effect.Builder deadEffectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        deadEffectBuilder.setTargetBattlePos(((Entity)entry.getKey()).getBattlePos());
                        deadEffectBuilder.setEffectType(9);
                        deadEffectBuilder.setEffectValue(1L);
                        deadEffectBuilder.setFinalValue(target.getBaseProperty(99));
                        deadEffectBuilder.setEffectSetId(model.getId());
                        action.getBlackboard().addBattleEffect(deadEffectBuilder);
                        putDeadEvent(action, source, (Entity)entry.getKey(), event);
                        ((Entity)entry.getKey()).addDeadTimesAndClear(action);
                     }
                  }

                  return true;
               }
            }
         }
      }
   }

   private static void doNoApportion(Action action, Entity source, Entity target, long damage, SkillEffectModel model, boolean isCrit, Event event, int noApportionRate, HashSet<Entity> apportionSet) {
      action.getBlackboard().plusSkillLongParam(1500 + target.getBattlePos(), damage);
      doShield(action, source, target, damage, model, isCrit, false, event, (byte)0);
      if (noApportionRate >= 0) {
         noApportionRate = source.getConditionPropertyManager().getValue132(action, noApportionRate);
         long newDamage = (long)((float)(damage * (long)noApportionRate) / 10000.0F);
         HashMap<Entity, Long> hurtEntity = new HashMap();

         for(Entity member : apportionSet) {
            doShield(action, source, member, newDamage, model, isCrit, false, event, (byte)0);
            MapUtil.mapPlusLong(hurtEntity, member, newDamage);
            BattleTestMgr.analyseBuffEffect((byte)6, source.getId(), model.getId(), newDamage);
         }

         for(Map.Entry<Entity, Long> entry : hurtEntity.entrySet()) {
            if (((Entity)entry.getKey()).isDead() && entry.getKey() != target) {
               BattleMsg.S2C_Battle_Effect.Builder deadEffectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               deadEffectBuilder.setTargetBattlePos(((Entity)entry.getKey()).getBattlePos());
               deadEffectBuilder.setEffectType(9);
               deadEffectBuilder.setEffectValue(1L);
               deadEffectBuilder.setFinalValue(target.getBaseProperty(99));
               deadEffectBuilder.setEffectSetId(model.getId());
               action.getBlackboard().addBattleEffect(deadEffectBuilder);
               putDeadEvent(action, source, (Entity)entry.getKey(), event);
               ((Entity)entry.getKey()).addDeadTimesAndClear(action);
            }
         }

         for(Entity member : apportionSet) {
            putApportionEvent(action, source, member, event);
         }

      }
   }

   public static boolean isCrit(Action action, Entity source, Entity target, SkillEffectModel model) {
      boolean isCrit = false;
      if (model == null) {
         return false;
      } else {
         if (model.getCrit() > 0 && source.getBattleProperty(action, 101) == 0L) {
            if (source.getBattleProperty(action, 100) > 0L) {
               isCrit = true;
            } else {
               isCrit = SkillUtil.calcCrit(action, source, 5, target, 7);
            }

            Boolean targetCRIT = (Boolean)action.getBlackboard().getSkillParam(200 + target.getBattlePos());
            if (targetCRIT == null || !targetCRIT) {
               action.getBlackboard().addSkillParam(200 + target.getBattlePos(), isCrit);
            }

            Boolean sourceCRIT = (Boolean)action.getBlackboard().getSkillParam(21);
            if (sourceCRIT == null || !sourceCRIT) {
               action.getBlackboard().addSkillParam(21, isCrit);
            }

            if (isCrit) {
               Integer times = (Integer)action.getBlackboard().getSkillParam(49);
               if (times == null) {
                  times = 0;
               }

               times = times + 1;
               action.getBlackboard().addSkillParam(49, times);
            }
         }

         if (isCrit) {
            Set<Integer> resistanceCritiBuff = target.getBuffManager().getSubBuff((short)38);
            if (resistanceCritiBuff != null && resistanceCritiBuff.size() > 0) {
               Iterator var15 = resistanceCritiBuff.iterator();
               if (var15.hasNext()) {
                  Integer buffCode = (Integer)var15.next();
                  Buff critiBuff = target.getBuffManager().getBuff(buffCode);
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", critiBuff.id);
                  ++critiBuff.curUseTime;
                  isCrit = false;
                  Integer times = (Integer)action.getBlackboard().getSkillParam(49);
                  if (times != null) {
                     times = times - 1;
                     action.getBlackboard().addSkillParam(49, times);
                  }

                  if (critiBuff.curUseTime >= buffModel.getUseTimes()) {
                     target.getBuffManager().deleteBuffByCode(action, critiBuff.code, false);
                  }
               }

               if (!isCrit) {
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setTargetBattlePos(target.getBattlePos());
                  effectBuilder.setEffectType(16);
                  effectBuilder.setEffectValue(1L);
                  action.getBlackboard().addBattleEffect(effectBuilder);
                  isCrit = false;
               }
            }
         }

         Boolean beCrit = (Boolean)action.getBlackboard().getSkillParam(2900 + target.getBattlePos());
         if (beCrit == null || !beCrit) {
            action.getBlackboard().addSkillParam(2900 + target.getBattlePos(), isCrit);
         }

         return isCrit;
      }
   }

   public static boolean isCrit(Action action, Entity source, SkillEffectModel model) {
      boolean isCrit = false;
      if (source.getBattleProperty(action, 101) == 0L) {
         if (model.getFuncParam().containsKey("critRate")) {
            isCrit = (float)RandomUtil.randTenThousand() < (float)source.getBattleProperty(action, 24) * ((float)(Integer)model.getFuncParam().get("critRate") / 10000.0F);
         } else {
            isCrit = (long)RandomUtil.randTenThousand() < source.getBattleProperty(action, 24);
         }

         Boolean sourceCRIT = (Boolean)action.getBlackboard().getSkillParam(51);
         if (sourceCRIT == null || !sourceCRIT) {
            action.getBlackboard().addSkillParam(51, isCrit);
         }
      }

      return isCrit;
   }

   public static void putDeadEvent(Action action, Entity source, Entity target, Event event) {
      if (!target.getStateManager().checkState((short)21)) {
         action.getBlackboard().addSkillParam(1700 + target.getBattlePos(), source);
         Event deadEvent = new Event((short)5, action, event);
         deadEvent.addParam(2, source);
         deadEvent.addParam(3, target);
         action.getScene().getEventListener().pushEvent(deadEvent);
         Event deadEventEnd = new Event((short)40, action, event);
         deadEventEnd.addParam(2, source);
         deadEventEnd.addParam(3, target);
         action.getScene().getEventListener().pushEvent(deadEventEnd);
         if (source.getType() == BattleMsg.EntityType.EntityType_Artifact) {
            source.getScene().addRecordValue(source.getForce(), 200001, 1L);
         }

      }
   }

   public static void putApportionEvent(Action action, Entity source, Entity target, Event event) {
      if (!target.isDead()) {
         EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
         Event apportionEvent = new Event((short)29, action, event);
         apportionEvent.addParam(2, source);
         apportionEvent.addParam(3, target);
         apportionEvent.addParam(5, entitySkill);
         action.getScene().getEventListener().pushEvent(apportionEvent);
      }
   }

   public static long linkBuffPositive(Action action, Event event, Entity source, Entity target, long damage) {
      if (target.getBuffManager().isExistSubType((short)87)) {
         TreeSet<Integer> subMap = target.getBuffManager().getSubBuff((short)87);
         int code = (Integer)subMap.last();
         Buff buff = target.getBuffManager().getBuff(code);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.isNull(useFun)) {
            return damage;
         }

         int linkBuffId = useFun.getExDependentValue();
         Entity linkEntity = null;
         byte force = BattleMisc.oppositionForce(target.getForce());

         for(Entity entity : target.getScene().getPKTeam(force).getEntityMap().values()) {
            if (entity.getBuffManager().isExistId(linkBuffId)) {
               linkEntity = entity;
               break;
            }
         }

         if (Objects.isNull(linkEntity)) {
            return damage;
         }

         if (linkEntity.getBuffManager().isExistSubType((short)87)) {
            TreeSet<Integer> linkSubMap = linkEntity.getBuffManager().getSubBuff((short)87);
            int linkCode = (Integer)linkSubMap.last();
            Buff linkBuff = linkEntity.getBuffManager().getBuff(linkCode);
            BuffModel linkBuffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", linkBuff.id);
            BuffUseFun linkUseFun = (BuffUseFun)linkBuffModel.getFuncs().get(2);
            if (Objects.nonNull(linkUseFun)) {
               int buffId = linkUseFun.getExDependentValue();
               Entity entity = null;

               for(Entity e : target.getPkTeam().getEntityMap().values()) {
                  if (e.getBuffManager().isExistId(buffId)) {
                     entity = e;
                     break;
                  }
               }

               if (Objects.nonNull(entity)) {
                  useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  linkUseFun = (BuffUseFun)linkBuffModel.getFuncs().get(1);
                  long newDamage = (long)((float)(damage * (long)useFun.getExDependentValue()) / 10000.0F);
                  long value = (long)((float)(newDamage * (long)linkUseFun.getExDependentValue()) / 10000.0F);
                  if (entity == target) {
                     newDamage -= value;
                     damage -= newDamage;
                     if (source != null) {
                        source.addAttackValue(action, newDamage, event);
                     }

                     doLinkBufShield(action, target, linkEntity, newDamage, (SkillEffectModel)null, false, false, true, event, (byte)0);
                     return damage;
                  }

                  damage -= newDamage;
                  newDamage -= value;
                  if (source != null) {
                     source.addAttackValue(action, newDamage + value, event);
                  }

                  doLinkBufShield(action, target, linkEntity, newDamage, (SkillEffectModel)null, false, false, true, event, (byte)0);
                  doLinkBufShield(action, linkEntity, entity, value, (SkillEffectModel)null, false, false, true, event, (byte)0);
                  return damage;
               }
            }
         }

         useFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (Objects.nonNull(useFun)) {
            long newDamage = (long)((float)(damage * (long)useFun.getExDependentValue()) / 10000.0F);
            if (source != null) {
               source.addAttackValue(action, newDamage, event);
            }

            doLinkBufShield(action, target, linkEntity, newDamage, (SkillEffectModel)null, false, false, true, event, (byte)0);
            damage -= newDamage;
            return damage;
         }
      }

      return damage;
   }

   private static long demoniseBuffHurt(Entity target, long damage) {
      long value = 0L;
      if (target.getBuffManager().isExistSubType((short)92)) {
         TreeSet<Integer> subMap = target.getBuffManager().getSubBuff((short)92);
         int code = (Integer)subMap.last();
         Buff buff = target.getBuffManager().getBuff(code);
         if (Objects.isNull(buff)) {
            return value;
         }

         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (Objects.isNull(useFun)) {
            return value;
         }

         value = (long)((float)(damage * (long)useFun.getUseValue()) / 10000.0F);
      }

      return value;
   }

   private static void demoniseBuffRecoverHp(Action action, Entity source, Entity target, long damage, Event event) {
      if (target.getBuffManager().isExistSubType((short)92) && damage > 0L) {
         float totalRate = (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
         totalRate *= target.getBuffManager().getBeCureValue();
         long reviveValue = (long)((float)damage * totalRate);
         if (!target.isDead()) {
            target.recoverHp(action, target, (SkillEffectModel)null, false, reviveValue, event, true);
         } else {
            damage = target.getReduceValue(source);
         }

         TreeSet<Integer> subMap = target.getBuffManager().getSubBuff((short)92);
         int code = (Integer)subMap.last();
         BuffDemoniseCao buff = (BuffDemoniseCao)target.getBuffManager().getBuff(code);
         buff.recoverHp += damage;
      }

   }

   public static long liveAndDieBuf(Entity source, Entity target, long damage) {
      if (target.getBuffManager().isExistSubType((short)96) && !target.isDead()) {
         TreeSet<Integer> targetSubMap = target.getBuffManager().getSubBuff((short)96);
         int tempCode = (Integer)targetSubMap.last();
         Buff tempBuff = target.getBuffManager().getBuff(tempCode);
         if (tempBuff.caster.isDead()) {
            return damage;
         } else {
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", tempBuff.id);
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.isNull(useFun)) {
               return damage;
            } else {
               List<Entity> tempList = new ArrayList();

               for(Entity friend : target.getPkTeam().getEntityMap().values()) {
                  if (!friend.isDead() && friend.getBuffManager().isExistSubType((short)96) && friend != target) {
                     tempList.add(friend);
                  }
               }

               if (tempList.isEmpty()) {
                  return damage;
               } else {
                  long takeDamage = (long)((float)(damage * (long)useFun.getUseValue()) / 10000.0F);
                  long newDamage = takeDamage / (long)(tempList.size() + 1);

                  for(Entity friend : tempList) {
                     TreeSet<Integer> subMap = friend.getBuffManager().getSubBuff((short)96);
                     int code = (Integer)subMap.last();
                     BuffLiveAndDie buff = (BuffLiveAndDie)friend.getBuffManager().getBuff(code);
                     buff.damage += newDamage;
                     buff.attacker = source;
                  }

                  return damage - takeDamage + newDamage;
               }
            }
         }
      } else {
         return damage;
      }
   }

   public static long hurtTranCure(Action action, Entity source, Entity target, long damage, SkillEffectModel model, boolean filter, Event event) {
      boolean isCall = (Boolean)action.getBlackboard().getSkillParam(2500 + target.getBattlePos(), false);
      if (isCall) {
         action.getBlackboard().removeSkillParam(2500 + target.getBattlePos());
         return 0L;
      } else {
         Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
         if (entity != source) {
            return 0L;
         } else if (HURT_CURE_EXCHANGE_ACTION.contains(action.getType()) && !Objects.isNull(model) && !filter) {
            if (event == null && model.getIsPassive() == 1) {
               for(EffectContent content : source.getSkillManager().getAttachEffect()) {
                  if (content.effectId == model.getId()) {
                     return 0L;
                  }
               }
            }

            Integer convertRate = (Integer)action.getBlackboard().getSkillParam(2800 + source.getBattlePos(), null);
            if (convertRate != null && convertRate > 0) {
               long covertValue = damage * (long)convertRate / 10000L;
               if (covertValue == damage) {
                  action.getBlackboard().addSkillParam(45, true);
               }

               return covertValue;
            } else {
               return 0L;
            }
         } else {
            return 0L;
         }
      }
   }

   public static long hurtCureExchange(Action action, Entity source, Entity target, long damage, SkillEffectModel model, boolean isHurt, boolean filter, Event event) {
      boolean isCall = (Boolean)action.getBlackboard().getSkillParam(2500 + target.getBattlePos(), false);
      if (isCall) {
         action.getBlackboard().removeSkillParam(2500 + target.getBattlePos());
         return 0L;
      } else {
         Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
         if (entity != source) {
            return 0L;
         } else if (HURT_CURE_EXCHANGE_ACTION.contains(action.getType()) && !Objects.isNull(model) && !filter) {
            if (model.getIsPassive() == 1) {
               if (event == null) {
                  for(EffectContent content : source.getSkillManager().getAttachEffect()) {
                     if (content.effectId == model.getId()) {
                        return 0L;
                     }
                  }
               } else {
                  List<Integer> eventTypeEffect = source.getSkillManager().getEventTypeEffect();
                  if (eventTypeEffect == null || !eventTypeEffect.contains(model.getId())) {
                     return 0L;
                  }
               }
            }

            Integer convertRate;
            if (isHurt) {
               convertRate = (Integer)action.getBlackboard().getSkillParam(2300 + source.getBattlePos(), null);
            } else {
               convertRate = (Integer)action.getBlackboard().getSkillParam(2400 + source.getBattlePos(), null);
            }

            if (convertRate != null && convertRate > 0) {
               long covertValue = damage * (long)convertRate / 10000L;
               if (covertValue == damage) {
                  action.getBlackboard().addSkillParam(45, true);
               }

               return covertValue;
            } else {
               return 0L;
            }
         } else {
            return 0L;
         }
      }
   }

   public static void doHurtToCure(Action action, Entity source, Entity target, long value, SkillEffectModel model, Event event) {
      if (value > 0L) {
         action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
         target.recoverHp(action, source, model, false, value, event, true);
      }
   }

   public static void doCureToHurt(Action action, Entity source, Entity target, long damage, SkillEffectModel model, Event event) {
      if (damage > 0L) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", source.getId());
         int type = heroModel.getAtkType();
         if (type == 1) {
            damage = DamageFunc.getPhyAttack(action, damage, source, target);
         } else {
            damage = DamageFunc.getMagicAttack(action, damage, source, target);
         }

         damage = (long)((float)damage * DamageFunc.getNationDamage(target));
         action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
         action.getBlackboard().addSkillParam(2700 + target.getBattlePos(), true);
         doShield(action, source, target, damage, model, false, false, event, (byte)0);
      }
   }

   private static long offsetHurtBuff(Action action, Entity source, Entity target, long damage, SkillEffectModel model, Event event) {
      long value = 0L;
      if ((action.getType() == 4 || action.getType() == 43) && !Objects.isNull(model)) {
         if (target.getBuffManager().isExistSubType((short)102)) {
            List<Entity> targets = (List)action.getBlackboard().getSkillParam(1400 + source.getBattlePos());
            if (targets == null || targets.size() == 0) {
               return value;
            }

            Entity offsetHurtTarget = (Entity)action.getBlackboard().getSkillParam(2600 + source.getBattlePos());
            if (offsetHurtTarget != null && targets.contains(offsetHurtTarget)) {
               return value;
            }

            TreeSet<Integer> subSet = target.getBuffManager().getSubBuff((short)102);
            int code = (Integer)subSet.first();
            Buff buff = target.getBuffManager().getBuff(code);
            if (Objects.isNull(buff)) {
               return value;
            }

            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.isNull(useFun)) {
               return value;
            }

            if ((float)damage > (float)(target.getBaseProperty(useFun.getUseId()) * (long)useFun.getUseValue()) / 10000.0F) {
               action.getBlackboard().addSkillParam(2600 + source.getBattlePos(), target);
               target.getBuffManager().deleteBuffByCode(action, code, false);
               int buffId = useFun.getExDependentValue();
               BuffModel relateModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buffId);
               HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)target.getBuffManager().getPriorityBuffsMap().get(relateModel.getType());
               if (Objects.nonNull(idMaps)) {
                  TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(buffId);
                  if (Objects.nonNull(codeMap) && !codeMap.isEmpty()) {
                     code = (Integer)codeMap.firstKey();
                     target.getBuffManager().deleteBuffByCode(action, code, false);
                  }
               }

               useFun = (BuffUseFun)buffModel.getFuncs().get(2);
               value = (long)((float)(damage * (long)useFun.getUseValue()) / 10000.0F);
            }
         }

         return value;
      } else {
         return value;
      }
   }

   public static void doLinkBufShield(Action action, Entity source, Entity target, long damage, SkillEffectModel model, boolean isCrit, boolean apportion, boolean againApportion, Event event, byte specialDamageMsgEffect) {
      if (damage < 0L) {
         logger.info("伤害值必须是正数");
      } else if (!target.getStateManager().checkState((short)25)) {
         if (target.entityType == 0 && damage != 0L) {
            if (againApportion) {
               damage = liveAndDieBuf(source, target, damage);
            }

            if (target != null) {
               target.addDamageValue(damage);
            }

            HashSet<Buff> delSet = new HashSet();
            long newValue = -target.getBuffManager().modifyBaseProperty(action, -damage, delSet);

            for(Buff buffCode : delSet) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buffCode.id);
               BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
               if (fun != null && fun.getUseFunc() == 6) {
                  TreeSet<Integer> xuanWuBuffSet = target.getBuffManager().getSubBuff((short)71);
                  if (xuanWuBuffSet != null && xuanWuBuffSet.size() > 0) {
                     int xuanWuCode = (Integer)xuanWuBuffSet.first();
                     Buff xuanWuBuff = target.getBuffManager().getBuff(xuanWuCode);
                     BuffModel xuanWuModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", xuanWuBuff.id);
                     BuffUseFun buffUseFun = (BuffUseFun)xuanWuModel.getFuncs().get(2);
                     long value = (long)((float)(xuanWuBuff.caster.getBaseProperty(2) * (long)buffUseFun.getUseValue()) / 10000.0F);
                     source.modifyHp(action, -value, event, xuanWuBuff.caster);
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setEffectType(6);
                     effectBuilder.setEffectId(0);
                     effectBuilder.setEffectValue(value);
                     effectBuilder.setTargetBattlePos(source.getBattlePos());
                     effectBuilder.setFinalValue(source.getBaseProperty(99));
                     effectBuilder.setCrit(0);
                     effectBuilder.setEffectSetId(0);
                     action.getBlackboard().addBattleEffect(effectBuilder);
                     if (source.isDead()) {
                        effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setTargetBattlePos(source.getBattlePos());
                        effectBuilder.setEffectType(9);
                        effectBuilder.setEffectValue(1L);
                        effectBuilder.setFinalValue(source.getBaseProperty(99));
                        action.getBlackboard().addBattleEffect(effectBuilder);
                        putDeadEvent(action, xuanWuBuff.caster, source, event);
                     }
                  }
               }

               target.getBuffManager().deleteBuffByCode(action, buffCode.code, true, false, 0, true);
            }

            byte damageMsgEffect = 6;
            if (specialDamageMsgEffect != 0) {
               damageMsgEffect = specialDamageMsgEffect;
            }

            if (newValue == 0L) {
               BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectAbsorbBuilder.setTargetBattlePos(target.getBattlePos());
               effectAbsorbBuilder.setEffectType(2);
               effectAbsorbBuilder.setCrit(apportion ? 1 : 0);
               effectAbsorbBuilder.setEffectValue(Math.abs(damage));
               effectAbsorbBuilder.setEffectId(model == null ? 0 : model.getId());
               effectAbsorbBuilder.setEffectSetId(model == null ? 0 : model.getId());
               action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
            } else if (newValue != damage) {
               target.modifyHp(action, -newValue, event, source);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               if (apportion) {
                  effectBuilder.setEffectType(23);
               } else {
                  effectBuilder.setEffectType(damageMsgEffect);
               }

               effectBuilder.setEffectId(model == null ? 0 : model.getId());
               effectBuilder.setEffectValue(newValue);
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               effectBuilder.setCrit(isCrit ? 1 : 0);
               effectBuilder.setEffectSetId(model == null ? 0 : model.getId());
               effectBuilder.setFinalValue(target.getBaseProperty(99));
               action.getBlackboard().addBattleEffect(effectBuilder);
               BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectAbsorbBuilder.setEffectType(2);
               effectAbsorbBuilder.setCrit(apportion ? 1 : 0);
               effectAbsorbBuilder.setEffectValue(Math.abs(damage - newValue));
               effectAbsorbBuilder.setTargetBattlePos(target.getBattlePos());
               effectAbsorbBuilder.setEffectSetId(model == null ? 0 : model.getId());
               action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
            } else {
               target.modifyHp(action, -newValue, event, source);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               if (apportion) {
                  effectBuilder.setEffectType(23);
               } else {
                  effectBuilder.setEffectType(damageMsgEffect);
               }

               effectBuilder.setEffectId(model == null ? 0 : model.getId());
               effectBuilder.setEffectValue(newValue);
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               effectBuilder.setFinalValue(target.getBaseProperty(99));
               effectBuilder.setCrit(isCrit ? 1 : 0);
               effectBuilder.setEffectSetId(model == null ? 0 : model.getId());
               action.getBlackboard().addBattleEffect(effectBuilder);
               if (Debug.isDebug) {
                  Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
                  if (Objects.nonNull(attacker)) {
                     BattleTestMgr.analyseBuffEffect(damageMsgEffect, attacker.getId(), model == null ? 0 : attacker.getId(), (long)((int)newValue));
                  }
               }
            }

            if (target.isDead()) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               effectBuilder.setEffectType(9);
               effectBuilder.setEffectValue(1L);
               effectBuilder.setFinalValue(target.getBaseProperty(99));
               action.getBlackboard().addBattleEffect(effectBuilder);
               putDeadEvent(action, source, target, event);
               target.addDeadTimesAndClear(action);
            }

         }
      }
   }

   public static void putLiveAndDieApportionEvent(Action action, Event event) {
      Event liveAndDieEvent = new Event((short)38, action, event);
      action.getScene().getEventListener().pushEvent(liveAndDieEvent);
      Event liveAndDieEndEvent = new Event((short)39, action, event);
      action.getScene().getEventListener().pushEvent(liveAndDieEndEvent);
   }

   static {
      HURT_CURE_EXCHANGE_ACTION.add((byte)4);
      HURT_CURE_EXCHANGE_ACTION.add((byte)41);
      HURT_CURE_EXCHANGE_ACTION.add((byte)43);
      HURT_CURE_EXCHANGE_ACTION.add((byte)46);
      HURT_CURE_EXCHANGE_ACTION.add((byte)48);
      HURT_CURE_EXCHANGE_ACTION.add((byte)50);
      HURT_CURE_EXCHANGE_ACTION.add((byte)51);
   }
}
