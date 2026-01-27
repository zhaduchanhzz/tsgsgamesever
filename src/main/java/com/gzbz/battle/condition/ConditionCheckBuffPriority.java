package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 30
)
public class ConditionCheckBuffPriority implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (Objects.isNull(source)) {
         return false;
      } else {
         return source.getBuffManager().checkPriority((byte)conditionModel.getConditionValue());
      }
   }
}
