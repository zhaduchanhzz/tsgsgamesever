package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import java.util.Objects;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 5
)
public class CheckDeathEvent extends ListenerChecker {
   public static final int EVENT_CHECKER_KILL_SELF = 1;
   public static final int EVENT_CHECKER_BE_KILL_SELF = 2;
   public static final int EVENT_CHECKER_SELF_DEAD = 3;
   public static final int EVENT_CHECKER_SELF_FORCE_DEAD = 4;
   public static final int EVENT_CHECKER_ENEMY_DEAD = 5;
   public static final int EVENT_CHECKER_ANY_DEAD = 6;
   public static final int EVENT_CHECKER_KILL_BY_PHYSICAL = 7;
   public static final int EVENT_CHECKER_KILL_BY_MAGIC = 8;
   public static final int EVENT_CHECKER_KILL_ANY = 9;
   public static final int EVENT_CHECKER_SELF_FORCE_DEAD_TRANS1 = 10;
   public static final int EVENT_CHECKER_ENEMY_DEAD_FIRST = 11;
   public static final int EVENT_CHECKER_SELF_FORCE_DEAD_FIRST = 12;
   public static final int EVENT_CHECKER_ANY_DEAD_FIRST = 13;
   public static final int EVENT_CHECKER_BUFF_SUBCLS_ENEMY_DEAD = 14;

   public boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            if (StringUtil.isEmpty(context.exParams)) {
               return source == context.entity;
            } else {
               int skillIndex = Integer.parseInt(context.exParams);
               EntitySkill entitySkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4, null);
               if (Objects.isNull(entitySkill)) {
                  return false;
               } else {
                  if (source == context.entity && entitySkill.entity == context.entity && entitySkill.index == skillIndex) {
                     return true;
                  }

                  return false;
               }
            }
         case 2:
         case 3:
            return target == context.entity;
         case 4:
            return target.getForce() == context.entity.getForce();
         case 5:
            return target.getForce() != context.entity.getForce();
         case 6:
            return true;
         case 7:
            return source == context.entity && this.checkPhysical(event);
         case 8:
            return source == context.entity && this.checkPhysical(event);
         case 9:
            return true;
         case 10:
            return target.getForce() == context.entity.getForce() && !target.getStateManager().checkState((short)21);
         case 11:
            return target.getForce() != context.entity.getForce() && target.getDeadTimes() == 0;
         case 12:
            return target.getForce() == context.entity.getForce() && target.getDeadTimes() == 0;
         case 13:
            return target.getDeadTimes() == 0;
         case 14:
            short subType = Short.parseShort(context.exParams);
            return target.getForce() != context.entity.getForce() && target.getBuffManager().isExistSubType(subType);
         default:
            return false;
      }
   }
}
