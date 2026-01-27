package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 51
)
public class ConditionCheckRoundCount implements ConditionFunc {
   public static final byte GREATER_EQUAL = 1;
   public static final byte LESS_EQUAL = 2;

   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      byte type = Byte.parseByte(conditionModel.getConditionParam());
      if (type == 1) {
         if (action.getScene().getRound() >= conditionModel.getConditionValue()) {
            return true;
         }
      } else if (type == 2 && action.getScene().getRound() <= conditionModel.getConditionValue()) {
         return true;
      }

      return false;
   }
}
