package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.passive.PassiveSkillEffect;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 4
)
public class CheckDamageEvent extends ListenerChecker {
   public static final int EVENT_CHECKER_CRIT_SELF_FORCE = 1;
   public static final int EVENT_CHECKER_CRIT_ENIMY_FORCE = 2;
   public static final int EVENT_CHECKER_CRIT_SELF_ENTITY = 3;
   public static final int EVENT_CHECKER_BE_CRIT_SELF_ENTITY = 4;
   public static final int EVENT_CHECKER_BE_SKILL = 5;
   public static final int EVENT_CHECKER_SELF_SKILL = 6;
   public static final int EVENT_CHECKER_ANY = 7;
   public static final int EVENT_CHECKER_BE_MAGIC_SKILL = 8;
   public static final int EVENT_CHECKER_ATTACK = 9;
   public static final int EVENT_CHECKER_BE_PHYSICAL_SKILL = 10;
   public static final int EVENT_CHECKER_ATTACK_ACTIVE = 11;

   public boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      long critValue = (Long)event.getParamDefault(4, 0L);
      switch (context.param) {
         case 0:
            return true;
         case 1:
            return source.getForce() == context.entity.getForce() && critValue > 0L;
         case 2:
            return target.getForce() != context.entity.getForce() && critValue > 0L;
         case 3:
            return source == context.entity && critValue > 0L;
         case 4:
            return target == context.entity && critValue > 0L;
         case 5:
            if (context.exParams != null && target == context.entity) {
               try {
                  PassiveSkillEffect pse = (PassiveSkillEffect)context.listener;
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", pse.effectId);
                  if (skillEffectModel.getConditions().size() == 0) {
                     return false;
                  }

                  ConditionModel conditionModel = (ConditionModel)skillEffectModel.getConditions().get(0);
                  if (source.getBuffManager().isExistSubType((short)conditionModel.getConditionValue())) {
                     return true;
                  }

                  return false;
               } catch (Exception e) {
                  e.printStackTrace();
                  return false;
               }
            }

            return target == context.entity;
         case 6:
            if (StringUtil.isEmpty(context.exParams)) {
               return context.entity == source;
            } else {
               EntitySkill entitySkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4);
               if (entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams)) {
                  Set<Byte> set = (Set)event.getAction().getBlackboard().getSkillParam(23);
                  if (Objects.nonNull(set) && set.contains(target.getBattlePos())) {
                     return false;
                  }

                  set = new HashSet();
                  set.add(target.getBattlePos());
                  event.getAction().getBlackboard().addSkillParam(23, set);
                  return true;
               }
            }
         case 7:
            return true;
         case 8:
            return target == context.entity && this.checkMagic(event);
         case 9:
            if (StringUtil.isEmpty(context.exParams)) {
               return source == context.entity;
            }

            EntitySkill entitySkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4);
            return source == context.entity && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams);
         case 10:
            return target == context.entity && this.checkPhysical(event);
         case 11:
            if (event.getTriggerLayer() > 0) {
               return false;
            } else {
               if (StringUtil.isEmpty(context.exParams)) {
                  return source == context.entity;
               }

               EntitySkill entitySkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4);
               return source == context.entity && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams);
            }
         default:
            return false;
      }
   }
}
