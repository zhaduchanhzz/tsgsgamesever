package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 40
)
public class ConditionSkillCrit implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity skillEntity = (Entity)action.getBlackboard().getSkillParam(1);
      if (source != skillEntity) {
         return false;
      } else {
         Boolean isCrit = (Boolean)action.getBlackboard().getSkillParam(21);
         return isCrit != null && isCrit;
      }
   }
}
