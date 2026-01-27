package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 19
)
public class ConditionCheckDamage implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      long damageValue = (Long)action.getBlackboard().getSkillParam(500 + target.getBattlePos(), 0L);
      long percent = damageValue * 10000L / target.getBattleProperty(action, 1);
      return percent >= (long)conditionModel.getConditionValue();
   }
}
