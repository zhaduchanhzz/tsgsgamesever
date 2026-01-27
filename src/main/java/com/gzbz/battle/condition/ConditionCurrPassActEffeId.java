package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 77
)
public class ConditionCurrPassActEffeId implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Integer effectId = (Integer)action.getBlackboard().getSkillParam(55);
      if (Objects.nonNull(effectId)) {
         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            if (effectId == Integer.parseInt(param)) {
               return true;
            }
         }
      }

      return false;
   }
}
