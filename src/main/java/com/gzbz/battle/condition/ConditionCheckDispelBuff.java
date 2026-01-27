package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 56
)
public class ConditionCheckDispelBuff implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (Objects.isNull(target)) {
         return false;
      } else {
         boolean isHave = target.getBuffManager().isHaveDispel((byte)1);
         if (conditionModel.getConditionValue() == 0) {
            return !isHave;
         } else {
            return isHave;
         }
      }
   }
}
