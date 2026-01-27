package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 10
)
public class ConditionCheckHPPercentMe implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int percent = (int)((float)source.getBaseProperty(99) * 1.0F / (float)source.getBaseProperty(1) * 10000.0F);
      if (conditionModel.getConditionValue() == 1) {
         return percent >= Integer.parseInt(conditionModel.getConditionParam());
      } else {
         return percent < Integer.parseInt(conditionModel.getConditionParam());
      }
   }
}
