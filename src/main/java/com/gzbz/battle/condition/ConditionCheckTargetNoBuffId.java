package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 72
)
public class ConditionCheckTargetNoBuffId implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (Objects.isNull(target)) {
         return false;
      } else {
         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            if (target.getBuffManager().isExistId(Integer.parseInt(param))) {
               return false;
            }
         }

         return true;
      }
   }
}
