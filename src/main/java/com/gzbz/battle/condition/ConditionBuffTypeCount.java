package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 36
)
public class ConditionBuffTypeCount implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (Objects.isNull(source)) {
         return false;
      } else {
         int num = target.getBuffManager().getPriorityBuffsCodeNum(Byte.parseByte(conditionModel.getConditionParam()));
         return num >= conditionModel.getConditionValue();
      }
   }
}
