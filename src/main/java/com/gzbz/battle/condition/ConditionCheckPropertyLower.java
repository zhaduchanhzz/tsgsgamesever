package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 9
)
public class ConditionCheckPropertyLower implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      return source.getBattleProperty(action, conditionModel.getConditionValue()) > target.getBattleProperty(action, conditionModel.getConditionValue());
   }
}
