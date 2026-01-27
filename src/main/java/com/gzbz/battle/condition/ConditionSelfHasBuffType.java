package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 74
)
public class ConditionSelfHasBuffType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
         if (source.getBuffManager().isExistSubType(Short.parseShort(param))) {
            return true;
         }
      }

      return false;
   }
}
