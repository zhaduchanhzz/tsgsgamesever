package com.gzbz.battle.action;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.conditionProperty.SelectorParam;
import com.gzbz.battle.effectFunc.EffectFunc;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.EffectContent;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.entity.EntityState;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.pkteam.PropertyComparator;
import com.gzbz.battle.pkteam.TargetSelector;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkillUtil implements Serializable {
   static Logger logger = LoggerFactory.getLogger(SkillUtil.class);
   public static final byte EFFECT_ON_TIME = -1;
   public static final byte EFFECT_POST = 0;
   public static final byte EFFECT_PRE = 1;
   public static final byte SLOT_PRE = -1;
   public static final byte SLOT_POST = -2;

   public static void doSkill(Action action, int skillId, Event event) {
      SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPool().getEntity("skill", skillId);
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
      action.getBlackboard().addSkillParam(17, skillModel);
      action.getBlackboard().addBattleEffects(-1, BattleMsg.S2C_Battle_Effects.newBuilder());
      doExEffect((byte)1, action, skillModel, entity.getSkillManager().getAttachEffect(), false, event);

      for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
         int slot = (Integer)entry.getKey();
         action.getBlackboard().addSkillParam(16, slot);
         int effectId = (Integer)entry.getValue();
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
         if (skillEffectModel != null && skillEffectModel.getIsPassive() != 1) {
            doEffect(action, skillEffectModel, event, true);
         }
      }

      action.getBlackboard().addBattleEffects(-2, BattleMsg.S2C_Battle_Effects.newBuilder());
      doExEffect((byte)0, action, skillModel, entity.getSkillManager().getAttachEffect(), false, event);
   }

   public static void doSkill(Action action, Event event) {
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
      EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
      if (entitySkill == null) {
         logger.error("未找到当前的技能");
      } else {
         int skillId = entitySkill.getSkillId();
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPool().getEntity("skill", skillId);
         if (skillModel == null) {
            logger.error("无法找到技能id:" + skillId);
         } else if (!entity.isDead() && !entity.getStateManager().checkState((short)21) && !entity.getStateManager().checkState((short)22) && !entity.getStateManager().checkState((short)25)) {
            action.getScene().getPKTeam((byte)0).resetDirty();
            action.getScene().getPKTeam((byte)1).resetDirty();
            action.getBlackboard().addSkillParam(17, skillModel);
            if (skillModel.getMainEffect() != 0) {
               EffectContent replaceContent = entitySkill.getReplaceId(skillModel.getMainEffect());
               List<Entity> targets = null;
               action.getBlackboard().addSkillParam(16, skillModel.getMainEffect());
               SkillEffectModel mainEffectEffect;
               if (replaceContent != null) {
                  mainEffectEffect = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", replaceContent.effectId);
                  targets = selectTargets(action, mainEffectEffect);
                  if (mainEffectEffect.getIsPre() == -1 && (targets == null || targets.size() == 0)) {
                     mainEffectEffect = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)skillModel.getEffects().get(skillModel.getMainEffect()));
                     targets = selectTargets(action, mainEffectEffect);
                  }
               } else {
                  mainEffectEffect = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)skillModel.getEffects().get(skillModel.getMainEffect()));
                  if (mainEffectEffect == null) {
                     logger.error("技能{},无法找到主效果:{}", skillModel.getId(), skillModel.getMainEffect());
                     return;
                  }

                  targets = selectTargets(action, mainEffectEffect);
               }

               if (Objects.isNull(mainEffectEffect)) {
                  return;
               }

               if (Objects.isNull(targets) || targets.size() == 0) {
                  if (mainEffectEffect.getTargetType() != 0 || !skillModel.getEffects().containsKey(skillModel.getMainEffect() - 1)) {
                     return;
                  }

                  int followId = (Integer)skillModel.getEffects().get(skillModel.getMainEffect() - 1);
                  action.getBlackboard().addSkillParam(16, skillModel.getMainEffect() - 1);
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", followId);
                  if (Objects.isNull(skillEffectModel)) {
                     return;
                  }

                  targets = selectTargets(action, skillEffectModel);
                  if (Objects.isNull(targets) || targets.isEmpty()) {
                     return;
                  }
               }
            }

            action.getBlackboard().addBattleEffects(-1, BattleMsg.S2C_Battle_Effects.newBuilder());
            if (!entity.getStateManager().checkState((short)1) && !entity.getStateManager().checkState((short)11) && !entity.getStateManager().checkState((short)18) && !entity.getStateManager().checkState((short)21) || skillModel.getForce() != 0) {
               damageAndCureExchange(action, entity, entitySkill, skillModel);
               hurt2Cure(action, entity, entitySkill, skillModel);
               doExEffect((byte)1, action, skillModel, entitySkill.getAttachEffect(), false, event);
               doExEffect((byte)1, action, skillModel, entity.getSkillManager().getAttachEffect(), false, event);

               for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
                  int curSlot = (Integer)entry.getKey();
                  action.getBlackboard().addSkillParam(16, curSlot);
                  action.getBlackboard().addSkillParam(17, skillModel);
                  action.getBlackboard().addSkillParam(1, entity);
                  int effectId = (Integer)entry.getValue();
                  EffectContent replaceContent = entitySkill.getReplaceId(curSlot);
                  if (replaceContent == null) {
                     SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
                     if (skillEffectModel == null || skillEffectModel.getIsPassive() == 1 || skillEffectModel.getEventType().size() != 0 || !EffectFuncProcessor.funcMap.containsKey(skillEffectModel.getFunc())) {
                        continue;
                     }

                     doEffect(action, skillEffectModel, event, true);
                  } else {
                     SkillEffectModel replaceSkillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", replaceContent.effectId);
                     if (replaceSkillEffectModel.getIsPre() == -1) {
                        BattleMsg.S2C_Battle_Effects.Builder builder = null;
                        SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
                        boolean newBuilder = true;
                        if (skillEffectModel != null && skillEffectModel.getIsPassive() != 1 && skillEffectModel.getEventType().size() == 0 && EffectFuncProcessor.funcMap.containsKey(skillEffectModel.getFunc())) {
                           doEffect(action, skillEffectModel, event, true);
                           newBuilder = false;
                        }

                        if (Objects.nonNull(replaceSkillEffectModel) && (replaceSkillEffectModel.getTriggerTime() == 0 || replaceContent.useTimes < replaceSkillEffectModel.getTriggerTime()) && EffectFuncProcessor.funcMap.containsKey(replaceSkillEffectModel.getFunc())) {
                           ++replaceContent.useTimes;
                           doEffect(action, replaceSkillEffectModel, newBuilder, event, false);
                        }
                     } else if (replaceSkillEffectModel.getTriggerTime() != 0 && replaceContent.useTimes >= replaceSkillEffectModel.getTriggerTime()) {
                        SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
                        if (skillEffectModel == null || skillEffectModel.getIsPassive() == 1 || skillEffectModel.getEventType().size() != 0 || !EffectFuncProcessor.funcMap.containsKey(skillEffectModel.getFunc())) {
                           continue;
                        }

                        doEffect(action, skillEffectModel, event, true);
                     } else {
                        ++replaceContent.useTimes;
                        if (replaceSkillEffectModel == null || replaceSkillEffectModel.getEventType().size() != 0 || !EffectFuncProcessor.funcMap.containsKey(replaceSkillEffectModel.getFunc())) {
                           continue;
                        }

                        doEffect(action, replaceSkillEffectModel, event, true);
                     }
                  }

                  if (curSlot == skillModel.getMainEffect()) {
                     if (Debug.isDebug && !action.getBlackboard().checkBattlePos()) {
                        logger.info("主效果没有战斗位置!!!{}，", skillModel.getId());
                     }

                     List<Entity> targets = (List)action.getBlackboard().getSkillParam(10);
                     boolean isMissed = (Boolean)action.getBlackboard().getSkillParam(38);
                     if (action.getType() != 60) {
                        Event skillEvent = new Event((short)6, action, event);
                        skillEvent.addParam(5, entitySkill);
                        skillEvent.addParam(2, entity);
                        skillEvent.addParam(12, action);
                        skillEvent.addParam(14, targets);
                        skillEvent.addParam(20, isMissed);
                        action.getScene().getEventListener().pushEvent(skillEvent);
                        Event skillEventEndEvent = new Event((short)27, action, event);
                        skillEventEndEvent.addParam(5, entitySkill);
                        skillEventEndEvent.addParam(2, entity);
                        skillEventEndEvent.addParam(12, action);
                        skillEventEndEvent.addParam(14, targets);
                        skillEventEndEvent.addParam(20, isMissed);
                        action.getScene().getEventListener().pushEvent(skillEventEndEvent);
                     }
                  }

                  boolean isUse = (Boolean)action.getBlackboard().getSkillParam(41, false);
                  if (isUse) {
                     List<Entity> targets = (List)action.getBlackboard().getSkillParam(54);
                     Event skillEffectEvent = new Event((short)36, action, event);
                     skillEffectEvent.addParam(5, entitySkill);
                     skillEffectEvent.addParam(2, entity);
                     skillEffectEvent.addParam(12, action);
                     skillEffectEvent.addParam(14, targets);
                     action.getScene().getEventListener().pushEvent(skillEffectEvent);
                  }

                  action.getBlackboard().removeSkillParam(41);
                  action.getBlackboard().removeSkillParam(1800 + entity.getBattlePos());
                  action.getBlackboard().removeSkillParam(54);
               }

               long damage = (Long)action.getBlackboard().getSkillParam(400 + entity.getBattlePos(), 0L);
               if (damage != 0L) {
                  Event attackEvent = new Event((short)47, action, event);
                  attackEvent.addParam(2, entity);
                  attackEvent.addParam(5, entitySkill);
                  action.getScene().getEventListener().pushEvent(attackEvent);
               }

               Set<Entity> set = (Set)action.getBlackboard().getSkillParam(23);
               if (Objects.nonNull(set) && set.size() > 0) {
                  Event onceHurtEvent = new Event((short)35, action, event);
                  onceHurtEvent.addParam(2, entity);
                  onceHurtEvent.addParam(5, entitySkill);
                  onceHurtEvent.addParam(14, new ArrayList(set));
                  action.getScene().getEventListener().pushEvent(onceHurtEvent);
                  ArrayList<Entity> targetList = new ArrayList(set);
                  Event hurtEvent = new Event((short)15, action, event);
                  hurtEvent.addParam(2, entity);
                  hurtEvent.addParam(5, entitySkill);
                  hurtEvent.addParam(14, new ArrayList(set));

                  for(Entity spTarget : targetList) {
                     hurtEvent.addParam(3, spTarget);
                     action.getScene().getEventListener().pushEvent(hurtEvent);
                     spTarget.resetHurtTimes();
                  }

                  Event hurtEventEndEvent = new Event((short)32, action, event);
                  hurtEventEndEvent.addParam(2, entity);
                  hurtEventEndEvent.addParam(5, entitySkill);
                  hurtEventEndEvent.addParam(14, new ArrayList(set));

                  for(Entity spTarget : targetList) {
                     hurtEventEndEvent.addParam(3, spTarget);
                     action.getScene().getEventListener().pushEvent(hurtEventEndEvent);
                  }
               }

               action.getBlackboard().removeSkillParam(24);
               action.getBlackboard().addBattleEffects(-2, BattleMsg.S2C_Battle_Effects.newBuilder());
               doExEffect((byte)0, action, skillModel, entitySkill.getAttachEffect(), false, event);
               doExEffect((byte)0, action, skillModel, entity.getSkillManager().getAttachEffect(), false, event);
               EffectUtil.putLiveAndDieApportionEvent(action, event);
               action.getBlackboard().removeSkillParam(2300 + entity.getBattlePos());
               action.getBlackboard().removeSkillParam(2400 + entity.getBattlePos());
               action.getBlackboard().removeSkillParam(2800 + entity.getBattlePos());
               action.getScene().getPKTeam((byte)0).sendStatistics(action);
               action.getScene().getPKTeam((byte)1).sendStatistics(action);

               for(Entity allEntity : action.getScene().getPosEntity().values()) {
                  allEntity.clearRoundDamage();
               }

            }
         }
      }
   }

   public static LinkedList<BattleMsg.S2C_Battle_Effects.Builder> doExEffect(byte isPre, Action action, SkillModel skillModel, List<EffectContent> effectContentList, boolean newBuilder, Event event) {
      for(EffectContent content : effectContentList) {
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", content.effectId);
         if (skillEffectModel != null && EffectFuncProcessor.funcMap.containsKey(skillEffectModel.getFunc()) && skillEffectModel.getIsPre() == isPre && (!Objects.nonNull(content.skillModel) || content.skillModel == skillModel)) {
            doEffect(action, skillEffectModel, newBuilder, event, true);
         }
      }

      return null;
   }

   public static List<Entity> selectTarget(Action action, SkillEffectModel skillEffectModel) {
      int slot = (Integer)action.getBlackboard().getSkillParam(16, 0);
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      SkillModel skillModel = (SkillModel)action.getBlackboard().getSkillParam(17);
      EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
      List<Entity> targets;
      if (skillEffectModel.getSelectType() != 0) {
         short type = 0;
         int num = 0;
         if (attacker != null && entitySkill != null) {
            SelectorParam param = attacker.getConditionPropertyManager().getReplaceSelect(entitySkill.index, slot);
            if (param != null && Math.random() * (double)10000.0F < (double)param.rate) {
               type = param.type;
               num = param.num;
            }
         }

         if (type == 0) {
            type = skillEffectModel.getSelectType();
            num = skillEffectModel.getSelectNum();
         }

         if (attacker.getStateManager().checkState((short)12) && skillModel.getForce() == 0) {
            ArrayList<Byte> randPos = new ArrayList();

            for(Entity entity : attacker.getScene().getPosEntity().values()) {
               if (entity != attacker && TargetSelector.isSelect(entity)) {
                  randPos.add(entity.getBattlePos());
               }
            }

            targets = new ArrayList();
            if (randPos.size() == 0) {
               return targets;
            }

            Entity targetEntity = (Entity)attacker.getScene().getPosEntity().get(randPos.get(RandomUtil.randInt(randPos.size())));
            targets.add(targetEntity);
         } else {
            targets = attacker.getScene().selectTarget(action, attacker, skillEffectModel.getTargetType(), type, num, skillEffectModel.getSelectParam());
         }

         List<Entity> allEnemyTargets = (List)action.getBlackboard().getSkillParam(7, (Object)null);
         List<Entity> allFriendTargets = (List)action.getBlackboard().getSkillParam(8, (Object)null);
         if (allEnemyTargets == null) {
            allEnemyTargets = new ArrayList();
         }

         if (allFriendTargets == null) {
            allFriendTargets = new ArrayList();
         }

         for(Entity entity : targets) {
            if (entity.getForce() == attacker.getForce()) {
               allFriendTargets.add(entity);
            } else {
               allEnemyTargets.add(entity);
            }
         }

         action.getBlackboard().addSkillParam(7, allEnemyTargets);
         action.getBlackboard().addSkillParam(8, allFriendTargets);
         if (targets.size() > 0) {
            action.getBlackboard().addSkillParam(2, targets);
         }
      } else {
         targets = (List)action.getBlackboard().getSkillParam(2, (Object)null);
         if (skillEffectModel.getFunc() == 8 && targets != null) {
            boolean self = false;

            for(Entity t : targets) {
               if (t.getForce() == attacker.getForce()) {
                  self = true;
                  break;
               }
            }

            if (self) {
               targets = (List)action.getBlackboard().getSkillParam(10);
            }
         }
      }

      return targets;
   }

   public static List<Entity> selectTargets(Action action, SkillEffectModel skillEffectModel) {
      Entity sourceEntity = (Entity)action.getBlackboard().getSkillParam(1);
      int slot = (Integer)action.getBlackboard().getSkillParam(16, 0);
      SkillModel skillModel = (SkillModel)action.getBlackboard().getSkillParam(17);
      if (sourceEntity != null && skillModel != null) {
         List<Entity> targets;
         if (action.type == 42 && skillEffectModel.getTargetType() == 2) {
            targets = new ArrayList();
            Entity entity = (Entity)action.getBlackboard().getSkillParam(9);
            if (Objects.nonNull(entity) && entity.isAlive()) {
               targets.add(entity);
               action.getBlackboard().addSkillParam(2, targets);
            } else {
               targets = selectTarget(action, skillEffectModel);
            }
         } else if (action.type == 46 && skillEffectModel.getTargetType() == 2 && slot == skillModel.getMainEffect()) {
            ArrayList tmp = (ArrayList)action.getBlackboard().getSkillParam(31);
            if (tmp == null || tmp.size() == 0) {
               return null;
            }

            String paramStr = (String)action.getBlackboard().getSkillParam(32);
            if (paramStr == null) {
               return null;
            }

            int paramInt = Integer.parseInt(paramStr);
            targets = new ArrayList(tmp);

            for(int i = targets.size() - 1; i > -1; --i) {
               Entity target = (Entity)targets.get(i);
               if (target.getForce() == sourceEntity.getForce() || target.isDead() || target.getBaseProperty(99) * 10000L / target.getBaseProperty(1) > (long)paramInt) {
                  targets.remove(i);
               }
            }

            if (targets.size() == 0) {
               return null;
            }

            Collections.sort(targets, new PropertyComparator(99, true));
            Entity first = (Entity)targets.get(0);
            if (targets.size() > skillEffectModel.getSelectNum()) {
               targets = targets.subList(0, skillEffectModel.getSelectNum());
            }

            action.getBlackboard().addSkillParam(2, targets);
         } else if (sourceEntity.getStateManager().checkState((short)16) && skillModel != null && slot == skillModel.getMainEffect() && skillModel.getForce() == 0) {
            EntityState entityState = sourceEntity.getStateManager().getState((short)16);
            Buff buff = sourceEntity.getBuffManager().getBuff(entityState.parentCode);
            if (Objects.nonNull(buff) && Objects.nonNull(buff.caster) && buff.caster.isAlive()) {
               BattlePKTeam casterTeam = buff.caster.getScene().getPKTeam(buff.caster.getForce());
               if (casterTeam != null && casterTeam.getEntityMap() != null && casterTeam.getEntityMap().containsValue(buff.caster)) {
                  targets = new ArrayList();
                  targets.add(buff.caster);
               } else {
                  targets = selectTarget(action, skillEffectModel);
               }
            } else {
               targets = selectTarget(action, skillEffectModel);
            }
         } else {
            targets = selectTarget(action, skillEffectModel);
         }

         return targets;
      } else {
         return null;
      }
   }

   public static BattleMsg.S2C_Battle_Effects.Builder doEffect(Action action, SkillEffectModel skillEffectModel, boolean newBuilder, Event event, boolean insertTime) {
      int slot = (Integer)action.getBlackboard().getSkillParam(16);
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker.getScene() == null) {
         return null;
      } else {
         SkillModel skillModel = (SkillModel)action.getBlackboard().getSkillParam(17);
         List<Entity> targets = selectTargets(action, skillEffectModel);
         if (!Objects.isNull(targets) && targets.size() != 0) {
            for(Entity target : attacker.getConditionPropertyManager().getAddTargets(action, skillEffectModel.getId())) {
               if (!targets.contains(target)) {
                  targets.add(target);
               }
            }

            if (slot == skillModel.getMainEffect() && !(Boolean)action.getBlackboard().getSkillParam(27, false)) {
               List<Entity> lastSlotTargets = (List)action.getBlackboard().getSkillParam(10);
               if (lastSlotTargets != null) {
                  lastSlotTargets.addAll(targets);
               } else {
                  action.getBlackboard().addSkillParam(10, targets);
               }
            }

            EffectFunc effectFunc = EffectFuncProcessor.getFunc(skillEffectModel.getFunc());
            if (Objects.isNull(effectFunc)) {
               return null;
            } else {
               BattleMsg.S2C_Battle_Effects.Builder builder;
               if (newBuilder) {
                  builder = BattleMsg.S2C_Battle_Effects.newBuilder();
                  action.getBlackboard().addBattleEffects(slot, builder);
               } else {
                  builder = action.getBlackboard().getCurEffects();
               }

               boolean isMissed = false;
               action.getBlackboard().addSkillParam(1400 + attacker.getBattlePos(), targets);
               HashMap<Entity, Integer> missBuff = new HashMap();
               boolean mustHit = false;
               TreeSet<Integer> hitSet = attacker.getBuffManager().getSubBuff((short)80);
               if (hitSet != null && hitSet.size() > 0) {
                  Integer code = (Integer)hitSet.first();
                  Buff buff = attacker.getBuffManager().getBuff(code);
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                  if (buffModel != null && hitSet.size() >= buffModel.getCombine()) {
                     mustHit = true;
                  }
               }

               boolean atkerHitMark = (Boolean)action.getBlackboard().getSkillParam(2100 + attacker.getBattlePos(), false);
               action.getBlackboard().addSkillParam(57, targets);

               for(int time = 1; time <= skillEffectModel.getFuncTimes(); ++time) {
                  if (event == null && insertTime) {
                     action.getBlackboard().addSkillParam(24, time);
                  }

                  if (slot == skillModel.getMainEffect() && time == 1) {
                     EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
                     Event preMainEvent = new Event((short)49, action, event);
                     preMainEvent.addParam(5, entitySkill);
                     preMainEvent.addParam(2, attacker);
                     preMainEvent.addParam(12, action);
                     preMainEvent.addParam(14, targets);
                     attacker.getScene().getEventListener().pushEvent(preMainEvent);
                  }

                  for(int i = 0; i < targets.size(); ++i) {
                     action.getBlackboard().addSkillParam(19, skillEffectModel);
                     Entity target = (Entity)targets.get(i);
                     action.getBlackboard().addSkillParam(3, target);
                     action.getBlackboard().addSkillParam(20, i);
                     boolean hitMark = (Boolean)action.getBlackboard().getSkillParam(1900 + target.getBattlePos(), false);
                     if (skillEffectModel.getHit() > 0 && !mustHit && !hitMark && !atkerHitMark) {
                        boolean isHit = calcProperty(action, attacker, 8, target, 9);
                        if (slot != -1 && slot != -2 && isHit) {
                           TreeSet<Integer> buffCode = target.getBuffManager().getSubBuff((short)69);
                           if (buffCode != null && buffCode.size() > 0) {
                              isHit = false;
                              missBuff.put(target, buffCode.first());
                           }
                        }

                        action.getBlackboard().addSkillParam(100 + target.getBattlePos(), isHit);
                        if (!isMissed && !isHit) {
                           isMissed = true;
                        }
                     }

                     if (slot == skillModel.getMainEffect() && time == 1) {
                        EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
                        Event preMainEvent = new Event((short)24, action, event);
                        preMainEvent.addParam(5, entitySkill);
                        preMainEvent.addParam(2, attacker);
                        preMainEvent.addParam(12, action);
                        preMainEvent.addParam(3, target);
                        attacker.getScene().getEventListener().pushEvent(preMainEvent);
                     }

                     boolean isUse = EffectFuncProcessor.doFunc(action, attacker, target, targets, skillEffectModel, event);
                     if (slot == skillModel.getMainEffect()) {
                        if (skillEffectModel.getId() == (Integer)skillModel.getEffects().get(slot)) {
                           builder.addBattlePos(target.getBattlePos());
                        } else if (skillEffectModel.getId() != (Integer)skillModel.getEffects().get(slot) && isUse) {
                           builder.addBattlePos(target.getBattlePos());
                        }
                     } else {
                        builder.addBattlePos(target.getBattlePos());
                     }

                     if (slot == skillModel.getMainEffect() && time == 1) {
                        EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
                        Event mainEvent = new Event((short)14, action, event);
                        mainEvent.addParam(5, entitySkill);
                        mainEvent.addParam(2, attacker);
                        mainEvent.addParam(12, action);
                        mainEvent.addParam(3, target);
                        attacker.getScene().getEventListener().pushEvent(mainEvent);
                     }

                     if (slot == skillModel.getMainEffect() && !(Boolean)action.getBlackboard().getSkillParam(27, false) && skillEffectModel.getIsPre() == -1 && !isUse && !insertTime) {
                        List<Entity> lastSlotTargets = (List)action.getBlackboard().getSkillParam(10);
                        if (lastSlotTargets != null) {
                           lastSlotTargets.remove(target);
                        }
                     }

                     if (isUse) {
                        action.getBlackboard().addSkillParam(41, isUse);
                     }
                  }

                  action.getBlackboard().removeSkillParam(2600 + attacker.getBattlePos());
                  action.getBlackboard().removeSkillParam(3000 + ((Entity)targets.get(0)).getBattlePos());
               }

               for(Map.Entry<Entity, Integer> entry : missBuff.entrySet()) {
                  Entity entity = (Entity)entry.getKey();
                  int code = (Integer)entry.getValue();
                  Buff buff = entity.getBuffManager().getBuff(code);
                  if (buff == null) {
                     logger.error("无法查找到:{},{}，的buff:{}", new Object[]{entity.getBattlePos(), entity.getId(), buff.id});
                  } else {
                     ++buff.curUseTime;
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                     if (buff.curUseTime >= buffModel.getUseTimes()) {
                        entity.getBuffManager().deleteBuffByCode(action, code, true);
                     }
                  }
               }

               if (slot == skillModel.getMainEffect() && event == null) {
                  HashSet mainEffects = (HashSet)action.getBlackboard().getSkillParam(37);
                  if (mainEffects == null) {
                     mainEffects = new HashSet();
                     action.getBlackboard().addSkillParam(37, mainEffects);
                  }

                  mainEffects.add(skillEffectModel);
               }

               action.getBlackboard().removeSkillParam(1400 + attacker.getBattlePos());
               action.getBlackboard().addSkillParam(22, targets);
               action.getBlackboard().addSkillParam(38, isMissed);
               boolean isUse = (Boolean)action.getBlackboard().getSkillParam(41, false);
               if (isUse) {
                  List<Entity> lastEffectTargets = (List)action.getBlackboard().getSkillParam(54);
                  if (lastEffectTargets != null) {
                     lastEffectTargets.addAll(targets);
                  } else {
                     List<Entity> curTargets = new ArrayList(targets);
                     action.getBlackboard().addSkillParam(54, curTargets);
                  }
               }

               return builder;
            }
         } else {
            return null;
         }
      }
   }

   public static BattleMsg.S2C_Battle_Effects.Builder doEffect(Action action, SkillEffectModel skillEffectModel, Event event, boolean insertTime) {
      return doEffect(action, skillEffectModel, true, event, insertTime);
   }

   public static boolean calcCrit(Action action, Entity sourceEntity, int sourceProperty, Entity targetEntity, int targetProperty) {
      long rate = sourceEntity.getBattleProperty(action, sourceProperty) - targetEntity.getBattleProperty(action, targetProperty) - targetEntity.getBattleProperty(action, 20);
      if (rate > 0L) {
         return (long)RandomUtil.randTenThousand() < rate;
      } else {
         return false;
      }
   }

   public static boolean calcProperty(Action action, Entity sourceEntity, int sourceProperty, Entity targetEntity, int targetProperty) {
      long rate = sourceEntity.getBattleProperty(action, sourceProperty) - targetEntity.getBattleProperty(action, targetProperty);
      if (rate > 0L) {
         return (long)RandomUtil.randTenThousand() < rate;
      } else {
         return false;
      }
   }

   public static boolean damageAndCureExchange(Action action, Entity source, EntitySkill entitySkill, SkillModel skillModel) {
      if (source.getBuffManager().isExistSubType((short)101)) {
         if (!EffectUtil.HURT_CURE_EXCHANGE_ACTION.contains(action.getType())) {
            return false;
         }

         if (action.getType() == 41) {
            KeepAtkAction keepAtkAction = (KeepAtkAction)action;
            Event event = keepAtkAction.getEvent();
            if (event != null && event.getParam(2) != source) {
               return false;
            }
         }

         SkillEffectModel mainEffectEffect = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)skillModel.getEffects().get(skillModel.getMainEffect()));
         EffectContent replaceContent = entitySkill.getReplaceId(skillModel.getMainEffect());
         if (replaceContent != null) {
            SkillEffectModel replaceSkillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", replaceContent.effectId);
            if (replaceSkillEffectModel.getIsPre() != -1 && replaceSkillEffectModel.getTriggerTime() == 0) {
               mainEffectEffect = replaceSkillEffectModel;
            }
         }

         if (Objects.isNull(mainEffectEffect)) {
            return false;
         }

         TreeSet<Integer> subCode = source.getBuffManager().getSubBuff((short)101);
         int code = (Integer)subCode.last();
         Buff buff = source.getBuffManager().getBuff(code);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
         if (BattleMisc.isHurtFun(mainEffectEffect.getFunc())) {
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.isNull(useFun)) {
               return false;
            }

            int rate = useFun.getUseValue();
            if (RandomUtil.randTenThousand() < rate) {
               action.getBlackboard().addSkillParam(2300 + source.getBattlePos(), useFun.getExDependentValue());
               return true;
            }
         } else if (BattleMisc.isCureFun(mainEffectEffect.getFunc())) {
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
            if (Objects.isNull(useFun)) {
               return false;
            }

            int rate = useFun.getUseValue();
            if (RandomUtil.randTenThousand() < rate) {
               action.getBlackboard().addSkillParam(2400 + source.getBattlePos(), useFun.getExDependentValue());
               return true;
            }
         }
      }

      return false;
   }

   public static boolean hurt2Cure(Action action, Entity source, EntitySkill entitySkill, SkillModel skillModel) {
      if (source.getBuffManager().isExistSubType((short)108)) {
         if (!EffectUtil.HURT_CURE_EXCHANGE_ACTION.contains(action.getType())) {
            return false;
         }

         if (action.getType() == 41) {
            KeepAtkAction keepAtkAction = (KeepAtkAction)action;
            Event event = keepAtkAction.getEvent();
            if (event != null && event.getParam(2) != source) {
               return false;
            }
         }

         SkillEffectModel mainEffectEffect = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)skillModel.getEffects().get(skillModel.getMainEffect()));
         EffectContent replaceContent = entitySkill.getReplaceId(skillModel.getMainEffect());
         if (replaceContent != null) {
            SkillEffectModel replaceSkillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", replaceContent.effectId);
            if (replaceSkillEffectModel.getIsPre() != -1 && replaceSkillEffectModel.getTriggerTime() == 0) {
               mainEffectEffect = replaceSkillEffectModel;
            }
         }

         if (Objects.isNull(mainEffectEffect)) {
            return false;
         }

         TreeSet<Integer> subCode = source.getBuffManager().getSubBuff((short)108);
         int code = (Integer)subCode.last();
         Buff buff = source.getBuffManager().getBuff(code);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
         if (BattleMisc.isHurtFun(mainEffectEffect.getFunc())) {
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (Objects.isNull(useFun)) {
               return false;
            }

            int rate = useFun.getUseValue();
            if (RandomUtil.randTenThousand() < rate) {
               action.getBlackboard().addSkillParam(2800 + source.getBattlePos(), useFun.getExDependentValue());
               return true;
            }
         }
      }

      return false;
   }
}
