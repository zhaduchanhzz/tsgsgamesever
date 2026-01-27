package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 87
)
public class ConditionTeamTotalHPPercent implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (source != null && source.getPkTeam() != null && source.getPkTeam().getEntityMap() != null) {
         long totalCurHp = 0L;
         long totalHpMax = 0L;

         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            totalCurHp += (Long)action.getBlackboard().getSkillParam(3100 + entity.getBattlePos(), 0L);
            totalHpMax += entity.getBaseProperty(1);
         }

         double percent = (double)totalCurHp / (double)totalHpMax;
         if (conditionModel.getConditionValue() == 1) {
            if (percent * (double)10000.0F >= (double)Integer.parseInt(conditionModel.getConditionParam())) {
               return true;
            }
         } else if (percent * (double)10000.0F < (double)Integer.parseInt(conditionModel.getConditionParam())) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }
}
