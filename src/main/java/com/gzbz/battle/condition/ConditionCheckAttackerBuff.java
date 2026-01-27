package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 75
)
public class ConditionCheckAttackerBuff implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
      if (Objects.isNull(entity)) {
         return false;
      } else {
         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            if (entity.getBuffManager().isExistId(Integer.parseInt(param))) {
               return true;
            }
         }

         return false;
      }
   }
}
