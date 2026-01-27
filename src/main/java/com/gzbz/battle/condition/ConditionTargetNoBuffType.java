package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 85
)
public class ConditionTargetNoBuffType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
         if (target.getBuffManager().isExistSubType(Short.parseShort(param))) {
            return false;
         }
      }

      return true;
   }
}
