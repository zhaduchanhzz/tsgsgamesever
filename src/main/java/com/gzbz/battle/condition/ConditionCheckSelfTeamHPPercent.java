package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 52
)
public class ConditionCheckSelfTeamHPPercent implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (source != null && source.getPkTeam() != null && source.getPkTeam().getEntityMap() != null) {
         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            if (entity.entityType == 0) {
               int percent = (int)((float)entity.getBaseProperty(99) * 1.0F / (float)entity.getBaseProperty(1) * 10000.0F);
               if (conditionModel.getConditionValue() == 1) {
                  if (percent >= Integer.parseInt(conditionModel.getConditionParam())) {
                     return true;
                  }
               } else if (percent < Integer.parseInt(conditionModel.getConditionParam())) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
