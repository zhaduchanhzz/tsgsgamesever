package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 7
)
public class ConditionFirstAttack implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (conditionModel.getConditionValue() == 1) {
         return source.getSkillOrder() == 1;
      } else {
         return source.getSkillOrder() != 1;
      }
   }
}
