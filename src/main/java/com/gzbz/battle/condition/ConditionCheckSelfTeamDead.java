package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 11
)
public class ConditionCheckSelfTeamDead implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int num = 0;
      if (source != null && source.getPkTeam() != null && source.getPkTeam().getEntityMap() != null) {
         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            if ((entity.isDead() || entity.getStateManager().checkState((short)21)) && !entity.getStateManager().checkState((short)9)) {
               ++num;
            }
         }

         if (num == 0) {
            return conditionModel.getConditionValue() == 0;
         } else {
            return conditionModel.getConditionValue() != 0;
         }
      } else {
         return false;
      }
   }
}
