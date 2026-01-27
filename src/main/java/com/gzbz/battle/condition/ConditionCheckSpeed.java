package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 76
)
public class ConditionCheckSpeed implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
      if (!Objects.isNull(entity) && !Objects.isNull(target)) {
         if (conditionModel.getConditionValue() == 1) {
            return entity.getSpeed() >= target.getSpeed();
         } else {
            return entity.getSpeed() < target.getSpeed();
         }
      } else {
         return false;
      }
   }
}
