package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 31
)
public class ConditionCheckAntiSkill implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != source) {
         return false;
      } else {
         return action.getType() == 42;
      }
   }
}
