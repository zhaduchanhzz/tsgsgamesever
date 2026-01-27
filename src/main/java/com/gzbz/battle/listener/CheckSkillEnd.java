package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.passive.PassiveActionEffect;
import com.gzbz.model.SkillEffectModel;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@ListenerCheckAnno(
   type = 6
)
public class CheckSkillEnd extends ListenerChecker {
   public static final int EVENT_CHECKER_SKILL_TARGET_SELF = 1;
   public static final int EVENT_CHECKER_SKILL_USER_ME = 2;
   public static final int EVENT_CHECKER_SKILL_TARGET_SELF_2 = 3;
   public static final int EVENT_CHECKER_SKILL_USER_ENEMY = 4;
   public static final int EVENT_CHECKER_SKILL_USER_FRIEND = 5;
   public static final int EVENT_CHECKER_SKILL_USER_FRIEND_OR_SELF = 6;
   public static final int EVENT_CHECKER_SKILL_USER_PHYSICAL = 7;
   public static final int EVENT_CHECKER_SKILL_USER_MAGIC = 8;
   public static final int EVENT_CHECKER_SKILL_USER_PHYSICAL_CRIT = 9;
   public static final int EVENT_CHECKER_SKILL_USER_MAGIC_CRIT = 10;
   public static final int EVENT_PARAM_MISSED = 11;
   public static final int EVENT_RECOVER_REVIVE = 12;
   public static final int EVENT_CHECKER_SKILL_USER_FRIEND_OR_SELF_FILTER = 13;
   public static final int EVENT_CHECKER_SKILL_ACTION_USER_ME = 14;
   public static HashSet<Byte> FILTER_ACTION = new HashSet();

   public boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            return this.skillTargetIsMe(event, context);
         case 2:
            if (Objects.isNull(context.exParams)) {
               return source == context.entity;
            } else {
               EntitySkill entitySkill = (EntitySkill)event.getParam(5);
               if (!Objects.isNull(entitySkill) && source == context.entity) {
                  return source == context.entity && Integer.parseInt(context.exParams) == entitySkill.index;
               }

               return false;
            }
         case 3:
            return this.skillTargetIsMe2(event, context);
         case 4:
            if (Objects.nonNull(source)) {
               return source.getForce() != context.entity.getForce();
            }
         case 5:
            return source.getForce() == context.entity.getForce() && source != context.entity;
         case 6:
            return source.getForce() == context.entity.getForce();
         case 7:
            return source == context.entity && this.checkPhysical(event) && this.checkMainEffectsFilter(event, context);
         case 8:
            return source == context.entity && this.checkMagic(event) && this.checkMainEffectsFilter(event, context);
         case 9:
            if (source == context.entity && this.checkPhysical(event)) {
               return (Boolean)event.getAction().getBlackboard().getSkillParam(21, false);
            }

            return false;
         case 10:
            if (source == context.entity && this.checkPhysical(event)) {
               return (Boolean)event.getAction().getBlackboard().getSkillParam(21, false);
            }
         default:
            return false;
         case 11:
            return (Boolean)event.getParamDefault(20, false);
         case 12:
            if (event.getAction().getType() != 4) {
               return false;
            } else {
               Entity attacker = (Entity)event.getAction().getBlackboard().getSkillParam(1, (Object)null);
               if (attacker != null && attacker == context.entity) {
                  HashSet<SkillEffectModel> mainEffects = (HashSet)event.getAction().getBlackboard().getSkillParam(37);
                  if (mainEffects == null) {
                     return false;
                  }

                  boolean isRecover = false;

                  for(SkillEffectModel mainModel : mainEffects) {
                     if (mainModel.getFunc() == 6) {
                        event.addParam(11, Short.valueOf((short)6));
                        return true;
                     }

                     if (mainModel.getFunc() == 7) {
                        isRecover = true;
                     }
                  }

                  return isRecover;
               }

               return false;
            }
         case 13:
            return source.getForce() == context.entity.getForce() && !FILTER_ACTION.contains(event.getAction().getType());
         case 14:
            if (event.getAction().getType() != 4) {
               return false;
            } else if (Objects.isNull(context.exParams)) {
               return source == context.entity;
            } else {
               EntitySkill entitySkill = (EntitySkill)event.getParam(5);
               if (!Objects.isNull(entitySkill) && source == context.entity) {
                  return source == context.entity && Integer.parseInt(context.exParams) == entitySkill.index;
               } else {
                  return false;
               }
            }
      }
   }

   private boolean skillTargetIsMe2(Event event, ListenerContext context) {
      List<Entity> targets = (List)event.getParam(14);
      if (!Objects.isNull(targets) && targets.size() != 0) {
         Entity attacker = (Entity)event.getParam(2);
         if (Objects.isNull(attacker)) {
            return false;
         } else {
            return attacker.getForce() != context.entity.getForce() && targets.contains(context.entity);
         }
      } else {
         return false;
      }
   }

   private boolean skillTargetIsMe(Event event, ListenerContext context) {
      return ((EntitySkill)event.getParam(5)).index == 1 ? false : this.skillTargetIsMe2(event, context);
   }

   private boolean checkMainEffectsFilter(Event event, ListenerContext context) {
      if (!(context.listener instanceof PassiveActionEffect)) {
         return true;
      } else {
         HashSet<SkillEffectModel> mainEffects = (HashSet)event.getAction().getBlackboard().getSkillParam(37);
         if (mainEffects == null) {
            return false;
         } else {
            for(SkillEffectModel mainModel : mainEffects) {
               short func = mainModel.getFunc();
               if (func != 3 && func != 4 && func != 6 && func != 7) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   static {
      FILTER_ACTION.add((byte)41);
      FILTER_ACTION.add((byte)42);
      FILTER_ACTION.add((byte)43);
      FILTER_ACTION.add((byte)44);
      FILTER_ACTION.add((byte)46);
      FILTER_ACTION.add((byte)48);
      FILTER_ACTION.add((byte)50);
   }
}
