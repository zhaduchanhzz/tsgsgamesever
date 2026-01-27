package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 33
)
public class ConditionCheckRound implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      try {
         int param = Integer.parseInt(conditionModel.getConditionParam());
         if (conditionModel.getConditionValue() == 0) {
            return action.getScene().getRound() == param;
         } else {
            return action.getScene().getRound() != param;
         }
      } catch (Exception var7) {
         return false;
      }
   }
}
