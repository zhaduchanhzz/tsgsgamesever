package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 49
)
public class ConditionCheckTargetTeamLiveCount implements ConditionFunc {
   public static final byte GREATER_EQUAL = 1;
   public static final byte LESS_EQUAL = 2;

   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int num = 0;
      if (target != null && target.getPkTeam() != null && target.getPkTeam().getEntityMap() != null) {
         for(Entity entity : target.getPkTeam().getEntityMap().values()) {
            if (entity.entityType == 0 && entity.isAlive()) {
               ++num;
            }
         }

         byte type = Byte.parseByte(conditionModel.getConditionParam());
         if (type == 1) {
            if (num >= conditionModel.getConditionValue()) {
               return true;
            }
         } else if (type == 2 && num <= conditionModel.getConditionValue()) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }
}
