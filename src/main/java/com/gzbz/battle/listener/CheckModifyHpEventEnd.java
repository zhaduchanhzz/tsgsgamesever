package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import java.util.Objects;

@ListenerCheckAnno(
   type = 37
)
public class CheckModifyHpEventEnd extends ListenerChecker {
   public static final int EVENT_CHECKER_SELF_TEAM_HP = 1;
   public static final int EVENT_CHECKER_SELF_TEAM_MODIFY_HP = 2;
   public static final int EVENT_CHECKER_SELF_MODIFY_HP = 3;
   public static final int EVENT_CHECKER_SELF_MODIFY_HP_RATE = 4;
   public static final int EVENT_CHECKER_FRIEND_MODIFY_HP_RATE = 5;

   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            if (target.getForce() == context.entity.getForce() && !Objects.isNull(context.exParams)) {
               long totalCurHp = 0L;
               long totalHpMax = 0L;

               for(Entity entity : target.getPkTeam().getEntityMap().values()) {
                  totalCurHp += entity.getBaseProperty(99);
                  totalHpMax += entity.getBaseProperty(1);
               }

               double curRate = (double)totalCurHp / (double)totalHpMax;
               return curRate * (double)10000.0F < (double)Integer.parseInt(context.exParams);
            } else {
               return false;
            }
         case 2:
            return target.getForce() == context.entity.getForce();
         case 3:
            return target == context.entity;
         case 4:
            if (context.entity == target && !Objects.isNull(context.exParams)) {
               Long lastHp = (Long)event.getParam(16);
               Long curHp = (Long)event.getParam(17);
               if (Objects.nonNull(lastHp) && Objects.nonNull(curHp)) {
                  double curHpRate = (double)curHp / (double)target.getBaseProperty(1);
                  if ((double)Integer.parseInt(context.exParams) > curHpRate * (double)10000.0F && !context.first) {
                     context.first = true;
                     return true;
                  }
               }

               return false;
            }

            return false;
         case 5:
            if (target.getForce() == context.entity.getForce() && target != context.entity) {
               Long tmpLastHp = (Long)event.getParam(16);
               Long tmpCurHp = (Long)event.getParam(17);
               if (Objects.nonNull(tmpLastHp) && Objects.nonNull(tmpCurHp)) {
                  double tmpHpRate = (double)tmpCurHp / (double)target.getBaseProperty(1);
                  if ((double)Integer.parseInt(context.exParams) > tmpHpRate * (double)10000.0F && !context.first) {
                     context.first = true;
                     return true;
                  }
               }
            }

            return false;
         default:
            return false;
      }
   }
}
